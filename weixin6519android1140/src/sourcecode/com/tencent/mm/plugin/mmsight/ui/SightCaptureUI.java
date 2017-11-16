package com.tencent.mm.plugin.mmsight.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.l;
import com.tencent.mm.g.a.ln;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.mmsight.SightParams;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.mmsight.model.a.d.a;
import com.tencent.mm.plugin.mmsight.model.a.d.c;
import com.tencent.mm.plugin.mmsight.model.c;
import com.tencent.mm.plugin.mmsight.model.c.a;
import com.tencent.mm.plugin.mmsight.model.e.a;
import com.tencent.mm.plugin.mmsight.model.e.b;
import com.tencent.mm.plugin.mmsight.model.e.c;
import com.tencent.mm.plugin.mmsight.model.i;
import com.tencent.mm.plugin.mmsight.model.o;
import com.tencent.mm.plugin.mmsight.ui.cameraglview.MMSightCameraGLSurfaceView;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.u.a.d;
import com.tencent.mm.plugin.u.a.e;
import com.tencent.mm.plugin.u.a.f;
import com.tencent.mm.plugin.video.ObservableTextureView;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.pluginsdk.ui.tools.f.e;
import com.tencent.mm.protocal.c.anf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ad;
import org.json.JSONObject;

@com.tencent.mm.ui.base.a(3)
public class SightCaptureUI
  extends MMActivity
  implements d.a, c.a
{
  private com.tencent.mm.compatible.util.b hez;
  private com.tencent.mm.plugin.mmsight.model.a.d hwO;
  private ObservableTextureView hxG;
  private int idN;
  private boolean idO;
  private long idP;
  private com.tencent.mm.remoteservice.d kSj;
  private View mCP;
  private int mWO;
  private VideoTransPara mWP;
  private SightParams naR;
  private VideoSeekBarEditorView ndA;
  private f.a ndF;
  private VideoPlayerTextureView ndz;
  private MMSightCameraGLSurfaceView niA;
  private com.tencent.mm.plugin.mmsight.ui.cameraglview.a niB;
  private TextView niC;
  private MMSightCaptureTouchView niD;
  private View niE;
  private a niF;
  private boolean niG;
  private anf niH;
  private byte[] niI;
  private int niJ;
  private int niK;
  private int niL;
  private int niM;
  private byte[] niN;
  private int niO;
  private c niP;
  private boolean niQ;
  private boolean niR;
  private boolean niS;
  private int niT;
  private int niU;
  private Thread niV;
  private long niW;
  private boolean niX;
  private boolean niY;
  private Runnable niZ;
  private int nil;
  private boolean nim;
  private com.tencent.mm.plugin.mmsight.model.e nin;
  private ViewGroup nio;
  private MMSightRecordButton nip;
  private View niq;
  private View nir;
  private ViewGroup nis;
  private ViewGroup nit;
  private ImageView niu;
  private ImageView niv;
  private SurfaceTexture niw;
  CameraFrontSightView nix;
  private ViewGroup niy;
  private ImageView niz;
  private String nja;
  private String njb;
  private boolean njc;
  private Bundle njd;
  private Runnable nje;
  
  public SightCaptureUI()
  {
    GMTrace.i(7408415932416L, 55197);
    this.nil = 1;
    this.mWO = 2;
    this.nim = true;
    this.idN = -1;
    this.niG = true;
    this.niH = new anf();
    this.kSj = new com.tencent.mm.remoteservice.d(ab.getContext());
    this.niQ = false;
    this.niR = false;
    this.niS = false;
    this.niT = 0;
    this.idO = false;
    this.niU = 0;
    this.niV = null;
    this.niW = -1L;
    this.idP = -1L;
    this.niX = false;
    this.niY = false;
    this.niZ = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7420092874752L, 55284);
        if ((SightCaptureUI.e(SightCaptureUI.this) == 7) && (SightCaptureUI.i(SightCaptureUI.this) != null))
        {
          w.i("MicroMsg.SightCaptureUI", "showRecoderProgressBar");
          MMSightRecordButton localMMSightRecordButton = SightCaptureUI.i(SightCaptureUI.this);
          w.i("MicroMsg.MMSightRecordButton", "showProgressBar");
          localMMSightRecordButton.nhc.setVisibility(0);
        }
        GMTrace.o(7420092874752L, 55284);
      }
    };
    this.nje = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20149973286912L, 150129);
        if (SightCaptureUI.e(SightCaptureUI.this) != 4)
        {
          w.e("MicroMsg.SightCaptureUI", "checkPreviewStatusRunnable, not previewing now!!!");
          SightCaptureUI.g(SightCaptureUI.this, 9);
        }
        GMTrace.o(20149973286912L, 150129);
      }
    };
    this.ndF = new f.a()
    {
      public final void Xq()
      {
        GMTrace.i(20168092680192L, 150264);
        if (SightCaptureUI.R(SightCaptureUI.this) != null)
        {
          SightCaptureUI.R(SightCaptureUI.this).start();
          SightCaptureUI.R(SightCaptureUI.this);
        }
        af.F(SightCaptureUI.L(SightCaptureUI.this));
        SightCaptureUI.R(SightCaptureUI.this).tHp = new f.e()
        {
          public final void aQG()
          {
            GMTrace.i(20156013084672L, 150174);
            af.i(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(20170642817024L, 150283);
                w.i("MicroMsg.SightCaptureUI", "onTextureUpdate");
                if (SightCaptureUI.R(SightCaptureUI.this) == null)
                {
                  GMTrace.o(20170642817024L, 150283);
                  return;
                }
                SightCaptureUI.R(SightCaptureUI.this).setAlpha(1.0F);
                SightCaptureUI.g(SightCaptureUI.this, 4);
                SightCaptureUI.F(SightCaptureUI.this);
                GMTrace.o(20170642817024L, 150283);
              }
            }, 50L);
            SightCaptureUI.Q(SightCaptureUI.this).setVisibility(0);
            GMTrace.o(20156013084672L, 150174);
          }
        };
        GMTrace.o(20168092680192L, 150264);
      }
      
      public final int bM(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(20168361115648L, 150266);
        GMTrace.o(20168361115648L, 150266);
        return 0;
      }
      
      public final void bs(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(20168495333376L, 150267);
        GMTrace.o(20168495333376L, 150267);
      }
      
      public final void onCompletion()
      {
        GMTrace.i(20168226897920L, 150265);
        SightCaptureUI.R(SightCaptureUI.this).c(0.0D, true);
        GMTrace.o(20168226897920L, 150265);
      }
      
      public final void onError(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(20167958462464L, 150263);
        w.e("MicroMsg.SightCaptureUI", "%d on error what %d extra %d", new Object[] { Integer.valueOf(SightCaptureUI.this.hashCode()), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        GMTrace.o(20167958462464L, 150263);
      }
    };
    GMTrace.o(7408415932416L, 55197);
  }
  
  private int aQA()
  {
    GMTrace.i(7409489674240L, 55205);
    w.i("MicroMsg.SightCaptureUI", "startRecordImpl");
    int i = this.hwO.b(this.nin.getOrientation(), this.niP.aOU(), this.niP.getOrientation());
    w.i("MicroMsg.SightCaptureUI", "startRecordImpl ret: %d", new Object[] { Integer.valueOf(i) });
    if (i >= 0) {
      this.nin.a(e.a.mYH);
    }
    GMTrace.o(7409489674240L, 55205);
    return i;
  }
  
  private void aQB()
  {
    GMTrace.i(7409623891968L, 55206);
    this.niY = true;
    updateState(8);
    if (this.hwO != null) {
      try
      {
        this.hwO.cancel();
        this.hwO = null;
        GMTrace.o(7409623891968L, 55206);
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.SightCaptureUI", localException, "", new Object[0]);
      }
    }
    GMTrace.o(7409623891968L, 55206);
  }
  
  private void aQC()
  {
    GMTrace.i(7409758109696L, 55207);
    com.tencent.mm.plugin.mmsight.model.a.k.aPI();
    if (!com.tencent.mm.plugin.mmsight.model.a.k.aPL())
    {
      GMTrace.o(7409758109696L, 55207);
      return;
    }
    TextView localTextView = (TextView)findViewById(a.d.nkW);
    localTextView.setVisibility(8);
    localTextView.setText("");
    GMTrace.o(7409758109696L, 55207);
  }
  
  private void aQD()
  {
    GMTrace.i(7409892327424L, 55208);
    com.tencent.mm.plugin.mmsight.model.a.k.aPI();
    if (!com.tencent.mm.plugin.mmsight.model.a.k.aPL())
    {
      GMTrace.o(7409892327424L, 55208);
      return;
    }
    w.i("MicroMsg.SightCaptureUI", "test for debug " + bg.bQW().toString());
    i.w(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7407610626048L, 55191);
        SightCaptureUI.M(SightCaptureUI.this);
        GMTrace.o(7407610626048L, 55191);
      }
    });
    GMTrace.o(7409892327424L, 55208);
  }
  
  private void aQE()
  {
    GMTrace.i(7410160762880L, 55210);
    if (this.hxG != null) {
      this.hxG.a(null);
    }
    if (this.nin != null)
    {
      this.niG = this.nin.mYE;
      this.nin.aOV();
      this.niW = -1L;
      this.idP = -1L;
    }
    GMTrace.o(7410160762880L, 55210);
  }
  
  private boolean aQF()
  {
    GMTrace.i(7411234504704L, 55218);
    if ((this.idN == 4) || (this.idN == 3) || (this.idN == 1) || (this.idN == 8) || (this.idN == 9))
    {
      GMTrace.o(7411234504704L, 55218);
      return true;
    }
    GMTrace.o(7411234504704L, 55218);
    return false;
  }
  
  private void aQz()
  {
    GMTrace.i(7409221238784L, 55203);
    updateState(0);
    this.niU = 0;
    this.idO = false;
    this.niY = false;
    if (this.ndz != null)
    {
      this.ndz.stop();
      this.ndz.oTm = null;
    }
    try
    {
      ViewGroup.LayoutParams localLayoutParams = this.ndz.getLayoutParams();
      this.nis.removeView(this.ndz);
      this.nis.addView(this.ndz, 0, localLayoutParams);
      if (this.niF != null)
      {
        this.niF.release();
        this.niF = null;
      }
      this.niz.setImageBitmap(null);
      aQE();
      this.nin = new com.tencent.mm.plugin.mmsight.model.e(this.mWP, this.naR.scene);
      this.nin.a(this.niB.njD);
      if (!this.nin.h(this, this.niG))
      {
        updateState(8);
        GMTrace.o(7409221238784L, 55203);
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.SightCaptureUI", "clearVideoPlayViewContent, error: %s", new Object[] { localException.getMessage() });
      }
    }
    if (this.hxG.isAvailable())
    {
      this.niw = this.hxG.getSurfaceTexture();
      w.i("MicroMsg.SightCaptureUI", "surface already available, directly set local surface: %s", new Object[] { this.niw });
      if (ge(false)) {
        updateState(1);
      }
    }
    for (;;)
    {
      if ((this.niC != null) && (this.nim))
      {
        this.niC.setAlpha(1.0F);
        this.niC.setVisibility(0);
      }
      c localc = this.niP;
      w.i("MicroMsg.DeviceOrientationListener", "reset");
      localc.mXO = -1;
      localc.orientation = -1;
      localc.mXN = -1;
      this.niQ = false;
      this.niR = false;
      GMTrace.o(7409221238784L, 55203);
      return;
      updateState(8);
      continue;
      this.hxG.a(new com.tencent.mm.plugin.video.b()
      {
        public final void a(SurfaceTexture paramAnonymousSurfaceTexture)
        {
          GMTrace.i(7408281714688L, 55196);
          w.i("MicroMsg.SightCaptureUI", "callback onSurfaceTextureAvailable set local surface: %s", new Object[] { paramAnonymousSurfaceTexture });
          SightCaptureUI.a(SightCaptureUI.this, paramAnonymousSurfaceTexture);
          if (SightCaptureUI.I(SightCaptureUI.this))
          {
            SightCaptureUI.g(SightCaptureUI.this, 1);
            GMTrace.o(7408281714688L, 55196);
            return;
          }
          SightCaptureUI.g(SightCaptureUI.this, 8);
          GMTrace.o(7408281714688L, 55196);
        }
      });
    }
  }
  
  private String ai(String paramString, boolean paramBoolean)
  {
    GMTrace.i(7410026545152L, 55209);
    boolean bool1 = CaptureMMProxy.getInstance().getBoolean(w.a.vwi, true);
    boolean bool2 = CaptureMMProxy.getInstance().getBoolean(w.a.vwj, true);
    if (paramBoolean) {}
    for (String str = com.tencent.mm.plugin.mmsight.d.nd("jpg");; str = com.tencent.mm.plugin.mmsight.d.nd("mp4"))
    {
      if (((bool1) && (paramBoolean)) || ((bool2) && (!paramBoolean)))
      {
        w.i("MicroMsg.SightCaptureUI", "auto save src %s dest %s state %s %s", new Object[] { paramString, str, Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        FileOp.o(paramString, str);
        com.tencent.mm.platformtools.d.b(str, this);
      }
      GMTrace.o(7410026545152L, 55209);
      return str;
    }
  }
  
  private boolean ge(boolean paramBoolean)
  {
    GMTrace.i(7409355456512L, 55204);
    w.j("MicroMsg.SightCaptureUI", "createRecorder, surface: %s", new Object[] { this.niw });
    this.niY = false;
    if (this.hwO != null)
    {
      if (this.nin != null) {
        this.nin.b(this.hwO.aPw());
      }
      this.hwO.cancel();
    }
    if (this.nin == null)
    {
      GMTrace.o(7409355456512L, 55204);
      return false;
    }
    this.niH = new anf();
    this.niH.uBZ = true;
    this.niH.uBY = com.tencent.mm.plugin.mmsight.model.j.mZc.mZp;
    if (!paramBoolean)
    {
      if (this.nin.a(this.niw, true) < 0)
      {
        GMTrace.o(7409355456512L, 55204);
        return false;
      }
    }
    else
    {
      paramBoolean = this.nin.a(this, this.niw, true);
      this.niG = this.nin.mYE;
      if (!paramBoolean)
      {
        GMTrace.o(7409355456512L, 55204);
        return false;
      }
    }
    if (this.nin.mYg == null)
    {
      GMTrace.o(7409355456512L, 55204);
      return false;
    }
    com.tencent.mm.plugin.mmsight.model.a.k.aPI();
    this.hwO = com.tencent.mm.plugin.mmsight.model.a.k.c(this.mWP);
    if (this.hwO == null)
    {
      w.e("MicroMsg.SightCaptureUI", "create mediaRecorder error");
      this.niY = true;
      GMTrace.o(7409355456512L, 55204);
      return false;
    }
    com.tencent.mm.plugin.mmsight.d.a(this.hwO, this.naR);
    this.hwO.a(this);
    this.nin.a(this.hwO.aPw());
    if (this.niB != null) {
      this.niB.I(this.nin.getPreviewWidth(), this.nin.getPreviewHeight(), this.nin.getOrientation());
    }
    this.hwO.k(this.nin.getPreviewWidth(), this.nin.getPreviewHeight(), this.nin.mYg.x, this.nin.mYg.y);
    paramBoolean = this.hwO.qJ(this.nin.getOrientation());
    w.i("MicroMsg.SightCaptureUI", "preInit result: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (!paramBoolean) {
      this.niY = true;
    }
    GMTrace.o(7409355456512L, 55204);
    return paramBoolean;
  }
  
  private void gf(boolean paramBoolean)
  {
    GMTrace.i(7410966069248L, 55216);
    w.i("MicroMsg.SightCaptureUI", "[clearPhotoEditCache] isDelete:%s mLastEditPhotoPath:%s mRawEditPhotoPath:%s", new Object[] { Boolean.valueOf(paramBoolean), this.njb, this.nja });
    if ((!bg.nm(this.njb)) && (paramBoolean)) {
      FileOp.deleteFile(this.njb);
    }
    if (!bg.nm(this.nja)) {
      FileOp.deleteFile(this.nja);
    }
    this.njb = null;
    this.nja = null;
    ln localln = new ln();
    localln.ePV.eCx = 0;
    com.tencent.mm.sdk.b.a.vgX.m(localln);
    GMTrace.o(7410966069248L, 55216);
  }
  
  private void pL()
  {
    GMTrace.i(7409087021056L, 55202);
    w.k("MicroMsg.SightCaptureUI", "stopRecord, currentStatus: %s", new Object[] { Integer.valueOf(this.idN) });
    if (this.idN == 2)
    {
      updateState(7);
      this.nip.gc(false);
      final int i = this.nin.getPreviewWidth();
      final int j = this.nin.getPreviewHeight();
      this.hwO.x(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7387209531392L, 55039);
          w.k("MicroMsg.SightCaptureUI", "call stop callback now, currentStatus: %s", new Object[] { SightCaptureUI.qX(SightCaptureUI.e(SightCaptureUI.this)) });
          SightCaptureUI.h(SightCaptureUI.this).a(e.a.mYI);
          SightCaptureUI.A(SightCaptureUI.this);
          final long l = com.tencent.mm.plugin.mmsight.d.CI("TIME_RECODER_2_PLAY");
          com.tencent.mm.sdk.f.e.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(7419556003840L, 55280);
              String str = SightCaptureUI.n(SightCaptureUI.this).getFilePath();
              for (;;)
              {
                try
                {
                  if (!bg.nm(str))
                  {
                    boolean bool = FileOp.aZ(str);
                    if (bool) {
                      continue;
                    }
                  }
                }
                catch (Exception localException)
                {
                  int n;
                  com.tencent.mm.plugin.mmsight.model.a locala;
                  com.tencent.mm.plugin.sight.base.a locala1;
                  w.e("MicroMsg.MMSightRecorderIDKeyStat", "markAfterCaptureFinish error: %s", new Object[] { localException.getMessage() });
                  continue;
                  int i = 0;
                  continue;
                  i = 0;
                  continue;
                  g.ork.a(440L, 88L, 1L, false);
                  g.ork.a(440L, 48L, n, false);
                  int j = 90;
                  int k = 54;
                  i = 50;
                  continue;
                  if (!com.tencent.mm.plugin.mmsight.model.j.mZc.aPl()) {
                    continue;
                  }
                  j += 2;
                  k += 12;
                  int m = i + 12;
                  i = k;
                  k = m;
                  continue;
                  if ((n <= 10) || (n > 15)) {
                    continue;
                  }
                  g.ork.a(440L, k + 1, 1L, false);
                  continue;
                  if ((n <= 15) || (n > 20)) {
                    continue;
                  }
                  g.ork.a(440L, k + 2, 1L, false);
                  continue;
                  if ((n <= 20) || (n > 30)) {
                    continue;
                  }
                  g.ork.a(440L, k + 3, 1L, false);
                  continue;
                  m = i;
                  i = k;
                  k = m;
                  continue;
                }
                com.tencent.mm.plugin.mmsight.model.k.b(false, l);
                GMTrace.o(7419556003840L, 55280);
                return;
                g.ork.a(440L, 87L, 1L, false);
                n = (int)new JSONObject(SightVideoJNI.getSimpleMp4Info(str)).getDouble("videoFPS");
                w.i("MicroMsg.MMSightRecorderIDKeyStat", "markAfterCaptureFinish, videoFPS: %s", new Object[] { Integer.valueOf(n) });
                locala = com.tencent.mm.plugin.mmsight.model.a.aOR();
                locala.mXz = com.tencent.mm.plugin.mmsight.model.j.mZc.fQQ;
                locala.videoBitrate = com.tencent.mm.plugin.mmsight.model.j.mZc.videoBitrate;
                if (!com.tencent.mm.plugin.mmsight.model.j.mZc.mZm) {
                  continue;
                }
                i = 1;
                locala.fQR = i;
                if (!com.tencent.mm.plugin.mmsight.model.j.mZc.mZn) {
                  continue;
                }
                i = 1;
                locala.mXA = i;
                locala.mXB = com.tencent.mm.plugin.mmsight.model.j.mZc.mXB;
                locala.mXC = n;
                locala.fileSize = FileOp.kX(str);
                locala1 = com.tencent.mm.plugin.sight.base.d.GB(str);
                if (locala1 != null)
                {
                  locala.mXF = locala1.width;
                  locala.mXG = locala1.height;
                  locala.mXH = locala1.videoBitrate;
                  locala.mXD = locala1.ljb;
                }
                if (com.tencent.mm.plugin.mmsight.model.j.mZc.fQQ != 1) {
                  continue;
                }
                g.ork.a(440L, 89L, 1L, false);
                g.ork.a(440L, 49L, n, false);
                j = 93;
                k = 73;
                i = 69;
                if (com.tencent.mm.plugin.mmsight.model.j.mZc.mXB != 720) {
                  continue;
                }
                j += 1;
                m = k + 6;
                k = i + 6;
                i = m;
                g.ork.a(440L, i, n, false);
                g.ork.a(440L, j, 1L, false);
                g.ork.a(440L, 47L, n, false);
                w.i("MicroMsg.MMSightRecorderIDKeyStat", "markAfterCaptureFinish, filePath: %s base %d", new Object[] { str, Integer.valueOf(k) });
                if ((n < 0) || (n > 10)) {
                  continue;
                }
                g.ork.a(440L, k, 1L, false);
              }
            }
          }, "BigSightFFMpegRecorder_markAfterCaptureFinish_idkeystat");
          w.v("MicroMsg.TestCaptureUiEvent", "doStopRecorderAndStartPreviewDone %s", new Object[] { bg.bQW().toString() });
          w.i("MicroMsg.SightCaptureUI", "stop finish, filepath: %s %s time_takevideo %s", new Object[] { SightCaptureUI.n(SightCaptureUI.this).getFilePath(), Long.valueOf(FileOp.kX(SightCaptureUI.n(SightCaptureUI.this).getFilePath())), Long.valueOf(l) });
          SightCaptureUI.z(SightCaptureUI.this);
          SightCaptureUI.J(SightCaptureUI.this);
          SightCaptureUI.K(SightCaptureUI.this);
          af.i(SightCaptureUI.L(SightCaptureUI.this), 1000L);
          if ((SightCaptureUI.a(SightCaptureUI.this).scene == 1) || (SightCaptureUI.a(SightCaptureUI.this).scene == 2)) {
            g.ork.i(13819, new Object[] { Integer.valueOf(2), Integer.valueOf(SightCaptureUI.a(SightCaptureUI.this).scene) });
          }
          GMTrace.o(7387209531392L, 55039);
        }
      });
    }
    GMTrace.o(7409087021056L, 55202);
  }
  
  private static String qW(int paramInt)
  {
    GMTrace.i(7410697633792L, 55214);
    if (paramInt == -1)
    {
      GMTrace.o(7410697633792L, 55214);
      return "CAPTURE_STATE_BINGDING";
    }
    if (paramInt == 0)
    {
      GMTrace.o(7410697633792L, 55214);
      return "CAPTURE_STATE_INIT";
    }
    if (paramInt == 1)
    {
      GMTrace.o(7410697633792L, 55214);
      return "CAPTURE_STATE_CAPTURING";
    }
    if (paramInt == 2)
    {
      GMTrace.o(7410697633792L, 55214);
      return "CAPTURE_STATE_RECORDING";
    }
    if (paramInt == 3)
    {
      GMTrace.o(7410697633792L, 55214);
      return "CAPTURE_STATE_PREVIEW_PICTURE";
    }
    if (paramInt == 4)
    {
      GMTrace.o(7410697633792L, 55214);
      return "CAPTURE_STATE_PREVIEW_VIDEO";
    }
    if (paramInt == 6)
    {
      GMTrace.o(7410697633792L, 55214);
      return "CAPTURE_STATE_SUPERMAN";
    }
    if (paramInt == 7)
    {
      GMTrace.o(7410697633792L, 55214);
      return "CAPTURE_STATE_WAIT_TO_PREVIEW";
    }
    if (paramInt == 8)
    {
      GMTrace.o(7410697633792L, 55214);
      return "CAPTURE_STATE_INIT_ERROR";
    }
    if (paramInt == 9)
    {
      GMTrace.o(7410697633792L, 55214);
      return "CAPTURE_STATE_STOP_ERROR";
    }
    GMTrace.o(7410697633792L, 55214);
    return "UNKNOW";
  }
  
  private void updateState(int paramInt)
  {
    GMTrace.i(7410831851520L, 55215);
    w.i("MicroMsg.SightCaptureUI", "pre state %s %s update state %s %s", new Object[] { Integer.valueOf(this.idN), qW(this.idN), Integer.valueOf(paramInt), qW(paramInt) });
    w.i("MicroMsg.TestCaptureUiEvent", "pre state %s %s update state %s %s %s", new Object[] { Integer.valueOf(this.idN), qW(this.idN), Integer.valueOf(paramInt), qW(paramInt), bg.bQW().toString() });
    if (paramInt == this.idN)
    {
      GMTrace.o(7410831851520L, 55215);
      return;
    }
    com.tencent.mm.plugin.mmsight.d.CH("TIME_RECODER_2_PLAY");
    this.idN = paramInt;
    if (this.idN != 7) {
      af.F(this.niZ);
    }
    if (this.idN == 0)
    {
      this.nis.setVisibility(8);
      this.niv.setVisibility(8);
      this.nit.setVisibility(8);
      this.niz.setVisibility(8);
      this.niy.setVisibility(0);
      if (this.niT > 1) {
        this.niu.setVisibility(0);
      }
      if (this.nin != null) {
        this.nin.a(e.a.mYG);
      }
      com.tencent.mm.plugin.mmsight.model.a.reset();
      if (this.niV == null) {
        break label1146;
      }
      try
      {
        this.niV.interrupt();
        this.niV = null;
        GMTrace.o(7410831851520L, 55215);
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.SightCaptureUI", localException, "update to state init, interrupt failed: %s", new Object[] { localException.getMessage() });
        }
      }
    }
    Object localObject;
    if ((this.idN == 1) || (this.idN == 2))
    {
      this.nis.setVisibility(0);
      this.niv.setVisibility(8);
      this.nit.setVisibility(0);
      this.nit.setClipChildren(false);
      this.niq.setVisibility(8);
      this.mCP.setVisibility(8);
      this.nir.setVisibility(0);
      this.nip.setVisibility(0);
      this.ndz.setVisibility(8);
      if (this.idN == 1) {
        this.nip.reset();
      }
      for (;;)
      {
        this.niE.setVisibility(8);
        this.niz.setVisibility(8);
        this.niD.setVisibility(0);
        if (this.niT > 1) {
          this.niu.setVisibility(0);
        }
        this.niD.bringToFront();
        this.niu.bringToFront();
        aQC();
        aQD();
        GMTrace.o(7410831851520L, 55215);
        return;
        this.nip.gc(true);
        localObject = this.nip;
        w.i("MicroMsg.MMSightRecordButton", "hideProgressBar");
        ((MMSightRecordButton)localObject).nhc.setVisibility(8);
      }
    }
    if ((this.idN == 4) || (this.idN == 3))
    {
      this.nis.setVisibility(0);
      this.nit.setVisibility(8);
      this.nit.setClipChildren(false);
      this.niq.setVisibility(0);
      this.mCP.setVisibility(0);
      this.nir.setVisibility(8);
      this.nip.setVisibility(8);
      if (this.idN == 3)
      {
        this.niv.setVisibility(0);
        this.niz.setVisibility(0);
        this.ndz.setVisibility(8);
      }
      for (;;)
      {
        this.niD.setVisibility(8);
        GMTrace.o(7410831851520L, 55215);
        return;
        this.niz.setVisibility(8);
        this.ndz.setVisibility(0);
        this.ndz.bNq();
        localObject = this.ndz.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).width = -1;
        ((ViewGroup.LayoutParams)localObject).height = -1;
        this.ndz.setLayoutParams((ViewGroup.LayoutParams)localObject);
        if (this.hwO.aOU()) {
          this.niB.aQI();
        }
        this.niy.setVisibility(8);
      }
    }
    if (this.idN == 6)
    {
      this.niq.setVisibility(8);
      this.mCP.setVisibility(8);
      this.niv.setVisibility(8);
      this.nir.setVisibility(8);
      this.nip.setVisibility(8);
      GMTrace.o(7410831851520L, 55215);
      return;
    }
    if (this.idN == 7)
    {
      this.niq.setVisibility(8);
      this.mCP.setVisibility(8);
      this.nir.setVisibility(8);
      this.niu.setVisibility(8);
      this.niv.setVisibility(8);
      this.nip.gc(false);
      af.i(this.niZ, 1500L);
      this.nip.aQq();
      GMTrace.o(7410831851520L, 55215);
      return;
    }
    if (this.idN == 8)
    {
      this.nis.setVisibility(0);
      this.nit.setVisibility(0);
      this.nit.setClipChildren(false);
      this.niq.setVisibility(8);
      this.mCP.setVisibility(8);
      this.niv.setVisibility(8);
      this.nir.setVisibility(0);
      if (this.niT > 1) {
        this.niu.setVisibility(0);
      }
      this.nip.setVisibility(0);
      this.niD.setVisibility(0);
      this.ndz.setVisibility(8);
      this.niE.setVisibility(8);
      this.niz.setVisibility(8);
      if (this.niY) {
        Toast.makeText(this, a.f.nlh, 1).show();
      }
      for (;;)
      {
        this.nip.gc(false);
        this.nip.setEnabled(false);
        GMTrace.o(7410831851520L, 55215);
        return;
        Toast.makeText(this, a.f.hGW, 1).show();
      }
    }
    if (this.idN == 9)
    {
      this.niq.setVisibility(8);
      this.mCP.setVisibility(8);
      this.niv.setVisibility(8);
      this.nir.setVisibility(0);
      this.niu.setVisibility(8);
      this.nip.reset();
      this.nip.gc(false);
      this.nip.setEnabled(false);
      Toast.makeText(this, a.f.nli, 1).show();
    }
    label1146:
    GMTrace.o(7410831851520L, 55215);
  }
  
  protected final int Qf()
  {
    GMTrace.i(7408952803328L, 55201);
    GMTrace.o(7408952803328L, 55201);
    return 1;
  }
  
  public final void Rv()
  {
    GMTrace.i(7411502940160L, 55220);
    w.i("MicroMsg.SightCaptureUI", "onError: %s", new Object[] { Integer.valueOf(1) });
    try
    {
      if (this.hwO != null) {
        this.hwO.reset();
      }
      updateState(9);
      GMTrace.o(7411502940160L, 55220);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.SightCaptureUI", "onError, reset mediaRecorder error: %s", new Object[] { localException.getMessage() });
      }
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7410429198336L, 55212);
    int i = a.e.nla;
    GMTrace.o(7410429198336L, 55212);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7410563416064L, 55213);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramIntent == null)
    {
      bool = true;
      w.i("MicroMsg.SightCaptureUI", "[onActivityResult] requestCode:%s  resultCode:%s data is null?:", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      switch (paramInt1)
      {
      }
    }
    do
    {
      GMTrace.o(7410563416064L, 55213);
      return;
      bool = false;
      break;
      w.i("MicroMsg.SightCaptureUI", "[handlePhotoEditResult] resultCode:%s", new Object[] { Integer.valueOf(paramInt2) });
    } while ((paramInt2 != -1) || (paramIntent == null) || (this.hwO == null));
    this.njc = true;
    this.njd = paramIntent.getBundleExtra("report_info");
    this.nja = paramIntent.getStringExtra("before_photo_edit");
    this.njb = paramIntent.getStringExtra("after_photo_edit");
    boolean bool = CaptureMMProxy.getInstance().getBoolean(w.a.vwi, true);
    w.i("MicroMsg.SightCaptureUI", "rawEditPhotoPath:%s lastEditPhotoPath:%s imageState:%s", new Object[] { this.nja, this.njb, Boolean.valueOf(bool) });
    if (!bool)
    {
      paramIntent = CaptureMMProxy.getInstance().getSubCoreImageFullPath("photoEdited_" + System.currentTimeMillis());
      w.i("MicroMsg.SightCaptureUI", "saveFullPath:%s", new Object[] { paramIntent });
      FileOp.o(this.njb, paramIntent);
      FileOp.deleteFile(this.njb);
      com.tencent.mm.platformtools.d.b(this.njb, this);
      this.hwO.CK(paramIntent);
      this.njb = paramIntent;
    }
    for (;;)
    {
      paramIntent = new BitmapFactory.Options();
      paramIntent.inJustDecodeBounds = true;
      BitmapFactory.decodeFile(this.njb, paramIntent);
      w.i("MicroMsg.SightCaptureUI", "rawW:%s rawH:%s", new Object[] { Integer.valueOf(paramIntent.outWidth), Integer.valueOf(paramIntent.outHeight) });
      paramIntent = com.tencent.mm.sdk.platformtools.d.a(this.njb, paramIntent.outHeight, paramIntent.outWidth, true, false, 0);
      this.niz.setVisibility(0);
      this.niz.setImageBitmap(paramIntent);
      break;
      this.hwO.CK(this.njb);
    }
  }
  
  public void onBackPressed()
  {
    GMTrace.i(7411100286976L, 55217);
    w.i("MicroMsg.SightCaptureUI", "onBackPressed %d", new Object[] { Integer.valueOf(this.idN) });
    if ((this.niF != null) && (this.niF.Yb()))
    {
      GMTrace.o(7411100286976L, 55217);
      return;
    }
    if (this.niF != null)
    {
      this.niF.release();
      this.niF = null;
      Bb(8);
      this.niq.setVisibility(0);
      this.mCP.setVisibility(0);
      this.niv.setVisibility(0);
      GMTrace.o(7411100286976L, 55217);
      return;
    }
    if (aQF())
    {
      super.onBackPressed();
      overridePendingTransition(-1, com.tencent.mm.plugin.u.a.a.nkp);
      gf(true);
    }
    GMTrace.o(7411100286976L, 55217);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7408550150144L, 55198);
    aq(1);
    super.onCreate(paramBundle);
    this.naR = ((SightParams)getIntent().getParcelableExtra("KEY_SIGHT_PARAMS"));
    if (this.naR == null)
    {
      w.e("MicroMsg.SightCaptureUI", "error!!!! sightParams is null!!");
      GMTrace.o(7408550150144L, 55198);
      return;
    }
    CaptureMMProxy.createProxy(new CaptureMMProxy(this.kSj));
    final long l = bg.Pw();
    this.kSj.C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7399289126912L, 55129);
        w.i("MicroMsg.SightCaptureUI", "connect cost %sms", new Object[] { Long.valueOf(bg.aI(l)) });
        com.tencent.mm.plugin.mmsight.model.j.b(SightCaptureUI.a(SightCaptureUI.this).mWP);
        SightCaptureUI.b(SightCaptureUI.this);
        GMTrace.o(7399289126912L, 55129);
      }
    });
    GMTrace.o(7408550150144L, 55198);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7410294980608L, 55211);
    super.onDestroy();
    w.i("MicroMsg.SightCaptureUI", "onDestroy");
    this.kSj.release();
    if (this.hwO != null) {
      this.hwO.x(null);
    }
    if (this.idN == -1) {}
    for (int i = 1;; i = 0)
    {
      if (i == 0)
      {
        aQE();
        if (this.ndz != null)
        {
          this.ndz.stop();
          this.ndz.oTm = null;
        }
        if (this.hez != null) {
          this.hez.tx();
        }
        if (this.niF != null)
        {
          this.niF.release();
          this.niF = null;
        }
      }
      if (this.niP != null)
      {
        this.niP.disable();
        this.niP = null;
      }
      com.tencent.mm.plugin.mmsight.model.a.j.naP.ye();
      GMTrace.o(7410294980608L, 55211);
      return;
    }
  }
  
  protected void onPause()
  {
    GMTrace.i(7408684367872L, 55199);
    super.onPause();
    w.i("MicroMsg.SightCaptureUI", "onPause, currentState: %s", new Object[] { qW(this.idN) });
    if (this.idN == 2)
    {
      pL();
      GMTrace.o(7408684367872L, 55199);
      return;
    }
    if (this.idN == 1)
    {
      aQE();
      GMTrace.o(7408684367872L, 55199);
      return;
    }
    if ((this.idN == 4) && (this.ndz != null)) {
      this.ndz.pause();
    }
    GMTrace.o(7408684367872L, 55199);
  }
  
  protected void onResume()
  {
    boolean bool2 = false;
    GMTrace.i(7408818585600L, 55200);
    super.onResume();
    Bb(8);
    String str = qW(this.idN);
    boolean bool1 = bool2;
    if (this.hxG != null)
    {
      bool1 = bool2;
      if (this.hxG.isAvailable()) {
        bool1 = true;
      }
    }
    w.i("MicroMsg.SightCaptureUI", "onResume, currentState: %s, textureview available: %s", new Object[] { str, Boolean.valueOf(bool1) });
    if ((this.idN == 2) || (this.idN == 1))
    {
      aQz();
      GMTrace.o(7408818585600L, 55200);
      return;
    }
    if (this.idN == 4)
    {
      if (this.hxG != null)
      {
        if (!this.hxG.isAvailable()) {
          break label163;
        }
        this.niB.aQI();
      }
      while (this.ndz != null)
      {
        this.ndz.start();
        GMTrace.o(7408818585600L, 55200);
        return;
        label163:
        this.hxG.a(new com.tencent.mm.plugin.video.b()
        {
          public final void a(SurfaceTexture paramAnonymousSurfaceTexture)
          {
            GMTrace.i(7400497086464L, 55138);
            SightCaptureUI.c(SightCaptureUI.this).aQI();
            SightCaptureUI.d(SightCaptureUI.this).a(null);
            GMTrace.o(7400497086464L, 55138);
          }
        });
      }
    }
    if (this.idN == 3)
    {
      if (this.hxG != null) {
        this.hxG.a(null);
      }
      this.niB.a(this.niN, this.niS, this.niO);
    }
    GMTrace.o(7408818585600L, 55200);
  }
  
  public final void qH(int paramInt)
  {
    GMTrace.i(7411368722432L, 55219);
    if (this.niT <= 1)
    {
      GMTrace.o(7411368722432L, 55219);
      return;
    }
    if (this.idN == 2)
    {
      GMTrace.o(7411368722432L, 55219);
      return;
    }
    w.i("MicroMsg.SightCaptureUI", "onOrientationChange: %s", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt < 0)
    {
      GMTrace.o(7411368722432L, 55219);
      return;
    }
    float f;
    if ((paramInt == 90) || (paramInt == 270)) {
      if (paramInt == 270) {
        f = 90.0F;
      }
    }
    while (this.niu.getRotation() == f)
    {
      GMTrace.o(7411368722432L, 55219);
      return;
      f = -90.0F;
      continue;
      f = paramInt;
    }
    this.niu.animate().rotation(f).setDuration(100L).start();
    GMTrace.o(7411368722432L, 55219);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\ui\SightCaptureUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */