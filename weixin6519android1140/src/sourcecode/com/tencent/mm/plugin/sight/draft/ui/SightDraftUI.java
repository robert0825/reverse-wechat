package com.tencent.mm.plugin.sight.draft.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.d;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.ui.MMActivity;
import java.util.LinkedList;

public class SightDraftUI
  extends MMActivity
{
  private int oUF;
  SightDraftContainerView oUG;
  private LinkedList<String> oUH;
  
  public SightDraftUI()
  {
    GMTrace.i(9366921019392L, 69789);
    this.oUF = 1;
    this.oUH = new LinkedList();
    GMTrace.o(9366921019392L, 69789);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9367055237120L, 69790);
    GMTrace.o(9367055237120L, 69790);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9367189454848L, 69791);
    super.onCreate(paramBundle);
    oM(R.l.edd);
    cN().cO().setBackgroundDrawable(getResources().getDrawable(R.e.black));
    this.oUG = new SightDraftContainerView(this);
    setContentView(this.oUG);
    this.oUG.bgW();
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9367726325760L, 69795);
        SightDraftUI.this.finish();
        GMTrace.o(9367726325760L, 69795);
        return false;
      }
    });
    paramBundle = this.oUG;
    a local2 = new a()
    {
      public final void bgT()
      {
        GMTrace.i(18475204476928L, 137651);
        SightDraftUI.this.a(SightDraftUI.a(SightDraftUI.this), SightDraftUI.this.getString(R.l.ecX), new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymous2MenuItem)
          {
            GMTrace.i(9360210132992L, 69739);
            SightDraftUI.b(SightDraftUI.this);
            GMTrace.o(9360210132992L, 69739);
            return true;
          }
        });
        GMTrace.o(18475204476928L, 137651);
      }
      
      public final void bgU()
      {
        GMTrace.i(18475338694656L, 137652);
        SightDraftUI.this.AZ(SightDraftUI.a(SightDraftUI.this));
        GMTrace.o(18475338694656L, 137652);
      }
    };
    paramBundle.oUy = local2;
    if (paramBundle.oUz != null) {
      paramBundle.oUz.oUh = local2;
    }
    GMTrace.o(9367189454848L, 69791);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sight\draft\ui\SightDraftUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */