package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.view.z;
import android.support.v7.a.a.d;
import android.support.v7.a.a.f;
import android.support.v7.a.a.h;
import android.support.v7.a.a.i;
import android.support.v7.a.a.k;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import java.util.List;

public class ActivityChooserView
  extends ViewGroup
{
  private final FrameLayout NA;
  private final ImageView NB;
  private final int NC;
  android.support.v4.view.d ND;
  private final DataSetObserver NE = new DataSetObserver()
  {
    public final void onChanged()
    {
      super.onChanged();
      ActivityChooserView.a(ActivityChooserView.this).notifyDataSetChanged();
    }
    
    public final void onInvalidated()
    {
      super.onInvalidated();
      ActivityChooserView.a(ActivityChooserView.this).notifyDataSetInvalidated();
    }
  };
  private final ViewTreeObserver.OnGlobalLayoutListener NF = new ViewTreeObserver.OnGlobalLayoutListener()
  {
    public final void onGlobalLayout()
    {
      if (ActivityChooserView.this.en())
      {
        if (ActivityChooserView.this.isShown()) {
          break label31;
        }
        ActivityChooserView.b(ActivityChooserView.this).dismiss();
      }
      label31:
      do
      {
        return;
        ActivityChooserView.b(ActivityChooserView.this).show();
      } while (ActivityChooserView.this.ND == null);
      ActivityChooserView.this.ND.p(true);
    }
  };
  private ListPopupWindow NG;
  private PopupWindow.OnDismissListener NH;
  boolean NI;
  int NJ = 4;
  private int NK;
  private final a Nu;
  private final b Nv;
  private final LinearLayoutCompat Nw;
  private final Drawable Nx;
  private final FrameLayout Ny;
  private final ImageView Nz;
  boolean gx;
  
  public ActivityChooserView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ActivityChooserView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.ActivityChooserView, paramInt, 0);
    this.NJ = ((TypedArray)localObject).getInt(a.k.ActivityChooserView_initialActivityCount, 4);
    paramAttributeSet = ((TypedArray)localObject).getDrawable(a.k.ActivityChooserView_expandActivityOverflowButtonDrawable);
    ((TypedArray)localObject).recycle();
    LayoutInflater.from(getContext()).inflate(a.h.abc_activity_chooser_view, this, true);
    this.Nv = new b();
    this.Nw = ((LinearLayoutCompat)findViewById(a.f.activity_chooser_view_content));
    this.Nx = this.Nw.getBackground();
    this.NA = ((FrameLayout)findViewById(a.f.default_activity_button));
    this.NA.setOnClickListener(this.Nv);
    this.NA.setOnLongClickListener(this.Nv);
    this.NB = ((ImageView)this.NA.findViewById(a.f.image));
    localObject = (FrameLayout)findViewById(a.f.expand_activities_button);
    ((FrameLayout)localObject).setOnClickListener(this.Nv);
    ((FrameLayout)localObject).setOnTouchListener(new ListPopupWindow.b((View)localObject)
    {
      protected final boolean dZ()
      {
        ActivityChooserView.this.em();
        return true;
      }
      
      public final ListPopupWindow dn()
      {
        return ActivityChooserView.b(ActivityChooserView.this);
      }
      
      protected final boolean jdMethod_do()
      {
        ActivityChooserView localActivityChooserView = ActivityChooserView.this;
        if ((localActivityChooserView.en()) || (!localActivityChooserView.gx)) {}
        for (;;)
        {
          return true;
          localActivityChooserView.NI = false;
          localActivityChooserView.aE(localActivityChooserView.NJ);
        }
      }
    });
    this.Ny = ((FrameLayout)localObject);
    this.Nz = ((ImageView)((FrameLayout)localObject).findViewById(a.f.image));
    this.Nz.setImageDrawable(paramAttributeSet);
    this.Nu = new a((byte)0);
    this.Nu.registerDataSetObserver(new DataSetObserver()
    {
      public final void onChanged()
      {
        super.onChanged();
        ActivityChooserView.c(ActivityChooserView.this);
      }
    });
    paramContext = paramContext.getResources();
    this.NC = Math.max(paramContext.getDisplayMetrics().widthPixels / 2, paramContext.getDimensionPixelSize(a.d.abc_config_prefDialogWidth));
  }
  
  private ListPopupWindow eo()
  {
    if (this.NG == null)
    {
      this.NG = new ListPopupWindow(getContext());
      this.NG.setAdapter(this.Nu);
      this.NG.RX = this;
      this.NG.setModal(true);
      this.NG.RZ = this.Nv;
      this.NG.setOnDismissListener(this.Nv);
    }
    return this.NG;
  }
  
  final void aE(int paramInt)
  {
    if (this.Nu.NM == null) {
      throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }
    getViewTreeObserver().addOnGlobalLayoutListener(this.NF);
    boolean bool;
    int i;
    label63:
    label95:
    ListPopupWindow localListPopupWindow;
    if (this.NA.getVisibility() == 0)
    {
      bool = true;
      int j = this.Nu.NM.ee();
      if (!bool) {
        break label198;
      }
      i = 1;
      if ((paramInt == Integer.MAX_VALUE) || (j <= i + paramInt)) {
        break label203;
      }
      this.Nu.L(true);
      this.Nu.aF(paramInt - 1);
      localListPopupWindow = eo();
      if (!localListPopupWindow.RL.isShowing())
      {
        if ((!this.NI) && (bool)) {
          break label222;
        }
        this.Nu.c(true, bool);
      }
    }
    for (;;)
    {
      localListPopupWindow.setContentWidth(Math.min(this.Nu.ep(), this.NC));
      localListPopupWindow.show();
      if (this.ND != null) {
        this.ND.p(true);
      }
      localListPopupWindow.RM.setContentDescription(getContext().getString(a.i.abc_activitychooserview_choose_application));
      return;
      bool = false;
      break;
      label198:
      i = 0;
      break label63;
      label203:
      this.Nu.L(false);
      this.Nu.aF(paramInt);
      break label95;
      label222:
      this.Nu.c(false, false);
    }
  }
  
  public final boolean em()
  {
    if (eo().RL.isShowing())
    {
      eo().dismiss();
      ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
      if (localViewTreeObserver.isAlive()) {
        localViewTreeObserver.removeGlobalOnLayoutListener(this.NF);
      }
    }
    return true;
  }
  
  public final boolean en()
  {
    return eo().RL.isShowing();
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    d locald = this.Nu.NM;
    if (locald != null) {
      locald.registerObserver(this.NE);
    }
    this.gx = true;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Object localObject = this.Nu.NM;
    if (localObject != null) {
      ((d)localObject).unregisterObserver(this.NE);
    }
    localObject = getViewTreeObserver();
    if (((ViewTreeObserver)localObject).isAlive()) {
      ((ViewTreeObserver)localObject).removeGlobalOnLayoutListener(this.NF);
    }
    if (en()) {
      em();
    }
    this.gx = false;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.Nw.layout(0, 0, paramInt3 - paramInt1, paramInt4 - paramInt2);
    if (!en()) {
      em();
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    LinearLayoutCompat localLinearLayoutCompat = this.Nw;
    int i = paramInt2;
    if (this.NA.getVisibility() != 0) {
      i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt2), 1073741824);
    }
    measureChild(localLinearLayoutCompat, paramInt1, i);
    setMeasuredDimension(localLinearLayoutCompat.getMeasuredWidth(), localLinearLayoutCompat.getMeasuredHeight());
  }
  
  public static class InnerLayout
    extends LinearLayoutCompat
  {
    private static final int[] JQ = { 16842964 };
    
    public InnerLayout(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = ap.a(paramContext, paramAttributeSet, JQ);
      setBackgroundDrawable(paramContext.getDrawable(0));
      paramContext.Yu.recycle();
    }
  }
  
  private final class a
    extends BaseAdapter
  {
    d NM;
    private int NN = 4;
    boolean NO;
    private boolean NP;
    private boolean NQ;
    
    private a() {}
    
    public final void L(boolean paramBoolean)
    {
      if (this.NQ != paramBoolean)
      {
        this.NQ = paramBoolean;
        notifyDataSetChanged();
      }
    }
    
    public final void aF(int paramInt)
    {
      if (this.NN != paramInt)
      {
        this.NN = paramInt;
        notifyDataSetChanged();
      }
    }
    
    public final void c(boolean paramBoolean1, boolean paramBoolean2)
    {
      if ((this.NO != paramBoolean1) || (this.NP != paramBoolean2))
      {
        this.NO = paramBoolean1;
        this.NP = paramBoolean2;
        notifyDataSetChanged();
      }
    }
    
    public final int ep()
    {
      int i = 0;
      int k = this.NN;
      this.NN = Integer.MAX_VALUE;
      int m = View.MeasureSpec.makeMeasureSpec(0, 0);
      int n = View.MeasureSpec.makeMeasureSpec(0, 0);
      int i1 = getCount();
      View localView = null;
      int j = 0;
      while (i < i1)
      {
        localView = getView(i, localView, null);
        localView.measure(m, n);
        j = Math.max(j, localView.getMeasuredWidth());
        i += 1;
      }
      this.NN = k;
      return j;
    }
    
    public final int getCount()
    {
      int j = this.NM.ee();
      int i = j;
      if (!this.NO)
      {
        i = j;
        if (this.NM.ef() != null) {
          i = j - 1;
        }
      }
      j = Math.min(i, this.NN);
      i = j;
      if (this.NQ) {
        i = j + 1;
      }
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      switch (getItemViewType(paramInt))
      {
      default: 
        throw new IllegalArgumentException();
      case 1: 
        return null;
      }
      int i = paramInt;
      if (!this.NO)
      {
        i = paramInt;
        if (this.NM.ef() != null) {
          i = paramInt + 1;
        }
      }
      return this.NM.aC(i);
    }
    
    public final long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public final int getItemViewType(int paramInt)
    {
      if ((this.NQ) && (paramInt == getCount() - 1)) {
        return 1;
      }
      return 0;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      View localView;
      switch (getItemViewType(paramInt))
      {
      default: 
        throw new IllegalArgumentException();
      case 1: 
        if (paramView != null)
        {
          localView = paramView;
          if (paramView.getId() == 1) {}
        }
        else
        {
          localView = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(a.h.abc_activity_chooser_view_list_item, paramViewGroup, false);
          localView.setId(1);
          ((TextView)localView.findViewById(a.f.title)).setText(ActivityChooserView.this.getContext().getString(a.i.abc_activity_chooser_view_see_all));
        }
        return localView;
      }
      if (paramView != null)
      {
        localView = paramView;
        if (paramView.getId() == a.f.list_item) {}
      }
      else
      {
        localView = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(a.h.abc_activity_chooser_view_list_item, paramViewGroup, false);
      }
      paramView = ActivityChooserView.this.getContext().getPackageManager();
      paramViewGroup = (ImageView)localView.findViewById(a.f.icon);
      ResolveInfo localResolveInfo = (ResolveInfo)getItem(paramInt);
      paramViewGroup.setImageDrawable(localResolveInfo.loadIcon(paramView));
      ((TextView)localView.findViewById(a.f.title)).setText(localResolveInfo.loadLabel(paramView));
      if ((this.NO) && (paramInt == 0) && (this.NP))
      {
        z.b(localView, true);
        return localView;
      }
      z.b(localView, false);
      return localView;
    }
    
    public final int getViewTypeCount()
    {
      return 3;
    }
  }
  
  private final class b
    implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
  {
    public b() {}
    
    public final void onClick(View paramView)
    {
      if (paramView == ActivityChooserView.e(ActivityChooserView.this))
      {
        ActivityChooserView.this.em();
        paramView = ActivityChooserView.a(ActivityChooserView.this).NM.ef();
        int i = ActivityChooserView.a(ActivityChooserView.this).NM.a(paramView);
        paramView = ActivityChooserView.a(ActivityChooserView.this).NM.aD(i);
        if (paramView != null)
        {
          paramView.addFlags(524288);
          ActivityChooserView.this.getContext().startActivity(paramView);
        }
        return;
      }
      if (paramView == ActivityChooserView.f(ActivityChooserView.this))
      {
        ActivityChooserView.a(ActivityChooserView.this, false);
        ActivityChooserView.a(ActivityChooserView.this, ActivityChooserView.g(ActivityChooserView.this));
        return;
      }
      throw new IllegalArgumentException();
    }
    
    public final void onDismiss()
    {
      if (ActivityChooserView.h(ActivityChooserView.this) != null) {
        ActivityChooserView.h(ActivityChooserView.this).onDismiss();
      }
      if (ActivityChooserView.this.ND != null) {
        ActivityChooserView.this.ND.p(false);
      }
    }
    
    public final void onItemClick(AdapterView<?> arg1, View paramView, int paramInt, long paramLong)
    {
      switch (((ActivityChooserView.a)???.getAdapter()).getItemViewType(paramInt))
      {
      default: 
        throw new IllegalArgumentException();
      case 1: 
        ActivityChooserView.a(ActivityChooserView.this, Integer.MAX_VALUE);
      }
      do
      {
        return;
        ActivityChooserView.this.em();
        if (!ActivityChooserView.d(ActivityChooserView.this)) {
          break;
        }
      } while (paramInt <= 0);
      paramView = ActivityChooserView.a(ActivityChooserView.this).NM;
      for (;;)
      {
        synchronized (paramView.Nh)
        {
          paramView.eg();
          d.a locala1 = (d.a)paramView.Ni.get(paramInt);
          d.a locala2 = (d.a)paramView.Ni.get(0);
          if (locala2 != null)
          {
            f = locala2.weight - locala1.weight + 5.0F;
            paramView.a(new d.c(new ComponentName(locala1.resolveInfo.activityInfo.packageName, locala1.resolveInfo.activityInfo.name), System.currentTimeMillis(), f));
            return;
          }
        }
        float f = 1.0F;
      }
      if (ActivityChooserView.a(ActivityChooserView.this).NO) {}
      for (;;)
      {
        ??? = ActivityChooserView.a(ActivityChooserView.this).NM.aD(paramInt);
        if (??? == null) {
          break;
        }
        ???.addFlags(524288);
        ActivityChooserView.this.getContext().startActivity(???);
        return;
        paramInt += 1;
      }
    }
    
    public final boolean onLongClick(View paramView)
    {
      if (paramView == ActivityChooserView.e(ActivityChooserView.this))
      {
        if (ActivityChooserView.a(ActivityChooserView.this).getCount() > 0)
        {
          ActivityChooserView.a(ActivityChooserView.this, true);
          ActivityChooserView.a(ActivityChooserView.this, ActivityChooserView.g(ActivityChooserView.this));
        }
        return true;
      }
      throw new IllegalArgumentException();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\android\support\v7\widget\ActivityChooserView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */