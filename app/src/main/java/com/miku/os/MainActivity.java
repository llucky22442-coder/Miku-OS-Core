package com.miku.os;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // Ye button Miku ka dimaag (folder) select karega
    private static final int PICK_BRAIN_FOLDER = 1;
    // Ye button Miku ki body (3D Model) select karega
    private static final int PICK_BODY_MODEL = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Background ko pitch black rakhenge
        setContentView(R.layout.activity_main);
        
        // Settings button ka logic yahan aayega
    }

    public void openBrainSelector(View view) {
        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT_TREE);
        startActivityForResult(intent, PICK_BRAIN_FOLDER);
    }
}
