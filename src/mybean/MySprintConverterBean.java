package mybean;

import org.springframework.beans.factory.annotation.Autowired;
import converter.ConvertInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MySprintConverterBean {

    public ConvertInterface convertInterface;
    @Autowired
    public void setConvertidor (ConvertInterface pConvertInterface){
        this.convertInterface = pConvertInterface;
    }
    public void run() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Digite un numero Decimal Positivo:");
        int p_num = Integer.parseInt(reader.readLine());

        System.out.println("El numero en formato " + convertInterface.getType() + " " + convertInterface.fromDecimal(p_num));
        System.out.println("Digite un numero " + convertInterface.getType() + " :");
        String p_bin = reader.readLine();
        System.out.println("El numero en formato Decimal es " + convertInterface.toDecimal(p_bin));
    }

}
