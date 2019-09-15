package hu.frontrider;
import de.inetsoftware.jwebassembly.api.annotation.Export;

public class Lib {

    @Export
    public static int add(int int1, int int2){
        return int1+int2;
    }
}
