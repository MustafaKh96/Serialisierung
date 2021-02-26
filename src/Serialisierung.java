import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialisierung {
    public static void main(String[] args) {
        Person a = new Person() ;
        a.name = "Mustafa" ;
        a.alter = 25 ;
        Person b = new Person();
        b.name = "Abo Ali" ;
        b.alter = 28 ;
        String filename = "data.bin" ;
        try {
            FileOutputStream fos = new FileOutputStream(filename); // File erstellt.
            ObjectOutputStream oos = new ObjectOutputStream(fos); // Schreib Byte eines Objekts in diesem File(fos).
            // Durch ObjectOutputStream (oos.writeObject) lässt sich das Objekt zu Byte umwandeln.
            oos.writeObject(a); // Danach muss es geschlossen werden mit oos.close().
            oos.writeObject(b);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}