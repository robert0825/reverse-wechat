package com.tencent.mm.wallet_core;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.u;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  private static Map<String, Class<?>> xCV;
  private static SparseArray<b> xCW;
  
  static
  {
    GMTrace.i(1527666180096L, 11382);
    xCV = new HashMap();
    xCW = new SparseArray();
    GMTrace.o(1527666180096L, 11382);
  }
  
  public static void a(Activity paramActivity, Class<?> paramClass, Bundle paramBundle)
  {
    GMTrace.i(1526055567360L, 11370);
    a(paramActivity, paramClass, paramBundle, null);
    GMTrace.o(1526055567360L, 11370);
  }
  
  public static void a(Activity paramActivity, Class<?> paramClass, Bundle paramBundle, b.a parama)
  {
    GMTrace.i(1526189785088L, 11371);
    w.i("MicroMsg.ProcessManager", "startProcess to1 context:%s proc name: %s bundle %s", new Object[] { paramActivity, paramClass.getSimpleName(), am(paramBundle) });
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {}
    try
    {
      localBundle = new Bundle();
      if (localBundle.getLong("key_SessionId", 0L) == 0L) {
        localBundle.putLong("key_SessionId", System.currentTimeMillis());
      }
      paramBundle = (b)paramClass.newInstance();
      paramBundle.an(localBundle);
      paramBundle.a(parama);
      paramBundle.a(paramActivity, localBundle);
      xCW.put(paramClass.hashCode(), paramBundle);
      GMTrace.o(1526189785088L, 11371);
      return;
    }
    catch (Exception paramActivity)
    {
      w.printErrStackTrace("MicroMsg.ProcessManager", paramActivity, "", new Object[0]);
      GMTrace.o(1526189785088L, 11371);
    }
  }
  
  public static void a(Activity paramActivity, String paramString, Bundle paramBundle, b.a parama)
  {
    GMTrace.i(1526458220544L, 11373);
    try
    {
      w.i("MicroMsg.ProcessManager", "startProcess to2 context:%s proc name: %s bundle %s", new Object[] { paramActivity, paramString, am(paramBundle) });
      Class localClass = (Class)xCV.get(paramString);
      if (localClass == null)
      {
        paramString = String.format("start process=%s fail, process not register or plugin no import", new Object[] { paramString });
        w.e("MicroMsg.ProcessManager", paramString);
        u.makeText(paramActivity, paramString, 1).show();
        GMTrace.o(1526458220544L, 11373);
        return;
      }
      a(paramActivity, localClass, paramBundle, parama);
      GMTrace.o(1526458220544L, 11373);
      return;
    }
    catch (Exception paramActivity)
    {
      w.e("MicroMsg.ProcessManager", "plugin load failed : " + paramActivity.toString());
      w.printErrStackTrace("MicroMsg.ProcessManager", paramActivity, "", new Object[0]);
      GMTrace.o(1526458220544L, 11373);
    }
  }
  
  public static void aa(Activity paramActivity)
  {
    GMTrace.i(1526726656000L, 11375);
    b localb = ad(paramActivity);
    if (localb == null) {}
    for (String str = "";; str = localb.aAd())
    {
      w.i("MicroMsg.ProcessManager", "backProcess to1 context: %s procname %s", new Object[] { paramActivity, str });
      if (localb != null) {
        localb.c(paramActivity, 0);
      }
      GMTrace.o(1526726656000L, 11375);
      return;
    }
  }
  
  public static boolean ab(Activity paramActivity)
  {
    GMTrace.i(1527129309184L, 11378);
    if (ad(paramActivity) != null)
    {
      GMTrace.o(1527129309184L, 11378);
      return true;
    }
    GMTrace.o(1527129309184L, 11378);
    return false;
  }
  
  public static Bundle ac(Activity paramActivity)
  {
    GMTrace.i(1527263526912L, 11379);
    paramActivity = ad(paramActivity);
    if (paramActivity != null)
    {
      paramActivity = paramActivity.ler;
      GMTrace.o(1527263526912L, 11379);
      return paramActivity;
    }
    paramActivity = new Bundle();
    GMTrace.o(1527263526912L, 11379);
    return paramActivity;
  }
  
  public static b ad(Activity paramActivity)
  {
    GMTrace.i(1527531962368L, 11381);
    if (paramActivity == null)
    {
      w.w("MicroMsg.ProcessManager", "hy: ac is null");
      GMTrace.o(1527531962368L, 11381);
      return null;
    }
    if (paramActivity.getIntent() == null)
    {
      w.w("MicroMsg.ProcessManager", "hy: get intent is null");
      GMTrace.o(1527531962368L, 11381);
      return null;
    }
    paramActivity = (b)xCW.get(paramActivity.getIntent().getIntExtra("process_id", 0));
    GMTrace.o(1527531962368L, 11381);
    return paramActivity;
  }
  
  private static String am(Bundle paramBundle)
  {
    GMTrace.i(1525787131904L, 11368);
    if (paramBundle == null)
    {
      GMTrace.o(1525787131904L, 11368);
      return "";
    }
    paramBundle = paramBundle.toString();
    GMTrace.o(1525787131904L, 11368);
    return paramBundle;
  }
  
  public static void b(Activity paramActivity, String paramString, Bundle paramBundle)
  {
    GMTrace.i(1526324002816L, 11372);
    a(paramActivity, paramString, paramBundle, null);
    GMTrace.o(1526324002816L, 11372);
  }
  
  public static void c(Activity paramActivity, Bundle paramBundle, int paramInt)
  {
    GMTrace.i(1526995091456L, 11377);
    w.i("MicroMsg.ProcessManager", "endProcess with errCode : " + paramInt);
    if (paramActivity == null) {
      w.w("MicroMsg.ProcessManager", "hy: end context is null");
    }
    b localb = ad(paramActivity);
    String str2 = am(paramBundle);
    if (localb == null) {}
    for (String str1 = "";; str1 = localb.aAd())
    {
      w.i("MicroMsg.ProcessManager", "endProcess to1 context: %s bundle: %s procName %s", new Object[] { paramActivity, str2, str1 });
      if (localb == null) {
        break;
      }
      localb.b(paramActivity, paramBundle);
      GMTrace.o(1526995091456L, 11377);
      return;
    }
    if (!paramActivity.isFinishing()) {
      paramActivity.finish();
    }
    GMTrace.o(1526995091456L, 11377);
  }
  
  public static void h(String paramString, Class<?> paramClass)
  {
    GMTrace.i(1525652914176L, 11367);
    if (xCV.containsKey(paramString)) {
      throw new IllegalArgumentException("register process fail, exist process=" + paramString);
    }
    xCV.put(paramString, paramClass);
    GMTrace.o(1525652914176L, 11367);
  }
  
  public static void i(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(1526592438272L, 11374);
    b localb = ad(paramActivity);
    String str2 = am(paramBundle);
    if (localb == null) {}
    for (String str1 = "";; str1 = localb.aAd())
    {
      w.i("MicroMsg.ProcessManager", "forwardProcess to1 context: %s bundle: %s procName %s", new Object[] { paramActivity, str2, str1 });
      if (localb != null) {
        localb.a(paramActivity, 0, paramBundle);
      }
      GMTrace.o(1526592438272L, 11374);
      return;
    }
  }
  
  public static boolean j(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(1527397744640L, 11380);
    paramActivity = ad(paramActivity);
    if (paramActivity != null)
    {
      paramActivity.an(paramBundle);
      GMTrace.o(1527397744640L, 11380);
      return true;
    }
    GMTrace.o(1527397744640L, 11380);
    return false;
  }
  
  public static void k(Activity paramActivity, int paramInt)
  {
    GMTrace.i(1526860873728L, 11376);
    if (paramActivity == null) {
      w.w("MicroMsg.ProcessManager", "hy: back context is null");
    }
    b localb = ad(paramActivity);
    if (localb == null) {}
    for (String str = "";; str = localb.aAd())
    {
      w.i("MicroMsg.ProcessManager", "backProcess to1 context: %s errCode %s procname %s ", new Object[] { paramActivity, Integer.valueOf(paramInt), str });
      if (localb == null) {
        break;
      }
      localb.c(paramActivity, paramInt);
      GMTrace.o(1526860873728L, 11376);
      return;
    }
    if (!paramActivity.isFinishing()) {
      paramActivity.finish();
    }
    GMTrace.o(1526860873728L, 11376);
  }
  
  public static void remove(int paramInt)
  {
    GMTrace.i(1525921349632L, 11369);
    xCW.remove(paramInt);
    GMTrace.o(1525921349632L, 11369);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */