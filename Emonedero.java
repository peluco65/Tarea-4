package ed_tarea04;

public class Emonedero {
	
	/*Propiedades de la Clase Emonedero*/

    private String nombre;

    private double saldo;

    private String cliente;
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}



	  

    /* Constructor sin argumentos */

    public Emonedero ()

    {

    }

    /*Constructor con parámetros*/

    public Emonedero (String titular, double saldillo, String cli)

    {

        nombre =titular;

        saldo=saldillo;

        cliente=cli;

    }

   /*Método para asignar el titular del monedero*/

    public void fijartitular(String titular)

    {

        nombre=titular;

    }

    /* Método que indica el nombre del titular del monedero*/

    public String Titular()

    {

        return nombre;

    }

 

    /*Método que devuelve la cantidad de dinero de mi monedero electrónico*/

     public double efectivo ()

    {

        return saldo;

    }

 

    /* Método para recargar el monedero */

    public void recargar (double cantidad) throws Exception

    {

        if (cantidad<0)

            throw new Exception("No se puede recargar el monedero");

        saldo = saldo + cantidad;

    }

 

    /* Método para pagar*/

    public void pagar (double cantidad) throws Exception

    {

        if (cantidad <= 0)

            throw new Exception ("No se puede pagar una cantidad negativa");

        if (efectivo()< cantidad)

            throw new Exception ("Su saldo es insuficiente para realizar el pago");

        saldo = saldo - cantidad;

    }

 

    /*Método que me devuelve el número de cliente (identificador del tipo ED980SWS)*/

    public String numerocliente ()

    {

        return cliente;

    }

}