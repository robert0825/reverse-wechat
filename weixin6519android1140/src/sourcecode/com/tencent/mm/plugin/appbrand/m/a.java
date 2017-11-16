package com.tencent.mm.plugin.appbrand.m;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.h;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends i<a>
{
  public static final String[] hIQ;
  
  static
  {
    GMTrace.i(19890530418688L, 148196);
    hIQ = new String[] { i.a(a.hIP, "AppBrandCommonKVBinaryData") };
    GMTrace.o(19890530418688L, 148196);
  }
  
  public a(e parame)
  {
    super(parame, a.hIP, "AppBrandCommonKVBinaryData", null);
    GMTrace.i(19890127765504L, 148193);
    GMTrace.o(19890127765504L, 148193);
  }
  
  public final <T extends com.tencent.mm.bm.a> T f(String paramString, Class<T> paramClass)
  {
    GMTrace.i(19890396200960L, 148195);
    Object localObject;
    if (!bg.nm(paramString))
    {
      localObject = new a();
      ((a)localObject).field_key = paramString;
      if (!super.b((c)localObject, new String[0])) {}
    }
    for (paramString = ((a)localObject).field_value; bg.bq(paramString); paramString = null)
    {
      GMTrace.o(19890396200960L, 148195);
      return null;
    }
    try
    {
      localObject = (com.tencent.mm.bm.a)paramClass.newInstance();
      ((com.tencent.mm.bm.a)localObject).aD(paramString);
      GMTrace.o(19890396200960L, 148195);
      return (T)localObject;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.AppBrandCommonKVBinaryDataStorage", "getProto class[%s] e = %s", new Object[] { paramClass.getSimpleName(), paramString });
      GMTrace.o(19890396200960L, 148195);
    }
    return null;
  }
  
  public final void k(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(19890261983232L, 148194);
    if (bg.nm(paramString))
    {
      GMTrace.o(19890261983232L, 148194);
      return;
    }
    a locala = new a();
    locala.field_key = paramString;
    locala.field_value = paramArrayOfByte;
    super.a(locala);
    GMTrace.o(19890261983232L, 148194);
  }
  
  static final class a
    extends c
  {
    static final c.a hIP;
    @h(bRl="$$invalid", bRm=1)
    public String field_key;
    public byte[] field_value;
    
    static
    {
      GMTrace.i(19891201507328L, 148201);
      hIP = w(a.class);
      GMTrace.o(19891201507328L, 148201);
    }
    
    a()
    {
      GMTrace.i(19890664636416L, 148197);
      GMTrace.o(19890664636416L, 148197);
    }
    
    public final void b(Cursor paramCursor)
    {
      GMTrace.i(19890933071872L, 148199);
      this.field_key = paramCursor.getString(0);
      this.field_value = paramCursor.getBlob(1);
      GMTrace.o(19890933071872L, 148199);
    }
    
    public final ContentValues qL()
    {
      GMTrace.i(19891067289600L, 148200);
      ContentValues localContentValues = new ContentValues(2);
      localContentValues.put("key", this.field_key);
      localContentValues.put("value", this.field_value);
      GMTrace.o(19891067289600L, 148200);
      return localContentValues;
    }
    
    protected final c.a uw()
    {
      GMTrace.i(19890798854144L, 148198);
      c.a locala = hIP;
      GMTrace.o(19890798854144L, 148198);
      return locala;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\m\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */