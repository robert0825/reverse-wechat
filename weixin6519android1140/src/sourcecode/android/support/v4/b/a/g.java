package android.support.v4.b.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

class g
  extends f
{
  g(Drawable paramDrawable)
  {
    super(paramDrawable);
  }
  
  g(d.a parama, Resources paramResources)
  {
    super(parama, paramResources);
  }
  
  d.a bq()
  {
    return new a(this.ti);
  }
  
  public boolean isAutoMirrored()
  {
    return this.mDrawable.isAutoMirrored();
  }
  
  public void setAutoMirrored(boolean paramBoolean)
  {
    this.mDrawable.setAutoMirrored(paramBoolean);
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
      return new g(this, paramResources);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\b\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */