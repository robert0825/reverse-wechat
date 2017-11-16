package com.tencent.mm.plugin.accountsync.ui;

import android.accounts.AccountAuthenticatorResponse;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.modelfriend.m;
import com.tencent.mm.modelsimple.d;
import com.tencent.mm.modelsimple.d.a;
import com.tencent.mm.plugin.accountsync.model.b.a;
import com.tencent.mm.plugin.accountsync.model.b.b;
import com.tencent.mm.pluginsdk.h.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.account.SimpleLoginUI;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.bindmobile.BindMContactIntroUI;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public final class ContactsSyncUI
  extends MMActivity
{
  private AccountAuthenticatorResponse htv;
  Bundle htw;
  
  public ContactsSyncUI()
  {
    GMTrace.i(7848113209344L, 58473);
    this.htv = null;
    this.htw = null;
    GMTrace.o(7848113209344L, 58473);
  }
  
  protected final void MP()
  {
    boolean bool = false;
    GMTrace.i(7848515862528L, 58476);
    if ((!at.AT()) || (at.wF()))
    {
      MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class), getIntent());
      finish();
      GMTrace.o(7848515862528L, 58476);
      return;
    }
    if (getIntent() == null)
    {
      w.e("MicroMsg.ContactsSyncUI", "initView fail, intent is null");
      finish();
      GMTrace.o(7848515862528L, 58476);
      return;
    }
    int i = s.a(getIntent(), "contact_sync_scene", -1);
    if ((getIntent().getAction() != null) && (getIntent().getAction().equalsIgnoreCase("com.tencent.mm.login.ACTION_LOGIN"))) {
      i = 4;
    }
    Object localObject;
    while (i == -1)
    {
      w.e("MicroMsg.ContactsSyncUI", "unkown scene, finish");
      finish();
      GMTrace.o(7848515862528L, 58476);
      return;
      localObject = getIntent().resolveType(this);
      w.i("MicroMsg.ContactsSyncUI", "scheme = " + (String)localObject + ", action = " + getIntent().getAction());
      if (!bg.nm((String)localObject)) {
        if (((String)localObject).equals("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.profile")) {
          i = 2;
        } else if (((String)localObject).equals("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip")) {
          i = 12;
        } else if (((String)localObject).equals("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip.video")) {
          i = 13;
        } else if (((String)localObject).equals("vnd.android.cursor.item/vnd.com.tencent.mm.plugin.sns.timeline")) {
          i = 3;
        } else if (((String)localObject).equals("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.phonenum")) {
          i = 6;
        } else {
          i = -1;
        }
      }
    }
    switch (i)
    {
    case 5: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    default: 
      localObject = null;
      label342:
      if (localObject != null) {
        switch (((b.a)localObject).bB(this))
        {
        }
      }
      break;
    }
    for (;;)
    {
      finish();
      GMTrace.o(7848515862528L, 58476);
      return;
      localObject = getIntent().getData();
      localObject = new b.b(1, s.i(getIntent(), "k_phone_num"), (Uri)localObject);
      break label342;
      localObject = getIntent().getData();
      localObject = new b.b(3, s.i(getIntent(), "k_phone_num"), (Uri)localObject);
      break label342;
      localObject = getIntent().getData();
      localObject = new b.b(4, s.i(getIntent(), "k_phone_num"), (Uri)localObject);
      break label342;
      localObject = getIntent().getData();
      localObject = new b.b(2, s.i(getIntent(), "k_phone_num"), (Uri)localObject);
      break label342;
      localObject = getIntent().getParcelableExtra("accountAuthenticatorResponse");
      this.htv = null;
      if ((localObject != null) && ((localObject instanceof AccountAuthenticatorResponse))) {
        this.htv = ((AccountAuthenticatorResponse)localObject);
      }
      if (this.htv != null) {
        this.htv.onRequestContinued();
      }
      if (getSharedPreferences(ab.bPU(), 0).getBoolean("upload_contacts_already_displayed", false)) {
        break;
      }
      if (!s.a(getIntent(), "k_login_without_bind_mobile", false)) {}
      for (bool = true;; bool = false)
      {
        localObject = new a(bool);
        break;
      }
      localObject = getIntent().getParcelableExtra("accountAuthenticatorResponse");
      this.htv = null;
      if ((localObject != null) && ((localObject instanceof AccountAuthenticatorResponse))) {
        this.htv = ((AccountAuthenticatorResponse)localObject);
      }
      if (this.htv != null) {
        this.htv.onRequestContinued();
      }
      if (!s.a(getIntent(), "k_login_without_bind_mobile", false)) {
        bool = true;
      }
      localObject = new a(bool);
      break label342;
      localObject = getIntent();
      ((Intent)localObject).setClass(this, ContactsSyncUI.class);
      Intent localIntent = new Intent();
      localIntent.setClass(this, BindMContactIntroUI.class);
      localIntent.putExtra("key_upload_scene", 2);
      localIntent.putExtra("is_bind_for_contact_sync", true);
      MMWizardActivity.b(this, localIntent, (Intent)localObject);
      finish();
      continue;
      localObject = getIntent();
      ((Intent)localObject).setClass(this, ContactsSyncUI.class);
      localIntent = new Intent();
      localIntent.setClass(this, SimpleLoginUI.class);
      MMWizardActivity.b(this, localIntent, (Intent)localObject);
      finish();
      continue;
      localObject = getIntent();
      ((Intent)localObject).setClass(this, ContactsSyncUI.class);
      localIntent = new Intent();
      localIntent.setClass(this, SimpleLoginUI.class);
      localIntent.putExtra("accountAuthenticatorResponse", this.htv);
      MMWizardActivity.b(this, localIntent, (Intent)localObject);
      finish();
      continue;
      GMTrace.o(7848515862528L, 58476);
      return;
      w.e("MicroMsg.ContactsSyncUI", "unkown scene, finish");
    }
  }
  
  public final void finish()
  {
    GMTrace.i(7848650080256L, 58477);
    if (this.htv != null)
    {
      if (this.htw == null) {
        break label51;
      }
      this.htv.onResult(this.htw);
    }
    for (;;)
    {
      this.htv = null;
      super.finish();
      GMTrace.o(7848650080256L, 58477);
      return;
      label51:
      this.htv.onError(4, "canceled");
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7848381644800L, 58475);
    GMTrace.o(7848381644800L, 58475);
    return -1;
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7848247427072L, 58474);
    super.onCreate(paramBundle);
    sq("");
    int i = s.a(getIntent(), "wizard_activity_result_code", 0);
    w.i("MicroMsg.ContactsSyncUI", "onCreate() resultCode[%d]", new Object[] { Integer.valueOf(i) });
    switch (i)
    {
    default: 
      w.e("MicroMsg.ContactsSyncUI", "onCreate, should not reach here, resultCode = " + i);
      finish();
      GMTrace.o(7848247427072L, 58474);
      return;
    case 1: 
      finish();
      GMTrace.o(7848247427072L, 58474);
      return;
    }
    boolean bool = a.a(this, "android.permission.READ_CONTACTS", 48, null, null);
    w.i("MicroMsg.ContactsSyncUI", "summerper checkPermission checkContacts read[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW() });
    if (!bool)
    {
      GMTrace.o(7848247427072L, 58474);
      return;
    }
    bool = a.a(this, "android.permission.WRITE_CONTACTS", 48, null, null);
    w.i("MicroMsg.ContactsSyncUI", "summerper checkPermission checkContacts write[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bg.bQW() });
    if (!bool)
    {
      GMTrace.o(7848247427072L, 58474);
      return;
    }
    MP();
    GMTrace.o(7848247427072L, 58474);
  }
  
  public final void onRequestPermissionsResult(int paramInt, final String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(7848784297984L, 58478);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      if (paramArrayOfInt == null) {}
      for (int i = -1;; i = paramArrayOfInt.length)
      {
        w.w("MicroMsg.ContactsSyncUI", "summerper onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), paramArrayOfString, bg.bQW() });
        GMTrace.o(7848784297984L, 58478);
        return;
      }
    }
    w.i("MicroMsg.ContactsSyncUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(7848784297984L, 58478);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        paramArrayOfString = paramArrayOfString[0];
        new ae().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(7843012935680L, 58435);
            ContactsSyncUI localContactsSyncUI = ContactsSyncUI.this;
            if (paramArrayOfString.equals("android.permission.READ_CONTACTS")) {}
            for (String str = "android.permission.WRITE_CONTACTS";; str = "android.permission.READ_CONTACTS")
            {
              boolean bool = a.a(localContactsSyncUI, str, 48, null, null);
              w.i("MicroMsg.ContactsSyncUI", "summerper checkPermission checkContacts [%b], oldPermission[%s], stack[%s]", new Object[] { Boolean.valueOf(bool), paramArrayOfString, bg.bQW() });
              if (bool) {
                ContactsSyncUI.this.MP();
              }
              GMTrace.o(7843012935680L, 58435);
              return;
            }
          }
          
          public final String toString()
          {
            GMTrace.i(7843147153408L, 58436);
            String str = super.toString() + "|checkContacts";
            GMTrace.o(7843147153408L, 58436);
            return str;
          }
        });
        GMTrace.o(7848784297984L, 58478);
        return;
      }
      h.a(this, getString(R.l.dNp), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7847576338432L, 58469);
          paramAnonymousDialogInterface.dismiss();
          ContactsSyncUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(7847576338432L, 58469);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7838181097472L, 58399);
          paramAnonymousDialogInterface.dismiss();
          ContactsSyncUI.this.finish();
          GMTrace.o(7838181097472L, 58399);
        }
      });
    }
  }
  
  private final class a
    implements b.a
  {
    private d.a htA;
    private boolean htz;
    
    public a(boolean paramBoolean)
    {
      GMTrace.i(7847039467520L, 58465);
      this.htA = new d.a()
      {
        public final void o(Bundle paramAnonymousBundle)
        {
          GMTrace.i(7843952459776L, 58442);
          ContactsSyncUI localContactsSyncUI = ContactsSyncUI.this;
          localContactsSyncUI.htw = paramAnonymousBundle;
          localContactsSyncUI.finish();
          GMTrace.o(7843952459776L, 58442);
        }
      };
      this.htz = paramBoolean;
      GMTrace.o(7847039467520L, 58465);
    }
    
    public final int G(Context paramContext, String paramString)
    {
      GMTrace.i(7847307902976L, 58467);
      if (paramContext == null)
      {
        GMTrace.o(7847307902976L, 58467);
        return 1;
      }
      int i = d.a(paramContext, paramString, this.htA);
      if (i == 2)
      {
        Toast.makeText(paramContext, ContactsSyncUI.this.getString(R.l.dlN), 1).show();
        GMTrace.o(7847307902976L, 58467);
        return 1;
      }
      if (i == 3)
      {
        Toast.makeText(paramContext, ContactsSyncUI.this.getString(R.l.dlM), 1).show();
        GMTrace.o(7847307902976L, 58467);
        return 1;
      }
      GMTrace.o(7847307902976L, 58467);
      return 0;
    }
    
    public final int bB(final Context paramContext)
    {
      GMTrace.i(7847173685248L, 58466);
      if ((!at.AT()) || (at.wF()))
      {
        GMTrace.o(7847173685248L, 58466);
        return 4;
      }
      if (!this.htz)
      {
        w.i("MicroMsg.ProcessorAddAccount", "no need to bind mobile");
        d.a(ContactsSyncUI.this, this.htA);
        GMTrace.o(7847173685248L, 58466);
        return 0;
      }
      at.AR();
      final String str = (String)c.xh().get(6, "");
      if (bg.nm(str))
      {
        w.e("MicroMsg.ProcessorAddAccount", "not bind mobile phone");
        GMTrace.o(7847173685248L, 58466);
        return 2;
      }
      if (m.Hn())
      {
        h.a(paramContext, R.l.dlL, R.l.cUG, R.l.cTM, R.l.cSk, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(7844220895232L, 58444);
            at.AR();
            c.xh().set(12322, Boolean.valueOf(true));
            ContactsSyncUI.this.getSharedPreferences(ab.bPU(), 0).edit().putBoolean("upload_contacts_already_displayed", true).commit();
            ContactsSyncUI.a.this.G(paramContext, str);
            if ((paramContext instanceof Activity)) {
              ((Activity)paramContext).finish();
            }
            GMTrace.o(7844220895232L, 58444);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(7838449532928L, 58401);
            at.AR();
            c.xh().set(12322, Boolean.valueOf(false));
            ContactsSyncUI.this.getSharedPreferences(ab.bPU(), 0).edit().putBoolean("upload_contacts_already_displayed", true).commit();
            if ((paramContext instanceof Activity)) {
              ((Activity)paramContext).finish();
            }
            GMTrace.o(7838449532928L, 58401);
          }
        });
        GMTrace.o(7847173685248L, 58466);
        return 5;
      }
      int i = G(paramContext, str);
      GMTrace.o(7847173685248L, 58466);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\accountsync\ui\ContactsSyncUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */