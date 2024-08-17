public class arraysClass
{
    int[] myArray; // Class ttribute as array 

    public arraysClass()
    {
        myArray = new int[5]; //Inicializing in the constructor
    }

    void processArray(int[] array)  // Class that is creating the array
    {
        System.out.print("Elementos del Array: ");
        for (int i = 0; i < array.length; i++) 
        {
            System.out.print(array[i] + " ");
        }

        System.out.println();  // Line break
    }



    public static void main(String args[])
    {
        arraysClass matrix = new arraysClass();

        // To create an array and get to method
        int[] myArray = {1,2,3,4,5};
        
        matrix.processArray(myArray);
    }
}