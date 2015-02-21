/**
 * Created by Toshiba on 21.02.2015.
 */
import java.util.*;
import java.io.*;

public class OpenNotePad {



        public static void main(String[] args) {
            Runtime rs = Runtime.getRuntime();

            try {
                rs.exec("notepad");
            }
            catch (IOException e) {
                System.out.println(e);
            }
        }

}
