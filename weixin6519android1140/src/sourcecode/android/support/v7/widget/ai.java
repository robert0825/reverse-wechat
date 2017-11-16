package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.a.a.a;
import android.support.v7.a.a.d;
import android.support.v7.a.a.k;
import android.support.v7.app.ActionBar.a;
import android.support.v7.view.a;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public final class ai
  extends HorizontalScrollView
  implements AdapterView.OnItemSelectedListener
{
  private static final Interpolator VH = new DecelerateInterpolator();
  private int Lr;
  Runnable VA;
  private LinearLayoutCompat VB;
  private Spinner VC;
  boolean VD;
  int VE;
  int VF;
  private int VG;
  
  private void bp(int paramInt)
  {
    this.VG = paramInt;
    int j = this.VB.getChildCount();
    int i = 0;
    if (i < j)
    {
      final View localView = this.VB.getChildAt(i);
      if (i == paramInt) {}
      for (boolean bool = true;; bool = false)
      {
        localView.setSelected(bool);
        if (bool)
        {
          localView = this.VB.getChildAt(paramInt);
          if (this.VA != null) {
            removeCallbacks(this.VA);
          }
          this.VA = new Runnable()
          {
            public final void run()
            {
              int i = localView.getLeft();
              int j = (ai.this.getWidth() - localView.getWidth()) / 2;
              ai.this.smoothScrollTo(i - j, 0);
              ai.this.VA = null;
            }
          };
          post(this.VA);
        }
        i += 1;
        break;
      }
    }
    if ((this.VC != null) && (paramInt >= 0)) {
      this.VC.setSelection(paramInt);
    }
  }
  
  private boolean gr()
  {
    return (this.VC != null) && (this.VC.getParent() == this);
  }
  
  private boolean gs()
  {
    if (!gr()) {
      return false;
    }
    removeView(this.VC);
    addView(this.VB, new ViewGroup.LayoutParams(-2, -1));
    bp(this.VC.getSelectedItemPosition());
    return false;
  }
  
  public final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.VA != null) {
      post(this.VA);
    }
  }
  
  protected final void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8) {
      super.onConfigurationChanged(paramConfiguration);
    }
    paramConfiguration = a.o(getContext());
    TypedArray localTypedArray = paramConfiguration.mContext.obtainStyledAttributes(null, a.k.ActionBar, a.a.actionBarStyle, 0);
    int j = localTypedArray.getLayoutDimension(a.k.ActionBar_height, 0);
    Resources localResources = paramConfiguration.mContext.getResources();
    int i = j;
    if (!paramConfiguration.dd()) {
      i = Math.min(j, localResources.getDimensionPixelSize(a.d.abc_action_bar_stacked_max_height));
    }
    localTypedArray.recycle();
    this.Lr = i;
    requestLayout();
    this.VF = paramConfiguration.mContext.getResources().getDimensionPixelSize(a.d.abc_action_bar_stacked_tab_max_width);
  }
  
  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.VA != null) {
      removeCallbacks(this.VA);
    }
  }
  
  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong) {}
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    paramInt2 = 1;
    int i = View.MeasureSpec.getMode(paramInt1);
    boolean bool;
    if (i == 1073741824)
    {
      bool = true;
      setFillViewport(bool);
      int j = this.VB.getChildCount();
      if ((j <= 1) || ((i != 1073741824) && (i != Integer.MIN_VALUE))) {
        break label328;
      }
      if (j <= 2) {
        break label315;
      }
      this.VE = ((int)(View.MeasureSpec.getSize(paramInt1) * 0.4F));
      label68:
      this.VE = Math.min(this.VE, this.VF);
      label83:
      i = View.MeasureSpec.makeMeasureSpec(this.Lr, 1073741824);
      if ((bool) || (!this.VD)) {
        break label336;
      }
      label105:
      if (paramInt2 == 0) {
        break label349;
      }
      this.VB.measure(0, i);
      if (this.VB.getMeasuredWidth() <= View.MeasureSpec.getSize(paramInt1)) {
        break label341;
      }
      if (!gr())
      {
        if (this.VC == null)
        {
          AppCompatSpinner localAppCompatSpinner = new AppCompatSpinner(getContext(), null, a.a.actionDropDownStyle);
          localAppCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
          localAppCompatSpinner.setOnItemSelectedListener(this);
          this.VC = localAppCompatSpinner;
        }
        removeView(this.VB);
        addView(this.VC, new ViewGroup.LayoutParams(-2, -1));
        if (this.VC.getAdapter() == null) {
          this.VC.setAdapter(new a((byte)0));
        }
        if (this.VA != null)
        {
          removeCallbacks(this.VA);
          this.VA = null;
        }
        this.VC.setSelection(this.VG);
      }
    }
    for (;;)
    {
      paramInt2 = getMeasuredWidth();
      super.onMeasure(paramInt1, i);
      paramInt1 = getMeasuredWidth();
      if ((bool) && (paramInt2 != paramInt1)) {
        bp(this.VG);
      }
      return;
      bool = false;
      break;
      label315:
      this.VE = (View.MeasureSpec.getSize(paramInt1) / 2);
      break label68;
      label328:
      this.VE = -1;
      break label83;
      label336:
      paramInt2 = 0;
      break label105;
      label341:
      gs();
      continue;
      label349:
      gs();
    }
  }
  
  public final void onNothingSelected(AdapterView<?> paramAdapterView) {}
  
  private final class a
    extends BaseAdapter
  {
    private a() {}
    
    public final int getCount()
    {
      return ai.c(ai.this).getChildCount();
    }
    
    public final Object getItem(int paramInt)
    {
      return ((ai.b)ai.c(ai.this).getChildAt(paramInt)).VL;
    }
    
    public final long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (paramView == null) {
        return ai.a(ai.this, (ActionBar.a)getItem(paramInt));
      }
      paramViewGroup = (ai.b)paramView;
      paramViewGroup.VL = ((ActionBar.a)getItem(paramInt));
      paramViewGroup.update();
      return paramView;
    }
  }
  
  private final class b
    extends LinearLayoutCompat
    implements View.OnLongClickListener
  {
    private final int[] VK = { 16842964 };
    ActionBar.a VL;
    private View jQ;
    private TextView jU;
    private ImageView jV;
    
    public b(Context paramContext, ActionBar.a parama, boolean paramBoolean)
    {
      super(null, a.a.actionBarTabStyle);
      this.VL = parama;
      this$1 = ap.a(paramContext, null, this.VK, a.a.actionBarTabStyle);
      if (ai.this.hasValue(0)) {
        setBackgroundDrawable(ai.this.getDrawable(0));
      }
      ai.this.Yu.recycle();
      setGravity(8388627);
      update();
    }
    
    public final void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(ActionBar.a.class.getName());
    }
    
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      if (Build.VERSION.SDK_INT >= 14) {
        paramAccessibilityNodeInfo.setClassName(ActionBar.a.class.getName());
      }
    }
    
    public final boolean onLongClick(View paramView)
    {
      paramView = new int[2];
      getLocationOnScreen(paramView);
      Object localObject = getContext();
      int i = getWidth();
      int j = getHeight();
      int k = ((Context)localObject).getResources().getDisplayMetrics().widthPixels;
      localObject = Toast.makeText((Context)localObject, this.VL.getContentDescription(), 0);
      ((Toast)localObject).setGravity(49, paramView[0] + i / 2 - k / 2, j);
      ((Toast)localObject).show();
      return true;
    }
    
    public final void onMeasure(int paramInt1, int paramInt2)
    {
      super.onMeasure(paramInt1, paramInt2);
      if ((ai.this.VE > 0) && (getMeasuredWidth() > ai.this.VE)) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ai.this.VE, 1073741824), paramInt2);
      }
    }
    
    public final void setSelected(boolean paramBoolean)
    {
      if (isSelected() != paramBoolean) {}
      for (int i = 1;; i = 0)
      {
        super.setSelected(paramBoolean);
        if ((i != 0) && (paramBoolean)) {
          sendAccessibilityEvent(4);
        }
        return;
      }
    }
    
    public final void update()
    {
      Object localObject1 = this.VL;
      Object localObject2 = ((ActionBar.a)localObject1).getCustomView();
      if (localObject2 != null)
      {
        localObject1 = ((View)localObject2).getParent();
        if (localObject1 != this)
        {
          if (localObject1 != null) {
            ((ViewGroup)localObject1).removeView((View)localObject2);
          }
          addView((View)localObject2);
        }
        this.jQ = ((View)localObject2);
        if (this.jU != null) {
          this.jU.setVisibility(8);
        }
        if (this.jV != null)
        {
          this.jV.setVisibility(8);
          this.jV.setImageDrawable(null);
        }
        return;
      }
      if (this.jQ != null)
      {
        removeView(this.jQ);
        this.jQ = null;
      }
      Object localObject3 = ((ActionBar.a)localObject1).getIcon();
      localObject2 = ((ActionBar.a)localObject1).getText();
      int i;
      if (localObject3 != null)
      {
        Object localObject4;
        if (this.jV == null)
        {
          localObject4 = new ImageView(getContext());
          LinearLayoutCompat.LayoutParams localLayoutParams = new LinearLayoutCompat.LayoutParams(-2, -2);
          localLayoutParams.gravity = 16;
          ((ImageView)localObject4).setLayoutParams(localLayoutParams);
          addView((View)localObject4, 0);
          this.jV = ((ImageView)localObject4);
        }
        this.jV.setImageDrawable((Drawable)localObject3);
        this.jV.setVisibility(0);
        if (TextUtils.isEmpty((CharSequence)localObject2)) {
          break label365;
        }
        i = 1;
        label209:
        if (i == 0) {
          break label370;
        }
        if (this.jU == null)
        {
          localObject3 = new AppCompatTextView(getContext(), null, a.a.actionBarTabTextStyle);
          ((TextView)localObject3).setEllipsize(TextUtils.TruncateAt.END);
          localObject4 = new LinearLayoutCompat.LayoutParams(-2, -2);
          ((LinearLayoutCompat.LayoutParams)localObject4).gravity = 16;
          ((TextView)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject4);
          addView((View)localObject3);
          this.jU = ((TextView)localObject3);
        }
        this.jU.setText((CharSequence)localObject2);
        this.jU.setVisibility(0);
      }
      for (;;)
      {
        if (this.jV != null) {
          this.jV.setContentDescription(((ActionBar.a)localObject1).getContentDescription());
        }
        if ((i != 0) || (TextUtils.isEmpty(((ActionBar.a)localObject1).getContentDescription()))) {
          break label397;
        }
        setOnLongClickListener(this);
        return;
        if (this.jV == null) {
          break;
        }
        this.jV.setVisibility(8);
        this.jV.setImageDrawable(null);
        break;
        label365:
        i = 0;
        break label209;
        label370:
        if (this.jU != null)
        {
          this.jU.setVisibility(8);
          this.jU.setText(null);
        }
      }
      label397:
      setOnLongClickListener(null);
      setLongClickable(false);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */