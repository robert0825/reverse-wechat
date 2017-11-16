package com.tencent.mm.protocal;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.c.gl;
import com.tencent.mm.protocal.c.gm;
import com.tencent.mm.sdk.platformtools.bg;

public final class m
{
  public static final class a
    extends k.d
    implements k.b
  {
    public gl tKx;
    
    public a()
    {
      GMTrace.i(13171188301824L, 98133);
      this.tKx = new gl();
      GMTrace.o(13171188301824L, 98133);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(13171322519552L, 98134);
      this.tKq = ac.bOo();
      this.tKx.tUK = new azp().be(bg.bQN());
      this.tKx.uNh = k.a(this);
      byte[] arrayOfByte = this.tKx.toByteArray();
      GMTrace.o(13171322519552L, 98134);
      return arrayOfByte;
    }
    
    public final int Bb()
    {
      GMTrace.i(13171456737280L, 98135);
      GMTrace.o(13171456737280L, 98135);
      return 145;
    }
  }
  
  public static final class b
    extends k.e
    implements k.c
  {
    public gm tKy;
    
    public b()
    {
      GMTrace.i(13171590955008L, 98136);
      this.tKy = new gm();
      GMTrace.o(13171590955008L, 98136);
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(13171725172736L, 98137);
      this.tKy = ((gm)new gm().aD(paramArrayOfByte));
      k.a(this, this.tKy.uND);
      int i = this.tKy.uND.tST;
      GMTrace.o(13171725172736L, 98137);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */