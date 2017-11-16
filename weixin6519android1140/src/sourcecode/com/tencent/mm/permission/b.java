package com.tencent.mm.permission;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Process;
import android.util.Base64;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.e.a.a;
import com.tencent.mm.compatible.e.a.b;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.g.a.ll;
import com.tencent.mm.g.a.lm;
import com.tencent.mm.k.g;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.s;
import com.tencent.mm.y.as;
import com.tencent.mm.y.at;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class b
{
  static final String esG;
  static final String esH;
  static Map<Integer, a> hiA;
  c hiB;
  private c hiC;
  
  static
  {
    GMTrace.i(3497042903040L, 26055);
    Object localObject = p.ta();
    esG = (String)localObject;
    esH = o.getString(((String)localObject).hashCode());
    localObject = new HashMap();
    hiA = (Map)localObject;
    ((Map)localObject).put(Integer.valueOf(1), new a(38, 40, 41, R.l.cTY, R.l.cTQ));
    hiA.put(Integer.valueOf(2), new a(43, 44, 45, R.l.cTX, R.l.cTR));
    GMTrace.o(3497042903040L, 26055);
  }
  
  public b()
  {
    GMTrace.i(3495700725760L, 26045);
    this.hiB = new c() {};
    this.hiC = new c() {};
    com.tencent.mm.sdk.b.a.vgX.b(this.hiB);
    com.tencent.mm.sdk.b.a.vgX.b(this.hiC);
    GMTrace.o(3495700725760L, 26045);
  }
  
  private static void R(String paramString, int paramInt)
  {
    GMTrace.i(3496506032128L, 26051);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("\n#client.version=").append(d.tJC).append("\n");
    localStringBuilder.append("#accinfo.revision=").append(com.tencent.mm.sdk.platformtools.e.REV).append("\n");
    localStringBuilder.append("#accinfo.uin=").append(as.gnb.B("last_login_uin", esH)).append("\n");
    localStringBuilder.append("#accinfo.dev=").append(esG).append("\n");
    localStringBuilder.append("#accinfo.build=").append(com.tencent.mm.sdk.platformtools.e.TIME).append(":").append(com.tencent.mm.sdk.platformtools.e.HOSTNAME).append(":").append(f.eqV).append("\n");
    Object localObject1 = new Date();
    Object localObject2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault());
    localStringBuilder.append("#accinfo.uploadTime=" + ((SimpleDateFormat)localObject2).format((Date)localObject1)).append("\n");
    localStringBuilder.append("#permission.type=").append(String.valueOf(paramInt)).append('\n');
    localStringBuilder.append("#permission.content:\n");
    Intent localIntent = new Intent();
    localIntent.setClassName(ab.getPackageName(), "com.tencent.mm.sandbox.monitor.ExceptionMonitorService");
    localIntent.setAction("uncatch_exception");
    localIntent.putExtra("exceptionWriteSdcard", false);
    localIntent.putExtra("exceptionPid", Process.myPid());
    localObject2 = as.gnb.B("login_weixin_username", "");
    localObject1 = localObject2;
    if (bg.nm((String)localObject2)) {
      localObject1 = as.gnb.B("login_user_name", "never_login_crash");
    }
    localIntent.putExtra("userName", (String)localObject1);
    localIntent.putExtra("tag", "permission");
    paramString = localStringBuilder.toString() + paramString;
    w.d("MicroMsg.PermissionMgr", "report type: %d, len: %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramString.length()) });
    localIntent.putExtra("exceptionMsg", Base64.encodeToString(paramString.getBytes(), 2));
    ab.getContext().startService(localIntent);
    GMTrace.o(3496506032128L, 26051);
  }
  
  private static void a(int paramInt, List<String> paramList, boolean paramBoolean)
  {
    GMTrace.i(3496371814400L, 26050);
    if (paramList.size() > 5) {}
    Context localContext;
    StringBuilder localStringBuilder;
    for (int i = 5;; i = paramList.size())
    {
      int k = R.l.cTU;
      int m = R.l.cTZ;
      int n = R.l.cTW;
      int i1 = R.l.cTT;
      int i2 = R.l.cTS;
      localContext = ab.getContext();
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(localContext.getString(((a)hiA.get(Integer.valueOf(paramInt))).hiI));
      j = 0;
      while (j < i)
      {
        localStringBuilder.append(localContext.getString(new int[] { k, m, n, i1, i2 }[j]));
        localStringBuilder.append((String)paramList.get(j));
        localStringBuilder.append('\n');
        j += 1;
      }
    }
    paramList = at.AP();
    int j = ((a)hiA.get(Integer.valueOf(paramInt))).hiG;
    if (paramBoolean) {}
    for (i = 1;; i = 0)
    {
      paramList.setInt(j, i);
      PermissionWarningDialog.i(localContext, localContext.getString(((a)hiA.get(Integer.valueOf(paramInt))).hiH), localStringBuilder.toString());
      GMTrace.o(3496371814400L, 26050);
      return;
    }
  }
  
  public static void b(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(16021301755904L, 119368);
    w.i("MicroMsg.PermissionMgr", "makeMark, setOrClear: " + paramBoolean1);
    String str;
    if (paramBoolean1)
    {
      i = 1;
      at.AP().setInt(((a)hiA.get(Integer.valueOf(paramInt))).hiE, i);
      if (true == paramBoolean1) {
        a.Ph().Pi();
      }
      if ((!paramBoolean1) && (true == paramBoolean2))
      {
        long l = at.AP().getLong(((a)hiA.get(Integer.valueOf(paramInt))).hiF, 0L);
        if ((0L != l) && (System.currentTimeMillis() - l >= 86400000L))
        {
          i = at.AP().Ar(((a)hiA.get(Integer.valueOf(paramInt))).hiG);
          str = "LastTick: " + l + ", CurrentTtick: " + System.currentTimeMillis() + "\n";
          if (i != 1) {
            break label246;
          }
        }
      }
    }
    label246:
    for (int i = 6;; i = 5)
    {
      R(str, i);
      at.AP().setLong(((a)hiA.get(Integer.valueOf(paramInt))).hiF, 0L);
      GMTrace.o(16021301755904L, 119368);
      return;
      i = 0;
      break;
    }
  }
  
  public static void bO(boolean paramBoolean)
  {
    GMTrace.i(3495969161216L, 26047);
    if (paramBoolean) {}
    for (int i = 4;; i = 3)
    {
      R("App_List:\n", i);
      GMTrace.o(3495969161216L, 26047);
      return;
    }
  }
  
  private static void c(List<String> paramList, boolean paramBoolean)
  {
    GMTrace.i(3496237596672L, 26049);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Match_Tips:\n");
    int i = 0;
    while (i < paramList.size())
    {
      localStringBuilder.append((String)paramList.get(i));
      localStringBuilder.append("\n");
      i += 1;
    }
    paramList = localStringBuilder.toString();
    if (paramBoolean) {}
    for (i = 2;; i = 1)
    {
      R(paramList, i);
      GMTrace.o(3496237596672L, 26049);
      return;
    }
  }
  
  public static void g(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(3496103378944L, 26048);
    StringBuilder localStringBuilder = new StringBuilder();
    PackageManager localPackageManager = ab.getContext().getPackageManager();
    Object localObject = com.tencent.mm.compatible.e.a.aO(paramBoolean1);
    if (localObject != null)
    {
      localStringBuilder.append("App_List:\n");
      Iterator localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext())
      {
        PackageInfo localPackageInfo = (PackageInfo)localIterator.next();
        if (localPackageInfo != null)
        {
          String str = "";
          localObject = str;
          if (localPackageInfo.applicationInfo != null)
          {
            localObject = str;
            if (localPackageManager != null) {
              localObject = localPackageInfo.applicationInfo.loadLabel(localPackageManager).toString();
            }
          }
          localStringBuilder.append((String)localObject + ":" + localPackageInfo.packageName + ":" + localPackageInfo.versionCode + "\n");
        }
      }
    }
    localObject = localStringBuilder.toString();
    if (paramBoolean2) {}
    for (int i = 4;; i = 3)
    {
      R((String)localObject, i);
      GMTrace.o(3496103378944L, 26048);
      return;
    }
  }
  
  public static boolean hz(int paramInt)
  {
    GMTrace.i(16021435973632L, 119369);
    paramInt = at.AP().Ar(((a)hiA.get(Integer.valueOf(paramInt))).hiE);
    w.i("MicroMsg.PermissionMgr", "current mark status: " + paramInt);
    if (paramInt == 0)
    {
      GMTrace.o(16021435973632L, 119369);
      return true;
    }
    GMTrace.o(16021435973632L, 119369);
    return false;
  }
  
  private static int na(String paramString)
  {
    int i = 0;
    GMTrace.i(3495834943488L, 26046);
    try
    {
      int j = bg.getInt(g.ut().getValue(paramString), 0);
      i = j;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.PermissionMgr", "getIntValFromDynamicConfig parseInt failed, val: " + paramString);
      }
    }
    GMTrace.o(3495834943488L, 26046);
    return i;
  }
  
  public static boolean p(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(16021570191360L, 119370);
    g.a locala = new g.a();
    int i;
    int j;
    if (at.AU())
    {
      i = na("ShowPermissionDialog");
      j = na("OnlyScanRunningService");
    }
    for (int k = na("Interval4ShowPmsDialog");; k = 3600000)
    {
      w.i("MicroMsg.PermissionMgr", "showDlg: %d, filter: %d, interval: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
      long l1 = 0L;
      Object localObject1 = hiA.values().iterator();
      Object localObject2;
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (a)((Iterator)localObject1).next();
        long l2 = at.AP().getLong(((a)localObject2).hiF, 0L);
        if (l1 < l2) {
          l1 = l2;
        }
      }
      boolean bool1;
      if ((1 == i) && (System.currentTimeMillis() - l1 >= k))
      {
        bool1 = true;
        if (!bool1) {
          break label873;
        }
        if (1 != j) {
          break label396;
        }
      }
      Object localObject3;
      ArrayList localArrayList;
      PInt localPInt;
      PBool localPBool;
      Object localObject4;
      label396:
      for (boolean bool2 = true;; bool2 = false)
      {
        localObject2 = new ArrayList();
        localObject3 = new ArrayList();
        localArrayList = new ArrayList();
        com.tencent.mm.compatible.e.a.a(com.tencent.mm.compatible.util.e.ghv + "permissioncfg.cfg", (List)localObject3, localArrayList);
        localObject1 = null;
        localPInt = new PInt(0);
        localPBool = new PBool();
        localObject3 = ((List)localObject3).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject4 = (a.b)((Iterator)localObject3).next();
          localPInt.value = 0;
          localPBool.value = true;
          if ((com.tencent.mm.compatible.e.a.a(Build.MANUFACTURER, ((a.b)localObject4).fRJ, localPInt, localPBool)) && (com.tencent.mm.compatible.e.a.a(Build.MODEL, ((a.b)localObject4).model, localPInt, localPBool))) {
            com.tencent.mm.compatible.e.a.a(Build.VERSION.RELEASE, ((a.b)localObject4).version, localPInt, localPBool);
          }
          if ((!localPBool.value) || (localPInt.value <= 0)) {
            break label870;
          }
          localObject1 = (String)((a.b)localObject4).fRI.get(paramInt);
        }
        bool1 = false;
        break;
      }
      if (localObject1 != null) {
        ((List)localObject2).add(localObject1);
      }
      localObject1 = com.tencent.mm.compatible.e.a.aO(bool2);
      if (localObject1 != null)
      {
        localObject3 = ((List)localObject1).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject4 = (PackageInfo)((Iterator)localObject3).next();
          localObject1 = null;
          Iterator localIterator = localArrayList.iterator();
          if (localIterator.hasNext())
          {
            a.a locala1 = (a.a)localIterator.next();
            localPInt.value = 0;
            localPBool.value = true;
            if (com.tencent.mm.compatible.e.a.a(((PackageInfo)localObject4).packageName, locala1.esM, localPInt, localPBool))
            {
              if ((locala1.fRF != 0) || (locala1.fRG != 0)) {
                break label581;
              }
              localPBool.value = true;
            }
            for (;;)
            {
              if ((!localPBool.value) || (localPInt.value <= 0)) {
                break label867;
              }
              localObject1 = (String)locala1.fRI.get(paramInt);
              label578:
              break;
              label581:
              if ((locala1.fRF <= ((PackageInfo)localObject4).versionCode) && (locala1.fRG >= ((PackageInfo)localObject4).versionCode))
              {
                localPInt.value += 1;
                localPBool.value = true;
              }
              else
              {
                localPBool.value = false;
              }
            }
          }
          if (localObject1 != null) {
            ((List)localObject2).add(localObject1);
          }
        }
      }
      w.i("MicroMsg.PermissionMgr", "len of tips list: " + Integer.valueOf(((List)localObject2).size()));
      if (((List)localObject2).size() != 0)
      {
        a(paramInt, (List)localObject2, paramBoolean);
        c((List)localObject2, paramBoolean);
        paramBoolean = true;
        at.AP().setLong(((a)hiA.get(Integer.valueOf(paramInt))).hiF, System.currentTimeMillis());
      }
      for (;;)
      {
        w.i("MicroMsg.PermissionMgr", "showPermissionDialog cost: " + locala.tD() + ", needShowDlg: " + bool1);
        GMTrace.o(16021570191360L, 119370);
        return paramBoolean;
        l1 = at.AP().getLong(42, 0L);
        if (System.currentTimeMillis() - l1 < 2592000000L) {
          bO(paramBoolean);
        }
        while (1 != paramInt)
        {
          paramBoolean = false;
          break;
        }
        at.AP().setLong(42, System.currentTimeMillis());
        localObject1 = ab.getContext();
        if (1 == j) {}
        for (bool2 = true;; bool2 = false)
        {
          PermissionWarningDialog.a((Context)localObject1, bool2, paramBoolean);
          break;
        }
        label867:
        break label578;
        label870:
        break;
        label873:
        paramBoolean = false;
      }
      i = 1;
      j = 1;
    }
  }
  
  private static final class a
  {
    public int hiE;
    public int hiF;
    public int hiG;
    public int hiH;
    public int hiI;
    
    public a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
    {
      GMTrace.i(3492882153472L, 26024);
      this.hiE = paramInt1;
      this.hiF = paramInt2;
      this.hiG = paramInt3;
      this.hiH = paramInt4;
      this.hiI = paramInt5;
      GMTrace.o(3492882153472L, 26024);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\permission\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */