package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

final class ao
  extends ad
{
  private final WeakReference<Context> Yt;
  
  public ao(Context paramContext, Resources paramResources)
  {
    super(paramResources);
    this.Yt = new WeakReference(paramContext);
  }
  
  public final Drawable getDrawable(int paramInt)
  {
    Drawable localDrawable = super.getDrawable(paramInt);
    Context localContext = (Context)this.Yt.get();
    if ((localDrawable != null) && (localContext != null))
    {
      h.ex();
      h.a(localContext, paramInt, localDrawable);
    }
    return localDrawable;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */