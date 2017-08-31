package com.example.princess.andelachallenge;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Princess on 4/23/2017.
 */

//This method locates the URL and fetch the data which is list of
// Github users in the filter(location) and pass it to the user class

public interface RestApiService {

    @GET("/search/users")
    Call<UserList> getUserList(@Query("q") String filter);

}
