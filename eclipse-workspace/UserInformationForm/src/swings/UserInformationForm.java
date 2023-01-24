/*
Create a Swing that is having a List View to select the city, Text box to enter 
the name, phone number. Radio button to choose the gender and check box to 
choose hobbies. Create an alert to display the selections made by the user
 */
package swings;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class UserInformationForm implements ActionListener {

    JTextField nameTextField, phoneTextField;
    JList<String> cityList;
    JRadioButton maleRadioBtn, femaleRadioBtn;
    JCheckBox chkBx1, chkBx2, chkBx3, chkBx4;
    ButtonGroup btnGroup;

    public UserInformationForm() {
        JFrame frame = new JFrame("User Data");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);

        JLabel header = new JLabel("Calculator");
        header.setFont(new Font("Arial Bold", Font.BOLD, 20));
        frame.add(header);
            
        nameTextField = new JTextField(20);
        frame.add(new JLabel("Name"));
        frame.add(nameTextField);

        phoneTextField = new JTextField(20);
        frame.add(new JLabel("Phone"));
        frame.add(phoneTextField);

        String city[] = {"Mangalore", "Bangalore", "Mysuru", "Madikeri", "Udupi", "Puttur", "Sullia"};
        cityList = new JList<>(city);
        cityList.setVisibleRowCount(4);
        JScrollPane jsp = new JScrollPane(cityList);
        frame.add(new JLabel("City"));
        frame.add(jsp);

        maleRadioBtn = new JRadioButton("Male");
        femaleRadioBtn = new JRadioButton("Female");
        frame.add(new JLabel("Gender"));
        frame.add(maleRadioBtn);
        frame.add(femaleRadioBtn);

        btnGroup = new ButtonGroup();
        btnGroup.add(maleRadioBtn);
        btnGroup.add(femaleRadioBtn);

        chkBx1 = new JCheckBox("Swimming");
        chkBx2 = new JCheckBox("Singing");
        chkBx3 = new JCheckBox("Dancing");
        chkBx4 = new JCheckBox("Programming");
        frame.add(new JLabel("Hobbies"));
        frame.add(chkBx1);
        frame.add(chkBx2);
        frame.add(chkBx3);
        frame.add(chkBx4);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        frame.add(submitButton);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String gender = maleRadioBtn.isSelected() ? "Male" : femaleRadioBtn.isSelected() ? "Female" : "";
        String hobbies = "[";
        hobbies += chkBx1.isSelected() ? "Swimming " : "";
        hobbies += chkBx2.isSelected() ? "Singing " : "";
        hobbies += chkBx3.isSelected() ? "Dancing " : "";
        hobbies += chkBx4.isSelected() ? "Programming " : "";
        hobbies += "]";

        String msg = "Name: " + nameTextField.getText() + "\n"
                + "Phone No.: " + phoneTextField.getText() + "\n"
                + "City: " + cityList.getSelectedValue() + "\n"
                + "Gender: " + gender + "\n"
                + "Hobbies: " + hobbies;
        JOptionPane.showMessageDialog(null, msg);
    }

    public static void main(String[] args) {
        new UserInformationForm();
    }
}

