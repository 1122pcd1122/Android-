package activitytest.example.com.roomdemo.home

import activitytest.example.com.roomdemo.R
import activitytest.example.com.roomdemo.home.lifecycle.HomeLifeCycle
import activitytest.example.com.roomdemo.home.viewmodel.BlogViewModel
import activitytest.example.com.roomdemo.main.viewModel.ConfigurationViewModel
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

class HomeFragment : Fragment() {
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val blogViewModel = ViewModelProvider(this).get(BlogViewModel::class.java)
        val configurationViewModel = ViewModelProvider(this).get(ConfigurationViewModel::class.java)
        lifecycle.addObserver(HomeLifeCycle(this, blogViewModel, configurationViewModel))
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }



}