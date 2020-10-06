
package cadastrocliente;

public class CadastroCliente {

    public static void main(String[] args) {
        
        TelaCadastro form = new TelaCadastro();
        
        Pessoa cliente = new Pessoa(form.nome, form.email, form.cpf, form.endereco, 
        form.senha); 
        
        
        
    }
    
}
