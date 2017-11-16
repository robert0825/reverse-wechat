package com.tencent.mm.bt;

import android.content.Context;
import android.text.SpannableString;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.ui.d.d;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.bg;

public final class g
  implements d
{
  private static g vod;
  private int voc;
  
  private g()
  {
    GMTrace.i(4517097635840L, 33655);
    this.voc = 300;
    GMTrace.o(4517097635840L, 33655);
  }
  
  public static g bRE()
  {
    GMTrace.i(4517231853568L, 33656);
    if (vod == null) {
      vod = new g();
    }
    g localg = vod;
    GMTrace.o(4517231853568L, 33656);
    return localg;
  }
  
  public final SpannableString a(Context paramContext, CharSequence paramCharSequence, float paramFloat)
  {
    GMTrace.i(4517500289024L, 33658);
    if ((paramCharSequence == null) || (bg.nm(paramCharSequence.toString())))
    {
      paramContext = new SpannableString("");
      GMTrace.o(4517500289024L, 33658);
      return paramContext;
    }
    paramContext = b(paramContext, paramCharSequence, (int)paramFloat);
    GMTrace.o(4517500289024L, 33658);
    return paramContext;
  }
  
  public final SpannableString b(Context paramContext, CharSequence paramCharSequence, int paramInt)
  {
    GMTrace.i(4517366071296L, 33657);
    if ((paramCharSequence == null) || (bg.nm(paramCharSequence.toString())))
    {
      paramContext = new SpannableString("");
      GMTrace.o(4517366071296L, 33657);
      return paramContext;
    }
    if ((paramCharSequence == null) || (bg.nm(paramCharSequence.toString())))
    {
      paramContext = new SpannableString("");
      GMTrace.o(4517366071296L, 33657);
      return paramContext;
    }
    if ((paramCharSequence instanceof SpannableString)) {}
    for (paramContext = (SpannableString)paramCharSequence;; paramContext = new SpannableString(paramCharSequence))
    {
      paramCharSequence = new PInt();
      paramCharSequence.value = this.voc;
      paramContext = b.bRv().a(paramContext, paramInt, paramCharSequence);
      paramContext = f.bRB().a(paramContext, paramInt, paramCharSequence.value);
      GMTrace.o(4517366071296L, 33657);
      return paramContext;
    }
  }
  
  public final boolean w(CharSequence paramCharSequence)
  {
    GMTrace.i(18616267309056L, 138702);
    b.bRv();
    boolean bool = b.SY(paramCharSequence.toString());
    GMTrace.o(18616267309056L, 138702);
    return bool;
  }
  
  public final boolean x(CharSequence paramCharSequence)
  {
    GMTrace.i(18616133091328L, 138701);
    if (f.bRB().Ta(paramCharSequence.toString()) != null)
    {
      GMTrace.o(18616133091328L, 138701);
      return true;
    }
    GMTrace.o(18616133091328L, 138701);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bt\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */