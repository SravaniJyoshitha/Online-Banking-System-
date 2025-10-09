
package online.banking.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Withdrawl extends JFrame implements ActionListener  {
    
    JTextField amount;
    JButton withdraw,back;
    String pinnumber;
    Withdrawl(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 700, 700);
        add(image);
        
        
        JLabel text = new JLabel("Enter the amount you want to withdraw :");
        text.setBounds(130, 190, 600, 35);
        text.setForeground(Color.white);
        text.setFont(new Font("System", Font.BOLD, 14));
        image.add(text);
        
        amount = new JTextField();
        amount.setBounds(150, 250, 230, 30);
        amount.setFont(new Font("Raleway", Font.BOLD, 21));
        image.add(amount);
        
        withdraw = new JButton("Withdraw");
        withdraw.setBounds(250, 345, 130, 30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
        back = new JButton("Back");
        back.setBounds(250, 385, 130, 30);
        back.addActionListener(this);
        image.add(back);
        
        
        setSize(700, 700);
       setLocation(300, 0);
       setUndecorated(true);
       setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
      if(ae.getSource()== withdraw){
         String number = amount.getText(); 
         Date date =new Date();
         if(number.equals("")){
             JOptionPane.showMessageDialog(null,"Please enter the amount you want to withdraw");
           
          } else {
             try {
             Conn conn = new Conn();
             String query = "insert into bank values('"+pinnumber+"','"+date+"', 'Withdrawl','"+number+"')";
             conn.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null, "Rs"+number+" withdrawn Successfully");
             setVisible(false);
             new Transactions(pinnumber).setVisible(true);
             } catch(Exception e){
             System.out.println(e);
         }
         }
      } else if (ae.getSource()== back){
          new Transactions(pinnumber).setVisible(true);
      
      }
    }
    public static void main(String[] args){
        
        new Withdrawl("");
        
    }
}

