//date: 07/0702026
class Base {
    int a;
    void show1(){
        a = 1;
        System.out.print("Base Class");
    }
}

class Derived extends Base{
    void show(){
        System.out.println("Derived Class"+a);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args){
        Derived s = new Derived();

        s.show1();


    }
}