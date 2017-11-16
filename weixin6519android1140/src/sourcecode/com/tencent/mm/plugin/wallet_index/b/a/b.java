package com.tencent.mm.plugin.wallet_index.b.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
{
  public String mMessage;
  public int mgK;
  public int rrT;
  
  private b(int paramInt, String paramString)
  {
    GMTrace.i(7590146736128L, 56551);
    this.rrT = 0;
    this.mgK = paramInt;
    this.mMessage = paramString;
    GMTrace.o(7590146736128L, 56551);
  }
  
  public static b az(int paramInt, String paramString)
  {
    int i = -1;
    GMTrace.i(7590415171584L, 56553);
    switch (paramInt)
    {
    default: 
      paramInt = a.i.tif;
    }
    for (;;)
    {
      paramString = new b(i, ab.getContext().getString(paramInt));
      GMTrace.o(7590415171584L, 56553);
      return paramString;
      i = 0;
      paramInt = a.i.tie;
      continue;
      i = 100000000;
      paramInt = a.i.tig;
      continue;
      i = 103;
      paramInt = a.i.tic;
      continue;
      paramString = new b(-1, paramString);
      GMTrace.o(7590415171584L, 56553);
      return paramString;
      i = 109;
      paramInt = a.i.tih;
      continue;
      i = 110;
      paramInt = a.i.tij;
      continue;
      i = 111;
      paramInt = a.i.tik;
      continue;
      i = 112;
      paramInt = a.i.tii;
      continue;
      i = 113;
      paramInt = a.i.tif;
    }
  }
  
  public static b xa(int paramInt)
  {
    int j = -1;
    GMTrace.i(7590280953856L, 56552);
    int i;
    switch (paramInt)
    {
    default: 
      i = a.i.sTD;
    }
    for (;;)
    {
      b localb = new b(j, ab.getContext().getString(i));
      localb.rrT = paramInt;
      GMTrace.o(7590280953856L, 56552);
      return localb;
      j = 0;
      i = a.i.sTC;
      continue;
      j = 100000000;
      i = a.i.sTE;
      continue;
      i = a.i.sTw;
      continue;
      i = a.i.sTB;
      continue;
      j = 103;
      i = a.i.sTz;
      continue;
      i = a.i.sTA;
      continue;
      j = 100000009;
      i = a.i.sTD;
      continue;
      i = a.i.sTv;
      continue;
      j = 100000004;
      i = a.i.sTx;
      continue;
      j = 1000000093;
      i = a.i.sTy;
    }
  }
  
  public final boolean bAf()
  {
    GMTrace.i(7590549389312L, 56554);
    if ((this.mgK == 7) || (this.mgK == 103))
    {
      GMTrace.o(7590549389312L, 56554);
      return true;
    }
    GMTrace.o(7590549389312L, 56554);
    return false;
  }
  
  public final boolean isFailure()
  {
    GMTrace.i(7590683607040L, 56555);
    if (this.mgK == 0) {}
    for (int i = 1; (i == 0) && (!bAf()); i = 0)
    {
      GMTrace.o(7590683607040L, 56555);
      return true;
    }
    GMTrace.o(7590683607040L, 56555);
    return false;
  }
  
  public final String toString()
  {
    GMTrace.i(7590817824768L, 56556);
    String str = "IabResult: " + this.mMessage;
    GMTrace.o(7590817824768L, 56556);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_index\b\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */