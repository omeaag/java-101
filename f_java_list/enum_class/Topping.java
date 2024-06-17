package f_java_list.enum_class;

public enum Topping {
    MUSTARD,
    PICKLES,
    BACON,
    CHEDDAR,
    TOMATO;

    public double getPrice(){
        return switch (this){
            case MUSTARD -> 1.5;
            case PICKLES -> 2.0;
            case BACON -> 1.0;
            default -> 0.0;
        };
    }
}
