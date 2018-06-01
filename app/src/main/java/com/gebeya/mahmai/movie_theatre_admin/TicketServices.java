package com.gebeya.mahmai.movie_theatre_admin;

import com.gebeya.mahmai.movie_theatre_admin.ticketModel.Ticket;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface TicketServices {

    @Headers({"Content-Type: application/json;charset=UTF-8"})
    @POST("ticket/confirm")
    Call<Ticket> confirmTicket(@Body String tickerId);

}
