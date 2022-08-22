#include <iostream>
#include <stack>
using namespace std;

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);
  cout.tie(0);
  
  int cnt = 0;

  // freopen("input.txt", "rt", stdin);
  char buff[31];
  stack<char> s;
  cin >> buff;

  for (int i = 0; i < buff[i] != '\0'; i++) {
    if (buff[i] == '(') s.push('(');
    else {
      if (s.empty()) {
        cout << "NO\n";
        return 0;
      } else {
        s.pop();
      }
    }
  }

  if (s.empty()) cout << "YES\n";
  else  cout << "NO\n";
  return 0;
}