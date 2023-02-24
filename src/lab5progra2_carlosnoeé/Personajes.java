package lab5progra2_carlosnoeé;


public class Personajes {
    public String Nombre;
    public String Poder;
    public String Debilidad;
    public String UniversoDeP;
    public double Fuerza;
    public double AFisica;
    public double AMental;
    public double PuntosDVida;

    public Personajes(String Nombre, String Poder, String Debilidad, String UniversoDeP, double Fuerza, double AFisica, double AMental, double PuntosDVida) {
        this.Nombre = Nombre;
        this.Poder = Poder;
        this.Debilidad = Debilidad;
        this.UniversoDeP = UniversoDeP;
        this.Fuerza = Fuerza;
        this.AFisica = AFisica;
        this.AMental = AMental;
        this.PuntosDVida = PuntosDVida;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPoder() {
        return Poder;
    }

    public void setPoder(String Poder) {
        this.Poder = Poder;
    }

    public String getDebilidad() {
        return Debilidad;
    }

    public void setDebilidad(String Debilidad) {
        this.Debilidad = Debilidad;
    }

    public String getUniversoDeP() {
        return UniversoDeP;
    }

    public void setUniversoDeP(String UniversoDeP) {
        this.UniversoDeP = UniversoDeP;
    }

    public double getFuerza() {
        return Fuerza;
    }

    public void setFuerza(double Fuerza) {
        this.Fuerza = Fuerza;
    }

    public double getAFisica() {
        return AFisica;
    }

    public void setAFisica(double AFisica) {
        this.AFisica = AFisica;
    }

    public double getAMental() {
        return AMental;
    }

    public void setAMental(double AMental) {
        this.AMental = AMental;
    }

    public double getPuntosDVida() {
        return PuntosDVida;
    }

    public void setPuntosDVida(double PuntosDVida) {
        this.PuntosDVida = PuntosDVida;
    }

    @Override
    public String toString() {
        return "Personajes{" + "Nombre=" + Nombre + ", Poder=" + Poder + ", Debilidad=" + Debilidad + ", UniversoDeP=" + UniversoDeP + ", Fuerza=" + Fuerza + ", AFisica=" + AFisica + ", AMental=" + AMental + ", PuntosDVida=" + PuntosDVida + '}';
    }


    
            
}
