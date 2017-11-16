package com.tencent.mm.plugin.luckymoney.particles;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public final class c
{
  ValueAnimator iKQ;
  private float mKA;
  private float mKB;
  private float mKC;
  private float mKD;
  private float mKE;
  private float mKF;
  private Float mKG;
  private Float mKH;
  private Float mKI;
  private Float mKJ;
  private int mKK;
  private int mKL;
  private float mKM;
  private float mKN;
  private float mKO;
  private float mKP;
  private Float mKQ;
  private Float mKR;
  private long mKS;
  public float mKT;
  public float mKU;
  private final b mKl;
  private final d mKm;
  final ViewGroup mKn;
  public final ConfettiView mKo;
  final Queue<com.tencent.mm.plugin.luckymoney.particles.a.b> mKp;
  public final List<com.tencent.mm.plugin.luckymoney.particles.a.b> mKq;
  long mKr;
  int mKs;
  public long mKt;
  float mKu;
  float mKv;
  public Interpolator mKw;
  private Rect mKx;
  private float mKy;
  private float mKz;
  final Random random;
  
  public c(Context paramContext, b paramb, d paramd, ViewGroup paramViewGroup)
  {
    this(paramb, paramd, paramViewGroup, ConfettiView.cM(paramContext));
    GMTrace.i(9911173906432L, 73844);
    GMTrace.o(9911173906432L, 73844);
  }
  
  private c(b paramb, d paramd, ViewGroup paramViewGroup, ConfettiView paramConfettiView)
  {
    GMTrace.i(9911308124160L, 73845);
    this.random = new Random();
    this.mKp = new LinkedList();
    this.mKq = new ArrayList(300);
    this.mKl = paramb;
    this.mKm = paramd;
    this.mKn = paramViewGroup;
    this.mKo = paramConfettiView;
    this.mKo.mKq = this.mKq;
    this.mKo.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener()
    {
      public final void onViewAttachedToWindow(View paramAnonymousView)
      {
        GMTrace.i(9910234382336L, 73837);
        GMTrace.o(9910234382336L, 73837);
      }
      
      public final void onViewDetachedFromWindow(View paramAnonymousView)
      {
        GMTrace.i(9910368600064L, 73838);
        c.this.aMn();
        GMTrace.o(9910368600064L, 73838);
      }
    });
    this.mKS = -1L;
    this.mKx = new Rect(0, 0, paramViewGroup.getWidth(), paramViewGroup.getHeight());
    GMTrace.o(9911308124160L, 73845);
  }
  
  private static float a(float paramFloat1, float paramFloat2, Random paramRandom)
  {
    GMTrace.i(9912650301440L, 73855);
    float f = paramRandom.nextFloat();
    GMTrace.o(9912650301440L, 73855);
    return (f * 2.0F - 1.0F) * paramFloat2 + paramFloat1;
  }
  
  public final c aMk()
  {
    GMTrace.i(9911979212800L, 73850);
    this.mKK = 180;
    this.mKL = 180;
    GMTrace.o(9911979212800L, 73850);
    return this;
  }
  
  public final c aMl()
  {
    GMTrace.i(9912113430528L, 73851);
    this.mKO = 3.6E-4F;
    this.mKP = 1.8E-4F;
    GMTrace.o(9912113430528L, 73851);
    return this;
  }
  
  public final c aMm()
  {
    GMTrace.i(9912247648256L, 73852);
    this.mKQ = Float.valueOf(0.36F);
    this.mKR = Float.valueOf(0.0F);
    GMTrace.o(9912247648256L, 73852);
    return this;
  }
  
  public final void aMn()
  {
    GMTrace.i(9912381865984L, 73853);
    if (this.iKQ != null) {
      this.iKQ.cancel();
    }
    this.mKo.aMn();
    GMTrace.o(9912381865984L, 73853);
  }
  
  public final c ad(float paramFloat)
  {
    GMTrace.i(9911710777344L, 73848);
    this.mKC = (paramFloat / 1000000.0F);
    this.mKD = 0.0F;
    GMTrace.o(9911710777344L, 73848);
    return this;
  }
  
  public final c ae(float paramFloat)
  {
    GMTrace.i(9911844995072L, 73849);
    this.mKE = (paramFloat / 1000000.0F);
    this.mKF = 0.0F;
    GMTrace.o(9911844995072L, 73849);
    return this;
  }
  
  public final c w(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(9911442341888L, 73846);
    this.mKy = (paramFloat1 / 1000.0F);
    this.mKz = (paramFloat2 / 1000.0F);
    GMTrace.o(9911442341888L, 73846);
    return this;
  }
  
  public final c x(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(9911576559616L, 73847);
    this.mKA = (paramFloat1 / 1000.0F);
    this.mKB = (paramFloat2 / 1000.0F);
    GMTrace.o(9911576559616L, 73847);
    return this;
  }
  
  final void y(int paramInt, long paramLong)
  {
    GMTrace.i(9912516083712L, 73854);
    int i = 0;
    if (i < paramInt)
    {
      Object localObject2 = (com.tencent.mm.plugin.luckymoney.particles.a.b)this.mKp.poll();
      Object localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = this.mKl.b(this.random);
      }
      localObject2 = this.mKm;
      Random localRandom = this.random;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mLj = 0L;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mLl = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mLk = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mLn = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mLm = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mKE = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mKC = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mKI = null;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mKG = null;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mLp = null;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mLo = null;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mLq = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mLr = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mKO = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mKQ = null;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mLs = null;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mKS = 0L;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mLt = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mLu = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mKw = null;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mLw = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mLv = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mLx = 0.0F;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).alpha = 255;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mLy = false;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mLa = false;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mLj = paramLong;
      float f1 = localRandom.nextFloat();
      float f2 = ((d)localObject2).mKW;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mLk = (f1 * (((d)localObject2).mKY - ((d)localObject2).mKW) + f2);
      f1 = localRandom.nextFloat();
      f2 = ((d)localObject2).mKX;
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mLl = ((((d)localObject2).mKZ - ((d)localObject2).mKX) * f1 + f2);
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mLm = a(this.mKy, this.mKz, localRandom);
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mLn = a(this.mKA, this.mKB, localRandom);
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mKC = a(this.mKC, this.mKD, localRandom);
      ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mKE = a(this.mKE, this.mKF, localRandom);
      if (this.mKG == null)
      {
        localObject2 = null;
        label389:
        ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mKG = ((Float)localObject2);
        if (this.mKI != null) {
          break label579;
        }
        localObject2 = null;
        label406:
        ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mKI = ((Float)localObject2);
        ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mLq = a(this.mKK, this.mKL, localRandom);
        ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mLr = a(this.mKM, this.mKN, localRandom);
        ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mKO = a(this.mKO, this.mKP, localRandom);
        if (this.mKQ != null) {
          break label606;
        }
      }
      label579:
      label606:
      for (localObject2 = null;; localObject2 = Float.valueOf(a(this.mKQ.floatValue(), this.mKR.floatValue(), localRandom)))
      {
        ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mKQ = ((Float)localObject2);
        ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mKS = this.mKS;
        ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mKw = this.mKw;
        ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).mLt = a(this.mKT, this.mKU, localRandom);
        ((com.tencent.mm.plugin.luckymoney.particles.a.b)localObject1).g(this.mKx);
        this.mKq.add(localObject1);
        i += 1;
        break;
        localObject2 = Float.valueOf(a(this.mKG.floatValue(), this.mKH.floatValue(), localRandom));
        break label389;
        localObject2 = Float.valueOf(a(this.mKI.floatValue(), this.mKJ.floatValue(), localRandom));
        break label406;
      }
    }
    GMTrace.o(9912516083712L, 73854);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\particles\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */