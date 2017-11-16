package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v7.a.a.a;
import android.support.v7.a.a.d;
import android.support.v7.a.a.h;
import android.support.v7.widget.ListPopupWindow;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import java.util.ArrayList;

public class k
  implements l, View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  static final int KX = a.h.abc_popup_menu_item_layout;
  public final LayoutInflater CJ;
  public boolean JY;
  public l.a KD;
  private final a KY;
  public final boolean KZ;
  private final int La;
  private final int Lb;
  private final int Lc;
  public ListPopupWindow Ld;
  private ViewTreeObserver Le;
  private ViewGroup Lf;
  private boolean Lg;
  private int Lh;
  public int Li = 0;
  public final f dn;
  public View gO;
  private final Context mContext;
  
  private k(Context paramContext, f paramf, View paramView)
  {
    this(paramContext, paramf, paramView, false, a.a.popupMenuStyle);
  }
  
  public k(Context paramContext, f paramf, View paramView, boolean paramBoolean, int paramInt)
  {
    this(paramContext, paramf, paramView, paramBoolean, paramInt, (byte)0);
  }
  
  private k(Context paramContext, f paramf, View paramView, boolean paramBoolean, int paramInt, byte paramByte)
  {
    this.mContext = paramContext;
    this.CJ = LayoutInflater.from(paramContext);
    this.dn = paramf;
    this.KY = new a(this.dn);
    this.KZ = paramBoolean;
    this.Lb = paramInt;
    this.Lc = 0;
    Resources localResources = paramContext.getResources();
    this.La = Math.max(localResources.getDisplayMetrics().widthPixels / 2, localResources.getDimensionPixelSize(a.d.abc_config_prefDialogWidth));
    this.gO = paramView;
    paramf.a(this, paramContext);
  }
  
  public final boolean B()
  {
    return false;
  }
  
  public final void a(Context paramContext, f paramf) {}
  
  public final void a(f paramf, boolean paramBoolean)
  {
    if (paramf != this.dn) {}
    do
    {
      return;
      dismiss();
    } while (this.KD == null);
    this.KD.a(paramf, paramBoolean);
  }
  
  public final boolean a(p paramp)
  {
    k localk;
    int i;
    if (paramp.hasVisibleItems())
    {
      localk = new k(this.mContext, paramp, this.gO);
      localk.KD = this.KD;
      int j = paramp.size();
      i = 0;
      if (i >= j) {
        break label120;
      }
      MenuItem localMenuItem = paramp.getItem(i);
      if ((!localMenuItem.isVisible()) || (localMenuItem.getIcon() == null)) {}
    }
    label120:
    for (boolean bool = true;; bool = false)
    {
      localk.JY = bool;
      if (localk.dK())
      {
        if (this.KD != null) {
          this.KD.d(paramp);
        }
        return true;
        i += 1;
        break;
      }
      return false;
    }
  }
  
  public final boolean b(h paramh)
  {
    return false;
  }
  
  public final boolean c(h paramh)
  {
    return false;
  }
  
  public final boolean dK()
  {
    int m = 0;
    this.Ld = new ListPopupWindow(this.mContext, null, this.Lb, this.Lc);
    this.Ld.setOnDismissListener(this);
    this.Ld.RZ = this;
    this.Ld.setAdapter(this.KY);
    this.Ld.setModal(true);
    View localView = this.gO;
    int i;
    int j;
    if (localView != null)
    {
      if (this.Le == null) {}
      for (i = 1;; i = 0)
      {
        this.Le = localView.getViewTreeObserver();
        if (i != 0) {
          this.Le.addOnGlobalLayoutListener(this);
        }
        this.Ld.RX = localView;
        this.Ld.Li = this.Li;
        if (!this.Lg)
        {
          a locala = this.KY;
          int n = View.MeasureSpec.makeMeasureSpec(0, 0);
          int i1 = View.MeasureSpec.makeMeasureSpec(0, 0);
          int i2 = locala.getCount();
          j = 0;
          int k = 0;
          localView = null;
          i = m;
          m = i;
          if (j < i2)
          {
            m = locala.getItemViewType(j);
            if (m == k) {
              break label341;
            }
            k = m;
            localView = null;
            label200:
            if (this.Lf == null) {
              this.Lf = new FrameLayout(this.mContext);
            }
            localView = locala.getView(j, localView, this.Lf);
            localView.measure(n, i1);
            m = localView.getMeasuredWidth();
            if (m < this.La) {
              break;
            }
            m = this.La;
          }
          this.Lh = m;
          this.Lg = true;
        }
        this.Ld.setContentWidth(this.Lh);
        this.Ld.fd();
        this.Ld.show();
        this.Ld.RM.setOnKeyListener(this);
        return true;
      }
    }
    return false;
    if (m > i) {
      i = m;
    }
    for (;;)
    {
      j += 1;
      break;
      label341:
      break label200;
    }
  }
  
  public final void dismiss()
  {
    if (isShowing()) {
      this.Ld.dismiss();
    }
  }
  
  public final void f(boolean paramBoolean)
  {
    this.Lg = false;
    if (this.KY != null) {
      this.KY.notifyDataSetChanged();
    }
  }
  
  public final int getId()
  {
    return 0;
  }
  
  public final boolean isShowing()
  {
    return (this.Ld != null) && (this.Ld.RL.isShowing());
  }
  
  public void onDismiss()
  {
    this.Ld = null;
    this.dn.close();
    if (this.Le != null)
    {
      if (!this.Le.isAlive()) {
        this.Le = this.gO.getViewTreeObserver();
      }
      this.Le.removeGlobalOnLayoutListener(this);
      this.Le = null;
    }
  }
  
  public void onGlobalLayout()
  {
    if (isShowing())
    {
      View localView = this.gO;
      if ((localView != null) && (localView.isShown())) {
        break label28;
      }
      dismiss();
    }
    label28:
    while (!isShowing()) {
      return;
    }
    this.Ld.show();
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = this.KY;
    a.a(paramAdapterView).a(paramAdapterView.ax(paramInt), null, 0);
  }
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 82))
    {
      dismiss();
      return true;
    }
    return false;
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable) {}
  
  public final Parcelable onSaveInstanceState()
  {
    return null;
  }
  
  private final class a
    extends BaseAdapter
  {
    private int Kd = -1;
    private f Lj;
    
    public a(f paramf)
    {
      this.Lj = paramf;
      dq();
    }
    
    private void dq()
    {
      h localh = k.this.dn.Kz;
      if (localh != null)
      {
        ArrayList localArrayList = k.this.dn.dA();
        int j = localArrayList.size();
        int i = 0;
        while (i < j)
        {
          if ((h)localArrayList.get(i) == localh)
          {
            this.Kd = i;
            return;
          }
          i += 1;
        }
      }
      this.Kd = -1;
    }
    
    public final h ax(int paramInt)
    {
      if (k.this.KZ) {}
      for (ArrayList localArrayList = this.Lj.dA();; localArrayList = this.Lj.dy())
      {
        int i = paramInt;
        if (this.Kd >= 0)
        {
          i = paramInt;
          if (paramInt >= this.Kd) {
            i = paramInt + 1;
          }
        }
        return (h)localArrayList.get(i);
      }
    }
    
    public final int getCount()
    {
      if (k.this.KZ) {}
      for (ArrayList localArrayList = this.Lj.dA(); this.Kd < 0; localArrayList = this.Lj.dy()) {
        return localArrayList.size();
      }
      return localArrayList.size() - 1;
    }
    
    public final long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (paramView == null) {
        paramView = k.this.CJ.inflate(k.KX, paramViewGroup, false);
      }
      for (;;)
      {
        paramViewGroup = (m.a)paramView;
        if (k.this.JY)
        {
          ListMenuItemView localListMenuItemView = (ListMenuItemView)paramView;
          localListMenuItemView.JY = true;
          localListMenuItemView.JW = true;
        }
        paramViewGroup.a(ax(paramInt));
        return paramView;
      }
    }
    
    public final void notifyDataSetChanged()
    {
      dq();
      super.notifyDataSetChanged();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\view\menu\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */