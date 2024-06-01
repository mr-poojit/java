import java.sql.Date;

public class Primitive {
    
    public static void main(String[] args) {
        //Date now = new Date(System.currentTimeMillis());
        //byte x =1;
       // byte y=x;
        //x= 2;
        //System.out.println(y);

        Point point1 = new Point(x:1, y:1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

    }
}
