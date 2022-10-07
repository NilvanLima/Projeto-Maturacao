
import javax.swing.JOptionPane;

public class Produtor {
        
    private String nome;
    private String cargo;
    private String login;
    private String senha;
    private int telefone;
    private int hora;
    
    public Produtor(String nome, String cargo, String login, String senha, int telefone, int hora){
        this.nome = nome;
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
        this.telefone = telefone;
        this.hora = hora;
    }
    
    public void cadastrarTecnico(){
        
    } 
    
    public void exibirTecnico(){
        JOptionPane.showMessageDialog(null, "As informações sobre o técnico são: " + getNome() + ", " +  "\n" + getLogin()) ;
    }
    
    public void cadastrarPomar(){
        
    }
    
    public void validarUsuario(){
        
        
        
    }
    public void validarSenha(){
        
    }

   
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getCargo() {
        return cargo;
    }

   
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    public String getLogin() {
        return login;
    }

    
    public void setLogin(String login) {
        this.login = login;
    }

    
    public String getSenha() {
        return senha;
    }

    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    public int getTelefone() {
        return telefone;
    }

   
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

   
    public int getHora() {
        return hora;
    }

    
    public void setHora(int hora) {
        this.hora = hora;
    }

     
        
}
