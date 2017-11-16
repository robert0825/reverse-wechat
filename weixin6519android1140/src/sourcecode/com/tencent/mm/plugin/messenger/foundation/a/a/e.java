package com.tencent.mm.plugin.messenger.foundation.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.a;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public abstract interface e
{
  public static final class a
    extends e.b
  {
    private int cmdId;
    
    public a(int paramInt, a parama)
    {
      super();
      GMTrace.i(13369025232896L, 99607);
      this.cmdId = paramInt;
      this.mVj = parama;
      GMTrace.o(13369025232896L, 99607);
    }
    
    public final int getCmdId()
    {
      GMTrace.i(13369159450624L, 99608);
      int i = this.cmdId;
      GMTrace.o(13369159450624L, 99608);
      return i;
    }
  }
  
  public static class b
  {
    public byte[] buffer;
    public int cmdId;
    public int eQl;
    public long gFw;
    public int id;
    public int mVf;
    public long mVg;
    public String mVh;
    public String mVi;
    public a mVj;
    
    public b(int paramInt)
    {
      GMTrace.i(13368622579712L, 99604);
      this.eQl = -1;
      this.cmdId = paramInt;
      GMTrace.o(13368622579712L, 99604);
    }
    
    public final byte[] getBuffer()
    {
      GMTrace.i(13368891015168L, 99606);
      if ((this.buffer == null) && (this.mVj != null)) {}
      try
      {
        this.buffer = this.mVj.toByteArray();
        byte[] arrayOfByte = this.buffer;
        GMTrace.o(13368891015168L, 99606);
        return arrayOfByte;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          w.e("MicroMsg.OpLog.Operation", "summeroplog Operation toByteArray err: " + localIOException.getMessage());
        }
      }
    }
    
    public int getCmdId()
    {
      GMTrace.i(13368756797440L, 99605);
      int i = this.cmdId;
      GMTrace.o(13368756797440L, 99605);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\messenger\foundation\a\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */