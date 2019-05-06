package jpu2016.dogfight.model;

public class Position extends Mobile{
    private double x;
    private double y;
    private double maxX;
    private double maxY;


    protected void setMaxX(double maxX){
        this.maxX=maxX;
    }
    protected void setMaxY(double maxY){
        this.maxY=maxY;
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


}