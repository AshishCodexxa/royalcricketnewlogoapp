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

public final class GetHighlightsQuery implements Query<GetHighlightsQuery.Data, GetHighlightsQuery.Data, GetHighlightsQuery.Variables> {
    public static final String OPERATION_ID = "e050779f5b590cae46de0c7560e36371814f4da8a642a8dd17e6f1e6d57924e9";
    public static final OperationName OPERATION_NAME = new OperationName() {

       @Override
        public String name() {
            return "getHighlights";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query getHighlights($matchID: String, $innings: String, $type: String, $page: Int) {\n  getHighlights(matchID: $matchID, innings: $innings, type: $type, page: $page) {\n    __typename\n    HighlightBall {\n      __typename\n      matchID\n      ballID\n      ballNumber\n      innings\n      over\n      overNumber\n      commentary\n      teamID\n      teamName\n      runs\n      xCoordinate\n      yCoordinate\n      zad\n      wicket\n    }\n    totalCount {\n      __typename\n      totalFours\n      totalSix\n      totalWickets\n    }\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public GetHighlightsQuery(Input<String> input, Input<String> input2, Input<String> input3, Input<Integer> input4) {
        Utils.checkNotNull(input, "matchID == null");
        Utils.checkNotNull(input2, "innings == null");
        Utils.checkNotNull(input3, "type == null");
        Utils.checkNotNull(input4, "page == null");
        this.variables = new Variables(input, input2, input3, input4);
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
        private Input<String> matchID = Input.absent();
        private Input<Integer> page = Input.absent();
        private Input<String> type = Input.absent();

        Builder() {
        }

        public Builder matchID(String str) {
            this.matchID = Input.fromNullable(str);
            return this;
        }

        public Builder innings(String str) {
            this.innings = Input.fromNullable(str);
            return this;
        }

        public Builder type(String str) {
            this.type = Input.fromNullable(str);
            return this;
        }

        public Builder page(Integer num) {
            this.page = Input.fromNullable(num);
            return this;
        }

        public Builder matchIDInput(Input<String> input) {
            this.matchID = (Input) Utils.checkNotNull(input, "matchID == null");
            return this;
        }

        public Builder inningsInput(Input<String> input) {
            this.innings = (Input) Utils.checkNotNull(input, "innings == null");
            return this;
        }

        public Builder typeInput(Input<String> input) {
            this.type = (Input) Utils.checkNotNull(input, "type == null");
            return this;
        }

        public Builder pageInput(Input<Integer> input) {
            this.page = (Input) Utils.checkNotNull(input, "page == null");
            return this;
        }

        public GetHighlightsQuery build() {
            return new GetHighlightsQuery(this.matchID, this.innings, this.type, this.page);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final Input<String> innings;
        private final Input<String> matchID;
        private final Input<Integer> page;
        private final Input<String> type;
        private final transient Map<String, Object> valueMap;

        Variables(Input<String> input, Input<String> input2, Input<String> input3, Input<Integer> input4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.matchID = input;
            this.innings = input2;
            this.type = input3;
            this.page = input4;
            if (input.defined) {
                linkedHashMap.put("matchID", input.value);
            }
            if (input2.defined) {
                linkedHashMap.put("innings", input2.value);
            }
            if (input3.defined) {
                linkedHashMap.put("type", input3.value);
            }
            if (input4.defined) {
                linkedHashMap.put("page", input4.value);
            }
        }

        public Input<String> matchID() {
            return this.matchID;
        }

        public Input<String> innings() {
            return this.innings;
        }

        public Input<String> type() {
            return this.type;
        }

        public Input<Integer> page() {
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
                    if (Variables.this.matchID.defined) {
                        inputFieldWriter.writeString("matchID", Variables.this.matchID.value);
                    }
                    if (Variables.this.innings.defined) {
                        inputFieldWriter.writeString("innings", Variables.this.innings.value);
                    }
                    if (Variables.this.type.defined) {
                        inputFieldWriter.writeString("type", Variables.this.type.value);
                    }
                    if (Variables.this.page.defined) {
                        inputFieldWriter.writeInt("page", Variables.this.page.value);
                    }
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getHighlights", "getHighlights", new UnmodifiableMapBuilder(4).put("matchID", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "matchID").build()).put("innings", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "innings").build()).put("type", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "type").build()).put("page", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "page").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final GetHighlights getHighlights;

        public Data(GetHighlights getHighlights2) {
            this.getHighlights = getHighlights2;
        }

        public GetHighlights getHighlights() {
            return this.getHighlights;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.getHighlights != null ? Data.this.getHighlights.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getHighlights=" + this.getHighlights + "}";
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
            GetHighlights getHighlights2 = this.getHighlights;
            GetHighlights getHighlights3 = ((Data) obj).getHighlights;
            if (getHighlights2 != null) {
                return getHighlights2.equals(getHighlights3);
            }
            if (getHighlights3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetHighlights getHighlights2 = this.getHighlights;
                this.$hashCode = 1000003 ^ (getHighlights2 == null ? 0 : getHighlights2.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetHighlights.Mapper getHighlightsFieldMapper = new GetHighlights.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((GetHighlights) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetHighlights>() {

                    @Override 
                    public GetHighlights read(ResponseReader responseReader) {
                        return Mapper.this.getHighlightsFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class GetHighlights {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("HighlightBall", "HighlightBall", null, true, Collections.emptyList()), ResponseField.forObject("totalCount", "totalCount", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final List<HighlightBall> HighlightBall;
        final String __typename;
        final TotalCount totalCount;

        public GetHighlights(String str, List<HighlightBall> list, TotalCount totalCount2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.HighlightBall = list;
            this.totalCount = totalCount2;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<HighlightBall> HighlightBall() {
            return this.HighlightBall;
        }

        public TotalCount totalCount() {
            return this.totalCount;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(GetHighlights.$responseFields[0], GetHighlights.this.__typename);
                    responseWriter.writeList(GetHighlights.$responseFields[1], GetHighlights.this.HighlightBall, new ResponseWriter.ListWriter() {

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((HighlightBall) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeObject(GetHighlights.$responseFields[2], GetHighlights.this.totalCount != null ? GetHighlights.this.totalCount.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetHighlights{__typename=" + this.__typename + ", HighlightBall=" + this.HighlightBall + ", totalCount=" + this.totalCount + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<HighlightBall> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetHighlights)) {
                return false;
            }
            GetHighlights getHighlights = (GetHighlights) obj;
            if (this.__typename.equals(getHighlights.__typename) && ((list = this.HighlightBall) != null ? list.equals(getHighlights.HighlightBall) : getHighlights.HighlightBall == null)) {
                TotalCount totalCount2 = this.totalCount;
                TotalCount totalCount3 = getHighlights.totalCount;
                if (totalCount2 == null) {
                    if (totalCount3 == null) {
                        return true;
                    }
                } else if (totalCount2.equals(totalCount3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<HighlightBall> list = this.HighlightBall;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                TotalCount totalCount2 = this.totalCount;
                if (totalCount2 != null) {
                    i = totalCount2.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<GetHighlights> {
            final HighlightBall.Mapper highlightBallFieldMapper = new HighlightBall.Mapper();
            final TotalCount.Mapper totalCountFieldMapper = new TotalCount.Mapper();

            @Override 
            public GetHighlights map(ResponseReader responseReader) {
                return new GetHighlights(responseReader.readString(GetHighlights.$responseFields[0]), responseReader.readList(GetHighlights.$responseFields[1], new ResponseReader.ListReader<HighlightBall>() {

                    @Override 
                    public HighlightBall read(ResponseReader.ListItemReader listItemReader) {
                        return (HighlightBall) listItemReader.readObject(new ResponseReader.ObjectReader<HighlightBall>() {

                            @Override 
                            public HighlightBall read(ResponseReader responseReader) {
                                return Mapper.this.highlightBallFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (TotalCount) responseReader.readObject(GetHighlights.$responseFields[2], new ResponseReader.ObjectReader<TotalCount>() {

                    @Override 
                    public TotalCount read(ResponseReader responseReader) {
                        return Mapper.this.totalCountFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class HighlightBall {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchID", "matchID", null, true, Collections.emptyList()), ResponseField.forString("ballID", "ballID", null, true, Collections.emptyList()), ResponseField.forString("ballNumber", "ballNumber", null, true, Collections.emptyList()), ResponseField.forString("innings", "innings", null, true, Collections.emptyList()), ResponseField.forString("over", "over", null, true, Collections.emptyList()), ResponseField.forString("overNumber", "overNumber", null, true, Collections.emptyList()), ResponseField.forString("commentary", "commentary", null, true, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, true, Collections.emptyList()), ResponseField.forString("runs", "runs", null, true, Collections.emptyList()), ResponseField.forInt("xCoordinate", "xCoordinate", null, true, Collections.emptyList()), ResponseField.forInt("yCoordinate", "yCoordinate", null, true, Collections.emptyList()), ResponseField.forString("zad", "zad", null, true, Collections.emptyList()), ResponseField.forBoolean("wicket", "wicket", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String ballID;
        final String ballNumber;
        final String commentary;
        final String innings;
        final String matchID;
        final String over;
        final String overNumber;
        final String runs;
        final String teamID;
        final String teamName;
        final Boolean wicket;
        final Integer xCoordinate;
        final Integer yCoordinate;
        final String zad;

        public HighlightBall(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, Integer num2, String str12, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchID = str2;
            this.ballID = str3;
            this.ballNumber = str4;
            this.innings = str5;
            this.over = str6;
            this.overNumber = str7;
            this.commentary = str8;
            this.teamID = str9;
            this.teamName = str10;
            this.runs = str11;
            this.xCoordinate = num;
            this.yCoordinate = num2;
            this.zad = str12;
            this.wicket = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchID() {
            return this.matchID;
        }

        public String ballID() {
            return this.ballID;
        }

        public String ballNumber() {
            return this.ballNumber;
        }

        public String innings() {
            return this.innings;
        }

        public String over() {
            return this.over;
        }

        public String overNumber() {
            return this.overNumber;
        }

        public String commentary() {
            return this.commentary;
        }

        public String teamID() {
            return this.teamID;
        }

        public String teamName() {
            return this.teamName;
        }

        public String runs() {
            return this.runs;
        }

        public Integer xCoordinate() {
            return this.xCoordinate;
        }

        public Integer yCoordinate() {
            return this.yCoordinate;
        }

        public String zad() {
            return this.zad;
        }

        public Boolean wicket() {
            return this.wicket;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(HighlightBall.$responseFields[0], HighlightBall.this.__typename);
                    responseWriter.writeString(HighlightBall.$responseFields[1], HighlightBall.this.matchID);
                    responseWriter.writeString(HighlightBall.$responseFields[2], HighlightBall.this.ballID);
                    responseWriter.writeString(HighlightBall.$responseFields[3], HighlightBall.this.ballNumber);
                    responseWriter.writeString(HighlightBall.$responseFields[4], HighlightBall.this.innings);
                    responseWriter.writeString(HighlightBall.$responseFields[5], HighlightBall.this.over);
                    responseWriter.writeString(HighlightBall.$responseFields[6], HighlightBall.this.overNumber);
                    responseWriter.writeString(HighlightBall.$responseFields[7], HighlightBall.this.commentary);
                    responseWriter.writeString(HighlightBall.$responseFields[8], HighlightBall.this.teamID);
                    responseWriter.writeString(HighlightBall.$responseFields[9], HighlightBall.this.teamName);
                    responseWriter.writeString(HighlightBall.$responseFields[10], HighlightBall.this.runs);
                    responseWriter.writeInt(HighlightBall.$responseFields[11], HighlightBall.this.xCoordinate);
                    responseWriter.writeInt(HighlightBall.$responseFields[12], HighlightBall.this.yCoordinate);
                    responseWriter.writeString(HighlightBall.$responseFields[13], HighlightBall.this.zad);
                    responseWriter.writeBoolean(HighlightBall.$responseFields[14], HighlightBall.this.wicket);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "HighlightBall{__typename=" + this.__typename + ", matchID=" + this.matchID + ", ballID=" + this.ballID + ", ballNumber=" + this.ballNumber + ", innings=" + this.innings + ", over=" + this.over + ", overNumber=" + this.overNumber + ", commentary=" + this.commentary + ", teamID=" + this.teamID + ", teamName=" + this.teamName + ", runs=" + this.runs + ", xCoordinate=" + this.xCoordinate + ", yCoordinate=" + this.yCoordinate + ", zad=" + this.zad + ", wicket=" + this.wicket + "}";
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
            Integer num;
            Integer num2;
            String str11;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HighlightBall)) {
                return false;
            }
            HighlightBall highlightBall = (HighlightBall) obj;
            if (this.__typename.equals(highlightBall.__typename) && ((str = this.matchID) != null ? str.equals(highlightBall.matchID) : highlightBall.matchID == null) && ((str2 = this.ballID) != null ? str2.equals(highlightBall.ballID) : highlightBall.ballID == null) && ((str3 = this.ballNumber) != null ? str3.equals(highlightBall.ballNumber) : highlightBall.ballNumber == null) && ((str4 = this.innings) != null ? str4.equals(highlightBall.innings) : highlightBall.innings == null) && ((str5 = this.over) != null ? str5.equals(highlightBall.over) : highlightBall.over == null) && ((str6 = this.overNumber) != null ? str6.equals(highlightBall.overNumber) : highlightBall.overNumber == null) && ((str7 = this.commentary) != null ? str7.equals(highlightBall.commentary) : highlightBall.commentary == null) && ((str8 = this.teamID) != null ? str8.equals(highlightBall.teamID) : highlightBall.teamID == null) && ((str9 = this.teamName) != null ? str9.equals(highlightBall.teamName) : highlightBall.teamName == null) && ((str10 = this.runs) != null ? str10.equals(highlightBall.runs) : highlightBall.runs == null) && ((num = this.xCoordinate) != null ? num.equals(highlightBall.xCoordinate) : highlightBall.xCoordinate == null) && ((num2 = this.yCoordinate) != null ? num2.equals(highlightBall.yCoordinate) : highlightBall.yCoordinate == null) && ((str11 = this.zad) != null ? str11.equals(highlightBall.zad) : highlightBall.zad == null)) {
                Boolean bool = this.wicket;
                Boolean bool2 = highlightBall.wicket;
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
                String str2 = this.ballID;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.ballNumber;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.innings;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.over;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.overNumber;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.commentary;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.teamID;
                int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.teamName;
                int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.runs;
                int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                Integer num = this.xCoordinate;
                int hashCode12 = (hashCode11 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.yCoordinate;
                int hashCode13 = (hashCode12 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                String str11 = this.zad;
                int hashCode14 = (hashCode13 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                Boolean bool = this.wicket;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode14 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<HighlightBall> {
            @Override 
            public HighlightBall map(ResponseReader responseReader) {
                return new HighlightBall(responseReader.readString(HighlightBall.$responseFields[0]), responseReader.readString(HighlightBall.$responseFields[1]), responseReader.readString(HighlightBall.$responseFields[2]), responseReader.readString(HighlightBall.$responseFields[3]), responseReader.readString(HighlightBall.$responseFields[4]), responseReader.readString(HighlightBall.$responseFields[5]), responseReader.readString(HighlightBall.$responseFields[6]), responseReader.readString(HighlightBall.$responseFields[7]), responseReader.readString(HighlightBall.$responseFields[8]), responseReader.readString(HighlightBall.$responseFields[9]), responseReader.readString(HighlightBall.$responseFields[10]), responseReader.readInt(HighlightBall.$responseFields[11]), responseReader.readInt(HighlightBall.$responseFields[12]), responseReader.readString(HighlightBall.$responseFields[13]), responseReader.readBoolean(HighlightBall.$responseFields[14]));
            }
        }
    }

    public static class TotalCount {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("totalFours", "totalFours", null, true, Collections.emptyList()), ResponseField.forInt("totalSix", "totalSix", null, true, Collections.emptyList()), ResponseField.forInt("totalWickets", "totalWickets", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer totalFours;
        final Integer totalSix;
        final Integer totalWickets;

        public TotalCount(String str, Integer num, Integer num2, Integer num3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.totalFours = num;
            this.totalSix = num2;
            this.totalWickets = num3;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer totalFours() {
            return this.totalFours;
        }

        public Integer totalSix() {
            return this.totalSix;
        }

        public Integer totalWickets() {
            return this.totalWickets;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TotalCount.$responseFields[0], TotalCount.this.__typename);
                    responseWriter.writeInt(TotalCount.$responseFields[1], TotalCount.this.totalFours);
                    responseWriter.writeInt(TotalCount.$responseFields[2], TotalCount.this.totalSix);
                    responseWriter.writeInt(TotalCount.$responseFields[3], TotalCount.this.totalWickets);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TotalCount{__typename=" + this.__typename + ", totalFours=" + this.totalFours + ", totalSix=" + this.totalSix + ", totalWickets=" + this.totalWickets + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TotalCount)) {
                return false;
            }
            TotalCount totalCount = (TotalCount) obj;
            if (this.__typename.equals(totalCount.__typename) && ((num = this.totalFours) != null ? num.equals(totalCount.totalFours) : totalCount.totalFours == null) && ((num2 = this.totalSix) != null ? num2.equals(totalCount.totalSix) : totalCount.totalSix == null)) {
                Integer num3 = this.totalWickets;
                Integer num4 = totalCount.totalWickets;
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
                Integer num = this.totalFours;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.totalSix;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.totalWickets;
                if (num3 != null) {
                    i = num3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TotalCount> {
            @Override 
            public TotalCount map(ResponseReader responseReader) {
                return new TotalCount(responseReader.readString(TotalCount.$responseFields[0]), responseReader.readInt(TotalCount.$responseFields[1]), responseReader.readInt(TotalCount.$responseFields[2]), responseReader.readInt(TotalCount.$responseFields[3]));
            }
        }
    }
}
