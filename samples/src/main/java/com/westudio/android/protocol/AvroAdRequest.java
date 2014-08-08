package com.westudio.android.protocol;

/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface AvroAdRequest {
    public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"AvroAdRequest\",\"namespace\":\"com.westudio.java.protocol.v1\",\"types\":[{\"type\":\"record\",\"name\":\"Person\",\"fields\":[{\"name\":\"id\",\"type\":\"int\",\"default\":0},{\"name\":\"lastName\",\"type\":\"string\"},{\"name\":\"postCode\",\"type\":\"string\"},{\"name\":\"address1\",\"type\":\"string\"},{\"name\":\"address2\",\"type\":\"string\"},{\"name\":\"firstName\",\"type\":\"string\"},{\"name\":\"country\",\"type\":\"string\"},{\"name\":\"city\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"AdRequest\",\"fields\":[{\"name\":\"adBB\",\"type\":\"string\"},{\"name\":\"person\",\"type\":\"Person\",\"default\":\"null\"}]}],\"messages\":{}}");

    @SuppressWarnings("all")
    public interface Callback extends AvroAdRequest {
        public static final org.apache.avro.Protocol PROTOCOL = AvroAdRequest.PROTOCOL;
    }
}
