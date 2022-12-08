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
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

public final class GetrankingsQuery implements Query<GetrankingsQuery.Data, GetrankingsQuery.Data, Operation.Variables> {
    public static final String OPERATION_ID = "57416eb4583ed87cc6463a9debf818d8c9491be6c289747cfd09eb3e4a94cfe5";
    public static final OperationName OPERATION_NAME = new OperationName() {

       @Override
        public String name() {
            return "getrankings";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query getrankings {\n  getrankings {\n    __typename\n    odi {\n      __typename\n      teamID\n      ranking\n      teamName\n      ratings\n    }\n    test {\n      __typename\n      teamID\n      ranking\n      teamName\n      ratings\n    }\n    t20 {\n      __typename\n      teamID\n      ranking\n      teamName\n      ratings\n    }\n  }\n}");
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

        public GetrankingsQuery build() {
            return new GetrankingsQuery();
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getrankings", "getrankings", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final Getrankings getrankings;

        public Data(Getrankings getrankings2) {
            this.getrankings = getrankings2;
        }

        public Getrankings getrankings() {
            return this.getrankings;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.getrankings != null ? Data.this.getrankings.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getrankings=" + this.getrankings + "}";
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
            Getrankings getrankings2 = this.getrankings;
            Getrankings getrankings3 = ((Data) obj).getrankings;
            if (getrankings2 != null) {
                return getrankings2.equals(getrankings3);
            }
            if (getrankings3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                Getrankings getrankings2 = this.getrankings;
                this.$hashCode = 1000003 ^ (getrankings2 == null ? 0 : getrankings2.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final Getrankings.Mapper getrankingsFieldMapper = new Getrankings.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((Getrankings) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<Getrankings>() {


                    @Override 
                    public Getrankings read(ResponseReader responseReader) {
                        return Mapper.this.getrankingsFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class Getrankings {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("odi", "odi", null, true, Collections.emptyList()), ResponseField.forList("test", "test", null, true, Collections.emptyList()), ResponseField.forList("t20", "t20", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Odi> odi;
        final List<T20> t20;
        final List<Test> test;

        public Getrankings(String str, List<Odi> list, List<Test> list2, List<T20> list3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.odi = list;
            this.test = list2;
            this.t20 = list3;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<Odi> odi() {
            return this.odi;
        }

        public List<Test> test() {
            return this.test;
        }

        public List<T20> t20() {
            return this.t20;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Getrankings.$responseFields[0], Getrankings.this.__typename);
                    responseWriter.writeList(Getrankings.$responseFields[1], Getrankings.this.odi, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Odi) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(Getrankings.$responseFields[2], Getrankings.this.test, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Test) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(Getrankings.$responseFields[3], Getrankings.this.t20, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((T20) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Getrankings{__typename=" + this.__typename + ", odi=" + this.odi + ", test=" + this.test + ", t20=" + this.t20 + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<Odi> list;
            List<Test> list2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Getrankings)) {
                return false;
            }
            Getrankings getrankings = (Getrankings) obj;
            if (this.__typename.equals(getrankings.__typename) && ((list = this.odi) != null ? list.equals(getrankings.odi) : getrankings.odi == null) && ((list2 = this.test) != null ? list2.equals(getrankings.test) : getrankings.test == null)) {
                List<T20> list3 = this.t20;
                List<T20> list4 = getrankings.t20;
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
                List<Odi> list = this.odi;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<Test> list2 = this.test;
                int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<T20> list3 = this.t20;
                if (list3 != null) {
                    i = list3.hashCode();
                }
                this.$hashCode = hashCode3 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Getrankings> {
            final Odi.Mapper odiFieldMapper = new Odi.Mapper();
            final T20.Mapper t20FieldMapper = new T20.Mapper();
            final Test.Mapper testFieldMapper = new Test.Mapper();

            @Override 
            public Getrankings map(ResponseReader responseReader) {
                return new Getrankings(responseReader.readString(Getrankings.$responseFields[0]), responseReader.readList(Getrankings.$responseFields[1], new ResponseReader.ListReader<Odi>() {


                    @Override 
                    public Odi read(ResponseReader.ListItemReader listItemReader) {
                        return (Odi) listItemReader.readObject(new ResponseReader.ObjectReader<Odi>() {


                            @Override 
                            public Odi read(ResponseReader responseReader) {
                                return Mapper.this.odiFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(Getrankings.$responseFields[2], new ResponseReader.ListReader<Test>() {


                    @Override 
                    public Test read(ResponseReader.ListItemReader listItemReader) {
                        return (Test) listItemReader.readObject(new ResponseReader.ObjectReader<Test>() {


                            @Override 
                            public Test read(ResponseReader responseReader) {
                                return Mapper.this.testFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(Getrankings.$responseFields[3], new ResponseReader.ListReader<T20>() {


                    @Override 
                    public T20 read(ResponseReader.ListItemReader listItemReader) {
                        return (T20) listItemReader.readObject(new ResponseReader.ObjectReader<T20>() {


                            @Override 
                            public T20 read(ResponseReader responseReader) {
                                return Mapper.this.t20FieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class Odi {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("ranking", "ranking", null, true, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, true, Collections.emptyList()), ResponseField.forString("ratings", "ratings", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String ranking;
        final String ratings;
        final String teamID;
        final String teamName;

        public Odi(String str, String str2, String str3, String str4, String str5) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.teamID = str2;
            this.ranking = str3;
            this.teamName = str4;
            this.ratings = str5;
        }

        public String __typename() {
            return this.__typename;
        }

        public String teamID() {
            return this.teamID;
        }

        public String ranking() {
            return this.ranking;
        }

        public String teamName() {
            return this.teamName;
        }

        public String ratings() {
            return this.ratings;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Odi.$responseFields[0], Odi.this.__typename);
                    responseWriter.writeString(Odi.$responseFields[1], Odi.this.teamID);
                    responseWriter.writeString(Odi.$responseFields[2], Odi.this.ranking);
                    responseWriter.writeString(Odi.$responseFields[3], Odi.this.teamName);
                    responseWriter.writeString(Odi.$responseFields[4], Odi.this.ratings);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Odi{__typename=" + this.__typename + ", teamID=" + this.teamID + ", ranking=" + this.ranking + ", teamName=" + this.teamName + ", ratings=" + this.ratings + "}";
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
            if (!(obj instanceof Odi)) {
                return false;
            }
            Odi odi = (Odi) obj;
            if (this.__typename.equals(odi.__typename) && ((str = this.teamID) != null ? str.equals(odi.teamID) : odi.teamID == null) && ((str2 = this.ranking) != null ? str2.equals(odi.ranking) : odi.ranking == null) && ((str3 = this.teamName) != null ? str3.equals(odi.teamName) : odi.teamName == null)) {
                String str4 = this.ratings;
                String str5 = odi.ratings;
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
                String str = this.teamID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.ranking;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.teamName;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.ratings;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Odi> {
            @Override 
            public Odi map(ResponseReader responseReader) {
                return new Odi(responseReader.readString(Odi.$responseFields[0]), responseReader.readString(Odi.$responseFields[1]), responseReader.readString(Odi.$responseFields[2]), responseReader.readString(Odi.$responseFields[3]), responseReader.readString(Odi.$responseFields[4]));
            }
        }
    }

    public static class Test {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("ranking", "ranking", null, true, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, true, Collections.emptyList()), ResponseField.forString("ratings", "ratings", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String ranking;
        final String ratings;
        final String teamID;
        final String teamName;

        public Test(String str, String str2, String str3, String str4, String str5) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.teamID = str2;
            this.ranking = str3;
            this.teamName = str4;
            this.ratings = str5;
        }

        public String __typename() {
            return this.__typename;
        }

        public String teamID() {
            return this.teamID;
        }

        public String ranking() {
            return this.ranking;
        }

        public String teamName() {
            return this.teamName;
        }

        public String ratings() {
            return this.ratings;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Test.$responseFields[0], Test.this.__typename);
                    responseWriter.writeString(Test.$responseFields[1], Test.this.teamID);
                    responseWriter.writeString(Test.$responseFields[2], Test.this.ranking);
                    responseWriter.writeString(Test.$responseFields[3], Test.this.teamName);
                    responseWriter.writeString(Test.$responseFields[4], Test.this.ratings);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Test{__typename=" + this.__typename + ", teamID=" + this.teamID + ", ranking=" + this.ranking + ", teamName=" + this.teamName + ", ratings=" + this.ratings + "}";
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
            if (!(obj instanceof Test)) {
                return false;
            }
            Test test = (Test) obj;
            if (this.__typename.equals(test.__typename) && ((str = this.teamID) != null ? str.equals(test.teamID) : test.teamID == null) && ((str2 = this.ranking) != null ? str2.equals(test.ranking) : test.ranking == null) && ((str3 = this.teamName) != null ? str3.equals(test.teamName) : test.teamName == null)) {
                String str4 = this.ratings;
                String str5 = test.ratings;
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
                String str = this.teamID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.ranking;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.teamName;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.ratings;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Test> {
            @Override 
            public Test map(ResponseReader responseReader) {
                return new Test(responseReader.readString(Test.$responseFields[0]), responseReader.readString(Test.$responseFields[1]), responseReader.readString(Test.$responseFields[2]), responseReader.readString(Test.$responseFields[3]), responseReader.readString(Test.$responseFields[4]));
            }
        }
    }

    public static class T20 {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("ranking", "ranking", null, true, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, true, Collections.emptyList()), ResponseField.forString("ratings", "ratings", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String ranking;
        final String ratings;
        final String teamID;
        final String teamName;

        public T20(String str, String str2, String str3, String str4, String str5) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.teamID = str2;
            this.ranking = str3;
            this.teamName = str4;
            this.ratings = str5;
        }

        public String __typename() {
            return this.__typename;
        }

        public String teamID() {
            return this.teamID;
        }

        public String ranking() {
            return this.ranking;
        }

        public String teamName() {
            return this.teamName;
        }

        public String ratings() {
            return this.ratings;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(T20.$responseFields[0], T20.this.__typename);
                    responseWriter.writeString(T20.$responseFields[1], T20.this.teamID);
                    responseWriter.writeString(T20.$responseFields[2], T20.this.ranking);
                    responseWriter.writeString(T20.$responseFields[3], T20.this.teamName);
                    responseWriter.writeString(T20.$responseFields[4], T20.this.ratings);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "T20{__typename=" + this.__typename + ", teamID=" + this.teamID + ", ranking=" + this.ranking + ", teamName=" + this.teamName + ", ratings=" + this.ratings + "}";
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
            if (!(obj instanceof T20)) {
                return false;
            }
            T20 t20 = (T20) obj;
            if (this.__typename.equals(t20.__typename) && ((str = this.teamID) != null ? str.equals(t20.teamID) : t20.teamID == null) && ((str2 = this.ranking) != null ? str2.equals(t20.ranking) : t20.ranking == null) && ((str3 = this.teamName) != null ? str3.equals(t20.teamName) : t20.teamName == null)) {
                String str4 = this.ratings;
                String str5 = t20.ratings;
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
                String str = this.teamID;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.ranking;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.teamName;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.ratings;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<T20> {
            @Override 
            public T20 map(ResponseReader responseReader) {
                return new T20(responseReader.readString(T20.$responseFields[0]), responseReader.readString(T20.$responseFields[1]), responseReader.readString(T20.$responseFields[2]), responseReader.readString(T20.$responseFields[3]), responseReader.readString(T20.$responseFields[4]));
            }
        }
    }
}
