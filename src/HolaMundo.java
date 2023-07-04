import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class HolaMundo {
    private JPanel rootPanel;
    private JButton okButton;
    private JLabel resultado;
    private JTextField numero1;
    private JTextField numero2;

    public HolaMundo() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // System.out.println("holaaaa");


  try{
      resultado.setText(numero1.getText() + "" + numero2.getText());
      System.out.println("Ingrese un numero");
      Float a = Float.parseFloat(numero1.getText());
      Float b = Float.parseFloat(numero1.getText());

      resultado.setText(Float.toString(a+b));

  }catch(ArithmeticException a){

  }


            }

        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HolaMundo");
        frame.setContentPane(new HolaMundo().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
