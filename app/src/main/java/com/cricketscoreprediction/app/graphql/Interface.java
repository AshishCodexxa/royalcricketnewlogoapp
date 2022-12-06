package com.cricketscoreprediction.app.graphql;

import com.cricketscoreprediction.app.FeaturematchQuery;
import com.cricketscoreprediction.app.GameChangingOversQuery;
import com.cricketscoreprediction.app.GetBallByBallQuery;
import com.cricketscoreprediction.app.GetFRCHomePageQuery;
import com.cricketscoreprediction.app.GetFantasySixTeamsQuery;
import com.cricketscoreprediction.app.GetHighlightsQuery;
import com.cricketscoreprediction.app.GetKeyStatsQuery;
import com.cricketscoreprediction.app.GetLivePlayerProjectionDetailsQuery;
import com.cricketscoreprediction.app.GetMatchInfoQuery;
import com.cricketscoreprediction.app.GetPointsTableQuery;
import com.cricketscoreprediction.app.GetQualificationProbabilityQuery;
import com.cricketscoreprediction.app.GetScoreCardQuery;
import com.cricketscoreprediction.app.GetStatsResolverQuery;
import com.cricketscoreprediction.app.GetcriclyticsCommonApiQuery;
import com.cricketscoreprediction.app.GetmatchStatsQuery;
import com.cricketscoreprediction.app.HomepageRecentFormQuery;
import com.cricketscoreprediction.app.InningsSummaryQuery;
import com.cricketscoreprediction.app.ListseriesQuery;
import com.cricketscoreprediction.app.MatchRatingsQuery;
import com.cricketscoreprediction.app.MatchSummaryQuery;
import com.cricketscoreprediction.app.MatcheslistQuery;
import com.cricketscoreprediction.app.MatchupsByIdQuery;
import com.cricketscoreprediction.app.MiniScoreCardQuery;
import com.cricketscoreprediction.app.NewScheduleQuery;
import com.cricketscoreprediction.app.PhaseOfSessionsQuery;
import com.cricketscoreprediction.app.PlayerIndexQuery;
import com.cricketscoreprediction.app.PlayersDetailsQuery;
import com.cricketscoreprediction.app.PreMatchPredectionQuery;
import com.cricketscoreprediction.app.ProbablePlaying11Query;
import com.cricketscoreprediction.app.ScheduleQuery;
import com.cricketscoreprediction.app.SeriesHomeCardQuery;
import com.cricketscoreprediction.app.SquadsQuery;
import com.cricketscoreprediction.app.StadiumQuery;
import com.cricketscoreprediction.app.TeamDiscoveryV2Query;
import com.cricketscoreprediction.app.VenuedetailsQuery;
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
