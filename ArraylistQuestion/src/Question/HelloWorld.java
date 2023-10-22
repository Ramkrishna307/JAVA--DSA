package Question;

//You are using Java
import java.util.*;
import java.io.*;

class Student1111{
 private int rollnumber;
 private String name;
 private int age;
 
 public Student1111(int rollnumber,String name,int age){
     this.rollnumber=rollnumber;
     this.name=name;
     this.age=age;
 }
 
 public int getRollNumber(){
     return rollnumber;
 }
 
 public String getName(){
     return name;
 }
 
 public int getAge(){
     return age;
 }
}

class NameComparator implements Comparator<Student1111>{
 public int compare(Student1111 s1,Student1111 s2){
     return s1.getName().compareTo(s2.getName());
 }
 
}
class AgeComparator implements Comparator<Student1111>{
    public int compare(Student1111 s1,Student1111 s2){
        return s1.getAge() - s2.getAge();
    }
}


class HelloWorld {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     ArrayList<Student1111> ar=new ArrayList<>();
     int n=sc.nextInt();
     sc.nextLine();
     for(int i=0;i<n;i++){
         System.out.println("Enter the Students record");
         int roll=sc.nextInt();
         sc.nextLine();
         String str=sc.nextLine();
         int age=sc.nextInt();
         ar.add(new Student1111(roll,str,age));
     }
     System.out.println("Sort by name:");
     Collections.sort(ar,new NameComparator());
     
     for(Student1111 st:ar){
         System.out.println(st.getRollNumber()+" "+st.getName()+" "+st.getAge());
     }    
     System.out.println("Record of the student with the largest age:");
     Collections.sort(ar,new AgeComparator());
     Student1111 largestAgeStudent = ar.get(ar.size() - 1);
     System.out.println(largestAgeStudent.getRollNumber() + " " + largestAgeStudent.getName() + " " + largestAgeStudent.getAge());
   
     sc.close();
 
 }
 }

