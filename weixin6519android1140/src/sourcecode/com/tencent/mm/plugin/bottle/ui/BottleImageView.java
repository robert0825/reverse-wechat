package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;

public class BottleImageView
  extends ImageView
{
  int Qo;
  int Qp;
  int Qq;
  int Qr;
  Context context;
  private int jqn;
  private int jqo;
  Animation jqp;
  
  public BottleImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7651484237824L, 57008);
    this.jqp = new Animation()
    {
      private float jpk;
      private float jpl;
      private float jpm;
      private float jpn;
      private float jpo;
      private float jpp;
      private float jqq;
      private float jqr;
      private float jqs;
      private float jqt;
      private float jqu;
      private boolean jqv;
      private float jqw;
      private float jqx;
      private float jqy;
      private float jqz;
      
      protected final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        GMTrace.i(7645310222336L, 56962);
        if (this.jpk == -1.0F)
        {
          this.jpk = BottleImageView.c(BottleImageView.this);
          this.jpl = BottleImageView.d(BottleImageView.this);
          this.jpm = BottleImageView.e(BottleImageView.this);
          this.jpn = BottleImageView.f(BottleImageView.this);
          this.jqq = (this.jpk + (this.jpl - this.jpk) / 5.0F);
          this.jqr = (this.jpk + (this.jpl - this.jpk) * 3.0F / 5.0F);
          this.jqs = ((this.jqq - this.jpk) / (this.jpl - this.jpk) * (this.jpn - this.jpm) + this.jpm - BackwardSupportUtil.b.a(BottleImageView.g(BottleImageView.this), 67.0F));
          this.jqt = ((this.jqr - this.jpk) / (this.jpl - this.jpk) * (this.jpn - this.jpm) + this.jpm - BackwardSupportUtil.b.a(BottleImageView.g(BottleImageView.this), 53.0F));
        }
        paramAnonymousTransformation.setAlpha(this.jqy + (this.jqz - this.jqy) * paramAnonymousFloat);
        float f1 = this.jpo + (this.jpp - this.jpo) * paramAnonymousFloat;
        paramAnonymousTransformation.getMatrix().setScale(f1, f1, BottleImageView.a(BottleImageView.this) / 2, BottleImageView.b(BottleImageView.this) / 2);
        f1 = this.jqw;
        float f2 = this.jqx;
        float f3 = this.jqw;
        paramAnonymousTransformation.getMatrix().postRotate(f1 + (f2 - f3) * paramAnonymousFloat, BottleImageView.a(BottleImageView.this) / 2, BottleImageView.b(BottleImageView.this) / 2);
        f1 = this.jpk;
        f2 = (this.jpl - this.jpk) * paramAnonymousFloat + f1;
        if (f2 >= this.jqq) {
          f1 = (f2 - this.jpk) / (this.jqq - this.jpk) * (this.jqs - this.jpm) + this.jpm;
        }
        for (;;)
        {
          this.jqu = f1;
          paramAnonymousTransformation.getMatrix().postTranslate(f2, f1);
          if (paramAnonymousFloat == 1.0F)
          {
            this.jpk = -1.0F;
            this.jpl = -1.0F;
            this.jpm = -1.0F;
            this.jpn = -1.0F;
            this.jqv = false;
          }
          GMTrace.o(7645310222336L, 56962);
          return;
          if (f2 >= this.jqr)
          {
            if (!this.jqv)
            {
              this.jqv = true;
              this.jqs = this.jqu;
            }
            f1 = (f2 - this.jqq) / (this.jqr - this.jqq) * (this.jqt - this.jqs) + this.jqs;
          }
          else
          {
            f1 = (f2 - this.jqr) / (this.jpl - this.jqr) * (this.jpn - this.jqt) + this.jqt;
          }
        }
      }
    };
    this.context = paramContext;
    ahE();
    GMTrace.o(7651484237824L, 57008);
  }
  
  public BottleImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7651350020096L, 57007);
    this.jqp = new Animation()
    {
      private float jpk;
      private float jpl;
      private float jpm;
      private float jpn;
      private float jpo;
      private float jpp;
      private float jqq;
      private float jqr;
      private float jqs;
      private float jqt;
      private float jqu;
      private boolean jqv;
      private float jqw;
      private float jqx;
      private float jqy;
      private float jqz;
      
      protected final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        GMTrace.i(7645310222336L, 56962);
        if (this.jpk == -1.0F)
        {
          this.jpk = BottleImageView.c(BottleImageView.this);
          this.jpl = BottleImageView.d(BottleImageView.this);
          this.jpm = BottleImageView.e(BottleImageView.this);
          this.jpn = BottleImageView.f(BottleImageView.this);
          this.jqq = (this.jpk + (this.jpl - this.jpk) / 5.0F);
          this.jqr = (this.jpk + (this.jpl - this.jpk) * 3.0F / 5.0F);
          this.jqs = ((this.jqq - this.jpk) / (this.jpl - this.jpk) * (this.jpn - this.jpm) + this.jpm - BackwardSupportUtil.b.a(BottleImageView.g(BottleImageView.this), 67.0F));
          this.jqt = ((this.jqr - this.jpk) / (this.jpl - this.jpk) * (this.jpn - this.jpm) + this.jpm - BackwardSupportUtil.b.a(BottleImageView.g(BottleImageView.this), 53.0F));
        }
        paramAnonymousTransformation.setAlpha(this.jqy + (this.jqz - this.jqy) * paramAnonymousFloat);
        float f1 = this.jpo + (this.jpp - this.jpo) * paramAnonymousFloat;
        paramAnonymousTransformation.getMatrix().setScale(f1, f1, BottleImageView.a(BottleImageView.this) / 2, BottleImageView.b(BottleImageView.this) / 2);
        f1 = this.jqw;
        float f2 = this.jqx;
        float f3 = this.jqw;
        paramAnonymousTransformation.getMatrix().postRotate(f1 + (f2 - f3) * paramAnonymousFloat, BottleImageView.a(BottleImageView.this) / 2, BottleImageView.b(BottleImageView.this) / 2);
        f1 = this.jpk;
        f2 = (this.jpl - this.jpk) * paramAnonymousFloat + f1;
        if (f2 >= this.jqq) {
          f1 = (f2 - this.jpk) / (this.jqq - this.jpk) * (this.jqs - this.jpm) + this.jpm;
        }
        for (;;)
        {
          this.jqu = f1;
          paramAnonymousTransformation.getMatrix().postTranslate(f2, f1);
          if (paramAnonymousFloat == 1.0F)
          {
            this.jpk = -1.0F;
            this.jpl = -1.0F;
            this.jpm = -1.0F;
            this.jpn = -1.0F;
            this.jqv = false;
          }
          GMTrace.o(7645310222336L, 56962);
          return;
          if (f2 >= this.jqr)
          {
            if (!this.jqv)
            {
              this.jqv = true;
              this.jqs = this.jqu;
            }
            f1 = (f2 - this.jqq) / (this.jqr - this.jqq) * (this.jqt - this.jqs) + this.jqs;
          }
          else
          {
            f1 = (f2 - this.jqr) / (this.jpl - this.jqr) * (this.jpn - this.jqt) + this.jqt;
          }
        }
      }
    };
    this.context = paramContext;
    ahE();
    GMTrace.o(7651350020096L, 57007);
  }
  
  private void ahE()
  {
    GMTrace.i(7651618455552L, 57009);
    Drawable localDrawable = getBackground();
    if (localDrawable != null)
    {
      this.jqn = localDrawable.getIntrinsicWidth();
      this.jqo = localDrawable.getIntrinsicHeight();
    }
    GMTrace.o(7651618455552L, 57009);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\ui\BottleImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */