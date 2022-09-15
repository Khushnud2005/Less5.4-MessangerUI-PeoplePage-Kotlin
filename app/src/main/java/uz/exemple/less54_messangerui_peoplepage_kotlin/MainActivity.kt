package uz.exemple.less54_messangerui_peoplepage_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.exemple.less54_messangerui_peoplepage_kotlin.adapter.StoriesAdapter
import uz.exemple.less54_messangerui_peoplepage_kotlin.model.StoriesModel

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerview: RecyclerView
    private lateinit var storiesModels: ArrayList<StoriesModel>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        recyclerview = findViewById(R.id.recyclerView)
        recyclerview.setLayoutManager(GridLayoutManager(this, 2))
        storiesModels = ArrayList<StoriesModel>()
        storiesModels.add(StoriesModel(null, R.drawable.back01, 0, "Add to Story"))
        storiesModels.add(
            StoriesModel(
                R.drawable.photo2,
                R.drawable.back2,
                4,
                "Barnoxon Kabirova"
            )
        )
        storiesModels.add(
            StoriesModel(
                R.drawable.photo3,
                R.drawable.back32,
                7,
                "Kamola Nematjonova"
            )
        )
        storiesModels.add(
            StoriesModel(
                R.drawable.photo4,
                R.drawable.back4,
                12,
                "Abdullatif Nematjonov"
            )
        )
        storiesModels.add(
            StoriesModel(
                R.drawable.photo1,
                R.drawable.back5,
                3,
                "Xushnud Boymurodov"
            )
        )
        storiesModels.add(
            StoriesModel(
                R.drawable.photo2,
                R.drawable.back2,
                4,
                "Barnoxon Kabirova"
            )
        )
        storiesModels.add(
            StoriesModel(
                R.drawable.photo3,
                R.drawable.back32,
                7,
                "Kamola Nematjonova"
            )
        )
        storiesModels.add(
            StoriesModel(
                R.drawable.photo4,
                R.drawable.back4,
                12,
                "Abdullatif Nematjonov"
            )
        )
        storiesModels.add(
            StoriesModel(
                R.drawable.photo1,
                R.drawable.back5,
                3,
                "Xushnud Boymurodov"
            )
        )
        storiesModels.add(
            StoriesModel(
                R.drawable.photo3,
                R.drawable.back32,
                7,
                "Kamola Nematjonova"
            )
        )
        val adapter = StoriesAdapter(storiesModels)
        recyclerview.setAdapter(adapter)
    }
}