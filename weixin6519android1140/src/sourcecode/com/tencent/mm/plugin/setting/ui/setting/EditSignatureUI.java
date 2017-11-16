package com.tencent.mm.plugin.setting.ui.setting;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.lg;
import com.tencent.mm.k.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.b;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bk;
import com.tencent.mm.y.q;

public class EditSignatureUI
  extends MMActivity
{
  private r hua;
  private boolean jNN;
  private com.tencent.mm.sdk.b.c jNR;
  private MMEditText oGA;
  private e.b oGB;
  final bk oGC;
  private TextView oGq;
  
  public EditSignatureUI()
  {
    GMTrace.i(4595749224448L, 34241);
    this.hua = null;
    this.oGC = bk.BE();
    this.jNN = false;
    this.jNR = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(4595749224448L, 34241);
  }
  
  protected final void MP()
  {
    GMTrace.i(4596286095360L, 34245);
    oM(R.l.eay);
    this.oGA = ((MMEditText)findViewById(R.h.content));
    this.oGq = ((TextView)findViewById(R.h.coE));
    at.AR();
    String str = bg.nl((String)com.tencent.mm.y.c.xh().get(12291, null));
    this.oGA.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, str, this.oGA.getTextSize()));
    this.oGA.setSelection(this.oGA.getText().length());
    this.oGq.setText(com.tencent.mm.ui.tools.h.aO(60, this.oGA.getEditableText().toString()));
    com.tencent.mm.ui.tools.a.c.d(this.oGA).eE(0, 60).a(null);
    this.oGA.addTextChangedListener(new a());
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4654402371584L, 34678);
        EditSignatureUI.this.aLo();
        EditSignatureUI.this.finish();
        GMTrace.o(4654402371584L, 34678);
        return true;
      }
    });
    a(0, getString(R.l.cUp), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4613465964544L, 34373);
        paramAnonymousMenuItem = EditSignatureUI.a(EditSignatureUI.this).getText().toString().trim();
        Object localObject = b.ud();
        if ((!bg.nm((String)localObject)) && (paramAnonymousMenuItem.matches(".*[" + (String)localObject + "].*")))
        {
          com.tencent.mm.ui.base.h.b(EditSignatureUI.this.vKB.vKW, EditSignatureUI.this.getString(R.l.dDl, new Object[] { localObject }), EditSignatureUI.this.getString(R.l.cUG), true);
          GMTrace.o(4613465964544L, 34373);
          return false;
        }
        localObject = EditSignatureUI.this;
        ActionBarActivity localActionBarActivity = EditSignatureUI.this.vKB.vKW;
        EditSignatureUI.this.getString(R.l.cUG);
        EditSignatureUI.a((EditSignatureUI)localObject, com.tencent.mm.ui.base.h.a(localActionBarActivity, EditSignatureUI.this.getString(R.l.diV), false, null));
        EditSignatureUI.a(EditSignatureUI.this, q.l(18, paramAnonymousMenuItem));
        EditSignatureUI.f(EditSignatureUI.this);
        EditSignatureUI.this.aLo();
        GMTrace.o(4613465964544L, 34373);
        return true;
      }
    }, p.b.vLG);
    lf(false);
    GMTrace.o(4596286095360L, 34245);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4595883442176L, 34242);
    int i = R.i.cux;
    GMTrace.o(4595883442176L, 34242);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4596017659904L, 34243);
    super.onCreate(paramBundle);
    a.vgX.b(this.jNR);
    MP();
    GMTrace.o(4596017659904L, 34243);
  }
  
  public void onDestroy()
  {
    GMTrace.i(4596151877632L, 34244);
    super.onDestroy();
    a.vgX.c(this.jNR);
    GMTrace.o(4596151877632L, 34244);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(4596420313088L, 34246);
    if (paramInt == 4) {
      finish();
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(4596420313088L, 34246);
    return bool;
  }
  
  private final class a
    implements TextWatcher
  {
    private int oGE;
    
    public a()
    {
      GMTrace.i(4615210795008L, 34386);
      this.oGE = 60;
      GMTrace.o(4615210795008L, 34386);
    }
    
    public final void afterTextChanged(Editable paramEditable)
    {
      GMTrace.i(4615613448192L, 34389);
      this.oGE = com.tencent.mm.ui.tools.h.aO(60, paramEditable.toString());
      if (this.oGE < 0) {
        this.oGE = 0;
      }
      if (EditSignatureUI.e(EditSignatureUI.this) != null) {
        EditSignatureUI.e(EditSignatureUI.this).setText(this.oGE);
      }
      GMTrace.o(4615613448192L, 34389);
    }
    
    public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(4615345012736L, 34387);
      GMTrace.o(4615345012736L, 34387);
    }
    
    public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(4615479230464L, 34388);
      EditSignatureUI.this.lf(true);
      GMTrace.o(4615479230464L, 34388);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\EditSignatureUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */