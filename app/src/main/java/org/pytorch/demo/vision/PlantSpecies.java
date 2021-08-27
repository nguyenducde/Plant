package org.pytorch.demo.vision;

public class PlantSpecies {
    public int backgroundLeft;
    public int backgroundRight;
    public String nameLeft;
    public String nameRight;

    public PlantSpecies(int backgroundLeft, String nameLeft, int backgroundRight, String nameRight) {
        this.backgroundLeft = backgroundLeft;
        this.backgroundRight = backgroundRight;
        this.nameLeft = nameLeft;
        this.nameRight = nameRight;
    }
}
