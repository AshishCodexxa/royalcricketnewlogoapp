package com.gsbusiness.livecricketscoreprediction.graphql;

import com.gsbusiness.livecricketscoreprediction.FeaturematchQuery;
import com.gsbusiness.livecricketscoreprediction.GameChangingOversQuery;
import com.gsbusiness.livecricketscoreprediction.GetBallByBallQuery;
import com.gsbusiness.livecricketscoreprediction.GetFRCHomePageQuery;
import com.gsbusiness.livecricketscoreprediction.GetFantasySixTeamsQuery;
import com.gsbusiness.livecricketscoreprediction.GetHighlightsQuery;
import com.gsbusiness.livecricketscoreprediction.GetKeyStatsQuery;
import com.gsbusiness.livecricketscoreprediction.GetLivePlayerProjectionDetailsQuery;
import com.gsbusiness.livecricketscoreprediction.GetMatchInfoQuery;
import com.gsbusiness.livecricketscoreprediction.GetPointsTableQuery;
import com.gsbusiness.livecricketscoreprediction.GetQualificationProbabilityQuery;
import com.gsbusiness.livecricketscoreprediction.GetScoreCardQuery;
import com.gsbusiness.livecricketscoreprediction.GetStatsResolverQuery;
import com.gsbusiness.livecricketscoreprediction.GetcriclyticsCommonApiQuery;
import com.gsbusiness.livecricketscoreprediction.GetmatchStatsQuery;
import com.gsbusiness.livecricketscoreprediction.HomepageRecentFormQuery;
import com.gsbusiness.livecricketscoreprediction.InningsSummaryQuery;
import com.gsbusiness.livecricketscoreprediction.ListseriesQuery;
import com.gsbusiness.livecricketscoreprediction.MatchRatingsQuery;
import com.gsbusiness.livecricketscoreprediction.MatchSummaryQuery;
import com.gsbusiness.livecricketscoreprediction.MatcheslistQuery;
import com.gsbusiness.livecricketscoreprediction.MatchupsByIdQuery;
import com.gsbusiness.livecricketscoreprediction.MiniScoreCardQuery;
import com.gsbusiness.livecricketscoreprediction.NewScheduleQuery;
import com.gsbusiness.livecricketscoreprediction.PhaseOfSessionsQuery;
import com.gsbusiness.livecricketscoreprediction.PlayerIndexQuery;
import com.gsbusiness.livecricketscoreprediction.PlayersDetailsQuery;
import com.gsbusiness.livecricketscoreprediction.PreMatchPredectionQuery;
import com.gsbusiness.livecricketscoreprediction.ProbablePlaying11Query;
import com.gsbusiness.livecricketscoreprediction.ScheduleQuery;
import com.gsbusiness.livecricketscoreprediction.SeriesHomeCardQuery;
import com.gsbusiness.livecricketscoreprediction.SquadsQuery;
import com.gsbusiness.livecricketscoreprediction.StadiumQuery;
import com.gsbusiness.livecricketscoreprediction.TeamDiscoveryV2Query;
import com.gsbusiness.livecricketscoreprediction.VenuedetailsQuery;
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
