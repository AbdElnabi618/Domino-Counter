package kh618.dominocounter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Normal3 extends Fragment {
    TextView scorePlayer1 , scorePlayer2,scorePlayer3 ,clear;
    EditText score ;
    Button addPlayer1 , addPlayer2, addPlayer3;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v;
        v = inflater.inflate(R.layout.fragment_normal3, container, false);
        scorePlayer1 = v.findViewById(R.id.scorePlayer_1_normal);
        scorePlayer2 = v.findViewById(R.id.scorePlayer_2_normal3);
        scorePlayer3 = v.findViewById(R.id.scorePlayer_3_normal3);

        score =v.findViewById(R.id.textN3);

        addPlayer1 = v.findViewById(R.id.addPlayer_1_normal3);
        addPlayer2 = v.findViewById(R.id.addPlayer_2_normal3);
        addPlayer3 = v.findViewById(R.id.addPlayer_3_normal3);

        clear = v.findViewById(R.id.clearN3);

        addPlayer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {operator(scorePlayer1); }
        });
        addPlayer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator(scorePlayer2
                );

            }
        });
        addPlayer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator(scorePlayer3);

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score.setText("");
                scorePlayer1.setText(String.valueOf(0));
                scorePlayer2.setText(String.valueOf(0));
            }
        });
        return v;
    }
    private void operator (TextView t){
        if(score.getText().toString().equals(""))
            score.setText("0");

        int i = Integer.parseInt(score.getText().toString()) +
                        Integer.parseInt(t.getText().toString());

        t.setText(String.valueOf(i));
        score.setText("");
    }

}
