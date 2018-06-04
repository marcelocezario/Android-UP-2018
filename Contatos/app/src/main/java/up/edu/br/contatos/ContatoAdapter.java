package up.edu.br.contatos;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class ContatoAdapter extends BaseAdapter{

    private List<Contato> contatos;
    Activity act;

    public ContatoAdapter(List<Contato> contatos, Activity act){
        this.contatos = contatos;
        this.act = act;
    }



    @Override
    public int getCount() {
        return this.contatos.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
