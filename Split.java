import java.util.Scanner;

class Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter multiple numbers separated by spaces:");
        String input = sc.nextLine(); // e.g., "10 20 30 40 50"

        // Split the input by space
        String[] parts = input.split(" ");

        // Create an integer array to store the values
        int[] numbers = new int[parts.length];

        // Assign values using a loop
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }

        // Print to verify
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }
}
