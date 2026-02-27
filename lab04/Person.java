package lab04;

public class Person {
    private String firstName;
    private String lastName;
    private String gender;

    // i. Constructor
    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    // i. Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // ii. toString method
    public String toString() {
        return "FirstName: " + firstName + ", LastName: " + lastName + ", Gender: " + gender;
    }

    // iii. equals method
    public boolean equals(Person p) {
        if (p == null) return false;
        return this.firstName.equals(p.firstName) && 
               this.lastName.equals(p.lastName) && 
               this.gender.equals(p.gender);
    }

    public static void main(String[] args) {
        String[] c = {"Math", "Java"};
        Teacher t = new Teacher("Ayan", "Isgandarova", "Female", "IT", c);
        System.out.println(t.toString());
    }
}

// b. Teacher class extending Person
class Teacher extends Person {
    private String department;
    private String[] courses;

    // i. Constructor
    public Teacher(String firstName, String lastName, String gender, String department, String[] courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    // i. Getters and Setters
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    // ii. toString method
    public String toString() {
        String coursesStr = "";
        for (int i = 0; i < courses.length; i++) {
            coursesStr += courses[i] + (i < courses.length - 1 ? ", " : "");
        }
        return super.toString() + ", Department: " + department + ", Courses: [" + coursesStr + "]";
    }

    // iii. equals method
    public boolean equals(Teacher t) {
        if (t == null) return false;
        return super.equals(t) && this.department.equals(t.department);
    }
}