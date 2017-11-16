package c.t.m.g;

import android.os.Process;
import java.util.Map;

final class cc
  implements Runnable
{
  cc(String paramString1, int paramInt1, int paramInt2, String paramString2, Map paramMap1, Map paramMap2, boolean paramBoolean) {}
  
  public final void run()
  {
    Process.setThreadPriority(10);
    ca.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, true);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */