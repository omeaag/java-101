package B_ExpressionAndStatement;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kilobytes){
//        if(kilobytes < 0){
//            System.out.println("invalid value");
//        }else{
//            int megaByte = kilobytes / 1024;
//            int kalanKilobytes = kilobytes % 1024;
//            System.out.println(kilobytes +" KB = "+ megaByte + " MB and " + kalanKilobytes + " KB");
//        }
        if(kilobytes < 0){
            System.out.println("invalid value");
            return;
        }
        int megaByte = kilobytes / 1024;
        int kalanKilobytes = kilobytes % 1024;
        System.out.println(kilobytes +" KB = "+ megaByte + " MB and " + kalanKilobytes + " KB");

    }

    public static void printMegaBytesAndKiloBytes1(int kiloBytes){

        int megaBytes = kiloBytes / 1024;
        int kalanKiloBytes = kiloBytes % 1024;

        System.out.println((kiloBytes >= 0) ? kiloBytes + " KB = " + megaBytes + " MB and " +
                kalanKiloBytes + " KB": "Invalid Value" );
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5200);
        printMegaBytesAndKiloBytes1(5200);
    }
}
