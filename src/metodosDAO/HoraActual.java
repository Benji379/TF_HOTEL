package metodosDAO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import vistas.pnl_principal;

public class HoraActual implements ActionListener {
    
    // Override es una anotación en Java que se utiliza para indicar que un método está siendo sobrescrito
    @Override
    public void actionPerformed(ActionEvent ae) {
        Date hora = new Date();
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss a");
        Calendar hoy = Calendar.getInstance();
        pnl_principal.txtHora.setText(String.format(format.format(hora), hoy));
        
    }

}
