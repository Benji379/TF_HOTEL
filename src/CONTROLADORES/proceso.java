
package CONTROLADORES;

import java.io.IOException;

/**
 *
 * @author Benji
 */
public class proceso {
        public static void AccederEnlace(String enlace) {
        String url = "C:\\Windows\\System32\\cmd.exe /K start " + enlace;
        try {
            Runtime.getRuntime().exec(url);
        } catch (IOException ex) {
        }
    }

}
