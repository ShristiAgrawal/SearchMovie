package com.example.search_movie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    Adapter a;
    RecyclerView rv;
private TextView t;
private Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
t=findViewById(R.id.text);
b=findViewById(R.id.b1);
b.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        service s=client.getins().create(service.class);
        Call<MovieResponse> call=s.getMovieResponse("dbea4e917d02e56372d6083c682aeab6",t.getText().toString().trim());

        call.enqueue(new Callback<MovieResponse>() {
            @Override
            public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
                generateList(response.body());
            }

            @Override
            public void onFailure(Call<MovieResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this,"abcd",Toast.LENGTH_SHORT);
            }
        });

    }
});

    }

    private void generateList(MovieResponse body) {

        rv=findViewById(R.id.rv);
        RecyclerView.LayoutManager lm=new LinearLayoutManager(this);

        a=new Adapter(MainActivity.this,body.getList());
        rv.setLayoutManager(lm);
        rv.setAdapter(a);


    }
}
