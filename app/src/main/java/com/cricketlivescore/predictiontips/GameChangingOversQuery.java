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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.http.cookie.ClientCookie;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

public final class GameChangingOversQuery implements Query<GameChangingOversQuery.Data, GameChangingOversQuery.Data, GameChangingOversQuery.Variables> {
    public static final String OPERATION_ID = "a40ccb920d55058f9925f49e19bcb474b99cddbe3cc8a5df833c5d42e223f67a";
    public static final OperationName OPERATION_NAME = new OperationName() {


       @Override
        public String name() {
            return "gameChangingOvers";
        }
    };
    public static final String QUERY_DOCUMENT = QueryDocumentMinifier.minify("query gameChangingOvers($matchID: String!) {\n  gameChangingOvers(matchID: $matchID) {\n    __typename\n    matchID\n    overs {\n      __typename\n      inningNo\n      overNo\n      runsInOver\n      score\n      wicketsInOver\n      teamShortName\n      teamID\n      commentary {\n        __typename\n        over\n        overNumber\n        runs\n        wicket\n        type\n        comment\n        batsmanName\n        bowlerName\n      }\n      commentaryOver {\n        __typename\n        over\n        overNumber\n        runs\n        wicket\n        type\n      }\n      lastBallPredictionData {\n        __typename\n        homeTeamShortName\n        homeTeamPercent\n        awayTeamShortName\n        awayTeamPercent\n        tiePercent\n        ballNo\n        currentWickets\n        currentScore\n        score\n      }\n    }\n  }\n}");
    private final Variables variables;

    @Override 
    public String operationId() {
        return OPERATION_ID;
    }

    public Data wrapData(Data data) {
        return data;
    }

    public GameChangingOversQuery(String str) {
        Utils.checkNotNull(str, "matchID == null");
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
        private String matchID;

        Builder() {
        }

        public Builder matchID(String str) {
            this.matchID = str;
            return this;
        }

        public GameChangingOversQuery build() {
            Utils.checkNotNull(this.matchID, "matchID == null");
            return new GameChangingOversQuery(this.matchID);
        }
    }

    public static final class Variables extends Operation.Variables {
        private final String matchID;
        private final transient Map<String, Object> valueMap;

        Variables(String str) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.valueMap = linkedHashMap;
            this.matchID = str;
            linkedHashMap.put("matchID", str);
        }

        public String matchID() {
            return this.matchID;
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
                }
            };
        }
    }

    public static class Data implements Operation.Data {
        static final ResponseField[] $responseFields = {ResponseField.forObject("gameChangingOvers", "gameChangingOvers", new UnmodifiableMapBuilder(1).put("matchID", new UnmodifiableMapBuilder(2).put("kind", "Variable").put(ResponseField.VARIABLE_NAME_KEY, "matchID").build()).build(), true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final GameChangingOvers gameChangingOvers;

        public Data(GameChangingOvers gameChangingOvers2) {
            this.gameChangingOvers = gameChangingOvers2;
        }

        public GameChangingOvers gameChangingOvers() {
            return this.gameChangingOvers;
        }

      @Override
        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeObject(Data.$responseFields[0], Data.this.gameChangingOvers != null ? Data.this.gameChangingOvers.marshaller() : null);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Data{gameChangingOvers=" + this.gameChangingOvers + "}";
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
            GameChangingOvers gameChangingOvers2 = this.gameChangingOvers;
            GameChangingOvers gameChangingOvers3 = ((Data) obj).gameChangingOvers;
            if (gameChangingOvers2 != null) {
                return gameChangingOvers2.equals(gameChangingOvers3);
            }
            if (gameChangingOvers3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (!this.$hashCodeMemoized) {
                GameChangingOvers gameChangingOvers2 = this.gameChangingOvers;
                this.$hashCode = 1000003 ^ (gameChangingOvers2 == null ? 0 : gameChangingOvers2.hashCode());
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Data> {
            final GameChangingOvers.Mapper gameChangingOversFieldMapper = new GameChangingOvers.Mapper();

            @Override 
            public Data map(ResponseReader responseReader) {
                return new Data((GameChangingOvers) responseReader.readObject(Data.$responseFields[0], new ResponseReader.ObjectReader<GameChangingOvers>() {


                    @Override 
                    public GameChangingOvers read(ResponseReader responseReader) {
                        return Mapper.this.gameChangingOversFieldMapper.map(responseReader);
                    }
                }));
            }
        }
    }

    public static class GameChangingOvers {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("matchID", "matchID", null, true, Collections.emptyList()), ResponseField.forList("overs", "overs", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String matchID;
        final List<Over> overs;

        public GameChangingOvers(String str, String str2, List<Over> list) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.matchID = str2;
            this.overs = list;
        }

        public String __typename() {
            return this.__typename;
        }

        public String matchID() {
            return this.matchID;
        }

        public List<Over> overs() {
            return this.overs;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {

                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(GameChangingOvers.$responseFields[0], GameChangingOvers.this.__typename);
                    responseWriter.writeString(GameChangingOvers.$responseFields[1], GameChangingOvers.this.matchID);
                    responseWriter.writeList(GameChangingOvers.$responseFields[2], GameChangingOvers.this.overs, new ResponseWriter.ListWriter() {


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
                this.$toString = "GameChangingOvers{__typename=" + this.__typename + ", matchID=" + this.matchID + ", overs=" + this.overs + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GameChangingOvers)) {
                return false;
            }
            GameChangingOvers gameChangingOvers = (GameChangingOvers) obj;
            if (this.__typename.equals(gameChangingOvers.__typename) && ((str = this.matchID) != null ? str.equals(gameChangingOvers.matchID) : gameChangingOvers.matchID == null)) {
                List<Over> list = this.overs;
                List<Over> list2 = gameChangingOvers.overs;
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
                List<Over> list = this.overs;
                if (list != null) {
                    i = list.hashCode();
                }
                this.$hashCode = hashCode2 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<GameChangingOvers> {
            final Over.Mapper overFieldMapper = new Over.Mapper();

            @Override 
            public GameChangingOvers map(ResponseReader responseReader) {
                return new GameChangingOvers(responseReader.readString(GameChangingOvers.$responseFields[0]), responseReader.readString(GameChangingOvers.$responseFields[1]), responseReader.readList(GameChangingOvers.$responseFields[2], new ResponseReader.ListReader<Over>() {


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
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("inningNo", "inningNo", null, true, Collections.emptyList()), ResponseField.forString("overNo", "overNo", null, true, Collections.emptyList()), ResponseField.forString("runsInOver", "runsInOver", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.SCORE, FirebaseAnalytics.Param.SCORE, null, true, Collections.emptyList()), ResponseField.forString("wicketsInOver", "wicketsInOver", null, true, Collections.emptyList()), ResponseField.forString("teamShortName", "teamShortName", null, true, Collections.emptyList()), ResponseField.forString("teamID", "teamID", null, true, Collections.emptyList()), ResponseField.forList("commentary", "commentary", null, true, Collections.emptyList()), ResponseField.forList("commentaryOver", "commentaryOver", null, true, Collections.emptyList()), ResponseField.forList("lastBallPredictionData", "lastBallPredictionData", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final List<Commentary> commentary;
        final List<CommentaryOver> commentaryOver;
        final String inningNo;
        final List<LastBallPredictionDatum> lastBallPredictionData;
        final String overNo;
        final String runsInOver;
        final String score;
        final String teamID;
        final String teamShortName;
        final String wicketsInOver;

        public Over(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<Commentary> list, List<CommentaryOver> list2, List<LastBallPredictionDatum> list3) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.inningNo = str2;
            this.overNo = str3;
            this.runsInOver = str4;
            this.score = str5;
            this.wicketsInOver = str6;
            this.teamShortName = str7;
            this.teamID = str8;
            this.commentary = list;
            this.commentaryOver = list2;
            this.lastBallPredictionData = list3;
        }

        public String __typename() {
            return this.__typename;
        }

        public String inningNo() {
            return this.inningNo;
        }

        public String overNo() {
            return this.overNo;
        }

        public String runsInOver() {
            return this.runsInOver;
        }

        public String score() {
            return this.score;
        }

        public String wicketsInOver() {
            return this.wicketsInOver;
        }

        public String teamShortName() {
            return this.teamShortName;
        }

        public String teamID() {
            return this.teamID;
        }

        public List<Commentary> commentary() {
            return this.commentary;
        }

        public List<CommentaryOver> commentaryOver() {
            return this.commentaryOver;
        }

        public List<LastBallPredictionDatum> lastBallPredictionData() {
            return this.lastBallPredictionData;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Over.$responseFields[0], Over.this.__typename);
                    responseWriter.writeString(Over.$responseFields[1], Over.this.inningNo);
                    responseWriter.writeString(Over.$responseFields[2], Over.this.overNo);
                    responseWriter.writeString(Over.$responseFields[3], Over.this.runsInOver);
                    responseWriter.writeString(Over.$responseFields[4], Over.this.score);
                    responseWriter.writeString(Over.$responseFields[5], Over.this.wicketsInOver);
                    responseWriter.writeString(Over.$responseFields[6], Over.this.teamShortName);
                    responseWriter.writeString(Over.$responseFields[7], Over.this.teamID);
                    responseWriter.writeList(Over.$responseFields[8], Over.this.commentary, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((Commentary) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(Over.$responseFields[9], Over.this.commentaryOver, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((CommentaryOver) it.next()).marshaller());
                            }
                        }
                    });
                    responseWriter.writeList(Over.$responseFields[10], Over.this.lastBallPredictionData, new ResponseWriter.ListWriter() {


                        @Override 
                        public void write(List list, ResponseWriter.ListItemWriter listItemWriter) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                listItemWriter.writeObject(((LastBallPredictionDatum) it.next()).marshaller());
                            }
                        }
                    });
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Over{__typename=" + this.__typename + ", inningNo=" + this.inningNo + ", overNo=" + this.overNo + ", runsInOver=" + this.runsInOver + ", score=" + this.score + ", wicketsInOver=" + this.wicketsInOver + ", teamShortName=" + this.teamShortName + ", teamID=" + this.teamID + ", commentary=" + this.commentary + ", commentaryOver=" + this.commentaryOver + ", lastBallPredictionData=" + this.lastBallPredictionData + "}";
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
            List<Commentary> list;
            List<CommentaryOver> list2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Over)) {
                return false;
            }
            Over over = (Over) obj;
            if (this.__typename.equals(over.__typename) && ((str = this.inningNo) != null ? str.equals(over.inningNo) : over.inningNo == null) && ((str2 = this.overNo) != null ? str2.equals(over.overNo) : over.overNo == null) && ((str3 = this.runsInOver) != null ? str3.equals(over.runsInOver) : over.runsInOver == null) && ((str4 = this.score) != null ? str4.equals(over.score) : over.score == null) && ((str5 = this.wicketsInOver) != null ? str5.equals(over.wicketsInOver) : over.wicketsInOver == null) && ((str6 = this.teamShortName) != null ? str6.equals(over.teamShortName) : over.teamShortName == null) && ((str7 = this.teamID) != null ? str7.equals(over.teamID) : over.teamID == null) && ((list = this.commentary) != null ? list.equals(over.commentary) : over.commentary == null) && ((list2 = this.commentaryOver) != null ? list2.equals(over.commentaryOver) : over.commentaryOver == null)) {
                List<LastBallPredictionDatum> list3 = this.lastBallPredictionData;
                List<LastBallPredictionDatum> list4 = over.lastBallPredictionData;
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
                String str = this.inningNo;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.overNo;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.runsInOver;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.score;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.wicketsInOver;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.teamShortName;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.teamID;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                List<Commentary> list = this.commentary;
                int hashCode9 = (hashCode8 ^ (list == null ? 0 : list.hashCode())) * 1000003;
                List<CommentaryOver> list2 = this.commentaryOver;
                int hashCode10 = (hashCode9 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
                List<LastBallPredictionDatum> list3 = this.lastBallPredictionData;
                if (list3 != null) {
                    i = list3.hashCode();
                }
                this.$hashCode = hashCode10 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Over> {
            final Commentary.Mapper commentaryFieldMapper = new Commentary.Mapper();
            final CommentaryOver.Mapper commentaryOverFieldMapper = new CommentaryOver.Mapper();
            final LastBallPredictionDatum.Mapper lastBallPredictionDatumFieldMapper = new LastBallPredictionDatum.Mapper();

            @Override 
            public Over map(ResponseReader responseReader) {
                return new Over(responseReader.readString(Over.$responseFields[0]), responseReader.readString(Over.$responseFields[1]), responseReader.readString(Over.$responseFields[2]), responseReader.readString(Over.$responseFields[3]), responseReader.readString(Over.$responseFields[4]), responseReader.readString(Over.$responseFields[5]), responseReader.readString(Over.$responseFields[6]), responseReader.readString(Over.$responseFields[7]), responseReader.readList(Over.$responseFields[8], new ResponseReader.ListReader<Commentary>() {


                    @Override 
                    public Commentary read(ResponseReader.ListItemReader listItemReader) {
                        return (Commentary) listItemReader.readObject(new ResponseReader.ObjectReader<Commentary>() {


                            @Override 
                            public Commentary read(ResponseReader responseReader) {
                                return Mapper.this.commentaryFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(Over.$responseFields[9], new ResponseReader.ListReader<CommentaryOver>() {


                    @Override 
                    public CommentaryOver read(ResponseReader.ListItemReader listItemReader) {
                        return (CommentaryOver) listItemReader.readObject(new ResponseReader.ObjectReader<CommentaryOver>() {


                            @Override 
                            public CommentaryOver read(ResponseReader responseReader) {
                                return Mapper.this.commentaryOverFieldMapper.map(responseReader);
                            }
                        });
                    }
                }), responseReader.readList(Over.$responseFields[10], new ResponseReader.ListReader<LastBallPredictionDatum>() {


                    @Override 
                    public LastBallPredictionDatum read(ResponseReader.ListItemReader listItemReader) {
                        return (LastBallPredictionDatum) listItemReader.readObject(new ResponseReader.ObjectReader<LastBallPredictionDatum>() {


                            @Override 
                            public LastBallPredictionDatum read(ResponseReader responseReader) {
                                return Mapper.this.lastBallPredictionDatumFieldMapper.map(responseReader);
                            }
                        });
                    }
                }));
            }
        }
    }

    public static class Commentary {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("over", "over", null, true, Collections.emptyList()), ResponseField.forString("overNumber", "overNumber", null, true, Collections.emptyList()), ResponseField.forString("runs", "runs", null, true, Collections.emptyList()), ResponseField.forBoolean("wicket", "wicket", null, true, Collections.emptyList()), ResponseField.forString("type", "type", null, true, Collections.emptyList()), ResponseField.forString(ClientCookie.COMMENT_ATTR, ClientCookie.COMMENT_ATTR, null, true, Collections.emptyList()), ResponseField.forString("batsmanName", "batsmanName", null, true, Collections.emptyList()), ResponseField.forString("bowlerName", "bowlerName", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String batsmanName;
        final String bowlerName;
        final String comment;
        final String over;
        final String overNumber;
        final String runs;
        final String type;
        final Boolean wicket;

        public Commentary(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.over = str2;
            this.overNumber = str3;
            this.runs = str4;
            this.wicket = bool;
            this.type = str5;
            this.comment = str6;
            this.batsmanName = str7;
            this.bowlerName = str8;
        }

        public String __typename() {
            return this.__typename;
        }

        public String over() {
            return this.over;
        }

        public String overNumber() {
            return this.overNumber;
        }

        public String runs() {
            return this.runs;
        }

        public Boolean wicket() {
            return this.wicket;
        }

        public String type() {
            return this.type;
        }

        public String comment() {
            return this.comment;
        }

        public String batsmanName() {
            return this.batsmanName;
        }

        public String bowlerName() {
            return this.bowlerName;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(Commentary.$responseFields[0], Commentary.this.__typename);
                    responseWriter.writeString(Commentary.$responseFields[1], Commentary.this.over);
                    responseWriter.writeString(Commentary.$responseFields[2], Commentary.this.overNumber);
                    responseWriter.writeString(Commentary.$responseFields[3], Commentary.this.runs);
                    responseWriter.writeBoolean(Commentary.$responseFields[4], Commentary.this.wicket);
                    responseWriter.writeString(Commentary.$responseFields[5], Commentary.this.type);
                    responseWriter.writeString(Commentary.$responseFields[6], Commentary.this.comment);
                    responseWriter.writeString(Commentary.$responseFields[7], Commentary.this.batsmanName);
                    responseWriter.writeString(Commentary.$responseFields[8], Commentary.this.bowlerName);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "Commentary{__typename=" + this.__typename + ", over=" + this.over + ", overNumber=" + this.overNumber + ", runs=" + this.runs + ", wicket=" + this.wicket + ", type=" + this.type + ", comment=" + this.comment + ", batsmanName=" + this.batsmanName + ", bowlerName=" + this.bowlerName + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            Boolean bool;
            String str4;
            String str5;
            String str6;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Commentary)) {
                return false;
            }
            Commentary commentary = (Commentary) obj;
            if (this.__typename.equals(commentary.__typename) && ((str = this.over) != null ? str.equals(commentary.over) : commentary.over == null) && ((str2 = this.overNumber) != null ? str2.equals(commentary.overNumber) : commentary.overNumber == null) && ((str3 = this.runs) != null ? str3.equals(commentary.runs) : commentary.runs == null) && ((bool = this.wicket) != null ? bool.equals(commentary.wicket) : commentary.wicket == null) && ((str4 = this.type) != null ? str4.equals(commentary.type) : commentary.type == null) && ((str5 = this.comment) != null ? str5.equals(commentary.comment) : commentary.comment == null) && ((str6 = this.batsmanName) != null ? str6.equals(commentary.batsmanName) : commentary.batsmanName == null)) {
                String str7 = this.bowlerName;
                String str8 = commentary.bowlerName;
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
                String str = this.over;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.overNumber;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.runs;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Boolean bool = this.wicket;
                int hashCode5 = (hashCode4 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str4 = this.type;
                int hashCode6 = (hashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.comment;
                int hashCode7 = (hashCode6 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.batsmanName;
                int hashCode8 = (hashCode7 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.bowlerName;
                if (str7 != null) {
                    i = str7.hashCode();
                }
                this.$hashCode = hashCode8 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<Commentary> {
            @Override 
            public Commentary map(ResponseReader responseReader) {
                return new Commentary(responseReader.readString(Commentary.$responseFields[0]), responseReader.readString(Commentary.$responseFields[1]), responseReader.readString(Commentary.$responseFields[2]), responseReader.readString(Commentary.$responseFields[3]), responseReader.readBoolean(Commentary.$responseFields[4]), responseReader.readString(Commentary.$responseFields[5]), responseReader.readString(Commentary.$responseFields[6]), responseReader.readString(Commentary.$responseFields[7]), responseReader.readString(Commentary.$responseFields[8]));
            }
        }
    }

    public static class CommentaryOver {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("over", "over", null, true, Collections.emptyList()), ResponseField.forString("overNumber", "overNumber", null, true, Collections.emptyList()), ResponseField.forString("runs", "runs", null, true, Collections.emptyList()), ResponseField.forBoolean("wicket", "wicket", null, true, Collections.emptyList()), ResponseField.forString("type", "type", null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String over;
        final String overNumber;
        final String runs;
        final String type;
        final Boolean wicket;

        public CommentaryOver(String str, String str2, String str3, String str4, Boolean bool, String str5) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.over = str2;
            this.overNumber = str3;
            this.runs = str4;
            this.wicket = bool;
            this.type = str5;
        }

        public String __typename() {
            return this.__typename;
        }

        public String over() {
            return this.over;
        }

        public String overNumber() {
            return this.overNumber;
        }

        public String runs() {
            return this.runs;
        }

        public Boolean wicket() {
            return this.wicket;
        }

        public String type() {
            return this.type;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(CommentaryOver.$responseFields[0], CommentaryOver.this.__typename);
                    responseWriter.writeString(CommentaryOver.$responseFields[1], CommentaryOver.this.over);
                    responseWriter.writeString(CommentaryOver.$responseFields[2], CommentaryOver.this.overNumber);
                    responseWriter.writeString(CommentaryOver.$responseFields[3], CommentaryOver.this.runs);
                    responseWriter.writeBoolean(CommentaryOver.$responseFields[4], CommentaryOver.this.wicket);
                    responseWriter.writeString(CommentaryOver.$responseFields[5], CommentaryOver.this.type);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "CommentaryOver{__typename=" + this.__typename + ", over=" + this.over + ", overNumber=" + this.overNumber + ", runs=" + this.runs + ", wicket=" + this.wicket + ", type=" + this.type + "}";
            }
            return this.$toString;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            Boolean bool;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CommentaryOver)) {
                return false;
            }
            CommentaryOver commentaryOver = (CommentaryOver) obj;
            if (this.__typename.equals(commentaryOver.__typename) && ((str = this.over) != null ? str.equals(commentaryOver.over) : commentaryOver.over == null) && ((str2 = this.overNumber) != null ? str2.equals(commentaryOver.overNumber) : commentaryOver.overNumber == null) && ((str3 = this.runs) != null ? str3.equals(commentaryOver.runs) : commentaryOver.runs == null) && ((bool = this.wicket) != null ? bool.equals(commentaryOver.wicket) : commentaryOver.wicket == null)) {
                String str4 = this.type;
                String str5 = commentaryOver.type;
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
                String str2 = this.overNumber;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.runs;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                Boolean bool = this.wicket;
                int hashCode5 = (hashCode4 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
                String str4 = this.type;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                this.$hashCode = hashCode5 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<CommentaryOver> {
            @Override 
            public CommentaryOver map(ResponseReader responseReader) {
                return new CommentaryOver(responseReader.readString(CommentaryOver.$responseFields[0]), responseReader.readString(CommentaryOver.$responseFields[1]), responseReader.readString(CommentaryOver.$responseFields[2]), responseReader.readString(CommentaryOver.$responseFields[3]), responseReader.readBoolean(CommentaryOver.$responseFields[4]), responseReader.readString(CommentaryOver.$responseFields[5]));
            }
        }
    }

    public static class LastBallPredictionDatum {
        static final ResponseField[] $responseFields = {ResponseField.forString("__typename", "__typename", null, false, Collections.emptyList()), ResponseField.forString("homeTeamShortName", "homeTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("homeTeamPercent", "homeTeamPercent", null, true, Collections.emptyList()), ResponseField.forString("awayTeamShortName", "awayTeamShortName", null, true, Collections.emptyList()), ResponseField.forString("awayTeamPercent", "awayTeamPercent", null, true, Collections.emptyList()), ResponseField.forString("tiePercent", "tiePercent", null, true, Collections.emptyList()), ResponseField.forString("ballNo", "ballNo", null, true, Collections.emptyList()), ResponseField.forString("currentWickets", "currentWickets", null, true, Collections.emptyList()), ResponseField.forString("currentScore", "currentScore", null, true, Collections.emptyList()), ResponseField.forString(FirebaseAnalytics.Param.SCORE, FirebaseAnalytics.Param.SCORE, null, true, Collections.emptyList())};
        private volatile transient int $hashCode;
        private volatile transient boolean $hashCodeMemoized;
        private volatile transient String $toString;
        final String __typename;
        final String awayTeamPercent;
        final String awayTeamShortName;
        final String ballNo;
        final String currentScore;
        final String currentWickets;
        final String homeTeamPercent;
        final String homeTeamShortName;
        final String score;
        final String tiePercent;

        public LastBallPredictionDatum(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            this.__typename = (String) Utils.checkNotNull(str, "__typename == null");
            this.homeTeamShortName = str2;
            this.homeTeamPercent = str3;
            this.awayTeamShortName = str4;
            this.awayTeamPercent = str5;
            this.tiePercent = str6;
            this.ballNo = str7;
            this.currentWickets = str8;
            this.currentScore = str9;
            this.score = str10;
        }

        public String __typename() {
            return this.__typename;
        }

        public String homeTeamShortName() {
            return this.homeTeamShortName;
        }

        public String homeTeamPercent() {
            return this.homeTeamPercent;
        }

        public String awayTeamShortName() {
            return this.awayTeamShortName;
        }

        public String awayTeamPercent() {
            return this.awayTeamPercent;
        }

        public String tiePercent() {
            return this.tiePercent;
        }

        public String ballNo() {
            return this.ballNo;
        }

        public String currentWickets() {
            return this.currentWickets;
        }

        public String currentScore() {
            return this.currentScore;
        }

        public String score() {
            return this.score;
        }

        public ResponseFieldMarshaller marshaller() {
            return new ResponseFieldMarshaller() {


                @Override 
                public void marshal(ResponseWriter responseWriter) {
                    responseWriter.writeString(LastBallPredictionDatum.$responseFields[0], LastBallPredictionDatum.this.__typename);
                    responseWriter.writeString(LastBallPredictionDatum.$responseFields[1], LastBallPredictionDatum.this.homeTeamShortName);
                    responseWriter.writeString(LastBallPredictionDatum.$responseFields[2], LastBallPredictionDatum.this.homeTeamPercent);
                    responseWriter.writeString(LastBallPredictionDatum.$responseFields[3], LastBallPredictionDatum.this.awayTeamShortName);
                    responseWriter.writeString(LastBallPredictionDatum.$responseFields[4], LastBallPredictionDatum.this.awayTeamPercent);
                    responseWriter.writeString(LastBallPredictionDatum.$responseFields[5], LastBallPredictionDatum.this.tiePercent);
                    responseWriter.writeString(LastBallPredictionDatum.$responseFields[6], LastBallPredictionDatum.this.ballNo);
                    responseWriter.writeString(LastBallPredictionDatum.$responseFields[7], LastBallPredictionDatum.this.currentWickets);
                    responseWriter.writeString(LastBallPredictionDatum.$responseFields[8], LastBallPredictionDatum.this.currentScore);
                    responseWriter.writeString(LastBallPredictionDatum.$responseFields[9], LastBallPredictionDatum.this.score);
                }
            };
        }

        public String toString() {
            if (this.$toString == null) {
                this.$toString = "LastBallPredictionDatum{__typename=" + this.__typename + ", homeTeamShortName=" + this.homeTeamShortName + ", homeTeamPercent=" + this.homeTeamPercent + ", awayTeamShortName=" + this.awayTeamShortName + ", awayTeamPercent=" + this.awayTeamPercent + ", tiePercent=" + this.tiePercent + ", ballNo=" + this.ballNo + ", currentWickets=" + this.currentWickets + ", currentScore=" + this.currentScore + ", score=" + this.score + "}";
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
            if (!(obj instanceof LastBallPredictionDatum)) {
                return false;
            }
            LastBallPredictionDatum lastBallPredictionDatum = (LastBallPredictionDatum) obj;
            if (this.__typename.equals(lastBallPredictionDatum.__typename) && ((str = this.homeTeamShortName) != null ? str.equals(lastBallPredictionDatum.homeTeamShortName) : lastBallPredictionDatum.homeTeamShortName == null) && ((str2 = this.homeTeamPercent) != null ? str2.equals(lastBallPredictionDatum.homeTeamPercent) : lastBallPredictionDatum.homeTeamPercent == null) && ((str3 = this.awayTeamShortName) != null ? str3.equals(lastBallPredictionDatum.awayTeamShortName) : lastBallPredictionDatum.awayTeamShortName == null) && ((str4 = this.awayTeamPercent) != null ? str4.equals(lastBallPredictionDatum.awayTeamPercent) : lastBallPredictionDatum.awayTeamPercent == null) && ((str5 = this.tiePercent) != null ? str5.equals(lastBallPredictionDatum.tiePercent) : lastBallPredictionDatum.tiePercent == null) && ((str6 = this.ballNo) != null ? str6.equals(lastBallPredictionDatum.ballNo) : lastBallPredictionDatum.ballNo == null) && ((str7 = this.currentWickets) != null ? str7.equals(lastBallPredictionDatum.currentWickets) : lastBallPredictionDatum.currentWickets == null) && ((str8 = this.currentScore) != null ? str8.equals(lastBallPredictionDatum.currentScore) : lastBallPredictionDatum.currentScore == null)) {
                String str9 = this.score;
                String str10 = lastBallPredictionDatum.score;
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
                String str = this.homeTeamShortName;
                int i = 0;
                int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
                String str2 = this.homeTeamPercent;
                int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
                String str3 = this.awayTeamShortName;
                int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
                String str4 = this.awayTeamPercent;
                int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
                String str5 = this.tiePercent;
                int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
                String str6 = this.ballNo;
                int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
                String str7 = this.currentWickets;
                int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
                String str8 = this.currentScore;
                int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
                String str9 = this.score;
                if (str9 != null) {
                    i = str9.hashCode();
                }
                this.$hashCode = hashCode9 ^ i;
                this.$hashCodeMemoized = true;
            }
            return this.$hashCode;
        }

        public static final class Mapper implements ResponseFieldMapper<LastBallPredictionDatum> {
            @Override 
            public LastBallPredictionDatum map(ResponseReader responseReader) {
                return new LastBallPredictionDatum(responseReader.readString(LastBallPredictionDatum.$responseFields[0]), responseReader.readString(LastBallPredictionDatum.$responseFields[1]), responseReader.readString(LastBallPredictionDatum.$responseFields[2]), responseReader.readString(LastBallPredictionDatum.$responseFields[3]), responseReader.readString(LastBallPredictionDatum.$responseFields[4]), responseReader.readString(LastBallPredictionDatum.$responseFields[5]), responseReader.readString(LastBallPredictionDatum.$responseFields[6]), responseReader.readString(LastBallPredictionDatum.$responseFields[7]), responseReader.readString(LastBallPredictionDatum.$responseFields[8]), responseReader.readString(LastBallPredictionDatum.$responseFields[9]));
            }
        }
    }
}
