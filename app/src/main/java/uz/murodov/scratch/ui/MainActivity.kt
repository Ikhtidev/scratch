package uz.murodov.scratch.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import uz.murodov.scratch.R
import uz.murodov.scratch.adapters.CategoryCommandAdapter
import uz.murodov.scratch.adapters.CommandAdapter
import uz.murodov.scratch.databinding.ActivityMainBinding
import uz.murodov.scratch.model.CategoryCommand
import uz.murodov.scratch.model.Command
import uz.murodov.scratch.utils.Categories

/**
 * created by Ikhtidev on 20.07.2023
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setAdapters()
    }

    private fun setAdapters() {
        val categoryAdapter = CategoryCommandAdapter(
            Categories.categoryCommandList,
            onCategoryClick = { category, _ ->
                categoryClicked(category)
            })
        binding.rvCategory.adapter = categoryAdapter
    }

    private fun categoryClicked(category: CategoryCommand?) {
        binding.pdfView.recycle()
        binding.tvLearnMore.apply {
            visibility = View.INVISIBLE
            clearAnimation()
        }
        val commandAdapter = CommandAdapter(category!!.commands, onCommandClick = { command, _ ->
            commandClicked(command)
        })
        binding.rvCommand.adapter = commandAdapter
    }

    private fun commandClicked(command: Command) {

        val animForMore = AnimationUtils.loadAnimation(this, R.anim.anim_learn_more)
        binding.tvLearnMore.apply {
            visibility = View.VISIBLE
            startAnimation(animForMore)
            setOnClickListener {
                // URL of Google Drive file
                val fileUrl = "https://docs.google.com/document/d/12ZFWua2FzQvZqLidoD9Qf-69OI93hstV"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(fileUrl))
                startActivity(intent)
            }
        }

        val fileName = "${command.slug}.pdf"

        binding.pdfView.fromAsset(fileName)
            .enableSwipe(true)
//            .invalidPageColor(R.color.white)
            .swipeHorizontal(false)
            .enableDoubletap(false)
            .defaultPage(0)
            .onError {
                Toast.makeText(
                    this@MainActivity,
                    getString(R.string.unknown_error),
                    Toast.LENGTH_SHORT
                ).show()
            }
            .load()
    }
}