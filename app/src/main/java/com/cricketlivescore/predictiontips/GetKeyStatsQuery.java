package com.cricketlivescore.predictiontips;

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

public final class GetKeyStatsQuery implements Query<GetKeyStatsQuery.Data, GetKeyStatsQuery.Data, GetKeyStatsQuery.Variables> {
    public static final String OPERATION_ID = "739f9ca7be262f335a096bbd6f0ff3ecc393141b1e0528a3a57376aa75801901";
    public static final OperationName OPERATION_NAME = new OperationName() {


       @Override
        public String name() {
            return "getKeyStats";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query getKeyStats($matchID: String!) {\n  getKeyStats(matchID: $matchID) {\n    __typename\n    head2headStats {\n      __typename\n      venueStatsData {\n        __typename\n        firstBattingWinPercent\n        avgFirstInningScore\n        venueName\n        venueID\n        paceWicketPercent\n        spinWicketPercent\n        highestScoreChased\n      }\n      head2Head {\n        __typename\n        totalMatches\n        noResult\n        teamA\n        teamB\n      }\n      teamA {\n        __typename\n        key\n        lastFStatus\n        teamName\n        teamShortName\n        color\n      }\n      teamB {\n        __typename\n        key\n        lastFStatus\n        teamName\n        teamShortName\n        color\n      }\n    }\n    topRunScorer1 {\n      __typename\n      teamID\n      fullName\n      shortName\n      playerID\n      playerName\n      playerRuns\n      playerWicket\n      average\n    }\n    topRunScorer2 {\n      __typename\n      teamID\n      fullName\n      shortName\n      playerID\n      playerName\n      playerRuns\n      playerWicket\n      average\n    }\n    topWicketTaker1 {\n      __typename\n      teamID\n      fullName\n      shortName\n      playerID\n      playerName\n      totalWickets\n      average\n    }\n    topWicketTaker2 {\n      __typename\n      teamID\n      fullName\n      shortName\n      playerID\n      playerName\n      totalWickets\n      average\n    }\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public GetKeyStatsQuery(String str) {
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

        public GetKeyStatsQuery build() {
            Utils.checkNotNull(this.matchID, "matchID == null");
            return new GetKeyStatsQuery(this.matchID);
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
        static final ResponseField[] $responseFields = {ResponseField.forObject("getKeyStats", "getKeyStats", new UnmodifiableMapBuilder(1).put("matchID", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "matchID").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final GetKeyStats getKeyStats;

        public Data(GetKeyStats getKeyStats2) {
            this.getKeyStats = getKeyStats2;
        }

        public GetKeyStats getKeyStats() {
            return this.getKeyStats;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.getKeyStats != null ? Data.this.getKeyStats.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getKeyStats=" + this.getKeyStats + "}";
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
            GetKeyStats getKeyStats2 = this.getKeyStats;
            GetKeyStats getKeyStats3 = ((Data) obj).getKeyStats;
            if (getKeyStats2 != null) {
                return getKeyStats2.equals(getKeyStats3);
            }
            if (getKeyStats3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetKeyStats getKeyStats2 = this.getKeyStats;
                this.$hashCode = 1000003 ^ (getKeyStats2 == null ? 0 : getKeyStats2.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetKeyStats.Mapper getKeyStatsFieldMapper = new GetKeyStats.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((GetKeyStats) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetKeyStats>() {


                    @Override 
                    public GetKeyStats read(ResponseReader responseReader) {
                        return Mapper.this.getKeyStatsFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class GetKeyStats {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forObject("head2headStats", "head2headStats", null, true, Collections.emptyList()), ResponseField.forObject("topRunScorer1", "topRunScorer1", null, true, Collections.emptyList()), ResponseField.forObject("topRunScorer2", "topRunScorer2", null, true, Collections.emptyList()), ResponseField.forObject("topWicketTaker1", "topWicketTaker1", null, true, Collections.emptyList()), ResponseField.forObject("topWicketTaker2", "topWicketTaker2", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Head2headStats head2headStats;
        final TopRunScorer1 topRunScorer1;
        final TopRunScorer2 topRunScorer2;
        final TopWicketTaker1 topWicketTaker1;
        final TopWicketTaker2 topWicketTaker2;

        public GetKeyStats(String str, Head2headStats head2headStats2, TopRunScorer1 topRunScorer12, TopRunScorer2 topRunScorer22, TopWicketTaker1 topWicketTaker12, TopWicketTaker2 topWicketTaker22) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.head2headStats = head2headStats2;
            this.topRunScorer1 = topRunScorer12;
            this.topRunScorer2 = topRunScorer22;
            this.topWicketTaker1 = topWicketTaker12;
            this.topWicketTaker2 = topWicketTaker22;
        }

        public String __typename() {
            return this.__typename;
        }

        public Head2headStats head2headStats() {
            return this.head2headStats;
        }

        public TopRunScorer1 topRunScorer1() {
            return this.topRunScorer1;
        }

        public TopRunScorer2 topRunScorer2() {
            return this.topRunScorer2;
        }

        public TopWicketTaker1 topWicketTaker1() {
            return this.topWicketTaker1;
        }

        public TopWicketTaker2 topWicketTaker2() {
            return this.topWicketTaker2;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(GetKeyStats.$responseFields[0], GetKeyStats.this.__typename);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(GetKeyStats.$responseFields[1], GetKeyStats.this.head2headStats != null ? GetKeyStats.this.head2headStats.marshaller() : null);
                    responseWriter.writeObject(GetKeyStats.$responseFields[2], GetKeyStats.this.topRunScorer1 != null ? GetKeyStats.this.topRunScorer1.marshaller() : null);
                    responseWriter.writeObject(GetKeyStats.$responseFields[3], GetKeyStats.this.topRunScorer2 != null ? GetKeyStats.this.topRunScorer2.marshaller() : null);
                    responseWriter.writeObject(GetKeyStats.$responseFields[4], GetKeyStats.this.topWicketTaker1 != null ? GetKeyStats.this.topWicketTaker1.marshaller() : null);
                    ResponseField responseField = GetKeyStats.$responseFields[5];
                    if (GetKeyStats.this.topWicketTaker2 != null) {
                        responseFieldMarshaller = GetKeyStats.this.topWicketTaker2.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetKeyStats{__typename=" + this.__typename + ", head2headStats=" + this.head2headStats + ", topRunScorer1=" + this.topRunScorer1 + ", topRunScorer2=" + this.topRunScorer2 + ", topWicketTaker1=" + this.topWicketTaker1 + ", topWicketTaker2=" + this.topWicketTaker2 + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Head2headStats head2headStats2;
            TopRunScorer1 topRunScorer12;
            TopRunScorer2 topRunScorer22;
            TopWicketTaker1 topWicketTaker12;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetKeyStats)) {
                return false;
            }
            GetKeyStats getKeyStats = (GetKeyStats) obj;
            if (this.__typename.equals(getKeyStats.__typename) && ((head2headStats2 = this.head2headStats) != null ? head2headStats2.equals(getKeyStats.head2headStats) : getKeyStats.head2headStats == null) && ((topRunScorer12 = this.topRunScorer1) != null ? topRunScorer12.equals(getKeyStats.topRunScorer1) : getKeyStats.topRunScorer1 == null) && ((topRunScorer22 = this.topRunScorer2) != null ? topRunScorer22.equals(getKeyStats.topRunScorer2) : getKeyStats.topRunScorer2 == null) && ((topWicketTaker12 = this.topWicketTaker1) != null ? topWicketTaker12.equals(getKeyStats.topWicketTaker1) : getKeyStats.topWicketTaker1 == null)) {
                TopWicketTaker2 topWicketTaker22 = this.topWicketTaker2;
                TopWicketTaker2 topWicketTaker23 = getKeyStats.topWicketTaker2;
                if (topWicketTaker22 == null) {
                    if (topWicketTaker23 == null) {
                        return true;
                    }
                } else if (topWicketTaker22.equals(topWicketTaker23)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Head2headStats head2headStats2 = this.head2headStats;
                int i = 0;
                int hashCode2 = (hashCode ^ (head2headStats2 == null ? 0 : head2headStats2.hashCode())) * 1000003;
                TopRunScorer1 topRunScorer12 = this.topRunScorer1;
                int hashCode3 = (hashCode2 ^ (topRunScorer12 == null ? 0 : topRunScorer12.hashCode())) * 1000003;
                TopRunScorer2 topRunScorer22 = this.topRunScorer2;
                int hashCode4 = (hashCode3 ^ (topRunScorer22 == null ? 0 : topRunScorer22.hashCode())) * 1000003;
                TopWicketTaker1 topWicketTaker12 = this.topWicketTaker1;
                int hashCode5 = (hashCode4 ^ (topWicketTaker12 == null ? 0 : topWicketTaker12.hashCode())) * 1000003;
                TopWicketTaker2 topWicketTaker22 = this.topWicketTaker2;
                if (topWicketTaker22 != null) {
                    i = topWicketTaker22.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<GetKeyStats> {
            final Head2headStats.Mapper head2headStatsFieldMapper = new Head2headStats.Mapper();
            final TopRunScorer1.Mapper topRunScorer1FieldMapper = new TopRunScorer1.Mapper();
            final TopRunScorer2.Mapper topRunScorer2FieldMapper = new TopRunScorer2.Mapper();
            final TopWicketTaker1.Mapper topWicketTaker1FieldMapper = new TopWicketTaker1.Mapper();
            final TopWicketTaker2.Mapper topWicketTaker2FieldMapper = new TopWicketTaker2.Mapper();

            @Override 
            public GetKeyStats map(ResponseReader responseReader) {
                return new GetKeyStats(responseReader.readString(GetKeyStats.$responseFields[0]), (Head2headStats) responseReader.readObject(GetKeyStats.$responseFields[1], new ResponseReader.ObjectReader<Head2headStats>() {


                    @Override 
                    public Head2headStats read(ResponseReader responseReader) {
                        return Mapper.this.head2headStatsFieldMapper.map(responseReader);
                    }
                }), (TopRunScorer1) responseReader.readObject(GetKeyStats.$responseFields[2], new ResponseReader.ObjectReader<TopRunScorer1>() {


                    @Override 
                    public TopRunScorer1 read(ResponseReader responseReader) {
                        return Mapper.this.topRunScorer1FieldMapper.map(responseReader);
                    }
                }), (TopRunScorer2) responseReader.readObject(GetKeyStats.$responseFields[3], new ResponseReader.ObjectReader<TopRunScorer2>() {


                    @Override 
                    public TopRunScorer2 read(ResponseReader responseReader) {
                        return Mapper.this.topRunScorer2FieldMapper.map(responseReader);
                    }
                }), (TopWicketTaker1) responseReader.readObject(GetKeyStats.$responseFields[4], new ResponseReader.ObjectReader<TopWicketTaker1>() {


                    @Override 
                    public TopWicketTaker1 read(ResponseReader responseReader) {
                        return Mapper.this.topWicketTaker1FieldMapper.map(responseReader);
                    }
                }), (TopWicketTaker2) responseReader.readObject(GetKeyStats.$responseFields[5], new ResponseReader.ObjectReader<TopWicketTaker2>() {


                    @Override 
                    public TopWicketTaker2 read(ResponseReader responseReader) {
                        return Mapper.this.topWicketTaker2FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class Head2headStats {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forObject("venueStatsData", "venueStatsData", null, true, Collections.emptyList()), ResponseField.forObject("head2Head", "head2Head", null, true, Collections.emptyList()), ResponseField.forObject("teamA", "teamA", null, true, Collections.emptyList()), ResponseField.forObject("teamB", "teamB", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Head2Head head2Head;
        final TeamA teamA;
        final TeamB teamB;
        final VenueStatsData venueStatsData;

        public Head2headStats(String str, VenueStatsData venueStatsData2, Head2Head head2Head2, TeamA teamA2, TeamB teamB2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.venueStatsData = venueStatsData2;
            this.head2Head = head2Head2;
            this.teamA = teamA2;
            this.teamB = teamB2;
        }

        public String __typename() {
            return this.__typename;
        }

        public VenueStatsData venueStatsData() {
            return this.venueStatsData;
        }

        public Head2Head head2Head() {
            return this.head2Head;
        }

        public TeamA teamA() {
            return this.teamA;
        }

        public TeamB teamB() {
            return this.teamB;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Head2headStats.$responseFields[0], Head2headStats.this.__typename);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(Head2headStats.$responseFields[1], Head2headStats.this.venueStatsData != null ? Head2headStats.this.venueStatsData.marshaller() : null);
                    responseWriter.writeObject(Head2headStats.$responseFields[2], Head2headStats.this.head2Head != null ? Head2headStats.this.head2Head.marshaller() : null);
                    responseWriter.writeObject(Head2headStats.$responseFields[3], Head2headStats.this.teamA != null ? Head2headStats.this.teamA.marshaller() : null);
                    ResponseField responseField = Head2headStats.$responseFields[4];
                    if (Head2headStats.this.teamB != null) {
                        responseFieldMarshaller = Head2headStats.this.teamB.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Head2headStats{__typename=" + this.__typename + ", venueStatsData=" + this.venueStatsData + ", head2Head=" + this.head2Head + ", teamA=" + this.teamA + ", teamB=" + this.teamB + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            VenueStatsData venueStatsData2;
            Head2Head head2Head2;
            TeamA teamA2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Head2headStats)) {
                return false;
            }
            Head2headStats head2headStats = (Head2headStats) obj;
            if (this.__typename.equals(head2headStats.__typename) && ((venueStatsData2 = this.venueStatsData) != null ? venueStatsData2.equals(head2headStats.venueStatsData) : head2headStats.venueStatsData == null) && ((head2Head2 = this.head2Head) != null ? head2Head2.equals(head2headStats.head2Head) : head2headStats.head2Head == null) && ((teamA2 = this.teamA) != null ? teamA2.equals(head2headStats.teamA) : head2headStats.teamA == null)) {
                TeamB teamB2 = this.teamB;
                TeamB teamB3 = head2headStats.teamB;
                if (teamB2 == null) {
                    if (teamB3 == null) {
                        return true;
                    }
                } else if (teamB2.equals(teamB3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                VenueStatsData venueStatsData2 = this.venueStatsData;
                int i = 0;
                int hashCode2 = (hashCode ^ (venueStatsData2 == null ? 0 : venueStatsData2.hashCode())) * 1000003;
                Head2Head head2Head2 = this.head2Head;
                int hashCode3 = (hashCode2 ^ (head2Head2 == null ? 0 : head2Head2.hashCode())) * 1000003;
                TeamA teamA2 = this.teamA;
                int hashCode4 = (hashCode3 ^ (teamA2 == null ? 0 : teamA2.hashCode())) * 1000003;
                TeamB teamB2 = this.teamB;
                if (teamB2 != null) {
                    i = teamB2.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Head2headStats> {
            final Head2Head.Mapper head2HeadFieldMapper = new Head2Head.Mapper();
            final TeamA.Mapper teamAFieldMapper = new TeamA.Mapper();
            final TeamB.Mapper teamBFieldMapper = new TeamB.Mapper();
            final VenueStatsData.Mapper venueStatsDataFieldMapper = new VenueStatsData.Mapper();

            @Override 
            public Head2headStats map(ResponseReader responseReader) {
                return new Head2headStats(responseReader.readString(Head2headStats.$responseFields[0]), (VenueStatsData) responseReader.readObject(Head2headStats.$responseFields[1], new ResponseReader.ObjectReader<VenueStatsData>() {


                    @Override 
                    public VenueStatsData read(ResponseReader responseReader) {
                        return Mapper.this.venueStatsDataFieldMapper.map(responseReader);
                    }
                }), (Head2Head) responseReader.readObject(Head2headStats.$responseFields[2], new ResponseReader.ObjectReader<Head2Head>() {


                    @Override 
                    public Head2Head read(ResponseReader responseReader) {
                        return Mapper.this.head2HeadFieldMapper.map(responseReader);
                    }
                }), (TeamA) responseReader.readObject(Head2headStats.$responseFields[3], new ResponseReader.ObjectReader<TeamA>() {


                    @Override 
                    public TeamA read(ResponseReader responseReader) {
                        return Mapper.this.teamAFieldMapper.map(responseReader);
                    }
                }), (TeamB) responseReader.readObject(Head2headStats.$responseFields[4], new ResponseReader.ObjectReader<TeamB>() {


                    @Override 
                    public TeamB read(ResponseReader responseReader) {
                        return Mapper.this.teamBFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class VenueStatsData {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forDouble("firstBattingWinPercent", "firstBattingWinPercent", null, true, Collections.emptyList()), ResponseField.forString("avgFirstInningScore", "avgFirstInningScore", null, true, Collections.emptyList()), ResponseField.forString("venueName", "venueName", null, true, Collections.emptyList()), ResponseField.forString("venueID", "venueID", null, true, Collections.emptyList()), ResponseField.forString("paceWicketPercent", "paceWicketPercent", null, true, Collections.emptyList()), ResponseField.forString("spinWicketPercent", "spinWicketPercent", null, true, Collections.emptyList()), ResponseField.forString("highestScoreChased", "highestScoreChased", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String avgFirstInningScore;
        final Double firstBattingWinPercent;
        final String highestScoreChased;
        final String paceWicketPercent;
        final String spinWicketPercent;
        final String venueID;
        final String venueName;

        public VenueStatsData(String str, Double d, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.firstBattingWinPercent = d;
            this.avgFirstInningScore = str2;
            this.venueName = str3;
            this.venueID = str4;
            this.paceWicketPercent = str5;
            this.spinWicketPercent = str6;
            this.highestScoreChased = str7;
        }

        public String __typename() {
            return this.__typename;
        }

        public Double firstBattingWinPercent() {
            return this.firstBattingWinPercent;
        }

        public String avgFirstInningScore() {
            return this.avgFirstInningScore;
        }

        public String venueName() {
            return this.venueName;
        }

        public String venueID() {
            return this.venueID;
        }

        public String paceWicketPercent() {
            return this.paceWicketPercent;
        }

        public String spinWicketPercent() {
            return this.spinWicketPercent;
        }

        public String highestScoreChased() {
            return this.highestScoreChased;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(VenueStatsData.$responseFields[0], VenueStatsData.this.__typename);
                    responseWriter.writeDouble(VenueStatsData.$responseFields[1], VenueStatsData.this.firstBattingWinPercent);
                    responseWriter.writeString(VenueStatsData.$responseFields[2], VenueStatsData.this.avgFirstInningScore);
                    responseWriter.writeString(VenueStatsData.$responseFields[3], VenueStatsData.this.venueName);
                    responseWriter.writeString(VenueStatsData.$responseFields[4], VenueStatsData.this.venueID);
                    responseWriter.writeString(VenueStatsData.$responseFields[5], VenueStatsData.this.paceWicketPercent);
                    responseWriter.writeString(VenueStatsData.$responseFields[6], VenueStatsData.this.spinWicketPercent);
                    responseWriter.writeString(VenueStatsData.$responseFields[7], VenueStatsData.this.highestScoreChased);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "VenueStatsData{__typename=" + this.__typename + ", firstBattingWinPercent=" + this.firstBattingWinPercent + ", avgFirstInningScore=" + this.avgFirstInningScore + ", venueName=" + this.venueName + ", venueID=" + this.venueID + ", paceWicketPercent=" + this.paceWicketPercent + ", spinWicketPercent=" + this.spinWicketPercent + ", highestScoreChased=" + this.highestScoreChased + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Double d;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VenueStatsData)) {
                return false;
            }
            VenueStatsData venueStatsData = (VenueStatsData) obj;
            if (this.__typename.equals(venueStatsData.__typename) && ((d = this.firstBattingWinPercent) != null ? d.equals(venueStatsData.firstBattingWinPercent) : venueStatsData.firstBattingWinPercent == null) && ((str = this.avgFirstInningScore) != null ? str.equals(venueStatsData.avgFirstInningScore) : venueStatsData.avgFirstInningScore == null) && ((str2 = this.venueName) != null ? str2.equals(venueStatsData.venueName) : venueStatsData.venueName == null) && ((str3 = this.venueID) != null ? str3.equals(venueStatsData.venueID) : venueStatsData.venueID == null) && ((str4 = this.paceWicketPercent) != null ? str4.equals(venueStatsData.paceWicketPercent) : venueStatsData.paceWicketPercent == null) && ((str5 = this.spinWicketPercent) != null ? str5.equals(venueStatsData.spinWicketPercent) : venueStatsData.spinWicketPercent == null)) {
                String str6 = this.highestScoreChased;
                String str7 = venueStatsData.highestScoreChased;
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
                Double d = this.firstBattingWinPercent;
                int i = 0;
                int hashCode2 = (hashCode ^ (d == null ? 0 : d.hashCode())) * 1000003;
                String str = this.avgFirstInningScore;
                int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.venueName;
                int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.venueID;
                int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.paceWicketPercent;
                int hashCode6 = (hashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.spinWicketPercent;
                int hashCode7 = (hashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.highestScoreChased;
                if (str6 != null) {
                    i = str6.hashCode();
                }
                this.$hashCode = hashCode7 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<VenueStatsData> {
            @Override 
            public VenueStatsData map(ResponseReader responseReader) {
                return new VenueStatsData(responseReader.readString(VenueStatsData.$responseFields[0]), responseReader.readDouble(VenueStatsData.$responseFields[1]), responseReader.readString(VenueStatsData.$responseFields[2]), responseReader.readString(VenueStatsData.$responseFields[3]), responseReader.readString(VenueStatsData.$responseFields[4]), responseReader.readString(VenueStatsData.$responseFields[5]), responseReader.readString(VenueStatsData.$responseFields[6]), responseReader.readString(VenueStatsData.$responseFields[7]));
            }
        }
    }

    public static class Head2Head {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("totalMatches", "totalMatches", null, true, Collections.emptyList()), ResponseField.forInt("noResult", "noResult", null, true, Collections.emptyList()), ResponseField.forInt("teamA", "teamA", null, true, Collections.emptyList()), ResponseField.forInt("teamB", "teamB", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Integer noResult;
        final Integer teamA;
        final Integer teamB;
        final Integer totalMatches;

        public Head2Head(String str, Integer num, Integer num2, Integer num3, Integer num4) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.totalMatches = num;
            this.noResult = num2;
            this.teamA = num3;
            this.teamB = num4;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer totalMatches() {
            return this.totalMatches;
        }

        public Integer noResult() {
            return this.noResult;
        }

        public Integer teamA() {
            return this.teamA;
        }

        public Integer teamB() {
            return this.teamB;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Head2Head.$responseFields[0], Head2Head.this.__typename);
                    responseWriter.writeInt(Head2Head.$responseFields[1], Head2Head.this.totalMatches);
                    responseWriter.writeInt(Head2Head.$responseFields[2], Head2Head.this.noResult);
                    responseWriter.writeInt(Head2Head.$responseFields[3], Head2Head.this.teamA);
                    responseWriter.writeInt(Head2Head.$responseFields[4], Head2Head.this.teamB);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Head2Head{__typename=" + this.__typename + ", totalMatches=" + this.totalMatches + ", noResult=" + this.noResult + ", teamA=" + this.teamA + ", teamB=" + this.teamB + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Head2Head)) {
                return false;
            }
            Head2Head head2Head = (Head2Head) obj;
            if (this.__typename.equals(head2Head.__typename) && ((num = this.totalMatches) != null ? num.equals(head2Head.totalMatches) : head2Head.totalMatches == null) && ((num2 = this.noResult) != null ? num2.equals(head2Head.noResult) : head2Head.noResult == null) && ((num3 = this.teamA) != null ? num3.equals(head2Head.teamA) : head2Head.teamA == null)) {
                Integer num4 = this.teamB;
                Integer num5 = head2Head.teamB;
                if (num4 == null) {
                    if (num5 == null) {
                        return true;
                    }
                } else if (num4.equals(num5)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Integer num = this.totalMatches;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.noResult;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.teamA;
                int hashCode4 = (hashCode3 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.teamB;
                if (num4 != null) {
                    i = num4.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Head2Head> {
            @Override 
            public Head2Head map(ResponseReader responseReader) {
                return new Head2Head(responseReader.readString(Head2Head.$responseFields[0]), responseReader.readInt(Head2Head.$responseFields[1]), responseReader.readInt(Head2Head.$responseFields[2]), responseReader.readInt(Head2Head.$responseFields[3]), responseReader.readInt(Head2Head.$responseFields[4]));
            }
        }
    }

    public static class TeamA {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("key", "key", null, true, Collections.emptyList()), ResponseField.forList("lastFStatus", "lastFStatus", null, true, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, true, Collections.emptyList()), ResponseField.forString("teamShortName", "teamShortName", null, true, Collections.emptyList()), ResponseField.forString("color","color", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String color;
        final String key;
        final List<String> lastFStatus;
        final String teamName;
        final String teamShortName;

        public TeamA(String str, String str2, List<String> list, String str3, String str4, String str5) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.key = str2;
            this.lastFStatus = list;
            this.teamName = str3;
            this.teamShortName = str4;
            this.color = str5;
        }

        public String __typename() {
            return this.__typename;
        }

        public String key() {
            return this.key;
        }

        public List<String> lastFStatus() {
            return this.lastFStatus;
        }

        public String teamName() {
            return this.teamName;
        }

        public String teamShortName() {
            return this.teamShortName;
        }

        public String color() {
            return this.color;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TeamA.$responseFields[0], TeamA.this.__typename);
                    responseWriter.writeString(TeamA.$responseFields[1], TeamA.this.key);
                    responseWriter.writeList(TeamA.$responseFields[2], TeamA.this.lastFStatus, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    });
                    responseWriter.writeString(TeamA.$responseFields[3], TeamA.this.teamName);
                    responseWriter.writeString(TeamA.$responseFields[4], TeamA.this.teamShortName);
                    responseWriter.writeString(TeamA.$responseFields[5], TeamA.this.color);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TeamA{__typename=" + this.__typename + ", key=" + this.key + ", lastFStatus=" + this.lastFStatus + ", teamName=" + this.teamName + ", teamShortName=" + this.teamShortName + ", color=" + this.color + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            List<String> list;
            String str2;
            String str3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TeamA)) {
                return false;
            }
            TeamA teamA = (TeamA) obj;
            if (this.__typename.equals(teamA.__typename) && ((str = this.key) != null ? str.equals(teamA.key) : teamA.key == null) && ((list = this.lastFStatus) != null ? list.equals(teamA.lastFStatus) : teamA.lastFStatus == null) && ((str2 = this.teamName) != null ? str2.equals(teamA.teamName) : teamA.teamName == null) && ((str3 = this.teamShortName) != null ? str3.equals(teamA.teamShortName) : teamA.teamShortName == null)) {
                String str4 = this.color;
                String str5 = teamA.color;
                if (str4 == null) {
                    if (str5 == null) {
                        return true;
                    }
                } else if (str4.equals(str5)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.key;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                List<String> list = this.lastFStatus;
                int hashCode3 = (hashCode2 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str2 = this.teamName;
                int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.teamShortName;
                int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.color;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TeamA> {
            @Override 
            public TeamA map(ResponseReader responseReader) {
                return new TeamA(responseReader.readString(TeamA.$responseFields[0]), responseReader.readString(TeamA.$responseFields[1]), responseReader.readList(TeamA.$responseFields[2], new ResponseReader.ListReader<String>() {


                    @Override 
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(TeamA.$responseFields[3]), responseReader.readString(TeamA.$responseFields[4]), responseReader.readString(TeamA.$responseFields[5]));
            }
        }
    }

    public static class TeamB {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("key", "key", null, true, Collections.emptyList()), ResponseField.forList("lastFStatus", "lastFStatus", null, true, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, true, Collections.emptyList()), ResponseField.forString("teamShortName", "teamShortName", null, true, Collections.emptyList()), ResponseField.forString("color", "color", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String color;
        final String key;
        final List<String> lastFStatus;
        final String teamName;
        final String teamShortName;

        public TeamB(String str, String str2, List<String> list, String str3, String str4, String str5) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.key = str2;
            this.lastFStatus = list;
            this.teamName = str3;
            this.teamShortName = str4;
            this.color = str5;
        }

        public String __typename() {
            return this.__typename;
        }

        public String key() {
            return this.key;
        }

        public List<String> lastFStatus() {
            return this.lastFStatus;
        }

        public String teamName() {
            return this.teamName;
        }

        public String teamShortName() {
            return this.teamShortName;
        }

        public String color() {
            return this.color;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TeamB.$responseFields[0], TeamB.this.__typename);
                    responseWriter.writeString(TeamB.$responseFields[1], TeamB.this.key);
                    responseWriter.writeList(TeamB.$responseFields[2], TeamB.this.lastFStatus, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeString((String) it.next());
                            }
                        }
                    });
                    responseWriter.writeString(TeamB.$responseFields[3], TeamB.this.teamName);
                    responseWriter.writeString(TeamB.$responseFields[4], TeamB.this.teamShortName);
                    responseWriter.writeString(TeamB.$responseFields[5], TeamB.this.color);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TeamB{__typename=" + this.__typename + ", key=" + this.key + ", lastFStatus=" + this.lastFStatus + ", teamName=" + this.teamName + ", teamShortName=" + this.teamShortName + ", color=" + this.color + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            List<String> list;
            String str2;
            String str3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TeamB)) {
                return false;
            }
            TeamB teamB = (TeamB) obj;
            if (this.__typename.equals(teamB.__typename) && ((str = this.key) != null ? str.equals(teamB.key) : teamB.key == null) && ((list = this.lastFStatus) != null ? list.equals(teamB.lastFStatus) : teamB.lastFStatus == null) && ((str2 = this.teamName) != null ? str2.equals(teamB.teamName) : teamB.teamName == null) && ((str3 = this.teamShortName) != null ? str3.equals(teamB.teamShortName) : teamB.teamShortName == null)) {
                String str4 = this.color;
                String str5 = teamB.color;
                if (str4 == null) {
                    if (str5 == null) {
                        return true;
                    }
                } else if (str4.equals(str5)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.key;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                List<String> list = this.lastFStatus;
                int hashCode3 = (hashCode2 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str2 = this.teamName;
                int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.teamShortName;
                int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.color;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TeamB> {
            @Override 
            public TeamB map(ResponseReader responseReader) {
                return new TeamB(responseReader.readString(TeamB.$responseFields[0]), responseReader.readString(TeamB.$responseFields[1]), responseReader.readList(TeamB.$responseFields[2], new ResponseReader.ListReader<String>() {


                    @Override 
                    public String read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readString();
                    }
                }), responseReader.readString(TeamB.$responseFields[3]), responseReader.readString(TeamB.$responseFields[4]), responseReader.readString(TeamB.$responseFields[5]));
            }
        }
    }

    public static class TopRunScorer1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("fullName", "fullName", null, true, Collections.emptyList()), ResponseField.forString("shortName", "shortName", null, true, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forInt("playerRuns", "playerRuns", null, true, Collections.emptyList()), ResponseField.forInt("playerWicket", "playerWicket", null, true, Collections.emptyList()), ResponseField.forDouble("average", "average", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double average;
        final String fullName;
        final String playerID;
        final String playerName;
        final Integer playerRuns;
        final Integer playerWicket;
        final String shortName;
        final String teamID;

        public TopRunScorer1(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Double d) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.teamID = str2;
            this.fullName = str3;
            this.shortName = str4;
            this.playerID = str5;
            this.playerName = str6;
            this.playerRuns = num;
            this.playerWicket = num2;
            this.average = d;
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

        public String shortName() {
            return this.shortName;
        }

        public String playerID() {
            return this.playerID;
        }

        public String playerName() {
            return this.playerName;
        }

        public Integer playerRuns() {
            return this.playerRuns;
        }

        public Integer playerWicket() {
            return this.playerWicket;
        }

        public Double average() {
            return this.average;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TopRunScorer1.$responseFields[0], TopRunScorer1.this.__typename);
                    responseWriter.writeString(TopRunScorer1.$responseFields[1], TopRunScorer1.this.teamID);
                    responseWriter.writeString(TopRunScorer1.$responseFields[2], TopRunScorer1.this.fullName);
                    responseWriter.writeString(TopRunScorer1.$responseFields[3], TopRunScorer1.this.shortName);
                    responseWriter.writeString(TopRunScorer1.$responseFields[4], TopRunScorer1.this.playerID);
                    responseWriter.writeString(TopRunScorer1.$responseFields[5], TopRunScorer1.this.playerName);
                    responseWriter.writeInt(TopRunScorer1.$responseFields[6], TopRunScorer1.this.playerRuns);
                    responseWriter.writeInt(TopRunScorer1.$responseFields[7], TopRunScorer1.this.playerWicket);
                    responseWriter.writeDouble(TopRunScorer1.$responseFields[8], TopRunScorer1.this.average);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TopRunScorer1{__typename=" + this.__typename + ", teamID=" + this.teamID + ", fullName=" + this.fullName + ", shortName=" + this.shortName + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerRuns=" + this.playerRuns + ", playerWicket=" + this.playerWicket + ", average=" + this.average + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Integer num;
            Integer num2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TopRunScorer1)) {
                return false;
            }
            TopRunScorer1 topRunScorer1 = (TopRunScorer1) obj;
            if (this.__typename.equals(topRunScorer1.__typename) && ((str = this.teamID) != null ? str.equals(topRunScorer1.teamID) : topRunScorer1.teamID == null) && ((str2 = this.fullName) != null ? str2.equals(topRunScorer1.fullName) : topRunScorer1.fullName == null) && ((str3 = this.shortName) != null ? str3.equals(topRunScorer1.shortName) : topRunScorer1.shortName == null) && ((str4 = this.playerID) != null ? str4.equals(topRunScorer1.playerID) : topRunScorer1.playerID == null) && ((str5 = this.playerName) != null ? str5.equals(topRunScorer1.playerName) : topRunScorer1.playerName == null) && ((num = this.playerRuns) != null ? num.equals(topRunScorer1.playerRuns) : topRunScorer1.playerRuns == null) && ((num2 = this.playerWicket) != null ? num2.equals(topRunScorer1.playerWicket) : topRunScorer1.playerWicket == null)) {
                Double d = this.average;
                Double d2 = topRunScorer1.average;
                if (d == null) {
                    if (d2 == null) {
                        return true;
                    }
                } else if (d.equals(d2)) {
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
                String str3 = this.shortName;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerID;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerName;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Integer num = this.playerRuns;
                int hashCode7 = (hashCode6 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.playerWicket;
                int hashCode8 = (hashCode7 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Double d = this.average;
                if (d != null) {
                    i = d.hashCode();
                }
                this.$hashCode = hashCode8 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TopRunScorer1> {
            @Override 
            public TopRunScorer1 map(ResponseReader responseReader) {
                return new TopRunScorer1(responseReader.readString(TopRunScorer1.$responseFields[0]), responseReader.readString(TopRunScorer1.$responseFields[1]), responseReader.readString(TopRunScorer1.$responseFields[2]), responseReader.readString(TopRunScorer1.$responseFields[3]), responseReader.readString(TopRunScorer1.$responseFields[4]), responseReader.readString(TopRunScorer1.$responseFields[5]), responseReader.readInt(TopRunScorer1.$responseFields[6]), responseReader.readInt(TopRunScorer1.$responseFields[7]), responseReader.readDouble(TopRunScorer1.$responseFields[8]));
            }
        }
    }

    public static class TopRunScorer2 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("fullName", "fullName", null, true, Collections.emptyList()), ResponseField.forString("shortName", "shortName", null, true, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forInt("playerRuns", "playerRuns", null, true, Collections.emptyList()), ResponseField.forInt("playerWicket", "playerWicket", null, true, Collections.emptyList()), ResponseField.forDouble("average", "average", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double average;
        final String fullName;
        final String playerID;
        final String playerName;
        final Integer playerRuns;
        final Integer playerWicket;
        final String shortName;
        final String teamID;

        public TopRunScorer2(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Double d) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.teamID = str2;
            this.fullName = str3;
            this.shortName = str4;
            this.playerID = str5;
            this.playerName = str6;
            this.playerRuns = num;
            this.playerWicket = num2;
            this.average = d;
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

        public String shortName() {
            return this.shortName;
        }

        public String playerID() {
            return this.playerID;
        }

        public String playerName() {
            return this.playerName;
        }

        public Integer playerRuns() {
            return this.playerRuns;
        }

        public Integer playerWicket() {
            return this.playerWicket;
        }

        public Double average() {
            return this.average;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TopRunScorer2.$responseFields[0], TopRunScorer2.this.__typename);
                    responseWriter.writeString(TopRunScorer2.$responseFields[1], TopRunScorer2.this.teamID);
                    responseWriter.writeString(TopRunScorer2.$responseFields[2], TopRunScorer2.this.fullName);
                    responseWriter.writeString(TopRunScorer2.$responseFields[3], TopRunScorer2.this.shortName);
                    responseWriter.writeString(TopRunScorer2.$responseFields[4], TopRunScorer2.this.playerID);
                    responseWriter.writeString(TopRunScorer2.$responseFields[5], TopRunScorer2.this.playerName);
                    responseWriter.writeInt(TopRunScorer2.$responseFields[6], TopRunScorer2.this.playerRuns);
                    responseWriter.writeInt(TopRunScorer2.$responseFields[7], TopRunScorer2.this.playerWicket);
                    responseWriter.writeDouble(TopRunScorer2.$responseFields[8], TopRunScorer2.this.average);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TopRunScorer2{__typename=" + this.__typename + ", teamID=" + this.teamID + ", fullName=" + this.fullName + ", shortName=" + this.shortName + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", playerRuns=" + this.playerRuns + ", playerWicket=" + this.playerWicket + ", average=" + this.average + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Integer num;
            Integer num2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TopRunScorer2)) {
                return false;
            }
            TopRunScorer2 topRunScorer2 = (TopRunScorer2) obj;
            if (this.__typename.equals(topRunScorer2.__typename) && ((str = this.teamID) != null ? str.equals(topRunScorer2.teamID) : topRunScorer2.teamID == null) && ((str2 = this.fullName) != null ? str2.equals(topRunScorer2.fullName) : topRunScorer2.fullName == null) && ((str3 = this.shortName) != null ? str3.equals(topRunScorer2.shortName) : topRunScorer2.shortName == null) && ((str4 = this.playerID) != null ? str4.equals(topRunScorer2.playerID) : topRunScorer2.playerID == null) && ((str5 = this.playerName) != null ? str5.equals(topRunScorer2.playerName) : topRunScorer2.playerName == null) && ((num = this.playerRuns) != null ? num.equals(topRunScorer2.playerRuns) : topRunScorer2.playerRuns == null) && ((num2 = this.playerWicket) != null ? num2.equals(topRunScorer2.playerWicket) : topRunScorer2.playerWicket == null)) {
                Double d = this.average;
                Double d2 = topRunScorer2.average;
                if (d == null) {
                    if (d2 == null) {
                        return true;
                    }
                } else if (d.equals(d2)) {
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
                String str3 = this.shortName;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerID;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerName;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Integer num = this.playerRuns;
                int hashCode7 = (hashCode6 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.playerWicket;
                int hashCode8 = (hashCode7 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Double d = this.average;
                if (d != null) {
                    i = d.hashCode();
                }
                this.$hashCode = hashCode8 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TopRunScorer2> {
            @Override 
            public TopRunScorer2 map(ResponseReader responseReader) {
                return new TopRunScorer2(responseReader.readString(TopRunScorer2.$responseFields[0]), responseReader.readString(TopRunScorer2.$responseFields[1]), responseReader.readString(TopRunScorer2.$responseFields[2]), responseReader.readString(TopRunScorer2.$responseFields[3]), responseReader.readString(TopRunScorer2.$responseFields[4]), responseReader.readString(TopRunScorer2.$responseFields[5]), responseReader.readInt(TopRunScorer2.$responseFields[6]), responseReader.readInt(TopRunScorer2.$responseFields[7]), responseReader.readDouble(TopRunScorer2.$responseFields[8]));
            }
        }
    }

    public static class TopWicketTaker1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("fullName", "fullName", null, true, Collections.emptyList()), ResponseField.forString("shortName", "shortName", null, true, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forInt("totalWickets", "totalWickets", null, true, Collections.emptyList()), ResponseField.forDouble("average", "average", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double average;
        final String fullName;
        final String playerID;
        final String playerName;
        final String shortName;
        final String teamID;
        final Integer totalWickets;

        public TopWicketTaker1(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Double d) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.teamID = str2;
            this.fullName = str3;
            this.shortName = str4;
            this.playerID = str5;
            this.playerName = str6;
            this.totalWickets = num;
            this.average = d;
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

        public String shortName() {
            return this.shortName;
        }

        public String playerID() {
            return this.playerID;
        }

        public String playerName() {
            return this.playerName;
        }

        public Integer totalWickets() {
            return this.totalWickets;
        }

        public Double average() {
            return this.average;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TopWicketTaker1.$responseFields[0], TopWicketTaker1.this.__typename);
                    responseWriter.writeString(TopWicketTaker1.$responseFields[1], TopWicketTaker1.this.teamID);
                    responseWriter.writeString(TopWicketTaker1.$responseFields[2], TopWicketTaker1.this.fullName);
                    responseWriter.writeString(TopWicketTaker1.$responseFields[3], TopWicketTaker1.this.shortName);
                    responseWriter.writeString(TopWicketTaker1.$responseFields[4], TopWicketTaker1.this.playerID);
                    responseWriter.writeString(TopWicketTaker1.$responseFields[5], TopWicketTaker1.this.playerName);
                    responseWriter.writeInt(TopWicketTaker1.$responseFields[6], TopWicketTaker1.this.totalWickets);
                    responseWriter.writeDouble(TopWicketTaker1.$responseFields[7], TopWicketTaker1.this.average);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TopWicketTaker1{__typename=" + this.__typename + ", teamID=" + this.teamID + ", fullName=" + this.fullName + ", shortName=" + this.shortName + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", totalWickets=" + this.totalWickets + ", average=" + this.average + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Integer num;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TopWicketTaker1)) {
                return false;
            }
            TopWicketTaker1 topWicketTaker1 = (TopWicketTaker1) obj;
            if (this.__typename.equals(topWicketTaker1.__typename) && ((str = this.teamID) != null ? str.equals(topWicketTaker1.teamID) : topWicketTaker1.teamID == null) && ((str2 = this.fullName) != null ? str2.equals(topWicketTaker1.fullName) : topWicketTaker1.fullName == null) && ((str3 = this.shortName) != null ? str3.equals(topWicketTaker1.shortName) : topWicketTaker1.shortName == null) && ((str4 = this.playerID) != null ? str4.equals(topWicketTaker1.playerID) : topWicketTaker1.playerID == null) && ((str5 = this.playerName) != null ? str5.equals(topWicketTaker1.playerName) : topWicketTaker1.playerName == null) && ((num = this.totalWickets) != null ? num.equals(topWicketTaker1.totalWickets) : topWicketTaker1.totalWickets == null)) {
                Double d = this.average;
                Double d2 = topWicketTaker1.average;
                if (d == null) {
                    if (d2 == null) {
                        return true;
                    }
                } else if (d.equals(d2)) {
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
                String str3 = this.shortName;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerID;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerName;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Integer num = this.totalWickets;
                int hashCode7 = (hashCode6 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Double d = this.average;
                if (d != null) {
                    i = d.hashCode();
                }
                this.$hashCode = hashCode7 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TopWicketTaker1> {
            @Override 
            public TopWicketTaker1 map(ResponseReader responseReader) {
                return new TopWicketTaker1(responseReader.readString(TopWicketTaker1.$responseFields[0]), responseReader.readString(TopWicketTaker1.$responseFields[1]), responseReader.readString(TopWicketTaker1.$responseFields[2]), responseReader.readString(TopWicketTaker1.$responseFields[3]), responseReader.readString(TopWicketTaker1.$responseFields[4]), responseReader.readString(TopWicketTaker1.$responseFields[5]), responseReader.readInt(TopWicketTaker1.$responseFields[6]), responseReader.readDouble(TopWicketTaker1.$responseFields[7]));
            }
        }
    }

    public static class TopWicketTaker2 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("fullName", "fullName", null, true, Collections.emptyList()), ResponseField.forString("shortName", "shortName", null, true, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forInt("totalWickets", "totalWickets", null, true, Collections.emptyList()), ResponseField.forDouble("average", "average", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Double average;
        final String fullName;
        final String playerID;
        final String playerName;
        final String shortName;
        final String teamID;
        final Integer totalWickets;

        public TopWicketTaker2(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Double d) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.teamID = str2;
            this.fullName = str3;
            this.shortName = str4;
            this.playerID = str5;
            this.playerName = str6;
            this.totalWickets = num;
            this.average = d;
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

        public String shortName() {
            return this.shortName;
        }

        public String playerID() {
            return this.playerID;
        }

        public String playerName() {
            return this.playerName;
        }

        public Integer totalWickets() {
            return this.totalWickets;
        }

        public Double average() {
            return this.average;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TopWicketTaker2.$responseFields[0], TopWicketTaker2.this.__typename);
                    responseWriter.writeString(TopWicketTaker2.$responseFields[1], TopWicketTaker2.this.teamID);
                    responseWriter.writeString(TopWicketTaker2.$responseFields[2], TopWicketTaker2.this.fullName);
                    responseWriter.writeString(TopWicketTaker2.$responseFields[3], TopWicketTaker2.this.shortName);
                    responseWriter.writeString(TopWicketTaker2.$responseFields[4], TopWicketTaker2.this.playerID);
                    responseWriter.writeString(TopWicketTaker2.$responseFields[5], TopWicketTaker2.this.playerName);
                    responseWriter.writeInt(TopWicketTaker2.$responseFields[6], TopWicketTaker2.this.totalWickets);
                    responseWriter.writeDouble(TopWicketTaker2.$responseFields[7], TopWicketTaker2.this.average);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TopWicketTaker2{__typename=" + this.__typename + ", teamID=" + this.teamID + ", fullName=" + this.fullName + ", shortName=" + this.shortName + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", totalWickets=" + this.totalWickets + ", average=" + this.average + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Integer num;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TopWicketTaker2)) {
                return false;
            }
            TopWicketTaker2 topWicketTaker2 = (TopWicketTaker2) obj;
            if (this.__typename.equals(topWicketTaker2.__typename) && ((str = this.teamID) != null ? str.equals(topWicketTaker2.teamID) : topWicketTaker2.teamID == null) && ((str2 = this.fullName) != null ? str2.equals(topWicketTaker2.fullName) : topWicketTaker2.fullName == null) && ((str3 = this.shortName) != null ? str3.equals(topWicketTaker2.shortName) : topWicketTaker2.shortName == null) && ((str4 = this.playerID) != null ? str4.equals(topWicketTaker2.playerID) : topWicketTaker2.playerID == null) && ((str5 = this.playerName) != null ? str5.equals(topWicketTaker2.playerName) : topWicketTaker2.playerName == null) && ((num = this.totalWickets) != null ? num.equals(topWicketTaker2.totalWickets) : topWicketTaker2.totalWickets == null)) {
                Double d = this.average;
                Double d2 = topWicketTaker2.average;
                if (d == null) {
                    if (d2 == null) {
                        return true;
                    }
                } else if (d.equals(d2)) {
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
                String str3 = this.shortName;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.playerID;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.playerName;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Integer num = this.totalWickets;
                int hashCode7 = (hashCode6 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Double d = this.average;
                if (d != null) {
                    i = d.hashCode();
                }
                this.$hashCode = hashCode7 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TopWicketTaker2> {
            @Override 
            public TopWicketTaker2 map(ResponseReader responseReader) {
                return new TopWicketTaker2(responseReader.readString(TopWicketTaker2.$responseFields[0]), responseReader.readString(TopWicketTaker2.$responseFields[1]), responseReader.readString(TopWicketTaker2.$responseFields[2]), responseReader.readString(TopWicketTaker2.$responseFields[3]), responseReader.readString(TopWicketTaker2.$responseFields[4]), responseReader.readString(TopWicketTaker2.$responseFields[5]), responseReader.readInt(TopWicketTaker2.$responseFields[6]), responseReader.readDouble(TopWicketTaker2.$responseFields[7]));
            }
        }
    }
}
