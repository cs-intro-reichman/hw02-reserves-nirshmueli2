/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
    public static void main(String[] args) {
        int sum = 0;
        int number = Integer.parseInt(args[0]);
        if(number == 1){
            System.out.println("the number " + number + " is perfect");
            return;
        }
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == number) {
            System.out.println("the number " + number + " is perfect");
        } else {
            System.out.println("the number " + number + " is not perfect");
        }
    }
}


