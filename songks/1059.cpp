#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;


int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);
  cout.tie(0);
  
  int l, s, n, left, right;
  bool flag = true;
  vector<int> v;

  cin >> l;

  for (int i = 0; i < l; i++) {
    cin >> s;
    v.push_back(s);
  }

  sort(v.begin(), v.end());
  cin >> n;

  for (int i = 0; i < v.size(); i++) {
    if (n == v[i]) flag = false;
    else if (v[i] >= n) {
      left = v[i-1] + 1;
      right = v[i] - 1;
      break;
    }
  }

  
  if (flag) cout << (n - left) * (right - n + 1) + (right - n);
  else cout << 0;
  
  return 0;
}