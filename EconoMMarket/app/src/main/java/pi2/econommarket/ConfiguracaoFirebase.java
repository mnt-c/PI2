package pi2.econommarket;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ConfiguracaoFirebase {

    private static DatabaseReference database;
    private static FirebaseAuth auth;

    public static DatabaseReference getFirebase(){
        if(database == null){
            database = FirebaseDatabase.getInstance().getReference("pao/cerveja/Cervejas");
        }
        return database;
    }

    public static FirebaseAuth getFirebaseAutenticacao(){
        if(auth == null){
            auth = FirebaseAuth.getInstance();
        }
        return auth;
    }
}