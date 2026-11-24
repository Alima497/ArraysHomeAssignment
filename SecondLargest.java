public class SecondLargest {
    void main(String[] args) {
        int[] numbers = {-6, 30, 7, 100, -20, 5};
        for ( int num : numbers ) {
            System.out.print(  + num + " ");
        }
        System.out.println();
        int largest = numbers[0];
        int secondLargest = numbers[0];
        boolean found = false;
        for ( int num : numbers ){
            if ( num > largest ) {
                secondLargest = largest ;
                largest = num ;
                found = true;
            } else if (num < largest && (!found || num > largest)) {
                secondLargest = num;
                found = true;
            }
        }
        System.out.println("Largest :" + largest);
        if (!found ) {
            System.out.println("No second largest number");
        } else  {
            System.out.println("Second largest number:" + secondLargest);
        }

    }
}