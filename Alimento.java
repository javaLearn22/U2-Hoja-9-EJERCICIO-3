public class Alimento {
    String nombre; 
    int grasas; 
    int hidratos; 
    boolean origenAnimal; 
   
    public Alimento(){}
    public Alimento(String nombre, int grasas,  int hidratos, boolean origenAnimal){  
      this.nombre=nombre;  
      this.grasas=grasas; 
      this.hidratos=hidratos; 
      this.origenAnimal=origenAnimal; 
    }
    
   public void setNombre(String nombre) {
    this.nombre=nombre; } 
   public void setGrasas(int grasas) {
    this.grasas=grasas; }
   public void setHidratos(int hidratos) {
      this.hidratos=hidratos; }
  
   public boolean setOrigenAnimal(boolean origenAnimal) {
        return false;
       }
    public boolean esDietetico() {
        return false;
     }
       
    public double gramos;
    public void setCalorias(double gramos) {
     this.gramos=gramos; 
    }
  
  public double getCalorias() {

        return gramos;
      }

   public String getNombre() {
        return nombre;
    }
   public int getGrasas() {
        return grasas;
    }
   public int getHidratos() {
        return hidratos;
    }
   public String getOrigenAnimal() {
        return null;
    }

    }
