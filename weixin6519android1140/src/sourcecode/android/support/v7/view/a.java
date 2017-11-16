package android.support.v7.view;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.support.v7.a.a.b;

public final class a
{
  public Context mContext;
  
  private a(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  public static a o(Context paramContext)
  {
    return new a(paramContext);
  }
  
  public final boolean dd()
  {
    if (this.mContext.getApplicationInfo().targetSdkVersion >= 16) {
      return this.mContext.getResources().getBoolean(a.b.abc_action_bar_embed_tabs);
    }
    return this.mContext.getResources().getBoolean(a.b.abc_action_bar_embed_tabs_pre_jb);
  }
  
  public final boolean de()
  {
    return this.mContext.getApplicationInfo().targetSdkVersion < 14;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\view\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */