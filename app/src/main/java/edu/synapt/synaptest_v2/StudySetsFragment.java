package edu.synapt.synaptest_v2;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.synapt.synaptest_v2.cardStructures.Category;
import edu.synapt.synaptest_v2.RecyclerViewStuff.CategoryAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link StudySetsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link StudySetsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StudySetsFragment extends Fragment {
    private RecyclerView coursesRecyclerView;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private RecyclerView mRecyclerView;
    private RecyclerView mRecyclerView2;
    private LinearLayoutManager mLayoutManager;
    private LinearLayoutManager mLayoutManager2;
    private CategoryAdapter mAdapter;
    private CategoryAdapter mAdapter2;
    private List<Category> CategoryList;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public StudySetsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment StudySetsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static StudySetsFragment newInstance(String param1, String param2) {
        StudySetsFragment fragment = new StudySetsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        ((AppCompatActivity)getActivity()).getSupportActionBar().hide();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_study_sets, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.courses_recyclerView);
        mRecyclerView2 = (RecyclerView) view.findViewById(R.id.projects_recyclerView);
        mLayoutManager = new LinearLayoutManager(this.getActivity());
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mLayoutManager2 = new LinearLayoutManager(this.getActivity());
        mLayoutManager2.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView2.setLayoutManager(mLayoutManager2);
        mAdapter = new CategoryAdapter(getNames(20));
        mAdapter2 = new CategoryAdapter(getNames(15));
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView2.setAdapter(mAdapter2);

        // Gets study list data from the database
        // ArrayList<String> myDataList = fetchDataFromDB(); // will return Data from DB
        //  CategoryAdapter adapter = new CategoryAdapter(myDataList);

        return view;
    }

        // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    public List<Category> getNames( int size){
        List<Category> result = new ArrayList<Category>();
        for (int i=1; i <= size; i++) {
            Category c = new Category();
            c.name = Category.NAME_PREFIX + i;
            result.add(c);
        }
        return result;
    }
}
