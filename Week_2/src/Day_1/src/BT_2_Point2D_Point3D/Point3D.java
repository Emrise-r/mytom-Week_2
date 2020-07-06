package BT_2_Point2D_Point3D;

public class Point3D extends Point2D {
    public float z;

    public Point3D() {}

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x,y);
        this.z = z;
    }

    public void getXYZ() {
        System.out.printf("x = " + super.getX() + " y = " + super.getY() + " z = " + z);
    }

    @Override
    public String toString() {
        return super.toString()
                + " z = "
                + z;
    }
}
