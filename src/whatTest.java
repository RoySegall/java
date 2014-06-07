public class whatTest {
  public static int what(String str, char start, char end) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == start) {
        for (int j = i + 1; j < str.length(); j++) {
          if (str.charAt(j) == end) {
            count++;
          }
        }
      }
    }
    return count;
  }

  public static int what2(String str, char start, char end) {
    int startInstances = 0;
    int endInstances = 0;
    for (int i = 0; i < str.length(); i++) {
      startInstances = str.charAt(i) == start ? startInstances + 1 : startInstances;
      endInstances = str.charAt(i) == end ? endInstances + startInstances : endInstances;
    }
    return endInstances;
  }

  public static void main(String args[]) {
    String str = "abcd abcde abcdf ae ae";
    System.out.println(what(str, 'a', 'e'));
    System.out.println(what2(str, 'a', 'e'));
  }
}
