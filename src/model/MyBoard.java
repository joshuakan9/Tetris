package model;

import java.util.List;

/**
 * Interface for the Tetris Board. This interface defines the essential actions and
 * functionalities of a Tetris game board.
 * Implementing classes are expected to manage game state, handle piece movements,
 * and update game status accordingly.
 *
 * @author Tyler Cairney
 * @version 1.0
 */
public interface MyBoard {

    /**
     * Gets the width of the board.
     *
     * @return The width of the board.
     */
    int getWidth();

    /**
     * Gets the height of the board.
     *
     * @return The height of the board.
     */
    int getHeight();

    /**
     * Starts a new game. This should reset the board and prepare it for a new game session.
     */
    void newGame();

    /**
     * Sets a non-random sequence of Tetris pieces to be used by the board.
     *
     * @param thePieces The list of Tetris pieces to be used in sequence.
     */
    void setPieceSequence(List<TetrisPiece> thePieces);

    /**
     * Advances the board by one step. This typically involves moving the current piece,
     * handling any line completions, and updating the game state.
     */
    void step();

    /**
     * Moves the current piece down by one row, if possible.
     */
    void down();

    /**
     * Moves the current piece one column to the left, if possible.
     */
    void left();

    /**
     * Moves the current piece one column to the right, if possible.
     */
    void right();

    /**
     * Rotates the current piece in a clockwise direction, if possible.
     */
    void rotateCW();

    /**
     * Rotates the current piece in a counter-clockwise direction, if possible.
     */
    void rotateCCW();

    /**
     * Instantly drops the current piece to the bottom of the board.
     */
    void drop();

    /**
     * Provides a string representation of the current state of the board.
     * This typically includes the layout of the Tetris pieces on the board.
     *
     * @return A string representing the current state of the board.
     */
    @Override
    String toString();
}

