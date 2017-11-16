package com.tencent.mm.pluginsdk;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;

public final class b
{
  public static final class a
  {
    public static final HashMap<String, Long> tlK;
    
    static
    {
      GMTrace.i(1251043442688L, 9321);
      HashMap localHashMap = new HashMap();
      tlK = localHashMap;
      localHashMap.put("doc", Long.valueOf(64L));
      tlK.put("docx", Long.valueOf(128L));
      tlK.put("ppt", Long.valueOf(256L));
      tlK.put("pptx", Long.valueOf(512L));
      tlK.put("xls", Long.valueOf(1024L));
      tlK.put("xlsx", Long.valueOf(2048L));
      tlK.put("pdf", Long.valueOf(4096L));
      tlK.put("1", Long.valueOf(1L));
      tlK.put("3", Long.valueOf(2L));
      tlK.put("48", Long.valueOf(4L));
      tlK.put("43", Long.valueOf(8L));
      tlK.put("mp3", Long.valueOf(16L));
      tlK.put("wav", Long.valueOf(16L));
      tlK.put("wma", Long.valueOf(16L));
      tlK.put("avi", Long.valueOf(8L));
      tlK.put("rmvb", Long.valueOf(8L));
      tlK.put("rm", Long.valueOf(8L));
      tlK.put("mpg", Long.valueOf(8L));
      tlK.put("mpeg", Long.valueOf(8L));
      tlK.put("wmv", Long.valueOf(8L));
      tlK.put("mp4", Long.valueOf(8L));
      tlK.put("mkv", Long.valueOf(8L));
      GMTrace.o(1251043442688L, 9321);
    }
    
    public static Long NU(String paramString)
    {
      GMTrace.i(1250909224960L, 9320);
      if (paramString == null)
      {
        GMTrace.o(1250909224960L, 9320);
        return null;
      }
      paramString = (Long)tlK.get(paramString.toLowerCase());
      GMTrace.o(1250909224960L, 9320);
      return paramString;
    }
  }
  
  public static final class b
  {
    public static final HashMap<Integer, Integer> tlL;
    
    static
    {
      GMTrace.i(1232521396224L, 9183);
      HashMap localHashMap = new HashMap();
      tlL = localHashMap;
      localHashMap.put(Integer.valueOf(22), Integer.valueOf(64));
      tlL.put(Integer.valueOf(9), Integer.valueOf(64));
      tlL.put(Integer.valueOf(3), Integer.valueOf(64));
      tlL.put(Integer.valueOf(23), Integer.valueOf(64));
      tlL.put(Integer.valueOf(25), Integer.valueOf(64));
      tlL.put(Integer.valueOf(13), Integer.valueOf(64));
      tlL.put(Integer.valueOf(29), Integer.valueOf(256));
      tlL.put(Integer.valueOf(34), Integer.valueOf(512));
      tlL.put(Integer.valueOf(6), Integer.valueOf(512));
      tlL.put(Integer.valueOf(35), Integer.valueOf(1024));
      tlL.put(Integer.valueOf(36), Integer.valueOf(4096));
      tlL.put(Integer.valueOf(37), Integer.valueOf(32768));
      tlL.put(Integer.valueOf(38), Integer.valueOf(32768));
      tlL.put(Integer.valueOf(42), Integer.valueOf(131072));
      tlL.put(Integer.valueOf(40), Integer.valueOf(65536));
      tlL.put(Integer.valueOf(41), Integer.valueOf(65536));
      tlL.put(Integer.valueOf(46), Integer.valueOf(262144));
      tlL.put(Integer.valueOf(48), Integer.valueOf(524288));
      GMTrace.o(1232521396224L, 9183);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */