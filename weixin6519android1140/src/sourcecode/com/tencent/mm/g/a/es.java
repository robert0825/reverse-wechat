package com.tencent.mm.g.a;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.b.b;

public final class es
  extends b
{
  public a eGq;
  public b eGr;
  
  public es()
  {
    this((byte)0);
    GMTrace.i(4213094481920L, 31390);
    GMTrace.o(4213094481920L, 31390);
  }
  
  private es(byte paramByte)
  {
    GMTrace.i(4213228699648L, 31391);
    this.eGq = new a();
    this.eGr = new b();
    this.vhd = false;
    this.eDO = null;
    GMTrace.o(4213228699648L, 31391);
  }
  
  public static final class a
  {
    public Context context;
    public String[] eAc;
    public int eGs;
    public String[] selectionArgs;
    public Uri uri;
    
    public a()
    {
      GMTrace.i(4276176814080L, 31860);
      this.eGs = 0;
      GMTrace.o(4276176814080L, 31860);
    }
  }
  
  public static final class b
  {
    public Cursor eGt;
    
    public b()
    {
      GMTrace.i(4258057420800L, 31725);
      GMTrace.o(4258057420800L, 31725);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\g\a\es.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */