package com.tencent.mm.plugin.emoji.e;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.storage.emotion.c;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public final class a
{
  String khK;
  int khL;
  int khM;
  HashMap<String, String> khN;
  HashMap<String, ArrayList<String>> khO;
  HashMap<String, String> khP;
  HashMap<String, ArrayList<a>> khQ;
  Comparator khR;
  public boolean mInit;
  
  public a()
  {
    GMTrace.i(11551851413504L, 86068);
    this.mInit = false;
    this.khL = 2;
    this.khM = 32;
    this.khN = new HashMap();
    this.khO = new HashMap();
    this.khP = new HashMap();
    this.khQ = new HashMap();
    this.khR = new Comparator() {};
    GMTrace.o(11551851413504L, 86068);
  }
  
  public final void aqs()
  {
    GMTrace.i(11552119848960L, 86070);
    at.xB().A(new Runnable()
    {
      /* Error */
      public final void run()
      {
        // Byte code:
        //   0: ldc2_w 36
        //   3: ldc 38
        //   5: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: invokestatic 44	java/lang/System:currentTimeMillis	()J
        //   11: lstore 4
        //   13: aload_0
        //   14: getfield 17	com/tencent/mm/plugin/emoji/e/a$2:khS	Lcom/tencent/mm/plugin/emoji/e/a;
        //   17: astore 13
        //   19: aload 13
        //   21: invokevirtual 47	com/tencent/mm/plugin/emoji/e/a:clear	()V
        //   24: aconst_null
        //   25: astore 9
        //   27: aconst_null
        //   28: astore 8
        //   30: invokestatic 53	com/tencent/mm/plugin/emoji/model/h:arl	()Lcom/tencent/mm/plugin/emoji/e/l;
        //   33: getfield 59	com/tencent/mm/plugin/emoji/e/l:kjI	Lcom/tencent/mm/storage/emotion/f;
        //   36: invokevirtual 65	com/tencent/mm/storage/emotion/f:Mx	()Landroid/database/Cursor;
        //   39: astore 10
        //   41: aload 10
        //   43: ifnull +264 -> 307
        //   46: aload 10
        //   48: astore 8
        //   50: aload 10
        //   52: astore 9
        //   54: aload 10
        //   56: invokeinterface 71 1 0
        //   61: ifeq +246 -> 307
        //   64: aload 10
        //   66: astore 8
        //   68: aload 10
        //   70: astore 9
        //   72: aload 10
        //   74: invokeinterface 75 1 0
        //   79: istore_2
        //   80: iconst_0
        //   81: istore_1
        //   82: iload_1
        //   83: iload_2
        //   84: if_icmpge +223 -> 307
        //   87: aload 10
        //   89: astore 8
        //   91: aload 10
        //   93: astore 9
        //   95: new 77	com/tencent/mm/storage/emotion/e
        //   98: dup
        //   99: invokespecial 78	com/tencent/mm/storage/emotion/e:<init>	()V
        //   102: astore 14
        //   104: aload 10
        //   106: astore 8
        //   108: aload 10
        //   110: astore 9
        //   112: aload 14
        //   114: aload 10
        //   116: invokevirtual 82	com/tencent/mm/storage/emotion/e:b	(Landroid/database/Cursor;)V
        //   119: aload 10
        //   121: astore 8
        //   123: aload 10
        //   125: astore 9
        //   127: aload 14
        //   129: getfield 86	com/tencent/mm/storage/emotion/e:field_desc	Ljava/lang/String;
        //   132: astore 11
        //   134: aload 10
        //   136: astore 8
        //   138: aload 10
        //   140: astore 9
        //   142: aload 11
        //   144: invokestatic 92	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
        //   147: ifne +137 -> 284
        //   150: aload 10
        //   152: astore 8
        //   154: aload 10
        //   156: astore 9
        //   158: aload 11
        //   160: invokevirtual 98	java/lang/String:toLowerCase	()Ljava/lang/String;
        //   163: astore 11
        //   165: aload 10
        //   167: astore 8
        //   169: aload 10
        //   171: astore 9
        //   173: aload 13
        //   175: getfield 102	com/tencent/mm/plugin/emoji/e/a:khP	Ljava/util/HashMap;
        //   178: aload 11
        //   180: aload 14
        //   182: getfield 105	com/tencent/mm/storage/emotion/e:field_groupID	Ljava/lang/String;
        //   185: invokevirtual 111	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   188: pop
        //   189: aload 10
        //   191: astore 8
        //   193: aload 10
        //   195: astore 9
        //   197: aload 13
        //   199: getfield 114	com/tencent/mm/plugin/emoji/e/a:khO	Ljava/util/HashMap;
        //   202: aload 14
        //   204: getfield 105	com/tencent/mm/storage/emotion/e:field_groupID	Ljava/lang/String;
        //   207: invokevirtual 118	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   210: checkcast 120	java/util/ArrayList
        //   213: astore 12
        //   215: aload 12
        //   217: astore 11
        //   219: aload 12
        //   221: ifnonnull +20 -> 241
        //   224: aload 10
        //   226: astore 8
        //   228: aload 10
        //   230: astore 9
        //   232: new 120	java/util/ArrayList
        //   235: dup
        //   236: invokespecial 121	java/util/ArrayList:<init>	()V
        //   239: astore 11
        //   241: aload 10
        //   243: astore 8
        //   245: aload 10
        //   247: astore 9
        //   249: aload 11
        //   251: aload 14
        //   253: getfield 86	com/tencent/mm/storage/emotion/e:field_desc	Ljava/lang/String;
        //   256: invokevirtual 125	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   259: pop
        //   260: aload 10
        //   262: astore 8
        //   264: aload 10
        //   266: astore 9
        //   268: aload 13
        //   270: getfield 114	com/tencent/mm/plugin/emoji/e/a:khO	Ljava/util/HashMap;
        //   273: aload 14
        //   275: getfield 105	com/tencent/mm/storage/emotion/e:field_groupID	Ljava/lang/String;
        //   278: aload 11
        //   280: invokevirtual 111	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   283: pop
        //   284: aload 10
        //   286: astore 8
        //   288: aload 10
        //   290: astore 9
        //   292: aload 10
        //   294: invokeinterface 128 1 0
        //   299: pop
        //   300: iload_1
        //   301: iconst_1
        //   302: iadd
        //   303: istore_1
        //   304: goto -222 -> 82
        //   307: aload 10
        //   309: ifnull +10 -> 319
        //   312: aload 10
        //   314: invokeinterface 131 1 0
        //   319: invokestatic 136	com/tencent/mm/sdk/platformtools/v:bPK	()Ljava/lang/String;
        //   322: invokevirtual 98	java/lang/String:toLowerCase	()Ljava/lang/String;
        //   325: astore 14
        //   327: aload 13
        //   329: aload 14
        //   331: putfield 139	com/tencent/mm/plugin/emoji/e/a:khK	Ljava/lang/String;
        //   334: aconst_null
        //   335: astore 11
        //   337: aconst_null
        //   338: astore 10
        //   340: aload 10
        //   342: astore 9
        //   344: aload 11
        //   346: astore 8
        //   348: invokestatic 44	java/lang/System:currentTimeMillis	()J
        //   351: lstore 6
        //   353: aload 10
        //   355: astore 9
        //   357: aload 11
        //   359: astore 8
        //   361: invokestatic 53	com/tencent/mm/plugin/emoji/model/h:arl	()Lcom/tencent/mm/plugin/emoji/e/l;
        //   364: getfield 143	com/tencent/mm/plugin/emoji/e/l:kjA	Lcom/tencent/mm/storage/emotion/c;
        //   367: ldc -111
        //   369: iconst_0
        //   370: anewarray 94	java/lang/String
        //   373: invokevirtual 151	com/tencent/mm/storage/emotion/c:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //   376: astore 10
        //   378: aload 10
        //   380: astore 9
        //   382: aload 10
        //   384: astore 8
        //   386: ldc -103
        //   388: ldc -101
        //   390: iconst_1
        //   391: anewarray 4	java/lang/Object
        //   394: dup
        //   395: iconst_0
        //   396: new 157	java/lang/StringBuilder
        //   399: dup
        //   400: invokespecial 158	java/lang/StringBuilder:<init>	()V
        //   403: invokestatic 44	java/lang/System:currentTimeMillis	()J
        //   406: lload 6
        //   408: lsub
        //   409: invokevirtual 162	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
        //   412: invokevirtual 165	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   415: aastore
        //   416: invokestatic 170	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   419: aload 10
        //   421: ifnull +579 -> 1000
        //   424: aload 10
        //   426: astore 9
        //   428: aload 10
        //   430: astore 8
        //   432: aload 10
        //   434: invokeinterface 71 1 0
        //   439: ifeq +561 -> 1000
        //   442: aload 10
        //   444: astore 9
        //   446: aload 10
        //   448: astore 8
        //   450: aload 10
        //   452: invokeinterface 71 1 0
        //   457: pop
        //   458: aload 10
        //   460: astore 9
        //   462: aload 10
        //   464: astore 8
        //   466: aload 10
        //   468: invokeinterface 75 1 0
        //   473: istore_2
        //   474: iconst_0
        //   475: istore_1
        //   476: iload_1
        //   477: iload_2
        //   478: if_icmpge +522 -> 1000
        //   481: aload 10
        //   483: astore 9
        //   485: aload 10
        //   487: astore 8
        //   489: aload 10
        //   491: aload 10
        //   493: ldc -84
        //   495: invokeinterface 176 2 0
        //   500: invokeinterface 180 2 0
        //   505: astore 11
        //   507: aload 10
        //   509: astore 9
        //   511: aload 10
        //   513: astore 8
        //   515: aload 10
        //   517: aload 10
        //   519: ldc -74
        //   521: invokeinterface 176 2 0
        //   526: invokeinterface 180 2 0
        //   531: astore 15
        //   533: aload 10
        //   535: astore 9
        //   537: aload 10
        //   539: astore 8
        //   541: aload 10
        //   543: aload 10
        //   545: ldc -72
        //   547: invokeinterface 176 2 0
        //   552: invokeinterface 180 2 0
        //   557: astore 12
        //   559: aload 10
        //   561: astore 9
        //   563: aload 10
        //   565: astore 8
        //   567: aload 10
        //   569: aload 10
        //   571: ldc -70
        //   573: invokeinterface 176 2 0
        //   578: invokeinterface 190 2 0
        //   583: istore_3
        //   584: aload 10
        //   586: astore 9
        //   588: aload 10
        //   590: astore 8
        //   592: aload 11
        //   594: invokestatic 92	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
        //   597: ifne +187 -> 784
        //   600: aload 10
        //   602: astore 9
        //   604: aload 10
        //   606: astore 8
        //   608: aload 12
        //   610: invokestatic 92	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
        //   613: ifne +171 -> 784
        //   616: aload 10
        //   618: astore 9
        //   620: aload 10
        //   622: astore 8
        //   624: aload 12
        //   626: aload 14
        //   628: invokevirtual 193	java/lang/String:equals	(Ljava/lang/Object;)Z
        //   631: ifne +21 -> 652
        //   634: aload 10
        //   636: astore 9
        //   638: aload 10
        //   640: astore 8
        //   642: aload 12
        //   644: ldc -61
        //   646: invokevirtual 193	java/lang/String:equals	(Ljava/lang/Object;)Z
        //   649: ifeq +135 -> 784
        //   652: aload 10
        //   654: astore 9
        //   656: aload 10
        //   658: astore 8
        //   660: aload 11
        //   662: invokevirtual 98	java/lang/String:toLowerCase	()Ljava/lang/String;
        //   665: astore 16
        //   667: aload 10
        //   669: astore 9
        //   671: aload 10
        //   673: astore 8
        //   675: aload 13
        //   677: getfield 198	com/tencent/mm/plugin/emoji/e/a:khQ	Ljava/util/HashMap;
        //   680: aload 16
        //   682: invokevirtual 201	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
        //   685: ifeq +170 -> 855
        //   688: aload 10
        //   690: astore 9
        //   692: aload 10
        //   694: astore 8
        //   696: aload 13
        //   698: getfield 198	com/tencent/mm/plugin/emoji/e/a:khQ	Ljava/util/HashMap;
        //   701: aload 16
        //   703: invokevirtual 118	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
        //   706: checkcast 120	java/util/ArrayList
        //   709: astore 12
        //   711: aload 12
        //   713: astore 11
        //   715: aload 12
        //   717: ifnonnull +20 -> 737
        //   720: aload 10
        //   722: astore 9
        //   724: aload 10
        //   726: astore 8
        //   728: new 120	java/util/ArrayList
        //   731: dup
        //   732: invokespecial 121	java/util/ArrayList:<init>	()V
        //   735: astore 11
        //   737: aload 10
        //   739: astore 9
        //   741: aload 10
        //   743: astore 8
        //   745: aload 11
        //   747: new 203	com/tencent/mm/plugin/emoji/e/a$a
        //   750: dup
        //   751: aload 13
        //   753: aload 15
        //   755: iload_3
        //   756: invokespecial 206	com/tencent/mm/plugin/emoji/e/a$a:<init>	(Lcom/tencent/mm/plugin/emoji/e/a;Ljava/lang/String;I)V
        //   759: invokevirtual 125	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   762: pop
        //   763: aload 10
        //   765: astore 9
        //   767: aload 10
        //   769: astore 8
        //   771: aload 13
        //   773: getfield 209	com/tencent/mm/plugin/emoji/e/a:khN	Ljava/util/HashMap;
        //   776: aload 15
        //   778: aload 16
        //   780: invokevirtual 111	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   783: pop
        //   784: aload 10
        //   786: astore 9
        //   788: aload 10
        //   790: astore 8
        //   792: aload 10
        //   794: invokeinterface 128 1 0
        //   799: pop
        //   800: iload_1
        //   801: iconst_1
        //   802: iadd
        //   803: istore_1
        //   804: goto -328 -> 476
        //   807: astore 10
        //   809: aload 8
        //   811: astore 9
        //   813: ldc -103
        //   815: aload 10
        //   817: invokestatic 213	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   820: invokestatic 217	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
        //   823: aload 8
        //   825: ifnull -506 -> 319
        //   828: aload 8
        //   830: invokeinterface 131 1 0
        //   835: goto -516 -> 319
        //   838: astore 8
        //   840: aload 9
        //   842: ifnull +10 -> 852
        //   845: aload 9
        //   847: invokeinterface 131 1 0
        //   852: aload 8
        //   854: athrow
        //   855: aload 10
        //   857: astore 9
        //   859: aload 10
        //   861: astore 8
        //   863: new 120	java/util/ArrayList
        //   866: dup
        //   867: invokespecial 121	java/util/ArrayList:<init>	()V
        //   870: astore 11
        //   872: aload 10
        //   874: astore 9
        //   876: aload 10
        //   878: astore 8
        //   880: aload 11
        //   882: new 203	com/tencent/mm/plugin/emoji/e/a$a
        //   885: dup
        //   886: aload 13
        //   888: aload 15
        //   890: iload_3
        //   891: invokespecial 206	com/tencent/mm/plugin/emoji/e/a$a:<init>	(Lcom/tencent/mm/plugin/emoji/e/a;Ljava/lang/String;I)V
        //   894: invokevirtual 125	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   897: pop
        //   898: aload 10
        //   900: astore 9
        //   902: aload 10
        //   904: astore 8
        //   906: aload 13
        //   908: getfield 198	com/tencent/mm/plugin/emoji/e/a:khQ	Ljava/util/HashMap;
        //   911: aload 16
        //   913: aload 11
        //   915: invokevirtual 111	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   918: pop
        //   919: goto -156 -> 763
        //   922: astore 10
        //   924: aload 9
        //   926: astore 8
        //   928: ldc -103
        //   930: aload 10
        //   932: invokestatic 213	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   935: invokestatic 220	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
        //   938: aload 9
        //   940: ifnull +10 -> 950
        //   943: aload 9
        //   945: invokeinterface 131 1 0
        //   950: aload_0
        //   951: getfield 17	com/tencent/mm/plugin/emoji/e/a$2:khS	Lcom/tencent/mm/plugin/emoji/e/a;
        //   954: iconst_1
        //   955: putfield 224	com/tencent/mm/plugin/emoji/e/a:mInit	Z
        //   958: ldc -103
        //   960: ldc -30
        //   962: iconst_1
        //   963: anewarray 4	java/lang/Object
        //   966: dup
        //   967: iconst_0
        //   968: new 157	java/lang/StringBuilder
        //   971: dup
        //   972: invokespecial 158	java/lang/StringBuilder:<init>	()V
        //   975: invokestatic 44	java/lang/System:currentTimeMillis	()J
        //   978: lload 4
        //   980: lsub
        //   981: invokevirtual 162	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
        //   984: invokevirtual 165	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   987: aastore
        //   988: invokestatic 170	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   991: ldc2_w 36
        //   994: ldc 38
        //   996: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   999: return
        //   1000: aload 10
        //   1002: ifnull -52 -> 950
        //   1005: aload 10
        //   1007: invokeinterface 131 1 0
        //   1012: goto -62 -> 950
        //   1015: astore 9
        //   1017: aload 8
        //   1019: ifnull +10 -> 1029
        //   1022: aload 8
        //   1024: invokeinterface 131 1 0
        //   1029: aload 9
        //   1031: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	1032	0	this	2
        //   81	723	1	i	int
        //   79	400	2	j	int
        //   583	308	3	k	int
        //   11	968	4	l1	long
        //   351	56	6	l2	long
        //   28	801	8	localObject1	Object
        //   838	15	8	localObject2	Object
        //   861	162	8	localObject3	Object
        //   25	919	9	localObject4	Object
        //   1015	15	9	localObject5	Object
        //   39	754	10	localCursor	Cursor
        //   807	96	10	localException1	Exception
        //   922	84	10	localException2	Exception
        //   132	782	11	localObject6	Object
        //   213	503	12	localObject7	Object
        //   17	890	13	locala	a
        //   102	525	14	localObject8	Object
        //   531	358	15	str1	String
        //   665	247	16	str2	String
        // Exception table:
        //   from	to	target	type
        //   30	41	807	java/lang/Exception
        //   54	64	807	java/lang/Exception
        //   72	80	807	java/lang/Exception
        //   95	104	807	java/lang/Exception
        //   112	119	807	java/lang/Exception
        //   127	134	807	java/lang/Exception
        //   142	150	807	java/lang/Exception
        //   158	165	807	java/lang/Exception
        //   173	189	807	java/lang/Exception
        //   197	215	807	java/lang/Exception
        //   232	241	807	java/lang/Exception
        //   249	260	807	java/lang/Exception
        //   268	284	807	java/lang/Exception
        //   292	300	807	java/lang/Exception
        //   30	41	838	finally
        //   54	64	838	finally
        //   72	80	838	finally
        //   95	104	838	finally
        //   112	119	838	finally
        //   127	134	838	finally
        //   142	150	838	finally
        //   158	165	838	finally
        //   173	189	838	finally
        //   197	215	838	finally
        //   232	241	838	finally
        //   249	260	838	finally
        //   268	284	838	finally
        //   292	300	838	finally
        //   813	823	838	finally
        //   348	353	922	java/lang/Exception
        //   361	378	922	java/lang/Exception
        //   386	419	922	java/lang/Exception
        //   432	442	922	java/lang/Exception
        //   450	458	922	java/lang/Exception
        //   466	474	922	java/lang/Exception
        //   489	507	922	java/lang/Exception
        //   515	533	922	java/lang/Exception
        //   541	559	922	java/lang/Exception
        //   567	584	922	java/lang/Exception
        //   592	600	922	java/lang/Exception
        //   608	616	922	java/lang/Exception
        //   624	634	922	java/lang/Exception
        //   642	652	922	java/lang/Exception
        //   660	667	922	java/lang/Exception
        //   675	688	922	java/lang/Exception
        //   696	711	922	java/lang/Exception
        //   728	737	922	java/lang/Exception
        //   745	763	922	java/lang/Exception
        //   771	784	922	java/lang/Exception
        //   792	800	922	java/lang/Exception
        //   863	872	922	java/lang/Exception
        //   880	898	922	java/lang/Exception
        //   906	919	922	java/lang/Exception
        //   348	353	1015	finally
        //   361	378	1015	finally
        //   386	419	1015	finally
        //   432	442	1015	finally
        //   450	458	1015	finally
        //   466	474	1015	finally
        //   489	507	1015	finally
        //   515	533	1015	finally
        //   541	559	1015	finally
        //   567	584	1015	finally
        //   592	600	1015	finally
        //   608	616	1015	finally
        //   624	634	1015	finally
        //   642	652	1015	finally
        //   660	667	1015	finally
        //   675	688	1015	finally
        //   696	711	1015	finally
        //   728	737	1015	finally
        //   745	763	1015	finally
        //   771	784	1015	finally
        //   792	800	1015	finally
        //   863	872	1015	finally
        //   880	898	1015	finally
        //   906	919	1015	finally
        //   928	938	1015	finally
      }
      
      public final String toString()
      {
        GMTrace.i(11547959099392L, 86039);
        String str = super.toString() + "|newinit";
        GMTrace.o(11547959099392L, 86039);
        return str;
      }
    });
    GMTrace.o(11552119848960L, 86070);
  }
  
  public final void clear()
  {
    GMTrace.i(11551985631232L, 86069);
    if (this.khN != null) {
      this.khN.clear();
    }
    if (this.khO != null) {
      this.khO.clear();
    }
    if (this.khP != null) {
      this.khP.clear();
    }
    if (this.khQ != null) {
      this.khQ.clear();
    }
    GMTrace.o(11551985631232L, 86069);
  }
  
  public final String vM(String paramString)
  {
    GMTrace.i(19275142135808L, 143611);
    if ((this.khN != null) && (this.khN.containsKey(paramString)))
    {
      paramString = (String)this.khN.get(paramString);
      GMTrace.o(19275142135808L, 143611);
      return paramString;
    }
    c localc = h.arl().kjA;
    String str1 = null;
    String str2 = String.format("select %s from %s where %s=?", new Object[] { "desc", "EmojiInfoDesc", "md5_lang" });
    Object localObject = paramString + v.bPK().toLowerCase();
    localObject = localc.fTZ.a(str2, new String[] { localObject }, 2);
    if (((Cursor)localObject).moveToFirst()) {
      str1 = ((Cursor)localObject).getString(((Cursor)localObject).getColumnIndex("desc"));
    }
    ((Cursor)localObject).close();
    if (!bg.nm(str1))
    {
      GMTrace.o(19275142135808L, 143611);
      return str1;
    }
    paramString = paramString + "default";
    paramString = localc.fTZ.a(str2, new String[] { paramString }, 2);
    if (paramString.moveToFirst()) {
      str1 = paramString.getString(paramString.getColumnIndex("desc"));
    }
    paramString.close();
    GMTrace.o(19275142135808L, 143611);
    return str1;
  }
  
  final class a
  {
    String eDW;
    int index;
    
    a(String paramString, int paramInt)
    {
      GMTrace.i(11542993043456L, 86002);
      this.eDW = paramString;
      this.index = paramInt;
      GMTrace.o(11542993043456L, 86002);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */