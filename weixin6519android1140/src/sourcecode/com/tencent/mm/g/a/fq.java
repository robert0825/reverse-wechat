package com.tencent.mm.g.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.sdk.b.b;

public final class fq
  extends b
{
  public a eIa;
  public b eIb;
  
  public fq()
  {
    this((byte)0);
    GMTrace.i(4196854136832L, 31269);
    GMTrace.o(4196854136832L, 31269);
  }
  
  private fq(byte paramByte)
  {
    GMTrace.i(4196988354560L, 31270);
    this.eIa = new a();
    this.eIb = new b();
    this.vhd = false;
    this.eDO = null;
    GMTrace.o(4196988354560L, 31270);
  }
  
  public static final class a
  {
    public Context context;
    public long eDp;
    public th eIc;
    public ImageView eId;
    public int eIe;
    public boolean eIf;
    public boolean eIg;
    public boolean eIh;
    public int height;
    public int maxWidth;
    public int opType;
    public int width;
    
    public a()
    {
      GMTrace.i(4310133899264L, 32113);
      this.opType = -1;
      this.eIf = false;
      this.eIg = false;
      this.eIh = true;
      GMTrace.o(4310133899264L, 32113);
    }
  }
  
  public static final class b
  {
    public Bitmap eIi;
    public int ret;
    
    public b()
    {
      GMTrace.i(4295772602368L, 32006);
      this.ret = -1;
      GMTrace.o(4295772602368L, 32006);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\a\fq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */