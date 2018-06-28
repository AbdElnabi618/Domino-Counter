package kh618.dominocounter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Spinner;


public class MainActivity extends Activity {
    ImageView logo ;
    Animation animationScale  ;

    Spinner gameType,numOfPlayers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = findViewById(R.id.logo);
        animationScale = AnimationUtils.loadAnimation(this, R.anim.zoom);

        gameType = findViewById(R.id.GameType);
        numOfPlayers = findViewById(R.id.numberOfPlayers);

        logo.startAnimation(animationScale);

    }

    public void h(View view) {
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        if (gameType.getSelectedItem().toString().equals("امريكي")&&
                numOfPlayers.getSelectedItem().toString().equals("ثنائي")

                || gameType.getSelectedItem().toString().equals("امريكي")&&
                numOfPlayers.getSelectedItem().toString().equals("رباعي"))
        {
            intent.putExtra(getResources().getString(R.string.intentKey),"A24");
            startActivity(intent);

        }else if(gameType.getSelectedItem().toString().equals("امريكي")&&
                numOfPlayers.getSelectedItem().toString().equals("ثلاثي"))
        {
            intent.putExtra(getResources().getString(R.string.intentKey),"A3");
            startActivity(intent);

        }else if (gameType.getSelectedItem().toString().equals("عادى")&&
                numOfPlayers.getSelectedItem().toString().equals("ثنائي")

                || gameType.getSelectedItem().toString().equals("عادى")&&
                numOfPlayers.getSelectedItem().toString().equals("رباعي"))
        {
            intent.putExtra(getResources().getString(R.string.intentKey),"N24");
            startActivity(intent);

        }else if(gameType.getSelectedItem().toString().equals("عادى")&&
                numOfPlayers.getSelectedItem().toString().equals("ثلاثي")){
            intent.putExtra(getResources().getString(R.string.intentKey),"N3");
            startActivity(intent);

        }
    }
}
