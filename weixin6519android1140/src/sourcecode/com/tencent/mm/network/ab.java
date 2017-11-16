package com.tencent.mm.network;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.a.b;
import com.tencent.mm.sdk.platformtools.am;

public final class ab
{
  public b hhK;
  public boolean hhL;
  
  public ab()
  {
    GMTrace.i(13676920700928L, 101901);
    this.hhK = null;
    this.hhL = false;
    GMTrace.o(13676920700928L, 101901);
  }
  
  public static boolean bv(Context paramContext)
  {
    GMTrace.i(13677054918656L, 101902);
    if ((paramContext != null) && (am.isWifi(paramContext)))
    {
      GMTrace.o(13677054918656L, 101902);
      return true;
    }
    GMTrace.o(13677054918656L, 101902);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\network\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */