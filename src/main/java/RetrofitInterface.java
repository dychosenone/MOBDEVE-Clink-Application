
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface RetrofitInterface {

    @POST("/login")
    Call<Login> executeLogin(@Body Login login);

    @GET("/logout")
    Call<Login> executeLogout();

    @POST("/register")
    Call<Register> executeRegister(@Body Register register);

    /*
    @PUT("/updateProfile")
    Call<UpdateProfile> executeUpdateProfile(@Body UpdateProfile updateprofile);

    @PUT("/changePassword")
    Call<ChangePassword> executeChangePassword(@Body ChangePassword changepassword);

    @GET("/viewProfile")
    Call<ViewProfile> executeViewProfile(@Body ViewProfile viewprofile);


    @PUT("/updateProfile")
    Call<UpdateProfile> executeUpdateProfile(@Body HashMap<String, String> map);
    */
}
