package com.example.comicstoreapp

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.example.comicstoreapp.placeholder.PlaceholderContent.PlaceholderItem
import com.example.comicstoreapp.databinding.FragmentItemBinding

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyComicRecyclerViewAdapter(
    private val values: List<PlaceholderItem>
) : RecyclerView.Adapter<MyComicRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FragmentItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.idView.text = item.id
        holder.contentView.text = item.content
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val idView: TextView = binding.comicTitle
        val contentView: TextView = binding.comicResume

        override fun toString(): String {
            return super.toString() + " '" + contentView.text + "'"
        }
    }

}