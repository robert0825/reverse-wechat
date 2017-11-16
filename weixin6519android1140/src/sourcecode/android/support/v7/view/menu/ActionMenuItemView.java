package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.z;
import android.support.v7.a.a.b;
import android.support.v7.a.a.k;
import android.support.v7.widget.ActionMenuView.a;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.ListPopupWindow;
import android.support.v7.widget.ListPopupWindow.b;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.PopupWindow;
import android.widget.Toast;

public class ActionMenuItemView
  extends AppCompatTextView
  implements m.a, ActionMenuView.a, View.OnClickListener, View.OnLongClickListener
{
  private ListPopupWindow.b JA;
  public b JB;
  private boolean JC;
  private boolean JD;
  private int JE;
  private int JF;
  private int JG;
  public f.b Jz;
  private h di;
  private Drawable jd;
  private CharSequence tX;
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Resources localResources = paramContext.getResources();
    this.JC = localResources.getBoolean(a.b.abc_config_allowActionMenuItemTextWithIcon);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.ActionMenuItemView, paramInt, 0);
    this.JE = paramContext.getDimensionPixelSize(a.k.ActionMenuItemView_android_minWidth, 0);
    paramContext.recycle();
    this.JG = ((int)(localResources.getDisplayMetrics().density * 32.0F + 0.5F));
    setOnClickListener(this);
    setOnLongClickListener(this);
    this.JF = -1;
  }
  
  private void dk()
  {
    int m = 0;
    int i;
    int j;
    if (!TextUtils.isEmpty(this.tX))
    {
      i = 1;
      if (this.jd != null)
      {
        if ((this.di.KG & 0x4) != 4) {
          break label87;
        }
        j = 1;
        label37:
        k = m;
        if (j == 0) {
          break label63;
        }
        if (!this.JC)
        {
          k = m;
          if (!this.JD) {
            break label63;
          }
        }
      }
      int k = 1;
      label63:
      if ((i & k) == 0) {
        break label92;
      }
    }
    label87:
    label92:
    for (CharSequence localCharSequence = this.tX;; localCharSequence = null)
    {
      setText(localCharSequence);
      return;
      i = 0;
      break;
      j = 0;
      break label37;
    }
  }
  
  public final boolean A()
  {
    return true;
  }
  
  public final void a(h paramh)
  {
    this.di = paramh;
    Drawable localDrawable = paramh.getIcon();
    this.jd = localDrawable;
    if (localDrawable != null)
    {
      int m = localDrawable.getIntrinsicWidth();
      int k = localDrawable.getIntrinsicHeight();
      int j = k;
      i = m;
      float f;
      if (m > this.JG)
      {
        f = this.JG / m;
        i = this.JG;
        j = (int)(k * f);
      }
      m = j;
      k = i;
      if (j > this.JG)
      {
        f = this.JG / j;
        m = this.JG;
        k = (int)(i * f);
      }
      localDrawable.setBounds(0, 0, k, m);
    }
    setCompoundDrawables(localDrawable, null, null, null);
    dk();
    this.tX = paramh.a(this);
    setContentDescription(this.tX);
    dk();
    setId(paramh.getItemId());
    if (paramh.isVisible()) {}
    for (int i = 0;; i = 8)
    {
      setVisibility(i);
      setEnabled(paramh.isEnabled());
      if ((paramh.hasSubMenu()) && (this.JA == null)) {
        this.JA = new a();
      }
      return;
    }
  }
  
  public final boolean dl()
  {
    return (hasText()) && (this.di.getIcon() == null);
  }
  
  public final boolean dm()
  {
    return hasText();
  }
  
  public final boolean hasText()
  {
    return !TextUtils.isEmpty(getText());
  }
  
  public void onClick(View paramView)
  {
    if (this.Jz != null) {
      this.Jz.f(this.di);
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8) {
      super.onConfigurationChanged(paramConfiguration);
    }
    this.JC = getContext().getResources().getBoolean(a.b.abc_config_allowActionMenuItemTextWithIcon);
    dk();
  }
  
  public boolean onLongClick(View paramView)
  {
    if (hasText()) {
      return false;
    }
    int[] arrayOfInt = new int[2];
    Rect localRect = new Rect();
    getLocationOnScreen(arrayOfInt);
    getWindowVisibleDisplayFrame(localRect);
    Context localContext = getContext();
    int i = getWidth();
    int k = getHeight();
    int m = arrayOfInt[1];
    int n = k / 2;
    int j = arrayOfInt[0];
    j = i / 2 + j;
    i = j;
    if (z.J(paramView) == 0) {
      i = localContext.getResources().getDisplayMetrics().widthPixels - j;
    }
    paramView = Toast.makeText(localContext, this.di.getTitle(), 0);
    if (m + n < localRect.height()) {
      paramView.setGravity(8388661, i, arrayOfInt[1] + k - localRect.top);
    }
    for (;;)
    {
      paramView.show();
      return true;
      paramView.setGravity(81, 0, k);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool = hasText();
    if ((bool) && (this.JF >= 0)) {
      super.setPadding(this.JF, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }
    super.onMeasure(paramInt1, paramInt2);
    int i = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int j = getMeasuredWidth();
    if (i == Integer.MIN_VALUE) {}
    for (paramInt1 = Math.min(paramInt1, this.JE);; paramInt1 = this.JE)
    {
      if ((i != 1073741824) && (this.JE > 0) && (j < paramInt1)) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), paramInt2);
      }
      if ((!bool) && (this.jd != null)) {
        super.setPadding((getMeasuredWidth() - this.jd.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
      }
      return;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((this.di.hasSubMenu()) && (this.JA != null) && (this.JA.onTouch(this, paramMotionEvent))) {
      return true;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.JF = paramInt1;
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final h z()
  {
    return this.di;
  }
  
  private final class a
    extends ListPopupWindow.b
  {
    public a()
    {
      super();
    }
    
    public final ListPopupWindow dn()
    {
      if (ActionMenuItemView.a(ActionMenuItemView.this) != null) {
        return ActionMenuItemView.a(ActionMenuItemView.this).dn();
      }
      return null;
    }
    
    protected final boolean jdMethod_do()
    {
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (ActionMenuItemView.b(ActionMenuItemView.this) != null)
      {
        bool1 = bool2;
        if (ActionMenuItemView.b(ActionMenuItemView.this).f(ActionMenuItemView.c(ActionMenuItemView.this)))
        {
          ListPopupWindow localListPopupWindow = dn();
          bool1 = bool2;
          if (localListPopupWindow != null)
          {
            bool1 = bool2;
            if (localListPopupWindow.RL.isShowing()) {
              bool1 = true;
            }
          }
        }
      }
      return bool1;
    }
  }
  
  public static abstract class b
  {
    public abstract ListPopupWindow dn();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\view\menu\ActionMenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */