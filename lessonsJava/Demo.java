class Student{
    int rollno;
    String name;
    int marks;
}

public class Demo {
    public static void main(String a[]){

        int nums [] = new int [4];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;

        // for(int i=0; i<nums.length;i++){
        //     System.out.println(nums[i]);
        // }

        for(int n : nums){
            System.out.println(n);
        }

    }
}
