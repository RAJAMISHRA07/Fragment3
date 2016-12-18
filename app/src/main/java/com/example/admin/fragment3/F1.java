package com.example.admin.fragment3;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class F1 extends Fragment {
    //declare all variable
    ListView listView;
    String[] cities={"Bangalore","Hyderabad","Delhi","Mumbai","Pune"};
    ArrayAdapter<String>arrayAdapter;



    public F1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_f1, container, false);
        listView= (ListView) view.findViewById(R.id.listview);
        arrayAdapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,cities);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //USE GET ACTIVITY() IN LISTVIEW IN CLICK LISTENER
                MainActivity m= (MainActivity) getActivity();
                //PASS DATA TO METHOD OF ACTIVITY 1- WITH APPROPRIATE CITY NAME
                m.passData(cities[position]);


            }
        });


        return view;
    }

}
