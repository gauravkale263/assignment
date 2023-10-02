import java.util.*;

class shuffle
{
    public static void shuffleArray(int nums[])
    {
        for (int i = nums.length - 1; i >= 1; i--)
        {
            Random rand = new Random();

            int j = rand.nextInt(i + 1);

            swap_elements(nums, i, j);
        }
    }
    private static void swap_elements(int[] nums, int i, int j) 
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main (String[] args)
    {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Original Array: "+Arrays.toString(nums));
        shuffleArray(nums);
        System.out.println("Shuffle Array: "+Arrays.toString(nums));
    }
}
