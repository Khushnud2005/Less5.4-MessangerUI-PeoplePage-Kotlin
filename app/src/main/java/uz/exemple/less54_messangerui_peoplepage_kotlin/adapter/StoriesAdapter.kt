package uz.exemple.less54_messangerui_peoplepage_kotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.exemple.less54_messangerui_peoplepage_kotlin.R
import uz.exemple.less54_messangerui_peoplepage_kotlin.model.StoriesModel
import java.lang.String
import kotlin.Int
import kotlin.TODO

class StoriesAdapter(var storiesModels:ArrayList<StoriesModel>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val TYPE_CREATE = 0
    private val TYPE_PEOPLE = 1
    override fun getItemViewType(position: Int): Int {
        val item = storiesModels[position]
        return if (item.profile == null) {
            TYPE_CREATE
        } else TYPE_PEOPLE
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == TYPE_CREATE) {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_add_story_view, parent, false)
            return CreateViewHolder(view)
        }
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_add_people_view, parent, false)
        return PeopleViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = storiesModels[position]
        if (holder is PeopleViewHolder) {
            val background = holder.background
            val profile = holder.profile
            val countStory = holder.countStory
            val fullName = holder.fullName
            background.setImageResource(item.background)
            profile.setImageResource(item.profile!!)
            countStory.setText(String.valueOf(item.countStories))
            fullName.setText(item.fullName)
        }
    }

    override fun getItemCount(): Int {
        return storiesModels.size
    }

    class CreateViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    class PeopleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val background: ImageView
        val profile: ImageView
        val countStory: TextView
        val fullName: TextView

        init {
            background = itemView.findViewById(R.id.iv_background)
            profile = itemView.findViewById(R.id.iv_profile)
            countStory = itemView.findViewById(R.id.tv_countStories)
            fullName = itemView.findViewById(R.id.tv_fullName)
        }
    }
}