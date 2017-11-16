package com.tencent.mm.modelmulti;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.gz;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.zero.b.b;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.ad;
import com.tencent.mm.protocal.c.aqk;
import com.tencent.mm.protocal.k.c;
import com.tencent.mm.protocal.w.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;

public final class m
{
  public static boolean JC()
  {
    GMTrace.i(13438147362816L, 100122);
    h.xz();
    if (bg.nl((String)h.xy().xh().get(8195, null)).length() > 0)
    {
      h.xz();
      if (bg.e((Integer)h.xy().xh().get(15, null)) != 0) {
        break label92;
      }
    }
    label92:
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.NewSyncMgr", "summerinit needInit ret[%b]", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(13438147362816L, 100122);
      return bool;
    }
  }
  
  public static void a(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong)
  {
    GMTrace.i(13438281580544L, 100123);
    w.b localb = new w.b();
    PByteArray localPByteArray2 = new PByteArray();
    PByteArray localPByteArray1 = new PByteArray();
    PInt localPInt2 = new PInt();
    PInt localPInt4 = new PInt();
    PInt localPInt1 = new PInt(0);
    PInt localPInt3 = new PInt(255);
    try
    {
      bool1 = MMProtocalJni.unpack(localPByteArray1, paramArrayOfByte1, paramArrayOfByte2, localPByteArray2, localPInt2, localPInt4, localPInt1, localPInt3);
      w.i("MicroMsg.NewSyncMgr", "summerdiz dealWithPushResp unpack ret[%b], noticeid[%d]", new Object[] { Boolean.valueOf(bool1), Integer.valueOf(localPInt1.value) });
      if (localPInt1.value != 0)
      {
        paramArrayOfByte2 = new gz();
        paramArrayOfByte2.eKe.eKf = localPInt1.value;
        boolean bool2 = com.tencent.mm.sdk.b.a.vgX.m(paramArrayOfByte2);
        w.i("MicroMsg.NewSyncMgr", "summerdiz publish GetDisasterInfoEvent noticeid[%d] publish[%b]", new Object[] { Integer.valueOf(localPInt1.value), Boolean.valueOf(bool2) });
        localPInt1.value = 0;
      }
      if (!bool1)
      {
        w.e("MicroMsg.NewSyncMgr", "unpack push resp failed");
        GMTrace.o(13438281580544L, 100123);
        return;
      }
      localb.tKt = localPInt3.value;
      if (localPInt2.value == -13)
      {
        localb.tKs = localPInt2.value;
        w.e("MicroMsg.NewSyncMgr", "unpack push resp failed session timeout");
        GMTrace.o(13438281580544L, 100123);
        return;
      }
      int i = localb.y(localPByteArray1.value);
      w.d("MicroMsg.NewSyncMgr", "bufToResp using protobuf ok");
      localb.tKs = i;
      localb.tKr = paramArrayOfByte1.length;
      h.xz();
      paramArrayOfByte1 = bg.St(bg.nl((String)h.xy().xh().get(8195, null)));
      paramArrayOfByte2 = n.a(localb.tKU.tZA);
      h.xz();
      h.xw().aG(localb.tKU.jhA, localb.tKU.uGG);
      com.tencent.mm.kernel.a.ff(localb.tKU.jhA);
      if ((bg.bq(paramArrayOfByte2)) || (!ad.h(paramArrayOfByte1, paramArrayOfByte2)))
      {
        w.e("MicroMsg.NewSyncMgr", "compareKeybuf syncKey failed");
        GMTrace.o(13438281580544L, 100123);
        return;
      }
      ((b)h.h(b.class)).JF().a(localb, paramInt, paramLong);
    }
    catch (Exception paramArrayOfByte1)
    {
      for (;;)
      {
        boolean bool1;
        w.e("MicroMsg.NewSyncMgr", "unpack push resp failed: %s", new Object[] { paramArrayOfByte1 });
        w.printErrStackTrace("MicroMsg.NewSyncMgr", paramArrayOfByte1, "", new Object[0]);
      }
    }
    if (localPInt1.value != 0)
    {
      paramArrayOfByte1 = new gz();
      paramArrayOfByte1.eKe.eKf = localPInt1.value;
      bool1 = com.tencent.mm.sdk.b.a.vgX.m(paramArrayOfByte1);
      w.i("MicroMsg.NewSyncMgr", "summerdiz publish GetDisasterInfoEvent noticeid[%d] publish[%b]", new Object[] { Integer.valueOf(localPInt1.value), Boolean.valueOf(bool1) });
      localPInt1.value = 0;
    }
    GMTrace.o(13438281580544L, 100123);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelmulti\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */