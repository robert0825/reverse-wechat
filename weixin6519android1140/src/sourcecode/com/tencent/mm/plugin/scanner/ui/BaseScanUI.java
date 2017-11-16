package com.tencent.mm.plugin.scanner.ui;

import android.animation.ValueAnimator;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.d.c.a.a;
import com.tencent.mm.g.a.lm;
import com.tencent.mm.g.a.lm.b;
import com.tencent.mm.g.a.oe;
import com.tencent.mm.g.a.of;
import com.tencent.mm.g.a.oh;
import com.tencent.mm.network.n.a;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI;
import com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector;
import com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector.1;
import com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector.a;
import com.tencent.mm.plugin.scanner.util.e.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aq;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMTextureView;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.e.g;
import com.tencent.mm.ui.widget.f;
import com.tencent.mm.y.at;
import java.io.IOException;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class BaseScanUI
  extends MMActivity
  implements Camera.AutoFocusCallback, Camera.PreviewCallback, TextureView.SurfaceTextureListener, i.b
{
  private int eDC;
  private final Object gwY;
  private boolean kYn;
  private int[] mGp;
  private boolean nsT;
  private boolean oaK;
  private FrameLayout ouA;
  private com.tencent.mm.plugin.scanner.util.h ouB;
  private Point ouC;
  private SelectScanModePanel ouD;
  private ScanMaskView ouE;
  private ScannerFlashSwitcher ouF;
  private boolean ouG;
  private boolean ouH;
  private boolean ouI;
  private i.a ouJ;
  private int ouK;
  private int ouL;
  private int ouM;
  private int ouN;
  private boolean ouO;
  private Rect ouP;
  private TextView ouQ;
  private View ouR;
  private boolean ouS;
  private boolean ouT;
  private boolean ouU;
  private boolean ouV;
  private com.tencent.mm.plugin.scanner.util.e ouW;
  private TranslateAnimation ouX;
  private ImageView ouY;
  private i ouZ;
  private long ous;
  private final long ouu;
  private MMTextureView ouv;
  private SurfaceTexture ouw;
  private boolean oux;
  private LinearLayout ouy;
  private TextView ouz;
  private int ova;
  private boolean ovb;
  private boolean ovc;
  private long ovd;
  private long ove;
  private com.tencent.mm.network.n ovf;
  protected ae ovg;
  private final int ovh;
  protected ae ovi;
  protected ae ovj;
  private boolean ovk;
  private com.tencent.mm.sdk.b.c ovl;
  private com.tencent.mm.sdk.b.c ovm;
  protected ae ovn;
  private long ovo;
  protected final int ovp;
  protected final int ovq;
  protected final int ovr;
  private PowerManager.WakeLock wakeLock;
  
  public BaseScanUI()
  {
    GMTrace.i(6068788789248L, 45216);
    this.ous = 1000L;
    this.ouu = 150L;
    this.oux = false;
    this.kYn = false;
    this.gwY = new Object();
    this.ouE = null;
    this.ouG = false;
    this.ouH = false;
    this.ouI = true;
    this.ouO = true;
    this.ouP = new Rect();
    this.ouS = false;
    this.ouT = true;
    this.ouU = false;
    this.ouV = false;
    this.ouW = null;
    this.wakeLock = null;
    this.ova = 0;
    this.eDC = 0;
    this.oaK = true;
    this.ovb = false;
    this.ovc = false;
    this.mGp = new int[5];
    this.ovf = new n.a()
    {
      public final void db(final int paramAnonymousInt)
      {
        GMTrace.i(18482183798784L, 137703);
        if (!BaseScanUI.a(BaseScanUI.this))
        {
          GMTrace.o(18482183798784L, 137703);
          return;
        }
        new ae(Looper.getMainLooper()).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6134421258240L, 45705);
            if ((at.wS().DN() == 6) || (at.wS().DN() == 4))
            {
              if (BaseScanUI.b(BaseScanUI.this))
              {
                GMTrace.o(6134421258240L, 45705);
                return;
              }
              if ((BaseScanUI.c(BaseScanUI.this) != null) && (BaseScanUI.d(BaseScanUI.this) != null))
              {
                BaseScanUI.c(BaseScanUI.this).setVisibility(8);
                BaseScanUI.d(BaseScanUI.this).setVisibility(8);
              }
              BaseScanUI.a(BaseScanUI.this, true);
              BaseScanUI.b(BaseScanUI.this, false);
              BaseScanUI.e(BaseScanUI.this);
            }
            for (;;)
            {
              if (BaseScanUI.h(BaseScanUI.this) != null) {
                BaseScanUI.h(BaseScanUI.this).bcx();
              }
              GMTrace.o(6134421258240L, 45705);
              return;
              if (!BaseScanUI.b(BaseScanUI.this))
              {
                GMTrace.o(6134421258240L, 45705);
                return;
              }
              if ((BaseScanUI.c(BaseScanUI.this) != null) && (BaseScanUI.d(BaseScanUI.this) != null))
              {
                BaseScanUI.c(BaseScanUI.this).setText(R.l.dVy);
                BaseScanUI.d(BaseScanUI.this).setVisibility(0);
                BaseScanUI.c(BaseScanUI.this).setVisibility(0);
              }
              if ((BaseScanUI.f(BaseScanUI.this) != null) && (BaseScanUI.f(BaseScanUI.this).mYm)) {
                BaseScanUI.f(BaseScanUI.this).aPb();
              }
              if (BaseScanUI.g(BaseScanUI.this) != null)
              {
                BaseScanUI.g(BaseScanUI.this).bdj();
                BaseScanUI.g(BaseScanUI.this).hide();
              }
              BaseScanUI.a(BaseScanUI.this, false);
              BaseScanUI.b(BaseScanUI.this, true);
              BaseScanUI.this.bcG();
            }
          }
        });
        GMTrace.o(18482183798784L, 137703);
      }
    };
    this.ovg = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(18481915363328L, 137701);
        if ((paramAnonymousMessage != null) && (paramAnonymousMessage.what == 1))
        {
          if ((BaseScanUI.k(BaseScanUI.this) == null) || (BaseScanUI.l(BaseScanUI.this) == null) || ((BaseScanUI.a(BaseScanUI.this)) && (!BaseScanUI.b(BaseScanUI.this))))
          {
            GMTrace.o(18481915363328L, 137701);
            return;
          }
          if ((BaseScanUI.h(BaseScanUI.this) == null) || (BaseScanUI.h(BaseScanUI.this).bcA() <= 0))
          {
            w.w("MicroMsg.scanner.BaseScanUI", "startAnimHandler scanMode == null");
            BaseScanUI.this.bcG();
            GMTrace.o(18481915363328L, 137701);
            return;
          }
          BaseScanUI.k(BaseScanUI.this).setVisibility(0);
          BaseScanUI.l(BaseScanUI.this).setRepeatCount(-1);
          BaseScanUI.l(BaseScanUI.this).setDuration(2600L);
          BaseScanUI.k(BaseScanUI.this).startAnimation(BaseScanUI.l(BaseScanUI.this));
        }
        GMTrace.o(18481915363328L, 137701);
      }
    };
    this.ovh = 2600;
    this.nsT = false;
    this.ovi = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(18482586451968L, 137706);
        com.tencent.mm.plugin.scanner.util.h localh;
        synchronized (BaseScanUI.o(BaseScanUI.this))
        {
          localh = BaseScanUI.f(BaseScanUI.this);
          if (paramAnonymousMessage == null)
          {
            w.w("MicroMsg.scanner.BaseScanUI", "selectScanModeHandler msg is null");
            GMTrace.o(18482586451968L, 137706);
            return;
          }
        }
        if (BaseScanUI.w(BaseScanUI.this))
        {
          w.w("MicroMsg.scanner.BaseScanUI", "selectScanModeHandler click too quick, msg.what=[%s]", new Object[] { Integer.valueOf(paramAnonymousMessage.what) });
          GMTrace.o(18482586451968L, 137706);
          return;
        }
        if (BaseScanUI.this.isFinishing())
        {
          w.w("MicroMsg.scanner.BaseScanUI", "selectScanModeHandler is invoke after ui was destroyed, msg.what=[%s]", new Object[] { Integer.valueOf(paramAnonymousMessage.what) });
          GMTrace.o(18482586451968L, 137706);
          return;
        }
        BaseScanUI.d(BaseScanUI.this, true);
        if (BaseScanUI.h(BaseScanUI.this) != null)
        {
          if (BaseScanUI.x(BaseScanUI.this) == paramAnonymousMessage.what)
          {
            BaseScanUI.d(BaseScanUI.this, false);
            GMTrace.o(18482586451968L, 137706);
            return;
          }
          BaseScanUI.h(BaseScanUI.this).onPause();
          if (BaseScanUI.h(BaseScanUI.this).bcy() != null) {
            BaseScanUI.h(BaseScanUI.this).bcy().releaseDecoder();
          }
          BaseScanUI.h(BaseScanUI.this);
          BaseScanUI.a(BaseScanUI.this, null);
        }
        if ((!BaseScanUI.a(BaseScanUI.this)) || (BaseScanUI.b(BaseScanUI.this))) {
          BaseScanUI.b(BaseScanUI.this, false);
        }
        while ((BaseScanUI.y(BaseScanUI.this)) && (paramAnonymousMessage.what != 1))
        {
          Toast.makeText(BaseScanUI.this, R.l.dUX, 0).show();
          BaseScanUI.z(BaseScanUI.this).ty(1);
          BaseScanUI.d(BaseScanUI.this, false);
          GMTrace.o(18482586451968L, 137706);
          return;
          BaseScanUI.b(BaseScanUI.this, true);
        }
        if (localh != null) {
          localh.tB(paramAnonymousMessage.what);
        }
        BaseScanUI.a(BaseScanUI.this, paramAnonymousMessage.what);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          if ((localh != null) && (localh.isOpen()) && (localh.kTD))
          {
            localh.bdu();
            localh.tD(1);
          }
          com.tencent.mm.plugin.scanner.a.l.oto.reset();
          BaseScanUI.D(BaseScanUI.this);
          BaseScanUI.this.bcN();
          BaseScanUI.d(BaseScanUI.this, false);
          GMTrace.o(18482586451968L, 137706);
          return;
          if (BaseScanUI.A(BaseScanUI.this))
          {
            BaseScanUI.this.oM(R.l.dVf);
            BaseScanUI.a(BaseScanUI.this, new p(BaseScanUI.this, BaseScanUI.B(BaseScanUI.this), BaseScanUI.C(BaseScanUI.this), 1));
          }
          else
          {
            BaseScanUI.this.oM(R.l.dVg);
            BaseScanUI.a(BaseScanUI.this, new p(BaseScanUI.this, BaseScanUI.B(BaseScanUI.this), BaseScanUI.C(BaseScanUI.this), 0));
            continue;
            BaseScanUI.this.oM(R.l.dVg);
            BaseScanUI.a(BaseScanUI.this, new p(BaseScanUI.this, BaseScanUI.B(BaseScanUI.this), BaseScanUI.C(BaseScanUI.this), 2));
            continue;
            BaseScanUI.this.oM(R.l.dVf);
            BaseScanUI.a(BaseScanUI.this, new p(BaseScanUI.this, BaseScanUI.B(BaseScanUI.this), BaseScanUI.C(BaseScanUI.this), 1));
            continue;
            BaseScanUI.this.sq(com.tencent.mm.plugin.scanner.util.p.dy(com.tencent.mm.plugin.scanner.util.p.oBw, BaseScanUI.this.getString(R.l.dVo)));
            BaseScanUI.a(BaseScanUI.this, new k(BaseScanUI.this, BaseScanUI.B(BaseScanUI.this)));
            continue;
            BaseScanUI.this.oM(R.l.dVd);
            BaseScanUI.a(BaseScanUI.this, new o(BaseScanUI.this, BaseScanUI.B(BaseScanUI.this)));
            continue;
            BaseScanUI.this.oM(R.l.dVh);
            BaseScanUI.a(BaseScanUI.this, new q(BaseScanUI.this, BaseScanUI.B(BaseScanUI.this)));
            w.i("MicroMsg.scanner.BaseScanUI", "summerper checkPermission checkLocation[%b], stack[%s]", new Object[] { Boolean.valueOf(com.tencent.mm.pluginsdk.h.a.a(BaseScanUI.this, "android.permission.ACCESS_COARSE_LOCATION", 64, null, null)), bg.bQW() });
          }
        }
      }
    };
    this.ovj = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(6133213298688L, 45696);
        if ((BaseScanUI.f(BaseScanUI.this) != null) && (BaseScanUI.E(BaseScanUI.this))) {
          BaseScanUI.f(BaseScanUI.this).a(BaseScanUI.this);
        }
        GMTrace.o(6133213298688L, 45696);
      }
    };
    this.ovk = false;
    this.ovl = new com.tencent.mm.sdk.b.c() {};
    this.ovm = new com.tencent.mm.sdk.b.c() {};
    this.ovn = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(18475607130112L, 137654);
        if ((BaseScanUI.f(BaseScanUI.this) != null) && (BaseScanUI.E(BaseScanUI.this)) && (!BaseScanUI.H(BaseScanUI.this)) && (paramAnonymousMessage.what == 0))
        {
          BaseScanUI.b(BaseScanUI.this, System.currentTimeMillis());
          paramAnonymousMessage = BaseScanUI.f(BaseScanUI.this);
          BaseScanUI localBaseScanUI = BaseScanUI.this;
          if ((paramAnonymousMessage.fPj != null) && (paramAnonymousMessage.kTD)) {
            try
            {
              paramAnonymousMessage.j(paramAnonymousMessage.oAQ);
              paramAnonymousMessage.fPj.autoFocus(localBaseScanUI);
              GMTrace.o(18475607130112L, 137654);
              return;
            }
            catch (RuntimeException paramAnonymousMessage)
            {
              w.w("MicroMsg.scanner.ScanCamera", "autoFocus() " + paramAnonymousMessage.getMessage());
            }
          }
        }
        GMTrace.o(18475607130112L, 137654);
      }
    };
    this.ovo = 0L;
    this.ovp = 0;
    this.ovq = 1;
    this.ovr = 2;
    GMTrace.o(6068788789248L, 45216);
  }
  
  private void aZQ()
  {
    boolean bool2 = true;
    GMTrace.i(6069862531072L, 45224);
    if (!com.tencent.mm.compatible.e.b.tu())
    {
      com.tencent.mm.ui.base.h.a(this, getString(R.l.cUD), getString(R.l.cTE), getString(R.l.cTF), true, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(18475741347840L, 137655);
          com.tencent.mm.compatible.e.b.aG(BaseScanUI.this);
          BaseScanUI.this.finish();
          GMTrace.o(18475741347840L, 137655);
        }
      });
      GMTrace.o(6069862531072L, 45224);
      return;
    }
    if ((!this.ouT) || (this.ouI))
    {
      this.ouH = false;
      c(false, 0L);
    }
    for (;;)
    {
      this.ouV = false;
      synchronized (this.gwY)
      {
        w.d("MicroMsg.scanner.BaseScanUI", "onResume open Camera");
        int i = this.ova;
        boolean bool1 = bool2;
        if (7 != this.ova)
        {
          bool1 = bool2;
          if (9 != this.ova)
          {
            bool1 = bool2;
            if (10 != this.ova)
            {
              if (11 != this.ova) {
                break label333;
              }
              bool1 = bool2;
            }
          }
        }
        this.ouB = new com.tencent.mm.plugin.scanner.util.h(this, i, bool1);
        bcI();
        if (this.ouZ != null)
        {
          if (this.ouZ.bcy() != null) {
            this.ouZ.bcy().bdl();
          }
          this.ouZ.onResume();
        }
        if (this.wakeLock == null)
        {
          this.wakeLock = ((PowerManager)getSystemService("power")).newWakeLock(10, "Scan Lock");
          this.wakeLock.acquire();
        }
        sendBroadcast(new Intent("com.tencent.mm.ui.ACTION_ACTIVE").putExtra("classname", getClass().getName()), "com.tencent.mm.permission.MM_MESSAGE");
        if (this.ouT) {
          at.a(this.ovf);
        }
        if (this.ouW != null) {
          this.ouW.onResume();
        }
        GMTrace.o(6069862531072L, 45224);
        return;
        this.ouH = true;
        bcG();
        continue;
        label333:
        bool1 = false;
      }
    }
  }
  
  private void bcF()
  {
    GMTrace.i(6069459877888L, 45221);
    if (this.ouZ == null)
    {
      GMTrace.o(6069459877888L, 45221);
      return;
    }
    this.ouA.removeAllViews();
    View.inflate(this, this.ouZ.bcz(), this.ouA);
    this.ouZ.co(this.ouA.getChildAt(0));
    this.ouZ.bcB();
    i locali = this.ouZ;
    FrameLayout localFrameLayout = this.ouA;
    locali.mHA = new GestureDetector(new i.2(locali));
    localFrameLayout.setOnTouchListener(new i.3(locali));
    if (this.oux) {
      bcL();
    }
    GMTrace.o(6069459877888L, 45221);
  }
  
  private void bcI()
  {
    GMTrace.i(6070802055168L, 45231);
    af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18481781145600L, 137700);
        Object localObject3;
        int i;
        long l;
        Object localObject4;
        try
        {
          if (BaseScanUI.f(BaseScanUI.this) == null)
          {
            w.w("MicroMsg.scanner.BaseScanUI", "scanCamera == null, in openCamera()");
            GMTrace.o(18481781145600L, 137700);
            return;
          }
          if (!BaseScanUI.m(BaseScanUI.this))
          {
            BaseScanUI.c(BaseScanUI.this, true);
            GMTrace.o(18481781145600L, 137700);
            return;
          }
          if (BaseScanUI.n(BaseScanUI.this) == null)
          {
            w.w("MicroMsg.scanner.BaseScanUI", "preview surface in null in openCamera");
            GMTrace.o(18481781145600L, 137700);
            return;
          }
          if (BaseScanUI.f(BaseScanUI.this).isOpen())
          {
            w.d("MicroMsg.scanner.BaseScanUI", "camera already open");
            BaseScanUI.p(BaseScanUI.this);
            BaseScanUI.c(BaseScanUI.this, false);
            BaseScanUI.this.bcL();
            GMTrace.o(18481781145600L, 137700);
            return;
          }
          synchronized (BaseScanUI.o(BaseScanUI.this))
          {
            com.tencent.mm.plugin.scanner.util.h localh = BaseScanUI.f(BaseScanUI.this);
            localObject3 = BaseScanUI.n(BaseScanUI.this);
            if (localh.kTD)
            {
              w.w("MicroMsg.scanner.ScanCamera", "in open(), previewing");
              localh.release();
            }
            i = com.tencent.mm.compatible.d.c.sF();
            l = bg.Pw();
            localObject4 = com.tencent.mm.compatible.d.c.o(localh.eNu, i);
            if (localObject4 == null)
            {
              w.e("MicroMsg.scanner.ScanCamera", "in open(), openCameraRes == null");
              throw new IOException();
            }
          }
          ((com.tencent.mm.plugin.scanner.util.h)localObject2).mYm = false;
        }
        catch (Exception localException1)
        {
          w.w("MicroMsg.scanner.BaseScanUI", "Exception in scanCamera.open(), [%s]", new Object[] { localException1.toString() });
          w.printErrStackTrace("MicroMsg.scanner.BaseScanUI", localException1, "", new Object[0]);
          BaseScanUI.q(BaseScanUI.this);
          GMTrace.o(18481781145600L, 137700);
          return;
        }
        ((com.tencent.mm.plugin.scanner.util.h)localObject2).oAS = -1;
        w.d("MicroMsg.scanner.ScanCamera", "openCamera done, cameraId=[%s] costTime=[%s]", new Object[] { Integer.valueOf(i), Long.valueOf(bg.aI(l)) });
        ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTI = ((c.a.a)localObject4).eSp;
        boolean bool;
        label355:
        Point localPoint;
        if (((c.a.a)localObject4).eSp % 180 != 0)
        {
          bool = true;
          ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTH = bool;
          ((com.tencent.mm.plugin.scanner.util.h)localObject2).fPj = ((c.a.a)localObject4).fPj;
          if (((com.tencent.mm.plugin.scanner.util.h)localObject2).fPj == null)
          {
            w.e("MicroMsg.scanner.ScanCamera", "in open(), camera == null, bNeedRotate=[%s]", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.scanner.util.h)localObject2).kTH) });
            throw new IOException();
          }
          ((com.tencent.mm.plugin.scanner.util.h)localObject2).fPj.setPreviewTexture((SurfaceTexture)localObject3);
          localObject3 = ((com.tencent.mm.plugin.scanner.util.h)localObject2).fPj.getParameters();
          localObject4 = ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTF;
          localPoint = ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTG;
          if ((9 == ((com.tencent.mm.plugin.scanner.util.h)localObject2).oAO) || (10 == ((com.tencent.mm.plugin.scanner.util.h)localObject2).oAO) || (7 == ((com.tencent.mm.plugin.scanner.util.h)localObject2).oAO)) {
            break label842;
          }
          if (11 == ((com.tencent.mm.plugin.scanner.util.h)localObject2).oAO) {
            break label842;
          }
        }
        for (;;)
        {
          label487:
          ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTE = com.tencent.mm.plugin.scanner.util.h.a((Camera.Parameters)localObject3, (Point)localObject4, localPoint, bool);
          w.d("MicroMsg.scanner.ScanCamera", "getCameraResolution: " + ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTF + " camera:" + ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTE);
          ((Camera.Parameters)localObject3).setPreviewSize(((com.tencent.mm.plugin.scanner.util.h)localObject2).kTE.x, ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTE.y);
          ((com.tencent.mm.plugin.scanner.util.h)localObject2).bdu();
          try
          {
            if ((((Camera.Parameters)localObject3).getSupportedFocusModes() != null) && (((Camera.Parameters)localObject3).getSupportedFocusModes().contains("auto")))
            {
              w.i("MicroMsg.scanner.ScanCamera", "set FocusMode to FOCUS_MODE_AUTO");
              ((Camera.Parameters)localObject3).setFocusMode("auto");
            }
            for (;;)
            {
              k = 0;
              j = 0;
              localObject4 = ((Camera.Parameters)localObject3).getSupportedPreviewFormats();
              w.i("MicroMsg.scanner.ScanCamera", "supportedPreviewFormat:" + localObject4);
              if (!((List)localObject4).contains(Integer.valueOf(17))) {
                break label743;
              }
              i = 1;
              if (i == 0) {
                break label768;
              }
              w.i("MicroMsg.scanner.ScanCamera", "Preview support NV21");
              ((Camera.Parameters)localObject3).setPreviewFormat(17);
              ((com.tencent.mm.plugin.scanner.util.h)localObject2).fPj.setParameters((Camera.Parameters)localObject3);
              w.d("MicroMsg.scanner.BaseScanUI", "scanCamera.open done");
              break;
              bool = false;
              break label487;
              w.i("MicroMsg.scanner.ScanCamera", "camera not support FOCUS_MODE_AUTO");
            }
          }
          catch (Exception localException2)
          {
            for (;;)
            {
              int k;
              int j;
              w.e("MicroMsg.scanner.ScanCamera", "set focus mode error: %s", new Object[] { localException2.getMessage() });
              continue;
              label743:
              i = k;
              if (localException2.contains(Integer.valueOf(842094169)))
              {
                j = 1;
                i = k;
                continue;
                label768:
                if (j != 0)
                {
                  w.i("MicroMsg.scanner.ScanCamera", "Preview not support NV21, but support YV12");
                  ((Camera.Parameters)localObject3).setPreviewFormat(842094169);
                }
                else
                {
                  w.i("MicroMsg.scanner.ScanCamera", "Preview not support NV21 and YV12. Use format: %s", new Object[] { localException2.get(0) });
                  ((Camera.Parameters)localObject3).setPreviewFormat(((Integer)localException2.get(0)).intValue());
                }
              }
            }
          }
          bool = false;
          break label355;
          label842:
          bool = true;
        }
      }
    }, 25L);
    af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6132542210048L, 45691);
        try
        {
          if (BaseScanUI.f(BaseScanUI.this) == null)
          {
            w.w("MicroMsg.scanner.BaseScanUI", "scanCamera == null, in startPreview");
            GMTrace.o(6132542210048L, 45691);
            return;
          }
          if (!BaseScanUI.f(BaseScanUI.this).isOpen())
          {
            w.w("MicroMsg.scanner.BaseScanUI", "camera not open");
            GMTrace.o(6132542210048L, 45691);
            return;
          }
          if (BaseScanUI.n(BaseScanUI.this) == null)
          {
            w.w("MicroMsg.scanner.BaseScanUI", "preview surface in null in startPreview");
            GMTrace.o(6132542210048L, 45691);
            return;
          }
          w.d("MicroMsg.scanner.BaseScanUI", "camera startPreview.");
          synchronized (BaseScanUI.o(BaseScanUI.this))
          {
            BaseScanUI.f(BaseScanUI.this).c(BaseScanUI.n(BaseScanUI.this));
            w.d("MicroMsg.scanner.BaseScanUI", "camera startPreview. done");
            BaseScanUI.a(BaseScanUI.this, System.currentTimeMillis());
            if ((BaseScanUI.f(BaseScanUI.this) != null) && (BaseScanUI.f(BaseScanUI.this).isOpen()) && (BaseScanUI.f(BaseScanUI.this).kTD)) {
              BaseScanUI.f(BaseScanUI.this).tD(1);
            }
            BaseScanUI.this.dl(0L);
            GMTrace.o(6132542210048L, 45691);
            return;
          }
          return;
        }
        catch (Exception localException)
        {
          w.w("MicroMsg.scanner.BaseScanUI", "Exception in scanCamera.startPreview(), [%s]", new Object[] { localException.toString() });
          w.printErrStackTrace("MicroMsg.scanner.BaseScanUI", localException, "", new Object[0]);
          BaseScanUI.q(BaseScanUI.this);
          GMTrace.o(6132542210048L, 45691);
        }
      }
    }, 50L);
    GMTrace.o(6070802055168L, 45231);
  }
  
  private void bcJ()
  {
    GMTrace.i(6070936272896L, 45232);
    this.kYn = true;
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6130931597312L, 45679);
        if (BaseScanUI.f(BaseScanUI.this) == null)
        {
          GMTrace.o(6130931597312L, 45679);
          return;
        }
        synchronized (BaseScanUI.o(BaseScanUI.this))
        {
          if ((BaseScanUI.r(BaseScanUI.this)) && (BaseScanUI.f(BaseScanUI.this) != null))
          {
            w.d("MicroMsg.scanner.BaseScanUI", "closeCamera");
            BaseScanUI.f(BaseScanUI.this).release();
            BaseScanUI.s(BaseScanUI.this);
            BaseScanUI.t(BaseScanUI.this);
            w.d("MicroMsg.scanner.BaseScanUI", "scanCamera.release() done");
          }
          GMTrace.o(6130931597312L, 45679);
          return;
        }
      }
    }, "BaseScanUI_closeCamera");
    GMTrace.o(6070936272896L, 45232);
  }
  
  private void bcK()
  {
    GMTrace.i(6071070490624L, 45233);
    if (this.ouG)
    {
      GMTrace.o(6071070490624L, 45233);
      return;
    }
    this.ouG = true;
    gZ(true);
    Object localObject = new lm();
    ((lm)localObject).ePT.type = 2;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    if (((lm)localObject).ePU.ePS)
    {
      w.i("MicroMsg.scanner.BaseScanUI", "Permission dialog showed");
      this.ouH = true;
      bcJ();
      bcS();
      overridePendingTransition(0, 0);
      GMTrace.o(6071070490624L, 45233);
      return;
    }
    localObject = com.tencent.mm.ui.base.h.a(this, getString(R.l.dVz), getString(R.l.cUG), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(18475472912384L, 137653);
        BaseScanUI.b(BaseScanUI.this, true);
        BaseScanUI.u(BaseScanUI.this);
        BaseScanUI.v(BaseScanUI.this);
        BaseScanUI.this.overridePendingTransition(0, 0);
        GMTrace.o(18475472912384L, 137653);
      }
    });
    if (localObject == null)
    {
      w.d("MicroMsg.scanner.BaseScanUI", "comfirmDialog == null");
      GMTrace.o(6071070490624L, 45233);
      return;
    }
    ((com.tencent.mm.ui.base.i)localObject).setCancelable(false);
    ((com.tencent.mm.ui.base.i)localObject).setCanceledOnTouchOutside(false);
    ((com.tencent.mm.ui.base.i)localObject).show();
    GMTrace.o(6071070490624L, 45233);
  }
  
  private void bcM()
  {
    GMTrace.i(6071473143808L, 45236);
    Rect localRect = new Rect();
    getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
    this.ouC = new Point(localRect.width(), localRect.height());
    w.d("MicroMsg.scanner.BaseScanUI", "visible rect: %s", new Object[] { this.ouC });
    GMTrace.o(6071473143808L, 45236);
  }
  
  private void bcS()
  {
    GMTrace.i(6073620627456L, 45252);
    of localof = new of();
    localof.eTh.eQl = 1;
    com.tencent.mm.sdk.b.a.vgX.m(localof);
    setResult(0);
    finish();
    GMTrace.o(6073620627456L, 45252);
  }
  
  private void c(boolean paramBoolean, long paramLong)
  {
    GMTrace.i(6070399401984L, 45228);
    if ((this.ouM < 0) || (this.ouN <= 0) || ((this.ouZ != null) && (!this.ouZ.bcD())))
    {
      GMTrace.o(6070399401984L, 45228);
      return;
    }
    FrameLayout.LayoutParams localLayoutParams;
    if (paramBoolean)
    {
      localLayoutParams = (FrameLayout.LayoutParams)this.ouY.getLayoutParams();
      if (!this.ouO) {
        break label175;
      }
      localLayoutParams.width = this.ouK;
      localLayoutParams.gravity = 1;
      this.ouY.setLayoutParams(localLayoutParams);
      this.ouY.invalidate();
      this.ouY.setVisibility(0);
      if (!this.ouO) {
        break label206;
      }
    }
    label175:
    label206:
    for (this.ouX = new TranslateAnimation(0.0F, 0.0F, this.ouM, this.ouN);; this.ouX = new TranslateAnimation(this.ouM, this.ouN, 0.0F, 0.0F))
    {
      this.ovg.removeMessages(1);
      if (paramLong > 0L) {
        break label232;
      }
      this.ovg.sendEmptyMessage(1);
      GMTrace.o(6070399401984L, 45228);
      return;
      localLayoutParams.height = this.ouL;
      localLayoutParams.gravity = 48;
      localLayoutParams.topMargin = this.ouP.top;
      break;
    }
    label232:
    bcG();
    this.ovg.sendEmptyMessageDelayed(1, paramLong);
    GMTrace.o(6070399401984L, 45228);
  }
  
  private boolean sG()
  {
    GMTrace.i(6073754845184L, 45253);
    if ((7 == this.ova) || (9 == this.ova) || (10 == this.ova) || (11 == this.ova) || (com.tencent.mm.compatible.d.c.sG()))
    {
      GMTrace.o(6073754845184L, 45253);
      return true;
    }
    GMTrace.o(6073754845184L, 45253);
    return false;
  }
  
  protected final void MP()
  {
    GMTrace.i(6069325660160L, 45220);
    if (sG())
    {
      getWindow().setFlags(1024, 1024);
      this.vKB.bXF();
      w.d("MicroMsg.scanner.BaseScanUI", "oncreate LANDSCAPE");
    }
    this.ouR = findViewById(R.h.bZF);
    this.ouQ = ((TextView)findViewById(R.h.bZG));
    this.ouy = ((LinearLayout)findViewById(R.h.bZK));
    this.ouz = ((TextView)findViewById(R.h.bZL));
    this.ouA = ((FrameLayout)findViewById(R.h.bZB));
    this.ouF = ((ScannerFlashSwitcher)findViewById(R.h.bZO));
    this.ouv = ((MMTextureView)findViewById(R.h.bTN));
    this.ouv.setOpaque(false);
    this.ouv.setSurfaceTextureListener(this);
    Object localObject;
    label330:
    label488:
    int i;
    if ((7 == this.ova) || (9 == this.ova) || (10 == this.ova) || (11 == this.ova))
    {
      Button localButton = (Button)findViewById(R.h.bZA);
      localButton.setVisibility(0);
      findViewById(R.h.bZC).setVisibility(8);
      findViewById(R.h.bZN).setVisibility(8);
      if (9 != this.ova)
      {
        localObject = localButton;
        if (10 != this.ova) {}
      }
      else
      {
        ViewGroup.LayoutParams localLayoutParams = localButton.getLayoutParams();
        localObject = localButton;
        if (localLayoutParams != null)
        {
          localObject = localButton;
          if ((localLayoutParams instanceof ViewGroup.MarginLayoutParams))
          {
            localObject = (ViewGroup.MarginLayoutParams)localLayoutParams;
            ((ViewGroup.MarginLayoutParams)localObject).leftMargin = ((ViewGroup.MarginLayoutParams)localObject).topMargin;
            localButton.setLayoutParams((ViewGroup.LayoutParams)localObject);
            localObject = localButton;
          }
        }
      }
      if (localObject == null) {
        break label639;
      }
      ((Button)localObject).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(18482720669696L, 137707);
          BaseScanUI.i(BaseScanUI.this);
          GMTrace.o(18482720669696L, 137707);
        }
      });
      this.ouY = ((ImageView)findViewById(R.h.bZE));
      this.eDC = getIntent().getIntExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 0);
      this.ouD = ((SelectScanModePanel)findViewById(R.h.bZI));
      this.ouA.setVisibility(0);
      if ((7 != this.ova) && (9 != this.ova) && (10 != this.ova) && (11 != this.ova) && (sG()))
      {
        this.ova = 1;
        this.ouS = true;
      }
      bcM();
      Ve(null);
      if (this.ova != 2) {
        break label654;
      }
      this.ouZ = new k(this, this.ouC);
      bcF();
      sq(com.tencent.mm.plugin.scanner.util.p.dy(com.tencent.mm.plugin.scanner.util.p.oBw, getString(R.l.dVo)));
      this.ouO = this.ouZ.bcC();
      localObject = this.ouY;
      if (!this.ouO) {
        break label1452;
      }
      i = R.g.aZi;
      label516:
      ((ImageView)localObject).setBackgroundResource(i);
      i = this.ova;
      if ((7 != this.ova) && (9 != this.ova) && (10 != this.ova) && (11 != this.ova)) {
        break label1459;
      }
    }
    for (;;)
    {
      if (this.ouB != null) {
        this.ouB.tB(this.ova);
      }
      w.i("MicroMsg.scanner.BaseScanUI", "initView() done, fromSource=[%s], directSelectMode=[%s]", new Object[] { Integer.valueOf(this.eDC), Integer.valueOf(this.ova) });
      GMTrace.o(6069325660160L, 45220);
      return;
      localObject = (Button)findViewById(R.h.bZz);
      break;
      label639:
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(18475875565568L, 137656);
          BaseScanUI.i(BaseScanUI.this);
          GMTrace.o(18475875565568L, 137656);
          return false;
        }
      });
      break label330;
      label654:
      if (this.ova == 5)
      {
        this.ouZ = new q(this, this.ouC);
        bcF();
        oM(R.l.dVh);
        w.i("MicroMsg.scanner.BaseScanUI", "summerper checkPermission checkLocation[%b], stack[%s]", new Object[] { Boolean.valueOf(com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.ACCESS_COARSE_LOCATION", 64, null, null)), bg.bQW() });
        break label488;
      }
      if (this.ova == 3)
      {
        this.ouZ = new o(this, this.ouC);
        bcF();
        oM(R.l.dVd);
        break label488;
      }
      if ((this.ova == 4) && (!sG()))
      {
        this.ouZ = new p(this, this.ouC, this.eDC, 2);
        ((p)this.ouZ).oyJ = getIntent().getBooleanExtra("key_is_finish_on_scanned", false);
        bcF();
        this.ouD.setVisibility(8);
        oM(R.l.dVi);
        break label488;
      }
      if (this.ova == 8)
      {
        this.ouZ = new p(this, this.ouC, this.eDC, 1);
        ((p)this.ouZ).oyJ = getIntent().getBooleanExtra("key_is_finish_on_scanned", false);
        bcF();
        this.ouD.setVisibility(8);
        oM(R.l.dVf);
        break label488;
      }
      if (7 == this.ova)
      {
        localObject = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
        this.ouZ = new j(this, this.ouC, (DisplayMetrics)localObject, getWindowManager().getDefaultDisplay().getRotation());
        localObject = (j)this.ouZ;
        if ((getIntent() != null) && (getIntent().getBooleanExtra("scan_bankcard_with_confirm_ui", false))) {}
        for (boolean bool = true;; bool = false)
        {
          ((j)localObject).oxY = bool;
          bcF();
          oM(R.l.dUY);
          this.ouD.setVisibility(8);
          break;
        }
      }
      if (9 == this.ova)
      {
        localObject = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
        this.ouZ = new m(this, this.ouC, (DisplayMetrics)localObject, getWindowManager().getDefaultDisplay().getRotation());
        bcF();
        oM(R.l.dVa);
        this.ouD.setVisibility(8);
        break label488;
      }
      if (10 == this.ova)
      {
        localObject = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
        this.ouZ = new l(this, this.ouC, (DisplayMetrics)localObject, getWindowManager().getDefaultDisplay().getRotation());
        bcF();
        oM(R.l.dUZ);
        this.ouD.setVisibility(8);
        break label488;
      }
      if (11 == this.ova)
      {
        localObject = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
        this.ouZ = new n(this, this.ouC, (DisplayMetrics)localObject, getWindowManager().getDefaultDisplay().getRotation());
        bcF();
        oM(R.l.dVb);
        this.ouD.setVisibility(8);
        break label488;
      }
      this.ova = 1;
      localObject = this.ouC;
      int j = this.eDC;
      if (sG())
      {
        i = 1;
        label1328:
        this.ouZ = new p(this, (Point)localObject, j, i);
        ((p)this.ouZ).oyJ = getIntent().getBooleanExtra("key_is_finish_on_scanned", false);
        bcF();
        if (!com.tencent.mm.ap.b.Jv()) {
          break label1411;
        }
        this.ouS = true;
        this.ouD.setVisibility(8);
      }
      for (;;)
      {
        if (!this.ouS) {
          break label1442;
        }
        oM(R.l.dVf);
        break;
        i = 0;
        break label1328;
        label1411:
        if (getIntent().getBooleanExtra("BaseScanUI_only_scan_qrcode_with_zbar", false))
        {
          this.ouS = false;
          this.ouD.setVisibility(8);
        }
      }
      label1442:
      oM(R.l.dVg);
      break label488;
      label1452:
      i = R.g.aZj;
      break label516;
      label1459:
      this.ouD.ozG = new SelectScanModePanel.a()
      {
        public final void tx(int paramAnonymousInt)
        {
          GMTrace.i(18482049581056L, 137702);
          BaseScanUI.this.tw(paramAnonymousInt);
          GMTrace.o(18482049581056L, 137702);
        }
      };
      this.ouD.ty(i);
    }
  }
  
  public final void N(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(6074560151552L, 45259);
    for (;;)
    {
      synchronized (this.gwY)
      {
        if ((!this.kYn) && (this.ouB != null) && (this.ouB.kTD))
        {
          w.i("MicroMsg.scanner.BaseScanUI", "zoom camera,action:%d,type:%d,scale:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
          int i = this.ouB.bdv();
          if ((this.ova != 1) && (this.ova != 8) && (this.ova != 4)) {
            break label301;
          }
          if ((paramInt2 == 1) && (!((p)this.ouZ).bdh()))
          {
            w.d("MicroMsg.scanner.BaseScanUI", "auto zoom is disable");
            GMTrace.o(6074560151552L, 45259);
            return;
          }
          if (paramInt2 == 2) {
            ((p)this.ouZ).bdg();
          }
          if (paramInt1 != 6) {
            continue;
          }
          this.ouB.tC(paramInt3);
          if (this.ouB.bdv() != i)
          {
            com.tencent.mm.plugin.scanner.a.l locall = com.tencent.mm.plugin.scanner.a.l.oto;
            paramInt1 = this.ouB.bdv();
            String str1 = "";
            if (paramInt2 != 1) {
              break label329;
            }
            str1 = String.format("(0@%.2f)", new Object[] { Double.valueOf(paramInt1 / 100.0D) });
            if (locall.otB.length() + str1.length() < 1024) {
              locall.otB.append(str1);
            }
          }
        }
        GMTrace.o(6074560151552L, 45259);
        return;
        this.ouB.tD(paramInt1);
      }
      label301:
      if (paramInt1 == 6)
      {
        this.ouB.tC(paramInt3);
      }
      else
      {
        this.ouB.tD(paramInt1);
        continue;
        label329:
        if (paramInt2 == 2) {
          String str2 = "" + String.format("(1@%.2f)", new Object[] { Double.valueOf(paramInt1 / 100.0D) });
        }
      }
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(6069057224704L, 45218);
    if (!sG())
    {
      w.d("MicroMsg.scanner.BaseScanUI", "getForceOrientation PORTRAIT");
      GMTrace.o(6069057224704L, 45218);
      return 1;
    }
    w.d("MicroMsg.scanner.BaseScanUI", "getForceOrientation LANDSCAPE");
    GMTrace.o(6069057224704L, 45218);
    return 0;
  }
  
  public final void a(i.a parama)
  {
    GMTrace.i(6072546885632L, 45244);
    this.ouJ = parama;
    GMTrace.o(6072546885632L, 45244);
  }
  
  public final void a(String paramString, int paramInt1, int paramInt2, int paramInt3, e.a parama)
  {
    GMTrace.i(6073889062912L, 45254);
    w.d("MicroMsg.scanner.BaseScanUI", "dealQBarString, qbarString: %s, codeType: %s, codeVersion: %s", new Object[] { paramString, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ouW != null) {
      this.ouW.bdq();
    }
    Bundle localBundle = getIntent().getBundleExtra("_stat_obj");
    this.ovc = true;
    this.ouW = new com.tencent.mm.plugin.scanner.util.e();
    this.ouW.a(this, paramString, paramInt1, paramInt2, paramInt3, parama, localBundle);
    if ((this.ova == 1) || (this.ova == 8) || (this.ova == 4))
    {
      paramInt1 = com.tencent.mm.plugin.scanner.a.l.oto.ott;
      paramInt1 = com.tencent.mm.plugin.scanner.a.l.otl;
    }
    GMTrace.o(6073889062912L, 45254);
  }
  
  public final void b(int paramInt, final View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(6073083756544L, 45248);
    if (this.ouy != null)
    {
      if (!getIntent().getBooleanExtra("key_is_hide_right_btn", false))
      {
        if (paramOnClickListener != null)
        {
          this.ouy.setVisibility(paramInt);
          this.ouy.setOnClickListener(paramOnClickListener);
          this.ouz.setBackgroundDrawable(null);
          this.ouz.setText(getString(R.l.dXc));
          GMTrace.o(6073083756544L, 45248);
        }
      }
      else
      {
        this.ouy.setVisibility(8);
        GMTrace.o(6073083756544L, 45248);
      }
    }
    else if (!getIntent().getBooleanExtra("key_is_hide_right_btn", false))
    {
      if (paramOnClickListener != null)
      {
        a(0, R.g.aXV, new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(18476009783296L, 137657);
            paramAnonymousMenuItem = new f(BaseScanUI.this.vKB.vKW, f.xpQ, false);
            paramAnonymousMenuItem.qik = new p.c()
            {
              public final void a(com.tencent.mm.ui.base.n paramAnonymous2n)
              {
                GMTrace.i(6150393167872L, 45824);
                paramAnonymous2n.em(0, R.l.cQw);
                if (BaseScanUI.13.this.ovv != null) {
                  paramAnonymous2n.em(1, R.l.dXb);
                }
                if (com.tencent.mm.plugin.scanner.util.j.bdx())
                {
                  paramAnonymous2n.em(2, R.l.dVk);
                  w.i("MicroMsg.scanner.BaseScanUI", "show history list");
                }
                if (r.hkS) {
                  paramAnonymous2n.e(3, "TestScanner");
                }
                GMTrace.o(6150393167872L, 45824);
              }
            };
            paramAnonymousMenuItem.qil = new p.d()
            {
              public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
              {
                GMTrace.i(6152272216064L, 45838);
                switch (paramAnonymous2MenuItem.getItemId())
                {
                }
                for (;;)
                {
                  GMTrace.o(6152272216064L, 45838);
                  return;
                  paramAnonymous2MenuItem = BaseScanUI.this;
                  Intent localIntent1 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                  localIntent1.putExtra("android.intent.extra.shortcut.NAME", paramAnonymous2MenuItem.getString(R.l.dvy));
                  localIntent1.putExtra("duplicate", false);
                  Intent localIntent2 = new Intent("com.tencent.mm.action.BIZSHORTCUT");
                  localIntent2.putExtra("LauncherUI.From.Scaner.Shortcut", true);
                  localIntent2.addFlags(67108864);
                  localIntent1.putExtra("android.intent.extra.shortcut.INTENT", localIntent2);
                  localIntent1.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(paramAnonymous2MenuItem, R.g.aZE));
                  localIntent1.putExtra("shortcut_icon_resource_id", R.g.aZE);
                  com.tencent.mm.plugin.base.model.b.m(paramAnonymous2MenuItem, localIntent1);
                  g.ork.i(11410, new Object[0]);
                  GMTrace.o(6152272216064L, 45838);
                  return;
                  if (BaseScanUI.13.this.ovv != null)
                  {
                    BaseScanUI.13.this.ovv.onClick(null);
                    GMTrace.o(6152272216064L, 45838);
                    return;
                    paramAnonymous2MenuItem = new Intent();
                    paramAnonymous2MenuItem.setClass(BaseScanUI.this, ScannerHistoryUI.class);
                    BaseScanUI.this.startActivity(paramAnonymous2MenuItem);
                    g.ork.i(12684, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
                    GMTrace.o(6152272216064L, 45838);
                    return;
                    r.hkV = 0;
                    r.hkT = true;
                  }
                }
              }
            };
            paramAnonymousMenuItem.bFk();
            GMTrace.o(18476009783296L, 137657);
            return false;
          }
        });
        GMTrace.o(6073083756544L, 45248);
        return;
      }
      AZ(0);
    }
    GMTrace.o(6073083756544L, 45248);
  }
  
  public final void bcG()
  {
    GMTrace.i(6070533619712L, 45229);
    if ((this.ouY != null) && (this.ouX != null))
    {
      this.ouY.setVisibility(8);
      this.ouY.clearAnimation();
      this.ouY.setAnimation(null);
    }
    GMTrace.o(6070533619712L, 45229);
  }
  
  public final void bcH()
  {
    GMTrace.i(6070667837440L, 45230);
    if (!this.ouH) {
      aq.C(this, R.l.dOV);
    }
    GMTrace.o(6070667837440L, 45230);
  }
  
  public final void bcL()
  {
    GMTrace.i(6071204708352L, 45234);
    for (;;)
    {
      Object localObject2;
      int i;
      try
      {
        bcM();
        if (this.ouZ == null)
        {
          w.d("MicroMsg.scanner.BaseScanUI", "initBodyByScanMode null scanMode");
          GMTrace.o(6071204708352L, 45234);
          return;
        }
        localObject1 = this.ouB;
        if (localObject1 == null)
        {
          GMTrace.o(6071204708352L, 45234);
          return;
        }
        this.ouZ.c(this.ouC);
        this.ouB.kTG = this.ouC;
        this.ouZ.d(this.ouB.kTE);
        localObject1 = this.ouB;
        localObject2 = this.ouZ.s(true, sG());
        i = this.ova;
        ((com.tencent.mm.plugin.scanner.util.h)localObject1).kTJ = false;
        ((com.tencent.mm.plugin.scanner.util.h)localObject1).oAR = null;
        ((com.tencent.mm.plugin.scanner.util.h)localObject1).oAQ = new Rect();
        if ((!((com.tencent.mm.plugin.scanner.util.h)localObject1).kTH) || (((com.tencent.mm.plugin.scanner.util.h)localObject1).oAP)) {
          break label1605;
        }
        w.i("MicroMsg.scanner.ScanCamera", ", needRotate = " + ((com.tencent.mm.plugin.scanner.util.h)localObject1).kTH + " needLandscape = " + ((com.tencent.mm.plugin.scanner.util.h)localObject1).oAP);
        ((com.tencent.mm.plugin.scanner.util.h)localObject1).oAQ.top = (((Rect)localObject2).left * ((com.tencent.mm.plugin.scanner.util.h)localObject1).kTE.y / ((com.tencent.mm.plugin.scanner.util.h)localObject1).kTG.x);
        ((com.tencent.mm.plugin.scanner.util.h)localObject1).oAQ.bottom = (((Rect)localObject2).right * ((com.tencent.mm.plugin.scanner.util.h)localObject1).kTE.y / ((com.tencent.mm.plugin.scanner.util.h)localObject1).kTG.x);
        ((com.tencent.mm.plugin.scanner.util.h)localObject1).oAQ.left = (((Rect)localObject2).top * ((com.tencent.mm.plugin.scanner.util.h)localObject1).kTE.x / ((com.tencent.mm.plugin.scanner.util.h)localObject1).kTG.y);
        ((com.tencent.mm.plugin.scanner.util.h)localObject1).oAQ.right = (((Rect)localObject2).bottom * ((com.tencent.mm.plugin.scanner.util.h)localObject1).kTE.x / ((com.tencent.mm.plugin.scanner.util.h)localObject1).kTG.y);
        if (((com.tencent.mm.plugin.scanner.util.h)localObject1).oAQ.bottom > ((com.tencent.mm.plugin.scanner.util.h)localObject1).kTE.y) {
          ((com.tencent.mm.plugin.scanner.util.h)localObject1).oAQ.bottom = ((com.tencent.mm.plugin.scanner.util.h)localObject1).kTE.y;
        }
        if (((com.tencent.mm.plugin.scanner.util.h)localObject1).oAQ.right <= ((com.tencent.mm.plugin.scanner.util.h)localObject1).kTE.x) {
          break label2309;
        }
        ((com.tencent.mm.plugin.scanner.util.h)localObject1).oAQ.right = ((com.tencent.mm.plugin.scanner.util.h)localObject1).kTE.x;
      }
      catch (Exception localException)
      {
        Object localObject1;
        w.printErrStackTrace("MicroMsg.scanner.BaseScanUI", localException, "", new Object[0]);
        GMTrace.o(6071204708352L, 45234);
        return;
      }
      if ((((com.tencent.mm.plugin.scanner.util.h)localObject1).kTH) && (!((com.tencent.mm.plugin.scanner.util.h)localObject1).oAP))
      {
        if (((com.tencent.mm.plugin.scanner.util.h)localObject1).oAQ.height() / 1.586F < ((com.tencent.mm.plugin.scanner.util.h)localObject1).oAQ.width())
        {
          i = (int)(((com.tencent.mm.plugin.scanner.util.h)localObject1).oAQ.height() / 1.586F);
          ((com.tencent.mm.plugin.scanner.util.h)localObject1).oAQ.left = ((((com.tencent.mm.plugin.scanner.util.h)localObject1).oAQ.left + ((com.tencent.mm.plugin.scanner.util.h)localObject1).oAQ.right) / 2 - i / 2);
          ((com.tencent.mm.plugin.scanner.util.h)localObject1).oAQ.right = (i + ((com.tencent.mm.plugin.scanner.util.h)localObject1).oAQ.left);
          w.d("MicroMsg.scanner.ScanCamera", "scanDisplayRect.left: %d, scanDisplayRect.top: %d, scanDisplayRect.right: %d, scanDisplayRect.bottom: %d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.scanner.util.h)localObject1).oAQ.left), Integer.valueOf(((com.tencent.mm.plugin.scanner.util.h)localObject1).oAQ.top), Integer.valueOf(((com.tencent.mm.plugin.scanner.util.h)localObject1).oAQ.right), Integer.valueOf(((com.tencent.mm.plugin.scanner.util.h)localObject1).oAQ.bottom) });
          ((com.tencent.mm.plugin.scanner.util.h)localObject1).j((Rect)localObject2);
          ((com.tencent.mm.plugin.scanner.util.h)localObject1).kTJ = true;
          localObject1 = ((com.tencent.mm.plugin.scanner.util.h)localObject1).oAQ;
          w.d("MicroMsg.scanner.BaseScanUI", "CameraScreenHeightRate() = [%s], CameraScreenWidthRate() = [%s], rect = [%s]", new Object[] { Float.valueOf(this.ouB.bdt()), Float.valueOf(this.ouB.bds()), localObject1 });
          if (sG()) {
            break label2026;
          }
          w.d("MicroMsg.scanner.BaseScanUI", "portrait needRotate:" + this.ouB.kTH);
          if (this.ouB.kTH)
          {
            this.ouK = ((int)(((Rect)localObject1).height() * this.ouB.bds()));
            this.ouL = ((int)(((Rect)localObject1).width() * this.ouB.bdt()));
            localObject2 = new FrameLayout.LayoutParams(this.ouK, this.ouL, 3);
            if ((!this.ouB.kTH) || (sG())) {
              break label2094;
            }
            ((FrameLayout.LayoutParams)localObject2).leftMargin = ((int)(((Rect)localObject1).top * this.ouB.bds()));
            ((FrameLayout.LayoutParams)localObject2).topMargin = ((int)(((Rect)localObject1).left * this.ouB.bdt()));
            w.d("MicroMsg.scanner.BaseScanUI", "mask : leftMargin=[%s], topMargin=[%s], width=[%s], height=[%s], needRotate=[%s]", new Object[] { Integer.valueOf(((FrameLayout.LayoutParams)localObject2).leftMargin), Integer.valueOf(((FrameLayout.LayoutParams)localObject2).topMargin), Integer.valueOf(this.ouK), Integer.valueOf(this.ouL), Boolean.valueOf(this.ouB.kTH) });
            if ((1 != this.ova) && (4 != this.ova) && (8 != this.ova)) {
              break label2133;
            }
            i = BackwardSupportUtil.b.a(this, 20.0F);
            localObject1 = new Rect(((FrameLayout.LayoutParams)localObject2).leftMargin + i, ((FrameLayout.LayoutParams)localObject2).topMargin + i, ((FrameLayout.LayoutParams)localObject2).leftMargin + this.ouK - i, ((FrameLayout.LayoutParams)localObject2).topMargin + this.ouL - i - i);
            if (this.ouC.x - ((Rect)localObject1).right < ((Rect)localObject1).left)
            {
              w.w("MicroMsg.scanner.BaseScanUI", "this is a special device");
              if (this.ouC.x - ((Rect)localObject1).left > ((Rect)localObject1).left) {
                ((Rect)localObject1).right = (this.ouC.x - ((Rect)localObject1).left);
              }
            }
            this.ouK = ((Rect)localObject1).width();
            if (this.ouE == null) {
              break label2170;
            }
            localObject2 = this.ouE.oxu;
            this.ouE.bdb();
            this.ouE = new ScanMaskView(this, (Rect)localObject2);
            localObject2 = new FrameLayout.LayoutParams(-1, -1);
            this.ouE.setLayoutParams((ViewGroup.LayoutParams)localObject2);
            this.ouA.removeAllViews();
            View.inflate(this, this.ouZ.bcz(), this.ouA);
            this.ouZ.co(this.ouA.getChildAt(0));
            this.ouA.addView(this.ouE, 0, (ViewGroup.LayoutParams)localObject2);
            localObject2 = this.ouE;
            if ((((Rect)localObject1).left != ((ScanMaskView)localObject2).oxu.left) || (((Rect)localObject1).right != ((ScanMaskView)localObject2).oxu.right) || (((Rect)localObject1).top != ((ScanMaskView)localObject2).oxu.top) || (((Rect)localObject1).bottom != ((ScanMaskView)localObject2).oxu.bottom))
            {
              ((ScanMaskView)localObject2).oxB = (((Rect)localObject1).left - ((ScanMaskView)localObject2).oxu.left);
              ((ScanMaskView)localObject2).oxC = (((Rect)localObject1).right - ((ScanMaskView)localObject2).oxu.right);
              ((ScanMaskView)localObject2).oxD = (((Rect)localObject1).top - ((ScanMaskView)localObject2).oxu.top);
              ((ScanMaskView)localObject2).oxE = (((Rect)localObject1).bottom - ((ScanMaskView)localObject2).oxu.bottom);
              ((ScanMaskView)localObject2).oxz = new Rect(((ScanMaskView)localObject2).oxu.left, ((ScanMaskView)localObject2).oxu.top, ((ScanMaskView)localObject2).oxu.right, ((ScanMaskView)localObject2).oxu.bottom);
              ((ScanMaskView)localObject2).oxy = true;
              ((ScanMaskView)localObject2).oxG = new ValueAnimator();
              ((ScanMaskView)localObject2).oxG.setFloatValues(new float[] { 0.0F, 1.0F });
              ((ScanMaskView)localObject2).oxG.setDuration(200L);
              ((ScanMaskView)localObject2).oxG.addUpdateListener(new ScanMaskView.1((ScanMaskView)localObject2));
              ((ScanMaskView)localObject2).oxG.start();
            }
            this.ouZ.h((Rect)localObject1);
            this.ouE.setBackgroundColor(0);
            w.d("MicroMsg.scanner.BaseScanUI", "newRect = %s", new Object[] { localObject1 });
            if (!this.ouO) {
              break label2186;
            }
            this.ouM = ((Rect)localObject1).top;
            this.ouN = (((Rect)localObject1).bottom - BackwardSupportUtil.b.a(this, 8.0F));
            this.ouP = ((Rect)localObject1);
            if (this.ouF != null)
            {
              localObject1 = (FrameLayout.LayoutParams)this.ouF.getLayoutParams();
              if (this.ova != 3) {
                break label2218;
              }
              ((FrameLayout.LayoutParams)localObject1).topMargin = (this.ouD.getTop() - com.tencent.mm.br.a.fromDPToPix(this, 70));
              w.k("MicroMsg.scanner.BaseScanUI", "initFlashSwitcher, scanMaskRect: %s, scanLineStart: %s, scanLineEnd: %s", new Object[] { this.ouP, Integer.valueOf(this.ouM), Integer.valueOf(this.ouN) });
              this.ouF.setLayoutParams((ViewGroup.LayoutParams)localObject1);
              this.ouF.setOnClickListener(new View.OnClickListener()
              {
                public final void onClick(View paramAnonymousView)
                {
                  GMTrace.i(18482318016512L, 137704);
                  if (BaseScanUI.f(BaseScanUI.this) != null)
                  {
                    com.tencent.mm.plugin.scanner.a.l.oto.tv(2);
                    if (!BaseScanUI.f(BaseScanUI.this).mYm)
                    {
                      paramAnonymousView = BaseScanUI.f(BaseScanUI.this);
                      w.i("MicroMsg.scanner.ScanCamera", "openFlash, camera: %s, isPreviewing: %s", new Object[] { paramAnonymousView.fPj, Boolean.valueOf(paramAnonymousView.kTD) });
                      if ((paramAnonymousView.fPj != null) && (paramAnonymousView.kTD)) {}
                      try
                      {
                        paramAnonymousView.mYm = true;
                        Camera.Parameters localParameters = paramAnonymousView.fPj.getParameters();
                        if ((!bg.cc(localParameters.getSupportedFlashModes())) && (localParameters.getSupportedFlashModes().contains("torch")))
                        {
                          localParameters.setFlashMode("torch");
                          paramAnonymousView.fPj.setParameters(localParameters);
                          w.i("MicroMsg.scanner.ScanCamera", "open flash");
                        }
                        for (;;)
                        {
                          paramAnonymousView = BaseScanUI.g(BaseScanUI.this);
                          w.i("MicroMsg.ScannerFlashSwitcher", "openFlashStatus");
                          paramAnonymousView.oze.setImageResource(R.k.cOB);
                          GMTrace.o(18482318016512L, 137704);
                          return;
                          w.i("MicroMsg.scanner.ScanCamera", "camera not support flash!!");
                        }
                      }
                      catch (Exception paramAnonymousView)
                      {
                        for (;;)
                        {
                          w.printErrStackTrace("MicroMsg.scanner.ScanCamera", paramAnonymousView, "openFlash error: %s", new Object[] { paramAnonymousView.getMessage() });
                        }
                      }
                    }
                    BaseScanUI.f(BaseScanUI.this).aPb();
                    BaseScanUI.g(BaseScanUI.this).bdj();
                  }
                  GMTrace.o(18482318016512L, 137704);
                }
              });
              if ((this.ouB == null) || (!this.ouB.mYm)) {
                break label2247;
              }
              this.ouF.setVisibility(0);
            }
            if ((this.ouT) && (!this.ouI)) {
              break label2259;
            }
            c(true, 350L);
            if ((this.ouB != null) && (this.ouB.kTD))
            {
              dl(0L);
              dk(0L);
            }
            if ((this.ouQ == null) || (this.ouR == null)) {
              break label2299;
            }
            this.ouQ.setVisibility(8);
            this.ouR.setVisibility(8);
            GMTrace.o(6071204708352L, 45234);
            return;
            label1605:
            localException.oAQ.left = (((Rect)localObject2).left * localException.kTE.x / localException.kTG.x);
            localException.oAQ.right = (((Rect)localObject2).right * localException.kTE.x / localException.kTG.x);
            localException.oAQ.top = (((Rect)localObject2).top * localException.kTE.y / localException.kTG.y);
            localException.oAQ.bottom = (((Rect)localObject2).bottom * localException.kTE.y / localException.kTG.y);
            if (localException.oAQ.bottom > localException.kTE.y) {
              localException.oAQ.bottom = localException.kTE.y;
            }
            if (localException.oAQ.right <= localException.kTE.x) {
              break label2309;
            }
            localException.oAQ.right = localException.kTE.x;
            break label2309;
          }
        }
        else
        {
          i = (int)(localException.oAQ.width() * 1.586F);
          localException.oAQ.top = ((localException.oAQ.top + localException.oAQ.bottom) / 2 - i / 2);
          localException.oAQ.bottom = (i + localException.oAQ.top);
          continue;
        }
      }
      else
      {
        if (localException.oAQ.width() * 1.0D / localException.oAQ.height() < 1.5859999656677246D)
        {
          i = (int)(localException.oAQ.width() / 1.586F);
          localException.oAQ.top = ((localException.oAQ.top + localException.oAQ.bottom) / 2 - i / 2);
          localException.oAQ.bottom = (i + localException.oAQ.top);
          continue;
        }
        i = (int)(localException.oAQ.height() * 1.586F);
        localException.oAQ.left = ((localException.oAQ.left + localException.oAQ.right) / 2 - i / 2);
        localException.oAQ.right = (i + localException.oAQ.left);
        continue;
      }
      this.ouK = ((int)(localException.width() * this.ouB.bds()));
      this.ouL = ((int)(localException.height() * this.ouB.bdt()));
      continue;
      label2026:
      w.d("MicroMsg.scanner.BaseScanUI", "landscape needRotate:" + this.ouB.kTH);
      this.ouK = ((int)(localException.width() * this.ouB.bds()));
      this.ouL = ((int)(localException.height() * this.ouB.bdt()));
      continue;
      label2094:
      ((FrameLayout.LayoutParams)localObject2).leftMargin = ((int)(localException.left * this.ouB.bds()));
      ((FrameLayout.LayoutParams)localObject2).topMargin = ((int)(localException.top * this.ouB.bdt()));
      continue;
      label2133:
      Rect localRect = new Rect(((FrameLayout.LayoutParams)localObject2).leftMargin, ((FrameLayout.LayoutParams)localObject2).topMargin, ((FrameLayout.LayoutParams)localObject2).leftMargin + this.ouK, ((FrameLayout.LayoutParams)localObject2).topMargin + this.ouL);
      continue;
      label2170:
      this.ouE = new ScanMaskView(this, localRect);
      continue;
      label2186:
      this.ouM = localRect.left;
      this.ouN = (localRect.right - BackwardSupportUtil.b.a(this, 8.0F));
      this.ouP = localRect;
      continue;
      label2218:
      localRect.topMargin = (this.ouP.top + (this.ouP.height() - com.tencent.mm.br.a.fromDPToPix(this, 70)));
      continue;
      label2247:
      this.ouF.setVisibility(8);
      continue;
      label2259:
      if ((this.ouQ != null) && (this.ouR != null))
      {
        this.ouQ.setText(R.l.dVy);
        this.ouR.setVisibility(0);
        this.ouQ.setVisibility(0);
      }
      label2299:
      GMTrace.o(6071204708352L, 45234);
      return;
      label2309:
      if (7 != i) {
        if (11 != i) {}
      }
    }
  }
  
  public final void bcN()
  {
    GMTrace.i(6071741579264L, 45238);
    if ((this.ouB == null) || (!this.oux) || (this.ouw == null))
    {
      GMTrace.o(6071741579264L, 45238);
      return;
    }
    try
    {
      this.ouB.c(this.ouw);
      dk(50L);
      dl(0L);
      c(false, 150L);
      GMTrace.o(6071741579264L, 45238);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.scanner.BaseScanUI", "in setPreviewState");
        w.printErrStackTrace("MicroMsg.scanner.BaseScanUI", localException, "", new Object[0]);
      }
    }
  }
  
  public final void bcO()
  {
    GMTrace.i(6072681103360L, 45245);
    Intent localIntent = new Intent();
    localIntent.putExtra("preview_ui_title", R.l.dVP);
    com.tencent.mm.pluginsdk.ui.tools.k.a(this, 4660, localIntent);
    GMTrace.o(6072681103360L, 45245);
  }
  
  public final boolean bcP()
  {
    GMTrace.i(6073217974272L, 45249);
    if (this.ouB == null)
    {
      w.d("MicroMsg.scanner.BaseScanUI", "scanCamera == null, cameraNeedRotate return false");
      GMTrace.o(6073217974272L, 45249);
      return false;
    }
    boolean bool = this.ouB.kTH;
    GMTrace.o(6073217974272L, 45249);
    return bool;
  }
  
  public final void bcQ()
  {
    GMTrace.i(6073352192000L, 45250);
    bcS();
    GMTrace.o(6073352192000L, 45250);
  }
  
  public final void bcR()
  {
    GMTrace.i(6073486409728L, 45251);
    super.finish();
    GMTrace.o(6073486409728L, 45251);
  }
  
  public final void dk(long paramLong)
  {
    GMTrace.i(6072010014720L, 45240);
    w.i("MicroMsg.scanner.BaseScanUI", "takeOneShotDelay: %s", new Object[] { Long.valueOf(paramLong) });
    this.ovj.removeMessages(0);
    if (!this.ouH)
    {
      this.ovj.sendEmptyMessageDelayed(0, paramLong);
      GMTrace.o(6072010014720L, 45240);
      return;
    }
    w.w("MicroMsg.scanner.BaseScanUI", "takeOneShotDelay() scanPause");
    GMTrace.o(6072010014720L, 45240);
  }
  
  public final void dl(long paramLong)
  {
    GMTrace.i(6072144232448L, 45241);
    w.i("MicroMsg.scanner.BaseScanUI", "autoFocusDelay: %s", new Object[] { Long.valueOf(paramLong) });
    this.ovn.removeMessages(0);
    if (paramLong == 0L)
    {
      this.ovn.sendEmptyMessageDelayed(0, 100L);
      this.ovo = System.currentTimeMillis();
      GMTrace.o(6072144232448L, 45241);
      return;
    }
    if (System.currentTimeMillis() - this.ovo < this.ous)
    {
      w.d("MicroMsg.scanner.BaseScanUI", "autoFocusDelay sendEmptyMessageDelayed [%s]", new Object[] { Long.valueOf(this.ous - (System.currentTimeMillis() - this.ovo)) });
      this.ovn.sendEmptyMessageDelayed(0, this.ous - (System.currentTimeMillis() - this.ovo));
      GMTrace.o(6072144232448L, 45241);
      return;
    }
    w.d("MicroMsg.scanner.BaseScanUI", "autoFocusDelay sendEmptyMessageDelayed [%s].", new Object[] { Long.valueOf(paramLong) });
    this.ovn.sendEmptyMessageDelayed(0, paramLong);
    this.ovo = System.currentTimeMillis();
    GMTrace.o(6072144232448L, 45241);
  }
  
  public final void gZ(boolean paramBoolean)
  {
    GMTrace.i(6072949538816L, 45247);
    this.ouH = paramBoolean;
    if (paramBoolean)
    {
      bcG();
      if (this.ouR != null)
      {
        this.ouR.setVisibility(0);
        GMTrace.o(6072949538816L, 45247);
      }
    }
    else
    {
      i(0L, false);
      c(false, 0L);
      if (this.ouR != null) {
        this.ouR.setVisibility(8);
      }
    }
    GMTrace.o(6072949538816L, 45247);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6068923006976L, 45217);
    if (!sG())
    {
      w.d("MicroMsg.scanner.BaseScanUI", "getLayoutId PORTRAIT");
      i = R.i.cFa;
      GMTrace.o(6068923006976L, 45217);
      return i;
    }
    w.d("MicroMsg.scanner.BaseScanUI", "getLayoutId LANDSCAPE");
    int i = R.i.cFb;
    GMTrace.o(6068923006976L, 45217);
    return i;
  }
  
  public final void i(long paramLong, boolean paramBoolean)
  {
    GMTrace.i(6071607361536L, 45237);
    w.i("MicroMsg.scanner.BaseScanUI", "startAutoFocusAndTakeShot, autoFocusInterval: %s, setInterval: %s", new Object[] { Long.valueOf(paramLong), Boolean.valueOf(paramBoolean) });
    if ((paramBoolean) && (paramLong > 0L)) {
      this.ous = paramLong;
    }
    if ((!this.ouH) && (this.ouB != null) && (this.ouB.kTD))
    {
      dk(50L);
      if (paramLong == 0L)
      {
        dl(30L);
        GMTrace.o(6071607361536L, 45237);
        return;
      }
      dl(this.ous);
    }
    GMTrace.o(6071607361536L, 45237);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6072815321088L, 45246);
    if (this.ouJ != null) {
      this.ouJ.b(this, paramInt1, paramInt2, paramIntent);
    }
    GMTrace.o(6072815321088L, 45246);
  }
  
  public void onAutoFocus(boolean paramBoolean, Camera paramCamera)
  {
    GMTrace.i(6072412667904L, 45243);
    w.i("MicroMsg.scanner.BaseScanUI", "onAutoFocus, success: %s, camera: %s", new Object[] { Boolean.valueOf(paramBoolean), paramCamera });
    this.mGp[4] = ((int)(System.currentTimeMillis() - this.ove));
    if (this.ouH)
    {
      GMTrace.o(6072412667904L, 45243);
      return;
    }
    if (this.ouZ == null)
    {
      GMTrace.o(6072412667904L, 45243);
      return;
    }
    if ((this.ova != 3) && (this.ova != 2) && (this.ouB != null) && (this.ouB.kTD))
    {
      if ((this.ouB != null) && (this.oux)) {
        this.ouB.a(this);
      }
      dl(this.ous);
    }
    GMTrace.o(6072412667904L, 45243);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6069191442432L, 45219);
    this.ova = getIntent().getIntExtra("BaseScanUI_select_scan_mode", 1);
    super.onCreate(paramBundle);
    com.tencent.mm.ui.p.eJ(this);
    getWindow().addFlags(2097280);
    if ((at.wS().DN() == 6) || (at.wS().DN() == 4)) {
      this.ouI = true;
    }
    for (;;)
    {
      if ((7 == this.ova) || (11 == this.ova)) {
        this.ouT = false;
      }
      com.tencent.mm.sdk.b.a.vgX.b(this.ovl);
      com.tencent.mm.sdk.b.a.vgX.b(this.ovm);
      MP();
      paramBundle = ScanCameraLightDetector.oAX;
      try
      {
        paramBundle.oBc = com.tencent.mm.sdk.f.e.SV("ScanCameraLightDetector_detectThread");
        paramBundle.oBc.start();
        paramBundle.handler = new ScanCameraLightDetector.1(paramBundle, paramBundle.oBc.getLooper());
        w.i("MicroMsg.ScanCameraLightDetector", "start, sensorManager: %s, lightSensor: %s, isRegister: %s", new Object[] { paramBundle.gXR, paramBundle.oAZ, Boolean.valueOf(paramBundle.oBa) });
        GMTrace.o(6069191442432L, 45219);
        return;
        this.ouI = false;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.ScanCameraLightDetector", localException, "start error: %s", new Object[] { localException.getMessage() });
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6070265184256L, 45227);
    w.i("MicroMsg.scanner.BaseScanUI", "onDestroy()");
    if (this.ouE != null) {
      this.ouE.bdb();
    }
    if (this.ouv != null) {
      this.ouv.setSurfaceTextureListener(null);
    }
    com.tencent.mm.sdk.b.a.vgX.c(this.ovl);
    com.tencent.mm.sdk.b.a.vgX.c(this.ovm);
    ScanCameraLightDetector localScanCameraLightDetector = ScanCameraLightDetector.oAX;
    w.i("MicroMsg.ScanCameraLightDetector", "stop, isRegister: %s, sensorManager: %s, lightSensor: %s", new Object[] { Boolean.valueOf(localScanCameraLightDetector.oBa), localScanCameraLightDetector.gXR, localScanCameraLightDetector.oAZ });
    try
    {
      localScanCameraLightDetector.oAY = -1L;
      if (localScanCameraLightDetector.oBc != null) {
        localScanCameraLightDetector.oBc.quit();
      }
      super.onDestroy();
      GMTrace.o(6070265184256L, 45227);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.ScanCameraLightDetector", localException, "stop error: %s", new Object[] { localException.getMessage() });
      }
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6069594095616L, 45222);
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
    {
      w.d("MicroMsg.scanner.BaseScanUI", "keyCode KEYCODE_BACK");
      this.ouH = true;
      bcS();
      overridePendingTransition(0, 0);
      GMTrace.o(6069594095616L, 45222);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(6069594095616L, 45222);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(6070130966528L, 45226);
    w.i("MicroMsg.scanner.BaseScanUI", "onPause(), scanMode: %s, mQBarStringHandler: %s", new Object[] { this.ouZ, this.ouW });
    this.ouH = true;
    if (this.ouZ != null)
    {
      this.ouZ.onPause();
      if (this.ouZ.bcy() != null) {
        this.ouZ.bcy().releaseDecoder();
      }
    }
    bcJ();
    if (this.ouF != null)
    {
      this.ouF.bdj();
      this.ouF.hide();
    }
    if ((this.wakeLock != null) && (this.wakeLock.isHeld()))
    {
      this.wakeLock.release();
      this.wakeLock = null;
    }
    sendBroadcast(new Intent("com.tencent.mm.ui.ACTION_DEACTIVE").putExtra("classname", getClass().getName()), "com.tencent.mm.permission.MM_MESSAGE");
    if (this.ouT) {
      at.b(this.ovf);
    }
    if (this.ouW != null) {
      this.ouW.onPause();
    }
    int i;
    if ((this.ova == 1) || (this.ova == 8) || (this.ova == 4))
    {
      com.tencent.mm.plugin.scanner.a.l.oto.aIS();
      i = (int)(System.currentTimeMillis() - this.ovd);
      w.i("MicroMsg.scanner.BaseScanUI", "scan cost time:" + i);
      if (!com.tencent.mm.plugin.scanner.a.l.oto.otq) {
        break label380;
      }
      this.mGp[0] = 1;
    }
    for (;;)
    {
      this.mGp[1] = i;
      this.mGp[2] = 0;
      this.mGp[3] = com.tencent.mm.plugin.scanner.a.l.oto.otr;
      g.ork.i(14176, new Object[] { Integer.valueOf(this.mGp[0]), Integer.valueOf(this.mGp[1]), Integer.valueOf(this.mGp[2]), Integer.valueOf(this.mGp[3]), Integer.valueOf(this.mGp[4]) });
      super.onPause();
      GMTrace.o(6070130966528L, 45226);
      return;
      label380:
      this.mGp[0] = 0;
    }
  }
  
  public void onPreviewFrame(byte[] paramArrayOfByte, Camera paramCamera)
  {
    GMTrace.i(6072278450176L, 45242);
    if (paramArrayOfByte == null) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.scanner.BaseScanUI", "onPreviewFrame, data==null: %s, camera: %s", new Object[] { Boolean.valueOf(bool), paramCamera });
      if ((!this.ouH) && (this.ouZ != null) && (this.ouZ.bcy() != null) && (this.ouZ.s(false, sG()) != null)) {
        break;
      }
      w.w("MicroMsg.scanner.BaseScanUI", "onPreviewFrame error state, scanPause = [%s]", new Object[] { Boolean.valueOf(this.ouH) });
      GMTrace.o(6072278450176L, 45242);
      return;
    }
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
    {
      if (paramArrayOfByte == null) {}
      for (bool = true;; bool = false)
      {
        w.e("MicroMsg.scanner.BaseScanUI", "onPreviewFrame, wrong data, data is null [%s]", new Object[] { Boolean.valueOf(bool) });
        bcK();
        GMTrace.o(6072278450176L, 45242);
        return;
      }
    }
    if (this.ouB == null)
    {
      w.e("MicroMsg.scanner.BaseScanUI", "onPreviewFrame, scanCamera == null, finish this activity");
      GMTrace.o(6072278450176L, 45242);
      return;
    }
    int i;
    label245:
    int j;
    Object localObject1;
    Object localObject2;
    if (this.ouB != null)
    {
      paramCamera = this.ouB;
      if (paramCamera.oAS < 0)
      {
        if (!paramCamera.bdw()) {
          break label984;
        }
        i = 1;
        paramCamera.oAS = i;
      }
      if (paramCamera.oAS != 1) {
        break label989;
      }
      i = 1;
      if ((i != 0) && (!this.ouB.mYm) && (this.ouI))
      {
        paramCamera = ScanCameraLightDetector.oAX;
        i = this.ouB.kTE.x;
        j = this.ouB.kTE.y;
        if ((paramCamera.oAY < 0L) || ((bg.aI(paramCamera.oAY) >= 1000L) && (paramCamera.handler != null) && (paramCamera.oBc != null) && (paramCamera.oBc.isAlive())))
        {
          localObject1 = new ScanCameraLightDetector.a(paramCamera);
          ((ScanCameraLightDetector.a)localObject1).mZR = paramArrayOfByte;
          ((ScanCameraLightDetector.a)localObject1).width = i;
          ((ScanCameraLightDetector.a)localObject1).height = j;
          localObject2 = Message.obtain();
          ((Message)localObject2).what = 233;
          ((Message)localObject2).obj = localObject1;
          paramCamera.handler.sendMessage((Message)localObject2);
          paramCamera.oAY = bg.Pw();
        }
      }
    }
    Rect localRect;
    if ((!this.ouZ.isPause()) && (!this.ouH))
    {
      paramCamera = this.ouZ.bcy();
      localObject1 = this.ouB.kTE;
      i = this.ouB.kTI;
      localObject2 = this.ouB;
      localRect = this.ouZ.hc(sG());
      j = this.ova;
      if (((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW == null)
      {
        ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTJ = false;
        ((com.tencent.mm.plugin.scanner.util.h)localObject2).oAR = null;
        ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW = new Rect();
        if ((!((com.tencent.mm.plugin.scanner.util.h)localObject2).kTH) || (((com.tencent.mm.plugin.scanner.util.h)localObject2).oAP)) {
          break label994;
        }
        w.i("MicroMsg.scanner.ScanCamera", ", needRotate = " + ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTH + " needLandscape = " + ((com.tencent.mm.plugin.scanner.util.h)localObject2).oAP);
        ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.top = (localRect.left * ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTE.y / ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTG.x);
        ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.bottom = (localRect.right * ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTE.y / ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTG.x);
        ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.left = (localRect.top * ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTE.x / ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTG.y);
        ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.right = (localRect.bottom * ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTE.x / ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTG.y);
        if (((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.bottom > ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTE.y) {
          ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.bottom = ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTE.y;
        }
        if (((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.right > ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTE.x) {
          ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.right = ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTE.x;
        }
        label756:
        if ((7 == j) || (11 == j))
        {
          if ((!((com.tencent.mm.plugin.scanner.util.h)localObject2).kTH) || (((com.tencent.mm.plugin.scanner.util.h)localObject2).oAP)) {
            break label1261;
          }
          if (((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.height() / 1.586F >= ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.width()) {
            break label1191;
          }
          j = (int)(((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.height() / 1.586F);
          ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.left = ((((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.left + ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.right) / 2 - j / 2);
          ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.right = (j + ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.left);
        }
      }
    }
    for (;;)
    {
      w.d("MicroMsg.scanner.ScanCamera", "scanRect.left: %d, scanRect.top: %d, scanRect.right: %d, scanRect.bottom: %d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.left), Integer.valueOf(((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.top), Integer.valueOf(((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.right), Integer.valueOf(((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.bottom) });
      ((com.tencent.mm.plugin.scanner.util.h)localObject2).j(localRect);
      ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTJ = true;
      paramCamera.a(paramArrayOfByte, (Point)localObject1, i, ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW);
      GMTrace.o(6072278450176L, 45242);
      return;
      label984:
      i = 0;
      break;
      label989:
      i = 0;
      break label245;
      label994:
      ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.left = (localRect.left * ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTE.x / ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTG.x);
      ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.right = (localRect.right * ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTE.x / ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTG.x);
      ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.top = (localRect.top * ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTE.y / ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTG.y);
      ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.bottom = (localRect.bottom * ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTE.y / ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTG.y);
      if (((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.bottom > ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTE.y) {
        ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.bottom = ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTE.y;
      }
      if (((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.right <= ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTE.x) {
        break label756;
      }
      ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.right = ((com.tencent.mm.plugin.scanner.util.h)localObject2).kTE.x;
      break label756;
      label1191:
      j = (int)(((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.width() * 1.586F);
      ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.top = ((((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.top + ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.bottom) / 2 - j / 2);
      ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.bottom = (j + ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.top);
      continue;
      label1261:
      if (((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.width() * 1.0D / ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.height() < 1.5859999656677246D)
      {
        j = (int)(((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.width() / 1.586F);
        ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.top = ((((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.top + ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.bottom) / 2 - j / 2);
        ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.bottom = (j + ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.top);
      }
      else
      {
        j = (int)(((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.height() * 1.586F);
        ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.left = ((((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.left + ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.right) / 2 - j / 2);
        ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.right = (j + ((com.tencent.mm.plugin.scanner.util.h)localObject2).kNW.left);
      }
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(6069996748800L, 45225);
    w.i("MicroMsg.scanner.BaseScanUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(6069996748800L, 45225);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        aZQ();
        GMTrace.o(6069996748800L, 45225);
        return;
      }
      this.oaK = false;
      com.tencent.mm.ui.base.h.a(this, getString(R.l.dNn), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6137239830528L, 45726);
          BaseScanUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          BaseScanUI.j(BaseScanUI.this);
          BaseScanUI.this.finish();
          GMTrace.o(6137239830528L, 45726);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6095229681664L, 45413);
          BaseScanUI.j(BaseScanUI.this);
          BaseScanUI.this.finish();
          GMTrace.o(6095229681664L, 45413);
        }
      });
      GMTrace.o(6069996748800L, 45225);
      return;
      if (paramArrayOfInt[0] != 0) {
        com.tencent.mm.ui.base.h.a(this, getString(R.l.dNq), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(6153077522432L, 45844);
            BaseScanUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
            GMTrace.o(6153077522432L, 45844);
          }
        }, null);
      }
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(6069728313344L, 45223);
    super.onResume();
    if (!this.ovb)
    {
      Intent localIntent = new Intent();
      localIntent.setComponent(new ComponentName(e.g.vGK, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
      localIntent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
      sendBroadcast(localIntent);
      this.ovb = true;
    }
    if (this.oaK)
    {
      boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.CAMERA", 16, null, null);
      w.i("MicroMsg.scanner.BaseScanUI", "summerper checkPermission checkCamera[%b]", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
      {
        GMTrace.o(6069728313344L, 45223);
        return;
      }
      aZQ();
    }
    this.ovc = false;
    if ((!this.ouH) && ((this.ova == 1) || (this.ova == 8) || (this.ova == 4)))
    {
      com.tencent.mm.plugin.scanner.a.l.oto.reset();
      com.tencent.mm.plugin.scanner.a.l.oto.tu(com.tencent.mm.plugin.scanner.a.l.otl);
    }
    GMTrace.o(6069728313344L, 45223);
  }
  
  public void onStart()
  {
    GMTrace.i(6071338926080L, 45235);
    super.onStart();
    bcM();
    GMTrace.o(6071338926080L, 45235);
  }
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    GMTrace.i(6074023280640L, 45255);
    w.d("MicroMsg.scanner.BaseScanUI", "onSurfaceTextureAvailable");
    this.ouv.cau();
    this.ouw = paramSurfaceTexture;
    this.ouU = true;
    if (this.ouV) {
      bcI();
    }
    GMTrace.o(6074023280640L, 45255);
  }
  
  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    GMTrace.i(6074291716096L, 45257);
    w.d("MicroMsg.scanner.BaseScanUI", "onSurfaceTextureDestroyed");
    this.oux = false;
    this.ouU = false;
    GMTrace.o(6074291716096L, 45257);
    return false;
  }
  
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    GMTrace.i(6074157498368L, 45256);
    w.d("MicroMsg.scanner.BaseScanUI", "onSurfaceTextureSizeChanged");
    this.ouw = paramSurfaceTexture;
    GMTrace.o(6074157498368L, 45256);
  }
  
  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    GMTrace.i(6074425933824L, 45258);
    GMTrace.o(6074425933824L, 45258);
  }
  
  public final void tw(int paramInt)
  {
    GMTrace.i(6071875796992L, 45239);
    this.ovi.removeMessages(0);
    this.ovi.sendEmptyMessageDelayed(paramInt, 50L);
    GMTrace.o(6071875796992L, 45239);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\BaseScanUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */