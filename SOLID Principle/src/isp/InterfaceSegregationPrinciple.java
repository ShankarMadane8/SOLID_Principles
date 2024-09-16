package isp;

public class InterfaceSegregationPrinciple {
	public static void main(String[] args) {
        IntToDoubleConversion intToDouble = new IntToDoubleConversionImpl();
        IntToCharConversion intToChar = new IntToCharConversionImpl();
        CharToStringConversion charToString = new CharToStringConversionImpl();
        
        System.out.println("Int to Double: " + intToDouble.intToDouble(5));
        System.out.println("Int to Char: " + intToChar.intToChar(65));
        System.out.println("Char to String: " + charToString.charToString('A'));
    }
}
