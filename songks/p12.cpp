#include <iostream>
#include <limits>

using namespace std;

int ch[10];
int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);
  cout.tie(0);
  
  int digit, max = numeric_limits<int>::min(), res;

  char buff[101];

  cin >> buff;

  for (int i = 0; buff[i] != '\0'; i++) {
    digit = buff[i] - '0';
    ch[digit]++;
  }

  for (int i = 0; i < 10; i++) {
    if (ch[i] >= max) {
      max = ch[i];
      res = i;
    }
  }

  cout << res << '\n';
  return 0;
}