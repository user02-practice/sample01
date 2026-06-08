public class Test2 {
    static void main() {
        int change = Integer.parseInt(IO.readln("おつり"));
        IO.println("お釣りは" + change +"です");

        /**int a = 500;
        int b = 100;
        int c = 50 ;
        int d = 10 ;
        int e = 5;
        int f = 1;**/

        /**int a, b, c, d, e, f ;

        a = 500;
        b = 100;
        c = 50;
        d = 10;
        e = 5;
        f = 1;**/

        int a = 500, b = 100, c =50, d =10, e =5, f =1;

        //IO.println(change % a % b % c % d % e % f );

        IO.println("500×" + change / a );
        IO.println("100×" + change % a / b);
        IO.println("50×" + change % a % b / c);
        IO.println("10×" + change % a % b % c / d);
        IO.println("5×" + change % a % b % c % d / e);
        IO.println("1×" + change % a % b % c % d % e / f);

        /**IO.println(change / a );
        IO.println(change / b );
        IO.println(change / c );
        IO.println(change / d );
        IO.println(change / e );
        IO.println(change / f );**/

    }
}
