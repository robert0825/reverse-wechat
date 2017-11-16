package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.Fragment;

public final class i
  implements DialogInterface.OnClickListener
{
  private final Intent Jt;
  private final Fragment akP;
  private final int akQ;
  private final Activity mActivity;
  
  public i(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    this.mActivity = paramActivity;
    this.akP = null;
    this.Jt = paramIntent;
    this.akQ = 2;
  }
  
  public i(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    this.mActivity = null;
    this.akP = paramFragment;
    this.Jt = paramIntent;
    this.akQ = 2;
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      if ((this.Jt != null) && (this.akP != null)) {
        this.akP.startActivityForResult(this.Jt, this.akQ);
      }
      for (;;)
      {
        paramDialogInterface.dismiss();
        return;
        if (this.Jt != null) {
          this.mActivity.startActivityForResult(this.Jt, this.akQ);
        }
      }
      return;
    }
    catch (ActivityNotFoundException paramDialogInterface) {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\internal\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */