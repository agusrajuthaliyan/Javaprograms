// Bounded
class testgenclass<T, U>
{
    public void disp(T a, U b)
    {
        System.out.println(a);
        System.out.println(b);
    }
}

class genclass
{
    public static void main(String args[])
    {
        testgenclass<Integer, String> t1 = new testgenclass<>();
        testgenclass<String, Integer> t2 = new testgenclass<>();

        t1.disp(12, "AA");
        t2.disp("AB", 23);
    }
}
