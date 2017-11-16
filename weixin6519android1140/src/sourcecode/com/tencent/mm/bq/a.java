package com.tencent.mm.bq;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.a.a.b.a;
import com.tencent.mm.jniinterface.AesEcb;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.emoji.b.c;
import com.tencent.mm.protocal.c.bef;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public final class a
  implements com.tencent.mm.pluginsdk.c.e
{
  public static a veg;
  public static b veh;
  public static c vei;
  private com.tencent.mm.ao.a.a kAL;
  private String vec;
  private ArrayList<EmojiInfo> ved;
  private HashMap<String, ArrayList<EmojiInfo>> vee;
  private ArrayList<EmojiGroupInfo> vef;
  
  static
  {
    GMTrace.i(20098433679360L, 149745);
    veg = new a();
    veh = new b();
    vei = new c();
    GMTrace.o(20098433679360L, 149745);
  }
  
  public a()
  {
    GMTrace.i(20095346671616L, 149722);
    this.ved = new ArrayList();
    this.vee = new HashMap();
    this.vef = new ArrayList();
    GMTrace.o(20095346671616L, 149722);
  }
  
  private static String aqx()
  {
    GMTrace.i(20097762590720L, 149740);
    String str = ab.getContext().getContentResolver().call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "getEmojiKey", null, null).getString("key", "");
    GMTrace.o(20097762590720L, 149740);
    return str;
  }
  
  public static a bOv()
  {
    GMTrace.i(20098031026176L, 149742);
    a locala = veg;
    GMTrace.o(20098031026176L, 149742);
    return locala;
  }
  
  public final void a(bef parambef)
  {
    GMTrace.i(20095749324800L, 149725);
    if (((f)h.xv().wZ()).eR("")) {
      ((c)h.j(c.class)).getEmojiMgr().a(parambef);
    }
    GMTrace.o(20095749324800L, 149725);
  }
  
  public final boolean a(EmojiGroupInfo paramEmojiGroupInfo)
  {
    GMTrace.i(20096286195712L, 149729);
    if (((f)h.xv().wZ()).eR(""))
    {
      boolean bool = ((c)h.j(c.class)).getEmojiMgr().a(paramEmojiGroupInfo);
      GMTrace.o(20096286195712L, 149729);
      return bool;
    }
    GMTrace.o(20096286195712L, 149729);
    return false;
  }
  
  public final byte[] a(EmojiInfo paramEmojiInfo)
  {
    GMTrace.i(20097091502080L, 149735);
    if (((f)h.xv().wZ()).eR(""))
    {
      paramEmojiInfo = ((c)h.j(c.class)).getEmojiMgr().a(paramEmojiInfo);
      GMTrace.o(20097091502080L, 149735);
      return paramEmojiInfo;
    }
    if (paramEmojiInfo == null)
    {
      w.w("MicroMsg.EmotionStorageResolver", "[decodeEmojiDataExport] failed. emoji is null.");
      GMTrace.o(20097091502080L, 149735);
      return null;
    }
    String str = paramEmojiInfo.bUU();
    byte[] arrayOfByte1 = com.tencent.mm.a.e.c(str, 0, com.tencent.mm.a.e.aY(str));
    if ((com.tencent.mm.a.e.aY(str) > 0) && (arrayOfByte1 != null) && (arrayOfByte1.length >= 10))
    {
      byte[] arrayOfByte2 = new byte[10];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, 10);
      if (((paramEmojiInfo.field_reserved4 & EmojiInfo.vCJ) == EmojiInfo.vCJ) && (!o.bj(arrayOfByte2)))
      {
        long l1 = System.currentTimeMillis();
        int j = com.tencent.mm.a.e.aY(str);
        int i = j;
        if (j > 1024) {
          i = 1024;
        }
        arrayOfByte2 = com.tencent.mm.a.e.c(str, 0, i);
        paramEmojiInfo = null;
        if (!bg.nm(aqx())) {
          paramEmojiInfo = AesEcb.aesCryptEcb(arrayOfByte2, aqx().getBytes(), false, false);
        }
        if ((!bg.bq(paramEmojiInfo)) && (!bg.bq(arrayOfByte1)))
        {
          System.arraycopy(paramEmojiInfo, 0, arrayOfByte1, 0, i);
          long l2 = System.currentTimeMillis();
          w.d("MicroMsg.EmotionStorageResolver", "decode emoji file length:%d use time:%d", new Object[] { Integer.valueOf(arrayOfByte1.length), Long.valueOf(l2 - l1) });
          GMTrace.o(20097091502080L, 149735);
          return arrayOfByte1;
        }
        w.i("MicroMsg.EmotionStorageResolver", "decode emoji file failed. path:%s return original ", new Object[] { str });
        GMTrace.o(20097091502080L, 149735);
        return arrayOfByte1;
      }
      GMTrace.o(20097091502080L, 149735);
      return arrayOfByte1;
    }
    w.i("MicroMsg.EmotionStorageResolver", "decode emoji file failed. path is no exist :%s ", new Object[] { str });
    GMTrace.o(20097091502080L, 149735);
    return null;
  }
  
  public final bef aqE()
  {
    GMTrace.i(20095615107072L, 149724);
    if (((f)h.xv().wZ()).eR(""))
    {
      bef localbef = ((c)h.j(c.class)).getEmojiMgr().aqE();
      GMTrace.o(20095615107072L, 149724);
      return localbef;
    }
    GMTrace.o(20095615107072L, 149724);
    return null;
  }
  
  public final int aqF()
  {
    GMTrace.i(20095883542528L, 149726);
    if (((f)h.xv().wZ()).eR(""))
    {
      i = ((c)h.j(c.class)).getEmojiMgr().aqF();
      GMTrace.o(20095883542528L, 149726);
      return i;
    }
    int i = ab.getContext().getContentResolver().call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "countCustomEmoji", null, null).getInt("data", 0);
    GMTrace.o(20095883542528L, 149726);
    return i;
  }
  
  public final ArrayList<EmojiGroupInfo> aqG()
  {
    GMTrace.i(20096420413440L, 149730);
    if (((f)h.xv().wZ()).eR(""))
    {
      localObject = ((c)h.j(c.class)).getEmojiMgr().aqG();
      GMTrace.o(20096420413440L, 149730);
      return (ArrayList<EmojiGroupInfo>)localObject;
    }
    if (this.vef.size() == 0)
    {
      localObject = ab.getContext().getContentResolver().call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "getEmojiGroupInfoList", null, null);
      if (localObject != null)
      {
        ((Bundle)localObject).setClassLoader(EmojiGroupInfo.class.getClassLoader());
        if (((Bundle)localObject).containsKey("data"))
        {
          localObject = ((Bundle)localObject).getParcelableArrayList("data");
          this.vef.addAll((Collection)localObject);
          w.i("MicroMsg.EmotionStorageResolver", "[getEmojiGroupInfoListExport] size%s", new Object[] { Integer.valueOf(((List)localObject).size()) });
        }
      }
    }
    Object localObject = this.vef;
    GMTrace.o(20096420413440L, 149730);
    return (ArrayList<EmojiGroupInfo>)localObject;
  }
  
  public final int aqH()
  {
    GMTrace.i(20096151977984L, 149728);
    if (((f)h.xv().wZ()).eR(""))
    {
      i = ((c)h.j(c.class)).getEmojiMgr().aqH();
      GMTrace.o(20096151977984L, 149728);
      return i;
    }
    int i = ab.getContext().getContentResolver().call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "getDownloadedCount", null, null).getInt("data", 0);
    GMTrace.o(20096151977984L, 149728);
    return i;
  }
  
  public final ArrayList<EmojiInfo> aqI()
  {
    GMTrace.i(20096554631168L, 149731);
    if (((f)h.xv().wZ()).eR(""))
    {
      localObject = ((c)h.j(c.class)).getEmojiMgr().aqI();
      GMTrace.o(20096554631168L, 149731);
      return (ArrayList<EmojiInfo>)localObject;
    }
    if (this.ved.size() == 0)
    {
      localObject = ab.getContext().getContentResolver().call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "getAllCustomEmoji", "false", null);
      if (localObject != null)
      {
        ((Bundle)localObject).setClassLoader(EmojiInfo.class.getClassLoader());
        if (((Bundle)localObject).containsKey("data"))
        {
          localObject = ((Bundle)localObject).getParcelableArrayList("data");
          this.ved.addAll((Collection)localObject);
          w.i("MicroMsg.EmotionStorageResolver", "[getAllCustomEmojiExport] size:%s", new Object[] { Integer.valueOf(((List)localObject).size()) });
        }
      }
    }
    Object localObject = this.ved;
    GMTrace.o(20096554631168L, 149731);
    return (ArrayList<EmojiInfo>)localObject;
  }
  
  public final com.tencent.mm.ao.a.a aqJ()
  {
    GMTrace.i(20096823066624L, 149733);
    if (((f)h.xv().wZ()).eR(""))
    {
      localObject = ((c)h.j(c.class)).getEmojiMgr().aqJ();
      GMTrace.o(20096823066624L, 149733);
      return (com.tencent.mm.ao.a.a)localObject;
    }
    if (this.kAL == null)
    {
      localObject = new b.a(ab.getContext());
      ((b.a)localObject).gKq = new com.tencent.mm.view.d.a();
      this.kAL = new com.tencent.mm.ao.a.a(((b.a)localObject).Jm());
    }
    Object localObject = this.kAL;
    GMTrace.o(20096823066624L, 149733);
    return (com.tencent.mm.ao.a.a)localObject;
  }
  
  public final boolean aqK()
  {
    GMTrace.i(20098299461632L, 149744);
    if (((f)h.xv().wZ()).eR(""))
    {
      boolean bool = ((c)h.j(c.class)).getEmojiMgr().aqK();
      GMTrace.o(20098299461632L, 149744);
      return bool;
    }
    GMTrace.o(20098299461632L, 149744);
    return true;
  }
  
  public final EmojiInfo c(EmojiInfo paramEmojiInfo)
  {
    GMTrace.i(20097628372992L, 149739);
    if (((f)h.xv().wZ()).eR(""))
    {
      paramEmojiInfo = ((c)h.j(c.class)).getEmojiMgr().c(paramEmojiInfo);
      GMTrace.o(20097628372992L, 149739);
      return paramEmojiInfo;
    }
    Bundle localBundle = new Bundle(EmojiInfo.class.getClassLoader());
    localBundle.putParcelable("emoji", paramEmojiInfo);
    paramEmojiInfo = ab.getContext().getContentResolver().call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "getRamdomEmoji", null, localBundle);
    if (paramEmojiInfo == null)
    {
      w.e("MicroMsg.EmotionStorageResolver", "[getRamdomEmoji] bunndle is null! ");
      GMTrace.o(20097628372992L, 149739);
      return null;
    }
    paramEmojiInfo.setClassLoader(EmojiInfo.class.getClassLoader());
    if (paramEmojiInfo.containsKey("data"))
    {
      paramEmojiInfo = (EmojiInfo)paramEmojiInfo.getParcelable("data");
      GMTrace.o(20097628372992L, 149739);
      return paramEmojiInfo;
    }
    if (paramEmojiInfo == null) {}
    for (boolean bool = true;; bool = false)
    {
      w.e("MicroMsg.EmotionStorageResolver", "[getRamdomEmoji] bundle is null?", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(20097628372992L, 149739);
      return null;
    }
  }
  
  public final void f(j.a parama)
  {
    GMTrace.i(20096957284352L, 149734);
    if (((f)h.xv().wZ()).eR("")) {
      ((c)h.j(c.class)).getEmojiMgr().f(parama);
    }
    GMTrace.o(20096957284352L, 149734);
  }
  
  public final void g(j.a parama)
  {
    GMTrace.i(20097225719808L, 149736);
    if (((f)h.xv().wZ()).eR("")) {
      ((c)h.j(c.class)).getEmojiMgr().g(parama);
    }
    GMTrace.o(20097225719808L, 149736);
  }
  
  public final void h(j.a parama)
  {
    GMTrace.i(20097359937536L, 149737);
    if (((f)h.xv().wZ()).eR("")) {
      ((c)h.j(c.class)).getEmojiMgr().h(parama);
    }
    GMTrace.o(20097359937536L, 149737);
  }
  
  public final void i(j.a parama)
  {
    GMTrace.i(20097494155264L, 149738);
    if (((f)h.xv().wZ()).eR("")) {
      ((c)h.j(c.class)).getEmojiMgr().i(parama);
    }
    GMTrace.o(20097494155264L, 149738);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(20098165243904L, 149743);
    this.vef.clear();
    GMTrace.o(20098165243904L, 149743);
  }
  
  public final String vM(String paramString)
  {
    GMTrace.i(20095480889344L, 149723);
    if (((f)h.xv().wZ()).eR(""))
    {
      paramString = ((c)h.j(c.class)).getEmojiMgr().vM(paramString);
      GMTrace.o(20095480889344L, 149723);
      return paramString;
    }
    paramString = ab.getContext().getContentResolver().call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "getCurLangDesc", paramString, null).getString("data", "");
    GMTrace.o(20095480889344L, 149723);
    return paramString;
  }
  
  public final int vZ(String paramString)
  {
    GMTrace.i(20096017760256L, 149727);
    if (((f)h.xv().wZ()).eR(""))
    {
      i = ((c)h.j(c.class)).getEmojiMgr().vZ(paramString);
      GMTrace.o(20096017760256L, 149727);
      return i;
    }
    int i = ab.getContext().getContentResolver().call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "countProductId", paramString, null).getInt("data", 0);
    GMTrace.o(20096017760256L, 149727);
    return i;
  }
  
  public final ArrayList<EmojiInfo> wa(String paramString)
  {
    GMTrace.i(20096688848896L, 149732);
    if (((f)h.xv().wZ()).eR(""))
    {
      paramString = ((c)h.j(c.class)).getEmojiMgr().wa(paramString);
      GMTrace.o(20096688848896L, 149732);
      return paramString;
    }
    ArrayList localArrayList2 = (ArrayList)this.vee.get(paramString);
    ArrayList localArrayList1 = localArrayList2;
    if (localArrayList2 == null)
    {
      localArrayList1 = new ArrayList();
      this.vee.put(paramString, localArrayList1);
    }
    if (localArrayList1.size() == 0)
    {
      paramString = ab.getContext().getContentResolver().call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "getEmojiListByGroupId", paramString, null);
      if (paramString != null)
      {
        paramString.setClassLoader(EmojiInfo.class.getClassLoader());
        if (paramString.containsKey("data"))
        {
          paramString = paramString.getParcelableArrayList("data");
          localArrayList1.addAll(paramString);
          w.i("MicroMsg.EmotionStorageResolver", "[getEmojiListByGroupIdExport] size%s", new Object[] { Integer.valueOf(paramString.size()) });
        }
      }
    }
    GMTrace.o(20096688848896L, 149732);
    return localArrayList1;
  }
  
  public final String zo()
  {
    GMTrace.i(20097896808448L, 149741);
    if (((f)h.xv().wZ()).eR("")) {
      this.vec = ((c)h.j(c.class)).getEmojiMgr().zo();
    }
    for (;;)
    {
      String str = this.vec;
      GMTrace.o(20097896808448L, 149741);
      return str;
      if (bg.nm(this.vec)) {
        this.vec = ab.getContext().getContentResolver().call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/"), "getAccPath", null, null).getString("path");
      }
    }
  }
  
  public static final class a
  {
    public a()
    {
      GMTrace.i(20099373203456L, 149752);
      GMTrace.o(20099373203456L, 149752);
    }
  }
  
  public static final class b
  {
    public b()
    {
      GMTrace.i(20098567897088L, 149746);
      GMTrace.o(20098567897088L, 149746);
    }
    
    public static boolean Ae(int paramInt)
    {
      GMTrace.i(20098702114816L, 149747);
      Bundle localBundle = new Bundle();
      localBundle.putInt("key", paramInt);
      boolean bool = ab.getContext().getContentResolver().call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/userinfo/"), "ConfigStorage.getBoolean", null, localBundle).getBoolean("key", false);
      GMTrace.o(20098702114816L, 149747);
      return bool;
    }
    
    public static void Rr(String paramString)
    {
      GMTrace.i(20098970550272L, 149749);
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("type", Integer.valueOf(-29414086));
      localContentValues.put("value", paramString);
      ab.getContext().getContentResolver().update(Uri.parse("content://com.tencent.mm.storage.provider.emotion/userinfo/"), localContentValues, null, null);
      GMTrace.o(20098970550272L, 149749);
    }
    
    public static String aE(int paramInt, String paramString)
    {
      GMTrace.i(20098836332544L, 149748);
      Bundle localBundle = new Bundle();
      localBundle.putInt("key", paramInt);
      paramString = ab.getContext().getContentResolver().call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/userinfo/"), "ConfigStorage.getString", null, localBundle).getString("key", paramString);
      GMTrace.o(20098836332544L, 149748);
      return paramString;
    }
  }
  
  public static final class c
    extends com.tencent.mm.k.e
  {
    public c()
    {
      GMTrace.i(20099104768000L, 149750);
      GMTrace.o(20099104768000L, 149750);
    }
    
    public final void load()
    {
      try
      {
        GMTrace.i(20099238985728L, 149751);
        this.fSO = true;
        a.bOv();
        a.b localb = a.veh;
        i(a.b.aE(278529, null), false);
        a.bOv();
        localb = a.veh;
        i(a.b.aE(278530, null), false);
        GMTrace.o(20099238985728L, 149751);
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bq\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */