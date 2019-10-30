#include <bits/stdc++.h>
using namespace std;
int main() {  
  cin.tie(0);
  int andrew, dmitry, michal;
  cin >> andrew >> dmitry >> michal;
  int green, purple, black;
  cin >> green >> purple >> black;
  bool x1 = green >= andrew;
  bool x2 = green - andrew + purple >= dmitry;
  bool x3 = green + purple - andrew - dmitry + black >= michal;
  if (x1 and x2 and x3) {
    cout << "YES" << endl;
  } else {
    cout << "NO" << endl;
  }
  return 0;
}