package com.versilistyson.sprintprojectweek6.ui.activities.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.versilistyson.sprintprojectweek6.R
import com.versilistyson.sprintprojectweek6.model.civilizations.AOEItemMockData
import com.versilistyson.sprintprojectweek6.model.common.Item
import com.versilistyson.sprintprojectweek6.model.units.ItemTypeUnit
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    private lateinit var itemAdapter: ItemRecyclerView
    val list = mutableListOf<Item>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val longDescription = intent.getStringExtra(ItemRecyclerView.LONGDESCRIPTION)


       val unitList = AOEItemMockData.UnitList
        val civilList = AOEItemMockData.CivilizationList
        val structList = AOEItemMockData.StructureList
        val techList = AOEItemMockData.TechnologyList

        initRecyclerView()


    }
    fun initRecyclerView() {
        listActvity_rv.apply {
            layoutManager = LinearLayoutManager(this@ListActivity)
            itemAdapter = ItemRecyclerView(list)
            adapter = itemAdapter

        }
    }
}
