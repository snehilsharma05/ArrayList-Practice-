import java.util.*;
class Student{
    int roll;
    String name;
    Student(int r,String n)
    {
        roll = r;
        name = n;
    }
    public String toString()
    {return roll+" "+name;}
}
public class MyClass2 {
    public static void main(String args[]) {
     ArrayList<Student> al = new ArrayList<>();
     al.add(new Student(101,"Snehil"));
     al.add(new Student(102,"Sahil"));
     al.add(new Student(103,"Mohit"));
     al.add(new Student(104,"Satvik"));
     System.out.println("Using Iterator:");
     Iterator <Student>itr = al.iterator();
     while(itr.hasNext()){
         Student s = itr.next();
         System.out.println(s);
     }
     System.out.println();
     System.out.println("Using For-Each Loop:");
     for(Student s1:al)
     System.out.println(s1);
    }
}