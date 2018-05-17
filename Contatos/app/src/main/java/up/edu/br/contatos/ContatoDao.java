package up.edu.br.contatos;

import java.util.ArrayList;
import java.util.List;

public class ContatoDao {

    static ArrayList<Contato> contatos = new ArrayList<Contato>();

    public void salvar (Contato contato){
        contatos.add(contato);
    }

    public List<Contato> listar(){
        return contatos;
    }
}
