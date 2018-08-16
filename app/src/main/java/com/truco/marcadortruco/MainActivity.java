package com.truco.marcadortruco;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button oneButton = null;
    Button threeButton = null;
    Button sixButton = null;
    Button nineButton = null;
    Button twelveButton = null;

    Button oponentOneButton = null;
    Button oponentThreeButton = null;
    Button oponentSixButton = null;
    Button oponentNineButton = null;
    Button oponentTwelveButton = null;

    Button newGameButton = null;

    View.OnClickListener listenerOneButton = null;
    View.OnClickListener listenerThreeButton = null;
    View.OnClickListener listenerSixButton = null;
    View.OnClickListener listenerNineButton = null;
    View.OnClickListener listenerTwelveButton = null;

    View.OnClickListener listenerOponentOneButton = null;
    View.OnClickListener listenerOponentThreeButton = null;
    View.OnClickListener listenerOponentSixButton = null;
    View.OnClickListener listenerOponentNineButton = null;
    View.OnClickListener listenerOponentTwelveButton = null;

    View.OnClickListener listenerNewGameButton = null;

    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        oneButton = findViewById(R.id.oneButton);
        threeButton = findViewById(R.id.threeButton);
        sixButton = findViewById(R.id.sixButton);
        nineButton = findViewById(R.id.nineButton);
        twelveButton = findViewById(R.id.twelveButton);

        oponentOneButton = findViewById(R.id.oneOponentButton);
        oponentThreeButton = findViewById(R.id.threeOponentButton);
        oponentSixButton = findViewById(R.id.sixOponentButton);
        oponentNineButton = findViewById(R.id.nineOponentButton);
        oponentTwelveButton = findViewById(R.id.twelveOponentButton);

        newGameButton = findViewById(R.id.newGameButton);

        setupListeners();
        implementListeners();
    }

    private void setupListeners() {

        listenerNewGameButton = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Cria o gerador do AlertDialog
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                //define o titulo
                builder.setTitle("Começar um novo jogo");
                //define a mensagem
                builder.setMessage("Tem certeza que quer iniciar um novo jogo?");
                //define um botão como positivo
                builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {
                        TextView youPoints = findViewById(R.id.youPoints);
                        TextView oponentsPoints = findViewById(R.id.oponentPoints);
                        youPoints.setText("0");
                        oponentsPoints.setText("0");
                        enableButtons(true);
                    }
                });
                //define um botão como negativo.
                builder.setNegativeButton("Não", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {
                    }
                });

                //cria o AlertDialog
                AlertDialog alerta = builder.create();
                //Exibe
                alerta.show();
            }
        };



        listenerOneButton = new View.OnClickListener() {
            public void onClick(View v) {
                TextView youTextview = findViewById(R.id.youPoints);
                int oldValue = Integer.valueOf(youTextview.getText().toString());
                int newValue = oldValue + 1;
                youTextview.setText(String.valueOf(newValue));
            }
        };

        listenerThreeButton = new View.OnClickListener() {
            public void onClick(View v) {
                TextView youTextview = findViewById(R.id.youPoints);
                int oldValue = Integer.valueOf(youTextview.getText().toString());
                int newValue = oldValue + 3;
                youTextview.setText(String.valueOf(newValue));
            }
        };

        listenerSixButton = new View.OnClickListener() {
            public void onClick(View v) {
                TextView youTextview = findViewById(R.id.youPoints);
                int oldValue = Integer.valueOf(youTextview.getText().toString());
                int newValue = oldValue + 6;
                youTextview.setText(String.valueOf(newValue));
            }
        };

        listenerNineButton = new View.OnClickListener() {
            public void onClick(View v) {
                TextView youTextview = findViewById(R.id.youPoints);
                int oldValue = Integer.valueOf(youTextview.getText().toString());
                int newValue = oldValue + 9;
                youTextview.setText(String.valueOf(newValue));
            }
        };

        listenerTwelveButton = new View.OnClickListener() {
            public void onClick(View v) {
                TextView youTextview = findViewById(R.id.youPoints);
                int oldValue = Integer.valueOf(youTextview.getText().toString());
                int newValue = oldValue + 12;
                youTextview.setText(String.valueOf(newValue));
            }
        };

        listenerOponentOneButton = new View.OnClickListener() {
            public void onClick(View v) {
                TextView youTextview = findViewById(R.id.oponentPoints);
                int oldValue = Integer.valueOf(youTextview.getText().toString());
                int newValue = oldValue + 1;
                youTextview.setText(String.valueOf(newValue));
            }
        };

        listenerOponentThreeButton = new View.OnClickListener() {
            public void onClick(View v) {
                TextView youTextview = findViewById(R.id.oponentPoints);
                int oldValue = Integer.valueOf(youTextview.getText().toString());
                int newValue = oldValue + 3;
                youTextview.setText(String.valueOf(newValue));
            }
        };

        listenerOponentSixButton = new View.OnClickListener() {
            public void onClick(View v) {
                TextView youTextview = findViewById(R.id.oponentPoints);
                int oldValue = Integer.valueOf(youTextview.getText().toString());
                int newValue = oldValue + 6;
                youTextview.setText(String.valueOf(newValue));
            }
        };

        listenerOponentNineButton = new View.OnClickListener() {
            public void onClick(View v) {
                TextView youTextview = findViewById(R.id.oponentPoints);
                int oldValue = Integer.valueOf(youTextview.getText().toString());
                int newValue = oldValue + 9;
                youTextview.setText(String.valueOf(newValue));
            }
        };

        listenerOponentTwelveButton = new View.OnClickListener() {
            public void onClick(View v) {
                TextView youTextview = findViewById(R.id.oponentPoints);
                int oldValue = Integer.valueOf(youTextview.getText().toString());
                int newValue = oldValue + 12;
                youTextview.setText(String.valueOf(newValue));
            }
        };
    }

    private void implementListeners() {
        oneButton.setOnClickListener(listenerOneButton);
        threeButton.setOnClickListener(listenerThreeButton);
        sixButton.setOnClickListener(listenerSixButton);
        nineButton.setOnClickListener(listenerNineButton);
        twelveButton.setOnClickListener(listenerTwelveButton);

        oponentOneButton.setOnClickListener(listenerOponentOneButton);
        oponentThreeButton.setOnClickListener(listenerOponentThreeButton);
        oponentSixButton.setOnClickListener(listenerOponentSixButton);
        oponentNineButton.setOnClickListener(listenerOponentNineButton);
        oponentTwelveButton.setOnClickListener(listenerOponentTwelveButton);

        newGameButton.setOnClickListener(listenerNewGameButton);

        TextView youTextView = findViewById(R.id.youPoints);
        TextView oponentTextView = findViewById(R.id.oponentPoints);

        youTextView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                int points = Integer.valueOf(s.toString());
                if (points >= 12) {
                    //Cria o gerador do AlertDialog
                    AlertDialog.Builder builder = new AlertDialog.Builder(context);
                    //define o titulo
                    builder.setTitle("Parabéns!");
                    //define a mensagem
                    builder.setMessage("Você Venceu!!!");
                    builder.setNeutralButton("OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                    enableButtons(false);
                                    newGameButton.callOnClick();
                                }
                            });

                    //cria o AlertDialog
                    AlertDialog alerta = builder.create();
                    //Exibe
                    alerta.show();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        oponentTextView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                int points = Integer.valueOf(s.toString());
                if (points >= 12) {
                    //Cria o gerador do AlertDialog
                    AlertDialog.Builder builder = new AlertDialog.Builder(context);
                    //define o titulo
                    builder.setTitle("Que pena!");
                    //define a mensagem
                    builder.setMessage("Você Perdeu!!!");
                    builder.setNeutralButton("OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                    enableButtons(false);
                                    newGameButton.callOnClick();
                                }
                            });

                    //cria o AlertDialog
                    AlertDialog alerta = builder.create();
                    //Exibe
                    alerta.show();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    private void enableButtons(boolean bool) {
        oneButton.setEnabled(bool);
        threeButton.setEnabled(bool);
        sixButton.setEnabled(bool);
        nineButton.setEnabled(bool);
        twelveButton.setEnabled(bool);

        oponentOneButton.setEnabled(bool);
        oponentThreeButton.setEnabled(bool);
        oponentSixButton.setEnabled(bool);
        oponentNineButton.setEnabled(bool);
        oponentTwelveButton.setEnabled(bool);
    }
}
