package com.example.portfolioapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;


/**
 * A fragment representing a single project in the project-view. The fragment shows images/videos & text
 * about the given project.
 * 
 * https://developer.android.com/training/animation/screen-slide.html
 *
 */
public class ScreenSlideProjectMediaFragment extends Fragment {
    /**
     * The argument key for the page number this fragment represents.
     */
    public static final String ARG_PAGE = "page";
    public static final String MEDIA = "";
    public static final String MEDIA_TYPE = "";

    /**
     * The fragment's page number, which is set to the argument value for {@link #ARG_PAGE}.
     */
    private int mPageNumber;
    
    private String mMedia;
    private String mMediaType;
    
    /**
     * Factory method for this fragment class. Constructs a new fragment for the given page number.
     */
    public static ScreenSlideProjectMediaFragment create(int pageNumber, Project project) {
        ScreenSlideProjectMediaFragment fragment = new ScreenSlideProjectMediaFragment();
        Bundle args = new Bundle();        
        
    	args.putString(MEDIA,
        		(project.getPicture(pageNumber)!=null) ? project.getPicture(pageNumber) :
        		(project.getVideo(project.pictures.size()-pageNumber)!=null) ? project.getVideo(project.pictures.size()-pageNumber) :
        		"");
        args.putString(MEDIA_TYPE,
        		(project.getPicture(pageNumber)!=null) ? "PICTURE" :
        		(project.getVideo(project.pictures.size()-pageNumber)!=null) ? "VIDEO" :
        		"");
        args.putInt(ARG_PAGE, pageNumber);
        
        fragment.setArguments(args);
        return fragment;
    }

    public ScreenSlideProjectMediaFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNumber = getArguments().getInt(ARG_PAGE);
        mMedia = getArguments().getString(MEDIA);
        mMediaType = getArguments().getString(MEDIA_TYPE);
    }

    @Override    
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout containing a title and body text.
        ViewGroup rootView = (ViewGroup) inflater
                .inflate(R.layout.fragment_screen_slide_media, container, false);
        
        if(mMediaType=="PICTURE")
        {
        	//System.out.print("MediaType: PICTURE");
        	((TextView) rootView.findViewById(R.id.text)).setVisibility(View.GONE);
        	((VideoView) rootView.findViewById(R.id.video)).setVisibility(View.GONE);
        	((ImageView) rootView.findViewById(R.id.picture)).setImageResource(R.drawable.ic_launcher);
        }
        else if(mMediaType=="VIDEO")
        {
        	//System.out.print("MediaType: VIDEO");
        	((TextView) rootView.findViewById(R.id.text)).setVisibility(View.GONE);
        	((ImageView) rootView.findViewById(R.id.picture)).setVisibility(View.GONE);
        	//((VideoView) rootView.findViewById(R.id.video))
        }
        else
        {
        	//System.out.print("MediaType: NONE");
        	((ImageView) rootView.findViewById(R.id.picture)).setVisibility(View.GONE);
        	((VideoView) rootView.findViewById(R.id.video)).setVisibility(View.GONE);
        }

        return rootView;
    }

    /**
     * Returns the page number represented by this fragment object.
     */
    public int getPageNumber() {
        return mPageNumber;
    }
}