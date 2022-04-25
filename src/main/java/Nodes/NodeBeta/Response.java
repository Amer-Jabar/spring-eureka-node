package Nodes.NodeBeta;

import java.io.Serializable;

// The response class should implement serializable. Otherwise, the jackson library
// will not be able to serialize it.
public class Response implements Serializable {
    String message;
    int id;
    public Response(String message, int id) {
        this.id = id;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public int getId() {
        return id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setId(int id) {
        this.id = id;
    }
}