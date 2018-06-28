package kh618.dominocounter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class American2_4 extends Fragment {
    TextView scorePlayer1 , scorePlayer2 ;
    EditText score ;
    Button addPlayer1 , addPlayer2,mainsPlayer1,mainsPlayer2,clear;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_amrican2_4, container, false);

            scorePlayer1 = v.findViewById(R.id.scorePlayer1Amer24);
            scorePlayer2 = v.findViewById(R.id.scorePlayer2Amer24);

            score =v.findViewById(R.id.textA24);

            addPlayer1 = v.findViewById(R.id.addPlayer1Amer24);
            addPlayer2 = v.findViewById(R.id.addPlayer2Amer24);
            mainsPlayer1 = v.findViewById(R.id.minsPlayer1Amer24);
            mainsPlayer2 = v.findViewById(R.id.minsPlayer2Amer24);
            clear = v.findViewById(R.id.clearA24);

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
