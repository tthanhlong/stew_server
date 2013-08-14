package Entities;
// Generated Aug 14, 2013 9:29:22 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Datasynctracking generated by hbm2java
 */
public class Datasynctracking  implements java.io.Serializable {


     private int id;
     private String userId;
     private String deviceUdid;
     private String appId;
     private int appVersion;
     private String dataToSyncXml;
     private Date syncDate;
     private String transactionId;

    public Datasynctracking() {
    }

    public Datasynctracking(int id, String userId, String deviceUdid, String appId, int appVersion, String dataToSyncXml, Date syncDate, String transactionId) {
       this.id = id;
       this.userId = userId;
       this.deviceUdid = deviceUdid;
       this.appId = appId;
       this.appVersion = appVersion;
       this.dataToSyncXml = dataToSyncXml;
       this.syncDate = syncDate;
       this.transactionId = transactionId;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getDeviceUdid() {
        return this.deviceUdid;
    }
    
    public void setDeviceUdid(String deviceUdid) {
        this.deviceUdid = deviceUdid;
    }
    public String getAppId() {
        return this.appId;
    }
    
    public void setAppId(String appId) {
        this.appId = appId;
    }
    public int getAppVersion() {
        return this.appVersion;
    }
    
    public void setAppVersion(int appVersion) {
        this.appVersion = appVersion;
    }
    public String getDataToSyncXml() {
        return this.dataToSyncXml;
    }
    
    public void setDataToSyncXml(String dataToSyncXml) {
        this.dataToSyncXml = dataToSyncXml;
    }
    public Date getSyncDate() {
        return this.syncDate;
    }
    
    public void setSyncDate(Date syncDate) {
        this.syncDate = syncDate;
    }
    public String getTransactionId() {
        return this.transactionId;
    }
    
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }




}


