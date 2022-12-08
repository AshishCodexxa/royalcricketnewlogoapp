package com.cricketlivescore.predictiontips;

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

public final class MatchupsByIdQuery implements Query<MatchupsByIdQuery.Data, MatchupsByIdQuery.Data, MatchupsByIdQuery.Variables> {
    public static final String OPERATION_ID = "ec94ea8c017a36d2762bbc473b14a9e327fbfe59a9c7127382950ac184c7925e";
    public static final OperationName OPERATION_NAME = new OperationName() {

       @Override
        public String name() {
            return "matchupsById";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query matchupsById($crictecMatchId: String) {\n  matchupsById(crictecMatchId: $crictecMatchId) {\n    __typename\n    crictecMatchId\n    matchUpData {\n      __typename\n      player1\n      player2\n      player1Team\n      player2Team\n      player1Role\n      player2Role\n      ballsFaced\n      runsScored\n      battingSR\n      bowlingSR\n      status\n      player1Name\n      player2Name\n      Dismissals\n    }\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public MatchupsByIdQuery(Input<String> input) {
        Utils.checkNotNull(input, "crictecMatchId == null");
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
        private Input<String> crictecMatchId = Input.absent();

        Builder() {
        }

        public Builder crictecMatchId(String str) {
            this.crictecMatchId = Input.fromNullable(str);
            return this;
        }

        public Builder crictecMatchIdInput(Input<String> input) {
            this.crictecMatchId = (Input) Utils.checkNotNull(input, "crictecMatchId == null");
            return this;
        }

        public MatchupsByIdQuery build() {
            return new MatchupsByIdQuery(this.crictecMatchId);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final Input<String> crictecMatchId;
        private final transient Map<String, Object> valueMap;

        Variables(Input<String> input) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.crictecMatchId = input;
            if (input.defined) {
                linkedHashMap.put("crictecMatchId", input.value);
            }
        }

        public Input<String> crictecMatchId() {
            return this.crictecMatchId;
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
                    if (Variables.this.crictecMatchId.defined) {
                        inputFieldWriter.writeString("crictecMatchId", Variables.this.crictecMatchId.value);
                    }
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("matchupsById", "matchupsById", new UnmodifiableMapBuilder(1).put("crictecMatchId", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "crictecMatchId").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final MatchupsById matchupsById;

        public Data(MatchupsById matchupsById2) {
            this.matchupsById = matchupsById2;
        }

        public MatchupsById matchupsById() {
            return this.matchupsById;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.matchupsById != null ? Data.this.matchupsById.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{matchupsById=" + this.matchupsById + "}";
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
            MatchupsById matchupsById2 = this.matchupsById;
            MatchupsById matchupsById3 = ((Data) obj).matchupsById;
            if (matchupsById2 != null) {
                return matchupsById2.equals(matchupsById3);
            }
            if (matchupsById3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                MatchupsById matchupsById2 = this.matchupsById;
                this.$hashCode = 1000003 ^ (matchupsById2 == null ? 0 : matchupsById2.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final MatchupsById.Mapper matchupsByIdFieldMapper = new MatchupsById.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((MatchupsById) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<MatchupsById>() {


                    @Override 
                    public MatchupsById read(ResponseReader responseReader) {
                        return Mapper.this.matchupsByIdFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class MatchupsById {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("crictecMatchId", "crictecMatchId", null, true, Collections.emptyList()), ResponseField.forList("matchUpData", "matchUpData", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String crictecMatchId;
        final List<MatchUpDatum> matchUpData;

        public MatchupsById(String str, String str2, List<MatchUpDatum> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.crictecMatchId = str2;
            this.matchUpData = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public String crictecMatchId() {
            return this.crictecMatchId;
        }

        public List<MatchUpDatum> matchUpData() {
            return this.matchUpData;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(MatchupsById.$responseFields[0], MatchupsById.this.__typename);
                    responseWriter.writeString(MatchupsById.$responseFields[1], MatchupsById.this.crictecMatchId);
                    responseWriter.writeList(MatchupsById.$responseFields[2], MatchupsById.this.matchUpData, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((MatchUpDatum) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "MatchupsById{__typename=" + this.__typename + ", crictecMatchId=" + this.crictecMatchId + ", matchUpData=" + this.matchUpData + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MatchupsById)) {
                return false;
            }
            MatchupsById matchupsById = (MatchupsById) obj;
            if (this.__typename.equals(matchupsById.__typename) && ((str = this.crictecMatchId) != null ? str.equals(matchupsById.crictecMatchId) : matchupsById.crictecMatchId == null)) {
                List<MatchUpDatum> list = this.matchUpData;
                List<MatchUpDatum> list2 = matchupsById.matchUpData;
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
                String str = this.crictecMatchId;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                List<MatchUpDatum> list = this.matchUpData;
                if (list != null) {
                    i = list.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<MatchupsById> {
            final MatchUpDatum.Mapper matchUpDatumFieldMapper = new MatchUpDatum.Mapper();

            @Override 
            public MatchupsById map(ResponseReader responseReader) {
                return new MatchupsById(responseReader.readString(MatchupsById.$responseFields[0]), responseReader.readString(MatchupsById.$responseFields[1]), responseReader.readList(MatchupsById.$responseFields[2], new ResponseReader.ListReader<MatchUpDatum>() {


                    @Override 
                    public MatchUpDatum read(ResponseReader.ListItemReader listItemReader) {
                        return (MatchUpDatum) listItemReader.readObject(new ResponseReader.ObjectReader<MatchUpDatum>() {


                            @Override 
                            public MatchUpDatum read(ResponseReader responseReader) {
                                return Mapper.this.matchUpDatumFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class MatchUpDatum {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("player1", "player1", null, true, Collections.emptyList()), ResponseField.forString("player2", "player2", null, true, Collections.emptyList()), ResponseField.forString("player1Team", "player1Team", null, true, Collections.emptyList()), ResponseField.forString("player2Team", "player2Team", null, true, Collections.emptyList()), ResponseField.forString("player1Role", "player1Role", null, true, Collections.emptyList()), ResponseField.forString("player2Role", "player2Role", null, true, Collections.emptyList()), ResponseField.forInt("ballsFaced", "ballsFaced", null, true, Collections.emptyList()), ResponseField.forInt("runsScored", "runsScored", null, true, Collections.emptyList()), ResponseField.forString("battingSR", "battingSR", null, true, Collections.emptyList()), ResponseField.forString("bowlingSR", "bowlingSR", null, true, Collections.emptyList()), ResponseField.forString(NotificationCompat.CATEGORY_STATUS, NotificationCompat.CATEGORY_STATUS, null, true, Collections.emptyList()), ResponseField.forString("player1Name", "player1Name", null, true, Collections.emptyList()), ResponseField.forString("player2Name", "player2Name", null, true, Collections.emptyList()), ResponseField.forString("Dismissals", "Dismissals", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String Dismissals;
        final String __typename;
        final Integer ballsFaced;
        final String battingSR;
        final String bowlingSR;
        final String player1;
        final String player1Name;
        final String player1Role;
        final String player1Team;
        final String player2;
        final String player2Name;
        final String player2Role;
        final String player2Team;
        final Integer runsScored;
        final String status;

        public MatchUpDatum(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, String str8, String str9, String str10, String str11, String str12, String str13) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.player1 = str2;
            this.player2 = str3;
            this.player1Team = str4;
            this.player2Team = str5;
            this.player1Role = str6;
            this.player2Role = str7;
            this.ballsFaced = num;
            this.runsScored = num2;
            this.battingSR = str8;
            this.bowlingSR = str9;
            this.status = str10;
            this.player1Name = str11;
            this.player2Name = str12;
            this.Dismissals = str13;
        }

        public String __typename() {
            return this.__typename;
        }

        public String player1() {
            return this.player1;
        }

        public String player2() {
            return this.player2;
        }

        public String player1Team() {
            return this.player1Team;
        }

        public String player2Team() {
            return this.player2Team;
        }

        public String player1Role() {
            return this.player1Role;
        }

        public String player2Role() {
            return this.player2Role;
        }

        public Integer ballsFaced() {
            return this.ballsFaced;
        }

        public Integer runsScored() {
            return this.runsScored;
        }

        public String battingSR() {
            return this.battingSR;
        }

        public String bowlingSR() {
            return this.bowlingSR;
        }

        public String status() {
            return this.status;
        }

        public String player1Name() {
            return this.player1Name;
        }

        public String player2Name() {
            return this.player2Name;
        }

        public String Dismissals() {
            return this.Dismissals;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(MatchUpDatum.$responseFields[0], MatchUpDatum.this.__typename);
                    responseWriter.writeString(MatchUpDatum.$responseFields[1], MatchUpDatum.this.player1);
                    responseWriter.writeString(MatchUpDatum.$responseFields[2], MatchUpDatum.this.player2);
                    responseWriter.writeString(MatchUpDatum.$responseFields[3], MatchUpDatum.this.player1Team);
                    responseWriter.writeString(MatchUpDatum.$responseFields[4], MatchUpDatum.this.player2Team);
                    responseWriter.writeString(MatchUpDatum.$responseFields[5], MatchUpDatum.this.player1Role);
                    responseWriter.writeString(MatchUpDatum.$responseFields[6], MatchUpDatum.this.player2Role);
                    responseWriter.writeInt(MatchUpDatum.$responseFields[7], MatchUpDatum.this.ballsFaced);
                    responseWriter.writeInt(MatchUpDatum.$responseFields[8], MatchUpDatum.this.runsScored);
                    responseWriter.writeString(MatchUpDatum.$responseFields[9], MatchUpDatum.this.battingSR);
                    responseWriter.writeString(MatchUpDatum.$responseFields[10], MatchUpDatum.this.bowlingSR);
                    responseWriter.writeString(MatchUpDatum.$responseFields[11], MatchUpDatum.this.status);
                    responseWriter.writeString(MatchUpDatum.$responseFields[12], MatchUpDatum.this.player1Name);
                    responseWriter.writeString(MatchUpDatum.$responseFields[13], MatchUpDatum.this.player2Name);
                    responseWriter.writeString(MatchUpDatum.$responseFields[14], MatchUpDatum.this.Dismissals);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "MatchUpDatum{__typename=" + this.__typename + ", player1=" + this.player1 + ", player2=" + this.player2 + ", player1Team=" + this.player1Team + ", player2Team=" + this.player2Team + ", player1Role=" + this.player1Role + ", player2Role=" + this.player2Role + ", ballsFaced=" + this.ballsFaced + ", runsScored=" + this.runsScored + ", battingSR=" + this.battingSR + ", bowlingSR=" + this.bowlingSR + ", status=" + this.status + ", player1Name=" + this.player1Name + ", player2Name=" + this.player2Name + ", Dismissals=" + this.Dismissals + "}";
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
            Integer num;
            Integer num2;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MatchUpDatum)) {
                return false;
            }
            MatchUpDatum matchUpDatum = (MatchUpDatum) obj;
            if (this.__typename.equals(matchUpDatum.__typename) && ((str = this.player1) != null ? str.equals(matchUpDatum.player1) : matchUpDatum.player1 == null) && ((str2 = this.player2) != null ? str2.equals(matchUpDatum.player2) : matchUpDatum.player2 == null) && ((str3 = this.player1Team) != null ? str3.equals(matchUpDatum.player1Team) : matchUpDatum.player1Team == null) && ((str4 = this.player2Team) != null ? str4.equals(matchUpDatum.player2Team) : matchUpDatum.player2Team == null) && ((str5 = this.player1Role) != null ? str5.equals(matchUpDatum.player1Role) : matchUpDatum.player1Role == null) && ((str6 = this.player2Role) != null ? str6.equals(matchUpDatum.player2Role) : matchUpDatum.player2Role == null) && ((num = this.ballsFaced) != null ? num.equals(matchUpDatum.ballsFaced) : matchUpDatum.ballsFaced == null) && ((num2 = this.runsScored) != null ? num2.equals(matchUpDatum.runsScored) : matchUpDatum.runsScored == null) && ((str7 = this.battingSR) != null ? str7.equals(matchUpDatum.battingSR) : matchUpDatum.battingSR == null) && ((str8 = this.bowlingSR) != null ? str8.equals(matchUpDatum.bowlingSR) : matchUpDatum.bowlingSR == null) && ((str9 = this.status) != null ? str9.equals(matchUpDatum.status) : matchUpDatum.status == null) && ((str10 = this.player1Name) != null ? str10.equals(matchUpDatum.player1Name) : matchUpDatum.player1Name == null) && ((str11 = this.player2Name) != null ? str11.equals(matchUpDatum.player2Name) : matchUpDatum.player2Name == null)) {
                String str12 = this.Dismissals;
                String str13 = matchUpDatum.Dismissals;
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
                String str = this.player1;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.player2;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.player1Team;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.player2Team;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.player1Role;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.player2Role;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                Integer num = this.ballsFaced;
                int hashCode8 = (hashCode7 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.runsScored;
                int hashCode9 = (hashCode8 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                String str7 = this.battingSR;
                int hashCode10 = (hashCode9 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.bowlingSR;
                int hashCode11 = (hashCode10 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.status;
                int hashCode12 = (hashCode11 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
                String str10 = this.player1Name;
                int hashCode13 = (hashCode12 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
                String str11 = this.player2Name;
                int hashCode14 = (hashCode13 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
                String str12 = this.Dismissals;
                if (str12 != null) {
                    i = str12.hashCode();
                }
                this.$hashCode = hashCode14 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<MatchUpDatum> {
            @Override 
            public MatchUpDatum map(ResponseReader responseReader) {
                return new MatchUpDatum(responseReader.readString(MatchUpDatum.$responseFields[0]), responseReader.readString(MatchUpDatum.$responseFields[1]), responseReader.readString(MatchUpDatum.$responseFields[2]), responseReader.readString(MatchUpDatum.$responseFields[3]), responseReader.readString(MatchUpDatum.$responseFields[4]), responseReader.readString(MatchUpDatum.$responseFields[5]), responseReader.readString(MatchUpDatum.$responseFields[6]), responseReader.readInt(MatchUpDatum.$responseFields[7]), responseReader.readInt(MatchUpDatum.$responseFields[8]), responseReader.readString(MatchUpDatum.$responseFields[9]), responseReader.readString(MatchUpDatum.$responseFields[10]), responseReader.readString(MatchUpDatum.$responseFields[11]), responseReader.readString(MatchUpDatum.$responseFields[12]), responseReader.readString(MatchUpDatum.$responseFields[13]), responseReader.readString(MatchUpDatum.$responseFields[14]));
            }
        }
    }
}
