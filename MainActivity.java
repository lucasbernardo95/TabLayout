package com.example.lber.tablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vp = (ViewPager) findViewById(R.id.pager);
        PagerAdapter pa = new FixedTabsPageAdapter(getSupportFragmentManager());//passa como parâmetro o gerenciador de fragments
        vp.setAdapter(pa);
        tabLayout = (TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(vp);

        tabLayout.getTabAt(0).setIcon(android.R.drawable.presence_offline);
        tabLayout.getTabAt(1).setIcon(android.R.drawable.star_off);
        tabLayout.getTabAt(2).setIcon(android.R.drawable.btn_star_big_off);

        ViewPager viewPager = (ViewPager) vp.findViewById(R.id.pager);

        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                Log.i("Tag", "Scroll");
            }
            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        Log.i("Tag", "p = 0");
                        tabLayout.getTabAt(1).setIcon(android.R.drawable.star_off);
                        tabLayout.getTabAt(2).setIcon(android.R.drawable.btn_star_big_off);

                        tabLayout.getTabAt(0).setIcon(android.R.drawable.presence_online);
                        break;
                    case 1:
                        Log.i("Tag", "p = 1");
                        tabLayout.getTabAt(0).setIcon(android.R.drawable.presence_offline);
                        tabLayout.getTabAt(2).setIcon(android.R.drawable.btn_star_big_off);

                        tabLayout.getTabAt(1).setIcon(android.R.drawable.star_on);
                        break;
                    case 2:
                        Log.i("Tag", "p = 2");
                        tabLayout.getTabAt(0).setIcon(android.R.drawable.presence_offline);
                        tabLayout.getTabAt(1).setIcon(android.R.drawable.star_off);

                        tabLayout.getTabAt(2).setIcon(android.R.drawable.btn_star_big_on);
                        break;//
                    default:
                        return;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                Log.i("Tag", "ScrollStateChanged");
            }
        });
    }


}
