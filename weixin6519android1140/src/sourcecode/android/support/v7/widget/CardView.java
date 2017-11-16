package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v7.b.a.a;
import android.support.v7.b.a.c;
import android.support.v7.b.a.d;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class CardView
  extends FrameLayout
  implements o
{
  private static final int[] Ps = { 16842801 };
  private static final q Pt;
  private boolean Pu;
  private int Pv;
  private int Pw;
  private final Rect Px = new Rect();
  private final Rect Py = new Rect();
  private boolean hf;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21) {
      Pt = new n();
    }
    for (;;)
    {
      Pt.eE();
      return;
      if (Build.VERSION.SDK_INT >= 17) {
        Pt = new r();
      } else {
        Pt = new p();
      }
    }
  }
  
  public CardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet, 0);
  }
  
  public CardView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet, paramInt);
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.d.Ia, paramInt, a.c.HZ);
    if (paramAttributeSet.hasValue(a.d.Id)) {
      paramInt = paramAttributeSet.getColor(a.d.Id, 0);
    }
    for (;;)
    {
      float f4 = paramAttributeSet.getDimension(a.d.Ie, 0.0F);
      float f2 = paramAttributeSet.getDimension(a.d.If, 0.0F);
      float f3 = paramAttributeSet.getDimension(a.d.Ig, 0.0F);
      this.hf = paramAttributeSet.getBoolean(a.d.Ii, false);
      this.Pu = paramAttributeSet.getBoolean(a.d.Ih, true);
      int i = paramAttributeSet.getDimensionPixelSize(a.d.Ij, 0);
      this.Px.left = paramAttributeSet.getDimensionPixelSize(a.d.Il, i);
      this.Px.top = paramAttributeSet.getDimensionPixelSize(a.d.In, i);
      this.Px.right = paramAttributeSet.getDimensionPixelSize(a.d.Im, i);
      this.Px.bottom = paramAttributeSet.getDimensionPixelSize(a.d.Ik, i);
      float f1 = f3;
      if (f2 > f3) {
        f1 = f2;
      }
      this.Pv = paramAttributeSet.getDimensionPixelSize(a.d.Ic, 0);
      this.Pw = paramAttributeSet.getDimensionPixelSize(a.d.Ib, 0);
      paramAttributeSet.recycle();
      Pt.a(this, paramContext, paramInt, f4, f2, f1);
      return;
      Object localObject = getContext().obtainStyledAttributes(Ps);
      paramInt = ((TypedArray)localObject).getColor(0, 0);
      ((TypedArray)localObject).recycle();
      localObject = new float[3];
      Color.colorToHSV(paramInt, (float[])localObject);
      if (localObject[2] > 0.5F) {
        paramInt = getResources().getColor(a.a.HV);
      } else {
        paramInt = getResources().getColor(a.a.HU);
      }
    }
  }
  
  public final void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.Py.set(paramInt1, paramInt2, paramInt3, paramInt4);
    super.setPadding(this.Px.left + paramInt1, this.Px.top + paramInt2, this.Px.right + paramInt3, this.Px.bottom + paramInt4);
  }
  
  public final boolean eC()
  {
    return this.hf;
  }
  
  public final boolean eD()
  {
    return this.Pu;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (!(Pt instanceof n))
    {
      int i = View.MeasureSpec.getMode(paramInt1);
      switch (i)
      {
      default: 
        i = View.MeasureSpec.getMode(paramInt2);
        switch (i)
        {
        }
        break;
      }
      for (;;)
      {
        super.onMeasure(paramInt1, paramInt2);
        return;
        paramInt1 = View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(Pt.a(this)), View.MeasureSpec.getSize(paramInt1)), i);
        break;
        paramInt2 = View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(Pt.b(this)), View.MeasureSpec.getSize(paramInt2)), i);
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setMinimumHeight(int paramInt)
  {
    this.Pw = paramInt;
    super.setMinimumHeight(paramInt);
  }
  
  public void setMinimumWidth(int paramInt)
  {
    this.Pv = paramInt;
    super.setMinimumWidth(paramInt);
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPaddingRelative(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public final void x(int paramInt1, int paramInt2)
  {
    if (paramInt1 > this.Pv) {
      super.setMinimumWidth(paramInt1);
    }
    if (paramInt2 > this.Pw) {
      super.setMinimumHeight(paramInt2);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\android\support\v7\widget\CardView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */