import java.lang.Math;
public class doityourself17
{
    public static void main (String[] args)
    {
        int i;
        double a;
        for(i=1 ; i<=100; i++)
        {
            double number = Math.pow(2, i);
            a=number-1;
            System.out.print((int) a+" ");
        }
    }
}