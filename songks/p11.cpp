#include <iostream>
using namespace std;

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);
  cout.tie(0);
  
  int n, cnt = 0, tmp;

  cin >> n;

  for (int i = 1; i <= n; i++) {
    tmp = i;
    while(tmp > 0) {
      tmp /= 10;
      cnt++;
    }
  }
  cout << cnt;
  return 0;
}