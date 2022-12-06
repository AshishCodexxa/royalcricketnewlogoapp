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
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

public final class PhaseOfSessionsQuery implements Query<PhaseOfSessionsQuery.Data, PhaseOfSessionsQuery.Data, PhaseOfSessionsQuery.Variables> {
    public static final String OPERATION_ID = "d74809afd8c2977037c5368934ec178f17a52fc951527bde63c149a19ca8a617";
    public static final OperationName OPERATION_NAME = new OperationName() {

       @Override
        public String name() {
            return "phaseOfSessions";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query phaseOfSessions($matchID: String!, $day: Int!) {\n  phaseOfSessions(matchID: $matchID, day: $day) {\n    __typename\n    phaseOfSession {\n      __typename\n      session\n      totalOvers\n      totalWickets\n      totalRuns\n      overs {\n        __typename\n        over\n        runs\n        wicket\n        teamId\n      }\n    }\n    cricPrediction {\n      __typename\n      currentOverNo\n      currentScore\n      teamId\n      currentWicket\n      teamShortName\n      predectedScore\n      predictedOver\n      predictedWicket\n    }\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public PhaseOfSessionsQuery(String str, int i) {
        Utils.checkNotNull(str, "matchID == null");
        this.variables = new Variables(str, i);
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
        private int day;
        private String matchID;

        Builder() {
        }

        public Builder matchID(String str) {
            this.matchID = str;
            return this;
        }

        public Builder day(int i) {
            this.day = i;
            return this;
        }

        public PhaseOfSessionsQuery build() {
            Utils.checkNotNull(this.matchID, "matchID == null");
            return new PhaseOfSessionsQuery(this.matchID, this.day);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final int day;
        private final String matchID;
        private final transient Map<String, Object> valueMap;

        Variables(String str, int i) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.matchID = str;
            this.day = i;
            linkedHashMap.put("matchID", str);
            linkedHashMap.put("day", Integer.valueOf(i));
        }

        public String matchID() {
            return this.matchID;
        }

        public int day() {
            return this.day;
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
                    inputFieldWriter.writeInt("day", Integer.valueOf(Variables.this.day));
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("phaseOfSessions", "phaseOfSessions", new UnmodifiableMapBuilder(2).put("matchID", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "matchID").build()).put("day", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "day").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final PhaseOfSessions phaseOfSessions;

        public Data(PhaseOfSessions phaseOfSessions2) {
            this.phaseOfSessions = phaseOfSessions2;
        }

        public PhaseOfSessions phaseOfSessions() {
            return this.phaseOfSessions;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.phaseOfSessions != null ? Data.this.phaseOfSessions.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{phaseOfSessions=" + this.phaseOfSessions + "}";
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
            PhaseOfSessions phaseOfSessions2 = this.phaseOfSessions;
            PhaseOfSessions phaseOfSessions3 = ((Data) obj).phaseOfSessions;
            if (phaseOfSessions2 != null) {
                return phaseOfSessions2.equals(phaseOfSessions3);
            }
            if (phaseOfSessions3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                PhaseOfSessions phaseOfSessions2 = this.phaseOfSessions;
                this.$hashCode = 1000003 ^ (phaseOfSessions2 == null ? 0 : phaseOfSessions2.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final PhaseOfSessions.Mapper phaseOfSessionsFieldMapper = new PhaseOfSessions.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((PhaseOfSessions) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<PhaseOfSessions>() {

                    @Override 
                    public PhaseOfSessions read(ResponseReader responseReader) {
                        return Mapper.this.phaseOfSessionsFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class PhaseOfSessions {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("phaseOfSession", "phaseOfSession", null, true, Collections.emptyList()), ResponseField.forObject("cricPrediction", "cricPrediction", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final CricPrediction cricPrediction;
        final List<PhaseOfSession> phaseOfSession;

        public PhaseOfSessions(String str, List<PhaseOfSession> list, CricPrediction cricPrediction2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.phaseOfSession = list;
            this.cricPrediction = cricPrediction2;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<PhaseOfSession> phaseOfSession() {
            return this.phaseOfSession;
        }

        public CricPrediction cricPrediction() {
            return this.cricPrediction;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(PhaseOfSessions.$responseFields[0], PhaseOfSessions.this.__typename);
                    responseWriter.writeList(PhaseOfSessions.$responseFields[1], PhaseOfSessions.this.phaseOfSession, new ResponseWriter.ListWriter() {

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((PhaseOfSession) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeObject(PhaseOfSessions.$responseFields[2], PhaseOfSessions.this.cricPrediction != null ? PhaseOfSessions.this.cricPrediction.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "PhaseOfSessions{__typename=" + this.__typename + ", phaseOfSession=" + this.phaseOfSession + ", cricPrediction=" + this.cricPrediction + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<PhaseOfSession> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PhaseOfSessions)) {
                return false;
            }
            PhaseOfSessions phaseOfSessions = (PhaseOfSessions) obj;
            if (this.__typename.equals(phaseOfSessions.__typename) && ((list = this.phaseOfSession) != null ? list.equals(phaseOfSessions.phaseOfSession) : phaseOfSessions.phaseOfSession == null)) {
                CricPrediction cricPrediction2 = this.cricPrediction;
                CricPrediction cricPrediction3 = phaseOfSessions.cricPrediction;
                if (cricPrediction2 == null) {
                    if (cricPrediction3 == null) {
                        return true;
                    }
                } else if (cricPrediction2.equals(cricPrediction3)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                List<PhaseOfSession> list = this.phaseOfSession;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                CricPrediction cricPrediction2 = this.cricPrediction;
                if (cricPrediction2 != null) {
                    i = cricPrediction2.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<PhaseOfSessions> {
            final CricPrediction.Mapper cricPredictionFieldMapper = new CricPrediction.Mapper();
            final PhaseOfSession.Mapper phaseOfSessionFieldMapper = new PhaseOfSession.Mapper();

            @Override 
            public PhaseOfSessions map(ResponseReader responseReader) {
                return new PhaseOfSessions(responseReader.readString(PhaseOfSessions.$responseFields[0]), responseReader.readList(PhaseOfSessions.$responseFields[1], new ResponseReader.ListReader<PhaseOfSession>() {

                    @Override 
                    public PhaseOfSession read(ResponseReader.ListItemReader listItemReader) {
                        return (PhaseOfSession) listItemReader.readObject(new ResponseReader.ObjectReader<PhaseOfSession>() {

                            @Override 
                            public PhaseOfSession read(ResponseReader responseReader) {
                                return Mapper.this.phaseOfSessionFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), (CricPrediction) responseReader.readObject(PhaseOfSessions.$responseFields[2], new ResponseReader.ObjectReader<CricPrediction>() {

                    @Override 
                    public CricPrediction read(ResponseReader responseReader) {
                        return Mapper.this.cricPredictionFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class PhaseOfSession {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forInt("session", "session", null, true, Collections.emptyList()), ResponseField.forInt("totalOvers", "totalOvers", null, true, Collections.emptyList()), ResponseField.forInt("totalWickets", "totalWickets", null, true, Collections.emptyList()), ResponseField.forInt("totalRuns", "totalRuns", null, true, Collections.emptyList()), ResponseField.forList("overs", "overs", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Over> overs;
        final Integer session;
        final Integer totalOvers;
        final Integer totalRuns;
        final Integer totalWickets;

        public PhaseOfSession(String str, Integer num, Integer num2, Integer num3, Integer num4, List<Over> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.session = num;
            this.totalOvers = num2;
            this.totalWickets = num3;
            this.totalRuns = num4;
            this.overs = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public Integer session() {
            return this.session;
        }

        public Integer totalOvers() {
            return this.totalOvers;
        }

        public Integer totalWickets() {
            return this.totalWickets;
        }

        public Integer totalRuns() {
            return this.totalRuns;
        }

        public List<Over> overs() {
            return this.overs;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(PhaseOfSession.$responseFields[0], PhaseOfSession.this.__typename);
                    responseWriter.writeInt(PhaseOfSession.$responseFields[1], PhaseOfSession.this.session);
                    responseWriter.writeInt(PhaseOfSession.$responseFields[2], PhaseOfSession.this.totalOvers);
                    responseWriter.writeInt(PhaseOfSession.$responseFields[3], PhaseOfSession.this.totalWickets);
                    responseWriter.writeInt(PhaseOfSession.$responseFields[4], PhaseOfSession.this.totalRuns);
                    responseWriter.writeList(PhaseOfSession.$responseFields[5], PhaseOfSession.this.overs, new ResponseWriter.ListWriter() {

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Over) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "PhaseOfSession{__typename=" + this.__typename + ", session=" + this.session + ", totalOvers=" + this.totalOvers + ", totalWickets=" + this.totalWickets + ", totalRuns=" + this.totalRuns + ", overs=" + this.overs + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PhaseOfSession)) {
                return false;
            }
            PhaseOfSession phaseOfSession = (PhaseOfSession) obj;
            if (this.__typename.equals(phaseOfSession.__typename) && ((num = this.session) != null ? num.equals(phaseOfSession.session) : phaseOfSession.session == null) && ((num2 = this.totalOvers) != null ? num2.equals(phaseOfSession.totalOvers) : phaseOfSession.totalOvers == null) && ((num3 = this.totalWickets) != null ? num3.equals(phaseOfSession.totalWickets) : phaseOfSession.totalWickets == null) && ((num4 = this.totalRuns) != null ? num4.equals(phaseOfSession.totalRuns) : phaseOfSession.totalRuns == null)) {
                List<Over> list = this.overs;
                List<Over> list2 = phaseOfSession.overs;
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
                Integer num = this.session;
                int i = 0;
                int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.totalOvers;
                int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                Integer num3 = this.totalWickets;
                int hashCode4 = (hashCode3 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                Integer num4 = this.totalRuns;
                int hashCode5 = (hashCode4 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
                List<Over> list = this.overs;
                if (list != null) {
                    i = list.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<PhaseOfSession> {
            final Over.Mapper overFieldMapper = new Over.Mapper();

            @Override 
            public PhaseOfSession map(ResponseReader responseReader) {
                return new PhaseOfSession(responseReader.readString(PhaseOfSession.$responseFields[0]), responseReader.readInt(PhaseOfSession.$responseFields[1]), responseReader.readInt(PhaseOfSession.$responseFields[2]), responseReader.readInt(PhaseOfSession.$responseFields[3]), responseReader.readInt(PhaseOfSession.$responseFields[4]), responseReader.readList(PhaseOfSession.$responseFields[5], new ResponseReader.ListReader<Over>() {

                    @Override 
                    public Over read(ResponseReader.ListItemReader listItemReader) {
                        return (Over) listItemReader.readObject(new ResponseReader.ObjectReader<Over>() {

                            @Override 
                            public Over read(ResponseReader responseReader) {
                                return Mapper.this.overFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class Over {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("over", "over", null, true, Collections.emptyList()), ResponseField.forString("runs", "runs", null, true, Collections.emptyList()), ResponseField.forString("wicket", "wicket", null, true, Collections.emptyList()), ResponseField.forString("teamId", "teamId", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String over;
        final String runs;
        final String teamId;
        final String wicket;

        public Over(String str, String str2, String str3, String str4, String str5) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.over = str2;
            this.runs = str3;
            this.wicket = str4;
            this.teamId = str5;
        }

        public String __typename() {
            return this.__typename;
        }

        public String over() {
            return this.over;
        }

        public String runs() {
            return this.runs;
        }

        public String wicket() {
            return this.wicket;
        }

        public String teamId() {
            return this.teamId;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Over.$responseFields[0], Over.this.__typename);
                    responseWriter.writeString(Over.$responseFields[1], Over.this.over);
                    responseWriter.writeString(Over.$responseFields[2], Over.this.runs);
                    responseWriter.writeString(Over.$responseFields[3], Over.this.wicket);
                    responseWriter.writeString(Over.$responseFields[4], Over.this.teamId);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Over{__typename=" + this.__typename + ", over=" + this.over + ", runs=" + this.runs + ", wicket=" + this.wicket + ", teamId=" + this.teamId + "}";
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
            if (!(obj instanceof Over)) {
                return false;
            }
            Over over2 = (Over) obj;
            if (this.__typename.equals(over2.__typename) && ((str = this.over) != null ? str.equals(over2.over) : over2.over == null) && ((str2 = this.runs) != null ? str2.equals(over2.runs) : over2.runs == null) && ((str3 = this.wicket) != null ? str3.equals(over2.wicket) : over2.wicket == null)) {
                String str4 = this.teamId;
                String str5 = over2.teamId;
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
                String str = this.over;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.runs;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.wicket;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.teamId;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Over> {
            @Override 
            public Over map(ResponseReader responseReader) {
                return new Over(responseReader.readString(Over.$responseFields[0]), responseReader.readString(Over.$responseFields[1]), responseReader.readString(Over.$responseFields[2]), responseReader.readString(Over.$responseFields[3]), responseReader.readString(Over.$responseFields[4]));
            }
        }
    }

    public static class CricPrediction {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("currentOverNo", "currentOverNo", null, true, Collections.emptyList()), ResponseField.forString("currentScore", "currentScore", null, true, Collections.emptyList()), ResponseField.forString("teamId", "teamId", null, true, Collections.emptyList()), ResponseField.forString("currentWicket", "currentWicket", null, true, Collections.emptyList()), ResponseField.forString("teamShortName", "teamShortName", null, true, Collections.emptyList()), ResponseField.forString("predectedScore", "predectedScore", null, true, Collections.emptyList()), ResponseField.forString("predictedOver", "predictedOver", null, true, Collections.emptyList()), ResponseField.forString("predictedWicket", "predictedWicket", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String currentOverNo;
        final String currentScore;
        final String currentWicket;
        final String predectedScore;
        final String predictedOver;
        final String predictedWicket;
        final String teamId;
        final String teamShortName;

        public CricPrediction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.currentOverNo = str2;
            this.currentScore = str3;
            this.teamId = str4;
            this.currentWicket = str5;
            this.teamShortName = str6;
            this.predectedScore = str7;
            this.predictedOver = str8;
            this.predictedWicket = str9;
        }

        public String __typename() {
            return this.__typename;
        }

        public String currentOverNo() {
            return this.currentOverNo;
        }

        public String currentScore() {
            return this.currentScore;
        }

        public String teamId() {
            return this.teamId;
        }

        public String currentWicket() {
            return this.currentWicket;
        }

        public String teamShortName() {
            return this.teamShortName;
        }

        public String predectedScore() {
            return this.predectedScore;
        }

        public String predictedOver() {
            return this.predictedOver;
        }

        public String predictedWicket() {
            return this.predictedWicket;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(CricPrediction.$responseFields[0], CricPrediction.this.__typename);
                    responseWriter.writeString(CricPrediction.$responseFields[1], CricPrediction.this.currentOverNo);
                    responseWriter.writeString(CricPrediction.$responseFields[2], CricPrediction.this.currentScore);
                    responseWriter.writeString(CricPrediction.$responseFields[3], CricPrediction.this.teamId);
                    responseWriter.writeString(CricPrediction.$responseFields[4], CricPrediction.this.currentWicket);
                    responseWriter.writeString(CricPrediction.$responseFields[5], CricPrediction.this.teamShortName);
                    responseWriter.writeString(CricPrediction.$responseFields[6], CricPrediction.this.predectedScore);
                    responseWriter.writeString(CricPrediction.$responseFields[7], CricPrediction.this.predictedOver);
                    responseWriter.writeString(CricPrediction.$responseFields[8], CricPrediction.this.predictedWicket);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "CricPrediction{__typename=" + this.__typename + ", currentOverNo=" + this.currentOverNo + ", currentScore=" + this.currentScore + ", teamId=" + this.teamId + ", currentWicket=" + this.currentWicket + ", teamShortName=" + this.teamShortName + ", predectedScore=" + this.predectedScore + ", predictedOver=" + this.predictedOver + ", predictedWicket=" + this.predictedWicket + "}";
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
            if (!(obj instanceof CricPrediction)) {
                return false;
            }
            CricPrediction cricPrediction = (CricPrediction) obj;
            if (this.__typename.equals(cricPrediction.__typename) && ((str = this.currentOverNo) != null ? str.equals(cricPrediction.currentOverNo) : cricPrediction.currentOverNo == null) && ((str2 = this.currentScore) != null ? str2.equals(cricPrediction.currentScore) : cricPrediction.currentScore == null) && ((str3 = this.teamId) != null ? str3.equals(cricPrediction.teamId) : cricPrediction.teamId == null) && ((str4 = this.currentWicket) != null ? str4.equals(cricPrediction.currentWicket) : cricPrediction.currentWicket == null) && ((str5 = this.teamShortName) != null ? str5.equals(cricPrediction.teamShortName) : cricPrediction.teamShortName == null) && ((str6 = this.predectedScore) != null ? str6.equals(cricPrediction.predectedScore) : cricPrediction.predectedScore == null) && ((str7 = this.predictedOver) != null ? str7.equals(cricPrediction.predictedOver) : cricPrediction.predictedOver == null)) {
                String str8 = this.predictedWicket;
                String str9 = cricPrediction.predictedWicket;
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
                String str = this.currentOverNo;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.currentScore;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.teamId;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.currentWicket;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.teamShortName;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.predectedScore;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.predictedOver;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.predictedWicket;
                if (str8 != null) {
                    i = str8.hashCode();
                }
                this.$hashCode = hashCode8 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<CricPrediction> {
            @Override 
            public CricPrediction map(ResponseReader responseReader) {
                return new CricPrediction(responseReader.readString(CricPrediction.$responseFields[0]), responseReader.readString(CricPrediction.$responseFields[1]), responseReader.readString(CricPrediction.$responseFields[2]), responseReader.readString(CricPrediction.$responseFields[3]), responseReader.readString(CricPrediction.$responseFields[4]), responseReader.readString(CricPrediction.$responseFields[5]), responseReader.readString(CricPrediction.$responseFields[6]), responseReader.readString(CricPrediction.$responseFields[7]), responseReader.readString(CricPrediction.$responseFields[8]));
            }
        }
    }
}
