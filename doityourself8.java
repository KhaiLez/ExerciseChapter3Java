public class doityourself8
{
    public static void main(String[] args)
    {
        double i, sum, average, allnumber;
        sum = 0;
        allnumber=0;
        for (i = 1; i <= 100; i++)
        {
            sum = (sum + i);
            allnumber++;
        }
        average=sum/allnumber;
        System.out.print(average+"\n");
    }
}
