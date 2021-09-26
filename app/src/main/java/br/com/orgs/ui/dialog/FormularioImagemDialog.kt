package br.com.orgs.ui.dialog

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import br.com.orgs.databinding.FormularioImagemBinding
import br.com.orgs.extensions.tentaCarregarImagem

class FormularioImagemDialog(private val context: Context) {

    fun mostra() {
        val binding = FormularioImagemBinding
            .inflate(LayoutInflater.from(context))
        binding.formularioImagemBotaoCarregar.setOnClickListener {
            val url = binding.formularioImagemUrl.text.toString()
            binding.formularioImagemImageview.tentaCarregarImagem(url)
        }

        AlertDialog.Builder(context)
            .setView(binding.root)
            .setPositiveButton("Confirmar") { _, _ ->
                val url = binding.formularioImagemUrl.text.toString()
                Log.i("FormularioImagem", "mostra: $url")
//                binding.activityFormularioProdutoImagem.tentaCarregarImagem(url)
            }
            .setNegativeButton("Cancelar") { _, _ ->

            }
            .show()
    }
}