package com.tencent.mm.sdk.platformtools;

import com.tencent.gmtrace.GMTrace;

public class ay<T>
{
  public Object[] vv;
  public int vw;
  
  public ay(int paramInt)
  {
    GMTrace.i(13924820844544L, 103748);
    if (paramInt <= 0)
    {
      w.e("MicroMsg.SimpleObjectPool", "The max pool size must be > 0");
      GMTrace.o(13924820844544L, 103748);
      return;
    }
    this.vv = new Object[paramInt];
    GMTrace.o(13924820844544L, 103748);
  }
  
  public T bE()
  {
    GMTrace.i(13924955062272L, 103749);
    if (this.vv == null)
    {
      GMTrace.o(13924955062272L, 103749);
      return null;
    }
    if (this.vw > 0)
    {
      int i = this.vw - 1;
      Object localObject = this.vv[i];
      this.vv[i] = null;
      this.vw -= 1;
      GMTrace.o(13924955062272L, 103749);
      return (T)localObject;
    }
    GMTrace.o(13924955062272L, 103749);
    return null;
  }
  
  public boolean i(T paramT)
  {
    GMTrace.i(13925089280000L, 103750);
    if (this.vv == null)
    {
      GMTrace.o(13925089280000L, 103750);
      return false;
    }
    if (this.vv != null)
    {
      i = 0;
      if (i < this.vw) {
        if (this.vv[i] != paramT) {}
      }
    }
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        break label80;
      }
      GMTrace.o(13925089280000L, 103750);
      return false;
      i += 1;
      break;
    }
    label80:
    if ((this.vw < this.vv.length) && (this.vw >= 0))
    {
      this.vv[this.vw] = paramT;
      this.vw += 1;
      GMTrace.o(13925089280000L, 103750);
      return true;
    }
    w.e("MicroMsg.SimpleObjectPool", "error index %d %d", new Object[] { Integer.valueOf(this.vw), Integer.valueOf(this.vv.length) });
    GMTrace.o(13925089280000L, 103750);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */