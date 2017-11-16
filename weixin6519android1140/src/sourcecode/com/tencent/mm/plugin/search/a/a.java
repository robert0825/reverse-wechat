package com.tencent.mm.plugin.search.a;

import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;

public final class a
{
  public static final SparseArray<a> oBz;
  
  static
  {
    GMTrace.i(18369977778176L, 136867);
    SparseArray localSparseArray = new SparseArray();
    oBz = localSparseArray;
    localSparseArray.put(19, new a(19, -1, ".ui.En_424b8e16", "sns", ""));
    oBz.put(30, new a(19, -1, ".ui.BaseScanUI", "scanner", "", (byte)0));
    oBz.put(18, new a(18, -1, ".ui.ShakeReportUI", "shake", ""));
    oBz.put(17, new a(17, -1, ".ui.NearbyFriendsIntroUI", "nearby", ""));
    oBz.put(16, new a(16, -1, ".ui.BottleBeachUI", "bottle", ""));
    oBz.put(31, new a(31, -1, ".ui.GameCenterUI", "game", ""));
    oBz.put(20, new a(20, -1, ".plugin.profile.ui.ContactInfoUI", "", "voiceinputapp"));
    oBz.put(21, new a(21, -1, ".plugin.profile.ui.ContactInfoUI", "", "linkedinplugin"));
    oBz.put(26, new a(26, -1, ".plugin.profile.ui.ContactInfoUI", "", "qqfriend"));
    oBz.put(29, new a(29, -1, ".plugin.profile.ui.ContactInfoUI", "", "voipapp"));
    oBz.put(23, new a(23, 1, ".ui.chatting.En_5b8fbb1e", "", "qqmail"));
    oBz.put(1, new a(1, -1, ".ui.MallIndexUI", "mall", ""));
    oBz.put(24, new a(24, 8, ".ui.chatting.En_5b8fbb1e", "", "weibo"));
    oBz.put(27, new a(27, 65536, ".ui.MassSendHistoryUI", "masssend", "masssendapp"));
    oBz.put(28, new a(28, 524288, ".ui.ReaderAppUI", "readerapp", "newsapp"));
    oBz.put(32, new a(32, -1, ".ui.v2.EmojiStoreV2UI", "emoji", ""));
    oBz.put(33, new a(33, -1, ".ui.FavoriteIndexUI", "favorite", ""));
    oBz.put(34, new a(34, -1, ".ui.MallIndexUI", "mall", ""));
    oBz.put(35, new a(35, -1, ".backupmoveui.BackupUI", "backup", ""));
    oBz.put(38, new a(38, 16, ".ui.chatting.En_5b8fbb1e", "", "medianote"));
    oBz.put(39, new a(39, -1, ".ui.chatting.En_5b8fbb1e", "", "filehelper"));
    oBz.put(6, new a(6, -1, ".ui.LuckyMoneyIndexUI", "luckymoney", ""));
    oBz.put(41, new a(41, -1, ".ui.WalletOfflineEntranceUI", "offline", ""));
    oBz.put(42, new a(42, -1, ".ui.CollectAdapterUI", "collect", ""));
    oBz.put(40, new a(40, -1, ".balance.ui.WalletBalanceManagerUI", "wallet", ""));
    oBz.put(43, new a(43, -1, ".ui.chatting.En_5b8fbb1e", "", "gh_43f2581f6fd6"));
    oBz.put(50, new a(50, -1, ".ui.conversation.BizConversationUI", "app", ""));
    oBz.put(51, new a(51, -1, ".ui.setting.SettingsPrivacyUI", "setting", ""));
    GMTrace.o(18369977778176L, 136867);
  }
  
  public static boolean F(Context paramContext, int paramInt)
  {
    GMTrace.i(18369843560448L, 136866);
    if (oBz.indexOfKey(paramInt) < 0)
    {
      GMTrace.o(18369843560448L, 136866);
      return false;
    }
    if ((paramInt == 30) && ((com.tencent.mm.p.a.aQ(paramContext)) || (com.tencent.mm.p.a.aP(paramContext))))
    {
      GMTrace.o(18369843560448L, 136866);
      return false;
    }
    Object localObject = (a)oBz.get(paramInt);
    boolean bool;
    if ((((a)localObject).oBA != -1) && ((q.zP() & ((a)localObject).oBA) != 0))
    {
      bool = au(paramContext, ((a)localObject).username);
      GMTrace.o(18369843560448L, 136866);
      return bool;
    }
    Intent localIntent;
    if (!bg.nm(((a)localObject).oBB))
    {
      localIntent = new Intent();
      if (paramInt == 28) {
        localIntent.putExtra("type", 20);
      }
      if (paramInt == 1) {
        localIntent.putExtra("key_native_url", "wxpay://bizmall/mobile_recharge");
      }
      localIntent.putExtra("animation_pop_in", ((a)localObject).oBC);
      if (paramInt == 32) {
        g.ork.i(12065, new Object[] { Integer.valueOf(6) });
      }
      if (paramInt == 6) {
        localIntent.putExtra("pay_channel", 15);
      }
      if (paramInt == 31) {
        localIntent.putExtra("game_report_from_scene", 4);
      }
      if (paramInt == 41) {
        localIntent.putExtra("key_from_scene", 5);
      }
      if (paramInt == 42) {
        localIntent.putExtra("key_from_scene", 4);
      }
      if (paramInt == 35)
      {
        localIntent.setClassName(paramContext, "com.tencent.mm.plugin.backup.backupmoveui.BackupUI");
        MMWizardActivity.A(paramContext, localIntent);
      }
      for (;;)
      {
        b.B(paramContext, localIntent);
        GMTrace.o(18369843560448L, 136866);
        return true;
        if (!((a)localObject).oBB.equals("app")) {
          d.b(paramContext, ((a)localObject).oBB, ((a)localObject).uri, localIntent);
        } else {
          d.a(paramContext, ((a)localObject).uri, localIntent);
        }
      }
    }
    if (((a)localObject).uri.equals(".ui.chatting.En_5b8fbb1e"))
    {
      localObject = ((a)localObject).username;
      at.AR();
      if (com.tencent.mm.l.a.eE(c.yK().TE((String)localObject).field_type))
      {
        localIntent = new Intent();
        localIntent.putExtra("Chat_User", (String)localObject);
        localIntent.putExtra("finish_direct", true);
        d.a(paramContext, ".ui.chatting.En_5b8fbb1e", localIntent);
      }
      for (;;)
      {
        GMTrace.o(18369843560448L, 136866);
        return true;
        au(paramContext, (String)localObject);
      }
    }
    if (((a)localObject).uri.equals(".plugin.profile.ui.ContactInfoUI"))
    {
      bool = au(paramContext, ((a)localObject).username);
      GMTrace.o(18369843560448L, 136866);
      return bool;
    }
    w.e("MicroMsg.Feature", "Error URI of android feature");
    GMTrace.o(18369843560448L, 136866);
    return false;
  }
  
  private static boolean au(Context paramContext, String paramString)
  {
    GMTrace.i(18369709342720L, 136865);
    Intent localIntent = new Intent();
    localIntent.putExtra("Contact_User", paramString);
    d.b(paramContext, "profile", ".ui.ContactInfoUI", localIntent);
    GMTrace.o(18369709342720L, 136865);
    return true;
  }
  
  static final class a
  {
    int id;
    int oBA;
    String oBB;
    boolean oBC;
    String uri;
    String username;
    
    public a(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3)
    {
      this(paramInt1, paramInt2, paramString1, paramString2, paramString3, (byte)0);
      GMTrace.i(18369172471808L, 136861);
      GMTrace.o(18369172471808L, 136861);
    }
    
    public a(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, byte paramByte)
    {
      GMTrace.i(18369306689536L, 136862);
      this.id = paramInt1;
      this.oBA = paramInt2;
      this.uri = paramString1;
      this.oBB = paramString2;
      this.username = paramString3;
      GMTrace.o(18369306689536L, 136862);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */