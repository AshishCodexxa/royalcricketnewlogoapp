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
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

public final class SeriesHomeCardQuery implements Query<SeriesHomeCardQuery.Data, SeriesHomeCardQuery.Data, Operation.Variables> {
    public static final String OPERATION_ID = "b1e578be8dc78b46a010f5e8343e5f7ea2aee2752d1a58019e1543908e2c868e";
    public static final OperationName OPERATION_NAME = new OperationName() {

        @Override
        public String name() {
            return "SeriesHomeCard";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query SeriesHomeCard {\n  SeriesHomeCard {\n    __typename\n    matchesData {\n      __typename\n      awayTeamID\n      awayTeamShortName\n      homeTeamID\n      homeTeamShortName\n      matchDateTimeIST\n      matchStatus\n      venue\n      seriesName\n      seriesID\n      matchID\n      tourID\n      matchName\n    }\n    topPerformances {\n      __typename\n      playerID\n      playerName\n      teamName\n      score\n      ScoreType\n      matchType\n      tourID\n      tourName\n    }\n  }\n}");
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

        public SeriesHomeCardQuery build() {
            return new SeriesHomeCardQuery();
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("SeriesHomeCard", "SeriesHomeCard", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final SeriesHomeCard SeriesHomeCard;

        public Data(SeriesHomeCard seriesHomeCard) {
            this.SeriesHomeCard = seriesHomeCard;
        }

        public SeriesHomeCard SeriesHomeCard() {
            return this.SeriesHomeCard;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.SeriesHomeCard != null ? Data.this.SeriesHomeCard.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{SeriesHomeCard=" + this.SeriesHomeCard + "}";
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
            SeriesHomeCard seriesHomeCard = this.SeriesHomeCard;
            SeriesHomeCard seriesHomeCard2 = ((Data) obj).SeriesHomeCard;
            if (seriesHomeCard != null) {
                return seriesHomeCard.equals(seriesHomeCard2);
            }
            if (seriesHomeCard2 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                SeriesHomeCard seriesHomeCard = this.SeriesHomeCard;
                this.$hashCode = 1000003 ^ (seriesHomeCard == null ? 0 : seriesHomeCard.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final SeriesHomeCard.Mapper seriesHomeCardFieldMapper = new SeriesHomeCard.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((SeriesHomeCard) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<SeriesHomeCard>() {

                    @Override 
                    public SeriesHomeCard read(ResponseReader responseReader) {
                        return Mapper.this.seriesHomeCardFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class SeriesHomeCard {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("matchesData", "matchesData", null, true, Collections.emptyList()), ResponseField.forList("topPerformances", "topPerformances", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<MatchesDatum> matchesData;
        final List<TopPerformance> topPerformances;

        public SeriesHomeCard(String str, List<MatchesDatum> list, List<TopPerformance> list2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchesData = list;
            this.topPerformances = list2;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<MatchesDatum> matchesData() {
            return this.matchesData;
        }

        public List<TopPerformance> topPerformances() {
            return this.topPerformances;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(SeriesHomeCard.$responseFields[0], SeriesHomeCard.this.__typename);
                    responseWriter.writeList(SeriesHomeCard.$responseFields[1], SeriesHomeCard.this.matchesData, new ResponseWriter.ListWriter() {

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((MatchesDatum) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(SeriesHomeCard.$responseFields[2], SeriesHomeCard.this.topPerformances, new ResponseWriter.ListWriter() {

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((TopPerformance) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "SeriesHomeCard{__typename=" + this.__typename + ", matchesData=" + this.matchesData + ", topPerformances=" + this.topPerformances + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<MatchesDatum> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SeriesHomeCard)) {
                return false;
            }
            SeriesHomeCard seriesHomeCard = (SeriesHomeCard) obj;
            if (this.__typename.equals(seriesHomeCard.__typename) && ((list = this.matchesData) != null ? list.equals(seriesHomeCard.matchesData) : seriesHomeCard.matchesData == null)) {
                List<TopPerformance> list2 = this.topPerformances;
                List<TopPerformance> list3 = seriesHomeCard.topPerformances;
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
                List<MatchesDatum> list = this.matchesData;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<TopPerformance> list2 = this.topPerformances;
                if (list2 != null) {
                    i = list2.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<SeriesHomeCard> {
            final MatchesDatum.Mapper matchesDatumFieldMapper = new MatchesDatum.Mapper();
            final TopPerformance.Mapper topPerformanceFieldMapper = new TopPerformance.Mapper();

            @Override 
            public SeriesHomeCard map(ResponseReader responseReader) {
                return new SeriesHomeCard(responseReader.readString(SeriesHomeCard.$responseFields[0]), responseReader.readList(SeriesHomeCard.$responseFields[1], new ResponseReader.ListReader<MatchesDatum>() {

                    @Override 
                    public MatchesDatum read(ResponseReader.ListItemReader listItemReader) {
                        return (MatchesDatum) listItemReader.readObject(new ResponseReader.ObjectReader<MatchesDatum>() {

                            @Override 
                            public MatchesDatum read(ResponseReader responseReader) {
                                return Mapper.this.matchesDatumFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(SeriesHomeCard.$responseFields[2], new ResponseReader.ListReader<TopPerformance>() {

                    @Override 
                    public TopPerformance read(ResponseReader.ListItemReader listItemReader) {
                        return (TopPerformance) listItemReader.readObject(new ResponseReader.ObjectReader<TopPerformance>() {

                            @Override 
                            public TopPerformance read(ResponseReader responseReader) {
                                return Mapper.this.topPerformanceFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class MatchesDatum {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("awayTeamID", "awayTeamID", null, true, Collections.emptyList()), ResponseField.forString("awayTeamShortName", "awayTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("homeTeamID", "homeTeamID", null, true, Collections.emptyList()), ResponseField.forString("homeTeamShortName", "homeTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("matchDateTimeIST", "matchDateTimeIST", null, true, Collections.emptyList()), ResponseField.forString("matchStatus", "matchStatus", null, true, Collections.emptyList()), ResponseField.forString("venue", "venue", null, true, Collections.emptyList()), ResponseField.forString("seriesName", "seriesName", null, true, Collections.emptyList()), ResponseField.forString("seriesID", "seriesID", null, true, Collections.emptyList()), ResponseField.forString("matchID", "matchID", null, true, Collections.emptyList()), ResponseField.forString("tourID", "tourID", null, true, Collections.emptyList()), ResponseField.forString("matchName", "matchName", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String awayTeamID;
        final String awayTeamShortName;
        final String homeTeamID;
        final String homeTeamShortName;
        final String matchDateTimeIST;
        final String matchID;
        final String matchName;
        final String matchStatus;
        final String seriesID;
        final String seriesName;
        final String tourID;
        final String venue;

        public MatchesDatum(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.awayTeamID = str2;
            this.awayTeamShortName = str3;
            this.homeTeamID = str4;
            this.homeTeamShortName = str5;
            this.matchDateTimeIST = str6;
            this.matchStatus = str7;
            this.venue = str8;
            this.seriesName = str9;
            this.seriesID = str10;
            this.matchID = str11;
            this.tourID = str12;
            this.matchName = str13;
        }

        public String __typename() {
            return this.__typename;
        }

        public String awayTeamID() {
            return this.awayTeamID;
        }

        public String awayTeamShortName() {
            return this.awayTeamShortName;
        }

        public String homeTeamID() {
            return this.homeTeamID;
        }

        public String homeTeamShortName() {
            return this.homeTeamShortName;
        }

        public String matchDateTimeIST() {
            return this.matchDateTimeIST;
        }

        public String matchStatus() {
            return this.matchStatus;
        }

        public String venue() {
            return this.venue;
        }

        public String seriesName() {
            return this.seriesName;
        }

        public String seriesID() {
            return this.seriesID;
        }

        public String matchID() {
            return this.matchID;
        }

        public String tourID() {
            return this.tourID;
        }

        public String matchName() {
            return this.matchName;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(MatchesDatum.$responseFields[0], MatchesDatum.this.__typename);
                    responseWriter.writeString(MatchesDatum.$responseFields[1], MatchesDatum.this.awayTeamID);
                    responseWriter.writeString(MatchesDatum.$responseFields[2], MatchesDatum.this.awayTeamShortName);
                    responseWriter.writeString(MatchesDatum.$responseFields[3], MatchesDatum.this.homeTeamID);
                    responseWriter.writeString(MatchesDatum.$responseFields[4], MatchesDatum.this.homeTeamShortName);
                    responseWriter.writeString(MatchesDatum.$responseFields[5], MatchesDatum.this.matchDateTimeIST);
                    responseWriter.writeString(MatchesDatum.$responseFields[6], MatchesDatum.this.matchStatus);
                    responseWriter.writeString(MatchesDatum.$responseFields[7], MatchesDatum.this.venue);
                    responseWriter.writeString(MatchesDatum.$responseFields[8], MatchesDatum.this.seriesName);
                    responseWriter.writeString(MatchesDatum.$responseFields[9], MatchesDatum.this.seriesID);
                    responseWriter.writeString(MatchesDatum.$responseFields[10], MatchesDatum.this.matchID);
                    responseWriter.writeString(MatchesDatum.$responseFields[11], MatchesDatum.this.tourID);
                    responseWriter.writeString(MatchesDatum.$responseFields[12], MatchesDatum.this.matchName);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "MatchesDatum{__typename=" + this.__typename + ", awayTeamID=" + this.awayTeamID + ", awayTeamShortName=" + this.awayTeamShortName + ", homeTeamID=" + this.homeTeamID + ", homeTeamShortName=" + this.homeTeamShortName + ", matchDateTimeIST=" + this.matchDateTimeIST + ", matchStatus=" + this.matchStatus + ", venue=" + this.venue + ", seriesName=" + this.seriesName + ", seriesID=" + this.seriesID + ", matchID=" + this.matchID + ", tourID=" + this.tourID + ", matchName=" + this.matchName + "}";
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
            String str10;
            String str11;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MatchesDatum)) {
                return false;
            }
            MatchesDatum matchesDatum = (MatchesDatum) obj;
            if (this.__typename.equals(matchesDatum.__typename) && ((str = this.awayTeamID) != null ? str.equals(matchesDatum.awayTeamID) : matchesDatum.awayTeamID == null) && ((str2 = this.awayTeamShortName) != null ? str2.equals(matchesDatum.awayTeamShortName) : matchesDatum.awayTeamShortName == null) && ((str3 = this.homeTeamID) != null ? str3.equals(matchesDatum.homeTeamID) : matchesDatum.homeTeamID == null) && ((str4 = this.homeTeamShortName) != null ? str4.equals(matchesDatum.homeTeamShortName) : matchesDatum.homeTeamShortName == null) && ((str5 = this.matchDateTimeIST) != null ? str5.equals(matchesDatum.matchDateTimeIST) : matchesDatum.matchDateTimeIST == null) && ((str6 = this.matchStatus) != null ? str6.equals(matchesDatum.matchStatus) : matchesDatum.matchStatus == null) && ((str7 = this.venue) != null ? str7.equals(matchesDatum.venue) : matchesDatum.venue == null) && ((str8 = this.seriesName) != null ? str8.equals(matchesDatum.seriesName) : matchesDatum.seriesName == null) && ((str9 = this.seriesID) != null ? str9.equals(matchesDatum.seriesID) : matchesDatum.seriesID == null) && ((str10 = this.matchID) != null ? str10.equals(matchesDatum.matchID) : matchesDatum.matchID == null) && ((str11 = this.tourID) != null ? str11.equals(matchesDatum.tourID) : matchesDatum.tourID == null)) {
                String str12 = this.matchName;
                String str13 = matchesDatum.matchName;
                if (str12 == null) {
                    if (str13 == null) {
                        return true;
                    }
                } else if (str12.equals(str13)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.awayTeamID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.awayTeamShortName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.homeTeamID;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.homeTeamShortName;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.matchDateTimeIST;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.matchStatus;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.venue;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.seriesName;
                int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.seriesID;
                int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.matchID;
                int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.tourID;
                int hashCode12 = (hashCode11 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.matchName;
                if (str12 != null) {
                    i = str12.hashCode();
                }
                this.$hashCode = hashCode12 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<MatchesDatum> {
            @Override 
            public MatchesDatum map(ResponseReader responseReader) {
                return new MatchesDatum(responseReader.readString(MatchesDatum.$responseFields[0]), responseReader.readString(MatchesDatum.$responseFields[1]), responseReader.readString(MatchesDatum.$responseFields[2]), responseReader.readString(MatchesDatum.$responseFields[3]), responseReader.readString(MatchesDatum.$responseFields[4]), responseReader.readString(MatchesDatum.$responseFields[5]), responseReader.readString(MatchesDatum.$responseFields[6]), responseReader.readString(MatchesDatum.$responseFields[7]), responseReader.readString(MatchesDatum.$responseFields[8]), responseReader.readString(MatchesDatum.$responseFields[9]), responseReader.readString(MatchesDatum.$responseFields[10]), responseReader.readString(MatchesDatum.$responseFields[11]), responseReader.readString(MatchesDatum.$responseFields[12]));
            }
        }
    }

    public static class TopPerformance {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("playerName", "playerName", null, true, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.SCORE, FirebaseAnalytics.Param.SCORE, null, true, Collections.emptyList()), ResponseField.forString("ScoreType", "ScoreType", null, true, Collections.emptyList()), ResponseField.forString("matchType", "matchType", null, true, Collections.emptyList()), ResponseField.forString("tourID", "tourID", null, true, Collections.emptyList()), ResponseField.forString("tourName", "tourName", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String ScoreType;
        final String __typename;
        final String matchType;
        final String playerID;
        final String playerName;
        final String score;
        final String teamName;
        final String tourID;
        final String tourName;

        public TopPerformance(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.playerID = str2;
            this.playerName = str3;
            this.teamName = str4;
            this.score = str5;
            this.ScoreType = str6;
            this.matchType = str7;
            this.tourID = str8;
            this.tourName = str9;
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

        public String teamName() {
            return this.teamName;
        }

        public String score() {
            return this.score;
        }

        public String ScoreType() {
            return this.ScoreType;
        }

        public String matchType() {
            return this.matchType;
        }

        public String tourID() {
            return this.tourID;
        }

        public String tourName() {
            return this.tourName;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TopPerformance.$responseFields[0], TopPerformance.this.__typename);
                    responseWriter.writeString(TopPerformance.$responseFields[1], TopPerformance.this.playerID);
                    responseWriter.writeString(TopPerformance.$responseFields[2], TopPerformance.this.playerName);
                    responseWriter.writeString(TopPerformance.$responseFields[3], TopPerformance.this.teamName);
                    responseWriter.writeString(TopPerformance.$responseFields[4], TopPerformance.this.score);
                    responseWriter.writeString(TopPerformance.$responseFields[5], TopPerformance.this.ScoreType);
                    responseWriter.writeString(TopPerformance.$responseFields[6], TopPerformance.this.matchType);
                    responseWriter.writeString(TopPerformance.$responseFields[7], TopPerformance.this.tourID);
                    responseWriter.writeString(TopPerformance.$responseFields[8], TopPerformance.this.tourName);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TopPerformance{__typename=" + this.__typename + ", playerID=" + this.playerID + ", playerName=" + this.playerName + ", teamName=" + this.teamName + ", score=" + this.score + ", ScoreType=" + this.ScoreType + ", matchType=" + this.matchType + ", tourID=" + this.tourID + ", tourName=" + this.tourName + "}";
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
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TopPerformance)) {
                return false;
            }
            TopPerformance topPerformance = (TopPerformance) obj;
            if (this.__typename.equals(topPerformance.__typename) && ((str = this.playerID) != null ? str.equals(topPerformance.playerID) : topPerformance.playerID == null) && ((str2 = this.playerName) != null ? str2.equals(topPerformance.playerName) : topPerformance.playerName == null) && ((str3 = this.teamName) != null ? str3.equals(topPerformance.teamName) : topPerformance.teamName == null) && ((str4 = this.score) != null ? str4.equals(topPerformance.score) : topPerformance.score == null) && ((str5 = this.ScoreType) != null ? str5.equals(topPerformance.ScoreType) : topPerformance.ScoreType == null) && ((str6 = this.matchType) != null ? str6.equals(topPerformance.matchType) : topPerformance.matchType == null) && ((str7 = this.tourID) != null ? str7.equals(topPerformance.tourID) : topPerformance.tourID == null)) {
                String str8 = this.tourName;
                String str9 = topPerformance.tourName;
                if (str8 == null) {
                    if (str9 == null) {
                        return true;
                    }
                } else if (str8.equals(str9)) {
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
                String str3 = this.teamName;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.score;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.ScoreType;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.matchType;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.tourID;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.tourName;
                if (str8 != null) {
                    i = str8.hashCode();
                }
                this.$hashCode = hashCode8 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TopPerformance> {
            @Override 
            public TopPerformance map(ResponseReader responseReader) {
                return new TopPerformance(responseReader.readString(TopPerformance.$responseFields[0]), responseReader.readString(TopPerformance.$responseFields[1]), responseReader.readString(TopPerformance.$responseFields[2]), responseReader.readString(TopPerformance.$responseFields[3]), responseReader.readString(TopPerformance.$responseFields[4]), responseReader.readString(TopPerformance.$responseFields[5]), responseReader.readString(TopPerformance.$responseFields[6]), responseReader.readString(TopPerformance.$responseFields[7]), responseReader.readString(TopPerformance.$responseFields[8]));
            }
        }
    }
}
