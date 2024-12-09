package com.lavish;

public class ArrayLocation {
    private double[] coords;

    public ArrayLocation(double[] coordsIn){
        this.coords = coordsIn;
    }

    public static void main(String[] args) {
        double[] coordsParam = {5.0, 0.0};
        ArrayLocation accra = new ArrayLocation(coordsParam);
        coordsParam[0] = 32.9;
        coordsParam[1] = -117.2;
        System.out.println(accra.coords[0]);
    }
}
