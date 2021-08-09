package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class HandleFile {
    
    public final static String FILE_PATH = "./data/user.properties";


    public void writeFile() {
        try {
            OutputStream ous = new FileOutputStream(FILE_PATH);
            Properties prop = new Properties();
            prop.setProperty("nombre", "Marco");
            prop.setProperty("edad", "31");

            prop.store(ous, null);
            ous.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void readFile() {
        try {
            InputStream ins = new FileInputStream(FILE_PATH);
            Properties prop = new Properties();

            prop.load(ins);
  
            System.out.println(prop.getProperty("nombre"));
            System.out.println(prop.getProperty("edad"));
            ins.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
