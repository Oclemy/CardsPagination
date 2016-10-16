package com.tutorials.hp.cardspagination;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Card> cards=new ArrayList<>();
    Button prevBtn,nextBtn;
    LinearLayout layout;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        layout= (LinearLayout) findViewById(R.id.content);
        prevBtn= (Button) findViewById(R.id.prevBtn);
        nextBtn= (Button) findViewById(R.id.nextBtn);
        prevBtn.setEnabled(false);

        for(int i=0;i<5;i++)
        {
            cards.add(Card.newInstance(this,i));
        }

        layout.addView(Card.newInstance(this,i));

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i<cards.size())
                {
                    i+=1;
                    layout.removeAllViews();
                    layout.addView(Card.newInstance(MainActivity.this,i));

                    if(i==cards.size())
                    {
                        nextBtn.setEnabled(false);
                        prevBtn.setEnabled(true);

                    }else
                    {
                        nextBtn.setEnabled(true);
                        prevBtn.setEnabled(true);

                    }
                }

            }
        });
        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i>0)
                {
                    i-=1;
                    layout.removeAllViews();
                    layout.addView(Card.newInstance(MainActivity.this,i));

                    if(i==0)
                    {
                        prevBtn.setEnabled(false);
                        nextBtn.setEnabled(true);

                    }else
                    {
                        prevBtn.setEnabled(true);
                        nextBtn.setEnabled(true);

                    }
                }

            }
        });


    }
}
