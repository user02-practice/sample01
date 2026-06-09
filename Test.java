public class Test {
    static void main() {
        String s1 = "Java";
        String s2 = new String("Java");
        String s3 = "Java";
        String s4 = new String("Java").intern();
        String s5 = "java";
        IO.println(s1 == s3);   //true
        IO.println(s1 == s2);   //false
        IO.println(s1 == s4);   //true
        IO.println(s2 == s3);   //false
        IO.println(s2 == s4);   //false
        IO.println(s3 == s4);   //true
        IO.println(s1 == s5);   //false

    }
}
