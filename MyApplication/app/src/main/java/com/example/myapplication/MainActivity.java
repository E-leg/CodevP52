package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import com.krypton.core.KryptonClient;
import android.widget.TextView;
import android.os.StrictMode;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.Map;
public class MainActivity extends AppCompatActivity {
    KryptonClient client = new KryptonClient("https://nusid.net/krypton-auth");
    String password, email;
    String id;
    EditText passwordInput;
    EditText emailInput;

    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);
        passwordInput = (EditText) findViewById(R.id.passwordInput);
        emailInput = (EditText) findViewById(R.id.emailInput);
        registerOnClick();
        connexionOnClick();
    }

    private void registerOnClick() {
        TextView changingText = (TextView) findViewById(R.id.text_to_change);
        Button changeTextButton = (Button) findViewById(R.id.registerButton);
        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                TextView changingText = (TextView) findViewById(R.id.text_to_change);
                password = passwordInput.getText().toString();
                email = emailInput.getText().toString();
                try {
                    client.register(email,password);
                    changingText.setText("success");
                }
                catch (Exception e){
                    changingText.setText(e.toString());
                }

            }
        });
    }

    private void connexionOnClick() {
        TextView changingText = (TextView) findViewById(R.id.text_to_change);
        Button changeTextButton = (Button) findViewById(R.id.connexionButton);
        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                TextView changingText = (TextView) findViewById(R.id.text_to_change);
                password = passwordInput.getText().toString();
                email = emailInput.getText().toString();
                try {
                    Map<String, Object> user=client.login(email,password);
                    id = client.getExpiryDate().toString();
                    changingText.setText(id);
                }
                catch (Exception e){
                    changingText.setText(e.toString());
                }

            }
        });
    }
}