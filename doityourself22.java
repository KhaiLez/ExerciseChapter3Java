public class doityourself22
{
    public static void main(String[] args)
    {
        for (int i = 0; i <= 0777; i++)
        {
            // Print the number in octal format
            System.out.printf("%03o%n", i);
            System.out.printf("%o"+"\n", i);
            System.out.print(String.format("%o"+"\n", i));
        }
    }
}
