package com.example.dummyprojects

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TopUpAdapter(private val dataList: ArrayList<OfferModel>, private val code: Int) :
    RecyclerView.Adapter<TopUpAdapter.CustomViewHolder>() {
    private var mOnClickListener: OnClickListener? = null

    class CustomViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val title = itemview.findViewById<TextView>(R.id.titleTV)
        val cashBack = itemview.findViewById<TextView>(R.id.cashBackTV)
        val duration = itemview.findViewById<TextView>(R.id.durationTV)
        val amount = itemview.findViewById<TextView>(R.id.amountTV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val item =
            LayoutInflater.from(parent.context).inflate(R.layout.minute_pack_design, parent, false)
        return CustomViewHolder(item)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.title.text = dataList[position].title
        holder.cashBack.text = dataList[position].cashBack
        holder.duration.text = dataList[position].duration
        holder.amount.text = dataList[position].amount.toString()
//        holder.delete.setOnClickListener {
//            if (mOnClickListener != null) {
//                mOnClickListener!!.onClick(position, dataList[position])
//            }
//        }
    }

    fun setOnClickListener(onClickListener: OnClickListener) {
        this.mOnClickListener = onClickListener
    }

    interface OnClickListener {
        fun onClick(position: Int, todo: OfferModel)
    }

}