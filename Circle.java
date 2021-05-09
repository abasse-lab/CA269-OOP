import java.lang.Math;

public class Circle extends Shape
{
  private double r; 

   public Circle(String s, double x)
   {
      super(s);
      r = x;
   }

   double area()
   {
      double s = Math.PI * Math.pow(r, 2);
      return s;
   }
}
