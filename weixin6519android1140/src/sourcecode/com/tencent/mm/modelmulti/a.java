package com.tencent.mm.modelmulti;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.e.b;
import com.tencent.mm.ac.h;
import com.tencent.mm.ac.i;
import com.tencent.mm.af.d.b;
import com.tencent.mm.g.a.js;
import com.tencent.mm.g.a.lv;
import com.tencent.mm.g.a.nv;
import com.tencent.mm.g.a.qy;
import com.tencent.mm.g.a.rq;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.pluginsdk.model.app.j;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.aiq;
import com.tencent.mm.protocal.c.alv;
import com.tencent.mm.protocal.c.aok;
import com.tencent.mm.protocal.c.aon;
import com.tencent.mm.protocal.c.aos;
import com.tencent.mm.protocal.c.apc;
import com.tencent.mm.protocal.c.apj;
import com.tencent.mm.protocal.c.aqa;
import com.tencent.mm.protocal.c.asd;
import com.tencent.mm.protocal.c.avn;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bgm;
import com.tencent.mm.protocal.c.bij;
import com.tencent.mm.protocal.c.bmq;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.protocal.c.bv;
import com.tencent.mm.protocal.c.nk;
import com.tencent.mm.protocal.c.oo;
import com.tencent.mm.protocal.c.uu;
import com.tencent.mm.sdk.platformtools.aw;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.as.b;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.ak.b.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.s;
import java.util.Map;
import junit.framework.Assert;

public final class a
  implements p
{
  public a()
  {
    GMTrace.i(407619239936L, 3037);
    GMTrace.o(407619239936L, 3037);
  }
  
  public static boolean a(com.tencent.mm.storage.x paramx)
  {
    GMTrace.i(407887675392L, 3039);
    if ((paramx == null) || (bg.nm(paramx.field_username)))
    {
      if (paramx == null) {}
      for (paramx = "-1";; paramx = paramx.field_username)
      {
        w.w("MicroMsg.BigBallOfMudSyncExtension", "dealModContactExtInfo username:%s ", new Object[] { paramx });
        GMTrace.o(407887675392L, 3039);
        return false;
      }
    }
    at.AR();
    Object localObject = com.tencent.mm.y.c.yK().TI(paramx.field_username);
    if (bg.bq((byte[])localObject))
    {
      paramx = paramx.field_username;
      if (localObject == null) {}
      for (int i = -1;; i = localObject.length)
      {
        w.w("MicroMsg.BigBallOfMudSyncExtension", "dealModContactExtInfo username:%s  buf:%d", new Object[] { paramx, Integer.valueOf(i) });
        GMTrace.o(407887675392L, 3039);
        return false;
      }
    }
    try
    {
      localObject = (aos)new aos().aD((byte[])localObject);
      at.AR();
      com.tencent.mm.y.c.yK().TJ(paramx.field_username);
      if (localObject == null)
      {
        w.e("MicroMsg.BigBallOfMudSyncExtension", "dkinit dealModContactExtInfo failed parse buf failed.");
        GMTrace.o(407887675392L, 3039);
        return false;
      }
    }
    catch (Exception localException)
    {
      aos localaos;
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.BigBallOfMudSyncExtension", localException, "", new Object[0]);
        localaos = null;
      }
      boolean bool = com.tencent.mm.plugin.bbom.c.a(paramx, localaos, false);
      GMTrace.o(407887675392L, 3039);
      return bool;
    }
  }
  
  public final void a(bv parambv, com.tencent.mm.plugin.messenger.foundation.a.r paramr)
  {
    GMTrace.i(408021893120L, 3040);
    final String str = com.tencent.mm.platformtools.n.a(parambv.tQf);
    long l = parambv.tQd;
    int i = parambv.nFd;
    int m = parambv.tQi;
    int n = parambv.tQe;
    int j = parambv.lQc;
    int k = parambv.tQg;
    Object localObject2 = com.tencent.mm.platformtools.n.a(parambv.tQh);
    w.i("MicroMsg.BigBallOfMudSyncExtension", "summerbadcr processAddMsgDigestList chatRoomId[%s], newMsgId[%d], createTime[%d], isActed[%d], msgseq[%d], msgType[%d], unDeliverCount[%d], content[%s]", new Object[] { str, Long.valueOf(l), Integer.valueOf(i), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(j), Integer.valueOf(k), bg.SJ((String)localObject2) });
    if (bg.nm(str)) {
      w.e("MicroMsg.BigBallOfMudSyncExtension", "summerbadcr processAddMsgDigestList chatRoomId is null and ret");
    }
    if (k == 0)
    {
      com.tencent.mm.plugin.report.d.oqe.a(403L, 24L, 1L, false);
      if (bg.aq(bc.gP((String)localObject2), "").equals(com.tencent.mm.y.q.zE()))
      {
        at.AR();
        localObject1 = com.tencent.mm.y.c.yM().B(str, l);
        if ((((ce)localObject1).field_msgId > 0L) && (((ce)localObject1).field_isSend == 1))
        {
          w.i("MicroMsg.BigBallOfMudSyncExtension", "summerbadcr processAddMsgDigestList self send msg[%d] createtime[%d, %d] svrid[%d, %d] seq[%d, %d]", new Object[] { Long.valueOf(((ce)localObject1).field_msgId), Long.valueOf(((ce)localObject1).field_createTime), Integer.valueOf(i), Long.valueOf(((ce)localObject1).field_msgSvrId), Long.valueOf(l), Long.valueOf(((ce)localObject1).field_msgSeq), Integer.valueOf(n) });
          if (((ce)localObject1).field_msgSeq == 0L)
          {
            com.tencent.mm.plugin.report.d.oqe.a(403L, 25L, 1L, false);
            ((au)localObject1).G(n);
            at.AR();
            com.tencent.mm.y.c.yM().a(((ce)localObject1).field_msgId, (au)localObject1);
          }
          GMTrace.o(408021893120L, 3040);
          return;
        }
      }
    }
    at.AR();
    final Object localObject1 = com.tencent.mm.y.c.yP().TO(str);
    au localau;
    Object localObject3;
    label575:
    Object localObject4;
    if (localObject1 == null)
    {
      com.tencent.mm.plugin.report.d.oqe.a(403L, 22L, 1L, false);
      localObject1 = new com.tencent.mm.storage.ae(str);
      ((com.tencent.mm.storage.ae)localObject1).x(i * 1000L);
      ((com.tencent.mm.storage.ae)localObject1).z(n);
      ((com.tencent.mm.storage.ae)localObject1).dz(k);
      ((com.tencent.mm.storage.ae)localObject1).dH(k);
      if (k < 2)
      {
        ((com.tencent.mm.storage.ae)localObject1).A(n);
        i = 1;
        if (m > 0) {
          ((com.tencent.mm.storage.ae)localObject1).dF(((aj)localObject1).field_atCount + m);
        }
        localau = new au();
        localau.dC(0);
        localau.db(str);
        localau.setType(j);
        localau.setContent((String)localObject2);
        if (j != 49) {
          break label1649;
        }
        localObject3 = f.a.eS(j.eF(str, (String)localObject2));
        localau.setType(l.d((f.a)localObject3));
        if ((localau.bTs()) || (localau.bTt())) {
          localObject2 = ((f.a)localObject3).content;
        }
        localau.setContent((String)localObject2);
        ((com.tencent.mm.storage.ae)localObject1).dC(0);
        ((com.tencent.mm.storage.ae)localObject1).setContent(localau.field_content);
        ((com.tencent.mm.storage.ae)localObject1).cN(Integer.toString(localau.field_type));
        at.AR();
        localObject2 = com.tencent.mm.y.c.yP().pC();
        if (localObject2 == null) {
          break label1981;
        }
        localObject3 = new PString();
        localObject4 = new PString();
        PInt localPInt = new PInt();
        ((as.b)localObject2).a(localau, (PString)localObject3, (PString)localObject4, localPInt, false);
        ((com.tencent.mm.storage.ae)localObject1).cO(((PString)localObject3).value);
        ((com.tencent.mm.storage.ae)localObject1).cP(((PString)localObject4).value);
        ((com.tencent.mm.storage.ae)localObject1).dD(localPInt.value);
        if (localau.field_type == 49)
        {
          localObject2 = (String)bh.q(((aj)localObject1).field_content, "msg").get(".msg.appmsg.title");
          localObject3 = bg.nl(((aj)localObject1).field_digest);
          if (!bg.nm((String)localObject2)) {
            break label1955;
          }
          localObject2 = "";
          label752:
          ((com.tencent.mm.storage.ae)localObject1).cO(((String)localObject3).concat((String)localObject2));
        }
        label764:
        if (i == 0) {
          break label1994;
        }
        at.AR();
        w.i("MicroMsg.BigBallOfMudSyncExtension", "summerbadcr, processAddMsgDigestList insert username[%s], ret[%d], firstSeq[%d], lastSeq[%d], undeliver[%d]", new Object[] { str, Long.valueOf(com.tencent.mm.y.c.yP().d((com.tencent.mm.storage.ae)localObject1)), Long.valueOf(((aj)localObject1).field_firstUnDeliverSeq), Long.valueOf(((aj)localObject1).field_lastSeq), Integer.valueOf(((aj)localObject1).field_UnDeliverCount) });
      }
    }
    for (;;)
    {
      at.AR();
      localObject1 = com.tencent.mm.y.c.yT().gD(str);
      at.AR();
      localObject2 = com.tencent.mm.y.c.yK().TE(str);
      if ((localObject2 == null) || ((int)((com.tencent.mm.l.a)localObject2).fTq <= 0))
      {
        w.i("MicroMsg.BigBallOfMudSyncExtension", "summerbadcr processAddMsgDigestList chatRoomId[%s], contact is null need get", new Object[] { str });
        ak.a.gmX.a(str, null, new ak.b.a()
        {
          public final void r(String paramAnonymousString, boolean paramAnonymousBoolean)
          {
            GMTrace.i(413122166784L, 3078);
            if ((localObject1 != null) && (localObject1.bSp()))
            {
              paramAnonymousString = new js();
              paramAnonymousString.eNN.chatroomName = str;
              paramAnonymousString.eNN.eNO = localObject1.bSo();
              com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousString);
            }
            GMTrace.o(413122166784L, 3078);
          }
        });
      }
      if ((com.tencent.mm.sdk.a.b.foreground) && (j != 10002) && (k > 0))
      {
        localObject1 = new bu();
        ((bu)localObject1).tPW = parambv.tQf;
        ((bu)localObject1).tPX = com.tencent.mm.platformtools.n.ni(com.tencent.mm.y.q.zE());
        ((bu)localObject1).nFd = parambv.nFd;
        ((bu)localObject1).tPY = parambv.tQh;
        ((bu)localObject1).lQc = parambv.lQc;
        ((bu)localObject1).tQd = parambv.tQd;
        ((bu)localObject1).tQe = parambv.tQe;
        if (paramr != null) {
          paramr.a(localau, (bu)localObject1);
        }
      }
      GMTrace.o(408021893120L, 3040);
      return;
      at.AR();
      l = com.tencent.mm.y.c.zv().BU(str);
      ((com.tencent.mm.storage.ae)localObject1).A(l);
      w.i("MicroMsg.BigBallOfMudSyncExtension", "summerbadcr processAddMsgDigestList new conv lastDeleteSeq(FirstUnDeliverSeq)[%d], msgSeq[%d]", new Object[] { Long.valueOf(l), Integer.valueOf(n) });
      i = 1;
      break;
      int i1 = (int)((aj)localObject1).field_lastSeq;
      com.tencent.mm.plugin.report.d.oqe.a(403L, 23L, 1L, false);
      if (k < ((aj)localObject1).field_UnDeliverCount) {
        com.tencent.mm.plugin.report.d.oqe.a(403L, 26L, ((aj)localObject1).field_UnDeliverCount, false);
      }
      if (n > i1)
      {
        ((com.tencent.mm.storage.ae)localObject1).z(n);
        ((com.tencent.mm.storage.ae)localObject1).dH(k);
        ((com.tencent.mm.storage.ae)localObject1).x(bc.k(str, i));
        if (k > ((aj)localObject1).field_unReadCount) {
          ((com.tencent.mm.storage.ae)localObject1).dz(k);
        }
        l = ((aj)localObject1).field_firstUnDeliverSeq;
        w.i("MicroMsg.BigBallOfMudSyncExtension", "summerbadcr processAddMsgDigestList  msgSeq[%d], firstSeq[%d], lastseq[%d]", new Object[] { Integer.valueOf(n), Long.valueOf(l), Integer.valueOf(i1) });
        if (l > 0L)
        {
          at.AR();
          if (com.tencent.mm.y.c.yM().C(str, i1).field_msgId > 0L)
          {
            if (k != 1)
            {
              w.i("MicroMsg.BigBallOfMudSyncExtension", "summerbadcr processAddMsgDigestList unDeliverCount:%d keep firstSeq:%d", new Object[] { Integer.valueOf(k), Long.valueOf(l) });
              com.tencent.mm.plugin.report.d.oqe.a(403L, 27L, 1L, false);
              i = 0;
              break;
            }
            ((com.tencent.mm.storage.ae)localObject1).A(n);
            com.tencent.mm.plugin.report.d.oqe.a(403L, 28L, 1L, false);
            i = 0;
            break;
          }
          com.tencent.mm.plugin.report.d.oqe.a(403L, 29L, 1L, false);
          w.i("MicroMsg.BigBallOfMudSyncExtension", "summerbadcr processAddMsgDigestList unDeliverCount:%d lastSeq:%d not existed", new Object[] { Integer.valueOf(k), Integer.valueOf(i1) });
          i = 0;
          break;
        }
        at.AR();
        l = com.tencent.mm.y.c.zv().BU(str);
        if (l > 0L)
        {
          com.tencent.mm.plugin.report.d.oqe.a(403L, 30L, 1L, false);
          if ((k == 0) && (n == l))
          {
            w.i("MicroMsg.BigBallOfMudSyncExtension", "summerbadcr processAddMsgDigestList[%d, %d] deleted ret", new Object[] { Integer.valueOf(n), Long.valueOf(l) });
            GMTrace.o(408021893120L, 3040);
            return;
          }
          ((com.tencent.mm.storage.ae)localObject1).A(n);
          i = 0;
          break;
        }
        at.AR();
        l = com.tencent.mm.y.c.yM().Cw(str);
        if (l > 0L)
        {
          ((com.tencent.mm.storage.ae)localObject1).A(l);
          com.tencent.mm.plugin.report.d.oqe.a(403L, 31L, 1L, false);
          i = 0;
          break;
        }
        com.tencent.mm.plugin.report.d.oqe.a(403L, 32L, 1L, false);
        i = 0;
        break;
      }
      if ((n == i1) && (k == 0) && (((aj)localObject1).field_unReadCount > 0))
      {
        com.tencent.mm.plugin.report.d.oqe.a(403L, 33L, 1L, false);
        ((com.tencent.mm.storage.ae)localObject1).dz(0);
      }
      w.i("MicroMsg.BigBallOfMudSyncExtension", "summerbadcr processAddMsgDigestList msgSeq <= lastSeq, do nothing [%d, %d]", new Object[] { Integer.valueOf(n), Integer.valueOf(i1) });
      GMTrace.o(408021893120L, 3040);
      return;
      label1649:
      if (j != 10002) {
        break label575;
      }
      at.getSysCmdMsgExtension();
      if ((localau.field_type != 10002) || (bg.nm((String)localObject2))) {
        break label575;
      }
      if (bg.nm((String)localObject2))
      {
        w.e("MicroMsg.SysCmdMsgExtension", "null msg content");
        break label575;
      }
      if (((String)localObject2).startsWith("~SEMI_XML~"))
      {
        localObject3 = aw.Se((String)localObject2);
        if (localObject3 == null)
        {
          w.e("MicroMsg.SysCmdMsgExtension", "SemiXml values is null, msgContent %s", new Object[] { localObject2 });
          break label575;
        }
        localObject4 = "brand_service";
        localObject2 = localObject3;
        localObject3 = localObject4;
      }
      for (;;)
      {
        if ((localObject3 == null) || (!((String)localObject3).equals("revokemsg"))) {
          break label1953;
        }
        w.i("MicroMsg.SysCmdMsgExtension", "mm hit MM_DATA_SYSCMD_NEWXML_SUBTYPE_REVOKE");
        ((Map)localObject2).get(".sysmsg.revokemsg.session");
        localObject3 = (String)((Map)localObject2).get(".sysmsg.revokemsg.newmsgid");
        localObject2 = (String)((Map)localObject2).get(".sysmsg.revokemsg.replacemsg");
        w.i("MicroMsg.SysCmdMsgExtension", "ashutest::[oneliang][xml parse] ,msgId:%s,replaceMsg:%s ", new Object[] { localObject3, localObject2 });
        localau.setContent((String)localObject2);
        localau.setType(10000);
        break;
        m = ((String)localObject2).indexOf("<sysmsg");
        if (m == -1)
        {
          w.e("MicroMsg.SysCmdMsgExtension", "msgContent not start with <sysmsg");
          break;
        }
        localObject4 = bh.q(((String)localObject2).substring(m), "sysmsg");
        if (localObject4 == null)
        {
          w.e("MicroMsg.SysCmdMsgExtension", "XmlParser values is null, msgContent %s", new Object[] { localObject2 });
          break;
        }
        localObject3 = (String)((Map)localObject4).get(".sysmsg.$type");
        localObject2 = localObject4;
      }
      label1953:
      break label575;
      label1955:
      localObject2 = " " + bg.nl((String)localObject2);
      break label752;
      label1981:
      ((com.tencent.mm.storage.ae)localObject1).cO(((aj)localObject1).field_content);
      break label764;
      label1994:
      ((com.tencent.mm.storage.ae)localObject1).dE(((aj)localObject1).field_attrflag & 0xFFEFFFFF);
      at.AR();
      w.i("MicroMsg.BigBallOfMudSyncExtension", "summerbadcr, processAddMsgDigestList update username[%s], ret[%d], firstSeq[%d], lastSeq[%d], undeliver[%d]", new Object[] { str, Long.valueOf(com.tencent.mm.y.c.yP().a((com.tencent.mm.storage.ae)localObject1, str, true)), Long.valueOf(((aj)localObject1).field_firstUnDeliverSeq), Long.valueOf(((aj)localObject1).field_lastSeq), Integer.valueOf(((aj)localObject1).field_UnDeliverCount) });
    }
  }
  
  public final void a(nk paramnk, byte[] paramArrayOfByte, boolean paramBoolean, com.tencent.mm.plugin.messenger.foundation.a.r paramr)
  {
    GMTrace.i(407753457664L, 3038);
    label307:
    label762:
    label1039:
    label1044:
    label1420:
    label1425:
    label1709:
    label1897:
    label1974:
    label1979:
    label1984:
    int j;
    label2123:
    int i;
    switch (paramnk.uei)
    {
    default: 
      w.e("MicroMsg.BigBallOfMudSyncExtension", "doCmd: no processing method, cmd id=" + paramnk.uei);
      GMTrace.o(407753457664L, 3038);
      return;
    case 22: 
      paramnk = (aiq)new aiq().aD(paramArrayOfByte);
      paramArrayOfByte = new com.tencent.mm.modelfriend.q();
      paramArrayOfByte.username = paramnk.jhi;
      paramArrayOfByte.gDr = paramnk.uxU;
      paramArrayOfByte.gww = ((int)bg.Pu());
      com.tencent.mm.modelfriend.af.Ij().a(paramArrayOfByte);
      GMTrace.o(407753457664L, 3038);
      return;
    case 13: 
      paramnk = (apc)new apc().aD(paramArrayOfByte);
      if (1 == paramnk.uET)
      {
        at.AR();
        paramArrayOfByte = com.tencent.mm.y.c.yS();
        paramr = com.tencent.mm.platformtools.n.a(paramnk.ufy);
        if (paramnk.uED == 1)
        {
          paramBoolean = true;
          if (paramnk.uEU != 1) {
            break label307;
          }
        }
        for (boolean bool = true;; bool = false)
        {
          paramArrayOfByte.c(paramr, paramBoolean, bool);
          GMTrace.o(407753457664L, 3038);
          return;
          paramBoolean = false;
          break;
        }
      }
      w.e("MicroMsg.BigBallOfMudSyncExtension", "unknown micro blog type:" + paramnk.uET);
      GMTrace.o(407753457664L, 3038);
      return;
    case 15: 
      paramnk = (aon)new aon().aD(paramArrayOfByte);
      if (paramnk != null)
      {
        w.d("MicroMsg.BigBallOfMudSyncExtension", "processModChatRoomMember username:" + paramnk.ufy + " nickname:" + paramnk.uxT);
        paramr = com.tencent.mm.platformtools.n.a(paramnk.ufy);
        at.AR();
        paramArrayOfByte = com.tencent.mm.y.c.yK().TE(paramr);
        paramArrayOfByte.setUsername(paramr);
        paramArrayOfByte.cl(com.tencent.mm.platformtools.n.a(paramnk.uxT));
        paramArrayOfByte.cm(com.tencent.mm.platformtools.n.a(paramnk.ufo));
        paramArrayOfByte.cn(com.tencent.mm.platformtools.n.a(paramnk.ufp));
        paramArrayOfByte.jdMethod_do(paramnk.gCx);
        paramArrayOfByte.cj(com.tencent.mm.platformtools.n.a(paramnk.uDR));
        paramArrayOfByte.cp(com.tencent.mm.platformtools.n.a(paramnk.uDT));
        paramArrayOfByte.cq(com.tencent.mm.platformtools.n.a(paramnk.uDS));
        paramArrayOfByte.dr(paramnk.ueL);
        paramr = new h();
        paramr.eQl = -1;
        paramr.username = paramArrayOfByte.field_username;
        paramr.gsT = paramnk.ubW;
        paramr.gsU = paramnk.ubV;
        w.d("MicroMsg.BigBallOfMudSyncExtension", "dkhurl chatmember %s b[%s] s[%s]", new Object[] { paramr.getUsername(), paramr.Do(), paramr.Dp() });
        paramr.bi(true);
        if ((paramnk.uEk != 3) && (paramnk.uEk != 4)) {
          break label762;
        }
        paramArrayOfByte.dn(paramnk.uEk);
        paramr.fiZ = paramnk.uEk;
      }
      for (;;)
      {
        com.tencent.mm.ac.n.Di().a(paramr);
        at.AR();
        com.tencent.mm.y.c.yK().Q(paramArrayOfByte);
        paramr = com.tencent.mm.af.x.FG().iC(paramArrayOfByte.field_username);
        paramr.field_username = paramArrayOfByte.field_username;
        paramr.field_brandList = paramnk.gCH;
        paramnk = paramnk.uAC;
        if (paramnk != null)
        {
          paramr.field_brandFlag = paramnk.gCL;
          paramr.field_brandInfo = paramnk.gCN;
          paramr.field_brandIconURL = paramnk.gCO;
          paramr.field_extInfo = paramnk.gCM;
        }
        if (!com.tencent.mm.af.x.FG().e(paramr)) {
          com.tencent.mm.af.x.FG().d(paramr);
        }
        GMTrace.o(407753457664L, 3038);
        return;
        if (paramnk.uEk == 2)
        {
          paramArrayOfByte.dn(3);
          paramr.fiZ = 3;
          paramArrayOfByte.dn(3);
          if (!com.tencent.mm.y.q.zE().equals(paramArrayOfByte.field_username))
          {
            com.tencent.mm.ac.n.Dh();
            com.tencent.mm.ac.d.u(paramArrayOfByte.field_username, false);
            com.tencent.mm.ac.n.Dh();
            com.tencent.mm.ac.d.u(paramArrayOfByte.field_username, true);
            com.tencent.mm.ac.n.Dv().hS(paramArrayOfByte.field_username);
          }
        }
      }
    case 23: 
      paramnk = (uu)new uu().aD(paramArrayOfByte);
      switch (paramnk.umY)
      {
      case 2: 
      case 3: 
      default: 
        w.e("MicroMsg.BigBallOfMudSyncExtension", "unknown function switch id:" + paramnk.umY);
        GMTrace.o(407753457664L, 3038);
        return;
      case 1: 
        at.AR();
        com.tencent.mm.y.c.xh().set(17, Integer.valueOf(paramnk.umZ));
        GMTrace.o(407753457664L, 3038);
        return;
      }
      GMTrace.o(407753457664L, 3038);
      return;
    case 25: 
      paramnk = (bij)new bij().aD(paramArrayOfByte);
      if (paramnk != null)
      {
        paramBoolean = true;
        Assert.assertTrue(paramBoolean);
        if (bg.nl(paramnk.jhi).length() <= 0) {
          break label1039;
        }
      }
      for (paramBoolean = true;; paramBoolean = false)
      {
        Assert.assertTrue(paramBoolean);
        if (com.tencent.mm.storage.x.To(paramnk.jhi)) {
          break label1044;
        }
        w.w("MicroMsg.BigBallOfMudSyncExtension", "processModTContact: tcontact should ends with @t.qq.com");
        GMTrace.o(407753457664L, 3038);
        return;
        paramBoolean = false;
        break;
      }
      at.AR();
      paramArrayOfByte = com.tencent.mm.y.c.yK().TE(paramnk.jhi);
      if ((paramArrayOfByte == null) || ((int)paramArrayOfByte.fTq == 0))
      {
        paramArrayOfByte = new com.tencent.mm.storage.x(paramnk.jhi);
        paramArrayOfByte.cj(paramnk.ubU);
        paramArrayOfByte.dr(1);
        paramArrayOfByte.uG();
        at.AR();
        if (com.tencent.mm.y.c.yK().S(paramArrayOfByte) == -1)
        {
          w.e("MicroMsg.BigBallOfMudSyncExtension", "processModTContact: insert contact failed");
          GMTrace.o(407753457664L, 3038);
          return;
        }
        paramArrayOfByte = paramArrayOfByte.field_username;
        if (paramArrayOfByte == null) {
          w.w("MicroMsg.AvatarLogic", "setMBTAvatarImgFlag failed : invalid username");
        }
      }
      for (;;)
      {
        paramArrayOfByte = new qy();
        paramArrayOfByte.eVL.opType = 1;
        paramArrayOfByte.eVL.eQu = paramnk.jhi;
        paramArrayOfByte.eVL.eQv = paramnk.uKN;
        paramArrayOfByte.eVL.eQw = paramnk.ueS;
        com.tencent.mm.sdk.b.a.vgX.m(paramArrayOfByte);
        GMTrace.o(407753457664L, 3038);
        return;
        if (!paramArrayOfByte.endsWith("@t.qq.com"))
        {
          w.w("MicroMsg.AvatarLogic", "setMBTAvatarImgFlag failed : invalid username");
        }
        else
        {
          paramr = new h();
          paramr.username = paramArrayOfByte;
          paramr.fiZ = 3;
          paramr.eQl = 3;
          com.tencent.mm.ac.n.Di().a(paramr);
          continue;
          if (!bg.nl(paramnk.ubU).equals(bg.nl(paramArrayOfByte.field_username)))
          {
            paramArrayOfByte.cj(paramnk.ubU);
            at.AR();
            if (com.tencent.mm.y.c.yK().a(paramArrayOfByte.field_username, paramArrayOfByte) == -1) {
              w.e("MicroMsg.BigBallOfMudSyncExtension", "processModTContact: update contact failed");
            }
          }
        }
      }
    case 24: 
      paramnk = (avn)new avn().aD(paramArrayOfByte);
      if (paramnk != null)
      {
        paramBoolean = true;
        Assert.assertTrue(paramBoolean);
        if (bg.nl(paramnk.jhi).length() <= 0) {
          break label1420;
        }
      }
      for (paramBoolean = true;; paramBoolean = false)
      {
        Assert.assertTrue(paramBoolean);
        if (com.tencent.mm.storage.x.Tq(paramnk.jhi)) {
          break label1425;
        }
        w.w("MicroMsg.BigBallOfMudSyncExtension", "processModQContact: qcontact should ends with @t.qq.com");
        GMTrace.o(407753457664L, 3038);
        return;
        paramBoolean = false;
        break;
      }
      at.AR();
      paramArrayOfByte = com.tencent.mm.y.c.yK().TE(paramnk.jhi);
      if ((paramArrayOfByte == null) || ((int)paramArrayOfByte.fTq == 0))
      {
        paramArrayOfByte = new com.tencent.mm.storage.x(paramnk.jhi);
        paramArrayOfByte.uG();
        paramArrayOfByte.cl(paramnk.ubU);
        paramArrayOfByte.cj(paramnk.ubU);
        paramArrayOfByte.dr(4);
        at.AR();
        if (com.tencent.mm.y.c.yK().S(paramArrayOfByte) == -1)
        {
          w.e("MicroMsg.BigBallOfMudSyncExtension", "processModQContact: insert contact failed");
          GMTrace.o(407753457664L, 3038);
          return;
        }
        com.tencent.mm.ac.b.hP(paramArrayOfByte.field_username);
      }
      for (;;)
      {
        paramArrayOfByte = new lv();
        paramArrayOfByte.eQq.opType = 1;
        paramArrayOfByte.eQq.eQu = paramnk.jhi;
        paramArrayOfByte.eQq.eQv = paramnk.uKN;
        paramArrayOfByte.eQq.eQw = paramnk.ueS;
        com.tencent.mm.sdk.b.a.vgX.m(paramArrayOfByte);
        GMTrace.o(407753457664L, 3038);
        return;
        if (!bg.nl(paramnk.ubU).equals(bg.nl(paramArrayOfByte.field_username)))
        {
          paramArrayOfByte.cl(paramnk.ubU);
          paramArrayOfByte.cj(paramnk.ubU);
          at.AR();
          if (com.tencent.mm.y.c.yK().a(paramArrayOfByte.field_username, paramArrayOfByte) == -1) {
            w.e("MicroMsg.BigBallOfMudSyncExtension", "processModQContact: update contact failed");
          }
        }
      }
    case 33: 
      paramnk = (aok)new aok().aD(paramArrayOfByte);
      if (paramnk != null)
      {
        paramBoolean = true;
        Assert.assertTrue(paramBoolean);
        if (bg.nl(paramnk.jhi).length() <= 0) {
          break label1974;
        }
        paramBoolean = true;
        Assert.assertTrue(paramBoolean);
        paramArrayOfByte = new com.tencent.mm.storage.x();
        paramArrayOfByte.setUsername(paramnk.jhi);
        paramArrayOfByte.setType(paramnk.jib);
        paramArrayOfByte.jdMethod_do(paramnk.gCx);
        paramArrayOfByte.cE(RegionCodeDecoder.ai(paramnk.gCG, paramnk.gCy, paramnk.gCz));
        paramArrayOfByte.cy(paramnk.gCA);
        paramr = new h();
        paramr.eQl = -1;
        paramr.username = paramnk.jhi;
        paramr.gsT = paramnk.ubW;
        paramr.gsU = paramnk.ubV;
        w.d("MicroMsg.BigBallOfMudSyncExtension", "dkhurl bottle %s b[%s] s[%s]", new Object[] { paramr.getUsername(), paramr.Do(), paramr.Dp() });
        w.d("MicroMsg.BigBallOfMudSyncExtension", "bottlecontact imgflag:" + paramnk.uEk + " hd:" + paramnk.uEl);
        if (paramnk.uEl == 0) {
          break label1979;
        }
        paramBoolean = true;
        paramr.bi(paramBoolean);
        if ((paramnk.uEk != 3) && (paramnk.uEk != 4)) {
          break label1984;
        }
        paramArrayOfByte.dn(paramnk.uEk);
        paramr.fiZ = paramnk.uEk;
      }
      for (;;)
      {
        com.tencent.mm.ac.n.Di().a(paramr);
        at.AR();
        com.tencent.mm.y.c.yK().P(paramArrayOfByte);
        GMTrace.o(407753457664L, 3038);
        return;
        paramBoolean = false;
        break;
        paramBoolean = false;
        break label1709;
        paramBoolean = false;
        break label1897;
        if (paramnk.uEk == 2)
        {
          paramArrayOfByte.dn(3);
          paramr.fiZ = 3;
          com.tencent.mm.ac.n.Dh();
          com.tencent.mm.ac.d.u(paramnk.jhi, false);
          com.tencent.mm.ac.n.Dh();
          com.tencent.mm.ac.d.u(paramnk.jhi, true);
          com.tencent.mm.ac.n.Dv().hS(paramnk.jhi);
        }
        else
        {
          paramArrayOfByte.dn(3);
          paramr.fiZ = 3;
        }
      }
    case 35: 
      paramr = (apj)new apj().aD(paramArrayOfByte);
      if (paramr != null)
      {
        paramBoolean = true;
        Assert.assertTrue(paramBoolean);
        paramnk = com.tencent.mm.y.q.zE();
        j = paramr.tWA;
        if (j != 2) {
          break label2371;
        }
        paramnk = com.tencent.mm.storage.x.Tt(paramnk);
        at.AR();
        paramArrayOfByte = (String)com.tencent.mm.y.c.xh().get(12553, null);
        paramBoolean = false;
        if ((paramArrayOfByte == null) || (!paramArrayOfByte.equals(paramr.uEZ)))
        {
          com.tencent.mm.ac.n.Dh();
          com.tencent.mm.ac.d.u(paramnk, true);
          at.AR();
          paramArrayOfByte = com.tencent.mm.y.c.xh();
          if (j != 2) {
            break label2392;
          }
          i = 12553;
          paramArrayOfByte.set(i, paramr.uEZ);
          paramBoolean = true;
        }
        w.d("MicroMsg.BigBallOfMudSyncExtension", "ModUserImg beRemove:%b imgtype:%d md5:%s big:%s sm:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(j), paramr.uEZ, paramr.ubV, paramr.ubW });
        paramArrayOfByte = new h();
        paramArrayOfByte.username = paramnk;
        paramArrayOfByte.gsU = paramr.ubV;
        paramArrayOfByte.gsT = paramr.ubW;
        if (!bg.nm(paramArrayOfByte.Dp()))
        {
          if (j != 1) {
            break label2400;
          }
          at.AR();
          com.tencent.mm.y.c.xh().set(59, Boolean.valueOf(true));
        }
      }
      for (;;)
      {
        paramArrayOfByte.bi(false);
        paramArrayOfByte.eQl = 56;
        if (!bg.nm(paramr.uEZ)) {
          paramArrayOfByte.bi(true);
        }
        com.tencent.mm.ac.n.Di().a(paramArrayOfByte);
        if (paramBoolean) {
          new com.tencent.mm.ac.e().a(paramnk, new e.b()
          {
            public final int aN(int paramAnonymousInt1, int paramAnonymousInt2)
            {
              GMTrace.i(401847877632L, 2994);
              GMTrace.o(401847877632L, 2994);
              return 0;
            }
          });
        }
        GMTrace.o(407753457664L, 3038);
        return;
        paramBoolean = false;
        break;
        at.AR();
        paramArrayOfByte = (String)com.tencent.mm.y.c.xh().get(12297, null);
        break label2123;
        i = 12297;
        break label2170;
        at.AR();
        com.tencent.mm.y.c.xh().set(60, Boolean.valueOf(true));
      }
    case 44: 
      paramr = (bmq)new bmq().aD(paramArrayOfByte);
      w.d("MicroMsg.BigBallOfMudSyncExtension", "snsExtFlag " + paramr.uAB.gCI);
      at.AR();
      String str = (String)com.tencent.mm.y.c.xh().get(2, null);
      if ((str == null) || (str.length() <= 0))
      {
        GMTrace.o(407753457664L, 3038);
        return;
      }
      if (com.tencent.mm.plugin.sns.b.n.poP != null) {
        com.tencent.mm.plugin.sns.b.n.poP.a(str, paramr.uAB);
      }
      paramArrayOfByte = com.tencent.mm.af.f.iK(com.tencent.mm.y.q.zE());
      paramnk = paramArrayOfByte;
      if (paramArrayOfByte == null) {
        paramnk = new com.tencent.mm.af.d();
      }
      paramnk.field_username = str;
      paramnk.field_brandList = paramr.gCH;
      if ((paramnk.EG()) && (paramnk.bq(false) != null) && (paramnk.bq(false).Fh() != null) && (!bg.nm(paramnk.EN())))
      {
        paramnk.field_enterpriseFather = paramnk.EN();
        w.d("MicroMsg.BigBallOfMudSyncExtension", "processModUserInfoExt, %s set enterpriseFather %s", new Object[] { str, paramnk.field_enterpriseFather });
      }
      if (!com.tencent.mm.af.x.FG().e(paramnk)) {
        com.tencent.mm.af.x.FG().d(paramnk);
      }
      i = paramr.uWE;
      j = paramr.uWF;
      int k = paramr.uWG;
      w.d("MicroMsg.BigBallOfMudSyncExtension", "roomSize :" + i + " rommquota: " + j + " invite: " + k);
      at.AR();
      com.tencent.mm.y.c.xh().set(135175, Integer.valueOf(i));
      at.AR();
      com.tencent.mm.y.c.xh().set(135176, Integer.valueOf(j));
      at.AR();
      com.tencent.mm.y.c.xh().set(135177, Integer.valueOf(k));
      at.AR();
      com.tencent.mm.y.c.xh().set(144385, Integer.valueOf(paramr.uWK));
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vut, Integer.valueOf(paramr.unV));
      at.AR();
      com.tencent.mm.y.c.xh().set(339975, Integer.valueOf(paramr.uWS));
      w.i("MicroMsg.BigBallOfMudSyncExtension", "hy: sync do cmd pay wallet type: %d %d", new Object[] { Integer.valueOf(paramr.uWS), Integer.valueOf(paramr.unV) });
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vsB, bg.aq(paramr.fjy, ""));
      w.d("MicroMsg.BigBallOfMudSyncExtension", "weidianinfo:%s", new Object[] { paramr.fjy });
      at.AR();
      com.tencent.mm.y.c.xh().set(147457, Long.valueOf(paramr.uWT));
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vwp, paramr.uWU);
      paramnk = new h();
      paramnk.eQl = -1;
      paramnk.username = str;
      paramnk.gsU = paramr.ubV;
      paramnk.gsT = paramr.ubW;
      paramnk.bi(true);
      paramnk.fiZ = 3;
      w.d("MicroMsg.BigBallOfMudSyncExtension", "dkavatar user:[%s] big:[%s] sm:[%s]", new Object[] { paramnk.getUsername(), paramnk.Do(), paramnk.Dp() });
      com.tencent.mm.ac.n.Di().a(paramnk);
      paramnk = paramr.uEv;
      paramArrayOfByte = paramr.uEw;
      at.AR();
      com.tencent.mm.y.c.xh().set(274433, paramArrayOfByte);
      at.AR();
      com.tencent.mm.y.c.xh().set(274434, paramnk);
      if (paramr.tQk != null)
      {
        at.AR();
        com.tencent.mm.y.c.xh().set(286721, paramr.tQk.tUw);
        at.AR();
        com.tencent.mm.y.c.xh().set(286722, paramr.tQk.tUx);
        at.AR();
        com.tencent.mm.y.c.xh().set(286723, paramr.tQk.tUy);
      }
      if ((paramr.uWQ != null) && (paramr.uWQ.uIe != null) && (paramr.uWQ.uIe.uNN > 0))
      {
        w.i("MicroMsg.BigBallOfMudSyncExtension", "tomgest PatternLockInfo %d", new Object[] { Integer.valueOf(paramr.uWQ.uIe.uNN) });
        paramnk = new rq();
        paramnk.eWw.eWx = paramr.uWQ;
        com.tencent.mm.sdk.b.a.vgX.m(paramnk);
      }
      GMTrace.o(407753457664L, 3038);
      return;
    case 999999: 
      try
      {
        i = com.tencent.mm.a.n.c(paramArrayOfByte, 0);
        w.d("MicroMsg.BigBallOfMudSyncExtension", "local test synccmd, sleep %d", new Object[] { Integer.valueOf(i) });
        if (i > 0) {
          Thread.sleep(i);
        }
        GMTrace.o(407753457664L, 3038);
        return;
      }
      catch (InterruptedException paramnk)
      {
        w.printErrStackTrace("MicroMsg.BigBallOfMudSyncExtension", paramnk, "", new Object[0]);
        GMTrace.o(407753457664L, 3038);
        return;
      }
    case 53: 
      label2170:
      label2371:
      label2392:
      label2400:
      paramnk = (aqa)new aqa().aD(paramArrayOfByte);
      w.d("MicroMsg.BigBallOfMudSyncExtension", "rollback, msgtype is %d, msgid is %d", new Object[] { Integer.valueOf(paramnk.lQc), Long.valueOf(paramnk.tQd) });
      if (s.fT(paramnk.lSY))
      {
        paramArrayOfByte = new nv();
        paramArrayOfByte.eSO.eDr = paramnk.tQd;
        com.tencent.mm.sdk.b.a.vgX.m(paramArrayOfByte);
      }
      GMTrace.o(407753457664L, 3038);
      return;
    }
    a((bv)new bv().aD(paramArrayOfByte), paramr);
    GMTrace.o(407753457664L, 3038);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelmulti\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */