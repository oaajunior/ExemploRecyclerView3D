package livroandroid.com.recyclerview3d

import android.support.v4.view.LayoutInflaterFactory
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.lista3d.view.*
import java.util.zip.Inflater

class MyAdapter(var lista:List<Aluno>):RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): MyViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.lista3d,parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(viewHolder: MyViewHolder, pos: Int) {
        viewHolder.nome.text = lista[pos].nome
        viewHolder.sobrenome.text = lista[pos].sobrenome
        viewHolder.avatar.setImageResource(lista[pos].avatar)
    }


    inner class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        var nome = itemView.txtNome
        var sobrenome = itemView.txtSobrenome
        var avatar = itemView.imgAvatar
    }
}