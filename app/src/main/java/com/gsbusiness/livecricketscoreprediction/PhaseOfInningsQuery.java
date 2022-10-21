package com.gsbusiness.livecricketscoreprediction;

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
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

public final class PhaseOfInningsQuery implements Query<PhaseOfInningsQuery.Data, PhaseOfInningsQuery.Data, PhaseOfInningsQuery.Variables> {
    public static final String OPERATION_ID = "6e4656bd1254385ae0e5f1fda69faa077e1cfed6b018194940696a9f1b619f0a";
    public static final OperationName OPERATION_NAME = new OperationName() {

       @Override
        public String name() {
            return "phaseOfInnings";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query phaseOfInnings($matchID: String) {\n  phaseOfInnings(matchID: $matchID) {\n    __typename\n    inningsPhase {\n      __typename\n      overNumber\n      runs\n      wickets\n    }\n    scoreCard {\n      __typename\n      inning\n      inningNumber\n      battingTeam\n      runsScored\n      wickets\n      overs\n      runRate\n      battingSide\n      teamID\n      battingTeamShortName\n      declared\n      folowOn\n    }\n    liveScores {\n      __typename\n      inningNo\n      overNo\n      currentScore\n      predictedScore\n      predictedOver\n      currentView {\n        __typename\n        homeTeamShortName\n        homeTeamPercentage\n        awayTeamShortName\n        awayTeamPercentage\n        tiePercentage\n      }\n      predictvizMarginView {\n        __typename\n        innings\n        result\n        runs\n        winnerTeamId\n        wickets\n      }\n      winvizView {\n        __typename\n        battingTeamPercent\n        bowlingTeamPercent\n        drawPercent\n        tiePercent\n      }\n      secondPredictedScore\n      secondPredictedOVer\n      thirdPredictedScore\n      thirdPredictedOver\n      fourthPredictedScore\n      fourthPredictedOver\n      predictedWicket\n      secondPredictedWicket\n      thirdPredictedWicket\n      fourthPredictedWicket\n      team2Id\n      team1Id\n      inningIds\n      team1Name\n      team2Name\n      team1ShortName\n      team2ShortName\n      currentWickets\n      homeTeamShortName\n      homeTeamPercentage\n      awayTeamShortName\n      awayTeamPercentage\n      tiePercentage\n      currentOvers\n    }\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public PhaseOfInningsQuery(Input<String> input) {
        Utils.checkNotNull(input, "matchID == null");
        this.variables = new Variables(input);
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
        private Input<String> matchID = Input.absent();

        Builder() {
        }

        public Builder matchID(String str) {
            this.matchID = Input.fromNullable(str);
            return this;
        }

        public Builder matchIDInput(Input<String> input) {
            this.matchID = (Input) Utils.checkNotNull(input, "matchID == null");
            return this;
        }

        public PhaseOfInningsQuery build() {
            return new PhaseOfInningsQuery(this.matchID);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final Input<String> matchID;
        private final transient Map<String, Object> valueMap;

        Variables(Input<String> input) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.matchID = input;
            if (input.defined) {
                linkedHashMap.put("matchID", input.value);
            }
        }

        public Input<String> matchID() {
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
                    if (Variables.this.matchID.defined) {
                        inputFieldWriter.writeString("matchID", Variables.this.matchID.value);
                    }
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("phaseOfInnings", "phaseOfInnings", new UnmodifiableMapBuilder(1).put("matchID", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "matchID").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final PhaseOfInnings phaseOfInnings;

        public Data(PhaseOfInnings phaseOfInnings2) {
            this.phaseOfInnings = phaseOfInnings2;
        }

        public PhaseOfInnings phaseOfInnings() {
            return this.phaseOfInnings;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.phaseOfInnings != null ? Data.this.phaseOfInnings.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{phaseOfInnings=" + this.phaseOfInnings + "}";
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
            PhaseOfInnings phaseOfInnings2 = this.phaseOfInnings;
            PhaseOfInnings phaseOfInnings3 = ((Data) obj).phaseOfInnings;
            if (phaseOfInnings2 != null) {
                return phaseOfInnings2.equals(phaseOfInnings3);
            }
            if (phaseOfInnings3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                PhaseOfInnings phaseOfInnings2 = this.phaseOfInnings;
                this.$hashCode = 1000003 ^ (phaseOfInnings2 == null ? 0 : phaseOfInnings2.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final PhaseOfInnings.Mapper phaseOfInningsFieldMapper = new PhaseOfInnings.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((PhaseOfInnings) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<PhaseOfInnings>() {


                    @Override 
                    public PhaseOfInnings read(ResponseReader responseReader) {
                        return Mapper.this.phaseOfInningsFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class PhaseOfInnings {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("inningsPhase", "inningsPhase", null, true, Collections.emptyList()), ResponseField.forObject("scoreCard", "scoreCard", null, true, Collections.emptyList()), ResponseField.forObject("liveScores", "liveScores", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<InningsPhase> inningsPhase;
        final LiveScores liveScores;
        final ScoreCard scoreCard;

        public PhaseOfInnings(String str, List<InningsPhase> list, ScoreCard scoreCard2, LiveScores liveScores2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.inningsPhase = list;
            this.scoreCard = scoreCard2;
            this.liveScores = liveScores2;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<InningsPhase> inningsPhase() {
            return this.inningsPhase;
        }

        public ScoreCard scoreCard() {
            return this.scoreCard;
        }

        public LiveScores liveScores() {
            return this.liveScores;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(PhaseOfInnings.$responseFields[0], PhaseOfInnings.this.__typename);
                    responseWriter.writeList(PhaseOfInnings.$responseFields[1], PhaseOfInnings.this.inningsPhase, new ResponseWriter.ListWriter() {

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((InningsPhase) it.next()).marshaller());
                            }
                        }
                    });
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(PhaseOfInnings.$responseFields[2], PhaseOfInnings.this.scoreCard != null ? PhaseOfInnings.this.scoreCard.marshaller() : null);
                    ResponseField responseField = PhaseOfInnings.$responseFields[3];
                    if (PhaseOfInnings.this.liveScores != null) {
                        responseFieldMarshaller = PhaseOfInnings.this.liveScores.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "PhaseOfInnings{__typename=" + this.__typename + ", inningsPhase=" + this.inningsPhase + ", scoreCard=" + this.scoreCard + ", liveScores=" + this.liveScores + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<InningsPhase> list;
            ScoreCard scoreCard2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PhaseOfInnings)) {
                return false;
            }
            PhaseOfInnings phaseOfInnings = (PhaseOfInnings) obj;
            if (this.__typename.equals(phaseOfInnings.__typename) && ((list = this.inningsPhase) != null ? list.equals(phaseOfInnings.inningsPhase) : phaseOfInnings.inningsPhase == null) && ((scoreCard2 = this.scoreCard) != null ? scoreCard2.equals(phaseOfInnings.scoreCard) : phaseOfInnings.scoreCard == null)) {
                LiveScores liveScores2 = this.liveScores;
                LiveScores liveScores3 = phaseOfInnings.liveScores;
                if (liveScores2 == null) {
                    if (liveScores3 == null) {
                        return true;
                    }
                } else if (liveScores2.equals(liveScores3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<InningsPhase> list = this.inningsPhase;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                ScoreCard scoreCard2 = this.scoreCard;
                int hashCode3 = (hashCode2 ^ (scoreCard2 == null ? 0 : scoreCard2.hashCode())) * 1000003;
                LiveScores liveScores2 = this.liveScores;
                if (liveScores2 != null) {
                    i = liveScores2.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<PhaseOfInnings> {
            final InningsPhase.Mapper inningsPhaseFieldMapper = new InningsPhase.Mapper();
            final LiveScores.Mapper liveScoresFieldMapper = new LiveScores.Mapper();
            final ScoreCard.Mapper scoreCardFieldMapper = new ScoreCard.Mapper();

            @Override 
            public PhaseOfInnings map(ResponseReader responseReader) {
                return new PhaseOfInnings(responseReader.readString(PhaseOfInnings.$responseFields[0]), responseReader.readList(PhaseOfInnings.$responseFields[1], new ResponseReader.ListReader<InningsPhase>() {

                    @Override 
                    public InningsPhase read(ResponseReader.ListItemReader listItemReader) {
                        return (InningsPhase) listItemReader.readObject(new ResponseReader.ObjectReader<InningsPhase>() {

                            @Override 
                            public InningsPhase read(ResponseReader responseReader) {
                                return Mapper.this.inningsPhaseFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (ScoreCard) responseReader.readObject(PhaseOfInnings.$responseFields[2], new ResponseReader.ObjectReader<ScoreCard>() {

                    @Override 
                    public ScoreCard read(ResponseReader responseReader) {
                        return Mapper.this.scoreCardFieldMapper.map(responseReader);
                    }
                }), (LiveScores) responseReader.readObject(PhaseOfInnings.$responseFields[3], new ResponseReader.ObjectReader<LiveScores>() {

                    @Override 
                    public LiveScores read(ResponseReader responseReader) {
                        return Mapper.this.liveScoresFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class InningsPhase {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("overNumber", "overNumber", null, true, Collections.emptyList()), ResponseField.forString("runs", "runs", null, true, Collections.emptyList()), ResponseField.forString("wickets", "wickets", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String overNumber;
        final String runs;
        final String wickets;

        public InningsPhase(String str, String str2, String str3, String str4) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.overNumber = str2;
            this.runs = str3;
            this.wickets = str4;
        }

        public String __typename() {
            return this.__typename;
        }

        public String overNumber() {
            return this.overNumber;
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
                    responseWriter.writeString(InningsPhase.$responseFields[0], InningsPhase.this.__typename);
                    responseWriter.writeString(InningsPhase.$responseFields[1], InningsPhase.this.overNumber);
                    responseWriter.writeString(InningsPhase.$responseFields[2], InningsPhase.this.runs);
                    responseWriter.writeString(InningsPhase.$responseFields[3], InningsPhase.this.wickets);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "InningsPhase{__typename=" + this.__typename + ", overNumber=" + this.overNumber + ", runs=" + this.runs + ", wickets=" + this.wickets + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InningsPhase)) {
                return false;
            }
            InningsPhase inningsPhase = (InningsPhase) obj;
            if (this.__typename.equals(inningsPhase.__typename) && ((str = this.overNumber) != null ? str.equals(inningsPhase.overNumber) : inningsPhase.overNumber == null) && ((str2 = this.runs) != null ? str2.equals(inningsPhase.runs) : inningsPhase.runs == null)) {
                String str3 = this.wickets;
                String str4 = inningsPhase.wickets;
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
                String str = this.overNumber;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.runs;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.wickets;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<InningsPhase> {
            @Override 
            public InningsPhase map(ResponseReader responseReader) {
                return new InningsPhase(responseReader.readString(InningsPhase.$responseFields[0]), responseReader.readString(InningsPhase.$responseFields[1]), responseReader.readString(InningsPhase.$responseFields[2]), responseReader.readString(InningsPhase.$responseFields[3]));
            }
        }
    }

    public static class ScoreCard {
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

        public ScoreCard(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, Boolean bool2) {
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
                    responseWriter.writeString(ScoreCard.$responseFields[0], ScoreCard.this.__typename);
                    responseWriter.writeInt(ScoreCard.$responseFields[1], ScoreCard.this.inning);
                    responseWriter.writeString(ScoreCard.$responseFields[2], ScoreCard.this.inningNumber);
                    responseWriter.writeString(ScoreCard.$responseFields[3], ScoreCard.this.battingTeam);
                    responseWriter.writeString(ScoreCard.$responseFields[4], ScoreCard.this.runsScored);
                    responseWriter.writeString(ScoreCard.$responseFields[5], ScoreCard.this.wickets);
                    responseWriter.writeString(ScoreCard.$responseFields[6], ScoreCard.this.overs);
                    responseWriter.writeString(ScoreCard.$responseFields[7], ScoreCard.this.runRate);
                    responseWriter.writeString(ScoreCard.$responseFields[8], ScoreCard.this.battingSide);
                    responseWriter.writeString(ScoreCard.$responseFields[9], ScoreCard.this.teamID);
                    responseWriter.writeString(ScoreCard.$responseFields[10], ScoreCard.this.battingTeamShortName);
                    responseWriter.writeBoolean(ScoreCard.$responseFields[11], ScoreCard.this.declared);
                    responseWriter.writeBoolean(ScoreCard.$responseFields[12], ScoreCard.this.folowOn);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ScoreCard{__typename=" + this.__typename + ", inning=" + this.inning + ", inningNumber=" + this.inningNumber + ", battingTeam=" + this.battingTeam + ", runsScored=" + this.runsScored + ", wickets=" + this.wickets + ", overs=" + this.overs + ", runRate=" + this.runRate + ", battingSide=" + this.battingSide + ", teamID=" + this.teamID + ", battingTeamShortName=" + this.battingTeamShortName + ", declared=" + this.declared + ", folowOn=" + this.folowOn + "}";
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
            if (!(obj instanceof ScoreCard)) {
                return false;
            }
            ScoreCard scoreCard = (ScoreCard) obj;
            if (this.__typename.equals(scoreCard.__typename) && ((num = this.inning) != null ? num.equals(scoreCard.inning) : scoreCard.inning == null) && ((str = this.inningNumber) != null ? str.equals(scoreCard.inningNumber) : scoreCard.inningNumber == null) && ((str2 = this.battingTeam) != null ? str2.equals(scoreCard.battingTeam) : scoreCard.battingTeam == null) && ((str3 = this.runsScored) != null ? str3.equals(scoreCard.runsScored) : scoreCard.runsScored == null) && ((str4 = this.wickets) != null ? str4.equals(scoreCard.wickets) : scoreCard.wickets == null) && ((str5 = this.overs) != null ? str5.equals(scoreCard.overs) : scoreCard.overs == null) && ((str6 = this.runRate) != null ? str6.equals(scoreCard.runRate) : scoreCard.runRate == null) && ((str7 = this.battingSide) != null ? str7.equals(scoreCard.battingSide) : scoreCard.battingSide == null) && ((str8 = this.teamID) != null ? str8.equals(scoreCard.teamID) : scoreCard.teamID == null) && ((str9 = this.battingTeamShortName) != null ? str9.equals(scoreCard.battingTeamShortName) : scoreCard.battingTeamShortName == null) && ((bool = this.declared) != null ? bool.equals(scoreCard.declared) : scoreCard.declared == null)) {
                Boolean bool2 = this.folowOn;
                Boolean bool3 = scoreCard.folowOn;
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

        public static final class Mapper implements ResponseFieldMapper<ScoreCard> {
            @Override 
            public ScoreCard map(ResponseReader responseReader) {
                return new ScoreCard(responseReader.readString(ScoreCard.$responseFields[0]), responseReader.readInt(ScoreCard.$responseFields[1]), responseReader.readString(ScoreCard.$responseFields[2]), responseReader.readString(ScoreCard.$responseFields[3]), responseReader.readString(ScoreCard.$responseFields[4]), responseReader.readString(ScoreCard.$responseFields[5]), responseReader.readString(ScoreCard.$responseFields[6]), responseReader.readString(ScoreCard.$responseFields[7]), responseReader.readString(ScoreCard.$responseFields[8]), responseReader.readString(ScoreCard.$responseFields[9]), responseReader.readString(ScoreCard.$responseFields[10]), responseReader.readBoolean(ScoreCard.$responseFields[11]), responseReader.readBoolean(ScoreCard.$responseFields[12]));
            }
        }
    }

    public static class LiveScores {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("inningNo", "inningNo", null, true, Collections.emptyList()), ResponseField.forString("overNo", "overNo", null, true, Collections.emptyList()), ResponseField.forString("currentScore", "currentScore", null, true, Collections.emptyList()), ResponseField.forString("predictedScore", "predictedScore", null, true, Collections.emptyList()), ResponseField.forString("predictedOver", "predictedOver", null, true, Collections.emptyList()), ResponseField.forObject("currentView", "currentView", null, true, Collections.emptyList()), ResponseField.forObject("predictvizMarginView", "predictvizMarginView", null, true, Collections.emptyList()), ResponseField.forObject("winvizView", "winvizView", null, true, Collections.emptyList()), ResponseField.forString("secondPredictedScore", "secondPredictedScore", null, true, Collections.emptyList()), ResponseField.forString("secondPredictedOVer", "secondPredictedOVer", null, true, Collections.emptyList()), ResponseField.forString("thirdPredictedScore", "thirdPredictedScore", null, true, Collections.emptyList()), ResponseField.forString("thirdPredictedOver", "thirdPredictedOver", null, true, Collections.emptyList()), ResponseField.forString("fourthPredictedScore", "fourthPredictedScore", null, true, Collections.emptyList()), ResponseField.forString("fourthPredictedOver", "fourthPredictedOver", null, true, Collections.emptyList()), ResponseField.forString("predictedWicket", "predictedWicket", null, true, Collections.emptyList()), ResponseField.forString("secondPredictedWicket", "secondPredictedWicket", null, true, Collections.emptyList()), ResponseField.forString("thirdPredictedWicket", "thirdPredictedWicket", null, true, Collections.emptyList()), ResponseField.forString("fourthPredictedWicket", "fourthPredictedWicket", null, true, Collections.emptyList()), ResponseField.forString("team2Id", "team2Id", null, true, Collections.emptyList()), ResponseField.forString("team1Id", "team1Id", null, true, Collections.emptyList()), ResponseField.forList("inningIds", "inningIds", null, true, Collections.emptyList()), ResponseField.forString("team1Name", "team1Name", null, true, Collections.emptyList()), ResponseField.forString("team2Name", "team2Name", null, true, Collections.emptyList()), ResponseField.forString("team1ShortName", "team1ShortName", null, true, Collections.emptyList()), ResponseField.forString("team2ShortName", "team2ShortName", null, true, Collections.emptyList()), ResponseField.forString("currentWickets", "currentWickets", null, true, Collections.emptyList()), ResponseField.forString("homeTeamShortName", "homeTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("homeTeamPercentage", "homeTeamPercentage", null, true, Collections.emptyList()), ResponseField.forString("awayTeamShortName", "awayTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("awayTeamPercentage", "awayTeamPercentage", null, true, Collections.emptyList()), ResponseField.forString("tiePercentage", "tiePercentage", null, true, Collections.emptyList()), ResponseField.forString("currentOvers", "currentOvers", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String awayTeamPercentage;
        final String awayTeamShortName;
        final String currentOvers;
        final String currentScore;
        final CurrentView currentView;
        final String currentWickets;
        final String fourthPredictedOver;
        final String fourthPredictedScore;
        final String fourthPredictedWicket;
        final String homeTeamPercentage;
        final String homeTeamShortName;
        final List<String> inningIds;
        final Integer inningNo;
        final String overNo;
        final String predictedOver;
        final String predictedScore;
        final String predictedWicket;
        final PredictvizMarginView predictvizMarginView;
        final String secondPredictedOVer;
        final String secondPredictedScore;
        final String secondPredictedWicket;
        final String team1Id;
        final String team1Name;
        final String team1ShortName;
        final String team2Id;
        final String team2Name;
        final String team2ShortName;
        final String thirdPredictedOver;
        final String thirdPredictedScore;
        final String thirdPredictedWicket;
        final String tiePercentage;
        final WinvizView winvizView;

        public LiveScores(String str, Integer num, String str2, String str3, String str4, String str5, CurrentView currentView2, PredictvizMarginView predictvizMarginView2, WinvizView winvizView2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, List<String> list, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.inningNo = num;
            this.overNo = str2;
            this.currentScore = str3;
            this.predictedScore = str4;
            this.predictedOver = str5;
            this.currentView = currentView2;
            this.predictvizMarginView = predictvizMarginView2;
            this.winvizView = winvizView2;
            this.secondPredictedScore = str6;
            this.secondPredictedOVer = str7;
            this.thirdPredictedScore = str8;
            this.thirdPredictedOver = str9;
            this.fourthPredictedScore = str10;
            this.fourthPredictedOver = str11;
            this.predictedWicket = str12;
            this.secondPredictedWicket = str13;
            this.thirdPredictedWicket = str14;
            this.fourthPredictedWicket = str15;
            this.team2Id = str16;
            this.team1Id = str17;
            this.inningIds = list;
            this.team1Name = str18;
            this.team2Name = str19;
            this.team1ShortName = str20;
            this.team2ShortName = str21;
            this.currentWickets = str22;
            this.homeTeamShortName = str23;
            this.homeTeamPercentage = str24;
            this.awayTeamShortName = str25;
            this.awayTeamPercentage = str26;
            this.tiePercentage = str27;
            this.currentOvers = str28;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer inningNo() {
            return this.inningNo;
        }

        public String overNo() {
            return this.overNo;
        }

        public String currentScore() {
            return this.currentScore;
        }

        public String predictedScore() {
            return this.predictedScore;
        }

        public String predictedOver() {
            return this.predictedOver;
        }

        public CurrentView currentView() {
            return this.currentView;
        }

        public PredictvizMarginView predictvizMarginView() {
            return this.predictvizMarginView;
        }

        public WinvizView winvizView() {
            return this.winvizView;
        }

        public String secondPredictedScore() {
            return this.secondPredictedScore;
        }

        public String secondPredictedOVer() {
            return this.secondPredictedOVer;
        }

        public String thirdPredictedScore() {
            return this.thirdPredictedScore;
        }

        public String thirdPredictedOver() {
            return this.thirdPredictedOver;
        }

        public String fourthPredictedScore() {
            return this.fourthPredictedScore;
        }

        public String fourthPredictedOver() {
            return this.fourthPredictedOver;
        }

        public String predictedWicket() {
            return this.predictedWicket;
        }

        public String secondPredictedWicket() {
            return this.secondPredictedWicket;
        }

        public String thirdPredictedWicket() {
            return this.thirdPredictedWicket;
        }

        public String fourthPredictedWicket() {
            return this.fourthPredictedWicket;
        }

        public String team2Id() {
            return this.team2Id;
        }

        public String team1Id() {
            return this.team1Id;
        }

        public List<String> inningIds() {
            return this.inningIds;
        }

        public String team1Name() {
            return this.team1Name;
        }

        public String team2Name() {
            return this.team2Name;
        }

        public String team1ShortName() {
            return this.team1ShortName;
        }

        public String team2ShortName() {
            return this.team2ShortName;
        }

        public String currentWickets() {
            return this.currentWickets;
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

        public String currentOvers() {
            return this.currentOvers;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(LiveScores.$responseFields[0], LiveScores.this.__typename);
                    responseWriter.writeInt(LiveScores.$responseFields[1], LiveScores.this.inningNo);
                    responseWriter.writeString(LiveScores.$responseFields[2], LiveScores.this.overNo);
                    responseWriter.writeString(LiveScores.$responseFields[3], LiveScores.this.currentScore);
                    responseWriter.writeString(LiveScores.$responseFields[4], LiveScores.this.predictedScore);
                    responseWriter.writeString(LiveScores.$responseFields[5], LiveScores.this.predictedOver);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(LiveScores.$responseFields[6], LiveScores.this.currentView != null ? LiveScores.this.currentView.marshaller() : null);
                    responseWriter.writeObject(LiveScores.$responseFields[7], LiveScores.this.predictvizMarginView != null ? LiveScores.this.predictvizMarginView.marshaller() : null);
                    ResponseField responseField = LiveScores.$responseFields[8];
                    if (LiveScores.this.winvizView != null) {
                        responseFieldMarshaller = LiveScores.this.winvizView.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                    responseWriter.writeString(LiveScores.$responseFields[9], LiveScores.this.secondPredictedScore);
                    responseWriter.writeString(LiveScores.$responseFields[10], LiveScores.this.secondPredictedOVer);
                    responseWriter.writeString(LiveScores.$responseFields[11], LiveScores.this.thirdPredictedScore);
                    responseWriter.writeString(LiveScores.$responseFields[12], LiveScores.this.thirdPredictedOver);
                    responseWriter.writeString(LiveScores.$responseFields[13], LiveScores.this.fourthPredictedScore);
                    responseWriter.writeString(LiveScores.$responseFields[14], LiveScores.this.fourthPredictedOver);
                    responseWriter.writeString(LiveScores.$responseFields[15], LiveScores.this.predictedWicket);
                    responseWriter.writeString(LiveScores.$responseFields[16], LiveScores.this.secondPredictedWicket);
                    responseWriter.writeString(LiveScores.$responseFields[17], LiveScores.this.thirdPredictedWicket);
                    responseWriter.writeString(LiveScores.$responseFields[18], LiveScores.this.fourthPredictedWicket);
                    responseWriter.writeString(LiveScores.$responseFields[19], LiveScores.this.team2Id);
                    responseWriter.writeString(LiveScores.$responseFields[20], LiveScores.this.team1Id);
                    responseWriter.writeList(LiveScores.$responseFields[21], LiveScores.this.inningIds, new ResponseWriter.ListWriter() {

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    });
                    responseWriter.writeString(LiveScores.$responseFields[22], LiveScores.this.team1Name);
                    responseWriter.writeString(LiveScores.$responseFields[23], LiveScores.this.team2Name);
                    responseWriter.writeString(LiveScores.$responseFields[24], LiveScores.this.team1ShortName);
                    responseWriter.writeString(LiveScores.$responseFields[25], LiveScores.this.team2ShortName);
                    responseWriter.writeString(LiveScores.$responseFields[26], LiveScores.this.currentWickets);
                    responseWriter.writeString(LiveScores.$responseFields[27], LiveScores.this.homeTeamShortName);
                    responseWriter.writeString(LiveScores.$responseFields[28], LiveScores.this.homeTeamPercentage);
                    responseWriter.writeString(LiveScores.$responseFields[29], LiveScores.this.awayTeamShortName);
                    responseWriter.writeString(LiveScores.$responseFields[30], LiveScores.this.awayTeamPercentage);
                    responseWriter.writeString(LiveScores.$responseFields[31], LiveScores.this.tiePercentage);
                    responseWriter.writeString(LiveScores.$responseFields[32], LiveScores.this.currentOvers);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "LiveScores{__typename=" + this.__typename + ", inningNo=" + this.inningNo + ", overNo=" + this.overNo + ", currentScore=" + this.currentScore + ", predictedScore=" + this.predictedScore + ", predictedOver=" + this.predictedOver + ", currentView=" + this.currentView + ", predictvizMarginView=" + this.predictvizMarginView + ", winvizView=" + this.winvizView + ", secondPredictedScore=" + this.secondPredictedScore + ", secondPredictedOVer=" + this.secondPredictedOVer + ", thirdPredictedScore=" + this.thirdPredictedScore + ", thirdPredictedOver=" + this.thirdPredictedOver + ", fourthPredictedScore=" + this.fourthPredictedScore + ", fourthPredictedOver=" + this.fourthPredictedOver + ", predictedWicket=" + this.predictedWicket + ", secondPredictedWicket=" + this.secondPredictedWicket + ", thirdPredictedWicket=" + this.thirdPredictedWicket + ", fourthPredictedWicket=" + this.fourthPredictedWicket + ", team2Id=" + this.team2Id + ", team1Id=" + this.team1Id + ", inningIds=" + this.inningIds + ", team1Name=" + this.team1Name + ", team2Name=" + this.team2Name + ", team1ShortName=" + this.team1ShortName + ", team2ShortName=" + this.team2ShortName + ", currentWickets=" + this.currentWickets + ", homeTeamShortName=" + this.homeTeamShortName + ", homeTeamPercentage=" + this.homeTeamPercentage + ", awayTeamShortName=" + this.awayTeamShortName + ", awayTeamPercentage=" + this.awayTeamPercentage + ", tiePercentage=" + this.tiePercentage + ", currentOvers=" + this.currentOvers + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            String str;
            String str2;
            String str3;
            String str4;
            CurrentView currentView2;
            PredictvizMarginView predictvizMarginView2;
            WinvizView winvizView2;
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
            List<String> list;
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
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LiveScores)) {
                return false;
            }
            LiveScores liveScores = (LiveScores) obj;
            if (this.__typename.equals(liveScores.__typename) && ((num = this.inningNo) != null ? num.equals(liveScores.inningNo) : liveScores.inningNo == null) && ((str = this.overNo) != null ? str.equals(liveScores.overNo) : liveScores.overNo == null) && ((str2 = this.currentScore) != null ? str2.equals(liveScores.currentScore) : liveScores.currentScore == null) && ((str3 = this.predictedScore) != null ? str3.equals(liveScores.predictedScore) : liveScores.predictedScore == null) && ((str4 = this.predictedOver) != null ? str4.equals(liveScores.predictedOver) : liveScores.predictedOver == null) && ((currentView2 = this.currentView) != null ? currentView2.equals(liveScores.currentView) : liveScores.currentView == null) && ((predictvizMarginView2 = this.predictvizMarginView) != null ? predictvizMarginView2.equals(liveScores.predictvizMarginView) : liveScores.predictvizMarginView == null) && ((winvizView2 = this.winvizView) != null ? winvizView2.equals(liveScores.winvizView) : liveScores.winvizView == null) && ((str5 = this.secondPredictedScore) != null ? str5.equals(liveScores.secondPredictedScore) : liveScores.secondPredictedScore == null) && ((str6 = this.secondPredictedOVer) != null ? str6.equals(liveScores.secondPredictedOVer) : liveScores.secondPredictedOVer == null) && ((str7 = this.thirdPredictedScore) != null ? str7.equals(liveScores.thirdPredictedScore) : liveScores.thirdPredictedScore == null) && ((str8 = this.thirdPredictedOver) != null ? str8.equals(liveScores.thirdPredictedOver) : liveScores.thirdPredictedOver == null) && ((str9 = this.fourthPredictedScore) != null ? str9.equals(liveScores.fourthPredictedScore) : liveScores.fourthPredictedScore == null) && ((str10 = this.fourthPredictedOver) != null ? str10.equals(liveScores.fourthPredictedOver) : liveScores.fourthPredictedOver == null) && ((str11 = this.predictedWicket) != null ? str11.equals(liveScores.predictedWicket) : liveScores.predictedWicket == null) && ((str12 = this.secondPredictedWicket) != null ? str12.equals(liveScores.secondPredictedWicket) : liveScores.secondPredictedWicket == null) && ((str13 = this.thirdPredictedWicket) != null ? str13.equals(liveScores.thirdPredictedWicket) : liveScores.thirdPredictedWicket == null) && ((str14 = this.fourthPredictedWicket) != null ? str14.equals(liveScores.fourthPredictedWicket) : liveScores.fourthPredictedWicket == null) && ((str15 = this.team2Id) != null ? str15.equals(liveScores.team2Id) : liveScores.team2Id == null) && ((str16 = this.team1Id) != null ? str16.equals(liveScores.team1Id) : liveScores.team1Id == null) && ((list = this.inningIds) != null ? list.equals(liveScores.inningIds) : liveScores.inningIds == null) && ((str17 = this.team1Name) != null ? str17.equals(liveScores.team1Name) : liveScores.team1Name == null) && ((str18 = this.team2Name) != null ? str18.equals(liveScores.team2Name) : liveScores.team2Name == null) && ((str19 = this.team1ShortName) != null ? str19.equals(liveScores.team1ShortName) : liveScores.team1ShortName == null) && ((str20 = this.team2ShortName) != null ? str20.equals(liveScores.team2ShortName) : liveScores.team2ShortName == null) && ((str21 = this.currentWickets) != null ? str21.equals(liveScores.currentWickets) : liveScores.currentWickets == null) && ((str22 = this.homeTeamShortName) != null ? str22.equals(liveScores.homeTeamShortName) : liveScores.homeTeamShortName == null) && ((str23 = this.homeTeamPercentage) != null ? str23.equals(liveScores.homeTeamPercentage) : liveScores.homeTeamPercentage == null) && ((str24 = this.awayTeamShortName) != null ? str24.equals(liveScores.awayTeamShortName) : liveScores.awayTeamShortName == null) && ((str25 = this.awayTeamPercentage) != null ? str25.equals(liveScores.awayTeamPercentage) : liveScores.awayTeamPercentage == null) && ((str26 = this.tiePercentage) != null ? str26.equals(liveScores.tiePercentage) : liveScores.tiePercentage == null)) {
                String str27 = this.currentOvers;
                String str28 = liveScores.currentOvers;
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
                Integer num = this.inningNo;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str = this.overNo;
                int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.currentScore;
                int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.predictedScore;
                int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.predictedOver;
                int hashCode6 = (hashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                CurrentView currentView2 = this.currentView;
                int hashCode7 = (hashCode6 ^ (currentView2 == null ? 0 : currentView2.hashCode())) * 1000003;
                PredictvizMarginView predictvizMarginView2 = this.predictvizMarginView;
                int hashCode8 = (hashCode7 ^ (predictvizMarginView2 == null ? 0 : predictvizMarginView2.hashCode())) * 1000003;
                WinvizView winvizView2 = this.winvizView;
                int hashCode9 = (hashCode8 ^ (winvizView2 == null ? 0 : winvizView2.hashCode())) * 1000003;
                String str5 = this.secondPredictedScore;
                int hashCode10 = (hashCode9 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.secondPredictedOVer;
                int hashCode11 = (hashCode10 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.thirdPredictedScore;
                int hashCode12 = (hashCode11 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.thirdPredictedOver;
                int hashCode13 = (hashCode12 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.fourthPredictedScore;
                int hashCode14 = (hashCode13 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.fourthPredictedOver;
                int hashCode15 = (hashCode14 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.predictedWicket;
                int hashCode16 = (hashCode15 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.secondPredictedWicket;
                int hashCode17 = (hashCode16 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.thirdPredictedWicket;
                int hashCode18 = (hashCode17 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.fourthPredictedWicket;
                int hashCode19 = (hashCode18 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.team2Id;
                int hashCode20 = (hashCode19 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.team1Id;
                int hashCode21 = (hashCode20 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                List<String> list = this.inningIds;
                int hashCode22 = (hashCode21 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str17 = this.team1Name;
                int hashCode23 = (hashCode22 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.team2Name;
                int hashCode24 = (hashCode23 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.team1ShortName;
                int hashCode25 = (hashCode24 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.team2ShortName;
                int hashCode26 = (hashCode25 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                String str21 = this.currentWickets;
                int hashCode27 = (hashCode26 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                String str22 = this.homeTeamShortName;
                int hashCode28 = (hashCode27 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
                String str23 = this.homeTeamPercentage;
                int hashCode29 = (hashCode28 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
                String str24 = this.awayTeamShortName;
                int hashCode30 = (hashCode29 ^ (str24 == null ? 0 : str24.hashCode())) * 1000003;
                String str25 = this.awayTeamPercentage;
                int hashCode31 = (hashCode30 ^ (str25 == null ? 0 : str25.hashCode())) * 1000003;
                String str26 = this.tiePercentage;
                int hashCode32 = (hashCode31 ^ (str26 == null ? 0 : str26.hashCode())) * 1000003;
                String str27 = this.currentOvers;
                if (str27 != null) {
                    i = str27.hashCode();
                }
                this.$hashCode = hashCode32 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<LiveScores> {
            final CurrentView.Mapper currentViewFieldMapper = new CurrentView.Mapper();
            final PredictvizMarginView.Mapper predictvizMarginViewFieldMapper = new PredictvizMarginView.Mapper();
            final WinvizView.Mapper winvizViewFieldMapper = new WinvizView.Mapper();

            @Override 
            public LiveScores map(ResponseReader responseReader) {
                return new LiveScores(responseReader.readString(LiveScores.$responseFields[0]), responseReader.readInt(LiveScores.$responseFields[1]), responseReader.readString(LiveScores.$responseFields[2]), responseReader.readString(LiveScores.$responseFields[3]), responseReader.readString(LiveScores.$responseFields[4]), responseReader.readString(LiveScores.$responseFields[5]), (CurrentView) responseReader.readObject(LiveScores.$responseFields[6], new ResponseReader.ObjectReader<CurrentView>() {

                    @Override 
                    public CurrentView read(ResponseReader responseReader) {
                        return Mapper.this.currentViewFieldMapper.map(responseReader);
                    }
                }), (PredictvizMarginView) responseReader.readObject(LiveScores.$responseFields[7], new ResponseReader.ObjectReader<PredictvizMarginView>() {

                    @Override 
                    public PredictvizMarginView read(ResponseReader responseReader) {
                        return Mapper.this.predictvizMarginViewFieldMapper.map(responseReader);
                    }
                }), (WinvizView) responseReader.readObject(LiveScores.$responseFields[8], new ResponseReader.ObjectReader<WinvizView>() {

                    @Override 
                    public WinvizView read(ResponseReader responseReader) {
                        return Mapper.this.winvizViewFieldMapper.map(responseReader);
                    }
                }), responseReader.readString(LiveScores.$responseFields[9]), responseReader.readString(LiveScores.$responseFields[10]), responseReader.readString(LiveScores.$responseFields[11]), responseReader.readString(LiveScores.$responseFields[12]), responseReader.readString(LiveScores.$responseFields[13]), responseReader.readString(LiveScores.$responseFields[14]), responseReader.readString(LiveScores.$responseFields[15]), responseReader.readString(LiveScores.$responseFields[16]), responseReader.readString(LiveScores.$responseFields[17]), responseReader.readString(LiveScores.$responseFields[18]), responseReader.readString(LiveScores.$responseFields[19]), responseReader.readString(LiveScores.$responseFields[20]), responseReader.readList(LiveScores.$responseFields[21], new ResponseReader.ListReader<String>() {

                    @Override 
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(LiveScores.$responseFields[22]), responseReader.readString(LiveScores.$responseFields[23]), responseReader.readString(LiveScores.$responseFields[24]), responseReader.readString(LiveScores.$responseFields[25]), responseReader.readString(LiveScores.$responseFields[26]), responseReader.readString(LiveScores.$responseFields[27]), responseReader.readString(LiveScores.$responseFields[28]), responseReader.readString(LiveScores.$responseFields[29]), responseReader.readString(LiveScores.$responseFields[30]), responseReader.readString(LiveScores.$responseFields[31]), responseReader.readString(LiveScores.$responseFields[32]));
            }
        }
    }

    public static class CurrentView {
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

        public CurrentView(String str, String str2, String str3, String str4, String str5, String str6) {
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
                    responseWriter.writeString(CurrentView.$responseFields[0], CurrentView.this.__typename);
                    responseWriter.writeString(CurrentView.$responseFields[1], CurrentView.this.homeTeamShortName);
                    responseWriter.writeString(CurrentView.$responseFields[2], CurrentView.this.homeTeamPercentage);
                    responseWriter.writeString(CurrentView.$responseFields[3], CurrentView.this.awayTeamShortName);
                    responseWriter.writeString(CurrentView.$responseFields[4], CurrentView.this.awayTeamPercentage);
                    responseWriter.writeString(CurrentView.$responseFields[5], CurrentView.this.tiePercentage);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "CurrentView{__typename=" + this.__typename + ", homeTeamShortName=" + this.homeTeamShortName + ", homeTeamPercentage=" + this.homeTeamPercentage + ", awayTeamShortName=" + this.awayTeamShortName + ", awayTeamPercentage=" + this.awayTeamPercentage + ", tiePercentage=" + this.tiePercentage + "}";
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
            if (!(obj instanceof CurrentView)) {
                return false;
            }
            CurrentView currentView = (CurrentView) obj;
            if (this.__typename.equals(currentView.__typename) && ((str = this.homeTeamShortName) != null ? str.equals(currentView.homeTeamShortName) : currentView.homeTeamShortName == null) && ((str2 = this.homeTeamPercentage) != null ? str2.equals(currentView.homeTeamPercentage) : currentView.homeTeamPercentage == null) && ((str3 = this.awayTeamShortName) != null ? str3.equals(currentView.awayTeamShortName) : currentView.awayTeamShortName == null) && ((str4 = this.awayTeamPercentage) != null ? str4.equals(currentView.awayTeamPercentage) : currentView.awayTeamPercentage == null)) {
                String str5 = this.tiePercentage;
                String str6 = currentView.tiePercentage;
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

        public static final class Mapper implements ResponseFieldMapper<CurrentView> {
            @Override 
            public CurrentView map(ResponseReader responseReader) {
                return new CurrentView(responseReader.readString(CurrentView.$responseFields[0]), responseReader.readString(CurrentView.$responseFields[1]), responseReader.readString(CurrentView.$responseFields[2]), responseReader.readString(CurrentView.$responseFields[3]), responseReader.readString(CurrentView.$responseFields[4]), responseReader.readString(CurrentView.$responseFields[5]));
            }
        }
    }

    public static class PredictvizMarginView {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("innings", "innings", null, true, Collections.emptyList()), ResponseField.forString("result", "result", null, true, Collections.emptyList()), ResponseField.forString("runs", "runs", null, true, Collections.emptyList()), ResponseField.forString("winnerTeamId", "winnerTeamId", null, true, Collections.emptyList()), ResponseField.forString("wickets", "wickets", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String innings;
        final String result;
        final String runs;
        final String wickets;
        final String winnerTeamId;

        public PredictvizMarginView(String str, String str2, String str3, String str4, String str5, String str6) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.innings = str2;
            this.result = str3;
            this.runs = str4;
            this.winnerTeamId = str5;
            this.wickets = str6;
        }

        public String __typename() {
            return this.__typename;
        }

        public String innings() {
            return this.innings;
        }

        public String result() {
            return this.result;
        }

        public String runs() {
            return this.runs;
        }

        public String winnerTeamId() {
            return this.winnerTeamId;
        }

        public String wickets() {
            return this.wickets;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(PredictvizMarginView.$responseFields[0], PredictvizMarginView.this.__typename);
                    responseWriter.writeString(PredictvizMarginView.$responseFields[1], PredictvizMarginView.this.innings);
                    responseWriter.writeString(PredictvizMarginView.$responseFields[2], PredictvizMarginView.this.result);
                    responseWriter.writeString(PredictvizMarginView.$responseFields[3], PredictvizMarginView.this.runs);
                    responseWriter.writeString(PredictvizMarginView.$responseFields[4], PredictvizMarginView.this.winnerTeamId);
                    responseWriter.writeString(PredictvizMarginView.$responseFields[5], PredictvizMarginView.this.wickets);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "PredictvizMarginView{__typename=" + this.__typename + ", innings=" + this.innings + ", result=" + this.result + ", runs=" + this.runs + ", winnerTeamId=" + this.winnerTeamId + ", wickets=" + this.wickets + "}";
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
            if (!(obj instanceof PredictvizMarginView)) {
                return false;
            }
            PredictvizMarginView predictvizMarginView = (PredictvizMarginView) obj;
            if (this.__typename.equals(predictvizMarginView.__typename) && ((str = this.innings) != null ? str.equals(predictvizMarginView.innings) : predictvizMarginView.innings == null) && ((str2 = this.result) != null ? str2.equals(predictvizMarginView.result) : predictvizMarginView.result == null) && ((str3 = this.runs) != null ? str3.equals(predictvizMarginView.runs) : predictvizMarginView.runs == null) && ((str4 = this.winnerTeamId) != null ? str4.equals(predictvizMarginView.winnerTeamId) : predictvizMarginView.winnerTeamId == null)) {
                String str5 = this.wickets;
                String str6 = predictvizMarginView.wickets;
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
                String str = this.innings;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.result;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.runs;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.winnerTeamId;
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

        public static final class Mapper implements ResponseFieldMapper<PredictvizMarginView> {
            @Override 
            public PredictvizMarginView map(ResponseReader responseReader) {
                return new PredictvizMarginView(responseReader.readString(PredictvizMarginView.$responseFields[0]), responseReader.readString(PredictvizMarginView.$responseFields[1]), responseReader.readString(PredictvizMarginView.$responseFields[2]), responseReader.readString(PredictvizMarginView.$responseFields[3]), responseReader.readString(PredictvizMarginView.$responseFields[4]), responseReader.readString(PredictvizMarginView.$responseFields[5]));
            }
        }
    }

    public static class WinvizView {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("battingTeamPercent", "battingTeamPercent", null, true, Collections.emptyList()), ResponseField.forString("bowlingTeamPercent", "bowlingTeamPercent", null, true, Collections.emptyList()), ResponseField.forString("drawPercent", "drawPercent", null, true, Collections.emptyList()), ResponseField.forString("tiePercent", "tiePercent", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String battingTeamPercent;
        final String bowlingTeamPercent;
        final String drawPercent;
        final String tiePercent;

        public WinvizView(String str, String str2, String str3, String str4, String str5) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.battingTeamPercent = str2;
            this.bowlingTeamPercent = str3;
            this.drawPercent = str4;
            this.tiePercent = str5;
        }

        public String __typename() {
            return this.__typename;
        }

        public String battingTeamPercent() {
            return this.battingTeamPercent;
        }

        public String bowlingTeamPercent() {
            return this.bowlingTeamPercent;
        }

        public String drawPercent() {
            return this.drawPercent;
        }

        public String tiePercent() {
            return this.tiePercent;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(WinvizView.$responseFields[0], WinvizView.this.__typename);
                    responseWriter.writeString(WinvizView.$responseFields[1], WinvizView.this.battingTeamPercent);
                    responseWriter.writeString(WinvizView.$responseFields[2], WinvizView.this.bowlingTeamPercent);
                    responseWriter.writeString(WinvizView.$responseFields[3], WinvizView.this.drawPercent);
                    responseWriter.writeString(WinvizView.$responseFields[4], WinvizView.this.tiePercent);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "WinvizView{__typename=" + this.__typename + ", battingTeamPercent=" + this.battingTeamPercent + ", bowlingTeamPercent=" + this.bowlingTeamPercent + ", drawPercent=" + this.drawPercent + ", tiePercent=" + this.tiePercent + "}";
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
            if (!(obj instanceof WinvizView)) {
                return false;
            }
            WinvizView winvizView = (WinvizView) obj;
            if (this.__typename.equals(winvizView.__typename) && ((str = this.battingTeamPercent) != null ? str.equals(winvizView.battingTeamPercent) : winvizView.battingTeamPercent == null) && ((str2 = this.bowlingTeamPercent) != null ? str2.equals(winvizView.bowlingTeamPercent) : winvizView.bowlingTeamPercent == null) && ((str3 = this.drawPercent) != null ? str3.equals(winvizView.drawPercent) : winvizView.drawPercent == null)) {
                String str4 = this.tiePercent;
                String str5 = winvizView.tiePercent;
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
                String str = this.battingTeamPercent;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.bowlingTeamPercent;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.drawPercent;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.tiePercent;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<WinvizView> {
            @Override 
            public WinvizView map(ResponseReader responseReader) {
                return new WinvizView(responseReader.readString(WinvizView.$responseFields[0]), responseReader.readString(WinvizView.$responseFields[1]), responseReader.readString(WinvizView.$responseFields[2]), responseReader.readString(WinvizView.$responseFields[3]), responseReader.readString(WinvizView.$responseFields[4]));
            }
        }
    }
}
