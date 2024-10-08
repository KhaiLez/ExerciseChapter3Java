public class doityourself21
{
    public static void main(String[] args)
    {
        for (int i = 0; i <= 0xFFFF; i++)
        {
            System.out.print(String.format("%X"+"\n", i));
            System.out.printf("%04X%n", i);
        }
    }
}
