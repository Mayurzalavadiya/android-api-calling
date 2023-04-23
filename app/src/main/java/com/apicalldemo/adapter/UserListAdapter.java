package com.apicalldemo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.apicalldemo.R;
import com.apicalldemo.model.User;

import java.util.List;

public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.userListViewHolder> {


    List<User> userList;

    public UserListAdapter(List<User> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public userListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.adapter_user_list, parent, false);
        userListViewHolder viewHolder = new userListViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull userListViewHolder holder, int position) {
        User userData= userList.get(position);
        holder.txtFulllName.setText(""+userData.getFirstName()+" "+userData.getLastName());
        holder.txtEmailId.setText(""+userData.getEmail());
        holder.txtMobileNo.setText(""+userData.getPhone());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.itemView.getContext(), "Click!!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public static class userListViewHolder extends RecyclerView.ViewHolder {
        AppCompatTextView txtFulllName,txtEmailId,txtMobileNo;

        public userListViewHolder(View itemView) {
            super(itemView);
            txtFulllName=itemView.findViewById(R.id.txtFullName);
            txtEmailId=itemView.findViewById(R.id.txtEmailId);
            txtMobileNo=itemView.findViewById(R.id.txtPhoneNo);

        }
    }
}
