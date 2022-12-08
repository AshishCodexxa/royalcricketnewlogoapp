package com.cricketlivescore.predictiontips;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ScalarTypeAdapters;
import com.apollographql.apollo.api.internal.Utils;
import com.apollographql.apollo.api.internal.OperationRequestBodyComposer;
import com.apollographql.apollo.api.internal.QueryDocumentMinifier;
import com.apollographql.apollo.api.internal.ResponseFieldMapper;
import com.apollographql.apollo.api.internal.ResponseFieldMarshaller;
import com.apollographql.apollo.api.internal.ResponseReader;
import com.apollographql.apollo.api.internal.ResponseWriter;
import com.apollographql.apollo.api.internal.SimpleOperationResponseParser;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

public final class TeamDiscoveryV2Query implements Query<TeamDiscoveryV2Query.Data, TeamDiscoveryV2Query.Data, Operation.Variables> {
    public static final String OPERATION_ID = "0a8dfe9a0a278ece457a3a4a038e8643670fcb2794ecc5a718aeac035a9e8e5c";
    public static final OperationName OPERATION_NAME = new OperationName() {

        @Override
        public String name() {
            return "teamDiscoveryV2";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query teamDiscoveryV2 {\n  teamDiscoveryV2 {\n    __typename\n    ipl {\n      __typename\n      teamID\n      teamName\n      odiRanking\n      testRanking\n      t20Ranking\n      trophy_details\n      teamShortName\n    }\n    international {\n      __typename\n      mens {\n        __typename\n        teamID\n        teamName\n        odiRanking\n        testRanking\n        t20Ranking\n        trophy_details\n        teamShortName\n      }\n      womens {\n        __typename\n        teamID\n        teamName\n        odiRanking\n        testRanking\n        t20Ranking\n        trophy_details\n        teamShortName\n      }\n    }\n    otherLeagues {\n      __typename\n      bbl {\n        __typename\n        teamID\n        teamName\n        odiRanking\n        testRanking\n        t20Ranking\n        trophy_details\n        teamShortName\n      }\n      cpl {\n        __typename\n        teamID\n        teamName\n        odiRanking\n        testRanking\n        t20Ranking\n        trophy_details\n        teamShortName\n      }\n      psl {\n        __typename\n        teamID\n        teamName\n        odiRanking\n        testRanking\n        t20Ranking\n        trophy_details\n        teamShortName\n      }\n      ipl {\n        __typename\n        teamID\n        teamName\n        odiRanking\n        testRanking\n        t20Ranking\n        trophy_details\n        teamShortName\n      }\n    }\n  }\n}");
    private final Operation.Variables variables = Operation.EMPTY_VARIABLES;

    @Override
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    @Override
    public String queryDocument() {
        return QUERY_DOCUMENT;
    }

    @Override
    public Operation.Variables variables() {
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
        Builder() {
        }

        public TeamDiscoveryV2Query build() {
            return new TeamDiscoveryV2Query();
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("teamDiscoveryV2", "teamDiscoveryV2", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final TeamDiscoveryV2 teamDiscoveryV2;

        public Data(TeamDiscoveryV2 teamDiscoveryV22) {
            this.teamDiscoveryV2 = teamDiscoveryV22;
        }

        public TeamDiscoveryV2 teamDiscoveryV2() {
            return this.teamDiscoveryV2;
        }

       @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.teamDiscoveryV2 != null ? Data.this.teamDiscoveryV2.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{teamDiscoveryV2=" + this.teamDiscoveryV2 + "}";
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
            TeamDiscoveryV2 teamDiscoveryV22 = this.teamDiscoveryV2;
            TeamDiscoveryV2 teamDiscoveryV23 = ((Data) obj).teamDiscoveryV2;
            if (teamDiscoveryV22 != null) {
                return teamDiscoveryV22.equals(teamDiscoveryV23);
            }
            if (teamDiscoveryV23 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                TeamDiscoveryV2 teamDiscoveryV22 = this.teamDiscoveryV2;
                this.$hashCode = 1000003 ^ (teamDiscoveryV22 == null ? 0 : teamDiscoveryV22.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final TeamDiscoveryV2.Mapper teamDiscoveryV2FieldMapper = new TeamDiscoveryV2.Mapper();

            @Override
            public Data map(ResponseReader responseReader) {
                return new Data((TeamDiscoveryV2) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<TeamDiscoveryV2>() {


                    @Override
                    public TeamDiscoveryV2 read(ResponseReader responseReader) {
                        return Mapper.this.teamDiscoveryV2FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class TeamDiscoveryV2 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("ipl", "ipl", null, true, Collections.emptyList()), ResponseField.forObject("international", "international", null, true, Collections.emptyList()), ResponseField.forObject("otherLeagues", "otherLeagues", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final International international;
        final List<C6866Ipl> ipl;
        final OtherLeagues otherLeagues;

        public TeamDiscoveryV2(String str, List<C6866Ipl> list, International international2, OtherLeagues otherLeagues2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.ipl = list;
            this.international = international2;
            this.otherLeagues = otherLeagues2;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<C6866Ipl> ipl() {
            return this.ipl;
        }

        public International international() {
            return this.international;
        }

        public OtherLeagues otherLeagues() {
            return this.otherLeagues;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {
                /* TeamDiscoveryV2Query.TeamDiscoveryV2.C68921 */

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TeamDiscoveryV2.$responseFields[0], TeamDiscoveryV2.this.__typename);
                    responseWriter.writeList(TeamDiscoveryV2.$responseFields[1], TeamDiscoveryV2.this.ipl, new ResponseWriter.ListWriter() {
                        /* TeamDiscoveryV2Query.TeamDiscoveryV2.C68921.C68931 */

                        @Override
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((C6866Ipl) it.next()).marshaller());
                            }
                        }
                    });
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(TeamDiscoveryV2.$responseFields[2], TeamDiscoveryV2.this.international != null ? TeamDiscoveryV2.this.international.marshaller() : null);
                    ResponseField responseField = TeamDiscoveryV2.$responseFields[3];
                    if (TeamDiscoveryV2.this.otherLeagues != null) {
                        responseFieldMarshaller = TeamDiscoveryV2.this.otherLeagues.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TeamDiscoveryV2{__typename=" + this.__typename + ", ipl=" + this.ipl + ", international=" + this.international + ", otherLeagues=" + this.otherLeagues + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<C6866Ipl> list;
            International international2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TeamDiscoveryV2)) {
                return false;
            }
            TeamDiscoveryV2 teamDiscoveryV2 = (TeamDiscoveryV2) obj;
            if (this.__typename.equals(teamDiscoveryV2.__typename) && ((list = this.ipl) != null ? list.equals(teamDiscoveryV2.ipl) : teamDiscoveryV2.ipl == null) && ((international2 = this.international) != null ? international2.equals(teamDiscoveryV2.international) : teamDiscoveryV2.international == null)) {
                OtherLeagues otherLeagues2 = this.otherLeagues;
                OtherLeagues otherLeagues3 = teamDiscoveryV2.otherLeagues;
                if (otherLeagues2 == null) {
                    if (otherLeagues3 == null) {
                        return true;
                    }
                } else if (otherLeagues2.equals(otherLeagues3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<C6866Ipl> list = this.ipl;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                International international2 = this.international;
                int hashCode3 = (hashCode2 ^ (international2 == null ? 0 : international2.hashCode())) * 1000003;
                OtherLeagues otherLeagues2 = this.otherLeagues;
                if (otherLeagues2 != null) {
                    i = otherLeagues2.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TeamDiscoveryV2> {
            final International.Mapper internationalFieldMapper = new International.Mapper();
            final C6866Ipl.Mapper iplFieldMapper = new C6866Ipl.Mapper();
            final OtherLeagues.Mapper otherLeaguesFieldMapper = new OtherLeagues.Mapper();

            @Override
            public TeamDiscoveryV2 map(ResponseReader responseReader) {
                return new TeamDiscoveryV2(responseReader.readString(TeamDiscoveryV2.$responseFields[0]), responseReader.readList(TeamDiscoveryV2.$responseFields[1], new ResponseReader.ListReader<C6866Ipl>() {


                    @Override
                    public C6866Ipl read(ResponseReader.ListItemReader listItemReader) {
                        return (C6866Ipl) listItemReader.readObject(new ResponseReader.ObjectReader<C6866Ipl>() {


                            @Override
                            public C6866Ipl read(ResponseReader responseReader) {
                                return Mapper.this.iplFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (International) responseReader.readObject(TeamDiscoveryV2.$responseFields[2], new ResponseReader.ObjectReader<International>() {


                    @Override
                    public International read(ResponseReader responseReader) {
                        return Mapper.this.internationalFieldMapper.map(responseReader);
                    }
                }), (OtherLeagues) responseReader.readObject(TeamDiscoveryV2.$responseFields[3], new ResponseReader.ObjectReader<OtherLeagues>() {


                    @Override
                    public OtherLeagues read(ResponseReader responseReader) {
                        return Mapper.this.otherLeaguesFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }


    public static class C6866Ipl {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, true, Collections.emptyList()), ResponseField.forString("odiRanking", "odiRanking", null, true, Collections.emptyList()), ResponseField.forString("testRanking", "testRanking", null, true, Collections.emptyList()), ResponseField.forString("t20Ranking", "t20Ranking", null, true, Collections.emptyList()), ResponseField.forList("trophy_details", "trophy_details", null, true, Collections.emptyList()), ResponseField.forString("teamShortName", "teamShortName", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String odiRanking;
        final String t20Ranking;
        final String teamID;
        final String teamName;
        final String teamShortName;
        final String testRanking;
        final List<String> trophy_details;

        public C6866Ipl(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, String str7) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.teamID = str2;
            this.teamName = str3;
            this.odiRanking = str4;
            this.testRanking = str5;
            this.t20Ranking = str6;
            this.trophy_details = list;
            this.teamShortName = str7;
        }

        public String __typename() {
            return this.__typename;
        }

        public String teamID() {
            return this.teamID;
        }

        public String teamName() {
            return this.teamName;
        }

        public String odiRanking() {
            return this.odiRanking;
        }

        public String testRanking() {
            return this.testRanking;
        }

        public String t20Ranking() {
            return this.t20Ranking;
        }

        public List<String> trophy_details() {
            return this.trophy_details;
        }

        public String teamShortName() {
            return this.teamShortName;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(C6866Ipl.$responseFields[0], C6866Ipl.this.__typename);
                    responseWriter.writeString(C6866Ipl.$responseFields[1], C6866Ipl.this.teamID);
                    responseWriter.writeString(C6866Ipl.$responseFields[2], C6866Ipl.this.teamName);
                    responseWriter.writeString(C6866Ipl.$responseFields[3], C6866Ipl.this.odiRanking);
                    responseWriter.writeString(C6866Ipl.$responseFields[4], C6866Ipl.this.testRanking);
                    responseWriter.writeString(C6866Ipl.$responseFields[5], C6866Ipl.this.t20Ranking);
                    responseWriter.writeList(C6866Ipl.$responseFields[6], C6866Ipl.this.trophy_details, new ResponseWriter.ListWriter() {


                        @Override
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    });
                    responseWriter.writeString(C6866Ipl.$responseFields[7], C6866Ipl.this.teamShortName);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Ipl{__typename=" + this.__typename + ", teamID=" + this.teamID + ", teamName=" + this.teamName + ", odiRanking=" + this.odiRanking + ", testRanking=" + this.testRanking + ", t20Ranking=" + this.t20Ranking + ", trophy_details=" + this.trophy_details + ", teamShortName=" + this.teamShortName + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            List<String> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6866Ipl)) {
                return false;
            }
            C6866Ipl ipl = (C6866Ipl) obj;
            if (this.__typename.equals(ipl.__typename) && ((str = this.teamID) != null ? str.equals(ipl.teamID) : ipl.teamID == null) && ((str2 = this.teamName) != null ? str2.equals(ipl.teamName) : ipl.teamName == null) && ((str3 = this.odiRanking) != null ? str3.equals(ipl.odiRanking) : ipl.odiRanking == null) && ((str4 = this.testRanking) != null ? str4.equals(ipl.testRanking) : ipl.testRanking == null) && ((str5 = this.t20Ranking) != null ? str5.equals(ipl.t20Ranking) : ipl.t20Ranking == null) && ((list = this.trophy_details) != null ? list.equals(ipl.trophy_details) : ipl.trophy_details == null)) {
                String str6 = this.teamShortName;
                String str7 = ipl.teamShortName;
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
                String str = this.teamID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.teamName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.odiRanking;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.testRanking;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.t20Ranking;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                List<String> list = this.trophy_details;
                int hashCode7 = (hashCode6 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str6 = this.teamShortName;
                if (str6 != null) {
                    i = str6.hashCode();
                }
                this.$hashCode = hashCode7 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }


        public static final class Mapper implements ResponseFieldMapper<C6866Ipl> {
            @Override
            public C6866Ipl map(ResponseReader responseReader) {
                return new C6866Ipl(responseReader.readString(C6866Ipl.$responseFields[0]), responseReader.readString(C6866Ipl.$responseFields[1]), responseReader.readString(C6866Ipl.$responseFields[2]), responseReader.readString(C6866Ipl.$responseFields[3]), responseReader.readString(C6866Ipl.$responseFields[4]), responseReader.readString(C6866Ipl.$responseFields[5]), responseReader.readList(C6866Ipl.$responseFields[6], new ResponseReader.ListReader<String>() {


                    @Override
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(C6866Ipl.$responseFields[7]));
            }
        }
    }

    public static class International {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("mens", "mens", null, true, Collections.emptyList()), ResponseField.forList("womens", "womens", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Men> mens;
        final List<Women> womens;

        public International(String str, List<Men> list, List<Women> list2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.mens = list;
            this.womens = list2;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Men> mens() {
            return this.mens;
        }

        public List<Women> womens() {
            return this.womens;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(International.$responseFields[0], International.this.__typename);
                    responseWriter.writeList(International.$responseFields[1], International.this.mens, new ResponseWriter.ListWriter() {


                        @Override
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Men) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(International.$responseFields[2], International.this.womens, new ResponseWriter.ListWriter() {


                        @Override
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Women) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "International{__typename=" + this.__typename + ", mens=" + this.mens + ", womens=" + this.womens + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<Men> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof International)) {
                return false;
            }
            International international = (International) obj;
            if (this.__typename.equals(international.__typename) && ((list = this.mens) != null ? list.equals(international.mens) : international.mens == null)) {
                List<Women> list2 = this.womens;
                List<Women> list3 = international.womens;
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
                List<Men> list = this.mens;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Women> list2 = this.womens;
                if (list2 != null) {
                    i = list2.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<International> {
            final Men.Mapper menFieldMapper = new Men.Mapper();
            final Women.Mapper womenFieldMapper = new Women.Mapper();

            @Override
            public International map(ResponseReader responseReader) {
                return new International(responseReader.readString(International.$responseFields[0]), responseReader.readList(International.$responseFields[1], new ResponseReader.ListReader<Men>() {


                    @Override
                    public Men read(ResponseReader.ListItemReader listItemReader) {
                        return (Men) listItemReader.readObject(new ResponseReader.ObjectReader<Men>() {


                            @Override
                            public Men read(ResponseReader responseReader) {
                                return Mapper.this.menFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(International.$responseFields[2], new ResponseReader.ListReader<Women>() {


                    @Override
                    public Women read(ResponseReader.ListItemReader listItemReader) {
                        return (Women) listItemReader.readObject(new ResponseReader.ObjectReader<Women>() {


                            @Override
                            public Women read(ResponseReader responseReader) {
                                return Mapper.this.womenFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class Men {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, true, Collections.emptyList()), ResponseField.forString("odiRanking", "odiRanking", null, true, Collections.emptyList()), ResponseField.forString("testRanking", "testRanking", null, true, Collections.emptyList()), ResponseField.forString("t20Ranking", "t20Ranking", null, true, Collections.emptyList()), ResponseField.forList("trophy_details", "trophy_details", null, true, Collections.emptyList()), ResponseField.forString("teamShortName", "teamShortName", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String odiRanking;
        final String t20Ranking;
        final String teamID;
        final String teamName;
        final String teamShortName;
        final String testRanking;
        final List<String> trophy_details;

        public Men(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, String str7) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.teamID = str2;
            this.teamName = str3;
            this.odiRanking = str4;
            this.testRanking = str5;
            this.t20Ranking = str6;
            this.trophy_details = list;
            this.teamShortName = str7;
        }

        public String __typename() {
            return this.__typename;
        }

        public String teamID() {
            return this.teamID;
        }

        public String teamName() {
            return this.teamName;
        }

        public String odiRanking() {
            return this.odiRanking;
        }

        public String testRanking() {
            return this.testRanking;
        }

        public String t20Ranking() {
            return this.t20Ranking;
        }

        public List<String> trophy_details() {
            return this.trophy_details;
        }

        public String teamShortName() {
            return this.teamShortName;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Men.$responseFields[0], Men.this.__typename);
                    responseWriter.writeString(Men.$responseFields[1], Men.this.teamID);
                    responseWriter.writeString(Men.$responseFields[2], Men.this.teamName);
                    responseWriter.writeString(Men.$responseFields[3], Men.this.odiRanking);
                    responseWriter.writeString(Men.$responseFields[4], Men.this.testRanking);
                    responseWriter.writeString(Men.$responseFields[5], Men.this.t20Ranking);
                    responseWriter.writeList(Men.$responseFields[6], Men.this.trophy_details, new ResponseWriter.ListWriter() {


                        @Override
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    });
                    responseWriter.writeString(Men.$responseFields[7], Men.this.teamShortName);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Men{__typename=" + this.__typename + ", teamID=" + this.teamID + ", teamName=" + this.teamName + ", odiRanking=" + this.odiRanking + ", testRanking=" + this.testRanking + ", t20Ranking=" + this.t20Ranking + ", trophy_details=" + this.trophy_details + ", teamShortName=" + this.teamShortName + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            List<String> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Men)) {
                return false;
            }
            Men men = (Men) obj;
            if (this.__typename.equals(men.__typename) && ((str = this.teamID) != null ? str.equals(men.teamID) : men.teamID == null) && ((str2 = this.teamName) != null ? str2.equals(men.teamName) : men.teamName == null) && ((str3 = this.odiRanking) != null ? str3.equals(men.odiRanking) : men.odiRanking == null) && ((str4 = this.testRanking) != null ? str4.equals(men.testRanking) : men.testRanking == null) && ((str5 = this.t20Ranking) != null ? str5.equals(men.t20Ranking) : men.t20Ranking == null) && ((list = this.trophy_details) != null ? list.equals(men.trophy_details) : men.trophy_details == null)) {
                String str6 = this.teamShortName;
                String str7 = men.teamShortName;
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
                String str = this.teamID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.teamName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.odiRanking;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.testRanking;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.t20Ranking;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                List<String> list = this.trophy_details;
                int hashCode7 = (hashCode6 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str6 = this.teamShortName;
                if (str6 != null) {
                    i = str6.hashCode();
                }
                this.$hashCode = hashCode7 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Men> {
            @Override
            public Men map(ResponseReader responseReader) {
                return new Men(responseReader.readString(Men.$responseFields[0]), responseReader.readString(Men.$responseFields[1]), responseReader.readString(Men.$responseFields[2]), responseReader.readString(Men.$responseFields[3]), responseReader.readString(Men.$responseFields[4]), responseReader.readString(Men.$responseFields[5]), responseReader.readList(Men.$responseFields[6], new ResponseReader.ListReader<String>() {


                    @Override
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(Men.$responseFields[7]));
            }
        }
    }

    public static class Women {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, true, Collections.emptyList()), ResponseField.forString("odiRanking", "odiRanking", null, true, Collections.emptyList()), ResponseField.forString("testRanking", "testRanking", null, true, Collections.emptyList()), ResponseField.forString("t20Ranking", "t20Ranking", null, true, Collections.emptyList()), ResponseField.forList("trophy_details", "trophy_details", null, true, Collections.emptyList()), ResponseField.forString("teamShortName", "teamShortName", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String odiRanking;
        final String t20Ranking;
        final String teamID;
        final String teamName;
        final String teamShortName;
        final String testRanking;
        final List<String> trophy_details;

        public Women(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, String str7) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.teamID = str2;
            this.teamName = str3;
            this.odiRanking = str4;
            this.testRanking = str5;
            this.t20Ranking = str6;
            this.trophy_details = list;
            this.teamShortName = str7;
        }

        public String __typename() {
            return this.__typename;
        }

        public String teamID() {
            return this.teamID;
        }

        public String teamName() {
            return this.teamName;
        }

        public String odiRanking() {
            return this.odiRanking;
        }

        public String testRanking() {
            return this.testRanking;
        }

        public String t20Ranking() {
            return this.t20Ranking;
        }

        public List<String> trophy_details() {
            return this.trophy_details;
        }

        public String teamShortName() {
            return this.teamShortName;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Women.$responseFields[0], Women.this.__typename);
                    responseWriter.writeString(Women.$responseFields[1], Women.this.teamID);
                    responseWriter.writeString(Women.$responseFields[2], Women.this.teamName);
                    responseWriter.writeString(Women.$responseFields[3], Women.this.odiRanking);
                    responseWriter.writeString(Women.$responseFields[4], Women.this.testRanking);
                    responseWriter.writeString(Women.$responseFields[5], Women.this.t20Ranking);
                    responseWriter.writeList(Women.$responseFields[6], Women.this.trophy_details, new ResponseWriter.ListWriter() {


                        @Override
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    });
                    responseWriter.writeString(Women.$responseFields[7], Women.this.teamShortName);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Women{__typename=" + this.__typename + ", teamID=" + this.teamID + ", teamName=" + this.teamName + ", odiRanking=" + this.odiRanking + ", testRanking=" + this.testRanking + ", t20Ranking=" + this.t20Ranking + ", trophy_details=" + this.trophy_details + ", teamShortName=" + this.teamShortName + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            List<String> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Women)) {
                return false;
            }
            Women women = (Women) obj;
            if (this.__typename.equals(women.__typename) && ((str = this.teamID) != null ? str.equals(women.teamID) : women.teamID == null) && ((str2 = this.teamName) != null ? str2.equals(women.teamName) : women.teamName == null) && ((str3 = this.odiRanking) != null ? str3.equals(women.odiRanking) : women.odiRanking == null) && ((str4 = this.testRanking) != null ? str4.equals(women.testRanking) : women.testRanking == null) && ((str5 = this.t20Ranking) != null ? str5.equals(women.t20Ranking) : women.t20Ranking == null) && ((list = this.trophy_details) != null ? list.equals(women.trophy_details) : women.trophy_details == null)) {
                String str6 = this.teamShortName;
                String str7 = women.teamShortName;
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
                String str = this.teamID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.teamName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.odiRanking;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.testRanking;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.t20Ranking;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                List<String> list = this.trophy_details;
                int hashCode7 = (hashCode6 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str6 = this.teamShortName;
                if (str6 != null) {
                    i = str6.hashCode();
                }
                this.$hashCode = hashCode7 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Women> {
            @Override
            public Women map(ResponseReader responseReader) {
                return new Women(responseReader.readString(Women.$responseFields[0]), responseReader.readString(Women.$responseFields[1]), responseReader.readString(Women.$responseFields[2]), responseReader.readString(Women.$responseFields[3]), responseReader.readString(Women.$responseFields[4]), responseReader.readString(Women.$responseFields[5]), responseReader.readList(Women.$responseFields[6], new ResponseReader.ListReader<String>() {


                    @Override
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(Women.$responseFields[7]));
            }
        }
    }

    public static class OtherLeagues {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("bbl", "bbl", null, true, Collections.emptyList()), ResponseField.forList("cpl", "cpl", null, true, Collections.emptyList()), ResponseField.forList("psl", "psl", null, true, Collections.emptyList()), ResponseField.forList("ipl", "ipl", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Bbl> bbl;
        final List<Cpl> cpl;
        final List<Ipl1> ipl;
        final List<Psl> psl;

        public OtherLeagues(String str, List<Bbl> list, List<Cpl> list2, List<Psl> list3, List<Ipl1> list4) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.bbl = list;
            this.cpl = list2;
            this.psl = list3;
            this.ipl = list4;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Bbl> bbl() {
            return this.bbl;
        }

        public List<Cpl> cpl() {
            return this.cpl;
        }

        public List<Psl> psl() {
            return this.psl;
        }

        public List<Ipl1> ipl() {
            return this.ipl;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(OtherLeagues.$responseFields[0], OtherLeagues.this.__typename);
                    responseWriter.writeList(OtherLeagues.$responseFields[1], OtherLeagues.this.bbl, new ResponseWriter.ListWriter() {


                        @Override
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Bbl) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(OtherLeagues.$responseFields[2], OtherLeagues.this.cpl, new ResponseWriter.ListWriter() {


                        @Override
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Cpl) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(OtherLeagues.$responseFields[3], OtherLeagues.this.psl, new ResponseWriter.ListWriter() {


                        @Override
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Psl) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(OtherLeagues.$responseFields[4], OtherLeagues.this.ipl, new ResponseWriter.ListWriter() {


                        @Override
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Ipl1) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "OtherLeagues{__typename=" + this.__typename + ", bbl=" + this.bbl + ", cpl=" + this.cpl + ", psl=" + this.psl + ", ipl=" + this.ipl + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<Bbl> list;
            List<Cpl> list2;
            List<Psl> list3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OtherLeagues)) {
                return false;
            }
            OtherLeagues otherLeagues = (OtherLeagues) obj;
            if (this.__typename.equals(otherLeagues.__typename) && ((list = this.bbl) != null ? list.equals(otherLeagues.bbl) : otherLeagues.bbl == null) && ((list2 = this.cpl) != null ? list2.equals(otherLeagues.cpl) : otherLeagues.cpl == null) && ((list3 = this.psl) != null ? list3.equals(otherLeagues.psl) : otherLeagues.psl == null)) {
                List<Ipl1> list4 = this.ipl;
                List<Ipl1> list5 = otherLeagues.ipl;
                if (list4 == null) {
                    if (list5 == null) {
                        return true;
                    }
                } else if (list4.equals(list5)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<Bbl> list = this.bbl;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Cpl> list2 = this.cpl;
                int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<Psl> list3 = this.psl;
                int hashCode4 = (hashCode3 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                List<Ipl1> list4 = this.ipl;
                if (list4 != null) {
                    i = list4.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<OtherLeagues> {
            final Bbl.Mapper bblFieldMapper = new Bbl.Mapper();
            final Cpl.Mapper cplFieldMapper = new Cpl.Mapper();
            final Ipl1.Mapper ipl1FieldMapper = new Ipl1.Mapper();
            final Psl.Mapper pslFieldMapper = new Psl.Mapper();

            @Override
            public OtherLeagues map(ResponseReader responseReader) {
                return new OtherLeagues(responseReader.readString(OtherLeagues.$responseFields[0]), responseReader.readList(OtherLeagues.$responseFields[1], new ResponseReader.ListReader<Bbl>() {


                    @Override
                    public Bbl read(ResponseReader.ListItemReader listItemReader) {
                        return (Bbl) listItemReader.readObject(new ResponseReader.ObjectReader<Bbl>() {


                            @Override
                            public Bbl read(ResponseReader responseReader) {
                                return Mapper.this.bblFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(OtherLeagues.$responseFields[2], new ResponseReader.ListReader<Cpl>() {


                    @Override
                    public Cpl read(ResponseReader.ListItemReader listItemReader) {
                        return (Cpl) listItemReader.readObject(new ResponseReader.ObjectReader<Cpl>() {


                            @Override
                            public Cpl read(ResponseReader responseReader) {
                                return Mapper.this.cplFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(OtherLeagues.$responseFields[3], new ResponseReader.ListReader<Psl>() {


                    @Override
                    public Psl read(ResponseReader.ListItemReader listItemReader) {
                        return (Psl) listItemReader.readObject(new ResponseReader.ObjectReader<Psl>() {


                            @Override
                            public Psl read(ResponseReader responseReader) {
                                return Mapper.this.pslFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(OtherLeagues.$responseFields[4], new ResponseReader.ListReader<Ipl1>() {


                    @Override
                    public Ipl1 read(ResponseReader.ListItemReader listItemReader) {
                        return (Ipl1) listItemReader.readObject(new ResponseReader.ObjectReader<Ipl1>() {


                            @Override
                            public Ipl1 read(ResponseReader responseReader) {
                                return Mapper.this.ipl1FieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class Bbl {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, true, Collections.emptyList()), ResponseField.forString("odiRanking", "odiRanking", null, true, Collections.emptyList()), ResponseField.forString("testRanking", "testRanking", null, true, Collections.emptyList()), ResponseField.forString("t20Ranking", "t20Ranking", null, true, Collections.emptyList()), ResponseField.forList("trophy_details", "trophy_details", null, true, Collections.emptyList()), ResponseField.forString("teamShortName", "teamShortName", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String odiRanking;
        final String t20Ranking;
        final String teamID;
        final String teamName;
        final String teamShortName;
        final String testRanking;
        final List<String> trophy_details;

        public Bbl(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, String str7) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.teamID = str2;
            this.teamName = str3;
            this.odiRanking = str4;
            this.testRanking = str5;
            this.t20Ranking = str6;
            this.trophy_details = list;
            this.teamShortName = str7;
        }

        public String __typename() {
            return this.__typename;
        }

        public String teamID() {
            return this.teamID;
        }

        public String teamName() {
            return this.teamName;
        }

        public String odiRanking() {
            return this.odiRanking;
        }

        public String testRanking() {
            return this.testRanking;
        }

        public String t20Ranking() {
            return this.t20Ranking;
        }

        public List<String> trophy_details() {
            return this.trophy_details;
        }

        public String teamShortName() {
            return this.teamShortName;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Bbl.$responseFields[0], Bbl.this.__typename);
                    responseWriter.writeString(Bbl.$responseFields[1], Bbl.this.teamID);
                    responseWriter.writeString(Bbl.$responseFields[2], Bbl.this.teamName);
                    responseWriter.writeString(Bbl.$responseFields[3], Bbl.this.odiRanking);
                    responseWriter.writeString(Bbl.$responseFields[4], Bbl.this.testRanking);
                    responseWriter.writeString(Bbl.$responseFields[5], Bbl.this.t20Ranking);
                    responseWriter.writeList(Bbl.$responseFields[6], Bbl.this.trophy_details, new ResponseWriter.ListWriter() {


                        @Override
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    });
                    responseWriter.writeString(Bbl.$responseFields[7], Bbl.this.teamShortName);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Bbl{__typename=" + this.__typename + ", teamID=" + this.teamID + ", teamName=" + this.teamName + ", odiRanking=" + this.odiRanking + ", testRanking=" + this.testRanking + ", t20Ranking=" + this.t20Ranking + ", trophy_details=" + this.trophy_details + ", teamShortName=" + this.teamShortName + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            List<String> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Bbl)) {
                return false;
            }
            Bbl bbl = (Bbl) obj;
            if (this.__typename.equals(bbl.__typename) && ((str = this.teamID) != null ? str.equals(bbl.teamID) : bbl.teamID == null) && ((str2 = this.teamName) != null ? str2.equals(bbl.teamName) : bbl.teamName == null) && ((str3 = this.odiRanking) != null ? str3.equals(bbl.odiRanking) : bbl.odiRanking == null) && ((str4 = this.testRanking) != null ? str4.equals(bbl.testRanking) : bbl.testRanking == null) && ((str5 = this.t20Ranking) != null ? str5.equals(bbl.t20Ranking) : bbl.t20Ranking == null) && ((list = this.trophy_details) != null ? list.equals(bbl.trophy_details) : bbl.trophy_details == null)) {
                String str6 = this.teamShortName;
                String str7 = bbl.teamShortName;
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
                String str = this.teamID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.teamName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.odiRanking;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.testRanking;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.t20Ranking;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                List<String> list = this.trophy_details;
                int hashCode7 = (hashCode6 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str6 = this.teamShortName;
                if (str6 != null) {
                    i = str6.hashCode();
                }
                this.$hashCode = hashCode7 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Bbl> {
            @Override
            public Bbl map(ResponseReader responseReader) {
                return new Bbl(responseReader.readString(Bbl.$responseFields[0]), responseReader.readString(Bbl.$responseFields[1]), responseReader.readString(Bbl.$responseFields[2]), responseReader.readString(Bbl.$responseFields[3]), responseReader.readString(Bbl.$responseFields[4]), responseReader.readString(Bbl.$responseFields[5]), responseReader.readList(Bbl.$responseFields[6], new ResponseReader.ListReader<String>() {


                    @Override
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(Bbl.$responseFields[7]));
            }
        }
    }

    public static class Cpl {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, true, Collections.emptyList()), ResponseField.forString("odiRanking", "odiRanking", null, true, Collections.emptyList()), ResponseField.forString("testRanking", "testRanking", null, true, Collections.emptyList()), ResponseField.forString("t20Ranking", "t20Ranking", null, true, Collections.emptyList()), ResponseField.forList("trophy_details", "trophy_details", null, true, Collections.emptyList()), ResponseField.forString("teamShortName", "teamShortName", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String odiRanking;
        final String t20Ranking;
        final String teamID;
        final String teamName;
        final String teamShortName;
        final String testRanking;
        final List<String> trophy_details;

        public Cpl(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, String str7) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.teamID = str2;
            this.teamName = str3;
            this.odiRanking = str4;
            this.testRanking = str5;
            this.t20Ranking = str6;
            this.trophy_details = list;
            this.teamShortName = str7;
        }

        public String __typename() {
            return this.__typename;
        }

        public String teamID() {
            return this.teamID;
        }

        public String teamName() {
            return this.teamName;
        }

        public String odiRanking() {
            return this.odiRanking;
        }

        public String testRanking() {
            return this.testRanking;
        }

        public String t20Ranking() {
            return this.t20Ranking;
        }

        public List<String> trophy_details() {
            return this.trophy_details;
        }

        public String teamShortName() {
            return this.teamShortName;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Cpl.$responseFields[0], Cpl.this.__typename);
                    responseWriter.writeString(Cpl.$responseFields[1], Cpl.this.teamID);
                    responseWriter.writeString(Cpl.$responseFields[2], Cpl.this.teamName);
                    responseWriter.writeString(Cpl.$responseFields[3], Cpl.this.odiRanking);
                    responseWriter.writeString(Cpl.$responseFields[4], Cpl.this.testRanking);
                    responseWriter.writeString(Cpl.$responseFields[5], Cpl.this.t20Ranking);
                    responseWriter.writeList(Cpl.$responseFields[6], Cpl.this.trophy_details, new ResponseWriter.ListWriter() {


                        @Override
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    });
                    responseWriter.writeString(Cpl.$responseFields[7], Cpl.this.teamShortName);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Cpl{__typename=" + this.__typename + ", teamID=" + this.teamID + ", teamName=" + this.teamName + ", odiRanking=" + this.odiRanking + ", testRanking=" + this.testRanking + ", t20Ranking=" + this.t20Ranking + ", trophy_details=" + this.trophy_details + ", teamShortName=" + this.teamShortName + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            List<String> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Cpl)) {
                return false;
            }
            Cpl cpl = (Cpl) obj;
            if (this.__typename.equals(cpl.__typename) && ((str = this.teamID) != null ? str.equals(cpl.teamID) : cpl.teamID == null) && ((str2 = this.teamName) != null ? str2.equals(cpl.teamName) : cpl.teamName == null) && ((str3 = this.odiRanking) != null ? str3.equals(cpl.odiRanking) : cpl.odiRanking == null) && ((str4 = this.testRanking) != null ? str4.equals(cpl.testRanking) : cpl.testRanking == null) && ((str5 = this.t20Ranking) != null ? str5.equals(cpl.t20Ranking) : cpl.t20Ranking == null) && ((list = this.trophy_details) != null ? list.equals(cpl.trophy_details) : cpl.trophy_details == null)) {
                String str6 = this.teamShortName;
                String str7 = cpl.teamShortName;
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
                String str = this.teamID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.teamName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.odiRanking;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.testRanking;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.t20Ranking;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                List<String> list = this.trophy_details;
                int hashCode7 = (hashCode6 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str6 = this.teamShortName;
                if (str6 != null) {
                    i = str6.hashCode();
                }
                this.$hashCode = hashCode7 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Cpl> {
            @Override
            public Cpl map(ResponseReader responseReader) {
                return new Cpl(responseReader.readString(Cpl.$responseFields[0]), responseReader.readString(Cpl.$responseFields[1]), responseReader.readString(Cpl.$responseFields[2]), responseReader.readString(Cpl.$responseFields[3]), responseReader.readString(Cpl.$responseFields[4]), responseReader.readString(Cpl.$responseFields[5]), responseReader.readList(Cpl.$responseFields[6], new ResponseReader.ListReader<String>() {


                    @Override
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(Cpl.$responseFields[7]));
            }
        }
    }

    public static class Psl {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, true, Collections.emptyList()), ResponseField.forString("odiRanking", "odiRanking", null, true, Collections.emptyList()), ResponseField.forString("testRanking", "testRanking", null, true, Collections.emptyList()), ResponseField.forString("t20Ranking", "t20Ranking", null, true, Collections.emptyList()), ResponseField.forList("trophy_details", "trophy_details", null, true, Collections.emptyList()), ResponseField.forString("teamShortName", "teamShortName", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String odiRanking;
        final String t20Ranking;
        final String teamID;
        final String teamName;
        final String teamShortName;
        final String testRanking;
        final List<String> trophy_details;

        public Psl(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, String str7) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.teamID = str2;
            this.teamName = str3;
            this.odiRanking = str4;
            this.testRanking = str5;
            this.t20Ranking = str6;
            this.trophy_details = list;
            this.teamShortName = str7;
        }

        public String __typename() {
            return this.__typename;
        }

        public String teamID() {
            return this.teamID;
        }

        public String teamName() {
            return this.teamName;
        }

        public String odiRanking() {
            return this.odiRanking;
        }

        public String testRanking() {
            return this.testRanking;
        }

        public String t20Ranking() {
            return this.t20Ranking;
        }

        public List<String> trophy_details() {
            return this.trophy_details;
        }

        public String teamShortName() {
            return this.teamShortName;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Psl.$responseFields[0], Psl.this.__typename);
                    responseWriter.writeString(Psl.$responseFields[1], Psl.this.teamID);
                    responseWriter.writeString(Psl.$responseFields[2], Psl.this.teamName);
                    responseWriter.writeString(Psl.$responseFields[3], Psl.this.odiRanking);
                    responseWriter.writeString(Psl.$responseFields[4], Psl.this.testRanking);
                    responseWriter.writeString(Psl.$responseFields[5], Psl.this.t20Ranking);
                    responseWriter.writeList(Psl.$responseFields[6], Psl.this.trophy_details, new ResponseWriter.ListWriter() {


                        @Override
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    });
                    responseWriter.writeString(Psl.$responseFields[7], Psl.this.teamShortName);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Psl{__typename=" + this.__typename + ", teamID=" + this.teamID + ", teamName=" + this.teamName + ", odiRanking=" + this.odiRanking + ", testRanking=" + this.testRanking + ", t20Ranking=" + this.t20Ranking + ", trophy_details=" + this.trophy_details + ", teamShortName=" + this.teamShortName + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            List<String> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Psl)) {
                return false;
            }
            Psl psl = (Psl) obj;
            if (this.__typename.equals(psl.__typename) && ((str = this.teamID) != null ? str.equals(psl.teamID) : psl.teamID == null) && ((str2 = this.teamName) != null ? str2.equals(psl.teamName) : psl.teamName == null) && ((str3 = this.odiRanking) != null ? str3.equals(psl.odiRanking) : psl.odiRanking == null) && ((str4 = this.testRanking) != null ? str4.equals(psl.testRanking) : psl.testRanking == null) && ((str5 = this.t20Ranking) != null ? str5.equals(psl.t20Ranking) : psl.t20Ranking == null) && ((list = this.trophy_details) != null ? list.equals(psl.trophy_details) : psl.trophy_details == null)) {
                String str6 = this.teamShortName;
                String str7 = psl.teamShortName;
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
                String str = this.teamID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.teamName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.odiRanking;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.testRanking;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.t20Ranking;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                List<String> list = this.trophy_details;
                int hashCode7 = (hashCode6 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str6 = this.teamShortName;
                if (str6 != null) {
                    i = str6.hashCode();
                }
                this.$hashCode = hashCode7 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Psl> {
            @Override
            public Psl map(ResponseReader responseReader) {
                return new Psl(responseReader.readString(Psl.$responseFields[0]), responseReader.readString(Psl.$responseFields[1]), responseReader.readString(Psl.$responseFields[2]), responseReader.readString(Psl.$responseFields[3]), responseReader.readString(Psl.$responseFields[4]), responseReader.readString(Psl.$responseFields[5]), responseReader.readList(Psl.$responseFields[6], new ResponseReader.ListReader<String>() {


                    @Override
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(Psl.$responseFields[7]));
            }
        }
    }

    public static class Ipl1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, true, Collections.emptyList()), ResponseField.forString("odiRanking", "odiRanking", null, true, Collections.emptyList()), ResponseField.forString("testRanking", "testRanking", null, true, Collections.emptyList()), ResponseField.forString("t20Ranking", "t20Ranking", null, true, Collections.emptyList()), ResponseField.forList("trophy_details", "trophy_details", null, true, Collections.emptyList()), ResponseField.forString("teamShortName", "teamShortName", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String odiRanking;
        final String t20Ranking;
        final String teamID;
        final String teamName;
        final String teamShortName;
        final String testRanking;
        final List<String> trophy_details;

        public Ipl1(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, String str7) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.teamID = str2;
            this.teamName = str3;
            this.odiRanking = str4;
            this.testRanking = str5;
            this.t20Ranking = str6;
            this.trophy_details = list;
            this.teamShortName = str7;
        }

        public String __typename() {
            return this.__typename;
        }

        public String teamID() {
            return this.teamID;
        }

        public String teamName() {
            return this.teamName;
        }

        public String odiRanking() {
            return this.odiRanking;
        }

        public String testRanking() {
            return this.testRanking;
        }

        public String t20Ranking() {
            return this.t20Ranking;
        }

        public List<String> trophy_details() {
            return this.trophy_details;
        }

        public String teamShortName() {
            return this.teamShortName;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Ipl1.$responseFields[0], Ipl1.this.__typename);
                    responseWriter.writeString(Ipl1.$responseFields[1], Ipl1.this.teamID);
                    responseWriter.writeString(Ipl1.$responseFields[2], Ipl1.this.teamName);
                    responseWriter.writeString(Ipl1.$responseFields[3], Ipl1.this.odiRanking);
                    responseWriter.writeString(Ipl1.$responseFields[4], Ipl1.this.testRanking);
                    responseWriter.writeString(Ipl1.$responseFields[5], Ipl1.this.t20Ranking);
                    responseWriter.writeList(Ipl1.$responseFields[6], Ipl1.this.trophy_details, new ResponseWriter.ListWriter() {


                        @Override
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    });
                    responseWriter.writeString(Ipl1.$responseFields[7], Ipl1.this.teamShortName);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Ipl1{__typename=" + this.__typename + ", teamID=" + this.teamID + ", teamName=" + this.teamName + ", odiRanking=" + this.odiRanking + ", testRanking=" + this.testRanking + ", t20Ranking=" + this.t20Ranking + ", trophy_details=" + this.trophy_details + ", teamShortName=" + this.teamShortName + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            List<String> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Ipl1)) {
                return false;
            }
            Ipl1 ipl1 = (Ipl1) obj;
            if (this.__typename.equals(ipl1.__typename) && ((str = this.teamID) != null ? str.equals(ipl1.teamID) : ipl1.teamID == null) && ((str2 = this.teamName) != null ? str2.equals(ipl1.teamName) : ipl1.teamName == null) && ((str3 = this.odiRanking) != null ? str3.equals(ipl1.odiRanking) : ipl1.odiRanking == null) && ((str4 = this.testRanking) != null ? str4.equals(ipl1.testRanking) : ipl1.testRanking == null) && ((str5 = this.t20Ranking) != null ? str5.equals(ipl1.t20Ranking) : ipl1.t20Ranking == null) && ((list = this.trophy_details) != null ? list.equals(ipl1.trophy_details) : ipl1.trophy_details == null)) {
                String str6 = this.teamShortName;
                String str7 = ipl1.teamShortName;
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
                String str = this.teamID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.teamName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.odiRanking;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.testRanking;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.t20Ranking;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                List<String> list = this.trophy_details;
                int hashCode7 = (hashCode6 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str6 = this.teamShortName;
                if (str6 != null) {
                    i = str6.hashCode();
                }
                this.$hashCode = hashCode7 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Ipl1> {
            @Override
            public Ipl1 map(ResponseReader responseReader) {
                return new Ipl1(responseReader.readString(Ipl1.$responseFields[0]), responseReader.readString(Ipl1.$responseFields[1]), responseReader.readString(Ipl1.$responseFields[2]), responseReader.readString(Ipl1.$responseFields[3]), responseReader.readString(Ipl1.$responseFields[4]), responseReader.readString(Ipl1.$responseFields[5]), responseReader.readList(Ipl1.$responseFields[6], new ResponseReader.ListReader<String>() {


                    @Override
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(Ipl1.$responseFields[7]));
            }
        }
    }
}
