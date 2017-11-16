package android.support.design.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.design.a.d;
import android.support.design.a.f;
import android.support.design.a.h;
import android.support.design.a.i;
import android.support.v4.e.i.a;
import android.support.v4.e.i.b;
import android.support.v4.e.i.c;
import android.support.v4.view.z;
import android.support.v4.widget.r;
import android.support.v7.app.ActionBar.a;
import android.support.v7.widget.h;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class TabLayout
  extends HorizontalScrollView
{
  private static final i.a<b> jf = new i.c();
  private final ArrayList<b> jg = new ArrayList();
  private b jh;
  private final a ji;
  private int jj;
  private int jk;
  private int jl;
  private int jm;
  private int jn;
  private ColorStateList jo;
  private float jp;
  private float jq;
  private final int jr;
  private int js = Integer.MAX_VALUE;
  private final int jt;
  private final int ju;
  private final int jv;
  private int jw;
  private int jx;
  private u jy;
  private final i.a<c> jz = new i.b(12);
  private int mMode;
  
  public TabLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public TabLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    t.d(paramContext);
    setHorizontalScrollBarEnabled(false);
    this.ji = new a(paramContext);
    super.addView(this.ji, 0, new FrameLayout.LayoutParams(-2, -1));
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.i.cu, paramInt, a.h.aT);
    a locala = this.ji;
    paramInt = paramAttributeSet.getDimensionPixelSize(a.i.cz, 0);
    if (locala.jB != paramInt)
    {
      locala.jB = paramInt;
      z.F(locala);
    }
    locala = this.ji;
    paramInt = paramAttributeSet.getColor(a.i.cy, 0);
    if (locala.jC.getColor() != paramInt)
    {
      locala.jC.setColor(paramInt);
      z.F(locala);
    }
    paramInt = paramAttributeSet.getDimensionPixelSize(a.i.cD, 0);
    this.jm = paramInt;
    this.jl = paramInt;
    this.jk = paramInt;
    this.jj = paramInt;
    this.jj = paramAttributeSet.getDimensionPixelSize(a.i.cG, this.jj);
    this.jk = paramAttributeSet.getDimensionPixelSize(a.i.cH, this.jk);
    this.jl = paramAttributeSet.getDimensionPixelSize(a.i.cF, this.jl);
    this.jm = paramAttributeSet.getDimensionPixelSize(a.i.cE, this.jm);
    this.jn = paramAttributeSet.getResourceId(a.i.cJ, a.h.aL);
    paramContext = paramContext.obtainStyledAttributes(this.jn, a.i.TextAppearance);
    for (;;)
    {
      try
      {
        this.jp = paramContext.getDimensionPixelSize(a.i.TextAppearance_android_textSize, 0);
        this.jo = paramContext.getColorStateList(a.i.TextAppearance_android_textColor);
        paramContext.recycle();
        if (paramAttributeSet.hasValue(a.i.cK)) {
          this.jo = paramAttributeSet.getColorStateList(a.i.cK);
        }
        if (paramAttributeSet.hasValue(a.i.cI))
        {
          paramInt = paramAttributeSet.getColor(a.i.cI, 0);
          int i = this.jo.getDefaultColor();
          this.jo = new ColorStateList(new int[][] { SELECTED_STATE_SET, EMPTY_STATE_SET }, new int[] { paramInt, i });
        }
        this.jt = paramAttributeSet.getDimensionPixelSize(a.i.cB, -1);
        this.ju = paramAttributeSet.getDimensionPixelSize(a.i.cA, -1);
        this.jr = paramAttributeSet.getResourceId(a.i.cv, 0);
        this.jw = paramAttributeSet.getDimensionPixelSize(a.i.cw, 0);
        this.mMode = paramAttributeSet.getInt(a.i.cC, 1);
        this.jx = paramAttributeSet.getInt(a.i.cx, 0);
        paramAttributeSet.recycle();
        paramContext = getResources();
        this.jq = paramContext.getDimensionPixelSize(a.d.ar);
        this.jv = paramContext.getDimensionPixelSize(a.d.aq);
        if (this.mMode != 0) {
          break label597;
        }
        paramInt = Math.max(0, this.jw - this.jj);
        z.c(this.ji, paramInt, 0, 0, 0);
        switch (this.mMode)
        {
        default: 
          j(true);
          return;
        }
      }
      finally
      {
        paramContext.recycle();
      }
      this.ji.setGravity(1);
      continue;
      this.ji.setGravity(8388611);
      continue;
      label597:
      paramInt = 0;
    }
  }
  
  private void A(int paramInt)
  {
    int j = this.ji.getChildCount();
    if ((paramInt < j) && (!this.ji.getChildAt(paramInt).isSelected()))
    {
      int i = 0;
      if (i < j)
      {
        View localView = this.ji.getChildAt(i);
        if (i == paramInt) {}
        for (boolean bool = true;; bool = false)
        {
          localView.setSelected(bool);
          i += 1;
          break;
        }
      }
    }
  }
  
  private int a(int paramInt, float paramFloat)
  {
    int i = 0;
    int j = 0;
    View localView2;
    View localView1;
    if (this.mMode == 0)
    {
      localView2 = this.ji.getChildAt(paramInt);
      if (paramInt + 1 >= this.ji.getChildCount()) {
        break label111;
      }
      localView1 = this.ji.getChildAt(paramInt + 1);
      if (localView2 == null) {
        break label117;
      }
    }
    label111:
    label117:
    for (paramInt = localView2.getWidth();; paramInt = 0)
    {
      i = j;
      if (localView1 != null) {
        i = localView1.getWidth();
      }
      j = localView2.getLeft();
      i = (int)((i + paramInt) * 0.0F * 0.5F) + j + localView2.getWidth() / 2 - getWidth() / 2;
      return i;
      localView1 = null;
      break;
    }
  }
  
  private void a(b paramb, int paramInt)
  {
    paramb.jP = paramInt;
    this.jg.add(paramInt, paramb);
    int i = this.jg.size();
    paramInt += 1;
    while (paramInt < i)
    {
      ((b)this.jg.get(paramInt)).jP = paramInt;
      paramInt += 1;
    }
  }
  
  private void a(LinearLayout.LayoutParams paramLayoutParams)
  {
    if ((this.mMode == 1) && (this.jx == 0))
    {
      paramLayoutParams.width = 0;
      paramLayoutParams.weight = 1.0F;
      return;
    }
    paramLayoutParams.width = -2;
    paramLayoutParams.weight = 0.0F;
  }
  
  private int ao()
  {
    if (this.jt != -1) {
      return this.jt;
    }
    if (this.mMode == 0) {
      return this.jv;
    }
    return 0;
  }
  
  private void j(boolean paramBoolean)
  {
    int i = 0;
    while (i < this.ji.getChildCount())
    {
      View localView = this.ji.getChildAt(i);
      localView.setMinimumWidth(ao());
      a((LinearLayout.LayoutParams)localView.getLayoutParams());
      if (paramBoolean) {
        localView.requestLayout();
      }
      i += 1;
    }
  }
  
  private void t(View paramView)
  {
    Object localObject2;
    b localb;
    if ((paramView instanceof TabItem))
    {
      localObject2 = (TabItem)paramView;
      localb = (b)jf.bE();
      if (localb != null) {
        break label321;
      }
      localb = new b();
    }
    label321:
    for (;;)
    {
      localb.jR = this;
      if (this.jz != null) {}
      boolean bool;
      for (paramView = (c)this.jz.bE();; paramView = null)
      {
        localObject1 = paramView;
        if (paramView == null) {
          localObject1 = new c(getContext());
        }
        c.a((c)localObject1, localb);
        ((c)localObject1).setFocusable(true);
        ((c)localObject1).setMinimumWidth(ao());
        localb.jS = ((c)localObject1);
        if (((TabItem)localObject2).mText != null)
        {
          localb.mText = ((TabItem)localObject2).mText;
          localb.ar();
        }
        if (((TabItem)localObject2).jd != null)
        {
          localb.jd = ((TabItem)localObject2).jd;
          localb.ar();
        }
        if (((TabItem)localObject2).je != 0)
        {
          int i = ((TabItem)localObject2).je;
          localb.jQ = LayoutInflater.from(localb.jS.getContext()).inflate(i, localb.jS, false);
          localb.ar();
        }
        bool = this.jg.isEmpty();
        if (localb.jR == this) {
          break;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
      }
      paramView = localb.jS;
      Object localObject1 = this.ji;
      localObject2 = new LinearLayout.LayoutParams(-2, -1);
      a((LinearLayout.LayoutParams)localObject2);
      ((a)localObject1).addView(paramView, (ViewGroup.LayoutParams)localObject2);
      if (bool) {
        paramView.setSelected(true);
      }
      a(localb, this.jg.size());
      if (bool) {
        localb.select();
      }
      return;
      throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }
  }
  
  private void x(int paramInt)
  {
    int i = Math.round(paramInt + 0.0F);
    if ((i < 0) || (i >= this.ji.getChildCount())) {
      return;
    }
    a locala = this.ji;
    if ((locala.jH != null) && (locala.jH.ky.isRunning())) {
      locala.jH.ky.cancel();
    }
    locala.jD = paramInt;
    locala.jE = 0.0F;
    locala.ap();
    if ((this.jy != null) && (this.jy.ky.isRunning())) {
      this.jy.ky.cancel();
    }
    scrollTo(a(paramInt, 0.0F), 0);
    A(i);
  }
  
  private int y(int paramInt)
  {
    return Math.round(getResources().getDisplayMetrics().density * paramInt);
  }
  
  private void z(int paramInt)
  {
    int k = 0;
    if (paramInt == -1) {
      return;
    }
    a locala;
    int m;
    if ((getWindowToken() != null) && (z.aj(this)))
    {
      locala = this.ji;
      m = locala.getChildCount();
      i = 0;
    }
    for (;;)
    {
      j = k;
      if (i < m)
      {
        if (locala.getChildAt(i).getWidth() <= 0) {
          j = 1;
        }
      }
      else
      {
        if (j == 0) {
          break;
        }
        x(paramInt);
        return;
      }
      i += 1;
    }
    int i = getScrollX();
    int j = a(paramInt, 0.0F);
    if (i != j)
    {
      if (this.jy == null)
      {
        this.jy = aa.av();
        this.jy.setInterpolator(a.dI);
        this.jy.setDuration(300);
        this.jy.a(new u.c()
        {
          public final void a(u paramAnonymousu)
          {
            TabLayout.this.scrollTo(paramAnonymousu.ky.aw(), 0);
          }
        });
      }
      this.jy.e(i, j);
      this.jy.ky.start();
    }
    this.ji.d(paramInt, 300);
  }
  
  final void a(b paramb)
  {
    if (this.jh == paramb)
    {
      if (this.jh != null) {
        z(paramb.jP);
      }
      return;
    }
    int i;
    if (paramb != null)
    {
      i = paramb.jP;
      if (i != -1) {
        A(i);
      }
      if (((this.jh != null) && (this.jh.jP != -1)) || (i == -1)) {
        break label82;
      }
      x(i);
    }
    for (;;)
    {
      this.jh = paramb;
      return;
      i = -1;
      break;
      label82:
      z(i);
    }
  }
  
  public void addView(View paramView)
  {
    t(paramView);
  }
  
  public void addView(View paramView, int paramInt)
  {
    t(paramView);
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    t(paramView);
  }
  
  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    t(paramView);
  }
  
  public FrameLayout.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return generateDefaultLayoutParams();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int j = 1;
    int k = this.jg.size();
    int i = 0;
    Object localObject;
    if (i < k)
    {
      localObject = (b)this.jg.get(i);
      if ((localObject == null) || (((b)localObject).jd == null) || (TextUtils.isEmpty(((b)localObject).mText))) {}
    }
    for (i = 1;; i = 0)
    {
      if (i != 0)
      {
        i = 72;
        label66:
        i = y(i) + getPaddingTop() + getPaddingBottom();
        switch (View.MeasureSpec.getMode(paramInt2))
        {
        default: 
          label112:
          i = View.MeasureSpec.getSize(paramInt1);
          if (View.MeasureSpec.getMode(paramInt1) != 0)
          {
            if (this.ju > 0)
            {
              i = this.ju;
              label136:
              this.js = i;
            }
          }
          else
          {
            super.onMeasure(paramInt1, paramInt2);
            if (getChildCount() == 1)
            {
              localObject = getChildAt(0);
              switch (this.mMode)
              {
              default: 
                paramInt1 = 0;
              }
            }
          }
          break;
        }
      }
      for (;;)
      {
        if (paramInt1 != 0)
        {
          paramInt1 = getChildMeasureSpec(paramInt2, getPaddingTop() + getPaddingBottom(), ((View)localObject).getLayoutParams().height);
          ((View)localObject).measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), paramInt1);
        }
        return;
        i += 1;
        break;
        i = 48;
        break label66;
        paramInt2 = View.MeasureSpec.makeMeasureSpec(Math.min(i, View.MeasureSpec.getSize(paramInt2)), 1073741824);
        break label112;
        paramInt2 = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        break label112;
        i -= y(56);
        break label136;
        if (((View)localObject).getMeasuredWidth() < getMeasuredWidth()) {
          paramInt1 = 1;
        } else {
          paramInt1 = 0;
        }
      }
      if (((View)localObject).getMeasuredWidth() != getMeasuredWidth()) {}
      for (paramInt1 = j;; paramInt1 = 0) {
        break;
      }
    }
  }
  
  public boolean shouldDelayChildPressedState()
  {
    boolean bool = false;
    if (Math.max(0, this.ji.getWidth() - getWidth() - getPaddingLeft() - getPaddingRight()) > 0) {
      bool = true;
    }
    return bool;
  }
  
  private final class a
    extends LinearLayout
  {
    int jB;
    final Paint jC;
    int jD = -1;
    float jE;
    private int jF = -1;
    private int jG = -1;
    u jH;
    
    a(Context paramContext)
    {
      super();
      setWillNotDraw(false);
      this.jC = new Paint();
    }
    
    private void c(int paramInt1, int paramInt2)
    {
      if ((paramInt1 != this.jF) || (paramInt2 != this.jG))
      {
        this.jF = paramInt1;
        this.jG = paramInt2;
        z.F(this);
      }
    }
    
    final void ap()
    {
      View localView = getChildAt(this.jD);
      int k;
      int i;
      float f1;
      float f2;
      float f3;
      if ((localView != null) && (localView.getWidth() > 0))
      {
        int m = localView.getLeft();
        k = localView.getRight();
        i = m;
        j = k;
        if (this.jE > 0.0F)
        {
          i = m;
          j = k;
          if (this.jD < getChildCount() - 1)
          {
            localView = getChildAt(this.jD + 1);
            f1 = this.jE;
            f2 = localView.getLeft();
            f3 = this.jE;
            i = (int)(m * (1.0F - f3) + f1 * f2);
            f1 = this.jE;
            f2 = localView.getRight();
            f3 = this.jE;
          }
        }
      }
      for (int j = (int)(k * (1.0F - f3) + f2 * f1);; j = -1)
      {
        c(i, j);
        return;
        i = -1;
      }
    }
    
    final void d(final int paramInt1, int paramInt2)
    {
      if ((this.jH != null) && (this.jH.ky.isRunning())) {
        this.jH.ky.cancel();
      }
      final int i;
      Object localObject;
      if (z.J(this) == 1)
      {
        i = 1;
        localObject = getChildAt(paramInt1);
        if (localObject != null) {
          break label62;
        }
        ap();
      }
      for (;;)
      {
        return;
        i = 0;
        break;
        label62:
        final int k = ((View)localObject).getLeft();
        final int m = ((View)localObject).getRight();
        final int j;
        if (Math.abs(paramInt1 - this.jD) <= 1)
        {
          i = this.jF;
          j = this.jG;
        }
        while ((i != k) || (j != m))
        {
          localObject = aa.av();
          this.jH = ((u)localObject);
          ((u)localObject).setInterpolator(a.dI);
          ((u)localObject).setDuration(paramInt2);
          ((u)localObject).e(0.0F, 1.0F);
          ((u)localObject).a(new u.c()
          {
            public final void a(u paramAnonymousu)
            {
              float f = paramAnonymousu.ky.getAnimatedFraction();
              TabLayout.a.a(TabLayout.a.this, a.a(i, k, f), a.a(j, m, f));
            }
          });
          u.b local2 = new u.b()
          {
            public final void aq()
            {
              TabLayout.a.a(TabLayout.a.this, paramInt1);
              TabLayout.a.a(TabLayout.a.this);
            }
          };
          ((u)localObject).ky.a(new u.2((u)localObject, local2));
          ((u)localObject).ky.start();
          return;
          j = TabLayout.a(TabLayout.this, 24);
          if (paramInt1 < this.jD)
          {
            if (i == 0)
            {
              j = m + j;
              i = j;
            }
          }
          else if (i != 0)
          {
            j = m + j;
            i = j;
            continue;
          }
          j = k - j;
          i = j;
        }
      }
    }
    
    public final void draw(Canvas paramCanvas)
    {
      super.draw(paramCanvas);
      if ((this.jF >= 0) && (this.jG > this.jF)) {
        paramCanvas.drawRect(this.jF, getHeight() - this.jB, this.jG, getHeight(), this.jC);
      }
    }
    
    protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      if ((this.jH != null) && (this.jH.ky.isRunning()))
      {
        this.jH.ky.cancel();
        long l = this.jH.ky.getDuration();
        paramInt1 = this.jD;
        float f = this.jH.ky.getAnimatedFraction();
        d(paramInt1, Math.round((float)l * (1.0F - f)));
        return;
      }
      ap();
    }
    
    protected final void onMeasure(int paramInt1, int paramInt2)
    {
      int m = 0;
      super.onMeasure(paramInt1, paramInt2);
      if (View.MeasureSpec.getMode(paramInt1) != 1073741824) {
        break label18;
      }
      label18:
      while ((TabLayout.j(TabLayout.this) != 1) || (TabLayout.m(TabLayout.this) != 1)) {
        return;
      }
      int n = getChildCount();
      int k = 0;
      int j = 0;
      label53:
      Object localObject;
      if (k < n)
      {
        localObject = getChildAt(k);
        if (((View)localObject).getVisibility() != 0) {
          break label237;
        }
      }
      label136:
      label222:
      label234:
      label237:
      for (int i = Math.max(j, ((View)localObject).getMeasuredWidth());; i = j)
      {
        k += 1;
        j = i;
        break label53;
        if (j <= 0) {
          break;
        }
        i = TabLayout.a(TabLayout.this, 16);
        if (j * n <= getMeasuredWidth() - i * 2)
        {
          k = 0;
          i = m;
          m = i;
          if (k >= n) {
            break label222;
          }
          localObject = (LinearLayout.LayoutParams)getChildAt(k).getLayoutParams();
          if ((((LinearLayout.LayoutParams)localObject).width == j) && (((LinearLayout.LayoutParams)localObject).weight == 0.0F)) {
            break label234;
          }
          ((LinearLayout.LayoutParams)localObject).width = j;
          ((LinearLayout.LayoutParams)localObject).weight = 0.0F;
          i = 1;
        }
        for (;;)
        {
          k += 1;
          break label136;
          TabLayout.n(TabLayout.this);
          TabLayout.o(TabLayout.this);
          m = 1;
          if (m == 0) {
            break;
          }
          super.onMeasure(paramInt1, paramInt2);
          return;
        }
      }
    }
  }
  
  public static final class b
  {
    CharSequence jO;
    int jP = -1;
    View jQ;
    public TabLayout jR;
    public TabLayout.c jS;
    Drawable jd;
    CharSequence mText;
    
    public final void ar()
    {
      if (this.jS != null) {
        this.jS.update();
      }
    }
    
    public final void select()
    {
      if (this.jR == null) {
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
      }
      this.jR.a(this);
    }
  }
  
  final class c
    extends LinearLayout
    implements View.OnLongClickListener
  {
    private View jQ;
    private TabLayout.b jT;
    private TextView jU;
    private ImageView jV;
    private TextView jW;
    private ImageView jX;
    private int jY = 2;
    
    public c(Context paramContext)
    {
      super();
      if (TabLayout.a(TabLayout.this) != 0) {
        setBackgroundDrawable(h.ex().a(paramContext, TabLayout.a(TabLayout.this), false));
      }
      z.c(this, TabLayout.b(TabLayout.this), TabLayout.c(TabLayout.this), TabLayout.d(TabLayout.this), TabLayout.e(TabLayout.this));
      setGravity(17);
      setOrientation(1);
      setClickable(true);
    }
    
    private void a(TextView paramTextView, ImageView paramImageView)
    {
      Drawable localDrawable;
      CharSequence localCharSequence1;
      label32:
      CharSequence localCharSequence2;
      label48:
      label73:
      int i;
      if (this.jT != null)
      {
        localDrawable = this.jT.jd;
        if (this.jT == null) {
          break label196;
        }
        localCharSequence1 = this.jT.mText;
        if (this.jT == null) {
          break label202;
        }
        localCharSequence2 = this.jT.jO;
        if (paramImageView != null)
        {
          if (localDrawable == null) {
            break label208;
          }
          paramImageView.setImageDrawable(localDrawable);
          paramImageView.setVisibility(0);
          setVisibility(0);
          paramImageView.setContentDescription(localCharSequence2);
        }
        if (TextUtils.isEmpty(localCharSequence1)) {
          break label222;
        }
        i = 1;
        label89:
        if (paramTextView != null)
        {
          if (i == 0) {
            break label227;
          }
          paramTextView.setText(localCharSequence1);
          paramTextView.setVisibility(0);
          setVisibility(0);
          label113:
          paramTextView.setContentDescription(localCharSequence2);
        }
        if (paramImageView != null)
        {
          paramTextView = (ViewGroup.MarginLayoutParams)paramImageView.getLayoutParams();
          if ((i == 0) || (paramImageView.getVisibility() != 0)) {
            break label252;
          }
        }
      }
      label196:
      label202:
      label208:
      label222:
      label227:
      label252:
      for (int j = TabLayout.a(TabLayout.this, 8);; j = 0)
      {
        if (j != paramTextView.bottomMargin)
        {
          paramTextView.bottomMargin = j;
          paramImageView.requestLayout();
        }
        if ((i == 0) && (!TextUtils.isEmpty(localCharSequence2)))
        {
          setOnLongClickListener(this);
          return;
          localDrawable = null;
          break;
          localCharSequence1 = null;
          break label32;
          localCharSequence2 = null;
          break label48;
          paramImageView.setVisibility(8);
          paramImageView.setImageDrawable(null);
          break label73;
          i = 0;
          break label89;
          paramTextView.setVisibility(8);
          paramTextView.setText(null);
          break label113;
        }
        setOnLongClickListener(null);
        setLongClickable(false);
        return;
      }
    }
    
    @TargetApi(14)
    public final void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(ActionBar.a.class.getName());
    }
    
    @TargetApi(14)
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      paramAccessibilityNodeInfo.setClassName(ActionBar.a.class.getName());
    }
    
    public final boolean onLongClick(View paramView)
    {
      paramView = new int[2];
      getLocationOnScreen(paramView);
      Object localObject = getContext();
      int i = getWidth();
      int j = getHeight();
      int k = ((Context)localObject).getResources().getDisplayMetrics().widthPixels;
      localObject = Toast.makeText((Context)localObject, this.jT.jO, 0);
      ((Toast)localObject).setGravity(49, paramView[0] + i / 2 - k / 2, j);
      ((Toast)localObject).show();
      return true;
    }
    
    public final void onMeasure(int paramInt1, int paramInt2)
    {
      int k = 1;
      int j = View.MeasureSpec.getSize(paramInt1);
      int m = View.MeasureSpec.getMode(paramInt1);
      int n = TabLayout.f(TabLayout.this);
      int i = paramInt1;
      if (n > 0) {
        if (m != 0)
        {
          i = paramInt1;
          if (j <= n) {}
        }
        else
        {
          i = View.MeasureSpec.makeMeasureSpec(TabLayout.g(TabLayout.this), Integer.MIN_VALUE);
        }
      }
      super.onMeasure(i, paramInt2);
      float f2;
      float f1;
      if (this.jU != null)
      {
        getResources();
        f2 = TabLayout.h(TabLayout.this);
        j = this.jY;
        if ((this.jV == null) || (this.jV.getVisibility() != 0)) {
          break label276;
        }
        paramInt1 = 1;
        f1 = f2;
      }
      for (;;)
      {
        f2 = this.jU.getTextSize();
        m = this.jU.getLineCount();
        j = r.c(this.jU);
        if ((f1 != f2) || ((j >= 0) && (paramInt1 != j)))
        {
          j = k;
          if (TabLayout.j(TabLayout.this) == 1)
          {
            j = k;
            if (f1 > f2)
            {
              j = k;
              if (m == 1)
              {
                Layout localLayout = this.jU.getLayout();
                if (localLayout != null)
                {
                  j = k;
                  if (localLayout.getLineWidth(0) * (f1 / localLayout.getPaint().getTextSize()) <= localLayout.getWidth()) {}
                }
                else
                {
                  j = 0;
                }
              }
            }
          }
          if (j != 0)
          {
            this.jU.setTextSize(0, f1);
            this.jU.setMaxLines(paramInt1);
            super.onMeasure(i, paramInt2);
          }
        }
        return;
        label276:
        paramInt1 = j;
        f1 = f2;
        if (this.jU != null)
        {
          paramInt1 = j;
          f1 = f2;
          if (this.jU.getLineCount() > 1)
          {
            f1 = TabLayout.i(TabLayout.this);
            paramInt1 = j;
          }
        }
      }
    }
    
    public final boolean performClick()
    {
      boolean bool = super.performClick();
      if (this.jT != null)
      {
        this.jT.select();
        bool = true;
      }
      return bool;
    }
    
    public final void setSelected(boolean paramBoolean)
    {
      if (isSelected() != paramBoolean) {}
      for (int i = 1;; i = 0)
      {
        super.setSelected(paramBoolean);
        if ((i != 0) && (paramBoolean))
        {
          sendAccessibilityEvent(4);
          if (this.jU != null) {
            this.jU.setSelected(paramBoolean);
          }
          if (this.jV != null) {
            this.jV.setSelected(paramBoolean);
          }
        }
        return;
      }
    }
    
    final void update()
    {
      Object localObject = this.jT;
      if (localObject != null)
      {
        localObject = ((TabLayout.b)localObject).jQ;
        if (localObject == null) {
          break label287;
        }
        ViewParent localViewParent = ((View)localObject).getParent();
        if (localViewParent != this)
        {
          if (localViewParent != null) {
            ((ViewGroup)localViewParent).removeView((View)localObject);
          }
          addView((View)localObject);
        }
        this.jQ = ((View)localObject);
        if (this.jU != null) {
          this.jU.setVisibility(8);
        }
        if (this.jV != null)
        {
          this.jV.setVisibility(8);
          this.jV.setImageDrawable(null);
        }
        this.jW = ((TextView)((View)localObject).findViewById(16908308));
        if (this.jW != null) {
          this.jY = r.c(this.jW);
        }
        this.jX = ((ImageView)((View)localObject).findViewById(16908294));
        label136:
        if (this.jQ != null) {
          break label320;
        }
        if (this.jV == null)
        {
          localObject = (ImageView)LayoutInflater.from(getContext()).inflate(a.f.aB, this, false);
          addView((View)localObject, 0);
          this.jV = ((ImageView)localObject);
        }
        if (this.jU == null)
        {
          localObject = (TextView)LayoutInflater.from(getContext()).inflate(a.f.aC, this, false);
          addView((View)localObject);
          this.jU = ((TextView)localObject);
          this.jY = r.c(this.jU);
        }
        this.jU.setTextAppearance(getContext(), TabLayout.k(TabLayout.this));
        if (TabLayout.l(TabLayout.this) != null) {
          this.jU.setTextColor(TabLayout.l(TabLayout.this));
        }
        a(this.jU, this.jV);
      }
      label287:
      label320:
      while ((this.jW == null) && (this.jX == null))
      {
        return;
        localObject = null;
        break;
        if (this.jQ != null)
        {
          removeView(this.jQ);
          this.jQ = null;
        }
        this.jW = null;
        this.jX = null;
        break label136;
      }
      a(this.jW, this.jX);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\widget\TabLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */