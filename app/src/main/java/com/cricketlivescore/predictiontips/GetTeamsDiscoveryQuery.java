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
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

public final class GetTeamsDiscoveryQuery implements Query<GetTeamsDiscoveryQuery.Data, GetTeamsDiscoveryQuery.Data, Operation.Variables> {
    public static final String OPERATION_ID = "4befc78576fc64d1891673d8e5d59a0153e27708741606b0409164169b058194";
    public static final OperationName OPERATION_NAME = new OperationName() {

       @Override
        public String name() {
            return "getTeamsDiscovery";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query getTeamsDiscovery {\n  getTeamsDiscovery {\n    __typename\n    popularTeams {\n      __typename\n      id\n      name\n      shortname\n    }\n    teamByCategory {\n      __typename\n      type\n      teamList {\n        __typename\n        id\n        name\n        shortname\n      }\n    }\n  }\n}");
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

        public GetTeamsDiscoveryQuery build() {
            return new GetTeamsDiscoveryQuery();
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getTeamsDiscovery", "getTeamsDiscovery", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final GetTeamsDiscovery getTeamsDiscovery;

        public Data(GetTeamsDiscovery getTeamsDiscovery2) {
            this.getTeamsDiscovery = getTeamsDiscovery2;
        }

        public GetTeamsDiscovery getTeamsDiscovery() {
            return this.getTeamsDiscovery;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.getTeamsDiscovery != null ? Data.this.getTeamsDiscovery.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getTeamsDiscovery=" + this.getTeamsDiscovery + "}";
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
            GetTeamsDiscovery getTeamsDiscovery2 = this.getTeamsDiscovery;
            GetTeamsDiscovery getTeamsDiscovery3 = ((Data) obj).getTeamsDiscovery;
            if (getTeamsDiscovery2 != null) {
                return getTeamsDiscovery2.equals(getTeamsDiscovery3);
            }
            if (getTeamsDiscovery3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetTeamsDiscovery getTeamsDiscovery2 = this.getTeamsDiscovery;
                this.$hashCode = 1000003 ^ (getTeamsDiscovery2 == null ? 0 : getTeamsDiscovery2.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetTeamsDiscovery.Mapper getTeamsDiscoveryFieldMapper = new GetTeamsDiscovery.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((GetTeamsDiscovery) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetTeamsDiscovery>() {

                    @Override 
                    public GetTeamsDiscovery read(ResponseReader responseReader) {
                        return Mapper.this.getTeamsDiscoveryFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class GetTeamsDiscovery {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("popularTeams", "popularTeams", null, true, Collections.emptyList()), ResponseField.forList("teamByCategory", "teamByCategory", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<PopularTeam> popularTeams;
        final List<TeamByCategory> teamByCategory;

        public GetTeamsDiscovery(String str, List<PopularTeam> list, List<TeamByCategory> list2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.popularTeams = list;
            this.teamByCategory = list2;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<PopularTeam> popularTeams() {
            return this.popularTeams;
        }

        public List<TeamByCategory> teamByCategory() {
            return this.teamByCategory;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(GetTeamsDiscovery.$responseFields[0], GetTeamsDiscovery.this.__typename);
                    responseWriter.writeList(GetTeamsDiscovery.$responseFields[1], GetTeamsDiscovery.this.popularTeams, new ResponseWriter.ListWriter() {

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((PopularTeam) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(GetTeamsDiscovery.$responseFields[2], GetTeamsDiscovery.this.teamByCategory, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((TeamByCategory) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetTeamsDiscovery{__typename=" + this.__typename + ", popularTeams=" + this.popularTeams + ", teamByCategory=" + this.teamByCategory + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<PopularTeam> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetTeamsDiscovery)) {
                return false;
            }
            GetTeamsDiscovery getTeamsDiscovery = (GetTeamsDiscovery) obj;
            if (this.__typename.equals(getTeamsDiscovery.__typename) && ((list = this.popularTeams) != null ? list.equals(getTeamsDiscovery.popularTeams) : getTeamsDiscovery.popularTeams == null)) {
                List<TeamByCategory> list2 = this.teamByCategory;
                List<TeamByCategory> list3 = getTeamsDiscovery.teamByCategory;
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
                List<PopularTeam> list = this.popularTeams;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<TeamByCategory> list2 = this.teamByCategory;
                if (list2 != null) {
                    i = list2.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<GetTeamsDiscovery> {
            final PopularTeam.Mapper popularTeamFieldMapper = new PopularTeam.Mapper();
            final TeamByCategory.Mapper teamByCategoryFieldMapper = new TeamByCategory.Mapper();

            @Override 
            public GetTeamsDiscovery map(ResponseReader responseReader) {
                return new GetTeamsDiscovery(responseReader.readString(GetTeamsDiscovery.$responseFields[0]), responseReader.readList(GetTeamsDiscovery.$responseFields[1], new ResponseReader.ListReader<PopularTeam>() {

                    @Override 
                    public PopularTeam read(ResponseReader.ListItemReader listItemReader) {
                        return (PopularTeam) listItemReader.readObject(new ResponseReader.ObjectReader<PopularTeam>() {

                            @Override 
                            public PopularTeam read(ResponseReader responseReader) {
                                return Mapper.this.popularTeamFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(GetTeamsDiscovery.$responseFields[2], new ResponseReader.ListReader<TeamByCategory>() {


                    @Override 
                    public TeamByCategory read(ResponseReader.ListItemReader listItemReader) {
                        return (TeamByCategory) listItemReader.readObject(new ResponseReader.ObjectReader<TeamByCategory>() {

                            @Override 
                            public TeamByCategory read(ResponseReader responseReader) {
                                return Mapper.this.teamByCategoryFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class PopularTeam {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("id", "id", null, true, Collections.emptyList()), ResponseField.forString(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, null, true, Collections.emptyList()), ResponseField.forString("shortname", "shortname", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;

        
        final String f410id;
        final String name;
        final String shortname;

        public PopularTeam(String str, String str2, String str3, String str4) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.f410id = str2;
            this.name = str3;
            this.shortname = str4;
        }

        public String __typename() {
            return this.__typename;
        }

        
        public String mo53525id() {
            return this.f410id;
        }

        public String name() {
            return this.name;
        }

        public String shortname() {
            return this.shortname;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(PopularTeam.$responseFields[0], PopularTeam.this.__typename);
                    responseWriter.writeString(PopularTeam.$responseFields[1], PopularTeam.this.f410id);
                    responseWriter.writeString(PopularTeam.$responseFields[2], PopularTeam.this.name);
                    responseWriter.writeString(PopularTeam.$responseFields[3], PopularTeam.this.shortname);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "PopularTeam{__typename=" + this.__typename + ", id=" + this.f410id + ", name=" + this.name + ", shortname=" + this.shortname + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PopularTeam)) {
                return false;
            }
            PopularTeam popularTeam = (PopularTeam) obj;
            if (this.__typename.equals(popularTeam.__typename) && ((str = this.f410id) != null ? str.equals(popularTeam.f410id) : popularTeam.f410id == null) && ((str2 = this.name) != null ? str2.equals(popularTeam.name) : popularTeam.name == null)) {
                String str3 = this.shortname;
                String str4 = popularTeam.shortname;
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
                String str = this.f410id;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.name;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.shortname;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<PopularTeam> {
            @Override 
            public PopularTeam map(ResponseReader responseReader) {
                return new PopularTeam(responseReader.readString(PopularTeam.$responseFields[0]), responseReader.readString(PopularTeam.$responseFields[1]), responseReader.readString(PopularTeam.$responseFields[2]), responseReader.readString(PopularTeam.$responseFields[3]));
            }
        }
    }

    public static class TeamByCategory {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("type", "type", null, true, Collections.emptyList()), ResponseField.forList("teamList", "teamList", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<TeamList> teamList;
        final String type;

        public TeamByCategory(String str, String str2, List<TeamList> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.type = str2;
            this.teamList = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public String type() {
            return this.type;
        }

        public List<TeamList> teamList() {
            return this.teamList;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TeamByCategory.$responseFields[0], TeamByCategory.this.__typename);
                    responseWriter.writeString(TeamByCategory.$responseFields[1], TeamByCategory.this.type);
                    responseWriter.writeList(TeamByCategory.$responseFields[2], TeamByCategory.this.teamList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((TeamList) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TeamByCategory{__typename=" + this.__typename + ", type=" + this.type + ", teamList=" + this.teamList + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TeamByCategory)) {
                return false;
            }
            TeamByCategory teamByCategory = (TeamByCategory) obj;
            if (this.__typename.equals(teamByCategory.__typename) && ((str = this.type) != null ? str.equals(teamByCategory.type) : teamByCategory.type == null)) {
                List<TeamList> list = this.teamList;
                List<TeamList> list2 = teamByCategory.teamList;
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
                String str = this.type;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                List<TeamList> list = this.teamList;
                if (list != null) {
                    i = list.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TeamByCategory> {
            final TeamList.Mapper teamListFieldMapper = new TeamList.Mapper();

            @Override 
            public TeamByCategory map(ResponseReader responseReader) {
                return new TeamByCategory(responseReader.readString(TeamByCategory.$responseFields[0]), responseReader.readString(TeamByCategory.$responseFields[1]), responseReader.readList(TeamByCategory.$responseFields[2], new ResponseReader.ListReader<TeamList>() {

                    @Override 
                    public TeamList read(ResponseReader.ListItemReader listItemReader) {
                        return (TeamList) listItemReader.readObject(new ResponseReader.ObjectReader<TeamList>() {

                            @Override 
                            public TeamList read(ResponseReader responseReader) {
                                return Mapper.this.teamListFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class TeamList {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("id", "id", null, true, Collections.emptyList()), ResponseField.forString(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, null, true, Collections.emptyList()), ResponseField.forString("shortname", "shortname", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;

        
        final String f411id;
        final String name;
        final String shortname;

        public TeamList(String str, String str2, String str3, String str4) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.f411id = str2;
            this.name = str3;
            this.shortname = str4;
        }

        public String __typename() {
            return this.__typename;
        }

        
        public String mo53540id() {
            return this.f411id;
        }

        public String name() {
            return this.name;
        }

        public String shortname() {
            return this.shortname;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TeamList.$responseFields[0], TeamList.this.__typename);
                    responseWriter.writeString(TeamList.$responseFields[1], TeamList.this.f411id);
                    responseWriter.writeString(TeamList.$responseFields[2], TeamList.this.name);
                    responseWriter.writeString(TeamList.$responseFields[3], TeamList.this.shortname);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TeamList{__typename=" + this.__typename + ", id=" + this.f411id + ", name=" + this.name + ", shortname=" + this.shortname + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TeamList)) {
                return false;
            }
            TeamList teamList = (TeamList) obj;
            if (this.__typename.equals(teamList.__typename) && ((str = this.f411id) != null ? str.equals(teamList.f411id) : teamList.f411id == null) && ((str2 = this.name) != null ? str2.equals(teamList.name) : teamList.name == null)) {
                String str3 = this.shortname;
                String str4 = teamList.shortname;
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
                String str = this.f411id;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.name;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.shortname;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TeamList> {
            @Override 
            public TeamList map(ResponseReader responseReader) {
                return new TeamList(responseReader.readString(TeamList.$responseFields[0]), responseReader.readString(TeamList.$responseFields[1]), responseReader.readString(TeamList.$responseFields[2]), responseReader.readString(TeamList.$responseFields[3]));
            }
        }
    }
}
