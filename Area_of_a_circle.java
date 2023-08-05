import java.util.Scanner;
public class area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double area,r;
        r=sc.nextDouble();
        area=3.14*r*r;
        System.out.format("%.2f",area);
    }
}