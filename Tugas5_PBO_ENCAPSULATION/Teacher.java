/**
 *
 * @author akmal
 */
public class Teacher extends Person{
    private int numCourses;
    private String[] courses;
    private static final int MAX_Courses = 5;
    
    public Teacher(String Name, String Address){
        super(Name, Address);
        numCourses = 0;
        courses = new String[MAX_Courses];
    }
    
    @Override
    public String toString(){
        return "Teacher:\n" + super.toString();
    }
    
    public boolean addCourse(String course){
        for(int i = 0; i < numCourses; ++i){
            if(courses[i].equals(course)) return false;
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }
    
    public boolean removeCourse(String course){
        boolean found = false;
        int courseIndex = -1;
        for(int i = 0; i < numCourses; ++i){
            if(courses[i].equals(course)){
                courseIndex = i;
                found = true;
                break;
            }
        }
        if(found){
            for(int i = courseIndex; i < numCourses; i++){
                courses[i] = courses[i+1];
            }
            numCourses--;
            return true;
        } else {
            return false;
        }
    }
}
