package mementofigura;

import java.util.ArrayList;
import java.util.Iterator;

public class Gestor {

    private int contador = 1;
    ArrayList<Recuerdos> recuerdos = new ArrayList();

    public void addArray(Recuerdos recuerdo) {
        recuerdos.add(recuerdo);
    }

    public Recuerdos getRecuerdo(int i) {
        return recuerdos.get(i);
    }

    public void deshacer(Rectangulo r) {
        contador = contador + 1;
        int tamano = recuerdos.size();
        Recuerdos rec = recuerdos.get(tamano - contador);
        r.setAncho(rec.getAnchoGuardar());
        r.setAlto(rec.getAltoGuardar());
        r.setCoorX(rec.getCoorXGuardar());
        r.setCoorY(rec.getCoorYGuardar());
        System.out.println("Ctrl+z: " + r.toString());

    }
}
