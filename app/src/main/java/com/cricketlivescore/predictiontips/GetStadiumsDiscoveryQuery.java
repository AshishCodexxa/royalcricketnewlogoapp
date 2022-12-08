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
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

public final class GetStadiumsDiscoveryQuery implements Query<GetStadiumsDiscoveryQuery.Data, GetStadiumsDiscoveryQuery.Data, Operation.Variables> {
    public static final String OPERATION_ID = "2a42497304b368dc53d0b977cb2cf2be0c56cc07228c331b116f15f16d9ab4bb";
    public static final OperationName OPERATION_NAME = new OperationName() {


       @Override
        public String name() {
            return "getStadiumsDiscovery";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query getStadiumsDiscovery {\n  getStadiumsDiscovery {\n    __typename\n    popularStadiums {\n      __typename\n      id\n      name\n      shortname\n    }\n    stadiumByCategory {\n      __typename\n      type\n      stadiumList {\n        __typename\n        id\n        name\n        shortname\n      }\n    }\n  }\n}");
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

        public GetStadiumsDiscoveryQuery build() {
            return new GetStadiumsDiscoveryQuery();
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getStadiumsDiscovery", "getStadiumsDiscovery", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final GetStadiumsDiscovery getStadiumsDiscovery;

        public Data(GetStadiumsDiscovery getStadiumsDiscovery2) {
            this.getStadiumsDiscovery = getStadiumsDiscovery2;
        }

        public GetStadiumsDiscovery getStadiumsDiscovery() {
            return this.getStadiumsDiscovery;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.getStadiumsDiscovery != null ? Data.this.getStadiumsDiscovery.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getStadiumsDiscovery=" + this.getStadiumsDiscovery + "}";
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
            GetStadiumsDiscovery getStadiumsDiscovery2 = this.getStadiumsDiscovery;
            GetStadiumsDiscovery getStadiumsDiscovery3 = ((Data) obj).getStadiumsDiscovery;
            if (getStadiumsDiscovery2 != null) {
                return getStadiumsDiscovery2.equals(getStadiumsDiscovery3);
            }
            if (getStadiumsDiscovery3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetStadiumsDiscovery getStadiumsDiscovery2 = this.getStadiumsDiscovery;
                this.$hashCode = 1000003 ^ (getStadiumsDiscovery2 == null ? 0 : getStadiumsDiscovery2.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetStadiumsDiscovery.Mapper getStadiumsDiscoveryFieldMapper = new GetStadiumsDiscovery.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((GetStadiumsDiscovery) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetStadiumsDiscovery>() {


                    @Override 
                    public GetStadiumsDiscovery read(ResponseReader responseReader) {
                        return Mapper.this.getStadiumsDiscoveryFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class GetStadiumsDiscovery {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("popularStadiums", "popularStadiums", null, true, Collections.emptyList()), ResponseField.forList("stadiumByCategory", "stadiumByCategory", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<PopularStadium> popularStadiums;
        final List<StadiumByCategory> stadiumByCategory;

        public GetStadiumsDiscovery(String str, List<PopularStadium> list, List<StadiumByCategory> list2) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.popularStadiums = list;
            this.stadiumByCategory = list2;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<PopularStadium> popularStadiums() {
            return this.popularStadiums;
        }

        public List<StadiumByCategory> stadiumByCategory() {
            return this.stadiumByCategory;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(GetStadiumsDiscovery.$responseFields[0], GetStadiumsDiscovery.this.__typename);
                    responseWriter.writeList(GetStadiumsDiscovery.$responseFields[1], GetStadiumsDiscovery.this.popularStadiums, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((PopularStadium) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(GetStadiumsDiscovery.$responseFields[2], GetStadiumsDiscovery.this.stadiumByCategory, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((StadiumByCategory) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetStadiumsDiscovery{__typename=" + this.__typename + ", popularStadiums=" + this.popularStadiums + ", stadiumByCategory=" + this.stadiumByCategory + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<PopularStadium> list;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetStadiumsDiscovery)) {
                return false;
            }
            GetStadiumsDiscovery getStadiumsDiscovery = (GetStadiumsDiscovery) obj;
            if (this.__typename.equals(getStadiumsDiscovery.__typename) && ((list = this.popularStadiums) != null ? list.equals(getStadiumsDiscovery.popularStadiums) : getStadiumsDiscovery.popularStadiums == null)) {
                List<StadiumByCategory> list2 = this.stadiumByCategory;
                List<StadiumByCategory> list3 = getStadiumsDiscovery.stadiumByCategory;
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
                List<PopularStadium> list = this.popularStadiums;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<StadiumByCategory> list2 = this.stadiumByCategory;
                if (list2 != null) {
                    i = list2.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<GetStadiumsDiscovery> {
            final PopularStadium.Mapper popularStadiumFieldMapper = new PopularStadium.Mapper();
            final StadiumByCategory.Mapper stadiumByCategoryFieldMapper = new StadiumByCategory.Mapper();

            @Override 
            public GetStadiumsDiscovery map(ResponseReader responseReader) {
                return new GetStadiumsDiscovery(responseReader.readString(GetStadiumsDiscovery.$responseFields[0]), responseReader.readList(GetStadiumsDiscovery.$responseFields[1], new ResponseReader.ListReader<PopularStadium>() {


                    @Override 
                    public PopularStadium read(ResponseReader.ListItemReader listItemReader) {
                        return (PopularStadium) listItemReader.readObject(new ResponseReader.ObjectReader<PopularStadium>() {


                            @Override 
                            public PopularStadium read(ResponseReader responseReader) {
                                return Mapper.this.popularStadiumFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(GetStadiumsDiscovery.$responseFields[2], new ResponseReader.ListReader<StadiumByCategory>() {


                    @Override 
                    public StadiumByCategory read(ResponseReader.ListItemReader listItemReader) {
                        return (StadiumByCategory) listItemReader.readObject(new ResponseReader.ObjectReader<StadiumByCategory>() {


                            @Override 
                            public StadiumByCategory read(ResponseReader responseReader) {
                                return Mapper.this.stadiumByCategoryFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class PopularStadium {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("id", "id", null, true, Collections.emptyList()), ResponseField.forString(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, null, true, Collections.emptyList()), ResponseField.forString("shortname", "shortname", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;

        
        final String f408id;
        final String name;
        final String shortname;

        public PopularStadium(String str, String str2, String str3, String str4) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.f408id = str2;
            this.name = str3;
            this.shortname = str4;
        }

        public String __typename() {
            return this.__typename;
        }

        
        public String mo51833id() {
            return this.f408id;
        }

        public String name() {
            return this.name;
        }

        public String shortname() {
            return this.shortname;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(PopularStadium.$responseFields[0], PopularStadium.this.__typename);
                    responseWriter.writeString(PopularStadium.$responseFields[1], PopularStadium.this.f408id);
                    responseWriter.writeString(PopularStadium.$responseFields[2], PopularStadium.this.name);
                    responseWriter.writeString(PopularStadium.$responseFields[3], PopularStadium.this.shortname);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "PopularStadium{__typename=" + this.__typename + ", id=" + this.f408id + ", name=" + this.name + ", shortname=" + this.shortname + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PopularStadium)) {
                return false;
            }
            PopularStadium popularStadium = (PopularStadium) obj;
            if (this.__typename.equals(popularStadium.__typename) && ((str = this.f408id) != null ? str.equals(popularStadium.f408id) : popularStadium.f408id == null) && ((str2 = this.name) != null ? str2.equals(popularStadium.name) : popularStadium.name == null)) {
                String str3 = this.shortname;
                String str4 = popularStadium.shortname;
                if (str3 == null) {
                    if (str4 == null) {
                        return true;
                    }
                } else if (str3.equals(str4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.f408id;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.name;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.shortname;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<PopularStadium> {
            @Override 
            public PopularStadium map(ResponseReader responseReader) {
                return new PopularStadium(responseReader.readString(PopularStadium.$responseFields[0]), responseReader.readString(PopularStadium.$responseFields[1]), responseReader.readString(PopularStadium.$responseFields[2]), responseReader.readString(PopularStadium.$responseFields[3]));
            }
        }
    }

    public static class StadiumByCategory {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("type", "type", null, true, Collections.emptyList()), ResponseField.forList("stadiumList", "stadiumList", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<StadiumList> stadiumList;
        final String type;

        public StadiumByCategory(String str, String str2, List<StadiumList> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.type = str2;
            this.stadiumList = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public String type() {
            return this.type;
        }

        public List<StadiumList> stadiumList() {
            return this.stadiumList;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(StadiumByCategory.$responseFields[0], StadiumByCategory.this.__typename);
                    responseWriter.writeString(StadiumByCategory.$responseFields[1], StadiumByCategory.this.type);
                    responseWriter.writeList(StadiumByCategory.$responseFields[2], StadiumByCategory.this.stadiumList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((StadiumList) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "StadiumByCategory{__typename=" + this.__typename + ", type=" + this.type + ", stadiumList=" + this.stadiumList + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StadiumByCategory)) {
                return false;
            }
            StadiumByCategory stadiumByCategory = (StadiumByCategory) obj;
            if (this.__typename.equals(stadiumByCategory.__typename) && ((str = this.type) != null ? str.equals(stadiumByCategory.type) : stadiumByCategory.type == null)) {
                List<StadiumList> list = this.stadiumList;
                List<StadiumList> list2 = stadiumByCategory.stadiumList;
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
                String str = this.type;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                List<StadiumList> list = this.stadiumList;
                if (list != null) {
                    i = list.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<StadiumByCategory> {
            final StadiumList.Mapper stadiumListFieldMapper = new StadiumList.Mapper();

            @Override 
            public StadiumByCategory map(ResponseReader responseReader) {
                return new StadiumByCategory(responseReader.readString(StadiumByCategory.$responseFields[0]), responseReader.readString(StadiumByCategory.$responseFields[1]), responseReader.readList(StadiumByCategory.$responseFields[2], new ResponseReader.ListReader<StadiumList>() {


                    @Override 
                    public StadiumList read(ResponseReader.ListItemReader listItemReader) {
                        return (StadiumList) listItemReader.readObject(new ResponseReader.ObjectReader<StadiumList>() {


                            @Override 
                            public StadiumList read(ResponseReader responseReader) {
                                return Mapper.this.stadiumListFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class StadiumList {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("id", "id", null, true, Collections.emptyList()), ResponseField.forString(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, null, true, Collections.emptyList()), ResponseField.forString("shortname", "shortname", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;

        
        final String f409id;
        final String name;
        final String shortname;

        public StadiumList(String str, String str2, String str3, String str4) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.f409id = str2;
            this.name = str3;
            this.shortname = str4;
        }

        public String __typename() {
            return this.__typename;
        }

        
        public String mo51848id() {
            return this.f409id;
        }

        public String name() {
            return this.name;
        }

        public String shortname() {
            return this.shortname;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(StadiumList.$responseFields[0], StadiumList.this.__typename);
                    responseWriter.writeString(StadiumList.$responseFields[1], StadiumList.this.f409id);
                    responseWriter.writeString(StadiumList.$responseFields[2], StadiumList.this.name);
                    responseWriter.writeString(StadiumList.$responseFields[3], StadiumList.this.shortname);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "StadiumList{__typename=" + this.__typename + ", id=" + this.f409id + ", name=" + this.name + ", shortname=" + this.shortname + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StadiumList)) {
                return false;
            }
            StadiumList stadiumList = (StadiumList) obj;
            if (this.__typename.equals(stadiumList.__typename) && ((str = this.f409id) != null ? str.equals(stadiumList.f409id) : stadiumList.f409id == null) && ((str2 = this.name) != null ? str2.equals(stadiumList.name) : stadiumList.name == null)) {
                String str3 = this.shortname;
                String str4 = stadiumList.shortname;
                if (str3 == null) {
                    if (str4 == null) {
                        return true;
                    }
                } else if (str3.equals(str4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                int hashCode = (this.__typename.hashCode() ^ 1000003) * 1000003;
                String str = this.f409id;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.name;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.shortname;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<StadiumList> {
            @Override 
            public StadiumList map(ResponseReader responseReader) {
                return new StadiumList(responseReader.readString(StadiumList.$responseFields[0]), responseReader.readString(StadiumList.$responseFields[1]), responseReader.readString(StadiumList.$responseFields[2]), responseReader.readString(StadiumList.$responseFields[3]));
            }
        }
    }
}
