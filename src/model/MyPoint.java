package model;

/**
 * Interface for a 2D point. This interface defines the essential actions and
 * properties of a point in a 2D space.
 *
 * @author Tyler Cairney
 * @version 1.0
 */
public interface MyPoint {

    /**
     * Gets the X coordinate of the point.
     *
     * @return The X coordinate.
     */
    int x();

    /**
     * Gets the Y coordinate of the point.
     *
     * @return The Y coordinate.
     */
    int y();

    /**
     * Creates a new point by transforming this point by the specified x and y values.
     *
     * @param theX The X factor to transform by.
     * @param theY The Y factor to transform by.
     * @return A new Point resulting from the transformation.
     */
    Point transform(int theX, int theY);

    /**
     * Creates a new point by transforming this point by another point.
     *
     * @param thePoint The Point to transform with.
     * @return A new Point resulting from the transformation.
     */
    Point transform(Point thePoint);
}
