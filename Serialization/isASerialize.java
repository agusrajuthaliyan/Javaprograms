import java.io.*;

class PartTimeStud implements Serializable {
    String name;
    String course;
    int age;
    String schedule;

    public PartTimeStud(String name, String course, int age, String schedule) {
        this.name = name;
        this.course = course;
        this.age = age;
        this.schedule = schedule;
    }
}

class isASerialize {
    public static void main(String[] args) {
        try {
            PartTimeStud p = new PartTimeStud("Agus", "MSCCS01", 22, "wknd");
            FileOutputStream fos = new FileOutputStream("PTstud.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p);
            oos.close();
            fos.close();
            System.out.println("This is Serialization!");
        } catch (Exception e) {
            e.printStackTrace(); // Use printStackTrace() for better error details
        }
    }
}