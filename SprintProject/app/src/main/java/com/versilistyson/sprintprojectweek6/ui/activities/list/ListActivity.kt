package com.versilistyson.sprintprojectweek6.ui.activities.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.versilistyson.sprintprojectweek6.R

class ListActivity : AppCompatActivity() {

    lateinit var model: ListActivityVM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        model = ViewModelProviders.of(this).get(ListActivityVM::class.java)

        val filterObserver = Observer<>
    }
}
