package fine;
import java.util.*;
public interface StudentService {
  public Map<String,Student> Student_List = new HashMap<>();
  public void addStudent(Scanner sc);
  public void get_StudentList();
  public void setfine(String name,int fees);
  public void viewfine(Scanner sc);
  public void payFine(Scanner sc);
  
}
