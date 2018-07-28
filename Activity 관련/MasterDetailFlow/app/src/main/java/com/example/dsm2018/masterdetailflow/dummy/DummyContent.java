package com.example.dsm2018.masterdetailflow.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DummyContent {
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        addItem(new DummyItem("1", "eBookFrenzy",
                "http://www.ebookfrenzy.com"));
        addItem(new DummyItem("2", "Amazon",
                "http://www.amazon.com"));
        addItem(new DummyItem("3", "New York Times",
                "http://www.nytimes.com"));

    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    public static class DummyItem {
        public final String id;
        public final String website_name;
        public final String website_url;

        public DummyItem(String id, String website_name, String website_url) {
            this.id = id;
            this.website_name = website_name;
            this.website_url = website_url;
        }

        @Override
        public String toString() {
            return website_name;
        }
    }
}
