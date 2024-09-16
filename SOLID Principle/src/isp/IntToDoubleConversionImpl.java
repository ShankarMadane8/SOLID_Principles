package isp;

//Implementations of specific interfaces
public class IntToDoubleConversionImpl implements IntToDoubleConversion {
 @Override
 public double intToDouble(int value) {
     return value * 1.0;
 }
}
