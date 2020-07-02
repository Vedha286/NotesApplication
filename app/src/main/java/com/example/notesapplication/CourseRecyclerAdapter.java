package com.example.notesapplication;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class CourseRecyclerAdapter extends RecyclerView.Adapter<CourseRecyclerAdapter.ViewHolder>{

    private final Context mContext;
    private final LayoutInflater mLayoutInflater;
    private final List<CourseInfo> mCourses;

    public CourseRecyclerAdapter(Context context, List<CourseInfo> notes) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(mContext);
        mCourses = notes;
    }

    @NonNull
    @Override
    //inflates view and passes it into the ViewHolder class and returns it back so that it can go into the pool the recycler view uses
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mLayoutInflater.inflate(R.layout.item_course_list, parent, false);       //top-level view
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CourseInfo course = mCourses.get(position);
        holder.textCourse.setText(course.getTitle());
        holder.currentPosition = position;
    }

    @Override
    public int getItemCount() {
        return mCourses.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public final TextView textCourse;   //public because outer class should be able to reference it directly
        public int currentPosition = -1 ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //reference to text view for the course
            textCourse = (TextView) itemView.findViewById(R.id.text_course);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Snackbar.make(v, mCourses.get(currentPosition).getTitle(), Snackbar.LENGTH_LONG);
                }
            });
        }
    }
}