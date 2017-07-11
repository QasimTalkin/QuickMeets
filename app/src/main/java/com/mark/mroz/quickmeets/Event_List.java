package com.mark.mroz.quickmeets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Event_List extends AppCompatActivity {

    int [] IMAGES = {R.drawable.baseball,R.drawable.basket_ball, R.drawable.wrestling, R.drawable.volleyball_a08, R.drawable.hockey, R.drawable.default_sporttype,
                        R.drawable.dancing, R.drawable.foot_ball, R.drawable.frisbee, R.drawable.tennis_b18, R.drawable.hockey};

    String [] SPORTSTYPE = {"Base Ball","Basket Ball", "Wrestling", "Volley Ball", "Hockey", "Default",
        "Dancing", "Foot Ball", "Frisbee", "Tennis", "Hockey"};

    String [] DESCRIPTION = {"Base Ball","Basket Ball", "Wrestling", "Volley Ball", "Hockey", "Default",
            "Dancing", "Foot Ball", "Frisbee", "Tennis", "Hockey"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_event__list);


        ListView listView =  (ListView)findViewById(R.id.listView);  //id in xml

        CustomeAdpter customeAdpter = new CustomeAdpter();
        listView.setAdapter(customeAdpter);

    }

    // adpater calss

    class CustomeAdpter extends BaseAdapter{


        @Override
        public int getCount() {   //Takein in how many active events right now?
            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            view = getLayoutInflater().inflate(R.layout.activity_custome_event_layout, null);
            ImageView imageView = (ImageView)view.findViewById(R.id.iconView);
            TextView textView_title = (TextView)view.findViewById(R.id.textView_SportName);
            TextView textView_desc = (TextView)view.findViewById(R.id.textView_EventDes);
            Button button_join = (Button)view.findViewById(R.id.join_button);


            imageView.setImageResource(IMAGES[i]);
            textView_title.setText(SPORTSTYPE[i]);
            textView_desc.setText(DESCRIPTION[i]);
            return view;
        }
    }
}
