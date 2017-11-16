package com.tencent.mm.plugin.mmsight.segment;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsfs.SFSContext.FileEntry;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.mmsight.model.a.j;
import com.tencent.mm.plugin.mmsight.segment.a.a.a;
import com.tencent.mm.plugin.mmsight.segment.a.a.b;
import com.tencent.mm.plugin.mmsight.segment.a.a.c;
import com.tencent.mm.plugin.mmsight.segment.a.a.d;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMTextureView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@com.tencent.mm.ui.base.a(3)
public class VideoSegmentUI
  extends MMActivity
{
  private String eIy;
  private int gVq;
  private ProgressDialog htG;
  private com.tencent.mm.remoteservice.d kSj;
  private RelativeLayout ljd;
  private Surface mSurface;
  private VideoTransPara mYw;
  private String ndC;
  private String nfM;
  private f nfN;
  private com.tencent.mm.plugin.mmsight.segment.a.c nfO;
  private boolean nfP;
  private c nfQ;
  private CountDownLatch nfR;
  private int nfS;
  private boolean nfT;
  private boolean nfU;
  private boolean nfV;
  private c.b nfW;
  private com.tencent.mm.plugin.mmsight.segment.a.c.a nfX;
  private a.d nfY;
  
  public VideoSegmentUI()
  {
    GMTrace.i(7486799085568L, 55781);
    this.nfM = null;
    this.nfP = false;
    this.nfR = new CountDownLatch(2);
    this.nfS = 10000;
    this.htG = null;
    this.kSj = new com.tencent.mm.remoteservice.d(this);
    this.ndC = "";
    this.nfT = false;
    this.nfU = false;
    this.nfV = false;
    this.nfW = new c.b()
    {
      public final void A(float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        GMTrace.i(7469887651840L, 55655);
        if ((paramAnonymousFloat2 - paramAnonymousFloat1) * VideoSegmentUI.e(VideoSegmentUI.this) <= VideoSegmentUI.p(VideoSegmentUI.this))
        {
          VideoSegmentUI.this.lf(true);
          GMTrace.o(7469887651840L, 55655);
          return;
        }
        VideoSegmentUI.this.lf(false);
        GMTrace.o(7469887651840L, 55655);
      }
      
      public final void aPZ()
      {
        GMTrace.i(7469619216384L, 55653);
        if (VideoSegmentUI.d(VideoSegmentUI.this) == null)
        {
          GMTrace.o(7469619216384L, 55653);
          return;
        }
        VideoSegmentUI.d(VideoSegmentUI.this).pause();
        GMTrace.o(7469619216384L, 55653);
      }
      
      public final void y(float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        GMTrace.i(7469484998656L, 55652);
        if (VideoSegmentUI.d(VideoSegmentUI.this) == null)
        {
          GMTrace.o(7469484998656L, 55652);
          return;
        }
        int i = VideoSegmentUI.e(VideoSegmentUI.this);
        VideoSegmentUI.d(VideoSegmentUI.this).setLoop((int)(i * paramAnonymousFloat1), (int)(i * paramAnonymousFloat2));
        VideoSegmentUI.d(VideoSegmentUI.this).seekTo((int)(i * paramAnonymousFloat1));
        GMTrace.o(7469484998656L, 55652);
      }
      
      public final void z(float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        GMTrace.i(7469753434112L, 55654);
        if (VideoSegmentUI.d(VideoSegmentUI.this) == null)
        {
          GMTrace.o(7469753434112L, 55654);
          return;
        }
        int i = (int)(VideoSegmentUI.e(VideoSegmentUI.this) * paramAnonymousFloat1);
        int j = (int)(VideoSegmentUI.e(VideoSegmentUI.this) * paramAnonymousFloat2);
        VideoSegmentUI.d(VideoSegmentUI.this).setLoop(i, j);
        VideoSegmentUI.d(VideoSegmentUI.this).seekTo(i);
        GMTrace.o(7469753434112L, 55654);
      }
    };
    this.nfX = new com.tencent.mm.plugin.mmsight.segment.a.c.a()
    {
      private Runnable nga;
      
      public final void qT(int paramAnonymousInt)
      {
        GMTrace.i(7421703487488L, 55296);
        if (VideoSegmentUI.j(VideoSegmentUI.this) == null)
        {
          GMTrace.o(7421703487488L, 55296);
          return;
        }
        if (this.nga != null) {
          ((View)VideoSegmentUI.j(VideoSegmentUI.this)).removeCallbacks(this.nga);
        }
        this.nga = new VideoSegmentUI.c(VideoSegmentUI.j(VideoSegmentUI.this), paramAnonymousInt, VideoSegmentUI.e(VideoSegmentUI.this));
        ((View)VideoSegmentUI.j(VideoSegmentUI.this)).post(this.nga);
        GMTrace.o(7421703487488L, 55296);
      }
    };
    this.nfY = new a.d()
    {
      public final void H(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(7430427639808L, 55361);
        if ((paramAnonymousInt1 <= 0) || (paramAnonymousInt2 <= 0))
        {
          w.e("MicroMsg.VideoSegmentUI", "VideoSegmentUI.onVideoSizeChanged wrong size (%d, %d) invoked = %b", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Boolean.valueOf(VideoSegmentUI.q(VideoSegmentUI.this)) });
          GMTrace.o(7430427639808L, 55361);
          return;
        }
        if (VideoSegmentUI.q(VideoSegmentUI.this))
        {
          w.e("MicroMsg.VideoSegmentUI", "VideoSegmentUI.onVideoSizeChanged surface has invoked");
          GMTrace.o(7430427639808L, 55361);
          return;
        }
        w.i("MicroMsg.VideoSegmentUI", "VideoSegmentUI.onVideoSizeChanged (%d, %d)", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        VideoSegmentUI.r(VideoSegmentUI.this);
        if ((paramAnonymousInt2 <= 0) || (paramAnonymousInt1 <= 0))
        {
          w.e("MicroMsg.VideoSegmentUI", "This video has wrong size (%dx%d)", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
          VideoSegmentUI.m(VideoSegmentUI.this);
          VideoSegmentUI.this.finish();
          VideoSegmentUI.b(VideoSegmentUI.this);
          GMTrace.o(7430427639808L, 55361);
          return;
        }
        VideoSegmentUI.a locala = new VideoSegmentUI.a(VideoSegmentUI.this, VideoSegmentUI.s(VideoSegmentUI.this), paramAnonymousInt2, paramAnonymousInt1, paramAnonymousInt3, new VideoSegmentUI.b(VideoSegmentUI.this));
        if ((VideoSegmentUI.s(VideoSegmentUI.this).getWidth() <= 0) || (VideoSegmentUI.s(VideoSegmentUI.this).getHeight() <= 0))
        {
          w.i("MicroMsg.VideoSegmentUI", "post init surface task after root measured.");
          VideoSegmentUI.s(VideoSegmentUI.this).post(locala);
          GMTrace.o(7430427639808L, 55361);
          return;
        }
        locala.run();
        GMTrace.o(7430427639808L, 55361);
      }
    };
    GMTrace.o(7486799085568L, 55781);
  }
  
  private void a(boolean paramBoolean, Surface paramSurface)
  {
    GMTrace.i(7487201738752L, 55784);
    if (this.nfO != null)
    {
      w.e("MicroMsg.VideoSegmentUI", "initSegmentPlayer not null, you can not init segmentPlayer");
      GMTrace.o(7487201738752L, 55784);
      return;
    }
    this.nfO = new com.tencent.mm.plugin.mmsight.segment.a.c();
    this.nfP = false;
    this.nfO.setDataSource(this.nfM);
    this.nfO.a(new a.a()
    {
      public final boolean cv(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(7432977776640L, 55380);
        w.e("MicroMsg.VideoSegmentUI", "MediaPlayer on error what = %d extra = %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        VideoSegmentUI.m(VideoSegmentUI.this);
        VideoSegmentUI.this.finish();
        VideoSegmentUI.b(VideoSegmentUI.this);
        GMTrace.o(7432977776640L, 55380);
        return true;
      }
    });
    if (paramBoolean) {
      this.nfO.a(this.nfY);
    }
    this.nfO.setAudioStreamType(3);
    this.nfO.setLooping(true);
    if (paramSurface != null) {
      this.nfO.setSurface(paramSurface);
    }
    this.nfO.nfX = this.nfX;
    this.nfO.a(new a.b()
    {
      public final void bf(Object paramAnonymousObject)
      {
        GMTrace.i(7491765141504L, 55818);
        w.i("MicroMsg.VideoSegmentUI", "MediaPlayer.onPrepared start %s", new Object[] { paramAnonymousObject });
        try
        {
          if (VideoSegmentUI.d(VideoSegmentUI.this) != null)
          {
            VideoSegmentUI.n(VideoSegmentUI.this);
            VideoSegmentUI.d(VideoSegmentUI.this).start();
          }
          GMTrace.o(7491765141504L, 55818);
          return;
        }
        catch (Exception paramAnonymousObject)
        {
          w.printErrStackTrace("MicroMsg.VideoSegmentUI", (Throwable)paramAnonymousObject, "hy: exception when onPrepared waiting for starting", new Object[0]);
          GMTrace.o(7491765141504L, 55818);
        }
      }
    });
    this.nfO.prepareAsync();
    this.nfO.a(new a.c()
    {
      public final void bg(Object paramAnonymousObject)
      {
        GMTrace.i(7443044106240L, 55455);
        try
        {
          if (VideoSegmentUI.d(VideoSegmentUI.this) != null) {
            VideoSegmentUI.d(VideoSegmentUI.this).start();
          }
          GMTrace.o(7443044106240L, 55455);
          return;
        }
        catch (Exception paramAnonymousObject)
        {
          w.printErrStackTrace("MicroMsg.VideoSegmentUI", (Throwable)paramAnonymousObject, "hy: exception when onSeekComplete waiting for starting", new Object[0]);
          GMTrace.o(7443044106240L, 55455);
        }
      }
    });
    GMTrace.o(7487201738752L, 55784);
  }
  
  protected final void MP()
  {
    GMTrace.i(7487067521024L, 55783);
    this.nfQ = ((c)findViewById(k.c.neq));
    this.ljd = ((RelativeLayout)findViewById(k.c.bZf));
    GMTrace.o(7487067521024L, 55783);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7487738609664L, 55788);
    int i = k.d.ner;
    GMTrace.o(7487738609664L, 55788);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7486933303296L, 55782);
    super.onCreate(paramBundle);
    getWindow().addFlags(128);
    CaptureMMProxy.createProxy(new CaptureMMProxy(this.kSj));
    this.kSj.C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7440225533952L, 55434);
        w.i("MicroMsg.VideoSegmentUI", "has connect");
        if (CaptureMMProxy.getInstance() != null) {
          p.dO(CaptureMMProxy.getInstance().getDeviceInfoConfig());
        }
        VideoSegmentUI.a(VideoSegmentUI.this);
        GMTrace.o(7440225533952L, 55434);
      }
    });
    GMTrace.o(7486933303296L, 55782);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7487604391936L, 55787);
    w.i("MicroMsg.VideoSegmentUI", "onDestroy");
    super.onDestroy();
    getWindow().clearFlags(128);
    this.kSj.release();
    if (this.nfQ != null) {
      this.nfQ.release();
    }
    if (this.nfO != null) {
      this.nfO.release();
    }
    if (this.mSurface != null) {
      this.mSurface.release();
    }
    if (this.nfN != null) {
      this.nfN.release();
    }
    j.naP.ye();
    GMTrace.o(7487604391936L, 55787);
  }
  
  protected void onPause()
  {
    GMTrace.i(7487470174208L, 55786);
    if (this.nfO != null)
    {
      w.i("MicroMsg.VideoSegmentUI", "onPause pause player");
      this.nfO.pause();
    }
    super.onPause();
    GMTrace.o(7487470174208L, 55786);
  }
  
  protected void onResume()
  {
    GMTrace.i(7487335956480L, 55785);
    if ((this.nfO != null) && (this.nfP))
    {
      w.i("MicroMsg.VideoSegmentUI", "onResume start player");
      this.nfO.start();
    }
    super.onResume();
    GMTrace.o(7487335956480L, 55785);
  }
  
  private final class a
    implements Runnable
  {
    private Context context;
    private ViewGroup ndy;
    public int nge;
    public int ngf;
    public int ngg;
    private VideoSegmentUI.b ngh;
    
    public a(ViewGroup paramViewGroup, int paramInt1, int paramInt2, int paramInt3, VideoSegmentUI.b paramb)
    {
      GMTrace.i(7485993779200L, 55775);
      this.nge = paramInt1;
      this.ngf = paramInt2;
      this.ngg = paramInt3;
      this.context = paramViewGroup.getContext();
      this.ndy = paramViewGroup;
      this.ngh = paramb;
      GMTrace.o(7485993779200L, 55775);
    }
    
    public final void run()
    {
      GMTrace.i(7486127996928L, 55776);
      if (VideoSegmentUI.this.isFinishing())
      {
        GMTrace.o(7486127996928L, 55776);
        return;
      }
      Object localObject = new MMTextureView(this.context)
      {
        protected final void onMeasure(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(7428817027072L, 55349);
          w.d("MicroMsg.VideoSegmentUI", "onMeasure video size[%d, %d, %d] spec[%d, %d]", new Object[] { Integer.valueOf(VideoSegmentUI.a.this.ngf), Integer.valueOf(VideoSegmentUI.a.this.nge), Integer.valueOf(VideoSegmentUI.a.this.ngg), Integer.valueOf(View.getDefaultSize(1, paramAnonymousInt1)), Integer.valueOf(View.getDefaultSize(1, paramAnonymousInt2)) });
          if ((VideoSegmentUI.a.this.ngg == 90) || (VideoSegmentUI.a.this.ngg == 270))
          {
            Matrix localMatrix = new Matrix();
            localMatrix.set(getMatrix());
            int i = View.getDefaultSize(1, paramAnonymousInt1);
            int j = View.getDefaultSize(1, paramAnonymousInt2);
            float f1 = i / 2.0F;
            float f2 = j / 2.0F;
            float f3 = j / i;
            localMatrix.postRotate(VideoSegmentUI.a.this.ngg, f1, f2);
            localMatrix.postScale(1.0F / f3, f3, f1, f2);
            setTransform(localMatrix);
            w.i("MicroMsg.VideoSegmentUI", "rotate transform mDegrees[%d] screenSize[%d, %d]", new Object[] { Integer.valueOf(VideoSegmentUI.a.this.ngg), Integer.valueOf(i), Integer.valueOf(j) });
          }
          super.onMeasure(paramAnonymousInt1, paramAnonymousInt2);
          GMTrace.o(7428817027072L, 55349);
        }
      };
      int i = this.ndy.getWidth();
      int j = com.tencent.mm.br.a.V(this.context, k.b.nep);
      int k = ((View)VideoSegmentUI.j(VideoSegmentUI.this)).getTop() - j * 2;
      int m = this.ngf;
      int n = this.nge;
      Point localPoint = new Point();
      if (n / m > k / i) {}
      for (float f = k / n;; f = i / m)
      {
        localPoint.x = ((int)(m * f));
        localPoint.y = ((int)(f * n));
        w.i("MicroMsg.VideoSegmentUI", "rawWidth %d rawHeight %d  rawDegress %d padding %d validWidth %d validHeight %d scaled %s", new Object[] { Integer.valueOf(this.ngf), Integer.valueOf(this.nge), Integer.valueOf(this.ngg), Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(k), localPoint.toString() });
        if ((localPoint.x > 0) && (localPoint.y > 0)) {
          break;
        }
        w.e("MicroMsg.VideoSegmentUI", "rawWidth %d rawHeight %d padding %d validWidth %d validHeight %d scaled %s", new Object[] { Integer.valueOf(this.ngf), Integer.valueOf(this.nge), Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(k), localPoint.toString() });
        if (this.ngh != null)
        {
          localObject = this.ngh;
          w.e("MicroMsg.VideoSegmentUI", "TextureViewCallback error");
          VideoSegmentUI.m(((VideoSegmentUI.b)localObject).nfZ);
          ((VideoSegmentUI.b)localObject).nfZ.finish();
          VideoSegmentUI.b(((VideoSegmentUI.b)localObject).nfZ);
        }
        GMTrace.o(7486127996928L, 55776);
        return;
      }
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(localPoint.x, localPoint.y);
      j += (int)((k - localPoint.y) / 2.0F);
      localLayoutParams.topMargin = j;
      localLayoutParams.bottomMargin = j;
      i = (int)((i - localPoint.x) / 2.0F);
      localLayoutParams.leftMargin = i;
      localLayoutParams.rightMargin = i;
      ((MMTextureView)localObject).setSurfaceTextureListener(this.ngh);
      this.ndy.addView((View)localObject, 0, localLayoutParams);
      GMTrace.o(7486127996928L, 55776);
    }
  }
  
  private final class b
    implements TextureView.SurfaceTextureListener
  {
    public b()
    {
      GMTrace.i(7441836146688L, 55446);
      GMTrace.o(7441836146688L, 55446);
    }
    
    public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
    {
      GMTrace.i(7441970364416L, 55447);
      boolean bool2 = VideoSegmentUI.w(VideoSegmentUI.this);
      boolean bool1;
      if (VideoSegmentUI.d(VideoSegmentUI.this) == null) {
        bool1 = true;
      }
      for (;;)
      {
        w.i("MicroMsg.VideoSegmentUI", "TextureViewCallback create needResume[%b] segmentPlayer is null[%b]", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
        VideoSegmentUI.b(VideoSegmentUI.this, new Surface(paramSurfaceTexture));
        if ((VideoSegmentUI.d(VideoSegmentUI.this) == null) && (VideoSegmentUI.w(VideoSegmentUI.this))) {
          w.i("MicroMsg.VideoSegmentUI", "MediaPlayer resume");
        }
        try
        {
          VideoSegmentUI.a(VideoSegmentUI.this, VideoSegmentUI.u(VideoSegmentUI.this));
          if ((VideoSegmentUI.j(VideoSegmentUI.this) != null) && (VideoSegmentUI.d(VideoSegmentUI.this) != null)) {
            VideoSegmentUI.d(VideoSegmentUI.this).setLoop((int)(VideoSegmentUI.e(VideoSegmentUI.this) * VideoSegmentUI.j(VideoSegmentUI.this).aPX()), (int)(VideoSegmentUI.e(VideoSegmentUI.this) * VideoSegmentUI.j(VideoSegmentUI.this).aPY()));
          }
          VideoSegmentUI.a(VideoSegmentUI.this, false);
          VideoSegmentUI.o(VideoSegmentUI.this).countDown();
          GMTrace.o(7441970364416L, 55447);
          return;
          bool1 = false;
        }
        catch (Exception paramSurfaceTexture)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.VideoSegmentUI", paramSurfaceTexture, "ResumeMediaPlayer error %s", new Object[] { paramSurfaceTexture.getMessage() });
          }
        }
      }
    }
    
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
    {
      GMTrace.i(7442238799872L, 55449);
      w.i("MicroMsg.VideoSegmentUI", "TextureViewCallback.surfaceDestroyed %s", new Object[] { bg.bQW() });
      try
      {
        if (VideoSegmentUI.d(VideoSegmentUI.this) != null)
        {
          w.i("MicroMsg.VideoSegmentUI", "TextureViewCallback MediaPlayer pause");
          VideoSegmentUI.d(VideoSegmentUI.this).release();
          VideoSegmentUI.v(VideoSegmentUI.this);
          VideoSegmentUI.a(VideoSegmentUI.this, true);
        }
        VideoSegmentUI.b(VideoSegmentUI.this, null);
      }
      catch (Exception paramSurfaceTexture)
      {
        for (;;) {}
      }
      GMTrace.o(7442238799872L, 55449);
      return false;
    }
    
    public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
    {
      GMTrace.i(7442104582144L, 55448);
      GMTrace.o(7442104582144L, 55448);
    }
    
    public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
    {
      GMTrace.i(7442373017600L, 55450);
      GMTrace.o(7442373017600L, 55450);
    }
  }
  
  private static final class c
    implements Runnable
  {
    private int gVq;
    private WeakReference<c> grA;
    private int ngj;
    
    public c(c paramc, int paramInt1, int paramInt2)
    {
      GMTrace.i(7428951244800L, 55350);
      this.grA = new WeakReference(paramc);
      this.ngj = paramInt1;
      this.gVq = paramInt2;
      GMTrace.o(7428951244800L, 55350);
    }
    
    public final void run()
    {
      GMTrace.i(7429085462528L, 55351);
      c localc = (c)this.grA.get();
      if (localc == null)
      {
        GMTrace.o(7429085462528L, 55351);
        return;
      }
      localc.af(this.ngj / this.gVq);
      GMTrace.o(7429085462528L, 55351);
    }
  }
  
  private final class d
    implements Runnable
  {
    public d()
    {
      GMTrace.i(7472169353216L, 55672);
      GMTrace.o(7472169353216L, 55672);
    }
    
    public final void run()
    {
      GMTrace.i(7472303570944L, 55673);
      for (;;)
      {
        try
        {
          bool1 = VideoSegmentUI.o(VideoSegmentUI.this).await(5L, TimeUnit.SECONDS);
          if ((!bool1) || (VideoSegmentUI.t(VideoSegmentUI.this)) || (VideoSegmentUI.this.isFinishing()) || (VideoSegmentUI.u(VideoSegmentUI.this) == null) || (!VideoSegmentUI.u(VideoSegmentUI.this).isValid()))
          {
            boolean bool3 = VideoSegmentUI.t(VideoSegmentUI.this);
            boolean bool4 = VideoSegmentUI.this.isFinishing();
            if (VideoSegmentUI.u(VideoSegmentUI.this) != null) {
              break label351;
            }
            bool2 = true;
            w.w("MicroMsg.VideoSegmentUI", "Waiting Prepared error result[%b] needFinish[%b] isFinishing[%b] mSurface is null[%b]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool3), Boolean.valueOf(bool4), Boolean.valueOf(bool2) });
            VideoSegmentUI.this.finish();
            GMTrace.o(7472303570944L, 55673);
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          w.e("MicroMsg.VideoSegmentUI", "count down latch error %s", new Object[] { localInterruptedException });
          boolean bool1 = false;
          continue;
          if (VideoSegmentUI.d(VideoSegmentUI.this) != null)
          {
            VideoSegmentUI.d(VideoSegmentUI.this).a(null);
            VideoSegmentUI.d(VideoSegmentUI.this).a(null);
            VideoSegmentUI.d(VideoSegmentUI.this).release();
            VideoSegmentUI.v(VideoSegmentUI.this);
          }
          try
          {
            VideoSegmentUI.a(VideoSegmentUI.this, VideoSegmentUI.u(VideoSegmentUI.this));
            VideoSegmentUI.d(VideoSegmentUI.this).setSurface(VideoSegmentUI.u(VideoSegmentUI.this));
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(7447741726720L, 55490);
                if ((VideoSegmentUI.t(VideoSegmentUI.this)) || (VideoSegmentUI.this.isFinishing()) || (VideoSegmentUI.j(VideoSegmentUI.this) == null) || (VideoSegmentUI.d(VideoSegmentUI.this) == null))
                {
                  w.i("MicroMsg.VideoSegmentUI", "waiting end, main thread, activity not valid.");
                  GMTrace.o(7447741726720L, 55490);
                  return;
                }
                ((View)VideoSegmentUI.j(VideoSegmentUI.this)).setAlpha(0.0F);
                ((View)VideoSegmentUI.j(VideoSegmentUI.this)).setVisibility(0);
                ((View)VideoSegmentUI.j(VideoSegmentUI.this)).animate().setDuration(300L).setStartDelay(200L).alpha(1.0F);
                float f1 = VideoSegmentUI.j(VideoSegmentUI.this).aPX();
                float f2 = VideoSegmentUI.j(VideoSegmentUI.this).aPY();
                if ((f2 - f1) * VideoSegmentUI.e(VideoSegmentUI.this) <= VideoSegmentUI.p(VideoSegmentUI.this)) {
                  VideoSegmentUI.this.lf(true);
                }
                VideoSegmentUI.d(VideoSegmentUI.this).setLoop((int)(f1 * VideoSegmentUI.e(VideoSegmentUI.this)), (int)(f2 * VideoSegmentUI.e(VideoSegmentUI.this)));
                GMTrace.o(7447741726720L, 55490);
              }
            });
            GMTrace.o(7472303570944L, 55673);
            return;
          }
          catch (IOException localIOException)
          {
            w.printErrStackTrace("MicroMsg.VideoSegmentUI", localIOException, "init segmentPlayer second time %s", new Object[] { localIOException.getMessage() });
            VideoSegmentUI.this.finish();
            GMTrace.o(7472303570944L, 55673);
            return;
          }
        }
        catch (Exception localException)
        {
          w.printErrStackTrace("MicroMsg.VideoSegmentUI", localException, "Finished when init", new Object[0]);
          VideoSegmentUI.this.finish();
          GMTrace.o(7472303570944L, 55673);
          return;
        }
        label351:
        boolean bool2 = false;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\segment\VideoSegmentUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */