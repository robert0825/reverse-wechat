package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.view.z;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class b
  implements l
{
  protected LayoutInflater CJ;
  public Context JI;
  protected LayoutInflater JJ;
  private int JK;
  private int JL;
  public m JM;
  public l.a dm;
  public f dn;
  public Context mContext;
  public int mId;
  
  public b(Context paramContext, int paramInt1, int paramInt2)
  {
    this.JI = paramContext;
    this.JJ = LayoutInflater.from(paramContext);
    this.JK = paramInt1;
    this.JL = paramInt2;
  }
  
  public boolean B()
  {
    return false;
  }
  
  public View a(h paramh, View paramView, ViewGroup paramViewGroup)
  {
    if ((paramView instanceof m.a)) {}
    for (paramView = (m.a)paramView;; paramView = (m.a)this.JJ.inflate(this.JL, paramViewGroup, false))
    {
      a(paramh, paramView);
      return (View)paramView;
    }
  }
  
  public void a(Context paramContext, f paramf)
  {
    this.mContext = paramContext;
    this.CJ = LayoutInflater.from(this.mContext);
    this.dn = paramf;
  }
  
  public void a(f paramf, boolean paramBoolean)
  {
    if (this.dm != null) {
      this.dm.a(paramf, paramBoolean);
    }
  }
  
  public abstract void a(h paramh, m.a parama);
  
  public boolean a(p paramp)
  {
    if (this.dm != null) {
      return this.dm.d(paramp);
    }
    return false;
  }
  
  public final boolean b(h paramh)
  {
    return false;
  }
  
  public m c(ViewGroup paramViewGroup)
  {
    if (this.JM == null)
    {
      this.JM = ((m)this.JJ.inflate(this.JK, paramViewGroup, false));
      this.JM.a(this.dn);
      f(true);
    }
    return this.JM;
  }
  
  public final boolean c(h paramh)
  {
    return false;
  }
  
  public boolean c(ViewGroup paramViewGroup, int paramInt)
  {
    paramViewGroup.removeViewAt(paramInt);
    return true;
  }
  
  public boolean e(h paramh)
  {
    return true;
  }
  
  public void f(boolean paramBoolean)
  {
    ViewGroup localViewGroup = (ViewGroup)this.JM;
    if (localViewGroup == null) {}
    label225:
    label231:
    for (;;)
    {
      return;
      int j;
      if (this.dn != null)
      {
        this.dn.dz();
        ArrayList localArrayList = this.dn.dy();
        int m = localArrayList.size();
        int k = 0;
        int i = 0;
        j = i;
        if (k < m)
        {
          h localh = (h)localArrayList.get(k);
          if (!e(localh)) {
            break label225;
          }
          View localView1 = localViewGroup.getChildAt(i);
          if ((localView1 instanceof m.a)) {}
          for (Object localObject = ((m.a)localView1).z();; localObject = null)
          {
            View localView2 = a(localh, localView1, localViewGroup);
            if (localh != localObject)
            {
              localView2.setPressed(false);
              z.ab(localView2);
            }
            if (localView2 != localView1)
            {
              localObject = (ViewGroup)localView2.getParent();
              if (localObject != null) {
                ((ViewGroup)localObject).removeView(localView2);
              }
              ((ViewGroup)this.JM).addView(localView2, i);
            }
            i += 1;
            k += 1;
            break;
          }
        }
      }
      for (;;)
      {
        if (j >= localViewGroup.getChildCount()) {
          break label231;
        }
        if (!c(localViewGroup, j))
        {
          j += 1;
          continue;
          break;
          j = 0;
        }
      }
    }
  }
  
  public final int getId()
  {
    return this.mId;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\view\menu\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */