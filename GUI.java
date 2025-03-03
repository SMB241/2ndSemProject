package PT;

import javax.swing.*;
import java.awt.event.*;

public class GUI implements ActionListener {
    private JFrame frame = new JFrame("Security Agency System");
    private JTextField IDTextField = new JTextField();
    private JTextField nameTextField = new JTextField();
    private JTextField areaTextField = new JTextField();
    private JTextField searchAreaTextField = new JTextField();
    private JTextArea outputTextArea = new JTextArea();
    private JButton addButton = new JButton("Add Personnel");
    private JButton listButton = new JButton("List Personnel");
    private JButton searchButton = new JButton("Search by Area");
    private JButton removeButton = new JButton("Remove Guard");
    private SecurityAgency agency = new SecurityAgency();

    public GUI() {
        frame.setSize(550, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel IDLabel = new JLabel("ID #:");
        IDLabel.setBounds(30, 20, 100, 30);
        frame.add(IDLabel);

        IDTextField.setBounds(140, 20, 200, 30);
        frame.add(IDTextField);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 60, 100, 30);
        frame.add(nameLabel);

        nameTextField.setBounds(140, 60, 200, 30);
        frame.add(nameTextField);

        JLabel areaLabel = new JLabel("Area:");
        areaLabel.setBounds(30, 100, 100, 30);
        frame.add(areaLabel);

        areaTextField.setBounds(140, 100, 200, 30);
        frame.add(areaTextField);

        addButton.setBounds(350, 100, 150, 30);
        addButton.addActionListener(this);
        frame.add(addButton);

        JLabel searchAreaLabel = new JLabel("Search By Area:");
        searchAreaLabel.setBounds(30, 150, 100, 30);
        frame.add(searchAreaLabel);

        searchAreaTextField.setBounds(140, 150, 200, 30);
        frame.add(searchAreaTextField);

        searchButton.setBounds(350, 150, 150, 30);
        searchButton.addActionListener(this);
        frame.add(searchButton);

        listButton.setBounds(30, 200, 150, 30);
        listButton.addActionListener(this);
        frame.add(listButton);

        removeButton.setBounds(350, 200, 150, 30);
        removeButton.addActionListener(this);
        frame.add(removeButton);

        JScrollPane scrollPane = new JScrollPane(outputTextArea);
        scrollPane.setBounds(30, 250, 470, 200);
        outputTextArea.setEditable(false);
        frame.add(scrollPane);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String choice = e.getActionCommand();
        if (choice.equals("Add Personnel")) {
            String name = nameTextField.getText();
            String area = areaTextField.getText();
            try {
                int ID = Integer.parseInt(IDTextField.getText());
                if (!name.isEmpty() && !area.isEmpty()) {
                    if (agency.isDuplicateID(ID)) {
                        outputTextArea.setText("Duplicate ID. Please enter a unique ID.");
                    } else {
                        agency.addPersonel(ID, name, area);
                        outputTextArea.setText("Personnel added successfully.");
                        nameTextField.setText("");
                        areaTextField.setText("");
                        IDTextField.setText("");
                    }
                } else {
                    outputTextArea.setText("Please fill in all fields.");
                }                
            } catch (NumberFormatException ex) {
                outputTextArea.setText("Invalid ID. Please enter a number.");
            }
        } else if (choice.equals("List Personnel")) {
            outputTextArea.setText(agency.listPersonel());
        } else if (choice.equals("Search by Area")) {
            String searchArea = searchAreaTextField.getText();
            outputTextArea.setText(agency.checkPersonnelByArea(searchArea));
        } else if (choice.equals("Remove Guard")) {
            JTextField removeIDField = new JTextField();
            Object[] message = {
                "Enter ID to Remove:", removeIDField
            };
            int option = JOptionPane.showConfirmDialog(frame, message, "Remove Guard", JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {
                try {
                    int removeID = Integer.parseInt(removeIDField.getText());
                    outputTextArea.setText(agency.removePersonnel(removeID));
                } catch (NumberFormatException invalidID) {
                    outputTextArea.setText("Invalid ID. Please enter a number.");
                }
            }
        }
    }

    public static void main(String[] args) {
        new GUI();
    }
}