package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.ac.n;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.g.a.c;
import com.tencent.mm.ui.g.a.c.a;
import com.tencent.mm.ui.p;

public class ShowNonWeixinFriendUI
  extends MMActivity
  implements d.a
{
  private long vUq;
  private String vUr;
  
  public ShowNonWeixinFriendUI()
  {
    GMTrace.i(2712808718336L, 20212);
    this.vUq = 0L;
    this.vUr = "";
    GMTrace.o(2712808718336L, 20212);
  }
  
  protected final void MP()
  {
    GMTrace.i(2713479806976L, 20217);
    ImageView localImageView = (ImageView)findViewById(R.h.bHz);
    TextView localTextView1 = (TextView)findViewById(R.h.bHD);
    TextView localTextView2 = (TextView)findViewById(R.h.bHE);
    localImageView.setBackgroundDrawable(a.b(this, R.k.cLS));
    localImageView.setImageBitmap(com.tencent.mm.ac.b.hM(this.vUq));
    localTextView1.setText(this.vUr);
    localTextView2.setText(getString(R.l.bHE, new Object[] { this.vUr }));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2638452097024L, 19658);
        ShowNonWeixinFriendUI.this.aLo();
        ShowNonWeixinFriendUI.this.finish();
        GMTrace.o(2638452097024L, 19658);
        return true;
      }
    });
    ((Button)findViewById(R.h.bHC)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2640331145216L, 19672);
        paramAnonymousView = new c("290293790992170");
        Bundle localBundle = new Bundle();
        localBundle.putString("message", ShowNonWeixinFriendUI.this.getString(R.l.dsz));
        localBundle.putString("to", Long.toString(ShowNonWeixinFriendUI.a(ShowNonWeixinFriendUI.this)));
        paramAnonymousView.a(ShowNonWeixinFriendUI.this, "apprequests", localBundle, new c.a()
        {
          public final void a(com.tencent.mm.ui.g.a.b paramAnonymous2b)
          {
            GMTrace.i(2782199283712L, 20729);
            w.e("MicroMsg.ShowNonWeixinFriendUI", "fbinvite error");
            GMTrace.o(2782199283712L, 20729);
          }
          
          public final void a(com.tencent.mm.ui.g.a.d paramAnonymous2d)
          {
            GMTrace.i(2782065065984L, 20728);
            w.e("MicroMsg.ShowNonWeixinFriendUI", "fbinvite error");
            GMTrace.o(2782065065984L, 20728);
          }
          
          public final void m(Bundle paramAnonymous2Bundle)
          {
            GMTrace.i(2782333501440L, 20730);
            w.i("MicroMsg.ShowNonWeixinFriendUI", "fbinvite oncomplete");
            h.a(ShowNonWeixinFriendUI.this.vKB.vKW, R.l.dsE, R.l.cUG, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
              {
                GMTrace.i(2659792715776L, 19817);
                ShowNonWeixinFriendUI.this.finish();
                GMTrace.o(2659792715776L, 19817);
              }
            });
            GMTrace.o(2782333501440L, 20730);
          }
          
          public final void onCancel()
          {
            GMTrace.i(2782467719168L, 20731);
            w.e("MicroMsg.ShowNonWeixinFriendUI", "fbinvite cancle");
            GMTrace.o(2782467719168L, 20731);
          }
        });
        GMTrace.o(2640331145216L, 19672);
      }
    });
    GMTrace.o(2713479806976L, 20217);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2713345589248L, 20216);
    int i = R.i.cwl;
    GMTrace.o(2713345589248L, 20216);
    return i;
  }
  
  public final void ib(String paramString)
  {
    GMTrace.i(2713614024704L, 20218);
    MP();
    GMTrace.o(2713614024704L, 20218);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2712942936064L, 20213);
    super.onCreate(paramBundle);
    oM(R.l.dDo);
    this.vUq = getIntent().getLongExtra("Contact_KFacebookId", 0L);
    this.vUr = getIntent().getStringExtra("Contact_KFacebookName");
    MP();
    GMTrace.o(2712942936064L, 20213);
  }
  
  protected void onPause()
  {
    GMTrace.i(2713077153792L, 20214);
    super.onPause();
    n.Dh().e(this);
    GMTrace.o(2713077153792L, 20214);
  }
  
  protected void onResume()
  {
    GMTrace.i(2713211371520L, 20215);
    super.onResume();
    n.Dh().d(this);
    GMTrace.o(2713211371520L, 20215);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\account\ShowNonWeixinFriendUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */