
package com.gebeya.mahmai.movie_theatre_admin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Showtime {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("last_modified")
    @Expose
    private String lastModified;
    @SerializedName("date_created")
    @Expose
    private String dateCreated;
    @SerializedName("movie")
    @Expose
    private String movie;
    @SerializedName("cinemahall")
    @Expose
    private String cinemahall;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("archived")
    @Expose
    private Boolean archived;
    @SerializedName("show")
    @Expose
    private com.gebeya.mahmai.movie_theatre_admin.Show show;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getCinemahall() {
        return cinemahall;
    }

    public void setCinemahall(String cinemahall) {
        this.cinemahall = cinemahall;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public com.gebeya.mahmai.movie_theatre_admin.Show getShow() {
        return show;
    }

    public void setShow(com.gebeya.mahmai.movie_theatre_admin.Show show) {
        this.show = show;
    }

}
