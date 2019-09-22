package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // text_edit
        //setContentView(R.layout.activity_main_text_edit);
        //snackbar
        //setContentView(R.layout.activity_main_snackbar);
        //BottomSheet
        setContentView(R.layout.activity_main_bottom_sheet);

        LinearLayout llBottomSheet = findViewById(R.id.bottom_sheet);

        // init the bottom sheet behavior
        BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from(llBottomSheet);
    }

//    public void onClickButton(final View view) {
//        Snackbar snackbar;
//        snackbar = Snackbar.make(view, "Работает", Snackbar.LENGTH_LONG)
//                .setAction("Кнопка", SnackbarOnClickListner);
//        snackbar.show();
//    }
//
//    View.OnClickListener SnackbarOnClickListner = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            Toast.makeText(getApplicationContext(), "SnackBar OnClickListener", Toast.LENGTH_LONG).show();
//        }
//    };
}
