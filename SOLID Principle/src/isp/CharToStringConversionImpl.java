package isp;

public class CharToStringConversionImpl implements CharToStringConversion {
    @Override
    public String charToString(char value) {
        return Character.toString(value);
    }
}
