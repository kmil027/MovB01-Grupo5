package poli.MovB01Grupo5.proyectoportafoliopersonal.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import poli.MovB01Grupo5.proyectoportafoliopersonal.R
import poli.MovB01Grupo5.proyectoportafoliopersonal.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null


    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel = ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)

        val root: View = binding.root

        val btn = root.findViewById<Button>(/* id = */ R.id.btn1)
        btn.setOnClickListener {
            Toast.makeText(context, "¡Bienvenido!", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_nav_gallery_to_nav_contacto)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}