#include<bits/stdc++.h>
using namespace std;

#define si(a) scanf("%d",&a)
#define sii(a,b) scanf("%d %d",&a,&b);

#define mp make_pair
#define ff first
#define ss second

typedef pair<int,int> pii;

int n;
char s[200005];
pii dest;

pii getPos(pii p, int i){
    if(s[i]=='R')
        p.ff++;
    if(s[i]=='L')
        p.ff--;
    if(s[i]=='U')
        p.ss++;
    if(s[i]=='D')
        p.ss--;
    return p;
}

pii getRev(pii p, int i){
    if(s[i]=='R')
        p.ff--;
    if(s[i]=='L')
        p.ff++;
    if(s[i]=='U')
        p.ss--;
    if(s[i]=='D')
        p.ss++;
    return p;
}

int can(int r){
    pii cur= mp(0,0);
    for(int i=r; i<n; i++)
        cur= getPos(cur,i);
    if(abs(cur.ff-dest.ff)+abs(cur.ss-dest.ss)<=r)
        return 1;
    for(int i=0; i+r<n;i++){
        cur= getPos(cur,i);
        cur= getRev(cur,i+r);
        if(abs(cur.ff-dest.ff)+abs(cur.ss-dest.ss)<=r){
            //cout<<"success for r: "<<r<<" i:"<<i<<endl;
            return 1;
        }
    }
    return 0;
}
main(){
    int x,y;
    si(n);
    scanf("%s",s);
    sii(x,y);
    dest= mp(x,y);
    if(!can(n) || (abs(dest.ff)+abs(dest.ss))%2!=(n%2)){
        puts("-1");
        return 0;
    }
    int lo= 0, hi= n;
    while(lo<hi){
        int mid= (lo+hi)/2;
        if(can(mid))  hi= mid;
        else  lo= mid+1;
    }
    cout<<lo<<endl;
}