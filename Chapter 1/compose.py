def a(i):
    return i

def b(i):
   return i+1

def compose(a, b):
    return lambda x : b(a(x))


if __name__ == "__main__":
    print(compose(a, b)(1))
