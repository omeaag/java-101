package e_oop_polymorphism.encapsulation_printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(5,false);

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current Job Pages: %d , Printer Total: %d %n",
                pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(10);
        System.out.printf("Current Job Pages: %d , Printer Total: %d %n",
                pagesPrinted, printer.getPagesPrinted());


    }
}
