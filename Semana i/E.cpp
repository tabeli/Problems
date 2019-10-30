#include<bits/stdc++.h>
#define endl '\n'
#define ll long long int
#define scn(num)              scanf("%lld ",&num);
using namespace std;
const ll INF = 2e18 + 99;
typedef pair<ll,ll> Pair;
typedef vector<ll> vec;
bool file=0,rt=1;
clock_t tStart ;
void FAST_IO();
////////////////////////

int main()
{

    FAST_IO();
    //
    ll n; scn(n);
    ll x, y; scn(x) ; scn(y) ;
    ll whiteMove =max(x-1,y-1);
    ll blackMove = max(n-x, n-y);
    if(whiteMove<=blackMove)
        puts("White");
    else
        puts("Black");
    //
    if(rt && file){
     printf("\nTime taken: %.6fs", (double)(clock() - tStart)/CLOCKS_PER_SEC);
    }
    return 0;
   }

void FAST_IO()
{   
    if(rt && file){ tStart = clock(); }
    if(file){
    #ifndef _offline
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    #endif
    }
}