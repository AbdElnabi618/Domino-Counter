package kh618.dominocounter;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Objects;

public class Main2Activity extends AppCompatActivity {
    String extra = "";

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

            extra = Objects.requireNonNull(getIntent().getExtras()).getString(getResources().getString(R.string.intentKey));



    }

    @Override
    protected void onStart() {
        super.onStart();
        switch (extra) {
            case "A24":
                getSupportFragmentManager().beginTransaction().replace(R.id.fram, new American2_4()).commit();
                break;
            case "A3":
                getSupportFragmentManager().beginTransaction().replace(R.id.fram, new American3()).commit();
                break;
            case "N24":
                getSupportFragmentManager().beginTransaction().replace(R.id.fram, new Normal2_4()).commit();
                break;
            case "N3":
                getSupportFragmentManager().beginTransaction().replace(R.id.fram, new Normal3()).commit();
                break;
        }
    }





}
