import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * This is the GUI Class, this is used to build the framework everything from game
 * will be implemented into and setting values for the labels.
 * 
 * @author Ross Taylor 
 * @version (a version number or a date)
 */
public class GUI
{
    private JFrame frame;
    private int setDice;
    private String diceSet1;
    private String diceSet2;
    private String diceSet3;
    private String diceSet4;
    private String diceSet5;
    private int dice1;
    private int dice2;
    private int dice3;
    private int dice4;
    private int dice5;
    private int diceCount;
    /**
     * Constructor for objects of class Dice_Poker
     */
    public GUI()
    {
        makeFrame();
    }

    /**
     * Produces the frame with all the buttons
     */
    private void makeFrame()
    {
        Game game = new Game();
        // generates the container
        frame = new JFrame("Dice Poker");
        Container contentPane =frame.getContentPane();

        // generates the various panels, menu bar labels needed
        JPanel dicePanel = new JPanel();
        JPanel controlButtons = new JPanel();
        JLabel title = new JLabel("Dice Poker:");
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        // generates the options bar in menu
        JMenu options = new JMenu("Menu");
        menuBar.add(options);
        JMenuItem rules = new JMenuItem("Rules");
        JMenuItem help = new JMenuItem("Help");
        JMenuItem quit = new JMenuItem("Quit");
        options.add(rules);
        options.add(help);
        options.add(quit);

        // sets various layouts for each panel
        controlButtons.setLayout(new GridLayout(2, 4));
        dicePanel.setLayout(new GridLayout(1, 5));
        contentPane.setLayout(new BorderLayout());

        // positions everything inside the main panel
        contentPane.add(title, BorderLayout.NORTH);
        contentPane.add(dicePanel, BorderLayout.WEST);
        contentPane.add(controlButtons, BorderLayout.SOUTH);

        // adds dice values into the dice panel
        final JLabel p1D1 = new JLabel("Dice 1 = " + diceSet1 + "               ");
        dicePanel.add(p1D1);
        final JLabel p1D2 = new JLabel("Dice 2 = " + diceSet2 + "               ");
        dicePanel.add(p1D2);
        final JLabel p1D3 = new JLabel("Dice 3 = " + diceSet3 + "               ");
        dicePanel.add(p1D3);
        final JLabel p1D4 = new JLabel("Dice 4 = " + diceSet4 + "               ");
        dicePanel.add(p1D4);
        final JLabel p1D5 = new JLabel("Dice 5 = " + diceSet5 + "               ");
        dicePanel.add(p1D5);

        p1D1.setText("Dice 1 = " + game.getChangeDice1() + "               ");
        p1D2.setText("Dice 2 = " + game.getChangeDice2() + "               ");
        p1D3.setText("Dice 3 = " + game.getChangeDice3() + "               ");
        p1D4.setText("Dice 4 = " + game.getChangeDice4() + "               ");
        p1D5.setText("Dice 5 = " + game.getChangeDice5() + "               ");

        // adds the various control buttons into the control button panel
        JButton changeDice1 = new JButton("Change Dice 1");
        controlButtons.add(changeDice1);
        JButton changeDice2 = new JButton("Change Dice 2");
        controlButtons.add(changeDice2);
        JButton changeDice3 = new JButton("Change Dice 3");
        controlButtons.add(changeDice3);
        JButton changeDice4 = new JButton("Change Dice 4");
        controlButtons.add(changeDice4);
        JButton changeDice5 = new JButton("Change Dice 5");
        controlButtons.add(changeDice5);
        JButton rollDice = new JButton("Roll Dice");
        controlButtons.add(rollDice);
        JButton reset = new JButton("Reset");
        controlButtons.add(reset);

        rollDice.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    game.rollDice();
                    p1D1.setText("Dice 1 = " + game.getChangeDice1() + "               ");
                    p1D2.setText("Dice 2 = " + game.getChangeDice2() + "               ");
                    p1D3.setText("Dice 3 = " + game.getChangeDice3() + "               ");
                    p1D4.setText("Dice 4 = " + game.getChangeDice4() + "               ");
                    p1D5.setText("Dice 5 = " + game.getChangeDice5() + "               ");
                    if(game.getDiceCount() >= 2){
                        JOptionPane.showMessageDialog(frame, game.getVictory());

                    }
                }
            });

        changeDice1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent E){
                    game.changeDice1();
                    if(game.getDiceCount() <=1){
                        p1D1.setText("Dice 1 = " + game.getChangeDice1() + "               ");
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, game.getReRollString());
                    }
                }
            });
        changeDice2.addActionListener(new 

            ActionListener(){
                public void actionPerformed(ActionEvent E){
                    game.changeDice2();
                    if(game.getDiceCount() <=1){
                        p1D2.setText("Dice 2 = " + game.getChangeDice2() + "               ");
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, game.getReRollString());
                    }
                }
            });
        changeDice3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent E){
                    game.changeDice3();
                    if(game.getDiceCount() <=1){
                        p1D3.setText("Dice 3 = " + game.getChangeDice3() + "              ");
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, game.getReRollString());  
                    } 
                }
            });
        changeDice4.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent E){
                    game.changeDice4();
                    if(game.getDiceCount() <=1){
                        p1D4.setText("Dice 4 = " + game.getChangeDice4() + "              ");
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, game.getReRollString());  
                    } 
                }
            });
        changeDice5.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent E){
                    game.changeDice5();
                    if(game.getDiceCount() <=1){
                        p1D5.setText("Dice 5 = " + game.getChangeDice5() + "              ");
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, game.getReRollString());  
                    } 
                }
            });

        reset.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent E){
                    game.reset();
                    p1D1.setText("Dice 1 = " + game.getChangeDice1() + "               ");
                    p1D2.setText("Dice 2 = " + game.getChangeDice2() + "               ");
                    p1D3.setText("Dice 3 = " + game.getChangeDice3() + "               ");
                    p1D4.setText("Dice 4 = " + game.getChangeDice4() + "               ");
                    p1D5.setText("Dice 5 = " + game.getChangeDice5() + "               ");

                    JOptionPane.showMessageDialog(frame, "Game Reset.");
                }
            });

        rules.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    game.rules();
                    JOptionPane.showMessageDialog(frame, game.rules());
                }
            });

        help.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    game.help();
                    JOptionPane.showMessageDialog(frame, game.help());
                }
            });

        quit.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    game.quit();
                }
            });

        frame.pack();
        frame.setVisible(true);
    }
}
