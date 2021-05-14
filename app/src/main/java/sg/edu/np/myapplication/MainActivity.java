package sg.edu.np.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    User user1;
    private int value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user1 = new User("Hello World!", "Long Descriptionnnnnn", 1, false);
        Intent receivedData = getIntent();
        value = receivedData.getIntExtra("integer",0);

        TextView nameText = findViewById(R.id.nametext);
        TextView descText = findViewById(R.id.desctext);
        Button buttonf = findViewById(R.id.buttonf);
        Button buttonm = findViewById(R.id.button2);

        nameText.setText(user1.name + value);
        descText.setText(user1.desc);
        buttonf.setText("Follow");

        buttonf.setOnClickListener(new View.OnClickListener() {
            int duration = Toast.LENGTH_SHORT;
            Toast toast;

            @Override
            public void onClick(View v) {
                if (user1.followed == false){
                    buttonf.setText("Unfollow");
                    user1.followed = true;
                    toast = Toast.makeText(getApplicationContext(), "Followed" ,duration);
                    toast.show();
                }
                else{
                    buttonf.setText("Follow");
                    user1.followed = false;
                    toast = Toast.makeText(getApplicationContext(), "Unfollowed" ,duration);
                    toast.show();
                }

            }
        });


    }
}