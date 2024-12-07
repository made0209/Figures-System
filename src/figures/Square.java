package figures;

public class Square {
    private int length;

    public Square() {
    }

    public void printSquare() {
        for(int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    //method that draws a Square
    public void drawSquare() {
        System.out.println("Drawing a Square with length: " + length + "\n");
        System.out.println("======================");
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("======================");
        System.out.println("Area: " + calculateArea());
        System.out.println("======================");
        //print square
        printSquare();
    }

    public int calculatePerimeter() {
        return length * 4;
    }

    public int calculateArea() {
        return length * length;
    }

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
