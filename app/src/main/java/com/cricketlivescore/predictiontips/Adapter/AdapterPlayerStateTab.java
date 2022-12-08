package com.cricketlivescore.predictiontips.Adapter;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.cricketlivescore.predictiontips.Fragments.Player.PlayerBattingFragment;
import com.cricketlivescore.predictiontips.Fragments.Player.PlayerBowlingFragment;
import com.cricketlivescore.predictiontips.Fragments.Player.PlayerCareerFragment;
import com.cricketlivescore.predictiontips.Fragments.Player.PlayerInfoFragment;
import com.cricketlivescore.predictiontips.Fragments.Player.PlayerKeepingFragment;
import com.cricketlivescore.predictiontips.PlayersDetailsQuery;
import com.cricketlivescore.predictiontips.Utils.Glob;

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
