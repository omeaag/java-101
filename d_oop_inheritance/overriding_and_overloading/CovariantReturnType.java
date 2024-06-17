package d_oop_inheritance.overriding_and_overloading;

public class CovariantReturnType extends Object {
}

class Animal{

    protected Animal clone(){ //protected olarak tanımladık. eğer bu metot alt sınıflarda override edilirse protected
        // veya public olarak override edilebilir. private olarak override edilemez.
        return new Animal();
    }
}

class Fish extends Animal{

    private String yuzgecSekli;

    public Fish(String yuzgec){
        this.yuzgecSekli = yuzgecSekli;
    }

    @Override
    public Fish clone() { //override ettiğimiz clone metodunun dönüş tipi üst sınıfta Animal olarak tanımlanmıştır.
        // Override ettiğimiz metodumuzda dönüş tipini Fish olarak belirleyebliiriz. Çünkü Fish classı Animal
        // class'ının alt sınıfıdır. bu geçerli bir override metodudur ve buna covariant return type denir. Alt class
        // seviyesinden bağımsızdır. Kısacası override edilen metotların dönüş tipi ana class'ın dönüş tipinin
        // herhangi bir alt class'ı da olabilir.
        return new Fish(yuzgecSekli);
    }
}

class Hamsi extends Fish{
    public Hamsi(String yuzgec){
        super(yuzgec);
    }

    @Override
    public Hamsi clone() {
        return new Hamsi("yuzgec");
    }

}