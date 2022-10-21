package com.gsbusiness.livecricketscoreprediction.webservice;

public class DataPart {
    private byte[] content;
    private String fileName;
    private String type;

    public DataPart() {
    }

    public DataPart(String str, byte[] bArr) {
        this.fileName = str;
        this.content = bArr;
    }

    public String getFileName() {
        return this.fileName;
    }

    public byte[] getContent() {
        return this.content;
    }

    public String getType() {
        return this.type;
    }
}
