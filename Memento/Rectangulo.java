package mementofigura;

public class Rectangulo {

    private double alto;
    private double ancho;
    private double coorX;
    private double coorY;
 

    public Rectangulo(double alto, double ancho, double coorX, double coorY) {
        this.alto = alto;
        this.ancho = ancho;
        this.coorX = coorX;
        this.coorY = coorY;

        System.out.println(this);
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;

    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getCoorX() {
        return coorX;
    }

    public void setCoorX(double coorX) {
        this.coorX = coorX;
    }

    public double getCoorY() {
        return coorY;
    }

    public void setCoorY(double coorY) {
        this.coorY = coorY;

    }


    public Recuerdos crearRecuerdo() {
        return new Recuerdos(this.alto, this.ancho, this.coorX, this.coorY);
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "alto=" + alto + ", ancho=" + ancho + ", coorX=" + coorX + ", coorY=" + coorY + '}';
    }
    public void verRectangulo() {
        System.out.println( "Rectangulo{" + "alto=" + alto + ", ancho=" + ancho + ", coorX=" + coorX + ", coorY=" + coorY + '}');
    }

}
