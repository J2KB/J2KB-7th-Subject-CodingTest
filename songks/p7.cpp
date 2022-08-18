#include <iostream>

using namespace std;

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);
  cout.tie(0);
  
  freopen("input.txt", "rt", stdin);

  char buff[101], result[101];
  int index = 0;
  gets(buff);

  for (int i = 0; i < buff[i] != '\0'; i++) {
    if (buff[i] != ' ') {
      if (buff[i] >= 'A' && buff[i] <= 'Z') {
        result[index++] = buff[i] + ('a' - 'A'); // + 32
      }
      else result[index++] = buff[i];
    }
  }
  result[index] = '\0';

  cout << result << endl;
  
  return 0;
}