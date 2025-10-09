
package online.banking.system;

import javax.swing.*;
import java.awt.*;


import java.awt.event.*;
import javax.swing.JComboBox;
public class Signuptwo extends JFrame implements ActionListener {
    
    JTextField panTextField, aadharTextField;
    JButton next;
    JRadioButton syes, sno, eyes, eno; 
    JComboBox religionComboBox, categoryComboBox, occupationComboBox, incomeComboBox, educationComboBox;
    String formno;
    
    Signuptwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        
        JLabel additionalDetails = new JLabel("ADDITIONAL DETAILS " );
        additionalDetails.setFont( new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add (additionalDetails);
        
        JLabel religion = new JLabel("Religion: " );
        religion.setFont( new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100, 140, 100, 30);
        add (religion);
        
        String valreligion[] = {"Hindu", "Muslim", "Christian", "Sikh", "Other"};
        religionComboBox = new JComboBox(valreligion);
        religionComboBox.setBounds(300, 140, 400, 30);
        religionComboBox.setBackground(Color.WHITE);
        add(religionComboBox);
        
        
        
        
        JLabel category = new JLabel("Category: " );
        category.setFont( new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 190, 200, 30);
        add (category);
        
        String valcategory[] = {"General", "OBC", "SC", "ST", "Other"};
        categoryComboBox = new JComboBox(valcategory);
        categoryComboBox.setBounds(300, 190, 400, 30);
        categoryComboBox.setBackground(Color.WHITE);
        add(categoryComboBox);
        
        JLabel income = new JLabel(" Income: " );
        income.setFont( new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240, 200, 30);
        add (income);
        
        String incomeCategory[] = {"Null", "below 5,00,000", "below 8,00,000", "below 12,00,000", "12lakhs and above"};
        incomeComboBox = new JComboBox(incomeCategory);
        incomeComboBox.setBounds(300, 240, 400, 30);
        incomeComboBox.setBackground(Color.WHITE);
        add(incomeComboBox);
        
        JLabel education = new JLabel("Educational " );
        education.setFont( new Font("Raleway", Font.BOLD, 20));
        education.setBounds(100, 290, 200, 30);
        add (education);
        
        
        
        JLabel qualifications = new JLabel("Qualifications: " );
        qualifications.setFont( new Font("Raleway", Font.BOLD, 20));
        qualifications.setBounds(100, 315, 200, 30);
        add (qualifications);
        
        String educationValues[] = {"Under Graduate", "Graduate", "Post Graduate", "Doctrate", "Others"};
        educationComboBox = new JComboBox(educationValues);
        educationComboBox.setBounds(300, 315, 400, 30);
        educationComboBox.setBackground(Color.WHITE);
        add(educationComboBox);
        
        
        
        JLabel occupation = new JLabel("Occupation: " );
        occupation.setFont( new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 390, 200, 30);
        add (occupation);
        
        String occupationValues[] = {"Employed", "Self employed", "Bussiness", "Student", "Un Employed"};
        occupationComboBox = new JComboBox(occupationValues);
        occupationComboBox.setBounds(300, 390, 400, 30);
        occupationComboBox.setBackground(Color.WHITE);
        add(occupationComboBox);
        
        
        JLabel pan = new JLabel("PAN Number: " );
        pan.setFont( new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100, 440, 200, 30);
        add (pan);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);
        
        JLabel aadhar = new JLabel("Aadhar Number: " );
        aadhar.setFont( new Font("Raleway", Font.BOLD, 20));
        aadhar.setBounds(100, 490, 200, 30);
        add (aadhar);
        
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300, 490, 400, 30);
        add(aadharTextField);
        
        JLabel scitizen = new JLabel("Senior citizen: " );
        scitizen.setFont( new Font("Raleway", Font.BOLD, 20));
        scitizen.setBounds(100, 540, 200, 30);
        add (scitizen);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
        
        
        JLabel eaccount = new JLabel("Existing Account: " );
        eaccount.setFont( new Font("Raleway", Font.BOLD, 20));
        eaccount.setBounds(100, 590, 200, 30);
        add (eaccount);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
        
        
        
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(590, 590, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.decode("#dad8cc"));
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
       
       String sreligion = (String) religionComboBox.getSelectedItem();
        String scategory = (String) categoryComboBox.getSelectedItem();
        String sincome = (String) incomeComboBox.getSelectedItem();
        String seducation = (String) educationComboBox.getSelectedItem();
        String soccupation = (String) occupationComboBox.getSelectedItem();
        String seniorcitizen = null;
        if (syes.isSelected()) {
            seniorcitizen = "Yes";
        } else if (sno.isSelected()) {
            seniorcitizen = "No";
        }
        
        String existingaccount = null;
        if(eyes.isSelected()) {
           existingaccount  = "Yes";
       } else if(eno.isSelected()){
            existingaccount = "Unmarried";
        
        }
        
        String span = panTextField.getText();
        String saadhar = aadharTextField.getText();
       
        try {
              Conn c = new Conn();
              String query = "insert into signup values('"+formno+"', '"+sreligion+"', '"+scategory+"',  '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingaccount+"')";  
              c.s.executeUpdate(query);
              
              
         } catch (Exception e) {
           System.out.println(e);
       }
       
            }    
                
    
    
    public static void main(String args[]){
        new Signuptwo("");
    }
}

    

