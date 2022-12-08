package com.cricketlivescore.predictiontips;

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

public final class GetFantasySixTeamsQuery implements Query<GetFantasySixTeamsQuery.Data, GetFantasySixTeamsQuery.Data, GetFantasySixTeamsQuery.Variables> {
    public static final String OPERATION_ID = "5b9a513eb0b4156a061c3872554dc08a8783d44839c201fbbed80772d430aae7";
    public static final OperationName OPERATION_NAME = new OperationName() {


       @Override
        public String name() {
            return "getFantasySixTeams";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query getFantasySixTeams($matchID:String!, $token:String) {\n  getFantasySixTeams(matchID:$matchID, token:$token) {\n    __typename\n    teamtotalpoints\n    fantasy_teamName\n    timestamp\n    totalProjectedPoints\n    all_rounder {\n      __typename\n      playerName\n      playerNameHindi\n      credits\n      playerId\n      captain\n      vice_captain\n      player_role\n      teamID\n      totalPoints\n      projectedPoints\n    }\n    bowler {\n      __typename\n      playerName\n      playerNameHindi\n      credits\n      playerId\n      captain\n      vice_captain\n      teamID\n      totalPoints\n      player_role\n      projectedPoints\n    }\n    batsman {\n      __typename\n      playerName\n      playerNameHindi\n      credits\n      playerId\n      totalPoints\n      captain\n      vice_captain\n      teamID\n      player_role\n      projectedPoints\n    }\n    keeper {\n      __typename\n      playerName\n      playerNameHindi\n      credits\n      totalPoints\n      playerId\n      captain\n      vice_captain\n      player_role\n      teamID\n      projectedPoints\n    }\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public GetFantasySixTeamsQuery(String str, Input<String> input) {
        Utils.checkNotNull(str, "matchID == null");
        Utils.checkNotNull(input, "token == null");
        this.variables = new Variables(str, input);
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
        private Input<String> token = Input.absent();

        Builder() {
        }

        public Builder matchID(String str) {
            this.matchID = str;
            return this;
        }

        public Builder token(String str) {
            this.token = Input.fromNullable(str);
            return this;
        }

        public Builder tokenInput(Input<String> input) {
            this.token = (Input) Utils.checkNotNull(input, "token == null");
            return this;
        }

        public GetFantasySixTeamsQuery build() {
            Utils.checkNotNull(this.matchID, "matchID == null");
            return new GetFantasySixTeamsQuery(this.matchID, this.token);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String matchID;
        private final Input<String> token;
        private final transient Map<String, Object> valueMap;

        Variables(String str, Input<String> input) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.matchID = str;
            this.token = input;
            linkedHashMap.put("matchID", str);
            if (input.defined) {
                linkedHashMap.put("token", input.value);
            }
        }

        public String matchID() {
            return this.matchID;
        }

        public Input<String> token() {
            return this.token;
        }

        @Override
        public Map<String, Object> valueMap() {
            return Collections.unmodifiableMap(this.valueMap);
        }

        @Override
        public InputFieldMarshaller marshaller() {
            return new InputFieldMarshaller() {
                /* GetFantasySixTeamsQuery.Variables.C55051 */

                @Override 
                public void marshal(InputFieldWriter inputFieldWriter) throws IOException {
                    inputFieldWriter.writeString("matchID", Variables.this.matchID);
                    if (Variables.this.token.defined) {
                        inputFieldWriter.writeString("token", Variables.this.token.value);
                    }
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forList("getFantasySixTeams", "getFantasySixTeams", new UnmodifiableMapBuilder(2).put("matchID", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "matchID").build()).put("token", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "token").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final List<GetFantasySixTeam> getFantasySixTeams;

        public Data(List<GetFantasySixTeam> list) {
            this.getFantasySixTeams = list;
        }

        public List<GetFantasySixTeam> getFantasySixTeams() {
            return this.getFantasySixTeams;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {
                /* GetFantasySixTeamsQuery.Data.C54871 */

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeList(Data.$responseFields[0], Data.this.getFantasySixTeams, new ResponseWriter.ListWriter() {
                        /* GetFantasySixTeamsQuery.Data.C54871.C54881 */

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((GetFantasySixTeam) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getFantasySixTeams=" + this.getFantasySixTeams + "}";
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
            List<GetFantasySixTeam> list = this.getFantasySixTeams;
            List<GetFantasySixTeam> list2 = ((Data) obj).getFantasySixTeams;
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
                List<GetFantasySixTeam> list = this.getFantasySixTeams;
                this.$hashCode = 1000003 ^ (list == null ? 0 : list.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetFantasySixTeam.Mapper getFantasySixTeamFieldMapper = new GetFantasySixTeam.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data(responseReader.readList(Data.$responseFields[0], new ResponseReader.ListReader<GetFantasySixTeam>() {
                    /* GetFantasySixTeamsQuery.Data.Mapper.C54891 */

                    @Override 
                    public GetFantasySixTeam read(ResponseReader.ListItemReader listItemReader) {
                        return (GetFantasySixTeam) listItemReader.readObject(new ResponseReader.ObjectReader<GetFantasySixTeam>() {
                            /* GetFantasySixTeamsQuery.Data.Mapper.C54891.C54901 */

                            @Override 
                            public GetFantasySixTeam read(ResponseReader responseReader) {
                                return Mapper.this.getFantasySixTeamFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class GetFantasySixTeam {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamtotalpoints", "teamtotalpoints", null, true, Collections.emptyList()), ResponseField.forString("fantasy_teamName", "fantasy_teamName", null, true, Collections.emptyList()), ResponseField.forString("timestamp", "timestamp", null, true, Collections.emptyList()), ResponseField.forString("totalProjectedPoints", "totalProjectedPoints", null, true, Collections.emptyList()), ResponseField.forList("all_rounder", "all_rounder", null, true, Collections.emptyList()), ResponseField.forList("bowler", "bowler", null, true, Collections.emptyList()), ResponseField.forList("batsman", "batsman", null, true, Collections.emptyList()), ResponseField.forList("keeper", "keeper", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<All_rounder> all_rounder;
        final List<Batsman> batsman;
        final List<Bowler> bowler;
        final String fantasy_teamName;
        final List<Keeper> keeper;
        final String teamtotalpoints;
        final String timestamp;
        final String totalProjectedPoints;

        public GetFantasySixTeam(String str, String str2, String str3, String str4, String str5, List<All_rounder> list, List<Bowler> list2, List<Batsman> list3, List<Keeper> list4) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.teamtotalpoints = str2;
            this.fantasy_teamName = str3;
            this.timestamp = str4;
            this.totalProjectedPoints = str5;
            this.all_rounder = list;
            this.bowler = list2;
            this.batsman = list3;
            this.keeper = list4;
        }

        public String __typename() {
            return this.__typename;
        }

        public String teamtotalpoints() {
            return this.teamtotalpoints;
        }

        public String fantasy_teamName() {
            return this.fantasy_teamName;
        }

        public String timestamp() {
            return this.timestamp;
        }

        public String totalProjectedPoints() {
            return this.totalProjectedPoints;
        }

        public List<All_rounder> all_rounder() {
            return this.all_rounder;
        }

        public List<Bowler> bowler() {
            return this.bowler;
        }

        public List<Batsman> batsman() {
            return this.batsman;
        }

        public List<Keeper> keeper() {
            return this.keeper;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {
                /* GetFantasySixTeamsQuery.GetFantasySixTeam.C54911 */

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(GetFantasySixTeam.$responseFields[0], GetFantasySixTeam.this.__typename);
                    responseWriter.writeString(GetFantasySixTeam.$responseFields[1], GetFantasySixTeam.this.teamtotalpoints);
                    responseWriter.writeString(GetFantasySixTeam.$responseFields[2], GetFantasySixTeam.this.fantasy_teamName);
                    responseWriter.writeString(GetFantasySixTeam.$responseFields[3], GetFantasySixTeam.this.timestamp);
                    responseWriter.writeString(GetFantasySixTeam.$responseFields[4], GetFantasySixTeam.this.totalProjectedPoints);
                    responseWriter.writeList(GetFantasySixTeam.$responseFields[5], GetFantasySixTeam.this.all_rounder, new ResponseWriter.ListWriter() {
                        /* GetFantasySixTeamsQuery.GetFantasySixTeam.C54911.C54921 */

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((All_rounder) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(GetFantasySixTeam.$responseFields[6], GetFantasySixTeam.this.bowler, new ResponseWriter.ListWriter() {
                        /* GetFantasySixTeamsQuery.GetFantasySixTeam.C54911.C54932 */

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Bowler) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(GetFantasySixTeam.$responseFields[7], GetFantasySixTeam.this.batsman, new ResponseWriter.ListWriter() {
                        /* GetFantasySixTeamsQuery.GetFantasySixTeam.C54911.C54943 */

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Batsman) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(GetFantasySixTeam.$responseFields[8], GetFantasySixTeam.this.keeper, new ResponseWriter.ListWriter() {
                        /* GetFantasySixTeamsQuery.GetFantasySixTeam.C54911.C54954 */

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Keeper) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetFantasySixTeam{__typename=" + this.__typename + ", teamtotalpoints=" + this.teamtotalpoints + ", fantasy_teamName=" + this.fantasy_teamName + ", timestamp=" + this.timestamp + ", totalProjectedPoints=" + this.totalProjectedPoints + ", all_rounder=" + this.all_rounder + ", bowler=" + this.bowler + ", batsman=" + this.batsman + ", keeper=" + this.keeper + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            List<All_rounder> list;
            List<Bowler> list2;
            List<Batsman> list3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetFantasySixTeam)) {
                return false;
            }
            GetFantasySixTeam getFantasySixTeam = (GetFantasySixTeam) obj;
            if (this.__typename.equals(getFantasySixTeam.__typename) && ((str = this.teamtotalpoints) != null ? str.equals(getFantasySixTeam.teamtotalpoints) : getFantasySixTeam.teamtotalpoints == null) && ((str2 = this.fantasy_teamName) != null ? str2.equals(getFantasySixTeam.fantasy_teamName) : getFantasySixTeam.fantasy_teamName == null) && ((str3 = this.timestamp) != null ? str3.equals(getFantasySixTeam.timestamp) : getFantasySixTeam.timestamp == null) && ((str4 = this.totalProjectedPoints) != null ? str4.equals(getFantasySixTeam.totalProjectedPoints) : getFantasySixTeam.totalProjectedPoints == null) && ((list = this.all_rounder) != null ? list.equals(getFantasySixTeam.all_rounder) : getFantasySixTeam.all_rounder == null) && ((list2 = this.bowler) != null ? list2.equals(getFantasySixTeam.bowler) : getFantasySixTeam.bowler == null) && ((list3 = this.batsman) != null ? list3.equals(getFantasySixTeam.batsman) : getFantasySixTeam.batsman == null)) {
                List<Keeper> list4 = this.keeper;
                List<Keeper> list5 = getFantasySixTeam.keeper;
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
                String str = this.teamtotalpoints;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.fantasy_teamName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.timestamp;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.totalProjectedPoints;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                List<All_rounder> list = this.all_rounder;
                int hashCode6 = (hashCode5 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Bowler> list2 = this.bowler;
                int hashCode7 = (hashCode6 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<Batsman> list3 = this.batsman;
                int hashCode8 = (hashCode7 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
                List<Keeper> list4 = this.keeper;
                if (list4 != null) {
                    i = list4.hashCode();
                }
                this.$hashCode = hashCode8 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<GetFantasySixTeam> {
            final All_rounder.Mapper all_rounderFieldMapper = new All_rounder.Mapper();
            final Batsman.Mapper batsmanFieldMapper = new Batsman.Mapper();
            final Bowler.Mapper bowlerFieldMapper = new Bowler.Mapper();
            final Keeper.Mapper keeperFieldMapper = new Keeper.Mapper();

            @Override 
            public GetFantasySixTeam map(ResponseReader responseReader) {
                return new GetFantasySixTeam(responseReader.readString(GetFantasySixTeam.$responseFields[0]), responseReader.readString(GetFantasySixTeam.$responseFields[1]), responseReader.readString(GetFantasySixTeam.$responseFields[2]), responseReader.readString(GetFantasySixTeam.$responseFields[3]), responseReader.readString(GetFantasySixTeam.$responseFields[4]), responseReader.readList(GetFantasySixTeam.$responseFields[5], new ResponseReader.ListReader<All_rounder>() {
                    /* GetFantasySixTeamsQuery.GetFantasySixTeam.Mapper.C54961 */

                    @Override 
                    public All_rounder read(ResponseReader.ListItemReader listItemReader) {
                        return (All_rounder) listItemReader.readObject(new ResponseReader.ObjectReader<All_rounder>() {
                            /* GetFantasySixTeamsQuery.GetFantasySixTeam.Mapper.C54961.C54971 */

                            @Override 
                            public All_rounder read(ResponseReader responseReader) {
                                return Mapper.this.all_rounderFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(GetFantasySixTeam.$responseFields[6], new ResponseReader.ListReader<Bowler>() {
                    /* GetFantasySixTeamsQuery.GetFantasySixTeam.Mapper.C54982 */

                    @Override 
                    public Bowler read(ResponseReader.ListItemReader listItemReader) {
                        return (Bowler) listItemReader.readObject(new ResponseReader.ObjectReader<Bowler>() {
                            /* GetFantasySixTeamsQuery.GetFantasySixTeam.Mapper.C54982.C54991 */

                            @Override 
                            public Bowler read(ResponseReader responseReader) {
                                return Mapper.this.bowlerFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(GetFantasySixTeam.$responseFields[7], new ResponseReader.ListReader<Batsman>() {
                    /* GetFantasySixTeamsQuery.GetFantasySixTeam.Mapper.C55003 */

                    @Override 
                    public Batsman read(ResponseReader.ListItemReader listItemReader) {
                        return (Batsman) listItemReader.readObject(new ResponseReader.ObjectReader<Batsman>() {
                            /* GetFantasySixTeamsQuery.GetFantasySixTeam.Mapper.C55003.C55011 */

                            @Override 
                            public Batsman read(ResponseReader responseReader) {
                                return Mapper.this.batsmanFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(GetFantasySixTeam.$responseFields[8], new ResponseReader.ListReader<Keeper>() {
                    /* GetFantasySixTeamsQuery.GetFantasySixTeam.Mapper.C55024 */

                    @Override 
                    public Keeper read(ResponseReader.ListItemReader listItemReader) {
                        return (Keeper) listItemReader.readObject(new ResponseReader.ObjectReader<Keeper>() {
                            /* GetFantasySixTeamsQuery.GetFantasySixTeam.Mapper.C55024.C55031 */

                            @Override 
                            public Keeper read(ResponseReader responseReader) {
                                return Mapper.this.keeperFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class All_rounder {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerNameHindi", "playerNameHindi", null, true, Collections.emptyList()), ResponseField.forString("credits", "credits", null, true, Collections.emptyList()), ResponseField.forString("playerId", "playerId", null, true, Collections.emptyList()), ResponseField.forString("captain", "captain", null, true, Collections.emptyList()), ResponseField.forString("vice_captain", "vice_captain", null, true, Collections.emptyList()), ResponseField.forString("player_role", "player_role", null, true, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("totalPoints", "totalPoints", null, true, Collections.emptyList()), ResponseField.forString("projectedPoints", "projectedPoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String captain;
        final String credits;
        final String playerId;
        final String playerName;
        final String playerNameHindi;
        final String player_role;
        final String projectedPoints;
        final String teamID;
        final String totalPoints;
        final String vice_captain;

        public All_rounder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerName = str2;
            this.playerNameHindi = str3;
            this.credits = str4;
            this.playerId = str5;
            this.captain = str6;
            this.vice_captain = str7;
            this.player_role = str8;
            this.teamID = str9;
            this.totalPoints = str10;
            this.projectedPoints = str11;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerName() {
            return this.playerName;
        }

        public String playerNameHindi() {
            return this.playerNameHindi;
        }

        public String credits() {
            return this.credits;
        }

        public String playerId() {
            return this.playerId;
        }

        public String captain() {
            return this.captain;
        }

        public String vice_captain() {
            return this.vice_captain;
        }

        public String player_role() {
            return this.player_role;
        }

        public String teamID() {
            return this.teamID;
        }

        public String totalPoints() {
            return this.totalPoints;
        }

        public String projectedPoints() {
            return this.projectedPoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {
                /* GetFantasySixTeamsQuery.All_rounder.C54841 */

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(All_rounder.$responseFields[0], All_rounder.this.__typename);
                    responseWriter.writeString(All_rounder.$responseFields[1], All_rounder.this.playerName);
                    responseWriter.writeString(All_rounder.$responseFields[2], All_rounder.this.playerNameHindi);
                    responseWriter.writeString(All_rounder.$responseFields[3], All_rounder.this.credits);
                    responseWriter.writeString(All_rounder.$responseFields[4], All_rounder.this.playerId);
                    responseWriter.writeString(All_rounder.$responseFields[5], All_rounder.this.captain);
                    responseWriter.writeString(All_rounder.$responseFields[6], All_rounder.this.vice_captain);
                    responseWriter.writeString(All_rounder.$responseFields[7], All_rounder.this.player_role);
                    responseWriter.writeString(All_rounder.$responseFields[8], All_rounder.this.teamID);
                    responseWriter.writeString(All_rounder.$responseFields[9], All_rounder.this.totalPoints);
                    responseWriter.writeString(All_rounder.$responseFields[10], All_rounder.this.projectedPoints);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "All_rounder{__typename=" + this.__typename + ", playerName=" + this.playerName + ", playerNameHindi=" + this.playerNameHindi + ", credits=" + this.credits + ", playerId=" + this.playerId + ", captain=" + this.captain + ", vice_captain=" + this.vice_captain + ", player_role=" + this.player_role + ", teamID=" + this.teamID + ", totalPoints=" + this.totalPoints + ", projectedPoints=" + this.projectedPoints + "}";
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
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof All_rounder)) {
                return false;
            }
            All_rounder all_rounder = (All_rounder) obj;
            if (this.__typename.equals(all_rounder.__typename) && ((str = this.playerName) != null ? str.equals(all_rounder.playerName) : all_rounder.playerName == null) && ((str2 = this.playerNameHindi) != null ? str2.equals(all_rounder.playerNameHindi) : all_rounder.playerNameHindi == null) && ((str3 = this.credits) != null ? str3.equals(all_rounder.credits) : all_rounder.credits == null) && ((str4 = this.playerId) != null ? str4.equals(all_rounder.playerId) : all_rounder.playerId == null) && ((str5 = this.captain) != null ? str5.equals(all_rounder.captain) : all_rounder.captain == null) && ((str6 = this.vice_captain) != null ? str6.equals(all_rounder.vice_captain) : all_rounder.vice_captain == null) && ((str7 = this.player_role) != null ? str7.equals(all_rounder.player_role) : all_rounder.player_role == null) && ((str8 = this.teamID) != null ? str8.equals(all_rounder.teamID) : all_rounder.teamID == null) && ((str9 = this.totalPoints) != null ? str9.equals(all_rounder.totalPoints) : all_rounder.totalPoints == null)) {
                String str10 = this.projectedPoints;
                String str11 = all_rounder.projectedPoints;
                if (str10 == null) {
                    if (str11 == null) {
                        return true;
                    }
                } else if (str10.equals(str11)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.playerName;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerNameHindi;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.credits;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerId;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.captain;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.vice_captain;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.player_role;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.teamID;
                int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.totalPoints;
                int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.projectedPoints;
                if (str10 != null) {
                    i = str10.hashCode();
                }
                this.$hashCode = hashCode10 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<All_rounder> {
            @Override 
            public All_rounder map(ResponseReader responseReader) {
                return new All_rounder(responseReader.readString(All_rounder.$responseFields[0]), responseReader.readString(All_rounder.$responseFields[1]), responseReader.readString(All_rounder.$responseFields[2]), responseReader.readString(All_rounder.$responseFields[3]), responseReader.readString(All_rounder.$responseFields[4]), responseReader.readString(All_rounder.$responseFields[5]), responseReader.readString(All_rounder.$responseFields[6]), responseReader.readString(All_rounder.$responseFields[7]), responseReader.readString(All_rounder.$responseFields[8]), responseReader.readString(All_rounder.$responseFields[9]), responseReader.readString(All_rounder.$responseFields[10]));
            }
        }
    }

    public static class Bowler {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerNameHindi", "playerNameHindi", null, true, Collections.emptyList()), ResponseField.forString("credits", "credits", null, true, Collections.emptyList()), ResponseField.forString("playerId", "playerId", null, true, Collections.emptyList()), ResponseField.forString("captain", "captain", null, true, Collections.emptyList()), ResponseField.forString("vice_captain", "vice_captain", null, true, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("totalPoints", "totalPoints", null, true, Collections.emptyList()), ResponseField.forString("player_role", "player_role", null, true, Collections.emptyList()), ResponseField.forString("projectedPoints", "projectedPoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String captain;
        final String credits;
        final String playerId;
        final String playerName;
        final String playerNameHindi;
        final String player_role;
        final String projectedPoints;
        final String teamID;
        final String totalPoints;
        final String vice_captain;

        public Bowler(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerName = str2;
            this.playerNameHindi = str3;
            this.credits = str4;
            this.playerId = str5;
            this.captain = str6;
            this.vice_captain = str7;
            this.teamID = str8;
            this.totalPoints = str9;
            this.player_role = str10;
            this.projectedPoints = str11;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerName() {
            return this.playerName;
        }

        public String playerNameHindi() {
            return this.playerNameHindi;
        }

        public String credits() {
            return this.credits;
        }

        public String playerId() {
            return this.playerId;
        }

        public String captain() {
            return this.captain;
        }

        public String vice_captain() {
            return this.vice_captain;
        }

        public String teamID() {
            return this.teamID;
        }

        public String totalPoints() {
            return this.totalPoints;
        }

        public String player_role() {
            return this.player_role;
        }

        public String projectedPoints() {
            return this.projectedPoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {
                /* GetFantasySixTeamsQuery.Bowler.C54861 */

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Bowler.$responseFields[0], Bowler.this.__typename);
                    responseWriter.writeString(Bowler.$responseFields[1], Bowler.this.playerName);
                    responseWriter.writeString(Bowler.$responseFields[2], Bowler.this.playerNameHindi);
                    responseWriter.writeString(Bowler.$responseFields[3], Bowler.this.credits);
                    responseWriter.writeString(Bowler.$responseFields[4], Bowler.this.playerId);
                    responseWriter.writeString(Bowler.$responseFields[5], Bowler.this.captain);
                    responseWriter.writeString(Bowler.$responseFields[6], Bowler.this.vice_captain);
                    responseWriter.writeString(Bowler.$responseFields[7], Bowler.this.teamID);
                    responseWriter.writeString(Bowler.$responseFields[8], Bowler.this.totalPoints);
                    responseWriter.writeString(Bowler.$responseFields[9], Bowler.this.player_role);
                    responseWriter.writeString(Bowler.$responseFields[10], Bowler.this.projectedPoints);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Bowler{__typename=" + this.__typename + ", playerName=" + this.playerName + ", playerNameHindi=" + this.playerNameHindi + ", credits=" + this.credits + ", playerId=" + this.playerId + ", captain=" + this.captain + ", vice_captain=" + this.vice_captain + ", teamID=" + this.teamID + ", totalPoints=" + this.totalPoints + ", player_role=" + this.player_role + ", projectedPoints=" + this.projectedPoints + "}";
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
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Bowler)) {
                return false;
            }
            Bowler bowler = (Bowler) obj;
            if (this.__typename.equals(bowler.__typename) && ((str = this.playerName) != null ? str.equals(bowler.playerName) : bowler.playerName == null) && ((str2 = this.playerNameHindi) != null ? str2.equals(bowler.playerNameHindi) : bowler.playerNameHindi == null) && ((str3 = this.credits) != null ? str3.equals(bowler.credits) : bowler.credits == null) && ((str4 = this.playerId) != null ? str4.equals(bowler.playerId) : bowler.playerId == null) && ((str5 = this.captain) != null ? str5.equals(bowler.captain) : bowler.captain == null) && ((str6 = this.vice_captain) != null ? str6.equals(bowler.vice_captain) : bowler.vice_captain == null) && ((str7 = this.teamID) != null ? str7.equals(bowler.teamID) : bowler.teamID == null) && ((str8 = this.totalPoints) != null ? str8.equals(bowler.totalPoints) : bowler.totalPoints == null) && ((str9 = this.player_role) != null ? str9.equals(bowler.player_role) : bowler.player_role == null)) {
                String str10 = this.projectedPoints;
                String str11 = bowler.projectedPoints;
                if (str10 == null) {
                    if (str11 == null) {
                        return true;
                    }
                } else if (str10.equals(str11)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.playerName;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerNameHindi;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.credits;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerId;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.captain;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.vice_captain;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.teamID;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.totalPoints;
                int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.player_role;
                int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.projectedPoints;
                if (str10 != null) {
                    i = str10.hashCode();
                }
                this.$hashCode = hashCode10 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Bowler> {
            @Override 
            public Bowler map(ResponseReader responseReader) {
                return new Bowler(responseReader.readString(Bowler.$responseFields[0]), responseReader.readString(Bowler.$responseFields[1]), responseReader.readString(Bowler.$responseFields[2]), responseReader.readString(Bowler.$responseFields[3]), responseReader.readString(Bowler.$responseFields[4]), responseReader.readString(Bowler.$responseFields[5]), responseReader.readString(Bowler.$responseFields[6]), responseReader.readString(Bowler.$responseFields[7]), responseReader.readString(Bowler.$responseFields[8]), responseReader.readString(Bowler.$responseFields[9]), responseReader.readString(Bowler.$responseFields[10]));
            }
        }
    }

    public static class Batsman {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerNameHindi", "playerNameHindi", null, true, Collections.emptyList()), ResponseField.forString("credits", "credits", null, true, Collections.emptyList()), ResponseField.forString("playerId", "playerId", null, true, Collections.emptyList()), ResponseField.forString("totalPoints", "totalPoints", null, true, Collections.emptyList()), ResponseField.forString("captain", "captain", null, true, Collections.emptyList()), ResponseField.forString("vice_captain", "vice_captain", null, true, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("player_role", "player_role", null, true, Collections.emptyList()), ResponseField.forString("projectedPoints", "projectedPoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String captain;
        final String credits;
        final String playerId;
        final String playerName;
        final String playerNameHindi;
        final String player_role;
        final String projectedPoints;
        final String teamID;
        final String totalPoints;
        final String vice_captain;

        public Batsman(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerName = str2;
            this.playerNameHindi = str3;
            this.credits = str4;
            this.playerId = str5;
            this.totalPoints = str6;
            this.captain = str7;
            this.vice_captain = str8;
            this.teamID = str9;
            this.player_role = str10;
            this.projectedPoints = str11;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerName() {
            return this.playerName;
        }

        public String playerNameHindi() {
            return this.playerNameHindi;
        }

        public String credits() {
            return this.credits;
        }

        public String playerId() {
            return this.playerId;
        }

        public String totalPoints() {
            return this.totalPoints;
        }

        public String captain() {
            return this.captain;
        }

        public String vice_captain() {
            return this.vice_captain;
        }

        public String teamID() {
            return this.teamID;
        }

        public String player_role() {
            return this.player_role;
        }

        public String projectedPoints() {
            return this.projectedPoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {
                /* GetFantasySixTeamsQuery.Batsman.C54851 */

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Batsman.$responseFields[0], Batsman.this.__typename);
                    responseWriter.writeString(Batsman.$responseFields[1], Batsman.this.playerName);
                    responseWriter.writeString(Batsman.$responseFields[2], Batsman.this.playerNameHindi);
                    responseWriter.writeString(Batsman.$responseFields[3], Batsman.this.credits);
                    responseWriter.writeString(Batsman.$responseFields[4], Batsman.this.playerId);
                    responseWriter.writeString(Batsman.$responseFields[5], Batsman.this.totalPoints);
                    responseWriter.writeString(Batsman.$responseFields[6], Batsman.this.captain);
                    responseWriter.writeString(Batsman.$responseFields[7], Batsman.this.vice_captain);
                    responseWriter.writeString(Batsman.$responseFields[8], Batsman.this.teamID);
                    responseWriter.writeString(Batsman.$responseFields[9], Batsman.this.player_role);
                    responseWriter.writeString(Batsman.$responseFields[10], Batsman.this.projectedPoints);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Batsman{__typename=" + this.__typename + ", playerName=" + this.playerName + ", playerNameHindi=" + this.playerNameHindi + ", credits=" + this.credits + ", playerId=" + this.playerId + ", totalPoints=" + this.totalPoints + ", captain=" + this.captain + ", vice_captain=" + this.vice_captain + ", teamID=" + this.teamID + ", player_role=" + this.player_role + ", projectedPoints=" + this.projectedPoints + "}";
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
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Batsman)) {
                return false;
            }
            Batsman batsman = (Batsman) obj;
            if (this.__typename.equals(batsman.__typename) && ((str = this.playerName) != null ? str.equals(batsman.playerName) : batsman.playerName == null) && ((str2 = this.playerNameHindi) != null ? str2.equals(batsman.playerNameHindi) : batsman.playerNameHindi == null) && ((str3 = this.credits) != null ? str3.equals(batsman.credits) : batsman.credits == null) && ((str4 = this.playerId) != null ? str4.equals(batsman.playerId) : batsman.playerId == null) && ((str5 = this.totalPoints) != null ? str5.equals(batsman.totalPoints) : batsman.totalPoints == null) && ((str6 = this.captain) != null ? str6.equals(batsman.captain) : batsman.captain == null) && ((str7 = this.vice_captain) != null ? str7.equals(batsman.vice_captain) : batsman.vice_captain == null) && ((str8 = this.teamID) != null ? str8.equals(batsman.teamID) : batsman.teamID == null) && ((str9 = this.player_role) != null ? str9.equals(batsman.player_role) : batsman.player_role == null)) {
                String str10 = this.projectedPoints;
                String str11 = batsman.projectedPoints;
                if (str10 == null) {
                    if (str11 == null) {
                        return true;
                    }
                } else if (str10.equals(str11)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.playerName;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerNameHindi;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.credits;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerId;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.totalPoints;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.captain;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.vice_captain;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.teamID;
                int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.player_role;
                int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.projectedPoints;
                if (str10 != null) {
                    i = str10.hashCode();
                }
                this.$hashCode = hashCode10 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Batsman> {
            @Override 
            public Batsman map(ResponseReader responseReader) {
                return new Batsman(responseReader.readString(Batsman.$responseFields[0]), responseReader.readString(Batsman.$responseFields[1]), responseReader.readString(Batsman.$responseFields[2]), responseReader.readString(Batsman.$responseFields[3]), responseReader.readString(Batsman.$responseFields[4]), responseReader.readString(Batsman.$responseFields[5]), responseReader.readString(Batsman.$responseFields[6]), responseReader.readString(Batsman.$responseFields[7]), responseReader.readString(Batsman.$responseFields[8]), responseReader.readString(Batsman.$responseFields[9]), responseReader.readString(Batsman.$responseFields[10]));
            }
        }
    }

    public static class Keeper {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("playerNameHindi", "playerNameHindi", null, true, Collections.emptyList()), ResponseField.forString("credits", "credits", null, true, Collections.emptyList()), ResponseField.forString("totalPoints", "totalPoints", null, true, Collections.emptyList()), ResponseField.forString("playerId", "playerId", null, true, Collections.emptyList()), ResponseField.forString("captain", "captain", null, true, Collections.emptyList()), ResponseField.forString("vice_captain", "vice_captain", null, true, Collections.emptyList()), ResponseField.forString("player_role", "player_role", null, true, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("projectedPoints", "projectedPoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String captain;
        final String credits;
        final String playerId;
        final String playerName;
        final String playerNameHindi;
        final String player_role;
        final String projectedPoints;
        final String teamID;
        final String totalPoints;
        final String vice_captain;

        public Keeper(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerName = str2;
            this.playerNameHindi = str3;
            this.credits = str4;
            this.totalPoints = str5;
            this.playerId = str6;
            this.captain = str7;
            this.vice_captain = str8;
            this.player_role = str9;
            this.teamID = str10;
            this.projectedPoints = str11;
        }

        public String __typename() {
            return this.__typename;
        }

        public String playerName() {
            return this.playerName;
        }

        public String playerNameHindi() {
            return this.playerNameHindi;
        }

        public String credits() {
            return this.credits;
        }

        public String totalPoints() {
            return this.totalPoints;
        }

        public String playerId() {
            return this.playerId;
        }

        public String captain() {
            return this.captain;
        }

        public String vice_captain() {
            return this.vice_captain;
        }

        public String player_role() {
            return this.player_role;
        }

        public String teamID() {
            return this.teamID;
        }

        public String projectedPoints() {
            return this.projectedPoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {
                /* GetFantasySixTeamsQuery.Keeper.C55041 */

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Keeper.$responseFields[0], Keeper.this.__typename);
                    responseWriter.writeString(Keeper.$responseFields[1], Keeper.this.playerName);
                    responseWriter.writeString(Keeper.$responseFields[2], Keeper.this.playerNameHindi);
                    responseWriter.writeString(Keeper.$responseFields[3], Keeper.this.credits);
                    responseWriter.writeString(Keeper.$responseFields[4], Keeper.this.totalPoints);
                    responseWriter.writeString(Keeper.$responseFields[5], Keeper.this.playerId);
                    responseWriter.writeString(Keeper.$responseFields[6], Keeper.this.captain);
                    responseWriter.writeString(Keeper.$responseFields[7], Keeper.this.vice_captain);
                    responseWriter.writeString(Keeper.$responseFields[8], Keeper.this.player_role);
                    responseWriter.writeString(Keeper.$responseFields[9], Keeper.this.teamID);
                    responseWriter.writeString(Keeper.$responseFields[10], Keeper.this.projectedPoints);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Keeper{__typename=" + this.__typename + ", playerName=" + this.playerName + ", playerNameHindi=" + this.playerNameHindi + ", credits=" + this.credits + ", totalPoints=" + this.totalPoints + ", playerId=" + this.playerId + ", captain=" + this.captain + ", vice_captain=" + this.vice_captain + ", player_role=" + this.player_role + ", teamID=" + this.teamID + ", projectedPoints=" + this.projectedPoints + "}";
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
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Keeper)) {
                return false;
            }
            Keeper keeper = (Keeper) obj;
            if (this.__typename.equals(keeper.__typename) && ((str = this.playerName) != null ? str.equals(keeper.playerName) : keeper.playerName == null) && ((str2 = this.playerNameHindi) != null ? str2.equals(keeper.playerNameHindi) : keeper.playerNameHindi == null) && ((str3 = this.credits) != null ? str3.equals(keeper.credits) : keeper.credits == null) && ((str4 = this.totalPoints) != null ? str4.equals(keeper.totalPoints) : keeper.totalPoints == null) && ((str5 = this.playerId) != null ? str5.equals(keeper.playerId) : keeper.playerId == null) && ((str6 = this.captain) != null ? str6.equals(keeper.captain) : keeper.captain == null) && ((str7 = this.vice_captain) != null ? str7.equals(keeper.vice_captain) : keeper.vice_captain == null) && ((str8 = this.player_role) != null ? str8.equals(keeper.player_role) : keeper.player_role == null) && ((str9 = this.teamID) != null ? str9.equals(keeper.teamID) : keeper.teamID == null)) {
                String str10 = this.projectedPoints;
                String str11 = keeper.projectedPoints;
                if (str10 == null) {
                    if (str11 == null) {
                        return true;
                    }
                } else if (str10.equals(str11)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.playerName;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerNameHindi;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.credits;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.totalPoints;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerId;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.captain;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.vice_captain;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.player_role;
                int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.teamID;
                int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.projectedPoints;
                if (str10 != null) {
                    i = str10.hashCode();
                }
                this.$hashCode = hashCode10 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Keeper> {
            @Override 
            public Keeper map(ResponseReader responseReader) {
                return new Keeper(responseReader.readString(Keeper.$responseFields[0]), responseReader.readString(Keeper.$responseFields[1]), responseReader.readString(Keeper.$responseFields[2]), responseReader.readString(Keeper.$responseFields[3]), responseReader.readString(Keeper.$responseFields[4]), responseReader.readString(Keeper.$responseFields[5]), responseReader.readString(Keeper.$responseFields[6]), responseReader.readString(Keeper.$responseFields[7]), responseReader.readString(Keeper.$responseFields[8]), responseReader.readString(Keeper.$responseFields[9]), responseReader.readString(Keeper.$responseFields[10]));
            }
        }
    }
}
