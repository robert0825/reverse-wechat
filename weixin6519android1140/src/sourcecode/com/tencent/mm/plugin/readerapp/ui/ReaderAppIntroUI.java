package com.tencent.mm.plugin.readerapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.readerapp.a.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.bh;

public class ReaderAppIntroUI
  extends MMActivity
{
  private int eRb;
  
  public ReaderAppIntroUI()
  {
    GMTrace.i(11758546714624L, 87608);
    this.eRb = 0;
    GMTrace.o(11758546714624L, 87608);
  }
  
  protected final void MP()
  {
    GMTrace.i(11758949367808L, 87611);
    ImageView localImageView = (ImageView)findViewById(R.h.bWJ);
    TextView localTextView = (TextView)findViewById(R.h.bWK);
    this.eRb = getIntent().getIntExtra("type", 0);
    if (this.eRb == 20)
    {
      oM(R.l.dCr);
      localImageView.setImageResource(R.g.aZv);
      localTextView.setText(R.l.dkt);
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11754251747328L, 87576);
        ReaderAppIntroUI.this.finish();
        GMTrace.o(11754251747328L, 87576);
        return true;
      }
    });
    a(0, R.k.cIU, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11751701610496L, 87557);
        a.hnH.d(new Intent().putExtra("Contact_User", bh.fw(ReaderAppIntroUI.a(ReaderAppIntroUI.this))), ReaderAppIntroUI.this);
        ReaderAppIntroUI.this.finish();
        GMTrace.o(11751701610496L, 87557);
        return true;
      }
    });
    GMTrace.o(11758949367808L, 87611);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11758680932352L, 87609);
    int i = R.i.cEt;
    GMTrace.o(11758680932352L, 87609);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11758815150080L, 87610);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(11758815150080L, 87610);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\readerapp\ui\ReaderAppIntroUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */