class operators
{
    public static void main(String args[])
    {
        int num1=20;
        int num2=8;
        int num3=5;

        // Assignment Operators
        int result2=num1%num2; // Return the rest of the divide betweens ones

        // Relational Operators
        boolean A = num1<num2;

        // Logical Operators
        boolean B = num1<num2 || num2>num3;
        boolean C = num1<num2 && num2>num3;


        System.out.println(result2);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
