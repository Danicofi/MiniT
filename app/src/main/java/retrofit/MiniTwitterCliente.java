package retrofit;

import common.Constantes;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MiniTwitterCliente {
    private  static MiniTwitterCliente instance = null;
    private MiniTwitterService miniTwitterService;
    private Retrofit retrofit;

    public MiniTwitterCliente (){
        retrofit = new Retrofit.Builder()
                .baseUrl(Constantes.API_MINITWITTER_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        miniTwitterService = retrofit.create(MiniTwitterService.class);
    }

    public  static MiniTwitterCliente getInstance(){
        if(instance == null){
            instance = new MiniTwitterCliente();
        }
        return instance;
    }

    public MiniTwitterService getMiniTwitterService(){
        return miniTwitterService;
    }
}
