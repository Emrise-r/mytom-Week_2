package BT_3_Point_MoveablePoint;

public class Chaythu {
    public static void main(String[] args) {
        MovablePoint mP = new MovablePoint();
        mP = new MovablePoint(10.0f, 5.2f, 5.6f, 10.4f);
        System.out.println(mP);
        mP.move();
        System.out.println(mP);
        mP.move();
        System.out.println(mP);
    }
}
