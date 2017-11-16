package com.tencent.d.b.a;

import com.tencent.d.a.c.f;

public abstract class e<T>
  extends com.tencent.d.a.c.e
{
  public T yar = null;
  
  e()
  {
    super(-1);
  }
  
  protected e(int paramInt)
  {
    this(paramInt, "", null);
  }
  
  protected e(int paramInt, T paramT)
  {
    this(0, "", paramT);
  }
  
  protected e(int paramInt, String paramString)
  {
    this(paramInt, paramString, null);
  }
  
  protected e(int paramInt, String paramString, T paramT)
  {
    super(paramInt, paramString);
    switch (paramInt)
    {
    }
    for (;;)
    {
      if (!f.nm(paramString)) {
        this.eAR = paramString;
      }
      this.yar = paramT;
      return;
      this.eAR = "get support soter failed remotely";
      continue;
      this.eAR = "upload app secure key";
      continue;
      this.eAR = "upload auth key failed";
      continue;
      this.eAR = "not initialized yet. please make sure you've already called SoterWrapperApi.init(...) and call backed";
      continue;
      this.eAR = "context instance already released. should not happen normally, you can try to call again";
      continue;
      this.eAR = "there must be at least 1 fingerprint enrolled in system to complete this process. please check it previously";
      continue;
      this.eAR = "get challenge failed";
      continue;
      this.eAR = "upload or verify signature in server side failed";
    }
  }
  
  public String toString()
  {
    if (this.yar == null) {
      return super.toString();
    }
    return String.format("total: %s, extData: %s", new Object[] { super.toString(), this.yar.toString() });
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\d\b\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */