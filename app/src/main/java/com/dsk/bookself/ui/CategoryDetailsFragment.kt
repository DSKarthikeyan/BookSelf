package com.dsk.bookself.ui

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dsk.bookself.R

class CategoryDetailsFragment : Fragment(R.layout.fragment_category_list) {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("DSK", "onAttach FragmentA")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("DSK", "onCreate FragmentA")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("DSK", "onCreateView FragmentA")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("DSK", "onViewCreated FragmentA")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("DSK", "onActivityCreated FragmentA")
    }

    override fun onStart() {
        super.onStart()
        Log.d("DSK", "onStart FragmentA")
    }

    override fun onResume() {
        super.onResume()
        Log.d("DSK", "onResume FragmentA")
    }

    override fun onPause() {
        super.onPause()
        Log.d("DSK", "onPause FragmentA")
    }

    override fun onStop() {
        super.onStop()
        Log.d("DSK", "onStop FragmentA")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("DSK", "onDestroyView FragmentA")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("DSK", "onDestroy FragmentA")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("DSK", "onDetach FragmentA")
    }
}