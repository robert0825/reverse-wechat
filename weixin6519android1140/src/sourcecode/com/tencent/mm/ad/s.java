package com.tencent.mm.ad;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.q;
import com.tencent.mm.network.r.a;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.c.aqh;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bbf;
import com.tencent.mm.protocal.c.qm;
import com.tencent.mm.protocal.g;
import com.tencent.mm.protocal.h;
import com.tencent.mm.protocal.i.c;
import com.tencent.mm.protocal.i.c.a;
import com.tencent.mm.protocal.i.f;
import com.tencent.mm.protocal.i.g;
import com.tencent.mm.protocal.y.a;
import com.tencent.mm.protocal.y.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.au;

public final class s
  extends r.a
{
  private q guL;
  g guY;
  h guZ;
  ae handler;
  
  public s(q paramq) {}
  
  public s(q paramq, ae paramae)
  {
    GMTrace.i(13408485244928L, 99901);
    this.guL = paramq;
    this.guY = new r(paramq.DC(), paramq.getType());
    this.guZ = new t(paramq.AZ(), paramq.getType());
    this.handler = paramae;
    GMTrace.o(13408485244928L, 99901);
  }
  
  public final boolean DD()
  {
    GMTrace.i(13408619462656L, 99902);
    boolean bool = this.guL.DD();
    GMTrace.o(13408619462656L, 99902);
    return bool;
  }
  
  public final int DI()
  {
    GMTrace.i(13408753680384L, 99903);
    int i = this.guL.hashCode();
    GMTrace.o(13408753680384L, 99903);
    return i;
  }
  
  public final int Dz()
  {
    GMTrace.i(13408887898112L, 99904);
    int i = this.guL.Dz();
    GMTrace.o(13408887898112L, 99904);
    return i;
  }
  
  public final g Ej()
  {
    GMTrace.i(13409022115840L, 99905);
    g localg = this.guY;
    GMTrace.o(13409022115840L, 99905);
    return localg;
  }
  
  public final h Ek()
  {
    GMTrace.i(13409156333568L, 99906);
    h localh = this.guZ;
    GMTrace.o(13409156333568L, 99906);
    return localh;
  }
  
  public final int El()
  {
    int j = -1;
    GMTrace.i(13410095857664L, 99913);
    int i = getType();
    w.d("MicroMsg.RemoteReqResp", "summerauth decodeAndRetriveAccInfo type:%d", new Object[] { Integer.valueOf(i) });
    switch (i)
    {
    default: 
    case 701: 
    case 702: 
      for (i = -1;; i = au.b(this.guL))
      {
        GMTrace.o(13410095857664L, 99913);
        return i;
      }
    }
    Object localObject2 = this.guL;
    Object localObject1 = (y.a)((q)localObject2).DC();
    y.b localb = (y.b)((q)localObject2).AZ();
    w.i("MicroMsg.MMReqRespReg2", "summerauth decodeAndRetriveAccInfo type:%d, stack[%s]", new Object[] { Integer.valueOf(126), bg.bQW() });
    if (localb.tKe != 0) {
      w.d("MicroMsg.MMReqRespReg2", "summerauth decodeAndRetriveAccInfo resp just decoded and ret result:%d", new Object[] { Integer.valueOf(localb.tKe) });
    }
    for (;;)
    {
      i = localb.tKe;
      break;
      Object localObject3 = localb.tKW.uGx;
      if (localObject3 != null)
      {
        int k = ((bbf)localObject3).tSp;
        localObject2 = ((bbf)localObject3).tRZ;
        localObject3 = n.a(((bbf)localObject3).tSa);
        int m = ((qm)localObject2).tSB.uNN;
        int n = ((qm)localObject2).ugt;
        label247:
        byte[] arrayOfByte2;
        if (localObject3 == null)
        {
          i = -1;
          w.d("MicroMsg.MMReqRespReg2", "summerauth svr ecdh key len:%d, nid:%d sessionKey len:%d, sessionKey：%s", new Object[] { Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i), bg.SJ(bg.bp((byte[])localObject3)) });
          byte[] arrayOfByte1 = n.a(((qm)localObject2).tSB);
          arrayOfByte2 = ((y.a)localObject1).tKb;
          localObject1 = null;
          if (bg.bq(arrayOfByte1)) {
            break label636;
          }
          m = arrayOfByte1.length;
          localObject1 = bg.SJ(bg.bp(arrayOfByte1));
          if (arrayOfByte2 != null) {
            break label622;
          }
          i = -1;
          label342:
          w.d("MicroMsg.MMReqRespReg2", "summerauth svrPubKey len:%d value:%s prikey len:%d, values:%s", new Object[] { Integer.valueOf(m), localObject1, Integer.valueOf(i), bg.SJ(bg.bp(arrayOfByte2)) });
          localObject1 = new PByteArray();
          m = MMProtocalJni.computerKeyWithAllStr(((qm)localObject2).ugt, arrayOfByte1, arrayOfByte2, (PByteArray)localObject1, 0);
          localObject1 = ((PByteArray)localObject1).value;
          if (localObject1 != null) {
            break label629;
          }
          i = -1;
          label424:
          w.i("MicroMsg.MMReqRespReg2", "summerauth ComputerKeyWithAllStr ret:%d, agreedECDHKey len: %d, values:%s", new Object[] { Integer.valueOf(m), Integer.valueOf(i), bg.SJ(bg.bp((byte[])localObject1)) });
          label461:
          if (localObject1 == null) {
            break label647;
          }
          localObject2 = localObject1;
          label470:
          localb.tKd = ((byte[])localObject2);
          if ((k & 0x4) == 0) {
            break label719;
          }
          w.d("MicroMsg.MMReqRespReg2", "summerauth must decode session key");
          if (bg.bq((byte[])localObject1)) {
            break label694;
          }
          localObject1 = MMProtocalJni.aesDecrypt((byte[])localObject3, (byte[])localObject1);
          if (localObject3 != null) {
            break label655;
          }
          i = -1;
          label514:
          localObject2 = bg.bp((byte[])localObject3);
          if (localObject1 != null) {
            break label662;
          }
        }
        for (;;)
        {
          w.d("MicroMsg.MMReqRespReg2", "summerauth aesDecrypt sessionKey len:%d, value:%s, session len:%d, value:%s", new Object[] { Integer.valueOf(i), localObject2, Integer.valueOf(j), bg.SJ(bg.bp((byte[])localObject1)) });
          if (bg.bq((byte[])localObject1)) {
            break label669;
          }
          w.d("MicroMsg.MMReqRespReg2", "summerauth decode session key succ session:%s", new Object[] { bg.SJ(bg.bp((byte[])localObject1)) });
          localb.aZ((byte[])localObject1);
          localb.tKe = 1;
          break;
          i = localObject3.length;
          break label247;
          label622:
          i = arrayOfByte2.length;
          break label342;
          label629:
          i = localObject1.length;
          break label424;
          label636:
          w.w("MicroMsg.MMReqRespReg2", "summerauth svr ecdh key is null!");
          break label461;
          label647:
          localObject2 = new byte[0];
          break label470;
          label655:
          i = localObject3.length;
          break label514;
          label662:
          j = localObject1.length;
        }
        label669:
        w.d("MicroMsg.MMReqRespReg2", "summerauth decode session key failed ret null!");
        localb.aZ(new byte[0]);
        localb.tKe = 2;
        continue;
        label694:
        w.d("MicroMsg.MMReqRespReg2", "summerauth decode session key failed as agreedECDHKey is null!");
        localb.aZ(new byte[0]);
        localb.tKe = 2;
        continue;
        label719:
        w.d("MicroMsg.MMReqRespReg2", "summerauth not need decode session key");
        localb.aZ((byte[])localObject3);
        localb.tKe = 1;
      }
      else
      {
        w.d("MicroMsg.MMReqRespReg2", "summerauth decodeAndRetriveAccInfo sect null and decode failed!");
        localb.aZ(new byte[0]);
        localb.tKe = 2;
      }
    }
  }
  
  public final void a(com.tencent.mm.network.d paramd, final com.tencent.mm.network.j paramj, final int paramInt1, final int paramInt2)
  {
    GMTrace.i(13409961639936L, 99912);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(13400834834432L, 99844);
        s locals = new s(new j(), s.this.handler);
        try
        {
          paramj.a(locals, paramInt1, paramInt2, "");
          GMTrace.o(13400834834432L, 99844);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          w.e("MicroMsg.RemoteReqResp", "exception:%s", new Object[] { bg.f(localRemoteException) });
          GMTrace.o(13400834834432L, 99844);
        }
      }
    });
    GMTrace.o(13409961639936L, 99912);
  }
  
  public final void a(final com.tencent.mm.network.j paramj, final int paramInt1, final int paramInt2)
  {
    GMTrace.i(13409827422208L, 99911);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(13400566398976L, 99842);
        int k = au.AX().getInt("key_auth_update_version", 0);
        int j;
        Object localObject;
        if (k <= 637665332)
        {
          i = 701;
          j = i;
          if (k == 0)
          {
            localObject = ab.getContext().getSharedPreferences("ticket_prefs", 4);
            if (!bg.nm(((SharedPreferences)localObject).getString("_auth_ticket", ""))) {
              break label312;
            }
            w.i("MicroMsg.RemoteReqResp", "summerauth dealWithAutoAuth revise to autoauth");
            com.tencent.mm.plugin.report.d.oqe.a(148L, 50L, 1L, true);
            j = 702;
          }
          label89:
          w.i("MicroMsg.RemoteReqResp", "summerauth dealWithAutoAuth updateVersion:%d, clientVersion:%d WLOGIN_BUG_VERSION:%d, newAuthType:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(com.tencent.mm.protocal.d.tJC), Integer.valueOf(637665332), Integer.valueOf(j) });
          if (j == 701) {
            com.tencent.mm.plugin.report.d.oqe.a(148L, 48L, 1L, true);
          }
          if (((s.a(s.this).getType() != 702) && (s.a(s.this).getType() != 701)) || (((i.g)s.a(s.this).AZ()).tKe != 2)) {
            break label410;
          }
        }
        label312:
        label410:
        for (int i = 1;; i = 0)
        {
          w.i("MicroMsg.RemoteReqResp", "summerauth dealWithAutoAuth old type:%d new auth type:%d, reqFlag:%d", new Object[] { Integer.valueOf(s.a(s.this).getType()), Integer.valueOf(j), Integer.valueOf(i) });
          localObject = i.c.a.tJY.aJ(j, i);
          if (localObject == null) {}
          for (localObject = null;; localObject = new s((q)localObject, s.this.handler))
          {
            try
            {
              paramj.a((com.tencent.mm.network.r)localObject, paramInt1, paramInt2, "");
              GMTrace.o(13400566398976L, 99842);
              return;
            }
            catch (RemoteException localRemoteException)
            {
              w.e("MicroMsg.RemoteReqResp", "exception:%s", new Object[] { bg.f(localRemoteException) });
              GMTrace.o(13400566398976L, 99842);
              return;
            }
            i = 702;
            break;
            com.tencent.mm.plugin.report.d.oqe.a(148L, 49L, 1L, true);
            w.i("MicroMsg.RemoteReqResp", "summerauth dealWithAutoAuth keep manual as old [%s]", new Object[] { bg.SJ(((SharedPreferences)localObject).getString("_auth_ticket", "")) });
            j = i;
            break label89;
          }
        }
      }
    });
    GMTrace.o(13409827422208L, 99911);
  }
  
  public final void a(com.tencent.mm.network.j paramj, final int paramInt1, final int paramInt2, final String paramString)
  {
    GMTrace.i(13409693204480L, 99910);
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(13397345173504L, 99818);
        w.d("MicroMsg.RemoteReqResp", "summerauth doAutoAuthEnd type:%d, stack[%s]", new Object[] { Integer.valueOf(s.a(s.this).getType()), bg.bQW() });
        i.f localf = (i.f)s.a(s.this).DC();
        i.g localg = (i.g)s.a(s.this).AZ();
        if (localg == null)
        {
          w.f("MicroMsg.RemoteReqResp", "null auth.resp");
          GMTrace.o(13397345173504L, 99818);
          return;
        }
        i.c.a.tJY.a(localf, localg, paramInt1, paramInt2, paramString);
        GMTrace.o(13397345173504L, 99818);
      }
    });
    GMTrace.o(13409693204480L, 99910);
  }
  
  public final int getType()
  {
    GMTrace.i(13409290551296L, 99907);
    int i = this.guL.getType();
    GMTrace.o(13409290551296L, 99907);
    return i;
  }
  
  public final String getUri()
  {
    GMTrace.i(13409424769024L, 99908);
    String str = this.guL.getUri();
    GMTrace.o(13409424769024L, 99908);
    return str;
  }
  
  public final void in(String paramString)
  {
    GMTrace.i(13409558986752L, 99909);
    GMTrace.o(13409558986752L, 99909);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ad\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */