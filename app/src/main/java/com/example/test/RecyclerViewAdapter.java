package com.example.test;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private static final String TAG = "RecyclerViewAdapter";
    RecycleModel recycleModel;
    private Context mContext;

    public RecyclerViewAdapter(Context context ,RecycleModel recycleModel) {
        this.mContext = context ;
        this.recycleModel = recycleModel;
    }


    class ViewHolder extends RecyclerView.ViewHolder{

        TextView idText;
        TextView titletext;
        LinearLayout parentLayout;

        ViewHolder(View itemView) {
            super(itemView);
            idText = itemView.findViewById(R.id.id);
            titletext = itemView.findViewById(R.id.title);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.idText.setText(recycleModel.id.get(position).toString());
        holder.titletext.setText(recycleModel.title.get(position));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext, GetBody.class);
                intent.putExtra("body", recycleModel.body.get(position));
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return recycleModel.id.size();
    }

}
