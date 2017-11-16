package com.tencent.mm.c;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class i
{
  public String erk;
  private Map<String, a> erl;
  public int versionCode;
  
  public i(String paramString, int paramInt)
  {
    GMTrace.i(14020652302336L, 104462);
    this.erl = new HashMap();
    if (paramString == null) {}
    for (this.erk = "http://dldir1.qq.com/weixin/android/";; this.erk = paramString)
    {
      this.versionCode = paramInt;
      GMTrace.o(14020652302336L, 104462);
      return;
    }
  }
  
  public static i bt(String paramString)
  {
    GMTrace.i(14020920737792L, 104464);
    Map localMap = f.q(paramString, "patchupdate");
    if (localMap == null)
    {
      GMTrace.o(14020920737792L, 104464);
      return null;
    }
    i locali = new i((String)localMap.get(".patchupdate.$base"), j.bu((String)localMap.get(".patchupdate.$versioncode")));
    int k = j.bu((String)localMap.get(".patchupdate.$count"));
    int i = 0;
    if (i >= k)
    {
      GMTrace.o(14020920737792L, 104464);
      return locali;
    }
    StringBuilder localStringBuilder = new StringBuilder(".patchupdate.item");
    if (i > 0)
    {
      paramString = Integer.valueOf(i);
      label121:
      paramString = paramString;
      paramString = new a((String)localMap.get(paramString + ".$old"), (String)localMap.get(paramString + ".$new"), (String)localMap.get(paramString + ".$patch"), (String)localMap.get(paramString + ".$url"), j.bu((String)localMap.get(paramString + ".$size")));
      if ((paramString.erm == null) || (paramString.ern == null) || (paramString.ero == null) || (paramString.url == null)) {
        break label350;
      }
    }
    label350:
    for (int j = 1;; j = 0)
    {
      if (j != 0) {
        locali.erl.put(paramString.erm, paramString);
      }
      i += 1;
      break;
      paramString = "";
      break label121;
    }
  }
  
  public final void a(a parama)
  {
    GMTrace.i(18999056269312L, 141554);
    this.erl.put(parama.erm, parama);
    GMTrace.o(18999056269312L, 141554);
  }
  
  public final a bs(String paramString)
  {
    GMTrace.i(14020786520064L, 104463);
    paramString = (a)this.erl.get(paramString);
    GMTrace.o(14020786520064L, 104463);
    return paramString;
  }
  
  public final String oP()
  {
    GMTrace.i(18999190487040L, 141555);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(String.format("<patchupdate base=\"%s\" count=\"%d\" versioncode=\"%d\">", new Object[] { this.erk, Integer.valueOf(this.erl.size()), Integer.valueOf(this.versionCode) }));
    Iterator localIterator = this.erl.entrySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        ((StringBuilder)localObject).append("</patchupdate>");
        localObject = ((StringBuilder)localObject).toString();
        GMTrace.o(18999190487040L, 141555);
        return (String)localObject;
      }
      a locala = (a)((Map.Entry)localIterator.next()).getValue();
      ((StringBuilder)localObject).append(String.format("<item old=\"%s\" new=\"%s\" patch=\"%s\" url=\"%s\" size=\"%s\"></item>", new Object[] { locala.erm, locala.ern, locala.ero, locala.url, Integer.valueOf(locala.size) }));
    }
  }
  
  public static final class a
  {
    String erm;
    public String ern;
    public String ero;
    public int size;
    public String url;
    
    public a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
    {
      GMTrace.i(14020518084608L, 104461);
      this.erm = paramString1;
      this.ern = paramString2;
      this.ero = paramString3;
      this.size = paramInt;
      this.url = paramString4;
      GMTrace.o(14020518084608L, 104461);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\c\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */