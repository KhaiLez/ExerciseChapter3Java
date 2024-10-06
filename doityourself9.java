public class doityourself9
{
    public static void main(String[] args)
    {
        int i;
        int biggest;
        biggest=0;
        for (i=1; i<=100; i++)
        {
            if(i%7==0)
            {
                biggest=i;
            }
        }
        System.out.print(biggest+"\n");
    }
}