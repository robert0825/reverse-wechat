package com.tencent.mm.modelvideo;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import junit.framework.Assert;

public final class s
{
  public static final String[] fTX;
  private static long hcG;
  public com.tencent.mm.bu.g goN;
  k<a, s.a.a> gsv;
  
  static
  {
    GMTrace.i(349234528256L, 2602);
    fTX = new String[] { "CREATE TABLE IF NOT EXISTS videoinfo2 ( filename text  PRIMARY KEY , clientid text  , msgsvrid int  , netoffset int  , filenowsize int  , totallen int  , thumbnetoffset int  , thumblen int  , status int  , createtime long  , lastmodifytime long  , downloadtime long  , videolength int  , msglocalid int  , nettimes int  , cameratype int  , user text  , human text  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  , videofuncflag int ,masssendid long ,masssendlist text,videomd5 text, streamvideo byte[], statextstr text, downloadscene int, mmsightextinfo byte[], preloadsize int, videoformat int )", "CREATE INDEX IF NOT EXISTS  video_status_index ON videoinfo2 ( status,downloadtime )", "CREATE TABLE IF NOT EXISTS videoinfo ( filename text  PRIMARY KEY , clientid text  , msgsvrid int  , netoffset int  , filenowsize int  , totallen int  , thumbnetoffset int  , thumblen int  , status int  , createtime long  , lastmodifytime long  , downloadtime long  , videolength int  , msglocalid int  , nettimes int  , cameratype int  , user text  , human text  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  , videofuncflag int ,masssendid long ,masssendlist text,videomd5 text, streamvideo byte[], statextstr text, downloadscene int, mmsightextinfo byte[], preloadsize int, videoformat int )", "alter table videoinfo2 add videofuncflag int ;", "alter table videoinfo2 add masssendid long default 0;", "alter table videoinfo2 add masssendlist text ;", "alter table videoinfo2 add videomd5 text ;", "alter table videoinfo2 add streamvideo byte[] ;", "alter table videoinfo2 add statextstr text ;", "alter table videoinfo2 add downloadscene int ;", "alter table videoinfo2 add mmsightextinfo byte[] ;", "alter table videoinfo2 add preloadsize int ;", "alter table videoinfo2 add videoformat int ;", "alter table videoinfo add videofuncflag int ;", "alter table videoinfo add masssendid long default 0;", "alter table videoinfo add masssendlist text ;", "alter table videoinfo add videomd5 text ;", "alter table videoinfo add streamvideo byte[] ;", "alter table videoinfo add statextstr text ;", "alter table videoinfo add downloadscene int ;", "alter table videoinfo add mmsightextinfo byte[] ;", "alter table videoinfo add preloadsize int ;", "alter table videoinfo add videoformat int ;", "insert into videoinfo2 select * from videoinfo ;", "delete from videoinfo ;", "CREATE INDEX IF NOT EXISTS  massSendIdIndex ON videoinfo2 ( masssendid )", "CREATE INDEX IF NOT EXISTS  LastModifyTimeIndex ON videoinfo2 ( lastmodifytime )", "CREATE TABLE IF NOT EXISTS  VideoHash  (size int , CreateTime long, hash text ,  cdnxml text, orgpath text);", "CREATE INDEX IF NOT EXISTS  VideoHashSizeIndex ON VideoHash ( size  )", "CREATE INDEX IF NOT EXISTS  VideoHashTimeIndex ON VideoHash ( CreateTime  )" };
    hcG = 0L;
    GMTrace.o(349234528256L, 2602);
  }
  
  public s(com.tencent.mm.bu.g paramg)
  {
    GMTrace.i(346550173696L, 2582);
    this.gsv = new k() {};
    this.goN = paramg;
    GMTrace.o(346550173696L, 2582);
  }
  
  private static String NE()
  {
    GMTrace.i(16386373976064L, 122088);
    String str = h.xy().fYU + "video/";
    GMTrace.o(16386373976064L, 122088);
    return str;
  }
  
  /* Error */
  public static int a(String paramString, int paramInt, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc2_w 156
    //   3: sipush 2596
    //   6: invokestatic 40	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: invokestatic 163	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   13: ifeq +48 -> 61
    //   16: ldc -91
    //   18: new 130	java/lang/StringBuilder
    //   21: dup
    //   22: ldc -89
    //   24: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   27: invokestatic 175	com/tencent/mm/compatible/util/g:tC	()Ljava/lang/String;
    //   30: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: ldc -79
    //   35: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   41: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   44: invokestatic 187	com/tencent/mm/compatible/util/g:tA	()I
    //   47: istore_1
    //   48: ldc2_w 156
    //   51: sipush 2596
    //   54: invokestatic 109	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   57: iconst_0
    //   58: iload_1
    //   59: isub
    //   60: ireturn
    //   61: iload_1
    //   62: ifge +61 -> 123
    //   65: ldc -91
    //   67: new 130	java/lang/StringBuilder
    //   70: dup
    //   71: ldc -89
    //   73: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   76: invokestatic 175	com/tencent/mm/compatible/util/g:tC	()Ljava/lang/String;
    //   79: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: ldc -67
    //   84: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: aload_0
    //   88: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: ldc -65
    //   93: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: iload_1
    //   97: invokevirtual 194	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   100: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   103: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   106: invokestatic 187	com/tencent/mm/compatible/util/g:tA	()I
    //   109: istore_1
    //   110: ldc2_w 156
    //   113: sipush 2596
    //   116: invokestatic 109	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   119: iconst_0
    //   120: iload_1
    //   121: isub
    //   122: ireturn
    //   123: aload_2
    //   124: invokestatic 198	com/tencent/mm/sdk/platformtools/bg:bq	([B)Z
    //   127: ifeq +57 -> 184
    //   130: ldc -91
    //   132: new 130	java/lang/StringBuilder
    //   135: dup
    //   136: ldc -89
    //   138: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   141: invokestatic 175	com/tencent/mm/compatible/util/g:tC	()Ljava/lang/String;
    //   144: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: ldc -67
    //   149: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: aload_0
    //   153: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: ldc -56
    //   158: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   164: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   167: invokestatic 187	com/tencent/mm/compatible/util/g:tA	()I
    //   170: istore_1
    //   171: ldc2_w 156
    //   174: sipush 2596
    //   177: invokestatic 109	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   180: iconst_0
    //   181: iload_1
    //   182: isub
    //   183: ireturn
    //   184: new 202	com/tencent/mm/compatible/util/g$a
    //   187: dup
    //   188: invokespecial 203	com/tencent/mm/compatible/util/g$a:<init>	()V
    //   191: astore 14
    //   193: new 205	java/io/RandomAccessFile
    //   196: dup
    //   197: aload_0
    //   198: ldc -49
    //   200: invokespecial 209	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   203: astore 13
    //   205: aload 13
    //   207: astore 12
    //   209: aload 14
    //   211: invokevirtual 213	com/tencent/mm/compatible/util/g$a:tD	()J
    //   214: lstore 4
    //   216: aload 13
    //   218: astore 12
    //   220: aload 13
    //   222: iload_1
    //   223: i2l
    //   224: invokevirtual 217	java/io/RandomAccessFile:seek	(J)V
    //   227: aload 13
    //   229: astore 12
    //   231: aload 14
    //   233: invokevirtual 213	com/tencent/mm/compatible/util/g$a:tD	()J
    //   236: lstore 6
    //   238: aload 13
    //   240: astore 12
    //   242: aload 13
    //   244: aload_2
    //   245: iconst_0
    //   246: aload_2
    //   247: arraylength
    //   248: invokevirtual 221	java/io/RandomAccessFile:write	([BII)V
    //   251: aload 13
    //   253: astore 12
    //   255: aload 14
    //   257: invokevirtual 213	com/tencent/mm/compatible/util/g$a:tD	()J
    //   260: lstore 8
    //   262: aload 13
    //   264: astore 12
    //   266: aload 13
    //   268: invokevirtual 224	java/io/RandomAccessFile:getFilePointer	()J
    //   271: l2i
    //   272: istore_3
    //   273: aload 13
    //   275: astore 12
    //   277: aload 14
    //   279: invokevirtual 213	com/tencent/mm/compatible/util/g$a:tD	()J
    //   282: lstore 10
    //   284: aload 13
    //   286: invokevirtual 227	java/io/RandomAccessFile:close	()V
    //   289: ldc -91
    //   291: new 130	java/lang/StringBuilder
    //   294: dup
    //   295: ldc -27
    //   297: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   300: invokestatic 175	com/tencent/mm/compatible/util/g:tC	()Ljava/lang/String;
    //   303: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   306: ldc -67
    //   308: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   311: aload_0
    //   312: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   315: ldc -25
    //   317: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   320: iload_1
    //   321: invokevirtual 194	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   324: ldc -23
    //   326: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   329: aload_2
    //   330: arraylength
    //   331: invokevirtual 194	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   334: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   337: invokestatic 236	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   340: ldc -91
    //   342: new 130	java/lang/StringBuilder
    //   345: dup
    //   346: ldc -27
    //   348: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   351: invokestatic 175	com/tencent/mm/compatible/util/g:tC	()Ljava/lang/String;
    //   354: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   357: ldc -67
    //   359: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   362: aload_0
    //   363: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   366: ldc -18
    //   368: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   371: lload 4
    //   373: invokevirtual 241	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   376: ldc -13
    //   378: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   381: lload 6
    //   383: invokevirtual 241	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   386: ldc -11
    //   388: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   391: lload 8
    //   393: invokevirtual 241	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   396: ldc -9
    //   398: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   401: lload 10
    //   403: invokevirtual 241	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   406: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   409: invokestatic 236	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   412: ldc2_w 156
    //   415: sipush 2596
    //   418: invokestatic 109	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   421: iload_3
    //   422: ireturn
    //   423: astore 14
    //   425: aconst_null
    //   426: astore_2
    //   427: aload_2
    //   428: astore 12
    //   430: ldc -91
    //   432: new 130	java/lang/StringBuilder
    //   435: dup
    //   436: ldc -89
    //   438: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   441: invokestatic 175	com/tencent/mm/compatible/util/g:tC	()Ljava/lang/String;
    //   444: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   447: ldc -67
    //   449: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   452: aload_0
    //   453: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   456: ldc -7
    //   458: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   461: iload_1
    //   462: invokevirtual 194	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   465: ldc -5
    //   467: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   470: aload 14
    //   472: invokevirtual 254	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   475: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   478: ldc_w 256
    //   481: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   484: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   487: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   490: aload_2
    //   491: astore 12
    //   493: invokestatic 187	com/tencent/mm/compatible/util/g:tA	()I
    //   496: istore_1
    //   497: aload_2
    //   498: ifnull +7 -> 505
    //   501: aload_2
    //   502: invokevirtual 227	java/io/RandomAccessFile:close	()V
    //   505: ldc2_w 156
    //   508: sipush 2596
    //   511: invokestatic 109	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   514: iconst_0
    //   515: iload_1
    //   516: isub
    //   517: ireturn
    //   518: astore_0
    //   519: aconst_null
    //   520: astore 12
    //   522: aload 12
    //   524: ifnull +8 -> 532
    //   527: aload 12
    //   529: invokevirtual 227	java/io/RandomAccessFile:close	()V
    //   532: aload_0
    //   533: athrow
    //   534: astore 12
    //   536: goto -247 -> 289
    //   539: astore_0
    //   540: goto -35 -> 505
    //   543: astore_2
    //   544: goto -12 -> 532
    //   547: astore_0
    //   548: goto -26 -> 522
    //   551: astore 14
    //   553: aload 13
    //   555: astore_2
    //   556: goto -129 -> 427
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	559	0	paramString	String
    //   0	559	1	paramInt	int
    //   0	559	2	paramArrayOfByte	byte[]
    //   272	150	3	i	int
    //   214	158	4	l1	long
    //   236	146	6	l2	long
    //   260	132	8	l3	long
    //   282	120	10	l4	long
    //   207	321	12	localObject	Object
    //   534	1	12	localException1	Exception
    //   203	351	13	localRandomAccessFile	java.io.RandomAccessFile
    //   191	87	14	locala	com.tencent.mm.compatible.util.g.a
    //   423	48	14	localException2	Exception
    //   551	1	14	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   193	205	423	java/lang/Exception
    //   193	205	518	finally
    //   284	289	534	java/lang/Exception
    //   501	505	539	java/lang/Exception
    //   527	532	543	java/lang/Exception
    //   209	216	547	finally
    //   220	227	547	finally
    //   231	238	547	finally
    //   242	251	547	finally
    //   255	262	547	finally
    //   266	273	547	finally
    //   277	284	547	finally
    //   430	490	547	finally
    //   493	497	547	finally
    //   209	216	551	java/lang/Exception
    //   220	227	551	java/lang/Exception
    //   231	238	551	java/lang/Exception
    //   242	251	551	java/lang/Exception
    //   255	262	551	java/lang/Exception
    //   266	273	551	java/lang/Exception
    //   277	284	551	java/lang/Exception
  }
  
  private boolean an(String paramString1, String paramString2)
  {
    GMTrace.i(349100310528L, 2601);
    w.i("MicroMsg.VideoInfoStorage", "saveVideoHash path:%s xml:%s stack:%s", new Object[] { paramString1, paramString2, bg.bQW() });
    long l1 = bg.Pv();
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      w.e("MicroMsg.VideoInfoStorage", "saveVideoHash failed , path:%s xml:%s", new Object[] { paramString1, paramString2 });
      GMTrace.o(349100310528L, 2601);
      return false;
    }
    Object localObject = mn(paramString1);
    if ((localObject == null) || (localObject.length < 33))
    {
      w.e("MicroMsg.VideoInfoStorage", "saveVideoHash  readHash failed :%s", new Object[] { paramString1 });
      GMTrace.o(349100310528L, 2601);
      return false;
    }
    int j = localObject[32];
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    while (i < 32)
    {
      localStringBuffer.append(Integer.toHexString(localObject[i]));
      i += 1;
    }
    localObject = this.goN.a("select cdnxml from VideoHash where size = " + j + " and hash = \"" + localStringBuffer.toString() + "\"", null, 2);
    Vector localVector = new Vector();
    while (((Cursor)localObject).moveToNext())
    {
      localVector.add(((Cursor)localObject).getString(0));
      w.v("MicroMsg.VideoInfoStorage", "saveVideoHash index:%s get:%s", new Object[] { Integer.valueOf(localVector.size()), localVector.get(localVector.size() - 1) });
    }
    ((Cursor)localObject).close();
    if ((localVector.size() == 1) && (paramString2.equals(localVector.get(0))))
    {
      w.w("MicroMsg.VideoInfoStorage", "saveVideoHash Check exist now return,time:%d,  path:%s xml:%s", new Object[] { Long.valueOf(bg.aH(l1)), paramString1, paramString2 });
      GMTrace.o(349100310528L, 2601);
      return true;
    }
    if (localVector.size() > 0)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(12696, new Object[] { Integer.valueOf(102), Integer.valueOf(j), "", "", Integer.valueOf(localVector.size()) });
      w.e("MicroMsg.VideoInfoStorage", "saveVideoHash Err Check  xml diff OR  select more than one row,  rowCount:%d size:%d ", new Object[] { Integer.valueOf(localVector.size()), Integer.valueOf(j) });
      this.goN.eZ("VideoHash", "delete from VideoHash where size = " + j + " and hash = \"" + localStringBuffer.toString() + "\"");
    }
    localObject = new ContentValues();
    ((ContentValues)localObject).put("size", Integer.valueOf(j));
    ((ContentValues)localObject).put("CreateTime", Long.valueOf(bg.Pu()));
    ((ContentValues)localObject).put("hash", localStringBuffer.toString());
    ((ContentValues)localObject).put("cdnxml", paramString2);
    ((ContentValues)localObject).put("orgpath", paramString1);
    long l2 = this.goN.insert("VideoHash", "", (ContentValues)localObject);
    w.i("MicroMsg.VideoInfoStorage", "summersafecdn saveVideoHash time:%d insert:%d path:%s hash:%s xml:%s", new Object[] { Long.valueOf(bg.aH(l1)), Long.valueOf(l2), paramString1, localStringBuffer, paramString2 });
    if (l2 < 0L)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(12696, new Object[] { Integer.valueOf(103), Integer.valueOf(j) });
      w.e("MicroMsg.VideoInfoStorage", "saveVideoHash insert failed :%d  path:%s", new Object[] { Long.valueOf(l2), paramString1 });
    }
    GMTrace.o(349100310528L, 2601);
    return true;
  }
  
  /* Error */
  public static b h(String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: ldc2_w 411
    //   3: sipush 2597
    //   6: invokestatic 40	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 21	com/tencent/mm/modelvideo/s$b
    //   12: dup
    //   13: invokespecial 413	com/tencent/mm/modelvideo/s$b:<init>	()V
    //   16: astore 16
    //   18: aload_0
    //   19: invokestatic 163	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   22: ifeq +53 -> 75
    //   25: ldc -91
    //   27: new 130	java/lang/StringBuilder
    //   30: dup
    //   31: ldc -89
    //   33: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   36: invokestatic 175	com/tencent/mm/compatible/util/g:tC	()Ljava/lang/String;
    //   39: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: ldc -79
    //   44: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   50: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   53: aload 16
    //   55: iconst_0
    //   56: invokestatic 187	com/tencent/mm/compatible/util/g:tA	()I
    //   59: isub
    //   60: putfield 417	com/tencent/mm/modelvideo/s$b:ret	I
    //   63: ldc2_w 411
    //   66: sipush 2597
    //   69: invokestatic 109	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   72: aload 16
    //   74: areturn
    //   75: iload_1
    //   76: ifge +67 -> 143
    //   79: ldc -91
    //   81: new 130	java/lang/StringBuilder
    //   84: dup
    //   85: ldc -89
    //   87: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   90: invokestatic 175	com/tencent/mm/compatible/util/g:tC	()Ljava/lang/String;
    //   93: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: ldc -67
    //   98: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: aload_0
    //   102: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: ldc_w 419
    //   108: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: iload_1
    //   112: invokevirtual 194	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   115: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   118: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   121: aload 16
    //   123: iconst_0
    //   124: invokestatic 187	com/tencent/mm/compatible/util/g:tA	()I
    //   127: isub
    //   128: putfield 417	com/tencent/mm/modelvideo/s$b:ret	I
    //   131: ldc2_w 411
    //   134: sipush 2597
    //   137: invokestatic 109	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   140: aload 16
    //   142: areturn
    //   143: iload_2
    //   144: ifgt +63 -> 207
    //   147: ldc -91
    //   149: new 130	java/lang/StringBuilder
    //   152: dup
    //   153: ldc -89
    //   155: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   158: invokestatic 175	com/tencent/mm/compatible/util/g:tC	()Ljava/lang/String;
    //   161: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: ldc -67
    //   166: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: aload_0
    //   170: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: ldc_w 421
    //   176: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   182: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   185: aload 16
    //   187: iconst_0
    //   188: invokestatic 187	com/tencent/mm/compatible/util/g:tA	()I
    //   191: isub
    //   192: putfield 417	com/tencent/mm/modelvideo/s$b:ret	I
    //   195: ldc2_w 411
    //   198: sipush 2597
    //   201: invokestatic 109	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   204: aload 16
    //   206: areturn
    //   207: new 202	com/tencent/mm/compatible/util/g$a
    //   210: dup
    //   211: invokespecial 203	com/tencent/mm/compatible/util/g$a:<init>	()V
    //   214: astore 15
    //   216: aload 16
    //   218: iload_2
    //   219: newarray <illegal type>
    //   221: putfield 425	com/tencent/mm/modelvideo/s$b:buf	[B
    //   224: new 205	java/io/RandomAccessFile
    //   227: dup
    //   228: aload_0
    //   229: ldc_w 427
    //   232: invokespecial 209	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   235: astore 14
    //   237: aload 14
    //   239: astore 13
    //   241: aload 15
    //   243: invokevirtual 213	com/tencent/mm/compatible/util/g$a:tD	()J
    //   246: lstore 5
    //   248: aload 14
    //   250: astore 13
    //   252: aload 14
    //   254: iload_1
    //   255: i2l
    //   256: invokevirtual 217	java/io/RandomAccessFile:seek	(J)V
    //   259: aload 14
    //   261: astore 13
    //   263: aload 15
    //   265: invokevirtual 213	com/tencent/mm/compatible/util/g$a:tD	()J
    //   268: lstore 7
    //   270: aload 14
    //   272: astore 13
    //   274: aload 14
    //   276: aload 16
    //   278: getfield 425	com/tencent/mm/modelvideo/s$b:buf	[B
    //   281: iconst_0
    //   282: iload_2
    //   283: invokevirtual 431	java/io/RandomAccessFile:read	([BII)I
    //   286: istore 4
    //   288: aload 14
    //   290: astore 13
    //   292: aload 15
    //   294: invokevirtual 213	com/tencent/mm/compatible/util/g$a:tD	()J
    //   297: lstore 9
    //   299: aload 14
    //   301: astore 13
    //   303: aload 15
    //   305: invokevirtual 213	com/tencent/mm/compatible/util/g$a:tD	()J
    //   308: lstore 11
    //   310: iload 4
    //   312: istore_3
    //   313: iload 4
    //   315: ifge +5 -> 320
    //   318: iconst_0
    //   319: istore_3
    //   320: aload 14
    //   322: astore 13
    //   324: aload 16
    //   326: iload_3
    //   327: putfield 434	com/tencent/mm/modelvideo/s$b:eyw	I
    //   330: aload 14
    //   332: astore 13
    //   334: aload 16
    //   336: iload_3
    //   337: iload_1
    //   338: iadd
    //   339: putfield 437	com/tencent/mm/modelvideo/s$b:hcV	I
    //   342: aload 14
    //   344: invokevirtual 227	java/io/RandomAccessFile:close	()V
    //   347: ldc -91
    //   349: new 130	java/lang/StringBuilder
    //   352: dup
    //   353: ldc -27
    //   355: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   358: invokestatic 175	com/tencent/mm/compatible/util/g:tC	()Ljava/lang/String;
    //   361: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   364: ldc -67
    //   366: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   369: aload_0
    //   370: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: ldc -25
    //   375: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   378: iload_1
    //   379: invokevirtual 194	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   382: ldc_w 439
    //   385: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   388: iload_2
    //   389: invokevirtual 194	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   392: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   395: invokestatic 236	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   398: ldc -91
    //   400: new 130	java/lang/StringBuilder
    //   403: dup
    //   404: ldc -27
    //   406: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   409: invokestatic 175	com/tencent/mm/compatible/util/g:tC	()Ljava/lang/String;
    //   412: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   415: ldc -67
    //   417: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   420: aload_0
    //   421: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   424: ldc -18
    //   426: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   429: lload 5
    //   431: invokevirtual 241	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   434: ldc -13
    //   436: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   439: lload 7
    //   441: invokevirtual 241	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   444: ldc -11
    //   446: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   449: lload 9
    //   451: invokevirtual 241	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   454: ldc -9
    //   456: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   459: lload 11
    //   461: invokevirtual 241	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   464: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   467: invokestatic 236	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   470: ldc2_w 411
    //   473: sipush 2597
    //   476: invokestatic 109	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   479: aload 16
    //   481: areturn
    //   482: astore 15
    //   484: aconst_null
    //   485: astore 14
    //   487: aload 14
    //   489: astore 13
    //   491: ldc -91
    //   493: new 130	java/lang/StringBuilder
    //   496: dup
    //   497: ldc -89
    //   499: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   502: invokestatic 175	com/tencent/mm/compatible/util/g:tC	()Ljava/lang/String;
    //   505: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   508: ldc -67
    //   510: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   513: aload_0
    //   514: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   517: ldc -7
    //   519: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   522: aload 16
    //   524: getfield 437	com/tencent/mm/modelvideo/s$b:hcV	I
    //   527: invokevirtual 194	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   530: ldc -5
    //   532: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   535: aload 15
    //   537: invokevirtual 254	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   540: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   543: ldc_w 256
    //   546: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   549: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   552: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   555: aload 14
    //   557: astore 13
    //   559: aload 16
    //   561: iconst_0
    //   562: invokestatic 187	com/tencent/mm/compatible/util/g:tA	()I
    //   565: isub
    //   566: putfield 417	com/tencent/mm/modelvideo/s$b:ret	I
    //   569: aload 14
    //   571: ifnull +8 -> 579
    //   574: aload 14
    //   576: invokevirtual 227	java/io/RandomAccessFile:close	()V
    //   579: ldc2_w 411
    //   582: sipush 2597
    //   585: invokestatic 109	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   588: aload 16
    //   590: areturn
    //   591: astore_0
    //   592: aconst_null
    //   593: astore 13
    //   595: aload 13
    //   597: ifnull +8 -> 605
    //   600: aload 13
    //   602: invokevirtual 227	java/io/RandomAccessFile:close	()V
    //   605: aload_0
    //   606: athrow
    //   607: astore 13
    //   609: goto -262 -> 347
    //   612: astore_0
    //   613: goto -34 -> 579
    //   616: astore 13
    //   618: goto -13 -> 605
    //   621: astore_0
    //   622: goto -27 -> 595
    //   625: astore 15
    //   627: goto -140 -> 487
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	630	0	paramString	String
    //   0	630	1	paramInt1	int
    //   0	630	2	paramInt2	int
    //   312	27	3	i	int
    //   286	28	4	j	int
    //   246	184	5	l1	long
    //   268	172	7	l2	long
    //   297	153	9	l3	long
    //   308	152	11	l4	long
    //   239	362	13	localRandomAccessFile1	java.io.RandomAccessFile
    //   607	1	13	localException1	Exception
    //   616	1	13	localException2	Exception
    //   235	340	14	localRandomAccessFile2	java.io.RandomAccessFile
    //   214	90	15	locala	com.tencent.mm.compatible.util.g.a
    //   482	54	15	localException3	Exception
    //   625	1	15	localException4	Exception
    //   16	573	16	localb	b
    // Exception table:
    //   from	to	target	type
    //   224	237	482	java/lang/Exception
    //   224	237	591	finally
    //   342	347	607	java/lang/Exception
    //   574	579	612	java/lang/Exception
    //   600	605	616	java/lang/Exception
    //   241	248	621	finally
    //   252	259	621	finally
    //   263	270	621	finally
    //   274	288	621	finally
    //   292	299	621	finally
    //   303	310	621	finally
    //   324	330	621	finally
    //   334	342	621	finally
    //   491	555	621	finally
    //   559	569	621	finally
    //   241	248	625	java/lang/Exception
    //   252	259	625	java/lang/Exception
    //   263	270	625	java/lang/Exception
    //   274	288	625	java/lang/Exception
    //   292	299	625	java/lang/Exception
    //   303	310	625	java/lang/Exception
    //   324	330	625	java/lang/Exception
    //   334	342	625	java/lang/Exception
  }
  
  public static String mj(String paramString)
  {
    GMTrace.i(348026568704L, 2593);
    long l = System.currentTimeMillis();
    String str2 = new SimpleDateFormat("HHmmssddMMyy").format(new Date(l));
    String str1 = str2;
    if (paramString != null)
    {
      str1 = str2;
      if (paramString.length() > 1) {
        str1 = str2 + com.tencent.mm.a.g.n(paramString.getBytes()).substring(0, 7);
      }
    }
    paramString = str1 + l % 10000L;
    paramString = new StringBuilder().append(paramString);
    l = hcG;
    hcG = 1L + l;
    paramString = l;
    GMTrace.o(348026568704L, 2593);
    return paramString;
  }
  
  public static String mk(String paramString)
  {
    GMTrace.i(348160786432L, 2594);
    if (bg.nm(paramString))
    {
      GMTrace.o(348160786432L, 2594);
      return null;
    }
    paramString = NE() + paramString;
    if (com.tencent.mm.a.e.aZ(paramString))
    {
      GMTrace.o(348160786432L, 2594);
      return paramString;
    }
    paramString = paramString + ".mp4";
    GMTrace.o(348160786432L, 2594);
    return paramString;
  }
  
  public static String ml(String paramString)
  {
    GMTrace.i(348295004160L, 2595);
    if (bg.nm(paramString))
    {
      GMTrace.o(348295004160L, 2595);
      return null;
    }
    paramString = NE() + paramString + ".jpg";
    GMTrace.o(348295004160L, 2595);
    return paramString;
  }
  
  public static int mm(String paramString)
  {
    GMTrace.i(348697657344L, 2598);
    if (bg.nm(paramString))
    {
      GMTrace.o(348697657344L, 2598);
      return -1;
    }
    paramString = new File(paramString);
    if (!paramString.exists())
    {
      GMTrace.o(348697657344L, 2598);
      return 0;
    }
    int i = (int)paramString.length();
    if (i <= 0)
    {
      GMTrace.o(348697657344L, 2598);
      return 0;
    }
    GMTrace.o(348697657344L, 2598);
    return i;
  }
  
  /* Error */
  static int[] mn(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 510
    //   3: sipush 2600
    //   6: invokestatic 40	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: bipush 33
    //   11: newarray <illegal type>
    //   13: astore 10
    //   15: invokestatic 272	com/tencent/mm/sdk/platformtools/bg:Pv	()J
    //   18: lstore 4
    //   20: aload_0
    //   21: invokestatic 514	com/tencent/mm/a/e:aY	(Ljava/lang/String;)I
    //   24: istore_2
    //   25: iload_2
    //   26: ldc_w 515
    //   29: if_icmplt +10 -> 39
    //   32: iload_2
    //   33: ldc_w 516
    //   36: if_icmplt +85 -> 121
    //   39: ldc -91
    //   41: ldc_w 518
    //   44: iconst_2
    //   45: anewarray 4	java/lang/Object
    //   48: dup
    //   49: iconst_0
    //   50: iload_2
    //   51: invokestatic 331	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   54: aastore
    //   55: dup
    //   56: iconst_1
    //   57: aload_0
    //   58: aastore
    //   59: invokestatic 276	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   62: getstatic 362	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   65: astore_0
    //   66: iload_2
    //   67: ldc_w 515
    //   70: if_icmpge +45 -> 115
    //   73: bipush 10
    //   75: istore_1
    //   76: aload_0
    //   77: sipush 12696
    //   80: iconst_2
    //   81: anewarray 4	java/lang/Object
    //   84: dup
    //   85: iconst_0
    //   86: iload_1
    //   87: bipush 101
    //   89: iadd
    //   90: invokestatic 331	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   93: aastore
    //   94: dup
    //   95: iconst_1
    //   96: iload_2
    //   97: invokestatic 331	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   100: aastore
    //   101: invokevirtual 367	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
    //   104: ldc2_w 510
    //   107: sipush 2600
    //   110: invokestatic 109	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   113: aconst_null
    //   114: areturn
    //   115: bipush 20
    //   117: istore_1
    //   118: goto -42 -> 76
    //   121: aload 10
    //   123: bipush 32
    //   125: iload_2
    //   126: iastore
    //   127: iload_2
    //   128: sipush 20480
    //   131: isub
    //   132: bipush 32
    //   134: idiv
    //   135: istore_3
    //   136: sipush 512
    //   139: newarray <illegal type>
    //   141: astore 11
    //   143: new 205	java/io/RandomAccessFile
    //   146: dup
    //   147: aload_0
    //   148: ldc_w 427
    //   151: invokespecial 209	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   154: astore 9
    //   156: iconst_0
    //   157: istore_1
    //   158: iload_1
    //   159: bipush 32
    //   161: if_icmpge +66 -> 227
    //   164: iload_1
    //   165: iload_3
    //   166: imul
    //   167: sipush 10240
    //   170: iadd
    //   171: i2l
    //   172: lstore 6
    //   174: aload 9
    //   176: astore 8
    //   178: aload 9
    //   180: lload 6
    //   182: invokevirtual 217	java/io/RandomAccessFile:seek	(J)V
    //   185: aload 9
    //   187: astore 8
    //   189: aload 9
    //   191: aload 11
    //   193: invokevirtual 522	java/io/RandomAccessFile:readFully	([B)V
    //   196: aload 9
    //   198: astore 8
    //   200: aload 10
    //   202: iload_1
    //   203: aload 11
    //   205: sipush 512
    //   208: invokestatic 527	com/tencent/mm/a/h:b	([BI)I
    //   211: ldc_w 528
    //   214: irem
    //   215: ldc_w 528
    //   218: ior
    //   219: iastore
    //   220: iload_1
    //   221: iconst_1
    //   222: iadd
    //   223: istore_1
    //   224: goto -66 -> 158
    //   227: aload 9
    //   229: astore 8
    //   231: aload 9
    //   233: invokevirtual 227	java/io/RandomAccessFile:close	()V
    //   236: aload 9
    //   238: astore 8
    //   240: ldc -91
    //   242: ldc_w 530
    //   245: iconst_3
    //   246: anewarray 4	java/lang/Object
    //   249: dup
    //   250: iconst_0
    //   251: lload 4
    //   253: invokestatic 348	com/tencent/mm/sdk/platformtools/bg:aH	(J)J
    //   256: invokestatic 353	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   259: aastore
    //   260: dup
    //   261: iconst_1
    //   262: iload_2
    //   263: invokestatic 331	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   266: aastore
    //   267: dup
    //   268: iconst_2
    //   269: aload_0
    //   270: aastore
    //   271: invokestatic 269	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   274: aload 9
    //   276: invokevirtual 227	java/io/RandomAccessFile:close	()V
    //   279: ldc2_w 510
    //   282: sipush 2600
    //   285: invokestatic 109	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   288: aload 10
    //   290: areturn
    //   291: astore 10
    //   293: aconst_null
    //   294: astore 9
    //   296: aload 9
    //   298: astore 8
    //   300: ldc -91
    //   302: ldc_w 532
    //   305: iconst_2
    //   306: anewarray 4	java/lang/Object
    //   309: dup
    //   310: iconst_0
    //   311: aload_0
    //   312: aastore
    //   313: dup
    //   314: iconst_1
    //   315: aload 10
    //   317: invokestatic 536	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   320: aastore
    //   321: invokestatic 276	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   324: aload 9
    //   326: ifnull +8 -> 334
    //   329: aload 9
    //   331: invokevirtual 227	java/io/RandomAccessFile:close	()V
    //   334: ldc2_w 510
    //   337: sipush 2600
    //   340: invokestatic 109	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   343: aconst_null
    //   344: areturn
    //   345: astore_0
    //   346: aconst_null
    //   347: astore 8
    //   349: aload 8
    //   351: ifnull +8 -> 359
    //   354: aload 8
    //   356: invokevirtual 227	java/io/RandomAccessFile:close	()V
    //   359: aload_0
    //   360: athrow
    //   361: astore_0
    //   362: goto -83 -> 279
    //   365: astore_0
    //   366: goto -32 -> 334
    //   369: astore 8
    //   371: goto -12 -> 359
    //   374: astore_0
    //   375: goto -26 -> 349
    //   378: astore 10
    //   380: goto -84 -> 296
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	383	0	paramString	String
    //   75	149	1	i	int
    //   24	239	2	j	int
    //   135	32	3	k	int
    //   18	234	4	l1	long
    //   172	9	6	l2	long
    //   176	179	8	localRandomAccessFile1	java.io.RandomAccessFile
    //   369	1	8	localException1	Exception
    //   154	176	9	localRandomAccessFile2	java.io.RandomAccessFile
    //   13	276	10	arrayOfInt	int[]
    //   291	25	10	localException2	Exception
    //   378	1	10	localException3	Exception
    //   141	63	11	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   143	156	291	java/lang/Exception
    //   143	156	345	finally
    //   274	279	361	java/lang/Exception
    //   329	334	365	java/lang/Exception
    //   354	359	369	java/lang/Exception
    //   178	185	374	finally
    //   189	196	374	finally
    //   200	220	374	finally
    //   231	236	374	finally
    //   240	274	374	finally
    //   300	324	374	finally
    //   178	185	378	java/lang/Exception
    //   189	196	378	java/lang/Exception
    //   200	220	378	java/lang/Exception
    //   231	236	378	java/lang/Exception
    //   240	274	378	java/lang/Exception
  }
  
  /* Error */
  public final List<String> NA()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc2_w 539
    //   5: sipush 2589
    //   8: invokestatic 40	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: new 130	java/lang/StringBuilder
    //   14: dup
    //   15: ldc_w 542
    //   18: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   21: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   24: astore_2
    //   25: new 130	java/lang/StringBuilder
    //   28: dup
    //   29: invokespecial 131	java/lang/StringBuilder:<init>	()V
    //   32: ldc_w 544
    //   35: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: ldc_w 546
    //   41: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: aload_2
    //   45: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   51: astore_2
    //   52: aload_0
    //   53: getfield 123	com/tencent/mm/modelvideo/s:goN	Lcom/tencent/mm/bu/g;
    //   56: aload_2
    //   57: aconst_null
    //   58: iconst_2
    //   59: invokevirtual 306	com/tencent/mm/bu/g:a	(Ljava/lang/String;[Ljava/lang/String;I)Landroid/database/Cursor;
    //   62: astore_2
    //   63: aload_2
    //   64: invokeinterface 549 1 0
    //   69: ifeq +36 -> 105
    //   72: new 551	java/util/ArrayList
    //   75: dup
    //   76: invokespecial 552	java/util/ArrayList:<init>	()V
    //   79: astore_3
    //   80: aload_3
    //   81: aload_2
    //   82: iconst_0
    //   83: invokeinterface 318 2 0
    //   88: invokeinterface 555 2 0
    //   93: pop
    //   94: aload_2
    //   95: invokeinterface 315 1 0
    //   100: istore_1
    //   101: iload_1
    //   102: ifne -22 -> 80
    //   105: aload_2
    //   106: ifnull +9 -> 115
    //   109: aload_2
    //   110: invokeinterface 339 1 0
    //   115: ldc2_w 539
    //   118: sipush 2589
    //   121: invokestatic 109	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   124: aload_3
    //   125: areturn
    //   126: astore_3
    //   127: aconst_null
    //   128: astore_2
    //   129: aload_2
    //   130: ifnull +9 -> 139
    //   133: aload_2
    //   134: invokeinterface 339 1 0
    //   139: aload_3
    //   140: athrow
    //   141: astore_3
    //   142: goto -13 -> 129
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	this	s
    //   100	2	1	bool	boolean
    //   24	110	2	localObject1	Object
    //   1	124	3	localArrayList	ArrayList
    //   126	14	3	localObject2	Object
    //   141	1	3	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   52	63	126	finally
    //   63	80	141	finally
    //   80	101	141	finally
  }
  
  public final List<String> NB()
  {
    ArrayList localArrayList = null;
    GMTrace.i(347623915520L, 2590);
    Object localObject1 = " LIMIT 10" + " )";
    String str = " SELECT * FROM ( " + "select videoinfo2.filename,downloadtime from videoinfo2   WHERE status=122" + (String)localObject1;
    str = str + " UNION SELECT * FROM ( ";
    localObject1 = str + "select videoinfo2.filename,downloadtime from videoinfo2   WHERE status=120" + (String)localObject1;
    localObject1 = (String)localObject1 + " ORDER BY downloadtime DESC";
    try
    {
      localObject1 = this.goN.a((String)localObject1, null, 2);
      boolean bool;
      if (localObject1 == null) {
        break label216;
      }
    }
    finally
    {
      try
      {
        if (((Cursor)localObject1).moveToFirst())
        {
          localArrayList = new ArrayList();
          do
          {
            localArrayList.add(((Cursor)localObject1).getString(0));
            bool = ((Cursor)localObject1).moveToNext();
          } while (bool);
        }
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
        GMTrace.o(347623915520L, 2590);
        return localArrayList;
      }
      finally
      {
        for (;;) {}
      }
      localObject2 = finally;
      localObject1 = null;
    }
    ((Cursor)localObject1).close();
    label216:
    throw ((Throwable)localObject2);
  }
  
  /* Error */
  public final List<String> NC()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc2_w 574
    //   5: ldc_w 576
    //   8: invokestatic 40	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: new 130	java/lang/StringBuilder
    //   14: dup
    //   15: ldc_w 542
    //   18: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   21: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   24: astore_2
    //   25: new 130	java/lang/StringBuilder
    //   28: dup
    //   29: invokespecial 131	java/lang/StringBuilder:<init>	()V
    //   32: ldc_w 544
    //   35: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: ldc_w 578
    //   41: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: aload_2
    //   45: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   51: astore_2
    //   52: aload_0
    //   53: getfield 123	com/tencent/mm/modelvideo/s:goN	Lcom/tencent/mm/bu/g;
    //   56: aload_2
    //   57: aconst_null
    //   58: iconst_2
    //   59: invokevirtual 306	com/tencent/mm/bu/g:a	(Ljava/lang/String;[Ljava/lang/String;I)Landroid/database/Cursor;
    //   62: astore_2
    //   63: aload_2
    //   64: invokeinterface 549 1 0
    //   69: ifeq +36 -> 105
    //   72: new 551	java/util/ArrayList
    //   75: dup
    //   76: invokespecial 552	java/util/ArrayList:<init>	()V
    //   79: astore_3
    //   80: aload_3
    //   81: aload_2
    //   82: iconst_0
    //   83: invokeinterface 318 2 0
    //   88: invokeinterface 555 2 0
    //   93: pop
    //   94: aload_2
    //   95: invokeinterface 315 1 0
    //   100: istore_1
    //   101: iload_1
    //   102: ifne -22 -> 80
    //   105: aload_2
    //   106: ifnull +9 -> 115
    //   109: aload_2
    //   110: invokeinterface 339 1 0
    //   115: ldc2_w 574
    //   118: ldc_w 576
    //   121: invokestatic 109	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   124: aload_3
    //   125: areturn
    //   126: astore_3
    //   127: aconst_null
    //   128: astore_2
    //   129: aload_2
    //   130: ifnull +9 -> 139
    //   133: aload_2
    //   134: invokeinterface 339 1 0
    //   139: aload_3
    //   140: athrow
    //   141: astore_3
    //   142: goto -13 -> 129
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	this	s
    //   100	2	1	bool	boolean
    //   24	110	2	localObject1	Object
    //   1	124	3	localArrayList	ArrayList
    //   126	14	3	localObject2	Object
    //   141	1	3	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   52	63	126	finally
    //   63	80	141	finally
    //   80	101	141	finally
  }
  
  public final List<String> ND()
  {
    ArrayList localArrayList = null;
    GMTrace.i(347758133248L, 2591);
    Object localObject1 = " LIMIT 10" + " )";
    String str = " SELECT * FROM ( " + "select videoinfo2.filename,downloadtime from videoinfo2   WHERE status=103" + (String)localObject1;
    str = str + " UNION SELECT * FROM ( ";
    localObject1 = str + "select videoinfo2.filename,downloadtime from videoinfo2   WHERE status=104" + (String)localObject1;
    localObject1 = (String)localObject1 + " ORDER BY downloadtime DESC";
    try
    {
      localObject1 = this.goN.a((String)localObject1, null, 2);
      boolean bool;
      if (localObject1 == null) {
        break label216;
      }
    }
    finally
    {
      try
      {
        if (((Cursor)localObject1).moveToFirst())
        {
          localArrayList = new ArrayList();
          do
          {
            localArrayList.add(((Cursor)localObject1).getString(0));
            bool = ((Cursor)localObject1).moveToNext();
          } while (bool);
        }
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
        GMTrace.o(347758133248L, 2591);
        return localArrayList;
      }
      finally
      {
        for (;;) {}
      }
      localObject2 = finally;
      localObject1 = null;
    }
    ((Cursor)localObject1).close();
    label216:
    throw ((Throwable)localObject2);
  }
  
  public final List<r> Ny()
  {
    GMTrace.i(347087044608L, 2586);
    Object localObject = "select videoinfo2.filename,videoinfo2.clientid,videoinfo2.msgsvrid,videoinfo2.netoffset,videoinfo2.filenowsize,videoinfo2.totallen,videoinfo2.thumbnetoffset,videoinfo2.thumblen,videoinfo2.status,videoinfo2.createtime,videoinfo2.lastmodifytime,videoinfo2.downloadtime,videoinfo2.videolength,videoinfo2.msglocalid,videoinfo2.nettimes,videoinfo2.cameratype,videoinfo2.user,videoinfo2.human,videoinfo2.reserved1,videoinfo2.reserved2,videoinfo2.reserved3,videoinfo2.reserved4,videoinfo2.videofuncflag,videoinfo2.masssendid,videoinfo2.masssendlist,videoinfo2.videomd5,videoinfo2.streamvideo,videoinfo2.statextstr,videoinfo2.downloadscene,videoinfo2.mmsightextinfo,videoinfo2.preloadsize,videoinfo2.videoformat from videoinfo2  " + " WHERE status=200 order by masssendid desc";
    ArrayList localArrayList = new ArrayList();
    localObject = this.goN.a((String)localObject, null, 2);
    int i = 0;
    while (((Cursor)localObject).moveToNext())
    {
      r localr = new r();
      localr.b((Cursor)localObject);
      localArrayList.add(localr);
      i += 1;
    }
    ((Cursor)localObject).close();
    w.d("MicroMsg.VideoInfoStorage", "getUnfinishMassInfo resCount:" + i);
    GMTrace.o(347087044608L, 2586);
    return localArrayList;
  }
  
  public final List<r> Nz()
  {
    GMTrace.i(347221262336L, 2587);
    Object localObject = "select videoinfo2.filename,videoinfo2.clientid,videoinfo2.msgsvrid,videoinfo2.netoffset,videoinfo2.filenowsize,videoinfo2.totallen,videoinfo2.thumbnetoffset,videoinfo2.thumblen,videoinfo2.status,videoinfo2.createtime,videoinfo2.lastmodifytime,videoinfo2.downloadtime,videoinfo2.videolength,videoinfo2.msglocalid,videoinfo2.nettimes,videoinfo2.cameratype,videoinfo2.user,videoinfo2.human,videoinfo2.reserved1,videoinfo2.reserved2,videoinfo2.reserved3,videoinfo2.reserved4,videoinfo2.videofuncflag,videoinfo2.masssendid,videoinfo2.masssendlist,videoinfo2.videomd5,videoinfo2.streamvideo,videoinfo2.statextstr,videoinfo2.downloadscene,videoinfo2.mmsightextinfo,videoinfo2.preloadsize,videoinfo2.videoformat from videoinfo2  " + " WHERE status=198 AND masssendid > 0 order by masssendid desc";
    ArrayList localArrayList = new ArrayList();
    localObject = this.goN.a((String)localObject, null, 2);
    while (((Cursor)localObject).moveToNext())
    {
      r localr = new r();
      localr.b((Cursor)localObject);
      localArrayList.add(localr);
    }
    ((Cursor)localObject).close();
    GMTrace.o(347221262336L, 2587);
    return localArrayList;
  }
  
  /* Error */
  public final List<r> a(int paramInt1, int paramInt2, long paramLong)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: ldc2_w 608
    //   6: ldc_w 610
    //   9: invokestatic 40	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: new 130	java/lang/StringBuilder
    //   15: dup
    //   16: ldc_w 612
    //   19: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   22: iload_1
    //   23: invokevirtual 194	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   26: ldc_w 614
    //   29: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: ldc_w 616
    //   35: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: lload_3
    //   39: invokevirtual 241	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   42: ldc_w 618
    //   45: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: iconst_1
    //   49: invokevirtual 194	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   52: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: astore 6
    //   57: aload_0
    //   58: getfield 123	com/tencent/mm/modelvideo/s:goN	Lcom/tencent/mm/bu/g;
    //   61: aload 6
    //   63: aconst_null
    //   64: iconst_2
    //   65: invokevirtual 306	com/tencent/mm/bu/g:a	(Ljava/lang/String;[Ljava/lang/String;I)Landroid/database/Cursor;
    //   68: astore 6
    //   70: aload 6
    //   72: invokeinterface 549 1 0
    //   77: ifeq +52 -> 129
    //   80: new 551	java/util/ArrayList
    //   83: dup
    //   84: invokespecial 552	java/util/ArrayList:<init>	()V
    //   87: astore 7
    //   89: new 594	com/tencent/mm/modelvideo/r
    //   92: dup
    //   93: invokespecial 595	com/tencent/mm/modelvideo/r:<init>	()V
    //   96: astore 8
    //   98: aload 8
    //   100: aload 6
    //   102: invokevirtual 598	com/tencent/mm/modelvideo/r:b	(Landroid/database/Cursor;)V
    //   105: aload 7
    //   107: aload 8
    //   109: invokeinterface 555 2 0
    //   114: pop
    //   115: aload 6
    //   117: invokeinterface 315 1 0
    //   122: istore 5
    //   124: iload 5
    //   126: ifne -37 -> 89
    //   129: aload 6
    //   131: ifnull +10 -> 141
    //   134: aload 6
    //   136: invokeinterface 339 1 0
    //   141: ldc2_w 608
    //   144: ldc_w 610
    //   147: invokestatic 109	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   150: aload 7
    //   152: areturn
    //   153: astore 7
    //   155: aconst_null
    //   156: astore 6
    //   158: aload 6
    //   160: ifnull +10 -> 170
    //   163: aload 6
    //   165: invokeinterface 339 1 0
    //   170: aload 7
    //   172: athrow
    //   173: astore 7
    //   175: goto -17 -> 158
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	178	0	this	s
    //   0	178	1	paramInt1	int
    //   0	178	2	paramInt2	int
    //   0	178	3	paramLong	long
    //   122	3	5	bool	boolean
    //   55	109	6	localObject1	Object
    //   1	150	7	localArrayList	ArrayList
    //   153	18	7	localObject2	Object
    //   173	1	7	localObject3	Object
    //   96	12	8	localr	r
    // Exception table:
    //   from	to	target	type
    //   57	70	153	finally
    //   70	89	173	finally
    //   89	124	173	finally
  }
  
  public final void a(a parama)
  {
    GMTrace.i(346415955968L, 2581);
    this.gsv.remove(parama);
    GMTrace.o(346415955968L, 2581);
  }
  
  public final void a(a parama, Looper paramLooper)
  {
    GMTrace.i(346281738240L, 2580);
    this.gsv.a(parama, paramLooper);
    GMTrace.o(346281738240L, 2580);
  }
  
  public final boolean a(r paramr)
  {
    GMTrace.i(346684391424L, 2583);
    paramr.eQl = -1;
    ContentValues localContentValues = paramr.qL();
    if ((int)this.goN.insert("videoinfo2", "filename", localContentValues) != -1)
    {
      paramr = new s.a.a(paramr.getFileName(), s.a.b.hcN, s.a.c.hcR, paramr.hcC, paramr.haN);
      this.gsv.bI(paramr);
      this.gsv.doNotify();
      GMTrace.o(346684391424L, 2583);
      return true;
    }
    GMTrace.o(346684391424L, 2583);
    return false;
  }
  
  public final List<r> aB(long paramLong)
  {
    GMTrace.i(346952826880L, 2585);
    Object localObject = "select videoinfo2.filename,videoinfo2.clientid,videoinfo2.msgsvrid,videoinfo2.netoffset,videoinfo2.filenowsize,videoinfo2.totallen,videoinfo2.thumbnetoffset,videoinfo2.thumblen,videoinfo2.status,videoinfo2.createtime,videoinfo2.lastmodifytime,videoinfo2.downloadtime,videoinfo2.videolength,videoinfo2.msglocalid,videoinfo2.nettimes,videoinfo2.cameratype,videoinfo2.user,videoinfo2.human,videoinfo2.reserved1,videoinfo2.reserved2,videoinfo2.reserved3,videoinfo2.reserved4,videoinfo2.videofuncflag,videoinfo2.masssendid,videoinfo2.masssendlist,videoinfo2.videomd5,videoinfo2.streamvideo,videoinfo2.statextstr,videoinfo2.downloadscene,videoinfo2.mmsightextinfo,videoinfo2.preloadsize,videoinfo2.videoformat from videoinfo2   where videoinfo2.masssendid = " + paramLong;
    localObject = this.goN.a((String)localObject, null, 2);
    if (localObject == null)
    {
      GMTrace.o(346952826880L, 2585);
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    while (((Cursor)localObject).moveToNext())
    {
      r localr = new r();
      localr.b((Cursor)localObject);
      localArrayList.add(localr);
    }
    ((Cursor)localObject).close();
    GMTrace.o(346952826880L, 2585);
    return localArrayList;
  }
  
  public final boolean b(r paramr)
  {
    GMTrace.i(347355480064L, 2588);
    boolean bool;
    if (paramr != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (paramr.getFileName().length() <= 0) {
        break label71;
      }
      bool = true;
      label31:
      Assert.assertTrue(bool);
      localObject = paramr.qL();
      if (((ContentValues)localObject).size() > 0) {
        break label76;
      }
      w.e("MicroMsg.VideoInfoStorage", "update failed, no values set");
    }
    label71:
    label76:
    while (this.goN.update("videoinfo2", (ContentValues)localObject, "filename= ?", new String[] { paramr.getFileName() }) <= 0)
    {
      GMTrace.o(347355480064L, 2588);
      return false;
      bool = false;
      break;
      bool = false;
      break label31;
    }
    Object localObject = s.a.c.hcR;
    if (paramr.status == 112) {}
    for (localObject = s.a.c.hcT;; localObject = s.a.c.hcS) {
      do
      {
        paramr = new s.a.a(paramr.getFileName(), s.a.b.hcP, (s.a.c)localObject, paramr.hcC, paramr.haN);
        this.gsv.bI(paramr);
        this.gsv.doNotify();
        GMTrace.o(347355480064L, 2588);
        return true;
      } while ((paramr.status != 103) && (paramr.status != 104));
    }
  }
  
  public final r mh(String paramString)
  {
    Object localObject = null;
    GMTrace.i(346818609152L, 2584);
    paramString = "select videoinfo2.filename,videoinfo2.clientid,videoinfo2.msgsvrid,videoinfo2.netoffset,videoinfo2.filenowsize,videoinfo2.totallen,videoinfo2.thumbnetoffset,videoinfo2.thumblen,videoinfo2.status,videoinfo2.createtime,videoinfo2.lastmodifytime,videoinfo2.downloadtime,videoinfo2.videolength,videoinfo2.msglocalid,videoinfo2.nettimes,videoinfo2.cameratype,videoinfo2.user,videoinfo2.human,videoinfo2.reserved1,videoinfo2.reserved2,videoinfo2.reserved3,videoinfo2.reserved4,videoinfo2.videofuncflag,videoinfo2.masssendid,videoinfo2.masssendlist,videoinfo2.videomd5,videoinfo2.streamvideo,videoinfo2.statextstr,videoinfo2.downloadscene,videoinfo2.mmsightextinfo,videoinfo2.preloadsize,videoinfo2.videoformat from videoinfo2   where videoinfo2.filename = \"" + bg.nk(paramString) + "\"";
    Cursor localCursor = this.goN.a(paramString, null, 2);
    if (localCursor == null)
    {
      GMTrace.o(346818609152L, 2584);
      return null;
    }
    paramString = (String)localObject;
    if (localCursor.moveToFirst())
    {
      paramString = new r();
      paramString.b(localCursor);
    }
    localCursor.close();
    GMTrace.o(346818609152L, 2584);
    return paramString;
  }
  
  public final boolean mi(String paramString)
  {
    GMTrace.i(347892350976L, 2592);
    if (this.goN.delete("videoinfo2", "filename= ?", new String[] { paramString }) > 0)
    {
      paramString = new s.a.a(paramString, s.a.b.hcO, s.a.c.hcR, 1, -1L);
      this.gsv.bI(paramString);
      this.gsv.doNotify();
      GMTrace.o(347892350976L, 2592);
      return true;
    }
    GMTrace.o(347892350976L, 2592);
    return false;
  }
  
  public final boolean o(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(348831875072L, 2599);
    boolean bool = an(paramString1, paramString2 + "##" + paramString3);
    GMTrace.o(348831875072L, 2599);
    return bool;
  }
  
  public static abstract interface a
  {
    public abstract void a(a parama);
    
    public static final class a
    {
      public final String euR;
      public final long haN;
      public final int hcC;
      public final int hcL;
      public final s.a.c hcM;
      
      public a(String paramString, int paramInt1, s.a.c paramc, int paramInt2, long paramLong)
      {
        GMTrace.i(18914096447488L, 140921);
        this.euR = paramString;
        this.hcL = paramInt1;
        this.hcM = paramc;
        this.hcC = paramInt2;
        this.haN = paramLong;
        GMTrace.o(18914096447488L, 140921);
      }
    }
    
    public static enum b
    {
      static
      {
        GMTrace.i(355811196928L, 2651);
        hcN = 1;
        hcO = 2;
        hcP = 3;
        hcQ = new int[] { hcN, hcO, hcP };
        GMTrace.o(355811196928L, 2651);
      }
    }
    
    public static enum c
    {
      static
      {
        GMTrace.i(325746425856L, 2427);
        hcR = new c("NORMAL", 0);
        hcS = new c("UPLOAD", 1);
        hcT = new c("DOWNLOAD", 2);
        hcU = new c[] { hcR, hcS, hcT };
        GMTrace.o(325746425856L, 2427);
      }
      
      private c()
      {
        GMTrace.i(18914499100672L, 140924);
        GMTrace.o(18914499100672L, 140924);
      }
    }
  }
  
  public static final class b
  {
    public byte[] buf;
    public int eyw;
    public int hcV;
    public int ret;
    
    public b()
    {
      GMTrace.i(316082749440L, 2355);
      this.buf = null;
      this.eyw = 0;
      this.hcV = 0;
      this.ret = 0;
      GMTrace.o(316082749440L, 2355);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvideo\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */