package herencia;

import javax.swing.JOptionPane;

public class Hija extends Padre {

    private int amable;
    private int responsable;
    private int atenta;
    private String nivel;

    public Hija() {

    }

    public Hija(int amable, int responsable, int atenta, String nivel, String nombre, int edad, char genero) {
        super(nombre, edad, genero);
        this.amable = amable;
        this.responsable = responsable;
        this.atenta = atenta;
        this.nivel = nivel;
    }

    public int getAmable() {
        return amable;
    }

    public void setAmable(int amable) {
        this.amable = amable;
    }

    public int getResponsable() {
        return responsable;
    }

    public void setResponsable(int responsable) {
        this.responsable = responsable;
    }

    public int getAtenta() {
        return atenta;
    }

    public void setAtenta(int atenta) {
        this.atenta = atenta;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void imprimirDatos() {
        JOptionPane.showMessageDialog(null, "El nombre de la hija es : " + getNombre()
                + "\n La edad es : " + getEdad()
                + "\n El genero es : " + getGenero()
                + "\n Ella es amable : " + amable
                + "\n Ella es : " + responsable
                + "\n Ella es : " + atenta
                + "\n El nivel de la hija  es : " + nivel);
     
     

      public static void main(String[] args) {
        Hija caracteristicas = new Hija();
        caracteristicas.setNombre(JOptionPane.showInputDialog(" Ingrese el nombre de la Hija"));
        caracteristicas.setEdad(Integer.parseInt(JOptionPane.showInputDialog(" Ingrese la edad de la Hija  ")));
        caracteristicas.setGenero(JOptionPane.showInputDialog(" Ingrese el genero de la Hija M O F").charAt(0));
        caracteristicas.setAmable(Integer.parseInt(JOptionPane.showInputDialog(" Ingrese si la hija es ")));
        caracteristicas.setResponsable(Integer.parseInt(JOptionPane.showInputDialog(" Ingrese si ella es Amable ")));
        caracteristicas.setAtenta(Integer.parseInt(JOptionPane.showInputDialog(" Ingrese si ella es ataenta ")));
        caracteristicas.setNivel(JOptionPane.showInputDialog(" Ingrese el nivel de la Hija"));
        caracteristicas.imprimirDatos();

}
 }
