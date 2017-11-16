package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.google.android.gms.common.internal.w;

public final class a
  extends DialogFragment
{
  private DialogInterface.OnCancelListener agB = null;
  private Dialog oa = null;
  
  public static a a(Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    a locala = new a();
    paramDialog = (Dialog)w.j(paramDialog, "Cannot display null dialog");
    paramDialog.setOnCancelListener(null);
    paramDialog.setOnDismissListener(null);
    locala.oa = paramDialog;
    if (paramOnCancelListener != null) {
      locala.agB = paramOnCancelListener;
    }
    return locala;
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.agB != null) {
      this.agB.onCancel(paramDialogInterface);
    }
  }
  
  public final Dialog onCreateDialog(Bundle paramBundle)
  {
    if (this.oa == null) {
      setShowsDialog(false);
    }
    return this.oa;
  }
  
  public final void show(FragmentManager paramFragmentManager, String paramString)
  {
    super.show(paramFragmentManager, paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */