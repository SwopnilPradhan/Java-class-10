public class Student {

    // Data members/instance variables
    String name;
    int age;
    int m1, m2, m3; // Marks in 3 subjects
    int maximum;
    double average;

    // Parameterized constructor to initialize data members
    public Student(String n, int a, int m_1, int m_2, int m_3) {
        name = n;
        age = a;
        m1 = m_1;
        m2 = m_2;
        m3 = m_3;
    }

    // Method to compute the average and maximum out of three marks
    public void computeMarks() {
        average = (m1 + m2 + m3) / 3.0; // Calculate average
        maximum = Math.max(m1, Math.max(m2, m3)); // Find maximum
    }

    // Method to display the name, age, marks in three subjects, maximum, and average
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks in Subject 1: " + m1);
        System.out.println("Marks in Subject 2: " + m2);
        System.out.println("Marks in Subject 3: " + m3);
        System.out.println("Maximum Marks: " + maximum);
        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {
        // Create an object of the Student class
        Student student = new Student("Alice", 20, 85, 92, 78);

        // Call the computeMarks() method
        student.computeMarks();

        // Call the displayDetails() method
        student.displayDetails();
    }
}