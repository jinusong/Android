package com.example.dsm2018.secret;

public class ListViewItem {
        private String Namestr;
        private String Substr;

        public void setName(String name) {
            Namestr = name;
        }
        public void setSub(String sub) {
            Substr = sub;
        }

        public String getName() {
            return this.Namestr;
        }
        public String getSub() {
            return this.Substr;
        }
    }