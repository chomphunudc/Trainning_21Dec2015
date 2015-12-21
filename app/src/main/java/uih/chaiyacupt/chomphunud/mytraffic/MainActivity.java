package uih.chaiyacupt.chomphunud.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    }//Main Method
    Private void bindWidget() {
        trafficListView = (ListView) findviewById(R.id.listView)
        aboutMebutton = (Button) findViewByID(R.id.button)
    }

}//Main Class
