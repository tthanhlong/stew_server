package Entities;
// Generated Aug 14, 2013 9:29:22 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private String userId;
     private String passwordHash;
     private String userToken;
     private Date tokenExpireDate;
     private Date loginDate;
     private int defaultTokenAge;
     private String roleId;

    public User() {
    }

    public User(String userId, String passwordHash, String userToken, Date tokenExpireDate, Date loginDate, int defaultTokenAge, String roleId) {
       this.userId = userId;
       this.passwordHash = passwordHash;
       this.userToken = userToken;
       this.tokenExpireDate = tokenExpireDate;
       this.loginDate = loginDate;
       this.defaultTokenAge = defaultTokenAge;
       this.roleId = roleId;
    }
   
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getPasswordHash() {
        return this.passwordHash;
    }
    
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
    public String getUserToken() {
        return this.userToken;
    }
    
    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }
    public Date getTokenExpireDate() {
        return this.tokenExpireDate;
    }
    
    public void setTokenExpireDate(Date tokenExpireDate) {
        this.tokenExpireDate = tokenExpireDate;
    }
    public Date getLoginDate() {
        return this.loginDate;
    }
    
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }
    public int getDefaultTokenAge() {
        return this.defaultTokenAge;
    }
    
    public void setDefaultTokenAge(int defaultTokenAge) {
        this.defaultTokenAge = defaultTokenAge;
    }
    public String getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }




}


