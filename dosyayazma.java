package mainn;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author semih
 */
public class dosyayazma implements ActionListener{
    JFrame window=new JFrame("sign up form");
    JTextField userNameTextField=new JTextField();
    JPasswordField passwordTextField=new JPasswordField();
    JLabel userNameLabel=new JLabel("Ad");
     JLabel passwordLabel=new JLabel("sifre");
    JButton signUpButton=new JButton("kayıt ol");
    JLabel blank=new JLabel();
    FileWriter fileWriter;
    dosyayazma(){
        GridLayout g1=new GridLayout();
        g1.setColumns(2);
        g1.setRows(3);
        
        window.setLayout(g1);
        signUpButton.addActionListener(this);
     window.add(userNameLabel);
        window.add(userNameTextField); 
         window.add(passwordLabel);
         window.add(passwordTextField);
         window.add(signUpButton);
         window.add(blank);
         window.setSize(300,200);
         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         window.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand()==signUpButton.getActionCommand()){
            
            try{
                fileWriter=new FileWriter("C:/l/deneme.txt");
                fileWriter.write(userNameLabel.getText()+":"+userNameTextField.getText()+"\n");
                  fileWriter.write(passwordLabel.getText()+":"+passwordTextField.getText());
                  fileWriter.close();
                  JOptionPane.showMessageDialog(null,"dosyaya yazildi");
            } catch(Exception e){JOptionPane.showMessageDialog(null,e+"");}
            
        }
    }
    
    
    
    
    
    
}
