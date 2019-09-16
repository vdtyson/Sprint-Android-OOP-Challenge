package com.versilistyson.sprintprojectweek6.ui.activities.list

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import com.google.android.material.card.MaterialCardView
import com.versilistyson.sprintprojectweek6.R
import com.versilistyson.sprintprojectweek6.model.civilizations.Civilization
import com.versilistyson.sprintprojectweek6.model.common.Item
import com.versilistyson.sprintprojectweek6.ui.fragments.FragmentDetail
import kotlinx.android.synthetic.main.aoe_item_cv.view.*

class ItemRecyclerView(var items: List<Item>, val context: Context): RecyclerView.Adapter<ItemRecyclerView.ViewHolder>() {
    companion object {
        const val LONGDESCRIPTION = "LONGDESCRIPTION"
    }
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val context = view.context
        val cardView = view.itemCV as MaterialCardView
        val detailsButton = view.cvButton_details as MaterialButton
        val nameTV = view.cvTextView_itemName as TextView
        val descriptionTV = view.cvTextView_itemDescription as TextView
        val itemTypeTV = view.cvTextView_itemType as TextView
        fun onClickListener(i: Int) {
            detailsButton.setOnClickListener {
                val fragmentInstance = FragmentDetail()
                val bundle = Bundle()
                bundle.putSerializable(LONGDESCRIPTION, items[i])
                fragmentInstance.arguments = bundle
                (context as FragmentActivity).supportFragmentManager.beginTransaction().replace(R.id.list_activity_cl, fragmentInstance).commit()
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewGroup = LayoutInflater.from(parent.context).inflate(R.layout.aoe_item_cv, parent, false)
        val holder = ViewHolder(viewGroup)
        return holder
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ItemRecyclerView.ViewHolder, i: Int) {
        holder.descriptionTV.text = items[i].getItemShortDescription()
        holder.nameTV.text = items[i].name
        holder.onClickListener(i)

    }
    interface OnRecyclerViewClickedListener {
        fun onRecyclerViewClicked(item: Item) {


        }
    }
}