package com.capella;

/**
 * Created by ramesh on 25/01/2016.
 */
public class PersonDestination {
    private String givenName;
    private String sirName;

    public PersonDestination() {
    }

    public PersonDestination(String givenName, String sirName) {
        this.givenName = givenName;
        this.sirName = sirName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSirName() {
        return sirName;
    }

    public void setSirName(String sirName) {
        this.sirName = sirName;
    }
}
