package org.code;
import java.util.Scanner; //program uses class Scanner
import org.json.JSONObject;

public class Addition {
    //main method begins execution of Java application
    public static void main(String[] args) {
        Welcome.printWelcome();
        System.out.printf("Hello %s\n", args[0]);
        // Create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: "); //prompt
        int number1 = input.nextInt(); // read First number from user
        System.out.print("Enter second integer: "); //prompt
        int number2 = input.nextInt(); // read Second number from user
        int sum = number1 + number2; //add numbers, store total in sum
        System.out.printf("Sum is %d%n", sum); //display sum

        JSONObject obj = new JSONObject();
        String jsonText;
        obj.put("number1", new Integer(number1));
        obj.put("number2", new Integer(number2));
        obj.put("result", new Integer(sum));
        jsonText = obj.toString();
        System.out.println(jsonText);





    }
}
