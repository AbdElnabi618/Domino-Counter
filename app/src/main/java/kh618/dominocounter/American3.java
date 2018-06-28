package kh618.dominocounter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class American3 extends Fragment {
    TextView scorePlayer1 , scorePlayer2,scorePlayer3 ;
    EditText score ;
    Button addPlayer1 , addPlayer2, addPlayer3,mainsPlayer1,mainsPlayer2,mainsPlayer3,clear;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View v = inflater.inflate(R.layout.fragment_amirican3, container, false);

        scorePlayer1 = v.findViewById(R.id.scorePlayer_1_amr3);
        scorePlayer2 = v.findViewById(R.id.scorePlayer_2_amr3);
        scorePlayer3 = v.findViewById(R.id.scorePlayer_3_amr3);

        score =v.findViewById(R.id.textA3);

        addPlayer1 = v.findViewById(R.id.addPlayer_1_amr3);
        addPlayer2 = v.findViewById(R.id.addPlayer_2_amr3);
        addPlayer3 = v.findViewById(R.id.addPlayer_3_amr3);

        mainsPlayer1 = v.findViewById(R.id.removePlayer_1_amr3);
        mainsPlayer2 = v.findViewById(R.id.removePlayer_2_amr3);
        mainsPlayer3 = v.findViewById(R.id.removePlayer_3_amr3);

        clear = v.findViewById(R.id.clearA3);

        addPlayer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {operator(scorePlayer1,'+'); }
        });

        addPlayer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator(scorePlayer2,'+');

            }
        });

        addPlayer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator(scorePlayer3,'+');

            }
        });

        mainsPlayer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator(scorePlayer1 ,'-');
            }
        });

        mainsPlayer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator(scorePlayer2 ,'-');
            }
        });

        mainsPlayer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator(scorePlayer3 ,'-');
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
    private void operator (TextView t , char c){
        if(score.getText().toString().equals(""))
            score.setText("0");
        int i;
        switch (c) {
            case '-':
                i =  Integer.parseInt(t.getText().toString())
                        - Integer.parseInt(score.getText().toString()) ;
                break;
            case '+':
                i = Integer.parseInt(score.getText().toString()) +
                        Integer.parseInt(t.getText().toString());
                break;

            default: i=0;
                break;
        }
        if(i <0) i=0;

        t.setText(String.valueOf(i));
        score.setText("");
    }
}
