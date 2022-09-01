import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class setup {

    private String input;
    private JFrame frame;
    private JLabel label;
    private JLabel label2;
    private JPanel panel;
    private JTextField text;

    public setup() {
        frame = new JFrame();
        // set location of window
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(d.width / 2 - 30 / 2, d.height / 2 - 30 / 2);
        //label 1
        label = new JLabel("Enter Folder Location: ");
        //text box that takes input
        text = createJTextField();
        //label 2
        label2 = new JLabel("Press Enter When Done");
        label2.setFont(new Font(label.getFont().getFontName(),label.getFont().getStyle(),label.getFont().getSize()-1));

        //panel
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 100, 30, 100));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label);
        panel.add(text);
        panel.add(label2);
        frame.add(panel, BorderLayout.CENTER);

        //frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Display");
        frame.pack();
        frame.setVisible(true);
    }

    //text field
    public JTextField createJTextField() {
        JTextField textField = new JTextField();
        textField.setToolTipText("Press Enter When Done");

        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input = textField.getText();

                Organizer organizer = new Organizer(input);
                organizer.sortByCategory();
                organizer.sortIntoFolders(input);
            }
        });
        return textField;
    }
}