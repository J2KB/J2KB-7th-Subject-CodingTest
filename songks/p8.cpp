#include <iostream>
using namespace std;

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);
  cout.tie(0);
  
  int cnt = 0;

  // freopen("input.txt", "rt", stdin);
  char buff[31];
  cin >> buff;

  for (int i = 0; i < buff[i] != '\0'; i++) {
    if (buff[i] == '(') cnt++;
    else cnt--;

    if (cnt < 0) break;
  }

  if (cnt != 0) cout << "NO\n";
  else cout << "YES\n";
  return 0;
}