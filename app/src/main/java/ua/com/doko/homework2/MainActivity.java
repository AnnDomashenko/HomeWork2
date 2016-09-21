package ua.com.doko.homework2;

import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final float scale = getResources().getDisplayMetrics().density;



        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams((int)(165*scale), LinearLayout.LayoutParams.MATCH_PARENT);
        params.setMargins( 0, (int) (10 * scale),(int) (10 * scale), (int) (10*scale));

        LinearLayout.LayoutParams params1=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, (int)(60*scale));
        params1.setMargins((int) (10 * scale), (int) (10 * scale), (int) (10 * scale), (int) (10*scale));

        LinearLayout.LayoutParams params2=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params2.gravity=Gravity.CENTER;

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setBackgroundColor(0xff669900);

        LinearLayout linearLayout1=new LinearLayout(this);
        linearLayout1.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout1.setBackgroundColor(Color.WHITE);
        linearLayout.addView(linearLayout1,params1);

        ImageView imageView=new ImageView(this);
        imageView.setImageResource(R.mipmap.ic_launcher);
        linearLayout1.addView(imageView,params2);

        TextView textView=new TextView(this);
        textView.setText("Some text");
        textView.setTextSize(20);
        linearLayout1.addView(textView,params2);

        LinearLayout linearLayout2=new LinearLayout(this);
        linearLayout2.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout2.setBackgroundColor(Color.WHITE);
        linearLayout.addView(linearLayout2,params1);

        ImageView imageView1=new ImageView(this);
        imageView1.setImageResource(R.mipmap.ic_launcher);
        linearLayout2.addView(imageView1,params2);

        TextView textView1=new TextView(this);
        textView1.setText("Some text");
        textView1.setTextSize(20);
        linearLayout2.addView(textView1,params2);

        LinearLayout linearLayout3=new LinearLayout(this);
        linearLayout3.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout3.setBackgroundColor(Color.WHITE);
        linearLayout.addView(linearLayout3,params1);

        ImageView imageView2=new ImageView(this);
        imageView2.setImageResource(R.mipmap.ic_launcher);
        linearLayout3.addView(imageView2,params2);

        TextView textView2=new TextView(this);
        textView2.setText("Some text");
        textView2.setTextSize(20);
        linearLayout3.addView(textView2,params2);


        ViewGroup frameLayout = (ViewGroup) findViewById(R.id.fl);
        frameLayout.addView(linearLayout,params);
    }
}
