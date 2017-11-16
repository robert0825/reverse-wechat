package com.tencent.mm.plugin.accountsync.model;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.si;
import com.tencent.mm.modelfriend.af;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;

public final class b
{
  public static abstract interface a
  {
    public abstract int bB(Context paramContext);
  }
  
  public static final class b
    implements b.a
  {
    private String htr;
    private int toScene;
    private Uri uri;
    
    public b(int paramInt, String paramString, Uri paramUri)
    {
      GMTrace.i(7831738646528L, 58351);
      this.toScene = paramInt;
      this.htr = paramString;
      this.uri = paramUri;
      GMTrace.o(7831738646528L, 58351);
    }
    
    private int b(Context paramContext, String paramString1, String paramString2, String paramString3)
    {
      GMTrace.i(7832007081984L, 58353);
      Object localObject = af.If().jK(paramString1);
      if (paramContext == null)
      {
        w.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "null context");
        GMTrace.o(7832007081984L, 58353);
        return 1;
      }
      if (localObject == null)
      {
        w.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "this user is not my friend");
        GMTrace.o(7832007081984L, 58353);
        return 1;
      }
      localObject = ((com.tencent.mm.modelfriend.b)localObject).getUsername();
      if (bg.nm((String)localObject))
      {
        w.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "get username failed, phonenum md5 is " + paramString1);
        GMTrace.o(7832007081984L, 58353);
        return 1;
      }
      at.AR();
      if (com.tencent.mm.y.c.yK().TA((String)localObject))
      {
        com.tencent.mm.plugin.report.service.g.ork.i(11157, new Object[] { Integer.valueOf(this.toScene) });
        switch (this.toScene)
        {
        }
      }
      for (;;)
      {
        GMTrace.o(7832007081984L, 58353);
        return 1;
        paramString1 = new Intent();
        paramString1.putExtra("Chat_User", (String)localObject);
        paramString1.putExtra("finish_direct", true);
        paramString1.addFlags(67108864);
        com.tencent.mm.plugin.c.a.hnH.e(paramString1, paramContext);
        GMTrace.o(7832007081984L, 58353);
        return 0;
        paramString1 = new si();
        paramString1.eXf.eHJ = 5;
        paramString1.eXf.eDs = ((String)localObject);
        paramString1.eXf.context = paramContext;
        paramString1.eXf.eXa = 3;
        com.tencent.mm.sdk.b.a.vgX.m(paramString1);
        GMTrace.o(7832007081984L, 58353);
        return 0;
        paramString1 = new si();
        paramString1.eXf.eHJ = 5;
        paramString1.eXf.eDs = ((String)localObject);
        paramString1.eXf.context = paramContext;
        paramString1.eXf.eXa = 2;
        com.tencent.mm.sdk.b.a.vgX.m(paramString1);
        GMTrace.o(7832007081984L, 58353);
        return 0;
        paramString1 = new Intent();
        paramString1.putExtra("sns_userName", (String)localObject);
        paramString1.addFlags(67108864);
        d.b(paramContext, "sns", ".ui.SnsUserUI", paramString1);
        GMTrace.o(7832007081984L, 58353);
        return 0;
        if ((!bg.nm(paramString3)) && (!bg.nm(paramString2)))
        {
          if (!com.tencent.mm.pluginsdk.h.a.aS(paramContext, "android.permission.READ_CONTACTS"))
          {
            w.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "no contact permission");
            GMTrace.o(7832007081984L, 58353);
            return 1;
          }
          Toast.makeText(paramContext, paramContext.getString(R.l.dlO), 1).show();
          paramContext.getContentResolver().delete(ContactsContract.Data.CONTENT_URI, "_id = ?", new String[] { paramString2 });
          paramContext.getContentResolver().delete(ContactsContract.RawContacts.CONTENT_URI, "contact_id = ? AND account_type = ?", new String[] { paramString3, "com.tencent.mm.account" });
        }
      }
    }
    
    public final int bB(Context paramContext)
    {
      GMTrace.i(7831872864256L, 58352);
      if (paramContext == null)
      {
        w.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "null context");
        GMTrace.o(7831872864256L, 58352);
        return 1;
      }
      if ((!at.AT()) || (at.wF()))
      {
        w.d("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "not login, start bind login");
        GMTrace.o(7831872864256L, 58352);
        return 3;
      }
      at.AR();
      if (bg.nm((String)com.tencent.mm.y.c.xh().get(6, "")))
      {
        w.d("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "not bind mobile, start bind mobie");
        GMTrace.o(7831872864256L, 58352);
        return 2;
      }
      if (!com.tencent.mm.pluginsdk.h.a.aS(paramContext, "android.permission.READ_CONTACTS"))
      {
        w.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "no contacts permission");
        GMTrace.o(7831872864256L, 58352);
        return 1;
      }
      int i;
      if (this.uri != null)
      {
        Cursor localCursor = paramContext.getContentResolver().query(this.uri, new String[] { "contact_id", "_id", "data4" }, null, null, null);
        if (localCursor == null)
        {
          w.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "query database err");
          GMTrace.o(7831872864256L, 58352);
          return 1;
        }
        if (!localCursor.moveToFirst())
        {
          w.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "query database err, move to first fail");
          localCursor.close();
          GMTrace.o(7831872864256L, 58352);
          return 1;
        }
        i = localCursor.getColumnIndex("data4");
        if (i == -1)
        {
          w.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "no data4 segment exist");
          localCursor.close();
          GMTrace.o(7831872864256L, 58352);
          return 1;
        }
        Object localObject2 = "";
        String str1 = "";
        Object localObject1 = str1;
        try
        {
          String str2 = localCursor.getString(i);
          localObject1 = str1;
          localObject2 = str2;
          i = localCursor.getColumnIndex("contact_id");
          String str3;
          if (i >= 0)
          {
            localObject1 = str1;
            localObject2 = str2;
            str1 = localCursor.getString(i);
            localObject1 = str1;
            localObject2 = str2;
            i = localCursor.getColumnIndex("_id");
            if (i < 0) {
              break label424;
            }
            localObject1 = str1;
            localObject2 = str2;
            str3 = localCursor.getString(i);
          }
          label424:
          for (localObject1 = str3;; localObject1 = "")
          {
            localCursor.close();
            if (!bg.nm(str2)) {
              break label515;
            }
            w.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "null friendmobile");
            GMTrace.o(7831872864256L, 58352);
            return 1;
            str1 = "";
            break;
          }
          i = b(paramContext, str2, (String)localObject1, str1);
        }
        catch (Exception paramContext)
        {
          w.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "match error, %s\n%s", new Object[] { paramContext.getMessage(), bg.f(paramContext) });
          w.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "result friendMobileMd5 %s contact_id %s data_id %s", new Object[] { localObject2, localObject1, "" });
          localCursor.close();
          GMTrace.o(7831872864256L, 58352);
          return 1;
        }
        finally
        {
          localCursor.close();
        }
        label515:
        GMTrace.o(7831872864256L, 58352);
        return i;
      }
      if (!bg.nm(this.htr))
      {
        i = b(paramContext, com.tencent.mm.a.g.n(com.tencent.mm.pluginsdk.a.Fp(this.htr).getBytes()), null, null);
        GMTrace.o(7831872864256L, 58352);
        return i;
      }
      w.e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "uri is null and the phone num is null");
      GMTrace.o(7831872864256L, 58352);
      return 1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\accountsync\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */