public class FindDuplicate {
    void main(String[] args) {
        int[] numbers = {0, 1, 0, 4, 2, 7, 1, 8, 10, 3};
        System.out.println("Array: " );
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        boolean hasDuplicates = false;
        System.out.println("Duplicates numbers: " );
        for ( int i = 0 ; i < numbers.length; i++) {
            boolean alreadyPrinted = false;
            for ( int t = 0; t < i ; t ++) {
                if (numbers[t] == numbers[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (alreadyPrinted) {
                continue;
            }
            for ( int r = i + 1; r<numbers.length; r++) {
                if (numbers[i] == numbers[r]) {
                    System.out.print(numbers[i] + " ");
                    hasDuplicates= true;
                    break;
                }
            }
        }
        if (!hasDuplicates) {
            System.out.println("None");
        }
        System.out.println();
    }
}
