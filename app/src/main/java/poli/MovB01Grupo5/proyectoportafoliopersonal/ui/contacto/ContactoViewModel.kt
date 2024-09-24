package poli.MovB01Grupo5.proyectoportafoliopersonal.ui.contacto

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ContactoViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Contacto Fragment"
    }
    val text: LiveData<String> = _text
}