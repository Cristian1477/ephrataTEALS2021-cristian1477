public class Temperature {
    public static void main(String[] args) {
   double fahrenheit;
   fahrenheit = 95;
   double celsius;
   celsius = 0;
   double convertToCelsius;
   double convertToFahrenheit;
   convertToCelsius = (fahrenheit - 32) * 5.0/9.0;
   convertToFahrenheit = (celsius * 9.0/5.0) + 32;
   System.out.println(fahrenheit + " fanhrenheit" + " equals " + convertToCelsius + " celsius");
   System.out.println(celsius + "celsius " + "equals " +convertToFahrenheit + " fahrenheit");
    }
}
