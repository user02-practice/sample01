import java.time.LocalDate;
public class Test2 {
            static void main() {
                int change = Integer.parseInt(IO.readln("おつり:"));

                int a = 500, b = 100, c =50, d =10, e =5, f =1;

                IO.println("お釣りは" + change +"円です");
                IO.println("500円 × " + change / a +"枚");
                IO.println("100円 × " + change % a / b +"枚");
                IO.println("50円 × " + change % a % b / c +"枚");
                IO.println("10円 × " + change % a % b % c / d +"枚");
                IO.println("5円 × " + change % a % b % c % d / e +"枚");
                IO.println("1円 × " + change % a % b % c % d % e / f +"枚");

               }
        }


