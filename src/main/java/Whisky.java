public class Whisky {

    private String name;
    private int age;
    private WhiskyType whiskyType;

    public Whisky(String name, int age, WhiskyType whiskyType){
        this.name = name;
        this.age = age;
        this.whiskyType = whiskyType;
    }

    public WhiskyType getWhiskyType(){
        return this.whiskyType;
    }
}
