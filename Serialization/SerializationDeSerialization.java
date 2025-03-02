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

class SerializationDeSerialization {
    public static void main(String[] args) {
        String filename = "stud.txt"; // Store the filename in a variable

        // Serialization (Writing the object to a file)
        try {
            Student s1 = new Student("Agus", "MSCCS", 22);
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close();
            fos.close();
            System.out.println("Object serialized successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Deserialization (Reading the object from a file)
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student deserializedStudent = (Student) ois.readObject(); // Cast the read object
            ois.close();
            fis.close();

            System.out.println("Object deserialized successfully!");
            System.out.println("Name: " + deserializedStudent.name);
            System.out.println("Course: " + deserializedStudent.course);
            System.out.println("Age: " + deserializedStudent.age);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}