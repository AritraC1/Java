package Projects.MorseCodeTranslator;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // invoke later insures that the GUI is created and updated in a thread-safe manner
        SwingUtilities.invokeLater(() -> new MorseCodeTranslatorGUI().setVisible(true));
    }
}