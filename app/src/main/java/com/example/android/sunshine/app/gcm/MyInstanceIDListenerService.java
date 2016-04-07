package com.example.android.sunshine.app.gcm;

import android.content.Intent;
import android.net.nsd.NsdManager;

import com.google.android.gms.iid.InstanceIDListenerService;

/**
 * Created by Etit-Ind1 on 08/04/2016.
 */
public class MyInstanceIDListenerService extends InstanceIDListenerService {
    private static final String TAG = "MyInstanceIDLS";

    @Override
    public void onTokenRefresh() {
        // Fetch  updated Instance ID token.
        Intent intent = new Intent(this, NsdManager.RegistrationListener.class);
        startService(intent);
    }
}
