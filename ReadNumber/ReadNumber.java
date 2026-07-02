import java.util.Scanner;
public class ReadNumber {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (0 - 999): ");
        int number = scanner.nextInt();
        if (number < 0 || number > 999) {
            System.out.println("out of ability");
        } else if (number < 10) {
            System.out.println(readOneDigit(number));
        } else if (number < 20) {
            System.out.println(readTeen(number));
        } else if (number < 100) {
            System.out.println(readTwoDigits(number));
        } else {
            int hundreds = number / 100;
            int remainder = number % 100;

            String result = readOneDigit(hundreds) + " hundred";

            if (remainder != 0) {
                result += " and ";

                if (remainder < 10) {
                    result += readOneDigit(remainder);
                } else if (remainder < 20) {
                    result += readTeen(remainder);
                } else {
                    result += readTwoDigits(remainder);
                }
            }

            System.out.println(result);
        }

        scanner.close();
    }
    public static String readOneDigit(int number) {
        switch (number) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }
    public static String readTeen(int number) {
        switch (number) {
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            default:
                return "";
        }
    }
    public static String readTwoDigits(int number) {
        int tens = number / 10;
        int ones = number % 10;
        String tensWord = "";
        switch (tens) {
            case 2:
                tensWord = "twenty";
                break;
            case 3:
                tensWord = "thirty";
                break;
            case 4:
                tensWord = "forty";
                break;
            case 5:
                tensWord = "fifty";
                break;
            case 6:
                tensWord = "sixty";
                break;
            case 7:
                tensWord = "seventy";
                break;
            case 8:
                tensWord = "eighty";
                break;
            case 9:
                tensWord = "ninety";
                break;
        }
        if (ones == 0) {
            return tensWord;
        } else {
            return tensWord + " " + readOneDigit(ones);
        }
    }
}