package com.tencent.smtt.utils;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class s
{
  public b xZj = null;
  public b xZk = null;
  
  public static boolean a(b paramb1, b paramb2)
  {
    if ((paramb1 != null) && (paramb1.hJr != null) && (paramb2 != null) && (paramb2.hJr != null))
    {
      Object localObject1 = paramb1.hJr;
      paramb1 = paramb2.hJr;
      paramb2 = ((Map)localObject1).entrySet().iterator();
      while (paramb2.hasNext())
      {
        Object localObject2 = (Map.Entry)paramb2.next();
        localObject1 = (String)((Map.Entry)localObject2).getKey();
        localObject2 = (a)((Map.Entry)localObject2).getValue();
        if (paramb1.containsKey(localObject1))
        {
          localObject1 = (a)paramb1.get(localObject1);
          if ((((a)localObject2).kfq != ((a)localObject1).kfq) || (((a)localObject2).xZl != ((a)localObject1).xZl)) {
            return false;
          }
        }
        else
        {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  final class a
  {
    long kfq;
    private String mName;
    long xZl;
    
    a(String paramString, long paramLong1, long paramLong2)
    {
      this.mName = paramString;
      this.kfq = paramLong1;
      this.xZl = paramLong2;
    }
  }
  
  public final class b
  {
    public Map<String, s.a> hJr = new HashMap();
    
    public b(File paramFile)
    {
      this.hJr.clear();
      R(paramFile);
    }
    
    private void R(File paramFile)
    {
      if (paramFile.isDirectory())
      {
        paramFile = paramFile.listFiles();
        int i = 0;
        while (i < paramFile.length)
        {
          R(paramFile[i]);
          i += 1;
        }
      }
      if (paramFile.isFile())
      {
        String str = paramFile.getName();
        long l1 = paramFile.length();
        long l2 = paramFile.lastModified();
        if ((str != null) && (str.length() > 0) && (l1 > 0L) && (l2 > 0L))
        {
          paramFile = new s.a(s.this, str, l1, l2);
          if (!this.hJr.containsKey(str)) {
            this.hJr.put(str, paramFile);
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\utils\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */