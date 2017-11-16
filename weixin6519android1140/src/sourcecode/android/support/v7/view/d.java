package android.support.v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.support.v7.a.a.j;
import android.view.LayoutInflater;

public final class d
  extends ContextWrapper
{
  private LayoutInflater CJ;
  public int Iv;
  private Resources.Theme mTheme;
  
  public d(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.Iv = paramInt;
  }
  
  private void df()
  {
    if (this.mTheme == null) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        this.mTheme = getResources().newTheme();
        Resources.Theme localTheme = getBaseContext().getTheme();
        if (localTheme != null) {
          this.mTheme.setTo(localTheme);
        }
      }
      this.mTheme.applyStyle(this.Iv, true);
      return;
    }
  }
  
  public final Object getSystemService(String paramString)
  {
    if ("layout_inflater".equals(paramString))
    {
      if (this.CJ == null) {
        this.CJ = LayoutInflater.from(getBaseContext()).cloneInContext(this);
      }
      return this.CJ;
    }
    return getBaseContext().getSystemService(paramString);
  }
  
  public final Resources.Theme getTheme()
  {
    if (this.mTheme != null) {
      return this.mTheme;
    }
    if (this.Iv == 0) {
      this.Iv = a.j.Theme_AppCompat_Light;
    }
    df();
    return this.mTheme;
  }
  
  public final void setTheme(int paramInt)
  {
    if (this.Iv != paramInt)
    {
      this.Iv = paramInt;
      df();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\view\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */