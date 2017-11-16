package com.tencent.mm.c;

import com.tencent.gmtrace.GMTrace;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public final class f
{
  private static boolean erj;
  
  static
  {
    GMTrace.i(14024007745536L, 104487);
    erj = false;
    GMTrace.o(14024007745536L, 104487);
  }
  
  private static void a(Map<String, String> paramMap, String paramString1, String paramString2, Node paramNode, int paramInt)
  {
    GMTrace.i(14024276180992L, 104489);
    if (paramNode.getNodeName().equals("#text"))
    {
      paramMap.put(paramString1, paramNode.getNodeValue());
      paramMap.put(paramString2, paramNode.getNodeValue());
      GMTrace.o(14024276180992L, 104489);
      return;
    }
    if (paramNode.getNodeName().equals("#cdata-section"))
    {
      paramMap.put(paramString1, paramNode.getNodeValue());
      paramMap.put(paramString2, paramNode.getNodeValue());
      GMTrace.o(14024276180992L, 104489);
      return;
    }
    Object localObject = paramString1 + "." + paramNode.getNodeName();
    paramString1 = paramString2 + "." + paramNode.getNodeName();
    if (paramInt > 0)
    {
      paramString2 = localObject + paramInt;
      paramMap.put(paramString2, paramNode.getNodeValue());
      paramString1 = paramString1 + "#" + paramInt;
      paramMap.put(paramString1, paramNode.getNodeValue());
      localObject = paramNode.getAttributes();
      if (localObject != null) {
        paramInt = 0;
      }
    }
    for (;;)
    {
      if (paramInt >= ((NamedNodeMap)localObject).getLength())
      {
        localObject = new HashMap();
        paramNode = paramNode.getChildNodes();
        paramInt = 0;
        if (paramInt < paramNode.getLength()) {
          break label456;
        }
        GMTrace.o(14024276180992L, 104489);
        return;
        paramMap.put(localObject, paramNode.getNodeValue());
        paramMap.put(paramString1, paramNode.getNodeValue());
        paramString2 = (String)localObject;
        break;
      }
      localNode = ((NamedNodeMap)localObject).item(paramInt);
      paramMap.put(paramString2 + ".$" + localNode.getNodeName(), localNode.getNodeValue());
      paramMap.put(paramString1 + ".$" + localNode.getNodeName(), localNode.getNodeValue());
      paramInt += 1;
    }
    label456:
    Node localNode = paramNode.item(paramInt);
    Integer localInteger = (Integer)((HashMap)localObject).get(localNode.getNodeName());
    if (localInteger == null) {}
    for (int i = 0;; i = localInteger.intValue())
    {
      a(paramMap, paramString2, paramString1, localNode, i);
      ((HashMap)localObject).put(localNode.getNodeName(), Integer.valueOf(i + 1));
      paramInt += 1;
      break;
    }
  }
  
  private static void h(Map<String, String> paramMap)
  {
    GMTrace.i(14024410398720L, 104490);
    if (paramMap.size() <= 0)
    {
      System.err.println("empty values");
      GMTrace.o(14024410398720L, 104490);
      return;
    }
    paramMap = paramMap.entrySet().iterator();
    for (;;)
    {
      if (!paramMap.hasNext())
      {
        GMTrace.o(14024410398720L, 104490);
        return;
      }
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      System.err.println("key=" + (String)localEntry.getKey() + " value=" + (String)localEntry.getValue());
    }
  }
  
  /* Error */
  public static Map<String, String> q(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc2_w 189
    //   3: ldc -65
    //   5: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: ifnonnull +27 -> 36
    //   12: iconst_m1
    //   13: istore_2
    //   14: iload_2
    //   15: ifge +31 -> 46
    //   18: getstatic 136	java/lang/System:err	Ljava/io/PrintStream;
    //   21: ldc -63
    //   23: invokevirtual 143	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   26: ldc2_w 189
    //   29: ldc -65
    //   31: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   34: aconst_null
    //   35: areturn
    //   36: aload_0
    //   37: bipush 60
    //   39: invokevirtual 197	java/lang/String:indexOf	(I)I
    //   42: istore_2
    //   43: goto -29 -> 14
    //   46: aload_0
    //   47: astore_3
    //   48: iload_2
    //   49: ifle +31 -> 80
    //   52: getstatic 136	java/lang/System:err	Ljava/io/PrintStream;
    //   55: new 55	java/lang/StringBuilder
    //   58: dup
    //   59: ldc -57
    //   61: invokespecial 63	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   64: iload_2
    //   65: invokevirtual 75	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   68: invokevirtual 72	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   71: invokevirtual 143	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   74: aload_0
    //   75: iload_2
    //   76: invokevirtual 203	java/lang/String:substring	(I)Ljava/lang/String;
    //   79: astore_3
    //   80: aload_3
    //   81: ifnull +10 -> 91
    //   84: aload_3
    //   85: invokevirtual 206	java/lang/String:length	()I
    //   88: ifgt +13 -> 101
    //   91: ldc2_w 189
    //   94: ldc -65
    //   96: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   99: aconst_null
    //   100: areturn
    //   101: new 89	java/util/HashMap
    //   104: dup
    //   105: invokespecial 91	java/util/HashMap:<init>	()V
    //   108: astore 4
    //   110: invokestatic 212	javax/xml/parsers/DocumentBuilderFactory:newInstance	()Ljavax/xml/parsers/DocumentBuilderFactory;
    //   113: astore_0
    //   114: aload_0
    //   115: invokevirtual 216	javax/xml/parsers/DocumentBuilderFactory:newDocumentBuilder	()Ljavax/xml/parsers/DocumentBuilder;
    //   118: astore_0
    //   119: aload_0
    //   120: ifnonnull +32 -> 152
    //   123: getstatic 136	java/lang/System:err	Ljava/io/PrintStream;
    //   126: ldc -38
    //   128: invokevirtual 143	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   131: ldc2_w 189
    //   134: ldc -65
    //   136: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   139: aconst_null
    //   140: areturn
    //   141: astore_0
    //   142: ldc2_w 189
    //   145: ldc -65
    //   147: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   150: aconst_null
    //   151: areturn
    //   152: aload_0
    //   153: new 220	org/xml/sax/InputSource
    //   156: dup
    //   157: new 222	java/io/ByteArrayInputStream
    //   160: dup
    //   161: aload_3
    //   162: invokevirtual 226	java/lang/String:getBytes	()[B
    //   165: invokespecial 229	java/io/ByteArrayInputStream:<init>	([B)V
    //   168: invokespecial 232	org/xml/sax/InputSource:<init>	(Ljava/io/InputStream;)V
    //   171: invokevirtual 238	javax/xml/parsers/DocumentBuilder:parse	(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;
    //   174: astore_0
    //   175: aload_0
    //   176: invokeinterface 243 1 0
    //   181: aload_0
    //   182: ifnonnull +54 -> 236
    //   185: getstatic 136	java/lang/System:err	Ljava/io/PrintStream;
    //   188: ldc -11
    //   190: invokevirtual 143	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   193: ldc2_w 189
    //   196: ldc -65
    //   198: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   201: aconst_null
    //   202: areturn
    //   203: astore_0
    //   204: ldc2_w 189
    //   207: ldc -65
    //   209: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   212: aconst_null
    //   213: areturn
    //   214: astore_0
    //   215: ldc2_w 189
    //   218: ldc -65
    //   220: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   223: aconst_null
    //   224: areturn
    //   225: astore_0
    //   226: ldc2_w 189
    //   229: ldc -65
    //   231: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   234: aconst_null
    //   235: areturn
    //   236: aload_0
    //   237: invokeinterface 249 1 0
    //   242: astore_0
    //   243: aload_0
    //   244: ifnonnull +21 -> 265
    //   247: getstatic 136	java/lang/System:err	Ljava/io/PrintStream;
    //   250: ldc -5
    //   252: invokevirtual 143	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   255: ldc2_w 189
    //   258: ldc -65
    //   260: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   263: aconst_null
    //   264: areturn
    //   265: aload_1
    //   266: ifnull +51 -> 317
    //   269: aload_1
    //   270: aload_0
    //   271: invokeinterface 254 1 0
    //   276: invokevirtual 42	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   279: ifeq +38 -> 317
    //   282: aload 4
    //   284: ldc_w 256
    //   287: ldc_w 256
    //   290: aload_0
    //   291: iconst_0
    //   292: invokestatic 113	com/tencent/mm/c/f:a	(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lorg/w3c/dom/Node;I)V
    //   295: getstatic 19	com/tencent/mm/c/f:erj	Z
    //   298: ifeq +8 -> 306
    //   301: aload 4
    //   303: invokestatic 258	com/tencent/mm/c/f:h	(Ljava/util/Map;)V
    //   306: ldc2_w 189
    //   309: ldc -65
    //   311: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   314: aload 4
    //   316: areturn
    //   317: aload_0
    //   318: aload_1
    //   319: invokeinterface 262 2 0
    //   324: astore_0
    //   325: aload_0
    //   326: invokeinterface 98 1 0
    //   331: ifgt +22 -> 353
    //   334: getstatic 136	java/lang/System:err	Ljava/io/PrintStream;
    //   337: ldc_w 264
    //   340: invokevirtual 143	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   343: ldc2_w 189
    //   346: ldc -65
    //   348: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   351: aconst_null
    //   352: areturn
    //   353: aload_0
    //   354: invokeinterface 98 1 0
    //   359: iconst_1
    //   360: if_icmple +12 -> 372
    //   363: getstatic 136	java/lang/System:err	Ljava/io/PrintStream;
    //   366: ldc_w 266
    //   369: invokevirtual 143	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   372: aload 4
    //   374: ldc_w 256
    //   377: ldc_w 256
    //   380: aload_0
    //   381: iconst_0
    //   382: invokeinterface 105 2 0
    //   387: iconst_0
    //   388: invokestatic 113	com/tencent/mm/c/f:a	(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lorg/w3c/dom/Node;I)V
    //   391: goto -96 -> 295
    //   394: astore_0
    //   395: aconst_null
    //   396: astore_0
    //   397: goto -216 -> 181
    //   400: astore_3
    //   401: goto -220 -> 181
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	404	0	paramString1	String
    //   0	404	1	paramString2	String
    //   13	63	2	i	int
    //   47	115	3	str	String
    //   400	1	3	localDOMException	org.w3c.dom.DOMException
    //   108	265	4	localHashMap	HashMap
    // Exception table:
    //   from	to	target	type
    //   114	119	141	javax/xml/parsers/ParserConfigurationException
    //   152	175	203	org/xml/sax/SAXException
    //   175	181	203	org/xml/sax/SAXException
    //   152	175	214	java/io/IOException
    //   175	181	214	java/io/IOException
    //   152	175	225	java/lang/Exception
    //   175	181	225	java/lang/Exception
    //   152	175	394	org/w3c/dom/DOMException
    //   175	181	400	org/w3c/dom/DOMException
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */