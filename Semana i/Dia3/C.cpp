#include <bits/stdc++.h>
using namespace std;

#define eof                 	while (cin >> n)
const int MAX = 1000005;

int main (void){
    int n,i,k,ans,a,b,x,y;

    while (scanf("%d",&n) != EOF){
        ans = a = b = x = y = 0;

        for (i=0; i<n; i++){
            scanf("%d",&k);

            if (k == 1){
                if (x == 0){
                    a = 0;
                    x = 1;
                }

                ++a;
                x = 1;
                y = 0;
            }
            else{
                if (y == 0){
                    b = 0;
                    y = 1;
                }

                y = 1;
                x = 0;
                ++b;
            }

            ans = max (ans, min (a,b));
        }

        printf("%d\n",ans*2);
    }

    return 0;
}