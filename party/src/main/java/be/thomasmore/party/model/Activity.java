package be.thomasmore.party.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Activity {
    @Id
    private int id;
    private String activityName;
    private String groupName;
    private String linkMoreInfo;
    private String school;
    private int capacity;
    private boolean freeParkingAvailable;
    private String startHour;
    private String endHour;
    private int cost;
    private boolean foodProvided;
    private boolean indoor;
    private boolean outdoor;
    private int distanceFromChiroInKm;
    public Activity(){}


    public Activity(String activityName, String groupName, String linkMoreInfo, String school, int capacity, boolean freeParkingAvailable, String startHour, String endHour, int cost, boolean foodProvided, boolean indoor, boolean outdoor, int distanceFromChiroInKm) {
        this.activityName = activityName;
        this.groupName = groupName;
        this.linkMoreInfo = linkMoreInfo;
        this.school = school;
        this.capacity = capacity;
        this.freeParkingAvailable = freeParkingAvailable;
        this.startHour = startHour;
        this.endHour = endHour;
        this.cost = cost;
        this.foodProvided = foodProvided;
        this.indoor = indoor;
        this.outdoor = outdoor;
        this.distanceFromChiroInKm = distanceFromChiroInKm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getGroupName() {
        return groupName;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isFoodProvided() {
        return foodProvided;
    }

    public void setFoodProvided(boolean foodProvided) {
        this.foodProvided = foodProvided;
    }

    public boolean isIndoor() {
        return indoor;
    }

    public void setIndoor(boolean indoor) {
        this.indoor = indoor;
    }

    public boolean isOutdoor() {
        return outdoor;
    }

    public void setOutdoor(boolean outdoor) {
        this.outdoor = outdoor;
    }

    public int getDistanceFromChiroInKm() {
        return distanceFromChiroInKm;
    }

    public void setDistanceFromChiroInKm(int distanceFromChiroInKm) {
        this.distanceFromChiroInKm = distanceFromChiroInKm;
    }
}
