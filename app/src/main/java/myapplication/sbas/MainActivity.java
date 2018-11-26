package myapplication.sbas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.WindowManager;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);//to check
        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        //Set Event
        setSingleEvent(mainGrid);
        //setToggleEvent(mainGrid);
    }


    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    switch(finalI)
                    {
                        case 0:
                            Intent intent0 = new Intent(MainActivity.this,ActivityOne.class);
                            intent0.putExtra("info","Modified This is activity from card item index  "+finalI);
                            startActivity(intent0);
                            break;
                        case 1:
                            Intent intent1 = new Intent(MainActivity.this,schoolloginform.class);
                            startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2 = new Intent(MainActivity.this,BusMap.class);
                            intent2.putExtra("info","This is activity from card item index  "+finalI);
                            startActivity(intent2);
                            break;

                        case 3:
                            Intent intent3 = new Intent(MainActivity.this,ActivityOne.class);
                            intent3.putExtra("info","This is activity from card item index  "+finalI);
                            startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4 = new Intent(MainActivity.this,ActivityOne.class);
                            intent4.putExtra("info","This is activity from card item index  "+finalI);
                            startActivity(intent4);
                            break;
                        case 5:
                            finish(); //to check if app is destroyed

                            break;

                    }

                }
            });
        }
    }
}