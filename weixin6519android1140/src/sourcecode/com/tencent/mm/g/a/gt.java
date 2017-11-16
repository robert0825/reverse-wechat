package com.tencent.mm.g.a;

import android.content.Context;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.b.b;

public final class gt
  extends b
{
  public a eJT;
  public b eJU;
  
  public gt()
  {
    this((byte)0);
    GMTrace.i(4180345356288L, 31146);
    GMTrace.o(4180345356288L, 31146);
  }
  
  private gt(byte paramByte)
  {
    GMTrace.i(4180479574016L, 31147);
    this.eJT = new a();
    this.eJU = new b();
    this.vhd = false;
    this.eDO = null;
    GMTrace.o(4180479574016L, 31147);
  }
  
  public static final class a
  {
    public int actionCode;
    public Context context;
    public Bundle eJV;
    public String result;
    public String username;
    
    public a()
    {
      GMTrace.i(4293625118720L, 31990);
      GMTrace.o(4293625118720L, 31990);
    }
  }
  
  public static final class b
  {
    public int ret;
    
    public b()
    {
      GMTrace.i(4298993827840L, 32030);
      this.ret = 0;
      GMTrace.o(4298993827840L, 32030);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\a\gt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */