package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.ad.v;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.protocal.c.ap;
import com.tencent.mm.protocal.c.apz;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bki;
import com.tencent.mm.protocal.c.bqq;
import com.tencent.mm.protocal.c.du;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ba;
import com.tencent.mm.storage.s;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;

public final class y
{
  public static void a(bki parambki, boolean paramBoolean)
  {
    GMTrace.i(13156155916288L, 98021);
    int j = parambki.uVb;
    int i;
    label99:
    t localt;
    Object localObject1;
    long l;
    label247:
    label259:
    label654:
    boolean bool1;
    String str1;
    String str2;
    int k;
    Object localObject2;
    label810:
    label975:
    boolean bool2;
    if (parambki.uVc == null)
    {
      i = -1;
      w.i("MicroMsg.HandleAuthResponse", "summerauth updateProfile succ update:%d unifyFlag:%d, auth:%s, acct:%s, network:%s autoauth:%b", new Object[] { Integer.valueOf(i), Integer.valueOf(j), parambki.uVc, parambki.uVd, parambki.uVe, Boolean.valueOf(paramBoolean) });
      i = 0;
      if (((j & 0x1) == 0) || (parambki.uVc == null)) {
        break label1309;
      }
      i = parambki.uVc.kAW;
      h.xz();
      h.fh(i);
      localt = h.xy().xh();
      localt.set(256, Boolean.valueOf(false));
      if ((j & 0x1) != 0)
      {
        if (parambki.uVc.tSo <= 0) {
          break label1372;
        }
        localt.a(w.a.vpE, Long.valueOf(parambki.uVc.tSo));
        localt.a(w.a.vpG, Long.valueOf(bg.Pu()));
        localt.a(w.a.vpF, Long.valueOf(com.tencent.mm.protocal.d.tJC));
        w.i("MicroMsg.HandleAuthResponse", "summerauth updateProfile need update flag[%d], autoauth[%b]", new Object[] { Integer.valueOf(parambki.uVc.tSo), Boolean.valueOf(paramBoolean) });
        if (!paramBoolean) {
          break label1328;
        }
        localObject1 = com.tencent.mm.plugin.report.d.oqe;
        if (parambki.uVc.tSo != 2) {
          break label1320;
        }
        l = 19L;
        ((com.tencent.mm.plugin.report.d)localObject1).a(148L, l, 1L, true);
      }
      if ((j & 0x2) == 0) {
        break label1420;
      }
      localObject1 = parambki.uVd;
      w.i("MicroMsg.HandleAuthResponse", "summerauth updateProfile acctsect BindUin:%s, Status:%d, UserName:%s, NickName:%s, BindEmail:%s, BindMobile:%s, Alias:%s, PluginFlag:%d, RegType:%d, DeviceInfoXml:%s, SafeDevice:%d, OfficialUserName:%s, OfficialUserName:%s PushMailStatus:%d, FSURL:%s", new Object[] { o.getString(((ap)localObject1).tOs), Integer.valueOf(((ap)localObject1).jhA), ((ap)localObject1).jhi, ((ap)localObject1).jio, ((ap)localObject1).tOt, ((ap)localObject1).tOu, ((ap)localObject1).gCC, Integer.valueOf(((ap)localObject1).tOv), Integer.valueOf(((ap)localObject1).tOw), ((ap)localObject1).tOx, Integer.valueOf(((ap)localObject1).tOy), ((ap)localObject1).tOz, ((ap)localObject1).tOz, Integer.valueOf(((ap)localObject1).tOB), ((ap)localObject1).tOC });
      if (!paramBoolean) {
        localt.set(52, Integer.valueOf(((ap)localObject1).tOw));
      }
      localt.set(9, Integer.valueOf(((ap)localObject1).tOs));
      localt.set(7, Integer.valueOf(((ap)localObject1).jhA));
      localt.set(2, ((ap)localObject1).jhi);
      localt.set(4, ((ap)localObject1).jio);
      localt.set(5, ((ap)localObject1).tOt);
      localt.set(6, ((ap)localObject1).tOu);
      localt.set(42, ((ap)localObject1).gCC);
      localt.set(34, Integer.valueOf(((ap)localObject1).tOv));
      h.xy().xi().Uz(((ap)localObject1).tOx);
      localt.set(64, Integer.valueOf(((ap)localObject1).tOy));
      localt.set(21, ((ap)localObject1).tOz);
      localt.set(22, ((ap)localObject1).tOz);
      localt.set(17, Integer.valueOf(((ap)localObject1).tOB));
      as.gnb.M("login_weixin_username", ((ap)localObject1).jhi);
      as.gnb.c(((ap)localObject1).tOu, ((ap)localObject1).tOs, ((ap)localObject1).tOt);
      bool1 = false;
      if ((j & 0x1) == 0) {
        break label1574;
      }
      localObject1 = parambki.uVc;
      str1 = ((du)localObject1).tSi;
      str2 = bg.bs(com.tencent.mm.platformtools.n.a(((du)localObject1).tSj));
      w.i("MicroMsg.HandleAuthResponse", "summerauth updateProfile AuthTicket:%s, NewVersion:%d, UpdateFlag:%d, AuthResultFlag:%d, authKey:%s a2Key:%s fsurl:%s", new Object[] { ((du)localObject1).tSm, Integer.valueOf(((du)localObject1).tSn), Integer.valueOf(((du)localObject1).tSo), Integer.valueOf(((du)localObject1).tSp), bg.SJ(str1), bg.SJ(str2), ((du)localObject1).tOC });
      k = ((du)localObject1).tSc;
      localObject2 = new o(bg.e((Integer)localt.get(9, Integer.valueOf(0))));
      if (((du)localObject1).tSd != null) {
        break label1431;
      }
      i = -1;
      w.i("MicroMsg.HandleAuthResponse", "summerauth updateProfile wtBuffFlag:%d, bindQQ:%s buff len:%d", new Object[] { Integer.valueOf(k), localObject2, Integer.valueOf(i) });
      if (k == 0) {
        break label1562;
      }
      if (k != 1) {
        break label1443;
      }
      com.tencent.mm.plugin.report.d.oqe.a(148L, 20L, 1L, false);
      byte[] arrayOfByte = com.tencent.mm.platformtools.n.a(((du)localObject1).tSd);
      bool1 = h.xw().fXT.a(((o)localObject2).longValue(), arrayOfByte);
      w.i("MicroMsg.HandleAuthResponse", "WTLoginRspBuff len %s", new Object[] { Integer.valueOf(arrayOfByte.length) });
      localObject2 = bg.bs(h.xw().fXT.Z(((o)localObject2).longValue()));
      localt.set(-1535680990, str1);
      localt.set(46, str2);
      localt.set(72, localObject2);
      localt.set(29, ((du)localObject1).tOC);
      w.i("MicroMsg.HandleAuthResponse", "wtBuffFlag %s", new Object[] { Integer.valueOf(k) });
      if (((du)localObject1).tSe != null)
      {
        str1 = bg.bs(com.tencent.mm.platformtools.n.a(((du)localObject1).tSe.tVi));
        if ((str1 != null) && (str1.length() > 0))
        {
          localt.set(47, str1);
          h.xy().fYL.set(18, str1);
        }
        w.i("MicroMsg.HandleAuthResponse", "updateProfile ksid:%s", new Object[] { bg.SJ(str1) });
      }
      i = ((du)localObject1).tSq;
      w.i("MicroMsg.HandleAuthResponse", "summerauth mmtls:%d", new Object[] { Integer.valueOf(i) });
      h.xy().fYL.set(47, Integer.valueOf(i));
      localObject1 = h.xx().fYr.gus;
      if (localObject1 != null)
      {
        if ((i & 0x1) != 0) {
          break label1568;
        }
        bool2 = true;
        label1139:
        ((com.tencent.mm.network.e)localObject1).bp(bool2);
      }
      label1148:
      if ((j & 0x4) == 0) {
        break label1599;
      }
      com.tencent.mm.plugin.report.d.oqe.a(148L, 23L, 1L, false);
      parambki = parambki.uVe;
      au.a(false, parambki.tUT, parambki.tUU, parambki.tUS);
    }
    for (;;)
    {
      if (paramBoolean)
      {
        i = 4;
        parambki = q.zE();
        if (bool1)
        {
          i = 1;
          parambki = q.zD();
        }
        w.i("MicroMsg.HandleAuthResponse", "loginType %s", new Object[] { Integer.valueOf(i) });
        com.tencent.mm.plugin.report.b.d.p(1, i, parambki);
      }
      localt.set(3, "");
      localt.set(19, "");
      localt.kL(true);
      h.xy().fYL.setInt(46, 0);
      a.yC();
      GMTrace.o(13156155916288L, 98021);
      return;
      i = parambki.uVc.tSo;
      break;
      label1309:
      w.w("MicroMsg.HandleAuthResponse", "summerauth updateProfile authsect not set and new uin is 0!");
      break label99;
      label1320:
      l = 41L;
      break label247;
      label1328:
      localObject1 = com.tencent.mm.plugin.report.d.oqe;
      if (parambki.uVc.tSo == 2) {}
      for (l = 10L;; l = 11L)
      {
        ((com.tencent.mm.plugin.report.d)localObject1).a(148L, l, 1L, true);
        break;
      }
      label1372:
      localt.a(w.a.vpE, Long.valueOf(parambki.uVc.tSo));
      localt.a(w.a.vpG, Long.valueOf(bg.Pu()));
      localt.a(w.a.vpF, Long.valueOf(0L));
      break label259;
      label1420:
      w.w("MicroMsg.HandleAuthResponse", "summerauth updateProfile acctsect not set!");
      break label654;
      label1431:
      i = ((du)localObject1).tSd.uNN;
      break label810;
      label1443:
      if (k == 2)
      {
        com.tencent.mm.plugin.report.d.oqe.a(148L, 21L, 1L, false);
        h.xw().fXT.aa(((o)localObject2).longValue());
        localObject2 = bg.bs(h.xw().fXT.Z(((o)localObject2).longValue()));
        localt.set(-1535680990, str1);
        localt.set(46, str2);
        localt.set(72, localObject2);
        localt.set(29, ((du)localObject1).tOC);
        bool1 = false;
        break label975;
      }
      w.i("MicroMsg.HandleAuthResponse", "summerauth undefined wrBuffFlag[%d]", new Object[] { Integer.valueOf(k) });
      label1562:
      bool1 = false;
      break label975;
      label1568:
      bool2 = false;
      break label1139;
      label1574:
      w.w("MicroMsg.HandleAuthResponse", "summerauth updateProfile authsect not set!");
      com.tencent.mm.plugin.report.d.oqe.a(148L, 22L, 1L, false);
      break label1148;
      label1599:
      w.w("MicroMsg.HandleAuthResponse", "summerauth updateProfile networksect not set!");
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */