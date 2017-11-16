package c.t.m.g;

import android.os.SystemClock;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class af
  extends ad
{
  public boolean l = true;
  public String m;
  private ai n;
  private ah o;
  private int p;
  private ae q;
  private boolean r;
  private r s;
  private m t;
  
  public af(String paramString1, Map<String, String> paramMap, byte[] paramArrayOfByte, int paramInt, String paramString2, boolean paramBoolean, r paramr)
  {
    this.a = paramString1;
    this.b = false;
    this.c = paramMap;
    this.d = paramArrayOfByte;
    this.e = paramInt;
    this.f = paramString2;
    this.r = paramBoolean;
    this.s = paramr;
  }
  
  public final ah a()
  {
    this.o = new ah(0, "");
    for (;;)
    {
      long l2;
      try
      {
        URL localURL = new URL(this.a);
        this.q = new ae(localURL, this.a, this.s);
        boolean bool = localURL.getProtocol().toLowerCase().startsWith("https");
        List localList = this.q.a(this.r, bool);
        int i2 = localList.size();
        long l1 = SystemClock.elapsedRealtime();
        i = this.e;
        int j = 0;
        if (j >= i2) {
          break;
        }
        this.p = (j + 1);
        this.t = ((m)localList.get(j));
        String str = this.q.a(this.t);
        this.n = new ai(localURL.getHost(), str, this.b, this.c, this.d, i, this.f);
        if (j != 0) {
          this.n.q = true;
        }
        if ((o.i()) && (j != 0)) {
          this.n.n = true;
        }
        if ((j == 1) && (((m)localList.get(0)).a.equals(this.a)) && (((m)localList.get(1)).a.equals(this.a))) {
          this.n.o = true;
        }
        this.n.p = this.p;
        this.o = this.n.a();
        if ((this.n.h) || (this.o.c >= 500))
        {
          if ((o.h()) && (this.t != null) && (!this.t.b())) {
            ae.b(this.t);
          }
          int i1 = (int)(this.e - (SystemClock.elapsedRealtime() - l1));
          if (((this.o.a != 0) || (this.o.c < 200) || (this.o.c >= 400)) && (this.o.a != -20) && (this.o.a != 65236) && (this.o.a != 65230) && (j != i2 - 1) && (i1 > 200)) {
            break label546;
          }
          i = 1;
          k = i;
          if (i == 0)
          {
            k = i;
            if (this.o.a == -4)
            {
              k = u.a("direct_nonet_retry_gap", 0, 10000, 3000);
              l2 = this.n.m;
              if (l2 < k) {
                break label551;
              }
              k = 1;
            }
          }
          if (k != 0) {
            break;
          }
          a(true);
          j += 1;
          i = i1;
          continue;
        }
        ae.c(this.t);
      }
      catch (MalformedURLException localMalformedURLException)
      {
        this.o.a = 65236;
        return this.o;
      }
      continue;
      label546:
      int i = 0;
      continue;
      label551:
      SystemClock.sleep(ce.a((int)(k - l2), 200, k, 200));
      int k = i;
    }
    return this.o;
  }
  
  public final void a(boolean paramBoolean)
  {
    HashMap localHashMap1;
    if (this.n != null)
    {
      if (this.h) {
        this.n.h = true;
      }
      localHashMap1 = new HashMap();
      if (!TextUtils.isEmpty(this.k)) {
        localHashMap1.put("B83", this.k);
      }
      localHashMap1.put("B44", ce.b(this.a));
      if (this.t != null)
      {
        if (!this.t.b()) {
          localHashMap1.put("B10", this.t.a());
        }
        if (this.t.c != -1) {
          localHashMap1.put("B45", this.t.c);
        }
      }
      localHashMap1.put("B53", this.p);
      if (!TextUtils.isEmpty(this.q.a)) {
        localHashMap1.put("B26", this.q.a);
      }
      if (this.i) {
        localHashMap1.put("B97", "1");
      }
      if (paramBoolean) {
        this.n.a(true, null, localHashMap1);
      }
    }
    else
    {
      return;
    }
    HashMap localHashMap2 = new HashMap();
    localHashMap2.put("B22", this.j);
    if (!ce.a(this.m)) {
      localHashMap2.put("B15", this.m);
    }
    this.n.a(false, localHashMap2, localHashMap1);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */