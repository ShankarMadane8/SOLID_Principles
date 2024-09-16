package isp;

//Violates ISP: Large interface
public interface Conversion {
    double intToDouble(int value);
    char intToChar(int value);
    String charToString(char value);
}