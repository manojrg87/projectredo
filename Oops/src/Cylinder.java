public class Cylinder

    {
        int r,h;
        double lidArea,totalSurfaceArea,volume,circumference;
        double lidArea()
        {
           return lidArea=2*Math.PI*r*h;
        }
        double totalSurfaceArea()
        {
            return totalSurfaceArea=(2*Math.PI*r*h)+(2*Math.PI*r*r);
        }
        double volume()
        {
           return volume=Math.PI*r*r*h;
        }
        double circumference()
        {
           return circumference=Math.PI*r*r;
        }
    }

     class Cylinder1
    {
        public static void main(String args[])
     {
        Cylinder ll=new Cylinder();
        ll.r=7;
        ll.h=10;
        System.out.println(ll.lidArea());
        System.out.println(ll.totalSurfaceArea());
        System.out.println(ll.volume());
        System.out.println(ll.circumference());

    }
    }


