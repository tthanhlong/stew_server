package Entities;
// Generated Aug 14, 2013 9:29:22 AM by Hibernate Tools 3.2.1.GA



/**
 * Message generated by hbm2java
 */
public class Message  implements java.io.Serializable {


     private String messageId;
     private String message;

    public Message() {
    }

    public Message(String messageId, String message) {
       this.messageId = messageId;
       this.message = message;
    }
   
    public String getMessageId() {
        return this.messageId;
    }
    
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }




}


