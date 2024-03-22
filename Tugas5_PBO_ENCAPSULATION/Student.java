/**
 *
 * @author akmal
 */
public class Student extends Person{
    private int numCourses;
    private String[] courses;
    private int[] grades;
    private static final int MAX_Courses = 30;
    
    public Student(String Name, String Address){
        super(Name, Address);
        numCourses = 0;
        courses = new String[MAX_Courses];
        grades = new int[MAX_Courses];
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return
                "Name     :" + super.Name + 
                "\nAddress  :" + super.Address;
    }
    
    public void addCourseGrade(String course, int grade){
        courses[numCourses] = course;
        grades[numCourses] = grade;
        ++numCourses;
    }
    
    public void printGrade(){
        System.out.print(this);
        for(int i = 0; i <  numCourses; ++i){
            System.out.print("\n" + courses[i] + " : " + grades[i]);
        }
        System.out.println("");
    }
    
    public double getAverageGrade(){
        int sum = 0;
        for(int i = 0;i < numCourses; i++){
            sum += grades[i];
        }
        return (double)sum/numCourses;
    }
}
