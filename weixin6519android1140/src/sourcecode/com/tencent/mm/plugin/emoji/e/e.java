package com.tencent.mm.plugin.emoji.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.jniinterface.AesEcb;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.Iterator;

public class e
{
  public static e kis;
  public boolean aDI;
  private String amf;
  
  public e()
  {
    GMTrace.i(11562588831744L, 86148);
    this.aDI = false;
    GMTrace.o(11562588831744L, 86148);
  }
  
  public static e aqw()
  {
    GMTrace.i(11562723049472L, 86149);
    if (kis == null) {}
    try
    {
      kis = new e();
      e locale = kis;
      GMTrace.o(11562723049472L, 86149);
      return locale;
    }
    finally {}
  }
  
  public final byte[] a(EmojiInfo paramEmojiInfo)
  {
    GMTrace.i(11563259920384L, 86153);
    if (paramEmojiInfo == null)
    {
      w.w("MicroMsg.emoji.EmojiFileEncryptMgr", "decodeEmojiData failed. emoji is null.");
      GMTrace.o(11563259920384L, 86153);
      return null;
    }
    String str = paramEmojiInfo.bUU();
    byte[] arrayOfByte1 = com.tencent.mm.a.e.c(str, 0, com.tencent.mm.a.e.aY(str));
    if ((com.tencent.mm.a.e.aY(str) > 0) && (arrayOfByte1 != null) && (arrayOfByte1.length >= 10))
    {
      byte[] arrayOfByte2 = new byte[10];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, 10);
      if (((paramEmojiInfo.field_reserved4 & EmojiInfo.vCJ) == EmojiInfo.vCJ) && (!o.bj(arrayOfByte2)))
      {
        long l = System.currentTimeMillis();
        int j = com.tencent.mm.a.e.aY(str);
        int i = j;
        if (j > 1024) {
          i = 1024;
        }
        arrayOfByte2 = com.tencent.mm.a.e.c(str, 0, i);
        paramEmojiInfo = null;
        if (!bg.nm(aqx())) {
          paramEmojiInfo = AesEcb.aesCryptEcb(arrayOfByte2, aqx().getBytes(), false, false);
        }
        if ((!bg.bq(paramEmojiInfo)) && (!bg.bq(arrayOfByte1)))
        {
          System.arraycopy(paramEmojiInfo, 0, arrayOfByte1, 0, i);
          l = System.currentTimeMillis() - l;
          g.ork.a(252L, 0L, l, false);
          g.ork.a(252L, 5L, 1L, false);
          w.d("MicroMsg.emoji.EmojiFileEncryptMgr", "decode emoji file length:%d use time:%d", new Object[] { Integer.valueOf(arrayOfByte1.length), Long.valueOf(l) });
          GMTrace.o(11563259920384L, 86153);
          return arrayOfByte1;
        }
        g.ork.a(252L, 2L, 1L, false);
        w.i("MicroMsg.emoji.EmojiFileEncryptMgr", "decode emoji file failed. path:%s return original ", new Object[] { str });
        GMTrace.o(11563259920384L, 86153);
        return arrayOfByte1;
      }
      GMTrace.o(11563259920384L, 86153);
      return arrayOfByte1;
    }
    w.i("MicroMsg.emoji.EmojiFileEncryptMgr", "decode emoji file failed. path is no exist :%s ", new Object[] { str });
    GMTrace.o(11563259920384L, 86153);
    return null;
  }
  
  public final String aqx()
  {
    GMTrace.i(11562857267200L, 86150);
    if (bg.nm(this.amf)) {
      this.amf = h.arl().kjy.getKey();
    }
    String str = this.amf;
    GMTrace.o(11562857267200L, 86150);
    return str;
  }
  
  public final boolean b(EmojiInfo paramEmojiInfo)
  {
    GMTrace.i(11563394138112L, 86154);
    if (paramEmojiInfo == null)
    {
      w.w("MicroMsg.emoji.EmojiFileEncryptMgr", "decodeEmojiData failed. emoji is null.");
      GMTrace.o(11563394138112L, 86154);
      return false;
    }
    long l = System.currentTimeMillis();
    Object localObject = paramEmojiInfo.bUU();
    int j = com.tencent.mm.a.e.aY((String)localObject);
    int i = j;
    if (j > 1024) {
      i = 1024;
    }
    byte[] arrayOfByte = com.tencent.mm.a.e.c((String)localObject, 0, i);
    boolean bool;
    if ((com.tencent.mm.a.e.aY((String)localObject) > 0) && (arrayOfByte != null) && (arrayOfByte.length >= 10))
    {
      localObject = new byte[10];
      System.arraycopy(arrayOfByte, 0, localObject, 0, 10);
      if (o.bj((byte[])localObject)) {
        bool = true;
      }
    }
    for (;;)
    {
      w.d("MicroMsg.emoji.EmojiFileEncryptMgr", "checkout use time:%s result:%b", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Boolean.valueOf(bool) });
      GMTrace.o(11563394138112L, 86154);
      return bool;
      if ((paramEmojiInfo.field_reserved4 & EmojiInfo.vCJ) == EmojiInfo.vCJ)
      {
        paramEmojiInfo = null;
        if (!bg.nm(aqx())) {
          paramEmojiInfo = AesEcb.aesCryptEcb(arrayOfByte, aqx().getBytes(), false, false);
        }
        if ((!bg.bq(paramEmojiInfo)) && (o.bj(paramEmojiInfo)))
        {
          bool = true;
          continue;
        }
      }
      bool = false;
    }
  }
  
  public final boolean c(EmojiInfo paramEmojiInfo, boolean paramBoolean)
  {
    GMTrace.i(11563125702656L, 86152);
    if (paramEmojiInfo == null)
    {
      w.w("MicroMsg.emoji.EmojiFileEncryptMgr", "encodeEmojiFile failed. emoji is null.");
      GMTrace.o(11563125702656L, 86152);
      return false;
    }
    if (!isEnable())
    {
      w.i("MicroMsg.emoji.EmojiFileEncryptMgr", "disable encrypt");
      GMTrace.o(11563125702656L, 86152);
      return false;
    }
    String str = paramEmojiInfo.bUU();
    byte[] arrayOfByte1;
    boolean bool1;
    if (com.tencent.mm.a.e.aZ(str))
    {
      boolean bool2 = false;
      arrayOfByte1 = com.tencent.mm.a.e.c(str, 0, 10);
      bool1 = bool2;
      if (arrayOfByte1 != null) {
        bool1 = bool2;
      }
    }
    for (;;)
    {
      try
      {
        if (arrayOfByte1.length >= 10) {
          bool1 = o.bj(arrayOfByte1);
        }
        if ((paramBoolean) || (bool1))
        {
          long l = System.currentTimeMillis();
          j = com.tencent.mm.a.e.aY(str);
          if (j > 1024)
          {
            i = 1024;
            arrayOfByte1 = com.tencent.mm.a.e.c(str, 0, j);
            byte[] arrayOfByte2 = AesEcb.aesCryptEcb(com.tencent.mm.a.e.c(str, 0, i), aqx().getBytes(), true, false);
            if ((bg.bq(arrayOfByte2)) || (bg.bq(arrayOfByte1))) {
              break label432;
            }
            System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, i);
            i = com.tencent.mm.a.e.b(str, arrayOfByte1, arrayOfByte1.length);
            if (i != 0) {
              continue;
            }
            l = System.currentTimeMillis() - l;
            g.ork.a(252L, 1L, l, false);
            g.ork.a(252L, 6L, 1L, false);
            paramEmojiInfo.field_reserved4 |= EmojiInfo.vCJ;
            paramEmojiInfo.field_size = j;
            h.arl().kjy.q(paramEmojiInfo);
            w.i("MicroMsg.emoji.EmojiFileEncryptMgr", "encode emoji file length:%d use time:%d", new Object[] { Integer.valueOf(arrayOfByte1.length), Long.valueOf(l) });
            GMTrace.o(11563125702656L, 86152);
            return true;
          }
        }
      }
      catch (Throwable localThrowable)
      {
        int j;
        w.printErrStackTrace("MicroMsg.emoji.EmojiFileEncryptMgr", localThrowable, "", new Object[0]);
        bool1 = false;
        continue;
        i = j;
        continue;
        w.w("MicroMsg.emoji.EmojiFileEncryptMgr", "encodeEmojiFile failed. write file failed.");
        g.ork.a(252L, 3L, 1L, false);
        GMTrace.o(11563125702656L, 86152);
        return false;
      }
      w.i("MicroMsg.emoji.EmojiFileEncryptMgr", "encodeEmojiFile file had encrypt.");
      GMTrace.o(11563125702656L, 86152);
      return true;
      w.w("MicroMsg.emoji.EmojiFileEncryptMgr", "encodeEmojiFile failed. file not exist. path%s", new Object[] { str });
      paramEmojiInfo.field_reserved4 = 0;
      h.arl().kjy.q(paramEmojiInfo);
      GMTrace.o(11563125702656L, 86152);
      return false;
      label432:
      int i = -1;
    }
  }
  
  public final boolean isEnable()
  {
    GMTrace.i(11562991484928L, 86151);
    if (bg.nm(aqx()))
    {
      GMTrace.o(11562991484928L, 86151);
      return false;
    }
    GMTrace.o(11562991484928L, 86151);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\e\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */