package com.dsk.bookself.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.dsk.bookself.data.model.CategoryDetails
import com.dsk.bookself.databinding.CategoryViewBinding
import com.dsk.bookself.ui.category.CategoryDetailsImpl

class CategoryDetailsAdapter (private val recipeDetailsImpl: CategoryDetailsImpl) :
RecyclerView.Adapter<CategoryDetailsAdapter.CartListHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartListHolder {
        val binding = CategoryViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CartListHolder(binding)
    }

    override fun onBindViewHolder(holder: CartListHolder, position: Int) {
        val currentList = categoryListDiffer.currentList[position]
        holder.itemView.apply {
//            Log.d("DSK ", "${APIConstants.BASE_IMAGE_URL_w500_API}${currentList.poster_path}")
//            Glide.with(holder.itemView)
//                .asBitmap()
//                .load("${APIConstants.BASE_IMAGE_URL_w500_API}${currentList.poster_path}")
//                .into(holder.viewBinding.imageViewMovie)
            holder.viewBinding.textViewShortDescription.textViewData.text = currentList.categoryName
            holder.viewBinding.categoryDetailView.setOnClickListener {
                recipeDetailsImpl.clickListenerCategoryDetailView(currentList)
            }
        }
    }

    override fun getItemCount(): Int {
        return categoryListDiffer.currentList.size
    }

    inner class CartListHolder(var viewBinding: CategoryViewBinding) : RecyclerView.ViewHolder(viewBinding.root)

    private val differCallback = object : DiffUtil.ItemCallback<CategoryDetails>() {
        override fun areItemsTheSame(oldItem: CategoryDetails, newItem: CategoryDetails): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: CategoryDetails, newItem: CategoryDetails): Boolean {
            return oldItem == newItem
        }
    }

    val categoryListDiffer = AsyncListDiffer(this, differCallback)
}