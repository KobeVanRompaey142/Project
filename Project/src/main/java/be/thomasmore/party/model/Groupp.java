package be.thomasmore.party.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Groupp {
    @Id
    private int id;
    private String groupName;
    private String linkMoreInfo;
    private String adresse;
    private String school;
    private boolean freeParkingAvailable;
    private String startHour;
    private String endHour;

    public Groupp(){}

    public Groupp(String groupName, String linkMoreInfo, String school, String adresse, boolean freeParkingAvailable, String startHour, String endHour) {

        this.groupName = groupName;
        this.linkMoreInfo = linkMoreInfo;
        this.school =school;

        this.adresse = adresse;
        this.freeParkingAvailable = freeParkingAvailable;
        this.startHour = startHour;
        this.endHour = endHour;
    }
    public Groupp(String groupName, String linkMoreInfo) {
        this.groupName = groupName;
        this.linkMoreInfo = linkMoreInfo;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getLinkMoreInfo() {
        return linkMoreInfo;
    }

    public void setLinkMoreInfo(String linkMoreInfo) {
        this.linkMoreInfo = linkMoreInfo;
    }

    public String getschool() {
        return school;
    }

    public void setschool(String school) {
        this.school = school;
    }



    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public boolean isFreeParkingAvailable() {
        return freeParkingAvailable;
    }

    public void setFreeParkingAvailable(boolean freeParkingAvailable) {
        this.freeParkingAvailable = freeParkingAvailable;
    }

    public String getStartHour() {
        return startHour;
    }

    public void setStartHour(String startHour) {
        this.startHour = startHour;
    }

    public String getEndHour() {
        return endHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }
}
