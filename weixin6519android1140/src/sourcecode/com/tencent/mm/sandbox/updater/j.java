package com.tencent.mm.sandbox.updater;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.c.i.a;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.pluginsdk.i.p;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sandbox.b.a;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class j
  implements a, g
{
  public String desc;
  public String eDW;
  public int eLi;
  public int eqX;
  public String eqZ;
  public byte[] gvf;
  public byte[] hge;
  public byte[] hgg;
  private Intent intent;
  protected Context mContext;
  public int pUw;
  private Notification qwY;
  public int size;
  public int uin;
  public int veV;
  public String[] vfx;
  public f vgA;
  private long vgB;
  private b.a vgC;
  public com.tencent.mm.sandbox.monitor.c vgn;
  ArrayList<g> vgo;
  public String[] vgp;
  public String vgq;
  public com.tencent.mm.c.i vgr;
  public i.a vgs;
  public boolean vgt;
  public boolean vgu;
  public boolean vgv;
  public String vgw;
  public boolean vgx;
  public boolean vgy;
  long vgz;
  
  public j()
  {
    GMTrace.i(3569654693888L, 26596);
    this.vgn = null;
    this.vgo = new ArrayList(1);
    this.eLi = d.tJC;
    this.vgt = false;
    this.vgu = false;
    this.vgv = false;
    this.vgx = false;
    this.vgy = false;
    this.intent = null;
    this.qwY = null;
    this.mContext = null;
    this.vgA = new f(this);
    this.vgB = -1L;
    this.vgC = new b.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, azh paramAnonymousazh)
      {
        GMTrace.i(3579721023488L, 26671);
        j.this.vgy = false;
        j.this.vgA.stop();
        j.this.vgz = System.currentTimeMillis();
        if (j.this.vgn == null)
        {
          j.this.X(2, true);
          GMTrace.o(3579721023488L, 26671);
          return;
        }
        if ((paramAnonymousInt1 == 200) && (paramAnonymousInt2 == 0))
        {
          w.i("MicroMsg.UpdaterManager", "packCallback onSceneEnd ok");
          if (j.this.pUw != 2) {
            j.this.dZ(100, 100);
          }
          if (j.this.vgt)
          {
            i.Z(j.this.mContext, 0);
            paramAnonymousazh = MultiProcessSharedPreferences.getSharedPreferences(ab.getContext(), "yyb_pkg_sig_prefs", 4);
            j.this.vgq = paramAnonymousazh.getString(ab.getPackageName(), "");
            w.i("MicroMsg.UpdaterManager", "summertoken downloadsuccess onSceneEnd sig[%s], path[%s]", new Object[] { j.this.vgq, j.this.vgn.bOJ() });
            if (bg.nm(j.this.vgq)) {
              break label459;
            }
          }
          for (;;)
          {
            try
            {
              com.tencent.mm.c.c.b(new File(j.this.vgn.bOJ()), j.this.vgq);
              w.i("MicroMsg.UpdaterManager", "summertoken downloadsuccess writeSecurityCode done");
              com.tencent.mm.plugin.report.service.g.ork.a(322L, 6L, 1L, false);
              com.tencent.mm.plugin.report.service.g.ork.i(11098, new Object[] { Integer.valueOf(4006), j.this.vgq });
              if (j.this.pUw != 1) {
                break label498;
              }
              i.aa(j.this.mContext, 8);
              j.this.bPk();
              j.this.Ih(j.this.vgn.bOJ());
              if (j.this.vgx)
              {
                com.tencent.mm.plugin.report.service.g.ork.a(614L, 58L, 1L, false);
                w.d("MicroMsg.UpdaterManager", "boots download success.");
              }
              i.bPd();
              GMTrace.o(3579721023488L, 26671);
              return;
              i.Z(j.this.mContext, 9);
            }
            catch (Exception paramAnonymousazh)
            {
              w.w("MicroMsg.UpdaterManager", "summertoken downloadsuccess writeSecurityCode e: " + paramAnonymousazh.getMessage());
              com.tencent.mm.plugin.report.service.g.ork.a(322L, 7L, 1L, false);
              com.tencent.mm.plugin.report.service.g.ork.i(11098, new Object[] { Integer.valueOf(4007), paramAnonymousazh.getMessage() });
              continue;
            }
            label459:
            com.tencent.mm.plugin.report.service.g.ork.a(322L, 8L, 1L, false);
            com.tencent.mm.plugin.report.service.g.ork.i(11098, new Object[] { Integer.valueOf(4008) });
            continue;
            label498:
            if (j.this.pUw == 0)
            {
              j.this.Ih(j.this.vgn.bOJ());
            }
            else if (j.this.pUw == 2)
            {
              i.aa(j.this.mContext, 1);
              j.this.bPk();
            }
          }
        }
        if (paramAnonymousInt2 == -13)
        {
          w.e("MicroMsg.UpdaterManager", "session timeout, killself and restart");
          UpdaterService.ci();
          AppUpdaterUI.bON();
          i.bPc();
          GMTrace.o(3579721023488L, 26671);
          return;
        }
        if (((j.this.vgn instanceof c)) && (j.this.veV != 4))
        {
          w.e("MicroMsg.UpdaterManager", "download package from cdn error.");
          if (j.this.vgt)
          {
            if ((paramAnonymousInt1 == 3) || (paramAnonymousInt1 == 4) || (paramAnonymousInt1 == 2) || (paramAnonymousInt1 == 1) || (paramAnonymousInt1 == 13)) {
              i.Z(j.this.mContext, paramAnonymousInt1);
            }
            j.this.vgt = false;
            if (j.this.pUw == 1) {
              if (j.this.vgx)
              {
                w.d("MicroMsg.UpdaterManager", "boots download failed. %d", new Object[] { Integer.valueOf(paramAnonymousInt1) });
                switch (paramAnonymousInt1)
                {
                }
              }
            }
          }
        }
        for (;;)
        {
          j.this.a(j.this.vgn);
          GMTrace.o(3579721023488L, 26671);
          return;
          com.tencent.mm.plugin.report.service.g.ork.a(614L, 52L, 1L, false);
          continue;
          com.tencent.mm.plugin.report.service.g.ork.a(614L, 53L, 1L, false);
          continue;
          com.tencent.mm.plugin.report.service.g.ork.a(614L, 54L, 1L, false);
          continue;
          com.tencent.mm.plugin.report.service.g.ork.a(614L, 51L, 1L, false);
          continue;
          com.tencent.mm.plugin.report.service.g.ork.a(614L, 55L, 1L, false);
          continue;
          j.this.bPi();
          continue;
          if (j.this.pUw == 0)
          {
            j.this.X(1, true);
          }
          else if (j.this.pUw == 2)
          {
            j.this.bPl();
            continue;
            paramAnonymousazh = j.this;
            paramAnonymousInt1 = j.this.size;
            String str = j.this.eDW;
            paramAnonymousInt2 = j.this.veV;
            int i = j.this.uin;
            byte[] arrayOfByte1 = j.this.hge;
            byte[] arrayOfByte2 = j.this.gvf;
            String[] arrayOfString = j.this.vgp;
            if (j.this.pUw == 2) {}
            for (boolean bool = true;; bool = false)
            {
              paramAnonymousazh.vgn = new b(paramAnonymousInt1, str, paramAnonymousInt2, i, arrayOfByte1, arrayOfByte2, arrayOfString, bool);
              j.this.bPj();
              break;
            }
            w.e("MicroMsg.UpdaterManager", "update failed");
            i.Z(j.this.mContext, 10);
            if (j.this.pUw == 1) {
              j.this.bPh();
            } else if (j.this.pUw == 0) {
              j.this.X(1, true);
            }
          }
        }
      }
      
      public final void bP(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(3579586805760L, 26670);
        w.i("MicroMsg.UpdaterManager", "total=%d, offset=%d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        if (j.this.pUw != 2) {
          j.this.dZ(paramAnonymousInt2, paramAnonymousInt1);
        }
        j.this.bP(paramAnonymousInt1, paramAnonymousInt2);
        GMTrace.o(3579586805760L, 26670);
      }
      
      public final void eF(long paramAnonymousLong)
      {
        GMTrace.i(3579855241216L, 26672);
        f localf = j.this.vgA;
        localf.euU.post(new f.2(localf, paramAnonymousLong));
        GMTrace.o(3579855241216L, 26672);
      }
      
      public final void eG(long paramAnonymousLong)
      {
        GMTrace.i(3579989458944L, 26673);
        f localf = j.this.vgA;
        localf.euU.post(new f.3(localf, paramAnonymousLong));
        GMTrace.o(3579989458944L, 26673);
      }
    };
    this.mContext = ab.getContext();
    GMTrace.o(3569654693888L, 26596);
  }
  
  private void bPg()
  {
    GMTrace.i(3570862653440L, 26605);
    MultiProcessSharedPreferences.getSharedPreferences(ab.getContext(), "system_config_prefs", 0).edit().putLong("recomended_update_ignore", bg.Pu() - 86400L).commit();
    X(2, true);
    bOQ();
    GMTrace.o(3570862653440L, 26605);
  }
  
  private void kB(boolean paramBoolean)
  {
    boolean bool = true;
    GMTrace.i(3570325782528L, 26601);
    w.i("MicroMsg.UpdaterManager", "download() isWifiRetry %s", new Object[] { Boolean.valueOf(paramBoolean) });
    w.i("MicroMsg.UpdaterManager", "summerupdate download() downloadMode %s downloading %s", new Object[] { Integer.valueOf(this.pUw), Boolean.valueOf(this.vgy) });
    if (this.intent == null)
    {
      w.e("MicroMsg.UpdaterManager", "download() haven't handleCommand");
      GMTrace.o(3570325782528L, 26601);
      return;
    }
    if (this.vgy)
    {
      w.i("MicroMsg.UpdaterManager", "download() downloading, duplicate download request");
      GMTrace.o(3570325782528L, 26601);
      return;
    }
    if (!h.getExternalStorageState().equals("mounted"))
    {
      w.e("MicroMsg.UpdaterManager", "no sdcard.");
      MultiProcessSharedPreferences.getSharedPreferences(ab.getContext(), "system_config_prefs", 0).edit().putLong("recomended_update_ignore", bg.Pu() - 86400L).commit();
      X(2, true);
      bOP();
      GMTrace.o(3570325782528L, 26601);
      return;
    }
    if ((this.pUw == 2) && (!paramBoolean)) {
      i.aa(this.mContext, 0);
    }
    String str1 = com.tencent.mm.sandbox.monitor.c.FM(this.eDW);
    w.i("MicroMsg.UpdaterManager", str1);
    if (str1 != null)
    {
      w.i("MicroMsg.UpdaterManager", "update package already exist.");
      X(1, true);
      Ih(str1);
      if ((this.pUw == 2) && (!i.Rv(this.eDW))) {
        i.a(this.eDW, this.vgq, this.desc, this.size, this.pUw, this.veV, this.vgw);
      }
      GMTrace.o(3570325782528L, 26601);
      return;
    }
    if (this.vgv)
    {
      if (this.vgn != null) {
        this.vgn.deleteTempFile();
      }
      i.Z(this.mContext, 11);
    }
    if ((!this.vgv) && (this.vgt) && (this.vgr != null) && (this.vgs != null))
    {
      w.i("MicroMsg.UpdaterManager", "Incresment Update");
      i.Z(this.mContext, 5);
      if (!com.tencent.mm.compatible.util.f.L(this.size + this.vgs.size))
      {
        bPg();
        GMTrace.o(3570325782528L, 26601);
        return;
      }
      cancel();
      int i = this.vgs.size;
      str1 = this.eDW;
      int j = this.veV;
      String str2 = this.vgr.erk + this.vgs.url;
      String str3 = this.vgs.ero;
      String str4 = this.vgs.ern;
      if (this.pUw == 2) {}
      for (paramBoolean = bool;; paramBoolean = false)
      {
        this.vgn = new c(i, str1, j, str2, str3, str4, paramBoolean);
        bPj();
        GMTrace.o(3570325782528L, 26601);
        return;
      }
    }
    if (!com.tencent.mm.compatible.util.f.L(this.size))
    {
      w.e("MicroMsg.UpdaterManager", "SDCard is full");
      bPg();
      GMTrace.o(3570325782528L, 26601);
      return;
    }
    bPl();
    GMTrace.o(3570325782528L, 26601);
  }
  
  private void reset()
  {
    GMTrace.i(3570728435712L, 26604);
    cancel();
    this.eqX = 0;
    this.eqZ = null;
    this.vgp = null;
    this.eLi = d.tJC;
    this.veV = 0;
    this.hge = null;
    this.gvf = null;
    this.hgg = null;
    this.uin = 0;
    this.eDW = null;
    this.size = 0;
    this.desc = null;
    this.vfx = null;
    this.vgr = null;
    this.vgs = null;
    this.vgt = false;
    this.vgu = false;
    this.pUw = 0;
    this.vgv = false;
    this.intent = null;
    this.vgy = false;
    this.qwY = null;
    this.vgB = 0L;
    GMTrace.o(3570728435712L, 26604);
  }
  
  public final void Ih(String paramString)
  {
    GMTrace.i(3571533742080L, 26610);
    Iterator localIterator = this.vgo.iterator();
    while (localIterator.hasNext()) {
      ((g)localIterator.next()).Ih(paramString);
    }
    GMTrace.o(3571533742080L, 26610);
  }
  
  public final void X(final int paramInt, boolean paramBoolean)
  {
    GMTrace.i(3570460000256L, 26602);
    this.vgu = paramBoolean;
    new ae().postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(3581331636224L, 26683);
        ((NotificationManager)j.this.mContext.getSystemService("notification")).cancel(99);
        w.d("MicroMsg.UpdaterManager", "finishType == " + paramInt);
        if ((paramInt == 2) && (j.this.veV == 1))
        {
          Intent localIntent = new Intent();
          localIntent.setAction("com.tencent.mm.sandbox.updater.intent.ACTION_EXIT_APP");
          j.this.mContext.sendBroadcast(localIntent, "com.tencent.mm.permission.MM_MESSAGE");
        }
        GMTrace.o(3581331636224L, 26683);
      }
    }, 300L);
    GMTrace.o(3570460000256L, 26602);
  }
  
  public final void a(com.tencent.mm.sandbox.monitor.c paramc)
  {
    GMTrace.i(3571667959808L, 26611);
    Iterator localIterator = this.vgo.iterator();
    while (localIterator.hasNext()) {
      ((g)localIterator.next()).a(paramc);
    }
    GMTrace.o(3571667959808L, 26611);
  }
  
  public final boolean af(Intent paramIntent)
  {
    GMTrace.i(3569923129344L, 26598);
    boolean bool = ag(paramIntent);
    w.i("MicroMsg.UpdaterManager", "summerupdate handleCommand(Intent intent) ret need download[%b]", new Object[] { Boolean.valueOf(bool) });
    if (bool) {
      kB(false);
    }
    GMTrace.o(3569923129344L, 26598);
    return bool;
  }
  
  public final boolean ag(Intent paramIntent)
  {
    GMTrace.i(3570057347072L, 26599);
    w.i("MicroMsg.UpdaterManager", "handleCommand(Intent intent)");
    if (paramIntent == null)
    {
      w.i("MicroMsg.UpdaterManager", "intent == null");
      GMTrace.o(3570057347072L, 26599);
      return false;
    }
    int j = paramIntent.getIntExtra("intent_update_type", 3);
    int i = paramIntent.getIntExtra("intent_extra_download_mode", 1);
    String str = paramIntent.getStringExtra("intent_extra_md5");
    if ((this.vgy) && (!str.equalsIgnoreCase(this.eDW)) && (this.pUw == 2)) {
      cancel();
    }
    Object localObject1;
    while (!this.vgy)
    {
      i.bPd();
      reset();
      this.intent = paramIntent;
      this.eqX = paramIntent.getIntExtra("intent_extra_updateMode", 0);
      this.eqZ = paramIntent.getStringExtra("intent_extra_marketUrl");
      this.vgp = paramIntent.getStringArrayExtra("intent_short_ips");
      this.eLi = paramIntent.getIntExtra("intent_client_version", d.tJC);
      d.tJC = this.eLi;
      this.veV = j;
      this.hge = paramIntent.getByteArrayExtra("intent_extra_session");
      this.gvf = paramIntent.getByteArrayExtra("intent_extra_cookie");
      this.hgg = paramIntent.getByteArrayExtra("intent_extra_ecdhkey");
      this.uin = paramIntent.getIntExtra("intent_extra_uin", 0);
      this.eDW = str;
      this.desc = paramIntent.getStringExtra("intent_extra_desc");
      this.size = paramIntent.getIntExtra("intent_extra_size", 0);
      this.vfx = paramIntent.getStringArrayExtra("intent_extra_download_url");
      this.pUw = i;
      this.vgv = paramIntent.getBooleanExtra("intent_extra_force_download_full", false);
      localObject1 = paramIntent.getStringExtra("intent_extra_patchInfo");
      if (localObject1 != null)
      {
        w.i("MicroMsg.UpdaterManager", "patchXml != null");
        this.vgr = com.tencent.mm.c.i.bt((String)localObject1);
      }
      localObject1 = paramIntent.getStringExtra("intent_extra_extinfo");
      w.d("MicroMsg.UpdaterManager", "summerupdate extInfo[%s]", new Object[] { localObject1 });
      if (!bg.nm((String)localObject1))
      {
        this.vgw = ((String)bh.q((String)localObject1, "extinfo").get(".extinfo.notautodownloadrange"));
        w.i("MicroMsg.UpdaterManager", "summerupdate notAutoDownloadRange[%s]", new Object[] { this.vgw });
      }
      w.i("MicroMsg.UpdaterManager", "summerupdate handleCommand() downloadMode %s downloading %s", new Object[] { Integer.valueOf(i), Boolean.valueOf(this.vgy) });
      if ((j != 999) || (this.vfx == null) || (this.vfx.length <= 0)) {
        break;
      }
      if (i == 2) {
        w.e("MicroMsg.UpdaterManager", "error! DOWNLOAD_MODE_SLIENCE download don't go here! we must process it before start download");
      }
      GMTrace.o(3570057347072L, 26599);
      return true;
    }
    w.i("MicroMsg.UpdaterManager", "downloading, duplicate download request");
    GMTrace.o(3570057347072L, 26599);
    return true;
    Object localObject2;
    if (this.vfx != null)
    {
      localObject1 = this.vfx;
      int k = localObject1.length;
      i = 0;
      while (i < k)
      {
        localObject2 = localObject1[i];
        w.i("MicroMsg.UpdaterManager", "download url : " + (String)localObject2);
        i += 1;
      }
    }
    w.i("MicroMsg.UpdaterManager", "md5 = %s , size = %s", new Object[] { str, Integer.valueOf(this.size) });
    if ((str == null) || (this.size == 0))
    {
      GMTrace.o(3570057347072L, 26599);
      return false;
    }
    if (j == 2)
    {
      boolean bool = com.tencent.mm.modelcontrol.b.jD(this.vgw);
      w.i("MicroMsg.UpdaterManager", "summerupdate handleCommandWithoutDownload recommended control[%b]", new Object[] { Boolean.valueOf(bool) });
      if (bool)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(405L, 78L, 1L, true);
        GMTrace.o(3570057347072L, 26599);
        return false;
      }
    }
    if (this.vgr != null)
    {
      w.i("MicroMsg.UpdaterManager", "patchInfo != null");
      localObject1 = p.dQ(this.mContext);
      this.vgs = this.vgr.bs((String)localObject1);
      localObject2 = new StringBuilder("increase apkMD5 = ").append((String)localObject1).append(" : ");
      if (this.vgs == null)
      {
        localObject1 = "not match";
        w.i("MicroMsg.UpdaterManager", (String)localObject1);
      }
    }
    else
    {
      w.i("MicroMsg.UpdaterManager", "forceDownloadFull : %s", new Object[] { Boolean.valueOf(this.vgv) });
      this.vgx = paramIntent.getBooleanExtra("intent_extra_tinker_patch", false);
      if (((this.vgs == null) || (com.tencent.mm.sandbox.monitor.c.Rs(str))) && (!this.vgx)) {
        break label854;
      }
      w.i("MicroMsg.UpdaterManager", "isIncresmentUpdate");
      this.vgt = true;
    }
    for (;;)
    {
      paramIntent = i.bJN();
      if ((!bg.nm(paramIntent)) && (!paramIntent.equals(str))) {
        i.bPe();
      }
      GMTrace.o(3570057347072L, 26599);
      return true;
      localObject1 = "match";
      break;
      label854:
      w.i("MicroMsg.UpdaterManager", "had try to download full pack.");
    }
  }
  
  public final void bOP()
  {
    GMTrace.i(3571802177536L, 26612);
    Iterator localIterator = this.vgo.iterator();
    while (localIterator.hasNext()) {
      ((g)localIterator.next()).bOP();
    }
    GMTrace.o(3571802177536L, 26612);
  }
  
  public final void bOQ()
  {
    GMTrace.i(3571936395264L, 26613);
    Iterator localIterator = this.vgo.iterator();
    while (localIterator.hasNext()) {
      ((g)localIterator.next()).bOQ();
    }
    GMTrace.o(3571936395264L, 26613);
  }
  
  public final void bP(int paramInt1, int paramInt2)
  {
    GMTrace.i(3571265306624L, 26608);
    Iterator localIterator = this.vgo.iterator();
    while (localIterator.hasNext()) {
      ((g)localIterator.next()).bP(paramInt1, paramInt2);
    }
    GMTrace.o(3571265306624L, 26608);
  }
  
  public final void bPf()
  {
    GMTrace.i(15343368011776L, 114317);
    kB(false);
    GMTrace.o(15343368011776L, 114317);
  }
  
  public final void bPh()
  {
    GMTrace.i(16022107062272L, 119374);
    Object localObject1 = this.mContext.getString(R.l.cSz);
    Object localObject2 = new Intent("android.intent.action.VIEW", Uri.parse("https://weixin.qq.com/m"));
    ((Intent)localObject2).addFlags(268435456);
    localObject2 = PendingIntent.getActivity(this.mContext, 0, (Intent)localObject2, 134217728);
    this.qwY = new Notification.Builder(this.mContext).setTicker(null).setWhen(System.currentTimeMillis()).setContentTitle((CharSequence)localObject1).setContentText(null).setContentIntent((PendingIntent)localObject2).getNotification();
    this.qwY.icon = R.g.bbm;
    localObject1 = this.qwY;
    ((Notification)localObject1).flags |= 0x10;
    ((NotificationManager)this.mContext.getSystemService("notification")).notify(99, this.qwY);
    GMTrace.o(16022107062272L, 119374);
  }
  
  public final void bPi()
  {
    GMTrace.i(16022241280000L, 119375);
    w.i("MicroMsg.UpdaterManager", "showDownloadFullPackNotification()");
    Object localObject1 = this.mContext.getString(R.l.cSA, new Object[] { bg.aF(this.size) });
    Object localObject2 = this.intent;
    ((Intent)localObject2).putExtra("intent_extra_force_download_full", true);
    localObject2 = PendingIntent.getService(this.mContext, 0, (Intent)localObject2, 134217728);
    this.qwY = new Notification.Builder(this.mContext).setTicker(null).setWhen(System.currentTimeMillis()).setContentTitle((CharSequence)localObject1).setContentText(null).setContentIntent((PendingIntent)localObject2).getNotification();
    this.qwY.icon = R.g.bbm;
    localObject1 = this.qwY;
    ((Notification)localObject1).flags |= 0x10;
    ((NotificationManager)this.mContext.getSystemService("notification")).notify(99, this.qwY);
    GMTrace.o(16022241280000L, 119375);
  }
  
  public final void bPj()
  {
    GMTrace.i(3570996871168L, 26606);
    if ((this.pUw == 2) && (!am.isWifi(this.mContext)))
    {
      i.bPb();
      w.i("MicroMsg.UpdaterManager", "we stop download, when silence and not wifi!");
      GMTrace.o(3570996871168L, 26606);
      return;
    }
    if ((this.pUw == 2) && (f.Ru(this.eDW)))
    {
      w.e("MicroMsg.UpdaterManager", "the traffice is overload, not download anymore in silence mode!");
      this.vgA.stop();
      GMTrace.o(3570996871168L, 26606);
      return;
    }
    this.vgA.cE(this.eDW, this.size);
    if (this.vgn != null)
    {
      X(1, false);
      this.vgy = true;
      this.vgn.a(this.vgC);
      bkK();
      if (this.pUw == 2) {
        i.bPb();
      }
    }
    GMTrace.o(3570996871168L, 26606);
  }
  
  public final void bPk()
  {
    GMTrace.i(16022509715456L, 119377);
    i.a(this.eDW, this.vgq, this.desc, this.size, this.pUw, this.veV, this.vgw);
    GMTrace.o(16022509715456L, 119377);
  }
  
  public final void bPl()
  {
    GMTrace.i(3571131088896L, 26607);
    cancel();
    w.i("MicroMsg.UpdaterManager", "downloadFullPack");
    i.Z(this.mContext, 7);
    if ((this.vfx != null) && (this.vfx.length > 0))
    {
      i = this.size;
      str = this.eDW;
      j = this.veV;
      localObject = this.vfx;
      if (this.pUw == 2) {}
      for (bool = true;; bool = false)
      {
        this.vgn = new c(i, str, j, (String[])localObject, bool);
        com.tencent.mm.plugin.report.service.g.ork.a(405L, 76L, 1L, true);
        bPj();
        GMTrace.o(3571131088896L, 26607);
        return;
      }
    }
    int i = this.size;
    String str = this.eDW;
    int j = this.veV;
    int k = this.uin;
    Object localObject = this.hge;
    byte[] arrayOfByte = this.gvf;
    String[] arrayOfString = this.vgp;
    if (this.pUw == 2) {}
    for (boolean bool = true;; bool = false)
    {
      this.vgn = new b(i, str, j, k, (byte[])localObject, arrayOfByte, arrayOfString, bool);
      com.tencent.mm.plugin.report.service.g.ork.a(405L, 77L, 1L, true);
      break;
    }
  }
  
  public final void bkK()
  {
    GMTrace.i(3571399524352L, 26609);
    Iterator localIterator = this.vgo.iterator();
    while (localIterator.hasNext()) {
      ((g)localIterator.next()).bkK();
    }
    GMTrace.o(3571399524352L, 26609);
  }
  
  public final void cancel()
  {
    GMTrace.i(3570594217984L, 26603);
    if (this.vgn != null)
    {
      this.vgy = false;
      this.vgn.cancel();
      this.vgn = null;
      this.vgz = System.currentTimeMillis();
      this.vgA.stop();
    }
    GMTrace.o(3570594217984L, 26603);
  }
  
  public final void dZ(int paramInt1, int paramInt2)
  {
    GMTrace.i(16022375497728L, 119376);
    Object localObject1 = this.mContext.getString(R.l.cSy);
    String str;
    Object localObject2;
    if (paramInt1 < paramInt2)
    {
      long l = paramInt1 * 100L / paramInt2;
      if (l - this.vgB < 1L)
      {
        GMTrace.o(16022375497728L, 119376);
        return;
      }
      this.vgB = l;
      str = this.mContext.getString(R.l.cSB) + String.valueOf(this.vgB) + "%";
      localObject2 = new Intent(this.intent);
      ((Intent)localObject2).setClass(this.mContext, AppUpdaterUI.class);
      ((Intent)localObject2).addFlags(536870912);
      localObject2 = PendingIntent.getActivity(this.mContext, 0, (Intent)localObject2, 134217728);
      localObject1 = new Notification.Builder(this.mContext).setTicker(null).setWhen(System.currentTimeMillis()).setContentTitle((CharSequence)localObject1).setContentText(str).setContentIntent((PendingIntent)localObject2);
      ((Notification.Builder)localObject1).setLargeIcon(BitmapFactory.decodeResource(this.mContext.getResources(), R.g.bbm));
      ((Notification.Builder)localObject1).setSmallIcon(com.tencent.mm.bi.a.bIN());
      this.qwY = ((Notification.Builder)localObject1).getNotification();
      this.qwY.icon = R.g.bbm;
    }
    for (;;)
    {
      if (!this.vgu) {
        ((NotificationManager)this.mContext.getSystemService("notification")).notify(99, this.qwY);
      }
      GMTrace.o(16022375497728L, 119376);
      return;
      if ((this.vgx) && (!e.aZ(this.vgn.bOJ())))
      {
        w.i("MicroMsg.UpdaterManager", "do noting. wait for merge apk.");
      }
      else
      {
        str = this.mContext.getString(R.l.cSx);
        localObject2 = new Intent("android.intent.action.VIEW");
        ((Intent)localObject2).setDataAndType(Uri.fromFile(new File(this.vgn.bOJ())), "application/vnd.android.package-archive");
        ((Intent)localObject2).addFlags(536870912);
        localObject2 = PendingIntent.getActivity(this.mContext, 0, (Intent)localObject2, 134217728);
        localObject1 = new Notification.Builder(this.mContext).setTicker(null).setWhen(System.currentTimeMillis()).setContentTitle((CharSequence)localObject1).setContentText(str).setContentIntent((PendingIntent)localObject2);
        ((Notification.Builder)localObject1).setLargeIcon(BitmapFactory.decodeResource(this.mContext.getResources(), R.g.bbm));
        ((Notification.Builder)localObject1).setSmallIcon(com.tencent.mm.bi.a.bIN());
        this.qwY = ((Notification.Builder)localObject1).getNotification();
        this.qwY.icon = R.g.bbm;
        localObject1 = this.qwY;
        ((Notification)localObject1).flags |= 0x10;
      }
    }
  }
  
  public final boolean isBusy()
  {
    GMTrace.i(3572070612992L, 26614);
    if ((this.vgy) || (System.currentTimeMillis() - this.vgz <= UpdaterService.vgI))
    {
      w.i("MicroMsg.UpdaterManager", "dont stop, because of updateManager.isDownloading() %s / updateManager.getIdleTimestamp() %s / System.currentTimeMillis() - updateManager.getIdleTimestamp() %s", new Object[] { Boolean.valueOf(this.vgy), Long.valueOf(this.vgz), Long.valueOf(System.currentTimeMillis() - this.vgz) });
      GMTrace.o(3572070612992L, 26614);
      return true;
    }
    w.i("MicroMsg.UpdaterManager", "not busy");
    GMTrace.o(3572070612992L, 26614);
    return false;
  }
  
  public final void kz(boolean paramBoolean)
  {
    GMTrace.i(3569788911616L, 26597);
    w.i("MicroMsg.UpdaterManager", "summerupdate setNetStatChanged isWifi %s", new Object[] { Boolean.valueOf(paramBoolean) });
    f localf = this.vgA;
    if (localf.lcN != paramBoolean)
    {
      localf.kA(true);
      localf.lcN = paramBoolean;
    }
    if ((this.pUw != 2) || (this.vgy))
    {
      w.i("MicroMsg.UpdaterManager", "downloadMode %s downloading %s", new Object[] { Integer.valueOf(this.pUw), Boolean.valueOf(this.vgy) });
      GMTrace.o(3569788911616L, 26597);
      return;
    }
    if (paramBoolean)
    {
      if (ag(this.intent))
      {
        kB(true);
        GMTrace.o(3569788911616L, 26597);
      }
    }
    else if (this.vgy) {
      cancel();
    }
    GMTrace.o(3569788911616L, 26597);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(3572204830720L, 26615);
    w.i("MicroMsg.UpdaterManager", "onDestroy");
    if (!this.vgy)
    {
      reset();
      X(1, true);
    }
    GMTrace.o(3572204830720L, 26615);
  }
  
  private static final class a
  {
    public static final j vgF;
    
    static
    {
      GMTrace.i(3593411231744L, 26773);
      vgF = new j();
      GMTrace.o(3593411231744L, 26773);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\sandbox\updater\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */