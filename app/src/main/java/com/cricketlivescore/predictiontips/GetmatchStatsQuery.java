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

public final class GetmatchStatsQuery implements Query<GetmatchStatsQuery.Data, GetmatchStatsQuery.Data, GetmatchStatsQuery.Variables> {
    public static final String OPERATION_ID = "b5dfcaee0bd347223345bdfea094fe789e01a608074978f80b2eca3253240cd0";
    public static final OperationName OPERATION_NAME = new OperationName() {


       @Override
        public String name() {
            return "getmatchStats";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query getmatchStats($matchID: String!) {\n  getmatchStats(matchID: $matchID) {\n    __typename\n    matchID\n    awayTeamID\n    homeTeamID\n    format\n    matchStatsArray {\n      __typename\n      teamId\n      shortName\n      fullName\n      highestBattingScore {\n        __typename\n        value\n        percent\n      }\n      totalFours {\n        __typename\n        value\n        percent\n      }\n      totalSix {\n        __typename\n        value\n        percent\n      }\n      runsScoredInBoundaries {\n        __typename\n        value\n        percent\n      }\n      highestPartnership {\n        __typename\n        value\n        percent\n      }\n      totalDotBalls {\n        __typename\n        value\n        percent\n      }\n      runRate {\n        __typename\n        value\n        percent\n      }\n      runRateInPowerplay1_6 {\n        __typename\n        value\n        percent\n      }\n      runRateInPowerplay1_10 {\n        __typename\n        value\n        percent\n      }\n      runRateInPowerplay11_40 {\n        __typename\n        value\n        percent\n      }\n      runRateInPowerplay41_50 {\n        __typename\n        value\n        percent\n      }\n      runRateDeathOver {\n        __typename\n        value\n        percent\n      }\n      highestWickets {\n        __typename\n        value\n        percent\n      }\n      extras {\n        __typename\n        value\n        percent\n      }\n    }\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public GetmatchStatsQuery(String str) {
        Utils.checkNotNull(str, "matchID == null");
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
        private String matchID;

        Builder() {
        }

        public Builder matchID(String str) {
            this.matchID = str;
            return this;
        }

        public GetmatchStatsQuery build() {
            Utils.checkNotNull(this.matchID, "matchID == null");
            return new GetmatchStatsQuery(this.matchID);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String matchID;
        private final transient Map<String, Object> valueMap;

        Variables(String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.matchID = str;
            linkedHashMap.put("matchID", str);
        }

        public String matchID() {
            return this.matchID;
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
                    inputFieldWriter.writeString("matchID", Variables.this.matchID);
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getmatchStats", "getmatchStats", new UnmodifiableMapBuilder(1).put("matchID", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "matchID").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final GetmatchStats getmatchStats;

        public Data(GetmatchStats getmatchStats2) {
            this.getmatchStats = getmatchStats2;
        }

        public GetmatchStats getmatchStats() {
            return this.getmatchStats;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.getmatchStats != null ? Data.this.getmatchStats.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getmatchStats=" + this.getmatchStats + "}";
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
            GetmatchStats getmatchStats2 = this.getmatchStats;
            GetmatchStats getmatchStats3 = ((Data) obj).getmatchStats;
            if (getmatchStats2 != null) {
                return getmatchStats2.equals(getmatchStats3);
            }
            if (getmatchStats3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetmatchStats getmatchStats2 = this.getmatchStats;
                this.$hashCode = 1000003 ^ (getmatchStats2 == null ? 0 : getmatchStats2.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetmatchStats.Mapper getmatchStatsFieldMapper = new GetmatchStats.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((GetmatchStats) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetmatchStats>() {


                    @Override 
                    public GetmatchStats read(ResponseReader responseReader) {
                        return Mapper.this.getmatchStatsFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class GetmatchStats {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchID", "matchID", null, true, Collections.emptyList()), ResponseField.forString("awayTeamID", "awayTeamID", null, true, Collections.emptyList()), ResponseField.forString("homeTeamID", "homeTeamID", null, true, Collections.emptyList()), ResponseField.forString("format", "format", null, true, Collections.emptyList()), ResponseField.forList("matchStatsArray", "matchStatsArray", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String awayTeamID;
        final String format;
        final String homeTeamID;
        final String matchID;
        final List<MatchStatsArray> matchStatsArray;

        public GetmatchStats(String str, String str2, String str3, String str4, String str5, List<MatchStatsArray> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchID = str2;
            this.awayTeamID = str3;
            this.homeTeamID = str4;
            this.format = str5;
            this.matchStatsArray = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchID() {
            return this.matchID;
        }

        public String awayTeamID() {
            return this.awayTeamID;
        }

        public String homeTeamID() {
            return this.homeTeamID;
        }

        public String format() {
            return this.format;
        }

        public List<MatchStatsArray> matchStatsArray() {
            return this.matchStatsArray;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(GetmatchStats.$responseFields[0], GetmatchStats.this.__typename);
                    responseWriter.writeString(GetmatchStats.$responseFields[1], GetmatchStats.this.matchID);
                    responseWriter.writeString(GetmatchStats.$responseFields[2], GetmatchStats.this.awayTeamID);
                    responseWriter.writeString(GetmatchStats.$responseFields[3], GetmatchStats.this.homeTeamID);
                    responseWriter.writeString(GetmatchStats.$responseFields[4], GetmatchStats.this.format);
                    responseWriter.writeList(GetmatchStats.$responseFields[5], GetmatchStats.this.matchStatsArray, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((MatchStatsArray) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetmatchStats{__typename=" + this.__typename + ", matchID=" + this.matchID + ", awayTeamID=" + this.awayTeamID + ", homeTeamID=" + this.homeTeamID + ", format=" + this.format + ", matchStatsArray=" + this.matchStatsArray + "}";
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
            if (!(obj instanceof GetmatchStats)) {
                return false;
            }
            GetmatchStats getmatchStats = (GetmatchStats) obj;
            if (this.__typename.equals(getmatchStats.__typename) && ((str = this.matchID) != null ? str.equals(getmatchStats.matchID) : getmatchStats.matchID == null) && ((str2 = this.awayTeamID) != null ? str2.equals(getmatchStats.awayTeamID) : getmatchStats.awayTeamID == null) && ((str3 = this.homeTeamID) != null ? str3.equals(getmatchStats.homeTeamID) : getmatchStats.homeTeamID == null) && ((str4 = this.format) != null ? str4.equals(getmatchStats.format) : getmatchStats.format == null)) {
                List<MatchStatsArray> list = this.matchStatsArray;
                List<MatchStatsArray> list2 = getmatchStats.matchStatsArray;
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
                String str = this.matchID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.awayTeamID;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.homeTeamID;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.format;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                List<MatchStatsArray> list = this.matchStatsArray;
                if (list != null) {
                    i = list.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<GetmatchStats> {
            final MatchStatsArray.Mapper matchStatsArrayFieldMapper = new MatchStatsArray.Mapper();

            @Override 
            public GetmatchStats map(ResponseReader responseReader) {
                return new GetmatchStats(responseReader.readString(GetmatchStats.$responseFields[0]), responseReader.readString(GetmatchStats.$responseFields[1]), responseReader.readString(GetmatchStats.$responseFields[2]), responseReader.readString(GetmatchStats.$responseFields[3]), responseReader.readString(GetmatchStats.$responseFields[4]), responseReader.readList(GetmatchStats.$responseFields[5], new ResponseReader.ListReader<MatchStatsArray>() {


                    @Override 
                    public MatchStatsArray read(ResponseReader.ListItemReader listItemReader) {
                        return (MatchStatsArray) listItemReader.readObject(new ResponseReader.ObjectReader<MatchStatsArray>() {


                            @Override 
                            public MatchStatsArray read(ResponseReader responseReader) {
                                return Mapper.this.matchStatsArrayFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class MatchStatsArray {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamId", "teamId", null, true, Collections.emptyList()), ResponseField.forString("shortName", "shortName", null, true, Collections.emptyList()), ResponseField.forString("fullName", "fullName", null, true, Collections.emptyList()), ResponseField.forObject("highestBattingScore", "highestBattingScore", null, true, Collections.emptyList()), ResponseField.forObject("totalFours", "totalFours", null, true, Collections.emptyList()), ResponseField.forObject("totalSix", "totalSix", null, true, Collections.emptyList()), ResponseField.forObject("runsScoredInBoundaries", "runsScoredInBoundaries", null, true, Collections.emptyList()), ResponseField.forObject("highestPartnership", "highestPartnership", null, true, Collections.emptyList()), ResponseField.forObject("totalDotBalls", "totalDotBalls", null, true, Collections.emptyList()), ResponseField.forObject("runRate", "runRate", null, true, Collections.emptyList()), ResponseField.forObject("runRateInPowerplay1_6", "runRateInPowerplay1_6", null, true, Collections.emptyList()), ResponseField.forObject("runRateInPowerplay1_10", "runRateInPowerplay1_10", null, true, Collections.emptyList()), ResponseField.forObject("runRateInPowerplay11_40", "runRateInPowerplay11_40", null, true, Collections.emptyList()), ResponseField.forObject("runRateInPowerplay41_50", "runRateInPowerplay41_50", null, true, Collections.emptyList()), ResponseField.forObject("runRateDeathOver", "runRateDeathOver", null, true, Collections.emptyList()), ResponseField.forObject("highestWickets", "highestWickets", null, true, Collections.emptyList()), ResponseField.forObject("extras", "extras", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Extras extras;
        final String fullName;
        final HighestBattingScore highestBattingScore;
        final HighestPartnership highestPartnership;
        final HighestWickets highestWickets;
        final RunRate runRate;
        final RunRateDeathOver runRateDeathOver;
        final RunRateInPowerplay11_40 runRateInPowerplay11_40;
        final RunRateInPowerplay1_10 runRateInPowerplay1_10;
        final RunRateInPowerplay1_6 runRateInPowerplay1_6;
        final RunRateInPowerplay41_50 runRateInPowerplay41_50;
        final RunsScoredInBoundaries runsScoredInBoundaries;
        final String shortName;
        final String teamId;
        final TotalDotBalls totalDotBalls;
        final TotalFours totalFours;
        final TotalSix totalSix;

        public MatchStatsArray(String str, String str2, String str3, String str4, HighestBattingScore highestBattingScore2, TotalFours totalFours2, TotalSix totalSix2, RunsScoredInBoundaries runsScoredInBoundaries2, HighestPartnership highestPartnership2, TotalDotBalls totalDotBalls2, RunRate runRate2, RunRateInPowerplay1_6 runRateInPowerplay1_62, RunRateInPowerplay1_10 runRateInPowerplay1_102, RunRateInPowerplay11_40 runRateInPowerplay11_402, RunRateInPowerplay41_50 runRateInPowerplay41_502, RunRateDeathOver runRateDeathOver2, HighestWickets highestWickets2, Extras extras2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.teamId = str2;
            this.shortName = str3;
            this.fullName = str4;
            this.highestBattingScore = highestBattingScore2;
            this.totalFours = totalFours2;
            this.totalSix = totalSix2;
            this.runsScoredInBoundaries = runsScoredInBoundaries2;
            this.highestPartnership = highestPartnership2;
            this.totalDotBalls = totalDotBalls2;
            this.runRate = runRate2;
            this.runRateInPowerplay1_6 = runRateInPowerplay1_62;
            this.runRateInPowerplay1_10 = runRateInPowerplay1_102;
            this.runRateInPowerplay11_40 = runRateInPowerplay11_402;
            this.runRateInPowerplay41_50 = runRateInPowerplay41_502;
            this.runRateDeathOver = runRateDeathOver2;
            this.highestWickets = highestWickets2;
            this.extras = extras2;
        }

        public String __typename() {
            return this.__typename;
        }

        public String teamId() {
            return this.teamId;
        }

        public String shortName() {
            return this.shortName;
        }

        public String fullName() {
            return this.fullName;
        }

        public HighestBattingScore highestBattingScore() {
            return this.highestBattingScore;
        }

        public TotalFours totalFours() {
            return this.totalFours;
        }

        public TotalSix totalSix() {
            return this.totalSix;
        }

        public RunsScoredInBoundaries runsScoredInBoundaries() {
            return this.runsScoredInBoundaries;
        }

        public HighestPartnership highestPartnership() {
            return this.highestPartnership;
        }

        public TotalDotBalls totalDotBalls() {
            return this.totalDotBalls;
        }

        public RunRate runRate() {
            return this.runRate;
        }

        public RunRateInPowerplay1_6 runRateInPowerplay1_6() {
            return this.runRateInPowerplay1_6;
        }

        public RunRateInPowerplay1_10 runRateInPowerplay1_10() {
            return this.runRateInPowerplay1_10;
        }

        public RunRateInPowerplay11_40 runRateInPowerplay11_40() {
            return this.runRateInPowerplay11_40;
        }

        public RunRateInPowerplay41_50 runRateInPowerplay41_50() {
            return this.runRateInPowerplay41_50;
        }

        public RunRateDeathOver runRateDeathOver() {
            return this.runRateDeathOver;
        }

        public HighestWickets highestWickets() {
            return this.highestWickets;
        }

        public Extras extras() {
            return this.extras;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(MatchStatsArray.$responseFields[0], MatchStatsArray.this.__typename);
                    responseWriter.writeString(MatchStatsArray.$responseFields[1], MatchStatsArray.this.teamId);
                    responseWriter.writeString(MatchStatsArray.$responseFields[2], MatchStatsArray.this.shortName);
                    responseWriter.writeString(MatchStatsArray.$responseFields[3], MatchStatsArray.this.fullName);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(MatchStatsArray.$responseFields[4], MatchStatsArray.this.highestBattingScore != null ? MatchStatsArray.this.highestBattingScore.marshaller() : null);
                    responseWriter.writeObject(MatchStatsArray.$responseFields[5], MatchStatsArray.this.totalFours != null ? MatchStatsArray.this.totalFours.marshaller() : null);
                    responseWriter.writeObject(MatchStatsArray.$responseFields[6], MatchStatsArray.this.totalSix != null ? MatchStatsArray.this.totalSix.marshaller() : null);
                    responseWriter.writeObject(MatchStatsArray.$responseFields[7], MatchStatsArray.this.runsScoredInBoundaries != null ? MatchStatsArray.this.runsScoredInBoundaries.marshaller() : null);
                    responseWriter.writeObject(MatchStatsArray.$responseFields[8], MatchStatsArray.this.highestPartnership != null ? MatchStatsArray.this.highestPartnership.marshaller() : null);
                    responseWriter.writeObject(MatchStatsArray.$responseFields[9], MatchStatsArray.this.totalDotBalls != null ? MatchStatsArray.this.totalDotBalls.marshaller() : null);
                    responseWriter.writeObject(MatchStatsArray.$responseFields[10], MatchStatsArray.this.runRate != null ? MatchStatsArray.this.runRate.marshaller() : null);
                    responseWriter.writeObject(MatchStatsArray.$responseFields[11], MatchStatsArray.this.runRateInPowerplay1_6 != null ? MatchStatsArray.this.runRateInPowerplay1_6.marshaller() : null);
                    responseWriter.writeObject(MatchStatsArray.$responseFields[12], MatchStatsArray.this.runRateInPowerplay1_10 != null ? MatchStatsArray.this.runRateInPowerplay1_10.marshaller() : null);
                    responseWriter.writeObject(MatchStatsArray.$responseFields[13], MatchStatsArray.this.runRateInPowerplay11_40 != null ? MatchStatsArray.this.runRateInPowerplay11_40.marshaller() : null);
                    responseWriter.writeObject(MatchStatsArray.$responseFields[14], MatchStatsArray.this.runRateInPowerplay41_50 != null ? MatchStatsArray.this.runRateInPowerplay41_50.marshaller() : null);
                    responseWriter.writeObject(MatchStatsArray.$responseFields[15], MatchStatsArray.this.runRateDeathOver != null ? MatchStatsArray.this.runRateDeathOver.marshaller() : null);
                    responseWriter.writeObject(MatchStatsArray.$responseFields[16], MatchStatsArray.this.highestWickets != null ? MatchStatsArray.this.highestWickets.marshaller() : null);
                    ResponseField responseField = MatchStatsArray.$responseFields[17];
                    if (MatchStatsArray.this.extras != null) {
                        responseFieldMarshaller = MatchStatsArray.this.extras.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "MatchStatsArray{__typename=" + this.__typename + ", teamId=" + this.teamId + ", shortName=" + this.shortName + ", fullName=" + this.fullName + ", highestBattingScore=" + this.highestBattingScore + ", totalFours=" + this.totalFours + ", totalSix=" + this.totalSix + ", runsScoredInBoundaries=" + this.runsScoredInBoundaries + ", highestPartnership=" + this.highestPartnership + ", totalDotBalls=" + this.totalDotBalls + ", runRate=" + this.runRate + ", runRateInPowerplay1_6=" + this.runRateInPowerplay1_6 + ", runRateInPowerplay1_10=" + this.runRateInPowerplay1_10 + ", runRateInPowerplay11_40=" + this.runRateInPowerplay11_40 + ", runRateInPowerplay41_50=" + this.runRateInPowerplay41_50 + ", runRateDeathOver=" + this.runRateDeathOver + ", highestWickets=" + this.highestWickets + ", extras=" + this.extras + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            HighestBattingScore highestBattingScore2;
            TotalFours totalFours2;
            TotalSix totalSix2;
            RunsScoredInBoundaries runsScoredInBoundaries2;
            HighestPartnership highestPartnership2;
            TotalDotBalls totalDotBalls2;
            RunRate runRate2;
            RunRateInPowerplay1_6 runRateInPowerplay1_62;
            RunRateInPowerplay1_10 runRateInPowerplay1_102;
            RunRateInPowerplay11_40 runRateInPowerplay11_402;
            RunRateInPowerplay41_50 runRateInPowerplay41_502;
            RunRateDeathOver runRateDeathOver2;
            HighestWickets highestWickets2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MatchStatsArray)) {
                return false;
            }
            MatchStatsArray matchStatsArray = (MatchStatsArray) obj;
            if (this.__typename.equals(matchStatsArray.__typename) && ((str = this.teamId) != null ? str.equals(matchStatsArray.teamId) : matchStatsArray.teamId == null) && ((str2 = this.shortName) != null ? str2.equals(matchStatsArray.shortName) : matchStatsArray.shortName == null) && ((str3 = this.fullName) != null ? str3.equals(matchStatsArray.fullName) : matchStatsArray.fullName == null) && ((highestBattingScore2 = this.highestBattingScore) != null ? highestBattingScore2.equals(matchStatsArray.highestBattingScore) : matchStatsArray.highestBattingScore == null) && ((totalFours2 = this.totalFours) != null ? totalFours2.equals(matchStatsArray.totalFours) : matchStatsArray.totalFours == null) && ((totalSix2 = this.totalSix) != null ? totalSix2.equals(matchStatsArray.totalSix) : matchStatsArray.totalSix == null) && ((runsScoredInBoundaries2 = this.runsScoredInBoundaries) != null ? runsScoredInBoundaries2.equals(matchStatsArray.runsScoredInBoundaries) : matchStatsArray.runsScoredInBoundaries == null) && ((highestPartnership2 = this.highestPartnership) != null ? highestPartnership2.equals(matchStatsArray.highestPartnership) : matchStatsArray.highestPartnership == null) && ((totalDotBalls2 = this.totalDotBalls) != null ? totalDotBalls2.equals(matchStatsArray.totalDotBalls) : matchStatsArray.totalDotBalls == null) && ((runRate2 = this.runRate) != null ? runRate2.equals(matchStatsArray.runRate) : matchStatsArray.runRate == null) && ((runRateInPowerplay1_62 = this.runRateInPowerplay1_6) != null ? runRateInPowerplay1_62.equals(matchStatsArray.runRateInPowerplay1_6) : matchStatsArray.runRateInPowerplay1_6 == null) && ((runRateInPowerplay1_102 = this.runRateInPowerplay1_10) != null ? runRateInPowerplay1_102.equals(matchStatsArray.runRateInPowerplay1_10) : matchStatsArray.runRateInPowerplay1_10 == null) && ((runRateInPowerplay11_402 = this.runRateInPowerplay11_40) != null ? runRateInPowerplay11_402.equals(matchStatsArray.runRateInPowerplay11_40) : matchStatsArray.runRateInPowerplay11_40 == null) && ((runRateInPowerplay41_502 = this.runRateInPowerplay41_50) != null ? runRateInPowerplay41_502.equals(matchStatsArray.runRateInPowerplay41_50) : matchStatsArray.runRateInPowerplay41_50 == null) && ((runRateDeathOver2 = this.runRateDeathOver) != null ? runRateDeathOver2.equals(matchStatsArray.runRateDeathOver) : matchStatsArray.runRateDeathOver == null) && ((highestWickets2 = this.highestWickets) != null ? highestWickets2.equals(matchStatsArray.highestWickets) : matchStatsArray.highestWickets == null)) {
                Extras extras2 = this.extras;
                Extras extras3 = matchStatsArray.extras;
                if (extras2 == null) {
                    if (extras3 == null) {
                        return true;
                    }
                } else if (extras2.equals(extras3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.teamId;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.shortName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.fullName;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                HighestBattingScore highestBattingScore2 = this.highestBattingScore;
                int hashCode5 = (hashCode4 ^ (highestBattingScore2 == null ? 0 : highestBattingScore2.hashCode())) * 1000003;
                TotalFours totalFours2 = this.totalFours;
                int hashCode6 = (hashCode5 ^ (totalFours2 == null ? 0 : totalFours2.hashCode())) * 1000003;
                TotalSix totalSix2 = this.totalSix;
                int hashCode7 = (hashCode6 ^ (totalSix2 == null ? 0 : totalSix2.hashCode())) * 1000003;
                RunsScoredInBoundaries runsScoredInBoundaries2 = this.runsScoredInBoundaries;
                int hashCode8 = (hashCode7 ^ (runsScoredInBoundaries2 == null ? 0 : runsScoredInBoundaries2.hashCode())) * 1000003;
                HighestPartnership highestPartnership2 = this.highestPartnership;
                int hashCode9 = (hashCode8 ^ (highestPartnership2 == null ? 0 : highestPartnership2.hashCode())) * 1000003;
                TotalDotBalls totalDotBalls2 = this.totalDotBalls;
                int hashCode10 = (hashCode9 ^ (totalDotBalls2 == null ? 0 : totalDotBalls2.hashCode())) * 1000003;
                RunRate runRate2 = this.runRate;
                int hashCode11 = (hashCode10 ^ (runRate2 == null ? 0 : runRate2.hashCode())) * 1000003;
                RunRateInPowerplay1_6 runRateInPowerplay1_62 = this.runRateInPowerplay1_6;
                int hashCode12 = (hashCode11 ^ (runRateInPowerplay1_62 == null ? 0 : runRateInPowerplay1_62.hashCode())) * 1000003;
                RunRateInPowerplay1_10 runRateInPowerplay1_102 = this.runRateInPowerplay1_10;
                int hashCode13 = (hashCode12 ^ (runRateInPowerplay1_102 == null ? 0 : runRateInPowerplay1_102.hashCode())) * 1000003;
                RunRateInPowerplay11_40 runRateInPowerplay11_402 = this.runRateInPowerplay11_40;
                int hashCode14 = (hashCode13 ^ (runRateInPowerplay11_402 == null ? 0 : runRateInPowerplay11_402.hashCode())) * 1000003;
                RunRateInPowerplay41_50 runRateInPowerplay41_502 = this.runRateInPowerplay41_50;
                int hashCode15 = (hashCode14 ^ (runRateInPowerplay41_502 == null ? 0 : runRateInPowerplay41_502.hashCode())) * 1000003;
                RunRateDeathOver runRateDeathOver2 = this.runRateDeathOver;
                int hashCode16 = (hashCode15 ^ (runRateDeathOver2 == null ? 0 : runRateDeathOver2.hashCode())) * 1000003;
                HighestWickets highestWickets2 = this.highestWickets;
                int hashCode17 = (hashCode16 ^ (highestWickets2 == null ? 0 : highestWickets2.hashCode())) * 1000003;
                Extras extras2 = this.extras;
                if (extras2 != null) {
                    i = extras2.hashCode();
                }
                this.$hashCode = hashCode17 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<MatchStatsArray> {
            final Extras.Mapper extrasFieldMapper = new Extras.Mapper();
            final HighestBattingScore.Mapper highestBattingScoreFieldMapper = new HighestBattingScore.Mapper();
            final HighestPartnership.Mapper highestPartnershipFieldMapper = new HighestPartnership.Mapper();
            final HighestWickets.Mapper highestWicketsFieldMapper = new HighestWickets.Mapper();
            final RunRateDeathOver.Mapper runRateDeathOverFieldMapper = new RunRateDeathOver.Mapper();
            final RunRate.Mapper runRateFieldMapper = new RunRate.Mapper();
            final RunRateInPowerplay11_40.Mapper runRateInPowerplay11_40FieldMapper = new RunRateInPowerplay11_40.Mapper();
            final RunRateInPowerplay1_10.Mapper runRateInPowerplay1_10FieldMapper = new RunRateInPowerplay1_10.Mapper();
            final RunRateInPowerplay1_6.Mapper runRateInPowerplay1_6FieldMapper = new RunRateInPowerplay1_6.Mapper();
            final RunRateInPowerplay41_50.Mapper runRateInPowerplay41_50FieldMapper = new RunRateInPowerplay41_50.Mapper();
            final RunsScoredInBoundaries.Mapper runsScoredInBoundariesFieldMapper = new RunsScoredInBoundaries.Mapper();
            final TotalDotBalls.Mapper totalDotBallsFieldMapper = new TotalDotBalls.Mapper();
            final TotalFours.Mapper totalFoursFieldMapper = new TotalFours.Mapper();
            final TotalSix.Mapper totalSixFieldMapper = new TotalSix.Mapper();

            @Override 
            public MatchStatsArray map(ResponseReader responseReader) {
                return new MatchStatsArray(responseReader.readString(MatchStatsArray.$responseFields[0]), responseReader.readString(MatchStatsArray.$responseFields[1]), responseReader.readString(MatchStatsArray.$responseFields[2]), responseReader.readString(MatchStatsArray.$responseFields[3]), (HighestBattingScore) responseReader.readObject(MatchStatsArray.$responseFields[4], new ResponseReader.ObjectReader<HighestBattingScore>() {


                    @Override 
                    public HighestBattingScore read(ResponseReader responseReader) {
                        return Mapper.this.highestBattingScoreFieldMapper.map(responseReader);
                    }
                }), (TotalFours) responseReader.readObject(MatchStatsArray.$responseFields[5], new ResponseReader.ObjectReader<TotalFours>() {


                    @Override 
                    public TotalFours read(ResponseReader responseReader) {
                        return Mapper.this.totalFoursFieldMapper.map(responseReader);
                    }
                }), (TotalSix) responseReader.readObject(MatchStatsArray.$responseFields[6], new ResponseReader.ObjectReader<TotalSix>() {


                    @Override 
                    public TotalSix read(ResponseReader responseReader) {
                        return Mapper.this.totalSixFieldMapper.map(responseReader);
                    }
                }), (RunsScoredInBoundaries) responseReader.readObject(MatchStatsArray.$responseFields[7], new ResponseReader.ObjectReader<RunsScoredInBoundaries>() {


                    @Override 
                    public RunsScoredInBoundaries read(ResponseReader responseReader) {
                        return Mapper.this.runsScoredInBoundariesFieldMapper.map(responseReader);
                    }
                }), (HighestPartnership) responseReader.readObject(MatchStatsArray.$responseFields[8], new ResponseReader.ObjectReader<HighestPartnership>() {


                    @Override 
                    public HighestPartnership read(ResponseReader responseReader) {
                        return Mapper.this.highestPartnershipFieldMapper.map(responseReader);
                    }
                }), (TotalDotBalls) responseReader.readObject(MatchStatsArray.$responseFields[9], new ResponseReader.ObjectReader<TotalDotBalls>() {


                    @Override 
                    public TotalDotBalls read(ResponseReader responseReader) {
                        return Mapper.this.totalDotBallsFieldMapper.map(responseReader);
                    }
                }), (RunRate) responseReader.readObject(MatchStatsArray.$responseFields[10], new ResponseReader.ObjectReader<RunRate>() {


                    @Override 
                    public RunRate read(ResponseReader responseReader) {
                        return Mapper.this.runRateFieldMapper.map(responseReader);
                    }
                }), (RunRateInPowerplay1_6) responseReader.readObject(MatchStatsArray.$responseFields[11], new ResponseReader.ObjectReader<RunRateInPowerplay1_6>() {


                    @Override 
                    public RunRateInPowerplay1_6 read(ResponseReader responseReader) {
                        return Mapper.this.runRateInPowerplay1_6FieldMapper.map(responseReader);
                    }
                }), (RunRateInPowerplay1_10) responseReader.readObject(MatchStatsArray.$responseFields[12], new ResponseReader.ObjectReader<RunRateInPowerplay1_10>() {


                    @Override 
                    public RunRateInPowerplay1_10 read(ResponseReader responseReader) {
                        return Mapper.this.runRateInPowerplay1_10FieldMapper.map(responseReader);
                    }
                }), (RunRateInPowerplay11_40) responseReader.readObject(MatchStatsArray.$responseFields[13], new ResponseReader.ObjectReader<RunRateInPowerplay11_40>() {


                    @Override 
                    public RunRateInPowerplay11_40 read(ResponseReader responseReader) {
                        return Mapper.this.runRateInPowerplay11_40FieldMapper.map(responseReader);
                    }
                }), (RunRateInPowerplay41_50) responseReader.readObject(MatchStatsArray.$responseFields[14], new ResponseReader.ObjectReader<RunRateInPowerplay41_50>() {


                    @Override 
                    public RunRateInPowerplay41_50 read(ResponseReader responseReader) {
                        return Mapper.this.runRateInPowerplay41_50FieldMapper.map(responseReader);
                    }
                }), (RunRateDeathOver) responseReader.readObject(MatchStatsArray.$responseFields[15], new ResponseReader.ObjectReader<RunRateDeathOver>() {


                    @Override 
                    public RunRateDeathOver read(ResponseReader responseReader) {
                        return Mapper.this.runRateDeathOverFieldMapper.map(responseReader);
                    }
                }), (HighestWickets) responseReader.readObject(MatchStatsArray.$responseFields[16], new ResponseReader.ObjectReader<HighestWickets>() {


                    @Override 
                    public HighestWickets read(ResponseReader responseReader) {
                        return Mapper.this.highestWicketsFieldMapper.map(responseReader);
                    }
                }), (Extras) responseReader.readObject(MatchStatsArray.$responseFields[17], new ResponseReader.ObjectReader<Extras>() {


                    @Override 
                    public Extras read(ResponseReader responseReader) {
                        return Mapper.this.extrasFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class HighestBattingScore {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("value", "value", null, true, Collections.emptyList()), ResponseField.forDouble("percent", "percent", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double percent;
        final String value;

        public HighestBattingScore(String str, String str2, Double d) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.value = str2;
            this.percent = d;
        }

        public String __typename() {
            return this.__typename;
        }

        public String value() {
            return this.value;
        }

        public Double percent() {
            return this.percent;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(HighestBattingScore.$responseFields[0], HighestBattingScore.this.__typename);
                    responseWriter.writeString(HighestBattingScore.$responseFields[1], HighestBattingScore.this.value);
                    responseWriter.writeDouble(HighestBattingScore.$responseFields[2], HighestBattingScore.this.percent);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "HighestBattingScore{__typename=" + this.__typename + ", value=" + this.value + ", percent=" + this.percent + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HighestBattingScore)) {
                return false;
            }
            HighestBattingScore highestBattingScore = (HighestBattingScore) obj;
            if (this.__typename.equals(highestBattingScore.__typename) && ((str = this.value) != null ? str.equals(highestBattingScore.value) : highestBattingScore.value == null)) {
                Double d = this.percent;
                Double d2 = highestBattingScore.percent;
                if (d == null) {
                    if (d2 == null) {
                        return true;
                    }
                } else if (d.equals(d2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.value;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Double d = this.percent;
                if (d != null) {
                    i = d.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<HighestBattingScore> {
            @Override 
            public HighestBattingScore map(ResponseReader responseReader) {
                return new HighestBattingScore(responseReader.readString(HighestBattingScore.$responseFields[0]), responseReader.readString(HighestBattingScore.$responseFields[1]), responseReader.readDouble(HighestBattingScore.$responseFields[2]));
            }
        }
    }

    public static class TotalFours {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("value", "value", null, true, Collections.emptyList()), ResponseField.forDouble("percent", "percent", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double percent;
        final String value;

        public TotalFours(String str, String str2, Double d) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.value = str2;
            this.percent = d;
        }

        public String __typename() {
            return this.__typename;
        }

        public String value() {
            return this.value;
        }

        public Double percent() {
            return this.percent;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TotalFours.$responseFields[0], TotalFours.this.__typename);
                    responseWriter.writeString(TotalFours.$responseFields[1], TotalFours.this.value);
                    responseWriter.writeDouble(TotalFours.$responseFields[2], TotalFours.this.percent);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TotalFours{__typename=" + this.__typename + ", value=" + this.value + ", percent=" + this.percent + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TotalFours)) {
                return false;
            }
            TotalFours totalFours = (TotalFours) obj;
            if (this.__typename.equals(totalFours.__typename) && ((str = this.value) != null ? str.equals(totalFours.value) : totalFours.value == null)) {
                Double d = this.percent;
                Double d2 = totalFours.percent;
                if (d == null) {
                    if (d2 == null) {
                        return true;
                    }
                } else if (d.equals(d2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.value;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Double d = this.percent;
                if (d != null) {
                    i = d.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TotalFours> {
            @Override 
            public TotalFours map(ResponseReader responseReader) {
                return new TotalFours(responseReader.readString(TotalFours.$responseFields[0]), responseReader.readString(TotalFours.$responseFields[1]), responseReader.readDouble(TotalFours.$responseFields[2]));
            }
        }
    }

    public static class TotalSix {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("value", "value", null, true, Collections.emptyList()), ResponseField.forDouble("percent", "percent", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double percent;
        final String value;

        public TotalSix(String str, String str2, Double d) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.value = str2;
            this.percent = d;
        }

        public String __typename() {
            return this.__typename;
        }

        public String value() {
            return this.value;
        }

        public Double percent() {
            return this.percent;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TotalSix.$responseFields[0], TotalSix.this.__typename);
                    responseWriter.writeString(TotalSix.$responseFields[1], TotalSix.this.value);
                    responseWriter.writeDouble(TotalSix.$responseFields[2], TotalSix.this.percent);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TotalSix{__typename=" + this.__typename + ", value=" + this.value + ", percent=" + this.percent + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TotalSix)) {
                return false;
            }
            TotalSix totalSix = (TotalSix) obj;
            if (this.__typename.equals(totalSix.__typename) && ((str = this.value) != null ? str.equals(totalSix.value) : totalSix.value == null)) {
                Double d = this.percent;
                Double d2 = totalSix.percent;
                if (d == null) {
                    if (d2 == null) {
                        return true;
                    }
                } else if (d.equals(d2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.value;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Double d = this.percent;
                if (d != null) {
                    i = d.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TotalSix> {
            @Override 
            public TotalSix map(ResponseReader responseReader) {
                return new TotalSix(responseReader.readString(TotalSix.$responseFields[0]), responseReader.readString(TotalSix.$responseFields[1]), responseReader.readDouble(TotalSix.$responseFields[2]));
            }
        }
    }

    public static class RunsScoredInBoundaries {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("value", "value", null, true, Collections.emptyList()), ResponseField.forDouble("percent", "percent", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double percent;
        final String value;

        public RunsScoredInBoundaries(String str, String str2, Double d) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.value = str2;
            this.percent = d;
        }

        public String __typename() {
            return this.__typename;
        }

        public String value() {
            return this.value;
        }

        public Double percent() {
            return this.percent;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(RunsScoredInBoundaries.$responseFields[0], RunsScoredInBoundaries.this.__typename);
                    responseWriter.writeString(RunsScoredInBoundaries.$responseFields[1], RunsScoredInBoundaries.this.value);
                    responseWriter.writeDouble(RunsScoredInBoundaries.$responseFields[2], RunsScoredInBoundaries.this.percent);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "RunsScoredInBoundaries{__typename=" + this.__typename + ", value=" + this.value + ", percent=" + this.percent + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RunsScoredInBoundaries)) {
                return false;
            }
            RunsScoredInBoundaries runsScoredInBoundaries = (RunsScoredInBoundaries) obj;
            if (this.__typename.equals(runsScoredInBoundaries.__typename) && ((str = this.value) != null ? str.equals(runsScoredInBoundaries.value) : runsScoredInBoundaries.value == null)) {
                Double d = this.percent;
                Double d2 = runsScoredInBoundaries.percent;
                if (d == null) {
                    if (d2 == null) {
                        return true;
                    }
                } else if (d.equals(d2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.value;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Double d = this.percent;
                if (d != null) {
                    i = d.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<RunsScoredInBoundaries> {
            @Override 
            public RunsScoredInBoundaries map(ResponseReader responseReader) {
                return new RunsScoredInBoundaries(responseReader.readString(RunsScoredInBoundaries.$responseFields[0]), responseReader.readString(RunsScoredInBoundaries.$responseFields[1]), responseReader.readDouble(RunsScoredInBoundaries.$responseFields[2]));
            }
        }
    }

    public static class HighestPartnership {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("value", "value", null, true, Collections.emptyList()), ResponseField.forDouble("percent", "percent", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double percent;
        final String value;

        public HighestPartnership(String str, String str2, Double d) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.value = str2;
            this.percent = d;
        }

        public String __typename() {
            return this.__typename;
        }

        public String value() {
            return this.value;
        }

        public Double percent() {
            return this.percent;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(HighestPartnership.$responseFields[0], HighestPartnership.this.__typename);
                    responseWriter.writeString(HighestPartnership.$responseFields[1], HighestPartnership.this.value);
                    responseWriter.writeDouble(HighestPartnership.$responseFields[2], HighestPartnership.this.percent);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "HighestPartnership{__typename=" + this.__typename + ", value=" + this.value + ", percent=" + this.percent + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HighestPartnership)) {
                return false;
            }
            HighestPartnership highestPartnership = (HighestPartnership) obj;
            if (this.__typename.equals(highestPartnership.__typename) && ((str = this.value) != null ? str.equals(highestPartnership.value) : highestPartnership.value == null)) {
                Double d = this.percent;
                Double d2 = highestPartnership.percent;
                if (d == null) {
                    if (d2 == null) {
                        return true;
                    }
                } else if (d.equals(d2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.value;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Double d = this.percent;
                if (d != null) {
                    i = d.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<HighestPartnership> {
            @Override 
            public HighestPartnership map(ResponseReader responseReader) {
                return new HighestPartnership(responseReader.readString(HighestPartnership.$responseFields[0]), responseReader.readString(HighestPartnership.$responseFields[1]), responseReader.readDouble(HighestPartnership.$responseFields[2]));
            }
        }
    }

    public static class TotalDotBalls {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("value", "value", null, true, Collections.emptyList()), ResponseField.forDouble("percent", "percent", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double percent;
        final String value;

        public TotalDotBalls(String str, String str2, Double d) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.value = str2;
            this.percent = d;
        }

        public String __typename() {
            return this.__typename;
        }

        public String value() {
            return this.value;
        }

        public Double percent() {
            return this.percent;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TotalDotBalls.$responseFields[0], TotalDotBalls.this.__typename);
                    responseWriter.writeString(TotalDotBalls.$responseFields[1], TotalDotBalls.this.value);
                    responseWriter.writeDouble(TotalDotBalls.$responseFields[2], TotalDotBalls.this.percent);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TotalDotBalls{__typename=" + this.__typename + ", value=" + this.value + ", percent=" + this.percent + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TotalDotBalls)) {
                return false;
            }
            TotalDotBalls totalDotBalls = (TotalDotBalls) obj;
            if (this.__typename.equals(totalDotBalls.__typename) && ((str = this.value) != null ? str.equals(totalDotBalls.value) : totalDotBalls.value == null)) {
                Double d = this.percent;
                Double d2 = totalDotBalls.percent;
                if (d == null) {
                    if (d2 == null) {
                        return true;
                    }
                } else if (d.equals(d2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.value;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Double d = this.percent;
                if (d != null) {
                    i = d.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TotalDotBalls> {
            @Override 
            public TotalDotBalls map(ResponseReader responseReader) {
                return new TotalDotBalls(responseReader.readString(TotalDotBalls.$responseFields[0]), responseReader.readString(TotalDotBalls.$responseFields[1]), responseReader.readDouble(TotalDotBalls.$responseFields[2]));
            }
        }
    }

    public static class RunRate {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("value", "value", null, true, Collections.emptyList()), ResponseField.forDouble("percent", "percent", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double percent;
        final String value;

        public RunRate(String str, String str2, Double d) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.value = str2;
            this.percent = d;
        }

        public String __typename() {
            return this.__typename;
        }

        public String value() {
            return this.value;
        }

        public Double percent() {
            return this.percent;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(RunRate.$responseFields[0], RunRate.this.__typename);
                    responseWriter.writeString(RunRate.$responseFields[1], RunRate.this.value);
                    responseWriter.writeDouble(RunRate.$responseFields[2], RunRate.this.percent);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "RunRate{__typename=" + this.__typename + ", value=" + this.value + ", percent=" + this.percent + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RunRate)) {
                return false;
            }
            RunRate runRate = (RunRate) obj;
            if (this.__typename.equals(runRate.__typename) && ((str = this.value) != null ? str.equals(runRate.value) : runRate.value == null)) {
                Double d = this.percent;
                Double d2 = runRate.percent;
                if (d == null) {
                    if (d2 == null) {
                        return true;
                    }
                } else if (d.equals(d2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.value;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Double d = this.percent;
                if (d != null) {
                    i = d.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<RunRate> {
            @Override 
            public RunRate map(ResponseReader responseReader) {
                return new RunRate(responseReader.readString(RunRate.$responseFields[0]), responseReader.readString(RunRate.$responseFields[1]), responseReader.readDouble(RunRate.$responseFields[2]));
            }
        }
    }

    public static class RunRateInPowerplay1_6 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("value", "value", null, true, Collections.emptyList()), ResponseField.forDouble("percent", "percent", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double percent;
        final String value;

        public RunRateInPowerplay1_6(String str, String str2, Double d) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.value = str2;
            this.percent = d;
        }

        public String __typename() {
            return this.__typename;
        }

        public String value() {
            return this.value;
        }

        public Double percent() {
            return this.percent;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(RunRateInPowerplay1_6.$responseFields[0], RunRateInPowerplay1_6.this.__typename);
                    responseWriter.writeString(RunRateInPowerplay1_6.$responseFields[1], RunRateInPowerplay1_6.this.value);
                    responseWriter.writeDouble(RunRateInPowerplay1_6.$responseFields[2], RunRateInPowerplay1_6.this.percent);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "RunRateInPowerplay1_6{__typename=" + this.__typename + ", value=" + this.value + ", percent=" + this.percent + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RunRateInPowerplay1_6)) {
                return false;
            }
            RunRateInPowerplay1_6 runRateInPowerplay1_6 = (RunRateInPowerplay1_6) obj;
            if (this.__typename.equals(runRateInPowerplay1_6.__typename) && ((str = this.value) != null ? str.equals(runRateInPowerplay1_6.value) : runRateInPowerplay1_6.value == null)) {
                Double d = this.percent;
                Double d2 = runRateInPowerplay1_6.percent;
                if (d == null) {
                    if (d2 == null) {
                        return true;
                    }
                } else if (d.equals(d2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.value;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Double d = this.percent;
                if (d != null) {
                    i = d.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<RunRateInPowerplay1_6> {
            @Override 
            public RunRateInPowerplay1_6 map(ResponseReader responseReader) {
                return new RunRateInPowerplay1_6(responseReader.readString(RunRateInPowerplay1_6.$responseFields[0]), responseReader.readString(RunRateInPowerplay1_6.$responseFields[1]), responseReader.readDouble(RunRateInPowerplay1_6.$responseFields[2]));
            }
        }
    }

    public static class RunRateInPowerplay1_10 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("value", "value", null, true, Collections.emptyList()), ResponseField.forDouble("percent", "percent", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double percent;
        final String value;

        public RunRateInPowerplay1_10(String str, String str2, Double d) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.value = str2;
            this.percent = d;
        }

        public String __typename() {
            return this.__typename;
        }

        public String value() {
            return this.value;
        }

        public Double percent() {
            return this.percent;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(RunRateInPowerplay1_10.$responseFields[0], RunRateInPowerplay1_10.this.__typename);
                    responseWriter.writeString(RunRateInPowerplay1_10.$responseFields[1], RunRateInPowerplay1_10.this.value);
                    responseWriter.writeDouble(RunRateInPowerplay1_10.$responseFields[2], RunRateInPowerplay1_10.this.percent);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "RunRateInPowerplay1_10{__typename=" + this.__typename + ", value=" + this.value + ", percent=" + this.percent + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RunRateInPowerplay1_10)) {
                return false;
            }
            RunRateInPowerplay1_10 runRateInPowerplay1_10 = (RunRateInPowerplay1_10) obj;
            if (this.__typename.equals(runRateInPowerplay1_10.__typename) && ((str = this.value) != null ? str.equals(runRateInPowerplay1_10.value) : runRateInPowerplay1_10.value == null)) {
                Double d = this.percent;
                Double d2 = runRateInPowerplay1_10.percent;
                if (d == null) {
                    if (d2 == null) {
                        return true;
                    }
                } else if (d.equals(d2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.value;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Double d = this.percent;
                if (d != null) {
                    i = d.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<RunRateInPowerplay1_10> {
            @Override 
            public RunRateInPowerplay1_10 map(ResponseReader responseReader) {
                return new RunRateInPowerplay1_10(responseReader.readString(RunRateInPowerplay1_10.$responseFields[0]), responseReader.readString(RunRateInPowerplay1_10.$responseFields[1]), responseReader.readDouble(RunRateInPowerplay1_10.$responseFields[2]));
            }
        }
    }

    public static class RunRateInPowerplay11_40 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("value", "value", null, true, Collections.emptyList()), ResponseField.forDouble("percent", "percent", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double percent;
        final String value;

        public RunRateInPowerplay11_40(String str, String str2, Double d) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.value = str2;
            this.percent = d;
        }

        public String __typename() {
            return this.__typename;
        }

        public String value() {
            return this.value;
        }

        public Double percent() {
            return this.percent;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(RunRateInPowerplay11_40.$responseFields[0], RunRateInPowerplay11_40.this.__typename);
                    responseWriter.writeString(RunRateInPowerplay11_40.$responseFields[1], RunRateInPowerplay11_40.this.value);
                    responseWriter.writeDouble(RunRateInPowerplay11_40.$responseFields[2], RunRateInPowerplay11_40.this.percent);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "RunRateInPowerplay11_40{__typename=" + this.__typename + ", value=" + this.value + ", percent=" + this.percent + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RunRateInPowerplay11_40)) {
                return false;
            }
            RunRateInPowerplay11_40 runRateInPowerplay11_40 = (RunRateInPowerplay11_40) obj;
            if (this.__typename.equals(runRateInPowerplay11_40.__typename) && ((str = this.value) != null ? str.equals(runRateInPowerplay11_40.value) : runRateInPowerplay11_40.value == null)) {
                Double d = this.percent;
                Double d2 = runRateInPowerplay11_40.percent;
                if (d == null) {
                    if (d2 == null) {
                        return true;
                    }
                } else if (d.equals(d2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.value;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Double d = this.percent;
                if (d != null) {
                    i = d.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<RunRateInPowerplay11_40> {
            @Override 
            public RunRateInPowerplay11_40 map(ResponseReader responseReader) {
                return new RunRateInPowerplay11_40(responseReader.readString(RunRateInPowerplay11_40.$responseFields[0]), responseReader.readString(RunRateInPowerplay11_40.$responseFields[1]), responseReader.readDouble(RunRateInPowerplay11_40.$responseFields[2]));
            }
        }
    }

    public static class RunRateInPowerplay41_50 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("value", "value", null, true, Collections.emptyList()), ResponseField.forDouble("percent", "percent", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double percent;
        final String value;

        public RunRateInPowerplay41_50(String str, String str2, Double d) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.value = str2;
            this.percent = d;
        }

        public String __typename() {
            return this.__typename;
        }

        public String value() {
            return this.value;
        }

        public Double percent() {
            return this.percent;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(RunRateInPowerplay41_50.$responseFields[0], RunRateInPowerplay41_50.this.__typename);
                    responseWriter.writeString(RunRateInPowerplay41_50.$responseFields[1], RunRateInPowerplay41_50.this.value);
                    responseWriter.writeDouble(RunRateInPowerplay41_50.$responseFields[2], RunRateInPowerplay41_50.this.percent);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "RunRateInPowerplay41_50{__typename=" + this.__typename + ", value=" + this.value + ", percent=" + this.percent + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RunRateInPowerplay41_50)) {
                return false;
            }
            RunRateInPowerplay41_50 runRateInPowerplay41_50 = (RunRateInPowerplay41_50) obj;
            if (this.__typename.equals(runRateInPowerplay41_50.__typename) && ((str = this.value) != null ? str.equals(runRateInPowerplay41_50.value) : runRateInPowerplay41_50.value == null)) {
                Double d = this.percent;
                Double d2 = runRateInPowerplay41_50.percent;
                if (d == null) {
                    if (d2 == null) {
                        return true;
                    }
                } else if (d.equals(d2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.value;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Double d = this.percent;
                if (d != null) {
                    i = d.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<RunRateInPowerplay41_50> {
            @Override 
            public RunRateInPowerplay41_50 map(ResponseReader responseReader) {
                return new RunRateInPowerplay41_50(responseReader.readString(RunRateInPowerplay41_50.$responseFields[0]), responseReader.readString(RunRateInPowerplay41_50.$responseFields[1]), responseReader.readDouble(RunRateInPowerplay41_50.$responseFields[2]));
            }
        }
    }

    public static class RunRateDeathOver {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("value", "value", null, true, Collections.emptyList()), ResponseField.forDouble("percent", "percent", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double percent;
        final String value;

        public RunRateDeathOver(String str, String str2, Double d) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.value = str2;
            this.percent = d;
        }

        public String __typename() {
            return this.__typename;
        }

        public String value() {
            return this.value;
        }

        public Double percent() {
            return this.percent;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(RunRateDeathOver.$responseFields[0], RunRateDeathOver.this.__typename);
                    responseWriter.writeString(RunRateDeathOver.$responseFields[1], RunRateDeathOver.this.value);
                    responseWriter.writeDouble(RunRateDeathOver.$responseFields[2], RunRateDeathOver.this.percent);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "RunRateDeathOver{__typename=" + this.__typename + ", value=" + this.value + ", percent=" + this.percent + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RunRateDeathOver)) {
                return false;
            }
            RunRateDeathOver runRateDeathOver = (RunRateDeathOver) obj;
            if (this.__typename.equals(runRateDeathOver.__typename) && ((str = this.value) != null ? str.equals(runRateDeathOver.value) : runRateDeathOver.value == null)) {
                Double d = this.percent;
                Double d2 = runRateDeathOver.percent;
                if (d == null) {
                    if (d2 == null) {
                        return true;
                    }
                } else if (d.equals(d2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.value;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Double d = this.percent;
                if (d != null) {
                    i = d.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<RunRateDeathOver> {
            @Override 
            public RunRateDeathOver map(ResponseReader responseReader) {
                return new RunRateDeathOver(responseReader.readString(RunRateDeathOver.$responseFields[0]), responseReader.readString(RunRateDeathOver.$responseFields[1]), responseReader.readDouble(RunRateDeathOver.$responseFields[2]));
            }
        }
    }

    public static class HighestWickets {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("value", "value", null, true, Collections.emptyList()), ResponseField.forDouble("percent", "percent", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double percent;
        final String value;

        public HighestWickets(String str, String str2, Double d) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.value = str2;
            this.percent = d;
        }

        public String __typename() {
            return this.__typename;
        }

        public String value() {
            return this.value;
        }

        public Double percent() {
            return this.percent;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(HighestWickets.$responseFields[0], HighestWickets.this.__typename);
                    responseWriter.writeString(HighestWickets.$responseFields[1], HighestWickets.this.value);
                    responseWriter.writeDouble(HighestWickets.$responseFields[2], HighestWickets.this.percent);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "HighestWickets{__typename=" + this.__typename + ", value=" + this.value + ", percent=" + this.percent + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HighestWickets)) {
                return false;
            }
            HighestWickets highestWickets = (HighestWickets) obj;
            if (this.__typename.equals(highestWickets.__typename) && ((str = this.value) != null ? str.equals(highestWickets.value) : highestWickets.value == null)) {
                Double d = this.percent;
                Double d2 = highestWickets.percent;
                if (d == null) {
                    if (d2 == null) {
                        return true;
                    }
                } else if (d.equals(d2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.value;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Double d = this.percent;
                if (d != null) {
                    i = d.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<HighestWickets> {
            @Override 
            public HighestWickets map(ResponseReader responseReader) {
                return new HighestWickets(responseReader.readString(HighestWickets.$responseFields[0]), responseReader.readString(HighestWickets.$responseFields[1]), responseReader.readDouble(HighestWickets.$responseFields[2]));
            }
        }
    }

    public static class Extras {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("value", "value", null, true, Collections.emptyList()), ResponseField.forDouble("percent", "percent", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double percent;
        final String value;

        public Extras(String str, String str2, Double d) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.value = str2;
            this.percent = d;
        }

        public String __typename() {
            return this.__typename;
        }

        public String value() {
            return this.value;
        }

        public Double percent() {
            return this.percent;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Extras.$responseFields[0], Extras.this.__typename);
                    responseWriter.writeString(Extras.$responseFields[1], Extras.this.value);
                    responseWriter.writeDouble(Extras.$responseFields[2], Extras.this.percent);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Extras{__typename=" + this.__typename + ", value=" + this.value + ", percent=" + this.percent + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Extras)) {
                return false;
            }
            Extras extras = (Extras) obj;
            if (this.__typename.equals(extras.__typename) && ((str = this.value) != null ? str.equals(extras.value) : extras.value == null)) {
                Double d = this.percent;
                Double d2 = extras.percent;
                if (d == null) {
                    if (d2 == null) {
                        return true;
                    }
                } else if (d.equals(d2)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.value;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Double d = this.percent;
                if (d != null) {
                    i = d.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Extras> {
            @Override 
            public Extras map(ResponseReader responseReader) {
                return new Extras(responseReader.readString(Extras.$responseFields[0]), responseReader.readString(Extras.$responseFields[1]), responseReader.readDouble(Extras.$responseFields[2]));
            }
        }
    }
}
