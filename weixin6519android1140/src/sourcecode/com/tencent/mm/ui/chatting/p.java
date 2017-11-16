package com.tencent.mm.ui.chatting;

import android.os.Looper;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.g;
import com.tencent.mm.ad.g.a;
import com.tencent.mm.ad.g.b;
import com.tencent.mm.compatible.b.e;
import com.tencent.mm.compatible.b.e.a;
import com.tencent.mm.g.a.nt;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.SensorController.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.ax;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.ac;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class p
  implements g.a, g.b, e.a, com.tencent.mm.modelvoice.c, SensorController.a, com.tencent.mm.y.ad
{
  private static SensorController jrf;
  private int ewG;
  private boolean ewI;
  public boolean jri;
  private ax jrj;
  public long jrk;
  private boolean jrp;
  boolean jsO;
  g lbS;
  private List<au> wsZ;
  public long wta;
  private com.tencent.mm.ui.base.q wtb;
  public com.tencent.mm.ui.u wtc;
  public com.tencent.mm.ui.chatting.b.h wtd;
  public com.tencent.mm.ui.chatting.b.w wte;
  public com.tencent.mm.ui.base.q wtf;
  public boolean wtg;
  public boolean wth;
  public boolean wti;
  public com.tencent.mm.sdk.b.c wtj;
  private ae wtk;
  private ae wtl;
  
  public p(com.tencent.mm.ui.chatting.b.h paramh, com.tencent.mm.ui.chatting.b.w paramw, String paramString)
  {
    GMTrace.i(19182934556672L, 142924);
    this.jsO = false;
    this.wta = -1L;
    this.jrk = -1L;
    this.wth = true;
    this.wti = false;
    this.ewI = false;
    this.wtj = new com.tencent.mm.sdk.b.c() {};
    this.wtk = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        boolean bool = true;
        GMTrace.i(2265192595456L, 16877);
        super.handleMessage(paramAnonymousMessage);
        try
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AutoPlay", "reset speaker");
          p.this.wtc.dp(true);
          paramAnonymousMessage = p.this;
          if (!p.this.wte.jrl) {}
          for (;;)
          {
            paramAnonymousMessage.jri = bool;
            GMTrace.o(2265192595456L, 16877);
            return;
            bool = false;
          }
          return;
        }
        catch (Exception paramAnonymousMessage)
        {
          com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.AutoPlay", paramAnonymousMessage, "", new Object[0]);
          GMTrace.o(2265192595456L, 16877);
        }
      }
    };
    this.wtl = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(16458314678272L, 122624);
        super.handleMessage(paramAnonymousMessage);
        try
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AutoPlay", "startPlayHandler start Play");
          p.this.cbR();
          GMTrace.o(16458314678272L, 122624);
          return;
        }
        catch (Exception paramAnonymousMessage)
        {
          com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.AutoPlay", paramAnonymousMessage, "", new Object[0]);
          GMTrace.o(16458314678272L, 122624);
        }
      }
    };
    this.jrp = false;
    this.wtc = paramh.cdg();
    this.wtd = paramh;
    this.wte = paramw;
    if (jrf == null) {
      jrf = new SensorController(this.wtc.bWQ().getApplicationContext());
    }
    if (this.jrj == null) {
      this.jrj = new ax(this.wtc.bWQ().getApplicationContext());
    }
    VT(paramString);
    com.tencent.mm.sdk.b.a.vgX.b(this.wtj);
    at.pD().a(this);
    GMTrace.o(19182934556672L, 142924);
  }
  
  private void bZV()
  {
    GMTrace.i(17906926616576L, 133417);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17888136134656L, 133277);
        if ((p.this.wtc != null) && (p.this.wtd.cdn() != null))
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AutoPlay", "resetAutoPlay notifyDataSetChanged");
          p.this.wtd.cdn().notifyDataSetChanged();
        }
        GMTrace.o(17888136134656L, 133277);
      }
    });
    GMTrace.o(17906926616576L, 133417);
  }
  
  private void cbP()
  {
    GMTrace.i(2389478211584L, 17803);
    int k = this.wsZ.size();
    int i = 0;
    int j = -1;
    if (i < k)
    {
      if (((au)this.wsZ.get(i)).field_msgId != this.wta) {
        break label116;
      }
      j = i;
    }
    label116:
    for (;;)
    {
      i += 1;
      break;
      if (j != -1) {
        this.wsZ.remove(j);
      }
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AutoPlay", "remove voice msg : size = " + this.wsZ.size());
      GMTrace.o(2389478211584L, 17803);
      return;
    }
  }
  
  private void cbT()
  {
    GMTrace.i(2390149300224L, 17808);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AutoPlay", "stop play complete");
    com.tencent.mm.sdk.platformtools.ad.RT("keep_app_silent");
    this.wte.releaseWakeLock();
    cbP();
    if ((this.wsZ.isEmpty()) && (this.ewI))
    {
      e.sd().sg();
      this.ewI = false;
    }
    e.sd().b(this);
    if (this.wsZ.isEmpty())
    {
      jrf.bQD();
      this.jrj.bQE();
    }
    bZV();
    this.wta = -1L;
    cbU();
    GMTrace.o(2390149300224L, 17808);
  }
  
  public final void AA()
  {
    GMTrace.i(2391088824320L, 17815);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AutoPlay", "phone comming or record start, stop play");
    lV(true);
    cbN();
    try
    {
      if (jrf != null) {
        jrf.bQD();
      }
      if (this.jrj != null) {
        this.jrj.bQE();
      }
      GMTrace.o(2391088824320L, 17815);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.AutoPlay", localException, "reset sensor error: %s", new Object[] { localException.getMessage() });
      GMTrace.o(2391088824320L, 17815);
    }
  }
  
  public final void Az()
  {
    GMTrace.i(2390954606592L, 17814);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AutoPlay", "phone or record stop, resume and do nothing");
    GMTrace.o(2390954606592L, 17814);
  }
  
  public final void CC(int paramInt)
  {
    GMTrace.i(2388270252032L, 17794);
    for (;;)
    {
      if (this.wtc == null)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AutoPlay", "context is null");
        GMTrace.o(2388270252032L, 17794);
        return;
      }
      Object localObject = this.wtd.cdn();
      if (localObject == null)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AutoPlay", "add next failed: null adapter");
        GMTrace.o(2388270252032L, 17794);
        return;
      }
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AutoPlay", "position : " + paramInt + "adapter getCount = " + ((cv)localObject).getCount());
      if ((paramInt < 0) || (paramInt >= ((cv)localObject).getCount()))
      {
        GMTrace.o(2388270252032L, 17794);
        return;
      }
      localObject = (au)((cv)localObject).getItem(paramInt);
      if (localObject == null)
      {
        GMTrace.o(2388270252032L, 17794);
        return;
      }
      if ((((au)localObject).bTu()) && (((ce)localObject).field_isSend == 0) && (!com.tencent.mm.modelvoice.q.B((au)localObject)) && (!com.tencent.mm.modelvoice.q.C((au)localObject))) {
        ag((au)localObject);
      }
      paramInt += 1;
    }
  }
  
  public final void VT(String paramString)
  {
    GMTrace.i(2388001816576L, 17792);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AutoPlay", "changeTalker, isResumeFromDisableScreen: %b", new Object[] { Boolean.valueOf(this.wti) });
    if ((this.wti) || (this.wtc == null))
    {
      GMTrace.o(2388001816576L, 17792);
      return;
    }
    this.wsZ = new LinkedList();
    this.jsO = false;
    this.wta = -1L;
    this.jri = false;
    this.jrk = -1L;
    this.wtg = false;
    this.ewG = 0;
    if (s.fY(paramString))
    {
      this.ewG = 1;
      this.lbS = new com.tencent.mm.e.a.a(this.wtc.bWQ(), 1);
      GMTrace.o(2388001816576L, 17792);
      return;
    }
    this.ewG = 0;
    this.lbS = new com.tencent.mm.e.a.a(this.wtc.bWQ(), 0);
    GMTrace.o(2388001816576L, 17792);
  }
  
  public final void a(int paramInt, au paramau)
  {
    GMTrace.i(2388538687488L, 17796);
    if ((paramau == null) || (!paramau.bTu()))
    {
      GMTrace.o(2388538687488L, 17796);
      return;
    }
    Object localObject = new com.tencent.mm.modelvoice.n(paramau.field_content);
    if (((((com.tencent.mm.modelvoice.n)localObject).time == 0L) && (paramau.field_isSend == 0)) || ((paramau.field_status == 1) && (paramau.field_isSend == 1)))
    {
      GMTrace.o(2388538687488L, 17796);
      return;
    }
    if ((paramau.field_isSend == 0) && (((com.tencent.mm.modelvoice.n)localObject).time == -1L))
    {
      GMTrace.o(2388538687488L, 17796);
      return;
    }
    cbN();
    at.AR();
    localObject = (Boolean)com.tencent.mm.y.c.xh().get(4115, null);
    if ((localObject == null) || (!((Boolean)localObject).booleanValue()))
    {
      at.AR();
      com.tencent.mm.y.c.xh().set(4115, Boolean.valueOf(true));
      cbU();
      this.wtf = com.tencent.mm.ui.base.u.a(this.wtc.bWQ(), this.wtc.getString(R.l.dgD), 4000L);
    }
    if ((this.lbS.isPlaying()) && (paramau.field_msgId == this.wta))
    {
      lV(true);
      GMTrace.o(2388538687488L, 17796);
      return;
    }
    ag(paramau);
    if ((paramau.field_isSend == 0) && (!com.tencent.mm.modelvoice.q.B(paramau))) {
      CC(paramInt + 1);
    }
    cbQ();
    GMTrace.o(2388538687488L, 17796);
  }
  
  public final void ag(au paramau)
  {
    GMTrace.i(2388404469760L, 17795);
    if (paramau == null)
    {
      GMTrace.o(2388404469760L, 17795);
      return;
    }
    at.AR();
    if (!com.tencent.mm.y.c.isSDCardAvailable())
    {
      if (this.wsZ.size() > 0)
      {
        this.wsZ.clear();
        com.tencent.mm.ui.base.u.fo(this.wtc.bWQ());
      }
      GMTrace.o(2388404469760L, 17795);
      return;
    }
    int j = this.wsZ.size();
    int i = 0;
    while (i < j)
    {
      if (((au)this.wsZ.get(i)).field_msgId == paramau.field_msgId)
      {
        GMTrace.o(2388404469760L, 17795);
        return;
      }
      i += 1;
    }
    if ((this.wtg) || (this.wsZ.size() == 0)) {
      this.wsZ.add(paramau);
    }
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AutoPlay", "add voice msg :" + this.wsZ.size());
    GMTrace.o(2388404469760L, 17795);
  }
  
  public final void b(int paramInt, au paramau)
  {
    GMTrace.i(2388672905216L, 17797);
    if (paramau == null)
    {
      GMTrace.o(2388672905216L, 17797);
      return;
    }
    cbN();
    at.AR();
    Boolean localBoolean = (Boolean)com.tencent.mm.y.c.xh().get(4115, null);
    if ((localBoolean == null) || (!localBoolean.booleanValue()))
    {
      at.AR();
      com.tencent.mm.y.c.xh().set(4115, Boolean.valueOf(true));
      cbU();
      this.wtf = com.tencent.mm.ui.base.u.a(this.wtc.bWQ(), this.wtc.getString(R.l.dgD), 4000L);
    }
    if ((this.lbS.isPlaying()) && (paramau.field_msgId == this.wta))
    {
      lV(true);
      GMTrace.o(2388672905216L, 17797);
      return;
    }
    ag(paramau);
    if ((paramau.field_isSend == 0) && (!com.tencent.mm.modelvoice.q.B(paramau))) {
      CC(paramInt + 1);
    }
    cbQ();
    GMTrace.o(2388672905216L, 17797);
  }
  
  public final void c(int paramInt, au paramau)
  {
    GMTrace.i(2388807122944L, 17798);
    if (paramau == null)
    {
      GMTrace.o(2388807122944L, 17798);
      return;
    }
    cbN();
    at.AR();
    Boolean localBoolean = (Boolean)com.tencent.mm.y.c.xh().get(4115, null);
    if ((localBoolean == null) || (!localBoolean.booleanValue()))
    {
      at.AR();
      com.tencent.mm.y.c.xh().set(4115, Boolean.valueOf(true));
      cbU();
      this.wtf = com.tencent.mm.ui.base.u.a(this.wtc.bWQ(), this.wtc.getString(R.l.dgD), 4000L);
    }
    if ((this.lbS.isPlaying()) && (paramau.field_msgId == this.wta))
    {
      lV(true);
      GMTrace.o(2388807122944L, 17798);
      return;
    }
    ag(paramau);
    if ((paramau.field_isSend == 0) && (!com.tencent.mm.modelvoice.q.B(paramau))) {
      CC(paramInt + 1);
    }
    cbQ();
    GMTrace.o(2388807122944L, 17798);
  }
  
  public final void cbN()
  {
    GMTrace.i(2388136034304L, 17793);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AutoPlay", "clear play list, stack: %s", new Object[] { com.tencent.mm.platformtools.t.Py() });
    if (this.wtb != null) {
      this.wtb.dismiss();
    }
    this.wsZ.clear();
    GMTrace.o(2388136034304L, 17793);
  }
  
  public final void cbO()
  {
    GMTrace.i(2389343993856L, 17802);
    this.jsO = false;
    cbQ();
    GMTrace.o(2389343993856L, 17802);
  }
  
  public final void cbQ()
  {
    GMTrace.i(2389612429312L, 17804);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AutoPlay", "play next: size = " + this.wsZ.size());
    if (this.wsZ.size() <= 0)
    {
      this.wtk.sendEmptyMessageDelayed(0, 1000L);
      GMTrace.o(2389612429312L, 17804);
      return;
    }
    if (!e.sd().sn())
    {
      e.sd();
      if (e.sk())
      {
        e.sd().a(this);
        int i = e.sd().sf();
        this.ewI = true;
        if ((i != -1) && (i != 0))
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AutoPlay", "play next: ret = " + i);
          this.wtl.sendEmptyMessageDelayed(0, 1000L);
          GMTrace.o(2389612429312L, 17804);
          return;
        }
      }
    }
    cbR();
    GMTrace.o(2389612429312L, 17804);
  }
  
  public final void cbR()
  {
    GMTrace.i(16458448896000L, 122625);
    int i;
    au localau;
    try
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AutoPlay", "realPlayNext play next: size = " + this.wsZ.size());
      if (this.wsZ.size() <= 0)
      {
        this.wtk.sendEmptyMessageDelayed(0, 1000L);
        GMTrace.o(16458448896000L, 122625);
        return;
      }
      int j = 0;
      long l = ((au)this.wsZ.get(0)).field_createTime;
      int k = this.wsZ.size();
      i = 1;
      if (i < k)
      {
        if (l <= ((au)this.wsZ.get(i)).field_createTime) {
          break label842;
        }
        l = ((au)this.wsZ.get(i)).field_createTime;
        j = i;
        break label842;
      }
      localau = (au)this.wsZ.get(j);
      if (localau == null) {
        break label733;
      }
      if (localau == null) {
        break label386;
      }
      if ((localau.bTu()) || (localau.bTL())) {
        break label853;
      }
      if (localau.field_type != -1879048190) {
        break label376;
      }
      i = 1;
      if (i != 0) {
        break label853;
      }
      if (localau.field_type != -1879048189) {
        break label381;
      }
      i = 1;
    }
    catch (Exception localException)
    {
      label229:
      Runnable local4;
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.AutoPlay", localException, "", new Object[0]);
      GMTrace.o(16458448896000L, 122625);
      return;
    }
    Assert.assertTrue(bool1);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AutoPlay", "start play msg: %d", new Object[] { Long.valueOf(localau.field_msgId) });
    if (!jrf.vkU)
    {
      jrf.a(this);
      local4 = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(2252576129024L, 16783);
          p.this.jrk = com.tencent.mm.platformtools.t.Pw();
          GMTrace.o(2252576129024L, 16783);
        }
      };
      if (!this.jrj.J(local4)) {
        break label392;
      }
    }
    label376:
    label381:
    label386:
    label392:
    for (this.jrk = 0L;; this.jrk = -1L)
    {
      at.AR();
      if ((com.tencent.mm.y.c.isSDCardAvailable()) || (com.tencent.mm.platformtools.t.nm(localau.field_imgPath))) {
        break label402;
      }
      this.wsZ.clear();
      com.tencent.mm.ui.base.u.fo(this.wtc.bWQ());
      GMTrace.o(16458448896000L, 122625);
      return;
      i = 0;
      break;
      i = 0;
      break label849;
      bool1 = false;
      break label229;
    }
    label402:
    at.AR();
    Object localObject;
    if ((com.tencent.mm.y.c.isSDCardAvailable()) && (this.wte.jrl))
    {
      if (this.wtb != null) {
        this.wtb.dismiss();
      }
      bool1 = e.sd().sn();
      boolean bool2 = e.sd().sh();
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AutoPlay", "alvinluo isHeadsetPluged: %b, isBluetoothOn: %b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((!bool1) && (bool2)) {
        this.wtb = com.tencent.mm.ui.base.u.a(this.wtc.bWQ(), R.k.cPc, this.wtc.getString(R.l.dex));
      }
    }
    else
    {
      com.tencent.mm.sdk.platformtools.ad.RS("keep_app_silent");
      com.tencent.mm.modelvoice.q.D(localau);
      this.lbS.ax(true);
      this.wte.wtd.cdm().setKeepScreenOn(true);
      if ((e.sd().sn()) || (e.sd().sh()))
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AutoPlay", "headset plugged: %b, bluetoothon: %b", new Object[] { Boolean.valueOf(e.sd().sn()), Boolean.valueOf(e.sd().sh()) });
        this.jri = false;
      }
      localObject = localau.field_imgPath;
      if (this.ewG != 1) {
        break label773;
      }
      localObject = com.tencent.mm.plugin.subapp.c.h.aA((String)localObject, false);
      label636:
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AutoPlay", "startplay");
      if (!this.lbS.a((String)localObject, this.jri, true, -1)) {
        break label783;
      }
      localObject = this.lbS;
      if (this.wsZ.size() <= 1) {
        break label859;
      }
    }
    label733:
    label773:
    label783:
    label842:
    label849:
    label853:
    label859:
    for (boolean bool1 = true;; bool1 = false)
    {
      ((g)localObject).az(bool1);
      this.lbS.a(this);
      this.lbS.a(this);
      this.wta = localau.field_msgId;
      for (;;)
      {
        bZV();
        this.wti = false;
        GMTrace.o(16458448896000L, 122625);
        return;
        this.wtb = com.tencent.mm.ui.base.u.a(this.wtc.bWQ(), R.k.cPi, this.wtc.getString(R.l.dey));
        break;
        localObject = com.tencent.mm.modelvoice.q.getFullPath((String)localObject);
        break label636;
        this.wta = -1L;
        if (this.ewI)
        {
          e.sd().sg();
          this.ewI = false;
        }
        e.sd().b(this);
        Toast.makeText(this.wtc.bWQ(), this.wtc.getString(R.l.dgV), 0).show();
      }
      i += 1;
      break;
      if (i == 0) {
        break label386;
      }
      bool1 = true;
      break label229;
    }
  }
  
  public final void cbS()
  {
    GMTrace.i(2389746647040L, 17805);
    if ((this.lbS != null) && (this.lbS.isPlaying()))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AutoPlay", "switchSpeaker, isSpeakerOn: %b, isPlaying: %b", new Object[] { Boolean.valueOf(this.jri), Boolean.valueOf(this.lbS.isPlaying()) });
      this.lbS.ay(this.jri);
    }
    GMTrace.o(2389746647040L, 17805);
  }
  
  public final void cbU()
  {
    GMTrace.i(2390820388864L, 17813);
    if (this.wtf != null) {
      this.wtf.dismiss();
    }
    GMTrace.o(2390820388864L, 17813);
  }
  
  public final void dc(int paramInt)
  {
    GMTrace.i(16458583113728L, 122626);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AutoPlay", "onBluetoothHeadsetStateChange, status: %d, isRequestStartBluetooth: %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.ewI) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(16458583113728L, 122626);
      return;
      if (this.wtl.hasMessages(0))
      {
        this.wtl.removeMessages(0);
        this.wtl.sendEmptyMessage(0);
        GMTrace.o(16458583113728L, 122626);
        return;
        if (this.wtl.hasMessages(0)) {
          this.wtl.removeMessages(0);
        }
        if (this.ewI)
        {
          e.sd().sg();
          this.ewI = false;
        }
      }
    }
  }
  
  public final void jdMethod_do(final boolean paramBoolean)
  {
    boolean bool = true;
    GMTrace.i(2390686171136L, 17812);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AutoPlay", "onSensorEvent, isON:" + paramBoolean + "  hasSkip:" + this.jrp + " tick:" + com.tencent.mm.platformtools.t.aI(this.jrk) + "  lt:" + this.jrk);
    if (this.jrp)
    {
      if (!paramBoolean) {}
      for (paramBoolean = bool;; paramBoolean = false)
      {
        this.jrp = paramBoolean;
        GMTrace.o(2390686171136L, 17812);
        return;
      }
    }
    if (this.wtc == null)
    {
      jrf.bQD();
      GMTrace.o(2390686171136L, 17812);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AutoPlay", "isScreenOn: %s", new Object[] { Boolean.valueOf(this.wtc.vKB.vKM) });
    if ((!paramBoolean) && (this.jrk != -1L) && (com.tencent.mm.platformtools.t.aI(this.jrk) > 400L))
    {
      this.jrp = true;
      GMTrace.o(2390686171136L, 17812);
      return;
    }
    this.jrp = false;
    if (this.lbS.qk())
    {
      GMTrace.o(2390686171136L, 17812);
      return;
    }
    if (at.AS().sh())
    {
      cbU();
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AutoPlay", "onSensorEvent, connecting bluetooth, omit sensor event");
      GMTrace.o(2390686171136L, 17812);
      return;
    }
    if (this.wte.jrl)
    {
      this.jri = false;
      if (this.wta != -1L) {
        this.wtc.dp(paramBoolean);
      }
      for (this.wti = paramBoolean;; this.wti = true)
      {
        cbS();
        GMTrace.o(2390686171136L, 17812);
        return;
        this.wtc.dp(true);
      }
    }
    if (this.wta != -1L)
    {
      if (this.wtc.vKB.vKM == paramBoolean)
      {
        GMTrace.o(2390686171136L, 17812);
        return;
      }
      this.wtc.dp(paramBoolean);
      this.wti = paramBoolean;
      new aj(new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(17905181786112L, 133404);
          if (!paramBoolean)
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AutoPlay", "speaker off");
            p.this.jri = false;
            p localp = p.this;
            if (localp.lbS.isPlaying())
            {
              com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AutoPlay", "deal sensor event, play next");
              localp.cbQ();
            }
          }
          for (;;)
          {
            GMTrace.o(17905181786112L, 133404);
            return false;
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AutoPlay", "speaker true");
            p.this.cbU();
            if (p.this.wtc != null) {
              p.this.wtf = com.tencent.mm.ui.base.u.a(p.this.wtc.bWQ(), p.this.wtc.getString(R.l.dxb), 2000L);
            }
            p.this.jri = true;
            p.this.cbS();
          }
        }
      }, false).z(50L, 50L);
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AutoPlay", "onSensorEvent, isResumeFromDisableScreen:%b", new Object[] { Boolean.valueOf(this.wti) });
    GMTrace.o(2390686171136L, 17812);
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(2390283517952L, 17809);
    boolean bool = this.lbS.isPlaying();
    GMTrace.o(2390283517952L, 17809);
    return bool;
  }
  
  public final void lV(boolean paramBoolean)
  {
    GMTrace.i(2390015082496L, 17807);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AutoPlay", "stop play");
    com.tencent.mm.sdk.platformtools.ad.RT("keep_app_silent");
    this.lbS.stop();
    this.wte.releaseWakeLock();
    cbP();
    if (this.ewI)
    {
      e.sd().sg();
      this.ewI = false;
    }
    e.sd().b(this);
    if (this.wsZ.isEmpty())
    {
      jrf.bQD();
      this.jrj.bQE();
    }
    if (paramBoolean)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AutoPlay", "resetAutoPlay stop play fresh tid[%d] this[%d] looper[%s], stack[%s]", new Object[] { Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(hashCode()), Looper.myLooper(), com.tencent.mm.platformtools.t.Py() });
      bZV();
    }
    this.wta = -1L;
    cbU();
    this.wti = false;
    GMTrace.o(2390015082496L, 17807);
  }
  
  public final void onCompletion()
  {
    GMTrace.i(2390417735680L, 17810);
    com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AutoPlay", "voice play completion isSpeakerOn " + this.jri);
    if (this.wtc != null)
    {
      cbT();
      this.wte.releaseWakeLock();
      cbQ();
    }
    GMTrace.o(2390417735680L, 17810);
  }
  
  public final void onError()
  {
    GMTrace.i(2390551953408L, 17811);
    com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AutoPlay", "voice play error");
    lV(true);
    cbQ();
    GMTrace.o(2390551953408L, 17811);
  }
  
  public final void release()
  {
    GMTrace.i(2389880864768L, 17806);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AutoPlay", "alvinluo AutoPlay release");
    if (this.jrj != null) {
      this.jrj.bQE();
    }
    GMTrace.o(2389880864768L, 17806);
  }
  
  public final void z(au paramau)
  {
    GMTrace.i(2389075558400L, 17800);
    if ((this.wth) && (this.wsZ.isEmpty()))
    {
      GMTrace.o(2389075558400L, 17800);
      return;
    }
    if ((paramau == null) || (!paramau.bTu()) || (paramau.field_isSend == 1))
    {
      GMTrace.o(2389075558400L, 17800);
      return;
    }
    if ((paramau.field_talker == null) || (!paramau.field_talker.equals(this.wtd.cci())))
    {
      GMTrace.o(2389075558400L, 17800);
      return;
    }
    if ((!at.wS().foreground) || (this.wtc.isFinishing()))
    {
      GMTrace.o(2389075558400L, 17800);
      return;
    }
    if (com.tencent.mm.modelvoice.q.C(paramau))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AutoPlay", "should not in this route");
      GMTrace.o(2389075558400L, 17800);
      return;
    }
    ag(paramau);
    if ((!this.jsO) && (!this.lbS.isPlaying()) && (com.tencent.mm.platformtools.t.bx(this.wtc.bWQ()))) {
      cbQ();
    }
    GMTrace.o(2389075558400L, 17800);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */