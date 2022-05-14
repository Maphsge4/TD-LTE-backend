package org.orph.commonutils;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Response {

    private Boolean success;
    private Integer code;
    private String message;
    private Map<String, Object> data = new HashMap<String, Object>();

    private Response() {
    }

    public static Response ok() {
        Response response = new Response();
        response.setSuccess(true);
        response.setCode(ResultCode.SUCCESS);
        response.setMessage("success");
        return response;
    }

    public static Response fail() {
        Response response = new Response();
        response.setSuccess(false);
        response.setCode(ResultCode.FAILURE);
        response.setMessage("failure");
        return response;
    }

    public Response success(Boolean success) {
        this.setSuccess(success);
        return this;
    }

    public Response message(String message) {
        this.setMessage(message);
        return this;
    }

    public Response code(Integer code) {
        this.setCode(code);
        return this;
    }

    public Response data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    public Response data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }
}
