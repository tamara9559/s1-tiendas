package model;

import java.util.Arrays;

public enum Type {
    UNISEX("unisex"),
    MALE("masculino"),
    FEMALE("femenino")
    ;
    private final String name;


    Type(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public  static Type types(String name) {
        return Arrays.stream(Type.values()).filter(c -> c.equals(name)).findFirst().orElseThrow();
}
}

