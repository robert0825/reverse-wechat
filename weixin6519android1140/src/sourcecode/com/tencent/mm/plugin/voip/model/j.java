package com.tencent.mm.plugin.voip.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.PowerManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.b.e.a;
import com.tencent.mm.g.a.sh;
import com.tencent.mm.g.a.tf;
import com.tencent.mm.g.a.tf.a;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver.a;
import com.tencent.mm.plugin.voip.video.CaptureView;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.plugin.voip.video.f;
import com.tencent.mm.plugin.voip.video.j.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.y.ac;
import com.tencent.mm.y.at;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;

public final class j
  implements e.a, k.a, p, com.tencent.mm.plugin.voip.ui.c, f, com.tencent.mm.plugin.voip.video.j.a
{
  public com.tencent.mm.compatible.util.b eyB;
  public String fKP;
  public ae iAX;
  private boolean mIsMute;
  public int mUIType;
  private boolean mYA;
  public TelephonyManager mij;
  public PhoneStateListener mik;
  public com.tencent.mm.sdk.b.c mil;
  private long mkB;
  public com.tencent.mm.plugin.voip.b.c qGX;
  public HeadsetPlugReceiver qGY;
  public com.tencent.mm.plugin.voip.ui.b qGZ;
  com.tencent.mm.plugin.voip.widget.b qHA;
  public boolean qHB;
  private boolean qHC;
  public String qHD;
  public BroadcastReceiver qHE;
  public HeadsetPlugReceiver.a qHF;
  public com.tencent.mm.sdk.b.c qHG;
  public com.tencent.mm.plugin.voip.video.a qHa;
  private CaptureView qHb;
  public a qHc;
  private boolean qHd;
  private Object qHe;
  public x qHf;
  public boolean qHg;
  public boolean qHh;
  public boolean qHi;
  public int qHj;
  private boolean qHk;
  public int qHl;
  public long qHm;
  public boolean qHn;
  public boolean qHo;
  private boolean qHp;
  public boolean qHq;
  int qHr;
  public com.tencent.mm.plugin.voip.video.j qHs;
  private com.tencent.mm.sdk.platformtools.aj qHt;
  private com.tencent.mm.sdk.platformtools.af qHu;
  private boolean qHv;
  boolean qHw;
  int qHx;
  boolean qHy;
  public boolean qHz;
  
  public j()
  {
    GMTrace.i(5247242076160L, 39095);
    this.qHc = null;
    this.qHd = false;
    this.qHe = new Object();
    this.qHi = false;
    this.qHj = 4096;
    this.qHk = false;
    this.qHl = 1;
    this.mIsMute = false;
    this.qHm = -1L;
    this.qHn = false;
    this.qHo = false;
    this.qHp = false;
    this.mYA = false;
    this.qHq = false;
    this.qHr = 0;
    this.qHs = new com.tencent.mm.plugin.voip.video.j();
    this.qHt = null;
    this.qHv = false;
    this.qHw = false;
    this.qHx = 0;
    this.qHy = false;
    this.qHz = false;
    this.qHB = false;
    this.qHC = false;
    this.qHD = null;
    this.qHE = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(5320927608832L, 39644);
        paramAnonymousContext = paramAnonymousIntent.getAction();
        paramAnonymousIntent = (PowerManager)ab.getContext().getSystemService("power");
        if (("android.intent.action.USER_PRESENT".equals(paramAnonymousContext)) && (paramAnonymousIntent.isScreenOn()))
        {
          j.this.qHq = false;
          GMTrace.o(5320927608832L, 39644);
          return;
        }
        if ("android.intent.action.SCREEN_ON".equals(paramAnonymousContext))
        {
          j.this.qHq = false;
          GMTrace.o(5320927608832L, 39644);
          return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(paramAnonymousContext))
        {
          j.this.qHq = true;
          if ((!com.tencent.mm.plugin.voip.b.b.wB(j.this.qGX.mState)) && (!j.this.qHg)) {
            d.btG().stopRing();
          }
        }
        GMTrace.o(5320927608832L, 39644);
      }
    };
    this.mil = new com.tencent.mm.sdk.b.c() {};
    this.qHF = new HeadsetPlugReceiver.a()
    {
      public final void fp(boolean paramAnonymousBoolean)
      {
        GMTrace.i(5266166775808L, 39236);
        w.d("MicroMsg.Voip.VoipMgr", "onHeadsetState, on:%b", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
        if (((true == paramAnonymousBoolean) && (3 == j.this.qHl)) || ((!paramAnonymousBoolean) && (3 != j.this.qHl)))
        {
          w.d("MicroMsg.Voip.VoipMgr", "same status, no changed");
          GMTrace.o(5266166775808L, 39236);
          return;
        }
        if (com.tencent.mm.plugin.voip.b.b.wC(j.this.qGX.mState)) {
          if (paramAnonymousBoolean)
          {
            j.this.iv(false);
            j.this.qHl = 3;
          }
        }
        for (;;)
        {
          j.this.wl(j.this.qHl);
          GMTrace.o(5266166775808L, 39236);
          return;
          if (!d.btG().buQ())
          {
            j.this.iv(false);
            j.this.qHl = 3;
          }
          else
          {
            Toast.makeText(j.this.getContext(), j.this.getContext().getString(R.l.eji), 0).show();
            j.this.iv(true);
            j.this.qHl = 1;
            continue;
            if (paramAnonymousBoolean)
            {
              if (1 == j.this.qHl) {
                j.this.iv(false);
              }
              for (j.this.qHn = true;; j.this.qHn = false)
              {
                j.this.qHl = 3;
                break;
              }
            }
            if (d.btG().buQ()) {
              break;
            }
            j.this.iv(false);
            j.this.qHl = 2;
          }
        }
        if ((j.this.qHn) || (2 == j.this.mUIType))
        {
          Toast.makeText(j.this.getContext(), j.this.getContext().getString(R.l.eji), 0).show();
          j.this.iv(true);
        }
        for (j.this.qHl = 1;; j.this.qHl = 2)
        {
          j.this.qHn = false;
          break;
          Toast.makeText(j.this.getContext(), j.this.getContext().getString(R.l.ejh), 0).show();
        }
      }
    };
    this.mkB = 0L;
    this.mik = new PhoneStateListener()
    {
      public final void onCallStateChanged(int paramAnonymousInt, String paramAnonymousString)
      {
        GMTrace.i(5315558899712L, 39604);
        super.onCallStateChanged(paramAnonymousInt, paramAnonymousString);
        w.d("MicroMsg.Voip.VoipMgr", "onCallStateChanged :%d, isStartVoip: %b", new Object[] { Integer.valueOf(paramAnonymousInt), Boolean.valueOf(j.this.qHz) });
        if (!j.this.qHz)
        {
          GMTrace.o(5315558899712L, 39604);
          return;
        }
        if (paramAnonymousInt == 1)
        {
          j.this.qHB = true;
          d.btG().wt(1);
          GMTrace.o(5315558899712L, 39604);
          return;
        }
        if (paramAnonymousInt == 2)
        {
          j.this.qHB = false;
          w.i("MicroMsg.Voip.VoipMgr", "phone call coming now!");
          if ((j.this.qHg) && (!com.tencent.mm.plugin.voip.b.b.wB(j.this.qGX.mState)))
          {
            paramAnonymousString = d.btG().qIe;
            w.i("MicroMsg.Voip.VoipServiceEx", "cancelCallByPhoneInter, roomId:" + paramAnonymousString.qDX.qFr.mjF);
            if (paramAnonymousString.qDX.qFr.mjF != 0)
            {
              paramAnonymousString.qDX.qFr.qKT.qGe = 102;
              paramAnonymousString.qDX.qFr.qKT.qGq = 6;
              com.tencent.mm.plugin.report.service.g.ork.a(11521, true, true, new Object[] { Integer.valueOf(d.btG().qIe.qDX.qFr.mjF), Long.valueOf(d.btG().buL()), Long.valueOf(d.btG().buM()), Integer.valueOf(3), Long.valueOf(System.currentTimeMillis()), Long.valueOf(System.currentTimeMillis()) });
              paramAnonymousString.buX();
            }
          }
          Object localObject;
          label397:
          String str;
          if (com.tencent.mm.plugin.voip.b.b.wB(j.this.qGX.mState))
          {
            paramAnonymousString = ab.getContext().getString(R.l.ehx, new Object[] { j.ax(bg.aG(j.this.qHm)) });
            localObject = d.btG().qIe;
            w.i("MicroMsg.Voip.VoipServiceEx", "hangUpByPhoneInter");
            if (((n)localObject).qDX.qFr.mjF != 0) {
              break label653;
            }
            ((n)localObject).qDX.qFt.btZ();
            ((n)localObject).reset();
            str = j.this.qHf.field_username;
            if (!j.this.qHh) {
              break label690;
            }
            localObject = au.vBm;
            label423:
            if (!j.this.qHg) {
              break label697;
            }
          }
          label653:
          label690:
          label697:
          for (paramAnonymousInt = 1;; paramAnonymousInt = 0)
          {
            l.a(str, (String)localObject, paramAnonymousInt, 6, paramAnonymousString);
            j.this.iQ(4107);
            j.this.buq();
            paramAnonymousString = new au();
            paramAnonymousString.setType(10000);
            paramAnonymousString.E(System.currentTimeMillis());
            paramAnonymousString.dB(6);
            paramAnonymousString.setContent(ab.getContext().getString(R.l.ehw) + ", <a href=\"weixin://voip/callagain/?username=" + j.this.fKP + "&isvideocall=" + j.this.qHh + "\">" + ab.getContext().getString(R.l.ehr) + "</a>");
            if ((j.this.fKP != null) && (!j.this.fKP.equals("")))
            {
              paramAnonymousString.db(j.this.fKP);
              at.AR();
              com.tencent.mm.y.c.yM().P(paramAnonymousString);
            }
            d.btG().wt(2);
            GMTrace.o(5315558899712L, 39604);
            return;
            paramAnonymousString = ab.getContext().getString(R.l.ehu);
            break;
            ((n)localObject).qDX.qFr.qKT.qGe = 109;
            ((n)localObject).qDX.qFr.qKT.qGw = 4;
            ((n)localObject).buZ();
            break label397;
            localObject = au.vBl;
            break label423;
          }
        }
        if (paramAnonymousInt == 0)
        {
          d.btG().wt(2);
          if ((1 == j.this.qHl) && (com.tencent.mm.plugin.voip.b.b.wB(j.this.qGX.mState)) && (j.this.qHB)) {
            j.this.iv(true);
          }
          j.this.qHB = false;
        }
        GMTrace.o(5315558899712L, 39604);
      }
    };
    this.qHG = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(5247242076160L, 39095);
  }
  
  private boolean aQT()
  {
    GMTrace.i(5247510511616L, 39097);
    if ((d.btG().buQ()) && (this.qHh))
    {
      GMTrace.o(5247510511616L, 39097);
      return true;
    }
    if ((!this.qHg) && (this.qHh))
    {
      GMTrace.o(5247510511616L, 39097);
      return true;
    }
    GMTrace.o(5247510511616L, 39097);
    return false;
  }
  
  private void avU()
  {
    GMTrace.i(5254221398016L, 39147);
    if (this.qHt == null)
    {
      this.qHu = new com.tencent.mm.sdk.platformtools.af("faceDetect");
      this.qHt = new com.tencent.mm.sdk.platformtools.aj(this.qHu.ngv.getLooper(), new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(5299050119168L, 39481);
          Object localObject1 = j.this;
          if (com.tencent.mm.plugin.voip.b.b.wB(((j)localObject1).qGX.mState))
          {
            ((j)localObject1).qHs.qQf = ((j)localObject1).qHw;
            ((j)localObject1).qHs.qQg = ((j)localObject1).qHx;
            com.tencent.mm.plugin.voip.video.j localj = ((j)localObject1).qHs;
            boolean bool = ((j)localObject1).qHy;
            localObject1 = new int[2];
            Object localObject2;
            int j;
            if (bool)
            {
              localObject1[0] = 1;
              localObject1[1] = 0;
              localObject2 = ByteBuffer.allocate(8);
              ((ByteBuffer)localObject2).asIntBuffer().put((int[])localObject1);
              localObject1 = ((ByteBuffer)localObject2).array();
              if (localj.qHR.setAppCmd(13, (byte[])localObject1, localObject1.length) < 0) {
                break label469;
              }
              j = localObject1.length / 4;
              if (localObject1.length % 4 != 0) {
                break label415;
              }
            }
            label415:
            for (int i = 0;; i = 1)
            {
              i += j;
              localObject2 = ByteBuffer.allocate(i * 4);
              ((ByteBuffer)localObject2).put((byte[])localObject1);
              ((ByteBuffer)localObject2).order(ByteOrder.nativeOrder());
              ((ByteBuffer)localObject2).rewind();
              localObject1 = ((ByteBuffer)localObject2).asIntBuffer();
              localObject2 = new int[i];
              ((IntBuffer)localObject1).get((int[])localObject2);
              i = localObject2[0];
              j = localObject2[1];
              if (i + j == 0) {
                break label420;
              }
              new j.b(localj);
              localObject1 = new j.b(localj);
              ((j.b)localObject1).qQh = (i & 0xFFFF);
              ((j.b)localObject1).qQi = (i >> 16 & 0xFFFF);
              ((j.b)localObject1).qQj = (j & 0xFFFF);
              ((j.b)localObject1).qQk = (j >> 16 & 0xFFFF);
              w.d("MicroMsg.VoipFaceDetector", "detect face, location:%s", new Object[] { localObject1 });
              localObject2 = localj.jlo.iterator();
              while (((Iterator)localObject2).hasNext())
              {
                com.tencent.mm.plugin.voip.video.j.a locala = (com.tencent.mm.plugin.voip.video.j.a)((Iterator)localObject2).next();
                i = ((j.b)localObject1).qQh;
                j = ((j.b)localObject1).qQi;
                int k = ((j.b)localObject1).qQj;
                int m = ((j.b)localObject1).qQk;
                bool = localj.qQf;
                int n = localj.qQg;
                locala.a(new int[] { i, j, k, m }, bool, n);
              }
              localObject1[0] = 0;
              localObject1[1] = 0;
              break;
            }
            label420:
            localObject1 = localj.jlo.iterator();
            while (((Iterator)localObject1).hasNext()) {
              ((com.tencent.mm.plugin.voip.video.j.a)((Iterator)localObject1).next()).a(null, localj.qQf, localj.qQg);
            }
          }
          label469:
          GMTrace.o(5299050119168L, 39481);
          return true;
        }
      }, true);
    }
    this.qHt.z(2000L, 2000L);
    this.qHv = false;
    GMTrace.o(5254221398016L, 39147);
  }
  
  public static String ax(long paramLong)
  {
    GMTrace.i(5252342349824L, 39133);
    String str = String.format("%02d:%02d", new Object[] { Long.valueOf(paramLong / 60L), Long.valueOf(paramLong % 60L) });
    GMTrace.o(5252342349824L, 39133);
    return str;
  }
  
  private boolean buo()
  {
    int k = 0;
    GMTrace.i(5249926430720L, 39115);
    if (!this.qGX.wE(4101))
    {
      GMTrace.o(5249926430720L, 39115);
      return false;
    }
    iQ(4101);
    Object localObject1;
    int j;
    int i;
    Object localObject2;
    Object localObject3;
    if ((261 == this.qGX.mState) || (7 == this.qGX.mState))
    {
      d.btG().wg(1);
      localObject1 = com.tencent.mm.plugin.report.service.g.ork;
      long l = d.btG().buL();
      j = d.btG().qIe.qDX.qFr.mjF;
      if (this.qHg)
      {
        i = 1;
        ((com.tencent.mm.plugin.report.service.g)localObject1).i(11046, new Object[] { Integer.valueOf(2), Long.valueOf(l), Integer.valueOf(j), Integer.valueOf(0), Integer.valueOf(i) });
        localObject1 = com.tencent.mm.plugin.report.service.g.ork;
        localObject2 = new Object[3];
        localObject2[0] = Integer.valueOf(2);
        localObject2[1] = Integer.valueOf(0);
        j = 11080;
        localObject3 = localObject2;
        i = 2;
      }
    }
    for (;;)
    {
      Object localObject4 = localObject1;
      localObject1 = localObject2;
      for (;;)
      {
        localObject1[i] = Integer.valueOf(k);
        ((com.tencent.mm.plugin.report.service.g)localObject4).i(j, (Object[])localObject3);
        do
        {
          d.btG().buN();
          d.btG().buO();
          GMTrace.o(5249926430720L, 39115);
          return true;
          i = 0;
          break;
        } while ((1 != this.qGX.mState) && (3 != this.qGX.mState));
        d.btG().wg(1);
        localObject4 = com.tencent.mm.plugin.report.service.g.ork;
        j = 11046;
        localObject1 = new Object[5];
        localObject1[0] = Integer.valueOf(1);
        localObject1[1] = Long.valueOf(d.btG().buL());
        localObject1[2] = Integer.valueOf(d.btG().qIe.qDX.qFr.mjF);
        localObject1[3] = Integer.valueOf(0);
        i = 4;
        if (!this.qHg) {
          break label364;
        }
        k = 1;
        localObject3 = localObject1;
      }
      label364:
      localObject2 = localObject1;
      localObject3 = localObject1;
      localObject1 = localObject4;
    }
  }
  
  private boolean buy()
  {
    GMTrace.i(5253147656192L, 39139);
    if (com.tencent.mm.plugin.voip.b.b.wB(this.qGX.mState))
    {
      SharedPreferences localSharedPreferences = getContext().getSharedPreferences("voip_plugin_prefs", 0);
      if (!localSharedPreferences.getBoolean("voip_shortcut_has_added", false))
      {
        Object localObject = com.tencent.mm.k.g.ut().getValue("VOIPShortcutAutoadd");
        w.i("MicroMsg.Voip.VoipMgr", "voip shortcut autoAdd is %s", new Object[] { localObject });
        if ((localObject != null) && (((String)localObject).equals("0")) && (bg.aG(this.qHm) > 30L))
        {
          int i = localSharedPreferences.getInt("voip_shortcut_prompt_times", 0);
          boolean bool = localSharedPreferences.getBoolean("voip_shortcut_never_show_anymore", false);
          if ((i < 3) && (!bool))
          {
            localObject = getContext();
            View localView = View.inflate((Context)localObject, R.i.cBt, null);
            final CheckBox localCheckBox = (CheckBox)localView.findViewById(R.h.bNh);
            localCheckBox.setChecked(false);
            TextView localTextView = (TextView)localView.findViewById(R.h.bNj);
            if (1 == bg.getInt(com.tencent.mm.k.g.ut().getValue("VOIPCallType"), 0)) {
              localTextView.setText(R.l.ehm);
            }
            for (;;)
            {
              com.tencent.mm.ui.base.h.a((Context)localObject, false, ((Context)localObject).getString(R.l.cUG), localView, ((Context)localObject).getString(R.l.cUW), ((Context)localObject).getString(R.l.cTJ), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  GMTrace.i(5321196044288L, 39646);
                  paramAnonymousDialogInterface = j.this.getContext().getSharedPreferences("voip_plugin_prefs", 0);
                  j.this.c(paramAnonymousDialogInterface);
                  if (4096 != j.this.qHj)
                  {
                    j.this.iQ(j.this.qHj);
                    j.this.qHj = 4096;
                  }
                  j.this.iAX.post(new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(20348883959808L, 151611);
                      j.this.eV(false);
                      GMTrace.o(20348883959808L, 151611);
                    }
                  });
                  GMTrace.o(5321196044288L, 39646);
                }
              }, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  GMTrace.i(5311263932416L, 39572);
                  if (localCheckBox != null) {
                    j.this.getContext().getSharedPreferences("voip_plugin_prefs", 0).edit().putBoolean("voip_shortcut_never_show_anymore", localCheckBox.isChecked()).commit();
                  }
                  if (4096 != j.this.qHj)
                  {
                    j.this.iQ(j.this.qHj);
                    j.this.qHj = 4096;
                  }
                  j.this.iAX.post(new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(20349152395264L, 151613);
                      j.this.eV(false);
                      GMTrace.o(20349152395264L, 151613);
                    }
                  });
                  GMTrace.o(5311263932416L, 39572);
                }
              });
              localSharedPreferences.edit().putInt("voip_shortcut_prompt_times", i + 1).commit();
              GMTrace.o(5253147656192L, 39139);
              return true;
              localTextView.setText(R.l.ehn);
            }
          }
        }
        else if ((localObject != null) && (((String)localObject).equals("1")) && (bg.aG(this.qHm) > 15L))
        {
          c(localSharedPreferences);
        }
        GMTrace.o(5253147656192L, 39139);
        return false;
      }
    }
    GMTrace.o(5253147656192L, 39139);
    return false;
  }
  
  private void wm(int paramInt)
  {
    GMTrace.i(5249657995264L, 39113);
    w.i("MicroMsg.Voip.VoipMgr", "hangupTalkingOrCancelInvite");
    if (true == buy()) {
      this.qHj = paramInt;
    }
    Object localObject1 = ab.getContext();
    String str;
    if (com.tencent.mm.plugin.voip.b.b.wB(this.qGX.mState))
    {
      localObject1 = ((Context)localObject1).getString(R.l.ehx, new Object[] { ax(bg.aG(this.qHm)) });
      str = this.qHf.field_username;
      if (!this.qHh) {
        break label326;
      }
      localObject2 = au.vBm;
      label97:
      if (!this.qHg) {
        break label334;
      }
    }
    label326:
    label334:
    for (int i = 1;; i = 0)
    {
      l.a(str, (String)localObject2, i, 6, (String)localObject1);
      if ((!this.qHg) || (com.tencent.mm.plugin.voip.b.b.wB(this.qGX.mState))) {
        break label532;
      }
      d.btG().stopRing();
      if ((this.qHg) && (!com.tencent.mm.plugin.voip.b.b.wB(this.qGX.mState)))
      {
        w.i("MicroMsg.Voip.VoipMgr", "hangupVoipButton OnClick call cancelCall");
        localObject1 = d.btG().qIe;
        w.i("MicroMsg.Voip.VoipServiceEx", "cancelCall, roomId:" + ((n)localObject1).qDX.qFr.mjF);
        if ((((n)localObject1).qDX.qFr.mjF != 0) || (((n)localObject1).qDX.qFr.mjI != 0)) {
          break label339;
        }
        ((n)localObject1).reset();
      }
      w.i("MicroMsg.Voip.VoipMgr", "hangupVoipButton OnClick call hangUp");
      d.btG().buJ();
      if (4096 != this.qHj) {
        break label577;
      }
      iQ(paramInt);
      buq();
      GMTrace.o(5249657995264L, 39113);
      return;
      if (this.qHg)
      {
        localObject1 = ((Context)localObject1).getString(R.l.eht);
        break;
      }
      localObject1 = ((Context)localObject1).getString(R.l.ehs);
      break;
      localObject2 = au.vBl;
      break label97;
    }
    label339:
    ((n)localObject1).qDX.qFr.qKT.qGe = ((n)localObject1).qDX.btL();
    ((n)localObject1).qDX.qFr.qKT.qGq = 3;
    if (((n)localObject1).qDX.mStatus < 6) {
      ((n)localObject1).qDX.qFr.qKT.qGs = 1;
    }
    Object localObject2 = com.tencent.mm.plugin.report.service.g.ork;
    int j = d.btG().qIe.qDX.qFr.mjF;
    long l1 = d.btG().buL();
    long l2 = d.btG().buM();
    if (((n)localObject1).qDX.mStatus == 5) {}
    for (i = 2;; i = 1)
    {
      ((com.tencent.mm.plugin.report.service.g)localObject2).a(11521, true, true, new Object[] { Integer.valueOf(j), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Long.valueOf(System.currentTimeMillis()), Long.valueOf(System.currentTimeMillis()) });
      ((n)localObject1).buX();
      break;
    }
    label532:
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5276769976320L, 39315);
        d.btG().stopRing();
        if (j.this.qHh)
        {
          d.btG().jdMethod_do(R.k.cOi, 0);
          GMTrace.o(5276769976320L, 39315);
          return;
        }
        d.btG().jdMethod_do(R.k.cOi, 1);
        GMTrace.o(5276769976320L, 39315);
      }
    }, "VoipMgr_play_end_sound");
    this.qHd = true;
    d.btG().buJ();
    if (4096 == this.qHj)
    {
      iQ(paramInt);
      buq();
    }
    label577:
    GMTrace.o(5249657995264L, 39113);
  }
  
  private static void wn(int paramInt)
  {
    GMTrace.i(5250329083904L, 39118);
    tf localtf = new tf();
    localtf.eYL.eCx = paramInt;
    com.tencent.mm.sdk.b.a.vgX.m(localtf);
    GMTrace.o(5250329083904L, 39118);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt)
  {
    GMTrace.i(5251805478912L, 39129);
    if (this.qGZ != null) {
      this.qGZ.a(paramInt1, paramInt2, paramArrayOfInt);
    }
    GMTrace.o(5251805478912L, 39129);
  }
  
  public final void a(com.tencent.mm.plugin.voip.ui.b paramb)
  {
    GMTrace.i(5249389559808L, 39111);
    w.i("MicroMsg.Voip.VoipMgr", "onVoipUIDestroy");
    if (this.qGZ == paramb)
    {
      w.d("MicroMsg.Voip.VoipMgr", "same VoipUI, clear it");
      this.qGZ = null;
    }
    if (this.iAX != null) {
      this.iAX = null;
    }
    GMTrace.o(5249389559808L, 39111);
  }
  
  public final void a(com.tencent.mm.plugin.voip.ui.b paramb, int paramInt)
  {
    GMTrace.i(5249255342080L, 39110);
    w.i("MicroMsg.Voip.VoipMgr", "onVoipUICreated");
    if ((1 == paramInt) && (this.qGZ != null)) {
      this.qGZ.uninit();
    }
    this.qGZ = paramb;
    this.mUIType = paramInt;
    int i = 320;
    paramInt = 240;
    if ((this.qHa == null) && (com.tencent.mm.plugin.voip.b.b.wC(this.qGX.mState)))
    {
      this.qHb = new CaptureView(ab.getContext());
      if (v2protocal.qJl)
      {
        w.i("MicroMsg.Voip.VoipMgr", "steve: 640 capture!");
        i = 640;
        paramInt = 480;
      }
      this.qHa = new com.tencent.mm.plugin.voip.video.a(i, paramInt);
      this.qHa.a(this, true);
      this.qHa.a(this.qHb);
      d.btG().wr(this.qHa.bvV());
      this.iAX.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5300660731904L, 39493);
          w.d("MicroMsg.Voip.VoipMgr", "mCaptureRender == " + j.this.qHa);
          if (j.this.qHa != null) {
            j.this.qHa.startCapture();
          }
          GMTrace.o(5300660731904L, 39493);
        }
      }, 50L);
    }
    this.qGZ.a(this.qHb);
    this.qGZ.dq(-1, this.qGX.mState);
    this.qGZ.eg(this.qHm);
    this.qGZ.wu(this.qHl);
    this.qGZ.setMute(this.mIsMute);
    GMTrace.o(5249255342080L, 39110);
  }
  
  public final void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(5252476567552L, 39134);
    if (this.qHq)
    {
      GMTrace.o(5252476567552L, 39134);
      return;
    }
    int j;
    int k;
    label56:
    Object localObject;
    int i;
    label90:
    boolean bool;
    if (this.qHa.bvT())
    {
      j = OpenGlRender.qPs;
      if (!this.qHa.bvU()) {
        break label189;
      }
      k = OpenGlRender.qPr;
      localObject = d.btG();
      i = (int)paramLong;
      localObject = ((m)localObject).qIe.qDX.qFt;
      if (((g)localObject).qFN == 2) {
        break label197;
      }
      i = 0;
      if (this.qGZ != null) {
        this.qGZ.a(paramArrayOfByte, paramLong, paramInt1, paramInt2, paramInt3, j, k, i);
      }
      if (j != OpenGlRender.qPs) {
        break label261;
      }
      bool = true;
      label131:
      this.qHw = bool;
      if (k != OpenGlRender.qPr) {
        break label267;
      }
    }
    label189:
    label197:
    label261:
    label267:
    for (paramInt3 = 270;; paramInt3 = 90)
    {
      this.qHx = paramInt3;
      paramArrayOfByte = this.qHs;
      paramArrayOfByte.mPreviewHeight = paramInt2;
      paramArrayOfByte.mPreviewWidth = paramInt1;
      GMTrace.o(5252476567552L, 39134);
      return;
      j = 0;
      break;
      k = OpenGlRender.qPq;
      break label56;
      if (!((g)localObject).qDX.btS())
      {
        i = 0;
        break label90;
      }
      v2protocal localv2protocal = ((g)localObject).qDX.qFr;
      localv2protocal.qKB += 1;
      i = ((g)localObject).qDX.qFr.videoEncodeToSend(paramArrayOfByte, i, paramInt1, paramInt2, paramInt3);
      break label90;
      bool = false;
      break label131;
    }
  }
  
  public final void a(final int[] paramArrayOfInt, final boolean paramBoolean, final int paramInt)
  {
    GMTrace.i(5254355615744L, 39148);
    com.tencent.mm.sdk.platformtools.af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5260798066688L, 39196);
        if (j.this.qHa != null) {
          j.this.qHa.m(paramArrayOfInt);
        }
        if (j.this.qGZ != null) {
          com.tencent.mm.plugin.voip.ui.b localb = j.this.qGZ;
        }
        GMTrace.o(5260798066688L, 39196);
      }
    });
    GMTrace.o(5254355615744L, 39148);
  }
  
  public final void aHH()
  {
    GMTrace.i(5250597519360L, 39120);
    w.i("MicroMsg.Voip.VoipMgr", "on accept");
    d.btG().stopRing();
    iQ(4100);
    GMTrace.o(5250597519360L, 39120);
  }
  
  public final void aHM()
  {
    GMTrace.i(5252879220736L, 39137);
    w.i("MicroMsg.Voip.VoipMgr", "onBadNetStatus");
    if (this.qGZ != null) {
      this.qGZ.bvv();
    }
    if ((!com.tencent.mm.plugin.voip.b.b.wC(this.qGX.mState)) && (!this.qHp))
    {
      long l = System.currentTimeMillis();
      if (l - this.mkB > 30000L)
      {
        this.mkB = l;
        d.btG().ws(R.k.cPz);
      }
    }
    GMTrace.o(5252879220736L, 39137);
  }
  
  public final void aHN()
  {
    GMTrace.i(5253013438464L, 39138);
    w.i("MicroMsg.Voip.VoipMgr", "onResumeGoodNetStatus");
    if (this.qGZ != null) {
      this.qGZ.aJA();
    }
    GMTrace.o(5253013438464L, 39138);
  }
  
  public final void aRZ()
  {
    GMTrace.i(5254087180288L, 39146);
    if ((true == this.mYA) || (this.qGZ == null) || (this.qGZ.bvu() == null))
    {
      w.d("MicroMsg.Voip.VoipMgr", "onCameraError, already show");
      GMTrace.o(5254087180288L, 39146);
      return;
    }
    if ((Build.MANUFACTURER.equalsIgnoreCase("meizu")) && (!com.tencent.mm.compatible.e.b.tu()))
    {
      w.d("MicroMsg.Voip.VoipMgr", "onCameraError, meizu machine");
      GMTrace.o(5254087180288L, 39146);
      return;
    }
    w.d("MicroMsg.Voip.VoipMgr", "onCameraError, show dialog");
    Object localObject = com.tencent.mm.plugin.report.service.g.ork;
    if (this.qHh) {}
    for (int i = 0;; i = 1)
    {
      ((com.tencent.mm.plugin.report.service.g)localObject).i(11306, new Object[] { Integer.valueOf(i), Integer.valueOf(0) });
      localObject = com.tencent.mm.ui.base.h.h(this.qGZ.bvu(), R.l.eiN, R.l.cUG);
      if (localObject != null) {
        break;
      }
      w.e("MicroMsg.Voip.VoipMgr", "new dialog failed");
      GMTrace.o(5254087180288L, 39146);
      return;
    }
    ((i)localObject).setCancelable(false);
    ((i)localObject).setCanceledOnTouchOutside(false);
    ((i)localObject).show();
    this.mYA = true;
    GMTrace.o(5254087180288L, 39146);
  }
  
  public final void buA()
  {
    GMTrace.i(5253818744832L, 39144);
    if (!this.qHv) {}
    for (boolean bool = true;; bool = false)
    {
      this.qHv = bool;
      if (!this.qHv) {
        break;
      }
      this.qHt.stopTimer();
      GMTrace.o(5253818744832L, 39144);
      return;
    }
    avU();
    GMTrace.o(5253818744832L, 39144);
  }
  
  public final void buB()
  {
    GMTrace.i(5253952962560L, 39145);
    d.btG().qIk = d.btG().qIe.qDX.qFr.mjF;
    String str2 = this.qHf.field_username;
    String str1;
    if (this.qHh)
    {
      str1 = au.vBm;
      if (!this.qHg) {
        break label125;
      }
    }
    label125:
    for (int i = 1;; i = 0)
    {
      l.a(str2, str1, i, 6, ab.getContext().getString(R.l.ehA));
      d.btG().stopRing();
      iQ(4108);
      this.iAX.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5287641612288L, 39396);
          j.this.eV(true);
          GMTrace.o(5287641612288L, 39396);
        }
      }, 2000L);
      GMTrace.o(5253952962560L, 39145);
      return;
      str1 = au.vBl;
      break;
    }
  }
  
  public final boolean bue()
  {
    GMTrace.i(5248181600256L, 39102);
    if (!this.qGX.wE(4103))
    {
      GMTrace.o(5248181600256L, 39102);
      return false;
    }
    wm(4103);
    GMTrace.o(5248181600256L, 39102);
    return true;
  }
  
  public final boolean buf()
  {
    GMTrace.i(5248315817984L, 39103);
    if (!this.qGX.wE(4101))
    {
      GMTrace.o(5248315817984L, 39103);
      return false;
    }
    d.btG().stopRing();
    d.btG().wg(1);
    d.btG().w(true, this.qHh);
    com.tencent.mm.plugin.report.service.g localg = com.tencent.mm.plugin.report.service.g.ork;
    long l = d.btG().buL();
    int j = d.btG().qIe.qDX.qFr.mjF;
    if (this.qHg) {}
    for (int i = 1;; i = 0)
    {
      localg.i(11046, new Object[] { Integer.valueOf(1), Long.valueOf(l), Integer.valueOf(j), Integer.valueOf(0), Integer.valueOf(i) });
      com.tencent.mm.plugin.report.service.g.ork.i(11080, new Object[] { Integer.valueOf(2), Integer.valueOf(0), Integer.valueOf(0) });
      iQ(4111);
      iQ(4101);
      iQ(4100);
      GMTrace.o(5248315817984L, 39103);
      return true;
    }
  }
  
  public final boolean bug()
  {
    int i = 0;
    GMTrace.i(5248450035712L, 39104);
    if (!this.qGX.wE(4099))
    {
      GMTrace.o(5248450035712L, 39104);
      return false;
    }
    String str2 = this.qHf.field_username;
    if (this.qHh) {}
    for (String str1 = au.vBm;; str1 = au.vBl)
    {
      if (this.qHg) {
        i = 1;
      }
      l.a(str2, str1, i, 6, ab.getContext().getString(R.l.ehB));
      d.btG().stopRing();
      d.btG().qIe.buY();
      iQ(4099);
      buq();
      GMTrace.o(5248450035712L, 39104);
      return true;
    }
  }
  
  public final boolean buh()
  {
    GMTrace.i(5248584253440L, 39105);
    if (!this.qGX.wE(4100))
    {
      GMTrace.o(5248584253440L, 39105);
      return false;
    }
    w.i("MicroMsg.Voip.VoipMgr", "onAcceptVideoInvite");
    d.btG().stopRing();
    d.btG().w(false, this.qHh);
    iQ(4100);
    GMTrace.o(5248584253440L, 39105);
    return true;
  }
  
  public final boolean bui()
  {
    int i = 0;
    GMTrace.i(5248718471168L, 39106);
    if (!this.qGX.wE(4099))
    {
      GMTrace.o(5248718471168L, 39106);
      return false;
    }
    w.i("MicroMsg.Voip.VoipMgr", "onRejectVoiceInvite");
    String str2 = this.qHf.field_username;
    if (this.qHh) {}
    for (String str1 = au.vBm;; str1 = au.vBl)
    {
      if (this.qHg) {
        i = 1;
      }
      l.a(str2, str1, i, 6, ab.getContext().getString(R.l.ehB));
      d.btG().stopRing();
      d.btG().qIe.buY();
      iQ(4099);
      buq();
      GMTrace.o(5248718471168L, 39106);
      return true;
    }
  }
  
  public final boolean buj()
  {
    GMTrace.i(5248852688896L, 39107);
    if (!this.qGX.wE(4100))
    {
      GMTrace.o(5248852688896L, 39107);
      return false;
    }
    w.i("MicroMsg.Voip.VoipMgr", "onAcceptVoiceInvite");
    d.btG().stopRing();
    d.btG().w(true, this.qHh);
    iQ(4111);
    iQ(4100);
    GMTrace.o(5248852688896L, 39107);
    return true;
  }
  
  public final boolean buk()
  {
    GMTrace.i(5248986906624L, 39108);
    if (!this.qGX.wE(4098))
    {
      GMTrace.o(5248986906624L, 39108);
      return false;
    }
    w.i("MicroMsg.Voip.VoipMgr", "onCancelVideoInvite");
    wm(4098);
    GMTrace.o(5248986906624L, 39108);
    return true;
  }
  
  public final boolean bul()
  {
    GMTrace.i(5249121124352L, 39109);
    if (!this.qGX.wE(4098))
    {
      GMTrace.o(5249121124352L, 39109);
      return false;
    }
    w.i("MicroMsg.Voip.VoipMgr", "onCancelVoiceInvite");
    wm(4098);
    GMTrace.o(5249121124352L, 39109);
    return true;
  }
  
  public final void bum()
  {
    GMTrace.i(5249523777536L, 39112);
    w.i("MicroMsg.Voip.VoipMgr", "onSwitchCamera");
    if (this.qHa != null) {
      this.qHa.bvR();
    }
    com.tencent.mm.plugin.report.service.g.ork.i(11079, new Object[] { Integer.valueOf(1) });
    GMTrace.o(5249523777536L, 39112);
  }
  
  public final boolean bun()
  {
    GMTrace.i(5249792212992L, 39114);
    if (d.btG().qIe.qDX.qFr.mjF == 0)
    {
      this.qHk = true;
      GMTrace.o(5249792212992L, 39114);
      return true;
    }
    boolean bool = buo();
    GMTrace.o(5249792212992L, 39114);
    return bool;
  }
  
  public final void bup()
  {
    GMTrace.i(5250060648448L, 39116);
    w.i("MicroMsg.Voip.VoipMgr", "onRoomReady");
    if ((this.qHk) && (d.btG().qIe.qDX.qFr.mjF != 0))
    {
      this.qHk = false;
      buo();
    }
    if (this.qHg) {
      iQ(4097);
    }
    GMTrace.o(5250060648448L, 39116);
  }
  
  public final void buq()
  {
    GMTrace.i(5250865954816L, 39122);
    w.d("MicroMsg.Voip.VoipMgr", "delayFinish");
    this.qHD = null;
    this.iAX.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5276233105408L, 39311);
        j.this.eV(false);
        GMTrace.o(5276233105408L, 39311);
      }
    }, 2000L);
    GMTrace.o(5250865954816L, 39122);
  }
  
  public final void bur()
  {
    GMTrace.i(5251134390272L, 39124);
    w.i("MicroMsg.Voip.VoipMgr", "onNoResp");
    iQ(4105);
    String str2 = this.qHf.field_username;
    String str1;
    if (this.qHh)
    {
      str1 = au.vBm;
      if (!this.qHg) {
        break label172;
      }
    }
    label172:
    for (int i = 1;; i = 0)
    {
      l.a(str2, str1, i, 4, ab.getContext().getString(R.l.ehE));
      com.tencent.mm.plugin.report.service.g.ork.a(11518, true, true, new Object[] { Integer.valueOf(d.btG().qIe.qDX.qFr.mjF), Long.valueOf(d.btG().buL()), Long.valueOf(d.btG().buM()), Integer.valueOf(6), Integer.valueOf(am.getNetWorkType(getContext())) });
      buq();
      GMTrace.o(5251134390272L, 39124);
      return;
      str1 = au.vBl;
      break;
    }
  }
  
  public final void bus()
  {
    int i = 0;
    GMTrace.i(5251402825728L, 39126);
    com.tencent.mm.plugin.report.service.g localg = com.tencent.mm.plugin.report.service.g.ork;
    int j = d.btG().qIe.qDX.qFr.mjF;
    long l1 = d.btG().buL();
    long l2 = d.btG().buM();
    if (this.qHg) {}
    for (;;)
    {
      localg.a(11522, true, true, new Object[] { Integer.valueOf(j), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(1) });
      GMTrace.o(5251402825728L, 39126);
      return;
      i = 1;
    }
  }
  
  public final void but()
  {
    GMTrace.i(5251537043456L, 39127);
    w.i("MicroMsg.Voip.VoipMgr", "onShutDown");
    String str1;
    String str2;
    if (com.tencent.mm.plugin.voip.b.b.wB(this.qGX.mState))
    {
      str1 = ab.getContext().getString(R.l.ehx, new Object[] { ax(bg.aG(this.qHm)) });
      if ((this.qHg) || (com.tencent.mm.plugin.voip.b.b.wB(this.qGX.mState)))
      {
        String str3 = this.qHf.field_username;
        if (!this.qHh) {
          break label161;
        }
        str2 = au.vBm;
        label97:
        l.a(str3, str2, 0, 6, str1);
      }
      if (!this.qHh) {
        break label168;
      }
      d.btG().jdMethod_do(R.k.cOi, 0);
    }
    for (;;)
    {
      if (!buy()) {
        break label181;
      }
      this.qHj = 4106;
      GMTrace.o(5251537043456L, 39127);
      return;
      str1 = ab.getContext().getString(R.l.ehu);
      break;
      label161:
      str2 = au.vBl;
      break label97;
      label168:
      d.btG().jdMethod_do(R.k.cOi, 1);
    }
    label181:
    iQ(4106);
    buq();
    GMTrace.o(5251537043456L, 39127);
  }
  
  public final void buu()
  {
    GMTrace.i(5251939696640L, 39130);
    if (this.qGZ != null) {
      this.qGZ.buu();
    }
    GMTrace.o(5251939696640L, 39130);
  }
  
  public final void buv()
  {
    boolean bool2 = false;
    GMTrace.i(5252208132096L, 39132);
    w.d("MicroMsg.Voip.VoipMgr", "onPretreatmentForStartDev");
    if ((at.AS().sn()) || (at.AS().sh()))
    {
      iv(false);
      GMTrace.o(5252208132096L, 39132);
      return;
    }
    boolean bool1;
    if (1 == this.qHl)
    {
      bool1 = true;
      if (!this.qHC) {
        break label92;
      }
      bool1 = bool2;
    }
    for (;;)
    {
      iv(bool1);
      GMTrace.o(5252208132096L, 39132);
      return;
      bool1 = false;
      break;
      label92:
      if (this.qHh) {
        bool1 = true;
      }
    }
  }
  
  public final void buw()
  {
    GMTrace.i(5252610785280L, 39135);
    synchronized (this.qHe)
    {
      d.btG().stopRing();
      bux();
      at.AS().setMode(0);
      if (this.eyB != null) {
        this.eyB.tx();
      }
      GMTrace.o(5252610785280L, 39135);
      return;
    }
  }
  
  final void bux()
  {
    GMTrace.i(5252745003008L, 39136);
    w.j("MicroMsg.Voip.VoipMgr", "uninitCaptureRender", new Object[0]);
    if (this.qHa != null)
    {
      if (this.qHs != null)
      {
        com.tencent.mm.plugin.voip.video.j localj = this.qHs;
        if (localj.jlo.contains(this)) {
          localj.jlo.remove(this);
        }
      }
      if (this.qHt != null)
      {
        w.d("MicroMsg.Voip.VoipMgr", "stop face detect timer");
        this.qHt.stopTimer();
      }
      if (this.qHu != null)
      {
        w.d("MicroMsg.Voip.VoipMgr", "quit face detect thread");
        this.qHu.ngv.getLooper().quit();
      }
    }
    try
    {
      this.qHa.stopCapture();
      com.tencent.mm.plugin.voip.video.a.bvS();
      this.qHa = null;
      GMTrace.o(5252745003008L, 39136);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.d("MicroMsg.Voip.VoipMgr", "stop capture error:" + localException.toString());
      }
    }
  }
  
  public final void buz()
  {
    GMTrace.i(5253684527104L, 39143);
    if ((256 != this.qGX.mState) && (257 != this.qGX.mState))
    {
      GMTrace.o(5253684527104L, 39143);
      return;
    }
    at.AR();
    if ((com.tencent.mm.y.c.xh().getInt(327945, 0) == 0) && (this.qGZ.bvu() != null))
    {
      at.AR();
      com.tencent.mm.y.c.xh().setInt(327945, 1);
      i locali = com.tencent.mm.ui.base.h.a(this.qGZ.bvu(), R.l.eiD, R.l.cUG, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(5299586990080L, 39485);
          j.this.buB();
          GMTrace.o(5299586990080L, 39485);
        }
      });
      locali.setCancelable(false);
      locali.setCanceledOnTouchOutside(false);
      locali.show();
      GMTrace.o(5253684527104L, 39143);
      return;
    }
    com.tencent.mm.plugin.voip.b.d.H(ab.getContext(), R.l.eiD);
    buB();
    GMTrace.o(5253684527104L, 39143);
  }
  
  public final void c(SharedPreferences paramSharedPreferences)
  {
    GMTrace.i(5253281873920L, 39140);
    Intent localIntent1 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
    localIntent1.putExtra("duplicate", false);
    Intent localIntent2 = new Intent("com.tencent.mm.action.BIZSHORTCUT");
    localIntent2.addFlags(67108864);
    if (1 == bg.getInt(com.tencent.mm.k.g.ut().getValue("VOIPCallType"), 0))
    {
      localIntent2.putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_voip");
      localIntent1.putExtra("android.intent.extra.shortcut.NAME", getContext().getString(R.l.cTc));
      localIntent1.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(getContext(), R.g.bbO));
      localIntent1.putExtra("shortcut_icon_resource_id", R.g.bbO);
    }
    for (;;)
    {
      localIntent1.putExtra("android.intent.extra.shortcut.INTENT", localIntent2);
      com.tencent.mm.plugin.base.model.b.n(getContext(), localIntent1);
      paramSharedPreferences.edit().putBoolean("voip_shortcut_has_added", true).commit();
      GMTrace.o(5253281873920L, 39140);
      return;
      localIntent2.putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_voip_audio");
      localIntent1.putExtra("android.intent.extra.shortcut.NAME", getContext().getString(R.l.cTd));
      localIntent1.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(getContext(), R.g.bbW));
      localIntent1.putExtra("shortcut_icon_resource_id", R.g.bbW);
    }
  }
  
  public final void dc(int paramInt)
  {
    int j = 1;
    int i = 1;
    GMTrace.i(5247376293888L, 39096);
    w.d("MicroMsg.Voip.VoipMgr", "onBluetoothHeadsetStateChange status: %d, mBTRecoverSpeakerOn: %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.qHo) });
    switch (paramInt)
    {
    default: 
      GMTrace.o(5247376293888L, 39096);
      return;
    case 3: 
      at.AS().sf();
      GMTrace.o(5247376293888L, 39096);
      return;
    case 4: 
      at.AS().sg();
      at.AS().se();
      iv(aQT());
      if (aQT()) {}
      for (paramInt = i;; paramInt = 2)
      {
        wl(paramInt);
        GMTrace.o(5247376293888L, 39096);
        return;
      }
    case 1: 
      paramInt = d.btG().btE();
      at.AS().a(false, paramInt);
      d.btG().it(false);
      d.btG().iz(false);
      paramInt = 4;
    }
    for (;;)
    {
      wl(paramInt);
      break;
      at.AS().sg();
      iv(aQT());
      paramInt = j;
      if (!aQT()) {
        paramInt = 2;
      }
    }
  }
  
  public final void eV(boolean paramBoolean)
  {
    GMTrace.i(5251000172544L, 39123);
    w.i("MicroMsg.Voip.VoipMgr", "finish");
    this.qHz = false;
    this.qHB = false;
    if (this.qHr != -1)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(11700, new Object[] { Integer.valueOf(this.qHr), Long.valueOf(bg.aG(this.qHm)) });
      this.qHr = -1;
    }
    try
    {
      ab.getContext().unregisterReceiver(this.qHE);
      com.tencent.mm.sdk.b.a.vgX.c(this.mil);
      com.tencent.mm.sdk.b.a.vgX.c(this.qHG);
      if (this.qGZ != null)
      {
        this.qGZ.uninit();
        this.qGZ = null;
      }
      this.qHb = null;
      at.AS().b(this);
      at.AS().sg();
      label193:
      Object localObject2;
      Object localObject1;
      if (d.btG() != null)
      {
        d.btG().stopRing();
        if (paramBoolean)
        {
          d.btG().qIe.bva();
          if (!this.qHh) {
            break label389;
          }
          d.btG().a(false, true, this.fKP);
          localObject2 = d.btG();
          localObject1 = ab.getContext();
          localObject2 = ((m)localObject2).qIe;
          if ((localObject1 == ((n)localObject2).qDX.iPn) && (this == ((n)localObject2).qDX.qFs)) {
            break label404;
          }
          com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipServiceEx", "cannot detach other's ui.");
        }
      }
      else
      {
        label237:
        localObject1 = d.btG();
        ((m)localObject1).qIf = null;
        ((m)localObject1).qIn = null;
        ((m)localObject1).qIo = false;
        if (!this.qHd) {
          break label437;
        }
        this.qHc = new a();
        com.tencent.mm.sdk.f.e.post(this.qHc, "VoipMgr_clean");
      }
      for (;;)
      {
        if ((this.mij != null) && (this.mik != null))
        {
          this.mij.listen(this.mik, 0);
          this.mik = null;
        }
        if (this.qGY != null) {
          this.qGY.di(ab.getContext());
        }
        this.mij = null;
        at.pD().rh();
        k.buC().buE();
        k.buC().qHT = null;
        at.getNotification().cancel(40);
        GMTrace.o(5251000172544L, 39123);
        return;
        d.btG().buJ();
        break;
        label389:
        d.btG().a(false, false, this.fKP);
        break label193;
        label404:
        ((n)localObject2).qDX.iPn = null;
        ((n)localObject2).qDX.qFs = p.qIS;
        com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipServiceEx", "detach ui........");
        com.tencent.mm.plugin.voip.b.a.bvI();
        break label237;
        label437:
        buw();
      }
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public final Context getContext()
  {
    GMTrace.i(5253416091648L, 39141);
    Context localContext1 = null;
    if (this.qGZ != null) {
      localContext1 = this.qGZ.bvu();
    }
    Context localContext2 = localContext1;
    if (localContext1 == null) {
      localContext2 = ab.getContext();
    }
    GMTrace.o(5253416091648L, 39141);
    return localContext2;
  }
  
  public final void gg(boolean paramBoolean)
  {
    int i = 1;
    GMTrace.i(5248047382528L, 39101);
    Object localObject;
    if (paramBoolean)
    {
      localObject = d.btG().qIe.qDX.qFt;
      if (((g)localObject).nlZ != null) {
        ((g)localObject).nlZ.aC(true);
      }
      d.btG().wg(9);
      d.btG().iy(true);
    }
    for (;;)
    {
      this.mIsMute = paramBoolean;
      localObject = com.tencent.mm.plugin.report.service.g.ork;
      if (paramBoolean) {
        i = 2;
      }
      ((com.tencent.mm.plugin.report.service.g)localObject).i(11080, new Object[] { Integer.valueOf(2), Integer.valueOf(0), Integer.valueOf(i) });
      GMTrace.o(5248047382528L, 39101);
      return;
      localObject = d.btG().qIe.qDX.qFt;
      if (((g)localObject).nlZ != null) {
        ((g)localObject).nlZ.aC(false);
      }
      d.btG().wg(8);
      d.btG().iy(false);
    }
  }
  
  public final void iQ(final int paramInt)
  {
    GMTrace.i(5250194866176L, 39117);
    w.j("MicroMsg.Voip.VoipMgr", "swtchState, action: %s, currentState: %s", new Object[] { com.tencent.mm.plugin.voip.b.b.wy(paramInt), com.tencent.mm.plugin.voip.b.b.wy(this.qGX.mState) });
    if ((4101 == paramInt) && (com.tencent.mm.plugin.voip.b.b.wC(this.qGX.mState))) {
      bux();
    }
    int i;
    com.tencent.mm.plugin.voip.b.c localc;
    if (4111 == paramInt)
    {
      i = 1;
      if ((i != 0) && (1 == this.mUIType) && (1 == this.qHl))
      {
        this.qHC = true;
        iv(false);
        wl(2);
      }
      localc = this.qGX;
      if (localc.wE(paramInt)) {
        break label267;
      }
      w.e("MicroMsg.Voip.VoipStateMachine", "can't tranform due to no such rule");
      label132:
      this.iAX.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5276501540864L, 39313);
          if (j.this.qGZ != null) {
            j.this.qGZ.dq(paramInt, j.this.qGX.mState);
          }
          GMTrace.o(5276501540864L, 39313);
        }
      });
      if ((6 == this.qGX.mState) || (260 == this.qGX.mState)) {
        avU();
      }
      switch (this.qGX.mState)
      {
      }
    }
    for (;;)
    {
      GMTrace.o(5250194866176L, 39117);
      return;
      if ((4101 == paramInt) && ((com.tencent.mm.plugin.voip.b.b.wB(this.qGX.mState)) || (this.qHg)))
      {
        i = 1;
        break;
      }
      i = 0;
      break;
      label267:
      i = ((Integer)((Map)localc.qNO.get(Integer.valueOf(localc.mState))).get(Integer.valueOf(paramInt))).intValue();
      w.d("MicroMsg.Voip.VoipStateMachine", "from oldState: %s to newState: %s, action: %s", new Object[] { com.tencent.mm.plugin.voip.b.b.wy(localc.mState), com.tencent.mm.plugin.voip.b.b.wy(i), com.tencent.mm.plugin.voip.b.b.wy(paramInt) });
      localc.mState = i;
      break label132;
      wn(5);
      GMTrace.o(5250194866176L, 39117);
      return;
      wn(6);
    }
  }
  
  public final void iv(boolean paramBoolean)
  {
    GMTrace.i(5247778947072L, 39099);
    w.j("MicroMsg.Voip.VoipMgr", "enableSpeaker: " + paramBoolean, new Object[0]);
    this.qHn = paramBoolean;
    this.qHo = paramBoolean;
    w.d("MicroMsg.Voip.VoipMgr", "MMCore.getAudioManager() " + at.AS().sl());
    if (at.AS().sh()) {
      paramBoolean = false;
    }
    if (com.tencent.mm.compatible.d.p.fQD.fNp)
    {
      com.tencent.mm.compatible.d.p.fQD.dump();
      if (com.tencent.mm.compatible.d.p.fQD.fNq > 0) {
        d.btG().it(paramBoolean);
      }
    }
    if ((com.tencent.mm.compatible.d.p.fQD.fNR >= 0) || (com.tencent.mm.compatible.d.p.fQD.fNS >= 0)) {
      d.btG().it(paramBoolean);
    }
    int i = d.btG().btE();
    at.AS().a(paramBoolean, i);
    d.btG().iz(paramBoolean);
    this.qHp = paramBoolean;
    GMTrace.o(5247778947072L, 39099);
  }
  
  public final void iw(boolean paramBoolean)
  {
    GMTrace.i(5247913164800L, 39100);
    w.d("MicroMsg.Voip.VoipMgr", "onSpeakerStateChanged, isSpeakerOn: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    Object localObject;
    if (!d.btG().buQ())
    {
      localObject = d.btG().qIe;
      if (((n)localObject).qIy != null) {
        ((n)localObject).qIy.iG(paramBoolean);
      }
      if (!paramBoolean) {
        break label131;
      }
      i = 1;
      label66:
      wl(i);
      localObject = com.tencent.mm.plugin.report.service.g.ork;
      if (!paramBoolean) {
        break label136;
      }
    }
    label131:
    label136:
    for (int i = 1;; i = 2)
    {
      ((com.tencent.mm.plugin.report.service.g)localObject).i(11080, new Object[] { Integer.valueOf(2), Integer.valueOf(i), Integer.valueOf(0) });
      GMTrace.o(5247913164800L, 39100);
      return;
      iv(paramBoolean);
      break;
      i = 2;
      break label66;
    }
  }
  
  public final boolean ix(final boolean paramBoolean)
  {
    GMTrace.i(5253550309376L, 39142);
    if ((this.qHB) && (!paramBoolean))
    {
      w.i("MicroMsg.Voip.VoipMgr", "has phone call  cannot mini!");
      GMTrace.o(5253550309376L, 39142);
      return false;
    }
    w.j("MicroMsg.Voip.VoipMgr", "miniOnlyHidenVoip: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    w.i("MicroMsg.Voip.VoipMgr", "onMinimizeVoip, async to minimize");
    if (this.qGZ != null)
    {
      this.qGZ.uninit();
      this.qGZ = null;
    }
    this.iAX.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5246570987520L, 39090);
        j localj = j.this;
        boolean bool = paramBoolean;
        w.i("MicroMsg.Voip.VoipMgr", "do minimizeVoip");
        if ((2 == localj.mUIType) && (Build.VERSION.SDK_INT < 24))
        {
          w.e("MicroMsg.Voip.VoipMgr", "already is widget");
          GMTrace.o(5246570987520L, 39090);
          return;
        }
        localj.mUIType = 2;
        localj.qHr += 1;
        localj.qHA = new com.tencent.mm.plugin.voip.widget.b(localj, localj.qGX.mState, localj.qHf, localj.qHh, localj.qHg, bool);
        int i;
        if ((261 == localj.qGX.mState) || (7 == localj.qGX.mState))
        {
          i = 1;
          if ((2 == localj.qHl) && (i != 0))
          {
            localj.iv(true);
            localj.wl(1);
            at.AR();
            if (1 != com.tencent.mm.y.c.xh().getInt(327949, 0)) {
              break label320;
            }
            Toast.makeText(localj.getContext(), localj.getContext().getString(R.l.ejn), 0).show();
          }
          label191:
          if ((260 == localj.qGX.mState) || (6 == localj.qGX.mState))
          {
            at.AR();
            if (1 != com.tencent.mm.y.c.xh().getInt(327948, 0)) {
              break label357;
            }
            Toast.makeText(localj.getContext(), localj.getContext().getString(R.l.ejg), 0).show();
          }
        }
        for (;;)
        {
          if ((localj.qGX.mState == 0) || (2 == localj.qGX.mState) || (256 == localj.qGX.mState)) {
            localj.bux();
          }
          d.btG().stopRing();
          d.btG().v(true, bool);
          GMTrace.o(5246570987520L, 39090);
          return;
          i = 0;
          break;
          label320:
          Toast.makeText(localj.getContext(), localj.getContext().getString(R.l.ejm), 1).show();
          at.AR();
          com.tencent.mm.y.c.xh().setInt(327949, 1);
          break label191;
          label357:
          Toast.makeText(localj.getContext(), localj.getContext().getString(R.l.ejf), 1).show();
          at.AR();
          com.tencent.mm.y.c.xh().setInt(327948, 1);
        }
      }
    });
    GMTrace.o(5253550309376L, 39142);
    return true;
  }
  
  public final void onConnected()
  {
    GMTrace.i(5251268608000L, 39125);
    iQ(4102);
    this.qHm = bg.Pu();
    if (this.qGZ != null) {
      this.qGZ.eg(this.qHm);
    }
    boolean bool1 = d.btG().qIe.qDX.btP();
    boolean bool2 = d.btG().qIe.qDX.btO();
    if ((this.qHh) && (this.qHg) && (!bool2) && (!bool1)) {
      d.btG().wg(1);
    }
    if (!com.tencent.mm.plugin.voip.b.b.wC(this.qGX.mState)) {
      com.tencent.mm.plugin.report.service.g.ork.i(11080, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0) });
    }
    Object localObject = d.btG().qIe;
    if (((n)localObject).qIy != null)
    {
      localObject = ((n)localObject).qIy;
      bool1 = ((com.tencent.mm.plugin.voip.video.h)localObject).mContext.getSharedPreferences(ab.bPU(), 0).getBoolean("settings_shake", true);
      bg.l(((com.tencent.mm.plugin.voip.video.h)localObject).mContext, bool1);
    }
    localObject = d.btG();
    int i = d.btG().qIe.qDX.qFr.qJA;
    localObject = ((m)localObject).qIe;
    ((n)localObject).aKk = null;
    ((n)localObject).qIF = null;
    ((n)localObject).qID = 0;
    if (i > 0) {
      n.qIB = i;
    }
    ((n)localObject).aKk = ((WifiManager)ab.getContext().getApplicationContext().getSystemService("wifi"));
    ((n)localObject).qIE = new Timer();
    ((n)localObject).qIE.schedule(new n.6((n)localObject), 0L, n.qIB * 1000);
    TelephonyManager localTelephonyManager = (TelephonyManager)ab.getContext().getSystemService("phone");
    if (localTelephonyManager != null) {
      localTelephonyManager.listen(new n.5((n)localObject, localTelephonyManager), 256);
    }
    k.buC().buD();
    k.buC().qHT = this;
    GMTrace.o(5251268608000L, 39125);
  }
  
  public final void onError(int paramInt, String paramString)
  {
    GMTrace.i(5250463301632L, 39119);
    String str1;
    if (this.qHh)
    {
      d.btG().jdMethod_do(R.k.cOi, 0);
      str1 = paramString;
      if (paramInt == 241)
      {
        str1 = paramString;
        if (bg.nm(paramString)) {
          str1 = getContext().getString(R.l.eiT);
        }
      }
      if (this.qGZ != null) {
        this.qGZ.ax(paramInt, str1);
      }
      iQ(4109);
      w.i("MicroMsg.Voip.VoipMgr", "onError, errCode: %s, roomId: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(d.btG().qIe.qDX.qFr.mjF) });
      paramString = ab.getContext();
      w.d("MicroMsg.Voip.VoipMgr", "getErrorMsgContent, errorCode" + paramInt);
      if (paramInt != 235) {
        break label361;
      }
      paramString = paramString.getString(R.l.ehD);
      label167:
      if ((d.btG().qIe.qDX.qFr.mjF == 0) || (d.btG().qIj.get(Integer.valueOf(d.btG().qIe.qDX.qFr.mjF)) != null)) {
        break label457;
      }
      str2 = this.qHf.field_username;
      if (!this.qHh) {
        break label444;
      }
      str1 = au.vBm;
      if (!this.qHg) {
        break label452;
      }
      paramInt = 1;
      if (com.tencent.mm.plugin.voip.b.b.wB(this.qGX.mState)) {
        paramString = ab.getContext().getString(R.l.ehy, new Object[] { ax(bg.aG(this.qHm)) });
      }
      l = l.a(str2, str1, paramInt, 6, paramString, true);
      d.btG().qIj.put(Integer.valueOf(d.btG().qIe.qDX.qFr.mjF), Long.valueOf(l));
    }
    label361:
    label444:
    label452:
    label457:
    while (d.btG().qIe.qDX.qFr.mjF != 0) {
      for (;;)
      {
        long l;
        buq();
        GMTrace.o(5250463301632L, 39119);
        return;
        d.btG().jdMethod_do(R.k.cOi, 1);
        break;
        if (paramInt == 233)
        {
          paramString = paramString.getString(R.l.ehv);
          break label167;
        }
        if (paramInt == 237)
        {
          paramString = paramString.getString(R.l.ehD);
          break label167;
        }
        if (paramInt == 236)
        {
          paramString = paramString.getString(R.l.ehv);
          break label167;
        }
        if (paramInt == 211)
        {
          paramString = paramString.getString(R.l.ehC);
          break label167;
        }
        paramString = paramString.getString(R.l.ehu);
        break label167;
        str1 = au.vBl;
        continue;
        paramInt = 0;
      }
    }
    String str2 = this.qHf.field_username;
    if (this.qHh)
    {
      str1 = au.vBm;
      label496:
      if (!this.qHg) {
        break label569;
      }
    }
    label569:
    for (paramInt = 1;; paramInt = 0)
    {
      if (com.tencent.mm.plugin.voip.b.b.wB(this.qGX.mState)) {
        paramString = ab.getContext().getString(R.l.ehy, new Object[] { ax(bg.aG(this.qHm)) });
      }
      l.a(str2, str1, paramInt, 6, paramString, true);
      break;
      str1 = au.vBl;
      break label496;
    }
  }
  
  public final void onReject()
  {
    GMTrace.i(5250731737088L, 39121);
    w.i("MicroMsg.Voip.VoipMgr", "onReject");
    iQ(4099);
    String str2 = this.qHf.field_username;
    String str1;
    if (this.qHh)
    {
      str1 = au.vBm;
      if (!this.qHg) {
        break label92;
      }
    }
    label92:
    for (int i = 1;; i = 0)
    {
      l.a(str2, str1, i, 6, ab.getContext().getString(R.l.ehF));
      buq();
      GMTrace.o(5250731737088L, 39121);
      return;
      str1 = au.vBl;
      break;
    }
  }
  
  public final void wl(int paramInt)
  {
    GMTrace.i(5247644729344L, 39098);
    this.qHl = paramInt;
    if (this.qGZ != null) {
      this.qGZ.wu(this.qHl);
    }
    GMTrace.o(5247644729344L, 39098);
  }
  
  public final void wo(int paramInt)
  {
    GMTrace.i(5251671261184L, 39128);
    w.i("MicroMsg.Voip.VoipMgr", "remote voip mode changed, cmd:%d", new Object[] { Integer.valueOf(paramInt) });
    if ((1 == paramInt) || (3 == paramInt) || (5 == paramInt) || (6 == paramInt) || (7 == paramInt))
    {
      iQ(4101);
      d.btG().buN();
      d.btG().buO();
    }
    GMTrace.o(5251671261184L, 39128);
  }
  
  public final void wp(int paramInt)
  {
    boolean bool2 = false;
    GMTrace.i(5252073914368L, 39131);
    w.i("MicroMsg.Voip.VoipMgr", "onSessionBeingCalled, callType: " + paramInt);
    if (!this.qGX.wE(4110))
    {
      GMTrace.o(5252073914368L, 39131);
      return;
    }
    m localm = d.btG();
    if (paramInt == 1) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      if (paramInt == 1) {
        bool2 = true;
      }
      localm.w(bool1, bool2);
      d.btG().stopRing();
      if ((paramInt == 1) && (com.tencent.mm.plugin.voip.b.b.wC(this.qGX.mState))) {
        iQ(4101);
      }
      iQ(4110);
      GMTrace.o(5252073914368L, 39131);
      return;
    }
  }
  
  final class a
    implements Runnable
  {
    a()
    {
      GMTrace.i(5299184336896L, 39482);
      GMTrace.o(5299184336896L, 39482);
    }
    
    public final void run()
    {
      GMTrace.i(5299318554624L, 39483);
      j.this.buw();
      j.this.qHc = null;
      GMTrace.o(5299318554624L, 39483);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */