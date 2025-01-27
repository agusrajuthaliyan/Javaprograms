// Generic Methods
class testgen
{
    public <A> void print(A[] a)
    {
        for(A i:a)
        {
            System.out.println(i);
        }
    }
}
class genericmeth
{
    public static void main(String args[])
    {
        Integer[] ia = {1,2,3,4,5};
        Double[] fa = {1.2,2.2,2.3,4.3,5.4};
        testgen t = new testgen();
        t.print(ia);
        t.print(fa);
    }
}