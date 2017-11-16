package com.tencent.mm.modelvoiceaction;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.DataUsageFeedback;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.modelfriend.af;
import com.tencent.mm.modelfriend.b;
import com.tencent.mm.plugin.messenger.a.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.s;

public class VoiceActionService
  extends SearchActionVerificationClientService
{
  public VoiceActionService()
  {
    GMTrace.i(1592627560448L, 11866);
    GMTrace.o(1592627560448L, 11866);
  }
  
  public final boolean a(Intent paramIntent, boolean paramBoolean)
  {
    GMTrace.i(1592761778176L, 11867);
    if (!paramBoolean)
    {
      w.i("MicroMsg.VoiceActionService", "Action is not verified");
      GMTrace.o(1592761778176L, 11867);
      return false;
    }
    Object localObject = paramIntent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID");
    String str1 = paramIntent.getStringExtra("android.intent.extra.TEXT");
    String str2 = g.n(com.tencent.mm.pluginsdk.a.Fp((String)localObject).getBytes());
    str2 = af.If().jK(str2).getUsername();
    d.aOe().A(str2, str1, s.go(str2));
    for (;;)
    {
      try
      {
        str1 = paramIntent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_URI");
        paramIntent = str1.split("/");
        if ((paramIntent == null) || (paramIntent.length <= 0)) {
          continue;
        }
        paramIntent = paramIntent[(paramIntent.length - 1)];
        if (!bg.nm(paramIntent)) {
          continue;
        }
        w.e("MicroMsg.VoiceActionService", "extract contact Id error, %s %s", new Object[] { str1, localObject });
      }
      catch (Exception paramIntent)
      {
        w.printErrStackTrace("MicroMsg.VoiceActionService", paramIntent, "updateContactMarked error", new Object[0]);
        continue;
        paramIntent = getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[] { "_id" }, "contact_id=? AND data1=? AND account_type=? AND mimetype=?", new String[] { paramIntent, localObject, "com.tencent.mm.account", "vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voiceaction" }, null);
        if (paramIntent == null) {
          break label355;
        }
      }
      GMTrace.o(1592761778176L, 11867);
      return true;
      paramIntent = "";
      continue;
      if (com.tencent.mm.pluginsdk.h.a.aS(this, "android.permission.READ_CONTACTS")) {
        continue;
      }
      w.e("MicroMsg.VoiceActionService", "no contacts permission");
    }
    if (paramIntent.getCount() > 0)
    {
      paramIntent.moveToNext();
      long l = paramIntent.getLong(0);
      localObject = ContactsContract.DataUsageFeedback.FEEDBACK_URI.buildUpon().appendPath(String.valueOf(l)).appendQueryParameter("type", "short_text").build();
      if (getContentResolver().update((Uri)localObject, new ContentValues(), null, null) <= 0) {
        break label365;
      }
    }
    label355:
    label363:
    label365:
    for (paramBoolean = true;; paramBoolean = false)
    {
      w.i("MicroMsg.VoiceActionService", "updateContactMarked: %b", new Object[] { Boolean.valueOf(paramBoolean) });
      for (;;)
      {
        if (paramIntent == null) {
          break label363;
        }
        paramIntent.close();
        break;
        w.i("MicroMsg.VoiceActionService", "updateContactMarked: false");
      }
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\modelvoiceaction\VoiceActionService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */