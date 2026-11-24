public class Replace {
    void main(String[] args) {
        int[] numbers = {-3, 9, 10, -6, 0, 1, 2, -9, 0, 1};
        int Replacements = 0;
        System.out.println("Original: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < numbers.length; i++) {
            if ( numbers[i] < 0 ) {
                numbers[i] = 0;
                Replacements++;
            }
        }
        System.out.println();
        System.out.println("Modified: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Replacements: " + Replacements);

    }
}