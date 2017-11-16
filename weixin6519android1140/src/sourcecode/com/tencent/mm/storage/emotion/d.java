package com.tencent.mm.storage.emotion;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.f;
import com.tencent.mm.bu.f.a;
import com.tencent.mm.bu.g;
import com.tencent.mm.protocal.c.qp;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public final class d
  extends i<EmojiInfo>
  implements f.a
{
  public static final String[] fTX;
  private static int[] vCK;
  public com.tencent.mm.sdk.e.e fTZ;
  
  static
  {
    GMTrace.i(1545785573376L, 11517);
    fTX = new String[] { i.a(EmojiInfo.fTp, "EmojiInfo"), "CREATE INDEX IF NOT EXISTS emojiinfogrouptempindex  on EmojiInfo  (  groupId,temp )" };
    vCK = new int[] { 2, 4, 8 };
    GMTrace.o(1545785573376L, 11517);
  }
  
  public d(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, EmojiInfo.fTp, "EmojiInfo", null);
    GMTrace.i(1540685299712L, 11479);
    this.fTZ = parame;
    GMTrace.o(1540685299712L, 11479);
  }
  
  private int AC(int paramInt)
  {
    j = 0;
    i = 0;
    GMTrace.i(1542430130176L, 11492);
    localObject3 = null;
    localObject1 = null;
    try
    {
      Cursor localCursor = this.fTZ.a("select count(*) from EmojiInfo where groupId= ? and temp=?", new String[] { String.valueOf(paramInt), "0" }, 2);
      paramInt = i;
      if (localCursor != null)
      {
        paramInt = i;
        localObject1 = localCursor;
        localObject3 = localCursor;
        if (localCursor.moveToFirst())
        {
          localObject1 = localCursor;
          localObject3 = localCursor;
          paramInt = localCursor.getInt(0);
        }
      }
      i = paramInt;
      if (localCursor != null)
      {
        localCursor.close();
        i = paramInt;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localObject3 = localObject1;
        w.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", new Object[] { bg.f(localException) });
        localObject3 = localObject1;
        w.e("MicroMsg.emoji.EmojiInfoStorage", "[countProductId]Count ProductId fail." + localException.getMessage());
        i = j;
        if (localObject1 != null)
        {
          ((Cursor)localObject1).close();
          i = j;
        }
      }
    }
    finally
    {
      if (localObject3 == null) {
        break label207;
      }
      ((Cursor)localObject3).close();
    }
    GMTrace.o(1542430130176L, 11492);
    return i;
  }
  
  private boolean AE(int paramInt)
  {
    GMTrace.i(1543369654272L, 11499);
    if (this.fTZ.delete("EmojiInfo", "catalog=?", new String[] { String.valueOf(paramInt) }) >= 0)
    {
      GMTrace.o(1543369654272L, 11499);
      return true;
    }
    GMTrace.o(1543369654272L, 11499);
    return false;
  }
  
  private EmojiInfo a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3, String paramString4, String paramString5, int paramInt4)
  {
    GMTrace.i(1541759041536L, 11487);
    if ((paramString1 == null) || (paramString1.length() <= 0))
    {
      w.f("MicroMsg.emoji.EmojiInfoStorage", "create assertion!, invalid md5");
      GMTrace.o(1541759041536L, 11487);
      return null;
    }
    if ((paramString1 == null) || (paramString1.length() <= 0))
    {
      w.f("MicroMsg.emoji.EmojiInfoStorage", "create assertion!, invalid md5");
      paramString1 = null;
    }
    for (;;)
    {
      paramString1.field_state = EmojiInfo.vCC;
      if (!o(paramString1)) {
        break;
      }
      SS("create_emoji_info_notify");
      GMTrace.o(1541759041536L, 11487);
      return paramString1;
      EmojiInfo localEmojiInfo = UK(paramString1);
      paramString3 = localEmojiInfo;
      if (localEmojiInfo == null)
      {
        com.tencent.mm.plugin.emoji.d.apQ();
        paramString3 = new EmojiInfo(com.tencent.mm.plugin.emoji.d.apR());
        paramString3.field_catalog = paramInt1;
      }
      paramString3.field_md5 = paramString1;
      paramString3.field_svrid = paramString2;
      paramString3.field_type = paramInt2;
      paramString3.field_size = paramInt3;
      paramString3.field_state = EmojiInfo.vCA;
      paramString3.field_reserved1 = null;
      paramString3.field_reserved2 = null;
      paramString3.field_app_id = paramString4;
      paramString3.field_temp = 1;
      paramString3.field_reserved4 = 0;
      paramString1 = paramString3;
      if (!TextUtils.isEmpty(paramString5))
      {
        paramString3.field_groupId = paramString5;
        paramString1 = paramString3;
      }
    }
    GMTrace.o(1541759041536L, 11487);
    return null;
  }
  
  private static List<EmojiInfo> a(InputStream[] paramArrayOfInputStream)
  {
    GMTrace.i(1543638089728L, 11501);
    ArrayList localArrayList = new ArrayList();
    Object localObject = DocumentBuilderFactory.newInstance();
    for (;;)
    {
      int k;
      try
      {
        DocumentBuilder localDocumentBuilder = ((DocumentBuilderFactory)localObject).newDocumentBuilder();
        int i = 0;
        if (i <= 0)
        {
          localObject = paramArrayOfInputStream[i];
          if (localObject != null)
          {
            NodeList localNodeList1 = localDocumentBuilder.parse((InputStream)localObject).getDocumentElement().getElementsByTagName("catalog");
            int j = 0;
            if (j < localNodeList1.getLength())
            {
              localObject = (Element)localNodeList1.item(j);
              int m = Integer.decode(((Element)localObject).getAttribute("id")).intValue();
              NodeList localNodeList2 = ((Element)localObject).getElementsByTagName("emoji");
              k = 0;
              if (k < localNodeList2.getLength())
              {
                com.tencent.mm.plugin.emoji.d.apQ();
                EmojiInfo localEmojiInfo = new EmojiInfo(com.tencent.mm.plugin.emoji.d.apR());
                localObject = (Element)localNodeList2.item(k);
                localEmojiInfo.field_md5 = ((Element)localObject).getAttribute("md5");
                if (!localEmojiInfo.bUS()) {
                  break label379;
                }
                localEmojiInfo.field_catalog = m;
                localEmojiInfo.field_groupId = String.valueOf(m);
                localEmojiInfo.field_name = ((Element)localObject).getAttribute("name");
                localEmojiInfo.field_type = Integer.decode(((Element)localObject).getAttribute("type")).intValue();
                localObject = ((Element)localObject).getFirstChild();
                if ((localObject instanceof CharacterData))
                {
                  localObject = ((CharacterData)localObject).getData();
                  if (localEmojiInfo.field_type != EmojiInfo.TYPE_TEXT) {
                    break label376;
                  }
                  localObject = new String(Base64.decode((String)localObject, 0));
                  localEmojiInfo.field_content = ((String)localObject);
                  localArrayList.add(localEmojiInfo);
                  break label379;
                }
                localObject = "";
                continue;
              }
              j += 1;
              continue;
            }
          }
          i += 1;
        }
        continue;
      }
      catch (Exception paramArrayOfInputStream)
      {
        w.e("MicroMsg.emoji.EmojiInfoStorage", "parse xml error; " + paramArrayOfInputStream.getMessage());
        GMTrace.o(1543638089728L, 11501);
        return localArrayList;
      }
      label376:
      label379:
      k += 1;
    }
  }
  
  public final Cursor AD(int paramInt)
  {
    GMTrace.i(1543235436544L, 11498);
    Cursor localCursor = this.fTZ.query("EmojiInfo", null, "catalog=? and temp=?", new String[] { String.valueOf(paramInt), "0" }, null, null, null);
    GMTrace.o(1543235436544L, 11498);
    return localCursor;
  }
  
  /* Error */
  public final EmojiInfo UK(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 340
    //   3: sipush 11491
    //   6: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: invokestatic 345	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   13: ifne +12 -> 25
    //   16: aload_1
    //   17: invokevirtual 143	java/lang/String:length	()I
    //   20: bipush 32
    //   22: if_icmpeq +30 -> 52
    //   25: ldc 89
    //   27: ldc_w 347
    //   30: iconst_1
    //   31: anewarray 93	java/lang/Object
    //   34: dup
    //   35: iconst_0
    //   36: aload_1
    //   37: aastore
    //   38: invokestatic 349	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   41: ldc2_w 340
    //   44: sipush 11491
    //   47: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   50: aconst_null
    //   51: areturn
    //   52: aload_0
    //   53: getfield 56	com/tencent/mm/storage/emotion/d:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   56: ldc 33
    //   58: aconst_null
    //   59: ldc_w 351
    //   62: iconst_1
    //   63: anewarray 25	java/lang/String
    //   66: dup
    //   67: iconst_0
    //   68: aload_1
    //   69: aastore
    //   70: aconst_null
    //   71: aconst_null
    //   72: aconst_null
    //   73: iconst_2
    //   74: invokeinterface 354 9 0
    //   79: astore_1
    //   80: aload_1
    //   81: ifnull +147 -> 228
    //   84: aload_1
    //   85: invokeinterface 81 1 0
    //   90: ifeq +138 -> 228
    //   93: invokestatic 172	com/tencent/mm/plugin/emoji/d:apQ	()Lcom/tencent/mm/plugin/emoji/d;
    //   96: pop
    //   97: new 27	com/tencent/mm/storage/emotion/EmojiInfo
    //   100: dup
    //   101: invokestatic 175	com/tencent/mm/plugin/emoji/d:apR	()Ljava/lang/String;
    //   104: invokespecial 176	com/tencent/mm/storage/emotion/EmojiInfo:<init>	(Ljava/lang/String;)V
    //   107: astore_3
    //   108: aload_3
    //   109: aload_1
    //   110: invokevirtual 358	com/tencent/mm/storage/emotion/EmojiInfo:b	(Landroid/database/Cursor;)V
    //   113: aload_3
    //   114: astore_2
    //   115: aload_2
    //   116: astore_3
    //   117: aload_1
    //   118: ifnull +11 -> 129
    //   121: aload_1
    //   122: invokeinterface 87 1 0
    //   127: aload_2
    //   128: astore_3
    //   129: ldc2_w 340
    //   132: sipush 11491
    //   135: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   138: aload_3
    //   139: areturn
    //   140: astore_3
    //   141: aconst_null
    //   142: astore_2
    //   143: aconst_null
    //   144: astore_1
    //   145: ldc 89
    //   147: ldc_w 360
    //   150: iconst_1
    //   151: anewarray 93	java/lang/Object
    //   154: dup
    //   155: iconst_0
    //   156: aload_3
    //   157: invokevirtual 361	java/lang/Exception:toString	()Ljava/lang/String;
    //   160: aastore
    //   161: invokestatic 105	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   164: aload_1
    //   165: astore_3
    //   166: aload_2
    //   167: ifnull -38 -> 129
    //   170: aload_2
    //   171: invokeinterface 87 1 0
    //   176: aload_1
    //   177: astore_3
    //   178: goto -49 -> 129
    //   181: astore_2
    //   182: aconst_null
    //   183: astore_1
    //   184: aload_1
    //   185: ifnull +9 -> 194
    //   188: aload_1
    //   189: invokeinterface 87 1 0
    //   194: aload_2
    //   195: athrow
    //   196: astore_2
    //   197: goto -13 -> 184
    //   200: astore_3
    //   201: aload_2
    //   202: astore_1
    //   203: aload_3
    //   204: astore_2
    //   205: goto -21 -> 184
    //   208: astore_3
    //   209: aload_1
    //   210: astore_2
    //   211: aconst_null
    //   212: astore_1
    //   213: goto -68 -> 145
    //   216: astore 4
    //   218: aload_1
    //   219: astore_2
    //   220: aload_3
    //   221: astore_1
    //   222: aload 4
    //   224: astore_3
    //   225: goto -80 -> 145
    //   228: aconst_null
    //   229: astore_2
    //   230: goto -115 -> 115
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	233	0	this	d
    //   0	233	1	paramString	String
    //   114	57	2	localObject1	Object
    //   181	14	2	localObject2	Object
    //   196	6	2	localObject3	Object
    //   204	26	2	localObject4	Object
    //   107	32	3	localObject5	Object
    //   140	17	3	localException1	Exception
    //   165	13	3	str	String
    //   200	4	3	localObject6	Object
    //   208	13	3	localException2	Exception
    //   224	1	3	localObject7	Object
    //   216	7	4	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   52	80	140	java/lang/Exception
    //   52	80	181	finally
    //   84	108	196	finally
    //   108	113	196	finally
    //   145	164	200	finally
    //   84	108	208	java/lang/Exception
    //   108	113	216	java/lang/Exception
  }
  
  /* Error */
  public final EmojiInfo UL(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore_2
    //   4: ldc2_w 363
    //   7: sipush 11502
    //   10: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   13: aload_0
    //   14: getfield 56	com/tencent/mm/storage/emotion/d:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   17: ldc_w 366
    //   20: iconst_2
    //   21: anewarray 25	java/lang/String
    //   24: dup
    //   25: iconst_0
    //   26: aload_1
    //   27: aastore
    //   28: dup
    //   29: iconst_1
    //   30: ldc 70
    //   32: aastore
    //   33: iconst_2
    //   34: invokeinterface 75 4 0
    //   39: astore_1
    //   40: aload_1
    //   41: invokeinterface 81 1 0
    //   46: ifeq +140 -> 186
    //   49: invokestatic 172	com/tencent/mm/plugin/emoji/d:apQ	()Lcom/tencent/mm/plugin/emoji/d;
    //   52: pop
    //   53: new 27	com/tencent/mm/storage/emotion/EmojiInfo
    //   56: dup
    //   57: invokestatic 175	com/tencent/mm/plugin/emoji/d:apR	()Ljava/lang/String;
    //   60: invokespecial 176	com/tencent/mm/storage/emotion/EmojiInfo:<init>	(Ljava/lang/String;)V
    //   63: astore_3
    //   64: aload_3
    //   65: aload_1
    //   66: invokevirtual 358	com/tencent/mm/storage/emotion/EmojiInfo:b	(Landroid/database/Cursor;)V
    //   69: aload_3
    //   70: astore_2
    //   71: aload_2
    //   72: astore_3
    //   73: aload_1
    //   74: ifnull +11 -> 85
    //   77: aload_1
    //   78: invokeinterface 87 1 0
    //   83: aload_2
    //   84: astore_3
    //   85: ldc2_w 363
    //   88: sipush 11502
    //   91: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   94: aload_3
    //   95: areturn
    //   96: astore 4
    //   98: aconst_null
    //   99: astore_1
    //   100: aload_2
    //   101: astore_3
    //   102: ldc 89
    //   104: new 107	java/lang/StringBuilder
    //   107: dup
    //   108: ldc_w 368
    //   111: invokespecial 112	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   114: aload 4
    //   116: invokevirtual 116	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   119: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   125: invokestatic 126	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   128: aload_1
    //   129: astore_3
    //   130: aload_2
    //   131: ifnull -46 -> 85
    //   134: aload_2
    //   135: invokeinterface 87 1 0
    //   140: aload_1
    //   141: astore_3
    //   142: goto -57 -> 85
    //   145: astore_1
    //   146: aload_3
    //   147: ifnull +9 -> 156
    //   150: aload_3
    //   151: invokeinterface 87 1 0
    //   156: aload_1
    //   157: athrow
    //   158: astore_2
    //   159: aload_1
    //   160: astore_3
    //   161: aload_2
    //   162: astore_1
    //   163: goto -17 -> 146
    //   166: astore 4
    //   168: aconst_null
    //   169: astore_3
    //   170: aload_1
    //   171: astore_2
    //   172: aload_3
    //   173: astore_1
    //   174: goto -74 -> 100
    //   177: astore 4
    //   179: aload_1
    //   180: astore_2
    //   181: aload_3
    //   182: astore_1
    //   183: goto -83 -> 100
    //   186: aconst_null
    //   187: astore_2
    //   188: goto -117 -> 71
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	191	0	this	d
    //   0	191	1	paramString	String
    //   3	132	2	localObject1	Object
    //   158	4	2	localObject2	Object
    //   171	17	2	str	String
    //   1	181	3	localObject3	Object
    //   96	19	4	localException1	Exception
    //   166	1	4	localException2	Exception
    //   177	1	4	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   13	40	96	java/lang/Exception
    //   13	40	145	finally
    //   102	128	145	finally
    //   40	64	158	finally
    //   64	69	158	finally
    //   40	64	166	java/lang/Exception
    //   64	69	177	java/lang/Exception
  }
  
  public final boolean UM(String paramString)
  {
    GMTrace.i(1544443396096L, 11507);
    if (!TextUtils.isEmpty(paramString))
    {
      paramString = "groupId = '" + paramString + "'";
      try
      {
        if (this.fTZ.delete("EmojiInfo", paramString, null) >= 0)
        {
          GMTrace.o(1544443396096L, 11507);
          return true;
        }
        GMTrace.o(1544443396096L, 11507);
        return false;
      }
      catch (Exception paramString)
      {
        w.i("MicroMsg.emoji.EmojiInfoStorage", "Delete By ProductId fail." + paramString.getMessage());
      }
    }
    GMTrace.o(1544443396096L, 11507);
    return false;
  }
  
  public final int a(f paramf)
  {
    GMTrace.i(1540953735168L, 11481);
    if (paramf != null) {
      this.fTZ = paramf;
    }
    GMTrace.o(1540953735168L, 11481);
    return 0;
  }
  
  public final EmojiInfo a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3, String paramString4)
  {
    GMTrace.i(1541624823808L, 11486);
    paramString1 = a(paramString1, paramString2, paramInt1, paramInt2, paramInt3, null, paramString3, paramString4, 1);
    GMTrace.o(1541624823808L, 11486);
    return paramString1;
  }
  
  public final void a(Context paramContext, EmojiInfo paramEmojiInfo)
  {
    GMTrace.i(1543503872000L, 11500);
    Object localObject;
    Context localContext;
    if ((paramEmojiInfo.field_catalog == EmojiInfo.vCq) || (paramEmojiInfo.field_catalog == EmojiInfo.vCt) || (paramEmojiInfo.field_catalog == EmojiInfo.vCs))
    {
      localObject = null;
      localContext = null;
    }
    for (;;)
    {
      try
      {
        paramContext = EmojiInfo.bd(paramContext, paramEmojiInfo.getName());
        if (paramContext == null) {
          break label275;
        }
        localContext = paramContext;
        localObject = paramContext;
        j = paramContext.available();
        i = j;
      }
      catch (IOException paramContext)
      {
        localObject = localContext;
        w.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", new Object[] { bg.f(paramContext) });
        if (localContext == null) {
          break label270;
        }
        try
        {
          localContext.close();
          i = 0;
        }
        catch (IOException paramContext)
        {
          w.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", new Object[] { bg.f(paramContext) });
          i = 0;
        }
        continue;
      }
      finally
      {
        if (localObject == null) {
          break label215;
        }
      }
      try
      {
        paramContext.close();
        i = j;
      }
      catch (IOException paramContext)
      {
        w.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", new Object[] { bg.f(paramContext) });
        i = j;
        continue;
      }
      if ((i != 0) && (i != paramEmojiInfo.field_size))
      {
        paramEmojiInfo.field_size = i;
        p(paramEmojiInfo);
      }
      GMTrace.o(1543503872000L, 11500);
      return;
      try
      {
        ((InputStream)localObject).close();
        label215:
        throw paramContext;
      }
      catch (IOException paramEmojiInfo)
      {
        for (;;)
        {
          w.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", new Object[] { bg.f(paramEmojiInfo) });
        }
      }
      int i = com.tencent.mm.a.e.aY(paramEmojiInfo.nSe + paramEmojiInfo.GS());
      continue;
      label270:
      i = 0;
      continue;
      label275:
      int j = 0;
    }
  }
  
  public final boolean ax(LinkedList<String> paramLinkedList)
  {
    GMTrace.i(1544846049280L, 11510);
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      w.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] updateNeedUploadEmojiList failed. list is null");
      GMTrace.o(1544846049280L, 11510);
      return false;
    }
    w.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] updateNeedUploadEmojiList list size :%d.", new Object[] { Integer.valueOf(paramLinkedList.size()) });
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("UPDATE");
    localStringBuilder.append(" EmojiInfo ");
    localStringBuilder.append(" SET ");
    localStringBuilder.append("needupload");
    localStringBuilder.append("=");
    localStringBuilder.append(EmojiInfo.vCI);
    localStringBuilder.append(" where ");
    localStringBuilder.append("md5");
    localStringBuilder.append(" IN (");
    int i = 0;
    while (i < paramLinkedList.size())
    {
      localStringBuilder.append("'" + (String)paramLinkedList.get(i) + "'");
      if (i < paramLinkedList.size() - 1) {
        localStringBuilder.append(",");
      }
      i += 1;
    }
    localStringBuilder.append(")");
    w.d("MicroMsg.emoji.EmojiInfoStorage", localStringBuilder.toString());
    boolean bool = this.fTZ.eZ("EmojiInfo", localStringBuilder.toString());
    GMTrace.o(1544846049280L, 11510);
    return bool;
  }
  
  public final EmojiInfo b(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3)
  {
    GMTrace.i(1541356388352L, 11484);
    paramString1 = a(paramString1, paramString2, paramInt1, paramInt2, paramInt3, null, null, paramString3, 1);
    GMTrace.o(1541356388352L, 11484);
    return paramString1;
  }
  
  public final List<EmojiInfo> bUV()
  {
    GMTrace.i(1542832783360L, 11495);
    ArrayList localArrayList = new ArrayList();
    int i = EmojiGroupInfo.vCm;
    int j = EmojiGroupInfo.vCn;
    int k = EmojiInfo.vCD;
    Cursor localCursor = this.fTZ.a("select  * from EmojiInfo where catalog=?  or catalog=? and state!=? order by reserved3 asc", new String[] { String.valueOf(i), String.valueOf(j), String.valueOf(k) }, 2);
    if (localCursor.moveToFirst()) {
      do
      {
        com.tencent.mm.plugin.emoji.d.apQ();
        EmojiInfo localEmojiInfo = new EmojiInfo(com.tencent.mm.plugin.emoji.d.apR());
        localEmojiInfo.b(localCursor);
        localArrayList.add(localEmojiInfo);
      } while (localCursor.moveToNext());
    }
    localCursor.close();
    GMTrace.o(1542832783360L, 11495);
    return localArrayList;
  }
  
  public final List<String> bUW()
  {
    GMTrace.i(1542967001088L, 11496);
    ArrayList localArrayList = new ArrayList();
    localObject3 = null;
    localObject1 = null;
    Object localObject4 = EmojiGroupInfo.vCn;
    try
    {
      localObject4 = this.fTZ.a("select md5 from EmojiInfo where catalog=?  order by reserved3 asc", new String[] { localObject4 }, 2);
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
            localArrayList.add(((Cursor)localObject4).getString(0));
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
        w.e("MicroMsg.emoji.EmojiInfoStorage", "get download custom emoji MD5 list failed :%s", new Object[] { bg.f(localException) });
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
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
    GMTrace.o(1542967001088L, 11496);
    return localArrayList;
  }
  
  public final List<String> bUX()
  {
    GMTrace.i(1543101218816L, 11497);
    ArrayList localArrayList = new ArrayList();
    localObject3 = null;
    localObject1 = null;
    Object localObject4 = EmojiGroupInfo.vCn;
    String str = EmojiInfo.vCG;
    try
    {
      localObject4 = this.fTZ.a("select md5 from EmojiInfo where catalog=? and source=?", new String[] { localObject4, str }, 2);
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
            localArrayList.add(((Cursor)localObject4).getString(0));
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
        w.e("MicroMsg.emoji.EmojiInfoStorage", "get download custom emoji MD5 list failed :%s", new Object[] { bg.f(localException) });
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
      }
    }
    finally
    {
      if (localObject3 == null) {
        break label220;
      }
      ((Cursor)localObject3).close();
    }
    GMTrace.o(1543101218816L, 11497);
    return localArrayList;
  }
  
  public final List<String> bUY()
  {
    GMTrace.i(1544577613824L, 11508);
    ArrayList localArrayList = new ArrayList();
    localObject3 = null;
    localObject1 = null;
    try
    {
      Cursor localCursor = this.fTZ.a("select md5 from EmojiInfo where catalog=? or temp=?", new String[] { "85", "2" }, 2);
      if (localCursor != null)
      {
        localObject1 = localCursor;
        localObject3 = localCursor;
        if (localCursor.moveToFirst())
        {
          boolean bool;
          do
          {
            localObject1 = localCursor;
            localObject3 = localCursor;
            localArrayList.add(localCursor.getString(0));
            localObject1 = localCursor;
            localObject3 = localCursor;
            bool = localCursor.moveToNext();
          } while (bool);
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
        w.e("MicroMsg.emoji.EmojiInfoStorage", "get need to sync emoji MD5 list failed :%s", new Object[] { bg.f(localException) });
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
      }
    }
    finally
    {
      if (localObject3 == null) {
        break label186;
      }
      ((Cursor)localObject3).close();
    }
    GMTrace.o(1544577613824L, 11508);
    return localArrayList;
  }
  
  public final int bUZ()
  {
    k = 0;
    j = 0;
    GMTrace.i(1544711831552L, 11509);
    localObject3 = null;
    localObject1 = null;
    try
    {
      Cursor localCursor = this.fTZ.rawQuery("select md5 from EmojiInfo where catalog=? or temp=?", new String[] { "85", "2" });
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
          i = localCursor.getCount();
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
        w.e("MicroMsg.emoji.EmojiInfoStorage", "get need to sync emoji MD5 list failed :%s", new Object[] { bg.f(localException) });
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
        break label178;
      }
      ((Cursor)localObject3).close();
    }
    GMTrace.o(1544711831552L, 11509);
    return j;
  }
  
  public final ArrayList<String> bVa()
  {
    GMTrace.i(1544980267008L, 11511);
    ArrayList localArrayList = new ArrayList();
    localObject3 = null;
    localObject1 = null;
    int i = EmojiInfo.vCI;
    int j = EmojiGroupInfo.vCn;
    try
    {
      Cursor localCursor = this.fTZ.a("select md5 from EmojiInfo where needupload=? and catalog=?", new String[] { String.valueOf(i), String.valueOf(j) }, 2);
      if (localCursor != null)
      {
        localObject1 = localCursor;
        localObject3 = localCursor;
        if (localCursor.moveToFirst())
        {
          boolean bool;
          do
          {
            localObject1 = localCursor;
            localObject3 = localCursor;
            localArrayList.add(localCursor.getString(0));
            localObject1 = localCursor;
            localObject3 = localCursor;
            bool = localCursor.moveToNext();
          } while (bool);
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
        w.e("MicroMsg.emoji.EmojiInfoStorage", "get need upload emoji MD5 list failed :%s", new Object[] { bg.f(localException) });
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
      }
    }
    finally
    {
      if (localObject3 == null) {
        break label209;
      }
      ((Cursor)localObject3).close();
    }
    GMTrace.o(1544980267008L, 11511);
    return localArrayList;
  }
  
  public final int bVb()
  {
    k = 0;
    j = 0;
    GMTrace.i(1545114484736L, 11512);
    localObject3 = null;
    localObject1 = null;
    int i = EmojiGroupInfo.vCn;
    try
    {
      Cursor localCursor = this.fTZ.a("select reserved3 from EmojiInfo where catalog=? order by reserved3 desc limit 1", new String[] { String.valueOf(i) }, 2);
      i = j;
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
        w.e("MicroMsg.emoji.EmojiInfoStorage", "getCustomEmojiMaxIndex :%s", new Object[] { bg.f(localException) });
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
        break label179;
      }
      ((Cursor)localObject3).close();
    }
    GMTrace.o(1545114484736L, 11512);
    return j;
  }
  
  public final ArrayList<EmojiInfo> bVc()
  {
    GMTrace.i(1545248702464L, 11513);
    localObject3 = null;
    localObject1 = null;
    int i = EmojiGroupInfo.vCn;
    int j = EmojiGroupInfo.vCo;
    try
    {
      Cursor localCursor = this.fTZ.a("SELECT * FROM EmojiInfo WHERE catalog =?  OR catalog=? OR groupId IS NOT NULL", new String[] { String.valueOf(i), String.valueOf(j) }, 2);
      if (localCursor != null)
      {
        localObject1 = localCursor;
        localObject3 = localCursor;
        if (localCursor.moveToFirst())
        {
          localObject1 = localCursor;
          localObject3 = localCursor;
          ArrayList localArrayList = new ArrayList();
          boolean bool;
          do
          {
            localObject1 = localCursor;
            localObject3 = localCursor;
            EmojiInfo localEmojiInfo = new EmojiInfo();
            localObject1 = localCursor;
            localObject3 = localCursor;
            localEmojiInfo.b(localCursor);
            localObject1 = localCursor;
            localObject3 = localCursor;
            if ((localEmojiInfo.field_reserved4 & EmojiInfo.vCJ) != EmojiInfo.vCJ)
            {
              localObject1 = localCursor;
              localObject3 = localCursor;
              localArrayList.add(localEmojiInfo);
            }
            localObject1 = localCursor;
            localObject3 = localCursor;
            bool = localCursor.moveToNext();
          } while (bool);
          if (localCursor != null) {
            localCursor.close();
          }
          GMTrace.o(1545248702464L, 11513);
          return localArrayList;
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
        w.e("MicroMsg.emoji.EmojiInfoStorage", "getAllStoreAndCustomEmoji :%s", new Object[] { bg.f(localException) });
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
      }
    }
    finally
    {
      if (localObject3 == null) {
        break label289;
      }
      ((Cursor)localObject3).close();
    }
    GMTrace.o(1545248702464L, 11513);
    return null;
  }
  
  public final EmojiInfo c(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3)
  {
    GMTrace.i(1541490606080L, 11485);
    paramString1 = a(paramString1, paramString2, paramInt1, paramInt2, paramInt3, null, null, paramString3, 1);
    GMTrace.o(1541490606080L, 11485);
    return paramString1;
  }
  
  public final boolean cv(List<String> paramList)
  {
    GMTrace.i(1544040742912L, 11504);
    if ((paramList == null) || (paramList.size() <= 0))
    {
      GMTrace.o(1544040742912L, 11504);
      return false;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("UPDATE");
    localStringBuilder.append(" EmojiInfo ");
    localStringBuilder.append(" SET ");
    localStringBuilder.append("catalog");
    localStringBuilder.append("=");
    localStringBuilder.append(EmojiInfo.vCo);
    localStringBuilder.append(",");
    localStringBuilder.append("source");
    localStringBuilder.append("=");
    localStringBuilder.append(EmojiInfo.vCF);
    localStringBuilder.append(",");
    localStringBuilder.append("needupload");
    localStringBuilder.append("=");
    localStringBuilder.append(EmojiInfo.vCH);
    localStringBuilder.append(" where ");
    localStringBuilder.append("md5");
    localStringBuilder.append(" IN (");
    int i = 0;
    while (i < paramList.size())
    {
      localStringBuilder.append("'" + (String)paramList.get(i) + "'");
      if (i < paramList.size() - 1) {
        localStringBuilder.append(",");
      }
      i += 1;
    }
    localStringBuilder.append(")");
    w.d("MicroMsg.emoji.EmojiInfoStorage", localStringBuilder.toString());
    if (this.fTZ.eZ("EmojiInfo", localStringBuilder.toString())) {
      SS("delete_emoji_info_notify");
    }
    GMTrace.o(1544040742912L, 11504);
    return true;
  }
  
  public final boolean cw(List<String> paramList)
  {
    GMTrace.i(1544174960640L, 11505);
    w.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] begin topCustomEmojiByMd5");
    long l2 = System.currentTimeMillis();
    if ((paramList == null) || (paramList.size() <= 0))
    {
      w.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] topCustomEmojiByMd5 failed. list is null");
      GMTrace.o(1544174960640L, 11505);
      return false;
    }
    Object localObject1 = bUW();
    g localg;
    if ((this.fTZ instanceof g)) {
      localg = (g)this.fTZ;
    }
    for (long l1 = localg.cE(Thread.currentThread().getId());; l1 = -1L)
    {
      Object localObject2 = paramList.iterator();
      int j;
      for (int i = 1; ((Iterator)localObject2).hasNext(); i = j)
      {
        Object localObject3 = (String)((Iterator)localObject2).next();
        EmojiInfo localEmojiInfo = UK((String)localObject3);
        j = i;
        if (localEmojiInfo != null)
        {
          j = i;
          if (!bg.nm(localEmojiInfo.GS()))
          {
            localEmojiInfo.field_reserved3 = i;
            if (!((List)localObject1).isEmpty()) {
              ((List)localObject1).remove(localObject3);
            }
            j = i + 1;
            localObject3 = localEmojiInfo.qL();
            if (this.fTZ.replace("EmojiInfo", "md5", (ContentValues)localObject3) < 0L)
            {
              if (localg != null) {
                localg.aL(l1);
              }
              w.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] end topCustomEmojiByMd5 user time:%d faild ", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
              GMTrace.o(1544174960640L, 11505);
              return false;
            }
          }
        }
      }
      if (!((List)localObject1).isEmpty())
      {
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = UK((String)((Iterator)localObject1).next());
          if ((localObject2 != null) && (!bg.nm(((EmojiInfo)localObject2).GS())))
          {
            ((EmojiInfo)localObject2).field_reserved3 = i;
            i += 1;
            localObject2 = ((EmojiInfo)localObject2).qL();
            if (this.fTZ.replace("EmojiInfo", "md5", (ContentValues)localObject2) < 0L)
            {
              if (localg != null) {
                localg.aL(l1);
              }
              w.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] end topCustomEmojiByMd5 user time:%d faild ", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
              GMTrace.o(1544174960640L, 11505);
              return false;
            }
          }
        }
      }
      if (localg != null) {
        localg.aL(l1);
      }
      l1 = System.currentTimeMillis();
      if (paramList == null) {}
      for (i = 0;; i = paramList.size())
      {
        w.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] end topCustomEmojiByMd5 user time:%d succes. size:%d", new Object[] { Long.valueOf(l1 - l2), Integer.valueOf(i) });
        GMTrace.o(1544174960640L, 11505);
        return true;
      }
      localg = null;
    }
  }
  
  public final boolean cx(List<qp> paramList)
  {
    int i = 0;
    GMTrace.i(1545517137920L, 11515);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      w.i("MicroMsg.emoji.EmojiInfoStorage", "updateEmojiURL failed. empty list");
      GMTrace.o(1545517137920L, 11515);
      return false;
    }
    w.i("MicroMsg.emoji.EmojiInfoStorage", "updateEmojiURL size:%d", new Object[] { Integer.valueOf(paramList.size()) });
    g localg;
    long l;
    if ((this.fTZ instanceof g))
    {
      localg = (g)this.fTZ;
      l = localg.cE(Thread.currentThread().getId());
      w.i("MicroMsg.emoji.EmojiInfoStorage", "surround updateEmojiURL in a transaction, ticket = %d", new Object[] { Long.valueOf(l) });
    }
    for (;;)
    {
      if (i < paramList.size())
      {
        qp localqp = (qp)paramList.get(i);
        EmojiInfo localEmojiInfo2 = UK(localqp.ugy);
        EmojiInfo localEmojiInfo1 = localEmojiInfo2;
        if (localEmojiInfo2 == null)
        {
          localEmojiInfo1 = new EmojiInfo();
          localEmojiInfo1.field_md5 = localqp.ugy;
          localEmojiInfo1.field_catalog = EmojiInfo.vCo;
          w.i("MicroMsg.emoji.EmojiInfoStorage", "new emoji as received when updateEmoji url");
        }
        localEmojiInfo1.field_cdnUrl = localqp.lPM;
        localEmojiInfo1.field_encrypturl = localqp.ugA;
        localEmojiInfo1.field_aeskey = localqp.ugB;
        localEmojiInfo1.field_designerID = localqp.ugz;
        localEmojiInfo1.field_thumbUrl = localqp.nFH;
        localEmojiInfo1.field_groupId = localqp.tRS;
        p(localEmojiInfo1);
        i += 1;
      }
      else
      {
        if (localg != null)
        {
          localg.aL(l);
          w.i("MicroMsg.emoji.EmojiInfoStorage", "end updateList transaction");
        }
        GMTrace.o(1545517137920L, 11515);
        return true;
        localg = null;
        l = -1L;
      }
    }
  }
  
  /* Error */
  public final boolean eR(Context paramContext)
  {
    // Byte code:
    //   0: ldc2_w 731
    //   3: sipush 11482
    //   6: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: ldc 89
    //   11: ldc_w 734
    //   14: invokestatic 379	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   17: aload_0
    //   18: ldc_w 736
    //   21: invokevirtual 166	com/tencent/mm/storage/emotion/d:UK	(Ljava/lang/String;)Lcom/tencent/mm/storage/emotion/EmojiInfo;
    //   24: astore 7
    //   26: aload_0
    //   27: ldc_w 738
    //   30: invokevirtual 166	com/tencent/mm/storage/emotion/d:UK	(Ljava/lang/String;)Lcom/tencent/mm/storage/emotion/EmojiInfo;
    //   33: astore 8
    //   35: aload_0
    //   36: getstatic 741	com/tencent/mm/storage/emotion/EmojiInfo:vCr	I
    //   39: invokespecial 743	com/tencent/mm/storage/emotion/d:AC	(I)I
    //   42: istore_2
    //   43: ldc 89
    //   45: ldc_w 745
    //   48: iconst_1
    //   49: anewarray 93	java/lang/Object
    //   52: dup
    //   53: iconst_0
    //   54: iload_2
    //   55: invokestatic 446	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   58: aastore
    //   59: invokestatic 349	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   62: aload 7
    //   64: ifnonnull +24 -> 88
    //   67: aload 8
    //   69: ifnull +14 -> 83
    //   72: aload 8
    //   74: invokevirtual 748	com/tencent/mm/storage/emotion/EmojiInfo:rc	()Ljava/lang/String;
    //   77: invokevirtual 143	java/lang/String:length	()I
    //   80: ifeq +8 -> 88
    //   83: iload_2
    //   84: iconst_2
    //   85: if_icmpgt +35 -> 120
    //   88: ldc 89
    //   90: ldc_w 750
    //   93: invokestatic 379	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   96: aload_0
    //   97: getstatic 395	com/tencent/mm/storage/emotion/EmojiInfo:vCq	I
    //   100: invokespecial 752	com/tencent/mm/storage/emotion/d:AE	(I)Z
    //   103: pop
    //   104: aload_0
    //   105: getstatic 398	com/tencent/mm/storage/emotion/EmojiInfo:vCt	I
    //   108: invokespecial 752	com/tencent/mm/storage/emotion/d:AE	(I)Z
    //   111: pop
    //   112: aload_0
    //   113: getstatic 401	com/tencent/mm/storage/emotion/EmojiInfo:vCs	I
    //   116: invokespecial 752	com/tencent/mm/storage/emotion/d:AE	(I)Z
    //   119: pop
    //   120: aload_0
    //   121: ldc_w 754
    //   124: invokevirtual 166	com/tencent/mm/storage/emotion/d:UK	(Ljava/lang/String;)Lcom/tencent/mm/storage/emotion/EmojiInfo;
    //   127: astore 7
    //   129: aload 7
    //   131: ifnull +46 -> 177
    //   134: aload 7
    //   136: getfield 179	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   139: getstatic 395	com/tencent/mm/storage/emotion/EmojiInfo:vCq	I
    //   142: if_icmpne +35 -> 177
    //   145: ldc 89
    //   147: ldc_w 756
    //   150: invokestatic 379	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   153: aload_0
    //   154: getstatic 395	com/tencent/mm/storage/emotion/EmojiInfo:vCq	I
    //   157: invokespecial 752	com/tencent/mm/storage/emotion/d:AE	(I)Z
    //   160: pop
    //   161: aload_0
    //   162: getstatic 398	com/tencent/mm/storage/emotion/EmojiInfo:vCt	I
    //   165: invokespecial 752	com/tencent/mm/storage/emotion/d:AE	(I)Z
    //   168: pop
    //   169: aload_0
    //   170: getstatic 401	com/tencent/mm/storage/emotion/EmojiInfo:vCs	I
    //   173: invokespecial 752	com/tencent/mm/storage/emotion/d:AE	(I)Z
    //   176: pop
    //   177: aload_1
    //   178: ldc_w 758
    //   181: invokestatic 408	com/tencent/mm/storage/emotion/EmojiInfo:bd	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    //   184: astore 7
    //   186: aload 7
    //   188: ifnull +35 -> 223
    //   191: ldc 89
    //   193: ldc_w 760
    //   196: invokestatic 379	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   199: aload_0
    //   200: getstatic 395	com/tencent/mm/storage/emotion/EmojiInfo:vCq	I
    //   203: invokespecial 752	com/tencent/mm/storage/emotion/d:AE	(I)Z
    //   206: pop
    //   207: aload_0
    //   208: getstatic 398	com/tencent/mm/storage/emotion/EmojiInfo:vCt	I
    //   211: invokespecial 752	com/tencent/mm/storage/emotion/d:AE	(I)Z
    //   214: pop
    //   215: aload_0
    //   216: getstatic 401	com/tencent/mm/storage/emotion/EmojiInfo:vCs	I
    //   219: invokespecial 752	com/tencent/mm/storage/emotion/d:AE	(I)Z
    //   222: pop
    //   223: aload 7
    //   225: ifnull +8 -> 233
    //   228: aload 7
    //   230: invokevirtual 414	java/io/InputStream:close	()V
    //   233: aload_0
    //   234: getstatic 395	com/tencent/mm/storage/emotion/EmojiInfo:vCq	I
    //   237: invokespecial 743	com/tencent/mm/storage/emotion/d:AC	(I)I
    //   240: ifeq +14 -> 254
    //   243: ldc2_w 731
    //   246: sipush 11482
    //   249: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   252: iconst_1
    //   253: ireturn
    //   254: aconst_null
    //   255: astore 10
    //   257: aconst_null
    //   258: astore 9
    //   260: aload 9
    //   262: astore 8
    //   264: aload 10
    //   266: astore 7
    //   268: ldc 89
    //   270: ldc_w 762
    //   273: invokestatic 379	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   276: aload 9
    //   278: astore 8
    //   280: aload 10
    //   282: astore 7
    //   284: invokestatic 613	java/lang/System:currentTimeMillis	()J
    //   287: lstore_3
    //   288: aload 9
    //   290: astore 8
    //   292: aload 10
    //   294: astore 7
    //   296: aload_1
    //   297: invokevirtual 768	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   300: ldc_w 770
    //   303: invokevirtual 776	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   306: astore_1
    //   307: aload_1
    //   308: astore 8
    //   310: aload_1
    //   311: astore 7
    //   313: iconst_1
    //   314: anewarray 410	java/io/InputStream
    //   317: dup
    //   318: iconst_0
    //   319: aload_1
    //   320: aastore
    //   321: invokestatic 778	com/tencent/mm/storage/emotion/d:a	([Ljava/io/InputStream;)Ljava/util/List;
    //   324: astore 10
    //   326: aload_1
    //   327: astore 8
    //   329: aload_1
    //   330: astore 7
    //   332: ldc 89
    //   334: ldc_w 780
    //   337: iconst_1
    //   338: anewarray 93	java/lang/Object
    //   341: dup
    //   342: iconst_0
    //   343: invokestatic 613	java/lang/System:currentTimeMillis	()J
    //   346: lload_3
    //   347: lsub
    //   348: invokestatic 672	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   351: aastore
    //   352: invokestatic 349	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   355: aload_1
    //   356: astore 8
    //   358: aload_1
    //   359: astore 7
    //   361: invokestatic 613	java/lang/System:currentTimeMillis	()J
    //   364: lstore 5
    //   366: aload_1
    //   367: astore 8
    //   369: aload_1
    //   370: astore 7
    //   372: aload 10
    //   374: invokeinterface 589 1 0
    //   379: ifle +169 -> 548
    //   382: aload_1
    //   383: astore 8
    //   385: aload_1
    //   386: astore 7
    //   388: aload 10
    //   390: invokeinterface 589 1 0
    //   395: ifle +153 -> 548
    //   398: ldc2_w 675
    //   401: lstore_3
    //   402: aload_1
    //   403: astore 8
    //   405: aload_1
    //   406: astore 7
    //   408: aload_0
    //   409: getfield 56	com/tencent/mm/storage/emotion/d:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   412: instanceof 619
    //   415: ifeq +346 -> 761
    //   418: aload_1
    //   419: astore 8
    //   421: aload_1
    //   422: astore 7
    //   424: aload_0
    //   425: getfield 56	com/tencent/mm/storage/emotion/d:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   428: checkcast 619	com/tencent/mm/bu/g
    //   431: astore 9
    //   433: aload_1
    //   434: astore 8
    //   436: aload_1
    //   437: astore 7
    //   439: aload 9
    //   441: invokestatic 625	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   444: invokevirtual 628	java/lang/Thread:getId	()J
    //   447: invokevirtual 632	com/tencent/mm/bu/g:cE	(J)J
    //   450: lstore_3
    //   451: aload_1
    //   452: astore 8
    //   454: aload_1
    //   455: astore 7
    //   457: aload 10
    //   459: invokeinterface 636 1 0
    //   464: astore 10
    //   466: aload_1
    //   467: astore 8
    //   469: aload_1
    //   470: astore 7
    //   472: aload 10
    //   474: invokeinterface 641 1 0
    //   479: ifeq +132 -> 611
    //   482: aload_1
    //   483: astore 8
    //   485: aload_1
    //   486: astore 7
    //   488: aload 10
    //   490: invokeinterface 645 1 0
    //   495: checkcast 27	com/tencent/mm/storage/emotion/EmojiInfo
    //   498: invokevirtual 657	com/tencent/mm/storage/emotion/EmojiInfo:qL	()Landroid/content/ContentValues;
    //   501: astore 11
    //   503: aload_1
    //   504: astore 8
    //   506: aload_1
    //   507: astore 7
    //   509: aload_0
    //   510: getfield 56	com/tencent/mm/storage/emotion/d:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   513: ldc 33
    //   515: ldc_w 284
    //   518: aload 11
    //   520: invokeinterface 661 4 0
    //   525: lconst_0
    //   526: lcmp
    //   527: ifge -61 -> 466
    //   530: aload 9
    //   532: ifnull +16 -> 548
    //   535: aload_1
    //   536: astore 8
    //   538: aload_1
    //   539: astore 7
    //   541: aload 9
    //   543: lload_3
    //   544: invokevirtual 665	com/tencent/mm/bu/g:aL	(J)I
    //   547: pop
    //   548: aload_1
    //   549: astore 8
    //   551: aload_1
    //   552: astore 7
    //   554: ldc 89
    //   556: ldc_w 782
    //   559: iconst_1
    //   560: anewarray 93	java/lang/Object
    //   563: dup
    //   564: iconst_0
    //   565: invokestatic 613	java/lang/System:currentTimeMillis	()J
    //   568: lload 5
    //   570: lsub
    //   571: invokestatic 672	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   574: aastore
    //   575: invokestatic 349	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   578: aload_1
    //   579: astore 8
    //   581: aload_1
    //   582: astore 7
    //   584: ldc 89
    //   586: ldc_w 784
    //   589: invokestatic 477	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   592: aload_1
    //   593: ifnull +7 -> 600
    //   596: aload_1
    //   597: invokevirtual 414	java/io/InputStream:close	()V
    //   600: ldc2_w 731
    //   603: sipush 11482
    //   606: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   609: iconst_1
    //   610: ireturn
    //   611: aload 9
    //   613: ifnull -65 -> 548
    //   616: aload_1
    //   617: astore 8
    //   619: aload_1
    //   620: astore 7
    //   622: aload 9
    //   624: lload_3
    //   625: invokevirtual 665	com/tencent/mm/bu/g:aL	(J)I
    //   628: pop
    //   629: goto -81 -> 548
    //   632: astore_1
    //   633: aload 8
    //   635: astore 7
    //   637: ldc 89
    //   639: new 107	java/lang/StringBuilder
    //   642: dup
    //   643: ldc_w 786
    //   646: invokespecial 112	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   649: aload_1
    //   650: invokevirtual 787	java/io/IOException:getMessage	()Ljava/lang/String;
    //   653: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   656: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   659: invokestatic 126	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   662: aload 8
    //   664: ifnull -64 -> 600
    //   667: aload 8
    //   669: invokevirtual 414	java/io/InputStream:close	()V
    //   672: goto -72 -> 600
    //   675: astore_1
    //   676: ldc 89
    //   678: ldc 91
    //   680: iconst_1
    //   681: anewarray 93	java/lang/Object
    //   684: dup
    //   685: iconst_0
    //   686: aload_1
    //   687: invokestatic 99	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   690: aastore
    //   691: invokestatic 105	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   694: goto -94 -> 600
    //   697: astore_1
    //   698: ldc 89
    //   700: ldc 91
    //   702: iconst_1
    //   703: anewarray 93	java/lang/Object
    //   706: dup
    //   707: iconst_0
    //   708: aload_1
    //   709: invokestatic 99	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   712: aastore
    //   713: invokestatic 105	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   716: goto -116 -> 600
    //   719: astore_1
    //   720: aload 7
    //   722: ifnull +8 -> 730
    //   725: aload 7
    //   727: invokevirtual 414	java/io/InputStream:close	()V
    //   730: aload_1
    //   731: athrow
    //   732: astore 7
    //   734: ldc 89
    //   736: ldc 91
    //   738: iconst_1
    //   739: anewarray 93	java/lang/Object
    //   742: dup
    //   743: iconst_0
    //   744: aload 7
    //   746: invokestatic 99	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   749: aastore
    //   750: invokestatic 105	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   753: goto -23 -> 730
    //   756: astore 7
    //   758: goto -525 -> 233
    //   761: aconst_null
    //   762: astore 9
    //   764: goto -313 -> 451
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	767	0	this	d
    //   0	767	1	paramContext	Context
    //   42	44	2	i	int
    //   287	338	3	l1	long
    //   364	205	5	l2	long
    //   24	702	7	localObject1	Object
    //   732	13	7	localException1	Exception
    //   756	1	7	localException2	Exception
    //   33	635	8	localObject2	Object
    //   258	505	9	localg	g
    //   255	234	10	localObject3	Object
    //   501	18	11	localContentValues	ContentValues
    // Exception table:
    //   from	to	target	type
    //   268	276	632	java/io/IOException
    //   284	288	632	java/io/IOException
    //   296	307	632	java/io/IOException
    //   313	326	632	java/io/IOException
    //   332	355	632	java/io/IOException
    //   361	366	632	java/io/IOException
    //   372	382	632	java/io/IOException
    //   388	398	632	java/io/IOException
    //   408	418	632	java/io/IOException
    //   424	433	632	java/io/IOException
    //   439	451	632	java/io/IOException
    //   457	466	632	java/io/IOException
    //   472	482	632	java/io/IOException
    //   488	503	632	java/io/IOException
    //   509	530	632	java/io/IOException
    //   541	548	632	java/io/IOException
    //   554	578	632	java/io/IOException
    //   584	592	632	java/io/IOException
    //   622	629	632	java/io/IOException
    //   667	672	675	java/lang/Exception
    //   596	600	697	java/lang/Exception
    //   268	276	719	finally
    //   284	288	719	finally
    //   296	307	719	finally
    //   313	326	719	finally
    //   332	355	719	finally
    //   361	366	719	finally
    //   372	382	719	finally
    //   388	398	719	finally
    //   408	418	719	finally
    //   424	433	719	finally
    //   439	451	719	finally
    //   457	466	719	finally
    //   472	482	719	finally
    //   488	503	719	finally
    //   509	530	719	finally
    //   541	548	719	finally
    //   554	578	719	finally
    //   584	592	719	finally
    //   622	629	719	finally
    //   637	662	719	finally
    //   725	730	732	java/lang/Exception
    //   228	233	756	java/lang/Exception
  }
  
  /* Error */
  public final String getKey()
  {
    // Byte code:
    //   0: ldc2_w 789
    //   3: sipush 11514
    //   6: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 56	com/tencent/mm/storage/emotion/d:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   13: ldc_w 792
    //   16: iconst_1
    //   17: anewarray 25	java/lang/String
    //   20: dup
    //   21: iconst_0
    //   22: ldc_w 794
    //   25: aastore
    //   26: iconst_2
    //   27: invokeinterface 75 4 0
    //   32: astore_2
    //   33: aload_2
    //   34: ifnull +72 -> 106
    //   37: aload_2
    //   38: astore_1
    //   39: aload_2
    //   40: invokeinterface 81 1 0
    //   45: ifeq +61 -> 106
    //   48: aload_2
    //   49: astore_1
    //   50: aload_2
    //   51: iconst_0
    //   52: invokeinterface 517 2 0
    //   57: astore_3
    //   58: aload_2
    //   59: astore_1
    //   60: ldc 89
    //   62: new 107	java/lang/StringBuilder
    //   65: dup
    //   66: ldc_w 796
    //   69: invokespecial 112	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   72: aload_3
    //   73: invokestatic 799	com/tencent/mm/sdk/platformtools/bg:SJ	(Ljava/lang/String;)Ljava/lang/String;
    //   76: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   82: invokestatic 379	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   85: aload_2
    //   86: ifnull +9 -> 95
    //   89: aload_2
    //   90: invokeinterface 87 1 0
    //   95: ldc2_w 789
    //   98: sipush 11514
    //   101: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   104: aload_3
    //   105: areturn
    //   106: aload_2
    //   107: ifnull +9 -> 116
    //   110: aload_2
    //   111: invokeinterface 87 1 0
    //   116: invokestatic 805	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   119: invokestatic 809	com/tencent/mm/sdk/platformtools/bg:eC	(Landroid/content/Context;)Ljava/lang/String;
    //   122: astore_1
    //   123: aload_1
    //   124: invokestatic 345	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   127: ifne +127 -> 254
    //   130: aload_1
    //   131: invokevirtual 813	java/lang/String:getBytes	()[B
    //   134: invokestatic 819	com/tencent/mm/a/g:n	([B)Ljava/lang/String;
    //   137: astore_1
    //   138: ldc 89
    //   140: new 107	java/lang/StringBuilder
    //   143: dup
    //   144: ldc_w 821
    //   147: invokespecial 112	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   150: aload_1
    //   151: invokestatic 799	com/tencent/mm/sdk/platformtools/bg:SJ	(Ljava/lang/String;)Ljava/lang/String;
    //   154: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   160: invokestatic 379	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   163: new 27	com/tencent/mm/storage/emotion/EmojiInfo
    //   166: dup
    //   167: invokespecial 575	com/tencent/mm/storage/emotion/EmojiInfo:<init>	()V
    //   170: astore_2
    //   171: aload_2
    //   172: aload_1
    //   173: putfield 183	com/tencent/mm/storage/emotion/EmojiInfo:field_md5	Ljava/lang/String;
    //   176: aload_2
    //   177: sipush 153
    //   180: putfield 179	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   183: aload_0
    //   184: aload_2
    //   185: invokevirtual 157	com/tencent/mm/storage/emotion/d:o	(Lcom/tencent/mm/storage/emotion/EmojiInfo;)Z
    //   188: ifeq +79 -> 267
    //   191: ldc2_w 789
    //   194: sipush 11514
    //   197: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   200: aload_1
    //   201: areturn
    //   202: astore_3
    //   203: aconst_null
    //   204: astore_2
    //   205: aload_2
    //   206: astore_1
    //   207: ldc 89
    //   209: ldc_w 823
    //   212: iconst_1
    //   213: anewarray 93	java/lang/Object
    //   216: dup
    //   217: iconst_0
    //   218: aload_3
    //   219: invokestatic 99	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   222: aastore
    //   223: invokestatic 105	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   226: aload_2
    //   227: ifnull -111 -> 116
    //   230: aload_2
    //   231: invokeinterface 87 1 0
    //   236: goto -120 -> 116
    //   239: astore_2
    //   240: aconst_null
    //   241: astore_1
    //   242: aload_1
    //   243: ifnull +9 -> 252
    //   246: aload_1
    //   247: invokeinterface 87 1 0
    //   252: aload_2
    //   253: athrow
    //   254: ldc_w 825
    //   257: invokevirtual 813	java/lang/String:getBytes	()[B
    //   260: invokestatic 819	com/tencent/mm/a/g:n	([B)Ljava/lang/String;
    //   263: astore_1
    //   264: goto -126 -> 138
    //   267: ldc2_w 789
    //   270: sipush 11514
    //   273: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   276: aconst_null
    //   277: areturn
    //   278: astore_2
    //   279: goto -37 -> 242
    //   282: astore_3
    //   283: goto -78 -> 205
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	286	0	this	d
    //   38	226	1	localObject1	Object
    //   32	199	2	localObject2	Object
    //   239	14	2	localObject3	Object
    //   278	1	2	localObject4	Object
    //   57	48	3	str	String
    //   202	17	3	localException1	Exception
    //   282	1	3	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   9	33	202	java/lang/Exception
    //   9	33	239	finally
    //   39	48	278	finally
    //   50	58	278	finally
    //   60	85	278	finally
    //   207	226	278	finally
    //   39	48	282	java/lang/Exception
    //   50	58	282	java/lang/Exception
    //   60	85	282	java/lang/Exception
  }
  
  public final String getTableName()
  {
    GMTrace.i(1540819517440L, 11480);
    GMTrace.o(1540819517440L, 11480);
    return "EmojiInfo";
  }
  
  public final boolean j(List<EmojiInfo> paramList, String paramString)
  {
    GMTrace.i(1544309178368L, 11506);
    if (paramList.size() <= 0)
    {
      w.i("MicroMsg.emoji.EmojiInfoStorage", "insert emoji list faild. list is null or size is 0.");
      GMTrace.o(1544309178368L, 11506);
      return false;
    }
    w.i("MicroMsg.emoji.EmojiInfoStorage", "insertEmojiList groupId:%s size:%d", new Object[] { paramString, Integer.valueOf(paramList.size()) });
    g localg;
    if ((this.fTZ instanceof g)) {
      localg = (g)this.fTZ;
    }
    for (long l = localg.cE(Thread.currentThread().getId());; l = -1L)
    {
      Object localObject = vR(paramString);
      paramString = new HashMap();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        EmojiInfo localEmojiInfo = (EmojiInfo)((Iterator)localObject).next();
        paramString.put(localEmojiInfo.GS(), localEmojiInfo);
      }
      int i = 0;
      while (i < paramList.size())
      {
        localObject = (EmojiInfo)paramList.get(i);
        ((EmojiInfo)localObject).field_temp = 0;
        this.fTZ.replace("EmojiInfo", "md5", ((EmojiInfo)localObject).qL());
        paramString.remove(((EmojiInfo)localObject).GS());
        i += 1;
      }
      paramList = paramString.entrySet().iterator();
      while (paramList.hasNext())
      {
        localObject = (Map.Entry)paramList.next();
        paramString = (String)((Map.Entry)localObject).getKey();
        localObject = (EmojiInfo)((Map.Entry)localObject).getValue();
        ((EmojiInfo)localObject).field_temp = 1;
        this.fTZ.update("EmojiInfo", ((EmojiInfo)localObject).qL(), "md5=?", new String[] { paramString });
        w.d("MicroMsg.emoji.EmojiInfoStorage", "jacks modify excess emoji to %s", new Object[] { ((EmojiInfo)localObject).field_groupId });
      }
      if (localg != null) {
        localg.aL(l);
      }
      GMTrace.o(1544309178368L, 11506);
      return true;
      localg = null;
    }
  }
  
  public final int kM(boolean paramBoolean)
  {
    k = 0;
    j = 0;
    GMTrace.i(1542698565632L, 11494);
    localObject3 = null;
    localObject1 = null;
    String str = "select count(*)  from EmojiInfo where catalog=? ";
    Object localObject4 = new String[1];
    localObject4[0] = EmojiGroupInfo.vCn;
    if (paramBoolean)
    {
      str = "select  count(*) from EmojiInfo where catalog=?  or catalog=?";
      localObject4 = new String[2];
      localObject4[0] = String.valueOf(EmojiGroupInfo.vCm);
      localObject4[1] = String.valueOf(EmojiGroupInfo.vCn);
    }
    try
    {
      localObject4 = this.fTZ.a(str, (String[])localObject4, 2);
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
        w.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", new Object[] { bg.f(localException) });
        localObject3 = localObject1;
        w.e("MicroMsg.emoji.EmojiInfoStorage", "[countCustomEmoji]Exception:%s", new Object[] { localException.toString() });
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
        break label257;
      }
      ((Cursor)localObject3).close();
    }
    GMTrace.o(1542698565632L, 11494);
    return j;
  }
  
  public final EmojiInfo n(EmojiInfo paramEmojiInfo)
  {
    GMTrace.i(1541222170624L, 11483);
    if ((bg.nm(paramEmojiInfo.GS())) || (paramEmojiInfo.GS().length() <= 0))
    {
      w.f("MicroMsg.emoji.EmojiInfoStorage", "create assertion!, invalid md5");
      GMTrace.o(1541222170624L, 11483);
      return null;
    }
    if (o(paramEmojiInfo))
    {
      SS("create_emoji_info_notify");
      GMTrace.o(1541222170624L, 11483);
      return paramEmojiInfo;
    }
    GMTrace.o(1541222170624L, 11483);
    return null;
  }
  
  public final boolean o(EmojiInfo paramEmojiInfo)
  {
    GMTrace.i(1541893259264L, 11488);
    if ((paramEmojiInfo == null) || (!paramEmojiInfo.bUS()))
    {
      w.f("MicroMsg.emoji.EmojiInfoStorage", "insert assertion!, invalid emojiInfo");
      GMTrace.o(1541893259264L, 11488);
      return false;
    }
    ContentValues localContentValues = paramEmojiInfo.qL();
    long l = this.fTZ.replace("EmojiInfo", "md5", localContentValues);
    if (l != -1L) {
      SS(paramEmojiInfo.GS());
    }
    if (l >= 0L)
    {
      GMTrace.o(1541893259264L, 11488);
      return true;
    }
    GMTrace.o(1541893259264L, 11488);
    return false;
  }
  
  public final boolean p(EmojiInfo paramEmojiInfo)
  {
    GMTrace.i(1542027476992L, 11489);
    if ((paramEmojiInfo == null) || (!paramEmojiInfo.bUS()))
    {
      w.f("MicroMsg.emoji.EmojiInfoStorage", "insert assertion!, invalid emojiInfo");
      GMTrace.o(1542027476992L, 11489);
      return false;
    }
    int i = this.fTZ.update("EmojiInfo", paramEmojiInfo.qL(), "md5=?", new String[] { paramEmojiInfo.GS() });
    if (i > 0)
    {
      SS(paramEmojiInfo.GS());
      SS("event_update_emoji");
    }
    if (i > 0)
    {
      GMTrace.o(1542027476992L, 11489);
      return true;
    }
    GMTrace.o(1542027476992L, 11489);
    return false;
  }
  
  public final boolean q(EmojiInfo paramEmojiInfo)
  {
    GMTrace.i(1542161694720L, 11490);
    if ((paramEmojiInfo == null) || (!paramEmojiInfo.bUS()))
    {
      w.f("MicroMsg.emoji.EmojiInfoStorage", "insert assertion!, invalid emojiInfo");
      GMTrace.o(1542161694720L, 11490);
      return false;
    }
    if (this.fTZ.update("EmojiInfo", paramEmojiInfo.qL(), "md5=?", new String[] { paramEmojiInfo.GS() }) > 0)
    {
      GMTrace.o(1542161694720L, 11490);
      return true;
    }
    GMTrace.o(1542161694720L, 11490);
    return false;
  }
  
  public final List<EmojiInfo> vR(String paramString)
  {
    GMTrace.i(1543906525184L, 11503);
    ArrayList localArrayList = new ArrayList();
    localObject = null;
    str = null;
    try
    {
      paramString = this.fTZ.a("select * from EmojiInfo where groupId=? and temp=? order by idx asc", new String[] { paramString, "0" }, 2);
      if (paramString != null)
      {
        str = paramString;
        localObject = paramString;
        if (paramString.moveToFirst())
        {
          boolean bool;
          do
          {
            str = paramString;
            localObject = paramString;
            com.tencent.mm.plugin.emoji.d.apQ();
            str = paramString;
            localObject = paramString;
            EmojiInfo localEmojiInfo = new EmojiInfo(com.tencent.mm.plugin.emoji.d.apR());
            str = paramString;
            localObject = paramString;
            localEmojiInfo.b(paramString);
            str = paramString;
            localObject = paramString;
            localArrayList.add(localEmojiInfo);
            str = paramString;
            localObject = paramString;
            bool = paramString.moveToNext();
          } while (bool);
        }
      }
      if (paramString != null) {
        paramString.close();
      }
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        localObject = str;
        w.w("MicroMsg.emoji.EmojiInfoStorage", "[getEmojiListByGroupId] Exception:%s", new Object[] { paramString.toString() });
        if (str != null) {
          str.close();
        }
      }
    }
    finally
    {
      if (localObject == null) {
        break label207;
      }
      ((Cursor)localObject).close();
    }
    GMTrace.o(1543906525184L, 11503);
    return localArrayList;
  }
  
  public final int vZ(String paramString)
  {
    GMTrace.i(1542564347904L, 11493);
    long l = System.currentTimeMillis();
    Object localObject = null;
    String str = null;
    for (;;)
    {
      try
      {
        paramString = this.fTZ.a("select count(*) from EmojiInfo where groupId= ? and temp=?", new String[] { paramString, "0" }, 2);
        if (paramString == null) {
          break label216;
        }
        str = paramString;
        localObject = paramString;
        if (!paramString.moveToFirst()) {
          break label216;
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
        w.e("MicroMsg.emoji.EmojiInfoStorage", "exception:%s", new Object[] { bg.f(paramString) });
        localObject = str;
        w.e("MicroMsg.emoji.EmojiInfoStorage", "[countProductId]Count ProductId fail." + paramString.getMessage());
        if (str == null) {
          break label211;
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
      w.d("MicroMsg.emoji.EmojiInfoStorage", "count product id use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      GMTrace.o(1542564347904L, 11493);
      return j;
      label211:
      int j = 0;
      continue;
      label216:
      int i = 0;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\emotion\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */