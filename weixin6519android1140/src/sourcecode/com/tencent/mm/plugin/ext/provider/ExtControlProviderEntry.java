package com.tencent.mm.plugin.ext.provider;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.ext.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

@JgClassChecked(author=32, fComment="checked", lastDate="20141016", reviewer=20, vComment={com.jg.EType.PROVIDERCHECK})
public class ExtControlProviderEntry
  extends ExtContentProviderBase
{
  private static final UriMatcher kMX;
  private String[] kMI;
  private int kMJ;
  private boolean kMY;
  private Context kMZ;
  
  static
  {
    GMTrace.i(5728815284224L, 42683);
    UriMatcher localUriMatcher = new UriMatcher(-1);
    kMX = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.plugin.ext.entry", "view_profile", 2);
    kMX.addURI("com.tencent.mm.plugin.ext.entry", "to_chatting", 3);
    kMX.addURI("com.tencent.mm.plugin.ext.entry", "to_nearby", 4);
    kMX.addURI("com.tencent.mm.plugin.ext.entry", "sns_comment_detail", 5);
    kMX.addURI("com.tencent.mm.plugin.ext.entry", "share_time_line", 6);
    GMTrace.o(5728815284224L, 42683);
  }
  
  public ExtControlProviderEntry()
  {
    GMTrace.i(5727607324672L, 42674);
    this.kMY = false;
    this.kMI = null;
    this.kMJ = -1;
    GMTrace.o(5727607324672L, 42674);
  }
  
  public ExtControlProviderEntry(String[] paramArrayOfString, int paramInt, Context paramContext)
  {
    GMTrace.i(5727741542400L, 42675);
    this.kMY = false;
    this.kMI = null;
    this.kMJ = -1;
    this.kMY = true;
    this.kMI = paramArrayOfString;
    this.kMJ = paramInt;
    this.kMZ = paramContext;
    GMTrace.o(5727741542400L, 42675);
  }
  
  private Cursor b(String[] paramArrayOfString, String paramString)
  {
    GMTrace.i(5728546848768L, 42681);
    w.i("MicroMsg.ExtControlEntryProvider", "toChattingUI");
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      w.w("MicroMsg.ExtControlEntryProvider", "wrong args");
      bY(3, 3601);
      paramArrayOfString = com.tencent.mm.pluginsdk.f.a.a.yI(3601);
      GMTrace.o(5728546848768L, 42681);
      return paramArrayOfString;
    }
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.ExtControlEntryProvider", "callSource == null");
      bY(3, 3602);
      paramArrayOfString = com.tencent.mm.pluginsdk.f.a.a.yI(3602);
      GMTrace.o(5728546848768L, 42681);
      return paramArrayOfString;
    }
    paramArrayOfString = paramArrayOfString[0];
    if ((paramArrayOfString == null) || (paramArrayOfString.length() <= 0))
    {
      w.w("MicroMsg.ExtControlEntryProvider", "contactId == null");
      bY(3, 3603);
      paramArrayOfString = com.tencent.mm.pluginsdk.f.a.a.yI(3603);
      GMTrace.o(5728546848768L, 42681);
      return paramArrayOfString;
    }
    int i;
    if ((paramString != null) && (paramString.equalsIgnoreCase("openapi")))
    {
      i = 1;
      if (i == 0) {
        break label298;
      }
    }
    for (;;)
    {
      try
      {
        paramArrayOfString = b.avk().UC(paramArrayOfString);
        if ((paramArrayOfString == null) || (bg.nm(paramArrayOfString.field_openId)) || (bg.nm(paramArrayOfString.field_username)))
        {
          w.e("MicroMsg.ExtControlEntryProvider", "openidInApp is null");
          bY(3, 3604);
          paramArrayOfString = com.tencent.mm.pluginsdk.f.a.a.yI(3604);
          GMTrace.o(5728546848768L, 42681);
          return paramArrayOfString;
          i = 0;
          break;
        }
        at.AR();
        paramArrayOfString = c.yK().TE(paramArrayOfString.field_username);
        if ((paramArrayOfString != null) && ((int)paramArrayOfString.fTq > 0) && (this.kMZ != null)) {
          break label364;
        }
        w.e("MicroMsg.ExtControlEntryProvider", "wrong args ct");
        bY(3, 3605);
        paramArrayOfString = com.tencent.mm.pluginsdk.f.a.a.yI(3605);
        GMTrace.o(5728546848768L, 42681);
        return paramArrayOfString;
      }
      catch (Exception paramArrayOfString)
      {
        label298:
        w.w("MicroMsg.ExtControlEntryProvider", paramArrayOfString.getMessage());
        w.printErrStackTrace("MicroMsg.ExtControlEntryProvider", paramArrayOfString, "", new Object[0]);
        A(5, 4, 12);
        paramArrayOfString = com.tencent.mm.pluginsdk.f.a.a.yI(12);
        GMTrace.o(5728546848768L, 42681);
        return paramArrayOfString;
      }
      at.AR();
      paramArrayOfString = c.yK().eQ(com.tencent.mm.plugin.ext.a.a.xk(paramArrayOfString));
    }
    label364:
    paramString = new Intent();
    paramString.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.chatting.En_5b8fbb1e"));
    paramString.putExtra("Chat_User", paramArrayOfString.field_username);
    paramString.putExtra("finish_direct", true);
    paramString.addFlags(268435456);
    paramString.addFlags(67108864);
    this.kMZ.startActivity(paramString);
    A(4, 0, 1);
    paramArrayOfString = com.tencent.mm.pluginsdk.f.a.a.yI(1);
    GMTrace.o(5728546848768L, 42681);
    return paramArrayOfString;
  }
  
  private Cursor l(String[] paramArrayOfString)
  {
    GMTrace.i(5728412631040L, 42680);
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      w.w("MicroMsg.ExtControlEntryProvider", "wrong args");
      nl(3);
      GMTrace.o(5728412631040L, 42680);
      return null;
    }
    paramArrayOfString = paramArrayOfString[0];
    if ((paramArrayOfString == null) || (paramArrayOfString.length() <= 0))
    {
      w.w("MicroMsg.ExtControlEntryProvider", "contactId == null");
      nl(3);
      GMTrace.o(5728412631040L, 42680);
      return null;
    }
    try
    {
      at.AR();
      paramArrayOfString = c.yK().eQ(com.tencent.mm.plugin.ext.a.a.xk(paramArrayOfString));
      if ((paramArrayOfString == null) || ((int)paramArrayOfString.fTq <= 0) || (this.kMZ == null))
      {
        nl(3);
        GMTrace.o(5728412631040L, 42680);
        return null;
      }
    }
    catch (Exception paramArrayOfString)
    {
      w.w("MicroMsg.ExtControlEntryProvider", paramArrayOfString.getMessage());
      w.printErrStackTrace("MicroMsg.ExtControlEntryProvider", paramArrayOfString, "", new Object[0]);
      nl(3);
      GMTrace.o(5728412631040L, 42680);
      return null;
    }
    Intent localIntent = new Intent();
    localIntent.addFlags(268435456);
    localIntent.putExtra("Contact_User", paramArrayOfString.field_username);
    d.b(this.kMZ, "profile", ".ui.ContactInfoUI", localIntent);
    nl(0);
    paramArrayOfString = com.tencent.mm.pluginsdk.f.a.a.yI(1);
    GMTrace.o(5728412631040L, 42680);
    return paramArrayOfString;
  }
  
  private Cursor m(String[] paramArrayOfString)
  {
    GMTrace.i(5728681066496L, 42682);
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      w.w("MicroMsg.ExtControlEntryProvider", "wrong args");
      nl(3);
      GMTrace.o(5728681066496L, 42682);
      return null;
    }
    paramArrayOfString = paramArrayOfString[0];
    if ((paramArrayOfString == null) || (paramArrayOfString.length() <= 0))
    {
      w.w("MicroMsg.ExtControlEntryProvider", "wrong args");
      nl(3);
      GMTrace.o(5728681066496L, 42682);
      return null;
    }
    long l;
    try
    {
      l = com.tencent.mm.plugin.ext.a.a.xk(paramArrayOfString);
      if (l <= 0L)
      {
        nl(3);
        GMTrace.o(5728681066496L, 42682);
        return null;
      }
    }
    catch (Exception paramArrayOfString)
    {
      w.w("MicroMsg.ExtControlEntryProvider", paramArrayOfString.getMessage());
      w.printErrStackTrace("MicroMsg.ExtControlEntryProvider", paramArrayOfString, "", new Object[0]);
      nl(3);
      GMTrace.o(5728681066496L, 42682);
      return null;
    }
    if (this.kMZ == null)
    {
      nl(4);
      GMTrace.o(5728681066496L, 42682);
      return null;
    }
    paramArrayOfString = new Intent();
    paramArrayOfString.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI"));
    paramArrayOfString.putExtra("INTENT_SNS_LOCAL_ID", (int)l);
    paramArrayOfString.addCategory("android.intent.category.DEFAULT");
    paramArrayOfString.addFlags(268435456);
    this.kMZ.startActivity(paramArrayOfString);
    nl(0);
    paramArrayOfString = com.tencent.mm.pluginsdk.f.a.a.yI(1);
    GMTrace.o(5728681066496L, 42682);
    return paramArrayOfString;
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    GMTrace.i(5728144195584L, 42678);
    GMTrace.o(5728144195584L, 42678);
    return 0;
  }
  
  public String getType(Uri paramUri)
  {
    GMTrace.i(5727338889216L, 42672);
    GMTrace.o(5727338889216L, 42672);
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    GMTrace.i(5728009977856L, 42677);
    GMTrace.o(5728009977856L, 42677);
    return null;
  }
  
  public boolean onCreate()
  {
    GMTrace.i(5727473106944L, 42673);
    GMTrace.o(5727473106944L, 42673);
    return true;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    GMTrace.i(5727875760128L, 42676);
    w.i("MicroMsg.ExtControlEntryProvider", "ExtControlProviderEntry query() mIsLocalUsed :" + this.kMY);
    if (this.kMY)
    {
      a(paramUri, this.kMZ, this.kMJ, this.kMI);
      if (bg.nm(this.kMR))
      {
        w.e("MicroMsg.ExtControlEntryProvider", "AppID == null");
        bY(3, 7);
        paramUri = com.tencent.mm.pluginsdk.f.a.a.yI(7);
        GMTrace.o(5727875760128L, 42676);
        return paramUri;
      }
      if (bg.nm(avt()))
      {
        w.e("MicroMsg.ExtControlEntryProvider", "PkgName == null");
        bY(3, 6);
        paramUri = com.tencent.mm.pluginsdk.f.a.a.yI(6);
        GMTrace.o(5727875760128L, 42676);
        return paramUri;
      }
      int i = avu();
      if (i != 1)
      {
        w.e("MicroMsg.ExtControlEntryProvider", "invalid appid ! return code = " + i);
        bY(2, i);
        paramUri = com.tencent.mm.pluginsdk.f.a.a.yI(i);
        GMTrace.o(5727875760128L, 42676);
        return paramUri;
      }
    }
    else
    {
      this.kMZ = getContext();
      a(paramUri, this.kMZ, kMX);
      if (paramUri == null)
      {
        nl(3);
        GMTrace.o(5727875760128L, 42676);
        return null;
      }
      if ((bg.nm(this.kMR)) || (bg.nm(avt())))
      {
        nl(3);
        paramUri = com.tencent.mm.pluginsdk.f.a.a.yI(3);
        GMTrace.o(5727875760128L, 42676);
        return paramUri;
      }
      if (!agO())
      {
        nl(1);
        paramUri = this.jjo;
        GMTrace.o(5727875760128L, 42676);
        return paramUri;
      }
      if (!cn(this.kMZ))
      {
        w.w("MicroMsg.ExtControlEntryProvider", "invalid appid ! return null");
        nl(2);
        GMTrace.o(5727875760128L, 42676);
        return null;
      }
    }
    paramArrayOfString1 = bg.nl(paramUri.getQueryParameter("source"));
    if (!this.kMY) {
      this.kMJ = kMX.match(paramUri);
    }
    switch (this.kMJ)
    {
    default: 
      bY(3, 15);
      GMTrace.o(5727875760128L, 42676);
      return null;
    case 2: 
      paramUri = l(paramArrayOfString2);
      GMTrace.o(5727875760128L, 42676);
      return paramUri;
    case 3: 
      paramUri = b(paramArrayOfString2, paramArrayOfString1);
      GMTrace.o(5727875760128L, 42676);
      return paramUri;
    case 4: 
      if (this.kMZ == null)
      {
        nl(4);
        GMTrace.o(5727875760128L, 42676);
        return null;
      }
      paramUri = new Intent();
      paramUri.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI"));
      paramUri.addFlags(268435456);
      this.kMZ.startActivity(paramUri);
      nl(0);
      paramUri = com.tencent.mm.pluginsdk.f.a.a.yI(1);
      GMTrace.o(5727875760128L, 42676);
      return paramUri;
    case 5: 
      paramUri = m(paramArrayOfString2);
      GMTrace.o(5727875760128L, 42676);
      return paramUri;
    }
    if ((paramArrayOfString2 == null) || (paramArrayOfString2.length <= 0))
    {
      w.w("MicroMsg.ExtControlEntryProvider", "wrong args");
      nl(3);
      GMTrace.o(5727875760128L, 42676);
      return null;
    }
    if (this.kMZ == null)
    {
      nl(4);
      GMTrace.o(5727875760128L, 42676);
      return null;
    }
    paramArrayOfString1 = new Intent();
    paramArrayOfString1.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareToTimeLineUI"));
    paramArrayOfString1.setAction("android.intent.action.SEND");
    paramArrayOfString1.addCategory("android.intent.category.DEFAULT");
    paramArrayOfString1.addFlags(268435456);
    if (paramArrayOfString2[1] == null) {}
    for (paramUri = "";; paramUri = paramArrayOfString2[1])
    {
      paramArrayOfString1.putExtra("android.intent.extra.TEXT", paramUri);
      if ((paramArrayOfString2[0] != null) && (paramArrayOfString2[0].trim().length() > 0)) {
        paramArrayOfString1.putExtra("android.intent.extra.STREAM", Uri.parse(paramArrayOfString2[0]));
      }
      paramArrayOfString1.putExtra("Ksnsupload_empty_img", true);
      paramArrayOfString1.setType("image/*");
      this.kMZ.startActivity(paramArrayOfString1);
      nl(0);
      paramUri = com.tencent.mm.pluginsdk.f.a.a.yI(1);
      GMTrace.o(5727875760128L, 42676);
      return paramUri;
    }
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    GMTrace.i(5728278413312L, 42679);
    GMTrace.o(5728278413312L, 42679);
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ext\provider\ExtControlProviderEntry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */