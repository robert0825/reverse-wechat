package com.tencent.mm.ui.contact;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.plugin.normsg.a.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.ui.tools.a.c;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.y.at;
import java.util.LinkedList;
import java.util.List;

public class SayHiEditUI
  extends MMActivity
  implements e
{
  private ProgressDialog htG;
  private MMEditText wTH;
  
  public SayHiEditUI()
  {
    GMTrace.i(1746843729920L, 13015);
    this.htG = null;
    GMTrace.o(1746843729920L, 13015);
  }
  
  protected final void MP()
  {
    GMTrace.i(1747380600832L, 13019);
    this.wTH = ((MMEditText)findViewById(R.h.bZq));
    this.wTH.addTextChangedListener(new a());
    c.d(this.wTH).Ea(100).a(null);
    final String str = getIntent().getStringExtra("Contact_User");
    final int i = getIntent().getIntExtra("Contact_Scene", 18);
    a(0, getString(R.l.cUs), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(final MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1720537055232L, 12819);
        SayHiEditUI.this.aLo();
        d.nxJ.K(2, 1, 3);
        paramAnonymousMenuItem = new LinkedList();
        paramAnonymousMenuItem.add(str);
        Object localObject = new LinkedList();
        ((LinkedList)localObject).add(Integer.valueOf(i));
        paramAnonymousMenuItem = new com.tencent.mm.pluginsdk.model.n(2, paramAnonymousMenuItem, (List)localObject, SayHiEditUI.a(SayHiEditUI.this), "");
        at.wS().a(paramAnonymousMenuItem, 0);
        localObject = SayHiEditUI.this;
        ActionBarActivity localActionBarActivity = SayHiEditUI.this.vKB.vKW;
        SayHiEditUI.this.getString(R.l.cUG);
        SayHiEditUI.a((SayHiEditUI)localObject, h.a(localActionBarActivity, SayHiEditUI.this.getString(R.l.dXH), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
          {
            GMTrace.i(1728455901184L, 12878);
            at.wS().c(paramAnonymousMenuItem);
            GMTrace.o(1728455901184L, 12878);
          }
        }));
        GMTrace.o(1720537055232L, 12819);
        return false;
      }
    }, p.b.vLG);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1821603004416L, 13572);
        SayHiEditUI.this.finish();
        GMTrace.o(1821603004416L, 13572);
        return true;
      }
    });
    GMTrace.o(1747380600832L, 13019);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    int i = 1;
    GMTrace.i(1747514818560L, 13020);
    w.i("MicroMsg.SayHiEditUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    for (;;)
    {
      try
      {
        if (this.htG != null)
        {
          this.htG.dismiss();
          this.htG = null;
        }
        switch (paramInt2)
        {
        default: 
          i = 0;
          if (i == 0) {
            break label185;
          }
          GMTrace.o(1747514818560L, 13020);
          return;
        }
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.SayHiEditUI", "exception in onSceneEnd : " + paramString.getMessage());
        GMTrace.o(1747514818560L, 13020);
        return;
      }
      Toast.makeText(this, R.l.dKQ, 0).show();
      continue;
      Toast.makeText(this, R.l.dKS, 0).show();
    }
    label185:
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      h.bm(this, getString(R.l.div));
      finish();
      GMTrace.o(1747514818560L, 13020);
      return;
    }
    if ((paramInt1 == 4) && (paramInt2 == -24) && (!t.nm(paramString)))
    {
      Toast.makeText(this, paramString, 1).show();
      GMTrace.o(1747514818560L, 13020);
      return;
    }
    if ((paramInt2 == -101) && (!t.nm(paramString)))
    {
      h.a(this, paramString, getString(R.l.cUG), getString(R.l.cTM), null);
      GMTrace.o(1747514818560L, 13020);
      return;
    }
    Toast.makeText(this, R.l.dKR, 0).show();
    GMTrace.o(1747514818560L, 13020);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1747112165376L, 13017);
    int i = R.i.cEU;
    GMTrace.o(1747112165376L, 13017);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1746977947648L, 13016);
    super.onCreate(paramBundle);
    at.wS().a(30, this);
    oM(R.l.dKP);
    MP();
    GMTrace.o(1746977947648L, 13016);
  }
  
  public void onDestroy()
  {
    GMTrace.i(1747246383104L, 13018);
    at.wS().b(30, this);
    super.onDestroy();
    GMTrace.o(1747246383104L, 13018);
  }
  
  private static final class a
    implements TextWatcher
  {
    private boolean wTL;
    
    public a()
    {
      GMTrace.i(20401228873728L, 152001);
      this.wTL = false;
      GMTrace.o(20401228873728L, 152001);
    }
    
    public final void afterTextChanged(Editable paramEditable)
    {
      GMTrace.i(20401631526912L, 152004);
      GMTrace.o(20401631526912L, 152004);
    }
    
    public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(20401363091456L, 152002);
      GMTrace.o(20401363091456L, 152002);
    }
    
    public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(20401497309184L, 152003);
      if (this.wTL)
      {
        GMTrace.o(20401497309184L, 152003);
        return;
      }
      this.wTL = true;
      d.nxJ.K(3, 2, 5);
      GMTrace.o(20401497309184L, 152003);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\contact\SayHiEditUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */