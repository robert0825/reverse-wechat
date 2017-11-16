package com.tencent.mm.protocal;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.aqd;
import com.tencent.mm.protocal.c.aqe;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.es;

public final class v
{
  public static final class a
    extends k.d
    implements k.b
  {
    public aqd tKR;
    
    public a()
    {
      GMTrace.i(13590887137280L, 101260);
      this.tKR = new aqd();
      GMTrace.o(13590887137280L, 101260);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(13591021355008L, 101261);
      this.tKR.uNh = k.a(this);
      byte[] arrayOfByte = this.tKR.toByteArray();
      GMTrace.o(13591021355008L, 101261);
      return arrayOfByte;
    }
    
    public final int Bb()
    {
      GMTrace.i(13591155572736L, 101262);
      GMTrace.o(13591155572736L, 101262);
      return 139;
    }
    
    public final int getCmdId()
    {
      GMTrace.i(13591289790464L, 101263);
      GMTrace.o(13591289790464L, 101263);
      return 27;
    }
  }
  
  public static final class b
    extends k.e
    implements k.c
  {
    public aqe tKS;
    
    public b()
    {
      GMTrace.i(13608201224192L, 101389);
      this.tKS = new aqe();
      GMTrace.o(13608201224192L, 101389);
    }
    
    public final int getCmdId()
    {
      GMTrace.i(13608469659648L, 101391);
      GMTrace.o(13608469659648L, 101391);
      return 1000000027;
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(13608335441920L, 101390);
      this.tKS = ((aqe)new aqe().aD(paramArrayOfByte));
      k.a(this, this.tKS.uND);
      int i = this.tKS.uND.tST;
      GMTrace.o(13608335441920L, 101390);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */