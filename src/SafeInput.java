import java.util.Scanner;

public class SafeInput
{
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";

        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        }
        while (retString.length() == 0);

        return retString;
    }

    public static int getInt(Scanner pipe, String prompt)
    {
        int retInt = 0;
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextInt())
            {
                retInt = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                String trash = pipe.nextLine();
                System.out.println("Invalid integer: " + trash);
            }
        }
        while (!done);

        return retInt;
    }

    public static double getDouble(Scanner pipe, String prompt)
    {
        double retDouble = 0;
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextDouble())
            {
                retDouble = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                String trash = pipe.nextLine();
                System.out.println("Invalid number: " + trash);
            }
        }
        while (!done);

        return retDouble;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int value = 0;
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine();

                if (value >= low && value <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Enter a number between " + low + " and " + high + ".");
                }
            }
            else
            {
                String trash = pipe.nextLine();
                System.out.println("Invalid integer: " + trash);
            }
        }
        while (!done);

        return value;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double value = 0;
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextDouble())
            {
                value = pipe.nextDouble();
                pipe.nextLine();

                if (value >= low && value <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Enter a number between " + low + " and " + high + ".");
                }
            }
            else
            {
                String trash = pipe.nextLine();
                System.out.println("Invalid number: " + trash);
            }
        }
        while (!done);

        return value;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String answer = "";

        do
        {
            System.out.print("\n" + prompt + " [Y/N]: ");
            answer = pipe.nextLine().trim();

            if (answer.equalsIgnoreCase("Y"))
            {
                return true;
            }
            else if (answer.equalsIgnoreCase("N"))
            {
                return false;
            }
            else
            {
                System.out.println("Please enter Y or N.");
            }
        }
        while (true);
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String value = "";

        do
        {
            System.out.print("\n" + prompt + ": ");
            value = pipe.nextLine();

            if (!value.matches(regEx))
            {
                System.out.println("Invalid input. Please try again.");
            }
        }
        while (!value.matches(regEx));

        return value;
    }

    public static void prettyHeader(String msg)
    {
        int width = 60;
        int padding = width - 6 - msg.length();
        int left = padding / 2;
        int right = padding - left;

        for (int i = 0; i < width; i++)
        {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("***");

        for (int i = 0; i < left; i++)
        {
            System.out.print(" ");
        }

        System.out.print(msg);

        for (int i = 0; i < right; i++)
        {
            System.out.print(" ");
        }

        System.out.println("***");

        for (int i = 0; i < width; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
