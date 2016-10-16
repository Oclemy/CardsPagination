package com.tutorials.hp.cardspagination;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Oclemy on 9/11/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class Card extends CardView {

    public static Card newInstance(Context c,int pos)
    {
        Card card=new Card(c);
        card.setCardElevation(10);

        TextView nameTxt=new TextView(c);
        nameTxt.setPadding(5,5,5,5);
        nameTxt.setTextSize(20);

        ImageView img=new ImageView(c);
        img.setPadding(5,5,5,5);
        img.setLayoutParams(new ViewGroup.LayoutParams(400,400));

        switch (pos)
        {
            case 0 :
                card.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                card.setCardBackgroundColor(Color.parseColor("#009968"));
                nameTxt.setText("Card Page "+String.valueOf(pos));
                img.setImageResource(R.drawable.enterprise);
                card.addView(nameTxt);
                card.addView(img);

                break;
            case 1 :
                card.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                card.setCardBackgroundColor(Color.parseColor("#0099e5"));
                nameTxt.setText("Card Page "+String.valueOf(pos));
                img.setImageResource(R.drawable.hubble);
                card.addView(nameTxt);
                card.addView(img);
                break;
            case 2 :
                card.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                card.setCardBackgroundColor(Color.parseColor("#ee8600"));
                nameTxt.setText("Card Page "+String.valueOf(pos));
                img.setImageResource(R.drawable.kepler);
                card.addView(nameTxt);
                card.addView(img);
                break;
            case 3 :
                card.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                card.setCardBackgroundColor(Color.parseColor("#4caf50"));
                nameTxt.setText("Card Page "+String.valueOf(pos));
                img.setImageResource(R.drawable.spitzer);
                card.addView(nameTxt);
                card.addView(img);
                break;
            case 4 :
                card.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                card.setCardBackgroundColor(Color.parseColor("#03a9f4"));
                nameTxt.setText("Card Page "+String.valueOf(pos));
                img.setImageResource(R.drawable.voyager);
                card.addView(nameTxt);
                card.addView(img);
                break;
            default:
                card.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                card.setCardBackgroundColor(Color.parseColor("#009968"));
                nameTxt.setText("Card Page "+String.valueOf(pos));
                img.setImageResource(R.drawable.enterprise);
                card.addView(nameTxt);
                card.addView(img);
        }

        return card;
    }

    public Card(Context context) {
        super(context);
    }
}
