package com.versilistyson.sprintprojectweek6.ui.fragments

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import com.versilistyson.sprintprojectweek6.R
import com.versilistyson.sprintprojectweek6.model.common.Item
import com.versilistyson.sprintprojectweek6.ui.activities.list.ItemRecyclerView
import com.versilistyson.sprintprojectweek6.ui.activities.list.ListActivity
import kotlinx.android.synthetic.main.fragment_fragment_detail.*
import kotlinx.android.synthetic.main.fragment_fragment_detail.view.*

// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER




class FragmentDetail : Fragment() {
    private var listener: OnFragmentInteractionListener? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fragment_detail, container, false)

        return view
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }


    interface OnFragmentInteractionListener {
        fun onFragmentInteraction(item: Item)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val item = arguments?.getSerializable(ItemRecyclerView.LONGDESCRIPTION) as Item
        val context = view.context
        view.detailFragmentTV_description.text = item.longDescription
        view.detailFragmentButton.setOnClickListener {

           listener?.onFragmentInteraction(item)
        }
    }
}
