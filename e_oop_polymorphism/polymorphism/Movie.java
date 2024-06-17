package e_oop_polymorphism.polymorphism;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();//this -> nesnenin oluşturulduğu sınıfı döndürür.
        System.out.println(title+ " is a " + instanceType + " film");
    }

    public static Movie getMovie(String type,String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie{
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie(); //Movie classının watchMovie metodu çalışacak ancak this.getClass() ifadesi Advanture
        // sınıfını döndürecek. çünkü nesnenin oluşturulduğu sınıfı döndürür.
    }
    public void watchAdventure(){
        System.out.println("This is an adventure film");
    }
}

class Comedy extends Movie{
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie(); //Movie classının watchMovie metodu çalışacak ancak this.getClass() ifadesi Advanture
        // sınıfını döndürecek. çünkü nesnenin oluşturulduğu sınıfı döndürür.
    }
    public void watchComedy(){
        System.out.println("This is a Comedy film");
    }
}

class ScienceFiction extends Movie{
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie(); //Movie classının watchMovie metodu çalışacak ancak this.getClass() ifadesi Advanture
        // sınıfını döndürecek. çünkü nesnenin oluşturulduğu sınıfı döndürür.
    }

    public void watchScienceFiction(){
        System.out.println("This is a Science Fiction film");
    }
}
