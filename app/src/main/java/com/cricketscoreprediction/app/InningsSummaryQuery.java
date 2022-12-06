package com.cricketscoreprediction.app;

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

public final class InningsSummaryQuery implements Query<InningsSummaryQuery.Data, InningsSummaryQuery.Data, InningsSummaryQuery.Variables> {
    public static final String OPERATION_ID = "8cc040f8460656db71e3a272185240bdb06a8405251ec12548de06b37a296808";
    public static final OperationName OPERATION_NAME = new OperationName() {


       @Override
        public String name() {
            return "inningsSummary";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query inningsSummary($matchID: String, $teamID: String, $inningsNo: String) {\n  inningsSummary(matchID: $matchID, teamID: $teamID, inningsNo: $inningsNo) {\n    __typename\n    score {\n      __typename\n      overs\n      runsScored\n      wickets\n      runRate\n      battingTeamName\n      battingTeamID\n    }\n    battingList {\n      __typename\n      playerID\n      playerName\n      playerTeam\n      playerMatchBalls\n      playerMatchRuns\n      playerBattingNumber\n    }\n    bowlingList {\n      __typename\n      playerID\n      playerName\n      playerTeam\n      playerDotBalls\n      playerWicketsTaken\n      playerMaidensBowled\n      playerRunsConceeded\n    }\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public InningsSummaryQuery(Input<String> input, Input<String> input2, Input<String> input3) {
        Utils.checkNotNull(input, "matchID == null");
        Utils.checkNotNull(input2, "teamID == null");
        Utils.checkNotNull(input3, "inningsNo == null");
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
        private Input<String> inningsNo = Input.absent();
        private Input<String> matchID = Input.absent();
        private Input<String> teamID = Input.absent();

        Builder() {
        }

        public Builder matchID(String str) {
            this.matchID = Input.fromNullable(str);
            return this;
        }

        public Builder teamID(String str) {
            this.teamID = Input.fromNullable(str);
            return this;
        }

        public Builder inningsNo(String str) {
            this.inningsNo = Input.fromNullable(str);
            return this;
        }

        public Builder matchIDInput(Input<String> input) {
            this.matchID = (Input) Utils.checkNotNull(input, "matchID == null");
            return this;
        }

        public Builder teamIDInput(Input<String> input) {
            this.teamID = (Input) Utils.checkNotNull(input, "teamID == null");
            return this;
        }

        public Builder inningsNoInput(Input<String> input) {
            this.inningsNo = (Input) Utils.checkNotNull(input, "inningsNo == null");
            return this;
        }

        public InningsSummaryQuery build() {
            return new InningsSummaryQuery(this.matchID, this.teamID, this.inningsNo);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final Input<String> inningsNo;
        private final Input<String> matchID;
        private final Input<String> teamID;
        private final transient Map<String, Object> valueMap;

        Variables(Input<String> input, Input<String> input2, Input<String> input3) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.matchID = input;
            this.teamID = input2;
            this.inningsNo = input3;
            if (input.defined) {
                linkedHashMap.put("matchID", input.value);
            }
            if (input2.defined) {
                linkedHashMap.put("teamID", input2.value);
            }
            if (input3.defined) {
                linkedHashMap.put("inningsNo", input3.value);
            }
        }

        public Input<String> matchID() {
            return this.matchID;
        }

        public Input<String> teamID() {
            return this.teamID;
        }

        public Input<String> inningsNo() {
            return this.inningsNo;
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
                    if (Variables.this.teamID.defined) {
                        inputFieldWriter.writeString("teamID", Variables.this.teamID.value);
                    }
                    if (Variables.this.inningsNo.defined) {
                        inputFieldWriter.writeString("inningsNo", Variables.this.inningsNo.value);
                    }
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forList("inningsSummary", "inningsSummary", new UnmodifiableMapBuilder(3).put("matchID", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "matchID").build()).put("teamID", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "teamID").build()).put("inningsNo", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "inningsNo").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final List<InningsSummary> inningsSummary;

        public Data(List<InningsSummary> list) {
            this.inningsSummary = list;
        }

        public List<InningsSummary> inningsSummary() {
            return this.inningsSummary;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeList(Data.$responseFields[0], Data.this.inningsSummary, new ResponseWriter.ListWriter() {


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
                this.$toString = "Data{inningsSummary=" + this.inningsSummary + "}";
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
            List<InningsSummary> list = this.inningsSummary;
            List<InningsSummary> list2 = ((Data) obj).inningsSummary;
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
                List<InningsSummary> list = this.inningsSummary;
                this.$hashCode = 1000003 ^ (list == null ? 0 : list.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final InningsSummary.Mapper inningsSummaryFieldMapper = new InningsSummary.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data(responseReader.readList(Data.$responseFields[0], new ResponseReader.ListReader<InningsSummary>() {


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

    public static class InningsSummary {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forObject(FirebaseAnalytics.Param.SCORE, FirebaseAnalytics.Param.SCORE, null, true, Collections.emptyList()), ResponseField.forList("battingList", "battingList", null, true, Collections.emptyList()), ResponseField.forList("bowlingList", "bowlingList", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<BattingList> battingList;
        final List<BowlingList> bowlingList;
        final Score score;

        public InningsSummary(String str, Score score2, List<BattingList> list, List<BowlingList> list2) {
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
                    responseWriter.writeString(InningsSummary.$responseFields[0], InningsSummary.this.__typename);
                    responseWriter.writeObject(InningsSummary.$responseFields[1], InningsSummary.this.score != null ? InningsSummary.this.score.marshaller() : null);
                    responseWriter.writeList(InningsSummary.$responseFields[2], InningsSummary.this.battingList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((BattingList) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(InningsSummary.$responseFields[3], InningsSummary.this.bowlingList, new ResponseWriter.ListWriter() {


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
                this.$toString = "InningsSummary{__typename=" + this.__typename + ", score=" + this.score + ", battingList=" + this.battingList + ", bowlingList=" + this.bowlingList + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Score score2;
            List<BattingList> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InningsSummary)) {
                return false;
            }
            InningsSummary inningsSummary = (InningsSummary) obj;
            if (this.__typename.equals(inningsSummary.__typename) && ((score2 = this.score) != null ? score2.equals(inningsSummary.score) : inningsSummary.score == null) && ((list = this.battingList) != null ? list.equals(inningsSummary.battingList) : inningsSummary.battingList == null)) {
                List<BowlingList> list2 = this.bowlingList;
                List<BowlingList> list3 = inningsSummary.bowlingList;
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

        public static final class Mapper implements ResponseFieldMapper<InningsSummary> {
            final BattingList.Mapper battingListFieldMapper = new BattingList.Mapper();
            final BowlingList.Mapper bowlingListFieldMapper = new BowlingList.Mapper();
            final Score.Mapper scoreFieldMapper = new Score.Mapper();

            @Override 
            public InningsSummary map(ResponseReader responseReader) {
                return new InningsSummary(responseReader.readString(InningsSummary.$responseFields[0]), (Score) responseReader.readObject(InningsSummary.$responseFields[1], new ResponseReader.ObjectReader<Score>() {


                    @Override 
                    public Score read(ResponseReader responseReader) {
                        return Mapper.this.scoreFieldMapper.map(responseReader);
                    }
                }), responseReader.readList(InningsSummary.$responseFields[2], new ResponseReader.ListReader<BattingList>() {


                    @Override 
                    public BattingList read(ResponseReader.ListItemReader listItemReader) {
                        return (BattingList) listItemReader.readObject(new ResponseReader.ObjectReader<BattingList>() {


                            @Override 
                            public BattingList read(ResponseReader responseReader) {
                                return Mapper.this.battingListFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(InningsSummary.$responseFields[3], new ResponseReader.ListReader<BowlingList>() {


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
}
