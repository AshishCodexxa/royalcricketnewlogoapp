package com.cricketscoreprediction.app;

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

public final class PlayerIndexQuery implements Query<PlayerIndexQuery.Data, PlayerIndexQuery.Data, Operation.Variables> {
    public static final String OPERATION_ID = "3de9d50bc25a2ea2b3df01369b16c55aa0c337eac368870473fc3d9da53b0f52";
    public static final OperationName OPERATION_NAME = new OperationName() {

        @Override 
        public String name() {
            return "playerIndex";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query playerIndex {\n  playerIndex {\n    __typename\n    playerObject {\n      __typename\n      playerID\n      playerName\n      playerTeamID\n      playerTeamName\n      totalPoints\n      teamColor\n    }\n  }\n}");
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

        public PlayerIndexQuery build() {
            return new PlayerIndexQuery();
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("playerIndex", "playerIndex", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final PlayerIndex playerIndex;

        public Data(PlayerIndex playerIndex2) {
            this.playerIndex = playerIndex2;
        }

        public PlayerIndex playerIndex() {
            return this.playerIndex;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.playerIndex != null ? Data.this.playerIndex.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{playerIndex=" + this.playerIndex + "}";
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
            PlayerIndex playerIndex2 = this.playerIndex;
            PlayerIndex playerIndex3 = ((Data) obj).playerIndex;
            if (playerIndex2 != null) {
                return playerIndex2.equals(playerIndex3);
            }
            if (playerIndex3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                PlayerIndex playerIndex2 = this.playerIndex;
                this.$hashCode = 1000003 ^ (playerIndex2 == null ? 0 : playerIndex2.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final PlayerIndex.Mapper playerIndexFieldMapper = new PlayerIndex.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((PlayerIndex) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<PlayerIndex>() {

                    @Override
                    public PlayerIndex read(ResponseReader responseReader) {
                        return Mapper.this.playerIndexFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class PlayerIndex {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("playerObject", "playerObject", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<PlayerObject> playerObject;

        public PlayerIndex(String str, List<PlayerObject> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerObject = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<PlayerObject> playerObject() {
            return this.playerObject;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {
             
                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(PlayerIndex.$responseFields[0], PlayerIndex.this.__typename);
                    responseWriter.writeList(PlayerIndex.$responseFields[1], PlayerIndex.this.playerObject, new ResponseWriter.ListWriter() {
                    
                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((PlayerObject) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "PlayerIndex{__typename=" + this.__typename + ", playerObject=" + this.playerObject + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerIndex)) {
                return false;
            }
            PlayerIndex playerIndex = (PlayerIndex) obj;
            if (this.__typename.equals(playerIndex.__typename)) {
                List<PlayerObject> list = this.playerObject;
                List<PlayerObject> list2 = playerIndex.playerObject;
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
                List<PlayerObject> list = this.playerObject;
                this.$hashCode = hashCode ^ (list == null ? 0 : list.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<PlayerIndex> {
            final PlayerObject.Mapper playerObjectFieldMapper = new PlayerObject.Mapper();

            @Override
            public PlayerIndex map(ResponseReader responseReader) {
                return new PlayerIndex(responseReader.readString(PlayerIndex.$responseFields[0]), responseReader.readList(PlayerIndex.$responseFields[1], new ResponseReader.ListReader<PlayerObject>() {
                   

                    @Override 
                    public PlayerObject read(ResponseReader.ListItemReader listItemReader) {
                        return (PlayerObject) listItemReader.readObject(new ResponseReader.ObjectReader<PlayerObject>() {
                           

                            @Override
                            public PlayerObject read(ResponseReader responseReader) {
                                return Mapper.this.playerObjectFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class PlayerObject {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerTeamID", "playerTeamID", null, true, Collections.emptyList()), ResponseField.forString("playerTeamName", "playerTeamName", null, true, Collections.emptyList()), ResponseField.forString("totalPoints", "totalPoints", null, true, Collections.emptyList()), ResponseField.forString("teamColor", "teamColor", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String playerID;
        final String playerName;
        final String playerTeamID;
        final String playerTeamName;
        final String teamColor;
        final String totalPoints;

        public PlayerObject(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerName = str3;
            this.playerTeamID = str4;
            this.playerTeamName = str5;
            this.totalPoints = str6;
            this.teamColor = str7;
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

        public String totalPoints() {
            return this.totalPoints;
        }

        public String teamColor() {
            return this.teamColor;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(PlayerObject.$responseFields[0], PlayerObject.this.__typename);
                    responseWriter.writeString(PlayerObject.$responseFields[1], PlayerObject.this.playerID);
                    responseWriter.writeString(PlayerObject.$responseFields[2], PlayerObject.this.playerName);
                    responseWriter.writeString(PlayerObject.$responseFields[3], PlayerObject.this.playerTeamID);
                    responseWriter.writeString(PlayerObject.$responseFields[4], PlayerObject.this.playerTeamName);
                    responseWriter.writeString(PlayerObject.$responseFields[5], PlayerObject.this.totalPoints);
                    responseWriter.writeString(PlayerObject.$responseFields[6], PlayerObject.this.teamColor);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "PlayerObject{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerTeamID=" + this.playerTeamID + ", playerTeamName=" + this.playerTeamName + ", totalPoints=" + this.totalPoints + ", teamColor=" + this.teamColor + "}";
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
            if (!(obj instanceof PlayerObject)) {
                return false;
            }
            PlayerObject playerObject = (PlayerObject) obj;
            if (this.__typename.equals(playerObject.__typename) && ((str = this.playerID) != null ? str.equals(playerObject.playerID) : playerObject.playerID == null) && ((str2 = this.playerName) != null ? str2.equals(playerObject.playerName) : playerObject.playerName == null) && ((str3 = this.playerTeamID) != null ? str3.equals(playerObject.playerTeamID) : playerObject.playerTeamID == null) && ((str4 = this.playerTeamName) != null ? str4.equals(playerObject.playerTeamName) : playerObject.playerTeamName == null) && ((str5 = this.totalPoints) != null ? str5.equals(playerObject.totalPoints) : playerObject.totalPoints == null)) {
                String str6 = this.teamColor;
                String str7 = playerObject.teamColor;
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
                String str = this.playerID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerTeamID;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerTeamName;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.totalPoints;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.teamColor;
                if (str6 != null) {
                    i = str6.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<PlayerObject> {
            @Override 
            public PlayerObject map(ResponseReader responseReader) {
                return new PlayerObject(responseReader.readString(PlayerObject.$responseFields[0]), responseReader.readString(PlayerObject.$responseFields[1]), responseReader.readString(PlayerObject.$responseFields[2]), responseReader.readString(PlayerObject.$responseFields[3]), responseReader.readString(PlayerObject.$responseFields[4]), responseReader.readString(PlayerObject.$responseFields[5]), responseReader.readString(PlayerObject.$responseFields[6]));
            }
        }
    }
}
