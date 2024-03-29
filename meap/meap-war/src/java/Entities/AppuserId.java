package Entities;
// Generated Aug 14, 2013 9:29:22 AM by Hibernate Tools 3.2.1.GA



/**
 * AppuserId generated by hbm2java
 */
public class AppuserId  implements java.io.Serializable {


     private String appId;
     private String userId;

    public AppuserId() {
    }

    public AppuserId(String appId, String userId) {
       this.appId = appId;
       this.userId = userId;
    }
   
    public String getAppId() {
        return this.appId;
    }
    
    public void setAppId(String appId) {
        this.appId = appId;
    }
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AppuserId) ) return false;
		 AppuserId castOther = ( AppuserId ) other; 
         
		 return ( (this.getAppId()==castOther.getAppId()) || ( this.getAppId()!=null && castOther.getAppId()!=null && this.getAppId().equals(castOther.getAppId()) ) )
 && ( (this.getUserId()==castOther.getUserId()) || ( this.getUserId()!=null && castOther.getUserId()!=null && this.getUserId().equals(castOther.getUserId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getAppId() == null ? 0 : this.getAppId().hashCode() );
         result = 37 * result + ( getUserId() == null ? 0 : this.getUserId().hashCode() );
         return result;
   }   


}


