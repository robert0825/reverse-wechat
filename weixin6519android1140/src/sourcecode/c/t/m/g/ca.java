package c.t.m.g;

import android.os.Handler;
import java.util.Map;

public final class ca
{
  private static Handler a = ;
  private static boolean b = true;
  private static boolean c = true;
  
  private static int a(String paramString, int paramInt)
  {
    int j = 1;
    if (paramString.equals("HLDisconnEvent")) {
      return -2;
    }
    if (paramInt != 0)
    {
      if ((paramInt == -4) || (paramInt == -3) || (paramInt == 65248))
      {
        i = 1;
        if (i == 0) {
          break label93;
        }
      }
    }
    else
    {
      paramString = "self_report_succ_rate";
      label46:
      i = j;
      if (paramInt != 0)
      {
        if ((paramInt != -4) && (paramInt != -3) && (paramInt != 65248)) {
          break label99;
        }
        paramInt = 1;
        label73:
        if (paramInt == 0) {
          break label104;
        }
      }
    }
    label93:
    label99:
    label104:
    for (int i = j;; i = 50)
    {
      return u.a(paramString, 0, 100, i);
      i = 0;
      break;
      paramString = "self_report_fail_rate";
      break label46;
      paramInt = 0;
      break label73;
    }
  }
  
  public static void a(String paramString1, int paramInt1, int paramInt2, String paramString2, Map<String, String> paramMap1, Map<String, String> paramMap2, boolean paramBoolean)
  {
    a.post(new cb(paramString1, paramInt1, paramInt2, paramString2, paramMap1, paramMap2, paramBoolean));
  }
  
  public static void b(String paramString1, int paramInt1, int paramInt2, String paramString2, Map<String, String> paramMap1, Map<String, String> paramMap2, boolean paramBoolean)
  {
    a.post(new cc(paramString1, paramInt1, paramInt2, paramString2, paramMap1, paramMap2, paramBoolean));
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */