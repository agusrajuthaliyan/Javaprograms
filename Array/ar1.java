import java.util.*;
class ar1
{
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("A");
        a1.add("B");
        a1.add(0, "C");
        
        System.out.println("Elements in the ArrayList:");
        for (String s : a1) {
            System.out.println(s);
        }
        
        System.out.println("After Removing:");
        a1.remove("C");
        a1.remove(1);
        
        for (String s : a1) {
            System.out.println(s);
        }
        
        System.out.println("Index of B: " + a1.indexOf("B"));
    }
}
