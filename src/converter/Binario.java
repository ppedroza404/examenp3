package converter;

public class Binario implements ConvertInterface {
    @Override
    public String fromDecimal(int i_num) {
        return Integer.toBinaryString(i_num);
    }

    @Override
    public int toDecimal(String s_hex_or_bin) {
        return Integer.parseInt(s_hex_or_bin,2);
    }

    @Override
    public String getType() {
        return "Binario";
    }
}
