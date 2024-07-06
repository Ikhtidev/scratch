package uz.murodov.scratch.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import uz.murodov.scratch.R
import uz.murodov.scratch.databinding.ItemCategoryCommandBinding
import uz.murodov.scratch.model.CategoryCommand


class CategoryCommandAdapter(
    private var categories: ArrayList<CategoryCommand?>,
    private val onCategoryClick: (category: CategoryCommand?, categoryPosition: Int?) -> Unit
) : RecyclerView.Adapter<CategoryCommandAdapter.CategoryViewHolder>() {

    init {
        onCategoryClick(categories[0], 0)
    }
    private var selectedItemPosition: Int = 0

    inner class CategoryViewHolder(private val binding: ItemCategoryCommandBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("NotifyDataSetChanged")
        fun onBind(category: CategoryCommand?, position: Int?) {
            binding.apply {
                categoryName.text = category?.name
                categoryColor.setBackgroundColor(
                    ContextCompat.getColor(
                        root.context,
                        category?.color ?: R.color.light_yellow_900
                    )
                )

            }

            itemView.apply {
                val animation: Animation = AnimationUtils.loadAnimation(itemView.context, R.anim.fadein)
                startAnimation(animation)
                setOnClickListener {
                    onCategoryClick(category, position)
                    selectedItemPosition = position ?: -1
                    notifyDataSetChanged()
                }
            }

            if (position == selectedItemPosition) {
                itemView.setBackgroundResource(R.color.light_yellow_A200)
            } else {
                itemView.setBackgroundResource(R.color.white)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoryCommandAdapter.CategoryViewHolder {
        val view =
            ItemCategoryCommandBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: CategoryCommandAdapter.CategoryViewHolder,
        position: Int
    ) {
        val categoryCommand = categories[position]
        holder.onBind(categoryCommand, position)
    }

    override fun getItemCount(): Int = categories.size
}