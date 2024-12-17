import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int[] myArray = readIntegers();
        System.out.println(Arrays.toString(myArray));
        System.out.println("Minimum value in the array: " + findMin(myArray));
    }

    public static int[] readIntegers() {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the array content by comma delimited.");
        String input = scanner.nextLine();
        String[] strArray = input.split(",");
        int[] inputArray = new int[strArray.length];
        int i = 0;
        for (String item : strArray) {
            inputArray[i] = Integer.parseInt(strArray[i].trim());
            i++;
        }

        return inputArray;
    }

    public static int findMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int item : inputArray) {
            if (minValue > item) {
                minValue = item;
            }
        }

        return minValue;
    }
}