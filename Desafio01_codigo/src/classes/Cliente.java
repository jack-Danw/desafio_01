package classes;

/**
 *
 * @author jack
 */
public class Cliente {

//fIdade = Faixa de Idade, fSalario = Faixa salarial, 
    //     rEmprestimo = razão do emprestimo    
  
   private String cpf,fIdade,convenio,fSalario,rEmprestimo;
   private int codcliente;
   
   public int getCodCliente(){
       return codcliente;
   }
   
   public void setCodCliente(int codcliente){
       this.codcliente = codcliente;
   }
   
   public String getCpf(){
       return cpf;
   }
   
   public void setCpf(String cpf){
       this.cpf = cpf;
   }
   public String getFIdade(){
       return fIdade;
   }
   
   public void setFIdade(String fIdade){
       this.fIdade = fIdade;
   }
   public String getConvenio(){
       return convenio;
   }
   
   public void setConvenio(String convenio){
       this.convenio = convenio;
   }
   public String getFSalario(){
       return fSalario;
   }
   
   public void setFSalario(String fSalario){
       this.fSalario = fSalario;
   }
   public String getREmprestimo(){
       return rEmprestimo;
   }
   
   public void setREmprestimo(String rEmprestimo){
       this.rEmprestimo = rEmprestimo;
   }
}
