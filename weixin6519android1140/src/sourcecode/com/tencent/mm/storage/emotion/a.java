package com.tencent.mm.storage.emotion;

import android.content.Context;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.f;
import com.tencent.mm.bu.f.a;
import com.tencent.mm.bu.g;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.t;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public final class a
  extends i<EmojiGroupInfo>
  implements f.a
{
  public static final String[] fTX;
  public com.tencent.mm.sdk.e.e fTZ;
  
  static
  {
    GMTrace.i(1560549523456L, 11627);
    fTX = new String[] { i.a(EmojiGroupInfo.fTp, "EmojiGroupInfo") };
    GMTrace.o(1560549523456L, 11627);
  }
  
  public a(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, EmojiGroupInfo.fTp, "EmojiGroupInfo", null);
    GMTrace.i(1555986120704L, 11593);
    this.fTZ = parame;
    GMTrace.o(1555986120704L, 11593);
  }
  
  private static final String Ax(int paramInt)
  {
    GMTrace.i(1559207346176L, 11617);
    String str = " ( type = '" + paramInt + "' ) ";
    GMTrace.o(1559207346176L, 11617);
    return str;
  }
  
  private static final String Ay(int paramInt)
  {
    GMTrace.i(1559475781632L, 11619);
    String str = " ( " + Ax(paramInt) + " and ( ( ( flag & 256 ) = 0 )  or ( flag is null ) )  ) ";
    GMTrace.o(1559475781632L, 11619);
    return str;
  }
  
  public static boolean bUC()
  {
    GMTrace.i(1557999386624L, 11608);
    boolean bool = ((Boolean)h.xy().xh().get(208912, Boolean.valueOf(false))).booleanValue();
    GMTrace.o(1557999386624L, 11608);
    return bool;
  }
  
  private static String bUF()
  {
    GMTrace.i(1558938910720L, 11615);
    String str = Ax(EmojiGroupInfo.TYPE_SYSTEM) + " or " + Ax(EmojiGroupInfo.TYPE_CUSTOM) + " or " + Ax(EmojiGroupInfo.vCi) + " or " + Ax(EmojiGroupInfo.vCk);
    GMTrace.o(1558938910720L, 11615);
    return str;
  }
  
  private static final String bUG()
  {
    GMTrace.i(1559073128448L, 11616);
    String str = " ( " + Ax(EmojiGroupInfo.vCi) + " and " + bUH() + " ) ";
    GMTrace.o(1559073128448L, 11616);
    return str;
  }
  
  private static final String bUH()
  {
    GMTrace.i(1559341563904L, 11618);
    String str = " ( status = '7" + "' ) ";
    GMTrace.o(1559341563904L, 11618);
    return str;
  }
  
  private int bUu()
  {
    k = 0;
    j = 0;
    GMTrace.i(1556791427072L, 11599);
    localObject3 = null;
    localObject1 = null;
    try
    {
      Cursor localCursor = this.fTZ.a("select  count(*) from EmojiInfo where catalog=?", new String[] { EmojiGroupInfo.vCn }, 2);
      int i = j;
      if (localCursor != null)
      {
        i = j;
        localObject1 = localCursor;
        localObject3 = localCursor;
        if (localCursor.moveToFirst())
        {
          localObject1 = localCursor;
          localObject3 = localCursor;
          i = localCursor.getInt(0);
        }
      }
      j = i;
      if (localCursor != null)
      {
        localCursor.close();
        j = i;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localObject3 = localObject1;
        w.e("MicroMsg.emoji.EmojiGroupInfoStorage", "Check GroupId Exist Faild." + localException.getMessage());
        j = k;
        if (localObject1 != null)
        {
          ((Cursor)localObject1).close();
          j = k;
        }
      }
    }
    finally
    {
      if (localObject3 == null) {
        break label191;
      }
      ((Cursor)localObject3).close();
    }
    GMTrace.o(1556791427072L, 11599);
    return j;
  }
  
  private ArrayList<EmojiGroupInfo> eS(Context paramContext)
  {
    GMTrace.i(1556522991616L, 11597);
    EmojiGroupInfo localEmojiGroupInfo = null;
    Element localElement = null;
    NodeList localNodeList = null;
    localArrayList = new ArrayList();
    DocumentBuilderFactory localDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
    localObject2 = localNodeList;
    localObject3 = localEmojiGroupInfo;
    localObject1 = localElement;
    try
    {
      w.i("MicroMsg.emoji.EmojiGroupInfoStorage", "[oneliang]init,parse xml start.");
      localObject2 = localNodeList;
      localObject3 = localEmojiGroupInfo;
      localObject1 = localElement;
      paramContext = paramContext.getAssets().open("custom_emoji/manifest.xml");
      localObject2 = paramContext;
      localObject3 = paramContext;
      localObject1 = paramContext;
      localNodeList = localDocumentBuilderFactory.newDocumentBuilder().parse(paramContext).getDocumentElement().getElementsByTagName("catalog");
      i = 0;
    }
    catch (IOException paramContext)
    {
      int k;
      localObject1 = localObject2;
      w.e("MicroMsg.emoji.EmojiGroupInfoStorage", "exception:%s", new Object[] { bg.f(paramContext) });
      localObject1 = localObject2;
      w.e("MicroMsg.emoji.EmojiGroupInfoStorage", "init emoji group db error." + paramContext.getMessage());
      if (localObject2 == null) {
        break label674;
      }
      try
      {
        ((InputStream)localObject2).close();
        for (;;)
        {
          GMTrace.o(1556522991616L, 11597);
          return localArrayList;
          localObject2 = paramContext;
          localObject3 = paramContext;
          localObject1 = paramContext;
          if (localArrayList.size() > 0)
          {
            localObject2 = paramContext;
            localObject3 = paramContext;
            localObject1 = paramContext;
            cu(localArrayList);
          }
          localObject2 = paramContext;
          localObject3 = paramContext;
          localObject1 = paramContext;
          w.d("MicroMsg.emoji.EmojiGroupInfoStorage", "[oneliang]init,parse xml end.");
          if (paramContext != null) {
            try
            {
              paramContext.close();
            }
            catch (Exception paramContext)
            {
              w.printErrStackTrace("MicroMsg.emoji.EmojiGroupInfoStorage", paramContext, "", new Object[0]);
            }
          }
        }
      }
      catch (Exception paramContext)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.emoji.EmojiGroupInfoStorage", paramContext, "", new Object[0]);
        }
      }
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        localObject1 = localObject3;
        w.e("MicroMsg.emoji.EmojiGroupInfoStorage", "exception:%s", new Object[] { bg.f(paramContext) });
        localObject1 = localObject3;
        w.e("MicroMsg.emoji.EmojiGroupInfoStorage", "parse xml error; " + paramContext.getMessage());
        if (localObject3 != null) {
          try
          {
            ((InputStream)localObject3).close();
          }
          catch (Exception paramContext)
          {
            w.printErrStackTrace("MicroMsg.emoji.EmojiGroupInfoStorage", paramContext, "", new Object[0]);
          }
        }
      }
    }
    finally
    {
      for (;;)
      {
        int i;
        if (localObject1 != null) {}
        try
        {
          ((InputStream)localObject1).close();
          throw paramContext;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.emoji.EmojiGroupInfoStorage", localException, "", new Object[0]);
          }
        }
        i += 1;
        continue;
        int j = 0;
      }
    }
    localObject2 = paramContext;
    localObject3 = paramContext;
    localObject1 = paramContext;
    if (i < localNodeList.getLength())
    {
      localObject2 = paramContext;
      localObject3 = paramContext;
      localObject1 = paramContext;
      localEmojiGroupInfo = new EmojiGroupInfo();
      localObject2 = paramContext;
      localObject3 = paramContext;
      localObject1 = paramContext;
      localElement = (Element)localNodeList.item(i);
      localObject2 = paramContext;
      localObject3 = paramContext;
      localObject1 = paramContext;
      k = Integer.decode(localElement.getAttribute("id")).intValue();
      localObject2 = paramContext;
      localObject3 = paramContext;
      localObject1 = paramContext;
      if (!TextUtils.isEmpty(localElement.getAttribute("sort")))
      {
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        w.d("MicroMsg.emoji.EmojiGroupInfoStorage", "Set Sort id:%d,sort:%d", new Object[] { Integer.valueOf(k), Integer.decode(localElement.getAttribute("sort")) });
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        j = EmojiGroupInfo.vCm;
        if ((k & j) != j) {
          break label903;
        }
        j = 1;
        if (j == 0) {
          break label591;
        }
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        if (bUu() <= 0)
        {
          localObject2 = paramContext;
          localObject3 = paramContext;
          localObject1 = paramContext;
          if (!bUC()) {
            break label591;
          }
        }
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        localEmojiGroupInfo.field_sort = -1;
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        h.xy().xh().set(208912, Boolean.valueOf(true));
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        w.d("MicroMsg.emoji.EmojiGroupInfoStorage", "moveCustomEmojiTabToSecond");
      }
      for (;;)
      {
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        localEmojiGroupInfo.field_productID = String.valueOf(k);
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        localEmojiGroupInfo.field_packName = localElement.getAttribute("name");
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        if (!TextUtils.isEmpty(localElement.getAttribute("type")))
        {
          localObject2 = paramContext;
          localObject3 = paramContext;
          localObject1 = paramContext;
          localEmojiGroupInfo.field_type = Integer.decode(localElement.getAttribute("type")).intValue();
        }
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        if (!TextUtils.isEmpty(localElement.getAttribute("free")))
        {
          localObject2 = paramContext;
          localObject3 = paramContext;
          localObject1 = paramContext;
          localEmojiGroupInfo.field_packType = Integer.decode(localElement.getAttribute("free")).intValue();
        }
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        if (localEmojiGroupInfo.field_type != EmojiGroupInfo.TYPE_SYSTEM)
        {
          localObject2 = paramContext;
          localObject3 = paramContext;
          localObject1 = paramContext;
          if (localEmojiGroupInfo.field_type != EmojiGroupInfo.TYPE_CUSTOM) {
            break;
          }
        }
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        localArrayList.add(localEmojiGroupInfo);
        break;
        label591:
        localObject2 = paramContext;
        localObject3 = paramContext;
        localObject1 = paramContext;
        localEmojiGroupInfo.field_sort = (i + 1);
      }
    }
  }
  
  public final boolean UF(String paramString)
  {
    localObject = null;
    Cursor localCursor = null;
    boolean bool = false;
    GMTrace.i(1557865168896L, 11607);
    if (TextUtils.isEmpty(paramString)) {
      w.e("MicroMsg.emoji.EmojiGroupInfoStorage", "product id is null.");
    }
    String str = "select count(*) from EmojiGroupInfo where productID = '" + paramString + "' AND " + bUH() + " AND ( ( ( flag & 256 ) = 0 )  or ( flag is null ) ) ";
    paramString = localCursor;
    try
    {
      localCursor = this.fTZ.a(str, null, 2);
      if (localCursor != null)
      {
        paramString = localCursor;
        localObject = localCursor;
        if (localCursor.moveToFirst())
        {
          paramString = localCursor;
          localObject = localCursor;
          int i = localCursor.getInt(0);
          if (i > 0) {
            bool = true;
          }
          if (localCursor != null) {
            localCursor.close();
          }
          GMTrace.o(1557865168896L, 11607);
          return bool;
        }
      }
      if (localCursor != null) {
        localCursor.close();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localObject = paramString;
        w.e("MicroMsg.emoji.EmojiGroupInfoStorage", "Check GroupId Exist Faild." + localException.getMessage());
        if (paramString != null) {
          paramString.close();
        }
      }
    }
    finally
    {
      if (localObject == null) {
        break label233;
      }
      ((Cursor)localObject).close();
    }
    GMTrace.o(1557865168896L, 11607);
    return false;
  }
  
  public final boolean UG(String paramString)
  {
    GMTrace.i(1558402039808L, 11611);
    String str;
    if (!bg.nm(paramString)) {
      str = paramString;
    }
    for (;;)
    {
      try
      {
        if (paramString.equals("com.tencent.xin.emoticon.tusiji")) {
          str = EmojiGroupInfo.vCl;
        }
        paramString = aW(str, true);
        if (paramString == null)
        {
          bool = false;
          if (bool)
          {
            a("event_update_group", 0, bg.bQW().toString());
            SS("delete_group");
          }
          GMTrace.o(1558402039808L, 11611);
          return bool;
        }
        if (paramString != null)
        {
          if (paramString.field_type == EmojiGroupInfo.TYPE_CUSTOM) {
            w.d("MicroMsg.emoji.EmojiGroupInfoStorage", "jacks refuse delete custom emoji");
          }
        }
        else
        {
          paramString.field_lastUseTime = System.currentTimeMillis();
          paramString.field_recommand = 0;
          paramString.field_sync = 0;
          bool = a(paramString);
          continue;
        }
        paramString.field_flag |= 0x100;
        paramString.field_status = -1;
        paramString.field_sort = 1;
        paramString.field_recommand = 0;
        paramString.field_sync = 0;
        continue;
        boolean bool = false;
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.emoji.EmojiGroupInfoStorage", "Delete By ProductId fail." + paramString.getMessage());
      }
    }
  }
  
  public final int a(f paramf)
  {
    GMTrace.i(1556254556160L, 11595);
    if (paramf != null) {
      this.fTZ = paramf;
    }
    GMTrace.o(1556254556160L, 11595);
    return 0;
  }
  
  /* Error */
  public final EmojiGroupInfo aW(String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc2_w 449
    //   3: sipush 11598
    //   6: invokestatic 21	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 50	com/tencent/mm/storage/emotion/a:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   13: ldc_w 452
    //   16: iconst_1
    //   17: anewarray 23	java/lang/String
    //   20: dup
    //   21: iconst_0
    //   22: aload_1
    //   23: aastore
    //   24: iconst_2
    //   25: invokeinterface 165 4 0
    //   30: astore_3
    //   31: aload_3
    //   32: ifnull +49 -> 81
    //   35: aload_3
    //   36: invokeinterface 170 1 0
    //   41: ifeq +40 -> 81
    //   44: new 25	com/tencent/mm/storage/emotion/EmojiGroupInfo
    //   47: dup
    //   48: invokespecial 253	com/tencent/mm/storage/emotion/EmojiGroupInfo:<init>	()V
    //   51: astore 6
    //   53: aload 6
    //   55: aload_3
    //   56: invokevirtual 456	com/tencent/mm/storage/emotion/EmojiGroupInfo:b	(Landroid/database/Cursor;)V
    //   59: aload_3
    //   60: ifnull +9 -> 69
    //   63: aload_3
    //   64: invokeinterface 177 1 0
    //   69: ldc2_w 449
    //   72: sipush 11598
    //   75: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   78: aload 6
    //   80: areturn
    //   81: aload_3
    //   82: ifnull +179 -> 261
    //   85: aload_3
    //   86: invokeinterface 177 1 0
    //   91: aconst_null
    //   92: astore_1
    //   93: aload_1
    //   94: ifnonnull +115 -> 209
    //   97: iload_2
    //   98: ifeq +92 -> 190
    //   101: ldc2_w 449
    //   104: sipush 11598
    //   107: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   110: aconst_null
    //   111: areturn
    //   112: astore 5
    //   114: aconst_null
    //   115: astore 4
    //   117: aconst_null
    //   118: astore_3
    //   119: ldc -77
    //   121: new 56	java/lang/StringBuilder
    //   124: dup
    //   125: ldc_w 458
    //   128: invokespecial 61	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   131: aload_1
    //   132: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: ldc_w 460
    //   138: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: aload 5
    //   143: invokevirtual 184	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   146: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   152: invokestatic 190	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   155: aload 4
    //   157: ifnull +99 -> 256
    //   160: aload 4
    //   162: invokeinterface 177 1 0
    //   167: aload_3
    //   168: astore_1
    //   169: goto -76 -> 93
    //   172: astore_1
    //   173: aconst_null
    //   174: astore 4
    //   176: aload 4
    //   178: ifnull +10 -> 188
    //   181: aload 4
    //   183: invokeinterface 177 1 0
    //   188: aload_1
    //   189: athrow
    //   190: new 25	com/tencent/mm/storage/emotion/EmojiGroupInfo
    //   193: dup
    //   194: invokespecial 253	com/tencent/mm/storage/emotion/EmojiGroupInfo:<init>	()V
    //   197: astore_1
    //   198: ldc2_w 449
    //   201: sipush 11598
    //   204: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   207: aload_1
    //   208: areturn
    //   209: ldc2_w 449
    //   212: sipush 11598
    //   215: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   218: aload_1
    //   219: areturn
    //   220: astore_1
    //   221: aload_3
    //   222: astore 4
    //   224: goto -48 -> 176
    //   227: astore_1
    //   228: goto -52 -> 176
    //   231: astore 5
    //   233: aconst_null
    //   234: astore 6
    //   236: aload_3
    //   237: astore 4
    //   239: aload 6
    //   241: astore_3
    //   242: goto -123 -> 119
    //   245: astore 5
    //   247: aload_3
    //   248: astore 4
    //   250: aload 6
    //   252: astore_3
    //   253: goto -134 -> 119
    //   256: aload_3
    //   257: astore_1
    //   258: goto -165 -> 93
    //   261: aconst_null
    //   262: astore_1
    //   263: goto -170 -> 93
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	266	0	this	a
    //   0	266	1	paramString	String
    //   0	266	2	paramBoolean	boolean
    //   30	227	3	localObject1	Object
    //   115	134	4	localObject2	Object
    //   112	30	5	localException1	Exception
    //   231	1	5	localException2	Exception
    //   245	1	5	localException3	Exception
    //   51	200	6	localEmojiGroupInfo	EmojiGroupInfo
    // Exception table:
    //   from	to	target	type
    //   9	31	112	java/lang/Exception
    //   9	31	172	finally
    //   35	53	220	finally
    //   53	59	220	finally
    //   119	155	227	finally
    //   35	53	231	java/lang/Exception
    //   53	59	245	java/lang/Exception
  }
  
  public final void af(ArrayList<String> paramArrayList)
  {
    GMTrace.i(1558536257536L, 11612);
    g localg;
    long l;
    if ((this.fTZ instanceof g))
    {
      localg = (g)this.fTZ;
      l = localg.cE(Thread.currentThread().getId());
      w.i("MicroMsg.emoji.EmojiGroupInfoStorage", "surround deleteByGroupIdList in a transaction, ticket = %d", new Object[] { Long.valueOf(l) });
    }
    for (;;)
    {
      if ((paramArrayList != null) && (paramArrayList.size() > 0))
      {
        paramArrayList = paramArrayList.iterator();
        while (paramArrayList.hasNext()) {
          UG((String)paramArrayList.next());
        }
      }
      if (localg != null)
      {
        localg.aL(l);
        w.i("MicroMsg.emoji.EmojiGroupInfoStorage", "end deleteByGroupIdList transaction");
      }
      GMTrace.o(1558536257536L, 11612);
      return;
      localg = null;
      l = -1L;
    }
  }
  
  public final int bUA()
  {
    localObject3 = null;
    localObject1 = null;
    k = 0;
    j = 0;
    GMTrace.i(1557596733440L, 11605);
    Object localObject4 = "select count(*) from EmojiGroupInfo where " + bUG() + " order by sort ASC,lastUseTime DESC";
    try
    {
      localObject4 = this.fTZ.a((String)localObject4, null, 2);
      int i = j;
      if (localObject4 != null)
      {
        i = j;
        localObject1 = localObject4;
        localObject3 = localObject4;
        if (((Cursor)localObject4).moveToFirst())
        {
          localObject1 = localObject4;
          localObject3 = localObject4;
          i = ((Cursor)localObject4).getInt(0);
        }
      }
      j = i;
      if (localObject4 != null)
      {
        ((Cursor)localObject4).close();
        j = i;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localObject3 = localObject1;
        w.e("MicroMsg.emoji.EmojiGroupInfoStorage", "getDownloadGroupListCount fail." + localException.getMessage());
        j = k;
        if (localObject1 != null)
        {
          ((Cursor)localObject1).close();
          j = k;
        }
      }
    }
    finally
    {
      if (localObject3 == null) {
        break label197;
      }
      ((Cursor)localObject3).close();
    }
    GMTrace.o(1557596733440L, 11605);
    return j;
  }
  
  public final HashMap<String, ak> bUB()
  {
    localObject3 = null;
    localObject1 = null;
    GMTrace.i(1557730951168L, 11606);
    HashMap localHashMap = new HashMap();
    Object localObject4 = "select * from EmojiGroupInfo where " + bUG() + " order by sort ASC,lastUseTime DESC";
    try
    {
      localObject4 = this.fTZ.a((String)localObject4, null, 2);
      if (localObject4 != null)
      {
        localObject1 = localObject4;
        localObject3 = localObject4;
        if (((Cursor)localObject4).moveToFirst())
        {
          localObject1 = localObject4;
          localObject3 = localObject4;
          ak localak = new ak();
          localObject1 = localObject4;
          localObject3 = localObject4;
          int i = ((Cursor)localObject4).getColumnIndex("productID");
          localObject1 = localObject4;
          localObject3 = localObject4;
          int j = ((Cursor)localObject4).getColumnIndex("packName");
          boolean bool;
          do
          {
            localObject1 = localObject4;
            localObject3 = localObject4;
            String str = ((Cursor)localObject4).getString(i);
            localObject1 = localObject4;
            localObject3 = localObject4;
            localak.eEa = str;
            localObject1 = localObject4;
            localObject3 = localObject4;
            localak.kry = ((Cursor)localObject4).getString(j);
            localObject1 = localObject4;
            localObject3 = localObject4;
            localak.Au(7);
            localObject1 = localObject4;
            localObject3 = localObject4;
            localHashMap.put(str, localak);
            localObject1 = localObject4;
            localObject3 = localObject4;
            bool = ((Cursor)localObject4).moveToNext();
          } while (bool);
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localObject3 = localObject1;
        w.e("MicroMsg.emoji.EmojiGroupInfoStorage", "get download group map failed." + localException.getMessage());
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
      }
    }
    finally
    {
      if (localObject3 == null) {
        break label336;
      }
      ((Cursor)localObject3).close();
    }
    GMTrace.o(1557730951168L, 11606);
    return localHashMap;
  }
  
  public final void bUD()
  {
    GMTrace.i(1558670475264L, 11613);
    String str = EmojiGroupInfo.TYPE_CUSTOM;
    str = "UPDATE EmojiGroupInfo SET sort=-1,lastUseTime=" + System.currentTimeMillis() + " WHERE type=" + str;
    if (this.fTZ.eZ("EmojiGroupInfo", str)) {
      a("event_update_group", 0, bg.bQW().toString());
    }
    h.xy().xh().set(208912, Boolean.valueOf(true));
    GMTrace.o(1558670475264L, 11613);
  }
  
  public final ArrayList<EmojiGroupInfo> bUE()
  {
    localObject3 = null;
    localObject1 = null;
    GMTrace.i(1558804692992L, 11614);
    ArrayList localArrayList = new ArrayList();
    Object localObject4 = "select * from EmojiGroupInfo where " + bUG() + " or " + Ay(EmojiGroupInfo.TYPE_SYSTEM) + " or " + Ay(EmojiGroupInfo.TYPE_CUSTOM) + " or " + new StringBuilder(" ( recommand = '1").append("' ) ").toString() + " order by sort ASC,idx ASC,lastUseTime DESC";
    try
    {
      localObject4 = this.fTZ.a((String)localObject4, null, 2);
      if (localObject4 != null)
      {
        localObject1 = localObject4;
        localObject3 = localObject4;
        if (((Cursor)localObject4).moveToFirst())
        {
          boolean bool;
          do
          {
            localObject1 = localObject4;
            localObject3 = localObject4;
            EmojiGroupInfo localEmojiGroupInfo = new EmojiGroupInfo();
            localObject1 = localObject4;
            localObject3 = localObject4;
            localEmojiGroupInfo.b((Cursor)localObject4);
            localObject1 = localObject4;
            localObject3 = localObject4;
            localArrayList.add(localEmojiGroupInfo);
            localObject1 = localObject4;
            localObject3 = localObject4;
            bool = ((Cursor)localObject4).moveToNext();
          } while (bool);
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localObject3 = localObject1;
        w.e("MicroMsg.emoji.EmojiGroupInfoStorage", "get Panel EmojiGroupInfo." + localException.getMessage());
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
      }
    }
    finally
    {
      if (localObject3 == null) {
        break label277;
      }
      ((Cursor)localObject3).close();
    }
    GMTrace.o(1558804692992L, 11614);
    return localArrayList;
  }
  
  /* Error */
  public final boolean bUI()
  {
    // Byte code:
    //   0: ldc2_w 601
    //   3: sipush 11620
    //   6: invokestatic 21	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 56	java/lang/StringBuilder
    //   12: dup
    //   13: invokespecial 120	java/lang/StringBuilder:<init>	()V
    //   16: getstatic 124	com/tencent/mm/storage/emotion/EmojiGroupInfo:TYPE_SYSTEM	I
    //   19: invokevirtual 65	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   22: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   25: astore_3
    //   26: new 56	java/lang/StringBuilder
    //   29: dup
    //   30: invokespecial 120	java/lang/StringBuilder:<init>	()V
    //   33: getstatic 132	com/tencent/mm/storage/emotion/EmojiGroupInfo:vCi	I
    //   36: invokevirtual 65	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   39: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   42: astore 4
    //   44: ldc -77
    //   46: ldc_w 604
    //   49: iconst_1
    //   50: anewarray 284	java/lang/Object
    //   53: dup
    //   54: iconst_0
    //   55: ldc_w 606
    //   58: aastore
    //   59: invokestatic 488	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   62: aconst_null
    //   63: astore_2
    //   64: aload_0
    //   65: getfield 50	com/tencent/mm/storage/emotion/a:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   68: ldc_w 606
    //   71: iconst_4
    //   72: anewarray 23	java/lang/String
    //   75: dup
    //   76: iconst_0
    //   77: aload_3
    //   78: aastore
    //   79: dup
    //   80: iconst_1
    //   81: aload 4
    //   83: aastore
    //   84: dup
    //   85: iconst_2
    //   86: ldc_w 608
    //   89: aastore
    //   90: dup
    //   91: iconst_3
    //   92: ldc_w 610
    //   95: aastore
    //   96: iconst_2
    //   97: invokeinterface 165 4 0
    //   102: astore_3
    //   103: aload_3
    //   104: ifnull +37 -> 141
    //   107: aload_3
    //   108: astore_2
    //   109: aload_3
    //   110: invokeinterface 170 1 0
    //   115: istore_1
    //   116: iload_1
    //   117: ifeq +24 -> 141
    //   120: aload_3
    //   121: ifnull +9 -> 130
    //   124: aload_3
    //   125: invokeinterface 177 1 0
    //   130: ldc2_w 601
    //   133: sipush 11620
    //   136: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   139: iconst_1
    //   140: ireturn
    //   141: aload_3
    //   142: ifnull +9 -> 151
    //   145: aload_3
    //   146: invokeinterface 177 1 0
    //   151: ldc2_w 601
    //   154: sipush 11620
    //   157: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   160: iconst_0
    //   161: ireturn
    //   162: astore_2
    //   163: aconst_null
    //   164: astore_2
    //   165: ldc -77
    //   167: ldc_w 612
    //   170: invokestatic 190	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   173: aload_2
    //   174: ifnull -23 -> 151
    //   177: aload_2
    //   178: invokeinterface 177 1 0
    //   183: goto -32 -> 151
    //   186: astore_3
    //   187: aload_2
    //   188: ifnull +9 -> 197
    //   191: aload_2
    //   192: invokeinterface 177 1 0
    //   197: aload_3
    //   198: athrow
    //   199: astore_3
    //   200: goto -13 -> 187
    //   203: astore_2
    //   204: aload_3
    //   205: astore_2
    //   206: goto -41 -> 165
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	209	0	this	a
    //   115	2	1	bool	boolean
    //   63	46	2	localObject1	Object
    //   162	1	2	localException1	Exception
    //   164	28	2	localObject2	Object
    //   203	1	2	localException2	Exception
    //   205	1	2	localObject3	Object
    //   25	121	3	localObject4	Object
    //   186	12	3	localObject5	Object
    //   199	6	3	localObject6	Object
    //   42	40	4	str	String
    // Exception table:
    //   from	to	target	type
    //   64	103	162	java/lang/Exception
    //   64	103	186	finally
    //   109	116	186	finally
    //   165	173	199	finally
    //   109	116	203	java/lang/Exception
  }
  
  /* Error */
  public final List<String> bUJ()
  {
    // Byte code:
    //   0: ldc2_w 615
    //   3: sipush 11621
    //   6: invokestatic 21	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 198	java/util/ArrayList
    //   12: dup
    //   13: invokespecial 199	java/util/ArrayList:<init>	()V
    //   16: astore 5
    //   18: new 56	java/lang/StringBuilder
    //   21: dup
    //   22: invokespecial 120	java/lang/StringBuilder:<init>	()V
    //   25: getstatic 132	com/tencent/mm/storage/emotion/EmojiGroupInfo:vCi	I
    //   28: invokevirtual 65	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   31: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   34: astore_3
    //   35: aconst_null
    //   36: astore_2
    //   37: aload_0
    //   38: getfield 50	com/tencent/mm/storage/emotion/a:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   41: ldc_w 618
    //   44: iconst_2
    //   45: anewarray 23	java/lang/String
    //   48: dup
    //   49: iconst_0
    //   50: aload_3
    //   51: aastore
    //   52: dup
    //   53: iconst_1
    //   54: ldc_w 620
    //   57: aastore
    //   58: iconst_2
    //   59: invokeinterface 165 4 0
    //   64: astore 4
    //   66: aload 4
    //   68: ifnull +57 -> 125
    //   71: aload 4
    //   73: astore_2
    //   74: aload 4
    //   76: astore_3
    //   77: aload 4
    //   79: invokeinterface 170 1 0
    //   84: ifeq +41 -> 125
    //   87: aload 4
    //   89: astore_2
    //   90: aload 4
    //   92: astore_3
    //   93: aload 5
    //   95: aload 4
    //   97: iconst_0
    //   98: invokeinterface 552 2 0
    //   103: invokevirtual 334	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   106: pop
    //   107: aload 4
    //   109: astore_2
    //   110: aload 4
    //   112: astore_3
    //   113: aload 4
    //   115: invokeinterface 569 1 0
    //   120: istore_1
    //   121: iload_1
    //   122: ifne -35 -> 87
    //   125: aload 4
    //   127: ifnull +10 -> 137
    //   130: aload 4
    //   132: invokeinterface 177 1 0
    //   137: ldc2_w 615
    //   140: sipush 11621
    //   143: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   146: aload 5
    //   148: areturn
    //   149: astore_3
    //   150: aload_2
    //   151: astore_3
    //   152: ldc -77
    //   154: ldc_w 622
    //   157: iconst_1
    //   158: anewarray 284	java/lang/Object
    //   161: dup
    //   162: iconst_0
    //   163: invokestatic 405	com/tencent/mm/sdk/platformtools/bg:bQW	()Lcom/tencent/mm/sdk/platformtools/ah;
    //   166: aastore
    //   167: invokestatic 344	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   170: aload_2
    //   171: ifnull -34 -> 137
    //   174: aload_2
    //   175: invokeinterface 177 1 0
    //   180: goto -43 -> 137
    //   183: astore_2
    //   184: aconst_null
    //   185: astore_3
    //   186: aload_3
    //   187: ifnull +9 -> 196
    //   190: aload_3
    //   191: invokeinterface 177 1 0
    //   196: aload_2
    //   197: athrow
    //   198: astore_2
    //   199: goto -13 -> 186
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	202	0	this	a
    //   120	2	1	bool	boolean
    //   36	139	2	localObject1	Object
    //   183	14	2	localObject2	Object
    //   198	1	2	localObject3	Object
    //   34	79	3	localObject4	Object
    //   149	1	3	localException	Exception
    //   151	40	3	localObject5	Object
    //   64	67	4	localCursor	Cursor
    //   16	131	5	localArrayList	ArrayList
    // Exception table:
    //   from	to	target	type
    //   37	66	149	java/lang/Exception
    //   77	87	149	java/lang/Exception
    //   93	107	149	java/lang/Exception
    //   113	121	149	java/lang/Exception
    //   37	66	183	finally
    //   77	87	198	finally
    //   93	107	198	finally
    //   113	121	198	finally
    //   152	170	198	finally
  }
  
  public final List<String> bUK()
  {
    GMTrace.i(1559878434816L, 11622);
    ArrayList localArrayList = new ArrayList();
    Object localObject4 = EmojiGroupInfo.vCi;
    Object localObject6 = EmojiGroupInfo.TYPE_SYSTEM;
    Object localObject1 = null;
    try
    {
      localObject6 = this.fTZ.a("select productID from EmojiGroupInfo where sync=? and (type=?  and status=?) or (type=? and flag=?)", new String[] { "0", localObject4, "7", localObject6, "0" }, 2);
      if (localObject6 != null)
      {
        localObject1 = localObject6;
        localObject4 = localObject6;
      }
      boolean bool;
      if (localObject5 == null) {
        break label231;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        try
        {
          if (((Cursor)localObject6).moveToFirst())
          {
            localObject1 = localObject6;
            localObject4 = localObject6;
            localArrayList.add(((Cursor)localObject6).getString(0));
            localObject1 = localObject6;
            localObject4 = localObject6;
            bool = ((Cursor)localObject6).moveToNext();
            if (bool) {
              continue;
            }
          }
          if (localObject6 != null) {
            ((Cursor)localObject6).close();
          }
          GMTrace.o(1559878434816L, 11622);
          return localArrayList;
        }
        finally
        {
          Object localObject5;
          continue;
        }
        localException = localException;
        localObject5 = localObject1;
        w.e("MicroMsg.emoji.EmojiGroupInfoStorage", "getNeedToUploadStoreEmojiProductList. exception.%s", new Object[] { bg.bQW() });
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
      }
    }
    finally
    {
      localObject2 = finally;
      localObject5 = null;
    }
    ((Cursor)localObject5).close();
    label231:
    throw ((Throwable)localObject2);
  }
  
  public final ArrayList<EmojiGroupInfo> bUL()
  {
    GMTrace.i(1560012652544L, 11623);
    ArrayList localArrayList = new ArrayList();
    Object localObject4 = "select * from EmojiGroupInfo where  (type=?  and status=?) or (type=? and flag=?)  order by sort ASC,idx ASC,lastUseTime DESC";
    Object localObject5 = EmojiGroupInfo.vCi;
    String str = EmojiGroupInfo.TYPE_SYSTEM;
    localObject3 = null;
    localObject1 = null;
    try
    {
      localObject4 = this.fTZ.a((String)localObject4, new String[] { localObject5, "7", str, "0" }, 2);
      localObject1 = localObject4;
      localObject3 = localObject4;
      w.v("MicroMsg.emoji.EmojiGroupInfoStorage", "getNewMineGroupList : ===========");
      if (localObject4 != null)
      {
        localObject1 = localObject4;
        localObject3 = localObject4;
        if (((Cursor)localObject4).moveToFirst())
        {
          boolean bool;
          do
          {
            localObject1 = localObject4;
            localObject3 = localObject4;
            localObject5 = new EmojiGroupInfo();
            localObject1 = localObject4;
            localObject3 = localObject4;
            ((EmojiGroupInfo)localObject5).b((Cursor)localObject4);
            localObject1 = localObject4;
            localObject3 = localObject4;
            localArrayList.add(localObject5);
            localObject1 = localObject4;
            localObject3 = localObject4;
            bool = ((Cursor)localObject4).moveToNext();
          } while (bool);
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localObject3 = localObject1;
        w.e("MicroMsg.emoji.EmojiGroupInfoStorage", "get Panel EmojiGroupInfo." + localException.getMessage());
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
      }
    }
    finally
    {
      if (localObject3 == null) {
        break label286;
      }
      ((Cursor)localObject3).close();
    }
    GMTrace.o(1560012652544L, 11623);
    return localArrayList;
  }
  
  public final void bUM()
  {
    GMTrace.i(1560146870272L, 11624);
    w.i("MicroMsg.emoji.EmojiGroupInfoStorage", "recover heart begin");
    EmojiGroupInfo localEmojiGroupInfo = aW(String.valueOf(EmojiGroupInfo.vCm), false);
    if (localEmojiGroupInfo == null) {
      localEmojiGroupInfo = new EmojiGroupInfo();
    }
    for (;;)
    {
      localEmojiGroupInfo.field_productID = String.valueOf(EmojiGroupInfo.vCm);
      localEmojiGroupInfo.field_packName = "emoji_custom_group";
      localEmojiGroupInfo.field_type = EmojiGroupInfo.TYPE_CUSTOM;
      localEmojiGroupInfo.field_status = 0;
      localEmojiGroupInfo.field_packStatus = 1;
      localEmojiGroupInfo.field_flag = 0;
      a(localEmojiGroupInfo);
      w.i("MicroMsg.emoji.EmojiGroupInfoStorage", "recover heart end");
      GMTrace.o(1560146870272L, 11624);
      return;
      w.i("MicroMsg.emoji.EmojiGroupInfoStorage", "EmojiGroupInfo:%s", new Object[] { localEmojiGroupInfo.toString() });
    }
  }
  
  public final boolean bUv()
  {
    boolean bool = true;
    GMTrace.i(1556925644800L, 11600);
    localObject3 = null;
    localObject1 = null;
    try
    {
      Cursor localCursor = this.fTZ.a("select * from EmojiGroupInfo where type=?", new String[] { EmojiGroupInfo.TYPE_SYSTEM }, 2);
      if (localCursor != null)
      {
        localObject1 = localCursor;
        localObject3 = localCursor;
        if (localCursor.moveToFirst())
        {
          localObject1 = localCursor;
          localObject3 = localCursor;
          EmojiGroupInfo localEmojiGroupInfo = new EmojiGroupInfo();
          localObject1 = localCursor;
          localObject3 = localCursor;
          localEmojiGroupInfo.b(localCursor);
          localObject1 = localCursor;
          localObject3 = localCursor;
          int i = localEmojiGroupInfo.field_flag;
          if ((i & 0x100) > 0)
          {
            i = 1;
            if (i != 0) {
              break label161;
            }
          }
          for (;;)
          {
            if (localCursor != null) {
              localCursor.close();
            }
            GMTrace.o(1556925644800L, 11600);
            return bool;
            i = 0;
            break;
            label161:
            bool = false;
          }
        }
      }
      if (localCursor != null) {
        localCursor.close();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localObject3 = localObject1;
        w.d("MicroMsg.emoji.EmojiGroupInfoStorage", localException.toString());
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
      }
    }
    finally
    {
      if (localObject3 == null) {
        break label230;
      }
      ((Cursor)localObject3).close();
    }
    GMTrace.o(1556925644800L, 11600);
    return false;
  }
  
  public final List<EmojiGroupInfo> bUw()
  {
    localObject3 = null;
    localObject1 = null;
    GMTrace.i(1557059862528L, 11601);
    ArrayList localArrayList = new ArrayList();
    Object localObject4 = "select * from EmojiGroupInfo where " + Ay(EmojiGroupInfo.TYPE_SYSTEM) + " or " + Ay(EmojiGroupInfo.TYPE_CUSTOM) + " order by sort ASC";
    try
    {
      localObject4 = this.fTZ.a((String)localObject4, null, 2);
      if (localObject4 != null)
      {
        localObject1 = localObject4;
        localObject3 = localObject4;
        if (((Cursor)localObject4).moveToFirst())
        {
          boolean bool;
          do
          {
            localObject1 = localObject4;
            localObject3 = localObject4;
            EmojiGroupInfo localEmojiGroupInfo = new EmojiGroupInfo();
            localObject1 = localObject4;
            localObject3 = localObject4;
            localEmojiGroupInfo.b((Cursor)localObject4);
            localObject1 = localObject4;
            localObject3 = localObject4;
            localArrayList.add(localEmojiGroupInfo);
            localObject1 = localObject4;
            localObject3 = localObject4;
            bool = ((Cursor)localObject4).moveToNext();
          } while (bool);
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localObject3 = localObject1;
        w.e("MicroMsg.emoji.EmojiGroupInfoStorage", "get system group fail." + localException.getMessage());
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
      }
    }
    finally
    {
      if (localObject3 == null) {
        break label242;
      }
      ((Cursor)localObject3).close();
    }
    GMTrace.o(1557059862528L, 11601);
    return localArrayList;
  }
  
  public final List<EmojiGroupInfo> bUx()
  {
    localObject3 = null;
    localObject1 = null;
    GMTrace.i(1557194080256L, 11602);
    ArrayList localArrayList = new ArrayList();
    Object localObject4 = "select * from EmojiGroupInfo where " + bUF() + " order by sort ASC,lastUseTime DESC";
    try
    {
      localObject4 = this.fTZ.a((String)localObject4, null, 2);
      if (localObject4 != null)
      {
        localObject1 = localObject4;
        localObject3 = localObject4;
        if (((Cursor)localObject4).moveToFirst())
        {
          boolean bool;
          do
          {
            localObject1 = localObject4;
            localObject3 = localObject4;
            EmojiGroupInfo localEmojiGroupInfo = new EmojiGroupInfo();
            localObject1 = localObject4;
            localObject3 = localObject4;
            localEmojiGroupInfo.b((Cursor)localObject4);
            localObject1 = localObject4;
            localObject3 = localObject4;
            localArrayList.add(localEmojiGroupInfo);
            localObject1 = localObject4;
            localObject3 = localObject4;
            bool = ((Cursor)localObject4).moveToNext();
          } while (bool);
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localObject3 = localObject1;
        w.e("MicroMsg.emoji.EmojiGroupInfoStorage", "get all group fail." + localException.getMessage());
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
      }
    }
    finally
    {
      if (localObject3 == null) {
        break label225;
      }
      ((Cursor)localObject3).close();
    }
    GMTrace.o(1557194080256L, 11602);
    return localArrayList;
  }
  
  public final HashMap<String, EmojiGroupInfo> bUy()
  {
    localObject3 = null;
    localObject1 = null;
    GMTrace.i(1557328297984L, 11603);
    HashMap localHashMap = new HashMap();
    Object localObject4 = "select * from EmojiGroupInfo where " + bUF() + " order by sort ASC,lastUseTime DESC";
    try
    {
      localObject4 = this.fTZ.a((String)localObject4, null, 2);
      if (localObject4 != null)
      {
        localObject1 = localObject4;
        localObject3 = localObject4;
        if (((Cursor)localObject4).moveToFirst())
        {
          boolean bool;
          do
          {
            localObject1 = localObject4;
            localObject3 = localObject4;
            EmojiGroupInfo localEmojiGroupInfo = new EmojiGroupInfo();
            localObject1 = localObject4;
            localObject3 = localObject4;
            localEmojiGroupInfo.b((Cursor)localObject4);
            localObject1 = localObject4;
            localObject3 = localObject4;
            localHashMap.put(localEmojiGroupInfo.field_productID, localEmojiGroupInfo);
            localObject1 = localObject4;
            localObject3 = localObject4;
            bool = ((Cursor)localObject4).moveToNext();
          } while (bool);
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localObject3 = localObject1;
        w.e("MicroMsg.emoji.EmojiGroupInfoStorage", "get all group fail." + localException.getMessage());
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
      }
    }
    finally
    {
      if (localObject3 == null) {
        break label228;
      }
      ((Cursor)localObject3).close();
    }
    GMTrace.o(1557328297984L, 11603);
    return localHashMap;
  }
  
  public final ArrayList<EmojiGroupInfo> bUz()
  {
    localObject3 = null;
    localObject1 = null;
    GMTrace.i(1557462515712L, 11604);
    ArrayList localArrayList = new ArrayList();
    Object localObject4 = "select * from EmojiGroupInfo where " + bUG() + " order by sort ASC,lastUseTime DESC";
    try
    {
      localObject4 = this.fTZ.a((String)localObject4, null, 2);
      if (localObject4 != null)
      {
        localObject1 = localObject4;
        localObject3 = localObject4;
        if (((Cursor)localObject4).moveToFirst())
        {
          boolean bool;
          do
          {
            localObject1 = localObject4;
            localObject3 = localObject4;
            EmojiGroupInfo localEmojiGroupInfo = new EmojiGroupInfo();
            localObject1 = localObject4;
            localObject3 = localObject4;
            localEmojiGroupInfo.b((Cursor)localObject4);
            localObject1 = localObject4;
            localObject3 = localObject4;
            localArrayList.add(localEmojiGroupInfo);
            localObject1 = localObject4;
            localObject3 = localObject4;
            bool = ((Cursor)localObject4).moveToNext();
          } while (bool);
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localObject3 = localObject1;
        w.e("MicroMsg.emoji.EmojiGroupInfoStorage", "get all group fail." + localException.getMessage());
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
      }
    }
    finally
    {
      if (localObject3 == null) {
        break label223;
      }
      ((Cursor)localObject3).close();
    }
    GMTrace.o(1557462515712L, 11604);
    return localArrayList;
  }
  
  public final boolean c(EmojiGroupInfo paramEmojiGroupInfo)
  {
    GMTrace.i(1558133604352L, 11609);
    if (paramEmojiGroupInfo == null)
    {
      w.f("MicroMsg.emoji.EmojiGroupInfoStorage", "insert assertion!,invalid emojigroup info.");
      GMTrace.o(1558133604352L, 11609);
      return false;
    }
    paramEmojiGroupInfo.field_lastUseTime = System.currentTimeMillis();
    paramEmojiGroupInfo.field_sort = 1;
    w.d("MicroMsg.emoji.EmojiGroupInfoStorage", "jacks insert: packname: %s, lasttime: %d", new Object[] { paramEmojiGroupInfo.field_packName, Long.valueOf(paramEmojiGroupInfo.field_lastUseTime) });
    paramEmojiGroupInfo.field_lastUseTime = System.currentTimeMillis();
    if (paramEmojiGroupInfo != null) {
      paramEmojiGroupInfo.field_flag &= 0xFEFF;
    }
    boolean bool = a(paramEmojiGroupInfo);
    if (bool) {
      a("event_update_group", 0, bg.bQW().toString());
    }
    GMTrace.o(1558133604352L, 11609);
    return bool;
  }
  
  public final boolean cu(List<EmojiGroupInfo> paramList)
  {
    GMTrace.i(1558267822080L, 11610);
    if ((paramList == null) || (paramList.size() <= 0))
    {
      w.d("MicroMsg.emoji.EmojiGroupInfoStorage", "updateList . list is null.");
      GMTrace.o(1558267822080L, 11610);
      return false;
    }
    g localg;
    long l;
    if ((this.fTZ instanceof g))
    {
      localg = (g)this.fTZ;
      l = localg.cE(Thread.currentThread().getId());
      w.i("MicroMsg.emoji.EmojiGroupInfoStorage", "surround updateList in a transaction, ticket = %d", new Object[] { Long.valueOf(l) });
    }
    for (;;)
    {
      int i = 0;
      while (i < paramList.size())
      {
        EmojiGroupInfo localEmojiGroupInfo = (EmojiGroupInfo)paramList.get(i);
        w.d("MicroMsg.emoji.EmojiGroupInfoStorage", "jacks packname: productid: %s, lasttime: %d, sort: %d", new Object[] { localEmojiGroupInfo.field_productID, Long.valueOf(localEmojiGroupInfo.field_lastUseTime), Integer.valueOf(localEmojiGroupInfo.field_sort) });
        a(localEmojiGroupInfo);
        i += 1;
      }
      if (localg != null)
      {
        localg.aL(l);
        w.i("MicroMsg.emoji.EmojiGroupInfoStorage", "end updateList transaction");
      }
      a("event_update_group", 0, bg.bQW().toString());
      GMTrace.o(1558267822080L, 11610);
      return true;
      localg = null;
      l = -1L;
    }
  }
  
  public final boolean eR(Context paramContext)
  {
    GMTrace.i(1556388773888L, 11596);
    w.i("MicroMsg.emoji.EmojiGroupInfoStorage", "[oneliang]init start.");
    eS(paramContext);
    w.i("MicroMsg.emoji.EmojiGroupInfoStorage", "[oneliang]init end.");
    GMTrace.o(1556388773888L, 11596);
    return true;
  }
  
  public final String getTableName()
  {
    GMTrace.i(1556120338432L, 11594);
    GMTrace.o(1556120338432L, 11594);
    return "EmojiGroupInfo";
  }
  
  public final int vZ(String paramString)
  {
    GMTrace.i(1560281088000L, 11625);
    long l = System.currentTimeMillis();
    Object localObject = null;
    String str = null;
    for (;;)
    {
      try
      {
        paramString = this.fTZ.a("select count(*) from EmojiInfo where groupId= ? and temp=?", new String[] { paramString, "0" }, 2);
        if (paramString == null) {
          break label220;
        }
        str = paramString;
        localObject = paramString;
        if (!paramString.moveToFirst()) {
          break label220;
        }
        str = paramString;
        localObject = paramString;
        i = paramString.getInt(0);
        j = i;
        if (paramString != null)
        {
          paramString.close();
          j = i;
        }
      }
      catch (Exception paramString)
      {
        localObject = str;
        w.e("MicroMsg.emoji.EmojiGroupInfoStorage", "exception:%s", new Object[] { bg.f(paramString) });
        localObject = str;
        w.e("MicroMsg.emoji.EmojiGroupInfoStorage", "[countProductId]Count ProductId fail." + paramString.getMessage());
        if (str == null) {
          break label215;
        }
        str.close();
        j = 0;
        continue;
      }
      finally
      {
        if (localObject == null) {
          continue;
        }
        ((Cursor)localObject).close();
      }
      w.d("MicroMsg.emoji.EmojiGroupInfoStorage", "count product id use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      GMTrace.o(1560281088000L, 11625);
      return j;
      label215:
      int j = 0;
      continue;
      label220:
      int i = 0;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\emotion\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */