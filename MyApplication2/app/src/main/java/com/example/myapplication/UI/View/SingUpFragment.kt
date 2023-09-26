package com.example.myapplication.UI.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.example.myapplication.*
import com.example.myapplication.databinding.FragmentSingUpBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

private var _binding: FragmentSingUpBinding? = null
private val binding get() = _binding!!
/**
 * A simple [Fragment] subclass.
 * Use the [SingUpFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SingUpFragment : Fragment() {
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
    ): FrameLayout {
        _binding = FragmentSingUpBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.back1.setOnClickListener {
            val fragmentManager = parentFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentcontainer, LogInFragment.newInstance("",""))
            transaction.addToBackStack(null)
            transaction.commit()

        }

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SingUpFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(s: String, s1: String) =
            SingUpFragment()
    }
}