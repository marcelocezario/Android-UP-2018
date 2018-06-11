package up.edu.br.contatos;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class ContatoDao {

    static ArrayList<Contato> contatos = new ArrayList<Contato>();
    static Integer id = 0;

    public void salvar (Contato contato){
        SQLiteDatabase conn = Conexao.getInstance().getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("nome", contato.getNome());
        values.put("tipo", contato.getTipo());
        values.put("telefone", contato.getNumero());

        conn.insert("contato", null,values);






//        for (Contato c: contatos){
//            if (c.getId() != null && c.getId().equals(contato.getId())){
//                c.setNome(contato.getNome());
//                c.setTipo(contato.getTipo());
//                c.setNumero(contato.getNumero());
//                c.setEmail(contato.getEmail());
//                c.setAtivo(contato.isAtivo());
//            }
//        }
//        if (!contatos.contains(contato)){
//            contato.setId(id++);
//            contatos.add(contato);
//        }
    }

    public List<Contato> listar(){
        return new ArrayList<>();
    }

    public void excluir(Contato contato) {

    }
}
