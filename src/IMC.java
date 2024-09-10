import java.text.DecimalFormat;
public class IMC {
    DecimalFormat dec = new DecimalFormat("0.00");
    private double peso, estatura, IMC;
    private String nombre;
    public IMC(){
    }
    public IMC(double peso, double estatura, double IMC, String nombre){
        this.peso = peso;
        this.estatura = estatura;
        this.IMC = IMC;
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public double getIMC() {
        return IMC;
    }
    public void setIMC(double IMC) {
        this.IMC = IMC;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "IMC:" +
                "\n- nombre = " + nombre +
                "\n- peso = " + peso +
                "\n- estatura = " + estatura +
                "\n- IMC = " + dec.format(IMC);
    }

    public void calcularIMC(){
        this.IMC = (peso)/(Math.pow(estatura,2));
        System.out.println("\n" + toString());
        if (IMC < 18.5){
            System.out.println("Se encuentra bajo de peso.");
        } else if (IMC  >= 18.5 && IMC <= 24.9){
            System.out.println("Se encuentra normal de peso.");
        } else if (IMC  >= 25 && IMC <= 26.9){
            System.out.println("Se encuentra en sobrepeso grado I.");
        } else if (IMC  >= 27 && IMC <= 29.9){
            System.out.println("Se encuentra en sobrepeso grado II.");
        } else if (IMC  >= 30 && IMC <= 34.9){
            System.out.println("Se encuentra en obesidad de tipo I.");
        } else if (IMC  >= 35 && IMC <= 39.9){
            System.out.println("Se encuentra en obesidad de tipo II.");
        } else if (IMC  >= 40 && IMC <= 49.9){
            System.out.println("Se encuentra en obesidad de tipo III (morbida).");
        } else if (IMC  >= 50){
            System.out.println("Se encuentra en obesidad de tipo IV (extrema).");
        }
    }

}
