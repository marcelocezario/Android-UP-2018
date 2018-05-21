package up.edu.br.contatos;

import java.io.Serializable;

public class Contato implements Serializable{

    private Integer id;
    private String nome;
    private String tipo;
    private String numero;

    @Override
    public boolean equals(Object o){
        if (id == null || ((Contato)o).getId() == null){
            return false;
        }
        return id.equals(((Contato)o).getId());
    }


    public String toString(){
        return nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
