import java.util.Map;
import java.util.HashMap;

class TestClass {
  public static <T> T id(T x) {
    return x;
  }

  public static void main(String[] args) {

    Map<String, String> testMap = new HashMap<>();
    testMap.put("Hello", "World");
    

    System.out.println(id("Hello World"));
    System.out.println(id(1));
    System.out.println(id(1.2));
    System.out.println(testMap);
    
  }
};
