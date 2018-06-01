package com.gebeya.mahmai.movie_theatre_admin.ticketModel;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ticket {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("last_modified")
    @Expose
    private String lastModified;
    @SerializedName("date_created")
    @Expose
    private String dateCreated;
    @SerializedName("showtime")
    @Expose
    private Showtime showtime;
    @SerializedName("user")
    @Expose
    private String user;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("qrDataURL")
    @Expose
    private String qrDataURL;
    @SerializedName("purchased")
    @Expose
    private Boolean purchased;
    @SerializedName("isActive")
    @Expose
    private Boolean isActive;
    @SerializedName("seat_number")
    @Expose
    private List<String> seatNumber = null;
    @SerializedName("reservation")
    @Expose
    private Reservation reservation;

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

    public Showtime getShowtime() {
        return showtime;
    }

    public void setShowtime(Showtime showtime) {
        this.showtime = showtime;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getQrDataURL() {
        return qrDataURL;
    }

    public void setQrDataURL(String qrDataURL) {
        this.qrDataURL = qrDataURL;
    }

    public Boolean getPurchased() {
        return purchased;
    }

    public void setPurchased(Boolean purchased) {
        this.purchased = purchased;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public List<String> getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(List<String> seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

}
