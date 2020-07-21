package Introduction;

public class TempConverter {
    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//
//        System.out.print("What Fahrenheit Temperature do you want to convert?: ");
//        double toConvert = reader.nextDouble();
//
//        double celsius = ((toConvert - 32) * 5) / 9;
//
//        System.out.println("Your new temperature is " + celsius + " Degrees Celsius!");
        
        double newTemp = tempConverterDouble(212);
    }
    
    public static void tempConverter(double toConvert) {
        double celsius = ((toConvert - 32) * 5) / 9;
    
        System.out.println("Your new temperature is " + celsius + " Degrees Celsius!");
    }
    
    public static double tempConverterDouble(double toConvert) {
        return ((toConvert - 32) * 5) / 9;
    }
}
