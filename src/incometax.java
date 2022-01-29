import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class incometax {
    private JPanel it_cal;
    private  JTextField ittxt;
    private JTextField itrtxt;
    private JButton cal;

    public incometax() {
        cal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int income = Integer.parseInt(ittxt.getText());
                float tax=0;

                if(income<2.5f){
                    tax=tax + 0;
                }
                else if(income>=2.5f && income<=5f){
                    tax=  tax + 0.05f*(income-2.5f);
                }
                else if(income>=5f && income<=10f){
                    tax=tax + 0.05f*(5-2.5f);
                    tax=tax + 0.2f*(income-5f);
                }
                else if(income>=10.0f){
                    tax=tax + 0.05f*(5f-2.5f);
                    tax=tax + 0.2f*(10.0f-5.0f);
                    tax=tax+  0.3f*(income-10.0f);

                    itrtxt.setText(String.valueOf(tax));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("incometax");
        frame.setContentPane(new incometax().it_cal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


        cal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });