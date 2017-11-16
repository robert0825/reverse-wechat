package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.aw.d;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.c.a.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChattingAnimFrame
  extends FrameLayout
{
  private static String kiy;
  private int mScreenHeight;
  private int mViewHeight;
  private int mViewWidth;
  private int vlT;
  List<MMAnimateView> wue;
  private int wuf;
  private int wug;
  private boolean wuh;
  private int wui;
  private ArrayList<Integer> wuj;
  
  static
  {
    GMTrace.i(2113794998272L, 15749);
    kiy = "";
    GMTrace.o(2113794998272L, 15749);
  }
  
  public ChattingAnimFrame(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(2112050167808L, 15736);
    this.wue = new ArrayList();
    this.wuf = 30;
    this.wug = 30;
    this.vlT = 40;
    this.wuh = false;
    this.wui = 0;
    this.wuj = new ArrayList();
    this.mScreenHeight = com.tencent.mm.br.a.eg(getContext());
    GMTrace.o(2112050167808L, 15736);
  }
  
  private void CE(int paramInt)
  {
    GMTrace.i(2112587038720L, 15740);
    if (paramInt <= 0)
    {
      w.w("MicroMsg.ChattingAnimFrame", "count is zero.");
      GMTrace.o(2112587038720L, 15740);
      return;
    }
    int i = (int)(paramInt * 0.1D);
    if (this.wuj != null) {
      this.wuj.clear();
    }
    while (this.wuj.size() < i)
    {
      int j = (int)q(0.0F, paramInt);
      if (!this.wuj.contains(Integer.valueOf(j)))
      {
        this.wuj.add(Integer.valueOf(j));
        continue;
        this.wuj = new ArrayList();
      }
    }
    GMTrace.o(2112587038720L, 15740);
  }
  
  static float q(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(2112855474176L, 15742);
    float f = (float)Math.random();
    GMTrace.o(2112855474176L, 15742);
    return f * (paramFloat2 - paramFloat1) + paramFloat1;
  }
  
  public final void a(d paramd)
  {
    GMTrace.i(2112452820992L, 15739);
    stop();
    if (paramd == null)
    {
      w.w("MicroMsg.ChattingAnimFrame", "egg info is null. ignore.");
      GMTrace.o(2112452820992L, 15739);
      return;
    }
    Object localObject = new StringBuilder();
    if (bg.nm(kiy))
    {
      kiy = com.tencent.mm.compatible.util.e.ghw.replace("/data/user/0", "/data/data");
      kiy += "/emoji";
    }
    localObject = kiy + "/egg/" + paramd.gPS;
    if (!com.tencent.mm.a.e.aZ((String)localObject))
    {
      w.w("MicroMsg.ChattingAnimFrame", "egg file isn't exist. ignore");
      GMTrace.o(2112452820992L, 15739);
      return;
    }
    setVisibility(0);
    label189:
    label204:
    int i;
    label278:
    int j;
    int k;
    boolean bool;
    if (paramd.gPU > 0)
    {
      this.wuf = paramd.gPU;
      if (this.wuf > 60) {
        this.wuf = 60;
      }
      if (paramd.gPV <= 0) {
        break label511;
      }
      this.wug = paramd.gPV;
      if (paramd.maxSize <= 0) {
        break label520;
      }
      this.vlT = paramd.maxSize;
      w.i("MicroMsg.ChattingAnimFrame", "Egg viewCount:%d minSize:%d maxSize:%d AnimType:%d reportType:%d", new Object[] { Integer.valueOf(this.wuf), Integer.valueOf(this.wug), Integer.valueOf(this.vlT), Integer.valueOf(paramd.gPT), Integer.valueOf(paramd.gPO) });
      l = 0L;
      CE(this.wuf);
      i = 0;
      if (i >= this.wuf) {
        break label632;
      }
      j = this.wug;
      k = this.vlT;
      j = (int)q(j, k);
      j = com.tencent.mm.br.a.fromDPToPix(getContext(), j);
      k = paramd.gPT;
      if ((this.wuj == null) || (!this.wuj.contains(Integer.valueOf(i)))) {
        break label529;
      }
      bool = true;
      label346:
      c localc = new c(k, j, l, bool);
      MMAnimateView localMMAnimateView = new MMAnimateView(getContext());
      localMMAnimateView.zZ((String)localObject);
      localMMAnimateView.setAnimation(localc);
      localMMAnimateView.setLayerType(2, null);
      localc.wuu = localMMAnimateView;
      localMMAnimateView.setLayoutParams(new FrameLayout.LayoutParams(localc.mSize, localc.mSize));
      this.wue.add(localMMAnimateView);
      addView(localMMAnimateView);
      j = paramd.gPT;
      k = this.wuf;
    }
    switch (j)
    {
    default: 
    case 3: 
      for (l = (int)(q(0.0F, 4.0F) * 1000.0F);; l += ((Math.abs(i - k * 0.5D - 5.0D) / (k * 6) + 0.06D) * 1000.0D))
      {
        i += 1;
        break label278;
        this.wuf = 30;
        break;
        label511:
        this.wug = 30;
        break label189;
        label520:
        this.vlT = 40;
        break label204;
        label529:
        bool = false;
        break label346;
      }
    }
    if (i < 2) {}
    for (long l = 800L + l;; l = ((Math.abs(i - k * 0.5D - 5.0D) / (k * 3) + 0.01D) * 1000.0D) + l) {
      break;
    }
    label632:
    if (this.wue != null)
    {
      paramd = this.wue.iterator();
      while (paramd.hasNext())
      {
        localObject = (View)paramd.next();
        if ((localObject != null) && ((((View)localObject).getAnimation() instanceof c))) {
          c.a((c)((View)localObject).getAnimation());
        }
      }
    }
    GMTrace.o(2112452820992L, 15739);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(2112184385536L, 15737);
    super.onFinishInflate();
    this.mViewHeight = getMeasuredHeight();
    this.mViewWidth = getMeasuredWidth();
    w.d("MicroMsg.ChattingAnimFrame", "onFinishInflate width:%d height:%d", new Object[] { Integer.valueOf(this.mViewWidth), Integer.valueOf(this.mViewHeight) });
    GMTrace.o(2112184385536L, 15737);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(2112318603264L, 15738);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.mViewHeight = (paramInt4 - paramInt2);
    this.mViewWidth = (paramInt3 - paramInt1);
    if (this.mViewHeight < this.mScreenHeight) {
      this.wuh = true;
    }
    for (this.wui = (this.mScreenHeight - this.mViewHeight);; this.wui = 0)
    {
      w.d("MicroMsg.ChattingAnimFrame", "onLayout width:%d height:%d isKeyBordUp:%b keyBordHeight:%d", new Object[] { Integer.valueOf(this.mViewWidth), Integer.valueOf(this.mViewHeight), Boolean.valueOf(this.wuh), Integer.valueOf(this.wui) });
      GMTrace.o(2112318603264L, 15738);
      return;
      this.wuh = false;
    }
  }
  
  public final void stop()
  {
    GMTrace.i(2112721256448L, 15741);
    Iterator localIterator = this.wue.iterator();
    while (localIterator.hasNext())
    {
      MMAnimateView localMMAnimateView = (MMAnimateView)localIterator.next();
      localMMAnimateView.clearAnimation();
      localMMAnimateView.recycle();
    }
    removeAllViews();
    GMTrace.o(2112721256448L, 15741);
  }
  
  class a
    implements Animation.AnimationListener
  {
    a()
    {
      GMTrace.i(2232711905280L, 16635);
      GMTrace.o(2232711905280L, 16635);
    }
    
    public void onAnimationEnd(Animation paramAnimation)
    {
      GMTrace.i(2232980340736L, 16637);
      GMTrace.o(2232980340736L, 16637);
    }
    
    public void onAnimationRepeat(Animation paramAnimation)
    {
      GMTrace.i(2233114558464L, 16638);
      GMTrace.o(2233114558464L, 16638);
    }
    
    public void onAnimationStart(Animation paramAnimation)
    {
      GMTrace.i(2232846123008L, 16636);
      GMTrace.o(2232846123008L, 16636);
    }
  }
  
  private final class b
    extends Animation
  {
    private float jpo;
    private float jpp;
    private float jpq;
    private float jpr;
    private float jps;
    private float jpt;
    private int mSize;
    private float wul;
    private float wum;
    private float wun;
    private float wuo;
    private int wup;
    private boolean wuq;
    private View.OnLayoutChangeListener wur;
    
    public b(int paramInt1, int paramInt2)
    {
      GMTrace.i(2273916747776L, 16942);
      this.wup = 0;
      this.mSize = 0;
      this.wuq = false;
      this.wur = new View.OnLayoutChangeListener()
      {
        public final void onLayoutChange(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8)
        {
          GMTrace.i(2232577687552L, 16634);
          ChattingAnimFrame.b.this.ahB();
          GMTrace.o(2232577687552L, 16634);
        }
      };
      this.wup = paramInt1;
      this.mSize = paramInt2;
      this.wuq = false;
      GMTrace.o(2273916747776L, 16942);
    }
    
    public b(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      GMTrace.i(2274050965504L, 16943);
      this.wup = 0;
      this.mSize = 0;
      this.wuq = false;
      this.wur = new View.OnLayoutChangeListener()
      {
        public final void onLayoutChange(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8)
        {
          GMTrace.i(2232577687552L, 16634);
          ChattingAnimFrame.b.this.ahB();
          GMTrace.o(2232577687552L, 16634);
        }
      };
      this.wup = paramInt1;
      this.mSize = paramInt2;
      this.wuq = paramBoolean;
      GMTrace.o(2274050965504L, 16943);
    }
    
    public final void ahB()
    {
      GMTrace.i(2274587836416L, 16947);
      this.jpq = (this.wul * ChattingAnimFrame.a(ChattingAnimFrame.this));
      this.jpr = (this.wum * ChattingAnimFrame.a(ChattingAnimFrame.this));
      if (this.wup == 2)
      {
        this.jps = (this.wun * ChattingAnimFrame.b(ChattingAnimFrame.this));
        this.jpt = (this.wuo * ChattingAnimFrame.b(ChattingAnimFrame.this));
        GMTrace.o(2274587836416L, 16947);
        return;
      }
      if (this.wup == 3)
      {
        this.jps = (this.wun * ChattingAnimFrame.c(ChattingAnimFrame.this));
        this.jpt = (this.wuo * ChattingAnimFrame.c(ChattingAnimFrame.this));
        if (ChattingAnimFrame.d(ChattingAnimFrame.this))
        {
          this.jps = (this.wun * ChattingAnimFrame.c(ChattingAnimFrame.this) - ChattingAnimFrame.e(ChattingAnimFrame.this));
          this.jpt = (this.wuo * ChattingAnimFrame.c(ChattingAnimFrame.this) - ChattingAnimFrame.e(ChattingAnimFrame.this));
        }
        if (this.jpt < 0.0F)
        {
          this.jpt = 0.0F;
          GMTrace.o(2274587836416L, 16947);
        }
      }
      else
      {
        this.jps = (this.wun * ChattingAnimFrame.c(ChattingAnimFrame.this));
        this.jpt = (this.wuo * ChattingAnimFrame.c(ChattingAnimFrame.this));
      }
      GMTrace.o(2274587836416L, 16947);
    }
    
    protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
    {
      GMTrace.i(2274319400960L, 16945);
      float f2 = this.jpq;
      float f1 = this.jps;
      if (this.jpq != this.jpr) {
        f2 = this.jpq + (this.jpr - this.jpq) * paramFloat;
      }
      if (this.jps != this.jpt)
      {
        float f3 = this.jps + (this.jpt - this.jps) * paramFloat;
        f1 = f3;
        if (this.wup == 2) {
          f1 = f3 - this.mSize;
        }
      }
      paramTransformation.getMatrix().setTranslate(f2, f1);
      if ((this.jpo != this.jpp) && (3 == this.wup))
      {
        paramFloat = this.jpo + (this.jpp - this.jpo) * paramFloat;
        paramTransformation.getMatrix().postScale(paramFloat, paramFloat);
      }
      GMTrace.o(2274319400960L, 16945);
    }
    
    protected final void finalize()
    {
      GMTrace.i(2274453618688L, 16946);
      super.finalize();
      w.i("MicroMsg.ChattingAnimFrame", "finalize!");
      ChattingAnimFrame.this.removeOnLayoutChangeListener(this.wur);
      GMTrace.o(2274453618688L, 16946);
    }
    
    public final void initialize(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      GMTrace.i(2274185183232L, 16944);
      super.initialize(paramInt1, paramInt2, paramInt3, paramInt4);
      switch (this.wup)
      {
      default: 
        this.wul = ChattingAnimFrame.q(0.1F, 0.9F);
        this.wum = ChattingAnimFrame.q(this.wul - 0.5F, this.wul + 0.5F);
        this.wun = -0.2F;
        this.wuo = 1.2F;
        setInterpolator(new LinearInterpolator());
      }
      for (;;)
      {
        if ((this.wup != 0) && (this.wup != 1)) {
          ChattingAnimFrame.this.addOnLayoutChangeListener(this.wur);
        }
        ahB();
        GMTrace.o(2274185183232L, 16944);
        return;
        this.wul = ChattingAnimFrame.q(0.1F, 0.9F);
        this.wum = ChattingAnimFrame.q(this.wul - 0.25F, this.wul + 0.25F);
        this.wun = 1.5F;
        this.wuo = -0.2F;
        setInterpolator(new LinearInterpolator());
        continue;
        this.wul = 0.0F;
        this.wum = 0.0F;
        this.wun = 1.5F;
        if (this.wuq) {}
        for (this.wuo = ChattingAnimFrame.q(0.4F, 0.55F);; this.wuo = ChattingAnimFrame.q(0.54999995F, 0.85F))
        {
          setInterpolator(new b());
          break;
        }
        this.wul = 0.0F;
        this.wum = 0.0F;
        this.wun = 0.0F;
        this.wuo = 1.0F;
        setInterpolator(new com.tencent.mm.ui.c.a.a());
        continue;
        this.wul = ChattingAnimFrame.q(0.1F, 0.9F);
        this.wum = ChattingAnimFrame.q(this.wul - 0.5F, this.wul + 0.5F);
        this.wun = 0.0F;
        this.wuo = 0.0F;
        this.jpo = 0.8F;
        this.jpp = 1.1F;
        setInterpolator(new LinearInterpolator());
      }
    }
  }
  
  final class c
    extends AnimationSet
  {
    int mSize;
    private long wut;
    MMAnimateView wuu;
    
    public c(int paramInt1, int paramInt2, long paramLong, boolean paramBoolean)
    {
      super();
      GMTrace.i(2516448182272L, 18749);
      this.mSize = paramInt2;
      switch (paramInt1)
      {
      default: 
        addAnimation(new ChattingAnimFrame.b(ChattingAnimFrame.this, 0, this.mSize));
      }
      for (;;)
      {
        setAnimationListener(new ChattingAnimFrame.a(ChattingAnimFrame.this)
        {
          public final void onAnimationEnd(Animation paramAnonymousAnimation)
          {
            GMTrace.i(2269353345024L, 16908);
            paramAnonymousAnimation = ChattingAnimFrame.c.this;
            if (paramAnonymousAnimation.wuu != null)
            {
              paramAnonymousAnimation.wuu.post(new ChattingAnimFrame.c.2(paramAnonymousAnimation));
              GMTrace.o(2269353345024L, 16908);
              return;
            }
            w.w("MicroMsg.ChattingAnimFrame", "mTargetView is NULL.");
            GMTrace.o(2269353345024L, 16908);
          }
        });
        this.wut = (500L + paramLong);
        reset();
        setDuration(ChattingAnimFrame.CF(paramInt1));
        GMTrace.o(2516448182272L, 18749);
        return;
        addAnimation(new ChattingAnimFrame.b(ChattingAnimFrame.this, 999, this.mSize));
        addAnimation(new ChattingAnimFrame.b(ChattingAnimFrame.this, paramInt1, this.mSize));
        continue;
        addAnimation(new ChattingAnimFrame.b(ChattingAnimFrame.this, paramInt1, this.mSize, paramBoolean));
        addAnimation(new ChattingAnimFrame.b(ChattingAnimFrame.this, 999, this.mSize));
        continue;
        addAnimation(new ChattingAnimFrame.b(ChattingAnimFrame.this, paramInt1, this.mSize));
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ChattingAnimFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */