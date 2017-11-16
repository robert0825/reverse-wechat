package com.tencent.mm.plugin.facedetect.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult;
import com.tencent.mm.plugin.facedetect.a.e;
import com.tencent.mm.plugin.facedetect.a.g;
import com.tencent.mm.plugin.facedetect.a.h;
import com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult;
import com.tencent.mm.plugin.facedetect.model.f;
import com.tencent.mm.plugin.facedetect.model.g;
import com.tencent.mm.plugin.facedetect.model.n;
import com.tencent.mm.plugin.facedetect.model.o;
import com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.v.a.a;

public class FaceDetectView
  extends RelativeLayout
{
  public static long kZh;
  public static int kZi;
  public boolean isPaused;
  public volatile boolean jAg;
  public long kSX;
  public TextView kWJ;
  public FaceDetectCameraView kYR;
  public FaceDetectDecorView kYS;
  public ViewGroup kYT;
  public ViewGroup kYU;
  public a kYV;
  public com.tencent.mm.plugin.facedetect.d.b kYW;
  public boolean kYX;
  public boolean kYY;
  public String kYZ;
  public boolean kZa;
  public boolean kZb;
  public long kZc;
  private long kZd;
  private final int kZe;
  private Animation kZf;
  private View kZg;
  
  static
  {
    GMTrace.i(5917391192064L, 44088);
    kZh = 100L;
    kZi = 1;
    GMTrace.o(5917391192064L, 44088);
  }
  
  public FaceDetectView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(5914572619776L, 44067);
    GMTrace.o(5914572619776L, 44067);
  }
  
  public FaceDetectView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, (byte)0);
    GMTrace.i(5914706837504L, 44068);
    GMTrace.o(5914706837504L, 44068);
  }
  
  private FaceDetectView(Context paramContext, AttributeSet paramAttributeSet, int paramInt, byte paramByte)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5914841055232L, 44069);
    this.kYR = null;
    this.kYS = null;
    this.kWJ = null;
    this.kYT = null;
    this.kYU = null;
    this.kYV = null;
    this.kYX = false;
    this.jAg = false;
    this.isPaused = false;
    this.kYY = false;
    this.kYZ = ab.getContext().getString(a.h.kRh);
    this.kZa = true;
    this.kZb = false;
    this.kSX = -1L;
    this.kZc = -1L;
    this.kZd = -1L;
    this.kZe = 1500;
    this.kZg = null;
    paramContext = LayoutInflater.from(paramContext).inflate(a.g.kQw, null, false);
    addView(paramContext);
    this.kYR = ((FaceDetectCameraView)paramContext.findViewById(a.e.kPB));
    this.kYS = ((FaceDetectDecorView)paramContext.findViewById(a.e.kQc));
    this.kZg = paramContext.findViewById(a.e.kQb);
    this.kYR.kYg = new b()
    {
      public final void b(int paramAnonymousInt, CharSequence paramAnonymousCharSequence)
      {
        GMTrace.i(5912693571584L, 44053);
        w.e("MicroMsg.FaceDetectView", "hy: onDetectError: %d, %s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousCharSequence });
        if ((FaceDetectView.a(FaceDetectView.this)) || (FaceDetectView.b(FaceDetectView.this)))
        {
          w.w("MicroMsg.FaceDetectView", "hy: already end or paused");
          GMTrace.o(5912693571584L, 44053);
          return;
        }
        if ((FaceDetectView.c(FaceDetectView.this) != null) && (FaceDetectView.c(FaceDetectView.this).awB()))
        {
          w.e("MicroMsg.FaceDetectView", "hy: motion eat result");
          FaceDetectView.a(FaceDetectView.this, FaceDetectView.c(FaceDetectView.this).awE());
          GMTrace.o(5912693571584L, 44053);
          return;
        }
        FaceDetectView.this.eq(false);
        FaceDetectView.a(FaceDetectView.this, true);
        FaceDetectView localFaceDetectView = FaceDetectView.this;
        Object localObject;
        if (paramAnonymousCharSequence != null)
        {
          localObject = paramAnonymousCharSequence.toString();
          FaceDetectView.a(localFaceDetectView, (String)localObject);
          if (FaceDetectView.d(FaceDetectView.this) != null)
          {
            localObject = FaceDetectView.d(FaceDetectView.this);
            if (paramAnonymousCharSequence == null) {
              break label229;
            }
          }
        }
        label229:
        for (paramAnonymousCharSequence = paramAnonymousCharSequence.toString();; paramAnonymousCharSequence = FaceDetectView.this.getContext().getString(a.h.kQx))
        {
          ((a)localObject).z(paramAnonymousInt, paramAnonymousCharSequence);
          GMTrace.o(5912693571584L, 44053);
          return;
          localObject = FaceDetectView.this.getContext().getString(a.h.kQx);
          break;
        }
      }
      
      public final void c(FaceCharacteristicsResult paramAnonymousFaceCharacteristicsResult)
      {
        GMTrace.i(5912827789312L, 44054);
        int i = paramAnonymousFaceCharacteristicsResult.errCode;
        String str = paramAnonymousFaceCharacteristicsResult.eAR;
        w.v("MicroMsg.FaceDetectView", "hy: onDetectHelp: %d, %s", new Object[] { Integer.valueOf(i), str });
        if ((FaceDetectView.a(FaceDetectView.this)) || (FaceDetectView.b(FaceDetectView.this)))
        {
          w.w("MicroMsg.FaceDetectView", "hy: already end");
          GMTrace.o(5912827789312L, 44054);
          return;
        }
        if ((FaceDetectView.c(FaceDetectView.this) != null) && (FaceDetectView.c(FaceDetectView.this).a(paramAnonymousFaceCharacteristicsResult)))
        {
          w.e("MicroMsg.FaceDetectView", "hy: motion eat result");
          FaceDetectView.a(FaceDetectView.this, FaceDetectView.c(FaceDetectView.this).awE());
          GMTrace.o(5912827789312L, 44054);
          return;
        }
        FaceDetectView.e(FaceDetectView.this);
        if (!FaceDetectView.f(FaceDetectView.this))
        {
          GMTrace.o(5912827789312L, 44054);
          return;
        }
        if ((!FaceDetectView.g(FaceDetectView.this)) && ((paramAnonymousFaceCharacteristicsResult.errCode == 10) || (paramAnonymousFaceCharacteristicsResult.errCode == 11)))
        {
          GMTrace.o(5912827789312L, 44054);
          return;
        }
        FaceDetectView.a(FaceDetectView.this, FaceCharacteristicsResult.nm(i));
        FaceDetectView localFaceDetectView = FaceDetectView.this;
        if (str != null) {}
        for (paramAnonymousFaceCharacteristicsResult = str;; paramAnonymousFaceCharacteristicsResult = "")
        {
          FaceDetectView.a(localFaceDetectView, paramAnonymousFaceCharacteristicsResult);
          GMTrace.o(5912827789312L, 44054);
          return;
        }
      }
      
      public final void d(FaceCharacteristicsResult paramAnonymousFaceCharacteristicsResult)
      {
        GMTrace.i(5912962007040L, 44055);
        w.d("MicroMsg.FaceDetectView", "hy: onDetectSucceed: %s", new Object[] { paramAnonymousFaceCharacteristicsResult.toString() });
        if ((FaceDetectView.a(FaceDetectView.this)) || (FaceDetectView.b(FaceDetectView.this)))
        {
          w.w("MicroMsg.FaceDetectView", "hy: already end pr paused");
          GMTrace.o(5912962007040L, 44055);
          return;
        }
        if ((FaceDetectView.c(FaceDetectView.this) != null) && (FaceDetectView.c(FaceDetectView.this).b(paramAnonymousFaceCharacteristicsResult)))
        {
          w.e("MicroMsg.FaceDetectView", "hy: motion eat result");
          FaceDetectView.a(FaceDetectView.this, FaceDetectView.c(FaceDetectView.this).awE());
          GMTrace.o(5912962007040L, 44055);
          return;
        }
        FaceDetectView.a(FaceDetectView.this, false);
        if (((FaceDetectView.c(FaceDetectView.this) != null) && (FaceDetectView.c(FaceDetectView.this).awA())) || (FaceDetectView.f(FaceDetectView.this)))
        {
          FaceDetectView.h(FaceDetectView.this);
          FaceDetectView.e(FaceDetectView.this);
        }
        GMTrace.o(5912962007040L, 44055);
      }
    };
    paramContext = getContext();
    if (paramContext == null)
    {
      w.e("MicroMsg.MMAnimationEffectLoader", "hy: context is null.");
      paramContext = null;
    }
    for (;;)
    {
      this.kZf = paramContext;
      GMTrace.o(5914841055232L, 44069);
      return;
      paramContext = AnimationUtils.loadAnimation(paramContext, a.a.gch);
      paramContext.setInterpolator(new com.tencent.mm.ui.c.a.c());
    }
  }
  
  private void axn()
  {
    GMTrace.i(5915109490688L, 44071);
    this.kWJ.setText("");
    this.kWJ.setVisibility(4);
    GMTrace.o(5915109490688L, 44071);
  }
  
  private void xC(String paramString)
  {
    GMTrace.i(5915243708416L, 44072);
    if (bg.nl(paramString).equals(this.kWJ.getText().toString()))
    {
      w.v("MicroMsg.FaceDetectView", "hy: same error. ignore");
      GMTrace.o(5915243708416L, 44072);
      return;
    }
    this.kWJ.setText(paramString);
    this.kWJ.setVisibility(0);
    this.kWJ.setAnimation(this.kZf);
    GMTrace.o(5915243708416L, 44072);
  }
  
  public final int axo()
  {
    GMTrace.i(5915377926144L, 44073);
    int i = this.kYR.kYx.getPreviewHeight();
    GMTrace.o(5915377926144L, 44073);
    return i;
  }
  
  public final void eq(boolean paramBoolean)
  {
    GMTrace.i(5915512143872L, 44074);
    if (this.kYW != null) {
      this.kYW.awC();
    }
    if (!this.jAg)
    {
      this.jAg = true;
      if (paramBoolean) {
        if (this.kYR != null) {
          f.r(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(5923699425280L, 44135);
              FaceDetectView.this.kYR.axh();
              if (this.kUX != null)
              {
                FaceProNative.FaceResult localFaceResult = FaceDetectView.j(FaceDetectView.this).axj();
                this.kUX.b(localFaceResult);
              }
              GMTrace.o(5923699425280L, 44135);
            }
          });
        }
      }
      for (;;)
      {
        w.i("MicroMsg.FaceDetectView", "hy: stopped capture face");
        this.kYY = false;
        axn();
        GMTrace.o(5915512143872L, 44074);
        return;
        if (this.kYR != null)
        {
          this.kYR.axh();
          f.kSM.kSN.kUR.awq();
        }
      }
    }
    w.w("MicroMsg.FaceDetectView", "hy: already end");
    GMTrace.o(5915512143872L, 44074);
  }
  
  public final void g(boolean paramBoolean, final String paramString)
  {
    GMTrace.i(5914975272960L, 44070);
    if (paramBoolean)
    {
      e.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5918062280704L, 44093);
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(5913230442496L, 44057);
              FaceDetectView.i(FaceDetectView.this).setVisibility(0);
              FaceDetectView.i(FaceDetectView.this).setBackgroundDrawable(new BitmapDrawable(this.kZk));
              GMTrace.o(5913230442496L, 44057);
            }
          });
          GMTrace.o(5918062280704L, 44093);
        }
      }, "face_detect_set_backgroud");
      GMTrace.o(5914975272960L, 44070);
      return;
    }
    paramString = new AlphaAnimation(1.0F, 0.0F);
    paramString.setInterpolator(new LinearInterpolator());
    paramString.setDuration(500L);
    paramString.setFillAfter(true);
    this.kZg.startAnimation(paramString);
    GMTrace.o(5914975272960L, 44070);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\views\FaceDetectView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */