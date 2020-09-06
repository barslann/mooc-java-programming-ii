
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {          
            int s = Integer.valueOf(scanner.nextLine());
            if (s < 0) {
                break;
            }
            
            list.add(s);
        }
        
        list.stream().filter(value -> value >=1 && value <=5).forEach(s -> System.out.println(s));
    //        String combined= list.stream().reduce("",(prev,s) -> prev + s +"\n");
        //    System.out.println(combined);
    }
    
}
