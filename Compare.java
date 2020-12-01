package scanner;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class Compare{
 /*   public boolean comp(String temp) throws FileNotFoundException // Throws Clause Added
    {
        File file = new File("D:\\Wallpapers\\rohit.txt");
        Scanner inputFile = new Scanner (file);
        // set up the scanner to use "," as the delimiter
       // inputFile.useDelimiter("[\\r,]");		//It is used when you are using delimiter in text file
        // While there is another line to read.
        int l=0;
        while(inputFile.hasNext() && l!=1)
        {
            String links=inputFile.next(); //Read links
            System.out.print(links);
            System.out.print(temp);
            System.out.println(temp.equals(links));
            if(temp.equals(links))
            {
               return true;
            }
            else{
            	
            }
        }
        // be polite and close the file
        inputFile.close();
		return false;
    }*/
    public boolean comp(String tempD){
    		try {
    			DBConnection object_DBConnection=new DBConnection();
    			Connection connection = object_DBConnection.getConnection();
                String query = "select * from links";
                Statement stmt = null;
                stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                int l=0;
                while (rs.next() && l!=1) {
                	String dbLink=rs.getString("links");
                	System.out.print(dbLink);
                    System.out.print(tempD);
                    System.out.println(tempD.equals(dbLink));
                	if(tempD.equals(dbLink)) {
                		return true;
                	}
                	else {
                		
                	}
                }
                return false;
    		}catch (Exception e) {
                System.err.println(e);
            }
    		return false;
    }  		
}