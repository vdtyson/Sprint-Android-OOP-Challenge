package com.versilistyson.sprintprojectweek6.ui.activities.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.versilistyson.sprintprojectweek6.R
import com.versilistyson.sprintprojectweek6.viewmodel.AOEItemMockData
import com.versilistyson.sprintprojectweek6.model.common.Item
import com.versilistyson.sprintprojectweek6.ui.fragments.FragmentDetail
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity(), FragmentDetail.OnFragmentInteractionListener {

    override fun onFragmentInteraction(item: Item) {
        Toast.makeText(this, "$item is favorited", Toast.LENGTH_SHORT).show()
    }



    private lateinit var itemAdapter: ItemRecyclerView
    var viewModel: AOEItemMockData? = null
    val list = mutableListOf<Item>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)


        val longDescription = intent.getStringExtra(ItemRecyclerView.LONGDESCRIPTION)
        viewModel = AOEItemMockData()

        initRecyclerView()


    }
    fun initRecyclerView() {
        listActvity_rv.apply {
            layoutManager = LinearLayoutManager(this@ListActivity, LinearLayoutManager.VERTICAL, false)
            itemAdapter = ItemRecyclerView(viewModel!!.addToList(), this@ListActivity)
            adapter = itemAdapter
        }
    }

}
