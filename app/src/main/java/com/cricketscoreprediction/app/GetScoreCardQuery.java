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
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

public final class GetScoreCardQuery implements Query<GetScoreCardQuery.Data, GetScoreCardQuery.Data, GetScoreCardQuery.Variables> {
    public static final String OPERATION_ID = "7a053073d47def3043053560f3b3a483b6343bdd48c5c74901649bc77dd1b932";
    public static final OperationName OPERATION_NAME = new OperationName() {

       @Override
        public String name() {
            return "getScoreCard";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query getScoreCard($matchID: String) {\n  getScoreCard(matchID: $matchID) {\n    __typename\n    fullScoreCard {\n      __typename\n      battingTeamName\n      battingTeamShortName\n      battingTeamID\n      runsScored\n      wickets\n      overs\n      runRate\n      batting {\n        __typename\n        matchID\n        playerID\n        playerName\n        playerTeam\n        playerMatchSixes\n        playerMatchFours\n        playerMatchBalls\n        playerMatchRuns\n        playerBattingNumber\n        playerDismissalInfo\n        playerHowOut\n        playerMatchStrikeRate\n      }\n      bowling {\n        __typename\n        matchID\n        playerID\n        playerName\n        playerTeam\n        playerDotBalls\n        playerWicketsTaken\n        playerMaidensBowled\n        playerRunsConceeded\n        playerWides\n        playerNoBall\n        playerOversBowled\n        playerEconomyRate\n      }\n      extras {\n        __typename\n        byes\n        legByes\n        noBalls\n        penalties\n        wides\n        totalExtras\n      }\n      fow {\n        __typename\n        playerName\n        playerID\n        order\n        over_ball\n        runs\n      }\n      total {\n        __typename\n        overs\n        runsScored\n        wickets\n        runRate\n      }\n    }\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public GetScoreCardQuery(Input<String> input) {
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

        public GetScoreCardQuery build() {
            return new GetScoreCardQuery(this.matchID);
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("getScoreCard", "getScoreCard", new UnmodifiableMapBuilder(1).put("matchID", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "matchID").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final GetScoreCard getScoreCard;

        public Data(GetScoreCard getScoreCard2) {
            this.getScoreCard = getScoreCard2;
        }

        public GetScoreCard getScoreCard() {
            return this.getScoreCard;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.getScoreCard != null ? Data.this.getScoreCard.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getScoreCard=" + this.getScoreCard + "}";
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
            GetScoreCard getScoreCard2 = this.getScoreCard;
            GetScoreCard getScoreCard3 = ((Data) obj).getScoreCard;
            if (getScoreCard2 != null) {
                return getScoreCard2.equals(getScoreCard3);
            }
            if (getScoreCard3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetScoreCard getScoreCard2 = this.getScoreCard;
                this.$hashCode = 1000003 ^ (getScoreCard2 == null ? 0 : getScoreCard2.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetScoreCard.Mapper getScoreCardFieldMapper = new GetScoreCard.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((GetScoreCard) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetScoreCard>() {


                    @Override 
                    public GetScoreCard read(ResponseReader responseReader) {
                        return Mapper.this.getScoreCardFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class GetScoreCard {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("fullScoreCard", "fullScoreCard", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<FullScoreCard> fullScoreCard;

        public GetScoreCard(String str, List<FullScoreCard> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.fullScoreCard = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<FullScoreCard> fullScoreCard() {
            return this.fullScoreCard;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(GetScoreCard.$responseFields[0], GetScoreCard.this.__typename);
                    responseWriter.writeList(GetScoreCard.$responseFields[1], GetScoreCard.this.fullScoreCard, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((FullScoreCard) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetScoreCard{__typename=" + this.__typename + ", fullScoreCard=" + this.fullScoreCard + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetScoreCard)) {
                return false;
            }
            GetScoreCard getScoreCard = (GetScoreCard) obj;
            if (this.__typename.equals(getScoreCard.__typename)) {
                List<FullScoreCard> list = this.fullScoreCard;
                List<FullScoreCard> list2 = getScoreCard.fullScoreCard;
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
                List<FullScoreCard> list = this.fullScoreCard;
                this.$hashCode = hashCode ^ (list == null ? 0 : list.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<GetScoreCard> {
            final FullScoreCard.Mapper fullScoreCardFieldMapper = new FullScoreCard.Mapper();

            @Override 
            public GetScoreCard map(ResponseReader responseReader) {
                return new GetScoreCard(responseReader.readString(GetScoreCard.$responseFields[0]), responseReader.readList(GetScoreCard.$responseFields[1], new ResponseReader.ListReader<FullScoreCard>() {


                    @Override 
                    public FullScoreCard read(ResponseReader.ListItemReader listItemReader) {
                        return (FullScoreCard) listItemReader.readObject(new ResponseReader.ObjectReader<FullScoreCard>() {


                            @Override 
                            public FullScoreCard read(ResponseReader responseReader) {
                                return Mapper.this.fullScoreCardFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class FullScoreCard {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("battingTeamName", "battingTeamName", null, true, Collections.emptyList()), ResponseField.forString("battingTeamShortName", "battingTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("battingTeamID", "battingTeamID", null, true, Collections.emptyList()), ResponseField.forString("runsScored", "runsScored", null, true, Collections.emptyList()), ResponseField.forString("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forString("overs", "overs", null, true, Collections.emptyList()), ResponseField.forString("runRate", "runRate", null, true, Collections.emptyList()), ResponseField.forList("batting", "batting", null, true, Collections.emptyList()), ResponseField.forList("bowling", "bowling", null, true, Collections.emptyList()), ResponseField.forObject("extras", "extras", null, true, Collections.emptyList()), ResponseField.forList("fow", "fow", null, true, Collections.emptyList()), ResponseField.forObject("total", "total", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Batting> batting;
        final String battingTeamID;
        final String battingTeamName;
        final String battingTeamShortName;
        final List<Bowling> bowling;
        final Extras extras;
        final List<Fow> fow;
        final String overs;
        final String runRate;
        final String runsScored;
        final Total total;
        final String wickets;

        public FullScoreCard(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<Batting> list, List<Bowling> list2, Extras extras2, List<Fow> list3, Total total2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.battingTeamName = str2;
            this.battingTeamShortName = str3;
            this.battingTeamID = str4;
            this.runsScored = str5;
            this.wickets = str6;
            this.overs = str7;
            this.runRate = str8;
            this.batting = list;
            this.bowling = list2;
            this.extras = extras2;
            this.fow = list3;
            this.total = total2;
        }

        public String __typename() {
            return this.__typename;
        }

        public String battingTeamName() {
            return this.battingTeamName;
        }

        public String battingTeamShortName() {
            return this.battingTeamShortName;
        }

        public String battingTeamID() {
            return this.battingTeamID;
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

        public List<Batting> batting() {
            return this.batting;
        }

        public List<Bowling> bowling() {
            return this.bowling;
        }

        public Extras extras() {
            return this.extras;
        }

        public List<Fow> fow() {
            return this.fow;
        }

        public Total total() {
            return this.total;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(FullScoreCard.$responseFields[0], FullScoreCard.this.__typename);
                    responseWriter.writeString(FullScoreCard.$responseFields[1], FullScoreCard.this.battingTeamName);
                    responseWriter.writeString(FullScoreCard.$responseFields[2], FullScoreCard.this.battingTeamShortName);
                    responseWriter.writeString(FullScoreCard.$responseFields[3], FullScoreCard.this.battingTeamID);
                    responseWriter.writeString(FullScoreCard.$responseFields[4], FullScoreCard.this.runsScored);
                    responseWriter.writeString(FullScoreCard.$responseFields[5], FullScoreCard.this.wickets);
                    responseWriter.writeString(FullScoreCard.$responseFields[6], FullScoreCard.this.overs);
                    responseWriter.writeString(FullScoreCard.$responseFields[7], FullScoreCard.this.runRate);
                    responseWriter.writeList(FullScoreCard.$responseFields[8], FullScoreCard.this.batting, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Batting) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(FullScoreCard.$responseFields[9], FullScoreCard.this.bowling, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Bowling) it.next()).marshaller());
                            }
                        }
                    });
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(FullScoreCard.$responseFields[10], FullScoreCard.this.extras != null ? FullScoreCard.this.extras.marshaller() : null);
                    responseWriter.writeList(FullScoreCard.$responseFields[11], FullScoreCard.this.fow, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Fow) it.next()).marshaller());
                            }
                        }
                    });
                    ResponseField responseField = FullScoreCard.$responseFields[12];
                    if (FullScoreCard.this.total != null) {
                        responseFieldMarshaller = FullScoreCard.this.total.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FullScoreCard{__typename=" + this.__typename + ", battingTeamName=" + this.battingTeamName + ", battingTeamShortName=" + this.battingTeamShortName + ", battingTeamID=" + this.battingTeamID + ", runsScored=" + this.runsScored + ", wickets=" + this.wickets + ", overs=" + this.overs + ", runRate=" + this.runRate + ", batting=" + this.batting + ", bowling=" + this.bowling + ", extras=" + this.extras + ", fow=" + this.fow + ", total=" + this.total + "}";
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
            List<Batting> list;
            List<Bowling> list2;
            Extras extras2;
            List<Fow> list3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FullScoreCard)) {
                return false;
            }
            FullScoreCard fullScoreCard = (FullScoreCard) obj;
            if (this.__typename.equals(fullScoreCard.__typename) && ((str = this.battingTeamName) != null ? str.equals(fullScoreCard.battingTeamName) : fullScoreCard.battingTeamName == null) && ((str2 = this.battingTeamShortName) != null ? str2.equals(fullScoreCard.battingTeamShortName) : fullScoreCard.battingTeamShortName == null) && ((str3 = this.battingTeamID) != null ? str3.equals(fullScoreCard.battingTeamID) : fullScoreCard.battingTeamID == null) && ((str4 = this.runsScored) != null ? str4.equals(fullScoreCard.runsScored) : fullScoreCard.runsScored == null) && ((str5 = this.wickets) != null ? str5.equals(fullScoreCard.wickets) : fullScoreCard.wickets == null) && ((str6 = this.overs) != null ? str6.equals(fullScoreCard.overs) : fullScoreCard.overs == null) && ((str7 = this.runRate) != null ? str7.equals(fullScoreCard.runRate) : fullScoreCard.runRate == null) && ((list = this.batting) != null ? list.equals(fullScoreCard.batting) : fullScoreCard.batting == null) && ((list2 = this.bowling) != null ? list2.equals(fullScoreCard.bowling) : fullScoreCard.bowling == null) && ((extras2 = this.extras) != null ? extras2.equals(fullScoreCard.extras) : fullScoreCard.extras == null) && ((list3 = this.fow) != null ? list3.equals(fullScoreCard.fow) : fullScoreCard.fow == null)) {
                Total total2 = this.total;
                Total total3 = fullScoreCard.total;
                if (total2 == null) {
                    if (total3 == null) {
                        return true;
                    }
                } else if (total2.equals(total3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.battingTeamName;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.battingTeamShortName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.battingTeamID;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.runsScored;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.wickets;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.overs;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.runRate;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                List<Batting> list = this.batting;
                int hashCode9 = (hashCode8 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Bowling> list2 = this.bowling;
                int hashCode10 = (hashCode9 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                Extras extras2 = this.extras;
                int hashCode11 = (hashCode10 ^ (extras2 == null ? 0 : extras2.hashCode())) * 1000003;
                List<Fow> list3 = this.fow;
                int hashCode12 = (hashCode11 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                Total total2 = this.total;
                if (total2 != null) {
                    i = total2.hashCode();
                }
                this.$hashCode = hashCode12 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<FullScoreCard> {
            final Batting.Mapper battingFieldMapper = new Batting.Mapper();
            final Bowling.Mapper bowlingFieldMapper = new Bowling.Mapper();
            final Extras.Mapper extrasFieldMapper = new Extras.Mapper();
            final Fow.Mapper fowFieldMapper = new Fow.Mapper();
            final Total.Mapper totalFieldMapper = new Total.Mapper();

            @Override 
            public FullScoreCard map(ResponseReader responseReader) {
                return new FullScoreCard(responseReader.readString(FullScoreCard.$responseFields[0]), responseReader.readString(FullScoreCard.$responseFields[1]), responseReader.readString(FullScoreCard.$responseFields[2]), responseReader.readString(FullScoreCard.$responseFields[3]), responseReader.readString(FullScoreCard.$responseFields[4]), responseReader.readString(FullScoreCard.$responseFields[5]), responseReader.readString(FullScoreCard.$responseFields[6]), responseReader.readString(FullScoreCard.$responseFields[7]), responseReader.readList(FullScoreCard.$responseFields[8], new ResponseReader.ListReader<Batting>() {


                    @Override
                    public Batting read(ResponseReader.ListItemReader listItemReader) {
                        return (Batting) listItemReader.readObject(new ResponseReader.ObjectReader<Batting>() {


                            @Override
                            public Batting read(ResponseReader responseReader) {
                                return Mapper.this.battingFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(FullScoreCard.$responseFields[9], new ResponseReader.ListReader<Bowling>() {


                    @Override
                    public Bowling read(ResponseReader.ListItemReader listItemReader) {
                        return (Bowling) listItemReader.readObject(new ResponseReader.ObjectReader<Bowling>() {


                            @Override
                            public Bowling read(ResponseReader responseReader) {
                                return Mapper.this.bowlingFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (Extras) responseReader.readObject(FullScoreCard.$responseFields[10], new ResponseReader.ObjectReader<Extras>() {


                    @Override 
                    public Extras read(ResponseReader responseReader) {
                        return Mapper.this.extrasFieldMapper.map(responseReader);
                    }
                }), responseReader.readList(FullScoreCard.$responseFields[11], new ResponseReader.ListReader<Fow>() {


                    @Override 
                    public Fow read(ResponseReader.ListItemReader listItemReader) {
                        return (Fow) listItemReader.readObject(new ResponseReader.ObjectReader<Fow>() {


                            @Override 
                            public Fow read(ResponseReader responseReader) {
                                return Mapper.this.fowFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (Total) responseReader.readObject(FullScoreCard.$responseFields[12], new ResponseReader.ObjectReader<Total>() {


                    @Override 
                    public Total read(ResponseReader responseReader) {
                        return Mapper.this.totalFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class Batting {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchID", "matchID", null, true, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerTeam", "playerTeam", null, true, Collections.emptyList()), ResponseField.forString("playerMatchSixes", "playerMatchSixes", null, true, Collections.emptyList()), ResponseField.forString("playerMatchFours", "playerMatchFours", null, true, Collections.emptyList()), ResponseField.forString("playerMatchBalls", "playerMatchBalls", null, true, Collections.emptyList()), ResponseField.forString("playerMatchRuns", "playerMatchRuns", null, true, Collections.emptyList()), ResponseField.forString("playerBattingNumber", "playerBattingNumber", null, true, Collections.emptyList()), ResponseField.forString("playerDismissalInfo", "playerDismissalInfo", null, true, Collections.emptyList()), ResponseField.forString("playerHowOut", "playerHowOut", null, true, Collections.emptyList()), ResponseField.forString("playerMatchStrikeRate", "playerMatchStrikeRate", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String matchID;
        final String playerBattingNumber;
        final String playerDismissalInfo;
        final String playerHowOut;
        final String playerID;
        final String playerMatchBalls;
        final String playerMatchFours;
        final String playerMatchRuns;
        final String playerMatchSixes;
        final String playerMatchStrikeRate;
        final String playerName;
        final String playerTeam;

        public Batting(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchID = str2;
            this.playerID = str3;
            this.playerName = str4;
            this.playerTeam = str5;
            this.playerMatchSixes = str6;
            this.playerMatchFours = str7;
            this.playerMatchBalls = str8;
            this.playerMatchRuns = str9;
            this.playerBattingNumber = str10;
            this.playerDismissalInfo = str11;
            this.playerHowOut = str12;
            this.playerMatchStrikeRate = str13;
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

        public String playerBattingNumber() {
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
                    responseWriter.writeString(Batting.$responseFields[9], Batting.this.playerBattingNumber);
                    responseWriter.writeString(Batting.$responseFields[10], Batting.this.playerDismissalInfo);
                    responseWriter.writeString(Batting.$responseFields[11], Batting.this.playerHowOut);
                    responseWriter.writeString(Batting.$responseFields[12], Batting.this.playerMatchStrikeRate);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Batting{__typename=" + this.__typename + ", matchID=" + this.matchID + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerTeam=" + this.playerTeam + ", playerMatchSixes=" + this.playerMatchSixes + ", playerMatchFours=" + this.playerMatchFours + ", playerMatchBalls=" + this.playerMatchBalls + ", playerMatchRuns=" + this.playerMatchRuns + ", playerBattingNumber=" + this.playerBattingNumber + ", playerDismissalInfo=" + this.playerDismissalInfo + ", playerHowOut=" + this.playerHowOut + ", playerMatchStrikeRate=" + this.playerMatchStrikeRate + "}";
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
            if (!(obj instanceof Batting)) {
                return false;
            }
            Batting batting = (Batting) obj;
            if (this.__typename.equals(batting.__typename) && ((str = this.matchID) != null ? str.equals(batting.matchID) : batting.matchID == null) && ((str2 = this.playerID) != null ? str2.equals(batting.playerID) : batting.playerID == null) && ((str3 = this.playerName) != null ? str3.equals(batting.playerName) : batting.playerName == null) && ((str4 = this.playerTeam) != null ? str4.equals(batting.playerTeam) : batting.playerTeam == null) && ((str5 = this.playerMatchSixes) != null ? str5.equals(batting.playerMatchSixes) : batting.playerMatchSixes == null) && ((str6 = this.playerMatchFours) != null ? str6.equals(batting.playerMatchFours) : batting.playerMatchFours == null) && ((str7 = this.playerMatchBalls) != null ? str7.equals(batting.playerMatchBalls) : batting.playerMatchBalls == null) && ((str8 = this.playerMatchRuns) != null ? str8.equals(batting.playerMatchRuns) : batting.playerMatchRuns == null) && ((str9 = this.playerBattingNumber) != null ? str9.equals(batting.playerBattingNumber) : batting.playerBattingNumber == null) && ((str10 = this.playerDismissalInfo) != null ? str10.equals(batting.playerDismissalInfo) : batting.playerDismissalInfo == null) && ((str11 = this.playerHowOut) != null ? str11.equals(batting.playerHowOut) : batting.playerHowOut == null)) {
                String str12 = this.playerMatchStrikeRate;
                String str13 = batting.playerMatchStrikeRate;
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
                String str5 = this.playerMatchSixes;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.playerMatchFours;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.playerMatchBalls;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.playerMatchRuns;
                int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.playerBattingNumber;
                int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.playerDismissalInfo;
                int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.playerHowOut;
                int hashCode12 = (hashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.playerMatchStrikeRate;
                if (str12 != null) {
                    i = str12.hashCode();
                }
                this.$hashCode = hashCode12 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Batting> {
            @Override 
            public Batting map(ResponseReader responseReader) {
                return new Batting(responseReader.readString(Batting.$responseFields[0]), responseReader.readString(Batting.$responseFields[1]), responseReader.readString(Batting.$responseFields[2]), responseReader.readString(Batting.$responseFields[3]), responseReader.readString(Batting.$responseFields[4]), responseReader.readString(Batting.$responseFields[5]), responseReader.readString(Batting.$responseFields[6]), responseReader.readString(Batting.$responseFields[7]), responseReader.readString(Batting.$responseFields[8]), responseReader.readString(Batting.$responseFields[9]), responseReader.readString(Batting.$responseFields[10]), responseReader.readString(Batting.$responseFields[11]), responseReader.readString(Batting.$responseFields[12]));
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

    public static class Extras {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("byes", "byes", null, true, Collections.emptyList()), ResponseField.forString("legByes", "legByes", null, true, Collections.emptyList()), ResponseField.forString("noBalls", "noBalls", null, true, Collections.emptyList()), ResponseField.forString("penalties", "penalties", null, true, Collections.emptyList()), ResponseField.forString("wides", "wides", null, true, Collections.emptyList()), ResponseField.forString("totalExtras", "totalExtras", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String byes;
        final String legByes;
        final String noBalls;
        final String penalties;
        final String totalExtras;
        final String wides;

        public Extras(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.byes = str2;
            this.legByes = str3;
            this.noBalls = str4;
            this.penalties = str5;
            this.wides = str6;
            this.totalExtras = str7;
        }

        public String __typename() {
            return this.__typename;
        }

        public String byes() {
            return this.byes;
        }

        public String legByes() {
            return this.legByes;
        }

        public String noBalls() {
            return this.noBalls;
        }

        public String penalties() {
            return this.penalties;
        }

        public String wides() {
            return this.wides;
        }

        public String totalExtras() {
            return this.totalExtras;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Extras.$responseFields[0], Extras.this.__typename);
                    responseWriter.writeString(Extras.$responseFields[1], Extras.this.byes);
                    responseWriter.writeString(Extras.$responseFields[2], Extras.this.legByes);
                    responseWriter.writeString(Extras.$responseFields[3], Extras.this.noBalls);
                    responseWriter.writeString(Extras.$responseFields[4], Extras.this.penalties);
                    responseWriter.writeString(Extras.$responseFields[5], Extras.this.wides);
                    responseWriter.writeString(Extras.$responseFields[6], Extras.this.totalExtras);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Extras{__typename=" + this.__typename + ", byes=" + this.byes + ", legByes=" + this.legByes + ", noBalls=" + this.noBalls + ", penalties=" + this.penalties + ", wides=" + this.wides + ", totalExtras=" + this.totalExtras + "}";
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
            if (!(obj instanceof Extras)) {
                return false;
            }
            Extras extras = (Extras) obj;
            if (this.__typename.equals(extras.__typename) && ((str = this.byes) != null ? str.equals(extras.byes) : extras.byes == null) && ((str2 = this.legByes) != null ? str2.equals(extras.legByes) : extras.legByes == null) && ((str3 = this.noBalls) != null ? str3.equals(extras.noBalls) : extras.noBalls == null) && ((str4 = this.penalties) != null ? str4.equals(extras.penalties) : extras.penalties == null) && ((str5 = this.wides) != null ? str5.equals(extras.wides) : extras.wides == null)) {
                String str6 = this.totalExtras;
                String str7 = extras.totalExtras;
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
                String str = this.byes;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.legByes;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.noBalls;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.penalties;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.wides;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.totalExtras;
                if (str6 != null) {
                    i = str6.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Extras> {
            @Override 
            public Extras map(ResponseReader responseReader) {
                return new Extras(responseReader.readString(Extras.$responseFields[0]), responseReader.readString(Extras.$responseFields[1]), responseReader.readString(Extras.$responseFields[2]), responseReader.readString(Extras.$responseFields[3]), responseReader.readString(Extras.$responseFields[4]), responseReader.readString(Extras.$responseFields[5]), responseReader.readString(Extras.$responseFields[6]));
            }
        }
    }

    public static class Fow {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forInt("order", "order", null, true, Collections.emptyList()), ResponseField.forString("over_ball", "over_ball", null, true, Collections.emptyList()), ResponseField.forString("runs", "runs", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer order;
        final String over_ball;
        final String playerID;
        final String playerName;
        final String runs;

        public Fow(String str, String str2, String str3, Integer num, String str4, String str5) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerName = str2;
            this.playerID = str3;
            this.order = num;
            this.over_ball = str4;
            this.runs = str5;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerName() {
            return this.playerName;
        }

        public String playerID() {
            return this.playerID;
        }

        public Integer order() {
            return this.order;
        }

        public String over_ball() {
            return this.over_ball;
        }

        public String runs() {
            return this.runs;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Fow.$responseFields[0], Fow.this.__typename);
                    responseWriter.writeString(Fow.$responseFields[1], Fow.this.playerName);
                    responseWriter.writeString(Fow.$responseFields[2], Fow.this.playerID);
                    responseWriter.writeInt(Fow.$responseFields[3], Fow.this.order);
                    responseWriter.writeString(Fow.$responseFields[4], Fow.this.over_ball);
                    responseWriter.writeString(Fow.$responseFields[5], Fow.this.runs);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Fow{__typename=" + this.__typename + ", playerName=" + this.playerName + ", playerID=" + this.playerID + ", order=" + this.order + ", over_ball=" + this.over_ball + ", runs=" + this.runs + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            Integer num;
            String str3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Fow)) {
                return false;
            }
            Fow fow = (Fow) obj;
            if (this.__typename.equals(fow.__typename) && ((str = this.playerName) != null ? str.equals(fow.playerName) : fow.playerName == null) && ((str2 = this.playerID) != null ? str2.equals(fow.playerID) : fow.playerID == null) && ((num = this.order) != null ? num.equals(fow.order) : fow.order == null) && ((str3 = this.over_ball) != null ? str3.equals(fow.over_ball) : fow.over_ball == null)) {
                String str4 = this.runs;
                String str5 = fow.runs;
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
                String str = this.playerName;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerID;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Integer num = this.order;
                int hashCode4 = (hashCode3 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str3 = this.over_ball;
                int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.runs;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Fow> {
            @Override 
            public Fow map(ResponseReader responseReader) {
                return new Fow(responseReader.readString(Fow.$responseFields[0]), responseReader.readString(Fow.$responseFields[1]), responseReader.readString(Fow.$responseFields[2]), responseReader.readInt(Fow.$responseFields[3]), responseReader.readString(Fow.$responseFields[4]), responseReader.readString(Fow.$responseFields[5]));
            }
        }
    }

    public static class Total {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("overs", "overs", null, true, Collections.emptyList()), ResponseField.forString("runsScored", "runsScored", null, true, Collections.emptyList()), ResponseField.forString("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forString("runRate", "runRate", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String overs;
        final String runRate;
        final String runsScored;
        final String wickets;

        public Total(String str, String str2, String str3, String str4, String str5) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.overs = str2;
            this.runsScored = str3;
            this.wickets = str4;
            this.runRate = str5;
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

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Total.$responseFields[0], Total.this.__typename);
                    responseWriter.writeString(Total.$responseFields[1], Total.this.overs);
                    responseWriter.writeString(Total.$responseFields[2], Total.this.runsScored);
                    responseWriter.writeString(Total.$responseFields[3], Total.this.wickets);
                    responseWriter.writeString(Total.$responseFields[4], Total.this.runRate);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Total{__typename=" + this.__typename + ", overs=" + this.overs + ", runsScored=" + this.runsScored + ", wickets=" + this.wickets + ", runRate=" + this.runRate + "}";
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
            if (!(obj instanceof Total)) {
                return false;
            }
            Total total = (Total) obj;
            if (this.__typename.equals(total.__typename) && ((str = this.overs) != null ? str.equals(total.overs) : total.overs == null) && ((str2 = this.runsScored) != null ? str2.equals(total.runsScored) : total.runsScored == null) && ((str3 = this.wickets) != null ? str3.equals(total.wickets) : total.wickets == null)) {
                String str4 = this.runRate;
                String str5 = total.runRate;
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
                String str = this.overs;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.runsScored;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.wickets;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.runRate;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Total> {
            @Override 
            public Total map(ResponseReader responseReader) {
                return new Total(responseReader.readString(Total.$responseFields[0]), responseReader.readString(Total.$responseFields[1]), responseReader.readString(Total.$responseFields[2]), responseReader.readString(Total.$responseFields[3]), responseReader.readString(Total.$responseFields[4]));
            }
        }
    }
}
