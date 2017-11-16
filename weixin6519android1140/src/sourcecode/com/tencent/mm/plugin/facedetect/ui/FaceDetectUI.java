package com.tencent.mm.plugin.facedetect.ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.Process;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.facedetect.FaceProNative;
import com.tencent.mm.plugin.facedetect.a.d;
import com.tencent.mm.plugin.facedetect.a.e;
import com.tencent.mm.plugin.facedetect.a.g;
import com.tencent.mm.plugin.facedetect.a.h;
import com.tencent.mm.plugin.facedetect.d.b.b;
import com.tencent.mm.plugin.facedetect.d.b.c;
import com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult;
import com.tencent.mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.mm.plugin.facedetect.model.f;
import com.tencent.mm.plugin.facedetect.model.g;
import com.tencent.mm.plugin.facedetect.model.h;
import com.tencent.mm.plugin.facedetect.model.h.a;
import com.tencent.mm.plugin.facedetect.model.n;
import com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService;
import com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService.a;
import com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView;
import com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView.b;
import com.tencent.mm.plugin.facedetect.views.FaceDetectDecorView;
import com.tencent.mm.plugin.facedetect.views.FaceDetectView;
import com.tencent.mm.plugin.facedetect.views.FaceDetectView.4;
import com.tencent.mm.plugin.facedetect.views.FaceScanRect;
import com.tencent.mm.plugin.facedetect.views.FaceScanRect.a;
import com.tencent.mm.plugin.facedetect.views.FaceScanRect.b;
import com.tencent.mm.plugin.facedetect.views.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;

@com.tencent.mm.ui.base.a(3)
public class FaceDetectUI
  extends MMActivity
  implements com.tencent.mm.plugin.facedetect.c.e, com.tencent.mm.plugin.facedetect.views.a
{
  private String fKP;
  private int kRs;
  h kWB;
  private b kWC;
  private boolean kWD;
  private boolean kWE;
  private View kWF;
  private RelativeLayout kWG;
  FaceDetectView kWH;
  FaceScanRect kWI;
  private TextView kWJ;
  private Button kWK;
  private FaceDetectProcessService kWL;
  private ServiceConnection kWM;
  private boolean kWN;
  private boolean kWO;
  private c kWP;
  private com.tencent.mm.plugin.facedetect.c.a kWc;
  private a kWd;
  private b kWe;
  private boolean kWf;
  boolean kzq;
  private PowerManager.WakeLock wakeLock;
  
  public FaceDetectUI()
  {
    GMTrace.i(5885313155072L, 43849);
    this.wakeLock = null;
    this.fKP = null;
    this.kWf = false;
    this.kRs = -1;
    this.kWB = null;
    this.kWC = null;
    this.kWD = false;
    this.kzq = false;
    this.kWE = false;
    this.kWF = null;
    this.kWH = null;
    this.kWI = null;
    this.kWJ = null;
    this.kWK = null;
    this.kWd = null;
    this.kWe = null;
    this.kWc = null;
    this.kWL = null;
    this.kWM = null;
    this.kWN = false;
    this.kWO = false;
    this.kWP = null;
    GMTrace.o(5885313155072L, 43849);
  }
  
  private void atA()
  {
    GMTrace.i(5885581590528L, 43851);
    w.i("MicroMsg.FaceDetectUI", "alvinluo unbindService, mBound: %b", new Object[] { Boolean.valueOf(this.kWN) });
    if (this.kWN)
    {
      w.i("MicroMsg.FaceDetectUI", "alvinluo unbindService");
      unbindService(this.kWM);
      this.kWN = false;
    }
    GMTrace.o(5885581590528L, 43851);
  }
  
  private void awO()
  {
    GMTrace.i(15040841252864L, 112063);
    w.i("MicroMsg.FaceDetectUI", "alvinluo onUserCancel");
    Object localObject = this.kWH;
    if (((FaceDetectView)localObject).kYW != null) {}
    for (localObject = ((FaceDetectView)localObject).kYW.awD();; localObject = new b.b(90004, "user cancelled in processing"))
    {
      b(1, ((b.b)localObject).errCode, ((b.b)localObject).eAR, null);
      GMTrace.o(15040841252864L, 112063);
      return;
    }
  }
  
  private void awW()
  {
    GMTrace.i(5886655332352L, 43859);
    this.kzq = false;
    this.kWH.eq(false);
    w.i("MicroMsg.FaceDetectUI", "hy: stopped scan");
    this.kWD = false;
    this.kWH.kYR.kYx.stopPreview();
    w.i("MicroMsg.FaceDetectUI", "hy: stopped preview");
    GMTrace.o(5886655332352L, 43859);
  }
  
  private Bitmap awX()
  {
    GMTrace.i(5887729074176L, 43867);
    Bitmap localBitmap = this.kWH.kYR.getBitmap();
    GMTrace.o(5887729074176L, 43867);
    return localBitmap;
  }
  
  private void b(int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    GMTrace.i(5886923767808L, 43861);
    w.i("MicroMsg.FaceDetectUI", "onProcessingError errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(4), Integer.valueOf(paramInt2), paramString1 });
    Bundle localBundle = new Bundle();
    localBundle.putString("show_err_msg", paramString2);
    awW();
    b(4, paramInt2, paramString1, localBundle);
    GMTrace.o(5886923767808L, 43861);
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, a.b paramb)
  {
    GMTrace.i(5886789550080L, 43860);
    if (paramBoolean1) {
      awW();
    }
    if (paramBoolean2)
    {
      w.i("MicroMsg.FaceDetectUI", "hy: need blur");
      com.tencent.mm.sdk.f.e.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5910948741120L, 44040);
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(5911754047488L, 44046);
              FaceDetectUI.j(FaceDetectUI.this).w(this.kWS);
              GMTrace.o(5911754047488L, 44046);
            }
          });
          GMTrace.o(5910948741120L, 44040);
        }
      }, "FaceDetectUI_BlurBgMap");
    }
    this.kWd.a(paramb);
    GMTrace.o(5886789550080L, 43860);
  }
  
  public final void avU()
  {
    GMTrace.i(5886118461440L, 43855);
    w.i("MicroMsg.FaceDetectUI", "alvinluo startFaceDetect ");
    Object localObject1 = getWindow().getAttributes();
    if (((WindowManager.LayoutParams)localObject1).screenBrightness < 0.9F)
    {
      ((WindowManager.LayoutParams)localObject1).screenBrightness = 0.9F;
      getWindow().setAttributes((WindowManager.LayoutParams)localObject1);
    }
    this.kWI.lad = FaceScanRect.a.lag;
    localObject1 = this.kWI;
    if (((FaceScanRect)localObject1).lad == FaceScanRect.a.lae) {
      w.w("MicroMsg.FaceScanRect", "hy: already opened");
    }
    for (;;)
    {
      this.kWH.kYS.kYM = false;
      this.kWI.setVisibility(0);
      w.d("MicroMsg.FaceDetectUI", "alvinluo %d, %d, %d, %d", new Object[] { Integer.valueOf(this.kWI.getTop()), Integer.valueOf(this.kWI.getRight()), Integer.valueOf(this.kWI.getLeft()), Integer.valueOf(this.kWI.getBottom()) });
      this.kWD = true;
      this.kzq = false;
      this.kWC.reset();
      if (this.kWD)
      {
        this.kWP = new c()
        {
          public final void ny(int paramAnonymousInt)
          {
            GMTrace.i(5895647920128L, 43926);
            w.i("MicroMsg.FaceDetectUI", "alvinluo onPreviewInitDone: %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
            if (paramAnonymousInt == 0)
            {
              FaceDetectUI.f(FaceDetectUI.this);
              GMTrace.o(5895647920128L, 43926);
              return;
            }
            if (paramAnonymousInt == 1)
            {
              FaceDetectUI.g(FaceDetectUI.this);
              GMTrace.o(5895647920128L, 43926);
              return;
            }
            if (paramAnonymousInt == 2) {
              FaceDetectUI.a(FaceDetectUI.this, "camera permission not granted", FaceDetectUI.this.getString(a.h.dNn));
            }
            GMTrace.o(5895647920128L, 43926);
          }
        };
        w.i("MicroMsg.FaceDetectUI", "hy: start preview");
        localObject1 = this.kWP;
        localObject2 = this.kWH;
        ((FaceDetectView)localObject2).kYR.a(new FaceDetectView.4((FaceDetectView)localObject2, (c)localObject1));
      }
      GMTrace.o(5886118461440L, 43855);
      return;
      ((FaceScanRect)localObject1).lac.setVisibility(0);
      ((FaceScanRect)localObject1).kZL.setBackgroundResource(a.d.kPz);
      ((FaceScanRect)localObject1).lac.startAnimation(((FaceScanRect)localObject1).kZZ);
      Object localObject2 = ((FaceScanRect)localObject1).kZU;
      int j = localObject2.length;
      int i = 0;
      while (i < j)
      {
        Object localObject3 = localObject2[i];
        ((View)localObject3).clearAnimation();
        ((View)localObject3).setBackgroundColor(((FaceScanRect)localObject1).getResources().getColor(com.tencent.mm.plugin.facedetect.a.b.white));
        i += 1;
      }
      ((FaceScanRect)localObject1).lad = FaceScanRect.a.lae;
    }
  }
  
  public final void avW()
  {
    GMTrace.i(5886252679168L, 43856);
    w.i("MicroMsg.FaceDetectUI", "alvinluo releaseFaceDetect");
    if (!this.kWE)
    {
      this.kWP = null;
      this.kWE = true;
      if (this.kWC.kWX)
      {
        awW();
        this.kWH.kYR.kYx.axk();
      }
      if ((this.wakeLock != null) && (this.wakeLock.isHeld()))
      {
        this.wakeLock.release();
        this.wakeLock = null;
      }
      com.tencent.mm.sdk.f.e.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5890144993280L, 43885);
          long l = bg.Pw();
          Runtime.getRuntime().gc();
          w.i("MicroMsg.FaceDetectUI", "hy: gc uses: %d ms", new Object[] { Long.valueOf(bg.aI(l)) });
          GMTrace.o(5890144993280L, 43885);
        }
      }, "Face_active_gc");
    }
    atA();
    GMTrace.o(5886252679168L, 43856);
  }
  
  final void awV()
  {
    GMTrace.i(5886521114624L, 43858);
    if (this.kzq)
    {
      w.i("MicroMsg.FaceDetectUI", "hy: start capture face");
      FaceDetectView localFaceDetectView = this.kWH;
      Rect localRect = new Rect(this.kWI.getLeft(), this.kWI.getTop(), this.kWI.getRight(), this.kWI.getBottom());
      h.a locala = h.awr();
      if (locala.type == 100)
      {
        GMTrace.o(5886521114624L, 43858);
        return;
      }
      if (localFaceDetectView.kYW != null) {
        localFaceDetectView.kYW.awC();
      }
      localFaceDetectView.jAg = false;
      localFaceDetectView.isPaused = false;
      localFaceDetectView.kZc = bg.Pw();
      localFaceDetectView.kZa = locala.kSW;
      localFaceDetectView.kYZ = locala.hvl;
      localFaceDetectView.kSX = locala.kSX;
      localFaceDetectView.kYX = true;
      localFaceDetectView.kZb = locala.kTa;
      localFaceDetectView.kYW = b.c.a(locala);
      if (localFaceDetectView.kYW != null)
      {
        if (localFaceDetectView.kYT != null) {
          localFaceDetectView.kYT.removeAllViews();
        }
        if (localFaceDetectView.kYU != null) {
          localFaceDetectView.kYU.removeAllViews();
        }
        localFaceDetectView.kYW.a(localFaceDetectView.getContext(), localFaceDetectView.kYT, localFaceDetectView.kYU);
      }
      if (localFaceDetectView.kYR != null) {
        localFaceDetectView.kYR.a(localRect, locala.kSU);
      }
      localFaceDetectView.kYY = false;
    }
    GMTrace.o(5886521114624L, 43858);
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
    GMTrace.i(5886386896896L, 43857);
    w.i("MicroMsg.FaceDetectUI", "finishWithResult errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) && (paramInt2 != 0) && (com.tencent.mm.plugin.facedetect.e.a.axb().isStarted()) && (com.tencent.mm.plugin.facedetect.e.a.axb().kXz)) {
      com.tencent.mm.plugin.facedetect.e.a.axb().axe();
    }
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("key_parcelable_reporter", FaceDetectReporter.aws());
    if (paramBundle != null) {
      localBundle.putAll(paramBundle);
    }
    paramBundle = new Bundle();
    paramBundle.putInt("err_type", paramInt1);
    paramBundle.putInt("err_code", paramInt2);
    paramBundle.putString("err_msg", paramString);
    paramBundle.putAll(localBundle);
    paramString = new Intent();
    paramString.putExtras(paramBundle);
    setResult(-1, paramString);
    finish();
    GMTrace.o(5886386896896L, 43857);
  }
  
  public void finish()
  {
    GMTrace.i(5887460638720L, 43865);
    w.i("MicroMsg.FaceDetectUI", "alvinluo finish");
    if ((this.kWd != null) && (this.kWd.awP())) {
      this.kWd.dismiss();
    }
    if (this.kWe != null) {
      this.kWe.dismiss();
    }
    w.i("MicroMsg.FaceDetectUI", "alvinluo FaceDetectUI release");
    avW();
    super.finish();
    GMTrace.o(5887460638720L, 43865);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5885984243712L, 43854);
    int i = a.g.kQt;
    GMTrace.o(5885984243712L, 43854);
    return i;
  }
  
  public final void nx(int paramInt)
  {
    GMTrace.i(14526653136896L, 108232);
    if (paramInt == 1) {
      this.kWI.b(null);
    }
    GMTrace.o(14526653136896L, 108232);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(5887594856448L, 43866);
    w.i("MicroMsg.FaceDetectUI", "alvinluo onBackPressed and cancel");
    awO();
    GMTrace.o(5887594856448L, 43866);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5885447372800L, 43850);
    super.onCreate(paramBundle);
    getWindow().addFlags(2097280);
    this.fKP = getIntent().getStringExtra("k_user_name");
    this.kWf = getIntent().getBooleanExtra("k_need_signature", false);
    this.kRs = getIntent().getIntExtra("k_server_scene", -1);
    paramBundle = (FaceDetectReporter)getIntent().getBundleExtra("key_reporter_bundle").getParcelable("key_parcelable_reporter");
    if (paramBundle != null) {
      FaceDetectReporter.aws().a(paramBundle);
    }
    int i = com.tencent.mm.plugin.facedetect.c.b.kSm;
    this.kWc = com.tencent.mm.plugin.facedetect.c.b.a(this, this, this.kRs, getIntent().getExtras());
    n.o(this);
    this.kWK = ((Button)findViewById(a.e.bJU));
    this.kWK.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5881555058688L, 43821);
        w.i("MicroMsg.FaceDetectUI", "hy: user cancelled with left button");
        FaceDetectUI.a(FaceDetectUI.this);
        GMTrace.o(5881555058688L, 43821);
      }
    });
    this.kWF = findViewById(a.e.kPF);
    this.kWF.setVisibility(8);
    this.kWG = ((RelativeLayout)findViewById(a.e.kPJ));
    this.kWI = ((FaceScanRect)findViewById(a.e.kPI));
    this.kWH = ((FaceDetectView)findViewById(a.e.kPH));
    this.kWJ = ((TextView)findViewById(a.e.kPC));
    this.kWH.kYV = this;
    paramBundle = this.kWH;
    RelativeLayout localRelativeLayout = this.kWG;
    ViewGroup localViewGroup = this.kWI.lab;
    paramBundle.kYT = localRelativeLayout;
    paramBundle.kYU = localViewGroup;
    this.kWH.kWJ = this.kWJ;
    this.kWH.g(true, this.fKP);
    this.kWI.laa = new FaceScanRect.b()
    {
      public final void awY()
      {
        GMTrace.i(5901956153344L, 43973);
        Object localObject = FaceDetectUI.c(FaceDetectUI.this);
        RectF localRectF = new RectF(FaceDetectUI.b(FaceDetectUI.this).getLeft(), FaceDetectUI.b(FaceDetectUI.this).getTop(), FaceDetectUI.b(FaceDetectUI.this).getRight(), FaceDetectUI.b(FaceDetectUI.this).getBottom());
        localObject = ((FaceDetectView)localObject).kYS;
        ((FaceDetectDecorView)localObject).kYN = true;
        ((FaceDetectDecorView)localObject).kYO = true;
        ((FaceDetectDecorView)localObject).kYP = localRectF;
        ((FaceDetectDecorView)localObject).invalidate();
        GMTrace.o(5901956153344L, 43973);
      }
    };
    this.kWI.setVisibility(4);
    this.kWC = new b();
    GMTrace.o(5885447372800L, 43850);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5887326420992L, 43864);
    w.i("MicroMsg.FaceDetectUI", "hy: current %d instance not destroyed", new Object[] { Integer.valueOf(hashCode()) });
    super.onDestroy();
    GMTrace.o(5887326420992L, 43864);
  }
  
  public void onStart()
  {
    GMTrace.i(5885715808256L, 43852);
    super.onStart();
    w.i("MicroMsg.FaceDetectUI", "alvinluo onStart");
    if (this.wakeLock == null) {
      this.wakeLock = ((PowerManager)getSystemService("power")).newWakeLock(10, "Scan Lock");
    }
    if (!this.wakeLock.isHeld())
    {
      w.i("MicroMsg.FaceDetectUI", "alvinluo acquire wakeLock");
      this.wakeLock.acquire();
    }
    Intent localIntent = new Intent(this, FaceDetectProcessService.class);
    localIntent.putExtra("key_face_service_connection_from", 2);
    this.kWM = new ServiceConnection()
    {
      public final void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
      {
        GMTrace.i(5884776284160L, 43845);
        w.i("MicroMsg.FaceDetectUI", "alvinluo service connected %s", new Object[] { paramAnonymousComponentName });
        FaceDetectUI.a(FaceDetectUI.this, true);
        paramAnonymousComponentName = (FaceDetectProcessService.a)paramAnonymousIBinder;
        FaceDetectUI.a(FaceDetectUI.this, paramAnonymousComponentName.kUU);
        paramAnonymousComponentName = f.kSM;
        paramAnonymousIBinder = FaceDetectUI.d(FaceDetectUI.this);
        w.i("MicroMsg.FaceDetectManager", "alvinluo bindService process name: %s, hashCode: %d", new Object[] { bg.r(ab.getContext(), Process.myPid()), Integer.valueOf(paramAnonymousComponentName.hashCode()) });
        paramAnonymousComponentName.kSN = paramAnonymousIBinder;
        w.i("MicroMsg.FaceDetectUI", "alvinluo FaceDetectUI service hashCode: %d", new Object[] { Integer.valueOf(FaceDetectUI.d(FaceDetectUI.this).hashCode()) });
        FaceDetectUI.e(FaceDetectUI.this);
        GMTrace.o(5884776284160L, 43845);
      }
      
      public final void onServiceDisconnected(ComponentName paramAnonymousComponentName)
      {
        GMTrace.i(5884910501888L, 43846);
        w.i("MicroMsg.FaceDetectUI", "alvinluo service disconnected %s", new Object[] { paramAnonymousComponentName.toString() });
        FaceDetectUI.a(FaceDetectUI.this, false);
        GMTrace.o(5884910501888L, 43846);
      }
    };
    w.i("MicroMsg.FaceDetectUI", "alvinluo bindService");
    bindService(localIntent, this.kWM, 1);
    GMTrace.o(5885715808256L, 43852);
  }
  
  protected void onStop()
  {
    GMTrace.i(5885850025984L, 43853);
    super.onStop();
    w.i("MicroMsg.FaceDetectUI", "hy: onStop, finish");
    atA();
    if (!this.kWO)
    {
      b(1, 90006, "cancel with on stop", null);
      GMTrace.o(5885850025984L, 43853);
      return;
    }
    finish();
    GMTrace.o(5885850025984L, 43853);
  }
  
  public final void z(int paramInt, final String paramString)
  {
    boolean bool = true;
    GMTrace.i(5887057985536L, 43862);
    w.i("MicroMsg.FaceDetectUI", "hy: face detect result: %d", new Object[] { Integer.valueOf(paramInt) });
    if (FaceCharacteristicsResult.nn(paramInt))
    {
      if (paramInt == 3)
      {
        b(4, 90017, "face detect time out", paramString);
        GMTrace.o(5887057985536L, 43862);
        return;
      }
      if ((paramInt == 6) || (paramInt == 5))
      {
        b(4, 90023, "face track failed or not stable", paramString);
        GMTrace.o(5887057985536L, 43862);
        return;
      }
      if (paramInt == 7)
      {
        b(4, 90009, "audio permission not granted", ab.getContext().getString(a.h.dNr));
        GMTrace.o(5887057985536L, 43862);
        return;
      }
      b(4, 90018, "system error", paramString);
      GMTrace.o(5887057985536L, 43862);
      return;
    }
    paramString = this.kWB;
    if (paramString.kuY >= paramString.kSS - 1)
    {
      paramInt = 1;
      if (paramInt == 0) {
        break label266;
      }
      w.i("MicroMsg.FaceDetectUI", "hy: collect data ok");
      this.kWH.eq(true);
      paramString = awX();
      if (paramString != null) {
        break label261;
      }
    }
    for (;;)
    {
      w.i("MicroMsg.FaceDetectUI", "alvinluo bitmap == null: %b", new Object[] { Boolean.valueOf(bool) });
      com.tencent.mm.sdk.f.e.post(new Runnable()
      {
        public final void onFinish()
        {
          GMTrace.i(5895916355584L, 43928);
          w.i("MicroMsg.FaceDetectUI", "alvinluo set result and return to FaceDetectPrepareUI");
          FaceDetectUI.k(FaceDetectUI.this);
          FaceDetectUI.this.b(0, 0, "collect data ok", null);
          GMTrace.o(5895916355584L, 43928);
        }
      }
      {
        public final void run()
        {
          GMTrace.i(5881018187776L, 43817);
          n.m(FaceDetectUI.i(FaceDetectUI.this), paramString);
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(5905714249728L, 44001);
              if (FaceDetectUI.8.this.kWU != null) {
                FaceDetectUI.8.this.kWU.onFinish();
              }
              GMTrace.o(5905714249728L, 44001);
            }
          });
          GMTrace.o(5881018187776L, 43817);
        }
      }, "save_face_bitmap");
      GMTrace.o(5887057985536L, 43862);
      return;
      paramInt = 0;
      break;
      label261:
      bool = false;
    }
    label266:
    paramString = this.kWB;
    g localg = f.kSM.kSN.kUR;
    if (localg.kSQ == null) {
      w.e("MicroMsg.FaceDetectNativeManager", "hy: move to next motion no instance");
    }
    for (;;)
    {
      paramString.kuY += 1;
      paramInt = h.awr().type;
      w.i("MicroMsg.FaceDetectUI", "hy: detect ok. start next: %d", new Object[] { Integer.valueOf(paramInt) });
      if (!h.awr().kSZ) {
        break;
      }
      this.kWI.b(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          GMTrace.i(5899674451968L, 43956);
          FaceDetectUI.l(FaceDetectUI.this);
          GMTrace.o(5899674451968L, 43956);
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
          GMTrace.i(5899808669696L, 43957);
          GMTrace.o(5899808669696L, 43957);
        }
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          GMTrace.i(5899540234240L, 43955);
          GMTrace.o(5899540234240L, 43955);
        }
      });
      GMTrace.o(5887057985536L, 43862);
      return;
      w.i("MicroMsg.FaceDetectNativeManager", "hy: start move next motion");
      localg.kSQ.engineNextMotion();
    }
    w.i("MicroMsg.FaceDetectUI", "hy: detect ok. start next: %d", new Object[] { Integer.valueOf(paramInt) });
    awV();
    GMTrace.o(5887057985536L, 43862);
  }
  
  private static abstract interface a
  {
    public abstract void onFinish();
  }
  
  private final class b
  {
    private boolean kWW;
    public boolean kWX;
    private boolean kWY;
    private final boolean kWZ;
    
    public b()
    {
      GMTrace.i(5880078663680L, 43810);
      this.kWW = true;
      this.kWX = false;
      this.kWY = true;
      this.kWZ = true;
      GMTrace.o(5880078663680L, 43810);
    }
    
    public final void awZ()
    {
      try
      {
        GMTrace.i(5880212881408L, 43811);
        this.kWX = true;
        GMTrace.o(5880212881408L, 43811);
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    final void axa()
    {
      try
      {
        GMTrace.i(5880481316864L, 43813);
        w.i("MicroMsg.FaceDetectUI", "toString: %s", new Object[] { toString() });
        if ((this.kWW) && (this.kWX) && (this.kWY)) {
          FaceDetectUI.m(FaceDetectUI.this).setVisibility(0);
        }
        GMTrace.o(5880481316864L, 43813);
        return;
      }
      finally {}
    }
    
    final void reset()
    {
      try
      {
        GMTrace.i(5880347099136L, 43812);
        this.kWX = false;
        GMTrace.o(5880347099136L, 43812);
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    public final String toString()
    {
      GMTrace.i(5880615534592L, 43814);
      String str = "InitHandler{isCgiInitDone=" + this.kWW + ", isCameraInitDone=" + this.kWX + ", isLightInitDone=true, isLibraryInitDone=" + this.kWY + '}';
      GMTrace.o(5880615534592L, 43814);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\ui\FaceDetectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */