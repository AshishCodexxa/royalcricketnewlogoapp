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
import java.util.LinkedHashMap;
import java.util.Map;

import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

public final class StadiumQuery implements Query<StadiumQuery.Data, StadiumQuery.Data, StadiumQuery.Variables> {
    public static final String OPERATION_ID = "85d46753c002928f790a47f704936afc72038f5a24188a5f2f915232703eee95";
    public static final OperationName OPERATION_NAME = new OperationName() {

        @Override
        public String name() {
            return "stadium";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query stadium($venueID: String!) {\n  stadium(venueID: $venueID) {\n    __typename\n    venueID\n    fullName\n    capacity\n    city\n    country\n    bowlingEnds\n    floodlight\n    venueStats {\n      __typename\n      odiDetails {\n        __typename\n        avgIstInningScore\n        firstBattingWin\n        firstMatch {\n          __typename\n          matchString\n          matchName\n          matchStatusStr\n          scoreStr\n          startDate\n        }\n        lastMatch {\n          __typename\n          matchString\n          matchName\n          matchStatusStr\n          scoreStr\n          startDate\n        }\n        highestScoreMatch {\n          __typename\n          matchString\n          matchName\n          matchStatusStr\n          scoreStr\n          startDate\n        }\n        lowestScoreMatch {\n          __typename\n          matchString\n          matchName\n          matchStatusStr\n          scoreStr\n          startDate\n        }\n      }\n      testDetails {\n        __typename\n        avgIstInningScore\n        firstBattingWin\n        firstMatch {\n          __typename\n          matchString\n          matchName\n          matchStatusStr\n          scoreStr\n          startDate\n        }\n        lastMatch {\n          __typename\n          matchString\n          matchName\n          matchStatusStr\n          scoreStr\n          startDate\n        }\n        highestScoreMatch {\n          __typename\n          matchString\n          matchName\n          matchStatusStr\n          scoreStr\n          startDate\n        }\n        lowestScoreMatch {\n          __typename\n          matchString\n          matchName\n          matchStatusStr\n          scoreStr\n          startDate\n        }\n      }\n      t20Details {\n        __typename\n        avgIstInningScore\n        firstBattingWin\n        firstMatch {\n          __typename\n          matchString\n          matchName\n          matchStatusStr\n          scoreStr\n          startDate\n        }\n        lastMatch {\n          __typename\n          matchString\n          matchName\n          matchStatusStr\n          scoreStr\n          startDate\n        }\n        highestScoreMatch {\n          __typename\n          matchString\n          matchName\n          matchStatusStr\n          scoreStr\n          startDate\n        }\n        lowestScoreMatch {\n          __typename\n          matchString\n          matchName\n          matchStatusStr\n          scoreStr\n          startDate\n        }\n      }\n    }\n  }\n}");
    private final Variables variables;

    @Override
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public StadiumQuery(String str) {
        Utils.checkNotNull(str, "venueID == null");
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
        private String venueID;

        Builder() {
        }

        public Builder venueID(String str) {
            this.venueID = str;
            return this;
        }

        public StadiumQuery build() {
            Utils.checkNotNull(this.venueID, "venueID == null");
            return new StadiumQuery(this.venueID);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final transient Map<String, Object> valueMap;
        private final String venueID;

        Variables(String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.venueID = str;
            linkedHashMap.put("venueID", str);
        }

        public String venueID() {
            return this.venueID;
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
                    inputFieldWriter.writeString("venueID", Variables.this.venueID);
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("stadium", "stadium", new UnmodifiableMapBuilder(1).put("venueID", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "venueID").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final C6832Stadium stadium;

        public Data(C6832Stadium stadium2) {
            this.stadium = stadium2;
        }

        public C6832Stadium stadium() {
            return this.stadium;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.stadium != null ? Data.this.stadium.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{stadium=" + this.stadium + "}";
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
            C6832Stadium stadium2 = this.stadium;
            C6832Stadium stadium3 = ((Data) obj).stadium;
            if (stadium2 != null) {
                return stadium2.equals(stadium3);
            }
            if (stadium3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                C6832Stadium stadium2 = this.stadium;
                this.$hashCode = 1000003 ^ (stadium2 == null ? 0 : stadium2.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final C6832Stadium.Mapper stadiumFieldMapper = new C6832Stadium.Mapper();

            @Override
            public Data map(ResponseReader responseReader) {
                return new Data((C6832Stadium) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<C6832Stadium>() {

                    @Override
                    public C6832Stadium read(ResponseReader responseReader) {
                        return Mapper.this.stadiumFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class C6832Stadium {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("venueID", "venueID", null, true, Collections.emptyList()), ResponseField.forString("fullName", "fullName", null, true, Collections.emptyList()), ResponseField.forString("capacity", "capacity", null, true, Collections.emptyList()), ResponseField.forString("city", "city", null, true, Collections.emptyList()), ResponseField.forString("country", "country", null, true, Collections.emptyList()), ResponseField.forString("bowlingEnds", "bowlingEnds", null, true, Collections.emptyList()), ResponseField.forString("floodlight", "floodlight", null, true, Collections.emptyList()), ResponseField.forObject("venueStats", "venueStats", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String bowlingEnds;
        final String capacity;
        final String city;
        final String country;
        final String floodlight;
        final String fullName;
        final String venueID;
        final VenueStats venueStats;

        public C6832Stadium(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, VenueStats venueStats2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.venueID = str2;
            this.fullName = str3;
            this.capacity = str4;
            this.city = str5;
            this.country = str6;
            this.bowlingEnds = str7;
            this.floodlight = str8;
            this.venueStats = venueStats2;
        }

        public String __typename() {
            return this.__typename;
        }

        public String venueID() {
            return this.venueID;
        }

        public String fullName() {
            return this.fullName;
        }

        public String capacity() {
            return this.capacity;
        }

        public String city() {
            return this.city;
        }

        public String country() {
            return this.country;
        }

        public String bowlingEnds() {
            return this.bowlingEnds;
        }

        public String floodlight() {
            return this.floodlight;
        }

        public VenueStats venueStats() {
            return this.venueStats;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(C6832Stadium.$responseFields[0], C6832Stadium.this.__typename);
                    responseWriter.writeString(C6832Stadium.$responseFields[1], C6832Stadium.this.venueID);
                    responseWriter.writeString(C6832Stadium.$responseFields[2], C6832Stadium.this.fullName);
                    responseWriter.writeString(C6832Stadium.$responseFields[3], C6832Stadium.this.capacity);
                    responseWriter.writeString(C6832Stadium.$responseFields[4], C6832Stadium.this.city);
                    responseWriter.writeString(C6832Stadium.$responseFields[5], C6832Stadium.this.country);
                    responseWriter.writeString(C6832Stadium.$responseFields[6], C6832Stadium.this.bowlingEnds);
                    responseWriter.writeString(C6832Stadium.$responseFields[7], C6832Stadium.this.floodlight);
                    responseWriter.writeObject(C6832Stadium.$responseFields[8], C6832Stadium.this.venueStats != null ? C6832Stadium.this.venueStats.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Stadium{__typename=" + this.__typename + ", venueID=" + this.venueID + ", fullName=" + this.fullName + ", capacity=" + this.capacity + ", city=" + this.city + ", country=" + this.country + ", bowlingEnds=" + this.bowlingEnds + ", floodlight=" + this.floodlight + ", venueStats=" + this.venueStats + "}";
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
            if (!(obj instanceof C6832Stadium)) {
                return false;
            }
            C6832Stadium stadium = (C6832Stadium) obj;
            if (this.__typename.equals(stadium.__typename) && ((str = this.venueID) != null ? str.equals(stadium.venueID) : stadium.venueID == null) && ((str2 = this.fullName) != null ? str2.equals(stadium.fullName) : stadium.fullName == null) && ((str3 = this.capacity) != null ? str3.equals(stadium.capacity) : stadium.capacity == null) && ((str4 = this.city) != null ? str4.equals(stadium.city) : stadium.city == null) && ((str5 = this.country) != null ? str5.equals(stadium.country) : stadium.country == null) && ((str6 = this.bowlingEnds) != null ? str6.equals(stadium.bowlingEnds) : stadium.bowlingEnds == null) && ((str7 = this.floodlight) != null ? str7.equals(stadium.floodlight) : stadium.floodlight == null)) {
                VenueStats venueStats2 = this.venueStats;
                VenueStats venueStats3 = stadium.venueStats;
                if (venueStats2 == null) {
                    if (venueStats3 == null) {
                        return true;
                    }
                } else if (venueStats2.equals(venueStats3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.venueID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.fullName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.capacity;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.city;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.country;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.bowlingEnds;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.floodlight;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                VenueStats venueStats2 = this.venueStats;
                if (venueStats2 != null) {
                    i = venueStats2.hashCode();
                }
                this.$hashCode = hashCode8 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<C6832Stadium> {
            final VenueStats.Mapper venueStatsFieldMapper = new VenueStats.Mapper();

            @Override
            public C6832Stadium map(ResponseReader responseReader) {
                return new C6832Stadium(responseReader.readString(C6832Stadium.$responseFields[0]), responseReader.readString(C6832Stadium.$responseFields[1]), responseReader.readString(C6832Stadium.$responseFields[2]), responseReader.readString(C6832Stadium.$responseFields[3]), responseReader.readString(C6832Stadium.$responseFields[4]), responseReader.readString(C6832Stadium.$responseFields[5]), responseReader.readString(C6832Stadium.$responseFields[6]), responseReader.readString(C6832Stadium.$responseFields[7]), (VenueStats) responseReader.readObject(C6832Stadium.$responseFields[8], new ResponseReader.ObjectReader<VenueStats>() {

                    @Override
                    public VenueStats read(ResponseReader responseReader) {
                        return Mapper.this.venueStatsFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class VenueStats {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forObject("odiDetails", "odiDetails", null, true, Collections.emptyList()), ResponseField.forObject("testDetails", "testDetails", null, true, Collections.emptyList()), ResponseField.forObject("t20Details", "t20Details", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final OdiDetails odiDetails;
        final T20Details t20Details;
        final TestDetails testDetails;

        public VenueStats(String str, OdiDetails odiDetails2, TestDetails testDetails2, T20Details t20Details2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.odiDetails = odiDetails2;
            this.testDetails = testDetails2;
            this.t20Details = t20Details2;
        }

        public String __typename() {
            return this.__typename;
        }

        public OdiDetails odiDetails() {
            return this.odiDetails;
        }

        public TestDetails testDetails() {
            return this.testDetails;
        }

        public T20Details t20Details() {
            return this.t20Details;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(VenueStats.$responseFields[0], VenueStats.this.__typename);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(VenueStats.$responseFields[1], VenueStats.this.odiDetails != null ? VenueStats.this.odiDetails.marshaller() : null);
                    responseWriter.writeObject(VenueStats.$responseFields[2], VenueStats.this.testDetails != null ? VenueStats.this.testDetails.marshaller() : null);
                    ResponseField responseField = VenueStats.$responseFields[3];
                    if (VenueStats.this.t20Details != null) {
                        responseFieldMarshaller = VenueStats.this.t20Details.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "VenueStats{__typename=" + this.__typename + ", odiDetails=" + this.odiDetails + ", testDetails=" + this.testDetails + ", t20Details=" + this.t20Details + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            OdiDetails odiDetails2;
            TestDetails testDetails2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VenueStats)) {
                return false;
            }
            VenueStats venueStats = (VenueStats) obj;
            if (this.__typename.equals(venueStats.__typename) && ((odiDetails2 = this.odiDetails) != null ? odiDetails2.equals(venueStats.odiDetails) : venueStats.odiDetails == null) && ((testDetails2 = this.testDetails) != null ? testDetails2.equals(venueStats.testDetails) : venueStats.testDetails == null)) {
                T20Details t20Details2 = this.t20Details;
                T20Details t20Details3 = venueStats.t20Details;
                if (t20Details2 == null) {
                    if (t20Details3 == null) {
                        return true;
                    }
                } else if (t20Details2.equals(t20Details3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                OdiDetails odiDetails2 = this.odiDetails;
                int i = 0;
                int hashCode2 = (hashCode ^ (odiDetails2 == null ? 0 : odiDetails2.hashCode())) * 1000003;
                TestDetails testDetails2 = this.testDetails;
                int hashCode3 = (hashCode2 ^ (testDetails2 == null ? 0 : testDetails2.hashCode())) * 1000003;
                T20Details t20Details2 = this.t20Details;
                if (t20Details2 != null) {
                    i = t20Details2.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<VenueStats> {
            final OdiDetails.Mapper odiDetailsFieldMapper = new OdiDetails.Mapper();
            final T20Details.Mapper t20DetailsFieldMapper = new T20Details.Mapper();
            final TestDetails.Mapper testDetailsFieldMapper = new TestDetails.Mapper();

            @Override
            public VenueStats map(ResponseReader responseReader) {
                return new VenueStats(responseReader.readString(VenueStats.$responseFields[0]), (OdiDetails) responseReader.readObject(VenueStats.$responseFields[1], new ResponseReader.ObjectReader<OdiDetails>() {

                    @Override
                    public OdiDetails read(ResponseReader responseReader) {
                        return Mapper.this.odiDetailsFieldMapper.map(responseReader);
                    }
                }), (TestDetails) responseReader.readObject(VenueStats.$responseFields[2], new ResponseReader.ObjectReader<TestDetails>() {

                    @Override
                    public TestDetails read(ResponseReader responseReader) {
                        return Mapper.this.testDetailsFieldMapper.map(responseReader);
                    }
                }), (T20Details) responseReader.readObject(VenueStats.$responseFields[3], new ResponseReader.ObjectReader<T20Details>() {

                    @Override
                    public T20Details read(ResponseReader responseReader) {
                        return Mapper.this.t20DetailsFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class OdiDetails {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("avgIstInningScore", "avgIstInningScore", null, true, Collections.emptyList()), ResponseField.forDouble("firstBattingWin", "firstBattingWin", null, true, Collections.emptyList()), ResponseField.forObject("firstMatch", "firstMatch", null, true, Collections.emptyList()), ResponseField.forObject("lastMatch", "lastMatch", null, true, Collections.emptyList()), ResponseField.forObject("highestScoreMatch", "highestScoreMatch", null, true, Collections.emptyList()), ResponseField.forObject("lowestScoreMatch", "lowestScoreMatch", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String avgIstInningScore;
        final Double firstBattingWin;
        final FirstMatch firstMatch;
        final HighestScoreMatch highestScoreMatch;
        final LastMatch lastMatch;
        final LowestScoreMatch lowestScoreMatch;

        public OdiDetails(String str, String str2, Double d, FirstMatch firstMatch2, LastMatch lastMatch2, HighestScoreMatch highestScoreMatch2, LowestScoreMatch lowestScoreMatch2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.avgIstInningScore = str2;
            this.firstBattingWin = d;
            this.firstMatch = firstMatch2;
            this.lastMatch = lastMatch2;
            this.highestScoreMatch = highestScoreMatch2;
            this.lowestScoreMatch = lowestScoreMatch2;
        }

        public String __typename() {
            return this.__typename;
        }

        public String avgIstInningScore() {
            return this.avgIstInningScore;
        }

        public Double firstBattingWin() {
            return this.firstBattingWin;
        }

        public FirstMatch firstMatch() {
            return this.firstMatch;
        }

        public LastMatch lastMatch() {
            return this.lastMatch;
        }

        public HighestScoreMatch highestScoreMatch() {
            return this.highestScoreMatch;
        }

        public LowestScoreMatch lowestScoreMatch() {
            return this.lowestScoreMatch;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(OdiDetails.$responseFields[0], OdiDetails.this.__typename);
                    responseWriter.writeString(OdiDetails.$responseFields[1], OdiDetails.this.avgIstInningScore);
                    responseWriter.writeDouble(OdiDetails.$responseFields[2], OdiDetails.this.firstBattingWin);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(OdiDetails.$responseFields[3], OdiDetails.this.firstMatch != null ? OdiDetails.this.firstMatch.marshaller() : null);
                    responseWriter.writeObject(OdiDetails.$responseFields[4], OdiDetails.this.lastMatch != null ? OdiDetails.this.lastMatch.marshaller() : null);
                    responseWriter.writeObject(OdiDetails.$responseFields[5], OdiDetails.this.highestScoreMatch != null ? OdiDetails.this.highestScoreMatch.marshaller() : null);
                    ResponseField responseField = OdiDetails.$responseFields[6];
                    if (OdiDetails.this.lowestScoreMatch != null) {
                        responseFieldMarshaller = OdiDetails.this.lowestScoreMatch.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "OdiDetails{__typename=" + this.__typename + ", avgIstInningScore=" + this.avgIstInningScore + ", firstBattingWin=" + this.firstBattingWin + ", firstMatch=" + this.firstMatch + ", lastMatch=" + this.lastMatch + ", highestScoreMatch=" + this.highestScoreMatch + ", lowestScoreMatch=" + this.lowestScoreMatch + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            Double d;
            FirstMatch firstMatch2;
            LastMatch lastMatch2;
            HighestScoreMatch highestScoreMatch2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OdiDetails)) {
                return false;
            }
            OdiDetails odiDetails = (OdiDetails) obj;
            if (this.__typename.equals(odiDetails.__typename) && ((str = this.avgIstInningScore) != null ? str.equals(odiDetails.avgIstInningScore) : odiDetails.avgIstInningScore == null) && ((d = this.firstBattingWin) != null ? d.equals(odiDetails.firstBattingWin) : odiDetails.firstBattingWin == null) && ((firstMatch2 = this.firstMatch) != null ? firstMatch2.equals(odiDetails.firstMatch) : odiDetails.firstMatch == null) && ((lastMatch2 = this.lastMatch) != null ? lastMatch2.equals(odiDetails.lastMatch) : odiDetails.lastMatch == null) && ((highestScoreMatch2 = this.highestScoreMatch) != null ? highestScoreMatch2.equals(odiDetails.highestScoreMatch) : odiDetails.highestScoreMatch == null)) {
                LowestScoreMatch lowestScoreMatch2 = this.lowestScoreMatch;
                LowestScoreMatch lowestScoreMatch3 = odiDetails.lowestScoreMatch;
                if (lowestScoreMatch2 == null) {
                    if (lowestScoreMatch3 == null) {
                        return true;
                    }
                } else if (lowestScoreMatch2.equals(lowestScoreMatch3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.avgIstInningScore;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Double d = this.firstBattingWin;
                int hashCode3 = (hashCode2 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                FirstMatch firstMatch2 = this.firstMatch;
                int hashCode4 = (hashCode3 ^ (firstMatch2 == null ? 0 : firstMatch2.hashCode())) * 1000003;
                LastMatch lastMatch2 = this.lastMatch;
                int hashCode5 = (hashCode4 ^ (lastMatch2 == null ? 0 : lastMatch2.hashCode())) * 1000003;
                HighestScoreMatch highestScoreMatch2 = this.highestScoreMatch;
                int hashCode6 = (hashCode5 ^ (highestScoreMatch2 == null ? 0 : highestScoreMatch2.hashCode())) * 1000003;
                LowestScoreMatch lowestScoreMatch2 = this.lowestScoreMatch;
                if (lowestScoreMatch2 != null) {
                    i = lowestScoreMatch2.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<OdiDetails> {
            final FirstMatch.Mapper firstMatchFieldMapper = new FirstMatch.Mapper();
            final HighestScoreMatch.Mapper highestScoreMatchFieldMapper = new HighestScoreMatch.Mapper();
            final LastMatch.Mapper lastMatchFieldMapper = new LastMatch.Mapper();
            final LowestScoreMatch.Mapper lowestScoreMatchFieldMapper = new LowestScoreMatch.Mapper();

            @Override
            public OdiDetails map(ResponseReader responseReader) {
                return new OdiDetails(responseReader.readString(OdiDetails.$responseFields[0]), responseReader.readString(OdiDetails.$responseFields[1]), responseReader.readDouble(OdiDetails.$responseFields[2]), (FirstMatch) responseReader.readObject(OdiDetails.$responseFields[3], new ResponseReader.ObjectReader<FirstMatch>() {

                    @Override
                    public FirstMatch read(ResponseReader responseReader) {
                        return Mapper.this.firstMatchFieldMapper.map(responseReader);
                    }
                }), (LastMatch) responseReader.readObject(OdiDetails.$responseFields[4], new ResponseReader.ObjectReader<LastMatch>() {

                    @Override
                    public LastMatch read(ResponseReader responseReader) {
                        return Mapper.this.lastMatchFieldMapper.map(responseReader);
                    }
                }), (HighestScoreMatch) responseReader.readObject(OdiDetails.$responseFields[5], new ResponseReader.ObjectReader<HighestScoreMatch>() {

                    @Override
                    public HighestScoreMatch read(ResponseReader responseReader) {
                        return Mapper.this.highestScoreMatchFieldMapper.map(responseReader);
                    }
                }), (LowestScoreMatch) responseReader.readObject(OdiDetails.$responseFields[6], new ResponseReader.ObjectReader<LowestScoreMatch>() {

                    @Override
                    public LowestScoreMatch read(ResponseReader responseReader) {
                        return Mapper.this.lowestScoreMatchFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class FirstMatch {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchString", "matchString", null, true, Collections.emptyList()), ResponseField.forString("matchName", "matchName", null, true, Collections.emptyList()), ResponseField.forString("matchStatusStr", "matchStatusStr", null, true, Collections.emptyList()), ResponseField.forString("scoreStr", "scoreStr", null, true, Collections.emptyList()), ResponseField.forString("startDate", "startDate", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String matchName;
        final String matchStatusStr;
        final String matchString;
        final String scoreStr;
        final String startDate;

        public FirstMatch(String str, String str2, String str3, String str4, String str5, String str6) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchString = str2;
            this.matchName = str3;
            this.matchStatusStr = str4;
            this.scoreStr = str5;
            this.startDate = str6;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchString() {
            return this.matchString;
        }

        public String matchName() {
            return this.matchName;
        }

        public String matchStatusStr() {
            return this.matchStatusStr;
        }

        public String scoreStr() {
            return this.scoreStr;
        }

        public String startDate() {
            return this.startDate;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(FirstMatch.$responseFields[0], FirstMatch.this.__typename);
                    responseWriter.writeString(FirstMatch.$responseFields[1], FirstMatch.this.matchString);
                    responseWriter.writeString(FirstMatch.$responseFields[2], FirstMatch.this.matchName);
                    responseWriter.writeString(FirstMatch.$responseFields[3], FirstMatch.this.matchStatusStr);
                    responseWriter.writeString(FirstMatch.$responseFields[4], FirstMatch.this.scoreStr);
                    responseWriter.writeString(FirstMatch.$responseFields[5], FirstMatch.this.startDate);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FirstMatch{__typename=" + this.__typename + ", matchString=" + this.matchString + ", matchName=" + this.matchName + ", matchStatusStr=" + this.matchStatusStr + ", scoreStr=" + this.scoreStr + ", startDate=" + this.startDate + "}";
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
            if (!(obj instanceof FirstMatch)) {
                return false;
            }
            FirstMatch firstMatch = (FirstMatch) obj;
            if (this.__typename.equals(firstMatch.__typename) && ((str = this.matchString) != null ? str.equals(firstMatch.matchString) : firstMatch.matchString == null) && ((str2 = this.matchName) != null ? str2.equals(firstMatch.matchName) : firstMatch.matchName == null) && ((str3 = this.matchStatusStr) != null ? str3.equals(firstMatch.matchStatusStr) : firstMatch.matchStatusStr == null) && ((str4 = this.scoreStr) != null ? str4.equals(firstMatch.scoreStr) : firstMatch.scoreStr == null)) {
                String str5 = this.startDate;
                String str6 = firstMatch.startDate;
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
                String str = this.matchString;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.matchName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.matchStatusStr;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.scoreStr;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.startDate;
                if (str5 != null) {
                    i = str5.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<FirstMatch> {
            @Override
            public FirstMatch map(ResponseReader responseReader) {
                return new FirstMatch(responseReader.readString(FirstMatch.$responseFields[0]), responseReader.readString(FirstMatch.$responseFields[1]), responseReader.readString(FirstMatch.$responseFields[2]), responseReader.readString(FirstMatch.$responseFields[3]), responseReader.readString(FirstMatch.$responseFields[4]), responseReader.readString(FirstMatch.$responseFields[5]));
            }
        }
    }

    public static class LastMatch {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchString", "matchString", null, true, Collections.emptyList()), ResponseField.forString("matchName", "matchName", null, true, Collections.emptyList()), ResponseField.forString("matchStatusStr", "matchStatusStr", null, true, Collections.emptyList()), ResponseField.forString("scoreStr", "scoreStr", null, true, Collections.emptyList()), ResponseField.forString("startDate", "startDate", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String matchName;
        final String matchStatusStr;
        final String matchString;
        final String scoreStr;
        final String startDate;

        public LastMatch(String str, String str2, String str3, String str4, String str5, String str6) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchString = str2;
            this.matchName = str3;
            this.matchStatusStr = str4;
            this.scoreStr = str5;
            this.startDate = str6;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchString() {
            return this.matchString;
        }

        public String matchName() {
            return this.matchName;
        }

        public String matchStatusStr() {
            return this.matchStatusStr;
        }

        public String scoreStr() {
            return this.scoreStr;
        }

        public String startDate() {
            return this.startDate;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(LastMatch.$responseFields[0], LastMatch.this.__typename);
                    responseWriter.writeString(LastMatch.$responseFields[1], LastMatch.this.matchString);
                    responseWriter.writeString(LastMatch.$responseFields[2], LastMatch.this.matchName);
                    responseWriter.writeString(LastMatch.$responseFields[3], LastMatch.this.matchStatusStr);
                    responseWriter.writeString(LastMatch.$responseFields[4], LastMatch.this.scoreStr);
                    responseWriter.writeString(LastMatch.$responseFields[5], LastMatch.this.startDate);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "LastMatch{__typename=" + this.__typename + ", matchString=" + this.matchString + ", matchName=" + this.matchName + ", matchStatusStr=" + this.matchStatusStr + ", scoreStr=" + this.scoreStr + ", startDate=" + this.startDate + "}";
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
            if (!(obj instanceof LastMatch)) {
                return false;
            }
            LastMatch lastMatch = (LastMatch) obj;
            if (this.__typename.equals(lastMatch.__typename) && ((str = this.matchString) != null ? str.equals(lastMatch.matchString) : lastMatch.matchString == null) && ((str2 = this.matchName) != null ? str2.equals(lastMatch.matchName) : lastMatch.matchName == null) && ((str3 = this.matchStatusStr) != null ? str3.equals(lastMatch.matchStatusStr) : lastMatch.matchStatusStr == null) && ((str4 = this.scoreStr) != null ? str4.equals(lastMatch.scoreStr) : lastMatch.scoreStr == null)) {
                String str5 = this.startDate;
                String str6 = lastMatch.startDate;
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
                String str = this.matchString;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.matchName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.matchStatusStr;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.scoreStr;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.startDate;
                if (str5 != null) {
                    i = str5.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<LastMatch> {
            @Override
            public LastMatch map(ResponseReader responseReader) {
                return new LastMatch(responseReader.readString(LastMatch.$responseFields[0]), responseReader.readString(LastMatch.$responseFields[1]), responseReader.readString(LastMatch.$responseFields[2]), responseReader.readString(LastMatch.$responseFields[3]), responseReader.readString(LastMatch.$responseFields[4]), responseReader.readString(LastMatch.$responseFields[5]));
            }
        }
    }

    public static class HighestScoreMatch {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchString", "matchString", null, true, Collections.emptyList()), ResponseField.forString("matchName", "matchName", null, true, Collections.emptyList()), ResponseField.forString("matchStatusStr", "matchStatusStr", null, true, Collections.emptyList()), ResponseField.forString("scoreStr", "scoreStr", null, true, Collections.emptyList()), ResponseField.forString("startDate", "startDate", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String matchName;
        final String matchStatusStr;
        final String matchString;
        final String scoreStr;
        final String startDate;

        public HighestScoreMatch(String str, String str2, String str3, String str4, String str5, String str6) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchString = str2;
            this.matchName = str3;
            this.matchStatusStr = str4;
            this.scoreStr = str5;
            this.startDate = str6;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchString() {
            return this.matchString;
        }

        public String matchName() {
            return this.matchName;
        }

        public String matchStatusStr() {
            return this.matchStatusStr;
        }

        public String scoreStr() {
            return this.scoreStr;
        }

        public String startDate() {
            return this.startDate;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {
                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(HighestScoreMatch.$responseFields[0], HighestScoreMatch.this.__typename);
                    responseWriter.writeString(HighestScoreMatch.$responseFields[1], HighestScoreMatch.this.matchString);
                    responseWriter.writeString(HighestScoreMatch.$responseFields[2], HighestScoreMatch.this.matchName);
                    responseWriter.writeString(HighestScoreMatch.$responseFields[3], HighestScoreMatch.this.matchStatusStr);
                    responseWriter.writeString(HighestScoreMatch.$responseFields[4], HighestScoreMatch.this.scoreStr);
                    responseWriter.writeString(HighestScoreMatch.$responseFields[5], HighestScoreMatch.this.startDate);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "HighestScoreMatch{__typename=" + this.__typename + ", matchString=" + this.matchString + ", matchName=" + this.matchName + ", matchStatusStr=" + this.matchStatusStr + ", scoreStr=" + this.scoreStr + ", startDate=" + this.startDate + "}";
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
            if (!(obj instanceof HighestScoreMatch)) {
                return false;
            }
            HighestScoreMatch highestScoreMatch = (HighestScoreMatch) obj;
            if (this.__typename.equals(highestScoreMatch.__typename) && ((str = this.matchString) != null ? str.equals(highestScoreMatch.matchString) : highestScoreMatch.matchString == null) && ((str2 = this.matchName) != null ? str2.equals(highestScoreMatch.matchName) : highestScoreMatch.matchName == null) && ((str3 = this.matchStatusStr) != null ? str3.equals(highestScoreMatch.matchStatusStr) : highestScoreMatch.matchStatusStr == null) && ((str4 = this.scoreStr) != null ? str4.equals(highestScoreMatch.scoreStr) : highestScoreMatch.scoreStr == null)) {
                String str5 = this.startDate;
                String str6 = highestScoreMatch.startDate;
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
                String str = this.matchString;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.matchName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.matchStatusStr;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.scoreStr;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.startDate;
                if (str5 != null) {
                    i = str5.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<HighestScoreMatch> {
            @Override
            public HighestScoreMatch map(ResponseReader responseReader) {
                return new HighestScoreMatch(responseReader.readString(HighestScoreMatch.$responseFields[0]), responseReader.readString(HighestScoreMatch.$responseFields[1]), responseReader.readString(HighestScoreMatch.$responseFields[2]), responseReader.readString(HighestScoreMatch.$responseFields[3]), responseReader.readString(HighestScoreMatch.$responseFields[4]), responseReader.readString(HighestScoreMatch.$responseFields[5]));
            }
        }
    }

    public static class LowestScoreMatch {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchString", "matchString", null, true, Collections.emptyList()), ResponseField.forString("matchName", "matchName", null, true, Collections.emptyList()), ResponseField.forString("matchStatusStr", "matchStatusStr", null, true, Collections.emptyList()), ResponseField.forString("scoreStr", "scoreStr", null, true, Collections.emptyList()), ResponseField.forString("startDate", "startDate", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String matchName;
        final String matchStatusStr;
        final String matchString;
        final String scoreStr;
        final String startDate;

        public LowestScoreMatch(String str, String str2, String str3, String str4, String str5, String str6) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchString = str2;
            this.matchName = str3;
            this.matchStatusStr = str4;
            this.scoreStr = str5;
            this.startDate = str6;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchString() {
            return this.matchString;
        }

        public String matchName() {
            return this.matchName;
        }

        public String matchStatusStr() {
            return this.matchStatusStr;
        }

        public String scoreStr() {
            return this.scoreStr;
        }

        public String startDate() {
            return this.startDate;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(LowestScoreMatch.$responseFields[0], LowestScoreMatch.this.__typename);
                    responseWriter.writeString(LowestScoreMatch.$responseFields[1], LowestScoreMatch.this.matchString);
                    responseWriter.writeString(LowestScoreMatch.$responseFields[2], LowestScoreMatch.this.matchName);
                    responseWriter.writeString(LowestScoreMatch.$responseFields[3], LowestScoreMatch.this.matchStatusStr);
                    responseWriter.writeString(LowestScoreMatch.$responseFields[4], LowestScoreMatch.this.scoreStr);
                    responseWriter.writeString(LowestScoreMatch.$responseFields[5], LowestScoreMatch.this.startDate);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "LowestScoreMatch{__typename=" + this.__typename + ", matchString=" + this.matchString + ", matchName=" + this.matchName + ", matchStatusStr=" + this.matchStatusStr + ", scoreStr=" + this.scoreStr + ", startDate=" + this.startDate + "}";
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
            if (!(obj instanceof LowestScoreMatch)) {
                return false;
            }
            LowestScoreMatch lowestScoreMatch = (LowestScoreMatch) obj;
            if (this.__typename.equals(lowestScoreMatch.__typename) && ((str = this.matchString) != null ? str.equals(lowestScoreMatch.matchString) : lowestScoreMatch.matchString == null) && ((str2 = this.matchName) != null ? str2.equals(lowestScoreMatch.matchName) : lowestScoreMatch.matchName == null) && ((str3 = this.matchStatusStr) != null ? str3.equals(lowestScoreMatch.matchStatusStr) : lowestScoreMatch.matchStatusStr == null) && ((str4 = this.scoreStr) != null ? str4.equals(lowestScoreMatch.scoreStr) : lowestScoreMatch.scoreStr == null)) {
                String str5 = this.startDate;
                String str6 = lowestScoreMatch.startDate;
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
                String str = this.matchString;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.matchName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.matchStatusStr;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.scoreStr;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.startDate;
                if (str5 != null) {
                    i = str5.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<LowestScoreMatch> {
            @Override
            public LowestScoreMatch map(ResponseReader responseReader) {
                return new LowestScoreMatch(responseReader.readString(LowestScoreMatch.$responseFields[0]), responseReader.readString(LowestScoreMatch.$responseFields[1]), responseReader.readString(LowestScoreMatch.$responseFields[2]), responseReader.readString(LowestScoreMatch.$responseFields[3]), responseReader.readString(LowestScoreMatch.$responseFields[4]), responseReader.readString(LowestScoreMatch.$responseFields[5]));
            }
        }
    }

    public static class TestDetails {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("avgIstInningScore", "avgIstInningScore", null, true, Collections.emptyList()), ResponseField.forDouble("firstBattingWin", "firstBattingWin", null, true, Collections.emptyList()), ResponseField.forObject("firstMatch", "firstMatch", null, true, Collections.emptyList()), ResponseField.forObject("lastMatch", "lastMatch", null, true, Collections.emptyList()), ResponseField.forObject("highestScoreMatch", "highestScoreMatch", null, true, Collections.emptyList()), ResponseField.forObject("lowestScoreMatch", "lowestScoreMatch", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String avgIstInningScore;
        final Double firstBattingWin;
        final FirstMatch1 firstMatch;
        final HighestScoreMatch1 highestScoreMatch;
        final LastMatch1 lastMatch;
        final LowestScoreMatch1 lowestScoreMatch;

        public TestDetails(String str, String str2, Double d, FirstMatch1 firstMatch1, LastMatch1 lastMatch1, HighestScoreMatch1 highestScoreMatch1, LowestScoreMatch1 lowestScoreMatch1) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.avgIstInningScore = str2;
            this.firstBattingWin = d;
            this.firstMatch = firstMatch1;
            this.lastMatch = lastMatch1;
            this.highestScoreMatch = highestScoreMatch1;
            this.lowestScoreMatch = lowestScoreMatch1;
        }

        public String __typename() {
            return this.__typename;
        }

        public String avgIstInningScore() {
            return this.avgIstInningScore;
        }

        public Double firstBattingWin() {
            return this.firstBattingWin;
        }

        public FirstMatch1 firstMatch() {
            return this.firstMatch;
        }

        public LastMatch1 lastMatch() {
            return this.lastMatch;
        }

        public HighestScoreMatch1 highestScoreMatch() {
            return this.highestScoreMatch;
        }

        public LowestScoreMatch1 lowestScoreMatch() {
            return this.lowestScoreMatch;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(TestDetails.$responseFields[0], TestDetails.this.__typename);
                    responseWriter.writeString(TestDetails.$responseFields[1], TestDetails.this.avgIstInningScore);
                    responseWriter.writeDouble(TestDetails.$responseFields[2], TestDetails.this.firstBattingWin);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(TestDetails.$responseFields[3], TestDetails.this.firstMatch != null ? TestDetails.this.firstMatch.marshaller() : null);
                    responseWriter.writeObject(TestDetails.$responseFields[4], TestDetails.this.lastMatch != null ? TestDetails.this.lastMatch.marshaller() : null);
                    responseWriter.writeObject(TestDetails.$responseFields[5], TestDetails.this.highestScoreMatch != null ? TestDetails.this.highestScoreMatch.marshaller() : null);
                    ResponseField responseField = TestDetails.$responseFields[6];
                    if (TestDetails.this.lowestScoreMatch != null) {
                        responseFieldMarshaller = TestDetails.this.lowestScoreMatch.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "TestDetails{__typename=" + this.__typename + ", avgIstInningScore=" + this.avgIstInningScore + ", firstBattingWin=" + this.firstBattingWin + ", firstMatch=" + this.firstMatch + ", lastMatch=" + this.lastMatch + ", highestScoreMatch=" + this.highestScoreMatch + ", lowestScoreMatch=" + this.lowestScoreMatch + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            Double d;
            FirstMatch1 firstMatch1;
            LastMatch1 lastMatch1;
            HighestScoreMatch1 highestScoreMatch1;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TestDetails)) {
                return false;
            }
            TestDetails testDetails = (TestDetails) obj;
            if (this.__typename.equals(testDetails.__typename) && ((str = this.avgIstInningScore) != null ? str.equals(testDetails.avgIstInningScore) : testDetails.avgIstInningScore == null) && ((d = this.firstBattingWin) != null ? d.equals(testDetails.firstBattingWin) : testDetails.firstBattingWin == null) && ((firstMatch1 = this.firstMatch) != null ? firstMatch1.equals(testDetails.firstMatch) : testDetails.firstMatch == null) && ((lastMatch1 = this.lastMatch) != null ? lastMatch1.equals(testDetails.lastMatch) : testDetails.lastMatch == null) && ((highestScoreMatch1 = this.highestScoreMatch) != null ? highestScoreMatch1.equals(testDetails.highestScoreMatch) : testDetails.highestScoreMatch == null)) {
                LowestScoreMatch1 lowestScoreMatch1 = this.lowestScoreMatch;
                LowestScoreMatch1 lowestScoreMatch12 = testDetails.lowestScoreMatch;
                if (lowestScoreMatch1 == null) {
                    if (lowestScoreMatch12 == null) {
                        return true;
                    }
                } else if (lowestScoreMatch1.equals(lowestScoreMatch12)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.avgIstInningScore;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Double d = this.firstBattingWin;
                int hashCode3 = (hashCode2 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                FirstMatch1 firstMatch1 = this.firstMatch;
                int hashCode4 = (hashCode3 ^ (firstMatch1 == null ? 0 : firstMatch1.hashCode())) * 1000003;
                LastMatch1 lastMatch1 = this.lastMatch;
                int hashCode5 = (hashCode4 ^ (lastMatch1 == null ? 0 : lastMatch1.hashCode())) * 1000003;
                HighestScoreMatch1 highestScoreMatch1 = this.highestScoreMatch;
                int hashCode6 = (hashCode5 ^ (highestScoreMatch1 == null ? 0 : highestScoreMatch1.hashCode())) * 1000003;
                LowestScoreMatch1 lowestScoreMatch1 = this.lowestScoreMatch;
                if (lowestScoreMatch1 != null) {
                    i = lowestScoreMatch1.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<TestDetails> {
            final FirstMatch1.Mapper firstMatch1FieldMapper = new FirstMatch1.Mapper();
            final HighestScoreMatch1.Mapper highestScoreMatch1FieldMapper = new HighestScoreMatch1.Mapper();
            final LastMatch1.Mapper lastMatch1FieldMapper = new LastMatch1.Mapper();
            final LowestScoreMatch1.Mapper lowestScoreMatch1FieldMapper = new LowestScoreMatch1.Mapper();

            @Override
            public TestDetails map(ResponseReader responseReader) {
                return new TestDetails(responseReader.readString(TestDetails.$responseFields[0]), responseReader.readString(TestDetails.$responseFields[1]), responseReader.readDouble(TestDetails.$responseFields[2]), (FirstMatch1) responseReader.readObject(TestDetails.$responseFields[3], new ResponseReader.ObjectReader<FirstMatch1>() {

                    @Override
                    public FirstMatch1 read(ResponseReader responseReader) {
                        return Mapper.this.firstMatch1FieldMapper.map(responseReader);
                    }
                }), (LastMatch1) responseReader.readObject(TestDetails.$responseFields[4], new ResponseReader.ObjectReader<LastMatch1>() {

                    @Override
                    public LastMatch1 read(ResponseReader responseReader) {
                        return Mapper.this.lastMatch1FieldMapper.map(responseReader);
                    }
                }), (HighestScoreMatch1) responseReader.readObject(TestDetails.$responseFields[5], new ResponseReader.ObjectReader<HighestScoreMatch1>() {

                    @Override
                    public HighestScoreMatch1 read(ResponseReader responseReader) {
                        return Mapper.this.highestScoreMatch1FieldMapper.map(responseReader);
                    }
                }), (LowestScoreMatch1) responseReader.readObject(TestDetails.$responseFields[6], new ResponseReader.ObjectReader<LowestScoreMatch1>() {

                    @Override
                    public LowestScoreMatch1 read(ResponseReader responseReader) {
                        return Mapper.this.lowestScoreMatch1FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class FirstMatch1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchString", "matchString", null, true, Collections.emptyList()), ResponseField.forString("matchName", "matchName", null, true, Collections.emptyList()), ResponseField.forString("matchStatusStr", "matchStatusStr", null, true, Collections.emptyList()), ResponseField.forString("scoreStr", "scoreStr", null, true, Collections.emptyList()), ResponseField.forString("startDate", "startDate", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String matchName;
        final String matchStatusStr;
        final String matchString;
        final String scoreStr;
        final String startDate;

        public FirstMatch1(String str, String str2, String str3, String str4, String str5, String str6) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchString = str2;
            this.matchName = str3;
            this.matchStatusStr = str4;
            this.scoreStr = str5;
            this.startDate = str6;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchString() {
            return this.matchString;
        }

        public String matchName() {
            return this.matchName;
        }

        public String matchStatusStr() {
            return this.matchStatusStr;
        }

        public String scoreStr() {
            return this.scoreStr;
        }

        public String startDate() {
            return this.startDate;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(FirstMatch1.$responseFields[0], FirstMatch1.this.__typename);
                    responseWriter.writeString(FirstMatch1.$responseFields[1], FirstMatch1.this.matchString);
                    responseWriter.writeString(FirstMatch1.$responseFields[2], FirstMatch1.this.matchName);
                    responseWriter.writeString(FirstMatch1.$responseFields[3], FirstMatch1.this.matchStatusStr);
                    responseWriter.writeString(FirstMatch1.$responseFields[4], FirstMatch1.this.scoreStr);
                    responseWriter.writeString(FirstMatch1.$responseFields[5], FirstMatch1.this.startDate);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FirstMatch1{__typename=" + this.__typename + ", matchString=" + this.matchString + ", matchName=" + this.matchName + ", matchStatusStr=" + this.matchStatusStr + ", scoreStr=" + this.scoreStr + ", startDate=" + this.startDate + "}";
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
            if (!(obj instanceof FirstMatch1)) {
                return false;
            }
            FirstMatch1 firstMatch1 = (FirstMatch1) obj;
            if (this.__typename.equals(firstMatch1.__typename) && ((str = this.matchString) != null ? str.equals(firstMatch1.matchString) : firstMatch1.matchString == null) && ((str2 = this.matchName) != null ? str2.equals(firstMatch1.matchName) : firstMatch1.matchName == null) && ((str3 = this.matchStatusStr) != null ? str3.equals(firstMatch1.matchStatusStr) : firstMatch1.matchStatusStr == null) && ((str4 = this.scoreStr) != null ? str4.equals(firstMatch1.scoreStr) : firstMatch1.scoreStr == null)) {
                String str5 = this.startDate;
                String str6 = firstMatch1.startDate;
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
                String str = this.matchString;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.matchName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.matchStatusStr;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.scoreStr;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.startDate;
                if (str5 != null) {
                    i = str5.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<FirstMatch1> {
            @Override
            public FirstMatch1 map(ResponseReader responseReader) {
                return new FirstMatch1(responseReader.readString(FirstMatch1.$responseFields[0]), responseReader.readString(FirstMatch1.$responseFields[1]), responseReader.readString(FirstMatch1.$responseFields[2]), responseReader.readString(FirstMatch1.$responseFields[3]), responseReader.readString(FirstMatch1.$responseFields[4]), responseReader.readString(FirstMatch1.$responseFields[5]));
            }
        }
    }

    public static class LastMatch1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchString", "matchString", null, true, Collections.emptyList()), ResponseField.forString("matchName", "matchName", null, true, Collections.emptyList()), ResponseField.forString("matchStatusStr", "matchStatusStr", null, true, Collections.emptyList()), ResponseField.forString("scoreStr", "scoreStr", null, true, Collections.emptyList()), ResponseField.forString("startDate", "startDate", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String matchName;
        final String matchStatusStr;
        final String matchString;
        final String scoreStr;
        final String startDate;

        public LastMatch1(String str, String str2, String str3, String str4, String str5, String str6) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchString = str2;
            this.matchName = str3;
            this.matchStatusStr = str4;
            this.scoreStr = str5;
            this.startDate = str6;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchString() {
            return this.matchString;
        }

        public String matchName() {
            return this.matchName;
        }

        public String matchStatusStr() {
            return this.matchStatusStr;
        }

        public String scoreStr() {
            return this.scoreStr;
        }

        public String startDate() {
            return this.startDate;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(LastMatch1.$responseFields[0], LastMatch1.this.__typename);
                    responseWriter.writeString(LastMatch1.$responseFields[1], LastMatch1.this.matchString);
                    responseWriter.writeString(LastMatch1.$responseFields[2], LastMatch1.this.matchName);
                    responseWriter.writeString(LastMatch1.$responseFields[3], LastMatch1.this.matchStatusStr);
                    responseWriter.writeString(LastMatch1.$responseFields[4], LastMatch1.this.scoreStr);
                    responseWriter.writeString(LastMatch1.$responseFields[5], LastMatch1.this.startDate);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "LastMatch1{__typename=" + this.__typename + ", matchString=" + this.matchString + ", matchName=" + this.matchName + ", matchStatusStr=" + this.matchStatusStr + ", scoreStr=" + this.scoreStr + ", startDate=" + this.startDate + "}";
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
            if (!(obj instanceof LastMatch1)) {
                return false;
            }
            LastMatch1 lastMatch1 = (LastMatch1) obj;
            if (this.__typename.equals(lastMatch1.__typename) && ((str = this.matchString) != null ? str.equals(lastMatch1.matchString) : lastMatch1.matchString == null) && ((str2 = this.matchName) != null ? str2.equals(lastMatch1.matchName) : lastMatch1.matchName == null) && ((str3 = this.matchStatusStr) != null ? str3.equals(lastMatch1.matchStatusStr) : lastMatch1.matchStatusStr == null) && ((str4 = this.scoreStr) != null ? str4.equals(lastMatch1.scoreStr) : lastMatch1.scoreStr == null)) {
                String str5 = this.startDate;
                String str6 = lastMatch1.startDate;
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
                String str = this.matchString;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.matchName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.matchStatusStr;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.scoreStr;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.startDate;
                if (str5 != null) {
                    i = str5.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<LastMatch1> {
            @Override
            public LastMatch1 map(ResponseReader responseReader) {
                return new LastMatch1(responseReader.readString(LastMatch1.$responseFields[0]), responseReader.readString(LastMatch1.$responseFields[1]), responseReader.readString(LastMatch1.$responseFields[2]), responseReader.readString(LastMatch1.$responseFields[3]), responseReader.readString(LastMatch1.$responseFields[4]), responseReader.readString(LastMatch1.$responseFields[5]));
            }
        }
    }

    public static class HighestScoreMatch1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchString", "matchString", null, true, Collections.emptyList()), ResponseField.forString("matchName", "matchName", null, true, Collections.emptyList()), ResponseField.forString("matchStatusStr", "matchStatusStr", null, true, Collections.emptyList()), ResponseField.forString("scoreStr", "scoreStr", null, true, Collections.emptyList()), ResponseField.forString("startDate", "startDate", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String matchName;
        final String matchStatusStr;
        final String matchString;
        final String scoreStr;
        final String startDate;

        public HighestScoreMatch1(String str, String str2, String str3, String str4, String str5, String str6) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchString = str2;
            this.matchName = str3;
            this.matchStatusStr = str4;
            this.scoreStr = str5;
            this.startDate = str6;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchString() {
            return this.matchString;
        }

        public String matchName() {
            return this.matchName;
        }

        public String matchStatusStr() {
            return this.matchStatusStr;
        }

        public String scoreStr() {
            return this.scoreStr;
        }

        public String startDate() {
            return this.startDate;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(HighestScoreMatch1.$responseFields[0], HighestScoreMatch1.this.__typename);
                    responseWriter.writeString(HighestScoreMatch1.$responseFields[1], HighestScoreMatch1.this.matchString);
                    responseWriter.writeString(HighestScoreMatch1.$responseFields[2], HighestScoreMatch1.this.matchName);
                    responseWriter.writeString(HighestScoreMatch1.$responseFields[3], HighestScoreMatch1.this.matchStatusStr);
                    responseWriter.writeString(HighestScoreMatch1.$responseFields[4], HighestScoreMatch1.this.scoreStr);
                    responseWriter.writeString(HighestScoreMatch1.$responseFields[5], HighestScoreMatch1.this.startDate);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "HighestScoreMatch1{__typename=" + this.__typename + ", matchString=" + this.matchString + ", matchName=" + this.matchName + ", matchStatusStr=" + this.matchStatusStr + ", scoreStr=" + this.scoreStr + ", startDate=" + this.startDate + "}";
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
            if (!(obj instanceof HighestScoreMatch1)) {
                return false;
            }
            HighestScoreMatch1 highestScoreMatch1 = (HighestScoreMatch1) obj;
            if (this.__typename.equals(highestScoreMatch1.__typename) && ((str = this.matchString) != null ? str.equals(highestScoreMatch1.matchString) : highestScoreMatch1.matchString == null) && ((str2 = this.matchName) != null ? str2.equals(highestScoreMatch1.matchName) : highestScoreMatch1.matchName == null) && ((str3 = this.matchStatusStr) != null ? str3.equals(highestScoreMatch1.matchStatusStr) : highestScoreMatch1.matchStatusStr == null) && ((str4 = this.scoreStr) != null ? str4.equals(highestScoreMatch1.scoreStr) : highestScoreMatch1.scoreStr == null)) {
                String str5 = this.startDate;
                String str6 = highestScoreMatch1.startDate;
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
                String str = this.matchString;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.matchName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.matchStatusStr;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.scoreStr;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.startDate;
                if (str5 != null) {
                    i = str5.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<HighestScoreMatch1> {
            @Override
            public HighestScoreMatch1 map(ResponseReader responseReader) {
                return new HighestScoreMatch1(responseReader.readString(HighestScoreMatch1.$responseFields[0]), responseReader.readString(HighestScoreMatch1.$responseFields[1]), responseReader.readString(HighestScoreMatch1.$responseFields[2]), responseReader.readString(HighestScoreMatch1.$responseFields[3]), responseReader.readString(HighestScoreMatch1.$responseFields[4]), responseReader.readString(HighestScoreMatch1.$responseFields[5]));
            }
        }
    }

    public static class LowestScoreMatch1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchString", "matchString", null, true, Collections.emptyList()), ResponseField.forString("matchName", "matchName", null, true, Collections.emptyList()), ResponseField.forString("matchStatusStr", "matchStatusStr", null, true, Collections.emptyList()), ResponseField.forString("scoreStr", "scoreStr", null, true, Collections.emptyList()), ResponseField.forString("startDate", "startDate", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String matchName;
        final String matchStatusStr;
        final String matchString;
        final String scoreStr;
        final String startDate;

        public LowestScoreMatch1(String str, String str2, String str3, String str4, String str5, String str6) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchString = str2;
            this.matchName = str3;
            this.matchStatusStr = str4;
            this.scoreStr = str5;
            this.startDate = str6;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchString() {
            return this.matchString;
        }

        public String matchName() {
            return this.matchName;
        }

        public String matchStatusStr() {
            return this.matchStatusStr;
        }

        public String scoreStr() {
            return this.scoreStr;
        }

        public String startDate() {
            return this.startDate;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(LowestScoreMatch1.$responseFields[0], LowestScoreMatch1.this.__typename);
                    responseWriter.writeString(LowestScoreMatch1.$responseFields[1], LowestScoreMatch1.this.matchString);
                    responseWriter.writeString(LowestScoreMatch1.$responseFields[2], LowestScoreMatch1.this.matchName);
                    responseWriter.writeString(LowestScoreMatch1.$responseFields[3], LowestScoreMatch1.this.matchStatusStr);
                    responseWriter.writeString(LowestScoreMatch1.$responseFields[4], LowestScoreMatch1.this.scoreStr);
                    responseWriter.writeString(LowestScoreMatch1.$responseFields[5], LowestScoreMatch1.this.startDate);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "LowestScoreMatch1{__typename=" + this.__typename + ", matchString=" + this.matchString + ", matchName=" + this.matchName + ", matchStatusStr=" + this.matchStatusStr + ", scoreStr=" + this.scoreStr + ", startDate=" + this.startDate + "}";
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
            if (!(obj instanceof LowestScoreMatch1)) {
                return false;
            }
            LowestScoreMatch1 lowestScoreMatch1 = (LowestScoreMatch1) obj;
            if (this.__typename.equals(lowestScoreMatch1.__typename) && ((str = this.matchString) != null ? str.equals(lowestScoreMatch1.matchString) : lowestScoreMatch1.matchString == null) && ((str2 = this.matchName) != null ? str2.equals(lowestScoreMatch1.matchName) : lowestScoreMatch1.matchName == null) && ((str3 = this.matchStatusStr) != null ? str3.equals(lowestScoreMatch1.matchStatusStr) : lowestScoreMatch1.matchStatusStr == null) && ((str4 = this.scoreStr) != null ? str4.equals(lowestScoreMatch1.scoreStr) : lowestScoreMatch1.scoreStr == null)) {
                String str5 = this.startDate;
                String str6 = lowestScoreMatch1.startDate;
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
                String str = this.matchString;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.matchName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.matchStatusStr;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.scoreStr;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.startDate;
                if (str5 != null) {
                    i = str5.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<LowestScoreMatch1> {
            @Override
            public LowestScoreMatch1 map(ResponseReader responseReader) {
                return new LowestScoreMatch1(responseReader.readString(LowestScoreMatch1.$responseFields[0]), responseReader.readString(LowestScoreMatch1.$responseFields[1]), responseReader.readString(LowestScoreMatch1.$responseFields[2]), responseReader.readString(LowestScoreMatch1.$responseFields[3]), responseReader.readString(LowestScoreMatch1.$responseFields[4]), responseReader.readString(LowestScoreMatch1.$responseFields[5]));
            }
        }
    }

    public static class T20Details {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("avgIstInningScore", "avgIstInningScore", null, true, Collections.emptyList()), ResponseField.forDouble("firstBattingWin", "firstBattingWin", null, true, Collections.emptyList()), ResponseField.forObject("firstMatch", "firstMatch", null, true, Collections.emptyList()), ResponseField.forObject("lastMatch", "lastMatch", null, true, Collections.emptyList()), ResponseField.forObject("highestScoreMatch", "highestScoreMatch", null, true, Collections.emptyList()), ResponseField.forObject("lowestScoreMatch", "lowestScoreMatch", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String avgIstInningScore;
        final Double firstBattingWin;
        final FirstMatch2 firstMatch;
        final HighestScoreMatch2 highestScoreMatch;
        final LastMatch2 lastMatch;
        final LowestScoreMatch2 lowestScoreMatch;

        public T20Details(String str, String str2, Double d, FirstMatch2 firstMatch2, LastMatch2 lastMatch2, HighestScoreMatch2 highestScoreMatch2, LowestScoreMatch2 lowestScoreMatch2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.avgIstInningScore = str2;
            this.firstBattingWin = d;
            this.firstMatch = firstMatch2;
            this.lastMatch = lastMatch2;
            this.highestScoreMatch = highestScoreMatch2;
            this.lowestScoreMatch = lowestScoreMatch2;
        }

        public String __typename() {
            return this.__typename;
        }

        public String avgIstInningScore() {
            return this.avgIstInningScore;
        }

        public Double firstBattingWin() {
            return this.firstBattingWin;
        }

        public FirstMatch2 firstMatch() {
            return this.firstMatch;
        }

        public LastMatch2 lastMatch() {
            return this.lastMatch;
        }

        public HighestScoreMatch2 highestScoreMatch() {
            return this.highestScoreMatch;
        }

        public LowestScoreMatch2 lowestScoreMatch() {
            return this.lowestScoreMatch;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(T20Details.$responseFields[0], T20Details.this.__typename);
                    responseWriter.writeString(T20Details.$responseFields[1], T20Details.this.avgIstInningScore);
                    responseWriter.writeDouble(T20Details.$responseFields[2], T20Details.this.firstBattingWin);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(T20Details.$responseFields[3], T20Details.this.firstMatch != null ? T20Details.this.firstMatch.marshaller() : null);
                    responseWriter.writeObject(T20Details.$responseFields[4], T20Details.this.lastMatch != null ? T20Details.this.lastMatch.marshaller() : null);
                    responseWriter.writeObject(T20Details.$responseFields[5], T20Details.this.highestScoreMatch != null ? T20Details.this.highestScoreMatch.marshaller() : null);
                    ResponseField responseField = T20Details.$responseFields[6];
                    if (T20Details.this.lowestScoreMatch != null) {
                        responseFieldMarshaller = T20Details.this.lowestScoreMatch.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "T20Details{__typename=" + this.__typename + ", avgIstInningScore=" + this.avgIstInningScore + ", firstBattingWin=" + this.firstBattingWin + ", firstMatch=" + this.firstMatch + ", lastMatch=" + this.lastMatch + ", highestScoreMatch=" + this.highestScoreMatch + ", lowestScoreMatch=" + this.lowestScoreMatch + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            Double d;
            FirstMatch2 firstMatch2;
            LastMatch2 lastMatch2;
            HighestScoreMatch2 highestScoreMatch2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof T20Details)) {
                return false;
            }
            T20Details t20Details = (T20Details) obj;
            if (this.__typename.equals(t20Details.__typename) && ((str = this.avgIstInningScore) != null ? str.equals(t20Details.avgIstInningScore) : t20Details.avgIstInningScore == null) && ((d = this.firstBattingWin) != null ? d.equals(t20Details.firstBattingWin) : t20Details.firstBattingWin == null) && ((firstMatch2 = this.firstMatch) != null ? firstMatch2.equals(t20Details.firstMatch) : t20Details.firstMatch == null) && ((lastMatch2 = this.lastMatch) != null ? lastMatch2.equals(t20Details.lastMatch) : t20Details.lastMatch == null) && ((highestScoreMatch2 = this.highestScoreMatch) != null ? highestScoreMatch2.equals(t20Details.highestScoreMatch) : t20Details.highestScoreMatch == null)) {
                LowestScoreMatch2 lowestScoreMatch2 = this.lowestScoreMatch;
                LowestScoreMatch2 lowestScoreMatch22 = t20Details.lowestScoreMatch;
                if (lowestScoreMatch2 == null) {
                    if (lowestScoreMatch22 == null) {
                        return true;
                    }
                } else if (lowestScoreMatch2.equals(lowestScoreMatch22)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.avgIstInningScore;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                Double d = this.firstBattingWin;
                int hashCode3 = (hashCode2 ^ (d == null ? 0 : d.hashCode())) * 1000003;
                FirstMatch2 firstMatch2 = this.firstMatch;
                int hashCode4 = (hashCode3 ^ (firstMatch2 == null ? 0 : firstMatch2.hashCode())) * 1000003;
                LastMatch2 lastMatch2 = this.lastMatch;
                int hashCode5 = (hashCode4 ^ (lastMatch2 == null ? 0 : lastMatch2.hashCode())) * 1000003;
                HighestScoreMatch2 highestScoreMatch2 = this.highestScoreMatch;
                int hashCode6 = (hashCode5 ^ (highestScoreMatch2 == null ? 0 : highestScoreMatch2.hashCode())) * 1000003;
                LowestScoreMatch2 lowestScoreMatch2 = this.lowestScoreMatch;
                if (lowestScoreMatch2 != null) {
                    i = lowestScoreMatch2.hashCode();
                }
                this.$hashCode = hashCode6 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<T20Details> {
            final FirstMatch2.Mapper firstMatch2FieldMapper = new FirstMatch2.Mapper();
            final HighestScoreMatch2.Mapper highestScoreMatch2FieldMapper = new HighestScoreMatch2.Mapper();
            final LastMatch2.Mapper lastMatch2FieldMapper = new LastMatch2.Mapper();
            final LowestScoreMatch2.Mapper lowestScoreMatch2FieldMapper = new LowestScoreMatch2.Mapper();

            @Override
            public T20Details map(ResponseReader responseReader) {
                return new T20Details(responseReader.readString(T20Details.$responseFields[0]), responseReader.readString(T20Details.$responseFields[1]), responseReader.readDouble(T20Details.$responseFields[2]), (FirstMatch2) responseReader.readObject(T20Details.$responseFields[3], new ResponseReader.ObjectReader<FirstMatch2>() {

                    @Override
                    public FirstMatch2 read(ResponseReader responseReader) {
                        return Mapper.this.firstMatch2FieldMapper.map(responseReader);
                    }
                }), (LastMatch2) responseReader.readObject(T20Details.$responseFields[4], new ResponseReader.ObjectReader<LastMatch2>() {

                    @Override
                    public LastMatch2 read(ResponseReader responseReader) {
                        return Mapper.this.lastMatch2FieldMapper.map(responseReader);
                    }
                }), (HighestScoreMatch2) responseReader.readObject(T20Details.$responseFields[5], new ResponseReader.ObjectReader<HighestScoreMatch2>() {

                    @Override
                    public HighestScoreMatch2 read(ResponseReader responseReader) {
                        return Mapper.this.highestScoreMatch2FieldMapper.map(responseReader);
                    }
                }), (LowestScoreMatch2) responseReader.readObject(T20Details.$responseFields[6], new ResponseReader.ObjectReader<LowestScoreMatch2>() {

                    @Override
                    public LowestScoreMatch2 read(ResponseReader responseReader) {
                        return Mapper.this.lowestScoreMatch2FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class FirstMatch2 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchString", "matchString", null, true, Collections.emptyList()), ResponseField.forString("matchName", "matchName", null, true, Collections.emptyList()), ResponseField.forString("matchStatusStr", "matchStatusStr", null, true, Collections.emptyList()), ResponseField.forString("scoreStr", "scoreStr", null, true, Collections.emptyList()), ResponseField.forString("startDate", "startDate", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String matchName;
        final String matchStatusStr;
        final String matchString;
        final String scoreStr;
        final String startDate;

        public FirstMatch2(String str, String str2, String str3, String str4, String str5, String str6) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchString = str2;
            this.matchName = str3;
            this.matchStatusStr = str4;
            this.scoreStr = str5;
            this.startDate = str6;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchString() {
            return this.matchString;
        }

        public String matchName() {
            return this.matchName;
        }

        public String matchStatusStr() {
            return this.matchStatusStr;
        }

        public String scoreStr() {
            return this.scoreStr;
        }

        public String startDate() {
            return this.startDate;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(FirstMatch2.$responseFields[0], FirstMatch2.this.__typename);
                    responseWriter.writeString(FirstMatch2.$responseFields[1], FirstMatch2.this.matchString);
                    responseWriter.writeString(FirstMatch2.$responseFields[2], FirstMatch2.this.matchName);
                    responseWriter.writeString(FirstMatch2.$responseFields[3], FirstMatch2.this.matchStatusStr);
                    responseWriter.writeString(FirstMatch2.$responseFields[4], FirstMatch2.this.scoreStr);
                    responseWriter.writeString(FirstMatch2.$responseFields[5], FirstMatch2.this.startDate);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "FirstMatch2{__typename=" + this.__typename + ", matchString=" + this.matchString + ", matchName=" + this.matchName + ", matchStatusStr=" + this.matchStatusStr + ", scoreStr=" + this.scoreStr + ", startDate=" + this.startDate + "}";
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
            if (!(obj instanceof FirstMatch2)) {
                return false;
            }
            FirstMatch2 firstMatch2 = (FirstMatch2) obj;
            if (this.__typename.equals(firstMatch2.__typename) && ((str = this.matchString) != null ? str.equals(firstMatch2.matchString) : firstMatch2.matchString == null) && ((str2 = this.matchName) != null ? str2.equals(firstMatch2.matchName) : firstMatch2.matchName == null) && ((str3 = this.matchStatusStr) != null ? str3.equals(firstMatch2.matchStatusStr) : firstMatch2.matchStatusStr == null) && ((str4 = this.scoreStr) != null ? str4.equals(firstMatch2.scoreStr) : firstMatch2.scoreStr == null)) {
                String str5 = this.startDate;
                String str6 = firstMatch2.startDate;
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
                String str = this.matchString;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.matchName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.matchStatusStr;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.scoreStr;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.startDate;
                if (str5 != null) {
                    i = str5.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<FirstMatch2> {
            @Override
            public FirstMatch2 map(ResponseReader responseReader) {
                return new FirstMatch2(responseReader.readString(FirstMatch2.$responseFields[0]), responseReader.readString(FirstMatch2.$responseFields[1]), responseReader.readString(FirstMatch2.$responseFields[2]), responseReader.readString(FirstMatch2.$responseFields[3]), responseReader.readString(FirstMatch2.$responseFields[4]), responseReader.readString(FirstMatch2.$responseFields[5]));
            }
        }
    }

    public static class LastMatch2 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchString", "matchString", null, true, Collections.emptyList()), ResponseField.forString("matchName", "matchName", null, true, Collections.emptyList()), ResponseField.forString("matchStatusStr", "matchStatusStr", null, true, Collections.emptyList()), ResponseField.forString("scoreStr", "scoreStr", null, true, Collections.emptyList()), ResponseField.forString("startDate", "startDate", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String matchName;
        final String matchStatusStr;
        final String matchString;
        final String scoreStr;
        final String startDate;

        public LastMatch2(String str, String str2, String str3, String str4, String str5, String str6) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchString = str2;
            this.matchName = str3;
            this.matchStatusStr = str4;
            this.scoreStr = str5;
            this.startDate = str6;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchString() {
            return this.matchString;
        }

        public String matchName() {
            return this.matchName;
        }

        public String matchStatusStr() {
            return this.matchStatusStr;
        }

        public String scoreStr() {
            return this.scoreStr;
        }

        public String startDate() {
            return this.startDate;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(LastMatch2.$responseFields[0], LastMatch2.this.__typename);
                    responseWriter.writeString(LastMatch2.$responseFields[1], LastMatch2.this.matchString);
                    responseWriter.writeString(LastMatch2.$responseFields[2], LastMatch2.this.matchName);
                    responseWriter.writeString(LastMatch2.$responseFields[3], LastMatch2.this.matchStatusStr);
                    responseWriter.writeString(LastMatch2.$responseFields[4], LastMatch2.this.scoreStr);
                    responseWriter.writeString(LastMatch2.$responseFields[5], LastMatch2.this.startDate);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "LastMatch2{__typename=" + this.__typename + ", matchString=" + this.matchString + ", matchName=" + this.matchName + ", matchStatusStr=" + this.matchStatusStr + ", scoreStr=" + this.scoreStr + ", startDate=" + this.startDate + "}";
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
            if (!(obj instanceof LastMatch2)) {
                return false;
            }
            LastMatch2 lastMatch2 = (LastMatch2) obj;
            if (this.__typename.equals(lastMatch2.__typename) && ((str = this.matchString) != null ? str.equals(lastMatch2.matchString) : lastMatch2.matchString == null) && ((str2 = this.matchName) != null ? str2.equals(lastMatch2.matchName) : lastMatch2.matchName == null) && ((str3 = this.matchStatusStr) != null ? str3.equals(lastMatch2.matchStatusStr) : lastMatch2.matchStatusStr == null) && ((str4 = this.scoreStr) != null ? str4.equals(lastMatch2.scoreStr) : lastMatch2.scoreStr == null)) {
                String str5 = this.startDate;
                String str6 = lastMatch2.startDate;
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
                String str = this.matchString;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.matchName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.matchStatusStr;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.scoreStr;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.startDate;
                if (str5 != null) {
                    i = str5.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<LastMatch2> {
            @Override
            public LastMatch2 map(ResponseReader responseReader) {
                return new LastMatch2(responseReader.readString(LastMatch2.$responseFields[0]), responseReader.readString(LastMatch2.$responseFields[1]), responseReader.readString(LastMatch2.$responseFields[2]), responseReader.readString(LastMatch2.$responseFields[3]), responseReader.readString(LastMatch2.$responseFields[4]), responseReader.readString(LastMatch2.$responseFields[5]));
            }
        }
    }

    public static class HighestScoreMatch2 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchString", "matchString", null, true, Collections.emptyList()), ResponseField.forString("matchName", "matchName", null, true, Collections.emptyList()), ResponseField.forString("matchStatusStr", "matchStatusStr", null, true, Collections.emptyList()), ResponseField.forString("scoreStr", "scoreStr", null, true, Collections.emptyList()), ResponseField.forString("startDate", "startDate", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String matchName;
        final String matchStatusStr;
        final String matchString;
        final String scoreStr;
        final String startDate;

        public HighestScoreMatch2(String str, String str2, String str3, String str4, String str5, String str6) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchString = str2;
            this.matchName = str3;
            this.matchStatusStr = str4;
            this.scoreStr = str5;
            this.startDate = str6;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchString() {
            return this.matchString;
        }

        public String matchName() {
            return this.matchName;
        }

        public String matchStatusStr() {
            return this.matchStatusStr;
        }

        public String scoreStr() {
            return this.scoreStr;
        }

        public String startDate() {
            return this.startDate;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(HighestScoreMatch2.$responseFields[0], HighestScoreMatch2.this.__typename);
                    responseWriter.writeString(HighestScoreMatch2.$responseFields[1], HighestScoreMatch2.this.matchString);
                    responseWriter.writeString(HighestScoreMatch2.$responseFields[2], HighestScoreMatch2.this.matchName);
                    responseWriter.writeString(HighestScoreMatch2.$responseFields[3], HighestScoreMatch2.this.matchStatusStr);
                    responseWriter.writeString(HighestScoreMatch2.$responseFields[4], HighestScoreMatch2.this.scoreStr);
                    responseWriter.writeString(HighestScoreMatch2.$responseFields[5], HighestScoreMatch2.this.startDate);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "HighestScoreMatch2{__typename=" + this.__typename + ", matchString=" + this.matchString + ", matchName=" + this.matchName + ", matchStatusStr=" + this.matchStatusStr + ", scoreStr=" + this.scoreStr + ", startDate=" + this.startDate + "}";
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
            if (!(obj instanceof HighestScoreMatch2)) {
                return false;
            }
            HighestScoreMatch2 highestScoreMatch2 = (HighestScoreMatch2) obj;
            if (this.__typename.equals(highestScoreMatch2.__typename) && ((str = this.matchString) != null ? str.equals(highestScoreMatch2.matchString) : highestScoreMatch2.matchString == null) && ((str2 = this.matchName) != null ? str2.equals(highestScoreMatch2.matchName) : highestScoreMatch2.matchName == null) && ((str3 = this.matchStatusStr) != null ? str3.equals(highestScoreMatch2.matchStatusStr) : highestScoreMatch2.matchStatusStr == null) && ((str4 = this.scoreStr) != null ? str4.equals(highestScoreMatch2.scoreStr) : highestScoreMatch2.scoreStr == null)) {
                String str5 = this.startDate;
                String str6 = highestScoreMatch2.startDate;
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
                String str = this.matchString;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.matchName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.matchStatusStr;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.scoreStr;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.startDate;
                if (str5 != null) {
                    i = str5.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<HighestScoreMatch2> {
            @Override
            public HighestScoreMatch2 map(ResponseReader responseReader) {
                return new HighestScoreMatch2(responseReader.readString(HighestScoreMatch2.$responseFields[0]), responseReader.readString(HighestScoreMatch2.$responseFields[1]), responseReader.readString(HighestScoreMatch2.$responseFields[2]), responseReader.readString(HighestScoreMatch2.$responseFields[3]), responseReader.readString(HighestScoreMatch2.$responseFields[4]), responseReader.readString(HighestScoreMatch2.$responseFields[5]));
            }
        }
    }

    public static class LowestScoreMatch2 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchString", "matchString", null, true, Collections.emptyList()), ResponseField.forString("matchName", "matchName", null, true, Collections.emptyList()), ResponseField.forString("matchStatusStr", "matchStatusStr", null, true, Collections.emptyList()), ResponseField.forString("scoreStr", "scoreStr", null, true, Collections.emptyList()), ResponseField.forString("startDate", "startDate", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String matchName;
        final String matchStatusStr;
        final String matchString;
        final String scoreStr;
        final String startDate;

        public LowestScoreMatch2(String str, String str2, String str3, String str4, String str5, String str6) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchString = str2;
            this.matchName = str3;
            this.matchStatusStr = str4;
            this.scoreStr = str5;
            this.startDate = str6;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchString() {
            return this.matchString;
        }

        public String matchName() {
            return this.matchName;
        }

        public String matchStatusStr() {
            return this.matchStatusStr;
        }

        public String scoreStr() {
            return this.scoreStr;
        }

        public String startDate() {
            return this.startDate;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(LowestScoreMatch2.$responseFields[0], LowestScoreMatch2.this.__typename);
                    responseWriter.writeString(LowestScoreMatch2.$responseFields[1], LowestScoreMatch2.this.matchString);
                    responseWriter.writeString(LowestScoreMatch2.$responseFields[2], LowestScoreMatch2.this.matchName);
                    responseWriter.writeString(LowestScoreMatch2.$responseFields[3], LowestScoreMatch2.this.matchStatusStr);
                    responseWriter.writeString(LowestScoreMatch2.$responseFields[4], LowestScoreMatch2.this.scoreStr);
                    responseWriter.writeString(LowestScoreMatch2.$responseFields[5], LowestScoreMatch2.this.startDate);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "LowestScoreMatch2{__typename=" + this.__typename + ", matchString=" + this.matchString + ", matchName=" + this.matchName + ", matchStatusStr=" + this.matchStatusStr + ", scoreStr=" + this.scoreStr + ", startDate=" + this.startDate + "}";
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
            if (!(obj instanceof LowestScoreMatch2)) {
                return false;
            }
            LowestScoreMatch2 lowestScoreMatch2 = (LowestScoreMatch2) obj;
            if (this.__typename.equals(lowestScoreMatch2.__typename) && ((str = this.matchString) != null ? str.equals(lowestScoreMatch2.matchString) : lowestScoreMatch2.matchString == null) && ((str2 = this.matchName) != null ? str2.equals(lowestScoreMatch2.matchName) : lowestScoreMatch2.matchName == null) && ((str3 = this.matchStatusStr) != null ? str3.equals(lowestScoreMatch2.matchStatusStr) : lowestScoreMatch2.matchStatusStr == null) && ((str4 = this.scoreStr) != null ? str4.equals(lowestScoreMatch2.scoreStr) : lowestScoreMatch2.scoreStr == null)) {
                String str5 = this.startDate;
                String str6 = lowestScoreMatch2.startDate;
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
                String str = this.matchString;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.matchName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.matchStatusStr;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.scoreStr;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.startDate;
                if (str5 != null) {
                    i = str5.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<LowestScoreMatch2> {
            @Override
            public LowestScoreMatch2 map(ResponseReader responseReader) {
                return new LowestScoreMatch2(responseReader.readString(LowestScoreMatch2.$responseFields[0]), responseReader.readString(LowestScoreMatch2.$responseFields[1]), responseReader.readString(LowestScoreMatch2.$responseFields[2]), responseReader.readString(LowestScoreMatch2.$responseFields[3]), responseReader.readString(LowestScoreMatch2.$responseFields[4]), responseReader.readString(LowestScoreMatch2.$responseFields[5]));
            }
        }
    }
}
