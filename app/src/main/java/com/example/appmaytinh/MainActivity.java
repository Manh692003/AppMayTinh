package com.example.appmaytinh;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button cong, tru, nhan, chia;
    EditText so_thu_nhat, so_thu_hai;
    TextView textView;

    int so1, so2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cong = findViewById(R.id.btn_cong);
        tru = findViewById(R.id.btn_tru);
        nhan = findViewById(R.id.btn_nhan);
        chia = findViewById(R.id.btn_chia);

        so_thu_nhat = findViewById(R.id.so_thu_nhat);
        so_thu_hai = findViewById(R.id.so_thu_hai);

        textView = findViewById(R.id.answer);

        cong.setOnClickListener(this);
        tru.setOnClickListener(this);
        nhan.setOnClickListener(this);
        chia.setOnClickListener(this);
    }

    public int getIntFromEditText(EditText editText) {
        if (editText.getText().toString().equals("")) {
            Toast.makeText(this, "Nhập số", Toast.LENGTH_SHORT).show();
            return 0;
        } else {
            return Integer.parseInt(editText.getText().toString());
        }
    }

    @Override
    public void onClick(View view) {
        so1 = getIntFromEditText(so_thu_nhat);
        so2 = getIntFromEditText(so_thu_hai);

        switch (view.getId()) {
            case R.id.btn_cong:
                textView.setText("Kết quả: " + (so1 + so2));
                break;
            case R.id.btn_tru:
                textView.setText("Kết quả: " + (so1 - so2));
                break;
            case R.id.btn_nhan:
                textView.setText("Kết quả: " + (so1 * so2));
                break;
            case R.id.btn_chia:
                textView.setText("Kết quả: " + (so1 / so2));
                break;
        }
    }
}
