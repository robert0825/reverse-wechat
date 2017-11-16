package com.tencent.mm.plugin.fts.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.loader.stub.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public final class c
{
  public static final int[] lvW;
  public static final int[] lvX;
  public static final int[] lvY;
  public static final int[] lvZ;
  public static final int[] lwa;
  public static final int[] lwb;
  public static final int[] lwc;
  public static final int[] lwd;
  public static final int[] lwe;
  public static final int[] lwf;
  public static final int[] lwg;
  public static final int[] lwh;
  public static final Map<Integer, Integer> lwi;
  public static final int[] lwj;
  public static final int[] lwk;
  public static final int[] lwl;
  public static final int[] lwm;
  public static final int[] lwn;
  public static final int[] lwo;
  public static final String lwp;
  
  static
  {
    int j = 0;
    GMTrace.i(18619891187712L, 138729);
    lvW = new int[] { 65536 };
    lvX = new int[] { 196608 };
    lvY = new int[] { 262144 };
    lvZ = new int[] { 327680 };
    lwa = new int[] { 393216 };
    lwb = new int[] { 131073, 131074 };
    lwc = new int[] { 131072, 131075, 131076 };
    lwd = new int[] { 131072, 131075, 131076 };
    lwe = new int[] { 131072 };
    lwf = new int[] { 131073, 131074 };
    lwg = new int[] { 131077, 131078 };
    lwh = new int[] { 131079, 131080 };
    lwj = new int[] { 2, 3, 6, 7 };
    lwk = new int[] { 29, 30, 31, 34, 35, 36, 33, 32, 37 };
    Object localObject = new int[3];
    Object tmp266_265 = localObject;
    tmp266_265[0] = 8;
    Object tmp271_266 = tmp266_265;
    tmp271_266[1] = 9;
    Object tmp276_271 = tmp271_266;
    tmp276_271[2] = 10;
    tmp276_271;
    lwl = (int[])localObject;
    lwm = (int[])localObject;
    localObject = new HashMap();
    int i = 0;
    while (i < 9)
    {
      ((HashMap)localObject).put(Integer.valueOf(new int[] { 131072, 131073, 131074, 131075, 131076, 131077, 131078, 131079, 131080 }[i]), Integer.valueOf(i));
      i += 1;
    }
    lwi = Collections.unmodifiableMap((Map)localObject);
    lwn = new int[43];
    i = 0;
    while (i < 43)
    {
      lwn[new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 17, 18, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 0 }[i]] = i;
      i += 1;
    }
    lwo = new int[27];
    i = j;
    while (i < 27)
    {
      lwo[new int[] { 1, 2, 3, 4, 5, 6, 8, 19, 20, 21, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 7, 0 }[i]] = i;
      i += 1;
    }
    lwp = a.ghz + "fts/";
    GMTrace.o(18619891187712L, 138729);
  }
  
  public static final class a
  {
    public static final Pattern lwq;
    public static final Pattern lwr;
    public static final Pattern lws;
    public static final Pattern lwt;
    public static final Pattern lwu;
    public static final Pattern lwv;
    public static final Pattern lww;
    public static final Pattern lwx;
    
    static
    {
      GMTrace.i(18632239218688L, 138821);
      lwq = Pattern.compile(";");
      lwr = Pattern.compile(" ");
      lws = Pattern.compile("​");
      lwt = Pattern.compile("‌");
      Pattern localPattern = Pattern.compile("‍");
      lwu = localPattern;
      lwv = localPattern;
      lww = Pattern.compile("\\s+");
      lwx = Pattern.compile(",");
      GMTrace.o(18632239218688L, 138821);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\fts\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */