package com.cricketscoreprediction.app;

import androidx.core.app.NotificationCompat;
import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ScalarTypeAdapters;
import com.apollographql.apollo.api.internal.Utils;
import com.apollographql.apollo.api.internal.InputFieldMarshaller;
import com.apollographql.apollo.api.internal.InputFieldWriter;
import com.apollographql.apollo.api.internal.OperationRequestBodyComposer;
import com.apollographql.apollo.api.internal.QueryDocumentMinifier;
import com.apollographql.apollo.api.internal.ResponseFieldMapper;
import com.apollographql.apollo.api.internal.ResponseFieldMarshaller;
import com.apollographql.apollo.api.internal.ResponseReader;
import com.apollographql.apollo.api.internal.ResponseWriter;
import com.apollographql.apollo.api.internal.SimpleOperationResponseParser;
import com.apollographql.apollo.api.internal.UnmodifiableMapBuilder;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

public final class ScheduleQuery implements Query<ScheduleQuery.Data, ScheduleQuery.Data, ScheduleQuery.Variables> {
    public static final String OPERATION_ID = "7b8c7543ca9147ca46692e0720f9f42719f110316b506d9a12f400154cb001a4";
    public static final OperationName OPERATION_NAME = new OperationName() {

       @Override
        public String name() {
            return "schedule";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query schedule($type: String, $status: String, $page: Int) {\n  schedule(type: $type, status: $status, page: $page) {\n    __typename\n    seriesID\n    displayFeatureMatchScoreCard\n    currentinningsNo\n    currentInningteamID\n    currentInningsTeamName\n    seriesName\n    homeTeamName\n    awayTeamName\n    toss\n    league\n    startEndDate\n    matchStatus\n    matchID\n    matchType\n    statusMessage\n    matchNumber\n    venue\n    matchResult\n    startDate\n    playerOfTheMatch\n    playerID\n    firstInningsTeamID\n    secondInningsTeamID\n    thirdInningsTeamID\n    fourthInningsTeamID\n    matchScore {\n      __typename\n      teamShortName\n      teamID\n      teamFullName\n      teamScore {\n        __typename\n        inning\n        inningNumber\n        battingTeam\n        runsScored\n        wickets\n        overs\n        runRate\n        battingSide\n        teamID\n        battingTeamShortName\n        declared\n        folowOn\n      }\n    }\n    teamsWinProbability {\n      __typename\n      homeTeamShortName\n      homeTeamPercentage\n      awayTeamShortName\n      awayTeamPercentage\n      tiePercentage\n    }\n    isCricklyticsAvailable\n    isLiveCriclyticsAvailable\n    currentDay\n    currentSession\n    playing11Status\n    isAbandoned\n    rRunRate\n    probable11Status\n    IPLpolling {\n      __typename\n      name\n      isPolling\n      display\n      isCompleted\n      isAuctionStarted\n    }\n    isFantasyAvailable\n    hasStatistics\n    hasPoints\n    isHomeMatchUpade\n    content\n    criclyticsButtonFlags {\n      __typename\n      featuredSeriesName\n      isPlayerIndex\n      isFinalFour\n      tourID\n      seriesName\n    }\n    matchName\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public ScheduleQuery(Input<String> input, Input<String> input2, Input<Integer> input3) {
        Utils.checkNotNull(input, "type == null");
        Utils.checkNotNull(input2, "status == null");
        Utils.checkNotNull(input3, "page == null");
        this.variables = new Variables(input, input2, input3);
    }

    @Override 
    public String queryDocument() {
        return QUERY_DOCUMENT;
    }

    @Override 
    public Variables variables() {
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
        private Input<Integer> page = Input.absent();
        private Input<String> status = Input.absent();
        private Input<String> type = Input.absent();

        Builder() {
        }

        public Builder type(String str) {
            this.type = Input.fromNullable(str);
            return this;
        }

        public Builder status(String str) {
            this.status = Input.fromNullable(str);
            return this;
        }

        public Builder page(Integer num) {
            this.page = Input.fromNullable(num);
            return this;
        }

        public Builder typeInput(Input<String> input) {
            this.type = (Input) Utils.checkNotNull(input, "type == null");
            return this;
        }

        public Builder statusInput(Input<String> input) {
            this.status = (Input) Utils.checkNotNull(input, "status == null");
            return this;
        }

        public Builder pageInput(Input<Integer> input) {
            this.page = (Input) Utils.checkNotNull(input, "page == null");
            return this;
        }

        public ScheduleQuery build() {
            return new ScheduleQuery(this.type, this.status, this.page);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final Input<Integer> page;
        private final Input<String> status;
        private final Input<String> type;
        private final transient Map<String, Object> valueMap;

        Variables(Input<String> input, Input<String> input2, Input<Integer> input3) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.type = input;
            this.status = input2;
            this.page = input3;
            if (input.defined) {
                linkedHashMap.put("type", input.value);
            }
            if (input2.defined) {
                linkedHashMap.put(NotificationCompat.CATEGORY_STATUS, input2.value);
            }
            if (input3.defined) {
                linkedHashMap.put("page", input3.value);
            }
        }

        public Input<String> type() {
            return this.type;
        }

        public Input<String> status() {
            return this.status;
        }

        public Input<Integer> page() {
            return this.page;
        }

        @Override
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }

        @Override
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() {

                @Override 
                public void marshal(InputFieldWriter inputFieldWriter) throws IOException {
                    if (Variables.this.type.defined) {
                        inputFieldWriter.writeString("type", Variables.this.type.value);
                    }
                    if (Variables.this.status.defined) {
                        inputFieldWriter.writeString(NotificationCompat.CATEGORY_STATUS, Variables.this.status.value);
                    }
                    if (Variables.this.page.defined) {
                        inputFieldWriter.writeInt("page", Variables.this.page.value);
                    }
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forList("schedule", "schedule", new UnmodifiableMapBuilder(3).put("type", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "type").build()).put(NotificationCompat.CATEGORY_STATUS, new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, NotificationCompat.CATEGORY_STATUS).build()).put("page", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "page").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final List<Schedule> schedule;

        public Data(List<Schedule> list) {
            this.schedule = list;
        }

        public List<Schedule> schedule() {
            return this.schedule;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeList(Data.$responseFields[0], Data.this.schedule, new ResponseWriter.ListWriter() {

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Schedule) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{schedule=" + this.schedule + "}";
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
            List<Schedule> list = this.schedule;
            List<Schedule> list2 = ((Data) obj).schedule;
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
                List<Schedule> list = this.schedule;
                this.$hashCode = 1000003 ^ (list == null ? 0 : list.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final Schedule.Mapper scheduleFieldMapper = new Schedule.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data(responseReader.readList(Data.$responseFields[0], new ResponseReader.ListReader<Schedule>() {

                    @Override 
                    public Schedule read(ResponseReader.ListItemReader listItemReader) {
                        return (Schedule) listItemReader.readObject(new ResponseReader.ObjectReader<Schedule>() {

                            @Override 
                            public Schedule read(ResponseReader responseReader) {
                                return Mapper.this.scheduleFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class Schedule {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("seriesID", "seriesID", null, true, Collections.emptyList()), ResponseField.forBoolean("displayFeatureMatchScoreCard", "displayFeatureMatchScoreCard", null, true, Collections.emptyList()), ResponseField.forString("currentinningsNo", "currentinningsNo", null, true, Collections.emptyList()), ResponseField.forString("currentInningteamID", "currentInningteamID", null, true, Collections.emptyList()), ResponseField.forString("currentInningsTeamName", "currentInningsTeamName", null, true, Collections.emptyList()), ResponseField.forString("seriesName", "seriesName", null, true, Collections.emptyList()), ResponseField.forString("homeTeamName", "homeTeamName", null, true, Collections.emptyList()), ResponseField.forString("awayTeamName", "awayTeamName", null, true, Collections.emptyList()), ResponseField.forString("toss", "toss", null, true, Collections.emptyList()), ResponseField.forString("league", "league", null, true, Collections.emptyList()), ResponseField.forString("startEndDate", "startEndDate", null, true, Collections.emptyList()), ResponseField.forString("matchStatus", "matchStatus", null, true, Collections.emptyList()), ResponseField.forString("matchID", "matchID", null, true, Collections.emptyList()), ResponseField.forString("matchType", "matchType", null, true, Collections.emptyList()), ResponseField.forString("statusMessage", "statusMessage", null, true, Collections.emptyList()), ResponseField.forString("matchNumber", "matchNumber", null, true, Collections.emptyList()), ResponseField.forString("venue", "venue", null, true, Collections.emptyList()), ResponseField.forString("matchResult", "matchResult", null, true, Collections.emptyList()), ResponseField.forString("startDate", "startDate", null, true, Collections.emptyList()), ResponseField.forString("playerOfTheMatch", "playerOfTheMatch", null, true, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("firstInningsTeamID", "firstInningsTeamID", null, true, Collections.emptyList()), ResponseField.forString("secondInningsTeamID", "secondInningsTeamID", null, true, Collections.emptyList()), ResponseField.forString("thirdInningsTeamID", "thirdInningsTeamID", null, true, Collections.emptyList()), ResponseField.forString("fourthInningsTeamID", "fourthInningsTeamID", null, true, Collections.emptyList()), ResponseField.forList("matchScore", "matchScore", null, true, Collections.emptyList()), ResponseField.forObject("teamsWinProbability", "teamsWinProbability", null, true, Collections.emptyList()), ResponseField.forBoolean("isCricklyticsAvailable", "isCricklyticsAvailable", null, true, Collections.emptyList()), ResponseField.forBoolean("isLiveCriclyticsAvailable", "isLiveCriclyticsAvailable", null, true, Collections.emptyList()), ResponseField.forInt("currentDay", "currentDay", null, true, Collections.emptyList()), ResponseField.forInt("currentSession", "currentSession", null, true, Collections.emptyList()), ResponseField.forBoolean("playing11Status", "playing11Status", null, true, Collections.emptyList()), ResponseField.forBoolean("isAbandoned", "isAbandoned", null, true, Collections.emptyList()), ResponseField.forString("rRunRate", "rRunRate", null, true, Collections.emptyList()), ResponseField.forBoolean("probable11Status", "probable11Status", null, true, Collections.emptyList()), ResponseField.forObject("IPLpolling", "IPLpolling", null, true, Collections.emptyList()), ResponseField.forBoolean("isFantasyAvailable", "isFantasyAvailable", null, true, Collections.emptyList()), ResponseField.forBoolean("hasStatistics", "hasStatistics", null, true, Collections.emptyList()), ResponseField.forBoolean("hasPoints", "hasPoints", null, true, Collections.emptyList()), ResponseField.forBoolean("isHomeMatchUpade", "isHomeMatchUpade", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.CONTENT, FirebaseAnalytics.Param.CONTENT, null, true, Collections.emptyList()), ResponseField.forObject("criclyticsButtonFlags", "criclyticsButtonFlags", null, true, Collections.emptyList()), ResponseField.forString("matchName", "matchName", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final IPLpolling IPLpolling;
        final String __typename;
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
        final String homeTeamName;
        final Boolean isAbandoned;
        final Boolean isCricklyticsAvailable;
        final Boolean isFantasyAvailable;
        final Boolean isHomeMatchUpade;
        final Boolean isLiveCriclyticsAvailable;
        final String league;
        final String matchID;
        final String matchName;
        final String matchNumber;
        final String matchResult;
        final List<MatchScore> matchScore;
        final String matchStatus;
        final String matchType;
        final String playerID;
        final String playerOfTheMatch;
        final Boolean playing11Status;
        final Boolean probable11Status;
        final String rRunRate;
        final String secondInningsTeamID;
        final String seriesID;
        final String seriesName;
        final String startDate;
        final String startEndDate;
        final String statusMessage;
        final TeamsWinProbability teamsWinProbability;
        final String thirdInningsTeamID;
        final String toss;
        final String venue;

        public Schedule(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, List<MatchScore> list, TeamsWinProbability teamsWinProbability2, Boolean bool2, Boolean bool3, Integer num, Integer num2, Boolean bool4, Boolean bool5, String str26, Boolean bool6, IPLpolling iPLpolling, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, String str27, CriclyticsButtonFlags criclyticsButtonFlags2, String str28) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.seriesID = str2;
            this.displayFeatureMatchScoreCard = bool;
            this.currentinningsNo = str3;
            this.currentInningteamID = str4;
            this.currentInningsTeamName = str5;
            this.seriesName = str6;
            this.homeTeamName = str7;
            this.awayTeamName = str8;
            this.toss = str9;
            this.league = str10;
            this.startEndDate = str11;
            this.matchStatus = str12;
            this.matchID = str13;
            this.matchType = str14;
            this.statusMessage = str15;
            this.matchNumber = str16;
            this.venue = str17;
            this.matchResult = str18;
            this.startDate = str19;
            this.playerOfTheMatch = str20;
            this.playerID = str21;
            this.firstInningsTeamID = str22;
            this.secondInningsTeamID = str23;
            this.thirdInningsTeamID = str24;
            this.fourthInningsTeamID = str25;
            this.matchScore = list;
            this.teamsWinProbability = teamsWinProbability2;
            this.isCricklyticsAvailable = bool2;
            this.isLiveCriclyticsAvailable = bool3;
            this.currentDay = num;
            this.currentSession = num2;
            this.playing11Status = bool4;
            this.isAbandoned = bool5;
            this.rRunRate = str26;
            this.probable11Status = bool6;
            this.IPLpolling = iPLpolling;
            this.isFantasyAvailable = bool7;
            this.hasStatistics = bool8;
            this.hasPoints = bool9;
            this.isHomeMatchUpade = bool10;
            this.content = str27;
            this.criclyticsButtonFlags = criclyticsButtonFlags2;
            this.matchName = str28;
        }

        public String __typename() {
            return this.__typename;
        }

        public String seriesID() {
            return this.seriesID;
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

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Schedule.$responseFields[0], Schedule.this.__typename);
                    responseWriter.writeString(Schedule.$responseFields[1], Schedule.this.seriesID);
                    responseWriter.writeBoolean(Schedule.$responseFields[2], Schedule.this.displayFeatureMatchScoreCard);
                    responseWriter.writeString(Schedule.$responseFields[3], Schedule.this.currentinningsNo);
                    responseWriter.writeString(Schedule.$responseFields[4], Schedule.this.currentInningteamID);
                    responseWriter.writeString(Schedule.$responseFields[5], Schedule.this.currentInningsTeamName);
                    responseWriter.writeString(Schedule.$responseFields[6], Schedule.this.seriesName);
                    responseWriter.writeString(Schedule.$responseFields[7], Schedule.this.homeTeamName);
                    responseWriter.writeString(Schedule.$responseFields[8], Schedule.this.awayTeamName);
                    responseWriter.writeString(Schedule.$responseFields[9], Schedule.this.toss);
                    responseWriter.writeString(Schedule.$responseFields[10], Schedule.this.league);
                    responseWriter.writeString(Schedule.$responseFields[11], Schedule.this.startEndDate);
                    responseWriter.writeString(Schedule.$responseFields[12], Schedule.this.matchStatus);
                    responseWriter.writeString(Schedule.$responseFields[13], Schedule.this.matchID);
                    responseWriter.writeString(Schedule.$responseFields[14], Schedule.this.matchType);
                    responseWriter.writeString(Schedule.$responseFields[15], Schedule.this.statusMessage);
                    responseWriter.writeString(Schedule.$responseFields[16], Schedule.this.matchNumber);
                    responseWriter.writeString(Schedule.$responseFields[17], Schedule.this.venue);
                    responseWriter.writeString(Schedule.$responseFields[18], Schedule.this.matchResult);
                    responseWriter.writeString(Schedule.$responseFields[19], Schedule.this.startDate);
                    responseWriter.writeString(Schedule.$responseFields[20], Schedule.this.playerOfTheMatch);
                    responseWriter.writeString(Schedule.$responseFields[21], Schedule.this.playerID);
                    responseWriter.writeString(Schedule.$responseFields[22], Schedule.this.firstInningsTeamID);
                    responseWriter.writeString(Schedule.$responseFields[23], Schedule.this.secondInningsTeamID);
                    responseWriter.writeString(Schedule.$responseFields[24], Schedule.this.thirdInningsTeamID);
                    responseWriter.writeString(Schedule.$responseFields[25], Schedule.this.fourthInningsTeamID);
                    responseWriter.writeList(Schedule.$responseFields[26], Schedule.this.matchScore, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((MatchScore) it.next()).marshaller());
                            }
                        }
                    });
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(Schedule.$responseFields[27], Schedule.this.teamsWinProbability != null ? Schedule.this.teamsWinProbability.marshaller() : null);
                    responseWriter.writeBoolean(Schedule.$responseFields[28], Schedule.this.isCricklyticsAvailable);
                    responseWriter.writeBoolean(Schedule.$responseFields[29], Schedule.this.isLiveCriclyticsAvailable);
                    responseWriter.writeInt(Schedule.$responseFields[30], Schedule.this.currentDay);
                    responseWriter.writeInt(Schedule.$responseFields[31], Schedule.this.currentSession);
                    responseWriter.writeBoolean(Schedule.$responseFields[32], Schedule.this.playing11Status);
                    responseWriter.writeBoolean(Schedule.$responseFields[33], Schedule.this.isAbandoned);
                    responseWriter.writeString(Schedule.$responseFields[34], Schedule.this.rRunRate);
                    responseWriter.writeBoolean(Schedule.$responseFields[35], Schedule.this.probable11Status);
                    responseWriter.writeObject(Schedule.$responseFields[36], Schedule.this.IPLpolling != null ? Schedule.this.IPLpolling.marshaller() : null);
                    responseWriter.writeBoolean(Schedule.$responseFields[37], Schedule.this.isFantasyAvailable);
                    responseWriter.writeBoolean(Schedule.$responseFields[38], Schedule.this.hasStatistics);
                    responseWriter.writeBoolean(Schedule.$responseFields[39], Schedule.this.hasPoints);
                    responseWriter.writeBoolean(Schedule.$responseFields[40], Schedule.this.isHomeMatchUpade);
                    responseWriter.writeString(Schedule.$responseFields[41], Schedule.this.content);
                    ResponseField responseField = Schedule.$responseFields[42];
                    if (Schedule.this.criclyticsButtonFlags != null) {
                        responseFieldMarshaller = Schedule.this.criclyticsButtonFlags.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                    responseWriter.writeString(Schedule.$responseFields[43], Schedule.this.matchName);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Schedule{__typename=" + this.__typename + ", seriesID=" + this.seriesID + ", displayFeatureMatchScoreCard=" + this.displayFeatureMatchScoreCard + ", currentinningsNo=" + this.currentinningsNo + ", currentInningteamID=" + this.currentInningteamID + ", currentInningsTeamName=" + this.currentInningsTeamName + ", seriesName=" + this.seriesName + ", homeTeamName=" + this.homeTeamName + ", awayTeamName=" + this.awayTeamName + ", toss=" + this.toss + ", league=" + this.league + ", startEndDate=" + this.startEndDate + ", matchStatus=" + this.matchStatus + ", matchID=" + this.matchID + ", matchType=" + this.matchType + ", statusMessage=" + this.statusMessage + ", matchNumber=" + this.matchNumber + ", venue=" + this.venue + ", matchResult=" + this.matchResult + ", startDate=" + this.startDate + ", playerOfTheMatch=" + this.playerOfTheMatch + ", playerID=" + this.playerID + ", firstInningsTeamID=" + this.firstInningsTeamID + ", secondInningsTeamID=" + this.secondInningsTeamID + ", thirdInningsTeamID=" + this.thirdInningsTeamID + ", fourthInningsTeamID=" + this.fourthInningsTeamID + ", matchScore=" + this.matchScore + ", teamsWinProbability=" + this.teamsWinProbability + ", isCricklyticsAvailable=" + this.isCricklyticsAvailable + ", isLiveCriclyticsAvailable=" + this.isLiveCriclyticsAvailable + ", currentDay=" + this.currentDay + ", currentSession=" + this.currentSession + ", playing11Status=" + this.playing11Status + ", isAbandoned=" + this.isAbandoned + ", rRunRate=" + this.rRunRate + ", probable11Status=" + this.probable11Status + ", IPLpolling=" + this.IPLpolling + ", isFantasyAvailable=" + this.isFantasyAvailable + ", hasStatistics=" + this.hasStatistics + ", hasPoints=" + this.hasPoints + ", isHomeMatchUpade=" + this.isHomeMatchUpade + ", content=" + this.content + ", criclyticsButtonFlags=" + this.criclyticsButtonFlags + ", matchName=" + this.matchName + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            Boolean bool;
            String str2;
            String str3;
            String str4;
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
            List<MatchScore> list;
            TeamsWinProbability teamsWinProbability2;
            Boolean bool2;
            Boolean bool3;
            Integer num;
            Integer num2;
            Boolean bool4;
            Boolean bool5;
            String str25;
            Boolean bool6;
            IPLpolling iPLpolling;
            Boolean bool7;
            Boolean bool8;
            Boolean bool9;
            Boolean bool10;
            String str26;
            CriclyticsButtonFlags criclyticsButtonFlags2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Schedule)) {
                return false;
            }
            Schedule schedule = (Schedule) obj;
            if (this.__typename.equals(schedule.__typename) && ((str = this.seriesID) != null ? str.equals(schedule.seriesID) : schedule.seriesID == null) && ((bool = this.displayFeatureMatchScoreCard) != null ? bool.equals(schedule.displayFeatureMatchScoreCard) : schedule.displayFeatureMatchScoreCard == null) && ((str2 = this.currentinningsNo) != null ? str2.equals(schedule.currentinningsNo) : schedule.currentinningsNo == null) && ((str3 = this.currentInningteamID) != null ? str3.equals(schedule.currentInningteamID) : schedule.currentInningteamID == null) && ((str4 = this.currentInningsTeamName) != null ? str4.equals(schedule.currentInningsTeamName) : schedule.currentInningsTeamName == null) && ((str5 = this.seriesName) != null ? str5.equals(schedule.seriesName) : schedule.seriesName == null) && ((str6 = this.homeTeamName) != null ? str6.equals(schedule.homeTeamName) : schedule.homeTeamName == null) && ((str7 = this.awayTeamName) != null ? str7.equals(schedule.awayTeamName) : schedule.awayTeamName == null) && ((str8 = this.toss) != null ? str8.equals(schedule.toss) : schedule.toss == null) && ((str9 = this.league) != null ? str9.equals(schedule.league) : schedule.league == null) && ((str10 = this.startEndDate) != null ? str10.equals(schedule.startEndDate) : schedule.startEndDate == null) && ((str11 = this.matchStatus) != null ? str11.equals(schedule.matchStatus) : schedule.matchStatus == null) && ((str12 = this.matchID) != null ? str12.equals(schedule.matchID) : schedule.matchID == null) && ((str13 = this.matchType) != null ? str13.equals(schedule.matchType) : schedule.matchType == null) && ((str14 = this.statusMessage) != null ? str14.equals(schedule.statusMessage) : schedule.statusMessage == null) && ((str15 = this.matchNumber) != null ? str15.equals(schedule.matchNumber) : schedule.matchNumber == null) && ((str16 = this.venue) != null ? str16.equals(schedule.venue) : schedule.venue == null) && ((str17 = this.matchResult) != null ? str17.equals(schedule.matchResult) : schedule.matchResult == null) && ((str18 = this.startDate) != null ? str18.equals(schedule.startDate) : schedule.startDate == null) && ((str19 = this.playerOfTheMatch) != null ? str19.equals(schedule.playerOfTheMatch) : schedule.playerOfTheMatch == null) && ((str20 = this.playerID) != null ? str20.equals(schedule.playerID) : schedule.playerID == null) && ((str21 = this.firstInningsTeamID) != null ? str21.equals(schedule.firstInningsTeamID) : schedule.firstInningsTeamID == null) && ((str22 = this.secondInningsTeamID) != null ? str22.equals(schedule.secondInningsTeamID) : schedule.secondInningsTeamID == null) && ((str23 = this.thirdInningsTeamID) != null ? str23.equals(schedule.thirdInningsTeamID) : schedule.thirdInningsTeamID == null) && ((str24 = this.fourthInningsTeamID) != null ? str24.equals(schedule.fourthInningsTeamID) : schedule.fourthInningsTeamID == null) && ((list = this.matchScore) != null ? list.equals(schedule.matchScore) : schedule.matchScore == null) && ((teamsWinProbability2 = this.teamsWinProbability) != null ? teamsWinProbability2.equals(schedule.teamsWinProbability) : schedule.teamsWinProbability == null) && ((bool2 = this.isCricklyticsAvailable) != null ? bool2.equals(schedule.isCricklyticsAvailable) : schedule.isCricklyticsAvailable == null) && ((bool3 = this.isLiveCriclyticsAvailable) != null ? bool3.equals(schedule.isLiveCriclyticsAvailable) : schedule.isLiveCriclyticsAvailable == null) && ((num = this.currentDay) != null ? num.equals(schedule.currentDay) : schedule.currentDay == null) && ((num2 = this.currentSession) != null ? num2.equals(schedule.currentSession) : schedule.currentSession == null) && ((bool4 = this.playing11Status) != null ? bool4.equals(schedule.playing11Status) : schedule.playing11Status == null) && ((bool5 = this.isAbandoned) != null ? bool5.equals(schedule.isAbandoned) : schedule.isAbandoned == null) && ((str25 = this.rRunRate) != null ? str25.equals(schedule.rRunRate) : schedule.rRunRate == null) && ((bool6 = this.probable11Status) != null ? bool6.equals(schedule.probable11Status) : schedule.probable11Status == null) && ((iPLpolling = this.IPLpolling) != null ? iPLpolling.equals(schedule.IPLpolling) : schedule.IPLpolling == null) && ((bool7 = this.isFantasyAvailable) != null ? bool7.equals(schedule.isFantasyAvailable) : schedule.isFantasyAvailable == null) && ((bool8 = this.hasStatistics) != null ? bool8.equals(schedule.hasStatistics) : schedule.hasStatistics == null) && ((bool9 = this.hasPoints) != null ? bool9.equals(schedule.hasPoints) : schedule.hasPoints == null) && ((bool10 = this.isHomeMatchUpade) != null ? bool10.equals(schedule.isHomeMatchUpade) : schedule.isHomeMatchUpade == null) && ((str26 = this.content) != null ? str26.equals(schedule.content) : schedule.content == null) && ((criclyticsButtonFlags2 = this.criclyticsButtonFlags) != null ? criclyticsButtonFlags2.equals(schedule.criclyticsButtonFlags) : schedule.criclyticsButtonFlags == null)) {
                String str27 = this.matchName;
                String str28 = schedule.matchName;
                if (str27 == null) {
                    if (str28 == null) {
                        return true;
                    }
                } else if (str27.equals(str28)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.seriesID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Boolean bool = this.displayFeatureMatchScoreCard;
                int hashCode3 = (hashCode2 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str2 = this.currentinningsNo;
                int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.currentInningteamID;
                int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.currentInningsTeamName;
                int hashCode6 = (hashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.seriesName;
                int hashCode7 = (hashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.homeTeamName;
                int hashCode8 = (hashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.awayTeamName;
                int hashCode9 = (hashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.toss;
                int hashCode10 = (hashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.league;
                int hashCode11 = (hashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.startEndDate;
                int hashCode12 = (hashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.matchStatus;
                int hashCode13 = (hashCode12 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.matchID;
                int hashCode14 = (hashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.matchType;
                int hashCode15 = (hashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.statusMessage;
                int hashCode16 = (hashCode15 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.matchNumber;
                int hashCode17 = (hashCode16 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.venue;
                int hashCode18 = (hashCode17 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.matchResult;
                int hashCode19 = (hashCode18 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.startDate;
                int hashCode20 = (hashCode19 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.playerOfTheMatch;
                int hashCode21 = (hashCode20 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.playerID;
                int hashCode22 = (hashCode21 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                String str21 = this.firstInningsTeamID;
                int hashCode23 = (hashCode22 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                String str22 = this.secondInningsTeamID;
                int hashCode24 = (hashCode23 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
                String str23 = this.thirdInningsTeamID;
                int hashCode25 = (hashCode24 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
                String str24 = this.fourthInningsTeamID;
                int hashCode26 = (hashCode25 ^ (str24 == null ? 0 : str24.hashCode())) * 1000003;
                List<MatchScore> list = this.matchScore;
                int hashCode27 = (hashCode26 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                TeamsWinProbability teamsWinProbability2 = this.teamsWinProbability;
                int hashCode28 = (hashCode27 ^ (teamsWinProbability2 == null ? 0 : teamsWinProbability2.hashCode())) * 1000003;
                Boolean bool2 = this.isCricklyticsAvailable;
                int hashCode29 = (hashCode28 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                Boolean bool3 = this.isLiveCriclyticsAvailable;
                int hashCode30 = (hashCode29 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
                Integer num = this.currentDay;
                int hashCode31 = (hashCode30 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.currentSession;
                int hashCode32 = (hashCode31 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Boolean bool4 = this.playing11Status;
                int hashCode33 = (hashCode32 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
                Boolean bool5 = this.isAbandoned;
                int hashCode34 = (hashCode33 ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003;
                String str25 = this.rRunRate;
                int hashCode35 = (hashCode34 ^ (str25 == null ? 0 : str25.hashCode())) * 1000003;
                Boolean bool6 = this.probable11Status;
                int hashCode36 = (hashCode35 ^ (bool6 == null ? 0 : bool6.hashCode())) * 1000003;
                IPLpolling iPLpolling = this.IPLpolling;
                int hashCode37 = (hashCode36 ^ (iPLpolling == null ? 0 : iPLpolling.hashCode())) * 1000003;
                Boolean bool7 = this.isFantasyAvailable;
                int hashCode38 = (hashCode37 ^ (bool7 == null ? 0 : bool7.hashCode())) * 1000003;
                Boolean bool8 = this.hasStatistics;
                int hashCode39 = (hashCode38 ^ (bool8 == null ? 0 : bool8.hashCode())) * 1000003;
                Boolean bool9 = this.hasPoints;
                int hashCode40 = (hashCode39 ^ (bool9 == null ? 0 : bool9.hashCode())) * 1000003;
                Boolean bool10 = this.isHomeMatchUpade;
                int hashCode41 = (hashCode40 ^ (bool10 == null ? 0 : bool10.hashCode())) * 1000003;
                String str26 = this.content;
                int hashCode42 = (hashCode41 ^ (str26 == null ? 0 : str26.hashCode())) * 1000003;
                CriclyticsButtonFlags criclyticsButtonFlags2 = this.criclyticsButtonFlags;
                int hashCode43 = (hashCode42 ^ (criclyticsButtonFlags2 == null ? 0 : criclyticsButtonFlags2.hashCode())) * 1000003;
                String str27 = this.matchName;
                if (str27 != null) {
                    i = str27.hashCode();
                }
                this.$hashCode = hashCode43 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Schedule> {
            final CriclyticsButtonFlags.Mapper criclyticsButtonFlagsFieldMapper = new CriclyticsButtonFlags.Mapper();
            final IPLpolling.Mapper iPLpollingFieldMapper = new IPLpolling.Mapper();
            final MatchScore.Mapper matchScoreFieldMapper = new MatchScore.Mapper();
            final TeamsWinProbability.Mapper teamsWinProbabilityFieldMapper = new TeamsWinProbability.Mapper();

            @Override 
            public Schedule map(ResponseReader responseReader) {
                return new Schedule(responseReader.readString(Schedule.$responseFields[0]), responseReader.readString(Schedule.$responseFields[1]), responseReader.readBoolean(Schedule.$responseFields[2]), responseReader.readString(Schedule.$responseFields[3]), responseReader.readString(Schedule.$responseFields[4]), responseReader.readString(Schedule.$responseFields[5]), responseReader.readString(Schedule.$responseFields[6]), responseReader.readString(Schedule.$responseFields[7]), responseReader.readString(Schedule.$responseFields[8]), responseReader.readString(Schedule.$responseFields[9]), responseReader.readString(Schedule.$responseFields[10]), responseReader.readString(Schedule.$responseFields[11]), responseReader.readString(Schedule.$responseFields[12]), responseReader.readString(Schedule.$responseFields[13]), responseReader.readString(Schedule.$responseFields[14]), responseReader.readString(Schedule.$responseFields[15]), responseReader.readString(Schedule.$responseFields[16]), responseReader.readString(Schedule.$responseFields[17]), responseReader.readString(Schedule.$responseFields[18]), responseReader.readString(Schedule.$responseFields[19]), responseReader.readString(Schedule.$responseFields[20]), responseReader.readString(Schedule.$responseFields[21]), responseReader.readString(Schedule.$responseFields[22]), responseReader.readString(Schedule.$responseFields[23]), responseReader.readString(Schedule.$responseFields[24]), responseReader.readString(Schedule.$responseFields[25]), responseReader.readList(Schedule.$responseFields[26], new ResponseReader.ListReader<MatchScore>() {

                    @Override 
                    public MatchScore read(ResponseReader.ListItemReader listItemReader) {
                        return (MatchScore) listItemReader.readObject(new ResponseReader.ObjectReader<MatchScore>() {

                            @Override 
                            public MatchScore read(ResponseReader responseReader) {
                                return Mapper.this.matchScoreFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (TeamsWinProbability) responseReader.readObject(Schedule.$responseFields[27], new ResponseReader.ObjectReader<TeamsWinProbability>() {

                    @Override 
                    public TeamsWinProbability read(ResponseReader responseReader) {
                        return Mapper.this.teamsWinProbabilityFieldMapper.map(responseReader);
                    }
                }), responseReader.readBoolean(Schedule.$responseFields[28]), responseReader.readBoolean(Schedule.$responseFields[29]), responseReader.readInt(Schedule.$responseFields[30]), responseReader.readInt(Schedule.$responseFields[31]), responseReader.readBoolean(Schedule.$responseFields[32]), responseReader.readBoolean(Schedule.$responseFields[33]), responseReader.readString(Schedule.$responseFields[34]), responseReader.readBoolean(Schedule.$responseFields[35]), (IPLpolling) responseReader.readObject(Schedule.$responseFields[36], new ResponseReader.ObjectReader<IPLpolling>() {

                    @Override 
                    public IPLpolling read(ResponseReader responseReader) {
                        return Mapper.this.iPLpollingFieldMapper.map(responseReader);
                    }
                }), responseReader.readBoolean(Schedule.$responseFields[37]), responseReader.readBoolean(Schedule.$responseFields[38]), responseReader.readBoolean(Schedule.$responseFields[39]), responseReader.readBoolean(Schedule.$responseFields[40]), responseReader.readString(Schedule.$responseFields[41]), (CriclyticsButtonFlags) responseReader.readObject(Schedule.$responseFields[42], new ResponseReader.ObjectReader<CriclyticsButtonFlags>() {

                    @Override 
                    public CriclyticsButtonFlags read(ResponseReader responseReader) {
                        return Mapper.this.criclyticsButtonFlagsFieldMapper.map(responseReader);
                    }
                }), responseReader.readString(Schedule.$responseFields[43]));
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
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("featuredSeriesName", "featuredSeriesName", null, true, Collections.emptyList()), ResponseField.forBoolean("isPlayerIndex", "isPlayerIndex", null, true, Collections.emptyList()), ResponseField.forBoolean("isFinalFour", "isFinalFour", null, true, Collections.emptyList()), ResponseField.forString("tourID", "tourID", null, true, Collections.emptyList()), ResponseField.forString("seriesName", "seriesName", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String featuredSeriesName;
        final Boolean isFinalFour;
        final Boolean isPlayerIndex;
        final String seriesName;
        final String tourID;

        public CriclyticsButtonFlags(String str, String str2, Boolean bool, Boolean bool2, String str3, String str4) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.featuredSeriesName = str2;
            this.isPlayerIndex = bool;
            this.isFinalFour = bool2;
            this.tourID = str3;
            this.seriesName = str4;
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
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "CriclyticsButtonFlags{__typename=" + this.__typename + ", featuredSeriesName=" + this.featuredSeriesName + ", isPlayerIndex=" + this.isPlayerIndex + ", isFinalFour=" + this.isFinalFour + ", tourID=" + this.tourID + ", seriesName=" + this.seriesName + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            Boolean bool;
            Boolean bool2;
            String str2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CriclyticsButtonFlags)) {
                return false;
            }
            CriclyticsButtonFlags criclyticsButtonFlags = (CriclyticsButtonFlags) obj;
            if (this.__typename.equals(criclyticsButtonFlags.__typename) && ((str = this.featuredSeriesName) != null ? str.equals(criclyticsButtonFlags.featuredSeriesName) : criclyticsButtonFlags.featuredSeriesName == null) && ((bool = this.isPlayerIndex) != null ? bool.equals(criclyticsButtonFlags.isPlayerIndex) : criclyticsButtonFlags.isPlayerIndex == null) && ((bool2 = this.isFinalFour) != null ? bool2.equals(criclyticsButtonFlags.isFinalFour) : criclyticsButtonFlags.isFinalFour == null) && ((str2 = this.tourID) != null ? str2.equals(criclyticsButtonFlags.tourID) : criclyticsButtonFlags.tourID == null)) {
                String str3 = this.seriesName;
                String str4 = criclyticsButtonFlags.seriesName;
                if (str3 == null) {
                    if (str4 == null) {
                        return true;
                    }
                } else if (str3.equals(str4)) {
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
                if (str3 != null) {
                    i = str3.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<CriclyticsButtonFlags> {
            @Override 
            public CriclyticsButtonFlags map(ResponseReader responseReader) {
                return new CriclyticsButtonFlags(responseReader.readString(CriclyticsButtonFlags.$responseFields[0]), responseReader.readString(CriclyticsButtonFlags.$responseFields[1]), responseReader.readBoolean(CriclyticsButtonFlags.$responseFields[2]), responseReader.readBoolean(CriclyticsButtonFlags.$responseFields[3]), responseReader.readString(CriclyticsButtonFlags.$responseFields[4]), responseReader.readString(CriclyticsButtonFlags.$responseFields[5]));
            }
        }
    }
}
