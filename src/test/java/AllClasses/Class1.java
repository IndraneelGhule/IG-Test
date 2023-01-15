package AllClasses;

import AllInterfaces.Interface1;

public class Class1 implements Interface1 {


    @Override
    public Interface1 M1() {
        System.out.println("M1: Class1");
        return null;
    }

    @Override
    public Interface1 M2() {
        System.out.println("M2: Class1");
        return null;
    }


    String[] args= new String[5];
    public static void main(String[] args)
    {
        System.out.println("1: "+args.length);


        Interface1 i1 = new Class1();
        i1.M1();
        i1.M5();




    }

    public static void M3(){
        Class1.main(new String[11]);

    }



}
