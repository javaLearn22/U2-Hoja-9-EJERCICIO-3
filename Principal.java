public class Ejercicio2 {
    public static void main(String[] args) {     
       Alimento valores=new Alimento(); 
 valores.setNombre("aguacate");
 valores.setGrasas((int) 14.6); 
 valores.setHidratos((int) 8.5);
 valores.setOrigenAnimal(false); 
 valores.setCalorias(160); 
 System.out.print("\n- Nombre: "+valores.getNombre()); 
 System.out.print("\n- Grasas: "+valores.getGrasas()+"gr."); 
 System.out.print("\n- Hidratos: "+valores.getHidratos()+"gr.");
boolean esDietetico =valores.getGrasas()<=12?true:false;
Boolean miBoolean = esDietetico;
System.out.print("\n- Es Dietetico? "+miBoolean);     
System.out.print("\n- Gramos: "+valores.getCalorias());
double calorias = valores.getCalorias()* (valores.getGrasas()* 5.3+ valores.getHidratos()* 2.1);
System.out.printf("\n- Calorias: %,.1f",calorias/100);
System.out.printf(" (%,.0f Kcal).\n\n",calorias);
    }
  }
