#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);
  long long n, m, k;
  cin >> n >> m >> k;
  vector<long long> b(n);
  for (int i = 0; i < n; i++) {
    cin >> b[i];
  }
  long long check = n;
  priority_queue<int> pQueue;
  for (int i = 1; i < n; i++) {
    int diff = b[i] - b[i - 1] + 1;
    pQueue.push(-diff);
  }
  int used = n;
  while (used > k) {
    int diff = -pQueue.top(); pQueue.pop();
    check = check - 2 + diff;
    used--;
  }
  cout << check << endl;
  return 0;
}