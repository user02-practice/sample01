import javax.swing.*;

public class SwingTest {
    static void main() {
        var f =new JFrame("test");
        f .setVisible(true);
        f .setSize(600,400);
        f .setLocation(200,200);
        var t = new JTextField();
        f .add("North" ,t);
        var t2 = new JTextField("second");
        f .add("South" , t2);
        var b =new JButton("Upper");
        f .add("Center", b);
        f .validate();
        b.addActionListener(as -> t.setText(t2.getText().toUpperCase()));
    }
}
