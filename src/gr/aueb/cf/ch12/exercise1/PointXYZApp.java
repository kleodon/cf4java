package gr.aueb.cf.ch12.exercise1;

/**
 * A diver class for {@link PointXYZ}
 */
public class PointXYZApp {
    public static void main(String[] args) {
        PointXYZ p1 = new PointXYZ();
        PointXYZ p2 = new PointXYZ(1,2,3);
        PointXYZ p3 = new PointXYZ();

        p3.setX(p2.getZ());
        p3.setY(p2.getX());
        p3.setZ(p2.getY());

        System.out.println("p1 = " + p1.convertToString());
        System.out.println("p2 = " + p2.convertToString());
        System.out.println("p3 = " + p3.convertToString());

    }
}
