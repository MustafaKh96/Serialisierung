import java.io.Serializable;
// implements Serializable => Diese Klasse kann zu Byte umgewandelt werden.
public class Person implements Serializable {
    public String name;
    public int alter;
}