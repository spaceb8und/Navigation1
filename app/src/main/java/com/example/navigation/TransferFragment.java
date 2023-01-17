package com.example.navigation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;


public class TransferFragment extends Fragment {

    EditText editText,editText2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_transfer, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final NavController navController= Navigation.findNavController(view);
        Button button = view.findViewById(R.id.enterMoney);


        button=view.findViewById(R.id.enterMoney);
        editText=view.findViewById(R.id.editTextPhone);
        editText2=view.findViewById(R.id.editTextMoney);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                String phone =editText.getText().toString();
                String money = editText2.getText().toString();
                bundle.putString("k","Вы отправили " + money + "₽" +" на номер: "+phone);
                navController.navigate(R.id.action_transferFragment_to_confirmFragment,bundle);
            }
        });
    }


}