package com.example.ultimatetutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText toToastText;
    Button clearButton;
    Button toastButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toToastText = (EditText) findViewById(R.id.edToToast);
        toToastText.setOnClickListener(new TextOnClickListener()); //initiates the onClick listeners for the buttons
        clearButton = (Button) findViewById(R.id.btnClear);
        toastButton = (Button) findViewById(R.id.btnToast);

    }
    private class TextOnClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {

            clearButton.setOnClickListener(new ButtonOnClickListener());
            toastButton.setOnClickListener(new ButtonOnClickListener());

            clearButton.setOnLongClickListener(new ButtonOnLongClickListener());
            toastButton.setOnLongClickListener(new ButtonOnLongClickListener());
        }
    }

    private class ButtonOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.btnClear){
                toToastText.setText("");
            }else if(v.getId() == R.id.btnToast){
                Toast.makeText(v.getContext(), toToastText.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        }
    }

    private class ButtonOnLongClickListener implements View.OnLongClickListener {
        @Override
        public boolean onLongClick(View v) { //the boolean : true if the callback consumed the long click, false otherwise.
            // if true , onLongClick wont be called
            String hint = null;
            Context context = v.getContext();
            if (v.getId() == R.id.btnClear){
               hint = getString(R.string.btn_clear_hint) ;
                Toast.makeText(context, hint, Toast.LENGTH_SHORT).show();
            }else if(v.getId() == R.id.btnToast){

                hint = context.getString(R.string.btn_toast_hint) ;
                Toast.makeText(context, hint, Toast.LENGTH_SHORT).show();

            }
            return false;
        }
    }
}
