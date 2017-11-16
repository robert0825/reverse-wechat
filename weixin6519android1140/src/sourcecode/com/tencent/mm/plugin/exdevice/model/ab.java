package com.tencent.mm.plugin.exdevice.model;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.i;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.gt;
import com.tencent.mm.g.a.gt.a;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.agx;
import com.tencent.mm.protocal.c.agy;
import com.tencent.mm.protocal.c.alv;
import com.tencent.mm.protocal.c.aos;
import com.tencent.mm.protocal.c.bas;
import com.tencent.mm.protocal.c.bgm;
import com.tencent.mm.protocal.c.bhl;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.protocal.c.cb;
import com.tencent.mm.protocal.c.oo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.LinkedList;

public final class ab
  extends com.tencent.mm.sdk.b.c<gt>
  implements com.tencent.mm.ad.e
{
  private ProgressDialog htG;
  public gt kAk;
  
  public ab()
  {
    GMTrace.i(10990150221824L, 81883);
    this.vhf = gt.class.getName().hashCode();
    GMTrace.o(10990150221824L, 81883);
  }
  
  private boolean a(final gt paramgt)
  {
    GMTrace.i(10990284439552L, 81884);
    if (!(paramgt instanceof gt))
    {
      w.f("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "mismatched event");
      GMTrace.o(10990284439552L, 81884);
      return false;
    }
    this.kAk = paramgt;
    paramgt = this.kAk.eJT.result;
    w.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "action = %s, key = %s", new Object[] { Integer.valueOf(this.kAk.eJT.actionCode), paramgt });
    if (bg.nm(paramgt))
    {
      GMTrace.o(10990284439552L, 81884);
      return false;
    }
    switch (this.kAk.eJT.actionCode)
    {
    }
    for (;;)
    {
      GMTrace.o(10990284439552L, 81884);
      return false;
      if ((this.kAk.eJT.context == null) || (!(this.kAk.eJT.context instanceof Activity)))
      {
        GMTrace.o(10990284439552L, 81884);
        return false;
      }
      at.wS().a(540, this);
      paramgt = new u(paramgt);
      at.wS().a(paramgt, 0);
      Context localContext = this.kAk.eJT.context;
      this.kAk.eJT.context.getString(R.l.cUG);
      this.htG = com.tencent.mm.ui.base.h.a(localContext, this.kAk.eJT.context.getString(R.l.dVv), new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(10955119394816L, 81622);
          at.wS().c(paramgt);
          if (ab.this.kAk.eDO != null)
          {
            ab.this.kAk.eJU.ret = 1;
            ab.this.kAk.eDO.run();
          }
          GMTrace.o(10955119394816L, 81622);
        }
      });
    }
  }
  
  private void agW()
  {
    GMTrace.i(10990687092736L, 81887);
    if ((this.kAk != null) && (this.kAk.eDO != null))
    {
      this.kAk.eJU.ret = 2;
      this.kAk.eDO.run();
    }
    GMTrace.o(10990687092736L, 81887);
  }
  
  private void atP()
  {
    GMTrace.i(10990552875008L, 81886);
    if ((this.kAk != null) && (this.kAk.eDO != null))
    {
      this.kAk.eJU.ret = 1;
      this.kAk.eDO.run();
    }
    GMTrace.o(10990552875008L, 81886);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(10990418657280L, 81885);
    w.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "onSceneEnd errType = " + paramInt1 + ", errCode = " + paramInt2 + ",errMsg = " + paramString);
    if ((this.htG != null) && (this.htG.isShowing())) {
      this.htG.dismiss();
    }
    if (paramk == null)
    {
      atP();
      GMTrace.o(10990418657280L, 81885);
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      w.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "scene.getType() = %s", new Object[] { Integer.valueOf(paramk.getType()) });
      atP();
      GMTrace.o(10990418657280L, 81885);
      return;
    }
    w.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "scene.getType() = %s", new Object[] { Integer.valueOf(paramk.getType()) });
    bas localbas;
    agx localagx;
    agy localagy;
    Object localObject3;
    Object localObject2;
    Object localObject1;
    if (paramk.getType() == 540)
    {
      at.wS().b(540, this);
      paramString = (u)paramk;
      if ((paramString.fUa != null) && (paramString.fUa.gtD.gtK != null)) {}
      for (localbas = (bas)paramString.fUa.gtD.gtK; localbas == null; localbas = null)
      {
        w.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "resp == null");
        atP();
        GMTrace.o(10990418657280L, 81885);
        return;
      }
      localagx = localbas.tUt;
      w.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "deviceId = %s, deviceType = %s", new Object[] { localagx.jhl, localagx.tSz });
      localagy = localbas.tUu;
      w.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "AuthKey = %s, BrandName = %s, CloseStrategy = %s, ConnProto = %s, ConnStrategy = %s, Mac = %s", new Object[] { localagy.tSi, localagy.uwj, Integer.valueOf(localagy.uwm), localagy.uwk, Integer.valueOf(localagy.uwl), localagy.tTU });
      paramString = "";
      paramk = "";
      localObject3 = new LinkedList();
      localObject2 = paramString;
      localObject1 = paramk;
      if (localbas.uOp == null) {
        break label2465;
      }
      if (localbas.uOp.tQp != null) {
        paramString = localbas.uOp.tQp;
      }
      if (localbas.uOp.title != null) {
        paramk = localbas.uOp.title;
      }
      localObject2 = paramString;
      localObject1 = paramk;
      if (localbas.uOp.tQq == null) {
        break label2465;
      }
      localObject1 = localbas.uOp.tQq;
      localObject2 = paramk;
      paramk = paramString;
    }
    for (paramString = (String)localObject2;; paramString = (String)localObject2)
    {
      localObject2 = new ArrayList();
      if ((localObject1 != null) && (((LinkedList)localObject1).size() > 0))
      {
        paramInt1 = 0;
        while (paramInt1 < ((LinkedList)localObject1).size())
        {
          localObject3 = (bhl)((LinkedList)localObject1).get(paramInt1);
          if (((bhl)localObject3).type.contains("text")) {
            ((ArrayList)localObject2).add(((bhl)localObject3).content);
          }
          paramInt1 += 1;
        }
      }
      w.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "resp.BindTicket = %s", new Object[] { localbas.tTZ });
      boolean bool;
      if (localbas.uOo == 1)
      {
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("device_scan_mode", "SCAN_CATALOG");
        if ((localagy.uwk.contains("3")) || (localagy.uwk.contains("1"))) {}
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          bool = localagy.uwk.contains("4");
          if ((paramInt1 == 0) || (!bool)) {
            break;
          }
          w.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "Category connect proto can not be blue&wifi at the same time...");
          GMTrace.o(10990418657280L, 81885);
          return;
        }
        if (paramInt1 != 0) {
          ((Intent)localObject1).putExtra("device_scan_conn_proto", "blue");
        }
        for (;;)
        {
          ((Intent)localObject1).putExtra("device_id", localagx.jhl);
          ((Intent)localObject1).putExtra("device_type", localagx.tSz);
          ((Intent)localObject1).putExtra("device_title", localagy.uwq);
          ((Intent)localObject1).putExtra("device_desc", localagy.uwr);
          ((Intent)localObject1).putExtra("device_icon_url", localagy.lRV);
          ((Intent)localObject1).putExtra("device_category_id", localagy.uws);
          ((Intent)localObject1).putExtra("device_brand_name", localagy.uwj);
          ((Intent)localObject1).putExtra("bind_ticket", localbas.tTZ);
          ((Intent)localObject1).putExtra("device_ble_simple_proto", localagy.fsK);
          ((Intent)localObject1).putExtra("device_airkiss_key", paramk);
          ((Intent)localObject1).putExtra("device_airkiss_title", paramString);
          ((Intent)localObject1).putStringArrayListExtra("device_airkiss_steps", (ArrayList)localObject2);
          com.tencent.mm.bj.d.b(this.kAk.eJT.context, "exdevice", ".ui.ExdeviceBindDeviceGuideUI", (Intent)localObject1);
          agW();
          GMTrace.o(10990418657280L, 81885);
          return;
          if (bool) {
            ((Intent)localObject1).putExtra("device_scan_conn_proto", "wifi");
          }
        }
      }
      paramString = localbas.tUa;
      if (paramString == null)
      {
        w.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "mContact == null");
        atP();
        GMTrace.o(10990418657280L, 81885);
        return;
      }
      agW();
      if (paramString == null) {
        w.f("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "unable to parse mod contact");
      }
      for (;;)
      {
        paramk = com.tencent.mm.platformtools.n.a(paramString.ufy);
        if ((this.kAk != null) && (this.kAk.eJT != null) && (this.kAk.eJT.context != null)) {
          break;
        }
        w.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "a8KeyRedirectEvent null");
        GMTrace.o(10990418657280L, 81885);
        return;
        paramk = com.tencent.mm.platformtools.n.a(paramString.ufy);
        localObject1 = bg.nl(paramString.uEu);
        if ((bg.nm(paramk)) && (bg.nm((String)localObject1)))
        {
          w.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "processModContact user is null user:%s enuser:%s", new Object[] { paramk, localObject1 });
        }
        else
        {
          w.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "processModContact : %s", new Object[] { paramk });
          at.AR();
          localObject2 = com.tencent.mm.y.c.yK().TE(paramk);
          if ((localObject2 != null) && (paramk.equals(((af)localObject2).field_encryptUsername)))
          {
            w.w("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "cat's replace user with stranger");
          }
          else
          {
            localObject3 = new com.tencent.mm.storage.x(paramk);
            ((com.tencent.mm.storage.x)localObject3).ci(paramString.gCC);
            ((com.tencent.mm.storage.x)localObject3).setType(paramString.ueF & paramString.ueG);
            label1168:
            long l;
            if (!bg.nm((String)localObject1))
            {
              ((com.tencent.mm.storage.x)localObject3).cr((String)localObject1);
              if (localObject2 != null) {
                break label1701;
              }
              l = 0L;
              label1176:
              ((com.tencent.mm.storage.x)localObject3).fTq = l;
              ((com.tencent.mm.storage.x)localObject3).cl(com.tencent.mm.platformtools.n.a(paramString.uxT));
              ((com.tencent.mm.storage.x)localObject3).cm(com.tencent.mm.platformtools.n.a(paramString.ufo));
              ((com.tencent.mm.storage.x)localObject3).cn(com.tencent.mm.platformtools.n.a(paramString.ufp));
              ((com.tencent.mm.storage.x)localObject3).jdMethod_do(paramString.gCx);
              ((com.tencent.mm.storage.x)localObject3).dr(paramString.ueL);
              ((com.tencent.mm.storage.x)localObject3).ck(com.tencent.mm.platformtools.n.a(paramString.uEo));
              ((com.tencent.mm.storage.x)localObject3).ds(paramString.ueP);
              ((com.tencent.mm.storage.x)localObject3).dt(paramString.gCB);
              ((com.tencent.mm.storage.x)localObject3).cE(RegionCodeDecoder.ai(paramString.gCG, paramString.gCy, paramString.gCz));
              ((com.tencent.mm.storage.x)localObject3).cy(paramString.gCA);
              ((com.tencent.mm.storage.x)localObject3).dk(paramString.uAv);
              ((com.tencent.mm.storage.x)localObject3).cD(paramString.uAw);
              ((com.tencent.mm.storage.x)localObject3).setSource(paramString.tQP);
              ((com.tencent.mm.storage.x)localObject3).dj(paramString.uAz);
              ((com.tencent.mm.storage.x)localObject3).co(paramString.uAy);
              if (s.gs(paramString.uAx)) {
                ((com.tencent.mm.storage.x)localObject3).cC(paramString.uAx);
              }
              ((com.tencent.mm.storage.x)localObject3).dv((int)bg.Pu());
              ((com.tencent.mm.storage.x)localObject3).cj(com.tencent.mm.platformtools.n.a(paramString.uDR));
              ((com.tencent.mm.storage.x)localObject3).cp(com.tencent.mm.platformtools.n.a(paramString.uDT));
              ((com.tencent.mm.storage.x)localObject3).cq(com.tencent.mm.platformtools.n.a(paramString.uDS));
              ((com.tencent.mm.storage.x)localObject3).cF(paramString.tRP);
              ((com.tencent.mm.storage.x)localObject3).cG(paramString.uEE);
              if ((localObject2 != null) && (!bg.nl(((af)localObject2).fju).equals(bg.nl(paramString.uEE))))
              {
                com.tencent.mm.ay.c.Kn();
                com.tencent.mm.ay.c.kH(paramk);
              }
              at.AR();
              com.tencent.mm.y.c.yK().TJ(paramk);
              if (!bg.nm(((af)localObject3).field_username)) {
                break label1713;
              }
              w.e("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "dkinit dealModContactExtInfo failed invalid contact");
              label1493:
              ((com.tencent.mm.storage.x)localObject3).dm(paramString.uED);
              if ((paramString.uEz != null) && (paramString.uEz.tQk != null))
              {
                ((com.tencent.mm.storage.x)localObject3).cH(paramString.uEz.tQk.tUw);
                ((com.tencent.mm.storage.x)localObject3).cI(paramString.uEz.tQk.tUx);
                ((com.tencent.mm.storage.x)localObject3).cJ(paramString.uEz.tQk.tUy);
              }
              if (s.gm(paramk)) {
                ((com.tencent.mm.storage.x)localObject3).uJ();
              }
              if (((com.tencent.mm.storage.x)localObject3).bSA()) {
                ((com.tencent.mm.storage.x)localObject3).uM();
              }
              if (bg.nm((String)localObject1)) {
                break label2043;
              }
              at.AR();
              com.tencent.mm.y.c.yK().b((String)localObject1, (com.tencent.mm.storage.x)localObject3);
            }
            for (;;)
            {
              if ((localObject2 == null) || ((((af)localObject2).field_type & 0x800) == (((af)localObject3).field_type & 0x800))) {
                break label2059;
              }
              if ((((af)localObject3).field_type & 0x800) == 0) {
                break label2061;
              }
              at.AR();
              com.tencent.mm.y.c.yP().TT(((af)localObject3).field_username);
              break;
              if ((localObject2 == null) || ((int)((com.tencent.mm.l.a)localObject2).fTq <= 0)) {
                break label1168;
              }
              ((com.tencent.mm.storage.x)localObject3).cr(((af)localObject2).field_encryptUsername);
              break label1168;
              label1701:
              l = (int)((com.tencent.mm.l.a)localObject2).fTq;
              break label1176;
              label1713:
              Object localObject4 = ((af)localObject3).field_username;
              Object localObject5 = com.tencent.mm.ac.b.a((String)localObject4, paramString);
              com.tencent.mm.ac.n.Di().a((com.tencent.mm.ac.h)localObject5);
              localObject5 = paramString.uAB;
              if ((!((af)localObject3).field_username.endsWith("@chatroom")) && (localObject5 != null))
              {
                w.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "SnsFlag modcontact " + ((bgm)localObject5).gCI + " " + paramString.ufy);
                w.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "SnsBg modcontact " + ((bgm)localObject5).gCJ);
                w.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "SnsBgId modcontact " + ((bgm)localObject5).gCK);
                w.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "SnsBgId modcontact " + ((bgm)localObject5).uSi);
                if (com.tencent.mm.plugin.sns.b.n.poP != null) {
                  com.tencent.mm.plugin.sns.b.n.poP.a(((af)localObject3).field_username, (bgm)localObject5);
                }
              }
              localObject5 = q.zE();
              if ((localObject5 == null) || (((String)localObject5).equals(localObject4))) {
                break label1493;
              }
              localObject5 = com.tencent.mm.af.x.FG().iC((String)localObject4);
              ((com.tencent.mm.af.d)localObject5).field_username = ((String)localObject4);
              ((com.tencent.mm.af.d)localObject5).field_brandList = paramString.gCH;
              localObject4 = paramString.uAC;
              if (localObject4 != null)
              {
                ((com.tencent.mm.af.d)localObject5).field_brandFlag = ((oo)localObject4).gCL;
                ((com.tencent.mm.af.d)localObject5).field_brandInfo = ((oo)localObject4).gCN;
                ((com.tencent.mm.af.d)localObject5).field_brandIconURL = ((oo)localObject4).gCO;
                ((com.tencent.mm.af.d)localObject5).field_extInfo = ((oo)localObject4).gCM;
                ((com.tencent.mm.af.d)localObject5).field_attrSyncVersion = null;
                ((com.tencent.mm.af.d)localObject5).field_incrementUpdateTime = 0L;
              }
              if (!com.tencent.mm.af.x.FG().e((com.tencent.mm.af.d)localObject5)) {
                com.tencent.mm.af.x.FG().d((com.tencent.mm.af.d)localObject5);
              }
              ((com.tencent.mm.storage.x)localObject3).dw(((com.tencent.mm.af.d)localObject5).field_type);
              break label1493;
              label2043:
              at.AR();
              com.tencent.mm.y.c.yK().Q((com.tencent.mm.storage.x)localObject3);
            }
            label2059:
            continue;
            label2061:
            at.AR();
            com.tencent.mm.y.c.yP().TU(((af)localObject3).field_username);
          }
        }
      }
      at.AR();
      paramString = com.tencent.mm.y.c.yK().TE(paramk);
      if (paramString != null)
      {
        if (localagy.fsJ != 0)
        {
          w.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "Jump to DeviceProfileUI.");
          paramk = this.kAk.eJT.context;
          localObject1 = new Intent(paramk, ExdeviceDeviceProfileUI.class);
          if (!(paramk instanceof Activity)) {
            ((Intent)localObject1).addFlags(268435456);
          }
          ((Intent)localObject1).putExtra("device_id", localagx.jhl);
          ((Intent)localObject1).putExtra("device_type", localagx.tSz);
          ((Intent)localObject1).putExtra("device_mac", localagy.tTU);
          ((Intent)localObject1).putExtra("device_brand_name", localagy.uwj);
          ((Intent)localObject1).putExtra("device_alias", localagy.gCC);
          ((Intent)localObject1).putExtra("device_desc", localagy.uwr);
          ((Intent)localObject1).putExtra("device_title", localagy.uwq);
          ((Intent)localObject1).putExtra("device_icon_url", localagy.lRV);
          ((Intent)localObject1).putExtra("device_jump_url", localagy.lPE);
          ((Intent)localObject1).putExtra("bind_ticket", localbas.tTZ);
          if (ad.atR().bZ(paramString.field_username, localagx.jhl) != null) {}
          for (bool = true;; bool = false)
          {
            ((Intent)localObject1).putExtra("device_has_bound", bool);
            paramk.startActivity((Intent)localObject1);
            GMTrace.o(10990418657280L, 81885);
            return;
          }
        }
        w.i("MicroMsg.exdevice.SearchDeviceGetA8KeyRedirectListener", "Jump to ContactInfoUI.");
        paramString = new Intent();
        paramString.putExtra("Contact_User", paramk);
        paramString.putExtra("KIsHardDevice", true);
        paramString.putExtra("KHardDeviceBindTicket", localbas.tTZ);
        paramString.putExtra("device_id", localagx.jhl);
        paramString.putExtra("device_type", localagx.tSz);
        com.tencent.mm.plugin.exdevice.a.kwJ.d(paramString, this.kAk.eJT.context);
        GMTrace.o(10990418657280L, 81885);
        return;
      }
      GMTrace.o(10990418657280L, 81885);
      return;
      label2465:
      paramk = (k)localObject2;
      paramString = (String)localObject3;
      localObject2 = localObject1;
      localObject1 = paramString;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */