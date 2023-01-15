package AllInterfaces;

public interface Interface1 {


    Interface1 M1();
    Interface1 M2();

    default void M5(){
        System.out.println("Default M in interface");
    }

}
