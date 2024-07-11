public class Complejo {
    private double real, imag;

    //Constructor por defecto
    public Complejo() {
        real = 0.0;
        imag = 0.0;
    }

    //Constructor por parametros
    public Complejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    //Getters y setters
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    //Metodo toString
    @Override
    public String toString() {
        return real+" + "+ imag + "i";
    }

    public void Suma (Complejo b){
        this.real = b.getReal() + this.real;
        this.imag = b.getImag() + this.imag;
    }

    public static Complejo SumaComplejos (Complejo a, Complejo b){
        Complejo c = new Complejo();
        c.setReal(a.getReal() + b.getReal());
        c.setImag(a.getImag() + b.getImag());
        return c;
    }
}


