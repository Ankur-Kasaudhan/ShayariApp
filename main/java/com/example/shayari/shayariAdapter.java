package com.example.shayari;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class shayariAdapter extends RecyclerView.Adapter<shayariAdapter.ShayariViewHolder> {

    private Context context;
    private ArrayList<shayariData> list;

    public shayariAdapter(Context context, ArrayList<shayariData> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ShayariViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return new ShayariViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShayariViewHolder holder, int position) {
        holder.textview.setText(list.get(position).getText());
        setAnimation(holder.itemView);                      //For animation



        //This method is for WhatsApp Share:->>
        holder.whatsapp.setOnClickListener(v ->{                //It is same as setOnClickListener method
            try {
                Intent whatsappShare = new Intent(Intent.ACTION_SEND);
                whatsappShare.setType("text/plane");
                whatsappShare.setPackage("com.whatsapp");
                whatsappShare.putExtra(Intent.EXTRA_TEXT,list.get(position).getText());    //this is for Text whatever we want to share it will get the position of that text :-
                context.startActivity(whatsappShare);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        //This method is for share the text to anyone from any Platform:->>(like: Insta , Fb, Whatsapp ,Message)
        holder.share.setOnClickListener(v ->{
            try {
                Intent share  = new Intent(Intent.ACTION_SEND);
                share.setType("text/plane");
                share.putExtra(Intent.EXTRA_TEXT,list.get(position).getText());                //this is for Text whatever we want to share it will get the position of that text :-
                context.startActivity(share);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        //This method is for copy the text :->>
        holder.copy.setOnClickListener(v ->{
            try {
                ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData data = (ClipData) ClipData.newPlainText("text",list.get(position).getText());               //this is for Text whatever we want to copy it will get the position of that text :-
                clipboardManager.setPrimaryClip(data);

                Toast.makeText(context, "Shayari Copied", Toast.LENGTH_SHORT).show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }



    // for animation in left:-
    private void setAnimation(View view)
    {
        Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
        view.setAnimation(animation);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ShayariViewHolder extends RecyclerView.ViewHolder {

        private ImageView whatsapp,share,copy;
        private TextView textview;
        public ShayariViewHolder(@NonNull View itemView) {
            super(itemView);

            whatsapp = itemView.findViewById(R.id.whatsapp);
            share = itemView.findViewById(R.id.share);
            copy = itemView.findViewById(R.id.copy);
            textview = itemView.findViewById(R.id.text);
        }
    }
}
