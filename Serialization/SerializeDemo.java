import java.io.*;

class Student implements Serializable {
    String name;
    String course;
    int age;

    public Student(String name, String course, int age) {
        this.name = name;
        this.course = course;
        this.age = age;
    }
}

class SerializeDemo {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Agus", "MSCCS", 22);
            FileOutputStream fos = new FileOutputStream("stud.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close();
            fos.close();
            System.out.println("This is Serialization!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}