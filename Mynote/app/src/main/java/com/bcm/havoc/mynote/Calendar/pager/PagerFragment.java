package com.bcm.havoc.mynote.Calendar.pager;

import android.support.v7.widget.LinearLayoutManager;

import com.bcm.havoc.mynote.Calendar.Article;
import com.bcm.havoc.mynote.Calendar.ArticleAdapter;
import com.bcm.havoc.mynote.Calendar.base.fragment.BaseFragment;
import com.bcm.havoc.mynote.Calendar.group.GroupItemDecoration;
import com.bcm.havoc.mynote.Calendar.group.GroupRecyclerView;
import com.bcm.havoc.mynote.R;


public class PagerFragment extends BaseFragment {

    private GroupRecyclerView mRecyclerView;


    public static PagerFragment newInstance() {
        return new PagerFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_pager;
    }

    @Override
    protected void initView() {
        mRecyclerView = (GroupRecyclerView) mRootView.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mRecyclerView.addItemDecoration(new GroupItemDecoration<String, Article>());
        mRecyclerView.setAdapter(new ArticleAdapter(mContext));
        mRecyclerView.notifyDataSetChanged();
    }

    @Override
    protected void initData() {

    }

    public boolean isScrollTop() {
        return mRecyclerView != null && mRecyclerView.computeVerticalScrollOffset() == 0;
    }
}
