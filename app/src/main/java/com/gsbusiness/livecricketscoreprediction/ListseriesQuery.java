package com.gsbusiness.livecricketscoreprediction;

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

public final class ListseriesQuery implements Query<ListseriesQuery.Data, ListseriesQuery.Data, ListseriesQuery.Variables> {
    public static final String OPERATION_ID = "fff0b71b0fffd2ae2dbc6f6bb96342f8acd2dada9329b562a0ea259f6933fa3c";
    public static final OperationName OPERATION_NAME = new OperationName() {


       @Override
        public String name() {
            return "listseries";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query listseries($type: String) {\n  listseries(type: $type) {\n    __typename\n    month\n    series {\n      __typename\n      seriesID\n      seriesName\n      Odicount\n      T20count\n      status\n      Testcount\n      startEndDate\n      league\n      startDate\n      type\n    }\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public ListseriesQuery(Input<String> input) {
        Utils.checkNotNull(input, "type == null");
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
        private Input<String> type = Input.absent();

        Builder() {
        }

        public Builder type(String str) {
            this.type = Input.fromNullable(str);
            return this;
        }

        public Builder typeInput(Input<String> input) {
            this.type = (Input) Utils.checkNotNull(input, "type == null");
            return this;
        }

        public ListseriesQuery build() {
            return new ListseriesQuery(this.type);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final Input<String> type;
        private final transient Map<String, Object> valueMap;

        Variables(Input<String> input) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.type = input;
            if (input.defined) {
                linkedHashMap.put("type", input.value);
            }
        }

        public Input<String> type() {
            return this.type;
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
                    if (Variables.this.type.defined) {
                        inputFieldWriter.writeString("type", Variables.this.type.value);
                    }
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forList("listseries", "listseries", new UnmodifiableMapBuilder(1).put("type", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "type").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final List<Listseries> listseries;

        public Data(List<Listseries> list) {
            this.listseries = list;
        }

        public List<Listseries> listseries() {
            return this.listseries;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeList(Data.$responseFields[0], Data.this.listseries, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Listseries) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{listseries=" + this.listseries + "}";
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
            List<Listseries> list = this.listseries;
            List<Listseries> list2 = ((Data) obj).listseries;
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
                List<Listseries> list = this.listseries;
                this.$hashCode = 1000003 ^ (list == null ? 0 : list.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final Listseries.Mapper listseriesFieldMapper = new Listseries.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data(responseReader.readList(Data.$responseFields[0], new ResponseReader.ListReader<Listseries>() {


                    @Override 
                    public Listseries read(ResponseReader.ListItemReader listItemReader) {
                        return (Listseries) listItemReader.readObject(new ResponseReader.ObjectReader<Listseries>() {


                            @Override 
                            public Listseries read(ResponseReader responseReader) {
                                return Mapper.this.listseriesFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class Listseries {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("month", "month", null, true, Collections.emptyList()), ResponseField.forList("series", "series", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String month;
        final List<Series> series;

        public Listseries(String str, String str2, List<Series> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.month = str2;
            this.series = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public String month() {
            return this.month;
        }

        public List<Series> series() {
            return this.series;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Listseries.$responseFields[0], Listseries.this.__typename);
                    responseWriter.writeString(Listseries.$responseFields[1], Listseries.this.month);
                    responseWriter.writeList(Listseries.$responseFields[2], Listseries.this.series, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Series) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Listseries{__typename=" + this.__typename + ", month=" + this.month + ", series=" + this.series + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Listseries)) {
                return false;
            }
            Listseries listseries = (Listseries) obj;
            if (this.__typename.equals(listseries.__typename) && ((str = this.month) != null ? str.equals(listseries.month) : listseries.month == null)) {
                List<Series> list = this.series;
                List<Series> list2 = listseries.series;
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
                String str = this.month;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                List<Series> list = this.series;
                if (list != null) {
                    i = list.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Listseries> {
            final Series.Mapper seriesFieldMapper = new Series.Mapper();

            @Override 
            public Listseries map(ResponseReader responseReader) {
                return new Listseries(responseReader.readString(Listseries.$responseFields[0]), responseReader.readString(Listseries.$responseFields[1]), responseReader.readList(Listseries.$responseFields[2], new ResponseReader.ListReader<Series>() {


                    @Override 
                    public Series read(ResponseReader.ListItemReader listItemReader) {
                        return (Series) listItemReader.readObject(new ResponseReader.ObjectReader<Series>() {


                            @Override 
                            public Series read(ResponseReader responseReader) {
                                return Mapper.this.seriesFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class Series {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("seriesID", "seriesID", null, true, Collections.emptyList()), ResponseField.forString("seriesName", "seriesName", null, true, Collections.emptyList()), ResponseField.forInt("Odicount", "Odicount", null, true, Collections.emptyList()), ResponseField.forInt("T20count", "T20count", null, true, Collections.emptyList()), ResponseField.forString(NotificationCompat.CATEGORY_STATUS, NotificationCompat.CATEGORY_STATUS, null, true, Collections.emptyList()), ResponseField.forInt("Testcount", "Testcount", null, true, Collections.emptyList()), ResponseField.forString("startEndDate", "startEndDate", null, true, Collections.emptyList()), ResponseField.forString("league", "league", null, true, Collections.emptyList()), ResponseField.forString("startDate", "startDate", null, true, Collections.emptyList()), ResponseField.forString("type", "type", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final Integer Odicount;
        final Integer T20count;
        final Integer Testcount;
        final String __typename;
        final String league;
        final String seriesID;
        final String seriesName;
        final String startDate;
        final String startEndDate;
        final String status;
        final String type;

        public Series(String str, String str2, String str3, Integer num, Integer num2, String str4, Integer num3, String str5, String str6, String str7, String str8) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.seriesID = str2;
            this.seriesName = str3;
            this.Odicount = num;
            this.T20count = num2;
            this.status = str4;
            this.Testcount = num3;
            this.startEndDate = str5;
            this.league = str6;
            this.startDate = str7;
            this.type = str8;
        }

        public String __typename() {
            return this.__typename;
        }

        public String seriesID() {
            return this.seriesID;
        }

        public String seriesName() {
            return this.seriesName;
        }

        public Integer Odicount() {
            return this.Odicount;
        }

        public Integer T20count() {
            return this.T20count;
        }

        public String status() {
            return this.status;
        }

        public Integer Testcount() {
            return this.Testcount;
        }

        public String startEndDate() {
            return this.startEndDate;
        }

        public String league() {
            return this.league;
        }

        public String startDate() {
            return this.startDate;
        }

        public String type() {
            return this.type;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Series.$responseFields[0], Series.this.__typename);
                    responseWriter.writeString(Series.$responseFields[1], Series.this.seriesID);
                    responseWriter.writeString(Series.$responseFields[2], Series.this.seriesName);
                    responseWriter.writeInt(Series.$responseFields[3], Series.this.Odicount);
                    responseWriter.writeInt(Series.$responseFields[4], Series.this.T20count);
                    responseWriter.writeString(Series.$responseFields[5], Series.this.status);
                    responseWriter.writeInt(Series.$responseFields[6], Series.this.Testcount);
                    responseWriter.writeString(Series.$responseFields[7], Series.this.startEndDate);
                    responseWriter.writeString(Series.$responseFields[8], Series.this.league);
                    responseWriter.writeString(Series.$responseFields[9], Series.this.startDate);
                    responseWriter.writeString(Series.$responseFields[10], Series.this.type);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Series{__typename=" + this.__typename + ", seriesID=" + this.seriesID + ", seriesName=" + this.seriesName + ", Odicount=" + this.Odicount + ", T20count=" + this.T20count + ", status=" + this.status + ", Testcount=" + this.Testcount + ", startEndDate=" + this.startEndDate + ", league=" + this.league + ", startDate=" + this.startDate + ", type=" + this.type + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            Integer num;
            Integer num2;
            String str3;
            Integer num3;
            String str4;
            String str5;
            String str6;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Series)) {
                return false;
            }
            Series series = (Series) obj;
            if (this.__typename.equals(series.__typename) && ((str = this.seriesID) != null ? str.equals(series.seriesID) : series.seriesID == null) && ((str2 = this.seriesName) != null ? str2.equals(series.seriesName) : series.seriesName == null) && ((num = this.Odicount) != null ? num.equals(series.Odicount) : series.Odicount == null) && ((num2 = this.T20count) != null ? num2.equals(series.T20count) : series.T20count == null) && ((str3 = this.status) != null ? str3.equals(series.status) : series.status == null) && ((num3 = this.Testcount) != null ? num3.equals(series.Testcount) : series.Testcount == null) && ((str4 = this.startEndDate) != null ? str4.equals(series.startEndDate) : series.startEndDate == null) && ((str5 = this.league) != null ? str5.equals(series.league) : series.league == null) && ((str6 = this.startDate) != null ? str6.equals(series.startDate) : series.startDate == null)) {
                String str7 = this.type;
                String str8 = series.type;
                if (str7 == null) {
                    if (str8 == null) {
                        return true;
                    }
                } else if (str7.equals(str8)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.seriesID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.seriesName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                Integer num = this.Odicount;
                int hashCode4 = (hashCode3 ^ (num == null ? 0 : num.hashCode())) * 1000003;
                Integer num2 = this.T20count;
                int hashCode5 = (hashCode4 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
                String str3 = this.status;
                int hashCode6 = (hashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Integer num3 = this.Testcount;
                int hashCode7 = (hashCode6 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
                String str4 = this.startEndDate;
                int hashCode8 = (hashCode7 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.league;
                int hashCode9 = (hashCode8 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.startDate;
                int hashCode10 = (hashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.type;
                if (str7 != null) {
                    i = str7.hashCode();
                }
                this.$hashCode = hashCode10 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Series> {
            @Override 
            public Series map(ResponseReader responseReader) {
                return new Series(responseReader.readString(Series.$responseFields[0]), responseReader.readString(Series.$responseFields[1]), responseReader.readString(Series.$responseFields[2]), responseReader.readInt(Series.$responseFields[3]), responseReader.readInt(Series.$responseFields[4]), responseReader.readString(Series.$responseFields[5]), responseReader.readInt(Series.$responseFields[6]), responseReader.readString(Series.$responseFields[7]), responseReader.readString(Series.$responseFields[8]), responseReader.readString(Series.$responseFields[9]), responseReader.readString(Series.$responseFields[10]));
            }
        }
    }
}
