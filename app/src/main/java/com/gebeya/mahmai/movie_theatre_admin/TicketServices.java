package com.gebeya.mahmai.movie_theatre_admin;

import com.gebeya.mahmai.movie_theatre_admin.ticketModel.Ticket;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface TicketServices {

    @Headers({"Content-Type: application/json;charset=UTF-8"})
    @GET("confirm/{tickerId}")
    Call<Ticket> confirmTicket(@Header("Authorization") String authHeade,
            @Path("tickerId") String tickerId);

}
