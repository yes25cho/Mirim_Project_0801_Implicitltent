package mediapoint.project.mirim_project_0801_implicitltent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //String[] actions = {Intent.ACTION_DIAL, Intent.ACTION_VIEW, Intent.ACTION_VIEW, Intent.ACTION_WEB_SEARCH, Intent.ACTION_SENDTO, MediaStore.ACTION_IMAGE_CAPTURE};

        Button[] btn = new Button[6];
        int[] btnId = {R.id.btn_dial, R.id.btn_hompage, R.id.btn_map, R.id.btn_search, R.id.btn_sms,R.id.btn_camera};
        for(int i = 0; i<btn.length;i++){
            btn[i] = findViewById(btnId[i]);
            btn[i].setOnClickListener(btnListener);
        }
    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = null;
            Uri uri = null;
            switch (view.getId()){
                case R.id.btn_dial:
                    uri = Uri.parse("tel:01033337777");
                    intent = new Intent(Intent.ACTION_DIAL, uri);
                    break;
                case R.id.btn_hompage:
                    uri = Uri.parse("http://m.naver.com");
                    intent = new Intent(Intent.ACTION_VIEW, uri);
                    break;
                case R.id.btn_map:
                    break;
                case R.id.btn_search:
                    break;
                case R.id.btn_sms:
                    break;
                case R.id.btn_camera:
                    break;

            }
            startActivity(intent);
        }
    };
}