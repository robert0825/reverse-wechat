package com.tencent.mm.plugin.accountsync.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.pluginsdk.ui.applet.e.a;
import com.tencent.mm.pluginsdk.ui.applet.o.a;
import com.tencent.mm.protocal.c.bbt;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.account.FacebookAuthUI;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;

@com.tencent.mm.ui.base.a(3)
public class ShareToFacebookRedirectUI
  extends MMActivity
  implements e
{
  private static String TAG;
  private String htW;
  private String htX;
  private String htY;
  private String htZ;
  private r hua;
  
  static
  {
    GMTrace.i(14703283666944L, 109548);
    TAG = "MicroMsg.ShareToFacebookRedirectUI";
    GMTrace.o(14703283666944L, 109548);
  }
  
  public ShareToFacebookRedirectUI()
  {
    GMTrace.i(14701270401024L, 109533);
    GMTrace.o(14701270401024L, 109533);
  }
  
  private void QJ()
  {
    GMTrace.i(16271483600896L, 121232);
    w.i(TAG, "refreshFacebookToken");
    at.AR();
    long l = bg.c((Long)com.tencent.mm.y.c.xh().get(65831, null));
    at.AR();
    String str = bg.nl((String)com.tencent.mm.y.c.xh().get(65830, null));
    if ((bg.aH(l) > 86400000L) && (str.length() > 0))
    {
      com.tencent.mm.ui.g.a.c localc = new com.tencent.mm.ui.g.a.c("290293790992170");
      localc.WG(str);
      new com.tencent.mm.ui.account.h(localc, new com.tencent.mm.z.a()
      {
        public final void m(Bundle paramAnonymousBundle)
        {
          GMTrace.i(16270946729984L, 121228);
          super.m(paramAnonymousBundle);
          GMTrace.o(16270946729984L, 121228);
        }
        
        public final void onError(int paramAnonymousInt, String paramAnonymousString)
        {
          GMTrace.i(16271080947712L, 121229);
          w.e(ShareToFacebookRedirectUI.QL(), "refresh token error. errType:%d, errMsg:%s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
          super.onError(paramAnonymousInt, paramAnonymousString);
          if (paramAnonymousInt == 3) {
            ShareToFacebookRedirectUI.a(ShareToFacebookRedirectUI.this);
          }
          GMTrace.o(16271080947712L, 121229);
        }
      }).bYB();
      GMTrace.o(16271483600896L, 121232);
      return;
    }
    QK();
    GMTrace.o(16271483600896L, 121232);
  }
  
  private void QK()
  {
    GMTrace.i(14701941489664L, 109538);
    w.i(TAG, "doSend");
    final e.a locala = new e.a(this);
    Object localObject = this.htW;
    int i = com.tencent.mm.br.a.fromDPToPix(locala.mContext, (int)(20.0F * com.tencent.mm.br.a.dZ(locala.mContext)));
    if (!bg.nm((String)localObject))
    {
      localObject = ((com.tencent.mm.plugin.emoji.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.emoji.b.a.class)).a(locala.mContext, ((String)localObject).toString(), i);
      locala.twQ.O((CharSequence)localObject);
    }
    
    {
      public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(16272288907264L, 121238);
        ShareToFacebookRedirectUI.this.aLo();
        locala.oaD.dismiss();
        if (paramAnonymousBoolean)
        {
          bbt localbbt = new bbt();
          String str = paramAnonymousString;
          if (bg.nm(paramAnonymousString)) {
            str = " ";
          }
          localbbt.lPJ = str;
          localbbt.lPi = ShareToFacebookRedirectUI.b(ShareToFacebookRedirectUI.this);
          localbbt.tRP = ShareToFacebookRedirectUI.c(ShareToFacebookRedirectUI.this);
          localbbt.nuV = ShareToFacebookRedirectUI.d(ShareToFacebookRedirectUI.this);
          localbbt.uOO = ShareToFacebookRedirectUI.e(ShareToFacebookRedirectUI.this);
          paramAnonymousString = new com.tencent.mm.plugin.accountsync.model.c(localbbt);
          at.wS().a(paramAnonymousString, 0);
          ShareToFacebookRedirectUI.a(ShareToFacebookRedirectUI.this, com.tencent.mm.ui.base.h.a(ShareToFacebookRedirectUI.this, "", false, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(16272020471808L, 121236);
              ShareToFacebookRedirectUI.f(ShareToFacebookRedirectUI.this).dismiss();
              ShareToFacebookRedirectUI.this.finish();
              GMTrace.o(16272020471808L, 121236);
            }
          }));
          GMTrace.o(16272288907264L, 121238);
          return;
        }
        ShareToFacebookRedirectUI.this.finish();
        GMTrace.o(16272288907264L, 121238);
      }
    }.show();
    GMTrace.o(14701941489664L, 109538);
  }
  
  private void aw(String paramString1, String paramString2)
  {
    GMTrace.i(14702075707392L, 109539);
    com.tencent.mm.ui.base.h.a(this.vKB.vKW, paramString2, paramString1, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(16271349383168L, 121231);
        paramAnonymousDialogInterface = new Intent(ShareToFacebookRedirectUI.this.vKB.vKW, FacebookAuthUI.class);
        paramAnonymousDialogInterface.putExtra("is_force_unbind", true);
        ShareToFacebookRedirectUI.this.vKB.vKW.startActivityForResult(paramAnonymousDialogInterface, 0);
        GMTrace.o(16271349383168L, 121231);
      }
    }, null);
    GMTrace.o(14702075707392L, 109539);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(14701807271936L, 109537);
    w.i(TAG, "type:%d, code:%d, msg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    aLo();
    this.hua.dismiss();
    if ((paramInt1 == 4) && (paramInt2 == -68))
    {
      paramk = paramString;
      if (bg.nm(paramString)) {
        paramk = "error";
      }
      aw(getString(R.l.cUG), paramk);
      GMTrace.o(14701807271936L, 109537);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = getString(R.l.ecB);
      new DialogInterface.OnDismissListener()
      {
        public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(14700867747840L, 109530);
          GMTrace.o(14700867747840L, 109530);
        }
      };
      com.tencent.mm.ui.base.h.bm(this, paramString);
      finish();
      GMTrace.o(14701807271936L, 109537);
      return;
    }
    com.tencent.mm.ui.base.h.a(this.vKB.vKW, "err(" + paramInt2 + "," + paramInt1 + ")", getString(R.l.cUG), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(16271752036352L, 121234);
        ShareToFacebookRedirectUI.this.finish();
        GMTrace.o(16271752036352L, 121234);
      }
    }, null);
    GMTrace.o(14701807271936L, 109537);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(14701673054208L, 109536);
    GMTrace.o(14701673054208L, 109536);
    return -1;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(16271617818624L, 121233);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    String str = TAG;
    if (paramIntent == null) {}
    for (boolean bool = true;; bool = false)
    {
      w.i(str, "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if ((paramInt1 != 0) || (paramInt2 != -1) || (paramIntent == null)) {
        break;
      }
      bool = paramIntent.getBooleanExtra("bind_facebook_succ", false);
      w.i(TAG, "bind facebooksucc %b", new Object[] { Boolean.valueOf(bool) });
      if (!bool) {
        break;
      }
      QJ();
      QK();
      GMTrace.o(16271617818624L, 121233);
      return;
    }
    finish();
    GMTrace.o(16271617818624L, 121233);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(14701404618752L, 109534);
    super.onCreate(paramBundle);
    at.wS().a(433, this);
    this.htW = getIntent().getStringExtra("title");
    this.htX = getIntent().getStringExtra("digest");
    this.htY = getIntent().getStringExtra("img");
    this.htZ = getIntent().getStringExtra("link");
    w.i(TAG, "title %s, digest:%s, img:%s, link:%s", new Object[] { this.htW, this.htX, this.htY, this.htZ });
    if (!q.Af())
    {
      paramBundle = new Intent(this, FacebookAuthUI.class);
      paramBundle.putExtra("is_force_unbind", true);
      startActivityForResult(paramBundle, 0);
      GMTrace.o(14701404618752L, 109534);
      return;
    }
    QJ();
    QK();
    GMTrace.o(14701404618752L, 109534);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(14701538836480L, 109535);
    at.wS().b(433, this);
    super.onDestroy();
    GMTrace.o(14701538836480L, 109535);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\accountsync\ui\ShareToFacebookRedirectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */