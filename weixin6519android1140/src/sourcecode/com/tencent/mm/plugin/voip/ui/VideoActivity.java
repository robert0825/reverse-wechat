package com.tencent.mm.plugin.voip.ui;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.ic;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver;
import com.tencent.mm.plugin.voip.model.j.11;
import com.tencent.mm.plugin.voip.model.n;
import com.tencent.mm.plugin.voip.video.CaptureView;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.SensorController.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ad;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.ac;
import com.tencent.mm.y.aj;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
@SuppressLint({"SimpleDateFormat"})
public class VideoActivity
  extends MMActivity
  implements b, d.d, SensorController.a
{
  private String fKP;
  private ae iAX;
  private boolean kYY;
  private boolean mIsMute;
  private int mStatus;
  private CaptureView qHb;
  private x qHf;
  private boolean qHg;
  private boolean qHh;
  private int qHl;
  private d qKY;
  private WeakReference<c> qKZ;
  private SensorController qLa;
  private long qLb;
  private long qLc;
  private boolean qLd;
  private int qLe;
  private boolean qLf;
  private boolean qLg;
  private TelephonyManager qLh;
  private long qLi;
  
  public VideoActivity()
  {
    GMTrace.i(5366695854080L, 39985);
    this.qLb = -1L;
    this.kYY = false;
    this.qLc = 0L;
    this.qLd = false;
    this.qHl = 1;
    this.mIsMute = false;
    this.qLe = 1;
    this.qLf = false;
    this.qLg = false;
    this.qLh = null;
    GMTrace.o(5366695854080L, 39985);
  }
  
  private int aII()
  {
    GMTrace.i(5369245990912L, 40004);
    int j;
    if (!com.tencent.mm.plugin.voip.b.b.wB(this.mStatus)) {
      if (at.AS().sh())
      {
        j = 0;
        i = j;
        if (!this.qHh)
        {
          i = j;
          if (this.qHg) {
            if (com.tencent.mm.compatible.d.p.fQD.fNU < 0) {
              break label135;
            }
          }
        }
      }
    }
    label135:
    for (int i = com.tencent.mm.compatible.d.p.fQD.fNU;; i = 0)
    {
      j = i;
      if (!at.AS().sh())
      {
        j = i;
        if (com.tencent.mm.compatible.d.p.fQD.fNW < 0) {}
      }
      for (j = com.tencent.mm.compatible.d.p.fQD.fNW;; j = com.tencent.mm.plugin.voip.model.d.btG().btE())
      {
        w.d("MicroMsg.Voip.VideoActivity", "Current StreamType:%d", new Object[] { Integer.valueOf(j) });
        GMTrace.o(5369245990912L, 40004);
        return j;
        j = 2;
        break;
      }
    }
  }
  
  private static boolean aRC()
  {
    GMTrace.i(5366964289536L, 39987);
    for (;;)
    {
      try
      {
        TelephonyManager localTelephonyManager = (TelephonyManager)ab.getContext().getSystemService("phone");
        if (localTelephonyManager == null) {
          continue;
        }
        i = localTelephonyManager.getCallState();
        switch (i)
        {
        default: 
          bool = false;
        }
      }
      catch (Exception localException1)
      {
        int i;
        boolean bool = false;
        w.e("MicroMsg.Voip.VideoActivity", "get callState error , errMsg is %s", new Object[] { localException1.getLocalizedMessage() });
        continue;
        bool = false;
        continue;
      }
      try
      {
        w.i("MicroMsg.Voip.VideoActivity", "TelephoneManager.callState is %d", new Object[] { Integer.valueOf(i) });
        GMTrace.o(5366964289536L, 39987);
        return bool;
      }
      catch (Exception localException2)
      {
        continue;
      }
      bool = false;
      continue;
      bool = true;
    }
  }
  
  private void buq()
  {
    GMTrace.i(5367232724992L, 39989);
    this.iAX.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5365890547712L, 39979);
        VideoActivity.this.finish();
        GMTrace.o(5365890547712L, 39979);
      }
    }, 2000L);
    GMTrace.o(5367232724992L, 39989);
  }
  
  public final void JP(final String paramString)
  {
    GMTrace.i(14696170127360L, 109495);
    if (this.qKY != null) {
      this.iAX.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5358105919488L, 39921);
          if (VideoActivity.c(VideoActivity.this) != null) {
            VideoActivity.c(VideoActivity.this).JP(paramString);
          }
          GMTrace.o(5358105919488L, 39921);
        }
      });
    }
    GMTrace.o(14696170127360L, 109495);
  }
  
  protected final int Qf()
  {
    GMTrace.i(5367098507264L, 39988);
    GMTrace.o(5367098507264L, 39988);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    GMTrace.i(5369648644096L, 40007);
    if (this.qKY != null) {
      this.qKY.a(paramInt1, paramInt2, paramArrayOfInt);
    }
    GMTrace.o(5369648644096L, 40007);
  }
  
  public final void a(CaptureView paramCaptureView)
  {
    GMTrace.i(5370722385920L, 40015);
    this.qHb = paramCaptureView;
    if (this.qKY != null) {
      this.qKY.b(paramCaptureView);
    }
    GMTrace.o(5370722385920L, 40015);
  }
  
  public final void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    GMTrace.i(5368574902272L, 39999);
    if (this.qKY != null) {
      this.qKY.a(paramArrayOfByte, paramLong, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    }
    GMTrace.o(5368574902272L, 39999);
  }
  
  public final void aJA()
  {
    GMTrace.i(5370453950464L, 40013);
    w.d("MicroMsg.Voip.VideoActivity", "dismissNetStatusWarning");
    if (this.qKY != null) {
      this.qKY.bvx();
    }
    GMTrace.o(5370453950464L, 40013);
  }
  
  public final void ax(final int paramInt, String paramString)
  {
    GMTrace.i(5368709120000L, 40000);
    w.i("MicroMsg.Voip.VideoActivity", "onError, errCode:%d, isVideoCall:%s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.qHh) });
    this.kYY = true;
    if (paramInt == 241)
    {
      h.b(this, paramString, null, true);
      GMTrace.o(5368709120000L, 40000);
      return;
    }
    this.iAX.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5364414152704L, 39968);
        VideoActivity.a(VideoActivity.this, paramInt);
        GMTrace.o(5364414152704L, 39968);
      }
    });
    GMTrace.o(5368709120000L, 40000);
  }
  
  protected final void bH(View paramView)
  {
    GMTrace.i(5369111773184L, 40003);
    ad.d(ad.a(getWindow(), null), this.vKB.vKI);
    ((ViewGroup)getWindow().getDecorView()).addView(paramView, 0);
    GMTrace.o(5369111773184L, 40003);
  }
  
  public final void buu()
  {
    GMTrace.i(5369782861824L, 40008);
    if (this.qKY != null) {
      this.qKY.buu();
    }
    GMTrace.o(5369782861824L, 40008);
  }
  
  public final Context bvu()
  {
    GMTrace.i(5369917079552L, 40009);
    ActionBarActivity localActionBarActivity = this.vKB.vKW;
    GMTrace.o(5369917079552L, 40009);
    return localActionBarActivity;
  }
  
  public final void bvv()
  {
    GMTrace.i(5370319732736L, 40012);
    w.d("MicroMsg.Voip.VideoActivity", "tryShowNetStatusWarning");
    if (this.qKY != null) {
      this.qKY.bvw();
    }
    GMTrace.o(5370319732736L, 40012);
  }
  
  public final void jdMethod_do(boolean paramBoolean)
  {
    GMTrace.i(5368977555456L, 40002);
    if (bg.Pw() - this.qLc < 500L)
    {
      w.d("MicroMsg.Voip.VideoActivity", "onSensorEvent time interval too small");
      GMTrace.o(5368977555456L, 40002);
      return;
    }
    if (((this.qHg) || (com.tencent.mm.plugin.voip.b.b.wB(this.mStatus))) && (!com.tencent.mm.plugin.voip.b.b.wC(this.mStatus)))
    {
      w.d("MicroMsg.Voip.VideoActivity", "onSensorEvent, isOn: " + paramBoolean);
      dp(paramBoolean);
    }
    GMTrace.o(5368977555456L, 40002);
  }
  
  public final void dq(int paramInt1, int paramInt2)
  {
    GMTrace.i(5367366942720L, 39990);
    this.mStatus = paramInt2;
    if ((1 != this.qLe) && (paramInt2 != 8) && (paramInt2 != 262))
    {
      w.i("MicroMsg.Voip.VideoActivity", "activity is not normal, can't transform");
      GMTrace.o(5367366942720L, 39990);
      return;
    }
    if (this.qKY == null)
    {
      w.i("MicroMsg.Voip.VideoActivity", "mBaseFragment is null ,already close,now return.");
      GMTrace.o(5367366942720L, 39990);
      return;
    }
    this.qKY.dq(paramInt1, paramInt2);
    switch (paramInt2)
    {
    default: 
      GMTrace.o(5367366942720L, 39990);
      return;
    case 1: 
    case 3: 
    case 7: 
    case 257: 
    case 261: 
      if ((this.qKY == null) || (!(this.qKY instanceof f)))
      {
        if (this.qKY != null)
        {
          this.qKY.uninit();
          aR().aV().a(this.qKY).commit();
          this.qKY = null;
        }
        w.i("MicroMsg.Voip.VideoActivity", "switch to voice fragment");
        Bundle localBundle = new Bundle();
        localBundle.putString("key_username", this.qHf.field_username);
        localBundle.putBoolean("key_isoutcall", this.qHg);
        localBundle.putInt("key_status", this.mStatus);
        this.qKY = new f();
        this.qKY.setArguments(localBundle);
        this.qKY.a((c)this.qKZ.get());
        this.qKY.eh(this.qLb);
        this.qKY.a(this);
        this.qKY.wu(this.qHl);
        this.qKY.setMute(this.mIsMute);
        this.qKY.b(this.qHb);
        aR().aV().b(R.h.cml, this.qKY).commit();
      }
      GMTrace.o(5367366942720L, 39990);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      buq();
      break;
      if (this.qHg) {
        this.qKY.ca(getString(R.l.ehz), -1);
      }
      buq();
      continue;
      this.iAX.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5333946728448L, 39741);
          if (VideoActivity.c(VideoActivity.this) != null) {
            VideoActivity.c(VideoActivity.this).ca(VideoActivity.this.getString(R.l.eiX), -1);
          }
          VideoActivity.d(VideoActivity.this);
          GMTrace.o(5333946728448L, 39741);
        }
      });
      continue;
      this.iAX.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14695767474176L, 109492);
          VideoActivity.d(VideoActivity.this);
          GMTrace.o(14695767474176L, 109492);
        }
      });
      continue;
      this.iAX.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5326967406592L, 39689);
          VideoActivity.d(VideoActivity.this);
          GMTrace.o(5326967406592L, 39689);
        }
      }, 50L);
      continue;
      buq();
      continue;
      finish();
    }
  }
  
  public final void eg(long paramLong)
  {
    GMTrace.i(5370185515008L, 40011);
    this.qLb = paramLong;
    if (this.qKY != null) {
      this.qKY.eh(this.qLb);
    }
    GMTrace.o(5370185515008L, 40011);
  }
  
  public void finish()
  {
    GMTrace.i(5368038031360L, 39995);
    this.qLe = 3;
    w.i("MicroMsg.Voip.VideoActivity", "finish, finishBczMinimize: %b, status: %s", new Object[] { Boolean.valueOf(this.qLd), com.tencent.mm.plugin.voip.b.b.wy(this.mStatus) });
    Object localObject;
    if ((!this.qLd) && (com.tencent.mm.plugin.voip.b.b.wB(this.mStatus)) && (4 != this.qLe))
    {
      w.i("MicroMsg.Voip.VideoActivity", "finish VideoActivity, start ChattingUI");
      localObject = new Intent();
      ((Intent)localObject).addFlags(67108864);
      ((Intent)localObject).putExtra("Chat_User", this.fKP);
      com.tencent.mm.plugin.voip.a.a.hnH.e((Intent)localObject, this);
    }
    if (this.qLa != null)
    {
      w.d("MicroMsg.Voip.VideoActivity", "removeSensorCallBack");
      dp(true);
      this.qLa.bQD();
      this.qLa = null;
    }
    int i;
    if (this.qKY != null) {
      if (this.qKY.qLp == 4105)
      {
        i = 1;
        this.qKY.uninit();
        this.qKY = null;
      }
    }
    for (;;)
    {
      this.qKZ = null;
      this.qHb = null;
      this.qLg = true;
      super.finish();
      if (i != 0)
      {
        localObject = new ic();
        ((ic)localObject).eLB.eLE = true;
        ((ic)localObject).eLB.eLD = this.qLi;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
        GMTrace.o(5368038031360L, 39995);
        return;
      }
      localObject = new ic();
      ((ic)localObject).eLB.eLE = false;
      ((ic)localObject).eLB.eLD = 0L;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      GMTrace.o(5368038031360L, 39995);
      return;
      i = 0;
      break;
      i = 0;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5368843337728L, 40001);
    int i = R.i.cHF;
    GMTrace.o(5368843337728L, 40001);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5366830071808L, 39986);
    super.onCreate(paramBundle);
    if (!com.tencent.mm.plugin.voip.b.d.dk(this.vKB.vKW)) {
      com.tencent.mm.plugin.voip.b.d.dl(this.vKB.vKW);
    }
    w.i("MicroMsg.Voip.VideoActivity", "VideoActivity onCreate start");
    cN().cO().hide();
    getWindow().setSoftInputMode(3);
    getWindow().addFlags(6815872);
    if (at.AU()) {
      com.tencent.mm.plugin.voip.model.d.btG().v(false, false);
    }
    this.iAX = new ae();
    PBool localPBool1 = new PBool();
    PBool localPBool2 = new PBool();
    PString localPString = new PString();
    PInt localPInt = new PInt();
    localPString.value = getIntent().getStringExtra("Voip_User");
    localPBool1.value = getIntent().getBooleanExtra("Voip_Outcall", true);
    localPBool2.value = getIntent().getBooleanExtra("Voip_VideoCall", true);
    this.qLi = getIntent().getLongExtra("Voip_LastPage_Hash", 0L);
    localPInt.value = com.tencent.mm.plugin.voip.b.b.y(localPBool1.value, localPBool2.value);
    if (localPBool1.value) {
      try
      {
        if (aRC())
        {
          Toast.makeText(this, R.l.dDa, 0).show();
          w.i("MicroMsg.Voip.VideoActivity", "this phone is on a call");
          super.finish();
          GMTrace.o(5366830071808L, 39986);
          return;
        }
      }
      catch (Exception paramBundle)
      {
        w.e("MicroMsg.Voip.VideoActivity", "not ready now!");
      }
    }
    com.tencent.mm.plugin.voip.model.m localm = com.tencent.mm.plugin.voip.model.d.btG();
    if (localm.qIf != null)
    {
      w.i("MicroMsg.Voip.VoipService", "voipMgr is not null");
      localPString.value = localm.qIf.fKP;
      localPBool1.value = localm.qIf.qHg;
      localPBool2.value = localm.qIf.qHh;
      localPInt.value = localm.qIf.qGX.mState;
      paramBundle = localm.qIf;
    }
    while (paramBundle == null)
    {
      w.e("MicroMsg.Voip.VideoActivity", "unable to init VoipMgr");
      super.finish();
      GMTrace.o(5366830071808L, 39986);
      return;
      if (localPString.value == null)
      {
        w.e("MicroMsg.Voip.VoipService", "username is null, can't start voip");
        paramBundle = null;
      }
      else
      {
        if ((!localPBool1.value) && (!localm.qIe.btN()))
        {
          w.e("MicroMsg.Voip.VoipService", "is out call, but kenerl is not working");
          localObject1 = localPString.value;
          if (localPBool2.value)
          {
            paramBundle = au.vBm;
            label449:
            if (!localPBool1.value) {
              break label489;
            }
          }
          label489:
          for (i = 1;; i = 0)
          {
            com.tencent.mm.plugin.voip.model.l.a((String)localObject1, paramBundle, i, 4, ab.getContext().getString(R.l.ehs));
            paramBundle = null;
            break;
            paramBundle = au.vBl;
            break label449;
          }
        }
        localm.qIf = new com.tencent.mm.plugin.voip.model.j();
        com.tencent.mm.plugin.voip.model.j localj = localm.qIf;
        paramBundle = localPString.value;
        boolean bool2 = localPBool1.value;
        boolean bool3 = localPBool2.value;
        w.i("MicroMsg.Voip.VoipMgr", "start VoIP, userName: %s, isOutCall: %b, isVideoCall: %b", new Object[] { paramBundle, Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
        localj.qHz = true;
        localj.fKP = paramBundle;
        localj.qHg = bool2;
        localj.qHh = bool3;
        at.AR();
        localj.qHf = com.tencent.mm.y.c.yK().TE(localj.fKP);
        localj.iAX = new ae();
        boolean bool1;
        label645:
        int j;
        if (bg.getInt(com.tencent.mm.k.g.ut().getValue("VOIPCameraSwitch"), 1) == 0)
        {
          bool1 = true;
          localj.qHi = bool1;
          if (!localj.qHh) {
            localj.qHi = false;
          }
          j = com.tencent.mm.plugin.voip.b.b.y(bool2, bool3);
          i = j;
          if (localj.qHi)
          {
            if (j != 0) {
              break label1036;
            }
            i = 1;
          }
          label690:
          if (!bool2) {
            break label1052;
          }
          localj.qGX = com.tencent.mm.plugin.voip.b.b.wA(i);
          label704:
          bool1 = com.tencent.mm.compatible.e.b.tt();
          bool2 = com.tencent.mm.compatible.e.b.tu();
          if (Build.MANUFACTURER.equalsIgnoreCase("meizu"))
          {
            if (!bool1)
            {
              paramBundle = com.tencent.mm.plugin.report.service.g.ork;
              if (!localj.qHh) {
                break label1064;
              }
              i = 0;
              label745:
              paramBundle.i(11306, new Object[] { Integer.valueOf(i), Integer.valueOf(1) });
            }
            if (!bool2)
            {
              paramBundle = com.tencent.mm.plugin.report.service.g.ork;
              if (!localj.qHh) {
                break label1069;
              }
              i = 0;
              label789:
              paramBundle.i(11306, new Object[] { Integer.valueOf(i), Integer.valueOf(0) });
            }
          }
          if ((!bool2) || (!bool1))
          {
            paramBundle = null;
            localObject1 = null;
            if ((bool1) || (bool2)) {
              break label1074;
            }
            paramBundle = getString(R.l.cUC);
            localObject1 = getString(R.l.cTC);
            label856:
            h.a(this, paramBundle, (String)localObject1, getString(R.l.cTF), true, new j.11(localj, this));
          }
          w.i("MicroMsg.Voip.VoipMgr", "initMgr");
          at.pD().ri();
          at.AS().b(localj);
          at.AS().a(localj);
          at.AS().sf();
          localj.eyB = new com.tencent.mm.compatible.util.b(ab.getContext());
          localj.eyB.requestFocus();
          if (!localj.qHh) {
            break label1124;
          }
          com.tencent.mm.plugin.voip.model.d.btG().a(true, true, localj.fKP);
          label967:
          if (!localj.qHg) {
            break label1168;
          }
          com.tencent.mm.plugin.voip.model.d.btG().qIe.buW();
          if (!localj.qHh) {
            break label1140;
          }
          paramBundle = com.tencent.mm.plugin.voip.model.d.btG();
          localObject1 = localj.qHf.field_username;
        }
        for (int i = paramBundle.qIe.bZ((String)localObject1, 0);; i = paramBundle.qIe.bZ((String)localObject1, 1))
        {
          if (i >= 0) {
            break label1168;
          }
          localj.eV(false);
          break;
          bool1 = false;
          break label645;
          label1036:
          i = j;
          if (256 != j) {
            break label690;
          }
          i = 257;
          break label690;
          label1052:
          localj.qGX = com.tencent.mm.plugin.voip.b.b.wz(i);
          break label704;
          label1064:
          i = 1;
          break label745;
          label1069:
          i = 1;
          break label789;
          label1074:
          if (!bool1)
          {
            paramBundle = getString(R.l.cUE);
            localObject1 = getString(R.l.cTD);
            break label856;
          }
          if (bool2) {
            break label856;
          }
          paramBundle = getString(R.l.cUD);
          localObject1 = getString(R.l.cTE);
          break label856;
          label1124:
          com.tencent.mm.plugin.voip.model.d.btG().a(true, false, localj.fKP);
          break label967;
          label1140:
          paramBundle = com.tencent.mm.plugin.voip.model.d.btG();
          localObject1 = localj.qHf.field_username;
        }
        label1168:
        localj.qGY = new HeadsetPlugReceiver();
        localj.qGY.a(ab.getContext(), localj.qHF);
        Object localObject1 = com.tencent.mm.plugin.voip.model.d.btG();
        paramBundle = ab.getContext();
        localObject1 = ((com.tencent.mm.plugin.voip.model.m)localObject1).qIe;
        ((n)localObject1).qDX.iPn = paramBundle;
        ((n)localObject1).qDX.qFs = localj;
        com.tencent.mm.plugin.voip.b.a.dW("MicroMsg.Voip.VoipServiceEx", "attach ui........");
        localj.mij = ((TelephonyManager)ab.getContext().getSystemService("phone"));
        localj.mij.listen(localj.mik, 32);
        label1282:
        label1308:
        label1328:
        Object localObject2;
        if (localj.qHh)
        {
          i = 0;
          com.tencent.mm.plugin.voip.model.d.btG().k(R.k.cOh, i, localj.qHg);
          if (!at.AS().sn()) {
            break label1581;
          }
          i = 3;
          localj.qHl = i;
          if (!localj.qHh) {
            break label1613;
          }
          localj.qHo = true;
          paramBundle = "voip_recent_contact" + q.zE();
          localObject1 = ab.getContext().getSharedPreferences("voip_plugin_prefs", 0);
          localObject2 = ((SharedPreferences)localObject1).getString(paramBundle, null);
          if (localObject2 == null) {
            break label1641;
          }
          localObject2 = bg.g(((String)localObject2).split(";"));
          if (localObject2 == null) {
            break label1641;
          }
          i = ((List)localObject2).size();
          if (!((List)localObject2).contains(localj.fKP)) {
            break label1622;
          }
          if (i > 1)
          {
            ((List)localObject2).remove(localj.fKP);
            label1435:
            ((List)localObject2).add(0, localj.fKP);
          }
          localObject2 = bg.c((List)localObject2, ";");
          ((SharedPreferences)localObject1).edit().putString(paramBundle, (String)localObject2).commit();
        }
        for (;;)
        {
          com.tencent.mm.sdk.b.a.vgX.b(localj.qHG);
          com.tencent.mm.sdk.b.a.vgX.b(localj.mil);
          paramBundle = localj.qHs;
          if (!paramBundle.jlo.contains(localj)) {
            paramBundle.jlo.add(localj);
          }
          paramBundle = new IntentFilter();
          paramBundle.addAction("android.intent.action.SCREEN_ON");
          paramBundle.addAction("android.intent.action.SCREEN_OFF");
          paramBundle.addAction("android.intent.action.USER_PRESENT");
          ab.getContext().registerReceiver(localj.qHE, paramBundle);
          break;
          i = 1;
          break label1282;
          label1581:
          if (at.AS().sh())
          {
            i = 4;
            break label1308;
          }
          if (localj.qHh)
          {
            i = 1;
            break label1308;
          }
          i = 2;
          break label1308;
          label1613:
          localj.qHo = false;
          break label1328;
          label1622:
          if (4 != i) {
            break label1435;
          }
          ((List)localObject2).remove(i - 1);
          break label1435;
          label1641:
          localObject2 = new ArrayList();
          ((List)localObject2).add(0, localj.fKP);
          localObject2 = bg.c((List)localObject2, ";");
          ((SharedPreferences)localObject1).edit().putString(paramBundle, (String)localObject2).commit();
        }
      }
    }
    this.qKZ = new WeakReference(paramBundle);
    this.fKP = localPString.value;
    this.qHh = localPBool2.value;
    this.qHg = localPBool1.value;
    this.mStatus = localPInt.value;
    at.AR();
    this.qHf = com.tencent.mm.y.c.yK().TE(this.fKP);
    paramBundle = new Bundle();
    paramBundle.putString("key_username", this.qHf.field_username);
    paramBundle.putBoolean("key_isoutcall", this.qHg);
    paramBundle.putInt("key_status", com.tencent.mm.plugin.voip.b.b.y(this.qHg, this.qHh));
    if (com.tencent.mm.plugin.voip.b.b.wC(this.mStatus)) {}
    for (this.qKY = new e();; this.qKY = new f())
    {
      this.qKY.setArguments(paramBundle);
      aR().aV().b(R.h.cml, this.qKY).commit();
      AU(8);
      if ((com.tencent.mm.plugin.voip.b.b.wD(this.mStatus)) && (this.qHg)) {
        this.iAX.postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(5331665027072L, 39724);
            if ((com.tencent.mm.plugin.voip.b.b.wD(VideoActivity.a(VideoActivity.this))) && (!VideoActivity.b(VideoActivity.this)) && (VideoActivity.c(VideoActivity.this) != null)) {
              VideoActivity.c(VideoActivity.this).ca(VideoActivity.this.getString(R.l.ehG), 10000);
            }
            GMTrace.o(5331665027072L, 39724);
          }
        }, 20000L);
      }
      this.qKY.a((c)this.qKZ.get());
      this.qKY.a(this);
      this.qKY.wu(this.qHl);
      this.qKY.setMute(this.mIsMute);
      if (com.tencent.mm.plugin.voip.model.d.btG().qIf.qHD != null) {
        JP(com.tencent.mm.plugin.voip.model.d.btG().qIf.qHD);
      }
      this.qLa = new SensorController(this.vKB.vKW);
      if ((this.qKZ != null) && (this.qKZ.get() != null)) {
        ((c)this.qKZ.get()).a(this, 1);
      }
      w.i("MicroMsg.Voip.VideoActivity", "VideoActivity onCreate end isOutCall:%b isVideoCall:%b username:%s state:%d", new Object[] { Boolean.valueOf(this.qHg), Boolean.valueOf(this.qHh), this.fKP, Integer.valueOf(this.mStatus) });
      if (this.qLa != null)
      {
        w.d("MicroMsg.Voip.VideoActivity", "onCreate setSensorCallBack");
        this.qLa.a(this);
      }
      if (!com.tencent.mm.plugin.voip.b.b.wC(this.mStatus)) {
        break;
      }
      w.i("MicroMsg.Voip.VideoActivity", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.CAMERA", 19, "", "")), bg.bQW(), this });
      w.i("MicroMsg.Voip.VideoActivity", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.RECORD_AUDIO", 19, "", "")), bg.bQW(), this });
      GMTrace.o(5366830071808L, 39986);
      return;
    }
    w.i("MicroMsg.Voip.VideoActivity", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.RECORD_AUDIO", 82, "", "")), bg.bQW(), this });
    GMTrace.o(5366830071808L, 39986);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5367635378176L, 39992);
    this.qLe = 4;
    w.i("MicroMsg.Voip.VideoActivity", "onDestroy, status: %s", new Object[] { com.tencent.mm.plugin.voip.b.b.wy(this.mStatus) });
    if (!this.qLg) {
      finish();
    }
    if ((this.qLa != null) && (this.qLa.vkU))
    {
      w.d("MicroMsg.Voip.VideoActivity", "onDestroy removeSensorCallBack");
      dp(true);
      this.qLa.bQD();
    }
    if ((this.qKZ != null) && (this.qKZ.get() != null)) {
      ((c)this.qKZ.get()).a(this);
    }
    this.qLa = null;
    super.onDestroy();
    GMTrace.o(5367635378176L, 39992);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(5367501160448L, 39991);
    if (paramKeyEvent.getKeyCode() == 4)
    {
      GMTrace.o(5367501160448L, 39991);
      return true;
    }
    if (paramInt == 25)
    {
      if ((!com.tencent.mm.plugin.voip.model.d.btG().buQ()) && (!this.qHg))
      {
        com.tencent.mm.plugin.voip.model.d.btG().stopRing();
        GMTrace.o(5367501160448L, 39991);
        return true;
      }
      if (at.AS().sh()) {}
      for (paramInt = at.AS().st();; paramInt = aII())
      {
        at.AS().ei(paramInt);
        break;
      }
    }
    if (paramInt == 24)
    {
      if ((!com.tencent.mm.plugin.voip.model.d.btG().buQ()) && (!this.qHg))
      {
        com.tencent.mm.plugin.voip.model.d.btG().stopRing();
        GMTrace.o(5367501160448L, 39991);
        return true;
      }
      if (at.AS().sh()) {}
      for (paramInt = at.AS().st();; paramInt = aII())
      {
        at.AS().eh(paramInt);
        break;
      }
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(5367501160448L, 39991);
    return bool;
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(5368172249088L, 39996);
    w.i("MicroMsg.Voip.VideoActivity", "onNewIntent");
    super.onNewIntent(paramIntent);
    GMTrace.o(5368172249088L, 39996);
  }
  
  public void onPause()
  {
    GMTrace.i(5368306466816L, 39997);
    super.onPause();
    KeyguardManager localKeyguardManager = (KeyguardManager)ab.getContext().getSystemService("keyguard");
    PowerManager localPowerManager = (PowerManager)ab.getContext().getSystemService("power");
    boolean bool2 = localKeyguardManager.inKeyguardRestrictedInputMode();
    boolean bool3 = hasWindowFocus();
    boolean bool4 = localPowerManager.isScreenOn();
    if (((bool3) || (!bool2)) && (bool4)) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      this.qLf = bool1;
      w.i("MicroMsg.Voip.VideoActivity", "onPause, status: %s, screenOn: %b, hasWindowFocus: %s, isScreenLocked: %s, isScreenOn: %s", new Object[] { com.tencent.mm.plugin.voip.b.b.wy(this.mStatus), Boolean.valueOf(this.qLf), Boolean.valueOf(bool3), Boolean.valueOf(bool2), Boolean.valueOf(bool4) });
      GMTrace.o(5368306466816L, 39997);
      return;
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(5370856603648L, 40016);
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0) || (paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
    {
      w.e("MicroMsg.Voip.VideoActivity", "onRequestPermissionsResult %d data is invalid", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(5370856603648L, 40016);
      return;
    }
    w.i("MicroMsg.Voip.VideoActivity", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(5370856603648L, 40016);
      return;
      if (paramArrayOfInt[0] != 0)
      {
        if ("android.permission.CAMERA".equals(paramArrayOfString[0])) {}
        for (paramInt = R.l.dNn;; paramInt = R.l.dNr)
        {
          h.a(this, getString(paramInt), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(5364951023616L, 39972);
              paramAnonymousDialogInterface.dismiss();
              VideoActivity.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
              GMTrace.o(5364951023616L, 39972);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(5360656056320L, 39940);
              paramAnonymousDialogInterface.dismiss();
              GMTrace.o(5360656056320L, 39940);
            }
          });
          GMTrace.o(5370856603648L, 40016);
          return;
        }
        if (paramArrayOfInt[0] != 0) {
          h.a(this, getString(R.l.dNr), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(14696035909632L, 109494);
              VideoActivity.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
              GMTrace.o(14696035909632L, 109494);
            }
          }, null);
        }
      }
    }
  }
  
  public void onResume()
  {
    int i = 0;
    GMTrace.i(5368440684544L, 39998);
    w.i("MicroMsg.Voip.VideoActivity", "onResume, status: %s", new Object[] { com.tencent.mm.plugin.voip.b.b.wy(this.mStatus) });
    at.getNotification().cancel(40);
    com.tencent.mm.plugin.voip.model.e locale = com.tencent.mm.plugin.voip.model.d.btG().qIe.qDX;
    if (locale.qFd) {
      locale.qFd = false;
    }
    super.onResume();
    dp(true);
    this.qLc = bg.Pw();
    if ((this.qHg) && (com.tencent.mm.plugin.voip.b.b.wD(this.mStatus)) && (com.tencent.mm.plugin.voip.model.d.btG().buQ())) {
      if (!this.qHh) {
        break label138;
      }
    }
    for (;;)
    {
      com.tencent.mm.plugin.voip.model.d.btG().k(R.k.cOh, i, this.qHg);
      GMTrace.o(5368440684544L, 39998);
      return;
      label138:
      i = 1;
    }
  }
  
  public void onStart()
  {
    GMTrace.i(5367903813632L, 39994);
    super.onStart();
    if (!this.qLg)
    {
      w.i("MicroMsg.Voip.VideoActivity", "onStart");
      this.qLe = 1;
      dq(4096, this.mStatus);
    }
    GMTrace.o(5367903813632L, 39994);
  }
  
  protected void onStop()
  {
    GMTrace.i(5367769595904L, 39993);
    this.qLe = 2;
    w.i("MicroMsg.Voip.VideoActivity", "onStop, status: %s", new Object[] { com.tencent.mm.plugin.voip.b.b.wy(this.mStatus) });
    super.onStop();
    com.tencent.mm.plugin.report.service.g localg;
    if ((262 != this.mStatus) && (8 != this.mStatus) && (this.qLf) && (!this.qLg) && (this.qKZ != null) && (this.qKZ.get() != null) && (((c)this.qKZ.get()).ix(false)))
    {
      x(false, true);
      if (com.tencent.mm.plugin.voip.b.b.wB(this.mStatus))
      {
        localg = com.tencent.mm.plugin.report.service.g.ork;
        if (!com.tencent.mm.plugin.voip.b.b.wC(this.mStatus)) {
          break label176;
        }
      }
    }
    label176:
    for (int i = 2;; i = 3)
    {
      localg.i(11618, new Object[] { Integer.valueOf(i), Integer.valueOf(2) });
      GMTrace.o(5367769595904L, 39993);
      return;
    }
  }
  
  public final void setMute(boolean paramBoolean)
  {
    GMTrace.i(5369514426368L, 40006);
    this.mIsMute = paramBoolean;
    if (this.qKY != null) {
      this.qKY.setMute(paramBoolean);
    }
    GMTrace.o(5369514426368L, 40006);
  }
  
  public final void uninit()
  {
    GMTrace.i(5370051297280L, 40010);
    if (this.qKY != null) {
      this.qKY.uninit();
    }
    GMTrace.o(5370051297280L, 40010);
  }
  
  public final void wu(int paramInt)
  {
    GMTrace.i(5369380208640L, 40005);
    this.qHl = paramInt;
    if (this.qKY != null) {
      this.qKY.wu(paramInt);
    }
    GMTrace.o(5369380208640L, 40005);
  }
  
  public final void x(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(5370588168192L, 40014);
    this.qLd = paramBoolean2;
    if (paramBoolean1)
    {
      buq();
      GMTrace.o(5370588168192L, 40014);
      return;
    }
    finish();
    GMTrace.o(5370588168192L, 40014);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\ui\VideoActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */