class Student {
    int id;
    String name;
    int age;
    // Constructor 1: No parameters
    Student() {
        id = 0;
        name = "Unknown";
        age = 0;
    }
    // Constructor 2: Only id and name
    Student(int i, String n) {
        id = i;
        name = n;
        age = 18; // default age
    }
    // Constructor 3: id, name, and age
    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }
    // Display method
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
    // Main method
    public static void main(String[] args) {
        Student s1 = new Student();                      // calls constructor 1
        Student s2 = new Student(101, "Raju");         // calls constructor 2
        Student s3 = new Student(102, "Madan", 21);    // calls constructor 3

        s1.display();
        s2.display();
        s3.display();
    }
}
