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

public final class HomepageRecentFormQuery implements Query<HomepageRecentFormQuery.Data, HomepageRecentFormQuery.Data, HomepageRecentFormQuery.Variables> {
    public static final String OPERATION_ID = "d2f07e52be7e384071f9282618f0f90a05acd79339a2c022300b20ea31c5e34e";
    public static final OperationName OPERATION_NAME = new OperationName() {

       @Override
        public String name() {
            return "homepageRecentForm";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query homepageRecentForm($homeTeamID: String, $awayTeamID: String, $homeTeamShortName: String, $awayTeamShortName: String) {\n  homepageRecentForm(homeTeamID: $homeTeamID, awayTeamID: $awayTeamID, homeTeamShortName: $homeTeamShortName, awayTeamShortName: $awayTeamShortName) {\n    __typename\n    homeTeamID\n    awayTeamID\n    homeTeamName\n    awayTeamName\n    homeTeamData {\n      __typename\n      teamSlug\n      matchResult\n      type\n      winningTeamID\n      team1\n      team2\n    }\n    awayTeamData {\n      __typename\n      teamSlug\n      matchResult\n      type\n      winningTeamID\n      team1\n      team2\n    }\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public HomepageRecentFormQuery(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4) {
        Utils.checkNotNull(input, "homeTeamID == null");
        Utils.checkNotNull(input2, "awayTeamID == null");
        Utils.checkNotNull(input3, "homeTeamShortName == null");
        Utils.checkNotNull(input4, "awayTeamShortName == null");
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
        private Input<String> awayTeamID = Input.absent();
        private Input<String> awayTeamShortName = Input.absent();
        private Input<String> homeTeamID = Input.absent();
        private Input<String> homeTeamShortName = Input.absent();

        Builder() {
        }

        public Builder homeTeamID(String str) {
            this.homeTeamID = Input.fromNullable(str);
            return this;
        }

        public Builder awayTeamID(String str) {
            this.awayTeamID = Input.fromNullable(str);
            return this;
        }

        public Builder homeTeamShortName(String str) {
            this.homeTeamShortName = Input.fromNullable(str);
            return this;
        }

        public Builder awayTeamShortName(String str) {
            this.awayTeamShortName = Input.fromNullable(str);
            return this;
        }

        public Builder homeTeamIDInput(Input<String> input) {
            this.homeTeamID = (Input) Utils.checkNotNull(input, "homeTeamID == null");
            return this;
        }

        public Builder awayTeamIDInput(Input<String> input) {
            this.awayTeamID = (Input) Utils.checkNotNull(input, "awayTeamID == null");
            return this;
        }

        public Builder homeTeamShortNameInput(Input<String> input) {
            this.homeTeamShortName = (Input) Utils.checkNotNull(input, "homeTeamShortName == null");
            return this;
        }

        public Builder awayTeamShortNameInput(Input<String> input) {
            this.awayTeamShortName = (Input) Utils.checkNotNull(input, "awayTeamShortName == null");
            return this;
        }

        public HomepageRecentFormQuery build() {
            return new HomepageRecentFormQuery(this.homeTeamID, this.awayTeamID, this.homeTeamShortName, this.awayTeamShortName);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final Input<String> awayTeamID;
        private final Input<String> awayTeamShortName;
        private final Input<String> homeTeamID;
        private final Input<String> homeTeamShortName;
        private final transient Map<String, Object> valueMap;

        Variables(Input<String> input, Input<String> input2, Input<String> input3, Input<String> input4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.homeTeamID = input;
            this.awayTeamID = input2;
            this.homeTeamShortName = input3;
            this.awayTeamShortName = input4;
            if (input.defined) {
                linkedHashMap.put("homeTeamID", input.value);
            }
            if (input2.defined) {
                linkedHashMap.put("awayTeamID", input2.value);
            }
            if (input3.defined) {
                linkedHashMap.put("homeTeamShortName", input3.value);
            }
            if (input4.defined) {
                linkedHashMap.put("awayTeamShortName", input4.value);
            }
        }

        public Input<String> homeTeamID() {
            return this.homeTeamID;
        }

        public Input<String> awayTeamID() {
            return this.awayTeamID;
        }

        public Input<String> homeTeamShortName() {
            return this.homeTeamShortName;
        }

        public Input<String> awayTeamShortName() {
            return this.awayTeamShortName;
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
                    if (Variables.this.homeTeamID.defined) {
                        inputFieldWriter.writeString("homeTeamID", Variables.this.homeTeamID.value);
                    }
                    if (Variables.this.awayTeamID.defined) {
                        inputFieldWriter.writeString("awayTeamID", Variables.this.awayTeamID.value);
                    }
                    if (Variables.this.homeTeamShortName.defined) {
                        inputFieldWriter.writeString("homeTeamShortName", Variables.this.homeTeamShortName.value);
                    }
                    if (Variables.this.awayTeamShortName.defined) {
                        inputFieldWriter.writeString("awayTeamShortName", Variables.this.awayTeamShortName.value);
                    }
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("homepageRecentForm", "homepageRecentForm", new UnmodifiableMapBuilder(4).put("homeTeamID", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "homeTeamID").build()).put("awayTeamID", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "awayTeamID").build()).put("homeTeamShortName", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "homeTeamShortName").build()).put("awayTeamShortName", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "awayTeamShortName").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final HomepageRecentForm homepageRecentForm;

        public Data(HomepageRecentForm homepageRecentForm2) {
            this.homepageRecentForm = homepageRecentForm2;
        }

        public HomepageRecentForm homepageRecentForm() {
            return this.homepageRecentForm;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.homepageRecentForm != null ? Data.this.homepageRecentForm.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{homepageRecentForm=" + this.homepageRecentForm + "}";
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
            HomepageRecentForm homepageRecentForm2 = this.homepageRecentForm;
            HomepageRecentForm homepageRecentForm3 = ((Data) obj).homepageRecentForm;
            if (homepageRecentForm2 != null) {
                return homepageRecentForm2.equals(homepageRecentForm3);
            }
            if (homepageRecentForm3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                HomepageRecentForm homepageRecentForm2 = this.homepageRecentForm;
                this.$hashCode = 1000003 ^ (homepageRecentForm2 == null ? 0 : homepageRecentForm2.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final HomepageRecentForm.Mapper homepageRecentFormFieldMapper = new HomepageRecentForm.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((HomepageRecentForm) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<HomepageRecentForm>() {

                    @Override 
                    public HomepageRecentForm read(ResponseReader responseReader) {
                        return Mapper.this.homepageRecentFormFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class HomepageRecentForm {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("homeTeamID", "homeTeamID", null, true, Collections.emptyList()), ResponseField.forString("awayTeamID", "awayTeamID", null, true, Collections.emptyList()), ResponseField.forString("homeTeamName", "homeTeamName", null, true, Collections.emptyList()), ResponseField.forString("awayTeamName", "awayTeamName", null, true, Collections.emptyList()), ResponseField.forList("homeTeamData", "homeTeamData", null, true, Collections.emptyList()), ResponseField.forList("awayTeamData", "awayTeamData", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<AwayTeamDatum> awayTeamData;
        final String awayTeamID;
        final String awayTeamName;
        final List<HomeTeamDatum> homeTeamData;
        final String homeTeamID;
        final String homeTeamName;

        public HomepageRecentForm(String str, String str2, String str3, String str4, String str5, List<HomeTeamDatum> list, List<AwayTeamDatum> list2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.homeTeamID = str2;
            this.awayTeamID = str3;
            this.homeTeamName = str4;
            this.awayTeamName = str5;
            this.homeTeamData = list;
            this.awayTeamData = list2;
        }

        public String __typename() {
            return this.__typename;
        }

        public String homeTeamID() {
            return this.homeTeamID;
        }

        public String awayTeamID() {
            return this.awayTeamID;
        }

        public String homeTeamName() {
            return this.homeTeamName;
        }

        public String awayTeamName() {
            return this.awayTeamName;
        }

        public List<HomeTeamDatum> homeTeamData() {
            return this.homeTeamData;
        }

        public List<AwayTeamDatum> awayTeamData() {
            return this.awayTeamData;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(HomepageRecentForm.$responseFields[0], HomepageRecentForm.this.__typename);
                    responseWriter.writeString(HomepageRecentForm.$responseFields[1], HomepageRecentForm.this.homeTeamID);
                    responseWriter.writeString(HomepageRecentForm.$responseFields[2], HomepageRecentForm.this.awayTeamID);
                    responseWriter.writeString(HomepageRecentForm.$responseFields[3], HomepageRecentForm.this.homeTeamName);
                    responseWriter.writeString(HomepageRecentForm.$responseFields[4], HomepageRecentForm.this.awayTeamName);
                    responseWriter.writeList(HomepageRecentForm.$responseFields[5], HomepageRecentForm.this.homeTeamData, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((HomeTeamDatum) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(HomepageRecentForm.$responseFields[6], HomepageRecentForm.this.awayTeamData, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((AwayTeamDatum) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "HomepageRecentForm{__typename=" + this.__typename + ", homeTeamID=" + this.homeTeamID + ", awayTeamID=" + this.awayTeamID + ", homeTeamName=" + this.homeTeamName + ", awayTeamName=" + this.awayTeamName + ", homeTeamData=" + this.homeTeamData + ", awayTeamData=" + this.awayTeamData + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            List<HomeTeamDatum> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomepageRecentForm)) {
                return false;
            }
            HomepageRecentForm homepageRecentForm = (HomepageRecentForm) obj;
            if (this.__typename.equals(homepageRecentForm.__typename) && ((str = this.homeTeamID) != null ? str.equals(homepageRecentForm.homeTeamID) : homepageRecentForm.homeTeamID == null) && ((str2 = this.awayTeamID) != null ? str2.equals(homepageRecentForm.awayTeamID) : homepageRecentForm.awayTeamID == null) && ((str3 = this.homeTeamName) != null ? str3.equals(homepageRecentForm.homeTeamName) : homepageRecentForm.homeTeamName == null) && ((str4 = this.awayTeamName) != null ? str4.equals(homepageRecentForm.awayTeamName) : homepageRecentForm.awayTeamName == null) && ((list = this.homeTeamData) != null ? list.equals(homepageRecentForm.homeTeamData) : homepageRecentForm.homeTeamData == null)) {
                List<AwayTeamDatum> list2 = this.awayTeamData;
                List<AwayTeamDatum> list3 = homepageRecentForm.awayTeamData;
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
                String str = this.homeTeamID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.awayTeamID;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.homeTeamName;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.awayTeamName;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                List<HomeTeamDatum> list = this.homeTeamData;
                int hashCode6 = (hashCode5 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<AwayTeamDatum> list2 = this.awayTeamData;
                if (list2 != null) {
                    i = list2.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<HomepageRecentForm> {
            final AwayTeamDatum.Mapper awayTeamDatumFieldMapper = new AwayTeamDatum.Mapper();
            final HomeTeamDatum.Mapper homeTeamDatumFieldMapper = new HomeTeamDatum.Mapper();

            @Override 
            public HomepageRecentForm map(ResponseReader responseReader) {
                return new HomepageRecentForm(responseReader.readString(HomepageRecentForm.$responseFields[0]), responseReader.readString(HomepageRecentForm.$responseFields[1]), responseReader.readString(HomepageRecentForm.$responseFields[2]), responseReader.readString(HomepageRecentForm.$responseFields[3]), responseReader.readString(HomepageRecentForm.$responseFields[4]), responseReader.readList(HomepageRecentForm.$responseFields[5], new ResponseReader.ListReader<HomeTeamDatum>() {


                    @Override 
                    public HomeTeamDatum read(ResponseReader.ListItemReader listItemReader) {
                        return (HomeTeamDatum) listItemReader.readObject(new ResponseReader.ObjectReader<HomeTeamDatum>() {


                            @Override 
                            public HomeTeamDatum read(ResponseReader responseReader) {
                                return Mapper.this.homeTeamDatumFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(HomepageRecentForm.$responseFields[6], new ResponseReader.ListReader<AwayTeamDatum>() {


                    @Override 
                    public AwayTeamDatum read(ResponseReader.ListItemReader listItemReader) {
                        return (AwayTeamDatum) listItemReader.readObject(new ResponseReader.ObjectReader<AwayTeamDatum>() {


                            @Override 
                            public AwayTeamDatum read(ResponseReader responseReader) {
                                return Mapper.this.awayTeamDatumFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class HomeTeamDatum {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamSlug", "teamSlug", null, true, Collections.emptyList()), ResponseField.forString("matchResult", "matchResult", null, true, Collections.emptyList()), ResponseField.forString("type", "type", null, true, Collections.emptyList()), ResponseField.forString("winningTeamID", "winningTeamID", null, true, Collections.emptyList()), ResponseField.forString("team1", "team1", null, true, Collections.emptyList()), ResponseField.forString("team2", "team2", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String matchResult;
        final String team1;
        final String team2;
        final String teamSlug;
        final String type;
        final String winningTeamID;

        public HomeTeamDatum(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.teamSlug = str2;
            this.matchResult = str3;
            this.type = str4;
            this.winningTeamID = str5;
            this.team1 = str6;
            this.team2 = str7;
        }

        public String __typename() {
            return this.__typename;
        }

        public String teamSlug() {
            return this.teamSlug;
        }

        public String matchResult() {
            return this.matchResult;
        }

        public String type() {
            return this.type;
        }

        public String winningTeamID() {
            return this.winningTeamID;
        }

        public String team1() {
            return this.team1;
        }

        public String team2() {
            return this.team2;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(HomeTeamDatum.$responseFields[0], HomeTeamDatum.this.__typename);
                    responseWriter.writeString(HomeTeamDatum.$responseFields[1], HomeTeamDatum.this.teamSlug);
                    responseWriter.writeString(HomeTeamDatum.$responseFields[2], HomeTeamDatum.this.matchResult);
                    responseWriter.writeString(HomeTeamDatum.$responseFields[3], HomeTeamDatum.this.type);
                    responseWriter.writeString(HomeTeamDatum.$responseFields[4], HomeTeamDatum.this.winningTeamID);
                    responseWriter.writeString(HomeTeamDatum.$responseFields[5], HomeTeamDatum.this.team1);
                    responseWriter.writeString(HomeTeamDatum.$responseFields[6], HomeTeamDatum.this.team2);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "HomeTeamDatum{__typename=" + this.__typename + ", teamSlug=" + this.teamSlug + ", matchResult=" + this.matchResult + ", type=" + this.type + ", winningTeamID=" + this.winningTeamID + ", team1=" + this.team1 + ", team2=" + this.team2 + "}";
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
            if (!(obj instanceof HomeTeamDatum)) {
                return false;
            }
            HomeTeamDatum homeTeamDatum = (HomeTeamDatum) obj;
            if (this.__typename.equals(homeTeamDatum.__typename) && ((str = this.teamSlug) != null ? str.equals(homeTeamDatum.teamSlug) : homeTeamDatum.teamSlug == null) && ((str2 = this.matchResult) != null ? str2.equals(homeTeamDatum.matchResult) : homeTeamDatum.matchResult == null) && ((str3 = this.type) != null ? str3.equals(homeTeamDatum.type) : homeTeamDatum.type == null) && ((str4 = this.winningTeamID) != null ? str4.equals(homeTeamDatum.winningTeamID) : homeTeamDatum.winningTeamID == null) && ((str5 = this.team1) != null ? str5.equals(homeTeamDatum.team1) : homeTeamDatum.team1 == null)) {
                String str6 = this.team2;
                String str7 = homeTeamDatum.team2;
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
                String str = this.teamSlug;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.matchResult;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.type;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.winningTeamID;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.team1;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.team2;
                if (str6 != null) {
                    i = str6.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<HomeTeamDatum> {
            @Override 
            public HomeTeamDatum map(ResponseReader responseReader) {
                return new HomeTeamDatum(responseReader.readString(HomeTeamDatum.$responseFields[0]), responseReader.readString(HomeTeamDatum.$responseFields[1]), responseReader.readString(HomeTeamDatum.$responseFields[2]), responseReader.readString(HomeTeamDatum.$responseFields[3]), responseReader.readString(HomeTeamDatum.$responseFields[4]), responseReader.readString(HomeTeamDatum.$responseFields[5]), responseReader.readString(HomeTeamDatum.$responseFields[6]));
            }
        }
    }

    public static class AwayTeamDatum {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamSlug", "teamSlug", null, true, Collections.emptyList()), ResponseField.forString("matchResult", "matchResult", null, true, Collections.emptyList()), ResponseField.forString("type", "type", null, true, Collections.emptyList()), ResponseField.forString("winningTeamID", "winningTeamID", null, true, Collections.emptyList()), ResponseField.forString("team1", "team1", null, true, Collections.emptyList()), ResponseField.forString("team2", "team2", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String matchResult;
        final String team1;
        final String team2;
        final String teamSlug;
        final String type;
        final String winningTeamID;

        public AwayTeamDatum(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.teamSlug = str2;
            this.matchResult = str3;
            this.type = str4;
            this.winningTeamID = str5;
            this.team1 = str6;
            this.team2 = str7;
        }

        public String __typename() {
            return this.__typename;
        }

        public String teamSlug() {
            return this.teamSlug;
        }

        public String matchResult() {
            return this.matchResult;
        }

        public String type() {
            return this.type;
        }

        public String winningTeamID() {
            return this.winningTeamID;
        }

        public String team1() {
            return this.team1;
        }

        public String team2() {
            return this.team2;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(AwayTeamDatum.$responseFields[0], AwayTeamDatum.this.__typename);
                    responseWriter.writeString(AwayTeamDatum.$responseFields[1], AwayTeamDatum.this.teamSlug);
                    responseWriter.writeString(AwayTeamDatum.$responseFields[2], AwayTeamDatum.this.matchResult);
                    responseWriter.writeString(AwayTeamDatum.$responseFields[3], AwayTeamDatum.this.type);
                    responseWriter.writeString(AwayTeamDatum.$responseFields[4], AwayTeamDatum.this.winningTeamID);
                    responseWriter.writeString(AwayTeamDatum.$responseFields[5], AwayTeamDatum.this.team1);
                    responseWriter.writeString(AwayTeamDatum.$responseFields[6], AwayTeamDatum.this.team2);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "AwayTeamDatum{__typename=" + this.__typename + ", teamSlug=" + this.teamSlug + ", matchResult=" + this.matchResult + ", type=" + this.type + ", winningTeamID=" + this.winningTeamID + ", team1=" + this.team1 + ", team2=" + this.team2 + "}";
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
            if (!(obj instanceof AwayTeamDatum)) {
                return false;
            }
            AwayTeamDatum awayTeamDatum = (AwayTeamDatum) obj;
            if (this.__typename.equals(awayTeamDatum.__typename) && ((str = this.teamSlug) != null ? str.equals(awayTeamDatum.teamSlug) : awayTeamDatum.teamSlug == null) && ((str2 = this.matchResult) != null ? str2.equals(awayTeamDatum.matchResult) : awayTeamDatum.matchResult == null) && ((str3 = this.type) != null ? str3.equals(awayTeamDatum.type) : awayTeamDatum.type == null) && ((str4 = this.winningTeamID) != null ? str4.equals(awayTeamDatum.winningTeamID) : awayTeamDatum.winningTeamID == null) && ((str5 = this.team1) != null ? str5.equals(awayTeamDatum.team1) : awayTeamDatum.team1 == null)) {
                String str6 = this.team2;
                String str7 = awayTeamDatum.team2;
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
                String str = this.teamSlug;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.matchResult;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.type;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.winningTeamID;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.team1;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.team2;
                if (str6 != null) {
                    i = str6.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<AwayTeamDatum> {
            @Override 
            public AwayTeamDatum map(ResponseReader responseReader) {
                return new AwayTeamDatum(responseReader.readString(AwayTeamDatum.$responseFields[0]), responseReader.readString(AwayTeamDatum.$responseFields[1]), responseReader.readString(AwayTeamDatum.$responseFields[2]), responseReader.readString(AwayTeamDatum.$responseFields[3]), responseReader.readString(AwayTeamDatum.$responseFields[4]), responseReader.readString(AwayTeamDatum.$responseFields[5]), responseReader.readString(AwayTeamDatum.$responseFields[6]));
            }
        }
    }
}
