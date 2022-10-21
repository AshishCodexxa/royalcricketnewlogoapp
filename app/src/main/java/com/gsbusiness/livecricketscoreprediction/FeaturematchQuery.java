package com.gsbusiness.livecricketscoreprediction;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ScalarTypeAdapters;
import com.apollographql.apollo.api.internal.Utils;
import com.apollographql.apollo.api.internal.OperationRequestBodyComposer;
import com.apollographql.apollo.api.internal.QueryDocumentMinifier;
import com.apollographql.apollo.api.internal.ResponseFieldMapper;
import com.apollographql.apollo.api.internal.ResponseFieldMarshaller;
import com.apollographql.apollo.api.internal.ResponseReader;
import com.apollographql.apollo.api.internal.ResponseWriter;
import com.apollographql.apollo.api.internal.SimpleOperationResponseParser;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

public final class FeaturematchQuery implements Query<FeaturematchQuery.Data, FeaturematchQuery.Data, Operation.Variables> {
    public static final String OPERATION_ID = "e01d8ab62287ccc095bcf81a2dd771a652d14f663a465d8e1b88ff3b18488a76";
    public static final OperationName OPERATION_NAME = new OperationName() {


        @Override
        public String name() {
            return "featurematch";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query featurematch {\n  featurematch {\n    __typename\n    playerofTheMatchTeamShortName\n    matchdate\n    seriesID\n    winningTeamID\n    displayFeatureMatchScoreCard\n    currentinningsNo\n    currentInningteamID\n    currentInningsTeamName\n    seriesName\n    homeTeamName\n    awayTeamName\n    toss\n    league\n    startEndDate\n    matchStatus\n    matchID\n    matchType\n    statusMessage\n    statusMessageHindi\n    matchNumber\n    venue\n    matchResult\n    startDate\n    playerOfTheMatch\n    playerID\n    firstInningsTeamID\n    secondInningsTeamID\n    thirdInningsTeamID\n    fourthInningsTeamID\n    matchScore {\n      __typename\n      teamShortName\n      teamID\n      teamFullName\n      teamScore {\n        __typename\n        inning\n        inningNumber\n        battingTeam\n        runsScored\n        wickets\n        overs\n        runRate\n        battingSide\n        teamID\n        battingTeamShortName\n        declared\n        folowOn\n      }\n    }\n    teamsWinProbability {\n      __typename\n      homeTeamShortName\n      homeTeamPercentage\n      awayTeamShortName\n      awayTeamPercentage\n      tiePercentage\n    }\n    isCricklyticsAvailable\n    isLiveCriclyticsAvailable\n    currentDay\n    currentSession\n    playing11Status\n    isAbandoned\n    isNotified\n    rRunRate\n    probable11Status\n    IPLpolling {\n      __typename\n      name\n      isPolling\n      display\n      isCompleted\n      isAuctionStarted\n    }\n    isFantasyAvailable\n    hasStatistics\n    hasPoints\n    isHomeMatchUpade\n    content\n    criclyticsButtonFlags {\n      __typename\n      featuredSeriesName\n      isPlayerIndex\n      isFinalFour\n      tourID\n      seriesName\n      frcStartTime\n    }\n    matchName\n    matchNameHindi\n    phaseOfInningFlag\n    loginEnable\n    homeTeamID\n    awayTeamID\n    matchDateTimeGMT\n    win\n    userNotification\n    matchenddate\n    playerOfTheMatchdDetails {\n      __typename\n      batsmanTab\n      bowlerTab\n      playerID\n      playerTeamID\n      playerName\n      batsman {\n        __typename\n        batsmanBalls\n        batsmanRuns\n        isNotOut\n      }\n      bowler {\n        __typename\n        batsmanBalls\n        batsmanRuns\n        bowlerWickets\n        bowlerConceeded\n        bowlerOvers\n      }\n    }\n  }\n}");
    private final Operation.Variables variables = Operation.EMPTY_VARIABLES;

    @Override
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    @Override 
    public String queryDocument() {
        return QUERY_DOCUMENT;
    }

    @Override 
    public Operation.Variables variables() {
        return this.variables;
    }

    @Override 
    public ResponseFieldMapper<Data> responseFieldMapper() {
        return new Data.Mapper();
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override 
    public OperationName name() {
        return OPERATION_NAME;
    }

    @Override 
    public Response<Data> parse(BufferedSource bufferedSource, ScalarTypeAdapters scalarTypeAdapters) throws IOException {
        return SimpleOperationResponseParser.parse(bufferedSource, this, scalarTypeAdapters);
    }

    @Override 
    public Response<Data> parse(ByteString byteString, ScalarTypeAdapters scalarTypeAdapters) throws IOException {
        return parse(new Buffer().write(byteString), scalarTypeAdapters);
    }

    @Override 
    public Response<Data> parse(BufferedSource bufferedSource) throws IOException {
        return parse(bufferedSource, ScalarTypeAdapters.DEFAULT);
    }

    @Override 
    public Response<Data> parse(ByteString byteString) throws IOException {
        return parse(byteString, ScalarTypeAdapters.DEFAULT);
    }

    @Override 
    public ByteString composeRequestBody(ScalarTypeAdapters scalarTypeAdapters) {
        return OperationRequestBodyComposer.compose(this, false, true, scalarTypeAdapters);
    }

    @Override 
    public ByteString composeRequestBody() {
        return OperationRequestBodyComposer.compose(this, false, true, ScalarTypeAdapters.DEFAULT);
    }

    @Override 
    public ByteString composeRequestBody(boolean z, boolean z2, ScalarTypeAdapters scalarTypeAdapters) {
        return OperationRequestBodyComposer.compose(this, z, z2, scalarTypeAdapters);
    }

    public static final class Builder {
        Builder() {
        }

        public FeaturematchQuery build() {
            return new FeaturematchQuery();
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forList("featurematch", "featurematch", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final List<Featurematch> featurematch;

        public Data(List<Featurematch> list) {
            this.featurematch = list;
        }

        public List<Featurematch> featurematch() {
            return this.featurematch;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeList(Data.$responseFields[0], Data.this.featurematch, new ResponseWriter.ListWriter() {

                        @Override
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Featurematch) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{featurematch=" + this.featurematch + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            List<Featurematch> list = this.featurematch;
            List<Featurematch> list2 = ((Data) obj).featurematch;
            if (list != null) {
                return list.equals(list2);
            }
            if (list2 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                List<Featurematch> list = this.featurematch;
                this.$hashCode = 1000003 ^ (list == null ? 0 : list.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final Featurematch.Mapper featurematchFieldMapper = new Featurematch.Mapper();

            @Override
            public Data map(ResponseReader responseReader) {
                return new Data(responseReader.readList(Data.$responseFields[0], new ResponseReader.ListReader<Featurematch>() {


                    @Override
                    public Featurematch read(ResponseReader.ListItemReader listItemReader) {
                        return (Featurematch) listItemReader.readObject(new ResponseReader.ObjectReader<Featurematch>() {


                            @Override
                            public Featurematch read(ResponseReader responseReader) {
                                return Mapper.this.featurematchFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class Featurematch {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerofTheMatchTeamShortName", "playerofTheMatchTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("matchdate", "matchdate", null, true, Collections.emptyList()), ResponseField.forString("seriesID", "seriesID", null, true, Collections.emptyList()), ResponseField.forString("winningTeamID", "winningTeamID", null, true, Collections.emptyList()), ResponseField.forBoolean("displayFeatureMatchScoreCard", "displayFeatureMatchScoreCard", null, true, Collections.emptyList()), ResponseField.forString("currentinningsNo", "currentinningsNo", null, true, Collections.emptyList()), ResponseField.forString("currentInningteamID", "currentInningteamID", null, true, Collections.emptyList()), ResponseField.forString("currentInningsTeamName", "currentInningsTeamName", null, true, Collections.emptyList()), ResponseField.forString("seriesName", "seriesName", null, true, Collections.emptyList()), ResponseField.forString("homeTeamName", "homeTeamName", null, true, Collections.emptyList()), ResponseField.forString("awayTeamName", "awayTeamName", null, true, Collections.emptyList()), ResponseField.forString("toss", "toss", null, true, Collections.emptyList()), ResponseField.forString("league", "league", null, true, Collections.emptyList()), ResponseField.forString("startEndDate", "startEndDate", null, true, Collections.emptyList()), ResponseField.forString("matchStatus", "matchStatus", null, true, Collections.emptyList()), ResponseField.forString("matchID", "matchID", null, true, Collections.emptyList()), ResponseField.forString("matchType", "matchType", null, true, Collections.emptyList()), ResponseField.forString("statusMessage", "statusMessage", null, true, Collections.emptyList()), ResponseField.forString("statusMessageHindi", "statusMessageHindi", null, true, Collections.emptyList()), ResponseField.forString("matchNumber", "matchNumber", null, true, Collections.emptyList()), ResponseField.forString("venue", "venue", null, true, Collections.emptyList()), ResponseField.forString("matchResult", "matchResult", null, true, Collections.emptyList()), ResponseField.forString("startDate", "startDate", null, true, Collections.emptyList()), ResponseField.forString("playerOfTheMatch", "playerOfTheMatch", null, true, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("firstInningsTeamID", "firstInningsTeamID", null, true, Collections.emptyList()), ResponseField.forString("secondInningsTeamID", "secondInningsTeamID", null, true, Collections.emptyList()), ResponseField.forString("thirdInningsTeamID", "thirdInningsTeamID", null, true, Collections.emptyList()), ResponseField.forString("fourthInningsTeamID", "fourthInningsTeamID", null, true, Collections.emptyList()), ResponseField.forList("matchScore", "matchScore", null, true, Collections.emptyList()), ResponseField.forObject("teamsWinProbability", "teamsWinProbability", null, true, Collections.emptyList()), ResponseField.forBoolean("isCricklyticsAvailable", "isCricklyticsAvailable", null, true, Collections.emptyList()), ResponseField.forBoolean("isLiveCriclyticsAvailable", "isLiveCriclyticsAvailable", null, true, Collections.emptyList()), ResponseField.forInt("currentDay", "currentDay", null, true, Collections.emptyList()), ResponseField.forInt("currentSession", "currentSession", null, true, Collections.emptyList()), ResponseField.forBoolean("playing11Status", "playing11Status", null, true, Collections.emptyList()), ResponseField.forBoolean("isAbandoned", "isAbandoned", null, true, Collections.emptyList()), ResponseField.forBoolean("isNotified", "isNotified", null, true, Collections.emptyList()), ResponseField.forString("rRunRate", "rRunRate", null, true, Collections.emptyList()), ResponseField.forBoolean("probable11Status", "probable11Status", null, true, Collections.emptyList()), ResponseField.forObject("IPLpolling", "IPLpolling", null, true, Collections.emptyList()), ResponseField.forBoolean("isFantasyAvailable", "isFantasyAvailable", null, true, Collections.emptyList()), ResponseField.forBoolean("hasStatistics", "hasStatistics", null, true, Collections.emptyList()), ResponseField.forBoolean("hasPoints", "hasPoints", null, true, Collections.emptyList()), ResponseField.forBoolean("isHomeMatchUpade", "isHomeMatchUpade", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CONTENT, FirebaseAnalytics.Param.CONTENT, null, true, Collections.emptyList()), ResponseField.forObject("criclyticsButtonFlags", "criclyticsButtonFlags", null, true, Collections.emptyList()), ResponseField.forString("matchName", "matchName", null, true, Collections.emptyList()), ResponseField.forString("matchNameHindi", "matchNameHindi", null, true, Collections.emptyList()), ResponseField.forBoolean("phaseOfInningFlag", "phaseOfInningFlag", null, true, Collections.emptyList()), ResponseField.forBoolean("loginEnable", "loginEnable", null, true, Collections.emptyList()), ResponseField.forString("homeTeamID", "homeTeamID", null, true, Collections.emptyList()), ResponseField.forString("awayTeamID", "awayTeamID", null, true, Collections.emptyList()), ResponseField.forString("matchDateTimeGMT", "matchDateTimeGMT", null, true, Collections.emptyList()), ResponseField.forString("win", "win", null, true, Collections.emptyList()), ResponseField.forInt("userNotification", "userNotification", null, true, Collections.emptyList()), ResponseField.forString("matchenddate", "matchenddate", null, true, Collections.emptyList()), ResponseField.forObject("playerOfTheMatchdDetails", "playerOfTheMatchdDetails", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final IPLpolling IPLpolling;
        final String __typename;
        final String awayTeamID;
        final String awayTeamName;
        final String content;
        final CriclyticsButtonFlags criclyticsButtonFlags;
        final Integer currentDay;
        final String currentInningsTeamName;
        final String currentInningteamID;
        final Integer currentSession;
        final String currentinningsNo;
        final Boolean displayFeatureMatchScoreCard;
        final String firstInningsTeamID;
        final String fourthInningsTeamID;
        final Boolean hasPoints;
        final Boolean hasStatistics;
        final String homeTeamID;
        final String homeTeamName;
        final Boolean isAbandoned;
        final Boolean isCricklyticsAvailable;
        final Boolean isFantasyAvailable;
        final Boolean isHomeMatchUpade;
        final Boolean isLiveCriclyticsAvailable;
        final Boolean isNotified;
        final String league;
        final Boolean loginEnable;
        final String matchDateTimeGMT;
        final String matchID;
        final String matchName;
        final String matchNameHindi;
        final String matchNumber;
        final String matchResult;
        final List<MatchScore> matchScore;
        final String matchStatus;
        final String matchType;
        final String matchdate;
        final String matchenddate;
        final Boolean phaseOfInningFlag;
        final String playerID;
        final String playerOfTheMatch;
        final PlayerOfTheMatchdDetails playerOfTheMatchdDetails;
        final String playerofTheMatchTeamShortName;
        final Boolean playing11Status;
        final Boolean probable11Status;
        final String rRunRate;
        final String secondInningsTeamID;
        final String seriesID;
        final String seriesName;
        final String startDate;
        final String startEndDate;
        final String statusMessage;
        final String statusMessageHindi;
        final TeamsWinProbability teamsWinProbability;
        final String thirdInningsTeamID;
        final String toss;
        final Integer userNotification;
        final String venue;
        final String win;
        final String winningTeamID;

        public Featurematch(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, List<MatchScore> list, TeamsWinProbability teamsWinProbability2, Boolean bool2, Boolean bool3, Integer num, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, String str30, Boolean bool7, IPLpolling iPLpolling, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, String str31, CriclyticsButtonFlags criclyticsButtonFlags2, String str32, String str33, Boolean bool12, Boolean bool13, String str34, String str35, String str36, String str37, Integer num3, String str38, PlayerOfTheMatchdDetails playerOfTheMatchdDetails2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerofTheMatchTeamShortName = str2;
            this.matchdate = str3;
            this.seriesID = str4;
            this.winningTeamID = str5;
            this.displayFeatureMatchScoreCard = bool;
            this.currentinningsNo = str6;
            this.currentInningteamID = str7;
            this.currentInningsTeamName = str8;
            this.seriesName = str9;
            this.homeTeamName = str10;
            this.awayTeamName = str11;
            this.toss = str12;
            this.league = str13;
            this.startEndDate = str14;
            this.matchStatus = str15;
            this.matchID = str16;
            this.matchType = str17;
            this.statusMessage = str18;
            this.statusMessageHindi = str19;
            this.matchNumber = str20;
            this.venue = str21;
            this.matchResult = str22;
            this.startDate = str23;
            this.playerOfTheMatch = str24;
            this.playerID = str25;
            this.firstInningsTeamID = str26;
            this.secondInningsTeamID = str27;
            this.thirdInningsTeamID = str28;
            this.fourthInningsTeamID = str29;
            this.matchScore = list;
            this.teamsWinProbability = teamsWinProbability2;
            this.isCricklyticsAvailable = bool2;
            this.isLiveCriclyticsAvailable = bool3;
            this.currentDay = num;
            this.currentSession = num2;
            this.playing11Status = bool4;
            this.isAbandoned = bool5;
            this.isNotified = bool6;
            this.rRunRate = str30;
            this.probable11Status = bool7;
            this.IPLpolling = iPLpolling;
            this.isFantasyAvailable = bool8;
            this.hasStatistics = bool9;
            this.hasPoints = bool10;
            this.isHomeMatchUpade = bool11;
            this.content = str31;
            this.criclyticsButtonFlags = criclyticsButtonFlags2;
            this.matchName = str32;
            this.matchNameHindi = str33;
            this.phaseOfInningFlag = bool12;
            this.loginEnable = bool13;
            this.homeTeamID = str34;
            this.awayTeamID = str35;
            this.matchDateTimeGMT = str36;
            this.win = str37;
            this.userNotification = num3;
            this.matchenddate = str38;
            this.playerOfTheMatchdDetails = playerOfTheMatchdDetails2;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerofTheMatchTeamShortName() {
            return this.playerofTheMatchTeamShortName;
        }

        public String matchdate() {
            return this.matchdate;
        }

        public String seriesID() {
            return this.seriesID;
        }

        public String winningTeamID() {
            return this.winningTeamID;
        }

        public Boolean displayFeatureMatchScoreCard() {
            return this.displayFeatureMatchScoreCard;
        }

        public String currentinningsNo() {
            return this.currentinningsNo;
        }

        public String currentInningteamID() {
            return this.currentInningteamID;
        }

        public String currentInningsTeamName() {
            return this.currentInningsTeamName;
        }

        public String seriesName() {
            return this.seriesName;
        }

        public String homeTeamName() {
            return this.homeTeamName;
        }

        public String awayTeamName() {
            return this.awayTeamName;
        }

        public String toss() {
            return this.toss;
        }

        public String league() {
            return this.league;
        }

        public String startEndDate() {
            return this.startEndDate;
        }

        public String matchStatus() {
            return this.matchStatus;
        }

        public String matchID() {
            return this.matchID;
        }

        public String matchType() {
            return this.matchType;
        }

        public String statusMessage() {
            return this.statusMessage;
        }

        public String statusMessageHindi() {
            return this.statusMessageHindi;
        }

        public String matchNumber() {
            return this.matchNumber;
        }

        public String venue() {
            return this.venue;
        }

        public String matchResult() {
            return this.matchResult;
        }

        public String startDate() {
            return this.startDate;
        }

        public String playerOfTheMatch() {
            return this.playerOfTheMatch;
        }

        public String playerID() {
            return this.playerID;
        }

        public String firstInningsTeamID() {
            return this.firstInningsTeamID;
        }

        public String secondInningsTeamID() {
            return this.secondInningsTeamID;
        }

        public String thirdInningsTeamID() {
            return this.thirdInningsTeamID;
        }

        public String fourthInningsTeamID() {
            return this.fourthInningsTeamID;
        }

        public List<MatchScore> matchScore() {
            return this.matchScore;
        }

        public TeamsWinProbability teamsWinProbability() {
            return this.teamsWinProbability;
        }

        public Boolean isCricklyticsAvailable() {
            return this.isCricklyticsAvailable;
        }

        public Boolean isLiveCriclyticsAvailable() {
            return this.isLiveCriclyticsAvailable;
        }

        public Integer currentDay() {
            return this.currentDay;
        }

        public Integer currentSession() {
            return this.currentSession;
        }

        public Boolean playing11Status() {
            return this.playing11Status;
        }

        public Boolean isAbandoned() {
            return this.isAbandoned;
        }

        public Boolean isNotified() {
            return this.isNotified;
        }

        public String rRunRate() {
            return this.rRunRate;
        }

        public Boolean probable11Status() {
            return this.probable11Status;
        }

        public IPLpolling IPLpolling() {
            return this.IPLpolling;
        }

        public Boolean isFantasyAvailable() {
            return this.isFantasyAvailable;
        }

        public Boolean hasStatistics() {
            return this.hasStatistics;
        }

        public Boolean hasPoints() {
            return this.hasPoints;
        }

        public Boolean isHomeMatchUpade() {
            return this.isHomeMatchUpade;
        }

        public String content() {
            return this.content;
        }

        public CriclyticsButtonFlags criclyticsButtonFlags() {
            return this.criclyticsButtonFlags;
        }

        public String matchName() {
            return this.matchName;
        }

        public String matchNameHindi() {
            return this.matchNameHindi;
        }

        public Boolean phaseOfInningFlag() {
            return this.phaseOfInningFlag;
        }

        public Boolean loginEnable() {
            return this.loginEnable;
        }

        public String homeTeamID() {
            return this.homeTeamID;
        }

        public String awayTeamID() {
            return this.awayTeamID;
        }

        public String matchDateTimeGMT() {
            return this.matchDateTimeGMT;
        }

        public String win() {
            return this.win;
        }

        public Integer userNotification() {
            return this.userNotification;
        }

        public String matchenddate() {
            return this.matchenddate;
        }

        public PlayerOfTheMatchdDetails playerOfTheMatchdDetails() {
            return this.playerOfTheMatchdDetails;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Featurematch.$responseFields[0], Featurematch.this.__typename);
                    responseWriter.writeString(Featurematch.$responseFields[1], Featurematch.this.playerofTheMatchTeamShortName);
                    responseWriter.writeString(Featurematch.$responseFields[2], Featurematch.this.matchdate);
                    responseWriter.writeString(Featurematch.$responseFields[3], Featurematch.this.seriesID);
                    responseWriter.writeString(Featurematch.$responseFields[4], Featurematch.this.winningTeamID);
                    responseWriter.writeBoolean(Featurematch.$responseFields[5], Featurematch.this.displayFeatureMatchScoreCard);
                    responseWriter.writeString(Featurematch.$responseFields[6], Featurematch.this.currentinningsNo);
                    responseWriter.writeString(Featurematch.$responseFields[7], Featurematch.this.currentInningteamID);
                    responseWriter.writeString(Featurematch.$responseFields[8], Featurematch.this.currentInningsTeamName);
                    responseWriter.writeString(Featurematch.$responseFields[9], Featurematch.this.seriesName);
                    responseWriter.writeString(Featurematch.$responseFields[10], Featurematch.this.homeTeamName);
                    responseWriter.writeString(Featurematch.$responseFields[11], Featurematch.this.awayTeamName);
                    responseWriter.writeString(Featurematch.$responseFields[12], Featurematch.this.toss);
                    responseWriter.writeString(Featurematch.$responseFields[13], Featurematch.this.league);
                    responseWriter.writeString(Featurematch.$responseFields[14], Featurematch.this.startEndDate);
                    responseWriter.writeString(Featurematch.$responseFields[15], Featurematch.this.matchStatus);
                    responseWriter.writeString(Featurematch.$responseFields[16], Featurematch.this.matchID);
                    responseWriter.writeString(Featurematch.$responseFields[17], Featurematch.this.matchType);
                    responseWriter.writeString(Featurematch.$responseFields[18], Featurematch.this.statusMessage);
                    responseWriter.writeString(Featurematch.$responseFields[19], Featurematch.this.statusMessageHindi);
                    responseWriter.writeString(Featurematch.$responseFields[20], Featurematch.this.matchNumber);
                    responseWriter.writeString(Featurematch.$responseFields[21], Featurematch.this.venue);
                    responseWriter.writeString(Featurematch.$responseFields[22], Featurematch.this.matchResult);
                    responseWriter.writeString(Featurematch.$responseFields[23], Featurematch.this.startDate);
                    responseWriter.writeString(Featurematch.$responseFields[24], Featurematch.this.playerOfTheMatch);
                    responseWriter.writeString(Featurematch.$responseFields[25], Featurematch.this.playerID);
                    responseWriter.writeString(Featurematch.$responseFields[26], Featurematch.this.firstInningsTeamID);
                    responseWriter.writeString(Featurematch.$responseFields[27], Featurematch.this.secondInningsTeamID);
                    responseWriter.writeString(Featurematch.$responseFields[28], Featurematch.this.thirdInningsTeamID);
                    responseWriter.writeString(Featurematch.$responseFields[29], Featurematch.this.fourthInningsTeamID);
                    responseWriter.writeList(Featurematch.$responseFields[30], Featurematch.this.matchScore, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((MatchScore) it.next()).marshaller());
                            }
                        }
                    });
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(Featurematch.$responseFields[31], Featurematch.this.teamsWinProbability != null ? Featurematch.this.teamsWinProbability.marshaller() : null);
                    responseWriter.writeBoolean(Featurematch.$responseFields[32], Featurematch.this.isCricklyticsAvailable);
                    responseWriter.writeBoolean(Featurematch.$responseFields[33], Featurematch.this.isLiveCriclyticsAvailable);
                    responseWriter.writeInt(Featurematch.$responseFields[34], Featurematch.this.currentDay);
                    responseWriter.writeInt(Featurematch.$responseFields[35], Featurematch.this.currentSession);
                    responseWriter.writeBoolean(Featurematch.$responseFields[36], Featurematch.this.playing11Status);
                    responseWriter.writeBoolean(Featurematch.$responseFields[37], Featurematch.this.isAbandoned);
                    responseWriter.writeBoolean(Featurematch.$responseFields[38], Featurematch.this.isNotified);
                    responseWriter.writeString(Featurematch.$responseFields[39], Featurematch.this.rRunRate);
                    responseWriter.writeBoolean(Featurematch.$responseFields[40], Featurematch.this.probable11Status);
                    responseWriter.writeObject(Featurematch.$responseFields[41], Featurematch.this.IPLpolling != null ? Featurematch.this.IPLpolling.marshaller() : null);
                    responseWriter.writeBoolean(Featurematch.$responseFields[42], Featurematch.this.isFantasyAvailable);
                    responseWriter.writeBoolean(Featurematch.$responseFields[43], Featurematch.this.hasStatistics);
                    responseWriter.writeBoolean(Featurematch.$responseFields[44], Featurematch.this.hasPoints);
                    responseWriter.writeBoolean(Featurematch.$responseFields[45], Featurematch.this.isHomeMatchUpade);
                    responseWriter.writeString(Featurematch.$responseFields[46], Featurematch.this.content);
                    responseWriter.writeObject(Featurematch.$responseFields[47], Featurematch.this.criclyticsButtonFlags != null ? Featurematch.this.criclyticsButtonFlags.marshaller() : null);
                    responseWriter.writeString(Featurematch.$responseFields[48], Featurematch.this.matchName);
                    responseWriter.writeString(Featurematch.$responseFields[49], Featurematch.this.matchNameHindi);
                    responseWriter.writeBoolean(Featurematch.$responseFields[50], Featurematch.this.phaseOfInningFlag);
                    responseWriter.writeBoolean(Featurematch.$responseFields[51], Featurematch.this.loginEnable);
                    responseWriter.writeString(Featurematch.$responseFields[52], Featurematch.this.homeTeamID);
                    responseWriter.writeString(Featurematch.$responseFields[53], Featurematch.this.awayTeamID);
                    responseWriter.writeString(Featurematch.$responseFields[54], Featurematch.this.matchDateTimeGMT);
                    responseWriter.writeString(Featurematch.$responseFields[55], Featurematch.this.win);
                    responseWriter.writeInt(Featurematch.$responseFields[56], Featurematch.this.userNotification);
                    responseWriter.writeString(Featurematch.$responseFields[57], Featurematch.this.matchenddate);
                    ResponseField responseField = Featurematch.$responseFields[58];
                    if (Featurematch.this.playerOfTheMatchdDetails != null) {
                        responseFieldMarshaller = Featurematch.this.playerOfTheMatchdDetails.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Featurematch{__typename=" + this.__typename + ", playerofTheMatchTeamShortName=" + this.playerofTheMatchTeamShortName + ", matchdate=" + this.matchdate + ", seriesID=" + this.seriesID + ", winningTeamID=" + this.winningTeamID + ", displayFeatureMatchScoreCard=" + this.displayFeatureMatchScoreCard + ", currentinningsNo=" + this.currentinningsNo + ", currentInningteamID=" + this.currentInningteamID + ", currentInningsTeamName=" + this.currentInningsTeamName + ", seriesName=" + this.seriesName + ", homeTeamName=" + this.homeTeamName + ", awayTeamName=" + this.awayTeamName + ", toss=" + this.toss + ", league=" + this.league + ", startEndDate=" + this.startEndDate + ", matchStatus=" + this.matchStatus + ", matchID=" + this.matchID + ", matchType=" + this.matchType + ", statusMessage=" + this.statusMessage + ", statusMessageHindi=" + this.statusMessageHindi + ", matchNumber=" + this.matchNumber + ", venue=" + this.venue + ", matchResult=" + this.matchResult + ", startDate=" + this.startDate + ", playerOfTheMatch=" + this.playerOfTheMatch + ", playerID=" + this.playerID + ", firstInningsTeamID=" + this.firstInningsTeamID + ", secondInningsTeamID=" + this.secondInningsTeamID + ", thirdInningsTeamID=" + this.thirdInningsTeamID + ", fourthInningsTeamID=" + this.fourthInningsTeamID + ", matchScore=" + this.matchScore + ", teamsWinProbability=" + this.teamsWinProbability + ", isCricklyticsAvailable=" + this.isCricklyticsAvailable + ", isLiveCriclyticsAvailable=" + this.isLiveCriclyticsAvailable + ", currentDay=" + this.currentDay + ", currentSession=" + this.currentSession + ", playing11Status=" + this.playing11Status + ", isAbandoned=" + this.isAbandoned + ", isNotified=" + this.isNotified + ", rRunRate=" + this.rRunRate + ", probable11Status=" + this.probable11Status + ", IPLpolling=" + this.IPLpolling + ", isFantasyAvailable=" + this.isFantasyAvailable + ", hasStatistics=" + this.hasStatistics + ", hasPoints=" + this.hasPoints + ", isHomeMatchUpade=" + this.isHomeMatchUpade + ", content=" + this.content + ", criclyticsButtonFlags=" + this.criclyticsButtonFlags + ", matchName=" + this.matchName + ", matchNameHindi=" + this.matchNameHindi + ", phaseOfInningFlag=" + this.phaseOfInningFlag + ", loginEnable=" + this.loginEnable + ", homeTeamID=" + this.homeTeamID + ", awayTeamID=" + this.awayTeamID + ", matchDateTimeGMT=" + this.matchDateTimeGMT + ", win=" + this.win + ", userNotification=" + this.userNotification + ", matchenddate=" + this.matchenddate + ", playerOfTheMatchdDetails=" + this.playerOfTheMatchdDetails + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            Boolean bool;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            String str18;
            String str19;
            String str20;
            String str21;
            String str22;
            String str23;
            String str24;
            String str25;
            String str26;
            String str27;
            String str28;
            List<MatchScore> list;
            TeamsWinProbability teamsWinProbability2;
            Boolean bool2;
            Boolean bool3;
            Integer num;
            Integer num2;
            Boolean bool4;
            Boolean bool5;
            Boolean bool6;
            String str29;
            Boolean bool7;
            IPLpolling iPLpolling;
            Boolean bool8;
            Boolean bool9;
            Boolean bool10;
            Boolean bool11;
            String str30;
            CriclyticsButtonFlags criclyticsButtonFlags2;
            String str31;
            String str32;
            Boolean bool12;
            Boolean bool13;
            String str33;
            String str34;
            String str35;
            String str36;
            Integer num3;
            String str37;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Featurematch)) {
                return false;
            }
            Featurematch featurematch = (Featurematch) obj;
            if (this.__typename.equals(featurematch.__typename) && ((str = this.playerofTheMatchTeamShortName) != null ? str.equals(featurematch.playerofTheMatchTeamShortName) : featurematch.playerofTheMatchTeamShortName == null) && ((str2 = this.matchdate) != null ? str2.equals(featurematch.matchdate) : featurematch.matchdate == null) && ((str3 = this.seriesID) != null ? str3.equals(featurematch.seriesID) : featurematch.seriesID == null) && ((str4 = this.winningTeamID) != null ? str4.equals(featurematch.winningTeamID) : featurematch.winningTeamID == null) && ((bool = this.displayFeatureMatchScoreCard) != null ? bool.equals(featurematch.displayFeatureMatchScoreCard) : featurematch.displayFeatureMatchScoreCard == null) && ((str5 = this.currentinningsNo) != null ? str5.equals(featurematch.currentinningsNo) : featurematch.currentinningsNo == null) && ((str6 = this.currentInningteamID) != null ? str6.equals(featurematch.currentInningteamID) : featurematch.currentInningteamID == null) && ((str7 = this.currentInningsTeamName) != null ? str7.equals(featurematch.currentInningsTeamName) : featurematch.currentInningsTeamName == null) && ((str8 = this.seriesName) != null ? str8.equals(featurematch.seriesName) : featurematch.seriesName == null) && ((str9 = this.homeTeamName) != null ? str9.equals(featurematch.homeTeamName) : featurematch.homeTeamName == null) && ((str10 = this.awayTeamName) != null ? str10.equals(featurematch.awayTeamName) : featurematch.awayTeamName == null) && ((str11 = this.toss) != null ? str11.equals(featurematch.toss) : featurematch.toss == null) && ((str12 = this.league) != null ? str12.equals(featurematch.league) : featurematch.league == null) && ((str13 = this.startEndDate) != null ? str13.equals(featurematch.startEndDate) : featurematch.startEndDate == null) && ((str14 = this.matchStatus) != null ? str14.equals(featurematch.matchStatus) : featurematch.matchStatus == null) && ((str15 = this.matchID) != null ? str15.equals(featurematch.matchID) : featurematch.matchID == null) && ((str16 = this.matchType) != null ? str16.equals(featurematch.matchType) : featurematch.matchType == null) && ((str17 = this.statusMessage) != null ? str17.equals(featurematch.statusMessage) : featurematch.statusMessage == null) && ((str18 = this.statusMessageHindi) != null ? str18.equals(featurematch.statusMessageHindi) : featurematch.statusMessageHindi == null) && ((str19 = this.matchNumber) != null ? str19.equals(featurematch.matchNumber) : featurematch.matchNumber == null) && ((str20 = this.venue) != null ? str20.equals(featurematch.venue) : featurematch.venue == null) && ((str21 = this.matchResult) != null ? str21.equals(featurematch.matchResult) : featurematch.matchResult == null) && ((str22 = this.startDate) != null ? str22.equals(featurematch.startDate) : featurematch.startDate == null) && ((str23 = this.playerOfTheMatch) != null ? str23.equals(featurematch.playerOfTheMatch) : featurematch.playerOfTheMatch == null) && ((str24 = this.playerID) != null ? str24.equals(featurematch.playerID) : featurematch.playerID == null) && ((str25 = this.firstInningsTeamID) != null ? str25.equals(featurematch.firstInningsTeamID) : featurematch.firstInningsTeamID == null) && ((str26 = this.secondInningsTeamID) != null ? str26.equals(featurematch.secondInningsTeamID) : featurematch.secondInningsTeamID == null) && ((str27 = this.thirdInningsTeamID) != null ? str27.equals(featurematch.thirdInningsTeamID) : featurematch.thirdInningsTeamID == null) && ((str28 = this.fourthInningsTeamID) != null ? str28.equals(featurematch.fourthInningsTeamID) : featurematch.fourthInningsTeamID == null) && ((list = this.matchScore) != null ? list.equals(featurematch.matchScore) : featurematch.matchScore == null) && ((teamsWinProbability2 = this.teamsWinProbability) != null ? teamsWinProbability2.equals(featurematch.teamsWinProbability) : featurematch.teamsWinProbability == null) && ((bool2 = this.isCricklyticsAvailable) != null ? bool2.equals(featurematch.isCricklyticsAvailable) : featurematch.isCricklyticsAvailable == null) && ((bool3 = this.isLiveCriclyticsAvailable) != null ? bool3.equals(featurematch.isLiveCriclyticsAvailable) : featurematch.isLiveCriclyticsAvailable == null) && ((num = this.currentDay) != null ? num.equals(featurematch.currentDay) : featurematch.currentDay == null) && ((num2 = this.currentSession) != null ? num2.equals(featurematch.currentSession) : featurematch.currentSession == null) && ((bool4 = this.playing11Status) != null ? bool4.equals(featurematch.playing11Status) : featurematch.playing11Status == null) && ((bool5 = this.isAbandoned) != null ? bool5.equals(featurematch.isAbandoned) : featurematch.isAbandoned == null) && ((bool6 = this.isNotified) != null ? bool6.equals(featurematch.isNotified) : featurematch.isNotified == null) && ((str29 = this.rRunRate) != null ? str29.equals(featurematch.rRunRate) : featurematch.rRunRate == null) && ((bool7 = this.probable11Status) != null ? bool7.equals(featurematch.probable11Status) : featurematch.probable11Status == null) && ((iPLpolling = this.IPLpolling) != null ? iPLpolling.equals(featurematch.IPLpolling) : featurematch.IPLpolling == null) && ((bool8 = this.isFantasyAvailable) != null ? bool8.equals(featurematch.isFantasyAvailable) : featurematch.isFantasyAvailable == null) && ((bool9 = this.hasStatistics) != null ? bool9.equals(featurematch.hasStatistics) : featurematch.hasStatistics == null) && ((bool10 = this.hasPoints) != null ? bool10.equals(featurematch.hasPoints) : featurematch.hasPoints == null) && ((bool11 = this.isHomeMatchUpade) != null ? bool11.equals(featurematch.isHomeMatchUpade) : featurematch.isHomeMatchUpade == null) && ((str30 = this.content) != null ? str30.equals(featurematch.content) : featurematch.content == null) && ((criclyticsButtonFlags2 = this.criclyticsButtonFlags) != null ? criclyticsButtonFlags2.equals(featurematch.criclyticsButtonFlags) : featurematch.criclyticsButtonFlags == null) && ((str31 = this.matchName) != null ? str31.equals(featurematch.matchName) : featurematch.matchName == null) && ((str32 = this.matchNameHindi) != null ? str32.equals(featurematch.matchNameHindi) : featurematch.matchNameHindi == null) && ((bool12 = this.phaseOfInningFlag) != null ? bool12.equals(featurematch.phaseOfInningFlag) : featurematch.phaseOfInningFlag == null) && ((bool13 = this.loginEnable) != null ? bool13.equals(featurematch.loginEnable) : featurematch.loginEnable == null) && ((str33 = this.homeTeamID) != null ? str33.equals(featurematch.homeTeamID) : featurematch.homeTeamID == null) && ((str34 = this.awayTeamID) != null ? str34.equals(featurematch.awayTeamID) : featurematch.awayTeamID == null) && ((str35 = this.matchDateTimeGMT) != null ? str35.equals(featurematch.matchDateTimeGMT) : featurematch.matchDateTimeGMT == null) && ((str36 = this.win) != null ? str36.equals(featurematch.win) : featurematch.win == null) && ((num3 = this.userNotification) != null ? num3.equals(featurematch.userNotification) : featurematch.userNotification == null) && ((str37 = this.matchenddate) != null ? str37.equals(featurematch.matchenddate) : featurematch.matchenddate == null)) {
                PlayerOfTheMatchdDetails playerOfTheMatchdDetails2 = this.playerOfTheMatchdDetails;
                PlayerOfTheMatchdDetails playerOfTheMatchdDetails3 = featurematch.playerOfTheMatchdDetails;
                if (playerOfTheMatchdDetails2 == null) {
                    if (playerOfTheMatchdDetails3 == null) {
                        return true;
                    }
                } else if (playerOfTheMatchdDetails2.equals(playerOfTheMatchdDetails3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.playerofTheMatchTeamShortName;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.matchdate;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.seriesID;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.winningTeamID;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                Boolean bool = this.displayFeatureMatchScoreCard;
                int hashCode6 = (hashCode5 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str5 = this.currentinningsNo;
                int hashCode7 = (hashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.currentInningteamID;
                int hashCode8 = (hashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.currentInningsTeamName;
                int hashCode9 = (hashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.seriesName;
                int hashCode10 = (hashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.homeTeamName;
                int hashCode11 = (hashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.awayTeamName;
                int hashCode12 = (hashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.toss;
                int hashCode13 = (hashCode12 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.league;
                int hashCode14 = (hashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.startEndDate;
                int hashCode15 = (hashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.matchStatus;
                int hashCode16 = (hashCode15 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.matchID;
                int hashCode17 = (hashCode16 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.matchType;
                int hashCode18 = (hashCode17 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.statusMessage;
                int hashCode19 = (hashCode18 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.statusMessageHindi;
                int hashCode20 = (hashCode19 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.matchNumber;
                int hashCode21 = (hashCode20 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.venue;
                int hashCode22 = (hashCode21 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                String str21 = this.matchResult;
                int hashCode23 = (hashCode22 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                String str22 = this.startDate;
                int hashCode24 = (hashCode23 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
                String str23 = this.playerOfTheMatch;
                int hashCode25 = (hashCode24 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
                String str24 = this.playerID;
                int hashCode26 = (hashCode25 ^ (str24 == null ? 0 : str24.hashCode())) * 1000003;
                String str25 = this.firstInningsTeamID;
                int hashCode27 = (hashCode26 ^ (str25 == null ? 0 : str25.hashCode())) * 1000003;
                String str26 = this.secondInningsTeamID;
                int hashCode28 = (hashCode27 ^ (str26 == null ? 0 : str26.hashCode())) * 1000003;
                String str27 = this.thirdInningsTeamID;
                int hashCode29 = (hashCode28 ^ (str27 == null ? 0 : str27.hashCode())) * 1000003;
                String str28 = this.fourthInningsTeamID;
                int hashCode30 = (hashCode29 ^ (str28 == null ? 0 : str28.hashCode())) * 1000003;
                List<MatchScore> list = this.matchScore;
                int hashCode31 = (hashCode30 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                TeamsWinProbability teamsWinProbability2 = this.teamsWinProbability;
                int hashCode32 = (hashCode31 ^ (teamsWinProbability2 == null ? 0 : teamsWinProbability2.hashCode())) * 1000003;
                Boolean bool2 = this.isCricklyticsAvailable;
                int hashCode33 = (hashCode32 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                Boolean bool3 = this.isLiveCriclyticsAvailable;
                int hashCode34 = (hashCode33 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
                Integer num = this.currentDay;
                int hashCode35 = (hashCode34 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.currentSession;
                int hashCode36 = (hashCode35 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Boolean bool4 = this.playing11Status;
                int hashCode37 = (hashCode36 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
                Boolean bool5 = this.isAbandoned;
                int hashCode38 = (hashCode37 ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003;
                Boolean bool6 = this.isNotified;
                int hashCode39 = (hashCode38 ^ (bool6 == null ? 0 : bool6.hashCode())) * 1000003;
                String str29 = this.rRunRate;
                int hashCode40 = (hashCode39 ^ (str29 == null ? 0 : str29.hashCode())) * 1000003;
                Boolean bool7 = this.probable11Status;
                int hashCode41 = (hashCode40 ^ (bool7 == null ? 0 : bool7.hashCode())) * 1000003;
                IPLpolling iPLpolling = this.IPLpolling;
                int hashCode42 = (hashCode41 ^ (iPLpolling == null ? 0 : iPLpolling.hashCode())) * 1000003;
                Boolean bool8 = this.isFantasyAvailable;
                int hashCode43 = (hashCode42 ^ (bool8 == null ? 0 : bool8.hashCode())) * 1000003;
                Boolean bool9 = this.hasStatistics;
                int hashCode44 = (hashCode43 ^ (bool9 == null ? 0 : bool9.hashCode())) * 1000003;
                Boolean bool10 = this.hasPoints;
                int hashCode45 = (hashCode44 ^ (bool10 == null ? 0 : bool10.hashCode())) * 1000003;
                Boolean bool11 = this.isHomeMatchUpade;
                int hashCode46 = (hashCode45 ^ (bool11 == null ? 0 : bool11.hashCode())) * 1000003;
                String str30 = this.content;
                int hashCode47 = (hashCode46 ^ (str30 == null ? 0 : str30.hashCode())) * 1000003;
                CriclyticsButtonFlags criclyticsButtonFlags2 = this.criclyticsButtonFlags;
                int hashCode48 = (hashCode47 ^ (criclyticsButtonFlags2 == null ? 0 : criclyticsButtonFlags2.hashCode())) * 1000003;
                String str31 = this.matchName;
                int hashCode49 = (hashCode48 ^ (str31 == null ? 0 : str31.hashCode())) * 1000003;
                String str32 = this.matchNameHindi;
                int hashCode50 = (hashCode49 ^ (str32 == null ? 0 : str32.hashCode())) * 1000003;
                Boolean bool12 = this.phaseOfInningFlag;
                int hashCode51 = (hashCode50 ^ (bool12 == null ? 0 : bool12.hashCode())) * 1000003;
                Boolean bool13 = this.loginEnable;
                int hashCode52 = (hashCode51 ^ (bool13 == null ? 0 : bool13.hashCode())) * 1000003;
                String str33 = this.homeTeamID;
                int hashCode53 = (hashCode52 ^ (str33 == null ? 0 : str33.hashCode())) * 1000003;
                String str34 = this.awayTeamID;
                int hashCode54 = (hashCode53 ^ (str34 == null ? 0 : str34.hashCode())) * 1000003;
                String str35 = this.matchDateTimeGMT;
                int hashCode55 = (hashCode54 ^ (str35 == null ? 0 : str35.hashCode())) * 1000003;
                String str36 = this.win;
                int hashCode56 = (hashCode55 ^ (str36 == null ? 0 : str36.hashCode())) * 1000003;
                Integer num3 = this.userNotification;
                int hashCode57 = (hashCode56 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                String str37 = this.matchenddate;
                int hashCode58 = (hashCode57 ^ (str37 == null ? 0 : str37.hashCode())) * 1000003;
                PlayerOfTheMatchdDetails playerOfTheMatchdDetails2 = this.playerOfTheMatchdDetails;
                if (playerOfTheMatchdDetails2 != null) {
                    i = playerOfTheMatchdDetails2.hashCode();
                }
                this.$hashCode = hashCode58 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Featurematch> {
            final CriclyticsButtonFlags.Mapper criclyticsButtonFlagsFieldMapper = new CriclyticsButtonFlags.Mapper();
            final IPLpolling.Mapper iPLpollingFieldMapper = new IPLpolling.Mapper();
            final MatchScore.Mapper matchScoreFieldMapper = new MatchScore.Mapper();
            final PlayerOfTheMatchdDetails.Mapper playerOfTheMatchdDetailsFieldMapper = new PlayerOfTheMatchdDetails.Mapper();
            final TeamsWinProbability.Mapper teamsWinProbabilityFieldMapper = new TeamsWinProbability.Mapper();

            @Override 
            public Featurematch map(ResponseReader responseReader) {
                return new Featurematch(responseReader.readString(Featurematch.$responseFields[0]), responseReader.readString(Featurematch.$responseFields[1]), responseReader.readString(Featurematch.$responseFields[2]), responseReader.readString(Featurematch.$responseFields[3]), responseReader.readString(Featurematch.$responseFields[4]), responseReader.readBoolean(Featurematch.$responseFields[5]), responseReader.readString(Featurematch.$responseFields[6]), responseReader.readString(Featurematch.$responseFields[7]), responseReader.readString(Featurematch.$responseFields[8]), responseReader.readString(Featurematch.$responseFields[9]), responseReader.readString(Featurematch.$responseFields[10]), responseReader.readString(Featurematch.$responseFields[11]), responseReader.readString(Featurematch.$responseFields[12]), responseReader.readString(Featurematch.$responseFields[13]), responseReader.readString(Featurematch.$responseFields[14]), responseReader.readString(Featurematch.$responseFields[15]), responseReader.readString(Featurematch.$responseFields[16]), responseReader.readString(Featurematch.$responseFields[17]), responseReader.readString(Featurematch.$responseFields[18]), responseReader.readString(Featurematch.$responseFields[19]), responseReader.readString(Featurematch.$responseFields[20]), responseReader.readString(Featurematch.$responseFields[21]), responseReader.readString(Featurematch.$responseFields[22]), responseReader.readString(Featurematch.$responseFields[23]), responseReader.readString(Featurematch.$responseFields[24]), responseReader.readString(Featurematch.$responseFields[25]), responseReader.readString(Featurematch.$responseFields[26]), responseReader.readString(Featurematch.$responseFields[27]), responseReader.readString(Featurematch.$responseFields[28]), responseReader.readString(Featurematch.$responseFields[29]), responseReader.readList(Featurematch.$responseFields[30], new ResponseReader.ListReader<MatchScore>() {


                    @Override 
                    public MatchScore read(ResponseReader.ListItemReader listItemReader) {
                        return (MatchScore) listItemReader.readObject(new ResponseReader.ObjectReader<MatchScore>() {


                            @Override 
                            public MatchScore read(ResponseReader responseReader) {
                                return Mapper.this.matchScoreFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (TeamsWinProbability) responseReader.readObject(Featurematch.$responseFields[31], new ResponseReader.ObjectReader<TeamsWinProbability>() {


                    @Override 
                    public TeamsWinProbability read(ResponseReader responseReader) {
                        return Mapper.this.teamsWinProbabilityFieldMapper.map(responseReader);
                    }
                }), responseReader.readBoolean(Featurematch.$responseFields[32]), responseReader.readBoolean(Featurematch.$responseFields[33]), responseReader.readInt(Featurematch.$responseFields[34]), responseReader.readInt(Featurematch.$responseFields[35]), responseReader.readBoolean(Featurematch.$responseFields[36]), responseReader.readBoolean(Featurematch.$responseFields[37]), responseReader.readBoolean(Featurematch.$responseFields[38]), responseReader.readString(Featurematch.$responseFields[39]), responseReader.readBoolean(Featurematch.$responseFields[40]), (IPLpolling) responseReader.readObject(Featurematch.$responseFields[41], new ResponseReader.ObjectReader<IPLpolling>() {


                    @Override 
                    public IPLpolling read(ResponseReader responseReader) {
                        return Mapper.this.iPLpollingFieldMapper.map(responseReader);
                    }
                }), responseReader.readBoolean(Featurematch.$responseFields[42]), responseReader.readBoolean(Featurematch.$responseFields[43]), responseReader.readBoolean(Featurematch.$responseFields[44]), responseReader.readBoolean(Featurematch.$responseFields[45]), responseReader.readString(Featurematch.$responseFields[46]), (CriclyticsButtonFlags) responseReader.readObject(Featurematch.$responseFields[47], new ResponseReader.ObjectReader<CriclyticsButtonFlags>() {


                    @Override 
                    public CriclyticsButtonFlags read(ResponseReader responseReader) {
                        return Mapper.this.criclyticsButtonFlagsFieldMapper.map(responseReader);
                    }
                }), responseReader.readString(Featurematch.$responseFields[48]), responseReader.readString(Featurematch.$responseFields[49]), responseReader.readBoolean(Featurematch.$responseFields[50]), responseReader.readBoolean(Featurematch.$responseFields[51]), responseReader.readString(Featurematch.$responseFields[52]), responseReader.readString(Featurematch.$responseFields[53]), responseReader.readString(Featurematch.$responseFields[54]), responseReader.readString(Featurematch.$responseFields[55]), responseReader.readInt(Featurematch.$responseFields[56]), responseReader.readString(Featurematch.$responseFields[57]), (PlayerOfTheMatchdDetails) responseReader.readObject(Featurematch.$responseFields[58], new ResponseReader.ObjectReader<PlayerOfTheMatchdDetails>() {


                    @Override 
                    public PlayerOfTheMatchdDetails read(ResponseReader responseReader) {
                        return Mapper.this.playerOfTheMatchdDetailsFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class MatchScore {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamShortName", "teamShortName", null, true, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("teamFullName", "teamFullName", null, true, Collections.emptyList()), ResponseField.forList("teamScore", "teamScore", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String teamFullName;
        final String teamID;
        final List<TeamScore> teamScore;
        final String teamShortName;

        public MatchScore(String str, String str2, String str3, String str4, List<TeamScore> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.teamShortName = str2;
            this.teamID = str3;
            this.teamFullName = str4;
            this.teamScore = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public String teamShortName() {
            return this.teamShortName;
        }

        public String teamID() {
            return this.teamID;
        }

        public String teamFullName() {
            return this.teamFullName;
        }

        public List<TeamScore> teamScore() {
            return this.teamScore;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(MatchScore.$responseFields[0], MatchScore.this.__typename);
                    responseWriter.writeString(MatchScore.$responseFields[1], MatchScore.this.teamShortName);
                    responseWriter.writeString(MatchScore.$responseFields[2], MatchScore.this.teamID);
                    responseWriter.writeString(MatchScore.$responseFields[3], MatchScore.this.teamFullName);
                    responseWriter.writeList(MatchScore.$responseFields[4], MatchScore.this.teamScore, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((TeamScore) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "MatchScore{__typename=" + this.__typename + ", teamShortName=" + this.teamShortName + ", teamID=" + this.teamID + ", teamFullName=" + this.teamFullName + ", teamScore=" + this.teamScore + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MatchScore)) {
                return false;
            }
            MatchScore matchScore = (MatchScore) obj;
            if (this.__typename.equals(matchScore.__typename) && ((str = this.teamShortName) != null ? str.equals(matchScore.teamShortName) : matchScore.teamShortName == null) && ((str2 = this.teamID) != null ? str2.equals(matchScore.teamID) : matchScore.teamID == null) && ((str3 = this.teamFullName) != null ? str3.equals(matchScore.teamFullName) : matchScore.teamFullName == null)) {
                List<TeamScore> list = this.teamScore;
                List<TeamScore> list2 = matchScore.teamScore;
                if (list == null) {
                    if (list2 == null) {
                        return true;
                    }
                } else if (list.equals(list2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.teamShortName;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.teamID;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.teamFullName;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                List<TeamScore> list = this.teamScore;
                if (list != null) {
                    i = list.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<MatchScore> {
            final TeamScore.Mapper teamScoreFieldMapper = new TeamScore.Mapper();

            @Override 
            public MatchScore map(ResponseReader responseReader) {
                return new MatchScore(responseReader.readString(MatchScore.$responseFields[0]), responseReader.readString(MatchScore.$responseFields[1]), responseReader.readString(MatchScore.$responseFields[2]), responseReader.readString(MatchScore.$responseFields[3]), responseReader.readList(MatchScore.$responseFields[4], new ResponseReader.ListReader<TeamScore>() {


                    @Override 
                    public TeamScore read(ResponseReader.ListItemReader listItemReader) {
                        return (TeamScore) listItemReader.readObject(new ResponseReader.ObjectReader<TeamScore>() {


                            @Override 
                            public TeamScore read(ResponseReader responseReader) {
                                return Mapper.this.teamScoreFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class TeamScore {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("inning", "inning", null, true, Collections.emptyList()), ResponseField.forString("inningNumber", "inningNumber", null, true, Collections.emptyList()), ResponseField.forString("battingTeam", "battingTeam", null, true, Collections.emptyList()), ResponseField.forString("runsScored", "runsScored", null, true, Collections.emptyList()), ResponseField.forString("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forString("overs", "overs", null, true, Collections.emptyList()), ResponseField.forString("runRate", "runRate", null, true, Collections.emptyList()), ResponseField.forString("battingSide", "battingSide", null, true, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("battingTeamShortName", "battingTeamShortName", null, true, Collections.emptyList()), ResponseField.forBoolean("declared", "declared", null, true, Collections.emptyList()), ResponseField.forBoolean("folowOn", "folowOn", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String battingSide;
        final String battingTeam;
        final String battingTeamShortName;
        final Boolean declared;
        final Boolean folowOn;
        final Integer inning;
        final String inningNumber;
        final String overs;
        final String runRate;
        final String runsScored;
        final String teamID;
        final String wickets;

        public TeamScore(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, Boolean bool2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.inning = num;
            this.inningNumber = str2;
            this.battingTeam = str3;
            this.runsScored = str4;
            this.wickets = str5;
            this.overs = str6;
            this.runRate = str7;
            this.battingSide = str8;
            this.teamID = str9;
            this.battingTeamShortName = str10;
            this.declared = bool;
            this.folowOn = bool2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer inning() {
            return this.inning;
        }

        public String inningNumber() {
            return this.inningNumber;
        }

        public String battingTeam() {
            return this.battingTeam;
        }

        public String runsScored() {
            return this.runsScored;
        }

        public String wickets() {
            return this.wickets;
        }

        public String overs() {
            return this.overs;
        }

        public String runRate() {
            return this.runRate;
        }

        public String battingSide() {
            return this.battingSide;
        }

        public String teamID() {
            return this.teamID;
        }

        public String battingTeamShortName() {
            return this.battingTeamShortName;
        }

        public Boolean declared() {
            return this.declared;
        }

        public Boolean folowOn() {
            return this.folowOn;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TeamScore.$responseFields[0], TeamScore.this.__typename);
                    responseWriter.writeInt(TeamScore.$responseFields[1], TeamScore.this.inning);
                    responseWriter.writeString(TeamScore.$responseFields[2], TeamScore.this.inningNumber);
                    responseWriter.writeString(TeamScore.$responseFields[3], TeamScore.this.battingTeam);
                    responseWriter.writeString(TeamScore.$responseFields[4], TeamScore.this.runsScored);
                    responseWriter.writeString(TeamScore.$responseFields[5], TeamScore.this.wickets);
                    responseWriter.writeString(TeamScore.$responseFields[6], TeamScore.this.overs);
                    responseWriter.writeString(TeamScore.$responseFields[7], TeamScore.this.runRate);
                    responseWriter.writeString(TeamScore.$responseFields[8], TeamScore.this.battingSide);
                    responseWriter.writeString(TeamScore.$responseFields[9], TeamScore.this.teamID);
                    responseWriter.writeString(TeamScore.$responseFields[10], TeamScore.this.battingTeamShortName);
                    responseWriter.writeBoolean(TeamScore.$responseFields[11], TeamScore.this.declared);
                    responseWriter.writeBoolean(TeamScore.$responseFields[12], TeamScore.this.folowOn);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TeamScore{__typename=" + this.__typename + ", inning=" + this.inning + ", inningNumber=" + this.inningNumber + ", battingTeam=" + this.battingTeam + ", runsScored=" + this.runsScored + ", wickets=" + this.wickets + ", overs=" + this.overs + ", runRate=" + this.runRate + ", battingSide=" + this.battingSide + ", teamID=" + this.teamID + ", battingTeamShortName=" + this.battingTeamShortName + ", declared=" + this.declared + ", folowOn=" + this.folowOn + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            Boolean bool;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TeamScore)) {
                return false;
            }
            TeamScore teamScore = (TeamScore) obj;
            if (this.__typename.equals(teamScore.__typename) && ((num = this.inning) != null ? num.equals(teamScore.inning) : teamScore.inning == null) && ((str = this.inningNumber) != null ? str.equals(teamScore.inningNumber) : teamScore.inningNumber == null) && ((str2 = this.battingTeam) != null ? str2.equals(teamScore.battingTeam) : teamScore.battingTeam == null) && ((str3 = this.runsScored) != null ? str3.equals(teamScore.runsScored) : teamScore.runsScored == null) && ((str4 = this.wickets) != null ? str4.equals(teamScore.wickets) : teamScore.wickets == null) && ((str5 = this.overs) != null ? str5.equals(teamScore.overs) : teamScore.overs == null) && ((str6 = this.runRate) != null ? str6.equals(teamScore.runRate) : teamScore.runRate == null) && ((str7 = this.battingSide) != null ? str7.equals(teamScore.battingSide) : teamScore.battingSide == null) && ((str8 = this.teamID) != null ? str8.equals(teamScore.teamID) : teamScore.teamID == null) && ((str9 = this.battingTeamShortName) != null ? str9.equals(teamScore.battingTeamShortName) : teamScore.battingTeamShortName == null) && ((bool = this.declared) != null ? bool.equals(teamScore.declared) : teamScore.declared == null)) {
                Boolean bool2 = this.folowOn;
                Boolean bool3 = teamScore.folowOn;
                if (bool2 == null) {
                    if (bool3 == null) {
                        return true;
                    }
                } else if (bool2.equals(bool3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.inning;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str = this.inningNumber;
                int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.battingTeam;
                int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.runsScored;
                int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.wickets;
                int hashCode6 = (hashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.overs;
                int hashCode7 = (hashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.runRate;
                int hashCode8 = (hashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.battingSide;
                int hashCode9 = (hashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.teamID;
                int hashCode10 = (hashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.battingTeamShortName;
                int hashCode11 = (hashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                Boolean bool = this.declared;
                int hashCode12 = (hashCode11 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.folowOn;
                if (bool2 != null) {
                    i = bool2.hashCode();
                }
                this.$hashCode = hashCode12 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TeamScore> {
            @Override 
            public TeamScore map(ResponseReader responseReader) {
                return new TeamScore(responseReader.readString(TeamScore.$responseFields[0]), responseReader.readInt(TeamScore.$responseFields[1]), responseReader.readString(TeamScore.$responseFields[2]), responseReader.readString(TeamScore.$responseFields[3]), responseReader.readString(TeamScore.$responseFields[4]), responseReader.readString(TeamScore.$responseFields[5]), responseReader.readString(TeamScore.$responseFields[6]), responseReader.readString(TeamScore.$responseFields[7]), responseReader.readString(TeamScore.$responseFields[8]), responseReader.readString(TeamScore.$responseFields[9]), responseReader.readString(TeamScore.$responseFields[10]), responseReader.readBoolean(TeamScore.$responseFields[11]), responseReader.readBoolean(TeamScore.$responseFields[12]));
            }
        }
    }

    public static class TeamsWinProbability {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("homeTeamShortName", "homeTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("homeTeamPercentage", "homeTeamPercentage", null, true, Collections.emptyList()), ResponseField.forString("awayTeamShortName", "awayTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("awayTeamPercentage", "awayTeamPercentage", null, true, Collections.emptyList()), ResponseField.forString("tiePercentage", "tiePercentage", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String awayTeamPercentage;
        final String awayTeamShortName;
        final String homeTeamPercentage;
        final String homeTeamShortName;
        final String tiePercentage;

        public TeamsWinProbability(String str, String str2, String str3, String str4, String str5, String str6) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.homeTeamShortName = str2;
            this.homeTeamPercentage = str3;
            this.awayTeamShortName = str4;
            this.awayTeamPercentage = str5;
            this.tiePercentage = str6;
        }

        public String __typename() {
            return this.__typename;
        }

        public String homeTeamShortName() {
            return this.homeTeamShortName;
        }

        public String homeTeamPercentage() {
            return this.homeTeamPercentage;
        }

        public String awayTeamShortName() {
            return this.awayTeamShortName;
        }

        public String awayTeamPercentage() {
            return this.awayTeamPercentage;
        }

        public String tiePercentage() {
            return this.tiePercentage;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TeamsWinProbability.$responseFields[0], TeamsWinProbability.this.__typename);
                    responseWriter.writeString(TeamsWinProbability.$responseFields[1], TeamsWinProbability.this.homeTeamShortName);
                    responseWriter.writeString(TeamsWinProbability.$responseFields[2], TeamsWinProbability.this.homeTeamPercentage);
                    responseWriter.writeString(TeamsWinProbability.$responseFields[3], TeamsWinProbability.this.awayTeamShortName);
                    responseWriter.writeString(TeamsWinProbability.$responseFields[4], TeamsWinProbability.this.awayTeamPercentage);
                    responseWriter.writeString(TeamsWinProbability.$responseFields[5], TeamsWinProbability.this.tiePercentage);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TeamsWinProbability{__typename=" + this.__typename + ", homeTeamShortName=" + this.homeTeamShortName + ", homeTeamPercentage=" + this.homeTeamPercentage + ", awayTeamShortName=" + this.awayTeamShortName + ", awayTeamPercentage=" + this.awayTeamPercentage + ", tiePercentage=" + this.tiePercentage + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TeamsWinProbability)) {
                return false;
            }
            TeamsWinProbability teamsWinProbability = (TeamsWinProbability) obj;
            if (this.__typename.equals(teamsWinProbability.__typename) && ((str = this.homeTeamShortName) != null ? str.equals(teamsWinProbability.homeTeamShortName) : teamsWinProbability.homeTeamShortName == null) && ((str2 = this.homeTeamPercentage) != null ? str2.equals(teamsWinProbability.homeTeamPercentage) : teamsWinProbability.homeTeamPercentage == null) && ((str3 = this.awayTeamShortName) != null ? str3.equals(teamsWinProbability.awayTeamShortName) : teamsWinProbability.awayTeamShortName == null) && ((str4 = this.awayTeamPercentage) != null ? str4.equals(teamsWinProbability.awayTeamPercentage) : teamsWinProbability.awayTeamPercentage == null)) {
                String str5 = this.tiePercentage;
                String str6 = teamsWinProbability.tiePercentage;
                if (str5 == null) {
                    if (str6 == null) {
                        return true;
                    }
                } else if (str5.equals(str6)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.homeTeamShortName;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.homeTeamPercentage;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.awayTeamShortName;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.awayTeamPercentage;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.tiePercentage;
                if (str5 != null) {
                    i = str5.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TeamsWinProbability> {
            @Override
            public TeamsWinProbability map(ResponseReader responseReader) {
                return new TeamsWinProbability(responseReader.readString(TeamsWinProbability.$responseFields[0]), responseReader.readString(TeamsWinProbability.$responseFields[1]), responseReader.readString(TeamsWinProbability.$responseFields[2]), responseReader.readString(TeamsWinProbability.$responseFields[3]), responseReader.readString(TeamsWinProbability.$responseFields[4]), responseReader.readString(TeamsWinProbability.$responseFields[5]));
            }
        }
    }

    public static class IPLpolling {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, null, true, Collections.emptyList()), ResponseField.forBoolean("isPolling", "isPolling", null, true, Collections.emptyList()), ResponseField.forBoolean(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, null, true, Collections.emptyList()), ResponseField.forBoolean("isCompleted", "isCompleted", null, true, Collections.emptyList()), ResponseField.forBoolean("isAuctionStarted", "isAuctionStarted", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Boolean display;
        final Boolean isAuctionStarted;
        final Boolean isCompleted;
        final Boolean isPolling;
        final String name;

        public IPLpolling(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.name = str2;
            this.isPolling = bool;
            this.display = bool2;
            this.isCompleted = bool3;
            this.isAuctionStarted = bool4;
        }

        public String __typename() {
            return this.__typename;
        }

        public String name() {
            return this.name;
        }

        public Boolean isPolling() {
            return this.isPolling;
        }

        public Boolean display() {
            return this.display;
        }

        public Boolean isCompleted() {
            return this.isCompleted;
        }

        public Boolean isAuctionStarted() {
            return this.isAuctionStarted;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(IPLpolling.$responseFields[0], IPLpolling.this.__typename);
                    responseWriter.writeString(IPLpolling.$responseFields[1], IPLpolling.this.name);
                    responseWriter.writeBoolean(IPLpolling.$responseFields[2], IPLpolling.this.isPolling);
                    responseWriter.writeBoolean(IPLpolling.$responseFields[3], IPLpolling.this.display);
                    responseWriter.writeBoolean(IPLpolling.$responseFields[4], IPLpolling.this.isCompleted);
                    responseWriter.writeBoolean(IPLpolling.$responseFields[5], IPLpolling.this.isAuctionStarted);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "IPLpolling{__typename=" + this.__typename + ", name=" + this.name + ", isPolling=" + this.isPolling + ", display=" + this.display + ", isCompleted=" + this.isCompleted + ", isAuctionStarted=" + this.isAuctionStarted + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IPLpolling)) {
                return false;
            }
            IPLpolling iPLpolling = (IPLpolling) obj;
            if (this.__typename.equals(iPLpolling.__typename) && ((str = this.name) != null ? str.equals(iPLpolling.name) : iPLpolling.name == null) && ((bool = this.isPolling) != null ? bool.equals(iPLpolling.isPolling) : iPLpolling.isPolling == null) && ((bool2 = this.display) != null ? bool2.equals(iPLpolling.display) : iPLpolling.display == null) && ((bool3 = this.isCompleted) != null ? bool3.equals(iPLpolling.isCompleted) : iPLpolling.isCompleted == null)) {
                Boolean bool4 = this.isAuctionStarted;
                Boolean bool5 = iPLpolling.isAuctionStarted;
                if (bool4 == null) {
                    if (bool5 == null) {
                        return true;
                    }
                } else if (bool4.equals(bool5)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.name;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Boolean bool = this.isPolling;
                int hashCode3 = (hashCode2 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.display;
                int hashCode4 = (hashCode3 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                Boolean bool3 = this.isCompleted;
                int hashCode5 = (hashCode4 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
                Boolean bool4 = this.isAuctionStarted;
                if (bool4 != null) {
                    i = bool4.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<IPLpolling> {
            @Override 
            public IPLpolling map(ResponseReader responseReader) {
                return new IPLpolling(responseReader.readString(IPLpolling.$responseFields[0]), responseReader.readString(IPLpolling.$responseFields[1]), responseReader.readBoolean(IPLpolling.$responseFields[2]), responseReader.readBoolean(IPLpolling.$responseFields[3]), responseReader.readBoolean(IPLpolling.$responseFields[4]), responseReader.readBoolean(IPLpolling.$responseFields[5]));
            }
        }
    }

    public static class CriclyticsButtonFlags {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("featuredSeriesName", "featuredSeriesName", null, true, Collections.emptyList()), ResponseField.forBoolean("isPlayerIndex", "isPlayerIndex", null, true, Collections.emptyList()), ResponseField.forBoolean("isFinalFour", "isFinalFour", null, true, Collections.emptyList()), ResponseField.forString("tourID", "tourID", null, true, Collections.emptyList()), ResponseField.forString("seriesName", "seriesName", null, true, Collections.emptyList()), ResponseField.forString("frcStartTime", "frcStartTime", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String featuredSeriesName;
        final String frcStartTime;
        final Boolean isFinalFour;
        final Boolean isPlayerIndex;
        final String seriesName;
        final String tourID;

        public CriclyticsButtonFlags(String str, String str2, Boolean bool, Boolean bool2, String str3, String str4, String str5) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.featuredSeriesName = str2;
            this.isPlayerIndex = bool;
            this.isFinalFour = bool2;
            this.tourID = str3;
            this.seriesName = str4;
            this.frcStartTime = str5;
        }

        public String __typename() {
            return this.__typename;
        }

        public String featuredSeriesName() {
            return this.featuredSeriesName;
        }

        public Boolean isPlayerIndex() {
            return this.isPlayerIndex;
        }

        public Boolean isFinalFour() {
            return this.isFinalFour;
        }

        public String tourID() {
            return this.tourID;
        }

        public String seriesName() {
            return this.seriesName;
        }

        public String frcStartTime() {
            return this.frcStartTime;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(CriclyticsButtonFlags.$responseFields[0], CriclyticsButtonFlags.this.__typename);
                    responseWriter.writeString(CriclyticsButtonFlags.$responseFields[1], CriclyticsButtonFlags.this.featuredSeriesName);
                    responseWriter.writeBoolean(CriclyticsButtonFlags.$responseFields[2], CriclyticsButtonFlags.this.isPlayerIndex);
                    responseWriter.writeBoolean(CriclyticsButtonFlags.$responseFields[3], CriclyticsButtonFlags.this.isFinalFour);
                    responseWriter.writeString(CriclyticsButtonFlags.$responseFields[4], CriclyticsButtonFlags.this.tourID);
                    responseWriter.writeString(CriclyticsButtonFlags.$responseFields[5], CriclyticsButtonFlags.this.seriesName);
                    responseWriter.writeString(CriclyticsButtonFlags.$responseFields[6], CriclyticsButtonFlags.this.frcStartTime);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "CriclyticsButtonFlags{__typename=" + this.__typename + ", featuredSeriesName=" + this.featuredSeriesName + ", isPlayerIndex=" + this.isPlayerIndex + ", isFinalFour=" + this.isFinalFour + ", tourID=" + this.tourID + ", seriesName=" + this.seriesName + ", frcStartTime=" + this.frcStartTime + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            Boolean bool;
            Boolean bool2;
            String str2;
            String str3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CriclyticsButtonFlags)) {
                return false;
            }
            CriclyticsButtonFlags criclyticsButtonFlags = (CriclyticsButtonFlags) obj;
            if (this.__typename.equals(criclyticsButtonFlags.__typename) && ((str = this.featuredSeriesName) != null ? str.equals(criclyticsButtonFlags.featuredSeriesName) : criclyticsButtonFlags.featuredSeriesName == null) && ((bool = this.isPlayerIndex) != null ? bool.equals(criclyticsButtonFlags.isPlayerIndex) : criclyticsButtonFlags.isPlayerIndex == null) && ((bool2 = this.isFinalFour) != null ? bool2.equals(criclyticsButtonFlags.isFinalFour) : criclyticsButtonFlags.isFinalFour == null) && ((str2 = this.tourID) != null ? str2.equals(criclyticsButtonFlags.tourID) : criclyticsButtonFlags.tourID == null) && ((str3 = this.seriesName) != null ? str3.equals(criclyticsButtonFlags.seriesName) : criclyticsButtonFlags.seriesName == null)) {
                String str4 = this.frcStartTime;
                String str5 = criclyticsButtonFlags.frcStartTime;
                if (str4 == null) {
                    if (str5 == null) {
                        return true;
                    }
                } else if (str4.equals(str5)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.featuredSeriesName;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Boolean bool = this.isPlayerIndex;
                int hashCode3 = (hashCode2 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.isFinalFour;
                int hashCode4 = (hashCode3 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str2 = this.tourID;
                int hashCode5 = (hashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.seriesName;
                int hashCode6 = (hashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.frcStartTime;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<CriclyticsButtonFlags> {
            @Override
            public CriclyticsButtonFlags map(ResponseReader responseReader) {
                return new CriclyticsButtonFlags(responseReader.readString(CriclyticsButtonFlags.$responseFields[0]), responseReader.readString(CriclyticsButtonFlags.$responseFields[1]), responseReader.readBoolean(CriclyticsButtonFlags.$responseFields[2]), responseReader.readBoolean(CriclyticsButtonFlags.$responseFields[3]), responseReader.readString(CriclyticsButtonFlags.$responseFields[4]), responseReader.readString(CriclyticsButtonFlags.$responseFields[5]), responseReader.readString(CriclyticsButtonFlags.$responseFields[6]));
            }
        }
    }

    public static class PlayerOfTheMatchdDetails {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forBoolean("batsmanTab", "batsmanTab", null, true, Collections.emptyList()), ResponseField.forBoolean("bowlerTab", "bowlerTab", null, true, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerTeamID", "playerTeamID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forList("batsman", "batsman", null, true, Collections.emptyList()), ResponseField.forList("bowler", "bowler", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Batsman> batsman;
        final Boolean batsmanTab;
        final List<Bowler> bowler;
        final Boolean bowlerTab;
        final String playerID;
        final String playerName;
        final String playerTeamID;

        public PlayerOfTheMatchdDetails(String str, Boolean bool, Boolean bool2, String str2, String str3, String str4, List<Batsman> list, List<Bowler> list2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.batsmanTab = bool;
            this.bowlerTab = bool2;
            this.playerID = str2;
            this.playerTeamID = str3;
            this.playerName = str4;
            this.batsman = list;
            this.bowler = list2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Boolean batsmanTab() {
            return this.batsmanTab;
        }

        public Boolean bowlerTab() {
            return this.bowlerTab;
        }

        public String playerID() {
            return this.playerID;
        }

        public String playerTeamID() {
            return this.playerTeamID;
        }

        public String playerName() {
            return this.playerName;
        }

        public List<Batsman> batsman() {
            return this.batsman;
        }

        public List<Bowler> bowler() {
            return this.bowler;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(PlayerOfTheMatchdDetails.$responseFields[0], PlayerOfTheMatchdDetails.this.__typename);
                    responseWriter.writeBoolean(PlayerOfTheMatchdDetails.$responseFields[1], PlayerOfTheMatchdDetails.this.batsmanTab);
                    responseWriter.writeBoolean(PlayerOfTheMatchdDetails.$responseFields[2], PlayerOfTheMatchdDetails.this.bowlerTab);
                    responseWriter.writeString(PlayerOfTheMatchdDetails.$responseFields[3], PlayerOfTheMatchdDetails.this.playerID);
                    responseWriter.writeString(PlayerOfTheMatchdDetails.$responseFields[4], PlayerOfTheMatchdDetails.this.playerTeamID);
                    responseWriter.writeString(PlayerOfTheMatchdDetails.$responseFields[5], PlayerOfTheMatchdDetails.this.playerName);
                    responseWriter.writeList(PlayerOfTheMatchdDetails.$responseFields[6], PlayerOfTheMatchdDetails.this.batsman, new ResponseWriter.ListWriter() {

                        @Override
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Batsman) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(PlayerOfTheMatchdDetails.$responseFields[7], PlayerOfTheMatchdDetails.this.bowler, new ResponseWriter.ListWriter() {


                        @Override
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Bowler) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "PlayerOfTheMatchdDetails{__typename=" + this.__typename + ", batsmanTab=" + this.batsmanTab + ", bowlerTab=" + this.bowlerTab + ", playerID=" + this.playerID + ", playerTeamID=" + this.playerTeamID + ", playerName=" + this.playerName + ", batsman=" + this.batsman + ", bowler=" + this.bowler + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Boolean bool;
            Boolean bool2;
            String str;
            String str2;
            String str3;
            List<Batsman> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerOfTheMatchdDetails)) {
                return false;
            }
            PlayerOfTheMatchdDetails playerOfTheMatchdDetails = (PlayerOfTheMatchdDetails) obj;
            if (this.__typename.equals(playerOfTheMatchdDetails.__typename) && ((bool = this.batsmanTab) != null ? bool.equals(playerOfTheMatchdDetails.batsmanTab) : playerOfTheMatchdDetails.batsmanTab == null) && ((bool2 = this.bowlerTab) != null ? bool2.equals(playerOfTheMatchdDetails.bowlerTab) : playerOfTheMatchdDetails.bowlerTab == null) && ((str = this.playerID) != null ? str.equals(playerOfTheMatchdDetails.playerID) : playerOfTheMatchdDetails.playerID == null) && ((str2 = this.playerTeamID) != null ? str2.equals(playerOfTheMatchdDetails.playerTeamID) : playerOfTheMatchdDetails.playerTeamID == null) && ((str3 = this.playerName) != null ? str3.equals(playerOfTheMatchdDetails.playerName) : playerOfTheMatchdDetails.playerName == null) && ((list = this.batsman) != null ? list.equals(playerOfTheMatchdDetails.batsman) : playerOfTheMatchdDetails.batsman == null)) {
                List<Bowler> list2 = this.bowler;
                List<Bowler> list3 = playerOfTheMatchdDetails.bowler;
                if (list2 == null) {
                    if (list3 == null) {
                        return true;
                    }
                } else if (list2.equals(list3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Boolean bool = this.batsmanTab;
                int i = 0;
                int hashCode2 = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.bowlerTab;
                int hashCode3 = (hashCode2 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str = this.playerID;
                int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerTeamID;
                int hashCode5 = (hashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerName;
                int hashCode6 = (hashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                List<Batsman> list = this.batsman;
                int hashCode7 = (hashCode6 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Bowler> list2 = this.bowler;
                if (list2 != null) {
                    i = list2.hashCode();
                }
                this.$hashCode = hashCode7 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<PlayerOfTheMatchdDetails> {
            final Batsman.Mapper batsmanFieldMapper = new Batsman.Mapper();
            final Bowler.Mapper bowlerFieldMapper = new Bowler.Mapper();

            @Override
            public PlayerOfTheMatchdDetails map(ResponseReader responseReader) {
                return new PlayerOfTheMatchdDetails(responseReader.readString(PlayerOfTheMatchdDetails.$responseFields[0]), responseReader.readBoolean(PlayerOfTheMatchdDetails.$responseFields[1]), responseReader.readBoolean(PlayerOfTheMatchdDetails.$responseFields[2]), responseReader.readString(PlayerOfTheMatchdDetails.$responseFields[3]), responseReader.readString(PlayerOfTheMatchdDetails.$responseFields[4]), responseReader.readString(PlayerOfTheMatchdDetails.$responseFields[5]), responseReader.readList(PlayerOfTheMatchdDetails.$responseFields[6], new ResponseReader.ListReader<Batsman>() {


                    @Override
                    public Batsman read(ResponseReader.ListItemReader listItemReader) {
                        return (Batsman) listItemReader.readObject(new ResponseReader.ObjectReader<Batsman>() {


                            @Override
                            public Batsman read(ResponseReader responseReader) {
                                return Mapper.this.batsmanFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(PlayerOfTheMatchdDetails.$responseFields[7], new ResponseReader.ListReader<Bowler>() {

                    @Override
                    public Bowler read(ResponseReader.ListItemReader listItemReader) {
                        return (Bowler) listItemReader.readObject(new ResponseReader.ObjectReader<Bowler>() {

                            @Override
                            public Bowler read(ResponseReader responseReader) {
                                return Mapper.this.bowlerFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class Batsman {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("batsmanBalls", "batsmanBalls", null, true, Collections.emptyList()), ResponseField.forString("batsmanRuns", "batsmanRuns", null, true, Collections.emptyList()), ResponseField.forBoolean("isNotOut", "isNotOut", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String batsmanBalls;
        final String batsmanRuns;
        final Boolean isNotOut;

        public Batsman(String str, String str2, String str3, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.batsmanBalls = str2;
            this.batsmanRuns = str3;
            this.isNotOut = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public String batsmanBalls() {
            return this.batsmanBalls;
        }

        public String batsmanRuns() {
            return this.batsmanRuns;
        }

        public Boolean isNotOut() {
            return this.isNotOut;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Batsman.$responseFields[0], Batsman.this.__typename);
                    responseWriter.writeString(Batsman.$responseFields[1], Batsman.this.batsmanBalls);
                    responseWriter.writeString(Batsman.$responseFields[2], Batsman.this.batsmanRuns);
                    responseWriter.writeBoolean(Batsman.$responseFields[3], Batsman.this.isNotOut);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Batsman{__typename=" + this.__typename + ", batsmanBalls=" + this.batsmanBalls + ", batsmanRuns=" + this.batsmanRuns + ", isNotOut=" + this.isNotOut + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Batsman)) {
                return false;
            }
            Batsman batsman = (Batsman) obj;
            if (this.__typename.equals(batsman.__typename) && ((str = this.batsmanBalls) != null ? str.equals(batsman.batsmanBalls) : batsman.batsmanBalls == null) && ((str2 = this.batsmanRuns) != null ? str2.equals(batsman.batsmanRuns) : batsman.batsmanRuns == null)) {
                Boolean bool = this.isNotOut;
                Boolean bool2 = batsman.isNotOut;
                if (bool == null) {
                    if (bool2 == null) {
                        return true;
                    }
                } else if (bool.equals(bool2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.batsmanBalls;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.batsmanRuns;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Boolean bool = this.isNotOut;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Batsman> {
            @Override
            public Batsman map(ResponseReader responseReader) {
                return new Batsman(responseReader.readString(Batsman.$responseFields[0]), responseReader.readString(Batsman.$responseFields[1]), responseReader.readString(Batsman.$responseFields[2]), responseReader.readBoolean(Batsman.$responseFields[3]));
            }
        }
    }

    public static class Bowler {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("batsmanBalls", "batsmanBalls", null, true, Collections.emptyList()), ResponseField.forString("batsmanRuns", "batsmanRuns", null, true, Collections.emptyList()), ResponseField.forString("bowlerWickets", "bowlerWickets", null, true, Collections.emptyList()), ResponseField.forString("bowlerConceeded", "bowlerConceeded", null, true, Collections.emptyList()), ResponseField.forString("bowlerOvers", "bowlerOvers", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String batsmanBalls;
        final String batsmanRuns;
        final String bowlerConceeded;
        final String bowlerOvers;
        final String bowlerWickets;

        public Bowler(String str, String str2, String str3, String str4, String str5, String str6) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.batsmanBalls = str2;
            this.batsmanRuns = str3;
            this.bowlerWickets = str4;
            this.bowlerConceeded = str5;
            this.bowlerOvers = str6;
        }

        public String __typename() {
            return this.__typename;
        }

        public String batsmanBalls() {
            return this.batsmanBalls;
        }

        public String batsmanRuns() {
            return this.batsmanRuns;
        }

        public String bowlerWickets() {
            return this.bowlerWickets;
        }

        public String bowlerConceeded() {
            return this.bowlerConceeded;
        }

        public String bowlerOvers() {
            return this.bowlerOvers;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Bowler.$responseFields[0], Bowler.this.__typename);
                    responseWriter.writeString(Bowler.$responseFields[1], Bowler.this.batsmanBalls);
                    responseWriter.writeString(Bowler.$responseFields[2], Bowler.this.batsmanRuns);
                    responseWriter.writeString(Bowler.$responseFields[3], Bowler.this.bowlerWickets);
                    responseWriter.writeString(Bowler.$responseFields[4], Bowler.this.bowlerConceeded);
                    responseWriter.writeString(Bowler.$responseFields[5], Bowler.this.bowlerOvers);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Bowler{__typename=" + this.__typename + ", batsmanBalls=" + this.batsmanBalls + ", batsmanRuns=" + this.batsmanRuns + ", bowlerWickets=" + this.bowlerWickets + ", bowlerConceeded=" + this.bowlerConceeded + ", bowlerOvers=" + this.bowlerOvers + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Bowler)) {
                return false;
            }
            Bowler bowler = (Bowler) obj;
            if (this.__typename.equals(bowler.__typename) && ((str = this.batsmanBalls) != null ? str.equals(bowler.batsmanBalls) : bowler.batsmanBalls == null) && ((str2 = this.batsmanRuns) != null ? str2.equals(bowler.batsmanRuns) : bowler.batsmanRuns == null) && ((str3 = this.bowlerWickets) != null ? str3.equals(bowler.bowlerWickets) : bowler.bowlerWickets == null) && ((str4 = this.bowlerConceeded) != null ? str4.equals(bowler.bowlerConceeded) : bowler.bowlerConceeded == null)) {
                String str5 = this.bowlerOvers;
                String str6 = bowler.bowlerOvers;
                if (str5 == null) {
                    if (str6 == null) {
                        return true;
                    }
                } else if (str5.equals(str6)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.batsmanBalls;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.batsmanRuns;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.bowlerWickets;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.bowlerConceeded;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.bowlerOvers;
                if (str5 != null) {
                    i = str5.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Bowler> {
            @Override
            public Bowler map(ResponseReader responseReader) {
                return new Bowler(responseReader.readString(Bowler.$responseFields[0]), responseReader.readString(Bowler.$responseFields[1]), responseReader.readString(Bowler.$responseFields[2]), responseReader.readString(Bowler.$responseFields[3]), responseReader.readString(Bowler.$responseFields[4]), responseReader.readString(Bowler.$responseFields[5]));
            }
        }
    }
}
