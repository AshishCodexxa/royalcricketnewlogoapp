package com.gsbusiness.livecricketscoreprediction;

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
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

public final class GetPointsTableQuery implements Query<GetPointsTableQuery.Data, GetPointsTableQuery.Data, GetPointsTableQuery.Variables> {
    public static final String OPERATION_ID = "42042390ca9baa5b602b3cabd0e28bf7fe05558b7e0947b70d17846486216490";
    public static final OperationName OPERATION_NAME = new OperationName() {


       @Override
        public String name() {
            return "getPointsTable";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query getPointsTable($tourID: String!) {\n  getPointsTable(tourID: $tourID) {\n    __typename\n    standings {\n      __typename\n      name\n      teams {\n        __typename\n        pos\n        teamID\n        teamName\n        teamShortName\n        all\n        wins\n        lost\n        points\n        nrr\n        isQualified\n      }\n    }\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public GetPointsTableQuery(String str) {
        Utils.checkNotNull(str, "tourID == null");
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
        private String tourID;

        Builder() {
        }

        public Builder tourID(String str) {
            this.tourID = str;
            return this;
        }

        public GetPointsTableQuery build() {
            Utils.checkNotNull(this.tourID, "tourID == null");
            return new GetPointsTableQuery(this.tourID);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String tourID;
        private final transient Map<String, Object> valueMap;

        Variables(String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.tourID = str;
            linkedHashMap.put("tourID", str);
        }

        public String tourID() {
            return this.tourID;
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
                    inputFieldWriter.writeString("tourID", Variables.this.tourID);
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getPointsTable", "getPointsTable", new UnmodifiableMapBuilder(1).put("tourID", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "tourID").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final GetPointsTable getPointsTable;

        public Data(GetPointsTable getPointsTable2) {
            this.getPointsTable = getPointsTable2;
        }

        public GetPointsTable getPointsTable() {
            return this.getPointsTable;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.getPointsTable != null ? Data.this.getPointsTable.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getPointsTable=" + this.getPointsTable + "}";
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
            GetPointsTable getPointsTable2 = this.getPointsTable;
            GetPointsTable getPointsTable3 = ((Data) obj).getPointsTable;
            if (getPointsTable2 != null) {
                return getPointsTable2.equals(getPointsTable3);
            }
            if (getPointsTable3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetPointsTable getPointsTable2 = this.getPointsTable;
                this.$hashCode = 1000003 ^ (getPointsTable2 == null ? 0 : getPointsTable2.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetPointsTable.Mapper getPointsTableFieldMapper = new GetPointsTable.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((GetPointsTable) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetPointsTable>() {


                    @Override 
                    public GetPointsTable read(ResponseReader responseReader) {
                        return Mapper.this.getPointsTableFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class GetPointsTable {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("standings", "standings", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Standing> standings;

        public GetPointsTable(String str, List<Standing> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.standings = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Standing> standings() {
            return this.standings;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(GetPointsTable.$responseFields[0], GetPointsTable.this.__typename);
                    responseWriter.writeList(GetPointsTable.$responseFields[1], GetPointsTable.this.standings, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Standing) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetPointsTable{__typename=" + this.__typename + ", standings=" + this.standings + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetPointsTable)) {
                return false;
            }
            GetPointsTable getPointsTable = (GetPointsTable) obj;
            if (this.__typename.equals(getPointsTable.__typename)) {
                List<Standing> list = this.standings;
                List<Standing> list2 = getPointsTable.standings;
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
                List<Standing> list = this.standings;
                this.$hashCode = hashCode ^ (list == null ? 0 : list.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<GetPointsTable> {
            final Standing.Mapper standingFieldMapper = new Standing.Mapper();

            @Override 
            public GetPointsTable map(ResponseReader responseReader) {
                return new GetPointsTable(responseReader.readString(GetPointsTable.$responseFields[0]), responseReader.readList(GetPointsTable.$responseFields[1], new ResponseReader.ListReader<Standing>() {


                    @Override 
                    public Standing read(ResponseReader.ListItemReader listItemReader) {
                        return (Standing) listItemReader.readObject(new ResponseReader.ObjectReader<Standing>() {


                            @Override 
                            public Standing read(ResponseReader responseReader) {
                                return Mapper.this.standingFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class Standing {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, null, true, Collections.emptyList()), ResponseField.forList("teams", "teams", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String name;
        final List<Team> teams;

        public Standing(String str, String str2, List<Team> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.name = str2;
            this.teams = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public String name() {
            return this.name;
        }

        public List<Team> teams() {
            return this.teams;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Standing.$responseFields[0], Standing.this.__typename);
                    responseWriter.writeString(Standing.$responseFields[1], Standing.this.name);
                    responseWriter.writeList(Standing.$responseFields[2], Standing.this.teams, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Team) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Standing{__typename=" + this.__typename + ", name=" + this.name + ", teams=" + this.teams + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Standing)) {
                return false;
            }
            Standing standing = (Standing) obj;
            if (this.__typename.equals(standing.__typename) && ((str = this.name) != null ? str.equals(standing.name) : standing.name == null)) {
                List<Team> list = this.teams;
                List<Team> list2 = standing.teams;
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
                String str = this.name;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                List<Team> list = this.teams;
                if (list != null) {
                    i = list.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Standing> {
            final Team.Mapper teamFieldMapper = new Team.Mapper();

            @Override 
            public Standing map(ResponseReader responseReader) {
                return new Standing(responseReader.readString(Standing.$responseFields[0]), responseReader.readString(Standing.$responseFields[1]), responseReader.readList(Standing.$responseFields[2], new ResponseReader.ListReader<Team>() {


                    @Override 
                    public Team read(ResponseReader.ListItemReader listItemReader) {
                        return (Team) listItemReader.readObject(new ResponseReader.ObjectReader<Team>() {


                            @Override 
                            public Team read(ResponseReader responseReader) {
                                return Mapper.this.teamFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class Team {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("pos", "pos", null, true, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, true, Collections.emptyList()), ResponseField.forString("teamShortName", "teamShortName", null, true, Collections.emptyList()), ResponseField.forString("all", "all", null, true, Collections.emptyList()), ResponseField.forString("wins", "wins", null, true, Collections.emptyList()), ResponseField.forString("lost", "lost", null, true, Collections.emptyList()), ResponseField.forString("points", "points", null, true, Collections.emptyList()), ResponseField.forString("nrr", "nrr", null, true, Collections.emptyList()), ResponseField.forBoolean("isQualified", "isQualified", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String all;
        final Boolean isQualified;
        final String lost;
        final String nrr;
        final String points;
        final Integer pos;
        final String teamID;
        final String teamName;
        final String teamShortName;
        final String wins;

        public Team(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.pos = num;
            this.teamID = str2;
            this.teamName = str3;
            this.teamShortName = str4;
            this.all = str5;
            this.wins = str6;
            this.lost = str7;
            this.points = str8;
            this.nrr = str9;
            this.isQualified = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer pos() {
            return this.pos;
        }

        public String teamID() {
            return this.teamID;
        }

        public String teamName() {
            return this.teamName;
        }

        public String teamShortName() {
            return this.teamShortName;
        }

        public String all() {
            return this.all;
        }

        public String wins() {
            return this.wins;
        }

        public String lost() {
            return this.lost;
        }

        public String points() {
            return this.points;
        }

        public String nrr() {
            return this.nrr;
        }

        public Boolean isQualified() {
            return this.isQualified;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Team.$responseFields[0], Team.this.__typename);
                    responseWriter.writeInt(Team.$responseFields[1], Team.this.pos);
                    responseWriter.writeString(Team.$responseFields[2], Team.this.teamID);
                    responseWriter.writeString(Team.$responseFields[3], Team.this.teamName);
                    responseWriter.writeString(Team.$responseFields[4], Team.this.teamShortName);
                    responseWriter.writeString(Team.$responseFields[5], Team.this.all);
                    responseWriter.writeString(Team.$responseFields[6], Team.this.wins);
                    responseWriter.writeString(Team.$responseFields[7], Team.this.lost);
                    responseWriter.writeString(Team.$responseFields[8], Team.this.points);
                    responseWriter.writeString(Team.$responseFields[9], Team.this.nrr);
                    responseWriter.writeBoolean(Team.$responseFields[10], Team.this.isQualified);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Team{__typename=" + this.__typename + ", pos=" + this.pos + ", teamID=" + this.teamID + ", teamName=" + this.teamName + ", teamShortName=" + this.teamShortName + ", all=" + this.all + ", wins=" + this.wins + ", lost=" + this.lost + ", points=" + this.points + ", nrr=" + this.nrr + ", isQualified=" + this.isQualified + "}";
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
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Team)) {
                return false;
            }
            Team team = (Team) obj;
            if (this.__typename.equals(team.__typename) && ((num = this.pos) != null ? num.equals(team.pos) : team.pos == null) && ((str = this.teamID) != null ? str.equals(team.teamID) : team.teamID == null) && ((str2 = this.teamName) != null ? str2.equals(team.teamName) : team.teamName == null) && ((str3 = this.teamShortName) != null ? str3.equals(team.teamShortName) : team.teamShortName == null) && ((str4 = this.all) != null ? str4.equals(team.all) : team.all == null) && ((str5 = this.wins) != null ? str5.equals(team.wins) : team.wins == null) && ((str6 = this.lost) != null ? str6.equals(team.lost) : team.lost == null) && ((str7 = this.points) != null ? str7.equals(team.points) : team.points == null) && ((str8 = this.nrr) != null ? str8.equals(team.nrr) : team.nrr == null)) {
                Boolean bool = this.isQualified;
                Boolean bool2 = team.isQualified;
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
                Integer num = this.pos;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str = this.teamID;
                int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.teamName;
                int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.teamShortName;
                int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.all;
                int hashCode6 = (hashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.wins;
                int hashCode7 = (hashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.lost;
                int hashCode8 = (hashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.points;
                int hashCode9 = (hashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.nrr;
                int hashCode10 = (hashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                Boolean bool = this.isQualified;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode10 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Team> {
            @Override 
            public Team map(ResponseReader responseReader) {
                return new Team(responseReader.readString(Team.$responseFields[0]), responseReader.readInt(Team.$responseFields[1]), responseReader.readString(Team.$responseFields[2]), responseReader.readString(Team.$responseFields[3]), responseReader.readString(Team.$responseFields[4]), responseReader.readString(Team.$responseFields[5]), responseReader.readString(Team.$responseFields[6]), responseReader.readString(Team.$responseFields[7]), responseReader.readString(Team.$responseFields[8]), responseReader.readString(Team.$responseFields[9]), responseReader.readBoolean(Team.$responseFields[10]));
            }
        }
    }
}
