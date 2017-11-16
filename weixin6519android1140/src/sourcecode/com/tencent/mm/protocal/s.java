package com.tencent.mm.protocal;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.ade;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.sdk.platformtools.bg;

public final class s
{
  public static final class a
    extends k.d
    implements k.b
  {
    public ade tKN;
    
    public a()
    {
      GMTrace.i(4076326617088L, 30371);
      this.tKN = new ade();
      GMTrace.o(4076326617088L, 30371);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(4076460834816L, 30372);
      this.tKq = ac.bOq();
      this.tKN.tUK = new azp().be(bg.bQN());
      this.tKN.uNh = k.a(this);
      byte[] arrayOfByte = this.tKN.toByteArray();
      GMTrace.o(4076460834816L, 30372);
      return arrayOfByte;
    }
    
    public final int Bb()
    {
      GMTrace.i(4076595052544L, 30373);
      GMTrace.o(4076595052544L, 30373);
      return 572;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */