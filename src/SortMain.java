import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;


public class SortMain {
	public static void main(String[] args) {
	List<EmployeeSort> emp = new ArrayList<>();
	 
	  emp.add(new EmployeeSort(46391, "Tharun", 23));
	  emp.add(new EmployeeSort(46392, "Vijay", 22));
	  emp.add(new EmployeeSort(46394, "Pranay", 23));
	 
	  System.out.println("Before sorting  list of employees : ");
	  Iterator<EmployeeSort> it = emp.iterator();
	  while (it.hasNext()) {
	   System.out.println(it.next());
	  }
	  Collections.sort(emp);
	 
	  System.out.println("After sorting  list of employees : ");
	  it = emp.iterator();
	  while (it.hasNext()) {
	   System.out.println(it.next());
	  }
	 
	

}
}
