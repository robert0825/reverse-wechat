package com.tencent.mm.storage.emotion;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.f;
import com.tencent.mm.bu.f.a;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends i<b>
  implements f.a
{
  public static final String[] fTX;
  public e fTZ;
  public SharedPreferences mSharedPreferences;
  
  static
  {
    GMTrace.i(1540551081984L, 11478);
    fTX = new String[] { i.a(b.fTp, "EmojiInfoDesc") };
    GMTrace.o(1540551081984L, 11478);
  }
  
  public c(e parame)
  {
    this(parame, b.fTp, "EmojiInfoDesc");
    GMTrace.i(1539611557888L, 11471);
    GMTrace.o(1539611557888L, 11471);
  }
  
  private c(e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
    GMTrace.i(1539745775616L, 11472);
    this.fTZ = parame;
    this.mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(ab.getContext());
    GMTrace.o(1539745775616L, 11472);
  }
  
  public final boolean UH(String paramString)
  {
    bool2 = true;
    bool3 = false;
    boolean bool4 = false;
    GMTrace.i(1540014211072L, 11474);
    String str2 = String.format("select %s from %s where %s=?", new Object[] { "click_flag", "EmojiInfoDesc", "groupId" });
    localObject = null;
    str1 = null;
    for (;;)
    {
      try
      {
        paramString = this.fTZ.a(str2, new String[] { paramString }, 2);
        bool1 = bool4;
        if (paramString != null)
        {
          bool1 = bool4;
          str1 = paramString;
          localObject = paramString;
          if (paramString.moveToFirst())
          {
            str1 = paramString;
            localObject = paramString;
            int i = paramString.getInt(paramString.getColumnIndex("click_flag"));
            if ((i & 0x1) != 1) {
              continue;
            }
            bool1 = bool2;
          }
        }
        bool2 = bool1;
        if (paramString != null)
        {
          paramString.close();
          bool2 = bool1;
        }
      }
      catch (Exception paramString)
      {
        boolean bool1;
        localObject = str1;
        w.w("MicroMsg.emoji.EmojiInfoDescStorage", "[isPurChase] Exception:%s", new Object[] { paramString.toString() });
        bool2 = bool3;
        if (str1 == null) {
          continue;
        }
        str1.close();
        bool2 = bool3;
        continue;
      }
      finally
      {
        if (localObject == null) {
          continue;
        }
        ((Cursor)localObject).close();
      }
      GMTrace.o(1540014211072L, 11474);
      return bool2;
      bool1 = false;
    }
  }
  
  public final boolean UI(String paramString)
  {
    bool2 = true;
    bool3 = false;
    boolean bool4 = false;
    GMTrace.i(1540148428800L, 11475);
    String str2 = String.format("select %s from %s where %s=?", new Object[] { "download_flag", "EmojiInfoDesc", "groupId" });
    localObject = null;
    str1 = null;
    for (;;)
    {
      try
      {
        paramString = this.fTZ.a(str2, new String[] { paramString }, 2);
        bool1 = bool4;
        if (paramString != null)
        {
          bool1 = bool4;
          str1 = paramString;
          localObject = paramString;
          if (paramString.moveToFirst())
          {
            str1 = paramString;
            localObject = paramString;
            int i = paramString.getInt(paramString.getColumnIndex("download_flag"));
            if ((i & 0x1) != 1) {
              continue;
            }
            bool1 = bool2;
          }
        }
        bool2 = bool1;
        if (paramString != null)
        {
          paramString.close();
          bool2 = bool1;
        }
      }
      catch (Exception paramString)
      {
        boolean bool1;
        localObject = str1;
        w.w("MicroMsg.emoji.EmojiInfoDescStorage", "[isPurChase] Exception:%s", new Object[] { paramString.toString() });
        bool2 = bool3;
        if (str1 == null) {
          continue;
        }
        str1.close();
        bool2 = bool3;
        continue;
      }
      finally
      {
        if (localObject == null) {
          continue;
        }
        ((Cursor)localObject).close();
      }
      GMTrace.o(1540148428800L, 11475);
      return bool2;
      bool1 = false;
    }
  }
  
  public final boolean UJ(String paramString)
  {
    bool4 = false;
    boolean bool3 = false;
    GMTrace.i(1540282646528L, 11476);
    bool2 = bool4;
    String str2;
    if (!TextUtils.isEmpty(paramString))
    {
      str2 = String.format("select %s from %s where %s=?", new Object[] { "desc", "EmojiInfoDesc", "groupId" });
      localObject = null;
      str1 = null;
    }
    try
    {
      paramString = this.fTZ.a(str2, new String[] { paramString }, 2);
      boolean bool1 = bool3;
      if (paramString != null)
      {
        str1 = paramString;
        localObject = paramString;
        bool2 = paramString.moveToFirst();
        bool1 = bool3;
        if (bool2) {
          bool1 = true;
        }
      }
      bool2 = bool1;
      if (paramString != null)
      {
        paramString.close();
        bool2 = bool1;
      }
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        localObject = str1;
        w.w("MicroMsg.emoji.EmojiInfoDescStorage", paramString.toString());
        bool2 = bool4;
        if (str1 != null)
        {
          str1.close();
          bool2 = bool4;
        }
      }
    }
    finally
    {
      if (localObject == null) {
        break label180;
      }
      ((Cursor)localObject).close();
    }
    GMTrace.o(1540282646528L, 11476);
    return bool2;
  }
  
  public final int a(f paramf)
  {
    GMTrace.i(1539879993344L, 11473);
    if (paramf != null) {
      this.fTZ = paramf;
    }
    GMTrace.o(1539879993344L, 11473);
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\emotion\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */