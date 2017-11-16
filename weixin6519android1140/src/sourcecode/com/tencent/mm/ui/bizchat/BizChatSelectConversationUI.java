package com.tencent.mm.ui.bizchat;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.af.a.c;
import com.tencent.mm.af.a.j;
import com.tencent.mm.af.x;
import com.tencent.mm.pluginsdk.ui.applet.o.a;
import com.tencent.mm.protocal.c.gy;
import com.tencent.mm.protocal.c.oj;
import com.tencent.mm.protocal.c.us;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.m;
import com.tencent.mm.ui.contact.o;
import com.tencent.mm.ui.contact.p;
import com.tencent.mm.ui.v;
import com.tencent.mm.y.at;
import java.util.HashMap;

@com.tencent.mm.ui.base.a(19)
public class BizChatSelectConversationUI
  extends MMBaseSelectContactUI
  implements com.tencent.mm.af.n
{
  private com.tencent.mm.ui.base.r hsU;
  private String juZ;
  private int scene;
  private TextView wpY;
  j wpb;
  
  public BizChatSelectConversationUI()
  {
    GMTrace.i(2992115810304L, 22293);
    this.juZ = null;
    this.scene = 0;
    this.hsU = null;
    GMTrace.o(2992115810304L, 22293);
  }
  
  private void a(final String paramString, final long paramLong, CharSequence paramCharSequence)
  {
    GMTrace.i(2993323769856L, 22302);
    w.i("MicroMsg.BizChatSelectConversationUI", "doClickUser=%s", new Object[] { paramString });
    if (this.scene == 2)
    {
      if (getIntent().getBooleanExtra("enterprise_extra_params", true))
      {
        paramCharSequence = String.valueOf(paramCharSequence);
        com.tencent.mm.pluginsdk.ui.applet.e.a(this.vKB, paramLong, getString(R.l.dSl), paramCharSequence, getString(R.l.cUs), new o.a()
        {
          public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
          {
            GMTrace.i(3000303091712L, 22354);
            if (paramAnonymousBoolean)
            {
              paramAnonymousString = new Intent();
              paramAnonymousString.putExtra("enterprise_biz_name", paramString);
              paramAnonymousString.putExtra("key_biz_chat_id", paramLong);
              paramAnonymousString.putExtra("key_is_biz_chat", true);
              BizChatSelectConversationUI.this.setResult(-1, paramAnonymousString);
              BizChatSelectConversationUI.this.finish();
            }
            GMTrace.o(3000303091712L, 22354);
          }
        });
        GMTrace.o(2993323769856L, 22302);
        return;
      }
      paramCharSequence = String.valueOf(paramCharSequence);
      com.tencent.mm.pluginsdk.ui.applet.e.a(this.vKB, paramLong, getString(R.l.dSl), paramCharSequence, getString(R.l.cUs), new o.a()
      {
        public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
        {
          GMTrace.i(3011443163136L, 22437);
          if (paramAnonymousBoolean)
          {
            paramAnonymousString = new Intent();
            paramAnonymousString.putExtra("enterprise_biz_name", paramString);
            paramAnonymousString.putExtra("key_biz_chat_id", paramLong);
            paramAnonymousString.putExtra("key_is_biz_chat", true);
            BizChatSelectConversationUI.this.setResult(-1, paramAnonymousString);
            BizChatSelectConversationUI.this.finish();
          }
          GMTrace.o(3011443163136L, 22437);
        }
      });
      GMTrace.o(2993323769856L, 22302);
      return;
    }
    if (this.scene == 1)
    {
      Object localObject = (HashMap)getIntent().getSerializableExtra("enterprise_extra_params");
      paramCharSequence = (String)((HashMap)localObject).get("img_url");
      String str = (String)((HashMap)localObject).get("desc");
      localObject = (String)((HashMap)localObject).get("title");
      com.tencent.mm.pluginsdk.ui.applet.e.a(this.vKB, (String)localObject, paramCharSequence, str, null, true, getResources().getString(R.l.cUs), new o.a()
      {
        public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
        {
          GMTrace.i(2967017095168L, 22106);
          if (paramAnonymousBoolean)
          {
            Intent localIntent = new Intent();
            localIntent.putExtra("enterprise_biz_name", paramString);
            localIntent.putExtra("key_biz_chat_id", paramLong);
            localIntent.putExtra("key_is_biz_chat", true);
            if (!bg.nm(paramAnonymousString)) {
              localIntent.putExtra("enterprise_share_append_text", paramAnonymousString);
            }
            BizChatSelectConversationUI.this.setResult(-1, localIntent);
            BizChatSelectConversationUI.this.finish();
          }
          GMTrace.o(2967017095168L, 22106);
        }
      });
    }
    GMTrace.o(2993323769856L, 22302);
  }
  
  private void cby()
  {
    GMTrace.i(2992518463488L, 22296);
    if (bg.nm(this.juZ))
    {
      this.juZ = getIntent().getStringExtra("enterprise_biz_name");
      if (bg.nm(this.juZ))
      {
        w.e("MicroMsg.BizChatSelectConversationUI", "brandUserName is null");
        finish();
      }
    }
    GMTrace.o(2992518463488L, 22296);
  }
  
  protected final boolean PZ()
  {
    GMTrace.i(2993726423040L, 22305);
    GMTrace.o(2993726423040L, 22305);
    return false;
  }
  
  protected final boolean Qa()
  {
    GMTrace.i(2993457987584L, 22303);
    GMTrace.o(2993457987584L, 22303);
    return false;
  }
  
  protected final String Qb()
  {
    GMTrace.i(2993592205312L, 22304);
    String str = com.tencent.mm.y.r.fs(this.juZ);
    GMTrace.o(2993592205312L, 22304);
    return str;
  }
  
  protected final o Qc()
  {
    GMTrace.i(2992652681216L, 22297);
    cby();
    d locald = new d(this, this.juZ);
    GMTrace.o(2992652681216L, 22297);
    return locald;
  }
  
  protected final m Qd()
  {
    GMTrace.i(2992786898944L, 22298);
    cby();
    p localp = new p(this, this.juZ);
    GMTrace.o(2992786898944L, 22298);
    return localp;
  }
  
  public final void a(int paramInt, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(2993994858496L, 22307);
    if ((this.hsU != null) && (this.hsU.isShowing()))
    {
      this.hsU.dismiss();
      this.hsU = null;
    }
    if (paramk.getType() == 1355)
    {
      paramk = ((com.tencent.mm.af.a.n)paramk).Ga();
      paramk = x.FI().jd(paramk.ufl.umW.tVO);
      if (paramk == null)
      {
        Toast.makeText(ab.getContext(), getString(R.l.dSy), 0).show();
        GMTrace.o(2993994858496L, 22307);
        return;
      }
      a(this.juZ, paramk.field_bizChatLocalId, paramk.field_chatName);
    }
    GMTrace.o(2993994858496L, 22307);
  }
  
  protected final void a(ListView paramListView, int paramInt)
  {
    GMTrace.i(2992921116672L, 22299);
    super.a(paramListView, paramInt);
    if (this.wpY == null)
    {
      Object localObject = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2963258998784L, 22078);
          BizChatSelectConversationUI.a(BizChatSelectConversationUI.this);
          GMTrace.o(2963258998784L, 22078);
        }
      };
      String str = getString(R.l.dWP);
      View localView = v.fb(this).inflate(R.i.czF, null);
      localView.setOnClickListener((View.OnClickListener)localObject);
      localObject = (TextView)localView.findViewById(R.h.brW);
      ((TextView)localObject).setText(str);
      paramListView.addHeaderView(localView);
      this.wpY = ((TextView)localObject);
    }
    this.wpY.setVisibility(paramInt);
    GMTrace.o(2992921116672L, 22299);
  }
  
  protected final void aMX()
  {
    GMTrace.i(2993055334400L, 22300);
    super.aMX();
    GMTrace.o(2993055334400L, 22300);
  }
  
  public final void hF(int paramInt)
  {
    GMTrace.i(2993189552128L, 22301);
    if (paramInt < this.nVC.getHeaderViewsCount())
    {
      w.i("MicroMsg.BizChatSelectConversationUI", "Click HeaderView position=%d", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(2993189552128L, 22301);
      return;
    }
    if (!(this.nVC.getAdapter().getItem(paramInt) instanceof a))
    {
      w.w("MicroMsg.BizChatSelectConversationUI", "Click HeaderView not BizChatConvDataItem");
      GMTrace.o(2993189552128L, 22301);
      return;
    }
    a locala = (a)this.nVC.getAdapter().getItem(paramInt);
    if (locala == null)
    {
      GMTrace.o(2993189552128L, 22301);
      return;
    }
    String str = locala.username;
    long l = locala.juT;
    if ((str == null) || (l == -1L))
    {
      w.i("MicroMsg.BizChatSelectConversationUI", "onclick err userName:%s,bizChatId:%s", new Object[] { str, Long.valueOf(l) });
      GMTrace.o(2993189552128L, 22301);
      return;
    }
    a(str, l, locala.hqB);
    GMTrace.o(2993189552128L, 22301);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, final Intent paramIntent)
  {
    GMTrace.i(2993860640768L, 22306);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
    {
      GMTrace.o(2993860640768L, 22306);
      return;
    }
    switch (paramInt1)
    {
    default: 
      GMTrace.o(2993860640768L, 22306);
      return;
    }
    paramIntent = paramIntent.getBundleExtra("result_data");
    us localus;
    if (paramIntent != null)
    {
      w.i("MicroMsg.BizChatSelectConversationUI", "bundle != null");
      String str = paramIntent.getString("enterprise_members");
      localus = new us();
      c localc = new c();
      if (this.wpb != null)
      {
        paramIntent = this.wpb.field_addMemberUrl;
        localc.field_addMemberUrl = paramIntent;
        localc.field_brandUserName = this.juZ;
        if (!com.tencent.mm.af.a.e.a(localc, str, null, localus)) {
          break label271;
        }
        if (localc.field_bizChatLocalId == -1L) {
          break label218;
        }
        a(this.juZ, localc.field_bizChatLocalId, localc.field_chatName);
        paramInt1 = 1;
      }
    }
    for (;;)
    {
      if (paramInt1 == 0)
      {
        Toast.makeText(this, getString(R.l.dSy), 0).show();
        GMTrace.o(2993860640768L, 22306);
        return;
        paramIntent = null;
        break;
        label218:
        x.FM();
        paramIntent = com.tencent.mm.af.a.h.a(this.juZ, localus, this);
        getString(R.l.cUG);
        this.hsU = com.tencent.mm.ui.base.h.a(this, getString(R.l.cQF), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(2999363567616L, 22347);
            at.wS().c(paramIntent);
            GMTrace.o(2999363567616L, 22347);
          }
        });
        paramInt1 = 1;
        continue;
        label271:
        paramInt1 = 0;
        continue;
      }
      GMTrace.o(2993860640768L, 22306);
      return;
      paramInt1 = 0;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool = false;
    GMTrace.i(2992250028032L, 22294);
    super.onCreate(paramBundle);
    this.scene = getIntent().getIntExtra("biz_chat_scene", 1);
    cby();
    paramBundle = x.FK().bm(this.juZ);
    this.wpb = x.FK().bl(paramBundle);
    String str = this.juZ;
    if (this.wpb == null) {
      bool = true;
    }
    w.i("MicroMsg.BizChatSelectConversationUI", "updateBizChatMyUserInfo: %s:%s,myBizChatUserInfo is null:%s", new Object[] { str, paramBundle, Boolean.valueOf(bool) });
    if ((bg.nm(paramBundle)) || (this.wpb == null) || (this.wpb.FV()) || (bg.nm(this.wpb.field_addMemberUrl)))
    {
      x.FM();
      com.tencent.mm.af.a.h.a(this.juZ, this);
      getString(R.l.cUG);
      this.hsU = com.tencent.mm.ui.base.h.a(this, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(2989297238016L, 22272);
          BizChatSelectConversationUI.this.finish();
          GMTrace.o(2989297238016L, 22272);
        }
      });
    }
    GMTrace.o(2992250028032L, 22294);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(2992384245760L, 22295);
    super.onDestroy();
    GMTrace.o(2992384245760L, 22295);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\bizchat\BizChatSelectConversationUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */