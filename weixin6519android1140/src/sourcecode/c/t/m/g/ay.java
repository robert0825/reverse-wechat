package c.t.m.g;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ay
  extends av
  implements bt
{
  private z a = new z();
  private List<d> b = new ArrayList();
  
  public ay()
  {
    String str = bz.b("settings_in_client", "");
    if (!TextUtils.isEmpty(str)) {}
    try
    {
      this.a.a(str);
      c();
      return;
    }
    catch (Throwable localThrowable)
    {
      bz.a("settings_in_client", "");
    }
  }
  
  private void c()
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext()) {
      localIterator.next();
    }
  }
  
  public final String a()
  {
    return "settings";
  }
  
  public final String a(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    return this.a.a(paramString1, paramInt, paramString2, paramString3, paramString4, paramString5);
  }
  
  public final void a(String paramString1, String arg2)
  {
    if ((!TextUtils.isEmpty(???)) && (!bc.a().b().equals(???))) {
      bc.a().a(???, true);
    }
    if (!TextUtils.isEmpty(paramString1)) {
      synchronized (this.a)
      {
        this.a.b();
        this.a.a(paramString1);
        bz.a("settings_in_client", this.a.a());
        paramString1 = this.b.iterator();
        if (paramString1.hasNext()) {
          paramString1.next();
        }
      }
    }
  }
  
  public final void a_()
  {
    bv.c().b();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */