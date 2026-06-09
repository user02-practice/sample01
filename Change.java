public class Change {
    static void main() {
        // おつりの最適解を求める
        // おつりの金額を入力
        int change = Integer.parseInt(IO.readln("おつり:"));
        // おつりを500円で割った値(500円の枚数)
        IO.println("500円の枚数 " + (change / 500 + "枚"));
        // おつり　= おつり % 500
        change = change % 500;
        // おつりを100円で割った値(100円の枚数)
        IO.println("100円の枚数 " + (change / 100 + "枚"));
        // おつり　= おつり % 100
        change = change % 100;
        // おつりを50円で割った値(50円の枚数)
        IO.println("50円の枚数 " + (change / 50 + "枚"));
        // おつり　= おつり % 50
        change = change % 50;
        // おつりを10円で割った値(10円の枚数)
        IO.println("10円の枚数 " + (change / 10 + "枚"));
        // おつり　= おつり % 10
        change = change % 10;
        // おつりを5円で割った値(5円の枚数)
        IO.println("5円の枚数 " + (change / 5 + "枚"));
        // おつり　= おつり % 5
        change = change % 5;
        // おつりを1円で割った値(1円の枚数)
        IO.println("1円の枚数 " + (change / 1 + "枚"));
        // おつり　= おつり % 1
        change = change % 1;
    }
}
