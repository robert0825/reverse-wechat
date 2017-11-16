package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ui.MMActivity;

public class ResourcesExceedUI
  extends MMActivity
{
  private int type;
  private TextView wGJ;
  
  public ResourcesExceedUI()
  {
    GMTrace.i(2249891774464L, 16763);
    this.type = 0;
    GMTrace.o(2249891774464L, 16763);
  }
  
  protected final void MP()
  {
    GMTrace.i(2250160209920L, 16765);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2399947194368L, 17881);
        ResourcesExceedUI.this.finish();
        GMTrace.o(2399947194368L, 17881);
        return true;
      }
    });
    this.wGJ = ((TextView)findViewById(R.h.buU));
    switch (this.type)
    {
    }
    for (;;)
    {
      GMTrace.o(2250160209920L, 16765);
      return;
      this.wGJ.setText(R.l.egq);
      GMTrace.o(2250160209920L, 16765);
      return;
      this.wGJ.setText(R.l.dvr);
      GMTrace.o(2250160209920L, 16765);
      return;
      this.wGJ.setText(R.l.dCW);
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2250294427648L, 16766);
    int i = R.i.cER;
    GMTrace.o(2250294427648L, 16766);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2250025992192L, 16764);
    super.onCreate(paramBundle);
    this.type = getIntent().getIntExtra("clean_view_type", 0);
    sq("");
    MP();
    GMTrace.o(2250025992192L, 16764);
  }
  
  public void onDestroy()
  {
    GMTrace.i(2250428645376L, 16767);
    super.onDestroy();
    GMTrace.o(2250428645376L, 16767);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\chatting\ResourcesExceedUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */