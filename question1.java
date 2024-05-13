public class Main {
    static int numberCounter(int[] numbers, int number){
        int counter = 0;
        int i = 0;
        for (; i < numbers.length; i++)
            if (numbers[i] == number)
                counter++;
        return counter;
    }

    public static void main (String[] args){
        int[] nums = {1, 2, 3, 3, 4, 6, 3, 7, 7, 7, 8};
        int number1 = Main.numberCounter(nums, 3);
        System.out.println(number1);
    }
}