public abstract class Pessoa{
   private int cpf;
   private String nome;
//=====================================================
  public void impLocal(){	
  System.out.println("\n\nEstou na classe-MAE PESSOA\n\n");
  }
//=====================================================
   
   public int getCpf(){
     return cpf;   
    }
   public String getNome(){
    return nome;
    }
   public void setCpf(int cpf){
    	this.cpf = cpf;
    }
   public void setNome(String nome){
        this.nome = nome;
    }		

 }