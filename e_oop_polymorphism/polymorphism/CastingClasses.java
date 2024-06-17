package e_oop_polymorphism.polymorphism;

public class CastingClasses {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A","Lord of Rings");
        movie.watchMovie();
        System.out.println("-------------------------------------------------------------");
//        Adventure adventureMovie = Movie.getMovie("A","Lord of Rings"); //bu hatalı bir yöntem olur. Çünkü statik
//        olarak belirttiğimiz getMovie yöntemi dönüş türü olan her nesnenin bir Movie türü olacağını garanti
//        etmiştir. Ancak burada Adventure tipindeki adventureMovie değişkeni her Movie türünün kendisinin bir türü
//        olduğunu garanti edemez. burada Movie.getMovie("A","Lord of Rings"); ifadesinde bir Adventure nesnesi
//        döneceği kesindir ancak derleyici bunu çalıştırmadan bilemez. bu çalışma zamanında gerçeklşen bir
//        işlemdir. derleyicinin burada Adventure nesnesi döneceğini bilmesi için class casting yöntemini
//        kullanabiliriz. şöyle:
        System.out.println("-------------------------------------------------------------");
        Adventure adventureMovie = (Adventure) Movie.getMovie("A","Lord of Rings"); //derleyici buradaki class casting
        // işlemiyle dönecek nesnenin türünün Adventure tipinde olacağını düşünür ve geçerli kabul eder.
        adventureMovie.watchMovie();
        System.out.println("-------------------------------------------------------------");
//        Adventure comedyMovieBut = (Adventure) Movie.getMovie("C","Evde tek başına"); //buradaki kodumuz derleme
        // hatası almaz. çünkü tip uyuşmazlığı görünürde yoktur. ancak çalışma zamanında oluşturulan nesne Comedy
        // tipindedir. Comedy tipindeki bir nesneyi Adventure tipine cast işlemi yapamayız bu yüzden çalışma
        // zamanında ClassCastException hatasıyla karşılaşırız.
        adventureMovie.watchMovie();
        System.out.println("-------------------------------------------------------------");
        Object comedy = Movie.getMovie("C","Reco"); //Bu satırda oluşturduğunuz comedy nesnesinin tipi, Object sınıfıdır.
        // Ancak, Movie.getMovie("C","Reco") metodu ile aslında bir Comedy türünde nesne oluşturulmuş ve
        // bu nesne Object türüne yukarı doğru çevrilmiş (upcast) olur.
        // Java’da, bir alt sınıf nesnesi üst sınıf türüne otomatik olarak çevrilebilir.
        // Bu durumda, Comedy nesnesi Object türüne çevrilmiş oluyor.
        //Ancak, Object türündeki bir değişken üzerinden, alt sınıfa özgü metotlara doğrudan erişilemez.
        // Eğer Comedy sınıfına özgü metotları kullanmak istiyorsanız, nesneyi geri Comedy türüne aşağı doğru
        // çevirmeniz (downcast) gerekir.
//        comedy.watchMovie();
//        comedy.watchComedy();
        System.out.println("-------------------------------------------------------------");
        Movie comedy1 = Movie.getMovie("C","Reco");
        // Movie comedy1 = Movie.getMovie("C","Reco"); satırında, comedy1 nesnesi Movie türünde oluşturulmuş ve
        // Movie.getMovie("C","Reco") metodu ile bir Comedy nesnesi döndürülüp Movie türüne yukarı doğru çevrilmiş (upcast edilmiş).
        // Bu durumda, comedy1 değişkeni Movie türündedir ve Movie sınıfının metotlarına erişebilir.
        // Ancak, Comedy sınıfına özgü watchComedy() metodu Movie sınıfında tanımlı değildir.
        // Java’da, bir üst sınıf türündeki referans değişkeni ile alt sınıfa özgü metotlara erişmek için,
        // o referans değişkenini alt sınıf türüne aşağı doğru çevirmeniz (downcast) gerekir.
        // comedy1.watchComedy(); satırında derleme hatası almamızın nedeni,comedy1 değişkeninin Movie türünde olması ve
        // Movie türünde bir değişkenin Comedy sınıfına özgü watchComedy() metoduna doğrudan erişememesidir.
        comedy1.watchMovie();
//        comedy1.watchComedy();
        System.out.println("-------------------------------------------------------------");
        Comedy comedy2 = (Comedy) Movie.getMovie("C","Reco");
        comedy2.watchMovie();
        comedy2.watchComedy();
        System.out.println("-------------------------------------------------------------");
        //var değişken tipi -> Local Variable Type Inference - yerel değişken tip çıkarsaması
        //alan (field) tanımlarında kullanılmaz, parametre türü, yöntemin imzasında dönüş tipi olarak da kullanılmaz
        //atama yapılmadan kullanılmaz, null değer de atanamaz çünkü bir türü çıkaramaz
        var airplane = Movie.getMovie("C","Komedi"); //getMovie(); metodunun imzasından hiçbir şey yöntemden bir
        // Comedy örneğinin döneceğini söylemez. yöntemin dönüş tipi Movie olduğu için var anahtar kelimesi "airplane"
        // değişkeninin tipini otomatik olarak Movie yapar. Movie tipindeki bir değişkenden de yalnızca Movie'nin
        // sağladığı metotlara erişilebilir.
        airplane.watchMovie();
//        airplane.watchComedy();
        System.out.println("-------------------------------------------------------------");
        var airplane1 = (Comedy) Movie.getMovie("C","Komedi"); //Burada Down casting yaparak Movie tipindeki bir
        // dönüşü Comedy tipine çevirdik. var da otomatik olarak airplane değişkeninin tipini Comedy olarak ayarladı.
        airplane1.watchMovie();
        airplane1.watchComedy();

        System.out.println("-------------------------------------------------------------");

        Object unknownObject = Movie.getMovie("C","Komedi");
        System.out.println(unknownObject.getClass().getSimpleName());
        if (unknownObject.getClass().getSimpleName().equals("Comedy")){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction sfmovie) {
            sfmovie.watchScienceFiction();
        }
        System.out.println(unknownObject.getClass().getSimpleName());
    }
}
