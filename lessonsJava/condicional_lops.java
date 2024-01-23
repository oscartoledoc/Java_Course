class condicional
{
    public static void main(String args[])
    {
        int n = 6;
        int result = 0;

        // if it´s true; result will be 10 ; if it´s false; result will be 20 - 
        // All in the same line - It´s similar to If
        result = n++==0 ? 10 : 20;

        System.out.println(n);
        System.out.println(result);
    }
}