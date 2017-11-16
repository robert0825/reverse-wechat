package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.ae;
import android.support.v4.view.d;
import android.support.v4.view.d.a;
import android.support.v7.a.a.a;
import android.support.v7.a.a.g;
import android.support.v7.a.a.h;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.ActionMenuItemView.b;
import android.support.v7.view.menu.b;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.f.a;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.k;
import android.support.v7.view.menu.l.a;
import android.support.v7.view.menu.m;
import android.support.v7.view.menu.m.a;
import android.support.v7.view.menu.p;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;

final class ActionMenuPresenter
  extends b
  implements d.a
{
  boolean MA;
  private int MB;
  private final SparseBooleanArray MC = new SparseBooleanArray();
  private View MD;
  public e ME;
  public a MF;
  public c MG;
  private b MH;
  final f MI = new f();
  int MJ;
  public d Mp;
  private Drawable Mq;
  private boolean Mr;
  private boolean Ms;
  private boolean Mt;
  private int Mu;
  private int Mv;
  int Mw;
  boolean Mx;
  private boolean My;
  private boolean Mz;
  
  public ActionMenuPresenter(Context paramContext)
  {
    super(paramContext, a.h.abc_action_menu_layout, a.h.abc_action_menu_item_layout);
  }
  
  public final boolean B()
  {
    ArrayList localArrayList = this.dn.dy();
    int i4 = localArrayList.size();
    int i = this.Mw;
    int i3 = this.Mv;
    int i5 = View.MeasureSpec.makeMeasureSpec(0, 0);
    ViewGroup localViewGroup = (ViewGroup)this.JM;
    int k = 0;
    int m = 0;
    int n = 0;
    int j = 0;
    Object localObject1;
    if (j < i4)
    {
      localObject1 = (h)localArrayList.get(j);
      if (((h)localObject1).dI())
      {
        k += 1;
        label82:
        if ((!this.MA) || (!((h)localObject1).isActionViewExpanded())) {
          break label810;
        }
        i = 0;
      }
    }
    label302:
    label447:
    label519:
    label558:
    label631:
    label643:
    label648:
    label788:
    label799:
    label810:
    for (;;)
    {
      j += 1;
      break;
      if (((h)localObject1).dH())
      {
        m += 1;
        break label82;
      }
      n = 1;
      break label82;
      j = i;
      if (this.Ms) {
        if (n == 0)
        {
          j = i;
          if (k + m <= i) {}
        }
        else
        {
          j = i - 1;
        }
      }
      j -= k;
      localObject1 = this.MC;
      ((SparseBooleanArray)localObject1).clear();
      int i1;
      if (this.My)
      {
        i = i3 / this.MB;
        k = this.MB;
        m = this.MB;
        i1 = i3 % k / i + m;
      }
      for (;;)
      {
        n = 0;
        int i2 = 0;
        k = i;
        i = j;
        m = i3;
        j = n;
        h localh;
        Object localObject2;
        if (i2 < i4)
        {
          localh = (h)localArrayList.get(i2);
          if (localh.dI())
          {
            localObject2 = a(localh, this.MD, localViewGroup);
            if (this.MD == null) {
              this.MD = ((View)localObject2);
            }
            if (this.My)
            {
              n = k - ActionMenuView.d((View)localObject2, i1, k, i5, 0);
              k = ((View)localObject2).getMeasuredWidth();
              if (j != 0) {
                break label799;
              }
              j = k;
            }
          }
        }
        for (;;)
        {
          i3 = localh.getGroupId();
          if (i3 != 0) {
            ((SparseBooleanArray)localObject1).put(i3, true);
          }
          localh.H(true);
          k = m - k;
          m = i;
          i = n;
          i3 = i2 + 1;
          n = k;
          i2 = m;
          k = i;
          m = n;
          i = i2;
          i2 = i3;
          break;
          ((View)localObject2).measure(i5, i5);
          n = k;
          break label302;
          int i6;
          boolean bool;
          int i7;
          if (localh.dH())
          {
            i6 = localh.getGroupId();
            bool = ((SparseBooleanArray)localObject1).get(i6);
            if (((i > 0) || (bool)) && (m > 0) && ((!this.My) || (k > 0)))
            {
              i7 = 1;
              if (i7 == 0) {
                break label788;
              }
              localObject2 = a(localh, this.MD, localViewGroup);
              if (this.MD == null) {
                this.MD = ((View)localObject2);
              }
              if (!this.My) {
                break label631;
              }
              i3 = ActionMenuView.d((View)localObject2, i1, k, i5, 0);
              n = k - i3;
              k = n;
              if (i3 == 0)
              {
                i7 = 0;
                k = n;
              }
              i3 = ((View)localObject2).getMeasuredWidth();
              m -= i3;
              n = j;
              if (j == 0) {
                n = i3;
              }
              if (!this.My) {
                break label648;
              }
              if (m < 0) {
                break label643;
              }
              j = 1;
              i7 &= j;
              j = k;
              k = n;
            }
          }
          for (;;)
          {
            if ((i7 != 0) && (i6 != 0)) {
              ((SparseBooleanArray)localObject1).put(i6, true);
            }
            for (;;)
            {
              n = i;
              if (i7 != 0) {
                n = i - 1;
              }
              localh.H(i7);
              i3 = k;
              k = m;
              m = n;
              i = j;
              j = i3;
              break;
              int i8 = 0;
              break label447;
              ((View)localObject2).measure(i5, i5);
              break label519;
              j = 0;
              break label558;
              if (m + n > 0) {}
              for (j = 1;; j = 0)
              {
                i8 &= j;
                j = k;
                k = n;
                break;
              }
              if (bool)
              {
                ((SparseBooleanArray)localObject1).put(i6, false);
                i3 = 0;
                for (;;)
                {
                  if (i3 < i2)
                  {
                    localObject2 = (h)localArrayList.get(i3);
                    n = i;
                    if (((h)localObject2).getGroupId() == i6)
                    {
                      n = i;
                      if (((h)localObject2).dG()) {
                        n = i + 1;
                      }
                      ((h)localObject2).H(false);
                    }
                    i3 += 1;
                    i = n;
                    continue;
                    localh.H(false);
                    n = i;
                    i = k;
                    k = m;
                    m = n;
                    break;
                    return true;
                  }
                }
              }
            }
            n = k;
            k = j;
            j = n;
          }
        }
        i1 = 0;
        i = 0;
      }
    }
  }
  
  public final View a(h paramh, View paramView, ViewGroup paramViewGroup)
  {
    View localView = paramh.getActionView();
    if ((localView == null) || (paramh.dJ())) {
      localView = super.a(paramh, paramView, paramViewGroup);
    }
    if (paramh.isActionViewExpanded()) {}
    for (int i = 8;; i = 0)
    {
      localView.setVisibility(i);
      paramh = (ActionMenuView)paramViewGroup;
      paramView = localView.getLayoutParams();
      if (!paramh.checkLayoutParams(paramView)) {
        localView.setLayoutParams(ActionMenuView.c(paramView));
      }
      return localView;
    }
  }
  
  public final void a(Context paramContext, f paramf)
  {
    boolean bool = true;
    super.a(paramContext, paramf);
    paramf = paramContext.getResources();
    paramContext = android.support.v7.view.a.o(paramContext);
    int i;
    if (!this.Mt)
    {
      if (Build.VERSION.SDK_INT >= 19) {
        this.Ms = bool;
      }
    }
    else
    {
      if (!this.Mz) {
        this.Mu = (paramContext.mContext.getResources().getDisplayMetrics().widthPixels / 2);
      }
      if (!this.Mx) {
        this.Mw = paramContext.mContext.getResources().getInteger(a.g.abc_max_action_buttons);
      }
      i = this.Mu;
      if (!this.Ms) {
        break label227;
      }
      if (this.Mp == null)
      {
        this.Mp = new d(this.JI);
        if (this.Mr)
        {
          this.Mp.setImageDrawable(this.Mq);
          this.Mq = null;
          this.Mr = false;
        }
        int j = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.Mp.measure(j, j);
      }
      i -= this.Mp.getMeasuredWidth();
    }
    for (;;)
    {
      this.Mv = i;
      this.MB = ((int)(56.0F * paramf.getDisplayMetrics().density));
      this.MD = null;
      return;
      if (!ae.b(ViewConfiguration.get(paramContext.mContext))) {
        break;
      }
      bool = false;
      break;
      label227:
      this.Mp = null;
    }
  }
  
  public final void a(f paramf, boolean paramBoolean)
  {
    dX();
    super.a(paramf, paramBoolean);
  }
  
  public final void a(h paramh, m.a parama)
  {
    parama.a(paramh);
    paramh = (ActionMenuView)this.JM;
    parama = (ActionMenuItemView)parama;
    parama.Jz = paramh;
    if (this.MH == null) {
      this.MH = new b();
    }
    parama.JB = this.MH;
  }
  
  public final void a(ActionMenuView paramActionMenuView)
  {
    this.JM = paramActionMenuView;
    paramActionMenuView.dn = this.dn;
  }
  
  public final boolean a(p paramp)
  {
    if (!paramp.hasVisibleItems()) {
      return false;
    }
    for (Object localObject1 = paramp; ((p)localObject1).Ll != this.dn; localObject1 = (p)((p)localObject1).Ll) {}
    Object localObject2 = ((p)localObject1).getItem();
    ViewGroup localViewGroup = (ViewGroup)this.JM;
    int i;
    if (localViewGroup != null)
    {
      int j = localViewGroup.getChildCount();
      i = 0;
      if (i < j)
      {
        localObject1 = localViewGroup.getChildAt(i);
        if ((!(localObject1 instanceof m.a)) || (((m.a)localObject1).z() != localObject2)) {}
      }
    }
    for (;;)
    {
      localObject2 = localObject1;
      if (localObject1 != null) {
        break label139;
      }
      if (this.Mp != null) {
        break label133;
      }
      return false;
      i += 1;
      break;
      localObject1 = null;
    }
    label133:
    localObject2 = this.Mp;
    label139:
    this.MJ = paramp.getItem().getItemId();
    this.MF = new a(this.mContext, paramp);
    this.MF.gO = ((View)localObject2);
    if (!this.MF.dK()) {
      throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }
    super.a(paramp);
    return true;
  }
  
  public final m c(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.c(paramViewGroup);
    ((ActionMenuView)paramViewGroup).a(this);
    return paramViewGroup;
  }
  
  public final boolean c(ViewGroup paramViewGroup, int paramInt)
  {
    if (paramViewGroup.getChildAt(paramInt) == this.Mp) {
      return false;
    }
    return super.c(paramViewGroup, paramInt);
  }
  
  public final void dW()
  {
    this.Ms = true;
    this.Mt = true;
  }
  
  public final boolean dX()
  {
    return hideOverflowMenu() | dY();
  }
  
  public final boolean dY()
  {
    if (this.MF != null)
    {
      this.MF.dismiss();
      return true;
    }
    return false;
  }
  
  public final boolean e(h paramh)
  {
    return paramh.dG();
  }
  
  public final void f(boolean paramBoolean)
  {
    int j = 1;
    int k = 0;
    ((View)this.JM).getParent();
    super.f(paramBoolean);
    ((View)this.JM).requestLayout();
    Object localObject;
    int i;
    if (this.dn != null)
    {
      localObject = this.dn;
      ((f)localObject).dz();
      localObject = ((f)localObject).Kl;
      int m = ((ArrayList)localObject).size();
      i = 0;
      while (i < m)
      {
        d locald = ((h)((ArrayList)localObject).get(i)).KI;
        if (locald != null) {
          locald.vM = this;
        }
        i += 1;
      }
    }
    if (this.dn != null)
    {
      localObject = this.dn.dA();
      i = k;
      if (this.Ms)
      {
        i = k;
        if (localObject != null)
        {
          i = ((ArrayList)localObject).size();
          if (i != 1) {
            break label270;
          }
          if (((h)((ArrayList)localObject).get(0)).isActionViewExpanded()) {
            break label265;
          }
          i = 1;
        }
      }
      label165:
      if (i == 0) {
        break label284;
      }
      if (this.Mp == null) {
        this.Mp = new d(this.JI);
      }
      localObject = (ViewGroup)this.Mp.getParent();
      if (localObject != this.JM)
      {
        if (localObject != null) {
          ((ViewGroup)localObject).removeView(this.Mp);
        }
        ((ActionMenuView)this.JM).addView(this.Mp, ActionMenuView.eb());
      }
    }
    for (;;)
    {
      ((ActionMenuView)this.JM).Ms = this.Ms;
      return;
      localObject = null;
      break;
      label265:
      i = 0;
      break label165;
      label270:
      if (i > 0) {}
      for (i = j;; i = 0) {
        break;
      }
      label284:
      if ((this.Mp != null) && (this.Mp.getParent() == this.JM)) {
        ((ViewGroup)this.JM).removeView(this.Mp);
      }
    }
  }
  
  public final boolean hideOverflowMenu()
  {
    if ((this.MG != null) && (this.JM != null))
    {
      ((View)this.JM).removeCallbacks(this.MG);
      this.MG = null;
      return true;
    }
    e locale = this.ME;
    if (locale != null)
    {
      locale.dismiss();
      return true;
    }
    return false;
  }
  
  public final boolean isOverflowMenuShowing()
  {
    return (this.ME != null) && (this.ME.isShowing());
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState)) {}
    do
    {
      do
      {
        return;
        paramParcelable = (SavedState)paramParcelable;
      } while (paramParcelable.MP <= 0);
      paramParcelable = this.dn.findItem(paramParcelable.MP);
    } while (paramParcelable == null);
    a((p)paramParcelable.getSubMenu());
  }
  
  public final Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState();
    localSavedState.MP = this.MJ;
    return localSavedState;
  }
  
  public final void q(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      super.a(null);
      return;
    }
    this.dn.D(false);
  }
  
  public final boolean showOverflowMenu()
  {
    if ((this.Ms) && (!isOverflowMenuShowing()) && (this.dn != null) && (this.JM != null) && (this.MG == null) && (!this.dn.dA().isEmpty()))
    {
      this.MG = new c(new e(this.mContext, this.dn, this.Mp));
      ((View)this.JM).post(this.MG);
      super.a(null);
      return true;
    }
    return false;
  }
  
  private static class SavedState
    implements Parcelable
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator() {};
    public int MP;
    
    SavedState() {}
    
    SavedState(Parcel paramParcel)
    {
      this.MP = paramParcel.readInt();
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(this.MP);
    }
  }
  
  private final class a
    extends k
  {
    private p KE;
    
    public a(Context paramContext, p paramp)
    {
      super(paramp, null, false, a.a.actionOverflowMenuStyle);
      this.KE = paramp;
      int j;
      int i;
      if (!((h)paramp.getItem()).dG())
      {
        if (ActionMenuPresenter.this.Mp == null)
        {
          paramContext = (View)ActionMenuPresenter.this.JM;
          this.gO = paramContext;
        }
      }
      else
      {
        this.KD = ActionMenuPresenter.this.MI;
        j = paramp.size();
        i = 0;
      }
      for (;;)
      {
        boolean bool1 = bool2;
        if (i < j)
        {
          this$1 = paramp.getItem(i);
          if ((ActionMenuPresenter.this.isVisible()) && (ActionMenuPresenter.this.getIcon() != null)) {
            bool1 = true;
          }
        }
        else
        {
          this.JY = bool1;
          return;
          paramContext = ActionMenuPresenter.this.Mp;
          break;
        }
        i += 1;
      }
    }
    
    public final void onDismiss()
    {
      super.onDismiss();
      ActionMenuPresenter.this.MF = null;
      ActionMenuPresenter.this.MJ = 0;
    }
  }
  
  private final class b
    extends ActionMenuItemView.b
  {
    public b() {}
    
    public final ListPopupWindow dn()
    {
      if (ActionMenuPresenter.this.MF != null) {
        return ActionMenuPresenter.this.MF.Ld;
      }
      return null;
    }
  }
  
  private final class c
    implements Runnable
  {
    private ActionMenuPresenter.e ML;
    
    public c(ActionMenuPresenter.e parame)
    {
      this.ML = parame;
    }
    
    public final void run()
    {
      Object localObject = ActionMenuPresenter.this.dn;
      if (((f)localObject).Ki != null) {
        ((f)localObject).Ki.b((f)localObject);
      }
      localObject = (View)ActionMenuPresenter.this.JM;
      if ((localObject != null) && (((View)localObject).getWindowToken() != null) && (this.ML.dK())) {
        ActionMenuPresenter.this.ME = this.ML;
      }
      ActionMenuPresenter.this.MG = null;
    }
  }
  
  private final class d
    extends AppCompatImageView
    implements ActionMenuView.a
  {
    private final float[] MM = new float[2];
    
    public d(Context paramContext)
    {
      super(null, a.a.actionOverflowButtonStyle);
      setClickable(true);
      setFocusable(true);
      setVisibility(0);
      setEnabled(true);
      setOnTouchListener(new ListPopupWindow.b(this)
      {
        public final boolean dZ()
        {
          if (ActionMenuPresenter.this.MG != null) {
            return false;
          }
          ActionMenuPresenter.this.hideOverflowMenu();
          return true;
        }
        
        public final ListPopupWindow dn()
        {
          if (ActionMenuPresenter.this.ME == null) {
            return null;
          }
          return ActionMenuPresenter.this.ME.Ld;
        }
        
        public final boolean jdMethod_do()
        {
          ActionMenuPresenter.this.showOverflowMenu();
          return true;
        }
      });
    }
    
    public final boolean dl()
    {
      return false;
    }
    
    public final boolean dm()
    {
      return false;
    }
    
    public final boolean performClick()
    {
      if (super.performClick()) {
        return true;
      }
      playSoundEffect(0);
      ActionMenuPresenter.this.showOverflowMenu();
      return true;
    }
    
    protected final boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      boolean bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
      Drawable localDrawable1 = getDrawable();
      Drawable localDrawable2 = getBackground();
      if ((localDrawable1 != null) && (localDrawable2 != null))
      {
        int i = getWidth();
        paramInt2 = getHeight();
        paramInt1 = Math.max(i, paramInt2) / 2;
        int j = getPaddingLeft();
        int k = getPaddingRight();
        paramInt3 = getPaddingTop();
        paramInt4 = getPaddingBottom();
        i = (i + (j - k)) / 2;
        paramInt2 = (paramInt2 + (paramInt3 - paramInt4)) / 2;
        android.support.v4.b.a.a.a(localDrawable2, i - paramInt1, paramInt2 - paramInt1, i + paramInt1, paramInt2 + paramInt1);
      }
      return bool;
    }
  }
  
  private final class e
    extends k
  {
    public e(Context paramContext, f paramf, View paramView)
    {
      super(paramf, paramView, true, a.a.actionOverflowMenuStyle);
      this.Li = 8388613;
      this.KD = ActionMenuPresenter.this.MI;
    }
    
    public final void onDismiss()
    {
      super.onDismiss();
      if (ActionMenuPresenter.this.dn != null) {
        ActionMenuPresenter.this.dn.close();
      }
      ActionMenuPresenter.this.ME = null;
    }
  }
  
  private final class f
    implements l.a
  {
    public f() {}
    
    public final void a(f paramf, boolean paramBoolean)
    {
      if ((paramf instanceof p)) {
        ((p)paramf).Ll.D(false);
      }
      l.a locala = ActionMenuPresenter.this.dm;
      if (locala != null) {
        locala.a(paramf, paramBoolean);
      }
    }
    
    public final boolean d(f paramf)
    {
      if (paramf == null) {
        return false;
      }
      ActionMenuPresenter.this.MJ = ((p)paramf).getItem().getItemId();
      l.a locala = ActionMenuPresenter.this.dm;
      if (locala != null) {
        return locala.d(paramf);
      }
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\ActionMenuPresenter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */