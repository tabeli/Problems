#include<bits/stdc++.h>
using namespace std;
/// Typedef
typedef int ll;
#define sc1(a) scanf("%d",&a)
#define sc2(a,b) scanf("%d %d",&a,&b)
#define pf1(a) printf("%d\n",a)
#define pf2(a,b) printf("%d %d\n",a,b)

int main(){
    ll tc, t = 0;
    // freopen("/opt/Coding/clion code/input.txt", "r", stdin);
    //freopen("/opt/Coding/clion code/output.txt", "w", stdout);
    sc1(tc);
    while (tc--){
        ll num;
        sc1(num);
        string arr;
        cin >> arr;
        if(num == 2 && arr[0] >= arr[1]){
            cout << "NO" << endl;
        }
        else{
            cout << "YES" << endl;
            cout << "2" << endl;
            string res = "";
            for(ll i = 1; i < num; i++) res += arr[i];
            cout << arr[0] << " " << res << endl;
        }
    }

}