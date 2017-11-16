package com.tencent.mm.plugin.game.model;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import java.util.LinkedList;

public final class u
  extends i<q>
{
  public static final String[] fTX;
  
  static
  {
    GMTrace.i(12601836699648L, 93891);
    fTX = new String[] { i.a(q.fTp, "GameRawMessage") };
    GMTrace.o(12601836699648L, 93891);
  }
  
  public u(e parame)
  {
    super(parame, q.fTp, "GameRawMessage", null);
    GMTrace.i(12600628740096L, 93882);
    GMTrace.o(12600628740096L, 93882);
  }
  
  public static String k(int... paramVarArgs)
  {
    GMTrace.i(12601702481920L, 93890);
    String str = "" + "(";
    int i = 0;
    while (i < 5)
    {
      str = str + "msgType=" + paramVarArgs[i] + " or ";
      i += 1;
    }
    paramVarArgs = str + "msgType=" + paramVarArgs[5];
    paramVarArgs = paramVarArgs + ")";
    GMTrace.o(12601702481920L, 93890);
    return paramVarArgs;
  }
  
  public final void aFA()
  {
    GMTrace.i(15198278647808L, 113236);
    eZ("GameRawMessage", "update GameRawMessage set isHidden = 0 where isHidden = 1");
    GMTrace.o(15198278647808L, 113236);
  }
  
  public final void aFB()
  {
    GMTrace.i(12601434046464L, 93888);
    String str = k(new int[] { 2, 5, 6, 10, 11, 100 });
    eZ("GameRawMessage", "update GameRawMessage set isRead=1 where isRead=0 and " + str + " and isHidden = 0");
    GMTrace.o(12601434046464L, 93888);
  }
  
  public final int aFC()
  {
    int i = 0;
    GMTrace.i(12601568264192L, 93889);
    Object localObject = k(new int[] { 2, 5, 6, 10, 11, 100 });
    localObject = rawQuery("select count(*) from GameRawMessage where " + (String)localObject + " and isRead=0 and showInMsgList" + " = 1 and isHidden" + " = 0", new String[0]);
    if (localObject == null)
    {
      GMTrace.o(12601568264192L, 93889);
      return 0;
    }
    if (((Cursor)localObject).moveToFirst()) {
      i = ((Cursor)localObject).getInt(0);
    }
    ((Cursor)localObject).close();
    GMTrace.o(12601568264192L, 93889);
    return i;
  }
  
  public final LinkedList<q> aFz()
  {
    GMTrace.i(12601031393280L, 93885);
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = rawQuery("select * from GameRawMessage where msgType=20", new String[0]);
    if (localCursor == null)
    {
      GMTrace.o(12601031393280L, 93885);
      return localLinkedList;
    }
    if (localCursor.moveToFirst()) {
      do
      {
        q localq = new q();
        localq.b(localCursor);
        localLinkedList.add(localq);
      } while (localCursor.moveToNext());
    }
    localCursor.close();
    GMTrace.o(12601031393280L, 93885);
    return localLinkedList;
  }
  
  public final LinkedList<q> b(int paramInt1, long paramLong, int paramInt2, int paramInt3)
  {
    GMTrace.i(12600897175552L, 93884);
    Object localObject2;
    Object localObject1;
    if (paramLong == 0L)
    {
      localObject2 = "9223372036854775807";
      if (paramInt2 != 0) {
        break label160;
      }
      localObject1 = "(isRead=1 or isRead=0) ";
    }
    Object localObject3;
    for (;;)
    {
      localObject3 = "";
      if (paramInt1 != 65536) {
        localObject3 = "msgType=" + paramInt1 + " and ";
      }
      localObject2 = String.format("select * from GameRawMessage where " + (String)localObject3 + "msgId<%s and " + (String)localObject1 + "order by createTime desc limit %s", new Object[] { localObject2, String.valueOf(paramInt3) });
      localObject1 = new LinkedList();
      localObject2 = rawQuery((String)localObject2, new String[0]);
      if (localObject2 != null) {
        break label196;
      }
      GMTrace.o(12600897175552L, 93884);
      return (LinkedList<q>)localObject1;
      localObject2 = String.valueOf(paramLong);
      break;
      label160:
      if (paramInt2 == 1)
      {
        localObject1 = "isRead=0 ";
      }
      else
      {
        if (paramInt2 != 2) {
          break label186;
        }
        localObject1 = "isRead=1 ";
      }
    }
    label186:
    GMTrace.o(12600897175552L, 93884);
    return null;
    label196:
    if (((Cursor)localObject2).moveToFirst()) {
      do
      {
        localObject3 = new q();
        ((q)localObject3).b((Cursor)localObject2);
        ((LinkedList)localObject1).add(localObject3);
      } while (((Cursor)localObject2).moveToNext());
    }
    ((Cursor)localObject2).close();
    GMTrace.o(12600897175552L, 93884);
    return (LinkedList<q>)localObject1;
  }
  
  public final q cA(long paramLong)
  {
    GMTrace.i(12600762957824L, 93883);
    q localq = new q();
    localq.field_msgId = paramLong;
    if (b(localq, new String[0]))
    {
      GMTrace.o(12600762957824L, 93883);
      return localq;
    }
    GMTrace.o(12600762957824L, 93883);
    return null;
  }
  
  public final boolean e(long[] paramArrayOfLong)
  {
    GMTrace.i(12601299828736L, 93887);
    if (paramArrayOfLong.length != 0)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("msgId in (");
      int i = 0;
      while (i < paramArrayOfLong.length)
      {
        localStringBuilder.append(paramArrayOfLong[i]);
        if (i != paramArrayOfLong.length - 1) {
          localStringBuilder.append(",");
        }
        i += 1;
      }
      localStringBuilder.append(")");
      boolean bool = eZ("GameRawMessage", String.format("update GameRawMessage set isRead=1 where %s", new Object[] { localStringBuilder.toString() }));
      GMTrace.o(12601299828736L, 93887);
      return bool;
    }
    GMTrace.o(12601299828736L, 93887);
    return false;
  }
  
  public final q zH(String paramString)
  {
    GMTrace.i(12601165611008L, 93886);
    paramString = rawQuery("select * from GameRawMessage where msgType=20 and appId= \"" + paramString + "\" limit 1", new String[0]);
    if (paramString == null)
    {
      GMTrace.o(12601165611008L, 93886);
      return null;
    }
    if (paramString.moveToFirst())
    {
      q localq = new q();
      localq.b(paramString);
      GMTrace.o(12601165611008L, 93886);
      return localq;
    }
    paramString.close();
    GMTrace.o(12601165611008L, 93886);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */