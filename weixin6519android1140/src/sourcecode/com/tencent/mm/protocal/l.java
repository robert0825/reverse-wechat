package com.tencent.mm.protocal;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.fy;
import com.tencent.mm.protocal.c.fz;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public final class l
  extends a
{
  public static final class a
    extends k.d
    implements k.b
  {
    public int netType;
    public int tKv;
    
    public a()
    {
      GMTrace.i(4073776480256L, 30352);
      this.tKv = 0;
      GMTrace.o(4073776480256L, 30352);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(4073910697984L, 30353);
      Object localObject2 = new fy();
      ((fy)localObject2).tTC = d.tJC;
      ((fy)localObject2).tUh = 2;
      ((fy)localObject2).tUi = this.netType;
      ((fy)localObject2).tUj = this.tKv;
      w.i("MicroMsg.MMBgFg", "somr online:%d nettype:%d ver:%d devid:%d", new Object[] { Integer.valueOf(((fy)localObject2).tUj), Integer.valueOf(((fy)localObject2).tUi), Integer.valueOf(((fy)localObject2).tTC), Integer.valueOf(((fy)localObject2).tUh) });
      Object localObject1 = null;
      try
      {
        localObject2 = ((fy)localObject2).toByteArray();
        localObject1 = localObject2;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          w.e("MicroMsg.MMBgFg", "MMBgfg toProtoBuf exception:%s", new Object[] { bg.f(localIOException) });
        }
      }
      GMTrace.o(4073910697984L, 30353);
      return (byte[])localObject1;
    }
    
    public final int Bb()
    {
      GMTrace.i(4074044915712L, 30354);
      GMTrace.o(4074044915712L, 30354);
      return 0;
    }
    
    public final boolean Ei()
    {
      GMTrace.i(4074447568896L, 30357);
      GMTrace.o(4074447568896L, 30357);
      return false;
    }
    
    public final boolean bOl()
    {
      GMTrace.i(4074313351168L, 30356);
      GMTrace.o(4074313351168L, 30356);
      return true;
    }
    
    public final int getCmdId()
    {
      GMTrace.i(4074179133440L, 30355);
      GMTrace.o(4074179133440L, 30355);
      return 312;
    }
  }
  
  public static final class b
    extends k.e
    implements k.c
  {
    public fz tKw;
    
    public b()
    {
      GMTrace.i(4087600906240L, 30455);
      this.tKw = new fz();
      GMTrace.o(4087600906240L, 30455);
    }
    
    public final boolean bOl()
    {
      GMTrace.i(4088003559424L, 30458);
      GMTrace.o(4088003559424L, 30458);
      return true;
    }
    
    public final int getCmdId()
    {
      GMTrace.i(4087869341696L, 30457);
      GMTrace.o(4087869341696L, 30457);
      return 1000000312;
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(4087735123968L, 30456);
      this.tKw = ((fz)new fz().aD(paramArrayOfByte));
      w.d("MicroMsg.MMBgFg", "retcode:" + this.tKw.jWs);
      int i = this.tKw.jWs;
      GMTrace.o(4087735123968L, 30456);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */