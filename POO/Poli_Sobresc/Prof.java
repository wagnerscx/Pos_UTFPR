public class Prof extends Pessoa{
 
  private int salario;
  private String titulo;

//=====================================================
  public void impLocal(){	
  System.out.println("\n\nEstou na classe professor\n\n");               
  }
//=====================================================
 
  public int getSalario(){
    return salario;
   }
   
  public String getTitulo(){
    return titulo;
   }	

  public void setSalario(int salario){
     this.salario = salario;
   }
  public void setTitulo(String titulo){
    this.titulo = titulo;
   }



}