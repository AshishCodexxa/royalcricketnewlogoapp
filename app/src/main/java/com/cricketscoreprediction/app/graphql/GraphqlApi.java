package com.cricketscoreprediction.app.graphql;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.exception.ApolloException;
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
import com.cricketscoreprediction.app.Utils.Glob;
import com.cricketscoreprediction.app.VenuedetailsQuery;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import okhttp3.OkHttpClient;

public class GraphqlApi {
    public static ApolloClient apolloClient;
    public static Interface.GetBallByBall getBallByBall;
    public static Interface.GetFRCHomePage getFRCHomePage;
    public static Interface.GetFantasySixTeam getFantasySixTeam;
    public static Interface.GetFeaturematchQuery getFeaturematchQuery;
    public static Interface.GetFinalArray getFinalArray;
    public static Interface.GetGameChangingOvers getGameChangingOvers;
    public static Interface.GetHighlight getHighlight;
    public static Interface.GetHomepageRecentForm getHomepageRecentForm;
    public static Interface.GetInningsSummary getInningsSummary;
    public static Interface.GetKeyStats getKeyStats;
    public static Interface.GetListseries getListseries;
    public static Interface.GetLivePlayerProjectionDetails getLivePlayerProjectionDetails;
    public static Interface.GetMatchInfo getMatchInfo;
    public static Interface.GetmatchStats getMatchStatsArray;
    public static Interface.GetMatchSummary getMatchSummary;
    public static Interface.GetMatcheslist getMatcheslist;
    public static Interface.GetMatchupsById getMatchupsById;
    public static Interface.GetMiniScoreCardLive getMiniScoreCardLive;
    public static Interface.GetMiniScoreCardQuery getMiniScoreCardQuery;
    public static Interface.getNewSchedules getNewSchedules;
    public static Interface.GetPhaseOfSessions getPhaseOfSessions;
    public static Interface.GetPlayerIndex getPlayerIndex;
    public static Interface.GetPlayersDetail getPlayersDetail;
    public static Interface.GetPointsTable getPointsTable;
    public static Interface.GetPreMatchPredection getPreMatchPredection;
    public static Interface.GetProbablePlaying11 getProbablePlaying11;
    public static Interface.GetQualificationProbability getQualificationProbability;
    public static Interface.GetSchedule getSchedule;
    public static Interface.GetScoreCards getScoreCard;
    public static Interface.GetSeriesHomeCard getSeriesHomeCard;
    public static Interface.GetSquad getSquad;
    public static Interface.GetStadium getStadium;
    public static Interface.GetStatsResolver getStatsResolver;
    public static Interface.GetTeamDiscovery getTeamDiscovery;
    public static Interface.GetVenueDetail getVenueDetail;
    public static Interface.GetcriclyticsCommonApi getcriclyticsCommonApi;
    public Context context;

    public GraphqlApi(Context context2) {
        this.context = context2;
        if (apolloClient == null) {
            apolloClient = ApolloClient.builder().serverUrl(Glob.BASE_URL).okHttpClient(new OkHttpClient.Builder().build()).build();
        }
    }

    public void getFeaturematchQuery(Interface.GetFeaturematchQuery getFeaturematchQuery2) {
        getFeaturematchQuery = getFeaturematchQuery2;
        FeaturematchQuery();
    }

    public void FeaturematchQuery() {
        if (Glob.isNetworkAvailable(this.context)) {
            final ArrayList arrayList2 = new ArrayList();
            apolloClient.query(FeaturematchQuery.builder().build()).enqueue(new ApolloCall.Callback<FeaturematchQuery.Data>() {
              

                @Override
                public void onResponse(Response<FeaturematchQuery.Data> response) {
                    FeaturematchQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    if (data.featurematch() != null) {
                        ArrayList arrayList = arrayList2;
                        FeaturematchQuery.Data data2 = response.getData();
                        Objects.requireNonNull(data2);
                        List<FeaturematchQuery.Featurematch> featurematch = data2.featurematch();
                        Objects.requireNonNull(featurematch);
                        arrayList.addAll(featurematch);
                        GraphqlApi.getFeaturematchQuery.getResponse(arrayList);
                    }
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("FeaturematchQuery" + " :e: ", String.valueOf(apolloException));
                }
            });
            return;
        }
        Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
    }

    public void getPointsTableQuery(String str, Interface.GetPointsTable getPointsTable2) {
        getPointsTable = getPointsTable2;
        GetPointsTableQuery(str);
    }

    public void GetPointsTableQuery(String str) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(GetPointsTableQuery.builder().tourID(str).build()).enqueue(new ApolloCall.Callback<GetPointsTableQuery.Data>() {
            

                @Override 
                public void onResponse(Response<GetPointsTableQuery.Data> response) {
                    GetPointsTableQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    if (data.getPointsTable() != null) {
                        Interface.GetPointsTable getPointsTable = GraphqlApi.getPointsTable;
                        GetPointsTableQuery.Data data2 = response.getData();
                        Objects.requireNonNull(data2);
                        getPointsTable.getResponse(data2.getPointsTable());
                    }
                }

                @Override
                public void onFailure(ApolloException apolloException) {
                    Log.d("", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getSeriesHomeCardQuery(Interface.GetSeriesHomeCard getSeriesHomeCard2) {
        getSeriesHomeCard = getSeriesHomeCard2;
        getSeriesHomeCardQuery();
    }

    public void getSeriesHomeCardQuery() {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(SeriesHomeCardQuery.builder().build()).enqueue(new ApolloCall.Callback<SeriesHomeCardQuery.Data>() {


                @Override 
                public void onResponse(Response<SeriesHomeCardQuery.Data> response) {
                    Interface.GetSeriesHomeCard getSeriesHomeCard = GraphqlApi.getSeriesHomeCard;
                    SeriesHomeCardQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getSeriesHomeCard.getResponse(data.SeriesHomeCard());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getMiniScoreCardQuery(String str, Interface.GetMiniScoreCardQuery getMiniScoreCardQuery2) {
        getMiniScoreCardQuery = getMiniScoreCardQuery2;
        getMiniScoreCardQuery(str);
    }

    public void getMiniScoreCardQuery(String str) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(MiniScoreCardQuery.builder().matchID(str).build()).enqueue(new ApolloCall.Callback<MiniScoreCardQuery.Data>() {


                @Override 
                public void onResponse(Response<MiniScoreCardQuery.Data> response) {
                    Interface.GetMiniScoreCardQuery getMiniScoreCardQuery = GraphqlApi.getMiniScoreCardQuery;
                    MiniScoreCardQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getMiniScoreCardQuery.getResponse(data.miniScoreCard());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getMiniScoreCardLive(String str, Interface.GetMiniScoreCardLive getMiniScoreCardLive2) {
        getMiniScoreCardLive = getMiniScoreCardLive2;
        getMiniScoreCardLive(str);
    }

    public void getMiniScoreCardLive(String str) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(MiniScoreCardQuery.builder().matchID(str).build()).enqueue(new ApolloCall.Callback<MiniScoreCardQuery.Data>() {


                @Override 
                public void onResponse(Response<MiniScoreCardQuery.Data> response) {
                    Interface.GetMiniScoreCardLive getMiniScoreCardLive = GraphqlApi.getMiniScoreCardLive;
                    MiniScoreCardQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getMiniScoreCardLive.getResponse(data.miniScoreCard());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getScoreCardQuery(String str, Interface.GetScoreCards getScoreCards) {
        getScoreCard = getScoreCards;
        getScoreCardQuery(str);
    }

    public void getScoreCardQuery(String str) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(GetScoreCardQuery.builder().matchID(str).build()).enqueue(new ApolloCall.Callback<GetScoreCardQuery.Data>() {

                @Override 
                public void onResponse(Response<GetScoreCardQuery.Data> response) {
                    Interface.GetScoreCards getScoreCards = GraphqlApi.getScoreCard;
                    GetScoreCardQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getScoreCards.getResponse(data.getScoreCard());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("getScoreCardQuery" + " :e: ", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getProbablePlaying11Query(String str, Interface.GetProbablePlaying11 getProbablePlaying112) {
        getProbablePlaying11 = getProbablePlaying112;
        getProbablePlaying11Query(str);
    }

    public void getProbablePlaying11Query(String str) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(ProbablePlaying11Query.builder().matchID(str).build()).enqueue(new ApolloCall.Callback<ProbablePlaying11Query.Data>() {


                @Override 
                public void onResponse(Response<ProbablePlaying11Query.Data> response) {
                    Interface.GetProbablePlaying11 getProbablePlaying11 = GraphqlApi.getProbablePlaying11;
                    ProbablePlaying11Query.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getProbablePlaying11.getResponse(data.probablePlaying11());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getMatchInfoQuery(String str, Interface.GetMatchInfo getMatchInfo2) {
        getMatchInfo = getMatchInfo2;
        getMatchInfoQuery(str);
    }

    public void getMatchInfoQuery(String str) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(GetMatchInfoQuery.builder().matchID(str).build()).enqueue(new ApolloCall.Callback<GetMatchInfoQuery.Data>() {


                @Override 
                public void onResponse(Response<GetMatchInfoQuery.Data> response) {
                    Interface.GetMatchInfo getMatchInfo = GraphqlApi.getMatchInfo;
                    GetMatchInfoQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getMatchInfo.getResponse(data.getMatchInfo());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("getMatchInfoQuery" + " :e: ", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getScheduleQuery(String str, String str2, Interface.GetSchedule getSchedule2) {
        getSchedule = getSchedule2;
        getScheduleQuery(str, str2);
    }

    public void getScheduleQuery(String str, String str2) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(ScheduleQuery.builder().type(str).status(str2).build()).enqueue(new ApolloCall.Callback<ScheduleQuery.Data>() {


                @Override 
                public void onResponse(Response<ScheduleQuery.Data> response) {
                    Interface.GetSchedule getSchedule = GraphqlApi.getSchedule;
                    ScheduleQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getSchedule.getResponse(data.schedule());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("getScheduleQuery" + " :e: ", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getBallByBallQuery(String str, String str2, Interface.GetBallByBall getBallByBall2) {
        getBallByBall = getBallByBall2;
        getBallByBallQuery(str, str2);
    }

    public void getBallByBallQuery(String str, String str2) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(GetBallByBallQuery.builder().matchID(str).innings(str2).build()).enqueue(new ApolloCall.Callback<GetBallByBallQuery.Data>() {


                @Override 
                public void onResponse(Response<GetBallByBallQuery.Data> response) {
                    Interface.GetBallByBall getBallByBall = GraphqlApi.getBallByBall;
                    GetBallByBallQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    List<GetBallByBallQuery.GetBallByBall> ballByBall = data.getBallByBall();
                    Objects.requireNonNull(ballByBall);
                    getBallByBall.getResponse(ballByBall.get(0));
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("getBallByBallQuery" + " :e: ", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getPlayerIndex(Interface.GetPlayerIndex getPlayerIndex2) {
        getPlayerIndex = getPlayerIndex2;
        getPlayerIndex();
    }

    public void getPlayerIndex() {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(PlayerIndexQuery.builder().build()).enqueue(new ApolloCall.Callback<PlayerIndexQuery.Data>() {


                @Override 
                public void onResponse(Response<PlayerIndexQuery.Data> response) {
                    Interface.GetPlayerIndex getPlayerIndex = GraphqlApi.getPlayerIndex;
                    PlayerIndexQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getPlayerIndex.getResponse(data.playerIndex());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("getPlayerIndex" + " :e: ", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getQualificationProbability(Interface.GetQualificationProbability getQualificationProbability2) {
        getQualificationProbability = getQualificationProbability2;
        getQualificationProbability();
    }

    public void getQualificationProbability() {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(GetQualificationProbabilityQuery.builder().build()).enqueue(new ApolloCall.Callback<GetQualificationProbabilityQuery.Data>() {


                @Override 
                public void onResponse(Response<GetQualificationProbabilityQuery.Data> response) {
                    Interface.GetQualificationProbability getQualificationProbability = GraphqlApi.getQualificationProbability;
                    GetQualificationProbabilityQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getQualificationProbability.getResponse(data.getQualificationProbability());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getFRCHomePage(Interface.GetFRCHomePage getFRCHomePage2) {
        getFRCHomePage = getFRCHomePage2;
        getFRCHomePage();
    }

    public void getFRCHomePage() {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(GetFRCHomePageQuery.builder().build()).enqueue(new ApolloCall.Callback<GetFRCHomePageQuery.Data>() {


                @Override 
                public void onResponse(Response<GetFRCHomePageQuery.Data> response) {
                    Interface.GetFRCHomePage getFRCHomePage = GraphqlApi.getFRCHomePage;
                    GetFRCHomePageQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getFRCHomePage.getResponse(data.getFRCHomePage());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("getFRCHomePage" + " :e: ", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getFantasySixTeams(String str, Interface.GetFantasySixTeam getFantasySixTeam2) {
        getFantasySixTeam = getFantasySixTeam2;
        getFantasySixTeams(str);
    }

    public void getFantasySixTeams(String str) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(GetFantasySixTeamsQuery.builder().matchID(str).build()).enqueue(new ApolloCall.Callback<GetFantasySixTeamsQuery.Data>() {


                @Override 
                public void onResponse(Response<GetFantasySixTeamsQuery.Data> response) {
                    Interface.GetFantasySixTeam getFantasySixTeam = GraphqlApi.getFantasySixTeam;
                    GetFantasySixTeamsQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getFantasySixTeam.getResponse(data.getFantasySixTeams());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("getFantasySixTeams" + " :e: ", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getListseries(String str, Interface.GetListseries getListseries2) {
        getListseries = getListseries2;
        getListseries(str);
    }

    public void getListseries(String str) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(ListseriesQuery.builder().type(str).build()).enqueue(new ApolloCall.Callback<ListseriesQuery.Data>() {


                @Override 
                public void onResponse(Response<ListseriesQuery.Data> response) {
                    Interface.GetListseries getListseries = GraphqlApi.getListseries;
                    ListseriesQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getListseries.getResponse(data.listseries());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("getListseries" + " :e: ", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getMatchList(String str, Interface.GetMatcheslist getMatcheslist2) {
        getMatcheslist = getMatcheslist2;
        getMatchList(str);
    }

    public void getMatchList(String str) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(MatcheslistQuery.builder().seriesID(str).build()).enqueue(new ApolloCall.Callback<MatcheslistQuery.Data>() {


                @Override 
                public void onResponse(Response<MatcheslistQuery.Data> response) {
                    Interface.GetMatcheslist getMatcheslist = GraphqlApi.getMatcheslist;
                    MatcheslistQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getMatcheslist.getResponse(data.matcheslist());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("getMatchList" + " :e: ", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getSquads(String str, Interface.GetSquad getSquad2) {
        getSquad = getSquad2;
        getSquads(str);
    }

    public void getSquads(String str) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(SquadsQuery.builder().seriesID(str).build()).enqueue(new ApolloCall.Callback<SquadsQuery.Data>() {


                @Override 
                public void onResponse(Response<SquadsQuery.Data> response) {
                    Interface.GetSquad getSquad = GraphqlApi.getSquad;
                    SquadsQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getSquad.getResponse(data.squads());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("getSquads" + " :e: ", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getVenueDetails(String str, Interface.GetVenueDetail getVenueDetail2) {
        getVenueDetail = getVenueDetail2;
        getVenueDetails(str);
    }

    public void getVenueDetails(String str) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(VenuedetailsQuery.builder().seriesID(str).build()).enqueue(new ApolloCall.Callback<VenuedetailsQuery.Data>() {


                @Override 
                public void onResponse(Response<VenuedetailsQuery.Data> response) {
                    Interface.GetVenueDetail getVenueDetail = GraphqlApi.getVenueDetail;
                    VenuedetailsQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getVenueDetail.getResponse(data.venuedetails());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("getVenueDetails" + " :e: ", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getStatsResolver(String str, Interface.GetStatsResolver getStatsResolver2) {
        getStatsResolver = getStatsResolver2;
        getStatsResolver(str);
    }

    public void getStatsResolver(String str) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(GetStatsResolverQuery.builder().tourID(str).build()).enqueue(new ApolloCall.Callback<GetStatsResolverQuery.Data>() {


                @Override 
                public void onResponse(Response<GetStatsResolverQuery.Data> response) {
                    Interface.GetStatsResolver getStatsResolver = GraphqlApi.getStatsResolver;
                    GetStatsResolverQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getStatsResolver.getResponse(data.getStatsResolver());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("getVenueDetails" + " :e: ", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getPlayerDetail(String str, Interface.GetPlayersDetail getPlayersDetail2) {
        getPlayersDetail = getPlayersDetail2;
        getPlayerDetail(str);
    }

    public void getPlayerDetail(String str) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(PlayersDetailsQuery.builder().playerID(str).build()).enqueue(new ApolloCall.Callback<PlayersDetailsQuery.Data>() {


                @Override 
                public void onResponse(Response<PlayersDetailsQuery.Data> response) {
                    Interface.GetPlayersDetail getPlayersDetail = GraphqlApi.getPlayersDetail;
                    PlayersDetailsQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getPlayersDetail.getResponse(data.playersDetails());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("getPlayerDetail" + " :e: ", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getStadium(String str, Interface.GetStadium getStadium2) {
        getStadium = getStadium2;
        getStadium(str);
    }

    public void getStadium(String str) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(StadiumQuery.builder().venueID(str).build()).enqueue(new ApolloCall.Callback<StadiumQuery.Data>() {


                @Override 
                public void onResponse(Response<StadiumQuery.Data> response) {
                    Interface.GetStadium getStadium = GraphqlApi.getStadium;
                    StadiumQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getStadium.getResponse(data.stadium());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("getStadium" + " :e: ", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getGameChangingOvers(String str, Interface.GetGameChangingOvers getGameChangingOvers2) {
        getGameChangingOvers = getGameChangingOvers2;
        getGameChangingOvers(str);
    }

    public void getGameChangingOvers(String str) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(GameChangingOversQuery.builder().matchID(str).build()).enqueue(new ApolloCall.Callback<GameChangingOversQuery.Data>() {


                @Override 
                public void onResponse(Response<GameChangingOversQuery.Data> response) {
                    Interface.GetGameChangingOvers getGameChangingOvers = GraphqlApi.getGameChangingOvers;
                    GameChangingOversQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getGameChangingOvers.getResponse(data.gameChangingOvers());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getKeyStates(String str, Interface.GetKeyStats getKeyStats2) {
        getKeyStats = getKeyStats2;
        getKeyStates(str);
    }

    public void getKeyStates(String str) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(GetKeyStatsQuery.builder().matchID(str).build()).enqueue(new ApolloCall.Callback<GetKeyStatsQuery.Data>() {


                @Override 
                public void onResponse(Response<GetKeyStatsQuery.Data> response) {
                    Interface.GetKeyStats getKeyStats = GraphqlApi.getKeyStats;
                    GetKeyStatsQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getKeyStats.getResponse(data.getKeyStats());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("getKeyStates" + " :e: ", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getMatchStats(String str, Interface.GetmatchStats getmatchStats) {
        getMatchStatsArray = getmatchStats;
        getMatchStats(str);
    }

    public void getMatchStats(String str) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(GetmatchStatsQuery.builder().matchID(str).build()).enqueue(new ApolloCall.Callback<GetmatchStatsQuery.Data>() {


                @Override 
                public void onResponse(Response<GetmatchStatsQuery.Data> response) {
                    Interface.GetmatchStats getmatchStats = GraphqlApi.getMatchStatsArray;
                    GetmatchStatsQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getmatchStats.getResponse(data.getmatchStats());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("getMatchStats" + " :e: ", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getMatchupsById(String str, Interface.GetMatchupsById getMatchupsById2) {
        getMatchupsById = getMatchupsById2;
        getMatchupsById(str);
    }

    public void getMatchupsById(String str) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(MatchupsByIdQuery.builder().crictecMatchId(str).build()).enqueue(new ApolloCall.Callback<MatchupsByIdQuery.Data>() {

                @Override 
                public void onResponse(Response<MatchupsByIdQuery.Data> response) {
                    Interface.GetMatchupsById getMatchupsById = GraphqlApi.getMatchupsById;
                    MatchupsByIdQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getMatchupsById.getResponse(data.matchupsById());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("getMatchupsById" + " :e: ", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getPreMatchPrediction(String str, Interface.GetPreMatchPredection getPreMatchPredection2) {
        getPreMatchPredection = getPreMatchPredection2;
        getPreMatchPrediction(str);
    }

    public void getPreMatchPrediction(String str) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(PreMatchPredectionQuery.builder().matchId(str).build()).enqueue(new ApolloCall.Callback<PreMatchPredectionQuery.Data>() {


                @Override 
                public void onResponse(Response<PreMatchPredectionQuery.Data> response) {
                    Interface.GetPreMatchPredection getPreMatchPredection = GraphqlApi.getPreMatchPredection;
                    PreMatchPredectionQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getPreMatchPredection.getResponse(data.preMatchPredection());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getLivePlayerProjectionDetails(String str, Interface.GetLivePlayerProjectionDetails getLivePlayerProjectionDetails2) {
        getLivePlayerProjectionDetails = getLivePlayerProjectionDetails2;
        getLivePlayerProjectionDetails(str);
    }

    public void getLivePlayerProjectionDetails(String str) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(GetLivePlayerProjectionDetailsQuery.builder().matchId(str).build()).enqueue(new ApolloCall.Callback<GetLivePlayerProjectionDetailsQuery.Data>() {


                @Override 
                public void onResponse(Response<GetLivePlayerProjectionDetailsQuery.Data> response) {
                    Interface.GetLivePlayerProjectionDetails getLivePlayerProjectionDetails = GraphqlApi.getLivePlayerProjectionDetails;
                    GetLivePlayerProjectionDetailsQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getLivePlayerProjectionDetails.getResponse(data.getLivePlayerProjectionDetails());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getMatchRatings(String str, Interface.GetFinalArray getFinalArray2) {
        getFinalArray = getFinalArray2;
        getMatchRatings(str);
    }

    public void getMatchRatings(String str) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(MatchRatingsQuery.builder().matchID(str).build()).enqueue(new ApolloCall.Callback<MatchRatingsQuery.Data>() {


                @Override 
                public void onResponse(Response<MatchRatingsQuery.Data> response) {
                    Interface.GetFinalArray getFinalArray = GraphqlApi.getFinalArray;
                    MatchRatingsQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    MatchRatingsQuery.MatchRatings matchRatings = data.matchRatings();
                    Objects.requireNonNull(matchRatings);
                    getFinalArray.getResponse(matchRatings.finalArray());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("getMatchRatings" + " :e: ", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getCriclyticsCommonApi(String str, Interface.GetcriclyticsCommonApi getcriclyticsCommonApi2) {
        getcriclyticsCommonApi = getcriclyticsCommonApi2;
        getCriclyticsCommonApi(str);
    }

    public void getCriclyticsCommonApi(String str) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(GetcriclyticsCommonApiQuery.builder().matchId(str).build()).enqueue(new ApolloCall.Callback<GetcriclyticsCommonApiQuery.Data>() {


                @Override 
                public void onResponse(Response<GetcriclyticsCommonApiQuery.Data> response) {
                    Interface.GetcriclyticsCommonApi getcriclyticsCommonApi = GraphqlApi.getcriclyticsCommonApi;
                    GetcriclyticsCommonApiQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getcriclyticsCommonApi.getResponse(data.getcriclyticsCommonApi());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getPhaseOfSessions(String str, Interface.GetPhaseOfSessions getPhaseOfSessions2) {
        getPhaseOfSessions = getPhaseOfSessions2;
        getPhaseOfSessions(str);
    }

    public void getPhaseOfSessions(String str) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(PhaseOfSessionsQuery.builder().matchID(str).build()).enqueue(new ApolloCall.Callback<PhaseOfSessionsQuery.Data>() {


                @Override 
                public void onResponse(Response<PhaseOfSessionsQuery.Data> response) {
                    Interface.GetPhaseOfSessions getPhaseOfSessions = GraphqlApi.getPhaseOfSessions;
                    PhaseOfSessionsQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getPhaseOfSessions.getResponse(data.phaseOfSessions());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("getPhaseOfSessions" + " :e: ", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getInningsSummary(String str, String str2, Interface.GetInningsSummary getInningsSummary2) {
        getInningsSummary = getInningsSummary2;
        getInningsSummary(str, str2);
    }

    public void getInningsSummary(String str, String str2) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(InningsSummaryQuery.builder().matchID(str).inningsNo(str2).build()).enqueue(new ApolloCall.Callback<InningsSummaryQuery.Data>() {


                @Override 
                public void onResponse(Response<InningsSummaryQuery.Data> response) {
                    GraphqlApi.getInningsSummary.getResponse(response.getData().inningsSummary());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("getPhaseOfSessions" + " :e: ", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getMatchSummary(String str, String str2, Interface.GetMatchSummary getMatchSummary2) {
        getMatchSummary = getMatchSummary2;
        getMatchSummary(str, str2);
    }

    public void getMatchSummary(String str, String str2) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(MatchSummaryQuery.builder().matchID(str).status(str2).build()).enqueue(new ApolloCall.Callback<MatchSummaryQuery.Data>() {


                @Override 
                public void onResponse(Response<MatchSummaryQuery.Data> response) {
                    GraphqlApi.getMatchSummary.getResponse(response.getData().matchSummary());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("getMatchSummary" + " :e: ", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void GetHomepageRecentForm(String str, String str2, String str3, String str4, Interface.GetHomepageRecentForm getHomepageRecentForm2) {
        getHomepageRecentForm = getHomepageRecentForm2;
        getHomepageRecentForm(str, str2, str3, str4);
    }

    public void getHomepageRecentForm(String str, String str2, String str3, String str4) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(HomepageRecentFormQuery.builder().homeTeamID(str).awayTeamID(str2).homeTeamShortName(str3).awayTeamShortName(str4).build()).enqueue(new ApolloCall.Callback<HomepageRecentFormQuery.Data>() {


                @Override 
                public void onResponse(Response<HomepageRecentFormQuery.Data> response) {
                    Interface.GetHomepageRecentForm getHomepageRecentForm = GraphqlApi.getHomepageRecentForm;
                    HomepageRecentFormQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getHomepageRecentForm.getResponse(data.homepageRecentForm());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getHighlight(String str, String str2, String str3, Interface.GetHighlight getHighlight2) {
        getHighlight = getHighlight2;
        getHighlight(str, str2, str3);
    }

    public void getHighlight(String str, String str2, String str3) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(GetHighlightsQuery.builder().matchID(str).innings(str2).type(str3).build()).enqueue(new ApolloCall.Callback<GetHighlightsQuery.Data>() {


                @Override 
                public void onResponse(Response<GetHighlightsQuery.Data> response) {
                    Interface.GetHighlight getHighlight = GraphqlApi.getHighlight;
                    GetHighlightsQuery.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getHighlight.getResponse(data.getHighlights());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("getHighlight" + " :e: ", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getTeamDiscovery(Interface.GetTeamDiscovery getTeamDiscovery2) {
        getTeamDiscovery = getTeamDiscovery2;
        getTeamDiscovery();
    }

    private void getTeamDiscovery() {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(TeamDiscoveryV2Query.builder().build()).enqueue(new ApolloCall.Callback<TeamDiscoveryV2Query.Data>() {


                @Override 
                public void onResponse(Response<TeamDiscoveryV2Query.Data> response) {
                    Interface.GetTeamDiscovery getTeamDiscovery = GraphqlApi.getTeamDiscovery;
                    TeamDiscoveryV2Query.Data data = response.getData();
                    Objects.requireNonNull(data);
                    getTeamDiscovery.getResponse(data.teamDiscoveryV2());
                }

                @Override 
                public void onFailure(ApolloException apolloException) {
                    Log.d("getTeamDiscovery" + " :e: ", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }

    public void getNewSchedules(String str, String str2, int i, Interface.getNewSchedules getnewschedules) {
        getNewSchedules = getnewschedules;
        getNewSchedules(str, str2, i);
    }

    private void getNewSchedules(String str, String str2, int i) {
        if (Glob.isNetworkAvailable(this.context)) {
            apolloClient.query(NewScheduleQuery.builder().type(str).status(str2).page(i).build()).enqueue(new ApolloCall.Callback<NewScheduleQuery.Data>() {


                @Override
                public void onResponse(Response<NewScheduleQuery.Data> response) {
                    GraphqlApi.getNewSchedules.getResponse(response.getData().newSchedule());
                }

                @Override
                public void onFailure(ApolloException apolloException) {
                    Log.d("getNewSchedules" + " :e: ", String.valueOf(apolloException));
                }
            });
        } else {
            Toast.makeText(this.context, "Please turn on internet", Toast.LENGTH_SHORT).show();
        }
    }
}
