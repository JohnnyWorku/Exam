import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(char[] charArray){
        for (int i = 0; i < charArray.length - 1; i++)
            for (int j = 0; j < charArray.length - i - 1; j++) {
                if (Character.getNumericValue(charArray[j]) > Character.getNumericValue(charArray[j + 1])) {
                    int temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = (char) temp;
                }
            }
    }
}
