package com.example.parent_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AttendanceAdapter extends RecyclerView.Adapter<AttendanceAdapter.AttendanceViewHolder> {

    private List<AttendanceLog> attendanceList;

    // Constructor
    public AttendanceAdapter(ArrayList<AttendanceLog> attendanceList) {
        this.attendanceList = attendanceList;
    }

    @NonNull
    @Override
    public AttendanceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_attendance, parent, false);
        return new AttendanceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AttendanceViewHolder holder, int position) {
        AttendanceLog attendance = attendanceList.get(position);
        holder.timeTextView.setText(attendance.getTime());
        holder.locationTextView.setText(attendance.getLocation());
        holder.scannerRoleTextView.setText(attendance.getScannerRole());
    }

    @Override
    public int getItemCount() {
        return attendanceList.size();
    }

    public static class AttendanceViewHolder extends RecyclerView.ViewHolder {

        TextView timeTextView;
        TextView locationTextView;
        TextView scannerRoleTextView;

        public AttendanceViewHolder(@NonNull View itemView) {
            super(itemView);
            timeTextView = itemView.findViewById(R.id.textViewTime);
            locationTextView = itemView.findViewById(R.id.textViewLocation);
            scannerRoleTextView = itemView.findViewById(R.id.textViewScannerRole);
        }
    }
}
