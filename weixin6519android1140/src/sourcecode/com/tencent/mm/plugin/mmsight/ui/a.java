package com.tencent.mm.plugin.mmsight.ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.MediaMetadataRetriever;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.api.b;
import com.tencent.mm.api.k;
import com.tencent.mm.api.l;
import com.tencent.mm.api.m.a.a;
import com.tencent.mm.api.m.b;
import com.tencent.mm.api.m.c;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.mmsight.a.a.b;
import com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar;
import com.tencent.mm.plugin.mmsight.segment.c.a;
import com.tencent.mm.plugin.mmsight.segment.c.b;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.u.a.f;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ad;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;

public final class a
{
  public MMActivity ezR;
  public r hua;
  public VideoTransPara mYw;
  public VideoSeekBarEditorView ndA;
  public VideoPlayerTextureView ndz;
  public RecyclerThumbSeekBar nhG;
  public boolean nhH;
  public int nhI;
  public int nhJ;
  public int nhK;
  aj nhL;
  public ViewGroup nhM;
  public com.tencent.mm.api.m nhN;
  public b nhO;
  public com.tencent.mm.plugin.mmsight.api.a nhP;
  public a nhQ;
  public boolean nhR;
  public boolean nhS;
  private boolean nhT;
  private boolean nhU;
  public String nhV;
  public int nhW;
  public a.b nhX;
  public int scene;
  public String videoPath;
  
  public a()
  {
    GMTrace.i(20169166422016L, 150272);
    this.nhH = false;
    this.nhI = -1;
    this.nhJ = -1;
    this.nhK = -1;
    this.nhR = false;
    this.nhS = false;
    this.nhT = false;
    this.nhU = false;
    this.nhV = null;
    this.nhW = -1;
    GMTrace.o(20169166422016L, 150272);
  }
  
  public final void B(final Bitmap paramBitmap)
  {
    GMTrace.i(20169703292928L, 150276);
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20847905472512L, 155329);
        com.tencent.mm.plugin.sight.base.a locala = com.tencent.mm.plugin.sight.base.d.GB(a.this.videoPath);
        int m;
        int k;
        int j;
        if (locala != null)
        {
          m = locala.width;
          k = locala.height;
          j = locala.videoBitrate;
        }
        Object localObject;
        while ((m <= 0) || (k <= 0) || (j <= 0))
        {
          w.e("MicroMsg.MMSightVideoEditor", "doRemuxVideo, retrieve video metadata error, width: %s, height: %s, bitrate: %s", new Object[] { Integer.valueOf(m), Integer.valueOf(k), Integer.valueOf(j) });
          GMTrace.o(20847905472512L, 155329);
          return;
          localObject = new MediaMetadataRetriever();
          ((MediaMetadataRetriever)localObject).setDataSource(a.this.videoPath);
          m = bg.getInt(((MediaMetadataRetriever)localObject).extractMetadata(18), -1);
          k = bg.getInt(((MediaMetadataRetriever)localObject).extractMetadata(19), -1);
          j = bg.getInt(((MediaMetadataRetriever)localObject).extractMetadata(20), -1);
          ((MediaMetadataRetriever)localObject).release();
        }
        int n = j;
        int i;
        if (a.this.nhS)
        {
          n = j;
          if (a.this.mYw != null)
          {
            i = j;
            if (j > a.this.mYw.videoBitrate) {
              i = a.this.mYw.videoBitrate;
            }
            j = a.this.mYw.width;
            n = a.this.mYw.height;
            w.d("MicroMsg.MMSightVideoEditor", "scale() called with: decoderOutputWidth = [" + m + "], decoderOutputHeight = [" + k + "], specWidth = [" + j + "], specHeight = [" + n + "]");
            if ((m <= j) && (k <= n))
            {
              w.i("MicroMsg.MMSightVideoEditor", "calc scale, small or equal to spec size");
              localObject = null;
              n = i;
              if (localObject == null) {
                break label1490;
              }
              m = ((Point)localObject).x;
              k = ((Point)localObject).y;
            }
          }
        }
        for (;;)
        {
          localObject = a.this.videoPath + "remuxOutput.mp4";
          if (!bg.nm(a.this.nhV)) {
            localObject = a.this.nhV;
          }
          if ((a.this.nhJ >= 0) && (a.this.nhK > 0)) {
            if ((a.this.nhW != -1) && ((a.this.nhW == 1) || (a.this.nhW == 2))) {
              a.this.nhP = com.tencent.mm.plugin.mmsight.api.a.mXb.a(a.this.nhW, a.this.videoPath, (String)localObject, m, k, i, a.this.mYw.fps, a.this.nhJ, a.this.nhK);
            }
          }
          for (;;)
          {
            w.i("MicroMsg.MMSightVideoEditor", "created remuxer, type: %s, remuxer: %s", new Object[] { Integer.valueOf(a.this.nhW), a.this.nhP });
            if (a.this.nhP != null) {
              break label1219;
            }
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(20848979214336L, 155337);
                if (a.this.hua != null) {
                  a.this.hua.dismiss();
                }
                if (a.this.nhQ != null) {
                  a.this.nhQ.onError();
                }
                GMTrace.o(20848979214336L, 155337);
              }
            });
            GMTrace.o(20847905472512L, 155329);
            return;
            int i4 = Math.max(m, k);
            int i3 = Math.min(m, k);
            int i1 = Math.max(j, n);
            int i2 = Math.min(j, n);
            if ((i4 % 16 == 0) && (Math.abs(i4 - i1) < 16) && (i3 % 16 == 0) && (Math.abs(i3 - i2) < 16))
            {
              w.i("MicroMsg.MMSightVideoEditor", "calc scale, same len divide by 16, no need scale");
              localObject = null;
              break;
            }
            if ((i4 / 2 == i1) && (i3 / 2 == i2))
            {
              w.i("MicroMsg.MMSightVideoEditor", "calc scale, double ratio");
              n = m / 2;
              i1 = k / 2;
              j = n;
              if (n % 2 != 0) {
                j = n + 1;
              }
              n = i1;
              if (i1 % 2 != 0) {
                n = i1 + 1;
              }
              localObject = new Point(j, n);
              break;
            }
            i4 /= 2;
            i3 /= 2;
            if ((i4 % 16 == 0) && (Math.abs(i4 - i1) < 16) && (i3 % 16 == 0) && (Math.abs(i3 - i2) < 16))
            {
              w.i("MicroMsg.MMSightVideoEditor", "calc scale, double ratio divide by 16");
              n = m / 2;
              i1 = k / 2;
              j = n;
              if (n % 2 != 0) {
                j = n + 1;
              }
              n = i1;
              if (i1 % 2 != 0) {
                n = i1 + 1;
              }
              localObject = new Point(j, n);
              break;
            }
            localObject = new Point();
            double d;
            if (m < k)
            {
              j = Math.min(j, n);
              d = 1.0D * m / j;
              n = (int)(k / d);
            }
            for (;;)
            {
              i1 = n;
              if (n % 2 != 0) {
                i1 = n + 1;
              }
              n = j;
              if (j % 2 != 0) {
                n = j + 1;
              }
              w.i("MicroMsg.MMSightVideoEditor", "calc scale, outputsize: %s %s", new Object[] { Integer.valueOf(n), Integer.valueOf(i1) });
              ((Point)localObject).x = n;
              ((Point)localObject).y = i1;
              break;
              n = Math.min(j, n);
              d = 1.0D * k / n;
              j = (int)(m / d);
            }
            a.this.nhP = com.tencent.mm.plugin.mmsight.api.a.mXb.a(a.this.videoPath, (String)localObject, m, k, i, a.this.mYw.fps, a.this.nhJ, a.this.nhK);
            continue;
            if ((a.this.nhW != -1) && ((a.this.nhW == 1) || (a.this.nhW == 2))) {
              a.this.nhP = com.tencent.mm.plugin.mmsight.api.a.mXb.a(a.this.nhW, a.this.videoPath, (String)localObject, m, k, i, a.this.mYw.fps);
            } else {
              a.this.nhP = com.tencent.mm.plugin.mmsight.api.a.mXb.a(a.this.videoPath, (String)localObject, m, k, i, a.this.mYw.fps);
            }
          }
          label1219:
          com.tencent.mm.plugin.mmsight.segment.m.qR(a.this.nhP.getType());
          long l = bg.Pw();
          if (paramBitmap != null) {
            a.this.nhP.A(paramBitmap);
          }
          i = a.this.nhP.aOO();
          if (i < 0)
          {
            w.e("MicroMsg.MMSightVideoEditor", "remux failed, ret: %s", new Object[] { Integer.valueOf(i) });
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(20849381867520L, 155340);
                if (a.this.hua != null) {
                  a.this.hua.dismiss();
                }
                if (a.this.nhQ != null) {
                  a.this.nhQ.onError();
                }
                GMTrace.o(20849381867520L, 155340);
              }
            });
            com.tencent.mm.plugin.mmsight.segment.m.qS(a.this.nhP.getType());
            GMTrace.o(20847905472512L, 155329);
            return;
          }
          if (bg.nm(a.this.nhV)) {
            FileOp.al((String)localObject, a.this.videoPath);
          }
          com.tencent.mm.plugin.mmsight.segment.m.A(a.this.nhP.getType(), bg.aI(l));
          localObject = a.this.nhX;
          boolean bool;
          if ((a.this.nhJ >= 0) && (a.this.nhK > 0))
          {
            bool = true;
            ((a.b)localObject).ndd = bool;
            a.this.nhX.nda = (a.this.nhK - a.this.nhJ);
            localObject = a.this.nhX;
            if (locala != null) {
              break label1481;
            }
          }
          label1481:
          for (i = 0;; i = locala.ljb)
          {
            ((a.b)localObject).ncZ = i;
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(20848710778880L, 155335);
                if (a.this.hua != null) {
                  a.this.hua.dismiss();
                }
                if (a.this.nhQ != null) {
                  a.this.nhQ.aQc();
                }
                GMTrace.o(20848710778880L, 155335);
              }
            });
            GMTrace.o(20847905472512L, 155329);
            return;
            bool = false;
            break;
          }
          label1490:
          i = n;
        }
      }
    }, "MMSightVideoEditor_remux");
    GMTrace.o(20169703292928L, 150276);
  }
  
  public final boolean Yb()
  {
    GMTrace.i(20170105946112L, 150279);
    if (this.nhU)
    {
      aQx();
      GMTrace.o(20170105946112L, 150279);
      return true;
    }
    if (this.nhN != null)
    {
      boolean bool = this.nhN.os();
      GMTrace.o(20170105946112L, 150279);
      return bool;
    }
    GMTrace.o(20170105946112L, 150279);
    return false;
  }
  
  public final void a(MMActivity paramMMActivity, int paramInt, String paramString, VideoSeekBarEditorView paramVideoSeekBarEditorView, VideoPlayerTextureView paramVideoPlayerTextureView, ViewGroup paramViewGroup, VideoTransPara paramVideoTransPara, boolean paramBoolean)
  {
    GMTrace.i(20169300639744L, 150273);
    this.scene = paramInt;
    this.videoPath = paramString;
    this.ndA = paramVideoSeekBarEditorView;
    this.nhG = paramVideoSeekBarEditorView.njA;
    this.ndz = paramVideoPlayerTextureView;
    this.nhM = paramViewGroup;
    this.ezR = paramMMActivity;
    this.mYw = paramVideoTransPara;
    this.nhT = paramBoolean;
    this.nhX = new a.b(paramInt);
    this.nhN = com.tencent.mm.api.m.eqG.ou();
    paramMMActivity = this.nhN;
    paramString = new m.a.a();
    paramString.eqI = false;
    paramString.eqK = true;
    paramString.eqH = m.c.eqM;
    paramString.eqL = new Rect(this.ndz.getLeft(), this.ndz.getTop(), this.ndz.getRight(), this.ndz.getBottom());
    paramMMActivity.a(paramString.oG());
    this.nhO = this.nhN.ad(this.nhM.getContext());
    this.nhO.a(new com.tencent.mm.api.e()
    {
      public final void onFinish()
      {
        GMTrace.i(20164603019264L, 150238);
        w.i("MicroMsg.MMSightVideoEditor", "photoEditor onFinish");
        a.this.nhN.a(new com.tencent.mm.api.j()
        {
          public final void a(final Bitmap paramAnonymous2Bitmap, boolean paramAnonymous2Boolean)
          {
            GMTrace.i(20155744649216L, 150172);
            w.i("MicroMsg.MMSightVideoEditor", "photoEditor onSuccess: %s isNever：%s", new Object[] { paramAnonymous2Bitmap, Boolean.valueOf(paramAnonymous2Boolean) });
            if (paramAnonymous2Boolean)
            {
              if ((paramAnonymous2Bitmap != null) && (!paramAnonymous2Bitmap.isRecycled())) {
                paramAnonymous2Bitmap.recycle();
              }
              if ((a.this.nhQ != null) && (!a.this.nhS))
              {
                if ((a.this.nhK > 0) && (a.this.nhI > 0) && (a.this.nhK <= a.this.nhI))
                {
                  af.t(new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(20153597165568L, 150156);
                      a.this.hua = h.a(a.this.ezR, a.this.ezR.getString(a.f.nln), false, null);
                      a.this.ndz.pause();
                      a.this.B(null);
                      GMTrace.o(20153597165568L, 150156);
                    }
                  });
                  GMTrace.o(20155744649216L, 150172);
                  return;
                }
                af.t(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(20157892132864L, 150188);
                    a.this.nhQ.aQc();
                    GMTrace.o(20157892132864L, 150188);
                  }
                });
                GMTrace.o(20155744649216L, 150172);
                return;
              }
              if (a.this.nhS)
              {
                af.t(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(20166347849728L, 150251);
                    a.this.hua = h.a(a.this.ezR, a.this.ezR.getString(a.f.nln), false, null);
                    a.this.ndz.pause();
                    a.this.B(null);
                    GMTrace.o(20166347849728L, 150251);
                  }
                });
                GMTrace.o(20155744649216L, 150172);
              }
            }
            else if (paramAnonymous2Bitmap != null)
            {
              af.t(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(20352910491648L, 151641);
                  a.this.hua = h.a(a.this.ezR, a.this.ezR.getString(a.f.nln), false, null);
                  a.this.ndz.pause();
                  a.this.B(paramAnonymous2Bitmap);
                  GMTrace.o(20352910491648L, 151641);
                }
              });
            }
            GMTrace.o(20155744649216L, 150172);
          }
          
          public final void a(Exception paramAnonymous2Exception)
          {
            GMTrace.i(20155610431488L, 150171);
            w.e("MicroMsg.MMSightVideoEditor", "photoEditor onError: %s", new Object[] { paramAnonymous2Exception });
            GMTrace.o(20155610431488L, 150171);
          }
        });
        GMTrace.o(20164603019264L, 150238);
      }
      
      public final void ow()
      {
        GMTrace.i(20164737236992L, 150239);
        w.i("MicroMsg.MMSightVideoEditor", "photoEditor onExit");
        a.this.release();
        if (a.this.nhQ != null) {
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(20171984994304L, 150293);
              a.this.nhQ.aQd();
              GMTrace.o(20171984994304L, 150293);
            }
          });
        }
        GMTrace.o(20164737236992L, 150239);
      }
    });
    paramMMActivity = new ViewGroup.MarginLayoutParams(-1, -1);
    if (ad.fe(this.ezR)) {
      paramMMActivity.height = (com.tencent.mm.plugin.mmsight.d.aON().y - ad.fd(this.ezR));
    }
    this.nhM.addView(this.nhO, paramMMActivity);
    this.nhO.eqv = new l()
    {
      public final void a(com.tencent.mm.api.d paramAnonymousd)
      {
        GMTrace.i(20167018938368L, 150256);
        w.i("MicroMsg.MMSightVideoEditor", "photoEditor [onSelectedFeature] features:%s", new Object[] { paramAnonymousd.name() });
        if (paramAnonymousd == com.tencent.mm.api.d.eqD) {
          a.this.aQw();
        }
        GMTrace.o(20167018938368L, 150256);
      }
      
      public final void a(com.tencent.mm.api.d paramAnonymousd, int paramAnonymousInt)
      {
        GMTrace.i(20167153156096L, 150257);
        w.i("MicroMsg.MMSightVideoEditor", "photoEditor [onSelectedDetailFeature] features:%s index:%s", new Object[] { paramAnonymousd.name(), Integer.valueOf(paramAnonymousInt) });
        GMTrace.o(20167153156096L, 150257);
      }
      
      public final void ap(boolean paramAnonymousBoolean)
      {
        GMTrace.i(20167287373824L, 150258);
        if (paramAnonymousBoolean)
        {
          a.this.ezR.aLs();
          GMTrace.o(20167287373824L, 150258);
          return;
        }
        a.this.ezR.db(a.this.nhM);
        GMTrace.o(20167287373824L, 150258);
      }
    };
    if (this.nhT) {
      this.nhO.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20171716558848L, 150291);
          a.this.nhO.an(false);
          a.this.nhO.ao(false);
          a.this.nhO.setActivated(false);
          a.this.aQw();
          GMTrace.o(20171716558848L, 150291);
        }
      });
    }
    GMTrace.o(20169300639744L, 150273);
  }
  
  public final void aQw()
  {
    GMTrace.i(20169434857472L, 150274);
    int k = this.ndz.getWidth();
    int m = this.ndz.getHeight();
    int j = com.tencent.mm.br.a.fromDPToPix(this.ezR, 20);
    if (this.ndA.getHeight() <= 0) {}
    for (int i = com.tencent.mm.br.a.fromDPToPix(this.ezR, 100);; i = this.ndA.getHeight())
    {
      j = i + j + com.tencent.mm.br.a.fromDPToPix(this.ezR, 12);
      i = j;
      if (ad.fe(this.ezR)) {
        i = j + ad.fd(this.ezR);
      }
      j = m - i;
      if (this.ndz.getBottom() + i < com.tencent.mm.plugin.mmsight.d.cN(this.ezR).y) {
        j = (int)((k - com.tencent.mm.br.a.fromDPToPix(this.ezR, 32) * 2) / (k / m));
      }
      float f1 = (int)(k / m * j) / k;
      float f2 = j / m;
      this.ndz.animate().scaleX(f1).scaleY(f2).translationY(-(i / 2.0F)).setDuration(300L).setListener(new Animator.AnimatorListener()
      {
        public final void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20848308125696L, 155332);
          GMTrace.o(20848308125696L, 155332);
        }
        
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20848173907968L, 155331);
          if (a.this.ndz != null) {
            a.this.ndz.requestLayout();
          }
          GMTrace.o(20848173907968L, 155331);
        }
        
        public final void onAnimationRepeat(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20848442343424L, 155333);
          GMTrace.o(20848442343424L, 155333);
        }
        
        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
          GMTrace.i(20848039690240L, 155330);
          GMTrace.o(20848039690240L, 155330);
        }
      });
      this.nhO.animate().scaleX(f1).scaleY(f2).translationY(-(i / 2.0F)).setDuration(300L);
      this.nhO.am(false);
      this.nhO.an(false);
      this.nhO.ao(false);
      if (!this.nhH)
      {
        this.nhG.ney = new c.a()
        {
          public final void fZ(boolean paramAnonymousBoolean)
          {
            GMTrace.i(20153865601024L, 150158);
            if (paramAnonymousBoolean)
            {
              w.e("MicroMsg.MMSightVideoEditor", "Not Supported init SegmentSeekBar failed.");
              af.t(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(20378009206784L, 151828);
                  if (a.this.hua != null) {
                    a.this.hua.dismiss();
                  }
                  if (a.this.nhQ != null) {
                    a.this.nhQ.onError();
                  }
                  GMTrace.o(20378009206784L, 151828);
                }
              });
              GMTrace.o(20153865601024L, 150158);
              return;
            }
            if (a.this.nhG != null)
            {
              a.this.nhI = a.this.nhG.gVq;
              w.i("MicroMsg.MMSightVideoEditor", "thumbSeekBar onPrepared success %d", new Object[] { Integer.valueOf(a.this.nhI) });
              try
              {
                if (a.this.ndz != null)
                {
                  a.this.nhJ = Math.round(a.this.nhI * a.this.nhG.aPX());
                  a.this.nhK = Math.round(a.this.nhI * a.this.nhG.aPY());
                  if (a.this.nhK <= 0) {
                    if (a.this.nhI > 10500) {
                      break label295;
                    }
                  }
                }
                label295:
                for (a.this.nhK = a.this.nhI;; a.this.nhK = 10000)
                {
                  w.i("MicroMsg.MMSightVideoEditor", "thumbSeekBar onPrepared, start: %s, end: %s, duration: %s", new Object[] { Integer.valueOf(a.this.nhJ), Integer.valueOf(a.this.nhK), Integer.valueOf(a.this.nhI) });
                  a locala = a.this;
                  locala.nhL = new aj(Looper.getMainLooper(), new a.10(locala), true);
                  locala.nhL.z(20L, 20L);
                  GMTrace.o(20153865601024L, 150158);
                  return;
                }
                GMTrace.o(20153865601024L, 150158);
              }
              catch (Exception localException) {}
            }
          }
        };
        this.nhG.nez = new c.b()
        {
          public final void A(float paramAnonymousFloat1, float paramAnonymousFloat2)
          {
            GMTrace.i(20165810978816L, 150247);
            GMTrace.o(20165810978816L, 150247);
          }
          
          public final void aPZ()
          {
            GMTrace.i(20165542543360L, 150245);
            if (a.this.ndz == null)
            {
              GMTrace.o(20165542543360L, 150245);
              return;
            }
            a.this.ndz.pause();
            GMTrace.o(20165542543360L, 150245);
          }
          
          public final void y(float paramAnonymousFloat1, float paramAnonymousFloat2)
          {
            GMTrace.i(20165408325632L, 150244);
            if (a.this.ndz == null)
            {
              GMTrace.o(20165408325632L, 150244);
              return;
            }
            int i = a.this.nhI;
            a.this.nhJ = Math.round(i * paramAnonymousFloat1);
            a.this.nhK = Math.round(i * paramAnonymousFloat2);
            w.i("MicroMsg.MMSightVideoEditor", "onRecyclerChanged, start: %s, end: %s %s %s", new Object[] { Integer.valueOf(a.this.nhJ), Integer.valueOf(a.this.nhK), Float.valueOf(paramAnonymousFloat1), Float.valueOf(paramAnonymousFloat2) });
            a.this.ndz.c(a.this.nhJ, true);
            GMTrace.o(20165408325632L, 150244);
          }
          
          public final void z(float paramAnonymousFloat1, float paramAnonymousFloat2)
          {
            GMTrace.i(20165676761088L, 150246);
            if (a.this.ndz == null)
            {
              GMTrace.o(20165676761088L, 150246);
              return;
            }
            int i = a.this.nhI;
            a.this.nhJ = Math.round(i * paramAnonymousFloat1);
            a.this.nhK = Math.round(i * paramAnonymousFloat2);
            a.this.ndz.c(a.this.nhJ, true);
            w.i("MicroMsg.MMSightVideoEditor", "onUp, start: %s, end: %s %s %s", new Object[] { Integer.valueOf(a.this.nhJ), Integer.valueOf(a.this.nhK), Float.valueOf(paramAnonymousFloat1), Float.valueOf(paramAnonymousFloat2) });
            GMTrace.o(20165676761088L, 150246);
          }
        };
        this.nhG.CM(this.videoPath);
        this.ndz.oTm = new f.a()
        {
          public final void Xq()
          {
            GMTrace.i(20170911252480L, 150285);
            GMTrace.o(20170911252480L, 150285);
          }
          
          public final int bM(int paramAnonymousInt1, int paramAnonymousInt2)
          {
            GMTrace.i(20171179687936L, 150287);
            GMTrace.o(20171179687936L, 150287);
            return 0;
          }
          
          public final void bs(int paramAnonymousInt1, int paramAnonymousInt2)
          {
            GMTrace.i(20171313905664L, 150288);
            GMTrace.o(20171313905664L, 150288);
          }
          
          public final void onCompletion()
          {
            GMTrace.i(20171045470208L, 150286);
            if (a.this.nhJ > 0)
            {
              a.this.ndz.c(a.this.nhJ, true);
              GMTrace.o(20171045470208L, 150286);
              return;
            }
            a.this.ndz.c(0.0D, true);
            GMTrace.o(20171045470208L, 150286);
          }
          
          public final void onError(int paramAnonymousInt1, int paramAnonymousInt2)
          {
            GMTrace.i(20171448123392L, 150289);
            GMTrace.o(20171448123392L, 150289);
          }
        };
        this.nhH = true;
      }
      this.ndA.setVisibility(0);
      this.ndA.bringToFront();
      VideoSeekBarEditorView localVideoSeekBarEditorView = this.ndA;
      Object localObject = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(20151718117376L, 150142);
          a.this.aQx();
          if (!a.this.nhR)
          {
            paramAnonymousView = a.this;
            a.this.nhK = -1;
            paramAnonymousView.nhJ = -1;
            a.this.ndA.aQH();
            a.this.nhG = a.this.ndA.njA;
            a.this.nhH = false;
          }
          GMTrace.o(20151718117376L, 150142);
        }
      };
      localVideoSeekBarEditorView.kWK.setOnClickListener((View.OnClickListener)localObject);
      localVideoSeekBarEditorView = this.ndA;
      localObject = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(20849113432064L, 155338);
          a.this.aQx();
          if ((a.this.nhJ >= 0) && (a.this.nhK > 0)) {
            a.this.nhR = true;
          }
          GMTrace.o(20849113432064L, 155338);
        }
      };
      localVideoSeekBarEditorView.njB.setOnClickListener((View.OnClickListener)localObject);
      this.nhU = true;
      GMTrace.o(20169434857472L, 150274);
      return;
    }
  }
  
  public final void aQx()
  {
    GMTrace.i(20169569075200L, 150275);
    this.ndz.animate().scaleX(1.0F).scaleY(1.0F).translationY(0.0F).setDuration(300L);
    this.ndA.animate().alpha(0.0F).setDuration(100L).setListener(new AnimatorListenerAdapter()
    {
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        GMTrace.i(20847637037056L, 155327);
        a.this.ndA.setVisibility(8);
        a.this.ndA.setAlpha(1.0F);
        GMTrace.o(20847637037056L, 155327);
      }
    });
    this.nhO.an(true);
    this.nhO.ao(true);
    this.nhO.am(true);
    this.nhO.animate().scaleX(1.0F).scaleY(1.0F).translationY(0.0F).setDuration(300L);
    this.nhU = false;
    GMTrace.o(20169569075200L, 150275);
  }
  
  public final void gd(boolean paramBoolean)
  {
    int i = 2;
    GMTrace.i(20169971728384L, 150278);
    try
    {
      this.nhX.guN = paramBoolean;
      if (this.nhN == null)
      {
        w.e("MicroMsg.MMSightVideoEditor", "[report] null == photoEditor");
        GMTrace.o(20169971728384L, 150278);
        return;
      }
      Object localObject = this.nhN.ot();
      this.nhX.ndb = ((k)localObject).oy();
      this.nhX.ndc = ((k)localObject).ox();
      this.nhX.nde = ((k)localObject).oA();
      this.nhX.fMl = ((k)localObject).oB();
      this.nhX.ndf = ((k)localObject).oE();
      this.nhX.textColor = ((k)localObject).getTextColor();
      localObject = this.nhX;
      g localg = g.ork;
      int j = ((a.b)localObject).scene;
      if (((a.b)localObject).guN) {}
      for (;;)
      {
        localg.i(14362, new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(((a.b)localObject).ndb), Integer.valueOf(((a.b)localObject).ndc), Integer.valueOf(((a.b)localObject).nde), Boolean.valueOf(((a.b)localObject).ndd), Integer.valueOf(((a.b)localObject).fMl), Integer.valueOf(((a.b)localObject).ncZ), Integer.valueOf(((a.b)localObject).nda), Integer.valueOf(((a.b)localObject).ndf), Integer.valueOf(0), Integer.valueOf(((a.b)localObject).textColor) });
        w.i("MicroMsg.VideoEditReporter", "[report-VideoEditDetailData] %s", new Object[] { ((a.b)localObject).toString() });
        GMTrace.o(20169971728384L, 150278);
        return;
        i = 1;
      }
      return;
    }
    catch (Exception localException)
    {
      GMTrace.o(20169971728384L, 150278);
    }
  }
  
  public final void release()
  {
    GMTrace.i(20169837510656L, 150277);
    try
    {
      if (this.nhL != null)
      {
        this.nhL.stopTimer();
        this.nhL = null;
      }
      if (this.nhG != null) {
        this.nhG.release();
      }
      if (this.nhN != null) {
        this.nhN.onDestroy();
      }
      if (this.nhM != null) {
        this.nhM.removeView(this.nhO);
      }
      if (this.ndA != null) {
        this.ndA.aQH();
      }
      this.nhH = false;
      com.tencent.mm.plugin.mmsight.model.a.j.naP.ye();
      GMTrace.o(20169837510656L, 150277);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.MMSightVideoEditor", localException, "release error: %s", new Object[] { localException.getMessage() });
      GMTrace.o(20169837510656L, 150277);
    }
  }
  
  public static abstract interface a
  {
    public abstract void aQc();
    
    public abstract void aQd();
    
    public abstract void onError();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */