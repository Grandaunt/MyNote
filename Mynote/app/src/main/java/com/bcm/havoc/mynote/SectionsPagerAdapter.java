package com.bcm.havoc.mynote;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;


public class SectionsPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;
    private int[] mImages; // 图片资源ID数组
    private List<ImageView> mImageViews; // ImageView集合
    private int cp=7;
    private FragmentManager fragmentManager;
    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
        fragmentManager = fm;
    }

    @Override
    public Fragment getItem(int position) {
        cp=position+1;
//        position
        // 滑动到某页后更新数据、UI 0-6
//        if(position==5){
//            return   PlaceholderFragment.newInstance(position +3);
//        }
//        else if(position==1){
//            return   PlaceholderFragment.newInstance(position -2);
//        }
//        else {
            return PlaceholderFragment.newInstance(position + 1);
//        }
    }

    @Override
    public int getCount() {
//        return 7;
        int aaa = cp <=1 ? cp : Short.MAX_VALUE;
//        return cp <=1 ? cp : Short.MAX_VALUE;
        return aaa;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        fragmentManager.beginTransaction()
                    .add(R.id.constraintLayout,new PlaceholderFragment())
                    .commit();
        return fragmentManager;
    }
    private static String makeFragmentName(int viewId, long id) {
        return "android:switcher:" + viewId + ":" + id;
    }
}

