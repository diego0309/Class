import java.util.*;

import java.text.*;

import java.time.LocalDate;

public class Registro

{

  private LocalDate fecha;

  private String tarjeta;

 

  public Registro(){}

 

  public Registro(LocalDate fecha, String tarjeta)

  {

      this.fecha = fecha;

      this.tarjeta = tarjeta;

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

}