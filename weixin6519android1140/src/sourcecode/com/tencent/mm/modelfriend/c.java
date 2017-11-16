package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.pluginsdk.p.b;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c
  extends m
  implements p.b
{
  public static final String[] fTX;
  public final g goN;
  
  static
  {
    GMTrace.i(4432943120384L, 33028);
    fTX = new String[] { "CREATE TABLE IF NOT EXISTS addr_upload2 ( id int  PRIMARY KEY , md5 text  , peopleid text  , uploadtime long  , realname text  , realnamepyinitial text  , realnamequanpin text  , username text  , nickname text  , nicknamepyinitial text  , nicknamequanpin text  , type int  , moblie text  , email text  , status int  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int , lvbuf BLOG , showhead int  ) ", "CREATE INDEX IF NOT EXISTS upload_time_index ON addr_upload2 ( uploadtime ) ", "CREATE INDEX IF NOT EXISTS addr_upload_user_index ON addr_upload2 ( username ) " };
    GMTrace.o(4432943120384L, 33028);
  }
  
  public c(g paramg)
  {
    GMTrace.i(4431198289920L, 33015);
    this.goN = paramg;
    Cursor localCursor = paramg.a("PRAGMA table_info( " + "addr_upload2" + " )", null, 2);
    int k = localCursor.getColumnIndex("name");
    int i = 0;
    while (localCursor.moveToNext()) {
      if (k >= 0)
      {
        String str = localCursor.getString(k);
        if ("lvbuf".equalsIgnoreCase(str)) {
          i = 1;
        } else if ("showhead".equalsIgnoreCase(str)) {
          j = 1;
        }
      }
    }
    localCursor.close();
    if (i == 0) {
      paramg.eZ("addr_upload2", "Alter table " + "addr_upload2" + " add lvbuf BLOB ");
    }
    if (j == 0) {
      paramg.eZ("addr_upload2", "Alter table " + "addr_upload2" + " add showhead int ");
    }
    GMTrace.o(4431198289920L, 33015);
  }
  
  public final boolean A(List<b> paramList)
  {
    GMTrace.i(4431466725376L, 33017);
    if ((paramList == null) || (paramList.size() <= 0))
    {
      GMTrace.o(4431466725376L, 33017);
      return false;
    }
    be localbe = new be("MicroMsg.AddrUploadStorage", "transaction");
    localbe.addSplit("transation begin");
    long l = this.goN.cE(Thread.currentThread().getId());
    int i = 0;
    for (;;)
    {
      try
      {
        if (i >= paramList.size()) {
          continue;
        }
        localb = (b)paramList.get(i);
        if (localb == null) {
          continue;
        }
        localObject = localb.GS();
        localObject = "select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2  where addr_upload2.id = \"" + b.jH((String)localObject) + "\"";
        localObject = this.goN.a((String)localObject, null, 2);
        if (localObject != null) {
          continue;
        }
        bool = false;
        if (bool) {
          continue;
        }
        localb.eQl = -1;
        localObject = localb.qL();
        if ((int)this.goN.insert("addr_upload2", "id", (ContentValues)localObject) != -1) {
          continue;
        }
        w.i("MicroMsg.AddrUploadStorage", "batchSet insert failed, num:%s email:%s", new Object[] { localb.Ha(), localb.Hb() });
        bool = true;
      }
      catch (Exception paramList)
      {
        b localb;
        w.e("MicroMsg.AddrUploadStorage", paramList.getMessage());
        boolean bool = false;
        continue;
        b(2, this, localb.GS());
        continue;
        int k = b.jH(localb.GS());
        Object localObject = localb.qL();
        int j = 0;
        if (((ContentValues)localObject).size() <= 0) {
          continue;
        }
        j = this.goN.update("addr_upload2", (ContentValues)localObject, "id=?", new String[] { String.valueOf(k) });
        if (j != 0) {
          continue;
        }
        w.i("MicroMsg.AddrUploadStorage", "batchSet update result=0, num:%s email:%s", new Object[] { localb.Ha(), localb.Hb() });
        continue;
        if (j >= 0) {
          continue;
        }
        w.i("MicroMsg.AddrUploadStorage", "batchSet update failed, num:%s email:%s", new Object[] { localb.Ha(), localb.Hb() });
        bool = true;
        continue;
        b(3, this, localb.GS());
        continue;
        bool = true;
        continue;
        i += 1;
      }
      this.goN.aL(l);
      localbe.addSplit("transation end");
      localbe.dumpToLog();
      GMTrace.o(4431466725376L, 33017);
      return bool;
      bool = ((Cursor)localObject).moveToFirst();
      ((Cursor)localObject).close();
    }
  }
  
  public final boolean B(List<String> paramList)
  {
    GMTrace.i(4431332507648L, 33016);
    if (paramList.size() <= 0)
    {
      GMTrace.o(4431332507648L, 33016);
      return false;
    }
    be localbe = new be("MicroMsg.AddrUploadStorage", "delete transaction");
    localbe.addSplit("begin");
    long l = this.goN.cE(Thread.currentThread().getId());
    boolean bool;
    try
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        String str = (String)paramList.next();
        if ((str != null) && (str.length() > 0))
        {
          int i = this.goN.delete("addr_upload2", "id =?", new String[] { b.jH(str) });
          w.d("MicroMsg.AddrUploadStorage", "delete addr_upload2 md5 :" + str + ", res:" + i);
          if (i > 0)
          {
            b(5, this, str);
            continue;
            this.goN.aL(l);
          }
        }
      }
    }
    catch (Exception paramList)
    {
      w.printErrStackTrace("MicroMsg.AddrUploadStorage", paramList, "", new Object[0]);
      bool = false;
    }
    for (;;)
    {
      localbe.addSplit("end");
      localbe.dumpToLog();
      GMTrace.o(4431332507648L, 33016);
      return bool;
      bool = true;
    }
  }
  
  public final boolean C(List<String> paramList)
  {
    GMTrace.i(4431600943104L, 33018);
    be localbe = new be("MicroMsg.AddrUploadStorage", "set uploaded transaction");
    localbe.addSplit("transation begin");
    long l = this.goN.cE(Thread.currentThread().getId());
    boolean bool;
    try
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        String str = (String)paramList.next();
        if ((str != null) && (str.length() > 0))
        {
          Object localObject = new b();
          ((b)localObject).eQl = 8;
          ((b)localObject).gCn = bg.Pu();
          localObject = ((b)localObject).qL();
          int i = 0;
          if (((ContentValues)localObject).size() > 0) {
            i = this.goN.update("addr_upload2", (ContentValues)localObject, "id=?", new String[] { b.jH(str) });
          }
          w.i("MicroMsg.AddrUploadStorage", "local contact uploaded : " + str + ", update result: " + i);
          continue;
          this.goN.aL(l);
        }
      }
    }
    catch (Exception paramList)
    {
      w.e("MicroMsg.AddrUploadStorage", paramList.getMessage());
      bool = false;
    }
    for (;;)
    {
      localbe.addSplit("transation end");
      localbe.dumpToLog();
      if (bool) {
        b(3, this, null);
      }
      GMTrace.o(4431600943104L, 33018);
      return bool;
      bool = true;
    }
  }
  
  public final List<String[]> He()
  {
    GMTrace.i(4432272031744L, 33023);
    Cursor localCursor = this.goN.a("select addr_upload2.moblie , addr_upload2.md5 from addr_upload2 where addr_upload2.type = 0", null, 2);
    ArrayList localArrayList = new ArrayList();
    while (localCursor.moveToNext()) {
      localArrayList.add(new String[] { localCursor.getString(0), localCursor.getString(1) });
    }
    localCursor.close();
    GMTrace.o(4432272031744L, 33023);
    return localArrayList;
  }
  
  protected final boolean Hf()
  {
    GMTrace.i(4432540467200L, 33025);
    if ((this.goN == null) || (this.goN.bRk()))
    {
      if (this.goN == null) {}
      for (Object localObject = "null";; localObject = Boolean.valueOf(this.goN.bRk()))
      {
        w.w("MicroMsg.AddrUploadStorage", "shouldProcessEvent db is close :%s", new Object[] { localObject });
        GMTrace.o(4432540467200L, 33025);
        return false;
      }
    }
    GMTrace.o(4432540467200L, 33025);
    return true;
  }
  
  public final int a(String paramString, b paramb)
  {
    int i = 0;
    GMTrace.i(4431735160832L, 33019);
    ContentValues localContentValues = paramb.qL();
    if (localContentValues.size() > 0) {
      i = this.goN.update("addr_upload2", localContentValues, "id=?", new String[] { b.jH(paramString) });
    }
    if (i > 0)
    {
      if (paramb.GS().equals(paramString)) {
        break label106;
      }
      b(5, this, paramString);
      b(2, this, paramb.GS());
    }
    for (;;)
    {
      GMTrace.o(4431735160832L, 33019);
      return i;
      label106:
      b(3, this, paramString);
    }
  }
  
  public final b al(long paramLong)
  {
    GMTrace.i(4432003596288L, 33021);
    b localb = new b();
    Object localObject = "select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2 WHERE id=" + Long.toString(paramLong) + ';';
    localObject = this.goN.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst()) {
      localb.b((Cursor)localObject);
    }
    ((Cursor)localObject).close();
    GMTrace.o(4432003596288L, 33021);
    return localb;
  }
  
  public final b jJ(String paramString)
  {
    GMTrace.i(4431869378560L, 33020);
    if (bg.nm(paramString))
    {
      GMTrace.o(4431869378560L, 33020);
      return null;
    }
    b localb = new b();
    Object localObject = "select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2 where addr_upload2.username=\"" + bg.nk(paramString) + "\"";
    localObject = this.goN.a((String)localObject, null, 2);
    w.d("MicroMsg.AddrUploadStorage", "get addrUpload :" + paramString);
    if (((Cursor)localObject).moveToFirst()) {
      localb.b((Cursor)localObject);
    }
    ((Cursor)localObject).close();
    GMTrace.o(4431869378560L, 33020);
    return localb;
  }
  
  public final b jK(String paramString)
  {
    b localb = null;
    GMTrace.i(4432137814016L, 33022);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(4432137814016L, 33022);
      return null;
    }
    Object localObject = "select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2 where addr_upload2.id=\"" + b.jH(paramString) + "\"";
    localObject = this.goN.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      localb = new b();
      localb.b((Cursor)localObject);
    }
    paramString = new StringBuilder("get addrUpload :").append(paramString).append(", resCnt:");
    if (localb != null) {}
    for (int i = 1;; i = 0)
    {
      w.d("MicroMsg.AddrUploadStorage", i);
      ((Cursor)localObject).close();
      GMTrace.o(4432137814016L, 33022);
      return localb;
    }
  }
  
  public final List<b> jL(String paramString)
  {
    GMTrace.i(4432406249472L, 33024);
    w.d("MicroMsg.AddrUploadStorage", "sql : " + paramString);
    ArrayList localArrayList = new ArrayList();
    w.d("MicroMsg.AddrUploadStorage", "sql : " + paramString);
    paramString = this.goN.a(paramString, null, 2);
    while (paramString.moveToNext())
    {
      b localb = new b();
      localb.b(paramString);
      localArrayList.add(localb);
    }
    paramString.close();
    GMTrace.o(4432406249472L, 33024);
    return localArrayList;
  }
  
  public final String jM(String paramString)
  {
    GMTrace.i(4432674684928L, 33026);
    paramString = jK(paramString);
    if (paramString != null)
    {
      paramString = paramString.getUsername();
      GMTrace.o(4432674684928L, 33026);
      return paramString;
    }
    GMTrace.o(4432674684928L, 33026);
    return null;
  }
  
  /* Error */
  public final String jN(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 406
    //   3: ldc_w 408
    //   6: invokestatic 21	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: invokestatic 371	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   13: ifne +95 -> 108
    //   16: aload_0
    //   17: getfield 44	com/tencent/mm/modelfriend/c:goN	Lcom/tencent/mm/bu/g;
    //   20: ldc 53
    //   22: aconst_null
    //   23: ldc_w 410
    //   26: iconst_1
    //   27: anewarray 23	java/lang/String
    //   30: dup
    //   31: iconst_0
    //   32: aload_1
    //   33: aastore
    //   34: aconst_null
    //   35: aconst_null
    //   36: aconst_null
    //   37: iconst_2
    //   38: invokevirtual 413	com/tencent/mm/bu/g:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/database/Cursor;
    //   41: astore_2
    //   42: aload_2
    //   43: astore_1
    //   44: aload_2
    //   45: invokeinterface 207 1 0
    //   50: ifeq +48 -> 98
    //   53: aload_2
    //   54: astore_1
    //   55: new 153	com/tencent/mm/modelfriend/b
    //   58: dup
    //   59: invokespecial 289	com/tencent/mm/modelfriend/b:<init>	()V
    //   62: astore_3
    //   63: aload_2
    //   64: astore_1
    //   65: aload_3
    //   66: aload_2
    //   67: invokevirtual 363	com/tencent/mm/modelfriend/b:b	(Landroid/database/Cursor;)V
    //   70: aload_2
    //   71: astore_1
    //   72: aload_3
    //   73: invokevirtual 404	com/tencent/mm/modelfriend/b:getUsername	()Ljava/lang/String;
    //   76: astore_3
    //   77: aload_2
    //   78: ifnull +9 -> 87
    //   81: aload_2
    //   82: invokeinterface 96 1 0
    //   87: ldc2_w 406
    //   90: ldc_w 408
    //   93: invokestatic 34	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   96: aload_3
    //   97: areturn
    //   98: aload_2
    //   99: ifnull +9 -> 108
    //   102: aload_2
    //   103: invokeinterface 96 1 0
    //   108: ldc2_w 406
    //   111: ldc_w 408
    //   114: invokestatic 34	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   117: aconst_null
    //   118: areturn
    //   119: astore_3
    //   120: aconst_null
    //   121: astore_2
    //   122: aload_2
    //   123: astore_1
    //   124: ldc 123
    //   126: ldc_w 415
    //   129: iconst_1
    //   130: anewarray 184	java/lang/Object
    //   133: dup
    //   134: iconst_0
    //   135: aload_3
    //   136: invokevirtual 211	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   139: aastore
    //   140: invokestatic 417	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   143: aload_2
    //   144: ifnull -36 -> 108
    //   147: aload_2
    //   148: invokeinterface 96 1 0
    //   153: goto -45 -> 108
    //   156: astore_2
    //   157: aconst_null
    //   158: astore_1
    //   159: aload_1
    //   160: ifnull +9 -> 169
    //   163: aload_1
    //   164: invokeinterface 96 1 0
    //   169: aload_2
    //   170: athrow
    //   171: astore_2
    //   172: goto -13 -> 159
    //   175: astore_3
    //   176: goto -54 -> 122
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	179	0	this	c
    //   0	179	1	paramString	String
    //   41	107	2	localCursor	Cursor
    //   156	14	2	localObject1	Object
    //   171	1	2	localObject2	Object
    //   62	35	3	localObject3	Object
    //   119	17	3	localException1	Exception
    //   175	1	3	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   16	42	119	java/lang/Exception
    //   16	42	156	finally
    //   44	53	171	finally
    //   55	63	171	finally
    //   65	70	171	finally
    //   72	77	171	finally
    //   124	143	171	finally
    //   44	53	175	java/lang/Exception
    //   55	63	175	java/lang/Exception
    //   65	70	175	java/lang/Exception
    //   72	77	175	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */