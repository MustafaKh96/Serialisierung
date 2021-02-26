import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialisierung {
    public static void main(String[] args)  {
        Person a = null ;
        Person b = null ;
        try{
            FileInputStream fis = new FileInputStream("data.bin") ;
            ObjectInputStream ois = new ObjectInputStream(fis) ;
            a = (Person) ois.readObject() ;
            b = (Person) ois.readObject() ;
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(a.name +" " + b.name);
    }
}