package com.tencent.mm.plugin.location.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cf.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.tools.MMTextInputUI;

public class RemarkUI
  extends MMTextInputUI
{
  public RemarkUI()
  {
    GMTrace.i(9652670562304L, 71918);
    GMTrace.o(9652670562304L, 71918);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9652804780032L, 71919);
    int i = R.i.cEQ;
    GMTrace.o(9652804780032L, 71919);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9652938997760L, 71920);
    super.onCreate(paramBundle);
    oM(R.l.dGI);
    paramBundle = getIntent().getStringExtra("Kwebmap_locaion");
    if (bg.nm(paramBundle))
    {
      findViewById(R.h.bKZ).setVisibility(8);
      GMTrace.o(9652938997760L, 71920);
      return;
    }
    ((TextView)findViewById(R.h.bLl)).setText(paramBundle);
    GMTrace.o(9652938997760L, 71920);
  }
  
  protected final void y(CharSequence paramCharSequence)
  {
    GMTrace.i(9653073215488L, 71921);
    long l = getIntent().getLongExtra("kFavInfoLocalId", -1L);
    if (l > 0L) {
      if (paramCharSequence != null) {
        break label156;
      }
    }
    label156:
    for (paramCharSequence = "";; paramCharSequence = paramCharSequence.toString())
    {
      w.i("MicroMsg.MMTextInputUI", "same remark[%s]", new Object[] { paramCharSequence });
      if (!paramCharSequence.equals(getIntent().getStringExtra("kRemark")))
      {
        cf localcf = new cf();
        localcf.eDv.type = -2;
        localcf.eDv.eDk = Long.toString(l);
        localcf.eDv.desc = paramCharSequence;
        w.d("MicroMsg.MMTextInputUI", "update location remark, favlocalid is %s, remark is %s", new Object[] { localcf.eDv.eDk, localcf.eDv.desc });
        a.vgX.m(localcf);
      }
      GMTrace.o(9653073215488L, 71921);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\RemarkUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */