package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {


    public static void main(String[] args){

        List<Students> lst = new ArrayList<>();
        lst.add(new Students (5, "IG5", 50.1));
        lst.add(new Students (3, "IG3", 30.1f));
        lst.add(new Students (1, "IG1", 10.4));
        lst.add(new Students (2, "IG2", 20.4));
        lst.add(new Students (4, "IG4", 40.4f));

        System.out.println("Sorting via 'By Default- Int': compareTo(): ");
        Collections.sort(lst);
        for(Students student: lst){
            System.out.println("Roll No: "+student.getRolNo()+" | Name: "+student.getName());
        }

        System.out.println("Sorting via 'compare(): Name: ");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(lst, nameCompare);
        for(Students student: lst){
            System.out.println("Roll No: "+student.getRolNo()+" | Name: "+student.getName()+" | Marks: "+student.getMarks());
        }

        System.out.println("Sorting via 'compare(): Marks: ");
        MarksCompare marksCompare = new MarksCompare();
        Collections.sort(lst, marksCompare);
        for(Students student: lst){
            System.out.println("Roll No: "+student.getRolNo()+" | Name: "+student.getName()+" | Marks: "+student.getMarks());
        }
    }




}
