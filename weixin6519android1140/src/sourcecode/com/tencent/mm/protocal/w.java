package com.tencent.mm.protocal;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.aqj;
import com.tencent.mm.protocal.c.aqk;

public final class w
{
  public static final class a
    extends k.d
    implements k.b
  {
    public aqj tKT;
    
    public a()
    {
      GMTrace.i(13589679177728L, 101251);
      this.tKT = new aqj();
      GMTrace.o(13589679177728L, 101251);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(13589813395456L, 101252);
      byte[] arrayOfByte = this.tKT.toByteArray();
      GMTrace.o(13589813395456L, 101252);
      return arrayOfByte;
    }
    
    public final int Bb()
    {
      GMTrace.i(13589947613184L, 101253);
      GMTrace.o(13589947613184L, 101253);
      return 138;
    }
    
    public final int getCmdId()
    {
      GMTrace.i(13590081830912L, 101254);
      GMTrace.o(13590081830912L, 101254);
      return 121;
    }
  }
  
  public static final class b
    extends k.e
    implements k.c
  {
    public aqk tKU;
    
    public b()
    {
      GMTrace.i(13606322176000L, 101375);
      this.tKU = new aqk();
      GMTrace.o(13606322176000L, 101375);
    }
    
    public final int getCmdId()
    {
      GMTrace.i(13606590611456L, 101377);
      GMTrace.o(13606590611456L, 101377);
      return 1000000121;
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(13606456393728L, 101376);
      this.tKU = ((aqk)new aqk().aD(paramArrayOfByte));
      int i = this.tKU.tST;
      GMTrace.o(13606456393728L, 101376);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */