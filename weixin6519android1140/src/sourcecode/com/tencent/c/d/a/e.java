package com.tencent.c.d.a;

import android.text.TextUtils;
import com.tencent.c.f.h;
import java.io.File;

public final class e
{
  public static boolean cnt()
  {
    for (;;)
    {
      int i;
      try
      {
        Object localObject = System.getenv("PATH");
        if (TextUtils.isEmpty((CharSequence)localObject))
        {
          localObject = ((String)localObject).split(":");
          int j = localObject.length;
          i = 0;
          if (i < j)
          {
            File localFile = new File(localObject[i], "su");
            if (!localFile.exists()) {
              break label130;
            }
            h.XW("SuFile found : " + localFile.toString());
            return true;
          }
        }
        else
        {
          if (!new File("/system/bin/su").exists()) {
            break label108;
          }
          h.XW("SuFile found : /system/bin/su");
          return true;
        }
      }
      catch (Throwable localThrowable)
      {
        h.h(localThrowable);
        h.XW("SuFile not found");
        return false;
      }
      label108:
      if (new File("/system/xbin/su").exists())
      {
        h.XW("SuFile found : /system/xbin/su");
        return true;
        label130:
        i += 1;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\d\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */