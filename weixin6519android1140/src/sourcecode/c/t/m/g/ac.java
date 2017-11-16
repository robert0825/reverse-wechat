package c.t.m.g;

import com.tencent.beacon.event.UserAction;
import java.util.Map;

public final class ac
{
  public static String a;
  
  public static boolean a(String paramString, boolean paramBoolean, Map<String, String> paramMap)
  {
    boolean bool1 = true;
    do
    {
      try
      {
        int i = u.a("report_selfchannel_first", 0, 1, 1);
        int j = u.a("report_selfchannel_open", 0, 1, 1);
        if (j == 1) {
          if (i != 1) {}
        }
      }
      catch (Throwable paramString)
      {
        boolean bool2;
        return false;
      }
      try
      {
        ar.d().a(paramString, paramBoolean, paramMap);
        return bool1;
      }
      catch (Throwable paramString) {}
      bool2 = b(paramString, paramBoolean, paramMap);
      bool1 = bool2;
    } while (bool2);
    try
    {
      ar.d().a(paramString, paramBoolean, paramMap);
      return bool2;
    }
    catch (Throwable paramString)
    {
      return bool2;
    }
    paramBoolean = b(paramString, paramBoolean, paramMap);
    return paramBoolean;
    return true;
  }
  
  private static boolean b(String paramString, boolean paramBoolean, Map<String, String> paramMap)
  {
    try
    {
      paramBoolean = UserAction.onUserAction(paramString, paramBoolean, 0L, 0L, paramMap, true);
      return paramBoolean;
    }
    catch (Throwable paramString) {}
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */