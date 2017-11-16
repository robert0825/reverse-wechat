package com.tencent.mm.plugin.voip_cs.ui;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.PowerManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.b.e.a;
import com.tencent.mm.compatible.d.b.a;
import com.tencent.mm.g.a.qm;
import com.tencent.mm.network.n.a;
import com.tencent.mm.plugin.video.ObservableTextureView;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver.a;
import com.tencent.mm.plugin.voip.model.l;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.plugin.voip.video.f;
import com.tencent.mm.plugin.voip_cs.b.b.a.a;
import com.tencent.mm.protocal.c.bmx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.ac;
import com.tencent.mm.y.at;
import java.util.Arrays;

@com.tencent.mm.ui.base.a(3)
public class VoipCSMainUI
  extends MMActivity
  implements com.tencent.mm.plugin.voip_cs.b.a, a.a
{
  private String appId;
  public String eLQ;
  public String eXr;
  private com.tencent.mm.compatible.util.b eyB;
  private ae ghS;
  public String ied;
  private TelephonyManager mij;
  PhoneStateListener mik;
  private com.tencent.mm.network.n ovf;
  private HeadsetPlugReceiver qGY;
  private BroadcastReceiver qHE;
  private HeadsetPlugReceiver.a qHF;
  private com.tencent.mm.plugin.voip_cs.b.a.b qSM;
  private com.tencent.mm.plugin.voip_cs.b.a.c qSN;
  private boolean qSO;
  public String qSP;
  public String qSQ;
  public String qSR;
  public boolean qSS;
  private com.tencent.mm.sdk.platformtools.aj qST;
  e.a qSU;
  public String qSc;
  private com.tencent.mm.plugin.voip_cs.b.a.a qSi;
  public CharSequence tickerText;
  public CharSequence title;
  public String type;
  
  public VoipCSMainUI()
  {
    GMTrace.i(11278718337024L, 84033);
    this.qSO = false;
    this.qGY = null;
    this.qSc = "";
    this.appId = "";
    this.ied = "";
    this.qSP = "";
    this.qSQ = "";
    this.qSR = "";
    this.eXr = "";
    this.type = "";
    this.qSS = false;
    this.eLQ = ab.getContext().getString(R.l.eic);
    this.tickerText = ab.getContext().getString(R.l.eic);
    this.title = ab.getContext().getString(R.l.ehW);
    this.qST = new com.tencent.mm.sdk.platformtools.aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(11275631329280L, 84010);
        Object localObject = new Intent(ab.getContext(), VoipCSMainUI.class);
        localObject = PendingIntent.getActivity(ab.getContext(), 44, (Intent)localObject, 134217728);
        localObject = new Notification.Builder(ab.getContext()).setTicker(VoipCSMainUI.this.tickerText).setContentTitle(VoipCSMainUI.this.title).setContentText(VoipCSMainUI.this.eLQ).setContentIntent((PendingIntent)localObject).setOngoing(true).getNotification();
        ((Notification)localObject).icon = com.tencent.mm.bi.a.bIN();
        ((Notification)localObject).flags |= 0x20;
        at.getNotification().a(44, (Notification)localObject, false);
        GMTrace.o(11275631329280L, 84010);
        return true;
      }
    }, true);
    this.qSU = new e.a()
    {
      public final void dc(int paramAnonymousInt)
      {
        GMTrace.i(11276705071104L, 84018);
        w.d("MicroMsg.voipcs.VoipCSMainUI", "onBluetoothHeadsetStateChange status: %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(11276705071104L, 84018);
          return;
          at.AS().sf();
          GMTrace.o(11276705071104L, 84018);
          return;
          at.AS().sg();
          VoipCSMainUI.c(VoipCSMainUI.this).iv(true);
          GMTrace.o(11276705071104L, 84018);
          return;
          VoipCSMainUI.c(VoipCSMainUI.this).iv(false);
          GMTrace.o(11276705071104L, 84018);
          return;
          at.AS().sg();
          VoipCSMainUI.c(VoipCSMainUI.this).iv(true);
        }
      }
    };
    this.qHF = new HeadsetPlugReceiver.a()
    {
      public final void fp(boolean paramAnonymousBoolean)
      {
        GMTrace.i(11276436635648L, 84016);
        w.d("MicroMsg.voipcs.VoipCSMainUI", "onHeadsetState, on:%b", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
        if (VoipCSMainUI.d(VoipCSMainUI.this) == paramAnonymousBoolean)
        {
          w.d("MicroMsg.voipcs.VoipCSMainUI", "same status, no changed");
          GMTrace.o(11276436635648L, 84016);
          return;
        }
        VoipCSMainUI.a(VoipCSMainUI.this, paramAnonymousBoolean);
        if (paramAnonymousBoolean)
        {
          VoipCSMainUI.c(VoipCSMainUI.this).iv(false);
          Toast.makeText(ab.getContext(), ab.getContext().getString(R.l.ejh), 0).show();
          GMTrace.o(11276436635648L, 84016);
          return;
        }
        VoipCSMainUI.c(VoipCSMainUI.this).iv(true);
        Toast.makeText(ab.getContext(), ab.getContext().getString(R.l.eji), 0).show();
        GMTrace.o(11276436635648L, 84016);
      }
    };
    this.qHE = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(11278315683840L, 84030);
        paramAnonymousContext = paramAnonymousIntent.getAction();
        paramAnonymousIntent = (PowerManager)ab.getContext().getSystemService("power");
        if (("android.intent.action.USER_PRESENT".equals(paramAnonymousContext)) && (paramAnonymousIntent.isScreenOn()))
        {
          w.d("MicroMsg.voipcs.VoipCSMainUI", "on user present home");
          VoipCSMainUI.e(VoipCSMainUI.this).eIE = false;
          GMTrace.o(11278315683840L, 84030);
          return;
        }
        if ("android.intent.action.SCREEN_ON".equals(paramAnonymousContext))
        {
          w.d("MicroMsg.voipcs.VoipCSMainUI", "screen on...");
          VoipCSMainUI.e(VoipCSMainUI.this).eIE = false;
          if ((!VoipCSMainUI.f(VoipCSMainUI.this).buQ()) && (com.tencent.mm.plugin.voip_cs.b.b.bwp().qSb == 2))
          {
            VoipCSMainUI.f(VoipCSMainUI.this).bwx();
            GMTrace.o(11278315683840L, 84030);
          }
        }
        else if ("android.intent.action.SCREEN_OFF".equals(paramAnonymousContext))
        {
          w.d("MicroMsg.voipcs.VoipCSMainUI", "screen off...");
          VoipCSMainUI.e(VoipCSMainUI.this).eIE = true;
          if (!VoipCSMainUI.f(VoipCSMainUI.this).buQ()) {
            VoipCSMainUI.f(VoipCSMainUI.this).stopRing();
          }
        }
        GMTrace.o(11278315683840L, 84030);
      }
    };
    this.mik = new PhoneStateListener()
    {
      public final void onCallStateChanged(int paramAnonymousInt, String paramAnonymousString)
      {
        GMTrace.i(11277241942016L, 84022);
        w.d("MicroMsg.voipcs.VoipCSMainUI", "now phone state change!");
        if (paramAnonymousInt == 2)
        {
          w.i("MicroMsg.voipcs.VoipCSMainUI", " phone is talking ! exist voipcs !");
          com.tencent.mm.plugin.voip_cs.b.b.bwq().qRv = 4;
          VoipCSMainUI.this.wG(7);
        }
        GMTrace.o(11277241942016L, 84022);
      }
    };
    this.ovf = new n.a()
    {
      public final void db(int paramAnonymousInt)
      {
        GMTrace.i(11276168200192L, 84014);
        w.d("MicroMsg.voipcs.VoipCSMainUI", "network status change from " + paramAnonymousInt);
        v2protocal localv2protocal;
        if ((com.tencent.mm.plugin.voip_cs.b.b.bwp().qSb == 2) && ((paramAnonymousInt == 4) || (paramAnonymousInt == 6)))
        {
          localObject = com.tencent.mm.plugin.voip_cs.b.b.bwp();
          localv2protocal = com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO;
          if (((com.tencent.mm.plugin.voip_cs.b.d)localObject).qFB == 0) {
            ((com.tencent.mm.plugin.voip_cs.b.d)localObject).qFB = localv2protocal.qJo;
          }
          paramAnonymousInt = com.tencent.mm.plugin.voip.b.a.getNetType(ab.getContext());
          if (paramAnonymousInt != ((com.tencent.mm.plugin.voip_cs.b.d)localObject).qFB) {
            w.i("MicroMsg.voipcs.VoipCSService", "steve: onVoipLocalNetTypeChange: local network type change from " + ((com.tencent.mm.plugin.voip_cs.b.d)localObject).qFB + " to " + paramAnonymousInt);
          }
        }
        try
        {
          byte[] arrayOfByte = new byte[4];
          arrayOfByte[0] = ((byte)paramAnonymousInt);
          int i = localv2protocal.setAppCmd(301, arrayOfByte, 4);
          if (i < 0) {
            w.i("MicroMsg.voipcs.VoipCSService", "steve:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetLocalNetType] update local network type" + paramAnonymousInt + "fail:" + i + ", [roomid=" + localv2protocal.mjN + ", roomkey=" + localv2protocal.mjG + "]");
          }
          bmx localbmx = new bmx();
          localbmx.uWZ = 3;
          localbmx.uXa = new com.tencent.mm.bm.b(arrayOfByte, 0, 1);
          localv2protocal.SendRUDP(localbmx.toByteArray(), localbmx.toByteArray().length);
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e("MicroMsg.voipcs.VoipCSService", "onVoipLocalNetTypeChange Error");
          }
        }
        ((com.tencent.mm.plugin.voip_cs.b.d)localObject).qFB = paramAnonymousInt;
        Object localObject = com.tencent.mm.plugin.voip_cs.b.b.bwp();
        w.i("MicroMsg.voipcs.VoipCSService", "now doRedirect+,csroomId:" + com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.qJq + "roomkey:" + com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.mjG);
        at.wS().a(285, (com.tencent.mm.ad.e)localObject);
        localObject = com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO;
        localObject = new com.tencent.mm.plugin.voip_cs.b.c.d(((v2protocal)localObject).qJq, ((v2protocal)localObject).mjG);
        at.wS().a((com.tencent.mm.ad.k)localObject, 0);
        GMTrace.o(11276168200192L, 84014);
      }
    };
    GMTrace.o(11278718337024L, 84033);
  }
  
  private int aII()
  {
    int i = 2;
    GMTrace.i(11279255207936L, 84037);
    if (at.AS().sh()) {
      i = at.AS().st();
    }
    for (;;)
    {
      w.d("MicroMsg.voipcs.VoipCSMainUI", "Current StreamType:%d", new Object[] { Integer.valueOf(i) });
      GMTrace.o(11279255207936L, 84037);
      return i;
      if (this.qSi.buQ())
      {
        if (com.tencent.mm.plugin.voip_cs.b.b.bwp().qSb != 2)
        {
          com.tencent.mm.plugin.voip_cs.b.a.c localc = this.qSN;
          if (localc.qFL != null)
          {
            i = localc.qFL.btE();
            continue;
          }
        }
        i = 0;
      }
    }
  }
  
  private void bwF()
  {
    GMTrace.i(11278986772480L, 84035);
    Object localObject1;
    Object localObject2;
    long l;
    boolean bool1;
    boolean bool2;
    label330:
    boolean bool3;
    if (com.tencent.mm.plugin.voip_cs.b.b.bwp().qSb <= 0)
    {
      localObject1 = this.qSM;
      if (((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).qSA.bQn())
      {
        localObject2 = ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).qSA;
        l = ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).qSv;
        ((com.tencent.mm.sdk.platformtools.aj)localObject2).z(l, l);
      }
      localObject1 = this.qSM;
      if (((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).qSB.bQn())
      {
        localObject2 = ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).qSB;
        l = ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).qSw;
        ((com.tencent.mm.sdk.platformtools.aj)localObject2).z(l, l);
      }
      localObject1 = com.tencent.mm.plugin.voip_cs.b.b.bwo();
      ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).mkR = false;
      ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).mkQ = false;
      if (((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).mkO.ndo)
      {
        w.d("MicroMsg.VoipCSEngine", "protocal has init,now uninit!");
        ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).mkO.iB(false);
        ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).mkO.reset();
      }
      ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).mkO.qJp = 1;
      l = System.currentTimeMillis();
      localObject1 = ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).mkO;
      ((v2protocal)localObject1).netType = com.tencent.mm.plugin.voip.b.a.getNetType(ab.getContext());
      ((v2protocal)localObject1).qJo = ((v2protocal)localObject1).netType;
      com.tencent.mm.plugin.voip_cs.b.b.bwq().qJo = ((v2protocal)localObject1).netType;
      if (((v2protocal)localObject1).netType == 5) {
        ((v2protocal)localObject1).netType = 4;
      }
      if ((((v2protocal)localObject1).qJo < 4) || ((v2protocal.qwP & 0x400) == 0) || ((v2protocal.qwP & 0xFF) < 30)) {
        break label1300;
      }
      bool1 = true;
      if ((com.tencent.mm.compatible.d.p.fQC.fPb != 1) || (com.tencent.mm.compatible.d.p.fQC.fOE.width < 480) || (com.tencent.mm.compatible.d.p.fQC.fOE.height < 360) || (com.tencent.mm.compatible.d.p.fQC.fOG.width < 480) || (com.tencent.mm.compatible.d.p.fQC.fOG.height < 360)) {
        break label1306;
      }
      bool2 = true;
      if (com.tencent.mm.compatible.d.p.fQC.fPb != 0) {
        break label1312;
      }
      bool3 = true;
      label342:
      if (((bool1) || (bool2)) && (!bool3))
      {
        ((v2protocal)localObject1).defaultWidth = 480;
        ((v2protocal)localObject1).defaultHeight = 360;
        v2protocal.qJl = true;
        com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip", "steve:Set Enable 480! " + ((v2protocal)localObject1).defaultWidth + "x" + ((v2protocal)localObject1).defaultHeight);
      }
      com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip", "steve: Android CPUFlag:" + (v2protocal.qwP & 0xFF) + ", 480x360 Enc flags: bEnable480FromLocal:" + bool1 + ", bEnable480FromSvr:" + bool2 + ", bDisable480FromSvr:" + bool3);
      ((v2protocal)localObject1).qKi = new int[((v2protocal)localObject1).defaultWidth * ((v2protocal)localObject1).defaultHeight];
      at.AR();
      ((v2protocal)localObject1).qJn = com.tencent.mm.y.c.ww();
      if ((v2protocal.qwP & 0x400) == 0) {
        break label1318;
      }
      com.tencent.mm.compatible.loader.d.u(ab.getContext(), "libvoipCodec_v7a.so");
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "dlopen /data/data/com.tencent.mm/lib/libvoipCodec_v7a.so... ");
    }
    for (;;)
    {
      int i = Build.VERSION.SDK_INT;
      int j = OpenGlRender.bvY();
      localObject2 = ((WindowManager)ab.getContext().getSystemService("window")).getDefaultDisplay();
      int k = ((Display)localObject2).getWidth();
      int m = ((Display)localObject2).getHeight();
      i = ((v2protocal)localObject1).init(((v2protocal)localObject1).netType, 2, ((v2protocal)localObject1).defaultWidth << 16 | ((v2protocal)localObject1).defaultHeight, k << 16 | m, ((v2protocal)localObject1).qJn, i << 16 | j << 24 | v2protocal.qwP, com.tencent.mm.compatible.util.e.ghu + "app_lib/", 8);
      com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "protocal init ret :" + i + ",uin= " + ((v2protocal)localObject1).qJn);
      ((v2protocal)localObject1).ndo = true;
      if (i < 0) {
        ((v2protocal)localObject1).reset();
      }
      w.d("MicroMsg.VoipCSEngine", "protocal init finish, ret: %d, used %dms", new Object[] { Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l) });
      if (i < 0) {
        w.e("MicroMsg.VoipCSEngine", "engine init failed!");
      }
      com.tencent.mm.plugin.voip_cs.b.d locald = com.tencent.mm.plugin.voip_cs.b.b.bwp();
      String str1 = this.qSc;
      String str2 = this.appId;
      String str3 = this.qSR;
      w.i("MicroMsg.voipcs.VoipCSService", "start netscene invite for username:" + str1 + ",appid:" + str2 + ",voipCSContext:" + str3);
      locald.qSc = str1;
      locald.qSb = 1;
      localObject1 = com.tencent.mm.plugin.voip_cs.b.b.bwq();
      w.d("MicroMsg.VoipCSReportHelper", "markSendInvite");
      if (((com.tencent.mm.plugin.voip_cs.b.c)localObject1).qRO == 0) {
        ((com.tencent.mm.plugin.voip_cs.b.c)localObject1).qRO = ((int)(System.currentTimeMillis() / 1000L));
      }
      localObject2 = null;
      localObject1 = localObject2;
      if (str3 != null)
      {
        localObject1 = localObject2;
        if (!str3.equals("")) {
          localObject1 = str3.getBytes();
        }
      }
      at.wS().a(823, locald);
      com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.mjI = ((int)(System.currentTimeMillis() / 1000L));
      localObject1 = new com.tencent.mm.plugin.voip_cs.b.c.c(com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.mjI, str1, com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.netType, (byte[])localObject1, com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.field_capInfo, str2);
      w.i("MicroMsg.voipcs.VoipCSService", "capDump is " + Arrays.toString(com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.field_capInfo));
      at.wS().a((com.tencent.mm.ad.k)localObject1, 0);
      if (com.tencent.mm.plugin.voip_cs.b.b.bwp().qSb < 2) {
        this.qSi.bwx();
      }
      localObject1 = this.qSM;
      w.i("MicroMsg.voipcs.VoipCSViewManager", "start capture render");
      if (((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).noY == null)
      {
        w.i("MicroMsg.voipcs.VoipCSViewManager", "create capture View");
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).noY = new ObservableTextureView(((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).qSj);
        localObject2 = new RelativeLayout.LayoutParams(1, 1);
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).noY.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).qSk.addView(((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).noY, new RelativeLayout.LayoutParams(1, 1));
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).noY.setVisibility(0);
      }
      if (((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).noW == null)
      {
        i = 320;
        j = 240;
        com.tencent.mm.plugin.voip_cs.b.b.bwo();
        if (v2protocal.qJl)
        {
          i = 640;
          j = 480;
        }
        w.i("MicroMsg.voipcs.VoipCSViewManager", "create capture Render");
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).noW = new com.tencent.mm.plugin.voip.video.a(i, j);
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).noW.a((f)localObject1, true);
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).noW.a(((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).noY);
        com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.qJC = ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).noW.bvV();
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).noW.startCapture();
        ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).noW.bvW();
        w.i("MicroMsg.voipcs.VoipCSViewManager", "captureRender.mIsCurrentFaceCamera=%b captureRender.mIsCameraRemote180=%b", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).noW.bvT()), Boolean.valueOf(((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).noW.bvU()) });
      }
      GMTrace.o(11278986772480L, 84035);
      return;
      label1300:
      bool1 = false;
      break;
      label1306:
      bool2 = false;
      break label330;
      label1312:
      bool3 = false;
      break label342;
      label1318:
      if ((v2protocal.qwP & 0x200) != 0)
      {
        com.tencent.mm.compatible.loader.d.u(ab.getContext(), "libvoipCodec.so");
        com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "dlopen /data/data/com.tencent.mm/lib/libvoipCodec.so... ");
      }
      else
      {
        com.tencent.mm.compatible.loader.d.u(ab.getContext(), "libvoipCodec_v5.so");
        com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip", "dlopen /data/data/com.tencent.mm/lib/libvoipCodec_v5.so... ");
      }
    }
  }
  
  private boolean bwG()
  {
    GMTrace.i(11280597385216L, 84047);
    if (!com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.RECORD_AUDIO", 82, "", ""))
    {
      w.i("MicroMsg.voipcs.VoipCSMainUI", "has not audio record premission!");
      GMTrace.o(11280597385216L, 84047);
      return false;
    }
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.CAMERA", 19, "", "");
    w.d("MicroMsg.voipcs.VoipCSMainUI", "voipcs checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW(), this });
    if (!bool)
    {
      w.i("MicroMsg.voipcs.VoipCSMainUI", "has not camera  premission!");
      GMTrace.o(11280597385216L, 84047);
      return false;
    }
    GMTrace.o(11280597385216L, 84047);
    return true;
  }
  
  public final void aHL()
  {
    GMTrace.i(11280865820672L, 84049);
    this.qSM.aHL();
    Object localObject;
    int i;
    if ((at.AS().sn()) || (at.AS().sh()))
    {
      this.qSN.iv(false);
      localObject = this.qSN;
      if (((com.tencent.mm.plugin.voip_cs.b.a.c)localObject).nlZ == null) {
        break label233;
      }
      boolean bool = ((com.tencent.mm.plugin.voip_cs.b.a.c)localObject).nlZ.qw();
      com.tencent.mm.plugin.voip_cs.b.b.bwq().qRA = 1;
      if (!bool) {
        break label233;
      }
      i = 1;
      label75:
      com.tencent.mm.plugin.voip_cs.b.b.bwq().qRT = i;
      localObject = this.qSN;
      if (((com.tencent.mm.plugin.voip_cs.b.a.c)localObject).qFL != null) {
        break label238;
      }
      com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.qJD = Math.abs(1);
    }
    for (;;)
    {
      this.qSi.stopRing();
      localObject = com.tencent.mm.plugin.voip_cs.b.b.bwq();
      if (((com.tencent.mm.plugin.voip_cs.b.c)localObject).qRO != 0) {
        ((com.tencent.mm.plugin.voip_cs.b.c)localObject).qRD = ((int)(System.currentTimeMillis() / 1000L) - ((com.tencent.mm.plugin.voip_cs.b.c)localObject).qRO);
      }
      localObject = com.tencent.mm.plugin.voip_cs.b.b.bwq();
      w.d("MicroMsg.VoipCSReportHelper", "markStartTalk");
      if (((com.tencent.mm.plugin.voip_cs.b.c)localObject).qRR == 0) {
        ((com.tencent.mm.plugin.voip_cs.b.c)localObject).qRR = ((int)(System.currentTimeMillis() / 1000L));
      }
      localObject = com.tencent.mm.plugin.voip_cs.b.b.bwq();
      w.d("MicroMsg.VoipCSReportHelper", "markConnect");
      if (((com.tencent.mm.plugin.voip_cs.b.c)localObject).qRQ != 0) {
        ((com.tencent.mm.plugin.voip_cs.b.c)localObject).qRF = ((int)(System.currentTimeMillis() / 1000L) - ((com.tencent.mm.plugin.voip_cs.b.c)localObject).qRQ);
      }
      GMTrace.o(11280865820672L, 84049);
      return;
      this.qSN.iv(true);
      break;
      label233:
      i = -1;
      break label75;
      label238:
      ((com.tencent.mm.plugin.voip_cs.b.a.c)localObject).qFL.btA();
      if (((com.tencent.mm.plugin.voip_cs.b.a.c)localObject).qFL.btA() <= 0) {
        com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.qJD = Math.abs(1);
      }
    }
  }
  
  public final void bwE()
  {
    GMTrace.i(11281000038400L, 84050);
    w.d("MicroMsg.voipcs.VoipCSMainUI", "onChannelConnectFailed now finish it!");
    this.qSM.wJ(5);
    GMTrace.o(11281000038400L, 84050);
  }
  
  public final void dY(String paramString1, String paramString2)
  {
    GMTrace.i(11280463167488L, 84046);
    com.tencent.mm.plugin.voip_cs.b.a.b localb = this.qSM;
    if ((localb.qSz.equals("")) && (com.tencent.pb.common.c.h.isNullOrEmpty(paramString2))) {
      if (localb.qSj.qSS) {
        localb.jpV.setText(R.l.ehM);
      }
    }
    while ((localb.qSy.equals("")) && (com.tencent.pb.common.c.h.isNullOrEmpty(paramString1)) && ((localb.qSj.ied == null) || (localb.qSj.ied.equals(""))))
    {
      localb.qSp.setImageResource(R.g.aVS);
      GMTrace.o(11280463167488L, 84046);
      return;
      localb.jpV.setText(R.l.ehL);
      continue;
      localb.JU(paramString2);
    }
    SharedPreferences localSharedPreferences = ab.bPV();
    if ((!com.tencent.pb.common.c.h.isNullOrEmpty(paramString1)) && (!localb.qSy.equals(paramString1)))
    {
      localb.JV(paramString1);
      localSharedPreferences.edit().putString(localb.bwy(), paramString1).commit();
    }
    if ((!com.tencent.pb.common.c.h.isNullOrEmpty(paramString2)) && (!localb.qSz.equals(paramString2)))
    {
      localb.JU(paramString2);
      localSharedPreferences.edit().putString(localb.bwz(), paramString2).commit();
    }
    GMTrace.o(11280463167488L, 84046);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11280060514304L, 84043);
    int i = R.i.cHE;
    GMTrace.o(11280060514304L, 84043);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11278852554752L, 84034);
    w.i("MicroMsg.voipcs.VoipCSMainUI", "onCreate voipcs....");
    super.onCreate(paramBundle);
    this.vKB.bXF();
    this.qSc = getIntent().getStringExtra("voipCSBizId");
    this.appId = getIntent().getStringExtra("voipCSAppId");
    this.eXr = bg.nl(getIntent().getStringExtra("voipCSScene"));
    this.type = bg.nl(getIntent().getStringExtra("voipCSType"));
    this.qSP = getIntent().getStringExtra("voipCSAllowBackCamera");
    this.qSQ = getIntent().getStringExtra("voipCSShowOther");
    this.ied = getIntent().getStringExtra("voipCSAvatarUrl");
    this.qSR = getIntent().getStringExtra("voipCSContext");
    this.qSS = getIntent().getBooleanExtra("launch_from_appbrand", false);
    getWindow().addFlags(6946944);
    if (Build.VERSION.SDK_INT >= 19) {
      getWindow().addFlags(67108864);
    }
    this.ghS = new ae();
    paramBundle = com.tencent.mm.plugin.voip_cs.b.b.bwq();
    w.d("MicroMsg.VoipCSReportHelper", "reset");
    paramBundle.aGU = 0;
    paramBundle.qRd = 0;
    paramBundle.qRe = 0;
    paramBundle.qRf = 0;
    paramBundle.videoFps = 0;
    paramBundle.qRg = 0;
    paramBundle.qRh = 0;
    paramBundle.qRi = 0;
    paramBundle.qRj = 0;
    paramBundle.qRk = 0;
    paramBundle.qRl = 0;
    paramBundle.networkType = 0;
    paramBundle.qRm = 0;
    paramBundle.qRn = com.tencent.mm.plugin.voip_cs.b.c.qRa;
    paramBundle.qRo = 0;
    paramBundle.qRp = 0L;
    paramBundle.mjG = 0L;
    paramBundle.qRq = "";
    paramBundle.qJo = 0;
    paramBundle.qRt = 0;
    paramBundle.qRu = 0;
    paramBundle.qRv = 0;
    paramBundle.qJH = 0;
    paramBundle.qJG = 0;
    paramBundle.qRw = 0;
    paramBundle.qRx = 0;
    paramBundle.qRy = 0;
    paramBundle.qRz = 0;
    paramBundle.qRA = 0;
    paramBundle.qRB = 0;
    paramBundle.qRC = 0L;
    paramBundle.qRD = 0;
    paramBundle.qRE = 0L;
    paramBundle.qRF = 0L;
    paramBundle.qRG = 0L;
    paramBundle.mld = 0L;
    paramBundle.qRH = 0;
    paramBundle.qRI = 0;
    paramBundle.channelStrategy = 1;
    paramBundle.qKS = 0;
    paramBundle.qJI = 0;
    paramBundle.qRJ = 0;
    paramBundle.qRK = 0;
    paramBundle.mln = "";
    paramBundle.mlm = "";
    paramBundle.qRO = 0;
    paramBundle.qRP = 0;
    paramBundle.qRQ = 0;
    paramBundle.qRR = 0;
    paramBundle.qRS = 0;
    this.mij = ((TelephonyManager)ab.getContext().getSystemService("phone"));
    com.tencent.mm.plugin.voip_cs.b.b.bwp().qSc = this.qSc;
    this.qSM = new com.tencent.mm.plugin.voip_cs.b.a.b(this);
    this.qSN = new com.tencent.mm.plugin.voip_cs.b.a.c();
    this.eyB = new com.tencent.mm.compatible.util.b(ab.getContext());
    this.qSi = com.tencent.mm.plugin.voip_cs.b.a.a.bwv();
    com.tencent.mm.plugin.voip_cs.b.b.bwo().qSK = this;
    com.tencent.mm.plugin.voip_cs.b.b.bwp().qRU = this;
    if ((com.tencent.mm.plugin.voip_cs.b.b.bwp().qSb == 0) || (com.tencent.mm.plugin.voip_cs.b.b.bwp().qSb == 3)) {
      com.tencent.mm.plugin.voip_cs.b.b.bwp().qSb = 0;
    }
    at.pD().ri();
    this.eyB.requestFocus();
    at.AS().sf();
    at.AS().a(this.qSU);
    this.qGY = new HeadsetPlugReceiver();
    this.qGY.a(ab.getContext(), this.qHF);
    paramBundle = new IntentFilter();
    paramBundle.addAction("android.intent.action.SCREEN_ON");
    paramBundle.addAction("android.intent.action.SCREEN_OFF");
    paramBundle.addAction("android.intent.action.USER_PRESENT");
    ab.getContext().registerReceiver(this.qHE, paramBundle);
    at.a(this.ovf);
    if (this.qSS) {
      if (this.eXr.equals("1")) {
        if (this.type.equals("video"))
        {
          this.title = ab.getContext().getString(R.l.ehU);
          this.tickerText = ab.getContext().getString(R.l.ehY);
          this.eLQ = ab.getContext().getString(R.l.ehY);
          i = this.mij.getCallState();
          if ((i != 2) && (i != 1)) {
            break label1183;
          }
          w.i("MicroMsg.voipcs.VoipCSMainUI", "check is phone use now ! TelephoneManager.callState is %d", new Object[] { Integer.valueOf(i) });
          com.tencent.mm.ui.base.h.a(this, R.l.eii, R.l.cUG, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(11278047248384L, 84028);
              paramAnonymousDialogInterface.dismiss();
              VoipCSMainUI.this.wG(0);
              GMTrace.o(11278047248384L, 84028);
            }
          });
        }
      }
    }
    label1183:
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        break label1188;
      }
      w.i("MicroMsg.voipcs.VoipCSMainUI", "can not start voip cs  by in telephone talking!");
      GMTrace.o(11278852554752L, 84034);
      return;
      this.title = ab.getContext().getString(R.l.ehV);
      this.tickerText = ab.getContext().getString(R.l.ehZ);
      this.eLQ = ab.getContext().getString(R.l.ehZ);
      break;
      if (this.type.equals("video"))
      {
        this.title = ab.getContext().getString(R.l.ehW);
        this.tickerText = ab.getContext().getString(R.l.eia);
        this.eLQ = ab.getContext().getString(R.l.eia);
        break;
      }
      this.title = ab.getContext().getString(R.l.ehV);
      this.tickerText = ab.getContext().getString(R.l.ehZ);
      this.eLQ = ab.getContext().getString(R.l.ehZ);
      break;
      if (this.eXr.equals("1"))
      {
        if (this.type.equals("video"))
        {
          this.title = ab.getContext().getString(R.l.ehU);
          this.tickerText = ab.getContext().getString(R.l.ehY);
          this.eLQ = ab.getContext().getString(R.l.ehY);
          break;
        }
        this.title = ab.getContext().getString(R.l.ehV);
        this.tickerText = ab.getContext().getString(R.l.eic);
        this.eLQ = ab.getContext().getString(R.l.eic);
        break;
      }
      if (this.type.equals("video"))
      {
        this.title = ab.getContext().getString(R.l.ehW);
        this.tickerText = ab.getContext().getString(R.l.eic);
        this.eLQ = ab.getContext().getString(R.l.eic);
        break;
      }
      this.title = ab.getContext().getString(R.l.ehV);
      this.tickerText = ab.getContext().getString(R.l.eib);
      this.eLQ = ab.getContext().getString(R.l.eib);
      break;
    }
    label1188:
    this.mij.listen(this.mik, 32);
    if (!am.isNetworkConnected(this))
    {
      w.e("MicroMsg.voipcs.VoipCSMainUI", "isNetworkAvailable false, not connected!cannot start voip cs!");
      com.tencent.mm.ui.base.h.a(this, R.l.eie, R.l.eiQ, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11274826022912L, 84004);
          paramAnonymousDialogInterface.dismiss();
          VoipCSMainUI.this.wG(9);
          GMTrace.o(11274826022912L, 84004);
        }
      });
      i = 0;
    }
    while (i == 0)
    {
      w.i("MicroMsg.voipcs.VoipCSMainUI", "can not start voip cs  by in  voip talking!");
      GMTrace.o(11278852554752L, 84034);
      return;
      if ((am.isWifi(this)) || (l.buG()))
      {
        i = 1;
      }
      else
      {
        w.i("MicroMsg.voipcs.VoipCSMainUI", "check is not wifi network!");
        com.tencent.mm.ui.base.h.a(this, R.l.eif, R.l.eiQ, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(11274557587456L, 84002);
            w.i("MicroMsg.voipcs.VoipCSMainUI", " start voip by user choose continue call  in not wifi network!");
            l.buF();
            if (VoipCSMainUI.a(VoipCSMainUI.this)) {
              VoipCSMainUI.b(VoipCSMainUI.this);
            }
            GMTrace.o(11274557587456L, 84002);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(11277510377472L, 84024);
            w.i("MicroMsg.voipcs.VoipCSMainUI", "cannot start voip by user choose cancel call  in not wifi network!");
            paramAnonymousDialogInterface.dismiss();
            VoipCSMainUI.this.wG(8);
            GMTrace.o(11277510377472L, 84024);
          }
        });
        i = 0;
      }
    }
    if (com.tencent.mm.plugin.voip.b.d.bvN())
    {
      w.i("MicroMsg.voipcs.VoipCSMainUI", "check  is voip talking now!");
      com.tencent.mm.ui.base.h.a(this, R.l.dDd, R.l.cUG, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11277778812928L, 84026);
          paramAnonymousDialogInterface.dismiss();
          VoipCSMainUI.this.wG(0);
          GMTrace.o(11277778812928L, 84026);
        }
      });
      i = 1;
    }
    while (i != 0)
    {
      w.i("MicroMsg.voipcs.VoipCSMainUI", "can not start voip cs  by in other voip talking!");
      GMTrace.o(11278852554752L, 84034);
      return;
      if (com.tencent.mm.plugin.voip.b.d.bvM())
      {
        w.i("MicroMsg.voipcs.VoipCSMainUI", "check is ipCall talking now!");
        com.tencent.mm.ui.base.h.a(this, R.l.dDe, R.l.cUG, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(11275362893824L, 84008);
            paramAnonymousDialogInterface.dismiss();
            VoipCSMainUI.this.wG(0);
            GMTrace.o(11275362893824L, 84008);
          }
        });
        i = 1;
      }
      else if (com.tencent.mm.p.a.vq())
      {
        w.i("MicroMsg.voipcs.VoipCSMainUI", "check is multiTalking  now!");
        com.tencent.mm.ui.base.h.a(this, R.l.dCY, R.l.cUG, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(11274289152000L, 84000);
            paramAnonymousDialogInterface.dismiss();
            VoipCSMainUI.this.wG(0);
            GMTrace.o(11274289152000L, 84000);
          }
        });
        i = 1;
      }
      else if (com.tencent.mm.as.a.JK())
      {
        w.i("MicroMsg.voipcs.VoipCSMainUI", "check is in talktRoom  now!");
        com.tencent.mm.ui.base.h.a(this, R.l.dCZ, R.l.cUG, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(11278584119296L, 84032);
            paramAnonymousDialogInterface.dismiss();
            VoipCSMainUI.this.wG(0);
            GMTrace.o(11278584119296L, 84032);
          }
        });
        i = 1;
      }
      else
      {
        i = 0;
      }
    }
    if (bwG()) {
      bwF();
    }
    GMTrace.o(11278852554752L, 84034);
  }
  
  protected void onDestroy()
  {
    int j = 2;
    GMTrace.i(11279926296576L, 84042);
    w.i("MicroMsg.voipcs.VoipCSMainUI", "onDestroy voipcs....");
    if (this.eyB != null) {
      this.eyB.tx();
    }
    Object localObject1 = new qm();
    Object localObject2;
    if (com.tencent.mm.plugin.voip_cs.b.b.bwp().qSd == -1)
    {
      ((qm)localObject1).eVr.status = 3;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
      localObject1 = this.qSN;
      localObject2 = com.tencent.mm.plugin.voip_cs.b.b.bwq();
      if ((((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).qFL == null) || (com.tencent.mm.plugin.voip_cs.b.b.bwq().qRA != 1)) {
        break label1356;
      }
    }
    label170:
    label256:
    label400:
    label704:
    label1306:
    label1316:
    label1346:
    label1351:
    label1356:
    for (int i = ((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).qFL.btE();; i = 0)
    {
      float f = at.AS().getStreamMaxVolume(i);
      ((com.tencent.mm.plugin.voip_cs.b.c)localObject2).qRK = ((int)(at.AS().getStreamVolume(i) / f * 100.0F));
      localObject2 = com.tencent.mm.plugin.voip_cs.b.b.bwq();
      Object localObject3;
      byte[] arrayOfByte;
      if ((((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).nlZ != null) && (com.tencent.mm.plugin.voip_cs.b.b.bwq().qRA == 1))
      {
        i = ((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).nlZ.qy();
        ((com.tencent.mm.plugin.voip_cs.b.c)localObject2).qJI = i;
        if (((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).nlZ != null) {
          ((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).nlZ.qn();
        }
        if (((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).qFL != null) {
          ((com.tencent.mm.plugin.voip_cs.b.a.c)localObject1).qFL.btC();
        }
        this.qSi.stopRing();
        if (this.qSM != null)
        {
          localObject1 = this.qSM;
          if (com.tencent.mm.plugin.voip_cs.b.b.bwq().aGU == 0)
          {
            if (com.tencent.mm.plugin.voip_cs.b.b.bwp().qSb >= 2) {
              break label1306;
            }
            com.tencent.mm.plugin.voip_cs.b.b.bwq().aGU = 1;
          }
          ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).qLL.bvZ();
          ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).qLM.bvZ();
          ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).bwA();
          ((com.tencent.mm.plugin.voip_cs.b.a.b)localObject1).bwD();
          localObject1 = com.tencent.mm.plugin.voip_cs.b.b.bwp();
          w.i("MicroMsg.voipcs.VoipCSService", "now stop service");
          at.wS().b(823, (com.tencent.mm.ad.e)localObject1);
          at.wS().b(455, (com.tencent.mm.ad.e)localObject1);
          at.wS().b(818, (com.tencent.mm.ad.e)localObject1);
          at.wS().b(795, (com.tencent.mm.ad.e)localObject1);
          at.wS().b(285, (com.tencent.mm.ad.e)localObject1);
          at.wS().b(312, (com.tencent.mm.ad.e)localObject1);
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).qSb = 3;
          if (((com.tencent.mm.plugin.voip_cs.b.d)localObject1).qSd != 823)
          {
            at.wS().a(880, (com.tencent.mm.ad.e)localObject1);
            if (((com.tencent.mm.plugin.voip_cs.b.d)localObject1).qRW != 0) {
              break label1316;
            }
            i = 1;
            w.i("MicroMsg.voipcs.VoipCSService", "start netscene hangup for username:" + ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).qSc + ",inviteId：" + com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.mjI + ",csroomId:" + com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.qJq + ",roomkey:" + com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.mjG + ",reason:" + i);
            localObject2 = new com.tencent.mm.plugin.voip_cs.b.c.a(com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.mjI, com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.qJq, com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.mjG, ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).qSc, i);
            at.wS().a((com.tencent.mm.ad.k)localObject2, 0);
          }
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).qSf.stopTimer();
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).qSg.stopTimer();
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).qRV = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).qRr = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).qRW = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).qRX = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).qRY = null;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).mjP = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).qRZ = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).qSb = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).qSc = "";
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).qSa = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).qSd = 0;
          ((com.tencent.mm.plugin.voip_cs.b.d)localObject1).qSe = 999;
          localObject1 = com.tencent.mm.plugin.voip_cs.b.b.bwo();
          w.i("MicroMsg.VoipCSEngine", "now stop engine");
          ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).mkO.iB(true);
          localObject2 = com.tencent.mm.plugin.voip_cs.b.b.bwq();
          if ((bg.nm(((com.tencent.mm.plugin.voip_cs.b.c)localObject2).mln)) && (bg.nm(((com.tencent.mm.plugin.voip_cs.b.c)localObject2).mlm)))
          {
            localObject3 = com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO;
            if (((com.tencent.mm.plugin.voip_cs.b.c)localObject2).qRy != 1) {
              break label1346;
            }
            i = 1;
            arrayOfByte = ((v2protocal)localObject3).qKP;
            j = ((v2protocal)localObject3).qKP.length;
            if (i == 0) {
              break label1351;
            }
          }
        }
      }
      for (i = 1;; i = 0)
      {
        ((v2protocal)localObject3).getVoipcsChannelInfo(arrayOfByte, j, i);
        w.d("MicroMsg.Voip", "field_voipcsEngineInfoLength: %d", new Object[] { Integer.valueOf(((v2protocal)localObject3).field_voipcsChannelInfoLength) });
        ((com.tencent.mm.plugin.voip_cs.b.c)localObject2).mln = new String(((v2protocal)localObject3).qKP, 0, ((v2protocal)localObject3).field_voipcsChannelInfoLength);
        localObject3 = com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO;
        ((v2protocal)localObject3).getVoipcsEngineInfo(((v2protocal)localObject3).qKQ, ((v2protocal)localObject3).qKQ.length);
        w.d("MicroMsg.Voip", "field_voipcsEngineInfoLength: %d", new Object[] { Integer.valueOf(((v2protocal)localObject3).field_voipcsEngineInfoLength) });
        localObject3 = ((v2protocal)localObject3).mjN + "," + ((v2protocal)localObject3).mjG + "," + ((v2protocal)localObject3).qJq + "," + com.tencent.mm.plugin.voip_cs.b.b.bwq().qRA + "," + ((v2protocal)localObject3).qJC + "," + ((v2protocal)localObject3).qJD + ((v2protocal)localObject3).bvl() + new String(((v2protocal)localObject3).qKQ, 0, ((v2protocal)localObject3).field_voipcsEngineInfoLength);
        com.tencent.mm.plugin.voip.b.a.dV("MicroMsg.Voip", "voipreport:NewEngineString:" + (String)localObject3);
        ((com.tencent.mm.plugin.voip_cs.b.c)localObject2).mlm = ((String)localObject3);
        w.d("MicroMsg.VoipCSReportHelper", "nativeChannelReportString: %s", new Object[] { ((com.tencent.mm.plugin.voip_cs.b.c)localObject2).mln });
        w.d("MicroMsg.VoipCSReportHelper", "nativeEngineReportString: %s", new Object[] { ((com.tencent.mm.plugin.voip_cs.b.c)localObject2).mlm });
        localObject2 = com.tencent.mm.plugin.voip_cs.b.b.bwp();
        at.wS().a(312, (com.tencent.mm.ad.e)localObject2);
        localObject2 = new com.tencent.mm.plugin.voip_cs.b.c.e(com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.qJq, com.tencent.mm.plugin.voip_cs.b.b.bwo().mkO.mjG);
        at.wS().a((com.tencent.mm.ad.k)localObject2, 0);
        ((com.tencent.mm.plugin.voip_cs.b.b.a)localObject1).mkO.reset();
        com.tencent.mm.plugin.voip.model.k.buC().buE();
        com.tencent.mm.plugin.voip.model.k.buC().qHT = null;
        this.qSM = null;
        this.qSN = null;
        at.AS().setMode(0);
        ab.getContext().unregisterReceiver(this.qHE);
        at.AS().b(this.qSU);
        at.AS().sg();
        if (this.qGY != null) {
          this.qGY.di(ab.getContext());
        }
        at.b(this.ovf);
        if (this.qST != null) {
          this.qST.stopTimer();
        }
        at.getNotification().cancel(44);
        if ((this.mij != null) && (this.mik != null))
        {
          this.mij.listen(this.mik, 0);
          this.mik = null;
        }
        super.onDestroy();
        GMTrace.o(11279926296576L, 84042);
        return;
        if (com.tencent.mm.plugin.voip_cs.b.b.bwp().qSd == 823)
        {
          ((qm)localObject1).eVr.status = 4;
          break;
        }
        if (com.tencent.mm.plugin.voip_cs.b.b.bwp().qSb <= 1)
        {
          ((qm)localObject1).eVr.status = 1;
          break;
        }
        if (com.tencent.mm.plugin.voip_cs.b.b.bwp().qSb < 2) {
          break;
        }
        ((qm)localObject1).eVr.status = 2;
        break;
        i = 0;
        break label170;
        com.tencent.mm.plugin.voip_cs.b.b.bwq().aGU = 3;
        break label256;
        i = j;
        if (((com.tencent.mm.plugin.voip_cs.b.d)localObject1).qRW == 2) {
          break label400;
        }
        if (((com.tencent.mm.plugin.voip_cs.b.d)localObject1).qRW == 3)
        {
          i = 3;
          break label400;
        }
        i = 4;
        break label400;
        i = 0;
        break label704;
      }
    }
  }
  
  public final void onError(int paramInt)
  {
    GMTrace.i(11280328949760L, 84045);
    if (this.qSM != null)
    {
      w.d("MicroMsg.voipcs.VoipCSMainUI", "onError for errCode:" + paramInt);
      this.qSM.wJ(paramInt);
    }
    GMTrace.o(11280328949760L, 84045);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(11279120990208L, 84036);
    if (paramKeyEvent.getKeyCode() == 4)
    {
      GMTrace.o(11279120990208L, 84036);
      return true;
    }
    if (paramInt == 25)
    {
      paramInt = aII();
      at.AS().ei(paramInt);
      GMTrace.o(11279120990208L, 84036);
      return true;
    }
    if (paramInt == 24)
    {
      paramInt = aII();
      at.AS().eh(paramInt);
      GMTrace.o(11279120990208L, 84036);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(11279120990208L, 84036);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(11279523643392L, 84039);
    super.onPause();
    if (!this.qSi.buQ()) {
      this.qSi.stopRing();
    }
    if ((com.tencent.mm.plugin.voip_cs.b.b.bwp().qSb == 1) || (com.tencent.mm.plugin.voip_cs.b.b.bwp().qSb == 2))
    {
      Object localObject = new Intent(ab.getContext(), VoipCSMainUI.class);
      ((Intent)localObject).putExtra("voipCSBizId", this.qSc);
      ((Intent)localObject).putExtra("voipCSAppId", this.appId);
      ((Intent)localObject).putExtra("voipCSScene", this.eXr);
      ((Intent)localObject).putExtra("voipCSType", this.type);
      ((Intent)localObject).putExtra("voipCSAllowBackCamera", this.qSP);
      ((Intent)localObject).putExtra("voipCSShowOther", this.qSQ);
      ((Intent)localObject).putExtra("voipCSAvatarUrl", this.ied);
      ((Intent)localObject).putExtra("voipCSContext", this.qSR);
      ((Intent)localObject).putExtra("launch_from_appbrand", this.qSS);
      localObject = PendingIntent.getActivity(ab.getContext(), 44, (Intent)localObject, 134217728);
      localObject = new Notification.Builder(ab.getContext()).setTicker(this.tickerText).setWhen(System.currentTimeMillis()).setContentTitle(this.title).setContentText(this.eLQ).setContentIntent((PendingIntent)localObject).setOngoing(true).getNotification();
      ((Notification)localObject).icon = com.tencent.mm.bi.a.bIN();
      ((Notification)localObject).flags |= 0x20;
      at.getNotification().a(44, (Notification)localObject, false);
      if ((this.qST != null) && (this.qST.bQn())) {
        this.qST.z(5000L, 5000L);
      }
    }
    for (;;)
    {
      this.qSM.bwA();
      this.qSM.eIE = true;
      GMTrace.o(11279523643392L, 84039);
      return;
      at.getNotification().cancel(44);
      if (this.qST != null) {
        this.qST.stopTimer();
      }
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(11280731602944L, 84048);
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0) || (paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
    {
      w.e("MicroMsg.voipcs.VoipCSMainUI", "[voip_cs]onRequestPermissionsResult %d data is invalid", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(11280731602944L, 84048);
      return;
    }
    w.d("MicroMsg.voipcs.VoipCSMainUI", "[voip_cs] onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default: 
      GMTrace.o(11280731602944L, 84048);
      return;
    case 82: 
      if (paramArrayOfInt[0] == 0)
      {
        w.d("MicroMsg.voipcs.VoipCSMainUI", "granted record audio!");
        if (com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.CAMERA", 19, "", "")) {
          bwF();
        }
        GMTrace.o(11280731602944L, 84048);
        return;
      }
      com.tencent.mm.ui.base.h.a(this, getString(R.l.dNr), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11276973506560L, 84020);
          VoipCSMainUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(11276973506560L, 84020);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11275094458368L, 84006);
          paramAnonymousDialogInterface.dismiss();
          VoipCSMainUI.this.wG(2);
          GMTrace.o(11275094458368L, 84006);
        }
      });
      GMTrace.o(11280731602944L, 84048);
      return;
    }
    if (paramArrayOfInt[0] == 0)
    {
      bwF();
      GMTrace.o(11280731602944L, 84048);
      return;
    }
    if ("android.permission.CAMERA".equals(paramArrayOfString[0])) {}
    for (paramInt = R.l.dNn;; paramInt = R.l.dNr)
    {
      com.tencent.mm.ui.base.h.a(this, getString(paramInt), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11275899764736L, 84012);
          paramAnonymousDialogInterface.dismiss();
          VoipCSMainUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(11275899764736L, 84012);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(11274020716544L, 83998);
          paramAnonymousDialogInterface.dismiss();
          VoipCSMainUI.this.wG(3);
          GMTrace.o(11274020716544L, 83998);
        }
      });
      break;
    }
  }
  
  protected void onRestart()
  {
    GMTrace.i(11279657861120L, 84040);
    w.i("MicroMsg.voipcs.VoipCSMainUI", "onRestart voipcs....");
    super.onRestart();
    if ((bwG()) && (com.tencent.mm.plugin.voip_cs.b.b.bwp().qSb <= 1)) {
      bwF();
    }
    if (this.qSM != null) {
      this.qSM.eIE = false;
    }
    GMTrace.o(11279657861120L, 84040);
  }
  
  protected void onResume()
  {
    GMTrace.i(11279389425664L, 84038);
    w.i("MicroMsg.voipcs.VoipCSMainUI", "onResume voipcs....");
    super.onResume();
    if (this.qSM != null)
    {
      this.qSM.eIE = false;
      if (com.tencent.mm.plugin.voip_cs.b.b.bwp().qSb > 1)
      {
        bwF();
        if ((this.qSQ != null) && (this.qSQ.equals("1"))) {
          this.qSM.bwC();
        }
      }
    }
    if (this.qST != null) {
      this.qST.stopTimer();
    }
    at.getNotification().cancel(44);
    GMTrace.o(11279389425664L, 84038);
  }
  
  protected void onStop()
  {
    GMTrace.i(11279792078848L, 84041);
    super.onStop();
    GMTrace.o(11279792078848L, 84041);
  }
  
  public final void wG(int paramInt)
  {
    GMTrace.i(11280194732032L, 84044);
    w.d("MicroMsg.voipcs.VoipCSMainUI", "onExitVoipCS for action:" + paramInt + ",CallingStatus:" + com.tencent.mm.plugin.voip_cs.b.b.bwp().qSb);
    if (com.tencent.mm.plugin.voip_cs.b.b.bwp().qSb == 0)
    {
      finish();
      GMTrace.o(11280194732032L, 84044);
      return;
    }
    if (this.qSM != null) {
      this.qSM.wJ(paramInt);
    }
    GMTrace.o(11280194732032L, 84044);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\voip_cs\ui\VoipCSMainUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */