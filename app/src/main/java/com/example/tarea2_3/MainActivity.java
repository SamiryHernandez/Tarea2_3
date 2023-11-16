package com.example.tarea2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.tarea2_3.Clases.SQLiteConexion;

public class MainActivity extends AppCompatActivity {

    EditText descripcion;
    ImageView imagen;
    Button guardar, mostrar, tomar;
    Bitmap bmImagen;

    SQLiteConexion conexion;
    String path;
    static final int REQUEST_CODE_CAMARA = 100;
    static final int REQUEST_TAKE_PHOTO = 101;
    private View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        tomar.setOnClickListener(this::onClickTakePhoto);
        mostrar.setOnClickListener(this::onClickShowActivity);
        guardar.setOnClickListener(this::onClickSave);
     }


     private void onClickSave(View view) {
         this.view = view;
         if(emptyFields(descripcion)){
             if(bmImagen.getByteCount() > 0){
                 guardarImagen();
             }else message("Debe tomar una foto");
         }else message("Debe ingresar su descipción");    }

    private void guardarImagen() {
    }

    private void onClickShowActivity(View view) {
    }

    private void onClickTakePhoto(View view) {
    }
}