package clientPackage;


import com.sun.net.httpserver.HttpServer;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.jws.WebService;

/**
 * Created by Ayettey on 19/11/2016.
 */

@ManagedBean( name = "register",eager = true)
@SessionScoped
public class Register{


       private String firstName;
       private String surname;
       private String emailOrMobileNumber;
       private String secretID;
       private String reenterSecretID;
       private String day;
       private String month;
       private String year;
       private boolean isMale;
       private boolean isFemale;
       private String Male;
       private String Female;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmailOrMobileNumber(String emailOrMobileNumber) {
        this.emailOrMobileNumber = emailOrMobileNumber;
    }

    public void setSecretID(String secretID) {
        this.secretID = secretID;
    }

    public void setReenterSecretID(String reenterSecretID) {
        this.reenterSecretID = reenterSecretID;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setIsFemale(boolean  isFemale) {
        this.isFemale = isFemale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public String getYear() {
        return year;
    }


    public boolean getIsFemale() {
        return isFemale;
    }

    public boolean getIsMale() {
        return isMale;
    }

    public String getDay() {
        return day;
    }

    public String getEmailOrMobileNumber() {
        return emailOrMobileNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMonth() {
        return month;
    }

    public String getReenterSecretID() {
        return reenterSecretID;
    }

    public String getSecretID() {
        return secretID;
    }

    public String getSurname() {
        return surname;
    }

    public void setFemale(String female) {
        Female = female;
    }

    public void setMale(String male) {
        Male = male;
    }

    public String getFemale() {
        return Female;
    }

    public String getMale() {
        return Male;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
