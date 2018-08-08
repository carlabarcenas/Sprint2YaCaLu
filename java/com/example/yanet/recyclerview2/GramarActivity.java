package com.example.yanet.recyclerview2;

/**
 * Created by yanet on 06/07/2018.
 */
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yanet.recyclerview2.entidades.GrammarVoActivity;
import com.example.yanet.recyclerview2.fragments.DetallePersonajeFragment;
import com.example.yanet.recyclerview2.fragments.ListaPersonajesFragment;
import com.example.yanet.recyclerview2.interfaces.IComunicaFragments;
import com.example.yanet.recyclerview2.utilidades.Utilidades;


public class GramarActivity  extends AppCompatActivity
         implements ListaPersonajesFragment.OnFragmentInteractionListener,
        DetallePersonajeFragment.OnFragmentInteractionListener, IComunicaFragments{

        ListaPersonajesFragment listaFragment;
        DetallePersonajeFragment detalleFragment;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grammar);

        //Validamos que se trabaja en modo portrait desde un smarthPhone
        if(findViewById(R.id.contenedorFragment)!=null){
        Utilidades.PORTRAIT=true;
        if (savedInstanceState!=null){
        return;
        }
        listaFragment=new ListaPersonajesFragment();
        getSupportFragmentManager().beginTransaction().
        replace(R.id.contenedorFragment,listaFragment).commit();
        }else{
        Utilidades.PORTRAIT=false;
        }

        }

@Override
public void onFragmentInteraction(Uri uri) {

        }

@Override
public void enviarPersonaje(GrammarVoActivity personaje) {

        detalleFragment= (DetallePersonajeFragment) this.getSupportFragmentManager().
        findFragmentById(R.id.fragDetalle);

        if(detalleFragment!=null && findViewById(R.id.contenedorFragment)==null){
        detalleFragment.asignarInformacion(personaje);
        }else{
        detalleFragment=new DetallePersonajeFragment();
        Bundle bundleEnvio=new Bundle();
        bundleEnvio.putSerializable("objeto",personaje);
        detalleFragment.setArguments(bundleEnvio);

        //cargamos el fragment en el Activity
        getSupportFragmentManager().beginTransaction().
        replace(R.id.contenedorFragment,detalleFragment).
        addToBackStack(null).commit();
        }

        }
        }