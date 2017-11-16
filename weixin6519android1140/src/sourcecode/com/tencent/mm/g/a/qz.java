package com.tencent.mm.g.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.b.b;

public final class qz
  extends b
{
  public a eVN;
  public b eVO;
  
  public qz()
  {
    this((byte)0);
    GMTrace.i(4375497932800L, 32600);
    GMTrace.o(4375497932800L, 32600);
  }
  
  private qz(byte paramByte)
  {
    GMTrace.i(4375632150528L, 32601);
    this.eVN = new a();
    this.eVO = new b();
    this.vhd = false;
    this.eDO = null;
    GMTrace.o(4375632150528L, 32601);
  }
  
  public static final class a
  {
    public Context context;
    public String eVP;
    public int opType;
    
    public a()
    {
      GMTrace.i(4376840110080L, 32610);
      this.opType = 0;
      GMTrace.o(4376840110080L, 32610);
    }
  }
  
  public static final class b
  {
    public boolean eDb;
    public String eIy;
    public String eQi;
    
    public b()
    {
      GMTrace.i(4379256029184L, 32628);
      this.eDb = false;
      GMTrace.o(4379256029184L, 32628);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\a\qz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */