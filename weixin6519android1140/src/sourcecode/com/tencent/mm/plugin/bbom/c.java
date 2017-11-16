package com.tencent.mm.plugin.bbom;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.af.d.b;
import com.tencent.mm.bc.j;
import com.tencent.mm.bc.l;
import com.tencent.mm.g.a.ep;
import com.tencent.mm.g.a.gx;
import com.tencent.mm.g.a.io;
import com.tencent.mm.g.a.io.a;
import com.tencent.mm.g.a.jh;
import com.tencent.mm.g.a.js;
import com.tencent.mm.g.a.ra;
import com.tencent.mm.g.a.rb;
import com.tencent.mm.g.a.rb.b;
import com.tencent.mm.g.a.rf;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.b;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.g;
import com.tencent.mm.pluginsdk.p.m;
import com.tencent.mm.pluginsdk.p.p;
import com.tencent.mm.pluginsdk.p.r;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.aos;
import com.tencent.mm.protocal.c.aot;
import com.tencent.mm.protocal.c.apf;
import com.tencent.mm.protocal.c.atp;
import com.tencent.mm.protocal.c.atq;
import com.tencent.mm.protocal.c.bgm;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.lg;
import com.tencent.mm.protocal.c.oo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.as.b;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.bb;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.m;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;
import org.json.JSONObject;

public final class c
  implements com.tencent.mm.ad.e, com.tencent.mm.plugin.messenger.foundation.a.b
{
  public c()
  {
    GMTrace.i(8028099182592L, 59814);
    GMTrace.o(8028099182592L, 59814);
  }
  
  private static void a(aos paramaos, String paramString, com.tencent.mm.storage.x paramx, boolean paramBoolean)
  {
    GMTrace.i(8028501835776L, 59817);
    Object localObject = q.zE();
    if ((localObject != null) && (!((String)localObject).equals(paramString)))
    {
      localObject = com.tencent.mm.af.x.FG().iC(paramString);
      ((com.tencent.mm.af.d)localObject).field_username = paramString;
      ((com.tencent.mm.af.d)localObject).field_brandList = paramaos.gCH;
      paramaos = paramaos.uAC;
      if (paramaos != null)
      {
        ((com.tencent.mm.af.d)localObject).field_brandFlag = paramaos.gCL;
        ((com.tencent.mm.af.d)localObject).field_brandInfo = paramaos.gCN;
        ((com.tencent.mm.af.d)localObject).field_brandIconURL = paramaos.gCO;
        ((com.tencent.mm.af.d)localObject).field_extInfo = paramaos.gCM;
        if (paramBoolean)
        {
          ((com.tencent.mm.af.d)localObject).field_attrSyncVersion = null;
          ((com.tencent.mm.af.d)localObject).field_incrementUpdateTime = 0L;
          w.i("MicroMsg.BigBallContactAssemblerImpl", "Reset biz(%s) Attribute syncVersion and incUpdateTime.", new Object[] { paramString });
        }
        if (!bg.nm(((com.tencent.mm.af.d)localObject).field_extInfo)) {
          ((com.tencent.mm.af.d)localObject).bq(true);
        }
      }
      if ((((com.tencent.mm.af.d)localObject).bq(false) != null) && (((com.tencent.mm.af.d)localObject).bq(false).Fd() == 3) && (((com.tencent.mm.af.d)localObject).bq(false).Fh() != null) && (!bg.nm(((com.tencent.mm.af.d)localObject).EN())))
      {
        ((com.tencent.mm.af.d)localObject).field_enterpriseFather = ((com.tencent.mm.af.d)localObject).EN();
        w.d("MicroMsg.BigBallContactAssemblerImpl", "saveBizInfo, %s set enterpriseFather %s", new Object[] { paramString, ((com.tencent.mm.af.d)localObject).field_enterpriseFather });
      }
      if (!com.tencent.mm.af.x.FG().e((com.tencent.mm.af.d)localObject)) {
        com.tencent.mm.af.x.FG().d((com.tencent.mm.af.d)localObject);
      }
      paramx.dw(((com.tencent.mm.af.d)localObject).field_type);
    }
    GMTrace.o(8028501835776L, 59817);
  }
  
  public static boolean a(com.tencent.mm.storage.x paramx, aos paramaos, boolean paramBoolean)
  {
    GMTrace.i(8028636053504L, 59818);
    if ((paramx == null) || (bg.nm(paramx.field_username)))
    {
      w.e("MicroMsg.BigBallContactAssemblerImpl", "dkinit dealModContactExtInfo failed invalid contact");
      GMTrace.o(8028636053504L, 59818);
      return false;
    }
    String str1 = paramx.field_username;
    Object localObject1 = paramx.field_encryptUsername;
    Object localObject2 = com.tencent.mm.ac.b.a(str1, paramaos);
    com.tencent.mm.ac.n.Di().a((com.tencent.mm.ac.h)localObject2);
    localObject2 = paramaos.uAB;
    if ((!paramx.field_username.endsWith("@chatroom")) && (localObject2 != null))
    {
      w.i("MicroMsg.BigBallContactAssemblerImpl", "SnsFlag modcontact " + ((bgm)localObject2).gCI + " " + paramaos.ufy);
      w.i("MicroMsg.BigBallContactAssemblerImpl", "SnsBg modcontact " + ((bgm)localObject2).gCJ);
      w.i("MicroMsg.BigBallContactAssemblerImpl", "SnsBgId modcontact " + ((bgm)localObject2).gCK);
      w.i("MicroMsg.BigBallContactAssemblerImpl", "SnsBgId modcontact " + ((bgm)localObject2).uSi);
      if (com.tencent.mm.plugin.sns.b.n.poP != null) {
        com.tencent.mm.plugin.sns.b.n.poP.a(paramx.field_username, (bgm)localObject2);
      }
    }
    boolean bool;
    if (com.tencent.mm.l.a.eE(paramx.field_type))
    {
      bool = l.ML().J(str1, 1);
      if (bool)
      {
        w.d("MicroMsg.BigBallContactAssemblerImpl", "fmsgConversation updateState succ, user = " + str1);
        w.i("MicroMsg.BigBallContactAssemblerImpl", "processModContact, update state(ADDED) FMessageConversation, ret = " + bool);
      }
    }
    else if ((com.tencent.mm.l.a.eE(paramx.field_type)) && ((paramx.getSource() == 10) || (paramx.getSource() == 13)))
    {
      localObject1 = ab.getContext();
      localObject2 = paramx.field_username;
      String str2 = paramx.field_encryptUsername;
      if (!com.tencent.mm.modelsimple.d.bn((Context)localObject1)) {
        break label504;
      }
      com.tencent.mm.sdk.f.e.b(new com.tencent.mm.modelsimple.b((Context)localObject1, com.tencent.mm.modelsimple.d.bp((Context)localObject1), (String)localObject2, str2), "MMAccountManager_updateSpecifiedContact").start();
    }
    for (;;)
    {
      localObject1 = com.tencent.mm.modelfriend.af.If().jJ(paramx.field_encryptUsername);
      if ((localObject1 != null) && (!bg.nm(((com.tencent.mm.modelfriend.b)localObject1).gCw)))
      {
        ((com.tencent.mm.modelfriend.b)localObject1).username = paramx.field_username;
        int i = com.tencent.mm.modelfriend.af.If().a(((com.tencent.mm.modelfriend.b)localObject1).gCw, (com.tencent.mm.modelfriend.b)localObject1);
        w.d("MicroMsg.BigBallContactAssemblerImpl", "account sync: update addr " + i);
      }
      a(paramaos, str1, paramx, paramBoolean);
      GMTrace.o(8028636053504L, 59818);
      return true;
      bool = l.ML().J((String)localObject1, 1);
      w.d("MicroMsg.BigBallContactAssemblerImpl", "fmsgConversation updateState succ, encryptUser = " + (String)localObject1);
      break;
      label504:
      com.tencent.mm.modelsimple.d.A((Context)localObject1, null);
      w.d("MicroMsg.MMAccountManager", "no account added or not current account");
    }
  }
  
  private static boolean a(com.tencent.mm.storage.x paramx, bb parambb)
  {
    GMTrace.i(8028770271232L, 59819);
    boolean bool2 = false;
    if (!bg.nm(parambb.field_conDescription)) {
      paramx.cF(parambb.field_conDescription);
    }
    boolean bool1 = bool2;
    if (!s.fB(paramx.field_username))
    {
      bool1 = bool2;
      if (com.tencent.mm.l.a.eE(paramx.field_type))
      {
        bool2 = true;
        bool1 = bool2;
        if (!bg.nm(parambb.field_conDescription))
        {
          aot localaot = new aot();
          localaot.uEJ = paramx.field_username;
          localaot.lPj = parambb.field_conDescription;
          at.AR();
          com.tencent.mm.y.c.yJ().b(new e.a(54, localaot));
          bool1 = bool2;
        }
      }
    }
    GMTrace.o(8028770271232L, 59819);
    return bool1;
  }
  
  private static void aE(String paramString, int paramInt)
  {
    GMTrace.i(8029038706688L, 59821);
    j[] arrayOfj;
    Object localObject1;
    com.tencent.mm.bc.f[] arrayOff;
    com.tencent.mm.bc.h[] arrayOfh;
    if ((paramInt == 26) || (paramInt == 27) || (paramInt == 28) || (paramInt == 29))
    {
      w.d("MicroMsg.BigBallContactAssemblerImpl", "initAddContent, scene is shake");
      arrayOfj = l.MN().lX(paramString);
      localObject1 = com.tencent.mm.pluginsdk.ui.preference.b.a(ab.getContext(), arrayOfj);
      arrayOff = null;
      arrayOfh = null;
    }
    while (localObject1 == null)
    {
      GMTrace.o(8029038706688L, 59821);
      return;
      if (paramInt == 18)
      {
        w.d("MicroMsg.BigBallContactAssemblerImpl", "initAddContent, scene is lbs");
        arrayOfh = l.MM().lS(paramString);
        localObject1 = com.tencent.mm.pluginsdk.ui.preference.b.a(ab.getContext(), arrayOfh);
        arrayOfj = null;
        arrayOff = null;
      }
      else
      {
        arrayOff = l.MK().lN(paramString);
        localObject1 = com.tencent.mm.pluginsdk.ui.preference.b.a(ab.getContext(), arrayOff);
        arrayOfj = null;
        arrayOfh = null;
      }
    }
    paramInt = 0;
    int k = localObject1.length;
    int i = 0;
    Object localObject2;
    au localau;
    int m;
    int j;
    if (i < k)
    {
      localObject2 = localObject1[i];
      localau = new au();
      localau.setContent(((com.tencent.mm.pluginsdk.ui.preference.b)localObject2).glz);
      m = s.go(((com.tencent.mm.pluginsdk.ui.preference.b)localObject2).username);
      if (arrayOff != null)
      {
        j = paramInt + 1;
        localau.E(arrayOff[paramInt].field_createTime);
        paramInt = j;
      }
    }
    label224:
    label261:
    label400:
    label564:
    for (;;)
    {
      localau.db(((com.tencent.mm.pluginsdk.ui.preference.b)localObject2).username);
      localau.setType(m);
      long l;
      if (((com.tencent.mm.pluginsdk.ui.preference.b)localObject2).eYr)
      {
        localau.dB(2);
        localau.dC(1);
        at.AR();
        l = com.tencent.mm.y.c.yM().P(localau);
        if (l == -1L) {
          break label400;
        }
      }
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue(bool);
        w.i("MicroMsg.BigBallContactAssemblerImpl", "new msg inserted to db , local id = " + l);
        i += 1;
        break;
        if (arrayOfh != null)
        {
          j = paramInt + 1;
          localau.E(arrayOfh[paramInt].field_createtime * 1000L);
          paramInt = j;
          break label224;
        }
        if (arrayOfj == null) {
          break label564;
        }
        j = paramInt + 1;
        localau.E(arrayOfj[paramInt].field_createtime * 1000L);
        paramInt = j;
        break label224;
        localau.dB(6);
        localau.dC(0);
        break label261;
      }
      localObject1 = new au();
      if (arrayOff != null) {
        ((au)localObject1).E(arrayOff[(arrayOff.length - 1)].field_createTime + 1L);
      }
      for (;;)
      {
        ((au)localObject1).db(paramString);
        ((au)localObject1).setContent(ab.getContext().getString(R.l.eeM));
        ((au)localObject1).setType(10000);
        ((au)localObject1).dB(6);
        ((au)localObject1).dC(0);
        at.AR();
        com.tencent.mm.y.c.yM().P((au)localObject1);
        GMTrace.o(8029038706688L, 59821);
        return;
        if (arrayOfh != null) {
          ((au)localObject1).E(arrayOfh[(arrayOfh.length - 1)].field_createtime * 1000L + 1L);
        } else if (arrayOfj != null) {
          ((au)localObject1).E(arrayOfj[(arrayOfj.length - 1)].field_createtime * 1000L + 1L);
        }
      }
    }
  }
  
  private static void z(com.tencent.mm.storage.x paramx)
  {
    GMTrace.i(8028904488960L, 59820);
    if ((paramx != null) && (com.tencent.mm.af.f.iO(paramx.field_username)) && (!com.tencent.mm.af.f.dL(paramx.field_username)))
    {
      at.AR();
      ae localae = com.tencent.mm.y.c.yP().TO(paramx.field_username);
      paramx = com.tencent.mm.af.x.FG().iC(paramx.field_username);
      if (!com.tencent.mm.af.f.iR(paramx.field_username))
      {
        GMTrace.o(8028904488960L, 59820);
        return;
      }
      if (localae == null)
      {
        localae = new ae(paramx.field_username);
        w.i("MicroMsg.BigBallContactAssemblerImpl", "Enterprise belong %s, userName: %s", new Object[] { paramx.EN(), paramx.field_username });
        localae.cQ(bg.nl(paramx.EN()));
        localae.bSW();
        at.AR();
        com.tencent.mm.y.c.yP().d(localae);
      }
    }
    GMTrace.o(8028904488960L, 59820);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(16877342425088L, 125746);
    w.i("MicroMsg.BigBallContactAssemblerImpl", "onsceneEnd errType:%d,errCode:%d,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (paramk.getType() != 681)
    {
      GMTrace.o(16877342425088L, 125746);
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      GMTrace.o(16877342425088L, 125746);
      return;
    }
    if (!com.tencent.mm.kernel.h.xw().fYg)
    {
      w.w("MicroMsg.BigBallContactAssemblerImpl", "initialize notify is not done.");
      GMTrace.o(16877342425088L, 125746);
      return;
    }
    paramk = ((com.tencent.mm.av.a)paramk).gPj;
    paramString = new HashSet();
    try
    {
      paramk = paramk.iterator();
      while (paramk.hasNext())
      {
        localb = (e.b)paramk.next();
        if (localb.getCmdId() != 2) {
          break label263;
        }
        paramString.add(com.tencent.mm.platformtools.n.a(((aos)new aos().aD(localb.getBuffer())).ufy));
      }
    }
    catch (Exception paramk)
    {
      for (;;)
      {
        e.b localb;
        w.printErrStackTrace("MicroMsg.BigBallContactAssemblerImpl", paramk, "BaseProtoBuf parseFrom error!", new Object[0]);
        paramString = paramString.iterator();
        while (paramString.hasNext())
        {
          paramk = (String)paramString.next();
          if (!bg.nm(paramk)) {
            ak.a.gmX.a(paramk, null, null);
          }
        }
        label263:
        if (localb.getCmdId() == 54) {
          paramString.add(((aot)new aot().aD(localb.getBuffer())).uEJ);
        } else if (localb.getCmdId() == 60) {
          paramString.add(((apf)new apf().aD(localb.getBuffer())).uEJ);
        }
      }
      GMTrace.o(16877342425088L, 125746);
    }
  }
  
  public final void a(com.tencent.mm.storage.x paramx1, com.tencent.mm.storage.x paramx2, aos paramaos, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    GMTrace.i(8028233400320L, 59815);
    String str1 = paramx1.field_username;
    Object localObject1 = paramx1.field_encryptUsername;
    if ((paramx2 != null) && (!bg.nl(paramx2.fju).equals(bg.nl(paramaos.uEE))))
    {
      com.tencent.mm.ay.c.Kn();
      com.tencent.mm.ay.c.kH(str1);
    }
    if (!bg.bq(paramArrayOfByte))
    {
      if (com.tencent.mm.storage.x.At(paramx1.field_verifyFlag)) {
        a(paramaos, str1, paramx1, true);
      }
      if ((paramx2 == null) || (com.tencent.mm.l.a.eE(paramx2.field_type)) || (!com.tencent.mm.l.a.eE(paramx1.field_type))) {
        break label1704;
      }
    }
    label283:
    label801:
    label1161:
    label1167:
    label1434:
    label1659:
    label1704:
    for (int j = 1;; j = 0)
    {
      Object localObject2 = paramx1.field_username;
      if (paramaos.uEF == null) {}
      Object localObject3;
      for (paramArrayOfByte = "";; paramArrayOfByte = Integer.valueOf(bg.e(Integer.valueOf(paramaos.uEF.uJi.size()))))
      {
        w.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s PhoneNumList size:%s", new Object[] { localObject2, paramArrayOfByte });
        localObject2 = new StringBuffer();
        if ((paramaos.uEF == null) || (paramaos.uEF.uJi == null)) {
          break label283;
        }
        paramArrayOfByte = paramaos.uEF.uJi.iterator();
        while (paramArrayOfByte.hasNext())
        {
          localObject3 = (atp)paramArrayOfByte.next();
          if (((atp)localObject3).uJh != null) {
            ((StringBuffer)localObject2).append(((atp)localObject3).uJh + ",");
          }
        }
        a(paramx1, paramaos, true);
        break;
      }
      w.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s, phoneList %s", new Object[] { paramx1.field_username, ((StringBuffer)localObject2).toString() });
      paramArrayOfByte = null;
      if (paramx2 != null) {
        paramArrayOfByte = paramx2.fjz;
      }
      if (paramArrayOfByte != null)
      {
        paramx2 = paramArrayOfByte;
        if (!paramArrayOfByte.equals("")) {}
      }
      else
      {
        at.AR();
        localObject3 = com.tencent.mm.y.c.yL().CC((String)localObject1);
        paramx2 = paramArrayOfByte;
        if (localObject3 != null) {
          paramx2 = ((bb)localObject3).field_conPhone;
        }
      }
      w.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s, oldPhoneList %s", new Object[] { paramx1.field_username, bg.nl(paramx2) });
      int i;
      if (!bg.nm(paramx2))
      {
        paramx2 = paramx2.split(",");
        int i2 = paramx2.length;
        int k = 0;
        i = 0;
        int i1;
        for (int m = 0; k < i2; m = i1)
        {
          paramArrayOfByte = paramx2[k];
          int n = i;
          i1 = m;
          if (!bg.nm(((StringBuffer)localObject2).toString()))
          {
            localObject3 = ((StringBuffer)localObject2).toString().split(",");
            i1 = localObject3.length;
            n = 0;
            while (n < i1) {
              if (!paramArrayOfByte.equals(localObject3[n]))
              {
                n += 1;
                i = 1;
              }
              else
              {
                i = 0;
              }
            }
            n = i;
            i1 = m;
            if (i != 0)
            {
              ((StringBuffer)localObject2).append(paramArrayOfByte);
              i1 = 1;
              n = i;
            }
          }
          k += 1;
          i = n;
        }
        if (m != 0)
        {
          paramx2 = new apf();
          paramx2.uEJ = paramx1.field_username;
          paramArrayOfByte = new atq();
          if (!bg.nm(((StringBuffer)localObject2).toString()))
          {
            localObject3 = ((StringBuffer)localObject2).toString().split(",");
            paramArrayOfByte.jhc = localObject3.length;
            paramArrayOfByte.uJi = new LinkedList();
            k = localObject3.length;
            i = 0;
            while (i < k)
            {
              String str2 = localObject3[i];
              atp localatp = new atp();
              localatp.uJh = str2;
              paramArrayOfByte.uJi.add(localatp);
              i += 1;
            }
            paramx2.uEF = paramArrayOfByte;
            at.AR();
            com.tencent.mm.y.c.yJ().b(new e.a(60, paramx2));
          }
        }
        if ((j != 0) && (15 == paramaos.tQP) && (!bg.nm(paramx1.field_username)))
        {
          paramx2 = com.tencent.mm.modelfriend.af.If().jJ(paramx1.field_username);
          if (paramx2 != null)
          {
            paramArrayOfByte = com.tencent.mm.plugin.report.service.g.ork;
            localObject3 = paramx1.field_username;
            if (!bg.nm(paramx2.GS())) {
              break label1161;
            }
            i = 0;
            if (((StringBuffer)localObject2).toString().split(",").length < 5) {
              break label1167;
            }
            j = 5;
            paramArrayOfByte.i(12040, new Object[] { localObject3, Integer.valueOf(3), Integer.valueOf(i), Integer.valueOf(j) });
          }
        }
      }
      w.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s, phoneList %s", new Object[] { paramx1.field_username, ((StringBuffer)localObject2).toString() });
      paramx2 = ((StringBuffer)localObject2).toString();
      if (!bg.nm(paramx2))
      {
        w.i("MicroMsg.BigBallContactAssemblerImpl", paramx2);
        paramx1.cL(paramx2);
      }
      if ((!s.eb(str1)) && (paramaos.upV != null)) {
        m.a(str1, paramaos.upV);
      }
      boolean bool1 = false;
      at.AR();
      paramArrayOfByte = com.tencent.mm.y.c.yL().CC(paramx1.field_username);
      if (!bg.nm(paramx1.field_conRemark)) {
        if ((paramArrayOfByte != null) && (!bg.nm(paramx1.fjt)) && (!paramx1.fjt.equals(paramArrayOfByte.field_conDescription))) {
          a(paramx1, paramArrayOfByte);
        }
      }
      for (bool1 = false;; bool1 = paramBoolean)
      {
        w.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s needModContact %s encryptUser:%s", new Object[] { paramx1.field_username, Boolean.valueOf(bool1), localObject1 });
        if (bool1) {
          s.u(paramx1);
        }
        paramx2 = null;
        at.AR();
        paramArrayOfByte = com.tencent.mm.y.c.yL().CC(paramx1.field_encryptUsername);
        if (paramArrayOfByte != null) {
          paramx2 = paramArrayOfByte.field_contactLabels;
        }
        paramaos = paramx2;
        if (bg.nm(paramx2))
        {
          at.AR();
          localObject1 = com.tencent.mm.y.c.yL().CC(paramx1.field_username);
          paramaos = paramx2;
          paramArrayOfByte = (byte[])localObject1;
          if (localObject1 != null)
          {
            paramaos = ((bb)localObject1).field_contactLabels;
            paramArrayOfByte = (byte[])localObject1;
          }
        }
        if (!bg.nm(paramaos))
        {
          com.tencent.mm.plugin.label.a.a.aJP().cJ(paramx1.field_username, paramaos);
          paramArrayOfByte.field_contactLabels = "";
          at.AR();
          com.tencent.mm.y.c.yL().a(paramArrayOfByte);
        }
        GMTrace.o(8028233400320L, 59815);
        return;
        i = 1;
        break;
        j = ((StringBuffer)localObject2).toString().split(",").length;
        break label801;
        if (paramArrayOfByte != null)
        {
          paramx2 = paramArrayOfByte;
          if (!bg.nm(paramArrayOfByte.field_encryptUsername)) {}
        }
        else
        {
          paramx2 = paramArrayOfByte;
          if (!bg.nm((String)localObject1))
          {
            at.AR();
            paramx2 = com.tencent.mm.y.c.yL().CC((String)localObject1);
          }
        }
        paramBoolean = bool1;
        if (paramx2 != null)
        {
          paramBoolean = bool1;
          if (!bg.nm(paramx2.field_encryptUsername))
          {
            w.i("MicroMsg.BigBallContactAssemblerImpl", "mod stranger remark : " + paramx2.field_encryptUsername);
            paramx1.cj(paramx2.field_conRemark);
            paramx1.cp(com.tencent.mm.platformtools.c.nb(paramx2.field_conRemark));
            paramx1.cq(com.tencent.mm.platformtools.c.nc(paramx2.field_conRemark));
            paramBoolean = a(paramx1, paramx2);
          }
        }
        switch (paramx1.getSource())
        {
        }
      }
      paramx2 = null;
      if ((paramaos != null) && (!bg.nm(paramaos.uEx)))
      {
        w.i("MicroMsg.BigBallContactAssemblerImpl", "MobileHash[%s],MobileFullHash[%s]", new Object[] { paramaos.uEx, paramaos.uEy });
        paramArrayOfByte = com.tencent.mm.modelfriend.af.If();
        paramx2 = paramaos.uEx;
        str1 = paramaos.uEy;
        paramaos = paramArrayOfByte.jK(paramx2);
        paramx2 = paramaos;
        if (paramaos == null) {
          paramx2 = paramArrayOfByte.jK(str1);
        }
        if (paramx2 != null) {
          break label1659;
        }
        w.i("MicroMsg.BigBallContactAssemblerImpl", "dealWithRemark-> addr == null");
      }
      for (;;)
      {
        bool1 = paramBoolean;
        if (paramx2 == null) {
          break;
        }
        bool1 = paramBoolean;
        if (bg.nm(paramx2.GU())) {
          break;
        }
        bool1 = paramBoolean;
        if (!paramx2.Hd()) {
          break;
        }
        w.i("MicroMsg.BigBallContactAssemblerImpl", "remarkName RealName[%s], User[%s], remarkChange[%s]", new Object[] { paramx2.GU(), paramx2.getUsername(), Boolean.valueOf(paramBoolean) });
        paramx2.username = paramx1.field_username;
        paramx2.status = 2;
        paramx2.Hc();
        boolean bool2 = paramBoolean;
        if (!paramBoolean)
        {
          paramx1.cj(paramx2.GU());
          paramx1.cp(com.tencent.mm.platformtools.c.nb(paramx2.GU()));
          paramx1.cq(com.tencent.mm.platformtools.c.nc(paramx2.GU()));
          bool2 = true;
        }
        bool1 = bool2;
        if (!com.tencent.mm.l.a.eE(paramx1.field_type)) {
          break;
        }
        w.i("MicroMsg.BigBallContactAssemblerImpl", "updateAddrUp RealName[%s], User[%s], remarkChange[%s]", new Object[] { paramx2.GU(), paramx2.getUsername(), Boolean.valueOf(bool2) });
        com.tencent.mm.modelfriend.af.If().a(paramx2.GS(), paramx2);
        bool1 = bool2;
        break;
        if (bg.nm((String)localObject1)) {
          break label1434;
        }
        paramx2 = com.tencent.mm.modelfriend.af.If().jJ((String)localObject1);
        break label1434;
        w.i("MicroMsg.BigBallContactAssemblerImpl", "remarkName RealName[%s], User[%s], needSetRemark[%s]", new Object[] { bg.nl(paramx2.GU()), bg.nl(paramx2.getUsername()), Boolean.valueOf(paramx2.Hd()) });
      }
    }
  }
  
  public final void b(com.tencent.mm.storage.x paramx1, com.tencent.mm.storage.x paramx2, aos paramaos, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    GMTrace.i(8028367618048L, 59816);
    paramArrayOfByte = paramx1.field_username;
    Object localObject2 = paramx1.field_encryptUsername;
    Object localObject1;
    Object localObject3;
    label141:
    label218:
    label249:
    Object localObject4;
    int j;
    if (s.eb(paramArrayOfByte))
    {
      if (paramaos.upV != null)
      {
        localObject1 = paramaos.upV.ubR;
        if (p.a.tmb != null) {
          break label1668;
        }
        i = 0;
        if (i == 0)
        {
          localObject1 = paramaos.upV.ubR;
          localObject3 = new rb();
          ((rb)localObject3).eVS.eVU = true;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject3);
          if ((!bg.nm(paramArrayOfByte)) && (s.eb(paramArrayOfByte)) && (!bg.nm(((rb)localObject3).eVT.eVW)) && (paramArrayOfByte.equals(((rb)localObject3).eVT.eVW))) {
            break label1938;
          }
        }
        localObject1 = paramaos.upV.ubR;
        if ((p.a.tmd != null) && (localObject1 != null))
        {
          localObject1 = ((LinkedList)localObject1).iterator();
          do
          {
            if (!((Iterator)localObject1).hasNext()) {
              break;
            }
            localObject3 = (lg)((Iterator)localObject1).next();
          } while ((bg.nm(((lg)localObject3).jhi)) || (!((lg)localObject3).jhi.equals(q.zE())));
        }
        i = 0;
        if ((i != 0) && (p.a.tmd != null)) {
          p.a.tmd.CR(paramArrayOfByte);
        }
      }
      if (paramaos.upV != null) {
        break label2087;
      }
      i = 0;
      localObject1 = paramaos.uEs;
      localObject3 = paramaos.uEr;
      int k = paramaos.uEC;
      int m = paramaos.uEB;
      localObject4 = paramaos.lTj;
      int n = paramaos.uEA;
      if (paramaos.upV != null) {
        break label2099;
      }
      j = -1;
      label295:
      w.i("MicroMsg.BigBallContactAssemblerImpl", "processModContact chatroom:%s count:%d ChatRoomData:%s owner:%s type:%d max:%d upgrader:%s ver:%d infomask:%d ", new Object[] { paramArrayOfByte, Integer.valueOf(i), localObject1, localObject3, Integer.valueOf(k), Integer.valueOf(m), localObject4, Integer.valueOf(n), Integer.valueOf(j) });
      if ((paramaos.upV != null) && (paramaos.upV.jNj != 0))
      {
        localObject1 = new com.tencent.mm.i.a.a.a();
        ((com.tencent.mm.i.a.a.a)localObject1).type = paramaos.uEC;
        ((com.tencent.mm.i.a.a.a)localObject1).fMw = paramaos.uEB;
        ((com.tencent.mm.i.a.a.a)localObject1).fMx = paramaos.lTj;
        ((com.tencent.mm.i.a.a.a)localObject1).fMy = paramaos.uEA;
        if (paramaos.upV.ubS == 0) {
          ((com.tencent.mm.i.a.a.a)localObject1).eNO = paramaos.uEA;
        }
        if (m.u(paramArrayOfByte, paramaos.uEA))
        {
          localObject3 = new gx();
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject3);
          m.v(paramArrayOfByte, paramaos.uEC);
        }
        localObject3 = new js();
        ((js)localObject3).eNN.chatroomName = paramArrayOfByte;
        ((js)localObject3).eNN.eNO = ((com.tencent.mm.i.a.a.a)localObject1).eNO;
        m.a(paramArrayOfByte, paramaos.uEr, paramaos.upV, q.zE(), (com.tencent.mm.i.a.a.a)localObject1, (com.tencent.mm.sdk.b.b)localObject3);
      }
    }
    if ((!com.tencent.mm.l.a.eE(paramx1.field_type)) && (!paramx1.uX()) && (!com.tencent.mm.storage.x.fw(paramx1.field_username)) && (!s.eb(paramx1.field_username)))
    {
      w.w("MicroMsg.BigBallContactAssemblerImpl", "processModContact delChatContact now user:%s ,type:%d", new Object[] { paramx1.field_username, Integer.valueOf(paramx1.field_type) });
      at.AR();
      com.tencent.mm.y.c.yP().TN(paramx1.field_username);
    }
    if ((paramx1.field_type & 0x800) != 0) {
      if ((paramx2 == null) || ((paramx2.field_type & 0x800) != (paramx1.field_type & 0x800)))
      {
        if ((com.tencent.mm.af.f.iO(paramx1.field_username)) && (!com.tencent.mm.af.f.dL(paramx1.field_username))) {
          z(paramx1);
        }
      }
      else {
        label684:
        if ((paramx2 == null) || (com.tencent.mm.l.a.eE(paramx2.field_type)) || (!com.tencent.mm.l.a.eE(paramx1.field_type))) {
          break label2544;
        }
      }
    }
    label874:
    label934:
    label1045:
    label1668:
    label1938:
    label2000:
    label2087:
    label2099:
    label2347:
    label2487:
    label2537:
    label2544:
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        at.AR();
        localObject1 = com.tencent.mm.y.c.yL().CC(paramArrayOfByte);
        if (localObject1 != null)
        {
          paramArrayOfByte = (byte[])localObject1;
          if (!bg.nm(((bb)localObject1).field_encryptUsername)) {}
        }
        else
        {
          paramArrayOfByte = (byte[])localObject1;
          if (!bg.nm((String)localObject2))
          {
            at.AR();
            paramArrayOfByte = com.tencent.mm.y.c.yL().CC((String)localObject2);
          }
        }
        if ((paramArrayOfByte != null) && (!bg.nm(paramArrayOfByte.field_encryptUsername)))
        {
          at.AR();
          com.tencent.mm.y.c.yL().CD(paramArrayOfByte.field_encryptUsername);
        }
      }
      if (com.tencent.mm.af.f.iN(paramx1.field_username))
      {
        com.tencent.mm.af.x.FN();
        com.tencent.mm.af.c.a(paramx1.field_username, null);
        if ((i != 0) && (com.tencent.mm.af.f.iO(paramx1.field_username)))
        {
          if (!com.tencent.mm.af.f.dL(paramx1.field_username)) {
            break label2347;
          }
          com.tencent.mm.af.x.FM();
          com.tencent.mm.af.a.h.a(paramx1.field_username, null);
        }
      }
      paramArrayOfByte = com.tencent.mm.af.f.iK(paramx1.field_username);
      if (paramArrayOfByte != null)
      {
        paramArrayOfByte = paramArrayOfByte.bq(false);
        if (paramArrayOfByte != null)
        {
          j = 0;
          if (paramArrayOfByte.gvP != null) {
            j = paramArrayOfByte.gvP.optInt("WXAppType", 0);
          }
          if (j != 0)
          {
            j = 1;
            if (j != 0)
            {
              com.tencent.mm.af.x.FQ();
              paramArrayOfByte = paramx1.field_username;
              if (!bg.nm(paramArrayOfByte))
              {
                paramArrayOfByte = com.tencent.mm.af.x.FG().iC(paramArrayOfByte);
                paramArrayOfByte.field_attrSyncVersion = null;
                paramArrayOfByte.field_incrementUpdateTime = 0L;
                com.tencent.mm.af.x.FG().e(paramArrayOfByte);
              }
            }
            if ((paramx1.field_type & 0x8) == 0) {
              break label2487;
            }
            if ((paramx2 == null) || ((paramx2.field_type & 0x8) != (paramx1.field_type & 0x8)))
            {
              at.AR();
              com.tencent.mm.y.c.yP().e(new String[] { paramx1.field_username }, "@blacklist");
            }
            if (!paramBoolean)
            {
              if ((paramx1 != null) && (paramx1.bSA()) && (com.tencent.mm.l.a.eE(paramx1.field_type)))
              {
                long l = System.currentTimeMillis();
                at.AR();
                paramArrayOfByte = com.tencent.mm.y.c.yP().TO(paramx1.field_username);
                if ((paramArrayOfByte != null) && (paramArrayOfByte.eH(4194304)))
                {
                  at.AR();
                  paramBoolean = com.tencent.mm.y.c.yP().a(paramx1.field_username, 4194304, false, paramArrayOfByte.field_attrflag);
                  w.i("MicroMsg.BigBallContactAssemblerImpl", "Reset temp session attr flag.(talker %s, updateSucc %s, cost %s)", new Object[] { paramx1.field_username, Boolean.valueOf(paramBoolean), Long.valueOf(System.currentTimeMillis() - l) });
                }
              }
              if ((paramx2 != null) && ((int)paramx2.fTq > 0) && (paramx2.fjr != 0) && (paramx2.fjs == 0) && (paramx1.fjs == 1))
              {
                w.d("MicroMsg.BigBallContactAssemblerImpl", "hakon removeParentRefAndUnread user = %s", new Object[] { paramx1.field_username });
                at.AR();
                com.tencent.mm.y.c.yP().Uc(paramx1.field_username);
                at.AR();
                paramx2 = com.tencent.mm.y.c.yP().TO("officialaccounts");
                if (paramx2 != null)
                {
                  at.AR();
                  paramx2.dz(com.tencent.mm.y.c.yP().bTf());
                  w.d("MicroMsg.BigBallContactAssemblerImpl", "unread count is %d", new Object[] { Integer.valueOf(paramx2.field_unReadCount) });
                  at.AR();
                  paramArrayOfByte = com.tencent.mm.y.c.yP().TZ("officialaccounts");
                  at.AR();
                  paramArrayOfByte = com.tencent.mm.y.c.yM().Ca(paramArrayOfByte);
                  if ((paramArrayOfByte == null) || (paramArrayOfByte.field_msgId <= 0L)) {
                    break label2537;
                  }
                  paramx2.ab(paramArrayOfByte);
                  paramx2.setContent(paramArrayOfByte.field_talker + ":" + paramArrayOfByte.field_content);
                  paramx2.cN(Integer.toString(paramArrayOfByte.field_type));
                  at.AR();
                  localObject1 = com.tencent.mm.y.c.yP().pC();
                  if (localObject1 != null)
                  {
                    localObject2 = new PString();
                    localObject3 = new PString();
                    localObject4 = new PInt();
                    paramArrayOfByte.db("officialaccounts");
                    paramArrayOfByte.setContent(paramx2.field_content);
                    ((as.b)localObject1).a(paramArrayOfByte, (PString)localObject2, (PString)localObject3, (PInt)localObject4, true);
                    paramx2.cO(((PString)localObject2).value);
                    paramx2.cP(((PString)localObject3).value);
                    paramx2.dD(((PInt)localObject4).value);
                  }
                }
              }
            }
          }
        }
      }
      for (;;)
      {
        at.AR();
        com.tencent.mm.y.c.yP().a(paramx2, paramx2.field_username);
        if (i != 0)
        {
          paramx2 = new jh();
          paramx2.eMV.username = paramx1.field_username;
          paramx2.eMV.eMW = paramx1.eMW;
          com.tencent.mm.sdk.b.a.vgX.m(paramx2);
        }
        if ((i != 0) && (paramaos.tQP == 18))
        {
          paramx2 = new io();
          paramx2.eLZ.eMa = paramx1.field_encryptUsername;
          paramx2.eLZ.type = 2;
          l.MM().lR(paramx2.eLZ.eMa);
          com.tencent.mm.sdk.b.a.vgX.m(paramx2);
        }
        if (i != 0) {
          aE(paramx1.field_username, paramaos.tQP);
        }
        com.tencent.mm.plugin.label.a.a.aJP().aJJ();
        GMTrace.o(8028367618048L, 59816);
        return;
        localObject3 = p.a.tmb.aKu();
        if ((bg.nm((String)localObject3)) || (!((String)localObject3).equals(paramArrayOfByte)) || (!s.eb(paramArrayOfByte)))
        {
          i = 0;
          break;
        }
        if (localObject1 != null)
        {
          localObject1 = ((LinkedList)localObject1).iterator();
          for (;;)
          {
            if (((Iterator)localObject1).hasNext())
            {
              localObject3 = (lg)((Iterator)localObject1).next();
              if ((!bg.nm(((lg)localObject3).jhi)) && (((lg)localObject3).jhi.equals(q.zE())))
              {
                i = 0;
                break;
              }
            }
          }
        }
        if (p.a.tmc != null)
        {
          if (p.a.tmc.cM(paramArrayOfByte, q.zE()))
          {
            w.i("MicroMsg.BigBallContactAssemblerImpl", "kicked self shareing");
            localObject1 = new rf();
            ((rf)localObject1).eWe.userName = paramArrayOfByte;
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
          }
          p.a.tmc.a(paramArrayOfByte, null, 0.0D, 0.0D, "", "", "");
        }
        if ((p.a.tmb != null) && (!bg.nm(p.a.tmc.aKE())))
        {
          w.i("MicroMsg.BigBallContactAssemblerImpl", "sync remove chatroom end track %s", new Object[] { p.a.tmb.aKu() });
          localObject1 = new ep();
          ((ep)localObject1).eGm.username = p.a.tmb.aKu();
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
        }
        i = 1;
        break;
        if (localObject1 != null)
        {
          localObject1 = ((LinkedList)localObject1).iterator();
          for (;;)
          {
            if (!((Iterator)localObject1).hasNext()) {
              break label2000;
            }
            localObject3 = (lg)((Iterator)localObject1).next();
            if (!bg.nm(((lg)localObject3).jhi)) {
              if (((lg)localObject3).jhi.equals(q.zE())) {
                break;
              }
            }
          }
        }
        if (p.a.tlV != null) {
          p.a.tlV.a(paramArrayOfByte, null, "", "", 0);
        }
        localObject1 = new rb();
        ((rb)localObject1).eVS.eVV = true;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
        localObject1 = new ra();
        ((ra)localObject1).eVQ.eVR = true;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
        break label141;
        i = 1;
        break label218;
        i = paramaos.upV.jNj;
        break label249;
        j = paramaos.upV.ubS;
        break label295;
        if ((!paramx1.bSA()) || (!com.tencent.mm.af.f.iM(paramx1.field_username)) || (paramx1 == null) || (!paramx1.bSA()) || (!com.tencent.mm.af.f.iM(paramx1.field_username))) {
          break label684;
        }
        w.i("MicroMsg.BigBallContactAssemblerImpl", "dealPlaceSubscribeBizToTop uct : " + paramx1.field_username);
        at.AR();
        localObject1 = com.tencent.mm.y.c.yP().TO(paramx1.field_username);
        com.tencent.mm.af.x.FG().iC(paramx1.field_username);
        if (localObject1 != null) {
          break label684;
        }
        at.AR();
        if (com.tencent.mm.y.c.yP().TO("officialaccounts") == null)
        {
          localObject1 = new ae("officialaccounts");
          ((ae)localObject1).bSW();
          at.AR();
          com.tencent.mm.y.c.yP().d((ae)localObject1);
        }
        localObject1 = new ae(paramx1.field_username);
        ((ae)localObject1).cQ("officialaccounts");
        at.AR();
        com.tencent.mm.y.c.yP().d((ae)localObject1);
        break label684;
        if (((paramx2 != null) && ((paramx2.field_type & 0x800) == (paramx1.field_type & 0x800))) || (!com.tencent.mm.af.f.iO(paramx1.field_username)) || (com.tencent.mm.af.f.dL(paramx1.field_username))) {
          break label684;
        }
        z(paramx1);
        break label684;
        if (!com.tencent.mm.af.f.iR(paramx1.field_username)) {
          break label874;
        }
        at.AR();
        if (com.tencent.mm.y.c.yP().TO(paramx1.field_username) != null) {
          break label874;
        }
        paramArrayOfByte = com.tencent.mm.af.x.FG().iC(paramx1.field_username);
        localObject1 = new ae(paramx1.field_username);
        if (!paramArrayOfByte.EH())
        {
          w.i("MicroMsg.BigBallContactAssemblerImpl", "Enterprise belong %s, userName: %s", new Object[] { paramArrayOfByte.EN(), paramx1.field_username });
          ((ae)localObject1).cQ(bg.nl(paramArrayOfByte.EN()));
        }
        for (;;)
        {
          ((ae)localObject1).bSW();
          at.AR();
          com.tencent.mm.y.c.yP().d((ae)localObject1);
          break;
          ((ae)localObject1).cQ(null);
        }
        j = 0;
        break label934;
        if ((paramx2 != null) && ((paramx2.field_type & 0x8) == (paramx1.field_type & 0x8))) {
          break label1045;
        }
        at.AR();
        com.tencent.mm.y.c.yP().e(new String[] { paramx1.field_username }, "");
        break label1045;
        paramx2.bSW();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\bbom\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */