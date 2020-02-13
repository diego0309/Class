public class RegistroDiario

{

  private LocalDate fecha;

  private String tarjeta;

  private int contador = 0;

 

 

  public RegistroDiario(){}

 

  public RegistroDiario(LocalDate fecha, String tarjeta, int contador)

  {

      this.fecha = fecha;

      this.tarjeta = tarjeta;

      this.contador = contador;

  }

 

 

  public LocalDate getFecha()

  {

    return this.fecha;

  }

 

  public String getTarjeta()

  {

    return this.tarjeta;

  }

 

  public void setTarjeta(String tarjeta)

  {

     this.tarjeta = tarjeta;

  }

 

  public int getContador()

  {

    return this.contador;

  }

 

  public void setContador(int contador)

  {

     this.contador = contador;

  }

 

}

 