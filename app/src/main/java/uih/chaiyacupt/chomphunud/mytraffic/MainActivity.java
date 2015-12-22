package uih.chaiyacupt.chomphunud.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    private ListView TrafficListView;
    private Button aboutMebutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bing widget
        bindWidget();
        //Button Controller
        buttonControler();

    }

    private void bindWidget() {
    }//Main Class



    private void buttonControler(){
            aboutMebutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.phonton1);
                    buttonMediaPlayer.start();

                    Intent objIntent = new Intent(Intent.ACTION_VIEW);
                    objIntent.setData(Uri.parse("https://youtu.be/1YJ9QXe-h2A"));
                    startActivity(objIntent);



                    //event

                }
            });
    }

    }//Main Method

}//Main Class
