package com.tencent.mm.plugin.chatroom.ui;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.ViewGroup;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMWebView.a;
import com.tencent.xweb.WebView;
import com.tencent.xweb.e;
import com.tencent.xweb.l;
import com.tencent.xweb.n;

@Deprecated
@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.JSEXECUTECHECK})
public class RoomAnnouncementUI
  extends MMActivity
{
  private String jNA;
  private WebView jPc;
  private boolean jPd;
  
  public RoomAnnouncementUI()
  {
    GMTrace.i(9084392701952L, 67684);
    GMTrace.o(9084392701952L, 67684);
  }
  
  @SuppressLint({"SetJavaScriptEnabled"})
  protected final void MP()
  {
    GMTrace.i(9085063790592L, 67689);
    oM(R.l.dUb);
    this.jPc = MMWebView.a.j(this, R.h.cnD);
    this.jPc.getSettings().setJavaScriptEnabled(true);
    this.jPc.getSettings().cse();
    this.jPc.getSettings().setBuiltInZoomControls(true);
    this.jPc.getSettings().setUseWideViewPort(true);
    this.jPc.getSettings().setLoadWithOverviewMode(true);
    this.jPc.getSettings().crZ();
    this.jPc.getSettings().crY();
    this.jPc.getSettings().setGeolocationEnabled(false);
    this.jPc.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
    this.jPc.setWebChromeClient(new com.tencent.xweb.h()
    {
      public final boolean a(WebView paramAnonymousWebView, String paramAnonymousString1, String paramAnonymousString2, e paramAnonymouse)
      {
        GMTrace.i(19554583445504L, 145693);
        com.tencent.mm.ui.base.h.a(RoomAnnouncementUI.this, paramAnonymousString2, null, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(9073655283712L, 67604);
            RoomAnnouncementUI.a(RoomAnnouncementUI.this).requestFocus();
            GMTrace.o(9073655283712L, 67604);
          }
        });
        paramAnonymouse.cancel();
        GMTrace.o(19554583445504L, 145693);
        return true;
      }
    });
    this.jPc.setWebViewClient(new n()
    {
      public final boolean b(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        GMTrace.i(19556865146880L, 145710);
        if (paramAnonymousString.equals("weixin://chatroom/upgradeagree"))
        {
          a.a(RoomAnnouncementUI.this, RoomAnnouncementUI.b(RoomAnnouncementUI.this), RoomAnnouncementUI.c(RoomAnnouncementUI.this));
          GMTrace.o(19556865146880L, 145710);
          return true;
        }
        GMTrace.o(19556865146880L, 145710);
        return false;
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9088821886976L, 67717);
        RoomAnnouncementUI.this.setResult(0);
        RoomAnnouncementUI.this.finish();
        GMTrace.o(9088821886976L, 67717);
        return true;
      }
    });
    String str = getString(R.l.deS, new Object[] { v.bPK() });
    this.jPc.loadUrl(str);
    GMTrace.o(9085063790592L, 67689);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(9085198008320L, 67690);
    int i = R.i.crK;
    GMTrace.o(9085198008320L, 67690);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9084526919680L, 67685);
    super.onCreate(paramBundle);
    this.jPd = getIntent().getBooleanExtra("need_bind_mobile", false);
    this.jNA = getIntent().getStringExtra("RoomInfo_Id");
    MP();
    GMTrace.o(9084526919680L, 67685);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9084929572864L, 67688);
    if (this.jPc != null)
    {
      this.jPc.setVisibility(8);
      ((ViewGroup)this.jPc.getParent()).removeView(this.jPc);
      this.jPc.removeAllViews();
      this.jPc.destroy();
      this.jPc = null;
      System.gc();
    }
    super.onDestroy();
    GMTrace.o(9084929572864L, 67688);
  }
  
  public void onPause()
  {
    GMTrace.i(9084795355136L, 67687);
    super.onPause();
    GMTrace.o(9084795355136L, 67687);
  }
  
  public void onResume()
  {
    GMTrace.i(9084661137408L, 67686);
    super.onResume();
    GMTrace.o(9084661137408L, 67686);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\ui\RoomAnnouncementUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */