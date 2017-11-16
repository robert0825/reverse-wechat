package android.support.v4.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Iterator;

public final class am
  implements Iterable<Intent>
{
  private static final b sx = new c();
  public final ArrayList<Intent> sy = new ArrayList();
  public final Context sz;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      sx = new d();
      return;
    }
  }
  
  private am(Context paramContext)
  {
    this.sz = paramContext;
  }
  
  public static am k(Context paramContext)
  {
    return new am(paramContext);
  }
  
  public final am a(ComponentName paramComponentName)
  {
    int i = this.sy.size();
    try
    {
      for (paramComponentName = u.a(this.sz, paramComponentName); paramComponentName != null; paramComponentName = u.a(this.sz, paramComponentName.getComponent())) {
        this.sy.add(i, paramComponentName);
      }
      return this;
    }
    catch (PackageManager.NameNotFoundException paramComponentName)
    {
      throw new IllegalArgumentException(paramComponentName);
    }
  }
  
  public final Iterator<Intent> iterator()
  {
    return this.sy.iterator();
  }
  
  public static abstract interface a
  {
    public abstract Intent bo();
  }
  
  static abstract interface b {}
  
  static final class c
    implements am.b
  {}
  
  static final class d
    implements am.b
  {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\app\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */