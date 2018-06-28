package kh618.dominocounter;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Normal2_4 extends Fragment {
    TextView scorePlayer1 , scorePlayer2 ;
    EditText score ;
    Button addPlayer1 , addPlayer2 ,clear;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_normal2_4, container, false);
        scorePlayer1 = v.findViewById(R.id.scorePlayer1Nor24);
        scorePlayer2 = v.findViewById(R.id.scorePlayer2Nor24);

        score =v.findViewById(R.id.textNor24);

        addPlayer1 = v.findViewById(R.id.addPlayer1Nor24);
        addPlayer2 = v.findViewById(R.id.addPlayer2Nor24);

        clear = v.findViewById(R.id.clearN24);

        addPlayer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator(scorePlayer1);

            }
        });
        addPlayer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator(scorePlayer2);

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
        if(score.getText().equals(""))
            score.setText("0");
        int i = Integer.parseInt(score.getText().toString()) +
                        Integer.parseInt(t.getText().toString());

        t.setText(String.valueOf(i));
        score.setText("");
    }
}
