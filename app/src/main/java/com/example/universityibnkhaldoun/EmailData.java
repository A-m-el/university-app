package com.example.universityibnkhaldoun;

public class EmailData {

        private String mNameProf;
        private String mEmailProf;

    public EmailData(String NameProf, String EmailProf) {
        mNameProf  = NameProf;
        mEmailProf = EmailProf;
    }
    public String getnameProf(){
        return mNameProf;
    }
    public String getemailProf(){
        return mEmailProf;
    }

}

