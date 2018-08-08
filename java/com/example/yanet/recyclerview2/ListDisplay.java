package com.example.yanet.recyclerview2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class ListDisplay extends AppCompatActivity{
    // Array of strings...
    // String[] mobileArray = {"Infinitive answer","Simple Past answered","Past Participle anwered",
    //       "Spanisch responder","nfinitive add","Simple SimplePast added","PastParticiple added","Spanich agregar"
    //};
    private ListView lvEnglish;


    private String mobileArray[]=new String[]
            {"Infinitive  (answer)",
            "Simple Past  (answered)",
            "Past Participle (answered)",
            "Spanish  (responder)",
            "infinitive  (add)",
            "Simple Past (arrest)",
            "Past Participle  (arrested)",
            "Spanish (arrestar)",
                    "Infinitive    (become)",
                    "Simple Past   (became)",
                    "Past Participle   (become)",
                    "Spanish (convertirse)",
                    "Infinitive    (begin)",
                    "Simple Past   (began)",
                    "Past Participle   (begun)",
                    "Spanish (comenzar)",
                    "Infinitive    (boil)",
                    "Simple Past   (boiled)",
                    "Past Participle   (booked)",
                    "Spanish (reservar)",
                    "Infinitive    (borrow)",
                    "Simple Past   (borrowed)",
                    "Past Participle   (borrowed)",
                    "Spanish (tomar prestado)",
                    "Infinitive    (be)",
                    "Simple Past   (was/were)",
                    "Past Participle   (been)",
                    "Spanish (ser)",
                    "Infinitive    (add)",
                    "Simple Past   (added)",
                    "Past Participle   (added)",
                    "Spanish (agregar)",
                    "Infinitive    (break)",
                    "Simple Past   (broke)",
                    "Past Participle   (broken)",
                    "Spanish (romper)",
                    "Infinitive    (mean/means)",
                    "Simple Past   (meant)",
                    "Past Participle   (meant)",
                    "Spanish (querer/decir)",
                    "Infinitive    (mind/minds)",
                    "Simple Past   (moved)",
                    "Past Participle   (moved)",
                    "Spanish (mudarse/mover)",
                    "Infinitive    (need/needs)",
                    "Simple Past   (needed)",
                    "Past Participle   (nodding)",
                    "Spanish (asentir)",
                    "Infinitive    (nod/nods)",
                    "Simple Past   (nodded)",
                    "Past Participle   (nodded)",
                    "Spanish (nesesitar)",
                    "Infinitive    (say/says)",
                    "Simple Past   (said)",
                    "Past Participle   (said)",
                    "Spanish (decidir)",
                    "Infinitive    (smile/smiles)",
                    "Simple Past   (smiled)",
                    "Past Participle   (smiled)",
                    "Spanish (sonreir)",
                    "Infinitive    (stop/stops)",
                    "Simple Past   (stopped)",
                    "Past Participle   (stopped)",
                    "Spanish (dejar)",
                    "Infinitive    (tell/tells)",
                    "Simple Past   (told)",
                    "Past Participle   (told)",
                    "Spanish (contar)",
                    "Infinitive    (sit/sits)",
                    "Simple Past   (sat)",
                    "Past Participle   (sat)",
                    "Spanish (sentarse)",
                    "Infinitive    (take)",
                    "Simple Past   (took)",
                    "Past Participle   (talked)",
                    "Spanish (hablar)",
                    "Infinitive    (try)",
                    "Simple Past   (tried)",
                    "Past Participle   (tried)",
                    "Spanish (intentar)",
                    "Infinitive    (watches)",
                    "Simple Past   (watched)",
                    "Past Participle   (watched)",
                    "Spanish (mirar)",
                    "Infinitive    (work)",
                    "Simple Past   (worked)",
                    "Past Participle   (working)",
                    "Spanish (trabajar)",
                    "Infinitive    (think)",
                    "Simple Past   (thought)",
                    "Past Participle   (thought)",
                    "Spanish (pensar)",
                    "Infinitive    (wait)",
                    "Simple Past   (waited)",
                    "Past Participle   (waited)",
                    "Spanish (esperar)",
                    "Infinitive    (reply)",
                    "Simple Past   (replied)",
                    "Past Participle   (replied)",
                    "Spanish (contestar)"













            };






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);

        lvEnglish = (ListView) findViewById(R.id.lis);

        //Declaramos el Array Adactes,le pasamos el contexto, le indicamos para que tenga
        // una simple_expandable_list_item_1 y le damos nuestro Array de String
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1, mobileArray);

        //Le asignamos el adacter al listView
        lvEnglish.setAdapter(adapter);


        lvEnglish.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                /// Obtiene el valor de la casilla elegida

                String itemSeleccionado = parent.getItemAtPosition(position).toString();

                // muestra un mensaje
                Toast.makeText(getApplicationContext(), "El lenguaje seleccionado es: " +
                        itemSeleccionado, Toast.LENGTH_SHORT).show();
            }
        });



    }
}