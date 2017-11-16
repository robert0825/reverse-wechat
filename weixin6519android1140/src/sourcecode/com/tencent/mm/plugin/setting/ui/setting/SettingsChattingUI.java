package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.np;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.wallet.e;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SettingsChattingUI
  extends MMPreference
{
  private f htU;
  private boolean jqh;
  private ProgressDialog oHE;
  
  public SettingsChattingUI()
  {
    GMTrace.i(4661381693440L, 34730);
    this.oHE = null;
    this.jqh = false;
    GMTrace.o(4661381693440L, 34730);
  }
  
  protected final void MP()
  {
    GMTrace.i(4661650128896L, 34732);
    oM(R.l.dYC);
    this.htU = this.wky;
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4644336041984L, 34603);
        SettingsChattingUI.this.aLo();
        SettingsChattingUI.this.finish();
        GMTrace.o(4644336041984L, 34603);
        return true;
      }
    });
    GMTrace.o(4661650128896L, 34732);
  }
  
  public final int QI()
  {
    GMTrace.i(4661918564352L, 34734);
    int i = R.o.eps;
    GMTrace.o(4661918564352L, 34734);
    return i;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool2 = false;
    GMTrace.i(4662052782080L, 34735);
    paramf = paramPreference.hiu;
    boolean bool1;
    if (paramf.equals("settings_voice_play_mode"))
    {
      at.AR();
      boolean bool3 = ((Boolean)com.tencent.mm.y.c.xh().get(26, Boolean.valueOf(false))).booleanValue();
      if (!bool3) {}
      for (bool1 = true;; bool1 = false)
      {
        w.d("MicroMsg.SettingsChattingUI", "set voice mode from %B to %B", new Object[] { Boolean.valueOf(bool3), Boolean.valueOf(bool1) });
        at.AR();
        paramf = com.tencent.mm.y.c.xh();
        bool1 = bool2;
        if (!bool3) {
          bool1 = true;
        }
        paramf.set(26, Boolean.valueOf(bool1));
        GMTrace.o(4662052782080L, 34735);
        return true;
      }
    }
    if (paramf.equals("settings_enter_button_send"))
    {
      paramf = (CheckBoxPreference)this.htU.VG("settings_enter_button_send");
      if (paramf != null)
      {
        bool1 = paramf.isChecked();
        w.d("MicroMsg.SettingsChattingUI", "set enter button send : %s", new Object[] { Boolean.valueOf(bool1) });
        at.AR();
        com.tencent.mm.y.c.xh().set(66832, Boolean.valueOf(bool1));
      }
      GMTrace.o(4662052782080L, 34735);
      return true;
    }
    if (paramf.equals("settings_bak_chat"))
    {
      paramf = new Intent().setClassName(this.vKB.vKW, "com.tencent.mm.plugin.backup.backupmoveui.BackupUI");
      MMWizardActivity.A(this.vKB.vKW, paramf);
      GMTrace.o(4662052782080L, 34735);
      return true;
    }
    if (paramf.equals("settings_chatting_bg"))
    {
      paramf = new Intent();
      paramf.setClass(this, SettingsChattingBackgroundUI.class);
      this.vKB.vKW.startActivity(paramf);
      GMTrace.o(4662052782080L, 34735);
      return true;
    }
    if (paramf.equals("settings_emoji_manager"))
    {
      paramf = new Intent();
      paramf.putExtra("10931", 2);
      d.b(this.vKB.vKW, "emoji", ".ui.EmojiMineUI", paramf);
      GMTrace.o(4662052782080L, 34735);
      return true;
    }
    if (paramf.equals("settings_reset"))
    {
      h.a(this.vKB.vKW, getResources().getString(R.l.eao), "", getString(R.l.cSl), getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(final DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4672387547136L, 34812);
          g.ork.i(14553, new Object[] { Integer.valueOf(5), Integer.valueOf(2), "" });
          g.ork.a(324L, 0L, 1L, false);
          SettingsChattingUI.a(SettingsChattingUI.this, false);
          paramAnonymousDialogInterface = SettingsChattingUI.this;
          Object localObject = SettingsChattingUI.this;
          SettingsChattingUI.this.getString(R.l.cUG);
          SettingsChattingUI.a(paramAnonymousDialogInterface, h.a((Context)localObject, SettingsChattingUI.this.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(4645678219264L, 34613);
              SettingsChattingUI.a(SettingsChattingUI.this, true);
              GMTrace.o(4645678219264L, 34613);
            }
          }));
          at.AR();
          paramAnonymousDialogInterface = com.tencent.mm.y.c.yM().aOs();
          if (paramAnonymousDialogInterface != null)
          {
            w.i("MicroMsg.WalletConvDelCheckLogic", "checkGetUnProcessorWalletConversation, msgInfoList size: %s", new Object[] { Integer.valueOf(paramAnonymousDialogInterface.size()) });
            localObject = new HashSet();
            paramAnonymousDialogInterface = paramAnonymousDialogInterface.iterator();
            while (paramAnonymousDialogInterface.hasNext())
            {
              au localau = (au)paramAnonymousDialogInterface.next();
              if (!((Set)localObject).contains(localau.field_talker))
              {
                at.AR();
                if ((com.tencent.mm.y.c.yP().TO(localau.field_talker) != null) && (e.aa(localau))) {
                  ((Set)localObject).add(localau.field_talker);
                }
              }
            }
            paramAnonymousDialogInterface = new ArrayList();
            paramAnonymousDialogInterface.addAll((Collection)localObject);
          }
          while ((paramAnonymousDialogInterface != null) && (paramAnonymousDialogInterface.size() > 0))
          {
            SettingsChattingUI.a(SettingsChattingUI.this).dismiss();
            h.a(SettingsChattingUI.this, false, SettingsChattingUI.this.getString(R.l.ejv, new Object[] { Integer.valueOf(paramAnonymousDialogInterface.size()) }), null, SettingsChattingUI.this.getString(R.l.dBn), SettingsChattingUI.this.getString(R.l.dik), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(19533108609024L, 145533);
                g.ork.i(14553, new Object[] { Integer.valueOf(5), Integer.valueOf(4), "" });
                SettingsChattingUI.a(SettingsChattingUI.this, true);
                if (paramAnonymousDialogInterface.size() <= 1)
                {
                  paramAnonymous2DialogInterface = new Intent();
                  paramAnonymous2DialogInterface.putExtra("Chat_User", (String)paramAnonymousDialogInterface.get(0));
                  paramAnonymous2DialogInterface.addFlags(67108864);
                  d.a(SettingsChattingUI.this, ".ui.chatting.En_5b8fbb1e", paramAnonymous2DialogInterface);
                  GMTrace.o(19533108609024L, 145533);
                  return;
                }
                paramAnonymous2DialogInterface = new Intent();
                paramAnonymous2DialogInterface.putStringArrayListExtra("key_conversation_list", paramAnonymousDialogInterface);
                d.a(SettingsChattingUI.this, ".ui.conversation.SettingCheckUnProcessWalletConvUI", paramAnonymous2DialogInterface);
                GMTrace.o(19533108609024L, 145533);
              }
            }, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(19533511262208L, 145536);
                g.ork.i(14553, new Object[] { Integer.valueOf(5), Integer.valueOf(3), "" });
                SettingsChattingUI.a(SettingsChattingUI.this).show();
                SettingsChattingUI.a(SettingsChattingUI.this, false);
                SettingsChattingUI.b(SettingsChattingUI.this);
                GMTrace.o(19533511262208L, 145536);
              }
            }, -1, R.e.aMJ);
            GMTrace.o(4672387547136L, 34812);
            return;
            paramAnonymousDialogInterface = null;
          }
          SettingsChattingUI.b(SettingsChattingUI.this);
          GMTrace.o(4672387547136L, 34812);
        }
      }, null);
      GMTrace.o(4662052782080L, 34735);
      return true;
    }
    GMTrace.o(4662052782080L, 34735);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4661515911168L, 34731);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(4661515911168L, 34731);
  }
  
  protected void onResume()
  {
    GMTrace.i(4661784346624L, 34733);
    super.onResume();
    Object localObject = (CheckBoxPreference)this.htU.VG("settings_voice_play_mode");
    if (localObject != null)
    {
      at.AR();
      ((CheckBoxPreference)localObject).sdM = ((Boolean)com.tencent.mm.y.c.xh().get(26, Boolean.valueOf(false))).booleanValue();
      ((Preference)localObject).wlc = false;
    }
    localObject = (CheckBoxPreference)this.htU.VG("settings_enter_button_send");
    if (localObject != null)
    {
      at.AR();
      ((CheckBoxPreference)localObject).sdM = ((Boolean)com.tencent.mm.y.c.xh().get(66832, Boolean.valueOf(false))).booleanValue();
      ((Preference)localObject).wlc = false;
    }
    localObject = this.htU.VG("settings_text_size");
    if (localObject != null) {
      ((Preference)localObject).setSummary(getString(SetTextSizeUI.de(this)));
    }
    this.htU.notifyDataSetChanged();
    GMTrace.o(4661784346624L, 34733);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsChattingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */