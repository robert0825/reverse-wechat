package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a.f;
import android.support.v7.a.a.h;
import android.support.v7.a.a.k;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView
  extends LinearLayout
  implements m.a
{
  private LayoutInflater CJ;
  private TextView EN;
  private RadioButton JR;
  private CheckBox JS;
  private TextView JT;
  private Drawable JU;
  private Context JV;
  boolean JW;
  private int JX;
  boolean JY;
  private h di;
  private int dp;
  private ImageView jV;
  private Context mContext;
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.MenuView, paramInt, 0);
    this.JU = paramAttributeSet.getDrawable(a.k.MenuView_android_itemBackground);
    this.dp = paramAttributeSet.getResourceId(a.k.MenuView_android_itemTextAppearance, -1);
    this.JW = paramAttributeSet.getBoolean(a.k.MenuView_preserveIconSpacing, false);
    this.JV = paramContext;
    paramAttributeSet.recycle();
  }
  
  private LayoutInflater dp()
  {
    if (this.CJ == null) {
      this.CJ = LayoutInflater.from(this.mContext);
    }
    return this.CJ;
  }
  
  public final boolean A()
  {
    return false;
  }
  
  public final void a(h paramh)
  {
    this.di = paramh;
    this.JX = 0;
    int i;
    Object localObject1;
    label63:
    Object localObject2;
    label144:
    label168:
    label205:
    label233:
    char c;
    if (paramh.isVisible())
    {
      i = 0;
      setVisibility(i);
      localObject1 = paramh.a(this);
      if (localObject1 == null) {
        break label440;
      }
      this.EN.setText((CharSequence)localObject1);
      if (this.EN.getVisibility() != 0) {
        this.EN.setVisibility(0);
      }
      boolean bool = paramh.isCheckable();
      if ((bool) || (this.JR != null) || (this.JS != null))
      {
        if (!this.di.dF()) {
          break label464;
        }
        if (this.JR == null)
        {
          this.JR = ((RadioButton)dp().inflate(a.h.abc_list_menu_item_radio, this, false));
          addView(this.JR);
        }
        localObject1 = this.JR;
        localObject2 = this.JS;
        if (!bool) {
          break label519;
        }
        ((CompoundButton)localObject1).setChecked(this.di.isChecked());
        if (!bool) {
          break label513;
        }
        i = 0;
        if (((CompoundButton)localObject1).getVisibility() != i) {
          ((CompoundButton)localObject1).setVisibility(i);
        }
        if ((localObject2 != null) && (((CompoundButton)localObject2).getVisibility() != 8)) {
          ((CompoundButton)localObject2).setVisibility(8);
        }
      }
      bool = paramh.dE();
      paramh.dD();
      if ((!bool) || (!this.di.dE())) {
        break label554;
      }
      i = 0;
      if (i == 0)
      {
        localObject2 = this.JT;
        c = this.di.dD();
        if (c != 0) {
          break label560;
        }
        localObject1 = "";
        ((TextView)localObject2).setText((CharSequence)localObject1);
      }
      if (this.JT.getVisibility() != i) {
        this.JT.setVisibility(i);
      }
      localObject1 = paramh.getIcon();
      if ((!this.di.dn.Kv) && (!this.JY)) {
        break label661;
      }
      i = 1;
      label313:
      if (((i != 0) || (this.JW)) && ((this.jV != null) || (localObject1 != null) || (this.JW)))
      {
        if (this.jV == null)
        {
          this.jV = ((ImageView)dp().inflate(a.h.abc_list_menu_item_icon, this, false));
          addView(this.jV, 0);
        }
        if ((localObject1 == null) && (!this.JW)) {
          break label672;
        }
        localObject2 = this.jV;
        if (i == 0) {
          break label666;
        }
        label400:
        ((ImageView)localObject2).setImageDrawable((Drawable)localObject1);
        if (this.jV.getVisibility() != 0) {
          this.jV.setVisibility(0);
        }
      }
    }
    for (;;)
    {
      setEnabled(paramh.isEnabled());
      return;
      i = 8;
      break;
      label440:
      if (this.EN.getVisibility() == 8) {
        break label63;
      }
      this.EN.setVisibility(8);
      break label63;
      label464:
      if (this.JS == null)
      {
        this.JS = ((CheckBox)dp().inflate(a.h.abc_list_menu_item_checkbox, this, false));
        addView(this.JS);
      }
      localObject1 = this.JS;
      localObject2 = this.JR;
      break label144;
      label513:
      i = 8;
      break label168;
      label519:
      if (this.JS != null) {
        this.JS.setVisibility(8);
      }
      if (this.JR == null) {
        break label205;
      }
      this.JR.setVisibility(8);
      break label205;
      label554:
      i = 8;
      break label233;
      label560:
      localObject1 = new StringBuilder(h.KM);
      switch (c)
      {
      default: 
        ((StringBuilder)localObject1).append(c);
      }
      for (;;)
      {
        localObject1 = ((StringBuilder)localObject1).toString();
        break;
        ((StringBuilder)localObject1).append(h.KN);
        continue;
        ((StringBuilder)localObject1).append(h.KO);
        continue;
        ((StringBuilder)localObject1).append(h.KP);
      }
      label661:
      i = 0;
      break label313;
      label666:
      localObject1 = null;
      break label400;
      label672:
      this.jV.setVisibility(8);
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    setBackgroundDrawable(this.JU);
    this.EN = ((TextView)findViewById(a.f.title));
    if (this.dp != -1) {
      this.EN.setTextAppearance(this.JV, this.dp);
    }
    this.JT = ((TextView)findViewById(a.f.shortcut));
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.jV != null) && (this.JW))
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)this.jV.getLayoutParams();
      if ((localLayoutParams.height > 0) && (localLayoutParams1.width <= 0)) {
        localLayoutParams1.width = localLayoutParams.height;
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public final h z()
  {
    return this.di;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\view\menu\ListMenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */