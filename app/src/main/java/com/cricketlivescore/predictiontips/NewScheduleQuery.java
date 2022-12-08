package com.cricketlivescore.predictiontips;

import androidx.core.app.NotificationCompat;
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
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

public final class NewScheduleQuery implements Query<NewScheduleQuery.Data, NewScheduleQuery.Data, NewScheduleQuery.Variables> {
    public static final String OPERATION_ID = "f9da5c6481565f1309417a5128760897241efe18d86a085eebcb33164a60ee4f";
    public static final OperationName OPERATION_NAME = new OperationName() {

       @Override
        public String name() {
            return "newSchedule";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query newSchedule($type: String!, $status: String!, $page: Int!) {\n  newSchedule(type: $type, status: $status, page: $page) {\n    __typename\n    seriesView\n    seriesAvailable\n    seriesID\n    matchType\n    seriesName\n    matches {\n      __typename\n      seriesID\n      league\n      currentinningsNo\n      currentInningsTeamName\n      seriesName\n      homeTeamName\n      awayTeamName\n      toss\n      startEndDate\n      matchStatus\n      matchID\n      matchType\n      statusMessage\n      matchNumber\n      venue\n      matchResult\n      teamsWinProbability {\n        __typename\n        homeTeamShortName\n        homeTeamPercentage\n        awayTeamShortName\n        awayTeamPercentage\n        tiePercentage\n      }\n      matchScore {\n        __typename\n        teamShortName\n        teamID\n        teamFullName\n        teamScore {\n          __typename\n          inning\n          inningNumber\n          battingTeam\n          runsScored\n          wickets\n          overs\n          runRate\n          battingSide\n          teamID\n          battingTeamShortName\n          declared\n          folowOn\n        }\n      }\n      startDate\n      playerID\n      playing11Status\n      probable11Status\n      playerOfTheMatch\n      playerofTheMatchTeamShortName\n      firstInningsTeamID\n      secondInningsTeamID\n      thirdInningsTeamID\n      fourthInningsTeamID\n      league\n    }\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public NewScheduleQuery(String str, String str2, int i) {
        Utils.checkNotNull(str, "type == null");
        Utils.checkNotNull(str2, "status == null");
        this.variables = new Variables(str, str2, i);
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
        private int page;
        private String status;
        private String type;

        Builder() {
        }

        public Builder type(String str) {
            this.type = str;
            return this;
        }

        public Builder status(String str) {
            this.status = str;
            return this;
        }

        public Builder page(int i) {
            this.page = i;
            return this;
        }

        public NewScheduleQuery build() {
            Utils.checkNotNull(this.type, "type == null");
            Utils.checkNotNull(this.status, "status == null");
            return new NewScheduleQuery(this.type, this.status, this.page);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final int page;
        private final String status;
        private final String type;
        private final transient Map<String, Object> valueMap;

        Variables(String str, String str2, int i) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.type = str;
            this.status = str2;
            this.page = i;
            linkedHashMap.put("type", str);
            linkedHashMap.put(NotificationCompat.CATEGORY_STATUS, str2);
            linkedHashMap.put("page", Integer.valueOf(i));
        }

        public String type() {
            return this.type;
        }

        public String status() {
            return this.status;
        }

        public int page() {
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
                    inputFieldWriter.writeString("type", Variables.this.type);
                    inputFieldWriter.writeString(NotificationCompat.CATEGORY_STATUS, Variables.this.status);
                    inputFieldWriter.writeInt("page", Integer.valueOf(Variables.this.page));
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forList("newSchedule", "newSchedule", new UnmodifiableMapBuilder(3).put("type", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "type").build()).put(NotificationCompat.CATEGORY_STATUS, new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, NotificationCompat.CATEGORY_STATUS).build()).put("page", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "page").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final List<NewSchedule> newSchedule;

        public Data(List<NewSchedule> list) {
            this.newSchedule = list;
        }

        public List<NewSchedule> newSchedule() {
            return this.newSchedule;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeList(Data.$responseFields[0], Data.this.newSchedule, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((NewSchedule) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{newSchedule=" + this.newSchedule + "}";
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
            List<NewSchedule> list = this.newSchedule;
            List<NewSchedule> list2 = ((Data) obj).newSchedule;
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
                List<NewSchedule> list = this.newSchedule;
                this.$hashCode = 1000003 ^ (list == null ? 0 : list.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final NewSchedule.Mapper newScheduleFieldMapper = new NewSchedule.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data(responseReader.readList(Data.$responseFields[0], new ResponseReader.ListReader<NewSchedule>() {

                    @Override 
                    public NewSchedule read(ResponseReader.ListItemReader listItemReader) {
                        return (NewSchedule) listItemReader.readObject(new ResponseReader.ObjectReader<NewSchedule>() {

                            @Override 
                            public NewSchedule read(ResponseReader responseReader) {
                                return Mapper.this.newScheduleFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class NewSchedule {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forBoolean("seriesView", "seriesView", null, true, Collections.emptyList()), ResponseField.forBoolean("seriesAvailable", "seriesAvailable", null, true, Collections.emptyList()), ResponseField.forString("seriesID", "seriesID", null, true, Collections.emptyList()), ResponseField.forString("matchType", "matchType", null, true, Collections.emptyList()), ResponseField.forString("seriesName", "seriesName", null, true, Collections.emptyList()), ResponseField.forList("matches", "matches", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String matchType;
        final List<C6608Match> matches;
        final Boolean seriesAvailable;
        final String seriesID;
        final String seriesName;
        final Boolean seriesView;

        public NewSchedule(String str, Boolean bool, Boolean bool2, String str2, String str3, String str4, List<C6608Match> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.seriesView = bool;
            this.seriesAvailable = bool2;
            this.seriesID = str2;
            this.matchType = str3;
            this.seriesName = str4;
            this.matches = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public Boolean seriesView() {
            return this.seriesView;
        }

        public Boolean seriesAvailable() {
            return this.seriesAvailable;
        }

        public String seriesID() {
            return this.seriesID;
        }

        public String matchType() {
            return this.matchType;
        }

        public String seriesName() {
            return this.seriesName;
        }

        public List<C6608Match> matches() {
            return this.matches;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(NewSchedule.$responseFields[0], NewSchedule.this.__typename);
                    responseWriter.writeBoolean(NewSchedule.$responseFields[1], NewSchedule.this.seriesView);
                    responseWriter.writeBoolean(NewSchedule.$responseFields[2], NewSchedule.this.seriesAvailable);
                    responseWriter.writeString(NewSchedule.$responseFields[3], NewSchedule.this.seriesID);
                    responseWriter.writeString(NewSchedule.$responseFields[4], NewSchedule.this.matchType);
                    responseWriter.writeString(NewSchedule.$responseFields[5], NewSchedule.this.seriesName);
                    responseWriter.writeList(NewSchedule.$responseFields[6], NewSchedule.this.matches, new ResponseWriter.ListWriter() {

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((C6608Match) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "NewSchedule{__typename=" + this.__typename + ", seriesView=" + this.seriesView + ", seriesAvailable=" + this.seriesAvailable + ", seriesID=" + this.seriesID + ", matchType=" + this.matchType + ", seriesName=" + this.seriesName + ", matches=" + this.matches + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Boolean bool;
            Boolean bool2;
            String str;
            String str2;
            String str3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NewSchedule)) {
                return false;
            }
            NewSchedule newSchedule = (NewSchedule) obj;
            if (this.__typename.equals(newSchedule.__typename) && ((bool = this.seriesView) != null ? bool.equals(newSchedule.seriesView) : newSchedule.seriesView == null) && ((bool2 = this.seriesAvailable) != null ? bool2.equals(newSchedule.seriesAvailable) : newSchedule.seriesAvailable == null) && ((str = this.seriesID) != null ? str.equals(newSchedule.seriesID) : newSchedule.seriesID == null) && ((str2 = this.matchType) != null ? str2.equals(newSchedule.matchType) : newSchedule.matchType == null) && ((str3 = this.seriesName) != null ? str3.equals(newSchedule.seriesName) : newSchedule.seriesName == null)) {
                List<C6608Match> list = this.matches;
                List<C6608Match> list2 = newSchedule.matches;
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
                Boolean bool = this.seriesView;
                int i = 0;
                int hashCode2 = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.seriesAvailable;
                int hashCode3 = (hashCode2 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str = this.seriesID;
                int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.matchType;
                int hashCode5 = (hashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.seriesName;
                int hashCode6 = (hashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                List<C6608Match> list = this.matches;
                if (list != null) {
                    i = list.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<NewSchedule> {
            final C6608Match.Mapper matchFieldMapper = new C6608Match.Mapper();

            @Override 
            public NewSchedule map(ResponseReader responseReader) {
                return new NewSchedule(responseReader.readString(NewSchedule.$responseFields[0]), responseReader.readBoolean(NewSchedule.$responseFields[1]), responseReader.readBoolean(NewSchedule.$responseFields[2]), responseReader.readString(NewSchedule.$responseFields[3]), responseReader.readString(NewSchedule.$responseFields[4]), responseReader.readString(NewSchedule.$responseFields[5]), responseReader.readList(NewSchedule.$responseFields[6], new ResponseReader.ListReader<C6608Match>() {

                    @Override 
                    public C6608Match read(ResponseReader.ListItemReader listItemReader) {
                        return (C6608Match) listItemReader.readObject(new ResponseReader.ObjectReader<C6608Match>() {

                            @Override 
                            public C6608Match read(ResponseReader responseReader) {
                                return Mapper.this.matchFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }
   public static class C6608Match {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("seriesID", "seriesID", null, true, Collections.emptyList()), ResponseField.forString("league", "league", null, true, Collections.emptyList()), ResponseField.forString("currentinningsNo", "currentinningsNo", null, true, Collections.emptyList()), ResponseField.forString("currentInningsTeamName", "currentInningsTeamName", null, true, Collections.emptyList()), ResponseField.forString("seriesName", "seriesName", null, true, Collections.emptyList()), ResponseField.forString("homeTeamName", "homeTeamName", null, true, Collections.emptyList()), ResponseField.forString("awayTeamName", "awayTeamName", null, true, Collections.emptyList()), ResponseField.forString("toss", "toss", null, true, Collections.emptyList()), ResponseField.forString("startEndDate", "startEndDate", null, true, Collections.emptyList()), ResponseField.forString("matchStatus", "matchStatus", null, true, Collections.emptyList()), ResponseField.forString("matchID", "matchID", null, true, Collections.emptyList()), ResponseField.forString("matchType", "matchType", null, true, Collections.emptyList()), ResponseField.forString("statusMessage", "statusMessage", null, true, Collections.emptyList()), ResponseField.forString("matchNumber", "matchNumber", null, true, Collections.emptyList()), ResponseField.forString("venue", "venue", null, true, Collections.emptyList()), ResponseField.forString("matchResult", "matchResult", null, true, Collections.emptyList()), ResponseField.forObject("teamsWinProbability", "teamsWinProbability", null, true, Collections.emptyList()), ResponseField.forList("matchScore", "matchScore", null, true, Collections.emptyList()), ResponseField.forString("startDate", "startDate", null, true, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forBoolean("playing11Status", "playing11Status", null, true, Collections.emptyList()), ResponseField.forBoolean("probable11Status", "probable11Status", null, true, Collections.emptyList()), ResponseField.forString("playerOfTheMatch", "playerOfTheMatch", null, true, Collections.emptyList()), ResponseField.forString("playerofTheMatchTeamShortName", "playerofTheMatchTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("firstInningsTeamID", "firstInningsTeamID", null, true, Collections.emptyList()), ResponseField.forString("secondInningsTeamID", "secondInningsTeamID", null, true, Collections.emptyList()), ResponseField.forString("thirdInningsTeamID", "thirdInningsTeamID", null, true, Collections.emptyList()), ResponseField.forString("fourthInningsTeamID", "fourthInningsTeamID", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String awayTeamName;
        final String currentInningsTeamName;
        final String currentinningsNo;
        final String firstInningsTeamID;
        final String fourthInningsTeamID;
        final String homeTeamName;
        final String league;
        final String matchID;
        final String matchNumber;
        final String matchResult;
        final List<MatchScore> matchScore;
        final String matchStatus;
        final String matchType;
        final String playerID;
        final String playerOfTheMatch;
        final String playerofTheMatchTeamShortName;
        final Boolean playing11Status;
        final Boolean probable11Status;
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

        public C6608Match(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, TeamsWinProbability teamsWinProbability2, List<MatchScore> list, String str18, String str19, Boolean bool, Boolean bool2, String str20, String str21, String str22, String str23, String str24, String str25) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.seriesID = str2;
            this.league = str3;
            this.currentinningsNo = str4;
            this.currentInningsTeamName = str5;
            this.seriesName = str6;
            this.homeTeamName = str7;
            this.awayTeamName = str8;
            this.toss = str9;
            this.startEndDate = str10;
            this.matchStatus = str11;
            this.matchID = str12;
            this.matchType = str13;
            this.statusMessage = str14;
            this.matchNumber = str15;
            this.venue = str16;
            this.matchResult = str17;
            this.teamsWinProbability = teamsWinProbability2;
            this.matchScore = list;
            this.startDate = str18;
            this.playerID = str19;
            this.playing11Status = bool;
            this.probable11Status = bool2;
            this.playerOfTheMatch = str20;
            this.playerofTheMatchTeamShortName = str21;
            this.firstInningsTeamID = str22;
            this.secondInningsTeamID = str23;
            this.thirdInningsTeamID = str24;
            this.fourthInningsTeamID = str25;
        }

        public String __typename() {
            return this.__typename;
        }

        public String seriesID() {
            return this.seriesID;
        }

        public String league() {
            return this.league;
        }

        public String currentinningsNo() {
            return this.currentinningsNo;
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

        public TeamsWinProbability teamsWinProbability() {
            return this.teamsWinProbability;
        }

        public List<MatchScore> matchScore() {
            return this.matchScore;
        }

        public String startDate() {
            return this.startDate;
        }

        public String playerID() {
            return this.playerID;
        }

        public Boolean playing11Status() {
            return this.playing11Status;
        }

        public Boolean probable11Status() {
            return this.probable11Status;
        }

        public String playerOfTheMatch() {
            return this.playerOfTheMatch;
        }

        public String playerofTheMatchTeamShortName() {
            return this.playerofTheMatchTeamShortName;
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

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(C6608Match.$responseFields[0], C6608Match.this.__typename);
                    responseWriter.writeString(C6608Match.$responseFields[1], C6608Match.this.seriesID);
                    responseWriter.writeString(C6608Match.$responseFields[2], C6608Match.this.league);
                    responseWriter.writeString(C6608Match.$responseFields[3], C6608Match.this.currentinningsNo);
                    responseWriter.writeString(C6608Match.$responseFields[4], C6608Match.this.currentInningsTeamName);
                    responseWriter.writeString(C6608Match.$responseFields[5], C6608Match.this.seriesName);
                    responseWriter.writeString(C6608Match.$responseFields[6], C6608Match.this.homeTeamName);
                    responseWriter.writeString(C6608Match.$responseFields[7], C6608Match.this.awayTeamName);
                    responseWriter.writeString(C6608Match.$responseFields[8], C6608Match.this.toss);
                    responseWriter.writeString(C6608Match.$responseFields[9], C6608Match.this.startEndDate);
                    responseWriter.writeString(C6608Match.$responseFields[10], C6608Match.this.matchStatus);
                    responseWriter.writeString(C6608Match.$responseFields[11], C6608Match.this.matchID);
                    responseWriter.writeString(C6608Match.$responseFields[12], C6608Match.this.matchType);
                    responseWriter.writeString(C6608Match.$responseFields[13], C6608Match.this.statusMessage);
                    responseWriter.writeString(C6608Match.$responseFields[14], C6608Match.this.matchNumber);
                    responseWriter.writeString(C6608Match.$responseFields[15], C6608Match.this.venue);
                    responseWriter.writeString(C6608Match.$responseFields[16], C6608Match.this.matchResult);
                    responseWriter.writeObject(C6608Match.$responseFields[17], C6608Match.this.teamsWinProbability != null ? C6608Match.this.teamsWinProbability.marshaller() : null);
                    responseWriter.writeList(C6608Match.$responseFields[18], C6608Match.this.matchScore, new ResponseWriter.ListWriter() {

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((MatchScore) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeString(C6608Match.$responseFields[19], C6608Match.this.startDate);
                    responseWriter.writeString(C6608Match.$responseFields[20], C6608Match.this.playerID);
                    responseWriter.writeBoolean(C6608Match.$responseFields[21], C6608Match.this.playing11Status);
                    responseWriter.writeBoolean(C6608Match.$responseFields[22], C6608Match.this.probable11Status);
                    responseWriter.writeString(C6608Match.$responseFields[23], C6608Match.this.playerOfTheMatch);
                    responseWriter.writeString(C6608Match.$responseFields[24], C6608Match.this.playerofTheMatchTeamShortName);
                    responseWriter.writeString(C6608Match.$responseFields[25], C6608Match.this.firstInningsTeamID);
                    responseWriter.writeString(C6608Match.$responseFields[26], C6608Match.this.secondInningsTeamID);
                    responseWriter.writeString(C6608Match.$responseFields[27], C6608Match.this.thirdInningsTeamID);
                    responseWriter.writeString(C6608Match.$responseFields[28], C6608Match.this.fourthInningsTeamID);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Match{__typename=" + this.__typename + ", seriesID=" + this.seriesID + ", league=" + this.league + ", currentinningsNo=" + this.currentinningsNo + ", currentInningsTeamName=" + this.currentInningsTeamName + ", seriesName=" + this.seriesName + ", homeTeamName=" + this.homeTeamName + ", awayTeamName=" + this.awayTeamName + ", toss=" + this.toss + ", startEndDate=" + this.startEndDate + ", matchStatus=" + this.matchStatus + ", matchID=" + this.matchID + ", matchType=" + this.matchType + ", statusMessage=" + this.statusMessage + ", matchNumber=" + this.matchNumber + ", venue=" + this.venue + ", matchResult=" + this.matchResult + ", teamsWinProbability=" + this.teamsWinProbability + ", matchScore=" + this.matchScore + ", startDate=" + this.startDate + ", playerID=" + this.playerID + ", playing11Status=" + this.playing11Status + ", probable11Status=" + this.probable11Status + ", playerOfTheMatch=" + this.playerOfTheMatch + ", playerofTheMatchTeamShortName=" + this.playerofTheMatchTeamShortName + ", firstInningsTeamID=" + this.firstInningsTeamID + ", secondInningsTeamID=" + this.secondInningsTeamID + ", thirdInningsTeamID=" + this.thirdInningsTeamID + ", fourthInningsTeamID=" + this.fourthInningsTeamID + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
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
            TeamsWinProbability teamsWinProbability2;
            List<MatchScore> list;
            String str17;
            String str18;
            Boolean bool;
            Boolean bool2;
            String str19;
            String str20;
            String str21;
            String str22;
            String str23;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6608Match)) {
                return false;
            }
            C6608Match match = (C6608Match) obj;
            if (this.__typename.equals(match.__typename) && ((str = this.seriesID) != null ? str.equals(match.seriesID) : match.seriesID == null) && ((str2 = this.league) != null ? str2.equals(match.league) : match.league == null) && ((str3 = this.currentinningsNo) != null ? str3.equals(match.currentinningsNo) : match.currentinningsNo == null) && ((str4 = this.currentInningsTeamName) != null ? str4.equals(match.currentInningsTeamName) : match.currentInningsTeamName == null) && ((str5 = this.seriesName) != null ? str5.equals(match.seriesName) : match.seriesName == null) && ((str6 = this.homeTeamName) != null ? str6.equals(match.homeTeamName) : match.homeTeamName == null) && ((str7 = this.awayTeamName) != null ? str7.equals(match.awayTeamName) : match.awayTeamName == null) && ((str8 = this.toss) != null ? str8.equals(match.toss) : match.toss == null) && ((str9 = this.startEndDate) != null ? str9.equals(match.startEndDate) : match.startEndDate == null) && ((str10 = this.matchStatus) != null ? str10.equals(match.matchStatus) : match.matchStatus == null) && ((str11 = this.matchID) != null ? str11.equals(match.matchID) : match.matchID == null) && ((str12 = this.matchType) != null ? str12.equals(match.matchType) : match.matchType == null) && ((str13 = this.statusMessage) != null ? str13.equals(match.statusMessage) : match.statusMessage == null) && ((str14 = this.matchNumber) != null ? str14.equals(match.matchNumber) : match.matchNumber == null) && ((str15 = this.venue) != null ? str15.equals(match.venue) : match.venue == null) && ((str16 = this.matchResult) != null ? str16.equals(match.matchResult) : match.matchResult == null) && ((teamsWinProbability2 = this.teamsWinProbability) != null ? teamsWinProbability2.equals(match.teamsWinProbability) : match.teamsWinProbability == null) && ((list = this.matchScore) != null ? list.equals(match.matchScore) : match.matchScore == null) && ((str17 = this.startDate) != null ? str17.equals(match.startDate) : match.startDate == null) && ((str18 = this.playerID) != null ? str18.equals(match.playerID) : match.playerID == null) && ((bool = this.playing11Status) != null ? bool.equals(match.playing11Status) : match.playing11Status == null) && ((bool2 = this.probable11Status) != null ? bool2.equals(match.probable11Status) : match.probable11Status == null) && ((str19 = this.playerOfTheMatch) != null ? str19.equals(match.playerOfTheMatch) : match.playerOfTheMatch == null) && ((str20 = this.playerofTheMatchTeamShortName) != null ? str20.equals(match.playerofTheMatchTeamShortName) : match.playerofTheMatchTeamShortName == null) && ((str21 = this.firstInningsTeamID) != null ? str21.equals(match.firstInningsTeamID) : match.firstInningsTeamID == null) && ((str22 = this.secondInningsTeamID) != null ? str22.equals(match.secondInningsTeamID) : match.secondInningsTeamID == null) && ((str23 = this.thirdInningsTeamID) != null ? str23.equals(match.thirdInningsTeamID) : match.thirdInningsTeamID == null)) {
                String str24 = this.fourthInningsTeamID;
                String str25 = match.fourthInningsTeamID;
                if (str24 == null) {
                    if (str25 == null) {
                        return true;
                    }
                } else if (str24.equals(str25)) {
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
                String str2 = this.league;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.currentinningsNo;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.currentInningsTeamName;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.seriesName;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.homeTeamName;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.awayTeamName;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.toss;
                int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.startEndDate;
                int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.matchStatus;
                int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.matchID;
                int hashCode12 = (hashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.matchType;
                int hashCode13 = (hashCode12 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.statusMessage;
                int hashCode14 = (hashCode13 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.matchNumber;
                int hashCode15 = (hashCode14 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.venue;
                int hashCode16 = (hashCode15 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.matchResult;
                int hashCode17 = (hashCode16 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                TeamsWinProbability teamsWinProbability2 = this.teamsWinProbability;
                int hashCode18 = (hashCode17 ^ (teamsWinProbability2 == null ? 0 : teamsWinProbability2.hashCode())) * 1000003;
                List<MatchScore> list = this.matchScore;
                int hashCode19 = (hashCode18 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str17 = this.startDate;
                int hashCode20 = (hashCode19 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.playerID;
                int hashCode21 = (hashCode20 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                Boolean bool = this.playing11Status;
                int hashCode22 = (hashCode21 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.probable11Status;
                int hashCode23 = (hashCode22 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str19 = this.playerOfTheMatch;
                int hashCode24 = (hashCode23 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.playerofTheMatchTeamShortName;
                int hashCode25 = (hashCode24 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                String str21 = this.firstInningsTeamID;
                int hashCode26 = (hashCode25 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                String str22 = this.secondInningsTeamID;
                int hashCode27 = (hashCode26 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
                String str23 = this.thirdInningsTeamID;
                int hashCode28 = (hashCode27 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
                String str24 = this.fourthInningsTeamID;
                if (str24 != null) {
                    i = str24.hashCode();
                }
                this.$hashCode = hashCode28 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<C6608Match> {
            final MatchScore.Mapper matchScoreFieldMapper = new MatchScore.Mapper();
            final TeamsWinProbability.Mapper teamsWinProbabilityFieldMapper = new TeamsWinProbability.Mapper();

            @Override 
            public C6608Match map(ResponseReader responseReader) {
                return new C6608Match(responseReader.readString(C6608Match.$responseFields[0]), responseReader.readString(C6608Match.$responseFields[1]), responseReader.readString(C6608Match.$responseFields[2]), responseReader.readString(C6608Match.$responseFields[3]), responseReader.readString(C6608Match.$responseFields[4]), responseReader.readString(C6608Match.$responseFields[5]), responseReader.readString(C6608Match.$responseFields[6]), responseReader.readString(C6608Match.$responseFields[7]), responseReader.readString(C6608Match.$responseFields[8]), responseReader.readString(C6608Match.$responseFields[9]), responseReader.readString(C6608Match.$responseFields[10]), responseReader.readString(C6608Match.$responseFields[11]), responseReader.readString(C6608Match.$responseFields[12]), responseReader.readString(C6608Match.$responseFields[13]), responseReader.readString(C6608Match.$responseFields[14]), responseReader.readString(C6608Match.$responseFields[15]), responseReader.readString(C6608Match.$responseFields[16]), (TeamsWinProbability) responseReader.readObject(C6608Match.$responseFields[17], new ResponseReader.ObjectReader<TeamsWinProbability>() {

                    @Override 
                    public TeamsWinProbability read(ResponseReader responseReader) {
                        return Mapper.this.teamsWinProbabilityFieldMapper.map(responseReader);
                    }
                }), responseReader.readList(C6608Match.$responseFields[18], new ResponseReader.ListReader<MatchScore>() {

                    @Override 
                    public MatchScore read(ResponseReader.ListItemReader listItemReader) {
                        return (MatchScore) listItemReader.readObject(new ResponseReader.ObjectReader<MatchScore>() {

                            @Override 
                            public MatchScore read(ResponseReader responseReader) {
                                return Mapper.this.matchScoreFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readString(C6608Match.$responseFields[19]), responseReader.readString(C6608Match.$responseFields[20]), responseReader.readBoolean(C6608Match.$responseFields[21]), responseReader.readBoolean(C6608Match.$responseFields[22]), responseReader.readString(C6608Match.$responseFields[23]), responseReader.readString(C6608Match.$responseFields[24]), responseReader.readString(C6608Match.$responseFields[25]), responseReader.readString(C6608Match.$responseFields[26]), responseReader.readString(C6608Match.$responseFields[27]), responseReader.readString(C6608Match.$responseFields[28]));
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
}
