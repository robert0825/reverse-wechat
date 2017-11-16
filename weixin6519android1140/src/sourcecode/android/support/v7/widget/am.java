package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.support.v7.app.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class am
  extends ContextWrapper
{
  private static final ArrayList<WeakReference<am>> Yp = new ArrayList();
  private Resources mResources;
  private final Resources.Theme mTheme;
  
  private am(Context paramContext)
  {
    super(paramContext);
    if (ar.hb())
    {
      this.mTheme = getResources().newTheme();
      this.mTheme.setTo(paramContext.getTheme());
      return;
    }
    this.mTheme = null;
  }
  
  public static Context q(Context paramContext)
  {
    int i;
    Object localObject;
    int j;
    if (((paramContext instanceof am)) || ((paramContext.getResources() instanceof ao)) || ((paramContext.getResources() instanceof ar)))
    {
      i = 0;
      localObject = paramContext;
      if (i != 0)
      {
        j = Yp.size();
        i = 0;
      }
    }
    for (;;)
    {
      if (i >= j) {
        break label122;
      }
      localObject = (WeakReference)Yp.get(i);
      if (localObject != null) {}
      for (localObject = (am)((WeakReference)localObject).get();; localObject = null)
      {
        if ((localObject == null) || (((am)localObject).getBaseContext() != paramContext)) {
          break label115;
        }
        return (Context)localObject;
        if ((d.cS()) && (Build.VERSION.SDK_INT > 20))
        {
          i = 0;
          break;
        }
        i = 1;
        break;
      }
      label115:
      i += 1;
    }
    label122:
    paramContext = new am(paramContext);
    Yp.add(new WeakReference(paramContext));
    return paramContext;
  }
  
  public final Resources getResources()
  {
    if (this.mResources == null) {
      if (this.mTheme != null) {
        break label37;
      }
    }
    label37:
    for (Object localObject = new ao(this, super.getResources());; localObject = new ar(this, super.getResources()))
    {
      this.mResources = ((Resources)localObject);
      return this.mResources;
    }
  }
  
  public final Resources.Theme getTheme()
  {
    if (this.mTheme == null) {
      return super.getTheme();
    }
    return this.mTheme;
  }
  
  public final void setTheme(int paramInt)
  {
    if (this.mTheme == null)
    {
      super.setTheme(paramInt);
      return;
    }
    this.mTheme.applyStyle(paramInt, true);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */