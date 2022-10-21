package com.gsbusiness.livecricketscoreprediction.Adapter.MatchInfo;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.gsbusiness.livecricketscoreprediction.Fragments.MatchInfo.CommentaryFragment;
import com.gsbusiness.livecricketscoreprediction.Fragments.MatchInfo.LiveFragment;
import com.gsbusiness.livecricketscoreprediction.Fragments.MatchInfo.MatchInfoFragment;
import com.gsbusiness.livecricketscoreprediction.Fragments.MatchInfo.ScoreCardFragment;
import com.gsbusiness.livecricketscoreprediction.Utils.Glob;

public class AdapterMatchInfo extends FragmentPagerAdapter {
    private Context context;
    String currentInnings;
    String matchId;
    int totalTabs;

    public AdapterMatchInfo(FragmentManager fragmentManager, Context context2, int i, String str, String str2) {
        super(fragmentManager);
        this.context = context2;
        this.totalTabs = i;
        this.matchId = str;
        this.currentInnings = str2;
    }

    @Override
    public Fragment getItem(int i) {
        if (i == 0) {
            Bundle bundle = new Bundle();
            bundle.putString("MatchId", this.matchId);
            bundle.putString(Glob.INNINGS, this.currentInnings);
            LiveFragment liveFragment = new LiveFragment();
            liveFragment.setArguments(bundle);
            return liveFragment;
        } else if (i == 1) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("MatchId", this.matchId);
            bundle2.putString(Glob.INNINGS, this.currentInnings);
            CommentaryFragment commentaryFragment = new CommentaryFragment();
            commentaryFragment.setArguments(bundle2);
            return commentaryFragment;
        } else if (i == 2) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("MatchId", this.matchId);
            ScoreCardFragment scoreCardFragment = new ScoreCardFragment();
            scoreCardFragment.setArguments(bundle3);
            return scoreCardFragment;
        } else if (i != 3) {
            return null;
        } else {
            Bundle bundle4 = new Bundle();
            bundle4.putString("MatchId", this.matchId);
            MatchInfoFragment matchInfoFragment = new MatchInfoFragment();
            matchInfoFragment.setArguments(bundle4);
            return matchInfoFragment;
        }
    }

    @Override
    public int getCount() {
        return this.totalTabs;
    }
}
