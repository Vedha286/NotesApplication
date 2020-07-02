package com.example.notesapplication;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NoteRecyclerAdapter extends RecyclerView.Adapter<NoteRecyclerAdapter.ViewHolder>{

    private final Context mContext;
    private final LayoutInflater mLayoutInflater;
    List<NoteInfo> mNotes;

    public NoteRecyclerAdapter(Context context, List<NoteInfo> notes) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(mContext);
        mNotes = notes;
    }

    @NonNull
    @Override
    //inflates view and passes it into the ViewHolder class and returns it back so that it can go into the pool the recycler view uses
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mLayoutInflater.inflate(R.layout.item_note_list, parent, false);       //top-level view
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        NoteInfo note = mNotes.get(position);
        holder.textCourse.setText(note.getCourse().getTitle());
        holder.textTitle.setText(note.getTitle());
        holder.currentPosition = position;
    }

    @Override
    public int getItemCount() {
        return mNotes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public final TextView textCourse;   //public because outer class should be able to reference it directly
        public final TextView textTitle;
        public int currentPosition = -1 ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //reference to text view for the course
            textCourse = (TextView) itemView.findViewById(R.id.text_course);
            /*textCourse.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(mContext, NoteActivity.class);
                    intent.putExtra(NoteActivity.NOTE_POSITION, currentPosition);
                    mContext.startActivity(intent);
                }
            });*/
            //reference to text view for the title of note
            textTitle = (TextView) itemView.findViewById(R.id.text_title);
        }
    }
}