public class ConvertDistance {

    public static void main(String[] args) {

        double distanceMeters = 50;

        double distanceFeet;
         
        final double metersToFeet = 0.3048;

        distanceFeet = distanceMeters * metersToFeet;

        System.out.println("50 meters equals  " + distanceFeet + " feet");
    }

}