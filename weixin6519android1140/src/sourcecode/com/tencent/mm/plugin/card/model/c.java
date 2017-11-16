package com.tencent.mm.plugin.card.model;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;

public final class c
  extends i<CardInfo>
{
  public static final String[] fTX;
  public e fTZ;
  
  static
  {
    GMTrace.i(4906597482496L, 36557);
    fTX = new String[] { i.a(CardInfo.fTp, "UserCardInfo"), "CREATE INDEX IF NOT EXISTS  stickyIndexIndex ON UserCardInfo ( stickyIndex ) " };
    GMTrace.o(4906597482496L, 36557);
  }
  
  public c(e parame)
  {
    super(parame, CardInfo.fTp, "UserCardInfo", null);
    GMTrace.i(4906194829312L, 36554);
    this.fTZ = parame;
    GMTrace.o(4906194829312L, 36554);
  }
  
  /* Error */
  public final java.util.List<CardInfo> akc()
  {
    // Byte code:
    //   0: ldc2_w 59
    //   3: ldc 61
    //   5: invokestatic 22	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: getfield 54	com/tencent/mm/plugin/card/model/c:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   12: ldc 63
    //   14: iconst_1
    //   15: anewarray 24	java/lang/String
    //   18: dup
    //   19: iconst_0
    //   20: ldc 65
    //   22: aastore
    //   23: invokeinterface 71 3 0
    //   28: astore_1
    //   29: aload_1
    //   30: ifnonnull +20 -> 50
    //   33: ldc 73
    //   35: ldc 75
    //   37: invokestatic 81	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   40: ldc2_w 59
    //   43: ldc 61
    //   45: invokestatic 43	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   48: aconst_null
    //   49: areturn
    //   50: new 83	java/util/ArrayList
    //   53: dup
    //   54: invokespecial 85	java/util/ArrayList:<init>	()V
    //   57: astore_2
    //   58: aload_1
    //   59: invokeinterface 91 1 0
    //   64: ifeq +72 -> 136
    //   67: new 26	com/tencent/mm/plugin/card/model/CardInfo
    //   70: dup
    //   71: invokespecial 92	com/tencent/mm/plugin/card/model/CardInfo:<init>	()V
    //   74: astore_3
    //   75: aload_3
    //   76: aload_1
    //   77: invokevirtual 96	com/tencent/mm/plugin/card/model/CardInfo:b	(Landroid/database/Cursor;)V
    //   80: aload_2
    //   81: aload_3
    //   82: invokeinterface 102 2 0
    //   87: pop
    //   88: goto -30 -> 58
    //   91: astore_3
    //   92: ldc 73
    //   94: new 104	java/lang/StringBuilder
    //   97: dup
    //   98: ldc 106
    //   100: invokespecial 109	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   103: invokevirtual 113	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: iconst_1
    //   107: anewarray 115	java/lang/Object
    //   110: dup
    //   111: iconst_0
    //   112: aload_3
    //   113: invokevirtual 118	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   116: aastore
    //   117: invokestatic 121	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   120: aload_1
    //   121: invokeinterface 124 1 0
    //   126: ldc2_w 59
    //   129: ldc 61
    //   131: invokestatic 43	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   134: aload_2
    //   135: areturn
    //   136: aload_1
    //   137: invokeinterface 124 1 0
    //   142: goto -16 -> 126
    //   145: astore_2
    //   146: aload_1
    //   147: invokeinterface 124 1 0
    //   152: aload_2
    //   153: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	154	0	this	c
    //   28	119	1	localCursor	Cursor
    //   57	78	2	localArrayList	java.util.ArrayList
    //   145	8	2	localObject	Object
    //   74	8	3	localCardInfo	CardInfo
    //   91	22	3	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   58	88	91	java/lang/Exception
    //   58	88	145	finally
    //   92	120	145	finally
  }
  
  public final Cursor lF(int paramInt)
  {
    GMTrace.i(4906329047040L, 36555);
    long l = bg.Pu();
    Object localObject = "update UserCardInfo set stickyIndex=0, stickyEndTime=0 where stickyIndex>0 and (" + l + ">stickyEndTime and stickyEndTime" + "<>0)";
    this.fTZ.eZ("UserCardInfo", (String)localObject);
    localObject = new StringBuilder("select * from UserCardInfo");
    switch (1.jyQ[(paramInt - 1)])
    {
    }
    for (;;)
    {
      ((StringBuilder)localObject).append(" order by stickyIndex desc, status asc , updateTime desc");
      if (paramInt == n.a.jzE) {
        ((StringBuilder)localObject).append(" LIMIT 3");
      }
      localObject = this.fTZ.rawQuery(((StringBuilder)localObject).toString(), null);
      GMTrace.o(4906329047040L, 36555);
      return (Cursor)localObject;
      ((StringBuilder)localObject).append(" where (status=0 OR ").append("status=5)");
      continue;
      ((StringBuilder)localObject).append(" where (status=0 OR ").append("status=5) AND ").append("card_type=10");
      continue;
      ((StringBuilder)localObject).append(" where (status=0 OR ").append("status=5) AND ").append("card_type!=10");
      continue;
      ((StringBuilder)localObject).append(" where (status=1 OR ").append("status=2 OR status").append("=3 OR status=4").append(" OR status=6)");
      continue;
      ((StringBuilder)localObject).append(" where (status=0 OR ").append("status=5) and (block_mask").append("= '1' OR block_mask= '0' ").append(")");
    }
  }
  
  public final CardInfo tU(String paramString)
  {
    GMTrace.i(4906463264768L, 36556);
    CardInfo localCardInfo = new CardInfo();
    localCardInfo.field_card_id = paramString;
    if (super.b(localCardInfo, new String[0]))
    {
      GMTrace.o(4906463264768L, 36556);
      return localCardInfo;
    }
    GMTrace.o(4906463264768L, 36556);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */