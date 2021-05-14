package sg.edu.np.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageView icon = findViewById(R.id.imageView2);

        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewProfile();
            }
        });
    }

    private int randomInt(){
        Random ran = new Random();
        int value = ran.nextInt(10000);
        return value;
    }

    private void viewProfile(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Profile");
        builder.setMessage("MADness").setCancelable(false);
        builder.setPositiveButton("View", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                int value = randomOtp();
                Intent intent = new Intent(ListActivity.this, MainActivity.class);
                intent.putExtra("integer", value);
                startActivity(intent);
            }
        });

        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        AlertDialog alert = builder.create();
        alert.show();
    }

    private int randomOtp(){
        Random ran = new Random();
        int value = ran.nextInt(10000);
        return value;
    }
}