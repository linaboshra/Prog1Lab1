public class APRectangle {

    public static void main(String[] args) {

        int length = 5;
        int width = 3;

        int area, perimeter;

        area = length * width;
        perimeter = (2*length) + (2*width);

        System.out.println("The area of this rectangle equals " + area);
        System.out.println("The perimeter of this rectangle equals " + perimeter);
    }

}