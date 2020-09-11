package com.aou.findit.ui.registration;

import android.content.Context;

public class RegistrationViewModel  {
    private RegistrationView registrationView;
    private Context context;
    public RegistrationViewModel(RegistrationView registrationView, Context context) {
        this.context=context;
        this.registrationView=registrationView;
    }
}