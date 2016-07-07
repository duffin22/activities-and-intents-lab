package co.ga.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText adj1,adj2,noun1,noun2,animal,game;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get access to editText and button
        adj1 = (EditText) this.findViewById(R.id.adj1Text);
        adj2 = (EditText) this.findViewById(R.id.adj2Text);
        noun1 = (EditText) this.findViewById(R.id.noun1Text);
        noun2 = (EditText) this.findViewById(R.id.noun2Text);
        animal = (EditText) this.findViewById(R.id.animalText);
        game = (EditText) this.findViewById(R.id.gameText);


        button = (Button) this.findViewById(R.id.MainButton);

        // send text to the subActivity when user clicks

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MAIN","button clicked");
                // create an Intent
                // *'this' used to refer to this instance of the class
                Intent intent = new Intent(MainActivity.this,ResultActivity.class);

                // get string values from edit texts
                String ad1=adj1.getText().toString();
                String ad2=adj2.getText().toString();
                String no1=noun1.getText().toString();
                String no2=noun2.getText().toString();
                String an=animal.getText().toString();
                String ga=game.getText().toString();

                //put extra info to intent
                intent.putExtra("adj1",ad1);
                intent.putExtra("adj2",ad2);
                intent.putExtra("noun1",no1);
                intent.putExtra("noun2",no2);
                intent.putExtra("animals",an);
                intent.putExtra("game",ga);


                // start subActivity with that Intent
                startActivity(intent);
            }
        });
    }
}
