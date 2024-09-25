package poli.MovB01Grupo5.proyectoportafoliopersonal.ui.slideshow

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import poli.MovB01Grupo5.proyectoportafoliopersonal.R
import poli.MovB01Grupo5.proyectoportafoliopersonal.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
            ViewModelProvider(this).get(SlideshowViewModel::class.java)

        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Configura los VideoView
        setUpVideoViews()

        return root
    }

    private fun setUpVideoViews() {
        val videoView1 = binding.videoView1

        // Configurar el primer video desde res/raw
        val videoUri1 = Uri.parse("android.resource://" + requireContext().packageName + "/" + R.raw.video1)
        videoView1.setVideoURI(videoUri1)

        // Configurar MediaController para el primer VideoView
        val mediaController1 = MediaController(requireContext())
        mediaController1.setAnchorView(videoView1)
        videoView1.setMediaController(mediaController1)

        // Iniciar los videos automáticamente (opcional)
        videoView1.start()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
