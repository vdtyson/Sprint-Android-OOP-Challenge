package com.versilistyson.sprintprojectweek6.ui.activities.list

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.versilistyson.sprintprojectweek6.AOERequestApi
import com.versilistyson.sprintprojectweek6.model.civilizations.Civilization
import com.versilistyson.sprintprojectweek6.model.common.Item
import com.versilistyson.sprintprojectweek6.model.common.enqueue
import com.versilistyson.sprintprojectweek6.model.structures.Structure
import com.versilistyson.sprintprojectweek6.model.technologies.Technology
import com.versilistyson.sprintprojectweek6.model.units.Units
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListActivityVM: ViewModel() {

    //Tracks List of Data sent From API
    private val itemList = mutableListOf<Item>()
    //Type of Items in the List
    lateinit var itemListType: Item.ItemType
    //retriever
    val retriever = AOERequestApi.create()

    fun onFilterChanged() {

    }

    open fun onResponse() {
    }
    open fun onFailure() {
        //doSomething
    }

    fun getItems() {

        when(itemListType) {

            Item.ItemType.Unit -> {
                retriever.getUnits().enqueue {
                    onResponse = {
                        if(it.isSuccessful) {
                            itemList.clear()
                            itemList.add(it.body() as Item)
                        }
                    }
                    onFailure = {
                        Log.i("Failure", "Response Failed")
                    }
                }
            }
            Item.ItemType.Technology -> {
                retriever.getTechnologies().enqueue {
                    onResponse = {}
                    onFailure = {}
                }

            }

            Item.ItemType.Structure -> retriever.getStructures().enqueue {

            }
            Item.ItemType.Civilization -> retriever.getCivilizations().enqueue {

            }
            Item.ItemType.All -> retriever.getCivilizations().enqueue() {

            }

        }
    }


}