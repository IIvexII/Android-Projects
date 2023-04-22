package pk.zafeer.a13_addcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView answerView = findViewById(R.id.answer);
        EditText input1 = findViewById(R.id.editTextNumber);
        EditText input2 = findViewById(R.id.editTextNumber2);
        Button calculateBtn = findViewById(R.id.button);

        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valStr1 = String.valueOf(input1.getText());
                String valStr2 = String.valueOf(input2.getText());
                float val1, val2;

                if (valStr1.equals("")) {
                    val1 = 0f;
                } else {
                    val1 = Float.parseFloat(valStr1);
                }
                if (valStr2.equals("")) {
                    val2 = 0f;
                } else {
                    val2 = Float.parseFloat(valStr2);
                }


                float sum =  val1 + val2;

                answerView.setText("Answer: " + sum);
            }
        });

    }
}