package com.tencent.mm.ui.g.a;

import com.tencent.gmtrace.GMTrace;

public final class d
  extends Throwable
{
  public int mErrorCode;
  public String xbb;
  
  public d(String paramString)
  {
    super(paramString);
    GMTrace.i(2910511431680L, 21685);
    this.mErrorCode = 0;
    GMTrace.o(2910511431680L, 21685);
  }
  
  public d(String paramString1, String paramString2, int paramInt)
  {
    super(paramString1);
    GMTrace.i(2910645649408L, 21686);
    this.mErrorCode = 0;
    this.xbb = paramString2;
    this.mErrorCode = paramInt;
    GMTrace.o(2910645649408L, 21686);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\g\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */