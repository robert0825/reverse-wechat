package com.tencent.mm.plugin.search.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.fts.d.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.fts.widget.FTSEditTextView;

public class FTSDetailUI
  extends FTSBaseUI
{
  private int lzX;
  private int lzo;
  private e oCM;
  
  public FTSDetailUI()
  {
    GMTrace.i(11877597839360L, 88495);
    GMTrace.o(11877597839360L, 88495);
  }
  
  protected final b a(c paramc)
  {
    GMTrace.i(11878134710272L, 88499);
    if (this.oCM == null) {
      this.oCM = new e(paramc, this.lzX, this.lzo);
    }
    paramc = this.oCM;
    GMTrace.o(11878134710272L, 88499);
    return paramc;
  }
  
  public final void b(com.tencent.mm.plugin.fts.d.a.a parama)
  {
    GMTrace.i(16481534345216L, 122797);
    GMTrace.o(16481534345216L, 122797);
  }
  
  protected final void bdL()
  {
    GMTrace.i(11877866274816L, 88497);
    this.lzX = getIntent().getIntExtra("detail_type", 0);
    this.lzo = getIntent().getIntExtra("Search_Scene", 0);
    GMTrace.o(11877866274816L, 88497);
  }
  
  public final String getHint()
  {
    GMTrace.i(16481668562944L, 122798);
    String str = com.tencent.mm.plugin.fts.d.e.oc(this.lzX);
    if (str == null)
    {
      str = getString(R.l.cUr);
      GMTrace.o(16481668562944L, 122798);
      return str;
    }
    GMTrace.o(16481668562944L, 122798);
    return str;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11878403145728L, 88501);
    int i = R.i.cxI;
    GMTrace.o(11878403145728L, 88501);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11877732057088L, 88496);
    super.onCreate(paramBundle);
    com.tencent.mm.plugin.search.a.c.bdC().aCB();
    paramBundle = getIntent().getStringExtra("detail_query");
    this.eQb = paramBundle;
    this.oCq.xdt.s(paramBundle, null);
    w.i("MicroMsg.FTS.FTSDetailUI", "onCreate query=%s, searchType=%d, kvScene=%d", new Object[] { this.eQb, Integer.valueOf(this.lzX), Integer.valueOf(this.lzo) });
    bdG();
    GMTrace.o(11877732057088L, 88496);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11878940016640L, 88505);
    this.oCM.finish();
    com.tencent.mm.plugin.search.a.c.bdC().aCy();
    super.onDestroy();
    GMTrace.o(11878940016640L, 88505);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\FTSDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */