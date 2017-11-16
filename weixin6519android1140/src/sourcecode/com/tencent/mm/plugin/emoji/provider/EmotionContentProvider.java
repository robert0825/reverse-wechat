package com.tencent.mm.plugin.emoji.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.emoji.e.a;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.o;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import java.util.ArrayList;

public class EmotionContentProvider
  extends ContentProvider
{
  private static final UriMatcher kmb;
  
  static
  {
    GMTrace.i(19271115603968L, 143581);
    UriMatcher localUriMatcher = new UriMatcher(-1);
    kmb = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.storage.provider.emotion", "EmojiGroupInfo", 1);
    kmb.addURI("com.tencent.mm.storage.provider.emotion", "userinfo", 2);
    kmb.addURI("com.tencent.mm.storage.provider.emotion", "GetEmotionListCache", 3);
    kmb.addURI("com.tencent.mm.storage.provider.emotion", "EmojiInfo", 4);
    kmb.addURI("com.tencent.mm.storage.provider.emotion", "EmojiInfoDesc", 5);
    GMTrace.o(19271115603968L, 143581);
  }
  
  public EmotionContentProvider()
  {
    GMTrace.i(19270041862144L, 143573);
    GMTrace.o(19270041862144L, 143573);
  }
  
  public Bundle call(String paramString1, String paramString2, Bundle paramBundle)
  {
    boolean bool = true;
    GMTrace.i(19270981386240L, 143580);
    w.d("MicroMsg.EmotionContentProvider", "[call] method:%s", new Object[] { paramString1 });
    if (paramString1.equals("getAccPath"))
    {
      paramString1 = new Bundle();
      paramString1.putString("path", com.tencent.mm.kernel.h.xy().fYU);
      GMTrace.o(19270981386240L, 143580);
      return paramString1;
    }
    if (paramString1.equals("getEmojiKey"))
    {
      paramString1 = new Bundle();
      paramString1.putString("key", com.tencent.mm.plugin.emoji.model.h.arl().kjy.getKey());
      GMTrace.o(19270981386240L, 143580);
      return paramString1;
    }
    if (paramString1.equals("ConfigStorage.getBoolean"))
    {
      paramString1 = new Bundle();
      at.AR();
      paramString1.putBoolean("key", ((Boolean)com.tencent.mm.y.c.xh().get(paramBundle.getInt("key"), Boolean.valueOf(false))).booleanValue());
      GMTrace.o(19270981386240L, 143580);
      return paramString1;
    }
    if (paramString1.equals("ConfigStorage.getString"))
    {
      paramString1 = new Bundle();
      at.AR();
      paramString1.putString("key", (String)com.tencent.mm.y.c.xh().get(paramBundle.getInt("key"), ""));
      GMTrace.o(19270981386240L, 143580);
      return paramString1;
    }
    if (paramString1.equals("getAllCustomEmoji"))
    {
      paramString1 = new Bundle(EmojiInfo.class.getClassLoader());
      paramString1.putParcelableArrayList("data", com.tencent.mm.plugin.emoji.model.h.arl().aqI());
      GMTrace.o(19270981386240L, 143580);
      return paramString1;
    }
    if (paramString1.equals("getRamdomEmoji"))
    {
      if (paramBundle != null)
      {
        paramBundle.setClassLoader(EmojiInfo.class.getClassLoader());
        paramString1 = (EmojiInfo)paramBundle.getParcelable("emoji");
        paramString2 = new Bundle(EmojiInfo.class.getClassLoader());
        paramString2.putParcelable("data", ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().c(paramString1));
        GMTrace.o(19270981386240L, 143580);
        return paramString2;
      }
      if (paramBundle == null) {
        w.e("MicroMsg.EmotionContentProvider", "[getRamdomEmoji] extras:%s", new Object[] { Boolean.valueOf(bool) });
      }
    }
    do
    {
      GMTrace.o(19270981386240L, 143580);
      return null;
      bool = false;
      break;
      if (paramString1.equals("getCurLangDesc"))
      {
        paramString1 = new Bundle();
        paramString1.putString("data", com.tencent.mm.plugin.emoji.model.h.arg().vM(paramString2));
        GMTrace.o(19270981386240L, 143580);
        return paramString1;
      }
      if (paramString1.equals("countCustomEmoji"))
      {
        paramString1 = new Bundle();
        paramString1.putInt("data", com.tencent.mm.plugin.emoji.model.h.arl().kjy.kM(true));
        GMTrace.o(19270981386240L, 143580);
        return paramString1;
      }
      if (paramString1.equals("countProductId"))
      {
        paramString1 = new Bundle();
        paramString1.putInt("data", com.tencent.mm.plugin.emoji.model.h.arl().kjy.vZ(paramString2));
        GMTrace.o(19270981386240L, 143580);
        return paramString1;
      }
      if (paramString1.equals("getDownloadedCount"))
      {
        paramString1 = new Bundle();
        paramString1.putInt("data", com.tencent.mm.plugin.emoji.model.h.arl().aqH());
        GMTrace.o(19270981386240L, 143580);
        return paramString1;
      }
      if (paramString1.equals("getEmojiListByGroupId"))
      {
        paramString1 = new Bundle(EmojiInfo.class.getClassLoader());
        paramString1.putParcelableArrayList("data", (ArrayList)((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vR(paramString2));
        GMTrace.o(19270981386240L, 143580);
        return paramString1;
      }
    } while (!paramString1.equals("getEmojiGroupInfoList"));
    paramString1 = new Bundle(EmojiGroupInfo.class.getClassLoader());
    paramString1.putParcelableArrayList("data", com.tencent.mm.plugin.emoji.model.h.arl().aqG());
    GMTrace.o(19270981386240L, 143580);
    return paramString1;
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    GMTrace.i(19270712950784L, 143578);
    switch (kmb.match(paramUri))
    {
    default: 
      GMTrace.o(19270712950784L, 143578);
      return 0;
    }
    at.AR();
    int i = com.tencent.mm.y.c.yH().delete("GetEmotionListCache", paramString, paramArrayOfString);
    GMTrace.o(19270712950784L, 143578);
    return i;
  }
  
  public String getType(Uri paramUri)
  {
    GMTrace.i(19270444515328L, 143576);
    GMTrace.o(19270444515328L, 143576);
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    GMTrace.i(19270578733056L, 143577);
    switch (kmb.match(paramUri))
    {
    default: 
      GMTrace.o(19270578733056L, 143577);
      return paramUri;
    }
    at.AR();
    paramUri = Uri.withAppendedPath(paramUri, String.valueOf(com.tencent.mm.y.c.yH().insert("GetEmotionListCache", o.fTp.vms, paramContentValues)));
    GMTrace.o(19270578733056L, 143577);
    return paramUri;
  }
  
  public boolean onCreate()
  {
    GMTrace.i(19270176079872L, 143574);
    w.i("MicroMsg.EmotionContentProvider", "[onCreate]");
    GMTrace.o(19270176079872L, 143574);
    return true;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    GMTrace.i(19270310297600L, 143575);
    w.i("MicroMsg.EmotionContentProvider", "[query] path:%s selection:%s", new Object[] { paramUri.getPath(), paramString1 });
    switch (kmb.match(paramUri))
    {
    case 2: 
    default: 
      GMTrace.o(19270310297600L, 143575);
      return null;
    case 1: 
      at.AR();
      paramUri = com.tencent.mm.y.c.yH().a(paramString1, paramArrayOfString2, 2);
      GMTrace.o(19270310297600L, 143575);
      return paramUri;
    case 3: 
      at.AR();
      paramUri = com.tencent.mm.y.c.yH().a(paramString1, paramArrayOfString2, 2);
      GMTrace.o(19270310297600L, 143575);
      return paramUri;
    case 4: 
      at.AR();
      paramUri = com.tencent.mm.y.c.yH().a(paramString1, paramArrayOfString2, 2);
      GMTrace.o(19270310297600L, 143575);
      return paramUri;
    }
    at.AR();
    paramUri = com.tencent.mm.y.c.yH().a(paramString1, paramArrayOfString2, 2);
    GMTrace.o(19270310297600L, 143575);
    return paramUri;
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    GMTrace.i(19270847168512L, 143579);
    switch (kmb.match(paramUri))
    {
    default: 
      GMTrace.o(19270847168512L, 143579);
      return -1;
    case 2: 
      at.AR();
      com.tencent.mm.y.c.xh().set(((Integer)paramContentValues.get("type")).intValue(), paramContentValues.get("value"));
      GMTrace.o(19270847168512L, 143579);
      return 0;
    }
    at.AR();
    int i = com.tencent.mm.y.c.yH().update("EmojiGroupInfo", paramContentValues, paramString, paramArrayOfString);
    GMTrace.o(19270847168512L, 143579);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\emoji\provider\EmotionContentProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */