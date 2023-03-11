public class Rectangle
{
    double l,b;
    double area,perimeter,IsSquare;

    double area()
    {
        area=l*b;
        return area;
    }
    double perimeter()
    {
        perimeter=2*(l+b);
        return perimeter;
    }
    boolean IsSquare()
    {
        if(l==b)
            return false;
        return true;
    }

}
class Rectangle1
{
    public static void main(String args[])
    {
        Rectangle ss =new Rectangle();
        ss.l=6;
        ss.b=8;
        System.out.println(ss.area());
        System.out.println(ss.perimeter());
        System.out.println(ss.IsSquare());
    }
}
