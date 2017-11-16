package com.tencent.mm.plugin.setting.ui.setting;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ui.MMActivity;

public class SettingDeleteAccountUI
  extends MMActivity
{
  public SettingDeleteAccountUI()
  {
    GMTrace.i(4692788641792L, 34964);
    GMTrace.o(4692788641792L, 34964);
  }
  
  protected final void MP()
  {
    GMTrace.i(4693191294976L, 34967);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4686211973120L, 34915);
        SettingDeleteAccountUI.this.aLo();
        SettingDeleteAccountUI.this.finish();
        GMTrace.o(4686211973120L, 34915);
        return true;
      }
    });
    ((TextView)findViewById(R.h.btd)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(4597762490368L, 34256);
        GMTrace.o(4597762490368L, 34256);
      }
    });
    GMTrace.o(4693191294976L, 34967);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4692922859520L, 34965);
    int i = R.i.cFW;
    GMTrace.o(4692922859520L, 34965);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4693057077248L, 34966);
    super.onCreate(paramBundle);
    oM(R.l.dXM);
    MP();
    GMTrace.o(4693057077248L, 34966);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingDeleteAccountUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */