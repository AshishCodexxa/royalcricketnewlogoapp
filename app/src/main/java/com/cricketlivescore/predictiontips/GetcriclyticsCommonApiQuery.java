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
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

public final class GetcriclyticsCommonApiQuery implements Query<GetcriclyticsCommonApiQuery.Data, GetcriclyticsCommonApiQuery.Data, GetcriclyticsCommonApiQuery.Variables> {
    public static final String OPERATION_ID = "f57b148c44a76c005eac418e8f3484531995373dc39f0ba14fa4038af3396377";
    public static final OperationName OPERATION_NAME = new OperationName() {
      
       @Override
        public String name() {
            return "getcriclyticsCommonApi";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query getcriclyticsCommonApi($matchId: String, $innings: String) {\n  getcriclyticsCommonApi(matchId: $matchId, innings: $innings) {\n    __typename\n    lasttenball {\n      __typename\n      isBall\n      isWicket\n      runs\n      type\n      isLastBall\n    }\n    scoreCard {\n      __typename\n      batting {\n        __typename\n        matchID\n        playerID\n        playerName\n        playerTeam\n        playerMatchSixes\n        playerMatchFours\n        playerMatchBalls\n        playerMatchRuns\n        playerBattingNumber\n        playerDismissalInfo\n        playerHowOut\n        playerMatchStrikeRate\n        playerOnStrike\n      }\n      bowling {\n        __typename\n        matchID\n        playerID\n        playerName\n        playerTeam\n        playerDotBalls\n        playerWicketsTaken\n        playerMaidensBowled\n        playerRunsConceeded\n        playerWides\n        playerNoBall\n        playerOversBowled\n        playerEconomyRate\n      }\n    }\n    matchId\n    TeamProjections {\n      __typename\n      inningNo\n      overNo\n      currentScore\n      predictedScore\n      predictedOver\n      predictvizMarginView {\n        __typename\n        innings\n        result\n        runs\n        winnerTeamId\n        wickets\n      }\n      winvizView {\n        __typename\n        battingTeamPercent\n        bowlingTeamPercent\n        drawPercent\n        tiePercent\n      }\n      secondPredictedScore\n      secondPredictedOVer\n      thirdPredictedScore\n      thirdPredictedOver\n      fourthPredictedScore\n      fourthPredictedOver\n      predictedWicket\n      secondPredictedWicket\n      thirdPredictedWicket\n      fourthPredictedWicket\n      team2Id\n      team1Id\n      inningIds\n      team1Name\n      team2Name\n      team1ShortName\n      team2ShortName\n      currentWickets\n      homeTeamShortName\n      homeTeamPercentage\n      awayTeamShortName\n      awayTeamPercentage\n      tiePercentage\n      currentOvers\n    }\n    bowler {\n      __typename\n      matchID\n      strikerId\n      nonStrikerId\n      strikerName\n      nonStrikerName\n      bowlerId\n      bowlerRuns\n      wicketsTakenTillNow\n      maxOvers\n      oversBowledSoFar\n      strikerPosition\n      nonStrikerPosition\n      inningNo\n      format\n      bowlerName\n      teamName\n      projected\n      bounds\n    }\n    batsman {\n      __typename\n      playerId\n      playerRuns\n      playerName\n      playerBalls\n      playerTeamName\n      inningNo\n      overNo\n      format\n      playerBattingProbabilities {\n        __typename\n        playerId\n        playerData {\n          __typename\n          probabilities\n          bound\n          red\n        }\n        playerBound\n        teamId\n      }\n    }\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public GetcriclyticsCommonApiQuery(Input<String> input, Input<String> input2) {
        Utils.checkNotNull(input, "matchId == null");
        Utils.checkNotNull(input2, "innings == null");
        this.variables = new Variables(input, input2);
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
        private Input<String> innings = Input.absent();
        private Input<String> matchId = Input.absent();

        Builder() {
        }

        public Builder matchId(String str) {
            this.matchId = Input.fromNullable(str);
            return this;
        }

        public Builder innings(String str) {
            this.innings = Input.fromNullable(str);
            return this;
        }

        public Builder matchIdInput(Input<String> input) {
            this.matchId = (Input) Utils.checkNotNull(input, "matchId == null");
            return this;
        }

        public Builder inningsInput(Input<String> input) {
            this.innings = (Input) Utils.checkNotNull(input, "innings == null");
            return this;
        }

        public GetcriclyticsCommonApiQuery build() {
            return new GetcriclyticsCommonApiQuery(this.matchId, this.innings);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final Input<String> innings;
        private final Input<String> matchId;
        private final transient Map<String, Object> valueMap;

        Variables(Input<String> input, Input<String> input2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.matchId = input;
            this.innings = input2;
            if (input.defined) {
                linkedHashMap.put("matchId", input.value);
            }
            if (input2.defined) {
                linkedHashMap.put("innings", input2.value);
            }
        }

        public Input<String> matchId() {
            return this.matchId;
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
                    if (Variables.this.matchId.defined) {
                        inputFieldWriter.writeString("matchId", Variables.this.matchId.value);
                    }
                    if (Variables.this.innings.defined) {
                        inputFieldWriter.writeString("innings", Variables.this.innings.value);
                    }
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getcriclyticsCommonApi", "getcriclyticsCommonApi", new UnmodifiableMapBuilder(2).put("matchId", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "matchId").build()).put("innings", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "innings").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final GetcriclyticsCommonApi getcriclyticsCommonApi;

        public Data(GetcriclyticsCommonApi getcriclyticsCommonApi2) {
            this.getcriclyticsCommonApi = getcriclyticsCommonApi2;
        }

        public GetcriclyticsCommonApi getcriclyticsCommonApi() {
            return this.getcriclyticsCommonApi;
        }

      @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.getcriclyticsCommonApi != null ? Data.this.getcriclyticsCommonApi.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getcriclyticsCommonApi=" + this.getcriclyticsCommonApi + "}";
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
            GetcriclyticsCommonApi getcriclyticsCommonApi2 = this.getcriclyticsCommonApi;
            GetcriclyticsCommonApi getcriclyticsCommonApi3 = ((Data) obj).getcriclyticsCommonApi;
            if (getcriclyticsCommonApi2 != null) {
                return getcriclyticsCommonApi2.equals(getcriclyticsCommonApi3);
            }
            if (getcriclyticsCommonApi3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetcriclyticsCommonApi getcriclyticsCommonApi2 = this.getcriclyticsCommonApi;
                this.$hashCode = 1000003 ^ (getcriclyticsCommonApi2 == null ? 0 : getcriclyticsCommonApi2.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetcriclyticsCommonApi.Mapper getcriclyticsCommonApiFieldMapper = new GetcriclyticsCommonApi.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((GetcriclyticsCommonApi) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetcriclyticsCommonApi>() {


                    @Override 
                    public GetcriclyticsCommonApi read(ResponseReader responseReader) {
                        return Mapper.this.getcriclyticsCommonApiFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class GetcriclyticsCommonApi {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("lasttenball", "lasttenball", null, true, Collections.emptyList()), ResponseField.forObject("scoreCard", "scoreCard", null, true, Collections.emptyList()), ResponseField.forString("matchId", "matchId", null, true, Collections.emptyList()), ResponseField.forList("TeamProjections", "TeamProjections", null, true, Collections.emptyList()), ResponseField.forObject("bowler", "bowler", null, true, Collections.emptyList()), ResponseField.forList("batsman", "batsman", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final List<TeamProjection> TeamProjections;
        final String __typename;
        final List<Batsman> batsman;
        final Bowler bowler;
        final List<Lasttenball> lasttenball;
        final String matchId;
        final ScoreCard scoreCard;

        public GetcriclyticsCommonApi(String str, List<Lasttenball> list, ScoreCard scoreCard2, String str2, List<TeamProjection> list2, Bowler bowler2, List<Batsman> list3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.lasttenball = list;
            this.scoreCard = scoreCard2;
            this.matchId = str2;
            this.TeamProjections = list2;
            this.bowler = bowler2;
            this.batsman = list3;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Lasttenball> lasttenball() {
            return this.lasttenball;
        }

        public ScoreCard scoreCard() {
            return this.scoreCard;
        }

        public String matchId() {
            return this.matchId;
        }

        public List<TeamProjection> TeamProjections() {
            return this.TeamProjections;
        }

        public Bowler bowler() {
            return this.bowler;
        }

        public List<Batsman> batsman() {
            return this.batsman;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(GetcriclyticsCommonApi.$responseFields[0], GetcriclyticsCommonApi.this.__typename);
                    responseWriter.writeList(GetcriclyticsCommonApi.$responseFields[1], GetcriclyticsCommonApi.this.lasttenball, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Lasttenball) it.next()).marshaller());
                            }
                        }
                    });
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(GetcriclyticsCommonApi.$responseFields[2], GetcriclyticsCommonApi.this.scoreCard != null ? GetcriclyticsCommonApi.this.scoreCard.marshaller() : null);
                    responseWriter.writeString(GetcriclyticsCommonApi.$responseFields[3], GetcriclyticsCommonApi.this.matchId);
                    responseWriter.writeList(GetcriclyticsCommonApi.$responseFields[4], GetcriclyticsCommonApi.this.TeamProjections, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((TeamProjection) it.next()).marshaller());
                            }
                        }
                    });
                    ResponseField responseField = GetcriclyticsCommonApi.$responseFields[5];
                    if (GetcriclyticsCommonApi.this.bowler != null) {
                        responseFieldMarshaller = GetcriclyticsCommonApi.this.bowler.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                    responseWriter.writeList(GetcriclyticsCommonApi.$responseFields[6], GetcriclyticsCommonApi.this.batsman, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Batsman) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetcriclyticsCommonApi{__typename=" + this.__typename + ", lasttenball=" + this.lasttenball + ", scoreCard=" + this.scoreCard + ", matchId=" + this.matchId + ", TeamProjections=" + this.TeamProjections + ", bowler=" + this.bowler + ", batsman=" + this.batsman + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<Lasttenball> list;
            ScoreCard scoreCard2;
            String str;
            List<TeamProjection> list2;
            Bowler bowler2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetcriclyticsCommonApi)) {
                return false;
            }
            GetcriclyticsCommonApi getcriclyticsCommonApi = (GetcriclyticsCommonApi) obj;
            if (this.__typename.equals(getcriclyticsCommonApi.__typename) && ((list = this.lasttenball) != null ? list.equals(getcriclyticsCommonApi.lasttenball) : getcriclyticsCommonApi.lasttenball == null) && ((scoreCard2 = this.scoreCard) != null ? scoreCard2.equals(getcriclyticsCommonApi.scoreCard) : getcriclyticsCommonApi.scoreCard == null) && ((str = this.matchId) != null ? str.equals(getcriclyticsCommonApi.matchId) : getcriclyticsCommonApi.matchId == null) && ((list2 = this.TeamProjections) != null ? list2.equals(getcriclyticsCommonApi.TeamProjections) : getcriclyticsCommonApi.TeamProjections == null) && ((bowler2 = this.bowler) != null ? bowler2.equals(getcriclyticsCommonApi.bowler) : getcriclyticsCommonApi.bowler == null)) {
                List<Batsman> list3 = this.batsman;
                List<Batsman> list4 = getcriclyticsCommonApi.batsman;
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
                List<Lasttenball> list = this.lasttenball;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                ScoreCard scoreCard2 = this.scoreCard;
                int hashCode3 = (hashCode2 ^ (scoreCard2 == null ? 0 : scoreCard2.hashCode())) * 1000003;
                String str = this.matchId;
                int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                List<TeamProjection> list2 = this.TeamProjections;
                int hashCode5 = (hashCode4 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                Bowler bowler2 = this.bowler;
                int hashCode6 = (hashCode5 ^ (bowler2 == null ? 0 : bowler2.hashCode())) * 1000003;
                List<Batsman> list3 = this.batsman;
                if (list3 != null) {
                    i = list3.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<GetcriclyticsCommonApi> {
            final Batsman.Mapper batsmanFieldMapper = new Batsman.Mapper();
            final Bowler.Mapper bowlerFieldMapper = new Bowler.Mapper();
            final Lasttenball.Mapper lasttenballFieldMapper = new Lasttenball.Mapper();
            final ScoreCard.Mapper scoreCardFieldMapper = new ScoreCard.Mapper();
            final TeamProjection.Mapper teamProjectionFieldMapper = new TeamProjection.Mapper();

            @Override 
            public GetcriclyticsCommonApi map(ResponseReader responseReader) {
                return new GetcriclyticsCommonApi(responseReader.readString(GetcriclyticsCommonApi.$responseFields[0]), responseReader.readList(GetcriclyticsCommonApi.$responseFields[1], new ResponseReader.ListReader<Lasttenball>() {


                    @Override 
                    public Lasttenball read(ResponseReader.ListItemReader listItemReader) {
                        return (Lasttenball) listItemReader.readObject(new ResponseReader.ObjectReader<Lasttenball>() {


                            @Override 
                            public Lasttenball read(ResponseReader responseReader) {
                                return Mapper.this.lasttenballFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (ScoreCard) responseReader.readObject(GetcriclyticsCommonApi.$responseFields[2], new ResponseReader.ObjectReader<ScoreCard>() {


                    @Override 
                    public ScoreCard read(ResponseReader responseReader) {
                        return Mapper.this.scoreCardFieldMapper.map(responseReader);
                    }
                }), responseReader.readString(GetcriclyticsCommonApi.$responseFields[3]), responseReader.readList(GetcriclyticsCommonApi.$responseFields[4], new ResponseReader.ListReader<TeamProjection>() {


                    @Override 
                    public TeamProjection read(ResponseReader.ListItemReader listItemReader) {
                        return (TeamProjection) listItemReader.readObject(new ResponseReader.ObjectReader<TeamProjection>() {


                            @Override 
                            public TeamProjection read(ResponseReader responseReader) {
                                return Mapper.this.teamProjectionFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (Bowler) responseReader.readObject(GetcriclyticsCommonApi.$responseFields[5], new ResponseReader.ObjectReader<Bowler>() {


                    @Override 
                    public Bowler read(ResponseReader responseReader) {
                        return Mapper.this.bowlerFieldMapper.map(responseReader);
                    }
                }), responseReader.readList(GetcriclyticsCommonApi.$responseFields[6], new ResponseReader.ListReader<Batsman>() {


                    @Override 
                    public Batsman read(ResponseReader.ListItemReader listItemReader) {
                        return (Batsman) listItemReader.readObject(new ResponseReader.ObjectReader<Batsman>() {


                            @Override 
                            public Batsman read(ResponseReader responseReader) {
                                return Mapper.this.batsmanFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class Lasttenball {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forBoolean("isBall", "isBall", null, true, Collections.emptyList()), ResponseField.forBoolean("isWicket", "isWicket", null, true, Collections.emptyList()), ResponseField.forString("runs", "runs", null, true, Collections.emptyList()), ResponseField.forString("type", "type", null, true, Collections.emptyList()), ResponseField.forBoolean("isLastBall", "isLastBall", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Boolean isBall;
        final Boolean isLastBall;
        final Boolean isWicket;
        final String runs;
        final String type;

        public Lasttenball(String str, Boolean bool, Boolean bool2, String str2, String str3, Boolean bool3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.isBall = bool;
            this.isWicket = bool2;
            this.runs = str2;
            this.type = str3;
            this.isLastBall = bool3;
        }

        public String __typename() {
            return this.__typename;
        }

        public Boolean isBall() {
            return this.isBall;
        }

        public Boolean isWicket() {
            return this.isWicket;
        }

        public String runs() {
            return this.runs;
        }

        public String type() {
            return this.type;
        }

        public Boolean isLastBall() {
            return this.isLastBall;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Lasttenball.$responseFields[0], Lasttenball.this.__typename);
                    responseWriter.writeBoolean(Lasttenball.$responseFields[1], Lasttenball.this.isBall);
                    responseWriter.writeBoolean(Lasttenball.$responseFields[2], Lasttenball.this.isWicket);
                    responseWriter.writeString(Lasttenball.$responseFields[3], Lasttenball.this.runs);
                    responseWriter.writeString(Lasttenball.$responseFields[4], Lasttenball.this.type);
                    responseWriter.writeBoolean(Lasttenball.$responseFields[5], Lasttenball.this.isLastBall);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Lasttenball{__typename=" + this.__typename + ", isBall=" + this.isBall + ", isWicket=" + this.isWicket + ", runs=" + this.runs + ", type=" + this.type + ", isLastBall=" + this.isLastBall + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Boolean bool;
            Boolean bool2;
            String str;
            String str2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Lasttenball)) {
                return false;
            }
            Lasttenball lasttenball = (Lasttenball) obj;
            if (this.__typename.equals(lasttenball.__typename) && ((bool = this.isBall) != null ? bool.equals(lasttenball.isBall) : lasttenball.isBall == null) && ((bool2 = this.isWicket) != null ? bool2.equals(lasttenball.isWicket) : lasttenball.isWicket == null) && ((str = this.runs) != null ? str.equals(lasttenball.runs) : lasttenball.runs == null) && ((str2 = this.type) != null ? str2.equals(lasttenball.type) : lasttenball.type == null)) {
                Boolean bool3 = this.isLastBall;
                Boolean bool4 = lasttenball.isLastBall;
                if (bool3 == null) {
                    if (bool4 == null) {
                        return true;
                    }
                } else if (bool3.equals(bool4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Boolean bool = this.isBall;
                int i = 0;
                int hashCode2 = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.isWicket;
                int hashCode3 = (hashCode2 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str = this.runs;
                int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.type;
                int hashCode5 = (hashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Boolean bool3 = this.isLastBall;
                if (bool3 != null) {
                    i = bool3.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Lasttenball> {
            @Override 
            public Lasttenball map(ResponseReader responseReader) {
                return new Lasttenball(responseReader.readString(Lasttenball.$responseFields[0]), responseReader.readBoolean(Lasttenball.$responseFields[1]), responseReader.readBoolean(Lasttenball.$responseFields[2]), responseReader.readString(Lasttenball.$responseFields[3]), responseReader.readString(Lasttenball.$responseFields[4]), responseReader.readBoolean(Lasttenball.$responseFields[5]));
            }
        }
    }

    public static class ScoreCard {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("batting", "batting", null, true, Collections.emptyList()), ResponseField.forList("bowling", "bowling", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Batting> batting;
        final List<Bowling> bowling;

        public ScoreCard(String str, List<Batting> list, List<Bowling> list2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.batting = list;
            this.bowling = list2;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Batting> batting() {
            return this.batting;
        }

        public List<Bowling> bowling() {
            return this.bowling;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(ScoreCard.$responseFields[0], ScoreCard.this.__typename);
                    responseWriter.writeList(ScoreCard.$responseFields[1], ScoreCard.this.batting, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Batting) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(ScoreCard.$responseFields[2], ScoreCard.this.bowling, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Bowling) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ScoreCard{__typename=" + this.__typename + ", batting=" + this.batting + ", bowling=" + this.bowling + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<Batting> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ScoreCard)) {
                return false;
            }
            ScoreCard scoreCard = (ScoreCard) obj;
            if (this.__typename.equals(scoreCard.__typename) && ((list = this.batting) != null ? list.equals(scoreCard.batting) : scoreCard.batting == null)) {
                List<Bowling> list2 = this.bowling;
                List<Bowling> list3 = scoreCard.bowling;
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
                List<Batting> list = this.batting;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Bowling> list2 = this.bowling;
                if (list2 != null) {
                    i = list2.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<ScoreCard> {
            final Batting.Mapper battingFieldMapper = new Batting.Mapper();
            final Bowling.Mapper bowlingFieldMapper = new Bowling.Mapper();

            @Override 
            public ScoreCard map(ResponseReader responseReader) {
                return new ScoreCard(responseReader.readString(ScoreCard.$responseFields[0]), responseReader.readList(ScoreCard.$responseFields[1], new ResponseReader.ListReader<Batting>() {


                    @Override 
                    public Batting read(ResponseReader.ListItemReader listItemReader) {
                        return (Batting) listItemReader.readObject(new ResponseReader.ObjectReader<Batting>() {


                            @Override 
                            public Batting read(ResponseReader responseReader) {
                                return Mapper.this.battingFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(ScoreCard.$responseFields[2], new ResponseReader.ListReader<Bowling>() {


                    @Override 
                    public Bowling read(ResponseReader.ListItemReader listItemReader) {
                        return (Bowling) listItemReader.readObject(new ResponseReader.ObjectReader<Bowling>() {


                            @Override 
                            public Bowling read(ResponseReader responseReader) {
                                return Mapper.this.bowlingFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class Batting {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchID", "matchID", null, true, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerTeam", "playerTeam", null, true, Collections.emptyList()), ResponseField.forString("playerMatchSixes", "playerMatchSixes", null, true, Collections.emptyList()), ResponseField.forString("playerMatchFours", "playerMatchFours", null, true, Collections.emptyList()), ResponseField.forString("playerMatchBalls", "playerMatchBalls", null, true, Collections.emptyList()), ResponseField.forString("playerMatchRuns", "playerMatchRuns", null, true, Collections.emptyList()), ResponseField.forInt("playerBattingNumber", "playerBattingNumber", null, true, Collections.emptyList()), ResponseField.forString("playerDismissalInfo", "playerDismissalInfo", null, true, Collections.emptyList()), ResponseField.forString("playerHowOut", "playerHowOut", null, true, Collections.emptyList()), ResponseField.forString("playerMatchStrikeRate", "playerMatchStrikeRate", null, true, Collections.emptyList()), ResponseField.forBoolean("playerOnStrike", "playerOnStrike", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String matchID;
        final Integer playerBattingNumber;
        final String playerDismissalInfo;
        final String playerHowOut;
        final String playerID;
        final String playerMatchBalls;
        final String playerMatchFours;
        final String playerMatchRuns;
        final String playerMatchSixes;
        final String playerMatchStrikeRate;
        final String playerName;
        final Boolean playerOnStrike;
        final String playerTeam;

        public Batting(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, String str10, String str11, String str12, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchID = str2;
            this.playerID = str3;
            this.playerName = str4;
            this.playerTeam = str5;
            this.playerMatchSixes = str6;
            this.playerMatchFours = str7;
            this.playerMatchBalls = str8;
            this.playerMatchRuns = str9;
            this.playerBattingNumber = num;
            this.playerDismissalInfo = str10;
            this.playerHowOut = str11;
            this.playerMatchStrikeRate = str12;
            this.playerOnStrike = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchID() {
            return this.matchID;
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

        public String playerMatchSixes() {
            return this.playerMatchSixes;
        }

        public String playerMatchFours() {
            return this.playerMatchFours;
        }

        public String playerMatchBalls() {
            return this.playerMatchBalls;
        }

        public String playerMatchRuns() {
            return this.playerMatchRuns;
        }

        public Integer playerBattingNumber() {
            return this.playerBattingNumber;
        }

        public String playerDismissalInfo() {
            return this.playerDismissalInfo;
        }

        public String playerHowOut() {
            return this.playerHowOut;
        }

        public String playerMatchStrikeRate() {
            return this.playerMatchStrikeRate;
        }

        public Boolean playerOnStrike() {
            return this.playerOnStrike;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Batting.$responseFields[0], Batting.this.__typename);
                    responseWriter.writeString(Batting.$responseFields[1], Batting.this.matchID);
                    responseWriter.writeString(Batting.$responseFields[2], Batting.this.playerID);
                    responseWriter.writeString(Batting.$responseFields[3], Batting.this.playerName);
                    responseWriter.writeString(Batting.$responseFields[4], Batting.this.playerTeam);
                    responseWriter.writeString(Batting.$responseFields[5], Batting.this.playerMatchSixes);
                    responseWriter.writeString(Batting.$responseFields[6], Batting.this.playerMatchFours);
                    responseWriter.writeString(Batting.$responseFields[7], Batting.this.playerMatchBalls);
                    responseWriter.writeString(Batting.$responseFields[8], Batting.this.playerMatchRuns);
                    responseWriter.writeInt(Batting.$responseFields[9], Batting.this.playerBattingNumber);
                    responseWriter.writeString(Batting.$responseFields[10], Batting.this.playerDismissalInfo);
                    responseWriter.writeString(Batting.$responseFields[11], Batting.this.playerHowOut);
                    responseWriter.writeString(Batting.$responseFields[12], Batting.this.playerMatchStrikeRate);
                    responseWriter.writeBoolean(Batting.$responseFields[13], Batting.this.playerOnStrike);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Batting{__typename=" + this.__typename + ", matchID=" + this.matchID + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerTeam=" + this.playerTeam + ", playerMatchSixes=" + this.playerMatchSixes + ", playerMatchFours=" + this.playerMatchFours + ", playerMatchBalls=" + this.playerMatchBalls + ", playerMatchRuns=" + this.playerMatchRuns + ", playerBattingNumber=" + this.playerBattingNumber + ", playerDismissalInfo=" + this.playerDismissalInfo + ", playerHowOut=" + this.playerHowOut + ", playerMatchStrikeRate=" + this.playerMatchStrikeRate + ", playerOnStrike=" + this.playerOnStrike + "}";
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
            Integer num;
            String str9;
            String str10;
            String str11;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Batting)) {
                return false;
            }
            Batting batting = (Batting) obj;
            if (this.__typename.equals(batting.__typename) && ((str = this.matchID) != null ? str.equals(batting.matchID) : batting.matchID == null) && ((str2 = this.playerID) != null ? str2.equals(batting.playerID) : batting.playerID == null) && ((str3 = this.playerName) != null ? str3.equals(batting.playerName) : batting.playerName == null) && ((str4 = this.playerTeam) != null ? str4.equals(batting.playerTeam) : batting.playerTeam == null) && ((str5 = this.playerMatchSixes) != null ? str5.equals(batting.playerMatchSixes) : batting.playerMatchSixes == null) && ((str6 = this.playerMatchFours) != null ? str6.equals(batting.playerMatchFours) : batting.playerMatchFours == null) && ((str7 = this.playerMatchBalls) != null ? str7.equals(batting.playerMatchBalls) : batting.playerMatchBalls == null) && ((str8 = this.playerMatchRuns) != null ? str8.equals(batting.playerMatchRuns) : batting.playerMatchRuns == null) && ((num = this.playerBattingNumber) != null ? num.equals(batting.playerBattingNumber) : batting.playerBattingNumber == null) && ((str9 = this.playerDismissalInfo) != null ? str9.equals(batting.playerDismissalInfo) : batting.playerDismissalInfo == null) && ((str10 = this.playerHowOut) != null ? str10.equals(batting.playerHowOut) : batting.playerHowOut == null) && ((str11 = this.playerMatchStrikeRate) != null ? str11.equals(batting.playerMatchStrikeRate) : batting.playerMatchStrikeRate == null)) {
                Boolean bool = this.playerOnStrike;
                Boolean bool2 = batting.playerOnStrike;
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
                String str = this.matchID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerID;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerName;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerTeam;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerMatchSixes;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.playerMatchFours;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.playerMatchBalls;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.playerMatchRuns;
                int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                Integer num = this.playerBattingNumber;
                int hashCode10 = (hashCode9 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str9 = this.playerDismissalInfo;
                int hashCode11 = (hashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.playerHowOut;
                int hashCode12 = (hashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.playerMatchStrikeRate;
                int hashCode13 = (hashCode12 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                Boolean bool = this.playerOnStrike;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode13 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Batting> {
            @Override 
            public Batting map(ResponseReader responseReader) {
                return new Batting(responseReader.readString(Batting.$responseFields[0]), responseReader.readString(Batting.$responseFields[1]), responseReader.readString(Batting.$responseFields[2]), responseReader.readString(Batting.$responseFields[3]), responseReader.readString(Batting.$responseFields[4]), responseReader.readString(Batting.$responseFields[5]), responseReader.readString(Batting.$responseFields[6]), responseReader.readString(Batting.$responseFields[7]), responseReader.readString(Batting.$responseFields[8]), responseReader.readInt(Batting.$responseFields[9]), responseReader.readString(Batting.$responseFields[10]), responseReader.readString(Batting.$responseFields[11]), responseReader.readString(Batting.$responseFields[12]), responseReader.readBoolean(Batting.$responseFields[13]));
            }
        }
    }

    public static class Bowling {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchID", "matchID", null, true, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerTeam", "playerTeam", null, true, Collections.emptyList()), ResponseField.forString("playerDotBalls", "playerDotBalls", null, true, Collections.emptyList()), ResponseField.forString("playerWicketsTaken", "playerWicketsTaken", null, true, Collections.emptyList()), ResponseField.forString("playerMaidensBowled", "playerMaidensBowled", null, true, Collections.emptyList()), ResponseField.forString("playerRunsConceeded", "playerRunsConceeded", null, true, Collections.emptyList()), ResponseField.forString("playerWides", "playerWides", null, true, Collections.emptyList()), ResponseField.forString("playerNoBall", "playerNoBall", null, true, Collections.emptyList()), ResponseField.forString("playerOversBowled", "playerOversBowled", null, true, Collections.emptyList()), ResponseField.forString("playerEconomyRate", "playerEconomyRate", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String matchID;
        final String playerDotBalls;
        final String playerEconomyRate;
        final String playerID;
        final String playerMaidensBowled;
        final String playerName;
        final String playerNoBall;
        final String playerOversBowled;
        final String playerRunsConceeded;
        final String playerTeam;
        final String playerWicketsTaken;
        final String playerWides;

        public Bowling(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchID = str2;
            this.playerID = str3;
            this.playerName = str4;
            this.playerTeam = str5;
            this.playerDotBalls = str6;
            this.playerWicketsTaken = str7;
            this.playerMaidensBowled = str8;
            this.playerRunsConceeded = str9;
            this.playerWides = str10;
            this.playerNoBall = str11;
            this.playerOversBowled = str12;
            this.playerEconomyRate = str13;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchID() {
            return this.matchID;
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

        public String playerWides() {
            return this.playerWides;
        }

        public String playerNoBall() {
            return this.playerNoBall;
        }

        public String playerOversBowled() {
            return this.playerOversBowled;
        }

        public String playerEconomyRate() {
            return this.playerEconomyRate;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Bowling.$responseFields[0], Bowling.this.__typename);
                    responseWriter.writeString(Bowling.$responseFields[1], Bowling.this.matchID);
                    responseWriter.writeString(Bowling.$responseFields[2], Bowling.this.playerID);
                    responseWriter.writeString(Bowling.$responseFields[3], Bowling.this.playerName);
                    responseWriter.writeString(Bowling.$responseFields[4], Bowling.this.playerTeam);
                    responseWriter.writeString(Bowling.$responseFields[5], Bowling.this.playerDotBalls);
                    responseWriter.writeString(Bowling.$responseFields[6], Bowling.this.playerWicketsTaken);
                    responseWriter.writeString(Bowling.$responseFields[7], Bowling.this.playerMaidensBowled);
                    responseWriter.writeString(Bowling.$responseFields[8], Bowling.this.playerRunsConceeded);
                    responseWriter.writeString(Bowling.$responseFields[9], Bowling.this.playerWides);
                    responseWriter.writeString(Bowling.$responseFields[10], Bowling.this.playerNoBall);
                    responseWriter.writeString(Bowling.$responseFields[11], Bowling.this.playerOversBowled);
                    responseWriter.writeString(Bowling.$responseFields[12], Bowling.this.playerEconomyRate);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Bowling{__typename=" + this.__typename + ", matchID=" + this.matchID + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerTeam=" + this.playerTeam + ", playerDotBalls=" + this.playerDotBalls + ", playerWicketsTaken=" + this.playerWicketsTaken + ", playerMaidensBowled=" + this.playerMaidensBowled + ", playerRunsConceeded=" + this.playerRunsConceeded + ", playerWides=" + this.playerWides + ", playerNoBall=" + this.playerNoBall + ", playerOversBowled=" + this.playerOversBowled + ", playerEconomyRate=" + this.playerEconomyRate + "}";
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
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Bowling)) {
                return false;
            }
            Bowling bowling = (Bowling) obj;
            if (this.__typename.equals(bowling.__typename) && ((str = this.matchID) != null ? str.equals(bowling.matchID) : bowling.matchID == null) && ((str2 = this.playerID) != null ? str2.equals(bowling.playerID) : bowling.playerID == null) && ((str3 = this.playerName) != null ? str3.equals(bowling.playerName) : bowling.playerName == null) && ((str4 = this.playerTeam) != null ? str4.equals(bowling.playerTeam) : bowling.playerTeam == null) && ((str5 = this.playerDotBalls) != null ? str5.equals(bowling.playerDotBalls) : bowling.playerDotBalls == null) && ((str6 = this.playerWicketsTaken) != null ? str6.equals(bowling.playerWicketsTaken) : bowling.playerWicketsTaken == null) && ((str7 = this.playerMaidensBowled) != null ? str7.equals(bowling.playerMaidensBowled) : bowling.playerMaidensBowled == null) && ((str8 = this.playerRunsConceeded) != null ? str8.equals(bowling.playerRunsConceeded) : bowling.playerRunsConceeded == null) && ((str9 = this.playerWides) != null ? str9.equals(bowling.playerWides) : bowling.playerWides == null) && ((str10 = this.playerNoBall) != null ? str10.equals(bowling.playerNoBall) : bowling.playerNoBall == null) && ((str11 = this.playerOversBowled) != null ? str11.equals(bowling.playerOversBowled) : bowling.playerOversBowled == null)) {
                String str12 = this.playerEconomyRate;
                String str13 = bowling.playerEconomyRate;
                if (str12 == null) {
                    if (str13 == null) {
                        return true;
                    }
                } else if (str12.equals(str13)) {
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
                String str2 = this.playerID;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerName;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerTeam;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerDotBalls;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.playerWicketsTaken;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.playerMaidensBowled;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.playerRunsConceeded;
                int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.playerWides;
                int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.playerNoBall;
                int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.playerOversBowled;
                int hashCode12 = (hashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.playerEconomyRate;
                if (str12 != null) {
                    i = str12.hashCode();
                }
                this.$hashCode = hashCode12 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Bowling> {
            @Override 
            public Bowling map(ResponseReader responseReader) {
                return new Bowling(responseReader.readString(Bowling.$responseFields[0]), responseReader.readString(Bowling.$responseFields[1]), responseReader.readString(Bowling.$responseFields[2]), responseReader.readString(Bowling.$responseFields[3]), responseReader.readString(Bowling.$responseFields[4]), responseReader.readString(Bowling.$responseFields[5]), responseReader.readString(Bowling.$responseFields[6]), responseReader.readString(Bowling.$responseFields[7]), responseReader.readString(Bowling.$responseFields[8]), responseReader.readString(Bowling.$responseFields[9]), responseReader.readString(Bowling.$responseFields[10]), responseReader.readString(Bowling.$responseFields[11]), responseReader.readString(Bowling.$responseFields[12]));
            }
        }
    }

    public static class TeamProjection {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("inningNo", "inningNo", null, true, Collections.emptyList()), ResponseField.forString("overNo", "overNo", null, true, Collections.emptyList()), ResponseField.forString("currentScore", "currentScore", null, true, Collections.emptyList()), ResponseField.forString("predictedScore", "predictedScore", null, true, Collections.emptyList()), ResponseField.forString("predictedOver", "predictedOver", null, true, Collections.emptyList()), ResponseField.forObject("predictvizMarginView", "predictvizMarginView", null, true, Collections.emptyList()), ResponseField.forObject("winvizView", "winvizView", null, true, Collections.emptyList()), ResponseField.forString("secondPredictedScore", "secondPredictedScore", null, true, Collections.emptyList()), ResponseField.forString("secondPredictedOVer", "secondPredictedOVer", null, true, Collections.emptyList()), ResponseField.forString("thirdPredictedScore", "thirdPredictedScore", null, true, Collections.emptyList()), ResponseField.forString("thirdPredictedOver", "thirdPredictedOver", null, true, Collections.emptyList()), ResponseField.forString("fourthPredictedScore", "fourthPredictedScore", null, true, Collections.emptyList()), ResponseField.forString("fourthPredictedOver", "fourthPredictedOver", null, true, Collections.emptyList()), ResponseField.forString("predictedWicket", "predictedWicket", null, true, Collections.emptyList()), ResponseField.forString("secondPredictedWicket", "secondPredictedWicket", null, true, Collections.emptyList()), ResponseField.forString("thirdPredictedWicket", "thirdPredictedWicket", null, true, Collections.emptyList()), ResponseField.forString("fourthPredictedWicket", "fourthPredictedWicket", null, true, Collections.emptyList()), ResponseField.forString("team2Id", "team2Id", null, true, Collections.emptyList()), ResponseField.forString("team1Id", "team1Id", null, true, Collections.emptyList()), ResponseField.forList("inningIds", "inningIds", null, true, Collections.emptyList()), ResponseField.forString("team1Name", "team1Name", null, true, Collections.emptyList()), ResponseField.forString("team2Name", "team2Name", null, true, Collections.emptyList()), ResponseField.forString("team1ShortName", "team1ShortName", null, true, Collections.emptyList()), ResponseField.forString("team2ShortName", "team2ShortName", null, true, Collections.emptyList()), ResponseField.forString("currentWickets", "currentWickets", null, true, Collections.emptyList()), ResponseField.forString("homeTeamShortName", "homeTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("homeTeamPercentage", "homeTeamPercentage", null, true, Collections.emptyList()), ResponseField.forString("awayTeamShortName", "awayTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("awayTeamPercentage", "awayTeamPercentage", null, true, Collections.emptyList()), ResponseField.forString("tiePercentage", "tiePercentage", null, true, Collections.emptyList()), ResponseField.forString("currentOvers", "currentOvers", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String awayTeamPercentage;
        final String awayTeamShortName;
        final String currentOvers;
        final String currentScore;
        final String currentWickets;
        final String fourthPredictedOver;
        final String fourthPredictedScore;
        final String fourthPredictedWicket;
        final String homeTeamPercentage;
        final String homeTeamShortName;
        final List<String> inningIds;
        final String inningNo;
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

        public TeamProjection(String str, String str2, String str3, String str4, String str5, String str6, PredictvizMarginView predictvizMarginView2, WinvizView winvizView2, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, List<String> list, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.inningNo = str2;
            this.overNo = str3;
            this.currentScore = str4;
            this.predictedScore = str5;
            this.predictedOver = str6;
            this.predictvizMarginView = predictvizMarginView2;
            this.winvizView = winvizView2;
            this.secondPredictedScore = str7;
            this.secondPredictedOVer = str8;
            this.thirdPredictedScore = str9;
            this.thirdPredictedOver = str10;
            this.fourthPredictedScore = str11;
            this.fourthPredictedOver = str12;
            this.predictedWicket = str13;
            this.secondPredictedWicket = str14;
            this.thirdPredictedWicket = str15;
            this.fourthPredictedWicket = str16;
            this.team2Id = str17;
            this.team1Id = str18;
            this.inningIds = list;
            this.team1Name = str19;
            this.team2Name = str20;
            this.team1ShortName = str21;
            this.team2ShortName = str22;
            this.currentWickets = str23;
            this.homeTeamShortName = str24;
            this.homeTeamPercentage = str25;
            this.awayTeamShortName = str26;
            this.awayTeamPercentage = str27;
            this.tiePercentage = str28;
            this.currentOvers = str29;
        }

        public String __typename() {
            return this.__typename;
        }

        public String inningNo() {
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
                    responseWriter.writeString(TeamProjection.$responseFields[0], TeamProjection.this.__typename);
                    responseWriter.writeString(TeamProjection.$responseFields[1], TeamProjection.this.inningNo);
                    responseWriter.writeString(TeamProjection.$responseFields[2], TeamProjection.this.overNo);
                    responseWriter.writeString(TeamProjection.$responseFields[3], TeamProjection.this.currentScore);
                    responseWriter.writeString(TeamProjection.$responseFields[4], TeamProjection.this.predictedScore);
                    responseWriter.writeString(TeamProjection.$responseFields[5], TeamProjection.this.predictedOver);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(TeamProjection.$responseFields[6], TeamProjection.this.predictvizMarginView != null ? TeamProjection.this.predictvizMarginView.marshaller() : null);
                    ResponseField responseField = TeamProjection.$responseFields[7];
                    if (TeamProjection.this.winvizView != null) {
                        responseFieldMarshaller = TeamProjection.this.winvizView.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                    responseWriter.writeString(TeamProjection.$responseFields[8], TeamProjection.this.secondPredictedScore);
                    responseWriter.writeString(TeamProjection.$responseFields[9], TeamProjection.this.secondPredictedOVer);
                    responseWriter.writeString(TeamProjection.$responseFields[10], TeamProjection.this.thirdPredictedScore);
                    responseWriter.writeString(TeamProjection.$responseFields[11], TeamProjection.this.thirdPredictedOver);
                    responseWriter.writeString(TeamProjection.$responseFields[12], TeamProjection.this.fourthPredictedScore);
                    responseWriter.writeString(TeamProjection.$responseFields[13], TeamProjection.this.fourthPredictedOver);
                    responseWriter.writeString(TeamProjection.$responseFields[14], TeamProjection.this.predictedWicket);
                    responseWriter.writeString(TeamProjection.$responseFields[15], TeamProjection.this.secondPredictedWicket);
                    responseWriter.writeString(TeamProjection.$responseFields[16], TeamProjection.this.thirdPredictedWicket);
                    responseWriter.writeString(TeamProjection.$responseFields[17], TeamProjection.this.fourthPredictedWicket);
                    responseWriter.writeString(TeamProjection.$responseFields[18], TeamProjection.this.team2Id);
                    responseWriter.writeString(TeamProjection.$responseFields[19], TeamProjection.this.team1Id);
                    responseWriter.writeList(TeamProjection.$responseFields[20], TeamProjection.this.inningIds, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    });
                    responseWriter.writeString(TeamProjection.$responseFields[21], TeamProjection.this.team1Name);
                    responseWriter.writeString(TeamProjection.$responseFields[22], TeamProjection.this.team2Name);
                    responseWriter.writeString(TeamProjection.$responseFields[23], TeamProjection.this.team1ShortName);
                    responseWriter.writeString(TeamProjection.$responseFields[24], TeamProjection.this.team2ShortName);
                    responseWriter.writeString(TeamProjection.$responseFields[25], TeamProjection.this.currentWickets);
                    responseWriter.writeString(TeamProjection.$responseFields[26], TeamProjection.this.homeTeamShortName);
                    responseWriter.writeString(TeamProjection.$responseFields[27], TeamProjection.this.homeTeamPercentage);
                    responseWriter.writeString(TeamProjection.$responseFields[28], TeamProjection.this.awayTeamShortName);
                    responseWriter.writeString(TeamProjection.$responseFields[29], TeamProjection.this.awayTeamPercentage);
                    responseWriter.writeString(TeamProjection.$responseFields[30], TeamProjection.this.tiePercentage);
                    responseWriter.writeString(TeamProjection.$responseFields[31], TeamProjection.this.currentOvers);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TeamProjection{__typename=" + this.__typename + ", inningNo=" + this.inningNo + ", overNo=" + this.overNo + ", currentScore=" + this.currentScore + ", predictedScore=" + this.predictedScore + ", predictedOver=" + this.predictedOver + ", predictvizMarginView=" + this.predictvizMarginView + ", winvizView=" + this.winvizView + ", secondPredictedScore=" + this.secondPredictedScore + ", secondPredictedOVer=" + this.secondPredictedOVer + ", thirdPredictedScore=" + this.thirdPredictedScore + ", thirdPredictedOver=" + this.thirdPredictedOver + ", fourthPredictedScore=" + this.fourthPredictedScore + ", fourthPredictedOver=" + this.fourthPredictedOver + ", predictedWicket=" + this.predictedWicket + ", secondPredictedWicket=" + this.secondPredictedWicket + ", thirdPredictedWicket=" + this.thirdPredictedWicket + ", fourthPredictedWicket=" + this.fourthPredictedWicket + ", team2Id=" + this.team2Id + ", team1Id=" + this.team1Id + ", inningIds=" + this.inningIds + ", team1Name=" + this.team1Name + ", team2Name=" + this.team2Name + ", team1ShortName=" + this.team1ShortName + ", team2ShortName=" + this.team2ShortName + ", currentWickets=" + this.currentWickets + ", homeTeamShortName=" + this.homeTeamShortName + ", homeTeamPercentage=" + this.homeTeamPercentage + ", awayTeamShortName=" + this.awayTeamShortName + ", awayTeamPercentage=" + this.awayTeamPercentage + ", tiePercentage=" + this.tiePercentage + ", currentOvers=" + this.currentOvers + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            PredictvizMarginView predictvizMarginView2;
            WinvizView winvizView2;
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
            List<String> list;
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
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TeamProjection)) {
                return false;
            }
            TeamProjection teamProjection = (TeamProjection) obj;
            if (this.__typename.equals(teamProjection.__typename) && ((str = this.inningNo) != null ? str.equals(teamProjection.inningNo) : teamProjection.inningNo == null) && ((str2 = this.overNo) != null ? str2.equals(teamProjection.overNo) : teamProjection.overNo == null) && ((str3 = this.currentScore) != null ? str3.equals(teamProjection.currentScore) : teamProjection.currentScore == null) && ((str4 = this.predictedScore) != null ? str4.equals(teamProjection.predictedScore) : teamProjection.predictedScore == null) && ((str5 = this.predictedOver) != null ? str5.equals(teamProjection.predictedOver) : teamProjection.predictedOver == null) && ((predictvizMarginView2 = this.predictvizMarginView) != null ? predictvizMarginView2.equals(teamProjection.predictvizMarginView) : teamProjection.predictvizMarginView == null) && ((winvizView2 = this.winvizView) != null ? winvizView2.equals(teamProjection.winvizView) : teamProjection.winvizView == null) && ((str6 = this.secondPredictedScore) != null ? str6.equals(teamProjection.secondPredictedScore) : teamProjection.secondPredictedScore == null) && ((str7 = this.secondPredictedOVer) != null ? str7.equals(teamProjection.secondPredictedOVer) : teamProjection.secondPredictedOVer == null) && ((str8 = this.thirdPredictedScore) != null ? str8.equals(teamProjection.thirdPredictedScore) : teamProjection.thirdPredictedScore == null) && ((str9 = this.thirdPredictedOver) != null ? str9.equals(teamProjection.thirdPredictedOver) : teamProjection.thirdPredictedOver == null) && ((str10 = this.fourthPredictedScore) != null ? str10.equals(teamProjection.fourthPredictedScore) : teamProjection.fourthPredictedScore == null) && ((str11 = this.fourthPredictedOver) != null ? str11.equals(teamProjection.fourthPredictedOver) : teamProjection.fourthPredictedOver == null) && ((str12 = this.predictedWicket) != null ? str12.equals(teamProjection.predictedWicket) : teamProjection.predictedWicket == null) && ((str13 = this.secondPredictedWicket) != null ? str13.equals(teamProjection.secondPredictedWicket) : teamProjection.secondPredictedWicket == null) && ((str14 = this.thirdPredictedWicket) != null ? str14.equals(teamProjection.thirdPredictedWicket) : teamProjection.thirdPredictedWicket == null) && ((str15 = this.fourthPredictedWicket) != null ? str15.equals(teamProjection.fourthPredictedWicket) : teamProjection.fourthPredictedWicket == null) && ((str16 = this.team2Id) != null ? str16.equals(teamProjection.team2Id) : teamProjection.team2Id == null) && ((str17 = this.team1Id) != null ? str17.equals(teamProjection.team1Id) : teamProjection.team1Id == null) && ((list = this.inningIds) != null ? list.equals(teamProjection.inningIds) : teamProjection.inningIds == null) && ((str18 = this.team1Name) != null ? str18.equals(teamProjection.team1Name) : teamProjection.team1Name == null) && ((str19 = this.team2Name) != null ? str19.equals(teamProjection.team2Name) : teamProjection.team2Name == null) && ((str20 = this.team1ShortName) != null ? str20.equals(teamProjection.team1ShortName) : teamProjection.team1ShortName == null) && ((str21 = this.team2ShortName) != null ? str21.equals(teamProjection.team2ShortName) : teamProjection.team2ShortName == null) && ((str22 = this.currentWickets) != null ? str22.equals(teamProjection.currentWickets) : teamProjection.currentWickets == null) && ((str23 = this.homeTeamShortName) != null ? str23.equals(teamProjection.homeTeamShortName) : teamProjection.homeTeamShortName == null) && ((str24 = this.homeTeamPercentage) != null ? str24.equals(teamProjection.homeTeamPercentage) : teamProjection.homeTeamPercentage == null) && ((str25 = this.awayTeamShortName) != null ? str25.equals(teamProjection.awayTeamShortName) : teamProjection.awayTeamShortName == null) && ((str26 = this.awayTeamPercentage) != null ? str26.equals(teamProjection.awayTeamPercentage) : teamProjection.awayTeamPercentage == null) && ((str27 = this.tiePercentage) != null ? str27.equals(teamProjection.tiePercentage) : teamProjection.tiePercentage == null)) {
                String str28 = this.currentOvers;
                String str29 = teamProjection.currentOvers;
                if (str28 == null) {
                    if (str29 == null) {
                        return true;
                    }
                } else if (str28.equals(str29)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.inningNo;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.overNo;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.currentScore;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.predictedScore;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.predictedOver;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                PredictvizMarginView predictvizMarginView2 = this.predictvizMarginView;
                int hashCode7 = (hashCode6 ^ (predictvizMarginView2 == null ? 0 : predictvizMarginView2.hashCode())) * 1000003;
                WinvizView winvizView2 = this.winvizView;
                int hashCode8 = (hashCode7 ^ (winvizView2 == null ? 0 : winvizView2.hashCode())) * 1000003;
                String str6 = this.secondPredictedScore;
                int hashCode9 = (hashCode8 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.secondPredictedOVer;
                int hashCode10 = (hashCode9 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.thirdPredictedScore;
                int hashCode11 = (hashCode10 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.thirdPredictedOver;
                int hashCode12 = (hashCode11 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.fourthPredictedScore;
                int hashCode13 = (hashCode12 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.fourthPredictedOver;
                int hashCode14 = (hashCode13 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.predictedWicket;
                int hashCode15 = (hashCode14 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.secondPredictedWicket;
                int hashCode16 = (hashCode15 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.thirdPredictedWicket;
                int hashCode17 = (hashCode16 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.fourthPredictedWicket;
                int hashCode18 = (hashCode17 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.team2Id;
                int hashCode19 = (hashCode18 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.team1Id;
                int hashCode20 = (hashCode19 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                List<String> list = this.inningIds;
                int hashCode21 = (hashCode20 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str18 = this.team1Name;
                int hashCode22 = (hashCode21 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.team2Name;
                int hashCode23 = (hashCode22 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.team1ShortName;
                int hashCode24 = (hashCode23 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                String str21 = this.team2ShortName;
                int hashCode25 = (hashCode24 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
                String str22 = this.currentWickets;
                int hashCode26 = (hashCode25 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
                String str23 = this.homeTeamShortName;
                int hashCode27 = (hashCode26 ^ (str23 == null ? 0 : str23.hashCode())) * 1000003;
                String str24 = this.homeTeamPercentage;
                int hashCode28 = (hashCode27 ^ (str24 == null ? 0 : str24.hashCode())) * 1000003;
                String str25 = this.awayTeamShortName;
                int hashCode29 = (hashCode28 ^ (str25 == null ? 0 : str25.hashCode())) * 1000003;
                String str26 = this.awayTeamPercentage;
                int hashCode30 = (hashCode29 ^ (str26 == null ? 0 : str26.hashCode())) * 1000003;
                String str27 = this.tiePercentage;
                int hashCode31 = (hashCode30 ^ (str27 == null ? 0 : str27.hashCode())) * 1000003;
                String str28 = this.currentOvers;
                if (str28 != null) {
                    i = str28.hashCode();
                }
                this.$hashCode = hashCode31 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TeamProjection> {
            final PredictvizMarginView.Mapper predictvizMarginViewFieldMapper = new PredictvizMarginView.Mapper();
            final WinvizView.Mapper winvizViewFieldMapper = new WinvizView.Mapper();

            @Override 
            public TeamProjection map(ResponseReader responseReader) {
                return new TeamProjection(responseReader.readString(TeamProjection.$responseFields[0]), responseReader.readString(TeamProjection.$responseFields[1]), responseReader.readString(TeamProjection.$responseFields[2]), responseReader.readString(TeamProjection.$responseFields[3]), responseReader.readString(TeamProjection.$responseFields[4]), responseReader.readString(TeamProjection.$responseFields[5]), (PredictvizMarginView) responseReader.readObject(TeamProjection.$responseFields[6], new ResponseReader.ObjectReader<PredictvizMarginView>() {


                    @Override 
                    public PredictvizMarginView read(ResponseReader responseReader) {
                        return Mapper.this.predictvizMarginViewFieldMapper.map(responseReader);
                    }
                }), (WinvizView) responseReader.readObject(TeamProjection.$responseFields[7], new ResponseReader.ObjectReader<WinvizView>() {


                    @Override 
                    public WinvizView read(ResponseReader responseReader) {
                        return Mapper.this.winvizViewFieldMapper.map(responseReader);
                    }
                }), responseReader.readString(TeamProjection.$responseFields[8]), responseReader.readString(TeamProjection.$responseFields[9]), responseReader.readString(TeamProjection.$responseFields[10]), responseReader.readString(TeamProjection.$responseFields[11]), responseReader.readString(TeamProjection.$responseFields[12]), responseReader.readString(TeamProjection.$responseFields[13]), responseReader.readString(TeamProjection.$responseFields[14]), responseReader.readString(TeamProjection.$responseFields[15]), responseReader.readString(TeamProjection.$responseFields[16]), responseReader.readString(TeamProjection.$responseFields[17]), responseReader.readString(TeamProjection.$responseFields[18]), responseReader.readString(TeamProjection.$responseFields[19]), responseReader.readList(TeamProjection.$responseFields[20], new ResponseReader.ListReader<String>() {


                    @Override 
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(TeamProjection.$responseFields[21]), responseReader.readString(TeamProjection.$responseFields[22]), responseReader.readString(TeamProjection.$responseFields[23]), responseReader.readString(TeamProjection.$responseFields[24]), responseReader.readString(TeamProjection.$responseFields[25]), responseReader.readString(TeamProjection.$responseFields[26]), responseReader.readString(TeamProjection.$responseFields[27]), responseReader.readString(TeamProjection.$responseFields[28]), responseReader.readString(TeamProjection.$responseFields[29]), responseReader.readString(TeamProjection.$responseFields[30]), responseReader.readString(TeamProjection.$responseFields[31]));
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

    public static class Bowler {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchID", "matchID", null, true, Collections.emptyList()), ResponseField.forString("strikerId", "strikerId", null, true, Collections.emptyList()), ResponseField.forString("nonStrikerId", "nonStrikerId", null, true, Collections.emptyList()), ResponseField.forString("strikerName", "strikerName", null, true, Collections.emptyList()), ResponseField.forString("nonStrikerName", "nonStrikerName", null, true, Collections.emptyList()), ResponseField.forString("bowlerId", "bowlerId", null, true, Collections.emptyList()), ResponseField.forInt("bowlerRuns", "bowlerRuns", null, true, Collections.emptyList()), ResponseField.forInt("wicketsTakenTillNow", "wicketsTakenTillNow", null, true, Collections.emptyList()), ResponseField.forInt("maxOvers", "maxOvers", null, true, Collections.emptyList()), ResponseField.forDouble("oversBowledSoFar", "oversBowledSoFar", null, true, Collections.emptyList()), ResponseField.forInt("strikerPosition", "strikerPosition", null, true, Collections.emptyList()), ResponseField.forInt("nonStrikerPosition", "nonStrikerPosition", null, true, Collections.emptyList()), ResponseField.forInt("inningNo", "inningNo", null, true, Collections.emptyList()), ResponseField.forString("format", "format", null, true, Collections.emptyList()), ResponseField.forString("bowlerName", "bowlerName", null, true, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, true, Collections.emptyList()), ResponseField.forList("projected", "projected", null, true, Collections.emptyList()), ResponseField.forList("bounds", "bounds", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<String> bounds;
        final String bowlerId;
        final String bowlerName;
        final Integer bowlerRuns;
        final String format;
        final Integer inningNo;
        final String matchID;
        final Integer maxOvers;
        final String nonStrikerId;
        final String nonStrikerName;
        final Integer nonStrikerPosition;
        final Double oversBowledSoFar;
        final List<String> projected;
        final String strikerId;
        final String strikerName;
        final Integer strikerPosition;
        final String teamName;
        final Integer wicketsTakenTillNow;

        public Bowler(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, Integer num3, Double d, Integer num4, Integer num5, Integer num6, String str8, String str9, String str10, List<String> list, List<String> list2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchID = str2;
            this.strikerId = str3;
            this.nonStrikerId = str4;
            this.strikerName = str5;
            this.nonStrikerName = str6;
            this.bowlerId = str7;
            this.bowlerRuns = num;
            this.wicketsTakenTillNow = num2;
            this.maxOvers = num3;
            this.oversBowledSoFar = d;
            this.strikerPosition = num4;
            this.nonStrikerPosition = num5;
            this.inningNo = num6;
            this.format = str8;
            this.bowlerName = str9;
            this.teamName = str10;
            this.projected = list;
            this.bounds = list2;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchID() {
            return this.matchID;
        }

        public String strikerId() {
            return this.strikerId;
        }

        public String nonStrikerId() {
            return this.nonStrikerId;
        }

        public String strikerName() {
            return this.strikerName;
        }

        public String nonStrikerName() {
            return this.nonStrikerName;
        }

        public String bowlerId() {
            return this.bowlerId;
        }

        public Integer bowlerRuns() {
            return this.bowlerRuns;
        }

        public Integer wicketsTakenTillNow() {
            return this.wicketsTakenTillNow;
        }

        public Integer maxOvers() {
            return this.maxOvers;
        }

        public Double oversBowledSoFar() {
            return this.oversBowledSoFar;
        }

        public Integer strikerPosition() {
            return this.strikerPosition;
        }

        public Integer nonStrikerPosition() {
            return this.nonStrikerPosition;
        }

        public Integer inningNo() {
            return this.inningNo;
        }

        public String format() {
            return this.format;
        }

        public String bowlerName() {
            return this.bowlerName;
        }

        public String teamName() {
            return this.teamName;
        }

        public List<String> projected() {
            return this.projected;
        }

        public List<String> bounds() {
            return this.bounds;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Bowler.$responseFields[0], Bowler.this.__typename);
                    responseWriter.writeString(Bowler.$responseFields[1], Bowler.this.matchID);
                    responseWriter.writeString(Bowler.$responseFields[2], Bowler.this.strikerId);
                    responseWriter.writeString(Bowler.$responseFields[3], Bowler.this.nonStrikerId);
                    responseWriter.writeString(Bowler.$responseFields[4], Bowler.this.strikerName);
                    responseWriter.writeString(Bowler.$responseFields[5], Bowler.this.nonStrikerName);
                    responseWriter.writeString(Bowler.$responseFields[6], Bowler.this.bowlerId);
                    responseWriter.writeInt(Bowler.$responseFields[7], Bowler.this.bowlerRuns);
                    responseWriter.writeInt(Bowler.$responseFields[8], Bowler.this.wicketsTakenTillNow);
                    responseWriter.writeInt(Bowler.$responseFields[9], Bowler.this.maxOvers);
                    responseWriter.writeDouble(Bowler.$responseFields[10], Bowler.this.oversBowledSoFar);
                    responseWriter.writeInt(Bowler.$responseFields[11], Bowler.this.strikerPosition);
                    responseWriter.writeInt(Bowler.$responseFields[12], Bowler.this.nonStrikerPosition);
                    responseWriter.writeInt(Bowler.$responseFields[13], Bowler.this.inningNo);
                    responseWriter.writeString(Bowler.$responseFields[14], Bowler.this.format);
                    responseWriter.writeString(Bowler.$responseFields[15], Bowler.this.bowlerName);
                    responseWriter.writeString(Bowler.$responseFields[16], Bowler.this.teamName);
                    responseWriter.writeList(Bowler.$responseFields[17], Bowler.this.projected, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    });
                    responseWriter.writeList(Bowler.$responseFields[18], Bowler.this.bounds, new ResponseWriter.ListWriter() {


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
                this.$toString = "Bowler{__typename=" + this.__typename + ", matchID=" + this.matchID + ", strikerId=" + this.strikerId + ", nonStrikerId=" + this.nonStrikerId + ", strikerName=" + this.strikerName + ", nonStrikerName=" + this.nonStrikerName + ", bowlerId=" + this.bowlerId + ", bowlerRuns=" + this.bowlerRuns + ", wicketsTakenTillNow=" + this.wicketsTakenTillNow + ", maxOvers=" + this.maxOvers + ", oversBowledSoFar=" + this.oversBowledSoFar + ", strikerPosition=" + this.strikerPosition + ", nonStrikerPosition=" + this.nonStrikerPosition + ", inningNo=" + this.inningNo + ", format=" + this.format + ", bowlerName=" + this.bowlerName + ", teamName=" + this.teamName + ", projected=" + this.projected + ", bounds=" + this.bounds + "}";
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
            Integer num;
            Integer num2;
            Integer num3;
            Double d;
            Integer num4;
            Integer num5;
            Integer num6;
            String str7;
            String str8;
            String str9;
            List<String> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Bowler)) {
                return false;
            }
            Bowler bowler = (Bowler) obj;
            if (this.__typename.equals(bowler.__typename) && ((str = this.matchID) != null ? str.equals(bowler.matchID) : bowler.matchID == null) && ((str2 = this.strikerId) != null ? str2.equals(bowler.strikerId) : bowler.strikerId == null) && ((str3 = this.nonStrikerId) != null ? str3.equals(bowler.nonStrikerId) : bowler.nonStrikerId == null) && ((str4 = this.strikerName) != null ? str4.equals(bowler.strikerName) : bowler.strikerName == null) && ((str5 = this.nonStrikerName) != null ? str5.equals(bowler.nonStrikerName) : bowler.nonStrikerName == null) && ((str6 = this.bowlerId) != null ? str6.equals(bowler.bowlerId) : bowler.bowlerId == null) && ((num = this.bowlerRuns) != null ? num.equals(bowler.bowlerRuns) : bowler.bowlerRuns == null) && ((num2 = this.wicketsTakenTillNow) != null ? num2.equals(bowler.wicketsTakenTillNow) : bowler.wicketsTakenTillNow == null) && ((num3 = this.maxOvers) != null ? num3.equals(bowler.maxOvers) : bowler.maxOvers == null) && ((d = this.oversBowledSoFar) != null ? d.equals(bowler.oversBowledSoFar) : bowler.oversBowledSoFar == null) && ((num4 = this.strikerPosition) != null ? num4.equals(bowler.strikerPosition) : bowler.strikerPosition == null) && ((num5 = this.nonStrikerPosition) != null ? num5.equals(bowler.nonStrikerPosition) : bowler.nonStrikerPosition == null) && ((num6 = this.inningNo) != null ? num6.equals(bowler.inningNo) : bowler.inningNo == null) && ((str7 = this.format) != null ? str7.equals(bowler.format) : bowler.format == null) && ((str8 = this.bowlerName) != null ? str8.equals(bowler.bowlerName) : bowler.bowlerName == null) && ((str9 = this.teamName) != null ? str9.equals(bowler.teamName) : bowler.teamName == null) && ((list = this.projected) != null ? list.equals(bowler.projected) : bowler.projected == null)) {
                List<String> list2 = this.bounds;
                List<String> list3 = bowler.bounds;
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
                String str = this.matchID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.strikerId;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.nonStrikerId;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.strikerName;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.nonStrikerName;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.bowlerId;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                Integer num = this.bowlerRuns;
                int hashCode8 = (hashCode7 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.wicketsTakenTillNow;
                int hashCode9 = (hashCode8 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.maxOvers;
                int hashCode10 = (hashCode9 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Double d = this.oversBowledSoFar;
                int hashCode11 = (hashCode10 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Integer num4 = this.strikerPosition;
                int hashCode12 = (hashCode11 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                Integer num5 = this.nonStrikerPosition;
                int hashCode13 = (hashCode12 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
                Integer num6 = this.inningNo;
                int hashCode14 = (hashCode13 ^ (num6 == null ? 0 : num6.hashCode())) * 1000003;
                String str7 = this.format;
                int hashCode15 = (hashCode14 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.bowlerName;
                int hashCode16 = (hashCode15 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.teamName;
                int hashCode17 = (hashCode16 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                List<String> list = this.projected;
                int hashCode18 = (hashCode17 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<String> list2 = this.bounds;
                if (list2 != null) {
                    i = list2.hashCode();
                }
                this.$hashCode = hashCode18 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Bowler> {
            @Override 
            public Bowler map(ResponseReader responseReader) {
                return new Bowler(responseReader.readString(Bowler.$responseFields[0]), responseReader.readString(Bowler.$responseFields[1]), responseReader.readString(Bowler.$responseFields[2]), responseReader.readString(Bowler.$responseFields[3]), responseReader.readString(Bowler.$responseFields[4]), responseReader.readString(Bowler.$responseFields[5]), responseReader.readString(Bowler.$responseFields[6]), responseReader.readInt(Bowler.$responseFields[7]), responseReader.readInt(Bowler.$responseFields[8]), responseReader.readInt(Bowler.$responseFields[9]), responseReader.readDouble(Bowler.$responseFields[10]), responseReader.readInt(Bowler.$responseFields[11]), responseReader.readInt(Bowler.$responseFields[12]), responseReader.readInt(Bowler.$responseFields[13]), responseReader.readString(Bowler.$responseFields[14]), responseReader.readString(Bowler.$responseFields[15]), responseReader.readString(Bowler.$responseFields[16]), responseReader.readList(Bowler.$responseFields[17], new ResponseReader.ListReader<String>() {


                    @Override 
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readList(Bowler.$responseFields[18], new ResponseReader.ListReader<String>() {


                    @Override 
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }));
            }
        }
    }

    public static class Batsman {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerId", "playerId", null, true, Collections.emptyList()), ResponseField.forInt("playerRuns", "playerRuns", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forInt("playerBalls", "playerBalls", null, true, Collections.emptyList()), ResponseField.forString("playerTeamName", "playerTeamName", null, true, Collections.emptyList()), ResponseField.forInt("inningNo", "inningNo", null, true, Collections.emptyList()), ResponseField.forInt("overNo", "overNo", null, true, Collections.emptyList()), ResponseField.forString("format", "format", null, true, Collections.emptyList()), ResponseField.forObject("playerBattingProbabilities", "playerBattingProbabilities", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String format;
        final Integer inningNo;
        final Integer overNo;
        final Integer playerBalls;
        final PlayerBattingProbabilities playerBattingProbabilities;
        final String playerId;
        final String playerName;
        final Integer playerRuns;
        final String playerTeamName;

        public Batsman(String str, String str2, Integer num, String str3, Integer num2, String str4, Integer num3, Integer num4, String str5, PlayerBattingProbabilities playerBattingProbabilities2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerId = str2;
            this.playerRuns = num;
            this.playerName = str3;
            this.playerBalls = num2;
            this.playerTeamName = str4;
            this.inningNo = num3;
            this.overNo = num4;
            this.format = str5;
            this.playerBattingProbabilities = playerBattingProbabilities2;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerId() {
            return this.playerId;
        }

        public Integer playerRuns() {
            return this.playerRuns;
        }

        public String playerName() {
            return this.playerName;
        }

        public Integer playerBalls() {
            return this.playerBalls;
        }

        public String playerTeamName() {
            return this.playerTeamName;
        }

        public Integer inningNo() {
            return this.inningNo;
        }

        public Integer overNo() {
            return this.overNo;
        }

        public String format() {
            return this.format;
        }

        public PlayerBattingProbabilities playerBattingProbabilities() {
            return this.playerBattingProbabilities;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Batsman.$responseFields[0], Batsman.this.__typename);
                    responseWriter.writeString(Batsman.$responseFields[1], Batsman.this.playerId);
                    responseWriter.writeInt(Batsman.$responseFields[2], Batsman.this.playerRuns);
                    responseWriter.writeString(Batsman.$responseFields[3], Batsman.this.playerName);
                    responseWriter.writeInt(Batsman.$responseFields[4], Batsman.this.playerBalls);
                    responseWriter.writeString(Batsman.$responseFields[5], Batsman.this.playerTeamName);
                    responseWriter.writeInt(Batsman.$responseFields[6], Batsman.this.inningNo);
                    responseWriter.writeInt(Batsman.$responseFields[7], Batsman.this.overNo);
                    responseWriter.writeString(Batsman.$responseFields[8], Batsman.this.format);
                    responseWriter.writeObject(Batsman.$responseFields[9], Batsman.this.playerBattingProbabilities != null ? Batsman.this.playerBattingProbabilities.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Batsman{__typename=" + this.__typename + ", playerId=" + this.playerId + ", playerRuns=" + this.playerRuns + ", playerName=" + this.playerName + ", playerBalls=" + this.playerBalls + ", playerTeamName=" + this.playerTeamName + ", inningNo=" + this.inningNo + ", overNo=" + this.overNo + ", format=" + this.format + ", playerBattingProbabilities=" + this.playerBattingProbabilities + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            Integer num;
            String str2;
            Integer num2;
            String str3;
            Integer num3;
            Integer num4;
            String str4;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Batsman)) {
                return false;
            }
            Batsman batsman = (Batsman) obj;
            if (this.__typename.equals(batsman.__typename) && ((str = this.playerId) != null ? str.equals(batsman.playerId) : batsman.playerId == null) && ((num = this.playerRuns) != null ? num.equals(batsman.playerRuns) : batsman.playerRuns == null) && ((str2 = this.playerName) != null ? str2.equals(batsman.playerName) : batsman.playerName == null) && ((num2 = this.playerBalls) != null ? num2.equals(batsman.playerBalls) : batsman.playerBalls == null) && ((str3 = this.playerTeamName) != null ? str3.equals(batsman.playerTeamName) : batsman.playerTeamName == null) && ((num3 = this.inningNo) != null ? num3.equals(batsman.inningNo) : batsman.inningNo == null) && ((num4 = this.overNo) != null ? num4.equals(batsman.overNo) : batsman.overNo == null) && ((str4 = this.format) != null ? str4.equals(batsman.format) : batsman.format == null)) {
                PlayerBattingProbabilities playerBattingProbabilities2 = this.playerBattingProbabilities;
                PlayerBattingProbabilities playerBattingProbabilities3 = batsman.playerBattingProbabilities;
                if (playerBattingProbabilities2 == null) {
                    if (playerBattingProbabilities3 == null) {
                        return true;
                    }
                } else if (playerBattingProbabilities2.equals(playerBattingProbabilities3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.playerId;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Integer num = this.playerRuns;
                int hashCode3 = (hashCode2 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str2 = this.playerName;
                int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Integer num2 = this.playerBalls;
                int hashCode5 = (hashCode4 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                String str3 = this.playerTeamName;
                int hashCode6 = (hashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Integer num3 = this.inningNo;
                int hashCode7 = (hashCode6 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.overNo;
                int hashCode8 = (hashCode7 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                String str4 = this.format;
                int hashCode9 = (hashCode8 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                PlayerBattingProbabilities playerBattingProbabilities2 = this.playerBattingProbabilities;
                if (playerBattingProbabilities2 != null) {
                    i = playerBattingProbabilities2.hashCode();
                }
                this.$hashCode = hashCode9 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Batsman> {
            final PlayerBattingProbabilities.Mapper playerBattingProbabilitiesFieldMapper = new PlayerBattingProbabilities.Mapper();

            @Override 
            public Batsman map(ResponseReader responseReader) {
                return new Batsman(responseReader.readString(Batsman.$responseFields[0]), responseReader.readString(Batsman.$responseFields[1]), responseReader.readInt(Batsman.$responseFields[2]), responseReader.readString(Batsman.$responseFields[3]), responseReader.readInt(Batsman.$responseFields[4]), responseReader.readString(Batsman.$responseFields[5]), responseReader.readInt(Batsman.$responseFields[6]), responseReader.readInt(Batsman.$responseFields[7]), responseReader.readString(Batsman.$responseFields[8]), (PlayerBattingProbabilities) responseReader.readObject(Batsman.$responseFields[9], new ResponseReader.ObjectReader<PlayerBattingProbabilities>() {


                    @Override 
                    public PlayerBattingProbabilities read(ResponseReader responseReader) {
                        return Mapper.this.playerBattingProbabilitiesFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class PlayerBattingProbabilities {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerId", "playerId", null, true, Collections.emptyList()), ResponseField.forList("playerData", "playerData", null, true, Collections.emptyList()), ResponseField.forString("playerBound", "playerBound", null, true, Collections.emptyList()), ResponseField.forString("teamId", "teamId", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String playerBound;
        final List<PlayerDatum> playerData;
        final String playerId;
        final String teamId;

        public PlayerBattingProbabilities(String str, String str2, List<PlayerDatum> list, String str3, String str4) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerId = str2;
            this.playerData = list;
            this.playerBound = str3;
            this.teamId = str4;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerId() {
            return this.playerId;
        }

        public List<PlayerDatum> playerData() {
            return this.playerData;
        }

        public String playerBound() {
            return this.playerBound;
        }

        public String teamId() {
            return this.teamId;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(PlayerBattingProbabilities.$responseFields[0], PlayerBattingProbabilities.this.__typename);
                    responseWriter.writeString(PlayerBattingProbabilities.$responseFields[1], PlayerBattingProbabilities.this.playerId);
                    responseWriter.writeList(PlayerBattingProbabilities.$responseFields[2], PlayerBattingProbabilities.this.playerData, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((PlayerDatum) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeString(PlayerBattingProbabilities.$responseFields[3], PlayerBattingProbabilities.this.playerBound);
                    responseWriter.writeString(PlayerBattingProbabilities.$responseFields[4], PlayerBattingProbabilities.this.teamId);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "PlayerBattingProbabilities{__typename=" + this.__typename + ", playerId=" + this.playerId + ", playerData=" + this.playerData + ", playerBound=" + this.playerBound + ", teamId=" + this.teamId + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            List<PlayerDatum> list;
            String str2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerBattingProbabilities)) {
                return false;
            }
            PlayerBattingProbabilities playerBattingProbabilities = (PlayerBattingProbabilities) obj;
            if (this.__typename.equals(playerBattingProbabilities.__typename) && ((str = this.playerId) != null ? str.equals(playerBattingProbabilities.playerId) : playerBattingProbabilities.playerId == null) && ((list = this.playerData) != null ? list.equals(playerBattingProbabilities.playerData) : playerBattingProbabilities.playerData == null) && ((str2 = this.playerBound) != null ? str2.equals(playerBattingProbabilities.playerBound) : playerBattingProbabilities.playerBound == null)) {
                String str3 = this.teamId;
                String str4 = playerBattingProbabilities.teamId;
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
                String str = this.playerId;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                List<PlayerDatum> list = this.playerData;
                int hashCode3 = (hashCode2 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str2 = this.playerBound;
                int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.teamId;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<PlayerBattingProbabilities> {
            final PlayerDatum.Mapper playerDatumFieldMapper = new PlayerDatum.Mapper();

            @Override 
            public PlayerBattingProbabilities map(ResponseReader responseReader) {
                return new PlayerBattingProbabilities(responseReader.readString(PlayerBattingProbabilities.$responseFields[0]), responseReader.readString(PlayerBattingProbabilities.$responseFields[1]), responseReader.readList(PlayerBattingProbabilities.$responseFields[2], new ResponseReader.ListReader<PlayerDatum>() {


                    @Override 
                    public PlayerDatum read(ResponseReader.ListItemReader listItemReader) {
                        return (PlayerDatum) listItemReader.readObject(new ResponseReader.ObjectReader<PlayerDatum>() {


                            @Override 
                            public PlayerDatum read(ResponseReader responseReader) {
                                return Mapper.this.playerDatumFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readString(PlayerBattingProbabilities.$responseFields[3]), responseReader.readString(PlayerBattingProbabilities.$responseFields[4]));
            }
        }
    }

    public static class PlayerDatum {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("probabilities", "probabilities", null, true, Collections.emptyList()), ResponseField.forString("bound", "bound", null, true, Collections.emptyList()), ResponseField.forBoolean("red", "red", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String bound;
        final String probabilities;
        final Boolean red;

        public PlayerDatum(String str, String str2, String str3, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.probabilities = str2;
            this.bound = str3;
            this.red = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public String probabilities() {
            return this.probabilities;
        }

        public String bound() {
            return this.bound;
        }

        public Boolean red() {
            return this.red;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(PlayerDatum.$responseFields[0], PlayerDatum.this.__typename);
                    responseWriter.writeString(PlayerDatum.$responseFields[1], PlayerDatum.this.probabilities);
                    responseWriter.writeString(PlayerDatum.$responseFields[2], PlayerDatum.this.bound);
                    responseWriter.writeBoolean(PlayerDatum.$responseFields[3], PlayerDatum.this.red);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "PlayerDatum{__typename=" + this.__typename + ", probabilities=" + this.probabilities + ", bound=" + this.bound + ", red=" + this.red + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerDatum)) {
                return false;
            }
            PlayerDatum playerDatum = (PlayerDatum) obj;
            if (this.__typename.equals(playerDatum.__typename) && ((str = this.probabilities) != null ? str.equals(playerDatum.probabilities) : playerDatum.probabilities == null) && ((str2 = this.bound) != null ? str2.equals(playerDatum.bound) : playerDatum.bound == null)) {
                Boolean bool = this.red;
                Boolean bool2 = playerDatum.red;
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
                String str = this.probabilities;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.bound;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Boolean bool = this.red;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<PlayerDatum> {
            @Override 
            public PlayerDatum map(ResponseReader responseReader) {
                return new PlayerDatum(responseReader.readString(PlayerDatum.$responseFields[0]), responseReader.readString(PlayerDatum.$responseFields[1]), responseReader.readString(PlayerDatum.$responseFields[2]), responseReader.readBoolean(PlayerDatum.$responseFields[3]));
            }
        }
    }
}
