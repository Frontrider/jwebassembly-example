package hu.frontrider;
import de.inetsoftware.jwebassembly.api.annotation.Export;

public class Lib {

    @Export
    public static int hfc(int a, int b){
        if(b==0)return a;

        else return hfc(b,a%b);
    }
}
