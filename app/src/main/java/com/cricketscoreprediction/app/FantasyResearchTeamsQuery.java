package com.cricketscoreprediction.app;

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

public final class FantasyResearchTeamsQuery implements Query<FantasyResearchTeamsQuery.Data, FantasyResearchTeamsQuery.Data, FantasyResearchTeamsQuery.Variables> {
    public static final String OPERATION_ID = "9b90eec7c62084eb23065ad99d163a588766c305e6cb9682ab7b4726e8a6226e";
    public static final OperationName OPERATION_NAME = new OperationName() {


       @Override
        public String name() {
            return "FantasyResearchTeams";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query FantasyResearchTeams($matchID: String) {\n  FantasyResearchTeams(matchID: $matchID) {\n    __typename\n    matchScore {\n      __typename\n      teamShortName\n      teamID\n      teamFullName\n      teamScore {\n        __typename\n        inning\n        inningNumber\n        battingTeam\n        runsScored\n        wickets\n        overs\n        runRate\n        battingSide\n        teamID\n        battingTeamShortName\n        declared\n        folowOn\n      }\n    }\n    matchId\n    homeTeamId\n    awayTeamId\n    MatchName\n    matchStatus\n    playing11Status\n    teams {\n      __typename\n      fantasy_teamName\n      totalCredits\n      totalProjectedPoints\n      homeTeamCount\n      awayTeamCount\n      playing11Status\n      homeTeamShortName\n      awayTeamShortName\n      homeTeamId\n      awayTeamId\n      MatchName\n      players {\n        __typename\n        credits\n        playerCredits\n        playerId\n        playerFeedID\n        playerName\n        selectionPercent\n        teamName\n        playerRole\n        captain\n        vice_captain\n        projectedPoints\n        playerClubName\n        ActualPoint\n        playerCaptain\n        playerViceCaptain\n      }\n      totalFPoints\n    }\n    statusMessage\n    matchType\n    currentInningsTeamID\n    currentinningsNo\n    homeTeamShortName\n    awayTeamShortName\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public FantasyResearchTeamsQuery(Input<String> input) {
        Utils.checkNotNull(input, "matchID == null");
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
        private Input<String> matchID = Input.absent();

        Builder() {
        }

        public Builder matchID(String str) {
            this.matchID = Input.fromNullable(str);
            return this;
        }

        public Builder matchIDInput(Input<String> input) {
            this.matchID = (Input) Utils.checkNotNull(input, "matchID == null");
            return this;
        }

        public FantasyResearchTeamsQuery build() {
            return new FantasyResearchTeamsQuery(this.matchID);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final Input<String> matchID;
        private final transient Map<String, Object> valueMap;

        Variables(Input<String> input) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.matchID = input;
            if (input.defined) {
                linkedHashMap.put("matchID", input.value);
            }
        }

        public Input<String> matchID() {
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
                    if (Variables.this.matchID.defined) {
                        inputFieldWriter.writeString("matchID", Variables.this.matchID.value);
                    }
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("FantasyResearchTeams", "FantasyResearchTeams", new UnmodifiableMapBuilder(1).put("matchID", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "matchID").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final FantasyResearchTeams FantasyResearchTeams;

        public Data(FantasyResearchTeams fantasyResearchTeams) {
            this.FantasyResearchTeams = fantasyResearchTeams;
        }

        public FantasyResearchTeams FantasyResearchTeams() {
            return this.FantasyResearchTeams;
        }

      @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.FantasyResearchTeams != null ? Data.this.FantasyResearchTeams.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{FantasyResearchTeams=" + this.FantasyResearchTeams + "}";
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
            FantasyResearchTeams fantasyResearchTeams = this.FantasyResearchTeams;
            FantasyResearchTeams fantasyResearchTeams2 = ((Data) obj).FantasyResearchTeams;
            if (fantasyResearchTeams != null) {
                return fantasyResearchTeams.equals(fantasyResearchTeams2);
            }
            if (fantasyResearchTeams2 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                FantasyResearchTeams fantasyResearchTeams = this.FantasyResearchTeams;
                this.$hashCode = 1000003 ^ (fantasyResearchTeams == null ? 0 : fantasyResearchTeams.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final FantasyResearchTeams.Mapper fantasyResearchTeamsFieldMapper = new FantasyResearchTeams.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((FantasyResearchTeams) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<FantasyResearchTeams>() {


                    @Override 
                    public FantasyResearchTeams read(ResponseReader responseReader) {
                        return Mapper.this.fantasyResearchTeamsFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class FantasyResearchTeams {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("matchScore", "matchScore", null, true, Collections.emptyList()), ResponseField.forString("matchId", "matchId", null, true, Collections.emptyList()), ResponseField.forString("homeTeamId", "homeTeamId", null, true, Collections.emptyList()), ResponseField.forString("awayTeamId", "awayTeamId", null, true, Collections.emptyList()), ResponseField.forString("MatchName", "MatchName", null, true, Collections.emptyList()), ResponseField.forString("matchStatus", "matchStatus", null, true, Collections.emptyList()), ResponseField.forBoolean("playing11Status", "playing11Status", null, true, Collections.emptyList()), ResponseField.forList("teams", "teams", null, true, Collections.emptyList()), ResponseField.forString("statusMessage", "statusMessage", null, true, Collections.emptyList()), ResponseField.forString("matchType", "matchType", null, true, Collections.emptyList()), ResponseField.forString("currentInningsTeamID", "currentInningsTeamID", null, true, Collections.emptyList()), ResponseField.forString("currentinningsNo", "currentinningsNo", null, true, Collections.emptyList()), ResponseField.forString("homeTeamShortName", "homeTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("awayTeamShortName", "awayTeamShortName", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String MatchName;
        final String __typename;
        final String awayTeamId;
        final String awayTeamShortName;
        final String currentInningsTeamID;
        final String currentinningsNo;
        final String homeTeamId;
        final String homeTeamShortName;
        final String matchId;
        final List<MatchScore> matchScore;
        final String matchStatus;
        final String matchType;
        final Boolean playing11Status;
        final String statusMessage;
        final List<Team> teams;

        public FantasyResearchTeams(String str, List<MatchScore> list, String str2, String str3, String str4, String str5, String str6, Boolean bool, List<Team> list2, String str7, String str8, String str9, String str10, String str11, String str12) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchScore = list;
            this.matchId = str2;
            this.homeTeamId = str3;
            this.awayTeamId = str4;
            this.MatchName = str5;
            this.matchStatus = str6;
            this.playing11Status = bool;
            this.teams = list2;
            this.statusMessage = str7;
            this.matchType = str8;
            this.currentInningsTeamID = str9;
            this.currentinningsNo = str10;
            this.homeTeamShortName = str11;
            this.awayTeamShortName = str12;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<MatchScore> matchScore() {
            return this.matchScore;
        }

        public String matchId() {
            return this.matchId;
        }

        public String homeTeamId() {
            return this.homeTeamId;
        }

        public String awayTeamId() {
            return this.awayTeamId;
        }

        public String MatchName() {
            return this.MatchName;
        }

        public String matchStatus() {
            return this.matchStatus;
        }

        public Boolean playing11Status() {
            return this.playing11Status;
        }

        public List<Team> teams() {
            return this.teams;
        }

        public String statusMessage() {
            return this.statusMessage;
        }

        public String matchType() {
            return this.matchType;
        }

        public String currentInningsTeamID() {
            return this.currentInningsTeamID;
        }

        public String currentinningsNo() {
            return this.currentinningsNo;
        }

        public String homeTeamShortName() {
            return this.homeTeamShortName;
        }

        public String awayTeamShortName() {
            return this.awayTeamShortName;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(FantasyResearchTeams.$responseFields[0], FantasyResearchTeams.this.__typename);
                    responseWriter.writeList(FantasyResearchTeams.$responseFields[1], FantasyResearchTeams.this.matchScore, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((MatchScore) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeString(FantasyResearchTeams.$responseFields[2], FantasyResearchTeams.this.matchId);
                    responseWriter.writeString(FantasyResearchTeams.$responseFields[3], FantasyResearchTeams.this.homeTeamId);
                    responseWriter.writeString(FantasyResearchTeams.$responseFields[4], FantasyResearchTeams.this.awayTeamId);
                    responseWriter.writeString(FantasyResearchTeams.$responseFields[5], FantasyResearchTeams.this.MatchName);
                    responseWriter.writeString(FantasyResearchTeams.$responseFields[6], FantasyResearchTeams.this.matchStatus);
                    responseWriter.writeBoolean(FantasyResearchTeams.$responseFields[7], FantasyResearchTeams.this.playing11Status);
                    responseWriter.writeList(FantasyResearchTeams.$responseFields[8], FantasyResearchTeams.this.teams, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Team) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeString(FantasyResearchTeams.$responseFields[9], FantasyResearchTeams.this.statusMessage);
                    responseWriter.writeString(FantasyResearchTeams.$responseFields[10], FantasyResearchTeams.this.matchType);
                    responseWriter.writeString(FantasyResearchTeams.$responseFields[11], FantasyResearchTeams.this.currentInningsTeamID);
                    responseWriter.writeString(FantasyResearchTeams.$responseFields[12], FantasyResearchTeams.this.currentinningsNo);
                    responseWriter.writeString(FantasyResearchTeams.$responseFields[13], FantasyResearchTeams.this.homeTeamShortName);
                    responseWriter.writeString(FantasyResearchTeams.$responseFields[14], FantasyResearchTeams.this.awayTeamShortName);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FantasyResearchTeams{__typename=" + this.__typename + ", matchScore=" + this.matchScore + ", matchId=" + this.matchId + ", homeTeamId=" + this.homeTeamId + ", awayTeamId=" + this.awayTeamId + ", MatchName=" + this.MatchName + ", matchStatus=" + this.matchStatus + ", playing11Status=" + this.playing11Status + ", teams=" + this.teams + ", statusMessage=" + this.statusMessage + ", matchType=" + this.matchType + ", currentInningsTeamID=" + this.currentInningsTeamID + ", currentinningsNo=" + this.currentinningsNo + ", homeTeamShortName=" + this.homeTeamShortName + ", awayTeamShortName=" + this.awayTeamShortName + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<MatchScore> list;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Boolean bool;
            List<Team> list2;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FantasyResearchTeams)) {
                return false;
            }
            FantasyResearchTeams fantasyResearchTeams = (FantasyResearchTeams) obj;
            if (this.__typename.equals(fantasyResearchTeams.__typename) && ((list = this.matchScore) != null ? list.equals(fantasyResearchTeams.matchScore) : fantasyResearchTeams.matchScore == null) && ((str = this.matchId) != null ? str.equals(fantasyResearchTeams.matchId) : fantasyResearchTeams.matchId == null) && ((str2 = this.homeTeamId) != null ? str2.equals(fantasyResearchTeams.homeTeamId) : fantasyResearchTeams.homeTeamId == null) && ((str3 = this.awayTeamId) != null ? str3.equals(fantasyResearchTeams.awayTeamId) : fantasyResearchTeams.awayTeamId == null) && ((str4 = this.MatchName) != null ? str4.equals(fantasyResearchTeams.MatchName) : fantasyResearchTeams.MatchName == null) && ((str5 = this.matchStatus) != null ? str5.equals(fantasyResearchTeams.matchStatus) : fantasyResearchTeams.matchStatus == null) && ((bool = this.playing11Status) != null ? bool.equals(fantasyResearchTeams.playing11Status) : fantasyResearchTeams.playing11Status == null) && ((list2 = this.teams) != null ? list2.equals(fantasyResearchTeams.teams) : fantasyResearchTeams.teams == null) && ((str6 = this.statusMessage) != null ? str6.equals(fantasyResearchTeams.statusMessage) : fantasyResearchTeams.statusMessage == null) && ((str7 = this.matchType) != null ? str7.equals(fantasyResearchTeams.matchType) : fantasyResearchTeams.matchType == null) && ((str8 = this.currentInningsTeamID) != null ? str8.equals(fantasyResearchTeams.currentInningsTeamID) : fantasyResearchTeams.currentInningsTeamID == null) && ((str9 = this.currentinningsNo) != null ? str9.equals(fantasyResearchTeams.currentinningsNo) : fantasyResearchTeams.currentinningsNo == null) && ((str10 = this.homeTeamShortName) != null ? str10.equals(fantasyResearchTeams.homeTeamShortName) : fantasyResearchTeams.homeTeamShortName == null)) {
                String str11 = this.awayTeamShortName;
                String str12 = fantasyResearchTeams.awayTeamShortName;
                if (str11 == null) {
                    if (str12 == null) {
                        return true;
                    }
                } else if (str11.equals(str12)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<MatchScore> list = this.matchScore;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str = this.matchId;
                int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.homeTeamId;
                int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.awayTeamId;
                int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.MatchName;
                int hashCode6 = (hashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.matchStatus;
                int hashCode7 = (hashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Boolean bool = this.playing11Status;
                int hashCode8 = (hashCode7 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                List<Team> list2 = this.teams;
                int hashCode9 = (hashCode8 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                String str6 = this.statusMessage;
                int hashCode10 = (hashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.matchType;
                int hashCode11 = (hashCode10 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.currentInningsTeamID;
                int hashCode12 = (hashCode11 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.currentinningsNo;
                int hashCode13 = (hashCode12 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.homeTeamShortName;
                int hashCode14 = (hashCode13 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.awayTeamShortName;
                if (str11 != null) {
                    i = str11.hashCode();
                }
                this.$hashCode = hashCode14 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<FantasyResearchTeams> {
            final MatchScore.Mapper matchScoreFieldMapper = new MatchScore.Mapper();
            final Team.Mapper teamFieldMapper = new Team.Mapper();

            @Override 
            public FantasyResearchTeams map(ResponseReader responseReader) {
                return new FantasyResearchTeams(responseReader.readString(FantasyResearchTeams.$responseFields[0]), responseReader.readList(FantasyResearchTeams.$responseFields[1], new ResponseReader.ListReader<MatchScore>() {


                    @Override 
                    public MatchScore read(ResponseReader.ListItemReader listItemReader) {
                        return (MatchScore) listItemReader.readObject(new ResponseReader.ObjectReader<MatchScore>() {


                            @Override 
                            public MatchScore read(ResponseReader responseReader) {
                                return Mapper.this.matchScoreFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readString(FantasyResearchTeams.$responseFields[2]), responseReader.readString(FantasyResearchTeams.$responseFields[3]), responseReader.readString(FantasyResearchTeams.$responseFields[4]), responseReader.readString(FantasyResearchTeams.$responseFields[5]), responseReader.readString(FantasyResearchTeams.$responseFields[6]), responseReader.readBoolean(FantasyResearchTeams.$responseFields[7]), responseReader.readList(FantasyResearchTeams.$responseFields[8], new ResponseReader.ListReader<Team>() {


                    @Override 
                    public Team read(ResponseReader.ListItemReader listItemReader) {
                        return (Team) listItemReader.readObject(new ResponseReader.ObjectReader<Team>() {


                            @Override 
                            public Team read(ResponseReader responseReader) {
                                return Mapper.this.teamFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readString(FantasyResearchTeams.$responseFields[9]), responseReader.readString(FantasyResearchTeams.$responseFields[10]), responseReader.readString(FantasyResearchTeams.$responseFields[11]), responseReader.readString(FantasyResearchTeams.$responseFields[12]), responseReader.readString(FantasyResearchTeams.$responseFields[13]), responseReader.readString(FantasyResearchTeams.$responseFields[14]));
            }
        }
    }

    public static class MatchScore {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamShortName", "teamShortName", null, true, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("teamFullName", "teamFullName", null, true, Collections.emptyList()), ResponseField.forList("teamScore", "teamScore", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String teamFullName;
        final String teamID;
        final List<TeamScore> teamScore;
        final String teamShortName;

        public MatchScore(String str, String str2, String str3, String str4, List<TeamScore> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.teamShortName = str2;
            this.teamID = str3;
            this.teamFullName = str4;
            this.teamScore = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public String teamShortName() {
            return this.teamShortName;
        }

        public String teamID() {
            return this.teamID;
        }

        public String teamFullName() {
            return this.teamFullName;
        }

        public List<TeamScore> teamScore() {
            return this.teamScore;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(MatchScore.$responseFields[0], MatchScore.this.__typename);
                    responseWriter.writeString(MatchScore.$responseFields[1], MatchScore.this.teamShortName);
                    responseWriter.writeString(MatchScore.$responseFields[2], MatchScore.this.teamID);
                    responseWriter.writeString(MatchScore.$responseFields[3], MatchScore.this.teamFullName);
                    responseWriter.writeList(MatchScore.$responseFields[4], MatchScore.this.teamScore, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((TeamScore) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "MatchScore{__typename=" + this.__typename + ", teamShortName=" + this.teamShortName + ", teamID=" + this.teamID + ", teamFullName=" + this.teamFullName + ", teamScore=" + this.teamScore + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MatchScore)) {
                return false;
            }
            MatchScore matchScore = (MatchScore) obj;
            if (this.__typename.equals(matchScore.__typename) && ((str = this.teamShortName) != null ? str.equals(matchScore.teamShortName) : matchScore.teamShortName == null) && ((str2 = this.teamID) != null ? str2.equals(matchScore.teamID) : matchScore.teamID == null) && ((str3 = this.teamFullName) != null ? str3.equals(matchScore.teamFullName) : matchScore.teamFullName == null)) {
                List<TeamScore> list = this.teamScore;
                List<TeamScore> list2 = matchScore.teamScore;
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
                String str = this.teamShortName;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.teamID;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.teamFullName;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                List<TeamScore> list = this.teamScore;
                if (list != null) {
                    i = list.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<MatchScore> {
            final TeamScore.Mapper teamScoreFieldMapper = new TeamScore.Mapper();

            @Override 
            public MatchScore map(ResponseReader responseReader) {
                return new MatchScore(responseReader.readString(MatchScore.$responseFields[0]), responseReader.readString(MatchScore.$responseFields[1]), responseReader.readString(MatchScore.$responseFields[2]), responseReader.readString(MatchScore.$responseFields[3]), responseReader.readList(MatchScore.$responseFields[4], new ResponseReader.ListReader<TeamScore>() {


                    @Override 
                    public TeamScore read(ResponseReader.ListItemReader listItemReader) {
                        return (TeamScore) listItemReader.readObject(new ResponseReader.ObjectReader<TeamScore>() {


                            @Override 
                            public TeamScore read(ResponseReader responseReader) {
                                return Mapper.this.teamScoreFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class TeamScore {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("inning", "inning", null, true, Collections.emptyList()), ResponseField.forString("inningNumber", "inningNumber", null, true, Collections.emptyList()), ResponseField.forString("battingTeam", "battingTeam", null, true, Collections.emptyList()), ResponseField.forString("runsScored", "runsScored", null, true, Collections.emptyList()), ResponseField.forString("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forString("overs", "overs", null, true, Collections.emptyList()), ResponseField.forString("runRate", "runRate", null, true, Collections.emptyList()), ResponseField.forString("battingSide", "battingSide", null, true, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("battingTeamShortName", "battingTeamShortName", null, true, Collections.emptyList()), ResponseField.forBoolean("declared", "declared", null, true, Collections.emptyList()), ResponseField.forBoolean("folowOn", "folowOn", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String battingSide;
        final String battingTeam;
        final String battingTeamShortName;
        final Boolean declared;
        final Boolean folowOn;
        final Integer inning;
        final String inningNumber;
        final String overs;
        final String runRate;
        final String runsScored;
        final String teamID;
        final String wickets;

        public TeamScore(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, Boolean bool2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.inning = num;
            this.inningNumber = str2;
            this.battingTeam = str3;
            this.runsScored = str4;
            this.wickets = str5;
            this.overs = str6;
            this.runRate = str7;
            this.battingSide = str8;
            this.teamID = str9;
            this.battingTeamShortName = str10;
            this.declared = bool;
            this.folowOn = bool2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer inning() {
            return this.inning;
        }

        public String inningNumber() {
            return this.inningNumber;
        }

        public String battingTeam() {
            return this.battingTeam;
        }

        public String runsScored() {
            return this.runsScored;
        }

        public String wickets() {
            return this.wickets;
        }

        public String overs() {
            return this.overs;
        }

        public String runRate() {
            return this.runRate;
        }

        public String battingSide() {
            return this.battingSide;
        }

        public String teamID() {
            return this.teamID;
        }

        public String battingTeamShortName() {
            return this.battingTeamShortName;
        }

        public Boolean declared() {
            return this.declared;
        }

        public Boolean folowOn() {
            return this.folowOn;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TeamScore.$responseFields[0], TeamScore.this.__typename);
                    responseWriter.writeInt(TeamScore.$responseFields[1], TeamScore.this.inning);
                    responseWriter.writeString(TeamScore.$responseFields[2], TeamScore.this.inningNumber);
                    responseWriter.writeString(TeamScore.$responseFields[3], TeamScore.this.battingTeam);
                    responseWriter.writeString(TeamScore.$responseFields[4], TeamScore.this.runsScored);
                    responseWriter.writeString(TeamScore.$responseFields[5], TeamScore.this.wickets);
                    responseWriter.writeString(TeamScore.$responseFields[6], TeamScore.this.overs);
                    responseWriter.writeString(TeamScore.$responseFields[7], TeamScore.this.runRate);
                    responseWriter.writeString(TeamScore.$responseFields[8], TeamScore.this.battingSide);
                    responseWriter.writeString(TeamScore.$responseFields[9], TeamScore.this.teamID);
                    responseWriter.writeString(TeamScore.$responseFields[10], TeamScore.this.battingTeamShortName);
                    responseWriter.writeBoolean(TeamScore.$responseFields[11], TeamScore.this.declared);
                    responseWriter.writeBoolean(TeamScore.$responseFields[12], TeamScore.this.folowOn);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TeamScore{__typename=" + this.__typename + ", inning=" + this.inning + ", inningNumber=" + this.inningNumber + ", battingTeam=" + this.battingTeam + ", runsScored=" + this.runsScored + ", wickets=" + this.wickets + ", overs=" + this.overs + ", runRate=" + this.runRate + ", battingSide=" + this.battingSide + ", teamID=" + this.teamID + ", battingTeamShortName=" + this.battingTeamShortName + ", declared=" + this.declared + ", folowOn=" + this.folowOn + "}";
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
            String str9;
            Boolean bool;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TeamScore)) {
                return false;
            }
            TeamScore teamScore = (TeamScore) obj;
            if (this.__typename.equals(teamScore.__typename) && ((num = this.inning) != null ? num.equals(teamScore.inning) : teamScore.inning == null) && ((str = this.inningNumber) != null ? str.equals(teamScore.inningNumber) : teamScore.inningNumber == null) && ((str2 = this.battingTeam) != null ? str2.equals(teamScore.battingTeam) : teamScore.battingTeam == null) && ((str3 = this.runsScored) != null ? str3.equals(teamScore.runsScored) : teamScore.runsScored == null) && ((str4 = this.wickets) != null ? str4.equals(teamScore.wickets) : teamScore.wickets == null) && ((str5 = this.overs) != null ? str5.equals(teamScore.overs) : teamScore.overs == null) && ((str6 = this.runRate) != null ? str6.equals(teamScore.runRate) : teamScore.runRate == null) && ((str7 = this.battingSide) != null ? str7.equals(teamScore.battingSide) : teamScore.battingSide == null) && ((str8 = this.teamID) != null ? str8.equals(teamScore.teamID) : teamScore.teamID == null) && ((str9 = this.battingTeamShortName) != null ? str9.equals(teamScore.battingTeamShortName) : teamScore.battingTeamShortName == null) && ((bool = this.declared) != null ? bool.equals(teamScore.declared) : teamScore.declared == null)) {
                Boolean bool2 = this.folowOn;
                Boolean bool3 = teamScore.folowOn;
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
                Integer num = this.inning;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                String str = this.inningNumber;
                int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.battingTeam;
                int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.runsScored;
                int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.wickets;
                int hashCode6 = (hashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.overs;
                int hashCode7 = (hashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.runRate;
                int hashCode8 = (hashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.battingSide;
                int hashCode9 = (hashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.teamID;
                int hashCode10 = (hashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.battingTeamShortName;
                int hashCode11 = (hashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                Boolean bool = this.declared;
                int hashCode12 = (hashCode11 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.folowOn;
                if (bool2 != null) {
                    i = bool2.hashCode();
                }
                this.$hashCode = hashCode12 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TeamScore> {
            @Override 
            public TeamScore map(ResponseReader responseReader) {
                return new TeamScore(responseReader.readString(TeamScore.$responseFields[0]), responseReader.readInt(TeamScore.$responseFields[1]), responseReader.readString(TeamScore.$responseFields[2]), responseReader.readString(TeamScore.$responseFields[3]), responseReader.readString(TeamScore.$responseFields[4]), responseReader.readString(TeamScore.$responseFields[5]), responseReader.readString(TeamScore.$responseFields[6]), responseReader.readString(TeamScore.$responseFields[7]), responseReader.readString(TeamScore.$responseFields[8]), responseReader.readString(TeamScore.$responseFields[9]), responseReader.readString(TeamScore.$responseFields[10]), responseReader.readBoolean(TeamScore.$responseFields[11]), responseReader.readBoolean(TeamScore.$responseFields[12]));
            }
        }
    }

    public static class Team {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("fantasy_teamName", "fantasy_teamName", null, true, Collections.emptyList()), ResponseField.forString("totalCredits", "totalCredits", null, true, Collections.emptyList()), ResponseField.forString("totalProjectedPoints", "totalProjectedPoints", null, true, Collections.emptyList()), ResponseField.forString("homeTeamCount", "homeTeamCount", null, true, Collections.emptyList()), ResponseField.forString("awayTeamCount", "awayTeamCount", null, true, Collections.emptyList()), ResponseField.forBoolean("playing11Status", "playing11Status", null, true, Collections.emptyList()), ResponseField.forString("homeTeamShortName", "homeTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("awayTeamShortName", "awayTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("homeTeamId", "homeTeamId", null, true, Collections.emptyList()), ResponseField.forString("awayTeamId", "awayTeamId", null, true, Collections.emptyList()), ResponseField.forString("MatchName", "MatchName", null, true, Collections.emptyList()), ResponseField.forList("players", "players", null, true, Collections.emptyList()), ResponseField.forString("totalFPoints", "totalFPoints", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String MatchName;
        final String __typename;
        final String awayTeamCount;
        final String awayTeamId;
        final String awayTeamShortName;
        final String fantasy_teamName;
        final String homeTeamCount;
        final String homeTeamId;
        final String homeTeamShortName;
        final List<C5158Player> players;
        final Boolean playing11Status;
        final String totalCredits;
        final String totalFPoints;
        final String totalProjectedPoints;

        public Team(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, String str9, String str10, String str11, List<C5158Player> list, String str12) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.fantasy_teamName = str2;
            this.totalCredits = str3;
            this.totalProjectedPoints = str4;
            this.homeTeamCount = str5;
            this.awayTeamCount = str6;
            this.playing11Status = bool;
            this.homeTeamShortName = str7;
            this.awayTeamShortName = str8;
            this.homeTeamId = str9;
            this.awayTeamId = str10;
            this.MatchName = str11;
            this.players = list;
            this.totalFPoints = str12;
        }

        public String __typename() {
            return this.__typename;
        }

        public String fantasy_teamName() {
            return this.fantasy_teamName;
        }

        public String totalCredits() {
            return this.totalCredits;
        }

        public String totalProjectedPoints() {
            return this.totalProjectedPoints;
        }

        public String homeTeamCount() {
            return this.homeTeamCount;
        }

        public String awayTeamCount() {
            return this.awayTeamCount;
        }

        public Boolean playing11Status() {
            return this.playing11Status;
        }

        public String homeTeamShortName() {
            return this.homeTeamShortName;
        }

        public String awayTeamShortName() {
            return this.awayTeamShortName;
        }

        public String homeTeamId() {
            return this.homeTeamId;
        }

        public String awayTeamId() {
            return this.awayTeamId;
        }

        public String MatchName() {
            return this.MatchName;
        }

        public List<C5158Player> players() {
            return this.players;
        }

        public String totalFPoints() {
            return this.totalFPoints;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Team.$responseFields[0], Team.this.__typename);
                    responseWriter.writeString(Team.$responseFields[1], Team.this.fantasy_teamName);
                    responseWriter.writeString(Team.$responseFields[2], Team.this.totalCredits);
                    responseWriter.writeString(Team.$responseFields[3], Team.this.totalProjectedPoints);
                    responseWriter.writeString(Team.$responseFields[4], Team.this.homeTeamCount);
                    responseWriter.writeString(Team.$responseFields[5], Team.this.awayTeamCount);
                    responseWriter.writeBoolean(Team.$responseFields[6], Team.this.playing11Status);
                    responseWriter.writeString(Team.$responseFields[7], Team.this.homeTeamShortName);
                    responseWriter.writeString(Team.$responseFields[8], Team.this.awayTeamShortName);
                    responseWriter.writeString(Team.$responseFields[9], Team.this.homeTeamId);
                    responseWriter.writeString(Team.$responseFields[10], Team.this.awayTeamId);
                    responseWriter.writeString(Team.$responseFields[11], Team.this.MatchName);
                    responseWriter.writeList(Team.$responseFields[12], Team.this.players, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((C5158Player) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeString(Team.$responseFields[13], Team.this.totalFPoints);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Team{__typename=" + this.__typename + ", fantasy_teamName=" + this.fantasy_teamName + ", totalCredits=" + this.totalCredits + ", totalProjectedPoints=" + this.totalProjectedPoints + ", homeTeamCount=" + this.homeTeamCount + ", awayTeamCount=" + this.awayTeamCount + ", playing11Status=" + this.playing11Status + ", homeTeamShortName=" + this.homeTeamShortName + ", awayTeamShortName=" + this.awayTeamShortName + ", homeTeamId=" + this.homeTeamId + ", awayTeamId=" + this.awayTeamId + ", MatchName=" + this.MatchName + ", players=" + this.players + ", totalFPoints=" + this.totalFPoints + "}";
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
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            List<C5158Player> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Team)) {
                return false;
            }
            Team team = (Team) obj;
            if (this.__typename.equals(team.__typename) && ((str = this.fantasy_teamName) != null ? str.equals(team.fantasy_teamName) : team.fantasy_teamName == null) && ((str2 = this.totalCredits) != null ? str2.equals(team.totalCredits) : team.totalCredits == null) && ((str3 = this.totalProjectedPoints) != null ? str3.equals(team.totalProjectedPoints) : team.totalProjectedPoints == null) && ((str4 = this.homeTeamCount) != null ? str4.equals(team.homeTeamCount) : team.homeTeamCount == null) && ((str5 = this.awayTeamCount) != null ? str5.equals(team.awayTeamCount) : team.awayTeamCount == null) && ((bool = this.playing11Status) != null ? bool.equals(team.playing11Status) : team.playing11Status == null) && ((str6 = this.homeTeamShortName) != null ? str6.equals(team.homeTeamShortName) : team.homeTeamShortName == null) && ((str7 = this.awayTeamShortName) != null ? str7.equals(team.awayTeamShortName) : team.awayTeamShortName == null) && ((str8 = this.homeTeamId) != null ? str8.equals(team.homeTeamId) : team.homeTeamId == null) && ((str9 = this.awayTeamId) != null ? str9.equals(team.awayTeamId) : team.awayTeamId == null) && ((str10 = this.MatchName) != null ? str10.equals(team.MatchName) : team.MatchName == null) && ((list = this.players) != null ? list.equals(team.players) : team.players == null)) {
                String str11 = this.totalFPoints;
                String str12 = team.totalFPoints;
                if (str11 == null) {
                    if (str12 == null) {
                        return true;
                    }
                } else if (str11.equals(str12)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.fantasy_teamName;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.totalCredits;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.totalProjectedPoints;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.homeTeamCount;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.awayTeamCount;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Boolean bool = this.playing11Status;
                int hashCode7 = (hashCode6 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str6 = this.homeTeamShortName;
                int hashCode8 = (hashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.awayTeamShortName;
                int hashCode9 = (hashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.homeTeamId;
                int hashCode10 = (hashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.awayTeamId;
                int hashCode11 = (hashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.MatchName;
                int hashCode12 = (hashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                List<C5158Player> list = this.players;
                int hashCode13 = (hashCode12 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str11 = this.totalFPoints;
                if (str11 != null) {
                    i = str11.hashCode();
                }
                this.$hashCode = hashCode13 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Team> {
            final C5158Player.Mapper playerFieldMapper = new C5158Player.Mapper();

            @Override 
            public Team map(ResponseReader responseReader) {
                return new Team(responseReader.readString(Team.$responseFields[0]), responseReader.readString(Team.$responseFields[1]), responseReader.readString(Team.$responseFields[2]), responseReader.readString(Team.$responseFields[3]), responseReader.readString(Team.$responseFields[4]), responseReader.readString(Team.$responseFields[5]), responseReader.readBoolean(Team.$responseFields[6]), responseReader.readString(Team.$responseFields[7]), responseReader.readString(Team.$responseFields[8]), responseReader.readString(Team.$responseFields[9]), responseReader.readString(Team.$responseFields[10]), responseReader.readString(Team.$responseFields[11]), responseReader.readList(Team.$responseFields[12], new ResponseReader.ListReader<C5158Player>() {


                    @Override 
                    public C5158Player read(ResponseReader.ListItemReader listItemReader) {
                        return (C5158Player) listItemReader.readObject(new ResponseReader.ObjectReader<C5158Player>() {


                            @Override 
                            public C5158Player read(ResponseReader responseReader) {
                                return Mapper.this.playerFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readString(Team.$responseFields[13]));
            }
        }
    }


    public static class C5158Player {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forDouble("credits", "credits", null, true, Collections.emptyList()), ResponseField.forDouble("playerCredits", "playerCredits", null, true, Collections.emptyList()), ResponseField.forString("playerId", "playerId", null, true, Collections.emptyList()), ResponseField.forString("playerFeedID", "playerFeedID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("selectionPercent", "selectionPercent", null, true, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, true, Collections.emptyList()), ResponseField.forString("playerRole", "playerRole", null, true, Collections.emptyList()), ResponseField.forBoolean("captain", "captain", null, true, Collections.emptyList()), ResponseField.forBoolean("vice_captain", "vice_captain", null, true, Collections.emptyList()), ResponseField.forString("projectedPoints", "projectedPoints", null, true, Collections.emptyList()), ResponseField.forString("playerClubName", "playerClubName", null, true, Collections.emptyList()), ResponseField.forString("ActualPoint", "ActualPoint", null, true, Collections.emptyList()), ResponseField.forString("playerCaptain", "playerCaptain", null, true, Collections.emptyList()), ResponseField.forString("playerViceCaptain", "playerViceCaptain", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String ActualPoint;
        final String __typename;
        final Boolean captain;
        final Double credits;
        final String playerCaptain;
        final String playerClubName;
        final Double playerCredits;
        final String playerFeedID;
        final String playerId;
        final String playerName;
        final String playerRole;
        final String playerViceCaptain;
        final String projectedPoints;
        final String selectionPercent;
        final String teamName;
        final Boolean vice_captain;

        public C5158Player(String str, Double d, Double d2, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, String str8, String str9, String str10, String str11, String str12) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.credits = d;
            this.playerCredits = d2;
            this.playerId = str2;
            this.playerFeedID = str3;
            this.playerName = str4;
            this.selectionPercent = str5;
            this.teamName = str6;
            this.playerRole = str7;
            this.captain = bool;
            this.vice_captain = bool2;
            this.projectedPoints = str8;
            this.playerClubName = str9;
            this.ActualPoint = str10;
            this.playerCaptain = str11;
            this.playerViceCaptain = str12;
        }

        public String __typename() {
            return this.__typename;
        }

        public Double credits() {
            return this.credits;
        }

        public Double playerCredits() {
            return this.playerCredits;
        }

        public String playerId() {
            return this.playerId;
        }

        public String playerFeedID() {
            return this.playerFeedID;
        }

        public String playerName() {
            return this.playerName;
        }

        public String selectionPercent() {
            return this.selectionPercent;
        }

        public String teamName() {
            return this.teamName;
        }

        public String playerRole() {
            return this.playerRole;
        }

        public Boolean captain() {
            return this.captain;
        }

        public Boolean vice_captain() {
            return this.vice_captain;
        }

        public String projectedPoints() {
            return this.projectedPoints;
        }

        public String playerClubName() {
            return this.playerClubName;
        }

        public String ActualPoint() {
            return this.ActualPoint;
        }

        public String playerCaptain() {
            return this.playerCaptain;
        }

        public String playerViceCaptain() {
            return this.playerViceCaptain;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(C5158Player.$responseFields[0], C5158Player.this.__typename);
                    responseWriter.writeDouble(C5158Player.$responseFields[1], C5158Player.this.credits);
                    responseWriter.writeDouble(C5158Player.$responseFields[2], C5158Player.this.playerCredits);
                    responseWriter.writeString(C5158Player.$responseFields[3], C5158Player.this.playerId);
                    responseWriter.writeString(C5158Player.$responseFields[4], C5158Player.this.playerFeedID);
                    responseWriter.writeString(C5158Player.$responseFields[5], C5158Player.this.playerName);
                    responseWriter.writeString(C5158Player.$responseFields[6], C5158Player.this.selectionPercent);
                    responseWriter.writeString(C5158Player.$responseFields[7], C5158Player.this.teamName);
                    responseWriter.writeString(C5158Player.$responseFields[8], C5158Player.this.playerRole);
                    responseWriter.writeBoolean(C5158Player.$responseFields[9], C5158Player.this.captain);
                    responseWriter.writeBoolean(C5158Player.$responseFields[10], C5158Player.this.vice_captain);
                    responseWriter.writeString(C5158Player.$responseFields[11], C5158Player.this.projectedPoints);
                    responseWriter.writeString(C5158Player.$responseFields[12], C5158Player.this.playerClubName);
                    responseWriter.writeString(C5158Player.$responseFields[13], C5158Player.this.ActualPoint);
                    responseWriter.writeString(C5158Player.$responseFields[14], C5158Player.this.playerCaptain);
                    responseWriter.writeString(C5158Player.$responseFields[15], C5158Player.this.playerViceCaptain);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Player{__typename=" + this.__typename + ", credits=" + this.credits + ", playerCredits=" + this.playerCredits + ", playerId=" + this.playerId + ", playerFeedID=" + this.playerFeedID + ", playerName=" + this.playerName + ", selectionPercent=" + this.selectionPercent + ", teamName=" + this.teamName + ", playerRole=" + this.playerRole + ", captain=" + this.captain + ", vice_captain=" + this.vice_captain + ", projectedPoints=" + this.projectedPoints + ", playerClubName=" + this.playerClubName + ", ActualPoint=" + this.ActualPoint + ", playerCaptain=" + this.playerCaptain + ", playerViceCaptain=" + this.playerViceCaptain + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Double d;
            Double d2;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            Boolean bool;
            Boolean bool2;
            String str7;
            String str8;
            String str9;
            String str10;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C5158Player)) {
                return false;
            }
            C5158Player player = (C5158Player) obj;
            if (this.__typename.equals(player.__typename) && ((d = this.credits) != null ? d.equals(player.credits) : player.credits == null) && ((d2 = this.playerCredits) != null ? d2.equals(player.playerCredits) : player.playerCredits == null) && ((str = this.playerId) != null ? str.equals(player.playerId) : player.playerId == null) && ((str2 = this.playerFeedID) != null ? str2.equals(player.playerFeedID) : player.playerFeedID == null) && ((str3 = this.playerName) != null ? str3.equals(player.playerName) : player.playerName == null) && ((str4 = this.selectionPercent) != null ? str4.equals(player.selectionPercent) : player.selectionPercent == null) && ((str5 = this.teamName) != null ? str5.equals(player.teamName) : player.teamName == null) && ((str6 = this.playerRole) != null ? str6.equals(player.playerRole) : player.playerRole == null) && ((bool = this.captain) != null ? bool.equals(player.captain) : player.captain == null) && ((bool2 = this.vice_captain) != null ? bool2.equals(player.vice_captain) : player.vice_captain == null) && ((str7 = this.projectedPoints) != null ? str7.equals(player.projectedPoints) : player.projectedPoints == null) && ((str8 = this.playerClubName) != null ? str8.equals(player.playerClubName) : player.playerClubName == null) && ((str9 = this.ActualPoint) != null ? str9.equals(player.ActualPoint) : player.ActualPoint == null) && ((str10 = this.playerCaptain) != null ? str10.equals(player.playerCaptain) : player.playerCaptain == null)) {
                String str11 = this.playerViceCaptain;
                String str12 = player.playerViceCaptain;
                if (str11 == null) {
                    if (str12 == null) {
                        return true;
                    }
                } else if (str11.equals(str12)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Double d = this.credits;
                int i = 0;
                int hashCode2 = (hashCode ^ (d == null ? 0 : d.hashCode())) * 1000003;
                Double d2 = this.playerCredits;
                int hashCode3 = (hashCode2 ^ (d2 == null ? 0 : d2.hashCode())) * 1000003;
                String str = this.playerId;
                int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.playerFeedID;
                int hashCode5 = (hashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.playerName;
                int hashCode6 = (hashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.selectionPercent;
                int hashCode7 = (hashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.teamName;
                int hashCode8 = (hashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.playerRole;
                int hashCode9 = (hashCode8 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                Boolean bool = this.captain;
                int hashCode10 = (hashCode9 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                Boolean bool2 = this.vice_captain;
                int hashCode11 = (hashCode10 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
                String str7 = this.projectedPoints;
                int hashCode12 = (hashCode11 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.playerClubName;
                int hashCode13 = (hashCode12 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.ActualPoint;
                int hashCode14 = (hashCode13 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.playerCaptain;
                int hashCode15 = (hashCode14 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.playerViceCaptain;
                if (str11 != null) {
                    i = str11.hashCode();
                }
                this.$hashCode = hashCode15 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }


        public static final class Mapper implements ResponseFieldMapper<C5158Player> {
            @Override 
            public C5158Player map(ResponseReader responseReader) {
                return new C5158Player(responseReader.readString(C5158Player.$responseFields[0]), responseReader.readDouble(C5158Player.$responseFields[1]), responseReader.readDouble(C5158Player.$responseFields[2]), responseReader.readString(C5158Player.$responseFields[3]), responseReader.readString(C5158Player.$responseFields[4]), responseReader.readString(C5158Player.$responseFields[5]), responseReader.readString(C5158Player.$responseFields[6]), responseReader.readString(C5158Player.$responseFields[7]), responseReader.readString(C5158Player.$responseFields[8]), responseReader.readBoolean(C5158Player.$responseFields[9]), responseReader.readBoolean(C5158Player.$responseFields[10]), responseReader.readString(C5158Player.$responseFields[11]), responseReader.readString(C5158Player.$responseFields[12]), responseReader.readString(C5158Player.$responseFields[13]), responseReader.readString(C5158Player.$responseFields[14]), responseReader.readString(C5158Player.$responseFields[15]));
            }
        }
    }
}
