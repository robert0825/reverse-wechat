package com.tencent.mm.af.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.af.x;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.protocal.c.ha;
import com.tencent.mm.protocal.c.us;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.as;
import com.tencent.mm.y.bc.a;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
{
  public static String fwv;
  public static final Object gyk;
  
  static
  {
    GMTrace.i(4568771461120L, 34040);
    fwv = null;
    gyk = new Object();
    GMTrace.o(4568771461120L, 34040);
  }
  
  public static String Br()
  {
    GMTrace.i(4566892412928L, 34026);
    synchronized (gyk)
    {
      String str = fwv;
      GMTrace.o(4566892412928L, 34026);
      return str;
    }
  }
  
  public static c a(c paramc, long paramLong)
  {
    GMTrace.i(4566355542016L, 34022);
    if (paramc == null) {}
    for (long l = -1L;; l = paramc.field_bizChatLocalId)
    {
      w.w("MicroMsg.BizChatInfoStorageLogic", "protectBizChatNotExist bizChatId:%s BizChatInfo:%s ", new Object[] { Long.valueOf(paramLong), Long.valueOf(l) });
      c localc = paramc;
      if (paramc == null)
      {
        paramc = new c();
        paramc.field_bizChatLocalId = paramLong;
        x.FI().b(paramc);
        localc = x.FI().t(paramLong);
      }
      GMTrace.o(4566355542016L, 34022);
      return localc;
    }
  }
  
  public static j a(j paramj, String paramString)
  {
    GMTrace.i(4566489759744L, 34023);
    if (paramj == null) {}
    for (Object localObject = Integer.valueOf(-1);; localObject = paramj.field_userId)
    {
      w.w("MicroMsg.BizChatInfoStorageLogic", "protectBizChatNotExist userId:%s BizChatUserInfo:%s ", new Object[] { paramString, localObject });
      localObject = paramj;
      if (paramj != null) {
        break;
      }
      j localj = new j();
      localj.field_userId = paramString;
      x.FK().b(localj);
      paramj = x.FK().bl(paramString);
      localObject = paramj;
      if (paramj != null) {
        break;
      }
      w.e("MicroMsg.BizChatInfoStorageLogic", "protectContactNotExist contact get from db is null!");
      GMTrace.o(4566489759744L, 34023);
      return localj;
    }
    GMTrace.o(4566489759744L, 34023);
    return (j)localObject;
  }
  
  public static boolean a(c paramc, String paramString1, String paramString2, us paramus)
  {
    GMTrace.i(4568368807936L, 34037);
    if ((paramString1 != null) && (!bg.nm(paramc.field_brandUserName))) {}
    for (;;)
    {
      int i;
      try
      {
        paramString1 = new JSONArray(paramString1);
        if ((paramString1.length() == 1) && (bg.nm(paramString2)))
        {
          paramString2 = paramString1.getJSONObject(0);
          paramus = paramString2.getString("id");
          paramString1 = x.FK().bl(paramus);
          if (paramString1 != null) {
            break label557;
          }
          paramString1 = new j();
          i = 1;
          paramString1.field_userId = paramus;
          paramString1.field_userName = paramString2.getString("nick_name");
          paramString1.field_headImageUrl = paramString2.getString("head_img_url");
          paramString1.field_profileUrl = paramString2.getString("profile_url");
          paramString1.field_UserVersion = paramString2.getInt("ver");
          if ((paramString1.field_brandUserName == null) || (paramString1.field_brandUserName.length() == 0))
          {
            paramString1.field_brandUserName = paramc.field_brandUserName;
            i = 1;
          }
          if ((paramString1.field_addMemberUrl == null) || (paramString1.field_addMemberUrl.length() == 0))
          {
            paramString1.field_addMemberUrl = paramc.field_addMemberUrl;
            i = 1;
          }
          if (!x.FK().b(paramString1)) {
            x.FK().a(paramString1);
          }
          if (i != 0) {
            x.FM().aa(paramString1.field_userId, paramString1.field_brandUserName);
          }
          paramString2 = new c();
          paramString2.field_bizChatServId = paramString1.field_userId;
          paramString2.field_brandUserName = paramString1.field_brandUserName;
          paramString2.field_chatName = paramString1.field_userName;
          paramString2.field_chatType = 1;
          paramString2 = e(paramString2);
          if (paramString2 != null)
          {
            paramc.field_bizChatLocalId = paramString2.field_bizChatLocalId;
            paramc.field_chatName = paramString1.field_userName;
            GMTrace.o(4568368807936L, 34037);
            return true;
          }
          GMTrace.o(4568368807936L, 34037);
          return false;
        }
        localLinkedList = new LinkedList();
        if (bg.nm(paramString2)) {
          break label563;
        }
        localObject = new ha();
        ((ha)localObject).tVV = paramString2;
        localLinkedList.add(localObject);
      }
      catch (JSONException paramc)
      {
        LinkedList localLinkedList;
        Object localObject;
        w.i("MicroMsg.BizChatInfoStorageLogic", "parse memberJson Exception:%s", new Object[] { paramc.getMessage() });
        w.printErrStackTrace("MicroMsg.BizChatInfoStorageLogic", paramc, "", new Object[0]);
      }
      if (i < paramString1.length())
      {
        paramString2 = new j();
        localObject = paramString1.getJSONObject(i);
        paramString2.field_userId = ((JSONObject)localObject).getString("id");
        paramString2.field_userName = ((JSONObject)localObject).getString("nick_name");
        paramString2.field_brandUserName = paramc.field_brandUserName;
        paramString2.field_headImageUrl = ((JSONObject)localObject).getString("head_img_url");
        paramString2.field_profileUrl = ((JSONObject)localObject).getString("profile_url");
        paramString2.field_UserVersion = ((JSONObject)localObject).getInt("ver");
        paramString2.field_addMemberUrl = paramc.field_addMemberUrl;
        if (!x.FK().b(paramString2)) {
          x.FK().a(paramString2);
        }
        localObject = new ha();
        ((ha)localObject).tVV = paramString2.field_userId;
        localLinkedList.add(localObject);
        i += 1;
      }
      else
      {
        paramus.tVW = localLinkedList;
        paramc.field_bizChatLocalId = -1L;
        GMTrace.o(4568368807936L, 34037);
        return true;
        GMTrace.o(4568368807936L, 34037);
        return false;
        label557:
        i = 0;
        continue;
        label563:
        i = 0;
      }
    }
  }
  
  public static int ah(long paramLong)
  {
    GMTrace.i(4565684453376L, 34017);
    List localList = ai(paramLong);
    if (localList != null)
    {
      int i = localList.size();
      GMTrace.o(4565684453376L, 34017);
      return i;
    }
    w.w("MicroMsg.BizChatInfoStorageLogic", "getMembersCountByBizChatId list == null");
    GMTrace.o(4565684453376L, 34017);
    return 0;
  }
  
  public static List<String> ai(long paramLong)
  {
    GMTrace.i(4565818671104L, 34018);
    List localList = x.FI().t(paramLong).FT();
    GMTrace.o(4565818671104L, 34018);
    return localList;
  }
  
  public static String aj(long paramLong)
  {
    GMTrace.i(4567563501568L, 34031);
    String str = x.FI().t(paramLong).field_bizChatServId;
    GMTrace.o(4567563501568L, 34031);
    return str;
  }
  
  public static String bk(String paramString)
  {
    GMTrace.i(4568100372480L, 34035);
    paramString = com.tencent.mm.api.a.bk(paramString);
    GMTrace.o(4568100372480L, 34035);
    return paramString;
  }
  
  public static boolean c(c paramc)
  {
    GMTrace.i(4565550235648L, 34016);
    if (paramc == null)
    {
      GMTrace.o(4565550235648L, 34016);
      return false;
    }
    List localList = paramc.FT();
    paramc = ((com.tencent.mm.api.g)com.tencent.mm.kernel.h.h(com.tencent.mm.api.g.class)).bm(paramc.field_brandUserName);
    if (paramc == null)
    {
      w.w("MicroMsg.BaseBizChatInfo", "bizchat myUserId is null");
      GMTrace.o(4565550235648L, 34016);
      return false;
    }
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext()) {
      if (paramc.equals((String)localIterator.next()))
      {
        GMTrace.o(4565550235648L, 34016);
        return true;
      }
    }
    w.w("MicroMsg.BaseBizChatInfo", "bizchat not in chatroom myUserId is %s", new Object[] { paramc });
    w.w("MicroMsg.BaseBizChatInfo", "bizchat not in chatroom memberlist is %s", new Object[] { Arrays.toString(localList.toArray()) });
    GMTrace.o(4565550235648L, 34016);
    return false;
  }
  
  public static String d(c paramc)
  {
    GMTrace.i(4567026630656L, 34027);
    if (paramc == null)
    {
      w.w("MicroMsg.BizChatInfoStorageLogic", "getMsgSource bizChatInfo=%s");
      GMTrace.o(4567026630656L, 34027);
      return null;
    }
    w.d("MicroMsg.BizChatInfoStorageLogic", "format msgSource");
    if (paramc.field_bizChatServId == null)
    {
      w.d("MicroMsg.BizChatInfoStorageLogic", "getMsgSource field_bizChatId=%s", new Object[] { paramc.field_bizChatServId });
      GMTrace.o(4567026630656L, 34027);
      return null;
    }
    j localj = ji(paramc.field_brandUserName);
    if ((localj == null) || (localj.field_userId == null))
    {
      w.d("MicroMsg.BizChatInfoStorageLogic", " bizChatMyUserInfo.field_userId is null getMsgSource field_bizChatId=%s", new Object[] { paramc.field_bizChatServId });
      GMTrace.o(4567026630656L, 34027);
      return null;
    }
    synchronized (gyk)
    {
      fwv = String.format("<msgsource><enterprise_info><qy_msg_type>%d</qy_msg_type><bizchat_id>%s</bizchat_id><bizchat_ver>%d</bizchat_ver><user_id>%s</user_id></enterprise_info></msgsource>", new Object[] { Integer.valueOf(1), paramc.field_bizChatServId, Integer.valueOf(paramc.field_chatVersion), localj.field_userId });
      w.d("MicroMsg.BizChatInfoStorageLogic", "send msgSource:%s", new Object[] { fwv });
      paramc = fwv;
      GMTrace.o(4567026630656L, 34027);
      return paramc;
    }
  }
  
  public static c e(c paramc)
  {
    GMTrace.i(4567295066112L, 34029);
    if (paramc.field_bizChatServId == null)
    {
      GMTrace.o(4567295066112L, 34029);
      return null;
    }
    c localc2 = x.FI().jd(paramc.field_bizChatServId);
    c localc1;
    if (localc2 != null)
    {
      if ((paramc.field_chatVersion <= localc2.field_chatVersion) && (!bg.nm(localc2.field_brandUserName))) {
        break label168;
      }
      if (!bg.nm(paramc.field_chatName)) {
        localc2.field_chatName = paramc.field_chatName;
      }
      localc2.field_brandUserName = paramc.field_brandUserName;
      localc2.field_needToUpdate = true;
      localc2.field_chatType = paramc.field_chatType;
      x.FI().b(localc2);
      localc1 = localc2;
      if (localc1.FV())
      {
        if (!localc1.FU()) {
          break label173;
        }
        x.FM().Y(localc1.field_bizChatServId, localc1.field_brandUserName);
      }
    }
    for (;;)
    {
      GMTrace.o(4567295066112L, 34029);
      return localc1;
      paramc.field_needToUpdate = true;
      localc1 = paramc;
      if (x.FI().a(paramc)) {
        break;
      }
      label168:
      localc1 = localc2;
      break;
      label173:
      x.FM().Z(localc1.field_bizChatServId, localc1.field_brandUserName);
    }
  }
  
  public static boolean f(c paramc)
  {
    GMTrace.i(4567429283840L, 34030);
    w.d("MicroMsg.BizChatInfoStorageLogic", "updateBizChatMember");
    if (paramc == null)
    {
      w.w("MicroMsg.BizChatInfoStorageLogic", "updateBizChatMember: bizChatInfo == null");
      GMTrace.o(4567429283840L, 34030);
      return false;
    }
    Object localObject = paramc.FT();
    if (localObject == null)
    {
      w.w("MicroMsg.BizChatInfoStorageLogic", "updateBizChatMember: list == null");
      GMTrace.o(4567429283840L, 34030);
      return false;
    }
    LinkedList localLinkedList = new LinkedList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      j localj = x.FK().bl(str);
      if ((localj != null) && (localj.FV())) {
        localLinkedList.add(str);
      }
    }
    if (localLinkedList.size() > 0)
    {
      x.FM().b(localLinkedList, paramc.field_brandUserName);
      GMTrace.o(4567429283840L, 34030);
      return true;
    }
    w.w("MicroMsg.BizChatInfoStorageLogic", "updateBizChatMember: no need to update");
    GMTrace.o(4567429283840L, 34030);
    return false;
  }
  
  public static void g(c paramc)
  {
    GMTrace.i(4568503025664L, 34038);
    if (paramc == null)
    {
      w.w("MicroMsg.BizChatInfoStorageLogic", "bizChatInfo is null");
      GMTrace.o(4568503025664L, 34038);
      return;
    }
    boolean bool1 = x.FJ().ae(paramc.field_bizChatLocalId);
    boolean bool2 = paramc.fN(16);
    w.d("MicroMsg.BizChatInfoStorageLogic", "convPlaceTop: %s ,bizChatPlaceTop: %s, chatName: %s ", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), paramc.field_chatName });
    if ((bool2) && (!bool1))
    {
      x.FJ().af(paramc.field_bizChatLocalId);
      GMTrace.o(4568503025664L, 34038);
      return;
    }
    if ((!bool2) && (bool1)) {
      x.FJ().ag(paramc.field_bizChatLocalId);
    }
    GMTrace.o(4568503025664L, 34038);
  }
  
  public static void h(c paramc)
  {
    GMTrace.i(4568637243392L, 34039);
    if (paramc == null)
    {
      w.w("MicroMsg.BizChatInfoStorageLogic", "updateBrandUserConvName bizChatInfo is null");
      GMTrace.o(4568637243392L, 34039);
      return;
    }
    ae localae = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TO(paramc.field_brandUserName);
    if (localae == null)
    {
      w.w("MicroMsg.BizChatInfoStorageLogic", "updateBrandUserConvName cvs is null");
      GMTrace.o(4568637243392L, 34039);
      return;
    }
    Object localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().Ca(paramc.field_brandUserName);
    Object localObject2 = ((com.tencent.mm.af.o)com.tencent.mm.kernel.h.h(com.tencent.mm.af.o.class)).yN().af(paramc.field_brandUserName, paramc.field_bizChatLocalId);
    if ((localObject1 != null) && (localObject2 != null) && (((ce)localObject1).field_msgId == ((ce)localObject2).field_msgId))
    {
      localObject2 = localae.field_digest;
      if (localObject2 != null)
      {
        int i = ((String)localObject2).indexOf(":");
        if (i != -1)
        {
          localObject1 = ((String)localObject2).substring(0, i);
          localObject2 = ((String)localObject2).substring(i + 1);
          if ((localObject1 != null) && (!((String)localObject1).equals(paramc.field_chatName)))
          {
            localae.cO(paramc.field_chatName + ":" + (String)localObject2);
            ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().a(localae, localae.field_username);
          }
        }
      }
    }
    GMTrace.o(4568637243392L, 34039);
  }
  
  public static boolean je(String paramString)
  {
    GMTrace.i(4565281800192L, 34014);
    if (paramString == null)
    {
      GMTrace.o(4565281800192L, 34014);
      return false;
    }
    if ((paramString.endsWith("@qy_u")) || (paramString.endsWith("@qy_g")))
    {
      GMTrace.o(4565281800192L, 34014);
      return true;
    }
    GMTrace.o(4565281800192L, 34014);
    return false;
  }
  
  public static boolean jf(String paramString)
  {
    GMTrace.i(4565416017920L, 34015);
    if (paramString == null)
    {
      w.i("MicroMsg.BizChatInfoStorageLogic", "isGroupChat chatId == null");
      GMTrace.o(4565416017920L, 34015);
      return false;
    }
    boolean bool = paramString.endsWith("@qy_g");
    GMTrace.o(4565416017920L, 34015);
    return bool;
  }
  
  public static String jg(String paramString)
  {
    GMTrace.i(4565952888832L, 34019);
    if (paramString == null)
    {
      w.w("MicroMsg.BizChatInfoStorageLogic", "getUserName bizChatId == null");
      GMTrace.o(4565952888832L, 34019);
      return null;
    }
    paramString = x.FK().bl(paramString);
    if (paramString != null)
    {
      paramString = paramString.field_userName;
      GMTrace.o(4565952888832L, 34019);
      return paramString;
    }
    w.i("MicroMsg.BizChatInfoStorageLogic", "getUserName userInfo == null");
    GMTrace.o(4565952888832L, 34019);
    return null;
  }
  
  public static String jh(String paramString)
  {
    GMTrace.i(4566221324288L, 34021);
    paramString = x.FK().bl(paramString);
    if (paramString != null)
    {
      paramString = paramString.field_headImageUrl;
      GMTrace.o(4566221324288L, 34021);
      return paramString;
    }
    GMTrace.o(4566221324288L, 34021);
    return null;
  }
  
  public static j ji(String paramString)
  {
    GMTrace.i(4566623977472L, 34024);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.BizChatInfoStorageLogic", "getBizChatMyUserInfo brandUserName==null");
      GMTrace.o(4566623977472L, 34024);
      return null;
    }
    paramString = x.FL().jn(paramString);
    if (paramString == null)
    {
      w.w("MicroMsg.BizChatInfoStorageLogic", "getBizChatMyUserInfo bizChatMyUserInfo==null");
      GMTrace.o(4566623977472L, 34024);
      return null;
    }
    paramString = x.FK().bl(paramString.field_userId);
    if (paramString == null) {
      w.w("MicroMsg.BizChatInfoStorageLogic", "getBizChatMyUserInfo bizChatUserInfo==null");
    }
    GMTrace.o(4566623977472L, 34024);
    return paramString;
  }
  
  public static String jj(String paramString)
  {
    GMTrace.i(4566758195200L, 34025);
    if (paramString == null)
    {
      w.w("MicroMsg.BizChatInfoStorageLogic", "getFormatMsgSource msgSource==null");
      GMTrace.o(4566758195200L, 34025);
      return null;
    }
    int i = paramString.indexOf("<enterprise_info>") + 17;
    int j = paramString.indexOf("</enterprise_info>");
    if ((i == -1) || (j == -1) || (i >= j))
    {
      w.w("MicroMsg.BizChatInfoStorageLogic", "getFormatMsgSource error start:%s,end:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      GMTrace.o(4566758195200L, 34025);
      return null;
    }
    String str = paramString.substring(i, j);
    paramString = paramString.replace(str, str.replace("<", "&lt;").replace(">", "&gt;"));
    GMTrace.o(4566758195200L, 34025);
    return paramString;
  }
  
  public static void jk(String paramString)
  {
    GMTrace.i(4567160848384L, 34028);
    synchronized (gyk)
    {
      fwv = paramString;
      GMTrace.o(4567160848384L, 34028);
      return;
    }
  }
  
  public static long jl(String paramString)
  {
    GMTrace.i(4567697719296L, 34032);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.BizChatInfoStorageLogic", "chatId == null");
      GMTrace.o(4567697719296L, 34032);
      return -1L;
    }
    paramString = x.FI().jd(paramString);
    if (paramString != null)
    {
      long l = paramString.field_bizChatLocalId;
      GMTrace.o(4567697719296L, 34032);
      return l;
    }
    w.w("MicroMsg.BizChatInfoStorageLogic", "bizChatInfo == null");
    GMTrace.o(4567697719296L, 34032);
    return -1L;
  }
  
  public static String jm(String paramString)
  {
    GMTrace.i(4568234590208L, 34036);
    String str = paramString;
    if (bg.nm(paramString)) {
      str = "tempUser";
    }
    paramString = new StringBuilder(com.tencent.mm.plugin.n.b.yV());
    paramString.append(com.tencent.mm.a.g.n(str.getBytes())).append("/");
    paramString.append("user/");
    paramString = paramString.toString();
    GMTrace.o(4568234590208L, 34036);
    return paramString;
  }
  
  public static void k(final String paramString1, String paramString2, final String paramString3)
  {
    GMTrace.i(4567966154752L, 34034);
    w.i("MicroMsg.BizChatInfoStorageLogic", "qy_chat_update %s, %s, %s", new Object[] { paramString1, paramString2, paramString3 });
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4582998540288L, 34146);
        c localc = x.FI().jd(this.gyo);
        if (localc == null)
        {
          GMTrace.o(4582998540288L, 34146);
          return;
        }
        if (localc.field_chatVersion < bg.getInt(paramString3, Integer.MAX_VALUE))
        {
          localc.field_needToUpdate = true;
          x.FI().b(localc);
        }
        if (localc.FU())
        {
          x.FM().Y(localc.field_bizChatServId, paramString1);
          GMTrace.o(4582998540288L, 34146);
          return;
        }
        x.FM().Z(localc.field_bizChatServId, paramString1);
        GMTrace.o(4582998540288L, 34146);
      }
    });
    GMTrace.o(4567966154752L, 34034);
  }
  
  public static void w(String paramString, final boolean paramBoolean)
  {
    GMTrace.i(4567831937024L, 34033);
    if (bg.nm(paramString))
    {
      w.d("MicroMsg.BizChatInfoStorageLogic", "delEnterpriseChatConvAndHeadImg, empty brandUserName");
      GMTrace.o(4567831937024L, 34033);
      return;
    }
    w.d("MicroMsg.BizChatInfoStorageLogic", "deleteMsgByTalkers");
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4564342276096L, 34007);
        Object localObject1 = x.FJ();
        Object localObject2 = this.gyl;
        Object localObject3 = new StringBuilder();
        ((StringBuilder)localObject3).append("delete from BizChatConversation");
        ((StringBuilder)localObject3).append(" where brandUserName = '").append((String)localObject2).append("' ");
        localObject3 = ((StringBuilder)localObject3).toString();
        boolean bool = ((b)localObject1).fTZ.eZ("BizChatConversation", (String)localObject3);
        w.i("MicroMsg.BizConversationStorage", "deleteByBrandUserName sql %s,%s", new Object[] { localObject3, Boolean.valueOf(bool) });
        Object localObject4;
        if (bool)
        {
          localObject3 = new a();
          localObject4 = new b.a.b();
          ((b.a.b)localObject4).gxY = -1L;
          ((b.a.b)localObject4).eEs = ((String)localObject2);
          ((b.a.b)localObject4).gxX = b.a.a.gxU;
          ((b.a.b)localObject4).gxZ = ((a)localObject3);
          ((b)localObject1).gvy.bI(localObject4);
          ((b)localObject1).gvy.doNotify();
        }
        ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TN(this.gyl);
        localObject1 = x.FI();
        localObject2 = this.gyl;
        localObject3 = new StringBuilder();
        ((StringBuilder)localObject3).append("delete from BizChatInfo");
        ((StringBuilder)localObject3).append(" where brandUserName = '").append((String)localObject2).append("' ");
        localObject3 = ((StringBuilder)localObject3).toString();
        bool = ((d)localObject1).fTZ.eZ("BizChatInfo", (String)localObject3);
        w.i("MicroMsg.BizChatInfoStorage", "deleteByBrandUserName sql %s,%s", new Object[] { localObject3, Boolean.valueOf(bool) });
        if (bool)
        {
          localObject3 = new c();
          localObject4 = new d.a.b();
          ((d.a.b)localObject4).gxY = -1L;
          ((d.a.b)localObject4).eEs = ((String)localObject2);
          ((d.a.b)localObject4).gyi = d.a.a.gyf;
          ((d.a.b)localObject4).gyj = ((c)localObject3);
          ((d)localObject1).gvy.bI(localObject4);
          ((d)localObject1).gvy.doNotify();
        }
        com.tencent.mm.a.e.f(new File(e.bk(this.gyl)));
        if (paramBoolean)
        {
          localObject1 = x.FK();
          localObject2 = this.gyl;
          localObject3 = new StringBuilder();
          ((StringBuilder)localObject3).append("delete from BizChatUserInfo");
          ((StringBuilder)localObject3).append(" where brandUserName = '").append((String)localObject2).append("' ");
          localObject2 = ((StringBuilder)localObject3).toString();
          bool = ((k)localObject1).fTZ.eZ("BizChatUserInfo", (String)localObject2);
          w.i("MicroMsg.BizChatUserInfoStorage", "deleteByBrandUserName sql %s,%s", new Object[] { localObject2, Boolean.valueOf(bool) });
          if (bool)
          {
            localObject2 = new j();
            localObject3 = new k.a.b();
            ((k.a.b)localObject3).gyK = k.a.a.gyH;
            ((k.a.b)localObject3).gyL = ((j)localObject2);
            ((k)localObject1).gvy.bI(localObject3);
            ((k)localObject1).gvy.doNotify();
          }
          x.FL().jo(this.gyl);
          com.tencent.mm.a.e.f(new File(e.jm(this.gyl)));
        }
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(4556960301056L, 33952);
            if (e.1.this.gmq != null) {
              e.1.this.gmq.Bk();
            }
            GMTrace.o(4556960301056L, 33952);
          }
        });
        GMTrace.o(4564342276096L, 34007);
      }
      
      public final String toString()
      {
        GMTrace.i(4564476493824L, 34008);
        String str = super.toString() + "|deleteMsgByTalkers";
        GMTrace.o(4564476493824L, 34008);
        return str;
      }
    });
    GMTrace.o(4567831937024L, 34033);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */