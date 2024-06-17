package e_oop_polymorphism.polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie theMovie = new Adventure("Inception");
        theMovie.watchMovie();
        //Java'da bir nesne, hangi sınıftan oluşturulduysa, getClass() metodu her zaman o sınıfı döndürür.
        // Bu nedenle, Movie sınıfının watchMovie metodunda this.getClass().getSimpleName() ifadesi,
        // Advanture sınıfının adını döndürür, çünkü nesne aslında Advanture sınıfındandır.

        Movie movie = Movie.getMovie("comedy","ölümlü dünya");
        movie.watchMovie();

        Movie theMovie2 = Movie.getMovie("Science Fiction", "Dune");
        theMovie2.watchMovie();

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Enter movie type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction, or Q for quit): ");
            String type = scanner.nextLine();
            if("Qq".contains(type)){
                break;
            }
            String title = scanner.nextLine();
            Movie newMovie = Movie.getMovie(type,title);
            newMovie.watchMovie();
        }
    }
}
