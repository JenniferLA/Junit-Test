import java.util.ArrayList;

// The id should be a long number used to represent a "unique user" in our application.
// The name is a String that holds the name of the student.
// The grades is an ArrayList that contains a list of Integer numbers.
public class Student {
    private long id;
    private String name;

    private ArrayList<Integer> grades;

    // The Student class should have a constructor that sets both the name and id property, it initializes the grades property as an empty ArrayList.
    public Student(long id, String name, ArrayList<Integer> grades) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    //Getters and Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    // The Student class should have the following methods:
    // returns the student's id
    public long getId() {
        return id;
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(int [] nums) {
        double sum = 0;
        // loop thru the array
        for (int num : nums) {
            // add each element to the sum
            sum += num;
        }
        // return the sum / # of elements in the array
        return sum / nums.length;
    }


    // BONUS: Go ahead and try to add the rest of the CRUD tests and functionality.
    // Write the methods for updateGrade() and deleteGrade() in the Student class.

    // updateGrade() method
    public void updateGrade(int index, int newGrade) {
        if(index >= 0 && index < grades.size()) {
            grades.set(index, newGrade);
        } else {
            System.out.println("Invalid Index");
        }
    }

    // deleteGrade() method
    public void deleteGrade(int grade) {
        this.grades.remove(grade);
    }
}

