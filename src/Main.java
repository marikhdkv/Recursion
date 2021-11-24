import java.util.Scanner;

public class Main
{
    // Задание №11
    public static int AmountOnes() throws Exception
    {
        String digit = new Scanner(System.in).nextLine();
        if (!digit.equals("00"))
        {
            if (digit.length() == 1)
            {
                int amount = 0;
                if (digit.equals("1"))
                    ++amount;
                return amount + AmountOnes();
            }
            else throw new Exception("Вы ввели не натуральное число");
        }
        return 0;
    }

    // Задание №12
    public static void PrintOddNumbersSequence() throws Exception
    {
        String digit = new Scanner(System.in).nextLine();
        int number = Integer.parseInt(digit);
        if (number != 0)
        {
            if (digit.length() == 1)
            {
                if (number % 2 != 0)
                    System.out.println(number);
                PrintOddNumbersSequence();
            }
            else throw new Exception("Вы ввели не натуральное число");
        }
    }

    // Задание №13
    public static void PrintMembersOfSequenceWithOddNumbers() throws Exception
    {
        String digit = new Scanner(System.in).nextLine();
        int dig = Integer.parseInt(digit);
        if (dig != 0)
        {
            if (digit.length() == 1)
            {
                System.out.println(dig);
                new Scanner(System.in).nextLine();
                PrintMembersOfSequenceWithOddNumbers();
            }
            else throw new Exception("Вы ввели не натуральное число");
        }
    }

    // Задание №14
    public static void DigitsNumbersFromLeftToRight(int n)
    {
        if (n != 1)
            DigitsNumbersFromLeftToRight(n - 1);

        System.out.print(n + " ");
    }

    // Задание №15
    public static void DigitsNumbersFromRightToLeft(int n)
    {
        if (n != 0)
        {
            System.out.print(n + " ");
            DigitsNumbersFromRightToLeft(n - 1);
        }
    }

    public static void main(String[] args) throws Exception
    {
        // Задание №11
        System.out.println("Задание №11 (\"Количество единиц\")");
        System.out.println("Ответ:" + AmountOnes());
        // Задание №12
        System.out.println("Задание №12 (\"Вывести нечетные числа последовательности\")");
        PrintOddNumbersSequence();

        // Задание №13
        System.out.println("Задание №13 (\"Вывести члены последовательности с нечетными номерами\")");
        PrintMembersOfSequenceWithOddNumbers();

        // Задание №14
        System.out.println("Задание №14 (\"Цифры числа слева направо\")");
        System.out.print("Ответ: ");
        DigitsNumbersFromLeftToRight(5);
        System.out.println();

        // Задание №15
        System.out.println("Задание №15 (\"Цифры числа справа налево\")");
        System.out.print("Ответ: ");
        DigitsNumbersFromRightToLeft(5);
        System.out.println();
    }
}