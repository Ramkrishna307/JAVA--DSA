package Question;
import java.util.*;


class Studentnew {
	// instance member variables
	String Name;
	int Age;
	// parameterized constructor
	public Studentnew(String Name, Integer Age)
	{
	this.Name = Name;
	this.Age = Age;
	}
	public String getName() { return Name; }
	public void setName(String Name) { this.Name = Name; }
	public Integer getAge() { return Age; }
	public void setAge(Integer Age) { this.Age = Age; }
	// overriding toString() method
	@Override public String toString()
	{
	return "Customer{"
	+ "Name=" + Name + ", Age=" + Age + '}';
	}
	static class CustomerSortingComparator
	implements Comparator<Studentnew> {
	@Override
	public int compare(Studentnew customer1,
	Studentnew customer2)
	{
	// for comparison
	int NameCompare = customer1.getName().compareTo(
	customer2.getName());
	int AgeCompare = customer1.getAge().compareTo(
	customer2.getAge());
	// 2-level comparison
	return (NameCompare == 0) ? AgeCompare
	: NameCompare;
	}
	}

public class newStudent {
	public static void main(String[] args)
	{
	// create ArrayList to store Student
	List<Studentnew> al = new ArrayList<>();
	// create customer objects using constructor
	// initialization
	Studentnew obj1 = new Studentnew("suresh", 27);
	Studentnew obj2 = new Studentnew("vibha", 25);
	Studentnew obj3 = new Studentnew("Sarika", 37);
	Studentnew obj4 = new Studentnew("suresh", 32);
	Studentnew obj5 = new Studentnew("suresh", 29);
	Studentnew obj6 = new Studentnew("vibha", 32);
	// add customer objects to ArrayList
	al.add(obj1);
	al.add(obj2);
	al.add(obj3);
	al.add(obj4);
	al.add(obj5);
	al.add(obj6);
	// before Sorting arraylist: iterate using Iterator
	Iterator<Studentnew> custIterator = al.iterator();
	System.out.println("Before Sorting:n");
	while (custIterator.hasNext()) {
	System.out.println(custIterator.next());
	}
	// sorting using Collections.sort(al, comparator);
	Collections.sort(al,
	new CustomerSortingComparator());
	// after Sorting arraylist: iterate using enhanced
	// for-loop
	System.out.println("nnAfter Sorting:n");
	for (Studentnew customer : al) {
	System.out.println(customer);
	}
	}
	}

}


