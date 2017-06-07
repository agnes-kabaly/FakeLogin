import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by kabaly on 6/6/17.
 */
public class LoginForm {

    public static void createAndShowGui() {
        JFrame frame = new JFrame("Fake login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        JPanel jPanel = new JPanel();

        JLabel jLabel = new JLabel("Login");
        jLabel.setHorizontalAlignment(JLabel.RIGHT);
        jPanel.add(jLabel);

        JPanel jPanel1 = new JPanel();

        BoxLayout boxLayout = new BoxLayout(jPanel1, BoxLayout.Y_AXIS);
        jPanel1.setLayout(boxLayout);

        JTextField jTextField = new JTextField("First name");
        jTextField.setPreferredSize(new Dimension(120, 30));
        jPanel1.add(jTextField);

        JTextField jTextFieldTwo = new JTextField("Last name");
        jTextFieldTwo.setPreferredSize(new Dimension(120, 30));
        jPanel1.add(jTextFieldTwo);

        JPanel jPanelTwo = new JPanel();
        //jPanelTwo.setMinimumSize(new Dimension(200, 200));

        JButton jButton = new JButton("BUTTON");
        jPanelTwo.add(jButton);

        JButton jButtonTwo = new JButton("BUTTON");
        jPanelTwo.add(jButtonTwo);

        FlowLayout flowLayout = new FlowLayout();
        flowLayout.setHgap(10);
        flowLayout.setVgap(10);
        jPanelTwo.setLayout(flowLayout);

        BoxLayout boxLayoutMain = new BoxLayout(mainPanel, BoxLayout.Y_AXIS);
        mainPanel.setLayout(boxLayoutMain);

        mainPanel.add(jPanel);
        mainPanel.add(jPanel1);
        mainPanel.add(jPanelTwo);
        frame.getContentPane().add(mainPanel);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGui();
            }
        });
    }
}
