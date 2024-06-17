package a_starting_java;

public class CharAndBoolean {
    public static void main(String[] args) {
        //'D' karakteri ataması
        char MyChar = 'D'; //char tipine karakter ataması (tek bir karakter tek tırnak arasında tutar.)
        char MyChar1 = '\u0044'; // unicode ile karakter atama
        char MyChar2 = 68; //karakterin sayısal değeri ile atama MyChar2 = 'D' olur.

        //hepsi soru işareti atamasıdır
        char karakter = '?';
        char karakter1 = '\u003F';
        char karakter2 = 63;

        System.out.println("My values are " + karakter + karakter1 + karakter2); //output -> My values are ???
    }
}
