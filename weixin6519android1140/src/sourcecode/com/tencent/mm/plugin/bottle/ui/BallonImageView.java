package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.a;

public class BallonImageView
  extends ImageView
{
  private Animation jph;
  
  public BallonImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7610816266240L, 56705);
    this.jph = new Animation()
    {
      private int jpi;
      private int jpj;
      private float jpk;
      private float jpl;
      private float jpm;
      private float jpn;
      private float jpo;
      private float jpp;
      private float jpq;
      private float jpr;
      private float jps;
      private float jpt;
      
      private void ahB()
      {
        GMTrace.i(7643833827328L, 56951);
        this.jpq = (this.jpk * this.jpi);
        this.jpr = (this.jpl * this.jpi);
        this.jps = (this.jpm * this.jpj);
        this.jpt = (this.jpn * this.jpj);
        GMTrace.o(7643833827328L, 56951);
      }
      
      private static float q(float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        GMTrace.i(7643968045056L, 56952);
        float f = (float)Math.random();
        GMTrace.o(7643968045056L, 56952);
        return f * (paramAnonymousFloat2 - paramAnonymousFloat1) + paramAnonymousFloat1;
      }
      
      protected final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        GMTrace.i(7643565391872L, 56949);
        float f1 = this.jpq;
        float f2 = this.jps;
        if (this.jpq != this.jpr) {
          f1 = this.jpq + (this.jpr - this.jpq) * paramAnonymousFloat;
        }
        if (this.jps != this.jpt) {
          f2 = this.jps + (this.jpt - this.jps) * paramAnonymousFloat;
        }
        paramAnonymousTransformation.getMatrix().setTranslate(f1, f2);
        f1 = this.jpo + (this.jpp - this.jpo) * paramAnonymousFloat;
        paramAnonymousTransformation.getMatrix().postScale(f1, f1);
        if (paramAnonymousFloat == 1.0F)
        {
          this.jpk = this.jpl;
          this.jpm = this.jpn;
          this.jpl = q(0.1F, 0.8F);
          this.jpn = q(0.1F, 0.3F);
          this.jpo = this.jpp;
          this.jpp = q(0.7F, 1.0F);
          ahB();
        }
        GMTrace.o(7643565391872L, 56949);
      }
      
      public final void initialize(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4)
      {
        GMTrace.i(7643699609600L, 56950);
        super.initialize(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4);
        this.jpi = paramAnonymousInt3;
        this.jpj = paramAnonymousInt4;
        ahB();
        GMTrace.o(7643699609600L, 56950);
      }
    };
    this.jph.setRepeatCount(-1);
    this.jph.setDuration(15000L);
    this.jph.setFillAfter(true);
    GMTrace.o(7610816266240L, 56705);
  }
  
  public BallonImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7610950483968L, 56706);
    this.jph = new Animation()
    {
      private int jpi;
      private int jpj;
      private float jpk;
      private float jpl;
      private float jpm;
      private float jpn;
      private float jpo;
      private float jpp;
      private float jpq;
      private float jpr;
      private float jps;
      private float jpt;
      
      private void ahB()
      {
        GMTrace.i(7643833827328L, 56951);
        this.jpq = (this.jpk * this.jpi);
        this.jpr = (this.jpl * this.jpi);
        this.jps = (this.jpm * this.jpj);
        this.jpt = (this.jpn * this.jpj);
        GMTrace.o(7643833827328L, 56951);
      }
      
      private static float q(float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        GMTrace.i(7643968045056L, 56952);
        float f = (float)Math.random();
        GMTrace.o(7643968045056L, 56952);
        return f * (paramAnonymousFloat2 - paramAnonymousFloat1) + paramAnonymousFloat1;
      }
      
      protected final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        GMTrace.i(7643565391872L, 56949);
        float f1 = this.jpq;
        float f2 = this.jps;
        if (this.jpq != this.jpr) {
          f1 = this.jpq + (this.jpr - this.jpq) * paramAnonymousFloat;
        }
        if (this.jps != this.jpt) {
          f2 = this.jps + (this.jpt - this.jps) * paramAnonymousFloat;
        }
        paramAnonymousTransformation.getMatrix().setTranslate(f1, f2);
        f1 = this.jpo + (this.jpp - this.jpo) * paramAnonymousFloat;
        paramAnonymousTransformation.getMatrix().postScale(f1, f1);
        if (paramAnonymousFloat == 1.0F)
        {
          this.jpk = this.jpl;
          this.jpm = this.jpn;
          this.jpl = q(0.1F, 0.8F);
          this.jpn = q(0.1F, 0.3F);
          this.jpo = this.jpp;
          this.jpp = q(0.7F, 1.0F);
          ahB();
        }
        GMTrace.o(7643565391872L, 56949);
      }
      
      public final void initialize(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4)
      {
        GMTrace.i(7643699609600L, 56950);
        super.initialize(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4);
        this.jpi = paramAnonymousInt3;
        this.jpj = paramAnonymousInt4;
        ahB();
        GMTrace.o(7643699609600L, 56950);
      }
    };
    this.jph.setRepeatCount(-1);
    this.jph.setDuration(15000L);
    this.jph.setFillAfter(true);
    GMTrace.o(7610950483968L, 56706);
  }
  
  public void setVisibility(int paramInt)
  {
    GMTrace.i(7611084701696L, 56707);
    if (paramInt == 0) {
      setAnimation(this.jph);
    }
    for (;;)
    {
      super.setVisibility(paramInt);
      GMTrace.o(7611084701696L, 56707);
      return;
      BackwardSupportUtil.a.c(this, this.jph);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\ui\BallonImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */