package org.example.box;

public class Box {
    private int length;
    private int height;
    private int width;

    public Box(int length, int height, int width) throws IncorrectBoxDimensionsException {
        if (length <= 0){
            throw new IncorrectBoxDimensionsException("Length должна быть > 0, а у тебя "+length);
        }

        if (height <= 0){
            throw new IncorrectBoxDimensionsException("height должна быть > 0, а у тебя "+height);
        }

        if (width <= 0){
            throw new IncorrectBoxDimensionsException("width должна быть > 0, а у тебя "+width);
        }

        this.length = length;
        this.height = height;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
