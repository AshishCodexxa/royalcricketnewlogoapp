package com.cricketscoreprediction.app;

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

public final class ProbablePlaying11Query implements Query<ProbablePlaying11Query.Data, ProbablePlaying11Query.Data, ProbablePlaying11Query.Variables> {
    public static final String OPERATION_ID = "cd3c57feeb6a6af10bdd826e584eec67c72e71f3302ba23ed7d70aa5beb2b1cb";
    public static final OperationName OPERATION_NAME = new OperationName() {

       @Override
        public String name() {
            return "probablePlaying11";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query probablePlaying11($matchID: String!) {\n  probablePlaying11(matchID: $matchID) {\n    __typename\n    homeTeamPP11 {\n      __typename\n      playerID\n      playerRole\n      playerClubName\n      playerName\n      playerImage\n      captain\n      keeper\n    }\n    awayTeamPP11 {\n      __typename\n      playerID\n      playerRole\n      playerClubName\n      playerName\n      playerImage\n      captain\n      keeper\n    }\n    homeTeamName\n    awayTeamName\n    homeTeamShortName\n    awayTeamShortName\n    playing11Status\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public ProbablePlaying11Query(String str) {
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

        public ProbablePlaying11Query build() {
            Utils.checkNotNull(this.matchID, "matchID == null");
            return new ProbablePlaying11Query(this.matchID);
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("probablePlaying11", "probablePlaying11", new UnmodifiableMapBuilder(1).put("matchID", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "matchID").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final ProbablePlaying11 probablePlaying11;

        public Data(ProbablePlaying11 probablePlaying112) {
            this.probablePlaying11 = probablePlaying112;
        }

        public ProbablePlaying11 probablePlaying11() {
            return this.probablePlaying11;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.probablePlaying11 != null ? Data.this.probablePlaying11.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{probablePlaying11=" + this.probablePlaying11 + "}";
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
            ProbablePlaying11 probablePlaying112 = this.probablePlaying11;
            ProbablePlaying11 probablePlaying113 = ((Data) obj).probablePlaying11;
            if (probablePlaying112 != null) {
                return probablePlaying112.equals(probablePlaying113);
            }
            if (probablePlaying113 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                ProbablePlaying11 probablePlaying112 = this.probablePlaying11;
                this.$hashCode = 1000003 ^ (probablePlaying112 == null ? 0 : probablePlaying112.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final ProbablePlaying11.Mapper probablePlaying11FieldMapper = new ProbablePlaying11.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((ProbablePlaying11) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<ProbablePlaying11>() {

                    @Override 
                    public ProbablePlaying11 read(ResponseReader responseReader) {
                        return Mapper.this.probablePlaying11FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class ProbablePlaying11 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("homeTeamPP11", "homeTeamPP11", null, true, Collections.emptyList()), ResponseField.forList("awayTeamPP11", "awayTeamPP11", null, true, Collections.emptyList()), ResponseField.forString("homeTeamName", "homeTeamName", null, true, Collections.emptyList()), ResponseField.forString("awayTeamName", "awayTeamName", null, true, Collections.emptyList()), ResponseField.forString("homeTeamShortName", "homeTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("awayTeamShortName", "awayTeamShortName", null, true, Collections.emptyList()), ResponseField.forBoolean("playing11Status", "playing11Status", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String awayTeamName;
        final List<AwayTeamPP11> awayTeamPP11;
        final String awayTeamShortName;
        final String homeTeamName;
        final List<HomeTeamPP11> homeTeamPP11;
        final String homeTeamShortName;
        final Boolean playing11Status;

        public ProbablePlaying11(String str, List<HomeTeamPP11> list, List<AwayTeamPP11> list2, String str2, String str3, String str4, String str5, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.homeTeamPP11 = list;
            this.awayTeamPP11 = list2;
            this.homeTeamName = str2;
            this.awayTeamName = str3;
            this.homeTeamShortName = str4;
            this.awayTeamShortName = str5;
            this.playing11Status = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<HomeTeamPP11> homeTeamPP11() {
            return this.homeTeamPP11;
        }

        public List<AwayTeamPP11> awayTeamPP11() {
            return this.awayTeamPP11;
        }

        public String homeTeamName() {
            return this.homeTeamName;
        }

        public String awayTeamName() {
            return this.awayTeamName;
        }

        public String homeTeamShortName() {
            return this.homeTeamShortName;
        }

        public String awayTeamShortName() {
            return this.awayTeamShortName;
        }

        public Boolean playing11Status() {
            return this.playing11Status;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(ProbablePlaying11.$responseFields[0], ProbablePlaying11.this.__typename);
                    responseWriter.writeList(ProbablePlaying11.$responseFields[1], ProbablePlaying11.this.homeTeamPP11, new ResponseWriter.ListWriter() {

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((HomeTeamPP11) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(ProbablePlaying11.$responseFields[2], ProbablePlaying11.this.awayTeamPP11, new ResponseWriter.ListWriter() {

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((AwayTeamPP11) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeString(ProbablePlaying11.$responseFields[3], ProbablePlaying11.this.homeTeamName);
                    responseWriter.writeString(ProbablePlaying11.$responseFields[4], ProbablePlaying11.this.awayTeamName);
                    responseWriter.writeString(ProbablePlaying11.$responseFields[5], ProbablePlaying11.this.homeTeamShortName);
                    responseWriter.writeString(ProbablePlaying11.$responseFields[6], ProbablePlaying11.this.awayTeamShortName);
                    responseWriter.writeBoolean(ProbablePlaying11.$responseFields[7], ProbablePlaying11.this.playing11Status);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ProbablePlaying11{__typename=" + this.__typename + ", homeTeamPP11=" + this.homeTeamPP11 + ", awayTeamPP11=" + this.awayTeamPP11 + ", homeTeamName=" + this.homeTeamName + ", awayTeamName=" + this.awayTeamName + ", homeTeamShortName=" + this.homeTeamShortName + ", awayTeamShortName=" + this.awayTeamShortName + ", playing11Status=" + this.playing11Status + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<HomeTeamPP11> list;
            List<AwayTeamPP11> list2;
            String str;
            String str2;
            String str3;
            String str4;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ProbablePlaying11)) {
                return false;
            }
            ProbablePlaying11 probablePlaying11 = (ProbablePlaying11) obj;
            if (this.__typename.equals(probablePlaying11.__typename) && ((list = this.homeTeamPP11) != null ? list.equals(probablePlaying11.homeTeamPP11) : probablePlaying11.homeTeamPP11 == null) && ((list2 = this.awayTeamPP11) != null ? list2.equals(probablePlaying11.awayTeamPP11) : probablePlaying11.awayTeamPP11 == null) && ((str = this.homeTeamName) != null ? str.equals(probablePlaying11.homeTeamName) : probablePlaying11.homeTeamName == null) && ((str2 = this.awayTeamName) != null ? str2.equals(probablePlaying11.awayTeamName) : probablePlaying11.awayTeamName == null) && ((str3 = this.homeTeamShortName) != null ? str3.equals(probablePlaying11.homeTeamShortName) : probablePlaying11.homeTeamShortName == null) && ((str4 = this.awayTeamShortName) != null ? str4.equals(probablePlaying11.awayTeamShortName) : probablePlaying11.awayTeamShortName == null)) {
                Boolean bool = this.playing11Status;
                Boolean bool2 = probablePlaying11.playing11Status;
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
                List<HomeTeamPP11> list = this.homeTeamPP11;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<AwayTeamPP11> list2 = this.awayTeamPP11;
                int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                String str = this.homeTeamName;
                int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.awayTeamName;
                int hashCode5 = (hashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.homeTeamShortName;
                int hashCode6 = (hashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.awayTeamShortName;
                int hashCode7 = (hashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                Boolean bool = this.playing11Status;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode7 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<ProbablePlaying11> {
            final AwayTeamPP11.Mapper awayTeamPP11FieldMapper = new AwayTeamPP11.Mapper();
            final HomeTeamPP11.Mapper homeTeamPP11FieldMapper = new HomeTeamPP11.Mapper();

            @Override 
            public ProbablePlaying11 map(ResponseReader responseReader) {
                return new ProbablePlaying11(responseReader.readString(ProbablePlaying11.$responseFields[0]), responseReader.readList(ProbablePlaying11.$responseFields[1], new ResponseReader.ListReader<HomeTeamPP11>() {

                    @Override 
                    public HomeTeamPP11 read(ResponseReader.ListItemReader listItemReader) {
                        return (HomeTeamPP11) listItemReader.readObject(new ResponseReader.ObjectReader<HomeTeamPP11>() {

                            @Override 
                            public HomeTeamPP11 read(ResponseReader responseReader) {
                                return Mapper.this.homeTeamPP11FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(ProbablePlaying11.$responseFields[2], new ResponseReader.ListReader<AwayTeamPP11>() {

                    @Override 
                    public AwayTeamPP11 read(ResponseReader.ListItemReader listItemReader) {
                        return (AwayTeamPP11) listItemReader.readObject(new ResponseReader.ObjectReader<AwayTeamPP11>() {

                            @Override 
                            public AwayTeamPP11 read(ResponseReader responseReader) {
                                return Mapper.this.awayTeamPP11FieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readString(ProbablePlaying11.$responseFields[3]), responseReader.readString(ProbablePlaying11.$responseFields[4]), responseReader.readString(ProbablePlaying11.$responseFields[5]), responseReader.readString(ProbablePlaying11.$responseFields[6]), responseReader.readBoolean(ProbablePlaying11.$responseFields[7]));
            }
        }
    }

    public static class HomeTeamPP11 {
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

        public HomeTeamPP11(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2) {
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
                    responseWriter.writeString(HomeTeamPP11.$responseFields[0], HomeTeamPP11.this.__typename);
                    responseWriter.writeString(HomeTeamPP11.$responseFields[1], HomeTeamPP11.this.playerID);
                    responseWriter.writeString(HomeTeamPP11.$responseFields[2], HomeTeamPP11.this.playerRole);
                    responseWriter.writeString(HomeTeamPP11.$responseFields[3], HomeTeamPP11.this.playerClubName);
                    responseWriter.writeString(HomeTeamPP11.$responseFields[4], HomeTeamPP11.this.playerName);
                    responseWriter.writeString(HomeTeamPP11.$responseFields[5], HomeTeamPP11.this.playerImage);
                    responseWriter.writeBoolean(HomeTeamPP11.$responseFields[6], HomeTeamPP11.this.captain);
                    responseWriter.writeBoolean(HomeTeamPP11.$responseFields[7], HomeTeamPP11.this.keeper);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "HomeTeamPP11{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerRole=" + this.playerRole + ", playerClubName=" + this.playerClubName + ", playerName=" + this.playerName + ", playerImage=" + this.playerImage + ", captain=" + this.captain + ", keeper=" + this.keeper + "}";
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
            if (!(obj instanceof HomeTeamPP11)) {
                return false;
            }
            HomeTeamPP11 homeTeamPP11 = (HomeTeamPP11) obj;
            if (this.__typename.equals(homeTeamPP11.__typename) && ((str = this.playerID) != null ? str.equals(homeTeamPP11.playerID) : homeTeamPP11.playerID == null) && ((str2 = this.playerRole) != null ? str2.equals(homeTeamPP11.playerRole) : homeTeamPP11.playerRole == null) && ((str3 = this.playerClubName) != null ? str3.equals(homeTeamPP11.playerClubName) : homeTeamPP11.playerClubName == null) && ((str4 = this.playerName) != null ? str4.equals(homeTeamPP11.playerName) : homeTeamPP11.playerName == null) && ((str5 = this.playerImage) != null ? str5.equals(homeTeamPP11.playerImage) : homeTeamPP11.playerImage == null) && ((bool = this.captain) != null ? bool.equals(homeTeamPP11.captain) : homeTeamPP11.captain == null)) {
                Boolean bool2 = this.keeper;
                Boolean bool3 = homeTeamPP11.keeper;
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

        public static final class Mapper implements ResponseFieldMapper<HomeTeamPP11> {
            @Override 
            public HomeTeamPP11 map(ResponseReader responseReader) {
                return new HomeTeamPP11(responseReader.readString(HomeTeamPP11.$responseFields[0]), responseReader.readString(HomeTeamPP11.$responseFields[1]), responseReader.readString(HomeTeamPP11.$responseFields[2]), responseReader.readString(HomeTeamPP11.$responseFields[3]), responseReader.readString(HomeTeamPP11.$responseFields[4]), responseReader.readString(HomeTeamPP11.$responseFields[5]), responseReader.readBoolean(HomeTeamPP11.$responseFields[6]), responseReader.readBoolean(HomeTeamPP11.$responseFields[7]));
            }
        }
    }

    public static class AwayTeamPP11 {
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

        public AwayTeamPP11(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2) {
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
                    responseWriter.writeString(AwayTeamPP11.$responseFields[0], AwayTeamPP11.this.__typename);
                    responseWriter.writeString(AwayTeamPP11.$responseFields[1], AwayTeamPP11.this.playerID);
                    responseWriter.writeString(AwayTeamPP11.$responseFields[2], AwayTeamPP11.this.playerRole);
                    responseWriter.writeString(AwayTeamPP11.$responseFields[3], AwayTeamPP11.this.playerClubName);
                    responseWriter.writeString(AwayTeamPP11.$responseFields[4], AwayTeamPP11.this.playerName);
                    responseWriter.writeString(AwayTeamPP11.$responseFields[5], AwayTeamPP11.this.playerImage);
                    responseWriter.writeBoolean(AwayTeamPP11.$responseFields[6], AwayTeamPP11.this.captain);
                    responseWriter.writeBoolean(AwayTeamPP11.$responseFields[7], AwayTeamPP11.this.keeper);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "AwayTeamPP11{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerRole=" + this.playerRole + ", playerClubName=" + this.playerClubName + ", playerName=" + this.playerName + ", playerImage=" + this.playerImage + ", captain=" + this.captain + ", keeper=" + this.keeper + "}";
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
            if (!(obj instanceof AwayTeamPP11)) {
                return false;
            }
            AwayTeamPP11 awayTeamPP11 = (AwayTeamPP11) obj;
            if (this.__typename.equals(awayTeamPP11.__typename) && ((str = this.playerID) != null ? str.equals(awayTeamPP11.playerID) : awayTeamPP11.playerID == null) && ((str2 = this.playerRole) != null ? str2.equals(awayTeamPP11.playerRole) : awayTeamPP11.playerRole == null) && ((str3 = this.playerClubName) != null ? str3.equals(awayTeamPP11.playerClubName) : awayTeamPP11.playerClubName == null) && ((str4 = this.playerName) != null ? str4.equals(awayTeamPP11.playerName) : awayTeamPP11.playerName == null) && ((str5 = this.playerImage) != null ? str5.equals(awayTeamPP11.playerImage) : awayTeamPP11.playerImage == null) && ((bool = this.captain) != null ? bool.equals(awayTeamPP11.captain) : awayTeamPP11.captain == null)) {
                Boolean bool2 = this.keeper;
                Boolean bool3 = awayTeamPP11.keeper;
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

        public static final class Mapper implements ResponseFieldMapper<AwayTeamPP11> {
            @Override 
            public AwayTeamPP11 map(ResponseReader responseReader) {
                return new AwayTeamPP11(responseReader.readString(AwayTeamPP11.$responseFields[0]), responseReader.readString(AwayTeamPP11.$responseFields[1]), responseReader.readString(AwayTeamPP11.$responseFields[2]), responseReader.readString(AwayTeamPP11.$responseFields[3]), responseReader.readString(AwayTeamPP11.$responseFields[4]), responseReader.readString(AwayTeamPP11.$responseFields[5]), responseReader.readBoolean(AwayTeamPP11.$responseFields[6]), responseReader.readBoolean(AwayTeamPP11.$responseFields[7]));
            }
        }
    }
}
