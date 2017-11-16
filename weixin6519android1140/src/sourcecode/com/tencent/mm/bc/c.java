package com.tencent.mm.bc;

import android.content.Context;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.kh;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.storage.au.d;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.List;

public final class c
  extends i<b>
  implements j.a
{
  public static final String[] fTX;
  private static final String[] gZJ;
  private final int etz;
  public e fTZ;
  private Runnable gZK;
  protected Context mContext;
  
  static
  {
    GMTrace.i(1412775804928L, 10526);
    fTX = new String[] { i.a(b.fTp, "fmessage_conversation") };
    gZJ = new String[] { "CREATE INDEX IF NOT EXISTS  fmessageConversationTalkerIndex ON fmessage_conversation ( talker )", "CREATE INDEX IF NOT EXISTS  fmconversation_isnew_Index ON fmessage_conversation ( isNew )" };
    GMTrace.o(1412775804928L, 10526);
  }
  
  public c(e parame)
  {
    super(parame, b.fTp, "fmessage_conversation", gZJ);
    GMTrace.i(1411030974464L, 10513);
    this.mContext = null;
    this.etz = 1;
    this.gZK = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1413446893568L, 10531);
        int i = c.this.Mz();
        w.v("MicroMsg.FMessageConversationStorage", "onNotifyChange, newCount update to = %d", new Object[] { Integer.valueOf(i) });
        at.AR();
        com.tencent.mm.y.c.xh().set(143618, Integer.valueOf(i));
        GMTrace.o(1413446893568L, 10531);
      }
    };
    this.fTZ = parame;
    this.mContext = ab.getContext();
    GMTrace.o(1411030974464L, 10513);
  }
  
  public final boolean J(String paramString, int paramInt)
  {
    GMTrace.i(1411433627648L, 10516);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.w("MicroMsg.FMessageConversationStorage", "updateState fail, talker is null");
      GMTrace.o(1411433627648L, 10516);
      return false;
    }
    b localb = lL(paramString);
    if (localb == null)
    {
      w.w("MicroMsg.FMessageConversationStorage", "updateState fail, get fail, talker = " + paramString);
      GMTrace.o(1411433627648L, 10516);
      return false;
    }
    if (paramInt == localb.field_state)
    {
      w.d("MicroMsg.FMessageConversationStorage", "updateState, no need to update");
      GMTrace.o(1411433627648L, 10516);
      return true;
    }
    localb.field_state = paramInt;
    localb.field_lastModifiedTime = System.currentTimeMillis();
    if (super.c(localb, new String[0]))
    {
      SS(paramString);
      GMTrace.o(1411433627648L, 10516);
      return true;
    }
    GMTrace.o(1411433627648L, 10516);
    return false;
  }
  
  public final List<String> MA()
  {
    GMTrace.i(1411836280832L, 10519);
    Object localObject = String.format("select %s from %s where isNew = 1 ORDER BY lastModifiedTime DESC limit %d", new Object[] { "contentNickname", "fmessage_conversation", Integer.valueOf(2) });
    localObject = this.fTZ.a((String)localObject, null, 2);
    ArrayList localArrayList = new ArrayList();
    while (((Cursor)localObject).moveToNext()) {
      localArrayList.add(((Cursor)localObject).getString(((Cursor)localObject).getColumnIndex("contentNickname")));
    }
    ((Cursor)localObject).close();
    GMTrace.o(1411836280832L, 10519);
    return localArrayList;
  }
  
  public final void MB()
  {
    GMTrace.i(1412507369472L, 10524);
    af.F(this.gZK);
    af.i(this.gZK, 500L);
    GMTrace.o(1412507369472L, 10524);
  }
  
  public final Cursor Mx()
  {
    GMTrace.i(1411165192192L, 10514);
    Cursor localCursor = this.fTZ.rawQuery("select * from fmessage_conversation  ORDER BY lastModifiedTime DESC", null);
    GMTrace.o(1411165192192L, 10514);
    return localCursor;
  }
  
  public final boolean My()
  {
    GMTrace.i(1411567845376L, 10517);
    if (this.fTZ.eZ("fmessage_conversation", "update fmessage_conversation set isNew = 0"))
    {
      w.d("MicroMsg.FMessageConversationStorage", "clearAllNew success");
      doNotify();
      GMTrace.o(1411567845376L, 10517);
      return true;
    }
    w.e("MicroMsg.FMessageConversationStorage", "clearAllNew fail");
    GMTrace.o(1411567845376L, 10517);
    return false;
  }
  
  public final int Mz()
  {
    int i = 0;
    GMTrace.i(1411702063104L, 10518);
    Object localObject = String.format("select count(*) from %s where %s = 1 and %s < 2", new Object[] { "fmessage_conversation", "isNew", "fmsgIsSend" });
    localObject = this.fTZ.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst()) {
      i = ((Cursor)localObject).getInt(0);
    }
    ((Cursor)localObject).close();
    w.d("MicroMsg.FMessageConversationStorage", "getNewCount = " + i);
    GMTrace.o(1411702063104L, 10518);
    return i;
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    GMTrace.i(1412373151744L, 10523);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.FMessageConversationStorage", "onNotifyChange, id is null");
      GMTrace.o(1412373151744L, 10523);
      return;
    }
    long l1 = 0L;
    try
    {
      long l2 = bg.getLong(paramString, 0L);
      l1 = l2;
    }
    catch (Exception paraml)
    {
      for (;;)
      {
        w.w("MicroMsg.FMessageConversationStorage", "onNotifyChange, id = " + paramString + ", ex = " + paraml.getMessage());
      }
      if (h.xw().wL()) {
        break label143;
      }
      w.e("MicroMsg.FMessageConversationStorage", "onNotifyChange, account not ready, can not insert fmessageconversation");
      GMTrace.o(1412373151744L, 10523);
      return;
      paraml = new f();
      if (l.MK().b(l1, paraml)) {
        break label196;
      }
      w.w("MicroMsg.FMessageConversationStorage", "onNotifyChange, get fail, id = " + l1);
      GMTrace.o(1412373151744L, 10523);
      return;
      w.d("MicroMsg.FMessageConversationStorage", "onNotifyChange succ, sysRowId = " + l1);
      paramString = l.ML().lL(paraml.field_talker);
      if (paramString != null) {
        break label668;
      }
    }
    if (l1 == 0L)
    {
      w.w("MicroMsg.FMessageConversationStorage", "onNotifyChange fail, sysRowId is invalid");
      GMTrace.o(1412373151744L, 10523);
      return;
    }
    label143:
    label196:
    w.i("MicroMsg.FMessageConversationStorage", "onNotifyChange, fmessage conversation does not exist, insert a new one, talker = " + paraml.field_talker);
    if (bg.nm(paraml.field_talker))
    {
      w.i("MicroMsg.FMessageConversationStorage", "onNotifyChange, fmessage info talker is null, quit insert fmessage conversation.");
      GMTrace.o(1412373151744L, 10523);
      return;
    }
    paramString = new b();
    Object localObject;
    if (paraml.field_type == 0)
    {
      localObject = au.a.Uh(paraml.field_msgContent);
      paramString.field_displayName = ((au.a)localObject).getDisplayName();
      if ((((au.a)localObject).scene == 4) && (((au.a)localObject).bUd() != null)) {
        paramString.field_displayName = ((au.a)localObject).bUd();
      }
      paramString.field_addScene = ((au.a)localObject).scene;
      paramString.field_isNew = 1;
      paramString.field_contentFromUsername = ((au.a)localObject).rAP;
      paramString.field_contentNickname = ((au.a)localObject).eCQ;
      paramString.field_contentPhoneNumMD5 = ((au.a)localObject).vBs;
      paramString.field_contentFullPhoneNumMD5 = ((au.a)localObject).vBt;
      w.i("MicroMsg.FMessageConversationStorage", "push, new friend Username: " + paramString.field_contentFromUsername + "new friend Nickname: " + paramString.field_contentNickname);
      paramString.field_lastModifiedTime = System.currentTimeMillis();
      paramString.field_state = 0;
      paramString.field_talker = paraml.field_talker;
      paramString.field_encryptTalker = paraml.field_encryptTalker;
      paramString.field_fmsgSysRowId = l1;
      paramString.field_fmsgIsSend = paraml.field_isSend;
      paramString.field_fmsgType = paraml.field_type;
      paramString.field_fmsgContent = paraml.field_msgContent;
      if (!paraml.MC()) {
        break label663;
      }
    }
    label663:
    for (int i = paraml.field_type;; i = 0)
    {
      paramString.field_recvFmsgType = i;
      w.i("MicroMsg.FMessageConversationStorage", "field_fmsgContent: " + paramString.field_fmsgContent);
      l.ML().b(paramString);
      MB();
      GMTrace.o(1412373151744L, 10523);
      return;
      if (!paraml.MC()) {
        break;
      }
      localObject = au.d.Uk(paraml.field_msgContent);
      paramString.field_displayName = ((au.d)localObject).getDisplayName();
      paramString.field_addScene = ((au.d)localObject).scene;
      paramString.field_isNew = 1;
      paramString.field_contentFromUsername = ((au.d)localObject).rAP;
      paramString.field_contentNickname = ((au.d)localObject).eCQ;
      paramString.field_contentVerifyContent = ((au.d)localObject).content;
      w.i("MicroMsg.FMessageConversationStorage", "receive, new friend Username: " + paramString.field_contentFromUsername + "new friend Nickname: " + paramString.field_contentNickname);
      break;
    }
    label668:
    w.d("MicroMsg.FMessageConversationStorage", "onNotifyChange, fmessage conversation has existed, talker = " + paraml.field_talker);
    if (paraml.MC()) {
      paramString.field_isNew = 1;
    }
    paramString.field_lastModifiedTime = System.currentTimeMillis();
    paramString.field_encryptTalker = paraml.field_encryptTalker;
    paramString.field_fmsgSysRowId = l1;
    paramString.field_fmsgIsSend = paraml.field_isSend;
    paramString.field_fmsgType = paraml.field_type;
    paramString.field_fmsgContent = paraml.field_msgContent;
    if (paraml.MC())
    {
      paramString.field_recvFmsgType = paraml.field_type;
      w.i("MicroMsg.FMessageConversationStorage", "field_recvFmsgType: " + paramString.field_recvFmsgType);
    }
    if (paraml.field_type == 0)
    {
      paraml = au.a.Uh(paraml.field_msgContent);
      paramString.field_contentFromUsername = paraml.rAP;
      paramString.field_contentNickname = paraml.eCQ;
      paramString.field_contentPhoneNumMD5 = paraml.vBs;
      paramString.field_contentFullPhoneNumMD5 = paraml.vBt;
      w.i("MicroMsg.FMessageConversationStorage", "TYPE_SYSTEM_PUSH, new friend Username: " + paramString.field_contentFromUsername + "new friend Nickname: " + paramString.field_contentNickname);
    }
    label1083:
    for (;;)
    {
      l.ML().c(paramString, new String[0]);
      if (Mz() != 0) {
        break;
      }
      at.AR();
      com.tencent.mm.y.c.xh().set(340225, Long.valueOf(System.currentTimeMillis()));
      break;
      if (paraml.MC())
      {
        if (paraml.field_isSend >= 2) {}
        for (i = 1;; i = 0)
        {
          if (i != 0) {
            break label1083;
          }
          paraml = au.d.Uk(paraml.field_msgContent);
          paramString.field_contentVerifyContent = paraml.content;
          paramString.field_contentFromUsername = paraml.rAP;
          paramString.field_contentNickname = paraml.eCQ;
          w.i("MicroMsg.FMessageConversationStorage", "field_contentVerifyContent: " + paramString.field_contentVerifyContent + " receive, new friend Username: " + paramString.field_contentFromUsername + " new friend Nickname: " + paramString.field_contentNickname);
          paraml = paramString.field_contentFromUsername;
          localObject = paramString.field_contentNickname;
          kh localkh = new kh();
          localkh.eOz.userName = paraml;
          localkh.eOz.aDn = ((String)localObject);
          localkh.eOz.type = 1;
          com.tencent.mm.sdk.b.a.vgX.m(localkh);
          break;
        }
      }
    }
  }
  
  public final boolean d(long paramLong, String paramString)
  {
    GMTrace.i(17613929316352L, 131234);
    w.i("MicroMsg.FMessageConversationStorage", "deleteByTalker rowId: %d, talker: %s", new Object[] { Long.valueOf(paramLong), paramString });
    if (bg.nm(paramString)) {
      if (paramLong <= 0L) {}
    }
    for (String str = "delete from fmessage_conversation where fmsgSysRowId = '" + paramLong + "'"; this.fTZ.eZ("fmessage_conversation", str); str = "delete from fmessage_conversation where talker = '" + bg.nk(paramString) + "'")
    {
      w.i("MicroMsg.FMessageConversationStorage", "deleteByTalker success, rowId: %d, talker: %s", new Object[] { Long.valueOf(paramLong), paramString });
      SS(paramString);
      GMTrace.o(17613929316352L, 131234);
      return true;
      GMTrace.o(17613929316352L, 131234);
      return false;
    }
    GMTrace.o(17613929316352L, 131234);
    return false;
  }
  
  public final int getCount()
  {
    int i = 0;
    GMTrace.i(1411299409920L, 10515);
    Cursor localCursor = this.fTZ.a("select count(*) from fmessage_conversation", null, 2);
    if (localCursor.moveToFirst()) {
      i = localCursor.getInt(0);
    }
    localCursor.close();
    w.d("MicroMsg.FMessageConversationStorage", "getCount = " + i);
    GMTrace.o(1411299409920L, 10515);
    return i;
  }
  
  public final boolean lK(String paramString)
  {
    GMTrace.i(1411970498560L, 10520);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.w("MicroMsg.FMessageConversationStorage", "unsetNew fail, talker is null");
      GMTrace.o(1411970498560L, 10520);
      return false;
    }
    b localb = lL(paramString);
    if ((localb == null) || (!paramString.equals(localb.field_talker)))
    {
      w.w("MicroMsg.FMessageConversationStorage", "unsetNew fail, conversation does not exist, talker = " + paramString);
      GMTrace.o(1411970498560L, 10520);
      return false;
    }
    localb.field_isNew = 0;
    boolean bool = super.c(localb, new String[0]);
    GMTrace.o(1411970498560L, 10520);
    return bool;
  }
  
  public final b lL(String paramString)
  {
    GMTrace.i(1412104716288L, 10521);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.w("MicroMsg.FMessageConversationStorage", "get fail, talker is null");
      GMTrace.o(1412104716288L, 10521);
      return null;
    }
    b localb = new b();
    localb.field_talker = paramString;
    if (super.b(localb, new String[0]))
    {
      GMTrace.o(1412104716288L, 10521);
      return localb;
    }
    w.i("MicroMsg.FMessageConversationStorage", "get fail, maybe not exist, talker = " + paramString);
    GMTrace.o(1412104716288L, 10521);
    return null;
  }
  
  public final b lM(String paramString)
  {
    Object localObject = null;
    GMTrace.i(1412238934016L, 10522);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.w("MicroMsg.FMessageConversationStorage", "get fail, encryptTalker is null");
      GMTrace.o(1412238934016L, 10522);
      return null;
    }
    paramString = "select * from fmessage_conversation  where encryptTalker=" + com.tencent.mm.bu.g.ej(paramString);
    Cursor localCursor = this.fTZ.a(paramString, null, 2);
    paramString = (String)localObject;
    if (localCursor.moveToFirst())
    {
      paramString = new b();
      paramString.b(localCursor);
    }
    localCursor.close();
    GMTrace.o(1412238934016L, 10522);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bc\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */