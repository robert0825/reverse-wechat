package com.tencent.mm.platformtools;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Debug;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.p.s;
import com.tencent.mm.pluginsdk.p.u;
import com.tencent.mm.pluginsdk.p.x;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Deprecated
public final class t
{
  private static final TimeZone GMT;
  private static final long[] hll;
  
  static
  {
    GMTrace.i(465467080704L, 3468);
    hll = new long[] { 300L, 200L, 300L, 200L };
    GMT = TimeZone.getTimeZone("GMT");
    GMTrace.o(465467080704L, 3468);
  }
  
  public static boolean E(Context paramContext, String paramString)
  {
    GMTrace.i(464527556608L, 3461);
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
    if (!j(paramContext, localIntent))
    {
      w.e("MicroMsg.Util", "jump to url failed, " + paramString);
      GMTrace.o(464527556608L, 3461);
      return false;
    }
    paramContext.startActivity(localIntent);
    GMTrace.o(464527556608L, 3461);
    return true;
  }
  
  public static long Pu()
  {
    GMTrace.i(461306331136L, 3437);
    long l = System.currentTimeMillis() / 1000L;
    GMTrace.o(461306331136L, 3437);
    return l;
  }
  
  public static long Pv()
  {
    GMTrace.i(461574766592L, 3439);
    long l = System.currentTimeMillis();
    GMTrace.o(461574766592L, 3439);
    return l;
  }
  
  public static long Pw()
  {
    GMTrace.i(462111637504L, 3443);
    long l = SystemClock.elapsedRealtime();
    GMTrace.o(462111637504L, 3443);
    return l;
  }
  
  public static void Px()
  {
    GMTrace.i(462782726144L, 3448);
    w.w("MicroMsg.Util", "memory usage: h=%s/%s, e=%s/%s, n=%s/%s", new Object[] { aF(Debug.getGlobalAllocSize()), aF(Debug.getGlobalAllocSize() + Debug.getGlobalFreedSize()), aF(Debug.getGlobalExternalAllocSize()), aF(Debug.getGlobalExternalAllocSize() + Debug.getGlobalExternalFreedSize()), aF(Debug.getNativeHeapAllocatedSize()), aF(Debug.getNativeHeapSize()) });
    GMTrace.o(462782726144L, 3448);
  }
  
  public static a Py()
  {
    GMTrace.i(464930209792L, 3464);
    a locala = new a();
    GMTrace.o(464930209792L, 3464);
    return locala;
  }
  
  public static boolean a(Context paramContext, View paramView)
  {
    GMTrace.i(465332862976L, 3467);
    if (paramView == null)
    {
      GMTrace.o(465332862976L, 3467);
      return false;
    }
    paramContext = (InputMethodManager)paramContext.getSystemService("input_method");
    if (paramContext == null)
    {
      GMTrace.o(465332862976L, 3467);
      return false;
    }
    paramView = paramView.getWindowToken();
    if (paramView == null)
    {
      GMTrace.o(465332862976L, 3467);
      return false;
    }
    try
    {
      bool = paramContext.hideSoftInputFromWindow(paramView, 0);
      GMTrace.o(465332862976L, 3467);
      return bool;
    }
    catch (IllegalArgumentException paramContext)
    {
      for (;;)
      {
        w.e("MicroMsg.Util", "hide VKB(View) exception %s", new Object[] { paramContext });
        boolean bool = false;
      }
    }
  }
  
  public static boolean a(Boolean paramBoolean)
  {
    GMTrace.i(19111128072192L, 142389);
    if (paramBoolean == null)
    {
      GMTrace.o(19111128072192L, 142389);
      return true;
    }
    boolean bool = paramBoolean.booleanValue();
    GMTrace.o(19111128072192L, 142389);
    return bool;
  }
  
  public static String aF(long paramLong)
  {
    GMTrace.i(461172113408L, 3436);
    float f;
    if (paramLong >> 20 > 0L)
    {
      f = Math.round((float)paramLong * 10.0F / 1048576.0F) / 10.0F;
      str = f + "MB";
      GMTrace.o(461172113408L, 3436);
      return str;
    }
    if (paramLong >> 9 > 0L)
    {
      f = Math.round((float)paramLong * 10.0F / 1024.0F) / 10.0F;
      str = f + "KB";
      GMTrace.o(461172113408L, 3436);
      return str;
    }
    String str = paramLong + "B";
    GMTrace.o(461172113408L, 3436);
    return str;
  }
  
  public static int aG(Object paramObject)
  {
    GMTrace.i(464124903424L, 3458);
    if (paramObject == null)
    {
      GMTrace.o(464124903424L, 3458);
      return 0;
    }
    int i;
    if ((paramObject instanceof Integer))
    {
      i = ((Integer)paramObject).intValue();
      GMTrace.o(464124903424L, 3458);
      return i;
    }
    if ((paramObject instanceof Long))
    {
      i = ((Long)paramObject).intValue();
      GMTrace.o(464124903424L, 3458);
      return i;
    }
    GMTrace.o(464124903424L, 3458);
    return 0;
  }
  
  public static long aG(long paramLong)
  {
    GMTrace.i(461708984320L, 3440);
    long l = System.currentTimeMillis() / 1000L;
    GMTrace.o(461708984320L, 3440);
    return l - paramLong;
  }
  
  public static long aH(long paramLong)
  {
    GMTrace.i(461843202048L, 3441);
    long l = System.currentTimeMillis();
    GMTrace.o(461843202048L, 3441);
    return l - paramLong;
  }
  
  public static long aI(long paramLong)
  {
    GMTrace.i(461977419776L, 3442);
    long l = SystemClock.elapsedRealtime();
    GMTrace.o(461977419776L, 3442);
    return l - paramLong;
  }
  
  public static String aq(String paramString1, String paramString2)
  {
    GMTrace.i(463990685696L, 3457);
    if (paramString1 == null)
    {
      GMTrace.o(463990685696L, 3457);
      return paramString2;
    }
    GMTrace.o(463990685696L, 3457);
    return paramString1;
  }
  
  public static List<String> ar(String paramString1, String paramString2)
  {
    GMTrace.i(465064427520L, 3465);
    String str = null;
    if (paramString1 != null)
    {
      paramString2 = Pattern.compile(paramString2).matcher(paramString1);
      int j = paramString2.groupCount();
      int i = 1;
      paramString1 = new ArrayList();
      str = paramString1;
      if (paramString2.find()) {
        for (;;)
        {
          str = paramString1;
          if (i > j) {
            break;
          }
          paramString1.add(paramString2.group(i));
          i += 1;
        }
      }
    }
    GMTrace.o(465064427520L, 3465);
    return str;
  }
  
  public static boolean b(Boolean paramBoolean)
  {
    GMTrace.i(19111262289920L, 142390);
    if (paramBoolean == null)
    {
      GMTrace.o(19111262289920L, 142390);
      return false;
    }
    boolean bool = paramBoolean.booleanValue();
    GMTrace.o(19111262289920L, 142390);
    return bool;
  }
  
  public static boolean bg(int paramInt1, int paramInt2)
  {
    GMTrace.i(464661774336L, 3462);
    if (paramInt2 > paramInt1 * 2.0D)
    {
      GMTrace.o(464661774336L, 3462);
      return true;
    }
    GMTrace.o(464661774336L, 3462);
    return false;
  }
  
  public static boolean bh(int paramInt1, int paramInt2)
  {
    GMTrace.i(464795992064L, 3463);
    if (paramInt1 > paramInt2 * 2.0D)
    {
      GMTrace.o(464795992064L, 3463);
      return true;
    }
    GMTrace.o(464795992064L, 3463);
    return false;
  }
  
  private static String bs(Context paramContext)
  {
    GMTrace.i(462380072960L, 3445);
    try
    {
      paramContext = ((ActivityManager.RunningTaskInfo)((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity.getClassName();
      w.i("MicroMsg.Util", "top activity name =" + paramContext);
      GMTrace.o(462380072960L, 3445);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      w.printErrStackTrace("MicroMsg.Util", paramContext, "", new Object[0]);
      GMTrace.o(462380072960L, 3445);
    }
    return "(null)";
  }
  
  public static boolean bx(Context paramContext)
  {
    GMTrace.i(462245855232L, 3444);
    String str = paramContext.getClass().getName();
    paramContext = bs(paramContext);
    w.d("MicroMsg.Util", "top activity=" + paramContext + ", context=" + str);
    boolean bool = paramContext.equalsIgnoreCase(str);
    GMTrace.o(462245855232L, 3444);
    return bool;
  }
  
  public static boolean by(Context paramContext)
  {
    GMTrace.i(465198645248L, 3466);
    if (p.x.bIV() != null) {
      p.x.bIV().bcj();
    }
    if ((f.eqX & 0x1) != 0)
    {
      w.e("MicroMsg.Util", "package has set external update mode");
      Uri localUri = Uri.parse(f.vhr);
      Intent localIntent = new Intent("android.intent.action.VIEW", localUri).addFlags(268435456);
      if ((localUri == null) || (localIntent == null) || (!j(paramContext, localIntent)))
      {
        w.e("MicroMsg.Util", "parse market uri failed, jump to weixin.qq.com");
        paramContext.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://weixin.qq.com")).addFlags(268435456));
      }
      for (;;)
      {
        GMTrace.o(465198645248L, 3466);
        return true;
        w.i("MicroMsg.Util", "parse market uri ok");
        paramContext.startActivity(localIntent);
      }
    }
    ab.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", System.currentTimeMillis() / 1000L).commit();
    if (p.x.bIV() != null)
    {
      paramContext = p.x.bIV().a(paramContext, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(459695718400L, 3425);
          GMTrace.o(459695718400L, 3425);
        }
      });
      if (paramContext == null)
      {
        GMTrace.o(465198645248L, 3466);
        return false;
      }
      paramContext.update(3);
    }
    GMTrace.o(465198645248L, 3466);
    return true;
  }
  
  public static long c(Long paramLong)
  {
    GMTrace.i(463051161600L, 3450);
    if (paramLong == null)
    {
      GMTrace.o(463051161600L, 3450);
      return 0L;
    }
    long l = paramLong.longValue();
    GMTrace.o(463051161600L, 3450);
    return l;
  }
  
  public static String c(List<String> paramList, String paramString)
  {
    GMTrace.i(460903677952L, 3434);
    if (paramList == null)
    {
      GMTrace.o(460903677952L, 3434);
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder("");
    int i = 0;
    if (i < paramList.size())
    {
      if (i == paramList.size() - 1) {
        localStringBuilder.append(((String)paramList.get(i)).trim());
      }
      for (;;)
      {
        i += 1;
        break;
        localStringBuilder.append(((String)paramList.get(i)).trim() + paramString);
      }
    }
    paramList = localStringBuilder.toString();
    GMTrace.o(460903677952L, 3434);
    return paramList;
  }
  
  public static boolean c(Boolean paramBoolean)
  {
    GMTrace.i(14907831484416L, 111072);
    if (paramBoolean == null)
    {
      GMTrace.o(14907831484416L, 111072);
      return true;
    }
    boolean bool = paramBoolean.booleanValue();
    GMTrace.o(14907831484416L, 111072);
    return bool;
  }
  
  public static long d(Long paramLong)
  {
    GMTrace.i(463722250240L, 3455);
    if (paramLong == null)
    {
      GMTrace.o(463722250240L, 3455);
      return 0L;
    }
    long l = paramLong.longValue();
    GMTrace.o(463722250240L, 3455);
    return l;
  }
  
  public static int e(Integer paramInteger)
  {
    GMTrace.i(462916943872L, 3449);
    if (paramInteger == null)
    {
      GMTrace.o(462916943872L, 3449);
      return 0;
    }
    int i = paramInteger.intValue();
    GMTrace.o(462916943872L, 3449);
    return i;
  }
  
  public static int f(Integer paramInteger)
  {
    GMTrace.i(463588032512L, 3454);
    if (paramInteger == null)
    {
      GMTrace.o(463588032512L, 3454);
      return 0;
    }
    int i = paramInteger.intValue();
    GMTrace.o(463588032512L, 3454);
    return i;
  }
  
  public static List<String> g(String[] paramArrayOfString)
  {
    GMTrace.i(461037895680L, 3435);
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
    {
      GMTrace.o(461037895680L, 3435);
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramArrayOfString.length)
    {
      localArrayList.add(paramArrayOfString[i]);
      i += 1;
    }
    GMTrace.o(461037895680L, 3435);
    return localArrayList;
  }
  
  @Deprecated
  public static int getInt(String paramString, int paramInt)
  {
    GMTrace.i(464393338880L, 3460);
    if (paramString != null) {}
    try
    {
      if (paramString.length() <= 0)
      {
        GMTrace.o(464393338880L, 3460);
        return paramInt;
      }
      int i = Integer.parseInt(paramString);
      GMTrace.o(464393338880L, 3460);
      return i;
    }
    catch (NumberFormatException paramString)
    {
      w.printErrStackTrace("MicroMsg.Util", paramString, "", new Object[0]);
      GMTrace.o(464393338880L, 3460);
    }
    return paramInt;
  }
  
  public static String hB(int paramInt)
  {
    GMTrace.i(461440548864L, 3438);
    String str = String.format("%d:%02d", new Object[] { Long.valueOf(paramInt / 60L), Long.valueOf(paramInt % 60L) });
    GMTrace.o(461440548864L, 3438);
    return str;
  }
  
  public static boolean hC(int paramInt)
  {
    GMTrace.i(462648508416L, 3447);
    long l1 = paramInt * 1000L;
    long l2 = l1 - System.currentTimeMillis();
    w.d("MicroMsg.Util", "time " + l1 + "  systime " + System.currentTimeMillis() + " diff " + l2);
    if (l2 < 0L)
    {
      GMTrace.o(462648508416L, 3447);
      return true;
    }
    GMTrace.o(462648508416L, 3447);
    return false;
  }
  
  private static boolean j(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(462514290688L, 3446);
    if (paramContext.getPackageManager().queryIntentActivities(paramIntent, 65536).size() > 0)
    {
      GMTrace.o(462514290688L, 3446);
      return true;
    }
    GMTrace.o(462514290688L, 3446);
    return false;
  }
  
  public static String nk(String paramString)
  {
    GMTrace.i(460769460224L, 3433);
    String str = paramString;
    if (paramString != null) {
      str = paramString.replace("\\[", "[[]").replace("%", "").replace("\\^", "").replace("'", "").replace("\\{", "").replace("\\}", "").replace("\"", "");
    }
    GMTrace.o(460769460224L, 3433);
    return str;
  }
  
  public static String nl(String paramString)
  {
    GMTrace.i(463185379328L, 3451);
    if (paramString == null)
    {
      GMTrace.o(463185379328L, 3451);
      return "";
    }
    GMTrace.o(463185379328L, 3451);
    return paramString;
  }
  
  public static boolean nm(String paramString)
  {
    GMTrace.i(464259121152L, 3459);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(464259121152L, 3459);
      return true;
    }
    GMTrace.o(464259121152L, 3459);
    return false;
  }
  
  @Deprecated
  public static long nn(String paramString)
  {
    GMTrace.i(16872913240064L, 125713);
    if (paramString == null) {}
    try
    {
      GMTrace.o(16872913240064L, 125713);
      return -1L;
    }
    catch (NumberFormatException paramString)
    {
      long l;
      w.printErrStackTrace("MicroMsg.Util", paramString, "", new Object[0]);
      GMTrace.o(16872913240064L, 125713);
    }
    l = Long.parseLong(paramString);
    GMTrace.o(16872913240064L, 125713);
    return l;
    return -1L;
  }
  
  public static final class a
  {
    public a()
    {
      GMTrace.i(457548234752L, 3409);
      GMTrace.o(457548234752L, 3409);
    }
    
    public final String toString()
    {
      GMTrace.i(457682452480L, 3410);
      Object localObject = new Throwable().getStackTrace();
      if ((localObject == null) || (localObject.length < 4))
      {
        GMTrace.o(457682452480L, 3410);
        return "";
      }
      StringBuilder localStringBuilder = new StringBuilder();
      int i = 3;
      while (i < localObject.length)
      {
        if (localObject[i].getClassName().contains("com.tencent.mm"))
        {
          localStringBuilder.append("[");
          localStringBuilder.append(localObject[i].getClassName().substring(15));
          localStringBuilder.append(":");
          localStringBuilder.append(localObject[i].getMethodName());
          localStringBuilder.append("(" + localObject[i].getLineNumber() + ")]");
        }
        i += 1;
      }
      localObject = localStringBuilder.toString();
      GMTrace.o(457682452480L, 3410);
      return (String)localObject;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\platformtools\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */