package com.tencent.c.d.a;

import com.tencent.c.f.h;
import java.io.File;
import java.io.IOException;

public final class a
{
  public static boolean XQ(String paramString)
  {
    if (!new File(paramString).exists()) {
      return true;
    }
    try
    {
      boolean bool = com.tencent.c.d.b.a.XQ(paramString);
      if (!bool) {
        h.XW("BootScriptChecker found no-elf file : " + paramString);
      }
      return bool;
    }
    catch (IOException paramString)
    {
      h.h(paramString);
    }
    return true;
  }
  
  public static boolean XR(String paramString)
  {
    boolean bool2 = true;
    Object localObject = new File(paramString);
    boolean bool1 = bool2;
    if (((File)localObject).exists())
    {
      if (((File)localObject).length() <= 51200L) {
        break label35;
      }
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      try
      {
        label35:
        localObject = new String(com.tencent.c.d.b.a.XS(((File)localObject).getAbsolutePath()));
        bool2 = ((String)localObject).contains("applypatch ");
        h.XX("BootScriptChecker script (" + paramString + ") content : \n" + (String)localObject);
        bool1 = bool2;
        if (!bool2)
        {
          h.XW("BootScriptChecker found unofficial file : " + paramString);
          return bool2;
        }
      }
      catch (Exception paramString)
      {
        h.h(paramString);
      }
    }
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\d\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */