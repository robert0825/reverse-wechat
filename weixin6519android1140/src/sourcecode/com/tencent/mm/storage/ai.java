package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f;
import com.tencent.mm.bu.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.b;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;

public final class ai
  extends j
  implements b
{
  public static final String[] fTX;
  private final f<String, Long> gli;
  private g goN;
  
  static
  {
    GMTrace.i(13198971371520L, 98340);
    fTX = new String[] { "CREATE TABLE IF NOT EXISTS DeletedConversationInfo ( userName TEXT  PRIMARY KEY , lastSeq LONG  , reserved1 INT  , reserved2 LONG  , reserved3 TEXT  ) ", "CREATE INDEX IF NOT EXISTS createTimeIndex  ON DeletedConversationInfo ( reserved2 )" };
    GMTrace.o(13198971371520L, 98340);
  }
  
  public ai(g paramg)
  {
    GMTrace.i(13198568718336L, 98337);
    this.gli = new f(50);
    this.goN = paramg;
    GMTrace.o(13198568718336L, 98337);
  }
  
  public final long BU(String paramString)
  {
    GMTrace.i(13198837153792L, 98339);
    if (bg.nm(paramString))
    {
      GMTrace.o(13198837153792L, 98339);
      return 0L;
    }
    Object localObject = "select lastSeq from DeletedConversationInfo where userName = \"" + bg.nk(paramString) + "\"";
    localObject = this.goN.a((String)localObject, null, 2);
    if (localObject == null)
    {
      w.i("MicroMsg.DeletedConversationInfoStorage", "getLastSeq failed " + paramString);
      GMTrace.o(13198837153792L, 98339);
      return 0L;
    }
    if (((Cursor)localObject).moveToFirst())
    {
      long l = ((Cursor)localObject).getLong(0);
      ((Cursor)localObject).close();
      GMTrace.o(13198837153792L, 98339);
      return l;
    }
    ((Cursor)localObject).close();
    GMTrace.o(13198837153792L, 98339);
    return 0L;
  }
  
  public final long BV(String paramString)
  {
    GMTrace.i(20381364649984L, 151853);
    if (bg.nm(paramString))
    {
      GMTrace.o(20381364649984L, 151853);
      return 0L;
    }
    Object localObject = (Long)this.gli.get(paramString);
    long l;
    if (localObject != null)
    {
      l = ((Long)localObject).longValue();
      GMTrace.o(20381364649984L, 151853);
      return l;
    }
    localObject = "select reserved2 from DeletedConversationInfo where userName = \"" + bg.nk(paramString) + "\"";
    localObject = this.goN.a((String)localObject, null, 2);
    if (localObject == null)
    {
      w.i("MicroMsg.DeletedConversationInfoStorage", "getCreateTime failed " + paramString);
      this.gli.m(paramString, Long.valueOf(0L));
      GMTrace.o(20381364649984L, 151853);
      return 0L;
    }
    if (((Cursor)localObject).moveToFirst())
    {
      l = ((Cursor)localObject).getLong(0);
      this.gli.m(paramString, Long.valueOf(l));
      ((Cursor)localObject).close();
      GMTrace.o(20381364649984L, 151853);
      return l;
    }
    ((Cursor)localObject).close();
    GMTrace.o(20381364649984L, 151853);
    return 0L;
  }
  
  public final List<String> aOh()
  {
    GMTrace.i(20381230432256L, 151852);
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = this.goN.a("select userName,reserved2 from DeletedConversationInfo where reserved2 > 0", null, 2);
    if (localCursor == null)
    {
      GMTrace.o(20381230432256L, 151852);
      return localArrayList;
    }
    if (localCursor.moveToFirst()) {
      do
      {
        String str = localCursor.getString(0);
        long l = localCursor.getLong(1);
        this.gli.m(str, Long.valueOf(l));
        localArrayList.add(str);
      } while (localCursor.moveToNext());
    }
    localCursor.close();
    GMTrace.o(20381230432256L, 151852);
    return localArrayList;
  }
  
  public final boolean y(String paramString, long paramLong)
  {
    GMTrace.i(20380961996800L, 151850);
    if (bg.nm(paramString))
    {
      GMTrace.o(20380961996800L, 151850);
      return false;
    }
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("userName", paramString);
    localContentValues.put("lastSeq", Long.valueOf(paramLong));
    if ((int)this.goN.replace("DeletedConversationInfo", "userName", localContentValues) != -1)
    {
      SS(paramString);
      GMTrace.o(20380961996800L, 151850);
      return true;
    }
    GMTrace.o(20380961996800L, 151850);
    return false;
  }
  
  public final boolean z(String paramString, long paramLong)
  {
    GMTrace.i(20381096214528L, 151851);
    if (bg.nm(paramString))
    {
      GMTrace.o(20381096214528L, 151851);
      return false;
    }
    this.gli.m(paramString, Long.valueOf(paramLong));
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("userName", paramString);
    localContentValues.put("reserved2", Long.valueOf(paramLong));
    if ((int)this.goN.replace("DeletedConversationInfo", "userName", localContentValues) != -1)
    {
      SS(paramString);
      GMTrace.o(20381096214528L, 151851);
      return true;
    }
    GMTrace.o(20381096214528L, 151851);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\storage\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */