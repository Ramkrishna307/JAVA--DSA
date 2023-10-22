package dataStrCollection;
//You are using Java
import java.util.*;
import java.io.*;

class Student{
 private int rollnumber;
 private String name;
 private int age;
 
 public Student(int rollnumber,String name,int age){
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

class NameComparator implements Comparator<Student>{
 public int compare(Student s1,Student s2){
     return s1.getName().compareTo(s2.getName());
 }
 
}

class HelloWorld {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     ArrayList<Student> ar=new ArrayList<>();
     int n=sc.nextInt();
     sc.nextLine();
     for(int i=0;i<n;i++){
         System.out.println("Enter the Students record");
         int roll=sc.nextInt();
         sc.nextLine();
         String str=sc.nextLine();
         int age=sc.nextInt();
         ar.add(new Student(roll,str,age));
     }
     System.out.println("Sort by name:");
     Collections.sort(ar,new NameComparator());
     
     for(Student st:ar){
         System.out.println(st.getRollNumber()+" "+st.getName()+" "+st.getAge());
     }    
 }
}








