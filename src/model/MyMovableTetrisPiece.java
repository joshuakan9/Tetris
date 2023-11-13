package model;

/**
 * Interface for a movable Tetris piece. This interface defines the essential actions and
 * properties of a movable piece in the Tetris game.
 *
 * @author Tyler Cairney'
 * @version 1.0
 */
public interface MyMovableTetrisPiece {

    /**
     * Gets the type of TetrisPiece represented by this movable piece.
     *
     * @return The type of the TetrisPiece.
     */
    TetrisPiece getTetrisPiece();

    /**
     * Gets the current board position of the TetrisPiece.
     *
     * @return The board position.
     */
    Point getPosition();

    /**
     * Gets the current rotation value of the movable TetrisPiece.
     *
     * @return The current rotation value.
     */
    Rotation getRotation();

    /**
     * Gets the positions of the Tetris piece blocks on the board.
     *
     * @return An array of Point objects representing
     * the coordinates of each block on the board.
     */
    Point[] getBoardPoints();

    /**
     * Rotates the TetrisPiece clockwise and returns a new piece with the updated rotation.
     *
     * @return A new movable TetrisPiece rotated clockwise.
     */
    MovableTetrisPiece rotateCW();

    /**
     * Rotates the TetrisPiece counter-clockwise and returns a
     * new piece with the updated rotation.
     *
     * @return A new movable TetrisPiece rotated counter-clockwise.
     */
    MovableTetrisPiece rotateCCW();

    /**
     * Moves the TetrisPiece to the left on the game board and
     * returns a new piece with the updated position.
     *
     * @return A new movable TetrisPiece moved to the left.
     */
    MovableTetrisPiece left();

    /**
     * Moves the TetrisPiece to the right on the game board and
     * returns a new piece with the updated position.
     *
     * @return A new movable TetrisPiece moved to the right.
     */
    MovableTetrisPiece right();

    /**
     * Moves the TetrisPiece down on the game board and returns a
     * new piece with the updated position.
     *
     * @return A new movable TetrisPiece moved down.
     */
    MovableTetrisPiece down();

    /**
     * Sets the position of the TetrisPiece to a specified location
     * and returns a new piece with the updated position.
     *
     * @param thePosition The new position for the TetrisPiece.
     * @return A new movable TetrisPiece at the specified location.
     */
    MovableTetrisPiece setPosition(Point thePosition);

    /**
     * Provides a string representation of the movable TetrisPiece,
     * including its position and rotation.
     *
     * @return A string representing the movable TetrisPiece.
     */
    @Override
    String toString();
}
