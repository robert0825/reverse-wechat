package com.tencent.mm.pluginsdk.ui.d;

import android.content.Context;
import android.text.SpannableString;
import com.tencent.gmtrace.GMTrace;

public abstract interface d
{
  public abstract SpannableString b(Context paramContext, CharSequence paramCharSequence, int paramInt);
  
  public abstract boolean w(CharSequence paramCharSequence);
  
  public abstract boolean x(CharSequence paramCharSequence);
  
  public static final class a
  {
    protected static d tDM;
    
    public static final void a(d paramd)
    {
      GMTrace.i(18727533805568L, 139531);
      tDM = paramd;
      GMTrace.o(18727533805568L, 139531);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\d\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */