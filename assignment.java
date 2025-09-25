public class practice{
    public static void main(String[] args) {
        int num = 997695;
        String reversed = "";

        while (num != 0) {
            int digit = num % 10;
            reversed+= digit;
            num /= 10; 
        }

        System.out.println("Reversed Number: " + reversed);
    }
}