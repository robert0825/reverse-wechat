package com.tencent.mm.y;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.ad.i;
import com.tencent.mm.ad.v;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.ad;
import com.tencent.mm.network.q;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.c.ahn;
import com.tencent.mm.protocal.c.aho;
import com.tencent.mm.protocal.c.ang;
import com.tencent.mm.protocal.c.ani;
import com.tencent.mm.protocal.c.ap;
import com.tencent.mm.protocal.c.apx;
import com.tencent.mm.protocal.c.apz;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bki;
import com.tencent.mm.protocal.c.bqp;
import com.tencent.mm.protocal.c.bub;
import com.tencent.mm.protocal.c.du;
import com.tencent.mm.protocal.c.dx;
import com.tencent.mm.protocal.c.dy;
import com.tencent.mm.protocal.c.ea;
import com.tencent.mm.protocal.c.ep;
import com.tencent.mm.protocal.c.hy;
import com.tencent.mm.protocal.c.hz;
import com.tencent.mm.protocal.c.qm;
import com.tencent.mm.protocal.i.a;
import com.tencent.mm.protocal.i.b;
import com.tencent.mm.protocal.i.c;
import com.tencent.mm.protocal.i.d;
import com.tencent.mm.protocal.i.e;
import com.tencent.mm.protocal.i.f;
import com.tencent.mm.protocal.i.g;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.protocal.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.s;
import com.tencent.mm.storage.t;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class au
  extends i
  implements i.c
{
  private static a gnv;
  private final int gns;
  private final i.f gnt;
  private final i.g gnu;
  
  static
  {
    GMTrace.i(13484318261248L, 100466);
    gnv = null;
    GMTrace.o(13484318261248L, 100466);
  }
  
  public au(int paramInt)
  {
    GMTrace.i(13482573430784L, 100453);
    if ((paramInt == 702) || (paramInt == 701)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      this.gns = paramInt;
      if (paramInt != 702) {
        break;
      }
      this.gnt = new i.a();
      this.gnu = new i.b();
      GMTrace.o(13482573430784L, 100453);
      return;
    }
    this.gnt = new i.d();
    this.gnu = new i.e();
    GMTrace.o(13482573430784L, 100453);
  }
  
  public static SharedPreferences AX()
  {
    GMTrace.i(15694750023680L, 116935);
    SharedPreferences localSharedPreferences = av.AX();
    GMTrace.o(15694750023680L, 116935);
    return localSharedPreferences;
  }
  
  public static void a(a parama)
  {
    GMTrace.i(13483110301696L, 100457);
    gnv = parama;
    GMTrace.o(13483110301696L, 100457);
  }
  
  public static void a(boolean paramBoolean, hz paramhz, apx paramapx, aho paramaho)
  {
    GMTrace.i(13483378737152L, 100459);
    int i;
    int j;
    label22:
    int k;
    label29:
    int m;
    label36:
    int n;
    label43:
    int i1;
    if (paramhz == null)
    {
      i = -1;
      if (paramhz != null) {
        break label202;
      }
      j = -1;
      if (paramaho != null) {
        break label211;
      }
      k = -1;
      if (paramapx != null) {
        break label220;
      }
      m = -1;
      if (paramapx != null) {
        break label229;
      }
      n = -1;
      if (paramapx != null) {
        break label238;
      }
      i1 = -1;
      label50:
      if (paramapx != null) {
        break label247;
      }
      localObject1 = "null";
      label58:
      if (paramapx != null) {
        break label256;
      }
    }
    label202:
    label211:
    label220:
    label229:
    label238:
    label247:
    label256:
    for (Object localObject2 = "null";; localObject2 = paramapx.uFO)
    {
      w.i("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo resetnewwork:%b iplist[l:%d s:%d] hostList[%d] noop[%d %d] typing[%d] port[%s] timeout[%s]", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), localObject1, localObject2 });
      if ((paramaho != null) && (paramaho.jhd != null) && (paramaho.jhd.size() > 0)) {
        break label265;
      }
      w.f("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo give empty host request! stack:[%s]", new Object[] { bg.bQW() });
      GMTrace.o(13483378737152L, 100459);
      return;
      i = paramhz.tWX;
      break;
      j = paramhz.tWY;
      break label22;
      k = paramaho.jhc;
      break label29;
      m = paramapx.uFP;
      break label36;
      n = paramapx.uFQ;
      break label43;
      i1 = paramapx.uFR;
      break label50;
      localObject1 = paramapx.uFN;
      break label58;
    }
    label265:
    if ((paramaho == null) || (paramaho.jhd == null) || (paramaho.jhd.size() <= 0))
    {
      w.f("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo give empty host request! stack:[%s]", new Object[] { bg.bQW() });
      GMTrace.o(13483378737152L, 100459);
      return;
    }
    localObject2 = new LinkedList();
    ((List)localObject2).clear();
    if (paramhz != null)
    {
      localObject3 = paramhz.tXb.iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (hy)((Iterator)localObject3).next();
        localObject1 = "";
        if (((hy)localObject4).tWW != null) {
          localObject1 = ((hy)localObject4).tWW.bNS();
        }
        ((List)localObject2).add(new com.tencent.mm.protocal.n(((hy)localObject4).type, ((hy)localObject4).tWV.bNS(), ((hy)localObject4).port, (String)localObject1));
        w.d("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo short type:%d port:%d ip:%s", new Object[] { Integer.valueOf(((hy)localObject4).type), Integer.valueOf(((hy)localObject4).port), ((hy)localObject4).tWV.bNS() });
      }
    }
    localObject2 = com.tencent.mm.protocal.n.ca((List)localObject2);
    Object localObject1 = new LinkedList();
    if (paramhz != null)
    {
      localObject3 = paramhz.tXa.iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (hy)((Iterator)localObject3).next();
        paramhz = "";
        if (((hy)localObject4).tWW != null) {
          paramhz = ((hy)localObject4).tWW.bNS();
        }
        ((List)localObject1).add(new com.tencent.mm.protocal.n(((hy)localObject4).type, ((hy)localObject4).tWV.bNS(), ((hy)localObject4).port, paramhz));
        w.d("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo long type:%d port:%d ip:%s", new Object[] { Integer.valueOf(((hy)localObject4).type), Integer.valueOf(((hy)localObject4).port), ((hy)localObject4).tWV.bNS() });
      }
    }
    Object localObject3 = com.tencent.mm.protocal.n.ca((List)localObject1);
    w.d("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo builtin ip long[%s] short[%s]", new Object[] { localObject3, localObject2 });
    h.xz();
    h.xy().fYL.set(2, localObject2);
    Object localObject4 = ab.getContext().getSharedPreferences("system_config_prefs", 0);
    ((SharedPreferences)localObject4).edit().putString("builtin_short_ips", (String)localObject2).commit();
    h.xz();
    h.xy().fYL.set(3, localObject3);
    if (paramapx != null)
    {
      h.xz();
      h.xy().fYL.set(6, paramapx.uFN);
      h.xz();
      h.xy().fYL.set(7, paramapx.uFO);
      if (paramapx.uFR != 0)
      {
        h.xz();
        paramhz = h.xy().fYL;
        if (paramapx.uFR > 60)
        {
          i = 60;
          paramhz.set(35, Integer.valueOf(i));
        }
      }
      else
      {
        ad.g(paramapx.uFP, paramapx.uFS);
      }
    }
    for (paramhz = com.tencent.mm.protocal.n.eN(paramapx.uFN, paramapx.uFO);; paramhz = null)
    {
      paramapx = "";
      localObject1 = "";
      String[] arrayOfString1 = new String[paramaho.jhd.size()];
      String[] arrayOfString2 = new String[paramaho.jhd.size()];
      int[] arrayOfInt = new int[paramaho.jhd.size()];
      w.d("MicroMsg.MMReqRespAuth", "hostlist.Count=%d", new Object[] { Integer.valueOf(paramaho.jhc) });
      Iterator localIterator = paramaho.jhd.iterator();
      i = 0;
      paramaho = (aho)localObject1;
      for (;;)
      {
        if (!localIterator.hasNext()) {
          break label1187;
        }
        localObject1 = (ahn)localIterator.next();
        w.d("MicroMsg.MMReqRespAuth", "dkidc host org:%s sub:%s", new Object[] { ((ahn)localObject1).uxb, ((ahn)localObject1).uxc });
        arrayOfString1[i] = ((ahn)localObject1).uxb;
        arrayOfString2[i] = ((ahn)localObject1).uxc;
        arrayOfInt[i] = ((ahn)localObject1).uxd;
        j = i + 1;
        i = j;
        if (!bg.nm(((ahn)localObject1).uxb))
        {
          i = j;
          if (!bg.nm(((ahn)localObject1).uxc))
          {
            if (((ahn)localObject1).uxb.equals("short.weixin.qq.com"))
            {
              h.xz();
              h.xy().fYL.set(24, ((ahn)localObject1).uxc);
              paramaho = ((ahn)localObject1).uxc;
              i = j;
              continue;
              i = paramapx.uFR;
              break;
            }
            if (((ahn)localObject1).uxb.equals("long.weixin.qq.com"))
            {
              h.xz();
              h.xy().fYL.set(25, ((ahn)localObject1).uxc);
              paramapx = ((ahn)localObject1).uxc;
              i = j;
            }
            else
            {
              i = j;
              if (((ahn)localObject1).uxb.equals("support.weixin.qq.com"))
              {
                i = j;
                if (!bg.nm(((ahn)localObject1).uxc))
                {
                  ((SharedPreferences)localObject4).edit().putString("support.weixin.qq.com", ((ahn)localObject1).uxc).commit();
                  i = j;
                }
              }
            }
          }
        }
      }
      label1187:
      h.xz();
      localObject1 = h.xx().fYr.gus;
      if ((arrayOfString1.length > 0) && (localObject1 != null)) {
        ((com.tencent.mm.network.e)localObject1).setHostInfo(arrayOfString1, arrayOfString2, arrayOfInt);
      }
      if (!bg.nm(paramapx))
      {
        h.xz();
        h.xy().fYL.set(25, paramapx);
      }
      if (!bg.nm(paramaho))
      {
        h.xz();
        h.xy().fYL.set(24, paramaho);
      }
      if ((localObject1 != null) && (paramhz != null)) {
        ((com.tencent.mm.network.e)localObject1).a(paramBoolean, (String)localObject2, (String)localObject3, paramhz.tKz, paramhz.tKA, paramhz.tKB, paramhz.tKC, paramaho, paramapx);
      }
      GMTrace.o(13483378737152L, 100459);
      return;
    }
  }
  
  public static int b(q paramq)
  {
    GMTrace.i(13484184043520L, 100465);
    Object localObject2 = (i.f)paramq.DC();
    i.g localg = (i.g)paramq.AZ();
    w.i("MicroMsg.MMReqRespAuth", "summerauth decodeAndRetriveAccInfo type:%d, hashcode:%d, ret:%d, stack[%s]", new Object[] { Integer.valueOf(((i.f)localObject2).Bb()), Integer.valueOf(paramq.hashCode()), Integer.valueOf(localg.tKe), bg.bQW() });
    int i;
    if (localg.tKe != 0)
    {
      w.d("MicroMsg.MMReqRespAuth", "summerauth decodeAndRetriveAccInfo resp just decoded and ret result:%d", new Object[] { Integer.valueOf(localg.tKe) });
      i = localg.tKe;
      GMTrace.o(13484184043520L, 100465);
      return i;
    }
    bki localbki = localg.tKc;
    int k = localbki.uVb;
    Object localObject1;
    int j;
    byte[] arrayOfByte;
    if ((k & 0x1) != 0)
    {
      localObject1 = localbki.uVc;
      j = ((du)localObject1).tSp;
      w.i("MicroMsg.MMReqRespAuth", "decodeAndRetriveAccInfo authResultFlag:%d UpdateFlag:%d ", new Object[] { Integer.valueOf(j), Integer.valueOf(((du)localObject1).tSo) });
      paramq = ((du)localObject1).tRZ;
      arrayOfByte = com.tencent.mm.platformtools.n.a(((du)localObject1).tSa);
      int m = paramq.tSB.uNN;
      int n = paramq.ugt;
      if (arrayOfByte == null)
      {
        i = -1;
        w.d("MicroMsg.MMReqRespAuth", "summerauth svr ecdh key len:%d, nid:%d sessionKey len:%d, sessionKey：%s", new Object[] { Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i), bg.SJ(bg.bp(arrayOfByte)) });
        localObject1 = com.tencent.mm.platformtools.n.a(paramq.tSB);
        localObject2 = ((i.f)localObject2).tKb;
        if (bg.bq((byte[])localObject1)) {
          break label641;
        }
        m = localObject1.length;
        Object localObject3 = bg.SJ(bg.bp((byte[])localObject1));
        if (localObject2 != null) {
          break label628;
        }
        i = -1;
        label321:
        w.d("MicroMsg.MMReqRespAuth", "summerauth svrPubKey len:%d value:%s prikey len:%d, values:%s", new Object[] { Integer.valueOf(m), localObject3, Integer.valueOf(i), bg.SJ(bg.bp((byte[])localObject2)) });
        localObject3 = new PByteArray();
        m = MMProtocalJni.computerKeyWithAllStr(paramq.ugt, (byte[])localObject1, (byte[])localObject2, (PByteArray)localObject3, 0);
        paramq = ((PByteArray)localObject3).value;
        if (paramq != null) {
          break label635;
        }
        i = -1;
        label401:
        w.i("MicroMsg.MMReqRespAuth", "summerauth ComputerKeyWithAllStr ret:%d, agreedECDHKey len: %d, values:%s", new Object[] { Integer.valueOf(m), Integer.valueOf(i), bg.SJ(bg.bp(paramq)) });
        label438:
        if (paramq == null) {
          break label668;
        }
        localObject1 = paramq;
        label445:
        localg.tKd = ((byte[])localObject1);
        if ((j & 0x4) == 0) {
          break label767;
        }
        w.d("MicroMsg.MMReqRespAuth", "summerauth must decode session key");
        if (bg.bq(paramq)) {
          break label728;
        }
        paramq = MMProtocalJni.aesDecrypt(arrayOfByte, paramq);
        if (arrayOfByte != null) {
          break label676;
        }
        i = -1;
        label487:
        localObject1 = bg.SJ(bg.bp(arrayOfByte));
        if (paramq != null) {
          break label683;
        }
        j = -1;
        label503:
        w.d("MicroMsg.MMReqRespAuth", "summerauth aesDecrypt sessionKey len:%d, value:%s, session len:%d, value:%s", new Object[] { Integer.valueOf(i), localObject1, Integer.valueOf(j), bg.SJ(bg.bp(paramq)) });
        if (bg.bq(paramq)) {
          break label689;
        }
        w.d("MicroMsg.MMReqRespAuth", "summerauth decode session key succ session:%s", new Object[] { bg.SJ(bg.bp(paramq)) });
        localg.aZ(paramq);
        localg.tKe = 1;
        label585:
        if ((k & 0x2) == 0) {
          break label830;
        }
        localg.hgh = localbki.uVd.jhi;
      }
    }
    for (;;)
    {
      i = localg.tKe;
      GMTrace.o(13484184043520L, 100465);
      return i;
      i = arrayOfByte.length;
      break;
      label628:
      i = localObject2.length;
      break label321;
      label635:
      i = paramq.length;
      break label401;
      label641:
      com.tencent.mm.plugin.report.d.oqe.a(148L, 24L, 1L, false);
      w.w("MicroMsg.MMReqRespAuth", "summerauth svr ecdh key is null!");
      paramq = null;
      break label438;
      label668:
      localObject1 = new byte[0];
      break label445;
      label676:
      i = arrayOfByte.length;
      break label487;
      label683:
      j = paramq.length;
      break label503;
      label689:
      com.tencent.mm.plugin.report.d.oqe.a(148L, 25L, 1L, false);
      w.d("MicroMsg.MMReqRespAuth", "summerauth decode session key failed ret null!");
      localg.aZ(new byte[0]);
      localg.tKe = 2;
      break label585;
      label728:
      com.tencent.mm.plugin.report.d.oqe.a(148L, 26L, 1L, false);
      w.d("MicroMsg.MMReqRespAuth", "summerauth decode session key failed as agreedECDHKey is null!");
      localg.aZ(new byte[0]);
      localg.tKe = 2;
      break label585;
      label767:
      com.tencent.mm.plugin.report.d.oqe.a(148L, 27L, 1L, false);
      w.d("MicroMsg.MMReqRespAuth", "summerauth not need decode session key");
      localg.aZ(arrayOfByte);
      localg.tKe = 1;
      break label585;
      w.d("MicroMsg.MMReqRespAuth", "summerauth auth sect not set so ret failed");
      localg.aZ(new byte[0]);
      localg.tKe = 2;
      break label585;
      label830:
      w.d("MicroMsg.MMReqRespAuth", "summerauth acct sect not set!");
    }
  }
  
  private q fu(int paramInt)
  {
    GMTrace.i(13482707648512L, 100454);
    w.i("MicroMsg.MMReqRespAuth", "summerauth autoAuthReq authReqFlag:%d, this:%d, stack:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(hashCode()), bg.bQW() });
    Object localObject6 = (i.f)DC();
    Object localObject5 = (i.g)this.gnu;
    Object localObject4 = av.AX();
    int i = ((SharedPreferences)localObject4).getInt("key_auth_update_version", 0);
    w.d("MicroMsg.MMReqRespAuth", "summerauth updateVersion:%d, clientVersion:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(com.tencent.mm.protocal.d.tJC) });
    long l;
    ep localep;
    if (i < com.tencent.mm.protocal.d.tJC)
    {
      if (this.gns == 702)
      {
        i = 12;
        ((k.d)localObject6).tKm = i;
        localObject1 = com.tencent.mm.plugin.report.d.oqe;
        if (this.gns != 702) {
          break label315;
        }
      }
      label315:
      for (l = 14L;; l = 13L)
      {
        ((com.tencent.mm.plugin.report.d)localObject1).a(148L, l, 1L, false);
        localep = new ep();
        localep.tTw = paramInt;
        localep.tSh = new azp().be(new byte[0]);
        localep.tSg = new azp().be(new byte[0]);
        localObject1 = new bqp();
        localep.tTu = ((bqp)localObject1);
        ((bqp)localObject1).tVf = "";
        ((bqp)localObject1).tVe = "";
        ((bqp)localObject1).vaA = "";
        localObject1 = new bub();
        localep.tTv = ((bub)localObject1);
        ((bub)localObject1).utG = "";
        ((bub)localObject1).utF = "";
        if (h.xw().wL()) {
          break label348;
        }
        w.e("MicroMsg.MMReqRespAuth", "autoAuthReq build autoauth Req  , failed  acc not ready");
        GMTrace.o(13482707648512L, 100454);
        return null;
        i = 16;
        break;
      }
    }
    if (this.gns == 702) {}
    for (i = 2;; i = 1)
    {
      ((k.d)localObject6).tKm = i;
      break;
    }
    label348:
    h.xz();
    Object localObject1 = bg.nl((String)h.xy().xh().get(2, null));
    h.xz();
    Object localObject7 = new o(bg.a((Integer)h.xy().xh().get(9, null), 0));
    if (bg.nm((String)localObject1)) {
      localObject1 = ((o)localObject7).toString();
    }
    for (;;)
    {
      h.xz();
      Object localObject2 = h.xw().fXT;
      l = ((o)localObject7).longValue();
      boolean bool;
      Object localObject3;
      if (this.gns == 701)
      {
        bool = true;
        localObject3 = ((v)localObject2).a(l, "", bool);
        if (localObject3 != null) {
          break label722;
        }
        paramInt = -1;
        label468:
        if (localObject3 != null) {
          break label729;
        }
        localObject2 = "null";
        label477:
        w.i("MicroMsg.MMReqRespAuth", "summerauth loginbuf username:%s, qq:%s, len:%d, content:[%s]", new Object[] { localObject1, localObject7, Integer.valueOf(paramInt), localObject2 });
        localObject7 = new azp();
        if (!bg.bq((byte[])localObject3)) {
          break label742;
        }
        localObject2 = new byte[0];
        localep.tTt = ((azp)localObject7).be((byte[])localObject2);
        if (this.gns != 702) {
          break label860;
        }
        localObject2 = (i.a)localObject6;
        localObject3 = (i.b)localObject5;
        localObject5 = new dx();
        localObject6 = new ea();
        ((i.a)localObject2).tJX.tSC = ((ea)localObject6);
        ((i.a)localObject2).tJX.tSD = ((dx)localObject5);
        localObject7 = bg.St(((SharedPreferences)localObject4).getString("_auth_key", ""));
        localObject4 = new dy();
        if (bg.bq((byte[])localObject7)) {
          break label782;
        }
        ((dx)localObject5).tSb = new azp().be((byte[])localObject7);
      }
      for (;;)
      {
        try
        {
          ((dy)localObject4).aD((byte[])localObject7);
          if (((dy)localObject4).tSA == null) {
            break label817;
          }
          ((ea)localObject6).tSE = ((dy)localObject4).tSA;
          ((dx)localObject5).tSu = localep;
          ((i.a)localObject2).username = ((String)localObject1);
          ((i.g)localObject3).hgh = ((String)localObject1);
          GMTrace.o(13482707648512L, 100454);
          return this;
          bool = false;
          break;
          label722:
          paramInt = localObject3.length;
          break label468;
          label729:
          localObject2 = bg.SJ(bg.bp((byte[])localObject3));
          break label477;
          label742:
          localObject2 = localObject3;
        }
        catch (IOException localIOException)
        {
          com.tencent.mm.plugin.report.d.oqe.a(148L, 15L, 1L, false);
          w.printErrStackTrace("MicroMsg.MMReqRespAuth", localIOException, "summerauthkey Failed parse autoauthkey buf", new Object[0]);
          continue;
        }
        label782:
        com.tencent.mm.plugin.report.d.oqe.a(148L, 16L, 1L, false);
        ((dx)localObject5).tSb = new azp().be(new byte[0]);
        continue;
        label817:
        com.tencent.mm.plugin.report.d.oqe.a(148L, 17L, 1L, false);
        ((ea)localObject6).tSE = new azp().be(new byte[0]);
        w.w("MicroMsg.MMReqRespAuth", "summerauthkey AesEncryptKey null!");
        continue;
        label860:
        localObject3 = (i.d)localObject6;
        localObject2 = new ani();
        localObject4 = new ang();
        ((i.d)localObject3).tJZ.uCi = ((ani)localObject2);
        ((i.d)localObject3).tJZ.uCj = ((ang)localObject4);
        ((ang)localObject4).uCh = 2;
        ((ang)localObject4).tSu = localep;
        ((ani)localObject2).jhi = ((String)localObject1);
        h.xz();
        localObject1 = bg.nl((String)h.xy().xh().get(3, null));
        h.xz();
        ((ani)localObject2).tUR = bg.nl((String)h.xy().xh().get(19, null));
        ((ani)localObject2).tVd = ((String)localObject1);
      }
    }
  }
  
  public final int AW()
  {
    GMTrace.i(13482841866240L, 100455);
    if (h.xw().wL())
    {
      h.xz();
      h.xw();
      int i = a.ww();
      GMTrace.o(13482841866240L, 100455);
      return i;
    }
    w.e("MicroMsg.MMReqRespAuth", "dkwt acc NOT Ready , the fucking MMReqRespBase need the fucking uin ???  if u find this log , fuck dk. %s", new Object[] { bg.bQW() });
    GMTrace.o(13482841866240L, 100455);
    return 0;
  }
  
  protected final k.d AY()
  {
    GMTrace.i(13483647172608L, 100461);
    i.f localf = this.gnt;
    GMTrace.o(13483647172608L, 100461);
    return localf;
  }
  
  public final k.e AZ()
  {
    GMTrace.i(15694884241408L, 116936);
    i.g localg = this.gnu;
    GMTrace.o(15694884241408L, 116936);
    return localg;
  }
  
  public final void a(i.f paramf, i.g paramg, int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(13483244519424L, 100458);
    if (!h.xw().wL())
    {
      w.e("MicroMsg.MMReqRespAuth", "summerauth onAutoAuthEnd but account not ready");
      GMTrace.o(13483244519424L, 100458);
      return;
    }
    bki localbki = paramg.tKc;
    w.i("MicroMsg.MMReqRespAuth", "summerauth onAutoAuthEnd errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      if ((paramInt1 == 4) && (paramInt2 == 65235))
      {
        com.tencent.mm.plugin.report.d.oqe.a(148L, 18L, 1L, false);
        w.d("MicroMsg.MMReqRespAuth", "dkidc onAutoAuthEnd RedirectIDC");
        if ((localbki != null) && (localbki.uVe != null))
        {
          a(true, paramg.tKc.uVe.tUT, paramg.tKc.uVe.tUU, paramg.tKc.uVe.tUS);
          GMTrace.o(13483244519424L, 100458);
          return;
        }
        w.w("MicroMsg.MMReqRespAuth", "dkidc onAutoAuthEnd RedirectIDC but NetworkSectResp is null");
      }
      GMTrace.o(13483244519424L, 100458);
      return;
    }
    if (gnv != null) {
      gnv.a(paramf, paramg);
    }
    GMTrace.o(13483244519424L, 100458);
  }
  
  public final q aJ(int paramInt1, int paramInt2)
  {
    GMTrace.i(13482976083968L, 100456);
    q localq = new au(paramInt1).fu(paramInt2);
    GMTrace.o(13482976083968L, 100456);
    return localq;
  }
  
  public final int getType()
  {
    GMTrace.i(13483915608064L, 100463);
    int i = this.gnt.Bb();
    GMTrace.o(13483915608064L, 100463);
    return i;
  }
  
  public final String getUri()
  {
    GMTrace.i(13484049825792L, 100464);
    String str = this.gnt.getUri();
    GMTrace.o(13484049825792L, 100464);
    return str;
  }
  
  public static abstract interface a
  {
    public abstract void a(i.f paramf, i.g paramg);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */