package com.cricketlivescore.predictiontips;

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
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

public final class GetBallByBallQuery implements Query<GetBallByBallQuery.Data, GetBallByBallQuery.Data, GetBallByBallQuery.Variables> {
    public static final String OPERATION_ID = "53f3a6081191675784865c626b2073185fa915cb2a490b53aaaa2ec90582d310";
    public static final OperationName OPERATION_NAME = new OperationName() {


       @Override
        public String name() {
            return "getBallByBall";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query getBallByBall($matchID: String, $day: Int, $session: Int, $matchType: String, $innings: String) {\n  getBallByBall(matchID: $matchID, day: $day, session: $session, matchType: $matchType, innings: $innings) {\n    __typename\n    overs {\n      __typename\n      over\n      innings\n      balls {\n        __typename\n        type\n        over\n        commentary\n        runs\n        wicket\n        zad\n        isLastBall\n        isOverLastBall\n        batsmanName\n        bowlerName\n        innings\n        overNumber\n        teamID\n        teamName\n        ballNumber\n        summary {\n          __typename\n          score\n          over\n          runs\n          wickets\n          teamShortName\n          batsmen {\n            __typename\n            batsmanName\n            onStrike\n            runs\n            balls\n            fours\n            sixes\n          }\n          bowler {\n            __typename\n            bowlerName\n            overs\n            maidens\n            runs\n            wickets\n          }\n        }\n        inningsdata {\n          __typename\n          score {\n            __typename\n            overs\n            runsScored\n            wickets\n            runRate\n            battingTeamName\n            battingTeamID\n          }\n          battingList {\n            __typename\n            playerID\n            playerName\n            playerTeam\n            playerMatchBalls\n            playerMatchRuns\n            playerBattingNumber\n          }\n          bowlingList {\n            __typename\n            playerID\n            playerName\n            playerTeam\n            playerDotBalls\n            playerWicketsTaken\n            playerMaidensBowled\n            playerRunsConceeded\n          }\n        }\n      }\n      onStrikeBatsmanName\n      onStrikeBatsmanStats\n      nonStrikeBatsmanName\n      nonStrikeBatsmanStats\n      bowlerName\n      bowlerStats\n      teamName\n      summary {\n        __typename\n        score\n        over\n        runs\n        wickets\n        teamShortName\n      }\n      teamShortName\n      isLastBall\n    }\n    inningsSummary {\n      __typename\n      score {\n        __typename\n        overs\n        runsScored\n        wickets\n        runRate\n        battingTeamName\n        battingTeamID\n      }\n      battingList {\n        __typename\n        playerID\n        playerName\n        playerTeam\n        playerMatchBalls\n        playerMatchRuns\n        playerBattingNumber\n      }\n      bowlingList {\n        __typename\n        playerID\n        playerName\n        playerTeam\n        playerDotBalls\n        playerWicketsTaken\n        playerMaidensBowled\n        playerRunsConceeded\n      }\n    }\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public GetBallByBallQuery(Input<String> input, Input<Integer> input2, Input<Integer> input3, Input<String> input4, Input<String> input5) {
        Utils.checkNotNull(input, "matchID == null");
        Utils.checkNotNull(input2, "day == null");
        Utils.checkNotNull(input3, "session == null");
        Utils.checkNotNull(input4, "matchType == null");
        Utils.checkNotNull(input5, "innings == null");
        this.variables = new Variables(input, input2, input3, input4, input5);
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
        private Input<Integer> day = Input.absent();
        private Input<String> innings = Input.absent();
        private Input<String> matchID = Input.absent();
        private Input<String> matchType = Input.absent();
        private Input<Integer> session = Input.absent();

        Builder() {
        }

        public Builder matchID(String str) {
            this.matchID = Input.fromNullable(str);
            return this;
        }

        public Builder day(Integer num) {
            this.day = Input.fromNullable(num);
            return this;
        }

        public Builder session(Integer num) {
            this.session = Input.fromNullable(num);
            return this;
        }

        public Builder matchType(String str) {
            this.matchType = Input.fromNullable(str);
            return this;
        }

        public Builder innings(String str) {
            this.innings = Input.fromNullable(str);
            return this;
        }

        public Builder matchIDInput(Input<String> input) {
            this.matchID = (Input) Utils.checkNotNull(input, "matchID == null");
            return this;
        }

        public Builder dayInput(Input<Integer> input) {
            this.day = (Input) Utils.checkNotNull(input, "day == null");
            return this;
        }

        public Builder sessionInput(Input<Integer> input) {
            this.session = (Input) Utils.checkNotNull(input, "session == null");
            return this;
        }

        public Builder matchTypeInput(Input<String> input) {
            this.matchType = (Input) Utils.checkNotNull(input, "matchType == null");
            return this;
        }

        public Builder inningsInput(Input<String> input) {
            this.innings = (Input) Utils.checkNotNull(input, "innings == null");
            return this;
        }

        public GetBallByBallQuery build() {
            return new GetBallByBallQuery(this.matchID, this.day, this.session, this.matchType, this.innings);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final Input<Integer> day;
        private final Input<String> innings;
        private final Input<String> matchID;
        private final Input<String> matchType;
        private final Input<Integer> session;
        private final transient Map<String, Object> valueMap;

        Variables(Input<String> input, Input<Integer> input2, Input<Integer> input3, Input<String> input4, Input<String> input5) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.matchID = input;
            this.day = input2;
            this.session = input3;
            this.matchType = input4;
            this.innings = input5;
            if (input.defined) {
                linkedHashMap.put("matchID", input.value);
            }
            if (input2.defined) {
                linkedHashMap.put("day", input2.value);
            }
            if (input3.defined) {
                linkedHashMap.put("session", input3.value);
            }
            if (input4.defined) {
                linkedHashMap.put("matchType", input4.value);
            }
            if (input5.defined) {
                linkedHashMap.put("innings", input5.value);
            }
        }

        public Input<String> matchID() {
            return this.matchID;
        }

        public Input<Integer> day() {
            return this.day;
        }

        public Input<Integer> session() {
            return this.session;
        }

        public Input<String> matchType() {
            return this.matchType;
        }

        public Input<String> innings() {
            return this.innings;
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
                    if (Variables.this.matchID.defined) {
                        inputFieldWriter.writeString("matchID", Variables.this.matchID.value);
                    }
                    if (Variables.this.day.defined) {
                        inputFieldWriter.writeInt("day", Variables.this.day.value);
                    }
                    if (Variables.this.session.defined) {
                        inputFieldWriter.writeInt("session", Variables.this.session.value);
                    }
                    if (Variables.this.matchType.defined) {
                        inputFieldWriter.writeString("matchType", Variables.this.matchType.value);
                    }
                    if (Variables.this.innings.defined) {
                        inputFieldWriter.writeString("innings", Variables.this.innings.value);
                    }
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forList("getBallByBall", "getBallByBall", new UnmodifiableMapBuilder(5).put("matchID", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "matchID").build()).put("day", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "day").build()).put("session", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "session").build()).put("matchType", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "matchType").build()).put("innings", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "innings").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final List<GetBallByBall> getBallByBall;

        public Data(List<GetBallByBall> list) {
            this.getBallByBall = list;
        }

        public List<GetBallByBall> getBallByBall() {
            return this.getBallByBall;
        }

      @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeList(Data.$responseFields[0], Data.this.getBallByBall, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((GetBallByBall) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getBallByBall=" + this.getBallByBall + "}";
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
            List<GetBallByBall> list = this.getBallByBall;
            List<GetBallByBall> list2 = ((Data) obj).getBallByBall;
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
                List<GetBallByBall> list = this.getBallByBall;
                this.$hashCode = 1000003 ^ (list == null ? 0 : list.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetBallByBall.Mapper getBallByBallFieldMapper = new GetBallByBall.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data(responseReader.readList(Data.$responseFields[0], new ResponseReader.ListReader<GetBallByBall>() {


                    @Override 
                    public GetBallByBall read(ResponseReader.ListItemReader listItemReader) {
                        return (GetBallByBall) listItemReader.readObject(new ResponseReader.ObjectReader<GetBallByBall>() {


                            @Override 
                            public GetBallByBall read(ResponseReader responseReader) {
                                return Mapper.this.getBallByBallFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class GetBallByBall {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("overs", "overs", null, true, Collections.emptyList()), ResponseField.forList("inningsSummary", "inningsSummary", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<InningsSummary> inningsSummary;
        final List<Over> overs;

        public GetBallByBall(String str, List<Over> list, List<InningsSummary> list2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.overs = list;
            this.inningsSummary = list2;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Over> overs() {
            return this.overs;
        }

        public List<InningsSummary> inningsSummary() {
            return this.inningsSummary;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(GetBallByBall.$responseFields[0], GetBallByBall.this.__typename);
                    responseWriter.writeList(GetBallByBall.$responseFields[1], GetBallByBall.this.overs, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Over) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(GetBallByBall.$responseFields[2], GetBallByBall.this.inningsSummary, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((InningsSummary) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetBallByBall{__typename=" + this.__typename + ", overs=" + this.overs + ", inningsSummary=" + this.inningsSummary + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<Over> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetBallByBall)) {
                return false;
            }
            GetBallByBall getBallByBall = (GetBallByBall) obj;
            if (this.__typename.equals(getBallByBall.__typename) && ((list = this.overs) != null ? list.equals(getBallByBall.overs) : getBallByBall.overs == null)) {
                List<InningsSummary> list2 = this.inningsSummary;
                List<InningsSummary> list3 = getBallByBall.inningsSummary;
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
                List<Over> list = this.overs;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<InningsSummary> list2 = this.inningsSummary;
                if (list2 != null) {
                    i = list2.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<GetBallByBall> {
            final InningsSummary.Mapper inningsSummaryFieldMapper = new InningsSummary.Mapper();
            final Over.Mapper overFieldMapper = new Over.Mapper();

            @Override 
            public GetBallByBall map(ResponseReader responseReader) {
                return new GetBallByBall(responseReader.readString(GetBallByBall.$responseFields[0]), responseReader.readList(GetBallByBall.$responseFields[1], new ResponseReader.ListReader<Over>() {


                    @Override 
                    public Over read(ResponseReader.ListItemReader listItemReader) {
                        return (Over) listItemReader.readObject(new ResponseReader.ObjectReader<Over>() {


                            @Override 
                            public Over read(ResponseReader responseReader) {
                                return Mapper.this.overFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(GetBallByBall.$responseFields[2], new ResponseReader.ListReader<InningsSummary>() {


                    @Override 
                    public InningsSummary read(ResponseReader.ListItemReader listItemReader) {
                        return (InningsSummary) listItemReader.readObject(new ResponseReader.ObjectReader<InningsSummary>() {


                            @Override 
                            public InningsSummary read(ResponseReader responseReader) {
                                return Mapper.this.inningsSummaryFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class Over {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("over", "over", null, true, Collections.emptyList()), ResponseField.forString("innings", "innings", null, true, Collections.emptyList()), ResponseField.forList("balls", "balls", null, true, Collections.emptyList()), ResponseField.forString("onStrikeBatsmanName", "onStrikeBatsmanName", null, true, Collections.emptyList()), ResponseField.forString("onStrikeBatsmanStats", "onStrikeBatsmanStats", null, true, Collections.emptyList()), ResponseField.forString("nonStrikeBatsmanName", "nonStrikeBatsmanName", null, true, Collections.emptyList()), ResponseField.forString("nonStrikeBatsmanStats", "nonStrikeBatsmanStats", null, true, Collections.emptyList()), ResponseField.forString("bowlerName", "bowlerName", null, true, Collections.emptyList()), ResponseField.forString("bowlerStats", "bowlerStats", null, true, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, true, Collections.emptyList()), ResponseField.forObject("summary", "summary", null, true, Collections.emptyList()), ResponseField.forString("teamShortName", "teamShortName", null, true, Collections.emptyList()), ResponseField.forBoolean("isLastBall", "isLastBall", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Ball> balls;
        final String bowlerName;
        final String bowlerStats;
        final String innings;
        final Boolean isLastBall;
        final String nonStrikeBatsmanName;
        final String nonStrikeBatsmanStats;
        final String onStrikeBatsmanName;
        final String onStrikeBatsmanStats;
        final String over;
        final Summary1 summary;
        final String teamName;
        final String teamShortName;

        public Over(String str, String str2, String str3, List<Ball> list, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Summary1 summary1, String str11, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.over = str2;
            this.innings = str3;
            this.balls = list;
            this.onStrikeBatsmanName = str4;
            this.onStrikeBatsmanStats = str5;
            this.nonStrikeBatsmanName = str6;
            this.nonStrikeBatsmanStats = str7;
            this.bowlerName = str8;
            this.bowlerStats = str9;
            this.teamName = str10;
            this.summary = summary1;
            this.teamShortName = str11;
            this.isLastBall = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public String over() {
            return this.over;
        }

        public String innings() {
            return this.innings;
        }

        public List<Ball> balls() {
            return this.balls;
        }

        public String onStrikeBatsmanName() {
            return this.onStrikeBatsmanName;
        }

        public String onStrikeBatsmanStats() {
            return this.onStrikeBatsmanStats;
        }

        public String nonStrikeBatsmanName() {
            return this.nonStrikeBatsmanName;
        }

        public String nonStrikeBatsmanStats() {
            return this.nonStrikeBatsmanStats;
        }

        public String bowlerName() {
            return this.bowlerName;
        }

        public String bowlerStats() {
            return this.bowlerStats;
        }

        public String teamName() {
            return this.teamName;
        }

        public Summary1 summary() {
            return this.summary;
        }

        public String teamShortName() {
            return this.teamShortName;
        }

        public Boolean isLastBall() {
            return this.isLastBall;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Over.$responseFields[0], Over.this.__typename);
                    responseWriter.writeString(Over.$responseFields[1], Over.this.over);
                    responseWriter.writeString(Over.$responseFields[2], Over.this.innings);
                    responseWriter.writeList(Over.$responseFields[3], Over.this.balls, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Ball) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeString(Over.$responseFields[4], Over.this.onStrikeBatsmanName);
                    responseWriter.writeString(Over.$responseFields[5], Over.this.onStrikeBatsmanStats);
                    responseWriter.writeString(Over.$responseFields[6], Over.this.nonStrikeBatsmanName);
                    responseWriter.writeString(Over.$responseFields[7], Over.this.nonStrikeBatsmanStats);
                    responseWriter.writeString(Over.$responseFields[8], Over.this.bowlerName);
                    responseWriter.writeString(Over.$responseFields[9], Over.this.bowlerStats);
                    responseWriter.writeString(Over.$responseFields[10], Over.this.teamName);
                    responseWriter.writeObject(Over.$responseFields[11], Over.this.summary != null ? Over.this.summary.marshaller() : null);
                    responseWriter.writeString(Over.$responseFields[12], Over.this.teamShortName);
                    responseWriter.writeBoolean(Over.$responseFields[13], Over.this.isLastBall);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Over{__typename=" + this.__typename + ", over=" + this.over + ", innings=" + this.innings + ", balls=" + this.balls + ", onStrikeBatsmanName=" + this.onStrikeBatsmanName + ", onStrikeBatsmanStats=" + this.onStrikeBatsmanStats + ", nonStrikeBatsmanName=" + this.nonStrikeBatsmanName + ", nonStrikeBatsmanStats=" + this.nonStrikeBatsmanStats + ", bowlerName=" + this.bowlerName + ", bowlerStats=" + this.bowlerStats + ", teamName=" + this.teamName + ", summary=" + this.summary + ", teamShortName=" + this.teamShortName + ", isLastBall=" + this.isLastBall + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            List<Ball> list;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            Summary1 summary1;
            String str10;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Over)) {
                return false;
            }
            Over over2 = (Over) obj;
            if (this.__typename.equals(over2.__typename) && ((str = this.over) != null ? str.equals(over2.over) : over2.over == null) && ((str2 = this.innings) != null ? str2.equals(over2.innings) : over2.innings == null) && ((list = this.balls) != null ? list.equals(over2.balls) : over2.balls == null) && ((str3 = this.onStrikeBatsmanName) != null ? str3.equals(over2.onStrikeBatsmanName) : over2.onStrikeBatsmanName == null) && ((str4 = this.onStrikeBatsmanStats) != null ? str4.equals(over2.onStrikeBatsmanStats) : over2.onStrikeBatsmanStats == null) && ((str5 = this.nonStrikeBatsmanName) != null ? str5.equals(over2.nonStrikeBatsmanName) : over2.nonStrikeBatsmanName == null) && ((str6 = this.nonStrikeBatsmanStats) != null ? str6.equals(over2.nonStrikeBatsmanStats) : over2.nonStrikeBatsmanStats == null) && ((str7 = this.bowlerName) != null ? str7.equals(over2.bowlerName) : over2.bowlerName == null) && ((str8 = this.bowlerStats) != null ? str8.equals(over2.bowlerStats) : over2.bowlerStats == null) && ((str9 = this.teamName) != null ? str9.equals(over2.teamName) : over2.teamName == null) && ((summary1 = this.summary) != null ? summary1.equals(over2.summary) : over2.summary == null) && ((str10 = this.teamShortName) != null ? str10.equals(over2.teamShortName) : over2.teamShortName == null)) {
                Boolean bool = this.isLastBall;
                Boolean bool2 = over2.isLastBall;
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
                String str = this.over;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.innings;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                List<Ball> list = this.balls;
                int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str3 = this.onStrikeBatsmanName;
                int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.onStrikeBatsmanStats;
                int hashCode6 = (hashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.nonStrikeBatsmanName;
                int hashCode7 = (hashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.nonStrikeBatsmanStats;
                int hashCode8 = (hashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.bowlerName;
                int hashCode9 = (hashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.bowlerStats;
                int hashCode10 = (hashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.teamName;
                int hashCode11 = (hashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                Summary1 summary1 = this.summary;
                int hashCode12 = (hashCode11 ^ (summary1 == null ? 0 : summary1.hashCode())) * 1000003;
                String str10 = this.teamShortName;
                int hashCode13 = (hashCode12 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                Boolean bool = this.isLastBall;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode13 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Over> {
            final Ball.Mapper ballFieldMapper = new Ball.Mapper();
            final Summary1.Mapper summary1FieldMapper = new Summary1.Mapper();

            @Override 
            public Over map(ResponseReader responseReader) {
                return new Over(responseReader.readString(Over.$responseFields[0]), responseReader.readString(Over.$responseFields[1]), responseReader.readString(Over.$responseFields[2]), responseReader.readList(Over.$responseFields[3], new ResponseReader.ListReader<Ball>() {


                    @Override 
                    public Ball read(ResponseReader.ListItemReader listItemReader) {
                        return (Ball) listItemReader.readObject(new ResponseReader.ObjectReader<Ball>() {


                            @Override 
                            public Ball read(ResponseReader responseReader) {
                                return Mapper.this.ballFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readString(Over.$responseFields[4]), responseReader.readString(Over.$responseFields[5]), responseReader.readString(Over.$responseFields[6]), responseReader.readString(Over.$responseFields[7]), responseReader.readString(Over.$responseFields[8]), responseReader.readString(Over.$responseFields[9]), responseReader.readString(Over.$responseFields[10]), (Summary1) responseReader.readObject(Over.$responseFields[11], new ResponseReader.ObjectReader<Summary1>() {


                    @Override 
                    public Summary1 read(ResponseReader responseReader) {
                        return Mapper.this.summary1FieldMapper.map(responseReader);
                    }
                }), responseReader.readString(Over.$responseFields[12]), responseReader.readBoolean(Over.$responseFields[13]));
            }
        }
    }

    public static class Ball {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("type", "type", null, true, Collections.emptyList()), ResponseField.forString("over", "over", null, true, Collections.emptyList()), ResponseField.forString("commentary", "commentary", null, true, Collections.emptyList()), ResponseField.forString("runs", "runs", null, true, Collections.emptyList()), ResponseField.forBoolean("wicket", "wicket", null, true, Collections.emptyList()), ResponseField.forString("zad", "zad", null, true, Collections.emptyList()), ResponseField.forBoolean("isLastBall", "isLastBall", null, true, Collections.emptyList()), ResponseField.forBoolean("isOverLastBall", "isOverLastBall", null, true, Collections.emptyList()), ResponseField.forString("batsmanName", "batsmanName", null, true, Collections.emptyList()), ResponseField.forString("bowlerName", "bowlerName", null, true, Collections.emptyList()), ResponseField.forString("innings", "innings", null, true, Collections.emptyList()), ResponseField.forString("overNumber", "overNumber", null, true, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, true, Collections.emptyList()), ResponseField.forString("ballNumber", "ballNumber", null, true, Collections.emptyList()), ResponseField.forObject("summary", "summary", null, true, Collections.emptyList()), ResponseField.forObject("inningsdata", "inningsdata", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String ballNumber;
        final String batsmanName;
        final String bowlerName;
        final String commentary;
        final String innings;
        final Inningsdata inningsdata;
        final Boolean isLastBall;
        final Boolean isOverLastBall;
        final String over;
        final String overNumber;
        final String runs;
        final Summary summary;
        final String teamID;
        final String teamName;
        final String type;
        final Boolean wicket;
        final String zad;

        public Ball(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, Boolean bool2, Boolean bool3, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Summary summary2, Inningsdata inningsdata2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.type = str2;
            this.over = str3;
            this.commentary = str4;
            this.runs = str5;
            this.wicket = bool;
            this.zad = str6;
            this.isLastBall = bool2;
            this.isOverLastBall = bool3;
            this.batsmanName = str7;
            this.bowlerName = str8;
            this.innings = str9;
            this.overNumber = str10;
            this.teamID = str11;
            this.teamName = str12;
            this.ballNumber = str13;
            this.summary = summary2;
            this.inningsdata = inningsdata2;
        }

        public String __typename() {
            return this.__typename;
        }

        public String type() {
            return this.type;
        }

        public String over() {
            return this.over;
        }

        public String commentary() {
            return this.commentary;
        }

        public String runs() {
            return this.runs;
        }

        public Boolean wicket() {
            return this.wicket;
        }

        public String zad() {
            return this.zad;
        }

        public Boolean isLastBall() {
            return this.isLastBall;
        }

        public Boolean isOverLastBall() {
            return this.isOverLastBall;
        }

        public String batsmanName() {
            return this.batsmanName;
        }

        public String bowlerName() {
            return this.bowlerName;
        }

        public String innings() {
            return this.innings;
        }

        public String overNumber() {
            return this.overNumber;
        }

        public String teamID() {
            return this.teamID;
        }

        public String teamName() {
            return this.teamName;
        }

        public String ballNumber() {
            return this.ballNumber;
        }

        public Summary summary() {
            return this.summary;
        }

        public Inningsdata inningsdata() {
            return this.inningsdata;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Ball.$responseFields[0], Ball.this.__typename);
                    responseWriter.writeString(Ball.$responseFields[1], Ball.this.type);
                    responseWriter.writeString(Ball.$responseFields[2], Ball.this.over);
                    responseWriter.writeString(Ball.$responseFields[3], Ball.this.commentary);
                    responseWriter.writeString(Ball.$responseFields[4], Ball.this.runs);
                    responseWriter.writeBoolean(Ball.$responseFields[5], Ball.this.wicket);
                    responseWriter.writeString(Ball.$responseFields[6], Ball.this.zad);
                    responseWriter.writeBoolean(Ball.$responseFields[7], Ball.this.isLastBall);
                    responseWriter.writeBoolean(Ball.$responseFields[8], Ball.this.isOverLastBall);
                    responseWriter.writeString(Ball.$responseFields[9], Ball.this.batsmanName);
                    responseWriter.writeString(Ball.$responseFields[10], Ball.this.bowlerName);
                    responseWriter.writeString(Ball.$responseFields[11], Ball.this.innings);
                    responseWriter.writeString(Ball.$responseFields[12], Ball.this.overNumber);
                    responseWriter.writeString(Ball.$responseFields[13], Ball.this.teamID);
                    responseWriter.writeString(Ball.$responseFields[14], Ball.this.teamName);
                    responseWriter.writeString(Ball.$responseFields[15], Ball.this.ballNumber);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(Ball.$responseFields[16], Ball.this.summary != null ? Ball.this.summary.marshaller() : null);
                    ResponseField responseField = Ball.$responseFields[17];
                    if (Ball.this.inningsdata != null) {
                        responseFieldMarshaller = Ball.this.inningsdata.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Ball{__typename=" + this.__typename + ", type=" + this.type + ", over=" + this.over + ", commentary=" + this.commentary + ", runs=" + this.runs + ", wicket=" + this.wicket + ", zad=" + this.zad + ", isLastBall=" + this.isLastBall + ", isOverLastBall=" + this.isOverLastBall + ", batsmanName=" + this.batsmanName + ", bowlerName=" + this.bowlerName + ", innings=" + this.innings + ", overNumber=" + this.overNumber + ", teamID=" + this.teamID + ", teamName=" + this.teamName + ", ballNumber=" + this.ballNumber + ", summary=" + this.summary + ", inningsdata=" + this.inningsdata + "}";
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
            Boolean bool2;
            Boolean bool3;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            Summary summary2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Ball)) {
                return false;
            }
            Ball ball = (Ball) obj;
            if (this.__typename.equals(ball.__typename) && ((str = this.type) != null ? str.equals(ball.type) : ball.type == null) && ((str2 = this.over) != null ? str2.equals(ball.over) : ball.over == null) && ((str3 = this.commentary) != null ? str3.equals(ball.commentary) : ball.commentary == null) && ((str4 = this.runs) != null ? str4.equals(ball.runs) : ball.runs == null) && ((bool = this.wicket) != null ? bool.equals(ball.wicket) : ball.wicket == null) && ((str5 = this.zad) != null ? str5.equals(ball.zad) : ball.zad == null) && ((bool2 = this.isLastBall) != null ? bool2.equals(ball.isLastBall) : ball.isLastBall == null) && ((bool3 = this.isOverLastBall) != null ? bool3.equals(ball.isOverLastBall) : ball.isOverLastBall == null) && ((str6 = this.batsmanName) != null ? str6.equals(ball.batsmanName) : ball.batsmanName == null) && ((str7 = this.bowlerName) != null ? str7.equals(ball.bowlerName) : ball.bowlerName == null) && ((str8 = this.innings) != null ? str8.equals(ball.innings) : ball.innings == null) && ((str9 = this.overNumber) != null ? str9.equals(ball.overNumber) : ball.overNumber == null) && ((str10 = this.teamID) != null ? str10.equals(ball.teamID) : ball.teamID == null) && ((str11 = this.teamName) != null ? str11.equals(ball.teamName) : ball.teamName == null) && ((str12 = this.ballNumber) != null ? str12.equals(ball.ballNumber) : ball.ballNumber == null) && ((summary2 = this.summary) != null ? summary2.equals(ball.summary) : ball.summary == null)) {
                Inningsdata inningsdata2 = this.inningsdata;
                Inningsdata inningsdata3 = ball.inningsdata;
                if (inningsdata2 == null) {
                    if (inningsdata3 == null) {
                        return true;
                    }
                } else if (inningsdata2.equals(inningsdata3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.type;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.over;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.commentary;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.runs;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                Boolean bool = this.wicket;
                int hashCode6 = (hashCode5 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str5 = this.zad;
                int hashCode7 = (hashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Boolean bool2 = this.isLastBall;
                int hashCode8 = (hashCode7 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                Boolean bool3 = this.isOverLastBall;
                int hashCode9 = (hashCode8 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
                String str6 = this.batsmanName;
                int hashCode10 = (hashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.bowlerName;
                int hashCode11 = (hashCode10 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.innings;
                int hashCode12 = (hashCode11 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.overNumber;
                int hashCode13 = (hashCode12 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.teamID;
                int hashCode14 = (hashCode13 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.teamName;
                int hashCode15 = (hashCode14 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.ballNumber;
                int hashCode16 = (hashCode15 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                Summary summary2 = this.summary;
                int hashCode17 = (hashCode16 ^ (summary2 == null ? 0 : summary2.hashCode())) * 1000003;
                Inningsdata inningsdata2 = this.inningsdata;
                if (inningsdata2 != null) {
                    i = inningsdata2.hashCode();
                }
                this.$hashCode = hashCode17 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Ball> {
            final Inningsdata.Mapper inningsdataFieldMapper = new Inningsdata.Mapper();
            final Summary.Mapper summaryFieldMapper = new Summary.Mapper();

            @Override 
            public Ball map(ResponseReader responseReader) {
                return new Ball(responseReader.readString(Ball.$responseFields[0]), responseReader.readString(Ball.$responseFields[1]), responseReader.readString(Ball.$responseFields[2]), responseReader.readString(Ball.$responseFields[3]), responseReader.readString(Ball.$responseFields[4]), responseReader.readBoolean(Ball.$responseFields[5]), responseReader.readString(Ball.$responseFields[6]), responseReader.readBoolean(Ball.$responseFields[7]), responseReader.readBoolean(Ball.$responseFields[8]), responseReader.readString(Ball.$responseFields[9]), responseReader.readString(Ball.$responseFields[10]), responseReader.readString(Ball.$responseFields[11]), responseReader.readString(Ball.$responseFields[12]), responseReader.readString(Ball.$responseFields[13]), responseReader.readString(Ball.$responseFields[14]), responseReader.readString(Ball.$responseFields[15]), (Summary) responseReader.readObject(Ball.$responseFields[16], new ResponseReader.ObjectReader<Summary>() {


                    @Override 
                    public Summary read(ResponseReader responseReader) {
                        return Mapper.this.summaryFieldMapper.map(responseReader);
                    }
                }), (Inningsdata) responseReader.readObject(Ball.$responseFields[17], new ResponseReader.ObjectReader<Inningsdata>() {


                    @Override 
                    public Inningsdata read(ResponseReader responseReader) {
                        return Mapper.this.inningsdataFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class Summary {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.SCORE, FirebaseAnalytics.Param.SCORE, null, true, Collections.emptyList()), ResponseField.forString("over", "over", null, true, Collections.emptyList()), ResponseField.forString("runs", "runs", null, true, Collections.emptyList()), ResponseField.forString("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forString("teamShortName", "teamShortName", null, true, Collections.emptyList()), ResponseField.forList("batsmen", "batsmen", null, true, Collections.emptyList()), ResponseField.forList("bowler", "bowler", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Batsmen> batsmen;
        final List<Bowler> bowler;
        final String over;
        final String runs;
        final String score;
        final String teamShortName;
        final String wickets;

        public Summary(String str, String str2, String str3, String str4, String str5, String str6, List<Batsmen> list, List<Bowler> list2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.score = str2;
            this.over = str3;
            this.runs = str4;
            this.wickets = str5;
            this.teamShortName = str6;
            this.batsmen = list;
            this.bowler = list2;
        }

        public String __typename() {
            return this.__typename;
        }

        public String score() {
            return this.score;
        }

        public String over() {
            return this.over;
        }

        public String runs() {
            return this.runs;
        }

        public String wickets() {
            return this.wickets;
        }

        public String teamShortName() {
            return this.teamShortName;
        }

        public List<Batsmen> batsmen() {
            return this.batsmen;
        }

        public List<Bowler> bowler() {
            return this.bowler;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Summary.$responseFields[0], Summary.this.__typename);
                    responseWriter.writeString(Summary.$responseFields[1], Summary.this.score);
                    responseWriter.writeString(Summary.$responseFields[2], Summary.this.over);
                    responseWriter.writeString(Summary.$responseFields[3], Summary.this.runs);
                    responseWriter.writeString(Summary.$responseFields[4], Summary.this.wickets);
                    responseWriter.writeString(Summary.$responseFields[5], Summary.this.teamShortName);
                    responseWriter.writeList(Summary.$responseFields[6], Summary.this.batsmen, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Batsmen) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(Summary.$responseFields[7], Summary.this.bowler, new ResponseWriter.ListWriter() {


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
                this.$toString = "Summary{__typename=" + this.__typename + ", score=" + this.score + ", over=" + this.over + ", runs=" + this.runs + ", wickets=" + this.wickets + ", teamShortName=" + this.teamShortName + ", batsmen=" + this.batsmen + ", bowler=" + this.bowler + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            List<Batsmen> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Summary)) {
                return false;
            }
            Summary summary = (Summary) obj;
            if (this.__typename.equals(summary.__typename) && ((str = this.score) != null ? str.equals(summary.score) : summary.score == null) && ((str2 = this.over) != null ? str2.equals(summary.over) : summary.over == null) && ((str3 = this.runs) != null ? str3.equals(summary.runs) : summary.runs == null) && ((str4 = this.wickets) != null ? str4.equals(summary.wickets) : summary.wickets == null) && ((str5 = this.teamShortName) != null ? str5.equals(summary.teamShortName) : summary.teamShortName == null) && ((list = this.batsmen) != null ? list.equals(summary.batsmen) : summary.batsmen == null)) {
                List<Bowler> list2 = this.bowler;
                List<Bowler> list3 = summary.bowler;
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
                String str = this.score;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.over;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.runs;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.wickets;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.teamShortName;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                List<Batsmen> list = this.batsmen;
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

        public static final class Mapper implements ResponseFieldMapper<Summary> {
            final Batsmen.Mapper batsmenFieldMapper = new Batsmen.Mapper();
            final Bowler.Mapper bowlerFieldMapper = new Bowler.Mapper();

            @Override 
            public Summary map(ResponseReader responseReader) {
                return new Summary(responseReader.readString(Summary.$responseFields[0]), responseReader.readString(Summary.$responseFields[1]), responseReader.readString(Summary.$responseFields[2]), responseReader.readString(Summary.$responseFields[3]), responseReader.readString(Summary.$responseFields[4]), responseReader.readString(Summary.$responseFields[5]), responseReader.readList(Summary.$responseFields[6], new ResponseReader.ListReader<Batsmen>() {


                    @Override 
                    public Batsmen read(ResponseReader.ListItemReader listItemReader) {
                        return (Batsmen) listItemReader.readObject(new ResponseReader.ObjectReader<Batsmen>() {


                            @Override 
                            public Batsmen read(ResponseReader responseReader) {
                                return Mapper.this.batsmenFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(Summary.$responseFields[7], new ResponseReader.ListReader<Bowler>() {


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

    public static class Batsmen {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("batsmanName", "batsmanName", null, true, Collections.emptyList()), ResponseField.forBoolean("onStrike", "onStrike", null, true, Collections.emptyList()), ResponseField.forString("runs", "runs", null, true, Collections.emptyList()), ResponseField.forString("balls", "balls", null, true, Collections.emptyList()), ResponseField.forString("fours", "fours", null, true, Collections.emptyList()), ResponseField.forString("sixes", "sixes", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String balls;
        final String batsmanName;
        final String fours;
        final Boolean onStrike;
        final String runs;
        final String sixes;

        public Batsmen(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.batsmanName = str2;
            this.onStrike = bool;
            this.runs = str3;
            this.balls = str4;
            this.fours = str5;
            this.sixes = str6;
        }

        public String __typename() {
            return this.__typename;
        }

        public String batsmanName() {
            return this.batsmanName;
        }

        public Boolean onStrike() {
            return this.onStrike;
        }

        public String runs() {
            return this.runs;
        }

        public String balls() {
            return this.balls;
        }

        public String fours() {
            return this.fours;
        }

        public String sixes() {
            return this.sixes;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Batsmen.$responseFields[0], Batsmen.this.__typename);
                    responseWriter.writeString(Batsmen.$responseFields[1], Batsmen.this.batsmanName);
                    responseWriter.writeBoolean(Batsmen.$responseFields[2], Batsmen.this.onStrike);
                    responseWriter.writeString(Batsmen.$responseFields[3], Batsmen.this.runs);
                    responseWriter.writeString(Batsmen.$responseFields[4], Batsmen.this.balls);
                    responseWriter.writeString(Batsmen.$responseFields[5], Batsmen.this.fours);
                    responseWriter.writeString(Batsmen.$responseFields[6], Batsmen.this.sixes);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Batsmen{__typename=" + this.__typename + ", batsmanName=" + this.batsmanName + ", onStrike=" + this.onStrike + ", runs=" + this.runs + ", balls=" + this.balls + ", fours=" + this.fours + ", sixes=" + this.sixes + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            Boolean bool;
            String str2;
            String str3;
            String str4;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Batsmen)) {
                return false;
            }
            Batsmen batsmen = (Batsmen) obj;
            if (this.__typename.equals(batsmen.__typename) && ((str = this.batsmanName) != null ? str.equals(batsmen.batsmanName) : batsmen.batsmanName == null) && ((bool = this.onStrike) != null ? bool.equals(batsmen.onStrike) : batsmen.onStrike == null) && ((str2 = this.runs) != null ? str2.equals(batsmen.runs) : batsmen.runs == null) && ((str3 = this.balls) != null ? str3.equals(batsmen.balls) : batsmen.balls == null) && ((str4 = this.fours) != null ? str4.equals(batsmen.fours) : batsmen.fours == null)) {
                String str5 = this.sixes;
                String str6 = batsmen.sixes;
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
                String str = this.batsmanName;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Boolean bool = this.onStrike;
                int hashCode3 = (hashCode2 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str2 = this.runs;
                int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.balls;
                int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.fours;
                int hashCode6 = (hashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.sixes;
                if (str5 != null) {
                    i = str5.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Batsmen> {
            @Override 
            public Batsmen map(ResponseReader responseReader) {
                return new Batsmen(responseReader.readString(Batsmen.$responseFields[0]), responseReader.readString(Batsmen.$responseFields[1]), responseReader.readBoolean(Batsmen.$responseFields[2]), responseReader.readString(Batsmen.$responseFields[3]), responseReader.readString(Batsmen.$responseFields[4]), responseReader.readString(Batsmen.$responseFields[5]), responseReader.readString(Batsmen.$responseFields[6]));
            }
        }
    }

    public static class Bowler {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("bowlerName", "bowlerName", null, true, Collections.emptyList()), ResponseField.forString("overs", "overs", null, true, Collections.emptyList()), ResponseField.forString("maidens", "maidens", null, true, Collections.emptyList()), ResponseField.forString("runs", "runs", null, true, Collections.emptyList()), ResponseField.forString("wickets", "wickets", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String bowlerName;
        final String maidens;
        final String overs;
        final String runs;
        final String wickets;

        public Bowler(String str, String str2, String str3, String str4, String str5, String str6) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.bowlerName = str2;
            this.overs = str3;
            this.maidens = str4;
            this.runs = str5;
            this.wickets = str6;
        }

        public String __typename() {
            return this.__typename;
        }

        public String bowlerName() {
            return this.bowlerName;
        }

        public String overs() {
            return this.overs;
        }

        public String maidens() {
            return this.maidens;
        }

        public String runs() {
            return this.runs;
        }

        public String wickets() {
            return this.wickets;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Bowler.$responseFields[0], Bowler.this.__typename);
                    responseWriter.writeString(Bowler.$responseFields[1], Bowler.this.bowlerName);
                    responseWriter.writeString(Bowler.$responseFields[2], Bowler.this.overs);
                    responseWriter.writeString(Bowler.$responseFields[3], Bowler.this.maidens);
                    responseWriter.writeString(Bowler.$responseFields[4], Bowler.this.runs);
                    responseWriter.writeString(Bowler.$responseFields[5], Bowler.this.wickets);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Bowler{__typename=" + this.__typename + ", bowlerName=" + this.bowlerName + ", overs=" + this.overs + ", maidens=" + this.maidens + ", runs=" + this.runs + ", wickets=" + this.wickets + "}";
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
            if (this.__typename.equals(bowler.__typename) && ((str = this.bowlerName) != null ? str.equals(bowler.bowlerName) : bowler.bowlerName == null) && ((str2 = this.overs) != null ? str2.equals(bowler.overs) : bowler.overs == null) && ((str3 = this.maidens) != null ? str3.equals(bowler.maidens) : bowler.maidens == null) && ((str4 = this.runs) != null ? str4.equals(bowler.runs) : bowler.runs == null)) {
                String str5 = this.wickets;
                String str6 = bowler.wickets;
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
                String str = this.bowlerName;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.overs;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.maidens;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.runs;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.wickets;
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

    public static class Inningsdata {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forObject(FirebaseAnalytics.Param.SCORE, FirebaseAnalytics.Param.SCORE, null, true, Collections.emptyList()), ResponseField.forList("battingList", "battingList", null, true, Collections.emptyList()), ResponseField.forList("bowlingList", "bowlingList", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<BattingList> battingList;
        final List<BowlingList> bowlingList;
        final Score score;

        public Inningsdata(String str, Score score2, List<BattingList> list, List<BowlingList> list2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.score = score2;
            this.battingList = list;
            this.bowlingList = list2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Score score() {
            return this.score;
        }

        public List<BattingList> battingList() {
            return this.battingList;
        }

        public List<BowlingList> bowlingList() {
            return this.bowlingList;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Inningsdata.$responseFields[0], Inningsdata.this.__typename);
                    responseWriter.writeObject(Inningsdata.$responseFields[1], Inningsdata.this.score != null ? Inningsdata.this.score.marshaller() : null);
                    responseWriter.writeList(Inningsdata.$responseFields[2], Inningsdata.this.battingList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BattingList) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(Inningsdata.$responseFields[3], Inningsdata.this.bowlingList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BowlingList) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Inningsdata{__typename=" + this.__typename + ", score=" + this.score + ", battingList=" + this.battingList + ", bowlingList=" + this.bowlingList + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Score score2;
            List<BattingList> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Inningsdata)) {
                return false;
            }
            Inningsdata inningsdata = (Inningsdata) obj;
            if (this.__typename.equals(inningsdata.__typename) && ((score2 = this.score) != null ? score2.equals(inningsdata.score) : inningsdata.score == null) && ((list = this.battingList) != null ? list.equals(inningsdata.battingList) : inningsdata.battingList == null)) {
                List<BowlingList> list2 = this.bowlingList;
                List<BowlingList> list3 = inningsdata.bowlingList;
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
                Score score2 = this.score;
                int i = 0;
                int hashCode2 = (hashCode ^ (score2 == null ? 0 : score2.hashCode())) * 1000003;
                List<BattingList> list = this.battingList;
                int hashCode3 = (hashCode2 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<BowlingList> list2 = this.bowlingList;
                if (list2 != null) {
                    i = list2.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Inningsdata> {
            final BattingList.Mapper battingListFieldMapper = new BattingList.Mapper();
            final BowlingList.Mapper bowlingListFieldMapper = new BowlingList.Mapper();
            final Score.Mapper scoreFieldMapper = new Score.Mapper();

            @Override 
            public Inningsdata map(ResponseReader responseReader) {
                return new Inningsdata(responseReader.readString(Inningsdata.$responseFields[0]), (Score) responseReader.readObject(Inningsdata.$responseFields[1], new ResponseReader.ObjectReader<Score>() {


                    @Override 
                    public Score read(ResponseReader responseReader) {
                        return Mapper.this.scoreFieldMapper.map(responseReader);
                    }
                }), responseReader.readList(Inningsdata.$responseFields[2], new ResponseReader.ListReader<BattingList>() {


                    @Override 
                    public BattingList read(ResponseReader.ListItemReader listItemReader) {
                        return (BattingList) listItemReader.readObject(new ResponseReader.ObjectReader<BattingList>() {


                            @Override 
                            public BattingList read(ResponseReader responseReader) {
                                return Mapper.this.battingListFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(Inningsdata.$responseFields[3], new ResponseReader.ListReader<BowlingList>() {


                    @Override 
                    public BowlingList read(ResponseReader.ListItemReader listItemReader) {
                        return (BowlingList) listItemReader.readObject(new ResponseReader.ObjectReader<BowlingList>() {


                            @Override 
                            public BowlingList read(ResponseReader responseReader) {
                                return Mapper.this.bowlingListFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class Score {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("overs", "overs", null, true, Collections.emptyList()), ResponseField.forString("runsScored", "runsScored", null, true, Collections.emptyList()), ResponseField.forString("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forString("runRate", "runRate", null, true, Collections.emptyList()), ResponseField.forString("battingTeamName", "battingTeamName", null, true, Collections.emptyList()), ResponseField.forString("battingTeamID", "battingTeamID", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String battingTeamID;
        final String battingTeamName;
        final String overs;
        final String runRate;
        final String runsScored;
        final String wickets;

        public Score(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.overs = str2;
            this.runsScored = str3;
            this.wickets = str4;
            this.runRate = str5;
            this.battingTeamName = str6;
            this.battingTeamID = str7;
        }

        public String __typename() {
            return this.__typename;
        }

        public String overs() {
            return this.overs;
        }

        public String runsScored() {
            return this.runsScored;
        }

        public String wickets() {
            return this.wickets;
        }

        public String runRate() {
            return this.runRate;
        }

        public String battingTeamName() {
            return this.battingTeamName;
        }

        public String battingTeamID() {
            return this.battingTeamID;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Score.$responseFields[0], Score.this.__typename);
                    responseWriter.writeString(Score.$responseFields[1], Score.this.overs);
                    responseWriter.writeString(Score.$responseFields[2], Score.this.runsScored);
                    responseWriter.writeString(Score.$responseFields[3], Score.this.wickets);
                    responseWriter.writeString(Score.$responseFields[4], Score.this.runRate);
                    responseWriter.writeString(Score.$responseFields[5], Score.this.battingTeamName);
                    responseWriter.writeString(Score.$responseFields[6], Score.this.battingTeamID);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Score{__typename=" + this.__typename + ", overs=" + this.overs + ", runsScored=" + this.runsScored + ", wickets=" + this.wickets + ", runRate=" + this.runRate + ", battingTeamName=" + this.battingTeamName + ", battingTeamID=" + this.battingTeamID + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Score)) {
                return false;
            }
            Score score = (Score) obj;
            if (this.__typename.equals(score.__typename) && ((str = this.overs) != null ? str.equals(score.overs) : score.overs == null) && ((str2 = this.runsScored) != null ? str2.equals(score.runsScored) : score.runsScored == null) && ((str3 = this.wickets) != null ? str3.equals(score.wickets) : score.wickets == null) && ((str4 = this.runRate) != null ? str4.equals(score.runRate) : score.runRate == null) && ((str5 = this.battingTeamName) != null ? str5.equals(score.battingTeamName) : score.battingTeamName == null)) {
                String str6 = this.battingTeamID;
                String str7 = score.battingTeamID;
                if (str6 == null) {
                    if (str7 == null) {
                        return true;
                    }
                } else if (str6.equals(str7)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.overs;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.runsScored;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.wickets;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.runRate;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.battingTeamName;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.battingTeamID;
                if (str6 != null) {
                    i = str6.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Score> {
            @Override 
            public Score map(ResponseReader responseReader) {
                return new Score(responseReader.readString(Score.$responseFields[0]), responseReader.readString(Score.$responseFields[1]), responseReader.readString(Score.$responseFields[2]), responseReader.readString(Score.$responseFields[3]), responseReader.readString(Score.$responseFields[4]), responseReader.readString(Score.$responseFields[5]), responseReader.readString(Score.$responseFields[6]));
            }
        }
    }

    public static class BattingList {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerTeam", "playerTeam", null, true, Collections.emptyList()), ResponseField.forString("playerMatchBalls", "playerMatchBalls", null, true, Collections.emptyList()), ResponseField.forString("playerMatchRuns", "playerMatchRuns", null, true, Collections.emptyList()), ResponseField.forString("playerBattingNumber", "playerBattingNumber", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String playerBattingNumber;
        final String playerID;
        final String playerMatchBalls;
        final String playerMatchRuns;
        final String playerName;
        final String playerTeam;

        public BattingList(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerName = str3;
            this.playerTeam = str4;
            this.playerMatchBalls = str5;
            this.playerMatchRuns = str6;
            this.playerBattingNumber = str7;
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

        public String playerTeam() {
            return this.playerTeam;
        }

        public String playerMatchBalls() {
            return this.playerMatchBalls;
        }

        public String playerMatchRuns() {
            return this.playerMatchRuns;
        }

        public String playerBattingNumber() {
            return this.playerBattingNumber;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BattingList.$responseFields[0], BattingList.this.__typename);
                    responseWriter.writeString(BattingList.$responseFields[1], BattingList.this.playerID);
                    responseWriter.writeString(BattingList.$responseFields[2], BattingList.this.playerName);
                    responseWriter.writeString(BattingList.$responseFields[3], BattingList.this.playerTeam);
                    responseWriter.writeString(BattingList.$responseFields[4], BattingList.this.playerMatchBalls);
                    responseWriter.writeString(BattingList.$responseFields[5], BattingList.this.playerMatchRuns);
                    responseWriter.writeString(BattingList.$responseFields[6], BattingList.this.playerBattingNumber);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BattingList{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerTeam=" + this.playerTeam + ", playerMatchBalls=" + this.playerMatchBalls + ", playerMatchRuns=" + this.playerMatchRuns + ", playerBattingNumber=" + this.playerBattingNumber + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattingList)) {
                return false;
            }
            BattingList battingList = (BattingList) obj;
            if (this.__typename.equals(battingList.__typename) && ((str = this.playerID) != null ? str.equals(battingList.playerID) : battingList.playerID == null) && ((str2 = this.playerName) != null ? str2.equals(battingList.playerName) : battingList.playerName == null) && ((str3 = this.playerTeam) != null ? str3.equals(battingList.playerTeam) : battingList.playerTeam == null) && ((str4 = this.playerMatchBalls) != null ? str4.equals(battingList.playerMatchBalls) : battingList.playerMatchBalls == null) && ((str5 = this.playerMatchRuns) != null ? str5.equals(battingList.playerMatchRuns) : battingList.playerMatchRuns == null)) {
                String str6 = this.playerBattingNumber;
                String str7 = battingList.playerBattingNumber;
                if (str6 == null) {
                    if (str7 == null) {
                        return true;
                    }
                } else if (str6.equals(str7)) {
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
                String str3 = this.playerTeam;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerMatchBalls;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerMatchRuns;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.playerBattingNumber;
                if (str6 != null) {
                    i = str6.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BattingList> {
            @Override 
            public BattingList map(ResponseReader responseReader) {
                return new BattingList(responseReader.readString(BattingList.$responseFields[0]), responseReader.readString(BattingList.$responseFields[1]), responseReader.readString(BattingList.$responseFields[2]), responseReader.readString(BattingList.$responseFields[3]), responseReader.readString(BattingList.$responseFields[4]), responseReader.readString(BattingList.$responseFields[5]), responseReader.readString(BattingList.$responseFields[6]));
            }
        }
    }

    public static class BowlingList {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerTeam", "playerTeam", null, true, Collections.emptyList()), ResponseField.forString("playerDotBalls", "playerDotBalls", null, true, Collections.emptyList()), ResponseField.forString("playerWicketsTaken", "playerWicketsTaken", null, true, Collections.emptyList()), ResponseField.forString("playerMaidensBowled", "playerMaidensBowled", null, true, Collections.emptyList()), ResponseField.forString("playerRunsConceeded", "playerRunsConceeded", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String playerDotBalls;
        final String playerID;
        final String playerMaidensBowled;
        final String playerName;
        final String playerRunsConceeded;
        final String playerTeam;
        final String playerWicketsTaken;

        public BowlingList(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerName = str3;
            this.playerTeam = str4;
            this.playerDotBalls = str5;
            this.playerWicketsTaken = str6;
            this.playerMaidensBowled = str7;
            this.playerRunsConceeded = str8;
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

        public String playerTeam() {
            return this.playerTeam;
        }

        public String playerDotBalls() {
            return this.playerDotBalls;
        }

        public String playerWicketsTaken() {
            return this.playerWicketsTaken;
        }

        public String playerMaidensBowled() {
            return this.playerMaidensBowled;
        }

        public String playerRunsConceeded() {
            return this.playerRunsConceeded;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlingList.$responseFields[0], BowlingList.this.__typename);
                    responseWriter.writeString(BowlingList.$responseFields[1], BowlingList.this.playerID);
                    responseWriter.writeString(BowlingList.$responseFields[2], BowlingList.this.playerName);
                    responseWriter.writeString(BowlingList.$responseFields[3], BowlingList.this.playerTeam);
                    responseWriter.writeString(BowlingList.$responseFields[4], BowlingList.this.playerDotBalls);
                    responseWriter.writeString(BowlingList.$responseFields[5], BowlingList.this.playerWicketsTaken);
                    responseWriter.writeString(BowlingList.$responseFields[6], BowlingList.this.playerMaidensBowled);
                    responseWriter.writeString(BowlingList.$responseFields[7], BowlingList.this.playerRunsConceeded);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlingList{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerTeam=" + this.playerTeam + ", playerDotBalls=" + this.playerDotBalls + ", playerWicketsTaken=" + this.playerWicketsTaken + ", playerMaidensBowled=" + this.playerMaidensBowled + ", playerRunsConceeded=" + this.playerRunsConceeded + "}";
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
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlingList)) {
                return false;
            }
            BowlingList bowlingList = (BowlingList) obj;
            if (this.__typename.equals(bowlingList.__typename) && ((str = this.playerID) != null ? str.equals(bowlingList.playerID) : bowlingList.playerID == null) && ((str2 = this.playerName) != null ? str2.equals(bowlingList.playerName) : bowlingList.playerName == null) && ((str3 = this.playerTeam) != null ? str3.equals(bowlingList.playerTeam) : bowlingList.playerTeam == null) && ((str4 = this.playerDotBalls) != null ? str4.equals(bowlingList.playerDotBalls) : bowlingList.playerDotBalls == null) && ((str5 = this.playerWicketsTaken) != null ? str5.equals(bowlingList.playerWicketsTaken) : bowlingList.playerWicketsTaken == null) && ((str6 = this.playerMaidensBowled) != null ? str6.equals(bowlingList.playerMaidensBowled) : bowlingList.playerMaidensBowled == null)) {
                String str7 = this.playerRunsConceeded;
                String str8 = bowlingList.playerRunsConceeded;
                if (str7 == null) {
                    if (str8 == null) {
                        return true;
                    }
                } else if (str7.equals(str8)) {
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
                String str3 = this.playerTeam;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerDotBalls;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerWicketsTaken;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.playerMaidensBowled;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.playerRunsConceeded;
                if (str7 != null) {
                    i = str7.hashCode();
                }
                this.$hashCode = hashCode7 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlingList> {
            @Override 
            public BowlingList map(ResponseReader responseReader) {
                return new BowlingList(responseReader.readString(BowlingList.$responseFields[0]), responseReader.readString(BowlingList.$responseFields[1]), responseReader.readString(BowlingList.$responseFields[2]), responseReader.readString(BowlingList.$responseFields[3]), responseReader.readString(BowlingList.$responseFields[4]), responseReader.readString(BowlingList.$responseFields[5]), responseReader.readString(BowlingList.$responseFields[6]), responseReader.readString(BowlingList.$responseFields[7]));
            }
        }
    }

    public static class Summary1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.SCORE, FirebaseAnalytics.Param.SCORE, null, true, Collections.emptyList()), ResponseField.forString("over", "over", null, true, Collections.emptyList()), ResponseField.forString("runs", "runs", null, true, Collections.emptyList()), ResponseField.forString("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forString("teamShortName", "teamShortName", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String over;
        final String runs;
        final String score;
        final String teamShortName;
        final String wickets;

        public Summary1(String str, String str2, String str3, String str4, String str5, String str6) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.score = str2;
            this.over = str3;
            this.runs = str4;
            this.wickets = str5;
            this.teamShortName = str6;
        }

        public String __typename() {
            return this.__typename;
        }

        public String score() {
            return this.score;
        }

        public String over() {
            return this.over;
        }

        public String runs() {
            return this.runs;
        }

        public String wickets() {
            return this.wickets;
        }

        public String teamShortName() {
            return this.teamShortName;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Summary1.$responseFields[0], Summary1.this.__typename);
                    responseWriter.writeString(Summary1.$responseFields[1], Summary1.this.score);
                    responseWriter.writeString(Summary1.$responseFields[2], Summary1.this.over);
                    responseWriter.writeString(Summary1.$responseFields[3], Summary1.this.runs);
                    responseWriter.writeString(Summary1.$responseFields[4], Summary1.this.wickets);
                    responseWriter.writeString(Summary1.$responseFields[5], Summary1.this.teamShortName);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Summary1{__typename=" + this.__typename + ", score=" + this.score + ", over=" + this.over + ", runs=" + this.runs + ", wickets=" + this.wickets + ", teamShortName=" + this.teamShortName + "}";
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
            if (!(obj instanceof Summary1)) {
                return false;
            }
            Summary1 summary1 = (Summary1) obj;
            if (this.__typename.equals(summary1.__typename) && ((str = this.score) != null ? str.equals(summary1.score) : summary1.score == null) && ((str2 = this.over) != null ? str2.equals(summary1.over) : summary1.over == null) && ((str3 = this.runs) != null ? str3.equals(summary1.runs) : summary1.runs == null) && ((str4 = this.wickets) != null ? str4.equals(summary1.wickets) : summary1.wickets == null)) {
                String str5 = this.teamShortName;
                String str6 = summary1.teamShortName;
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
                String str = this.score;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.over;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.runs;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.wickets;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.teamShortName;
                if (str5 != null) {
                    i = str5.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Summary1> {
            @Override 
            public Summary1 map(ResponseReader responseReader) {
                return new Summary1(responseReader.readString(Summary1.$responseFields[0]), responseReader.readString(Summary1.$responseFields[1]), responseReader.readString(Summary1.$responseFields[2]), responseReader.readString(Summary1.$responseFields[3]), responseReader.readString(Summary1.$responseFields[4]), responseReader.readString(Summary1.$responseFields[5]));
            }
        }
    }

    public static class InningsSummary {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forObject(FirebaseAnalytics.Param.SCORE, FirebaseAnalytics.Param.SCORE, null, true, Collections.emptyList()), ResponseField.forList("battingList", "battingList", null, true, Collections.emptyList()), ResponseField.forList("bowlingList", "bowlingList", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<BattingList1> battingList;
        final List<BowlingList1> bowlingList;
        final Score1 score;

        public InningsSummary(String str, Score1 score1, List<BattingList1> list, List<BowlingList1> list2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.score = score1;
            this.battingList = list;
            this.bowlingList = list2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Score1 score() {
            return this.score;
        }

        public List<BattingList1> battingList() {
            return this.battingList;
        }

        public List<BowlingList1> bowlingList() {
            return this.bowlingList;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(InningsSummary.$responseFields[0], InningsSummary.this.__typename);
                    responseWriter.writeObject(InningsSummary.$responseFields[1], InningsSummary.this.score != null ? InningsSummary.this.score.marshaller() : null);
                    responseWriter.writeList(InningsSummary.$responseFields[2], InningsSummary.this.battingList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BattingList1) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(InningsSummary.$responseFields[3], InningsSummary.this.bowlingList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BowlingList1) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "InningsSummary{__typename=" + this.__typename + ", score=" + this.score + ", battingList=" + this.battingList + ", bowlingList=" + this.bowlingList + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Score1 score1;
            List<BattingList1> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InningsSummary)) {
                return false;
            }
            InningsSummary inningsSummary = (InningsSummary) obj;
            if (this.__typename.equals(inningsSummary.__typename) && ((score1 = this.score) != null ? score1.equals(inningsSummary.score) : inningsSummary.score == null) && ((list = this.battingList) != null ? list.equals(inningsSummary.battingList) : inningsSummary.battingList == null)) {
                List<BowlingList1> list2 = this.bowlingList;
                List<BowlingList1> list3 = inningsSummary.bowlingList;
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
                Score1 score1 = this.score;
                int i = 0;
                int hashCode2 = (hashCode ^ (score1 == null ? 0 : score1.hashCode())) * 1000003;
                List<BattingList1> list = this.battingList;
                int hashCode3 = (hashCode2 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<BowlingList1> list2 = this.bowlingList;
                if (list2 != null) {
                    i = list2.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<InningsSummary> {
            final BattingList1.Mapper battingList1FieldMapper = new BattingList1.Mapper();
            final BowlingList1.Mapper bowlingList1FieldMapper = new BowlingList1.Mapper();
            final Score1.Mapper score1FieldMapper = new Score1.Mapper();

            @Override 
            public InningsSummary map(ResponseReader responseReader) {
                return new InningsSummary(responseReader.readString(InningsSummary.$responseFields[0]), (Score1) responseReader.readObject(InningsSummary.$responseFields[1], new ResponseReader.ObjectReader<Score1>() {


                    @Override 
                    public Score1 read(ResponseReader responseReader) {
                        return Mapper.this.score1FieldMapper.map(responseReader);
                    }
                }), responseReader.readList(InningsSummary.$responseFields[2], new ResponseReader.ListReader<BattingList1>() {


                    @Override 
                    public BattingList1 read(ResponseReader.ListItemReader listItemReader) {
                        return (BattingList1) listItemReader.readObject(new ResponseReader.ObjectReader<BattingList1>() {


                            @Override 
                            public BattingList1 read(ResponseReader responseReader) {
                                return Mapper.this.battingList1FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(InningsSummary.$responseFields[3], new ResponseReader.ListReader<BowlingList1>() {


                    @Override 
                    public BowlingList1 read(ResponseReader.ListItemReader listItemReader) {
                        return (BowlingList1) listItemReader.readObject(new ResponseReader.ObjectReader<BowlingList1>() {


                            @Override 
                            public BowlingList1 read(ResponseReader responseReader) {
                                return Mapper.this.bowlingList1FieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class Score1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("overs", "overs", null, true, Collections.emptyList()), ResponseField.forString("runsScored", "runsScored", null, true, Collections.emptyList()), ResponseField.forString("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forString("runRate", "runRate", null, true, Collections.emptyList()), ResponseField.forString("battingTeamName", "battingTeamName", null, true, Collections.emptyList()), ResponseField.forString("battingTeamID", "battingTeamID", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String battingTeamID;
        final String battingTeamName;
        final String overs;
        final String runRate;
        final String runsScored;
        final String wickets;

        public Score1(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.overs = str2;
            this.runsScored = str3;
            this.wickets = str4;
            this.runRate = str5;
            this.battingTeamName = str6;
            this.battingTeamID = str7;
        }

        public String __typename() {
            return this.__typename;
        }

        public String overs() {
            return this.overs;
        }

        public String runsScored() {
            return this.runsScored;
        }

        public String wickets() {
            return this.wickets;
        }

        public String runRate() {
            return this.runRate;
        }

        public String battingTeamName() {
            return this.battingTeamName;
        }

        public String battingTeamID() {
            return this.battingTeamID;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Score1.$responseFields[0], Score1.this.__typename);
                    responseWriter.writeString(Score1.$responseFields[1], Score1.this.overs);
                    responseWriter.writeString(Score1.$responseFields[2], Score1.this.runsScored);
                    responseWriter.writeString(Score1.$responseFields[3], Score1.this.wickets);
                    responseWriter.writeString(Score1.$responseFields[4], Score1.this.runRate);
                    responseWriter.writeString(Score1.$responseFields[5], Score1.this.battingTeamName);
                    responseWriter.writeString(Score1.$responseFields[6], Score1.this.battingTeamID);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Score1{__typename=" + this.__typename + ", overs=" + this.overs + ", runsScored=" + this.runsScored + ", wickets=" + this.wickets + ", runRate=" + this.runRate + ", battingTeamName=" + this.battingTeamName + ", battingTeamID=" + this.battingTeamID + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Score1)) {
                return false;
            }
            Score1 score1 = (Score1) obj;
            if (this.__typename.equals(score1.__typename) && ((str = this.overs) != null ? str.equals(score1.overs) : score1.overs == null) && ((str2 = this.runsScored) != null ? str2.equals(score1.runsScored) : score1.runsScored == null) && ((str3 = this.wickets) != null ? str3.equals(score1.wickets) : score1.wickets == null) && ((str4 = this.runRate) != null ? str4.equals(score1.runRate) : score1.runRate == null) && ((str5 = this.battingTeamName) != null ? str5.equals(score1.battingTeamName) : score1.battingTeamName == null)) {
                String str6 = this.battingTeamID;
                String str7 = score1.battingTeamID;
                if (str6 == null) {
                    if (str7 == null) {
                        return true;
                    }
                } else if (str6.equals(str7)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.overs;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.runsScored;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.wickets;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.runRate;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.battingTeamName;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.battingTeamID;
                if (str6 != null) {
                    i = str6.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Score1> {
            @Override 
            public Score1 map(ResponseReader responseReader) {
                return new Score1(responseReader.readString(Score1.$responseFields[0]), responseReader.readString(Score1.$responseFields[1]), responseReader.readString(Score1.$responseFields[2]), responseReader.readString(Score1.$responseFields[3]), responseReader.readString(Score1.$responseFields[4]), responseReader.readString(Score1.$responseFields[5]), responseReader.readString(Score1.$responseFields[6]));
            }
        }
    }

    public static class BattingList1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerTeam", "playerTeam", null, true, Collections.emptyList()), ResponseField.forString("playerMatchBalls", "playerMatchBalls", null, true, Collections.emptyList()), ResponseField.forString("playerMatchRuns", "playerMatchRuns", null, true, Collections.emptyList()), ResponseField.forString("playerBattingNumber", "playerBattingNumber", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String playerBattingNumber;
        final String playerID;
        final String playerMatchBalls;
        final String playerMatchRuns;
        final String playerName;
        final String playerTeam;

        public BattingList1(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerName = str3;
            this.playerTeam = str4;
            this.playerMatchBalls = str5;
            this.playerMatchRuns = str6;
            this.playerBattingNumber = str7;
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

        public String playerTeam() {
            return this.playerTeam;
        }

        public String playerMatchBalls() {
            return this.playerMatchBalls;
        }

        public String playerMatchRuns() {
            return this.playerMatchRuns;
        }

        public String playerBattingNumber() {
            return this.playerBattingNumber;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BattingList1.$responseFields[0], BattingList1.this.__typename);
                    responseWriter.writeString(BattingList1.$responseFields[1], BattingList1.this.playerID);
                    responseWriter.writeString(BattingList1.$responseFields[2], BattingList1.this.playerName);
                    responseWriter.writeString(BattingList1.$responseFields[3], BattingList1.this.playerTeam);
                    responseWriter.writeString(BattingList1.$responseFields[4], BattingList1.this.playerMatchBalls);
                    responseWriter.writeString(BattingList1.$responseFields[5], BattingList1.this.playerMatchRuns);
                    responseWriter.writeString(BattingList1.$responseFields[6], BattingList1.this.playerBattingNumber);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BattingList1{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerTeam=" + this.playerTeam + ", playerMatchBalls=" + this.playerMatchBalls + ", playerMatchRuns=" + this.playerMatchRuns + ", playerBattingNumber=" + this.playerBattingNumber + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattingList1)) {
                return false;
            }
            BattingList1 battingList1 = (BattingList1) obj;
            if (this.__typename.equals(battingList1.__typename) && ((str = this.playerID) != null ? str.equals(battingList1.playerID) : battingList1.playerID == null) && ((str2 = this.playerName) != null ? str2.equals(battingList1.playerName) : battingList1.playerName == null) && ((str3 = this.playerTeam) != null ? str3.equals(battingList1.playerTeam) : battingList1.playerTeam == null) && ((str4 = this.playerMatchBalls) != null ? str4.equals(battingList1.playerMatchBalls) : battingList1.playerMatchBalls == null) && ((str5 = this.playerMatchRuns) != null ? str5.equals(battingList1.playerMatchRuns) : battingList1.playerMatchRuns == null)) {
                String str6 = this.playerBattingNumber;
                String str7 = battingList1.playerBattingNumber;
                if (str6 == null) {
                    if (str7 == null) {
                        return true;
                    }
                } else if (str6.equals(str7)) {
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
                String str3 = this.playerTeam;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerMatchBalls;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerMatchRuns;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.playerBattingNumber;
                if (str6 != null) {
                    i = str6.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BattingList1> {
            @Override 
            public BattingList1 map(ResponseReader responseReader) {
                return new BattingList1(responseReader.readString(BattingList1.$responseFields[0]), responseReader.readString(BattingList1.$responseFields[1]), responseReader.readString(BattingList1.$responseFields[2]), responseReader.readString(BattingList1.$responseFields[3]), responseReader.readString(BattingList1.$responseFields[4]), responseReader.readString(BattingList1.$responseFields[5]), responseReader.readString(BattingList1.$responseFields[6]));
            }
        }
    }

    public static class BowlingList1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerTeam", "playerTeam", null, true, Collections.emptyList()), ResponseField.forString("playerDotBalls", "playerDotBalls", null, true, Collections.emptyList()), ResponseField.forString("playerWicketsTaken", "playerWicketsTaken", null, true, Collections.emptyList()), ResponseField.forString("playerMaidensBowled", "playerMaidensBowled", null, true, Collections.emptyList()), ResponseField.forString("playerRunsConceeded", "playerRunsConceeded", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String playerDotBalls;
        final String playerID;
        final String playerMaidensBowled;
        final String playerName;
        final String playerRunsConceeded;
        final String playerTeam;
        final String playerWicketsTaken;

        public BowlingList1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerName = str3;
            this.playerTeam = str4;
            this.playerDotBalls = str5;
            this.playerWicketsTaken = str6;
            this.playerMaidensBowled = str7;
            this.playerRunsConceeded = str8;
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

        public String playerTeam() {
            return this.playerTeam;
        }

        public String playerDotBalls() {
            return this.playerDotBalls;
        }

        public String playerWicketsTaken() {
            return this.playerWicketsTaken;
        }

        public String playerMaidensBowled() {
            return this.playerMaidensBowled;
        }

        public String playerRunsConceeded() {
            return this.playerRunsConceeded;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlingList1.$responseFields[0], BowlingList1.this.__typename);
                    responseWriter.writeString(BowlingList1.$responseFields[1], BowlingList1.this.playerID);
                    responseWriter.writeString(BowlingList1.$responseFields[2], BowlingList1.this.playerName);
                    responseWriter.writeString(BowlingList1.$responseFields[3], BowlingList1.this.playerTeam);
                    responseWriter.writeString(BowlingList1.$responseFields[4], BowlingList1.this.playerDotBalls);
                    responseWriter.writeString(BowlingList1.$responseFields[5], BowlingList1.this.playerWicketsTaken);
                    responseWriter.writeString(BowlingList1.$responseFields[6], BowlingList1.this.playerMaidensBowled);
                    responseWriter.writeString(BowlingList1.$responseFields[7], BowlingList1.this.playerRunsConceeded);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlingList1{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerTeam=" + this.playerTeam + ", playerDotBalls=" + this.playerDotBalls + ", playerWicketsTaken=" + this.playerWicketsTaken + ", playerMaidensBowled=" + this.playerMaidensBowled + ", playerRunsConceeded=" + this.playerRunsConceeded + "}";
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
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlingList1)) {
                return false;
            }
            BowlingList1 bowlingList1 = (BowlingList1) obj;
            if (this.__typename.equals(bowlingList1.__typename) && ((str = this.playerID) != null ? str.equals(bowlingList1.playerID) : bowlingList1.playerID == null) && ((str2 = this.playerName) != null ? str2.equals(bowlingList1.playerName) : bowlingList1.playerName == null) && ((str3 = this.playerTeam) != null ? str3.equals(bowlingList1.playerTeam) : bowlingList1.playerTeam == null) && ((str4 = this.playerDotBalls) != null ? str4.equals(bowlingList1.playerDotBalls) : bowlingList1.playerDotBalls == null) && ((str5 = this.playerWicketsTaken) != null ? str5.equals(bowlingList1.playerWicketsTaken) : bowlingList1.playerWicketsTaken == null) && ((str6 = this.playerMaidensBowled) != null ? str6.equals(bowlingList1.playerMaidensBowled) : bowlingList1.playerMaidensBowled == null)) {
                String str7 = this.playerRunsConceeded;
                String str8 = bowlingList1.playerRunsConceeded;
                if (str7 == null) {
                    if (str8 == null) {
                        return true;
                    }
                } else if (str7.equals(str8)) {
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
                String str3 = this.playerTeam;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerDotBalls;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerWicketsTaken;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.playerMaidensBowled;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.playerRunsConceeded;
                if (str7 != null) {
                    i = str7.hashCode();
                }
                this.$hashCode = hashCode7 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlingList1> {
            @Override 
            public BowlingList1 map(ResponseReader responseReader) {
                return new BowlingList1(responseReader.readString(BowlingList1.$responseFields[0]), responseReader.readString(BowlingList1.$responseFields[1]), responseReader.readString(BowlingList1.$responseFields[2]), responseReader.readString(BowlingList1.$responseFields[3]), responseReader.readString(BowlingList1.$responseFields[4]), responseReader.readString(BowlingList1.$responseFields[5]), responseReader.readString(BowlingList1.$responseFields[6]), responseReader.readString(BowlingList1.$responseFields[7]));
            }
        }
    }
}
