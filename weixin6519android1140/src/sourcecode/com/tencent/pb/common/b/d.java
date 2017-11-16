package com.tencent.pb.common.b;

import android.os.Handler;
import android.os.Looper;
import com.google.a.a.e;
import com.tencent.pb.common.c.g;

public abstract class d
  implements c
{
  private final long guK = 60000L;
  Runnable guP = new Runnable()
  {
    public final void run()
    {
      d.this.jos = true;
      com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { "NETTASK_RECV TimeOut cmd= ", d.this.cmB() });
      g.y(20006, 3, "-1104");
      if (d.this.xKs != null) {
        d.this.xKs.a(2, -1, "time exceed, force to callback", d.this);
      }
    }
  };
  public boolean jos = false;
  public int lIE = 2;
  private int mErrorCode = 64537;
  Handler mHandler = new Handler(Looper.getMainLooper());
  public boolean xKq = false;
  public final String xKr = getClass().getSimpleName();
  public b xKs = null;
  public byte[] xKt = null;
  public Object xKu = null;
  public int xKv;
  public int xKw = 0;
  
  public abstract Object bw(byte[] paramArrayOfByte);
  
  public final void c(int paramInt, e parame)
  {
    this.xKv = paramInt;
    Object localObject = null;
    try
    {
      parame = e.b(parame);
      this.xKt = parame;
      return;
    }
    catch (Exception parame)
    {
      for (;;)
      {
        parame = (e)localObject;
      }
    }
  }
  
  public abstract String cmB();
  
  public abstract int getType();
  
  public final void o(final int paramInt, byte[] paramArrayOfByte)
  {
    final int i = 2;
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.xKr, "onResp errcode", Integer.valueOf(paramInt) });
    this.mHandler.removeCallbacks(this.guP);
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { "NETTASK_RECV onResp:cmd= ", cmB(), Integer.valueOf(paramInt), Boolean.valueOf(this.jos) });
    if (paramInt != 0)
    {
      com.tencent.pb.common.c.c.k("MicroMsg.Voip", new Object[] { this.xKr, "getNetworkErrType errcode:" + paramInt });
      if (paramInt == -1) {
        if (h.isNetworkConnected()) {
          i = 1;
        }
      }
    }
    for (;;)
    {
      if (this.jos)
      {
        com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { "onResp netscene already canceled, cmd:" + this.xKv });
        return;
        if (paramInt == 6801) {
          i = 10;
        } else {
          i = 4;
        }
      }
      else
      {
        if (this.xKq) {
          "".length();
        }
        this.mErrorCode = paramInt;
        this.xKu = bw(paramArrayOfByte);
        this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            if (d.this.jos) {
              com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { d.this.xKr, "onResp netscene already canceled, cmd:" + d.this.xKv });
            }
            while (d.this.xKs == null) {
              return;
            }
            d.this.xKs.a(i, paramInt, "", d.this);
          }
        });
        return;
        i = 0;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\pb\common\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */