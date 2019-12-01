package mementofigura;

public class MementoFigura {

    public static void main(String[] args) {
        Gestor g = new Gestor();
        System.out.println("Original");
        Rectangulo r = new Rectangulo(100, 50, 600, 200);
        g.addArray(r.crearRecuerdo());
        System.out.println("");

        System.out.println("set Ancho 33");
        r.setAncho(33);
        r.verRectangulo();
        g.addArray(r.crearRecuerdo());
        System.out.println("");
        
        System.out.println("set Alto 10");
        r.setAlto(10);
        r.verRectangulo();
        g.addArray(r.crearRecuerdo());
        System.out.println("");
        
        System.out.println("set CoorX 99");
        r.setCoorX(99);
        r.verRectangulo();
        g.addArray(r.crearRecuerdo());
        System.out.println("");
        
        g.deshacer(r);
        g.deshacer(r);
        g.deshacer(r);
        

    }

}
