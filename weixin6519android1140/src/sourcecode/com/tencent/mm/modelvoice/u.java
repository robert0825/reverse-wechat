package com.tencent.mm.modelvoice;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.o;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;

public final class u
  extends j
{
  public static final String[] fTX;
  public g goN;
  Map<String, a> heD;
  Map<String, l> heE;
  Map<String, h> heF;
  
  static
  {
    GMTrace.i(568009424896L, 4232);
    fTX = new String[] { "CREATE TABLE IF NOT EXISTS voiceinfo ( FileName TEXT PRIMARY KEY, User TEXT, MsgId INT, NetOffset INT, FileNowSize INT, TotalLen INT, Status INT, CreateTime INT, LastModifyTime INT, ClientId TEXT, VoiceLength INT, MsgLocalId INT, Human TEXT, reserved1 INT, reserved2 TEXT, MsgSource TEXT, MsgFlag INT, MsgSeq INT, MasterBufId INT )", "CREATE INDEX IF NOT EXISTS voiceinfomsgidindex ON voiceinfo ( MsgId ) ", "CREATE UNIQUE INDEX IF NOT EXISTS voiceinfouniqueindex ON voiceinfo ( FileName )", "DELETE FROM voiceinfo WHERE Status = 99" };
    GMTrace.o(568009424896L, 4232);
  }
  
  public u(g paramg)
  {
    GMTrace.i(566935683072L, 4224);
    this.heD = new HashMap();
    this.heE = new HashMap();
    this.heF = new HashMap();
    b(paramg);
    this.goN = paramg;
    GMTrace.o(566935683072L, 4224);
  }
  
  private static void b(g paramg)
  {
    int i = 0;
    GMTrace.i(567069900800L, 4225);
    Cursor localCursor = paramg.a("PRAGMA table_info(voiceinfo)", null, 0);
    if (localCursor == null)
    {
      w.i("MicroMsg.VoiceStorage", "addNewColIfNeed failed, cursor is null.");
      GMTrace.o(567069900800L, 4225);
      return;
    }
    int i3 = localCursor.getColumnIndex("name");
    int j = 0;
    int k = 0;
    int m = 0;
    while (localCursor.moveToNext()) {
      if (i3 >= 0)
      {
        String str = localCursor.getString(i3);
        int n = m;
        if ("MsgSource".equals(str)) {
          n = 1;
        }
        int i1 = k;
        if ("MsgFlag".equals(str)) {
          i1 = 1;
        }
        int i2 = j;
        if ("MsgSeq".equals(str)) {
          i2 = 1;
        }
        j = i2;
        k = i1;
        m = n;
        if ("MasterBufId".equals(str))
        {
          i = 1;
          j = i2;
          k = i1;
          m = n;
        }
      }
    }
    localCursor.close();
    if (m == 0) {
      paramg.eZ("voiceinfo", "Alter table voiceinfo add MsgSource TEXT");
    }
    if (k == 0) {
      paramg.eZ("voiceinfo", "Alter table voiceinfo add MsgFlag INT");
    }
    if (j == 0) {
      paramg.eZ("voiceinfo", "Alter table voiceinfo add MsgSeq INT");
    }
    if (i == 0) {
      paramg.eZ("voiceinfo", "Alter table voiceinfo add MasterBufId INT");
    }
    GMTrace.o(567069900800L, 4225);
  }
  
  public static String mU(String paramString)
  {
    GMTrace.i(567204118528L, 4226);
    paramString = o.h(paramString, bg.Pv());
    GMTrace.o(567204118528L, 4226);
    return paramString;
  }
  
  public final boolean a(String paramString, p paramp)
  {
    GMTrace.i(567472553984L, 4228);
    boolean bool;
    if (paramString.length() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (paramp == null) {
        break label67;
      }
      bool = true;
      label28:
      Assert.assertTrue(bool);
      paramp = paramp.qL();
      if (paramp.size() > 0) {
        break label72;
      }
      w.e("MicroMsg.VoiceStorage", "update failed, no values set");
    }
    label67:
    label72:
    while (this.goN.update("voiceinfo", paramp, "FileName= ?", new String[] { paramString }) <= 0)
    {
      GMTrace.o(567472553984L, 4228);
      return false;
      bool = false;
      break;
      bool = false;
      break label28;
    }
    doNotify();
    GMTrace.o(567472553984L, 4228);
    return true;
  }
  
  public final p aE(long paramLong)
  {
    p localp = null;
    GMTrace.i(567606771712L, 4229);
    Object localObject = "SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2, MsgSource, MsgFlag, MsgSeq, MasterBufId" + " FROM voiceinfo WHERE MsgId=" + paramLong;
    localObject = this.goN.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      localp = new p();
      localp.b((Cursor)localObject);
    }
    ((Cursor)localObject).close();
    GMTrace.o(567606771712L, 4229);
    return localp;
  }
  
  public final boolean b(p paramp)
  {
    GMTrace.i(567338336256L, 4227);
    boolean bool;
    if (paramp != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      paramp = paramp.qL();
      if (paramp.size() > 0) {
        break label54;
      }
      w.e("MicroMsg.VoiceStorage", "insert falied, no values set");
    }
    label54:
    while (this.goN.insert("voiceinfo", "FileName", paramp) == -1L)
    {
      GMTrace.o(567338336256L, 4227);
      return false;
      bool = false;
      break;
    }
    doNotify();
    GMTrace.o(567338336256L, 4227);
    return true;
  }
  
  public final boolean hB(String paramString)
  {
    GMTrace.i(17765863784448L, 132366);
    if (paramString.length() > 0) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if (this.goN.delete("voiceinfo", "FileName= ?", new String[] { paramString }) <= 0) {
        w.w("MicroMsg.VoiceStorage", "delete failed, no such file:" + paramString);
      }
      GMTrace.o(17765863784448L, 132366);
      return true;
    }
  }
  
  public final p hr(int paramInt)
  {
    p localp = null;
    GMTrace.i(567740989440L, 4230);
    Object localObject = "SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2, MsgSource, MsgFlag, MsgSeq, MasterBufId" + " FROM voiceinfo WHERE MsgLocalId=" + paramInt;
    localObject = this.goN.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      localp = new p();
      localp.b((Cursor)localObject);
    }
    ((Cursor)localObject).close();
    GMTrace.o(567740989440L, 4230);
    return localp;
  }
  
  public final p mV(String paramString)
  {
    GMTrace.i(567875207168L, 4231);
    Object localObject1 = null;
    Object localObject2 = "SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2, MsgSource, MsgFlag, MsgSeq, MasterBufId" + " FROM voiceinfo WHERE FileName= ?";
    localObject2 = this.goN.a((String)localObject2, new String[] { paramString }, 2);
    paramString = (String)localObject1;
    if (((Cursor)localObject2).moveToFirst())
    {
      paramString = new p();
      paramString.b((Cursor)localObject2);
    }
    ((Cursor)localObject2).close();
    GMTrace.o(567875207168L, 4231);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvoice\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */