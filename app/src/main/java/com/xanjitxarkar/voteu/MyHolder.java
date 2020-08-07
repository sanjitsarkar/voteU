package com.xanjitxarkar.voteu;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {

    ImageView dp;
    TextView name,branch;

    public MyHolder(@NonNull View itemView) {
        super(itemView);

        this.dp=itemView.findViewById(R.id.candidateImageView);
        this.name=itemView.findViewById(R.id.nameTextView);
        this.branch=itemView.findViewById(R.id.semTextView);
    }
}
