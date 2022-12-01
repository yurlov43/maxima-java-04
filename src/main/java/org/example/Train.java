package org.example;

public class Train extends Transport {
    private String id;
    private int carriageCount;
    private boolean isExpress;

    public Train(String name, int capacity, int speed, float costOfKm) {
        super(name, capacity, speed, costOfKm);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCarriageCount() {
        return carriageCount;
    }

    public void setCarriageCount(int carriageCount) {
        this.carriageCount = carriageCount;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    public float getPrice(City city) {
        return 0;
    }
}
