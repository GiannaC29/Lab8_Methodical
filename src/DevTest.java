import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("Name: " + name);

        int number = SafeInput.getInt(in, "Enter an integer");
        System.out.println("Integer: " + number);

        double decimal = SafeInput.getDouble(in, "Enter a decimal number");
        System.out.println("Double: " + decimal);

        int rangedInt = SafeInput.getRangedInt(in, "Enter an integer", 1, 10);
        System.out.println("Ranged integer: " + rangedInt);

        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a decimal", 0.5, 10.0);
        System.out.println("Ranged double: " + rangedDouble);

        boolean answer = SafeInput.getYNConfirm(in, "Do you want to continue?");
        System.out.println("Answer: " + answer);

        String code = SafeInput.getRegExString(in, "Enter a 5-digit code", "^\\d{5}$");
        System.out.println("Code: " + code);
    }
}
