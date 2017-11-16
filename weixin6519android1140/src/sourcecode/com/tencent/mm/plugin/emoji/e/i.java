package com.tencent.mm.plugin.emoji.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.bd;
import com.tencent.mm.g.a.bd.a;
import com.tencent.mm.g.a.cm;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.q;
import com.tencent.mm.storage.emotion.s;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class i
{
  public static String kiA;
  public static String kiB;
  public static String kiC;
  public static String kiD;
  private static String kiE;
  private static String kiF;
  private static String kiG;
  private static String kiH;
  private static String kiI;
  private static String kiJ;
  private static String kiK;
  public static String kiL;
  public static String kiM;
  public static String kiN;
  public static String kiO;
  private static int kiP;
  private static int kiQ;
  private static int kiR;
  private static int kiS;
  private static i kiT;
  private static String kiy;
  private static String kiz;
  public com.tencent.mm.aw.f kiU;
  
  static
  {
    GMTrace.i(11547019575296L, 86032);
    kiy = "";
    kiz = "temp";
    kiA = "newemoji";
    kiB = "panel";
    kiC = "suggest";
    kiD = "egg";
    kiE = "search";
    kiF = "config.conf";
    kiG = "emojipanel.zip";
    kiH = "newemoji.zip";
    kiI = "emoji_template.zip";
    kiJ = "emojisuggest.zip";
    kiK = "egg.zip";
    kiL = "newemoji-config.xml";
    kiM = "emojipanel-config.xml";
    kiN = "emojisuggest-config.xml";
    kiO = "egg.xml";
    kiP = 0;
    kiQ = 0;
    kiR = 0;
    kiS = 0;
    GMTrace.o(11547019575296L, 86032);
  }
  
  public i()
  {
    GMTrace.i(11545408962560L, 86020);
    GMTrace.o(11545408962560L, 86020);
  }
  
  public static boolean a(bd parambd, a parama, String paramString)
  {
    GMTrace.i(11545677398016L, 86022);
    File localFile = new File(parambd.eCr.filePath);
    if ((localFile.exists()) && (localFile.length() > 0L))
    {
      long l = System.currentTimeMillis();
      w.i("MicroMsg.emoji.EmojiResUpdateMgr", "copyAndUnzipFile start. type:%s filePath:%s", new Object[] { String.valueOf(parama), localFile.getAbsolutePath() });
      paramString = new File(aqM(), paramString);
      if (paramString.exists()) {
        com.tencent.mm.a.e.f(paramString);
      }
      switch (1.kiV[parama.ordinal()])
      {
      default: 
        w.w("MicroMsg.emoji.EmojiResUpdateMgr", "unknown type. type:%s", new Object[] { String.valueOf(parama) });
        parambd = "";
      }
      for (;;)
      {
        parambd = new File(paramString, parambd);
        paramString.mkdirs();
        com.tencent.mm.a.e.o(localFile.getAbsolutePath(), parambd.getAbsolutePath());
        int i = bg.eV(parambd.getAbsolutePath(), paramString.getAbsolutePath());
        com.tencent.mm.loader.stub.b.deleteFile(parambd.getPath());
        w.d("MicroMsg.emoji.EmojiResUpdateMgr", "copyAndUnzipFile done. user time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        if (i < 0) {
          break;
        }
        GMTrace.o(11545677398016L, 86022);
        return true;
        parambd = kiH;
        continue;
        parambd = kiG;
        continue;
        parambd = kiI;
        continue;
        parambd = kiJ;
        continue;
        parambd = kiK;
      }
      GMTrace.o(11545677398016L, 86022);
      return false;
    }
    w.i("MicroMsg.emoji.EmojiResUpdateMgr", "copyAndUnzipFile update file don't exist.");
    GMTrace.o(11545677398016L, 86022);
    return false;
  }
  
  public static i aqL()
  {
    GMTrace.i(11545274744832L, 86019);
    if (kiT == null) {}
    try
    {
      kiT = new i();
      i locali = kiT;
      GMTrace.o(11545274744832L, 86019);
      return locali;
    }
    finally {}
  }
  
  public static String aqM()
  {
    GMTrace.i(11545543180288L, 86021);
    if (bg.nm(kiy))
    {
      kiy = com.tencent.mm.compatible.util.e.ghw.replace("/data/user/0", "/data/data");
      kiy += "/emoji";
    }
    String str = kiy;
    GMTrace.o(11545543180288L, 86021);
    return str;
  }
  
  public static boolean aqN()
  {
    GMTrace.i(11546080051200L, 86025);
    at.AR();
    String str1 = (String)com.tencent.mm.y.c.xh().get(w.a.vqu, kiM);
    String str2 = n.aqV();
    if ((!bg.nm(str2)) && (!str1.equalsIgnoreCase(str2)))
    {
      GMTrace.o(11546080051200L, 86025);
      return true;
    }
    GMTrace.o(11546080051200L, 86025);
    return false;
  }
  
  public static boolean b(bd parambd)
  {
    GMTrace.i(11546751139840L, 86030);
    long l1 = System.currentTimeMillis();
    com.tencent.mm.bt.b.bRv();
    com.tencent.mm.bt.b.bRy();
    long l2 = com.tencent.mm.bt.b.bRv().vnr;
    com.tencent.mm.bt.b.bRv();
    int i = com.tencent.mm.bt.b.SX(parambd.eCr.filePath);
    com.tencent.mm.bt.b.bRv();
    long l3 = com.tencent.mm.bt.b.SW(parambd.eCr.filePath);
    w.i("MicroMsg.emoji.EmojiResUpdateMgr", "currentSupportVersion:%d current version:%d supportVersion:%d file version:%d use time:%d", new Object[] { Integer.valueOf(1), Long.valueOf(l2), Integer.valueOf(i), Long.valueOf(l3), Long.valueOf(System.currentTimeMillis() - l1) });
    if ((i == 1) && (l3 > l2))
    {
      GMTrace.o(11546751139840L, 86030);
      return true;
    }
    w.i("MicroMsg.emoji.EmojiResUpdateMgr", "need not update color emoji");
    GMTrace.o(11546751139840L, 86030);
    return false;
  }
  
  /* Error */
  private static int t(File paramFile)
  {
    // Byte code:
    //   0: ldc2_w 363
    //   3: ldc_w 365
    //   6: invokestatic 47	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: invokestatic 166	java/lang/System:currentTimeMillis	()J
    //   12: lstore_3
    //   13: iconst_m1
    //   14: istore_2
    //   15: aload_0
    //   16: invokevirtual 157	java/io/File:exists	()Z
    //   19: ifeq +246 -> 265
    //   22: aconst_null
    //   23: astore 5
    //   25: new 367	java/io/FileInputStream
    //   28: dup
    //   29: aload_0
    //   30: invokespecial 370	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   33: astore 6
    //   35: new 372	java/io/InputStreamReader
    //   38: dup
    //   39: aload 6
    //   41: invokespecial 375	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   44: astore 7
    //   46: new 377	java/io/BufferedReader
    //   49: dup
    //   50: aload 7
    //   52: invokespecial 380	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   55: astore_0
    //   56: ldc 49
    //   58: astore 5
    //   60: iload_2
    //   61: istore_1
    //   62: aload_0
    //   63: invokevirtual 383	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   66: astore 8
    //   68: aload 8
    //   70: ifnull +30 -> 100
    //   73: iload_2
    //   74: istore_1
    //   75: new 277	java/lang/StringBuilder
    //   78: dup
    //   79: invokespecial 278	java/lang/StringBuilder:<init>	()V
    //   82: aload 5
    //   84: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: aload 8
    //   89: invokevirtual 282	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: invokevirtual 287	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   95: astore 5
    //   97: goto -37 -> 60
    //   100: iload_2
    //   101: istore_1
    //   102: new 385	org/json/JSONObject
    //   105: dup
    //   106: aload 5
    //   108: invokespecial 386	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   111: ldc_w 388
    //   114: invokevirtual 391	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   117: istore_2
    //   118: iload_2
    //   119: istore_1
    //   120: ldc -88
    //   122: ldc_w 393
    //   125: iconst_2
    //   126: anewarray 4	java/lang/Object
    //   129: dup
    //   130: iconst_0
    //   131: aload 5
    //   133: aastore
    //   134: dup
    //   135: iconst_1
    //   136: iload_2
    //   137: invokestatic 356	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   140: aastore
    //   141: invokestatic 244	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   144: aload 6
    //   146: invokestatic 395	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   149: aload 7
    //   151: invokestatic 397	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   154: aload_0
    //   155: invokestatic 397	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   158: ldc -88
    //   160: ldc_w 399
    //   163: iconst_1
    //   164: anewarray 4	java/lang/Object
    //   167: dup
    //   168: iconst_0
    //   169: invokestatic 166	java/lang/System:currentTimeMillis	()J
    //   172: lload_3
    //   173: lsub
    //   174: invokestatic 241	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   177: aastore
    //   178: invokestatic 185	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   181: ldc2_w 363
    //   184: ldc_w 365
    //   187: invokestatic 126	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   190: iload_2
    //   191: ireturn
    //   192: astore 7
    //   194: aconst_null
    //   195: astore 8
    //   197: aconst_null
    //   198: astore_0
    //   199: aload 5
    //   201: astore 6
    //   203: aload 8
    //   205: astore 5
    //   207: iload_2
    //   208: istore_1
    //   209: ldc -88
    //   211: aload 7
    //   213: invokestatic 402	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   216: invokestatic 405	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   219: aload 6
    //   221: invokestatic 395	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   224: aload 5
    //   226: invokestatic 397	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   229: aload_0
    //   230: invokestatic 397	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   233: iload_1
    //   234: istore_2
    //   235: goto -77 -> 158
    //   238: astore 5
    //   240: aconst_null
    //   241: astore 6
    //   243: aconst_null
    //   244: astore 7
    //   246: aconst_null
    //   247: astore_0
    //   248: aload 6
    //   250: invokestatic 395	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   253: aload 7
    //   255: invokestatic 397	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   258: aload_0
    //   259: invokestatic 397	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   262: aload 5
    //   264: athrow
    //   265: ldc -88
    //   267: ldc_w 407
    //   270: iconst_1
    //   271: anewarray 4	java/lang/Object
    //   274: dup
    //   275: iconst_0
    //   276: aload_0
    //   277: invokevirtual 180	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   280: aastore
    //   281: invokestatic 185	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   284: goto -126 -> 158
    //   287: astore 5
    //   289: aconst_null
    //   290: astore 7
    //   292: aconst_null
    //   293: astore_0
    //   294: goto -46 -> 248
    //   297: astore 5
    //   299: aconst_null
    //   300: astore_0
    //   301: goto -53 -> 248
    //   304: astore 5
    //   306: goto -58 -> 248
    //   309: astore 8
    //   311: aload 5
    //   313: astore 7
    //   315: aload 8
    //   317: astore 5
    //   319: goto -71 -> 248
    //   322: astore 7
    //   324: aconst_null
    //   325: astore_0
    //   326: aconst_null
    //   327: astore 5
    //   329: iload_2
    //   330: istore_1
    //   331: goto -122 -> 209
    //   334: astore 8
    //   336: aconst_null
    //   337: astore_0
    //   338: aload 7
    //   340: astore 5
    //   342: iload_2
    //   343: istore_1
    //   344: aload 8
    //   346: astore 7
    //   348: goto -139 -> 209
    //   351: astore 8
    //   353: aload 7
    //   355: astore 5
    //   357: aload 8
    //   359: astore 7
    //   361: goto -152 -> 209
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	364	0	paramFile	File
    //   61	283	1	i	int
    //   14	329	2	j	int
    //   12	161	3	l	long
    //   23	202	5	localObject1	Object
    //   238	25	5	localObject2	Object
    //   287	1	5	localObject3	Object
    //   297	1	5	localObject4	Object
    //   304	8	5	localObject5	Object
    //   317	39	5	localObject6	Object
    //   33	216	6	localObject7	Object
    //   44	106	7	localInputStreamReader	java.io.InputStreamReader
    //   192	20	7	localException1	Exception
    //   244	70	7	localObject8	Object
    //   322	17	7	localException2	Exception
    //   346	14	7	localObject9	Object
    //   66	138	8	str	String
    //   309	7	8	localObject10	Object
    //   334	11	8	localException3	Exception
    //   351	7	8	localException4	Exception
    // Exception table:
    //   from	to	target	type
    //   25	35	192	java/lang/Exception
    //   25	35	238	finally
    //   35	46	287	finally
    //   46	56	297	finally
    //   62	68	304	finally
    //   75	97	304	finally
    //   102	118	304	finally
    //   120	144	304	finally
    //   209	219	309	finally
    //   35	46	322	java/lang/Exception
    //   46	56	334	java/lang/Exception
    //   62	68	351	java/lang/Exception
    //   75	97	351	java/lang/Exception
    //   102	118	351	java/lang/Exception
    //   120	144	351	java/lang/Exception
  }
  
  public static void u(File paramFile)
  {
    GMTrace.i(11546214268928L, 86026);
    Object localObject = DocumentBuilderFactory.newInstance();
    for (;;)
    {
      int i;
      q localq;
      int j;
      Node localNode;
      String str;
      try
      {
        paramFile = ((DocumentBuilderFactory)localObject).newDocumentBuilder().parse(paramFile);
        paramFile.normalize();
        paramFile = paramFile.getDocumentElement().getElementsByTagName("emoji");
        if ((paramFile == null) || (paramFile.getLength() <= 0)) {
          break label816;
        }
        localObject = new ArrayList();
        int m = paramFile.getLength();
        i = 0;
        if (i >= m) {
          break label679;
        }
        NodeList localNodeList = paramFile.item(i).getChildNodes();
        if ((localNodeList == null) || (localNodeList.getLength() <= 0)) {
          break label833;
        }
        localq = new q();
        j = 0;
        if (j >= localNodeList.getLength()) {
          break label630;
        }
        localNode = localNodeList.item(j);
        str = localNode.getNodeName();
        if (str.equalsIgnoreCase("key")) {
          localq.field_key = localNode.getTextContent();
        } else if (str.equalsIgnoreCase("cn-value")) {
          if ((bg.nm(localNode.getTextContent())) || ("null".equalsIgnoreCase(localNode.getTextContent()))) {
            localq.field_cnValue = localq.field_key;
          }
        }
      }
      catch (Exception paramFile)
      {
        w.e("MicroMsg.emoji.EmojiResUpdateMgr", "parserNewEmojiConfig parseXML exception:%s", new Object[] { paramFile.toString() });
        GMTrace.o(11546214268928L, 86026);
        return;
      }
      localq.field_cnValue = localNode.getTextContent();
      break label826;
      if (str.equalsIgnoreCase("qq-value"))
      {
        if ((bg.nm(localNode.getTextContent())) || ("null".equalsIgnoreCase(localNode.getTextContent()))) {
          localq.field_qqValue = localq.field_key;
        } else {
          localq.field_qqValue = localNode.getTextContent();
        }
      }
      else if (str.equalsIgnoreCase("en-value"))
      {
        if ((bg.nm(localNode.getTextContent())) || ("null".equalsIgnoreCase(localNode.getTextContent()))) {
          localq.field_enValue = localq.field_key;
        } else {
          localq.field_enValue = localNode.getTextContent();
        }
      }
      else if (str.equalsIgnoreCase("tw-value"))
      {
        if ((bg.nm(localNode.getTextContent())) || ("null".equalsIgnoreCase(localNode.getTextContent()))) {
          localq.field_twValue = localq.field_key;
        } else {
          localq.field_twValue = localNode.getTextContent();
        }
      }
      else if (str.equalsIgnoreCase("th-value"))
      {
        if ((bg.nm(localNode.getTextContent())) || ("null".equalsIgnoreCase(localNode.getTextContent()))) {
          localq.field_thValue = localq.field_key;
        } else {
          localq.field_thValue = localNode.getTextContent();
        }
      }
      else if (str.equalsIgnoreCase("fileName"))
      {
        localq.field_fileName = localNode.getTextContent();
      }
      else
      {
        boolean bool = str.equalsIgnoreCase("eggIndex");
        if (bool)
        {
          try
          {
            k = Integer.valueOf(localNode.getTextContent()).intValue();
            localq.field_eggIndex = k;
          }
          catch (Exception localException)
          {
            for (;;)
            {
              w.e("MicroMsg.emoji.EmojiResUpdateMgr", bg.f(localException));
              int k = -1;
            }
          }
          label630:
          localq.field_position = -1;
          w.d("MicroMsg.emoji.EmojiResUpdateMgr", localq.toString());
          if (bg.nm(localq.field_key))
          {
            w.i("MicroMsg.emoji.EmojiResUpdateMgr", "key is empty");
            break label833;
          }
          ((ArrayList)localObject).add(localq);
          break label833;
          label679:
          if (!((ArrayList)localObject).isEmpty())
          {
            if (((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().s((ArrayList)localObject))
            {
              paramFile = new cm();
              paramFile.eDP.eCt = 1;
              com.tencent.mm.sdk.b.a.vgX.m(paramFile);
              kiP = t(new File(aqM() + File.separator + kiA, kiF));
              at.AR();
              com.tencent.mm.y.c.xh().a(w.a.vqq, Integer.valueOf(kiP));
              GMTrace.o(11546214268928L, 86026);
            }
          }
          else {
            w.i("MicroMsg.emoji.EmojiResUpdateMgr", "parserNewEmojiConfig smiley list is null.");
          }
          label816:
          GMTrace.o(11546214268928L, 86026);
          return;
        }
      }
      label826:
      j += 1;
      continue;
      label833:
      i += 1;
    }
  }
  
  public static void v(File paramFile)
  {
    GMTrace.i(11546348486656L, 86027);
    Object localObject = DocumentBuilderFactory.newInstance();
    for (;;)
    {
      ArrayList localArrayList;
      int i;
      try
      {
        paramFile = ((DocumentBuilderFactory)localObject).newDocumentBuilder().parse(paramFile);
        paramFile.normalize();
        NodeList localNodeList = paramFile.getDocumentElement().getElementsByTagName("item");
        if ((localNodeList == null) || (localNodeList.getLength() <= 0)) {
          break label418;
        }
        localArrayList = new ArrayList();
        int k = localNodeList.getLength();
        i = 0;
        if (i < k)
        {
          paramFile = localNodeList.item(i);
          if ((paramFile == null) || (bg.nm(paramFile.getTextContent()))) {
            break label428;
          }
          paramFile = paramFile.getTextContent().replaceAll("\"", "");
          localObject = paramFile;
          if (paramFile.startsWith("\\\\u"))
          {
            char[] arrayOfChar = Character.toChars(Integer.parseInt(paramFile.substring(3), 16));
            paramFile = "";
            int j = 0;
            localObject = paramFile;
            if (j < arrayOfChar.length)
            {
              paramFile = paramFile + String.valueOf(arrayOfChar[j]);
              j += 1;
              continue;
            }
          }
          paramFile = new s(i, (String)localObject);
          if (bg.nm(paramFile.field_key))
          {
            w.i("MicroMsg.emoji.EmojiResUpdateMgr", "key is null.");
            w.d("MicroMsg.emoji.EmojiResUpdateMgr", paramFile.toString());
            break label428;
          }
          localArrayList.add(paramFile);
          continue;
        }
        if (localArrayList.isEmpty()) {
          break label410;
        }
      }
      catch (Exception paramFile)
      {
        w.e("MicroMsg.emoji.EmojiResUpdateMgr", "parserEmojiPanelConfig parseXML exception:%s", new Object[] { paramFile.toString() });
        GMTrace.o(11546348486656L, 86027);
        return;
      }
      if (((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().t(localArrayList))
      {
        paramFile = new cm();
        paramFile.eDP.eCt = 2;
        com.tencent.mm.sdk.b.a.vgX.m(paramFile);
        kiQ = t(new File(aqM() + File.separator + kiB, kiF));
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vqr, Integer.valueOf(kiQ));
        GMTrace.o(11546348486656L, 86027);
        return;
        label410:
        w.i("MicroMsg.emoji.EmojiResUpdateMgr", "parserEmojiPanelConfig smiley panel list is null.");
      }
      label418:
      GMTrace.o(11546348486656L, 86027);
      return;
      label428:
      i += 1;
    }
  }
  
  public static void w(File paramFile)
  {
    GMTrace.i(11546482704384L, 86028);
    Object localObject1 = DocumentBuilderFactory.newInstance();
    for (;;)
    {
      int i;
      int j;
      try
      {
        paramFile = ((DocumentBuilderFactory)localObject1).newDocumentBuilder().parse(paramFile);
        paramFile.normalize();
        paramFile = paramFile.getDocumentElement().getElementsByTagName("group");
        if ((paramFile != null) && (paramFile.getLength() > 0))
        {
          int k = paramFile.getLength();
          localObject1 = new ArrayList();
          i = 0;
          if (i < k)
          {
            NodeList localNodeList = paramFile.item(i).getChildNodes();
            if ((localNodeList == null) || (localNodeList.getLength() <= 0)) {
              break label343;
            }
            int m = localNodeList.getLength();
            ArrayList localArrayList = new ArrayList();
            j = 0;
            if (j < m)
            {
              Object localObject2 = localNodeList.item(j);
              if (((Node)localObject2).getNodeName().equals("word"))
              {
                localObject2 = ((Node)localObject2).getTextContent();
                if (!bg.nm((String)localObject2))
                {
                  w.d("MicroMsg.emoji.EmojiResUpdateMgr", "word:%s", new Object[] { localObject2 });
                  localArrayList.add(((String)localObject2).trim());
                }
              }
            }
            else
            {
              ((ArrayList)localObject1).add(localArrayList);
              break label343;
            }
          }
          else
          {
            com.tencent.mm.plugin.emoji.model.h.arl().kjI.ag((ArrayList)localObject1);
            kiR = t(new File(aqM() + File.separator + kiC, kiF));
            at.AR();
            com.tencent.mm.y.c.xh().a(w.a.vqs, Integer.valueOf(kiR));
          }
        }
        else
        {
          GMTrace.o(11546482704384L, 86028);
          return;
        }
      }
      catch (Exception paramFile)
      {
        w.e("MicroMsg.emoji.EmojiResUpdateMgr", "parserEmojiDescConfig parseXML exception:%s", new Object[] { paramFile.toString() });
        GMTrace.o(11546482704384L, 86028);
        return;
      }
      j += 1;
      continue;
      label343:
      i += 1;
    }
  }
  
  public static void x(File paramFile)
  {
    GMTrace.i(11546616922112L, 86029);
    try
    {
      paramFile = com.tencent.mm.a.e.be(paramFile.getAbsolutePath());
      Object localObject1 = bh.q(paramFile, "EasterEgg");
      w.i("MicroMsg.emoji.EmojiResUpdateMgr", "eggXml:" + paramFile);
      if (localObject1 == null)
      {
        w.e("MicroMsg.emoji.EmojiResUpdateMgr", "Exception in parseXml EasterEgg, please check the xml");
        GMTrace.o(11546616922112L, 86029);
        return;
      }
      com.tencent.mm.aw.f localf = new com.tencent.mm.aw.f();
      localf.gPY = bg.Sy((String)((Map)localObject1).get(".EasterEgg.$version"));
      int i = 0;
      for (;;)
      {
        Object localObject2 = new StringBuilder(".EasterEgg.Item");
        com.tencent.mm.aw.d locald;
        int j;
        label552:
        Object localObject3;
        if (i == 0)
        {
          paramFile = "";
          localObject2 = paramFile;
          if (((Map)localObject1).get((String)localObject2 + ".$name") == null) {
            break;
          }
          locald = new com.tencent.mm.aw.d();
          locald.name = bg.nl((String)((Map)localObject1).get((String)localObject2 + ".$name"));
          locald.gPR = bg.nl((String)((Map)localObject1).get((String)localObject2 + ".$langs"));
          locald.gPO = bg.Sy((String)((Map)localObject1).get((String)localObject2 + ".$reportType"));
          locald.gPP = bg.Sp((String)((Map)localObject1).get((String)localObject2 + ".$BeginDate"));
          locald.gPQ = bg.Sp((String)((Map)localObject1).get((String)localObject2 + ".$EndDate"));
          locald.gPS = bg.nl((String)((Map)localObject1).get((String)localObject2 + ".FileName"));
          locald.gPT = bg.Sy((String)((Map)localObject1).get((String)localObject2 + ".AnimType"));
          locald.gPU = bg.Sy((String)((Map)localObject1).get((String)localObject2 + ".AnimType.$viewcount"));
          locald.gPV = bg.Sy((String)((Map)localObject1).get((String)localObject2 + ".AnimType.$minSize"));
          locald.maxSize = bg.Sy((String)((Map)localObject1).get((String)localObject2 + ".AnimType.$maxSize"));
          j = 0;
          localObject3 = new StringBuilder().append((String)localObject2).append(".KeyWord");
          if (j != 0) {
            break label693;
          }
        }
        label693:
        for (paramFile = "";; paramFile = Integer.valueOf(j))
        {
          paramFile = paramFile;
          localObject3 = paramFile + ".$lang";
          if (((Map)localObject1).get(paramFile) == null) {
            break label701;
          }
          com.tencent.mm.aw.e locale = new com.tencent.mm.aw.e();
          locale.gPW = bg.nl((String)((Map)localObject1).get(paramFile));
          locale.lang = bg.nl((String)((Map)localObject1).get(localObject3));
          locald.gPM.add(locale);
          j += 1;
          break label552;
          paramFile = Integer.valueOf(i);
          break;
        }
        label701:
        localf.gPX.add(locald);
        i += 1;
      }
      paramFile = localf.toByteArray();
      localObject1 = new StringBuilder();
      at.AR();
      com.tencent.mm.a.e.b(com.tencent.mm.y.c.zn() + "eggingfo.ini", paramFile, paramFile.length);
      kiS = t(new File(aqM() + File.separator + kiD, kiF));
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vqt, Integer.valueOf(kiS));
      GMTrace.o(11546616922112L, 86029);
      return;
    }
    catch (Exception paramFile)
    {
      w.printErrStackTrace("MicroMsg.emoji.EmojiResUpdateMgr", paramFile, "", new Object[0]);
      GMTrace.o(11546616922112L, 86029);
    }
  }
  
  public final boolean a(bd parambd, a parama)
  {
    GMTrace.i(11545945833472L, 86024);
    int j;
    int i;
    if (a(parambd, parama, kiz))
    {
      parambd = new File(aqM(), kiz);
      w.d("MicroMsg.emoji.EmojiResUpdateMgr", "readVersionCode unzip file done.");
      j = t(new File(parambd, kiF));
      switch (1.kiV[parama.ordinal()])
      {
      default: 
        i = -1;
      }
    }
    for (;;)
    {
      w.i("MicroMsg.emoji.EmojiResUpdateMgr", "file version:%d, current version:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
      if ((j == -1) || (i >= j)) {
        break label308;
      }
      GMTrace.o(11545945833472L, 86024);
      return true;
      w.i("MicroMsg.emoji.EmojiResUpdateMgr", "unzip file failed. type:%s", new Object[] { String.valueOf(parama) });
      j = -1;
      break;
      at.AR();
      i = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vqq, Integer.valueOf(0))).intValue();
      kiP = i;
      continue;
      at.AR();
      i = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vqr, Integer.valueOf(0))).intValue();
      kiQ = i;
      continue;
      i = com.tencent.mm.aj.a.gBU;
      continue;
      at.AR();
      i = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vqs, Integer.valueOf(0))).intValue();
      kiR = i;
      continue;
      at.AR();
      i = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vqt, Integer.valueOf(0))).intValue();
      kiS = i;
    }
    label308:
    GMTrace.o(11545945833472L, 86024);
    return false;
  }
  
  public final com.tencent.mm.aw.f aqD()
  {
    GMTrace.i(11546885357568L, 86031);
    for (;;)
    {
      try
      {
        if (this.kiU == null)
        {
          localObject = new StringBuilder();
          at.AR();
          localObject = com.tencent.mm.a.e.d(com.tencent.mm.y.c.zn() + "eggingfo.ini", 0, -1);
          if (localObject != null) {
            continue;
          }
          w.d("MicroMsg.emoji.EmojiResUpdateMgr", "data is null, parse EggList from config file fail");
        }
      }
      catch (Exception localException)
      {
        Object localObject;
        w.w("MicroMsg.emoji.EmojiResUpdateMgr", "init crash : %s, try delete egg file", new Object[] { localException.getLocalizedMessage() });
        w.printErrStackTrace("MicroMsg.emoji.EmojiResUpdateMgr", localException, "", new Object[0]);
        continue;
      }
      localObject = this.kiU;
      GMTrace.o(11546885357568L, 86031);
      return (com.tencent.mm.aw.f)localObject;
      this.kiU = ((com.tencent.mm.aw.f)new com.tencent.mm.aw.f().aD((byte[])localObject));
    }
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(11553998897152L, 86084);
      kiW = new a("EMOJI", 0);
      kiX = new a("PANEL", 1);
      kiY = new a("SUGGEST", 2);
      kiZ = new a("SEARCH", 3);
      kja = new a("EGG", 4);
      kjb = new a[] { kiW, kiX, kiY, kiZ, kja };
      GMTrace.o(11553998897152L, 86084);
    }
    
    private a()
    {
      GMTrace.i(11553864679424L, 86083);
      GMTrace.o(11553864679424L, 86083);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\e\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */