
/**
 * Write a description of class biSearch here.
 *
 * @author Erica Lee
 * @version Jan 30, 2024
 */
public class biSearch
{
    public static int binarySearch(int[] nums, int start, int end, int key){

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == key) {
                return mid; // Element found
            } else if (nums[mid] < key) {
                start = mid + 1; // Discard left half
            } else {
                end = mid - 1; // Discard right half
            }
        }

        return -1; // Element not found
    }
}
