package Projects.PasswordGenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Render the GUI components (Frontend)
// This class will inherit from the JFrame Class
public class PasswordGeneratorGUI extends JFrame {

    private final PasswordGenerator passwordGenerator;

    public PasswordGeneratorGUI() {
         // Render frame and add title
         super("Password Generator");

         // set the size of the GUI
        setSize(540, 570);

        // Prevent the GUI from being able to be resized
        setResizable(false);

        // Setting the layout to be null to have control over the position and size of our components
        setLayout(null);

        // terminate the program when the GUI is closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // center the GUI
        setLocationRelativeTo(null);

        // init password generator
        passwordGenerator = new PasswordGenerator();

        // Render GUI components
        addGUIComponents();
    }

    private void addGUIComponents() {
        // Create title text
        JLabel titleLabel = new JLabel("Password Generator");

        // increase the font size & make it bold
        titleLabel.setFont(new Font("Dialog", Font.BOLD, 32 ));

        // center the text in the screen
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // setting x/y coordinates and width/height values
        titleLabel.setBounds(0, 10, 540, 39);

        // add to GUI
        add(titleLabel);

        // create result text area
        JTextArea passwordOutput = new JTextArea();

        // prevent editing the text area
        passwordOutput.setEditable(false);
        passwordOutput.setFont(new Font("Dialog", Font.BOLD, 32));

        // add scroll-ability in case output becomes too big
        JScrollPane passwordOutputPane = new JScrollPane(passwordOutput);
        passwordOutputPane.setBounds(25, 97, 479, 70);

        // create a black border around the text area
        passwordOutputPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(passwordOutputPane);

        // create password length label
        JLabel passwordLengthLabel = new JLabel("Password Length: ");
        passwordLengthLabel.setFont(new Font("Dialog", Font.PLAIN, 30));
        passwordLengthLabel.setBounds(25, 215, 272, 39);
        add(passwordLengthLabel);

        // create password length input
        JTextArea passwordLengthInputArea = new JTextArea();
        passwordLengthInputArea.setFont(new Font("Dialog", Font.PLAIN, 32));
        passwordLengthInputArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        passwordLengthInputArea.setBounds(310, 215, 192, 39);
        add(passwordLengthInputArea);

        //// create toggle buttons

        // uppercase letter toggle
        JToggleButton uppercaseToggle = new JToggleButton("Uppercase");
        uppercaseToggle.setFont(new Font("Dialog", Font.PLAIN, 26));
        uppercaseToggle.setBounds(25, 302, 225, 56);
        add(uppercaseToggle);

        // lowercase letter toggle
        JToggleButton lowercaseToggle = new JToggleButton("Lowercase");
        lowercaseToggle.setFont(new Font("Dialog", Font.PLAIN, 26));
        lowercaseToggle.setBounds(282, 302, 225, 56);
        add(lowercaseToggle);

        // numbers toggle
        JToggleButton numbersToggle = new JToggleButton("Numbers");
        numbersToggle.setFont(new Font("Dialog", Font.PLAIN, 26));
        numbersToggle.setBounds(25, 373, 225, 56);
        add(numbersToggle);

        // symbols toggle
        JToggleButton symbolsToggle = new JToggleButton("Symbols");
        symbolsToggle.setFont(new Font("Dialog", Font.PLAIN, 26));
        symbolsToggle.setBounds(282, 373, 225, 56);
        add(symbolsToggle);

        // create generate button
        JButton generateButton = new JButton("Generate");
        generateButton.setFont(new Font("Dialog", Font.PLAIN, 32));
        generateButton.setBounds(155, 477, 222, 41);
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // validation: generate a password only when length > 0 and one of the toggled buttons is pressed
                if(passwordLengthInputArea.getText().length() <= 0) return;
                boolean anyToggleSelected = lowercaseToggle.isSelected() ||
                        uppercaseToggle.isSelected() ||
                        numbersToggle.isSelected() ||
                        symbolsToggle.isSelected();

                // generate password
                // converts the text to an integer value
                int passwordLength = Integer.parseInt(passwordLengthInputArea.getText());
                if(anyToggleSelected){
                    String generatedPassword = passwordGenerator.generatePassword(passwordLength,
                            uppercaseToggle.isSelected(),
                            lowercaseToggle.isSelected(),
                            numbersToggle.isSelected(),
                            symbolsToggle.isSelected());

                    // display password back to the user
                    passwordOutput.setText(generatedPassword);
                }
            }
        });
        add(generateButton);
    }
}
