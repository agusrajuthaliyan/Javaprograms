// Bounded
class testgenconstructor<T, U>
{
    T tc;
    U uc;
    
    testgenconstructor(T fm, U sm) // Constructor with parameters
    {        
        tc = fm;
        uc = sm;
    }
    
    public void disp(T a, U b)
    {
        System.out.println(a);
        System.out.println(b);
    }
}

class genconstructor
{
    public static void main(String args[])
    {
        testgenconstructor<Integer, String> t1 = new testgenconstructor<>(12, "AA");
        testgenconstructor<String, Integer> t2 = new testgenconstructor<>("AB", 23);

        t1.disp(12, "AA");
        t2.disp("AB", 23);
    }
}
