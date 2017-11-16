package com.tencent.mm.protocal;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.c.qn;
import com.tencent.mm.protocal.c.qo;
import com.tencent.mm.sdk.platformtools.bg;

public final class p
{
  public static final class a
    extends k.d
    implements k.b
  {
    public qn tKF;
    
    public a()
    {
      GMTrace.i(4073373827072L, 30349);
      this.tKF = new qn();
      GMTrace.o(4073373827072L, 30349);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(4073508044800L, 30350);
      this.tKq = ac.bOq();
      this.tKF.tUK = new azp().be(bg.bQN());
      this.tKF.uNh = k.a(this);
      byte[] arrayOfByte = this.tKF.toByteArray();
      GMTrace.o(4073508044800L, 30350);
      return arrayOfByte;
    }
    
    public final int Bb()
    {
      GMTrace.i(4073642262528L, 30351);
      GMTrace.o(4073642262528L, 30351);
      return 481;
    }
  }
  
  public static final class b
    extends k.e
    implements k.c
  {
    public qo tKG;
    
    public b()
    {
      GMTrace.i(4065186545664L, 30288);
      this.tKG = new qo();
      GMTrace.o(4065186545664L, 30288);
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(4065320763392L, 30289);
      this.tKG = ((qo)new qo().aD(paramArrayOfByte));
      k.a(this, this.tKG.uND);
      int i = this.tKG.uND.tST;
      GMTrace.o(4065320763392L, 30289);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */