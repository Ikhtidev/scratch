package uz.murodov.scratch.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import uz.murodov.scratch.R
import uz.murodov.scratch.adapters.CommandAdapter
import uz.murodov.scratch.adapters.CategoryCommandAdapter
import uz.murodov.scratch.databinding.ActivityMainBinding
import uz.murodov.scratch.model.Command
import uz.murodov.scratch.model.CategoryCommand

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
    }

    private fun initViews() {
        val categoryCommandList = ArrayList<CategoryCommand?>()
        val commands = ArrayList<Command?>()

        categoryCommandList.add(CategoryCommand(motionCommands, "Motion", R.color.color_category_motion))
        categoryCommandList.add(CategoryCommand(looksCommands, "Looks", R.color.color_category_looks))

        val categoryAdapter = CategoryCommandAdapter(categoryCommandList, onCategoryClick = { category, categoryPosition ->
            val commandAdapter = CommandAdapter(category!!.commands, onCommandClick = { command, commandPosition ->
                Toast.makeText(
                    this@MainActivity,
                    "${commandPosition}dagi $command bosildi",
                    Toast.LENGTH_SHORT
                ).show()
            })
            binding.rvActions.adapter = commandAdapter
        })

        binding.rvTabs.adapter = categoryAdapter

    }

    private var motionCommands = arrayListOf(Command(R.drawable.ic_motion_0),Command(R.drawable.ic_motion_1),Command(R.drawable.ic_motion_2),Command(R.drawable.ic_motion_3),Command(R.drawable.ic_motion_4),Command(R.drawable.ic_motion_5),Command(R.drawable.ic_motion_6),Command(R.drawable.ic_motion_7),Command(R.drawable.ic_motion_8),Command(R.drawable.ic_motion_9),Command(R.drawable.ic_motion_10),Command(R.drawable.ic_motion_11),Command(R.drawable.ic_motion_12),Command(R.drawable.ic_motion_13))
    private var looksCommands = arrayListOf(Command(R.drawable.ic_looks_0),Command(R.drawable.ic_looks_1),Command(R.drawable.ic_looks_2),Command(R.drawable.ic_looks_3),Command(R.drawable.ic_looks_4),Command(R.drawable.ic_looks_5),Command(R.drawable.ic_looks_6),Command(R.drawable.ic_looks_7),Command(R.drawable.ic_looks_8),Command(R.drawable.ic_looks_9),Command(R.drawable.ic_looks_10),Command(R.drawable.ic_looks_11),Command(R.drawable.ic_looks_12),Command(R.drawable.ic_looks_13),Command(R.drawable.ic_looks_14),Command(R.drawable.ic_looks_15))

}