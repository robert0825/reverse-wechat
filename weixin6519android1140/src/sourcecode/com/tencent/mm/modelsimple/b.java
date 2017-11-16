package com.tencent.mm.modelsimple;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentResolver;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Looper;
import android.os.RemoteException;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class b
  implements Runnable
{
  private String eMa;
  private a gTA;
  private Looper gTB;
  private Account gTz;
  public Context mContext;
  private String username;
  
  public b(Context paramContext, Account paramAccount)
  {
    this(paramContext, paramAccount, null, null);
    GMTrace.i(1353988440064L, 10088);
    GMTrace.o(1353988440064L, 10088);
  }
  
  public b(Context paramContext, Account paramAccount, String paramString)
  {
    this(paramContext, paramAccount, paramString, null);
    GMTrace.i(1354122657792L, 10089);
    GMTrace.o(1354122657792L, 10089);
  }
  
  public b(Context paramContext, Account paramAccount, String paramString1, String paramString2)
  {
    GMTrace.i(1354256875520L, 10090);
    this.mContext = paramContext;
    this.gTz = paramAccount;
    this.username = paramString1;
    this.eMa = paramString2;
    w.i("MicroMsg.ContactsOperations", "username = " + paramString1 + ", " + paramString2);
    GMTrace.o(1354256875520L, 10090);
  }
  
  private void KY()
  {
    Object localObject2;
    for (;;)
    {
      Object localObject5;
      try
      {
        GMTrace.i(1354659528704L, 10093);
        if (!at.AU())
        {
          w.d("MicroMsg.ContactsOperations", "account not ready, quit this operation");
          quit();
          GMTrace.o(1354659528704L, 10093);
          return;
        }
        localObject5 = com.tencent.mm.modelfriend.af.If().jL("select  *  from addr_upload2 where ( addr_upload2.username IS NOT NULL AND addr_upload2.status!=\"0\" AND addr_upload2.username!=\"" + bg.nk("") + "\" )");
        if (((List)localObject5).size() == 0)
        {
          w.e("MicroMsg.ContactsOperations", "there is no wechat friend in this phone");
          quit();
          GMTrace.o(1354659528704L, 10093);
          continue;
        }
        localHashMap = new HashMap();
      }
      finally {}
      HashMap localHashMap;
      localObject2 = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("account_name", this.gTz.name).appendQueryParameter("account_type", this.gTz.type).build();
      if (!com.tencent.mm.pluginsdk.h.a.aS(this.mContext, "android.permission.READ_CONTACTS"))
      {
        w.e("MicroMsg.ContactsOperations", "no contact permission");
        GMTrace.o(1354659528704L, 10093);
      }
      else
      {
        for (;;)
        {
          try
          {
            localObject2 = this.mContext.getContentResolver().query((Uri)localObject2, new String[] { "sync1", "_id" }, "deleted=\"0\"", null, null);
            if (localObject2 != null) {}
          }
          catch (Exception localException1)
          {
            Object localObject3;
            Object localObject7;
            Object localObject6;
            String str;
            boolean bool;
            localObject2 = null;
            w.printErrStackTrace("MicroMsg.ContactsOperations", localException1, "", new Object[] { "" });
            Object localObject4 = localObject2;
            continue;
            localObject2 = ((com.tencent.mm.modelfriend.b)localObject7).GU();
            continue;
            ll(((com.tencent.mm.modelfriend.b)localObject7).gCw);
            continue;
            this.gTA.execute();
            quit();
            GMTrace.o(1354659528704L, 10093);
          }
          try
          {
            w.e("MicroMsg.ContactsOperations", "query get no user");
            localObject3 = localObject2;
            if (localObject3 != null) {
              ((Cursor)localObject3).close();
            }
            if ((lm("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip.video")) || (lm("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip"))) {
              break label574;
            }
            i = 1;
          }
          catch (Exception localException2)
          {
            continue;
            i = 0;
            continue;
          }
          this.gTA = new a(this.mContext.getContentResolver());
          localObject3 = ((List)localObject5).iterator();
          if (!((Iterator)localObject3).hasNext()) {
            continue;
          }
          localObject7 = (com.tencent.mm.modelfriend.b)((Iterator)localObject3).next();
          localObject5 = ((com.tencent.mm.modelfriend.b)localObject7).getUsername();
          at.AR();
          localObject6 = com.tencent.mm.y.c.yK().TE((String)localObject5);
          if ((localObject6 == null) || (!com.tencent.mm.l.a.eE(((com.tencent.mm.g.b.af)localObject6).field_type))) {
            continue;
          }
          if (!bg.nm(((com.tencent.mm.modelfriend.b)localObject7).GU())) {
            continue;
          }
          localObject2 = ((com.tencent.mm.modelfriend.b)localObject7).GX();
          str = ((com.tencent.mm.modelfriend.b)localObject7).Ha();
          localObject7 = ((com.tencent.mm.modelfriend.b)localObject7).gCw;
          localObject6 = ((com.tencent.mm.g.b.af)localObject6).signature;
          if ((localHashMap.get(localObject7) == null) || (i != 0))
          {
            if (localHashMap.get(localObject7) != null) {
              ll((String)localObject7);
            }
            c((String)localObject2, str, (String)localObject7, (String)localObject5);
          }
          this.gTA.execute();
          continue;
          localObject3 = localObject2;
          if (((Cursor)localObject2).moveToFirst())
          {
            localHashMap.put(((Cursor)localObject2).getString(0), Long.valueOf(((Cursor)localObject2).getLong(1)));
            bool = ((Cursor)localObject2).moveToNext();
            if (!bool) {
              localObject3 = localObject2;
            }
          }
        }
      }
    }
  }
  
  private void c(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(1354793746432L, 10094);
    w.d("MicroMsg.ContactsOperations", "add wechat contact: displayname:" + paramString1 + ", phoneNum:" + paramString2 + ", " + paramString3 + ", username:" + paramString4);
    paramString4 = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
    paramString4.withValue("account_name", this.gTz.name);
    paramString4.withValue("account_type", this.gTz.type);
    paramString4.withValue("sync1", paramString3);
    this.gTA.a(paramString4.build());
    paramString4 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
    paramString4.withValueBackReference("raw_contact_id", 0);
    paramString4.withValue("mimetype", "vnd.android.cursor.item/name");
    paramString4.withValue("data1", paramString1);
    this.gTA.a(paramString4.build());
    paramString1 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
    paramString1.withValueBackReference("raw_contact_id", 0);
    paramString1.withValue("mimetype", "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.profile");
    paramString1.withValue("data1", paramString2);
    paramString1.withValue("data2", this.mContext.getString(R.l.app_name));
    paramString1.withValue("data3", this.mContext.getString(R.l.dlH));
    paramString1.withValue("data4", paramString3);
    this.gTA.a(paramString1.build());
    if ("1".equals(g.ut().getValue("VOIPCallType")))
    {
      paramString1 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
      paramString1.withValueBackReference("raw_contact_id", 0);
      paramString1.withValue("mimetype", "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip.video");
      paramString1.withValue("data1", paramString2);
      paramString1.withValue("data2", this.mContext.getString(R.l.app_name));
      paramString1.withValue("data3", this.mContext.getString(R.l.dlJ));
      paramString1.withValue("data4", paramString3);
      this.gTA.a(paramString1.build());
    }
    for (;;)
    {
      paramString1 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
      paramString1.withValueBackReference("raw_contact_id", 0);
      paramString1.withValue("mimetype", "vnd.android.cursor.item/vnd.com.tencent.mm.plugin.sns.timeline");
      paramString1.withValue("data1", paramString2);
      paramString1.withValue("data2", this.mContext.getString(R.l.app_name));
      paramString1.withValue("data3", this.mContext.getString(R.l.dlK));
      paramString1.withValue("data4", paramString3);
      this.gTA.a(paramString1.build());
      paramString1 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
      paramString1.withValueBackReference("raw_contact_id", 0);
      paramString1.withValue("mimetype", "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voiceaction");
      paramString1.withValue("data1", paramString2);
      paramString1.withValue("data2", this.mContext.getString(R.l.app_name));
      paramString1.withValue("data3", "");
      paramString1.withValue("data4", paramString3);
      this.gTA.a(paramString1.build());
      GMTrace.o(1354793746432L, 10094);
      return;
      paramString1 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI);
      paramString1.withValueBackReference("raw_contact_id", 0);
      paramString1.withValue("mimetype", "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip");
      paramString1.withValue("data1", paramString2);
      paramString1.withValue("data2", this.mContext.getString(R.l.app_name));
      paramString1.withValue("data3", this.mContext.getString(R.l.dlI));
      paramString1.withValue("data4", paramString3);
      this.gTA.a(paramString1.build());
    }
  }
  
  private void ll(String paramString)
  {
    GMTrace.i(1354927964160L, 10095);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.ContactsOperations", "delete wechat contact fail, phoneNum5 is null");
      GMTrace.o(1354927964160L, 10095);
      return;
    }
    if (!com.tencent.mm.pluginsdk.h.a.aS(this.mContext, "android.permission.READ_CONTACTS"))
    {
      w.e("MicroMsg.ContactsOperations", "no contact permission");
      GMTrace.o(1354927964160L, 10095);
      return;
    }
    try
    {
      paramString = this.mContext.getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[] { "contact_id", "_id" }, "(mimetype= ? or mimetype= ? or mimetype= ? or mimetype= ? or mimetype= ?) AND data4 = ?", new String[] { "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.profile", "vnd.android.cursor.item/vnd.com.tencent.mm.plugin.sns.timeline", "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip", "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip.video", "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voiceaction", paramString }, null);
      if (paramString == null)
      {
        w.e("MicroMsg.ContactsOperations", "get null cursor");
        GMTrace.o(1354927964160L, 10095);
        return;
      }
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.e("MicroMsg.ContactsOperations", "query fail, match error %s \n %s", new Object[] { paramString.getMessage(), bg.f(paramString) });
        paramString = null;
      }
    }
    for (;;)
    {
      try
      {
        if (paramString.moveToFirst())
        {
          int i = paramString.getColumnIndex("contact_id");
          if (i < 0) {
            continue;
          }
          str1 = paramString.getString(i);
          i = paramString.getColumnIndex("_id");
          if (i < 0) {
            continue;
          }
          str2 = paramString.getString(i);
          if ((!bg.nm(str1)) && (!bg.nm(str2)))
          {
            this.mContext.getContentResolver().delete(ContactsContract.Data.CONTENT_URI, "_id = ?", new String[] { str2 });
            this.mContext.getContentResolver().delete(ContactsContract.RawContacts.CONTENT_URI, "contact_id = ? AND account_type = ?", new String[] { str1, "com.tencent.mm.account" });
          }
          boolean bool = paramString.moveToNext();
          if (bool) {
            continue;
          }
        }
      }
      catch (Exception localException)
      {
        String str1;
        String str2;
        w.e("MicroMsg.ContactsOperations", "delete wechat contact failed : " + localException.getMessage());
        continue;
      }
      paramString.close();
      GMTrace.o(1354927964160L, 10095);
      return;
      str1 = "";
      continue;
      str2 = "";
    }
  }
  
  /* Error */
  private boolean lm(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 455
    //   3: sipush 10096
    //   6: invokestatic 33	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 47	com/tencent/mm/modelsimple/b:mContext	Landroid/content/Context;
    //   13: ldc -86
    //   15: invokestatic 176	com/tencent/mm/pluginsdk/h/a:aS	(Landroid/content/Context;Ljava/lang/String;)Z
    //   18: ifne +21 -> 39
    //   21: ldc 55
    //   23: ldc -78
    //   25: invokestatic 131	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   28: ldc2_w 455
    //   31: sipush 10096
    //   34: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   37: iconst_0
    //   38: ireturn
    //   39: aload_0
    //   40: getfield 47	com/tencent/mm/modelsimple/b:mContext	Landroid/content/Context;
    //   43: invokevirtual 184	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   46: getstatic 355	android/provider/ContactsContract$Data:CONTENT_URI	Landroid/net/Uri;
    //   49: iconst_1
    //   50: anewarray 186	java/lang/String
    //   53: dup
    //   54: iconst_0
    //   55: ldc_w 422
    //   58: aastore
    //   59: ldc_w 458
    //   62: iconst_1
    //   63: anewarray 186	java/lang/String
    //   66: dup
    //   67: iconst_0
    //   68: aload_1
    //   69: aastore
    //   70: aconst_null
    //   71: invokevirtual 198	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   74: astore_3
    //   75: aload_3
    //   76: ifnull +94 -> 170
    //   79: aload_3
    //   80: invokeinterface 461 1 0
    //   85: ifle +85 -> 170
    //   88: ldc 55
    //   90: new 57	java/lang/StringBuilder
    //   93: dup
    //   94: ldc_w 463
    //   97: invokespecial 62	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   100: aload_1
    //   101: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: invokevirtual 72	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   107: invokestatic 93	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   110: iconst_1
    //   111: istore_2
    //   112: aload_3
    //   113: ifnull +9 -> 122
    //   116: aload_3
    //   117: invokeinterface 205 1 0
    //   122: ldc2_w 455
    //   125: sipush 10096
    //   128: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   131: iload_2
    //   132: ireturn
    //   133: astore_1
    //   134: aconst_null
    //   135: astore_3
    //   136: ldc 55
    //   138: new 57	java/lang/StringBuilder
    //   141: dup
    //   142: ldc_w 465
    //   145: invokespecial 62	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   148: aload_1
    //   149: invokevirtual 431	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   152: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: invokevirtual 72	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   158: invokestatic 131	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   161: iconst_1
    //   162: istore_2
    //   163: goto -51 -> 112
    //   166: astore_1
    //   167: goto -31 -> 136
    //   170: iconst_0
    //   171: istore_2
    //   172: goto -60 -> 112
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	175	0	this	b
    //   0	175	1	paramString	String
    //   111	61	2	bool	boolean
    //   74	62	3	localCursor	Cursor
    // Exception table:
    //   from	to	target	type
    //   39	75	133	java/lang/Exception
    //   79	110	166	java/lang/Exception
  }
  
  private void quit()
  {
    GMTrace.i(1354525310976L, 10092);
    if (this.gTB != null) {
      this.gTB.quit();
    }
    GMTrace.o(1354525310976L, 10092);
  }
  
  public final void run()
  {
    GMTrace.i(1354391093248L, 10091);
    Looper.prepare();
    this.gTB = Looper.myLooper();
    long l = System.currentTimeMillis();
    w.i("MicroMsg.ContactsOperations", "start time:" + l);
    if ((bg.nm(this.username)) && (bg.nm(this.eMa))) {
      KY();
    }
    for (;;)
    {
      w.i("MicroMsg.ContactsOperations", "end time:" + System.currentTimeMillis());
      Looper.loop();
      GMTrace.o(1354391093248L, 10091);
      return;
      if (!bg.nm(this.eMa)) {
        break;
      }
      localb = com.tencent.mm.modelfriend.af.If().jJ(this.username);
      if ((localb != null) && (!bg.nm(localb.gCw))) {
        ll(localb.gCw);
      }
      quit();
    }
    com.tencent.mm.modelfriend.b localb = com.tencent.mm.modelfriend.af.If().jJ(this.username);
    if ((localb == null) || (bg.nm(localb.gCw))) {
      localb = com.tencent.mm.modelfriend.af.If().jJ(this.eMa);
    }
    for (;;)
    {
      if ((localb != null) && (!bg.nm(localb.gCw))) {
        try
        {
          if (!com.tencent.mm.pluginsdk.h.a.aS(this.mContext, "android.permission.READ_CONTACTS")) {
            w.e("MicroMsg.ContactsOperations", "no contact permission");
          }
        }
        catch (Exception localException)
        {
          w.printErrStackTrace("MicroMsg.ContactsOperations", localException, "", new Object[] { "" });
        }
      }
      for (;;)
      {
        quit();
        break;
        Object localObject1 = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("account_name", this.gTz.name).appendQueryParameter("account_type", this.gTz.type).build();
        Object localObject2 = this.mContext.getContentResolver();
        String str = "deleted=\"0\" AND sync1=\"" + localException.gCw + "\"";
        localObject2 = ((ContentResolver)localObject2).query((Uri)localObject1, new String[] { "sync1", "_id" }, str, null, null);
        if ((localObject2 == null) || (((Cursor)localObject2).getCount() == 0)) {
          if (!bg.nm(localException.GU())) {
            break label442;
          }
        }
        label442:
        for (localObject1 = localException.GX();; localObject1 = localException.GU())
        {
          this.gTA = new a(this.mContext.getContentResolver());
          c((String)localObject1, localException.Ha(), localException.gCw, this.username);
          this.gTA.execute();
          if (localObject2 == null) {
            break;
          }
          ((Cursor)localObject2).close();
          break;
        }
        w.d("MicroMsg.ContactsOperations", "query addrupload is null " + this.username);
      }
    }
  }
  
  public final class a
  {
    private final String TAG;
    private final ContentResolver gTC;
    ArrayList<ContentProviderOperation> gTD;
    
    public a(ContentResolver paramContentResolver)
    {
      GMTrace.i(1353317351424L, 10083);
      this.TAG = "MicroMsg.BatchOperation";
      this.gTC = paramContentResolver;
      this.gTD = new ArrayList();
      GMTrace.o(1353317351424L, 10083);
    }
    
    public final void a(ContentProviderOperation paramContentProviderOperation)
    {
      GMTrace.i(1353451569152L, 10084);
      this.gTD.add(paramContentProviderOperation);
      GMTrace.o(1353451569152L, 10084);
    }
    
    public final void execute()
    {
      GMTrace.i(1353585786880L, 10085);
      if (this.gTD.size() == 0)
      {
        w.d("MicroMsg.BatchOperation", "no batch operation");
        GMTrace.o(1353585786880L, 10085);
        return;
      }
      if (!com.tencent.mm.pluginsdk.h.a.aS(b.this.mContext, "android.permission.READ_CONTACTS"))
      {
        w.e("MicroMsg.BatchOperation", "no contact permission");
        GMTrace.o(1353585786880L, 10085);
        return;
      }
      try
      {
        this.gTC.applyBatch("com.android.contacts", this.gTD);
        this.gTD.clear();
        GMTrace.o(1353585786880L, 10085);
        return;
      }
      catch (OperationApplicationException localOperationApplicationException)
      {
        for (;;)
        {
          w.e("MicroMsg.BatchOperation", "apply batch operation failed", new Object[] { localOperationApplicationException.toString() });
        }
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          w.e("MicroMsg.BatchOperation", "apply batch operation failed", new Object[] { localRemoteException.toString() });
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.BatchOperation", "apply batch operation failed", new Object[] { localException.toString() });
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */