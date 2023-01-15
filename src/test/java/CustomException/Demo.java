package CustomException;

public class Demo {

    public static void main(String[] args){

        try{
            throw new Exception("Throwing Exception");
        }
        catch (MyException e1){
            System.out.println(e1.getMessage());
//            e1.printStackTrace();
        }
        catch (Exception e2){
            System.out.println(e2.getMessage());
           // e2.printStackTrace();
        }
    }
}
