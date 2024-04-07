import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class GridLayoutGUI{
    private JFrame frame;
    private JPanel panel;
    private JLabel registerUsernameLabel, registerPasswordLabel;
    private JTextField registerUsernameTxt, registerPasswordTxt;
    private JButton signUpButton;
    
    //constructor
    public GridLayoutGUI(){
        frame = new JFrame("Grid Layout GUI");
        frame.setSize(600,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //creating Jpanel with Grid Layout
        panel = new JPanel(new GridLayout(3,2));
        //3 rows and 2 columns
        registerUsernameLabel = new JLabel("Username");
        registerUsernameTxt = new JTextField(20);
        
        registerPasswordLabel = new JLabel("Password");
        registerPasswordTxt = new JTextField(15);
        
        signUpButton = new JButton("Sign Up");
        
        
       //actionlistener
        signUpButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "Registration Successfull.");
         }
        });
        
       panel.add(registerUsernameLabel);
       panel.add(registerUsernameTxt);
       
       panel.add(registerPasswordLabel);
       panel.add(registerPasswordTxt);
       
       panel.add(signUpButton);
       
       frame.getContentPane().add(panel,BorderLayout.CENTER);
       
        
       frame.setVisible(true);
    }
    
    //main method
    public static void main(String[]args){
        new GridLayoutGUI();
    }
}