package model;

import java.util.Arrays;

public enum Type {
    UNISEX(0),
    MALE(1),
    FEMALE(2)
    ;
    private final int identifier;


    Type(int identifier) {
        this.identifier = identifier;
    }

    public int getName() {
        return identifier;
    }

    public  static Type types(int identifier) {
        return Arrays.stream(Type.values())
                .filter(c -> c.identifier==identifier)
                .findFirst()
                .orElseThrow();
}
}

