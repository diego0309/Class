import java.util.*;

import java.text.*;

import java.time.LocalDate;

 

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    List<Registro> registros = new ArrayList<>();

    List<RegistroDiario> registrosDiarios = new ArrayList<>();

    String tarjeta = "";

    int opc;

   

 

    do

    {

      System.out.println("CONTROL DE MOVIMIENTOS BANAMEX");

      System.out.println("MENÚ");

      System.out.println("1.- Realizar movimiento");

      System.out.println("2.- Consultar movimientos");

      System.out.println("3.- Salir");

      System.out.print("Seleccione una opción[1-3]: ");

      opc = scanner.nextInt();

 

      switch(opc)

      {

          case 1:

          System.out.print("Introduzca su número de tarjeta: ");

          tarjeta = scanner.next();

          SimpleDateFormat formato = new SimpleDateFormat("'Su transacción se realizó correctamente el día' yyyy-MM-dd 'a las' HH:mm:ss");

          Date currentDate = Calendar.getInstance().getTime();

 

          registros.add(new Registro(LocalDate.now(), tarjeta));

          System.out.println(formato.format(currentDate));

 

          final String auxTarjeta = tarjeta;

 

          RegistroDiario encontrado = registrosDiarios.stream().filter(registro ->  LocalDate.now().equals(registro.getFecha()) && auxTarjeta.equals(registro.getTarjeta())).findAny().orElse(null);

          if(encontrado == null)

            registrosDiarios.add(new RegistroDiario(LocalDate.now(), tarjeta, 1));

          else

          {

            encontrado.setContador(encontrado.getContador()+1);

            registrosDiarios.set(registrosDiarios.indexOf(encontrado), encontrado);

          }

          break;

           

 

          case 2:

            for(RegistroDiario registroDiario : registrosDiarios)

            {

              System.out.println(registroDiario.getFecha() + " | "+ registroDiario.getTarjeta() + " | "+ registroDiario.getContador());

            }

 

               

      }

   

    }while(opc != 3);

 

   

    

 

  }

}