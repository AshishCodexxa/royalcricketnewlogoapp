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

public final class GetLivePlayerProjectionDetailsQuery implements Query<GetLivePlayerProjectionDetailsQuery.Data, GetLivePlayerProjectionDetailsQuery.Data, GetLivePlayerProjectionDetailsQuery.Variables> {
    public static final String OPERATION_ID = "da4aeee6f6df3394fe282ad538206e699f63765b5eecb58449156237d2dc0bf3";
    public static final OperationName OPERATION_NAME = new OperationName() {

       @Override
        public String name() {
            return "getLivePlayerProjectionDetails";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query getLivePlayerProjectionDetails($matchId: String) {\n  getLivePlayerProjectionDetails(matchId: $matchId) {\n    __typename\n    bowler {\n      __typename\n      matchID\n      strikerId\n      nonStrikerId\n      strikerName\n      nonStrikerName\n      bowlerId\n      bowlerRuns\n      wicketsTakenTillNow\n      maxOvers\n      oversBowledSoFar\n      strikerPosition\n      nonStrikerPosition\n      inningNo\n      format\n      bowlerName\n      teamName\n      projected\n      bounds\n    }\n    batsman {\n      __typename\n      playerId\n      playerRuns\n      playerName\n      playerBalls\n      playerTeamName\n      inningNo\n      overNo\n      format\n      playerBattingProbabilities {\n        __typename\n        playerId\n        playerData {\n          __typename\n          probabilities\n          bound\n          red\n        }\n        playerBound\n        teamId\n      }\n    }\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public GetLivePlayerProjectionDetailsQuery(Input<String> input) {
        Utils.checkNotNull(input, "matchId == null");
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
        private Input<String> matchId = Input.absent();

        Builder() {
        }

        public Builder matchId(String str) {
            this.matchId = Input.fromNullable(str);
            return this;
        }

        public Builder matchIdInput(Input<String> input) {
            this.matchId = (Input) Utils.checkNotNull(input, "matchId == null");
            return this;
        }

        public GetLivePlayerProjectionDetailsQuery build() {
            return new GetLivePlayerProjectionDetailsQuery(this.matchId);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final Input<String> matchId;
        private final transient Map<String, Object> valueMap;

        Variables(Input<String> input) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.matchId = input;
            if (input.defined) {
                linkedHashMap.put("matchId", input.value);
            }
        }

        public Input<String> matchId() {
            return this.matchId;
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
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getLivePlayerProjectionDetails", "getLivePlayerProjectionDetails", new UnmodifiableMapBuilder(1).put("matchId", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "matchId").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final GetLivePlayerProjectionDetails getLivePlayerProjectionDetails;

        public Data(GetLivePlayerProjectionDetails getLivePlayerProjectionDetails2) {
            this.getLivePlayerProjectionDetails = getLivePlayerProjectionDetails2;
        }

        public GetLivePlayerProjectionDetails getLivePlayerProjectionDetails() {
            return this.getLivePlayerProjectionDetails;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.getLivePlayerProjectionDetails != null ? Data.this.getLivePlayerProjectionDetails.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getLivePlayerProjectionDetails=" + this.getLivePlayerProjectionDetails + "}";
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
            GetLivePlayerProjectionDetails getLivePlayerProjectionDetails2 = this.getLivePlayerProjectionDetails;
            GetLivePlayerProjectionDetails getLivePlayerProjectionDetails3 = ((Data) obj).getLivePlayerProjectionDetails;
            if (getLivePlayerProjectionDetails2 != null) {
                return getLivePlayerProjectionDetails2.equals(getLivePlayerProjectionDetails3);
            }
            if (getLivePlayerProjectionDetails3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetLivePlayerProjectionDetails getLivePlayerProjectionDetails2 = this.getLivePlayerProjectionDetails;
                this.$hashCode = 1000003 ^ (getLivePlayerProjectionDetails2 == null ? 0 : getLivePlayerProjectionDetails2.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetLivePlayerProjectionDetails.Mapper getLivePlayerProjectionDetailsFieldMapper = new GetLivePlayerProjectionDetails.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((GetLivePlayerProjectionDetails) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetLivePlayerProjectionDetails>() {

                    @Override 
                    public GetLivePlayerProjectionDetails read(ResponseReader responseReader) {
                        return Mapper.this.getLivePlayerProjectionDetailsFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class GetLivePlayerProjectionDetails {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forObject("bowler", "bowler", null, true, Collections.emptyList()), ResponseField.forList("batsman", "batsman", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Batsman> batsman;
        final Bowler bowler;

        public GetLivePlayerProjectionDetails(String str, Bowler bowler2, List<Batsman> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.bowler = bowler2;
            this.batsman = list;
        }

        public String __typename() {
            return this.__typename;
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
                    responseWriter.writeString(GetLivePlayerProjectionDetails.$responseFields[0], GetLivePlayerProjectionDetails.this.__typename);
                    responseWriter.writeObject(GetLivePlayerProjectionDetails.$responseFields[1], GetLivePlayerProjectionDetails.this.bowler != null ? GetLivePlayerProjectionDetails.this.bowler.marshaller() : null);
                    responseWriter.writeList(GetLivePlayerProjectionDetails.$responseFields[2], GetLivePlayerProjectionDetails.this.batsman, new ResponseWriter.ListWriter() {

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
                this.$toString = "GetLivePlayerProjectionDetails{__typename=" + this.__typename + ", bowler=" + this.bowler + ", batsman=" + this.batsman + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Bowler bowler2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetLivePlayerProjectionDetails)) {
                return false;
            }
            GetLivePlayerProjectionDetails getLivePlayerProjectionDetails = (GetLivePlayerProjectionDetails) obj;
            if (this.__typename.equals(getLivePlayerProjectionDetails.__typename) && ((bowler2 = this.bowler) != null ? bowler2.equals(getLivePlayerProjectionDetails.bowler) : getLivePlayerProjectionDetails.bowler == null)) {
                List<Batsman> list = this.batsman;
                List<Batsman> list2 = getLivePlayerProjectionDetails.batsman;
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
                Bowler bowler2 = this.bowler;
                int i = 0;
                int hashCode2 = (hashCode ^ (bowler2 == null ? 0 : bowler2.hashCode())) * 1000003;
                List<Batsman> list = this.batsman;
                if (list != null) {
                    i = list.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<GetLivePlayerProjectionDetails> {
            final Batsman.Mapper batsmanFieldMapper = new Batsman.Mapper();
            final Bowler.Mapper bowlerFieldMapper = new Bowler.Mapper();

            @Override 
            public GetLivePlayerProjectionDetails map(ResponseReader responseReader) {
                return new GetLivePlayerProjectionDetails(responseReader.readString(GetLivePlayerProjectionDetails.$responseFields[0]), (Bowler) responseReader.readObject(GetLivePlayerProjectionDetails.$responseFields[1], new ResponseReader.ObjectReader<Bowler>() {


                    @Override 
                    public Bowler read(ResponseReader responseReader) {
                        return Mapper.this.bowlerFieldMapper.map(responseReader);
                    }
                }), responseReader.readList(GetLivePlayerProjectionDetails.$responseFields[2], new ResponseReader.ListReader<Batsman>() {

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
