#include <iostream>
using namespace std;

int cnt[50001];

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);
  cout.tie(0);
  
  int n;
  cin >> n;

  for (int i = 1; i <= n; i++) {
    for (int j = i; j <= n; j = j+i) {
      cnt[j]++;
    }
  }

  for (int i = 1; i <= n; i++) {
    cout << cnt[i] << " ";
  }
  return 0;
}