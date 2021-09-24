/*
celsiusToFahrenheit:
parameters: celsuis measurement
parameter type: double
return: double fahrenheit measurement

fahrenheitToCelsius:
parameters: fahrenheit measurement
parameter type: double
return: double celsius measurement
*/

public class CtoFTester {
  public static double celsiusToFahrenheit(double c) {
    double f = (c * 9.0 / 5.0) + 32.0;
    return f;
  }

  public static double fahrenheitToCelsius(double f) {
    double c = (f - 32.0) * (5.0 / 9.0);
    return c;
  }

  public static void main(String[] args) {
    double testValue = 22.5;
    System.out.println(testValue + "ºC = " + celsiusToFahrenheit(testValue) + "ºF");
    System.out.println(testValue + "ºF = " + fahrenheitToCelsius(testValue) + "ºC");
  }
}
