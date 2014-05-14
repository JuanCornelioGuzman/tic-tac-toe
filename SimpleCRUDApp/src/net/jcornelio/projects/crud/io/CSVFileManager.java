package net.jcornelio.projects.crud.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.jcornelio.projects.crud.domain.Contact;
import net.jcornelio.projects.crud.domain.ContactsHolder;
import net.jcornelio.projects.crud.utils.Constants;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 23, 2013
 * @version: 1.0
 **************************************************/
public class CSVFileManager {

    private FileReader fr;
    private BufferedReader br;
    
//    public void populateListOfValuesFromCSV(String absolutePathOfFile, JTable tbl){
//        try {
//            fr = new FileReader(absolutePathOfFile);
//            br = new BufferedReader(fr);
//            String s = "";
//            String[] values = null;
//            Contact c;
//            while ((s=br.readLine())!=null){
//                
//                System.out.print("s value : "+s+"#");
//                
//                c = new Contact();
//                values = s.split(Constants.CSV_DELIMETER);
//                
//                System.out.println(Constants.CSV_DELIMETER);
//                for(int i=0; i<values.length; i++){
//                    System.out.println("value["+i+"]="+values[i]);
//                }
//                
//                System.out.print(values.length+"asdf");
//                System.out.print(values[0]);
//                System.out.print(values[1]);
//                System.out.print(values[2]);
//                System.out.print(values[3]);
//                System.out.print(values[4]);
//                c.setContactID(values[0]);
//                c.setName(values[1]);
//                c.setNumber(values[2]);
//                c.setAddress(values[3]);
//                c.setEmail(values[4]);
//                ContactsHolder.getInstance().addContact(c);
//            }
//        } catch(Exception ex){
//            System.out.print(ex);
//        } finally {
//            if(fr!=null&&br!=null){
//                try {
//                    fr.close();//Javaman: close the file stream
//                    br.close();//Javaman: close the buffered stream
//                } catch (IOException ex) {
//                    System.out.print(ex);
//                }
//            }
//        }
//    }
    
    public void populateListOfValuesFromCSV(File absolutePathOfFile, JTable tbl){
        try {
            fr = new FileReader(absolutePathOfFile);
            br = new BufferedReader(fr);
            String s = "";
            String[] values = null;
            Contact c;
            while ((s=br.readLine())!=null){
                
                System.out.print("s value : "+s+"#");
                
                c = new Contact();
                values = s.split(Constants.CSV_DELIMETER);
                
                System.out.println(Constants.CSV_DELIMETER);
                for(int i=0; i<values.length; i++){
                    System.out.println("value["+i+"]="+values[i]);
                }
                c.setContactID(values[0]);
                c.setName(values[1]);
                c.setNumber(values[2]);
                c.setAddress(values[3]);
                c.setEmail(values[4]);
                ContactsHolder.getInstance().addContact(c);
            }
        } catch(Exception ex){
            System.out.print(ex);
        } finally {
            if(fr!=null&&br!=null){
                try {
                    fr.close();//Javaman: close the file stream
                    br.close();//Javaman: close the buffered stream
                } catch (IOException ex) {
                    System.out.print(ex);
                }
            }
        }
    }

    private String saveJTableToCSVString(JTable tbl){
        String csvContent = "";
        for(int i = 0; i < tbl.getModel().getRowCount(); i++) {
            for(int x = 0; x < tbl.getModel().getColumnCount(); x++) {
                int col = tbl.convertColumnIndexToView(x);
                String curVal = (String)tbl.getModel().getValueAt(i,col);
                
                if(curVal == null) {
                    curVal = "";
                }
                
                csvContent = csvContent + curVal + "~";
               
                if(x == tbl.getModel().getColumnCount() - 1) {
                    csvContent = csvContent + "\n";                       
                }
               
            }
        }
        System.out.print("csvContent:"+csvContent);
        return csvContent;
    }
    
    public void saveCSVFile(JTable tbl){
        try {
            FileWriter writer = new FileWriter(new File(Constants.FILE_DIRECTORY+Constants.FILENAME));
            writer.write(saveJTableToCSVString(tbl));
            writer.flush();
            writer.close();
            
        } catch(IOException ioe) {
            
        }
    }
    
    
}

