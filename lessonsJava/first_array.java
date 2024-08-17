public class first_array
{
    public static void main (String a[])
    {
        // Defining a array
        int nums [] = {1 , 2 , 3 , 4};
        
        System.out.print("[ ");
        // It´s the way to print the array elements
        for(int i=0; i<nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.print("]");
    }
}