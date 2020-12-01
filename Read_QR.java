package scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
public class Read_QR {
	static String temp;
	public static void main(String[] args) throws WriterException, IOException,
    NotFoundException {
        try {
        	
            String filePath = "D:\\Wallpapers\\chillyfacts.png";
            String charset = "UTF-8";
            Map < EncodeHintType, ErrorCorrectionLevel > hintMap = new HashMap < EncodeHintType, ErrorCorrectionLevel > ();
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
            temp=readQRCode(filePath, charset, hintMap);
            System.out.println("Data read from QR Code: " + temp);
        } catch (Exception e) {
            // TODO: handle exception
        }
     Compare C=new Compare();
     boolean val=C.comp(temp);
     if(val) {
    	 System.out.print(" x NOT SAFE !!!");
     }
     else {
    	 System.out.print("SAFE");
     }
    }
@SuppressWarnings({ "unchecked", "rawtypes" })
	public static String readQRCode(String filePath, String charset, Map hintMap)
	throws FileNotFoundException, IOException, NotFoundException {
		BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(ImageIO.read(new FileInputStream(filePath)))));
    	Result qrCodeResult = new MultiFormatReader().decode(binaryBitmap, hintMap);
    	return qrCodeResult.getText();
	}
}
