package com.google.android.gms.tagmanager;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

public class PreviewActivity
  extends Activity
{
  public void onCreate(Bundle paramBundle)
  {
    try
    {
      super.onCreate(paramBundle);
      m.mr();
      paramBundle = getIntent().getData();
      if (!d.O(this).d(paramBundle))
      {
        paramBundle = "Cannot preview the app with the uri: " + paramBundle + ". Launching current version instead.";
        m.mq();
        AlertDialog localAlertDialog = new AlertDialog.Builder(this).create();
        localAlertDialog.setTitle("Preview failure");
        localAlertDialog.setMessage(paramBundle);
        localAlertDialog.setButton(-1, "Continue", new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
        });
        localAlertDialog.show();
      }
      paramBundle = getPackageManager().getLaunchIntentForPackage(getPackageName());
      if (paramBundle != null)
      {
        new StringBuilder("Invoke the launch activity for package name: ").append(getPackageName());
        m.mr();
        startActivity(paramBundle);
        return;
      }
      new StringBuilder("No launch activity found for package name: ").append(getPackageName());
      m.mr();
      return;
    }
    catch (Exception paramBundle)
    {
      new StringBuilder("Calling preview threw an exception: ").append(paramBundle.getMessage());
      m.mo();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\tagmanager\PreviewActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */