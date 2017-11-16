package com.tencent.mm.kernel;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.b.e;

public final class d<_Profile extends e>
{
  private _Profile fYK;
  
  public d(_Profile param_Profile)
  {
    GMTrace.i(13533710385152L, 100834);
    this.fYK = param_Profile;
    GMTrace.o(13533710385152L, 100834);
  }
  
  public final _Profile wZ()
  {
    try
    {
      GMTrace.i(13533844602880L, 100835);
      e locale = this.fYK;
      GMTrace.o(13533844602880L, 100835);
      return locale;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\kernel\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */