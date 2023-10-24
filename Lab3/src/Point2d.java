/**
 * This class calculates the distance from one point in 2d to another.
 * Oct 1, 2023
 * @version Oct 6, 2023
 * @author OCdt Paterson 30648, Dr Yawei Liang
 */
public class Point2d // Point2d class
{
    /* The X and Y coordinates of the point--instance variables */
    private double x; // x coordinate of point
    private double y; // y coordinate of point
    private boolean debug; // A trick to help with debugging
    /**
     * sets the x, y coordinates and assigns to variables
     * @param px x coordinate
     * @param py y coordinate
     */
    public Point2d(double px, double py)
    { // Constructor
        x = px; // set x coordinate
        y = py; // set y coordinate
        debug = false; // turn off debugging
    }
    /**
     * Default constructor
     */
    public Point2d()
    { // Default constructor
        this (0.0, 0.0); // Invokes 2 parameter Point2D constructor
    }
    // Note that a this() invocation must be the BEGINNING of
// statement body of constructor
    public Point2d(Point2d pt)
    { // Another consructor
        x = pt.getX (); // set x coordinate
        y = pt.getY (); // set y coordinate
// a better method would be to replace the above code with
// this (pt.getX(), pt.getY());
// especially since the above code does not initialize the
// variable debug. This way we are reusing code that is already
// working.
    }
    /*
     * print the debugging string only if the "debug" data member is true
     */
    /**
     * prints for debug only if debug is true
     * @param s string to print
     */
    public void dprint (String s) // prints for debug
    {if (debug)// if debug is true
        System.out.println ("Debug: " + s); //prints for debug
    }
    /**
     * turns on/off debugging
     * @param b boolean to set debug to
     */
    public void setDebug (boolean b)
    {
        debug = b;
    } // turn on/off debugging
    /**
     * sets the x coordinate and assigns to px and prints the change if debugging is on
     * @param px x coordinate
     */
    public void setX (double px) // set the x coordinate
    {
        dprint ("setX(): Changing value of X from " + x + " to " + px); //prints for debug
        x = px;
    }
    /**
     * returns the x coordinate
     * @return x coordinate
     */
    public double getX ()
    {
        return x;
    } // get the x coordinate
    /**
     * sets the y coordinate and assigns to py and prints the change if debugging is on
     * @param py y coordinate
     */
    public void setY (double py) // set the y coordinate
    {
        dprint ("setY(): Changing value of Y from " + y + " to " + py); //prints for debug
        y = py;
    }
    /**
     * returns the y coordinate
     * @return y coordinate
     */
    public double getY (){
        return y;
    } // get the y coordinate
    /**
     * sets the x, y coordinates
     * @param px x coordinate
     * @param py y coordinate
     */
    public void setXY (double px, double py) // set the x and y coordinates
    {
        setX (px);
        setY (py);
    }
    /**
     * calculates the distance from pt2 to pt1
     * @param pt Point2d object
     * @return distance from pt2 to pt1
     */
    public double distanceFrom (Point2d pt)
    {
        double dx = Math.abs (x - pt.getX ());
        double dy = Math.abs (y - pt.getY ());
// check out the use of dprint()
        dprint ("distanceFrom(): deltaX = " + dx);
        dprint ("distanceFrom(): deltaY = " + dy);
        return Math.sqrt ((dx * dx) + (dy * dy));
    }
    /**
     * calculates the distance from the origin to the point
     * @return distance from origin
     */
    public double distanceFromOrigin ()
    {
        return distanceFrom (new Point2d());
    }
    /**
     * sets the str string to x, y coordinates to be sent to toString function
     * @return x, y coordinates
     */
    public String toStringForXY ()
    {
        String str = "(" + x + ", " + y;
        return str;
    }
/**
 * returns x, y coordinates set previously by toStringForXY
 * @return x, y coordinates
 **/public String toString () // returns x, y coordinates
{
    String str = toStringForXY () + ")"; // sets str to x, y coordinates
    return str;
}
}