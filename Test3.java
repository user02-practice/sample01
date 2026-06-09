import java.util.Arrays;

public class Test3 {
    static void main() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b;
        b = a;  //aにもbにも同じ参照が入っている
        //a.clone()でコピぺできる
        IO.println(b[2]);
        IO.println(Arrays.toString(b));
        b[2] = 9;
        IO.println(b[2]);
        IO.println(a[2]);
        IO.println(a);
        IO.println(b);
        //b = null;
        IO.println(b);
        IO.println(a.length);
        IO.println(b.length);
        IO.println(Arrays.toString(b));


    }
}
