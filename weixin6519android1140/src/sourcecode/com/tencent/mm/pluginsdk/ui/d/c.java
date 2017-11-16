package com.tencent.mm.pluginsdk.ui.d;

import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import java.util.List;

public abstract interface c
{
  public abstract void a(Context paramContext, String paramString, DialogInterface.OnDismissListener paramOnDismissListener, Bundle paramBundle);
  
  public abstract void a(Context paramContext, List<String> paramList, DialogInterface.OnDismissListener paramOnDismissListener);
  
  public static final class a
  {
    public static c tDL;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */