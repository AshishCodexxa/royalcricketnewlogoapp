package com.gsbusiness.livecricketscoreprediction;

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

public final class GetFRCHomePageQuery implements Query<GetFRCHomePageQuery.Data, GetFRCHomePageQuery.Data, Operation.Variables> {
    public static final String OPERATION_ID = "34f47fd42db15e9f92f546dd166db4447c064999cfc295ff484e98173b93ac4a";
    public static final OperationName OPERATION_NAME = new OperationName() {


       @Override
        public String name() {
            return "getFRCHomePage";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query getFRCHomePage {\n  getFRCHomePage {\n    __typename\n    upcomingmatches {\n      __typename\n      matchID\n      matchName\n      matchNameHindi\n      matchStatus\n      statusMessage\n      isLiveCriclyticsAvailable\n      homeTeamID\n      awayTeamID\n      homeTeamShortName\n      awayTeamShortName\n      matchNumber\n      toss\n      matchDateTimeGMT\n      tourName\n      currentInningsTeamID\n      currentInnings\n      matchType\n      winningTeamID\n      city\n      cityHindi\n      matchScore {\n        __typename\n        teamShortName\n        teamID\n        teamFullName\n        teamScore {\n          __typename\n          inning\n          inningNumber\n          battingTeam\n          runsScored\n          wickets\n          overs\n          runRate\n          battingSide\n          teamID\n          battingTeamShortName\n          declared\n          folowOn\n        }\n      }\n    }\n    livematches {\n      __typename\n      matchID\n      matchName\n      matchNameHindi\n      matchStatus\n      statusMessage\n      statusMessageHindi\n      isLiveCriclyticsAvailable\n      homeTeamID\n      awayTeamID\n      homeTeamShortName\n      awayTeamShortName\n      matchNumber\n      toss\n      matchDateTimeGMT\n      tourName\n      currentInningsTeamID\n      currentInnings\n      matchType\n      winningTeamID\n      city\n      cityHindi\n      matchScore {\n        __typename\n        teamShortName\n        teamID\n        teamFullName\n        teamScore {\n          __typename\n          inning\n          inningNumber\n          battingTeam\n          runsScored\n          wickets\n          overs\n          runRate\n          battingSide\n          teamID\n          battingTeamShortName\n          declared\n          folowOn\n        }\n      }\n    }\n    completedmatches {\n      __typename\n      matchID\n      matchName\n      matchNameHindi\n      matchStatus\n      statusMessage\n      statusMessageHindi\n      homeTeamID\n      isLiveCriclyticsAvailable\n      awayTeamID\n      currentInningsTeamID\n      currentInnings\n      matchType\n      homeTeamShortName\n      awayTeamShortName\n      matchNumber\n      toss\n      matchDateTimeGMT\n      tourName\n      winningTeamID\n      city\n      cityHindi\n      matchScore {\n        __typename\n        teamShortName\n        teamID\n        teamFullName\n        teamScore {\n          __typename\n          inning\n          inningNumber\n          battingTeam\n          runsScored\n          wickets\n          overs\n          runRate\n          battingSide\n          teamID\n          battingTeamShortName\n          declared\n          folowOn\n        }\n      }\n    }\n  }\n}");
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

        public GetFRCHomePageQuery build() {
            return new GetFRCHomePageQuery();
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getFRCHomePage", "getFRCHomePage", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final GetFRCHomePage getFRCHomePage;

        public Data(GetFRCHomePage getFRCHomePage2) {
            this.getFRCHomePage = getFRCHomePage2;
        }

        public GetFRCHomePage getFRCHomePage() {
            return this.getFRCHomePage;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.getFRCHomePage != null ? Data.this.getFRCHomePage.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getFRCHomePage=" + this.getFRCHomePage + "}";
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
            GetFRCHomePage getFRCHomePage2 = this.getFRCHomePage;
            GetFRCHomePage getFRCHomePage3 = ((Data) obj).getFRCHomePage;
            if (getFRCHomePage2 != null) {
                return getFRCHomePage2.equals(getFRCHomePage3);
            }
            if (getFRCHomePage3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetFRCHomePage getFRCHomePage2 = this.getFRCHomePage;
                this.$hashCode = 1000003 ^ (getFRCHomePage2 == null ? 0 : getFRCHomePage2.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetFRCHomePage.Mapper getFRCHomePageFieldMapper = new GetFRCHomePage.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((GetFRCHomePage) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetFRCHomePage>() {


                    @Override 
                    public GetFRCHomePage read(ResponseReader responseReader) {
                        return Mapper.this.getFRCHomePageFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class GetFRCHomePage {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("upcomingmatches", "upcomingmatches", null, true, Collections.emptyList()), ResponseField.forList("livematches", "livematches", null, true, Collections.emptyList()), ResponseField.forList("completedmatches", "completedmatches", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Completedmatch> completedmatches;
        final List<Livematch> livematches;
        final List<Upcomingmatch> upcomingmatches;

        public GetFRCHomePage(String str, List<Upcomingmatch> list, List<Livematch> list2, List<Completedmatch> list3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.upcomingmatches = list;
            this.livematches = list2;
            this.completedmatches = list3;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Upcomingmatch> upcomingmatches() {
            return this.upcomingmatches;
        }

        public List<Livematch> livematches() {
            return this.livematches;
        }

        public List<Completedmatch> completedmatches() {
            return this.completedmatches;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(GetFRCHomePage.$responseFields[0], GetFRCHomePage.this.__typename);
                    responseWriter.writeList(GetFRCHomePage.$responseFields[1], GetFRCHomePage.this.upcomingmatches, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Upcomingmatch) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(GetFRCHomePage.$responseFields[2], GetFRCHomePage.this.livematches, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Livematch) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(GetFRCHomePage.$responseFields[3], GetFRCHomePage.this.completedmatches, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Completedmatch) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetFRCHomePage{__typename=" + this.__typename + ", upcomingmatches=" + this.upcomingmatches + ", livematches=" + this.livematches + ", completedmatches=" + this.completedmatches + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<Upcomingmatch> list;
            List<Livematch> list2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetFRCHomePage)) {
                return false;
            }
            GetFRCHomePage getFRCHomePage = (GetFRCHomePage) obj;
            if (this.__typename.equals(getFRCHomePage.__typename) && ((list = this.upcomingmatches) != null ? list.equals(getFRCHomePage.upcomingmatches) : getFRCHomePage.upcomingmatches == null) && ((list2 = this.livematches) != null ? list2.equals(getFRCHomePage.livematches) : getFRCHomePage.livematches == null)) {
                List<Completedmatch> list3 = this.completedmatches;
                List<Completedmatch> list4 = getFRCHomePage.completedmatches;
                if (list3 == null) {
                    if (list4 == null) {
                        return true;
                    }
                } else if (list3.equals(list4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<Upcomingmatch> list = this.upcomingmatches;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Livematch> list2 = this.livematches;
                int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<Completedmatch> list3 = this.completedmatches;
                if (list3 != null) {
                    i = list3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<GetFRCHomePage> {
            final Completedmatch.Mapper completedmatchFieldMapper = new Completedmatch.Mapper();
            final Livematch.Mapper livematchFieldMapper = new Livematch.Mapper();
            final Upcomingmatch.Mapper upcomingmatchFieldMapper = new Upcomingmatch.Mapper();

            @Override 
            public GetFRCHomePage map(ResponseReader responseReader) {
                return new GetFRCHomePage(responseReader.readString(GetFRCHomePage.$responseFields[0]), responseReader.readList(GetFRCHomePage.$responseFields[1], new ResponseReader.ListReader<Upcomingmatch>() {


                    @Override 
                    public Upcomingmatch read(ResponseReader.ListItemReader listItemReader) {
                        return (Upcomingmatch) listItemReader.readObject(new ResponseReader.ObjectReader<Upcomingmatch>() {


                            @Override 
                            public Upcomingmatch read(ResponseReader responseReader) {
                                return Mapper.this.upcomingmatchFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(GetFRCHomePage.$responseFields[2], new ResponseReader.ListReader<Livematch>() {


                    @Override 
                    public Livematch read(ResponseReader.ListItemReader listItemReader) {
                        return (Livematch) listItemReader.readObject(new ResponseReader.ObjectReader<Livematch>() {


                            @Override 
                            public Livematch read(ResponseReader responseReader) {
                                return Mapper.this.livematchFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(GetFRCHomePage.$responseFields[3], new ResponseReader.ListReader<Completedmatch>() {


                    @Override 
                    public Completedmatch read(ResponseReader.ListItemReader listItemReader) {
                        return (Completedmatch) listItemReader.readObject(new ResponseReader.ObjectReader<Completedmatch>() {


                            @Override 
                            public Completedmatch read(ResponseReader responseReader) {
                                return Mapper.this.completedmatchFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class Upcomingmatch {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchID", "matchID", null, true, Collections.emptyList()), ResponseField.forString("matchName", "matchName", null, true, Collections.emptyList()), ResponseField.forString("matchNameHindi", "matchNameHindi", null, true, Collections.emptyList()), ResponseField.forString("matchStatus", "matchStatus", null, true, Collections.emptyList()), ResponseField.forString("statusMessage", "statusMessage", null, true, Collections.emptyList()), ResponseField.forBoolean("isLiveCriclyticsAvailable", "isLiveCriclyticsAvailable", null, true, Collections.emptyList()), ResponseField.forString("homeTeamID", "homeTeamID", null, true, Collections.emptyList()), ResponseField.forString("awayTeamID", "awayTeamID", null, true, Collections.emptyList()), ResponseField.forString("homeTeamShortName", "homeTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("awayTeamShortName", "awayTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("matchNumber", "matchNumber", null, true, Collections.emptyList()), ResponseField.forString("toss", "toss", null, true, Collections.emptyList()), ResponseField.forString("matchDateTimeGMT", "matchDateTimeGMT", null, true, Collections.emptyList()), ResponseField.forString("tourName", "tourName", null, true, Collections.emptyList()), ResponseField.forString("currentInningsTeamID", "currentInningsTeamID", null, true, Collections.emptyList()), ResponseField.forString("currentInnings", "currentInnings", null, true, Collections.emptyList()), ResponseField.forString("matchType", "matchType", null, true, Collections.emptyList()), ResponseField.forString("winningTeamID", "winningTeamID", null, true, Collections.emptyList()), ResponseField.forString("city", "city", null, true, Collections.emptyList()), ResponseField.forString("cityHindi", "cityHindi", null, true, Collections.emptyList()), ResponseField.forList("matchScore", "matchScore", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String awayTeamID;
        final String awayTeamShortName;
        final String city;
        final String cityHindi;
        final String currentInnings;
        final String currentInningsTeamID;
        final String homeTeamID;
        final String homeTeamShortName;
        final Boolean isLiveCriclyticsAvailable;
        final String matchDateTimeGMT;
        final String matchID;
        final String matchName;
        final String matchNameHindi;
        final String matchNumber;
        final List<MatchScore> matchScore;
        final String matchStatus;
        final String matchType;
        final String statusMessage;
        final String toss;
        final String tourName;
        final String winningTeamID;

        public Upcomingmatch(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, List<MatchScore> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchID = str2;
            this.matchName = str3;
            this.matchNameHindi = str4;
            this.matchStatus = str5;
            this.statusMessage = str6;
            this.isLiveCriclyticsAvailable = bool;
            this.homeTeamID = str7;
            this.awayTeamID = str8;
            this.homeTeamShortName = str9;
            this.awayTeamShortName = str10;
            this.matchNumber = str11;
            this.toss = str12;
            this.matchDateTimeGMT = str13;
            this.tourName = str14;
            this.currentInningsTeamID = str15;
            this.currentInnings = str16;
            this.matchType = str17;
            this.winningTeamID = str18;
            this.city = str19;
            this.cityHindi = str20;
            this.matchScore = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchID() {
            return this.matchID;
        }

        public String matchName() {
            return this.matchName;
        }

        public String matchNameHindi() {
            return this.matchNameHindi;
        }

        public String matchStatus() {
            return this.matchStatus;
        }

        public String statusMessage() {
            return this.statusMessage;
        }

        public Boolean isLiveCriclyticsAvailable() {
            return this.isLiveCriclyticsAvailable;
        }

        public String homeTeamID() {
            return this.homeTeamID;
        }

        public String awayTeamID() {
            return this.awayTeamID;
        }

        public String homeTeamShortName() {
            return this.homeTeamShortName;
        }

        public String awayTeamShortName() {
            return this.awayTeamShortName;
        }

        public String matchNumber() {
            return this.matchNumber;
        }

        public String toss() {
            return this.toss;
        }

        public String matchDateTimeGMT() {
            return this.matchDateTimeGMT;
        }

        public String tourName() {
            return this.tourName;
        }

        public String currentInningsTeamID() {
            return this.currentInningsTeamID;
        }

        public String currentInnings() {
            return this.currentInnings;
        }

        public String matchType() {
            return this.matchType;
        }

        public String winningTeamID() {
            return this.winningTeamID;
        }

        public String city() {
            return this.city;
        }

        public String cityHindi() {
            return this.cityHindi;
        }

        public List<MatchScore> matchScore() {
            return this.matchScore;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Upcomingmatch.$responseFields[0], Upcomingmatch.this.__typename);
                    responseWriter.writeString(Upcomingmatch.$responseFields[1], Upcomingmatch.this.matchID);
                    responseWriter.writeString(Upcomingmatch.$responseFields[2], Upcomingmatch.this.matchName);
                    responseWriter.writeString(Upcomingmatch.$responseFields[3], Upcomingmatch.this.matchNameHindi);
                    responseWriter.writeString(Upcomingmatch.$responseFields[4], Upcomingmatch.this.matchStatus);
                    responseWriter.writeString(Upcomingmatch.$responseFields[5], Upcomingmatch.this.statusMessage);
                    responseWriter.writeBoolean(Upcomingmatch.$responseFields[6], Upcomingmatch.this.isLiveCriclyticsAvailable);
                    responseWriter.writeString(Upcomingmatch.$responseFields[7], Upcomingmatch.this.homeTeamID);
                    responseWriter.writeString(Upcomingmatch.$responseFields[8], Upcomingmatch.this.awayTeamID);
                    responseWriter.writeString(Upcomingmatch.$responseFields[9], Upcomingmatch.this.homeTeamShortName);
                    responseWriter.writeString(Upcomingmatch.$responseFields[10], Upcomingmatch.this.awayTeamShortName);
                    responseWriter.writeString(Upcomingmatch.$responseFields[11], Upcomingmatch.this.matchNumber);
                    responseWriter.writeString(Upcomingmatch.$responseFields[12], Upcomingmatch.this.toss);
                    responseWriter.writeString(Upcomingmatch.$responseFields[13], Upcomingmatch.this.matchDateTimeGMT);
                    responseWriter.writeString(Upcomingmatch.$responseFields[14], Upcomingmatch.this.tourName);
                    responseWriter.writeString(Upcomingmatch.$responseFields[15], Upcomingmatch.this.currentInningsTeamID);
                    responseWriter.writeString(Upcomingmatch.$responseFields[16], Upcomingmatch.this.currentInnings);
                    responseWriter.writeString(Upcomingmatch.$responseFields[17], Upcomingmatch.this.matchType);
                    responseWriter.writeString(Upcomingmatch.$responseFields[18], Upcomingmatch.this.winningTeamID);
                    responseWriter.writeString(Upcomingmatch.$responseFields[19], Upcomingmatch.this.city);
                    responseWriter.writeString(Upcomingmatch.$responseFields[20], Upcomingmatch.this.cityHindi);
                    responseWriter.writeList(Upcomingmatch.$responseFields[21], Upcomingmatch.this.matchScore, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((MatchScore) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Upcomingmatch{__typename=" + this.__typename + ", matchID=" + this.matchID + ", matchName=" + this.matchName + ", matchNameHindi=" + this.matchNameHindi + ", matchStatus=" + this.matchStatus + ", statusMessage=" + this.statusMessage + ", isLiveCriclyticsAvailable=" + this.isLiveCriclyticsAvailable + ", homeTeamID=" + this.homeTeamID + ", awayTeamID=" + this.awayTeamID + ", homeTeamShortName=" + this.homeTeamShortName + ", awayTeamShortName=" + this.awayTeamShortName + ", matchNumber=" + this.matchNumber + ", toss=" + this.toss + ", matchDateTimeGMT=" + this.matchDateTimeGMT + ", tourName=" + this.tourName + ", currentInningsTeamID=" + this.currentInningsTeamID + ", currentInnings=" + this.currentInnings + ", matchType=" + this.matchType + ", winningTeamID=" + this.winningTeamID + ", city=" + this.city + ", cityHindi=" + this.cityHindi + ", matchScore=" + this.matchScore + "}";
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
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            String str18;
            String str19;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Upcomingmatch)) {
                return false;
            }
            Upcomingmatch upcomingmatch = (Upcomingmatch) obj;
            if (this.__typename.equals(upcomingmatch.__typename) && ((str = this.matchID) != null ? str.equals(upcomingmatch.matchID) : upcomingmatch.matchID == null) && ((str2 = this.matchName) != null ? str2.equals(upcomingmatch.matchName) : upcomingmatch.matchName == null) && ((str3 = this.matchNameHindi) != null ? str3.equals(upcomingmatch.matchNameHindi) : upcomingmatch.matchNameHindi == null) && ((str4 = this.matchStatus) != null ? str4.equals(upcomingmatch.matchStatus) : upcomingmatch.matchStatus == null) && ((str5 = this.statusMessage) != null ? str5.equals(upcomingmatch.statusMessage) : upcomingmatch.statusMessage == null) && ((bool = this.isLiveCriclyticsAvailable) != null ? bool.equals(upcomingmatch.isLiveCriclyticsAvailable) : upcomingmatch.isLiveCriclyticsAvailable == null) && ((str6 = this.homeTeamID) != null ? str6.equals(upcomingmatch.homeTeamID) : upcomingmatch.homeTeamID == null) && ((str7 = this.awayTeamID) != null ? str7.equals(upcomingmatch.awayTeamID) : upcomingmatch.awayTeamID == null) && ((str8 = this.homeTeamShortName) != null ? str8.equals(upcomingmatch.homeTeamShortName) : upcomingmatch.homeTeamShortName == null) && ((str9 = this.awayTeamShortName) != null ? str9.equals(upcomingmatch.awayTeamShortName) : upcomingmatch.awayTeamShortName == null) && ((str10 = this.matchNumber) != null ? str10.equals(upcomingmatch.matchNumber) : upcomingmatch.matchNumber == null) && ((str11 = this.toss) != null ? str11.equals(upcomingmatch.toss) : upcomingmatch.toss == null) && ((str12 = this.matchDateTimeGMT) != null ? str12.equals(upcomingmatch.matchDateTimeGMT) : upcomingmatch.matchDateTimeGMT == null) && ((str13 = this.tourName) != null ? str13.equals(upcomingmatch.tourName) : upcomingmatch.tourName == null) && ((str14 = this.currentInningsTeamID) != null ? str14.equals(upcomingmatch.currentInningsTeamID) : upcomingmatch.currentInningsTeamID == null) && ((str15 = this.currentInnings) != null ? str15.equals(upcomingmatch.currentInnings) : upcomingmatch.currentInnings == null) && ((str16 = this.matchType) != null ? str16.equals(upcomingmatch.matchType) : upcomingmatch.matchType == null) && ((str17 = this.winningTeamID) != null ? str17.equals(upcomingmatch.winningTeamID) : upcomingmatch.winningTeamID == null) && ((str18 = this.city) != null ? str18.equals(upcomingmatch.city) : upcomingmatch.city == null) && ((str19 = this.cityHindi) != null ? str19.equals(upcomingmatch.cityHindi) : upcomingmatch.cityHindi == null)) {
                List<MatchScore> list = this.matchScore;
                List<MatchScore> list2 = upcomingmatch.matchScore;
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
                String str = this.matchID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.matchName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.matchNameHindi;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.matchStatus;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.statusMessage;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                Boolean bool = this.isLiveCriclyticsAvailable;
                int hashCode7 = (hashCode6 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str6 = this.homeTeamID;
                int hashCode8 = (hashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.awayTeamID;
                int hashCode9 = (hashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.homeTeamShortName;
                int hashCode10 = (hashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.awayTeamShortName;
                int hashCode11 = (hashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.matchNumber;
                int hashCode12 = (hashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.toss;
                int hashCode13 = (hashCode12 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.matchDateTimeGMT;
                int hashCode14 = (hashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.tourName;
                int hashCode15 = (hashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.currentInningsTeamID;
                int hashCode16 = (hashCode15 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.currentInnings;
                int hashCode17 = (hashCode16 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.matchType;
                int hashCode18 = (hashCode17 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.winningTeamID;
                int hashCode19 = (hashCode18 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.city;
                int hashCode20 = (hashCode19 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.cityHindi;
                int hashCode21 = (hashCode20 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                List<MatchScore> list = this.matchScore;
                if (list != null) {
                    i = list.hashCode();
                }
                this.$hashCode = hashCode21 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Upcomingmatch> {
            final MatchScore.Mapper matchScoreFieldMapper = new MatchScore.Mapper();

            @Override 
            public Upcomingmatch map(ResponseReader responseReader) {
                return new Upcomingmatch(responseReader.readString(Upcomingmatch.$responseFields[0]), responseReader.readString(Upcomingmatch.$responseFields[1]), responseReader.readString(Upcomingmatch.$responseFields[2]), responseReader.readString(Upcomingmatch.$responseFields[3]), responseReader.readString(Upcomingmatch.$responseFields[4]), responseReader.readString(Upcomingmatch.$responseFields[5]), responseReader.readBoolean(Upcomingmatch.$responseFields[6]), responseReader.readString(Upcomingmatch.$responseFields[7]), responseReader.readString(Upcomingmatch.$responseFields[8]), responseReader.readString(Upcomingmatch.$responseFields[9]), responseReader.readString(Upcomingmatch.$responseFields[10]), responseReader.readString(Upcomingmatch.$responseFields[11]), responseReader.readString(Upcomingmatch.$responseFields[12]), responseReader.readString(Upcomingmatch.$responseFields[13]), responseReader.readString(Upcomingmatch.$responseFields[14]), responseReader.readString(Upcomingmatch.$responseFields[15]), responseReader.readString(Upcomingmatch.$responseFields[16]), responseReader.readString(Upcomingmatch.$responseFields[17]), responseReader.readString(Upcomingmatch.$responseFields[18]), responseReader.readString(Upcomingmatch.$responseFields[19]), responseReader.readString(Upcomingmatch.$responseFields[20]), responseReader.readList(Upcomingmatch.$responseFields[21], new ResponseReader.ListReader<MatchScore>() {


                    @Override 
                    public MatchScore read(ResponseReader.ListItemReader listItemReader) {
                        return (MatchScore) listItemReader.readObject(new ResponseReader.ObjectReader<MatchScore>() {


                            @Override 
                            public MatchScore read(ResponseReader responseReader) {
                                return Mapper.this.matchScoreFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
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

    public static class Livematch {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchID", "matchID", null, true, Collections.emptyList()), ResponseField.forString("matchName", "matchName", null, true, Collections.emptyList()), ResponseField.forString("matchNameHindi", "matchNameHindi", null, true, Collections.emptyList()), ResponseField.forString("matchStatus", "matchStatus", null, true, Collections.emptyList()), ResponseField.forString("statusMessage", "statusMessage", null, true, Collections.emptyList()), ResponseField.forString("statusMessageHindi", "statusMessageHindi", null, true, Collections.emptyList()), ResponseField.forBoolean("isLiveCriclyticsAvailable", "isLiveCriclyticsAvailable", null, true, Collections.emptyList()), ResponseField.forString("homeTeamID", "homeTeamID", null, true, Collections.emptyList()), ResponseField.forString("awayTeamID", "awayTeamID", null, true, Collections.emptyList()), ResponseField.forString("homeTeamShortName", "homeTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("awayTeamShortName", "awayTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("matchNumber", "matchNumber", null, true, Collections.emptyList()), ResponseField.forString("toss", "toss", null, true, Collections.emptyList()), ResponseField.forString("matchDateTimeGMT", "matchDateTimeGMT", null, true, Collections.emptyList()), ResponseField.forString("tourName", "tourName", null, true, Collections.emptyList()), ResponseField.forString("currentInningsTeamID", "currentInningsTeamID", null, true, Collections.emptyList()), ResponseField.forString("currentInnings", "currentInnings", null, true, Collections.emptyList()), ResponseField.forString("matchType", "matchType", null, true, Collections.emptyList()), ResponseField.forString("winningTeamID", "winningTeamID", null, true, Collections.emptyList()), ResponseField.forString("city", "city", null, true, Collections.emptyList()), ResponseField.forString("cityHindi", "cityHindi", null, true, Collections.emptyList()), ResponseField.forList("matchScore", "matchScore", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String awayTeamID;
        final String awayTeamShortName;
        final String city;
        final String cityHindi;
        final String currentInnings;
        final String currentInningsTeamID;
        final String homeTeamID;
        final String homeTeamShortName;
        final Boolean isLiveCriclyticsAvailable;
        final String matchDateTimeGMT;
        final String matchID;
        final String matchName;
        final String matchNameHindi;
        final String matchNumber;
        final List<MatchScore1> matchScore;
        final String matchStatus;
        final String matchType;
        final String statusMessage;
        final String statusMessageHindi;
        final String toss;
        final String tourName;
        final String winningTeamID;

        public Livematch(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, List<MatchScore1> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchID = str2;
            this.matchName = str3;
            this.matchNameHindi = str4;
            this.matchStatus = str5;
            this.statusMessage = str6;
            this.statusMessageHindi = str7;
            this.isLiveCriclyticsAvailable = bool;
            this.homeTeamID = str8;
            this.awayTeamID = str9;
            this.homeTeamShortName = str10;
            this.awayTeamShortName = str11;
            this.matchNumber = str12;
            this.toss = str13;
            this.matchDateTimeGMT = str14;
            this.tourName = str15;
            this.currentInningsTeamID = str16;
            this.currentInnings = str17;
            this.matchType = str18;
            this.winningTeamID = str19;
            this.city = str20;
            this.cityHindi = str21;
            this.matchScore = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchID() {
            return this.matchID;
        }

        public String matchName() {
            return this.matchName;
        }

        public String matchNameHindi() {
            return this.matchNameHindi;
        }

        public String matchStatus() {
            return this.matchStatus;
        }

        public String statusMessage() {
            return this.statusMessage;
        }

        public String statusMessageHindi() {
            return this.statusMessageHindi;
        }

        public Boolean isLiveCriclyticsAvailable() {
            return this.isLiveCriclyticsAvailable;
        }

        public String homeTeamID() {
            return this.homeTeamID;
        }

        public String awayTeamID() {
            return this.awayTeamID;
        }

        public String homeTeamShortName() {
            return this.homeTeamShortName;
        }

        public String awayTeamShortName() {
            return this.awayTeamShortName;
        }

        public String matchNumber() {
            return this.matchNumber;
        }

        public String toss() {
            return this.toss;
        }

        public String matchDateTimeGMT() {
            return this.matchDateTimeGMT;
        }

        public String tourName() {
            return this.tourName;
        }

        public String currentInningsTeamID() {
            return this.currentInningsTeamID;
        }

        public String currentInnings() {
            return this.currentInnings;
        }

        public String matchType() {
            return this.matchType;
        }

        public String winningTeamID() {
            return this.winningTeamID;
        }

        public String city() {
            return this.city;
        }

        public String cityHindi() {
            return this.cityHindi;
        }

        public List<MatchScore1> matchScore() {
            return this.matchScore;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Livematch.$responseFields[0], Livematch.this.__typename);
                    responseWriter.writeString(Livematch.$responseFields[1], Livematch.this.matchID);
                    responseWriter.writeString(Livematch.$responseFields[2], Livematch.this.matchName);
                    responseWriter.writeString(Livematch.$responseFields[3], Livematch.this.matchNameHindi);
                    responseWriter.writeString(Livematch.$responseFields[4], Livematch.this.matchStatus);
                    responseWriter.writeString(Livematch.$responseFields[5], Livematch.this.statusMessage);
                    responseWriter.writeString(Livematch.$responseFields[6], Livematch.this.statusMessageHindi);
                    responseWriter.writeBoolean(Livematch.$responseFields[7], Livematch.this.isLiveCriclyticsAvailable);
                    responseWriter.writeString(Livematch.$responseFields[8], Livematch.this.homeTeamID);
                    responseWriter.writeString(Livematch.$responseFields[9], Livematch.this.awayTeamID);
                    responseWriter.writeString(Livematch.$responseFields[10], Livematch.this.homeTeamShortName);
                    responseWriter.writeString(Livematch.$responseFields[11], Livematch.this.awayTeamShortName);
                    responseWriter.writeString(Livematch.$responseFields[12], Livematch.this.matchNumber);
                    responseWriter.writeString(Livematch.$responseFields[13], Livematch.this.toss);
                    responseWriter.writeString(Livematch.$responseFields[14], Livematch.this.matchDateTimeGMT);
                    responseWriter.writeString(Livematch.$responseFields[15], Livematch.this.tourName);
                    responseWriter.writeString(Livematch.$responseFields[16], Livematch.this.currentInningsTeamID);
                    responseWriter.writeString(Livematch.$responseFields[17], Livematch.this.currentInnings);
                    responseWriter.writeString(Livematch.$responseFields[18], Livematch.this.matchType);
                    responseWriter.writeString(Livematch.$responseFields[19], Livematch.this.winningTeamID);
                    responseWriter.writeString(Livematch.$responseFields[20], Livematch.this.city);
                    responseWriter.writeString(Livematch.$responseFields[21], Livematch.this.cityHindi);
                    responseWriter.writeList(Livematch.$responseFields[22], Livematch.this.matchScore, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((MatchScore1) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Livematch{__typename=" + this.__typename + ", matchID=" + this.matchID + ", matchName=" + this.matchName + ", matchNameHindi=" + this.matchNameHindi + ", matchStatus=" + this.matchStatus + ", statusMessage=" + this.statusMessage + ", statusMessageHindi=" + this.statusMessageHindi + ", isLiveCriclyticsAvailable=" + this.isLiveCriclyticsAvailable + ", homeTeamID=" + this.homeTeamID + ", awayTeamID=" + this.awayTeamID + ", homeTeamShortName=" + this.homeTeamShortName + ", awayTeamShortName=" + this.awayTeamShortName + ", matchNumber=" + this.matchNumber + ", toss=" + this.toss + ", matchDateTimeGMT=" + this.matchDateTimeGMT + ", tourName=" + this.tourName + ", currentInningsTeamID=" + this.currentInningsTeamID + ", currentInnings=" + this.currentInnings + ", matchType=" + this.matchType + ", winningTeamID=" + this.winningTeamID + ", city=" + this.city + ", cityHindi=" + this.cityHindi + ", matchScore=" + this.matchScore + "}";
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
            Boolean bool;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            String str18;
            String str19;
            String str20;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Livematch)) {
                return false;
            }
            Livematch livematch = (Livematch) obj;
            if (this.__typename.equals(livematch.__typename) && ((str = this.matchID) != null ? str.equals(livematch.matchID) : livematch.matchID == null) && ((str2 = this.matchName) != null ? str2.equals(livematch.matchName) : livematch.matchName == null) && ((str3 = this.matchNameHindi) != null ? str3.equals(livematch.matchNameHindi) : livematch.matchNameHindi == null) && ((str4 = this.matchStatus) != null ? str4.equals(livematch.matchStatus) : livematch.matchStatus == null) && ((str5 = this.statusMessage) != null ? str5.equals(livematch.statusMessage) : livematch.statusMessage == null) && ((str6 = this.statusMessageHindi) != null ? str6.equals(livematch.statusMessageHindi) : livematch.statusMessageHindi == null) && ((bool = this.isLiveCriclyticsAvailable) != null ? bool.equals(livematch.isLiveCriclyticsAvailable) : livematch.isLiveCriclyticsAvailable == null) && ((str7 = this.homeTeamID) != null ? str7.equals(livematch.homeTeamID) : livematch.homeTeamID == null) && ((str8 = this.awayTeamID) != null ? str8.equals(livematch.awayTeamID) : livematch.awayTeamID == null) && ((str9 = this.homeTeamShortName) != null ? str9.equals(livematch.homeTeamShortName) : livematch.homeTeamShortName == null) && ((str10 = this.awayTeamShortName) != null ? str10.equals(livematch.awayTeamShortName) : livematch.awayTeamShortName == null) && ((str11 = this.matchNumber) != null ? str11.equals(livematch.matchNumber) : livematch.matchNumber == null) && ((str12 = this.toss) != null ? str12.equals(livematch.toss) : livematch.toss == null) && ((str13 = this.matchDateTimeGMT) != null ? str13.equals(livematch.matchDateTimeGMT) : livematch.matchDateTimeGMT == null) && ((str14 = this.tourName) != null ? str14.equals(livematch.tourName) : livematch.tourName == null) && ((str15 = this.currentInningsTeamID) != null ? str15.equals(livematch.currentInningsTeamID) : livematch.currentInningsTeamID == null) && ((str16 = this.currentInnings) != null ? str16.equals(livematch.currentInnings) : livematch.currentInnings == null) && ((str17 = this.matchType) != null ? str17.equals(livematch.matchType) : livematch.matchType == null) && ((str18 = this.winningTeamID) != null ? str18.equals(livematch.winningTeamID) : livematch.winningTeamID == null) && ((str19 = this.city) != null ? str19.equals(livematch.city) : livematch.city == null) && ((str20 = this.cityHindi) != null ? str20.equals(livematch.cityHindi) : livematch.cityHindi == null)) {
                List<MatchScore1> list = this.matchScore;
                List<MatchScore1> list2 = livematch.matchScore;
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
                String str = this.matchID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.matchName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.matchNameHindi;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.matchStatus;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.statusMessage;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.statusMessageHindi;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                Boolean bool = this.isLiveCriclyticsAvailable;
                int hashCode8 = (hashCode7 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str7 = this.homeTeamID;
                int hashCode9 = (hashCode8 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.awayTeamID;
                int hashCode10 = (hashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.homeTeamShortName;
                int hashCode11 = (hashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.awayTeamShortName;
                int hashCode12 = (hashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.matchNumber;
                int hashCode13 = (hashCode12 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.toss;
                int hashCode14 = (hashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.matchDateTimeGMT;
                int hashCode15 = (hashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.tourName;
                int hashCode16 = (hashCode15 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.currentInningsTeamID;
                int hashCode17 = (hashCode16 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.currentInnings;
                int hashCode18 = (hashCode17 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.matchType;
                int hashCode19 = (hashCode18 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.winningTeamID;
                int hashCode20 = (hashCode19 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.city;
                int hashCode21 = (hashCode20 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.cityHindi;
                int hashCode22 = (hashCode21 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                List<MatchScore1> list = this.matchScore;
                if (list != null) {
                    i = list.hashCode();
                }
                this.$hashCode = hashCode22 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Livematch> {
            final MatchScore1.Mapper matchScore1FieldMapper = new MatchScore1.Mapper();

            @Override 
            public Livematch map(ResponseReader responseReader) {
                return new Livematch(responseReader.readString(Livematch.$responseFields[0]), responseReader.readString(Livematch.$responseFields[1]), responseReader.readString(Livematch.$responseFields[2]), responseReader.readString(Livematch.$responseFields[3]), responseReader.readString(Livematch.$responseFields[4]), responseReader.readString(Livematch.$responseFields[5]), responseReader.readString(Livematch.$responseFields[6]), responseReader.readBoolean(Livematch.$responseFields[7]), responseReader.readString(Livematch.$responseFields[8]), responseReader.readString(Livematch.$responseFields[9]), responseReader.readString(Livematch.$responseFields[10]), responseReader.readString(Livematch.$responseFields[11]), responseReader.readString(Livematch.$responseFields[12]), responseReader.readString(Livematch.$responseFields[13]), responseReader.readString(Livematch.$responseFields[14]), responseReader.readString(Livematch.$responseFields[15]), responseReader.readString(Livematch.$responseFields[16]), responseReader.readString(Livematch.$responseFields[17]), responseReader.readString(Livematch.$responseFields[18]), responseReader.readString(Livematch.$responseFields[19]), responseReader.readString(Livematch.$responseFields[20]), responseReader.readString(Livematch.$responseFields[21]), responseReader.readList(Livematch.$responseFields[22], new ResponseReader.ListReader<MatchScore1>() {


                    @Override 
                    public MatchScore1 read(ResponseReader.ListItemReader listItemReader) {
                        return (MatchScore1) listItemReader.readObject(new ResponseReader.ObjectReader<MatchScore1>() {


                            @Override 
                            public MatchScore1 read(ResponseReader responseReader) {
                                return Mapper.this.matchScore1FieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class MatchScore1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamShortName", "teamShortName", null, true, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("teamFullName", "teamFullName", null, true, Collections.emptyList()), ResponseField.forList("teamScore", "teamScore", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String teamFullName;
        final String teamID;
        final List<TeamScore1> teamScore;
        final String teamShortName;

        public MatchScore1(String str, String str2, String str3, String str4, List<TeamScore1> list) {
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

        public List<TeamScore1> teamScore() {
            return this.teamScore;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(MatchScore1.$responseFields[0], MatchScore1.this.__typename);
                    responseWriter.writeString(MatchScore1.$responseFields[1], MatchScore1.this.teamShortName);
                    responseWriter.writeString(MatchScore1.$responseFields[2], MatchScore1.this.teamID);
                    responseWriter.writeString(MatchScore1.$responseFields[3], MatchScore1.this.teamFullName);
                    responseWriter.writeList(MatchScore1.$responseFields[4], MatchScore1.this.teamScore, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((TeamScore1) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "MatchScore1{__typename=" + this.__typename + ", teamShortName=" + this.teamShortName + ", teamID=" + this.teamID + ", teamFullName=" + this.teamFullName + ", teamScore=" + this.teamScore + "}";
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
            if (!(obj instanceof MatchScore1)) {
                return false;
            }
            MatchScore1 matchScore1 = (MatchScore1) obj;
            if (this.__typename.equals(matchScore1.__typename) && ((str = this.teamShortName) != null ? str.equals(matchScore1.teamShortName) : matchScore1.teamShortName == null) && ((str2 = this.teamID) != null ? str2.equals(matchScore1.teamID) : matchScore1.teamID == null) && ((str3 = this.teamFullName) != null ? str3.equals(matchScore1.teamFullName) : matchScore1.teamFullName == null)) {
                List<TeamScore1> list = this.teamScore;
                List<TeamScore1> list2 = matchScore1.teamScore;
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
                List<TeamScore1> list = this.teamScore;
                if (list != null) {
                    i = list.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<MatchScore1> {
            final TeamScore1.Mapper teamScore1FieldMapper = new TeamScore1.Mapper();

            @Override 
            public MatchScore1 map(ResponseReader responseReader) {
                return new MatchScore1(responseReader.readString(MatchScore1.$responseFields[0]), responseReader.readString(MatchScore1.$responseFields[1]), responseReader.readString(MatchScore1.$responseFields[2]), responseReader.readString(MatchScore1.$responseFields[3]), responseReader.readList(MatchScore1.$responseFields[4], new ResponseReader.ListReader<TeamScore1>() {


                    @Override 
                    public TeamScore1 read(ResponseReader.ListItemReader listItemReader) {
                        return (TeamScore1) listItemReader.readObject(new ResponseReader.ObjectReader<TeamScore1>() {


                            @Override 
                            public TeamScore1 read(ResponseReader responseReader) {
                                return Mapper.this.teamScore1FieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class TeamScore1 {
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

        public TeamScore1(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, Boolean bool2) {
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
                    responseWriter.writeString(TeamScore1.$responseFields[0], TeamScore1.this.__typename);
                    responseWriter.writeInt(TeamScore1.$responseFields[1], TeamScore1.this.inning);
                    responseWriter.writeString(TeamScore1.$responseFields[2], TeamScore1.this.inningNumber);
                    responseWriter.writeString(TeamScore1.$responseFields[3], TeamScore1.this.battingTeam);
                    responseWriter.writeString(TeamScore1.$responseFields[4], TeamScore1.this.runsScored);
                    responseWriter.writeString(TeamScore1.$responseFields[5], TeamScore1.this.wickets);
                    responseWriter.writeString(TeamScore1.$responseFields[6], TeamScore1.this.overs);
                    responseWriter.writeString(TeamScore1.$responseFields[7], TeamScore1.this.runRate);
                    responseWriter.writeString(TeamScore1.$responseFields[8], TeamScore1.this.battingSide);
                    responseWriter.writeString(TeamScore1.$responseFields[9], TeamScore1.this.teamID);
                    responseWriter.writeString(TeamScore1.$responseFields[10], TeamScore1.this.battingTeamShortName);
                    responseWriter.writeBoolean(TeamScore1.$responseFields[11], TeamScore1.this.declared);
                    responseWriter.writeBoolean(TeamScore1.$responseFields[12], TeamScore1.this.folowOn);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TeamScore1{__typename=" + this.__typename + ", inning=" + this.inning + ", inningNumber=" + this.inningNumber + ", battingTeam=" + this.battingTeam + ", runsScored=" + this.runsScored + ", wickets=" + this.wickets + ", overs=" + this.overs + ", runRate=" + this.runRate + ", battingSide=" + this.battingSide + ", teamID=" + this.teamID + ", battingTeamShortName=" + this.battingTeamShortName + ", declared=" + this.declared + ", folowOn=" + this.folowOn + "}";
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
            if (!(obj instanceof TeamScore1)) {
                return false;
            }
            TeamScore1 teamScore1 = (TeamScore1) obj;
            if (this.__typename.equals(teamScore1.__typename) && ((num = this.inning) != null ? num.equals(teamScore1.inning) : teamScore1.inning == null) && ((str = this.inningNumber) != null ? str.equals(teamScore1.inningNumber) : teamScore1.inningNumber == null) && ((str2 = this.battingTeam) != null ? str2.equals(teamScore1.battingTeam) : teamScore1.battingTeam == null) && ((str3 = this.runsScored) != null ? str3.equals(teamScore1.runsScored) : teamScore1.runsScored == null) && ((str4 = this.wickets) != null ? str4.equals(teamScore1.wickets) : teamScore1.wickets == null) && ((str5 = this.overs) != null ? str5.equals(teamScore1.overs) : teamScore1.overs == null) && ((str6 = this.runRate) != null ? str6.equals(teamScore1.runRate) : teamScore1.runRate == null) && ((str7 = this.battingSide) != null ? str7.equals(teamScore1.battingSide) : teamScore1.battingSide == null) && ((str8 = this.teamID) != null ? str8.equals(teamScore1.teamID) : teamScore1.teamID == null) && ((str9 = this.battingTeamShortName) != null ? str9.equals(teamScore1.battingTeamShortName) : teamScore1.battingTeamShortName == null) && ((bool = this.declared) != null ? bool.equals(teamScore1.declared) : teamScore1.declared == null)) {
                Boolean bool2 = this.folowOn;
                Boolean bool3 = teamScore1.folowOn;
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

        public static final class Mapper implements ResponseFieldMapper<TeamScore1> {
            @Override 
            public TeamScore1 map(ResponseReader responseReader) {
                return new TeamScore1(responseReader.readString(TeamScore1.$responseFields[0]), responseReader.readInt(TeamScore1.$responseFields[1]), responseReader.readString(TeamScore1.$responseFields[2]), responseReader.readString(TeamScore1.$responseFields[3]), responseReader.readString(TeamScore1.$responseFields[4]), responseReader.readString(TeamScore1.$responseFields[5]), responseReader.readString(TeamScore1.$responseFields[6]), responseReader.readString(TeamScore1.$responseFields[7]), responseReader.readString(TeamScore1.$responseFields[8]), responseReader.readString(TeamScore1.$responseFields[9]), responseReader.readString(TeamScore1.$responseFields[10]), responseReader.readBoolean(TeamScore1.$responseFields[11]), responseReader.readBoolean(TeamScore1.$responseFields[12]));
            }
        }
    }

    public static class Completedmatch {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchID", "matchID", null, true, Collections.emptyList()), ResponseField.forString("matchName", "matchName", null, true, Collections.emptyList()), ResponseField.forString("matchNameHindi", "matchNameHindi", null, true, Collections.emptyList()), ResponseField.forString("matchStatus", "matchStatus", null, true, Collections.emptyList()), ResponseField.forString("statusMessage", "statusMessage", null, true, Collections.emptyList()), ResponseField.forString("statusMessageHindi", "statusMessageHindi", null, true, Collections.emptyList()), ResponseField.forString("homeTeamID", "homeTeamID", null, true, Collections.emptyList()), ResponseField.forBoolean("isLiveCriclyticsAvailable", "isLiveCriclyticsAvailable", null, true, Collections.emptyList()), ResponseField.forString("awayTeamID", "awayTeamID", null, true, Collections.emptyList()), ResponseField.forString("currentInningsTeamID", "currentInningsTeamID", null, true, Collections.emptyList()), ResponseField.forString("currentInnings", "currentInnings", null, true, Collections.emptyList()), ResponseField.forString("matchType", "matchType", null, true, Collections.emptyList()), ResponseField.forString("homeTeamShortName", "homeTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("awayTeamShortName", "awayTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("matchNumber", "matchNumber", null, true, Collections.emptyList()), ResponseField.forString("toss", "toss", null, true, Collections.emptyList()), ResponseField.forString("matchDateTimeGMT", "matchDateTimeGMT", null, true, Collections.emptyList()), ResponseField.forString("tourName", "tourName", null, true, Collections.emptyList()), ResponseField.forString("winningTeamID", "winningTeamID", null, true, Collections.emptyList()), ResponseField.forString("city", "city", null, true, Collections.emptyList()), ResponseField.forString("cityHindi", "cityHindi", null, true, Collections.emptyList()), ResponseField.forList("matchScore", "matchScore", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String awayTeamID;
        final String awayTeamShortName;
        final String city;
        final String cityHindi;
        final String currentInnings;
        final String currentInningsTeamID;
        final String homeTeamID;
        final String homeTeamShortName;
        final Boolean isLiveCriclyticsAvailable;
        final String matchDateTimeGMT;
        final String matchID;
        final String matchName;
        final String matchNameHindi;
        final String matchNumber;
        final List<MatchScore2> matchScore;
        final String matchStatus;
        final String matchType;
        final String statusMessage;
        final String statusMessageHindi;
        final String toss;
        final String tourName;
        final String winningTeamID;

        public Completedmatch(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, List<MatchScore2> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchID = str2;
            this.matchName = str3;
            this.matchNameHindi = str4;
            this.matchStatus = str5;
            this.statusMessage = str6;
            this.statusMessageHindi = str7;
            this.homeTeamID = str8;
            this.isLiveCriclyticsAvailable = bool;
            this.awayTeamID = str9;
            this.currentInningsTeamID = str10;
            this.currentInnings = str11;
            this.matchType = str12;
            this.homeTeamShortName = str13;
            this.awayTeamShortName = str14;
            this.matchNumber = str15;
            this.toss = str16;
            this.matchDateTimeGMT = str17;
            this.tourName = str18;
            this.winningTeamID = str19;
            this.city = str20;
            this.cityHindi = str21;
            this.matchScore = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchID() {
            return this.matchID;
        }

        public String matchName() {
            return this.matchName;
        }

        public String matchNameHindi() {
            return this.matchNameHindi;
        }

        public String matchStatus() {
            return this.matchStatus;
        }

        public String statusMessage() {
            return this.statusMessage;
        }

        public String statusMessageHindi() {
            return this.statusMessageHindi;
        }

        public String homeTeamID() {
            return this.homeTeamID;
        }

        public Boolean isLiveCriclyticsAvailable() {
            return this.isLiveCriclyticsAvailable;
        }

        public String awayTeamID() {
            return this.awayTeamID;
        }

        public String currentInningsTeamID() {
            return this.currentInningsTeamID;
        }

        public String currentInnings() {
            return this.currentInnings;
        }

        public String matchType() {
            return this.matchType;
        }

        public String homeTeamShortName() {
            return this.homeTeamShortName;
        }

        public String awayTeamShortName() {
            return this.awayTeamShortName;
        }

        public String matchNumber() {
            return this.matchNumber;
        }

        public String toss() {
            return this.toss;
        }

        public String matchDateTimeGMT() {
            return this.matchDateTimeGMT;
        }

        public String tourName() {
            return this.tourName;
        }

        public String winningTeamID() {
            return this.winningTeamID;
        }

        public String city() {
            return this.city;
        }

        public String cityHindi() {
            return this.cityHindi;
        }

        public List<MatchScore2> matchScore() {
            return this.matchScore;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Completedmatch.$responseFields[0], Completedmatch.this.__typename);
                    responseWriter.writeString(Completedmatch.$responseFields[1], Completedmatch.this.matchID);
                    responseWriter.writeString(Completedmatch.$responseFields[2], Completedmatch.this.matchName);
                    responseWriter.writeString(Completedmatch.$responseFields[3], Completedmatch.this.matchNameHindi);
                    responseWriter.writeString(Completedmatch.$responseFields[4], Completedmatch.this.matchStatus);
                    responseWriter.writeString(Completedmatch.$responseFields[5], Completedmatch.this.statusMessage);
                    responseWriter.writeString(Completedmatch.$responseFields[6], Completedmatch.this.statusMessageHindi);
                    responseWriter.writeString(Completedmatch.$responseFields[7], Completedmatch.this.homeTeamID);
                    responseWriter.writeBoolean(Completedmatch.$responseFields[8], Completedmatch.this.isLiveCriclyticsAvailable);
                    responseWriter.writeString(Completedmatch.$responseFields[9], Completedmatch.this.awayTeamID);
                    responseWriter.writeString(Completedmatch.$responseFields[10], Completedmatch.this.currentInningsTeamID);
                    responseWriter.writeString(Completedmatch.$responseFields[11], Completedmatch.this.currentInnings);
                    responseWriter.writeString(Completedmatch.$responseFields[12], Completedmatch.this.matchType);
                    responseWriter.writeString(Completedmatch.$responseFields[13], Completedmatch.this.homeTeamShortName);
                    responseWriter.writeString(Completedmatch.$responseFields[14], Completedmatch.this.awayTeamShortName);
                    responseWriter.writeString(Completedmatch.$responseFields[15], Completedmatch.this.matchNumber);
                    responseWriter.writeString(Completedmatch.$responseFields[16], Completedmatch.this.toss);
                    responseWriter.writeString(Completedmatch.$responseFields[17], Completedmatch.this.matchDateTimeGMT);
                    responseWriter.writeString(Completedmatch.$responseFields[18], Completedmatch.this.tourName);
                    responseWriter.writeString(Completedmatch.$responseFields[19], Completedmatch.this.winningTeamID);
                    responseWriter.writeString(Completedmatch.$responseFields[20], Completedmatch.this.city);
                    responseWriter.writeString(Completedmatch.$responseFields[21], Completedmatch.this.cityHindi);
                    responseWriter.writeList(Completedmatch.$responseFields[22], Completedmatch.this.matchScore, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((MatchScore2) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Completedmatch{__typename=" + this.__typename + ", matchID=" + this.matchID + ", matchName=" + this.matchName + ", matchNameHindi=" + this.matchNameHindi + ", matchStatus=" + this.matchStatus + ", statusMessage=" + this.statusMessage + ", statusMessageHindi=" + this.statusMessageHindi + ", homeTeamID=" + this.homeTeamID + ", isLiveCriclyticsAvailable=" + this.isLiveCriclyticsAvailable + ", awayTeamID=" + this.awayTeamID + ", currentInningsTeamID=" + this.currentInningsTeamID + ", currentInnings=" + this.currentInnings + ", matchType=" + this.matchType + ", homeTeamShortName=" + this.homeTeamShortName + ", awayTeamShortName=" + this.awayTeamShortName + ", matchNumber=" + this.matchNumber + ", toss=" + this.toss + ", matchDateTimeGMT=" + this.matchDateTimeGMT + ", tourName=" + this.tourName + ", winningTeamID=" + this.winningTeamID + ", city=" + this.city + ", cityHindi=" + this.cityHindi + ", matchScore=" + this.matchScore + "}";
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
            Boolean bool;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            String str16;
            String str17;
            String str18;
            String str19;
            String str20;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Completedmatch)) {
                return false;
            }
            Completedmatch completedmatch = (Completedmatch) obj;
            if (this.__typename.equals(completedmatch.__typename) && ((str = this.matchID) != null ? str.equals(completedmatch.matchID) : completedmatch.matchID == null) && ((str2 = this.matchName) != null ? str2.equals(completedmatch.matchName) : completedmatch.matchName == null) && ((str3 = this.matchNameHindi) != null ? str3.equals(completedmatch.matchNameHindi) : completedmatch.matchNameHindi == null) && ((str4 = this.matchStatus) != null ? str4.equals(completedmatch.matchStatus) : completedmatch.matchStatus == null) && ((str5 = this.statusMessage) != null ? str5.equals(completedmatch.statusMessage) : completedmatch.statusMessage == null) && ((str6 = this.statusMessageHindi) != null ? str6.equals(completedmatch.statusMessageHindi) : completedmatch.statusMessageHindi == null) && ((str7 = this.homeTeamID) != null ? str7.equals(completedmatch.homeTeamID) : completedmatch.homeTeamID == null) && ((bool = this.isLiveCriclyticsAvailable) != null ? bool.equals(completedmatch.isLiveCriclyticsAvailable) : completedmatch.isLiveCriclyticsAvailable == null) && ((str8 = this.awayTeamID) != null ? str8.equals(completedmatch.awayTeamID) : completedmatch.awayTeamID == null) && ((str9 = this.currentInningsTeamID) != null ? str9.equals(completedmatch.currentInningsTeamID) : completedmatch.currentInningsTeamID == null) && ((str10 = this.currentInnings) != null ? str10.equals(completedmatch.currentInnings) : completedmatch.currentInnings == null) && ((str11 = this.matchType) != null ? str11.equals(completedmatch.matchType) : completedmatch.matchType == null) && ((str12 = this.homeTeamShortName) != null ? str12.equals(completedmatch.homeTeamShortName) : completedmatch.homeTeamShortName == null) && ((str13 = this.awayTeamShortName) != null ? str13.equals(completedmatch.awayTeamShortName) : completedmatch.awayTeamShortName == null) && ((str14 = this.matchNumber) != null ? str14.equals(completedmatch.matchNumber) : completedmatch.matchNumber == null) && ((str15 = this.toss) != null ? str15.equals(completedmatch.toss) : completedmatch.toss == null) && ((str16 = this.matchDateTimeGMT) != null ? str16.equals(completedmatch.matchDateTimeGMT) : completedmatch.matchDateTimeGMT == null) && ((str17 = this.tourName) != null ? str17.equals(completedmatch.tourName) : completedmatch.tourName == null) && ((str18 = this.winningTeamID) != null ? str18.equals(completedmatch.winningTeamID) : completedmatch.winningTeamID == null) && ((str19 = this.city) != null ? str19.equals(completedmatch.city) : completedmatch.city == null) && ((str20 = this.cityHindi) != null ? str20.equals(completedmatch.cityHindi) : completedmatch.cityHindi == null)) {
                List<MatchScore2> list = this.matchScore;
                List<MatchScore2> list2 = completedmatch.matchScore;
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
                String str = this.matchID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.matchName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.matchNameHindi;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.matchStatus;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.statusMessage;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.statusMessageHindi;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.homeTeamID;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                Boolean bool = this.isLiveCriclyticsAvailable;
                int hashCode9 = (hashCode8 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str8 = this.awayTeamID;
                int hashCode10 = (hashCode9 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.currentInningsTeamID;
                int hashCode11 = (hashCode10 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.currentInnings;
                int hashCode12 = (hashCode11 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.matchType;
                int hashCode13 = (hashCode12 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.homeTeamShortName;
                int hashCode14 = (hashCode13 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
                String str13 = this.awayTeamShortName;
                int hashCode15 = (hashCode14 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
                String str14 = this.matchNumber;
                int hashCode16 = (hashCode15 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
                String str15 = this.toss;
                int hashCode17 = (hashCode16 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
                String str16 = this.matchDateTimeGMT;
                int hashCode18 = (hashCode17 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
                String str17 = this.tourName;
                int hashCode19 = (hashCode18 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
                String str18 = this.winningTeamID;
                int hashCode20 = (hashCode19 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
                String str19 = this.city;
                int hashCode21 = (hashCode20 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
                String str20 = this.cityHindi;
                int hashCode22 = (hashCode21 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
                List<MatchScore2> list = this.matchScore;
                if (list != null) {
                    i = list.hashCode();
                }
                this.$hashCode = hashCode22 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Completedmatch> {
            final MatchScore2.Mapper matchScore2FieldMapper = new MatchScore2.Mapper();

            @Override 
            public Completedmatch map(ResponseReader responseReader) {
                return new Completedmatch(responseReader.readString(Completedmatch.$responseFields[0]), responseReader.readString(Completedmatch.$responseFields[1]), responseReader.readString(Completedmatch.$responseFields[2]), responseReader.readString(Completedmatch.$responseFields[3]), responseReader.readString(Completedmatch.$responseFields[4]), responseReader.readString(Completedmatch.$responseFields[5]), responseReader.readString(Completedmatch.$responseFields[6]), responseReader.readString(Completedmatch.$responseFields[7]), responseReader.readBoolean(Completedmatch.$responseFields[8]), responseReader.readString(Completedmatch.$responseFields[9]), responseReader.readString(Completedmatch.$responseFields[10]), responseReader.readString(Completedmatch.$responseFields[11]), responseReader.readString(Completedmatch.$responseFields[12]), responseReader.readString(Completedmatch.$responseFields[13]), responseReader.readString(Completedmatch.$responseFields[14]), responseReader.readString(Completedmatch.$responseFields[15]), responseReader.readString(Completedmatch.$responseFields[16]), responseReader.readString(Completedmatch.$responseFields[17]), responseReader.readString(Completedmatch.$responseFields[18]), responseReader.readString(Completedmatch.$responseFields[19]), responseReader.readString(Completedmatch.$responseFields[20]), responseReader.readString(Completedmatch.$responseFields[21]), responseReader.readList(Completedmatch.$responseFields[22], new ResponseReader.ListReader<MatchScore2>() {


                    @Override 
                    public MatchScore2 read(ResponseReader.ListItemReader listItemReader) {
                        return (MatchScore2) listItemReader.readObject(new ResponseReader.ObjectReader<MatchScore2>() {


                            @Override 
                            public MatchScore2 read(ResponseReader responseReader) {
                                return Mapper.this.matchScore2FieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class MatchScore2 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamShortName", "teamShortName", null, true, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("teamFullName", "teamFullName", null, true, Collections.emptyList()), ResponseField.forList("teamScore", "teamScore", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String teamFullName;
        final String teamID;
        final List<TeamScore2> teamScore;
        final String teamShortName;

        public MatchScore2(String str, String str2, String str3, String str4, List<TeamScore2> list) {
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

        public List<TeamScore2> teamScore() {
            return this.teamScore;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(MatchScore2.$responseFields[0], MatchScore2.this.__typename);
                    responseWriter.writeString(MatchScore2.$responseFields[1], MatchScore2.this.teamShortName);
                    responseWriter.writeString(MatchScore2.$responseFields[2], MatchScore2.this.teamID);
                    responseWriter.writeString(MatchScore2.$responseFields[3], MatchScore2.this.teamFullName);
                    responseWriter.writeList(MatchScore2.$responseFields[4], MatchScore2.this.teamScore, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((TeamScore2) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "MatchScore2{__typename=" + this.__typename + ", teamShortName=" + this.teamShortName + ", teamID=" + this.teamID + ", teamFullName=" + this.teamFullName + ", teamScore=" + this.teamScore + "}";
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
            if (!(obj instanceof MatchScore2)) {
                return false;
            }
            MatchScore2 matchScore2 = (MatchScore2) obj;
            if (this.__typename.equals(matchScore2.__typename) && ((str = this.teamShortName) != null ? str.equals(matchScore2.teamShortName) : matchScore2.teamShortName == null) && ((str2 = this.teamID) != null ? str2.equals(matchScore2.teamID) : matchScore2.teamID == null) && ((str3 = this.teamFullName) != null ? str3.equals(matchScore2.teamFullName) : matchScore2.teamFullName == null)) {
                List<TeamScore2> list = this.teamScore;
                List<TeamScore2> list2 = matchScore2.teamScore;
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
                List<TeamScore2> list = this.teamScore;
                if (list != null) {
                    i = list.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<MatchScore2> {
            final TeamScore2.Mapper teamScore2FieldMapper = new TeamScore2.Mapper();

            @Override 
            public MatchScore2 map(ResponseReader responseReader) {
                return new MatchScore2(responseReader.readString(MatchScore2.$responseFields[0]), responseReader.readString(MatchScore2.$responseFields[1]), responseReader.readString(MatchScore2.$responseFields[2]), responseReader.readString(MatchScore2.$responseFields[3]), responseReader.readList(MatchScore2.$responseFields[4], new ResponseReader.ListReader<TeamScore2>() {


                    @Override 
                    public TeamScore2 read(ResponseReader.ListItemReader listItemReader) {
                        return (TeamScore2) listItemReader.readObject(new ResponseReader.ObjectReader<TeamScore2>() {


                            @Override 
                            public TeamScore2 read(ResponseReader responseReader) {
                                return Mapper.this.teamScore2FieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class TeamScore2 {
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

        public TeamScore2(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, Boolean bool2) {
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
                    responseWriter.writeString(TeamScore2.$responseFields[0], TeamScore2.this.__typename);
                    responseWriter.writeInt(TeamScore2.$responseFields[1], TeamScore2.this.inning);
                    responseWriter.writeString(TeamScore2.$responseFields[2], TeamScore2.this.inningNumber);
                    responseWriter.writeString(TeamScore2.$responseFields[3], TeamScore2.this.battingTeam);
                    responseWriter.writeString(TeamScore2.$responseFields[4], TeamScore2.this.runsScored);
                    responseWriter.writeString(TeamScore2.$responseFields[5], TeamScore2.this.wickets);
                    responseWriter.writeString(TeamScore2.$responseFields[6], TeamScore2.this.overs);
                    responseWriter.writeString(TeamScore2.$responseFields[7], TeamScore2.this.runRate);
                    responseWriter.writeString(TeamScore2.$responseFields[8], TeamScore2.this.battingSide);
                    responseWriter.writeString(TeamScore2.$responseFields[9], TeamScore2.this.teamID);
                    responseWriter.writeString(TeamScore2.$responseFields[10], TeamScore2.this.battingTeamShortName);
                    responseWriter.writeBoolean(TeamScore2.$responseFields[11], TeamScore2.this.declared);
                    responseWriter.writeBoolean(TeamScore2.$responseFields[12], TeamScore2.this.folowOn);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TeamScore2{__typename=" + this.__typename + ", inning=" + this.inning + ", inningNumber=" + this.inningNumber + ", battingTeam=" + this.battingTeam + ", runsScored=" + this.runsScored + ", wickets=" + this.wickets + ", overs=" + this.overs + ", runRate=" + this.runRate + ", battingSide=" + this.battingSide + ", teamID=" + this.teamID + ", battingTeamShortName=" + this.battingTeamShortName + ", declared=" + this.declared + ", folowOn=" + this.folowOn + "}";
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
            if (!(obj instanceof TeamScore2)) {
                return false;
            }
            TeamScore2 teamScore2 = (TeamScore2) obj;
            if (this.__typename.equals(teamScore2.__typename) && ((num = this.inning) != null ? num.equals(teamScore2.inning) : teamScore2.inning == null) && ((str = this.inningNumber) != null ? str.equals(teamScore2.inningNumber) : teamScore2.inningNumber == null) && ((str2 = this.battingTeam) != null ? str2.equals(teamScore2.battingTeam) : teamScore2.battingTeam == null) && ((str3 = this.runsScored) != null ? str3.equals(teamScore2.runsScored) : teamScore2.runsScored == null) && ((str4 = this.wickets) != null ? str4.equals(teamScore2.wickets) : teamScore2.wickets == null) && ((str5 = this.overs) != null ? str5.equals(teamScore2.overs) : teamScore2.overs == null) && ((str6 = this.runRate) != null ? str6.equals(teamScore2.runRate) : teamScore2.runRate == null) && ((str7 = this.battingSide) != null ? str7.equals(teamScore2.battingSide) : teamScore2.battingSide == null) && ((str8 = this.teamID) != null ? str8.equals(teamScore2.teamID) : teamScore2.teamID == null) && ((str9 = this.battingTeamShortName) != null ? str9.equals(teamScore2.battingTeamShortName) : teamScore2.battingTeamShortName == null) && ((bool = this.declared) != null ? bool.equals(teamScore2.declared) : teamScore2.declared == null)) {
                Boolean bool2 = this.folowOn;
                Boolean bool3 = teamScore2.folowOn;
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

        public static final class Mapper implements ResponseFieldMapper<TeamScore2> {
            @Override 
            public TeamScore2 map(ResponseReader responseReader) {
                return new TeamScore2(responseReader.readString(TeamScore2.$responseFields[0]), responseReader.readInt(TeamScore2.$responseFields[1]), responseReader.readString(TeamScore2.$responseFields[2]), responseReader.readString(TeamScore2.$responseFields[3]), responseReader.readString(TeamScore2.$responseFields[4]), responseReader.readString(TeamScore2.$responseFields[5]), responseReader.readString(TeamScore2.$responseFields[6]), responseReader.readString(TeamScore2.$responseFields[7]), responseReader.readString(TeamScore2.$responseFields[8]), responseReader.readString(TeamScore2.$responseFields[9]), responseReader.readString(TeamScore2.$responseFields[10]), responseReader.readBoolean(TeamScore2.$responseFields[11]), responseReader.readBoolean(TeamScore2.$responseFields[12]));
            }
        }
    }
}
