package com.example.portfolioapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A fragment representing a single project in the project-view. The fragment shows images/videos & text
 * about the given project.
 * 
 * https://developer.android.com/training/animation/screen-slide.html
 *
 */
public class ScreenSlideProjectFragment extends Fragment {
	
    /**
     * The number of media-objects to show on this user.
     */
    private static final int NUM_OBJECTS = 5;
	
    /**
     * The argument key for the page number this fragment represents.
     */
    public static final String ARG_PAGE = "page";

    /**
     * The fragment's page number, which is set to the argument value for {@link #ARG_PAGE}.
     */
    private int mPageNumber;
    
    protected static Project project;

    /**
     * Factory method for this fragment class. Constructs a new fragment for the given page number.
     */
    public static ScreenSlideProjectFragment create(int pageNumber, Project p) {
    	
    	project = p;
    	
    	ScreenSlideProjectFragment fragment = new ScreenSlideProjectFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, pageNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public ScreenSlideProjectFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNumber = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout containing a title and body text.
        ViewGroup rootView = (ViewGroup) inflater
                .inflate(R.layout.fragment_screen_slide_project, container, false);
        
        
        // Set the media and description.
        // Media, Instantiate a ViewPager and a PagerAdapter:
        PagerAdapter mPagerAdapter = new ScreenSlidePagerAdapter(getFragmentManager());
        ((ViewPager) rootView.findViewById(R.id.mediaPager)).setAdapter(mPagerAdapter);
        // Description:
        
        return rootView;
    }

    /**
     * Returns the page number represented by this fragment object.
     */
    public int getPageNumber() {
        return mPageNumber;
    }
    
    /**
     * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
     * sequence.
     */
    private class ScreenSlidePagerAdapter extends FragmentPagerAdapter {
    	
    	Project project = new Project();
    	
    	public void setProject(Project p) { project = p; }
    	
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return (Fragment) ScreenSlideProjectMediaFragment.create( position, project );
        }

        @Override
        public int getCount() {
            return NUM_OBJECTS;
        }
    }
}