package com.example.ra.rabinroomproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ra.rabinroomproject.model.User;


/**
 * A simple {@link Fragment} subclass.
 */
public class UpdateUserFragment extends Fragment {
    private EditText UserId;
    private EditText UserName;
    private EditText UserEmail;
    private Button BnUpdateUser;


    public UpdateUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_update_user, container, false);


        UserId=view.findViewById(R.id.txt_user_id);
        UserName=view.findViewById(R.id.txt_name);
        UserEmail=view.findViewById(R.id.txt_email);
        BnUpdateUser=view.findViewById(R.id.bin_update_user);

        BnUpdateUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int id = Integer.parseInt(UserId.getText().toString());
                String name = UserName.getText().toString();
                String email = UserEmail.getText().toString();

                User user = new User();
                user.setId(id);
                user.setName(name);
                user.setEmail(email);

                MainActivity.myAppDatabase.myDao().updateUser(user);
                Toast.makeText(getActivity(),"User update successfully",Toast.LENGTH_SHORT).show();
                UserId.setText("");
                UserName.setText("");
                UserEmail.setText("");
            }
        });

        return view;
    }

}
