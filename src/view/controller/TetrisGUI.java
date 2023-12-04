package view.controller;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import model.Board;
import view.Layout.GamePanel;
import view.Layout.MainPanel;
import view.Layout.NextPiecePanel;
import view.menu.Menu;


/**
 * This class represents the graphical user interface for the Tetris game.
 * It handles the initialization and display of the game window, including setting up
 * the game board, menu, timer, and various GUI components.
 *
 * @author Group 7
 * @version 1.0.2
 *
 */
public class TetrisGUI {

    /**
     * The height of the border around the game window.
     */
    private static final int BORDER_SIZE_HEIGHT = 10;

    /**
     * The width of the border around the game window.
     */
    private static final int BORDER_SIZE_WIDTH = 10;

    /**
     * The number of milliseconds in one second.
     * This constant defines the interval for the game's timer tick.
     */
    private static final int MILLIS_PER_SEC = 100; // CHANGE BACK TO 1000

    private int timerCounter = 0; // DELETE LATER (ONLY USED FOR TESTING)!!!

    /**
     * The primary model object representing the Tetris game board.
     */
    private final Board myBoard;

    /**
     * next piece panel object representing the panel where the next piece is shown.
     */
    private final NextPiecePanel myNextPiecePanel;

    /**
     * game panel object representing the panel where game is played.
     */
    private final GamePanel myGamePanel;

    /**
     * Timer to manage game updates at regular intervals.
     */
    private final Timer myGameTimer;

    /**
     * Constructs a new TetrisGUI object.
     * Initializes the game board, sets up GUI components, and adds necessary listeners.
     */
    public TetrisGUI() {
        super();
        myBoard = new Board();
        myNextPiecePanel = new NextPiecePanel(myBoard);
        myGamePanel = new GamePanel(myBoard);

        myBoard.addPropertyChangeListener(myNextPiecePanel);
        myBoard.addPropertyChangeListener(myGamePanel);

        myGameTimer = new Timer(MILLIS_PER_SEC, theEvent -> {
            timerCounter++; // DELETE LATER (USED FOR TESTING)
            System.out.print(timerCounter + "\n"); // DELETE LATER (USED FOR TESTING)
            myBoard.step();
        });

        setUpComponents();
    }

    /**
     * Sets up the main components of the GUI.
     * Initializes the frame, sets up the layout, adds a menu bar, main panel, and borders.
     */
    private void setUpComponents() {
        final JFrame frame = new JFrame("Tetris");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        final MainPanel mainPanel = new MainPanel(myBoard, myGameTimer,
                myNextPiecePanel, myGamePanel);

        frame.setJMenuBar(new Menu(myBoard, myGameTimer));
        frame.add(mainPanel, BorderLayout.CENTER);

        addBorders(frame);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    /**
     * Adds border panels to the frame.
     * @param theFrame The JFrame to which the borders are added.
     */
    private void addBorders(final JFrame theFrame) {
        final JPanel left = new JPanel();
        final JPanel right = new JPanel();
        final JPanel top = new JPanel();
        final JPanel bottom = new JPanel();

        left.setPreferredSize(new Dimension(BORDER_SIZE_WIDTH, BORDER_SIZE_HEIGHT));
        right.setPreferredSize(new Dimension(BORDER_SIZE_WIDTH, BORDER_SIZE_HEIGHT));
        top.setPreferredSize(new Dimension(BORDER_SIZE_WIDTH, BORDER_SIZE_HEIGHT));
        bottom.setPreferredSize(new Dimension(BORDER_SIZE_WIDTH, BORDER_SIZE_HEIGHT));

        theFrame.add(left, BorderLayout.WEST);
        theFrame.add(right, BorderLayout.EAST);
        theFrame.add(top, BorderLayout.NORTH);
        theFrame.add(bottom, BorderLayout.SOUTH);
    }

    /**
     * The main method to run the Tetris GUI.
     * @param theArgs Command line arguments (not used).
     */
    public static void main(final String[] theArgs) {
        SwingUtilities.invokeLater(TetrisGUI::new);
    }
}