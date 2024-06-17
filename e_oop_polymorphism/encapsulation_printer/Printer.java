package e_oop_polymorphism.encapsulation_printer;

public class Printer {
    private int tonerLevel;
    private boolean duplex;
    private int pagesPrinted;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount){
        tonerLevel += tonerAmount;
        if(tonerLevel < 0 || tonerLevel > 100){
            tonerLevel = 0;
            return -1;
        }
        return tonerLevel;
    }

    public int printPages(int pages){
        if(pages < 0){
            return -1;
        }
        int jobPages = duplex ? (pages/2) + (pages%2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }
}
