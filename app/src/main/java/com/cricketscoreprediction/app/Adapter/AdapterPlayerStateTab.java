package com.cricketscoreprediction.app.Adapter;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.cricketscoreprediction.app.Fragments.Player.PlayerBattingFragment;
import com.cricketscoreprediction.app.Fragments.Player.PlayerBowlingFragment;
import com.cricketscoreprediction.app.Fragments.Player.PlayerCareerFragment;
import com.cricketscoreprediction.app.Fragments.Player.PlayerInfoFragment;
import com.cricketscoreprediction.app.Fragments.Player.PlayerKeepingFragment;
import com.cricketscoreprediction.app.PlayersDetailsQuery;
import com.cricketscoreprediction.app.Utils.Glob;

public class AdapterPlayerStateTab extends FragmentPagerAdapter {
    private Context context;
    String playerID;
    PlayersDetailsQuery.PlayersDetails playersDetails;
    int totalTabs;

    public AdapterPlayerStateTab(FragmentManager fragmentManager, Context context2, int i, String str, PlayersDetailsQuery.PlayersDetails playersDetails2) {
        super(fragmentManager);
        this.context = context2;
        this.totalTabs = i;
        this.playerID = str;
        this.playersDetails = playersDetails2;
    }

    @Override
    public Fragment getItem(int i) {
        if (i == 0) {
            Glob.playersDetail = this.playersDetails;
            return new PlayerInfoFragment();
        } else if (i == 1) {
            Glob.playersDetail = this.playersDetails;
            return new PlayerBattingFragment();
        } else if (i == 2) {
            Glob.playersDetail = this.playersDetails;
            if (Glob.isKeepingTab) {
                return new PlayerKeepingFragment();
            }
            return new PlayerBowlingFragment();
        } else if (i != 3) {
            return null;
        } else {
            Glob.playersDetail = this.playersDetails;
            return new PlayerCareerFragment();
        }
    }

    @Override
    public int getCount() {
        return this.totalTabs;
    }
}
