package E_OOP_Polymorphism.Composition;

public class Main {
    public static void main(String[] args) {

        ComputerCase computerCase = new ComputerCase("4356","acer","265");
        Monitor monitor = new Monitor("24inch Curved","Asus",24,"1920*1080");
        MotherBoard motherBoard = new MotherBoard("TJ890-Bazooka",
                "MSI",3,2,"V14.3");

        PersonalComputer personalComputer = new PersonalComputer("T-109",
                "Monster",monitor,computerCase,motherBoard);

        //dışarıdan sınıfımızın içini bu şekilde doğrudan yansıtmak, erişir kılmak doğru değildir.
        //bunun için yöntemler oluşturacağız, ve dışarıdan sadece yöntemler kullanılarak işlem gerçekleşecek,
        // içeride işlemlerin ne şekilde gerçekleştiğini kullanıcı bilemeyecek.
//        personalComputer.getComputerCase().pressPowerSupply();
//        personalComputer.getMotherBoard().loadProgram("Paint");
//        personalComputer.getMonitor().drawPixelAt(5,10,"white");

        personalComputer.powerUp();

    }
}
