package com.example.myapplication.UI.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.*
import com.example.myapplication.databinding.FragmentLogInBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

private var _binding: FragmentLogInBinding? = null
private val binding get() = _binding!!
/**
* A simple [Fragment] subclass.
* Use the [LogInFragment.newInstance] factory method to
* create an instance of this fragment.
*/
class LogInFragment : Fragment() {
// TODO: Rename and change types of parameters
private var param1: String? = null
private var param2: String? = null


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
_binding = FragmentLogInBinding.inflate(inflater, container, false)
val view = binding.root
binding.servicesbutton1.setOnClickListener {
    val fragmentManager = parentFragmentManager
    val transaction = fragmentManager.beginTransaction()
    transaction.replace(R.id.fragmentcontainer, SingUpFragment.newInstance("", ""))
    transaction.addToBackStack(null)
    transaction.commit()
}
binding.about.setOnClickListener {
    findNavController().navigate(R.id.action_logInFragment_to_aboutUsFragment)
}

return view
}



companion object {
@JvmStatic
fun newInstance(s: String, s1: String) =
    LogInFragment()
}
}