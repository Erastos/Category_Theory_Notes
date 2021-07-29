#include <iostream>

template <class T> T id(T x) {
  return x;
}

int main() {
  std::cout << id(7) << '\n';
  std::cout << id("Hello") << '\n';
  std::cout << id("World") << '\n';
  std::cout << id(7.5) << '\n';
}
