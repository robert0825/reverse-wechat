package com.tencent.mm.pluginsdk;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Contacts;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
{
  public static String Fp(String paramString)
  {
    GMTrace.i(723836207104L, 5393);
    String str = paramString.trim();
    boolean bool = str.startsWith("+");
    paramString = str;
    if (bool)
    {
      paramString = str;
      if (str.length() > 1) {
        paramString = str.substring(1, str.length());
      }
    }
    paramString = Pattern.compile("[^0-9]").matcher(paramString);
    if (bool) {}
    for (paramString = "+" + paramString.replaceAll("").trim();; paramString = paramString.replaceAll("").trim())
    {
      GMTrace.o(723836207104L, 5393);
      return paramString;
    }
  }
  
  public static boolean NT(String paramString)
  {
    GMTrace.i(723701989376L, 5392);
    if (paramString.length() <= 0)
    {
      GMTrace.o(723701989376L, 5392);
      return false;
    }
    GMTrace.o(723701989376L, 5392);
    return true;
  }
  
  public static Bitmap a(String paramString, Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(724909948928L, 5401);
    if ((paramString == null) || (paramString.equals("")))
    {
      GMTrace.o(724909948928L, 5401);
      return null;
    }
    paramContext = paramContext.getContentResolver();
    try
    {
      long l = bg.Sz(paramString);
      paramContext = ContactsContract.Contacts.openContactPhotoInputStream(paramContext, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, l), paramBoolean);
      if (paramContext == null)
      {
        GMTrace.o(724909948928L, 5401);
        return null;
      }
      Bitmap localBitmap = d.decodeStream(paramContext);
      paramContext = localBitmap;
      if (localBitmap != null) {
        paramContext = d.a(localBitmap, true, 4.0F);
      }
      GMTrace.o(724909948928L, 5401);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      w.printErrStackTrace("MicroMsg.AddressBookUtil", paramContext, "getAvatar, contactId:%s", new Object[] { paramString });
      GMTrace.o(724909948928L, 5401);
    }
    return null;
  }
  
  /* Error */
  public static boolean b(String paramString, Context paramContext, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc2_w 134
    //   3: sipush 5402
    //   6: invokestatic 14	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: ifnull +12 -> 22
    //   13: aload_0
    //   14: ldc 54
    //   16: invokevirtual 83	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   19: ifeq +14 -> 33
    //   22: ldc2_w 134
    //   25: sipush 5402
    //   28: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   31: iconst_0
    //   32: ireturn
    //   33: aload_1
    //   34: ldc -119
    //   36: invokestatic 143	com/tencent/mm/pluginsdk/h/a:aS	(Landroid/content/Context;Ljava/lang/String;)Z
    //   39: ifne +21 -> 60
    //   42: ldc 123
    //   44: ldc -111
    //   46: invokestatic 149	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   49: ldc2_w 134
    //   52: sipush 5402
    //   55: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   58: iconst_0
    //   59: ireturn
    //   60: aload_1
    //   61: invokevirtual 89	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   64: astore 7
    //   66: aload_0
    //   67: invokestatic 95	com/tencent/mm/sdk/platformtools/bg:Sz	(Ljava/lang/String;)J
    //   70: lstore 4
    //   72: new 151	android/content/ContentValues
    //   75: dup
    //   76: invokespecial 154	android/content/ContentValues:<init>	()V
    //   79: astore 8
    //   81: ldc -100
    //   83: iconst_4
    //   84: anewarray 4	java/lang/Object
    //   87: dup
    //   88: iconst_0
    //   89: ldc -98
    //   91: aastore
    //   92: dup
    //   93: iconst_1
    //   94: lload 4
    //   96: invokestatic 164	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   99: aastore
    //   100: dup
    //   101: iconst_2
    //   102: ldc -90
    //   104: aastore
    //   105: dup
    //   106: iconst_3
    //   107: ldc -88
    //   109: aastore
    //   110: invokestatic 172	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   113: astore_0
    //   114: ldc 123
    //   116: ldc -82
    //   118: iconst_1
    //   119: anewarray 4	java/lang/Object
    //   122: dup
    //   123: iconst_0
    //   124: aload_0
    //   125: aastore
    //   126: invokestatic 178	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   129: aload 7
    //   131: getstatic 181	android/provider/ContactsContract$Data:CONTENT_URI	Landroid/net/Uri;
    //   134: aconst_null
    //   135: aload_0
    //   136: aconst_null
    //   137: aconst_null
    //   138: invokevirtual 187	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   141: astore_1
    //   142: aload_1
    //   143: ifnonnull +24 -> 167
    //   146: aload_1
    //   147: ifnull +9 -> 156
    //   150: aload_1
    //   151: invokeinterface 192 1 0
    //   156: ldc2_w 134
    //   159: sipush 5402
    //   162: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   165: iconst_0
    //   166: ireturn
    //   167: aload_1
    //   168: astore_0
    //   169: aload_1
    //   170: ldc -62
    //   172: invokeinterface 198 2 0
    //   177: istore_3
    //   178: aload_1
    //   179: astore_0
    //   180: aload_1
    //   181: invokeinterface 202 1 0
    //   186: ifeq +248 -> 434
    //   189: aload_1
    //   190: astore_0
    //   191: aload_1
    //   192: iload_3
    //   193: invokeinterface 206 2 0
    //   198: istore_3
    //   199: aload_1
    //   200: astore_0
    //   201: aload 8
    //   203: ldc -98
    //   205: lload 4
    //   207: invokestatic 164	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   210: invokevirtual 210	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   213: aload_1
    //   214: astore_0
    //   215: aload 8
    //   217: ldc -44
    //   219: iconst_1
    //   220: invokestatic 217	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   223: invokevirtual 220	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   226: aload_1
    //   227: astore_0
    //   228: aload 8
    //   230: ldc -34
    //   232: aload_2
    //   233: invokevirtual 225	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   236: aload_1
    //   237: astore_0
    //   238: aload 8
    //   240: ldc -90
    //   242: ldc -88
    //   244: invokevirtual 227	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   247: iload_3
    //   248: iflt +68 -> 316
    //   251: aload_1
    //   252: astore_0
    //   253: aload 7
    //   255: getstatic 181	android/provider/ContactsContract$Data:CONTENT_URI	Landroid/net/Uri;
    //   258: aload 8
    //   260: new 48	java/lang/StringBuilder
    //   263: dup
    //   264: ldc -27
    //   266: invokespecial 52	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   269: iload_3
    //   270: invokevirtual 232	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   273: invokevirtual 66	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   276: aconst_null
    //   277: invokevirtual 236	android/content/ContentResolver:update	(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   280: istore_3
    //   281: iload_3
    //   282: ifle +28 -> 310
    //   285: iconst_1
    //   286: istore 6
    //   288: aload_1
    //   289: ifnull +9 -> 298
    //   292: aload_1
    //   293: invokeinterface 192 1 0
    //   298: ldc2_w 134
    //   301: sipush 5402
    //   304: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   307: iload 6
    //   309: ireturn
    //   310: iconst_0
    //   311: istore 6
    //   313: goto -25 -> 288
    //   316: aload_1
    //   317: astore_0
    //   318: aload 7
    //   320: getstatic 181	android/provider/ContactsContract$Data:CONTENT_URI	Landroid/net/Uri;
    //   323: aload 8
    //   325: invokevirtual 240	android/content/ContentResolver:insert	(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   328: pop
    //   329: aload_1
    //   330: ifnull +9 -> 339
    //   333: aload_1
    //   334: invokeinterface 192 1 0
    //   339: ldc2_w 134
    //   342: sipush 5402
    //   345: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   348: iconst_1
    //   349: ireturn
    //   350: astore_2
    //   351: aconst_null
    //   352: astore_1
    //   353: aload_1
    //   354: astore_0
    //   355: ldc 123
    //   357: aload_2
    //   358: ldc 54
    //   360: iconst_0
    //   361: anewarray 4	java/lang/Object
    //   364: invokestatic 131	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   367: aload_1
    //   368: ifnull +22 -> 390
    //   371: aload_1
    //   372: astore_0
    //   373: aload_1
    //   374: invokeinterface 243 1 0
    //   379: ifne +11 -> 390
    //   382: aload_1
    //   383: astore_0
    //   384: aload_1
    //   385: invokeinterface 192 1 0
    //   390: aload_1
    //   391: ifnull +9 -> 400
    //   394: aload_1
    //   395: invokeinterface 192 1 0
    //   400: ldc2_w 134
    //   403: sipush 5402
    //   406: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   409: iconst_0
    //   410: ireturn
    //   411: astore_1
    //   412: aconst_null
    //   413: astore_0
    //   414: aload_0
    //   415: ifnull +9 -> 424
    //   418: aload_0
    //   419: invokeinterface 192 1 0
    //   424: aload_1
    //   425: athrow
    //   426: astore_1
    //   427: goto -13 -> 414
    //   430: astore_2
    //   431: goto -78 -> 353
    //   434: iconst_m1
    //   435: istore_3
    //   436: goto -237 -> 199
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	439	0	paramString	String
    //   0	439	1	paramContext	Context
    //   0	439	2	paramArrayOfByte	byte[]
    //   177	259	3	i	int
    //   70	136	4	l	long
    //   286	26	6	bool	boolean
    //   64	255	7	localContentResolver	ContentResolver
    //   79	245	8	localContentValues	android.content.ContentValues
    // Exception table:
    //   from	to	target	type
    //   60	142	350	java/lang/Exception
    //   60	142	411	finally
    //   169	178	426	finally
    //   180	189	426	finally
    //   191	199	426	finally
    //   201	213	426	finally
    //   215	226	426	finally
    //   228	236	426	finally
    //   238	247	426	finally
    //   253	281	426	finally
    //   318	329	426	finally
    //   355	367	426	finally
    //   373	382	426	finally
    //   384	390	426	finally
    //   169	178	430	java/lang/Exception
    //   180	189	430	java/lang/Exception
    //   191	199	430	java/lang/Exception
    //   201	213	430	java/lang/Exception
    //   215	226	430	java/lang/Exception
    //   228	236	430	java/lang/Exception
    //   238	247	430	java/lang/Exception
    //   253	281	430	java/lang/Exception
    //   318	329	430	java/lang/Exception
  }
  
  /* Error */
  public static String[] b(Context paramContext, Uri paramUri)
  {
    // Byte code:
    //   0: ldc2_w 245
    //   3: sipush 5394
    //   6: invokestatic 14	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: ifnonnull +21 -> 31
    //   13: ldc 123
    //   15: ldc -8
    //   17: invokestatic 250	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   20: ldc2_w 245
    //   23: sipush 5394
    //   26: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   29: aconst_null
    //   30: areturn
    //   31: aconst_null
    //   32: astore 10
    //   34: aload_0
    //   35: ldc -119
    //   37: invokestatic 143	com/tencent/mm/pluginsdk/h/a:aS	(Landroid/content/Context;Ljava/lang/String;)Z
    //   40: ifne +21 -> 61
    //   43: ldc 123
    //   45: ldc -111
    //   47: invokestatic 149	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   50: ldc2_w 245
    //   53: sipush 5394
    //   56: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   59: aconst_null
    //   60: areturn
    //   61: aload_0
    //   62: invokevirtual 89	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   65: aload_1
    //   66: aconst_null
    //   67: aconst_null
    //   68: aconst_null
    //   69: aconst_null
    //   70: invokevirtual 187	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   73: astore 5
    //   75: aload 5
    //   77: ifnull +816 -> 893
    //   80: aload 5
    //   82: astore 10
    //   84: aload 5
    //   86: invokeinterface 253 1 0
    //   91: ifle +802 -> 893
    //   94: aload 5
    //   96: astore 10
    //   98: aload 5
    //   100: invokeinterface 202 1 0
    //   105: pop
    //   106: aload 5
    //   108: astore 10
    //   110: aload 5
    //   112: ldc -1
    //   114: invokeinterface 258 2 0
    //   119: istore_2
    //   120: iload_2
    //   121: ifle +18 -> 139
    //   124: aload 5
    //   126: astore 10
    //   128: aload 5
    //   130: iload_2
    //   131: invokeinterface 206 2 0
    //   136: ifle +757 -> 893
    //   139: aload 5
    //   141: astore 10
    //   143: aload 5
    //   145: aload 5
    //   147: ldc -62
    //   149: invokeinterface 258 2 0
    //   154: invokeinterface 262 2 0
    //   159: astore_1
    //   160: aload 5
    //   162: astore 10
    //   164: aload_0
    //   165: invokevirtual 89	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   168: getstatic 265	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   171: aconst_null
    //   172: new 48	java/lang/StringBuilder
    //   175: dup
    //   176: ldc_w 267
    //   179: invokespecial 52	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   182: aload_1
    //   183: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: invokevirtual 66	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   189: aconst_null
    //   190: aconst_null
    //   191: invokevirtual 187	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   194: astore 11
    //   196: aload 11
    //   198: ifnull +702 -> 900
    //   201: aload 5
    //   203: astore 10
    //   205: aload 11
    //   207: invokeinterface 202 1 0
    //   212: istore 4
    //   214: iload 4
    //   216: ifeq +684 -> 900
    //   219: aconst_null
    //   220: astore 7
    //   222: aconst_null
    //   223: astore_1
    //   224: aload 7
    //   226: astore 6
    //   228: aload_1
    //   229: astore_0
    //   230: aload 7
    //   232: astore 8
    //   234: aload_1
    //   235: astore 9
    //   237: aload 5
    //   239: astore 10
    //   241: aload 11
    //   243: invokeinterface 270 1 0
    //   248: ifne +474 -> 722
    //   251: aload 7
    //   253: astore 6
    //   255: aload_1
    //   256: astore_0
    //   257: aload 5
    //   259: astore 10
    //   261: aload 11
    //   263: ldc_w 272
    //   266: invokeinterface 258 2 0
    //   271: istore_2
    //   272: aload 7
    //   274: astore 6
    //   276: aload_1
    //   277: astore_0
    //   278: aload 5
    //   280: astore 10
    //   282: aload 11
    //   284: ldc_w 274
    //   287: invokeinterface 258 2 0
    //   292: istore_3
    //   293: aload 7
    //   295: astore 6
    //   297: aload_1
    //   298: astore_0
    //   299: aload 5
    //   301: astore 10
    //   303: aload 11
    //   305: iload_2
    //   306: invokeinterface 262 2 0
    //   311: astore 12
    //   313: aload 7
    //   315: astore 6
    //   317: aload_1
    //   318: astore_0
    //   319: aload 5
    //   321: astore 10
    //   323: aload 11
    //   325: iload_3
    //   326: invokeinterface 262 2 0
    //   331: astore 9
    //   333: aload 9
    //   335: astore 6
    //   337: aload_1
    //   338: astore_0
    //   339: aload 5
    //   341: astore 10
    //   343: ldc 123
    //   345: new 48	java/lang/StringBuilder
    //   348: dup
    //   349: ldc_w 276
    //   352: invokespecial 52	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   355: aload 9
    //   357: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   360: invokevirtual 66	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   363: invokestatic 250	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   366: aload_1
    //   367: astore 8
    //   369: aload 12
    //   371: ifnull +136 -> 507
    //   374: aload 9
    //   376: astore 6
    //   378: aload_1
    //   379: astore_0
    //   380: aload 5
    //   382: astore 10
    //   384: ldc 123
    //   386: new 48	java/lang/StringBuilder
    //   389: dup
    //   390: ldc_w 278
    //   393: invokespecial 52	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   396: aload 12
    //   398: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   401: invokevirtual 66	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   404: invokestatic 250	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   407: aload 12
    //   409: ifnonnull +245 -> 654
    //   412: aconst_null
    //   413: astore 7
    //   415: aload 9
    //   417: astore 6
    //   419: aload_1
    //   420: astore_0
    //   421: aload 5
    //   423: astore 10
    //   425: ldc 123
    //   427: new 48	java/lang/StringBuilder
    //   430: dup
    //   431: ldc_w 278
    //   434: invokespecial 52	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   437: aload 7
    //   439: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   442: invokevirtual 66	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   445: invokestatic 250	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   448: aload_1
    //   449: astore 8
    //   451: aload 9
    //   453: astore 6
    //   455: aload_1
    //   456: astore_0
    //   457: aload 5
    //   459: astore 10
    //   461: aload 7
    //   463: invokestatic 283	android/telephony/PhoneNumberUtils:isGlobalPhoneNumber	(Ljava/lang/String;)Z
    //   466: ifeq +7 -> 473
    //   469: aload 7
    //   471: astore 8
    //   473: aload 9
    //   475: astore 6
    //   477: aload 8
    //   479: astore_0
    //   480: aload 5
    //   482: astore 10
    //   484: ldc 123
    //   486: new 48	java/lang/StringBuilder
    //   489: dup
    //   490: ldc_w 285
    //   493: invokespecial 52	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   496: aload 8
    //   498: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   501: invokevirtual 66	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   504: invokestatic 250	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   507: aload 9
    //   509: astore 6
    //   511: aload 8
    //   513: astore_0
    //   514: aload 5
    //   516: astore 10
    //   518: aload 11
    //   520: invokeinterface 288 1 0
    //   525: pop
    //   526: aload 9
    //   528: astore 7
    //   530: aload 8
    //   532: astore_1
    //   533: goto -309 -> 224
    //   536: astore_1
    //   537: aload 6
    //   539: astore 7
    //   541: aload_1
    //   542: astore 6
    //   544: aload_0
    //   545: astore_1
    //   546: aload 7
    //   548: astore_0
    //   549: ldc 123
    //   551: aload 6
    //   553: ldc_w 290
    //   556: iconst_0
    //   557: anewarray 4	java/lang/Object
    //   560: invokestatic 131	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   563: aload_0
    //   564: astore 6
    //   566: aload_1
    //   567: astore 7
    //   569: aload 5
    //   571: ifnull +32 -> 603
    //   574: aload_0
    //   575: astore 6
    //   577: aload_1
    //   578: astore 7
    //   580: aload 5
    //   582: invokeinterface 243 1 0
    //   587: ifne +16 -> 603
    //   590: aload 5
    //   592: invokeinterface 192 1 0
    //   597: aload_1
    //   598: astore 7
    //   600: aload_0
    //   601: astore 6
    //   603: aload 6
    //   605: invokestatic 296	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   608: ifeq +232 -> 840
    //   611: aload 7
    //   613: invokestatic 296	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   616: ifeq +224 -> 840
    //   619: ldc2_w 245
    //   622: sipush 5394
    //   625: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   628: aconst_null
    //   629: areturn
    //   630: astore_0
    //   631: aload 5
    //   633: astore 10
    //   635: ldc 123
    //   637: aload_0
    //   638: ldc_w 298
    //   641: iconst_0
    //   642: anewarray 4	java/lang/Object
    //   645: invokestatic 131	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   648: aconst_null
    //   649: astore 11
    //   651: goto -455 -> 196
    //   654: aload 9
    //   656: astore 6
    //   658: aload_1
    //   659: astore_0
    //   660: aload 5
    //   662: astore 10
    //   664: aload 12
    //   666: ldc_w 300
    //   669: ldc 54
    //   671: invokevirtual 303	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   674: astore 8
    //   676: aload 8
    //   678: astore 7
    //   680: aload 9
    //   682: astore 6
    //   684: aload_1
    //   685: astore_0
    //   686: aload 5
    //   688: astore 10
    //   690: aload 8
    //   692: ldc_w 305
    //   695: invokevirtual 26	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   698: ifeq -283 -> 415
    //   701: aload 9
    //   703: astore 6
    //   705: aload_1
    //   706: astore_0
    //   707: aload 5
    //   709: astore 10
    //   711: aload 8
    //   713: iconst_2
    //   714: invokevirtual 307	java/lang/String:substring	(I)Ljava/lang/String;
    //   717: astore 7
    //   719: goto -304 -> 415
    //   722: aload 11
    //   724: ifnull +42 -> 766
    //   727: aload 8
    //   729: astore 6
    //   731: aload 9
    //   733: astore_0
    //   734: aload 5
    //   736: astore 10
    //   738: aload 11
    //   740: invokeinterface 243 1 0
    //   745: ifne +21 -> 766
    //   748: aload 8
    //   750: astore 6
    //   752: aload 9
    //   754: astore_0
    //   755: aload 5
    //   757: astore 10
    //   759: aload 11
    //   761: invokeinterface 192 1 0
    //   766: aload 8
    //   768: astore_0
    //   769: aload 9
    //   771: astore_1
    //   772: aload_0
    //   773: astore 6
    //   775: aload_1
    //   776: astore 7
    //   778: aload 5
    //   780: ifnull -177 -> 603
    //   783: aload_0
    //   784: astore 6
    //   786: aload_1
    //   787: astore 7
    //   789: aload 5
    //   791: invokeinterface 243 1 0
    //   796: ifne -193 -> 603
    //   799: aload 5
    //   801: invokeinterface 192 1 0
    //   806: aload_0
    //   807: astore 6
    //   809: aload_1
    //   810: astore 7
    //   812: goto -209 -> 603
    //   815: astore_0
    //   816: aload 10
    //   818: ifnull +20 -> 838
    //   821: aload 10
    //   823: invokeinterface 243 1 0
    //   828: ifne +10 -> 838
    //   831: aload 10
    //   833: invokeinterface 192 1 0
    //   838: aload_0
    //   839: athrow
    //   840: ldc2_w 245
    //   843: sipush 5394
    //   846: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   849: iconst_2
    //   850: anewarray 16	java/lang/String
    //   853: dup
    //   854: iconst_0
    //   855: aload 6
    //   857: aastore
    //   858: dup
    //   859: iconst_1
    //   860: aload 7
    //   862: aastore
    //   863: areturn
    //   864: astore_0
    //   865: aload 5
    //   867: astore 10
    //   869: goto -53 -> 816
    //   872: astore 6
    //   874: aconst_null
    //   875: astore 5
    //   877: aconst_null
    //   878: astore_1
    //   879: aconst_null
    //   880: astore_0
    //   881: goto -332 -> 549
    //   884: astore 6
    //   886: aconst_null
    //   887: astore_1
    //   888: aconst_null
    //   889: astore_0
    //   890: goto -341 -> 549
    //   893: aconst_null
    //   894: astore_0
    //   895: aconst_null
    //   896: astore_1
    //   897: goto -125 -> 772
    //   900: aconst_null
    //   901: astore 8
    //   903: aconst_null
    //   904: astore 9
    //   906: goto -184 -> 722
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	909	0	paramContext	Context
    //   0	909	1	paramUri	Uri
    //   119	187	2	i	int
    //   292	34	3	j	int
    //   212	3	4	bool	boolean
    //   73	803	5	localCursor1	Cursor
    //   226	630	6	localObject1	Object
    //   872	1	6	localException1	Exception
    //   884	1	6	localException2	Exception
    //   220	641	7	localObject2	Object
    //   232	670	8	localObject3	Object
    //   235	670	9	localObject4	Object
    //   32	836	10	localObject5	Object
    //   194	566	11	localCursor2	Cursor
    //   311	354	12	str	String
    // Exception table:
    //   from	to	target	type
    //   241	251	536	java/lang/Exception
    //   261	272	536	java/lang/Exception
    //   282	293	536	java/lang/Exception
    //   303	313	536	java/lang/Exception
    //   323	333	536	java/lang/Exception
    //   343	366	536	java/lang/Exception
    //   384	407	536	java/lang/Exception
    //   425	448	536	java/lang/Exception
    //   461	469	536	java/lang/Exception
    //   484	507	536	java/lang/Exception
    //   518	526	536	java/lang/Exception
    //   664	676	536	java/lang/Exception
    //   690	701	536	java/lang/Exception
    //   711	719	536	java/lang/Exception
    //   738	748	536	java/lang/Exception
    //   759	766	536	java/lang/Exception
    //   164	196	630	java/lang/Exception
    //   61	75	815	finally
    //   84	94	815	finally
    //   98	106	815	finally
    //   110	120	815	finally
    //   128	139	815	finally
    //   143	160	815	finally
    //   164	196	815	finally
    //   205	214	815	finally
    //   241	251	815	finally
    //   261	272	815	finally
    //   282	293	815	finally
    //   303	313	815	finally
    //   323	333	815	finally
    //   343	366	815	finally
    //   384	407	815	finally
    //   425	448	815	finally
    //   461	469	815	finally
    //   484	507	815	finally
    //   518	526	815	finally
    //   635	648	815	finally
    //   664	676	815	finally
    //   690	701	815	finally
    //   711	719	815	finally
    //   738	748	815	finally
    //   759	766	815	finally
    //   549	563	864	finally
    //   61	75	872	java/lang/Exception
    //   84	94	884	java/lang/Exception
    //   98	106	884	java/lang/Exception
    //   110	120	884	java/lang/Exception
    //   128	139	884	java/lang/Exception
    //   143	160	884	java/lang/Exception
    //   205	214	884	java/lang/Exception
    //   635	648	884	java/lang/Exception
  }
  
  public static Uri bIO()
  {
    GMTrace.i(724775731200L, 5400);
    try
    {
      Uri localUri = ContactsContract.Contacts.CONTENT_URI;
      GMTrace.o(724775731200L, 5400);
      return localUri;
    }
    catch (Exception localException)
    {
      GMTrace.o(724775731200L, 5400);
    }
    return null;
  }
  
  public static List<String[]> dB(Context paramContext)
  {
    GMTrace.i(724104642560L, 5395);
    LinkedList localLinkedList = new LinkedList();
    Object localObject2 = paramContext.getContentResolver();
    if (!com.tencent.mm.pluginsdk.h.a.aS(paramContext, "android.permission.READ_CONTACTS"))
    {
      w.e("MicroMsg.AddressBookUtil", "no contact permission");
      GMTrace.o(724104642560L, 5395);
      return localLinkedList;
    }
    try
    {
      paramContext = ((ContentResolver)localObject2).query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
      if (paramContext == null)
      {
        w.e("MicroMsg.AddressBookUtil", "getMobileInfo: mobile is null");
        GMTrace.o(724104642560L, 5395);
        return localLinkedList;
      }
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        w.e("MicroMsg.AddressBookUtil", "getMobileInfo: exception occured [%s]", new Object[] { paramContext.getMessage() });
        w.printErrStackTrace("MicroMsg.AddressBookUtil", paramContext, "", new Object[0]);
        paramContext = null;
      }
      try
      {
        if ((paramContext.getCount() > 0) && (paramContext.moveToFirst()))
        {
          boolean bool;
          do
          {
            localObject2 = paramContext.getString(paramContext.getColumnIndex("display_name"));
            localLinkedList.add(new String[] { paramContext.getString(paramContext.getColumnIndex("contact_id")), localObject2, paramContext.getString(paramContext.getColumnIndex("data1")), paramContext.getString(paramContext.getColumnIndex("raw_contact_id")), String.valueOf(Long.valueOf(paramContext.getLong(paramContext.getColumnIndex("photo_id")))) });
            bool = paramContext.moveToNext();
          } while (bool);
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.AddressBookUtil", "getMobileInfo: exception2 occured [%s]", new Object[] { localException.getMessage() });
          w.printErrStackTrace("MicroMsg.AddressBookUtil", localException, "", new Object[0]);
          paramContext.close();
        }
      }
      finally
      {
        paramContext.close();
      }
      GMTrace.o(724104642560L, 5395);
      return localLinkedList;
    }
  }
  
  public static List<String[]> dC(Context paramContext)
  {
    GMTrace.i(724238860288L, 5396);
    LinkedList localLinkedList = new LinkedList();
    Object localObject2 = paramContext.getContentResolver();
    if (!com.tencent.mm.pluginsdk.h.a.aS(paramContext, "android.permission.READ_CONTACTS"))
    {
      w.e("MicroMsg.AddressBookUtil", "no contact permission");
      GMTrace.o(724238860288L, 5396);
      return localLinkedList;
    }
    try
    {
      paramContext = ((ContentResolver)localObject2).query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, "sort_key_alt");
      if (paramContext == null)
      {
        w.e("MicroMsg.AddressBookUtil", "getMobileInfo: mobile is null");
        GMTrace.o(724238860288L, 5396);
        return localLinkedList;
      }
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.AddressBookUtil", paramContext, "", new Object[0]);
        w.e("MicroMsg.AddressBookUtil", "exception in getMoblieOrderInfo(), [%s]", new Object[] { paramContext.getMessage() });
        paramContext = ((ContentResolver)localObject2).query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
      }
      try
      {
        if ((paramContext.getCount() > 0) && (paramContext.moveToFirst()))
        {
          boolean bool;
          do
          {
            localObject2 = paramContext.getString(paramContext.getColumnIndex("display_name"));
            localLinkedList.add(new String[] { paramContext.getString(paramContext.getColumnIndex("contact_id")), localObject2, paramContext.getString(paramContext.getColumnIndex("data1")), paramContext.getString(paramContext.getColumnIndex("raw_contact_id")) });
            bool = paramContext.moveToNext();
          } while (bool);
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.AddressBookUtil", localException, "", new Object[0]);
          w.e("MicroMsg.AddressBookUtil", "exception in getMoblieOrderInfo()2, [%s]", new Object[] { localException.getMessage() });
          paramContext.close();
        }
      }
      finally
      {
        paramContext.close();
      }
      GMTrace.o(724238860288L, 5396);
      return localLinkedList;
    }
  }
  
  public static List<String[]> dD(Context paramContext)
  {
    GMTrace.i(724373078016L, 5397);
    LinkedList localLinkedList = new LinkedList();
    Object localObject = paramContext.getContentResolver();
    if (!com.tencent.mm.pluginsdk.h.a.aS(paramContext, "android.permission.READ_CONTACTS"))
    {
      w.e("MicroMsg.AddressBookUtil", "no contact permission");
      GMTrace.o(724373078016L, 5397);
      return localLinkedList;
    }
    try
    {
      paramContext = ((ContentResolver)localObject).query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, null, null, null, null);
      if (paramContext == null)
      {
        GMTrace.o(724373078016L, 5397);
        return localLinkedList;
      }
      if (paramContext.moveToFirst()) {
        do
        {
          localObject = paramContext.getString(paramContext.getColumnIndex("data1"));
          localLinkedList.add(new String[] { paramContext.getString(paramContext.getColumnIndex("contact_id")), paramContext.getString(paramContext.getColumnIndex("data4")), localObject, paramContext.getString(paramContext.getColumnIndex("raw_contact_id")), paramContext.getString(paramContext.getColumnIndex("photo_id")) });
        } while (paramContext.moveToNext());
      }
      paramContext.close();
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.AddressBookUtil", paramContext, "getEmailInfo", new Object[0]);
      }
    }
    GMTrace.o(724373078016L, 5397);
    return localLinkedList;
  }
  
  /* Error */
  public static List<String> dE(Context paramContext)
  {
    // Byte code:
    //   0: ldc2_w 368
    //   3: sipush 5398
    //   6: invokestatic 14	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 317	java/util/LinkedList
    //   12: dup
    //   13: invokespecial 318	java/util/LinkedList:<init>	()V
    //   16: astore 4
    //   18: aload_0
    //   19: invokevirtual 89	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   22: astore_2
    //   23: aload_0
    //   24: ldc -119
    //   26: invokestatic 143	com/tencent/mm/pluginsdk/h/a:aS	(Landroid/content/Context;Ljava/lang/String;)Z
    //   29: ifne +22 -> 51
    //   32: ldc 123
    //   34: ldc -111
    //   36: invokestatic 149	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   39: ldc2_w 368
    //   42: sipush 5398
    //   45: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   48: aload 4
    //   50: areturn
    //   51: aload_2
    //   52: getstatic 265	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   55: aconst_null
    //   56: aconst_null
    //   57: aconst_null
    //   58: aconst_null
    //   59: invokevirtual 187	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   62: astore_2
    //   63: aload_2
    //   64: ifnonnull +35 -> 99
    //   67: aload_2
    //   68: astore_0
    //   69: ldc 123
    //   71: ldc_w 371
    //   74: invokestatic 149	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   77: aload_2
    //   78: ifnull +9 -> 87
    //   81: aload_2
    //   82: invokeinterface 192 1 0
    //   87: ldc2_w 368
    //   90: sipush 5398
    //   93: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   96: aload 4
    //   98: areturn
    //   99: aload_2
    //   100: astore_0
    //   101: aload_2
    //   102: invokeinterface 202 1 0
    //   107: ifeq +41 -> 148
    //   110: aload_2
    //   111: astore_0
    //   112: aload 4
    //   114: aload_2
    //   115: aload_2
    //   116: ldc_w 272
    //   119: invokeinterface 258 2 0
    //   124: invokeinterface 262 2 0
    //   129: invokeinterface 343 2 0
    //   134: pop
    //   135: aload_2
    //   136: astore_0
    //   137: aload_2
    //   138: invokeinterface 288 1 0
    //   143: istore_1
    //   144: iload_1
    //   145: ifne -35 -> 110
    //   148: aload_2
    //   149: ifnull +9 -> 158
    //   152: aload_2
    //   153: invokeinterface 192 1 0
    //   158: ldc2_w 368
    //   161: sipush 5398
    //   164: invokestatic 69	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   167: aload 4
    //   169: areturn
    //   170: astore_3
    //   171: aconst_null
    //   172: astore_2
    //   173: aload_2
    //   174: astore_0
    //   175: ldc 123
    //   177: ldc_w 373
    //   180: iconst_1
    //   181: anewarray 4	java/lang/Object
    //   184: dup
    //   185: iconst_0
    //   186: aload_3
    //   187: invokevirtual 325	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   190: aastore
    //   191: invokestatic 327	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   194: aload_2
    //   195: astore_0
    //   196: ldc 123
    //   198: aload_3
    //   199: ldc 54
    //   201: iconst_0
    //   202: anewarray 4	java/lang/Object
    //   205: invokestatic 131	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   208: aload_2
    //   209: ifnull -51 -> 158
    //   212: aload_2
    //   213: invokeinterface 192 1 0
    //   218: goto -60 -> 158
    //   221: astore_2
    //   222: aconst_null
    //   223: astore_0
    //   224: aload_0
    //   225: ifnull +9 -> 234
    //   228: aload_0
    //   229: invokeinterface 192 1 0
    //   234: aload_2
    //   235: athrow
    //   236: astore_2
    //   237: goto -13 -> 224
    //   240: astore_3
    //   241: goto -68 -> 173
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	244	0	paramContext	Context
    //   143	2	1	bool	boolean
    //   22	191	2	localObject1	Object
    //   221	14	2	localObject2	Object
    //   236	1	2	localObject3	Object
    //   170	29	3	localException1	Exception
    //   240	1	3	localException2	Exception
    //   16	152	4	localLinkedList	LinkedList
    // Exception table:
    //   from	to	target	type
    //   51	63	170	java/lang/Exception
    //   51	63	221	finally
    //   69	77	236	finally
    //   101	110	236	finally
    //   112	135	236	finally
    //   137	144	236	finally
    //   175	194	236	finally
    //   196	208	236	finally
    //   69	77	240	java/lang/Exception
    //   101	110	240	java/lang/Exception
    //   112	135	240	java/lang/Exception
    //   137	144	240	java/lang/Exception
  }
  
  public static String g(String paramString, Context paramContext)
  {
    GMTrace.i(724641513472L, 5399);
    if (!com.tencent.mm.pluginsdk.h.a.aS(paramContext, "android.permission.READ_CONTACTS"))
    {
      w.e("MicroMsg.AddressBookUtil", "no contact permission");
      GMTrace.o(724641513472L, 5399);
      return "";
    }
    try
    {
      paramString = paramContext.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, new String[] { "display_name" }, "_id = ?", new String[] { paramString }, null);
      if (paramString == null)
      {
        GMTrace.o(724641513472L, 5399);
        return "";
      }
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.AddressBookUtil", paramString, "getContactNameById:", new Object[0]);
        paramString = null;
      }
    }
    if (paramString.moveToFirst()) {}
    for (paramContext = paramString.getString(0);; paramContext = "")
    {
      paramString.close();
      GMTrace.o(724641513472L, 5399);
      return paramContext;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */