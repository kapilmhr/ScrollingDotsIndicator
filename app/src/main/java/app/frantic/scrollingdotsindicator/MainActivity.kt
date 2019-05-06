package app.frantic.scrollingdotsindicator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearSnapHelper
import com.chahinem.pageindicator.sample.MyAdapter
import com.chahinem.pageindicator.sample.MyPagerAdapter
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // RecyclerView
        val adapter = MyAdapter()
        list.adapter = adapter
        LinearSnapHelper().attachToRecyclerView(list)
        adapter.swapData(LIST_ITEMS)
        pageIndicator attachTo list

        // ViewPager
        val myPagerAdapter = MyPagerAdapter(LIST_ITEMS)
        pager.adapter = myPagerAdapter
        pagerPageIndicator attachTo pager

        // Manual
        manualPageIndicator.count = 50
        leftBtn.setOnClickListener { manualPageIndicator.swipePrevious() }
        rightBtn.setOnClickListener { manualPageIndicator.swipeNext() }
    }

    companion object {
        private val LIST_ITEMS = listOf(
            MyAdapter.MyItem(
                "Agapanthus",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod",
                "http://services.hanselandpetal.com/photos/agapanthus.jpg"
            ),
            MyAdapter.MyItem(
                "Cymbidium",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod",
                "http://services.hanselandpetal.com/photos/cymbidium.jpg"
            ),
            MyAdapter.MyItem(
                "Iris Siberica",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod",
                "http://services.hanselandpetal.com/photos/iris_siberica.jpg"
            ),
            MyAdapter.MyItem(
                "String of Pearls",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod",
                "http://services.hanselandpetal.com/photos/string_of_pearls.jpg"
            ),
            MyAdapter.MyItem(
                "Pincushion",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod",
                "http://services.hanselandpetal.com/photos/pincushion.jpg"
            ),
            MyAdapter.MyItem(
                "Phalaenopsis",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod",
                "http://services.hanselandpetal.com/photos/phalaenopsis.jpg"
            ),
            MyAdapter.MyItem(
                "Opuntia Cactus",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod",
                "http://services.hanselandpetal.com/photos/opuntia_cactus.jpg"
            )
        )
    }
}
