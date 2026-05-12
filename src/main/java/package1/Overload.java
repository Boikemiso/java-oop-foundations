package package1;

public class Overload {
    public int number(int num1){
        num1 = 0;
        return num1;
    }
    //Overloading
    public int number(int num3, int num5){
        num3 = 6;
        return num3;
    }

    public static void main(String[] Args){
        Overload overload = new Overload();
        //Instance is different copies amongst different members
        //Static is one copy shared among many members
        overload.number(2, 6);
    }
}
