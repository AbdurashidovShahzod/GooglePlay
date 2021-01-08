package uz.unzosoft.googleplay.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_play_market_child.view.*
import uz.unzosoft.googleplay.R
import uz.unzosoft.googleplay.models.ChildData
import uz.unzosoft.googleplay.models.GroupData

class ChildPlayMarketAdapter(var list: List<ChildData>) :
    RecyclerView.Adapter<ChildPlayMarketAdapter.MyViewHolder>() {


    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(childData: ChildData) {
            itemView.childAppName.text = childData.nameApp
            itemView.childAppSize.text = childData.sizeApp
            Glide.with(itemView.context)
                .load(childData.image)
                .into(itemView.imageChild)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_play_market_child, parent, false)
        return MyViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}