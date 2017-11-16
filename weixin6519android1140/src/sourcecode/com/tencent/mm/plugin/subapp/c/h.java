package com.tencent.mm.plugin.subapp.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.Map;
import junit.framework.Assert;

public final class h
{
  public static g Jx(String paramString)
  {
    GMTrace.i(5845584707584L, 43553);
    Object localObject2 = d.brE();
    Object localObject1 = null;
    String str = "SELECT filename, user, msgid, offset, filenowsize, totallen, status, createtime, lastmodifytime, clientid, voicelenght, msglocalid, human, voiceformat, nettimes, reserved1, reserved2" + " FROM VoiceRemindInfo WHERE filename= ?";
    localObject2 = ((k)localObject2).fTZ.a(str, new String[] { paramString }, 2);
    paramString = (String)localObject1;
    if (((Cursor)localObject2).moveToFirst())
    {
      paramString = new g();
      paramString.b((Cursor)localObject2);
    }
    ((Cursor)localObject2).close();
    GMTrace.o(5845584707584L, 43553);
    return paramString;
  }
  
  public static c Jy(String paramString)
  {
    GMTrace.i(5845987360768L, 43556);
    k localk = d.brE();
    paramString = aA(paramString, false);
    if (localk.qsE.get(paramString) == null) {
      localk.qsE.put(paramString, new c(paramString));
    }
    paramString = (c)localk.qsE.get(paramString);
    GMTrace.o(5845987360768L, 43556);
    return paramString;
  }
  
  static boolean a(g paramg)
  {
    GMTrace.i(5845853143040L, 43555);
    if (paramg == null)
    {
      GMTrace.o(5845853143040L, 43555);
      return false;
    }
    if (paramg.eQl == -1)
    {
      GMTrace.o(5845853143040L, 43555);
      return false;
    }
    k localk = d.brE();
    String str = paramg.field_filename;
    boolean bool;
    if (str.length() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (paramg == null) {
        break label106;
      }
      bool = true;
      label68:
      Assert.assertTrue(bool);
      paramg = paramg.qL();
      if (paramg.size() > 0) {
        break label111;
      }
      w.e("MicroMsg.VoiceRemindStorage", "update failed, no values set");
    }
    label106:
    label111:
    while (localk.fTZ.update("VoiceRemindInfo", paramg, "filename= ?", new String[] { str }) <= 0)
    {
      GMTrace.o(5845853143040L, 43555);
      return false;
      bool = false;
      break;
      bool = false;
      break label68;
    }
    localk.doNotify();
    GMTrace.o(5845853143040L, 43555);
    return true;
  }
  
  public static String aA(String paramString, boolean paramBoolean)
  {
    GMTrace.i(5845182054400L, 43550);
    at.AR();
    paramString = com.tencent.mm.sdk.platformtools.h.a(com.tencent.mm.y.c.yZ(), "recbiz_", paramString, ".rec", 2);
    if (bg.nm(paramString))
    {
      GMTrace.o(5845182054400L, 43550);
      return null;
    }
    if (paramBoolean)
    {
      GMTrace.o(5845182054400L, 43550);
      return paramString;
    }
    if (new File(paramString).exists())
    {
      GMTrace.o(5845182054400L, 43550);
      return paramString;
    }
    GMTrace.o(5845182054400L, 43550);
    return paramString;
  }
  
  static void mL(String paramString)
  {
    GMTrace.i(5845450489856L, 43552);
    d.brE().mL(aA(paramString, false));
    GMTrace.o(5845450489856L, 43552);
  }
  
  public static boolean mP(String paramString)
  {
    GMTrace.i(5845316272128L, 43551);
    if (paramString == null)
    {
      GMTrace.o(5845316272128L, 43551);
      return false;
    }
    g localg = Jx(paramString);
    if (localg == null)
    {
      w.d("MicroMsg.VoiceRemindLogic", "cancel null record : " + paramString);
      GMTrace.o(5845316272128L, 43551);
      return true;
    }
    w.d("MicroMsg.VoiceRemindLogic", "cancel record : " + paramString + " LocalId:" + localg.field_msglocalid);
    if (localg.field_msglocalid != 0)
    {
      at.AR();
      com.tencent.mm.y.c.yM().cN(localg.field_msglocalid);
    }
    if (paramString == null)
    {
      GMTrace.o(5845316272128L, 43551);
      return false;
    }
    d.brE().hB(paramString);
    mL(paramString);
    boolean bool = new File(aA(paramString, false)).delete();
    GMTrace.o(5845316272128L, 43551);
    return bool;
  }
  
  public static boolean mp(String paramString)
  {
    GMTrace.i(5845718925312L, 43554);
    if (paramString == null)
    {
      GMTrace.o(5845718925312L, 43554);
      return false;
    }
    g localg = Jx(paramString);
    if (localg == null)
    {
      w.e("MicroMsg.VoiceRemindLogic", "Set error failed file:" + paramString);
      GMTrace.o(5845718925312L, 43554);
      return false;
    }
    localg.field_status = 98;
    localg.field_lastmodifytime = (System.currentTimeMillis() / 1000L);
    localg.eQl = 320;
    boolean bool = a(localg);
    w.d("MicroMsg.VoiceRemindLogic", "setError file:" + paramString + " msgid:" + localg.field_msglocalid + " old stat:" + localg.field_status);
    if ((localg.field_msglocalid == 0) || (bg.nm(localg.field_user)))
    {
      w.e("MicroMsg.VoiceRemindLogic", "setError failed msg id:" + localg.field_msglocalid + " user:" + localg.field_user);
      GMTrace.o(5845718925312L, 43554);
      return bool;
    }
    at.AR();
    paramString = com.tencent.mm.y.c.yM().cM(localg.field_msglocalid);
    paramString.C(localg.field_msglocalid);
    paramString.dB(5);
    paramString.db(localg.field_user);
    paramString.setContent(f.b(localg.field_human, -1L, true));
    at.AR();
    com.tencent.mm.y.c.yM().a(paramString.field_msgId, paramString);
    GMTrace.o(5845718925312L, 43554);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\subapp\c\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */