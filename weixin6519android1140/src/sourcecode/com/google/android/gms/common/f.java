package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.support.v4.app.h;
import android.support.v4.app.l;
import com.google.android.gms.common.internal.w;

public final class f
  extends h
{
  private DialogInterface.OnCancelListener agB = null;
  private Dialog oa = null;
  
  public static f b(Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    f localf = new f();
    paramDialog = (Dialog)w.j(paramDialog, "Cannot display null dialog");
    paramDialog.setOnCancelListener(null);
    paramDialog.setOnDismissListener(null);
    localf.oa = paramDialog;
    if (paramOnCancelListener != null) {
      localf.agB = paramOnCancelListener;
    }
    return localf;
  }
  
  public final void a(l paraml, String paramString)
  {
    super.a(paraml, paramString);
  }
  
  public final Dialog aF()
  {
    if (this.oa == null) {
      this.nY = false;
    }
    return this.oa;
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.agB != null) {
      this.agB.onCancel(paramDialogInterface);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */