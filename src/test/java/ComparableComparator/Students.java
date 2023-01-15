package ComparableComparator;

public class Students implements Comparable<Students> {

    private int rolNo;
    private String name;
    private double marks;


    Students(int rollNo, String name, double marks) {
        this.rolNo=rollNo;
        this.name=name;
        this.marks=marks;
    }

    public int getRolNo() {
        return rolNo;
    }

    public String getName(){
        return this.name;
    }
    public double getMarks(){
        return this.marks;
    }

    @Override
    public int compareTo(Students o) {
        return this.rolNo - o.rolNo;
    }
}
