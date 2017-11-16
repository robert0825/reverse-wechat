package com.tencent.mm.plugin.ext.provider;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.fb;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

@JgClassChecked(author=32, fComment="checked", lastDate="20141016", reviewer=20, vComment={com.jg.EType.PROVIDERCHECK})
public class ExtControlProviderAccountSync
  extends ExtContentProviderBase
{
  private static final UriMatcher kMX;
  
  static
  {
    GMTrace.i(5723043921920L, 42640);
    UriMatcher localUriMatcher = new UriMatcher(-1);
    kMX = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.plugin.ext.AccountSync", "accountSync", 1);
    GMTrace.o(5723043921920L, 42640);
  }
  
  public ExtControlProviderAccountSync()
  {
    GMTrace.i(5722104397824L, 42633);
    GMTrace.o(5722104397824L, 42633);
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    GMTrace.i(5722775486464L, 42638);
    GMTrace.o(5722775486464L, 42638);
    return 0;
  }
  
  public String getType(Uri paramUri)
  {
    GMTrace.i(5722238615552L, 42634);
    GMTrace.o(5722238615552L, 42634);
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    GMTrace.i(5722641268736L, 42637);
    GMTrace.o(5722641268736L, 42637);
    return null;
  }
  
  public boolean onCreate()
  {
    GMTrace.i(5722372833280L, 42635);
    GMTrace.o(5722372833280L, 42635);
    return true;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    GMTrace.i(5722507051008L, 42636);
    w.d("MicroMsg.ExtControlAccountSyncProvider", "query()");
    a(paramUri, getContext(), kMX);
    if (paramUri == null)
    {
      nl(3);
      GMTrace.o(5722507051008L, 42636);
      return null;
    }
    if ((bg.nm(this.kMR)) || (bg.nm(avt())))
    {
      nl(3);
      GMTrace.o(5722507051008L, 42636);
      return null;
    }
    if (!agO())
    {
      nl(1);
      paramUri = this.jjo;
      GMTrace.o(5722507051008L, 42636);
      return paramUri;
    }
    if (!cn(getContext()))
    {
      w.w("MicroMsg.ExtControlAccountSyncProvider", "invalid appid ! return null");
      nl(2);
      GMTrace.o(5722507051008L, 42636);
      return null;
    }
    switch (kMX.match(paramUri))
    {
    default: 
      nl(3);
      GMTrace.o(5722507051008L, 42636);
      return null;
    }
    w.i("MicroMsg.ExtControlAccountSyncProvider", "startContactSync()");
    paramUri = new fb();
    if (a.vgX.m(paramUri)) {
      nl(0);
    }
    for (;;)
    {
      GMTrace.o(5722507051008L, 42636);
      return null;
      w.e("MicroMsg.ExtControlAccountSyncProvider", "AccountHelper == null");
      nl(4);
    }
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    GMTrace.i(5722909704192L, 42639);
    GMTrace.o(5722909704192L, 42639);
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ext\provider\ExtControlProviderAccountSync.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */