import java.lang.*;

class hello {
  public static void main(String[] args) {
    String str1 = "hello";
    String str2 = "world";

    String merged = merge(str1, str2);
    System.out.println("Merged string: " + merged);
  }

  public static String merge(String str1, String str2) {
    StringBuilder merged = new StringBuilder();
    int maxLength = Math.max(str1.length(), str2.length());

    for (int i = 0; i < maxLength; i++) {
      if (i < str1.length()) {
        merged.append(str1.charAt(i));
      }
      if (i < str2.length()) {
        merged.append(str2.charAt(i));
      }
    }

    return merge();
  }
}
