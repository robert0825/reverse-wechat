package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.a.a.h;
import android.support.v7.app.a;
import android.support.v7.app.a.a;
import android.support.v7.app.a.a.1;
import android.support.v7.app.a.a.2;
import android.support.v7.app.a.a.3;
import android.support.v7.app.a.a.4;
import android.support.v7.app.a.c;
import android.support.v7.app.b;
import android.support.v7.app.b.a;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public final class e
  implements l, AdapterView.OnItemClickListener
{
  public LayoutInflater CJ;
  int JL;
  public ExpandedMenuView JZ;
  public int Ka;
  int Kb;
  public a Kc;
  public l.a dm;
  f dn;
  Context mContext;
  private int mId;
  
  private e(int paramInt)
  {
    this.JL = paramInt;
    this.Kb = 0;
  }
  
  public e(Context paramContext, int paramInt)
  {
    this(paramInt);
    this.mContext = paramContext;
    this.CJ = LayoutInflater.from(this.mContext);
  }
  
  public final boolean B()
  {
    return false;
  }
  
  public final void a(Context paramContext, f paramf)
  {
    if (this.Kb != 0)
    {
      this.mContext = new ContextThemeWrapper(paramContext, this.Kb);
      this.CJ = LayoutInflater.from(this.mContext);
    }
    for (;;)
    {
      this.dn = paramf;
      if (this.Kc != null) {
        this.Kc.notifyDataSetChanged();
      }
      return;
      if (this.mContext != null)
      {
        this.mContext = paramContext;
        if (this.CJ == null) {
          this.CJ = LayoutInflater.from(this.mContext);
        }
      }
    }
  }
  
  public final void a(f paramf, boolean paramBoolean)
  {
    if (this.dm != null) {
      this.dm.a(paramf, paramBoolean);
    }
  }
  
  public final boolean a(p paramp)
  {
    if (!paramp.hasVisibleItems()) {
      return false;
    }
    g localg = new g(paramp);
    Object localObject1 = localg.dn;
    b.a locala = new b.a(((f)localObject1).mContext);
    localg.KC = new e(locala.FD.mContext, a.h.abc_list_menu_item_layout);
    localg.KC.dm = localg;
    localg.dn.a(localg.KC);
    Object localObject2 = localg.KC.getAdapter();
    locala.FD.EP = ((ListAdapter)localObject2);
    locala.FD.Fn = localg;
    localObject2 = ((f)localObject1).Ks;
    a.a locala1;
    a locala2;
    ListView localListView;
    label406:
    label447:
    label479:
    int i;
    if (localObject2 != null)
    {
      locala.FD.EO = ((View)localObject2);
      locala.FD.Fl = localg;
      localObject2 = new b(locala.FD.mContext, locala.nW);
      locala1 = locala.FD;
      locala2 = b.a((b)localObject2);
      if (locala1.EO == null) {
        break label777;
      }
      locala2.EO = locala1.EO;
      if (locala1.Eu != null)
      {
        localObject1 = locala1.Eu;
        locala2.Eu = ((CharSequence)localObject1);
        if (locala2.iD != null) {
          locala2.iD.setText((CharSequence)localObject1);
        }
      }
      if (locala1.Fd != null) {
        locala2.a(-1, locala1.Fd, locala1.Fe, null);
      }
      if (locala1.Ff != null) {
        locala2.a(-2, locala1.Ff, locala1.Fg, null);
      }
      if (locala1.Fh != null) {
        locala2.a(-3, locala1.Fh, locala1.Fi, null);
      }
      if ((locala1.Fm != null) || (locala1.AE != null) || (locala1.EP != null))
      {
        localListView = (ListView)locala1.CJ.inflate(locala2.ET, null);
        if (!locala1.Fp) {
          break label966;
        }
        if (locala1.AE != null) {
          break label938;
        }
        localObject1 = new a.a.1(locala1, locala1.mContext, locala2.EU, locala1.Fm, localListView);
        locala2.EP = ((ListAdapter)localObject1);
        locala2.EQ = locala1.EQ;
        if (locala1.Fn == null) {
          break label1082;
        }
        localListView.setOnItemClickListener(new a.a.3(locala1, locala2));
        if (locala1.Fu != null) {
          localListView.setOnItemSelectedListener(locala1.Fu);
        }
        if (!locala1.Fq) {
          break label1111;
        }
        localListView.setChoiceMode(1);
        locala2.Ev = localListView;
      }
      if (locala1.mView == null) {
        break label1153;
      }
      if (!locala1.EB) {
        break label1128;
      }
      localObject1 = locala1.mView;
      i = locala1.Ex;
      int j = locala1.Ey;
      int k = locala1.Ez;
      int m = locala1.EA;
      locala2.mView = ((View)localObject1);
      locala2.Ew = 0;
      locala2.EB = true;
      locala2.Ex = i;
      locala2.Ey = j;
      locala2.Ez = k;
      locala2.EA = m;
    }
    for (;;)
    {
      ((b)localObject2).setCancelable(locala.FD.nX);
      if (locala.FD.nX) {
        ((b)localObject2).setCanceledOnTouchOutside(true);
      }
      ((b)localObject2).setOnCancelListener(locala.FD.Fj);
      ((b)localObject2).setOnDismissListener(locala.FD.Fk);
      if (locala.FD.Fl != null) {
        ((b)localObject2).setOnKeyListener(locala.FD.Fl);
      }
      localg.KB = ((b)localObject2);
      localg.KB.setOnDismissListener(localg);
      localObject1 = localg.KB.getWindow().getAttributes();
      ((WindowManager.LayoutParams)localObject1).type = 1003;
      ((WindowManager.LayoutParams)localObject1).flags |= 0x20000;
      localg.KB.show();
      if (this.dm != null) {
        this.dm.d(paramp);
      }
      return true;
      localObject2 = ((f)localObject1).Kr;
      locala.FD.jd = ((Drawable)localObject2);
      localObject1 = ((f)localObject1).Kq;
      locala.FD.tX = ((CharSequence)localObject1);
      break;
      label777:
      if (locala1.tX != null) {
        locala2.setTitle(locala1.tX);
      }
      if (locala1.jd != null)
      {
        localObject1 = locala1.jd;
        locala2.jd = ((Drawable)localObject1);
        locala2.EM = 0;
        if (locala2.jV != null)
        {
          if (localObject1 == null) {
            break label925;
          }
          locala2.jV.setVisibility(0);
          locala2.jV.setImageDrawable((Drawable)localObject1);
        }
      }
      for (;;)
      {
        if (locala1.EM != 0) {
          locala2.setIcon(locala1.EM);
        }
        if (locala1.Fc == 0) {
          break;
        }
        i = locala1.Fc;
        localObject1 = new TypedValue();
        locala2.mContext.getTheme().resolveAttribute(i, (TypedValue)localObject1, true);
        locala2.setIcon(((TypedValue)localObject1).resourceId);
        break;
        label925:
        locala2.jV.setVisibility(8);
      }
      label938:
      localObject1 = new a.a.2(locala1, locala1.mContext, locala1.AE, localListView, locala2);
      break label406;
      label966:
      if (locala1.Fq) {}
      for (i = locala2.EV;; i = locala2.EW)
      {
        if (locala1.AE == null) {
          break label1041;
        }
        localObject1 = new SimpleCursorAdapter(locala1.mContext, i, locala1.AE, new String[] { locala1.Fs }, new int[] { 16908308 });
        break;
      }
      label1041:
      if (locala1.EP != null)
      {
        localObject1 = locala1.EP;
        break label406;
      }
      localObject1 = new a.c(locala1.mContext, i, locala1.Fm);
      break label406;
      label1082:
      if (locala1.Fr == null) {
        break label447;
      }
      localListView.setOnItemClickListener(new a.a.4(locala1, localListView, locala2));
      break label447;
      label1111:
      if (!locala1.Fp) {
        break label479;
      }
      localListView.setChoiceMode(2);
      break label479;
      label1128:
      locala2.mView = locala1.mView;
      locala2.Ew = 0;
      locala2.EB = false;
      continue;
      label1153:
      if (locala1.Ew != 0)
      {
        i = locala1.Ew;
        locala2.mView = null;
        locala2.Ew = i;
        locala2.EB = false;
      }
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
  
  public final void f(boolean paramBoolean)
  {
    if (this.Kc != null) {
      this.Kc.notifyDataSetChanged();
    }
  }
  
  public final ListAdapter getAdapter()
  {
    if (this.Kc == null) {
      this.Kc = new a();
    }
    return this.Kc;
  }
  
  public final int getId()
  {
    return this.mId;
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.dn.a(this.Kc.ax(paramInt), this, 0);
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = ((Bundle)paramParcelable).getSparseParcelableArray("android:menu:list");
    if (paramParcelable != null) {
      this.JZ.restoreHierarchyState(paramParcelable);
    }
  }
  
  public final Parcelable onSaveInstanceState()
  {
    if (this.JZ == null) {
      return null;
    }
    Bundle localBundle = new Bundle();
    SparseArray localSparseArray = new SparseArray();
    if (this.JZ != null) {
      this.JZ.saveHierarchyState(localSparseArray);
    }
    localBundle.putSparseParcelableArray("android:menu:list", localSparseArray);
    return localBundle;
  }
  
  private final class a
    extends BaseAdapter
  {
    private int Kd = -1;
    
    public a()
    {
      dq();
    }
    
    private void dq()
    {
      h localh = e.this.dn.Kz;
      if (localh != null)
      {
        ArrayList localArrayList = e.this.dn.dA();
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
      ArrayList localArrayList = e.this.dn.dA();
      int i = e.this.Ka + paramInt;
      paramInt = i;
      if (this.Kd >= 0)
      {
        paramInt = i;
        if (i >= this.Kd) {
          paramInt = i + 1;
        }
      }
      return (h)localArrayList.get(paramInt);
    }
    
    public final int getCount()
    {
      int i = e.this.dn.dA().size() - e.this.Ka;
      if (this.Kd < 0) {
        return i;
      }
      return i - 1;
    }
    
    public final long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (paramView == null) {
        paramView = e.this.CJ.inflate(e.this.JL, paramViewGroup, false);
      }
      for (;;)
      {
        ((m.a)paramView).a(ax(paramInt));
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\view\menu\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */