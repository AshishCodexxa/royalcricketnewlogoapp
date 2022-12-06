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

public final class VenuedetailsQuery implements Query<VenuedetailsQuery.Data, VenuedetailsQuery.Data, VenuedetailsQuery.Variables> {
    public static final String OPERATION_ID = "3b5666f4edcb30badd695df062b9e203f203f9b339df1d1b9f10a99231d9bbd3";
    public static final OperationName OPERATION_NAME = new OperationName() {

        @Override
        public String name() {
            return "venuedetails";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query venuedetails($seriesID: String!) {\n  venuedetails(seriesID: $seriesID) {\n    __typename\n    capacity\n    stadiumName\n    city\n    venueId\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public VenuedetailsQuery(String str) {
        Utils.checkNotNull(str, "seriesID == null");
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
        private String seriesID;

        Builder() {
        }

        public Builder seriesID(String str) {
            this.seriesID = str;
            return this;
        }

        public VenuedetailsQuery build() {
            Utils.checkNotNull(this.seriesID, "seriesID == null");
            return new VenuedetailsQuery(this.seriesID);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String seriesID;
        private final transient Map<String, Object> valueMap;

        Variables(String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.seriesID = str;
            linkedHashMap.put("seriesID", str);
        }

        public String seriesID() {
            return this.seriesID;
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
                    inputFieldWriter.writeString("seriesID", Variables.this.seriesID);
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forList("venuedetails", "venuedetails", new UnmodifiableMapBuilder(1).put("seriesID", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "seriesID").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final List<Venuedetail> venuedetails;

        public Data(List<Venuedetail> list) {
            this.venuedetails = list;
        }

        public List<Venuedetail> venuedetails() {
            return this.venuedetails;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeList(Data.$responseFields[0], Data.this.venuedetails, new ResponseWriter.ListWriter() {

                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Venuedetail) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{venuedetails=" + this.venuedetails + "}";
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
            List<Venuedetail> list = this.venuedetails;
            List<Venuedetail> list2 = ((Data) obj).venuedetails;
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
                List<Venuedetail> list = this.venuedetails;
                this.$hashCode = 1000003 ^ (list == null ? 0 : list.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final Venuedetail.Mapper venuedetailFieldMapper = new Venuedetail.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data(responseReader.readList(Data.$responseFields[0], new ResponseReader.ListReader<Venuedetail>() {


                    @Override 
                    public Venuedetail read(ResponseReader.ListItemReader listItemReader) {
                        return (Venuedetail) listItemReader.readObject(new ResponseReader.ObjectReader<Venuedetail>() {


                            @Override 
                            public Venuedetail read(ResponseReader responseReader) {
                                return Mapper.this.venuedetailFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class Venuedetail {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("capacity", "capacity", null, true, Collections.emptyList()), ResponseField.forString("stadiumName", "stadiumName", null, true, Collections.emptyList()), ResponseField.forString("city", "city", null, true, Collections.emptyList()), ResponseField.forString("venueId", "venueId", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String capacity;
        final String city;
        final String stadiumName;
        final String venueId;

        public Venuedetail(String str, String str2, String str3, String str4, String str5) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.capacity = str2;
            this.stadiumName = str3;
            this.city = str4;
            this.venueId = str5;
        }

        public String __typename() {
            return this.__typename;
        }

        public String capacity() {
            return this.capacity;
        }

        public String stadiumName() {
            return this.stadiumName;
        }

        public String city() {
            return this.city;
        }

        public String venueId() {
            return this.venueId;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Venuedetail.$responseFields[0], Venuedetail.this.__typename);
                    responseWriter.writeString(Venuedetail.$responseFields[1], Venuedetail.this.capacity);
                    responseWriter.writeString(Venuedetail.$responseFields[2], Venuedetail.this.stadiumName);
                    responseWriter.writeString(Venuedetail.$responseFields[3], Venuedetail.this.city);
                    responseWriter.writeString(Venuedetail.$responseFields[4], Venuedetail.this.venueId);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Venuedetail{__typename=" + this.__typename + ", capacity=" + this.capacity + ", stadiumName=" + this.stadiumName + ", city=" + this.city + ", venueId=" + this.venueId + "}";
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
            if (!(obj instanceof Venuedetail)) {
                return false;
            }
            Venuedetail venuedetail = (Venuedetail) obj;
            if (this.__typename.equals(venuedetail.__typename) && ((str = this.capacity) != null ? str.equals(venuedetail.capacity) : venuedetail.capacity == null) && ((str2 = this.stadiumName) != null ? str2.equals(venuedetail.stadiumName) : venuedetail.stadiumName == null) && ((str3 = this.city) != null ? str3.equals(venuedetail.city) : venuedetail.city == null)) {
                String str4 = this.venueId;
                String str5 = venuedetail.venueId;
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
                String str = this.capacity;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.stadiumName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.city;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.venueId;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Venuedetail> {
            @Override 
            public Venuedetail map(ResponseReader responseReader) {
                return new Venuedetail(responseReader.readString(Venuedetail.$responseFields[0]), responseReader.readString(Venuedetail.$responseFields[1]), responseReader.readString(Venuedetail.$responseFields[2]), responseReader.readString(Venuedetail.$responseFields[3]), responseReader.readString(Venuedetail.$responseFields[4]));
            }
        }
    }
}
