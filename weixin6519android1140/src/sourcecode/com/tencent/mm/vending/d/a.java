package com.tencent.mm.vending.d;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;

public final class a
{
  Bundle mExtras;
  
  public a(Intent paramIntent)
  {
    GMTrace.i(275146342400L, 2050);
    this.mExtras = null;
    this.mExtras = paramIntent.getExtras();
    GMTrace.o(275146342400L, 2050);
  }
  
  public final int getIntExtra(String paramString, int paramInt)
  {
    GMTrace.i(275280560128L, 2051);
    if (this.mExtras == null)
    {
      GMTrace.o(275280560128L, 2051);
      return paramInt;
    }
    paramInt = this.mExtras.getInt(paramString, paramInt);
    GMTrace.o(275280560128L, 2051);
    return paramInt;
  }
  
  public final String getStringExtra(String paramString)
  {
    GMTrace.i(275414777856L, 2052);
    if (this.mExtras == null)
    {
      GMTrace.o(275414777856L, 2052);
      return null;
    }
    paramString = this.mExtras.getString(paramString);
    GMTrace.o(275414777856L, 2052);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\vending\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */