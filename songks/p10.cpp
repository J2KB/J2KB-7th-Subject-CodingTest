#include <iostream>
#include <limits>
using namespace std;

int digit_sum(int x) {
  int sum = 0;

  while(x > 0) {
    sum += (x % 10);
    x /= 10;
  }
  return sum;
} 

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);
  cout.tie(0);
  
  int n, max = numeric_limits<int>::min(), sum, res;
  cin >> n;
  int x;
  for (int i = 0; i < n; i++) {
    cin >> x;
    sum = digit_sum(x);
    if (sum > max) {
      max = sum;
      res = x;
    } else if (sum == max) {
      if (res < x) res = x; 
    }
  }

  cout << res << '\n';
  
  return 0;
}