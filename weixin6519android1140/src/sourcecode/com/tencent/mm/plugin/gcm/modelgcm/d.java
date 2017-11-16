package com.tencent.mm.plugin.gcm.modelgcm;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.cg;
import com.tencent.mm.protocal.c.ch;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.k;
import com.tencent.mm.protocal.k.b;
import com.tencent.mm.protocal.k.c;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;

public final class d
{
  public static final class a
    extends k.d
    implements k.b
  {
    public cg meV;
    
    public a()
    {
      GMTrace.i(8016690675712L, 59729);
      this.meV = new cg();
      GMTrace.o(8016690675712L, 59729);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(8016824893440L, 59730);
      this.meV.uNh = k.a(this);
      byte[] arrayOfByte = this.meV.toByteArray();
      GMTrace.o(8016824893440L, 59730);
      return arrayOfByte;
    }
    
    public final int Bb()
    {
      GMTrace.i(8017093328896L, 59732);
      GMTrace.o(8017093328896L, 59732);
      return 624;
    }
    
    public final int getCmdId()
    {
      GMTrace.i(8016959111168L, 59731);
      GMTrace.o(8016959111168L, 59731);
      return 241;
    }
  }
  
  public static final class b
    extends k.e
    implements k.c
  {
    public ch meW;
    
    public b()
    {
      GMTrace.i(8018301288448L, 59741);
      this.meW = new ch();
      GMTrace.o(8018301288448L, 59741);
    }
    
    public final int getCmdId()
    {
      GMTrace.i(8018569723904L, 59743);
      GMTrace.o(8018569723904L, 59743);
      return 1000000241;
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(8018435506176L, 59742);
      this.meW = ((ch)new ch().aD(paramArrayOfByte));
      k.a(this, this.meW.uND);
      int i = this.meW.uND.tST;
      GMTrace.o(8018435506176L, 59742);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gcm\modelgcm\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */