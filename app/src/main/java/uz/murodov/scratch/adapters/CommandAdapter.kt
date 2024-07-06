package uz.murodov.scratch.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import uz.murodov.scratch.R
import uz.murodov.scratch.databinding.ItemCommandBinding
import uz.murodov.scratch.model.Command

class CommandAdapter(
    private var commands: ArrayList<Command>,
    private val onCommandClick: (command: Command?, commandPosition: Int?) -> Unit
) : RecyclerView.Adapter<CommandAdapter.CommandViewHolder>() {

    inner class CommandViewHolder(private val binding: ItemCommandBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(command: Command?, position: Int?) {
            binding.root.apply {
                setImageResource(command?.img ?: R.drawable.ic_motion_0)
                val animation: Animation =
                    AnimationUtils.loadAnimation(itemView.context, R.anim.lefttoright)
                startAnimation(animation)
                setOnClickListener {
                    onCommandClick(command, position)
                }
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CommandAdapter.CommandViewHolder {
        val view =
            ItemCommandBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CommandViewHolder(view)
    }

    override fun onBindViewHolder(holder: CommandViewHolder, position: Int) {
        val command = commands[position]
        holder.apply {
            onBind(command, position)
        }
    }

    override fun getItemCount(): Int = commands.size
}