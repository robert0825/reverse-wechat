package com.tencent.mm.protocal;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.bbj;
import com.tencent.mm.protocal.c.bbk;
import com.tencent.mm.protocal.c.es;

public final class z
{
  public static final class a
    extends k.d
    implements k.b
  {
    public bbj tKX;
    
    public a()
    {
      GMTrace.i(3610054230016L, 26897);
      this.tKX = new bbj();
      GMTrace.o(3610054230016L, 26897);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(3610188447744L, 26898);
      this.tKX.uNh = k.a(this);
      byte[] arrayOfByte = this.tKX.toByteArray();
      GMTrace.o(3610188447744L, 26898);
      return arrayOfByte;
    }
    
    public final int Bb()
    {
      GMTrace.i(3610456883200L, 26900);
      GMTrace.o(3610456883200L, 26900);
      return 131;
    }
    
    public final int getCmdId()
    {
      GMTrace.i(3610322665472L, 26899);
      GMTrace.o(3610322665472L, 26899);
      return 42;
    }
  }
  
  public static final class b
    extends k.e
    implements k.c
  {
    public bbk tKY;
    
    public b()
    {
      GMTrace.i(4066126069760L, 30295);
      this.tKY = new bbk();
      GMTrace.o(4066126069760L, 30295);
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(4066260287488L, 30296);
      this.tKY = ((bbk)new bbk().aD(paramArrayOfByte));
      k.a(this, this.tKY.uND);
      int i = this.tKY.uND.tST;
      GMTrace.o(4066260287488L, 30296);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */