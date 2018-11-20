package dbo;

import java.io.Serializable;

/**
 * Created by rexfordnana on 9/13/18.
 */


public class Rexfordnana implements Serializable{


    private String name;
    private String response;
    private String content;

    public String getName() {
        return name;
    }

    public String getResponse() {
        return response;
    }

    public String getContent() {
        return content;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
