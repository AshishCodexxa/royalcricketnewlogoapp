package com.cricketscoreprediction.app;

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

public final class GetQualificationProbabilityQuery implements Query<GetQualificationProbabilityQuery.Data, GetQualificationProbabilityQuery.Data, Operation.Variables> {
    public static final String OPERATION_ID = "c7fdc5a7016a3101af23a9497eddba123a717402e171800935ef3724d08ba2b6";
    public static final OperationName OPERATION_NAME = new OperationName() {

       @Override
        public String name() {
            return "getQualificationProbability";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query getQualificationProbability {\n  getQualificationProbability {\n    __typename\n    probabilityArray\n    text\n    qpTeamList {\n      __typename\n      teamName\n      teamColor\n    }\n    pointsTable {\n      __typename\n      teamID\n      teamName\n      matchesPlayed\n      points\n      lost\n      qp\n      wins\n      lost\n      nrr\n      isQualified\n    }\n  }\n}");
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

        public GetQualificationProbabilityQuery build() {
            return new GetQualificationProbabilityQuery();
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("getQualificationProbability", "getQualificationProbability", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final GetQualificationProbability getQualificationProbability;

        public Data(GetQualificationProbability getQualificationProbability2) {
            this.getQualificationProbability = getQualificationProbability2;
        }

        public GetQualificationProbability getQualificationProbability() {
            return this.getQualificationProbability;
        }

        @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.getQualificationProbability != null ? Data.this.getQualificationProbability.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{getQualificationProbability=" + this.getQualificationProbability + "}";
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
            GetQualificationProbability getQualificationProbability2 = this.getQualificationProbability;
            GetQualificationProbability getQualificationProbability3 = ((Data) obj).getQualificationProbability;
            if (getQualificationProbability2 != null) {
                return getQualificationProbability2.equals(getQualificationProbability3);
            }
            if (getQualificationProbability3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GetQualificationProbability getQualificationProbability2 = this.getQualificationProbability;
                this.$hashCode = 1000003 ^ (getQualificationProbability2 == null ? 0 : getQualificationProbability2.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GetQualificationProbability.Mapper getQualificationProbabilityFieldMapper = new GetQualificationProbability.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((GetQualificationProbability) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GetQualificationProbability>() {

                    @Override 
                    public GetQualificationProbability read(ResponseReader responseReader) {
                        return Mapper.this.getQualificationProbabilityFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class GetQualificationProbability {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forList("probabilityArray", "probabilityArray", null, true, Collections.emptyList()), ResponseField.forString("text", "text", null, true, Collections.emptyList()), ResponseField.forList("qpTeamList", "qpTeamList", null, true, Collections.emptyList()), ResponseField.forList("pointsTable", "pointsTable", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<List<PointsTable>> pointsTable;
        final List<List<List<Double>>> probabilityArray;
        final List<List<QpTeamList>> qpTeamList;
        final String text;

        public GetQualificationProbability(String str, List<List<List<Double>>> list, String str2, List<List<QpTeamList>> list2, List<List<PointsTable>> list3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.probabilityArray = list;
            this.text = str2;
            this.qpTeamList = list2;
            this.pointsTable = list3;
        }

        public String __typename() {
            return this.__typename;
        }

        public List<List<List<Double>>> probabilityArray() {
            return this.probabilityArray;
        }

        public String text() {
            return this.text;
        }

        public List<List<QpTeamList>> qpTeamList() {
            return this.qpTeamList;
        }

        public List<List<PointsTable>> pointsTable() {
            return this.pointsTable;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(GetQualificationProbability.$responseFields[0], GetQualificationProbability.this.__typename);
                    responseWriter.writeList(GetQualificationProbability.$responseFields[1], GetQualificationProbability.this.probabilityArray, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeList((List) it.next(), new ResponseWriter.ListWriter() {


                                    @Override 
                                    public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            listItemWriter.writeList((List) it.next(), new ResponseWriter.ListWriter() {


                                                @Override 
                                                public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                                                    Iterator it = list.iterator();
                                                    while (it.hasNext()) {
                                                        listItemWriter.writeDouble((Double) it.next());
                                                    }
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                        }
                    });
                    responseWriter.writeString(GetQualificationProbability.$responseFields[2], GetQualificationProbability.this.text);
                    responseWriter.writeList(GetQualificationProbability.$responseFields[3], GetQualificationProbability.this.qpTeamList, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeList((List) it.next(), new ResponseWriter.ListWriter() {


                                    @Override 
                                    public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            listItemWriter.writeObject(((QpTeamList) it.next()).marshaller());
                                        }
                                    }
                                });
                            }
                        }
                    });
                    responseWriter.writeList(GetQualificationProbability.$responseFields[4], GetQualificationProbability.this.pointsTable, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeList((List) it.next(), new ResponseWriter.ListWriter() {


                                    @Override 
                                    public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            listItemWriter.writeObject(((PointsTable) it.next()).marshaller());
                                        }
                                    }
                                });
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "GetQualificationProbability{__typename=" + this.__typename + ", probabilityArray=" + this.probabilityArray + ", text=" + this.text + ", qpTeamList=" + this.qpTeamList + ", pointsTable=" + this.pointsTable + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            List<List<List<Double>>> list;
            String str;
            List<List<QpTeamList>> list2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetQualificationProbability)) {
                return false;
            }
            GetQualificationProbability getQualificationProbability = (GetQualificationProbability) obj;
            if (this.__typename.equals(getQualificationProbability.__typename) && ((list = this.probabilityArray) != null ? list.equals(getQualificationProbability.probabilityArray) : getQualificationProbability.probabilityArray == null) && ((str = this.text) != null ? str.equals(getQualificationProbability.text) : getQualificationProbability.text == null) && ((list2 = this.qpTeamList) != null ? list2.equals(getQualificationProbability.qpTeamList) : getQualificationProbability.qpTeamList == null)) {
                List<List<PointsTable>> list3 = this.pointsTable;
                List<List<PointsTable>> list4 = getQualificationProbability.pointsTable;
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
                List<List<List<Double>>> list = this.probabilityArray;
                int i = 0;
                int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
                String str = this.text;
                int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
                List<List<QpTeamList>> list2 = this.qpTeamList;
                int hashCode4 = (hashCode3 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<List<PointsTable>> list3 = this.pointsTable;
                if (list3 != null) {
                    i = list3.hashCode();
                }
                this.$hashCode = hashCode4 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<GetQualificationProbability> {
            final PointsTable.Mapper pointsTableFieldMapper = new PointsTable.Mapper();
            final QpTeamList.Mapper qpTeamListFieldMapper = new QpTeamList.Mapper();

            @Override 
            public GetQualificationProbability map(ResponseReader responseReader) {
                return new GetQualificationProbability(responseReader.readString(GetQualificationProbability.$responseFields[0]), responseReader.readList(GetQualificationProbability.$responseFields[1], new ResponseReader.ListReader<List<List<Double>>>() {


                    @Override 
                    public List<List<Double>> read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readList(new ResponseReader.ListReader<List<Double>>() {


                            @Override 
                            public List<Double> read(ResponseReader.ListItemReader listItemReader) {
                                return listItemReader.readList(new ResponseReader.ListReader<Double>() {


                                    @Override 
                                    public Double read(ResponseReader.ListItemReader listItemReader) {
                                        return Double.valueOf(listItemReader.readDouble());
                                    }
                                });
                            }
                        });
                    }
                }), responseReader.readString(GetQualificationProbability.$responseFields[2]), responseReader.readList(GetQualificationProbability.$responseFields[3], new ResponseReader.ListReader<List<QpTeamList>>() {


                    @Override 
                    public List<QpTeamList> read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readList(new ResponseReader.ListReader<QpTeamList>() {


                            @Override 
                            public QpTeamList read(ResponseReader.ListItemReader listItemReader) {
                                return (QpTeamList) listItemReader.readObject(new ResponseReader.ObjectReader<QpTeamList>() {


                                    @Override 
                                    public QpTeamList read(ResponseReader responseReader) {
                                        return Mapper.this.qpTeamListFieldMapper.map(responseReader);
                                    }
                                });
                            }
                        });
                    }
                }), responseReader.readList(GetQualificationProbability.$responseFields[4], new ResponseReader.ListReader<List<PointsTable>>() {


                    @Override 
                    public List<PointsTable> read(ResponseReader.ListItemReader listItemReader) {
                        return listItemReader.readList(new ResponseReader.ListReader<PointsTable>() {


                            @Override 
                            public PointsTable read(ResponseReader.ListItemReader listItemReader) {
                                return (PointsTable) listItemReader.readObject(new ResponseReader.ObjectReader<PointsTable>() {


                                    @Override 
                                    public PointsTable read(ResponseReader responseReader) {
                                        return Mapper.this.pointsTableFieldMapper.map(responseReader);
                                    }
                                });
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class QpTeamList {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, true, Collections.emptyList()), ResponseField.forString("teamColor", "teamColor", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String teamColor;
        final String teamName;

        public QpTeamList(String str, String str2, String str3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.teamName = str2;
            this.teamColor = str3;
        }

        public String __typename() {
            return this.__typename;
        }

        public String teamName() {
            return this.teamName;
        }

        public String teamColor() {
            return this.teamColor;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(QpTeamList.$responseFields[0], QpTeamList.this.__typename);
                    responseWriter.writeString(QpTeamList.$responseFields[1], QpTeamList.this.teamName);
                    responseWriter.writeString(QpTeamList.$responseFields[2], QpTeamList.this.teamColor);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "QpTeamList{__typename=" + this.__typename + ", teamName=" + this.teamName + ", teamColor=" + this.teamColor + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof QpTeamList)) {
                return false;
            }
            QpTeamList qpTeamList = (QpTeamList) obj;
            if (this.__typename.equals(qpTeamList.__typename) && ((str = this.teamName) != null ? str.equals(qpTeamList.teamName) : qpTeamList.teamName == null)) {
                String str2 = this.teamColor;
                String str3 = qpTeamList.teamColor;
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
                String str = this.teamName;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.teamColor;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<QpTeamList> {
            @Override 
            public QpTeamList map(ResponseReader responseReader) {
                return new QpTeamList(responseReader.readString(QpTeamList.$responseFields[0]), responseReader.readString(QpTeamList.$responseFields[1]), responseReader.readString(QpTeamList.$responseFields[2]));
            }
        }
    }

    public static class PointsTable {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forString("teamName", "teamName", null, true, Collections.emptyList()), ResponseField.forString("matchesPlayed", "matchesPlayed", null, true, Collections.emptyList()), ResponseField.forString("points", "points", null, true, Collections.emptyList()), ResponseField.forString("lost", "lost", null, true, Collections.emptyList()), ResponseField.forString("qp", "qp", null, true, Collections.emptyList()), ResponseField.forString("wins", "wins", null, true, Collections.emptyList()), ResponseField.forString("nrr", "nrr", null, true, Collections.emptyList()), ResponseField.forBoolean("isQualified", "isQualified", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final Boolean isQualified;
        final String lost;
        final String matchesPlayed;
        final String nrr;
        final String points;


        final String f407qp;
        final String teamID;
        final String teamName;
        final String wins;

        public PointsTable(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.teamID = str2;
            this.teamName = str3;
            this.matchesPlayed = str4;
            this.points = str5;
            this.lost = str6;
            this.f407qp = str7;
            this.wins = str8;
            this.nrr = str9;
            this.isQualified = bool;
        }

        public String __typename() {
            return this.__typename;
        }

        public String teamID() {
            return this.teamID;
        }

        public String teamName() {
            return this.teamName;
        }

        public String matchesPlayed() {
            return this.matchesPlayed;
        }

        public String points() {
            return this.points;
        }

        public String lost() {
            return this.lost;
        }


        public String mo51709qp() {
            return this.f407qp;
        }

        public String wins() {
            return this.wins;
        }

        public String nrr() {
            return this.nrr;
        }

        public Boolean isQualified() {
            return this.isQualified;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(PointsTable.$responseFields[0], PointsTable.this.__typename);
                    responseWriter.writeString(PointsTable.$responseFields[1], PointsTable.this.teamID);
                    responseWriter.writeString(PointsTable.$responseFields[2], PointsTable.this.teamName);
                    responseWriter.writeString(PointsTable.$responseFields[3], PointsTable.this.matchesPlayed);
                    responseWriter.writeString(PointsTable.$responseFields[4], PointsTable.this.points);
                    responseWriter.writeString(PointsTable.$responseFields[5], PointsTable.this.lost);
                    responseWriter.writeString(PointsTable.$responseFields[6], PointsTable.this.f407qp);
                    responseWriter.writeString(PointsTable.$responseFields[7], PointsTable.this.wins);
                    responseWriter.writeString(PointsTable.$responseFields[8], PointsTable.this.nrr);
                    responseWriter.writeBoolean(PointsTable.$responseFields[9], PointsTable.this.isQualified);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "PointsTable{__typename=" + this.__typename + ", teamID=" + this.teamID + ", teamName=" + this.teamName + ", matchesPlayed=" + this.matchesPlayed + ", points=" + this.points + ", lost=" + this.lost + ", qp=" + this.f407qp + ", wins=" + this.wins + ", nrr=" + this.nrr + ", isQualified=" + this.isQualified + "}";
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
            if (!(obj instanceof PointsTable)) {
                return false;
            }
            PointsTable pointsTable = (PointsTable) obj;
            if (this.__typename.equals(pointsTable.__typename) && ((str = this.teamID) != null ? str.equals(pointsTable.teamID) : pointsTable.teamID == null) && ((str2 = this.teamName) != null ? str2.equals(pointsTable.teamName) : pointsTable.teamName == null) && ((str3 = this.matchesPlayed) != null ? str3.equals(pointsTable.matchesPlayed) : pointsTable.matchesPlayed == null) && ((str4 = this.points) != null ? str4.equals(pointsTable.points) : pointsTable.points == null) && ((str5 = this.lost) != null ? str5.equals(pointsTable.lost) : pointsTable.lost == null) && ((str6 = this.f407qp) != null ? str6.equals(pointsTable.f407qp) : pointsTable.f407qp == null) && ((str7 = this.wins) != null ? str7.equals(pointsTable.wins) : pointsTable.wins == null) && ((str8 = this.nrr) != null ? str8.equals(pointsTable.nrr) : pointsTable.nrr == null)) {
                Boolean bool = this.isQualified;
                Boolean bool2 = pointsTable.isQualified;
                if (bool == null) {
                    if (bool2 == null) {
                        return true;
                    }
                } else if (bool.equals(bool2)) {
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
                String str2 = this.teamName;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.matchesPlayed;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.points;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.lost;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.f407qp;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.wins;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.nrr;
                int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                Boolean bool = this.isQualified;
                if (bool != null) {
                    i = bool.hashCode();
                }
                this.$hashCode = hashCode9 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<PointsTable> {
            @Override 
            public PointsTable map(ResponseReader responseReader) {
                return new PointsTable(responseReader.readString(PointsTable.$responseFields[0]), responseReader.readString(PointsTable.$responseFields[1]), responseReader.readString(PointsTable.$responseFields[2]), responseReader.readString(PointsTable.$responseFields[3]), responseReader.readString(PointsTable.$responseFields[4]), responseReader.readString(PointsTable.$responseFields[5]), responseReader.readString(PointsTable.$responseFields[6]), responseReader.readString(PointsTable.$responseFields[7]), responseReader.readString(PointsTable.$responseFields[8]), responseReader.readBoolean(PointsTable.$responseFields[9]));
            }
        }
    }
}
