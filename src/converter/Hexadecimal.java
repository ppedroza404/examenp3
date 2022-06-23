package converter;

public class Hexadecimal implements ConvertInterface {

    @Override
    public String fromDecimal(int i_num) {
        return Integer.toHexString(i_num);
    }

    @Override
    public int toDecimal(String s_hex_or_bin) {
        return Integer.parseInt(s_hex_or_bin,16);
    }

    @Override
    public String getType() {
        return "Hexadecimal";
    }
}
