package com.tencent.xweb.xwalk.a;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public final class a
{
  private static int a(Element paramElement, String paramString)
  {
    if (paramElement == null) {}
    do
    {
      return 0;
      paramElement = paramElement.getAttribute(paramString);
    } while ((paramElement == null) || (paramElement.isEmpty()));
    return Integer.parseInt(paramElement);
  }
  
  private static void a(a parama, Element paramElement)
  {
    if (paramElement == null) {}
    for (;;)
    {
      return;
      try
      {
        paramElement = paramElement.getElementsByTagName("command");
        if ((paramElement == null) || (paramElement.getLength() == 0)) {
          continue;
        }
        parama.ypQ = new com.tencent.xweb.a.a[paramElement.getLength()];
        int i = 0;
        while (i < paramElement.getLength())
        {
          com.tencent.xweb.a.a locala = new com.tencent.xweb.a.a();
          Element localElement = (Element)paramElement.item(i);
          locala.ymP = a(localElement, "apkMin");
          locala.ymQ = a(localElement, "apkMax");
          locala.ymN = a(localElement, "sdkMin");
          locala.ymO = a(localElement, "sdkMax");
          locala.ymR = a(localElement, "grayRate");
          locala.ymS = localElement.getAttribute("optype");
          locala.ymT = localElement.getAttribute("opvalue");
          parama.ypQ[i] = locala;
          i += 1;
        }
        return;
      }
      catch (Exception parama) {}
    }
  }
  
  private static b[] a(Element paramElement)
  {
    paramElement = paramElement.getElementsByTagName("Patch");
    if ((paramElement != null) && (paramElement.getLength() != 0))
    {
      b[] arrayOfb = new b[paramElement.getLength()];
      int i = 0;
      while (i < paramElement.getLength())
      {
        b localb = new b();
        Element localElement = (Element)paramElement.item(i);
        localb.ypS = localElement.getAttribute("url");
        localb.ypR = a(localElement, "targetVersion");
        localb.ypN = localElement.getAttribute("md5");
        localb.ypT = b(localElement, "useCellular");
        arrayOfb[i] = localb;
        i += 1;
      }
      return arrayOfb;
    }
    return null;
  }
  
  private static boolean b(Element paramElement, String paramString)
  {
    if (paramElement == null) {}
    do
    {
      return false;
      paramElement = paramElement.getAttribute(paramString);
    } while ((paramElement == null) || (paramElement.isEmpty()));
    return Boolean.parseBoolean(paramElement);
  }
  
  static String h(File paramFile, int paramInt)
  {
    int i = 0;
    try
    {
      Object localObject = new byte[paramInt];
      paramInt = new FileInputStream(paramFile).read((byte[])localObject, 0, localObject.length);
      if (paramInt != localObject.length) {
        return null;
      }
      paramFile = new String((byte[])localObject, 0, paramInt);
      paramInt = paramFile.indexOf("<Versions>");
      if (paramInt >= 0)
      {
        paramFile = paramFile.substring(paramInt);
        paramFile = MessageDigest.getInstance("MD5").digest(paramFile.getBytes());
        if ((paramFile != null) && (paramFile.length != 0))
        {
          localObject = new StringBuilder(paramFile.length);
          int j = paramFile.length;
          paramInt = i;
          while (paramInt < j)
          {
            String str = Integer.toHexString(paramFile[paramInt] & 0xFF);
            if (str.length() == 1) {
              ((StringBuilder)localObject).append(0);
            }
            ((StringBuilder)localObject).append(str);
            paramInt += 1;
          }
          paramFile = ((StringBuilder)localObject).toString().toUpperCase();
          return paramFile;
        }
      }
    }
    catch (Exception paramFile) {}
    return null;
  }
  
  /* Error */
  public static a i(File paramFile, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: aconst_null
    //   7: astore_3
    //   8: invokestatic 216	javax/xml/parsers/DocumentBuilderFactory:newInstance	()Ljavax/xml/parsers/DocumentBuilderFactory;
    //   11: astore 6
    //   13: new 142	java/io/FileInputStream
    //   16: dup
    //   17: aload_0
    //   18: invokespecial 145	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   21: astore 7
    //   23: new 6	com/tencent/xweb/xwalk/a/a$a
    //   26: dup
    //   27: invokespecial 217	com/tencent/xweb/xwalk/a/a$a:<init>	()V
    //   30: astore_0
    //   31: aload 6
    //   33: invokevirtual 221	javax/xml/parsers/DocumentBuilderFactory:newDocumentBuilder	()Ljavax/xml/parsers/DocumentBuilder;
    //   36: aload 7
    //   38: invokevirtual 227	javax/xml/parsers/DocumentBuilder:parse	(Ljava/io/InputStream;)Lorg/w3c/dom/Document;
    //   41: invokeinterface 233 1 0
    //   46: astore_3
    //   47: aload_3
    //   48: ifnonnull +10 -> 58
    //   51: ldc -21
    //   53: invokestatic 241	org/xwalk/core/XWalkInitializer:addXWalkInitializeLog	(Ljava/lang/String;)V
    //   56: aconst_null
    //   57: areturn
    //   58: aload_0
    //   59: aload_3
    //   60: ldc -13
    //   62: invokeinterface 23 2 0
    //   67: putfield 244	com/tencent/xweb/xwalk/a/a$a:ypN	Ljava/lang/String;
    //   70: aload_0
    //   71: getfield 244	com/tencent/xweb/xwalk/a/a$a:ypN	Ljava/lang/String;
    //   74: ifnull +14 -> 88
    //   77: aload_0
    //   78: getfield 244	com/tencent/xweb/xwalk/a/a$a:ypN	Ljava/lang/String;
    //   81: aload_1
    //   82: invokevirtual 247	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   85: ifne +25 -> 110
    //   88: ldc2_w 248
    //   91: invokestatic 255	com/tencent/xweb/util/e:fx	(J)V
    //   94: ldc_w 257
    //   97: invokestatic 241	org/xwalk/core/XWalkInitializer:addXWalkInitializeLog	(Ljava/lang/String;)V
    //   100: aconst_null
    //   101: areturn
    //   102: astore_1
    //   103: ldc -21
    //   105: invokestatic 241	org/xwalk/core/XWalkInitializer:addXWalkInitializeLog	(Ljava/lang/String;)V
    //   108: aload_0
    //   109: areturn
    //   110: aload_0
    //   111: aload_3
    //   112: ldc_w 259
    //   115: invokeinterface 23 2 0
    //   120: putfield 262	com/tencent/xweb/xwalk/a/a$a:ypO	Ljava/lang/String;
    //   123: aload_0
    //   124: aload_3
    //   125: invokestatic 264	com/tencent/xweb/xwalk/a/a:a	(Lcom/tencent/xweb/xwalk/a/a$a;Lorg/w3c/dom/Element;)V
    //   128: aload_3
    //   129: ldc_w 266
    //   132: invokeinterface 45 2 0
    //   137: astore_1
    //   138: aload_1
    //   139: ifnull +275 -> 414
    //   142: aload_1
    //   143: invokeinterface 51 1 0
    //   148: ifeq +266 -> 414
    //   151: aload_0
    //   152: aload_1
    //   153: invokeinterface 51 1 0
    //   158: anewarray 12	com/tencent/xweb/xwalk/a/a$c
    //   161: putfield 270	com/tencent/xweb/xwalk/a/a$a:ypP	[Lcom/tencent/xweb/xwalk/a/a$c;
    //   164: iconst_0
    //   165: istore_2
    //   166: iload_2
    //   167: aload_1
    //   168: invokeinterface 51 1 0
    //   173: if_icmpge +241 -> 414
    //   176: new 12	com/tencent/xweb/xwalk/a/a$c
    //   179: dup
    //   180: invokespecial 271	com/tencent/xweb/xwalk/a/a$c:<init>	()V
    //   183: astore_3
    //   184: aload_1
    //   185: iload_2
    //   186: invokeinterface 65 2 0
    //   191: checkcast 19	org/w3c/dom/Element
    //   194: astore 4
    //   196: aload_3
    //   197: aload 4
    //   199: ldc_w 273
    //   202: invokeinterface 23 2 0
    //   207: putfield 274	com/tencent/xweb/xwalk/a/a$c:ypS	Ljava/lang/String;
    //   210: aload_3
    //   211: aload 4
    //   213: ldc 120
    //   215: invokeinterface 23 2 0
    //   220: putfield 275	com/tencent/xweb/xwalk/a/a$c:ypN	Ljava/lang/String;
    //   223: aload_3
    //   224: aload 4
    //   226: ldc_w 277
    //   229: invokeinterface 23 2 0
    //   234: putfield 280	com/tencent/xweb/xwalk/a/a$c:yqa	Ljava/lang/String;
    //   237: aload_3
    //   238: aload 4
    //   240: ldc 80
    //   242: invokestatic 69	com/tencent/xweb/xwalk/a/a:a	(Lorg/w3c/dom/Element;Ljava/lang/String;)I
    //   245: putfield 283	com/tencent/xweb/xwalk/a/a$c:ypU	I
    //   248: aload_3
    //   249: aload 4
    //   251: ldc 85
    //   253: invokestatic 69	com/tencent/xweb/xwalk/a/a:a	(Lorg/w3c/dom/Element;Ljava/lang/String;)I
    //   256: putfield 286	com/tencent/xweb/xwalk/a/a$c:ypV	I
    //   259: aload_3
    //   260: aload 4
    //   262: ldc_w 288
    //   265: invokestatic 69	com/tencent/xweb/xwalk/a/a:a	(Lorg/w3c/dom/Element;Ljava/lang/String;)I
    //   268: putfield 291	com/tencent/xweb/xwalk/a/a$c:ypW	I
    //   271: aload_3
    //   272: aload 4
    //   274: ldc_w 293
    //   277: invokestatic 69	com/tencent/xweb/xwalk/a/a:a	(Lorg/w3c/dom/Element;Ljava/lang/String;)I
    //   280: putfield 296	com/tencent/xweb/xwalk/a/a$c:ypX	I
    //   283: aload_3
    //   284: aload 4
    //   286: ldc_w 298
    //   289: invokestatic 69	com/tencent/xweb/xwalk/a/a:a	(Lorg/w3c/dom/Element;Ljava/lang/String;)I
    //   292: putfield 301	com/tencent/xweb/xwalk/a/a$c:ypZ	I
    //   295: aload_3
    //   296: aload 4
    //   298: ldc_w 303
    //   301: invokestatic 69	com/tencent/xweb/xwalk/a/a:a	(Lorg/w3c/dom/Element;Ljava/lang/String;)I
    //   304: putfield 306	com/tencent/xweb/xwalk/a/a$c:ypY	I
    //   307: aload_3
    //   308: aload 4
    //   310: ldc 125
    //   312: invokestatic 128	com/tencent/xweb/xwalk/a/a:b	(Lorg/w3c/dom/Element;Ljava/lang/String;)Z
    //   315: putfield 307	com/tencent/xweb/xwalk/a/a$c:ypT	Z
    //   318: aload_3
    //   319: aload 4
    //   321: ldc 90
    //   323: invokestatic 69	com/tencent/xweb/xwalk/a/a:a	(Lorg/w3c/dom/Element;Ljava/lang/String;)I
    //   326: putfield 310	com/tencent/xweb/xwalk/a/a$c:yqd	I
    //   329: aload_3
    //   330: getfield 314	com/tencent/xweb/xwalk/a/a$c:yqc	Lcom/tencent/xweb/xwalk/a/a$d;
    //   333: astore 5
    //   335: aload 5
    //   337: ifnull +54 -> 391
    //   340: aload 4
    //   342: ldc_w 316
    //   345: invokeinterface 45 2 0
    //   350: astore 6
    //   352: aload 6
    //   354: ifnull +37 -> 391
    //   357: aload 6
    //   359: invokeinterface 51 1 0
    //   364: ifeq +27 -> 391
    //   367: aload 5
    //   369: aload 6
    //   371: iconst_0
    //   372: invokeinterface 65 2 0
    //   377: checkcast 19	org/w3c/dom/Element
    //   380: ldc_w 318
    //   383: invokeinterface 23 2 0
    //   388: putfield 321	com/tencent/xweb/xwalk/a/a$d:yqe	Ljava/lang/String;
    //   391: aload_3
    //   392: aload 4
    //   394: invokestatic 323	com/tencent/xweb/xwalk/a/a:a	(Lorg/w3c/dom/Element;)[Lcom/tencent/xweb/xwalk/a/a$b;
    //   397: putfield 327	com/tencent/xweb/xwalk/a/a$c:yqb	[Lcom/tencent/xweb/xwalk/a/a$b;
    //   400: aload_0
    //   401: getfield 270	com/tencent/xweb/xwalk/a/a$a:ypP	[Lcom/tencent/xweb/xwalk/a/a$c;
    //   404: iload_2
    //   405: aload_3
    //   406: aastore
    //   407: iload_2
    //   408: iconst_1
    //   409: iadd
    //   410: istore_2
    //   411: goto -245 -> 166
    //   414: aload_0
    //   415: areturn
    //   416: astore_0
    //   417: aload 4
    //   419: astore_0
    //   420: ldc -21
    //   422: invokestatic 241	org/xwalk/core/XWalkInitializer:addXWalkInitializeLog	(Ljava/lang/String;)V
    //   425: aload_0
    //   426: areturn
    //   427: astore_0
    //   428: aload 5
    //   430: astore_0
    //   431: ldc -21
    //   433: invokestatic 241	org/xwalk/core/XWalkInitializer:addXWalkInitializeLog	(Ljava/lang/String;)V
    //   436: aload_0
    //   437: areturn
    //   438: astore_1
    //   439: goto -8 -> 431
    //   442: astore_1
    //   443: goto -23 -> 420
    //   446: astore_0
    //   447: aload_3
    //   448: astore_0
    //   449: goto -346 -> 103
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	452	0	paramFile	File
    //   0	452	1	paramString	String
    //   165	246	2	i	int
    //   7	441	3	localObject1	Object
    //   1	417	4	localElement	Element
    //   4	425	5	locald	d
    //   11	359	6	localObject2	Object
    //   21	16	7	localFileInputStream	FileInputStream
    // Exception table:
    //   from	to	target	type
    //   31	47	102	javax/xml/parsers/ParserConfigurationException
    //   51	56	102	javax/xml/parsers/ParserConfigurationException
    //   58	88	102	javax/xml/parsers/ParserConfigurationException
    //   88	100	102	javax/xml/parsers/ParserConfigurationException
    //   110	138	102	javax/xml/parsers/ParserConfigurationException
    //   142	164	102	javax/xml/parsers/ParserConfigurationException
    //   166	335	102	javax/xml/parsers/ParserConfigurationException
    //   340	352	102	javax/xml/parsers/ParserConfigurationException
    //   357	391	102	javax/xml/parsers/ParserConfigurationException
    //   391	407	102	javax/xml/parsers/ParserConfigurationException
    //   13	31	416	org/xml/sax/SAXException
    //   13	31	427	java/io/IOException
    //   31	47	438	java/io/IOException
    //   51	56	438	java/io/IOException
    //   58	88	438	java/io/IOException
    //   88	100	438	java/io/IOException
    //   110	138	438	java/io/IOException
    //   142	164	438	java/io/IOException
    //   166	335	438	java/io/IOException
    //   340	352	438	java/io/IOException
    //   357	391	438	java/io/IOException
    //   391	407	438	java/io/IOException
    //   31	47	442	org/xml/sax/SAXException
    //   51	56	442	org/xml/sax/SAXException
    //   58	88	442	org/xml/sax/SAXException
    //   88	100	442	org/xml/sax/SAXException
    //   110	138	442	org/xml/sax/SAXException
    //   142	164	442	org/xml/sax/SAXException
    //   166	335	442	org/xml/sax/SAXException
    //   340	352	442	org/xml/sax/SAXException
    //   357	391	442	org/xml/sax/SAXException
    //   391	407	442	org/xml/sax/SAXException
    //   13	31	446	javax/xml/parsers/ParserConfigurationException
  }
  
  public static final class a
  {
    public String ypN;
    public String ypO;
    public a.c[] ypP;
    public com.tencent.xweb.a.a[] ypQ;
  }
  
  public static final class b
  {
    public String ypN;
    public int ypR;
    public String ypS;
    public boolean ypT;
  }
  
  public static final class c
  {
    public String ypN;
    public String ypS;
    public boolean ypT;
    public int ypU;
    public int ypV;
    public int ypW;
    public int ypX;
    public int ypY;
    public int ypZ;
    public String yqa;
    public a.b[] yqb;
    public a.d yqc = new a.d();
    public int yqd;
  }
  
  public static final class d
  {
    public String yqe = "";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\xwalk\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */