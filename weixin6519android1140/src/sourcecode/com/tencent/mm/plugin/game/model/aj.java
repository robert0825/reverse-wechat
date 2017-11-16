package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.LinkedList;

public final class aj
{
  /* Error */
  private static String O(LinkedList<q.h> paramLinkedList)
  {
    // Byte code:
    //   0: ldc2_w 9
    //   3: ldc 11
    //   5: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: invokestatic 23	com/tencent/mm/sdk/platformtools/bg:cc	(Ljava/util/List;)Z
    //   12: ifeq +14 -> 26
    //   15: ldc2_w 9
    //   18: ldc 11
    //   20: invokestatic 26	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   23: ldc 28
    //   25: areturn
    //   26: new 30	java/io/StringWriter
    //   29: dup
    //   30: invokespecial 34	java/io/StringWriter:<init>	()V
    //   33: astore_1
    //   34: invokestatic 40	org/xmlpull/v1/XmlPullParserFactory:newInstance	()Lorg/xmlpull/v1/XmlPullParserFactory;
    //   37: invokevirtual 44	org/xmlpull/v1/XmlPullParserFactory:newSerializer	()Lorg/xmlpull/v1/XmlSerializer;
    //   40: astore_2
    //   41: aload_2
    //   42: aload_1
    //   43: invokeinterface 50 2 0
    //   48: aload_0
    //   49: invokevirtual 56	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   52: astore_0
    //   53: aload_0
    //   54: invokeinterface 62 1 0
    //   59: ifeq +320 -> 379
    //   62: aload_0
    //   63: invokeinterface 66 1 0
    //   68: checkcast 68	com/tencent/mm/plugin/game/model/q$h
    //   71: astore_3
    //   72: aload_2
    //   73: aconst_null
    //   74: ldc 70
    //   76: invokeinterface 74 3 0
    //   81: pop
    //   82: aload_2
    //   83: aconst_null
    //   84: ldc 76
    //   86: aload_3
    //   87: getfield 80	com/tencent/mm/plugin/game/model/q$h:lNN	Ljava/lang/String;
    //   90: invokeinterface 84 4 0
    //   95: pop
    //   96: aload_2
    //   97: aconst_null
    //   98: ldc 86
    //   100: invokeinterface 74 3 0
    //   105: pop
    //   106: aload_2
    //   107: aload_3
    //   108: getfield 89	com/tencent/mm/plugin/game/model/q$h:userName	Ljava/lang/String;
    //   111: ldc 28
    //   113: invokestatic 93	com/tencent/mm/sdk/platformtools/bg:aq	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   116: invokeinterface 97 2 0
    //   121: pop
    //   122: aload_2
    //   123: aconst_null
    //   124: ldc 86
    //   126: invokeinterface 100 3 0
    //   131: pop
    //   132: aload_2
    //   133: aconst_null
    //   134: ldc 102
    //   136: invokeinterface 74 3 0
    //   141: pop
    //   142: aload_2
    //   143: aload_3
    //   144: getfield 105	com/tencent/mm/plugin/game/model/q$h:aDn	Ljava/lang/String;
    //   147: ldc 28
    //   149: invokestatic 93	com/tencent/mm/sdk/platformtools/bg:aq	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   152: invokeinterface 97 2 0
    //   157: pop
    //   158: aload_2
    //   159: aconst_null
    //   160: ldc 102
    //   162: invokeinterface 100 3 0
    //   167: pop
    //   168: aload_2
    //   169: aconst_null
    //   170: ldc 107
    //   172: invokeinterface 74 3 0
    //   177: pop
    //   178: aload_2
    //   179: aload_3
    //   180: getfield 110	com/tencent/mm/plugin/game/model/q$h:lNK	Ljava/lang/String;
    //   183: ldc 28
    //   185: invokestatic 93	com/tencent/mm/sdk/platformtools/bg:aq	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   188: invokeinterface 97 2 0
    //   193: pop
    //   194: aload_2
    //   195: aconst_null
    //   196: ldc 107
    //   198: invokeinterface 100 3 0
    //   203: pop
    //   204: aload_2
    //   205: aconst_null
    //   206: ldc 112
    //   208: invokeinterface 74 3 0
    //   213: pop
    //   214: aload_2
    //   215: aload_3
    //   216: getfield 115	com/tencent/mm/plugin/game/model/q$h:lNL	Ljava/lang/String;
    //   219: ldc 28
    //   221: invokestatic 93	com/tencent/mm/sdk/platformtools/bg:aq	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   224: invokeinterface 97 2 0
    //   229: pop
    //   230: aload_2
    //   231: aconst_null
    //   232: ldc 112
    //   234: invokeinterface 100 3 0
    //   239: pop
    //   240: aload_2
    //   241: aconst_null
    //   242: ldc 117
    //   244: invokeinterface 74 3 0
    //   249: pop
    //   250: aload_2
    //   251: aload_3
    //   252: getfield 120	com/tencent/mm/plugin/game/model/q$h:lNM	Ljava/lang/String;
    //   255: ldc 28
    //   257: invokestatic 93	com/tencent/mm/sdk/platformtools/bg:aq	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   260: invokeinterface 97 2 0
    //   265: pop
    //   266: aload_2
    //   267: aconst_null
    //   268: ldc 117
    //   270: invokeinterface 100 3 0
    //   275: pop
    //   276: aload_2
    //   277: aconst_null
    //   278: ldc 70
    //   280: invokeinterface 100 3 0
    //   285: pop
    //   286: goto -233 -> 53
    //   289: astore_0
    //   290: ldc 122
    //   292: aload_0
    //   293: invokevirtual 126	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   296: invokestatic 132	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   299: ldc2_w 9
    //   302: ldc 11
    //   304: invokestatic 26	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   307: ldc 28
    //   309: areturn
    //   310: astore 4
    //   312: aload_2
    //   313: ldc 28
    //   315: invokeinterface 97 2 0
    //   320: pop
    //   321: goto -199 -> 122
    //   324: astore 4
    //   326: aload_2
    //   327: ldc 28
    //   329: invokeinterface 97 2 0
    //   334: pop
    //   335: goto -177 -> 158
    //   338: astore 4
    //   340: aload_2
    //   341: ldc 28
    //   343: invokeinterface 97 2 0
    //   348: pop
    //   349: goto -155 -> 194
    //   352: astore 4
    //   354: aload_2
    //   355: ldc 28
    //   357: invokeinterface 97 2 0
    //   362: pop
    //   363: goto -133 -> 230
    //   366: astore_3
    //   367: aload_2
    //   368: ldc 28
    //   370: invokeinterface 97 2 0
    //   375: pop
    //   376: goto -110 -> 266
    //   379: aload_2
    //   380: invokeinterface 135 1 0
    //   385: aload_1
    //   386: invokevirtual 138	java/io/StringWriter:flush	()V
    //   389: aload_1
    //   390: invokevirtual 141	java/io/StringWriter:close	()V
    //   393: aload_1
    //   394: invokevirtual 145	java/io/StringWriter:getBuffer	()Ljava/lang/StringBuffer;
    //   397: invokevirtual 150	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   400: astore_0
    //   401: ldc2_w 9
    //   404: ldc 11
    //   406: invokestatic 26	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   409: aload_0
    //   410: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	411	0	paramLinkedList	LinkedList<q.h>
    //   33	361	1	localStringWriter	java.io.StringWriter
    //   40	340	2	localXmlSerializer	org.xmlpull.v1.XmlSerializer
    //   71	181	3	localh	q.h
    //   366	1	3	localException1	Exception
    //   310	1	4	localException2	Exception
    //   324	1	4	localException3	Exception
    //   338	1	4	localException4	Exception
    //   352	1	4	localException5	Exception
    // Exception table:
    //   from	to	target	type
    //   34	53	289	java/lang/Exception
    //   53	106	289	java/lang/Exception
    //   122	142	289	java/lang/Exception
    //   158	178	289	java/lang/Exception
    //   194	214	289	java/lang/Exception
    //   230	250	289	java/lang/Exception
    //   266	286	289	java/lang/Exception
    //   312	321	289	java/lang/Exception
    //   326	335	289	java/lang/Exception
    //   340	349	289	java/lang/Exception
    //   354	363	289	java/lang/Exception
    //   367	376	289	java/lang/Exception
    //   379	393	289	java/lang/Exception
    //   106	122	310	java/lang/Exception
    //   142	158	324	java/lang/Exception
    //   178	194	338	java/lang/Exception
    //   214	230	352	java/lang/Exception
    //   250	266	366	java/lang/Exception
  }
  
  public static String a(String paramString, LinkedList<q.h> paramLinkedList, HashMap<String, q.d> paramHashMap)
  {
    GMTrace.i(12587878055936L, 93787);
    if ((bg.nm(paramString)) || (bg.cc(paramLinkedList)))
    {
      GMTrace.o(12587878055936L, 93787);
      return paramString;
    }
    String str1 = O(paramLinkedList);
    if (bg.nm(str1))
    {
      GMTrace.o(12587878055936L, 93787);
      return paramString;
    }
    String str2 = a(paramLinkedList, paramHashMap);
    paramHashMap = new StringBuilder(paramString);
    try
    {
      if (paramHashMap.indexOf("<userinfo>") != -1) {
        paramHashMap.insert(paramHashMap.indexOf("<userinfo>"), "<usercount>" + paramLinkedList.size() + 1 + "</usercount>");
      }
      if (paramHashMap.lastIndexOf("</userinfo>") != -1) {
        paramHashMap.insert(paramHashMap.lastIndexOf("</userinfo>") + 11, str1);
      }
      if ((paramHashMap.lastIndexOf("</jump>") != -1) && (!bg.nm(str2))) {
        paramHashMap.insert(paramHashMap.lastIndexOf("</jump>") + 7, str2);
      }
    }
    catch (Exception paramLinkedList)
    {
      for (;;)
      {
        w.e("MicroMsg.GameXmlProcess", paramLinkedList.getMessage());
        w.e("MicroMsg.GameXmlProcess", "xml is invalid : " + paramString);
      }
    }
    paramString = paramHashMap.toString();
    GMTrace.o(12587878055936L, 93787);
    return paramString;
  }
  
  /* Error */
  private static String a(LinkedList<q.h> paramLinkedList, HashMap<String, q.d> paramHashMap)
  {
    // Byte code:
    //   0: ldc2_w 209
    //   3: ldc -45
    //   5: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: invokestatic 23	com/tencent/mm/sdk/platformtools/bg:cc	(Ljava/util/List;)Z
    //   12: ifne +10 -> 22
    //   15: aload_1
    //   16: invokevirtual 216	java/util/HashMap:isEmpty	()Z
    //   19: ifeq +14 -> 33
    //   22: ldc2_w 209
    //   25: ldc -45
    //   27: invokestatic 26	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   30: ldc 28
    //   32: areturn
    //   33: new 30	java/io/StringWriter
    //   36: dup
    //   37: invokespecial 34	java/io/StringWriter:<init>	()V
    //   40: astore_2
    //   41: invokestatic 40	org/xmlpull/v1/XmlPullParserFactory:newInstance	()Lorg/xmlpull/v1/XmlPullParserFactory;
    //   44: invokevirtual 44	org/xmlpull/v1/XmlPullParserFactory:newSerializer	()Lorg/xmlpull/v1/XmlSerializer;
    //   47: astore_3
    //   48: aload_3
    //   49: aload_2
    //   50: invokeinterface 50 2 0
    //   55: aload_0
    //   56: invokevirtual 56	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   59: astore_0
    //   60: aload_0
    //   61: invokeinterface 62 1 0
    //   66: ifeq +192 -> 258
    //   69: aload_0
    //   70: invokeinterface 66 1 0
    //   75: checkcast 68	com/tencent/mm/plugin/game/model/q$h
    //   78: astore 5
    //   80: aload_1
    //   81: aload 5
    //   83: getfield 80	com/tencent/mm/plugin/game/model/q$h:lNN	Ljava/lang/String;
    //   86: invokevirtual 220	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   89: checkcast 222	com/tencent/mm/plugin/game/model/q$d
    //   92: astore 4
    //   94: aload 4
    //   96: ifnull -36 -> 60
    //   99: aload_3
    //   100: aconst_null
    //   101: ldc -32
    //   103: invokeinterface 74 3 0
    //   108: pop
    //   109: aload_3
    //   110: aconst_null
    //   111: ldc -30
    //   113: aload 5
    //   115: getfield 80	com/tencent/mm/plugin/game/model/q$h:lNN	Ljava/lang/String;
    //   118: invokeinterface 84 4 0
    //   123: pop
    //   124: aload_3
    //   125: aconst_null
    //   126: ldc -28
    //   128: invokeinterface 74 3 0
    //   133: pop
    //   134: aload_3
    //   135: aload 4
    //   137: getfield 232	com/tencent/mm/plugin/game/model/q$d:lNE	I
    //   140: invokestatic 238	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   143: invokeinterface 97 2 0
    //   148: pop
    //   149: aload_3
    //   150: aconst_null
    //   151: ldc -28
    //   153: invokeinterface 100 3 0
    //   158: pop
    //   159: aload_3
    //   160: aconst_null
    //   161: ldc -16
    //   163: invokeinterface 74 3 0
    //   168: pop
    //   169: aload_3
    //   170: aload 4
    //   172: getfield 243	com/tencent/mm/plugin/game/model/q$d:kHd	Ljava/lang/String;
    //   175: ldc 28
    //   177: invokestatic 93	com/tencent/mm/sdk/platformtools/bg:aq	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   180: invokeinterface 97 2 0
    //   185: pop
    //   186: aload_3
    //   187: aconst_null
    //   188: ldc -16
    //   190: invokeinterface 100 3 0
    //   195: pop
    //   196: aload_3
    //   197: aconst_null
    //   198: ldc -32
    //   200: invokeinterface 100 3 0
    //   205: pop
    //   206: goto -146 -> 60
    //   209: astore_0
    //   210: ldc 122
    //   212: aload_0
    //   213: invokevirtual 126	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   216: invokestatic 132	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   219: ldc2_w 209
    //   222: ldc -45
    //   224: invokestatic 26	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   227: ldc 28
    //   229: areturn
    //   230: astore 5
    //   232: aload_3
    //   233: ldc 28
    //   235: invokeinterface 97 2 0
    //   240: pop
    //   241: goto -92 -> 149
    //   244: astore 4
    //   246: aload_3
    //   247: ldc 28
    //   249: invokeinterface 97 2 0
    //   254: pop
    //   255: goto -69 -> 186
    //   258: aload_3
    //   259: invokeinterface 135 1 0
    //   264: aload_2
    //   265: invokevirtual 138	java/io/StringWriter:flush	()V
    //   268: aload_2
    //   269: invokevirtual 141	java/io/StringWriter:close	()V
    //   272: aload_2
    //   273: invokevirtual 145	java/io/StringWriter:getBuffer	()Ljava/lang/StringBuffer;
    //   276: invokevirtual 150	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   279: astore_0
    //   280: ldc2_w 209
    //   283: ldc -45
    //   285: invokestatic 26	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   288: aload_0
    //   289: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	290	0	paramLinkedList	LinkedList<q.h>
    //   0	290	1	paramHashMap	HashMap<String, q.d>
    //   40	233	2	localStringWriter	java.io.StringWriter
    //   47	212	3	localXmlSerializer	org.xmlpull.v1.XmlSerializer
    //   92	79	4	locald	q.d
    //   244	1	4	localException1	Exception
    //   78	36	5	localh	q.h
    //   230	1	5	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   41	60	209	java/lang/Exception
    //   60	94	209	java/lang/Exception
    //   99	134	209	java/lang/Exception
    //   149	169	209	java/lang/Exception
    //   186	206	209	java/lang/Exception
    //   232	241	209	java/lang/Exception
    //   246	255	209	java/lang/Exception
    //   258	272	209	java/lang/Exception
    //   134	149	230	java/lang/Exception
    //   169	186	244	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */