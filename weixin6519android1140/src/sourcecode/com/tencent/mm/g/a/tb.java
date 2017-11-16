package com.tencent.mm.g.a;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.b.b;

public final class tb
  extends b
{
  public a eYv;
  public b eYw;
  
  public tb()
  {
    this((byte)0);
    GMTrace.i(4380463988736L, 32637);
    GMTrace.o(4380463988736L, 32637);
  }
  
  private tb(byte paramByte)
  {
    GMTrace.i(4380598206464L, 32638);
    this.eYv = new a();
    this.eYw = new b();
    this.vhd = false;
    this.eDO = null;
    GMTrace.o(4380598206464L, 32638);
  }
  
  public static final class a
  {
    public Context context;
    public int eGs;
    public String eYx;
    public Uri uri;
    
    public a()
    {
      GMTrace.i(4284364095488L, 31921);
      this.eGs = 0;
      GMTrace.o(4284364095488L, 31921);
    }
  }
  
  public static final class b
  {
    public Cursor eGt;
    
    public b()
    {
      GMTrace.i(4238058979328L, 31576);
      GMTrace.o(4238058979328L, 31576);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\a\tb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */