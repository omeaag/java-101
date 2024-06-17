package e_oop_polymorphism.composition;

public class PersonalComputer extends Product{
    private Monitor monitor;
    private ComputerCase computerCase;
    private MotherBoard motherBoard;

    public PersonalComputer(String model, String manufacturer, Monitor monitor,
                            ComputerCase computerCase, MotherBoard motherBoard) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.computerCase = computerCase;
        this.motherBoard = motherBoard;
    }

    public void display(){
        monitor.drawPixelAt(1200,45,"green");

    }

    public void powerUp(){
        computerCase.pressPowerSupply();
        display();
    }

//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
}
