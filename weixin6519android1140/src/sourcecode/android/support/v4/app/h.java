package android.support.v4.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

public class h
  extends Fragment
  implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener
{
  int nV = 0;
  int nW = 0;
  boolean nX = true;
  public boolean nY = true;
  int nZ = -1;
  Dialog oa;
  boolean ob;
  boolean oc;
  boolean od;
  
  public void a(l paraml, String paramString)
  {
    this.oc = false;
    this.od = true;
    paraml = paraml.aV();
    paraml.a(this, paramString);
    paraml.commit();
  }
  
  public Dialog aF()
  {
    return new Dialog(aG(), this.nW);
  }
  
  public final LayoutInflater c(Bundle paramBundle)
  {
    if (!this.nY) {
      return super.c(paramBundle);
    }
    this.oa = aF();
    if (this.oa != null)
    {
      paramBundle = this.oa;
      switch (this.nV)
      {
      }
      for (;;)
      {
        return (LayoutInflater)this.oa.getContext().getSystemService("layout_inflater");
        paramBundle.getWindow().addFlags(24);
        paramBundle.requestWindowFeature(1);
      }
    }
    return (LayoutInflater)this.oy.mContext.getSystemService("layout_inflater");
  }
  
  public final void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    if (!this.nY) {}
    do
    {
      do
      {
        return;
        View localView = this.mView;
        if (localView != null)
        {
          if (localView.getParent() != null) {
            throw new IllegalStateException("DialogFragment can not be attached to a container view");
          }
          this.oa.setContentView(localView);
        }
        this.oa.setOwnerActivity(aG());
        this.oa.setCancelable(this.nX);
        this.oa.setOnCancelListener(this);
        this.oa.setOnDismissListener(this);
      } while (paramBundle == null);
      paramBundle = paramBundle.getBundle("android:savedDialogState");
    } while (paramBundle == null);
    this.oa.onRestoreInstanceState(paramBundle);
  }
  
  public final void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    if (!this.od) {
      this.oc = false;
    }
  }
  
  public void onCancel(DialogInterface paramDialogInterface) {}
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (this.oC == 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.nY = bool;
      if (paramBundle != null)
      {
        this.nV = paramBundle.getInt("android:style", 0);
        this.nW = paramBundle.getInt("android:theme", 0);
        this.nX = paramBundle.getBoolean("android:cancelable", true);
        this.nY = paramBundle.getBoolean("android:showsDialog", this.nY);
        this.nZ = paramBundle.getInt("android:backStackId", -1);
      }
      return;
    }
  }
  
  public final void onDestroyView()
  {
    super.onDestroyView();
    if (this.oa != null)
    {
      this.ob = true;
      this.oa.dismiss();
      this.oa = null;
    }
  }
  
  public final void onDetach()
  {
    super.onDetach();
    if ((!this.od) && (!this.oc)) {
      this.oc = true;
    }
  }
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    if ((!this.ob) && (!this.oc))
    {
      this.oc = true;
      this.od = false;
      if (this.oa != null)
      {
        this.oa.dismiss();
        this.oa = null;
      }
      this.ob = true;
      if (this.nZ >= 0)
      {
        this.ox.F(this.nZ);
        this.nZ = -1;
      }
    }
    else
    {
      return;
    }
    paramDialogInterface = this.ox.aV();
    paramDialogInterface.a(this);
    paramDialogInterface.commitAllowingStateLoss();
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (this.oa != null)
    {
      Bundle localBundle = this.oa.onSaveInstanceState();
      if (localBundle != null) {
        paramBundle.putBundle("android:savedDialogState", localBundle);
      }
    }
    if (this.nV != 0) {
      paramBundle.putInt("android:style", this.nV);
    }
    if (this.nW != 0) {
      paramBundle.putInt("android:theme", this.nW);
    }
    if (!this.nX) {
      paramBundle.putBoolean("android:cancelable", this.nX);
    }
    if (!this.nY) {
      paramBundle.putBoolean("android:showsDialog", this.nY);
    }
    if (this.nZ != -1) {
      paramBundle.putInt("android:backStackId", this.nZ);
    }
  }
  
  public final void onStart()
  {
    super.onStart();
    if (this.oa != null)
    {
      this.ob = false;
      this.oa.show();
    }
  }
  
  public final void onStop()
  {
    super.onStop();
    if (this.oa != null) {
      this.oa.hide();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\app\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */