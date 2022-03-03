import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_login extends JFrame {
    private JPanel panelMain;
    private JTextField txtName;
    private JButton submit;

    public GUI_login() {
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(submit, txtName.getText());
            }
        });
    }

    public static void main(String[] args) {
        GUI_login home = new GUI_login();
        home.setContentPane(home.panelMain);
        home.setTitle("hi");
        home.setBounds(600, 200, 200, 200);
        //home.setSize(300, 400);
        home.setVisible(true);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
