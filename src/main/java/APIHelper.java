import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import netscape.javascript.JSObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIHelper {

    private Retrofit retrofit;
    private RetrofitInterface retrofitInterface;
    private static String BASE_URL = "http://localhost:3000";

    public APIHelper () {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        retrofitInterface = retrofit.create(RetrofitInterface.class);

    }

    public void login (String username, String password) {

        Login loginInformation = new Login(username, password);
        Call<Login> call = retrofitInterface.executeLogin(loginInformation);

        call.enqueue(new Callback<Login>() {
            @Override
            public void onResponse(Call<Login> call, Response<Login> response) {
                if(response.isSuccessful()) {
                    System.out.println(response.body().getMessage());
                    System.out.println(response.body().getUserId());
                } else {
                    System.out.println("Invalid Credentials");
                }
            }

            @Override
            public void onFailure(Call<Login> call, Throwable t) {
                System.out.println(t);
            }
        });
    }

}
