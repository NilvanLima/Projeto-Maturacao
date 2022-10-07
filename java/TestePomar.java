import javax.swing.JOptionPane;

public class TestePomar {
    
    public static void main (String[] args){
                
        String nome = JOptionPane.showInputDialog("Digite o nome do técnico: ");
        String login = JOptionPane.showInputDialog("Digite o login do técnico: ");
        
        Produtor tecnico = new Produtor (nome, "", login, "", 0, 0);
        
        tecnico.cadastrarTecnico();
        tecnico.exibirTecnico();
        
        
        
    }
    
    
}
