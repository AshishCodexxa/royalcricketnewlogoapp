package com.cricketlivescore.predictiontips;

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

public final class MatcheslistQuery implements Query<MatcheslistQuery.Data, MatcheslistQuery.Data, MatcheslistQuery.Variables> {
    public static final String OPERATION_ID = "5795fb340f7746991979fa83ccd1b833c8dada45016e07487f83cdb7c94c8212";
    public static final OperationName OPERATION_NAME = new OperationName() {

        @Override
        public String name() {
            return "matcheslist";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query matcheslist($seriesID: String!) {\n  matcheslist(seriesID: $seriesID) {\n    __typename\n    matchName\n    homeTeamShortName\n    awayTeamShortName\n    matchResult\n    venue\n    matchNumber\n    matchdate\n    matchID\n    matchStatus\n    startDate\n    matchType\n    statusMessage\n    playerOfTheMatch\n    playerID\n    firstInningsTeamID\n    secondInningsTeamID\n    thirdInningsTeamID\n    fourthInningsTeamID\n    currentinningsNo\n    currentInningteamID\n    currentInningsTeamName\n    seriesName\n    toss\n    seriesID\n    matchScore {\n      __typename\n      teamShortName\n      teamID\n      teamFullName\n      teamScore {\n        __typename\n        inning\n        inningNumber\n        battingTeam\n        runsScored\n        wickets\n        overs\n        runRate\n        battingSide\n        teamID\n        battingTeamShortName\n        declared\n        folowOn\n      }\n    }\n    teamsWinProbability {\n      __typename\n      homeTeamShortName\n      homeTeamPercentage\n      awayTeamShortName\n      awayTeamPercentage\n      tiePercentage\n    }\n    isCricklyticsAvailable\n    isLiveCriclyticsAvailable\n    currentDay\n    currentSession\n    playing11Status\n    isAbandoned\n    probable11Status\n    isStatistics\n    isPoints\n  }\n}");
    private final Variables variables;

    @Override
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public MatcheslistQuery(String str) {
        Utils.checkNotNull(str, "seriesID == null");
        this.variables = new Variables(str);
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
        private String seriesID;

        Builder() {
        }

        public Builder seriesID(String str) {
            this.seriesID = str;
            return this;
        }

        public MatcheslistQuery build() {
            Utils.checkNotNull(this.seriesID, "seriesID == null");
            return new MatcheslistQuery(this.seriesID);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String seriesID;
        private final transient Map<String, Object> valueMap;

        Variables(String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.seriesID = str;
            linkedHashMap.put("seriesID", str);
        }

        public String seriesID() {
            return this.seriesID;
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
                    inputFieldWriter.writeString("seriesID", Variables.this.seriesID);
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forList("matcheslist", "matcheslist", new UnmodifiableMapBuilder(1).put("seriesID", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "seriesID").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final List<Matcheslist> matcheslist;

        public Data(List<Matcheslist> list) {
            this.matcheslist = list;
        }

        public List<Matcheslist> matcheslist() {
            return this.matcheslist;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeList(Data.$responseFields[0], Data.this.matcheslist, new ResponseWriter.ListWriter() {


                        @Override
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Matcheslist) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{matcheslist=" + this.matcheslist + "}";
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
            List<Matcheslist> list = this.matcheslist;
            List<Matcheslist> list2 = ((Data) obj).matcheslist;
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
                List<Matcheslist> list = this.matcheslist;
                this.$hashCode = 1000003 ^ (list == null ? 0 : list.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final Matcheslist.Mapper matcheslistFieldMapper = new Matcheslist.Mapper();

            @Override
            public Data map(ResponseReader responseReader) {
                return new Data(responseReader.readList(Data.$responseFields[0], new ResponseReader.ListReader<Matcheslist>() {


                    @Override
                    public Matcheslist read(ResponseReader.ListItemReader listItemReader) {
                        return (Matcheslist) listItemReader.readObject(new ResponseReader.ObjectReader<Matcheslist>() {


                            @Override
                            public Matcheslist read(ResponseReader responseReader) {
                                return Mapper.this.matcheslistFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class Matcheslist {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchName", "matchName", null, true, Collections.emptyList()), ResponseField.forString("homeTeamShortName", "homeTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("awayTeamShortName", "awayTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("matchResult", "matchResult", null, true, Collections.emptyList()), ResponseField.forString("venue", "venue", null, true, Collections.emptyList()), ResponseField.forString("matchNumber", "matchNumber", null, true, Collections.emptyList()), ResponseField.forString("matchdate", "matchdate", null, true, Collections.emptyList()), ResponseField.forString("matchID", "matchID", null, true, Collections.emptyList()), ResponseField.forString("matchStatus", "matchStatus", null, true, Collections.emptyList()), ResponseField.forString("startDate", "startDate", null, true, Collections.emptyList()), ResponseField.forString("matchType", "matchType", null, true, Collections.emptyList()), ResponseField.forString("statusMessage", "statusMessage", null, true, Collections.emptyList()), ResponseField.forString("playerOfTheMatch", "playerOfTheMatch", null, true, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("firstInningsTeamID", "firstInningsTeamID", null, true, Collections.emptyList()), ResponseField.forString("secondInningsTeamID", "secondInningsTeamID", null, true, Collections.emptyList()), ResponseField.forString("thirdInningsTeamID", "thirdInningsTeamID", null, true, Collections.emptyList()), ResponseField.forString("fourthInningsTeamID", "fourthInningsTeamID", null, true, Collections.emptyList()), ResponseField.forString("currentinningsNo", "currentinningsNo", null, true, Collections.emptyList()), ResponseField.forString("currentInningteamID", "currentInningteamID", null, true, Collections.emptyList()), ResponseField.forString("currentInningsTeamName", "currentInningsTeamName", null, true, Collections.emptyList()), ResponseField.forString("seriesName", "seriesName", null, true, Collections.emptyList()), ResponseField.forString("toss", "toss", null, true, Collections.emptyList()), ResponseField.forString("seriesID", "seriesID", null, true, Collections.emptyList()), ResponseField.forList("matchScore", "matchScore", null, true, Collections.emptyList()), ResponseField.forObject("teamsWinProbability", "teamsWinProbability", null, true, Collections.emptyList()), ResponseField.forBoolean("isCricklyticsAvailable", "isCricklyticsAvailable", null, true, Collections.emptyList()), ResponseField.forBoolean("isLiveCriclyticsAvailable", "isLiveCriclyticsAvailable", null, true, Collections.emptyList()), ResponseField.forInt("currentDay", "currentDay", null, true, Collections.emptyList()), ResponseField.forInt("currentSession", "currentSession", null, true, Collections.emptyList()), ResponseField.forBoolean("playing11Status", "playing11Status", null, true, Collections.emptyList()), ResponseField.forBoolean("isAbandoned", "isAbandoned", null, true, Collections.emptyList()), ResponseField.forBoolean("probable11Status", "probable11Status", null, true, Collections.emptyList()), ResponseField.forBoolean("isStatistics", "isStatistics", null, true, Collections.emptyList()), ResponseField.forBoolean("isPoints", "isPoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String awayTeamShortName;
        final Integer currentDay;
        final String currentInningsTeamName;
        final String currentInningteamID;
        final Integer currentSession;
        final String currentinningsNo;
        final String firstInningsTeamID;
        final String fourthInningsTeamID;
        final String homeTeamShortName;
        final Boolean isAbandoned;
        final Boolean isCricklyticsAvailable;
        final Boolean isLiveCriclyticsAvailable;
        final Boolean isPoints;
        final Boolean isStatistics;
        final String matchID;
        final String matchName;
        final String matchNumber;
        final String matchResult;
        final List<MatchScore> matchScore;
        final String matchStatus;
        final String matchType;
        final String matchdate;
        final String playerID;
        final String playerOfTheMatch;
        final Boolean playing11Status;
        final Boolean probable11Status;
        final String secondInningsTeamID;
        final String seriesID;
        final String seriesName;
        final String startDate;
        final String statusMessage;
        final TeamsWinProbability teamsWinProbability;
        final String thirdInningsTeamID;
        final String toss;
        final String venue;

        public Matcheslist(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, List<MatchScore> list, TeamsWinProbability teamsWinProbability2, Boolean bool, Boolean bool2, Integer num, Integer num2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchName = str2;
            this.homeTeamShortName = str3;
            this.awayTeamShortName = str4;
            this.matchResult = str5;
            this.venue = str6;
            this.matchNumber = str7;
            this.matchdate = str8;
            this.matchID = str9;
            this.matchStatus = str10;
            this.startDate = str11;
            this.matchType = str12;
            this.statusMessage = str13;
            this.playerOfTheMatch = str14;
            this.playerID = str15;
            this.firstInningsTeamID = str16;
            this.secondInningsTeamID = str17;
            this.thirdInningsTeamID = str18;
            this.fourthInningsTeamID = str19;
            this.currentinningsNo = str20;
            this.currentInningteamID = str21;
            this.currentInningsTeamName = str22;
            this.seriesName = str23;
            this.toss = str24;
            this.seriesID = str25;
            this.matchScore = list;
            this.teamsWinProbability = teamsWinProbability2;
            this.isCricklyticsAvailable = bool;
            this.isLiveCriclyticsAvailable = bool2;
            this.currentDay = num;
            this.currentSession = num2;
            this.playing11Status = bool3;
            this.isAbandoned = bool4;
            this.probable11Status = bool5;
            this.isStatistics = bool6;
            this.isPoints = bool7;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchName() {
            return this.matchName;
        }

        public String homeTeamShortName() {
            return this.homeTeamShortName;
        }

        public String awayTeamShortName() {
            return this.awayTeamShortName;
        }

        public String matchResult() {
            return this.matchResult;
        }

        public String venue() {
            return this.venue;
        }

        public String matchNumber() {
            return this.matchNumber;
        }

        public String matchdate() {
            return this.matchdate;
        }

        public String matchID() {
            return this.matchID;
        }

        public String matchStatus() {
            return this.matchStatus;
        }

        public String startDate() {
            return this.startDate;
        }

        public String matchType() {
            return this.matchType;
        }

        public String statusMessage() {
            return this.statusMessage;
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

        public String toss() {
            return this.toss;
        }

        public String seriesID() {
            return this.seriesID;
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

        public Boolean probable11Status() {
            return this.probable11Status;
        }

        public Boolean isStatistics() {
            return this.isStatistics;
        }

        public Boolean isPoints() {
            return this.isPoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Matcheslist.$responseFields[0], Matcheslist.this.__typename);
                    responseWriter.writeString(Matcheslist.$responseFields[1], Matcheslist.this.matchName);
                    responseWriter.writeString(Matcheslist.$responseFields[2], Matcheslist.this.homeTeamShortName);
                    responseWriter.writeString(Matcheslist.$responseFields[3], Matcheslist.this.awayTeamShortName);
                    responseWriter.writeString(Matcheslist.$responseFields[4], Matcheslist.this.matchResult);
                    responseWriter.writeString(Matcheslist.$responseFields[5], Matcheslist.this.venue);
                    responseWriter.writeString(Matcheslist.$responseFields[6], Matcheslist.this.matchNumber);
                    responseWriter.writeString(Matcheslist.$responseFields[7], Matcheslist.this.matchdate);
                    responseWriter.writeString(Matcheslist.$responseFields[8], Matcheslist.this.matchID);
                    responseWriter.writeString(Matcheslist.$responseFields[9], Matcheslist.this.matchStatus);
                    responseWriter.writeString(Matcheslist.$responseFields[10], Matcheslist.this.startDate);
                    responseWriter.writeString(Matcheslist.$responseFields[11], Matcheslist.this.matchType);
                    responseWriter.writeString(Matcheslist.$responseFields[12], Matcheslist.this.statusMessage);
                    responseWriter.writeString(Matcheslist.$responseFields[13], Matcheslist.this.playerOfTheMatch);
                    responseWriter.writeString(Matcheslist.$responseFields[14], Matcheslist.this.playerID);
                    responseWriter.writeString(Matcheslist.$responseFields[15], Matcheslist.this.firstInningsTeamID);
                    responseWriter.writeString(Matcheslist.$responseFields[16], Matcheslist.this.secondInningsTeamID);
                    responseWriter.writeString(Matcheslist.$responseFields[17], Matcheslist.this.thirdInningsTeamID);
                    responseWriter.writeString(Matcheslist.$responseFields[18], Matcheslist.this.fourthInningsTeamID);
                    responseWriter.writeString(Matcheslist.$responseFields[19], Matcheslist.this.currentinningsNo);
                    responseWriter.writeString(Matcheslist.$responseFields[20], Matcheslist.this.currentInningteamID);
                    responseWriter.writeString(Matcheslist.$responseFields[21], Matcheslist.this.currentInningsTeamName);
                    responseWriter.writeString(Matcheslist.$responseFields[22], Matcheslist.this.seriesName);
                    responseWriter.writeString(Matcheslist.$responseFields[23], Matcheslist.this.toss);
                    responseWriter.writeString(Matcheslist.$responseFields[24], Matcheslist.this.seriesID);
                    responseWriter.writeList(Matcheslist.$responseFields[25], Matcheslist.this.matchScore, new ResponseWriter.ListWriter() {

                        @Override
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((MatchScore) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeObject(Matcheslist.$responseFields[26], Matcheslist.this.teamsWinProbability != null ? Matcheslist.this.teamsWinProbability.marshaller() : null);
                    responseWriter.writeBoolean(Matcheslist.$responseFields[27], Matcheslist.this.isCricklyticsAvailable);
                    responseWriter.writeBoolean(Matcheslist.$responseFields[28], Matcheslist.this.isLiveCriclyticsAvailable);
                    responseWriter.writeInt(Matcheslist.$responseFields[29], Matcheslist.this.currentDay);
                    responseWriter.writeInt(Matcheslist.$responseFields[30], Matcheslist.this.currentSession);
                    responseWriter.writeBoolean(Matcheslist.$responseFields[31], Matcheslist.this.playing11Status);
                    responseWriter.writeBoolean(Matcheslist.$responseFields[32], Matcheslist.this.isAbandoned);
                    responseWriter.writeBoolean(Matcheslist.$responseFields[33], Matcheslist.this.probable11Status);
                    responseWriter.writeBoolean(Matcheslist.$responseFields[34], Matcheslist.this.isStatistics);
                    responseWriter.writeBoolean(Matcheslist.$responseFields[35], Matcheslist.this.isPoints);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Matcheslist{__typename=" + this.__typename + ", matchName=" + this.matchName + ", homeTeamShortName=" + this.homeTeamShortName + ", awayTeamShortName=" + this.awayTeamShortName + ", matchResult=" + this.matchResult + ", venue=" + this.venue + ", matchNumber=" + this.matchNumber + ", matchdate=" + this.matchdate + ", matchID=" + this.matchID + ", matchStatus=" + this.matchStatus + ", startDate=" + this.startDate + ", matchType=" + this.matchType + ", statusMessage=" + this.statusMessage + ", playerOfTheMatch=" + this.playerOfTheMatch + ", playerID=" + this.playerID + ", firstInningsTeamID=" + this.firstInningsTeamID + ", secondInningsTeamID=" + this.secondInningsTeamID + ", thirdInningsTeamID=" + this.thirdInningsTeamID + ", fourthInningsTeamID=" + this.fourthInningsTeamID + ", currentinningsNo=" + this.currentinningsNo + ", currentInningteamID=" + this.currentInningteamID + ", currentInningsTeamName=" + this.currentInningsTeamName + ", seriesName=" + this.seriesName + ", toss=" + this.toss + ", seriesID=" + this.seriesID + ", matchScore=" + this.matchScore + ", teamsWinProbability=" + this.teamsWinProbability + ", isCricklyticsAvailable=" + this.isCricklyticsAvailable + ", isLiveCriclyticsAvailable=" + this.isLiveCriclyticsAvailable + ", currentDay=" + this.currentDay + ", currentSession=" + this.currentSession + ", playing11Status=" + this.playing11Status + ", isAbandoned=" + this.isAbandoned + ", probable11Status=" + this.probable11Status + ", isStatistics=" + this.isStatistics + ", isPoints=" + this.isPoints + "}";
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
            Boolean bool;
            Boolean bool2;
            Integer num;
            Integer num2;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5;
            Boolean bool6;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Matcheslist)) {
                return false;
            }
            Matcheslist matcheslist = (Matcheslist) obj;
            if (this.__typename.equals(matcheslist.__typename) && ((str = this.matchName) != null ? str.equals(matcheslist.matchName) : matcheslist.matchName == null) && ((str2 = this.homeTeamShortName) != null ? str2.equals(matcheslist.homeTeamShortName) : matcheslist.homeTeamShortName == null) && ((str3 = this.awayTeamShortName) != null ? str3.equals(matcheslist.awayTeamShortName) : matcheslist.awayTeamShortName == null) && ((str4 = this.matchResult) != null ? str4.equals(matcheslist.matchResult) : matcheslist.matchResult == null) && ((str5 = this.venue) != null ? str5.equals(matcheslist.venue) : matcheslist.venue == null) && ((str6 = this.matchNumber) != null ? str6.equals(matcheslist.matchNumber) : matcheslist.matchNumber == null) && ((str7 = this.matchdate) != null ? str7.equals(matcheslist.matchdate) : matcheslist.matchdate == null) && ((str8 = this.matchID) != null ? str8.equals(matcheslist.matchID) : matcheslist.matchID == null) && ((str9 = this.matchStatus) != null ? str9.equals(matcheslist.matchStatus) : matcheslist.matchStatus == null) && ((str10 = this.startDate) != null ? str10.equals(matcheslist.startDate) : matcheslist.startDate == null) && ((str11 = this.matchType) != null ? str11.equals(matcheslist.matchType) : matcheslist.matchType == null) && ((str12 = this.statusMessage) != null ? str12.equals(matcheslist.statusMessage) : matcheslist.statusMessage == null) && ((str13 = this.playerOfTheMatch) != null ? str13.equals(matcheslist.playerOfTheMatch) : matcheslist.playerOfTheMatch == null) && ((str14 = this.playerID) != null ? str14.equals(matcheslist.playerID) : matcheslist.playerID == null) && ((str15 = this.firstInningsTeamID) != null ? str15.equals(matcheslist.firstInningsTeamID) : matcheslist.firstInningsTeamID == null) && ((str16 = this.secondInningsTeamID) != null ? str16.equals(matcheslist.secondInningsTeamID) : matcheslist.secondInningsTeamID == null) && ((str17 = this.thirdInningsTeamID) != null ? str17.equals(matcheslist.thirdInningsTeamID) : matcheslist.thirdInningsTeamID == null) && ((str18 = this.fourthInningsTeamID) != null ? str18.equals(matcheslist.fourthInningsTeamID) : matcheslist.fourthInningsTeamID == null) && ((str19 = this.currentinningsNo) != null ? str19.equals(matcheslist.currentinningsNo) : matcheslist.currentinningsNo == null) && ((str20 = this.currentInningteamID) != null ? str20.equals(matcheslist.currentInningteamID) : matcheslist.currentInningteamID == null) && ((str21 = this.currentInningsTeamName) != null ? str21.equals(matcheslist.currentInningsTeamName) : matcheslist.currentInningsTeamName == null) && ((str22 = this.seriesName) != null ? str22.equals(matcheslist.seriesName) : matcheslist.seriesName == null) && ((str23 = this.toss) != null ? str23.equals(matcheslist.toss) : matcheslist.toss == null) && ((str24 = this.seriesID) != null ? str24.equals(matcheslist.seriesID) : matcheslist.seriesID == null) && ((list = this.matchScore) != null ? list.equals(matcheslist.matchScore) : matcheslist.matchScore == null) && ((teamsWinProbability2 = this.teamsWinProbability) != null ? teamsWinProbability2.equals(matcheslist.teamsWinProbability) : matcheslist.teamsWinProbability == null) && ((bool = this.isCricklyticsAvailable) != null ? bool.equals(matcheslist.isCricklyticsAvailable) : matcheslist.isCricklyticsAvailable == null) && ((bool2 = this.isLiveCriclyticsAvailable) != null ? bool2.equals(matcheslist.isLiveCriclyticsAvailable) : matcheslist.isLiveCriclyticsAvailable == null) && ((num = this.currentDay) != null ? num.equals(matcheslist.currentDay) : matcheslist.currentDay == null) && ((num2 = this.currentSession) != null ? num2.equals(matcheslist.currentSession) : matcheslist.currentSession == null) && ((bool3 = this.playing11Status) != null ? bool3.equals(matcheslist.playing11Status) : matcheslist.playing11Status == null) && ((bool4 = this.isAbandoned) != null ? bool4.equals(matcheslist.isAbandoned) : matcheslist.isAbandoned == null) && ((bool5 = this.probable11Status) != null ? bool5.equals(matcheslist.probable11Status) : matcheslist.probable11Status == null) && ((bool6 = this.isStatistics) != null ? bool6.equals(matcheslist.isStatistics) : matcheslist.isStatistics == null)) {
                Boolean bool7 = this.isPoints;
                Boolean bool8 = matcheslist.isPoints;
                if (bool7 == null) {
                    if (bool8 == null) {
                        return true;
                    }
                } else if (bool7.equals(bool8)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.matchName;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.homeTeamShortName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.awayTeamShortName;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.matchResult;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.venue;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.matchNumber;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.matchdate;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.matchID;
                int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.matchStatus;
                int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.startDate;
                int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.matchType;
                int hashCode12 = (hashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.statusMessage;
                int hashCode13 = (hashCode12 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.playerOfTheMatch;
                int hashCode14 = (hashCode13 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.playerID;
                int hashCode15 = (hashCode14 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.firstInningsTeamID;
                int hashCode16 = (hashCode15 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.secondInningsTeamID;
                int hashCode17 = (hashCode16 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.thirdInningsTeamID;
                int hashCode18 = (hashCode17 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.fourthInningsTeamID;
                int hashCode19 = (hashCode18 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.currentinningsNo;
                int hashCode20 = (hashCode19 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.currentInningteamID;
                int hashCode21 = (hashCode20 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                String str21 = this.currentInningsTeamName;
                int hashCode22 = (hashCode21 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                String str22 = this.seriesName;
                int hashCode23 = (hashCode22 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
                String str23 = this.toss;
                int hashCode24 = (hashCode23 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
                String str24 = this.seriesID;
                int hashCode25 = (hashCode24 ^ (str24 == null ? 0 : str24.hashCode())) * 1000003;
                List<MatchScore> list = this.matchScore;
                int hashCode26 = (hashCode25 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                TeamsWinProbability teamsWinProbability2 = this.teamsWinProbability;
                int hashCode27 = (hashCode26 ^ (teamsWinProbability2 == null ? 0 : teamsWinProbability2.hashCode())) * 1000003;
                Boolean bool = this.isCricklyticsAvailable;
                int hashCode28 = (hashCode27 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.isLiveCriclyticsAvailable;
                int hashCode29 = (hashCode28 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                Integer num = this.currentDay;
                int hashCode30 = (hashCode29 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.currentSession;
                int hashCode31 = (hashCode30 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Boolean bool3 = this.playing11Status;
                int hashCode32 = (hashCode31 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
                Boolean bool4 = this.isAbandoned;
                int hashCode33 = (hashCode32 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
                Boolean bool5 = this.probable11Status;
                int hashCode34 = (hashCode33 ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003;
                Boolean bool6 = this.isStatistics;
                int hashCode35 = (hashCode34 ^ (bool6 == null ? 0 : bool6.hashCode())) * 1000003;
                Boolean bool7 = this.isPoints;
                if (bool7 != null) {
                    i = bool7.hashCode();
                }
                this.$hashCode = hashCode35 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Matcheslist> {
            final MatchScore.Mapper matchScoreFieldMapper = new MatchScore.Mapper();
            final TeamsWinProbability.Mapper teamsWinProbabilityFieldMapper = new TeamsWinProbability.Mapper();

            @Override
            public Matcheslist map(ResponseReader responseReader) {
                return new Matcheslist(responseReader.readString(Matcheslist.$responseFields[0]), responseReader.readString(Matcheslist.$responseFields[1]), responseReader.readString(Matcheslist.$responseFields[2]), responseReader.readString(Matcheslist.$responseFields[3]), responseReader.readString(Matcheslist.$responseFields[4]), responseReader.readString(Matcheslist.$responseFields[5]), responseReader.readString(Matcheslist.$responseFields[6]), responseReader.readString(Matcheslist.$responseFields[7]), responseReader.readString(Matcheslist.$responseFields[8]), responseReader.readString(Matcheslist.$responseFields[9]), responseReader.readString(Matcheslist.$responseFields[10]), responseReader.readString(Matcheslist.$responseFields[11]), responseReader.readString(Matcheslist.$responseFields[12]), responseReader.readString(Matcheslist.$responseFields[13]), responseReader.readString(Matcheslist.$responseFields[14]), responseReader.readString(Matcheslist.$responseFields[15]), responseReader.readString(Matcheslist.$responseFields[16]), responseReader.readString(Matcheslist.$responseFields[17]), responseReader.readString(Matcheslist.$responseFields[18]), responseReader.readString(Matcheslist.$responseFields[19]), responseReader.readString(Matcheslist.$responseFields[20]), responseReader.readString(Matcheslist.$responseFields[21]), responseReader.readString(Matcheslist.$responseFields[22]), responseReader.readString(Matcheslist.$responseFields[23]), responseReader.readString(Matcheslist.$responseFields[24]), responseReader.readList(Matcheslist.$responseFields[25], new ResponseReader.ListReader<MatchScore>() {

                    @Override
                    public MatchScore read(ResponseReader.ListItemReader listItemReader) {
                        return (MatchScore) listItemReader.readObject(new ResponseReader.ObjectReader<MatchScore>() {


                            @Override
                            public MatchScore read(ResponseReader responseReader) {
                                return Mapper.this.matchScoreFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (TeamsWinProbability) responseReader.readObject(Matcheslist.$responseFields[26], new ResponseReader.ObjectReader<TeamsWinProbability>() {


                    @Override
                    public TeamsWinProbability read(ResponseReader responseReader) {
                        return Mapper.this.teamsWinProbabilityFieldMapper.map(responseReader);
                    }
                }), responseReader.readBoolean(Matcheslist.$responseFields[27]), responseReader.readBoolean(Matcheslist.$responseFields[28]), responseReader.readInt(Matcheslist.$responseFields[29]), responseReader.readInt(Matcheslist.$responseFields[30]), responseReader.readBoolean(Matcheslist.$responseFields[31]), responseReader.readBoolean(Matcheslist.$responseFields[32]), responseReader.readBoolean(Matcheslist.$responseFields[33]), responseReader.readBoolean(Matcheslist.$responseFields[34]), responseReader.readBoolean(Matcheslist.$responseFields[35]));
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
}
