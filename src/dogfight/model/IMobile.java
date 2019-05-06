package jpu2016.dogfight.model;

public interface IMobile {
    public Direction getDirection() {
    return Direction;
    }

    public void setDirection(Direction direction) {
    }

    public Point getPosition() {
       return Position;
    }

    public Dimension getDimension() {
        return Dimension;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getSpeed() {
    return Speed;
    }

    public Image getImage() {
    return Image;
    }

    public void move() {
    }

    public void placeInArea(IArea area) {
    }

    public boolean isPlayer(int player) {
    }

    public void setDogfightModel(DogfightModel dogfightModel) {
    }

    public boolean hit() {
    }

    public boolean isWeapon() {
    }

}