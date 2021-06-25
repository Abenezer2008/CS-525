package factory;

public abstract class Pizza {
    String name;
    Pizza(String name){
        this.name = name;
    }

    void prepare(){

    }
    void bake(){

    }

    void cut(){

    }

    void box(){

    }

    public String getName(){
        return name;
    }
}
