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
import com.versilistyson.sprintprojectweek6.ui.activities.list.ItemRecyclerView
import com.versilistyson.sprintprojectweek6.ui.activities.list.ListActivity
import kotlinx.android.synthetic.main.fragment_fragment_detail.*
import kotlinx.android.synthetic.main.fragment_fragment_detail.view.*

// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
private const val NAME = "NAME"

class FragmentDetail : Fragment() {
    private var param1: String? = null
    private var param2: String? = null
    private var listener: OnFragmentInteractionListener? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val name = param2
        val description = param1
        val view = inflater.inflate(R.layout.fragment_fragment_detail, container, false)
        val context = view.context
        view.detailFragmentTV_description.text = description
        view.detailFragmentButton.setOnClickListener {

            Toast.makeText(activity, "$name added to favorites", Toast.LENGTH_SHORT).show()
            val intent = Intent(activity, ListActivity::class.java)
            intent.putExtra("Name", name)
            startActivity(intent)
        }

        return view
    }

    fun onButtonPressed(uri: Uri) {
        listener?.onFragmentInteraction(uri)
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
        fun onFragmentInteraction(uri: Uri)
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FragmentDetail().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
