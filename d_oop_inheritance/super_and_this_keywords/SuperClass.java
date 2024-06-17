package d_oop_inheritance.super_and_this_keywords;

public class SuperClass {

    public void print(){
        System.out.println("this is SuperClass");
    }

    public Number getNumber(){
        return 10;
    }
}

class SubClass extends SuperClass{
    @Override
    public void print() {
//        print(); //sonsuz döngüye yol açar
        super.print();
        System.out.println("this is SubClass");
    }

    @Override
    public Integer getNumber() {
        return 7;
    }
}

class Main {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.print();
    }
}

