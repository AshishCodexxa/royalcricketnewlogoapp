package com.gsbusiness.livecricketscoreprediction;

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
import java.util.LinkedHashMap;
import java.util.Map;

import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

public final class PlayersDetailsQuery implements Query<PlayersDetailsQuery.Data, PlayersDetailsQuery.Data, PlayersDetailsQuery.Variables> {
    public static final String OPERATION_ID = "15e738e694725973ac3eb49950c658c3f66962c50f7d722e1f0b099c901c1dde";
    public static final OperationName OPERATION_NAME = new OperationName() {

        @Override
        public String name() {
            return "playersDetails";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query playersDetails($playerID: String!) {\n  playersDetails(playerID: $playerID) {\n    __typename\n    name\n    playerID\n    birthPlace\n    dob\n    description\n    battingStyle\n    bowlingStyle\n    international {\n      __typename\n      Test {\n        __typename\n        basicdetails {\n          __typename\n          matches\n          innings\n        }\n        debutMatch {\n          __typename\n          matchID\n          date\n          against\n          againstID\n        }\n        lastMatch {\n          __typename\n          matchID\n          date\n          against\n          againstID\n        }\n        battingRecord {\n          __typename\n          notOuts\n          runs\n          ballsFaced\n          hundreds\n          fifties\n          fours\n          sixes\n          average\n          strikeRate\n          innings\n        }\n        bowlingRecord {\n          __typename\n          overs\n          wickets\n          ballsBowled\n          average\n          strikeRate\n          economyRate\n          fiveWicketHauls\n          innings\n          bestBowling\n        }\n      }\n      Odi {\n        __typename\n        basicdetails {\n          __typename\n          matches\n          innings\n        }\n        debutMatch {\n          __typename\n          matchID\n          date\n          against\n          againstID\n        }\n        lastMatch {\n          __typename\n          matchID\n          date\n          against\n          againstID\n        }\n        battingRecord {\n          __typename\n          notOuts\n          runs\n          ballsFaced\n          hundreds\n          fifties\n          fours\n          sixes\n          average\n          strikeRate\n          innings\n        }\n        bowlingRecord {\n          __typename\n          overs\n          wickets\n          ballsBowled\n          average\n          strikeRate\n          economyRate\n          fiveWicketHauls\n          innings\n          bestBowling\n        }\n      }\n      T20 {\n        __typename\n        basicdetails {\n          __typename\n          matches\n          innings\n        }\n        debutMatch {\n          __typename\n          matchID\n          date\n          against\n          againstID\n        }\n        lastMatch {\n          __typename\n          matchID\n          date\n          against\n          againstID\n        }\n        battingRecord {\n          __typename\n          notOuts\n          runs\n          ballsFaced\n          hundreds\n          fifties\n          fours\n          sixes\n          average\n          strikeRate\n          innings\n        }\n        bowlingRecord {\n          __typename\n          overs\n          wickets\n          ballsBowled\n          average\n          strikeRate\n          economyRate\n          fiveWicketHauls\n          innings\n          bestBowling\n        }\n      }\n    }\n    Ipl {\n      __typename\n      basicdetails {\n        __typename\n        matches\n        innings\n      }\n      debutMatch {\n        __typename\n        matchID\n        date\n        against\n        againstID\n      }\n      lastMatch {\n        __typename\n        matchID\n        date\n        against\n        againstID\n      }\n      battingRecord {\n        __typename\n        notOuts\n        runs\n        ballsFaced\n        hundreds\n        fifties\n        fours\n        sixes\n        average\n        strikeRate\n        innings\n      }\n      bowlingRecord {\n        __typename\n        overs\n        wickets\n        ballsBowled\n        average\n        strikeRate\n        economyRate\n        fiveWicketHauls\n        innings\n        bestBowling\n      }\n    }\n    role\n    fullName\n  }\n}");
    private final Variables variables;

    @Override
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public PlayersDetailsQuery(String str) {
        Utils.checkNotNull(str, "playerID == null");
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
        private String playerID;

        Builder() {
        }

        public Builder playerID(String str) {
            this.playerID = str;
            return this;
        }

        public PlayersDetailsQuery build() {
            Utils.checkNotNull(this.playerID, "playerID == null");
            return new PlayersDetailsQuery(this.playerID);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String playerID;
        private final transient Map<String, Object> valueMap;

        Variables(String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.playerID = str;
            linkedHashMap.put("playerID", str);
        }

        public String playerID() {
            return this.playerID;
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
                    inputFieldWriter.writeString("playerID", Variables.this.playerID);
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("playersDetails", "playersDetails", new UnmodifiableMapBuilder(1).put("playerID", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "playerID").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final PlayersDetails playersDetails;

        public Data(PlayersDetails playersDetails2) {
            this.playersDetails = playersDetails2;
        }

        public PlayersDetails playersDetails() {
            return this.playersDetails;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.playersDetails != null ? Data.this.playersDetails.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{playersDetails=" + this.playersDetails + "}";
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
            PlayersDetails playersDetails2 = this.playersDetails;
            PlayersDetails playersDetails3 = ((Data) obj).playersDetails;
            if (playersDetails2 != null) {
                return playersDetails2.equals(playersDetails3);
            }
            if (playersDetails3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                PlayersDetails playersDetails2 = this.playersDetails;
                this.$hashCode = 1000003 ^ (playersDetails2 == null ? 0 : playersDetails2.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final PlayersDetails.Mapper playersDetailsFieldMapper = new PlayersDetails.Mapper();

            @Override
            public Data map(ResponseReader responseReader) {
                return new Data((PlayersDetails) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<PlayersDetails>() {

                    @Override
                    public PlayersDetails read(ResponseReader responseReader) {
                        return Mapper.this.playersDetailsFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class PlayersDetails {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, null, true, Collections.emptyList()), ResponseField.forString("playerID", "playerID", null, true, Collections.emptyList()), ResponseField.forString("birthPlace", "birthPlace", null, true, Collections.emptyList()), ResponseField.forString("dob", "dob", null, true, Collections.emptyList()), ResponseField.forString("description", "description", null, true, Collections.emptyList()), ResponseField.forString("battingStyle", "battingStyle", null, true, Collections.emptyList()), ResponseField.forString("bowlingStyle", "bowlingStyle", null, true, Collections.emptyList()), ResponseField.forObject("international", "international", null, true, Collections.emptyList()), ResponseField.forObject("Ipl", "Ipl", null, true, Collections.emptyList()), ResponseField.forString("role", "role", null, true, Collections.emptyList()), ResponseField.forString("fullName", "fullName", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final C6692Ipl Ipl;
        final String __typename;
        final String battingStyle;
        final String birthPlace;
        final String bowlingStyle;
        final String description;
        final String dob;
        final String fullName;
        final International international;
        final String name;
        final String playerID;
        final String role;

        public PlayersDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, International international2, C6692Ipl ipl, String str9, String str10) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.name = str2;
            this.playerID = str3;
            this.birthPlace = str4;
            this.dob = str5;
            this.description = str6;
            this.battingStyle = str7;
            this.bowlingStyle = str8;
            this.international = international2;
            this.Ipl = ipl;
            this.role = str9;
            this.fullName = str10;
        }

        public String __typename() {
            return this.__typename;
        }

        public String name() {
            return this.name;
        }

        public String playerID() {
            return this.playerID;
        }

        public String birthPlace() {
            return this.birthPlace;
        }

        public String dob() {
            return this.dob;
        }

        public String description() {
            return this.description;
        }

        public String battingStyle() {
            return this.battingStyle;
        }

        public String bowlingStyle() {
            return this.bowlingStyle;
        }

        public International international() {
            return this.international;
        }

        public C6692Ipl Ipl() {
            return this.Ipl;
        }

        public String role() {
            return this.role;
        }

        public String fullName() {
            return this.fullName;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(PlayersDetails.$responseFields[0], PlayersDetails.this.__typename);
                    responseWriter.writeString(PlayersDetails.$responseFields[1], PlayersDetails.this.name);
                    responseWriter.writeString(PlayersDetails.$responseFields[2], PlayersDetails.this.playerID);
                    responseWriter.writeString(PlayersDetails.$responseFields[3], PlayersDetails.this.birthPlace);
                    responseWriter.writeString(PlayersDetails.$responseFields[4], PlayersDetails.this.dob);
                    responseWriter.writeString(PlayersDetails.$responseFields[5], PlayersDetails.this.description);
                    responseWriter.writeString(PlayersDetails.$responseFields[6], PlayersDetails.this.battingStyle);
                    responseWriter.writeString(PlayersDetails.$responseFields[7], PlayersDetails.this.bowlingStyle);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(PlayersDetails.$responseFields[8], PlayersDetails.this.international != null ? PlayersDetails.this.international.marshaller() : null);
                    ResponseField responseField = PlayersDetails.$responseFields[9];
                    if (PlayersDetails.this.Ipl != null) {
                        responseFieldMarshaller = PlayersDetails.this.Ipl.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                    responseWriter.writeString(PlayersDetails.$responseFields[10], PlayersDetails.this.role);
                    responseWriter.writeString(PlayersDetails.$responseFields[11], PlayersDetails.this.fullName);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "PlayersDetails{__typename=" + this.__typename + ", name=" + this.name + ", playerID=" + this.playerID + ", birthPlace=" + this.birthPlace + ", dob=" + this.dob + ", description=" + this.description + ", battingStyle=" + this.battingStyle + ", bowlingStyle=" + this.bowlingStyle + ", international=" + this.international + ", Ipl=" + this.Ipl + ", role=" + this.role + ", fullName=" + this.fullName + "}";
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
            International international2;
            C6692Ipl ipl;
            String str8;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayersDetails)) {
                return false;
            }
            PlayersDetails playersDetails = (PlayersDetails) obj;
            if (this.__typename.equals(playersDetails.__typename) && ((str = this.name) != null ? str.equals(playersDetails.name) : playersDetails.name == null) && ((str2 = this.playerID) != null ? str2.equals(playersDetails.playerID) : playersDetails.playerID == null) && ((str3 = this.birthPlace) != null ? str3.equals(playersDetails.birthPlace) : playersDetails.birthPlace == null) && ((str4 = this.dob) != null ? str4.equals(playersDetails.dob) : playersDetails.dob == null) && ((str5 = this.description) != null ? str5.equals(playersDetails.description) : playersDetails.description == null) && ((str6 = this.battingStyle) != null ? str6.equals(playersDetails.battingStyle) : playersDetails.battingStyle == null) && ((str7 = this.bowlingStyle) != null ? str7.equals(playersDetails.bowlingStyle) : playersDetails.bowlingStyle == null) && ((international2 = this.international) != null ? international2.equals(playersDetails.international) : playersDetails.international == null) && ((ipl = this.Ipl) != null ? ipl.equals(playersDetails.Ipl) : playersDetails.Ipl == null) && ((str8 = this.role) != null ? str8.equals(playersDetails.role) : playersDetails.role == null)) {
                String str9 = this.fullName;
                String str10 = playersDetails.fullName;
                if (str9 == null) {
                    if (str10 == null) {
                        return true;
                    }
                } else if (str9.equals(str10)) {
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
                String str2 = this.playerID;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.birthPlace;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.dob;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.description;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.battingStyle;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.bowlingStyle;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                International international2 = this.international;
                int hashCode9 = (hashCode8 ^ (international2 == null ? 0 : international2.hashCode())) * 1000003;
                C6692Ipl ipl = this.Ipl;
                int hashCode10 = (hashCode9 ^ (ipl == null ? 0 : ipl.hashCode())) * 1000003;
                String str8 = this.role;
                int hashCode11 = (hashCode10 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.fullName;
                if (str9 != null) {
                    i = str9.hashCode();
                }
                this.$hashCode = hashCode11 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<PlayersDetails> {
            final International.Mapper internationalFieldMapper = new International.Mapper();
            final C6692Ipl.Mapper iplFieldMapper = new C6692Ipl.Mapper();

            @Override
            public PlayersDetails map(ResponseReader responseReader) {
                return new PlayersDetails(responseReader.readString(PlayersDetails.$responseFields[0]), responseReader.readString(PlayersDetails.$responseFields[1]), responseReader.readString(PlayersDetails.$responseFields[2]), responseReader.readString(PlayersDetails.$responseFields[3]), responseReader.readString(PlayersDetails.$responseFields[4]), responseReader.readString(PlayersDetails.$responseFields[5]), responseReader.readString(PlayersDetails.$responseFields[6]), responseReader.readString(PlayersDetails.$responseFields[7]), (International) responseReader.readObject(PlayersDetails.$responseFields[8], new ResponseReader.ObjectReader<International>() {

                    @Override
                    public International read(ResponseReader responseReader) {
                        return Mapper.this.internationalFieldMapper.map(responseReader);
                    }
                }), (C6692Ipl) responseReader.readObject(PlayersDetails.$responseFields[9], new ResponseReader.ObjectReader<C6692Ipl>() {

                    @Override
                    public C6692Ipl read(ResponseReader responseReader) {
                        return Mapper.this.iplFieldMapper.map(responseReader);
                    }
                }), responseReader.readString(PlayersDetails.$responseFields[10]), responseReader.readString(PlayersDetails.$responseFields[11]));
            }
        }
    }

    public static class International {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forObject("Test", "Test", null, true, Collections.emptyList()), ResponseField.forObject("Odi", "Odi", null, true, Collections.emptyList()), ResponseField.forObject("T20", "T20", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final Odi Odi;
        final T20 T20;
        final Test Test;
        final String __typename;

        public International(String str, Test test, Odi odi, T20 t20) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.Test = test;
            this.Odi = odi;
            this.T20 = t20;
        }

        public String __typename() {
            return this.__typename;
        }

        public Test Test() {
            return this.Test;
        }

        public Odi Odi() {
            return this.Odi;
        }

        public T20 T20() {
            return this.T20;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(International.$responseFields[0], International.this.__typename);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(International.$responseFields[1], International.this.Test != null ? International.this.Test.marshaller() : null);
                    responseWriter.writeObject(International.$responseFields[2], International.this.Odi != null ? International.this.Odi.marshaller() : null);
                    ResponseField responseField = International.$responseFields[3];
                    if (International.this.T20 != null) {
                        responseFieldMarshaller = International.this.T20.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "International{__typename=" + this.__typename + ", Test=" + this.Test + ", Odi=" + this.Odi + ", T20=" + this.T20 + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Test test;
            Odi odi;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof International)) {
                return false;
            }
            International international = (International) obj;
            if (this.__typename.equals(international.__typename) && ((test = this.Test) != null ? test.equals(international.Test) : international.Test == null) && ((odi = this.Odi) != null ? odi.equals(international.Odi) : international.Odi == null)) {
                T20 t20 = this.T20;
                T20 t202 = international.T20;
                if (t20 == null) {
                    if (t202 == null) {
                        return true;
                    }
                } else if (t20.equals(t202)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Test test = this.Test;
                int i = 0;
                int hashCode2 = (hashCode ^ (test == null ? 0 : test.hashCode())) * 1000003;
                Odi odi = this.Odi;
                int hashCode3 = (hashCode2 ^ (odi == null ? 0 : odi.hashCode())) * 1000003;
                T20 t20 = this.T20;
                if (t20 != null) {
                    i = t20.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<International> {
            final Odi.Mapper odiFieldMapper = new Odi.Mapper();
            final T20.Mapper t20FieldMapper = new T20.Mapper();
            final Test.Mapper testFieldMapper = new Test.Mapper();

            @Override
            public International map(ResponseReader responseReader) {
                return new International(responseReader.readString(International.$responseFields[0]), (Test) responseReader.readObject(International.$responseFields[1], new ResponseReader.ObjectReader<Test>() {

                    @Override
                    public Test read(ResponseReader responseReader) {
                        return Mapper.this.testFieldMapper.map(responseReader);
                    }
                }), (Odi) responseReader.readObject(International.$responseFields[2], new ResponseReader.ObjectReader<Odi>() {

                    @Override
                    public Odi read(ResponseReader responseReader) {
                        return Mapper.this.odiFieldMapper.map(responseReader);
                    }
                }), (T20) responseReader.readObject(International.$responseFields[3], new ResponseReader.ObjectReader<T20>() {

                    @Override
                    public T20 read(ResponseReader responseReader) {
                        return Mapper.this.t20FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class Test {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forObject("basicdetails", "basicdetails", null, true, Collections.emptyList()), ResponseField.forObject("debutMatch", "debutMatch", null, true, Collections.emptyList()), ResponseField.forObject("lastMatch", "lastMatch", null, true, Collections.emptyList()), ResponseField.forObject("battingRecord", "battingRecord", null, true, Collections.emptyList()), ResponseField.forObject("bowlingRecord", "bowlingRecord", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Basicdetails basicdetails;
        final BattingRecord battingRecord;
        final BowlingRecord bowlingRecord;
        final DebutMatch debutMatch;
        final LastMatch lastMatch;

        public Test(String str, Basicdetails basicdetails2, DebutMatch debutMatch2, LastMatch lastMatch2, BattingRecord battingRecord2, BowlingRecord bowlingRecord2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.basicdetails = basicdetails2;
            this.debutMatch = debutMatch2;
            this.lastMatch = lastMatch2;
            this.battingRecord = battingRecord2;
            this.bowlingRecord = bowlingRecord2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Basicdetails basicdetails() {
            return this.basicdetails;
        }

        public DebutMatch debutMatch() {
            return this.debutMatch;
        }

        public LastMatch lastMatch() {
            return this.lastMatch;
        }

        public BattingRecord battingRecord() {
            return this.battingRecord;
        }

        public BowlingRecord bowlingRecord() {
            return this.bowlingRecord;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Test.$responseFields[0], Test.this.__typename);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(Test.$responseFields[1], Test.this.basicdetails != null ? Test.this.basicdetails.marshaller() : null);
                    responseWriter.writeObject(Test.$responseFields[2], Test.this.debutMatch != null ? Test.this.debutMatch.marshaller() : null);
                    responseWriter.writeObject(Test.$responseFields[3], Test.this.lastMatch != null ? Test.this.lastMatch.marshaller() : null);
                    responseWriter.writeObject(Test.$responseFields[4], Test.this.battingRecord != null ? Test.this.battingRecord.marshaller() : null);
                    ResponseField responseField = Test.$responseFields[5];
                    if (Test.this.bowlingRecord != null) {
                        responseFieldMarshaller = Test.this.bowlingRecord.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Test{__typename=" + this.__typename + ", basicdetails=" + this.basicdetails + ", debutMatch=" + this.debutMatch + ", lastMatch=" + this.lastMatch + ", battingRecord=" + this.battingRecord + ", bowlingRecord=" + this.bowlingRecord + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Basicdetails basicdetails2;
            DebutMatch debutMatch2;
            LastMatch lastMatch2;
            BattingRecord battingRecord2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Test)) {
                return false;
            }
            Test test = (Test) obj;
            if (this.__typename.equals(test.__typename) && ((basicdetails2 = this.basicdetails) != null ? basicdetails2.equals(test.basicdetails) : test.basicdetails == null) && ((debutMatch2 = this.debutMatch) != null ? debutMatch2.equals(test.debutMatch) : test.debutMatch == null) && ((lastMatch2 = this.lastMatch) != null ? lastMatch2.equals(test.lastMatch) : test.lastMatch == null) && ((battingRecord2 = this.battingRecord) != null ? battingRecord2.equals(test.battingRecord) : test.battingRecord == null)) {
                BowlingRecord bowlingRecord2 = this.bowlingRecord;
                BowlingRecord bowlingRecord3 = test.bowlingRecord;
                if (bowlingRecord2 == null) {
                    if (bowlingRecord3 == null) {
                        return true;
                    }
                } else if (bowlingRecord2.equals(bowlingRecord3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Basicdetails basicdetails2 = this.basicdetails;
                int i = 0;
                int hashCode2 = (hashCode ^ (basicdetails2 == null ? 0 : basicdetails2.hashCode())) * 1000003;
                DebutMatch debutMatch2 = this.debutMatch;
                int hashCode3 = (hashCode2 ^ (debutMatch2 == null ? 0 : debutMatch2.hashCode())) * 1000003;
                LastMatch lastMatch2 = this.lastMatch;
                int hashCode4 = (hashCode3 ^ (lastMatch2 == null ? 0 : lastMatch2.hashCode())) * 1000003;
                BattingRecord battingRecord2 = this.battingRecord;
                int hashCode5 = (hashCode4 ^ (battingRecord2 == null ? 0 : battingRecord2.hashCode())) * 1000003;
                BowlingRecord bowlingRecord2 = this.bowlingRecord;
                if (bowlingRecord2 != null) {
                    i = bowlingRecord2.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Test> {
            final Basicdetails.Mapper basicdetailsFieldMapper = new Basicdetails.Mapper();
            final BattingRecord.Mapper battingRecordFieldMapper = new BattingRecord.Mapper();
            final BowlingRecord.Mapper bowlingRecordFieldMapper = new BowlingRecord.Mapper();
            final DebutMatch.Mapper debutMatchFieldMapper = new DebutMatch.Mapper();
            final LastMatch.Mapper lastMatchFieldMapper = new LastMatch.Mapper();

            @Override
            public Test map(ResponseReader responseReader) {
                return new Test(responseReader.readString(Test.$responseFields[0]), (Basicdetails) responseReader.readObject(Test.$responseFields[1], new ResponseReader.ObjectReader<Basicdetails>() {

                    @Override
                    public Basicdetails read(ResponseReader responseReader) {
                        return Mapper.this.basicdetailsFieldMapper.map(responseReader);
                    }
                }), (DebutMatch) responseReader.readObject(Test.$responseFields[2], new ResponseReader.ObjectReader<DebutMatch>() {

                    @Override
                    public DebutMatch read(ResponseReader responseReader) {
                        return Mapper.this.debutMatchFieldMapper.map(responseReader);
                    }
                }), (LastMatch) responseReader.readObject(Test.$responseFields[3], new ResponseReader.ObjectReader<LastMatch>() {

                    @Override
                    public LastMatch read(ResponseReader responseReader) {
                        return Mapper.this.lastMatchFieldMapper.map(responseReader);
                    }
                }), (BattingRecord) responseReader.readObject(Test.$responseFields[4], new ResponseReader.ObjectReader<BattingRecord>() {

                    @Override
                    public BattingRecord read(ResponseReader responseReader) {
                        return Mapper.this.battingRecordFieldMapper.map(responseReader);
                    }
                }), (BowlingRecord) responseReader.readObject(Test.$responseFields[5], new ResponseReader.ObjectReader<BowlingRecord>() {

                    @Override
                    public BowlingRecord read(ResponseReader responseReader) {
                        return Mapper.this.bowlingRecordFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class Basicdetails {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matches", "matches", null, true, Collections.emptyList()), ResponseField.forString("innings", "innings", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String innings;
        final String matches;

        public Basicdetails(String str, String str2, String str3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matches = str2;
            this.innings = str3;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matches() {
            return this.matches;
        }

        public String innings() {
            return this.innings;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Basicdetails.$responseFields[0], Basicdetails.this.__typename);
                    responseWriter.writeString(Basicdetails.$responseFields[1], Basicdetails.this.matches);
                    responseWriter.writeString(Basicdetails.$responseFields[2], Basicdetails.this.innings);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Basicdetails{__typename=" + this.__typename + ", matches=" + this.matches + ", innings=" + this.innings + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Basicdetails)) {
                return false;
            }
            Basicdetails basicdetails = (Basicdetails) obj;
            if (this.__typename.equals(basicdetails.__typename) && ((str = this.matches) != null ? str.equals(basicdetails.matches) : basicdetails.matches == null)) {
                String str2 = this.innings;
                String str3 = basicdetails.innings;
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
                String str = this.matches;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.innings;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Basicdetails> {
            @Override
            public Basicdetails map(ResponseReader responseReader) {
                return new Basicdetails(responseReader.readString(Basicdetails.$responseFields[0]), responseReader.readString(Basicdetails.$responseFields[1]), responseReader.readString(Basicdetails.$responseFields[2]));
            }
        }
    }

    public static class DebutMatch {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchID", "matchID", null, true, Collections.emptyList()), ResponseField.forString("date", "date", null, true, Collections.emptyList()), ResponseField.forString("against", "against", null, true, Collections.emptyList()), ResponseField.forString("againstID", "againstID", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String against;
        final String againstID;
        final String date;
        final String matchID;

        public DebutMatch(String str, String str2, String str3, String str4, String str5) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchID = str2;
            this.date = str3;
            this.against = str4;
            this.againstID = str5;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchID() {
            return this.matchID;
        }

        public String date() {
            return this.date;
        }

        public String against() {
            return this.against;
        }

        public String againstID() {
            return this.againstID;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(DebutMatch.$responseFields[0], DebutMatch.this.__typename);
                    responseWriter.writeString(DebutMatch.$responseFields[1], DebutMatch.this.matchID);
                    responseWriter.writeString(DebutMatch.$responseFields[2], DebutMatch.this.date);
                    responseWriter.writeString(DebutMatch.$responseFields[3], DebutMatch.this.against);
                    responseWriter.writeString(DebutMatch.$responseFields[4], DebutMatch.this.againstID);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "DebutMatch{__typename=" + this.__typename + ", matchID=" + this.matchID + ", date=" + this.date + ", against=" + this.against + ", againstID=" + this.againstID + "}";
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
            if (!(obj instanceof DebutMatch)) {
                return false;
            }
            DebutMatch debutMatch = (DebutMatch) obj;
            if (this.__typename.equals(debutMatch.__typename) && ((str = this.matchID) != null ? str.equals(debutMatch.matchID) : debutMatch.matchID == null) && ((str2 = this.date) != null ? str2.equals(debutMatch.date) : debutMatch.date == null) && ((str3 = this.against) != null ? str3.equals(debutMatch.against) : debutMatch.against == null)) {
                String str4 = this.againstID;
                String str5 = debutMatch.againstID;
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
                String str = this.matchID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.date;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.against;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.againstID;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<DebutMatch> {
            @Override
            public DebutMatch map(ResponseReader responseReader) {
                return new DebutMatch(responseReader.readString(DebutMatch.$responseFields[0]), responseReader.readString(DebutMatch.$responseFields[1]), responseReader.readString(DebutMatch.$responseFields[2]), responseReader.readString(DebutMatch.$responseFields[3]), responseReader.readString(DebutMatch.$responseFields[4]));
            }
        }
    }

    public static class LastMatch {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchID", "matchID", null, true, Collections.emptyList()), ResponseField.forString("date", "date", null, true, Collections.emptyList()), ResponseField.forString("against", "against", null, true, Collections.emptyList()), ResponseField.forString("againstID", "againstID", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String against;
        final String againstID;
        final String date;
        final String matchID;

        public LastMatch(String str, String str2, String str3, String str4, String str5) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchID = str2;
            this.date = str3;
            this.against = str4;
            this.againstID = str5;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchID() {
            return this.matchID;
        }

        public String date() {
            return this.date;
        }

        public String against() {
            return this.against;
        }

        public String againstID() {
            return this.againstID;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(LastMatch.$responseFields[0], LastMatch.this.__typename);
                    responseWriter.writeString(LastMatch.$responseFields[1], LastMatch.this.matchID);
                    responseWriter.writeString(LastMatch.$responseFields[2], LastMatch.this.date);
                    responseWriter.writeString(LastMatch.$responseFields[3], LastMatch.this.against);
                    responseWriter.writeString(LastMatch.$responseFields[4], LastMatch.this.againstID);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "LastMatch{__typename=" + this.__typename + ", matchID=" + this.matchID + ", date=" + this.date + ", against=" + this.against + ", againstID=" + this.againstID + "}";
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
            if (!(obj instanceof LastMatch)) {
                return false;
            }
            LastMatch lastMatch = (LastMatch) obj;
            if (this.__typename.equals(lastMatch.__typename) && ((str = this.matchID) != null ? str.equals(lastMatch.matchID) : lastMatch.matchID == null) && ((str2 = this.date) != null ? str2.equals(lastMatch.date) : lastMatch.date == null) && ((str3 = this.against) != null ? str3.equals(lastMatch.against) : lastMatch.against == null)) {
                String str4 = this.againstID;
                String str5 = lastMatch.againstID;
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
                String str = this.matchID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.date;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.against;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.againstID;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<LastMatch> {
            @Override
            public LastMatch map(ResponseReader responseReader) {
                return new LastMatch(responseReader.readString(LastMatch.$responseFields[0]), responseReader.readString(LastMatch.$responseFields[1]), responseReader.readString(LastMatch.$responseFields[2]), responseReader.readString(LastMatch.$responseFields[3]), responseReader.readString(LastMatch.$responseFields[4]));
            }
        }
    }

    public static class BattingRecord {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("notOuts", "notOuts", null, true, Collections.emptyList()), ResponseField.forString("runs", "runs", null, true, Collections.emptyList()), ResponseField.forString("ballsFaced", "ballsFaced", null, true, Collections.emptyList()), ResponseField.forString("hundreds", "hundreds", null, true, Collections.emptyList()), ResponseField.forString("fifties", "fifties", null, true, Collections.emptyList()), ResponseField.forString("fours", "fours", null, true, Collections.emptyList()), ResponseField.forString("sixes", "sixes", null, true, Collections.emptyList()), ResponseField.forString("average", "average", null, true, Collections.emptyList()), ResponseField.forString("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forString("innings", "innings", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String average;
        final String ballsFaced;
        final String fifties;
        final String fours;
        final String hundreds;
        final String innings;
        final String notOuts;
        final String runs;
        final String sixes;
        final String strikeRate;

        public BattingRecord(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.notOuts = str2;
            this.runs = str3;
            this.ballsFaced = str4;
            this.hundreds = str5;
            this.fifties = str6;
            this.fours = str7;
            this.sixes = str8;
            this.average = str9;
            this.strikeRate = str10;
            this.innings = str11;
        }

        public String __typename() {
            return this.__typename;
        }

        public String notOuts() {
            return this.notOuts;
        }

        public String runs() {
            return this.runs;
        }

        public String ballsFaced() {
            return this.ballsFaced;
        }

        public String hundreds() {
            return this.hundreds;
        }

        public String fifties() {
            return this.fifties;
        }

        public String fours() {
            return this.fours;
        }

        public String sixes() {
            return this.sixes;
        }

        public String average() {
            return this.average;
        }

        public String strikeRate() {
            return this.strikeRate;
        }

        public String innings() {
            return this.innings;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BattingRecord.$responseFields[0], BattingRecord.this.__typename);
                    responseWriter.writeString(BattingRecord.$responseFields[1], BattingRecord.this.notOuts);
                    responseWriter.writeString(BattingRecord.$responseFields[2], BattingRecord.this.runs);
                    responseWriter.writeString(BattingRecord.$responseFields[3], BattingRecord.this.ballsFaced);
                    responseWriter.writeString(BattingRecord.$responseFields[4], BattingRecord.this.hundreds);
                    responseWriter.writeString(BattingRecord.$responseFields[5], BattingRecord.this.fifties);
                    responseWriter.writeString(BattingRecord.$responseFields[6], BattingRecord.this.fours);
                    responseWriter.writeString(BattingRecord.$responseFields[7], BattingRecord.this.sixes);
                    responseWriter.writeString(BattingRecord.$responseFields[8], BattingRecord.this.average);
                    responseWriter.writeString(BattingRecord.$responseFields[9], BattingRecord.this.strikeRate);
                    responseWriter.writeString(BattingRecord.$responseFields[10], BattingRecord.this.innings);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BattingRecord{__typename=" + this.__typename + ", notOuts=" + this.notOuts + ", runs=" + this.runs + ", ballsFaced=" + this.ballsFaced + ", hundreds=" + this.hundreds + ", fifties=" + this.fifties + ", fours=" + this.fours + ", sixes=" + this.sixes + ", average=" + this.average + ", strikeRate=" + this.strikeRate + ", innings=" + this.innings + "}";
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
            if (!(obj instanceof BattingRecord)) {
                return false;
            }
            BattingRecord battingRecord = (BattingRecord) obj;
            if (this.__typename.equals(battingRecord.__typename) && ((str = this.notOuts) != null ? str.equals(battingRecord.notOuts) : battingRecord.notOuts == null) && ((str2 = this.runs) != null ? str2.equals(battingRecord.runs) : battingRecord.runs == null) && ((str3 = this.ballsFaced) != null ? str3.equals(battingRecord.ballsFaced) : battingRecord.ballsFaced == null) && ((str4 = this.hundreds) != null ? str4.equals(battingRecord.hundreds) : battingRecord.hundreds == null) && ((str5 = this.fifties) != null ? str5.equals(battingRecord.fifties) : battingRecord.fifties == null) && ((str6 = this.fours) != null ? str6.equals(battingRecord.fours) : battingRecord.fours == null) && ((str7 = this.sixes) != null ? str7.equals(battingRecord.sixes) : battingRecord.sixes == null) && ((str8 = this.average) != null ? str8.equals(battingRecord.average) : battingRecord.average == null) && ((str9 = this.strikeRate) != null ? str9.equals(battingRecord.strikeRate) : battingRecord.strikeRate == null)) {
                String str10 = this.innings;
                String str11 = battingRecord.innings;
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
                String str = this.notOuts;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.runs;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.ballsFaced;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.hundreds;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.fifties;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.fours;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.sixes;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.average;
                int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.strikeRate;
                int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.innings;
                if (str10 != null) {
                    i = str10.hashCode();
                }
                this.$hashCode = hashCode10 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BattingRecord> {
            @Override
            public BattingRecord map(ResponseReader responseReader) {
                return new BattingRecord(responseReader.readString(BattingRecord.$responseFields[0]), responseReader.readString(BattingRecord.$responseFields[1]), responseReader.readString(BattingRecord.$responseFields[2]), responseReader.readString(BattingRecord.$responseFields[3]), responseReader.readString(BattingRecord.$responseFields[4]), responseReader.readString(BattingRecord.$responseFields[5]), responseReader.readString(BattingRecord.$responseFields[6]), responseReader.readString(BattingRecord.$responseFields[7]), responseReader.readString(BattingRecord.$responseFields[8]), responseReader.readString(BattingRecord.$responseFields[9]), responseReader.readString(BattingRecord.$responseFields[10]));
            }
        }
    }

    public static class BowlingRecord {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("overs", "overs", null, true, Collections.emptyList()), ResponseField.forString("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forString("ballsBowled", "ballsBowled", null, true, Collections.emptyList()), ResponseField.forString("average", "average", null, true, Collections.emptyList()), ResponseField.forString("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forString("economyRate", "economyRate", null, true, Collections.emptyList()), ResponseField.forString("fiveWicketHauls", "fiveWicketHauls", null, true, Collections.emptyList()), ResponseField.forString("innings", "innings", null, true, Collections.emptyList()), ResponseField.forString("bestBowling", "bestBowling", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String average;
        final String ballsBowled;
        final String bestBowling;
        final String economyRate;
        final String fiveWicketHauls;
        final String innings;
        final String overs;
        final String strikeRate;
        final String wickets;

        public BowlingRecord(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.overs = str2;
            this.wickets = str3;
            this.ballsBowled = str4;
            this.average = str5;
            this.strikeRate = str6;
            this.economyRate = str7;
            this.fiveWicketHauls = str8;
            this.innings = str9;
            this.bestBowling = str10;
        }

        public String __typename() {
            return this.__typename;
        }

        public String overs() {
            return this.overs;
        }

        public String wickets() {
            return this.wickets;
        }

        public String ballsBowled() {
            return this.ballsBowled;
        }

        public String average() {
            return this.average;
        }

        public String strikeRate() {
            return this.strikeRate;
        }

        public String economyRate() {
            return this.economyRate;
        }

        public String fiveWicketHauls() {
            return this.fiveWicketHauls;
        }

        public String innings() {
            return this.innings;
        }

        public String bestBowling() {
            return this.bestBowling;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlingRecord.$responseFields[0], BowlingRecord.this.__typename);
                    responseWriter.writeString(BowlingRecord.$responseFields[1], BowlingRecord.this.overs);
                    responseWriter.writeString(BowlingRecord.$responseFields[2], BowlingRecord.this.wickets);
                    responseWriter.writeString(BowlingRecord.$responseFields[3], BowlingRecord.this.ballsBowled);
                    responseWriter.writeString(BowlingRecord.$responseFields[4], BowlingRecord.this.average);
                    responseWriter.writeString(BowlingRecord.$responseFields[5], BowlingRecord.this.strikeRate);
                    responseWriter.writeString(BowlingRecord.$responseFields[6], BowlingRecord.this.economyRate);
                    responseWriter.writeString(BowlingRecord.$responseFields[7], BowlingRecord.this.fiveWicketHauls);
                    responseWriter.writeString(BowlingRecord.$responseFields[8], BowlingRecord.this.innings);
                    responseWriter.writeString(BowlingRecord.$responseFields[9], BowlingRecord.this.bestBowling);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlingRecord{__typename=" + this.__typename + ", overs=" + this.overs + ", wickets=" + this.wickets + ", ballsBowled=" + this.ballsBowled + ", average=" + this.average + ", strikeRate=" + this.strikeRate + ", economyRate=" + this.economyRate + ", fiveWicketHauls=" + this.fiveWicketHauls + ", innings=" + this.innings + ", bestBowling=" + this.bestBowling + "}";
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
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlingRecord)) {
                return false;
            }
            BowlingRecord bowlingRecord = (BowlingRecord) obj;
            if (this.__typename.equals(bowlingRecord.__typename) && ((str = this.overs) != null ? str.equals(bowlingRecord.overs) : bowlingRecord.overs == null) && ((str2 = this.wickets) != null ? str2.equals(bowlingRecord.wickets) : bowlingRecord.wickets == null) && ((str3 = this.ballsBowled) != null ? str3.equals(bowlingRecord.ballsBowled) : bowlingRecord.ballsBowled == null) && ((str4 = this.average) != null ? str4.equals(bowlingRecord.average) : bowlingRecord.average == null) && ((str5 = this.strikeRate) != null ? str5.equals(bowlingRecord.strikeRate) : bowlingRecord.strikeRate == null) && ((str6 = this.economyRate) != null ? str6.equals(bowlingRecord.economyRate) : bowlingRecord.economyRate == null) && ((str7 = this.fiveWicketHauls) != null ? str7.equals(bowlingRecord.fiveWicketHauls) : bowlingRecord.fiveWicketHauls == null) && ((str8 = this.innings) != null ? str8.equals(bowlingRecord.innings) : bowlingRecord.innings == null)) {
                String str9 = this.bestBowling;
                String str10 = bowlingRecord.bestBowling;
                if (str9 == null) {
                    if (str10 == null) {
                        return true;
                    }
                } else if (str9.equals(str10)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.overs;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.wickets;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.ballsBowled;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.average;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.strikeRate;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.economyRate;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.fiveWicketHauls;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.innings;
                int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.bestBowling;
                if (str9 != null) {
                    i = str9.hashCode();
                }
                this.$hashCode = hashCode9 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlingRecord> {
            @Override
            public BowlingRecord map(ResponseReader responseReader) {
                return new BowlingRecord(responseReader.readString(BowlingRecord.$responseFields[0]), responseReader.readString(BowlingRecord.$responseFields[1]), responseReader.readString(BowlingRecord.$responseFields[2]), responseReader.readString(BowlingRecord.$responseFields[3]), responseReader.readString(BowlingRecord.$responseFields[4]), responseReader.readString(BowlingRecord.$responseFields[5]), responseReader.readString(BowlingRecord.$responseFields[6]), responseReader.readString(BowlingRecord.$responseFields[7]), responseReader.readString(BowlingRecord.$responseFields[8]), responseReader.readString(BowlingRecord.$responseFields[9]));
            }
        }
    }

    public static class Odi {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forObject("basicdetails", "basicdetails", null, true, Collections.emptyList()), ResponseField.forObject("debutMatch", "debutMatch", null, true, Collections.emptyList()), ResponseField.forObject("lastMatch", "lastMatch", null, true, Collections.emptyList()), ResponseField.forObject("battingRecord", "battingRecord", null, true, Collections.emptyList()), ResponseField.forObject("bowlingRecord", "bowlingRecord", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Basicdetails1 basicdetails;
        final BattingRecord1 battingRecord;
        final BowlingRecord1 bowlingRecord;
        final DebutMatch1 debutMatch;
        final LastMatch1 lastMatch;

        public Odi(String str, Basicdetails1 basicdetails1, DebutMatch1 debutMatch1, LastMatch1 lastMatch1, BattingRecord1 battingRecord1, BowlingRecord1 bowlingRecord1) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.basicdetails = basicdetails1;
            this.debutMatch = debutMatch1;
            this.lastMatch = lastMatch1;
            this.battingRecord = battingRecord1;
            this.bowlingRecord = bowlingRecord1;
        }

        public String __typename() {
            return this.__typename;
        }

        public Basicdetails1 basicdetails() {
            return this.basicdetails;
        }

        public DebutMatch1 debutMatch() {
            return this.debutMatch;
        }

        public LastMatch1 lastMatch() {
            return this.lastMatch;
        }

        public BattingRecord1 battingRecord() {
            return this.battingRecord;
        }

        public BowlingRecord1 bowlingRecord() {
            return this.bowlingRecord;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Odi.$responseFields[0], Odi.this.__typename);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(Odi.$responseFields[1], Odi.this.basicdetails != null ? Odi.this.basicdetails.marshaller() : null);
                    responseWriter.writeObject(Odi.$responseFields[2], Odi.this.debutMatch != null ? Odi.this.debutMatch.marshaller() : null);
                    responseWriter.writeObject(Odi.$responseFields[3], Odi.this.lastMatch != null ? Odi.this.lastMatch.marshaller() : null);
                    responseWriter.writeObject(Odi.$responseFields[4], Odi.this.battingRecord != null ? Odi.this.battingRecord.marshaller() : null);
                    ResponseField responseField = Odi.$responseFields[5];
                    if (Odi.this.bowlingRecord != null) {
                        responseFieldMarshaller = Odi.this.bowlingRecord.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Odi{__typename=" + this.__typename + ", basicdetails=" + this.basicdetails + ", debutMatch=" + this.debutMatch + ", lastMatch=" + this.lastMatch + ", battingRecord=" + this.battingRecord + ", bowlingRecord=" + this.bowlingRecord + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Basicdetails1 basicdetails1;
            DebutMatch1 debutMatch1;
            LastMatch1 lastMatch1;
            BattingRecord1 battingRecord1;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Odi)) {
                return false;
            }
            Odi odi = (Odi) obj;
            if (this.__typename.equals(odi.__typename) && ((basicdetails1 = this.basicdetails) != null ? basicdetails1.equals(odi.basicdetails) : odi.basicdetails == null) && ((debutMatch1 = this.debutMatch) != null ? debutMatch1.equals(odi.debutMatch) : odi.debutMatch == null) && ((lastMatch1 = this.lastMatch) != null ? lastMatch1.equals(odi.lastMatch) : odi.lastMatch == null) && ((battingRecord1 = this.battingRecord) != null ? battingRecord1.equals(odi.battingRecord) : odi.battingRecord == null)) {
                BowlingRecord1 bowlingRecord1 = this.bowlingRecord;
                BowlingRecord1 bowlingRecord12 = odi.bowlingRecord;
                if (bowlingRecord1 == null) {
                    if (bowlingRecord12 == null) {
                        return true;
                    }
                } else if (bowlingRecord1.equals(bowlingRecord12)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Basicdetails1 basicdetails1 = this.basicdetails;
                int i = 0;
                int hashCode2 = (hashCode ^ (basicdetails1 == null ? 0 : basicdetails1.hashCode())) * 1000003;
                DebutMatch1 debutMatch1 = this.debutMatch;
                int hashCode3 = (hashCode2 ^ (debutMatch1 == null ? 0 : debutMatch1.hashCode())) * 1000003;
                LastMatch1 lastMatch1 = this.lastMatch;
                int hashCode4 = (hashCode3 ^ (lastMatch1 == null ? 0 : lastMatch1.hashCode())) * 1000003;
                BattingRecord1 battingRecord1 = this.battingRecord;
                int hashCode5 = (hashCode4 ^ (battingRecord1 == null ? 0 : battingRecord1.hashCode())) * 1000003;
                BowlingRecord1 bowlingRecord1 = this.bowlingRecord;
                if (bowlingRecord1 != null) {
                    i = bowlingRecord1.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Odi> {
            final Basicdetails1.Mapper basicdetails1FieldMapper = new Basicdetails1.Mapper();
            final BattingRecord1.Mapper battingRecord1FieldMapper = new BattingRecord1.Mapper();
            final BowlingRecord1.Mapper bowlingRecord1FieldMapper = new BowlingRecord1.Mapper();
            final DebutMatch1.Mapper debutMatch1FieldMapper = new DebutMatch1.Mapper();
            final LastMatch1.Mapper lastMatch1FieldMapper = new LastMatch1.Mapper();

            @Override
            public Odi map(ResponseReader responseReader) {
                return new Odi(responseReader.readString(Odi.$responseFields[0]), (Basicdetails1) responseReader.readObject(Odi.$responseFields[1], new ResponseReader.ObjectReader<Basicdetails1>() {

                    @Override
                    public Basicdetails1 read(ResponseReader responseReader) {
                        return Mapper.this.basicdetails1FieldMapper.map(responseReader);
                    }
                }), (DebutMatch1) responseReader.readObject(Odi.$responseFields[2], new ResponseReader.ObjectReader<DebutMatch1>() {

                    @Override
                    public DebutMatch1 read(ResponseReader responseReader) {
                        return Mapper.this.debutMatch1FieldMapper.map(responseReader);
                    }
                }), (LastMatch1) responseReader.readObject(Odi.$responseFields[3], new ResponseReader.ObjectReader<LastMatch1>() {

                    @Override
                    public LastMatch1 read(ResponseReader responseReader) {
                        return Mapper.this.lastMatch1FieldMapper.map(responseReader);
                    }
                }), (BattingRecord1) responseReader.readObject(Odi.$responseFields[4], new ResponseReader.ObjectReader<BattingRecord1>() {

                    @Override
                    public BattingRecord1 read(ResponseReader responseReader) {
                        return Mapper.this.battingRecord1FieldMapper.map(responseReader);
                    }
                }), (BowlingRecord1) responseReader.readObject(Odi.$responseFields[5], new ResponseReader.ObjectReader<BowlingRecord1>() {

                    @Override
                    public BowlingRecord1 read(ResponseReader responseReader) {
                        return Mapper.this.bowlingRecord1FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class Basicdetails1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matches", "matches", null, true, Collections.emptyList()), ResponseField.forString("innings", "innings", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String innings;
        final String matches;

        public Basicdetails1(String str, String str2, String str3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matches = str2;
            this.innings = str3;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matches() {
            return this.matches;
        }

        public String innings() {
            return this.innings;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Basicdetails1.$responseFields[0], Basicdetails1.this.__typename);
                    responseWriter.writeString(Basicdetails1.$responseFields[1], Basicdetails1.this.matches);
                    responseWriter.writeString(Basicdetails1.$responseFields[2], Basicdetails1.this.innings);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Basicdetails1{__typename=" + this.__typename + ", matches=" + this.matches + ", innings=" + this.innings + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Basicdetails1)) {
                return false;
            }
            Basicdetails1 basicdetails1 = (Basicdetails1) obj;
            if (this.__typename.equals(basicdetails1.__typename) && ((str = this.matches) != null ? str.equals(basicdetails1.matches) : basicdetails1.matches == null)) {
                String str2 = this.innings;
                String str3 = basicdetails1.innings;
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
                String str = this.matches;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.innings;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Basicdetails1> {
            @Override
            public Basicdetails1 map(ResponseReader responseReader) {
                return new Basicdetails1(responseReader.readString(Basicdetails1.$responseFields[0]), responseReader.readString(Basicdetails1.$responseFields[1]), responseReader.readString(Basicdetails1.$responseFields[2]));
            }
        }
    }

    public static class DebutMatch1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchID", "matchID", null, true, Collections.emptyList()), ResponseField.forString("date", "date", null, true, Collections.emptyList()), ResponseField.forString("against", "against", null, true, Collections.emptyList()), ResponseField.forString("againstID", "againstID", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String against;
        final String againstID;
        final String date;
        final String matchID;

        public DebutMatch1(String str, String str2, String str3, String str4, String str5) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchID = str2;
            this.date = str3;
            this.against = str4;
            this.againstID = str5;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchID() {
            return this.matchID;
        }

        public String date() {
            return this.date;
        }

        public String against() {
            return this.against;
        }

        public String againstID() {
            return this.againstID;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(DebutMatch1.$responseFields[0], DebutMatch1.this.__typename);
                    responseWriter.writeString(DebutMatch1.$responseFields[1], DebutMatch1.this.matchID);
                    responseWriter.writeString(DebutMatch1.$responseFields[2], DebutMatch1.this.date);
                    responseWriter.writeString(DebutMatch1.$responseFields[3], DebutMatch1.this.against);
                    responseWriter.writeString(DebutMatch1.$responseFields[4], DebutMatch1.this.againstID);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "DebutMatch1{__typename=" + this.__typename + ", matchID=" + this.matchID + ", date=" + this.date + ", against=" + this.against + ", againstID=" + this.againstID + "}";
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
            if (!(obj instanceof DebutMatch1)) {
                return false;
            }
            DebutMatch1 debutMatch1 = (DebutMatch1) obj;
            if (this.__typename.equals(debutMatch1.__typename) && ((str = this.matchID) != null ? str.equals(debutMatch1.matchID) : debutMatch1.matchID == null) && ((str2 = this.date) != null ? str2.equals(debutMatch1.date) : debutMatch1.date == null) && ((str3 = this.against) != null ? str3.equals(debutMatch1.against) : debutMatch1.against == null)) {
                String str4 = this.againstID;
                String str5 = debutMatch1.againstID;
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
                String str = this.matchID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.date;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.against;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.againstID;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<DebutMatch1> {
            @Override
            public DebutMatch1 map(ResponseReader responseReader) {
                return new DebutMatch1(responseReader.readString(DebutMatch1.$responseFields[0]), responseReader.readString(DebutMatch1.$responseFields[1]), responseReader.readString(DebutMatch1.$responseFields[2]), responseReader.readString(DebutMatch1.$responseFields[3]), responseReader.readString(DebutMatch1.$responseFields[4]));
            }
        }
    }

    public static class LastMatch1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchID", "matchID", null, true, Collections.emptyList()), ResponseField.forString("date", "date", null, true, Collections.emptyList()), ResponseField.forString("against", "against", null, true, Collections.emptyList()), ResponseField.forString("againstID", "againstID", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String against;
        final String againstID;
        final String date;
        final String matchID;

        public LastMatch1(String str, String str2, String str3, String str4, String str5) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchID = str2;
            this.date = str3;
            this.against = str4;
            this.againstID = str5;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchID() {
            return this.matchID;
        }

        public String date() {
            return this.date;
        }

        public String against() {
            return this.against;
        }

        public String againstID() {
            return this.againstID;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(LastMatch1.$responseFields[0], LastMatch1.this.__typename);
                    responseWriter.writeString(LastMatch1.$responseFields[1], LastMatch1.this.matchID);
                    responseWriter.writeString(LastMatch1.$responseFields[2], LastMatch1.this.date);
                    responseWriter.writeString(LastMatch1.$responseFields[3], LastMatch1.this.against);
                    responseWriter.writeString(LastMatch1.$responseFields[4], LastMatch1.this.againstID);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "LastMatch1{__typename=" + this.__typename + ", matchID=" + this.matchID + ", date=" + this.date + ", against=" + this.against + ", againstID=" + this.againstID + "}";
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
            if (!(obj instanceof LastMatch1)) {
                return false;
            }
            LastMatch1 lastMatch1 = (LastMatch1) obj;
            if (this.__typename.equals(lastMatch1.__typename) && ((str = this.matchID) != null ? str.equals(lastMatch1.matchID) : lastMatch1.matchID == null) && ((str2 = this.date) != null ? str2.equals(lastMatch1.date) : lastMatch1.date == null) && ((str3 = this.against) != null ? str3.equals(lastMatch1.against) : lastMatch1.against == null)) {
                String str4 = this.againstID;
                String str5 = lastMatch1.againstID;
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
                String str = this.matchID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.date;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.against;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.againstID;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<LastMatch1> {
            @Override
            public LastMatch1 map(ResponseReader responseReader) {
                return new LastMatch1(responseReader.readString(LastMatch1.$responseFields[0]), responseReader.readString(LastMatch1.$responseFields[1]), responseReader.readString(LastMatch1.$responseFields[2]), responseReader.readString(LastMatch1.$responseFields[3]), responseReader.readString(LastMatch1.$responseFields[4]));
            }
        }
    }

    public static class BattingRecord1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("notOuts", "notOuts", null, true, Collections.emptyList()), ResponseField.forString("runs", "runs", null, true, Collections.emptyList()), ResponseField.forString("ballsFaced", "ballsFaced", null, true, Collections.emptyList()), ResponseField.forString("hundreds", "hundreds", null, true, Collections.emptyList()), ResponseField.forString("fifties", "fifties", null, true, Collections.emptyList()), ResponseField.forString("fours", "fours", null, true, Collections.emptyList()), ResponseField.forString("sixes", "sixes", null, true, Collections.emptyList()), ResponseField.forString("average", "average", null, true, Collections.emptyList()), ResponseField.forString("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forString("innings", "innings", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String average;
        final String ballsFaced;
        final String fifties;
        final String fours;
        final String hundreds;
        final String innings;
        final String notOuts;
        final String runs;
        final String sixes;
        final String strikeRate;

        public BattingRecord1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.notOuts = str2;
            this.runs = str3;
            this.ballsFaced = str4;
            this.hundreds = str5;
            this.fifties = str6;
            this.fours = str7;
            this.sixes = str8;
            this.average = str9;
            this.strikeRate = str10;
            this.innings = str11;
        }

        public String __typename() {
            return this.__typename;
        }

        public String notOuts() {
            return this.notOuts;
        }

        public String runs() {
            return this.runs;
        }

        public String ballsFaced() {
            return this.ballsFaced;
        }

        public String hundreds() {
            return this.hundreds;
        }

        public String fifties() {
            return this.fifties;
        }

        public String fours() {
            return this.fours;
        }

        public String sixes() {
            return this.sixes;
        }

        public String average() {
            return this.average;
        }

        public String strikeRate() {
            return this.strikeRate;
        }

        public String innings() {
            return this.innings;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BattingRecord1.$responseFields[0], BattingRecord1.this.__typename);
                    responseWriter.writeString(BattingRecord1.$responseFields[1], BattingRecord1.this.notOuts);
                    responseWriter.writeString(BattingRecord1.$responseFields[2], BattingRecord1.this.runs);
                    responseWriter.writeString(BattingRecord1.$responseFields[3], BattingRecord1.this.ballsFaced);
                    responseWriter.writeString(BattingRecord1.$responseFields[4], BattingRecord1.this.hundreds);
                    responseWriter.writeString(BattingRecord1.$responseFields[5], BattingRecord1.this.fifties);
                    responseWriter.writeString(BattingRecord1.$responseFields[6], BattingRecord1.this.fours);
                    responseWriter.writeString(BattingRecord1.$responseFields[7], BattingRecord1.this.sixes);
                    responseWriter.writeString(BattingRecord1.$responseFields[8], BattingRecord1.this.average);
                    responseWriter.writeString(BattingRecord1.$responseFields[9], BattingRecord1.this.strikeRate);
                    responseWriter.writeString(BattingRecord1.$responseFields[10], BattingRecord1.this.innings);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BattingRecord1{__typename=" + this.__typename + ", notOuts=" + this.notOuts + ", runs=" + this.runs + ", ballsFaced=" + this.ballsFaced + ", hundreds=" + this.hundreds + ", fifties=" + this.fifties + ", fours=" + this.fours + ", sixes=" + this.sixes + ", average=" + this.average + ", strikeRate=" + this.strikeRate + ", innings=" + this.innings + "}";
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
            if (!(obj instanceof BattingRecord1)) {
                return false;
            }
            BattingRecord1 battingRecord1 = (BattingRecord1) obj;
            if (this.__typename.equals(battingRecord1.__typename) && ((str = this.notOuts) != null ? str.equals(battingRecord1.notOuts) : battingRecord1.notOuts == null) && ((str2 = this.runs) != null ? str2.equals(battingRecord1.runs) : battingRecord1.runs == null) && ((str3 = this.ballsFaced) != null ? str3.equals(battingRecord1.ballsFaced) : battingRecord1.ballsFaced == null) && ((str4 = this.hundreds) != null ? str4.equals(battingRecord1.hundreds) : battingRecord1.hundreds == null) && ((str5 = this.fifties) != null ? str5.equals(battingRecord1.fifties) : battingRecord1.fifties == null) && ((str6 = this.fours) != null ? str6.equals(battingRecord1.fours) : battingRecord1.fours == null) && ((str7 = this.sixes) != null ? str7.equals(battingRecord1.sixes) : battingRecord1.sixes == null) && ((str8 = this.average) != null ? str8.equals(battingRecord1.average) : battingRecord1.average == null) && ((str9 = this.strikeRate) != null ? str9.equals(battingRecord1.strikeRate) : battingRecord1.strikeRate == null)) {
                String str10 = this.innings;
                String str11 = battingRecord1.innings;
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
                String str = this.notOuts;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.runs;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.ballsFaced;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.hundreds;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.fifties;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.fours;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.sixes;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.average;
                int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.strikeRate;
                int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.innings;
                if (str10 != null) {
                    i = str10.hashCode();
                }
                this.$hashCode = hashCode10 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BattingRecord1> {
            @Override
            public BattingRecord1 map(ResponseReader responseReader) {
                return new BattingRecord1(responseReader.readString(BattingRecord1.$responseFields[0]), responseReader.readString(BattingRecord1.$responseFields[1]), responseReader.readString(BattingRecord1.$responseFields[2]), responseReader.readString(BattingRecord1.$responseFields[3]), responseReader.readString(BattingRecord1.$responseFields[4]), responseReader.readString(BattingRecord1.$responseFields[5]), responseReader.readString(BattingRecord1.$responseFields[6]), responseReader.readString(BattingRecord1.$responseFields[7]), responseReader.readString(BattingRecord1.$responseFields[8]), responseReader.readString(BattingRecord1.$responseFields[9]), responseReader.readString(BattingRecord1.$responseFields[10]));
            }
        }
    }

    public static class BowlingRecord1 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("overs", "overs", null, true, Collections.emptyList()), ResponseField.forString("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forString("ballsBowled", "ballsBowled", null, true, Collections.emptyList()), ResponseField.forString("average", "average", null, true, Collections.emptyList()), ResponseField.forString("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forString("economyRate", "economyRate", null, true, Collections.emptyList()), ResponseField.forString("fiveWicketHauls", "fiveWicketHauls", null, true, Collections.emptyList()), ResponseField.forString("innings", "innings", null, true, Collections.emptyList()), ResponseField.forString("bestBowling", "bestBowling", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String average;
        final String ballsBowled;
        final String bestBowling;
        final String economyRate;
        final String fiveWicketHauls;
        final String innings;
        final String overs;
        final String strikeRate;
        final String wickets;

        public BowlingRecord1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.overs = str2;
            this.wickets = str3;
            this.ballsBowled = str4;
            this.average = str5;
            this.strikeRate = str6;
            this.economyRate = str7;
            this.fiveWicketHauls = str8;
            this.innings = str9;
            this.bestBowling = str10;
        }

        public String __typename() {
            return this.__typename;
        }

        public String overs() {
            return this.overs;
        }

        public String wickets() {
            return this.wickets;
        }

        public String ballsBowled() {
            return this.ballsBowled;
        }

        public String average() {
            return this.average;
        }

        public String strikeRate() {
            return this.strikeRate;
        }

        public String economyRate() {
            return this.economyRate;
        }

        public String fiveWicketHauls() {
            return this.fiveWicketHauls;
        }

        public String innings() {
            return this.innings;
        }

        public String bestBowling() {
            return this.bestBowling;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlingRecord1.$responseFields[0], BowlingRecord1.this.__typename);
                    responseWriter.writeString(BowlingRecord1.$responseFields[1], BowlingRecord1.this.overs);
                    responseWriter.writeString(BowlingRecord1.$responseFields[2], BowlingRecord1.this.wickets);
                    responseWriter.writeString(BowlingRecord1.$responseFields[3], BowlingRecord1.this.ballsBowled);
                    responseWriter.writeString(BowlingRecord1.$responseFields[4], BowlingRecord1.this.average);
                    responseWriter.writeString(BowlingRecord1.$responseFields[5], BowlingRecord1.this.strikeRate);
                    responseWriter.writeString(BowlingRecord1.$responseFields[6], BowlingRecord1.this.economyRate);
                    responseWriter.writeString(BowlingRecord1.$responseFields[7], BowlingRecord1.this.fiveWicketHauls);
                    responseWriter.writeString(BowlingRecord1.$responseFields[8], BowlingRecord1.this.innings);
                    responseWriter.writeString(BowlingRecord1.$responseFields[9], BowlingRecord1.this.bestBowling);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlingRecord1{__typename=" + this.__typename + ", overs=" + this.overs + ", wickets=" + this.wickets + ", ballsBowled=" + this.ballsBowled + ", average=" + this.average + ", strikeRate=" + this.strikeRate + ", economyRate=" + this.economyRate + ", fiveWicketHauls=" + this.fiveWicketHauls + ", innings=" + this.innings + ", bestBowling=" + this.bestBowling + "}";
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
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlingRecord1)) {
                return false;
            }
            BowlingRecord1 bowlingRecord1 = (BowlingRecord1) obj;
            if (this.__typename.equals(bowlingRecord1.__typename) && ((str = this.overs) != null ? str.equals(bowlingRecord1.overs) : bowlingRecord1.overs == null) && ((str2 = this.wickets) != null ? str2.equals(bowlingRecord1.wickets) : bowlingRecord1.wickets == null) && ((str3 = this.ballsBowled) != null ? str3.equals(bowlingRecord1.ballsBowled) : bowlingRecord1.ballsBowled == null) && ((str4 = this.average) != null ? str4.equals(bowlingRecord1.average) : bowlingRecord1.average == null) && ((str5 = this.strikeRate) != null ? str5.equals(bowlingRecord1.strikeRate) : bowlingRecord1.strikeRate == null) && ((str6 = this.economyRate) != null ? str6.equals(bowlingRecord1.economyRate) : bowlingRecord1.economyRate == null) && ((str7 = this.fiveWicketHauls) != null ? str7.equals(bowlingRecord1.fiveWicketHauls) : bowlingRecord1.fiveWicketHauls == null) && ((str8 = this.innings) != null ? str8.equals(bowlingRecord1.innings) : bowlingRecord1.innings == null)) {
                String str9 = this.bestBowling;
                String str10 = bowlingRecord1.bestBowling;
                if (str9 == null) {
                    if (str10 == null) {
                        return true;
                    }
                } else if (str9.equals(str10)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.overs;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.wickets;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.ballsBowled;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.average;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.strikeRate;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.economyRate;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.fiveWicketHauls;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.innings;
                int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.bestBowling;
                if (str9 != null) {
                    i = str9.hashCode();
                }
                this.$hashCode = hashCode9 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlingRecord1> {
            @Override
            public BowlingRecord1 map(ResponseReader responseReader) {
                return new BowlingRecord1(responseReader.readString(BowlingRecord1.$responseFields[0]), responseReader.readString(BowlingRecord1.$responseFields[1]), responseReader.readString(BowlingRecord1.$responseFields[2]), responseReader.readString(BowlingRecord1.$responseFields[3]), responseReader.readString(BowlingRecord1.$responseFields[4]), responseReader.readString(BowlingRecord1.$responseFields[5]), responseReader.readString(BowlingRecord1.$responseFields[6]), responseReader.readString(BowlingRecord1.$responseFields[7]), responseReader.readString(BowlingRecord1.$responseFields[8]), responseReader.readString(BowlingRecord1.$responseFields[9]));
            }
        }
    }

    public static class T20 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forObject("basicdetails", "basicdetails", null, true, Collections.emptyList()), ResponseField.forObject("debutMatch", "debutMatch", null, true, Collections.emptyList()), ResponseField.forObject("lastMatch", "lastMatch", null, true, Collections.emptyList()), ResponseField.forObject("battingRecord", "battingRecord", null, true, Collections.emptyList()), ResponseField.forObject("bowlingRecord", "bowlingRecord", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Basicdetails2 basicdetails;
        final BattingRecord2 battingRecord;
        final BowlingRecord2 bowlingRecord;
        final DebutMatch2 debutMatch;
        final LastMatch2 lastMatch;

        public T20(String str, Basicdetails2 basicdetails2, DebutMatch2 debutMatch2, LastMatch2 lastMatch2, BattingRecord2 battingRecord2, BowlingRecord2 bowlingRecord2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.basicdetails = basicdetails2;
            this.debutMatch = debutMatch2;
            this.lastMatch = lastMatch2;
            this.battingRecord = battingRecord2;
            this.bowlingRecord = bowlingRecord2;
        }

        public String __typename() {
            return this.__typename;
        }

        public Basicdetails2 basicdetails() {
            return this.basicdetails;
        }

        public DebutMatch2 debutMatch() {
            return this.debutMatch;
        }

        public LastMatch2 lastMatch() {
            return this.lastMatch;
        }

        public BattingRecord2 battingRecord() {
            return this.battingRecord;
        }

        public BowlingRecord2 bowlingRecord() {
            return this.bowlingRecord;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(T20.$responseFields[0], T20.this.__typename);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(T20.$responseFields[1], T20.this.basicdetails != null ? T20.this.basicdetails.marshaller() : null);
                    responseWriter.writeObject(T20.$responseFields[2], T20.this.debutMatch != null ? T20.this.debutMatch.marshaller() : null);
                    responseWriter.writeObject(T20.$responseFields[3], T20.this.lastMatch != null ? T20.this.lastMatch.marshaller() : null);
                    responseWriter.writeObject(T20.$responseFields[4], T20.this.battingRecord != null ? T20.this.battingRecord.marshaller() : null);
                    ResponseField responseField = T20.$responseFields[5];
                    if (T20.this.bowlingRecord != null) {
                        responseFieldMarshaller = T20.this.bowlingRecord.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "T20{__typename=" + this.__typename + ", basicdetails=" + this.basicdetails + ", debutMatch=" + this.debutMatch + ", lastMatch=" + this.lastMatch + ", battingRecord=" + this.battingRecord + ", bowlingRecord=" + this.bowlingRecord + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Basicdetails2 basicdetails2;
            DebutMatch2 debutMatch2;
            LastMatch2 lastMatch2;
            BattingRecord2 battingRecord2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof T20)) {
                return false;
            }
            T20 t20 = (T20) obj;
            if (this.__typename.equals(t20.__typename) && ((basicdetails2 = this.basicdetails) != null ? basicdetails2.equals(t20.basicdetails) : t20.basicdetails == null) && ((debutMatch2 = this.debutMatch) != null ? debutMatch2.equals(t20.debutMatch) : t20.debutMatch == null) && ((lastMatch2 = this.lastMatch) != null ? lastMatch2.equals(t20.lastMatch) : t20.lastMatch == null) && ((battingRecord2 = this.battingRecord) != null ? battingRecord2.equals(t20.battingRecord) : t20.battingRecord == null)) {
                BowlingRecord2 bowlingRecord2 = this.bowlingRecord;
                BowlingRecord2 bowlingRecord22 = t20.bowlingRecord;
                if (bowlingRecord2 == null) {
                    if (bowlingRecord22 == null) {
                        return true;
                    }
                } else if (bowlingRecord2.equals(bowlingRecord22)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Basicdetails2 basicdetails2 = this.basicdetails;
                int i = 0;
                int hashCode2 = (hashCode ^ (basicdetails2 == null ? 0 : basicdetails2.hashCode())) * 1000003;
                DebutMatch2 debutMatch2 = this.debutMatch;
                int hashCode3 = (hashCode2 ^ (debutMatch2 == null ? 0 : debutMatch2.hashCode())) * 1000003;
                LastMatch2 lastMatch2 = this.lastMatch;
                int hashCode4 = (hashCode3 ^ (lastMatch2 == null ? 0 : lastMatch2.hashCode())) * 1000003;
                BattingRecord2 battingRecord2 = this.battingRecord;
                int hashCode5 = (hashCode4 ^ (battingRecord2 == null ? 0 : battingRecord2.hashCode())) * 1000003;
                BowlingRecord2 bowlingRecord2 = this.bowlingRecord;
                if (bowlingRecord2 != null) {
                    i = bowlingRecord2.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<T20> {
            final Basicdetails2.Mapper basicdetails2FieldMapper = new Basicdetails2.Mapper();
            final BattingRecord2.Mapper battingRecord2FieldMapper = new BattingRecord2.Mapper();
            final BowlingRecord2.Mapper bowlingRecord2FieldMapper = new BowlingRecord2.Mapper();
            final DebutMatch2.Mapper debutMatch2FieldMapper = new DebutMatch2.Mapper();
            final LastMatch2.Mapper lastMatch2FieldMapper = new LastMatch2.Mapper();

            @Override
            public T20 map(ResponseReader responseReader) {
                return new T20(responseReader.readString(T20.$responseFields[0]), (Basicdetails2) responseReader.readObject(T20.$responseFields[1], new ResponseReader.ObjectReader<Basicdetails2>() {

                    @Override
                    public Basicdetails2 read(ResponseReader responseReader) {
                        return Mapper.this.basicdetails2FieldMapper.map(responseReader);
                    }
                }), (DebutMatch2) responseReader.readObject(T20.$responseFields[2], new ResponseReader.ObjectReader<DebutMatch2>() {

                    @Override
                    public DebutMatch2 read(ResponseReader responseReader) {
                        return Mapper.this.debutMatch2FieldMapper.map(responseReader);
                    }
                }), (LastMatch2) responseReader.readObject(T20.$responseFields[3], new ResponseReader.ObjectReader<LastMatch2>() {

                    @Override
                    public LastMatch2 read(ResponseReader responseReader) {
                        return Mapper.this.lastMatch2FieldMapper.map(responseReader);
                    }
                }), (BattingRecord2) responseReader.readObject(T20.$responseFields[4], new ResponseReader.ObjectReader<BattingRecord2>() {

                    @Override
                    public BattingRecord2 read(ResponseReader responseReader) {
                        return Mapper.this.battingRecord2FieldMapper.map(responseReader);
                    }
                }), (BowlingRecord2) responseReader.readObject(T20.$responseFields[5], new ResponseReader.ObjectReader<BowlingRecord2>() {

                    @Override
                    public BowlingRecord2 read(ResponseReader responseReader) {
                        return Mapper.this.bowlingRecord2FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class Basicdetails2 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matches", "matches", null, true, Collections.emptyList()), ResponseField.forString("innings", "innings", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String innings;
        final String matches;

        public Basicdetails2(String str, String str2, String str3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matches = str2;
            this.innings = str3;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matches() {
            return this.matches;
        }

        public String innings() {
            return this.innings;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Basicdetails2.$responseFields[0], Basicdetails2.this.__typename);
                    responseWriter.writeString(Basicdetails2.$responseFields[1], Basicdetails2.this.matches);
                    responseWriter.writeString(Basicdetails2.$responseFields[2], Basicdetails2.this.innings);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Basicdetails2{__typename=" + this.__typename + ", matches=" + this.matches + ", innings=" + this.innings + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Basicdetails2)) {
                return false;
            }
            Basicdetails2 basicdetails2 = (Basicdetails2) obj;
            if (this.__typename.equals(basicdetails2.__typename) && ((str = this.matches) != null ? str.equals(basicdetails2.matches) : basicdetails2.matches == null)) {
                String str2 = this.innings;
                String str3 = basicdetails2.innings;
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
                String str = this.matches;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.innings;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Basicdetails2> {
            @Override
            public Basicdetails2 map(ResponseReader responseReader) {
                return new Basicdetails2(responseReader.readString(Basicdetails2.$responseFields[0]), responseReader.readString(Basicdetails2.$responseFields[1]), responseReader.readString(Basicdetails2.$responseFields[2]));
            }
        }
    }

    public static class DebutMatch2 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchID", "matchID", null, true, Collections.emptyList()), ResponseField.forString("date", "date", null, true, Collections.emptyList()), ResponseField.forString("against", "against", null, true, Collections.emptyList()), ResponseField.forString("againstID", "againstID", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String against;
        final String againstID;
        final String date;
        final String matchID;

        public DebutMatch2(String str, String str2, String str3, String str4, String str5) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchID = str2;
            this.date = str3;
            this.against = str4;
            this.againstID = str5;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchID() {
            return this.matchID;
        }

        public String date() {
            return this.date;
        }

        public String against() {
            return this.against;
        }

        public String againstID() {
            return this.againstID;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(DebutMatch2.$responseFields[0], DebutMatch2.this.__typename);
                    responseWriter.writeString(DebutMatch2.$responseFields[1], DebutMatch2.this.matchID);
                    responseWriter.writeString(DebutMatch2.$responseFields[2], DebutMatch2.this.date);
                    responseWriter.writeString(DebutMatch2.$responseFields[3], DebutMatch2.this.against);
                    responseWriter.writeString(DebutMatch2.$responseFields[4], DebutMatch2.this.againstID);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "DebutMatch2{__typename=" + this.__typename + ", matchID=" + this.matchID + ", date=" + this.date + ", against=" + this.against + ", againstID=" + this.againstID + "}";
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
            if (!(obj instanceof DebutMatch2)) {
                return false;
            }
            DebutMatch2 debutMatch2 = (DebutMatch2) obj;
            if (this.__typename.equals(debutMatch2.__typename) && ((str = this.matchID) != null ? str.equals(debutMatch2.matchID) : debutMatch2.matchID == null) && ((str2 = this.date) != null ? str2.equals(debutMatch2.date) : debutMatch2.date == null) && ((str3 = this.against) != null ? str3.equals(debutMatch2.against) : debutMatch2.against == null)) {
                String str4 = this.againstID;
                String str5 = debutMatch2.againstID;
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
                String str = this.matchID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.date;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.against;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.againstID;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<DebutMatch2> {
            @Override
            public DebutMatch2 map(ResponseReader responseReader) {
                return new DebutMatch2(responseReader.readString(DebutMatch2.$responseFields[0]), responseReader.readString(DebutMatch2.$responseFields[1]), responseReader.readString(DebutMatch2.$responseFields[2]), responseReader.readString(DebutMatch2.$responseFields[3]), responseReader.readString(DebutMatch2.$responseFields[4]));
            }
        }
    }

    public static class LastMatch2 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchID", "matchID", null, true, Collections.emptyList()), ResponseField.forString("date", "date", null, true, Collections.emptyList()), ResponseField.forString("against", "against", null, true, Collections.emptyList()), ResponseField.forString("againstID", "againstID", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String against;
        final String againstID;
        final String date;
        final String matchID;

        public LastMatch2(String str, String str2, String str3, String str4, String str5) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchID = str2;
            this.date = str3;
            this.against = str4;
            this.againstID = str5;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchID() {
            return this.matchID;
        }

        public String date() {
            return this.date;
        }

        public String against() {
            return this.against;
        }

        public String againstID() {
            return this.againstID;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(LastMatch2.$responseFields[0], LastMatch2.this.__typename);
                    responseWriter.writeString(LastMatch2.$responseFields[1], LastMatch2.this.matchID);
                    responseWriter.writeString(LastMatch2.$responseFields[2], LastMatch2.this.date);
                    responseWriter.writeString(LastMatch2.$responseFields[3], LastMatch2.this.against);
                    responseWriter.writeString(LastMatch2.$responseFields[4], LastMatch2.this.againstID);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "LastMatch2{__typename=" + this.__typename + ", matchID=" + this.matchID + ", date=" + this.date + ", against=" + this.against + ", againstID=" + this.againstID + "}";
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
            if (!(obj instanceof LastMatch2)) {
                return false;
            }
            LastMatch2 lastMatch2 = (LastMatch2) obj;
            if (this.__typename.equals(lastMatch2.__typename) && ((str = this.matchID) != null ? str.equals(lastMatch2.matchID) : lastMatch2.matchID == null) && ((str2 = this.date) != null ? str2.equals(lastMatch2.date) : lastMatch2.date == null) && ((str3 = this.against) != null ? str3.equals(lastMatch2.against) : lastMatch2.against == null)) {
                String str4 = this.againstID;
                String str5 = lastMatch2.againstID;
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
                String str = this.matchID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.date;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.against;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.againstID;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<LastMatch2> {
            @Override
            public LastMatch2 map(ResponseReader responseReader) {
                return new LastMatch2(responseReader.readString(LastMatch2.$responseFields[0]), responseReader.readString(LastMatch2.$responseFields[1]), responseReader.readString(LastMatch2.$responseFields[2]), responseReader.readString(LastMatch2.$responseFields[3]), responseReader.readString(LastMatch2.$responseFields[4]));
            }
        }
    }

    public static class BattingRecord2 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("notOuts", "notOuts", null, true, Collections.emptyList()), ResponseField.forString("runs", "runs", null, true, Collections.emptyList()), ResponseField.forString("ballsFaced", "ballsFaced", null, true, Collections.emptyList()), ResponseField.forString("hundreds", "hundreds", null, true, Collections.emptyList()), ResponseField.forString("fifties", "fifties", null, true, Collections.emptyList()), ResponseField.forString("fours", "fours", null, true, Collections.emptyList()), ResponseField.forString("sixes", "sixes", null, true, Collections.emptyList()), ResponseField.forString("average", "average", null, true, Collections.emptyList()), ResponseField.forString("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forString("innings", "innings", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String average;
        final String ballsFaced;
        final String fifties;
        final String fours;
        final String hundreds;
        final String innings;
        final String notOuts;
        final String runs;
        final String sixes;
        final String strikeRate;

        public BattingRecord2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.notOuts = str2;
            this.runs = str3;
            this.ballsFaced = str4;
            this.hundreds = str5;
            this.fifties = str6;
            this.fours = str7;
            this.sixes = str8;
            this.average = str9;
            this.strikeRate = str10;
            this.innings = str11;
        }

        public String __typename() {
            return this.__typename;
        }

        public String notOuts() {
            return this.notOuts;
        }

        public String runs() {
            return this.runs;
        }

        public String ballsFaced() {
            return this.ballsFaced;
        }

        public String hundreds() {
            return this.hundreds;
        }

        public String fifties() {
            return this.fifties;
        }

        public String fours() {
            return this.fours;
        }

        public String sixes() {
            return this.sixes;
        }

        public String average() {
            return this.average;
        }

        public String strikeRate() {
            return this.strikeRate;
        }

        public String innings() {
            return this.innings;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BattingRecord2.$responseFields[0], BattingRecord2.this.__typename);
                    responseWriter.writeString(BattingRecord2.$responseFields[1], BattingRecord2.this.notOuts);
                    responseWriter.writeString(BattingRecord2.$responseFields[2], BattingRecord2.this.runs);
                    responseWriter.writeString(BattingRecord2.$responseFields[3], BattingRecord2.this.ballsFaced);
                    responseWriter.writeString(BattingRecord2.$responseFields[4], BattingRecord2.this.hundreds);
                    responseWriter.writeString(BattingRecord2.$responseFields[5], BattingRecord2.this.fifties);
                    responseWriter.writeString(BattingRecord2.$responseFields[6], BattingRecord2.this.fours);
                    responseWriter.writeString(BattingRecord2.$responseFields[7], BattingRecord2.this.sixes);
                    responseWriter.writeString(BattingRecord2.$responseFields[8], BattingRecord2.this.average);
                    responseWriter.writeString(BattingRecord2.$responseFields[9], BattingRecord2.this.strikeRate);
                    responseWriter.writeString(BattingRecord2.$responseFields[10], BattingRecord2.this.innings);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BattingRecord2{__typename=" + this.__typename + ", notOuts=" + this.notOuts + ", runs=" + this.runs + ", ballsFaced=" + this.ballsFaced + ", hundreds=" + this.hundreds + ", fifties=" + this.fifties + ", fours=" + this.fours + ", sixes=" + this.sixes + ", average=" + this.average + ", strikeRate=" + this.strikeRate + ", innings=" + this.innings + "}";
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
            if (!(obj instanceof BattingRecord2)) {
                return false;
            }
            BattingRecord2 battingRecord2 = (BattingRecord2) obj;
            if (this.__typename.equals(battingRecord2.__typename) && ((str = this.notOuts) != null ? str.equals(battingRecord2.notOuts) : battingRecord2.notOuts == null) && ((str2 = this.runs) != null ? str2.equals(battingRecord2.runs) : battingRecord2.runs == null) && ((str3 = this.ballsFaced) != null ? str3.equals(battingRecord2.ballsFaced) : battingRecord2.ballsFaced == null) && ((str4 = this.hundreds) != null ? str4.equals(battingRecord2.hundreds) : battingRecord2.hundreds == null) && ((str5 = this.fifties) != null ? str5.equals(battingRecord2.fifties) : battingRecord2.fifties == null) && ((str6 = this.fours) != null ? str6.equals(battingRecord2.fours) : battingRecord2.fours == null) && ((str7 = this.sixes) != null ? str7.equals(battingRecord2.sixes) : battingRecord2.sixes == null) && ((str8 = this.average) != null ? str8.equals(battingRecord2.average) : battingRecord2.average == null) && ((str9 = this.strikeRate) != null ? str9.equals(battingRecord2.strikeRate) : battingRecord2.strikeRate == null)) {
                String str10 = this.innings;
                String str11 = battingRecord2.innings;
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
                String str = this.notOuts;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.runs;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.ballsFaced;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.hundreds;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.fifties;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.fours;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.sixes;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.average;
                int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.strikeRate;
                int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.innings;
                if (str10 != null) {
                    i = str10.hashCode();
                }
                this.$hashCode = hashCode10 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BattingRecord2> {
            @Override
            public BattingRecord2 map(ResponseReader responseReader) {
                return new BattingRecord2(responseReader.readString(BattingRecord2.$responseFields[0]), responseReader.readString(BattingRecord2.$responseFields[1]), responseReader.readString(BattingRecord2.$responseFields[2]), responseReader.readString(BattingRecord2.$responseFields[3]), responseReader.readString(BattingRecord2.$responseFields[4]), responseReader.readString(BattingRecord2.$responseFields[5]), responseReader.readString(BattingRecord2.$responseFields[6]), responseReader.readString(BattingRecord2.$responseFields[7]), responseReader.readString(BattingRecord2.$responseFields[8]), responseReader.readString(BattingRecord2.$responseFields[9]), responseReader.readString(BattingRecord2.$responseFields[10]));
            }
        }
    }

    public static class BowlingRecord2 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("overs", "overs", null, true, Collections.emptyList()), ResponseField.forString("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forString("ballsBowled", "ballsBowled", null, true, Collections.emptyList()), ResponseField.forString("average", "average", null, true, Collections.emptyList()), ResponseField.forString("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forString("economyRate", "economyRate", null, true, Collections.emptyList()), ResponseField.forString("fiveWicketHauls", "fiveWicketHauls", null, true, Collections.emptyList()), ResponseField.forString("innings", "innings", null, true, Collections.emptyList()), ResponseField.forString("bestBowling", "bestBowling", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String average;
        final String ballsBowled;
        final String bestBowling;
        final String economyRate;
        final String fiveWicketHauls;
        final String innings;
        final String overs;
        final String strikeRate;
        final String wickets;

        public BowlingRecord2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.overs = str2;
            this.wickets = str3;
            this.ballsBowled = str4;
            this.average = str5;
            this.strikeRate = str6;
            this.economyRate = str7;
            this.fiveWicketHauls = str8;
            this.innings = str9;
            this.bestBowling = str10;
        }

        public String __typename() {
            return this.__typename;
        }

        public String overs() {
            return this.overs;
        }

        public String wickets() {
            return this.wickets;
        }

        public String ballsBowled() {
            return this.ballsBowled;
        }

        public String average() {
            return this.average;
        }

        public String strikeRate() {
            return this.strikeRate;
        }

        public String economyRate() {
            return this.economyRate;
        }

        public String fiveWicketHauls() {
            return this.fiveWicketHauls;
        }

        public String innings() {
            return this.innings;
        }

        public String bestBowling() {
            return this.bestBowling;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlingRecord2.$responseFields[0], BowlingRecord2.this.__typename);
                    responseWriter.writeString(BowlingRecord2.$responseFields[1], BowlingRecord2.this.overs);
                    responseWriter.writeString(BowlingRecord2.$responseFields[2], BowlingRecord2.this.wickets);
                    responseWriter.writeString(BowlingRecord2.$responseFields[3], BowlingRecord2.this.ballsBowled);
                    responseWriter.writeString(BowlingRecord2.$responseFields[4], BowlingRecord2.this.average);
                    responseWriter.writeString(BowlingRecord2.$responseFields[5], BowlingRecord2.this.strikeRate);
                    responseWriter.writeString(BowlingRecord2.$responseFields[6], BowlingRecord2.this.economyRate);
                    responseWriter.writeString(BowlingRecord2.$responseFields[7], BowlingRecord2.this.fiveWicketHauls);
                    responseWriter.writeString(BowlingRecord2.$responseFields[8], BowlingRecord2.this.innings);
                    responseWriter.writeString(BowlingRecord2.$responseFields[9], BowlingRecord2.this.bestBowling);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlingRecord2{__typename=" + this.__typename + ", overs=" + this.overs + ", wickets=" + this.wickets + ", ballsBowled=" + this.ballsBowled + ", average=" + this.average + ", strikeRate=" + this.strikeRate + ", economyRate=" + this.economyRate + ", fiveWicketHauls=" + this.fiveWicketHauls + ", innings=" + this.innings + ", bestBowling=" + this.bestBowling + "}";
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
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlingRecord2)) {
                return false;
            }
            BowlingRecord2 bowlingRecord2 = (BowlingRecord2) obj;
            if (this.__typename.equals(bowlingRecord2.__typename) && ((str = this.overs) != null ? str.equals(bowlingRecord2.overs) : bowlingRecord2.overs == null) && ((str2 = this.wickets) != null ? str2.equals(bowlingRecord2.wickets) : bowlingRecord2.wickets == null) && ((str3 = this.ballsBowled) != null ? str3.equals(bowlingRecord2.ballsBowled) : bowlingRecord2.ballsBowled == null) && ((str4 = this.average) != null ? str4.equals(bowlingRecord2.average) : bowlingRecord2.average == null) && ((str5 = this.strikeRate) != null ? str5.equals(bowlingRecord2.strikeRate) : bowlingRecord2.strikeRate == null) && ((str6 = this.economyRate) != null ? str6.equals(bowlingRecord2.economyRate) : bowlingRecord2.economyRate == null) && ((str7 = this.fiveWicketHauls) != null ? str7.equals(bowlingRecord2.fiveWicketHauls) : bowlingRecord2.fiveWicketHauls == null) && ((str8 = this.innings) != null ? str8.equals(bowlingRecord2.innings) : bowlingRecord2.innings == null)) {
                String str9 = this.bestBowling;
                String str10 = bowlingRecord2.bestBowling;
                if (str9 == null) {
                    if (str10 == null) {
                        return true;
                    }
                } else if (str9.equals(str10)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.overs;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.wickets;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.ballsBowled;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.average;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.strikeRate;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.economyRate;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.fiveWicketHauls;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.innings;
                int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.bestBowling;
                if (str9 != null) {
                    i = str9.hashCode();
                }
                this.$hashCode = hashCode9 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlingRecord2> {
            @Override
            public BowlingRecord2 map(ResponseReader responseReader) {
                return new BowlingRecord2(responseReader.readString(BowlingRecord2.$responseFields[0]), responseReader.readString(BowlingRecord2.$responseFields[1]), responseReader.readString(BowlingRecord2.$responseFields[2]), responseReader.readString(BowlingRecord2.$responseFields[3]), responseReader.readString(BowlingRecord2.$responseFields[4]), responseReader.readString(BowlingRecord2.$responseFields[5]), responseReader.readString(BowlingRecord2.$responseFields[6]), responseReader.readString(BowlingRecord2.$responseFields[7]), responseReader.readString(BowlingRecord2.$responseFields[8]), responseReader.readString(BowlingRecord2.$responseFields[9]));
            }
        }
    }

    public static class C6692Ipl {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forObject("basicdetails", "basicdetails", null, true, Collections.emptyList()), ResponseField.forObject("debutMatch", "debutMatch", null, true, Collections.emptyList()), ResponseField.forObject("lastMatch", "lastMatch", null, true, Collections.emptyList()), ResponseField.forObject("battingRecord", "battingRecord", null, true, Collections.emptyList()), ResponseField.forObject("bowlingRecord", "bowlingRecord", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Basicdetails3 basicdetails;
        final BattingRecord3 battingRecord;
        final BowlingRecord3 bowlingRecord;
        final DebutMatch3 debutMatch;
        final LastMatch3 lastMatch;

        public C6692Ipl(String str, Basicdetails3 basicdetails3, DebutMatch3 debutMatch3, LastMatch3 lastMatch3, BattingRecord3 battingRecord3, BowlingRecord3 bowlingRecord3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.basicdetails = basicdetails3;
            this.debutMatch = debutMatch3;
            this.lastMatch = lastMatch3;
            this.battingRecord = battingRecord3;
            this.bowlingRecord = bowlingRecord3;
        }

        public String __typename() {
            return this.__typename;
        }

        public Basicdetails3 basicdetails() {
            return this.basicdetails;
        }

        public DebutMatch3 debutMatch() {
            return this.debutMatch;
        }

        public LastMatch3 lastMatch() {
            return this.lastMatch;
        }

        public BattingRecord3 battingRecord() {
            return this.battingRecord;
        }

        public BowlingRecord3 bowlingRecord() {
            return this.bowlingRecord;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(C6692Ipl.$responseFields[0], C6692Ipl.this.__typename);
                    ResponseFieldMarshaller responseFieldMarshaller = null;
                    responseWriter.writeObject(C6692Ipl.$responseFields[1], C6692Ipl.this.basicdetails != null ? C6692Ipl.this.basicdetails.marshaller() : null);
                    responseWriter.writeObject(C6692Ipl.$responseFields[2], C6692Ipl.this.debutMatch != null ? C6692Ipl.this.debutMatch.marshaller() : null);
                    responseWriter.writeObject(C6692Ipl.$responseFields[3], C6692Ipl.this.lastMatch != null ? C6692Ipl.this.lastMatch.marshaller() : null);
                    responseWriter.writeObject(C6692Ipl.$responseFields[4], C6692Ipl.this.battingRecord != null ? C6692Ipl.this.battingRecord.marshaller() : null);
                    ResponseField responseField = C6692Ipl.$responseFields[5];
                    if (C6692Ipl.this.bowlingRecord != null) {
                        responseFieldMarshaller = C6692Ipl.this.bowlingRecord.marshaller();
                    }
                    responseWriter.writeObject(responseField, responseFieldMarshaller);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Ipl{__typename=" + this.__typename + ", basicdetails=" + this.basicdetails + ", debutMatch=" + this.debutMatch + ", lastMatch=" + this.lastMatch + ", battingRecord=" + this.battingRecord + ", bowlingRecord=" + this.bowlingRecord + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Basicdetails3 basicdetails3;
            DebutMatch3 debutMatch3;
            LastMatch3 lastMatch3;
            BattingRecord3 battingRecord3;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6692Ipl)) {
                return false;
            }
            C6692Ipl ipl = (C6692Ipl) obj;
            if (this.__typename.equals(ipl.__typename) && ((basicdetails3 = this.basicdetails) != null ? basicdetails3.equals(ipl.basicdetails) : ipl.basicdetails == null) && ((debutMatch3 = this.debutMatch) != null ? debutMatch3.equals(ipl.debutMatch) : ipl.debutMatch == null) && ((lastMatch3 = this.lastMatch) != null ? lastMatch3.equals(ipl.lastMatch) : ipl.lastMatch == null) && ((battingRecord3 = this.battingRecord) != null ? battingRecord3.equals(ipl.battingRecord) : ipl.battingRecord == null)) {
                BowlingRecord3 bowlingRecord3 = this.bowlingRecord;
                BowlingRecord3 bowlingRecord32 = ipl.bowlingRecord;
                if (bowlingRecord3 == null) {
                    if (bowlingRecord32 == null) {
                        return true;
                    }
                } else if (bowlingRecord3.equals(bowlingRecord32)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                Basicdetails3 basicdetails3 = this.basicdetails;
                int i = 0;
                int hashCode2 = (hashCode ^ (basicdetails3 == null ? 0 : basicdetails3.hashCode())) * 1000003;
                DebutMatch3 debutMatch3 = this.debutMatch;
                int hashCode3 = (hashCode2 ^ (debutMatch3 == null ? 0 : debutMatch3.hashCode())) * 1000003;
                LastMatch3 lastMatch3 = this.lastMatch;
                int hashCode4 = (hashCode3 ^ (lastMatch3 == null ? 0 : lastMatch3.hashCode())) * 1000003;
                BattingRecord3 battingRecord3 = this.battingRecord;
                int hashCode5 = (hashCode4 ^ (battingRecord3 == null ? 0 : battingRecord3.hashCode())) * 1000003;
                BowlingRecord3 bowlingRecord3 = this.bowlingRecord;
                if (bowlingRecord3 != null) {
                    i = bowlingRecord3.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<C6692Ipl> {
            final Basicdetails3.Mapper basicdetails3FieldMapper = new Basicdetails3.Mapper();
            final BattingRecord3.Mapper battingRecord3FieldMapper = new BattingRecord3.Mapper();
            final BowlingRecord3.Mapper bowlingRecord3FieldMapper = new BowlingRecord3.Mapper();
            final DebutMatch3.Mapper debutMatch3FieldMapper = new DebutMatch3.Mapper();
            final LastMatch3.Mapper lastMatch3FieldMapper = new LastMatch3.Mapper();

            @Override
            public C6692Ipl map(ResponseReader responseReader) {
                return new C6692Ipl(responseReader.readString(C6692Ipl.$responseFields[0]), (Basicdetails3) responseReader.readObject(C6692Ipl.$responseFields[1], new ResponseReader.ObjectReader<Basicdetails3>() {

                    @Override
                    public Basicdetails3 read(ResponseReader responseReader) {
                        return Mapper.this.basicdetails3FieldMapper.map(responseReader);
                    }
                }), (DebutMatch3) responseReader.readObject(C6692Ipl.$responseFields[2], new ResponseReader.ObjectReader<DebutMatch3>() {

                    @Override
                    public DebutMatch3 read(ResponseReader responseReader) {
                        return Mapper.this.debutMatch3FieldMapper.map(responseReader);
                    }
                }), (LastMatch3) responseReader.readObject(C6692Ipl.$responseFields[3], new ResponseReader.ObjectReader<LastMatch3>() {

                    @Override
                    public LastMatch3 read(ResponseReader responseReader) {
                        return Mapper.this.lastMatch3FieldMapper.map(responseReader);
                    }
                }), (BattingRecord3) responseReader.readObject(C6692Ipl.$responseFields[4], new ResponseReader.ObjectReader<BattingRecord3>() {

                    @Override
                    public BattingRecord3 read(ResponseReader responseReader) {
                        return Mapper.this.battingRecord3FieldMapper.map(responseReader);
                    }
                }), (BowlingRecord3) responseReader.readObject(C6692Ipl.$responseFields[5], new ResponseReader.ObjectReader<BowlingRecord3>() {


                    @Override
                    public BowlingRecord3 read(ResponseReader responseReader) {
                        return Mapper.this.bowlingRecord3FieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class Basicdetails3 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matches", "matches", null, true, Collections.emptyList()), ResponseField.forString("innings", "innings", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String innings;
        final String matches;

        public Basicdetails3(String str, String str2, String str3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matches = str2;
            this.innings = str3;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matches() {
            return this.matches;
        }

        public String innings() {
            return this.innings;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Basicdetails3.$responseFields[0], Basicdetails3.this.__typename);
                    responseWriter.writeString(Basicdetails3.$responseFields[1], Basicdetails3.this.matches);
                    responseWriter.writeString(Basicdetails3.$responseFields[2], Basicdetails3.this.innings);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Basicdetails3{__typename=" + this.__typename + ", matches=" + this.matches + ", innings=" + this.innings + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Basicdetails3)) {
                return false;
            }
            Basicdetails3 basicdetails3 = (Basicdetails3) obj;
            if (this.__typename.equals(basicdetails3.__typename) && ((str = this.matches) != null ? str.equals(basicdetails3.matches) : basicdetails3.matches == null)) {
                String str2 = this.innings;
                String str3 = basicdetails3.innings;
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
                String str = this.matches;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.innings;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Basicdetails3> {
            @Override
            public Basicdetails3 map(ResponseReader responseReader) {
                return new Basicdetails3(responseReader.readString(Basicdetails3.$responseFields[0]), responseReader.readString(Basicdetails3.$responseFields[1]), responseReader.readString(Basicdetails3.$responseFields[2]));
            }
        }
    }

    public static class DebutMatch3 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchID", "matchID", null, true, Collections.emptyList()), ResponseField.forString("date", "date", null, true, Collections.emptyList()), ResponseField.forString("against", "against", null, true, Collections.emptyList()), ResponseField.forString("againstID", "againstID", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String against;
        final String againstID;
        final String date;
        final String matchID;

        public DebutMatch3(String str, String str2, String str3, String str4, String str5) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchID = str2;
            this.date = str3;
            this.against = str4;
            this.againstID = str5;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchID() {
            return this.matchID;
        }

        public String date() {
            return this.date;
        }

        public String against() {
            return this.against;
        }

        public String againstID() {
            return this.againstID;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(DebutMatch3.$responseFields[0], DebutMatch3.this.__typename);
                    responseWriter.writeString(DebutMatch3.$responseFields[1], DebutMatch3.this.matchID);
                    responseWriter.writeString(DebutMatch3.$responseFields[2], DebutMatch3.this.date);
                    responseWriter.writeString(DebutMatch3.$responseFields[3], DebutMatch3.this.against);
                    responseWriter.writeString(DebutMatch3.$responseFields[4], DebutMatch3.this.againstID);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "DebutMatch3{__typename=" + this.__typename + ", matchID=" + this.matchID + ", date=" + this.date + ", against=" + this.against + ", againstID=" + this.againstID + "}";
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
            if (!(obj instanceof DebutMatch3)) {
                return false;
            }
            DebutMatch3 debutMatch3 = (DebutMatch3) obj;
            if (this.__typename.equals(debutMatch3.__typename) && ((str = this.matchID) != null ? str.equals(debutMatch3.matchID) : debutMatch3.matchID == null) && ((str2 = this.date) != null ? str2.equals(debutMatch3.date) : debutMatch3.date == null) && ((str3 = this.against) != null ? str3.equals(debutMatch3.against) : debutMatch3.against == null)) {
                String str4 = this.againstID;
                String str5 = debutMatch3.againstID;
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
                String str = this.matchID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.date;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.against;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.againstID;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<DebutMatch3> {
            @Override
            public DebutMatch3 map(ResponseReader responseReader) {
                return new DebutMatch3(responseReader.readString(DebutMatch3.$responseFields[0]), responseReader.readString(DebutMatch3.$responseFields[1]), responseReader.readString(DebutMatch3.$responseFields[2]), responseReader.readString(DebutMatch3.$responseFields[3]), responseReader.readString(DebutMatch3.$responseFields[4]));
            }
        }
    }

    public static class LastMatch3 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchID", "matchID", null, true, Collections.emptyList()), ResponseField.forString("date", "date", null, true, Collections.emptyList()), ResponseField.forString("against", "against", null, true, Collections.emptyList()), ResponseField.forString("againstID", "againstID", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String against;
        final String againstID;
        final String date;
        final String matchID;

        public LastMatch3(String str, String str2, String str3, String str4, String str5) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchID = str2;
            this.date = str3;
            this.against = str4;
            this.againstID = str5;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchID() {
            return this.matchID;
        }

        public String date() {
            return this.date;
        }

        public String against() {
            return this.against;
        }

        public String againstID() {
            return this.againstID;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(LastMatch3.$responseFields[0], LastMatch3.this.__typename);
                    responseWriter.writeString(LastMatch3.$responseFields[1], LastMatch3.this.matchID);
                    responseWriter.writeString(LastMatch3.$responseFields[2], LastMatch3.this.date);
                    responseWriter.writeString(LastMatch3.$responseFields[3], LastMatch3.this.against);
                    responseWriter.writeString(LastMatch3.$responseFields[4], LastMatch3.this.againstID);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "LastMatch3{__typename=" + this.__typename + ", matchID=" + this.matchID + ", date=" + this.date + ", against=" + this.against + ", againstID=" + this.againstID + "}";
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
            if (!(obj instanceof LastMatch3)) {
                return false;
            }
            LastMatch3 lastMatch3 = (LastMatch3) obj;
            if (this.__typename.equals(lastMatch3.__typename) && ((str = this.matchID) != null ? str.equals(lastMatch3.matchID) : lastMatch3.matchID == null) && ((str2 = this.date) != null ? str2.equals(lastMatch3.date) : lastMatch3.date == null) && ((str3 = this.against) != null ? str3.equals(lastMatch3.against) : lastMatch3.against == null)) {
                String str4 = this.againstID;
                String str5 = lastMatch3.againstID;
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
                String str = this.matchID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.date;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.against;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.againstID;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<LastMatch3> {
            @Override
            public LastMatch3 map(ResponseReader responseReader) {
                return new LastMatch3(responseReader.readString(LastMatch3.$responseFields[0]), responseReader.readString(LastMatch3.$responseFields[1]), responseReader.readString(LastMatch3.$responseFields[2]), responseReader.readString(LastMatch3.$responseFields[3]), responseReader.readString(LastMatch3.$responseFields[4]));
            }
        }
    }

    public static class BattingRecord3 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("notOuts", "notOuts", null, true, Collections.emptyList()), ResponseField.forString("runs", "runs", null, true, Collections.emptyList()), ResponseField.forString("ballsFaced", "ballsFaced", null, true, Collections.emptyList()), ResponseField.forString("hundreds", "hundreds", null, true, Collections.emptyList()), ResponseField.forString("fifties", "fifties", null, true, Collections.emptyList()), ResponseField.forString("fours", "fours", null, true, Collections.emptyList()), ResponseField.forString("sixes", "sixes", null, true, Collections.emptyList()), ResponseField.forString("average", "average", null, true, Collections.emptyList()), ResponseField.forString("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forString("innings", "innings", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String average;
        final String ballsFaced;
        final String fifties;
        final String fours;
        final String hundreds;
        final String innings;
        final String notOuts;
        final String runs;
        final String sixes;
        final String strikeRate;

        public BattingRecord3(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.notOuts = str2;
            this.runs = str3;
            this.ballsFaced = str4;
            this.hundreds = str5;
            this.fifties = str6;
            this.fours = str7;
            this.sixes = str8;
            this.average = str9;
            this.strikeRate = str10;
            this.innings = str11;
        }

        public String __typename() {
            return this.__typename;
        }

        public String notOuts() {
            return this.notOuts;
        }

        public String runs() {
            return this.runs;
        }

        public String ballsFaced() {
            return this.ballsFaced;
        }

        public String hundreds() {
            return this.hundreds;
        }

        public String fifties() {
            return this.fifties;
        }

        public String fours() {
            return this.fours;
        }

        public String sixes() {
            return this.sixes;
        }

        public String average() {
            return this.average;
        }

        public String strikeRate() {
            return this.strikeRate;
        }

        public String innings() {
            return this.innings;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BattingRecord3.$responseFields[0], BattingRecord3.this.__typename);
                    responseWriter.writeString(BattingRecord3.$responseFields[1], BattingRecord3.this.notOuts);
                    responseWriter.writeString(BattingRecord3.$responseFields[2], BattingRecord3.this.runs);
                    responseWriter.writeString(BattingRecord3.$responseFields[3], BattingRecord3.this.ballsFaced);
                    responseWriter.writeString(BattingRecord3.$responseFields[4], BattingRecord3.this.hundreds);
                    responseWriter.writeString(BattingRecord3.$responseFields[5], BattingRecord3.this.fifties);
                    responseWriter.writeString(BattingRecord3.$responseFields[6], BattingRecord3.this.fours);
                    responseWriter.writeString(BattingRecord3.$responseFields[7], BattingRecord3.this.sixes);
                    responseWriter.writeString(BattingRecord3.$responseFields[8], BattingRecord3.this.average);
                    responseWriter.writeString(BattingRecord3.$responseFields[9], BattingRecord3.this.strikeRate);
                    responseWriter.writeString(BattingRecord3.$responseFields[10], BattingRecord3.this.innings);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BattingRecord3{__typename=" + this.__typename + ", notOuts=" + this.notOuts + ", runs=" + this.runs + ", ballsFaced=" + this.ballsFaced + ", hundreds=" + this.hundreds + ", fifties=" + this.fifties + ", fours=" + this.fours + ", sixes=" + this.sixes + ", average=" + this.average + ", strikeRate=" + this.strikeRate + ", innings=" + this.innings + "}";
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
            if (!(obj instanceof BattingRecord3)) {
                return false;
            }
            BattingRecord3 battingRecord3 = (BattingRecord3) obj;
            if (this.__typename.equals(battingRecord3.__typename) && ((str = this.notOuts) != null ? str.equals(battingRecord3.notOuts) : battingRecord3.notOuts == null) && ((str2 = this.runs) != null ? str2.equals(battingRecord3.runs) : battingRecord3.runs == null) && ((str3 = this.ballsFaced) != null ? str3.equals(battingRecord3.ballsFaced) : battingRecord3.ballsFaced == null) && ((str4 = this.hundreds) != null ? str4.equals(battingRecord3.hundreds) : battingRecord3.hundreds == null) && ((str5 = this.fifties) != null ? str5.equals(battingRecord3.fifties) : battingRecord3.fifties == null) && ((str6 = this.fours) != null ? str6.equals(battingRecord3.fours) : battingRecord3.fours == null) && ((str7 = this.sixes) != null ? str7.equals(battingRecord3.sixes) : battingRecord3.sixes == null) && ((str8 = this.average) != null ? str8.equals(battingRecord3.average) : battingRecord3.average == null) && ((str9 = this.strikeRate) != null ? str9.equals(battingRecord3.strikeRate) : battingRecord3.strikeRate == null)) {
                String str10 = this.innings;
                String str11 = battingRecord3.innings;
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
                String str = this.notOuts;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.runs;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.ballsFaced;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.hundreds;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.fifties;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.fours;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.sixes;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.average;
                int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.strikeRate;
                int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.innings;
                if (str10 != null) {
                    i = str10.hashCode();
                }
                this.$hashCode = hashCode10 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BattingRecord3> {
            @Override
            public BattingRecord3 map(ResponseReader responseReader) {
                return new BattingRecord3(responseReader.readString(BattingRecord3.$responseFields[0]), responseReader.readString(BattingRecord3.$responseFields[1]), responseReader.readString(BattingRecord3.$responseFields[2]), responseReader.readString(BattingRecord3.$responseFields[3]), responseReader.readString(BattingRecord3.$responseFields[4]), responseReader.readString(BattingRecord3.$responseFields[5]), responseReader.readString(BattingRecord3.$responseFields[6]), responseReader.readString(BattingRecord3.$responseFields[7]), responseReader.readString(BattingRecord3.$responseFields[8]), responseReader.readString(BattingRecord3.$responseFields[9]), responseReader.readString(BattingRecord3.$responseFields[10]));
            }
        }
    }

    public static class BowlingRecord3 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("overs", "overs", null, true, Collections.emptyList()), ResponseField.forString("wickets", "wickets", null, true, Collections.emptyList()), ResponseField.forString("ballsBowled", "ballsBowled", null, true, Collections.emptyList()), ResponseField.forString("average", "average", null, true, Collections.emptyList()), ResponseField.forString("strikeRate", "strikeRate", null, true, Collections.emptyList()), ResponseField.forString("economyRate", "economyRate", null, true, Collections.emptyList()), ResponseField.forString("fiveWicketHauls", "fiveWicketHauls", null, true, Collections.emptyList()), ResponseField.forString("innings", "innings", null, true, Collections.emptyList()), ResponseField.forString("bestBowling", "bestBowling", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String average;
        final String ballsBowled;
        final String bestBowling;
        final String economyRate;
        final String fiveWicketHauls;
        final String innings;
        final String overs;
        final String strikeRate;
        final String wickets;

        public BowlingRecord3(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.overs = str2;
            this.wickets = str3;
            this.ballsBowled = str4;
            this.average = str5;
            this.strikeRate = str6;
            this.economyRate = str7;
            this.fiveWicketHauls = str8;
            this.innings = str9;
            this.bestBowling = str10;
        }

        public String __typename() {
            return this.__typename;
        }

        public String overs() {
            return this.overs;
        }

        public String wickets() {
            return this.wickets;
        }

        public String ballsBowled() {
            return this.ballsBowled;
        }

        public String average() {
            return this.average;
        }

        public String strikeRate() {
            return this.strikeRate;
        }

        public String economyRate() {
            return this.economyRate;
        }

        public String fiveWicketHauls() {
            return this.fiveWicketHauls;
        }

        public String innings() {
            return this.innings;
        }

        public String bestBowling() {
            return this.bestBowling;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(BowlingRecord3.$responseFields[0], BowlingRecord3.this.__typename);
                    responseWriter.writeString(BowlingRecord3.$responseFields[1], BowlingRecord3.this.overs);
                    responseWriter.writeString(BowlingRecord3.$responseFields[2], BowlingRecord3.this.wickets);
                    responseWriter.writeString(BowlingRecord3.$responseFields[3], BowlingRecord3.this.ballsBowled);
                    responseWriter.writeString(BowlingRecord3.$responseFields[4], BowlingRecord3.this.average);
                    responseWriter.writeString(BowlingRecord3.$responseFields[5], BowlingRecord3.this.strikeRate);
                    responseWriter.writeString(BowlingRecord3.$responseFields[6], BowlingRecord3.this.economyRate);
                    responseWriter.writeString(BowlingRecord3.$responseFields[7], BowlingRecord3.this.fiveWicketHauls);
                    responseWriter.writeString(BowlingRecord3.$responseFields[8], BowlingRecord3.this.innings);
                    responseWriter.writeString(BowlingRecord3.$responseFields[9], BowlingRecord3.this.bestBowling);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "BowlingRecord3{__typename=" + this.__typename + ", overs=" + this.overs + ", wickets=" + this.wickets + ", ballsBowled=" + this.ballsBowled + ", average=" + this.average + ", strikeRate=" + this.strikeRate + ", economyRate=" + this.economyRate + ", fiveWicketHauls=" + this.fiveWicketHauls + ", innings=" + this.innings + ", bestBowling=" + this.bestBowling + "}";
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
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BowlingRecord3)) {
                return false;
            }
            BowlingRecord3 bowlingRecord3 = (BowlingRecord3) obj;
            if (this.__typename.equals(bowlingRecord3.__typename) && ((str = this.overs) != null ? str.equals(bowlingRecord3.overs) : bowlingRecord3.overs == null) && ((str2 = this.wickets) != null ? str2.equals(bowlingRecord3.wickets) : bowlingRecord3.wickets == null) && ((str3 = this.ballsBowled) != null ? str3.equals(bowlingRecord3.ballsBowled) : bowlingRecord3.ballsBowled == null) && ((str4 = this.average) != null ? str4.equals(bowlingRecord3.average) : bowlingRecord3.average == null) && ((str5 = this.strikeRate) != null ? str5.equals(bowlingRecord3.strikeRate) : bowlingRecord3.strikeRate == null) && ((str6 = this.economyRate) != null ? str6.equals(bowlingRecord3.economyRate) : bowlingRecord3.economyRate == null) && ((str7 = this.fiveWicketHauls) != null ? str7.equals(bowlingRecord3.fiveWicketHauls) : bowlingRecord3.fiveWicketHauls == null) && ((str8 = this.innings) != null ? str8.equals(bowlingRecord3.innings) : bowlingRecord3.innings == null)) {
                String str9 = this.bestBowling;
                String str10 = bowlingRecord3.bestBowling;
                if (str9 == null) {
                    if (str10 == null) {
                        return true;
                    }
                } else if (str9.equals(str10)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.overs;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.wickets;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.ballsBowled;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.average;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.strikeRate;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.economyRate;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.fiveWicketHauls;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.innings;
                int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.bestBowling;
                if (str9 != null) {
                    i = str9.hashCode();
                }
                this.$hashCode = hashCode9 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<BowlingRecord3> {
            @Override
            public BowlingRecord3 map(ResponseReader responseReader) {
                return new BowlingRecord3(responseReader.readString(BowlingRecord3.$responseFields[0]), responseReader.readString(BowlingRecord3.$responseFields[1]), responseReader.readString(BowlingRecord3.$responseFields[2]), responseReader.readString(BowlingRecord3.$responseFields[3]), responseReader.readString(BowlingRecord3.$responseFields[4]), responseReader.readString(BowlingRecord3.$responseFields[5]), responseReader.readString(BowlingRecord3.$responseFields[6]), responseReader.readString(BowlingRecord3.$responseFields[7]), responseReader.readString(BowlingRecord3.$responseFields[8]), responseReader.readString(BowlingRecord3.$responseFields[9]));
            }
        }
    }
}
