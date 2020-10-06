package com.example.recipesv2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recipesv2.databinding.ListItemRecipesBinding

class RecipesAdapter : RecyclerView.Adapter<RecipesAdapter.ViewHolder>() {
    var recipeList = listOf("recipe 1", "recipe 2", "recipe 3")

    class ViewHolder(val binding: ListItemRecipesBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(recipeName: String) {
            binding.recipeNameTextview.text = recipeName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemRecipesBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount() = recipeList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(recipeList[position])
    }
}

