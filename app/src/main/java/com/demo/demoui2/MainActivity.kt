package com.demo.demoui2

import android.os.Bundle
import android.util.TypedValue
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.demo.demoui2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var dimensionInDp: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dimensionInDp = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            50f,
            resources.displayMetrics
        ).toInt()

        val viewPager2Adapter = ViewPagerAdapter()
        binding.viewPager2.adapter = viewPager2Adapter

        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("All"));
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Popular"));
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Recommended"));
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("More"));


        binding.rvMain.adapter = RecyclerAdapterMain()
        binding.rvMain2.layoutManager = GridLayoutManager(this, 2)
        binding.rvMain2.adapter = RecyclerAdapter2()

        binding.ivHome.setOnClickListener {
            binding.ivHome.setImageResource(R.drawable.ic_home_tint)
            binding.ivHome.layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT
            changeImageViews(1)
        }
        binding.ivBuild.setOnClickListener {
            binding.ivBuild.setImageResource(R.drawable.ic_build_tint)
            binding.ivBuild.layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT
            changeImageViews(2)
        }
        binding.ivHeart.setOnClickListener {
            binding.ivHeart.setImageResource(R.drawable.ic_heart_tint)
            binding.ivHeart.layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT
            changeImageViews(3)
        }
        binding.ivShop.setOnClickListener {
            binding.ivShop.setImageResource(R.drawable.ic_shop_tint)
            binding.ivShop.layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT
            changeImageViews(4)
        }
        binding.ivUser.setOnClickListener {
            binding.ivUser.setImageResource(R.drawable.ic_user_tint)
            binding.ivUser.layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT
            changeImageViews(5)
        }
    }

    private fun changeImageViews(id: Int) {
        when (id) {
            1 -> {
                binding.ivBuild.setImageResource(R.drawable.ic_hammer)
                binding.ivBuild.layoutParams.height = dimensionInDp

                binding.ivHeart.setImageResource(R.drawable.ic_heart)
                binding.ivHeart.layoutParams.height = dimensionInDp

                binding.ivShop.setImageResource(R.drawable.ic_shop)
                binding.ivShop.layoutParams.height = dimensionInDp

                binding.ivUser.setImageResource(R.drawable.ic_user)
                binding.ivUser.layoutParams.height = dimensionInDp
            }
            2 -> {
                binding.ivHome.setImageResource(R.drawable.ic_home)
                binding.ivHome.layoutParams.height = dimensionInDp

                binding.ivHeart.setImageResource(R.drawable.ic_heart)
                binding.ivHeart.layoutParams.height = dimensionInDp

                binding.ivShop.setImageResource(R.drawable.ic_shop)
                binding.ivShop.layoutParams.height = dimensionInDp

                binding.ivUser.setImageResource(R.drawable.ic_user)
                binding.ivUser.layoutParams.height = dimensionInDp
            }
            3 -> {
                binding.ivBuild.setImageResource(R.drawable.ic_hammer)
                binding.ivBuild.layoutParams.height = dimensionInDp

                binding.ivHome.setImageResource(R.drawable.ic_home)
                binding.ivHome.layoutParams.height = dimensionInDp

                binding.ivShop.setImageResource(R.drawable.ic_shop)
                binding.ivShop.layoutParams.height = dimensionInDp

                binding.ivUser.setImageResource(R.drawable.ic_user)
                binding.ivUser.layoutParams.height = dimensionInDp
            }
            4 -> {
                binding.ivBuild.setImageResource(R.drawable.ic_hammer)
                binding.ivBuild.layoutParams.height = dimensionInDp

                binding.ivHeart.setImageResource(R.drawable.ic_heart)
                binding.ivHeart.layoutParams.height = dimensionInDp

                binding.ivHome.setImageResource(R.drawable.ic_home)
                binding.ivHome.layoutParams.height = dimensionInDp

                binding.ivUser.setImageResource(R.drawable.ic_user)
                binding.ivUser.layoutParams.height = dimensionInDp
            }
            5 -> {
                binding.ivBuild.setImageResource(R.drawable.ic_hammer)
                binding.ivBuild.layoutParams.height = dimensionInDp

                binding.ivHeart.setImageResource(R.drawable.ic_heart)
                binding.ivHeart.layoutParams.height = dimensionInDp

                binding.ivShop.setImageResource(R.drawable.ic_shop)
                binding.ivShop.layoutParams.height = dimensionInDp

                binding.ivHome.setImageResource(R.drawable.ic_home)
                binding.ivHome.layoutParams.height = dimensionInDp
            }
        }
    }
}