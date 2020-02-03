public class ConvertMoney {

    public static void main(String[] args) {

        double valueCAD = 50;

        double valueUSD, valueEUR;
         
        valueUSD = valueCAD * 0.76;
        valueEUR = valueCAD * 0.68;

        System.out.println(+ valueCAD + " Canadian dollars convert to "+ valueUSD + " United State dollars");
        System.out.println(+ valueCAD + " Canadian dollars convert to "+ valueEUR + " Euros");
    }

}