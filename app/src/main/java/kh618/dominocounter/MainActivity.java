package kh618.dominocounter;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {
    RadioGroup radioGameType , radioNumOfPlayer  ;
    ImageView logo ;
    LinearLayout btn_layout ;
    Animation animationScale ,animationDisapper ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_layout = findViewById(R.id.btn_layout);
        logo = findViewById(R.id.logo);
        radioGameType = findViewById(R.id.game_type);
        radioNumOfPlayer = findViewById(R.id.num_of_player);
        animationDisapper = AnimationUtils.loadAnimation(this, R.anim.disapper);
        animationScale = AnimationUtils.loadAnimation(this, R.anim.zoom);

        logo.startAnimation(animationScale);
        radioGameType.startAnimation(animationDisapper);
        radioGameType.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (btn_layout.getVisibility() == View.INVISIBLE) {
                    radioNumOfPlayer.setVisibility(View.VISIBLE);
                    radioNumOfPlayer.startAnimation(animationScale);
                }
            }
        });
        radioNumOfPlayer.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (btn_layout.getVisibility() == View.INVISIBLE) {
                    btn_layout.setVisibility(View.VISIBLE);
                    btn_layout.startAnimation(animationScale);
                }
            }
        });

    }

    public void h(View view) {
        Intent intent;
       switch (radioGameType.getCheckedRadioButtonId()){

           case R.id.american:
               Toast.makeText(this, "American", Toast.LENGTH_SHORT).show();
           /*   intent = new Intent(MainActivity.this , Main2Activity.class);
               startActivity(intent);*/
               break;
           case R.id.normal:
               Toast.makeText(this, "Normal", Toast.LENGTH_SHORT).show();
            /*   intent = new Intent(MainActivity.this , M.class);
               startActivity(intent);*/
               break;
           default:
               Toast.makeText(this, "no chose", Toast.LENGTH_SHORT).show();
               break;
       }
    }
}
