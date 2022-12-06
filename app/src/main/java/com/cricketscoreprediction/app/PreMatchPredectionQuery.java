package com.cricketscoreprediction.app;

import androidx.core.app.NotificationCompat;
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

public final class PreMatchPredectionQuery implements Query<PreMatchPredectionQuery.Data, PreMatchPredectionQuery.Data, PreMatchPredectionQuery.Variables> {
    public static final String OPERATION_ID = "0a43c4ff70a669e08361f1c9506ba8f1a0d980e17114e56955f9124b8da4c9c7";
    public static final OperationName OPERATION_NAME = new OperationName() {

       @Override
        public String name() {
            return "preMatchPredection";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query preMatchPredection($matchId: String) {\n  preMatchPredection(matchId: $matchId) {\n    __typename\n    maxBatScore\n    maxBallScore\n    matchId\n    status\n    team1Id\n    team2Id\n    playerList {\n      __typename\n      playerId\n      teamId\n      playerRole\n      playerName\n      shortName\n      fullname\n      listProjections {\n        __typename\n        role\n        values {\n          __typename\n          probabilities\n          bound\n        }\n      }\n    }\n    teams_Runs_Projection {\n      __typename\n      teamScore\n      teamId\n      teamName\n    }\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public PreMatchPredectionQuery(Input<String> input) {
        Utils.checkNotNull(input, "matchId == null");
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
        private Input<String> matchId = Input.absent();

        Builder() {
        }

        public Builder matchId(String str) {
            this.matchId = Input.fromNullable(str);
            return this;
        }

        public Builder matchIdInput(Input<String> input) {
            this.matchId = (Input) Utils.checkNotNull(input, "matchId == null");
            return this;
        }

        public PreMatchPredectionQuery build() {
            return new PreMatchPredectionQuery(this.matchId);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final Input<String> matchId;
        private final transient Map<String, Object> valueMap;

        Variables(Input<String> input) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.matchId = input;
            if (input.defined) {
                linkedHashMap.put("matchId", input.value);
            }
        }

        public Input<String> matchId() {
            return this.matchId;
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
                    if (Variables.this.matchId.defined) {
                        inputFieldWriter.writeString("matchId", Variables.this.matchId.value);
                    }
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("preMatchPredection", "preMatchPredection", new UnmodifiableMapBuilder(1).put("matchId", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "matchId").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final PreMatchPredection preMatchPredection;

        public Data(PreMatchPredection preMatchPredection2) {
            this.preMatchPredection = preMatchPredection2;
        }

        public PreMatchPredection preMatchPredection() {
            return this.preMatchPredection;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.preMatchPredection != null ? Data.this.preMatchPredection.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{preMatchPredection=" + this.preMatchPredection + "}";
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
            PreMatchPredection preMatchPredection2 = this.preMatchPredection;
            PreMatchPredection preMatchPredection3 = ((Data) obj).preMatchPredection;
            if (preMatchPredection2 != null) {
                return preMatchPredection2.equals(preMatchPredection3);
            }
            if (preMatchPredection3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                PreMatchPredection preMatchPredection2 = this.preMatchPredection;
                this.$hashCode = 1000003 ^ (preMatchPredection2 == null ? 0 : preMatchPredection2.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final PreMatchPredection.Mapper preMatchPredectionFieldMapper = new PreMatchPredection.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((PreMatchPredection) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<PreMatchPredection>() {

                    @Override 
                    public PreMatchPredection read(ResponseReader responseReader) {
                        return Mapper.this.preMatchPredectionFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class PreMatchPredection {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("maxBatScore", "maxBatScore", null, true, Collections.emptyList()), ResponseField.forInt("maxBallScore", "maxBallScore", null, true, Collections.emptyList()), ResponseField.forString("matchId", "matchId", null, true, Collections.emptyList()), ResponseField.forString(NotificationCompat.CATEGORY_STATUS, NotificationCompat.CATEGORY_STATUS, null, true, Collections.emptyList()), ResponseField.forString("team1Id", "team1Id", null, true, Collections.emptyList()), ResponseField.forString("team2Id", "team2Id", null, true, Collections.emptyList()), ResponseField.forList("playerList", "playerList", null, true, Collections.emptyList()), ResponseField.forList("teams_Runs_Projection", "teams_Runs_Projection", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String matchId;
        final Integer maxBallScore;
        final Integer maxBatScore;
        final List<PlayerList> playerList;
        final String status;
        final String team1Id;
        final String team2Id;
        final List<Teams_Runs_Projection> teams_Runs_Projection;

        public PreMatchPredection(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, List<PlayerList> list, List<Teams_Runs_Projection> list2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.maxBatScore = num;
            this.maxBallScore = num2;
            this.matchId = str2;
            this.status = str3;
            this.team1Id = str4;
            this.team2Id = str5;
            this.playerList = list;
            this.teams_Runs_Projection = list2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer maxBatScore() {
            return this.maxBatScore;
        }

        public Integer maxBallScore() {
            return this.maxBallScore;
        }

        public String matchId() {
            return this.matchId;
        }

        public String status() {
            return this.status;
        }

        public String team1Id() {
            return this.team1Id;
        }

        public String team2Id() {
            return this.team2Id;
        }

        public List<PlayerList> playerList() {
            return this.playerList;
        }

        public List<Teams_Runs_Projection> teams_Runs_Projection() {
            return this.teams_Runs_Projection;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(PreMatchPredection.$responseFields[0], PreMatchPredection.this.__typename);
                    responseWriter.writeInt(PreMatchPredection.$responseFields[1], PreMatchPredection.this.maxBatScore);
                    responseWriter.writeInt(PreMatchPredection.$responseFields[2], PreMatchPredection.this.maxBallScore);
                    responseWriter.writeString(PreMatchPredection.$responseFields[3], PreMatchPredection.this.matchId);
                    responseWriter.writeString(PreMatchPredection.$responseFields[4], PreMatchPredection.this.status);
                    responseWriter.writeString(PreMatchPredection.$responseFields[5], PreMatchPredection.this.team1Id);
                    responseWriter.writeString(PreMatchPredection.$responseFields[6], PreMatchPredection.this.team2Id);
                    responseWriter.writeList(PreMatchPredection.$responseFields[7], PreMatchPredection.this.playerList, new ResponseWriter.ListWriter() {

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((PlayerList) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(PreMatchPredection.$responseFields[8], PreMatchPredection.this.teams_Runs_Projection, new ResponseWriter.ListWriter() {

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Teams_Runs_Projection) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "PreMatchPredection{__typename=" + this.__typename + ", maxBatScore=" + this.maxBatScore + ", maxBallScore=" + this.maxBallScore + ", matchId=" + this.matchId + ", status=" + this.status + ", team1Id=" + this.team1Id + ", team2Id=" + this.team2Id + ", playerList=" + this.playerList + ", teams_Runs_Projection=" + this.teams_Runs_Projection + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            String str;
            String str2;
            String str3;
            String str4;
            List<PlayerList> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PreMatchPredection)) {
                return false;
            }
            PreMatchPredection preMatchPredection = (PreMatchPredection) obj;
            if (this.__typename.equals(preMatchPredection.__typename) && ((num = this.maxBatScore) != null ? num.equals(preMatchPredection.maxBatScore) : preMatchPredection.maxBatScore == null) && ((num2 = this.maxBallScore) != null ? num2.equals(preMatchPredection.maxBallScore) : preMatchPredection.maxBallScore == null) && ((str = this.matchId) != null ? str.equals(preMatchPredection.matchId) : preMatchPredection.matchId == null) && ((str2 = this.status) != null ? str2.equals(preMatchPredection.status) : preMatchPredection.status == null) && ((str3 = this.team1Id) != null ? str3.equals(preMatchPredection.team1Id) : preMatchPredection.team1Id == null) && ((str4 = this.team2Id) != null ? str4.equals(preMatchPredection.team2Id) : preMatchPredection.team2Id == null) && ((list = this.playerList) != null ? list.equals(preMatchPredection.playerList) : preMatchPredection.playerList == null)) {
                List<Teams_Runs_Projection> list2 = this.teams_Runs_Projection;
                List<Teams_Runs_Projection> list3 = preMatchPredection.teams_Runs_Projection;
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
                Integer num = this.maxBatScore;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.maxBallScore;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                String str = this.matchId;
                int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.status;
                int hashCode5 = (hashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.team1Id;
                int hashCode6 = (hashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.team2Id;
                int hashCode7 = (hashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                List<PlayerList> list = this.playerList;
                int hashCode8 = (hashCode7 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Teams_Runs_Projection> list2 = this.teams_Runs_Projection;
                if (list2 != null) {
                    i = list2.hashCode();
                }
                this.$hashCode = hashCode8 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<PreMatchPredection> {
            final PlayerList.Mapper playerListFieldMapper = new PlayerList.Mapper();
            final Teams_Runs_Projection.Mapper teams_Runs_ProjectionFieldMapper = new Teams_Runs_Projection.Mapper();

            @Override 
            public PreMatchPredection map(ResponseReader responseReader) {
                return new PreMatchPredection(responseReader.readString(PreMatchPredection.$responseFields[0]), responseReader.readInt(PreMatchPredection.$responseFields[1]), responseReader.readInt(PreMatchPredection.$responseFields[2]), responseReader.readString(PreMatchPredection.$responseFields[3]), responseReader.readString(PreMatchPredection.$responseFields[4]), responseReader.readString(PreMatchPredection.$responseFields[5]), responseReader.readString(PreMatchPredection.$responseFields[6]), responseReader.readList(PreMatchPredection.$responseFields[7], new ResponseReader.ListReader<PlayerList>() {

                    @Override 
                    public PlayerList read(ResponseReader.ListItemReader listItemReader) {
                        return (PlayerList) listItemReader.readObject(new ResponseReader.ObjectReader<PlayerList>() {

                            @Override 
                            public PlayerList read(ResponseReader responseReader) {
                                return Mapper.this.playerListFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(PreMatchPredection.$responseFields[8], new ResponseReader.ListReader<Teams_Runs_Projection>() {

                    @Override 
                    public Teams_Runs_Projection read(ResponseReader.ListItemReader listItemReader) {
                        return (Teams_Runs_Projection) listItemReader.readObject(new ResponseReader.ObjectReader<Teams_Runs_Projection>() {

                            @Override 
                            public Teams_Runs_Projection read(ResponseReader responseReader) {
                                return Mapper.this.teams_Runs_ProjectionFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class PlayerList {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerId", "playerId", null, true, Collections.emptyList()), ResponseField.forString("teamId", "teamId", null, true, Collections.emptyList()), ResponseField.forString("playerRole", "playerRole", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("shortName", "shortName", null, true, Collections.emptyList()), ResponseField.forString("fullname", "fullname", null, true, Collections.emptyList()), ResponseField.forList("listProjections", "listProjections", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String fullname;
        final List<ListProjection> listProjections;
        final String playerId;
        final String playerName;
        final String playerRole;
        final String shortName;
        final String teamId;

        public PlayerList(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<ListProjection> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerId = str2;
            this.teamId = str3;
            this.playerRole = str4;
            this.playerName = str5;
            this.shortName = str6;
            this.fullname = str7;
            this.listProjections = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerId() {
            return this.playerId;
        }

        public String teamId() {
            return this.teamId;
        }

        public String playerRole() {
            return this.playerRole;
        }

        public String playerName() {
            return this.playerName;
        }

        public String shortName() {
            return this.shortName;
        }

        public String fullname() {
            return this.fullname;
        }

        public List<ListProjection> listProjections() {
            return this.listProjections;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(PlayerList.$responseFields[0], PlayerList.this.__typename);
                    responseWriter.writeString(PlayerList.$responseFields[1], PlayerList.this.playerId);
                    responseWriter.writeString(PlayerList.$responseFields[2], PlayerList.this.teamId);
                    responseWriter.writeString(PlayerList.$responseFields[3], PlayerList.this.playerRole);
                    responseWriter.writeString(PlayerList.$responseFields[4], PlayerList.this.playerName);
                    responseWriter.writeString(PlayerList.$responseFields[5], PlayerList.this.shortName);
                    responseWriter.writeString(PlayerList.$responseFields[6], PlayerList.this.fullname);
                    responseWriter.writeList(PlayerList.$responseFields[7], PlayerList.this.listProjections, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((ListProjection) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "PlayerList{__typename=" + this.__typename + ", playerId=" + this.playerId + ", teamId=" + this.teamId + ", playerRole=" + this.playerRole + ", playerName=" + this.playerName + ", shortName=" + this.shortName + ", fullname=" + this.fullname + ", listProjections=" + this.listProjections + "}";
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
            if (!(obj instanceof PlayerList)) {
                return false;
            }
            PlayerList playerList = (PlayerList) obj;
            if (this.__typename.equals(playerList.__typename) && ((str = this.playerId) != null ? str.equals(playerList.playerId) : playerList.playerId == null) && ((str2 = this.teamId) != null ? str2.equals(playerList.teamId) : playerList.teamId == null) && ((str3 = this.playerRole) != null ? str3.equals(playerList.playerRole) : playerList.playerRole == null) && ((str4 = this.playerName) != null ? str4.equals(playerList.playerName) : playerList.playerName == null) && ((str5 = this.shortName) != null ? str5.equals(playerList.shortName) : playerList.shortName == null) && ((str6 = this.fullname) != null ? str6.equals(playerList.fullname) : playerList.fullname == null)) {
                List<ListProjection> list = this.listProjections;
                List<ListProjection> list2 = playerList.listProjections;
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
                String str = this.playerId;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.teamId;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerRole;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerName;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.shortName;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.fullname;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                List<ListProjection> list = this.listProjections;
                if (list != null) {
                    i = list.hashCode();
                }
                this.$hashCode = hashCode7 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<PlayerList> {
            final ListProjection.Mapper listProjectionFieldMapper = new ListProjection.Mapper();

            @Override 
            public PlayerList map(ResponseReader responseReader) {
                return new PlayerList(responseReader.readString(PlayerList.$responseFields[0]), responseReader.readString(PlayerList.$responseFields[1]), responseReader.readString(PlayerList.$responseFields[2]), responseReader.readString(PlayerList.$responseFields[3]), responseReader.readString(PlayerList.$responseFields[4]), responseReader.readString(PlayerList.$responseFields[5]), responseReader.readString(PlayerList.$responseFields[6]), responseReader.readList(PlayerList.$responseFields[7], new ResponseReader.ListReader<ListProjection>() {

                    @Override 
                    public ListProjection read(ResponseReader.ListItemReader listItemReader) {
                        return (ListProjection) listItemReader.readObject(new ResponseReader.ObjectReader<ListProjection>() {

                            @Override 
                            public ListProjection read(ResponseReader responseReader) {
                                return Mapper.this.listProjectionFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class ListProjection {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("role", "role", null, true, Collections.emptyList()), ResponseField.forList("values", "values", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String role;
        final List<Value> values;

        public ListProjection(String str, String str2, List<Value> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.role = str2;
            this.values = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public String role() {
            return this.role;
        }

        public List<Value> values() {
            return this.values;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(ListProjection.$responseFields[0], ListProjection.this.__typename);
                    responseWriter.writeString(ListProjection.$responseFields[1], ListProjection.this.role);
                    responseWriter.writeList(ListProjection.$responseFields[2], ListProjection.this.values, new ResponseWriter.ListWriter() {

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Value) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "ListProjection{__typename=" + this.__typename + ", role=" + this.role + ", values=" + this.values + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ListProjection)) {
                return false;
            }
            ListProjection listProjection = (ListProjection) obj;
            if (this.__typename.equals(listProjection.__typename) && ((str = this.role) != null ? str.equals(listProjection.role) : listProjection.role == null)) {
                List<Value> list = this.values;
                List<Value> list2 = listProjection.values;
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
                String str = this.role;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                List<Value> list = this.values;
                if (list != null) {
                    i = list.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<ListProjection> {
            final Value.Mapper valueFieldMapper = new Value.Mapper();

            @Override 
            public ListProjection map(ResponseReader responseReader) {
                return new ListProjection(responseReader.readString(ListProjection.$responseFields[0]), responseReader.readString(ListProjection.$responseFields[1]), responseReader.readList(ListProjection.$responseFields[2], new ResponseReader.ListReader<Value>() {

                    @Override 
                    public Value read(ResponseReader.ListItemReader listItemReader) {
                        return (Value) listItemReader.readObject(new ResponseReader.ObjectReader<Value>() {

                            @Override 
                            public Value read(ResponseReader responseReader) {
                                return Mapper.this.valueFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class Value {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("probabilities", "probabilities", null, true, Collections.emptyList()), ResponseField.forString("bound", "bound", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String bound;
        final String probabilities;

        public Value(String str, String str2, String str3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.probabilities = str2;
            this.bound = str3;
        }

        public String __typename() {
            return this.__typename;
        }

        public String probabilities() {
            return this.probabilities;
        }

        public String bound() {
            return this.bound;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Value.$responseFields[0], Value.this.__typename);
                    responseWriter.writeString(Value.$responseFields[1], Value.this.probabilities);
                    responseWriter.writeString(Value.$responseFields[2], Value.this.bound);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Value{__typename=" + this.__typename + ", probabilities=" + this.probabilities + ", bound=" + this.bound + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            if (this.__typename.equals(value.__typename) && ((str = this.probabilities) != null ? str.equals(value.probabilities) : value.probabilities == null)) {
                String str2 = this.bound;
                String str3 = value.bound;
                if (str2 == null) {
                    if (str3 == null) {
                        return true;
                    }
                } else if (str2.equals(str3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.probabilities;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.bound;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Value> {
            @Override 
            public Value map(ResponseReader responseReader) {
                return new Value(responseReader.readString(Value.$responseFields[0]), responseReader.readString(Value.$responseFields[1]), responseReader.readString(Value.$responseFields[2]));
            }
        }
    }

    public static class Teams_Runs_Projection {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamScore", "teamScore", null, true, Collections.emptyList()), ResponseField.forString("teamId", "teamId", null, true, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String teamId;
        final String teamName;
        final String teamScore;

        public Teams_Runs_Projection(String str, String str2, String str3, String str4) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.teamScore = str2;
            this.teamId = str3;
            this.teamName = str4;
        }

        public String __typename() {
            return this.__typename;
        }

        public String teamScore() {
            return this.teamScore;
        }

        public String teamId() {
            return this.teamId;
        }

        public String teamName() {
            return this.teamName;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Teams_Runs_Projection.$responseFields[0], Teams_Runs_Projection.this.__typename);
                    responseWriter.writeString(Teams_Runs_Projection.$responseFields[1], Teams_Runs_Projection.this.teamScore);
                    responseWriter.writeString(Teams_Runs_Projection.$responseFields[2], Teams_Runs_Projection.this.teamId);
                    responseWriter.writeString(Teams_Runs_Projection.$responseFields[3], Teams_Runs_Projection.this.teamName);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Teams_Runs_Projection{__typename=" + this.__typename + ", teamScore=" + this.teamScore + ", teamId=" + this.teamId + ", teamName=" + this.teamName + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Teams_Runs_Projection)) {
                return false;
            }
            Teams_Runs_Projection teams_Runs_Projection = (Teams_Runs_Projection) obj;
            if (this.__typename.equals(teams_Runs_Projection.__typename) && ((str = this.teamScore) != null ? str.equals(teams_Runs_Projection.teamScore) : teams_Runs_Projection.teamScore == null) && ((str2 = this.teamId) != null ? str2.equals(teams_Runs_Projection.teamId) : teams_Runs_Projection.teamId == null)) {
                String str3 = this.teamName;
                String str4 = teams_Runs_Projection.teamName;
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
                String str = this.teamScore;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.teamId;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.teamName;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Teams_Runs_Projection> {
            @Override 
            public Teams_Runs_Projection map(ResponseReader responseReader) {
                return new Teams_Runs_Projection(responseReader.readString(Teams_Runs_Projection.$responseFields[0]), responseReader.readString(Teams_Runs_Projection.$responseFields[1]), responseReader.readString(Teams_Runs_Projection.$responseFields[2]), responseReader.readString(Teams_Runs_Projection.$responseFields[3]));
            }
        }
    }
}
