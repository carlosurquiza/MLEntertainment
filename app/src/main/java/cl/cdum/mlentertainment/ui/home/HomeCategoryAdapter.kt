package cl.cdum.mlentertainment.ui.home

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import cl.cdum.mlentertainment.data.model.homeCategories.ChildrenCategory
import cl.cdum.mlentertainment.databinding.ItemHomeCategoryBinding

class HomeCategoryAdapter() :
    ListAdapter<ChildrenCategory, HomeCategoryAdapter.ViewHolder>(ListComparator()) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding =
            ItemHomeCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = getItem(position)
        if (currentItem != null) {
            holder.bind(currentItem)
        }
    }

    class ViewHolder(
        private val binding: ItemHomeCategoryBinding
    ) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(result: ChildrenCategory) {
            binding.apply {
                result.apply {
                    textTitle.text = result.name
                    textDescription.text = result.total_items_in_this_category.toString()
                }

                setColor(binding)
            }
        }

        private fun setColor(binding: ItemHomeCategoryBinding) {
            var backgroundColor = 0
            var textColor = 0

            when ((0..4).random()) {
                0 -> {
                    backgroundColor = Color.parseColor("#f57f17")
                    textColor = Color.parseColor("#ffffff")
                }
                1 -> {
                    backgroundColor = Color.parseColor("#f9a825")
                    textColor = Color.parseColor("#ffffff")
                }
                2 -> {
                    backgroundColor = Color.parseColor("#ffc107")
                    textColor = Color.parseColor("#000000")
                }
                3 -> {
                    backgroundColor = Color.parseColor("#ffe082")
                    textColor = Color.parseColor("#000000")
                }
                4 -> {
                    backgroundColor = Color.parseColor("#ff6f00")
                    textColor = Color.parseColor("#ffffff")
                }
            }

            binding.apply {
                textTitle.setTextColor(textColor)
                clContainer.setBackgroundColor(backgroundColor)
            }
        }
    }

    class ListComparator : DiffUtil.ItemCallback<ChildrenCategory>() {
        override fun areItemsTheSame(oldItem: ChildrenCategory, newItem: ChildrenCategory) =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: ChildrenCategory, newItem: ChildrenCategory) =
            oldItem == newItem
    }
}