package android.support.v4.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.ref.WeakReference;

public class PagerTitleStrip
  extends ViewGroup
  implements ViewPager.a
{
  private static final int[] xg = { 16842804, 16842901, 16842904, 16842927 };
  private static final int[] xh = { 16843660 };
  private static final b xk = new c();
  private int tl;
  ViewPager wV;
  TextView wW;
  TextView wX;
  TextView wY;
  private int wZ = -1;
  private float xa = -1.0F;
  int xb;
  private boolean xc;
  private boolean xd;
  private final a xe = new a((byte)0);
  private WeakReference<u> xf;
  private int xi;
  int xj;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      xk = new d();
      return;
    }
  }
  
  public PagerTitleStrip(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TextView localTextView = new TextView(paramContext);
    this.wW = localTextView;
    addView(localTextView);
    localTextView = new TextView(paramContext);
    this.wX = localTextView;
    addView(localTextView);
    localTextView = new TextView(paramContext);
    this.wY = localTextView;
    addView(localTextView);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, xg);
    int i = paramAttributeSet.getResourceId(0, 0);
    if (i != 0)
    {
      this.wW.setTextAppearance(paramContext, i);
      this.wX.setTextAppearance(paramContext, i);
      this.wY.setTextAppearance(paramContext, i);
    }
    int j = paramAttributeSet.getDimensionPixelSize(1, 0);
    if (j != 0)
    {
      float f = j;
      this.wW.setTextSize(0, f);
      this.wX.setTextSize(0, f);
      this.wY.setTextSize(0, f);
    }
    if (paramAttributeSet.hasValue(2))
    {
      j = paramAttributeSet.getColor(2, 0);
      this.wW.setTextColor(j);
      this.wX.setTextColor(j);
      this.wY.setTextColor(j);
    }
    this.tl = paramAttributeSet.getInteger(3, 80);
    paramAttributeSet.recycle();
    this.xj = this.wX.getTextColors().getDefaultColor();
    this.xi = 153;
    j = this.xi << 24 | this.xj & 0xFFFFFF;
    this.wW.setTextColor(j);
    this.wY.setTextColor(j);
    this.wW.setEllipsize(TextUtils.TruncateAt.END);
    this.wX.setEllipsize(TextUtils.TruncateAt.END);
    this.wY.setEllipsize(TextUtils.TruncateAt.END);
    if (i != 0)
    {
      paramAttributeSet = paramContext.obtainStyledAttributes(i, xh);
      bool = paramAttributeSet.getBoolean(0, false);
      paramAttributeSet.recycle();
    }
    if (bool)
    {
      b(this.wW);
      b(this.wX);
      b(this.wY);
    }
    for (;;)
    {
      this.xb = ((int)(paramContext.getResources().getDisplayMetrics().density * 16.0F));
      return;
      this.wW.setSingleLine();
      this.wX.setSingleLine();
      this.wY.setSingleLine();
    }
  }
  
  private static void b(TextView paramTextView)
  {
    xk.b(paramTextView);
  }
  
  public void U(int paramInt)
  {
    this.xb = paramInt;
    requestLayout();
  }
  
  void a(int paramInt, float paramFloat, boolean paramBoolean)
  {
    int m;
    int i4;
    int k;
    int i3;
    int n;
    int i;
    int i2;
    int i1;
    int j;
    int i5;
    int i7;
    int i6;
    int i8;
    if (paramInt != this.wZ)
    {
      a(paramInt, this.wV.xH);
      this.xd = true;
      m = this.wW.getMeasuredWidth();
      i4 = this.wX.getMeasuredWidth();
      k = this.wY.getMeasuredWidth();
      i3 = i4 / 2;
      n = getWidth();
      i = getHeight();
      i2 = getPaddingLeft();
      i1 = getPaddingRight();
      paramInt = getPaddingTop();
      j = getPaddingBottom();
      i5 = i1 + i3;
      float f2 = 0.5F + paramFloat;
      float f1 = f2;
      if (f2 > 1.0F) {
        f1 = f2 - 1.0F;
      }
      i3 = n - i5 - (int)(f1 * (n - (i2 + i3) - i5)) - i3;
      i4 = i3 + i4;
      i7 = this.wW.getBaseline();
      i6 = this.wX.getBaseline();
      i5 = this.wY.getBaseline();
      i8 = Math.max(Math.max(i7, i6), i5);
      i7 = i8 - i7;
      i6 = i8 - i6;
      i5 = i8 - i5;
      i8 = this.wW.getMeasuredHeight();
      int i9 = this.wX.getMeasuredHeight();
      int i10 = this.wY.getMeasuredHeight();
      i8 = Math.max(Math.max(i8 + i7, i9 + i6), i10 + i5);
      switch (this.tl & 0x70)
      {
      default: 
        j = paramInt + i7;
        i = paramInt + i6;
        paramInt += i5;
      }
    }
    for (;;)
    {
      this.wX.layout(i3, i, i4, this.wX.getMeasuredHeight() + i);
      i = Math.min(i2, i3 - this.xb - m);
      this.wW.layout(i, j, m + i, this.wW.getMeasuredHeight() + j);
      i = Math.max(n - i1 - k, this.xb + i4);
      this.wY.layout(i, paramInt, i + k, this.wY.getMeasuredHeight() + paramInt);
      this.xa = paramFloat;
      this.xd = false;
      return;
      if ((paramBoolean) || (paramFloat != this.xa)) {
        break;
      }
      return;
      paramInt = (i - paramInt - j - i8) / 2;
      j = paramInt + i7;
      i = paramInt + i6;
      paramInt += i5;
      continue;
      paramInt = i - j - i8;
      j = paramInt + i7;
      i = paramInt + i6;
      paramInt += i5;
    }
  }
  
  final void a(int paramInt, u paramu)
  {
    Object localObject2 = null;
    int i;
    if (paramu != null)
    {
      i = paramu.getCount();
      this.xc = true;
      if ((paramInt <= 0) || (paramu == null)) {
        break label228;
      }
    }
    label228:
    for (Object localObject1 = paramu.bJ();; localObject1 = null)
    {
      this.wW.setText((CharSequence)localObject1);
      TextView localTextView = this.wX;
      if ((paramu != null) && (paramInt < i)) {}
      for (localObject1 = paramu.bJ();; localObject1 = null)
      {
        localTextView.setText((CharSequence)localObject1);
        localObject1 = localObject2;
        if (paramInt + 1 < i)
        {
          localObject1 = localObject2;
          if (paramu != null) {
            localObject1 = paramu.bJ();
          }
        }
        this.wY.setText((CharSequence)localObject1);
        i = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int)((getWidth() - getPaddingLeft() - getPaddingRight()) * 0.8F)), Integer.MIN_VALUE);
        int j = View.MeasureSpec.makeMeasureSpec(Math.max(0, getHeight() - getPaddingTop() - getPaddingBottom()), Integer.MIN_VALUE);
        this.wW.measure(i, j);
        this.wX.measure(i, j);
        this.wY.measure(i, j);
        this.wZ = paramInt;
        if (!this.xd) {
          a(paramInt, this.xa, false);
        }
        this.xc = false;
        return;
        i = 0;
        break;
      }
    }
  }
  
  final void a(u paramu1, u paramu2)
  {
    if (paramu1 != null)
    {
      paramu1.unregisterDataSetObserver(this.xe);
      this.xf = null;
    }
    if (paramu2 != null)
    {
      paramu2.registerDataSetObserver(this.xe);
      this.xf = new WeakReference(paramu2);
    }
    if (this.wV != null)
    {
      this.wZ = -1;
      this.xa = -1.0F;
      a(this.wV.xI, paramu2);
      requestLayout();
    }
  }
  
  int getMinHeight()
  {
    int i = 0;
    Drawable localDrawable = getBackground();
    if (localDrawable != null) {
      i = localDrawable.getIntrinsicHeight();
    }
    return i;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    Object localObject = getParent();
    if (!(localObject instanceof ViewPager)) {
      throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }
    localObject = (ViewPager)localObject;
    u localu = ((ViewPager)localObject).xH;
    ((ViewPager)localObject).a(this.xe);
    ((ViewPager)localObject).yt = this.xe;
    this.wV = ((ViewPager)localObject);
    if (this.xf != null) {}
    for (localObject = (u)this.xf.get();; localObject = null)
    {
      a((u)localObject, localu);
      return;
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.wV != null)
    {
      a(this.wV.xH, null);
      this.wV.a(null);
      this.wV.yt = null;
      this.wV = null;
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f = 0.0F;
    if (this.wV != null)
    {
      if (this.xa >= 0.0F) {
        f = this.xa;
      }
      a(this.wZ, f, true);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (View.MeasureSpec.getMode(paramInt1) != 1073741824) {
      throw new IllegalStateException("Must measure with an exact width");
    }
    int j = getPaddingTop() + getPaddingBottom();
    int k = getChildMeasureSpec(paramInt2, j, -2);
    int i = View.MeasureSpec.getSize(paramInt1);
    paramInt1 = getChildMeasureSpec(paramInt1, (int)(i * 0.2F), -2);
    this.wW.measure(paramInt1, k);
    this.wX.measure(paramInt1, k);
    this.wY.measure(paramInt1, k);
    if (View.MeasureSpec.getMode(paramInt2) == 1073741824) {}
    for (paramInt1 = View.MeasureSpec.getSize(paramInt2);; paramInt1 = Math.max(getMinHeight(), j + paramInt1))
    {
      setMeasuredDimension(i, z.resolveSizeAndState(paramInt1, paramInt2, z.N(this.wX) << 16));
      return;
      paramInt1 = this.wX.getMeasuredHeight();
    }
  }
  
  public void requestLayout()
  {
    if (!this.xc) {
      super.requestLayout();
    }
  }
  
  private final class a
    extends DataSetObserver
    implements ViewPager.d, ViewPager.e
  {
    private int xl;
    
    private a() {}
    
    public final void V(int paramInt)
    {
      float f = 0.0F;
      if (this.xl == 0)
      {
        PagerTitleStrip.this.a(PagerTitleStrip.this.wV.xI, PagerTitleStrip.this.wV.xH);
        if (PagerTitleStrip.a(PagerTitleStrip.this) >= 0.0F) {
          f = PagerTitleStrip.a(PagerTitleStrip.this);
        }
        PagerTitleStrip.this.a(PagerTitleStrip.this.wV.xI, f, true);
      }
    }
    
    public final void W(int paramInt)
    {
      this.xl = paramInt;
    }
    
    public final void a(int paramInt1, float paramFloat, int paramInt2)
    {
      paramInt2 = paramInt1;
      if (paramFloat > 0.5F) {
        paramInt2 = paramInt1 + 1;
      }
      PagerTitleStrip.this.a(paramInt2, paramFloat, false);
    }
    
    public final void b(u paramu1, u paramu2)
    {
      PagerTitleStrip.this.a(paramu1, paramu2);
    }
    
    public final void onChanged()
    {
      float f = 0.0F;
      PagerTitleStrip.this.a(PagerTitleStrip.this.wV.xI, PagerTitleStrip.this.wV.xH);
      if (PagerTitleStrip.a(PagerTitleStrip.this) >= 0.0F) {
        f = PagerTitleStrip.a(PagerTitleStrip.this);
      }
      PagerTitleStrip.this.a(PagerTitleStrip.this.wV.xI, f, true);
    }
  }
  
  static abstract interface b
  {
    public abstract void b(TextView paramTextView);
  }
  
  static final class c
    implements PagerTitleStrip.b
  {
    public final void b(TextView paramTextView)
    {
      paramTextView.setSingleLine();
    }
  }
  
  static final class d
    implements PagerTitleStrip.b
  {
    public final void b(TextView paramTextView)
    {
      paramTextView.setTransformationMethod(new v.a(paramTextView.getContext()));
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\view\PagerTitleStrip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */