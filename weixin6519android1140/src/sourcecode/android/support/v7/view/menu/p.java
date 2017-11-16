package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.a;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class p
  extends f
  implements SubMenu
{
  public f Ll;
  private h Lm;
  
  public p(Context paramContext, f paramf, h paramh)
  {
    super(paramContext);
    this.Ll = paramf;
    this.Lm = paramh;
  }
  
  public final void a(f.a parama)
  {
    this.Ll.a(parama);
  }
  
  final boolean b(f paramf, MenuItem paramMenuItem)
  {
    return (super.b(paramf, paramMenuItem)) || (this.Ll.b(paramf, paramMenuItem));
  }
  
  public final f dB()
  {
    return this.Ll;
  }
  
  public final String dr()
  {
    if (this.Lm != null) {}
    for (int i = this.Lm.getItemId(); i == 0; i = 0) {
      return null;
    }
    return super.dr() + ":" + i;
  }
  
  public final boolean ds()
  {
    return this.Ll.ds();
  }
  
  public final boolean dt()
  {
    return this.Ll.dt();
  }
  
  public final boolean g(h paramh)
  {
    return this.Ll.g(paramh);
  }
  
  public MenuItem getItem()
  {
    return this.Lm;
  }
  
  public final boolean h(h paramh)
  {
    return this.Ll.h(paramh);
  }
  
  public SubMenu setHeaderIcon(int paramInt)
  {
    super.k(a.b(this.mContext, paramInt));
    return this;
  }
  
  public SubMenu setHeaderIcon(Drawable paramDrawable)
  {
    super.k(paramDrawable);
    return this;
  }
  
  public SubMenu setHeaderTitle(int paramInt)
  {
    super.g(this.mContext.getResources().getString(paramInt));
    return this;
  }
  
  public SubMenu setHeaderTitle(CharSequence paramCharSequence)
  {
    super.g(paramCharSequence);
    return this;
  }
  
  public SubMenu setHeaderView(View paramView)
  {
    super.a(null, null, paramView);
    return this;
  }
  
  public SubMenu setIcon(int paramInt)
  {
    this.Lm.setIcon(paramInt);
    return this;
  }
  
  public SubMenu setIcon(Drawable paramDrawable)
  {
    this.Lm.setIcon(paramDrawable);
    return this;
  }
  
  public void setQwertyMode(boolean paramBoolean)
  {
    this.Ll.setQwertyMode(paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\view\menu\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */