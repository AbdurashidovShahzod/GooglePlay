package uz.unzosoft.googleplay.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.group_play_market.view.*
import uz.unzosoft.googleplay.R
import uz.unzosoft.googleplay.models.GroupData

class GroupPlayMarketAdapter(var listGroup: List<GroupData>) :
    RecyclerView.Adapter<GroupPlayMarketAdapter.MyViewHolder>() {


    inner class MyViewHolder(var view: View) : RecyclerView.ViewHolder(view) {

        fun bind(groupData: GroupData) {
            view.tv.text = groupData.title
            var childPlayMarketAdapter = ChildPlayMarketAdapter(groupData.list!!)
            view.rv.adapter = childPlayMarketAdapter
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
            .inflate(R.layout.group_play_market, parent, false)
        return MyViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(listGroup[position])
    }

    override fun getItemCount(): Int = listGroup.size
}