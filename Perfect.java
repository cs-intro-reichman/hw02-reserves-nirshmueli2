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
            System.out.print(number + " is a perfect number since " + number);
            boolean seenDivisors = false;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.print(seenDivisors ? " + " : " = ");                   
                    System.out.print(i);
                    seenDivisors = true;
                }
            }            
            System.out.println("");
        } else {
            System.out.println(number + " is not a perfect number");
        }
    }
}


