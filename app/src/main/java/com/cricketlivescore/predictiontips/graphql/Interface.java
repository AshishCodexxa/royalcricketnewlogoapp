package com.cricketlivescore.predictiontips.graphql;

import com.cricketlivescore.predictiontips.FeaturematchQuery;
import com.cricketlivescore.predictiontips.GameChangingOversQuery;
import com.cricketlivescore.predictiontips.GetBallByBallQuery;
import com.cricketlivescore.predictiontips.GetFRCHomePageQuery;
import com.cricketlivescore.predictiontips.GetFantasySixTeamsQuery;
import com.cricketlivescore.predictiontips.GetHighlightsQuery;
import com.cricketlivescore.predictiontips.GetKeyStatsQuery;
import com.cricketlivescore.predictiontips.GetLivePlayerProjectionDetailsQuery;
import com.cricketlivescore.predictiontips.GetMatchInfoQuery;
import com.cricketlivescore.predictiontips.GetPointsTableQuery;
import com.cricketlivescore.predictiontips.GetQualificationProbabilityQuery;
import com.cricketlivescore.predictiontips.GetScoreCardQuery;
import com.cricketlivescore.predictiontips.GetStatsResolverQuery;
import com.cricketlivescore.predictiontips.GetcriclyticsCommonApiQuery;
import com.cricketlivescore.predictiontips.GetmatchStatsQuery;
import com.cricketlivescore.predictiontips.HomepageRecentFormQuery;
import com.cricketlivescore.predictiontips.InningsSummaryQuery;
import com.cricketlivescore.predictiontips.ListseriesQuery;
import com.cricketlivescore.predictiontips.MatchRatingsQuery;
import com.cricketlivescore.predictiontips.MatchSummaryQuery;
import com.cricketlivescore.predictiontips.MatcheslistQuery;
import com.cricketlivescore.predictiontips.MatchupsByIdQuery;
import com.cricketlivescore.predictiontips.MiniScoreCardQuery;
import com.cricketlivescore.predictiontips.NewScheduleQuery;
import com.cricketlivescore.predictiontips.PhaseOfSessionsQuery;
import com.cricketlivescore.predictiontips.PlayerIndexQuery;
import com.cricketlivescore.predictiontips.PlayersDetailsQuery;
import com.cricketlivescore.predictiontips.PreMatchPredectionQuery;
import com.cricketlivescore.predictiontips.ProbablePlaying11Query;
import com.cricketlivescore.predictiontips.ScheduleQuery;
import com.cricketlivescore.predictiontips.SeriesHomeCardQuery;
import com.cricketlivescore.predictiontips.SquadsQuery;
import com.cricketlivescore.predictiontips.StadiumQuery;
import com.cricketlivescore.predictiontips.TeamDiscoveryV2Query;
import com.cricketlivescore.predictiontips.VenuedetailsQuery;
import java.util.ArrayList;
import java.util.List;

public class Interface {

    public interface GetBallByBall {
        void getResponse(GetBallByBallQuery.GetBallByBall getBallByBall);
    }

    public interface GetFRCHomePage {
        void getResponse(GetFRCHomePageQuery.GetFRCHomePage getFRCHomePage);
    }

    public interface GetFantasySixTeam {
        void getResponse(List<GetFantasySixTeamsQuery.GetFantasySixTeam> list);
    }

    public interface GetFeaturematchQuery {
        void getResponse(ArrayList<FeaturematchQuery.Featurematch> arrayList);
    }

    public interface GetFinalArray {
        void getResponse(List<MatchRatingsQuery.FinalArray> list);
    }

    public interface GetGameChangingOvers {
        void getResponse(GameChangingOversQuery.GameChangingOvers gameChangingOvers);
    }

    public interface GetHighlight {
        void getResponse(GetHighlightsQuery.GetHighlights getHighlights);
    }

    public interface GetHomepageRecentForm {
        void getResponse(HomepageRecentFormQuery.HomepageRecentForm homepageRecentForm);
    }

    public interface GetInningsSummary {
        void getResponse(List<InningsSummaryQuery.InningsSummary> list);
    }

    public interface GetKeyStats {
        void getResponse(GetKeyStatsQuery.GetKeyStats getKeyStats);
    }

    public interface GetListseries {
        void getResponse(List<ListseriesQuery.Listseries> list);
    }

    public interface GetLivePlayerProjectionDetails {
        void getResponse(GetLivePlayerProjectionDetailsQuery.GetLivePlayerProjectionDetails getLivePlayerProjectionDetails);
    }

    public interface GetMatchInfo {
        void getResponse(GetMatchInfoQuery.GetMatchInfo getMatchInfo);
    }

    public interface GetMatchSummary {
        void getResponse(MatchSummaryQuery.MatchSummary matchSummary);
    }

    public interface GetMatcheslist {
        void getResponse(List<MatcheslistQuery.Matcheslist> list);
    }

    public interface GetMatchupsById {
        void getResponse(MatchupsByIdQuery.MatchupsById matchupsById);
    }

    public interface GetMiniScoreCardLive {
        void getResponse(MiniScoreCardQuery.MiniScoreCard miniScoreCard);
    }

    public interface GetMiniScoreCardQuery {
        void getResponse(MiniScoreCardQuery.MiniScoreCard miniScoreCard);
    }

    public interface GetPhaseOfSessions {
        void getResponse(PhaseOfSessionsQuery.PhaseOfSessions phaseOfSessions);
    }

    public interface GetPlayerIndex {
        void getResponse(PlayerIndexQuery.PlayerIndex playerIndex);
    }

    public interface GetPlayersDetail {
        void getResponse(PlayersDetailsQuery.PlayersDetails playersDetails);
    }

    public interface GetPointsTable {
        void getResponse(GetPointsTableQuery.GetPointsTable getPointsTable);
    }

    public interface GetPreMatchPredection {
        void getResponse(PreMatchPredectionQuery.PreMatchPredection preMatchPredection);
    }

    public interface GetProbablePlaying11 {
        void getResponse(ProbablePlaying11Query.ProbablePlaying11 probablePlaying11);
    }

    public interface GetQualificationProbability {
        void getResponse(GetQualificationProbabilityQuery.GetQualificationProbability getQualificationProbability);
    }

    public interface GetSchedule {
        void getResponse(List<ScheduleQuery.Schedule> list);
    }

    public interface GetScoreCards {
        void getResponse(GetScoreCardQuery.GetScoreCard getScoreCard);
    }

    public interface GetSeriesHomeCard {
        void getResponse(SeriesHomeCardQuery.SeriesHomeCard seriesHomeCard);
    }

    public interface GetSquad {
        void getResponse(List<SquadsQuery.Squad> list);
    }

    public interface GetStadium {
        void getResponse(StadiumQuery.C6832Stadium stadium);
    }

    public interface GetStatsResolver {
        void getResponse(GetStatsResolverQuery.GetStatsResolver getStatsResolver);
    }

    public interface GetTeamDiscovery {
        void getResponse(TeamDiscoveryV2Query.TeamDiscoveryV2 teamDiscoveryV2);
    }

    public interface GetVenueDetail {
        void getResponse(List<VenuedetailsQuery.Venuedetail> list);
    }

    public interface GetcriclyticsCommonApi {
        void getResponse(GetcriclyticsCommonApiQuery.GetcriclyticsCommonApi getcriclyticsCommonApi);
    }

    public interface GetmatchStats {
        void getResponse(GetmatchStatsQuery.GetmatchStats getmatchStats);
    }

    public interface getNewSchedules {
        void getResponse(List<NewScheduleQuery.NewSchedule> list);
    }

    public interface isAdFbAdStatus {
        void isAdDismissed();
    }
}
