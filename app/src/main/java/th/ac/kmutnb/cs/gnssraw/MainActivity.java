package th.ac.kmutnb.cs.gnssraw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private RelativeLayout relativeLayoutPosition;
    private RelativeLayout relativeLayoutList;
    private RelativeLayout relativeLayoutRecord;

    private LinearLayout linearLayoutMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayoutPosition = findViewById(R.id.main_position);
        relativeLayoutList = findViewById(R.id.main_list);
        relativeLayoutRecord = findViewById(R.id.main_record);

        linearLayoutMenu = findViewById(R.id.main_menu);
        linearLayoutMenu.setAnimation(AnimationUtils.loadAnimation(this, R.anim.blink_up));

        relativeLayoutList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Click -> MenuList");
                Intent intent = new Intent(MainActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });

        relativeLayoutRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Click -> MenuRecord");
                Intent intent = new Intent(MainActivity.this, RecordLoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
