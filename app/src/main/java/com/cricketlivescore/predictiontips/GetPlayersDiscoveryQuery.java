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

public final class GetPlayersDiscoveryQuery implements Query<GetPlayersDiscoveryQuery.Data, GetPlayersDiscoveryQuery.Data, Operation.Variables> {
    public static final String OPERATION_ID = "d8c3782478338af631273efdd218e473e936fecf1cf4c26b3a033bfdbc3d0564";
    public static final OperationName OPERATION_NAME = new OperationName() {


       @Override
        public String name() {
            return "getPlayersDiscovery";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query getPlayersDiscovery {\n  getPlayersDiscovery {\n    __typename\n    popularPlayer {\n      __typename\n      id\n      name\n      shortname\n    }\n    playerByCategory {\n      __typename\n      type\n      playerList {\n        __typename\n        id\n        name\n        shortname\n      }\n    }\n  }\n}");
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

        public GetPlayersDiscoveryQuery build() {
            return new GetPlayersDiscoveryQuery();
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getPlayersDiscovery", "getPlayersDiscovery", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final GetPlayersDiscovery getPlayersDiscovery;

        public Data(GetPlayersDiscovery getPlayersDiscovery2) {
            this.getPlayersDiscovery = getPlayersDiscovery2;
        }

        public GetPlayersDiscovery getPlayersDiscovery() {
            return this.getPlayersDiscovery;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.getPlayersDiscovery != null ? Data.this.getPlayersDiscovery.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getPlayersDiscovery=" + this.getPlayersDiscovery + "}";
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
            GetPlayersDiscovery getPlayersDiscovery2 = this.getPlayersDiscovery;
            GetPlayersDiscovery getPlayersDiscovery3 = ((Data) obj).getPlayersDiscovery;
            if (getPlayersDiscovery2 != null) {
                return getPlayersDiscovery2.equals(getPlayersDiscovery3);
            }
            if (getPlayersDiscovery3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetPlayersDiscovery getPlayersDiscovery2 = this.getPlayersDiscovery;
                this.$hashCode = 1000003 ^ (getPlayersDiscovery2 == null ? 0 : getPlayersDiscovery2.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetPlayersDiscovery.Mapper getPlayersDiscoveryFieldMapper = new GetPlayersDiscovery.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((GetPlayersDiscovery) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetPlayersDiscovery>() {


                    @Override 
                    public GetPlayersDiscovery read(ResponseReader responseReader) {
                        return Mapper.this.getPlayersDiscoveryFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class GetPlayersDiscovery {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("popularPlayer", "popularPlayer", null, true, Collections.emptyList()), ResponseField.forList("playerByCategory", "playerByCategory", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<PlayerByCategory> playerByCategory;
        final List<PopularPlayer> popularPlayer;

        public GetPlayersDiscovery(String str, List<PopularPlayer> list, List<PlayerByCategory> list2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.popularPlayer = list;
            this.playerByCategory = list2;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<PopularPlayer> popularPlayer() {
            return this.popularPlayer;
        }

        public List<PlayerByCategory> playerByCategory() {
            return this.playerByCategory;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(GetPlayersDiscovery.$responseFields[0], GetPlayersDiscovery.this.__typename);
                    responseWriter.writeList(GetPlayersDiscovery.$responseFields[1], GetPlayersDiscovery.this.popularPlayer, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((PopularPlayer) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(GetPlayersDiscovery.$responseFields[2], GetPlayersDiscovery.this.playerByCategory, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((PlayerByCategory) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetPlayersDiscovery{__typename=" + this.__typename + ", popularPlayer=" + this.popularPlayer + ", playerByCategory=" + this.playerByCategory + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<PopularPlayer> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetPlayersDiscovery)) {
                return false;
            }
            GetPlayersDiscovery getPlayersDiscovery = (GetPlayersDiscovery) obj;
            if (this.__typename.equals(getPlayersDiscovery.__typename) && ((list = this.popularPlayer) != null ? list.equals(getPlayersDiscovery.popularPlayer) : getPlayersDiscovery.popularPlayer == null)) {
                List<PlayerByCategory> list2 = this.playerByCategory;
                List<PlayerByCategory> list3 = getPlayersDiscovery.playerByCategory;
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
                List<PopularPlayer> list = this.popularPlayer;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<PlayerByCategory> list2 = this.playerByCategory;
                if (list2 != null) {
                    i = list2.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<GetPlayersDiscovery> {
            final PlayerByCategory.Mapper playerByCategoryFieldMapper = new PlayerByCategory.Mapper();
            final PopularPlayer.Mapper popularPlayerFieldMapper = new PopularPlayer.Mapper();

            @Override 
            public GetPlayersDiscovery map(ResponseReader responseReader) {
                return new GetPlayersDiscovery(responseReader.readString(GetPlayersDiscovery.$responseFields[0]), responseReader.readList(GetPlayersDiscovery.$responseFields[1], new ResponseReader.ListReader<PopularPlayer>() {


                    @Override 
                    public PopularPlayer read(ResponseReader.ListItemReader listItemReader) {
                        return (PopularPlayer) listItemReader.readObject(new ResponseReader.ObjectReader<PopularPlayer>() {


                            @Override 
                            public PopularPlayer read(ResponseReader responseReader) {
                                return Mapper.this.popularPlayerFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(GetPlayersDiscovery.$responseFields[2], new ResponseReader.ListReader<PlayerByCategory>() {


                    @Override 
                    public PlayerByCategory read(ResponseReader.ListItemReader listItemReader) {
                        return (PlayerByCategory) listItemReader.readObject(new ResponseReader.ObjectReader<PlayerByCategory>() {


                            @Override 
                            public PlayerByCategory read(ResponseReader responseReader) {
                                return Mapper.this.playerByCategoryFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class PopularPlayer {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("id", "id", null, true, Collections.emptyList()), ResponseField.forString(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, null, true, Collections.emptyList()), ResponseField.forString("shortname", "shortname", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;

        
        final String f406id;
        final String name;
        final String shortname;

        public PopularPlayer(String str, String str2, String str3, String str4) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.f406id = str2;
            this.name = str3;
            this.shortname = str4;
        }

        public String __typename() {
            return this.__typename;
        }

        
        public String mo51644id() {
            return this.f406id;
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
                    responseWriter.writeString(PopularPlayer.$responseFields[0], PopularPlayer.this.__typename);
                    responseWriter.writeString(PopularPlayer.$responseFields[1], PopularPlayer.this.f406id);
                    responseWriter.writeString(PopularPlayer.$responseFields[2], PopularPlayer.this.name);
                    responseWriter.writeString(PopularPlayer.$responseFields[3], PopularPlayer.this.shortname);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "PopularPlayer{__typename=" + this.__typename + ", id=" + this.f406id + ", name=" + this.name + ", shortname=" + this.shortname + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PopularPlayer)) {
                return false;
            }
            PopularPlayer popularPlayer = (PopularPlayer) obj;
            if (this.__typename.equals(popularPlayer.__typename) && ((str = this.f406id) != null ? str.equals(popularPlayer.f406id) : popularPlayer.f406id == null) && ((str2 = this.name) != null ? str2.equals(popularPlayer.name) : popularPlayer.name == null)) {
                String str3 = this.shortname;
                String str4 = popularPlayer.shortname;
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
                String str = this.f406id;
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

        public static final class Mapper implements ResponseFieldMapper<PopularPlayer> {
            @Override 
            public PopularPlayer map(ResponseReader responseReader) {
                return new PopularPlayer(responseReader.readString(PopularPlayer.$responseFields[0]), responseReader.readString(PopularPlayer.$responseFields[1]), responseReader.readString(PopularPlayer.$responseFields[2]), responseReader.readString(PopularPlayer.$responseFields[3]));
            }
        }
    }

    public static class PlayerByCategory {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("type", "type", null, true, Collections.emptyList()), ResponseField.forList("playerList", "playerList", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<PlayerList> playerList;
        final String type;

        public PlayerByCategory(String str, String str2, List<PlayerList> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.type = str2;
            this.playerList = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public String type() {
            return this.type;
        }

        public List<PlayerList> playerList() {
            return this.playerList;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(PlayerByCategory.$responseFields[0], PlayerByCategory.this.__typename);
                    responseWriter.writeString(PlayerByCategory.$responseFields[1], PlayerByCategory.this.type);
                    responseWriter.writeList(PlayerByCategory.$responseFields[2], PlayerByCategory.this.playerList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((PlayerList) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "PlayerByCategory{__typename=" + this.__typename + ", type=" + this.type + ", playerList=" + this.playerList + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerByCategory)) {
                return false;
            }
            PlayerByCategory playerByCategory = (PlayerByCategory) obj;
            if (this.__typename.equals(playerByCategory.__typename) && ((str = this.type) != null ? str.equals(playerByCategory.type) : playerByCategory.type == null)) {
                List<PlayerList> list = this.playerList;
                List<PlayerList> list2 = playerByCategory.playerList;
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
                List<PlayerList> list = this.playerList;
                if (list != null) {
                    i = list.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<PlayerByCategory> {
            final PlayerList.Mapper playerListFieldMapper = new PlayerList.Mapper();

            @Override 
            public PlayerByCategory map(ResponseReader responseReader) {
                return new PlayerByCategory(responseReader.readString(PlayerByCategory.$responseFields[0]), responseReader.readString(PlayerByCategory.$responseFields[1]), responseReader.readList(PlayerByCategory.$responseFields[2], new ResponseReader.ListReader<PlayerList>() {


                    @Override 
                    public PlayerList read(ResponseReader.ListItemReader listItemReader) {
                        return (PlayerList) listItemReader.readObject(new ResponseReader.ObjectReader<PlayerList>() {


                            @Override 
                            public PlayerList read(ResponseReader responseReader) {
                                return Mapper.this.playerListFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class PlayerList {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("id", "id", null, true, Collections.emptyList()), ResponseField.forString(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, null, true, Collections.emptyList()), ResponseField.forString("shortname", "shortname", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;

        
        final String f405id;
        final String name;
        final String shortname;

        public PlayerList(String str, String str2, String str3, String str4) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.f405id = str2;
            this.name = str3;
            this.shortname = str4;
        }

        public String __typename() {
            return this.__typename;
        }

        
        public String mo51636id() {
            return this.f405id;
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
                    responseWriter.writeString(PlayerList.$responseFields[0], PlayerList.this.__typename);
                    responseWriter.writeString(PlayerList.$responseFields[1], PlayerList.this.f405id);
                    responseWriter.writeString(PlayerList.$responseFields[2], PlayerList.this.name);
                    responseWriter.writeString(PlayerList.$responseFields[3], PlayerList.this.shortname);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "PlayerList{__typename=" + this.__typename + ", id=" + this.f405id + ", name=" + this.name + ", shortname=" + this.shortname + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerList)) {
                return false;
            }
            PlayerList playerList = (PlayerList) obj;
            if (this.__typename.equals(playerList.__typename) && ((str = this.f405id) != null ? str.equals(playerList.f405id) : playerList.f405id == null) && ((str2 = this.name) != null ? str2.equals(playerList.name) : playerList.name == null)) {
                String str3 = this.shortname;
                String str4 = playerList.shortname;
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
                String str = this.f405id;
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

        public static final class Mapper implements ResponseFieldMapper<PlayerList> {
            @Override 
            public PlayerList map(ResponseReader responseReader) {
                return new PlayerList(responseReader.readString(PlayerList.$responseFields[0]), responseReader.readString(PlayerList.$responseFields[1]), responseReader.readString(PlayerList.$responseFields[2]), responseReader.readString(PlayerList.$responseFields[3]));
            }
        }
    }
}
