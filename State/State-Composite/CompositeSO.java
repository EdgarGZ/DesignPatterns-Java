package compositeso;

/**
 *
 * @author edgar
 */
public class CompositeSO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Folder principal = new Folder("C://");
        Archivo archivoJPG = new Jpg(500, 400, "playa", (float)3.5);
        
        archivoJPG.cambiarNombre("playaDos");
        System.out.println(archivoJPG);
        archivoJPG.abrir();
        archivoJPG.cambiarNombre("playa");
        archivoJPG.cerrar();
        archivoJPG.cambiarNombre("playa");
        System.out.println(archivoJPG);
        
        //archivoJPG.cambiarNombre("vacas");
        //archivoJPG.abrir();
//        principal.addElemento(archivoJPG);
//        Folder carpetaUsuario = new Folder("Usuario");
//        principal.addElemento(carpetaUsuario);
//        Archivo archivoMP3 = new Mp3((float)3.5, "sonidito-Banda", (float)5);
//        carpetaUsuario.addElemento(archivoMP3);
//        carpetaUsuario.addElemento(new Rutina("Baja las pelis", (float)8));
        
        //principal.verElementos();
        
        //principal.arbol();
        // principal.info();
        
        //System.out.println(principal.toString());
        //System.out.println(archivoJPG.toString());
        //System.out.println(carpetaUsuario.toString());
        //System.out.println(archivoJPG.toString());
        //System.out.println(principal.getSize());
        
//        System.out.println();
//        System.out.println();
//        
//        
//        Jpg imagenConFondo = new Jpg(400, 400, "imagen1", (float)5);
//        System.out.println(imagenConFondo);
//        
//        Png imagenSinFondo = new Png(400, 400, "imagen2", (float)3.5);
//        imagenSinFondo.setTransparencia(50);
//        System.out.println(imagenSinFondo);
//        
//        Jpg imagenConvertida = Jpg.parseJpg(imagenSinFondo);
//        System.out.println(imagenConvertida);
//        
//        Png imagenReconvertida = Png.parsePng(imagenConvertida);
//        System.out.println(imagenReconvertida);
        
    }
    
}
