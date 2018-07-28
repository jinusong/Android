package com.example.dsm2018.masterdetailflow;

import android.app.Activity;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.dsm2018.masterdetailflow.dummy.DummyContent;

public class WebsiteDetailFragment extends Fragment {
    public static final String ARG_ITEM_ID = "item_id";

    private DummyContent.DummyItem mItem;

    public WebsiteDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.website_name);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.website_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (mItem != null) {
            ((WebView) rootView.findViewById(R.id.website_detail))
                    .loadUrl(mItem.website_url);
            WebView webView = (WebView)
                    rootView.findViewById(R.id.website_detail);
            webView.setWebViewClient(new WebViewClient(){
                @Override
                public boolean shouldOverrideUrlLoading(
                        WebView view, WebResourceRequest request) {
                        return super.shouldOverrideUrlLoading(view, request);
                }
            });
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl(mItem.website_url);
        }
        return rootView;
    }
}
