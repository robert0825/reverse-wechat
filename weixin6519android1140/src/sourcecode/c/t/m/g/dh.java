package c.t.m.g;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.eclipse.jdt.annotation.Nullable;
import org.json.JSONObject;

public final class dh
{
  public static int a = 0;
  private final dj b;
  private final df c;
  private final dg d;
  private final List<de> e;
  
  public dh(dj paramdj, df paramdf, dg paramdg, List<de> paramList)
  {
    this.b = paramdj;
    this.c = paramdf;
    this.d = paramdg;
    this.e = paramList;
  }
  
  private String b(int paramInt, String paramString, cj paramcj, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramcj == null) {
      return null;
    }
    for (;;)
    {
      try
      {
        Object localObject1;
        String str2;
        String str1;
        String str3;
        ck localck;
        if (this.c == null)
        {
          bool = true;
          localObject1 = b.a.a(this.b);
          str2 = b.a.a(this.c, bool);
          str1 = b.a.a(this.d);
          str3 = de.a(this.e);
          if (!paramBoolean2) {
            break label806;
          }
          str1 = "{}";
          localck = paramcj.h();
          if (localck == null) {
            return null;
          }
        }
        else
        {
          if (a == this.c.e) {
            break label809;
          }
          bool = true;
          a = this.c.e;
          continue;
        }
        Object localObject2 = new HashMap();
        ((HashMap)localObject2).put("imei", localck.a());
        ((HashMap)localObject2).put("imsi", localck.b());
        ((HashMap)localObject2).put("phonenum", b.a.a(localck.e));
        ((HashMap)localObject2).put("qq", b.a.a(localck.g));
        ((HashMap)localObject2).put("mac", localck.c().toLowerCase(Locale.ENGLISH));
        localck.a.b();
        String str4 = new JSONObject((Map)localObject2).toString();
        if (localck.r == null)
        {
          localObject2 = new StringBuilder(100);
          ((StringBuilder)localObject2).append(localck.a()).append("_").append(localck.b()).append("_").append(localck.c()).append("_QQGeoLocation");
          localck.r = b.a.c(((StringBuilder)localObject2).toString());
        }
        String str6 = localck.r;
        dw.a();
        int j = dw.a(paramcj.a);
        String str5 = dy.c(paramcj);
        paramcj = (cj)localObject1;
        try
        {
          if (((String)localObject1).equals("[]"))
          {
            paramcj = (cj)localObject1;
            if (!str5.equals("{}"))
            {
              paramcj = new JSONObject(str5);
              paramcj.remove("ssid");
              paramcj = "[" + paramcj.toString() + "]";
            }
          }
          localObject1 = paramcj;
        }
        catch (Throwable paramcj)
        {
          StringBuilder localStringBuilder;
          paramcj.toString();
          continue;
          paramcj = localck.s;
          continue;
          paramString = paramString + ",\"detectgps\":0";
          continue;
        }
        localObject2 = localck.j;
        paramcj = (cj)localObject2;
        if (localObject2 != null) {
          paramcj = ((String)localObject2).replace("\"", "");
        }
        localObject2 = paramcj;
        if (paramcj != null) {
          localObject2 = paramcj.replace("|", "");
        }
        localObject2 = (String)localObject2 + "_" + localck.i;
        if (paramBoolean3)
        {
          paramcj = localck.a();
          if (paramcj != null)
          {
            i = Math.abs(paramcj.hashCode()) % 1000 + 1001;
            localStringBuilder = new StringBuilder("{\"version\":\"");
            if (localck.s == null)
            {
              paramcj = "None";
              paramcj = paramcj + "\",\"address\":" + paramInt;
              paramString = paramcj + ",\"source\":" + i + ",\"access_token\":\"" + str6 + "\",\"app_name\":\"" + paramString + "\",\"app_label\":\"" + (String)localObject2 + "\",\"bearing\":1";
              paramString = paramString + ",\"control\":0";
              if (!paramBoolean1) {
                continue;
              }
              paramString = paramString + ",\"detectgps\":1";
              paramString = paramString + ",\"pstat\":" + j;
              paramString = paramString + ",\"wlan\":" + str5;
              return paramString + ",\"attribute\":" + str4 + ",\"location\":" + str1 + ",\"cells\":" + str2 + ",\"wifis\":" + (String)localObject1 + ",\"bles\":" + str3 + "}";
            }
          }
        }
        int i = 203;
      }
      catch (Exception paramString)
      {
        return null;
      }
      continue;
      label806:
      continue;
      label809:
      boolean bool = false;
    }
  }
  
  @Nullable
  public final dg a()
  {
    return this.d;
  }
  
  public final String a(int paramInt, String paramString, cj paramcj, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    return b(paramInt, paramString, paramcj, paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  public final boolean b()
  {
    return this.d != null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\dh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */