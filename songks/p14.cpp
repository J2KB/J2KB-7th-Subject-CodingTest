#include <iostream>

using namespace std;

int reverse(int x) {
  int res = 0, tmp;
  while(x > 0) {
    tmp = x % 10;
    res = res * 10 + tmp;
    x = x /10;
  }
  return res;
}

bool isPrime(int x) {
  bool flag = true;
  if (x == 1) return false;
  for (int i = 2; i < x; i++) {
    if (x % i == 0) {
      flag = false;
      break;
    }
  }
  return flag;
}

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);
  cout.tie(0);

  int n, num, tmp;
  // freopen("input.txt", "rt", stdin);
  cin >> n;
  for(int i = 1; i <= n; i++) {
    cin >> num;
    tmp = reverse(num);
    if(isPrime(tmp)) cout << tmp << " ";
  }
  
  
  return 0;
}