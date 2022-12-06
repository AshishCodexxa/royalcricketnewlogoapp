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

public final class SquadsQuery implements Query<SquadsQuery.Data, SquadsQuery.Data, SquadsQuery.Variables> {
    public static final String OPERATION_ID = "c43e078a82ca1cc77da996552438054aaae7fa7156f5ece5a0ff550d5f449252";
    public static final OperationName OPERATION_NAME = new OperationName() {

       @Override
        public String name() {
            return "squads";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query squads($seriesID: String!) {\n  squads(seriesID: $seriesID) {\n    __typename\n    teamID\n    fullName\n    playerData {\n      __typename\n      name\n      playerRole\n      iscap\n      iswk\n      playerName\n    }\n    name\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public SquadsQuery(String str) {
        Utils.checkNotNull(str, "seriesID == null");
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
        private String seriesID;

        Builder() {
        }

        public Builder seriesID(String str) {
            this.seriesID = str;
            return this;
        }

        public SquadsQuery build() {
            Utils.checkNotNull(this.seriesID, "seriesID == null");
            return new SquadsQuery(this.seriesID);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String seriesID;
        private final transient Map<String, Object> valueMap;

        Variables(String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.seriesID = str;
            linkedHashMap.put("seriesID", str);
        }

        public String seriesID() {
            return this.seriesID;
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
                    inputFieldWriter.writeString("seriesID", Variables.this.seriesID);
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forList("squads", "squads", new UnmodifiableMapBuilder(1).put("seriesID", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "seriesID").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final List<Squad> squads;

        public Data(List<Squad> list) {
            this.squads = list;
        }

        public List<Squad> squads() {
            return this.squads;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeList(Data.$responseFields[0], Data.this.squads, new ResponseWriter.ListWriter() {

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Squad) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{squads=" + this.squads + "}";
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
            List<Squad> list = this.squads;
            List<Squad> list2 = ((Data) obj).squads;
            if (list != null) {
                return list.equals(list2);
            }
            if (list2 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                List<Squad> list = this.squads;
                this.$hashCode = 1000003 ^ (list == null ? 0 : list.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final Squad.Mapper squadFieldMapper = new Squad.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data(responseReader.readList(Data.$responseFields[0], new ResponseReader.ListReader<Squad>() {

                    @Override 
                    public Squad read(ResponseReader.ListItemReader listItemReader) {
                        return (Squad) listItemReader.readObject(new ResponseReader.ObjectReader<Squad>() {

                            @Override 
                            public Squad read(ResponseReader responseReader) {
                                return Mapper.this.squadFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class Squad {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("fullName", "fullName", null, true, Collections.emptyList()), ResponseField.forList("playerData", "playerData", null, true, Collections.emptyList()), ResponseField.forString(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String fullName;
        final String name;
        final List<PlayerDatum> playerData;
        final String teamID;

        public Squad(String str, String str2, String str3, List<PlayerDatum> list, String str4) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.teamID = str2;
            this.fullName = str3;
            this.playerData = list;
            this.name = str4;
        }

        public String __typename() {
            return this.__typename;
        }

        public String teamID() {
            return this.teamID;
        }

        public String fullName() {
            return this.fullName;
        }

        public List<PlayerDatum> playerData() {
            return this.playerData;
        }

        public String name() {
            return this.name;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Squad.$responseFields[0], Squad.this.__typename);
                    responseWriter.writeString(Squad.$responseFields[1], Squad.this.teamID);
                    responseWriter.writeString(Squad.$responseFields[2], Squad.this.fullName);
                    responseWriter.writeList(Squad.$responseFields[3], Squad.this.playerData, new ResponseWriter.ListWriter() {

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((PlayerDatum) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeString(Squad.$responseFields[4], Squad.this.name);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Squad{__typename=" + this.__typename + ", teamID=" + this.teamID + ", fullName=" + this.fullName + ", playerData=" + this.playerData + ", name=" + this.name + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            List<PlayerDatum> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Squad)) {
                return false;
            }
            Squad squad = (Squad) obj;
            if (this.__typename.equals(squad.__typename) && ((str = this.teamID) != null ? str.equals(squad.teamID) : squad.teamID == null) && ((str2 = this.fullName) != null ? str2.equals(squad.fullName) : squad.fullName == null) && ((list = this.playerData) != null ? list.equals(squad.playerData) : squad.playerData == null)) {
                String str3 = this.name;
                String str4 = squad.name;
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
                String str = this.teamID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.fullName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                List<PlayerDatum> list = this.playerData;
                int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str3 = this.name;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Squad> {
            final PlayerDatum.Mapper playerDatumFieldMapper = new PlayerDatum.Mapper();

            @Override 
            public Squad map(ResponseReader responseReader) {
                return new Squad(responseReader.readString(Squad.$responseFields[0]), responseReader.readString(Squad.$responseFields[1]), responseReader.readString(Squad.$responseFields[2]), responseReader.readList(Squad.$responseFields[3], new ResponseReader.ListReader<PlayerDatum>() {

                    @Override 
                    public PlayerDatum read(ResponseReader.ListItemReader listItemReader) {
                        return (PlayerDatum) listItemReader.readObject(new ResponseReader.ObjectReader<PlayerDatum>() {

                            @Override 
                            public PlayerDatum read(ResponseReader responseReader) {
                                return Mapper.this.playerDatumFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readString(Squad.$responseFields[4]));
            }
        }
    }

    public static class PlayerDatum {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, null, true, Collections.emptyList()), ResponseField.forString("playerRole", "playerRole", null, true, Collections.emptyList()), ResponseField.forString("iscap", "iscap", null, true, Collections.emptyList()), ResponseField.forString("iswk", "iswk", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String iscap;
        final String iswk;
        final String name;
        final String playerName;
        final String playerRole;

        public PlayerDatum(String str, String str2, String str3, String str4, String str5, String str6) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.name = str2;
            this.playerRole = str3;
            this.iscap = str4;
            this.iswk = str5;
            this.playerName = str6;
        }

        public String __typename() {
            return this.__typename;
        }

        public String name() {
            return this.name;
        }

        public String playerRole() {
            return this.playerRole;
        }

        public String iscap() {
            return this.iscap;
        }

        public String iswk() {
            return this.iswk;
        }

        public String playerName() {
            return this.playerName;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(PlayerDatum.$responseFields[0], PlayerDatum.this.__typename);
                    responseWriter.writeString(PlayerDatum.$responseFields[1], PlayerDatum.this.name);
                    responseWriter.writeString(PlayerDatum.$responseFields[2], PlayerDatum.this.playerRole);
                    responseWriter.writeString(PlayerDatum.$responseFields[3], PlayerDatum.this.iscap);
                    responseWriter.writeString(PlayerDatum.$responseFields[4], PlayerDatum.this.iswk);
                    responseWriter.writeString(PlayerDatum.$responseFields[5], PlayerDatum.this.playerName);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "PlayerDatum{__typename=" + this.__typename + ", name=" + this.name + ", playerRole=" + this.playerRole + ", iscap=" + this.iscap + ", iswk=" + this.iswk + ", playerName=" + this.playerName + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerDatum)) {
                return false;
            }
            PlayerDatum playerDatum = (PlayerDatum) obj;
            if (this.__typename.equals(playerDatum.__typename) && ((str = this.name) != null ? str.equals(playerDatum.name) : playerDatum.name == null) && ((str2 = this.playerRole) != null ? str2.equals(playerDatum.playerRole) : playerDatum.playerRole == null) && ((str3 = this.iscap) != null ? str3.equals(playerDatum.iscap) : playerDatum.iscap == null) && ((str4 = this.iswk) != null ? str4.equals(playerDatum.iswk) : playerDatum.iswk == null)) {
                String str5 = this.playerName;
                String str6 = playerDatum.playerName;
                if (str5 == null) {
                    if (str6 == null) {
                        return true;
                    }
                } else if (str5.equals(str6)) {
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
                String str2 = this.playerRole;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.iscap;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.iswk;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerName;
                if (str5 != null) {
                    i = str5.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<PlayerDatum> {
            @Override 
            public PlayerDatum map(ResponseReader responseReader) {
                return new PlayerDatum(responseReader.readString(PlayerDatum.$responseFields[0]), responseReader.readString(PlayerDatum.$responseFields[1]), responseReader.readString(PlayerDatum.$responseFields[2]), responseReader.readString(PlayerDatum.$responseFields[3]), responseReader.readString(PlayerDatum.$responseFields[4]), responseReader.readString(PlayerDatum.$responseFields[5]));
            }
        }
    }
}
