package ed_tarea04;

public class main { 

    public static void main(String[] args) {

        Emonedero mimonedero;

        double dinero;

        mimonedero = new Emonedero("Nombre y apellidos del Alumno",500, "dni del alumno");

        global_monedero(mimonedero, 1000);

    }

	public static void global_monedero(Emonedero mimonedero, double dinero) {
		try 

        {

            mimonedero.pagar(200);

        } catch (Exception e)

        {

            System.out.print("No se puede pagar  ");

        }

        try

        {

            System.out.println("Debes recargar monedero");

            mimonedero.recargar(300);

        } catch (Exception e)

        {

            System.out.print("Error al recargar");

        }

        double saldo_disponible = mimonedero.efectivo();

        System.out.println("El efectivo del monedero es  "+ saldo_disponible );
	}
	}

