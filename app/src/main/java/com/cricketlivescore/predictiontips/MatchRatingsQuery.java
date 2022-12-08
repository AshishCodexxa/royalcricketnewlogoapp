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

public final class MatchRatingsQuery implements Query<MatchRatingsQuery.Data, MatchRatingsQuery.Data, MatchRatingsQuery.Variables> {
    public static final String OPERATION_ID = "d7252c7e51e4a9c477586c71d30c8043f3410adbc2736f0962ef523b96d7db87";
    public static final OperationName OPERATION_NAME = new OperationName() {

       @Override
        public String name() {
            return "matchRatings";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query matchRatings($matchID: String!) {\n  matchRatings(matchID: $matchID) {\n    __typename\n    finalArray {\n      __typename\n      playerID\n      playerName\n      playerTeamID\n      playerTeamName\n      battingPoints\n      bowlingPoints\n      totalPoints\n    }\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public MatchRatingsQuery(String str) {
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

        public MatchRatingsQuery build() {
            Utils.checkNotNull(this.matchID, "matchID == null");
            return new MatchRatingsQuery(this.matchID);
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("matchRatings", "matchRatings", new UnmodifiableMapBuilder(1).put("matchID", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "matchID").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final MatchRatings matchRatings;

        public Data(MatchRatings matchRatings2) {
            this.matchRatings = matchRatings2;
        }

        public MatchRatings matchRatings() {
            return this.matchRatings;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.matchRatings != null ? Data.this.matchRatings.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{matchRatings=" + this.matchRatings + "}";
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
            MatchRatings matchRatings2 = this.matchRatings;
            MatchRatings matchRatings3 = ((Data) obj).matchRatings;
            if (matchRatings2 != null) {
                return matchRatings2.equals(matchRatings3);
            }
            if (matchRatings3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                MatchRatings matchRatings2 = this.matchRatings;
                this.$hashCode = 1000003 ^ (matchRatings2 == null ? 0 : matchRatings2.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final MatchRatings.Mapper matchRatingsFieldMapper = new MatchRatings.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((MatchRatings) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<MatchRatings>() {


                    @Override 
                    public MatchRatings read(ResponseReader responseReader) {
                        return Mapper.this.matchRatingsFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class MatchRatings {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("finalArray", "finalArray", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<FinalArray> finalArray;

        public MatchRatings(String str, List<FinalArray> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.finalArray = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<FinalArray> finalArray() {
            return this.finalArray;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(MatchRatings.$responseFields[0], MatchRatings.this.__typename);
                    responseWriter.writeList(MatchRatings.$responseFields[1], MatchRatings.this.finalArray, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((FinalArray) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "MatchRatings{__typename=" + this.__typename + ", finalArray=" + this.finalArray + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MatchRatings)) {
                return false;
            }
            MatchRatings matchRatings = (MatchRatings) obj;
            if (this.__typename.equals(matchRatings.__typename)) {
                List<FinalArray> list = this.finalArray;
                List<FinalArray> list2 = matchRatings.finalArray;
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
                List<FinalArray> list = this.finalArray;
                this.$hashCode = hashCode ^ (list == null ? 0 : list.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<MatchRatings> {
            final FinalArray.Mapper finalArrayFieldMapper = new FinalArray.Mapper();

            @Override 
            public MatchRatings map(ResponseReader responseReader) {
                return new MatchRatings(responseReader.readString(MatchRatings.$responseFields[0]), responseReader.readList(MatchRatings.$responseFields[1], new ResponseReader.ListReader<FinalArray>() {


                    @Override 
                    public FinalArray read(ResponseReader.ListItemReader listItemReader) {
                        return (FinalArray) listItemReader.readObject(new ResponseReader.ObjectReader<FinalArray>() {


                            @Override 
                            public FinalArray read(ResponseReader responseReader) {
                                return Mapper.this.finalArrayFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class FinalArray {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerTeamID", "playerTeamID", null, true, Collections.emptyList()), ResponseField.forString("playerTeamName", "playerTeamName", null, true, Collections.emptyList()), ResponseField.forString("battingPoints", "battingPoints", null, true, Collections.emptyList()), ResponseField.forString("bowlingPoints", "bowlingPoints", null, true, Collections.emptyList()), ResponseField.forString("totalPoints", "totalPoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String battingPoints;
        final String bowlingPoints;
        final String playerID;
        final String playerName;
        final String playerTeamID;
        final String playerTeamName;
        final String totalPoints;

        public FinalArray(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerName = str3;
            this.playerTeamID = str4;
            this.playerTeamName = str5;
            this.battingPoints = str6;
            this.bowlingPoints = str7;
            this.totalPoints = str8;
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

        public String playerTeamID() {
            return this.playerTeamID;
        }

        public String playerTeamName() {
            return this.playerTeamName;
        }

        public String battingPoints() {
            return this.battingPoints;
        }

        public String bowlingPoints() {
            return this.bowlingPoints;
        }

        public String totalPoints() {
            return this.totalPoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(FinalArray.$responseFields[0], FinalArray.this.__typename);
                    responseWriter.writeString(FinalArray.$responseFields[1], FinalArray.this.playerID);
                    responseWriter.writeString(FinalArray.$responseFields[2], FinalArray.this.playerName);
                    responseWriter.writeString(FinalArray.$responseFields[3], FinalArray.this.playerTeamID);
                    responseWriter.writeString(FinalArray.$responseFields[4], FinalArray.this.playerTeamName);
                    responseWriter.writeString(FinalArray.$responseFields[5], FinalArray.this.battingPoints);
                    responseWriter.writeString(FinalArray.$responseFields[6], FinalArray.this.bowlingPoints);
                    responseWriter.writeString(FinalArray.$responseFields[7], FinalArray.this.totalPoints);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FinalArray{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerTeamID=" + this.playerTeamID + ", playerTeamName=" + this.playerTeamName + ", battingPoints=" + this.battingPoints + ", bowlingPoints=" + this.bowlingPoints + ", totalPoints=" + this.totalPoints + "}";
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
            if (!(obj instanceof FinalArray)) {
                return false;
            }
            FinalArray finalArray = (FinalArray) obj;
            if (this.__typename.equals(finalArray.__typename) && ((str = this.playerID) != null ? str.equals(finalArray.playerID) : finalArray.playerID == null) && ((str2 = this.playerName) != null ? str2.equals(finalArray.playerName) : finalArray.playerName == null) && ((str3 = this.playerTeamID) != null ? str3.equals(finalArray.playerTeamID) : finalArray.playerTeamID == null) && ((str4 = this.playerTeamName) != null ? str4.equals(finalArray.playerTeamName) : finalArray.playerTeamName == null) && ((str5 = this.battingPoints) != null ? str5.equals(finalArray.battingPoints) : finalArray.battingPoints == null) && ((str6 = this.bowlingPoints) != null ? str6.equals(finalArray.bowlingPoints) : finalArray.bowlingPoints == null)) {
                String str7 = this.totalPoints;
                String str8 = finalArray.totalPoints;
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
                String str3 = this.playerTeamID;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerTeamName;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.battingPoints;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.bowlingPoints;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.totalPoints;
                if (str7 != null) {
                    i = str7.hashCode();
                }
                this.$hashCode = hashCode7 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<FinalArray> {
            @Override 
            public FinalArray map(ResponseReader responseReader) {
                return new FinalArray(responseReader.readString(FinalArray.$responseFields[0]), responseReader.readString(FinalArray.$responseFields[1]), responseReader.readString(FinalArray.$responseFields[2]), responseReader.readString(FinalArray.$responseFields[3]), responseReader.readString(FinalArray.$responseFields[4]), responseReader.readString(FinalArray.$responseFields[5]), responseReader.readString(FinalArray.$responseFields[6]), responseReader.readString(FinalArray.$responseFields[7]));
            }
        }
    }
}
