package com.example.amanda.testingdialog;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Amanda on 3/26/2017.
 */

public class ScoreFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_score, container, false);

        Button b = (Button) rootView.findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ScoreChangeDialog scoreChangeDialog = new ScoreChangeDialog();
                scoreChangeDialog.show(getActivity().getFragmentManager().beginTransaction(),"fragment_tag");
            }
        });

        return rootView;
    }




}
