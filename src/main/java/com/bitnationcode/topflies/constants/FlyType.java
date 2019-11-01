package com.bitnationcode.topflies.constants;

public enum FlyType {

    DRY(1, "Dry Fly"),
    WET(2, "Wet Fly"),
    STREAMER(3, "Streamer"),
    POPPER(4, "Popper");

    private int id;
    private String description;

    private FlyType(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public static FlyType getFlyTypeFromInt(Integer intValue) {
        if (null == intValue) {
            throw new IllegalArgumentException("No matching type for id!");
        }
        for (FlyType idType : FlyType.values()) {
            if (intValue.equals(idType.getId())) {
                return idType;
            }
        }
        throw new IllegalArgumentException("No matching type for id: " + intValue);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
