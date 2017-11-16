package com.tencent.mm.ac;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f;
import com.tencent.mm.bu.g;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;
import junit.framework.Assert;

public final class i
  extends j
{
  public static final String[] fTX;
  g goN;
  final f<String, h> gsX;
  
  static
  {
    GMTrace.i(378762428416L, 2822);
    fTX = new String[] { "CREATE TABLE IF NOT EXISTS img_flag ( username VARCHAR(40) PRIMARY KEY , imgflag int , lastupdatetime int , reserved1 text ,reserved2 text ,reserved3 int ,reserved4 int )", "CREATE INDEX IF NOT EXISTS img_flag_small_url_index ON img_flag ( reserved2 )" };
    GMTrace.o(378762428416L, 2822);
  }
  
  public i(g paramg)
  {
    GMTrace.i(378091339776L, 2817);
    this.gsX = new f(800);
    this.goN = paramg;
    GMTrace.o(378091339776L, 2817);
  }
  
  public final boolean A(List<h> paramList)
  {
    GMTrace.i(378493992960L, 2820);
    if (paramList.size() == 0)
    {
      GMTrace.o(378493992960L, 2820);
      return false;
    }
    long l = this.goN.cE(Thread.currentThread().getId());
    int i = 0;
    try
    {
      while (i < paramList.size())
      {
        a((h)paramList.get(i));
        i += 1;
      }
      bool = true;
    }
    catch (Exception paramList)
    {
      for (;;)
      {
        w.e("MicroMsg.ImgFlagStorage", paramList.getMessage());
        boolean bool = false;
      }
    }
    this.goN.aL(l);
    GMTrace.o(378493992960L, 2820);
    return bool;
  }
  
  public final boolean a(h paramh)
  {
    GMTrace.i(378359775232L, 2819);
    w.i("MicroMsg.ImgFlagStorage", "new smallImageUrl = %s, bigImageUrl = %s", new Object[] { paramh.Dp(), paramh.Do() });
    Object localObject = ig(paramh.getUsername());
    if (localObject == null)
    {
      this.gsX.m(paramh.getUsername(), paramh);
      if ((paramh != null) && (paramh.getUsername() != null))
      {
        bool = true;
        Assert.assertTrue(bool);
        paramh.gsS = ((int)(System.currentTimeMillis() / 1000L));
        paramh.Dq();
        paramh.eQl = -1;
        localObject = paramh.Dn();
        if ((int)this.goN.insert("img_flag", "username", (ContentValues)localObject) < 0) {
          break label153;
        }
      }
      label153:
      for (bool = true;; bool = false)
      {
        if (bool) {
          a(paramh.getUsername(), 2, paramh.getUsername());
        }
        GMTrace.o(378359775232L, 2819);
        return bool;
        bool = false;
        break;
      }
    }
    w.i("MicroMsg.ImgFlagStorage", "old, smallImageUrl = %s, bigImageUrl = %s", new Object[] { ((h)localObject).Dp(), ((h)localObject).Do() });
    this.gsX.remove(paramh.getUsername());
    if ((paramh != null) && (paramh.getUsername() != null))
    {
      bool = true;
      Assert.assertTrue(bool);
      paramh.gsS = ((int)(System.currentTimeMillis() / 1000L));
      paramh.eQl |= 0x4;
      localObject = paramh.Dn();
      if (this.goN.update("img_flag", (ContentValues)localObject, "username=?", new String[] { paramh.getUsername() }) <= 0) {
        break label313;
      }
    }
    label313:
    for (boolean bool = true;; bool = false)
    {
      if (bool) {
        a(paramh.getUsername(), 3, paramh.getUsername());
      }
      GMTrace.o(378359775232L, 2819);
      return bool;
      bool = false;
      break;
    }
  }
  
  public final h ig(String paramString)
  {
    GMTrace.i(378225557504L, 2818);
    Object localObject = (h)this.gsX.get(paramString);
    if ((localObject != null) && (((h)localObject).getUsername().equals(paramString)))
    {
      GMTrace.o(378225557504L, 2818);
      return (h)localObject;
    }
    localObject = "select img_flag.username,img_flag.imgflag,img_flag.lastupdatetime,img_flag.reserved1,img_flag.reserved2,img_flag.reserved3,img_flag.reserved4 from img_flag where img_flag.username=\"" + bg.nk(paramString) + "\"";
    Cursor localCursor = this.goN.a((String)localObject, null, 2);
    if (localCursor == null)
    {
      GMTrace.o(378225557504L, 2818);
      return null;
    }
    if (localCursor.moveToFirst())
    {
      localObject = new h();
      ((h)localObject).b(localCursor);
    }
    for (;;)
    {
      localCursor.close();
      this.gsX.m(paramString, localObject);
      GMTrace.o(378225557504L, 2818);
      return (h)localObject;
      localObject = null;
    }
  }
  
  public final void ih(String paramString)
  {
    GMTrace.i(378628210688L, 2821);
    if (bg.nm(paramString))
    {
      GMTrace.o(378628210688L, 2821);
      return;
    }
    this.gsX.remove(paramString);
    this.goN.delete("img_flag", "username=?", new String[] { paramString });
    GMTrace.o(378628210688L, 2821);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ac\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */