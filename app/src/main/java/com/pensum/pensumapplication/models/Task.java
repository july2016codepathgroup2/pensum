package com.pensum.pensumapplication.models;

import com.google.android.gms.maps.model.LatLng;
import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseGeoPoint;
import com.parse.ParseObject;
import com.parse.ParseUser;

import org.json.JSONArray;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by violetaria on 8/17/16.
 */
@ParseClassName("Task")
public class Task extends ParseObject {
    public void setType(String type) {
        put("type",type);
    }

    public void setBudget(BigDecimal budget) {
        put("budget",budget);
    }

    public void setDescription(String description) {
        put("description",description);
    }

    public void setImages(ArrayList<String> images) {
        put("images",images);
    }

    public void setLocation(ParseGeoPoint location){
        put("location",location);
    }

    public void setPostedBy(ParseUser postedBy) {
        put("posted_by",postedBy);
    }

    public void setCandidate(ParseUser candidate) {
        put("candidate",candidate);
    }

    public void setAcceptedoffer(BigDecimal acceptedOffer) {
        put("accepted_offer",acceptedOffer);
    }

    public void setStatus(String status) {
        put("status", status);
    }

    public void setTitle(String title) {
        put("title",title);
    }

    public void setTaskPic(ParseFile taskPic) {
        put("taskPic", taskPic);
    }

    public ParseGeoPoint getLocation(){ return getParseGeoPoint("location"); }

    public JSONArray getImages() {
        return getJSONArray("images");
    }

    public Double getLatitude() { return getDouble("latitude"); }

    public Double getLongitude() { return getDouble("longitude"); }

    public Double getBudget() {
        return getDouble("budget");
    }

    public Double getAcceptedOffer() {
        return getDouble("accepted_offer");
    }

    public String getDescription() {
        return getString("description");
    }

    public ParseUser getPostedBy()  {return getParseUser("posted_by");}

    public String getStatus() {
        return getString("status");
    }

    public String getTitle() {
        return getString("title");
    }

    public String getType() {
        return getString("type");
    }

    public ParseUser getCandidate() { return getParseUser("candidate"); }

    public ParseFile getTaskPic() {
        return getParseFile("taskPic");
    }

    public LatLng getLatLng() {
        LatLng latlng = new LatLng(getLatitude(), getLongitude());
        return latlng;
    }

    public Task(){
    }

}
