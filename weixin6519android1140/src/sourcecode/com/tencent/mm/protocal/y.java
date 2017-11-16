package com.tencent.mm.protocal;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.c.aqg;
import com.tencent.mm.protocal.c.aqh;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.c.qm;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.w;

public final class y
{
  public static final class a
    extends k.d
    implements k.b
  {
    public aqg tKV;
    public byte[] tKb;
    
    public a()
    {
      GMTrace.i(13606993264640L, 101380);
      this.tKV = new aqg();
      GMTrace.o(13606993264640L, 101380);
    }
    
    public final byte[] Ba()
    {
      int j = -1;
      GMTrace.i(13607127482368L, 101381);
      this.tKq = ac.bOo();
      this.tKV.tUK = new azp().be(bg.bQN());
      this.tKV.uNh = k.a(this);
      this.tKV.uGf = f.vhp;
      qm localqm = new qm();
      localqm.ugt = 713;
      Object localObject2 = new PByteArray();
      Object localObject1 = new PByteArray();
      int k = MMProtocalJni.generateECKey(localqm.ugt, (PByteArray)localObject2, (PByteArray)localObject1);
      byte[] arrayOfByte = ((PByteArray)localObject2).value;
      localObject2 = ((PByteArray)localObject1).value;
      int m;
      int i;
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        this.tKb = ((byte[])localObject1);
        m = localqm.ugt;
        if (arrayOfByte != null) {
          break label265;
        }
        i = -1;
        label149:
        if (localObject2 != null) {
          break label272;
        }
      }
      for (;;)
      {
        w.d("MicroMsg.MMReg2.Req", "summerecdh nid:%d ret:%d, pub len: %d, pri len:%d, pub:%s, pri:%s", new Object[] { Integer.valueOf(m), Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j), bg.bp(arrayOfByte), bg.bp((byte[])localObject2) });
        localqm.tSB = new azp().be(arrayOfByte);
        this.tKV.tSF = localqm;
        localObject1 = this.tKV.toByteArray();
        GMTrace.o(13607127482368L, 101381);
        return (byte[])localObject1;
        localObject1 = new byte[0];
        break;
        label265:
        i = arrayOfByte.length;
        break label149;
        label272:
        j = localObject2.length;
      }
    }
    
    public final int Bb()
    {
      GMTrace.i(13607261700096L, 101382);
      GMTrace.o(13607261700096L, 101382);
      return 126;
    }
    
    public final int getCmdId()
    {
      GMTrace.i(13607395917824L, 101383);
      GMTrace.o(13607395917824L, 101383);
      return 0;
    }
  }
  
  public static final class b
    extends k.e
    implements k.c
  {
    public byte[] hge;
    public aqh tKW;
    public byte[] tKd;
    public int tKe;
    
    public b()
    {
      GMTrace.i(13587665911808L, 101236);
      this.tKW = new aqh();
      this.tKe = 0;
      GMTrace.o(13587665911808L, 101236);
    }
    
    public final void aZ(byte[] paramArrayOfByte)
    {
      GMTrace.i(13588068564992L, 101239);
      if (paramArrayOfByte != null) {}
      for (;;)
      {
        this.hge = paramArrayOfByte;
        GMTrace.o(13588068564992L, 101239);
        return;
        paramArrayOfByte = new byte[0];
      }
    }
    
    public final int getCmdId()
    {
      GMTrace.i(13587934347264L, 101238);
      GMTrace.o(13587934347264L, 101238);
      return 0;
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(13587800129536L, 101237);
      this.tKe = 0;
      this.tKW = ((aqh)new aqh().aD(paramArrayOfByte));
      k.a(this, this.tKW.uND);
      this.tKe = 0;
      int i = this.tKW.uND.tST;
      GMTrace.o(13587800129536L, 101237);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */