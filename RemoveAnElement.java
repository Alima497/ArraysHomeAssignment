import java.util.Scanner;
public class RemoveAnElement {
    void main(String[] args) {
        int[] numbers = {-6, 30, 7, 100, -20, 5};
        Scanner scanner = new Scanner(System.in);
        for ( int num : numbers ) {
            System.out.print( num + " ");
        }
        System.out.println();
        System.out.println("Enter index to remove: ");
        int index = scanner.nextInt();
        if (index<0 || index >=numbers.length) {
            System.out.println("Invalid value");
        } else {
            for (int i = index; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
        }
        System.out.println("Updated: ");
        for ( int i = 0; i < numbers.length-1; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}
