import java.util.ArrayList;

public class MyMain {

    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        return isSortedRec(list, 0);
    }

    // This recursive method checks if the array is sorted in 
    // non-decreasing order
    public static boolean isSortedRec(ArrayList<Integer> list, int i) {
        if(list.size()-1 == i) {return true;}
        else if(list.get(i) <= list.get(i+1)) {
            return isSortedRec(list, i+1);
        } else {
            return false;
        }
    }

     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {
        return hasCountCopiesRec(arr, x, count, 0, 0);
    }

    // This recursive method checks if the array contains exactly
    // count copies of the integer x
    public static boolean hasCountCopiesRec(int[] arr, int x, int count, int i, int sum) {
        if(i == arr.length && sum == count) {return true;}
        else if(i < arr.length && sum <= count) {
            if(arr[i] == x) {sum++; System.out.println(sum);}
            return hasCountCopiesRec(arr, x, count, i+1, sum);
        } else {return false;}
    }

    // Wrapper method
    public static boolean binarySearch(int[] arr, int num) {
        return binarySearchRec(arr, num, 0, arr.length-1);
    }

    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int lowerBound, int upperBound) {        
        if(lowerBound > upperBound) {return false;}
        else {
            int middleIndex = lowerBound + (upperBound - lowerBound) / 2;
            if(arr[middleIndex] < num) {lowerBound = middleIndex + 1; return binarySearchRec(arr, num, lowerBound, upperBound);}
            if(arr[middleIndex] > num) {upperBound = middleIndex - 1; return binarySearchRec(arr, num, lowerBound, upperBound);}
            return true;
        }
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
