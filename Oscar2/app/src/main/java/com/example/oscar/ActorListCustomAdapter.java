package com.example.oscar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nat on 2/29/16.
 */
public class ActorListCustomAdapter extends ArrayAdapter<Actor> {

        //I. This member variable will reference the ArrayList that comes in
        ArrayList<Actor> mTheDataArrayList;
        public ActorListCustomAdapter(Context context, ArrayList<Actor>theDataArrayList) {
            super(context, -1);
            mTheDataArrayList = theDataArrayList;
        }

        //II. getView returns an inflated version of our xml layout
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Actor theSelectedActor = mTheDataArrayList.get(position);
            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View custom_list_item_view = inflater.inflate(R.layout.actor_list_item,parent,false);

            //III. Get reference to the text view created in the xml layout
            TextView textViewName = (TextView)custom_list_item_view.findViewById(R.id.textViewName);
            textViewName.setText(theSelectedActor.getName());

            //IV.  Get reference to the image view created in the xml layout
            TextView textViewDOB = (TextView)custom_list_item_view.findViewById(R.id.textViewDOB);
            textViewDOB.setText(theSelectedActor.getDOB());

            TextView textViewNoWon = (TextView)custom_list_item_view.findViewById(R.id.textViewOscarsWon);
            textViewNoWon.setText(theSelectedActor.getNoOfOscarsWon());



            return custom_list_item_view;
        }
        //V. return the count
        @Override
        public int getCount() {
            return mTheDataArrayList.size();
        }

}
