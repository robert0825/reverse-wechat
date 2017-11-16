package com.tencent.mm.protocal;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.adv;
import com.tencent.mm.protocal.c.adw;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.sdk.platformtools.bg;

public final class t
{
  public static final class a
    extends k.d
    implements k.b
  {
    public adv tKO;
    
    public a()
    {
      GMTrace.i(4082769068032L, 30419);
      this.tKO = new adv();
      GMTrace.o(4082769068032L, 30419);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(4082903285760L, 30420);
      this.tKq = ac.bOo();
      this.tKO.tUK = new azp().be(bg.bQN());
      this.tKO.uNh = k.a(this);
      byte[] arrayOfByte = this.tKO.toByteArray();
      GMTrace.o(4082903285760L, 30420);
      return arrayOfByte;
    }
    
    public final int Bb()
    {
      GMTrace.i(4083037503488L, 30421);
      GMTrace.o(4083037503488L, 30421);
      return 429;
    }
  }
  
  public static final class b
    extends k.e
    implements k.c
  {
    public adw tKP;
    
    public b()
    {
      GMTrace.i(4086258728960L, 30445);
      this.tKP = new adw();
      GMTrace.o(4086258728960L, 30445);
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(4086392946688L, 30446);
      this.tKP = ((adw)new adw().aD(paramArrayOfByte));
      k.a(this, this.tKP.uND);
      int i = this.tKP.uND.tST;
      GMTrace.o(4086392946688L, 30446);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */