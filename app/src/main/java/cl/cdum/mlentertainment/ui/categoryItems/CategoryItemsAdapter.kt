package cl.cdum.mlentertainment.ui.categoryItems

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import cl.cdum.mlentertainment.R
import cl.cdum.mlentertainment.data.model.categoryItems.CategoryResult
import cl.cdum.mlentertainment.databinding.ItemCategoryBinding
import cl.cdum.mlentertainment.util.extensions.currencyFormat
import cl.cdum.mlentertainment.util.extensions.gone
import cl.cdum.mlentertainment.util.extensions.strike
import cl.cdum.mlentertainment.util.extensions.visible
import com.bumptech.glide.Glide

class CategoryItemsAdapter(private val listener: OnItemClickListener) :
    ListAdapter<CategoryResult, CategoryItemsAdapter.ViewHolder>(ListComparator()) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding =
            ItemCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding, parent.context)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = getItem(position)
        if (currentItem != null) {
            holder.bind(currentItem, listener)
        }
    }

    class ViewHolder(
        private val binding: ItemCategoryBinding,
        private val context: Context
    ) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(result: CategoryResult, listener: OnItemClickListener) {
            binding.apply {
                root.setOnClickListener {
                    listener.onItemClick(result)
                }

                result.apply {
//                    Glide.with(itemView)
//                        .load(thumbnail)
//                        .into(ivPhoto)

                    tvId.text = id
                    tvTitle.text = title
                    tvCondition.text = context.getString(R.string.condition, condition)
                    tvAvailableQuantity.text = context.getString(
                        R.string.available_quantity,
                        available_quantity.toString()
                    )

                    val currencyPrice = (price ?: 0).toLong()
                    val originalPrice = (original_price ?: 0).toLong()

                    if (originalPrice == 0L || originalPrice == currencyPrice) {
                        tvOriginalPrice.gone()
                    } else {
                        tvOriginalPrice.visible()
                        tvOriginalPrice.text = originalPrice.currencyFormat()
                        tvOriginalPrice.strike()
                    }

                    tvPrice.text = currencyPrice.currencyFormat()
                }
            }
        }
    }

    class ListComparator : DiffUtil.ItemCallback<CategoryResult>() {
        override fun areItemsTheSame(oldItem: CategoryResult, newItem: CategoryResult) =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: CategoryResult, newItem: CategoryResult) =
            oldItem == newItem
    }

    interface OnItemClickListener {
        fun onItemClick(result: CategoryResult)
    }
}