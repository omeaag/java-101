package d_oop_inheritance;

public class NewClass {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("-------------------------------------------------------");
        Student student2 = new Student();
    }

}

class Interview{
    Interview(){
        System.out.println("mülakata hoş geldiniz - Interview class");
    }
}

class Student extends Interview{
    static { // Statik blok sınıf ilk kez yüklendiğinde çalışır. diğer yüklemelerde çalışmaz.
        System.out.println("Student static çalıştı");
    }

    Student(){
        System.out.println("Student class boş constructor çalıştı");
    }

    Student(int x){
        super();
        System.out.println("Student class parametreli constructor çalıştı. parametre: "+x);
    }
}

//class Hospital{
//    private static int doctors;
//    public final static int NURSES = 10;
//    protected double salaries;
//
//    private Hospital(){
//
//    }
//
//    public Hospital(int doctors, int nurses){
//        this.doctors = doctors;
////        this.NURSES = nurses;
//    }
//
//    public Hospital(int doctors){
//        this.doctors = doctors;
//    }
//
//    public Hospital(double salaries){
//        this.salaries = salaries;
//    }
//
//    @Override
//    public String toString() {
//        return "Hospital{" +
//                "salaries=" + salaries +
//                '}';
//    }
//}
