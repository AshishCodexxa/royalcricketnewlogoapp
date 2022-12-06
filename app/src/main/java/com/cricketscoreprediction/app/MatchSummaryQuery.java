package com.cricketscoreprediction.app;

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

public final class MatchSummaryQuery implements Query<MatchSummaryQuery.Data, MatchSummaryQuery.Data, MatchSummaryQuery.Variables> {
    public static final String OPERATION_ID = "50287c8ccba07771bc0de9c0dc95a1b552c3c12ad32f5170461b1fde5c792a3a";
    public static final OperationName OPERATION_NAME = new OperationName() {


       @Override
        public String name() {
            return "matchSummary";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query matchSummary($matchID: String!, $status: String!) {\n  matchSummary(matchID: $matchID, status: $status) {\n    __typename\n    bestBatsman {\n      __typename\n      playerID\n      playerName\n      playerNameHindi\n      playerTeam\n      playerTeamID\n      totalBattingPoints\n      totalPoints\n      battingStatsList {\n        __typename\n        runs\n        fours\n        sixes\n        balls\n        strikeRate\n        isNotOut\n      }\n      totalBowlingPoints\n      totalFieldingPoints\n      bowlingStatsList {\n        __typename\n        wickets\n        runsConceded\n        economyRate\n        overs\n      }\n      fieldingStatsList {\n        __typename\n        runsOuts\n        catches\n        stumps\n      }\n      inningWisePoints {\n        __typename\n        inningWiseBattingPoints\n        inningWiseBowlingPoints\n        inningWiseFieldingPoints\n      }\n    }\n    bestBowler {\n      __typename\n      playerID\n      playerName\n      playerNameHindi\n      playerTeam\n      playerTeamID\n      totalBattingPoints\n      totalPoints\n      battingStatsList {\n        __typename\n        runs\n        fours\n        sixes\n        balls\n        strikeRate\n        isNotOut\n      }\n      totalBowlingPoints\n      totalFieldingPoints\n      bowlingStatsList {\n        __typename\n        wickets\n        runsConceded\n        economyRate\n        overs\n      }\n      fieldingStatsList {\n        __typename\n        runsOuts\n        catches\n        stumps\n      }\n      inningWisePoints {\n        __typename\n        inningWiseBattingPoints\n        inningWiseBowlingPoints\n        inningWiseFieldingPoints\n      }\n    }\n    homeTeamData {\n      __typename\n      batsmanSummary1 {\n        __typename\n        topBatsman {\n          __typename\n          playerID\n          playerName\n          playerNameHindi\n          playerTeam\n          playerTeamID\n          totalBattingPoints\n          totalPoints\n          battingStatsList {\n            __typename\n            runs\n            fours\n            sixes\n            balls\n            strikeRate\n            isNotOut\n          }\n          totalBowlingPoints\n          totalFieldingPoints\n          bowlingStatsList {\n            __typename\n            wickets\n            runsConceded\n            economyRate\n            overs\n          }\n          fieldingStatsList {\n            __typename\n            runsOuts\n            catches\n            stumps\n          }\n          inningWisePoints {\n            __typename\n            inningWiseBattingPoints\n            inningWiseBowlingPoints\n            inningWiseFieldingPoints\n          }\n        }\n        runnerBatsman {\n          __typename\n          playerID\n          playerName\n          playerNameHindi\n          playerTeam\n          playerTeamID\n          totalBattingPoints\n          totalPoints\n          battingStatsList {\n            __typename\n            runs\n            fours\n            sixes\n            balls\n            strikeRate\n            isNotOut\n          }\n          totalBowlingPoints\n          totalFieldingPoints\n          bowlingStatsList {\n            __typename\n            wickets\n            runsConceded\n            economyRate\n            overs\n          }\n          fieldingStatsList {\n            __typename\n            runsOuts\n            catches\n            stumps\n          }\n          inningWisePoints {\n            __typename\n            inningWiseBattingPoints\n            inningWiseBowlingPoints\n            inningWiseFieldingPoints\n          }\n        }\n      }\n      batsmanSummary2 {\n        __typename\n        topBatsman {\n          __typename\n          playerID\n          playerName\n          playerNameHindi\n          playerTeam\n          playerTeamID\n          totalBattingPoints\n          totalPoints\n          battingStatsList {\n            __typename\n            runs\n            fours\n            sixes\n            balls\n            strikeRate\n            isNotOut\n          }\n          totalBowlingPoints\n          totalFieldingPoints\n          bowlingStatsList {\n            __typename\n            wickets\n            runsConceded\n            economyRate\n            overs\n          }\n          fieldingStatsList {\n            __typename\n            runsOuts\n            catches\n            stumps\n          }\n          inningWisePoints {\n            __typename\n            inningWiseBattingPoints\n            inningWiseBowlingPoints\n            inningWiseFieldingPoints\n          }\n        }\n        runnerBatsman {\n          __typename\n          playerID\n          playerName\n          playerNameHindi\n          playerTeam\n          playerTeamID\n          totalBattingPoints\n          totalPoints\n          battingStatsList {\n            __typename\n            runs\n            fours\n            sixes\n            balls\n            strikeRate\n            isNotOut\n          }\n          totalBowlingPoints\n          totalFieldingPoints\n          bowlingStatsList {\n            __typename\n            wickets\n            runsConceded\n            economyRate\n            overs\n          }\n          fieldingStatsList {\n            __typename\n            runsOuts\n            catches\n            stumps\n          }\n          inningWisePoints {\n            __typename\n            inningWiseBattingPoints\n            inningWiseBowlingPoints\n            inningWiseFieldingPoints\n          }\n        }\n      }\n      bowlerSummary1 {\n        __typename\n        topBowler {\n          __typename\n          playerID\n          playerName\n          playerNameHindi\n          playerTeam\n          playerTeamID\n          totalBattingPoints\n          totalPoints\n          battingStatsList {\n            __typename\n            runs\n            fours\n            sixes\n            balls\n            strikeRate\n            isNotOut\n          }\n          totalBowlingPoints\n          totalFieldingPoints\n          bowlingStatsList {\n            __typename\n            wickets\n            runsConceded\n            economyRate\n            overs\n          }\n          fieldingStatsList {\n            __typename\n            runsOuts\n            catches\n            stumps\n          }\n          inningWisePoints {\n            __typename\n            inningWiseBattingPoints\n            inningWiseBowlingPoints\n            inningWiseFieldingPoints\n          }\n        }\n        runnerBowler {\n          __typename\n          playerID\n          playerName\n          playerNameHindi\n          playerTeam\n          playerTeamID\n          totalBattingPoints\n          totalPoints\n          battingStatsList {\n            __typename\n            runs\n            fours\n            sixes\n            balls\n            strikeRate\n            isNotOut\n          }\n          totalBowlingPoints\n          totalFieldingPoints\n          bowlingStatsList {\n            __typename\n            wickets\n            runsConceded\n            economyRate\n            overs\n          }\n          fieldingStatsList {\n            __typename\n            runsOuts\n            catches\n            stumps\n          }\n          inningWisePoints {\n            __typename\n            inningWiseBattingPoints\n            inningWiseBowlingPoints\n            inningWiseFieldingPoints\n          }\n        }\n      }\n      bowlerSummary2 {\n        __typename\n        topBowler {\n          __typename\n          playerID\n          playerName\n          playerNameHindi\n          playerTeam\n          playerTeamID\n          totalBattingPoints\n          totalPoints\n          battingStatsList {\n            __typename\n            runs\n            fours\n            sixes\n            balls\n            strikeRate\n            isNotOut\n          }\n          totalBowlingPoints\n          totalFieldingPoints\n          bowlingStatsList {\n            __typename\n            wickets\n            runsConceded\n            economyRate\n            overs\n          }\n          fieldingStatsList {\n            __typename\n            runsOuts\n            catches\n            stumps\n          }\n          inningWisePoints {\n            __typename\n            inningWiseBattingPoints\n            inningWiseBowlingPoints\n            inningWiseFieldingPoints\n          }\n        }\n        runnerBowler {\n          __typename\n          playerID\n          playerName\n          playerNameHindi\n          playerTeam\n          playerTeamID\n          totalBattingPoints\n          totalPoints\n          battingStatsList {\n            __typename\n            runs\n            fours\n            sixes\n            balls\n            strikeRate\n            isNotOut\n          }\n          totalBowlingPoints\n          totalFieldingPoints\n          bowlingStatsList {\n            __typename\n            wickets\n            runsConceded\n            economyRate\n            overs\n          }\n          fieldingStatsList {\n            __typename\n            runsOuts\n            catches\n            stumps\n          }\n          inningWisePoints {\n            __typename\n            inningWiseBattingPoints\n            inningWiseBowlingPoints\n            inningWiseFieldingPoints\n          }\n        }\n      }\n      overs\n      runs\n      wickets\n      teamName\n      teamShortName\n      teamID\n    }\n    awayTeamData {\n      __typename\n      batsmanSummary1 {\n        __typename\n        topBatsman {\n          __typename\n          playerID\n          playerName\n          playerNameHindi\n          playerTeam\n          playerTeamID\n          totalBattingPoints\n          totalPoints\n          battingStatsList {\n            __typename\n            runs\n            fours\n            sixes\n            balls\n            strikeRate\n            isNotOut\n          }\n          totalBowlingPoints\n          totalFieldingPoints\n          bowlingStatsList {\n            __typename\n            wickets\n            runsConceded\n            economyRate\n            overs\n          }\n          fieldingStatsList {\n            __typename\n            runsOuts\n            catches\n            stumps\n          }\n          inningWisePoints {\n            __typename\n            inningWiseBattingPoints\n            inningWiseBowlingPoints\n            inningWiseFieldingPoints\n          }\n        }\n        runnerBatsman {\n          __typename\n          playerID\n          playerName\n          playerNameHindi\n          playerTeam\n          playerTeamID\n          totalBattingPoints\n          totalPoints\n          battingStatsList {\n            __typename\n            runs\n            fours\n            sixes\n            balls\n            strikeRate\n            isNotOut\n          }\n          totalBowlingPoints\n          totalFieldingPoints\n          bowlingStatsList {\n            __typename\n            wickets\n            runsConceded\n            economyRate\n            overs\n          }\n          fieldingStatsList {\n            __typename\n            runsOuts\n            catches\n            stumps\n          }\n          inningWisePoints {\n            __typename\n            inningWiseBattingPoints\n            inningWiseBowlingPoints\n            inningWiseFieldingPoints\n          }\n        }\n      }\n      batsmanSummary2 {\n        __typename\n        topBatsman {\n          __typename\n          playerID\n          playerName\n          playerNameHindi\n          playerTeam\n          playerTeamID\n          totalBattingPoints\n          totalPoints\n          battingStatsList {\n            __typename\n            runs\n            fours\n            sixes\n            balls\n            strikeRate\n            isNotOut\n          }\n          totalBowlingPoints\n          totalFieldingPoints\n          bowlingStatsList {\n            __typename\n            wickets\n            runsConceded\n            economyRate\n            overs\n          }\n          fieldingStatsList {\n            __typename\n            runsOuts\n            catches\n            stumps\n          }\n          inningWisePoints {\n            __typename\n            inningWiseBattingPoints\n            inningWiseBowlingPoints\n            inningWiseFieldingPoints\n          }\n        }\n        runnerBatsman {\n          __typename\n          playerID\n          playerName\n          playerNameHindi\n          playerTeam\n          playerTeamID\n          totalBattingPoints\n          totalPoints\n          battingStatsList {\n            __typename\n            runs\n            fours\n            sixes\n            balls\n            strikeRate\n            isNotOut\n          }\n          totalBowlingPoints\n          totalFieldingPoints\n          bowlingStatsList {\n            __typename\n            wickets\n            runsConceded\n            economyRate\n            overs\n          }\n          fieldingStatsList {\n            __typename\n            runsOuts\n            catches\n            stumps\n          }\n          inningWisePoints {\n            __typename\n            inningWiseBattingPoints\n            inningWiseBowlingPoints\n            inningWiseFieldingPoints\n          }\n        }\n      }\n      bowlerSummary1 {\n        __typename\n        topBowler {\n          __typename\n          playerID\n          playerName\n          playerNameHindi\n          playerTeam\n          playerTeamID\n          totalBattingPoints\n          totalPoints\n          battingStatsList {\n            __typename\n            runs\n            fours\n            sixes\n            balls\n            strikeRate\n            isNotOut\n          }\n          totalBowlingPoints\n          totalFieldingPoints\n          bowlingStatsList {\n            __typename\n            wickets\n            runsConceded\n            economyRate\n            overs\n          }\n          fieldingStatsList {\n            __typename\n            runsOuts\n            catches\n            stumps\n          }\n          inningWisePoints {\n            __typename\n            inningWiseBattingPoints\n            inningWiseBowlingPoints\n            inningWiseFieldingPoints\n          }\n        }\n        runnerBowler {\n          __typename\n          playerID\n          playerName\n          playerNameHindi\n          playerTeam\n          playerTeamID\n          totalBattingPoints\n          totalPoints\n          battingStatsList {\n            __typename\n            runs\n            fours\n            sixes\n            balls\n            strikeRate\n            isNotOut\n          }\n          totalBowlingPoints\n          totalFieldingPoints\n          bowlingStatsList {\n            __typename\n            wickets\n            runsConceded\n            economyRate\n            overs\n          }\n          fieldingStatsList {\n            __typename\n            runsOuts\n            catches\n            stumps\n          }\n          inningWisePoints {\n            __typename\n            inningWiseBattingPoints\n            inningWiseBowlingPoints\n            inningWiseFieldingPoints\n          }\n        }\n      }\n      bowlerSummary2 {\n        __typename\n        topBowler {\n          __typename\n          playerID\n          playerName\n          playerNameHindi\n          playerTeam\n          playerTeamID\n          totalBattingPoints\n          totalPoints\n          battingStatsList {\n            __typename\n            runs\n            fours\n            sixes\n            balls\n            strikeRate\n            isNotOut\n          }\n          totalBowlingPoints\n          totalFieldingPoints\n          bowlingStatsList {\n            __typename\n            wickets\n            runsConceded\n            economyRate\n            overs\n          }\n          fieldingStatsList {\n            __typename\n            runsOuts\n            catches\n            stumps\n          }\n          inningWisePoints {\n            __typename\n            inningWiseBattingPoints\n            inningWiseBowlingPoints\n            inningWiseFieldingPoints\n          }\n        }\n        runnerBowler {\n          __typename\n          playerID\n          playerName\n          playerNameHindi\n          playerTeam\n          playerTeamID\n          totalBattingPoints\n          totalPoints\n          battingStatsList {\n            __typename\n            runs\n            fours\n            sixes\n            balls\n            strikeRate\n            isNotOut\n          }\n          totalBowlingPoints\n          totalFieldingPoints\n          bowlingStatsList {\n            __typename\n            wickets\n            runsConceded\n            economyRate\n            overs\n          }\n          fieldingStatsList {\n            __typename\n            runsOuts\n            catches\n            stumps\n          }\n          inningWisePoints {\n            __typename\n            inningWiseBattingPoints\n            inningWiseBowlingPoints\n            inningWiseFieldingPoints\n          }\n        }\n      }\n      overs\n      runs\n      wickets\n      teamName\n      teamShortName\n      teamID\n    }\n    inningOrder\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public MatchSummaryQuery(String str, String str2) {
        Utils.checkNotNull(str, "matchID == null");
        Utils.checkNotNull(str2, "status == null");
        this.variables = new Variables(str, str2);
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
        private String status;

        Builder() {
        }

        public Builder matchID(String str) {
            this.matchID = str;
            return this;
        }

        public Builder status(String str) {
            this.status = str;
            return this;
        }

        public MatchSummaryQuery build() {
            Utils.checkNotNull(this.matchID, "matchID == null");
            Utils.checkNotNull(this.status, "status == null");
            return new MatchSummaryQuery(this.matchID, this.status);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String matchID;
        private final String status;
        private final transient Map<String, Object> valueMap;

        Variables(String str, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.matchID = str;
            this.status = str2;
            linkedHashMap.put("matchID", str);
            linkedHashMap.put(NotificationCompat.CATEGORY_STATUS, str2);
        }

        public String matchID() {
            return this.matchID;
        }

        public String status() {
            return this.status;
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
                    inputFieldWriter.writeString(NotificationCompat.CATEGORY_STATUS, Variables.this.status);
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("matchSummary", "matchSummary", new UnmodifiableMapBuilder(2).put("matchID", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "matchID").build()).put(NotificationCompat.CATEGORY_STATUS, new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, NotificationCompat.CATEGORY_STATUS).build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final MatchSummary matchSummary;

        public Data(MatchSummary matchSummary2) {
            this.matchSummary = matchSummary2;
        }

        public MatchSummary matchSummary() {
            return this.matchSummary;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.matchSummary != null ? Data.this.matchSummary.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{matchSummary=" + this.matchSummary + "}";
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
            MatchSummary matchSummary2 = this.matchSummary;
            MatchSummary matchSummary3 = ((Data) obj).matchSummary;
            if (matchSummary2 != null) {
                return matchSummary2.equals(matchSummary3);
            }
            if (matchSummary3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                MatchSummary matchSummary2 = this.matchSummary;
                this.$hashCode = 1000003 ^ (matchSummary2 == null ? 0 : matchSummary2.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final MatchSummary.Mapper matchSummaryFieldMapper = new MatchSummary.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((MatchSummary) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<MatchSummary>() {


                    @Override 
                    public MatchSummary read(ResponseReader responseReader) {
                        return Mapper.this.matchSummaryFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class MatchSummary {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forObject("bestBatsman", "bestBatsman", null, true, Collections.emptyList()), ResponseField.forObject("bestBowler", "bestBowler", null, true, Collections.emptyList()), ResponseField.forObject("homeTeamData", "homeTeamData", null, true, Collections.emptyList()), ResponseField.forObject("awayTeamData", "awayTeamData", null, true, Collections.emptyList()), ResponseField.forList("inningOrder", "inningOrder", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final AwayTeamData awayTeamData;
        final BestBatsman bestBatsman;
        final BestBowler bestBowler;
        final HomeTeamData homeTeamData;
        final List<String> inningOrder;

        public MatchSummary(String str, BestBatsman bestBatsman2, BestBowler bestBowler2, HomeTeamData homeTeamData2, AwayTeamData awayTeamData2, List<String> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.bestBatsman = bestBatsman2;
            this.bestBowler = bestBowler2;
            this.homeTeamData = homeTeamData2;
            this.awayTeamData = awayTeamData2;
            this.inningOrder = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public BestBatsman bestBatsman() {
            return this.bestBatsman;
        }

        public BestBowler bestBowler() {
            return this.bestBowler;
        }

        public HomeTeamData homeTeamData() {
            return this.homeTeamData;
        }

        public AwayTeamData awayTeamData() {
            return this.awayTeamData;
        }

        public List<String> inningOrder() {
            return this.inningOrder;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(MatchSummary.$responseFields[0], MatchSummary.this.__typename);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(MatchSummary.$responseFields[1], MatchSummary.this.bestBatsman != null ? MatchSummary.this.bestBatsman.marshaller() : null);
                    responseWriter.writeObject(MatchSummary.$responseFields[2], MatchSummary.this.bestBowler != null ? MatchSummary.this.bestBowler.marshaller() : null);
                    responseWriter.writeObject(MatchSummary.$responseFields[3], MatchSummary.this.homeTeamData != null ? MatchSummary.this.homeTeamData.marshaller() : null);
                    ResponseField responseField = MatchSummary.$responseFields[4];
                    if (MatchSummary.this.awayTeamData != null) {
                        responseFieldMarshaller = MatchSummary.this.awayTeamData.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                    responseWriter.writeList(MatchSummary.$responseFields[5], MatchSummary.this.inningOrder, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "MatchSummary{__typename=" + this.__typename + ", bestBatsman=" + this.bestBatsman + ", bestBowler=" + this.bestBowler + ", homeTeamData=" + this.homeTeamData + ", awayTeamData=" + this.awayTeamData + ", inningOrder=" + this.inningOrder + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            BestBatsman bestBatsman2;
            BestBowler bestBowler2;
            HomeTeamData homeTeamData2;
            AwayTeamData awayTeamData2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MatchSummary)) {
                return false;
            }
            MatchSummary matchSummary = (MatchSummary) obj;
            if (this.__typename.equals(matchSummary.__typename) && ((bestBatsman2 = this.bestBatsman) != null ? bestBatsman2.equals(matchSummary.bestBatsman) : matchSummary.bestBatsman == null) && ((bestBowler2 = this.bestBowler) != null ? bestBowler2.equals(matchSummary.bestBowler) : matchSummary.bestBowler == null) && ((homeTeamData2 = this.homeTeamData) != null ? homeTeamData2.equals(matchSummary.homeTeamData) : matchSummary.homeTeamData == null) && ((awayTeamData2 = this.awayTeamData) != null ? awayTeamData2.equals(matchSummary.awayTeamData) : matchSummary.awayTeamData == null)) {
                List<String> list = this.inningOrder;
                List<String> list2 = matchSummary.inningOrder;
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
                BestBatsman bestBatsman2 = this.bestBatsman;
                int i = 0;
                int hashCode2 = (hashCode ^ (bestBatsman2 == null ? 0 : bestBatsman2.hashCode())) * 1000003;
                BestBowler bestBowler2 = this.bestBowler;
                int hashCode3 = (hashCode2 ^ (bestBowler2 == null ? 0 : bestBowler2.hashCode())) * 1000003;
                HomeTeamData homeTeamData2 = this.homeTeamData;
                int hashCode4 = (hashCode3 ^ (homeTeamData2 == null ? 0 : homeTeamData2.hashCode())) * 1000003;
                AwayTeamData awayTeamData2 = this.awayTeamData;
                int hashCode5 = (hashCode4 ^ (awayTeamData2 == null ? 0 : awayTeamData2.hashCode())) * 1000003;
                List<String> list = this.inningOrder;
                if (list != null) {
                    i = list.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<MatchSummary> {
            final AwayTeamData.Mapper awayTeamDataFieldMapper = new AwayTeamData.Mapper();
            final BestBatsman.Mapper bestBatsmanFieldMapper = new BestBatsman.Mapper();
            final BestBowler.Mapper bestBowlerFieldMapper = new BestBowler.Mapper();
            final HomeTeamData.Mapper homeTeamDataFieldMapper = new HomeTeamData.Mapper();

            @Override 
            public MatchSummary map(ResponseReader responseReader) {
                return new MatchSummary(responseReader.readString(MatchSummary.$responseFields[0]), (BestBatsman) responseReader.readObject(MatchSummary.$responseFields[1], new ResponseReader.ObjectReader<BestBatsman>() {


                    @Override 
                    public BestBatsman read(ResponseReader responseReader) {
                        return Mapper.this.bestBatsmanFieldMapper.map(responseReader);
                    }
                }), (BestBowler) responseReader.readObject(MatchSummary.$responseFields[2], new ResponseReader.ObjectReader<BestBowler>() {
                  

                    @Override 
                    public BestBowler read(ResponseReader responseReader) {
                        return Mapper.this.bestBowlerFieldMapper.map(responseReader);
                    }
                }), (HomeTeamData) responseReader.readObject(MatchSummary.$responseFields[3], new ResponseReader.ObjectReader<HomeTeamData>() {
                  

                    @Override 
                    public HomeTeamData read(ResponseReader responseReader) {
                        return Mapper.this.homeTeamDataFieldMapper.map(responseReader);
                    }
                }), (AwayTeamData) responseReader.readObject(MatchSummary.$responseFields[4], new ResponseReader.ObjectReader<AwayTeamData>() {
               

                    @Override 
                    public AwayTeamData read(ResponseReader responseReader) {
                        return Mapper.this.awayTeamDataFieldMapper.map(responseReader);
                    }
                }), responseReader.readList(MatchSummary.$responseFields[5], new ResponseReader.ListReader<String>() {
                  

                    @Override 
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }));
            }
        }
    }

    public static class BestBatsman {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerNameHindi", "playerNameHindi", null, true, Collections.emptyList()), ResponseField.forString("playerTeam", "playerTeam", null, true, Collections.emptyList()), ResponseField.forString("playerTeamID", "playerTeamID", null, true, Collections.emptyList()), ResponseField.forDouble("totalBattingPoints", "totalBattingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalPoints", "totalPoints", null, true, Collections.emptyList()), ResponseField.forList("battingStatsList", "battingStatsList", null, true, Collections.emptyList()), ResponseField.forDouble("totalBowlingPoints", "totalBowlingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalFieldingPoints", "totalFieldingPoints", null, true, Collections.emptyList()), ResponseField.forList("bowlingStatsList", "bowlingStatsList", null, true, Collections.emptyList()), ResponseField.forList("fieldingStatsList", "fieldingStatsList", null, true, Collections.emptyList()), ResponseField.forObject("inningWisePoints", "inningWisePoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<BattingStatsList> battingStatsList;
        final List<BowlingStatsList> bowlingStatsList;
        final List<FieldingStatsList> fieldingStatsList;
        final InningWisePoints inningWisePoints;
        final String playerID;
        final String playerName;
        final String playerNameHindi;
        final String playerTeam;
        final String playerTeamID;
        final Double totalBattingPoints;
        final Double totalBowlingPoints;
        final Double totalFieldingPoints;
        final Double totalPoints;

        public BestBatsman(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, List<BattingStatsList> list, Double d3, Double d4, List<BowlingStatsList> list2, List<FieldingStatsList> list3, InningWisePoints inningWisePoints2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerName = str3;
            this.playerNameHindi = str4;
            this.playerTeam = str5;
            this.playerTeamID = str6;
            this.totalBattingPoints = d;
            this.totalPoints = d2;
            this.battingStatsList = list;
            this.totalBowlingPoints = d3;
            this.totalFieldingPoints = d4;
            this.bowlingStatsList = list2;
            this.fieldingStatsList = list3;
            this.inningWisePoints = inningWisePoints2;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerID() {
            return this.playerID;
        }

        public String playerName() {
            return this.playerName;
        }

        public String playerNameHindi() {
            return this.playerNameHindi;
        }

        public String playerTeam() {
            return this.playerTeam;
        }

        public String playerTeamID() {
            return this.playerTeamID;
        }

        public Double totalBattingPoints() {
            return this.totalBattingPoints;
        }

        public Double totalPoints() {
            return this.totalPoints;
        }

        public List<BattingStatsList> battingStatsList() {
            return this.battingStatsList;
        }

        public Double totalBowlingPoints() {
            return this.totalBowlingPoints;
        }

        public Double totalFieldingPoints() {
            return this.totalFieldingPoints;
        }

        public List<BowlingStatsList> bowlingStatsList() {
            return this.bowlingStatsList;
        }

        public List<FieldingStatsList> fieldingStatsList() {
            return this.fieldingStatsList;
        }

        public InningWisePoints inningWisePoints() {
            return this.inningWisePoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BestBatsman.$responseFields[0], BestBatsman.this.__typename);
                    responseWriter.writeString(BestBatsman.$responseFields[1], BestBatsman.this.playerID);
                    responseWriter.writeString(BestBatsman.$responseFields[2], BestBatsman.this.playerName);
                    responseWriter.writeString(BestBatsman.$responseFields[3], BestBatsman.this.playerNameHindi);
                    responseWriter.writeString(BestBatsman.$responseFields[4], BestBatsman.this.playerTeam);
                    responseWriter.writeString(BestBatsman.$responseFields[5], BestBatsman.this.playerTeamID);
                    responseWriter.writeDouble(BestBatsman.$responseFields[6], BestBatsman.this.totalBattingPoints);
                    responseWriter.writeDouble(BestBatsman.$responseFields[7], BestBatsman.this.totalPoints);
                    responseWriter.writeList(BestBatsman.$responseFields[8], BestBatsman.this.battingStatsList, new ResponseWriter.ListWriter() {
                  

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BattingStatsList) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeDouble(BestBatsman.$responseFields[9], BestBatsman.this.totalBowlingPoints);
                    responseWriter.writeDouble(BestBatsman.$responseFields[10], BestBatsman.this.totalFieldingPoints);
                    responseWriter.writeList(BestBatsman.$responseFields[11], BestBatsman.this.bowlingStatsList, new ResponseWriter.ListWriter() {
       

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BowlingStatsList) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(BestBatsman.$responseFields[12], BestBatsman.this.fieldingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((FieldingStatsList) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeObject(BestBatsman.$responseFields[13], BestBatsman.this.inningWisePoints != null ? BestBatsman.this.inningWisePoints.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BestBatsman{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerNameHindi=" + this.playerNameHindi + ", playerTeam=" + this.playerTeam + ", playerTeamID=" + this.playerTeamID + ", totalBattingPoints=" + this.totalBattingPoints + ", totalPoints=" + this.totalPoints + ", battingStatsList=" + this.battingStatsList + ", totalBowlingPoints=" + this.totalBowlingPoints + ", totalFieldingPoints=" + this.totalFieldingPoints + ", bowlingStatsList=" + this.bowlingStatsList + ", fieldingStatsList=" + this.fieldingStatsList + ", inningWisePoints=" + this.inningWisePoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Double d;
            Double d2;
            List<BattingStatsList> list;
            Double d3;
            Double d4;
            List<BowlingStatsList> list2;
            List<FieldingStatsList> list3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BestBatsman)) {
                return false;
            }
            BestBatsman bestBatsman = (BestBatsman) obj;
            if (this.__typename.equals(bestBatsman.__typename) && ((str = this.playerID) != null ? str.equals(bestBatsman.playerID) : bestBatsman.playerID == null) && ((str2 = this.playerName) != null ? str2.equals(bestBatsman.playerName) : bestBatsman.playerName == null) && ((str3 = this.playerNameHindi) != null ? str3.equals(bestBatsman.playerNameHindi) : bestBatsman.playerNameHindi == null) && ((str4 = this.playerTeam) != null ? str4.equals(bestBatsman.playerTeam) : bestBatsman.playerTeam == null) && ((str5 = this.playerTeamID) != null ? str5.equals(bestBatsman.playerTeamID) : bestBatsman.playerTeamID == null) && ((d = this.totalBattingPoints) != null ? d.equals(bestBatsman.totalBattingPoints) : bestBatsman.totalBattingPoints == null) && ((d2 = this.totalPoints) != null ? d2.equals(bestBatsman.totalPoints) : bestBatsman.totalPoints == null) && ((list = this.battingStatsList) != null ? list.equals(bestBatsman.battingStatsList) : bestBatsman.battingStatsList == null) && ((d3 = this.totalBowlingPoints) != null ? d3.equals(bestBatsman.totalBowlingPoints) : bestBatsman.totalBowlingPoints == null) && ((d4 = this.totalFieldingPoints) != null ? d4.equals(bestBatsman.totalFieldingPoints) : bestBatsman.totalFieldingPoints == null) && ((list2 = this.bowlingStatsList) != null ? list2.equals(bestBatsman.bowlingStatsList) : bestBatsman.bowlingStatsList == null) && ((list3 = this.fieldingStatsList) != null ? list3.equals(bestBatsman.fieldingStatsList) : bestBatsman.fieldingStatsList == null)) {
                InningWisePoints inningWisePoints2 = this.inningWisePoints;
                InningWisePoints inningWisePoints3 = bestBatsman.inningWisePoints;
                if (inningWisePoints2 == null) {
                    if (inningWisePoints3 == null) {
                        return true;
                    }
                } else if (inningWisePoints2.equals(inningWisePoints3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.playerID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerNameHindi;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerTeam;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerTeamID;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Double d = this.totalBattingPoints;
                int hashCode7 = (hashCode6 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.totalPoints;
                int hashCode8 = (hashCode7 ^ (d2 == null ? 0 : d2.hashCode())) * 1000003;
                List<BattingStatsList> list = this.battingStatsList;
                int hashCode9 = (hashCode8 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                Double d3 = this.totalBowlingPoints;
                int hashCode10 = (hashCode9 ^ (d3 == null ? 0 : d3.hashCode())) * 1000003;
                Double d4 = this.totalFieldingPoints;
                int hashCode11 = (hashCode10 ^ (d4 == null ? 0 : d4.hashCode())) * 1000003;
                List<BowlingStatsList> list2 = this.bowlingStatsList;
                int hashCode12 = (hashCode11 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<FieldingStatsList> list3 = this.fieldingStatsList;
                int hashCode13 = (hashCode12 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                InningWisePoints inningWisePoints2 = this.inningWisePoints;
                if (inningWisePoints2 != null) {
                    i = inningWisePoints2.hashCode();
                }
                this.$hashCode = hashCode13 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BestBatsman> {
            final BattingStatsList.Mapper battingStatsListFieldMapper = new BattingStatsList.Mapper();
            final BowlingStatsList.Mapper bowlingStatsListFieldMapper = new BowlingStatsList.Mapper();
            final FieldingStatsList.Mapper fieldingStatsListFieldMapper = new FieldingStatsList.Mapper();
            final InningWisePoints.Mapper inningWisePointsFieldMapper = new InningWisePoints.Mapper();

            @Override 
            public BestBatsman map(ResponseReader responseReader) {
                return new BestBatsman(responseReader.readString(BestBatsman.$responseFields[0]), responseReader.readString(BestBatsman.$responseFields[1]), responseReader.readString(BestBatsman.$responseFields[2]), responseReader.readString(BestBatsman.$responseFields[3]), responseReader.readString(BestBatsman.$responseFields[4]), responseReader.readString(BestBatsman.$responseFields[5]), responseReader.readDouble(BestBatsman.$responseFields[6]), responseReader.readDouble(BestBatsman.$responseFields[7]), responseReader.readList(BestBatsman.$responseFields[8], new ResponseReader.ListReader<BattingStatsList>() {
                 

                    @Override 
                    public BattingStatsList read(ResponseReader.ListItemReader listItemReader) {
                        return (BattingStatsList) listItemReader.readObject(new ResponseReader.ObjectReader<BattingStatsList>() {
                          

                            @Override 
                            public BattingStatsList read(ResponseReader responseReader) {
                                return Mapper.this.battingStatsListFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readDouble(BestBatsman.$responseFields[9]), responseReader.readDouble(BestBatsman.$responseFields[10]), responseReader.readList(BestBatsman.$responseFields[11], new ResponseReader.ListReader<BowlingStatsList>() {
                  

                    @Override 
                    public BowlingStatsList read(ResponseReader.ListItemReader listItemReader) {
                        return (BowlingStatsList) listItemReader.readObject(new ResponseReader.ObjectReader<BowlingStatsList>() {
                          

                            @Override 
                            public BowlingStatsList read(ResponseReader responseReader) {
                                return Mapper.this.bowlingStatsListFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(BestBatsman.$responseFields[12], new ResponseReader.ListReader<FieldingStatsList>() {
                  

                    @Override 
                    public FieldingStatsList read(ResponseReader.ListItemReader listItemReader) {
                        return (FieldingStatsList) listItemReader.readObject(new ResponseReader.ObjectReader<FieldingStatsList>() {
                        

                            @Override 
                            public FieldingStatsList read(ResponseReader responseReader) {
                                return Mapper.this.fieldingStatsListFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (InningWisePoints) responseReader.readObject(BestBatsman.$responseFields[13], new ResponseReader.ObjectReader<InningWisePoints>() {
                 

                    @Override 
                    public InningWisePoints read(ResponseReader responseReader) {
                        return Mapper.this.inningWisePointsFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class BattingStatsList {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runs", "runs", null, true, Collections.emptyList()), ResponseField.forInt("fours", "fours", null, true, Collections.emptyList()), ResponseField.forInt("sixes", "sixes", null, true, Collections.emptyList()), ResponseField.forInt("balls", "balls", null, true, Collections.emptyList()), ResponseField.forDouble("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forBoolean("isNotOut", "isNotOut", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer balls;
        final Integer fours;
        final Boolean isNotOut;
        final Integer runs;
        final Integer sixes;
        final Double strikeRate;

        public BattingStatsList(String str, Integer num, Integer num2, Integer num3, Integer num4, Double d, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runs = num;
            this.fours = num2;
            this.sixes = num3;
            this.balls = num4;
            this.strikeRate = d;
            this.isNotOut = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runs() {
            return this.runs;
        }

        public Integer fours() {
            return this.fours;
        }

        public Integer sixes() {
            return this.sixes;
        }

        public Integer balls() {
            return this.balls;
        }

        public Double strikeRate() {
            return this.strikeRate;
        }

        public Boolean isNotOut() {
            return this.isNotOut;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {
              

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BattingStatsList.$responseFields[0], BattingStatsList.this.__typename);
                    responseWriter.writeInt(BattingStatsList.$responseFields[1], BattingStatsList.this.runs);
                    responseWriter.writeInt(BattingStatsList.$responseFields[2], BattingStatsList.this.fours);
                    responseWriter.writeInt(BattingStatsList.$responseFields[3], BattingStatsList.this.sixes);
                    responseWriter.writeInt(BattingStatsList.$responseFields[4], BattingStatsList.this.balls);
                    responseWriter.writeDouble(BattingStatsList.$responseFields[5], BattingStatsList.this.strikeRate);
                    responseWriter.writeBoolean(BattingStatsList.$responseFields[6], BattingStatsList.this.isNotOut);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BattingStatsList{__typename=" + this.__typename + ", runs=" + this.runs + ", fours=" + this.fours + ", sixes=" + this.sixes + ", balls=" + this.balls + ", strikeRate=" + this.strikeRate + ", isNotOut=" + this.isNotOut + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattingStatsList)) {
                return false;
            }
            BattingStatsList battingStatsList = (BattingStatsList) obj;
            if (this.__typename.equals(battingStatsList.__typename) && ((num = this.runs) != null ? num.equals(battingStatsList.runs) : battingStatsList.runs == null) && ((num2 = this.fours) != null ? num2.equals(battingStatsList.fours) : battingStatsList.fours == null) && ((num3 = this.sixes) != null ? num3.equals(battingStatsList.sixes) : battingStatsList.sixes == null) && ((num4 = this.balls) != null ? num4.equals(battingStatsList.balls) : battingStatsList.balls == null) && ((d = this.strikeRate) != null ? d.equals(battingStatsList.strikeRate) : battingStatsList.strikeRate == null)) {
                Boolean bool = this.isNotOut;
                Boolean bool2 = battingStatsList.isNotOut;
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
                Integer num = this.runs;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.fours;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.sixes;
                int hashCode4 = (hashCode3 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.balls;
                int hashCode5 = (hashCode4 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Double d = this.strikeRate;
                int hashCode6 = (hashCode5 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Boolean bool = this.isNotOut;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BattingStatsList> {
            @Override 
            public BattingStatsList map(ResponseReader responseReader) {
                return new BattingStatsList(responseReader.readString(BattingStatsList.$responseFields[0]), responseReader.readInt(BattingStatsList.$responseFields[1]), responseReader.readInt(BattingStatsList.$responseFields[2]), responseReader.readInt(BattingStatsList.$responseFields[3]), responseReader.readInt(BattingStatsList.$responseFields[4]), responseReader.readDouble(BattingStatsList.$responseFields[5]), responseReader.readBoolean(BattingStatsList.$responseFields[6]));
            }
        }
    }

    public static class BowlingStatsList {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forInt("runsConceded", "runsConceded", null, true, Collections.emptyList()), ResponseField.forDouble("economyRate", "economyRate", null, true, Collections.emptyList()), ResponseField.forDouble("overs", "overs", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double economyRate;
        final Double overs;
        final Integer runsConceded;
        final Integer wickets;

        public BowlingStatsList(String str, Integer num, Integer num2, Double d, Double d2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.wickets = num;
            this.runsConceded = num2;
            this.economyRate = d;
            this.overs = d2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer wickets() {
            return this.wickets;
        }

        public Integer runsConceded() {
            return this.runsConceded;
        }

        public Double economyRate() {
            return this.economyRate;
        }

        public Double overs() {
            return this.overs;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {
             

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlingStatsList.$responseFields[0], BowlingStatsList.this.__typename);
                    responseWriter.writeInt(BowlingStatsList.$responseFields[1], BowlingStatsList.this.wickets);
                    responseWriter.writeInt(BowlingStatsList.$responseFields[2], BowlingStatsList.this.runsConceded);
                    responseWriter.writeDouble(BowlingStatsList.$responseFields[3], BowlingStatsList.this.economyRate);
                    responseWriter.writeDouble(BowlingStatsList.$responseFields[4], BowlingStatsList.this.overs);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlingStatsList{__typename=" + this.__typename + ", wickets=" + this.wickets + ", runsConceded=" + this.runsConceded + ", economyRate=" + this.economyRate + ", overs=" + this.overs + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlingStatsList)) {
                return false;
            }
            BowlingStatsList bowlingStatsList = (BowlingStatsList) obj;
            if (this.__typename.equals(bowlingStatsList.__typename) && ((num = this.wickets) != null ? num.equals(bowlingStatsList.wickets) : bowlingStatsList.wickets == null) && ((num2 = this.runsConceded) != null ? num2.equals(bowlingStatsList.runsConceded) : bowlingStatsList.runsConceded == null) && ((d = this.economyRate) != null ? d.equals(bowlingStatsList.economyRate) : bowlingStatsList.economyRate == null)) {
                Double d2 = this.overs;
                Double d3 = bowlingStatsList.overs;
                if (d2 == null) {
                    if (d3 == null) {
                        return true;
                    }
                } else if (d2.equals(d3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.wickets;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.runsConceded;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Double d = this.economyRate;
                int hashCode4 = (hashCode3 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.overs;
                if (d2 != null) {
                    i = d2.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlingStatsList> {
            @Override 
            public BowlingStatsList map(ResponseReader responseReader) {
                return new BowlingStatsList(responseReader.readString(BowlingStatsList.$responseFields[0]), responseReader.readInt(BowlingStatsList.$responseFields[1]), responseReader.readInt(BowlingStatsList.$responseFields[2]), responseReader.readDouble(BowlingStatsList.$responseFields[3]), responseReader.readDouble(BowlingStatsList.$responseFields[4]));
            }
        }
    }

    public static class FieldingStatsList {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runsOuts", "runsOuts", null, true, Collections.emptyList()), ResponseField.forInt("catches", "catches", null, true, Collections.emptyList()), ResponseField.forInt("stumps", "stumps", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer catches;
        final Integer runsOuts;
        final Integer stumps;

        public FieldingStatsList(String str, Integer num, Integer num2, Integer num3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runsOuts = num;
            this.catches = num2;
            this.stumps = num3;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runsOuts() {
            return this.runsOuts;
        }

        public Integer catches() {
            return this.catches;
        }

        public Integer stumps() {
            return this.stumps;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {
              

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(FieldingStatsList.$responseFields[0], FieldingStatsList.this.__typename);
                    responseWriter.writeInt(FieldingStatsList.$responseFields[1], FieldingStatsList.this.runsOuts);
                    responseWriter.writeInt(FieldingStatsList.$responseFields[2], FieldingStatsList.this.catches);
                    responseWriter.writeInt(FieldingStatsList.$responseFields[3], FieldingStatsList.this.stumps);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FieldingStatsList{__typename=" + this.__typename + ", runsOuts=" + this.runsOuts + ", catches=" + this.catches + ", stumps=" + this.stumps + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FieldingStatsList)) {
                return false;
            }
            FieldingStatsList fieldingStatsList = (FieldingStatsList) obj;
            if (this.__typename.equals(fieldingStatsList.__typename) && ((num = this.runsOuts) != null ? num.equals(fieldingStatsList.runsOuts) : fieldingStatsList.runsOuts == null) && ((num2 = this.catches) != null ? num2.equals(fieldingStatsList.catches) : fieldingStatsList.catches == null)) {
                Integer num3 = this.stumps;
                Integer num4 = fieldingStatsList.stumps;
                if (num3 == null) {
                    if (num4 == null) {
                        return true;
                    }
                } else if (num3.equals(num4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.runsOuts;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.catches;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.stumps;
                if (num3 != null) {
                    i = num3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<FieldingStatsList> {
            @Override 
            public FieldingStatsList map(ResponseReader responseReader) {
                return new FieldingStatsList(responseReader.readString(FieldingStatsList.$responseFields[0]), responseReader.readInt(FieldingStatsList.$responseFields[1]), responseReader.readInt(FieldingStatsList.$responseFields[2]), responseReader.readInt(FieldingStatsList.$responseFields[3]));
            }
        }
    }

    public static class InningWisePoints {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("inningWiseBattingPoints", "inningWiseBattingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseBowlingPoints", "inningWiseBowlingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseFieldingPoints", "inningWiseFieldingPoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Double> inningWiseBattingPoints;
        final List<Double> inningWiseBowlingPoints;
        final List<Double> inningWiseFieldingPoints;

        public InningWisePoints(String str, List<Double> list, List<Double> list2, List<Double> list3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.inningWiseBattingPoints = list;
            this.inningWiseBowlingPoints = list2;
            this.inningWiseFieldingPoints = list3;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Double> inningWiseBattingPoints() {
            return this.inningWiseBattingPoints;
        }

        public List<Double> inningWiseBowlingPoints() {
            return this.inningWiseBowlingPoints;
        }

        public List<Double> inningWiseFieldingPoints() {
            return this.inningWiseFieldingPoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(InningWisePoints.$responseFields[0], InningWisePoints.this.__typename);
                    responseWriter.writeList(InningWisePoints.$responseFields[1], InningWisePoints.this.inningWiseBattingPoints, new ResponseWriter.ListWriter() {
              

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints.$responseFields[2], InningWisePoints.this.inningWiseBowlingPoints, new ResponseWriter.ListWriter() {
                     

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints.$responseFields[3], InningWisePoints.this.inningWiseFieldingPoints, new ResponseWriter.ListWriter() {
               

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "InningWisePoints{__typename=" + this.__typename + ", inningWiseBattingPoints=" + this.inningWiseBattingPoints + ", inningWiseBowlingPoints=" + this.inningWiseBowlingPoints + ", inningWiseFieldingPoints=" + this.inningWiseFieldingPoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<Double> list;
            List<Double> list2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InningWisePoints)) {
                return false;
            }
            InningWisePoints inningWisePoints = (InningWisePoints) obj;
            if (this.__typename.equals(inningWisePoints.__typename) && ((list = this.inningWiseBattingPoints) != null ? list.equals(inningWisePoints.inningWiseBattingPoints) : inningWisePoints.inningWiseBattingPoints == null) && ((list2 = this.inningWiseBowlingPoints) != null ? list2.equals(inningWisePoints.inningWiseBowlingPoints) : inningWisePoints.inningWiseBowlingPoints == null)) {
                List<Double> list3 = this.inningWiseFieldingPoints;
                List<Double> list4 = inningWisePoints.inningWiseFieldingPoints;
                if (list3 == null) {
                    if (list4 == null) {
                        return true;
                    }
                } else if (list3.equals(list4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<Double> list = this.inningWiseBattingPoints;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Double> list2 = this.inningWiseBowlingPoints;
                int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<Double> list3 = this.inningWiseFieldingPoints;
                if (list3 != null) {
                    i = list3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<InningWisePoints> {
            @Override 
            public InningWisePoints map(ResponseReader responseReader) {
                return new InningWisePoints(responseReader.readString(InningWisePoints.$responseFields[0]), responseReader.readList(InningWisePoints.$responseFields[1], new ResponseReader.ListReader<Double>() {
               

                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints.$responseFields[2], new ResponseReader.ListReader<Double>() {
          

                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints.$responseFields[3], new ResponseReader.ListReader<Double>() {
                  

                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }));
            }
        }
    }

    public static class BestBowler {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerNameHindi", "playerNameHindi", null, true, Collections.emptyList()), ResponseField.forString("playerTeam", "playerTeam", null, true, Collections.emptyList()), ResponseField.forString("playerTeamID", "playerTeamID", null, true, Collections.emptyList()), ResponseField.forDouble("totalBattingPoints", "totalBattingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalPoints", "totalPoints", null, true, Collections.emptyList()), ResponseField.forList("battingStatsList", "battingStatsList", null, true, Collections.emptyList()), ResponseField.forDouble("totalBowlingPoints", "totalBowlingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalFieldingPoints", "totalFieldingPoints", null, true, Collections.emptyList()), ResponseField.forList("bowlingStatsList", "bowlingStatsList", null, true, Collections.emptyList()), ResponseField.forList("fieldingStatsList", "fieldingStatsList", null, true, Collections.emptyList()), ResponseField.forObject("inningWisePoints", "inningWisePoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<BattingStatsList1> battingStatsList;
        final List<BowlingStatsList1> bowlingStatsList;
        final List<FieldingStatsList1> fieldingStatsList;
        final InningWisePoints1 inningWisePoints;
        final String playerID;
        final String playerName;
        final String playerNameHindi;
        final String playerTeam;
        final String playerTeamID;
        final Double totalBattingPoints;
        final Double totalBowlingPoints;
        final Double totalFieldingPoints;
        final Double totalPoints;

        public BestBowler(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, List<BattingStatsList1> list, Double d3, Double d4, List<BowlingStatsList1> list2, List<FieldingStatsList1> list3, InningWisePoints1 inningWisePoints1) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerName = str3;
            this.playerNameHindi = str4;
            this.playerTeam = str5;
            this.playerTeamID = str6;
            this.totalBattingPoints = d;
            this.totalPoints = d2;
            this.battingStatsList = list;
            this.totalBowlingPoints = d3;
            this.totalFieldingPoints = d4;
            this.bowlingStatsList = list2;
            this.fieldingStatsList = list3;
            this.inningWisePoints = inningWisePoints1;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerID() {
            return this.playerID;
        }

        public String playerName() {
            return this.playerName;
        }

        public String playerNameHindi() {
            return this.playerNameHindi;
        }

        public String playerTeam() {
            return this.playerTeam;
        }

        public String playerTeamID() {
            return this.playerTeamID;
        }

        public Double totalBattingPoints() {
            return this.totalBattingPoints;
        }

        public Double totalPoints() {
            return this.totalPoints;
        }

        public List<BattingStatsList1> battingStatsList() {
            return this.battingStatsList;
        }

        public Double totalBowlingPoints() {
            return this.totalBowlingPoints;
        }

        public Double totalFieldingPoints() {
            return this.totalFieldingPoints;
        }

        public List<BowlingStatsList1> bowlingStatsList() {
            return this.bowlingStatsList;
        }

        public List<FieldingStatsList1> fieldingStatsList() {
            return this.fieldingStatsList;
        }

        public InningWisePoints1 inningWisePoints() {
            return this.inningWisePoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {
              

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BestBowler.$responseFields[0], BestBowler.this.__typename);
                    responseWriter.writeString(BestBowler.$responseFields[1], BestBowler.this.playerID);
                    responseWriter.writeString(BestBowler.$responseFields[2], BestBowler.this.playerName);
                    responseWriter.writeString(BestBowler.$responseFields[3], BestBowler.this.playerNameHindi);
                    responseWriter.writeString(BestBowler.$responseFields[4], BestBowler.this.playerTeam);
                    responseWriter.writeString(BestBowler.$responseFields[5], BestBowler.this.playerTeamID);
                    responseWriter.writeDouble(BestBowler.$responseFields[6], BestBowler.this.totalBattingPoints);
                    responseWriter.writeDouble(BestBowler.$responseFields[7], BestBowler.this.totalPoints);
                    responseWriter.writeList(BestBowler.$responseFields[8], BestBowler.this.battingStatsList, new ResponseWriter.ListWriter() {
                      

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BattingStatsList1) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeDouble(BestBowler.$responseFields[9], BestBowler.this.totalBowlingPoints);
                    responseWriter.writeDouble(BestBowler.$responseFields[10], BestBowler.this.totalFieldingPoints);
                    responseWriter.writeList(BestBowler.$responseFields[11], BestBowler.this.bowlingStatsList, new ResponseWriter.ListWriter() {
                     

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BowlingStatsList1) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(BestBowler.$responseFields[12], BestBowler.this.fieldingStatsList, new ResponseWriter.ListWriter() {
                      

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((FieldingStatsList1) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeObject(BestBowler.$responseFields[13], BestBowler.this.inningWisePoints != null ? BestBowler.this.inningWisePoints.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BestBowler{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerNameHindi=" + this.playerNameHindi + ", playerTeam=" + this.playerTeam + ", playerTeamID=" + this.playerTeamID + ", totalBattingPoints=" + this.totalBattingPoints + ", totalPoints=" + this.totalPoints + ", battingStatsList=" + this.battingStatsList + ", totalBowlingPoints=" + this.totalBowlingPoints + ", totalFieldingPoints=" + this.totalFieldingPoints + ", bowlingStatsList=" + this.bowlingStatsList + ", fieldingStatsList=" + this.fieldingStatsList + ", inningWisePoints=" + this.inningWisePoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Double d;
            Double d2;
            List<BattingStatsList1> list;
            Double d3;
            Double d4;
            List<BowlingStatsList1> list2;
            List<FieldingStatsList1> list3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BestBowler)) {
                return false;
            }
            BestBowler bestBowler = (BestBowler) obj;
            if (this.__typename.equals(bestBowler.__typename) && ((str = this.playerID) != null ? str.equals(bestBowler.playerID) : bestBowler.playerID == null) && ((str2 = this.playerName) != null ? str2.equals(bestBowler.playerName) : bestBowler.playerName == null) && ((str3 = this.playerNameHindi) != null ? str3.equals(bestBowler.playerNameHindi) : bestBowler.playerNameHindi == null) && ((str4 = this.playerTeam) != null ? str4.equals(bestBowler.playerTeam) : bestBowler.playerTeam == null) && ((str5 = this.playerTeamID) != null ? str5.equals(bestBowler.playerTeamID) : bestBowler.playerTeamID == null) && ((d = this.totalBattingPoints) != null ? d.equals(bestBowler.totalBattingPoints) : bestBowler.totalBattingPoints == null) && ((d2 = this.totalPoints) != null ? d2.equals(bestBowler.totalPoints) : bestBowler.totalPoints == null) && ((list = this.battingStatsList) != null ? list.equals(bestBowler.battingStatsList) : bestBowler.battingStatsList == null) && ((d3 = this.totalBowlingPoints) != null ? d3.equals(bestBowler.totalBowlingPoints) : bestBowler.totalBowlingPoints == null) && ((d4 = this.totalFieldingPoints) != null ? d4.equals(bestBowler.totalFieldingPoints) : bestBowler.totalFieldingPoints == null) && ((list2 = this.bowlingStatsList) != null ? list2.equals(bestBowler.bowlingStatsList) : bestBowler.bowlingStatsList == null) && ((list3 = this.fieldingStatsList) != null ? list3.equals(bestBowler.fieldingStatsList) : bestBowler.fieldingStatsList == null)) {
                InningWisePoints1 inningWisePoints1 = this.inningWisePoints;
                InningWisePoints1 inningWisePoints12 = bestBowler.inningWisePoints;
                if (inningWisePoints1 == null) {
                    if (inningWisePoints12 == null) {
                        return true;
                    }
                } else if (inningWisePoints1.equals(inningWisePoints12)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.playerID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerNameHindi;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerTeam;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerTeamID;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Double d = this.totalBattingPoints;
                int hashCode7 = (hashCode6 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.totalPoints;
                int hashCode8 = (hashCode7 ^ (d2 == null ? 0 : d2.hashCode())) * 1000003;
                List<BattingStatsList1> list = this.battingStatsList;
                int hashCode9 = (hashCode8 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                Double d3 = this.totalBowlingPoints;
                int hashCode10 = (hashCode9 ^ (d3 == null ? 0 : d3.hashCode())) * 1000003;
                Double d4 = this.totalFieldingPoints;
                int hashCode11 = (hashCode10 ^ (d4 == null ? 0 : d4.hashCode())) * 1000003;
                List<BowlingStatsList1> list2 = this.bowlingStatsList;
                int hashCode12 = (hashCode11 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<FieldingStatsList1> list3 = this.fieldingStatsList;
                int hashCode13 = (hashCode12 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                InningWisePoints1 inningWisePoints1 = this.inningWisePoints;
                if (inningWisePoints1 != null) {
                    i = inningWisePoints1.hashCode();
                }
                this.$hashCode = hashCode13 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BestBowler> {
            final BattingStatsList1.Mapper battingStatsList1FieldMapper = new BattingStatsList1.Mapper();
            final BowlingStatsList1.Mapper bowlingStatsList1FieldMapper = new BowlingStatsList1.Mapper();
            final FieldingStatsList1.Mapper fieldingStatsList1FieldMapper = new FieldingStatsList1.Mapper();
            final InningWisePoints1.Mapper inningWisePoints1FieldMapper = new InningWisePoints1.Mapper();

            @Override 
            public BestBowler map(ResponseReader responseReader) {
                return new BestBowler(responseReader.readString(BestBowler.$responseFields[0]), responseReader.readString(BestBowler.$responseFields[1]), responseReader.readString(BestBowler.$responseFields[2]), responseReader.readString(BestBowler.$responseFields[3]), responseReader.readString(BestBowler.$responseFields[4]), responseReader.readString(BestBowler.$responseFields[5]), responseReader.readDouble(BestBowler.$responseFields[6]), responseReader.readDouble(BestBowler.$responseFields[7]), responseReader.readList(BestBowler.$responseFields[8], new ResponseReader.ListReader<BattingStatsList1>() {
                  

                    @Override 
                    public BattingStatsList1 read(ResponseReader.ListItemReader listItemReader) {
                        return (BattingStatsList1) listItemReader.readObject(new ResponseReader.ObjectReader<BattingStatsList1>() {
                         

                            @Override 
                            public BattingStatsList1 read(ResponseReader responseReader) {
                                return Mapper.this.battingStatsList1FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readDouble(BestBowler.$responseFields[9]), responseReader.readDouble(BestBowler.$responseFields[10]), responseReader.readList(BestBowler.$responseFields[11], new ResponseReader.ListReader<BowlingStatsList1>() {
                  

                    @Override 
                    public BowlingStatsList1 read(ResponseReader.ListItemReader listItemReader) {
                        return (BowlingStatsList1) listItemReader.readObject(new ResponseReader.ObjectReader<BowlingStatsList1>() {
                           

                            @Override 
                            public BowlingStatsList1 read(ResponseReader responseReader) {
                                return Mapper.this.bowlingStatsList1FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(BestBowler.$responseFields[12], new ResponseReader.ListReader<FieldingStatsList1>() {
                  

                    @Override 
                    public FieldingStatsList1 read(ResponseReader.ListItemReader listItemReader) {
                        return (FieldingStatsList1) listItemReader.readObject(new ResponseReader.ObjectReader<FieldingStatsList1>() {
                          

                            @Override 
                            public FieldingStatsList1 read(ResponseReader responseReader) {
                                return Mapper.this.fieldingStatsList1FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (InningWisePoints1) responseReader.readObject(BestBowler.$responseFields[13], new ResponseReader.ObjectReader<InningWisePoints1>() {
                  

                    @Override 
                    public InningWisePoints1 read(ResponseReader responseReader) {
                        return Mapper.this.inningWisePoints1FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class BattingStatsList1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runs", "runs", null, true, Collections.emptyList()), ResponseField.forInt("fours", "fours", null, true, Collections.emptyList()), ResponseField.forInt("sixes", "sixes", null, true, Collections.emptyList()), ResponseField.forInt("balls", "balls", null, true, Collections.emptyList()), ResponseField.forDouble("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forBoolean("isNotOut", "isNotOut", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer balls;
        final Integer fours;
        final Boolean isNotOut;
        final Integer runs;
        final Integer sixes;
        final Double strikeRate;

        public BattingStatsList1(String str, Integer num, Integer num2, Integer num3, Integer num4, Double d, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runs = num;
            this.fours = num2;
            this.sixes = num3;
            this.balls = num4;
            this.strikeRate = d;
            this.isNotOut = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runs() {
            return this.runs;
        }

        public Integer fours() {
            return this.fours;
        }

        public Integer sixes() {
            return this.sixes;
        }

        public Integer balls() {
            return this.balls;
        }

        public Double strikeRate() {
            return this.strikeRate;
        }

        public Boolean isNotOut() {
            return this.isNotOut;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BattingStatsList1.$responseFields[0], BattingStatsList1.this.__typename);
                    responseWriter.writeInt(BattingStatsList1.$responseFields[1], BattingStatsList1.this.runs);
                    responseWriter.writeInt(BattingStatsList1.$responseFields[2], BattingStatsList1.this.fours);
                    responseWriter.writeInt(BattingStatsList1.$responseFields[3], BattingStatsList1.this.sixes);
                    responseWriter.writeInt(BattingStatsList1.$responseFields[4], BattingStatsList1.this.balls);
                    responseWriter.writeDouble(BattingStatsList1.$responseFields[5], BattingStatsList1.this.strikeRate);
                    responseWriter.writeBoolean(BattingStatsList1.$responseFields[6], BattingStatsList1.this.isNotOut);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BattingStatsList1{__typename=" + this.__typename + ", runs=" + this.runs + ", fours=" + this.fours + ", sixes=" + this.sixes + ", balls=" + this.balls + ", strikeRate=" + this.strikeRate + ", isNotOut=" + this.isNotOut + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattingStatsList1)) {
                return false;
            }
            BattingStatsList1 battingStatsList1 = (BattingStatsList1) obj;
            if (this.__typename.equals(battingStatsList1.__typename) && ((num = this.runs) != null ? num.equals(battingStatsList1.runs) : battingStatsList1.runs == null) && ((num2 = this.fours) != null ? num2.equals(battingStatsList1.fours) : battingStatsList1.fours == null) && ((num3 = this.sixes) != null ? num3.equals(battingStatsList1.sixes) : battingStatsList1.sixes == null) && ((num4 = this.balls) != null ? num4.equals(battingStatsList1.balls) : battingStatsList1.balls == null) && ((d = this.strikeRate) != null ? d.equals(battingStatsList1.strikeRate) : battingStatsList1.strikeRate == null)) {
                Boolean bool = this.isNotOut;
                Boolean bool2 = battingStatsList1.isNotOut;
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
                Integer num = this.runs;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.fours;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.sixes;
                int hashCode4 = (hashCode3 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.balls;
                int hashCode5 = (hashCode4 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Double d = this.strikeRate;
                int hashCode6 = (hashCode5 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Boolean bool = this.isNotOut;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BattingStatsList1> {
            @Override 
            public BattingStatsList1 map(ResponseReader responseReader) {
                return new BattingStatsList1(responseReader.readString(BattingStatsList1.$responseFields[0]), responseReader.readInt(BattingStatsList1.$responseFields[1]), responseReader.readInt(BattingStatsList1.$responseFields[2]), responseReader.readInt(BattingStatsList1.$responseFields[3]), responseReader.readInt(BattingStatsList1.$responseFields[4]), responseReader.readDouble(BattingStatsList1.$responseFields[5]), responseReader.readBoolean(BattingStatsList1.$responseFields[6]));
            }
        }
    }

    public static class BowlingStatsList1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forInt("runsConceded", "runsConceded", null, true, Collections.emptyList()), ResponseField.forDouble("economyRate", "economyRate", null, true, Collections.emptyList()), ResponseField.forDouble("overs", "overs", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double economyRate;
        final Double overs;
        final Integer runsConceded;
        final Integer wickets;

        public BowlingStatsList1(String str, Integer num, Integer num2, Double d, Double d2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.wickets = num;
            this.runsConceded = num2;
            this.economyRate = d;
            this.overs = d2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer wickets() {
            return this.wickets;
        }

        public Integer runsConceded() {
            return this.runsConceded;
        }

        public Double economyRate() {
            return this.economyRate;
        }

        public Double overs() {
            return this.overs;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlingStatsList1.$responseFields[0], BowlingStatsList1.this.__typename);
                    responseWriter.writeInt(BowlingStatsList1.$responseFields[1], BowlingStatsList1.this.wickets);
                    responseWriter.writeInt(BowlingStatsList1.$responseFields[2], BowlingStatsList1.this.runsConceded);
                    responseWriter.writeDouble(BowlingStatsList1.$responseFields[3], BowlingStatsList1.this.economyRate);
                    responseWriter.writeDouble(BowlingStatsList1.$responseFields[4], BowlingStatsList1.this.overs);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlingStatsList1{__typename=" + this.__typename + ", wickets=" + this.wickets + ", runsConceded=" + this.runsConceded + ", economyRate=" + this.economyRate + ", overs=" + this.overs + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlingStatsList1)) {
                return false;
            }
            BowlingStatsList1 bowlingStatsList1 = (BowlingStatsList1) obj;
            if (this.__typename.equals(bowlingStatsList1.__typename) && ((num = this.wickets) != null ? num.equals(bowlingStatsList1.wickets) : bowlingStatsList1.wickets == null) && ((num2 = this.runsConceded) != null ? num2.equals(bowlingStatsList1.runsConceded) : bowlingStatsList1.runsConceded == null) && ((d = this.economyRate) != null ? d.equals(bowlingStatsList1.economyRate) : bowlingStatsList1.economyRate == null)) {
                Double d2 = this.overs;
                Double d3 = bowlingStatsList1.overs;
                if (d2 == null) {
                    if (d3 == null) {
                        return true;
                    }
                } else if (d2.equals(d3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.wickets;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.runsConceded;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Double d = this.economyRate;
                int hashCode4 = (hashCode3 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.overs;
                if (d2 != null) {
                    i = d2.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlingStatsList1> {
            @Override 
            public BowlingStatsList1 map(ResponseReader responseReader) {
                return new BowlingStatsList1(responseReader.readString(BowlingStatsList1.$responseFields[0]), responseReader.readInt(BowlingStatsList1.$responseFields[1]), responseReader.readInt(BowlingStatsList1.$responseFields[2]), responseReader.readDouble(BowlingStatsList1.$responseFields[3]), responseReader.readDouble(BowlingStatsList1.$responseFields[4]));
            }
        }
    }

    public static class FieldingStatsList1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runsOuts", "runsOuts", null, true, Collections.emptyList()), ResponseField.forInt("catches", "catches", null, true, Collections.emptyList()), ResponseField.forInt("stumps", "stumps", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer catches;
        final Integer runsOuts;
        final Integer stumps;

        public FieldingStatsList1(String str, Integer num, Integer num2, Integer num3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runsOuts = num;
            this.catches = num2;
            this.stumps = num3;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runsOuts() {
            return this.runsOuts;
        }

        public Integer catches() {
            return this.catches;
        }

        public Integer stumps() {
            return this.stumps;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(FieldingStatsList1.$responseFields[0], FieldingStatsList1.this.__typename);
                    responseWriter.writeInt(FieldingStatsList1.$responseFields[1], FieldingStatsList1.this.runsOuts);
                    responseWriter.writeInt(FieldingStatsList1.$responseFields[2], FieldingStatsList1.this.catches);
                    responseWriter.writeInt(FieldingStatsList1.$responseFields[3], FieldingStatsList1.this.stumps);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FieldingStatsList1{__typename=" + this.__typename + ", runsOuts=" + this.runsOuts + ", catches=" + this.catches + ", stumps=" + this.stumps + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FieldingStatsList1)) {
                return false;
            }
            FieldingStatsList1 fieldingStatsList1 = (FieldingStatsList1) obj;
            if (this.__typename.equals(fieldingStatsList1.__typename) && ((num = this.runsOuts) != null ? num.equals(fieldingStatsList1.runsOuts) : fieldingStatsList1.runsOuts == null) && ((num2 = this.catches) != null ? num2.equals(fieldingStatsList1.catches) : fieldingStatsList1.catches == null)) {
                Integer num3 = this.stumps;
                Integer num4 = fieldingStatsList1.stumps;
                if (num3 == null) {
                    if (num4 == null) {
                        return true;
                    }
                } else if (num3.equals(num4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.runsOuts;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.catches;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.stumps;
                if (num3 != null) {
                    i = num3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<FieldingStatsList1> {
            @Override 
            public FieldingStatsList1 map(ResponseReader responseReader) {
                return new FieldingStatsList1(responseReader.readString(FieldingStatsList1.$responseFields[0]), responseReader.readInt(FieldingStatsList1.$responseFields[1]), responseReader.readInt(FieldingStatsList1.$responseFields[2]), responseReader.readInt(FieldingStatsList1.$responseFields[3]));
            }
        }
    }

    public static class InningWisePoints1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("inningWiseBattingPoints", "inningWiseBattingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseBowlingPoints", "inningWiseBowlingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseFieldingPoints", "inningWiseFieldingPoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Double> inningWiseBattingPoints;
        final List<Double> inningWiseBowlingPoints;
        final List<Double> inningWiseFieldingPoints;

        public InningWisePoints1(String str, List<Double> list, List<Double> list2, List<Double> list3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.inningWiseBattingPoints = list;
            this.inningWiseBowlingPoints = list2;
            this.inningWiseFieldingPoints = list3;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Double> inningWiseBattingPoints() {
            return this.inningWiseBattingPoints;
        }

        public List<Double> inningWiseBowlingPoints() {
            return this.inningWiseBowlingPoints;
        }

        public List<Double> inningWiseFieldingPoints() {
            return this.inningWiseFieldingPoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {
                

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(InningWisePoints1.$responseFields[0], InningWisePoints1.this.__typename);
                    responseWriter.writeList(InningWisePoints1.$responseFields[1], InningWisePoints1.this.inningWiseBattingPoints, new ResponseWriter.ListWriter() {
                     

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints1.$responseFields[2], InningWisePoints1.this.inningWiseBowlingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints1.$responseFields[3], InningWisePoints1.this.inningWiseFieldingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "InningWisePoints1{__typename=" + this.__typename + ", inningWiseBattingPoints=" + this.inningWiseBattingPoints + ", inningWiseBowlingPoints=" + this.inningWiseBowlingPoints + ", inningWiseFieldingPoints=" + this.inningWiseFieldingPoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<Double> list;
            List<Double> list2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InningWisePoints1)) {
                return false;
            }
            InningWisePoints1 inningWisePoints1 = (InningWisePoints1) obj;
            if (this.__typename.equals(inningWisePoints1.__typename) && ((list = this.inningWiseBattingPoints) != null ? list.equals(inningWisePoints1.inningWiseBattingPoints) : inningWisePoints1.inningWiseBattingPoints == null) && ((list2 = this.inningWiseBowlingPoints) != null ? list2.equals(inningWisePoints1.inningWiseBowlingPoints) : inningWisePoints1.inningWiseBowlingPoints == null)) {
                List<Double> list3 = this.inningWiseFieldingPoints;
                List<Double> list4 = inningWisePoints1.inningWiseFieldingPoints;
                if (list3 == null) {
                    if (list4 == null) {
                        return true;
                    }
                } else if (list3.equals(list4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<Double> list = this.inningWiseBattingPoints;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Double> list2 = this.inningWiseBowlingPoints;
                int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<Double> list3 = this.inningWiseFieldingPoints;
                if (list3 != null) {
                    i = list3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<InningWisePoints1> {
            @Override 
            public InningWisePoints1 map(ResponseReader responseReader) {
                return new InningWisePoints1(responseReader.readString(InningWisePoints1.$responseFields[0]), responseReader.readList(InningWisePoints1.$responseFields[1], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints1.$responseFields[2], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints1.$responseFields[3], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }));
            }
        }
    }

    public static class HomeTeamData {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forObject("batsmanSummary1", "batsmanSummary1", null, true, Collections.emptyList()), ResponseField.forObject("batsmanSummary2", "batsmanSummary2", null, true, Collections.emptyList()), ResponseField.forObject("bowlerSummary1", "bowlerSummary1", null, true, Collections.emptyList()), ResponseField.forObject("bowlerSummary2", "bowlerSummary2", null, true, Collections.emptyList()), ResponseField.forList("overs", "overs", null, true, Collections.emptyList()), ResponseField.forList("runs", "runs", null, true, Collections.emptyList()), ResponseField.forList("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, true, Collections.emptyList()), ResponseField.forString("teamShortName", "teamShortName", null, true, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final BatsmanSummary1 batsmanSummary1;
        final BatsmanSummary2 batsmanSummary2;
        final BowlerSummary1 bowlerSummary1;
        final BowlerSummary2 bowlerSummary2;
        final List<String> overs;
        final List<String> runs;
        final String teamID;
        final String teamName;
        final String teamShortName;
        final List<String> wickets;

        public HomeTeamData(String str, BatsmanSummary1 batsmanSummary12, BatsmanSummary2 batsmanSummary22, BowlerSummary1 bowlerSummary12, BowlerSummary2 bowlerSummary22, List<String> list, List<String> list2, List<String> list3, String str2, String str3, String str4) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.batsmanSummary1 = batsmanSummary12;
            this.batsmanSummary2 = batsmanSummary22;
            this.bowlerSummary1 = bowlerSummary12;
            this.bowlerSummary2 = bowlerSummary22;
            this.overs = list;
            this.runs = list2;
            this.wickets = list3;
            this.teamName = str2;
            this.teamShortName = str3;
            this.teamID = str4;
        }

        public String __typename() {
            return this.__typename;
        }

        public BatsmanSummary1 batsmanSummary1() {
            return this.batsmanSummary1;
        }

        public BatsmanSummary2 batsmanSummary2() {
            return this.batsmanSummary2;
        }

        public BowlerSummary1 bowlerSummary1() {
            return this.bowlerSummary1;
        }

        public BowlerSummary2 bowlerSummary2() {
            return this.bowlerSummary2;
        }

        public List<String> overs() {
            return this.overs;
        }

        public List<String> runs() {
            return this.runs;
        }

        public List<String> wickets() {
            return this.wickets;
        }

        public String teamName() {
            return this.teamName;
        }

        public String teamShortName() {
            return this.teamShortName;
        }

        public String teamID() {
            return this.teamID;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(HomeTeamData.$responseFields[0], HomeTeamData.this.__typename);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(HomeTeamData.$responseFields[1], HomeTeamData.this.batsmanSummary1 != null ? HomeTeamData.this.batsmanSummary1.marshaller() : null);
                    responseWriter.writeObject(HomeTeamData.$responseFields[2], HomeTeamData.this.batsmanSummary2 != null ? HomeTeamData.this.batsmanSummary2.marshaller() : null);
                    responseWriter.writeObject(HomeTeamData.$responseFields[3], HomeTeamData.this.bowlerSummary1 != null ? HomeTeamData.this.bowlerSummary1.marshaller() : null);
                    ResponseField responseField = HomeTeamData.$responseFields[4];
                    if (HomeTeamData.this.bowlerSummary2 != null) {
                        responseFieldMarshaller = HomeTeamData.this.bowlerSummary2.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                    responseWriter.writeList(HomeTeamData.$responseFields[5], HomeTeamData.this.overs, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(HomeTeamData.$responseFields[6], HomeTeamData.this.runs, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(HomeTeamData.$responseFields[7], HomeTeamData.this.wickets, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    });
                    responseWriter.writeString(HomeTeamData.$responseFields[8], HomeTeamData.this.teamName);
                    responseWriter.writeString(HomeTeamData.$responseFields[9], HomeTeamData.this.teamShortName);
                    responseWriter.writeString(HomeTeamData.$responseFields[10], HomeTeamData.this.teamID);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "HomeTeamData{__typename=" + this.__typename + ", batsmanSummary1=" + this.batsmanSummary1 + ", batsmanSummary2=" + this.batsmanSummary2 + ", bowlerSummary1=" + this.bowlerSummary1 + ", bowlerSummary2=" + this.bowlerSummary2 + ", overs=" + this.overs + ", runs=" + this.runs + ", wickets=" + this.wickets + ", teamName=" + this.teamName + ", teamShortName=" + this.teamShortName + ", teamID=" + this.teamID + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            BatsmanSummary1 batsmanSummary12;
            BatsmanSummary2 batsmanSummary22;
            BowlerSummary1 bowlerSummary12;
            BowlerSummary2 bowlerSummary22;
            List<String> list;
            List<String> list2;
            List<String> list3;
            String str;
            String str2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeTeamData)) {
                return false;
            }
            HomeTeamData homeTeamData = (HomeTeamData) obj;
            if (this.__typename.equals(homeTeamData.__typename) && ((batsmanSummary12 = this.batsmanSummary1) != null ? batsmanSummary12.equals(homeTeamData.batsmanSummary1) : homeTeamData.batsmanSummary1 == null) && ((batsmanSummary22 = this.batsmanSummary2) != null ? batsmanSummary22.equals(homeTeamData.batsmanSummary2) : homeTeamData.batsmanSummary2 == null) && ((bowlerSummary12 = this.bowlerSummary1) != null ? bowlerSummary12.equals(homeTeamData.bowlerSummary1) : homeTeamData.bowlerSummary1 == null) && ((bowlerSummary22 = this.bowlerSummary2) != null ? bowlerSummary22.equals(homeTeamData.bowlerSummary2) : homeTeamData.bowlerSummary2 == null) && ((list = this.overs) != null ? list.equals(homeTeamData.overs) : homeTeamData.overs == null) && ((list2 = this.runs) != null ? list2.equals(homeTeamData.runs) : homeTeamData.runs == null) && ((list3 = this.wickets) != null ? list3.equals(homeTeamData.wickets) : homeTeamData.wickets == null) && ((str = this.teamName) != null ? str.equals(homeTeamData.teamName) : homeTeamData.teamName == null) && ((str2 = this.teamShortName) != null ? str2.equals(homeTeamData.teamShortName) : homeTeamData.teamShortName == null)) {
                String str3 = this.teamID;
                String str4 = homeTeamData.teamID;
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
                BatsmanSummary1 batsmanSummary12 = this.batsmanSummary1;
                int i = 0;
                int hashCode2 = (hashCode ^ (batsmanSummary12 == null ? 0 : batsmanSummary12.hashCode())) * 1000003;
                BatsmanSummary2 batsmanSummary22 = this.batsmanSummary2;
                int hashCode3 = (hashCode2 ^ (batsmanSummary22 == null ? 0 : batsmanSummary22.hashCode())) * 1000003;
                BowlerSummary1 bowlerSummary12 = this.bowlerSummary1;
                int hashCode4 = (hashCode3 ^ (bowlerSummary12 == null ? 0 : bowlerSummary12.hashCode())) * 1000003;
                BowlerSummary2 bowlerSummary22 = this.bowlerSummary2;
                int hashCode5 = (hashCode4 ^ (bowlerSummary22 == null ? 0 : bowlerSummary22.hashCode())) * 1000003;
                List<String> list = this.overs;
                int hashCode6 = (hashCode5 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<String> list2 = this.runs;
                int hashCode7 = (hashCode6 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<String> list3 = this.wickets;
                int hashCode8 = (hashCode7 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                String str = this.teamName;
                int hashCode9 = (hashCode8 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.teamShortName;
                int hashCode10 = (hashCode9 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.teamID;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                this.$hashCode = hashCode10 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<HomeTeamData> {
            final BatsmanSummary1.Mapper batsmanSummary1FieldMapper = new BatsmanSummary1.Mapper();
            final BatsmanSummary2.Mapper batsmanSummary2FieldMapper = new BatsmanSummary2.Mapper();
            final BowlerSummary1.Mapper bowlerSummary1FieldMapper = new BowlerSummary1.Mapper();
            final BowlerSummary2.Mapper bowlerSummary2FieldMapper = new BowlerSummary2.Mapper();

            @Override 
            public HomeTeamData map(ResponseReader responseReader) {
                return new HomeTeamData(responseReader.readString(HomeTeamData.$responseFields[0]), (BatsmanSummary1) responseReader.readObject(HomeTeamData.$responseFields[1], new ResponseReader.ObjectReader<BatsmanSummary1>() {


                    @Override 
                    public BatsmanSummary1 read(ResponseReader responseReader) {
                        return Mapper.this.batsmanSummary1FieldMapper.map(responseReader);
                    }
                }), (BatsmanSummary2) responseReader.readObject(HomeTeamData.$responseFields[2], new ResponseReader.ObjectReader<BatsmanSummary2>() {


                    @Override 
                    public BatsmanSummary2 read(ResponseReader responseReader) {
                        return Mapper.this.batsmanSummary2FieldMapper.map(responseReader);
                    }
                }), (BowlerSummary1) responseReader.readObject(HomeTeamData.$responseFields[3], new ResponseReader.ObjectReader<BowlerSummary1>() {


                    @Override 
                    public BowlerSummary1 read(ResponseReader responseReader) {
                        return Mapper.this.bowlerSummary1FieldMapper.map(responseReader);
                    }
                }), (BowlerSummary2) responseReader.readObject(HomeTeamData.$responseFields[4], new ResponseReader.ObjectReader<BowlerSummary2>() {


                    @Override 
                    public BowlerSummary2 read(ResponseReader responseReader) {
                        return Mapper.this.bowlerSummary2FieldMapper.map(responseReader);
                    }
                }), responseReader.readList(HomeTeamData.$responseFields[5], new ResponseReader.ListReader<String>() {


                    @Override 
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readList(HomeTeamData.$responseFields[6], new ResponseReader.ListReader<String>() {


                    @Override 
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readList(HomeTeamData.$responseFields[7], new ResponseReader.ListReader<String>() {


                    @Override 
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(HomeTeamData.$responseFields[8]), responseReader.readString(HomeTeamData.$responseFields[9]), responseReader.readString(HomeTeamData.$responseFields[10]));
            }
        }
    }

    public static class BatsmanSummary1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forObject("topBatsman", "topBatsman", null, true, Collections.emptyList()), ResponseField.forObject("runnerBatsman", "runnerBatsman", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final RunnerBatsman runnerBatsman;
        final TopBatsman topBatsman;

        public BatsmanSummary1(String str, TopBatsman topBatsman2, RunnerBatsman runnerBatsman2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.topBatsman = topBatsman2;
            this.runnerBatsman = runnerBatsman2;
        }

        public String __typename() {
            return this.__typename;
        }

        public TopBatsman topBatsman() {
            return this.topBatsman;
        }

        public RunnerBatsman runnerBatsman() {
            return this.runnerBatsman;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BatsmanSummary1.$responseFields[0], BatsmanSummary1.this.__typename);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(BatsmanSummary1.$responseFields[1], BatsmanSummary1.this.topBatsman != null ? BatsmanSummary1.this.topBatsman.marshaller() : null);
                    ResponseField responseField = BatsmanSummary1.$responseFields[2];
                    if (BatsmanSummary1.this.runnerBatsman != null) {
                        responseFieldMarshaller = BatsmanSummary1.this.runnerBatsman.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BatsmanSummary1{__typename=" + this.__typename + ", topBatsman=" + this.topBatsman + ", runnerBatsman=" + this.runnerBatsman + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            TopBatsman topBatsman2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BatsmanSummary1)) {
                return false;
            }
            BatsmanSummary1 batsmanSummary1 = (BatsmanSummary1) obj;
            if (this.__typename.equals(batsmanSummary1.__typename) && ((topBatsman2 = this.topBatsman) != null ? topBatsman2.equals(batsmanSummary1.topBatsman) : batsmanSummary1.topBatsman == null)) {
                RunnerBatsman runnerBatsman2 = this.runnerBatsman;
                RunnerBatsman runnerBatsman3 = batsmanSummary1.runnerBatsman;
                if (runnerBatsman2 == null) {
                    if (runnerBatsman3 == null) {
                        return true;
                    }
                } else if (runnerBatsman2.equals(runnerBatsman3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                TopBatsman topBatsman2 = this.topBatsman;
                int i = 0;
                int hashCode2 = (hashCode ^ (topBatsman2 == null ? 0 : topBatsman2.hashCode())) * 1000003;
                RunnerBatsman runnerBatsman2 = this.runnerBatsman;
                if (runnerBatsman2 != null) {
                    i = runnerBatsman2.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BatsmanSummary1> {
            final RunnerBatsman.Mapper runnerBatsmanFieldMapper = new RunnerBatsman.Mapper();
            final TopBatsman.Mapper topBatsmanFieldMapper = new TopBatsman.Mapper();

            @Override 
            public BatsmanSummary1 map(ResponseReader responseReader) {
                return new BatsmanSummary1(responseReader.readString(BatsmanSummary1.$responseFields[0]), (TopBatsman) responseReader.readObject(BatsmanSummary1.$responseFields[1], new ResponseReader.ObjectReader<TopBatsman>() {


                    @Override 
                    public TopBatsman read(ResponseReader responseReader) {
                        return Mapper.this.topBatsmanFieldMapper.map(responseReader);
                    }
                }), (RunnerBatsman) responseReader.readObject(BatsmanSummary1.$responseFields[2], new ResponseReader.ObjectReader<RunnerBatsman>() {


                    @Override 
                    public RunnerBatsman read(ResponseReader responseReader) {
                        return Mapper.this.runnerBatsmanFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class TopBatsman {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerNameHindi", "playerNameHindi", null, true, Collections.emptyList()), ResponseField.forString("playerTeam", "playerTeam", null, true, Collections.emptyList()), ResponseField.forString("playerTeamID", "playerTeamID", null, true, Collections.emptyList()), ResponseField.forDouble("totalBattingPoints", "totalBattingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalPoints", "totalPoints", null, true, Collections.emptyList()), ResponseField.forList("battingStatsList", "battingStatsList", null, true, Collections.emptyList()), ResponseField.forDouble("totalBowlingPoints", "totalBowlingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalFieldingPoints", "totalFieldingPoints", null, true, Collections.emptyList()), ResponseField.forList("bowlingStatsList", "bowlingStatsList", null, true, Collections.emptyList()), ResponseField.forList("fieldingStatsList", "fieldingStatsList", null, true, Collections.emptyList()), ResponseField.forObject("inningWisePoints", "inningWisePoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<BattingStatsList2> battingStatsList;
        final List<BowlingStatsList2> bowlingStatsList;
        final List<FieldingStatsList2> fieldingStatsList;
        final InningWisePoints2 inningWisePoints;
        final String playerID;
        final String playerName;
        final String playerNameHindi;
        final String playerTeam;
        final String playerTeamID;
        final Double totalBattingPoints;
        final Double totalBowlingPoints;
        final Double totalFieldingPoints;
        final Double totalPoints;

        public TopBatsman(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, List<BattingStatsList2> list, Double d3, Double d4, List<BowlingStatsList2> list2, List<FieldingStatsList2> list3, InningWisePoints2 inningWisePoints2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerName = str3;
            this.playerNameHindi = str4;
            this.playerTeam = str5;
            this.playerTeamID = str6;
            this.totalBattingPoints = d;
            this.totalPoints = d2;
            this.battingStatsList = list;
            this.totalBowlingPoints = d3;
            this.totalFieldingPoints = d4;
            this.bowlingStatsList = list2;
            this.fieldingStatsList = list3;
            this.inningWisePoints = inningWisePoints2;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerID() {
            return this.playerID;
        }

        public String playerName() {
            return this.playerName;
        }

        public String playerNameHindi() {
            return this.playerNameHindi;
        }

        public String playerTeam() {
            return this.playerTeam;
        }

        public String playerTeamID() {
            return this.playerTeamID;
        }

        public Double totalBattingPoints() {
            return this.totalBattingPoints;
        }

        public Double totalPoints() {
            return this.totalPoints;
        }

        public List<BattingStatsList2> battingStatsList() {
            return this.battingStatsList;
        }

        public Double totalBowlingPoints() {
            return this.totalBowlingPoints;
        }

        public Double totalFieldingPoints() {
            return this.totalFieldingPoints;
        }

        public List<BowlingStatsList2> bowlingStatsList() {
            return this.bowlingStatsList;
        }

        public List<FieldingStatsList2> fieldingStatsList() {
            return this.fieldingStatsList;
        }

        public InningWisePoints2 inningWisePoints() {
            return this.inningWisePoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TopBatsman.$responseFields[0], TopBatsman.this.__typename);
                    responseWriter.writeString(TopBatsman.$responseFields[1], TopBatsman.this.playerID);
                    responseWriter.writeString(TopBatsman.$responseFields[2], TopBatsman.this.playerName);
                    responseWriter.writeString(TopBatsman.$responseFields[3], TopBatsman.this.playerNameHindi);
                    responseWriter.writeString(TopBatsman.$responseFields[4], TopBatsman.this.playerTeam);
                    responseWriter.writeString(TopBatsman.$responseFields[5], TopBatsman.this.playerTeamID);
                    responseWriter.writeDouble(TopBatsman.$responseFields[6], TopBatsman.this.totalBattingPoints);
                    responseWriter.writeDouble(TopBatsman.$responseFields[7], TopBatsman.this.totalPoints);
                    responseWriter.writeList(TopBatsman.$responseFields[8], TopBatsman.this.battingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BattingStatsList2) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeDouble(TopBatsman.$responseFields[9], TopBatsman.this.totalBowlingPoints);
                    responseWriter.writeDouble(TopBatsman.$responseFields[10], TopBatsman.this.totalFieldingPoints);
                    responseWriter.writeList(TopBatsman.$responseFields[11], TopBatsman.this.bowlingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BowlingStatsList2) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(TopBatsman.$responseFields[12], TopBatsman.this.fieldingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((FieldingStatsList2) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeObject(TopBatsman.$responseFields[13], TopBatsman.this.inningWisePoints != null ? TopBatsman.this.inningWisePoints.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TopBatsman{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerNameHindi=" + this.playerNameHindi + ", playerTeam=" + this.playerTeam + ", playerTeamID=" + this.playerTeamID + ", totalBattingPoints=" + this.totalBattingPoints + ", totalPoints=" + this.totalPoints + ", battingStatsList=" + this.battingStatsList + ", totalBowlingPoints=" + this.totalBowlingPoints + ", totalFieldingPoints=" + this.totalFieldingPoints + ", bowlingStatsList=" + this.bowlingStatsList + ", fieldingStatsList=" + this.fieldingStatsList + ", inningWisePoints=" + this.inningWisePoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Double d;
            Double d2;
            List<BattingStatsList2> list;
            Double d3;
            Double d4;
            List<BowlingStatsList2> list2;
            List<FieldingStatsList2> list3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TopBatsman)) {
                return false;
            }
            TopBatsman topBatsman = (TopBatsman) obj;
            if (this.__typename.equals(topBatsman.__typename) && ((str = this.playerID) != null ? str.equals(topBatsman.playerID) : topBatsman.playerID == null) && ((str2 = this.playerName) != null ? str2.equals(topBatsman.playerName) : topBatsman.playerName == null) && ((str3 = this.playerNameHindi) != null ? str3.equals(topBatsman.playerNameHindi) : topBatsman.playerNameHindi == null) && ((str4 = this.playerTeam) != null ? str4.equals(topBatsman.playerTeam) : topBatsman.playerTeam == null) && ((str5 = this.playerTeamID) != null ? str5.equals(topBatsman.playerTeamID) : topBatsman.playerTeamID == null) && ((d = this.totalBattingPoints) != null ? d.equals(topBatsman.totalBattingPoints) : topBatsman.totalBattingPoints == null) && ((d2 = this.totalPoints) != null ? d2.equals(topBatsman.totalPoints) : topBatsman.totalPoints == null) && ((list = this.battingStatsList) != null ? list.equals(topBatsman.battingStatsList) : topBatsman.battingStatsList == null) && ((d3 = this.totalBowlingPoints) != null ? d3.equals(topBatsman.totalBowlingPoints) : topBatsman.totalBowlingPoints == null) && ((d4 = this.totalFieldingPoints) != null ? d4.equals(topBatsman.totalFieldingPoints) : topBatsman.totalFieldingPoints == null) && ((list2 = this.bowlingStatsList) != null ? list2.equals(topBatsman.bowlingStatsList) : topBatsman.bowlingStatsList == null) && ((list3 = this.fieldingStatsList) != null ? list3.equals(topBatsman.fieldingStatsList) : topBatsman.fieldingStatsList == null)) {
                InningWisePoints2 inningWisePoints2 = this.inningWisePoints;
                InningWisePoints2 inningWisePoints22 = topBatsman.inningWisePoints;
                if (inningWisePoints2 == null) {
                    if (inningWisePoints22 == null) {
                        return true;
                    }
                } else if (inningWisePoints2.equals(inningWisePoints22)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.playerID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerNameHindi;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerTeam;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerTeamID;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Double d = this.totalBattingPoints;
                int hashCode7 = (hashCode6 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.totalPoints;
                int hashCode8 = (hashCode7 ^ (d2 == null ? 0 : d2.hashCode())) * 1000003;
                List<BattingStatsList2> list = this.battingStatsList;
                int hashCode9 = (hashCode8 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                Double d3 = this.totalBowlingPoints;
                int hashCode10 = (hashCode9 ^ (d3 == null ? 0 : d3.hashCode())) * 1000003;
                Double d4 = this.totalFieldingPoints;
                int hashCode11 = (hashCode10 ^ (d4 == null ? 0 : d4.hashCode())) * 1000003;
                List<BowlingStatsList2> list2 = this.bowlingStatsList;
                int hashCode12 = (hashCode11 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<FieldingStatsList2> list3 = this.fieldingStatsList;
                int hashCode13 = (hashCode12 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                InningWisePoints2 inningWisePoints2 = this.inningWisePoints;
                if (inningWisePoints2 != null) {
                    i = inningWisePoints2.hashCode();
                }
                this.$hashCode = hashCode13 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TopBatsman> {
            final BattingStatsList2.Mapper battingStatsList2FieldMapper = new BattingStatsList2.Mapper();
            final BowlingStatsList2.Mapper bowlingStatsList2FieldMapper = new BowlingStatsList2.Mapper();
            final FieldingStatsList2.Mapper fieldingStatsList2FieldMapper = new FieldingStatsList2.Mapper();
            final InningWisePoints2.Mapper inningWisePoints2FieldMapper = new InningWisePoints2.Mapper();

            @Override 
            public TopBatsman map(ResponseReader responseReader) {
                return new TopBatsman(responseReader.readString(TopBatsman.$responseFields[0]), responseReader.readString(TopBatsman.$responseFields[1]), responseReader.readString(TopBatsman.$responseFields[2]), responseReader.readString(TopBatsman.$responseFields[3]), responseReader.readString(TopBatsman.$responseFields[4]), responseReader.readString(TopBatsman.$responseFields[5]), responseReader.readDouble(TopBatsman.$responseFields[6]), responseReader.readDouble(TopBatsman.$responseFields[7]), responseReader.readList(TopBatsman.$responseFields[8], new ResponseReader.ListReader<BattingStatsList2>() {


                    @Override 
                    public BattingStatsList2 read(ResponseReader.ListItemReader listItemReader) {
                        return (BattingStatsList2) listItemReader.readObject(new ResponseReader.ObjectReader<BattingStatsList2>() {


                            @Override 
                            public BattingStatsList2 read(ResponseReader responseReader) {
                                return Mapper.this.battingStatsList2FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readDouble(TopBatsman.$responseFields[9]), responseReader.readDouble(TopBatsman.$responseFields[10]), responseReader.readList(TopBatsman.$responseFields[11], new ResponseReader.ListReader<BowlingStatsList2>() {


                    @Override 
                    public BowlingStatsList2 read(ResponseReader.ListItemReader listItemReader) {
                        return (BowlingStatsList2) listItemReader.readObject(new ResponseReader.ObjectReader<BowlingStatsList2>() {


                            @Override 
                            public BowlingStatsList2 read(ResponseReader responseReader) {
                                return Mapper.this.bowlingStatsList2FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(TopBatsman.$responseFields[12], new ResponseReader.ListReader<FieldingStatsList2>() {


                    @Override 
                    public FieldingStatsList2 read(ResponseReader.ListItemReader listItemReader) {
                        return (FieldingStatsList2) listItemReader.readObject(new ResponseReader.ObjectReader<FieldingStatsList2>() {


                            @Override 
                            public FieldingStatsList2 read(ResponseReader responseReader) {
                                return Mapper.this.fieldingStatsList2FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (InningWisePoints2) responseReader.readObject(TopBatsman.$responseFields[13], new ResponseReader.ObjectReader<InningWisePoints2>() {


                    @Override 
                    public InningWisePoints2 read(ResponseReader responseReader) {
                        return Mapper.this.inningWisePoints2FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class BattingStatsList2 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runs", "runs", null, true, Collections.emptyList()), ResponseField.forInt("fours", "fours", null, true, Collections.emptyList()), ResponseField.forInt("sixes", "sixes", null, true, Collections.emptyList()), ResponseField.forInt("balls", "balls", null, true, Collections.emptyList()), ResponseField.forDouble("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forBoolean("isNotOut", "isNotOut", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer balls;
        final Integer fours;
        final Boolean isNotOut;
        final Integer runs;
        final Integer sixes;
        final Double strikeRate;

        public BattingStatsList2(String str, Integer num, Integer num2, Integer num3, Integer num4, Double d, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runs = num;
            this.fours = num2;
            this.sixes = num3;
            this.balls = num4;
            this.strikeRate = d;
            this.isNotOut = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runs() {
            return this.runs;
        }

        public Integer fours() {
            return this.fours;
        }

        public Integer sixes() {
            return this.sixes;
        }

        public Integer balls() {
            return this.balls;
        }

        public Double strikeRate() {
            return this.strikeRate;
        }

        public Boolean isNotOut() {
            return this.isNotOut;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BattingStatsList2.$responseFields[0], BattingStatsList2.this.__typename);
                    responseWriter.writeInt(BattingStatsList2.$responseFields[1], BattingStatsList2.this.runs);
                    responseWriter.writeInt(BattingStatsList2.$responseFields[2], BattingStatsList2.this.fours);
                    responseWriter.writeInt(BattingStatsList2.$responseFields[3], BattingStatsList2.this.sixes);
                    responseWriter.writeInt(BattingStatsList2.$responseFields[4], BattingStatsList2.this.balls);
                    responseWriter.writeDouble(BattingStatsList2.$responseFields[5], BattingStatsList2.this.strikeRate);
                    responseWriter.writeBoolean(BattingStatsList2.$responseFields[6], BattingStatsList2.this.isNotOut);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BattingStatsList2{__typename=" + this.__typename + ", runs=" + this.runs + ", fours=" + this.fours + ", sixes=" + this.sixes + ", balls=" + this.balls + ", strikeRate=" + this.strikeRate + ", isNotOut=" + this.isNotOut + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattingStatsList2)) {
                return false;
            }
            BattingStatsList2 battingStatsList2 = (BattingStatsList2) obj;
            if (this.__typename.equals(battingStatsList2.__typename) && ((num = this.runs) != null ? num.equals(battingStatsList2.runs) : battingStatsList2.runs == null) && ((num2 = this.fours) != null ? num2.equals(battingStatsList2.fours) : battingStatsList2.fours == null) && ((num3 = this.sixes) != null ? num3.equals(battingStatsList2.sixes) : battingStatsList2.sixes == null) && ((num4 = this.balls) != null ? num4.equals(battingStatsList2.balls) : battingStatsList2.balls == null) && ((d = this.strikeRate) != null ? d.equals(battingStatsList2.strikeRate) : battingStatsList2.strikeRate == null)) {
                Boolean bool = this.isNotOut;
                Boolean bool2 = battingStatsList2.isNotOut;
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
                Integer num = this.runs;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.fours;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.sixes;
                int hashCode4 = (hashCode3 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.balls;
                int hashCode5 = (hashCode4 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Double d = this.strikeRate;
                int hashCode6 = (hashCode5 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Boolean bool = this.isNotOut;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BattingStatsList2> {
            @Override 
            public BattingStatsList2 map(ResponseReader responseReader) {
                return new BattingStatsList2(responseReader.readString(BattingStatsList2.$responseFields[0]), responseReader.readInt(BattingStatsList2.$responseFields[1]), responseReader.readInt(BattingStatsList2.$responseFields[2]), responseReader.readInt(BattingStatsList2.$responseFields[3]), responseReader.readInt(BattingStatsList2.$responseFields[4]), responseReader.readDouble(BattingStatsList2.$responseFields[5]), responseReader.readBoolean(BattingStatsList2.$responseFields[6]));
            }
        }
    }

    public static class BowlingStatsList2 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forInt("runsConceded", "runsConceded", null, true, Collections.emptyList()), ResponseField.forDouble("economyRate", "economyRate", null, true, Collections.emptyList()), ResponseField.forDouble("overs", "overs", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double economyRate;
        final Double overs;
        final Integer runsConceded;
        final Integer wickets;

        public BowlingStatsList2(String str, Integer num, Integer num2, Double d, Double d2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.wickets = num;
            this.runsConceded = num2;
            this.economyRate = d;
            this.overs = d2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer wickets() {
            return this.wickets;
        }

        public Integer runsConceded() {
            return this.runsConceded;
        }

        public Double economyRate() {
            return this.economyRate;
        }

        public Double overs() {
            return this.overs;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlingStatsList2.$responseFields[0], BowlingStatsList2.this.__typename);
                    responseWriter.writeInt(BowlingStatsList2.$responseFields[1], BowlingStatsList2.this.wickets);
                    responseWriter.writeInt(BowlingStatsList2.$responseFields[2], BowlingStatsList2.this.runsConceded);
                    responseWriter.writeDouble(BowlingStatsList2.$responseFields[3], BowlingStatsList2.this.economyRate);
                    responseWriter.writeDouble(BowlingStatsList2.$responseFields[4], BowlingStatsList2.this.overs);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlingStatsList2{__typename=" + this.__typename + ", wickets=" + this.wickets + ", runsConceded=" + this.runsConceded + ", economyRate=" + this.economyRate + ", overs=" + this.overs + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlingStatsList2)) {
                return false;
            }
            BowlingStatsList2 bowlingStatsList2 = (BowlingStatsList2) obj;
            if (this.__typename.equals(bowlingStatsList2.__typename) && ((num = this.wickets) != null ? num.equals(bowlingStatsList2.wickets) : bowlingStatsList2.wickets == null) && ((num2 = this.runsConceded) != null ? num2.equals(bowlingStatsList2.runsConceded) : bowlingStatsList2.runsConceded == null) && ((d = this.economyRate) != null ? d.equals(bowlingStatsList2.economyRate) : bowlingStatsList2.economyRate == null)) {
                Double d2 = this.overs;
                Double d3 = bowlingStatsList2.overs;
                if (d2 == null) {
                    if (d3 == null) {
                        return true;
                    }
                } else if (d2.equals(d3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.wickets;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.runsConceded;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Double d = this.economyRate;
                int hashCode4 = (hashCode3 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.overs;
                if (d2 != null) {
                    i = d2.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlingStatsList2> {
            @Override 
            public BowlingStatsList2 map(ResponseReader responseReader) {
                return new BowlingStatsList2(responseReader.readString(BowlingStatsList2.$responseFields[0]), responseReader.readInt(BowlingStatsList2.$responseFields[1]), responseReader.readInt(BowlingStatsList2.$responseFields[2]), responseReader.readDouble(BowlingStatsList2.$responseFields[3]), responseReader.readDouble(BowlingStatsList2.$responseFields[4]));
            }
        }
    }

    public static class FieldingStatsList2 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runsOuts", "runsOuts", null, true, Collections.emptyList()), ResponseField.forInt("catches", "catches", null, true, Collections.emptyList()), ResponseField.forInt("stumps", "stumps", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer catches;
        final Integer runsOuts;
        final Integer stumps;

        public FieldingStatsList2(String str, Integer num, Integer num2, Integer num3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runsOuts = num;
            this.catches = num2;
            this.stumps = num3;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runsOuts() {
            return this.runsOuts;
        }

        public Integer catches() {
            return this.catches;
        }

        public Integer stumps() {
            return this.stumps;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(FieldingStatsList2.$responseFields[0], FieldingStatsList2.this.__typename);
                    responseWriter.writeInt(FieldingStatsList2.$responseFields[1], FieldingStatsList2.this.runsOuts);
                    responseWriter.writeInt(FieldingStatsList2.$responseFields[2], FieldingStatsList2.this.catches);
                    responseWriter.writeInt(FieldingStatsList2.$responseFields[3], FieldingStatsList2.this.stumps);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FieldingStatsList2{__typename=" + this.__typename + ", runsOuts=" + this.runsOuts + ", catches=" + this.catches + ", stumps=" + this.stumps + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FieldingStatsList2)) {
                return false;
            }
            FieldingStatsList2 fieldingStatsList2 = (FieldingStatsList2) obj;
            if (this.__typename.equals(fieldingStatsList2.__typename) && ((num = this.runsOuts) != null ? num.equals(fieldingStatsList2.runsOuts) : fieldingStatsList2.runsOuts == null) && ((num2 = this.catches) != null ? num2.equals(fieldingStatsList2.catches) : fieldingStatsList2.catches == null)) {
                Integer num3 = this.stumps;
                Integer num4 = fieldingStatsList2.stumps;
                if (num3 == null) {
                    if (num4 == null) {
                        return true;
                    }
                } else if (num3.equals(num4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.runsOuts;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.catches;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.stumps;
                if (num3 != null) {
                    i = num3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<FieldingStatsList2> {
            @Override 
            public FieldingStatsList2 map(ResponseReader responseReader) {
                return new FieldingStatsList2(responseReader.readString(FieldingStatsList2.$responseFields[0]), responseReader.readInt(FieldingStatsList2.$responseFields[1]), responseReader.readInt(FieldingStatsList2.$responseFields[2]), responseReader.readInt(FieldingStatsList2.$responseFields[3]));
            }
        }
    }

    public static class InningWisePoints2 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("inningWiseBattingPoints", "inningWiseBattingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseBowlingPoints", "inningWiseBowlingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseFieldingPoints", "inningWiseFieldingPoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Double> inningWiseBattingPoints;
        final List<Double> inningWiseBowlingPoints;
        final List<Double> inningWiseFieldingPoints;

        public InningWisePoints2(String str, List<Double> list, List<Double> list2, List<Double> list3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.inningWiseBattingPoints = list;
            this.inningWiseBowlingPoints = list2;
            this.inningWiseFieldingPoints = list3;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Double> inningWiseBattingPoints() {
            return this.inningWiseBattingPoints;
        }

        public List<Double> inningWiseBowlingPoints() {
            return this.inningWiseBowlingPoints;
        }

        public List<Double> inningWiseFieldingPoints() {
            return this.inningWiseFieldingPoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(InningWisePoints2.$responseFields[0], InningWisePoints2.this.__typename);
                    responseWriter.writeList(InningWisePoints2.$responseFields[1], InningWisePoints2.this.inningWiseBattingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints2.$responseFields[2], InningWisePoints2.this.inningWiseBowlingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints2.$responseFields[3], InningWisePoints2.this.inningWiseFieldingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "InningWisePoints2{__typename=" + this.__typename + ", inningWiseBattingPoints=" + this.inningWiseBattingPoints + ", inningWiseBowlingPoints=" + this.inningWiseBowlingPoints + ", inningWiseFieldingPoints=" + this.inningWiseFieldingPoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<Double> list;
            List<Double> list2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InningWisePoints2)) {
                return false;
            }
            InningWisePoints2 inningWisePoints2 = (InningWisePoints2) obj;
            if (this.__typename.equals(inningWisePoints2.__typename) && ((list = this.inningWiseBattingPoints) != null ? list.equals(inningWisePoints2.inningWiseBattingPoints) : inningWisePoints2.inningWiseBattingPoints == null) && ((list2 = this.inningWiseBowlingPoints) != null ? list2.equals(inningWisePoints2.inningWiseBowlingPoints) : inningWisePoints2.inningWiseBowlingPoints == null)) {
                List<Double> list3 = this.inningWiseFieldingPoints;
                List<Double> list4 = inningWisePoints2.inningWiseFieldingPoints;
                if (list3 == null) {
                    if (list4 == null) {
                        return true;
                    }
                } else if (list3.equals(list4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<Double> list = this.inningWiseBattingPoints;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Double> list2 = this.inningWiseBowlingPoints;
                int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<Double> list3 = this.inningWiseFieldingPoints;
                if (list3 != null) {
                    i = list3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<InningWisePoints2> {
            @Override 
            public InningWisePoints2 map(ResponseReader responseReader) {
                return new InningWisePoints2(responseReader.readString(InningWisePoints2.$responseFields[0]), responseReader.readList(InningWisePoints2.$responseFields[1], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints2.$responseFields[2], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints2.$responseFields[3], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }));
            }
        }
    }

    public static class RunnerBatsman {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerNameHindi", "playerNameHindi", null, true, Collections.emptyList()), ResponseField.forString("playerTeam", "playerTeam", null, true, Collections.emptyList()), ResponseField.forString("playerTeamID", "playerTeamID", null, true, Collections.emptyList()), ResponseField.forDouble("totalBattingPoints", "totalBattingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalPoints", "totalPoints", null, true, Collections.emptyList()), ResponseField.forList("battingStatsList", "battingStatsList", null, true, Collections.emptyList()), ResponseField.forDouble("totalBowlingPoints", "totalBowlingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalFieldingPoints", "totalFieldingPoints", null, true, Collections.emptyList()), ResponseField.forList("bowlingStatsList", "bowlingStatsList", null, true, Collections.emptyList()), ResponseField.forList("fieldingStatsList", "fieldingStatsList", null, true, Collections.emptyList()), ResponseField.forObject("inningWisePoints", "inningWisePoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<BattingStatsList3> battingStatsList;
        final List<BowlingStatsList3> bowlingStatsList;
        final List<FieldingStatsList3> fieldingStatsList;
        final InningWisePoints3 inningWisePoints;
        final String playerID;
        final String playerName;
        final String playerNameHindi;
        final String playerTeam;
        final String playerTeamID;
        final Double totalBattingPoints;
        final Double totalBowlingPoints;
        final Double totalFieldingPoints;
        final Double totalPoints;

        public RunnerBatsman(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, List<BattingStatsList3> list, Double d3, Double d4, List<BowlingStatsList3> list2, List<FieldingStatsList3> list3, InningWisePoints3 inningWisePoints3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerName = str3;
            this.playerNameHindi = str4;
            this.playerTeam = str5;
            this.playerTeamID = str6;
            this.totalBattingPoints = d;
            this.totalPoints = d2;
            this.battingStatsList = list;
            this.totalBowlingPoints = d3;
            this.totalFieldingPoints = d4;
            this.bowlingStatsList = list2;
            this.fieldingStatsList = list3;
            this.inningWisePoints = inningWisePoints3;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerID() {
            return this.playerID;
        }

        public String playerName() {
            return this.playerName;
        }

        public String playerNameHindi() {
            return this.playerNameHindi;
        }

        public String playerTeam() {
            return this.playerTeam;
        }

        public String playerTeamID() {
            return this.playerTeamID;
        }

        public Double totalBattingPoints() {
            return this.totalBattingPoints;
        }

        public Double totalPoints() {
            return this.totalPoints;
        }

        public List<BattingStatsList3> battingStatsList() {
            return this.battingStatsList;
        }

        public Double totalBowlingPoints() {
            return this.totalBowlingPoints;
        }

        public Double totalFieldingPoints() {
            return this.totalFieldingPoints;
        }

        public List<BowlingStatsList3> bowlingStatsList() {
            return this.bowlingStatsList;
        }

        public List<FieldingStatsList3> fieldingStatsList() {
            return this.fieldingStatsList;
        }

        public InningWisePoints3 inningWisePoints() {
            return this.inningWisePoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(RunnerBatsman.$responseFields[0], RunnerBatsman.this.__typename);
                    responseWriter.writeString(RunnerBatsman.$responseFields[1], RunnerBatsman.this.playerID);
                    responseWriter.writeString(RunnerBatsman.$responseFields[2], RunnerBatsman.this.playerName);
                    responseWriter.writeString(RunnerBatsman.$responseFields[3], RunnerBatsman.this.playerNameHindi);
                    responseWriter.writeString(RunnerBatsman.$responseFields[4], RunnerBatsman.this.playerTeam);
                    responseWriter.writeString(RunnerBatsman.$responseFields[5], RunnerBatsman.this.playerTeamID);
                    responseWriter.writeDouble(RunnerBatsman.$responseFields[6], RunnerBatsman.this.totalBattingPoints);
                    responseWriter.writeDouble(RunnerBatsman.$responseFields[7], RunnerBatsman.this.totalPoints);
                    responseWriter.writeList(RunnerBatsman.$responseFields[8], RunnerBatsman.this.battingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BattingStatsList3) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeDouble(RunnerBatsman.$responseFields[9], RunnerBatsman.this.totalBowlingPoints);
                    responseWriter.writeDouble(RunnerBatsman.$responseFields[10], RunnerBatsman.this.totalFieldingPoints);
                    responseWriter.writeList(RunnerBatsman.$responseFields[11], RunnerBatsman.this.bowlingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BowlingStatsList3) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(RunnerBatsman.$responseFields[12], RunnerBatsman.this.fieldingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((FieldingStatsList3) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeObject(RunnerBatsman.$responseFields[13], RunnerBatsman.this.inningWisePoints != null ? RunnerBatsman.this.inningWisePoints.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "RunnerBatsman{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerNameHindi=" + this.playerNameHindi + ", playerTeam=" + this.playerTeam + ", playerTeamID=" + this.playerTeamID + ", totalBattingPoints=" + this.totalBattingPoints + ", totalPoints=" + this.totalPoints + ", battingStatsList=" + this.battingStatsList + ", totalBowlingPoints=" + this.totalBowlingPoints + ", totalFieldingPoints=" + this.totalFieldingPoints + ", bowlingStatsList=" + this.bowlingStatsList + ", fieldingStatsList=" + this.fieldingStatsList + ", inningWisePoints=" + this.inningWisePoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Double d;
            Double d2;
            List<BattingStatsList3> list;
            Double d3;
            Double d4;
            List<BowlingStatsList3> list2;
            List<FieldingStatsList3> list3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RunnerBatsman)) {
                return false;
            }
            RunnerBatsman runnerBatsman = (RunnerBatsman) obj;
            if (this.__typename.equals(runnerBatsman.__typename) && ((str = this.playerID) != null ? str.equals(runnerBatsman.playerID) : runnerBatsman.playerID == null) && ((str2 = this.playerName) != null ? str2.equals(runnerBatsman.playerName) : runnerBatsman.playerName == null) && ((str3 = this.playerNameHindi) != null ? str3.equals(runnerBatsman.playerNameHindi) : runnerBatsman.playerNameHindi == null) && ((str4 = this.playerTeam) != null ? str4.equals(runnerBatsman.playerTeam) : runnerBatsman.playerTeam == null) && ((str5 = this.playerTeamID) != null ? str5.equals(runnerBatsman.playerTeamID) : runnerBatsman.playerTeamID == null) && ((d = this.totalBattingPoints) != null ? d.equals(runnerBatsman.totalBattingPoints) : runnerBatsman.totalBattingPoints == null) && ((d2 = this.totalPoints) != null ? d2.equals(runnerBatsman.totalPoints) : runnerBatsman.totalPoints == null) && ((list = this.battingStatsList) != null ? list.equals(runnerBatsman.battingStatsList) : runnerBatsman.battingStatsList == null) && ((d3 = this.totalBowlingPoints) != null ? d3.equals(runnerBatsman.totalBowlingPoints) : runnerBatsman.totalBowlingPoints == null) && ((d4 = this.totalFieldingPoints) != null ? d4.equals(runnerBatsman.totalFieldingPoints) : runnerBatsman.totalFieldingPoints == null) && ((list2 = this.bowlingStatsList) != null ? list2.equals(runnerBatsman.bowlingStatsList) : runnerBatsman.bowlingStatsList == null) && ((list3 = this.fieldingStatsList) != null ? list3.equals(runnerBatsman.fieldingStatsList) : runnerBatsman.fieldingStatsList == null)) {
                InningWisePoints3 inningWisePoints3 = this.inningWisePoints;
                InningWisePoints3 inningWisePoints32 = runnerBatsman.inningWisePoints;
                if (inningWisePoints3 == null) {
                    if (inningWisePoints32 == null) {
                        return true;
                    }
                } else if (inningWisePoints3.equals(inningWisePoints32)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.playerID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerNameHindi;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerTeam;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerTeamID;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Double d = this.totalBattingPoints;
                int hashCode7 = (hashCode6 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.totalPoints;
                int hashCode8 = (hashCode7 ^ (d2 == null ? 0 : d2.hashCode())) * 1000003;
                List<BattingStatsList3> list = this.battingStatsList;
                int hashCode9 = (hashCode8 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                Double d3 = this.totalBowlingPoints;
                int hashCode10 = (hashCode9 ^ (d3 == null ? 0 : d3.hashCode())) * 1000003;
                Double d4 = this.totalFieldingPoints;
                int hashCode11 = (hashCode10 ^ (d4 == null ? 0 : d4.hashCode())) * 1000003;
                List<BowlingStatsList3> list2 = this.bowlingStatsList;
                int hashCode12 = (hashCode11 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<FieldingStatsList3> list3 = this.fieldingStatsList;
                int hashCode13 = (hashCode12 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                InningWisePoints3 inningWisePoints3 = this.inningWisePoints;
                if (inningWisePoints3 != null) {
                    i = inningWisePoints3.hashCode();
                }
                this.$hashCode = hashCode13 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<RunnerBatsman> {
            final BattingStatsList3.Mapper battingStatsList3FieldMapper = new BattingStatsList3.Mapper();
            final BowlingStatsList3.Mapper bowlingStatsList3FieldMapper = new BowlingStatsList3.Mapper();
            final FieldingStatsList3.Mapper fieldingStatsList3FieldMapper = new FieldingStatsList3.Mapper();
            final InningWisePoints3.Mapper inningWisePoints3FieldMapper = new InningWisePoints3.Mapper();

            @Override 
            public RunnerBatsman map(ResponseReader responseReader) {
                return new RunnerBatsman(responseReader.readString(RunnerBatsman.$responseFields[0]), responseReader.readString(RunnerBatsman.$responseFields[1]), responseReader.readString(RunnerBatsman.$responseFields[2]), responseReader.readString(RunnerBatsman.$responseFields[3]), responseReader.readString(RunnerBatsman.$responseFields[4]), responseReader.readString(RunnerBatsman.$responseFields[5]), responseReader.readDouble(RunnerBatsman.$responseFields[6]), responseReader.readDouble(RunnerBatsman.$responseFields[7]), responseReader.readList(RunnerBatsman.$responseFields[8], new ResponseReader.ListReader<BattingStatsList3>() {


                    @Override 
                    public BattingStatsList3 read(ResponseReader.ListItemReader listItemReader) {
                        return (BattingStatsList3) listItemReader.readObject(new ResponseReader.ObjectReader<BattingStatsList3>() {


                            @Override 
                            public BattingStatsList3 read(ResponseReader responseReader) {
                                return Mapper.this.battingStatsList3FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readDouble(RunnerBatsman.$responseFields[9]), responseReader.readDouble(RunnerBatsman.$responseFields[10]), responseReader.readList(RunnerBatsman.$responseFields[11], new ResponseReader.ListReader<BowlingStatsList3>() {


                    @Override 
                    public BowlingStatsList3 read(ResponseReader.ListItemReader listItemReader) {
                        return (BowlingStatsList3) listItemReader.readObject(new ResponseReader.ObjectReader<BowlingStatsList3>() {


                            @Override 
                            public BowlingStatsList3 read(ResponseReader responseReader) {
                                return Mapper.this.bowlingStatsList3FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(RunnerBatsman.$responseFields[12], new ResponseReader.ListReader<FieldingStatsList3>() {


                    @Override 
                    public FieldingStatsList3 read(ResponseReader.ListItemReader listItemReader) {
                        return (FieldingStatsList3) listItemReader.readObject(new ResponseReader.ObjectReader<FieldingStatsList3>() {


                            @Override 
                            public FieldingStatsList3 read(ResponseReader responseReader) {
                                return Mapper.this.fieldingStatsList3FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (InningWisePoints3) responseReader.readObject(RunnerBatsman.$responseFields[13], new ResponseReader.ObjectReader<InningWisePoints3>() {


                    @Override 
                    public InningWisePoints3 read(ResponseReader responseReader) {
                        return Mapper.this.inningWisePoints3FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class BattingStatsList3 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runs", "runs", null, true, Collections.emptyList()), ResponseField.forInt("fours", "fours", null, true, Collections.emptyList()), ResponseField.forInt("sixes", "sixes", null, true, Collections.emptyList()), ResponseField.forInt("balls", "balls", null, true, Collections.emptyList()), ResponseField.forDouble("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forBoolean("isNotOut", "isNotOut", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer balls;
        final Integer fours;
        final Boolean isNotOut;
        final Integer runs;
        final Integer sixes;
        final Double strikeRate;

        public BattingStatsList3(String str, Integer num, Integer num2, Integer num3, Integer num4, Double d, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runs = num;
            this.fours = num2;
            this.sixes = num3;
            this.balls = num4;
            this.strikeRate = d;
            this.isNotOut = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runs() {
            return this.runs;
        }

        public Integer fours() {
            return this.fours;
        }

        public Integer sixes() {
            return this.sixes;
        }

        public Integer balls() {
            return this.balls;
        }

        public Double strikeRate() {
            return this.strikeRate;
        }

        public Boolean isNotOut() {
            return this.isNotOut;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BattingStatsList3.$responseFields[0], BattingStatsList3.this.__typename);
                    responseWriter.writeInt(BattingStatsList3.$responseFields[1], BattingStatsList3.this.runs);
                    responseWriter.writeInt(BattingStatsList3.$responseFields[2], BattingStatsList3.this.fours);
                    responseWriter.writeInt(BattingStatsList3.$responseFields[3], BattingStatsList3.this.sixes);
                    responseWriter.writeInt(BattingStatsList3.$responseFields[4], BattingStatsList3.this.balls);
                    responseWriter.writeDouble(BattingStatsList3.$responseFields[5], BattingStatsList3.this.strikeRate);
                    responseWriter.writeBoolean(BattingStatsList3.$responseFields[6], BattingStatsList3.this.isNotOut);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BattingStatsList3{__typename=" + this.__typename + ", runs=" + this.runs + ", fours=" + this.fours + ", sixes=" + this.sixes + ", balls=" + this.balls + ", strikeRate=" + this.strikeRate + ", isNotOut=" + this.isNotOut + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattingStatsList3)) {
                return false;
            }
            BattingStatsList3 battingStatsList3 = (BattingStatsList3) obj;
            if (this.__typename.equals(battingStatsList3.__typename) && ((num = this.runs) != null ? num.equals(battingStatsList3.runs) : battingStatsList3.runs == null) && ((num2 = this.fours) != null ? num2.equals(battingStatsList3.fours) : battingStatsList3.fours == null) && ((num3 = this.sixes) != null ? num3.equals(battingStatsList3.sixes) : battingStatsList3.sixes == null) && ((num4 = this.balls) != null ? num4.equals(battingStatsList3.balls) : battingStatsList3.balls == null) && ((d = this.strikeRate) != null ? d.equals(battingStatsList3.strikeRate) : battingStatsList3.strikeRate == null)) {
                Boolean bool = this.isNotOut;
                Boolean bool2 = battingStatsList3.isNotOut;
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
                Integer num = this.runs;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.fours;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.sixes;
                int hashCode4 = (hashCode3 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.balls;
                int hashCode5 = (hashCode4 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Double d = this.strikeRate;
                int hashCode6 = (hashCode5 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Boolean bool = this.isNotOut;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BattingStatsList3> {
            @Override 
            public BattingStatsList3 map(ResponseReader responseReader) {
                return new BattingStatsList3(responseReader.readString(BattingStatsList3.$responseFields[0]), responseReader.readInt(BattingStatsList3.$responseFields[1]), responseReader.readInt(BattingStatsList3.$responseFields[2]), responseReader.readInt(BattingStatsList3.$responseFields[3]), responseReader.readInt(BattingStatsList3.$responseFields[4]), responseReader.readDouble(BattingStatsList3.$responseFields[5]), responseReader.readBoolean(BattingStatsList3.$responseFields[6]));
            }
        }
    }

    public static class BowlingStatsList3 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forInt("runsConceded", "runsConceded", null, true, Collections.emptyList()), ResponseField.forDouble("economyRate", "economyRate", null, true, Collections.emptyList()), ResponseField.forDouble("overs", "overs", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double economyRate;
        final Double overs;
        final Integer runsConceded;
        final Integer wickets;

        public BowlingStatsList3(String str, Integer num, Integer num2, Double d, Double d2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.wickets = num;
            this.runsConceded = num2;
            this.economyRate = d;
            this.overs = d2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer wickets() {
            return this.wickets;
        }

        public Integer runsConceded() {
            return this.runsConceded;
        }

        public Double economyRate() {
            return this.economyRate;
        }

        public Double overs() {
            return this.overs;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlingStatsList3.$responseFields[0], BowlingStatsList3.this.__typename);
                    responseWriter.writeInt(BowlingStatsList3.$responseFields[1], BowlingStatsList3.this.wickets);
                    responseWriter.writeInt(BowlingStatsList3.$responseFields[2], BowlingStatsList3.this.runsConceded);
                    responseWriter.writeDouble(BowlingStatsList3.$responseFields[3], BowlingStatsList3.this.economyRate);
                    responseWriter.writeDouble(BowlingStatsList3.$responseFields[4], BowlingStatsList3.this.overs);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlingStatsList3{__typename=" + this.__typename + ", wickets=" + this.wickets + ", runsConceded=" + this.runsConceded + ", economyRate=" + this.economyRate + ", overs=" + this.overs + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlingStatsList3)) {
                return false;
            }
            BowlingStatsList3 bowlingStatsList3 = (BowlingStatsList3) obj;
            if (this.__typename.equals(bowlingStatsList3.__typename) && ((num = this.wickets) != null ? num.equals(bowlingStatsList3.wickets) : bowlingStatsList3.wickets == null) && ((num2 = this.runsConceded) != null ? num2.equals(bowlingStatsList3.runsConceded) : bowlingStatsList3.runsConceded == null) && ((d = this.economyRate) != null ? d.equals(bowlingStatsList3.economyRate) : bowlingStatsList3.economyRate == null)) {
                Double d2 = this.overs;
                Double d3 = bowlingStatsList3.overs;
                if (d2 == null) {
                    if (d3 == null) {
                        return true;
                    }
                } else if (d2.equals(d3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.wickets;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.runsConceded;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Double d = this.economyRate;
                int hashCode4 = (hashCode3 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.overs;
                if (d2 != null) {
                    i = d2.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlingStatsList3> {
            @Override 
            public BowlingStatsList3 map(ResponseReader responseReader) {
                return new BowlingStatsList3(responseReader.readString(BowlingStatsList3.$responseFields[0]), responseReader.readInt(BowlingStatsList3.$responseFields[1]), responseReader.readInt(BowlingStatsList3.$responseFields[2]), responseReader.readDouble(BowlingStatsList3.$responseFields[3]), responseReader.readDouble(BowlingStatsList3.$responseFields[4]));
            }
        }
    }

    public static class FieldingStatsList3 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runsOuts", "runsOuts", null, true, Collections.emptyList()), ResponseField.forInt("catches", "catches", null, true, Collections.emptyList()), ResponseField.forInt("stumps", "stumps", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer catches;
        final Integer runsOuts;
        final Integer stumps;

        public FieldingStatsList3(String str, Integer num, Integer num2, Integer num3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runsOuts = num;
            this.catches = num2;
            this.stumps = num3;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runsOuts() {
            return this.runsOuts;
        }

        public Integer catches() {
            return this.catches;
        }

        public Integer stumps() {
            return this.stumps;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(FieldingStatsList3.$responseFields[0], FieldingStatsList3.this.__typename);
                    responseWriter.writeInt(FieldingStatsList3.$responseFields[1], FieldingStatsList3.this.runsOuts);
                    responseWriter.writeInt(FieldingStatsList3.$responseFields[2], FieldingStatsList3.this.catches);
                    responseWriter.writeInt(FieldingStatsList3.$responseFields[3], FieldingStatsList3.this.stumps);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FieldingStatsList3{__typename=" + this.__typename + ", runsOuts=" + this.runsOuts + ", catches=" + this.catches + ", stumps=" + this.stumps + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FieldingStatsList3)) {
                return false;
            }
            FieldingStatsList3 fieldingStatsList3 = (FieldingStatsList3) obj;
            if (this.__typename.equals(fieldingStatsList3.__typename) && ((num = this.runsOuts) != null ? num.equals(fieldingStatsList3.runsOuts) : fieldingStatsList3.runsOuts == null) && ((num2 = this.catches) != null ? num2.equals(fieldingStatsList3.catches) : fieldingStatsList3.catches == null)) {
                Integer num3 = this.stumps;
                Integer num4 = fieldingStatsList3.stumps;
                if (num3 == null) {
                    if (num4 == null) {
                        return true;
                    }
                } else if (num3.equals(num4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.runsOuts;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.catches;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.stumps;
                if (num3 != null) {
                    i = num3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<FieldingStatsList3> {
            @Override 
            public FieldingStatsList3 map(ResponseReader responseReader) {
                return new FieldingStatsList3(responseReader.readString(FieldingStatsList3.$responseFields[0]), responseReader.readInt(FieldingStatsList3.$responseFields[1]), responseReader.readInt(FieldingStatsList3.$responseFields[2]), responseReader.readInt(FieldingStatsList3.$responseFields[3]));
            }
        }
    }

    public static class InningWisePoints3 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("inningWiseBattingPoints", "inningWiseBattingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseBowlingPoints", "inningWiseBowlingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseFieldingPoints", "inningWiseFieldingPoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Double> inningWiseBattingPoints;
        final List<Double> inningWiseBowlingPoints;
        final List<Double> inningWiseFieldingPoints;

        public InningWisePoints3(String str, List<Double> list, List<Double> list2, List<Double> list3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.inningWiseBattingPoints = list;
            this.inningWiseBowlingPoints = list2;
            this.inningWiseFieldingPoints = list3;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Double> inningWiseBattingPoints() {
            return this.inningWiseBattingPoints;
        }

        public List<Double> inningWiseBowlingPoints() {
            return this.inningWiseBowlingPoints;
        }

        public List<Double> inningWiseFieldingPoints() {
            return this.inningWiseFieldingPoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(InningWisePoints3.$responseFields[0], InningWisePoints3.this.__typename);
                    responseWriter.writeList(InningWisePoints3.$responseFields[1], InningWisePoints3.this.inningWiseBattingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints3.$responseFields[2], InningWisePoints3.this.inningWiseBowlingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints3.$responseFields[3], InningWisePoints3.this.inningWiseFieldingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "InningWisePoints3{__typename=" + this.__typename + ", inningWiseBattingPoints=" + this.inningWiseBattingPoints + ", inningWiseBowlingPoints=" + this.inningWiseBowlingPoints + ", inningWiseFieldingPoints=" + this.inningWiseFieldingPoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<Double> list;
            List<Double> list2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InningWisePoints3)) {
                return false;
            }
            InningWisePoints3 inningWisePoints3 = (InningWisePoints3) obj;
            if (this.__typename.equals(inningWisePoints3.__typename) && ((list = this.inningWiseBattingPoints) != null ? list.equals(inningWisePoints3.inningWiseBattingPoints) : inningWisePoints3.inningWiseBattingPoints == null) && ((list2 = this.inningWiseBowlingPoints) != null ? list2.equals(inningWisePoints3.inningWiseBowlingPoints) : inningWisePoints3.inningWiseBowlingPoints == null)) {
                List<Double> list3 = this.inningWiseFieldingPoints;
                List<Double> list4 = inningWisePoints3.inningWiseFieldingPoints;
                if (list3 == null) {
                    if (list4 == null) {
                        return true;
                    }
                } else if (list3.equals(list4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<Double> list = this.inningWiseBattingPoints;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Double> list2 = this.inningWiseBowlingPoints;
                int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<Double> list3 = this.inningWiseFieldingPoints;
                if (list3 != null) {
                    i = list3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<InningWisePoints3> {
            @Override 
            public InningWisePoints3 map(ResponseReader responseReader) {
                return new InningWisePoints3(responseReader.readString(InningWisePoints3.$responseFields[0]), responseReader.readList(InningWisePoints3.$responseFields[1], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints3.$responseFields[2], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints3.$responseFields[3], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }));
            }
        }
    }

    public static class BatsmanSummary2 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forObject("topBatsman", "topBatsman", null, true, Collections.emptyList()), ResponseField.forObject("runnerBatsman", "runnerBatsman", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final RunnerBatsman1 runnerBatsman;
        final TopBatsman1 topBatsman;

        public BatsmanSummary2(String str, TopBatsman1 topBatsman1, RunnerBatsman1 runnerBatsman1) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.topBatsman = topBatsman1;
            this.runnerBatsman = runnerBatsman1;
        }

        public String __typename() {
            return this.__typename;
        }

        public TopBatsman1 topBatsman() {
            return this.topBatsman;
        }

        public RunnerBatsman1 runnerBatsman() {
            return this.runnerBatsman;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BatsmanSummary2.$responseFields[0], BatsmanSummary2.this.__typename);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(BatsmanSummary2.$responseFields[1], BatsmanSummary2.this.topBatsman != null ? BatsmanSummary2.this.topBatsman.marshaller() : null);
                    ResponseField responseField = BatsmanSummary2.$responseFields[2];
                    if (BatsmanSummary2.this.runnerBatsman != null) {
                        responseFieldMarshaller = BatsmanSummary2.this.runnerBatsman.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BatsmanSummary2{__typename=" + this.__typename + ", topBatsman=" + this.topBatsman + ", runnerBatsman=" + this.runnerBatsman + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            TopBatsman1 topBatsman1;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BatsmanSummary2)) {
                return false;
            }
            BatsmanSummary2 batsmanSummary2 = (BatsmanSummary2) obj;
            if (this.__typename.equals(batsmanSummary2.__typename) && ((topBatsman1 = this.topBatsman) != null ? topBatsman1.equals(batsmanSummary2.topBatsman) : batsmanSummary2.topBatsman == null)) {
                RunnerBatsman1 runnerBatsman1 = this.runnerBatsman;
                RunnerBatsman1 runnerBatsman12 = batsmanSummary2.runnerBatsman;
                if (runnerBatsman1 == null) {
                    if (runnerBatsman12 == null) {
                        return true;
                    }
                } else if (runnerBatsman1.equals(runnerBatsman12)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                TopBatsman1 topBatsman1 = this.topBatsman;
                int i = 0;
                int hashCode2 = (hashCode ^ (topBatsman1 == null ? 0 : topBatsman1.hashCode())) * 1000003;
                RunnerBatsman1 runnerBatsman1 = this.runnerBatsman;
                if (runnerBatsman1 != null) {
                    i = runnerBatsman1.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BatsmanSummary2> {
            final RunnerBatsman1.Mapper runnerBatsman1FieldMapper = new RunnerBatsman1.Mapper();
            final TopBatsman1.Mapper topBatsman1FieldMapper = new TopBatsman1.Mapper();

            @Override 
            public BatsmanSummary2 map(ResponseReader responseReader) {
                return new BatsmanSummary2(responseReader.readString(BatsmanSummary2.$responseFields[0]), (TopBatsman1) responseReader.readObject(BatsmanSummary2.$responseFields[1], new ResponseReader.ObjectReader<TopBatsman1>() {


                    @Override 
                    public TopBatsman1 read(ResponseReader responseReader) {
                        return Mapper.this.topBatsman1FieldMapper.map(responseReader);
                    }
                }), (RunnerBatsman1) responseReader.readObject(BatsmanSummary2.$responseFields[2], new ResponseReader.ObjectReader<RunnerBatsman1>() {


                    @Override 
                    public RunnerBatsman1 read(ResponseReader responseReader) {
                        return Mapper.this.runnerBatsman1FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class TopBatsman1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerNameHindi", "playerNameHindi", null, true, Collections.emptyList()), ResponseField.forString("playerTeam", "playerTeam", null, true, Collections.emptyList()), ResponseField.forString("playerTeamID", "playerTeamID", null, true, Collections.emptyList()), ResponseField.forDouble("totalBattingPoints", "totalBattingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalPoints", "totalPoints", null, true, Collections.emptyList()), ResponseField.forList("battingStatsList", "battingStatsList", null, true, Collections.emptyList()), ResponseField.forDouble("totalBowlingPoints", "totalBowlingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalFieldingPoints", "totalFieldingPoints", null, true, Collections.emptyList()), ResponseField.forList("bowlingStatsList", "bowlingStatsList", null, true, Collections.emptyList()), ResponseField.forList("fieldingStatsList", "fieldingStatsList", null, true, Collections.emptyList()), ResponseField.forObject("inningWisePoints", "inningWisePoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<BattingStatsList4> battingStatsList;
        final List<BowlingStatsList4> bowlingStatsList;
        final List<FieldingStatsList4> fieldingStatsList;
        final InningWisePoints4 inningWisePoints;
        final String playerID;
        final String playerName;
        final String playerNameHindi;
        final String playerTeam;
        final String playerTeamID;
        final Double totalBattingPoints;
        final Double totalBowlingPoints;
        final Double totalFieldingPoints;
        final Double totalPoints;

        public TopBatsman1(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, List<BattingStatsList4> list, Double d3, Double d4, List<BowlingStatsList4> list2, List<FieldingStatsList4> list3, InningWisePoints4 inningWisePoints4) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerName = str3;
            this.playerNameHindi = str4;
            this.playerTeam = str5;
            this.playerTeamID = str6;
            this.totalBattingPoints = d;
            this.totalPoints = d2;
            this.battingStatsList = list;
            this.totalBowlingPoints = d3;
            this.totalFieldingPoints = d4;
            this.bowlingStatsList = list2;
            this.fieldingStatsList = list3;
            this.inningWisePoints = inningWisePoints4;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerID() {
            return this.playerID;
        }

        public String playerName() {
            return this.playerName;
        }

        public String playerNameHindi() {
            return this.playerNameHindi;
        }

        public String playerTeam() {
            return this.playerTeam;
        }

        public String playerTeamID() {
            return this.playerTeamID;
        }

        public Double totalBattingPoints() {
            return this.totalBattingPoints;
        }

        public Double totalPoints() {
            return this.totalPoints;
        }

        public List<BattingStatsList4> battingStatsList() {
            return this.battingStatsList;
        }

        public Double totalBowlingPoints() {
            return this.totalBowlingPoints;
        }

        public Double totalFieldingPoints() {
            return this.totalFieldingPoints;
        }

        public List<BowlingStatsList4> bowlingStatsList() {
            return this.bowlingStatsList;
        }

        public List<FieldingStatsList4> fieldingStatsList() {
            return this.fieldingStatsList;
        }

        public InningWisePoints4 inningWisePoints() {
            return this.inningWisePoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TopBatsman1.$responseFields[0], TopBatsman1.this.__typename);
                    responseWriter.writeString(TopBatsman1.$responseFields[1], TopBatsman1.this.playerID);
                    responseWriter.writeString(TopBatsman1.$responseFields[2], TopBatsman1.this.playerName);
                    responseWriter.writeString(TopBatsman1.$responseFields[3], TopBatsman1.this.playerNameHindi);
                    responseWriter.writeString(TopBatsman1.$responseFields[4], TopBatsman1.this.playerTeam);
                    responseWriter.writeString(TopBatsman1.$responseFields[5], TopBatsman1.this.playerTeamID);
                    responseWriter.writeDouble(TopBatsman1.$responseFields[6], TopBatsman1.this.totalBattingPoints);
                    responseWriter.writeDouble(TopBatsman1.$responseFields[7], TopBatsman1.this.totalPoints);
                    responseWriter.writeList(TopBatsman1.$responseFields[8], TopBatsman1.this.battingStatsList, new ResponseWriter.ListWriter() {

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BattingStatsList4) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeDouble(TopBatsman1.$responseFields[9], TopBatsman1.this.totalBowlingPoints);
                    responseWriter.writeDouble(TopBatsman1.$responseFields[10], TopBatsman1.this.totalFieldingPoints);
                    responseWriter.writeList(TopBatsman1.$responseFields[11], TopBatsman1.this.bowlingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BowlingStatsList4) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(TopBatsman1.$responseFields[12], TopBatsman1.this.fieldingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((FieldingStatsList4) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeObject(TopBatsman1.$responseFields[13], TopBatsman1.this.inningWisePoints != null ? TopBatsman1.this.inningWisePoints.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TopBatsman1{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerNameHindi=" + this.playerNameHindi + ", playerTeam=" + this.playerTeam + ", playerTeamID=" + this.playerTeamID + ", totalBattingPoints=" + this.totalBattingPoints + ", totalPoints=" + this.totalPoints + ", battingStatsList=" + this.battingStatsList + ", totalBowlingPoints=" + this.totalBowlingPoints + ", totalFieldingPoints=" + this.totalFieldingPoints + ", bowlingStatsList=" + this.bowlingStatsList + ", fieldingStatsList=" + this.fieldingStatsList + ", inningWisePoints=" + this.inningWisePoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Double d;
            Double d2;
            List<BattingStatsList4> list;
            Double d3;
            Double d4;
            List<BowlingStatsList4> list2;
            List<FieldingStatsList4> list3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TopBatsman1)) {
                return false;
            }
            TopBatsman1 topBatsman1 = (TopBatsman1) obj;
            if (this.__typename.equals(topBatsman1.__typename) && ((str = this.playerID) != null ? str.equals(topBatsman1.playerID) : topBatsman1.playerID == null) && ((str2 = this.playerName) != null ? str2.equals(topBatsman1.playerName) : topBatsman1.playerName == null) && ((str3 = this.playerNameHindi) != null ? str3.equals(topBatsman1.playerNameHindi) : topBatsman1.playerNameHindi == null) && ((str4 = this.playerTeam) != null ? str4.equals(topBatsman1.playerTeam) : topBatsman1.playerTeam == null) && ((str5 = this.playerTeamID) != null ? str5.equals(topBatsman1.playerTeamID) : topBatsman1.playerTeamID == null) && ((d = this.totalBattingPoints) != null ? d.equals(topBatsman1.totalBattingPoints) : topBatsman1.totalBattingPoints == null) && ((d2 = this.totalPoints) != null ? d2.equals(topBatsman1.totalPoints) : topBatsman1.totalPoints == null) && ((list = this.battingStatsList) != null ? list.equals(topBatsman1.battingStatsList) : topBatsman1.battingStatsList == null) && ((d3 = this.totalBowlingPoints) != null ? d3.equals(topBatsman1.totalBowlingPoints) : topBatsman1.totalBowlingPoints == null) && ((d4 = this.totalFieldingPoints) != null ? d4.equals(topBatsman1.totalFieldingPoints) : topBatsman1.totalFieldingPoints == null) && ((list2 = this.bowlingStatsList) != null ? list2.equals(topBatsman1.bowlingStatsList) : topBatsman1.bowlingStatsList == null) && ((list3 = this.fieldingStatsList) != null ? list3.equals(topBatsman1.fieldingStatsList) : topBatsman1.fieldingStatsList == null)) {
                InningWisePoints4 inningWisePoints4 = this.inningWisePoints;
                InningWisePoints4 inningWisePoints42 = topBatsman1.inningWisePoints;
                if (inningWisePoints4 == null) {
                    if (inningWisePoints42 == null) {
                        return true;
                    }
                } else if (inningWisePoints4.equals(inningWisePoints42)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.playerID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerNameHindi;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerTeam;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerTeamID;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Double d = this.totalBattingPoints;
                int hashCode7 = (hashCode6 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.totalPoints;
                int hashCode8 = (hashCode7 ^ (d2 == null ? 0 : d2.hashCode())) * 1000003;
                List<BattingStatsList4> list = this.battingStatsList;
                int hashCode9 = (hashCode8 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                Double d3 = this.totalBowlingPoints;
                int hashCode10 = (hashCode9 ^ (d3 == null ? 0 : d3.hashCode())) * 1000003;
                Double d4 = this.totalFieldingPoints;
                int hashCode11 = (hashCode10 ^ (d4 == null ? 0 : d4.hashCode())) * 1000003;
                List<BowlingStatsList4> list2 = this.bowlingStatsList;
                int hashCode12 = (hashCode11 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<FieldingStatsList4> list3 = this.fieldingStatsList;
                int hashCode13 = (hashCode12 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                InningWisePoints4 inningWisePoints4 = this.inningWisePoints;
                if (inningWisePoints4 != null) {
                    i = inningWisePoints4.hashCode();
                }
                this.$hashCode = hashCode13 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TopBatsman1> {
            final BattingStatsList4.Mapper battingStatsList4FieldMapper = new BattingStatsList4.Mapper();
            final BowlingStatsList4.Mapper bowlingStatsList4FieldMapper = new BowlingStatsList4.Mapper();
            final FieldingStatsList4.Mapper fieldingStatsList4FieldMapper = new FieldingStatsList4.Mapper();
            final InningWisePoints4.Mapper inningWisePoints4FieldMapper = new InningWisePoints4.Mapper();

            @Override 
            public TopBatsman1 map(ResponseReader responseReader) {
                return new TopBatsman1(responseReader.readString(TopBatsman1.$responseFields[0]), responseReader.readString(TopBatsman1.$responseFields[1]), responseReader.readString(TopBatsman1.$responseFields[2]), responseReader.readString(TopBatsman1.$responseFields[3]), responseReader.readString(TopBatsman1.$responseFields[4]), responseReader.readString(TopBatsman1.$responseFields[5]), responseReader.readDouble(TopBatsman1.$responseFields[6]), responseReader.readDouble(TopBatsman1.$responseFields[7]), responseReader.readList(TopBatsman1.$responseFields[8], new ResponseReader.ListReader<BattingStatsList4>() {


                    @Override 
                    public BattingStatsList4 read(ResponseReader.ListItemReader listItemReader) {
                        return (BattingStatsList4) listItemReader.readObject(new ResponseReader.ObjectReader<BattingStatsList4>() {


                            @Override 
                            public BattingStatsList4 read(ResponseReader responseReader) {
                                return Mapper.this.battingStatsList4FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readDouble(TopBatsman1.$responseFields[9]), responseReader.readDouble(TopBatsman1.$responseFields[10]), responseReader.readList(TopBatsman1.$responseFields[11], new ResponseReader.ListReader<BowlingStatsList4>() {


                    @Override 
                    public BowlingStatsList4 read(ResponseReader.ListItemReader listItemReader) {
                        return (BowlingStatsList4) listItemReader.readObject(new ResponseReader.ObjectReader<BowlingStatsList4>() {


                            @Override 
                            public BowlingStatsList4 read(ResponseReader responseReader) {
                                return Mapper.this.bowlingStatsList4FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(TopBatsman1.$responseFields[12], new ResponseReader.ListReader<FieldingStatsList4>() {


                    @Override 
                    public FieldingStatsList4 read(ResponseReader.ListItemReader listItemReader) {
                        return (FieldingStatsList4) listItemReader.readObject(new ResponseReader.ObjectReader<FieldingStatsList4>() {


                            @Override 
                            public FieldingStatsList4 read(ResponseReader responseReader) {
                                return Mapper.this.fieldingStatsList4FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (InningWisePoints4) responseReader.readObject(TopBatsman1.$responseFields[13], new ResponseReader.ObjectReader<InningWisePoints4>() {


                    @Override 
                    public InningWisePoints4 read(ResponseReader responseReader) {
                        return Mapper.this.inningWisePoints4FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class BattingStatsList4 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runs", "runs", null, true, Collections.emptyList()), ResponseField.forInt("fours", "fours", null, true, Collections.emptyList()), ResponseField.forInt("sixes", "sixes", null, true, Collections.emptyList()), ResponseField.forInt("balls", "balls", null, true, Collections.emptyList()), ResponseField.forDouble("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forBoolean("isNotOut", "isNotOut", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer balls;
        final Integer fours;
        final Boolean isNotOut;
        final Integer runs;
        final Integer sixes;
        final Double strikeRate;

        public BattingStatsList4(String str, Integer num, Integer num2, Integer num3, Integer num4, Double d, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runs = num;
            this.fours = num2;
            this.sixes = num3;
            this.balls = num4;
            this.strikeRate = d;
            this.isNotOut = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runs() {
            return this.runs;
        }

        public Integer fours() {
            return this.fours;
        }

        public Integer sixes() {
            return this.sixes;
        }

        public Integer balls() {
            return this.balls;
        }

        public Double strikeRate() {
            return this.strikeRate;
        }

        public Boolean isNotOut() {
            return this.isNotOut;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BattingStatsList4.$responseFields[0], BattingStatsList4.this.__typename);
                    responseWriter.writeInt(BattingStatsList4.$responseFields[1], BattingStatsList4.this.runs);
                    responseWriter.writeInt(BattingStatsList4.$responseFields[2], BattingStatsList4.this.fours);
                    responseWriter.writeInt(BattingStatsList4.$responseFields[3], BattingStatsList4.this.sixes);
                    responseWriter.writeInt(BattingStatsList4.$responseFields[4], BattingStatsList4.this.balls);
                    responseWriter.writeDouble(BattingStatsList4.$responseFields[5], BattingStatsList4.this.strikeRate);
                    responseWriter.writeBoolean(BattingStatsList4.$responseFields[6], BattingStatsList4.this.isNotOut);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BattingStatsList4{__typename=" + this.__typename + ", runs=" + this.runs + ", fours=" + this.fours + ", sixes=" + this.sixes + ", balls=" + this.balls + ", strikeRate=" + this.strikeRate + ", isNotOut=" + this.isNotOut + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattingStatsList4)) {
                return false;
            }
            BattingStatsList4 battingStatsList4 = (BattingStatsList4) obj;
            if (this.__typename.equals(battingStatsList4.__typename) && ((num = this.runs) != null ? num.equals(battingStatsList4.runs) : battingStatsList4.runs == null) && ((num2 = this.fours) != null ? num2.equals(battingStatsList4.fours) : battingStatsList4.fours == null) && ((num3 = this.sixes) != null ? num3.equals(battingStatsList4.sixes) : battingStatsList4.sixes == null) && ((num4 = this.balls) != null ? num4.equals(battingStatsList4.balls) : battingStatsList4.balls == null) && ((d = this.strikeRate) != null ? d.equals(battingStatsList4.strikeRate) : battingStatsList4.strikeRate == null)) {
                Boolean bool = this.isNotOut;
                Boolean bool2 = battingStatsList4.isNotOut;
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
                Integer num = this.runs;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.fours;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.sixes;
                int hashCode4 = (hashCode3 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.balls;
                int hashCode5 = (hashCode4 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Double d = this.strikeRate;
                int hashCode6 = (hashCode5 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Boolean bool = this.isNotOut;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BattingStatsList4> {
            @Override 
            public BattingStatsList4 map(ResponseReader responseReader) {
                return new BattingStatsList4(responseReader.readString(BattingStatsList4.$responseFields[0]), responseReader.readInt(BattingStatsList4.$responseFields[1]), responseReader.readInt(BattingStatsList4.$responseFields[2]), responseReader.readInt(BattingStatsList4.$responseFields[3]), responseReader.readInt(BattingStatsList4.$responseFields[4]), responseReader.readDouble(BattingStatsList4.$responseFields[5]), responseReader.readBoolean(BattingStatsList4.$responseFields[6]));
            }
        }
    }

    public static class BowlingStatsList4 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forInt("runsConceded", "runsConceded", null, true, Collections.emptyList()), ResponseField.forDouble("economyRate", "economyRate", null, true, Collections.emptyList()), ResponseField.forDouble("overs", "overs", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double economyRate;
        final Double overs;
        final Integer runsConceded;
        final Integer wickets;

        public BowlingStatsList4(String str, Integer num, Integer num2, Double d, Double d2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.wickets = num;
            this.runsConceded = num2;
            this.economyRate = d;
            this.overs = d2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer wickets() {
            return this.wickets;
        }

        public Integer runsConceded() {
            return this.runsConceded;
        }

        public Double economyRate() {
            return this.economyRate;
        }

        public Double overs() {
            return this.overs;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlingStatsList4.$responseFields[0], BowlingStatsList4.this.__typename);
                    responseWriter.writeInt(BowlingStatsList4.$responseFields[1], BowlingStatsList4.this.wickets);
                    responseWriter.writeInt(BowlingStatsList4.$responseFields[2], BowlingStatsList4.this.runsConceded);
                    responseWriter.writeDouble(BowlingStatsList4.$responseFields[3], BowlingStatsList4.this.economyRate);
                    responseWriter.writeDouble(BowlingStatsList4.$responseFields[4], BowlingStatsList4.this.overs);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlingStatsList4{__typename=" + this.__typename + ", wickets=" + this.wickets + ", runsConceded=" + this.runsConceded + ", economyRate=" + this.economyRate + ", overs=" + this.overs + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlingStatsList4)) {
                return false;
            }
            BowlingStatsList4 bowlingStatsList4 = (BowlingStatsList4) obj;
            if (this.__typename.equals(bowlingStatsList4.__typename) && ((num = this.wickets) != null ? num.equals(bowlingStatsList4.wickets) : bowlingStatsList4.wickets == null) && ((num2 = this.runsConceded) != null ? num2.equals(bowlingStatsList4.runsConceded) : bowlingStatsList4.runsConceded == null) && ((d = this.economyRate) != null ? d.equals(bowlingStatsList4.economyRate) : bowlingStatsList4.economyRate == null)) {
                Double d2 = this.overs;
                Double d3 = bowlingStatsList4.overs;
                if (d2 == null) {
                    if (d3 == null) {
                        return true;
                    }
                } else if (d2.equals(d3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.wickets;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.runsConceded;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Double d = this.economyRate;
                int hashCode4 = (hashCode3 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.overs;
                if (d2 != null) {
                    i = d2.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlingStatsList4> {
            @Override 
            public BowlingStatsList4 map(ResponseReader responseReader) {
                return new BowlingStatsList4(responseReader.readString(BowlingStatsList4.$responseFields[0]), responseReader.readInt(BowlingStatsList4.$responseFields[1]), responseReader.readInt(BowlingStatsList4.$responseFields[2]), responseReader.readDouble(BowlingStatsList4.$responseFields[3]), responseReader.readDouble(BowlingStatsList4.$responseFields[4]));
            }
        }
    }

    public static class FieldingStatsList4 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runsOuts", "runsOuts", null, true, Collections.emptyList()), ResponseField.forInt("catches", "catches", null, true, Collections.emptyList()), ResponseField.forInt("stumps", "stumps", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer catches;
        final Integer runsOuts;
        final Integer stumps;

        public FieldingStatsList4(String str, Integer num, Integer num2, Integer num3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runsOuts = num;
            this.catches = num2;
            this.stumps = num3;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runsOuts() {
            return this.runsOuts;
        }

        public Integer catches() {
            return this.catches;
        }

        public Integer stumps() {
            return this.stumps;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(FieldingStatsList4.$responseFields[0], FieldingStatsList4.this.__typename);
                    responseWriter.writeInt(FieldingStatsList4.$responseFields[1], FieldingStatsList4.this.runsOuts);
                    responseWriter.writeInt(FieldingStatsList4.$responseFields[2], FieldingStatsList4.this.catches);
                    responseWriter.writeInt(FieldingStatsList4.$responseFields[3], FieldingStatsList4.this.stumps);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FieldingStatsList4{__typename=" + this.__typename + ", runsOuts=" + this.runsOuts + ", catches=" + this.catches + ", stumps=" + this.stumps + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FieldingStatsList4)) {
                return false;
            }
            FieldingStatsList4 fieldingStatsList4 = (FieldingStatsList4) obj;
            if (this.__typename.equals(fieldingStatsList4.__typename) && ((num = this.runsOuts) != null ? num.equals(fieldingStatsList4.runsOuts) : fieldingStatsList4.runsOuts == null) && ((num2 = this.catches) != null ? num2.equals(fieldingStatsList4.catches) : fieldingStatsList4.catches == null)) {
                Integer num3 = this.stumps;
                Integer num4 = fieldingStatsList4.stumps;
                if (num3 == null) {
                    if (num4 == null) {
                        return true;
                    }
                } else if (num3.equals(num4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.runsOuts;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.catches;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.stumps;
                if (num3 != null) {
                    i = num3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<FieldingStatsList4> {
            @Override 
            public FieldingStatsList4 map(ResponseReader responseReader) {
                return new FieldingStatsList4(responseReader.readString(FieldingStatsList4.$responseFields[0]), responseReader.readInt(FieldingStatsList4.$responseFields[1]), responseReader.readInt(FieldingStatsList4.$responseFields[2]), responseReader.readInt(FieldingStatsList4.$responseFields[3]));
            }
        }
    }

    public static class InningWisePoints4 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("inningWiseBattingPoints", "inningWiseBattingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseBowlingPoints", "inningWiseBowlingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseFieldingPoints", "inningWiseFieldingPoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Double> inningWiseBattingPoints;
        final List<Double> inningWiseBowlingPoints;
        final List<Double> inningWiseFieldingPoints;

        public InningWisePoints4(String str, List<Double> list, List<Double> list2, List<Double> list3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.inningWiseBattingPoints = list;
            this.inningWiseBowlingPoints = list2;
            this.inningWiseFieldingPoints = list3;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Double> inningWiseBattingPoints() {
            return this.inningWiseBattingPoints;
        }

        public List<Double> inningWiseBowlingPoints() {
            return this.inningWiseBowlingPoints;
        }

        public List<Double> inningWiseFieldingPoints() {
            return this.inningWiseFieldingPoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(InningWisePoints4.$responseFields[0], InningWisePoints4.this.__typename);
                    responseWriter.writeList(InningWisePoints4.$responseFields[1], InningWisePoints4.this.inningWiseBattingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints4.$responseFields[2], InningWisePoints4.this.inningWiseBowlingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints4.$responseFields[3], InningWisePoints4.this.inningWiseFieldingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "InningWisePoints4{__typename=" + this.__typename + ", inningWiseBattingPoints=" + this.inningWiseBattingPoints + ", inningWiseBowlingPoints=" + this.inningWiseBowlingPoints + ", inningWiseFieldingPoints=" + this.inningWiseFieldingPoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<Double> list;
            List<Double> list2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InningWisePoints4)) {
                return false;
            }
            InningWisePoints4 inningWisePoints4 = (InningWisePoints4) obj;
            if (this.__typename.equals(inningWisePoints4.__typename) && ((list = this.inningWiseBattingPoints) != null ? list.equals(inningWisePoints4.inningWiseBattingPoints) : inningWisePoints4.inningWiseBattingPoints == null) && ((list2 = this.inningWiseBowlingPoints) != null ? list2.equals(inningWisePoints4.inningWiseBowlingPoints) : inningWisePoints4.inningWiseBowlingPoints == null)) {
                List<Double> list3 = this.inningWiseFieldingPoints;
                List<Double> list4 = inningWisePoints4.inningWiseFieldingPoints;
                if (list3 == null) {
                    if (list4 == null) {
                        return true;
                    }
                } else if (list3.equals(list4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<Double> list = this.inningWiseBattingPoints;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Double> list2 = this.inningWiseBowlingPoints;
                int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<Double> list3 = this.inningWiseFieldingPoints;
                if (list3 != null) {
                    i = list3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<InningWisePoints4> {
            @Override 
            public InningWisePoints4 map(ResponseReader responseReader) {
                return new InningWisePoints4(responseReader.readString(InningWisePoints4.$responseFields[0]), responseReader.readList(InningWisePoints4.$responseFields[1], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints4.$responseFields[2], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints4.$responseFields[3], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }));
            }
        }
    }

    public static class RunnerBatsman1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerNameHindi", "playerNameHindi", null, true, Collections.emptyList()), ResponseField.forString("playerTeam", "playerTeam", null, true, Collections.emptyList()), ResponseField.forString("playerTeamID", "playerTeamID", null, true, Collections.emptyList()), ResponseField.forDouble("totalBattingPoints", "totalBattingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalPoints", "totalPoints", null, true, Collections.emptyList()), ResponseField.forList("battingStatsList", "battingStatsList", null, true, Collections.emptyList()), ResponseField.forDouble("totalBowlingPoints", "totalBowlingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalFieldingPoints", "totalFieldingPoints", null, true, Collections.emptyList()), ResponseField.forList("bowlingStatsList", "bowlingStatsList", null, true, Collections.emptyList()), ResponseField.forList("fieldingStatsList", "fieldingStatsList", null, true, Collections.emptyList()), ResponseField.forObject("inningWisePoints", "inningWisePoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<BattingStatsList5> battingStatsList;
        final List<BowlingStatsList5> bowlingStatsList;
        final List<FieldingStatsList5> fieldingStatsList;
        final InningWisePoints5 inningWisePoints;
        final String playerID;
        final String playerName;
        final String playerNameHindi;
        final String playerTeam;
        final String playerTeamID;
        final Double totalBattingPoints;
        final Double totalBowlingPoints;
        final Double totalFieldingPoints;
        final Double totalPoints;

        public RunnerBatsman1(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, List<BattingStatsList5> list, Double d3, Double d4, List<BowlingStatsList5> list2, List<FieldingStatsList5> list3, InningWisePoints5 inningWisePoints5) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerName = str3;
            this.playerNameHindi = str4;
            this.playerTeam = str5;
            this.playerTeamID = str6;
            this.totalBattingPoints = d;
            this.totalPoints = d2;
            this.battingStatsList = list;
            this.totalBowlingPoints = d3;
            this.totalFieldingPoints = d4;
            this.bowlingStatsList = list2;
            this.fieldingStatsList = list3;
            this.inningWisePoints = inningWisePoints5;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerID() {
            return this.playerID;
        }

        public String playerName() {
            return this.playerName;
        }

        public String playerNameHindi() {
            return this.playerNameHindi;
        }

        public String playerTeam() {
            return this.playerTeam;
        }

        public String playerTeamID() {
            return this.playerTeamID;
        }

        public Double totalBattingPoints() {
            return this.totalBattingPoints;
        }

        public Double totalPoints() {
            return this.totalPoints;
        }

        public List<BattingStatsList5> battingStatsList() {
            return this.battingStatsList;
        }

        public Double totalBowlingPoints() {
            return this.totalBowlingPoints;
        }

        public Double totalFieldingPoints() {
            return this.totalFieldingPoints;
        }

        public List<BowlingStatsList5> bowlingStatsList() {
            return this.bowlingStatsList;
        }

        public List<FieldingStatsList5> fieldingStatsList() {
            return this.fieldingStatsList;
        }

        public InningWisePoints5 inningWisePoints() {
            return this.inningWisePoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(RunnerBatsman1.$responseFields[0], RunnerBatsman1.this.__typename);
                    responseWriter.writeString(RunnerBatsman1.$responseFields[1], RunnerBatsman1.this.playerID);
                    responseWriter.writeString(RunnerBatsman1.$responseFields[2], RunnerBatsman1.this.playerName);
                    responseWriter.writeString(RunnerBatsman1.$responseFields[3], RunnerBatsman1.this.playerNameHindi);
                    responseWriter.writeString(RunnerBatsman1.$responseFields[4], RunnerBatsman1.this.playerTeam);
                    responseWriter.writeString(RunnerBatsman1.$responseFields[5], RunnerBatsman1.this.playerTeamID);
                    responseWriter.writeDouble(RunnerBatsman1.$responseFields[6], RunnerBatsman1.this.totalBattingPoints);
                    responseWriter.writeDouble(RunnerBatsman1.$responseFields[7], RunnerBatsman1.this.totalPoints);
                    responseWriter.writeList(RunnerBatsman1.$responseFields[8], RunnerBatsman1.this.battingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BattingStatsList5) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeDouble(RunnerBatsman1.$responseFields[9], RunnerBatsman1.this.totalBowlingPoints);
                    responseWriter.writeDouble(RunnerBatsman1.$responseFields[10], RunnerBatsman1.this.totalFieldingPoints);
                    responseWriter.writeList(RunnerBatsman1.$responseFields[11], RunnerBatsman1.this.bowlingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BowlingStatsList5) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(RunnerBatsman1.$responseFields[12], RunnerBatsman1.this.fieldingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((FieldingStatsList5) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeObject(RunnerBatsman1.$responseFields[13], RunnerBatsman1.this.inningWisePoints != null ? RunnerBatsman1.this.inningWisePoints.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "RunnerBatsman1{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerNameHindi=" + this.playerNameHindi + ", playerTeam=" + this.playerTeam + ", playerTeamID=" + this.playerTeamID + ", totalBattingPoints=" + this.totalBattingPoints + ", totalPoints=" + this.totalPoints + ", battingStatsList=" + this.battingStatsList + ", totalBowlingPoints=" + this.totalBowlingPoints + ", totalFieldingPoints=" + this.totalFieldingPoints + ", bowlingStatsList=" + this.bowlingStatsList + ", fieldingStatsList=" + this.fieldingStatsList + ", inningWisePoints=" + this.inningWisePoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Double d;
            Double d2;
            List<BattingStatsList5> list;
            Double d3;
            Double d4;
            List<BowlingStatsList5> list2;
            List<FieldingStatsList5> list3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RunnerBatsman1)) {
                return false;
            }
            RunnerBatsman1 runnerBatsman1 = (RunnerBatsman1) obj;
            if (this.__typename.equals(runnerBatsman1.__typename) && ((str = this.playerID) != null ? str.equals(runnerBatsman1.playerID) : runnerBatsman1.playerID == null) && ((str2 = this.playerName) != null ? str2.equals(runnerBatsman1.playerName) : runnerBatsman1.playerName == null) && ((str3 = this.playerNameHindi) != null ? str3.equals(runnerBatsman1.playerNameHindi) : runnerBatsman1.playerNameHindi == null) && ((str4 = this.playerTeam) != null ? str4.equals(runnerBatsman1.playerTeam) : runnerBatsman1.playerTeam == null) && ((str5 = this.playerTeamID) != null ? str5.equals(runnerBatsman1.playerTeamID) : runnerBatsman1.playerTeamID == null) && ((d = this.totalBattingPoints) != null ? d.equals(runnerBatsman1.totalBattingPoints) : runnerBatsman1.totalBattingPoints == null) && ((d2 = this.totalPoints) != null ? d2.equals(runnerBatsman1.totalPoints) : runnerBatsman1.totalPoints == null) && ((list = this.battingStatsList) != null ? list.equals(runnerBatsman1.battingStatsList) : runnerBatsman1.battingStatsList == null) && ((d3 = this.totalBowlingPoints) != null ? d3.equals(runnerBatsman1.totalBowlingPoints) : runnerBatsman1.totalBowlingPoints == null) && ((d4 = this.totalFieldingPoints) != null ? d4.equals(runnerBatsman1.totalFieldingPoints) : runnerBatsman1.totalFieldingPoints == null) && ((list2 = this.bowlingStatsList) != null ? list2.equals(runnerBatsman1.bowlingStatsList) : runnerBatsman1.bowlingStatsList == null) && ((list3 = this.fieldingStatsList) != null ? list3.equals(runnerBatsman1.fieldingStatsList) : runnerBatsman1.fieldingStatsList == null)) {
                InningWisePoints5 inningWisePoints5 = this.inningWisePoints;
                InningWisePoints5 inningWisePoints52 = runnerBatsman1.inningWisePoints;
                if (inningWisePoints5 == null) {
                    if (inningWisePoints52 == null) {
                        return true;
                    }
                } else if (inningWisePoints5.equals(inningWisePoints52)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.playerID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerNameHindi;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerTeam;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerTeamID;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Double d = this.totalBattingPoints;
                int hashCode7 = (hashCode6 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.totalPoints;
                int hashCode8 = (hashCode7 ^ (d2 == null ? 0 : d2.hashCode())) * 1000003;
                List<BattingStatsList5> list = this.battingStatsList;
                int hashCode9 = (hashCode8 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                Double d3 = this.totalBowlingPoints;
                int hashCode10 = (hashCode9 ^ (d3 == null ? 0 : d3.hashCode())) * 1000003;
                Double d4 = this.totalFieldingPoints;
                int hashCode11 = (hashCode10 ^ (d4 == null ? 0 : d4.hashCode())) * 1000003;
                List<BowlingStatsList5> list2 = this.bowlingStatsList;
                int hashCode12 = (hashCode11 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<FieldingStatsList5> list3 = this.fieldingStatsList;
                int hashCode13 = (hashCode12 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                InningWisePoints5 inningWisePoints5 = this.inningWisePoints;
                if (inningWisePoints5 != null) {
                    i = inningWisePoints5.hashCode();
                }
                this.$hashCode = hashCode13 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<RunnerBatsman1> {
            final BattingStatsList5.Mapper battingStatsList5FieldMapper = new BattingStatsList5.Mapper();
            final BowlingStatsList5.Mapper bowlingStatsList5FieldMapper = new BowlingStatsList5.Mapper();
            final FieldingStatsList5.Mapper fieldingStatsList5FieldMapper = new FieldingStatsList5.Mapper();
            final InningWisePoints5.Mapper inningWisePoints5FieldMapper = new InningWisePoints5.Mapper();

            @Override 
            public RunnerBatsman1 map(ResponseReader responseReader) {
                return new RunnerBatsman1(responseReader.readString(RunnerBatsman1.$responseFields[0]), responseReader.readString(RunnerBatsman1.$responseFields[1]), responseReader.readString(RunnerBatsman1.$responseFields[2]), responseReader.readString(RunnerBatsman1.$responseFields[3]), responseReader.readString(RunnerBatsman1.$responseFields[4]), responseReader.readString(RunnerBatsman1.$responseFields[5]), responseReader.readDouble(RunnerBatsman1.$responseFields[6]), responseReader.readDouble(RunnerBatsman1.$responseFields[7]), responseReader.readList(RunnerBatsman1.$responseFields[8], new ResponseReader.ListReader<BattingStatsList5>() {


                    @Override 
                    public BattingStatsList5 read(ResponseReader.ListItemReader listItemReader) {
                        return (BattingStatsList5) listItemReader.readObject(new ResponseReader.ObjectReader<BattingStatsList5>() {


                            @Override 
                            public BattingStatsList5 read(ResponseReader responseReader) {
                                return Mapper.this.battingStatsList5FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readDouble(RunnerBatsman1.$responseFields[9]), responseReader.readDouble(RunnerBatsman1.$responseFields[10]), responseReader.readList(RunnerBatsman1.$responseFields[11], new ResponseReader.ListReader<BowlingStatsList5>() {


                    @Override 
                    public BowlingStatsList5 read(ResponseReader.ListItemReader listItemReader) {
                        return (BowlingStatsList5) listItemReader.readObject(new ResponseReader.ObjectReader<BowlingStatsList5>() {


                            @Override 
                            public BowlingStatsList5 read(ResponseReader responseReader) {
                                return Mapper.this.bowlingStatsList5FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(RunnerBatsman1.$responseFields[12], new ResponseReader.ListReader<FieldingStatsList5>() {


                    @Override 
                    public FieldingStatsList5 read(ResponseReader.ListItemReader listItemReader) {
                        return (FieldingStatsList5) listItemReader.readObject(new ResponseReader.ObjectReader<FieldingStatsList5>() {


                            @Override 
                            public FieldingStatsList5 read(ResponseReader responseReader) {
                                return Mapper.this.fieldingStatsList5FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (InningWisePoints5) responseReader.readObject(RunnerBatsman1.$responseFields[13], new ResponseReader.ObjectReader<InningWisePoints5>() {


                    @Override 
                    public InningWisePoints5 read(ResponseReader responseReader) {
                        return Mapper.this.inningWisePoints5FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class BattingStatsList5 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runs", "runs", null, true, Collections.emptyList()), ResponseField.forInt("fours", "fours", null, true, Collections.emptyList()), ResponseField.forInt("sixes", "sixes", null, true, Collections.emptyList()), ResponseField.forInt("balls", "balls", null, true, Collections.emptyList()), ResponseField.forDouble("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forBoolean("isNotOut", "isNotOut", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer balls;
        final Integer fours;
        final Boolean isNotOut;
        final Integer runs;
        final Integer sixes;
        final Double strikeRate;

        public BattingStatsList5(String str, Integer num, Integer num2, Integer num3, Integer num4, Double d, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runs = num;
            this.fours = num2;
            this.sixes = num3;
            this.balls = num4;
            this.strikeRate = d;
            this.isNotOut = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runs() {
            return this.runs;
        }

        public Integer fours() {
            return this.fours;
        }

        public Integer sixes() {
            return this.sixes;
        }

        public Integer balls() {
            return this.balls;
        }

        public Double strikeRate() {
            return this.strikeRate;
        }

        public Boolean isNotOut() {
            return this.isNotOut;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BattingStatsList5.$responseFields[0], BattingStatsList5.this.__typename);
                    responseWriter.writeInt(BattingStatsList5.$responseFields[1], BattingStatsList5.this.runs);
                    responseWriter.writeInt(BattingStatsList5.$responseFields[2], BattingStatsList5.this.fours);
                    responseWriter.writeInt(BattingStatsList5.$responseFields[3], BattingStatsList5.this.sixes);
                    responseWriter.writeInt(BattingStatsList5.$responseFields[4], BattingStatsList5.this.balls);
                    responseWriter.writeDouble(BattingStatsList5.$responseFields[5], BattingStatsList5.this.strikeRate);
                    responseWriter.writeBoolean(BattingStatsList5.$responseFields[6], BattingStatsList5.this.isNotOut);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BattingStatsList5{__typename=" + this.__typename + ", runs=" + this.runs + ", fours=" + this.fours + ", sixes=" + this.sixes + ", balls=" + this.balls + ", strikeRate=" + this.strikeRate + ", isNotOut=" + this.isNotOut + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattingStatsList5)) {
                return false;
            }
            BattingStatsList5 battingStatsList5 = (BattingStatsList5) obj;
            if (this.__typename.equals(battingStatsList5.__typename) && ((num = this.runs) != null ? num.equals(battingStatsList5.runs) : battingStatsList5.runs == null) && ((num2 = this.fours) != null ? num2.equals(battingStatsList5.fours) : battingStatsList5.fours == null) && ((num3 = this.sixes) != null ? num3.equals(battingStatsList5.sixes) : battingStatsList5.sixes == null) && ((num4 = this.balls) != null ? num4.equals(battingStatsList5.balls) : battingStatsList5.balls == null) && ((d = this.strikeRate) != null ? d.equals(battingStatsList5.strikeRate) : battingStatsList5.strikeRate == null)) {
                Boolean bool = this.isNotOut;
                Boolean bool2 = battingStatsList5.isNotOut;
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
                Integer num = this.runs;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.fours;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.sixes;
                int hashCode4 = (hashCode3 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.balls;
                int hashCode5 = (hashCode4 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Double d = this.strikeRate;
                int hashCode6 = (hashCode5 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Boolean bool = this.isNotOut;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BattingStatsList5> {
            @Override 
            public BattingStatsList5 map(ResponseReader responseReader) {
                return new BattingStatsList5(responseReader.readString(BattingStatsList5.$responseFields[0]), responseReader.readInt(BattingStatsList5.$responseFields[1]), responseReader.readInt(BattingStatsList5.$responseFields[2]), responseReader.readInt(BattingStatsList5.$responseFields[3]), responseReader.readInt(BattingStatsList5.$responseFields[4]), responseReader.readDouble(BattingStatsList5.$responseFields[5]), responseReader.readBoolean(BattingStatsList5.$responseFields[6]));
            }
        }
    }

    public static class BowlingStatsList5 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forInt("runsConceded", "runsConceded", null, true, Collections.emptyList()), ResponseField.forDouble("economyRate", "economyRate", null, true, Collections.emptyList()), ResponseField.forDouble("overs", "overs", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double economyRate;
        final Double overs;
        final Integer runsConceded;
        final Integer wickets;

        public BowlingStatsList5(String str, Integer num, Integer num2, Double d, Double d2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.wickets = num;
            this.runsConceded = num2;
            this.economyRate = d;
            this.overs = d2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer wickets() {
            return this.wickets;
        }

        public Integer runsConceded() {
            return this.runsConceded;
        }

        public Double economyRate() {
            return this.economyRate;
        }

        public Double overs() {
            return this.overs;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlingStatsList5.$responseFields[0], BowlingStatsList5.this.__typename);
                    responseWriter.writeInt(BowlingStatsList5.$responseFields[1], BowlingStatsList5.this.wickets);
                    responseWriter.writeInt(BowlingStatsList5.$responseFields[2], BowlingStatsList5.this.runsConceded);
                    responseWriter.writeDouble(BowlingStatsList5.$responseFields[3], BowlingStatsList5.this.economyRate);
                    responseWriter.writeDouble(BowlingStatsList5.$responseFields[4], BowlingStatsList5.this.overs);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlingStatsList5{__typename=" + this.__typename + ", wickets=" + this.wickets + ", runsConceded=" + this.runsConceded + ", economyRate=" + this.economyRate + ", overs=" + this.overs + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlingStatsList5)) {
                return false;
            }
            BowlingStatsList5 bowlingStatsList5 = (BowlingStatsList5) obj;
            if (this.__typename.equals(bowlingStatsList5.__typename) && ((num = this.wickets) != null ? num.equals(bowlingStatsList5.wickets) : bowlingStatsList5.wickets == null) && ((num2 = this.runsConceded) != null ? num2.equals(bowlingStatsList5.runsConceded) : bowlingStatsList5.runsConceded == null) && ((d = this.economyRate) != null ? d.equals(bowlingStatsList5.economyRate) : bowlingStatsList5.economyRate == null)) {
                Double d2 = this.overs;
                Double d3 = bowlingStatsList5.overs;
                if (d2 == null) {
                    if (d3 == null) {
                        return true;
                    }
                } else if (d2.equals(d3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.wickets;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.runsConceded;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Double d = this.economyRate;
                int hashCode4 = (hashCode3 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.overs;
                if (d2 != null) {
                    i = d2.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlingStatsList5> {
            @Override 
            public BowlingStatsList5 map(ResponseReader responseReader) {
                return new BowlingStatsList5(responseReader.readString(BowlingStatsList5.$responseFields[0]), responseReader.readInt(BowlingStatsList5.$responseFields[1]), responseReader.readInt(BowlingStatsList5.$responseFields[2]), responseReader.readDouble(BowlingStatsList5.$responseFields[3]), responseReader.readDouble(BowlingStatsList5.$responseFields[4]));
            }
        }
    }

    public static class FieldingStatsList5 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runsOuts", "runsOuts", null, true, Collections.emptyList()), ResponseField.forInt("catches", "catches", null, true, Collections.emptyList()), ResponseField.forInt("stumps", "stumps", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer catches;
        final Integer runsOuts;
        final Integer stumps;

        public FieldingStatsList5(String str, Integer num, Integer num2, Integer num3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runsOuts = num;
            this.catches = num2;
            this.stumps = num3;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runsOuts() {
            return this.runsOuts;
        }

        public Integer catches() {
            return this.catches;
        }

        public Integer stumps() {
            return this.stumps;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(FieldingStatsList5.$responseFields[0], FieldingStatsList5.this.__typename);
                    responseWriter.writeInt(FieldingStatsList5.$responseFields[1], FieldingStatsList5.this.runsOuts);
                    responseWriter.writeInt(FieldingStatsList5.$responseFields[2], FieldingStatsList5.this.catches);
                    responseWriter.writeInt(FieldingStatsList5.$responseFields[3], FieldingStatsList5.this.stumps);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FieldingStatsList5{__typename=" + this.__typename + ", runsOuts=" + this.runsOuts + ", catches=" + this.catches + ", stumps=" + this.stumps + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FieldingStatsList5)) {
                return false;
            }
            FieldingStatsList5 fieldingStatsList5 = (FieldingStatsList5) obj;
            if (this.__typename.equals(fieldingStatsList5.__typename) && ((num = this.runsOuts) != null ? num.equals(fieldingStatsList5.runsOuts) : fieldingStatsList5.runsOuts == null) && ((num2 = this.catches) != null ? num2.equals(fieldingStatsList5.catches) : fieldingStatsList5.catches == null)) {
                Integer num3 = this.stumps;
                Integer num4 = fieldingStatsList5.stumps;
                if (num3 == null) {
                    if (num4 == null) {
                        return true;
                    }
                } else if (num3.equals(num4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.runsOuts;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.catches;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.stumps;
                if (num3 != null) {
                    i = num3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<FieldingStatsList5> {
            @Override 
            public FieldingStatsList5 map(ResponseReader responseReader) {
                return new FieldingStatsList5(responseReader.readString(FieldingStatsList5.$responseFields[0]), responseReader.readInt(FieldingStatsList5.$responseFields[1]), responseReader.readInt(FieldingStatsList5.$responseFields[2]), responseReader.readInt(FieldingStatsList5.$responseFields[3]));
            }
        }
    }

    public static class InningWisePoints5 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("inningWiseBattingPoints", "inningWiseBattingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseBowlingPoints", "inningWiseBowlingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseFieldingPoints", "inningWiseFieldingPoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Double> inningWiseBattingPoints;
        final List<Double> inningWiseBowlingPoints;
        final List<Double> inningWiseFieldingPoints;

        public InningWisePoints5(String str, List<Double> list, List<Double> list2, List<Double> list3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.inningWiseBattingPoints = list;
            this.inningWiseBowlingPoints = list2;
            this.inningWiseFieldingPoints = list3;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Double> inningWiseBattingPoints() {
            return this.inningWiseBattingPoints;
        }

        public List<Double> inningWiseBowlingPoints() {
            return this.inningWiseBowlingPoints;
        }

        public List<Double> inningWiseFieldingPoints() {
            return this.inningWiseFieldingPoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(InningWisePoints5.$responseFields[0], InningWisePoints5.this.__typename);
                    responseWriter.writeList(InningWisePoints5.$responseFields[1], InningWisePoints5.this.inningWiseBattingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints5.$responseFields[2], InningWisePoints5.this.inningWiseBowlingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints5.$responseFields[3], InningWisePoints5.this.inningWiseFieldingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "InningWisePoints5{__typename=" + this.__typename + ", inningWiseBattingPoints=" + this.inningWiseBattingPoints + ", inningWiseBowlingPoints=" + this.inningWiseBowlingPoints + ", inningWiseFieldingPoints=" + this.inningWiseFieldingPoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<Double> list;
            List<Double> list2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InningWisePoints5)) {
                return false;
            }
            InningWisePoints5 inningWisePoints5 = (InningWisePoints5) obj;
            if (this.__typename.equals(inningWisePoints5.__typename) && ((list = this.inningWiseBattingPoints) != null ? list.equals(inningWisePoints5.inningWiseBattingPoints) : inningWisePoints5.inningWiseBattingPoints == null) && ((list2 = this.inningWiseBowlingPoints) != null ? list2.equals(inningWisePoints5.inningWiseBowlingPoints) : inningWisePoints5.inningWiseBowlingPoints == null)) {
                List<Double> list3 = this.inningWiseFieldingPoints;
                List<Double> list4 = inningWisePoints5.inningWiseFieldingPoints;
                if (list3 == null) {
                    if (list4 == null) {
                        return true;
                    }
                } else if (list3.equals(list4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<Double> list = this.inningWiseBattingPoints;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Double> list2 = this.inningWiseBowlingPoints;
                int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<Double> list3 = this.inningWiseFieldingPoints;
                if (list3 != null) {
                    i = list3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<InningWisePoints5> {
            @Override 
            public InningWisePoints5 map(ResponseReader responseReader) {
                return new InningWisePoints5(responseReader.readString(InningWisePoints5.$responseFields[0]), responseReader.readList(InningWisePoints5.$responseFields[1], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints5.$responseFields[2], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints5.$responseFields[3], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }));
            }
        }
    }

    public static class BowlerSummary1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forObject("topBowler", "topBowler", null, true, Collections.emptyList()), ResponseField.forObject("runnerBowler", "runnerBowler", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final RunnerBowler runnerBowler;
        final TopBowler topBowler;

        public BowlerSummary1(String str, TopBowler topBowler2, RunnerBowler runnerBowler2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.topBowler = topBowler2;
            this.runnerBowler = runnerBowler2;
        }

        public String __typename() {
            return this.__typename;
        }

        public TopBowler topBowler() {
            return this.topBowler;
        }

        public RunnerBowler runnerBowler() {
            return this.runnerBowler;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlerSummary1.$responseFields[0], BowlerSummary1.this.__typename);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(BowlerSummary1.$responseFields[1], BowlerSummary1.this.topBowler != null ? BowlerSummary1.this.topBowler.marshaller() : null);
                    ResponseField responseField = BowlerSummary1.$responseFields[2];
                    if (BowlerSummary1.this.runnerBowler != null) {
                        responseFieldMarshaller = BowlerSummary1.this.runnerBowler.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlerSummary1{__typename=" + this.__typename + ", topBowler=" + this.topBowler + ", runnerBowler=" + this.runnerBowler + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            TopBowler topBowler2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlerSummary1)) {
                return false;
            }
            BowlerSummary1 bowlerSummary1 = (BowlerSummary1) obj;
            if (this.__typename.equals(bowlerSummary1.__typename) && ((topBowler2 = this.topBowler) != null ? topBowler2.equals(bowlerSummary1.topBowler) : bowlerSummary1.topBowler == null)) {
                RunnerBowler runnerBowler2 = this.runnerBowler;
                RunnerBowler runnerBowler3 = bowlerSummary1.runnerBowler;
                if (runnerBowler2 == null) {
                    if (runnerBowler3 == null) {
                        return true;
                    }
                } else if (runnerBowler2.equals(runnerBowler3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                TopBowler topBowler2 = this.topBowler;
                int i = 0;
                int hashCode2 = (hashCode ^ (topBowler2 == null ? 0 : topBowler2.hashCode())) * 1000003;
                RunnerBowler runnerBowler2 = this.runnerBowler;
                if (runnerBowler2 != null) {
                    i = runnerBowler2.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlerSummary1> {
            final RunnerBowler.Mapper runnerBowlerFieldMapper = new RunnerBowler.Mapper();
            final TopBowler.Mapper topBowlerFieldMapper = new TopBowler.Mapper();

            @Override 
            public BowlerSummary1 map(ResponseReader responseReader) {
                return new BowlerSummary1(responseReader.readString(BowlerSummary1.$responseFields[0]), (TopBowler) responseReader.readObject(BowlerSummary1.$responseFields[1], new ResponseReader.ObjectReader<TopBowler>() {


                    @Override 
                    public TopBowler read(ResponseReader responseReader) {
                        return Mapper.this.topBowlerFieldMapper.map(responseReader);
                    }
                }), (RunnerBowler) responseReader.readObject(BowlerSummary1.$responseFields[2], new ResponseReader.ObjectReader<RunnerBowler>() {


                    @Override 
                    public RunnerBowler read(ResponseReader responseReader) {
                        return Mapper.this.runnerBowlerFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class TopBowler {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerNameHindi", "playerNameHindi", null, true, Collections.emptyList()), ResponseField.forString("playerTeam", "playerTeam", null, true, Collections.emptyList()), ResponseField.forString("playerTeamID", "playerTeamID", null, true, Collections.emptyList()), ResponseField.forDouble("totalBattingPoints", "totalBattingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalPoints", "totalPoints", null, true, Collections.emptyList()), ResponseField.forList("battingStatsList", "battingStatsList", null, true, Collections.emptyList()), ResponseField.forDouble("totalBowlingPoints", "totalBowlingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalFieldingPoints", "totalFieldingPoints", null, true, Collections.emptyList()), ResponseField.forList("bowlingStatsList", "bowlingStatsList", null, true, Collections.emptyList()), ResponseField.forList("fieldingStatsList", "fieldingStatsList", null, true, Collections.emptyList()), ResponseField.forObject("inningWisePoints", "inningWisePoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<BattingStatsList6> battingStatsList;
        final List<BowlingStatsList6> bowlingStatsList;
        final List<FieldingStatsList6> fieldingStatsList;
        final InningWisePoints6 inningWisePoints;
        final String playerID;
        final String playerName;
        final String playerNameHindi;
        final String playerTeam;
        final String playerTeamID;
        final Double totalBattingPoints;
        final Double totalBowlingPoints;
        final Double totalFieldingPoints;
        final Double totalPoints;

        public TopBowler(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, List<BattingStatsList6> list, Double d3, Double d4, List<BowlingStatsList6> list2, List<FieldingStatsList6> list3, InningWisePoints6 inningWisePoints6) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerName = str3;
            this.playerNameHindi = str4;
            this.playerTeam = str5;
            this.playerTeamID = str6;
            this.totalBattingPoints = d;
            this.totalPoints = d2;
            this.battingStatsList = list;
            this.totalBowlingPoints = d3;
            this.totalFieldingPoints = d4;
            this.bowlingStatsList = list2;
            this.fieldingStatsList = list3;
            this.inningWisePoints = inningWisePoints6;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerID() {
            return this.playerID;
        }

        public String playerName() {
            return this.playerName;
        }

        public String playerNameHindi() {
            return this.playerNameHindi;
        }

        public String playerTeam() {
            return this.playerTeam;
        }

        public String playerTeamID() {
            return this.playerTeamID;
        }

        public Double totalBattingPoints() {
            return this.totalBattingPoints;
        }

        public Double totalPoints() {
            return this.totalPoints;
        }

        public List<BattingStatsList6> battingStatsList() {
            return this.battingStatsList;
        }

        public Double totalBowlingPoints() {
            return this.totalBowlingPoints;
        }

        public Double totalFieldingPoints() {
            return this.totalFieldingPoints;
        }

        public List<BowlingStatsList6> bowlingStatsList() {
            return this.bowlingStatsList;
        }

        public List<FieldingStatsList6> fieldingStatsList() {
            return this.fieldingStatsList;
        }

        public InningWisePoints6 inningWisePoints() {
            return this.inningWisePoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TopBowler.$responseFields[0], TopBowler.this.__typename);
                    responseWriter.writeString(TopBowler.$responseFields[1], TopBowler.this.playerID);
                    responseWriter.writeString(TopBowler.$responseFields[2], TopBowler.this.playerName);
                    responseWriter.writeString(TopBowler.$responseFields[3], TopBowler.this.playerNameHindi);
                    responseWriter.writeString(TopBowler.$responseFields[4], TopBowler.this.playerTeam);
                    responseWriter.writeString(TopBowler.$responseFields[5], TopBowler.this.playerTeamID);
                    responseWriter.writeDouble(TopBowler.$responseFields[6], TopBowler.this.totalBattingPoints);
                    responseWriter.writeDouble(TopBowler.$responseFields[7], TopBowler.this.totalPoints);
                    responseWriter.writeList(TopBowler.$responseFields[8], TopBowler.this.battingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BattingStatsList6) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeDouble(TopBowler.$responseFields[9], TopBowler.this.totalBowlingPoints);
                    responseWriter.writeDouble(TopBowler.$responseFields[10], TopBowler.this.totalFieldingPoints);
                    responseWriter.writeList(TopBowler.$responseFields[11], TopBowler.this.bowlingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BowlingStatsList6) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(TopBowler.$responseFields[12], TopBowler.this.fieldingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((FieldingStatsList6) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeObject(TopBowler.$responseFields[13], TopBowler.this.inningWisePoints != null ? TopBowler.this.inningWisePoints.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TopBowler{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerNameHindi=" + this.playerNameHindi + ", playerTeam=" + this.playerTeam + ", playerTeamID=" + this.playerTeamID + ", totalBattingPoints=" + this.totalBattingPoints + ", totalPoints=" + this.totalPoints + ", battingStatsList=" + this.battingStatsList + ", totalBowlingPoints=" + this.totalBowlingPoints + ", totalFieldingPoints=" + this.totalFieldingPoints + ", bowlingStatsList=" + this.bowlingStatsList + ", fieldingStatsList=" + this.fieldingStatsList + ", inningWisePoints=" + this.inningWisePoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Double d;
            Double d2;
            List<BattingStatsList6> list;
            Double d3;
            Double d4;
            List<BowlingStatsList6> list2;
            List<FieldingStatsList6> list3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TopBowler)) {
                return false;
            }
            TopBowler topBowler = (TopBowler) obj;
            if (this.__typename.equals(topBowler.__typename) && ((str = this.playerID) != null ? str.equals(topBowler.playerID) : topBowler.playerID == null) && ((str2 = this.playerName) != null ? str2.equals(topBowler.playerName) : topBowler.playerName == null) && ((str3 = this.playerNameHindi) != null ? str3.equals(topBowler.playerNameHindi) : topBowler.playerNameHindi == null) && ((str4 = this.playerTeam) != null ? str4.equals(topBowler.playerTeam) : topBowler.playerTeam == null) && ((str5 = this.playerTeamID) != null ? str5.equals(topBowler.playerTeamID) : topBowler.playerTeamID == null) && ((d = this.totalBattingPoints) != null ? d.equals(topBowler.totalBattingPoints) : topBowler.totalBattingPoints == null) && ((d2 = this.totalPoints) != null ? d2.equals(topBowler.totalPoints) : topBowler.totalPoints == null) && ((list = this.battingStatsList) != null ? list.equals(topBowler.battingStatsList) : topBowler.battingStatsList == null) && ((d3 = this.totalBowlingPoints) != null ? d3.equals(topBowler.totalBowlingPoints) : topBowler.totalBowlingPoints == null) && ((d4 = this.totalFieldingPoints) != null ? d4.equals(topBowler.totalFieldingPoints) : topBowler.totalFieldingPoints == null) && ((list2 = this.bowlingStatsList) != null ? list2.equals(topBowler.bowlingStatsList) : topBowler.bowlingStatsList == null) && ((list3 = this.fieldingStatsList) != null ? list3.equals(topBowler.fieldingStatsList) : topBowler.fieldingStatsList == null)) {
                InningWisePoints6 inningWisePoints6 = this.inningWisePoints;
                InningWisePoints6 inningWisePoints62 = topBowler.inningWisePoints;
                if (inningWisePoints6 == null) {
                    if (inningWisePoints62 == null) {
                        return true;
                    }
                } else if (inningWisePoints6.equals(inningWisePoints62)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.playerID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerNameHindi;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerTeam;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerTeamID;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Double d = this.totalBattingPoints;
                int hashCode7 = (hashCode6 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.totalPoints;
                int hashCode8 = (hashCode7 ^ (d2 == null ? 0 : d2.hashCode())) * 1000003;
                List<BattingStatsList6> list = this.battingStatsList;
                int hashCode9 = (hashCode8 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                Double d3 = this.totalBowlingPoints;
                int hashCode10 = (hashCode9 ^ (d3 == null ? 0 : d3.hashCode())) * 1000003;
                Double d4 = this.totalFieldingPoints;
                int hashCode11 = (hashCode10 ^ (d4 == null ? 0 : d4.hashCode())) * 1000003;
                List<BowlingStatsList6> list2 = this.bowlingStatsList;
                int hashCode12 = (hashCode11 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<FieldingStatsList6> list3 = this.fieldingStatsList;
                int hashCode13 = (hashCode12 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                InningWisePoints6 inningWisePoints6 = this.inningWisePoints;
                if (inningWisePoints6 != null) {
                    i = inningWisePoints6.hashCode();
                }
                this.$hashCode = hashCode13 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TopBowler> {
            final BattingStatsList6.Mapper battingStatsList6FieldMapper = new BattingStatsList6.Mapper();
            final BowlingStatsList6.Mapper bowlingStatsList6FieldMapper = new BowlingStatsList6.Mapper();
            final FieldingStatsList6.Mapper fieldingStatsList6FieldMapper = new FieldingStatsList6.Mapper();
            final InningWisePoints6.Mapper inningWisePoints6FieldMapper = new InningWisePoints6.Mapper();

            @Override 
            public TopBowler map(ResponseReader responseReader) {
                return new TopBowler(responseReader.readString(TopBowler.$responseFields[0]), responseReader.readString(TopBowler.$responseFields[1]), responseReader.readString(TopBowler.$responseFields[2]), responseReader.readString(TopBowler.$responseFields[3]), responseReader.readString(TopBowler.$responseFields[4]), responseReader.readString(TopBowler.$responseFields[5]), responseReader.readDouble(TopBowler.$responseFields[6]), responseReader.readDouble(TopBowler.$responseFields[7]), responseReader.readList(TopBowler.$responseFields[8], new ResponseReader.ListReader<BattingStatsList6>() {


                    @Override 
                    public BattingStatsList6 read(ResponseReader.ListItemReader listItemReader) {
                        return (BattingStatsList6) listItemReader.readObject(new ResponseReader.ObjectReader<BattingStatsList6>() {


                            @Override 
                            public BattingStatsList6 read(ResponseReader responseReader) {
                                return Mapper.this.battingStatsList6FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readDouble(TopBowler.$responseFields[9]), responseReader.readDouble(TopBowler.$responseFields[10]), responseReader.readList(TopBowler.$responseFields[11], new ResponseReader.ListReader<BowlingStatsList6>() {


                    @Override 
                    public BowlingStatsList6 read(ResponseReader.ListItemReader listItemReader) {
                        return (BowlingStatsList6) listItemReader.readObject(new ResponseReader.ObjectReader<BowlingStatsList6>() {


                            @Override 
                            public BowlingStatsList6 read(ResponseReader responseReader) {
                                return Mapper.this.bowlingStatsList6FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(TopBowler.$responseFields[12], new ResponseReader.ListReader<FieldingStatsList6>() {


                    @Override 
                    public FieldingStatsList6 read(ResponseReader.ListItemReader listItemReader) {
                        return (FieldingStatsList6) listItemReader.readObject(new ResponseReader.ObjectReader<FieldingStatsList6>() {


                            @Override 
                            public FieldingStatsList6 read(ResponseReader responseReader) {
                                return Mapper.this.fieldingStatsList6FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (InningWisePoints6) responseReader.readObject(TopBowler.$responseFields[13], new ResponseReader.ObjectReader<InningWisePoints6>() {


                    @Override 
                    public InningWisePoints6 read(ResponseReader responseReader) {
                        return Mapper.this.inningWisePoints6FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class BattingStatsList6 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runs", "runs", null, true, Collections.emptyList()), ResponseField.forInt("fours", "fours", null, true, Collections.emptyList()), ResponseField.forInt("sixes", "sixes", null, true, Collections.emptyList()), ResponseField.forInt("balls", "balls", null, true, Collections.emptyList()), ResponseField.forDouble("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forBoolean("isNotOut", "isNotOut", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer balls;
        final Integer fours;
        final Boolean isNotOut;
        final Integer runs;
        final Integer sixes;
        final Double strikeRate;

        public BattingStatsList6(String str, Integer num, Integer num2, Integer num3, Integer num4, Double d, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runs = num;
            this.fours = num2;
            this.sixes = num3;
            this.balls = num4;
            this.strikeRate = d;
            this.isNotOut = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runs() {
            return this.runs;
        }

        public Integer fours() {
            return this.fours;
        }

        public Integer sixes() {
            return this.sixes;
        }

        public Integer balls() {
            return this.balls;
        }

        public Double strikeRate() {
            return this.strikeRate;
        }

        public Boolean isNotOut() {
            return this.isNotOut;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BattingStatsList6.$responseFields[0], BattingStatsList6.this.__typename);
                    responseWriter.writeInt(BattingStatsList6.$responseFields[1], BattingStatsList6.this.runs);
                    responseWriter.writeInt(BattingStatsList6.$responseFields[2], BattingStatsList6.this.fours);
                    responseWriter.writeInt(BattingStatsList6.$responseFields[3], BattingStatsList6.this.sixes);
                    responseWriter.writeInt(BattingStatsList6.$responseFields[4], BattingStatsList6.this.balls);
                    responseWriter.writeDouble(BattingStatsList6.$responseFields[5], BattingStatsList6.this.strikeRate);
                    responseWriter.writeBoolean(BattingStatsList6.$responseFields[6], BattingStatsList6.this.isNotOut);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BattingStatsList6{__typename=" + this.__typename + ", runs=" + this.runs + ", fours=" + this.fours + ", sixes=" + this.sixes + ", balls=" + this.balls + ", strikeRate=" + this.strikeRate + ", isNotOut=" + this.isNotOut + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattingStatsList6)) {
                return false;
            }
            BattingStatsList6 battingStatsList6 = (BattingStatsList6) obj;
            if (this.__typename.equals(battingStatsList6.__typename) && ((num = this.runs) != null ? num.equals(battingStatsList6.runs) : battingStatsList6.runs == null) && ((num2 = this.fours) != null ? num2.equals(battingStatsList6.fours) : battingStatsList6.fours == null) && ((num3 = this.sixes) != null ? num3.equals(battingStatsList6.sixes) : battingStatsList6.sixes == null) && ((num4 = this.balls) != null ? num4.equals(battingStatsList6.balls) : battingStatsList6.balls == null) && ((d = this.strikeRate) != null ? d.equals(battingStatsList6.strikeRate) : battingStatsList6.strikeRate == null)) {
                Boolean bool = this.isNotOut;
                Boolean bool2 = battingStatsList6.isNotOut;
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
                Integer num = this.runs;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.fours;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.sixes;
                int hashCode4 = (hashCode3 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.balls;
                int hashCode5 = (hashCode4 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Double d = this.strikeRate;
                int hashCode6 = (hashCode5 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Boolean bool = this.isNotOut;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BattingStatsList6> {
            @Override 
            public BattingStatsList6 map(ResponseReader responseReader) {
                return new BattingStatsList6(responseReader.readString(BattingStatsList6.$responseFields[0]), responseReader.readInt(BattingStatsList6.$responseFields[1]), responseReader.readInt(BattingStatsList6.$responseFields[2]), responseReader.readInt(BattingStatsList6.$responseFields[3]), responseReader.readInt(BattingStatsList6.$responseFields[4]), responseReader.readDouble(BattingStatsList6.$responseFields[5]), responseReader.readBoolean(BattingStatsList6.$responseFields[6]));
            }
        }
    }

    public static class BowlingStatsList6 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forInt("runsConceded", "runsConceded", null, true, Collections.emptyList()), ResponseField.forDouble("economyRate", "economyRate", null, true, Collections.emptyList()), ResponseField.forDouble("overs", "overs", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double economyRate;
        final Double overs;
        final Integer runsConceded;
        final Integer wickets;

        public BowlingStatsList6(String str, Integer num, Integer num2, Double d, Double d2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.wickets = num;
            this.runsConceded = num2;
            this.economyRate = d;
            this.overs = d2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer wickets() {
            return this.wickets;
        }

        public Integer runsConceded() {
            return this.runsConceded;
        }

        public Double economyRate() {
            return this.economyRate;
        }

        public Double overs() {
            return this.overs;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlingStatsList6.$responseFields[0], BowlingStatsList6.this.__typename);
                    responseWriter.writeInt(BowlingStatsList6.$responseFields[1], BowlingStatsList6.this.wickets);
                    responseWriter.writeInt(BowlingStatsList6.$responseFields[2], BowlingStatsList6.this.runsConceded);
                    responseWriter.writeDouble(BowlingStatsList6.$responseFields[3], BowlingStatsList6.this.economyRate);
                    responseWriter.writeDouble(BowlingStatsList6.$responseFields[4], BowlingStatsList6.this.overs);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlingStatsList6{__typename=" + this.__typename + ", wickets=" + this.wickets + ", runsConceded=" + this.runsConceded + ", economyRate=" + this.economyRate + ", overs=" + this.overs + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlingStatsList6)) {
                return false;
            }
            BowlingStatsList6 bowlingStatsList6 = (BowlingStatsList6) obj;
            if (this.__typename.equals(bowlingStatsList6.__typename) && ((num = this.wickets) != null ? num.equals(bowlingStatsList6.wickets) : bowlingStatsList6.wickets == null) && ((num2 = this.runsConceded) != null ? num2.equals(bowlingStatsList6.runsConceded) : bowlingStatsList6.runsConceded == null) && ((d = this.economyRate) != null ? d.equals(bowlingStatsList6.economyRate) : bowlingStatsList6.economyRate == null)) {
                Double d2 = this.overs;
                Double d3 = bowlingStatsList6.overs;
                if (d2 == null) {
                    if (d3 == null) {
                        return true;
                    }
                } else if (d2.equals(d3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.wickets;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.runsConceded;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Double d = this.economyRate;
                int hashCode4 = (hashCode3 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.overs;
                if (d2 != null) {
                    i = d2.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlingStatsList6> {
            @Override 
            public BowlingStatsList6 map(ResponseReader responseReader) {
                return new BowlingStatsList6(responseReader.readString(BowlingStatsList6.$responseFields[0]), responseReader.readInt(BowlingStatsList6.$responseFields[1]), responseReader.readInt(BowlingStatsList6.$responseFields[2]), responseReader.readDouble(BowlingStatsList6.$responseFields[3]), responseReader.readDouble(BowlingStatsList6.$responseFields[4]));
            }
        }
    }

    public static class FieldingStatsList6 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runsOuts", "runsOuts", null, true, Collections.emptyList()), ResponseField.forInt("catches", "catches", null, true, Collections.emptyList()), ResponseField.forInt("stumps", "stumps", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer catches;
        final Integer runsOuts;
        final Integer stumps;

        public FieldingStatsList6(String str, Integer num, Integer num2, Integer num3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runsOuts = num;
            this.catches = num2;
            this.stumps = num3;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runsOuts() {
            return this.runsOuts;
        }

        public Integer catches() {
            return this.catches;
        }

        public Integer stumps() {
            return this.stumps;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(FieldingStatsList6.$responseFields[0], FieldingStatsList6.this.__typename);
                    responseWriter.writeInt(FieldingStatsList6.$responseFields[1], FieldingStatsList6.this.runsOuts);
                    responseWriter.writeInt(FieldingStatsList6.$responseFields[2], FieldingStatsList6.this.catches);
                    responseWriter.writeInt(FieldingStatsList6.$responseFields[3], FieldingStatsList6.this.stumps);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FieldingStatsList6{__typename=" + this.__typename + ", runsOuts=" + this.runsOuts + ", catches=" + this.catches + ", stumps=" + this.stumps + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FieldingStatsList6)) {
                return false;
            }
            FieldingStatsList6 fieldingStatsList6 = (FieldingStatsList6) obj;
            if (this.__typename.equals(fieldingStatsList6.__typename) && ((num = this.runsOuts) != null ? num.equals(fieldingStatsList6.runsOuts) : fieldingStatsList6.runsOuts == null) && ((num2 = this.catches) != null ? num2.equals(fieldingStatsList6.catches) : fieldingStatsList6.catches == null)) {
                Integer num3 = this.stumps;
                Integer num4 = fieldingStatsList6.stumps;
                if (num3 == null) {
                    if (num4 == null) {
                        return true;
                    }
                } else if (num3.equals(num4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.runsOuts;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.catches;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.stumps;
                if (num3 != null) {
                    i = num3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<FieldingStatsList6> {
            @Override 
            public FieldingStatsList6 map(ResponseReader responseReader) {
                return new FieldingStatsList6(responseReader.readString(FieldingStatsList6.$responseFields[0]), responseReader.readInt(FieldingStatsList6.$responseFields[1]), responseReader.readInt(FieldingStatsList6.$responseFields[2]), responseReader.readInt(FieldingStatsList6.$responseFields[3]));
            }
        }
    }

    public static class InningWisePoints6 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("inningWiseBattingPoints", "inningWiseBattingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseBowlingPoints", "inningWiseBowlingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseFieldingPoints", "inningWiseFieldingPoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Double> inningWiseBattingPoints;
        final List<Double> inningWiseBowlingPoints;
        final List<Double> inningWiseFieldingPoints;

        public InningWisePoints6(String str, List<Double> list, List<Double> list2, List<Double> list3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.inningWiseBattingPoints = list;
            this.inningWiseBowlingPoints = list2;
            this.inningWiseFieldingPoints = list3;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Double> inningWiseBattingPoints() {
            return this.inningWiseBattingPoints;
        }

        public List<Double> inningWiseBowlingPoints() {
            return this.inningWiseBowlingPoints;
        }

        public List<Double> inningWiseFieldingPoints() {
            return this.inningWiseFieldingPoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(InningWisePoints6.$responseFields[0], InningWisePoints6.this.__typename);
                    responseWriter.writeList(InningWisePoints6.$responseFields[1], InningWisePoints6.this.inningWiseBattingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints6.$responseFields[2], InningWisePoints6.this.inningWiseBowlingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints6.$responseFields[3], InningWisePoints6.this.inningWiseFieldingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "InningWisePoints6{__typename=" + this.__typename + ", inningWiseBattingPoints=" + this.inningWiseBattingPoints + ", inningWiseBowlingPoints=" + this.inningWiseBowlingPoints + ", inningWiseFieldingPoints=" + this.inningWiseFieldingPoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<Double> list;
            List<Double> list2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InningWisePoints6)) {
                return false;
            }
            InningWisePoints6 inningWisePoints6 = (InningWisePoints6) obj;
            if (this.__typename.equals(inningWisePoints6.__typename) && ((list = this.inningWiseBattingPoints) != null ? list.equals(inningWisePoints6.inningWiseBattingPoints) : inningWisePoints6.inningWiseBattingPoints == null) && ((list2 = this.inningWiseBowlingPoints) != null ? list2.equals(inningWisePoints6.inningWiseBowlingPoints) : inningWisePoints6.inningWiseBowlingPoints == null)) {
                List<Double> list3 = this.inningWiseFieldingPoints;
                List<Double> list4 = inningWisePoints6.inningWiseFieldingPoints;
                if (list3 == null) {
                    if (list4 == null) {
                        return true;
                    }
                } else if (list3.equals(list4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<Double> list = this.inningWiseBattingPoints;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Double> list2 = this.inningWiseBowlingPoints;
                int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<Double> list3 = this.inningWiseFieldingPoints;
                if (list3 != null) {
                    i = list3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<InningWisePoints6> {
            @Override 
            public InningWisePoints6 map(ResponseReader responseReader) {
                return new InningWisePoints6(responseReader.readString(InningWisePoints6.$responseFields[0]), responseReader.readList(InningWisePoints6.$responseFields[1], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints6.$responseFields[2], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints6.$responseFields[3], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }));
            }
        }
    }

    public static class RunnerBowler {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerNameHindi", "playerNameHindi", null, true, Collections.emptyList()), ResponseField.forString("playerTeam", "playerTeam", null, true, Collections.emptyList()), ResponseField.forString("playerTeamID", "playerTeamID", null, true, Collections.emptyList()), ResponseField.forDouble("totalBattingPoints", "totalBattingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalPoints", "totalPoints", null, true, Collections.emptyList()), ResponseField.forList("battingStatsList", "battingStatsList", null, true, Collections.emptyList()), ResponseField.forDouble("totalBowlingPoints", "totalBowlingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalFieldingPoints", "totalFieldingPoints", null, true, Collections.emptyList()), ResponseField.forList("bowlingStatsList", "bowlingStatsList", null, true, Collections.emptyList()), ResponseField.forList("fieldingStatsList", "fieldingStatsList", null, true, Collections.emptyList()), ResponseField.forObject("inningWisePoints", "inningWisePoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<BattingStatsList7> battingStatsList;
        final List<BowlingStatsList7> bowlingStatsList;
        final List<FieldingStatsList7> fieldingStatsList;
        final InningWisePoints7 inningWisePoints;
        final String playerID;
        final String playerName;
        final String playerNameHindi;
        final String playerTeam;
        final String playerTeamID;
        final Double totalBattingPoints;
        final Double totalBowlingPoints;
        final Double totalFieldingPoints;
        final Double totalPoints;

        public RunnerBowler(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, List<BattingStatsList7> list, Double d3, Double d4, List<BowlingStatsList7> list2, List<FieldingStatsList7> list3, InningWisePoints7 inningWisePoints7) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerName = str3;
            this.playerNameHindi = str4;
            this.playerTeam = str5;
            this.playerTeamID = str6;
            this.totalBattingPoints = d;
            this.totalPoints = d2;
            this.battingStatsList = list;
            this.totalBowlingPoints = d3;
            this.totalFieldingPoints = d4;
            this.bowlingStatsList = list2;
            this.fieldingStatsList = list3;
            this.inningWisePoints = inningWisePoints7;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerID() {
            return this.playerID;
        }

        public String playerName() {
            return this.playerName;
        }

        public String playerNameHindi() {
            return this.playerNameHindi;
        }

        public String playerTeam() {
            return this.playerTeam;
        }

        public String playerTeamID() {
            return this.playerTeamID;
        }

        public Double totalBattingPoints() {
            return this.totalBattingPoints;
        }

        public Double totalPoints() {
            return this.totalPoints;
        }

        public List<BattingStatsList7> battingStatsList() {
            return this.battingStatsList;
        }

        public Double totalBowlingPoints() {
            return this.totalBowlingPoints;
        }

        public Double totalFieldingPoints() {
            return this.totalFieldingPoints;
        }

        public List<BowlingStatsList7> bowlingStatsList() {
            return this.bowlingStatsList;
        }

        public List<FieldingStatsList7> fieldingStatsList() {
            return this.fieldingStatsList;
        }

        public InningWisePoints7 inningWisePoints() {
            return this.inningWisePoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(RunnerBowler.$responseFields[0], RunnerBowler.this.__typename);
                    responseWriter.writeString(RunnerBowler.$responseFields[1], RunnerBowler.this.playerID);
                    responseWriter.writeString(RunnerBowler.$responseFields[2], RunnerBowler.this.playerName);
                    responseWriter.writeString(RunnerBowler.$responseFields[3], RunnerBowler.this.playerNameHindi);
                    responseWriter.writeString(RunnerBowler.$responseFields[4], RunnerBowler.this.playerTeam);
                    responseWriter.writeString(RunnerBowler.$responseFields[5], RunnerBowler.this.playerTeamID);
                    responseWriter.writeDouble(RunnerBowler.$responseFields[6], RunnerBowler.this.totalBattingPoints);
                    responseWriter.writeDouble(RunnerBowler.$responseFields[7], RunnerBowler.this.totalPoints);
                    responseWriter.writeList(RunnerBowler.$responseFields[8], RunnerBowler.this.battingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BattingStatsList7) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeDouble(RunnerBowler.$responseFields[9], RunnerBowler.this.totalBowlingPoints);
                    responseWriter.writeDouble(RunnerBowler.$responseFields[10], RunnerBowler.this.totalFieldingPoints);
                    responseWriter.writeList(RunnerBowler.$responseFields[11], RunnerBowler.this.bowlingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BowlingStatsList7) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(RunnerBowler.$responseFields[12], RunnerBowler.this.fieldingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((FieldingStatsList7) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeObject(RunnerBowler.$responseFields[13], RunnerBowler.this.inningWisePoints != null ? RunnerBowler.this.inningWisePoints.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "RunnerBowler{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerNameHindi=" + this.playerNameHindi + ", playerTeam=" + this.playerTeam + ", playerTeamID=" + this.playerTeamID + ", totalBattingPoints=" + this.totalBattingPoints + ", totalPoints=" + this.totalPoints + ", battingStatsList=" + this.battingStatsList + ", totalBowlingPoints=" + this.totalBowlingPoints + ", totalFieldingPoints=" + this.totalFieldingPoints + ", bowlingStatsList=" + this.bowlingStatsList + ", fieldingStatsList=" + this.fieldingStatsList + ", inningWisePoints=" + this.inningWisePoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Double d;
            Double d2;
            List<BattingStatsList7> list;
            Double d3;
            Double d4;
            List<BowlingStatsList7> list2;
            List<FieldingStatsList7> list3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RunnerBowler)) {
                return false;
            }
            RunnerBowler runnerBowler = (RunnerBowler) obj;
            if (this.__typename.equals(runnerBowler.__typename) && ((str = this.playerID) != null ? str.equals(runnerBowler.playerID) : runnerBowler.playerID == null) && ((str2 = this.playerName) != null ? str2.equals(runnerBowler.playerName) : runnerBowler.playerName == null) && ((str3 = this.playerNameHindi) != null ? str3.equals(runnerBowler.playerNameHindi) : runnerBowler.playerNameHindi == null) && ((str4 = this.playerTeam) != null ? str4.equals(runnerBowler.playerTeam) : runnerBowler.playerTeam == null) && ((str5 = this.playerTeamID) != null ? str5.equals(runnerBowler.playerTeamID) : runnerBowler.playerTeamID == null) && ((d = this.totalBattingPoints) != null ? d.equals(runnerBowler.totalBattingPoints) : runnerBowler.totalBattingPoints == null) && ((d2 = this.totalPoints) != null ? d2.equals(runnerBowler.totalPoints) : runnerBowler.totalPoints == null) && ((list = this.battingStatsList) != null ? list.equals(runnerBowler.battingStatsList) : runnerBowler.battingStatsList == null) && ((d3 = this.totalBowlingPoints) != null ? d3.equals(runnerBowler.totalBowlingPoints) : runnerBowler.totalBowlingPoints == null) && ((d4 = this.totalFieldingPoints) != null ? d4.equals(runnerBowler.totalFieldingPoints) : runnerBowler.totalFieldingPoints == null) && ((list2 = this.bowlingStatsList) != null ? list2.equals(runnerBowler.bowlingStatsList) : runnerBowler.bowlingStatsList == null) && ((list3 = this.fieldingStatsList) != null ? list3.equals(runnerBowler.fieldingStatsList) : runnerBowler.fieldingStatsList == null)) {
                InningWisePoints7 inningWisePoints7 = this.inningWisePoints;
                InningWisePoints7 inningWisePoints72 = runnerBowler.inningWisePoints;
                if (inningWisePoints7 == null) {
                    if (inningWisePoints72 == null) {
                        return true;
                    }
                } else if (inningWisePoints7.equals(inningWisePoints72)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.playerID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerNameHindi;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerTeam;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerTeamID;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Double d = this.totalBattingPoints;
                int hashCode7 = (hashCode6 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.totalPoints;
                int hashCode8 = (hashCode7 ^ (d2 == null ? 0 : d2.hashCode())) * 1000003;
                List<BattingStatsList7> list = this.battingStatsList;
                int hashCode9 = (hashCode8 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                Double d3 = this.totalBowlingPoints;
                int hashCode10 = (hashCode9 ^ (d3 == null ? 0 : d3.hashCode())) * 1000003;
                Double d4 = this.totalFieldingPoints;
                int hashCode11 = (hashCode10 ^ (d4 == null ? 0 : d4.hashCode())) * 1000003;
                List<BowlingStatsList7> list2 = this.bowlingStatsList;
                int hashCode12 = (hashCode11 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<FieldingStatsList7> list3 = this.fieldingStatsList;
                int hashCode13 = (hashCode12 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                InningWisePoints7 inningWisePoints7 = this.inningWisePoints;
                if (inningWisePoints7 != null) {
                    i = inningWisePoints7.hashCode();
                }
                this.$hashCode = hashCode13 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<RunnerBowler> {
            final BattingStatsList7.Mapper battingStatsList7FieldMapper = new BattingStatsList7.Mapper();
            final BowlingStatsList7.Mapper bowlingStatsList7FieldMapper = new BowlingStatsList7.Mapper();
            final FieldingStatsList7.Mapper fieldingStatsList7FieldMapper = new FieldingStatsList7.Mapper();
            final InningWisePoints7.Mapper inningWisePoints7FieldMapper = new InningWisePoints7.Mapper();

            @Override 
            public RunnerBowler map(ResponseReader responseReader) {
                return new RunnerBowler(responseReader.readString(RunnerBowler.$responseFields[0]), responseReader.readString(RunnerBowler.$responseFields[1]), responseReader.readString(RunnerBowler.$responseFields[2]), responseReader.readString(RunnerBowler.$responseFields[3]), responseReader.readString(RunnerBowler.$responseFields[4]), responseReader.readString(RunnerBowler.$responseFields[5]), responseReader.readDouble(RunnerBowler.$responseFields[6]), responseReader.readDouble(RunnerBowler.$responseFields[7]), responseReader.readList(RunnerBowler.$responseFields[8], new ResponseReader.ListReader<BattingStatsList7>() {


                    @Override 
                    public BattingStatsList7 read(ResponseReader.ListItemReader listItemReader) {
                        return (BattingStatsList7) listItemReader.readObject(new ResponseReader.ObjectReader<BattingStatsList7>() {


                            @Override 
                            public BattingStatsList7 read(ResponseReader responseReader) {
                                return Mapper.this.battingStatsList7FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readDouble(RunnerBowler.$responseFields[9]), responseReader.readDouble(RunnerBowler.$responseFields[10]), responseReader.readList(RunnerBowler.$responseFields[11], new ResponseReader.ListReader<BowlingStatsList7>() {


                    @Override 
                    public BowlingStatsList7 read(ResponseReader.ListItemReader listItemReader) {
                        return (BowlingStatsList7) listItemReader.readObject(new ResponseReader.ObjectReader<BowlingStatsList7>() {


                            @Override 
                            public BowlingStatsList7 read(ResponseReader responseReader) {
                                return Mapper.this.bowlingStatsList7FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(RunnerBowler.$responseFields[12], new ResponseReader.ListReader<FieldingStatsList7>() {


                    @Override 
                    public FieldingStatsList7 read(ResponseReader.ListItemReader listItemReader) {
                        return (FieldingStatsList7) listItemReader.readObject(new ResponseReader.ObjectReader<FieldingStatsList7>() {


                            @Override 
                            public FieldingStatsList7 read(ResponseReader responseReader) {
                                return Mapper.this.fieldingStatsList7FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (InningWisePoints7) responseReader.readObject(RunnerBowler.$responseFields[13], new ResponseReader.ObjectReader<InningWisePoints7>() {


                    @Override 
                    public InningWisePoints7 read(ResponseReader responseReader) {
                        return Mapper.this.inningWisePoints7FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class BattingStatsList7 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runs", "runs", null, true, Collections.emptyList()), ResponseField.forInt("fours", "fours", null, true, Collections.emptyList()), ResponseField.forInt("sixes", "sixes", null, true, Collections.emptyList()), ResponseField.forInt("balls", "balls", null, true, Collections.emptyList()), ResponseField.forDouble("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forBoolean("isNotOut", "isNotOut", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer balls;
        final Integer fours;
        final Boolean isNotOut;
        final Integer runs;
        final Integer sixes;
        final Double strikeRate;

        public BattingStatsList7(String str, Integer num, Integer num2, Integer num3, Integer num4, Double d, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runs = num;
            this.fours = num2;
            this.sixes = num3;
            this.balls = num4;
            this.strikeRate = d;
            this.isNotOut = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runs() {
            return this.runs;
        }

        public Integer fours() {
            return this.fours;
        }

        public Integer sixes() {
            return this.sixes;
        }

        public Integer balls() {
            return this.balls;
        }

        public Double strikeRate() {
            return this.strikeRate;
        }

        public Boolean isNotOut() {
            return this.isNotOut;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BattingStatsList7.$responseFields[0], BattingStatsList7.this.__typename);
                    responseWriter.writeInt(BattingStatsList7.$responseFields[1], BattingStatsList7.this.runs);
                    responseWriter.writeInt(BattingStatsList7.$responseFields[2], BattingStatsList7.this.fours);
                    responseWriter.writeInt(BattingStatsList7.$responseFields[3], BattingStatsList7.this.sixes);
                    responseWriter.writeInt(BattingStatsList7.$responseFields[4], BattingStatsList7.this.balls);
                    responseWriter.writeDouble(BattingStatsList7.$responseFields[5], BattingStatsList7.this.strikeRate);
                    responseWriter.writeBoolean(BattingStatsList7.$responseFields[6], BattingStatsList7.this.isNotOut);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BattingStatsList7{__typename=" + this.__typename + ", runs=" + this.runs + ", fours=" + this.fours + ", sixes=" + this.sixes + ", balls=" + this.balls + ", strikeRate=" + this.strikeRate + ", isNotOut=" + this.isNotOut + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattingStatsList7)) {
                return false;
            }
            BattingStatsList7 battingStatsList7 = (BattingStatsList7) obj;
            if (this.__typename.equals(battingStatsList7.__typename) && ((num = this.runs) != null ? num.equals(battingStatsList7.runs) : battingStatsList7.runs == null) && ((num2 = this.fours) != null ? num2.equals(battingStatsList7.fours) : battingStatsList7.fours == null) && ((num3 = this.sixes) != null ? num3.equals(battingStatsList7.sixes) : battingStatsList7.sixes == null) && ((num4 = this.balls) != null ? num4.equals(battingStatsList7.balls) : battingStatsList7.balls == null) && ((d = this.strikeRate) != null ? d.equals(battingStatsList7.strikeRate) : battingStatsList7.strikeRate == null)) {
                Boolean bool = this.isNotOut;
                Boolean bool2 = battingStatsList7.isNotOut;
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
                Integer num = this.runs;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.fours;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.sixes;
                int hashCode4 = (hashCode3 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.balls;
                int hashCode5 = (hashCode4 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Double d = this.strikeRate;
                int hashCode6 = (hashCode5 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Boolean bool = this.isNotOut;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BattingStatsList7> {
            @Override 
            public BattingStatsList7 map(ResponseReader responseReader) {
                return new BattingStatsList7(responseReader.readString(BattingStatsList7.$responseFields[0]), responseReader.readInt(BattingStatsList7.$responseFields[1]), responseReader.readInt(BattingStatsList7.$responseFields[2]), responseReader.readInt(BattingStatsList7.$responseFields[3]), responseReader.readInt(BattingStatsList7.$responseFields[4]), responseReader.readDouble(BattingStatsList7.$responseFields[5]), responseReader.readBoolean(BattingStatsList7.$responseFields[6]));
            }
        }
    }

    public static class BowlingStatsList7 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forInt("runsConceded", "runsConceded", null, true, Collections.emptyList()), ResponseField.forDouble("economyRate", "economyRate", null, true, Collections.emptyList()), ResponseField.forDouble("overs", "overs", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double economyRate;
        final Double overs;
        final Integer runsConceded;
        final Integer wickets;

        public BowlingStatsList7(String str, Integer num, Integer num2, Double d, Double d2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.wickets = num;
            this.runsConceded = num2;
            this.economyRate = d;
            this.overs = d2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer wickets() {
            return this.wickets;
        }

        public Integer runsConceded() {
            return this.runsConceded;
        }

        public Double economyRate() {
            return this.economyRate;
        }

        public Double overs() {
            return this.overs;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlingStatsList7.$responseFields[0], BowlingStatsList7.this.__typename);
                    responseWriter.writeInt(BowlingStatsList7.$responseFields[1], BowlingStatsList7.this.wickets);
                    responseWriter.writeInt(BowlingStatsList7.$responseFields[2], BowlingStatsList7.this.runsConceded);
                    responseWriter.writeDouble(BowlingStatsList7.$responseFields[3], BowlingStatsList7.this.economyRate);
                    responseWriter.writeDouble(BowlingStatsList7.$responseFields[4], BowlingStatsList7.this.overs);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlingStatsList7{__typename=" + this.__typename + ", wickets=" + this.wickets + ", runsConceded=" + this.runsConceded + ", economyRate=" + this.economyRate + ", overs=" + this.overs + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlingStatsList7)) {
                return false;
            }
            BowlingStatsList7 bowlingStatsList7 = (BowlingStatsList7) obj;
            if (this.__typename.equals(bowlingStatsList7.__typename) && ((num = this.wickets) != null ? num.equals(bowlingStatsList7.wickets) : bowlingStatsList7.wickets == null) && ((num2 = this.runsConceded) != null ? num2.equals(bowlingStatsList7.runsConceded) : bowlingStatsList7.runsConceded == null) && ((d = this.economyRate) != null ? d.equals(bowlingStatsList7.economyRate) : bowlingStatsList7.economyRate == null)) {
                Double d2 = this.overs;
                Double d3 = bowlingStatsList7.overs;
                if (d2 == null) {
                    if (d3 == null) {
                        return true;
                    }
                } else if (d2.equals(d3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.wickets;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.runsConceded;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Double d = this.economyRate;
                int hashCode4 = (hashCode3 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.overs;
                if (d2 != null) {
                    i = d2.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlingStatsList7> {
            @Override 
            public BowlingStatsList7 map(ResponseReader responseReader) {
                return new BowlingStatsList7(responseReader.readString(BowlingStatsList7.$responseFields[0]), responseReader.readInt(BowlingStatsList7.$responseFields[1]), responseReader.readInt(BowlingStatsList7.$responseFields[2]), responseReader.readDouble(BowlingStatsList7.$responseFields[3]), responseReader.readDouble(BowlingStatsList7.$responseFields[4]));
            }
        }
    }

    public static class FieldingStatsList7 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runsOuts", "runsOuts", null, true, Collections.emptyList()), ResponseField.forInt("catches", "catches", null, true, Collections.emptyList()), ResponseField.forInt("stumps", "stumps", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer catches;
        final Integer runsOuts;
        final Integer stumps;

        public FieldingStatsList7(String str, Integer num, Integer num2, Integer num3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runsOuts = num;
            this.catches = num2;
            this.stumps = num3;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runsOuts() {
            return this.runsOuts;
        }

        public Integer catches() {
            return this.catches;
        }

        public Integer stumps() {
            return this.stumps;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(FieldingStatsList7.$responseFields[0], FieldingStatsList7.this.__typename);
                    responseWriter.writeInt(FieldingStatsList7.$responseFields[1], FieldingStatsList7.this.runsOuts);
                    responseWriter.writeInt(FieldingStatsList7.$responseFields[2], FieldingStatsList7.this.catches);
                    responseWriter.writeInt(FieldingStatsList7.$responseFields[3], FieldingStatsList7.this.stumps);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FieldingStatsList7{__typename=" + this.__typename + ", runsOuts=" + this.runsOuts + ", catches=" + this.catches + ", stumps=" + this.stumps + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FieldingStatsList7)) {
                return false;
            }
            FieldingStatsList7 fieldingStatsList7 = (FieldingStatsList7) obj;
            if (this.__typename.equals(fieldingStatsList7.__typename) && ((num = this.runsOuts) != null ? num.equals(fieldingStatsList7.runsOuts) : fieldingStatsList7.runsOuts == null) && ((num2 = this.catches) != null ? num2.equals(fieldingStatsList7.catches) : fieldingStatsList7.catches == null)) {
                Integer num3 = this.stumps;
                Integer num4 = fieldingStatsList7.stumps;
                if (num3 == null) {
                    if (num4 == null) {
                        return true;
                    }
                } else if (num3.equals(num4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.runsOuts;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.catches;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.stumps;
                if (num3 != null) {
                    i = num3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<FieldingStatsList7> {
            @Override 
            public FieldingStatsList7 map(ResponseReader responseReader) {
                return new FieldingStatsList7(responseReader.readString(FieldingStatsList7.$responseFields[0]), responseReader.readInt(FieldingStatsList7.$responseFields[1]), responseReader.readInt(FieldingStatsList7.$responseFields[2]), responseReader.readInt(FieldingStatsList7.$responseFields[3]));
            }
        }
    }

    public static class InningWisePoints7 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("inningWiseBattingPoints", "inningWiseBattingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseBowlingPoints", "inningWiseBowlingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseFieldingPoints", "inningWiseFieldingPoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Double> inningWiseBattingPoints;
        final List<Double> inningWiseBowlingPoints;
        final List<Double> inningWiseFieldingPoints;

        public InningWisePoints7(String str, List<Double> list, List<Double> list2, List<Double> list3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.inningWiseBattingPoints = list;
            this.inningWiseBowlingPoints = list2;
            this.inningWiseFieldingPoints = list3;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Double> inningWiseBattingPoints() {
            return this.inningWiseBattingPoints;
        }

        public List<Double> inningWiseBowlingPoints() {
            return this.inningWiseBowlingPoints;
        }

        public List<Double> inningWiseFieldingPoints() {
            return this.inningWiseFieldingPoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(InningWisePoints7.$responseFields[0], InningWisePoints7.this.__typename);
                    responseWriter.writeList(InningWisePoints7.$responseFields[1], InningWisePoints7.this.inningWiseBattingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints7.$responseFields[2], InningWisePoints7.this.inningWiseBowlingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints7.$responseFields[3], InningWisePoints7.this.inningWiseFieldingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "InningWisePoints7{__typename=" + this.__typename + ", inningWiseBattingPoints=" + this.inningWiseBattingPoints + ", inningWiseBowlingPoints=" + this.inningWiseBowlingPoints + ", inningWiseFieldingPoints=" + this.inningWiseFieldingPoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<Double> list;
            List<Double> list2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InningWisePoints7)) {
                return false;
            }
            InningWisePoints7 inningWisePoints7 = (InningWisePoints7) obj;
            if (this.__typename.equals(inningWisePoints7.__typename) && ((list = this.inningWiseBattingPoints) != null ? list.equals(inningWisePoints7.inningWiseBattingPoints) : inningWisePoints7.inningWiseBattingPoints == null) && ((list2 = this.inningWiseBowlingPoints) != null ? list2.equals(inningWisePoints7.inningWiseBowlingPoints) : inningWisePoints7.inningWiseBowlingPoints == null)) {
                List<Double> list3 = this.inningWiseFieldingPoints;
                List<Double> list4 = inningWisePoints7.inningWiseFieldingPoints;
                if (list3 == null) {
                    if (list4 == null) {
                        return true;
                    }
                } else if (list3.equals(list4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<Double> list = this.inningWiseBattingPoints;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Double> list2 = this.inningWiseBowlingPoints;
                int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<Double> list3 = this.inningWiseFieldingPoints;
                if (list3 != null) {
                    i = list3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<InningWisePoints7> {
            @Override 
            public InningWisePoints7 map(ResponseReader responseReader) {
                return new InningWisePoints7(responseReader.readString(InningWisePoints7.$responseFields[0]), responseReader.readList(InningWisePoints7.$responseFields[1], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints7.$responseFields[2], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints7.$responseFields[3], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }));
            }
        }
    }

    public static class BowlerSummary2 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forObject("topBowler", "topBowler", null, true, Collections.emptyList()), ResponseField.forObject("runnerBowler", "runnerBowler", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final RunnerBowler1 runnerBowler;
        final TopBowler1 topBowler;

        public BowlerSummary2(String str, TopBowler1 topBowler1, RunnerBowler1 runnerBowler1) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.topBowler = topBowler1;
            this.runnerBowler = runnerBowler1;
        }

        public String __typename() {
            return this.__typename;
        }

        public TopBowler1 topBowler() {
            return this.topBowler;
        }

        public RunnerBowler1 runnerBowler() {
            return this.runnerBowler;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlerSummary2.$responseFields[0], BowlerSummary2.this.__typename);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(BowlerSummary2.$responseFields[1], BowlerSummary2.this.topBowler != null ? BowlerSummary2.this.topBowler.marshaller() : null);
                    ResponseField responseField = BowlerSummary2.$responseFields[2];
                    if (BowlerSummary2.this.runnerBowler != null) {
                        responseFieldMarshaller = BowlerSummary2.this.runnerBowler.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlerSummary2{__typename=" + this.__typename + ", topBowler=" + this.topBowler + ", runnerBowler=" + this.runnerBowler + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            TopBowler1 topBowler1;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlerSummary2)) {
                return false;
            }
            BowlerSummary2 bowlerSummary2 = (BowlerSummary2) obj;
            if (this.__typename.equals(bowlerSummary2.__typename) && ((topBowler1 = this.topBowler) != null ? topBowler1.equals(bowlerSummary2.topBowler) : bowlerSummary2.topBowler == null)) {
                RunnerBowler1 runnerBowler1 = this.runnerBowler;
                RunnerBowler1 runnerBowler12 = bowlerSummary2.runnerBowler;
                if (runnerBowler1 == null) {
                    if (runnerBowler12 == null) {
                        return true;
                    }
                } else if (runnerBowler1.equals(runnerBowler12)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                TopBowler1 topBowler1 = this.topBowler;
                int i = 0;
                int hashCode2 = (hashCode ^ (topBowler1 == null ? 0 : topBowler1.hashCode())) * 1000003;
                RunnerBowler1 runnerBowler1 = this.runnerBowler;
                if (runnerBowler1 != null) {
                    i = runnerBowler1.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlerSummary2> {
            final RunnerBowler1.Mapper runnerBowler1FieldMapper = new RunnerBowler1.Mapper();
            final TopBowler1.Mapper topBowler1FieldMapper = new TopBowler1.Mapper();

            @Override 
            public BowlerSummary2 map(ResponseReader responseReader) {
                return new BowlerSummary2(responseReader.readString(BowlerSummary2.$responseFields[0]), (TopBowler1) responseReader.readObject(BowlerSummary2.$responseFields[1], new ResponseReader.ObjectReader<TopBowler1>() {


                    @Override 
                    public TopBowler1 read(ResponseReader responseReader) {
                        return Mapper.this.topBowler1FieldMapper.map(responseReader);
                    }
                }), (RunnerBowler1) responseReader.readObject(BowlerSummary2.$responseFields[2], new ResponseReader.ObjectReader<RunnerBowler1>() {


                    @Override 
                    public RunnerBowler1 read(ResponseReader responseReader) {
                        return Mapper.this.runnerBowler1FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class TopBowler1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerNameHindi", "playerNameHindi", null, true, Collections.emptyList()), ResponseField.forString("playerTeam", "playerTeam", null, true, Collections.emptyList()), ResponseField.forString("playerTeamID", "playerTeamID", null, true, Collections.emptyList()), ResponseField.forDouble("totalBattingPoints", "totalBattingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalPoints", "totalPoints", null, true, Collections.emptyList()), ResponseField.forList("battingStatsList", "battingStatsList", null, true, Collections.emptyList()), ResponseField.forDouble("totalBowlingPoints", "totalBowlingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalFieldingPoints", "totalFieldingPoints", null, true, Collections.emptyList()), ResponseField.forList("bowlingStatsList", "bowlingStatsList", null, true, Collections.emptyList()), ResponseField.forList("fieldingStatsList", "fieldingStatsList", null, true, Collections.emptyList()), ResponseField.forObject("inningWisePoints", "inningWisePoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<BattingStatsList8> battingStatsList;
        final List<BowlingStatsList8> bowlingStatsList;
        final List<FieldingStatsList8> fieldingStatsList;
        final InningWisePoints8 inningWisePoints;
        final String playerID;
        final String playerName;
        final String playerNameHindi;
        final String playerTeam;
        final String playerTeamID;
        final Double totalBattingPoints;
        final Double totalBowlingPoints;
        final Double totalFieldingPoints;
        final Double totalPoints;

        public TopBowler1(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, List<BattingStatsList8> list, Double d3, Double d4, List<BowlingStatsList8> list2, List<FieldingStatsList8> list3, InningWisePoints8 inningWisePoints8) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerName = str3;
            this.playerNameHindi = str4;
            this.playerTeam = str5;
            this.playerTeamID = str6;
            this.totalBattingPoints = d;
            this.totalPoints = d2;
            this.battingStatsList = list;
            this.totalBowlingPoints = d3;
            this.totalFieldingPoints = d4;
            this.bowlingStatsList = list2;
            this.fieldingStatsList = list3;
            this.inningWisePoints = inningWisePoints8;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerID() {
            return this.playerID;
        }

        public String playerName() {
            return this.playerName;
        }

        public String playerNameHindi() {
            return this.playerNameHindi;
        }

        public String playerTeam() {
            return this.playerTeam;
        }

        public String playerTeamID() {
            return this.playerTeamID;
        }

        public Double totalBattingPoints() {
            return this.totalBattingPoints;
        }

        public Double totalPoints() {
            return this.totalPoints;
        }

        public List<BattingStatsList8> battingStatsList() {
            return this.battingStatsList;
        }

        public Double totalBowlingPoints() {
            return this.totalBowlingPoints;
        }

        public Double totalFieldingPoints() {
            return this.totalFieldingPoints;
        }

        public List<BowlingStatsList8> bowlingStatsList() {
            return this.bowlingStatsList;
        }

        public List<FieldingStatsList8> fieldingStatsList() {
            return this.fieldingStatsList;
        }

        public InningWisePoints8 inningWisePoints() {
            return this.inningWisePoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TopBowler1.$responseFields[0], TopBowler1.this.__typename);
                    responseWriter.writeString(TopBowler1.$responseFields[1], TopBowler1.this.playerID);
                    responseWriter.writeString(TopBowler1.$responseFields[2], TopBowler1.this.playerName);
                    responseWriter.writeString(TopBowler1.$responseFields[3], TopBowler1.this.playerNameHindi);
                    responseWriter.writeString(TopBowler1.$responseFields[4], TopBowler1.this.playerTeam);
                    responseWriter.writeString(TopBowler1.$responseFields[5], TopBowler1.this.playerTeamID);
                    responseWriter.writeDouble(TopBowler1.$responseFields[6], TopBowler1.this.totalBattingPoints);
                    responseWriter.writeDouble(TopBowler1.$responseFields[7], TopBowler1.this.totalPoints);
                    responseWriter.writeList(TopBowler1.$responseFields[8], TopBowler1.this.battingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BattingStatsList8) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeDouble(TopBowler1.$responseFields[9], TopBowler1.this.totalBowlingPoints);
                    responseWriter.writeDouble(TopBowler1.$responseFields[10], TopBowler1.this.totalFieldingPoints);
                    responseWriter.writeList(TopBowler1.$responseFields[11], TopBowler1.this.bowlingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BowlingStatsList8) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(TopBowler1.$responseFields[12], TopBowler1.this.fieldingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((FieldingStatsList8) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeObject(TopBowler1.$responseFields[13], TopBowler1.this.inningWisePoints != null ? TopBowler1.this.inningWisePoints.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TopBowler1{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerNameHindi=" + this.playerNameHindi + ", playerTeam=" + this.playerTeam + ", playerTeamID=" + this.playerTeamID + ", totalBattingPoints=" + this.totalBattingPoints + ", totalPoints=" + this.totalPoints + ", battingStatsList=" + this.battingStatsList + ", totalBowlingPoints=" + this.totalBowlingPoints + ", totalFieldingPoints=" + this.totalFieldingPoints + ", bowlingStatsList=" + this.bowlingStatsList + ", fieldingStatsList=" + this.fieldingStatsList + ", inningWisePoints=" + this.inningWisePoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Double d;
            Double d2;
            List<BattingStatsList8> list;
            Double d3;
            Double d4;
            List<BowlingStatsList8> list2;
            List<FieldingStatsList8> list3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TopBowler1)) {
                return false;
            }
            TopBowler1 topBowler1 = (TopBowler1) obj;
            if (this.__typename.equals(topBowler1.__typename) && ((str = this.playerID) != null ? str.equals(topBowler1.playerID) : topBowler1.playerID == null) && ((str2 = this.playerName) != null ? str2.equals(topBowler1.playerName) : topBowler1.playerName == null) && ((str3 = this.playerNameHindi) != null ? str3.equals(topBowler1.playerNameHindi) : topBowler1.playerNameHindi == null) && ((str4 = this.playerTeam) != null ? str4.equals(topBowler1.playerTeam) : topBowler1.playerTeam == null) && ((str5 = this.playerTeamID) != null ? str5.equals(topBowler1.playerTeamID) : topBowler1.playerTeamID == null) && ((d = this.totalBattingPoints) != null ? d.equals(topBowler1.totalBattingPoints) : topBowler1.totalBattingPoints == null) && ((d2 = this.totalPoints) != null ? d2.equals(topBowler1.totalPoints) : topBowler1.totalPoints == null) && ((list = this.battingStatsList) != null ? list.equals(topBowler1.battingStatsList) : topBowler1.battingStatsList == null) && ((d3 = this.totalBowlingPoints) != null ? d3.equals(topBowler1.totalBowlingPoints) : topBowler1.totalBowlingPoints == null) && ((d4 = this.totalFieldingPoints) != null ? d4.equals(topBowler1.totalFieldingPoints) : topBowler1.totalFieldingPoints == null) && ((list2 = this.bowlingStatsList) != null ? list2.equals(topBowler1.bowlingStatsList) : topBowler1.bowlingStatsList == null) && ((list3 = this.fieldingStatsList) != null ? list3.equals(topBowler1.fieldingStatsList) : topBowler1.fieldingStatsList == null)) {
                InningWisePoints8 inningWisePoints8 = this.inningWisePoints;
                InningWisePoints8 inningWisePoints82 = topBowler1.inningWisePoints;
                if (inningWisePoints8 == null) {
                    if (inningWisePoints82 == null) {
                        return true;
                    }
                } else if (inningWisePoints8.equals(inningWisePoints82)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.playerID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerNameHindi;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerTeam;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerTeamID;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Double d = this.totalBattingPoints;
                int hashCode7 = (hashCode6 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.totalPoints;
                int hashCode8 = (hashCode7 ^ (d2 == null ? 0 : d2.hashCode())) * 1000003;
                List<BattingStatsList8> list = this.battingStatsList;
                int hashCode9 = (hashCode8 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                Double d3 = this.totalBowlingPoints;
                int hashCode10 = (hashCode9 ^ (d3 == null ? 0 : d3.hashCode())) * 1000003;
                Double d4 = this.totalFieldingPoints;
                int hashCode11 = (hashCode10 ^ (d4 == null ? 0 : d4.hashCode())) * 1000003;
                List<BowlingStatsList8> list2 = this.bowlingStatsList;
                int hashCode12 = (hashCode11 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<FieldingStatsList8> list3 = this.fieldingStatsList;
                int hashCode13 = (hashCode12 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                InningWisePoints8 inningWisePoints8 = this.inningWisePoints;
                if (inningWisePoints8 != null) {
                    i = inningWisePoints8.hashCode();
                }
                this.$hashCode = hashCode13 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TopBowler1> {
            final BattingStatsList8.Mapper battingStatsList8FieldMapper = new BattingStatsList8.Mapper();
            final BowlingStatsList8.Mapper bowlingStatsList8FieldMapper = new BowlingStatsList8.Mapper();
            final FieldingStatsList8.Mapper fieldingStatsList8FieldMapper = new FieldingStatsList8.Mapper();
            final InningWisePoints8.Mapper inningWisePoints8FieldMapper = new InningWisePoints8.Mapper();

            @Override 
            public TopBowler1 map(ResponseReader responseReader) {
                return new TopBowler1(responseReader.readString(TopBowler1.$responseFields[0]), responseReader.readString(TopBowler1.$responseFields[1]), responseReader.readString(TopBowler1.$responseFields[2]), responseReader.readString(TopBowler1.$responseFields[3]), responseReader.readString(TopBowler1.$responseFields[4]), responseReader.readString(TopBowler1.$responseFields[5]), responseReader.readDouble(TopBowler1.$responseFields[6]), responseReader.readDouble(TopBowler1.$responseFields[7]), responseReader.readList(TopBowler1.$responseFields[8], new ResponseReader.ListReader<BattingStatsList8>() {


                    @Override 
                    public BattingStatsList8 read(ResponseReader.ListItemReader listItemReader) {
                        return (BattingStatsList8) listItemReader.readObject(new ResponseReader.ObjectReader<BattingStatsList8>() {


                            @Override 
                            public BattingStatsList8 read(ResponseReader responseReader) {
                                return Mapper.this.battingStatsList8FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readDouble(TopBowler1.$responseFields[9]), responseReader.readDouble(TopBowler1.$responseFields[10]), responseReader.readList(TopBowler1.$responseFields[11], new ResponseReader.ListReader<BowlingStatsList8>() {


                    @Override 
                    public BowlingStatsList8 read(ResponseReader.ListItemReader listItemReader) {
                        return (BowlingStatsList8) listItemReader.readObject(new ResponseReader.ObjectReader<BowlingStatsList8>() {


                            @Override 
                            public BowlingStatsList8 read(ResponseReader responseReader) {
                                return Mapper.this.bowlingStatsList8FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(TopBowler1.$responseFields[12], new ResponseReader.ListReader<FieldingStatsList8>() {


                    @Override 
                    public FieldingStatsList8 read(ResponseReader.ListItemReader listItemReader) {
                        return (FieldingStatsList8) listItemReader.readObject(new ResponseReader.ObjectReader<FieldingStatsList8>() {


                            @Override 
                            public FieldingStatsList8 read(ResponseReader responseReader) {
                                return Mapper.this.fieldingStatsList8FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (InningWisePoints8) responseReader.readObject(TopBowler1.$responseFields[13], new ResponseReader.ObjectReader<InningWisePoints8>() {


                    @Override 
                    public InningWisePoints8 read(ResponseReader responseReader) {
                        return Mapper.this.inningWisePoints8FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class BattingStatsList8 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runs", "runs", null, true, Collections.emptyList()), ResponseField.forInt("fours", "fours", null, true, Collections.emptyList()), ResponseField.forInt("sixes", "sixes", null, true, Collections.emptyList()), ResponseField.forInt("balls", "balls", null, true, Collections.emptyList()), ResponseField.forDouble("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forBoolean("isNotOut", "isNotOut", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer balls;
        final Integer fours;
        final Boolean isNotOut;
        final Integer runs;
        final Integer sixes;
        final Double strikeRate;

        public BattingStatsList8(String str, Integer num, Integer num2, Integer num3, Integer num4, Double d, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runs = num;
            this.fours = num2;
            this.sixes = num3;
            this.balls = num4;
            this.strikeRate = d;
            this.isNotOut = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runs() {
            return this.runs;
        }

        public Integer fours() {
            return this.fours;
        }

        public Integer sixes() {
            return this.sixes;
        }

        public Integer balls() {
            return this.balls;
        }

        public Double strikeRate() {
            return this.strikeRate;
        }

        public Boolean isNotOut() {
            return this.isNotOut;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BattingStatsList8.$responseFields[0], BattingStatsList8.this.__typename);
                    responseWriter.writeInt(BattingStatsList8.$responseFields[1], BattingStatsList8.this.runs);
                    responseWriter.writeInt(BattingStatsList8.$responseFields[2], BattingStatsList8.this.fours);
                    responseWriter.writeInt(BattingStatsList8.$responseFields[3], BattingStatsList8.this.sixes);
                    responseWriter.writeInt(BattingStatsList8.$responseFields[4], BattingStatsList8.this.balls);
                    responseWriter.writeDouble(BattingStatsList8.$responseFields[5], BattingStatsList8.this.strikeRate);
                    responseWriter.writeBoolean(BattingStatsList8.$responseFields[6], BattingStatsList8.this.isNotOut);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BattingStatsList8{__typename=" + this.__typename + ", runs=" + this.runs + ", fours=" + this.fours + ", sixes=" + this.sixes + ", balls=" + this.balls + ", strikeRate=" + this.strikeRate + ", isNotOut=" + this.isNotOut + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattingStatsList8)) {
                return false;
            }
            BattingStatsList8 battingStatsList8 = (BattingStatsList8) obj;
            if (this.__typename.equals(battingStatsList8.__typename) && ((num = this.runs) != null ? num.equals(battingStatsList8.runs) : battingStatsList8.runs == null) && ((num2 = this.fours) != null ? num2.equals(battingStatsList8.fours) : battingStatsList8.fours == null) && ((num3 = this.sixes) != null ? num3.equals(battingStatsList8.sixes) : battingStatsList8.sixes == null) && ((num4 = this.balls) != null ? num4.equals(battingStatsList8.balls) : battingStatsList8.balls == null) && ((d = this.strikeRate) != null ? d.equals(battingStatsList8.strikeRate) : battingStatsList8.strikeRate == null)) {
                Boolean bool = this.isNotOut;
                Boolean bool2 = battingStatsList8.isNotOut;
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
                Integer num = this.runs;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.fours;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.sixes;
                int hashCode4 = (hashCode3 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.balls;
                int hashCode5 = (hashCode4 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Double d = this.strikeRate;
                int hashCode6 = (hashCode5 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Boolean bool = this.isNotOut;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BattingStatsList8> {
            @Override 
            public BattingStatsList8 map(ResponseReader responseReader) {
                return new BattingStatsList8(responseReader.readString(BattingStatsList8.$responseFields[0]), responseReader.readInt(BattingStatsList8.$responseFields[1]), responseReader.readInt(BattingStatsList8.$responseFields[2]), responseReader.readInt(BattingStatsList8.$responseFields[3]), responseReader.readInt(BattingStatsList8.$responseFields[4]), responseReader.readDouble(BattingStatsList8.$responseFields[5]), responseReader.readBoolean(BattingStatsList8.$responseFields[6]));
            }
        }
    }

    public static class BowlingStatsList8 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forInt("runsConceded", "runsConceded", null, true, Collections.emptyList()), ResponseField.forDouble("economyRate", "economyRate", null, true, Collections.emptyList()), ResponseField.forDouble("overs", "overs", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double economyRate;
        final Double overs;
        final Integer runsConceded;
        final Integer wickets;

        public BowlingStatsList8(String str, Integer num, Integer num2, Double d, Double d2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.wickets = num;
            this.runsConceded = num2;
            this.economyRate = d;
            this.overs = d2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer wickets() {
            return this.wickets;
        }

        public Integer runsConceded() {
            return this.runsConceded;
        }

        public Double economyRate() {
            return this.economyRate;
        }

        public Double overs() {
            return this.overs;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlingStatsList8.$responseFields[0], BowlingStatsList8.this.__typename);
                    responseWriter.writeInt(BowlingStatsList8.$responseFields[1], BowlingStatsList8.this.wickets);
                    responseWriter.writeInt(BowlingStatsList8.$responseFields[2], BowlingStatsList8.this.runsConceded);
                    responseWriter.writeDouble(BowlingStatsList8.$responseFields[3], BowlingStatsList8.this.economyRate);
                    responseWriter.writeDouble(BowlingStatsList8.$responseFields[4], BowlingStatsList8.this.overs);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlingStatsList8{__typename=" + this.__typename + ", wickets=" + this.wickets + ", runsConceded=" + this.runsConceded + ", economyRate=" + this.economyRate + ", overs=" + this.overs + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlingStatsList8)) {
                return false;
            }
            BowlingStatsList8 bowlingStatsList8 = (BowlingStatsList8) obj;
            if (this.__typename.equals(bowlingStatsList8.__typename) && ((num = this.wickets) != null ? num.equals(bowlingStatsList8.wickets) : bowlingStatsList8.wickets == null) && ((num2 = this.runsConceded) != null ? num2.equals(bowlingStatsList8.runsConceded) : bowlingStatsList8.runsConceded == null) && ((d = this.economyRate) != null ? d.equals(bowlingStatsList8.economyRate) : bowlingStatsList8.economyRate == null)) {
                Double d2 = this.overs;
                Double d3 = bowlingStatsList8.overs;
                if (d2 == null) {
                    if (d3 == null) {
                        return true;
                    }
                } else if (d2.equals(d3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.wickets;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.runsConceded;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Double d = this.economyRate;
                int hashCode4 = (hashCode3 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.overs;
                if (d2 != null) {
                    i = d2.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlingStatsList8> {
            @Override 
            public BowlingStatsList8 map(ResponseReader responseReader) {
                return new BowlingStatsList8(responseReader.readString(BowlingStatsList8.$responseFields[0]), responseReader.readInt(BowlingStatsList8.$responseFields[1]), responseReader.readInt(BowlingStatsList8.$responseFields[2]), responseReader.readDouble(BowlingStatsList8.$responseFields[3]), responseReader.readDouble(BowlingStatsList8.$responseFields[4]));
            }
        }
    }

    public static class FieldingStatsList8 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runsOuts", "runsOuts", null, true, Collections.emptyList()), ResponseField.forInt("catches", "catches", null, true, Collections.emptyList()), ResponseField.forInt("stumps", "stumps", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer catches;
        final Integer runsOuts;
        final Integer stumps;

        public FieldingStatsList8(String str, Integer num, Integer num2, Integer num3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runsOuts = num;
            this.catches = num2;
            this.stumps = num3;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runsOuts() {
            return this.runsOuts;
        }

        public Integer catches() {
            return this.catches;
        }

        public Integer stumps() {
            return this.stumps;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(FieldingStatsList8.$responseFields[0], FieldingStatsList8.this.__typename);
                    responseWriter.writeInt(FieldingStatsList8.$responseFields[1], FieldingStatsList8.this.runsOuts);
                    responseWriter.writeInt(FieldingStatsList8.$responseFields[2], FieldingStatsList8.this.catches);
                    responseWriter.writeInt(FieldingStatsList8.$responseFields[3], FieldingStatsList8.this.stumps);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FieldingStatsList8{__typename=" + this.__typename + ", runsOuts=" + this.runsOuts + ", catches=" + this.catches + ", stumps=" + this.stumps + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FieldingStatsList8)) {
                return false;
            }
            FieldingStatsList8 fieldingStatsList8 = (FieldingStatsList8) obj;
            if (this.__typename.equals(fieldingStatsList8.__typename) && ((num = this.runsOuts) != null ? num.equals(fieldingStatsList8.runsOuts) : fieldingStatsList8.runsOuts == null) && ((num2 = this.catches) != null ? num2.equals(fieldingStatsList8.catches) : fieldingStatsList8.catches == null)) {
                Integer num3 = this.stumps;
                Integer num4 = fieldingStatsList8.stumps;
                if (num3 == null) {
                    if (num4 == null) {
                        return true;
                    }
                } else if (num3.equals(num4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.runsOuts;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.catches;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.stumps;
                if (num3 != null) {
                    i = num3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<FieldingStatsList8> {
            @Override 
            public FieldingStatsList8 map(ResponseReader responseReader) {
                return new FieldingStatsList8(responseReader.readString(FieldingStatsList8.$responseFields[0]), responseReader.readInt(FieldingStatsList8.$responseFields[1]), responseReader.readInt(FieldingStatsList8.$responseFields[2]), responseReader.readInt(FieldingStatsList8.$responseFields[3]));
            }
        }
    }

    public static class InningWisePoints8 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("inningWiseBattingPoints", "inningWiseBattingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseBowlingPoints", "inningWiseBowlingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseFieldingPoints", "inningWiseFieldingPoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Double> inningWiseBattingPoints;
        final List<Double> inningWiseBowlingPoints;
        final List<Double> inningWiseFieldingPoints;

        public InningWisePoints8(String str, List<Double> list, List<Double> list2, List<Double> list3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.inningWiseBattingPoints = list;
            this.inningWiseBowlingPoints = list2;
            this.inningWiseFieldingPoints = list3;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Double> inningWiseBattingPoints() {
            return this.inningWiseBattingPoints;
        }

        public List<Double> inningWiseBowlingPoints() {
            return this.inningWiseBowlingPoints;
        }

        public List<Double> inningWiseFieldingPoints() {
            return this.inningWiseFieldingPoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(InningWisePoints8.$responseFields[0], InningWisePoints8.this.__typename);
                    responseWriter.writeList(InningWisePoints8.$responseFields[1], InningWisePoints8.this.inningWiseBattingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints8.$responseFields[2], InningWisePoints8.this.inningWiseBowlingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints8.$responseFields[3], InningWisePoints8.this.inningWiseFieldingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "InningWisePoints8{__typename=" + this.__typename + ", inningWiseBattingPoints=" + this.inningWiseBattingPoints + ", inningWiseBowlingPoints=" + this.inningWiseBowlingPoints + ", inningWiseFieldingPoints=" + this.inningWiseFieldingPoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<Double> list;
            List<Double> list2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InningWisePoints8)) {
                return false;
            }
            InningWisePoints8 inningWisePoints8 = (InningWisePoints8) obj;
            if (this.__typename.equals(inningWisePoints8.__typename) && ((list = this.inningWiseBattingPoints) != null ? list.equals(inningWisePoints8.inningWiseBattingPoints) : inningWisePoints8.inningWiseBattingPoints == null) && ((list2 = this.inningWiseBowlingPoints) != null ? list2.equals(inningWisePoints8.inningWiseBowlingPoints) : inningWisePoints8.inningWiseBowlingPoints == null)) {
                List<Double> list3 = this.inningWiseFieldingPoints;
                List<Double> list4 = inningWisePoints8.inningWiseFieldingPoints;
                if (list3 == null) {
                    if (list4 == null) {
                        return true;
                    }
                } else if (list3.equals(list4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<Double> list = this.inningWiseBattingPoints;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Double> list2 = this.inningWiseBowlingPoints;
                int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<Double> list3 = this.inningWiseFieldingPoints;
                if (list3 != null) {
                    i = list3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<InningWisePoints8> {
            @Override 
            public InningWisePoints8 map(ResponseReader responseReader) {
                return new InningWisePoints8(responseReader.readString(InningWisePoints8.$responseFields[0]), responseReader.readList(InningWisePoints8.$responseFields[1], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints8.$responseFields[2], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints8.$responseFields[3], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }));
            }
        }
    }

    public static class RunnerBowler1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerNameHindi", "playerNameHindi", null, true, Collections.emptyList()), ResponseField.forString("playerTeam", "playerTeam", null, true, Collections.emptyList()), ResponseField.forString("playerTeamID", "playerTeamID", null, true, Collections.emptyList()), ResponseField.forDouble("totalBattingPoints", "totalBattingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalPoints", "totalPoints", null, true, Collections.emptyList()), ResponseField.forList("battingStatsList", "battingStatsList", null, true, Collections.emptyList()), ResponseField.forDouble("totalBowlingPoints", "totalBowlingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalFieldingPoints", "totalFieldingPoints", null, true, Collections.emptyList()), ResponseField.forList("bowlingStatsList", "bowlingStatsList", null, true, Collections.emptyList()), ResponseField.forList("fieldingStatsList", "fieldingStatsList", null, true, Collections.emptyList()), ResponseField.forObject("inningWisePoints", "inningWisePoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<BattingStatsList9> battingStatsList;
        final List<BowlingStatsList9> bowlingStatsList;
        final List<FieldingStatsList9> fieldingStatsList;
        final InningWisePoints9 inningWisePoints;
        final String playerID;
        final String playerName;
        final String playerNameHindi;
        final String playerTeam;
        final String playerTeamID;
        final Double totalBattingPoints;
        final Double totalBowlingPoints;
        final Double totalFieldingPoints;
        final Double totalPoints;

        public RunnerBowler1(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, List<BattingStatsList9> list, Double d3, Double d4, List<BowlingStatsList9> list2, List<FieldingStatsList9> list3, InningWisePoints9 inningWisePoints9) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerName = str3;
            this.playerNameHindi = str4;
            this.playerTeam = str5;
            this.playerTeamID = str6;
            this.totalBattingPoints = d;
            this.totalPoints = d2;
            this.battingStatsList = list;
            this.totalBowlingPoints = d3;
            this.totalFieldingPoints = d4;
            this.bowlingStatsList = list2;
            this.fieldingStatsList = list3;
            this.inningWisePoints = inningWisePoints9;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerID() {
            return this.playerID;
        }

        public String playerName() {
            return this.playerName;
        }

        public String playerNameHindi() {
            return this.playerNameHindi;
        }

        public String playerTeam() {
            return this.playerTeam;
        }

        public String playerTeamID() {
            return this.playerTeamID;
        }

        public Double totalBattingPoints() {
            return this.totalBattingPoints;
        }

        public Double totalPoints() {
            return this.totalPoints;
        }

        public List<BattingStatsList9> battingStatsList() {
            return this.battingStatsList;
        }

        public Double totalBowlingPoints() {
            return this.totalBowlingPoints;
        }

        public Double totalFieldingPoints() {
            return this.totalFieldingPoints;
        }

        public List<BowlingStatsList9> bowlingStatsList() {
            return this.bowlingStatsList;
        }

        public List<FieldingStatsList9> fieldingStatsList() {
            return this.fieldingStatsList;
        }

        public InningWisePoints9 inningWisePoints() {
            return this.inningWisePoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(RunnerBowler1.$responseFields[0], RunnerBowler1.this.__typename);
                    responseWriter.writeString(RunnerBowler1.$responseFields[1], RunnerBowler1.this.playerID);
                    responseWriter.writeString(RunnerBowler1.$responseFields[2], RunnerBowler1.this.playerName);
                    responseWriter.writeString(RunnerBowler1.$responseFields[3], RunnerBowler1.this.playerNameHindi);
                    responseWriter.writeString(RunnerBowler1.$responseFields[4], RunnerBowler1.this.playerTeam);
                    responseWriter.writeString(RunnerBowler1.$responseFields[5], RunnerBowler1.this.playerTeamID);
                    responseWriter.writeDouble(RunnerBowler1.$responseFields[6], RunnerBowler1.this.totalBattingPoints);
                    responseWriter.writeDouble(RunnerBowler1.$responseFields[7], RunnerBowler1.this.totalPoints);
                    responseWriter.writeList(RunnerBowler1.$responseFields[8], RunnerBowler1.this.battingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BattingStatsList9) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeDouble(RunnerBowler1.$responseFields[9], RunnerBowler1.this.totalBowlingPoints);
                    responseWriter.writeDouble(RunnerBowler1.$responseFields[10], RunnerBowler1.this.totalFieldingPoints);
                    responseWriter.writeList(RunnerBowler1.$responseFields[11], RunnerBowler1.this.bowlingStatsList, new ResponseWriter.ListWriter() {

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BowlingStatsList9) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(RunnerBowler1.$responseFields[12], RunnerBowler1.this.fieldingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((FieldingStatsList9) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeObject(RunnerBowler1.$responseFields[13], RunnerBowler1.this.inningWisePoints != null ? RunnerBowler1.this.inningWisePoints.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "RunnerBowler1{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerNameHindi=" + this.playerNameHindi + ", playerTeam=" + this.playerTeam + ", playerTeamID=" + this.playerTeamID + ", totalBattingPoints=" + this.totalBattingPoints + ", totalPoints=" + this.totalPoints + ", battingStatsList=" + this.battingStatsList + ", totalBowlingPoints=" + this.totalBowlingPoints + ", totalFieldingPoints=" + this.totalFieldingPoints + ", bowlingStatsList=" + this.bowlingStatsList + ", fieldingStatsList=" + this.fieldingStatsList + ", inningWisePoints=" + this.inningWisePoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Double d;
            Double d2;
            List<BattingStatsList9> list;
            Double d3;
            Double d4;
            List<BowlingStatsList9> list2;
            List<FieldingStatsList9> list3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RunnerBowler1)) {
                return false;
            }
            RunnerBowler1 runnerBowler1 = (RunnerBowler1) obj;
            if (this.__typename.equals(runnerBowler1.__typename) && ((str = this.playerID) != null ? str.equals(runnerBowler1.playerID) : runnerBowler1.playerID == null) && ((str2 = this.playerName) != null ? str2.equals(runnerBowler1.playerName) : runnerBowler1.playerName == null) && ((str3 = this.playerNameHindi) != null ? str3.equals(runnerBowler1.playerNameHindi) : runnerBowler1.playerNameHindi == null) && ((str4 = this.playerTeam) != null ? str4.equals(runnerBowler1.playerTeam) : runnerBowler1.playerTeam == null) && ((str5 = this.playerTeamID) != null ? str5.equals(runnerBowler1.playerTeamID) : runnerBowler1.playerTeamID == null) && ((d = this.totalBattingPoints) != null ? d.equals(runnerBowler1.totalBattingPoints) : runnerBowler1.totalBattingPoints == null) && ((d2 = this.totalPoints) != null ? d2.equals(runnerBowler1.totalPoints) : runnerBowler1.totalPoints == null) && ((list = this.battingStatsList) != null ? list.equals(runnerBowler1.battingStatsList) : runnerBowler1.battingStatsList == null) && ((d3 = this.totalBowlingPoints) != null ? d3.equals(runnerBowler1.totalBowlingPoints) : runnerBowler1.totalBowlingPoints == null) && ((d4 = this.totalFieldingPoints) != null ? d4.equals(runnerBowler1.totalFieldingPoints) : runnerBowler1.totalFieldingPoints == null) && ((list2 = this.bowlingStatsList) != null ? list2.equals(runnerBowler1.bowlingStatsList) : runnerBowler1.bowlingStatsList == null) && ((list3 = this.fieldingStatsList) != null ? list3.equals(runnerBowler1.fieldingStatsList) : runnerBowler1.fieldingStatsList == null)) {
                InningWisePoints9 inningWisePoints9 = this.inningWisePoints;
                InningWisePoints9 inningWisePoints92 = runnerBowler1.inningWisePoints;
                if (inningWisePoints9 == null) {
                    if (inningWisePoints92 == null) {
                        return true;
                    }
                } else if (inningWisePoints9.equals(inningWisePoints92)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.playerID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerNameHindi;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerTeam;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerTeamID;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Double d = this.totalBattingPoints;
                int hashCode7 = (hashCode6 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.totalPoints;
                int hashCode8 = (hashCode7 ^ (d2 == null ? 0 : d2.hashCode())) * 1000003;
                List<BattingStatsList9> list = this.battingStatsList;
                int hashCode9 = (hashCode8 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                Double d3 = this.totalBowlingPoints;
                int hashCode10 = (hashCode9 ^ (d3 == null ? 0 : d3.hashCode())) * 1000003;
                Double d4 = this.totalFieldingPoints;
                int hashCode11 = (hashCode10 ^ (d4 == null ? 0 : d4.hashCode())) * 1000003;
                List<BowlingStatsList9> list2 = this.bowlingStatsList;
                int hashCode12 = (hashCode11 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<FieldingStatsList9> list3 = this.fieldingStatsList;
                int hashCode13 = (hashCode12 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                InningWisePoints9 inningWisePoints9 = this.inningWisePoints;
                if (inningWisePoints9 != null) {
                    i = inningWisePoints9.hashCode();
                }
                this.$hashCode = hashCode13 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<RunnerBowler1> {
            final BattingStatsList9.Mapper battingStatsList9FieldMapper = new BattingStatsList9.Mapper();
            final BowlingStatsList9.Mapper bowlingStatsList9FieldMapper = new BowlingStatsList9.Mapper();
            final FieldingStatsList9.Mapper fieldingStatsList9FieldMapper = new FieldingStatsList9.Mapper();
            final InningWisePoints9.Mapper inningWisePoints9FieldMapper = new InningWisePoints9.Mapper();

            @Override 
            public RunnerBowler1 map(ResponseReader responseReader) {
                return new RunnerBowler1(responseReader.readString(RunnerBowler1.$responseFields[0]), responseReader.readString(RunnerBowler1.$responseFields[1]), responseReader.readString(RunnerBowler1.$responseFields[2]), responseReader.readString(RunnerBowler1.$responseFields[3]), responseReader.readString(RunnerBowler1.$responseFields[4]), responseReader.readString(RunnerBowler1.$responseFields[5]), responseReader.readDouble(RunnerBowler1.$responseFields[6]), responseReader.readDouble(RunnerBowler1.$responseFields[7]), responseReader.readList(RunnerBowler1.$responseFields[8], new ResponseReader.ListReader<BattingStatsList9>() {


                    @Override 
                    public BattingStatsList9 read(ResponseReader.ListItemReader listItemReader) {
                        return (BattingStatsList9) listItemReader.readObject(new ResponseReader.ObjectReader<BattingStatsList9>() {


                            @Override 
                            public BattingStatsList9 read(ResponseReader responseReader) {
                                return Mapper.this.battingStatsList9FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readDouble(RunnerBowler1.$responseFields[9]), responseReader.readDouble(RunnerBowler1.$responseFields[10]), responseReader.readList(RunnerBowler1.$responseFields[11], new ResponseReader.ListReader<BowlingStatsList9>() {


                    @Override 
                    public BowlingStatsList9 read(ResponseReader.ListItemReader listItemReader) {
                        return (BowlingStatsList9) listItemReader.readObject(new ResponseReader.ObjectReader<BowlingStatsList9>() {


                            @Override 
                            public BowlingStatsList9 read(ResponseReader responseReader) {
                                return Mapper.this.bowlingStatsList9FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(RunnerBowler1.$responseFields[12], new ResponseReader.ListReader<FieldingStatsList9>() {


                    @Override 
                    public FieldingStatsList9 read(ResponseReader.ListItemReader listItemReader) {
                        return (FieldingStatsList9) listItemReader.readObject(new ResponseReader.ObjectReader<FieldingStatsList9>() {


                            @Override 
                            public FieldingStatsList9 read(ResponseReader responseReader) {
                                return Mapper.this.fieldingStatsList9FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (InningWisePoints9) responseReader.readObject(RunnerBowler1.$responseFields[13], new ResponseReader.ObjectReader<InningWisePoints9>() {


                    @Override 
                    public InningWisePoints9 read(ResponseReader responseReader) {
                        return Mapper.this.inningWisePoints9FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class BattingStatsList9 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runs", "runs", null, true, Collections.emptyList()), ResponseField.forInt("fours", "fours", null, true, Collections.emptyList()), ResponseField.forInt("sixes", "sixes", null, true, Collections.emptyList()), ResponseField.forInt("balls", "balls", null, true, Collections.emptyList()), ResponseField.forDouble("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forBoolean("isNotOut", "isNotOut", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer balls;
        final Integer fours;
        final Boolean isNotOut;
        final Integer runs;
        final Integer sixes;
        final Double strikeRate;

        public BattingStatsList9(String str, Integer num, Integer num2, Integer num3, Integer num4, Double d, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runs = num;
            this.fours = num2;
            this.sixes = num3;
            this.balls = num4;
            this.strikeRate = d;
            this.isNotOut = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runs() {
            return this.runs;
        }

        public Integer fours() {
            return this.fours;
        }

        public Integer sixes() {
            return this.sixes;
        }

        public Integer balls() {
            return this.balls;
        }

        public Double strikeRate() {
            return this.strikeRate;
        }

        public Boolean isNotOut() {
            return this.isNotOut;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BattingStatsList9.$responseFields[0], BattingStatsList9.this.__typename);
                    responseWriter.writeInt(BattingStatsList9.$responseFields[1], BattingStatsList9.this.runs);
                    responseWriter.writeInt(BattingStatsList9.$responseFields[2], BattingStatsList9.this.fours);
                    responseWriter.writeInt(BattingStatsList9.$responseFields[3], BattingStatsList9.this.sixes);
                    responseWriter.writeInt(BattingStatsList9.$responseFields[4], BattingStatsList9.this.balls);
                    responseWriter.writeDouble(BattingStatsList9.$responseFields[5], BattingStatsList9.this.strikeRate);
                    responseWriter.writeBoolean(BattingStatsList9.$responseFields[6], BattingStatsList9.this.isNotOut);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BattingStatsList9{__typename=" + this.__typename + ", runs=" + this.runs + ", fours=" + this.fours + ", sixes=" + this.sixes + ", balls=" + this.balls + ", strikeRate=" + this.strikeRate + ", isNotOut=" + this.isNotOut + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattingStatsList9)) {
                return false;
            }
            BattingStatsList9 battingStatsList9 = (BattingStatsList9) obj;
            if (this.__typename.equals(battingStatsList9.__typename) && ((num = this.runs) != null ? num.equals(battingStatsList9.runs) : battingStatsList9.runs == null) && ((num2 = this.fours) != null ? num2.equals(battingStatsList9.fours) : battingStatsList9.fours == null) && ((num3 = this.sixes) != null ? num3.equals(battingStatsList9.sixes) : battingStatsList9.sixes == null) && ((num4 = this.balls) != null ? num4.equals(battingStatsList9.balls) : battingStatsList9.balls == null) && ((d = this.strikeRate) != null ? d.equals(battingStatsList9.strikeRate) : battingStatsList9.strikeRate == null)) {
                Boolean bool = this.isNotOut;
                Boolean bool2 = battingStatsList9.isNotOut;
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
                Integer num = this.runs;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.fours;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.sixes;
                int hashCode4 = (hashCode3 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.balls;
                int hashCode5 = (hashCode4 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Double d = this.strikeRate;
                int hashCode6 = (hashCode5 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Boolean bool = this.isNotOut;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BattingStatsList9> {
            @Override 
            public BattingStatsList9 map(ResponseReader responseReader) {
                return new BattingStatsList9(responseReader.readString(BattingStatsList9.$responseFields[0]), responseReader.readInt(BattingStatsList9.$responseFields[1]), responseReader.readInt(BattingStatsList9.$responseFields[2]), responseReader.readInt(BattingStatsList9.$responseFields[3]), responseReader.readInt(BattingStatsList9.$responseFields[4]), responseReader.readDouble(BattingStatsList9.$responseFields[5]), responseReader.readBoolean(BattingStatsList9.$responseFields[6]));
            }
        }
    }

    public static class BowlingStatsList9 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forInt("runsConceded", "runsConceded", null, true, Collections.emptyList()), ResponseField.forDouble("economyRate", "economyRate", null, true, Collections.emptyList()), ResponseField.forDouble("overs", "overs", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double economyRate;
        final Double overs;
        final Integer runsConceded;
        final Integer wickets;

        public BowlingStatsList9(String str, Integer num, Integer num2, Double d, Double d2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.wickets = num;
            this.runsConceded = num2;
            this.economyRate = d;
            this.overs = d2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer wickets() {
            return this.wickets;
        }

        public Integer runsConceded() {
            return this.runsConceded;
        }

        public Double economyRate() {
            return this.economyRate;
        }

        public Double overs() {
            return this.overs;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlingStatsList9.$responseFields[0], BowlingStatsList9.this.__typename);
                    responseWriter.writeInt(BowlingStatsList9.$responseFields[1], BowlingStatsList9.this.wickets);
                    responseWriter.writeInt(BowlingStatsList9.$responseFields[2], BowlingStatsList9.this.runsConceded);
                    responseWriter.writeDouble(BowlingStatsList9.$responseFields[3], BowlingStatsList9.this.economyRate);
                    responseWriter.writeDouble(BowlingStatsList9.$responseFields[4], BowlingStatsList9.this.overs);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlingStatsList9{__typename=" + this.__typename + ", wickets=" + this.wickets + ", runsConceded=" + this.runsConceded + ", economyRate=" + this.economyRate + ", overs=" + this.overs + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlingStatsList9)) {
                return false;
            }
            BowlingStatsList9 bowlingStatsList9 = (BowlingStatsList9) obj;
            if (this.__typename.equals(bowlingStatsList9.__typename) && ((num = this.wickets) != null ? num.equals(bowlingStatsList9.wickets) : bowlingStatsList9.wickets == null) && ((num2 = this.runsConceded) != null ? num2.equals(bowlingStatsList9.runsConceded) : bowlingStatsList9.runsConceded == null) && ((d = this.economyRate) != null ? d.equals(bowlingStatsList9.economyRate) : bowlingStatsList9.economyRate == null)) {
                Double d2 = this.overs;
                Double d3 = bowlingStatsList9.overs;
                if (d2 == null) {
                    if (d3 == null) {
                        return true;
                    }
                } else if (d2.equals(d3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.wickets;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.runsConceded;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Double d = this.economyRate;
                int hashCode4 = (hashCode3 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.overs;
                if (d2 != null) {
                    i = d2.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlingStatsList9> {
            @Override 
            public BowlingStatsList9 map(ResponseReader responseReader) {
                return new BowlingStatsList9(responseReader.readString(BowlingStatsList9.$responseFields[0]), responseReader.readInt(BowlingStatsList9.$responseFields[1]), responseReader.readInt(BowlingStatsList9.$responseFields[2]), responseReader.readDouble(BowlingStatsList9.$responseFields[3]), responseReader.readDouble(BowlingStatsList9.$responseFields[4]));
            }
        }
    }

    public static class FieldingStatsList9 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runsOuts", "runsOuts", null, true, Collections.emptyList()), ResponseField.forInt("catches", "catches", null, true, Collections.emptyList()), ResponseField.forInt("stumps", "stumps", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer catches;
        final Integer runsOuts;
        final Integer stumps;

        public FieldingStatsList9(String str, Integer num, Integer num2, Integer num3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runsOuts = num;
            this.catches = num2;
            this.stumps = num3;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runsOuts() {
            return this.runsOuts;
        }

        public Integer catches() {
            return this.catches;
        }

        public Integer stumps() {
            return this.stumps;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(FieldingStatsList9.$responseFields[0], FieldingStatsList9.this.__typename);
                    responseWriter.writeInt(FieldingStatsList9.$responseFields[1], FieldingStatsList9.this.runsOuts);
                    responseWriter.writeInt(FieldingStatsList9.$responseFields[2], FieldingStatsList9.this.catches);
                    responseWriter.writeInt(FieldingStatsList9.$responseFields[3], FieldingStatsList9.this.stumps);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FieldingStatsList9{__typename=" + this.__typename + ", runsOuts=" + this.runsOuts + ", catches=" + this.catches + ", stumps=" + this.stumps + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FieldingStatsList9)) {
                return false;
            }
            FieldingStatsList9 fieldingStatsList9 = (FieldingStatsList9) obj;
            if (this.__typename.equals(fieldingStatsList9.__typename) && ((num = this.runsOuts) != null ? num.equals(fieldingStatsList9.runsOuts) : fieldingStatsList9.runsOuts == null) && ((num2 = this.catches) != null ? num2.equals(fieldingStatsList9.catches) : fieldingStatsList9.catches == null)) {
                Integer num3 = this.stumps;
                Integer num4 = fieldingStatsList9.stumps;
                if (num3 == null) {
                    if (num4 == null) {
                        return true;
                    }
                } else if (num3.equals(num4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.runsOuts;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.catches;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.stumps;
                if (num3 != null) {
                    i = num3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<FieldingStatsList9> {
            @Override 
            public FieldingStatsList9 map(ResponseReader responseReader) {
                return new FieldingStatsList9(responseReader.readString(FieldingStatsList9.$responseFields[0]), responseReader.readInt(FieldingStatsList9.$responseFields[1]), responseReader.readInt(FieldingStatsList9.$responseFields[2]), responseReader.readInt(FieldingStatsList9.$responseFields[3]));
            }
        }
    }

    public static class InningWisePoints9 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("inningWiseBattingPoints", "inningWiseBattingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseBowlingPoints", "inningWiseBowlingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseFieldingPoints", "inningWiseFieldingPoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Double> inningWiseBattingPoints;
        final List<Double> inningWiseBowlingPoints;
        final List<Double> inningWiseFieldingPoints;

        public InningWisePoints9(String str, List<Double> list, List<Double> list2, List<Double> list3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.inningWiseBattingPoints = list;
            this.inningWiseBowlingPoints = list2;
            this.inningWiseFieldingPoints = list3;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Double> inningWiseBattingPoints() {
            return this.inningWiseBattingPoints;
        }

        public List<Double> inningWiseBowlingPoints() {
            return this.inningWiseBowlingPoints;
        }

        public List<Double> inningWiseFieldingPoints() {
            return this.inningWiseFieldingPoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(InningWisePoints9.$responseFields[0], InningWisePoints9.this.__typename);
                    responseWriter.writeList(InningWisePoints9.$responseFields[1], InningWisePoints9.this.inningWiseBattingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints9.$responseFields[2], InningWisePoints9.this.inningWiseBowlingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints9.$responseFields[3], InningWisePoints9.this.inningWiseFieldingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "InningWisePoints9{__typename=" + this.__typename + ", inningWiseBattingPoints=" + this.inningWiseBattingPoints + ", inningWiseBowlingPoints=" + this.inningWiseBowlingPoints + ", inningWiseFieldingPoints=" + this.inningWiseFieldingPoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<Double> list;
            List<Double> list2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InningWisePoints9)) {
                return false;
            }
            InningWisePoints9 inningWisePoints9 = (InningWisePoints9) obj;
            if (this.__typename.equals(inningWisePoints9.__typename) && ((list = this.inningWiseBattingPoints) != null ? list.equals(inningWisePoints9.inningWiseBattingPoints) : inningWisePoints9.inningWiseBattingPoints == null) && ((list2 = this.inningWiseBowlingPoints) != null ? list2.equals(inningWisePoints9.inningWiseBowlingPoints) : inningWisePoints9.inningWiseBowlingPoints == null)) {
                List<Double> list3 = this.inningWiseFieldingPoints;
                List<Double> list4 = inningWisePoints9.inningWiseFieldingPoints;
                if (list3 == null) {
                    if (list4 == null) {
                        return true;
                    }
                } else if (list3.equals(list4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<Double> list = this.inningWiseBattingPoints;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Double> list2 = this.inningWiseBowlingPoints;
                int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<Double> list3 = this.inningWiseFieldingPoints;
                if (list3 != null) {
                    i = list3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<InningWisePoints9> {
            @Override 
            public InningWisePoints9 map(ResponseReader responseReader) {
                return new InningWisePoints9(responseReader.readString(InningWisePoints9.$responseFields[0]), responseReader.readList(InningWisePoints9.$responseFields[1], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints9.$responseFields[2], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints9.$responseFields[3], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }));
            }
        }
    }

    public static class AwayTeamData {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forObject("batsmanSummary1", "batsmanSummary1", null, true, Collections.emptyList()), ResponseField.forObject("batsmanSummary2", "batsmanSummary2", null, true, Collections.emptyList()), ResponseField.forObject("bowlerSummary1", "bowlerSummary1", null, true, Collections.emptyList()), ResponseField.forObject("bowlerSummary2", "bowlerSummary2", null, true, Collections.emptyList()), ResponseField.forList("overs", "overs", null, true, Collections.emptyList()), ResponseField.forList("runs", "runs", null, true, Collections.emptyList()), ResponseField.forList("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, true, Collections.emptyList()), ResponseField.forString("teamShortName", "teamShortName", null, true, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final BatsmanSummary11 batsmanSummary1;
        final BatsmanSummary21 batsmanSummary2;
        final BowlerSummary11 bowlerSummary1;
        final BowlerSummary21 bowlerSummary2;
        final List<String> overs;
        final List<String> runs;
        final String teamID;
        final String teamName;
        final String teamShortName;
        final List<String> wickets;

        public AwayTeamData(String str, BatsmanSummary11 batsmanSummary11, BatsmanSummary21 batsmanSummary21, BowlerSummary11 bowlerSummary11, BowlerSummary21 bowlerSummary21, List<String> list, List<String> list2, List<String> list3, String str2, String str3, String str4) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.batsmanSummary1 = batsmanSummary11;
            this.batsmanSummary2 = batsmanSummary21;
            this.bowlerSummary1 = bowlerSummary11;
            this.bowlerSummary2 = bowlerSummary21;
            this.overs = list;
            this.runs = list2;
            this.wickets = list3;
            this.teamName = str2;
            this.teamShortName = str3;
            this.teamID = str4;
        }

        public String __typename() {
            return this.__typename;
        }

        public BatsmanSummary11 batsmanSummary1() {
            return this.batsmanSummary1;
        }

        public BatsmanSummary21 batsmanSummary2() {
            return this.batsmanSummary2;
        }

        public BowlerSummary11 bowlerSummary1() {
            return this.bowlerSummary1;
        }

        public BowlerSummary21 bowlerSummary2() {
            return this.bowlerSummary2;
        }

        public List<String> overs() {
            return this.overs;
        }

        public List<String> runs() {
            return this.runs;
        }

        public List<String> wickets() {
            return this.wickets;
        }

        public String teamName() {
            return this.teamName;
        }

        public String teamShortName() {
            return this.teamShortName;
        }

        public String teamID() {
            return this.teamID;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(AwayTeamData.$responseFields[0], AwayTeamData.this.__typename);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(AwayTeamData.$responseFields[1], AwayTeamData.this.batsmanSummary1 != null ? AwayTeamData.this.batsmanSummary1.marshaller() : null);
                    responseWriter.writeObject(AwayTeamData.$responseFields[2], AwayTeamData.this.batsmanSummary2 != null ? AwayTeamData.this.batsmanSummary2.marshaller() : null);
                    responseWriter.writeObject(AwayTeamData.$responseFields[3], AwayTeamData.this.bowlerSummary1 != null ? AwayTeamData.this.bowlerSummary1.marshaller() : null);
                    ResponseField responseField = AwayTeamData.$responseFields[4];
                    if (AwayTeamData.this.bowlerSummary2 != null) {
                        responseFieldMarshaller = AwayTeamData.this.bowlerSummary2.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                    responseWriter.writeList(AwayTeamData.$responseFields[5], AwayTeamData.this.overs, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(AwayTeamData.$responseFields[6], AwayTeamData.this.runs, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(AwayTeamData.$responseFields[7], AwayTeamData.this.wickets, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    });
                    responseWriter.writeString(AwayTeamData.$responseFields[8], AwayTeamData.this.teamName);
                    responseWriter.writeString(AwayTeamData.$responseFields[9], AwayTeamData.this.teamShortName);
                    responseWriter.writeString(AwayTeamData.$responseFields[10], AwayTeamData.this.teamID);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "AwayTeamData{__typename=" + this.__typename + ", batsmanSummary1=" + this.batsmanSummary1 + ", batsmanSummary2=" + this.batsmanSummary2 + ", bowlerSummary1=" + this.bowlerSummary1 + ", bowlerSummary2=" + this.bowlerSummary2 + ", overs=" + this.overs + ", runs=" + this.runs + ", wickets=" + this.wickets + ", teamName=" + this.teamName + ", teamShortName=" + this.teamShortName + ", teamID=" + this.teamID + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            BatsmanSummary11 batsmanSummary11;
            BatsmanSummary21 batsmanSummary21;
            BowlerSummary11 bowlerSummary11;
            BowlerSummary21 bowlerSummary21;
            List<String> list;
            List<String> list2;
            List<String> list3;
            String str;
            String str2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AwayTeamData)) {
                return false;
            }
            AwayTeamData awayTeamData = (AwayTeamData) obj;
            if (this.__typename.equals(awayTeamData.__typename) && ((batsmanSummary11 = this.batsmanSummary1) != null ? batsmanSummary11.equals(awayTeamData.batsmanSummary1) : awayTeamData.batsmanSummary1 == null) && ((batsmanSummary21 = this.batsmanSummary2) != null ? batsmanSummary21.equals(awayTeamData.batsmanSummary2) : awayTeamData.batsmanSummary2 == null) && ((bowlerSummary11 = this.bowlerSummary1) != null ? bowlerSummary11.equals(awayTeamData.bowlerSummary1) : awayTeamData.bowlerSummary1 == null) && ((bowlerSummary21 = this.bowlerSummary2) != null ? bowlerSummary21.equals(awayTeamData.bowlerSummary2) : awayTeamData.bowlerSummary2 == null) && ((list = this.overs) != null ? list.equals(awayTeamData.overs) : awayTeamData.overs == null) && ((list2 = this.runs) != null ? list2.equals(awayTeamData.runs) : awayTeamData.runs == null) && ((list3 = this.wickets) != null ? list3.equals(awayTeamData.wickets) : awayTeamData.wickets == null) && ((str = this.teamName) != null ? str.equals(awayTeamData.teamName) : awayTeamData.teamName == null) && ((str2 = this.teamShortName) != null ? str2.equals(awayTeamData.teamShortName) : awayTeamData.teamShortName == null)) {
                String str3 = this.teamID;
                String str4 = awayTeamData.teamID;
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
                BatsmanSummary11 batsmanSummary11 = this.batsmanSummary1;
                int i = 0;
                int hashCode2 = (hashCode ^ (batsmanSummary11 == null ? 0 : batsmanSummary11.hashCode())) * 1000003;
                BatsmanSummary21 batsmanSummary21 = this.batsmanSummary2;
                int hashCode3 = (hashCode2 ^ (batsmanSummary21 == null ? 0 : batsmanSummary21.hashCode())) * 1000003;
                BowlerSummary11 bowlerSummary11 = this.bowlerSummary1;
                int hashCode4 = (hashCode3 ^ (bowlerSummary11 == null ? 0 : bowlerSummary11.hashCode())) * 1000003;
                BowlerSummary21 bowlerSummary21 = this.bowlerSummary2;
                int hashCode5 = (hashCode4 ^ (bowlerSummary21 == null ? 0 : bowlerSummary21.hashCode())) * 1000003;
                List<String> list = this.overs;
                int hashCode6 = (hashCode5 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<String> list2 = this.runs;
                int hashCode7 = (hashCode6 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<String> list3 = this.wickets;
                int hashCode8 = (hashCode7 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                String str = this.teamName;
                int hashCode9 = (hashCode8 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.teamShortName;
                int hashCode10 = (hashCode9 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.teamID;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                this.$hashCode = hashCode10 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<AwayTeamData> {
            final BatsmanSummary11.Mapper batsmanSummary11FieldMapper = new BatsmanSummary11.Mapper();
            final BatsmanSummary21.Mapper batsmanSummary21FieldMapper = new BatsmanSummary21.Mapper();
            final BowlerSummary11.Mapper bowlerSummary11FieldMapper = new BowlerSummary11.Mapper();
            final BowlerSummary21.Mapper bowlerSummary21FieldMapper = new BowlerSummary21.Mapper();

            @Override 
            public AwayTeamData map(ResponseReader responseReader) {
                return new AwayTeamData(responseReader.readString(AwayTeamData.$responseFields[0]), (BatsmanSummary11) responseReader.readObject(AwayTeamData.$responseFields[1], new ResponseReader.ObjectReader<BatsmanSummary11>() {


                    @Override 
                    public BatsmanSummary11 read(ResponseReader responseReader) {
                        return Mapper.this.batsmanSummary11FieldMapper.map(responseReader);
                    }
                }), (BatsmanSummary21) responseReader.readObject(AwayTeamData.$responseFields[2], new ResponseReader.ObjectReader<BatsmanSummary21>() {


                    @Override 
                    public BatsmanSummary21 read(ResponseReader responseReader) {
                        return Mapper.this.batsmanSummary21FieldMapper.map(responseReader);
                    }
                }), (BowlerSummary11) responseReader.readObject(AwayTeamData.$responseFields[3], new ResponseReader.ObjectReader<BowlerSummary11>() {


                    @Override 
                    public BowlerSummary11 read(ResponseReader responseReader) {
                        return Mapper.this.bowlerSummary11FieldMapper.map(responseReader);
                    }
                }), (BowlerSummary21) responseReader.readObject(AwayTeamData.$responseFields[4], new ResponseReader.ObjectReader<BowlerSummary21>() {


                    @Override 
                    public BowlerSummary21 read(ResponseReader responseReader) {
                        return Mapper.this.bowlerSummary21FieldMapper.map(responseReader);
                    }
                }), responseReader.readList(AwayTeamData.$responseFields[5], new ResponseReader.ListReader<String>() {


                    @Override 
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readList(AwayTeamData.$responseFields[6], new ResponseReader.ListReader<String>() {


                    @Override 
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readList(AwayTeamData.$responseFields[7], new ResponseReader.ListReader<String>() {


                    @Override 
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(AwayTeamData.$responseFields[8]), responseReader.readString(AwayTeamData.$responseFields[9]), responseReader.readString(AwayTeamData.$responseFields[10]));
            }
        }
    }

    public static class BatsmanSummary11 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forObject("topBatsman", "topBatsman", null, true, Collections.emptyList()), ResponseField.forObject("runnerBatsman", "runnerBatsman", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final RunnerBatsman2 runnerBatsman;
        final TopBatsman2 topBatsman;

        public BatsmanSummary11(String str, TopBatsman2 topBatsman2, RunnerBatsman2 runnerBatsman2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.topBatsman = topBatsman2;
            this.runnerBatsman = runnerBatsman2;
        }

        public String __typename() {
            return this.__typename;
        }

        public TopBatsman2 topBatsman() {
            return this.topBatsman;
        }

        public RunnerBatsman2 runnerBatsman() {
            return this.runnerBatsman;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BatsmanSummary11.$responseFields[0], BatsmanSummary11.this.__typename);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(BatsmanSummary11.$responseFields[1], BatsmanSummary11.this.topBatsman != null ? BatsmanSummary11.this.topBatsman.marshaller() : null);
                    ResponseField responseField = BatsmanSummary11.$responseFields[2];
                    if (BatsmanSummary11.this.runnerBatsman != null) {
                        responseFieldMarshaller = BatsmanSummary11.this.runnerBatsman.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BatsmanSummary11{__typename=" + this.__typename + ", topBatsman=" + this.topBatsman + ", runnerBatsman=" + this.runnerBatsman + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            TopBatsman2 topBatsman2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BatsmanSummary11)) {
                return false;
            }
            BatsmanSummary11 batsmanSummary11 = (BatsmanSummary11) obj;
            if (this.__typename.equals(batsmanSummary11.__typename) && ((topBatsman2 = this.topBatsman) != null ? topBatsman2.equals(batsmanSummary11.topBatsman) : batsmanSummary11.topBatsman == null)) {
                RunnerBatsman2 runnerBatsman2 = this.runnerBatsman;
                RunnerBatsman2 runnerBatsman22 = batsmanSummary11.runnerBatsman;
                if (runnerBatsman2 == null) {
                    if (runnerBatsman22 == null) {
                        return true;
                    }
                } else if (runnerBatsman2.equals(runnerBatsman22)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                TopBatsman2 topBatsman2 = this.topBatsman;
                int i = 0;
                int hashCode2 = (hashCode ^ (topBatsman2 == null ? 0 : topBatsman2.hashCode())) * 1000003;
                RunnerBatsman2 runnerBatsman2 = this.runnerBatsman;
                if (runnerBatsman2 != null) {
                    i = runnerBatsman2.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BatsmanSummary11> {
            final RunnerBatsman2.Mapper runnerBatsman2FieldMapper = new RunnerBatsman2.Mapper();
            final TopBatsman2.Mapper topBatsman2FieldMapper = new TopBatsman2.Mapper();

            @Override 
            public BatsmanSummary11 map(ResponseReader responseReader) {
                return new BatsmanSummary11(responseReader.readString(BatsmanSummary11.$responseFields[0]), (TopBatsman2) responseReader.readObject(BatsmanSummary11.$responseFields[1], new ResponseReader.ObjectReader<TopBatsman2>() {


                    @Override 
                    public TopBatsman2 read(ResponseReader responseReader) {
                        return Mapper.this.topBatsman2FieldMapper.map(responseReader);
                    }
                }), (RunnerBatsman2) responseReader.readObject(BatsmanSummary11.$responseFields[2], new ResponseReader.ObjectReader<RunnerBatsman2>() {


                    @Override 
                    public RunnerBatsman2 read(ResponseReader responseReader) {
                        return Mapper.this.runnerBatsman2FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class TopBatsman2 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerNameHindi", "playerNameHindi", null, true, Collections.emptyList()), ResponseField.forString("playerTeam", "playerTeam", null, true, Collections.emptyList()), ResponseField.forString("playerTeamID", "playerTeamID", null, true, Collections.emptyList()), ResponseField.forDouble("totalBattingPoints", "totalBattingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalPoints", "totalPoints", null, true, Collections.emptyList()), ResponseField.forList("battingStatsList", "battingStatsList", null, true, Collections.emptyList()), ResponseField.forDouble("totalBowlingPoints", "totalBowlingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalFieldingPoints", "totalFieldingPoints", null, true, Collections.emptyList()), ResponseField.forList("bowlingStatsList", "bowlingStatsList", null, true, Collections.emptyList()), ResponseField.forList("fieldingStatsList", "fieldingStatsList", null, true, Collections.emptyList()), ResponseField.forObject("inningWisePoints", "inningWisePoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<BattingStatsList10> battingStatsList;
        final List<BowlingStatsList10> bowlingStatsList;
        final List<FieldingStatsList10> fieldingStatsList;
        final InningWisePoints10 inningWisePoints;
        final String playerID;
        final String playerName;
        final String playerNameHindi;
        final String playerTeam;
        final String playerTeamID;
        final Double totalBattingPoints;
        final Double totalBowlingPoints;
        final Double totalFieldingPoints;
        final Double totalPoints;

        public TopBatsman2(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, List<BattingStatsList10> list, Double d3, Double d4, List<BowlingStatsList10> list2, List<FieldingStatsList10> list3, InningWisePoints10 inningWisePoints10) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerName = str3;
            this.playerNameHindi = str4;
            this.playerTeam = str5;
            this.playerTeamID = str6;
            this.totalBattingPoints = d;
            this.totalPoints = d2;
            this.battingStatsList = list;
            this.totalBowlingPoints = d3;
            this.totalFieldingPoints = d4;
            this.bowlingStatsList = list2;
            this.fieldingStatsList = list3;
            this.inningWisePoints = inningWisePoints10;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerID() {
            return this.playerID;
        }

        public String playerName() {
            return this.playerName;
        }

        public String playerNameHindi() {
            return this.playerNameHindi;
        }

        public String playerTeam() {
            return this.playerTeam;
        }

        public String playerTeamID() {
            return this.playerTeamID;
        }

        public Double totalBattingPoints() {
            return this.totalBattingPoints;
        }

        public Double totalPoints() {
            return this.totalPoints;
        }

        public List<BattingStatsList10> battingStatsList() {
            return this.battingStatsList;
        }

        public Double totalBowlingPoints() {
            return this.totalBowlingPoints;
        }

        public Double totalFieldingPoints() {
            return this.totalFieldingPoints;
        }

        public List<BowlingStatsList10> bowlingStatsList() {
            return this.bowlingStatsList;
        }

        public List<FieldingStatsList10> fieldingStatsList() {
            return this.fieldingStatsList;
        }

        public InningWisePoints10 inningWisePoints() {
            return this.inningWisePoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TopBatsman2.$responseFields[0], TopBatsman2.this.__typename);
                    responseWriter.writeString(TopBatsman2.$responseFields[1], TopBatsman2.this.playerID);
                    responseWriter.writeString(TopBatsman2.$responseFields[2], TopBatsman2.this.playerName);
                    responseWriter.writeString(TopBatsman2.$responseFields[3], TopBatsman2.this.playerNameHindi);
                    responseWriter.writeString(TopBatsman2.$responseFields[4], TopBatsman2.this.playerTeam);
                    responseWriter.writeString(TopBatsman2.$responseFields[5], TopBatsman2.this.playerTeamID);
                    responseWriter.writeDouble(TopBatsman2.$responseFields[6], TopBatsman2.this.totalBattingPoints);
                    responseWriter.writeDouble(TopBatsman2.$responseFields[7], TopBatsman2.this.totalPoints);
                    responseWriter.writeList(TopBatsman2.$responseFields[8], TopBatsman2.this.battingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BattingStatsList10) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeDouble(TopBatsman2.$responseFields[9], TopBatsman2.this.totalBowlingPoints);
                    responseWriter.writeDouble(TopBatsman2.$responseFields[10], TopBatsman2.this.totalFieldingPoints);
                    responseWriter.writeList(TopBatsman2.$responseFields[11], TopBatsman2.this.bowlingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BowlingStatsList10) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(TopBatsman2.$responseFields[12], TopBatsman2.this.fieldingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((FieldingStatsList10) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeObject(TopBatsman2.$responseFields[13], TopBatsman2.this.inningWisePoints != null ? TopBatsman2.this.inningWisePoints.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TopBatsman2{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerNameHindi=" + this.playerNameHindi + ", playerTeam=" + this.playerTeam + ", playerTeamID=" + this.playerTeamID + ", totalBattingPoints=" + this.totalBattingPoints + ", totalPoints=" + this.totalPoints + ", battingStatsList=" + this.battingStatsList + ", totalBowlingPoints=" + this.totalBowlingPoints + ", totalFieldingPoints=" + this.totalFieldingPoints + ", bowlingStatsList=" + this.bowlingStatsList + ", fieldingStatsList=" + this.fieldingStatsList + ", inningWisePoints=" + this.inningWisePoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Double d;
            Double d2;
            List<BattingStatsList10> list;
            Double d3;
            Double d4;
            List<BowlingStatsList10> list2;
            List<FieldingStatsList10> list3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TopBatsman2)) {
                return false;
            }
            TopBatsman2 topBatsman2 = (TopBatsman2) obj;
            if (this.__typename.equals(topBatsman2.__typename) && ((str = this.playerID) != null ? str.equals(topBatsman2.playerID) : topBatsman2.playerID == null) && ((str2 = this.playerName) != null ? str2.equals(topBatsman2.playerName) : topBatsman2.playerName == null) && ((str3 = this.playerNameHindi) != null ? str3.equals(topBatsman2.playerNameHindi) : topBatsman2.playerNameHindi == null) && ((str4 = this.playerTeam) != null ? str4.equals(topBatsman2.playerTeam) : topBatsman2.playerTeam == null) && ((str5 = this.playerTeamID) != null ? str5.equals(topBatsman2.playerTeamID) : topBatsman2.playerTeamID == null) && ((d = this.totalBattingPoints) != null ? d.equals(topBatsman2.totalBattingPoints) : topBatsman2.totalBattingPoints == null) && ((d2 = this.totalPoints) != null ? d2.equals(topBatsman2.totalPoints) : topBatsman2.totalPoints == null) && ((list = this.battingStatsList) != null ? list.equals(topBatsman2.battingStatsList) : topBatsman2.battingStatsList == null) && ((d3 = this.totalBowlingPoints) != null ? d3.equals(topBatsman2.totalBowlingPoints) : topBatsman2.totalBowlingPoints == null) && ((d4 = this.totalFieldingPoints) != null ? d4.equals(topBatsman2.totalFieldingPoints) : topBatsman2.totalFieldingPoints == null) && ((list2 = this.bowlingStatsList) != null ? list2.equals(topBatsman2.bowlingStatsList) : topBatsman2.bowlingStatsList == null) && ((list3 = this.fieldingStatsList) != null ? list3.equals(topBatsman2.fieldingStatsList) : topBatsman2.fieldingStatsList == null)) {
                InningWisePoints10 inningWisePoints10 = this.inningWisePoints;
                InningWisePoints10 inningWisePoints102 = topBatsman2.inningWisePoints;
                if (inningWisePoints10 == null) {
                    if (inningWisePoints102 == null) {
                        return true;
                    }
                } else if (inningWisePoints10.equals(inningWisePoints102)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.playerID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerNameHindi;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerTeam;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerTeamID;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Double d = this.totalBattingPoints;
                int hashCode7 = (hashCode6 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.totalPoints;
                int hashCode8 = (hashCode7 ^ (d2 == null ? 0 : d2.hashCode())) * 1000003;
                List<BattingStatsList10> list = this.battingStatsList;
                int hashCode9 = (hashCode8 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                Double d3 = this.totalBowlingPoints;
                int hashCode10 = (hashCode9 ^ (d3 == null ? 0 : d3.hashCode())) * 1000003;
                Double d4 = this.totalFieldingPoints;
                int hashCode11 = (hashCode10 ^ (d4 == null ? 0 : d4.hashCode())) * 1000003;
                List<BowlingStatsList10> list2 = this.bowlingStatsList;
                int hashCode12 = (hashCode11 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<FieldingStatsList10> list3 = this.fieldingStatsList;
                int hashCode13 = (hashCode12 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                InningWisePoints10 inningWisePoints10 = this.inningWisePoints;
                if (inningWisePoints10 != null) {
                    i = inningWisePoints10.hashCode();
                }
                this.$hashCode = hashCode13 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TopBatsman2> {
            final BattingStatsList10.Mapper battingStatsList10FieldMapper = new BattingStatsList10.Mapper();
            final BowlingStatsList10.Mapper bowlingStatsList10FieldMapper = new BowlingStatsList10.Mapper();
            final FieldingStatsList10.Mapper fieldingStatsList10FieldMapper = new FieldingStatsList10.Mapper();
            final InningWisePoints10.Mapper inningWisePoints10FieldMapper = new InningWisePoints10.Mapper();

            @Override 
            public TopBatsman2 map(ResponseReader responseReader) {
                return new TopBatsman2(responseReader.readString(TopBatsman2.$responseFields[0]), responseReader.readString(TopBatsman2.$responseFields[1]), responseReader.readString(TopBatsman2.$responseFields[2]), responseReader.readString(TopBatsman2.$responseFields[3]), responseReader.readString(TopBatsman2.$responseFields[4]), responseReader.readString(TopBatsman2.$responseFields[5]), responseReader.readDouble(TopBatsman2.$responseFields[6]), responseReader.readDouble(TopBatsman2.$responseFields[7]), responseReader.readList(TopBatsman2.$responseFields[8], new ResponseReader.ListReader<BattingStatsList10>() {


                    @Override 
                    public BattingStatsList10 read(ResponseReader.ListItemReader listItemReader) {
                        return (BattingStatsList10) listItemReader.readObject(new ResponseReader.ObjectReader<BattingStatsList10>() {


                            @Override 
                            public BattingStatsList10 read(ResponseReader responseReader) {
                                return Mapper.this.battingStatsList10FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readDouble(TopBatsman2.$responseFields[9]), responseReader.readDouble(TopBatsman2.$responseFields[10]), responseReader.readList(TopBatsman2.$responseFields[11], new ResponseReader.ListReader<BowlingStatsList10>() {


                    @Override 
                    public BowlingStatsList10 read(ResponseReader.ListItemReader listItemReader) {
                        return (BowlingStatsList10) listItemReader.readObject(new ResponseReader.ObjectReader<BowlingStatsList10>() {


                            @Override 
                            public BowlingStatsList10 read(ResponseReader responseReader) {
                                return Mapper.this.bowlingStatsList10FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(TopBatsman2.$responseFields[12], new ResponseReader.ListReader<FieldingStatsList10>() {


                    @Override 
                    public FieldingStatsList10 read(ResponseReader.ListItemReader listItemReader) {
                        return (FieldingStatsList10) listItemReader.readObject(new ResponseReader.ObjectReader<FieldingStatsList10>() {


                            @Override 
                            public FieldingStatsList10 read(ResponseReader responseReader) {
                                return Mapper.this.fieldingStatsList10FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (InningWisePoints10) responseReader.readObject(TopBatsman2.$responseFields[13], new ResponseReader.ObjectReader<InningWisePoints10>() {


                    @Override 
                    public InningWisePoints10 read(ResponseReader responseReader) {
                        return Mapper.this.inningWisePoints10FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class BattingStatsList10 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runs", "runs", null, true, Collections.emptyList()), ResponseField.forInt("fours", "fours", null, true, Collections.emptyList()), ResponseField.forInt("sixes", "sixes", null, true, Collections.emptyList()), ResponseField.forInt("balls", "balls", null, true, Collections.emptyList()), ResponseField.forDouble("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forBoolean("isNotOut", "isNotOut", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer balls;
        final Integer fours;
        final Boolean isNotOut;
        final Integer runs;
        final Integer sixes;
        final Double strikeRate;

        public BattingStatsList10(String str, Integer num, Integer num2, Integer num3, Integer num4, Double d, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runs = num;
            this.fours = num2;
            this.sixes = num3;
            this.balls = num4;
            this.strikeRate = d;
            this.isNotOut = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runs() {
            return this.runs;
        }

        public Integer fours() {
            return this.fours;
        }

        public Integer sixes() {
            return this.sixes;
        }

        public Integer balls() {
            return this.balls;
        }

        public Double strikeRate() {
            return this.strikeRate;
        }

        public Boolean isNotOut() {
            return this.isNotOut;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BattingStatsList10.$responseFields[0], BattingStatsList10.this.__typename);
                    responseWriter.writeInt(BattingStatsList10.$responseFields[1], BattingStatsList10.this.runs);
                    responseWriter.writeInt(BattingStatsList10.$responseFields[2], BattingStatsList10.this.fours);
                    responseWriter.writeInt(BattingStatsList10.$responseFields[3], BattingStatsList10.this.sixes);
                    responseWriter.writeInt(BattingStatsList10.$responseFields[4], BattingStatsList10.this.balls);
                    responseWriter.writeDouble(BattingStatsList10.$responseFields[5], BattingStatsList10.this.strikeRate);
                    responseWriter.writeBoolean(BattingStatsList10.$responseFields[6], BattingStatsList10.this.isNotOut);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BattingStatsList10{__typename=" + this.__typename + ", runs=" + this.runs + ", fours=" + this.fours + ", sixes=" + this.sixes + ", balls=" + this.balls + ", strikeRate=" + this.strikeRate + ", isNotOut=" + this.isNotOut + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattingStatsList10)) {
                return false;
            }
            BattingStatsList10 battingStatsList10 = (BattingStatsList10) obj;
            if (this.__typename.equals(battingStatsList10.__typename) && ((num = this.runs) != null ? num.equals(battingStatsList10.runs) : battingStatsList10.runs == null) && ((num2 = this.fours) != null ? num2.equals(battingStatsList10.fours) : battingStatsList10.fours == null) && ((num3 = this.sixes) != null ? num3.equals(battingStatsList10.sixes) : battingStatsList10.sixes == null) && ((num4 = this.balls) != null ? num4.equals(battingStatsList10.balls) : battingStatsList10.balls == null) && ((d = this.strikeRate) != null ? d.equals(battingStatsList10.strikeRate) : battingStatsList10.strikeRate == null)) {
                Boolean bool = this.isNotOut;
                Boolean bool2 = battingStatsList10.isNotOut;
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
                Integer num = this.runs;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.fours;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.sixes;
                int hashCode4 = (hashCode3 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.balls;
                int hashCode5 = (hashCode4 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Double d = this.strikeRate;
                int hashCode6 = (hashCode5 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Boolean bool = this.isNotOut;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BattingStatsList10> {
            @Override 
            public BattingStatsList10 map(ResponseReader responseReader) {
                return new BattingStatsList10(responseReader.readString(BattingStatsList10.$responseFields[0]), responseReader.readInt(BattingStatsList10.$responseFields[1]), responseReader.readInt(BattingStatsList10.$responseFields[2]), responseReader.readInt(BattingStatsList10.$responseFields[3]), responseReader.readInt(BattingStatsList10.$responseFields[4]), responseReader.readDouble(BattingStatsList10.$responseFields[5]), responseReader.readBoolean(BattingStatsList10.$responseFields[6]));
            }
        }
    }

    public static class BowlingStatsList10 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forInt("runsConceded", "runsConceded", null, true, Collections.emptyList()), ResponseField.forDouble("economyRate", "economyRate", null, true, Collections.emptyList()), ResponseField.forDouble("overs", "overs", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double economyRate;
        final Double overs;
        final Integer runsConceded;
        final Integer wickets;

        public BowlingStatsList10(String str, Integer num, Integer num2, Double d, Double d2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.wickets = num;
            this.runsConceded = num2;
            this.economyRate = d;
            this.overs = d2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer wickets() {
            return this.wickets;
        }

        public Integer runsConceded() {
            return this.runsConceded;
        }

        public Double economyRate() {
            return this.economyRate;
        }

        public Double overs() {
            return this.overs;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlingStatsList10.$responseFields[0], BowlingStatsList10.this.__typename);
                    responseWriter.writeInt(BowlingStatsList10.$responseFields[1], BowlingStatsList10.this.wickets);
                    responseWriter.writeInt(BowlingStatsList10.$responseFields[2], BowlingStatsList10.this.runsConceded);
                    responseWriter.writeDouble(BowlingStatsList10.$responseFields[3], BowlingStatsList10.this.economyRate);
                    responseWriter.writeDouble(BowlingStatsList10.$responseFields[4], BowlingStatsList10.this.overs);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlingStatsList10{__typename=" + this.__typename + ", wickets=" + this.wickets + ", runsConceded=" + this.runsConceded + ", economyRate=" + this.economyRate + ", overs=" + this.overs + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlingStatsList10)) {
                return false;
            }
            BowlingStatsList10 bowlingStatsList10 = (BowlingStatsList10) obj;
            if (this.__typename.equals(bowlingStatsList10.__typename) && ((num = this.wickets) != null ? num.equals(bowlingStatsList10.wickets) : bowlingStatsList10.wickets == null) && ((num2 = this.runsConceded) != null ? num2.equals(bowlingStatsList10.runsConceded) : bowlingStatsList10.runsConceded == null) && ((d = this.economyRate) != null ? d.equals(bowlingStatsList10.economyRate) : bowlingStatsList10.economyRate == null)) {
                Double d2 = this.overs;
                Double d3 = bowlingStatsList10.overs;
                if (d2 == null) {
                    if (d3 == null) {
                        return true;
                    }
                } else if (d2.equals(d3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.wickets;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.runsConceded;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Double d = this.economyRate;
                int hashCode4 = (hashCode3 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.overs;
                if (d2 != null) {
                    i = d2.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlingStatsList10> {
            @Override 
            public BowlingStatsList10 map(ResponseReader responseReader) {
                return new BowlingStatsList10(responseReader.readString(BowlingStatsList10.$responseFields[0]), responseReader.readInt(BowlingStatsList10.$responseFields[1]), responseReader.readInt(BowlingStatsList10.$responseFields[2]), responseReader.readDouble(BowlingStatsList10.$responseFields[3]), responseReader.readDouble(BowlingStatsList10.$responseFields[4]));
            }
        }
    }

    public static class FieldingStatsList10 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runsOuts", "runsOuts", null, true, Collections.emptyList()), ResponseField.forInt("catches", "catches", null, true, Collections.emptyList()), ResponseField.forInt("stumps", "stumps", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer catches;
        final Integer runsOuts;
        final Integer stumps;

        public FieldingStatsList10(String str, Integer num, Integer num2, Integer num3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runsOuts = num;
            this.catches = num2;
            this.stumps = num3;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runsOuts() {
            return this.runsOuts;
        }

        public Integer catches() {
            return this.catches;
        }

        public Integer stumps() {
            return this.stumps;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(FieldingStatsList10.$responseFields[0], FieldingStatsList10.this.__typename);
                    responseWriter.writeInt(FieldingStatsList10.$responseFields[1], FieldingStatsList10.this.runsOuts);
                    responseWriter.writeInt(FieldingStatsList10.$responseFields[2], FieldingStatsList10.this.catches);
                    responseWriter.writeInt(FieldingStatsList10.$responseFields[3], FieldingStatsList10.this.stumps);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FieldingStatsList10{__typename=" + this.__typename + ", runsOuts=" + this.runsOuts + ", catches=" + this.catches + ", stumps=" + this.stumps + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FieldingStatsList10)) {
                return false;
            }
            FieldingStatsList10 fieldingStatsList10 = (FieldingStatsList10) obj;
            if (this.__typename.equals(fieldingStatsList10.__typename) && ((num = this.runsOuts) != null ? num.equals(fieldingStatsList10.runsOuts) : fieldingStatsList10.runsOuts == null) && ((num2 = this.catches) != null ? num2.equals(fieldingStatsList10.catches) : fieldingStatsList10.catches == null)) {
                Integer num3 = this.stumps;
                Integer num4 = fieldingStatsList10.stumps;
                if (num3 == null) {
                    if (num4 == null) {
                        return true;
                    }
                } else if (num3.equals(num4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.runsOuts;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.catches;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.stumps;
                if (num3 != null) {
                    i = num3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<FieldingStatsList10> {
            @Override 
            public FieldingStatsList10 map(ResponseReader responseReader) {
                return new FieldingStatsList10(responseReader.readString(FieldingStatsList10.$responseFields[0]), responseReader.readInt(FieldingStatsList10.$responseFields[1]), responseReader.readInt(FieldingStatsList10.$responseFields[2]), responseReader.readInt(FieldingStatsList10.$responseFields[3]));
            }
        }
    }

    public static class InningWisePoints10 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("inningWiseBattingPoints", "inningWiseBattingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseBowlingPoints", "inningWiseBowlingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseFieldingPoints", "inningWiseFieldingPoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Double> inningWiseBattingPoints;
        final List<Double> inningWiseBowlingPoints;
        final List<Double> inningWiseFieldingPoints;

        public InningWisePoints10(String str, List<Double> list, List<Double> list2, List<Double> list3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.inningWiseBattingPoints = list;
            this.inningWiseBowlingPoints = list2;
            this.inningWiseFieldingPoints = list3;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Double> inningWiseBattingPoints() {
            return this.inningWiseBattingPoints;
        }

        public List<Double> inningWiseBowlingPoints() {
            return this.inningWiseBowlingPoints;
        }

        public List<Double> inningWiseFieldingPoints() {
            return this.inningWiseFieldingPoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(InningWisePoints10.$responseFields[0], InningWisePoints10.this.__typename);
                    responseWriter.writeList(InningWisePoints10.$responseFields[1], InningWisePoints10.this.inningWiseBattingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints10.$responseFields[2], InningWisePoints10.this.inningWiseBowlingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints10.$responseFields[3], InningWisePoints10.this.inningWiseFieldingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "InningWisePoints10{__typename=" + this.__typename + ", inningWiseBattingPoints=" + this.inningWiseBattingPoints + ", inningWiseBowlingPoints=" + this.inningWiseBowlingPoints + ", inningWiseFieldingPoints=" + this.inningWiseFieldingPoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<Double> list;
            List<Double> list2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InningWisePoints10)) {
                return false;
            }
            InningWisePoints10 inningWisePoints10 = (InningWisePoints10) obj;
            if (this.__typename.equals(inningWisePoints10.__typename) && ((list = this.inningWiseBattingPoints) != null ? list.equals(inningWisePoints10.inningWiseBattingPoints) : inningWisePoints10.inningWiseBattingPoints == null) && ((list2 = this.inningWiseBowlingPoints) != null ? list2.equals(inningWisePoints10.inningWiseBowlingPoints) : inningWisePoints10.inningWiseBowlingPoints == null)) {
                List<Double> list3 = this.inningWiseFieldingPoints;
                List<Double> list4 = inningWisePoints10.inningWiseFieldingPoints;
                if (list3 == null) {
                    if (list4 == null) {
                        return true;
                    }
                } else if (list3.equals(list4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<Double> list = this.inningWiseBattingPoints;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Double> list2 = this.inningWiseBowlingPoints;
                int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<Double> list3 = this.inningWiseFieldingPoints;
                if (list3 != null) {
                    i = list3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<InningWisePoints10> {
            @Override 
            public InningWisePoints10 map(ResponseReader responseReader) {
                return new InningWisePoints10(responseReader.readString(InningWisePoints10.$responseFields[0]), responseReader.readList(InningWisePoints10.$responseFields[1], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints10.$responseFields[2], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints10.$responseFields[3], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }));
            }
        }
    }

    public static class RunnerBatsman2 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerNameHindi", "playerNameHindi", null, true, Collections.emptyList()), ResponseField.forString("playerTeam", "playerTeam", null, true, Collections.emptyList()), ResponseField.forString("playerTeamID", "playerTeamID", null, true, Collections.emptyList()), ResponseField.forDouble("totalBattingPoints", "totalBattingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalPoints", "totalPoints", null, true, Collections.emptyList()), ResponseField.forList("battingStatsList", "battingStatsList", null, true, Collections.emptyList()), ResponseField.forDouble("totalBowlingPoints", "totalBowlingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalFieldingPoints", "totalFieldingPoints", null, true, Collections.emptyList()), ResponseField.forList("bowlingStatsList", "bowlingStatsList", null, true, Collections.emptyList()), ResponseField.forList("fieldingStatsList", "fieldingStatsList", null, true, Collections.emptyList()), ResponseField.forObject("inningWisePoints", "inningWisePoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<BattingStatsList11> battingStatsList;
        final List<BowlingStatsList11> bowlingStatsList;
        final List<FieldingStatsList11> fieldingStatsList;
        final InningWisePoints11 inningWisePoints;
        final String playerID;
        final String playerName;
        final String playerNameHindi;
        final String playerTeam;
        final String playerTeamID;
        final Double totalBattingPoints;
        final Double totalBowlingPoints;
        final Double totalFieldingPoints;
        final Double totalPoints;

        public RunnerBatsman2(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, List<BattingStatsList11> list, Double d3, Double d4, List<BowlingStatsList11> list2, List<FieldingStatsList11> list3, InningWisePoints11 inningWisePoints11) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerName = str3;
            this.playerNameHindi = str4;
            this.playerTeam = str5;
            this.playerTeamID = str6;
            this.totalBattingPoints = d;
            this.totalPoints = d2;
            this.battingStatsList = list;
            this.totalBowlingPoints = d3;
            this.totalFieldingPoints = d4;
            this.bowlingStatsList = list2;
            this.fieldingStatsList = list3;
            this.inningWisePoints = inningWisePoints11;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerID() {
            return this.playerID;
        }

        public String playerName() {
            return this.playerName;
        }

        public String playerNameHindi() {
            return this.playerNameHindi;
        }

        public String playerTeam() {
            return this.playerTeam;
        }

        public String playerTeamID() {
            return this.playerTeamID;
        }

        public Double totalBattingPoints() {
            return this.totalBattingPoints;
        }

        public Double totalPoints() {
            return this.totalPoints;
        }

        public List<BattingStatsList11> battingStatsList() {
            return this.battingStatsList;
        }

        public Double totalBowlingPoints() {
            return this.totalBowlingPoints;
        }

        public Double totalFieldingPoints() {
            return this.totalFieldingPoints;
        }

        public List<BowlingStatsList11> bowlingStatsList() {
            return this.bowlingStatsList;
        }

        public List<FieldingStatsList11> fieldingStatsList() {
            return this.fieldingStatsList;
        }

        public InningWisePoints11 inningWisePoints() {
            return this.inningWisePoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(RunnerBatsman2.$responseFields[0], RunnerBatsman2.this.__typename);
                    responseWriter.writeString(RunnerBatsman2.$responseFields[1], RunnerBatsman2.this.playerID);
                    responseWriter.writeString(RunnerBatsman2.$responseFields[2], RunnerBatsman2.this.playerName);
                    responseWriter.writeString(RunnerBatsman2.$responseFields[3], RunnerBatsman2.this.playerNameHindi);
                    responseWriter.writeString(RunnerBatsman2.$responseFields[4], RunnerBatsman2.this.playerTeam);
                    responseWriter.writeString(RunnerBatsman2.$responseFields[5], RunnerBatsman2.this.playerTeamID);
                    responseWriter.writeDouble(RunnerBatsman2.$responseFields[6], RunnerBatsman2.this.totalBattingPoints);
                    responseWriter.writeDouble(RunnerBatsman2.$responseFields[7], RunnerBatsman2.this.totalPoints);
                    responseWriter.writeList(RunnerBatsman2.$responseFields[8], RunnerBatsman2.this.battingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BattingStatsList11) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeDouble(RunnerBatsman2.$responseFields[9], RunnerBatsman2.this.totalBowlingPoints);
                    responseWriter.writeDouble(RunnerBatsman2.$responseFields[10], RunnerBatsman2.this.totalFieldingPoints);
                    responseWriter.writeList(RunnerBatsman2.$responseFields[11], RunnerBatsman2.this.bowlingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BowlingStatsList11) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(RunnerBatsman2.$responseFields[12], RunnerBatsman2.this.fieldingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((FieldingStatsList11) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeObject(RunnerBatsman2.$responseFields[13], RunnerBatsman2.this.inningWisePoints != null ? RunnerBatsman2.this.inningWisePoints.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "RunnerBatsman2{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerNameHindi=" + this.playerNameHindi + ", playerTeam=" + this.playerTeam + ", playerTeamID=" + this.playerTeamID + ", totalBattingPoints=" + this.totalBattingPoints + ", totalPoints=" + this.totalPoints + ", battingStatsList=" + this.battingStatsList + ", totalBowlingPoints=" + this.totalBowlingPoints + ", totalFieldingPoints=" + this.totalFieldingPoints + ", bowlingStatsList=" + this.bowlingStatsList + ", fieldingStatsList=" + this.fieldingStatsList + ", inningWisePoints=" + this.inningWisePoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Double d;
            Double d2;
            List<BattingStatsList11> list;
            Double d3;
            Double d4;
            List<BowlingStatsList11> list2;
            List<FieldingStatsList11> list3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RunnerBatsman2)) {
                return false;
            }
            RunnerBatsman2 runnerBatsman2 = (RunnerBatsman2) obj;
            if (this.__typename.equals(runnerBatsman2.__typename) && ((str = this.playerID) != null ? str.equals(runnerBatsman2.playerID) : runnerBatsman2.playerID == null) && ((str2 = this.playerName) != null ? str2.equals(runnerBatsman2.playerName) : runnerBatsman2.playerName == null) && ((str3 = this.playerNameHindi) != null ? str3.equals(runnerBatsman2.playerNameHindi) : runnerBatsman2.playerNameHindi == null) && ((str4 = this.playerTeam) != null ? str4.equals(runnerBatsman2.playerTeam) : runnerBatsman2.playerTeam == null) && ((str5 = this.playerTeamID) != null ? str5.equals(runnerBatsman2.playerTeamID) : runnerBatsman2.playerTeamID == null) && ((d = this.totalBattingPoints) != null ? d.equals(runnerBatsman2.totalBattingPoints) : runnerBatsman2.totalBattingPoints == null) && ((d2 = this.totalPoints) != null ? d2.equals(runnerBatsman2.totalPoints) : runnerBatsman2.totalPoints == null) && ((list = this.battingStatsList) != null ? list.equals(runnerBatsman2.battingStatsList) : runnerBatsman2.battingStatsList == null) && ((d3 = this.totalBowlingPoints) != null ? d3.equals(runnerBatsman2.totalBowlingPoints) : runnerBatsman2.totalBowlingPoints == null) && ((d4 = this.totalFieldingPoints) != null ? d4.equals(runnerBatsman2.totalFieldingPoints) : runnerBatsman2.totalFieldingPoints == null) && ((list2 = this.bowlingStatsList) != null ? list2.equals(runnerBatsman2.bowlingStatsList) : runnerBatsman2.bowlingStatsList == null) && ((list3 = this.fieldingStatsList) != null ? list3.equals(runnerBatsman2.fieldingStatsList) : runnerBatsman2.fieldingStatsList == null)) {
                InningWisePoints11 inningWisePoints11 = this.inningWisePoints;
                InningWisePoints11 inningWisePoints112 = runnerBatsman2.inningWisePoints;
                if (inningWisePoints11 == null) {
                    if (inningWisePoints112 == null) {
                        return true;
                    }
                } else if (inningWisePoints11.equals(inningWisePoints112)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.playerID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerNameHindi;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerTeam;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerTeamID;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Double d = this.totalBattingPoints;
                int hashCode7 = (hashCode6 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.totalPoints;
                int hashCode8 = (hashCode7 ^ (d2 == null ? 0 : d2.hashCode())) * 1000003;
                List<BattingStatsList11> list = this.battingStatsList;
                int hashCode9 = (hashCode8 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                Double d3 = this.totalBowlingPoints;
                int hashCode10 = (hashCode9 ^ (d3 == null ? 0 : d3.hashCode())) * 1000003;
                Double d4 = this.totalFieldingPoints;
                int hashCode11 = (hashCode10 ^ (d4 == null ? 0 : d4.hashCode())) * 1000003;
                List<BowlingStatsList11> list2 = this.bowlingStatsList;
                int hashCode12 = (hashCode11 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<FieldingStatsList11> list3 = this.fieldingStatsList;
                int hashCode13 = (hashCode12 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                InningWisePoints11 inningWisePoints11 = this.inningWisePoints;
                if (inningWisePoints11 != null) {
                    i = inningWisePoints11.hashCode();
                }
                this.$hashCode = hashCode13 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<RunnerBatsman2> {
            final BattingStatsList11.Mapper battingStatsList11FieldMapper = new BattingStatsList11.Mapper();
            final BowlingStatsList11.Mapper bowlingStatsList11FieldMapper = new BowlingStatsList11.Mapper();
            final FieldingStatsList11.Mapper fieldingStatsList11FieldMapper = new FieldingStatsList11.Mapper();
            final InningWisePoints11.Mapper inningWisePoints11FieldMapper = new InningWisePoints11.Mapper();

            @Override 
            public RunnerBatsman2 map(ResponseReader responseReader) {
                return new RunnerBatsman2(responseReader.readString(RunnerBatsman2.$responseFields[0]), responseReader.readString(RunnerBatsman2.$responseFields[1]), responseReader.readString(RunnerBatsman2.$responseFields[2]), responseReader.readString(RunnerBatsman2.$responseFields[3]), responseReader.readString(RunnerBatsman2.$responseFields[4]), responseReader.readString(RunnerBatsman2.$responseFields[5]), responseReader.readDouble(RunnerBatsman2.$responseFields[6]), responseReader.readDouble(RunnerBatsman2.$responseFields[7]), responseReader.readList(RunnerBatsman2.$responseFields[8], new ResponseReader.ListReader<BattingStatsList11>() {


                    @Override 
                    public BattingStatsList11 read(ResponseReader.ListItemReader listItemReader) {
                        return (BattingStatsList11) listItemReader.readObject(new ResponseReader.ObjectReader<BattingStatsList11>() {


                            @Override 
                            public BattingStatsList11 read(ResponseReader responseReader) {
                                return Mapper.this.battingStatsList11FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readDouble(RunnerBatsman2.$responseFields[9]), responseReader.readDouble(RunnerBatsman2.$responseFields[10]), responseReader.readList(RunnerBatsman2.$responseFields[11], new ResponseReader.ListReader<BowlingStatsList11>() {


                    @Override 
                    public BowlingStatsList11 read(ResponseReader.ListItemReader listItemReader) {
                        return (BowlingStatsList11) listItemReader.readObject(new ResponseReader.ObjectReader<BowlingStatsList11>() {


                            @Override 
                            public BowlingStatsList11 read(ResponseReader responseReader) {
                                return Mapper.this.bowlingStatsList11FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(RunnerBatsman2.$responseFields[12], new ResponseReader.ListReader<FieldingStatsList11>() {


                    @Override 
                    public FieldingStatsList11 read(ResponseReader.ListItemReader listItemReader) {
                        return (FieldingStatsList11) listItemReader.readObject(new ResponseReader.ObjectReader<FieldingStatsList11>() {


                            @Override 
                            public FieldingStatsList11 read(ResponseReader responseReader) {
                                return Mapper.this.fieldingStatsList11FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (InningWisePoints11) responseReader.readObject(RunnerBatsman2.$responseFields[13], new ResponseReader.ObjectReader<InningWisePoints11>() {


                    @Override 
                    public InningWisePoints11 read(ResponseReader responseReader) {
                        return Mapper.this.inningWisePoints11FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class BattingStatsList11 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runs", "runs", null, true, Collections.emptyList()), ResponseField.forInt("fours", "fours", null, true, Collections.emptyList()), ResponseField.forInt("sixes", "sixes", null, true, Collections.emptyList()), ResponseField.forInt("balls", "balls", null, true, Collections.emptyList()), ResponseField.forDouble("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forBoolean("isNotOut", "isNotOut", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer balls;
        final Integer fours;
        final Boolean isNotOut;
        final Integer runs;
        final Integer sixes;
        final Double strikeRate;

        public BattingStatsList11(String str, Integer num, Integer num2, Integer num3, Integer num4, Double d, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runs = num;
            this.fours = num2;
            this.sixes = num3;
            this.balls = num4;
            this.strikeRate = d;
            this.isNotOut = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runs() {
            return this.runs;
        }

        public Integer fours() {
            return this.fours;
        }

        public Integer sixes() {
            return this.sixes;
        }

        public Integer balls() {
            return this.balls;
        }

        public Double strikeRate() {
            return this.strikeRate;
        }

        public Boolean isNotOut() {
            return this.isNotOut;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BattingStatsList11.$responseFields[0], BattingStatsList11.this.__typename);
                    responseWriter.writeInt(BattingStatsList11.$responseFields[1], BattingStatsList11.this.runs);
                    responseWriter.writeInt(BattingStatsList11.$responseFields[2], BattingStatsList11.this.fours);
                    responseWriter.writeInt(BattingStatsList11.$responseFields[3], BattingStatsList11.this.sixes);
                    responseWriter.writeInt(BattingStatsList11.$responseFields[4], BattingStatsList11.this.balls);
                    responseWriter.writeDouble(BattingStatsList11.$responseFields[5], BattingStatsList11.this.strikeRate);
                    responseWriter.writeBoolean(BattingStatsList11.$responseFields[6], BattingStatsList11.this.isNotOut);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BattingStatsList11{__typename=" + this.__typename + ", runs=" + this.runs + ", fours=" + this.fours + ", sixes=" + this.sixes + ", balls=" + this.balls + ", strikeRate=" + this.strikeRate + ", isNotOut=" + this.isNotOut + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattingStatsList11)) {
                return false;
            }
            BattingStatsList11 battingStatsList11 = (BattingStatsList11) obj;
            if (this.__typename.equals(battingStatsList11.__typename) && ((num = this.runs) != null ? num.equals(battingStatsList11.runs) : battingStatsList11.runs == null) && ((num2 = this.fours) != null ? num2.equals(battingStatsList11.fours) : battingStatsList11.fours == null) && ((num3 = this.sixes) != null ? num3.equals(battingStatsList11.sixes) : battingStatsList11.sixes == null) && ((num4 = this.balls) != null ? num4.equals(battingStatsList11.balls) : battingStatsList11.balls == null) && ((d = this.strikeRate) != null ? d.equals(battingStatsList11.strikeRate) : battingStatsList11.strikeRate == null)) {
                Boolean bool = this.isNotOut;
                Boolean bool2 = battingStatsList11.isNotOut;
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
                Integer num = this.runs;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.fours;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.sixes;
                int hashCode4 = (hashCode3 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.balls;
                int hashCode5 = (hashCode4 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Double d = this.strikeRate;
                int hashCode6 = (hashCode5 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Boolean bool = this.isNotOut;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BattingStatsList11> {
            @Override 
            public BattingStatsList11 map(ResponseReader responseReader) {
                return new BattingStatsList11(responseReader.readString(BattingStatsList11.$responseFields[0]), responseReader.readInt(BattingStatsList11.$responseFields[1]), responseReader.readInt(BattingStatsList11.$responseFields[2]), responseReader.readInt(BattingStatsList11.$responseFields[3]), responseReader.readInt(BattingStatsList11.$responseFields[4]), responseReader.readDouble(BattingStatsList11.$responseFields[5]), responseReader.readBoolean(BattingStatsList11.$responseFields[6]));
            }
        }
    }

    public static class BowlingStatsList11 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forInt("runsConceded", "runsConceded", null, true, Collections.emptyList()), ResponseField.forDouble("economyRate", "economyRate", null, true, Collections.emptyList()), ResponseField.forDouble("overs", "overs", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double economyRate;
        final Double overs;
        final Integer runsConceded;
        final Integer wickets;

        public BowlingStatsList11(String str, Integer num, Integer num2, Double d, Double d2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.wickets = num;
            this.runsConceded = num2;
            this.economyRate = d;
            this.overs = d2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer wickets() {
            return this.wickets;
        }

        public Integer runsConceded() {
            return this.runsConceded;
        }

        public Double economyRate() {
            return this.economyRate;
        }

        public Double overs() {
            return this.overs;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlingStatsList11.$responseFields[0], BowlingStatsList11.this.__typename);
                    responseWriter.writeInt(BowlingStatsList11.$responseFields[1], BowlingStatsList11.this.wickets);
                    responseWriter.writeInt(BowlingStatsList11.$responseFields[2], BowlingStatsList11.this.runsConceded);
                    responseWriter.writeDouble(BowlingStatsList11.$responseFields[3], BowlingStatsList11.this.economyRate);
                    responseWriter.writeDouble(BowlingStatsList11.$responseFields[4], BowlingStatsList11.this.overs);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlingStatsList11{__typename=" + this.__typename + ", wickets=" + this.wickets + ", runsConceded=" + this.runsConceded + ", economyRate=" + this.economyRate + ", overs=" + this.overs + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlingStatsList11)) {
                return false;
            }
            BowlingStatsList11 bowlingStatsList11 = (BowlingStatsList11) obj;
            if (this.__typename.equals(bowlingStatsList11.__typename) && ((num = this.wickets) != null ? num.equals(bowlingStatsList11.wickets) : bowlingStatsList11.wickets == null) && ((num2 = this.runsConceded) != null ? num2.equals(bowlingStatsList11.runsConceded) : bowlingStatsList11.runsConceded == null) && ((d = this.economyRate) != null ? d.equals(bowlingStatsList11.economyRate) : bowlingStatsList11.economyRate == null)) {
                Double d2 = this.overs;
                Double d3 = bowlingStatsList11.overs;
                if (d2 == null) {
                    if (d3 == null) {
                        return true;
                    }
                } else if (d2.equals(d3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.wickets;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.runsConceded;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Double d = this.economyRate;
                int hashCode4 = (hashCode3 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.overs;
                if (d2 != null) {
                    i = d2.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlingStatsList11> {
            @Override 
            public BowlingStatsList11 map(ResponseReader responseReader) {
                return new BowlingStatsList11(responseReader.readString(BowlingStatsList11.$responseFields[0]), responseReader.readInt(BowlingStatsList11.$responseFields[1]), responseReader.readInt(BowlingStatsList11.$responseFields[2]), responseReader.readDouble(BowlingStatsList11.$responseFields[3]), responseReader.readDouble(BowlingStatsList11.$responseFields[4]));
            }
        }
    }

    public static class FieldingStatsList11 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runsOuts", "runsOuts", null, true, Collections.emptyList()), ResponseField.forInt("catches", "catches", null, true, Collections.emptyList()), ResponseField.forInt("stumps", "stumps", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer catches;
        final Integer runsOuts;
        final Integer stumps;

        public FieldingStatsList11(String str, Integer num, Integer num2, Integer num3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runsOuts = num;
            this.catches = num2;
            this.stumps = num3;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runsOuts() {
            return this.runsOuts;
        }

        public Integer catches() {
            return this.catches;
        }

        public Integer stumps() {
            return this.stumps;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(FieldingStatsList11.$responseFields[0], FieldingStatsList11.this.__typename);
                    responseWriter.writeInt(FieldingStatsList11.$responseFields[1], FieldingStatsList11.this.runsOuts);
                    responseWriter.writeInt(FieldingStatsList11.$responseFields[2], FieldingStatsList11.this.catches);
                    responseWriter.writeInt(FieldingStatsList11.$responseFields[3], FieldingStatsList11.this.stumps);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FieldingStatsList11{__typename=" + this.__typename + ", runsOuts=" + this.runsOuts + ", catches=" + this.catches + ", stumps=" + this.stumps + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FieldingStatsList11)) {
                return false;
            }
            FieldingStatsList11 fieldingStatsList11 = (FieldingStatsList11) obj;
            if (this.__typename.equals(fieldingStatsList11.__typename) && ((num = this.runsOuts) != null ? num.equals(fieldingStatsList11.runsOuts) : fieldingStatsList11.runsOuts == null) && ((num2 = this.catches) != null ? num2.equals(fieldingStatsList11.catches) : fieldingStatsList11.catches == null)) {
                Integer num3 = this.stumps;
                Integer num4 = fieldingStatsList11.stumps;
                if (num3 == null) {
                    if (num4 == null) {
                        return true;
                    }
                } else if (num3.equals(num4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.runsOuts;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.catches;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.stumps;
                if (num3 != null) {
                    i = num3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<FieldingStatsList11> {
            @Override 
            public FieldingStatsList11 map(ResponseReader responseReader) {
                return new FieldingStatsList11(responseReader.readString(FieldingStatsList11.$responseFields[0]), responseReader.readInt(FieldingStatsList11.$responseFields[1]), responseReader.readInt(FieldingStatsList11.$responseFields[2]), responseReader.readInt(FieldingStatsList11.$responseFields[3]));
            }
        }
    }

    public static class InningWisePoints11 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("inningWiseBattingPoints", "inningWiseBattingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseBowlingPoints", "inningWiseBowlingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseFieldingPoints", "inningWiseFieldingPoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Double> inningWiseBattingPoints;
        final List<Double> inningWiseBowlingPoints;
        final List<Double> inningWiseFieldingPoints;

        public InningWisePoints11(String str, List<Double> list, List<Double> list2, List<Double> list3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.inningWiseBattingPoints = list;
            this.inningWiseBowlingPoints = list2;
            this.inningWiseFieldingPoints = list3;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Double> inningWiseBattingPoints() {
            return this.inningWiseBattingPoints;
        }

        public List<Double> inningWiseBowlingPoints() {
            return this.inningWiseBowlingPoints;
        }

        public List<Double> inningWiseFieldingPoints() {
            return this.inningWiseFieldingPoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(InningWisePoints11.$responseFields[0], InningWisePoints11.this.__typename);
                    responseWriter.writeList(InningWisePoints11.$responseFields[1], InningWisePoints11.this.inningWiseBattingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints11.$responseFields[2], InningWisePoints11.this.inningWiseBowlingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints11.$responseFields[3], InningWisePoints11.this.inningWiseFieldingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "InningWisePoints11{__typename=" + this.__typename + ", inningWiseBattingPoints=" + this.inningWiseBattingPoints + ", inningWiseBowlingPoints=" + this.inningWiseBowlingPoints + ", inningWiseFieldingPoints=" + this.inningWiseFieldingPoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<Double> list;
            List<Double> list2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InningWisePoints11)) {
                return false;
            }
            InningWisePoints11 inningWisePoints11 = (InningWisePoints11) obj;
            if (this.__typename.equals(inningWisePoints11.__typename) && ((list = this.inningWiseBattingPoints) != null ? list.equals(inningWisePoints11.inningWiseBattingPoints) : inningWisePoints11.inningWiseBattingPoints == null) && ((list2 = this.inningWiseBowlingPoints) != null ? list2.equals(inningWisePoints11.inningWiseBowlingPoints) : inningWisePoints11.inningWiseBowlingPoints == null)) {
                List<Double> list3 = this.inningWiseFieldingPoints;
                List<Double> list4 = inningWisePoints11.inningWiseFieldingPoints;
                if (list3 == null) {
                    if (list4 == null) {
                        return true;
                    }
                } else if (list3.equals(list4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<Double> list = this.inningWiseBattingPoints;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Double> list2 = this.inningWiseBowlingPoints;
                int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<Double> list3 = this.inningWiseFieldingPoints;
                if (list3 != null) {
                    i = list3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<InningWisePoints11> {
            @Override 
            public InningWisePoints11 map(ResponseReader responseReader) {
                return new InningWisePoints11(responseReader.readString(InningWisePoints11.$responseFields[0]), responseReader.readList(InningWisePoints11.$responseFields[1], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints11.$responseFields[2], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints11.$responseFields[3], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }));
            }
        }
    }

    public static class BatsmanSummary21 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forObject("topBatsman", "topBatsman", null, true, Collections.emptyList()), ResponseField.forObject("runnerBatsman", "runnerBatsman", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final RunnerBatsman3 runnerBatsman;
        final TopBatsman3 topBatsman;

        public BatsmanSummary21(String str, TopBatsman3 topBatsman3, RunnerBatsman3 runnerBatsman3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.topBatsman = topBatsman3;
            this.runnerBatsman = runnerBatsman3;
        }

        public String __typename() {
            return this.__typename;
        }

        public TopBatsman3 topBatsman() {
            return this.topBatsman;
        }

        public RunnerBatsman3 runnerBatsman() {
            return this.runnerBatsman;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BatsmanSummary21.$responseFields[0], BatsmanSummary21.this.__typename);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(BatsmanSummary21.$responseFields[1], BatsmanSummary21.this.topBatsman != null ? BatsmanSummary21.this.topBatsman.marshaller() : null);
                    ResponseField responseField = BatsmanSummary21.$responseFields[2];
                    if (BatsmanSummary21.this.runnerBatsman != null) {
                        responseFieldMarshaller = BatsmanSummary21.this.runnerBatsman.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BatsmanSummary21{__typename=" + this.__typename + ", topBatsman=" + this.topBatsman + ", runnerBatsman=" + this.runnerBatsman + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            TopBatsman3 topBatsman3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BatsmanSummary21)) {
                return false;
            }
            BatsmanSummary21 batsmanSummary21 = (BatsmanSummary21) obj;
            if (this.__typename.equals(batsmanSummary21.__typename) && ((topBatsman3 = this.topBatsman) != null ? topBatsman3.equals(batsmanSummary21.topBatsman) : batsmanSummary21.topBatsman == null)) {
                RunnerBatsman3 runnerBatsman3 = this.runnerBatsman;
                RunnerBatsman3 runnerBatsman32 = batsmanSummary21.runnerBatsman;
                if (runnerBatsman3 == null) {
                    if (runnerBatsman32 == null) {
                        return true;
                    }
                } else if (runnerBatsman3.equals(runnerBatsman32)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                TopBatsman3 topBatsman3 = this.topBatsman;
                int i = 0;
                int hashCode2 = (hashCode ^ (topBatsman3 == null ? 0 : topBatsman3.hashCode())) * 1000003;
                RunnerBatsman3 runnerBatsman3 = this.runnerBatsman;
                if (runnerBatsman3 != null) {
                    i = runnerBatsman3.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BatsmanSummary21> {
            final RunnerBatsman3.Mapper runnerBatsman3FieldMapper = new RunnerBatsman3.Mapper();
            final TopBatsman3.Mapper topBatsman3FieldMapper = new TopBatsman3.Mapper();

            @Override 
            public BatsmanSummary21 map(ResponseReader responseReader) {
                return new BatsmanSummary21(responseReader.readString(BatsmanSummary21.$responseFields[0]), (TopBatsman3) responseReader.readObject(BatsmanSummary21.$responseFields[1], new ResponseReader.ObjectReader<TopBatsman3>() {


                    @Override 
                    public TopBatsman3 read(ResponseReader responseReader) {
                        return Mapper.this.topBatsman3FieldMapper.map(responseReader);
                    }
                }), (RunnerBatsman3) responseReader.readObject(BatsmanSummary21.$responseFields[2], new ResponseReader.ObjectReader<RunnerBatsman3>() {


                    @Override 
                    public RunnerBatsman3 read(ResponseReader responseReader) {
                        return Mapper.this.runnerBatsman3FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class TopBatsman3 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerNameHindi", "playerNameHindi", null, true, Collections.emptyList()), ResponseField.forString("playerTeam", "playerTeam", null, true, Collections.emptyList()), ResponseField.forString("playerTeamID", "playerTeamID", null, true, Collections.emptyList()), ResponseField.forDouble("totalBattingPoints", "totalBattingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalPoints", "totalPoints", null, true, Collections.emptyList()), ResponseField.forList("battingStatsList", "battingStatsList", null, true, Collections.emptyList()), ResponseField.forDouble("totalBowlingPoints", "totalBowlingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalFieldingPoints", "totalFieldingPoints", null, true, Collections.emptyList()), ResponseField.forList("bowlingStatsList", "bowlingStatsList", null, true, Collections.emptyList()), ResponseField.forList("fieldingStatsList", "fieldingStatsList", null, true, Collections.emptyList()), ResponseField.forObject("inningWisePoints", "inningWisePoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<BattingStatsList12> battingStatsList;
        final List<BowlingStatsList12> bowlingStatsList;
        final List<FieldingStatsList12> fieldingStatsList;
        final InningWisePoints12 inningWisePoints;
        final String playerID;
        final String playerName;
        final String playerNameHindi;
        final String playerTeam;
        final String playerTeamID;
        final Double totalBattingPoints;
        final Double totalBowlingPoints;
        final Double totalFieldingPoints;
        final Double totalPoints;

        public TopBatsman3(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, List<BattingStatsList12> list, Double d3, Double d4, List<BowlingStatsList12> list2, List<FieldingStatsList12> list3, InningWisePoints12 inningWisePoints12) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerName = str3;
            this.playerNameHindi = str4;
            this.playerTeam = str5;
            this.playerTeamID = str6;
            this.totalBattingPoints = d;
            this.totalPoints = d2;
            this.battingStatsList = list;
            this.totalBowlingPoints = d3;
            this.totalFieldingPoints = d4;
            this.bowlingStatsList = list2;
            this.fieldingStatsList = list3;
            this.inningWisePoints = inningWisePoints12;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerID() {
            return this.playerID;
        }

        public String playerName() {
            return this.playerName;
        }

        public String playerNameHindi() {
            return this.playerNameHindi;
        }

        public String playerTeam() {
            return this.playerTeam;
        }

        public String playerTeamID() {
            return this.playerTeamID;
        }

        public Double totalBattingPoints() {
            return this.totalBattingPoints;
        }

        public Double totalPoints() {
            return this.totalPoints;
        }

        public List<BattingStatsList12> battingStatsList() {
            return this.battingStatsList;
        }

        public Double totalBowlingPoints() {
            return this.totalBowlingPoints;
        }

        public Double totalFieldingPoints() {
            return this.totalFieldingPoints;
        }

        public List<BowlingStatsList12> bowlingStatsList() {
            return this.bowlingStatsList;
        }

        public List<FieldingStatsList12> fieldingStatsList() {
            return this.fieldingStatsList;
        }

        public InningWisePoints12 inningWisePoints() {
            return this.inningWisePoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TopBatsman3.$responseFields[0], TopBatsman3.this.__typename);
                    responseWriter.writeString(TopBatsman3.$responseFields[1], TopBatsman3.this.playerID);
                    responseWriter.writeString(TopBatsman3.$responseFields[2], TopBatsman3.this.playerName);
                    responseWriter.writeString(TopBatsman3.$responseFields[3], TopBatsman3.this.playerNameHindi);
                    responseWriter.writeString(TopBatsman3.$responseFields[4], TopBatsman3.this.playerTeam);
                    responseWriter.writeString(TopBatsman3.$responseFields[5], TopBatsman3.this.playerTeamID);
                    responseWriter.writeDouble(TopBatsman3.$responseFields[6], TopBatsman3.this.totalBattingPoints);
                    responseWriter.writeDouble(TopBatsman3.$responseFields[7], TopBatsman3.this.totalPoints);
                    responseWriter.writeList(TopBatsman3.$responseFields[8], TopBatsman3.this.battingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BattingStatsList12) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeDouble(TopBatsman3.$responseFields[9], TopBatsman3.this.totalBowlingPoints);
                    responseWriter.writeDouble(TopBatsman3.$responseFields[10], TopBatsman3.this.totalFieldingPoints);
                    responseWriter.writeList(TopBatsman3.$responseFields[11], TopBatsman3.this.bowlingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BowlingStatsList12) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(TopBatsman3.$responseFields[12], TopBatsman3.this.fieldingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((FieldingStatsList12) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeObject(TopBatsman3.$responseFields[13], TopBatsman3.this.inningWisePoints != null ? TopBatsman3.this.inningWisePoints.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TopBatsman3{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerNameHindi=" + this.playerNameHindi + ", playerTeam=" + this.playerTeam + ", playerTeamID=" + this.playerTeamID + ", totalBattingPoints=" + this.totalBattingPoints + ", totalPoints=" + this.totalPoints + ", battingStatsList=" + this.battingStatsList + ", totalBowlingPoints=" + this.totalBowlingPoints + ", totalFieldingPoints=" + this.totalFieldingPoints + ", bowlingStatsList=" + this.bowlingStatsList + ", fieldingStatsList=" + this.fieldingStatsList + ", inningWisePoints=" + this.inningWisePoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Double d;
            Double d2;
            List<BattingStatsList12> list;
            Double d3;
            Double d4;
            List<BowlingStatsList12> list2;
            List<FieldingStatsList12> list3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TopBatsman3)) {
                return false;
            }
            TopBatsman3 topBatsman3 = (TopBatsman3) obj;
            if (this.__typename.equals(topBatsman3.__typename) && ((str = this.playerID) != null ? str.equals(topBatsman3.playerID) : topBatsman3.playerID == null) && ((str2 = this.playerName) != null ? str2.equals(topBatsman3.playerName) : topBatsman3.playerName == null) && ((str3 = this.playerNameHindi) != null ? str3.equals(topBatsman3.playerNameHindi) : topBatsman3.playerNameHindi == null) && ((str4 = this.playerTeam) != null ? str4.equals(topBatsman3.playerTeam) : topBatsman3.playerTeam == null) && ((str5 = this.playerTeamID) != null ? str5.equals(topBatsman3.playerTeamID) : topBatsman3.playerTeamID == null) && ((d = this.totalBattingPoints) != null ? d.equals(topBatsman3.totalBattingPoints) : topBatsman3.totalBattingPoints == null) && ((d2 = this.totalPoints) != null ? d2.equals(topBatsman3.totalPoints) : topBatsman3.totalPoints == null) && ((list = this.battingStatsList) != null ? list.equals(topBatsman3.battingStatsList) : topBatsman3.battingStatsList == null) && ((d3 = this.totalBowlingPoints) != null ? d3.equals(topBatsman3.totalBowlingPoints) : topBatsman3.totalBowlingPoints == null) && ((d4 = this.totalFieldingPoints) != null ? d4.equals(topBatsman3.totalFieldingPoints) : topBatsman3.totalFieldingPoints == null) && ((list2 = this.bowlingStatsList) != null ? list2.equals(topBatsman3.bowlingStatsList) : topBatsman3.bowlingStatsList == null) && ((list3 = this.fieldingStatsList) != null ? list3.equals(topBatsman3.fieldingStatsList) : topBatsman3.fieldingStatsList == null)) {
                InningWisePoints12 inningWisePoints12 = this.inningWisePoints;
                InningWisePoints12 inningWisePoints122 = topBatsman3.inningWisePoints;
                if (inningWisePoints12 == null) {
                    if (inningWisePoints122 == null) {
                        return true;
                    }
                } else if (inningWisePoints12.equals(inningWisePoints122)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.playerID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerNameHindi;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerTeam;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerTeamID;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Double d = this.totalBattingPoints;
                int hashCode7 = (hashCode6 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.totalPoints;
                int hashCode8 = (hashCode7 ^ (d2 == null ? 0 : d2.hashCode())) * 1000003;
                List<BattingStatsList12> list = this.battingStatsList;
                int hashCode9 = (hashCode8 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                Double d3 = this.totalBowlingPoints;
                int hashCode10 = (hashCode9 ^ (d3 == null ? 0 : d3.hashCode())) * 1000003;
                Double d4 = this.totalFieldingPoints;
                int hashCode11 = (hashCode10 ^ (d4 == null ? 0 : d4.hashCode())) * 1000003;
                List<BowlingStatsList12> list2 = this.bowlingStatsList;
                int hashCode12 = (hashCode11 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<FieldingStatsList12> list3 = this.fieldingStatsList;
                int hashCode13 = (hashCode12 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                InningWisePoints12 inningWisePoints12 = this.inningWisePoints;
                if (inningWisePoints12 != null) {
                    i = inningWisePoints12.hashCode();
                }
                this.$hashCode = hashCode13 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TopBatsman3> {
            final BattingStatsList12.Mapper battingStatsList12FieldMapper = new BattingStatsList12.Mapper();
            final BowlingStatsList12.Mapper bowlingStatsList12FieldMapper = new BowlingStatsList12.Mapper();
            final FieldingStatsList12.Mapper fieldingStatsList12FieldMapper = new FieldingStatsList12.Mapper();
            final InningWisePoints12.Mapper inningWisePoints12FieldMapper = new InningWisePoints12.Mapper();

            @Override 
            public TopBatsman3 map(ResponseReader responseReader) {
                return new TopBatsman3(responseReader.readString(TopBatsman3.$responseFields[0]), responseReader.readString(TopBatsman3.$responseFields[1]), responseReader.readString(TopBatsman3.$responseFields[2]), responseReader.readString(TopBatsman3.$responseFields[3]), responseReader.readString(TopBatsman3.$responseFields[4]), responseReader.readString(TopBatsman3.$responseFields[5]), responseReader.readDouble(TopBatsman3.$responseFields[6]), responseReader.readDouble(TopBatsman3.$responseFields[7]), responseReader.readList(TopBatsman3.$responseFields[8], new ResponseReader.ListReader<BattingStatsList12>() {


                    @Override 
                    public BattingStatsList12 read(ResponseReader.ListItemReader listItemReader) {
                        return (BattingStatsList12) listItemReader.readObject(new ResponseReader.ObjectReader<BattingStatsList12>() {


                            @Override 
                            public BattingStatsList12 read(ResponseReader responseReader) {
                                return Mapper.this.battingStatsList12FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readDouble(TopBatsman3.$responseFields[9]), responseReader.readDouble(TopBatsman3.$responseFields[10]), responseReader.readList(TopBatsman3.$responseFields[11], new ResponseReader.ListReader<BowlingStatsList12>() {


                    @Override 
                    public BowlingStatsList12 read(ResponseReader.ListItemReader listItemReader) {
                        return (BowlingStatsList12) listItemReader.readObject(new ResponseReader.ObjectReader<BowlingStatsList12>() {


                            @Override 
                            public BowlingStatsList12 read(ResponseReader responseReader) {
                                return Mapper.this.bowlingStatsList12FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(TopBatsman3.$responseFields[12], new ResponseReader.ListReader<FieldingStatsList12>() {


                    @Override 
                    public FieldingStatsList12 read(ResponseReader.ListItemReader listItemReader) {
                        return (FieldingStatsList12) listItemReader.readObject(new ResponseReader.ObjectReader<FieldingStatsList12>() {


                            @Override 
                            public FieldingStatsList12 read(ResponseReader responseReader) {
                                return Mapper.this.fieldingStatsList12FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (InningWisePoints12) responseReader.readObject(TopBatsman3.$responseFields[13], new ResponseReader.ObjectReader<InningWisePoints12>() {


                    @Override 
                    public InningWisePoints12 read(ResponseReader responseReader) {
                        return Mapper.this.inningWisePoints12FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class BattingStatsList12 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runs", "runs", null, true, Collections.emptyList()), ResponseField.forInt("fours", "fours", null, true, Collections.emptyList()), ResponseField.forInt("sixes", "sixes", null, true, Collections.emptyList()), ResponseField.forInt("balls", "balls", null, true, Collections.emptyList()), ResponseField.forDouble("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forBoolean("isNotOut", "isNotOut", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer balls;
        final Integer fours;
        final Boolean isNotOut;
        final Integer runs;
        final Integer sixes;
        final Double strikeRate;

        public BattingStatsList12(String str, Integer num, Integer num2, Integer num3, Integer num4, Double d, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runs = num;
            this.fours = num2;
            this.sixes = num3;
            this.balls = num4;
            this.strikeRate = d;
            this.isNotOut = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runs() {
            return this.runs;
        }

        public Integer fours() {
            return this.fours;
        }

        public Integer sixes() {
            return this.sixes;
        }

        public Integer balls() {
            return this.balls;
        }

        public Double strikeRate() {
            return this.strikeRate;
        }

        public Boolean isNotOut() {
            return this.isNotOut;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BattingStatsList12.$responseFields[0], BattingStatsList12.this.__typename);
                    responseWriter.writeInt(BattingStatsList12.$responseFields[1], BattingStatsList12.this.runs);
                    responseWriter.writeInt(BattingStatsList12.$responseFields[2], BattingStatsList12.this.fours);
                    responseWriter.writeInt(BattingStatsList12.$responseFields[3], BattingStatsList12.this.sixes);
                    responseWriter.writeInt(BattingStatsList12.$responseFields[4], BattingStatsList12.this.balls);
                    responseWriter.writeDouble(BattingStatsList12.$responseFields[5], BattingStatsList12.this.strikeRate);
                    responseWriter.writeBoolean(BattingStatsList12.$responseFields[6], BattingStatsList12.this.isNotOut);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BattingStatsList12{__typename=" + this.__typename + ", runs=" + this.runs + ", fours=" + this.fours + ", sixes=" + this.sixes + ", balls=" + this.balls + ", strikeRate=" + this.strikeRate + ", isNotOut=" + this.isNotOut + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattingStatsList12)) {
                return false;
            }
            BattingStatsList12 battingStatsList12 = (BattingStatsList12) obj;
            if (this.__typename.equals(battingStatsList12.__typename) && ((num = this.runs) != null ? num.equals(battingStatsList12.runs) : battingStatsList12.runs == null) && ((num2 = this.fours) != null ? num2.equals(battingStatsList12.fours) : battingStatsList12.fours == null) && ((num3 = this.sixes) != null ? num3.equals(battingStatsList12.sixes) : battingStatsList12.sixes == null) && ((num4 = this.balls) != null ? num4.equals(battingStatsList12.balls) : battingStatsList12.balls == null) && ((d = this.strikeRate) != null ? d.equals(battingStatsList12.strikeRate) : battingStatsList12.strikeRate == null)) {
                Boolean bool = this.isNotOut;
                Boolean bool2 = battingStatsList12.isNotOut;
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
                Integer num = this.runs;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.fours;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.sixes;
                int hashCode4 = (hashCode3 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.balls;
                int hashCode5 = (hashCode4 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Double d = this.strikeRate;
                int hashCode6 = (hashCode5 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Boolean bool = this.isNotOut;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BattingStatsList12> {
            @Override 
            public BattingStatsList12 map(ResponseReader responseReader) {
                return new BattingStatsList12(responseReader.readString(BattingStatsList12.$responseFields[0]), responseReader.readInt(BattingStatsList12.$responseFields[1]), responseReader.readInt(BattingStatsList12.$responseFields[2]), responseReader.readInt(BattingStatsList12.$responseFields[3]), responseReader.readInt(BattingStatsList12.$responseFields[4]), responseReader.readDouble(BattingStatsList12.$responseFields[5]), responseReader.readBoolean(BattingStatsList12.$responseFields[6]));
            }
        }
    }

    public static class BowlingStatsList12 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forInt("runsConceded", "runsConceded", null, true, Collections.emptyList()), ResponseField.forDouble("economyRate", "economyRate", null, true, Collections.emptyList()), ResponseField.forDouble("overs", "overs", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double economyRate;
        final Double overs;
        final Integer runsConceded;
        final Integer wickets;

        public BowlingStatsList12(String str, Integer num, Integer num2, Double d, Double d2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.wickets = num;
            this.runsConceded = num2;
            this.economyRate = d;
            this.overs = d2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer wickets() {
            return this.wickets;
        }

        public Integer runsConceded() {
            return this.runsConceded;
        }

        public Double economyRate() {
            return this.economyRate;
        }

        public Double overs() {
            return this.overs;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlingStatsList12.$responseFields[0], BowlingStatsList12.this.__typename);
                    responseWriter.writeInt(BowlingStatsList12.$responseFields[1], BowlingStatsList12.this.wickets);
                    responseWriter.writeInt(BowlingStatsList12.$responseFields[2], BowlingStatsList12.this.runsConceded);
                    responseWriter.writeDouble(BowlingStatsList12.$responseFields[3], BowlingStatsList12.this.economyRate);
                    responseWriter.writeDouble(BowlingStatsList12.$responseFields[4], BowlingStatsList12.this.overs);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlingStatsList12{__typename=" + this.__typename + ", wickets=" + this.wickets + ", runsConceded=" + this.runsConceded + ", economyRate=" + this.economyRate + ", overs=" + this.overs + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlingStatsList12)) {
                return false;
            }
            BowlingStatsList12 bowlingStatsList12 = (BowlingStatsList12) obj;
            if (this.__typename.equals(bowlingStatsList12.__typename) && ((num = this.wickets) != null ? num.equals(bowlingStatsList12.wickets) : bowlingStatsList12.wickets == null) && ((num2 = this.runsConceded) != null ? num2.equals(bowlingStatsList12.runsConceded) : bowlingStatsList12.runsConceded == null) && ((d = this.economyRate) != null ? d.equals(bowlingStatsList12.economyRate) : bowlingStatsList12.economyRate == null)) {
                Double d2 = this.overs;
                Double d3 = bowlingStatsList12.overs;
                if (d2 == null) {
                    if (d3 == null) {
                        return true;
                    }
                } else if (d2.equals(d3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.wickets;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.runsConceded;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Double d = this.economyRate;
                int hashCode4 = (hashCode3 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.overs;
                if (d2 != null) {
                    i = d2.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlingStatsList12> {
            @Override 
            public BowlingStatsList12 map(ResponseReader responseReader) {
                return new BowlingStatsList12(responseReader.readString(BowlingStatsList12.$responseFields[0]), responseReader.readInt(BowlingStatsList12.$responseFields[1]), responseReader.readInt(BowlingStatsList12.$responseFields[2]), responseReader.readDouble(BowlingStatsList12.$responseFields[3]), responseReader.readDouble(BowlingStatsList12.$responseFields[4]));
            }
        }
    }

    public static class FieldingStatsList12 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runsOuts", "runsOuts", null, true, Collections.emptyList()), ResponseField.forInt("catches", "catches", null, true, Collections.emptyList()), ResponseField.forInt("stumps", "stumps", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer catches;
        final Integer runsOuts;
        final Integer stumps;

        public FieldingStatsList12(String str, Integer num, Integer num2, Integer num3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runsOuts = num;
            this.catches = num2;
            this.stumps = num3;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runsOuts() {
            return this.runsOuts;
        }

        public Integer catches() {
            return this.catches;
        }

        public Integer stumps() {
            return this.stumps;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(FieldingStatsList12.$responseFields[0], FieldingStatsList12.this.__typename);
                    responseWriter.writeInt(FieldingStatsList12.$responseFields[1], FieldingStatsList12.this.runsOuts);
                    responseWriter.writeInt(FieldingStatsList12.$responseFields[2], FieldingStatsList12.this.catches);
                    responseWriter.writeInt(FieldingStatsList12.$responseFields[3], FieldingStatsList12.this.stumps);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FieldingStatsList12{__typename=" + this.__typename + ", runsOuts=" + this.runsOuts + ", catches=" + this.catches + ", stumps=" + this.stumps + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FieldingStatsList12)) {
                return false;
            }
            FieldingStatsList12 fieldingStatsList12 = (FieldingStatsList12) obj;
            if (this.__typename.equals(fieldingStatsList12.__typename) && ((num = this.runsOuts) != null ? num.equals(fieldingStatsList12.runsOuts) : fieldingStatsList12.runsOuts == null) && ((num2 = this.catches) != null ? num2.equals(fieldingStatsList12.catches) : fieldingStatsList12.catches == null)) {
                Integer num3 = this.stumps;
                Integer num4 = fieldingStatsList12.stumps;
                if (num3 == null) {
                    if (num4 == null) {
                        return true;
                    }
                } else if (num3.equals(num4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.runsOuts;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.catches;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.stumps;
                if (num3 != null) {
                    i = num3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<FieldingStatsList12> {
            @Override 
            public FieldingStatsList12 map(ResponseReader responseReader) {
                return new FieldingStatsList12(responseReader.readString(FieldingStatsList12.$responseFields[0]), responseReader.readInt(FieldingStatsList12.$responseFields[1]), responseReader.readInt(FieldingStatsList12.$responseFields[2]), responseReader.readInt(FieldingStatsList12.$responseFields[3]));
            }
        }
    }

    public static class InningWisePoints12 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("inningWiseBattingPoints", "inningWiseBattingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseBowlingPoints", "inningWiseBowlingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseFieldingPoints", "inningWiseFieldingPoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Double> inningWiseBattingPoints;
        final List<Double> inningWiseBowlingPoints;
        final List<Double> inningWiseFieldingPoints;

        public InningWisePoints12(String str, List<Double> list, List<Double> list2, List<Double> list3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.inningWiseBattingPoints = list;
            this.inningWiseBowlingPoints = list2;
            this.inningWiseFieldingPoints = list3;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Double> inningWiseBattingPoints() {
            return this.inningWiseBattingPoints;
        }

        public List<Double> inningWiseBowlingPoints() {
            return this.inningWiseBowlingPoints;
        }

        public List<Double> inningWiseFieldingPoints() {
            return this.inningWiseFieldingPoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(InningWisePoints12.$responseFields[0], InningWisePoints12.this.__typename);
                    responseWriter.writeList(InningWisePoints12.$responseFields[1], InningWisePoints12.this.inningWiseBattingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints12.$responseFields[2], InningWisePoints12.this.inningWiseBowlingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints12.$responseFields[3], InningWisePoints12.this.inningWiseFieldingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "InningWisePoints12{__typename=" + this.__typename + ", inningWiseBattingPoints=" + this.inningWiseBattingPoints + ", inningWiseBowlingPoints=" + this.inningWiseBowlingPoints + ", inningWiseFieldingPoints=" + this.inningWiseFieldingPoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<Double> list;
            List<Double> list2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InningWisePoints12)) {
                return false;
            }
            InningWisePoints12 inningWisePoints12 = (InningWisePoints12) obj;
            if (this.__typename.equals(inningWisePoints12.__typename) && ((list = this.inningWiseBattingPoints) != null ? list.equals(inningWisePoints12.inningWiseBattingPoints) : inningWisePoints12.inningWiseBattingPoints == null) && ((list2 = this.inningWiseBowlingPoints) != null ? list2.equals(inningWisePoints12.inningWiseBowlingPoints) : inningWisePoints12.inningWiseBowlingPoints == null)) {
                List<Double> list3 = this.inningWiseFieldingPoints;
                List<Double> list4 = inningWisePoints12.inningWiseFieldingPoints;
                if (list3 == null) {
                    if (list4 == null) {
                        return true;
                    }
                } else if (list3.equals(list4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<Double> list = this.inningWiseBattingPoints;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Double> list2 = this.inningWiseBowlingPoints;
                int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<Double> list3 = this.inningWiseFieldingPoints;
                if (list3 != null) {
                    i = list3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<InningWisePoints12> {
            @Override 
            public InningWisePoints12 map(ResponseReader responseReader) {
                return new InningWisePoints12(responseReader.readString(InningWisePoints12.$responseFields[0]), responseReader.readList(InningWisePoints12.$responseFields[1], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints12.$responseFields[2], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints12.$responseFields[3], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }));
            }
        }
    }

    public static class RunnerBatsman3 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerNameHindi", "playerNameHindi", null, true, Collections.emptyList()), ResponseField.forString("playerTeam", "playerTeam", null, true, Collections.emptyList()), ResponseField.forString("playerTeamID", "playerTeamID", null, true, Collections.emptyList()), ResponseField.forDouble("totalBattingPoints", "totalBattingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalPoints", "totalPoints", null, true, Collections.emptyList()), ResponseField.forList("battingStatsList", "battingStatsList", null, true, Collections.emptyList()), ResponseField.forDouble("totalBowlingPoints", "totalBowlingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalFieldingPoints", "totalFieldingPoints", null, true, Collections.emptyList()), ResponseField.forList("bowlingStatsList", "bowlingStatsList", null, true, Collections.emptyList()), ResponseField.forList("fieldingStatsList", "fieldingStatsList", null, true, Collections.emptyList()), ResponseField.forObject("inningWisePoints", "inningWisePoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<BattingStatsList13> battingStatsList;
        final List<BowlingStatsList13> bowlingStatsList;
        final List<FieldingStatsList13> fieldingStatsList;
        final InningWisePoints13 inningWisePoints;
        final String playerID;
        final String playerName;
        final String playerNameHindi;
        final String playerTeam;
        final String playerTeamID;
        final Double totalBattingPoints;
        final Double totalBowlingPoints;
        final Double totalFieldingPoints;
        final Double totalPoints;

        public RunnerBatsman3(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, List<BattingStatsList13> list, Double d3, Double d4, List<BowlingStatsList13> list2, List<FieldingStatsList13> list3, InningWisePoints13 inningWisePoints13) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerName = str3;
            this.playerNameHindi = str4;
            this.playerTeam = str5;
            this.playerTeamID = str6;
            this.totalBattingPoints = d;
            this.totalPoints = d2;
            this.battingStatsList = list;
            this.totalBowlingPoints = d3;
            this.totalFieldingPoints = d4;
            this.bowlingStatsList = list2;
            this.fieldingStatsList = list3;
            this.inningWisePoints = inningWisePoints13;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerID() {
            return this.playerID;
        }

        public String playerName() {
            return this.playerName;
        }

        public String playerNameHindi() {
            return this.playerNameHindi;
        }

        public String playerTeam() {
            return this.playerTeam;
        }

        public String playerTeamID() {
            return this.playerTeamID;
        }

        public Double totalBattingPoints() {
            return this.totalBattingPoints;
        }

        public Double totalPoints() {
            return this.totalPoints;
        }

        public List<BattingStatsList13> battingStatsList() {
            return this.battingStatsList;
        }

        public Double totalBowlingPoints() {
            return this.totalBowlingPoints;
        }

        public Double totalFieldingPoints() {
            return this.totalFieldingPoints;
        }

        public List<BowlingStatsList13> bowlingStatsList() {
            return this.bowlingStatsList;
        }

        public List<FieldingStatsList13> fieldingStatsList() {
            return this.fieldingStatsList;
        }

        public InningWisePoints13 inningWisePoints() {
            return this.inningWisePoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(RunnerBatsman3.$responseFields[0], RunnerBatsman3.this.__typename);
                    responseWriter.writeString(RunnerBatsman3.$responseFields[1], RunnerBatsman3.this.playerID);
                    responseWriter.writeString(RunnerBatsman3.$responseFields[2], RunnerBatsman3.this.playerName);
                    responseWriter.writeString(RunnerBatsman3.$responseFields[3], RunnerBatsman3.this.playerNameHindi);
                    responseWriter.writeString(RunnerBatsman3.$responseFields[4], RunnerBatsman3.this.playerTeam);
                    responseWriter.writeString(RunnerBatsman3.$responseFields[5], RunnerBatsman3.this.playerTeamID);
                    responseWriter.writeDouble(RunnerBatsman3.$responseFields[6], RunnerBatsman3.this.totalBattingPoints);
                    responseWriter.writeDouble(RunnerBatsman3.$responseFields[7], RunnerBatsman3.this.totalPoints);
                    responseWriter.writeList(RunnerBatsman3.$responseFields[8], RunnerBatsman3.this.battingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BattingStatsList13) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeDouble(RunnerBatsman3.$responseFields[9], RunnerBatsman3.this.totalBowlingPoints);
                    responseWriter.writeDouble(RunnerBatsman3.$responseFields[10], RunnerBatsman3.this.totalFieldingPoints);
                    responseWriter.writeList(RunnerBatsman3.$responseFields[11], RunnerBatsman3.this.bowlingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BowlingStatsList13) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(RunnerBatsman3.$responseFields[12], RunnerBatsman3.this.fieldingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((FieldingStatsList13) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeObject(RunnerBatsman3.$responseFields[13], RunnerBatsman3.this.inningWisePoints != null ? RunnerBatsman3.this.inningWisePoints.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "RunnerBatsman3{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerNameHindi=" + this.playerNameHindi + ", playerTeam=" + this.playerTeam + ", playerTeamID=" + this.playerTeamID + ", totalBattingPoints=" + this.totalBattingPoints + ", totalPoints=" + this.totalPoints + ", battingStatsList=" + this.battingStatsList + ", totalBowlingPoints=" + this.totalBowlingPoints + ", totalFieldingPoints=" + this.totalFieldingPoints + ", bowlingStatsList=" + this.bowlingStatsList + ", fieldingStatsList=" + this.fieldingStatsList + ", inningWisePoints=" + this.inningWisePoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Double d;
            Double d2;
            List<BattingStatsList13> list;
            Double d3;
            Double d4;
            List<BowlingStatsList13> list2;
            List<FieldingStatsList13> list3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RunnerBatsman3)) {
                return false;
            }
            RunnerBatsman3 runnerBatsman3 = (RunnerBatsman3) obj;
            if (this.__typename.equals(runnerBatsman3.__typename) && ((str = this.playerID) != null ? str.equals(runnerBatsman3.playerID) : runnerBatsman3.playerID == null) && ((str2 = this.playerName) != null ? str2.equals(runnerBatsman3.playerName) : runnerBatsman3.playerName == null) && ((str3 = this.playerNameHindi) != null ? str3.equals(runnerBatsman3.playerNameHindi) : runnerBatsman3.playerNameHindi == null) && ((str4 = this.playerTeam) != null ? str4.equals(runnerBatsman3.playerTeam) : runnerBatsman3.playerTeam == null) && ((str5 = this.playerTeamID) != null ? str5.equals(runnerBatsman3.playerTeamID) : runnerBatsman3.playerTeamID == null) && ((d = this.totalBattingPoints) != null ? d.equals(runnerBatsman3.totalBattingPoints) : runnerBatsman3.totalBattingPoints == null) && ((d2 = this.totalPoints) != null ? d2.equals(runnerBatsman3.totalPoints) : runnerBatsman3.totalPoints == null) && ((list = this.battingStatsList) != null ? list.equals(runnerBatsman3.battingStatsList) : runnerBatsman3.battingStatsList == null) && ((d3 = this.totalBowlingPoints) != null ? d3.equals(runnerBatsman3.totalBowlingPoints) : runnerBatsman3.totalBowlingPoints == null) && ((d4 = this.totalFieldingPoints) != null ? d4.equals(runnerBatsman3.totalFieldingPoints) : runnerBatsman3.totalFieldingPoints == null) && ((list2 = this.bowlingStatsList) != null ? list2.equals(runnerBatsman3.bowlingStatsList) : runnerBatsman3.bowlingStatsList == null) && ((list3 = this.fieldingStatsList) != null ? list3.equals(runnerBatsman3.fieldingStatsList) : runnerBatsman3.fieldingStatsList == null)) {
                InningWisePoints13 inningWisePoints13 = this.inningWisePoints;
                InningWisePoints13 inningWisePoints132 = runnerBatsman3.inningWisePoints;
                if (inningWisePoints13 == null) {
                    if (inningWisePoints132 == null) {
                        return true;
                    }
                } else if (inningWisePoints13.equals(inningWisePoints132)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.playerID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerNameHindi;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerTeam;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerTeamID;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Double d = this.totalBattingPoints;
                int hashCode7 = (hashCode6 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.totalPoints;
                int hashCode8 = (hashCode7 ^ (d2 == null ? 0 : d2.hashCode())) * 1000003;
                List<BattingStatsList13> list = this.battingStatsList;
                int hashCode9 = (hashCode8 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                Double d3 = this.totalBowlingPoints;
                int hashCode10 = (hashCode9 ^ (d3 == null ? 0 : d3.hashCode())) * 1000003;
                Double d4 = this.totalFieldingPoints;
                int hashCode11 = (hashCode10 ^ (d4 == null ? 0 : d4.hashCode())) * 1000003;
                List<BowlingStatsList13> list2 = this.bowlingStatsList;
                int hashCode12 = (hashCode11 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<FieldingStatsList13> list3 = this.fieldingStatsList;
                int hashCode13 = (hashCode12 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                InningWisePoints13 inningWisePoints13 = this.inningWisePoints;
                if (inningWisePoints13 != null) {
                    i = inningWisePoints13.hashCode();
                }
                this.$hashCode = hashCode13 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<RunnerBatsman3> {
            final BattingStatsList13.Mapper battingStatsList13FieldMapper = new BattingStatsList13.Mapper();
            final BowlingStatsList13.Mapper bowlingStatsList13FieldMapper = new BowlingStatsList13.Mapper();
            final FieldingStatsList13.Mapper fieldingStatsList13FieldMapper = new FieldingStatsList13.Mapper();
            final InningWisePoints13.Mapper inningWisePoints13FieldMapper = new InningWisePoints13.Mapper();

            @Override 
            public RunnerBatsman3 map(ResponseReader responseReader) {
                return new RunnerBatsman3(responseReader.readString(RunnerBatsman3.$responseFields[0]), responseReader.readString(RunnerBatsman3.$responseFields[1]), responseReader.readString(RunnerBatsman3.$responseFields[2]), responseReader.readString(RunnerBatsman3.$responseFields[3]), responseReader.readString(RunnerBatsman3.$responseFields[4]), responseReader.readString(RunnerBatsman3.$responseFields[5]), responseReader.readDouble(RunnerBatsman3.$responseFields[6]), responseReader.readDouble(RunnerBatsman3.$responseFields[7]), responseReader.readList(RunnerBatsman3.$responseFields[8], new ResponseReader.ListReader<BattingStatsList13>() {


                    @Override 
                    public BattingStatsList13 read(ResponseReader.ListItemReader listItemReader) {
                        return (BattingStatsList13) listItemReader.readObject(new ResponseReader.ObjectReader<BattingStatsList13>() {


                            @Override 
                            public BattingStatsList13 read(ResponseReader responseReader) {
                                return Mapper.this.battingStatsList13FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readDouble(RunnerBatsman3.$responseFields[9]), responseReader.readDouble(RunnerBatsman3.$responseFields[10]), responseReader.readList(RunnerBatsman3.$responseFields[11], new ResponseReader.ListReader<BowlingStatsList13>() {


                    @Override 
                    public BowlingStatsList13 read(ResponseReader.ListItemReader listItemReader) {
                        return (BowlingStatsList13) listItemReader.readObject(new ResponseReader.ObjectReader<BowlingStatsList13>() {


                            @Override 
                            public BowlingStatsList13 read(ResponseReader responseReader) {
                                return Mapper.this.bowlingStatsList13FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(RunnerBatsman3.$responseFields[12], new ResponseReader.ListReader<FieldingStatsList13>() {


                    @Override 
                    public FieldingStatsList13 read(ResponseReader.ListItemReader listItemReader) {
                        return (FieldingStatsList13) listItemReader.readObject(new ResponseReader.ObjectReader<FieldingStatsList13>() {


                            @Override 
                            public FieldingStatsList13 read(ResponseReader responseReader) {
                                return Mapper.this.fieldingStatsList13FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (InningWisePoints13) responseReader.readObject(RunnerBatsman3.$responseFields[13], new ResponseReader.ObjectReader<InningWisePoints13>() {


                    @Override 
                    public InningWisePoints13 read(ResponseReader responseReader) {
                        return Mapper.this.inningWisePoints13FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class BattingStatsList13 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runs", "runs", null, true, Collections.emptyList()), ResponseField.forInt("fours", "fours", null, true, Collections.emptyList()), ResponseField.forInt("sixes", "sixes", null, true, Collections.emptyList()), ResponseField.forInt("balls", "balls", null, true, Collections.emptyList()), ResponseField.forDouble("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forBoolean("isNotOut", "isNotOut", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer balls;
        final Integer fours;
        final Boolean isNotOut;
        final Integer runs;
        final Integer sixes;
        final Double strikeRate;

        public BattingStatsList13(String str, Integer num, Integer num2, Integer num3, Integer num4, Double d, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runs = num;
            this.fours = num2;
            this.sixes = num3;
            this.balls = num4;
            this.strikeRate = d;
            this.isNotOut = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runs() {
            return this.runs;
        }

        public Integer fours() {
            return this.fours;
        }

        public Integer sixes() {
            return this.sixes;
        }

        public Integer balls() {
            return this.balls;
        }

        public Double strikeRate() {
            return this.strikeRate;
        }

        public Boolean isNotOut() {
            return this.isNotOut;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BattingStatsList13.$responseFields[0], BattingStatsList13.this.__typename);
                    responseWriter.writeInt(BattingStatsList13.$responseFields[1], BattingStatsList13.this.runs);
                    responseWriter.writeInt(BattingStatsList13.$responseFields[2], BattingStatsList13.this.fours);
                    responseWriter.writeInt(BattingStatsList13.$responseFields[3], BattingStatsList13.this.sixes);
                    responseWriter.writeInt(BattingStatsList13.$responseFields[4], BattingStatsList13.this.balls);
                    responseWriter.writeDouble(BattingStatsList13.$responseFields[5], BattingStatsList13.this.strikeRate);
                    responseWriter.writeBoolean(BattingStatsList13.$responseFields[6], BattingStatsList13.this.isNotOut);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BattingStatsList13{__typename=" + this.__typename + ", runs=" + this.runs + ", fours=" + this.fours + ", sixes=" + this.sixes + ", balls=" + this.balls + ", strikeRate=" + this.strikeRate + ", isNotOut=" + this.isNotOut + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattingStatsList13)) {
                return false;
            }
            BattingStatsList13 battingStatsList13 = (BattingStatsList13) obj;
            if (this.__typename.equals(battingStatsList13.__typename) && ((num = this.runs) != null ? num.equals(battingStatsList13.runs) : battingStatsList13.runs == null) && ((num2 = this.fours) != null ? num2.equals(battingStatsList13.fours) : battingStatsList13.fours == null) && ((num3 = this.sixes) != null ? num3.equals(battingStatsList13.sixes) : battingStatsList13.sixes == null) && ((num4 = this.balls) != null ? num4.equals(battingStatsList13.balls) : battingStatsList13.balls == null) && ((d = this.strikeRate) != null ? d.equals(battingStatsList13.strikeRate) : battingStatsList13.strikeRate == null)) {
                Boolean bool = this.isNotOut;
                Boolean bool2 = battingStatsList13.isNotOut;
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
                Integer num = this.runs;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.fours;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.sixes;
                int hashCode4 = (hashCode3 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.balls;
                int hashCode5 = (hashCode4 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Double d = this.strikeRate;
                int hashCode6 = (hashCode5 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Boolean bool = this.isNotOut;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BattingStatsList13> {
            @Override 
            public BattingStatsList13 map(ResponseReader responseReader) {
                return new BattingStatsList13(responseReader.readString(BattingStatsList13.$responseFields[0]), responseReader.readInt(BattingStatsList13.$responseFields[1]), responseReader.readInt(BattingStatsList13.$responseFields[2]), responseReader.readInt(BattingStatsList13.$responseFields[3]), responseReader.readInt(BattingStatsList13.$responseFields[4]), responseReader.readDouble(BattingStatsList13.$responseFields[5]), responseReader.readBoolean(BattingStatsList13.$responseFields[6]));
            }
        }
    }

    public static class BowlingStatsList13 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forInt("runsConceded", "runsConceded", null, true, Collections.emptyList()), ResponseField.forDouble("economyRate", "economyRate", null, true, Collections.emptyList()), ResponseField.forDouble("overs", "overs", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double economyRate;
        final Double overs;
        final Integer runsConceded;
        final Integer wickets;

        public BowlingStatsList13(String str, Integer num, Integer num2, Double d, Double d2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.wickets = num;
            this.runsConceded = num2;
            this.economyRate = d;
            this.overs = d2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer wickets() {
            return this.wickets;
        }

        public Integer runsConceded() {
            return this.runsConceded;
        }

        public Double economyRate() {
            return this.economyRate;
        }

        public Double overs() {
            return this.overs;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlingStatsList13.$responseFields[0], BowlingStatsList13.this.__typename);
                    responseWriter.writeInt(BowlingStatsList13.$responseFields[1], BowlingStatsList13.this.wickets);
                    responseWriter.writeInt(BowlingStatsList13.$responseFields[2], BowlingStatsList13.this.runsConceded);
                    responseWriter.writeDouble(BowlingStatsList13.$responseFields[3], BowlingStatsList13.this.economyRate);
                    responseWriter.writeDouble(BowlingStatsList13.$responseFields[4], BowlingStatsList13.this.overs);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlingStatsList13{__typename=" + this.__typename + ", wickets=" + this.wickets + ", runsConceded=" + this.runsConceded + ", economyRate=" + this.economyRate + ", overs=" + this.overs + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlingStatsList13)) {
                return false;
            }
            BowlingStatsList13 bowlingStatsList13 = (BowlingStatsList13) obj;
            if (this.__typename.equals(bowlingStatsList13.__typename) && ((num = this.wickets) != null ? num.equals(bowlingStatsList13.wickets) : bowlingStatsList13.wickets == null) && ((num2 = this.runsConceded) != null ? num2.equals(bowlingStatsList13.runsConceded) : bowlingStatsList13.runsConceded == null) && ((d = this.economyRate) != null ? d.equals(bowlingStatsList13.economyRate) : bowlingStatsList13.economyRate == null)) {
                Double d2 = this.overs;
                Double d3 = bowlingStatsList13.overs;
                if (d2 == null) {
                    if (d3 == null) {
                        return true;
                    }
                } else if (d2.equals(d3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.wickets;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.runsConceded;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Double d = this.economyRate;
                int hashCode4 = (hashCode3 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.overs;
                if (d2 != null) {
                    i = d2.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlingStatsList13> {
            @Override 
            public BowlingStatsList13 map(ResponseReader responseReader) {
                return new BowlingStatsList13(responseReader.readString(BowlingStatsList13.$responseFields[0]), responseReader.readInt(BowlingStatsList13.$responseFields[1]), responseReader.readInt(BowlingStatsList13.$responseFields[2]), responseReader.readDouble(BowlingStatsList13.$responseFields[3]), responseReader.readDouble(BowlingStatsList13.$responseFields[4]));
            }
        }
    }

    public static class FieldingStatsList13 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runsOuts", "runsOuts", null, true, Collections.emptyList()), ResponseField.forInt("catches", "catches", null, true, Collections.emptyList()), ResponseField.forInt("stumps", "stumps", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer catches;
        final Integer runsOuts;
        final Integer stumps;

        public FieldingStatsList13(String str, Integer num, Integer num2, Integer num3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runsOuts = num;
            this.catches = num2;
            this.stumps = num3;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runsOuts() {
            return this.runsOuts;
        }

        public Integer catches() {
            return this.catches;
        }

        public Integer stumps() {
            return this.stumps;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(FieldingStatsList13.$responseFields[0], FieldingStatsList13.this.__typename);
                    responseWriter.writeInt(FieldingStatsList13.$responseFields[1], FieldingStatsList13.this.runsOuts);
                    responseWriter.writeInt(FieldingStatsList13.$responseFields[2], FieldingStatsList13.this.catches);
                    responseWriter.writeInt(FieldingStatsList13.$responseFields[3], FieldingStatsList13.this.stumps);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FieldingStatsList13{__typename=" + this.__typename + ", runsOuts=" + this.runsOuts + ", catches=" + this.catches + ", stumps=" + this.stumps + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FieldingStatsList13)) {
                return false;
            }
            FieldingStatsList13 fieldingStatsList13 = (FieldingStatsList13) obj;
            if (this.__typename.equals(fieldingStatsList13.__typename) && ((num = this.runsOuts) != null ? num.equals(fieldingStatsList13.runsOuts) : fieldingStatsList13.runsOuts == null) && ((num2 = this.catches) != null ? num2.equals(fieldingStatsList13.catches) : fieldingStatsList13.catches == null)) {
                Integer num3 = this.stumps;
                Integer num4 = fieldingStatsList13.stumps;
                if (num3 == null) {
                    if (num4 == null) {
                        return true;
                    }
                } else if (num3.equals(num4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.runsOuts;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.catches;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.stumps;
                if (num3 != null) {
                    i = num3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<FieldingStatsList13> {
            @Override 
            public FieldingStatsList13 map(ResponseReader responseReader) {
                return new FieldingStatsList13(responseReader.readString(FieldingStatsList13.$responseFields[0]), responseReader.readInt(FieldingStatsList13.$responseFields[1]), responseReader.readInt(FieldingStatsList13.$responseFields[2]), responseReader.readInt(FieldingStatsList13.$responseFields[3]));
            }
        }
    }

    public static class InningWisePoints13 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("inningWiseBattingPoints", "inningWiseBattingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseBowlingPoints", "inningWiseBowlingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseFieldingPoints", "inningWiseFieldingPoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Double> inningWiseBattingPoints;
        final List<Double> inningWiseBowlingPoints;
        final List<Double> inningWiseFieldingPoints;

        public InningWisePoints13(String str, List<Double> list, List<Double> list2, List<Double> list3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.inningWiseBattingPoints = list;
            this.inningWiseBowlingPoints = list2;
            this.inningWiseFieldingPoints = list3;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Double> inningWiseBattingPoints() {
            return this.inningWiseBattingPoints;
        }

        public List<Double> inningWiseBowlingPoints() {
            return this.inningWiseBowlingPoints;
        }

        public List<Double> inningWiseFieldingPoints() {
            return this.inningWiseFieldingPoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(InningWisePoints13.$responseFields[0], InningWisePoints13.this.__typename);
                    responseWriter.writeList(InningWisePoints13.$responseFields[1], InningWisePoints13.this.inningWiseBattingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints13.$responseFields[2], InningWisePoints13.this.inningWiseBowlingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints13.$responseFields[3], InningWisePoints13.this.inningWiseFieldingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "InningWisePoints13{__typename=" + this.__typename + ", inningWiseBattingPoints=" + this.inningWiseBattingPoints + ", inningWiseBowlingPoints=" + this.inningWiseBowlingPoints + ", inningWiseFieldingPoints=" + this.inningWiseFieldingPoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<Double> list;
            List<Double> list2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InningWisePoints13)) {
                return false;
            }
            InningWisePoints13 inningWisePoints13 = (InningWisePoints13) obj;
            if (this.__typename.equals(inningWisePoints13.__typename) && ((list = this.inningWiseBattingPoints) != null ? list.equals(inningWisePoints13.inningWiseBattingPoints) : inningWisePoints13.inningWiseBattingPoints == null) && ((list2 = this.inningWiseBowlingPoints) != null ? list2.equals(inningWisePoints13.inningWiseBowlingPoints) : inningWisePoints13.inningWiseBowlingPoints == null)) {
                List<Double> list3 = this.inningWiseFieldingPoints;
                List<Double> list4 = inningWisePoints13.inningWiseFieldingPoints;
                if (list3 == null) {
                    if (list4 == null) {
                        return true;
                    }
                } else if (list3.equals(list4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<Double> list = this.inningWiseBattingPoints;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Double> list2 = this.inningWiseBowlingPoints;
                int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<Double> list3 = this.inningWiseFieldingPoints;
                if (list3 != null) {
                    i = list3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<InningWisePoints13> {
            @Override 
            public InningWisePoints13 map(ResponseReader responseReader) {
                return new InningWisePoints13(responseReader.readString(InningWisePoints13.$responseFields[0]), responseReader.readList(InningWisePoints13.$responseFields[1], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints13.$responseFields[2], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints13.$responseFields[3], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }));
            }
        }
    }

    public static class BowlerSummary11 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forObject("topBowler", "topBowler", null, true, Collections.emptyList()), ResponseField.forObject("runnerBowler", "runnerBowler", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final RunnerBowler2 runnerBowler;
        final TopBowler2 topBowler;

        public BowlerSummary11(String str, TopBowler2 topBowler2, RunnerBowler2 runnerBowler2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.topBowler = topBowler2;
            this.runnerBowler = runnerBowler2;
        }

        public String __typename() {
            return this.__typename;
        }

        public TopBowler2 topBowler() {
            return this.topBowler;
        }

        public RunnerBowler2 runnerBowler() {
            return this.runnerBowler;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlerSummary11.$responseFields[0], BowlerSummary11.this.__typename);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(BowlerSummary11.$responseFields[1], BowlerSummary11.this.topBowler != null ? BowlerSummary11.this.topBowler.marshaller() : null);
                    ResponseField responseField = BowlerSummary11.$responseFields[2];
                    if (BowlerSummary11.this.runnerBowler != null) {
                        responseFieldMarshaller = BowlerSummary11.this.runnerBowler.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlerSummary11{__typename=" + this.__typename + ", topBowler=" + this.topBowler + ", runnerBowler=" + this.runnerBowler + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            TopBowler2 topBowler2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlerSummary11)) {
                return false;
            }
            BowlerSummary11 bowlerSummary11 = (BowlerSummary11) obj;
            if (this.__typename.equals(bowlerSummary11.__typename) && ((topBowler2 = this.topBowler) != null ? topBowler2.equals(bowlerSummary11.topBowler) : bowlerSummary11.topBowler == null)) {
                RunnerBowler2 runnerBowler2 = this.runnerBowler;
                RunnerBowler2 runnerBowler22 = bowlerSummary11.runnerBowler;
                if (runnerBowler2 == null) {
                    if (runnerBowler22 == null) {
                        return true;
                    }
                } else if (runnerBowler2.equals(runnerBowler22)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                TopBowler2 topBowler2 = this.topBowler;
                int i = 0;
                int hashCode2 = (hashCode ^ (topBowler2 == null ? 0 : topBowler2.hashCode())) * 1000003;
                RunnerBowler2 runnerBowler2 = this.runnerBowler;
                if (runnerBowler2 != null) {
                    i = runnerBowler2.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlerSummary11> {
            final RunnerBowler2.Mapper runnerBowler2FieldMapper = new RunnerBowler2.Mapper();
            final TopBowler2.Mapper topBowler2FieldMapper = new TopBowler2.Mapper();

            @Override 
            public BowlerSummary11 map(ResponseReader responseReader) {
                return new BowlerSummary11(responseReader.readString(BowlerSummary11.$responseFields[0]), (TopBowler2) responseReader.readObject(BowlerSummary11.$responseFields[1], new ResponseReader.ObjectReader<TopBowler2>() {


                    @Override 
                    public TopBowler2 read(ResponseReader responseReader) {
                        return Mapper.this.topBowler2FieldMapper.map(responseReader);
                    }
                }), (RunnerBowler2) responseReader.readObject(BowlerSummary11.$responseFields[2], new ResponseReader.ObjectReader<RunnerBowler2>() {


                    @Override 
                    public RunnerBowler2 read(ResponseReader responseReader) {
                        return Mapper.this.runnerBowler2FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class TopBowler2 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerNameHindi", "playerNameHindi", null, true, Collections.emptyList()), ResponseField.forString("playerTeam", "playerTeam", null, true, Collections.emptyList()), ResponseField.forString("playerTeamID", "playerTeamID", null, true, Collections.emptyList()), ResponseField.forDouble("totalBattingPoints", "totalBattingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalPoints", "totalPoints", null, true, Collections.emptyList()), ResponseField.forList("battingStatsList", "battingStatsList", null, true, Collections.emptyList()), ResponseField.forDouble("totalBowlingPoints", "totalBowlingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalFieldingPoints", "totalFieldingPoints", null, true, Collections.emptyList()), ResponseField.forList("bowlingStatsList", "bowlingStatsList", null, true, Collections.emptyList()), ResponseField.forList("fieldingStatsList", "fieldingStatsList", null, true, Collections.emptyList()), ResponseField.forObject("inningWisePoints", "inningWisePoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<BattingStatsList14> battingStatsList;
        final List<BowlingStatsList14> bowlingStatsList;
        final List<FieldingStatsList14> fieldingStatsList;
        final InningWisePoints14 inningWisePoints;
        final String playerID;
        final String playerName;
        final String playerNameHindi;
        final String playerTeam;
        final String playerTeamID;
        final Double totalBattingPoints;
        final Double totalBowlingPoints;
        final Double totalFieldingPoints;
        final Double totalPoints;

        public TopBowler2(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, List<BattingStatsList14> list, Double d3, Double d4, List<BowlingStatsList14> list2, List<FieldingStatsList14> list3, InningWisePoints14 inningWisePoints14) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerName = str3;
            this.playerNameHindi = str4;
            this.playerTeam = str5;
            this.playerTeamID = str6;
            this.totalBattingPoints = d;
            this.totalPoints = d2;
            this.battingStatsList = list;
            this.totalBowlingPoints = d3;
            this.totalFieldingPoints = d4;
            this.bowlingStatsList = list2;
            this.fieldingStatsList = list3;
            this.inningWisePoints = inningWisePoints14;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerID() {
            return this.playerID;
        }

        public String playerName() {
            return this.playerName;
        }

        public String playerNameHindi() {
            return this.playerNameHindi;
        }

        public String playerTeam() {
            return this.playerTeam;
        }

        public String playerTeamID() {
            return this.playerTeamID;
        }

        public Double totalBattingPoints() {
            return this.totalBattingPoints;
        }

        public Double totalPoints() {
            return this.totalPoints;
        }

        public List<BattingStatsList14> battingStatsList() {
            return this.battingStatsList;
        }

        public Double totalBowlingPoints() {
            return this.totalBowlingPoints;
        }

        public Double totalFieldingPoints() {
            return this.totalFieldingPoints;
        }

        public List<BowlingStatsList14> bowlingStatsList() {
            return this.bowlingStatsList;
        }

        public List<FieldingStatsList14> fieldingStatsList() {
            return this.fieldingStatsList;
        }

        public InningWisePoints14 inningWisePoints() {
            return this.inningWisePoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TopBowler2.$responseFields[0], TopBowler2.this.__typename);
                    responseWriter.writeString(TopBowler2.$responseFields[1], TopBowler2.this.playerID);
                    responseWriter.writeString(TopBowler2.$responseFields[2], TopBowler2.this.playerName);
                    responseWriter.writeString(TopBowler2.$responseFields[3], TopBowler2.this.playerNameHindi);
                    responseWriter.writeString(TopBowler2.$responseFields[4], TopBowler2.this.playerTeam);
                    responseWriter.writeString(TopBowler2.$responseFields[5], TopBowler2.this.playerTeamID);
                    responseWriter.writeDouble(TopBowler2.$responseFields[6], TopBowler2.this.totalBattingPoints);
                    responseWriter.writeDouble(TopBowler2.$responseFields[7], TopBowler2.this.totalPoints);
                    responseWriter.writeList(TopBowler2.$responseFields[8], TopBowler2.this.battingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BattingStatsList14) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeDouble(TopBowler2.$responseFields[9], TopBowler2.this.totalBowlingPoints);
                    responseWriter.writeDouble(TopBowler2.$responseFields[10], TopBowler2.this.totalFieldingPoints);
                    responseWriter.writeList(TopBowler2.$responseFields[11], TopBowler2.this.bowlingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BowlingStatsList14) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(TopBowler2.$responseFields[12], TopBowler2.this.fieldingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((FieldingStatsList14) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeObject(TopBowler2.$responseFields[13], TopBowler2.this.inningWisePoints != null ? TopBowler2.this.inningWisePoints.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TopBowler2{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerNameHindi=" + this.playerNameHindi + ", playerTeam=" + this.playerTeam + ", playerTeamID=" + this.playerTeamID + ", totalBattingPoints=" + this.totalBattingPoints + ", totalPoints=" + this.totalPoints + ", battingStatsList=" + this.battingStatsList + ", totalBowlingPoints=" + this.totalBowlingPoints + ", totalFieldingPoints=" + this.totalFieldingPoints + ", bowlingStatsList=" + this.bowlingStatsList + ", fieldingStatsList=" + this.fieldingStatsList + ", inningWisePoints=" + this.inningWisePoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Double d;
            Double d2;
            List<BattingStatsList14> list;
            Double d3;
            Double d4;
            List<BowlingStatsList14> list2;
            List<FieldingStatsList14> list3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TopBowler2)) {
                return false;
            }
            TopBowler2 topBowler2 = (TopBowler2) obj;
            if (this.__typename.equals(topBowler2.__typename) && ((str = this.playerID) != null ? str.equals(topBowler2.playerID) : topBowler2.playerID == null) && ((str2 = this.playerName) != null ? str2.equals(topBowler2.playerName) : topBowler2.playerName == null) && ((str3 = this.playerNameHindi) != null ? str3.equals(topBowler2.playerNameHindi) : topBowler2.playerNameHindi == null) && ((str4 = this.playerTeam) != null ? str4.equals(topBowler2.playerTeam) : topBowler2.playerTeam == null) && ((str5 = this.playerTeamID) != null ? str5.equals(topBowler2.playerTeamID) : topBowler2.playerTeamID == null) && ((d = this.totalBattingPoints) != null ? d.equals(topBowler2.totalBattingPoints) : topBowler2.totalBattingPoints == null) && ((d2 = this.totalPoints) != null ? d2.equals(topBowler2.totalPoints) : topBowler2.totalPoints == null) && ((list = this.battingStatsList) != null ? list.equals(topBowler2.battingStatsList) : topBowler2.battingStatsList == null) && ((d3 = this.totalBowlingPoints) != null ? d3.equals(topBowler2.totalBowlingPoints) : topBowler2.totalBowlingPoints == null) && ((d4 = this.totalFieldingPoints) != null ? d4.equals(topBowler2.totalFieldingPoints) : topBowler2.totalFieldingPoints == null) && ((list2 = this.bowlingStatsList) != null ? list2.equals(topBowler2.bowlingStatsList) : topBowler2.bowlingStatsList == null) && ((list3 = this.fieldingStatsList) != null ? list3.equals(topBowler2.fieldingStatsList) : topBowler2.fieldingStatsList == null)) {
                InningWisePoints14 inningWisePoints14 = this.inningWisePoints;
                InningWisePoints14 inningWisePoints142 = topBowler2.inningWisePoints;
                if (inningWisePoints14 == null) {
                    if (inningWisePoints142 == null) {
                        return true;
                    }
                } else if (inningWisePoints14.equals(inningWisePoints142)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.playerID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerNameHindi;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerTeam;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerTeamID;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Double d = this.totalBattingPoints;
                int hashCode7 = (hashCode6 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.totalPoints;
                int hashCode8 = (hashCode7 ^ (d2 == null ? 0 : d2.hashCode())) * 1000003;
                List<BattingStatsList14> list = this.battingStatsList;
                int hashCode9 = (hashCode8 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                Double d3 = this.totalBowlingPoints;
                int hashCode10 = (hashCode9 ^ (d3 == null ? 0 : d3.hashCode())) * 1000003;
                Double d4 = this.totalFieldingPoints;
                int hashCode11 = (hashCode10 ^ (d4 == null ? 0 : d4.hashCode())) * 1000003;
                List<BowlingStatsList14> list2 = this.bowlingStatsList;
                int hashCode12 = (hashCode11 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<FieldingStatsList14> list3 = this.fieldingStatsList;
                int hashCode13 = (hashCode12 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                InningWisePoints14 inningWisePoints14 = this.inningWisePoints;
                if (inningWisePoints14 != null) {
                    i = inningWisePoints14.hashCode();
                }
                this.$hashCode = hashCode13 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TopBowler2> {
            final BattingStatsList14.Mapper battingStatsList14FieldMapper = new BattingStatsList14.Mapper();
            final BowlingStatsList14.Mapper bowlingStatsList14FieldMapper = new BowlingStatsList14.Mapper();
            final FieldingStatsList14.Mapper fieldingStatsList14FieldMapper = new FieldingStatsList14.Mapper();
            final InningWisePoints14.Mapper inningWisePoints14FieldMapper = new InningWisePoints14.Mapper();

            @Override 
            public TopBowler2 map(ResponseReader responseReader) {
                return new TopBowler2(responseReader.readString(TopBowler2.$responseFields[0]), responseReader.readString(TopBowler2.$responseFields[1]), responseReader.readString(TopBowler2.$responseFields[2]), responseReader.readString(TopBowler2.$responseFields[3]), responseReader.readString(TopBowler2.$responseFields[4]), responseReader.readString(TopBowler2.$responseFields[5]), responseReader.readDouble(TopBowler2.$responseFields[6]), responseReader.readDouble(TopBowler2.$responseFields[7]), responseReader.readList(TopBowler2.$responseFields[8], new ResponseReader.ListReader<BattingStatsList14>() {


                    @Override 
                    public BattingStatsList14 read(ResponseReader.ListItemReader listItemReader) {
                        return (BattingStatsList14) listItemReader.readObject(new ResponseReader.ObjectReader<BattingStatsList14>() {


                            @Override 
                            public BattingStatsList14 read(ResponseReader responseReader) {
                                return Mapper.this.battingStatsList14FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readDouble(TopBowler2.$responseFields[9]), responseReader.readDouble(TopBowler2.$responseFields[10]), responseReader.readList(TopBowler2.$responseFields[11], new ResponseReader.ListReader<BowlingStatsList14>() {


                    @Override 
                    public BowlingStatsList14 read(ResponseReader.ListItemReader listItemReader) {
                        return (BowlingStatsList14) listItemReader.readObject(new ResponseReader.ObjectReader<BowlingStatsList14>() {


                            @Override 
                            public BowlingStatsList14 read(ResponseReader responseReader) {
                                return Mapper.this.bowlingStatsList14FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(TopBowler2.$responseFields[12], new ResponseReader.ListReader<FieldingStatsList14>() {


                    @Override 
                    public FieldingStatsList14 read(ResponseReader.ListItemReader listItemReader) {
                        return (FieldingStatsList14) listItemReader.readObject(new ResponseReader.ObjectReader<FieldingStatsList14>() {


                            @Override 
                            public FieldingStatsList14 read(ResponseReader responseReader) {
                                return Mapper.this.fieldingStatsList14FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (InningWisePoints14) responseReader.readObject(TopBowler2.$responseFields[13], new ResponseReader.ObjectReader<InningWisePoints14>() {


                    @Override 
                    public InningWisePoints14 read(ResponseReader responseReader) {
                        return Mapper.this.inningWisePoints14FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class BattingStatsList14 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runs", "runs", null, true, Collections.emptyList()), ResponseField.forInt("fours", "fours", null, true, Collections.emptyList()), ResponseField.forInt("sixes", "sixes", null, true, Collections.emptyList()), ResponseField.forInt("balls", "balls", null, true, Collections.emptyList()), ResponseField.forDouble("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forBoolean("isNotOut", "isNotOut", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer balls;
        final Integer fours;
        final Boolean isNotOut;
        final Integer runs;
        final Integer sixes;
        final Double strikeRate;

        public BattingStatsList14(String str, Integer num, Integer num2, Integer num3, Integer num4, Double d, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runs = num;
            this.fours = num2;
            this.sixes = num3;
            this.balls = num4;
            this.strikeRate = d;
            this.isNotOut = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runs() {
            return this.runs;
        }

        public Integer fours() {
            return this.fours;
        }

        public Integer sixes() {
            return this.sixes;
        }

        public Integer balls() {
            return this.balls;
        }

        public Double strikeRate() {
            return this.strikeRate;
        }

        public Boolean isNotOut() {
            return this.isNotOut;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BattingStatsList14.$responseFields[0], BattingStatsList14.this.__typename);
                    responseWriter.writeInt(BattingStatsList14.$responseFields[1], BattingStatsList14.this.runs);
                    responseWriter.writeInt(BattingStatsList14.$responseFields[2], BattingStatsList14.this.fours);
                    responseWriter.writeInt(BattingStatsList14.$responseFields[3], BattingStatsList14.this.sixes);
                    responseWriter.writeInt(BattingStatsList14.$responseFields[4], BattingStatsList14.this.balls);
                    responseWriter.writeDouble(BattingStatsList14.$responseFields[5], BattingStatsList14.this.strikeRate);
                    responseWriter.writeBoolean(BattingStatsList14.$responseFields[6], BattingStatsList14.this.isNotOut);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BattingStatsList14{__typename=" + this.__typename + ", runs=" + this.runs + ", fours=" + this.fours + ", sixes=" + this.sixes + ", balls=" + this.balls + ", strikeRate=" + this.strikeRate + ", isNotOut=" + this.isNotOut + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattingStatsList14)) {
                return false;
            }
            BattingStatsList14 battingStatsList14 = (BattingStatsList14) obj;
            if (this.__typename.equals(battingStatsList14.__typename) && ((num = this.runs) != null ? num.equals(battingStatsList14.runs) : battingStatsList14.runs == null) && ((num2 = this.fours) != null ? num2.equals(battingStatsList14.fours) : battingStatsList14.fours == null) && ((num3 = this.sixes) != null ? num3.equals(battingStatsList14.sixes) : battingStatsList14.sixes == null) && ((num4 = this.balls) != null ? num4.equals(battingStatsList14.balls) : battingStatsList14.balls == null) && ((d = this.strikeRate) != null ? d.equals(battingStatsList14.strikeRate) : battingStatsList14.strikeRate == null)) {
                Boolean bool = this.isNotOut;
                Boolean bool2 = battingStatsList14.isNotOut;
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
                Integer num = this.runs;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.fours;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.sixes;
                int hashCode4 = (hashCode3 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.balls;
                int hashCode5 = (hashCode4 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Double d = this.strikeRate;
                int hashCode6 = (hashCode5 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Boolean bool = this.isNotOut;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BattingStatsList14> {
            @Override 
            public BattingStatsList14 map(ResponseReader responseReader) {
                return new BattingStatsList14(responseReader.readString(BattingStatsList14.$responseFields[0]), responseReader.readInt(BattingStatsList14.$responseFields[1]), responseReader.readInt(BattingStatsList14.$responseFields[2]), responseReader.readInt(BattingStatsList14.$responseFields[3]), responseReader.readInt(BattingStatsList14.$responseFields[4]), responseReader.readDouble(BattingStatsList14.$responseFields[5]), responseReader.readBoolean(BattingStatsList14.$responseFields[6]));
            }
        }
    }

    public static class BowlingStatsList14 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forInt("runsConceded", "runsConceded", null, true, Collections.emptyList()), ResponseField.forDouble("economyRate", "economyRate", null, true, Collections.emptyList()), ResponseField.forDouble("overs", "overs", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double economyRate;
        final Double overs;
        final Integer runsConceded;
        final Integer wickets;

        public BowlingStatsList14(String str, Integer num, Integer num2, Double d, Double d2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.wickets = num;
            this.runsConceded = num2;
            this.economyRate = d;
            this.overs = d2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer wickets() {
            return this.wickets;
        }

        public Integer runsConceded() {
            return this.runsConceded;
        }

        public Double economyRate() {
            return this.economyRate;
        }

        public Double overs() {
            return this.overs;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlingStatsList14.$responseFields[0], BowlingStatsList14.this.__typename);
                    responseWriter.writeInt(BowlingStatsList14.$responseFields[1], BowlingStatsList14.this.wickets);
                    responseWriter.writeInt(BowlingStatsList14.$responseFields[2], BowlingStatsList14.this.runsConceded);
                    responseWriter.writeDouble(BowlingStatsList14.$responseFields[3], BowlingStatsList14.this.economyRate);
                    responseWriter.writeDouble(BowlingStatsList14.$responseFields[4], BowlingStatsList14.this.overs);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlingStatsList14{__typename=" + this.__typename + ", wickets=" + this.wickets + ", runsConceded=" + this.runsConceded + ", economyRate=" + this.economyRate + ", overs=" + this.overs + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlingStatsList14)) {
                return false;
            }
            BowlingStatsList14 bowlingStatsList14 = (BowlingStatsList14) obj;
            if (this.__typename.equals(bowlingStatsList14.__typename) && ((num = this.wickets) != null ? num.equals(bowlingStatsList14.wickets) : bowlingStatsList14.wickets == null) && ((num2 = this.runsConceded) != null ? num2.equals(bowlingStatsList14.runsConceded) : bowlingStatsList14.runsConceded == null) && ((d = this.economyRate) != null ? d.equals(bowlingStatsList14.economyRate) : bowlingStatsList14.economyRate == null)) {
                Double d2 = this.overs;
                Double d3 = bowlingStatsList14.overs;
                if (d2 == null) {
                    if (d3 == null) {
                        return true;
                    }
                } else if (d2.equals(d3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.wickets;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.runsConceded;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Double d = this.economyRate;
                int hashCode4 = (hashCode3 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.overs;
                if (d2 != null) {
                    i = d2.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlingStatsList14> {
            @Override 
            public BowlingStatsList14 map(ResponseReader responseReader) {
                return new BowlingStatsList14(responseReader.readString(BowlingStatsList14.$responseFields[0]), responseReader.readInt(BowlingStatsList14.$responseFields[1]), responseReader.readInt(BowlingStatsList14.$responseFields[2]), responseReader.readDouble(BowlingStatsList14.$responseFields[3]), responseReader.readDouble(BowlingStatsList14.$responseFields[4]));
            }
        }
    }

    public static class FieldingStatsList14 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runsOuts", "runsOuts", null, true, Collections.emptyList()), ResponseField.forInt("catches", "catches", null, true, Collections.emptyList()), ResponseField.forInt("stumps", "stumps", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer catches;
        final Integer runsOuts;
        final Integer stumps;

        public FieldingStatsList14(String str, Integer num, Integer num2, Integer num3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runsOuts = num;
            this.catches = num2;
            this.stumps = num3;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runsOuts() {
            return this.runsOuts;
        }

        public Integer catches() {
            return this.catches;
        }

        public Integer stumps() {
            return this.stumps;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(FieldingStatsList14.$responseFields[0], FieldingStatsList14.this.__typename);
                    responseWriter.writeInt(FieldingStatsList14.$responseFields[1], FieldingStatsList14.this.runsOuts);
                    responseWriter.writeInt(FieldingStatsList14.$responseFields[2], FieldingStatsList14.this.catches);
                    responseWriter.writeInt(FieldingStatsList14.$responseFields[3], FieldingStatsList14.this.stumps);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FieldingStatsList14{__typename=" + this.__typename + ", runsOuts=" + this.runsOuts + ", catches=" + this.catches + ", stumps=" + this.stumps + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FieldingStatsList14)) {
                return false;
            }
            FieldingStatsList14 fieldingStatsList14 = (FieldingStatsList14) obj;
            if (this.__typename.equals(fieldingStatsList14.__typename) && ((num = this.runsOuts) != null ? num.equals(fieldingStatsList14.runsOuts) : fieldingStatsList14.runsOuts == null) && ((num2 = this.catches) != null ? num2.equals(fieldingStatsList14.catches) : fieldingStatsList14.catches == null)) {
                Integer num3 = this.stumps;
                Integer num4 = fieldingStatsList14.stumps;
                if (num3 == null) {
                    if (num4 == null) {
                        return true;
                    }
                } else if (num3.equals(num4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.runsOuts;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.catches;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.stumps;
                if (num3 != null) {
                    i = num3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<FieldingStatsList14> {
            @Override 
            public FieldingStatsList14 map(ResponseReader responseReader) {
                return new FieldingStatsList14(responseReader.readString(FieldingStatsList14.$responseFields[0]), responseReader.readInt(FieldingStatsList14.$responseFields[1]), responseReader.readInt(FieldingStatsList14.$responseFields[2]), responseReader.readInt(FieldingStatsList14.$responseFields[3]));
            }
        }
    }

    public static class InningWisePoints14 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("inningWiseBattingPoints", "inningWiseBattingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseBowlingPoints", "inningWiseBowlingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseFieldingPoints", "inningWiseFieldingPoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Double> inningWiseBattingPoints;
        final List<Double> inningWiseBowlingPoints;
        final List<Double> inningWiseFieldingPoints;

        public InningWisePoints14(String str, List<Double> list, List<Double> list2, List<Double> list3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.inningWiseBattingPoints = list;
            this.inningWiseBowlingPoints = list2;
            this.inningWiseFieldingPoints = list3;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Double> inningWiseBattingPoints() {
            return this.inningWiseBattingPoints;
        }

        public List<Double> inningWiseBowlingPoints() {
            return this.inningWiseBowlingPoints;
        }

        public List<Double> inningWiseFieldingPoints() {
            return this.inningWiseFieldingPoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(InningWisePoints14.$responseFields[0], InningWisePoints14.this.__typename);
                    responseWriter.writeList(InningWisePoints14.$responseFields[1], InningWisePoints14.this.inningWiseBattingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints14.$responseFields[2], InningWisePoints14.this.inningWiseBowlingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints14.$responseFields[3], InningWisePoints14.this.inningWiseFieldingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "InningWisePoints14{__typename=" + this.__typename + ", inningWiseBattingPoints=" + this.inningWiseBattingPoints + ", inningWiseBowlingPoints=" + this.inningWiseBowlingPoints + ", inningWiseFieldingPoints=" + this.inningWiseFieldingPoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<Double> list;
            List<Double> list2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InningWisePoints14)) {
                return false;
            }
            InningWisePoints14 inningWisePoints14 = (InningWisePoints14) obj;
            if (this.__typename.equals(inningWisePoints14.__typename) && ((list = this.inningWiseBattingPoints) != null ? list.equals(inningWisePoints14.inningWiseBattingPoints) : inningWisePoints14.inningWiseBattingPoints == null) && ((list2 = this.inningWiseBowlingPoints) != null ? list2.equals(inningWisePoints14.inningWiseBowlingPoints) : inningWisePoints14.inningWiseBowlingPoints == null)) {
                List<Double> list3 = this.inningWiseFieldingPoints;
                List<Double> list4 = inningWisePoints14.inningWiseFieldingPoints;
                if (list3 == null) {
                    if (list4 == null) {
                        return true;
                    }
                } else if (list3.equals(list4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<Double> list = this.inningWiseBattingPoints;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Double> list2 = this.inningWiseBowlingPoints;
                int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<Double> list3 = this.inningWiseFieldingPoints;
                if (list3 != null) {
                    i = list3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<InningWisePoints14> {
            @Override 
            public InningWisePoints14 map(ResponseReader responseReader) {
                return new InningWisePoints14(responseReader.readString(InningWisePoints14.$responseFields[0]), responseReader.readList(InningWisePoints14.$responseFields[1], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints14.$responseFields[2], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints14.$responseFields[3], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }));
            }
        }
    }

    public static class RunnerBowler2 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerNameHindi", "playerNameHindi", null, true, Collections.emptyList()), ResponseField.forString("playerTeam", "playerTeam", null, true, Collections.emptyList()), ResponseField.forString("playerTeamID", "playerTeamID", null, true, Collections.emptyList()), ResponseField.forDouble("totalBattingPoints", "totalBattingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalPoints", "totalPoints", null, true, Collections.emptyList()), ResponseField.forList("battingStatsList", "battingStatsList", null, true, Collections.emptyList()), ResponseField.forDouble("totalBowlingPoints", "totalBowlingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalFieldingPoints", "totalFieldingPoints", null, true, Collections.emptyList()), ResponseField.forList("bowlingStatsList", "bowlingStatsList", null, true, Collections.emptyList()), ResponseField.forList("fieldingStatsList", "fieldingStatsList", null, true, Collections.emptyList()), ResponseField.forObject("inningWisePoints", "inningWisePoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<BattingStatsList15> battingStatsList;
        final List<BowlingStatsList15> bowlingStatsList;
        final List<FieldingStatsList15> fieldingStatsList;
        final InningWisePoints15 inningWisePoints;
        final String playerID;
        final String playerName;
        final String playerNameHindi;
        final String playerTeam;
        final String playerTeamID;
        final Double totalBattingPoints;
        final Double totalBowlingPoints;
        final Double totalFieldingPoints;
        final Double totalPoints;

        public RunnerBowler2(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, List<BattingStatsList15> list, Double d3, Double d4, List<BowlingStatsList15> list2, List<FieldingStatsList15> list3, InningWisePoints15 inningWisePoints15) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerName = str3;
            this.playerNameHindi = str4;
            this.playerTeam = str5;
            this.playerTeamID = str6;
            this.totalBattingPoints = d;
            this.totalPoints = d2;
            this.battingStatsList = list;
            this.totalBowlingPoints = d3;
            this.totalFieldingPoints = d4;
            this.bowlingStatsList = list2;
            this.fieldingStatsList = list3;
            this.inningWisePoints = inningWisePoints15;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerID() {
            return this.playerID;
        }

        public String playerName() {
            return this.playerName;
        }

        public String playerNameHindi() {
            return this.playerNameHindi;
        }

        public String playerTeam() {
            return this.playerTeam;
        }

        public String playerTeamID() {
            return this.playerTeamID;
        }

        public Double totalBattingPoints() {
            return this.totalBattingPoints;
        }

        public Double totalPoints() {
            return this.totalPoints;
        }

        public List<BattingStatsList15> battingStatsList() {
            return this.battingStatsList;
        }

        public Double totalBowlingPoints() {
            return this.totalBowlingPoints;
        }

        public Double totalFieldingPoints() {
            return this.totalFieldingPoints;
        }

        public List<BowlingStatsList15> bowlingStatsList() {
            return this.bowlingStatsList;
        }

        public List<FieldingStatsList15> fieldingStatsList() {
            return this.fieldingStatsList;
        }

        public InningWisePoints15 inningWisePoints() {
            return this.inningWisePoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(RunnerBowler2.$responseFields[0], RunnerBowler2.this.__typename);
                    responseWriter.writeString(RunnerBowler2.$responseFields[1], RunnerBowler2.this.playerID);
                    responseWriter.writeString(RunnerBowler2.$responseFields[2], RunnerBowler2.this.playerName);
                    responseWriter.writeString(RunnerBowler2.$responseFields[3], RunnerBowler2.this.playerNameHindi);
                    responseWriter.writeString(RunnerBowler2.$responseFields[4], RunnerBowler2.this.playerTeam);
                    responseWriter.writeString(RunnerBowler2.$responseFields[5], RunnerBowler2.this.playerTeamID);
                    responseWriter.writeDouble(RunnerBowler2.$responseFields[6], RunnerBowler2.this.totalBattingPoints);
                    responseWriter.writeDouble(RunnerBowler2.$responseFields[7], RunnerBowler2.this.totalPoints);
                    responseWriter.writeList(RunnerBowler2.$responseFields[8], RunnerBowler2.this.battingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BattingStatsList15) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeDouble(RunnerBowler2.$responseFields[9], RunnerBowler2.this.totalBowlingPoints);
                    responseWriter.writeDouble(RunnerBowler2.$responseFields[10], RunnerBowler2.this.totalFieldingPoints);
                    responseWriter.writeList(RunnerBowler2.$responseFields[11], RunnerBowler2.this.bowlingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BowlingStatsList15) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(RunnerBowler2.$responseFields[12], RunnerBowler2.this.fieldingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((FieldingStatsList15) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeObject(RunnerBowler2.$responseFields[13], RunnerBowler2.this.inningWisePoints != null ? RunnerBowler2.this.inningWisePoints.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "RunnerBowler2{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerNameHindi=" + this.playerNameHindi + ", playerTeam=" + this.playerTeam + ", playerTeamID=" + this.playerTeamID + ", totalBattingPoints=" + this.totalBattingPoints + ", totalPoints=" + this.totalPoints + ", battingStatsList=" + this.battingStatsList + ", totalBowlingPoints=" + this.totalBowlingPoints + ", totalFieldingPoints=" + this.totalFieldingPoints + ", bowlingStatsList=" + this.bowlingStatsList + ", fieldingStatsList=" + this.fieldingStatsList + ", inningWisePoints=" + this.inningWisePoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Double d;
            Double d2;
            List<BattingStatsList15> list;
            Double d3;
            Double d4;
            List<BowlingStatsList15> list2;
            List<FieldingStatsList15> list3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RunnerBowler2)) {
                return false;
            }
            RunnerBowler2 runnerBowler2 = (RunnerBowler2) obj;
            if (this.__typename.equals(runnerBowler2.__typename) && ((str = this.playerID) != null ? str.equals(runnerBowler2.playerID) : runnerBowler2.playerID == null) && ((str2 = this.playerName) != null ? str2.equals(runnerBowler2.playerName) : runnerBowler2.playerName == null) && ((str3 = this.playerNameHindi) != null ? str3.equals(runnerBowler2.playerNameHindi) : runnerBowler2.playerNameHindi == null) && ((str4 = this.playerTeam) != null ? str4.equals(runnerBowler2.playerTeam) : runnerBowler2.playerTeam == null) && ((str5 = this.playerTeamID) != null ? str5.equals(runnerBowler2.playerTeamID) : runnerBowler2.playerTeamID == null) && ((d = this.totalBattingPoints) != null ? d.equals(runnerBowler2.totalBattingPoints) : runnerBowler2.totalBattingPoints == null) && ((d2 = this.totalPoints) != null ? d2.equals(runnerBowler2.totalPoints) : runnerBowler2.totalPoints == null) && ((list = this.battingStatsList) != null ? list.equals(runnerBowler2.battingStatsList) : runnerBowler2.battingStatsList == null) && ((d3 = this.totalBowlingPoints) != null ? d3.equals(runnerBowler2.totalBowlingPoints) : runnerBowler2.totalBowlingPoints == null) && ((d4 = this.totalFieldingPoints) != null ? d4.equals(runnerBowler2.totalFieldingPoints) : runnerBowler2.totalFieldingPoints == null) && ((list2 = this.bowlingStatsList) != null ? list2.equals(runnerBowler2.bowlingStatsList) : runnerBowler2.bowlingStatsList == null) && ((list3 = this.fieldingStatsList) != null ? list3.equals(runnerBowler2.fieldingStatsList) : runnerBowler2.fieldingStatsList == null)) {
                InningWisePoints15 inningWisePoints15 = this.inningWisePoints;
                InningWisePoints15 inningWisePoints152 = runnerBowler2.inningWisePoints;
                if (inningWisePoints15 == null) {
                    if (inningWisePoints152 == null) {
                        return true;
                    }
                } else if (inningWisePoints15.equals(inningWisePoints152)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.playerID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerNameHindi;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerTeam;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerTeamID;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Double d = this.totalBattingPoints;
                int hashCode7 = (hashCode6 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.totalPoints;
                int hashCode8 = (hashCode7 ^ (d2 == null ? 0 : d2.hashCode())) * 1000003;
                List<BattingStatsList15> list = this.battingStatsList;
                int hashCode9 = (hashCode8 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                Double d3 = this.totalBowlingPoints;
                int hashCode10 = (hashCode9 ^ (d3 == null ? 0 : d3.hashCode())) * 1000003;
                Double d4 = this.totalFieldingPoints;
                int hashCode11 = (hashCode10 ^ (d4 == null ? 0 : d4.hashCode())) * 1000003;
                List<BowlingStatsList15> list2 = this.bowlingStatsList;
                int hashCode12 = (hashCode11 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<FieldingStatsList15> list3 = this.fieldingStatsList;
                int hashCode13 = (hashCode12 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                InningWisePoints15 inningWisePoints15 = this.inningWisePoints;
                if (inningWisePoints15 != null) {
                    i = inningWisePoints15.hashCode();
                }
                this.$hashCode = hashCode13 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<RunnerBowler2> {
            final BattingStatsList15.Mapper battingStatsList15FieldMapper = new BattingStatsList15.Mapper();
            final BowlingStatsList15.Mapper bowlingStatsList15FieldMapper = new BowlingStatsList15.Mapper();
            final FieldingStatsList15.Mapper fieldingStatsList15FieldMapper = new FieldingStatsList15.Mapper();
            final InningWisePoints15.Mapper inningWisePoints15FieldMapper = new InningWisePoints15.Mapper();

            @Override 
            public RunnerBowler2 map(ResponseReader responseReader) {
                return new RunnerBowler2(responseReader.readString(RunnerBowler2.$responseFields[0]), responseReader.readString(RunnerBowler2.$responseFields[1]), responseReader.readString(RunnerBowler2.$responseFields[2]), responseReader.readString(RunnerBowler2.$responseFields[3]), responseReader.readString(RunnerBowler2.$responseFields[4]), responseReader.readString(RunnerBowler2.$responseFields[5]), responseReader.readDouble(RunnerBowler2.$responseFields[6]), responseReader.readDouble(RunnerBowler2.$responseFields[7]), responseReader.readList(RunnerBowler2.$responseFields[8], new ResponseReader.ListReader<BattingStatsList15>() {


                    @Override 
                    public BattingStatsList15 read(ResponseReader.ListItemReader listItemReader) {
                        return (BattingStatsList15) listItemReader.readObject(new ResponseReader.ObjectReader<BattingStatsList15>() {


                            @Override 
                            public BattingStatsList15 read(ResponseReader responseReader) {
                                return Mapper.this.battingStatsList15FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readDouble(RunnerBowler2.$responseFields[9]), responseReader.readDouble(RunnerBowler2.$responseFields[10]), responseReader.readList(RunnerBowler2.$responseFields[11], new ResponseReader.ListReader<BowlingStatsList15>() {


                    @Override 
                    public BowlingStatsList15 read(ResponseReader.ListItemReader listItemReader) {
                        return (BowlingStatsList15) listItemReader.readObject(new ResponseReader.ObjectReader<BowlingStatsList15>() {


                            @Override 
                            public BowlingStatsList15 read(ResponseReader responseReader) {
                                return Mapper.this.bowlingStatsList15FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(RunnerBowler2.$responseFields[12], new ResponseReader.ListReader<FieldingStatsList15>() {


                    @Override 
                    public FieldingStatsList15 read(ResponseReader.ListItemReader listItemReader) {
                        return (FieldingStatsList15) listItemReader.readObject(new ResponseReader.ObjectReader<FieldingStatsList15>() {


                            @Override 
                            public FieldingStatsList15 read(ResponseReader responseReader) {
                                return Mapper.this.fieldingStatsList15FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (InningWisePoints15) responseReader.readObject(RunnerBowler2.$responseFields[13], new ResponseReader.ObjectReader<InningWisePoints15>() {


                    @Override 
                    public InningWisePoints15 read(ResponseReader responseReader) {
                        return Mapper.this.inningWisePoints15FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class BattingStatsList15 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runs", "runs", null, true, Collections.emptyList()), ResponseField.forInt("fours", "fours", null, true, Collections.emptyList()), ResponseField.forInt("sixes", "sixes", null, true, Collections.emptyList()), ResponseField.forInt("balls", "balls", null, true, Collections.emptyList()), ResponseField.forDouble("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forBoolean("isNotOut", "isNotOut", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer balls;
        final Integer fours;
        final Boolean isNotOut;
        final Integer runs;
        final Integer sixes;
        final Double strikeRate;

        public BattingStatsList15(String str, Integer num, Integer num2, Integer num3, Integer num4, Double d, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runs = num;
            this.fours = num2;
            this.sixes = num3;
            this.balls = num4;
            this.strikeRate = d;
            this.isNotOut = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runs() {
            return this.runs;
        }

        public Integer fours() {
            return this.fours;
        }

        public Integer sixes() {
            return this.sixes;
        }

        public Integer balls() {
            return this.balls;
        }

        public Double strikeRate() {
            return this.strikeRate;
        }

        public Boolean isNotOut() {
            return this.isNotOut;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BattingStatsList15.$responseFields[0], BattingStatsList15.this.__typename);
                    responseWriter.writeInt(BattingStatsList15.$responseFields[1], BattingStatsList15.this.runs);
                    responseWriter.writeInt(BattingStatsList15.$responseFields[2], BattingStatsList15.this.fours);
                    responseWriter.writeInt(BattingStatsList15.$responseFields[3], BattingStatsList15.this.sixes);
                    responseWriter.writeInt(BattingStatsList15.$responseFields[4], BattingStatsList15.this.balls);
                    responseWriter.writeDouble(BattingStatsList15.$responseFields[5], BattingStatsList15.this.strikeRate);
                    responseWriter.writeBoolean(BattingStatsList15.$responseFields[6], BattingStatsList15.this.isNotOut);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BattingStatsList15{__typename=" + this.__typename + ", runs=" + this.runs + ", fours=" + this.fours + ", sixes=" + this.sixes + ", balls=" + this.balls + ", strikeRate=" + this.strikeRate + ", isNotOut=" + this.isNotOut + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattingStatsList15)) {
                return false;
            }
            BattingStatsList15 battingStatsList15 = (BattingStatsList15) obj;
            if (this.__typename.equals(battingStatsList15.__typename) && ((num = this.runs) != null ? num.equals(battingStatsList15.runs) : battingStatsList15.runs == null) && ((num2 = this.fours) != null ? num2.equals(battingStatsList15.fours) : battingStatsList15.fours == null) && ((num3 = this.sixes) != null ? num3.equals(battingStatsList15.sixes) : battingStatsList15.sixes == null) && ((num4 = this.balls) != null ? num4.equals(battingStatsList15.balls) : battingStatsList15.balls == null) && ((d = this.strikeRate) != null ? d.equals(battingStatsList15.strikeRate) : battingStatsList15.strikeRate == null)) {
                Boolean bool = this.isNotOut;
                Boolean bool2 = battingStatsList15.isNotOut;
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
                Integer num = this.runs;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.fours;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.sixes;
                int hashCode4 = (hashCode3 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.balls;
                int hashCode5 = (hashCode4 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Double d = this.strikeRate;
                int hashCode6 = (hashCode5 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Boolean bool = this.isNotOut;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BattingStatsList15> {
            @Override 
            public BattingStatsList15 map(ResponseReader responseReader) {
                return new BattingStatsList15(responseReader.readString(BattingStatsList15.$responseFields[0]), responseReader.readInt(BattingStatsList15.$responseFields[1]), responseReader.readInt(BattingStatsList15.$responseFields[2]), responseReader.readInt(BattingStatsList15.$responseFields[3]), responseReader.readInt(BattingStatsList15.$responseFields[4]), responseReader.readDouble(BattingStatsList15.$responseFields[5]), responseReader.readBoolean(BattingStatsList15.$responseFields[6]));
            }
        }
    }

    public static class BowlingStatsList15 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forInt("runsConceded", "runsConceded", null, true, Collections.emptyList()), ResponseField.forDouble("economyRate", "economyRate", null, true, Collections.emptyList()), ResponseField.forDouble("overs", "overs", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double economyRate;
        final Double overs;
        final Integer runsConceded;
        final Integer wickets;

        public BowlingStatsList15(String str, Integer num, Integer num2, Double d, Double d2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.wickets = num;
            this.runsConceded = num2;
            this.economyRate = d;
            this.overs = d2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer wickets() {
            return this.wickets;
        }

        public Integer runsConceded() {
            return this.runsConceded;
        }

        public Double economyRate() {
            return this.economyRate;
        }

        public Double overs() {
            return this.overs;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlingStatsList15.$responseFields[0], BowlingStatsList15.this.__typename);
                    responseWriter.writeInt(BowlingStatsList15.$responseFields[1], BowlingStatsList15.this.wickets);
                    responseWriter.writeInt(BowlingStatsList15.$responseFields[2], BowlingStatsList15.this.runsConceded);
                    responseWriter.writeDouble(BowlingStatsList15.$responseFields[3], BowlingStatsList15.this.economyRate);
                    responseWriter.writeDouble(BowlingStatsList15.$responseFields[4], BowlingStatsList15.this.overs);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlingStatsList15{__typename=" + this.__typename + ", wickets=" + this.wickets + ", runsConceded=" + this.runsConceded + ", economyRate=" + this.economyRate + ", overs=" + this.overs + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlingStatsList15)) {
                return false;
            }
            BowlingStatsList15 bowlingStatsList15 = (BowlingStatsList15) obj;
            if (this.__typename.equals(bowlingStatsList15.__typename) && ((num = this.wickets) != null ? num.equals(bowlingStatsList15.wickets) : bowlingStatsList15.wickets == null) && ((num2 = this.runsConceded) != null ? num2.equals(bowlingStatsList15.runsConceded) : bowlingStatsList15.runsConceded == null) && ((d = this.economyRate) != null ? d.equals(bowlingStatsList15.economyRate) : bowlingStatsList15.economyRate == null)) {
                Double d2 = this.overs;
                Double d3 = bowlingStatsList15.overs;
                if (d2 == null) {
                    if (d3 == null) {
                        return true;
                    }
                } else if (d2.equals(d3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.wickets;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.runsConceded;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Double d = this.economyRate;
                int hashCode4 = (hashCode3 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.overs;
                if (d2 != null) {
                    i = d2.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlingStatsList15> {
            @Override 
            public BowlingStatsList15 map(ResponseReader responseReader) {
                return new BowlingStatsList15(responseReader.readString(BowlingStatsList15.$responseFields[0]), responseReader.readInt(BowlingStatsList15.$responseFields[1]), responseReader.readInt(BowlingStatsList15.$responseFields[2]), responseReader.readDouble(BowlingStatsList15.$responseFields[3]), responseReader.readDouble(BowlingStatsList15.$responseFields[4]));
            }
        }
    }

    public static class FieldingStatsList15 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runsOuts", "runsOuts", null, true, Collections.emptyList()), ResponseField.forInt("catches", "catches", null, true, Collections.emptyList()), ResponseField.forInt("stumps", "stumps", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer catches;
        final Integer runsOuts;
        final Integer stumps;

        public FieldingStatsList15(String str, Integer num, Integer num2, Integer num3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runsOuts = num;
            this.catches = num2;
            this.stumps = num3;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runsOuts() {
            return this.runsOuts;
        }

        public Integer catches() {
            return this.catches;
        }

        public Integer stumps() {
            return this.stumps;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(FieldingStatsList15.$responseFields[0], FieldingStatsList15.this.__typename);
                    responseWriter.writeInt(FieldingStatsList15.$responseFields[1], FieldingStatsList15.this.runsOuts);
                    responseWriter.writeInt(FieldingStatsList15.$responseFields[2], FieldingStatsList15.this.catches);
                    responseWriter.writeInt(FieldingStatsList15.$responseFields[3], FieldingStatsList15.this.stumps);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FieldingStatsList15{__typename=" + this.__typename + ", runsOuts=" + this.runsOuts + ", catches=" + this.catches + ", stumps=" + this.stumps + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FieldingStatsList15)) {
                return false;
            }
            FieldingStatsList15 fieldingStatsList15 = (FieldingStatsList15) obj;
            if (this.__typename.equals(fieldingStatsList15.__typename) && ((num = this.runsOuts) != null ? num.equals(fieldingStatsList15.runsOuts) : fieldingStatsList15.runsOuts == null) && ((num2 = this.catches) != null ? num2.equals(fieldingStatsList15.catches) : fieldingStatsList15.catches == null)) {
                Integer num3 = this.stumps;
                Integer num4 = fieldingStatsList15.stumps;
                if (num3 == null) {
                    if (num4 == null) {
                        return true;
                    }
                } else if (num3.equals(num4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.runsOuts;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.catches;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.stumps;
                if (num3 != null) {
                    i = num3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<FieldingStatsList15> {
            @Override 
            public FieldingStatsList15 map(ResponseReader responseReader) {
                return new FieldingStatsList15(responseReader.readString(FieldingStatsList15.$responseFields[0]), responseReader.readInt(FieldingStatsList15.$responseFields[1]), responseReader.readInt(FieldingStatsList15.$responseFields[2]), responseReader.readInt(FieldingStatsList15.$responseFields[3]));
            }
        }
    }

    public static class InningWisePoints15 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("inningWiseBattingPoints", "inningWiseBattingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseBowlingPoints", "inningWiseBowlingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseFieldingPoints", "inningWiseFieldingPoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Double> inningWiseBattingPoints;
        final List<Double> inningWiseBowlingPoints;
        final List<Double> inningWiseFieldingPoints;

        public InningWisePoints15(String str, List<Double> list, List<Double> list2, List<Double> list3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.inningWiseBattingPoints = list;
            this.inningWiseBowlingPoints = list2;
            this.inningWiseFieldingPoints = list3;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Double> inningWiseBattingPoints() {
            return this.inningWiseBattingPoints;
        }

        public List<Double> inningWiseBowlingPoints() {
            return this.inningWiseBowlingPoints;
        }

        public List<Double> inningWiseFieldingPoints() {
            return this.inningWiseFieldingPoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(InningWisePoints15.$responseFields[0], InningWisePoints15.this.__typename);
                    responseWriter.writeList(InningWisePoints15.$responseFields[1], InningWisePoints15.this.inningWiseBattingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints15.$responseFields[2], InningWisePoints15.this.inningWiseBowlingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints15.$responseFields[3], InningWisePoints15.this.inningWiseFieldingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "InningWisePoints15{__typename=" + this.__typename + ", inningWiseBattingPoints=" + this.inningWiseBattingPoints + ", inningWiseBowlingPoints=" + this.inningWiseBowlingPoints + ", inningWiseFieldingPoints=" + this.inningWiseFieldingPoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<Double> list;
            List<Double> list2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InningWisePoints15)) {
                return false;
            }
            InningWisePoints15 inningWisePoints15 = (InningWisePoints15) obj;
            if (this.__typename.equals(inningWisePoints15.__typename) && ((list = this.inningWiseBattingPoints) != null ? list.equals(inningWisePoints15.inningWiseBattingPoints) : inningWisePoints15.inningWiseBattingPoints == null) && ((list2 = this.inningWiseBowlingPoints) != null ? list2.equals(inningWisePoints15.inningWiseBowlingPoints) : inningWisePoints15.inningWiseBowlingPoints == null)) {
                List<Double> list3 = this.inningWiseFieldingPoints;
                List<Double> list4 = inningWisePoints15.inningWiseFieldingPoints;
                if (list3 == null) {
                    if (list4 == null) {
                        return true;
                    }
                } else if (list3.equals(list4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<Double> list = this.inningWiseBattingPoints;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Double> list2 = this.inningWiseBowlingPoints;
                int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<Double> list3 = this.inningWiseFieldingPoints;
                if (list3 != null) {
                    i = list3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<InningWisePoints15> {
            @Override 
            public InningWisePoints15 map(ResponseReader responseReader) {
                return new InningWisePoints15(responseReader.readString(InningWisePoints15.$responseFields[0]), responseReader.readList(InningWisePoints15.$responseFields[1], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints15.$responseFields[2], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints15.$responseFields[3], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }));
            }
        }
    }

    public static class BowlerSummary21 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forObject("topBowler", "topBowler", null, true, Collections.emptyList()), ResponseField.forObject("runnerBowler", "runnerBowler", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final RunnerBowler3 runnerBowler;
        final TopBowler3 topBowler;

        public BowlerSummary21(String str, TopBowler3 topBowler3, RunnerBowler3 runnerBowler3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.topBowler = topBowler3;
            this.runnerBowler = runnerBowler3;
        }

        public String __typename() {
            return this.__typename;
        }

        public TopBowler3 topBowler() {
            return this.topBowler;
        }

        public RunnerBowler3 runnerBowler() {
            return this.runnerBowler;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlerSummary21.$responseFields[0], BowlerSummary21.this.__typename);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(BowlerSummary21.$responseFields[1], BowlerSummary21.this.topBowler != null ? BowlerSummary21.this.topBowler.marshaller() : null);
                    ResponseField responseField = BowlerSummary21.$responseFields[2];
                    if (BowlerSummary21.this.runnerBowler != null) {
                        responseFieldMarshaller = BowlerSummary21.this.runnerBowler.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlerSummary21{__typename=" + this.__typename + ", topBowler=" + this.topBowler + ", runnerBowler=" + this.runnerBowler + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            TopBowler3 topBowler3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlerSummary21)) {
                return false;
            }
            BowlerSummary21 bowlerSummary21 = (BowlerSummary21) obj;
            if (this.__typename.equals(bowlerSummary21.__typename) && ((topBowler3 = this.topBowler) != null ? topBowler3.equals(bowlerSummary21.topBowler) : bowlerSummary21.topBowler == null)) {
                RunnerBowler3 runnerBowler3 = this.runnerBowler;
                RunnerBowler3 runnerBowler32 = bowlerSummary21.runnerBowler;
                if (runnerBowler3 == null) {
                    if (runnerBowler32 == null) {
                        return true;
                    }
                } else if (runnerBowler3.equals(runnerBowler32)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                TopBowler3 topBowler3 = this.topBowler;
                int i = 0;
                int hashCode2 = (hashCode ^ (topBowler3 == null ? 0 : topBowler3.hashCode())) * 1000003;
                RunnerBowler3 runnerBowler3 = this.runnerBowler;
                if (runnerBowler3 != null) {
                    i = runnerBowler3.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlerSummary21> {
            final RunnerBowler3.Mapper runnerBowler3FieldMapper = new RunnerBowler3.Mapper();
            final TopBowler3.Mapper topBowler3FieldMapper = new TopBowler3.Mapper();

            @Override 
            public BowlerSummary21 map(ResponseReader responseReader) {
                return new BowlerSummary21(responseReader.readString(BowlerSummary21.$responseFields[0]), (TopBowler3) responseReader.readObject(BowlerSummary21.$responseFields[1], new ResponseReader.ObjectReader<TopBowler3>() {


                    @Override 
                    public TopBowler3 read(ResponseReader responseReader) {
                        return Mapper.this.topBowler3FieldMapper.map(responseReader);
                    }
                }), (RunnerBowler3) responseReader.readObject(BowlerSummary21.$responseFields[2], new ResponseReader.ObjectReader<RunnerBowler3>() {


                    @Override 
                    public RunnerBowler3 read(ResponseReader responseReader) {
                        return Mapper.this.runnerBowler3FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class TopBowler3 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerNameHindi", "playerNameHindi", null, true, Collections.emptyList()), ResponseField.forString("playerTeam", "playerTeam", null, true, Collections.emptyList()), ResponseField.forString("playerTeamID", "playerTeamID", null, true, Collections.emptyList()), ResponseField.forDouble("totalBattingPoints", "totalBattingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalPoints", "totalPoints", null, true, Collections.emptyList()), ResponseField.forList("battingStatsList", "battingStatsList", null, true, Collections.emptyList()), ResponseField.forDouble("totalBowlingPoints", "totalBowlingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalFieldingPoints", "totalFieldingPoints", null, true, Collections.emptyList()), ResponseField.forList("bowlingStatsList", "bowlingStatsList", null, true, Collections.emptyList()), ResponseField.forList("fieldingStatsList", "fieldingStatsList", null, true, Collections.emptyList()), ResponseField.forObject("inningWisePoints", "inningWisePoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<BattingStatsList16> battingStatsList;
        final List<BowlingStatsList16> bowlingStatsList;
        final List<FieldingStatsList16> fieldingStatsList;
        final InningWisePoints16 inningWisePoints;
        final String playerID;
        final String playerName;
        final String playerNameHindi;
        final String playerTeam;
        final String playerTeamID;
        final Double totalBattingPoints;
        final Double totalBowlingPoints;
        final Double totalFieldingPoints;
        final Double totalPoints;

        public TopBowler3(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, List<BattingStatsList16> list, Double d3, Double d4, List<BowlingStatsList16> list2, List<FieldingStatsList16> list3, InningWisePoints16 inningWisePoints16) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerName = str3;
            this.playerNameHindi = str4;
            this.playerTeam = str5;
            this.playerTeamID = str6;
            this.totalBattingPoints = d;
            this.totalPoints = d2;
            this.battingStatsList = list;
            this.totalBowlingPoints = d3;
            this.totalFieldingPoints = d4;
            this.bowlingStatsList = list2;
            this.fieldingStatsList = list3;
            this.inningWisePoints = inningWisePoints16;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerID() {
            return this.playerID;
        }

        public String playerName() {
            return this.playerName;
        }

        public String playerNameHindi() {
            return this.playerNameHindi;
        }

        public String playerTeam() {
            return this.playerTeam;
        }

        public String playerTeamID() {
            return this.playerTeamID;
        }

        public Double totalBattingPoints() {
            return this.totalBattingPoints;
        }

        public Double totalPoints() {
            return this.totalPoints;
        }

        public List<BattingStatsList16> battingStatsList() {
            return this.battingStatsList;
        }

        public Double totalBowlingPoints() {
            return this.totalBowlingPoints;
        }

        public Double totalFieldingPoints() {
            return this.totalFieldingPoints;
        }

        public List<BowlingStatsList16> bowlingStatsList() {
            return this.bowlingStatsList;
        }

        public List<FieldingStatsList16> fieldingStatsList() {
            return this.fieldingStatsList;
        }

        public InningWisePoints16 inningWisePoints() {
            return this.inningWisePoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TopBowler3.$responseFields[0], TopBowler3.this.__typename);
                    responseWriter.writeString(TopBowler3.$responseFields[1], TopBowler3.this.playerID);
                    responseWriter.writeString(TopBowler3.$responseFields[2], TopBowler3.this.playerName);
                    responseWriter.writeString(TopBowler3.$responseFields[3], TopBowler3.this.playerNameHindi);
                    responseWriter.writeString(TopBowler3.$responseFields[4], TopBowler3.this.playerTeam);
                    responseWriter.writeString(TopBowler3.$responseFields[5], TopBowler3.this.playerTeamID);
                    responseWriter.writeDouble(TopBowler3.$responseFields[6], TopBowler3.this.totalBattingPoints);
                    responseWriter.writeDouble(TopBowler3.$responseFields[7], TopBowler3.this.totalPoints);
                    responseWriter.writeList(TopBowler3.$responseFields[8], TopBowler3.this.battingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BattingStatsList16) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeDouble(TopBowler3.$responseFields[9], TopBowler3.this.totalBowlingPoints);
                    responseWriter.writeDouble(TopBowler3.$responseFields[10], TopBowler3.this.totalFieldingPoints);
                    responseWriter.writeList(TopBowler3.$responseFields[11], TopBowler3.this.bowlingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BowlingStatsList16) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(TopBowler3.$responseFields[12], TopBowler3.this.fieldingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((FieldingStatsList16) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeObject(TopBowler3.$responseFields[13], TopBowler3.this.inningWisePoints != null ? TopBowler3.this.inningWisePoints.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TopBowler3{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerNameHindi=" + this.playerNameHindi + ", playerTeam=" + this.playerTeam + ", playerTeamID=" + this.playerTeamID + ", totalBattingPoints=" + this.totalBattingPoints + ", totalPoints=" + this.totalPoints + ", battingStatsList=" + this.battingStatsList + ", totalBowlingPoints=" + this.totalBowlingPoints + ", totalFieldingPoints=" + this.totalFieldingPoints + ", bowlingStatsList=" + this.bowlingStatsList + ", fieldingStatsList=" + this.fieldingStatsList + ", inningWisePoints=" + this.inningWisePoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Double d;
            Double d2;
            List<BattingStatsList16> list;
            Double d3;
            Double d4;
            List<BowlingStatsList16> list2;
            List<FieldingStatsList16> list3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TopBowler3)) {
                return false;
            }
            TopBowler3 topBowler3 = (TopBowler3) obj;
            if (this.__typename.equals(topBowler3.__typename) && ((str = this.playerID) != null ? str.equals(topBowler3.playerID) : topBowler3.playerID == null) && ((str2 = this.playerName) != null ? str2.equals(topBowler3.playerName) : topBowler3.playerName == null) && ((str3 = this.playerNameHindi) != null ? str3.equals(topBowler3.playerNameHindi) : topBowler3.playerNameHindi == null) && ((str4 = this.playerTeam) != null ? str4.equals(topBowler3.playerTeam) : topBowler3.playerTeam == null) && ((str5 = this.playerTeamID) != null ? str5.equals(topBowler3.playerTeamID) : topBowler3.playerTeamID == null) && ((d = this.totalBattingPoints) != null ? d.equals(topBowler3.totalBattingPoints) : topBowler3.totalBattingPoints == null) && ((d2 = this.totalPoints) != null ? d2.equals(topBowler3.totalPoints) : topBowler3.totalPoints == null) && ((list = this.battingStatsList) != null ? list.equals(topBowler3.battingStatsList) : topBowler3.battingStatsList == null) && ((d3 = this.totalBowlingPoints) != null ? d3.equals(topBowler3.totalBowlingPoints) : topBowler3.totalBowlingPoints == null) && ((d4 = this.totalFieldingPoints) != null ? d4.equals(topBowler3.totalFieldingPoints) : topBowler3.totalFieldingPoints == null) && ((list2 = this.bowlingStatsList) != null ? list2.equals(topBowler3.bowlingStatsList) : topBowler3.bowlingStatsList == null) && ((list3 = this.fieldingStatsList) != null ? list3.equals(topBowler3.fieldingStatsList) : topBowler3.fieldingStatsList == null)) {
                InningWisePoints16 inningWisePoints16 = this.inningWisePoints;
                InningWisePoints16 inningWisePoints162 = topBowler3.inningWisePoints;
                if (inningWisePoints16 == null) {
                    if (inningWisePoints162 == null) {
                        return true;
                    }
                } else if (inningWisePoints16.equals(inningWisePoints162)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.playerID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerNameHindi;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerTeam;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerTeamID;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Double d = this.totalBattingPoints;
                int hashCode7 = (hashCode6 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.totalPoints;
                int hashCode8 = (hashCode7 ^ (d2 == null ? 0 : d2.hashCode())) * 1000003;
                List<BattingStatsList16> list = this.battingStatsList;
                int hashCode9 = (hashCode8 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                Double d3 = this.totalBowlingPoints;
                int hashCode10 = (hashCode9 ^ (d3 == null ? 0 : d3.hashCode())) * 1000003;
                Double d4 = this.totalFieldingPoints;
                int hashCode11 = (hashCode10 ^ (d4 == null ? 0 : d4.hashCode())) * 1000003;
                List<BowlingStatsList16> list2 = this.bowlingStatsList;
                int hashCode12 = (hashCode11 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<FieldingStatsList16> list3 = this.fieldingStatsList;
                int hashCode13 = (hashCode12 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                InningWisePoints16 inningWisePoints16 = this.inningWisePoints;
                if (inningWisePoints16 != null) {
                    i = inningWisePoints16.hashCode();
                }
                this.$hashCode = hashCode13 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TopBowler3> {
            final BattingStatsList16.Mapper battingStatsList16FieldMapper = new BattingStatsList16.Mapper();
            final BowlingStatsList16.Mapper bowlingStatsList16FieldMapper = new BowlingStatsList16.Mapper();
            final FieldingStatsList16.Mapper fieldingStatsList16FieldMapper = new FieldingStatsList16.Mapper();
            final InningWisePoints16.Mapper inningWisePoints16FieldMapper = new InningWisePoints16.Mapper();

            @Override 
            public TopBowler3 map(ResponseReader responseReader) {
                return new TopBowler3(responseReader.readString(TopBowler3.$responseFields[0]), responseReader.readString(TopBowler3.$responseFields[1]), responseReader.readString(TopBowler3.$responseFields[2]), responseReader.readString(TopBowler3.$responseFields[3]), responseReader.readString(TopBowler3.$responseFields[4]), responseReader.readString(TopBowler3.$responseFields[5]), responseReader.readDouble(TopBowler3.$responseFields[6]), responseReader.readDouble(TopBowler3.$responseFields[7]), responseReader.readList(TopBowler3.$responseFields[8], new ResponseReader.ListReader<BattingStatsList16>() {


                    @Override 
                    public BattingStatsList16 read(ResponseReader.ListItemReader listItemReader) {
                        return (BattingStatsList16) listItemReader.readObject(new ResponseReader.ObjectReader<BattingStatsList16>() {


                            @Override 
                            public BattingStatsList16 read(ResponseReader responseReader) {
                                return Mapper.this.battingStatsList16FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readDouble(TopBowler3.$responseFields[9]), responseReader.readDouble(TopBowler3.$responseFields[10]), responseReader.readList(TopBowler3.$responseFields[11], new ResponseReader.ListReader<BowlingStatsList16>() {


                    @Override 
                    public BowlingStatsList16 read(ResponseReader.ListItemReader listItemReader) {
                        return (BowlingStatsList16) listItemReader.readObject(new ResponseReader.ObjectReader<BowlingStatsList16>() {


                            @Override 
                            public BowlingStatsList16 read(ResponseReader responseReader) {
                                return Mapper.this.bowlingStatsList16FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(TopBowler3.$responseFields[12], new ResponseReader.ListReader<FieldingStatsList16>() {


                    @Override 
                    public FieldingStatsList16 read(ResponseReader.ListItemReader listItemReader) {
                        return (FieldingStatsList16) listItemReader.readObject(new ResponseReader.ObjectReader<FieldingStatsList16>() {


                            @Override 
                            public FieldingStatsList16 read(ResponseReader responseReader) {
                                return Mapper.this.fieldingStatsList16FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (InningWisePoints16) responseReader.readObject(TopBowler3.$responseFields[13], new ResponseReader.ObjectReader<InningWisePoints16>() {


                    @Override 
                    public InningWisePoints16 read(ResponseReader responseReader) {
                        return Mapper.this.inningWisePoints16FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class BattingStatsList16 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runs", "runs", null, true, Collections.emptyList()), ResponseField.forInt("fours", "fours", null, true, Collections.emptyList()), ResponseField.forInt("sixes", "sixes", null, true, Collections.emptyList()), ResponseField.forInt("balls", "balls", null, true, Collections.emptyList()), ResponseField.forDouble("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forBoolean("isNotOut", "isNotOut", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer balls;
        final Integer fours;
        final Boolean isNotOut;
        final Integer runs;
        final Integer sixes;
        final Double strikeRate;

        public BattingStatsList16(String str, Integer num, Integer num2, Integer num3, Integer num4, Double d, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runs = num;
            this.fours = num2;
            this.sixes = num3;
            this.balls = num4;
            this.strikeRate = d;
            this.isNotOut = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runs() {
            return this.runs;
        }

        public Integer fours() {
            return this.fours;
        }

        public Integer sixes() {
            return this.sixes;
        }

        public Integer balls() {
            return this.balls;
        }

        public Double strikeRate() {
            return this.strikeRate;
        }

        public Boolean isNotOut() {
            return this.isNotOut;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BattingStatsList16.$responseFields[0], BattingStatsList16.this.__typename);
                    responseWriter.writeInt(BattingStatsList16.$responseFields[1], BattingStatsList16.this.runs);
                    responseWriter.writeInt(BattingStatsList16.$responseFields[2], BattingStatsList16.this.fours);
                    responseWriter.writeInt(BattingStatsList16.$responseFields[3], BattingStatsList16.this.sixes);
                    responseWriter.writeInt(BattingStatsList16.$responseFields[4], BattingStatsList16.this.balls);
                    responseWriter.writeDouble(BattingStatsList16.$responseFields[5], BattingStatsList16.this.strikeRate);
                    responseWriter.writeBoolean(BattingStatsList16.$responseFields[6], BattingStatsList16.this.isNotOut);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BattingStatsList16{__typename=" + this.__typename + ", runs=" + this.runs + ", fours=" + this.fours + ", sixes=" + this.sixes + ", balls=" + this.balls + ", strikeRate=" + this.strikeRate + ", isNotOut=" + this.isNotOut + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattingStatsList16)) {
                return false;
            }
            BattingStatsList16 battingStatsList16 = (BattingStatsList16) obj;
            if (this.__typename.equals(battingStatsList16.__typename) && ((num = this.runs) != null ? num.equals(battingStatsList16.runs) : battingStatsList16.runs == null) && ((num2 = this.fours) != null ? num2.equals(battingStatsList16.fours) : battingStatsList16.fours == null) && ((num3 = this.sixes) != null ? num3.equals(battingStatsList16.sixes) : battingStatsList16.sixes == null) && ((num4 = this.balls) != null ? num4.equals(battingStatsList16.balls) : battingStatsList16.balls == null) && ((d = this.strikeRate) != null ? d.equals(battingStatsList16.strikeRate) : battingStatsList16.strikeRate == null)) {
                Boolean bool = this.isNotOut;
                Boolean bool2 = battingStatsList16.isNotOut;
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
                Integer num = this.runs;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.fours;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.sixes;
                int hashCode4 = (hashCode3 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.balls;
                int hashCode5 = (hashCode4 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Double d = this.strikeRate;
                int hashCode6 = (hashCode5 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Boolean bool = this.isNotOut;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BattingStatsList16> {
            @Override 
            public BattingStatsList16 map(ResponseReader responseReader) {
                return new BattingStatsList16(responseReader.readString(BattingStatsList16.$responseFields[0]), responseReader.readInt(BattingStatsList16.$responseFields[1]), responseReader.readInt(BattingStatsList16.$responseFields[2]), responseReader.readInt(BattingStatsList16.$responseFields[3]), responseReader.readInt(BattingStatsList16.$responseFields[4]), responseReader.readDouble(BattingStatsList16.$responseFields[5]), responseReader.readBoolean(BattingStatsList16.$responseFields[6]));
            }
        }
    }

    public static class BowlingStatsList16 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forInt("runsConceded", "runsConceded", null, true, Collections.emptyList()), ResponseField.forDouble("economyRate", "economyRate", null, true, Collections.emptyList()), ResponseField.forDouble("overs", "overs", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double economyRate;
        final Double overs;
        final Integer runsConceded;
        final Integer wickets;

        public BowlingStatsList16(String str, Integer num, Integer num2, Double d, Double d2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.wickets = num;
            this.runsConceded = num2;
            this.economyRate = d;
            this.overs = d2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer wickets() {
            return this.wickets;
        }

        public Integer runsConceded() {
            return this.runsConceded;
        }

        public Double economyRate() {
            return this.economyRate;
        }

        public Double overs() {
            return this.overs;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlingStatsList16.$responseFields[0], BowlingStatsList16.this.__typename);
                    responseWriter.writeInt(BowlingStatsList16.$responseFields[1], BowlingStatsList16.this.wickets);
                    responseWriter.writeInt(BowlingStatsList16.$responseFields[2], BowlingStatsList16.this.runsConceded);
                    responseWriter.writeDouble(BowlingStatsList16.$responseFields[3], BowlingStatsList16.this.economyRate);
                    responseWriter.writeDouble(BowlingStatsList16.$responseFields[4], BowlingStatsList16.this.overs);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlingStatsList16{__typename=" + this.__typename + ", wickets=" + this.wickets + ", runsConceded=" + this.runsConceded + ", economyRate=" + this.economyRate + ", overs=" + this.overs + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlingStatsList16)) {
                return false;
            }
            BowlingStatsList16 bowlingStatsList16 = (BowlingStatsList16) obj;
            if (this.__typename.equals(bowlingStatsList16.__typename) && ((num = this.wickets) != null ? num.equals(bowlingStatsList16.wickets) : bowlingStatsList16.wickets == null) && ((num2 = this.runsConceded) != null ? num2.equals(bowlingStatsList16.runsConceded) : bowlingStatsList16.runsConceded == null) && ((d = this.economyRate) != null ? d.equals(bowlingStatsList16.economyRate) : bowlingStatsList16.economyRate == null)) {
                Double d2 = this.overs;
                Double d3 = bowlingStatsList16.overs;
                if (d2 == null) {
                    if (d3 == null) {
                        return true;
                    }
                } else if (d2.equals(d3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.wickets;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.runsConceded;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Double d = this.economyRate;
                int hashCode4 = (hashCode3 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.overs;
                if (d2 != null) {
                    i = d2.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlingStatsList16> {
            @Override 
            public BowlingStatsList16 map(ResponseReader responseReader) {
                return new BowlingStatsList16(responseReader.readString(BowlingStatsList16.$responseFields[0]), responseReader.readInt(BowlingStatsList16.$responseFields[1]), responseReader.readInt(BowlingStatsList16.$responseFields[2]), responseReader.readDouble(BowlingStatsList16.$responseFields[3]), responseReader.readDouble(BowlingStatsList16.$responseFields[4]));
            }
        }
    }

    public static class FieldingStatsList16 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runsOuts", "runsOuts", null, true, Collections.emptyList()), ResponseField.forInt("catches", "catches", null, true, Collections.emptyList()), ResponseField.forInt("stumps", "stumps", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer catches;
        final Integer runsOuts;
        final Integer stumps;

        public FieldingStatsList16(String str, Integer num, Integer num2, Integer num3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runsOuts = num;
            this.catches = num2;
            this.stumps = num3;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runsOuts() {
            return this.runsOuts;
        }

        public Integer catches() {
            return this.catches;
        }

        public Integer stumps() {
            return this.stumps;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(FieldingStatsList16.$responseFields[0], FieldingStatsList16.this.__typename);
                    responseWriter.writeInt(FieldingStatsList16.$responseFields[1], FieldingStatsList16.this.runsOuts);
                    responseWriter.writeInt(FieldingStatsList16.$responseFields[2], FieldingStatsList16.this.catches);
                    responseWriter.writeInt(FieldingStatsList16.$responseFields[3], FieldingStatsList16.this.stumps);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FieldingStatsList16{__typename=" + this.__typename + ", runsOuts=" + this.runsOuts + ", catches=" + this.catches + ", stumps=" + this.stumps + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FieldingStatsList16)) {
                return false;
            }
            FieldingStatsList16 fieldingStatsList16 = (FieldingStatsList16) obj;
            if (this.__typename.equals(fieldingStatsList16.__typename) && ((num = this.runsOuts) != null ? num.equals(fieldingStatsList16.runsOuts) : fieldingStatsList16.runsOuts == null) && ((num2 = this.catches) != null ? num2.equals(fieldingStatsList16.catches) : fieldingStatsList16.catches == null)) {
                Integer num3 = this.stumps;
                Integer num4 = fieldingStatsList16.stumps;
                if (num3 == null) {
                    if (num4 == null) {
                        return true;
                    }
                } else if (num3.equals(num4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.runsOuts;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.catches;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.stumps;
                if (num3 != null) {
                    i = num3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<FieldingStatsList16> {
            @Override 
            public FieldingStatsList16 map(ResponseReader responseReader) {
                return new FieldingStatsList16(responseReader.readString(FieldingStatsList16.$responseFields[0]), responseReader.readInt(FieldingStatsList16.$responseFields[1]), responseReader.readInt(FieldingStatsList16.$responseFields[2]), responseReader.readInt(FieldingStatsList16.$responseFields[3]));
            }
        }
    }

    public static class InningWisePoints16 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("inningWiseBattingPoints", "inningWiseBattingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseBowlingPoints", "inningWiseBowlingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseFieldingPoints", "inningWiseFieldingPoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Double> inningWiseBattingPoints;
        final List<Double> inningWiseBowlingPoints;
        final List<Double> inningWiseFieldingPoints;

        public InningWisePoints16(String str, List<Double> list, List<Double> list2, List<Double> list3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.inningWiseBattingPoints = list;
            this.inningWiseBowlingPoints = list2;
            this.inningWiseFieldingPoints = list3;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Double> inningWiseBattingPoints() {
            return this.inningWiseBattingPoints;
        }

        public List<Double> inningWiseBowlingPoints() {
            return this.inningWiseBowlingPoints;
        }

        public List<Double> inningWiseFieldingPoints() {
            return this.inningWiseFieldingPoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(InningWisePoints16.$responseFields[0], InningWisePoints16.this.__typename);
                    responseWriter.writeList(InningWisePoints16.$responseFields[1], InningWisePoints16.this.inningWiseBattingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints16.$responseFields[2], InningWisePoints16.this.inningWiseBowlingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints16.$responseFields[3], InningWisePoints16.this.inningWiseFieldingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "InningWisePoints16{__typename=" + this.__typename + ", inningWiseBattingPoints=" + this.inningWiseBattingPoints + ", inningWiseBowlingPoints=" + this.inningWiseBowlingPoints + ", inningWiseFieldingPoints=" + this.inningWiseFieldingPoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<Double> list;
            List<Double> list2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InningWisePoints16)) {
                return false;
            }
            InningWisePoints16 inningWisePoints16 = (InningWisePoints16) obj;
            if (this.__typename.equals(inningWisePoints16.__typename) && ((list = this.inningWiseBattingPoints) != null ? list.equals(inningWisePoints16.inningWiseBattingPoints) : inningWisePoints16.inningWiseBattingPoints == null) && ((list2 = this.inningWiseBowlingPoints) != null ? list2.equals(inningWisePoints16.inningWiseBowlingPoints) : inningWisePoints16.inningWiseBowlingPoints == null)) {
                List<Double> list3 = this.inningWiseFieldingPoints;
                List<Double> list4 = inningWisePoints16.inningWiseFieldingPoints;
                if (list3 == null) {
                    if (list4 == null) {
                        return true;
                    }
                } else if (list3.equals(list4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<Double> list = this.inningWiseBattingPoints;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Double> list2 = this.inningWiseBowlingPoints;
                int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<Double> list3 = this.inningWiseFieldingPoints;
                if (list3 != null) {
                    i = list3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<InningWisePoints16> {
            @Override 
            public InningWisePoints16 map(ResponseReader responseReader) {
                return new InningWisePoints16(responseReader.readString(InningWisePoints16.$responseFields[0]), responseReader.readList(InningWisePoints16.$responseFields[1], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints16.$responseFields[2], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints16.$responseFields[3], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }));
            }
        }
    }

    public static class RunnerBowler3 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerNameHindi", "playerNameHindi", null, true, Collections.emptyList()), ResponseField.forString("playerTeam", "playerTeam", null, true, Collections.emptyList()), ResponseField.forString("playerTeamID", "playerTeamID", null, true, Collections.emptyList()), ResponseField.forDouble("totalBattingPoints", "totalBattingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalPoints", "totalPoints", null, true, Collections.emptyList()), ResponseField.forList("battingStatsList", "battingStatsList", null, true, Collections.emptyList()), ResponseField.forDouble("totalBowlingPoints", "totalBowlingPoints", null, true, Collections.emptyList()), ResponseField.forDouble("totalFieldingPoints", "totalFieldingPoints", null, true, Collections.emptyList()), ResponseField.forList("bowlingStatsList", "bowlingStatsList", null, true, Collections.emptyList()), ResponseField.forList("fieldingStatsList", "fieldingStatsList", null, true, Collections.emptyList()), ResponseField.forObject("inningWisePoints", "inningWisePoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<BattingStatsList17> battingStatsList;
        final List<BowlingStatsList17> bowlingStatsList;
        final List<FieldingStatsList17> fieldingStatsList;
        final InningWisePoints17 inningWisePoints;
        final String playerID;
        final String playerName;
        final String playerNameHindi;
        final String playerTeam;
        final String playerTeamID;
        final Double totalBattingPoints;
        final Double totalBowlingPoints;
        final Double totalFieldingPoints;
        final Double totalPoints;

        public RunnerBowler3(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, List<BattingStatsList17> list, Double d3, Double d4, List<BowlingStatsList17> list2, List<FieldingStatsList17> list3, InningWisePoints17 inningWisePoints17) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerName = str3;
            this.playerNameHindi = str4;
            this.playerTeam = str5;
            this.playerTeamID = str6;
            this.totalBattingPoints = d;
            this.totalPoints = d2;
            this.battingStatsList = list;
            this.totalBowlingPoints = d3;
            this.totalFieldingPoints = d4;
            this.bowlingStatsList = list2;
            this.fieldingStatsList = list3;
            this.inningWisePoints = inningWisePoints17;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerID() {
            return this.playerID;
        }

        public String playerName() {
            return this.playerName;
        }

        public String playerNameHindi() {
            return this.playerNameHindi;
        }

        public String playerTeam() {
            return this.playerTeam;
        }

        public String playerTeamID() {
            return this.playerTeamID;
        }

        public Double totalBattingPoints() {
            return this.totalBattingPoints;
        }

        public Double totalPoints() {
            return this.totalPoints;
        }

        public List<BattingStatsList17> battingStatsList() {
            return this.battingStatsList;
        }

        public Double totalBowlingPoints() {
            return this.totalBowlingPoints;
        }

        public Double totalFieldingPoints() {
            return this.totalFieldingPoints;
        }

        public List<BowlingStatsList17> bowlingStatsList() {
            return this.bowlingStatsList;
        }

        public List<FieldingStatsList17> fieldingStatsList() {
            return this.fieldingStatsList;
        }

        public InningWisePoints17 inningWisePoints() {
            return this.inningWisePoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(RunnerBowler3.$responseFields[0], RunnerBowler3.this.__typename);
                    responseWriter.writeString(RunnerBowler3.$responseFields[1], RunnerBowler3.this.playerID);
                    responseWriter.writeString(RunnerBowler3.$responseFields[2], RunnerBowler3.this.playerName);
                    responseWriter.writeString(RunnerBowler3.$responseFields[3], RunnerBowler3.this.playerNameHindi);
                    responseWriter.writeString(RunnerBowler3.$responseFields[4], RunnerBowler3.this.playerTeam);
                    responseWriter.writeString(RunnerBowler3.$responseFields[5], RunnerBowler3.this.playerTeamID);
                    responseWriter.writeDouble(RunnerBowler3.$responseFields[6], RunnerBowler3.this.totalBattingPoints);
                    responseWriter.writeDouble(RunnerBowler3.$responseFields[7], RunnerBowler3.this.totalPoints);
                    responseWriter.writeList(RunnerBowler3.$responseFields[8], RunnerBowler3.this.battingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BattingStatsList17) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeDouble(RunnerBowler3.$responseFields[9], RunnerBowler3.this.totalBowlingPoints);
                    responseWriter.writeDouble(RunnerBowler3.$responseFields[10], RunnerBowler3.this.totalFieldingPoints);
                    responseWriter.writeList(RunnerBowler3.$responseFields[11], RunnerBowler3.this.bowlingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BowlingStatsList17) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(RunnerBowler3.$responseFields[12], RunnerBowler3.this.fieldingStatsList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((FieldingStatsList17) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeObject(RunnerBowler3.$responseFields[13], RunnerBowler3.this.inningWisePoints != null ? RunnerBowler3.this.inningWisePoints.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "RunnerBowler3{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerNameHindi=" + this.playerNameHindi + ", playerTeam=" + this.playerTeam + ", playerTeamID=" + this.playerTeamID + ", totalBattingPoints=" + this.totalBattingPoints + ", totalPoints=" + this.totalPoints + ", battingStatsList=" + this.battingStatsList + ", totalBowlingPoints=" + this.totalBowlingPoints + ", totalFieldingPoints=" + this.totalFieldingPoints + ", bowlingStatsList=" + this.bowlingStatsList + ", fieldingStatsList=" + this.fieldingStatsList + ", inningWisePoints=" + this.inningWisePoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Double d;
            Double d2;
            List<BattingStatsList17> list;
            Double d3;
            Double d4;
            List<BowlingStatsList17> list2;
            List<FieldingStatsList17> list3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RunnerBowler3)) {
                return false;
            }
            RunnerBowler3 runnerBowler3 = (RunnerBowler3) obj;
            if (this.__typename.equals(runnerBowler3.__typename) && ((str = this.playerID) != null ? str.equals(runnerBowler3.playerID) : runnerBowler3.playerID == null) && ((str2 = this.playerName) != null ? str2.equals(runnerBowler3.playerName) : runnerBowler3.playerName == null) && ((str3 = this.playerNameHindi) != null ? str3.equals(runnerBowler3.playerNameHindi) : runnerBowler3.playerNameHindi == null) && ((str4 = this.playerTeam) != null ? str4.equals(runnerBowler3.playerTeam) : runnerBowler3.playerTeam == null) && ((str5 = this.playerTeamID) != null ? str5.equals(runnerBowler3.playerTeamID) : runnerBowler3.playerTeamID == null) && ((d = this.totalBattingPoints) != null ? d.equals(runnerBowler3.totalBattingPoints) : runnerBowler3.totalBattingPoints == null) && ((d2 = this.totalPoints) != null ? d2.equals(runnerBowler3.totalPoints) : runnerBowler3.totalPoints == null) && ((list = this.battingStatsList) != null ? list.equals(runnerBowler3.battingStatsList) : runnerBowler3.battingStatsList == null) && ((d3 = this.totalBowlingPoints) != null ? d3.equals(runnerBowler3.totalBowlingPoints) : runnerBowler3.totalBowlingPoints == null) && ((d4 = this.totalFieldingPoints) != null ? d4.equals(runnerBowler3.totalFieldingPoints) : runnerBowler3.totalFieldingPoints == null) && ((list2 = this.bowlingStatsList) != null ? list2.equals(runnerBowler3.bowlingStatsList) : runnerBowler3.bowlingStatsList == null) && ((list3 = this.fieldingStatsList) != null ? list3.equals(runnerBowler3.fieldingStatsList) : runnerBowler3.fieldingStatsList == null)) {
                InningWisePoints17 inningWisePoints17 = this.inningWisePoints;
                InningWisePoints17 inningWisePoints172 = runnerBowler3.inningWisePoints;
                if (inningWisePoints17 == null) {
                    if (inningWisePoints172 == null) {
                        return true;
                    }
                } else if (inningWisePoints17.equals(inningWisePoints172)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.playerID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerNameHindi;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerTeam;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerTeamID;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Double d = this.totalBattingPoints;
                int hashCode7 = (hashCode6 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.totalPoints;
                int hashCode8 = (hashCode7 ^ (d2 == null ? 0 : d2.hashCode())) * 1000003;
                List<BattingStatsList17> list = this.battingStatsList;
                int hashCode9 = (hashCode8 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                Double d3 = this.totalBowlingPoints;
                int hashCode10 = (hashCode9 ^ (d3 == null ? 0 : d3.hashCode())) * 1000003;
                Double d4 = this.totalFieldingPoints;
                int hashCode11 = (hashCode10 ^ (d4 == null ? 0 : d4.hashCode())) * 1000003;
                List<BowlingStatsList17> list2 = this.bowlingStatsList;
                int hashCode12 = (hashCode11 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<FieldingStatsList17> list3 = this.fieldingStatsList;
                int hashCode13 = (hashCode12 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                InningWisePoints17 inningWisePoints17 = this.inningWisePoints;
                if (inningWisePoints17 != null) {
                    i = inningWisePoints17.hashCode();
                }
                this.$hashCode = hashCode13 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<RunnerBowler3> {
            final BattingStatsList17.Mapper battingStatsList17FieldMapper = new BattingStatsList17.Mapper();
            final BowlingStatsList17.Mapper bowlingStatsList17FieldMapper = new BowlingStatsList17.Mapper();
            final FieldingStatsList17.Mapper fieldingStatsList17FieldMapper = new FieldingStatsList17.Mapper();
            final InningWisePoints17.Mapper inningWisePoints17FieldMapper = new InningWisePoints17.Mapper();

            @Override 
            public RunnerBowler3 map(ResponseReader responseReader) {
                return new RunnerBowler3(responseReader.readString(RunnerBowler3.$responseFields[0]), responseReader.readString(RunnerBowler3.$responseFields[1]), responseReader.readString(RunnerBowler3.$responseFields[2]), responseReader.readString(RunnerBowler3.$responseFields[3]), responseReader.readString(RunnerBowler3.$responseFields[4]), responseReader.readString(RunnerBowler3.$responseFields[5]), responseReader.readDouble(RunnerBowler3.$responseFields[6]), responseReader.readDouble(RunnerBowler3.$responseFields[7]), responseReader.readList(RunnerBowler3.$responseFields[8], new ResponseReader.ListReader<BattingStatsList17>() {


                    @Override 
                    public BattingStatsList17 read(ResponseReader.ListItemReader listItemReader) {
                        return (BattingStatsList17) listItemReader.readObject(new ResponseReader.ObjectReader<BattingStatsList17>() {


                            @Override 
                            public BattingStatsList17 read(ResponseReader responseReader) {
                                return Mapper.this.battingStatsList17FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readDouble(RunnerBowler3.$responseFields[9]), responseReader.readDouble(RunnerBowler3.$responseFields[10]), responseReader.readList(RunnerBowler3.$responseFields[11], new ResponseReader.ListReader<BowlingStatsList17>() {


                    @Override 
                    public BowlingStatsList17 read(ResponseReader.ListItemReader listItemReader) {
                        return (BowlingStatsList17) listItemReader.readObject(new ResponseReader.ObjectReader<BowlingStatsList17>() {


                            @Override 
                            public BowlingStatsList17 read(ResponseReader responseReader) {
                                return Mapper.this.bowlingStatsList17FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(RunnerBowler3.$responseFields[12], new ResponseReader.ListReader<FieldingStatsList17>() {


                    @Override 
                    public FieldingStatsList17 read(ResponseReader.ListItemReader listItemReader) {
                        return (FieldingStatsList17) listItemReader.readObject(new ResponseReader.ObjectReader<FieldingStatsList17>() {


                            @Override 
                            public FieldingStatsList17 read(ResponseReader responseReader) {
                                return Mapper.this.fieldingStatsList17FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (InningWisePoints17) responseReader.readObject(RunnerBowler3.$responseFields[13], new ResponseReader.ObjectReader<InningWisePoints17>() {


                    @Override 
                    public InningWisePoints17 read(ResponseReader responseReader) {
                        return Mapper.this.inningWisePoints17FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class BattingStatsList17 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runs", "runs", null, true, Collections.emptyList()), ResponseField.forInt("fours", "fours", null, true, Collections.emptyList()), ResponseField.forInt("sixes", "sixes", null, true, Collections.emptyList()), ResponseField.forInt("balls", "balls", null, true, Collections.emptyList()), ResponseField.forDouble("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forBoolean("isNotOut", "isNotOut", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer balls;
        final Integer fours;
        final Boolean isNotOut;
        final Integer runs;
        final Integer sixes;
        final Double strikeRate;

        public BattingStatsList17(String str, Integer num, Integer num2, Integer num3, Integer num4, Double d, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runs = num;
            this.fours = num2;
            this.sixes = num3;
            this.balls = num4;
            this.strikeRate = d;
            this.isNotOut = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runs() {
            return this.runs;
        }

        public Integer fours() {
            return this.fours;
        }

        public Integer sixes() {
            return this.sixes;
        }

        public Integer balls() {
            return this.balls;
        }

        public Double strikeRate() {
            return this.strikeRate;
        }

        public Boolean isNotOut() {
            return this.isNotOut;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BattingStatsList17.$responseFields[0], BattingStatsList17.this.__typename);
                    responseWriter.writeInt(BattingStatsList17.$responseFields[1], BattingStatsList17.this.runs);
                    responseWriter.writeInt(BattingStatsList17.$responseFields[2], BattingStatsList17.this.fours);
                    responseWriter.writeInt(BattingStatsList17.$responseFields[3], BattingStatsList17.this.sixes);
                    responseWriter.writeInt(BattingStatsList17.$responseFields[4], BattingStatsList17.this.balls);
                    responseWriter.writeDouble(BattingStatsList17.$responseFields[5], BattingStatsList17.this.strikeRate);
                    responseWriter.writeBoolean(BattingStatsList17.$responseFields[6], BattingStatsList17.this.isNotOut);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BattingStatsList17{__typename=" + this.__typename + ", runs=" + this.runs + ", fours=" + this.fours + ", sixes=" + this.sixes + ", balls=" + this.balls + ", strikeRate=" + this.strikeRate + ", isNotOut=" + this.isNotOut + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattingStatsList17)) {
                return false;
            }
            BattingStatsList17 battingStatsList17 = (BattingStatsList17) obj;
            if (this.__typename.equals(battingStatsList17.__typename) && ((num = this.runs) != null ? num.equals(battingStatsList17.runs) : battingStatsList17.runs == null) && ((num2 = this.fours) != null ? num2.equals(battingStatsList17.fours) : battingStatsList17.fours == null) && ((num3 = this.sixes) != null ? num3.equals(battingStatsList17.sixes) : battingStatsList17.sixes == null) && ((num4 = this.balls) != null ? num4.equals(battingStatsList17.balls) : battingStatsList17.balls == null) && ((d = this.strikeRate) != null ? d.equals(battingStatsList17.strikeRate) : battingStatsList17.strikeRate == null)) {
                Boolean bool = this.isNotOut;
                Boolean bool2 = battingStatsList17.isNotOut;
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
                Integer num = this.runs;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.fours;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.sixes;
                int hashCode4 = (hashCode3 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.balls;
                int hashCode5 = (hashCode4 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Double d = this.strikeRate;
                int hashCode6 = (hashCode5 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Boolean bool = this.isNotOut;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BattingStatsList17> {
            @Override 
            public BattingStatsList17 map(ResponseReader responseReader) {
                return new BattingStatsList17(responseReader.readString(BattingStatsList17.$responseFields[0]), responseReader.readInt(BattingStatsList17.$responseFields[1]), responseReader.readInt(BattingStatsList17.$responseFields[2]), responseReader.readInt(BattingStatsList17.$responseFields[3]), responseReader.readInt(BattingStatsList17.$responseFields[4]), responseReader.readDouble(BattingStatsList17.$responseFields[5]), responseReader.readBoolean(BattingStatsList17.$responseFields[6]));
            }
        }
    }

    public static class BowlingStatsList17 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forInt("runsConceded", "runsConceded", null, true, Collections.emptyList()), ResponseField.forDouble("economyRate", "economyRate", null, true, Collections.emptyList()), ResponseField.forDouble("overs", "overs", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double economyRate;
        final Double overs;
        final Integer runsConceded;
        final Integer wickets;

        public BowlingStatsList17(String str, Integer num, Integer num2, Double d, Double d2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.wickets = num;
            this.runsConceded = num2;
            this.economyRate = d;
            this.overs = d2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer wickets() {
            return this.wickets;
        }

        public Integer runsConceded() {
            return this.runsConceded;
        }

        public Double economyRate() {
            return this.economyRate;
        }

        public Double overs() {
            return this.overs;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlingStatsList17.$responseFields[0], BowlingStatsList17.this.__typename);
                    responseWriter.writeInt(BowlingStatsList17.$responseFields[1], BowlingStatsList17.this.wickets);
                    responseWriter.writeInt(BowlingStatsList17.$responseFields[2], BowlingStatsList17.this.runsConceded);
                    responseWriter.writeDouble(BowlingStatsList17.$responseFields[3], BowlingStatsList17.this.economyRate);
                    responseWriter.writeDouble(BowlingStatsList17.$responseFields[4], BowlingStatsList17.this.overs);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlingStatsList17{__typename=" + this.__typename + ", wickets=" + this.wickets + ", runsConceded=" + this.runsConceded + ", economyRate=" + this.economyRate + ", overs=" + this.overs + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Double d;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlingStatsList17)) {
                return false;
            }
            BowlingStatsList17 bowlingStatsList17 = (BowlingStatsList17) obj;
            if (this.__typename.equals(bowlingStatsList17.__typename) && ((num = this.wickets) != null ? num.equals(bowlingStatsList17.wickets) : bowlingStatsList17.wickets == null) && ((num2 = this.runsConceded) != null ? num2.equals(bowlingStatsList17.runsConceded) : bowlingStatsList17.runsConceded == null) && ((d = this.economyRate) != null ? d.equals(bowlingStatsList17.economyRate) : bowlingStatsList17.economyRate == null)) {
                Double d2 = this.overs;
                Double d3 = bowlingStatsList17.overs;
                if (d2 == null) {
                    if (d3 == null) {
                        return true;
                    }
                } else if (d2.equals(d3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.wickets;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.runsConceded;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Double d = this.economyRate;
                int hashCode4 = (hashCode3 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.overs;
                if (d2 != null) {
                    i = d2.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlingStatsList17> {
            @Override 
            public BowlingStatsList17 map(ResponseReader responseReader) {
                return new BowlingStatsList17(responseReader.readString(BowlingStatsList17.$responseFields[0]), responseReader.readInt(BowlingStatsList17.$responseFields[1]), responseReader.readInt(BowlingStatsList17.$responseFields[2]), responseReader.readDouble(BowlingStatsList17.$responseFields[3]), responseReader.readDouble(BowlingStatsList17.$responseFields[4]));
            }
        }
    }

    public static class FieldingStatsList17 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("runsOuts", "runsOuts", null, true, Collections.emptyList()), ResponseField.forInt("catches", "catches", null, true, Collections.emptyList()), ResponseField.forInt("stumps", "stumps", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer catches;
        final Integer runsOuts;
        final Integer stumps;

        public FieldingStatsList17(String str, Integer num, Integer num2, Integer num3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.runsOuts = num;
            this.catches = num2;
            this.stumps = num3;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer runsOuts() {
            return this.runsOuts;
        }

        public Integer catches() {
            return this.catches;
        }

        public Integer stumps() {
            return this.stumps;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(FieldingStatsList17.$responseFields[0], FieldingStatsList17.this.__typename);
                    responseWriter.writeInt(FieldingStatsList17.$responseFields[1], FieldingStatsList17.this.runsOuts);
                    responseWriter.writeInt(FieldingStatsList17.$responseFields[2], FieldingStatsList17.this.catches);
                    responseWriter.writeInt(FieldingStatsList17.$responseFields[3], FieldingStatsList17.this.stumps);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FieldingStatsList17{__typename=" + this.__typename + ", runsOuts=" + this.runsOuts + ", catches=" + this.catches + ", stumps=" + this.stumps + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FieldingStatsList17)) {
                return false;
            }
            FieldingStatsList17 fieldingStatsList17 = (FieldingStatsList17) obj;
            if (this.__typename.equals(fieldingStatsList17.__typename) && ((num = this.runsOuts) != null ? num.equals(fieldingStatsList17.runsOuts) : fieldingStatsList17.runsOuts == null) && ((num2 = this.catches) != null ? num2.equals(fieldingStatsList17.catches) : fieldingStatsList17.catches == null)) {
                Integer num3 = this.stumps;
                Integer num4 = fieldingStatsList17.stumps;
                if (num3 == null) {
                    if (num4 == null) {
                        return true;
                    }
                } else if (num3.equals(num4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.runsOuts;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.catches;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.stumps;
                if (num3 != null) {
                    i = num3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<FieldingStatsList17> {
            @Override 
            public FieldingStatsList17 map(ResponseReader responseReader) {
                return new FieldingStatsList17(responseReader.readString(FieldingStatsList17.$responseFields[0]), responseReader.readInt(FieldingStatsList17.$responseFields[1]), responseReader.readInt(FieldingStatsList17.$responseFields[2]), responseReader.readInt(FieldingStatsList17.$responseFields[3]));
            }
        }
    }

    public static class InningWisePoints17 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("inningWiseBattingPoints", "inningWiseBattingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseBowlingPoints", "inningWiseBowlingPoints", null, true, Collections.emptyList()), ResponseField.forList("inningWiseFieldingPoints", "inningWiseFieldingPoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Double> inningWiseBattingPoints;
        final List<Double> inningWiseBowlingPoints;
        final List<Double> inningWiseFieldingPoints;

        public InningWisePoints17(String str, List<Double> list, List<Double> list2, List<Double> list3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.inningWiseBattingPoints = list;
            this.inningWiseBowlingPoints = list2;
            this.inningWiseFieldingPoints = list3;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Double> inningWiseBattingPoints() {
            return this.inningWiseBattingPoints;
        }

        public List<Double> inningWiseBowlingPoints() {
            return this.inningWiseBowlingPoints;
        }

        public List<Double> inningWiseFieldingPoints() {
            return this.inningWiseFieldingPoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(InningWisePoints17.$responseFields[0], InningWisePoints17.this.__typename);
                    responseWriter.writeList(InningWisePoints17.$responseFields[1], InningWisePoints17.this.inningWiseBattingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints17.$responseFields[2], InningWisePoints17.this.inningWiseBowlingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(InningWisePoints17.$responseFields[3], InningWisePoints17.this.inningWiseFieldingPoints, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeDouble((Double) it.next());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "InningWisePoints17{__typename=" + this.__typename + ", inningWiseBattingPoints=" + this.inningWiseBattingPoints + ", inningWiseBowlingPoints=" + this.inningWiseBowlingPoints + ", inningWiseFieldingPoints=" + this.inningWiseFieldingPoints + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<Double> list;
            List<Double> list2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InningWisePoints17)) {
                return false;
            }
            InningWisePoints17 inningWisePoints17 = (InningWisePoints17) obj;
            if (this.__typename.equals(inningWisePoints17.__typename) && ((list = this.inningWiseBattingPoints) != null ? list.equals(inningWisePoints17.inningWiseBattingPoints) : inningWisePoints17.inningWiseBattingPoints == null) && ((list2 = this.inningWiseBowlingPoints) != null ? list2.equals(inningWisePoints17.inningWiseBowlingPoints) : inningWisePoints17.inningWiseBowlingPoints == null)) {
                List<Double> list3 = this.inningWiseFieldingPoints;
                List<Double> list4 = inningWisePoints17.inningWiseFieldingPoints;
                if (list3 == null) {
                    if (list4 == null) {
                        return true;
                    }
                } else if (list3.equals(list4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<Double> list = this.inningWiseBattingPoints;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Double> list2 = this.inningWiseBowlingPoints;
                int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<Double> list3 = this.inningWiseFieldingPoints;
                if (list3 != null) {
                    i = list3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<InningWisePoints17> {
            @Override 
            public InningWisePoints17 map(ResponseReader responseReader) {
                return new InningWisePoints17(responseReader.readString(InningWisePoints17.$responseFields[0]), responseReader.readList(InningWisePoints17.$responseFields[1], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints17.$responseFields[2], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }), responseReader.readList(InningWisePoints17.$responseFields[3], new ResponseReader.ListReader<Double>() {


                    @Override 
                    public Double read(ResponseReader.ListItemReader listItemReader) {
                        return Double.valueOf(listItemReader.readDouble());
                    }
                }));
            }
        }
    }
}
