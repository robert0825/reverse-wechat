package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.ui.v;
import com.tencent.mm.v.a.c;
import com.tencent.mm.v.a.e;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import com.tencent.mm.v.a.m;
import java.util.List;

public class Preference
  implements Comparable<Preference>
{
  private boolean Aa;
  public int Jx;
  public String hiu;
  public int jLG;
  public Drawable jd;
  public final Context mContext;
  private Bundle mExtras;
  private CharSequence nOP;
  private CharSequence tX;
  private a wkV;
  private int wkW;
  private int wkX;
  private int wkY;
  private String wkZ;
  boolean wla;
  private boolean wlb;
  public boolean wlc;
  String wld;
  private Object wle;
  private boolean wlf;
  private boolean wlg;
  private int wlh;
  int wli;
  private boolean wlj;
  private List<Preference> wlk;
  private int[] xg;
  
  public Preference(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(3220151730176L, 23992);
    GMTrace.o(3220151730176L, 23992);
  }
  
  public Preference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842894);
    GMTrace.i(3220017512448L, 23991);
    GMTrace.o(3220017512448L, 23991);
  }
  
  public Preference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    GMTrace.i(3219883294720L, 23990);
    this.xg = new int[] { a.c.title, a.c.summary };
    this.wkW = Integer.MAX_VALUE;
    this.Aa = true;
    this.wla = true;
    this.wlc = true;
    this.wlf = true;
    this.jLG = -1;
    this.wlg = true;
    this.wlh = a.h.cBA;
    this.wlj = false;
    this.mContext = paramContext;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.enV, paramInt, 0);
    paramInt = paramAttributeSet.getIndexCount();
    if (paramInt >= 0)
    {
      int i = paramAttributeSet.getIndex(paramInt);
      if (i == a.m.ghe) {
        this.Jx = paramAttributeSet.getResourceId(i, 0);
      }
      for (;;)
      {
        paramInt -= 1;
        break;
        if (i == a.m.ghf)
        {
          this.hiu = paramAttributeSet.getString(i);
        }
        else if (i == a.m.ghm)
        {
          this.wkX = paramAttributeSet.getResourceId(i, 0);
          this.tX = paramAttributeSet.getString(i);
          if (this.wkX != 0) {
            this.tX = paramContext.getString(this.wkX);
          }
        }
        else if (i == a.m.ghl)
        {
          this.nOP = paramAttributeSet.getString(i);
          this.wkY = paramAttributeSet.getResourceId(i, 0);
          if (this.wkY != 0) {
            this.nOP = paramContext.getString(this.wkY);
          }
        }
        else if (i == a.m.ghh)
        {
          this.wkW = paramAttributeSet.getInt(i, this.wkW);
        }
        else if (i == a.m.ghd)
        {
          this.wkZ = paramAttributeSet.getString(i);
        }
        else if (i == a.m.ghg)
        {
          this.wlh = paramAttributeSet.getResourceId(i, this.wlh);
        }
        else if (i == a.m.ghn)
        {
          this.wli = paramAttributeSet.getResourceId(i, this.wli);
        }
        else if (i == a.m.ghc)
        {
          this.Aa = paramAttributeSet.getBoolean(i, true);
        }
        else if (i == a.m.ghj)
        {
          this.wla = paramAttributeSet.getBoolean(i, true);
        }
        else if (i == a.m.ghi)
        {
          this.wlc = paramAttributeSet.getBoolean(i, this.wlc);
        }
        else if (i == a.m.ghb)
        {
          this.wld = paramAttributeSet.getString(i);
        }
        else if (i == a.m.gha)
        {
          this.wle = null;
        }
        else if (i == a.m.ghk)
        {
          this.wlg = paramAttributeSet.getBoolean(i, this.wlg);
        }
      }
    }
    paramAttributeSet.recycle();
    if (!getClass().getName().startsWith("android.preference")) {
      this.wlj = true;
    }
    GMTrace.o(3219883294720L, 23990);
  }
  
  private void n(View paramView, boolean paramBoolean)
  {
    GMTrace.i(3220957036544L, 23998);
    paramView.setEnabled(paramBoolean);
    if ((paramView instanceof ViewGroup))
    {
      paramView = (ViewGroup)paramView;
      int i = paramView.getChildCount() - 1;
      while (i >= 0)
      {
        n(paramView.getChildAt(i), paramBoolean);
        i -= 1;
      }
    }
    GMTrace.o(3220957036544L, 23998);
  }
  
  private void notifyDependencyChange(boolean paramBoolean)
  {
    GMTrace.i(3222836084736L, 24012);
    List localList = this.wlk;
    if (localList == null)
    {
      GMTrace.o(3222836084736L, 24012);
      return;
    }
    int j = localList.size();
    int i = 0;
    if (i < j)
    {
      Preference localPreference = (Preference)localList.get(i);
      if (localPreference.wlf == paramBoolean) {
        if (paramBoolean) {
          break label103;
        }
      }
      label103:
      for (boolean bool = true;; bool = false)
      {
        localPreference.wlf = bool;
        localPreference.notifyDependencyChange(localPreference.shouldDisableDependents());
        localPreference.notifyChanged();
        i += 1;
        break;
      }
    }
    GMTrace.o(3222836084736L, 24012);
  }
  
  private boolean shouldDisableDependents()
  {
    GMTrace.i(3222970302464L, 24013);
    if (!isEnabled())
    {
      GMTrace.o(3222970302464L, 24013);
      return true;
    }
    GMTrace.o(3222970302464L, 24013);
    return false;
  }
  
  public void a(a parama)
  {
    GMTrace.i(3222567649280L, 24010);
    this.wkV = parama;
    GMTrace.o(3222567649280L, 24010);
  }
  
  public final boolean callChangeListener(Object paramObject)
  {
    GMTrace.i(3222433431552L, 24009);
    if (this.wkV == null)
    {
      GMTrace.o(3222433431552L, 24009);
      return true;
    }
    boolean bool = this.wkV.a(this, paramObject);
    GMTrace.o(3222433431552L, 24009);
    return bool;
  }
  
  public final Bundle getExtras()
  {
    GMTrace.i(17513937108992L, 130489);
    if (this.mExtras == null) {
      this.mExtras = new Bundle();
    }
    Bundle localBundle = this.mExtras;
    GMTrace.o(17513937108992L, 130489);
    return localBundle;
  }
  
  public int getLayoutResource()
  {
    GMTrace.i(18740821360640L, 139630);
    int i = this.wlh;
    GMTrace.o(18740821360640L, 139630);
    return i;
  }
  
  public CharSequence getSummary()
  {
    GMTrace.i(3221493907456L, 24002);
    CharSequence localCharSequence = this.nOP;
    GMTrace.o(3221493907456L, 24002);
    return localCharSequence;
  }
  
  public CharSequence getTitle()
  {
    GMTrace.i(3221359689728L, 24001);
    CharSequence localCharSequence = this.tX;
    GMTrace.o(3221359689728L, 24001);
    return localCharSequence;
  }
  
  public View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(3220554383360L, 23995);
    View localView = paramView;
    if (paramView == null) {
      localView = onCreateView(paramViewGroup);
    }
    onBindView(localView);
    GMTrace.o(3220554383360L, 23995);
    return localView;
  }
  
  public final boolean isEnabled()
  {
    GMTrace.i(3222030778368L, 24006);
    if ((this.Aa) && (this.wlf))
    {
      GMTrace.o(3222030778368L, 24006);
      return true;
    }
    GMTrace.o(3222030778368L, 24006);
    return false;
  }
  
  public void notifyChanged()
  {
    GMTrace.i(3222701867008L, 24011);
    GMTrace.o(3222701867008L, 24011);
  }
  
  public void onBindView(View paramView)
  {
    int i = 0;
    GMTrace.i(3220822818816L, 23997);
    Object localObject = paramView.findViewById(a.g.content);
    if (localObject != null) {
      ((View)localObject).setMinimumHeight((int)(paramView.getResources().getDimensionPixelSize(a.e.aQM) * a.ec(this.mContext)));
    }
    localObject = (TextView)paramView.findViewById(16908310);
    if (localObject != null) {
      ((TextView)localObject).setText(getTitle());
    }
    localObject = (TextView)paramView.findViewById(16908304);
    if (localObject != null)
    {
      if (TextUtils.isEmpty(getSummary())) {
        break label238;
      }
      if (((TextView)localObject).getVisibility() != 0) {
        ((TextView)localObject).setVisibility(0);
      }
      ((TextView)localObject).setText(getSummary());
      if (this.jLG != -1) {
        ((TextView)localObject).setTextColor(this.jLG);
      }
    }
    localObject = (ImageView)paramView.findViewById(16908294);
    if (localObject != null)
    {
      if ((this.Jx != 0) || (this.jd != null))
      {
        if (this.jd == null) {
          this.jd = this.mContext.getResources().getDrawable(this.Jx);
        }
        if (this.jd != null) {
          ((ImageView)localObject).setImageDrawable(this.jd);
        }
      }
      if (this.jd == null) {
        break label256;
      }
    }
    for (;;)
    {
      ((ImageView)localObject).setVisibility(i);
      if (this.wlg) {
        n(paramView, isEnabled());
      }
      GMTrace.o(3220822818816L, 23997);
      return;
      label238:
      if (((TextView)localObject).getVisibility() == 8) {
        break;
      }
      ((TextView)localObject).setVisibility(8);
      break;
      label256:
      i = 8;
    }
  }
  
  public View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(3220688601088L, 23996);
    LayoutInflater localLayoutInflater = v.fb(this.mContext);
    paramViewGroup = localLayoutInflater.inflate(this.wlh, paramViewGroup, false);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(16908312);
    if (localViewGroup != null)
    {
      if (this.wli == 0) {
        break label71;
      }
      localLayoutInflater.inflate(this.wli, localViewGroup);
    }
    for (;;)
    {
      GMTrace.o(3220688601088L, 23996);
      return paramViewGroup;
      label71:
      localViewGroup.setVisibility(8);
    }
  }
  
  public final void setEnabled(boolean paramBoolean)
  {
    GMTrace.i(3221896560640L, 24005);
    if (this.Aa != paramBoolean)
    {
      this.Aa = paramBoolean;
      notifyDependencyChange(shouldDisableDependents());
      notifyChanged();
    }
    GMTrace.o(3221896560640L, 24005);
  }
  
  public final void setKey(String paramString)
  {
    GMTrace.i(3222299213824L, 24008);
    this.hiu = paramString;
    if (this.wlb)
    {
      int i;
      if (!TextUtils.isEmpty(this.hiu)) {
        i = 1;
      }
      while (i == 0) {
        if (this.hiu == null)
        {
          throw new IllegalStateException("Preference does not have a key assigned.");
          i = 0;
        }
        else
        {
          this.wlb = true;
        }
      }
    }
    GMTrace.o(3222299213824L, 24008);
  }
  
  public final void setLayoutResource(int paramInt)
  {
    GMTrace.i(3220285947904L, 23993);
    if (paramInt != this.wlh) {
      this.wlj = true;
    }
    this.wlh = paramInt;
    GMTrace.o(3220285947904L, 23993);
  }
  
  public final void setSelectable(boolean paramBoolean)
  {
    GMTrace.i(3222164996096L, 24007);
    if (this.wla != paramBoolean)
    {
      this.wla = paramBoolean;
      notifyChanged();
    }
    GMTrace.o(3222164996096L, 24007);
  }
  
  public void setSummary(int paramInt)
  {
    GMTrace.i(3221762342912L, 24004);
    setSummary(this.mContext.getString(paramInt));
    GMTrace.o(3221762342912L, 24004);
  }
  
  public void setSummary(CharSequence paramCharSequence)
  {
    GMTrace.i(3221628125184L, 24003);
    if (((paramCharSequence == null) && (this.nOP != null)) || ((paramCharSequence != null) && (!paramCharSequence.equals(this.nOP))))
    {
      this.nOP = paramCharSequence;
      notifyChanged();
    }
    GMTrace.o(3221628125184L, 24003);
  }
  
  public void setTitle(int paramInt)
  {
    GMTrace.i(3221225472000L, 24000);
    setTitle(this.mContext.getString(paramInt));
    this.wkX = paramInt;
    GMTrace.o(3221225472000L, 24000);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    GMTrace.i(3221091254272L, 23999);
    if (((paramCharSequence == null) && (this.tX != null)) || ((paramCharSequence != null) && (!paramCharSequence.equals(this.tX))))
    {
      this.wkX = 0;
      this.tX = paramCharSequence;
      notifyChanged();
    }
    GMTrace.o(3221091254272L, 23999);
  }
  
  public final void setWidgetLayoutResource(int paramInt)
  {
    GMTrace.i(3220420165632L, 23994);
    if (paramInt != this.wli) {
      this.wlj = true;
    }
    this.wli = paramInt;
    GMTrace.o(3220420165632L, 23994);
  }
  
  public String toString()
  {
    GMTrace.i(3223104520192L, 24014);
    Object localObject = new StringBuilder();
    CharSequence localCharSequence = getTitle();
    if (!TextUtils.isEmpty(localCharSequence)) {
      ((StringBuilder)localObject).append(localCharSequence).append(' ');
    }
    localCharSequence = getSummary();
    if (!TextUtils.isEmpty(localCharSequence)) {
      ((StringBuilder)localObject).append(localCharSequence).append(' ');
    }
    if (((StringBuilder)localObject).length() > 0) {
      ((StringBuilder)localObject).setLength(((StringBuilder)localObject).length() - 1);
    }
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(3223104520192L, 24014);
    return (String)localObject;
  }
  
  public static class BaseSavedState
    extends AbsSavedState
  {
    public static final Parcelable.Creator<BaseSavedState> CREATOR;
    
    static
    {
      GMTrace.i(3225117786112L, 24029);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(3225117786112L, 24029);
    }
    
    public BaseSavedState(Parcel paramParcel)
    {
      super();
      GMTrace.i(3224983568384L, 24028);
      GMTrace.o(3224983568384L, 24028);
    }
  }
  
  public static abstract interface a
  {
    public abstract boolean a(Preference paramPreference, Object paramObject);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\preference\Preference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */