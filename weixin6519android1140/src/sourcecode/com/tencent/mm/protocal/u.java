package com.tencent.mm.protocal;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.aev;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.sdk.platformtools.bg;

public final class u
{
  public static final class a
    extends k.d
    implements k.b
  {
    public aev tKQ;
    
    public a()
    {
      GMTrace.i(4059549401088L, 30246);
      this.tKQ = new aev();
      GMTrace.o(4059549401088L, 30246);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(4059683618816L, 30247);
      this.tKq = ac.bOq();
      this.tKQ.tUK = new azp().be(bg.bQN());
      this.tKQ.uNh = k.a(this);
      byte[] arrayOfByte = this.tKQ.toByteArray();
      GMTrace.o(4059683618816L, 30247);
      return arrayOfByte;
    }
    
    public final int Bb()
    {
      GMTrace.i(4059817836544L, 30248);
      GMTrace.o(4059817836544L, 30248);
      return 107;
    }
    
    public final int getCmdId()
    {
      GMTrace.i(4059952054272L, 30249);
      GMTrace.o(4059952054272L, 30249);
      return 48;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */