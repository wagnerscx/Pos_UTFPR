public class TstPes{

 public static void main(String[] args){
    Prof p = new Prof();
    
    p.setCpf(255555);//heranca Pessoa
    p.setNome("Xavier");//heranca Pessoa
    p.setTitulo("Mestrado em mutantes");//propria classe prof 
    p.setSalario(2500);//propria classe prof
    
    System.out.println("DADOS DO PROFESSOR");
    System.out.println("\nCPF -"+p.getCpf());
    System.out.println("\nNOME -"+p.getNome());
    System.out.println("\nTitulo -"+p.getTitulo());
    System.out.println("\nSalario -"+p.getSalario());
    System.out.println("\n==================================");	


    Aluno a = new Aluno();
    a.setCpf(666666);
    a.setNome("Tempestade");
    a.setRa(300);
    a.setCurso("Meio ambiente");
   
    System.out.println("DADOS DO ALUNO");
    System.out.println("\nCPF -"+a.getCpf());
    System.out.println("\nNOME -"+a.getNome());
    System.out.println("\nRA -"+a.getRa());
    System.out.println("\nCURSO -"+a.getCurso());	 

  }




}