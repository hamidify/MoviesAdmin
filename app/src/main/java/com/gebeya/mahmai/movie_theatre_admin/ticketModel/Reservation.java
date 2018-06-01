
package com.gebeya.mahmai.movie_theatre_admin.ticketModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reservation {

    @SerializedName("reservation_expiration")
    @Expose
    private String reservationExpiration;
    @SerializedName("reservation_start")
    @Expose
    private String reservationStart;

    public String getReservationExpiration() {
        return reservationExpiration;
    }

    public void setReservationExpiration(String reservationExpiration) {
        this.reservationExpiration = reservationExpiration;
    }

    public String getReservationStart() {
        return reservationStart;
    }

    public void setReservationStart(String reservationStart) {
        this.reservationStart = reservationStart;
    }

}
