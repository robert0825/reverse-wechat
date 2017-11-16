package com.tencent.mm.g.a;

import android.graphics.Rect;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.facedetect.model.p;
import com.tencent.mm.sdk.b.b;

public final class nf
  extends b
{
  public a eSm;
  
  public nf()
  {
    this((byte)0);
    GMTrace.i(20770193408000L, 154750);
    GMTrace.o(20770193408000L, 154750);
  }
  
  private nf(byte paramByte)
  {
    GMTrace.i(20770327625728L, 154751);
    this.eSm = new a();
    this.vhd = false;
    this.eDO = null;
    GMTrace.o(20770327625728L, 154751);
  }
  
  public static final class a
  {
    public byte[] eSn;
    public Rect eSo;
    public int eSp;
    public p eSq;
    public int height;
    public int width;
    
    public a()
    {
      GMTrace.i(20770461843456L, 154752);
      this.width = -1;
      this.height = -1;
      this.eSp = 90;
      GMTrace.o(20770461843456L, 154752);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\a\nf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */