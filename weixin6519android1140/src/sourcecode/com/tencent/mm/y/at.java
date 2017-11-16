package com.tencent.mm.y;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.d.c;
import com.tencent.mm.ad.n.a;
import com.tencent.mm.ad.r;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.e.f;
import com.tencent.mm.modelstat.p;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.ade;
import com.tencent.mm.protocal.c.adv;
import com.tencent.mm.protocal.c.aev;
import com.tencent.mm.protocal.c.aey;
import com.tencent.mm.protocal.c.afc;
import com.tencent.mm.protocal.c.akp;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bnq;
import com.tencent.mm.protocal.c.gl;
import com.tencent.mm.protocal.c.mz;
import com.tencent.mm.protocal.c.qn;
import com.tencent.mm.protocal.c.rj;
import com.tencent.mm.protocal.c.rk;
import com.tencent.mm.protocal.c.zb;
import com.tencent.mm.protocal.j.a;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.m.a;
import com.tencent.mm.protocal.p.a;
import com.tencent.mm.protocal.q.a;
import com.tencent.mm.protocal.s.a;
import com.tencent.mm.protocal.t.a;
import com.tencent.mm.protocal.u.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.am;
import com.tencent.mm.storage.ap;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.ar.a;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.as.a;
import com.tencent.mm.storage.as.b;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.j;
import com.tencent.mm.storage.l;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import java.util.List;
import junit.framework.Assert;

public final class at
{
  private static at gnd;
  public final c gmU;
  public final ai gnc;
  private com.tencent.mm.compatible.b.e gne;
  public br gnf;
  private final int gng;
  final c.a gnh;
  bu gni;
  bn gnj;
  e gnk;
  bx gnl;
  v gnm;
  ar.a gnn;
  as.a gno;
  as.a gnp;
  f gnq;
  
  static
  {
    GMTrace.i(663304011776L, 4942);
    gnd = null;
    GMTrace.o(663304011776L, 4942);
  }
  
  private at(ai paramai, n.a parama)
  {
    GMTrace.i(659948568576L, 4917);
    this.gne = null;
    this.gnf = null;
    this.gng = 1;
    this.gni = new bu();
    this.gnj = new bn();
    this.gnk = new e();
    this.gnl = new bx();
    this.gnm = new v();
    this.gnn = new ar.a()
    {
      public final void a(ar paramAnonymousar, x paramAnonymousx)
      {
        GMTrace.i(647600537600L, 4825);
        String str = paramAnonymousx.field_username;
        if (x.fw(paramAnonymousx.field_username)) {
          paramAnonymousx.setUsername(x.Tt(paramAnonymousx.field_username));
        }
        if (bg.nm(paramAnonymousx.qR())) {
          paramAnonymousx.cm(com.tencent.mm.platformtools.c.nc(paramAnonymousx.field_nickname));
        }
        if (bg.nm(paramAnonymousx.qS())) {
          paramAnonymousx.cn(com.tencent.mm.platformtools.c.nb(paramAnonymousx.field_nickname));
        }
        if (bg.nm(paramAnonymousx.field_conRemarkPYShort)) {
          paramAnonymousx.cq(com.tencent.mm.platformtools.c.nc(paramAnonymousx.field_conRemark));
        }
        if (bg.nm(paramAnonymousx.field_conRemarkPYFull)) {
          paramAnonymousx.cp(com.tencent.mm.platformtools.c.nb(paramAnonymousx.field_conRemark));
        }
        if (s.d(paramAnonymousx))
        {
          paramAnonymousx.di(43);
          paramAnonymousx.cm(com.tencent.mm.platformtools.c.nc(paramAnonymousx.vj()));
          paramAnonymousx.cn(com.tencent.mm.platformtools.c.nb(paramAnonymousx.vj()));
          paramAnonymousx.cp(com.tencent.mm.platformtools.c.nb(paramAnonymousx.vk()));
          paramAnonymousx.cq(paramAnonymousx.vk());
          GMTrace.o(647600537600L, 4825);
          return;
        }
        if (s.gm(str))
        {
          paramAnonymousx.uA();
          paramAnonymousx.dn(4);
          paramAnonymousx.di(33);
          if (paramAnonymousx != null) {
            break label345;
          }
        }
        label345:
        for (paramAnonymousar = new x();; paramAnonymousar = paramAnonymousx)
        {
          paramAnonymousar.setUsername(str);
          paramAnonymousar.uA();
          z.x(paramAnonymousar);
          paramAnonymousar.uJ();
          if (paramAnonymousx.vb()) {
            paramAnonymousx.di(paramAnonymousx.ux());
          }
          if (s.gc(str))
          {
            w.i("MicroMsg.MMCore", "update official account helper showhead %d", new Object[] { Integer.valueOf(31) });
            paramAnonymousx.di(31);
          }
          if (paramAnonymousx.uZ())
          {
            at.AR();
            c.yP().e(new String[] { str }, "@blacklist");
          }
          w.d("MicroMsg.MMCore", "onPreInsertContact2: %s, %s", new Object[] { paramAnonymousx.field_username, paramAnonymousx.qR() });
          GMTrace.o(647600537600L, 4825);
          return;
        }
      }
    };
    this.gno = new as.a()
    {
      public final void a(ae paramAnonymousae, as paramAnonymousas)
      {
        GMTrace.i(629615362048L, 4691);
        if (paramAnonymousae == null)
        {
          GMTrace.o(629615362048L, 4691);
          return;
        }
        if ((!x.To(paramAnonymousae.field_username)) && (!x.Tq(paramAnonymousae.field_username)) && (!x.fw(paramAnonymousae.field_username)) && (!s.fD(paramAnonymousae.field_username)))
        {
          GMTrace.o(629615362048L, 4691);
          return;
        }
        if (x.fw(paramAnonymousae.field_username))
        {
          paramAnonymousae = paramAnonymousas.TO("floatbottle");
          if (paramAnonymousae != null) {
            break label932;
          }
          paramAnonymousae = new ae("floatbottle");
        }
        label887:
        label927:
        label932:
        for (int i = 1;; i = 0)
        {
          paramAnonymousae.dA(1);
          paramAnonymousae.dz(k.zB());
          at.AR();
          Object localObject1 = c.yM().Cc(" and not ( type = 10000 and isSend != 2 ) ");
          Object localObject2;
          Object localObject3;
          PString localPString;
          Object localObject4;
          if ((localObject1 != null) && (((ce)localObject1).field_msgId > 0L))
          {
            paramAnonymousae.ab((au)localObject1);
            paramAnonymousae.setContent(x.Tt(((ce)localObject1).field_talker) + ":" + ((ce)localObject1).field_content);
            paramAnonymousae.cN(Integer.toString(((ce)localObject1).field_type));
            localObject2 = paramAnonymousas.pC();
            if (localObject2 != null)
            {
              localObject3 = new PString();
              localPString = new PString();
              localObject4 = new PInt();
              ((au)localObject1).db("floatbottle");
              ((au)localObject1).setContent(paramAnonymousae.field_content);
              ((as.b)localObject2).a((au)localObject1, (PString)localObject3, localPString, (PInt)localObject4, false);
              paramAnonymousae.cO(((PString)localObject3).value);
              paramAnonymousae.cP(localPString.value);
              paramAnonymousae.dD(((PInt)localObject4).value);
            }
          }
          while (i != 0)
          {
            paramAnonymousas.d(paramAnonymousae);
            GMTrace.o(629615362048L, 4691);
            return;
            paramAnonymousae.bSW();
          }
          paramAnonymousas.a(paramAnonymousae, paramAnonymousae.field_username);
          GMTrace.o(629615362048L, 4691);
          return;
          if ((x.To(paramAnonymousae.field_username)) || (x.Tq(paramAnonymousae.field_username)))
          {
            GMTrace.o(629615362048L, 4691);
            return;
          }
          if ((s.fD(paramAnonymousae.field_username)) && (!bg.nm(paramAnonymousae.field_parentRef)))
          {
            localObject1 = paramAnonymousas.TO(paramAnonymousae.field_parentRef);
            w.v("MicroMsg.MMCore", "postConvExt, username = %s, parentRef = %s", new Object[] { paramAnonymousae.field_username, paramAnonymousae.field_parentRef });
            if (paramAnonymousae.field_parentRef.equals("officialaccounts")) {
              break label927;
            }
          }
          for (i = 1;; i = 0)
          {
            if (localObject1 == null)
            {
              localObject1 = new ae(paramAnonymousae.field_parentRef);
              if (i != 0) {
                ((ae)localObject1).eG(2097152);
              }
            }
            for (int j = 1;; j = 0)
            {
              w.i("MicroMsg.MMCore", "enterprise cvs count is %d", new Object[] { Integer.valueOf(((com.tencent.mm.g.b.aj)localObject1).field_unReadCount) });
              at.AR();
              localObject3 = c.yP().TZ(paramAnonymousae.field_parentRef);
              at.AR();
              localObject2 = c.yM().Ca((String)localObject3);
              if ((localObject2 != null) && (((ce)localObject2).field_msgId > 0L))
              {
                ((ae)localObject1).ab((au)localObject2);
                ((ae)localObject1).setContent(((ce)localObject2).field_talker + ":" + ((ce)localObject2).field_content);
                ((ae)localObject1).cN(Integer.toString(((ce)localObject2).field_type));
                localObject3 = paramAnonymousas.pC();
                if (localObject3 != null)
                {
                  localPString = new PString();
                  localObject4 = new PString();
                  PInt localPInt = new PInt();
                  ((au)localObject2).db(paramAnonymousae.field_parentRef);
                  ((au)localObject2).setContent(((com.tencent.mm.g.b.aj)localObject1).field_content);
                  ((as.b)localObject3).a((au)localObject2, localPString, (PString)localObject4, localPInt, true);
                  ((ae)localObject1).cO(localPString.value);
                  ((ae)localObject1).cP(((PString)localObject4).value);
                  ((ae)localObject1).dD(localPInt.value);
                }
                int m = 0;
                int k = m;
                if (i != 0)
                {
                  at.AR();
                  k = m;
                  if (c.yP().TY(((com.tencent.mm.g.b.aj)localObject1).field_username) <= 0) {
                    k = 1;
                  }
                }
                if (k == 0) {
                  break label887;
                }
                paramAnonymousas.TN(((com.tencent.mm.g.b.aj)localObject1).field_username);
              }
              for (;;)
              {
                if ("@blacklist".equals(paramAnonymousae.field_parentRef))
                {
                  at.AR();
                  paramAnonymousas = c.yK().TE(paramAnonymousae.field_username);
                  if ((paramAnonymousas != null) && (!bg.nm(paramAnonymousas.field_username)) && (!paramAnonymousas.uZ()))
                  {
                    at.AR();
                    c.yP().e(new String[] { paramAnonymousae.field_username }, "");
                  }
                }
                GMTrace.o(629615362048L, 4691);
                return;
                ((ae)localObject1).bSW();
                w.i("MicroMsg.MMCore", "lastOfMsg is null or MsgId <= 0, lastConvBiz is %s", new Object[] { localObject3 });
                break;
                if (j != 0) {
                  paramAnonymousas.d((ae)localObject1);
                } else {
                  paramAnonymousas.a((ae)localObject1, ((com.tencent.mm.g.b.aj)localObject1).field_username);
                }
              }
            }
          }
        }
      }
    };
    this.gnp = new as.a()
    {
      public final void a(ae paramAnonymousae, as paramAnonymousas)
      {
        GMTrace.i(693637218304L, 5168);
        if (paramAnonymousae == null)
        {
          GMTrace.o(693637218304L, 5168);
          return;
        }
        GMTrace.o(693637218304L, 5168);
      }
    };
    this.gnq = new f();
    this.gnc = paramai;
    this.gnf = new br();
    this.gnh = new c.a()
    {
      public final void a(c paramAnonymousc, boolean paramAnonymousBoolean)
      {
        GMTrace.i(638742167552L, 4759);
        w.i("MicroMsg.MMCore", "summeranrt2 onAccountPostReset tid:%d stack[%s]", new Object[] { Long.valueOf(Thread.currentThread().getId()), bg.bQW() });
        paramAnonymousc = at.this;
        c.yK().a(paramAnonymousc.gnn);
        c.yP().b(paramAnonymousc.gnp);
        c.yP().a(paramAnonymousc.gno, null);
        d.c.a(Integer.valueOf(9999), paramAnonymousc.gni);
        d.c.a(Integer.valueOf(41), paramAnonymousc.gnj);
        d.c.a(Integer.valueOf(21), paramAnonymousc.gnk);
        d.c.a(Integer.valueOf(35), paramAnonymousc.gnk);
        d.c.a(Integer.valueOf(-1879048175), paramAnonymousc.gnl);
        d.c.a(Integer.valueOf(-1879048174), paramAnonymousc.gnm);
        Object localObject = ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension();
        ((bt)localObject).a("addcontact", paramAnonymousc.gnq);
        ((bt)localObject).a("dynacfg", paramAnonymousc.gnq);
        ((bt)localObject).a("dynacfg_split", paramAnonymousc.gnq);
        ((bt)localObject).a("banner", paramAnonymousc.gnq);
        ((bt)localObject).a("midinfo", paramAnonymousc.gnq);
        ((bt)localObject).a("revokemsg", paramAnonymousc.gnq);
        ((bt)localObject).a("clouddelmsg", paramAnonymousc.gnq);
        ((bt)localObject).a("updatepackage", paramAnonymousc.gnq);
        ((bt)localObject).a("deletepackage", paramAnonymousc.gnq);
        ((bt)localObject).a("delchatroommember", paramAnonymousc.gnq);
        ((bt)localObject).a("WakenPush", paramAnonymousc.gnq);
        ((bt)localObject).a("DisasterNotice", paramAnonymousc.gnq);
        ((bt)localObject).a("EmotionKv", paramAnonymousc.gnq);
        ((bt)localObject).a("globalalert", paramAnonymousc.gnq);
        ((bt)localObject).a("yybsigcheck", paramAnonymousc.gnq);
        ((bt)localObject).a("qy_status_notify", paramAnonymousc.gnq);
        ((bt)localObject).a("qy_chat_update", paramAnonymousc.gnq);
        ((bt)localObject).a("bindmobiletip", paramAnonymousc.gnq);
        ((bt)localObject).a("ClientCheckConsistency", paramAnonymousc.gnq);
        ((bt)localObject).a("ClientCheckHook", paramAnonymousc.gnq);
        ((bt)localObject).a("ClientCheckGetAppList", paramAnonymousc.gnq);
        ((bt)localObject).a("ClientCheckGetExtInfo", paramAnonymousc.gnq);
        ((bt)localObject).a("functionmsg", paramAnonymousc.gnq);
        ((bt)localObject).a("paymsg", paramAnonymousc.gnq);
        at.this.gnf.aX(paramAnonymousBoolean);
        long l1 = System.currentTimeMillis();
        at.AR();
        long l2 = c.yH().cE(Thread.currentThread().getId());
        if (paramAnonymousBoolean)
        {
          c.yK().TK("readerapp");
          c.xh().set(256, Boolean.valueOf(true));
          aa.Ay();
          aa.Ay();
          paramAnonymousc = c.yK().bSO();
          if (paramAnonymousc.moveToFirst()) {
            do
            {
              localObject = new x();
              ((x)localObject).b(paramAnonymousc);
              ((x)localObject).uM();
              c.yK().a(((com.tencent.mm.g.b.af)localObject).field_username, (x)localObject);
            } while (paramAnonymousc.moveToNext());
          }
          paramAnonymousc.close();
          be.gW("ver" + com.tencent.mm.protocal.d.tJC);
        }
        new z(at.this.gmU);
        if (paramAnonymousBoolean)
        {
          z.w(c.yK().TE("filehelper"));
          paramAnonymousc = q.zE();
          if (!bg.nm(paramAnonymousc))
          {
            localObject = c.yK().TE(paramAnonymousc);
            if ((int)((com.tencent.mm.l.a)localObject).fTq != 0) {
              break label1490;
            }
            ((x)localObject).setUsername(paramAnonymousc);
            ((x)localObject).uA();
            at.AR();
            c.yK().R((x)localObject);
          }
          z.a(paramAnonymousBoolean, "qqmail", false);
          z.a(paramAnonymousBoolean, "floatbottle", false);
          z.a(paramAnonymousBoolean, "shakeapp", false);
          z.a(paramAnonymousBoolean, "lbsapp", false);
          z.a(paramAnonymousBoolean, "medianote", false);
          z.a(paramAnonymousBoolean, "newsapp", true);
          c.yP().TN("blogapp");
          c.yM().Cg("blogapp");
          c.yK().TK("blogapp");
          z.a(paramAnonymousBoolean, "facebookapp", true);
          z.a(paramAnonymousBoolean, "qqfriend", false);
          z.a(paramAnonymousBoolean, "masssendapp", true);
          z.a(paramAnonymousBoolean, "feedsapp", true);
          c.yP().TN("tmessage");
          c.yK().TK("tmessage");
          x localx = c.yK().TE("voip");
          localObject = c.yK().TE("voipapp");
          paramAnonymousc = (c)localObject;
          if (localObject == null) {
            paramAnonymousc = new x();
          }
          if ((localx != null) && ((int)localx.fTq != 0)) {
            c.yK().TK("voip");
          }
          if ((int)paramAnonymousc.fTq != 0) {
            break label1525;
          }
          paramAnonymousc.setUsername("voipapp");
          paramAnonymousc.uA();
          z.x(paramAnonymousc);
          paramAnonymousc.dn(4);
          paramAnonymousc.uJ();
          c.yK().S(paramAnonymousc);
          label938:
          localObject = c.yK().TE("officialaccounts");
          paramAnonymousc = (c)localObject;
          if (localObject == null) {
            paramAnonymousc = new x();
          }
          w.i("MicroMsg.HardCodeHelper", "hardcodeOfficialAccounts:update[%B], contactID[%d]", new Object[] { Boolean.valueOf(paramAnonymousBoolean), Integer.valueOf((int)paramAnonymousc.fTq) });
          if ((int)paramAnonymousc.fTq != 0) {
            break label1549;
          }
          paramAnonymousc.setUsername("officialaccounts");
          paramAnonymousc.uB();
          z.x(paramAnonymousc);
          paramAnonymousc.dn(3);
          c.yK().S(paramAnonymousc);
          label1036:
          localx = c.yK().TE("voipaudio");
          localObject = c.yK().TE("voicevoipapp");
          paramAnonymousc = (c)localObject;
          if (localObject == null) {
            paramAnonymousc = new x();
          }
          if ((localx != null) && ((int)localx.fTq != 0)) {
            c.yK().TK("voipaudio");
          }
          if ((int)paramAnonymousc.fTq != 0) {
            break label1582;
          }
          paramAnonymousc.setUsername("voicevoipapp");
          paramAnonymousc.uA();
          z.x(paramAnonymousc);
          paramAnonymousc.dn(4);
          paramAnonymousc.uJ();
          c.yK().S(paramAnonymousc);
          label1146:
          z.a(paramAnonymousBoolean, "voiceinputapp", false);
          z.a(paramAnonymousBoolean, "linkedinplugin", false);
          localObject = c.yK().TE("notifymessage");
          paramAnonymousc = (c)localObject;
          if (localObject == null) {
            paramAnonymousc = new x();
          }
          w.i("MicroMsg.HardCodeHelper", "hardcodeOfficialAccounts:update[%B], contactID[%d]", new Object[] { Boolean.valueOf(paramAnonymousBoolean), Integer.valueOf((int)paramAnonymousc.fTq) });
          if ((int)paramAnonymousc.fTq != 0) {
            break label1606;
          }
          paramAnonymousc.setUsername("notifymessage");
          paramAnonymousc.uB();
          z.x(paramAnonymousc);
          paramAnonymousc.dn(3);
          c.yK().S(paramAnonymousc);
          label1262:
          localObject = c.yK().TE("appbrandcustomerservicemsg");
          paramAnonymousc = (c)localObject;
          if (localObject == null) {
            paramAnonymousc = new x();
          }
          w.i("MicroMsg.HardCodeHelper", "hardcodeAppBrandServiceMessage:update[%B], contactID[%d]", new Object[] { Boolean.valueOf(paramAnonymousBoolean), Integer.valueOf((int)paramAnonymousc.fTq) });
          if ((int)paramAnonymousc.fTq != 0) {
            break label1639;
          }
          paramAnonymousc.setUsername("appbrandcustomerservicemsg");
          paramAnonymousc.uB();
          z.x(paramAnonymousc);
          paramAnonymousc.setType(0);
          paramAnonymousc.dn(3);
          c.yK().S(paramAnonymousc);
        }
        for (;;)
        {
          if (paramAnonymousBoolean)
          {
            at.AR();
            c.yP().TN("Weixin");
            at.AR();
            c.yK().TK("Weixin");
          }
          at.AR();
          c.yH().aL(l2);
          w.i("MicroMsg.MMCore", "summeranrt dkwt set forceManual :%b, tid[%d], take[%s]ms, stack[%s]", new Object[] { Boolean.valueOf(paramAnonymousBoolean), Long.valueOf(Thread.currentThread().getId()), Long.valueOf(System.currentTimeMillis() - l1), bg.bQW() });
          c.yP().a(at.AN().gnc.pC());
          GMTrace.o(638742167552L, 4759);
          return;
          label1490:
          if (com.tencent.mm.l.a.eE(((com.tencent.mm.g.b.af)localObject).field_type)) {
            break;
          }
          ((x)localObject).uA();
          at.AR();
          c.yK().a(paramAnonymousc, (x)localObject);
          break;
          label1525:
          if (!paramAnonymousBoolean) {
            break label938;
          }
          paramAnonymousc.uJ();
          c.yK().a("voipapp", paramAnonymousc);
          break label938;
          label1549:
          if (!paramAnonymousBoolean) {
            break label1036;
          }
          w.i("MicroMsg.HardCodeHelper", "do update hardcode official accounts");
          paramAnonymousc.uB();
          c.yK().a("officialaccounts", paramAnonymousc);
          break label1036;
          label1582:
          if (!paramAnonymousBoolean) {
            break label1146;
          }
          paramAnonymousc.uJ();
          c.yK().a("voicevoipapp", paramAnonymousc);
          break label1146;
          label1606:
          if (!paramAnonymousBoolean) {
            break label1262;
          }
          w.i("MicroMsg.HardCodeHelper", "do update hardcode official accounts");
          paramAnonymousc.uB();
          c.yK().a("notifymessage", paramAnonymousc);
          break label1262;
          label1639:
          if (paramAnonymousBoolean)
          {
            w.i("MicroMsg.HardCodeHelper", "do update app brand service message accunt");
            paramAnonymousc.uB();
            c.yK().a("appbrandcustomerservicemsg", paramAnonymousc);
          }
        }
      }
      
      public final void aY(boolean paramAnonymousBoolean)
      {
        GMTrace.i(638876385280L, 4760);
        at.this.gnf.aY(paramAnonymousBoolean);
        GMTrace.o(638876385280L, 4760);
      }
      
      public final void zA()
      {
        GMTrace.i(638607949824L, 4758);
        d.c.aE(Integer.valueOf(9999));
        d.c.aE(Integer.valueOf(41));
        d.c.aE(Integer.valueOf(21));
        d.c.aE(Integer.valueOf(35));
        d.c.aE(Integer.valueOf(-1879048175));
        d.c.aE(Integer.valueOf(-1879048174));
        at.this.gnf.BJ();
        GMTrace.o(638607949824L, 4758);
      }
    };
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xy().a(new com.tencent.mm.kernel.api.e()
    {
      public final void onDataBaseClosed(com.tencent.mm.bu.g paramAnonymousg1, com.tencent.mm.bu.g paramAnonymousg2)
      {
        GMTrace.i(639681691648L, 4766);
        GMTrace.o(639681691648L, 4766);
      }
      
      public final void onDataBaseOpened(com.tencent.mm.bu.g paramAnonymousg1, com.tencent.mm.bu.g paramAnonymousg2)
      {
        GMTrace.i(639279038464L, 4763);
        at.this.gnh.zA();
        GMTrace.o(639279038464L, 4763);
      }
    });
    com.tencent.mm.kernel.h.xz().a(new com.tencent.mm.kernel.api.c()
    {
      public final void onAccountInitialized(e.f paramAnonymousf)
      {
        GMTrace.i(595926712320L, 4440);
        com.tencent.mm.plugin.report.service.g.ork.a(598L, 13L, 1L, false);
        long l = System.currentTimeMillis();
        w.i("MicroMsg.MMCore", "summerasyncinit onAccountInitialized start tid[%d]", new Object[] { Long.valueOf(Thread.currentThread().getId()) });
        c localc = at.this.gmU;
        com.tencent.mm.bu.g localg = com.tencent.mm.kernel.h.xy().fYV;
        Object localObject = com.tencent.mm.kernel.h.xy().fYW;
        localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf();
        ((com.tencent.mm.plugin.messenger.foundation.a.a.c)localObject).a(new am((com.tencent.mm.plugin.messenger.foundation.a.a.c)localObject));
        com.tencent.mm.storage.h localh = new com.tencent.mm.storage.h((com.tencent.mm.plugin.messenger.foundation.a.a.c)localObject);
        localc.glR = localh;
        ((com.tencent.mm.plugin.messenger.foundation.a.a.c)localObject).a(localh);
        localc.glP = new bm(localg, ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP());
        localc.glQ = new bl(localg, ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK());
        localc.glS = new com.tencent.mm.y.b.c();
        localc.glT = new com.tencent.mm.y.b.d();
        localc.glY = new com.tencent.mm.y.b.b();
        localc.glU = new ap(localg);
        localc.glV = new j(localg);
        localc.glW = new com.tencent.mm.storage.n(localg);
        localc.glX = new l(localg);
        com.tencent.mm.plugin.report.service.g.ork.a(598L, 14L, 1L, false);
        w.i("MicroMsg.MMCore", "summerasyncinit onAccountInitialized done initDB take[%d]ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        at.this.gnh.a(at.this.gmU, paramAnonymousf.fZo);
        com.tencent.mm.plugin.report.service.g.ork.a(598L, 15L, 1L, false);
        w.i("MicroMsg.MMCore", "summerasyncinit onAccountInitialized done onAccountPostReset take[%d]ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        at.this.gnh.aY(com.tencent.mm.compatible.util.f.ty());
        com.tencent.mm.plugin.report.service.g.ork.a(598L, 16L, 1L, false);
        w.i("MicroMsg.MMCore", "summerasyncinit onAccountInitialized done all take[%d]ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        GMTrace.o(595926712320L, 4440);
      }
      
      public final void onAccountRelease()
      {
        GMTrace.i(596060930048L, 4441);
        at.AK().BK();
        GMTrace.o(596060930048L, 4441);
      }
    });
    com.tencent.mm.kernel.h.xz().fZF.bT(parama);
    this.gmU = new c();
    com.tencent.mm.plugin.report.service.g.ork.a(99L, 142L, 1L, false);
    r.a(new com.tencent.mm.plugin.zero.a.e()
    {
      public final byte[] a(k.d paramAnonymousd, int paramAnonymousInt)
      {
        GMTrace.i(599147937792L, 4464);
        switch (paramAnonymousInt)
        {
        default: 
          GMTrace.o(599147937792L, 4464);
          return null;
        case 722: 
          paramAnonymousd = ((q.a)paramAnonymousd).tKH.uhR.tUK.uNP.toByteArray();
          GMTrace.o(599147937792L, 4464);
          return paramAnonymousd;
        case 145: 
          paramAnonymousd = ((m.a)paramAnonymousd).tKx.tUK.uNP.toByteArray();
          GMTrace.o(599147937792L, 4464);
          return paramAnonymousd;
        case 107: 
          paramAnonymousd = ((u.a)paramAnonymousd).tKQ.tUK.uNP.toByteArray();
          GMTrace.o(599147937792L, 4464);
          return paramAnonymousd;
        case 429: 
          paramAnonymousd = ((t.a)paramAnonymousd).tKO.tUK.uNP.toByteArray();
          GMTrace.o(599147937792L, 4464);
          return paramAnonymousd;
        case 499: 
          paramAnonymousd = ((com.tencent.mm.plugin.report.b.c.a)paramAnonymousd).oqq.tUK.uNP.toByteArray();
          GMTrace.o(599147937792L, 4464);
          return paramAnonymousd;
        case 694: 
          paramAnonymousd = ((com.tencent.mm.plugin.report.b.b.a)paramAnonymousd).oqq.tUK.uNP.toByteArray();
          GMTrace.o(599147937792L, 4464);
          return paramAnonymousd;
        case 989: 
          paramAnonymousd = ((zb)((b.b)paramAnonymousd).gtK).udJ.toByteArray();
          GMTrace.o(599147937792L, 4464);
          return paramAnonymousd;
        case 987: 
        case 997: 
          paramAnonymousd = ((mz)((b.b)paramAnonymousd).gtK).udJ.toByteArray();
          GMTrace.o(599147937792L, 4464);
          return paramAnonymousd;
        case 481: 
          paramAnonymousd = ((p.a)paramAnonymousd).tKF.tUK.uNP.toByteArray();
          GMTrace.o(599147937792L, 4464);
          return paramAnonymousd;
        case 572: 
          paramAnonymousd = ((s.a)paramAnonymousd).tKN.tUK.uNP.toByteArray();
          GMTrace.o(599147937792L, 4464);
          return paramAnonymousd;
        case 616: 
          paramAnonymousd = ((ax.a)paramAnonymousd).gny.tUK.uNP.toByteArray();
          GMTrace.o(599147937792L, 4464);
          return paramAnonymousd;
        case 617: 
          paramAnonymousd = ((az.a)paramAnonymousd).gnC.tUK.uNP.toByteArray();
          GMTrace.o(599147937792L, 4464);
          return paramAnonymousd;
        case 618: 
          paramAnonymousd = ((ay.a)paramAnonymousd).gnA.tUK.uNP.toByteArray();
          GMTrace.o(599147937792L, 4464);
          return paramAnonymousd;
        }
        paramAnonymousd = ((j.a)paramAnonymousd).tKg;
        GMTrace.o(599147937792L, 4464);
        return paramAnonymousd;
      }
    });
    com.tencent.mm.kernel.h.xz();
    paramai = com.tencent.mm.kernel.h.xx();
    parama = new com.tencent.mm.kernel.api.d()
    {
      public final void b(com.tencent.mm.network.e paramAnonymouse)
      {
        GMTrace.i(617133113344L, 4598);
        p.e(paramAnonymouse);
        p.f(paramAnonymouse);
        GMTrace.o(617133113344L, 4598);
      }
    };
    paramai.fYq.bT(parama);
    GMTrace.o(659948568576L, 4917);
  }
  
  public static boolean AJ()
  {
    GMTrace.i(657666867200L, 4900);
    if (gnd == null)
    {
      GMTrace.o(657666867200L, 4900);
      return true;
    }
    GMTrace.o(657666867200L, 4900);
    return false;
  }
  
  public static br AK()
  {
    GMTrace.i(658606391296L, 4907);
    br localbr = AN().gnf;
    GMTrace.o(658606391296L, 4907);
    return localbr;
  }
  
  public static boolean AL()
  {
    GMTrace.i(659009044480L, 4910);
    boolean bool = com.tencent.mm.kernel.a.wE();
    GMTrace.o(659009044480L, 4910);
    return bool;
  }
  
  public static c.a AM()
  {
    GMTrace.i(659814350848L, 4916);
    c.a locala = AN().gnh;
    GMTrace.o(659814350848L, 4916);
    return locala;
  }
  
  public static at AN()
  {
    GMTrace.i(660082786304L, 4918);
    Assert.assertNotNull("MMCore not initialized by MMApplication", gnd);
    at localat = gnd;
    GMTrace.o(660082786304L, 4918);
    return localat;
  }
  
  public static com.tencent.mm.ad.v AO()
  {
    GMTrace.i(660217004032L, 4919);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.ad.v localv = com.tencent.mm.kernel.h.xw().fXT;
    GMTrace.o(660217004032L, 4919);
    return localv;
  }
  
  public static com.tencent.mm.storage.s AP()
  {
    GMTrace.i(660351221760L, 4920);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.storage.s locals = com.tencent.mm.kernel.h.xy().fYL;
    GMTrace.o(660351221760L, 4920);
    return locals;
  }
  
  public static void AQ()
  {
    GMTrace.i(661156528128L, 4926);
    com.tencent.mm.g.a.aa localaa = new com.tencent.mm.g.a.aa();
    com.tencent.mm.sdk.b.a.vgX.m(localaa);
    GMTrace.o(661156528128L, 4926);
  }
  
  public static c AR()
  {
    GMTrace.i(661290745856L, 4927);
    c localc = AN().gmU;
    if (localc != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("MMCore has not been initialize ?", bool);
      GMTrace.o(661290745856L, 4927);
      return localc;
    }
  }
  
  public static com.tencent.mm.compatible.b.e AS()
  {
    GMTrace.i(661559181312L, 4929);
    com.tencent.mm.compatible.b.e locale = com.tencent.mm.compatible.b.e.sd();
    GMTrace.o(661559181312L, 4929);
    return locale;
  }
  
  public static boolean AT()
  {
    GMTrace.i(661693399040L, 4930);
    com.tencent.mm.kernel.h.xw();
    boolean bool = com.tencent.mm.kernel.a.wK();
    GMTrace.o(661693399040L, 4930);
    return bool;
  }
  
  public static boolean AU()
  {
    GMTrace.i(661827616768L, 4931);
    if (!ab.bPY())
    {
      GMTrace.o(661827616768L, 4931);
      return false;
    }
    boolean bool = com.tencent.mm.kernel.h.xw().wL();
    GMTrace.o(661827616768L, 4931);
    return bool;
  }
  
  public static f AV()
  {
    GMTrace.i(14456859918336L, 107712);
    f localf = AN().gnq;
    GMTrace.o(14456859918336L, 107712);
    return localf;
  }
  
  public static void a(com.tencent.mm.network.n paramn)
  {
    GMTrace.i(658069520384L, 4903);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().a(paramn);
    GMTrace.o(658069520384L, 4903);
  }
  
  public static void a(ag paramag)
  {
    GMTrace.i(658874826752L, 4909);
    com.tencent.mm.kernel.e locale = com.tencent.mm.kernel.h.xy();
    synchronized (locale.fYS)
    {
      locale.fYS.add(paramag);
      GMTrace.o(658874826752L, 4909);
      return;
    }
  }
  
  public static void a(ah paramah)
  {
    GMTrace.i(658337955840L, 4905);
    com.tencent.mm.kernel.b.a(paramah);
    GMTrace.o(658337955840L, 4905);
  }
  
  public static void a(ai paramai, n.a parama)
  {
    GMTrace.i(659411697664L, 4913);
    gnd = new at(paramai, parama);
    com.tencent.mm.modelstat.n.bt(ab.getContext());
    GMTrace.o(659411697664L, 4913);
  }
  
  public static void b(com.tencent.mm.network.n paramn)
  {
    GMTrace.i(658203738112L, 4904);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().b(paramn);
    GMTrace.o(658203738112L, 4904);
  }
  
  public static void bg(boolean paramBoolean)
  {
    GMTrace.i(659143262208L, 4911);
    com.tencent.mm.kernel.a.bd(paramBoolean);
    GMTrace.o(659143262208L, 4911);
  }
  
  public static void eJ(String paramString)
  {
    GMTrace.i(658472173568L, 4906);
    com.tencent.mm.kernel.a.eJ(paramString);
    GMTrace.o(658472173568L, 4906);
  }
  
  public static int eK(String paramString)
  {
    GMTrace.i(661022310400L, 4925);
    int i = com.tencent.mm.kernel.a.eK(paramString);
    GMTrace.o(661022310400L, 4925);
    return i;
  }
  
  public static aj getNotification()
  {
    GMTrace.i(659545915392L, 4914);
    aj localaj = AN().gnc.getNotification();
    GMTrace.o(659545915392L, 4914);
    return localaj;
  }
  
  public static bt getSysCmdMsgExtension()
  {
    GMTrace.i(660619657216L, 4922);
    bt localbt = ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension();
    GMTrace.o(660619657216L, 4922);
    return localbt;
  }
  
  public static void hold()
  {
    GMTrace.i(662096052224L, 4933);
    com.tencent.mm.kernel.a.hold();
    GMTrace.o(662096052224L, 4933);
  }
  
  public static ac pD()
  {
    GMTrace.i(659680133120L, 4915);
    ac localac = AN().gnc.pD();
    GMTrace.o(659680133120L, 4915);
    return localac;
  }
  
  public static void unhold()
  {
    GMTrace.i(662230269952L, 4934);
    com.tencent.mm.kernel.a.unhold();
    GMTrace.o(662230269952L, 4934);
  }
  
  public static boolean wF()
  {
    GMTrace.i(661961834496L, 4932);
    boolean bool = com.tencent.mm.kernel.a.wF();
    GMTrace.o(661961834496L, 4932);
    return bool;
  }
  
  public static String wN()
  {
    GMTrace.i(660753874944L, 4923);
    String str = com.tencent.mm.kernel.a.wN();
    GMTrace.o(660753874944L, 4923);
    return str;
  }
  
  public static void wO()
  {
    GMTrace.i(660888092672L, 4924);
    com.tencent.mm.kernel.a.wO();
    GMTrace.o(660888092672L, 4924);
  }
  
  public static byte[] wR()
  {
    GMTrace.i(659277479936L, 4912);
    try
    {
      com.tencent.mm.kernel.h.xz();
      byte[] arrayOfByte = com.tencent.mm.kernel.h.xx().wR();
      GMTrace.o(659277479936L, 4912);
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      w.w("MicroMsg.MMCore", "get session key error, %s", new Object[] { localException.getMessage() });
      w.e("MicroMsg.MMCore", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(659277479936L, 4912);
    }
    return null;
  }
  
  public static com.tencent.mm.ad.n wS()
  {
    GMTrace.i(661424963584L, 4928);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.ad.n localn = com.tencent.mm.kernel.h.xx().fYr;
    GMTrace.o(661424963584L, 4928);
    return localn;
  }
  
  public static String wy()
  {
    GMTrace.i(662364487680L, 4935);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xw();
    String str = com.tencent.mm.kernel.a.wy();
    GMTrace.o(662364487680L, 4935);
    return str;
  }
  
  public static bw xA()
  {
    GMTrace.i(658740609024L, 4908);
    AN();
    bw localbw = com.tencent.mm.kernel.h.xA();
    GMTrace.o(658740609024L, 4908);
    return localbw;
  }
  
  public static com.tencent.mm.sdk.platformtools.af xB()
  {
    GMTrace.i(660485439488L, 4921);
    com.tencent.mm.sdk.platformtools.af localaf = com.tencent.mm.kernel.h.xB();
    GMTrace.o(660485439488L, 4921);
    return localaf;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */