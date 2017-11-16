package com.tencent.mm.y.b;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public abstract class a
  implements e
{
  protected e.a gpM;
  protected String gpN;
  protected String[] gpO;
  
  public a()
  {
    GMTrace.i(681960275968L, 5081);
    this.gpN = Ca();
    this.gpO = BZ();
    GMTrace.o(681960275968L, 5081);
  }
  
  protected String[] BZ()
  {
    GMTrace.i(682765582336L, 5087);
    GMTrace.o(682765582336L, 5087);
    return null;
  }
  
  public abstract String Ca();
  
  public final String P(String paramString1, String paramString2)
  {
    GMTrace.i(682362929152L, 5084);
    at.AR();
    SharedPreferences localSharedPreferences = c.eN("banner");
    if (localSharedPreferences == null)
    {
      GMTrace.o(682362929152L, 5084);
      return null;
    }
    paramString1 = localSharedPreferences.getString(this.gpN + paramString2 + paramString1, null);
    GMTrace.o(682362929152L, 5084);
    return paramString1;
  }
  
  public final void a(e.a parama)
  {
    GMTrace.i(682631364608L, 5086);
    this.gpM = parama;
    GMTrace.o(682631364608L, 5086);
  }
  
  public final void a(String paramString, boolean paramBoolean, String[] paramArrayOfString)
  {
    GMTrace.i(682228711424L, 5083);
    at.AR();
    SharedPreferences localSharedPreferences = c.eN("banner");
    if (localSharedPreferences == null)
    {
      GMTrace.o(682228711424L, 5083);
      return;
    }
    localSharedPreferences.edit().putBoolean(this.gpN + paramString, paramBoolean).commit();
    if ((this.gpO != null) && (paramArrayOfString != null) && (this.gpO.length == paramArrayOfString.length))
    {
      String[] arrayOfString = this.gpO;
      int k = arrayOfString.length;
      int j = 0;
      int i = 0;
      if (i < k)
      {
        String str2 = arrayOfString[i];
        if (str2 != null) {
          if (paramArrayOfString[j] == null) {
            break label206;
          }
        }
        label206:
        for (String str1 = paramArrayOfString[j];; str1 = "")
        {
          localSharedPreferences.edit().putString(this.gpN + str2 + paramString, str1).commit();
          j += 1;
          i += 1;
          break;
        }
      }
    }
    if (this.gpM != null) {
      this.gpM.Cm();
    }
    GMTrace.o(682228711424L, 5083);
  }
  
  public final boolean hh(String paramString)
  {
    GMTrace.i(682094493696L, 5082);
    at.AR();
    SharedPreferences localSharedPreferences = c.eN("banner");
    if ((localSharedPreferences != null) && (localSharedPreferences.getBoolean(this.gpN + paramString, false)))
    {
      GMTrace.o(682094493696L, 5082);
      return true;
    }
    GMTrace.o(682094493696L, 5082);
    return false;
  }
  
  public final void hi(String paramString)
  {
    GMTrace.i(682497146880L, 5085);
    at.AR();
    SharedPreferences localSharedPreferences = c.eN("banner");
    if (localSharedPreferences == null)
    {
      GMTrace.o(682497146880L, 5085);
      return;
    }
    localSharedPreferences.edit().remove(this.gpN + paramString).commit();
    if (this.gpO != null)
    {
      String[] arrayOfString = this.gpO;
      int j = arrayOfString.length;
      int i = 0;
      while (i < j)
      {
        String str = arrayOfString[i];
        if (str != null) {
          localSharedPreferences.edit().remove(this.gpN + str + paramString).commit();
        }
        i += 1;
      }
    }
    if (this.gpM != null) {
      this.gpM.Cn();
    }
    GMTrace.o(682497146880L, 5085);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */