package b_expression_and_statement;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){

        long conversion = Math.round(kilometersPerHour/1.609);

        // if(kilometersPerHour >= 0){
        //     return conversion;
        // }
        // return -1;

        return kilometersPerHour < 0 ? -1 : conversion;
    }
    public static void printConversion(double kilometersPerHour){

        long milesPerHour  = toMilesPerHour(kilometersPerHour);

        // if(milesPerHour  < 0){
        //     System.out.println("Invalid Value");
        // }else{
        //     System.out.println(kilometersPerHour + " km/h = " + milesPerHour  + " mi/h");
        // }
        System.out.println(kilometersPerHour < 0 ? "Invalid Value" : kilometersPerHour + " km/h = " +
                milesPerHour  + " mi/h");
    }

    public static void main(String[] args) {
        printConversion(523);
    }
    //Java’da Math.round metodu, bir sayıyı en yakın tam sayıya yuvarlar.
    // Bu metodun özellikleri ve float ve double tipleriyle nasıl çalıştığına dair ayrıntılar aşağıda verilmiştir:

    //Math.round metodu, bir sayıyı en yakın tam sayıya yuvarlar.
    //Metodun sözdizimi şu şekildedir:
    //public static long round(double number)
    //public static int round(float number)1
    //Parametre olarak bir sayı alır. Bu sayının veri tipi float veya double olmalıdır.
    //Eğer argüman double ise, sonuç long türünde; eğer argüman float ise, sonuç int türünde döner.
    // float numbers

//    float x = 4567.9874f;
//    System.out.println(Math.round(x));  // Output: 4568
//
//    float y = -3421.134f;
//    System.out.println(Math.round(y));  // Output: -3421
//
//    double z = 1234.5678;
//    System.out.println(Math.round(z));  // Output: 1235

// Bu örneklerde, Math.round metodu float ve double değerlerini en yakın tam sayıya yuvarlar.
// float için en yakın int değeri, double için ise en yakın long değeri döndürülür.
}
