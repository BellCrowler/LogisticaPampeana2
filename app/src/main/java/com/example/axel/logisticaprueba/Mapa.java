package com.example.axel.logisticaprueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Mapa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rendiciones);

        WebView view = (WebView) findViewById(R.id.webview);
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setBuiltInZoomControls(true);
        view.loadUrl("https://www.google.com/maps");


        //Configuracion para que se abra el navegador dentro de la app por si el ruso quiere cambiar algo

        view.setWebViewClient(new WebViewClient(){
            public boolean shouldOverriceUrlLoading(WebView view, String url){
                return false; //con esto la pagina se refresca en el webview y no abre fuera luego de rellenar el formulario

            }

        });
    }
}
