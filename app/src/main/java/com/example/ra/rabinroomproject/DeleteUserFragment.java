package com.example.ra.rabinroomproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ra.rabinroomproject.model.User;


/**
 * A simple {@link Fragment} subclass.
 */
public class DeleteUserFragment extends Fragment  {
    private TextView TxtUserId;
    private Button DeleteButton;


    public DeleteUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view= inflater.inflate(R.layout.fragment_delete_user, container, false);

      TxtUserId = view.findViewById(R.id.txt_delete_id);
      DeleteButton = view.findViewById(R.id.delete);
      DeleteButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {


              int id = Integer.parseInt(TxtUserId.getText().toString());

              User user = new User();
               user.setId(id);

               MainActivity.myAppDatabase.myDao().deleteUser(user);

              Toast.makeText(getActivity(),"user successfully removed.",Toast.LENGTH_SHORT).show();
              TxtUserId.setText("");

          }
      });


       return view;
    }
    
}
