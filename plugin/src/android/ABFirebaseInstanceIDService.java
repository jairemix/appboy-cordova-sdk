package com.appboy.cordova;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by jeremy on 16/03/2017.
 */
public class ABFirebaseInstanceIDService extends FirebaseInstanceIdService {
  public static final String Tag = "Appboy";
  @Override
  /**
   * Called if InstanceID token is updated. This may occur if the security of
   * the previous token had been compromised.
   * Note that this is called when the InstanceID token is initially generated
   * (e.g. when app is first installed)
   * so a check might be necessary to verify if the user has allowed the push
   */
  public void onTokenRefresh () {
    Log.v("Jerem", "token just refreshed");
    try {
      AppboyPlugin.getInstance().refreshFBToken();
    }
    catch (Exception ex) {
      Log.e("Jerem", "exception caught: " + ex.getMessage());
    }
  }
}
