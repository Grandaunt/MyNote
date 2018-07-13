package com.bcm.havoc.mynote;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bcm.havoc.mynote.Adapter.NoteAdapter;
import com.bcm.havoc.mynote.Calendar.base.activity.BaseActivity;
import com.bcm.havoc.mynote.Calendar.colorful.ColorfulActivity;
import com.bcm.havoc.mynote.Calendar.custom.CustomActivity;
import com.bcm.havoc.mynote.Calendar.index.IndexActivity;
import com.bcm.havoc.mynote.Calendar.pager.ViewPagerActivity;
import com.bcm.havoc.mynote.Calendar.progress.ProgressActivity;
import com.bcm.havoc.mynote.Calendar.simple.SimpleActivity;
import com.bcm.havoc.mynote.Calendar.single.SingleActivity;
import com.bcm.havoc.mynote.Calendar.solay.SolarActivity;
import com.bcm.havoc.mynote.Entity.UserEntity;
import com.bcm.havoc.mynote.Utils.DividerItemDecoration;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.haibin.calendarview.Calendar;
import com.haibin.calendarview.CalendarView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity
        implements
        NavigationView.OnNavigationItemSelectedListener,
        CalendarView.OnDateSelectedListener,
        CalendarView.OnYearChangeListener,
        View.OnClickListener {
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    private int bgColors[];
    private ArrayList<Fragment> fragmentList = new ArrayList<>();
    private ImageButton im_btn_rili;
    TextView mTextMonthDay;

    TextView mTextYear;

    TextView mTextLunar;

    TextView mTextCurrentDay;

    CalendarView mCalendarView;

    RelativeLayout mRelativeTool;
    private int mYear;
//    CalendarLayout mCalendarLayout;
     RecyclerView mRecyclerView;
    ImageButton mRiliImageBtn;
    NoteAdapter noteAdapter;
//    public static void show(Context context) {
//        context.startActivity(new Intent(context, ViewPagerActivity.class));
//    }
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        getData();
//        initView();
//    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void initView() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setSubtitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        UserEntity userEntity = new UserEntity("", "主人", "", "超越一切吧~", "18");

/**
 * 悬浮按钮start
 */
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
/**
 * 悬浮按钮end
 */
/**
 * 侧边栏start
 */
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
/**
 * 侧边栏end
 */
/**
 * 日历start
 */
        setStatusBarDarkMode();
        mTextMonthDay = (TextView) findViewById(R.id.tv_month_day);
        mTextYear = (TextView) findViewById(R.id.tv_year);
        mTextLunar = (TextView) findViewById(R.id.tv_lunar);
        mRelativeTool = (RelativeLayout) findViewById(R.id.rl_tool);
        mCalendarView = (CalendarView) findViewById(R.id.calendarView);
        mTextCurrentDay = (TextView) findViewById(R.id.tv_current_day);
        mTextMonthDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (!mCalendarLayout.isExpand()) {
//                    mCalendarView.showYearSelectLayout(mYear);
//                    return;
//                }
                mCalendarView.showYearSelectLayout(mYear);
                mTextLunar.setVisibility(View.GONE);
                mTextYear.setVisibility(View.GONE);
                mTextMonthDay.setText(String.valueOf(mYear));
            }
        });
        findViewById(R.id.fl_current).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCalendarView.scrollToCurrent();
            }
        });
        findViewById(R.id.im_rili).setOnClickListener(this);
//        mCalendarLayout = (CalendarLayout) findViewById(R.id.calendarLayout);
        mCalendarView.setOnDateSelectedListener(this);
        mCalendarView.setOnYearChangeListener(this);
        mTextYear.setText(String.valueOf(mCalendarView.getCurYear()));
        mYear = mCalendarView.getCurYear();
        mTextMonthDay.setText(mCalendarView.getCurMonth() + "月" + mCalendarView.getCurDay() + "日");
        mTextLunar.setText("今日");
        mTextCurrentDay.setText(String.valueOf(mCalendarView.getCurDay()));
        mCalendarView.setVisibility(View.GONE);//隐藏
/**
 * 日历end
 */
    }

    /**
     * 左上角设置代码start
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_settings:
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * 左上角设置代码end
     */
    /**
     * 侧边栏代码start
     */
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_setting) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    /**
     * 侧边栏代码end
     */

    /**
     * 日历start
     */
    @Override
    protected void initData() {
        List<Calendar> schemes = new ArrayList<>();
        int year = mCalendarView.getCurYear();
        int month = mCalendarView.getCurMonth();

        schemes.add(getSchemeCalendar(year, month, 3, 0xFF40db25, "假"));
        schemes.add(getSchemeCalendar(year, month, 6, 0xFFe69138, "事"));
        schemes.add(getSchemeCalendar(year, month, 9, 0xFFdf1356, "议"));
        schemes.add(getSchemeCalendar(year, month, 13, 0xFFedc56d, "记"));
        schemes.add(getSchemeCalendar(year, month, 14, 0xFFedc56d, "记"));
        schemes.add(getSchemeCalendar(year, month, 15, 0xFFaacc44, "假"));
        schemes.add(getSchemeCalendar(year, month, 18, 0xFFbc13f0, "记"));
        schemes.add(getSchemeCalendar(year, month, 25, 0xFF13acf0, "假"));
        schemes.add(getSchemeCalendar(year, month, 27, 0xFF13acf0, "多"));
        mCalendarView.setSchemeDate(schemes);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_main);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.addItemDecoration(new DividerItemDecoration());
//        mRecyclerView.setAdapter(new NoteAdapter(null));
//        mRecyclerView.notifyDataSetChanged();
        noteAdapter = new NoteAdapter(null);
        mRecyclerView.setAdapter(noteAdapter);
//        noteAdapter.setOnRecyclerViewItemClickListener(new BaseQuickAdapter.OnRecyclerViewItemClickListener<DayReportinfo>() {
//            @Override
//            public void onItemClick(View view, int position, DayReportinfo item) {
//                intent = new Intent(JournalListActivity.this, JournalInfoActivity.class);
//                intent.putExtra(JournalInfoActivity.intenttag1, item);
//                startActivity(intent);
//            }
//        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.im_rili:
//                showCalendar();
                if (mCalendarView.getVisibility()==View.VISIBLE) {
                    mCalendarView.setVisibility(View.GONE);//隐藏
                }
                else {
                    mCalendarView.setVisibility(View.VISIBLE);//可见
                }

                break;
            case R.id.ll_simple:
                SimpleActivity.show(this);
                break;
            case R.id.ll_colorful:
                ColorfulActivity.show(this);
                break;
            case R.id.ll_index:
                IndexActivity.show(this);
                break;
            case R.id.ll_tab:
                ViewPagerActivity.show(this);
                break;
            case R.id.ll_single:
                SingleActivity.show(this);
                break;
            case R.id.ll_solar_system:
                SolarActivity.show(this);
                break;
            case R.id.ll_progress:
                ProgressActivity.show(this);
                break;
            case R.id.ll_custom:
                CustomActivity.show(this);
                break;
        }
    }


    private Calendar getSchemeCalendar(int year, int month, int day, int color, String text) {
        Calendar calendar = new Calendar();
        calendar.setYear(year);
        calendar.setMonth(month);
        calendar.setDay(day);
        calendar.setSchemeColor(color);//如果单独标记颜色、则会使用这个颜色
        calendar.setScheme(text);
        calendar.addScheme(new Calendar.Scheme());
        calendar.addScheme(0xFF008800, "假");
        calendar.addScheme(0xFF008800, "节");
        return calendar;
    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onDateSelected(Calendar calendar, boolean isClick) {
        mTextLunar.setVisibility(View.VISIBLE);
        mTextYear.setVisibility(View.VISIBLE);
        mTextMonthDay.setText(calendar.getMonth() + "月" + calendar.getDay() + "日");
        mTextYear.setText(String.valueOf(calendar.getYear()));
        mTextLunar.setText(calendar.getLunar());
        mYear = calendar.getYear();
//        mCalendarView.setVisibility(View.GONE);//隐藏
    }


    @Override
    public void onYearChange(int year) {
        mTextMonthDay.setText(String.valueOf(year));
//        mCalendarView.setVisibility(View.GONE);//隐藏
    }


}