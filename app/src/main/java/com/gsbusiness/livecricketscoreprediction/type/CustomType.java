package com.gsbusiness.livecricketscoreprediction.type;

import com.apollographql.apollo.api.ScalarType;

public enum CustomType implements ScalarType {
    ID {
        @Override
        public String className() {
            return "java.lang.String";
        }

        @Override
        public String typeName() {
            return "ID";
        }
    }
}
