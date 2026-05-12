package package1;



public class Polymorph extends Overload{

    @Override
    public int number(int num1){
        num1 = 5;
        return num1;
    }





    public static void main (String[] Args){
        Integer value = 8;
        System.out.println(value.getClass());
    }
}

