package br.com.example.alalgi.aprendaingles.Activities.Activities.Fragments;


import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import br.com.example.alalgi.aprendaingles.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BichosFragment extends Fragment implements View.OnClickListener {

    private ImageButton buttonCao, buttonGato, buttonLeao, buttonMacaco, buttonOvelha, buttonVaca;
    private MediaPlayer mediaPlayer;

    public BichosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bichos, container, false);

        buttonCao = view.findViewById(R.id.buttonCao);
        buttonGato = view.findViewById(R.id.buttonGato);
        buttonLeao = view.findViewById(R.id.buttonLeao);
        buttonMacaco = view.findViewById(R.id.buttonMacaco);
        buttonOvelha = view.findViewById(R.id.buttonOvelha);
        buttonVaca = view.findViewById(R.id.buttonVaca);


        buttonCao.setOnClickListener(this);
        buttonGato.setOnClickListener(this);
        buttonLeao.setOnClickListener(this);
        buttonMacaco.setOnClickListener(this);
        buttonOvelha.setOnClickListener(this);
        buttonVaca.setOnClickListener(this);

        return view;


    }

    @Override
    public void onClick(View v) {
        // Log.i("Elemento clicado","Item clicado " + v.getId());
        // Toast.makeText(getContext(), "teste " + v.getId(), Toast.LENGTH_SHORT).show();

        switch (v.getId()){
            case R.id.buttonCao:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.dog);
                tocarSom();
                break;
            case R.id.buttonGato:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cat);
                tocarSom();
                break;

            case R.id.buttonLeao:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.lion);
                tocarSom();
                break;

            case R.id.buttonMacaco:
                mediaPlayer = MediaPlayer.create(getActivity(),R.raw.monkey);
                tocarSom();
                break;

            case R.id.buttonOvelha:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.sheep);
                tocarSom();
                break;

            case R.id.buttonVaca:
                mediaPlayer =MediaPlayer.create(getActivity(), R.raw.cow);
                tocarSom();
                break;

       }
    }

    public void tocarSom(){
        //metodo para tocar som
        if(mediaPlayer != null){
            mediaPlayer.start();

            //quando parar de tocar som
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer.release();
                }
            });

        }
    }

    @Override
    public void onDestroy() {
        //para liberar e memoria quando o app for destruido
        super.onDestroy();
        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
