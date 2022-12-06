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

public final class GetMatchInfoQuery implements Query<GetMatchInfoQuery.Data, GetMatchInfoQuery.Data, GetMatchInfoQuery.Variables> {
    public static final String OPERATION_ID = "ddbb4324a711c47e8a6a6c65f8a38fe6bf79d4366e3a6f985611655c3f835254";
    public static final OperationName OPERATION_NAME = new OperationName() {

       @Override
        public String name() {
            return "getMatchInfo";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query getMatchInfo($matchID: String) {\n  getMatchInfo(matchID: $matchID) {\n    __typename\n    seriesName\n    date\n    matchInfoType\n    matchOrder\n    toss\n    venue\n    venueID\n    umpires\n    thirdUmpire\n    matchReferee\n    homeTeamName\n    awayTeamName\n    homeTeamID\n    awayTeamID\n    homeTeamShortName\n    awayTeamShortName\n    homePlayingXI {\n      __typename\n      playerID\n      playerRole\n      playerClubName\n      playerName\n      playerImage\n      captain\n      keeper\n    }\n    awayPlayingXI {\n      __typename\n      playerID\n      playerRole\n      playerClubName\n      playerName\n      playerImage\n      captain\n      keeper\n    }\n    seriesID\n    type\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public GetMatchInfoQuery(Input<String> input) {
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

        public GetMatchInfoQuery build() {
            return new GetMatchInfoQuery(this.matchID);
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("getMatchInfo", "getMatchInfo", new UnmodifiableMapBuilder(1).put("matchID", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "matchID").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final GetMatchInfo getMatchInfo;

        public Data(GetMatchInfo getMatchInfo2) {
            this.getMatchInfo = getMatchInfo2;
        }

        public GetMatchInfo getMatchInfo() {
            return this.getMatchInfo;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.getMatchInfo != null ? Data.this.getMatchInfo.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getMatchInfo=" + this.getMatchInfo + "}";
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
            GetMatchInfo getMatchInfo2 = this.getMatchInfo;
            GetMatchInfo getMatchInfo3 = ((Data) obj).getMatchInfo;
            if (getMatchInfo2 != null) {
                return getMatchInfo2.equals(getMatchInfo3);
            }
            if (getMatchInfo3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetMatchInfo getMatchInfo2 = this.getMatchInfo;
                this.$hashCode = 1000003 ^ (getMatchInfo2 == null ? 0 : getMatchInfo2.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetMatchInfo.Mapper getMatchInfoFieldMapper = new GetMatchInfo.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((GetMatchInfo) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetMatchInfo>() {


                    @Override 
                    public GetMatchInfo read(ResponseReader responseReader) {
                        return Mapper.this.getMatchInfoFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class GetMatchInfo {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("seriesName", "seriesName", null, true, Collections.emptyList()), ResponseField.forString("date", "date", null, true, Collections.emptyList()), ResponseField.forString("matchInfoType", "matchInfoType", null, true, Collections.emptyList()), ResponseField.forString("matchOrder", "matchOrder", null, true, Collections.emptyList()), ResponseField.forString("toss", "toss", null, true, Collections.emptyList()), ResponseField.forString("venue", "venue", null, true, Collections.emptyList()), ResponseField.forString("venueID", "venueID", null, true, Collections.emptyList()), ResponseField.forString("umpires", "umpires", null, true, Collections.emptyList()), ResponseField.forString("thirdUmpire", "thirdUmpire", null, true, Collections.emptyList()), ResponseField.forString("matchReferee", "matchReferee", null, true, Collections.emptyList()), ResponseField.forString("homeTeamName", "homeTeamName", null, true, Collections.emptyList()), ResponseField.forString("awayTeamName", "awayTeamName", null, true, Collections.emptyList()), ResponseField.forString("homeTeamID", "homeTeamID", null, true, Collections.emptyList()), ResponseField.forString("awayTeamID", "awayTeamID", null, true, Collections.emptyList()), ResponseField.forString("homeTeamShortName", "homeTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("awayTeamShortName", "awayTeamShortName", null, true, Collections.emptyList()), ResponseField.forList("homePlayingXI", "homePlayingXI", null, true, Collections.emptyList()), ResponseField.forList("awayPlayingXI", "awayPlayingXI", null, true, Collections.emptyList()), ResponseField.forString("seriesID", "seriesID", null, true, Collections.emptyList()), ResponseField.forString("type", "type", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<AwayPlayingXI> awayPlayingXI;
        final String awayTeamID;
        final String awayTeamName;
        final String awayTeamShortName;
        final String date;
        final List<HomePlayingXI> homePlayingXI;
        final String homeTeamID;
        final String homeTeamName;
        final String homeTeamShortName;
        final String matchInfoType;
        final String matchOrder;
        final String matchReferee;
        final String seriesID;
        final String seriesName;
        final String thirdUmpire;
        final String toss;
        final String type;
        final String umpires;
        final String venue;
        final String venueID;

        public GetMatchInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, List<HomePlayingXI> list, List<AwayPlayingXI> list2, String str18, String str19) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.seriesName = str2;
            this.date = str3;
            this.matchInfoType = str4;
            this.matchOrder = str5;
            this.toss = str6;
            this.venue = str7;
            this.venueID = str8;
            this.umpires = str9;
            this.thirdUmpire = str10;
            this.matchReferee = str11;
            this.homeTeamName = str12;
            this.awayTeamName = str13;
            this.homeTeamID = str14;
            this.awayTeamID = str15;
            this.homeTeamShortName = str16;
            this.awayTeamShortName = str17;
            this.homePlayingXI = list;
            this.awayPlayingXI = list2;
            this.seriesID = str18;
            this.type = str19;
        }

        public String __typename() {
            return this.__typename;
        }

        public String seriesName() {
            return this.seriesName;
        }

        public String date() {
            return this.date;
        }

        public String matchInfoType() {
            return this.matchInfoType;
        }

        public String matchOrder() {
            return this.matchOrder;
        }

        public String toss() {
            return this.toss;
        }

        public String venue() {
            return this.venue;
        }

        public String venueID() {
            return this.venueID;
        }

        public String umpires() {
            return this.umpires;
        }

        public String thirdUmpire() {
            return this.thirdUmpire;
        }

        public String matchReferee() {
            return this.matchReferee;
        }

        public String homeTeamName() {
            return this.homeTeamName;
        }

        public String awayTeamName() {
            return this.awayTeamName;
        }

        public String homeTeamID() {
            return this.homeTeamID;
        }

        public String awayTeamID() {
            return this.awayTeamID;
        }

        public String homeTeamShortName() {
            return this.homeTeamShortName;
        }

        public String awayTeamShortName() {
            return this.awayTeamShortName;
        }

        public List<HomePlayingXI> homePlayingXI() {
            return this.homePlayingXI;
        }

        public List<AwayPlayingXI> awayPlayingXI() {
            return this.awayPlayingXI;
        }

        public String seriesID() {
            return this.seriesID;
        }

        public String type() {
            return this.type;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(GetMatchInfo.$responseFields[0], GetMatchInfo.this.__typename);
                    responseWriter.writeString(GetMatchInfo.$responseFields[1], GetMatchInfo.this.seriesName);
                    responseWriter.writeString(GetMatchInfo.$responseFields[2], GetMatchInfo.this.date);
                    responseWriter.writeString(GetMatchInfo.$responseFields[3], GetMatchInfo.this.matchInfoType);
                    responseWriter.writeString(GetMatchInfo.$responseFields[4], GetMatchInfo.this.matchOrder);
                    responseWriter.writeString(GetMatchInfo.$responseFields[5], GetMatchInfo.this.toss);
                    responseWriter.writeString(GetMatchInfo.$responseFields[6], GetMatchInfo.this.venue);
                    responseWriter.writeString(GetMatchInfo.$responseFields[7], GetMatchInfo.this.venueID);
                    responseWriter.writeString(GetMatchInfo.$responseFields[8], GetMatchInfo.this.umpires);
                    responseWriter.writeString(GetMatchInfo.$responseFields[9], GetMatchInfo.this.thirdUmpire);
                    responseWriter.writeString(GetMatchInfo.$responseFields[10], GetMatchInfo.this.matchReferee);
                    responseWriter.writeString(GetMatchInfo.$responseFields[11], GetMatchInfo.this.homeTeamName);
                    responseWriter.writeString(GetMatchInfo.$responseFields[12], GetMatchInfo.this.awayTeamName);
                    responseWriter.writeString(GetMatchInfo.$responseFields[13], GetMatchInfo.this.homeTeamID);
                    responseWriter.writeString(GetMatchInfo.$responseFields[14], GetMatchInfo.this.awayTeamID);
                    responseWriter.writeString(GetMatchInfo.$responseFields[15], GetMatchInfo.this.homeTeamShortName);
                    responseWriter.writeString(GetMatchInfo.$responseFields[16], GetMatchInfo.this.awayTeamShortName);
                    responseWriter.writeList(GetMatchInfo.$responseFields[17], GetMatchInfo.this.homePlayingXI, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((HomePlayingXI) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(GetMatchInfo.$responseFields[18], GetMatchInfo.this.awayPlayingXI, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((AwayPlayingXI) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeString(GetMatchInfo.$responseFields[19], GetMatchInfo.this.seriesID);
                    responseWriter.writeString(GetMatchInfo.$responseFields[20], GetMatchInfo.this.type);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetMatchInfo{__typename=" + this.__typename + ", seriesName=" + this.seriesName + ", date=" + this.date + ", matchInfoType=" + this.matchInfoType + ", matchOrder=" + this.matchOrder + ", toss=" + this.toss + ", venue=" + this.venue + ", venueID=" + this.venueID + ", umpires=" + this.umpires + ", thirdUmpire=" + this.thirdUmpire + ", matchReferee=" + this.matchReferee + ", homeTeamName=" + this.homeTeamName + ", awayTeamName=" + this.awayTeamName + ", homeTeamID=" + this.homeTeamID + ", awayTeamID=" + this.awayTeamID + ", homeTeamShortName=" + this.homeTeamShortName + ", awayTeamShortName=" + this.awayTeamShortName + ", homePlayingXI=" + this.homePlayingXI + ", awayPlayingXI=" + this.awayPlayingXI + ", seriesID=" + this.seriesID + ", type=" + this.type + "}";
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
            String str12;
            String str13;
            String str14;
            String str15;
            String str16;
            List<HomePlayingXI> list;
            List<AwayPlayingXI> list2;
            String str17;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetMatchInfo)) {
                return false;
            }
            GetMatchInfo getMatchInfo = (GetMatchInfo) obj;
            if (this.__typename.equals(getMatchInfo.__typename) && ((str = this.seriesName) != null ? str.equals(getMatchInfo.seriesName) : getMatchInfo.seriesName == null) && ((str2 = this.date) != null ? str2.equals(getMatchInfo.date) : getMatchInfo.date == null) && ((str3 = this.matchInfoType) != null ? str3.equals(getMatchInfo.matchInfoType) : getMatchInfo.matchInfoType == null) && ((str4 = this.matchOrder) != null ? str4.equals(getMatchInfo.matchOrder) : getMatchInfo.matchOrder == null) && ((str5 = this.toss) != null ? str5.equals(getMatchInfo.toss) : getMatchInfo.toss == null) && ((str6 = this.venue) != null ? str6.equals(getMatchInfo.venue) : getMatchInfo.venue == null) && ((str7 = this.venueID) != null ? str7.equals(getMatchInfo.venueID) : getMatchInfo.venueID == null) && ((str8 = this.umpires) != null ? str8.equals(getMatchInfo.umpires) : getMatchInfo.umpires == null) && ((str9 = this.thirdUmpire) != null ? str9.equals(getMatchInfo.thirdUmpire) : getMatchInfo.thirdUmpire == null) && ((str10 = this.matchReferee) != null ? str10.equals(getMatchInfo.matchReferee) : getMatchInfo.matchReferee == null) && ((str11 = this.homeTeamName) != null ? str11.equals(getMatchInfo.homeTeamName) : getMatchInfo.homeTeamName == null) && ((str12 = this.awayTeamName) != null ? str12.equals(getMatchInfo.awayTeamName) : getMatchInfo.awayTeamName == null) && ((str13 = this.homeTeamID) != null ? str13.equals(getMatchInfo.homeTeamID) : getMatchInfo.homeTeamID == null) && ((str14 = this.awayTeamID) != null ? str14.equals(getMatchInfo.awayTeamID) : getMatchInfo.awayTeamID == null) && ((str15 = this.homeTeamShortName) != null ? str15.equals(getMatchInfo.homeTeamShortName) : getMatchInfo.homeTeamShortName == null) && ((str16 = this.awayTeamShortName) != null ? str16.equals(getMatchInfo.awayTeamShortName) : getMatchInfo.awayTeamShortName == null) && ((list = this.homePlayingXI) != null ? list.equals(getMatchInfo.homePlayingXI) : getMatchInfo.homePlayingXI == null) && ((list2 = this.awayPlayingXI) != null ? list2.equals(getMatchInfo.awayPlayingXI) : getMatchInfo.awayPlayingXI == null) && ((str17 = this.seriesID) != null ? str17.equals(getMatchInfo.seriesID) : getMatchInfo.seriesID == null)) {
                String str18 = this.type;
                String str19 = getMatchInfo.type;
                if (str18 == null) {
                    if (str19 == null) {
                        return true;
                    }
                } else if (str18.equals(str19)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.seriesName;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.date;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.matchInfoType;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.matchOrder;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.toss;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.venue;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.venueID;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.umpires;
                int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.thirdUmpire;
                int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.matchReferee;
                int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.homeTeamName;
                int hashCode12 = (hashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.awayTeamName;
                int hashCode13 = (hashCode12 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.homeTeamID;
                int hashCode14 = (hashCode13 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.awayTeamID;
                int hashCode15 = (hashCode14 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.homeTeamShortName;
                int hashCode16 = (hashCode15 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.awayTeamShortName;
                int hashCode17 = (hashCode16 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                List<HomePlayingXI> list = this.homePlayingXI;
                int hashCode18 = (hashCode17 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<AwayPlayingXI> list2 = this.awayPlayingXI;
                int hashCode19 = (hashCode18 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                String str17 = this.seriesID;
                int hashCode20 = (hashCode19 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.type;
                if (str18 != null) {
                    i = str18.hashCode();
                }
                this.$hashCode = hashCode20 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<GetMatchInfo> {
            final AwayPlayingXI.Mapper awayPlayingXIFieldMapper = new AwayPlayingXI.Mapper();
            final HomePlayingXI.Mapper homePlayingXIFieldMapper = new HomePlayingXI.Mapper();

            @Override 
            public GetMatchInfo map(ResponseReader responseReader) {
                return new GetMatchInfo(responseReader.readString(GetMatchInfo.$responseFields[0]), responseReader.readString(GetMatchInfo.$responseFields[1]), responseReader.readString(GetMatchInfo.$responseFields[2]), responseReader.readString(GetMatchInfo.$responseFields[3]), responseReader.readString(GetMatchInfo.$responseFields[4]), responseReader.readString(GetMatchInfo.$responseFields[5]), responseReader.readString(GetMatchInfo.$responseFields[6]), responseReader.readString(GetMatchInfo.$responseFields[7]), responseReader.readString(GetMatchInfo.$responseFields[8]), responseReader.readString(GetMatchInfo.$responseFields[9]), responseReader.readString(GetMatchInfo.$responseFields[10]), responseReader.readString(GetMatchInfo.$responseFields[11]), responseReader.readString(GetMatchInfo.$responseFields[12]), responseReader.readString(GetMatchInfo.$responseFields[13]), responseReader.readString(GetMatchInfo.$responseFields[14]), responseReader.readString(GetMatchInfo.$responseFields[15]), responseReader.readString(GetMatchInfo.$responseFields[16]), responseReader.readList(GetMatchInfo.$responseFields[17], new ResponseReader.ListReader<HomePlayingXI>() {


                    @Override 
                    public HomePlayingXI read(ResponseReader.ListItemReader listItemReader) {
                        return (HomePlayingXI) listItemReader.readObject(new ResponseReader.ObjectReader<HomePlayingXI>() {


                            @Override 
                            public HomePlayingXI read(ResponseReader responseReader) {
                                return Mapper.this.homePlayingXIFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(GetMatchInfo.$responseFields[18], new ResponseReader.ListReader<AwayPlayingXI>() {


                    @Override 
                    public AwayPlayingXI read(ResponseReader.ListItemReader listItemReader) {
                        return (AwayPlayingXI) listItemReader.readObject(new ResponseReader.ObjectReader<AwayPlayingXI>() {


                            @Override 
                            public AwayPlayingXI read(ResponseReader responseReader) {
                                return Mapper.this.awayPlayingXIFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readString(GetMatchInfo.$responseFields[19]), responseReader.readString(GetMatchInfo.$responseFields[20]));
            }
        }
    }

    public static class HomePlayingXI {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerRole", "playerRole", null, true, Collections.emptyList()), ResponseField.forString("playerClubName", "playerClubName", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerImage", "playerImage", null, true, Collections.emptyList()), ResponseField.forBoolean("captain", "captain", null, true, Collections.emptyList()), ResponseField.forBoolean("keeper", "keeper", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Boolean captain;
        final Boolean keeper;
        final String playerClubName;
        final String playerID;
        final String playerImage;
        final String playerName;
        final String playerRole;

        public HomePlayingXI(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerRole = str3;
            this.playerClubName = str4;
            this.playerName = str5;
            this.playerImage = str6;
            this.captain = bool;
            this.keeper = bool2;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerID() {
            return this.playerID;
        }

        public String playerRole() {
            return this.playerRole;
        }

        public String playerClubName() {
            return this.playerClubName;
        }

        public String playerName() {
            return this.playerName;
        }

        public String playerImage() {
            return this.playerImage;
        }

        public Boolean captain() {
            return this.captain;
        }

        public Boolean keeper() {
            return this.keeper;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(HomePlayingXI.$responseFields[0], HomePlayingXI.this.__typename);
                    responseWriter.writeString(HomePlayingXI.$responseFields[1], HomePlayingXI.this.playerID);
                    responseWriter.writeString(HomePlayingXI.$responseFields[2], HomePlayingXI.this.playerRole);
                    responseWriter.writeString(HomePlayingXI.$responseFields[3], HomePlayingXI.this.playerClubName);
                    responseWriter.writeString(HomePlayingXI.$responseFields[4], HomePlayingXI.this.playerName);
                    responseWriter.writeString(HomePlayingXI.$responseFields[5], HomePlayingXI.this.playerImage);
                    responseWriter.writeBoolean(HomePlayingXI.$responseFields[6], HomePlayingXI.this.captain);
                    responseWriter.writeBoolean(HomePlayingXI.$responseFields[7], HomePlayingXI.this.keeper);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "HomePlayingXI{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerRole=" + this.playerRole + ", playerClubName=" + this.playerClubName + ", playerName=" + this.playerName + ", playerImage=" + this.playerImage + ", captain=" + this.captain + ", keeper=" + this.keeper + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Boolean bool;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomePlayingXI)) {
                return false;
            }
            HomePlayingXI homePlayingXI = (HomePlayingXI) obj;
            if (this.__typename.equals(homePlayingXI.__typename) && ((str = this.playerID) != null ? str.equals(homePlayingXI.playerID) : homePlayingXI.playerID == null) && ((str2 = this.playerRole) != null ? str2.equals(homePlayingXI.playerRole) : homePlayingXI.playerRole == null) && ((str3 = this.playerClubName) != null ? str3.equals(homePlayingXI.playerClubName) : homePlayingXI.playerClubName == null) && ((str4 = this.playerName) != null ? str4.equals(homePlayingXI.playerName) : homePlayingXI.playerName == null) && ((str5 = this.playerImage) != null ? str5.equals(homePlayingXI.playerImage) : homePlayingXI.playerImage == null) && ((bool = this.captain) != null ? bool.equals(homePlayingXI.captain) : homePlayingXI.captain == null)) {
                Boolean bool2 = this.keeper;
                Boolean bool3 = homePlayingXI.keeper;
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
                String str = this.playerID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerRole;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerClubName;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerName;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerImage;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Boolean bool = this.captain;
                int hashCode7 = (hashCode6 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.keeper;
                if (bool2 != null) {
                    i = bool2.hashCode();
                }
                this.$hashCode = hashCode7 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<HomePlayingXI> {
            @Override 
            public HomePlayingXI map(ResponseReader responseReader) {
                return new HomePlayingXI(responseReader.readString(HomePlayingXI.$responseFields[0]), responseReader.readString(HomePlayingXI.$responseFields[1]), responseReader.readString(HomePlayingXI.$responseFields[2]), responseReader.readString(HomePlayingXI.$responseFields[3]), responseReader.readString(HomePlayingXI.$responseFields[4]), responseReader.readString(HomePlayingXI.$responseFields[5]), responseReader.readBoolean(HomePlayingXI.$responseFields[6]), responseReader.readBoolean(HomePlayingXI.$responseFields[7]));
            }
        }
    }

    public static class AwayPlayingXI {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerRole", "playerRole", null, true, Collections.emptyList()), ResponseField.forString("playerClubName", "playerClubName", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerImage", "playerImage", null, true, Collections.emptyList()), ResponseField.forBoolean("captain", "captain", null, true, Collections.emptyList()), ResponseField.forBoolean("keeper", "keeper", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Boolean captain;
        final Boolean keeper;
        final String playerClubName;
        final String playerID;
        final String playerImage;
        final String playerName;
        final String playerRole;

        public AwayPlayingXI(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerRole = str3;
            this.playerClubName = str4;
            this.playerName = str5;
            this.playerImage = str6;
            this.captain = bool;
            this.keeper = bool2;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerID() {
            return this.playerID;
        }

        public String playerRole() {
            return this.playerRole;
        }

        public String playerClubName() {
            return this.playerClubName;
        }

        public String playerName() {
            return this.playerName;
        }

        public String playerImage() {
            return this.playerImage;
        }

        public Boolean captain() {
            return this.captain;
        }

        public Boolean keeper() {
            return this.keeper;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(AwayPlayingXI.$responseFields[0], AwayPlayingXI.this.__typename);
                    responseWriter.writeString(AwayPlayingXI.$responseFields[1], AwayPlayingXI.this.playerID);
                    responseWriter.writeString(AwayPlayingXI.$responseFields[2], AwayPlayingXI.this.playerRole);
                    responseWriter.writeString(AwayPlayingXI.$responseFields[3], AwayPlayingXI.this.playerClubName);
                    responseWriter.writeString(AwayPlayingXI.$responseFields[4], AwayPlayingXI.this.playerName);
                    responseWriter.writeString(AwayPlayingXI.$responseFields[5], AwayPlayingXI.this.playerImage);
                    responseWriter.writeBoolean(AwayPlayingXI.$responseFields[6], AwayPlayingXI.this.captain);
                    responseWriter.writeBoolean(AwayPlayingXI.$responseFields[7], AwayPlayingXI.this.keeper);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "AwayPlayingXI{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerRole=" + this.playerRole + ", playerClubName=" + this.playerClubName + ", playerName=" + this.playerName + ", playerImage=" + this.playerImage + ", captain=" + this.captain + ", keeper=" + this.keeper + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Boolean bool;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AwayPlayingXI)) {
                return false;
            }
            AwayPlayingXI awayPlayingXI = (AwayPlayingXI) obj;
            if (this.__typename.equals(awayPlayingXI.__typename) && ((str = this.playerID) != null ? str.equals(awayPlayingXI.playerID) : awayPlayingXI.playerID == null) && ((str2 = this.playerRole) != null ? str2.equals(awayPlayingXI.playerRole) : awayPlayingXI.playerRole == null) && ((str3 = this.playerClubName) != null ? str3.equals(awayPlayingXI.playerClubName) : awayPlayingXI.playerClubName == null) && ((str4 = this.playerName) != null ? str4.equals(awayPlayingXI.playerName) : awayPlayingXI.playerName == null) && ((str5 = this.playerImage) != null ? str5.equals(awayPlayingXI.playerImage) : awayPlayingXI.playerImage == null) && ((bool = this.captain) != null ? bool.equals(awayPlayingXI.captain) : awayPlayingXI.captain == null)) {
                Boolean bool2 = this.keeper;
                Boolean bool3 = awayPlayingXI.keeper;
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
                String str = this.playerID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerRole;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerClubName;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerName;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerImage;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Boolean bool = this.captain;
                int hashCode7 = (hashCode6 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.keeper;
                if (bool2 != null) {
                    i = bool2.hashCode();
                }
                this.$hashCode = hashCode7 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<AwayPlayingXI> {
            @Override 
            public AwayPlayingXI map(ResponseReader responseReader) {
                return new AwayPlayingXI(responseReader.readString(AwayPlayingXI.$responseFields[0]), responseReader.readString(AwayPlayingXI.$responseFields[1]), responseReader.readString(AwayPlayingXI.$responseFields[2]), responseReader.readString(AwayPlayingXI.$responseFields[3]), responseReader.readString(AwayPlayingXI.$responseFields[4]), responseReader.readString(AwayPlayingXI.$responseFields[5]), responseReader.readBoolean(AwayPlayingXI.$responseFields[6]), responseReader.readBoolean(AwayPlayingXI.$responseFields[7]));
            }
        }
    }
}
