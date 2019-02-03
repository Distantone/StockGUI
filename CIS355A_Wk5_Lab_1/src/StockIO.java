
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;



/**
 *
 * @author Payden Boughton
 */
public class StockIO {
    private String fileName;

    //constructors
    public StockIO(){
        fileName = "unknown";
    }
    public StockIO(String fileName) {
        this.fileName = fileName;
    }

    //getters and setters
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    //reads data from file
    public ArrayList<Stock> getData() throws FileNotFoundException, IOException{
        //creation of stock arraylist
        ArrayList<Stock> stkList = new ArrayList<Stock>();
        
        //read data
        BufferedReader inbuffer = new BufferedReader(new FileReader(fileName));
            String inputString = "";
            StringTokenizer tokens;
            System.out.println("Reading the file");
	    //get first line
	    inputString = inbuffer.readLine();
            while (inputString  != null)
            {
		System.out.println(inputString);  //echo to console
		//break the line into pieces
		tokens = new StringTokenizer(inputString, ",");
                //fioelds are companyName,quantity,purchasePrice,currentPrice
                String companyName = tokens.nextToken();
                double quantity = Double.parseDouble(tokens.nextToken());
                double purchasePrice = Double.parseDouble(tokens.nextToken()); 
                double currentPrice = Double.parseDouble(tokens.nextToken()); 
                System.out.println("Company name is: " + companyName);
                System.out.println("Quantity is: " + quantity);
                System.out.println("PurchasePrice is: " + purchasePrice);	
                System.out.println("Current Price is: " + currentPrice);
                
                //create stock object and add to arrayList
                Stock stk = new Stock(companyName, quantity, purchasePrice, currentPrice);
                stkList.add(stk);
		//read next line
		inputString = inbuffer.readLine();
            }			
            inbuffer.close();
        
        //retuirn arraylist
        return stkList;
    }
    //saves data to file
    public void saveData(ArrayList<Stock> stkList) throws IOException{
        
        
        //open
        BufferedWriter outfile = new BufferedWriter(new FileWriter (fileName, false)); //true means append to end of file *******
        //write
        for(Stock stk :stkList){
        outfile.write(stk.getCompanyName() + ",");
        outfile.write(stk.getNumShares()+ ",");
        outfile.write(stk.getPurchasePrice()+ ",");
        outfile.write(stk.getCurrentPrice()+ "");
        outfile.newLine();
        }
        //close\
        outfile.close();
        
    }
        
    
}
