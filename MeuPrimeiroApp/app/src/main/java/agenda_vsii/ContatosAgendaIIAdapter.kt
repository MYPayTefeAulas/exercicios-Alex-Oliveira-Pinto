package agenda_vsii

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.meuprimeiroapp.databinding.ItemContatoBinding

class ContatosAgendaIIAdapter (
    val listaContatos: MutableList<Contato_vsII>,
    val onItemClick: (Int) -> Unit

    ): RecyclerView.Adapter<ContatosAgendaIIAdapter.ViewHolder>() {

        inner class ViewHolder(val binding: ItemContatoBinding) : RecyclerView.ViewHolder(binding.root)

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(
                ItemContatoBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                false
            ))
    }

    override fun getItemCount(): Int {
        return listaContatos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.txtNomeAgendaIII.text = Agenda_vsII.listaContatos[position].nome
        holder.binding.txtTelefoneAgendaIII.text = Agenda_vsII.listaContatos[position].telefone

        holder.binding.root.setOnClickListener {
            onItemClick(position)
        }

    }
    fun swapData(novaListaContatos: List<Contato_vsII>) {
        listaContatos.clear()
        listaContatos.addAll(novaListaContatos)
        notifyDataSetChanged()
    }
}
