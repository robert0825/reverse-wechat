package com.tencent.mm.booter.notification;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.support.v4.app.y.d;
import android.support.v4.app.y.g;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.booter.notification.a.e;
import com.tencent.mm.booter.notification.a.g;
import com.tencent.mm.booter.notification.a.h;
import com.tencent.mm.g.a.iq;
import com.tencent.mm.g.a.iq.b;
import com.tencent.mm.g.a.w.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.k.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.l;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c
  extends a
{
  public static String fKx;
  public static String fKy;
  public static String fKz;
  g etD;
  Context mContext;
  
  static
  {
    GMTrace.i(508282535936L, 3787);
    fKx = "com.tencent.preference.notification.key.unread.msg";
    fKy = "com.tencent.preference.notification.key.unread.talker";
    fKz = "com.tencent.preference.notification.key.all.notified.msgid";
    GMTrace.o(508282535936L, 3787);
  }
  
  public c()
  {
    GMTrace.i(506135052288L, 3771);
    this.mContext = ab.getContext();
    this.etD = new g(this.mContext);
    GMTrace.o(506135052288L, 3771);
  }
  
  public static void J(long paramLong)
  {
    GMTrace.i(507745665024L, 3783);
    if (paramLong == 0L)
    {
      GMTrace.o(507745665024L, 3783);
      return;
    }
    String str2 = rF();
    String str1 = str2;
    if (str2.length() > 3000) {
      str1 = str2.substring(str2.length() / 2, str2.length());
    }
    if (K(paramLong))
    {
      GMTrace.o(507745665024L, 3783);
      return;
    }
    str1 = str1 + paramLong + "%";
    f.tI().edit().putString(fKz, str1).apply();
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.Notification.AppMsg.Handle", "setNotifiedMsgId: %s", new Object[] { str1 });
    GMTrace.o(507745665024L, 3783);
  }
  
  private static boolean K(long paramLong)
  {
    GMTrace.i(507879882752L, 3784);
    if (paramLong == 0L)
    {
      GMTrace.o(507879882752L, 3784);
      return false;
    }
    String str = rF();
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.Notification.AppMsg.Handle", "isAlreadyNotified: %s, msgId: %d", new Object[] { str, Long.valueOf(paramLong) });
    if (str.contains(paramLong + "%"))
    {
      GMTrace.o(507879882752L, 3784);
      return true;
    }
    GMTrace.o(507879882752L, 3784);
    return false;
  }
  
  private static a a(List<a> paramList, String paramString)
  {
    GMTrace.i(507074576384L, 3778);
    if ((paramList == null) || (paramString == null))
    {
      GMTrace.o(507074576384L, 3778);
      return null;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      a locala = (a)paramList.next();
      if (locala.userName.equals(paramString))
      {
        GMTrace.o(507074576384L, 3778);
        return locala;
      }
    }
    GMTrace.o(507074576384L, 3778);
    return null;
  }
  
  public static boolean a(String paramString, au paramau, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(506403487744L, 3773);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.Notification.AppMsg.Handle", "preNotificationCheck, talker: %s, tipsFlag: %s ", new Object[] { paramString, Integer.valueOf(paramInt) });
    if (!at.AU())
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Notification.AppMsg.Handle", "[FALSE](MMCore.accHasReady())preNotificationCheck, talker: %s, tipsFlag: %s ", new Object[] { paramString, Integer.valueOf(paramInt) });
      GMTrace.o(506403487744L, 3773);
      return false;
    }
    if ((paramau != null) && (K(paramau.field_msgSvrId)) && (!paramBoolean))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Notification.AppMsg.Handle", "[FALSE](msgInfo != null && NotificationQueueManager.getImpl().isAlreadyNotify(msgInfo.getMsgSvrId()), msgId: %d", new Object[] { Long.valueOf(paramau.field_msgSvrId) });
      GMTrace.o(506403487744L, 3773);
      return false;
    }
    if ((paramInt & 0x1) == 0)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Notification.AppMsg.Handle", "[FALSE](tipsFlag & ConstantsProtocal.TEXT_NOTIFY_SVR_FLAG) == 0)preNotificationCheck, talker: %s, tipsFlag: %s ", new Object[] { paramString, Integer.valueOf(paramInt) });
      GMTrace.o(506403487744L, 3773);
      return false;
    }
    at.AR();
    if ((com.tencent.mm.y.c.yF()) && (!q.fo(q.zK())))
    {
      at.AR();
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Notification.AppMsg.Handle", "[NO NOTIFICATION](MMCore.getAccStg().isWebWXOnline() && !ConfigStorageLogic.isWebWXNotificationOpen())preNotificationCheck, talker: %s, tipsFlag: %s isWebWXOnline: %B,isWebWXNotificationOpen: %B ", new Object[] { paramString, Integer.valueOf(paramInt), Boolean.valueOf(com.tencent.mm.y.c.yF()), Boolean.valueOf(q.fo(q.zK())) });
      GMTrace.o(506403487744L, 3773);
      return false;
    }
    if (s.fy(paramString))
    {
      paramau = new iq();
      paramau.eMd.eHz = 3;
      com.tencent.mm.sdk.b.a.vgX.m(paramau);
      if (!paramau.eMe.eDb)
      {
        paramau = new iq();
        paramau.eMd.eHz = 1;
        paramau.eMd.eMf = paramString;
        paramau.eMd.eMg = 3;
        com.tencent.mm.sdk.b.a.vgX.m(paramau);
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Notification.AppMsg.Handle", "[NO NOTIFICATION](ContactStorageLogic.isLbsRoom(talker))preNotificationCheck, talker: %s, tipsFlag: %s ", new Object[] { paramString, Integer.valueOf(paramInt) });
      GMTrace.o(506403487744L, 3773);
      return false;
    }
    if ((s.gr(paramString)) || ((s.eb(paramString)) && (!s.gq(paramString)) && (paramau != null) && (!paramau.Ug(q.zE())) && (paramau.field_type != 64) && (paramau != null) && (!paramau.bTX())))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Notification.AppMsg.Handle", "[NO NOTIFICATION](ContactStorageLogic.isMuteContact(talker) || (ContactStorageLogic.isChatRoom(talker) && !ContactStorageLogic.isChatRoomNotify(talker) && !msgInfo.isAtSomeone(ConfigStorageLogic.getUsernameFromUserInfo() && msgInfo.getType() != ConstantsProtocal.MM_DATA_MULTITALK)) && (msgInfo != null && !msgInfo.isChatRoomNotice(ConfigStorageLogic.getUsernameFromUserInfo())) )preNotificationCheck, talker: %s, tipsFlag: %s ", new Object[] { paramString, Integer.valueOf(paramInt) });
      GMTrace.o(506403487744L, 3773);
      return false;
    }
    GMTrace.o(506403487744L, 3773);
    return true;
  }
  
  public static void d(ArrayList<a> paramArrayList)
  {
    GMTrace.i(507477229568L, 3781);
    if (paramArrayList == null)
    {
      f.tI().edit().putString(fKy, "").apply();
      if (paramArrayList != null) {
        break label149;
      }
    }
    label149:
    for (paramArrayList = "null";; paramArrayList = paramArrayList.toString())
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Notification.AppMsg.Handle", "saveTotalUnreadTalker %s", new Object[] { paramArrayList });
      GMTrace.o(507477229568L, 3781);
      return;
      try
      {
        ArrayList localArrayList = new ArrayList(paramArrayList);
        f.tI().edit().putString(fKy, com.tencent.mm.booter.notification.queue.c.a(localArrayList)).apply();
      }
      catch (IOException localIOException)
      {
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.Notification.AppMsg.Handle", localIOException, "", new Object[0]);
        f.tI().edit().putString(fKy, "").apply();
      }
      break;
    }
  }
  
  public static void dW(int paramInt)
  {
    GMTrace.i(507611447296L, 3782);
    paramInt = Math.max(0, paramInt);
    f.tI().edit().putInt(fKx, paramInt).apply();
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Notification.AppMsg.Handle", "saveTotalUnreadMsg %d", new Object[] { Integer.valueOf(paramInt) });
    GMTrace.o(507611447296L, 3782);
  }
  
  public static void rB()
  {
    GMTrace.i(508148318208L, 3786);
    f.tI().edit().putString(fKz, "").apply();
    GMTrace.o(508148318208L, 3786);
  }
  
  static Notification rC()
  {
    GMTrace.i(506269270016L, 3772);
    Notification localNotification = new Notification();
    localNotification.icon = R.g.icon;
    localNotification.ledARGB = -16711936;
    localNotification.ledOnMS = 300;
    localNotification.ledOffMS = 1000;
    GMTrace.o(506269270016L, 3772);
    return localNotification;
  }
  
  private static int rD()
  {
    GMTrace.i(507208794112L, 3779);
    int i = f.tI().getInt(fKx, 0);
    GMTrace.o(507208794112L, 3779);
    return i;
  }
  
  public static ArrayList<a> rE()
  {
    GMTrace.i(507343011840L, 3780);
    try
    {
      ArrayList localArrayList1 = (ArrayList)com.tencent.mm.booter.notification.queue.c.dz(f.tI().getString(fKy, ""));
      if (localArrayList1 == null)
      {
        localArrayList1 = new ArrayList();
        GMTrace.o(507343011840L, 3780);
        return localArrayList1;
      }
      GMTrace.o(507343011840L, 3780);
      return localArrayList1;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.Notification.AppMsg.Handle", localClassNotFoundException, "", new Object[0]);
      ArrayList localArrayList2 = new ArrayList();
      GMTrace.o(507343011840L, 3780);
      return localArrayList2;
    }
    catch (IOException localIOException)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.Notification.AppMsg.Handle", localIOException, "", new Object[0]);
      ArrayList localArrayList3 = new ArrayList();
      GMTrace.o(507343011840L, 3780);
      return localArrayList3;
    }
  }
  
  private static String rF()
  {
    GMTrace.i(508014100480L, 3785);
    String str = f.tI().getString(fKz, "");
    GMTrace.o(508014100480L, 3785);
    return str;
  }
  
  public final int a(NotificationItem paramNotificationItem, g paramg)
  {
    GMTrace.i(506537705472L, 3774);
    if ((!l.cR(this.mContext)) && (Build.VERSION.SDK_INT >= 16) && (paramNotificationItem != null) && (paramNotificationItem.rC != null))
    {
      paramNotificationItem.rC.priority = 1;
      if (!f.tJ())
      {
        paramNotificationItem.rC.vibrate = new long[0];
        if ((!paramg.fLG) && (!paramg.fLF)) {
          paramNotificationItem.rC.priority = 0;
        }
      }
    }
    int i = super.a(paramNotificationItem, paramg);
    GMTrace.o(506537705472L, 3774);
    return i;
  }
  
  @TargetApi(21)
  public final Notification a(Notification paramNotification, int paramInt1, int paramInt2, PendingIntent paramPendingIntent1, String paramString1, String paramString2, String paramString3, Bitmap paramBitmap, int paramInt3, String paramString4, PendingIntent paramPendingIntent2, int paramInt4, String paramString5, PendingIntent paramPendingIntent3, String paramString6)
  {
    GMTrace.i(506806140928L, 3776);
    Object localObject = paramNotification;
    int i;
    Notification localNotification;
    int j;
    if (Build.VERSION.SDK_INT >= 11)
    {
      localObject = new y.d(this.mContext);
      i = paramInt1;
      if (paramInt1 == -1) {
        i = com.tencent.mm.bi.a.bIN();
      }
      ((y.d)localObject).rC.ledARGB = -16711936;
      ((y.d)localObject).rC.ledOnMS = 300;
      ((y.d)localObject).rC.ledOffMS = 1000;
      if ((((y.d)localObject).rC.ledOnMS == 0) || (((y.d)localObject).rC.ledOffMS == 0)) {
        break label426;
      }
      paramInt1 = 1;
      localNotification = ((y.d)localObject).rC;
      j = ((y.d)localObject).rC.flags;
      if (paramInt1 == 0) {
        break label431;
      }
    }
    label426:
    label431:
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      localNotification.flags = (paramInt1 | j & 0xFFFFFFFE);
      ((y.d)localObject).L(i).c(paramString3).rg = paramPendingIntent1;
      ((y.d)localObject).rx = true;
      if (paramString1 != null) {
        ((y.d)localObject).a(paramString1);
      }
      if (paramString2 != null) {
        ((y.d)localObject).b(paramString2);
      }
      ((y.d)localObject).rC.defaults = paramInt2;
      if ((paramInt2 & 0x4) != 0)
      {
        paramPendingIntent1 = ((y.d)localObject).rC;
        paramPendingIntent1.flags |= 0x1;
      }
      if (paramBitmap != null) {
        ((y.d)localObject).rj = paramBitmap;
      }
      if (paramNotification != null)
      {
        if (paramNotification.sound != null)
        {
          paramPendingIntent1 = paramNotification.sound;
          ((y.d)localObject).rC.sound = paramPendingIntent1;
          ((y.d)localObject).rC.audioStreamType = -1;
        }
        if (paramNotification.vibrate != null)
        {
          paramNotification = paramNotification.vibrate;
          ((y.d)localObject).rC.vibrate = paramNotification;
        }
      }
      if (Build.VERSION.SDK_INT >= 16)
      {
        if (paramString4 != null) {
          ((y.d)localObject).a(paramInt3, paramString4, paramPendingIntent2);
        }
        if (paramString5 != null) {
          ((y.d)localObject).a(paramInt4, paramString5, paramPendingIntent3);
        }
      }
      if (Build.VERSION.SDK_INT >= 21)
      {
        ((y.d)localObject).ry = "msg";
        paramNotification = new com.tencent.mm.g.a.w();
        paramNotification.eAT.username = paramString6;
        paramNotification.eAT.title = paramString1;
        com.tencent.mm.sdk.b.a.vgX.m(paramNotification);
        if (paramNotification.eAT.eAU != null) {
          paramNotification.eAT.eAU.a((y.d)localObject);
        }
      }
      localObject = ((y.d)localObject).getNotification();
      GMTrace.o(506806140928L, 3776);
      return (Notification)localObject;
      paramInt1 = 0;
      break;
    }
  }
  
  @TargetApi(11)
  public final Notification a(Notification paramNotification, int paramInt1, int paramInt2, PendingIntent paramPendingIntent, String paramString1, String paramString2, String paramString3, Bitmap paramBitmap, String paramString4)
  {
    GMTrace.i(506671923200L, 3775);
    paramNotification = a(paramNotification, paramInt1, paramInt2, paramPendingIntent, paramString1, paramString2, paramString3, paramBitmap, 0, null, null, 0, null, null, paramString4);
    GMTrace.o(506671923200L, 3775);
    return paramNotification;
  }
  
  public final void a(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(506940358656L, 3777);
    Context localContext = ab.getContext();
    boolean bool1 = e.rO();
    paramBoolean = e.rM();
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Notification.AppMsg.Handle", "push:isShake: %B, isSound: %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(paramBoolean) });
    if (paramLong == 0L)
    {
      GMTrace.o(506940358656L, 3777);
      return;
    }
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)) || (bg.nm(paramString3)))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Notification.AppMsg.Handle", "[NO NOTIFICATION] Util.isNullOrNil(userName) || Util.isNullOrNil(nickName) || Util.isNullOrNil(content)");
      GMTrace.o(506940358656L, 3777);
      return;
    }
    if ((f.uk()) && (!f.ul()))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Notification.AppMsg.Handle", "[NO NOTIFICATION](MMCore.getAccStg().isWebWXOnline() && !ConfigStorageLogic.isWebWXNotificationOpen())preNotificationCheck");
      GMTrace.o(506940358656L, 3777);
      return;
    }
    if (!f.tK())
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Notification.AppMsg.Handle", "[NO NOTIFICATION]new MsgNotification setting no notification");
      GMTrace.o(506940358656L, 3777);
      return;
    }
    if (K(paramLong))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Notification.AppMsg.Handle", "[NO NOTIFICATION]already notify");
      GMTrace.o(506940358656L, 3777);
      return;
    }
    com.tencent.mm.booter.notification.queue.b.rH().restore();
    int j = rD() + 1;
    Object localObject1 = a(rE(), paramString1);
    int i;
    Object localObject2;
    label289:
    int k;
    int m;
    int n;
    int i1;
    String str1;
    String str2;
    if (localObject1 == null)
    {
      i = 0;
      i += 1;
      localObject2 = rE();
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = new ArrayList();
      }
      localObject2 = a((List)localObject1, paramString1);
      if (localObject2 != null) {
        break label747;
      }
      localObject2 = new a();
      ((a)localObject2).userName = paramString1;
      ((a)localObject2).fKA = 1;
      ((ArrayList)localObject1).add(localObject2);
      d((ArrayList)localObject1);
      dW(rD() + 1);
      k = ((ArrayList)localObject1).size();
      if (e.rL())
      {
        paramBoolean = false;
        bool1 = false;
      }
      localObject1 = rC();
      m = com.tencent.mm.booter.notification.queue.b.rH().dy(paramString1);
      this.etD.fLA = j;
      this.etD.fLz = k;
      this.etD.fLG = bool1;
      this.etD.fLF = paramBoolean;
      boolean bool2 = f.tM();
      n = com.tencent.mm.bi.a.bIN();
      localObject2 = this.etD;
      ((g)localObject2).fLs.a(((g)localObject2).mContext, paramBoolean, bool1, (Notification)localObject1, null);
      i1 = ((g)localObject2).fLs.fLf;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NotificationIntent", "[oneliang] notificationId:%s, userName:%s, msgType:%s, unReadMsgCount:%s, unReadTalkerCount:%s, isMuted:%s, isShowDetails:%s", new Object[] { Integer.valueOf(m), paramString1, Integer.valueOf(paramInt), Integer.valueOf(j), Integer.valueOf(k), Boolean.valueOf(false), Boolean.valueOf(bool2) });
      localObject2 = new Intent(localContext, LauncherUI.class);
      ((Intent)localObject2).putExtra("nofification_type", "new_msg_nofification");
      ((Intent)localObject2).putExtra("Main_User", paramString1);
      ((Intent)localObject2).putExtra("MainUI_User_Last_Msg_Type", paramInt);
      ((Intent)localObject2).addFlags(536870912);
      ((Intent)localObject2).addFlags(67108864);
      if (!bool2) {
        break label762;
      }
      ((Intent)localObject2).putExtra("talkerCount", 1);
      ((Intent)localObject2).putExtra("Intro_Is_Muti_Talker", false);
      ((Intent)localObject2).putExtra("pushcontent_unread_count", j);
      localObject2 = com.tencent.mm.booter.notification.a.d.a(localContext, m, (Intent)localObject2);
      str1 = h.c(localContext, paramString2, bool2);
      str2 = h.a(localContext, paramString3, k, j, i, bool2);
      paramString3 = h.d(localContext, paramString3, bool2);
      if (!f.tM()) {
        break label805;
      }
    }
    label747:
    label762:
    label805:
    for (paramString2 = com.tencent.mm.booter.notification.a.a.b(localContext, com.tencent.mm.booter.notification.a.a.u(paramString1, paramString4));; paramString2 = null)
    {
      paramString2 = new NotificationItem(m, paramString1, a((Notification)localObject1, n, i1, (PendingIntent)localObject2, str1, str2, paramString3, paramString2, paramString1));
      paramString2.fKQ = paramLong;
      paramString2.fKR = i;
      a(paramString2, this.etD);
      d.dX(this.etD.fLA);
      d.n(paramString1, i);
      GMTrace.o(506940358656L, 3777);
      return;
      i = ((a)localObject1).fKA;
      break;
      ((a)localObject2).fKA += 1;
      break label289;
      if (k <= 1) {
        ((Intent)localObject2).putExtra("Intro_Is_Muti_Talker", false);
      }
      for (;;)
      {
        ((Intent)localObject2).putExtra("talkerCount", k);
        break;
        ((Intent)localObject2).putExtra("Intro_Is_Muti_Talker", true);
      }
    }
  }
  
  private static final class a
    implements Serializable
  {
    public int fKA;
    public String userName;
    
    public a()
    {
      GMTrace.i(533381251072L, 3974);
      GMTrace.o(533381251072L, 3974);
    }
    
    public final String toString()
    {
      GMTrace.i(533515468800L, 3975);
      String str = "[" + this.userName + "(" + this.fKA + ")]";
      GMTrace.o(533515468800L, 3975);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\booter\notification\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */