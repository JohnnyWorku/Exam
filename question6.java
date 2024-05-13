import java.util.Arrays;

public class DeleteElement {
    static String deleteElement(int[] numbers, int index) {
        if (index < 0 || index > numbers.length - 1) {
            System.out.println("Invalid index.");
            return Arrays.toString(numbers);
        }
        else {
            int[] newArray = new int[numbers.length - 1];
            for (int i = 0, j = 0; i < numbers.length; i++) {
                if (i != index)
                    newArray[j++] = numbers[i];
            }
            return Arrays.toString(newArray);
        }
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 3, 4, 6, 3, 7, 7, 7, 8};
        System.out.println(DeleteElement.deleteElement(nums, 2));
    }
}
