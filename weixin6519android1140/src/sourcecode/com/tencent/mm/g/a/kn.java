package com.tencent.mm.g.a;

import android.content.Context;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.b.b;

public final class kn
  extends b
{
  public a eOO;
  public b eOP;
  
  public kn()
  {
    this((byte)0);
    GMTrace.i(4297651650560L, 32020);
    GMTrace.o(4297651650560L, 32020);
  }
  
  private kn(byte paramByte)
  {
    GMTrace.i(4297785868288L, 32021);
    this.eOO = new a();
    this.eOP = new b();
    this.vhd = false;
    this.eDO = null;
    GMTrace.o(4297785868288L, 32021);
  }
  
  public static final class a
  {
    public Context context;
    public int eIv;
    public int eIw;
    public String eOG;
    public Bundle eOJ;
    public int eOK;
    public String eOQ;
    public String eOR;
    public long eOS;
    public int type;
    
    public a()
    {
      GMTrace.i(4188801073152L, 31209);
      this.type = 0;
      this.eIv = 0;
      this.eIw = 0;
      this.eOS = 0L;
      this.eOK = 0;
      GMTrace.o(4188801073152L, 31209);
    }
  }
  
  public static final class b
  {
    public int ret;
    
    public b()
    {
      GMTrace.i(4302751924224L, 32058);
      this.ret = 0;
      GMTrace.o(4302751924224L, 32058);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\a\kn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */