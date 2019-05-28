import net.sf.jasperreports.engine.JRDefaultScriptlet;
import net.sf.jasperreports.engine.JRScriptletException;
import org.apache.commons.codec.binary.Base64;


public class Main extends JRDefaultScriptlet{

    public static void main(String[] args) throws JRScriptletException{
        System.out.println(base64Encoder("blablab"));
    }

    public static String base64Encoder (String input) throws JRScriptletException{
        byte[] bytesEncoded = Base64.encodeBase64(input.getBytes());
        return new String(bytesEncoded);
    }

    public static String base64Decoder (String encodedInput) throws JRScriptletException{
        byte[] valueDecoded = Base64.decodeBase64(encodedInput);
        return new String(valueDecoded);
    }

}

