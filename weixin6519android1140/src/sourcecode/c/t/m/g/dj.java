package c.t.m.g;

import android.net.wifi.ScanResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class dj
  extends di
{
  public static final dj a = new dj(Collections.emptyList(), 0L);
  private final List<ScanResult> b;
  private final long c;
  
  public dj(List<ScanResult> paramList, long paramLong)
  {
    this.c = paramLong;
    this.b = new ArrayList(paramList);
  }
  
  public final List<ScanResult> a()
  {
    return Collections.unmodifiableList(this.b);
  }
  
  public final boolean a(long paramLong)
  {
    return paramLong - this.c < 60000L;
  }
  
  public final boolean a(dj paramdj)
  {
    paramdj = paramdj.b;
    List localList = this.b;
    if ((paramdj == null) || (localList == null)) {}
    while ((paramdj.size() == 0) || (localList.size() == 0) || (b.a.a(paramdj, localList))) {
      return false;
    }
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\dj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */