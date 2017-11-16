package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.a.d;
import android.support.design.a.f;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.l;
import android.support.v7.view.menu.l.a;
import android.support.v7.view.menu.p;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.t;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;

public final class b
  implements l
{
  public ColorStateList dj;
  public NavigationMenuView dk;
  public LinearLayout dl;
  private l.a dm;
  public f dn;
  public b jdField_do;
  public int dp;
  public boolean dq;
  public ColorStateList dr;
  public Drawable ds;
  public int dt;
  public int du;
  public int mId;
  public LayoutInflater mLayoutInflater;
  public final View.OnClickListener mOnClickListener = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      paramAnonymousView = (NavigationMenuItemView)paramAnonymousView;
      b.this.g(true);
      paramAnonymousView = paramAnonymousView.di;
      boolean bool = b.this.dn.a(paramAnonymousView, b.this, 0);
      if ((paramAnonymousView != null) && (paramAnonymousView.isCheckable()) && (bool)) {
        b.this.jdField_do.d(paramAnonymousView);
      }
      b.this.g(false);
      b.this.f(false);
    }
  };
  
  public final boolean B()
  {
    return false;
  }
  
  public final void a(Context paramContext, f paramf)
  {
    this.mLayoutInflater = LayoutInflater.from(paramContext);
    this.dn = paramf;
    this.du = paramContext.getResources().getDimensionPixelOffset(a.d.an);
  }
  
  public final void a(ColorStateList paramColorStateList)
  {
    this.dj = paramColorStateList;
    f(false);
  }
  
  public final void a(Drawable paramDrawable)
  {
    this.ds = paramDrawable;
    f(false);
  }
  
  public final void a(f paramf, boolean paramBoolean)
  {
    if (this.dm != null) {
      this.dm.a(paramf, paramBoolean);
    }
  }
  
  public final boolean a(p paramp)
  {
    return false;
  }
  
  public final void b(ColorStateList paramColorStateList)
  {
    this.dr = paramColorStateList;
    f(false);
  }
  
  public final boolean b(h paramh)
  {
    return false;
  }
  
  public final boolean c(h paramh)
  {
    return false;
  }
  
  public final void e(int paramInt)
  {
    this.dp = paramInt;
    this.dq = true;
    f(false);
  }
  
  public final void f(boolean paramBoolean)
  {
    if (this.jdField_do != null)
    {
      b localb = this.jdField_do;
      localb.C();
      localb.TS.notifyChanged();
    }
  }
  
  public final void g(boolean paramBoolean)
  {
    if (this.jdField_do != null) {
      this.jdField_do.dz = paramBoolean;
    }
  }
  
  public final int getId()
  {
    return this.mId;
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (Bundle)paramParcelable;
    Object localObject1 = paramParcelable.getSparseParcelableArray("android:menu:list");
    if (localObject1 != null) {
      this.dk.restoreHierarchyState((SparseArray)localObject1);
    }
    localObject1 = paramParcelable.getBundle("android:menu:adapter");
    if (localObject1 != null)
    {
      paramParcelable = this.jdField_do;
      int i = ((Bundle)localObject1).getInt("android:menu:checked", 0);
      Object localObject2;
      if (i != 0)
      {
        paramParcelable.dz = true;
        localIterator = paramParcelable.dw.iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (d)localIterator.next();
          if ((localObject2 instanceof f))
          {
            localObject2 = ((f)localObject2).dC;
            if ((localObject2 != null) && (((h)localObject2).getItemId() == i)) {
              paramParcelable.d((h)localObject2);
            }
          }
        }
        paramParcelable.dz = false;
        paramParcelable.C();
      }
      localObject1 = ((Bundle)localObject1).getSparseParcelableArray("android:menu:action_views");
      Iterator localIterator = paramParcelable.dw.iterator();
      label225:
      while (localIterator.hasNext())
      {
        paramParcelable = (d)localIterator.next();
        if ((paramParcelable instanceof f))
        {
          localObject2 = ((f)paramParcelable).dC;
          if (localObject2 != null) {}
          for (paramParcelable = ((h)localObject2).getActionView();; paramParcelable = null)
          {
            if (paramParcelable == null) {
              break label225;
            }
            paramParcelable.restoreHierarchyState((SparseArray)((SparseArray)localObject1).get(((h)localObject2).getItemId()));
            break;
          }
        }
      }
    }
  }
  
  public final Parcelable onSaveInstanceState()
  {
    Bundle localBundle = new Bundle();
    if (this.dk != null)
    {
      SparseArray localSparseArray = new SparseArray();
      this.dk.saveHierarchyState(localSparseArray);
      localBundle.putSparseParcelableArray("android:menu:list", localSparseArray);
    }
    if (this.jdField_do != null) {
      localBundle.putBundle("android:menu:adapter", this.jdField_do.D());
    }
    return localBundle;
  }
  
  private static final class a
    extends b.j
  {
    public a(View paramView)
    {
      super();
    }
  }
  
  private final class b
    extends RecyclerView.a<b.j>
  {
    final ArrayList<b.d> dw = new ArrayList();
    private h dx;
    private ColorDrawable dy;
    boolean dz;
    
    public b()
    {
      C();
    }
    
    private void b(int paramInt1, int paramInt2)
    {
      while (paramInt1 < paramInt2)
      {
        h localh = ((b.f)this.dw.get(paramInt1)).dC;
        if (localh.getIcon() == null)
        {
          if (this.dy == null) {
            this.dy = new ColorDrawable(0);
          }
          localh.setIcon(this.dy);
        }
        paramInt1 += 1;
      }
    }
    
    final void C()
    {
      if (this.dz) {
        return;
      }
      this.dz = true;
      this.dw.clear();
      this.dw.add(new b.c());
      int k = -1;
      int i = 0;
      int j = 0;
      int i3 = b.this.dn.dy().size();
      int i1 = 0;
      while (i1 < i3)
      {
        h localh1 = (h)b.this.dn.dy().get(i1);
        if (localh1.isChecked()) {
          d(localh1);
        }
        if (localh1.isCheckable()) {
          localh1.E(false);
        }
        int m;
        int i2;
        int n;
        if (localh1.hasSubMenu())
        {
          SubMenu localSubMenu = localh1.getSubMenu();
          if (localSubMenu.hasVisibleItems())
          {
            if (i1 != 0) {
              this.dw.add(new b.e(b.this.du, 0));
            }
            this.dw.add(new b.f(localh1));
            m = 0;
            int i4 = this.dw.size();
            int i5 = localSubMenu.size();
            i2 = 0;
            while (i2 < i5)
            {
              h localh2 = (h)localSubMenu.getItem(i2);
              n = m;
              if (localh2.isVisible())
              {
                n = m;
                if (m == 0)
                {
                  n = m;
                  if (localh2.getIcon() != null) {
                    n = 1;
                  }
                }
                if (localh2.isCheckable()) {
                  localh2.E(false);
                }
                if (localh1.isChecked()) {
                  d(localh1);
                }
                this.dw.add(new b.f(localh2));
              }
              i2 += 1;
              m = n;
            }
            if (m != 0) {
              b(i4, this.dw.size());
            }
          }
          m = j;
          j = k;
          k = i;
          i = m;
          i1 += 1;
          m = j;
          j = i;
          i = k;
          k = m;
        }
        else
        {
          n = localh1.getGroupId();
          if (n != k)
          {
            i2 = this.dw.size();
            if (localh1.getIcon() != null)
            {
              i = 1;
              label402:
              k = i;
              m = i2;
              if (i1 == 0) {
                break label544;
              }
              this.dw.add(new b.e(b.this.du, b.this.du));
              j = i;
            }
          }
          for (i = i2 + 1;; i = m)
          {
            if ((j != 0) && (localh1.getIcon() == null)) {
              localh1.setIcon(17170445);
            }
            this.dw.add(new b.f(localh1));
            k = i;
            m = n;
            i = j;
            j = m;
            break;
            i = 0;
            break label402;
            k = j;
            m = i;
            if (j == 0)
            {
              k = j;
              m = i;
              if (localh1.getIcon() != null)
              {
                k = 1;
                b(i, this.dw.size());
                m = i;
              }
            }
            label544:
            j = k;
          }
        }
      }
      this.dz = false;
    }
    
    public final Bundle D()
    {
      Bundle localBundle = new Bundle();
      if (this.dx != null) {
        localBundle.putInt("android:menu:checked", this.dx.getItemId());
      }
      SparseArray localSparseArray = new SparseArray();
      Iterator localIterator = this.dw.iterator();
      label129:
      while (localIterator.hasNext())
      {
        Object localObject = (b.d)localIterator.next();
        if ((localObject instanceof b.f))
        {
          h localh = ((b.f)localObject).dC;
          if (localh != null) {}
          for (localObject = localh.getActionView();; localObject = null)
          {
            if (localObject == null) {
              break label129;
            }
            ParcelableSparseArray localParcelableSparseArray = new ParcelableSparseArray();
            ((View)localObject).saveHierarchyState(localParcelableSparseArray);
            localSparseArray.put(localh.getItemId(), localParcelableSparseArray);
            break;
          }
        }
      }
      localBundle.putSparseParcelableArray("android:menu:action_views", localSparseArray);
      return localBundle;
    }
    
    public final void d(h paramh)
    {
      if ((this.dx == paramh) || (!paramh.isCheckable())) {
        return;
      }
      if (this.dx != null) {
        this.dx.setChecked(false);
      }
      this.dx = paramh;
      paramh.setChecked(true);
    }
    
    public final int getItemCount()
    {
      return this.dw.size();
    }
    
    public final long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public final int getItemViewType(int paramInt)
    {
      b.d locald = (b.d)this.dw.get(paramInt);
      if ((locald instanceof b.e)) {
        return 2;
      }
      if ((locald instanceof b.c)) {
        return 3;
      }
      if ((locald instanceof b.f))
      {
        if (((b.f)locald).dC.hasSubMenu()) {
          return 1;
        }
        return 0;
      }
      throw new RuntimeException("Unknown item type.");
    }
  }
  
  private static final class c
    implements b.d
  {}
  
  private static abstract interface d {}
  
  private static final class e
    implements b.d
  {
    final int dA;
    final int dB;
    
    public e(int paramInt1, int paramInt2)
    {
      this.dA = paramInt1;
      this.dB = paramInt2;
    }
  }
  
  private static final class f
    implements b.d
  {
    final h dC;
    
    public f(h paramh)
    {
      this.dC = paramh;
    }
  }
  
  private static final class g
    extends b.j
  {
    public g(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, View.OnClickListener paramOnClickListener)
    {
      super();
      this.UU.setOnClickListener(paramOnClickListener);
    }
  }
  
  private static final class h
    extends b.j
  {
    public h(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup)
    {
      super();
    }
  }
  
  private static final class i
    extends b.j
  {
    public i(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup)
    {
      super();
    }
  }
  
  private static abstract class j
    extends RecyclerView.t
  {
    public j(View paramView)
    {
      super();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\design\internal\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */