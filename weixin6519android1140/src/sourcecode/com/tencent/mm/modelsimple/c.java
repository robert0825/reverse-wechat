package com.tencent.mm.modelsimple;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Contacts;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.Profile;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.pluginsdk.h.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class c
{
  @TargetApi(14)
  public static String bi(Context paramContext)
  {
    GMTrace.i(1358954496000L, 10125);
    w.i("MicroMsg.ContactsUtil", "Get name of a contacts record or profile.");
    if (paramContext == null)
    {
      w.e("MicroMsg.ContactsUtil", "context is null.");
      GMTrace.o(1358954496000L, 10125);
      return null;
    }
    ContentResolver localContentResolver = paramContext.getContentResolver();
    if (!a.aS(paramContext, "android.permission.READ_CONTACTS"))
    {
      w.e("MicroMsg.ContactsUtil", "no contact permission");
      GMTrace.o(1358954496000L, 10125);
      return null;
    }
    if (f.et(14)) {
      w.i("MicroMsg.ContactsUtil", "The Android API version is higher than 14.");
    }
    for (;;)
    {
      try
      {
        localObject = localContentResolver.query(ContactsContract.Profile.CONTENT_URI, new String[] { "display_name" }, null, null, null);
        if (localObject == null) {
          break label319;
        }
        if (((Cursor)localObject).moveToFirst())
        {
          String str1 = ((Cursor)localObject).getString(((Cursor)localObject).getColumnIndex("display_name"));
          w.i("MicroMsg.ContactsUtil", "Have got name from profile, name is %s", new Object[] { str1 });
          ((Cursor)localObject).close();
          localObject = str1;
          if (bg.nm(str1))
          {
            paramContext = z(paramContext, d.br(paramContext));
            if (bg.nm(paramContext))
            {
              w.i("MicroMsg.ContactsUtil", "contactId is null.");
              GMTrace.o(1358954496000L, 10125);
              return null;
            }
          }
        }
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.ContactsUtil", localException, "", new Object[0]);
        w.d("MicroMsg.ContactsUtil", "query crashed");
        Object localObject = null;
        continue;
        paramContext = localContentResolver.query(ContactsContract.Data.CONTENT_URI, new String[] { "display_name" }, "contact_id=?", new String[] { paramContext }, null);
        localObject = localException;
        if (paramContext != null)
        {
          if (paramContext.moveToFirst())
          {
            str2 = paramContext.getString(paramContext.getColumnIndex("display_name"));
            w.i("MicroMsg.ContactsUtil", "Have got name from contacts, name is %s", new Object[] { str2 });
          }
          paramContext.close();
          localObject = str2;
        }
        GMTrace.o(1358954496000L, 10125);
        return (String)localObject;
      }
      String str2 = null;
      continue;
      label319:
      str2 = null;
    }
  }
  
  @TargetApi(14)
  public static Bitmap bj(Context paramContext)
  {
    GMTrace.i(1359088713728L, 10126);
    w.i("MicroMsg.ContactsUtil", "Get bitmap of a contacts record or profile.");
    if (paramContext == null)
    {
      w.e("MicroMsg.ContactsUtil", "context is null.");
      GMTrace.o(1359088713728L, 10126);
      return null;
    }
    ContentResolver localContentResolver = paramContext.getContentResolver();
    Object localObject5 = null;
    if (!a.aS(paramContext, "android.permission.READ_CONTACTS"))
    {
      w.e("MicroMsg.ContactsUtil", "no contact permission");
      GMTrace.o(1359088713728L, 10126);
      return null;
    }
    Object localObject3 = null;
    Object localObject1 = localObject5;
    if (f.et(14))
    {
      w.i("MicroMsg.ContactsUtil", "The Android API version is higher than 14.");
      try
      {
        localObject1 = localContentResolver.query(ContactsContract.Profile.CONTENT_URI, new String[] { "_id" }, null, null, null);
        localObject3 = localObject1;
      }
      catch (Exception localException1)
      {
        try
        {
          localObject4 = localContentResolver.query(Uri.withAppendedPath(ContactsContract.Profile.CONTENT_URI, "data"), new String[] { "data15", "data_sync1" }, "mimetype=?", new String[] { "vnd.android.cursor.item/photo" }, null);
          localObject1 = localObject5;
          if (localObject4 == null) {
            break label524;
          }
          if (!((Cursor)localObject4).moveToFirst()) {
            break label1051;
          }
          if ((!am.isWifi(paramContext)) && (!am.is3G(paramContext)) && (!am.is4G(paramContext))) {
            break label433;
          }
          w.i("MicroMsg.ContactsUtil", "The network status is wifi or 3G or 4G.");
          localObject1 = ((Cursor)localObject4).getString(((Cursor)localObject4).getColumnIndex("data_sync1"));
          w.i("MicroMsg.ContactsUtil", "get sync avatar url : [%s]", new Object[] { localObject1 });
          if (bg.nm((String)localObject1)) {
            break label433;
          }
          i = ((String)localObject1).lastIndexOf("https:");
          w.i("MicroMsg.ContactsUtil", "check is exist https download url :[%d]", new Object[] { Integer.valueOf(i) });
          if (i < 0) {
            break label433;
          }
          localObject3 = ((String)localObject1).substring(i);
          localObject1 = ln((String)localObject3);
          w.i("MicroMsg.ContactsUtil", "Get image from google sync account in profile,url:[%s]", new Object[] { localObject3 });
          localObject3 = localObject1;
          if (localObject1 == null) {
            break label436;
          }
          localObject3 = localObject1;
          if (((Bitmap)localObject1).isRecycled()) {
            break label436;
          }
          ((Cursor)localObject4).close();
          GMTrace.o(1359088713728L, 10126);
          return (Bitmap)localObject1;
          localException1 = localException1;
          w.printErrStackTrace("MicroMsg.ContactsUtil", localException1, "", new Object[0]);
          w.d("MicroMsg.ContactsUtil", "query crashed");
        }
        catch (Exception localException2)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.ContactsUtil", localException2, "", new Object[0]);
            w.d("MicroMsg.ContactsUtil", "query crashed");
            localObject4 = localObject3;
          }
          localObject3 = null;
          i = ((Cursor)localObject4).getColumnIndex("data15");
          localObject2 = localObject3;
          if (i == -1) {
            break label517;
          }
          localObject5 = ((Cursor)localObject4).getBlob(i);
          w.i("MicroMsg.ContactsUtil", "get bitmap data is null : [%b]", new Object[] { Boolean.valueOf(bg.bq((byte[])localObject5)) });
          localObject2 = localObject3;
          if (bg.bq((byte[])localObject5)) {
            break label517;
          }
          w.i("MicroMsg.ContactsUtil", "Get image from profile personal icon.");
          localObject2 = BitmapFactory.decodeByteArray((byte[])localObject5, 0, localObject5.length);
        }
      }
      localObject1 = localObject5;
      if (localObject3 != null)
      {
        if (((Cursor)localObject3).getCount() <= 0) {
          break label577;
        }
        ((Cursor)localObject3).close();
      }
    }
    for (;;)
    {
      label433:
      label436:
      label517:
      ((Cursor)localObject4).close();
      for (;;)
      {
        label524:
        if (localObject2 != null)
        {
          localObject3 = localObject2;
          if (!((Bitmap)localObject2).isRecycled()) {
            break label891;
          }
        }
        localObject5 = z(paramContext, d.br(paramContext));
        if (!bg.nm((String)localObject5)) {
          break;
        }
        w.i("MicroMsg.ContactsUtil", "contactId is null.");
        GMTrace.o(1359088713728L, 10126);
        return null;
        label577:
        ((Cursor)localObject3).close();
        localObject2 = localObject5;
      }
      Object localObject4 = localContentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[] { "photo_id", "raw_contact_id" }, "contact_id=?", new String[] { localObject5 }, null);
      localObject3 = localObject2;
      Cursor localCursor;
      if (localObject4 != null)
      {
        localObject3 = localObject2;
        if (((Cursor)localObject4).moveToFirst())
        {
          if ((!am.isWifi(paramContext)) && (!am.is3G(paramContext)))
          {
            localObject3 = localObject2;
            if (!am.is4G(paramContext)) {
              break label910;
            }
          }
          w.i("MicroMsg.ContactsUtil", "The network status is wifi or 3G or 4G.");
          localObject3 = ((Cursor)localObject4).getString(((Cursor)localObject4).getColumnIndex("raw_contact_id"));
          localCursor = localContentResolver.query(ContactsContract.Data.CONTENT_URI, new String[] { "data15", "data_sync1" }, "mimetype=? AND raw_contact_id=?", new String[] { "vnd.android.cursor.item/photo", localObject3 }, null);
          localObject3 = localObject2;
          if (localCursor == null) {
            break label910;
          }
          localObject3 = localObject2;
          if (localCursor.moveToFirst())
          {
            i = localCursor.getColumnIndex("data_sync1");
            localObject3 = localObject2;
            if (i != -1)
            {
              String str = localCursor.getString(i);
              localObject3 = localObject2;
              if (!bg.nm(str))
              {
                i = str.lastIndexOf("https:");
                localObject3 = localObject2;
                if (i >= 0)
                {
                  str = str.substring(i);
                  localObject2 = ln(str);
                  localObject3 = localObject2;
                  if (localObject2 != null)
                  {
                    localObject3 = localObject2;
                    if (!((Bitmap)localObject2).isRecycled())
                    {
                      w.i("MicroMsg.ContactsUtil", "Get image from google sync account in contacts,url:[%s]", new Object[] { str });
                      localCursor.close();
                      localObject3 = localObject2;
                    }
                  }
                }
              }
            }
          }
        }
        else
        {
          label884:
          ((Cursor)localObject4).close();
        }
      }
      else
      {
        label891:
        GMTrace.o(1359088713728L, 10126);
        return (Bitmap)localObject3;
      }
      localCursor.close();
      label910:
      w.i("MicroMsg.ContactsUtil", "Get bitmap from contacts icon.");
      int i = ((Cursor)localObject4).getColumnIndex("photo_id");
      long l;
      if (i != -1)
      {
        l = ((Cursor)localObject4).getLong(i);
        w.i("MicroMsg.ContactsUtil", "Have got photoId,photoId is " + l);
      }
      for (;;)
      {
        if (l > 0L)
        {
          localObject3 = BitmapFactory.decodeStream(ContactsContract.Contacts.openContactPhotoInputStream(localContentResolver, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, bg.getLong((String)localObject5, 0L))));
          localObject2 = localObject3;
          if (localObject3 == null) {
            break label1026;
          }
          localObject2 = localObject3;
          if (((Bitmap)localObject3).isRecycled()) {
            break label1026;
          }
          w.i("MicroMsg.ContactsUtil", "Get image from contacts through google account.");
          break label884;
        }
        localObject2 = localObject3;
        label1026:
        if (!((Cursor)localObject4).moveToNext())
        {
          localObject3 = localObject2;
          break label884;
        }
        break;
        l = 0L;
      }
      label1051:
      Object localObject2 = null;
    }
  }
  
  /* Error */
  private static Bitmap ln(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 291
    //   3: sipush 10127
    //   6: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: ldc 21
    //   11: ldc_w 294
    //   14: iconst_1
    //   15: anewarray 4	java/lang/Object
    //   18: dup
    //   19: iconst_0
    //   20: aload_0
    //   21: aastore
    //   22: invokestatic 95	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   25: aload_0
    //   26: invokestatic 105	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   29: ifeq +22 -> 51
    //   32: ldc 21
    //   34: ldc_w 296
    //   37: invokestatic 33	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   40: ldc2_w 291
    //   43: sipush 10127
    //   46: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   49: aconst_null
    //   50: areturn
    //   51: aload_0
    //   52: invokevirtual 299	java/lang/String:trim	()Ljava/lang/String;
    //   55: astore 9
    //   57: aload 9
    //   59: ldc -74
    //   61: invokevirtual 302	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   64: ifne +22 -> 86
    //   67: ldc 21
    //   69: ldc_w 304
    //   72: invokestatic 33	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   75: ldc2_w 291
    //   78: sipush 10127
    //   81: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   84: aconst_null
    //   85: areturn
    //   86: new 306	java/io/ByteArrayOutputStream
    //   89: dup
    //   90: invokespecial 308	java/io/ByteArrayOutputStream:<init>	()V
    //   93: astore 8
    //   95: aconst_null
    //   96: astore_2
    //   97: aconst_null
    //   98: astore_0
    //   99: aconst_null
    //   100: astore_3
    //   101: aconst_null
    //   102: astore 7
    //   104: aconst_null
    //   105: astore 6
    //   107: aconst_null
    //   108: astore 5
    //   110: aload 9
    //   112: invokestatic 314	com/tencent/mm/network/b:mX	(Ljava/lang/String;)Lcom/tencent/mm/network/v;
    //   115: astore 4
    //   117: aload 4
    //   119: astore_3
    //   120: aload_3
    //   121: astore 4
    //   123: aload 7
    //   125: astore_0
    //   126: aload_3
    //   127: getfield 320	com/tencent/mm/network/v:hhk	Ljavax/net/ssl/HttpsURLConnection;
    //   130: invokevirtual 326	javax/net/ssl/HttpsURLConnection:getInputStream	()Ljava/io/InputStream;
    //   133: astore_2
    //   134: aload_2
    //   135: ifnonnull +97 -> 232
    //   138: aload_2
    //   139: astore 5
    //   141: aload_3
    //   142: astore 4
    //   144: aload_2
    //   145: astore_0
    //   146: aload_2
    //   147: astore 6
    //   149: ldc 21
    //   151: ldc_w 328
    //   154: iconst_1
    //   155: anewarray 4	java/lang/Object
    //   158: dup
    //   159: iconst_0
    //   160: aload 9
    //   162: aastore
    //   163: invokestatic 330	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   166: aload_3
    //   167: getfield 320	com/tencent/mm/network/v:hhk	Ljavax/net/ssl/HttpsURLConnection;
    //   170: invokevirtual 333	javax/net/ssl/HttpsURLConnection:disconnect	()V
    //   173: aload_2
    //   174: ifnull +7 -> 181
    //   177: aload_2
    //   178: invokevirtual 336	java/io/InputStream:close	()V
    //   181: aload 8
    //   183: invokevirtual 337	java/io/ByteArrayOutputStream:close	()V
    //   186: ldc2_w 291
    //   189: sipush 10127
    //   192: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   195: aconst_null
    //   196: areturn
    //   197: astore_0
    //   198: ldc 21
    //   200: ldc_w 339
    //   203: iconst_1
    //   204: anewarray 4	java/lang/Object
    //   207: dup
    //   208: iconst_0
    //   209: aload_0
    //   210: invokevirtual 342	java/io/IOException:getMessage	()Ljava/lang/String;
    //   213: aastore
    //   214: invokestatic 330	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   217: ldc 21
    //   219: aload_0
    //   220: ldc 118
    //   222: iconst_0
    //   223: anewarray 4	java/lang/Object
    //   226: invokestatic 122	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   229: goto -43 -> 186
    //   232: aload_2
    //   233: astore 5
    //   235: aload_3
    //   236: astore 4
    //   238: aload_2
    //   239: astore_0
    //   240: aload_2
    //   241: astore 6
    //   243: sipush 1024
    //   246: newarray <illegal type>
    //   248: astore 7
    //   250: aload_2
    //   251: astore 5
    //   253: aload_3
    //   254: astore 4
    //   256: aload_2
    //   257: astore_0
    //   258: aload_2
    //   259: astore 6
    //   261: aload_2
    //   262: aload 7
    //   264: invokevirtual 346	java/io/InputStream:read	([B)I
    //   267: istore_1
    //   268: iload_1
    //   269: iconst_m1
    //   270: if_icmpeq +117 -> 387
    //   273: aload_2
    //   274: astore 5
    //   276: aload_3
    //   277: astore 4
    //   279: aload_2
    //   280: astore_0
    //   281: aload_2
    //   282: astore 6
    //   284: aload 8
    //   286: aload 7
    //   288: iconst_0
    //   289: iload_1
    //   290: invokevirtual 350	java/io/ByteArrayOutputStream:write	([BII)V
    //   293: goto -43 -> 250
    //   296: astore 6
    //   298: aconst_null
    //   299: astore_0
    //   300: aload 5
    //   302: astore_2
    //   303: aload_0
    //   304: astore 5
    //   306: aload_3
    //   307: astore 4
    //   309: aload_2
    //   310: astore_0
    //   311: ldc 21
    //   313: ldc_w 352
    //   316: iconst_1
    //   317: anewarray 4	java/lang/Object
    //   320: dup
    //   321: iconst_0
    //   322: aload 6
    //   324: invokevirtual 342	java/io/IOException:getMessage	()Ljava/lang/String;
    //   327: aastore
    //   328: invokestatic 330	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   331: aload_3
    //   332: astore 4
    //   334: aload_2
    //   335: astore_0
    //   336: ldc 21
    //   338: aload 6
    //   340: ldc 118
    //   342: iconst_0
    //   343: anewarray 4	java/lang/Object
    //   346: invokestatic 122	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   349: aload_3
    //   350: ifnull +10 -> 360
    //   353: aload_3
    //   354: getfield 320	com/tencent/mm/network/v:hhk	Ljavax/net/ssl/HttpsURLConnection;
    //   357: invokevirtual 333	javax/net/ssl/HttpsURLConnection:disconnect	()V
    //   360: aload_2
    //   361: ifnull +7 -> 368
    //   364: aload_2
    //   365: invokevirtual 336	java/io/InputStream:close	()V
    //   368: aload 8
    //   370: invokevirtual 337	java/io/ByteArrayOutputStream:close	()V
    //   373: aload 5
    //   375: astore_0
    //   376: ldc2_w 291
    //   379: sipush 10127
    //   382: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   385: aload_0
    //   386: areturn
    //   387: aload_2
    //   388: astore 5
    //   390: aload_3
    //   391: astore 4
    //   393: aload_2
    //   394: astore_0
    //   395: aload_2
    //   396: astore 6
    //   398: aload 8
    //   400: invokevirtual 356	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   403: invokestatic 362	com/tencent/mm/sdk/platformtools/d:bg	([B)Landroid/graphics/Bitmap;
    //   406: astore 7
    //   408: aload 7
    //   410: astore 5
    //   412: aload_3
    //   413: astore 4
    //   415: aload_2
    //   416: astore_0
    //   417: aload 8
    //   419: invokevirtual 337	java/io/ByteArrayOutputStream:close	()V
    //   422: aload_3
    //   423: getfield 320	com/tencent/mm/network/v:hhk	Ljavax/net/ssl/HttpsURLConnection;
    //   426: invokevirtual 333	javax/net/ssl/HttpsURLConnection:disconnect	()V
    //   429: aload 5
    //   431: astore_0
    //   432: aload_2
    //   433: ifnull -57 -> 376
    //   436: aload_2
    //   437: invokevirtual 336	java/io/InputStream:close	()V
    //   440: aload 5
    //   442: astore_0
    //   443: goto -67 -> 376
    //   446: astore_0
    //   447: ldc 21
    //   449: ldc_w 339
    //   452: iconst_1
    //   453: anewarray 4	java/lang/Object
    //   456: dup
    //   457: iconst_0
    //   458: aload_0
    //   459: invokevirtual 342	java/io/IOException:getMessage	()Ljava/lang/String;
    //   462: aastore
    //   463: invokestatic 330	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   466: ldc 21
    //   468: aload_0
    //   469: ldc 118
    //   471: iconst_0
    //   472: anewarray 4	java/lang/Object
    //   475: invokestatic 122	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   478: aload 5
    //   480: astore_0
    //   481: goto -105 -> 376
    //   484: astore_0
    //   485: ldc 21
    //   487: ldc_w 339
    //   490: iconst_1
    //   491: anewarray 4	java/lang/Object
    //   494: dup
    //   495: iconst_0
    //   496: aload_0
    //   497: invokevirtual 342	java/io/IOException:getMessage	()Ljava/lang/String;
    //   500: aastore
    //   501: invokestatic 330	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   504: ldc 21
    //   506: aload_0
    //   507: ldc 118
    //   509: iconst_0
    //   510: anewarray 4	java/lang/Object
    //   513: invokestatic 122	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   516: aload 5
    //   518: astore_0
    //   519: goto -143 -> 376
    //   522: astore 7
    //   524: aconst_null
    //   525: astore_3
    //   526: aconst_null
    //   527: astore 5
    //   529: aload_0
    //   530: astore_2
    //   531: aload_3
    //   532: astore 4
    //   534: aload_2
    //   535: astore_0
    //   536: ldc 21
    //   538: ldc_w 364
    //   541: iconst_1
    //   542: anewarray 4	java/lang/Object
    //   545: dup
    //   546: iconst_0
    //   547: aload 7
    //   549: invokevirtual 365	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   552: aastore
    //   553: invokestatic 330	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   556: aload_3
    //   557: astore 4
    //   559: aload_2
    //   560: astore_0
    //   561: ldc 21
    //   563: aload 7
    //   565: ldc 118
    //   567: iconst_0
    //   568: anewarray 4	java/lang/Object
    //   571: invokestatic 122	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   574: aload_3
    //   575: ifnull +10 -> 585
    //   578: aload_3
    //   579: getfield 320	com/tencent/mm/network/v:hhk	Ljavax/net/ssl/HttpsURLConnection;
    //   582: invokevirtual 333	javax/net/ssl/HttpsURLConnection:disconnect	()V
    //   585: aload_2
    //   586: ifnull +7 -> 593
    //   589: aload_2
    //   590: invokevirtual 336	java/io/InputStream:close	()V
    //   593: aload 8
    //   595: invokevirtual 337	java/io/ByteArrayOutputStream:close	()V
    //   598: aload 5
    //   600: astore_0
    //   601: goto -225 -> 376
    //   604: astore_0
    //   605: ldc 21
    //   607: ldc_w 339
    //   610: iconst_1
    //   611: anewarray 4	java/lang/Object
    //   614: dup
    //   615: iconst_0
    //   616: aload_0
    //   617: invokevirtual 342	java/io/IOException:getMessage	()Ljava/lang/String;
    //   620: aastore
    //   621: invokestatic 330	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   624: ldc 21
    //   626: aload_0
    //   627: ldc 118
    //   629: iconst_0
    //   630: anewarray 4	java/lang/Object
    //   633: invokestatic 122	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   636: aload 5
    //   638: astore_0
    //   639: goto -263 -> 376
    //   642: astore_2
    //   643: aconst_null
    //   644: astore 4
    //   646: aload_3
    //   647: astore_0
    //   648: aload 4
    //   650: ifnull +11 -> 661
    //   653: aload 4
    //   655: getfield 320	com/tencent/mm/network/v:hhk	Ljavax/net/ssl/HttpsURLConnection;
    //   658: invokevirtual 333	javax/net/ssl/HttpsURLConnection:disconnect	()V
    //   661: aload_0
    //   662: ifnull +7 -> 669
    //   665: aload_0
    //   666: invokevirtual 336	java/io/InputStream:close	()V
    //   669: aload 8
    //   671: invokevirtual 337	java/io/ByteArrayOutputStream:close	()V
    //   674: aload_2
    //   675: athrow
    //   676: astore_0
    //   677: ldc 21
    //   679: ldc_w 339
    //   682: iconst_1
    //   683: anewarray 4	java/lang/Object
    //   686: dup
    //   687: iconst_0
    //   688: aload_0
    //   689: invokevirtual 342	java/io/IOException:getMessage	()Ljava/lang/String;
    //   692: aastore
    //   693: invokestatic 330	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   696: ldc 21
    //   698: aload_0
    //   699: ldc 118
    //   701: iconst_0
    //   702: anewarray 4	java/lang/Object
    //   705: invokestatic 122	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   708: goto -34 -> 674
    //   711: astore_2
    //   712: goto -64 -> 648
    //   715: astore 7
    //   717: aconst_null
    //   718: astore 5
    //   720: aload 6
    //   722: astore_2
    //   723: goto -192 -> 531
    //   726: astore 7
    //   728: goto -197 -> 531
    //   731: astore 6
    //   733: aconst_null
    //   734: astore_3
    //   735: aconst_null
    //   736: astore 5
    //   738: goto -432 -> 306
    //   741: astore 6
    //   743: goto -437 -> 306
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	746	0	paramString	String
    //   267	23	1	i	int
    //   96	494	2	localObject1	Object
    //   642	33	2	localObject2	Object
    //   711	1	2	localObject3	Object
    //   722	1	2	localObject4	Object
    //   100	635	3	localObject5	Object
    //   115	539	4	localObject6	Object
    //   108	629	5	localObject7	Object
    //   105	178	6	localObject8	Object
    //   296	43	6	localIOException1	java.io.IOException
    //   396	325	6	localObject9	Object
    //   731	1	6	localIOException2	java.io.IOException
    //   741	1	6	localIOException3	java.io.IOException
    //   102	307	7	localObject10	Object
    //   522	42	7	localException1	Exception
    //   715	1	7	localException2	Exception
    //   726	1	7	localException3	Exception
    //   93	577	8	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   55	106	9	str	String
    // Exception table:
    //   from	to	target	type
    //   166	173	197	java/io/IOException
    //   177	181	197	java/io/IOException
    //   181	186	197	java/io/IOException
    //   126	134	296	java/io/IOException
    //   149	166	296	java/io/IOException
    //   243	250	296	java/io/IOException
    //   261	268	296	java/io/IOException
    //   284	293	296	java/io/IOException
    //   398	408	296	java/io/IOException
    //   422	429	446	java/io/IOException
    //   436	440	446	java/io/IOException
    //   353	360	484	java/io/IOException
    //   364	368	484	java/io/IOException
    //   368	373	484	java/io/IOException
    //   110	117	522	java/lang/Exception
    //   578	585	604	java/io/IOException
    //   589	593	604	java/io/IOException
    //   593	598	604	java/io/IOException
    //   110	117	642	finally
    //   653	661	676	java/io/IOException
    //   665	669	676	java/io/IOException
    //   669	674	676	java/io/IOException
    //   126	134	711	finally
    //   149	166	711	finally
    //   243	250	711	finally
    //   261	268	711	finally
    //   284	293	711	finally
    //   311	331	711	finally
    //   336	349	711	finally
    //   398	408	711	finally
    //   417	422	711	finally
    //   536	556	711	finally
    //   561	574	711	finally
    //   126	134	715	java/lang/Exception
    //   149	166	715	java/lang/Exception
    //   243	250	715	java/lang/Exception
    //   261	268	715	java/lang/Exception
    //   284	293	715	java/lang/Exception
    //   398	408	715	java/lang/Exception
    //   417	422	726	java/lang/Exception
    //   110	117	731	java/io/IOException
    //   417	422	741	java/io/IOException
  }
  
  /* Error */
  @TargetApi(14)
  public static String y(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc2_w 367
    //   3: sipush 10123
    //   6: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: ldc 21
    //   11: ldc_w 370
    //   14: iconst_1
    //   15: anewarray 4	java/lang/Object
    //   18: dup
    //   19: iconst_0
    //   20: aload_1
    //   21: aastore
    //   22: invokestatic 95	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   25: aload_0
    //   26: ifnonnull +22 -> 48
    //   29: ldc 21
    //   31: ldc_w 372
    //   34: invokestatic 33	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   37: ldc2_w 367
    //   40: sipush 10123
    //   43: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   46: aconst_null
    //   47: areturn
    //   48: aload_0
    //   49: ldc_w 374
    //   52: invokevirtual 378	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   55: checkcast 380	android/telephony/TelephonyManager
    //   58: astore 7
    //   60: aconst_null
    //   61: astore_1
    //   62: aload 7
    //   64: invokevirtual 383	android/telephony/TelephonyManager:getLine1Number	()Ljava/lang/String;
    //   67: astore 5
    //   69: aload 5
    //   71: astore_1
    //   72: aload 7
    //   74: invokevirtual 386	android/telephony/TelephonyManager:getSimCountryIso	()Ljava/lang/String;
    //   77: astore 6
    //   79: aload 6
    //   81: invokestatic 105	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   84: ifeq +1472 -> 1556
    //   87: aload 7
    //   89: invokevirtual 389	android/telephony/TelephonyManager:getNetworkCountryIso	()Ljava/lang/String;
    //   92: astore_1
    //   93: aload_1
    //   94: astore 6
    //   96: aload_1
    //   97: invokestatic 105	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   100: ifeq +11 -> 111
    //   103: invokestatic 395	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   106: invokevirtual 398	java/util/Locale:getCountry	()Ljava/lang/String;
    //   109: astore 6
    //   111: aload 6
    //   113: astore 9
    //   115: aload 5
    //   117: invokestatic 105	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   120: ifne +151 -> 271
    //   123: aload 5
    //   125: invokevirtual 299	java/lang/String:trim	()Ljava/lang/String;
    //   128: astore_0
    //   129: aload_0
    //   130: aload 9
    //   132: invokestatic 404	com/tencent/mm/sdk/platformtools/an:eS	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   135: astore_1
    //   136: ldc 21
    //   138: ldc_w 406
    //   141: iconst_3
    //   142: anewarray 4	java/lang/Object
    //   145: dup
    //   146: iconst_0
    //   147: aload_0
    //   148: aastore
    //   149: dup
    //   150: iconst_1
    //   151: aload_1
    //   152: aastore
    //   153: dup
    //   154: iconst_2
    //   155: aload 9
    //   157: aastore
    //   158: invokestatic 95	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   161: aload_1
    //   162: invokestatic 105	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   165: ifne +1388 -> 1553
    //   168: aload_1
    //   169: invokevirtual 409	java/lang/String:length	()I
    //   172: istore_3
    //   173: aload_0
    //   174: ldc_w 411
    //   177: invokevirtual 302	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   180: ifeq +86 -> 266
    //   183: iconst_1
    //   184: istore_2
    //   185: aload_0
    //   186: iload_2
    //   187: iload_3
    //   188: iadd
    //   189: invokevirtual 196	java/lang/String:substring	(I)Ljava/lang/String;
    //   192: astore_0
    //   193: ldc 21
    //   195: ldc_w 413
    //   198: iconst_1
    //   199: anewarray 4	java/lang/Object
    //   202: dup
    //   203: iconst_0
    //   204: aload_0
    //   205: aastore
    //   206: invokestatic 95	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   209: ldc 21
    //   211: ldc_w 415
    //   214: invokestatic 28	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   217: ldc2_w 367
    //   220: sipush 10123
    //   223: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   226: aload_0
    //   227: areturn
    //   228: astore 6
    //   230: aconst_null
    //   231: astore 7
    //   233: aload_1
    //   234: astore 5
    //   236: aload 7
    //   238: astore_1
    //   239: ldc 21
    //   241: aload 6
    //   243: ldc 118
    //   245: iconst_0
    //   246: anewarray 4	java/lang/Object
    //   249: invokestatic 122	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   252: ldc 21
    //   254: ldc_w 417
    //   257: invokestatic 33	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   260: aload_1
    //   261: astore 9
    //   263: goto -148 -> 115
    //   266: iconst_0
    //   267: istore_2
    //   268: goto -83 -> 185
    //   271: aload_0
    //   272: ldc 44
    //   274: invokestatic 50	com/tencent/mm/pluginsdk/h/a:aS	(Landroid/content/Context;Ljava/lang/String;)Z
    //   277: ifne +21 -> 298
    //   280: ldc 21
    //   282: ldc 52
    //   284: invokestatic 33	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   287: ldc2_w 367
    //   290: sipush 10123
    //   293: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   296: aconst_null
    //   297: areturn
    //   298: aload_0
    //   299: invokevirtual 42	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   302: astore 11
    //   304: aconst_null
    //   305: astore 6
    //   307: aconst_null
    //   308: astore 10
    //   310: aconst_null
    //   311: astore 5
    //   313: aconst_null
    //   314: astore 8
    //   316: aconst_null
    //   317: astore 7
    //   319: aload 8
    //   321: astore_1
    //   322: bipush 14
    //   324: invokestatic 420	com/tencent/mm/compatible/util/f:eu	(I)Z
    //   327: ifne +332 -> 659
    //   330: ldc 21
    //   332: ldc_w 422
    //   335: invokestatic 28	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   338: aload 10
    //   340: astore 5
    //   342: aload 11
    //   344: getstatic 66	android/provider/ContactsContract$Profile:CONTENT_URI	Landroid/net/Uri;
    //   347: iconst_1
    //   348: anewarray 68	java/lang/String
    //   351: dup
    //   352: iconst_0
    //   353: ldc_w 424
    //   356: aastore
    //   357: aconst_null
    //   358: aconst_null
    //   359: aconst_null
    //   360: invokevirtual 76	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   363: astore_1
    //   364: aload_1
    //   365: ifnull +1183 -> 1548
    //   368: aload_1
    //   369: astore 6
    //   371: aload_1
    //   372: astore 5
    //   374: aload_1
    //   375: invokeinterface 82 1 0
    //   380: ifeq +1168 -> 1548
    //   383: aload_1
    //   384: astore 6
    //   386: aload_1
    //   387: astore 5
    //   389: aload_1
    //   390: ldc_w 424
    //   393: invokeinterface 86 2 0
    //   398: istore_2
    //   399: iload_2
    //   400: iconst_m1
    //   401: if_icmpeq +1147 -> 1548
    //   404: aload_1
    //   405: astore 6
    //   407: aload_1
    //   408: astore 5
    //   410: aload_1
    //   411: iload_2
    //   412: invokeinterface 428 2 0
    //   417: istore_2
    //   418: aload_1
    //   419: astore 5
    //   421: ldc 21
    //   423: new 249	java/lang/StringBuilder
    //   426: dup
    //   427: ldc_w 430
    //   430: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   433: iload_2
    //   434: invokevirtual 433	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   437: invokevirtual 263	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   440: invokestatic 28	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   443: iload_2
    //   444: istore_3
    //   445: aload_1
    //   446: astore 6
    //   448: aload_1
    //   449: ifnull +28 -> 477
    //   452: iload_2
    //   453: istore_3
    //   454: aload_1
    //   455: astore 6
    //   457: aload_1
    //   458: invokeinterface 436 1 0
    //   463: ifne +14 -> 477
    //   466: aload_1
    //   467: invokeinterface 99 1 0
    //   472: aload_1
    //   473: astore 6
    //   475: iload_2
    //   476: istore_3
    //   477: aload 8
    //   479: astore_1
    //   480: aload 6
    //   482: astore 5
    //   484: iload_3
    //   485: ifle +174 -> 659
    //   488: aload 11
    //   490: getstatic 66	android/provider/ContactsContract$Profile:CONTENT_URI	Landroid/net/Uri;
    //   493: ldc -106
    //   495: invokestatic 156	android/net/Uri:withAppendedPath	(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    //   498: iconst_1
    //   499: anewarray 68	java/lang/String
    //   502: dup
    //   503: iconst_0
    //   504: ldc_w 438
    //   507: aastore
    //   508: ldc -94
    //   510: iconst_1
    //   511: anewarray 68	java/lang/String
    //   514: dup
    //   515: iconst_0
    //   516: ldc_w 440
    //   519: aastore
    //   520: aconst_null
    //   521: invokevirtual 76	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   524: astore_1
    //   525: aload_1
    //   526: ifnull +1016 -> 1542
    //   529: aload 7
    //   531: astore 5
    //   533: aload_1
    //   534: astore 6
    //   536: aload_1
    //   537: invokeinterface 82 1 0
    //   542: ifeq +61 -> 603
    //   545: aload_1
    //   546: astore 6
    //   548: aload_1
    //   549: ldc_w 438
    //   552: invokeinterface 86 2 0
    //   557: istore_2
    //   558: aload 7
    //   560: astore 5
    //   562: iload_2
    //   563: iconst_m1
    //   564: if_icmpeq +39 -> 603
    //   567: aload_1
    //   568: astore 6
    //   570: aload_1
    //   571: iload_2
    //   572: invokeinterface 90 2 0
    //   577: astore 5
    //   579: aload_1
    //   580: astore 6
    //   582: aload 5
    //   584: astore 7
    //   586: ldc 21
    //   588: ldc_w 442
    //   591: iconst_1
    //   592: anewarray 4	java/lang/Object
    //   595: dup
    //   596: iconst_0
    //   597: aload 5
    //   599: aastore
    //   600: invokestatic 95	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   603: aload_1
    //   604: astore 6
    //   606: aload 5
    //   608: astore 7
    //   610: aload_1
    //   611: invokeinterface 99 1 0
    //   616: aload 5
    //   618: astore 7
    //   620: aload_1
    //   621: astore 6
    //   623: aload_1
    //   624: ifnull +908 -> 1532
    //   627: aload 5
    //   629: astore 7
    //   631: aload_1
    //   632: astore 6
    //   634: aload_1
    //   635: invokeinterface 436 1 0
    //   640: ifne +892 -> 1532
    //   643: aload_1
    //   644: invokeinterface 99 1 0
    //   649: aload 5
    //   651: astore 6
    //   653: aload_1
    //   654: astore 5
    //   656: aload 6
    //   658: astore_1
    //   659: aload_1
    //   660: astore 6
    //   662: aload_1
    //   663: invokestatic 105	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   666: ifeq +296 -> 962
    //   669: aload_0
    //   670: aload_0
    //   671: invokestatic 110	com/tencent/mm/modelsimple/d:br	(Landroid/content/Context;)Ljava/lang/String;
    //   674: invokestatic 114	com/tencent/mm/modelsimple/c:z	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   677: astore 8
    //   679: aload_1
    //   680: astore 6
    //   682: aload 8
    //   684: invokestatic 105	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   687: ifne +275 -> 962
    //   690: aload 11
    //   692: getstatic 266	android/provider/ContactsContract$Contacts:CONTENT_URI	Landroid/net/Uri;
    //   695: iconst_1
    //   696: anewarray 68	java/lang/String
    //   699: dup
    //   700: iconst_0
    //   701: ldc_w 424
    //   704: aastore
    //   705: ldc_w 444
    //   708: iconst_1
    //   709: anewarray 68	java/lang/String
    //   712: dup
    //   713: iconst_0
    //   714: aload 8
    //   716: aastore
    //   717: aconst_null
    //   718: invokevirtual 76	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   721: astore_0
    //   722: aload_0
    //   723: ifnull +804 -> 1527
    //   726: aload_0
    //   727: invokeinterface 82 1 0
    //   732: ifeq +795 -> 1527
    //   735: aload_0
    //   736: aload_0
    //   737: ldc_w 424
    //   740: invokeinterface 86 2 0
    //   745: invokeinterface 428 2 0
    //   750: istore_2
    //   751: aload_0
    //   752: ifnull +772 -> 1524
    //   755: aload_0
    //   756: invokeinterface 99 1 0
    //   761: ldc 21
    //   763: new 249	java/lang/StringBuilder
    //   766: dup
    //   767: ldc_w 430
    //   770: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   773: iload_2
    //   774: invokevirtual 433	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   777: invokevirtual 263	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   780: invokestatic 28	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   783: aload_1
    //   784: astore 6
    //   786: iload_2
    //   787: ifle +175 -> 962
    //   790: aload_1
    //   791: astore 5
    //   793: aload_0
    //   794: astore 7
    //   796: aload 11
    //   798: getstatic 233	android/provider/ContactsContract$CommonDataKinds$Phone:CONTENT_URI	Landroid/net/Uri;
    //   801: iconst_2
    //   802: anewarray 68	java/lang/String
    //   805: dup
    //   806: iconst_0
    //   807: ldc_w 438
    //   810: aastore
    //   811: dup
    //   812: iconst_1
    //   813: ldc_w 446
    //   816: aastore
    //   817: ldc_w 448
    //   820: iconst_1
    //   821: anewarray 68	java/lang/String
    //   824: dup
    //   825: iconst_0
    //   826: aload 8
    //   828: aastore
    //   829: aconst_null
    //   830: invokevirtual 76	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   833: astore 10
    //   835: aload_1
    //   836: astore 8
    //   838: aload 10
    //   840: ifnull +102 -> 942
    //   843: aload_1
    //   844: astore 8
    //   846: aload_1
    //   847: astore 5
    //   849: aload 10
    //   851: astore 7
    //   853: aload 10
    //   855: astore_0
    //   856: aload 10
    //   858: invokeinterface 82 1 0
    //   863: ifeq +79 -> 942
    //   866: aload_1
    //   867: astore 5
    //   869: aload 10
    //   871: astore 7
    //   873: aload 10
    //   875: astore_0
    //   876: aload 10
    //   878: aload 10
    //   880: ldc_w 438
    //   883: invokeinterface 86 2 0
    //   888: invokeinterface 90 2 0
    //   893: astore 8
    //   895: aload 8
    //   897: astore 5
    //   899: aload 10
    //   901: astore 7
    //   903: aload 10
    //   905: astore_0
    //   906: aload 8
    //   908: invokestatic 105	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   911: ifne +437 -> 1348
    //   914: aload 8
    //   916: astore 5
    //   918: aload 10
    //   920: astore 7
    //   922: aload 10
    //   924: astore_0
    //   925: ldc 21
    //   927: ldc_w 450
    //   930: iconst_1
    //   931: anewarray 4	java/lang/Object
    //   934: dup
    //   935: iconst_0
    //   936: aload 8
    //   938: aastore
    //   939: invokestatic 95	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   942: aload 8
    //   944: astore 6
    //   946: aload 10
    //   948: ifnull +14 -> 962
    //   951: aload 10
    //   953: invokeinterface 99 1 0
    //   958: aload 8
    //   960: astore 6
    //   962: aload 6
    //   964: astore_1
    //   965: aload 6
    //   967: invokestatic 105	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   970: ifne +113 -> 1083
    //   973: aload 6
    //   975: aload 9
    //   977: invokestatic 404	com/tencent/mm/sdk/platformtools/an:eS	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   980: astore 5
    //   982: ldc 21
    //   984: ldc_w 452
    //   987: iconst_3
    //   988: anewarray 4	java/lang/Object
    //   991: dup
    //   992: iconst_0
    //   993: aload 6
    //   995: aastore
    //   996: dup
    //   997: iconst_1
    //   998: aload 5
    //   1000: aastore
    //   1001: dup
    //   1002: iconst_2
    //   1003: aload 9
    //   1005: aastore
    //   1006: invokestatic 95	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1009: aload 6
    //   1011: astore_1
    //   1012: aload 5
    //   1014: invokestatic 105	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   1017: ifne +50 -> 1067
    //   1020: aload 6
    //   1022: ldc_w 411
    //   1025: invokevirtual 302	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1028: ifeq +403 -> 1431
    //   1031: new 249	java/lang/StringBuilder
    //   1034: dup
    //   1035: ldc_w 411
    //   1038: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1041: aload 5
    //   1043: invokevirtual 455	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1046: invokevirtual 263	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1049: astore_0
    //   1050: aload 6
    //   1052: astore_1
    //   1053: aload_0
    //   1054: ifnull +13 -> 1067
    //   1057: aload 6
    //   1059: aload_0
    //   1060: invokevirtual 409	java/lang/String:length	()I
    //   1063: invokevirtual 196	java/lang/String:substring	(I)Ljava/lang/String;
    //   1066: astore_1
    //   1067: ldc 21
    //   1069: ldc_w 457
    //   1072: iconst_1
    //   1073: anewarray 4	java/lang/Object
    //   1076: dup
    //   1077: iconst_0
    //   1078: aload_1
    //   1079: aastore
    //   1080: invokestatic 95	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1083: ldc2_w 367
    //   1086: sipush 10123
    //   1089: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1092: aload_1
    //   1093: areturn
    //   1094: astore 5
    //   1096: iconst_0
    //   1097: istore_2
    //   1098: aload 6
    //   1100: astore_1
    //   1101: aload 5
    //   1103: astore 6
    //   1105: aload_1
    //   1106: astore 5
    //   1108: ldc 21
    //   1110: aload 6
    //   1112: ldc 118
    //   1114: iconst_0
    //   1115: anewarray 4	java/lang/Object
    //   1118: invokestatic 122	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1121: aload_1
    //   1122: astore 5
    //   1124: ldc 21
    //   1126: ldc 124
    //   1128: invokestatic 127	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1131: iload_2
    //   1132: istore_3
    //   1133: aload_1
    //   1134: astore 6
    //   1136: aload_1
    //   1137: ifnull -660 -> 477
    //   1140: iload_2
    //   1141: istore_3
    //   1142: aload_1
    //   1143: astore 6
    //   1145: aload_1
    //   1146: invokeinterface 436 1 0
    //   1151: ifne -674 -> 477
    //   1154: aload_1
    //   1155: invokeinterface 99 1 0
    //   1160: iload_2
    //   1161: istore_3
    //   1162: aload_1
    //   1163: astore 6
    //   1165: goto -688 -> 477
    //   1168: astore_0
    //   1169: aload 5
    //   1171: ifnull +20 -> 1191
    //   1174: aload 5
    //   1176: invokeinterface 436 1 0
    //   1181: ifne +10 -> 1191
    //   1184: aload 5
    //   1186: invokeinterface 99 1 0
    //   1191: aload_0
    //   1192: athrow
    //   1193: astore 7
    //   1195: aload 6
    //   1197: astore_1
    //   1198: aconst_null
    //   1199: astore 5
    //   1201: aload_1
    //   1202: astore 6
    //   1204: ldc 21
    //   1206: aload 7
    //   1208: ldc 118
    //   1210: iconst_0
    //   1211: anewarray 4	java/lang/Object
    //   1214: invokestatic 122	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1217: aload_1
    //   1218: astore 6
    //   1220: ldc 21
    //   1222: ldc 124
    //   1224: invokestatic 127	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1227: aload 5
    //   1229: astore 7
    //   1231: aload_1
    //   1232: astore 6
    //   1234: aload_1
    //   1235: ifnull +297 -> 1532
    //   1238: aload 5
    //   1240: astore 7
    //   1242: aload_1
    //   1243: astore 6
    //   1245: aload_1
    //   1246: invokeinterface 436 1 0
    //   1251: ifne +281 -> 1532
    //   1254: aload_1
    //   1255: invokeinterface 99 1 0
    //   1260: aload_1
    //   1261: astore 6
    //   1263: aload 5
    //   1265: astore_1
    //   1266: aload 6
    //   1268: astore 5
    //   1270: goto -611 -> 659
    //   1273: astore_0
    //   1274: aload 6
    //   1276: ifnull +20 -> 1296
    //   1279: aload 6
    //   1281: invokeinterface 436 1 0
    //   1286: ifne +10 -> 1296
    //   1289: aload 6
    //   1291: invokeinterface 99 1 0
    //   1296: aload_0
    //   1297: athrow
    //   1298: astore_0
    //   1299: aload_0
    //   1300: astore 6
    //   1302: aload 5
    //   1304: astore_0
    //   1305: ldc 21
    //   1307: aload 6
    //   1309: ldc 118
    //   1311: iconst_0
    //   1312: anewarray 4	java/lang/Object
    //   1315: invokestatic 122	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1318: aload_0
    //   1319: ifnull +200 -> 1519
    //   1322: aload_0
    //   1323: invokeinterface 99 1 0
    //   1328: iconst_0
    //   1329: istore_2
    //   1330: goto -569 -> 761
    //   1333: astore_0
    //   1334: aload 5
    //   1336: ifnull +10 -> 1346
    //   1339: aload 5
    //   1341: invokeinterface 99 1 0
    //   1346: aload_0
    //   1347: athrow
    //   1348: aload 8
    //   1350: astore 5
    //   1352: aload 10
    //   1354: astore 7
    //   1356: aload 10
    //   1358: astore_0
    //   1359: aload 10
    //   1361: invokeinterface 288 1 0
    //   1366: istore 4
    //   1368: aload 8
    //   1370: astore_1
    //   1371: iload 4
    //   1373: ifne -507 -> 866
    //   1376: goto -434 -> 942
    //   1379: astore_1
    //   1380: aload 7
    //   1382: astore_0
    //   1383: ldc 21
    //   1385: aload_1
    //   1386: ldc 118
    //   1388: iconst_0
    //   1389: anewarray 4	java/lang/Object
    //   1392: invokestatic 122	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1395: aload 5
    //   1397: astore 6
    //   1399: aload 7
    //   1401: ifnull -439 -> 962
    //   1404: aload 7
    //   1406: invokeinterface 99 1 0
    //   1411: aload 5
    //   1413: astore 6
    //   1415: goto -453 -> 962
    //   1418: astore_1
    //   1419: aload_0
    //   1420: ifnull +9 -> 1429
    //   1423: aload_0
    //   1424: invokeinterface 99 1 0
    //   1429: aload_1
    //   1430: athrow
    //   1431: aload 5
    //   1433: astore_0
    //   1434: aload 6
    //   1436: aload 5
    //   1438: invokevirtual 302	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1441: ifne -391 -> 1050
    //   1444: aconst_null
    //   1445: astore_0
    //   1446: goto -396 -> 1050
    //   1449: astore_1
    //   1450: aload_0
    //   1451: astore 5
    //   1453: aload_1
    //   1454: astore_0
    //   1455: goto -121 -> 1334
    //   1458: astore_1
    //   1459: aload_0
    //   1460: astore 5
    //   1462: aload_1
    //   1463: astore_0
    //   1464: goto -130 -> 1334
    //   1467: astore 6
    //   1469: goto -164 -> 1305
    //   1472: astore_0
    //   1473: goto -199 -> 1274
    //   1476: astore 7
    //   1478: aconst_null
    //   1479: astore 5
    //   1481: goto -280 -> 1201
    //   1484: astore 6
    //   1486: aload 7
    //   1488: astore 5
    //   1490: aload 6
    //   1492: astore 7
    //   1494: goto -293 -> 1201
    //   1497: astore 6
    //   1499: goto -394 -> 1105
    //   1502: astore 7
    //   1504: aload 6
    //   1506: astore_1
    //   1507: aload 7
    //   1509: astore 6
    //   1511: goto -1272 -> 239
    //   1514: astore 6
    //   1516: goto -1277 -> 239
    //   1519: iconst_0
    //   1520: istore_2
    //   1521: goto -760 -> 761
    //   1524: goto -763 -> 761
    //   1527: iconst_0
    //   1528: istore_2
    //   1529: goto -778 -> 751
    //   1532: aload 7
    //   1534: astore_1
    //   1535: aload 6
    //   1537: astore 5
    //   1539: goto -880 -> 659
    //   1542: aconst_null
    //   1543: astore 5
    //   1545: goto -929 -> 616
    //   1548: iconst_0
    //   1549: istore_2
    //   1550: goto -1132 -> 418
    //   1553: goto -1344 -> 209
    //   1556: aload 6
    //   1558: astore_1
    //   1559: goto -1466 -> 93
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1562	0	paramContext	Context
    //   0	1562	1	paramString	String
    //   184	1366	2	i	int
    //   172	990	3	j	int
    //   1366	6	4	bool	boolean
    //   67	975	5	localObject1	Object
    //   1094	8	5	localException1	Exception
    //   1106	438	5	localObject2	Object
    //   77	35	6	str1	String
    //   228	14	6	localException2	Exception
    //   305	1130	6	localObject3	Object
    //   1467	1	6	localException3	Exception
    //   1484	7	6	localException4	Exception
    //   1497	8	6	localException5	Exception
    //   1509	1	6	localException6	Exception
    //   1514	43	6	localException7	Exception
    //   58	863	7	localObject4	Object
    //   1193	14	7	localException8	Exception
    //   1229	176	7	localObject5	Object
    //   1476	11	7	localException9	Exception
    //   1492	1	7	localObject6	Object
    //   1502	31	7	localException10	Exception
    //   314	1055	8	str2	String
    //   113	891	9	str3	String
    //   308	1052	10	localCursor	Cursor
    //   302	495	11	localContentResolver	ContentResolver
    // Exception table:
    //   from	to	target	type
    //   62	69	228	java/lang/Exception
    //   72	79	228	java/lang/Exception
    //   342	364	1094	java/lang/Exception
    //   374	383	1094	java/lang/Exception
    //   389	399	1094	java/lang/Exception
    //   410	418	1094	java/lang/Exception
    //   342	364	1168	finally
    //   374	383	1168	finally
    //   389	399	1168	finally
    //   410	418	1168	finally
    //   421	443	1168	finally
    //   1108	1121	1168	finally
    //   1124	1131	1168	finally
    //   488	525	1193	java/lang/Exception
    //   488	525	1273	finally
    //   690	722	1298	java/lang/Exception
    //   690	722	1333	finally
    //   796	835	1379	java/lang/Exception
    //   856	866	1379	java/lang/Exception
    //   876	895	1379	java/lang/Exception
    //   906	914	1379	java/lang/Exception
    //   925	942	1379	java/lang/Exception
    //   1359	1368	1379	java/lang/Exception
    //   796	835	1418	finally
    //   856	866	1418	finally
    //   876	895	1418	finally
    //   906	914	1418	finally
    //   925	942	1418	finally
    //   1359	1368	1418	finally
    //   1383	1395	1418	finally
    //   726	751	1449	finally
    //   1305	1318	1458	finally
    //   726	751	1467	java/lang/Exception
    //   536	545	1472	finally
    //   548	558	1472	finally
    //   570	579	1472	finally
    //   586	603	1472	finally
    //   610	616	1472	finally
    //   1204	1217	1472	finally
    //   1220	1227	1472	finally
    //   536	545	1476	java/lang/Exception
    //   548	558	1476	java/lang/Exception
    //   570	579	1476	java/lang/Exception
    //   586	603	1484	java/lang/Exception
    //   610	616	1484	java/lang/Exception
    //   421	443	1497	java/lang/Exception
    //   79	93	1502	java/lang/Exception
    //   96	111	1514	java/lang/Exception
  }
  
  private static String z(Context paramContext, String paramString)
  {
    Object localObject = null;
    GMTrace.i(1358820278272L, 10124);
    w.i("MicroMsg.ContactsUtil", "Get contactId by email, email = %s", new Object[] { paramString });
    if (paramContext == null)
    {
      w.e("MicroMsg.ContactsUtil", "context is null.");
      GMTrace.o(1358820278272L, 10124);
      return null;
    }
    if (bg.nm(paramString))
    {
      w.i("MicroMsg.ContactsUtil", "email is null.");
      GMTrace.o(1358820278272L, 10124);
      return null;
    }
    for (;;)
    {
      try
      {
        localCursor = paramContext.getContentResolver().query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, new String[] { "contact_id", "data1" }, "data1=?", new String[] { paramString }, null);
        if (localCursor == null) {
          continue;
        }
        bool = localCursor.moveToFirst();
        if (!bool) {
          continue;
        }
        paramString = (String)localObject;
      }
      catch (Exception paramString)
      {
        Cursor localCursor;
        boolean bool;
        paramContext = null;
        w.printErrStackTrace("MicroMsg.ContactsUtil", paramString, "getContactIdByEmail error", new Object[0]);
        continue;
        paramContext = null;
        continue;
        paramContext = null;
        continue;
      }
      try
      {
        paramContext = localCursor.getString(localCursor.getColumnIndex("contact_id"));
        paramString = paramContext;
        if (!bg.nm(paramContext))
        {
          paramString = paramContext;
          w.i("MicroMsg.ContactsUtil", "Have got contactId ,contactId is [%s]", new Object[] { paramContext });
        }
      }
      catch (Exception localException)
      {
        paramContext = paramString;
        paramString = localException;
        continue;
      }
      try
      {
        localCursor.close();
        GMTrace.o(1358820278272L, 10124);
        return paramContext;
      }
      catch (Exception paramString)
      {
        continue;
      }
      paramString = paramContext;
      bool = localCursor.moveToNext();
      paramString = paramContext;
      if (bool) {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */