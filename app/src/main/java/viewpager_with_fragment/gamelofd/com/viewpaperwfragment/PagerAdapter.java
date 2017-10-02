package viewpager_with_fragment.gamelofd.com.viewpaperwfragment;
        import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentManager;
        import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Tabfragmen1 tab1 = new Tabfragmen1();
                return tab1;
            case 1:
                Tabfragmen2 tab2 = new Tabfragmen2();
                return tab2;
            case 2:
                Tabfragmen3 tab3 = new Tabfragmen3();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}