package android.support.v4.b.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

class f
  extends d
{
  f(Drawable paramDrawable)
  {
    super(paramDrawable);
  }
  
  f(d.a parama, Resources paramResources)
  {
    super(parama, paramResources);
  }
  
  d.a bq()
  {
    return new a(this.ti);
  }
  
  public void jumpToCurrentState()
  {
    this.mDrawable.jumpToCurrentState();
  }
  
  private static final class a
    extends d.a
  {
    a(d.a parama)
    {
      super();
    }
    
    public final Drawable newDrawable(Resources paramResources)
    {
      return new f(this, paramResources);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\b\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */