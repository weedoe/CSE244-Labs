// The "Point3D_Tester" class.
// Modified by Dr. Yawei Liang, 20220919
class Point3D_Tester
{
    public static void main (String[] args)
    {
        Point3d pt1 = new Point3d();
        System.out.println ("pt1 = " + pt1);
        Point3d pt2 = new Point3d(1, 2, 3);
        System.out.println ("pt2 = " + pt2);
        pt1.setDebug (true);
        pt2.setDebug(false);// turn on debugging statements
// for pt1
        System.out.println ("Distance from " + pt2 + " to " + pt1 +
                " is " + pt2.distanceFrom (pt1));
        System.out.println ("Distance from " + pt1 +
                " to the origin (0, 0) is " + pt1.distanceFromOrigin ());
        System.out.println ("Distance from " + pt2 +
                " to the origin (0, 0) is " + pt2.distanceFromOrigin ());
        pt1.setXYZ (3, 5, 7);
        System.out.println ("pt1 = " + pt1);
        pt2.setXYZ (-3, -5, -7);
        System.out.println ("pt2 = " + pt2);
        System.out.println ("Distance from " + pt1 + " to " + pt2 +
                " is " + pt1.distanceFrom (pt2));
        System.out.println ("Distance from " + pt2 + " to " + pt1 +
                " is " + pt2.distanceFrom (pt1));
        pt1.setDebug (false); // turning off debugging
// statements for pt1
        System.out.println ("Distance from " + pt1 +
                " to the origin (0, 0) is " + pt1.distanceFromOrigin ());
        System.out.println ("Distance from " + pt2 +" to the origin (0, 0) is " + pt2.distanceFromOrigin ());
    }
} // Point3D_Tester class
