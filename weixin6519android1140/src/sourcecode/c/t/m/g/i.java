package c.t.m.g;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class i
  implements e
{
  public String a;
  public byte[] b;
  public Map<String, String> c;
  public boolean d = true;
  public int e = -1;
  public String f = "";
  public int g = 0;
  public boolean h = true;
  CountDownLatch i = new CountDownLatch(1);
  public volatile boolean j = false;
  public String k = "";
  private volatile boolean l = false;
  private ah m;
  
  public i(String paramString, byte[] paramArrayOfByte)
  {
    this.a = paramString;
    this.b = paramArrayOfByte;
    this.f = ce.d();
  }
  
  public final String a()
  {
    return this.f;
  }
  
  public final void a(ah paramah)
  {
    try
    {
      this.m = paramah;
      return;
    }
    finally
    {
      paramah = finally;
      throw paramah;
    }
  }
  
  public final void a(String paramString1, String paramString2)
  {
    if (this.c == null) {
      this.c = new HashMap();
    }
    if ((!TextUtils.isEmpty(paramString1)) && (!TextUtils.isEmpty(paramString2))) {
      this.c.put(paramString1, paramString2);
    }
  }
  
  public final void b()
  {
    this.g = 15000;
  }
  
  public final boolean c()
  {
    try
    {
      boolean bool = this.i.await(this.g, TimeUnit.MILLISECONDS);
      return bool;
    }
    catch (InterruptedException localInterruptedException) {}
    return true;
  }
  
  public final ah d()
  {
    try
    {
      ah localah = this.m;
      return localah;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("url:" + this.a);
    localStringBuilder.append(",body:" + ce.b(this.b));
    localStringBuilder.append(",isGet:false");
    localStringBuilder.append(",timeout:" + this.e);
    localStringBuilder.append(",tag:" + null);
    localStringBuilder.append(",httpCallback:" + null);
    localStringBuilder.append(",testMode:0");
    localStringBuilder.append(",httpCallback:" + null);
    localStringBuilder.append(",testMode:0");
    localStringBuilder.append(",followRedirects:" + this.d);
    localStringBuilder.append(",isAbort:false");
    localStringBuilder.append(",headers:" + this.c);
    return localStringBuilder.toString();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */