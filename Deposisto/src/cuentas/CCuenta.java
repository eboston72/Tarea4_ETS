package cuentas;

//@author elizabeth
public class CCuenta {

    /**
     * @param tipoInterés the tipoInterés to set
     * @version 1.5
     * Programa que te permite ingresar y retirar dinera, asi como saber el saldo en cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    protected String nombre;
    protected String cuenta;
    protected double saldo;
    protected double tipoInterés;
    
    // Constructor vacio
    public CCuenta(){
    }
    
    // Constructor con parametros
    public CCuenta(String nom, String cue, double sal, double tipo){
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }
    
    // Método estado, verificacion de saldo
    public double estado(){
        return getSaldo();
    }
    
    // Método de ingreso
    public void ingresar(double cantidad) throws Exception{
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
   // Método de retiro
    public void retirar(double cantidad) throws Exception{
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
