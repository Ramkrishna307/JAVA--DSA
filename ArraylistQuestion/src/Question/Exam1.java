//package Question;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Iterator;
//import java.util.List;
//public class Exam1 {
//	
//	
//	// instance member variables
//	String Name;
//	int Age;
//	// parameterized constructor
//	public Exam1(String Name, Integer Age)
//	{
//	this.Name = Name;
//	this.Age = Age;
//	}
//	public String getName() { return Name; }
//	public void setName(String Name) { this.Name = Name; }
//	public Integer getAge() { return Age; }
//	public void setAge(Integer Age) { this.Age = Age; }
//	
//	
//	// overriding toString() method
//	@Override public String toString()
//	{
//	return "Customer{"
//	+ "Name=" + Name + ", Age=" + Age + '}';
//	}
//	
//	static class CustomerSortingComparator
//	implements Comparator<Exam1> {
//	@Override
//	public int compare(Exam1 customer1,
//	Exam1 customer2)
//	{
//	// for comparison
//	int NameCompare = customer1.getName().compareTo(
//	customer2.getName());
//	int AgeCompare = customer1.getAge().compareTo(
//	customer2.getAge());
//	// 2-level comparison
//	return (NameCompare == 0) ? AgeCompare
//	: NameCompare;
//	}
//	}
//
//	// create ArrayList to store Student
//		List<Exam1> al = new ArrayList<>();
//		// create customer objects using constructor
//		// initialization
//		Exam1 obj1 = new Exam1("suresh", 27);
//		Exam1 obj2 = new Exam1("vibha", 25);
//		Exam1 obj3 = new Exam1("Sarika", 37);
//		Exam1 obj4 = new Exam1("suresh", 32);
//		Exam1 obj5 = new Exam1("suresh", 29);
//		Exam1 obj6 = new Exam1("vibha", 32);
//		// add customer objects to ArrayList
//		al.add(obj1);
//		al.add(obj2);
//		al.add(obj3);
//		al.add(obj4);
//		al.add(obj5);
//		al.add(obj6);
//		// before Sorting arraylist: iterate using Iterator
//		Iterator<Exam1> custIterator = al.iterator();
//		System.out.println("Before Sorting:n");
//		while (custIterator.hasNext()) {
//		System.out.println(custIterator.next());
//		}
//		// sorting using Collections.sort(al, comparator);
//		Collections.sort(al,
//		new CustomerSortingComparator());
//		// after Sorting arraylist: iterate using enhanced
//		// for-loop
//		System.out.println("nnAfter Sorting:n");
//		for (Exam1 customer : al) {
//		System.out.println(customer);
//		}
//		}


package Question;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Exam1 {

    // instance member variables
    String Name;
    int Age;

    // parameterized constructor
    public Exam1(String Name, Integer Age) {
        this.Name = Name;
        this.Age = Age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer Age) {
        this.Age = Age;
    }

    // overriding toString() method
    @Override
    public String toString() {
        return "Customer{" + "Name=" + Name + ", Age=" + Age + '}';
    }

    static class CustomerSortingComparator implements Comparator<Exam1> {
        @Override
        public int compare(Exam1 customer1, Exam1 customer2) {
            // for comparison
            int NameCompare = customer1.getName().compareTo(customer2.getName());
            int AgeCompare = customer1.getAge().compareTo(customer2.getAge());
            // 2-level comparison
            return (NameCompare == 0) ? AgeCompare : NameCompare;
        }
    }

    public static void main(String[] args) {
        // create ArrayList to store Student
        List<Exam1> al = new ArrayList<>();
        // create customer objects using constructor initialization
        Exam1 obj1 = new Exam1("suresh", 27);
        Exam1 obj2 = new Exam1("vibha", 25);
        Exam1 obj3 = new Exam1("Sarika", 37);
        Exam1 obj4 = new Exam1("suresh", 32);
        Exam1 obj5 = new Exam1("suresh", 29);
        Exam1 obj6 = new Exam1("vibha", 32);
        // add customer objects to ArrayList
        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        al.add(obj4);
        al.add(obj5);
        al.add(obj6);
        // before Sorting arraylist: iterate using Iterator
        Iterator<Exam1> custIterator = al.iterator();
        System.out.println("Before Sorting:\n");
        while (custIterator.hasNext()) {
            System.out.println(custIterator.next());
        }
        // sorting using Collections.sort(al, comparator);
        Collections.sort(al, new CustomerSortingComparator());
        // after Sorting arraylist: iterate using enhanced for-loop
        System.out.println("\nAfter Sorting:\n");
        for (Exam1 customer : al) {
            System.out.println(customer);
        }
    }
}


