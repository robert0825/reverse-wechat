package android.support.v7.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v4.c.a.a;
import android.support.v4.e.j;
import android.support.v7.view.menu.n;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

@TargetApi(11)
public final class f
  extends ActionMode
{
  final b Ix;
  final Context mContext;
  
  public f(Context paramContext, b paramb)
  {
    this.mContext = paramContext;
    this.Ix = paramb;
  }
  
  public final void finish()
  {
    this.Ix.finish();
  }
  
  public final View getCustomView()
  {
    return this.Ix.getCustomView();
  }
  
  public final Menu getMenu()
  {
    return n.a(this.mContext, (a)this.Ix.getMenu());
  }
  
  public final MenuInflater getMenuInflater()
  {
    return this.Ix.getMenuInflater();
  }
  
  public final CharSequence getSubtitle()
  {
    return this.Ix.getSubtitle();
  }
  
  public final Object getTag()
  {
    return this.Ix.It;
  }
  
  public final CharSequence getTitle()
  {
    return this.Ix.getTitle();
  }
  
  public final boolean getTitleOptionalHint()
  {
    return this.Ix.Iu;
  }
  
  public final void invalidate()
  {
    this.Ix.invalidate();
  }
  
  public final boolean isTitleOptional()
  {
    return this.Ix.isTitleOptional();
  }
  
  public final void setCustomView(View paramView)
  {
    this.Ix.setCustomView(paramView);
  }
  
  public final void setSubtitle(int paramInt)
  {
    this.Ix.setSubtitle(paramInt);
  }
  
  public final void setSubtitle(CharSequence paramCharSequence)
  {
    this.Ix.setSubtitle(paramCharSequence);
  }
  
  public final void setTag(Object paramObject)
  {
    this.Ix.It = paramObject;
  }
  
  public final void setTitle(int paramInt)
  {
    this.Ix.setTitle(paramInt);
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    this.Ix.setTitle(paramCharSequence);
  }
  
  public final void setTitleOptionalHint(boolean paramBoolean)
  {
    this.Ix.setTitleOptionalHint(paramBoolean);
  }
  
  public static final class a
    implements b.a
  {
    final j<Menu, Menu> IA;
    final ActionMode.Callback Iy;
    final ArrayList<f> Iz;
    final Context mContext;
    
    public a(Context paramContext, ActionMode.Callback paramCallback)
    {
      this.mContext = paramContext;
      this.Iy = paramCallback;
      this.Iz = new ArrayList();
      this.IA = new j();
    }
    
    private Menu b(Menu paramMenu)
    {
      Menu localMenu2 = (Menu)this.IA.get(paramMenu);
      Menu localMenu1 = localMenu2;
      if (localMenu2 == null)
      {
        localMenu1 = n.a(this.mContext, (a)paramMenu);
        this.IA.put(paramMenu, localMenu1);
      }
      return localMenu1;
    }
    
    public final void a(b paramb)
    {
      this.Iy.onDestroyActionMode(b(paramb));
    }
    
    public final boolean a(b paramb, Menu paramMenu)
    {
      return this.Iy.onCreateActionMode(b(paramb), b(paramMenu));
    }
    
    public final boolean a(b paramb, MenuItem paramMenuItem)
    {
      return this.Iy.onActionItemClicked(b(paramb), n.a(this.mContext, (android.support.v4.c.a.b)paramMenuItem));
    }
    
    public final ActionMode b(b paramb)
    {
      int j = this.Iz.size();
      int i = 0;
      while (i < j)
      {
        f localf = (f)this.Iz.get(i);
        if ((localf != null) && (localf.Ix == paramb)) {
          return localf;
        }
        i += 1;
      }
      paramb = new f(this.mContext, paramb);
      this.Iz.add(paramb);
      return paramb;
    }
    
    public final boolean b(b paramb, Menu paramMenu)
    {
      return this.Iy.onPrepareActionMode(b(paramb), b(paramMenu));
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\view\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */