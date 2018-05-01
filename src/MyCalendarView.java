import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * The Event class represents a event with its
 * name, starting time, ending time.
 *
 * @author Rui Yang
 * @version sjsu-cs-151-projectAssignment2
 * @since 4/28/2018
 */
public class MyCalendarView extends JFrame implements ChangeListener {

    private int width = 600;
    private int hiehgt = 300;
    private JPanel topPanel, leftPanel,rightPanel;
    JButton backwardButton, forwardButton, quitdButton, createButton, saveButton;

    public MyCalendarView() {
        setTitle("My Calendar");
        this.setLayout(new BorderLayout());
        topPanel = new JPanel();
        leftPanel = new JPanel();
        leftPanel.setLayout(new BorderLayout());
        rightPanel = new JPanel();


        backwardButton = new JButton("<");


        forwardButton = new JButton(">");

        quitdButton = new JButton("Quit");


        createButton = new JButton("Create");
        createButton.addMouseListener(new MouseInputAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("Create Button Clikced");
                JFrame jFrame=new JFrame("Creating An Event");
                JPanel saveTopPanel = new JPanel();
                saveTopPanel.setLayout(new FlowLayout());
                JPanel saveButPanel = new JPanel();
                saveButPanel.setLayout(new FlowLayout());

                JTextField textField = new JTextField(20);
                JLabel title = new JLabel("Title:");

                JTextField dateTextField = new JTextField("3/31/14",7);
                dateTextField.setEditable(false);
                JTextField startingTextField = new JTextField(7);
                JLabel startingTitle = new JLabel("Starting Time:");
                JTextField endingTextField = new JTextField(7);
                JLabel endingTitle = new JLabel("Ending Time:");

                saveButton = new JButton("SAVE");
                saveButton.addMouseListener(new MouseInputAdapter() {
                    /**
                     * {@inheritDoc}
                     *
                     * @param e
                     */
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        super.mouseClicked(e);
                        jFrame.dispose();
                    }
                });

                saveTopPanel.add(title);
                saveTopPanel.add(textField);

                saveButPanel.add(dateTextField);
                saveButPanel.add(startingTitle);
                saveButPanel.add(startingTextField);
                saveButPanel.add(endingTitle);
                saveButPanel.add(endingTextField);
                saveButPanel.add(saveButton);

                jFrame.setLayout(new BorderLayout());
                jFrame.add(saveTopPanel, BorderLayout.NORTH);
                jFrame.add(saveButPanel, BorderLayout.SOUTH);
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jFrame.setResizable(false);
                jFrame.pack();
                jFrame.setLocationRelativeTo(null);
                jFrame.setVisible(true);





            }
        });


        // this.setLayout(new BorderLayout());


        topPanel.add(backwardButton);
        topPanel.add(forwardButton);
        topPanel.add(quitdButton);
        leftPanel.add(createButton, BorderLayout.NORTH);

        this.add(topPanel, BorderLayout.NORTH);
        this.add(rightPanel,BorderLayout.CENTER );
        this.add(leftPanel,BorderLayout.WEST);
        this.setResizable(false);
        this.setSize(width, hiehgt);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.setVisible(true);

    }

    /**
     * Invoked when the target of the listener has changed its state.
     *
     * @param e a ChangeEvent object
     */
    @Override
    public void stateChanged(ChangeEvent e) {

    }
}
