package com.apicalldemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.apicalldemo.adapter.UserListAdapter;
import com.apicalldemo.model.UserListData;
import com.apicalldemo.service.RetrofitClient;
import com.apicalldemo.utils.checkInterNetConn;
import com.google.android.material.progressindicator.CircularProgressIndicator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements checkInterNetConn {

    RecyclerView rvUserList;
    CircularProgressIndicator circularProgressIndicator;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvUserList=findViewById(R.id.rvUserList);
        circularProgressIndicator=findViewById(R.id.circleBar);

        getUserData();
    }

    void getUserData()
    {

        if(isNetworkConnected()) {
            Call<UserListData> call = RetrofitClient.getInstance().getMyApi().getUserList();

            call.enqueue(new Callback<UserListData>() {

                @Override
                public void onResponse(Call<UserListData> call, Response<UserListData> response) {

                    UserListData userListData = response.body();


                    if (userListData.getUsers() != null && userListData.getUsers().size() > 0) {
                        circularProgressIndicator.setVisibility(View.GONE);
                        rvUserList.setVisibility(View.VISIBLE);
                    } else if (userListData.getUsers() != null && userListData.getUsers().size() == 0) {
                        circularProgressIndicator.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, "Data Not Found", Toast.LENGTH_SHORT).show();
                    }


                    UserListAdapter userListAdapter = new UserListAdapter(userListData.getUsers());
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
                    rvUserList.setLayoutManager(linearLayoutManager);
                    rvUserList.setAdapter(userListAdapter);
                }

                @Override
                public void onFailure(Call<UserListData> call, Throwable t) {
                    Toast.makeText(getApplicationContext(), "An error has occured", Toast.LENGTH_LONG).show();
                }

            });
        }
        else
        {
            circularProgressIndicator.setVisibility(View.GONE);
            Toast.makeText(this, "Please Check Your Internet Connection!!", Toast.LENGTH_SHORT).show();
        }
    }



    private boolean isNetworkConnected() {
        ConnectivityManager cm = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        }

        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }


    @Override
    public void callbackInternet() {
        getUserData();
    }
}



