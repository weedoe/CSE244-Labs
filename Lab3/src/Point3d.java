/** This class calculates the distance from one point in 3d to another.
* Oct 1, 2023
* @version Oct 6, 2023
* @author OCdt Paterson 30648, Dr Yawei Liang
*
*/

public class Point3d extends Point2d // Point3d inherits from Point2d
{
    private double z;  // z coordinate of point
    /**
     * sets the x, y, z coordinates
     * @param px x coordinate
     * @param py y coordinate
     * @param pz z coordinate
     */
    public Point3d(double px, double py, double pz) // Constructor
    {

        setX(px); // set x coordinate
        setY(py); // set y coordinate
        z = pz;    // set z coordinate

    }
    /**
     * Default constructor
     */
    public Point3d() // Default constructor
    {
        this (0.0, 0.0,0.0); // Invokes 3 parameter Point3D constructor
    }
    /**
     * Sets the z coordinate and assigns to pz and prints the change if debugging is on
     * @param pz z coordinate
     */
    public void setZ (double pz) // set the z coordinate
    {
        dprint ("setZ(): Changing value of Z from " + z + " to " + pz); //prints for debug
        z = pz; // set z coordinate
    }
    /**
     * Returns the z coordinate
     * @return z coordinate
     */
    public double getZ ()
    {
        return z;
    } // get the z coordinate
    /**
     * Sets the x, y, z coordinates
     *@param px x coordinate
     *@param py y coordinate
     *@param pz z coordinate
     *
     */
    public void setXYZ (double px, double py, double pz) // set the x, y, z coordinates
    {
        setX(px); // set x coordinate
        setY(py); // set y coordinate
        setZ(pz); // set z coordinate
    }
    /**
     * Calculates the distance from pt2 to pt1
     * @param pt Point3d object
     * @return distance from pt2 to pt1
     */
    public double distanceFrom (Point3d pt) // distance from pt2 to pt1
    {
        double dx = Math.abs (getX() - pt.getX ()); // absolute value of x
        double dy = Math.abs (getY() - pt.getY ()); // absolute value of y
        double dz = Math.abs (z - pt.getZ ()); // absolute value of z
        dprint ("distanceFrom(): deltaX = " + dx); //prints for debug
        dprint ("distanceFrom(): deltaY = " + dy); //prints for debug
        dprint ("distanceFrom(): deltaZ = " + dz); //prints for debug
        return Math.sqrt((dx * dx) + (dy * dy) + (dz * dz)); //returns distance
    }
    /**
     * Calculates the distance from the origin to the point
     * @return distance from origin
     */
    public double distanceFromOrigin ()
    {
        return distanceFrom (new Point3d());
    } // distance from origin
    /**
     * Sets the str string to z coordinate to be sent to toString function
     * @return z coordinate
     */
    public String toStringForZ () // sets z coordinate
    {
        String str; // declares str string
        str = ", " + z; // sets string to z coordinate
        return str; // returns str string
    }
    /**
     * Uses toStringForXY from Point2d and toStringForZ to return x, y, z coordinates in a string
     * @return x, y, z coordinates
     */
    public String toString () // returns x, y, z coordinates
    {String str;
        str = toStringForXY () + toStringForZ () + ")"; // sets str to x, y, z coordinates
        return str; // returns str string
    }
}

//Expected output:
//pt1 = (3.0, 5.0, 7.0)
//pt2 = (-3.0, -5.0, -7.0)
//Debug: distanceFrom(): deltaX = 6.0
//Debug: distanceFrom(): deltaY = 10.0
//Debug: distanceFrom(): deltaZ = 14.0
//Distance from (3.0, 5.0, 7.0) to (-3.0, -5.0, -7.0) is 18.2208671582886
//Distance from (-3.0, -5.0, -7.0) to (3.0, 5.0, 7.0) is 18.2208671582886
//Distance from (3.0, 5.0, 7.0) to the origin (0, 0) is 9.1104335791443
//Distance from (-3.0, -5.0, -7.0) to the origin (0, 0) is 9.1104335791443