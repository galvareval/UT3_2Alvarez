package com.politecnico.dam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//Método para comprobar al hacer click en las imagenes
    public void clickado(View view)
    {
        int id = view.getId();
        switch (id) {
            case R.id.layautGames:
                Toast.makeText(this, getResources().getString(R.string.salute), Toast.LENGTH_SHORT).show();
                break;
            case R.id.layautContacts: {
                Toast.makeText(this, getResources().getString(R.string.contacts), Toast.LENGTH_SHORT).show();
                // Crear un intent para ver los contactos de los hospitales.
                Intent contactos = new Intent(this, Hospitales.class);
                startActivity(contactos);
                break;
            }
            case R.id.layautMaps:
                Toast.makeText(this, getResources().getString(R.string.maps), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}