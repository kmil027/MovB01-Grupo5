package poli.MovB01Grupo5.proyectoportafoliopersonal.ui.web

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import poli.MovB01Grupo5.proyectoportafoliopersonal.R

class WebFragment : Fragment() {

    companion object {
        fun newInstance() = WebFragment()
    }

    private val viewModel: WebViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val root = inflater.inflate(R.layout.fragment_web, container, false)
        val urlView = root.findViewById<EditText>(R.id.urlToView)
        val webBtn = root.findViewById<Button>(R.id.webBtn)
        val webView = root.findViewById<WebView>(R.id.webView)

        webView.webViewClient = object : WebViewClient() {
           override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                if (url != null) {
                    view?.loadUrl(url)
                }
                return true
            }
        }
        webView.settings.javaScriptEnabled = true

        webBtn.setOnClickListener {
            val url = urlView.text.toString()
            webView.loadUrl(url)
        }

        return root

    }
}