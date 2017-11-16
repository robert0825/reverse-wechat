package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.g.b.db;
import com.tencent.mm.plugin.sns.b.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class j
  extends com.tencent.mm.sdk.e.i<i>
  implements d
{
  public static final String[] fTX;
  public g goN;
  
  static
  {
    GMTrace.i(8292776542208L, 61786);
    fTX = new String[] { com.tencent.mm.sdk.e.i.a(i.fTp, "SnsComment") };
    GMTrace.o(8292776542208L, 61786);
  }
  
  public j(g paramg)
  {
    super(paramg, i.fTp, "SnsComment", db.eZt);
    GMTrace.i(8291300147200L, 61775);
    this.goN = paramg;
    GMTrace.o(8291300147200L, 61775);
  }
  
  public static String blI()
  {
    GMTrace.i(8291434364928L, 61776);
    GMTrace.o(8291434364928L, 61776);
    return "select *, rowid from SnsComment";
  }
  
  public final int ME()
  {
    int i = 0;
    GMTrace.i(8291568582656L, 61777);
    Cursor localCursor = this.goN.a(" select count(*) from SnsComment where isRead = ? and isSilence != ? ", new String[] { "0", "1" }, 2);
    if (localCursor == null)
    {
      GMTrace.o(8291568582656L, 61777);
      return 0;
    }
    if (localCursor.moveToFirst()) {
      i = localCursor.getInt(0);
    }
    localCursor.close();
    GMTrace.o(8291568582656L, 61777);
    return i;
  }
  
  public final boolean a(long paramLong, String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(8291837018112L, 61779);
    if (bg.nm(paramString2)) {}
    for (paramString1 = "select count(*) from SnsComment where snsID = " + paramLong + " and createTime = " + paramInt + " and talker = '" + paramString1 + "'";; paramString1 = "select count(*) from SnsComment where snsID = " + paramLong + " and clientId = '" + paramString2 + "'")
    {
      paramString1 = rawQuery(paramString1, new String[0]);
      if (paramString1 == null) {
        break label153;
      }
      paramString1.moveToFirst();
      paramInt = paramString1.getInt(0);
      paramString1.close();
      if (paramInt <= 0) {
        break;
      }
      GMTrace.o(8291837018112L, 61779);
      return true;
    }
    GMTrace.o(8291837018112L, 61779);
    return false;
    label153:
    GMTrace.o(8291837018112L, 61779);
    return false;
  }
  
  public final boolean aki()
  {
    GMTrace.i(8292508106752L, 61784);
    boolean bool = this.goN.eZ("SnsComment", " update SnsComment set isRead = 1 where isRead = 0");
    GMTrace.o(8292508106752L, 61784);
    return bool;
  }
  
  public final Cursor blJ()
  {
    GMTrace.i(8291702800384L, 61778);
    Object localObject = "select *, rowid from SnsComment where isRead = ?  and isSilence != ?  order by createTime desc";
    localObject = this.goN.a((String)localObject, new String[] { "0", "1" }, 0);
    GMTrace.o(8291702800384L, 61778);
    return (Cursor)localObject;
  }
  
  public final int blK()
  {
    GMTrace.i(8291971235840L, 61780);
    Cursor localCursor = rawQuery("select count(*) from SnsComment where isSend = 0", new String[0]);
    if (localCursor != null)
    {
      localCursor.moveToFirst();
      int i = localCursor.getInt(0);
      localCursor.close();
      GMTrace.o(8291971235840L, 61780);
      return i;
    }
    GMTrace.o(8291971235840L, 61780);
    return 0;
  }
  
  public final void blL()
  {
    GMTrace.i(8292642324480L, 61785);
    this.goN.UX("SnsComment");
    GMTrace.o(8292642324480L, 61785);
  }
  
  public final i d(long paramLong1, long paramLong2, int paramInt)
  {
    GMTrace.i(8292105453568L, 61781);
    if (paramInt == 9) {
      paramInt = 2;
    }
    for (;;)
    {
      int i = paramInt;
      if (paramInt == 10) {
        i = 8;
      }
      Cursor localCursor = rawQuery("select *, rowid from SnsComment where snsID = " + paramLong1 + " and commentSvrID = " + paramLong2 + " and type = " + i, new String[0]);
      i locali;
      if (localCursor != null) {
        if (localCursor.moveToFirst())
        {
          locali = new i();
          locali.b(localCursor);
          localCursor.close();
        }
      }
      for (;;)
      {
        GMTrace.o(8292105453568L, 61781);
        return locali;
        locali = null;
        break;
        locali = null;
      }
    }
  }
  
  public final boolean dP(long paramLong)
  {
    GMTrace.i(8292239671296L, 61782);
    String str = "delete from SnsComment where snsID = " + paramLong;
    boolean bool = this.goN.eZ("SnsComment", str);
    GMTrace.o(8292239671296L, 61782);
    return bool;
  }
  
  public final boolean e(long paramLong1, long paramLong2, int paramInt)
  {
    GMTrace.i(8292373889024L, 61783);
    if (paramInt == 9) {
      paramInt = 2;
    }
    for (;;)
    {
      int i = paramInt;
      if (paramInt == 10) {
        i = 8;
      }
      String str = "delete from SnsComment where snsID = " + paramLong1 + " and commentSvrID = " + paramLong2 + " and type = " + i;
      boolean bool = this.goN.eZ("SnsComment", str);
      GMTrace.o(8292373889024L, 61783);
      return bool;
    }
  }
  
  public final boolean l(long paramLong, boolean paramBoolean)
  {
    GMTrace.i(17131819237376L, 127642);
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      String str = " update SnsComment set isSilence = " + i + " where isSilence != " + i + " and  snsID = " + paramLong;
      w.i("MicroMsg.SnsCommentStorage", "updateIsSilence " + str);
      paramBoolean = this.goN.eZ("SnsComment", str);
      GMTrace.o(17131819237376L, 127642);
      return paramBoolean;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */