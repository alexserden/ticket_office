package model;

public class Airport extends IdEntity{

    String  name;


    public Airport(Long id, String name) {
        super(id);
        this.name = name;
    }


}
