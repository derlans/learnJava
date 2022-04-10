package 多态;

public class VirtualDemo
{
    public static void main(String [] args)
    {
        Salary s = new Salary("TW", "WHUT", 3, 3600.00);
        Employee e = new Salary("ZXH", "WC", 2, 2400.00);
        System.out.println("看看屠威");
        s.mailCheck();
        System.out.println("\n 看看郑旭辉");
        e.mailCheck();
    }
}
