
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList();
        // toteuta ohjelmasi tänne
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String number = scanner.nextLine();
            if (number.equals("end")) {
                break;
            }
            list.add(number);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();
        if (choice.equals("p")) {
            double average = list.stream().mapToInt(s -> Integer.valueOf(s)).filter(number -> number >= 0).average().getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        }
       
        if (choice.equals("n")) {
            double average = list.stream().mapToInt(s -> Integer.valueOf(s)).filter(number -> number < 0).average().getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        }
        
    }
}
