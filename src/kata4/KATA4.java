
package kata4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;


public class KATA4 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        //Tenemos que crear un array que sea List
        //String nameFile = "C:\\Users\\usuario\\Desktop\\emailsfilev1.txt";
        ArrayList<String> mailArray = MailListReaderDDBB.read();
        System.out.println(mailArray.size());
        
        Histogram <String> histogram = MailHistogramBuilder.build(mailArray);
        
        
        
        new HistogramDisplay(histogram).execute();
        
        
    }
    

}
