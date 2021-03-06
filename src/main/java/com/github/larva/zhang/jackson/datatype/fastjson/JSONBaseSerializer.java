package com.github.larva.zhang.jackson.datatype.fastjson;

import com.fasterxml.jackson.databind.ser.std.StdSerializer;

abstract class JSONBaseSerializer<T> extends StdSerializer<T> {
    private static final long serialVersionUID = 1L;

    protected JSONBaseSerializer(Class<T> cls) {
        super(cls);
    }
}
