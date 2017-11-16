package com.tencent.mm.pluginsdk;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.k.a.a;
import com.tencent.mm.plugin.k.a.b;
import java.util.HashMap;

public final class c
{
  private static HashMap<String, Integer> tlM;
  
  static
  {
    GMTrace.i(893353197568L, 6656);
    tlM = null;
    GMTrace.o(893353197568L, 6656);
  }
  
  public static int NV(String paramString)
  {
    GMTrace.i(893084762112L, 6654);
    if (tlM == null)
    {
      HashMap localHashMap = new HashMap();
      tlM = localHashMap;
      localHashMap.put("avi", Integer.valueOf(a.b.cJo));
      tlM.put("m4v", Integer.valueOf(a.b.cJo));
      tlM.put("vob", Integer.valueOf(a.b.cJo));
      tlM.put("mpeg", Integer.valueOf(a.b.cJo));
      tlM.put("mpe", Integer.valueOf(a.b.cJo));
      tlM.put("asx", Integer.valueOf(a.b.cJo));
      tlM.put("asf", Integer.valueOf(a.b.cJo));
      tlM.put("f4v", Integer.valueOf(a.b.cJo));
      tlM.put("flv", Integer.valueOf(a.b.cJo));
      tlM.put("mkv", Integer.valueOf(a.b.cJo));
      tlM.put("wmv", Integer.valueOf(a.b.cJo));
      tlM.put("wm", Integer.valueOf(a.b.cJo));
      tlM.put("3gp", Integer.valueOf(a.b.cJo));
      tlM.put("mp4", Integer.valueOf(a.b.cJo));
      tlM.put("rmvb", Integer.valueOf(a.b.cJo));
      tlM.put("rm", Integer.valueOf(a.b.cJo));
      tlM.put("ra", Integer.valueOf(a.b.cJo));
      tlM.put("ram", Integer.valueOf(a.b.cJo));
      tlM.put("mp3pro", Integer.valueOf(a.b.cJd));
      tlM.put("vqf", Integer.valueOf(a.b.cJd));
      tlM.put("cd", Integer.valueOf(a.b.cJd));
      tlM.put("md", Integer.valueOf(a.b.cJd));
      tlM.put("mod", Integer.valueOf(a.b.cJd));
      tlM.put("vorbis", Integer.valueOf(a.b.cJd));
      tlM.put("au", Integer.valueOf(a.b.cJd));
      tlM.put("amr", Integer.valueOf(a.b.cJd));
      tlM.put("silk", Integer.valueOf(a.b.cJd));
      tlM.put("wma", Integer.valueOf(a.b.cJd));
      tlM.put("mmf", Integer.valueOf(a.b.cJd));
      tlM.put("mid", Integer.valueOf(a.b.cJd));
      tlM.put("midi", Integer.valueOf(a.b.cJd));
      tlM.put("mp3", Integer.valueOf(a.b.cJd));
      tlM.put("aac", Integer.valueOf(a.b.cJd));
      tlM.put("ape", Integer.valueOf(a.b.cJd));
      tlM.put("aiff", Integer.valueOf(a.b.cJd));
      tlM.put("aif", Integer.valueOf(a.b.cJd));
      tlM.put("jfif", Integer.valueOf(a.a.aTK));
      tlM.put("tiff", Integer.valueOf(a.a.aTK));
      tlM.put("tif", Integer.valueOf(a.a.aTK));
      tlM.put("jpe", Integer.valueOf(a.a.aTK));
      tlM.put("dib", Integer.valueOf(a.a.aTK));
      tlM.put("jpeg", Integer.valueOf(a.a.aTK));
      tlM.put("jpg", Integer.valueOf(a.a.aTK));
      tlM.put("png", Integer.valueOf(a.a.aTK));
      tlM.put("bmp", Integer.valueOf(a.a.aTK));
      tlM.put("gif", Integer.valueOf(a.a.aTK));
      tlM.put("rar", Integer.valueOf(a.b.cJj));
      tlM.put("zip", Integer.valueOf(a.b.cJj));
      tlM.put("7z", Integer.valueOf(a.b.cJj));
      tlM.put("iso", Integer.valueOf(a.b.cJj));
      tlM.put("cab", Integer.valueOf(a.b.cJj));
      tlM.put("doc", Integer.valueOf(a.b.cJs));
      tlM.put("docx", Integer.valueOf(a.b.cJs));
      tlM.put("ppt", Integer.valueOf(a.b.cJh));
      tlM.put("pptx", Integer.valueOf(a.b.cJh));
      tlM.put("xls", Integer.valueOf(a.b.cIZ));
      tlM.put("xlsx", Integer.valueOf(a.b.cIZ));
      tlM.put("txt", Integer.valueOf(a.b.cJk));
      tlM.put("rtf", Integer.valueOf(a.b.cJk));
      tlM.put("pdf", Integer.valueOf(a.b.cJf));
    }
    paramString = (Integer)tlM.get(paramString);
    if (paramString == null)
    {
      i = a.b.cJl;
      GMTrace.o(893084762112L, 6654);
      return i;
    }
    int i = paramString.intValue();
    GMTrace.o(893084762112L, 6654);
    return i;
  }
  
  public static int bIP()
  {
    GMTrace.i(15683207299072L, 116849);
    int i = a.b.cJl;
    GMTrace.o(15683207299072L, 116849);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */